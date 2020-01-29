package xyz.pixelatedw.mineminenomi.api.abilities;

import java.io.Serializable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import xyz.pixelatedw.mineminenomi.api.data.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.api.data.ability.AbilityDataCapability.Category;
import xyz.pixelatedw.mineminenomi.api.data.ability.IAbilityData;
import xyz.pixelatedw.mineminenomi.init.ModNetwork;
import xyz.pixelatedw.mineminenomi.packets.server.SUpdateHotbarStatePacket;

public class ContinuousAbility extends Ability
{
	private int threshold = 0;
	protected int continueTime = 0;
	
	// Setting the defaults so that no crash occurs and so they will be null safe.
	protected IOnStartContinuity onStartContinuityEvent = (player) -> { return true; };
	protected IOnEndContinuity onEndContinuityEvent = (player) -> { return true; };
	protected IDuringContinuity duringContinuity = (player, passiveTime) -> {};
	
	public ContinuousAbility(String name, Category category)
	{
		super(name, category);
	}

	
	/*
	 *  Event Starters
	 */
	@Override
	public void use(PlayerEntity player)
	{
		if(player.world.isRemote)
			return;	
				
		if(!this.isContinuous())
		{
			if(this.onStartContinuityEvent.onStartContinuity(player))
			{
				this.startContinuity();
				IAbilityData props = AbilityDataCapability.get(player);
				ModNetwork.sendTo(new SUpdateHotbarStatePacket(props, props.getAbilityPosition(this)), (ServerPlayerEntity)player);
			}
		}
		else
		{
			if(this.onEndContinuityEvent.onEndContinuity(player))
			{
				this.continueTime = 0;
				this.startCooldown();
				IAbilityData props = AbilityDataCapability.get(player);
				ModNetwork.sendTo(new SUpdateHotbarStatePacket(props, props.getAbilityPosition(this)), (ServerPlayerEntity)player);				
			}
		}
	}
	
	
	
	/*
	 * 	Setters/Getters
	 */	
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}
	
	public void startContinuity()
	{
		this.setState(State.CONTINUOUS);
	}

	
	
	/*
	 * 	Methods
	 */
	public void tick(PlayerEntity player)
	{
		if(player.world.isRemote)
			return;

		if(this.isContinuous())
		{
			this.continueTime++;		
			
			this.duringContinuity.duringContinuity(player, this.continueTime);
			
			if(this.threshold > 0 && this.continueTime >= this.threshold)
			{
				this.continueTime = 0;
				this.startCooldown();
				this.onEndContinuityEvent.onEndContinuity(player);
				IAbilityData props = AbilityDataCapability.get(player);
				ModNetwork.sendTo(new SUpdateHotbarStatePacket(props, props.getAbilityPosition(this)), (ServerPlayerEntity)player);
			}
		}
	}
	
	
	/*
	 *	Interfaces
	 */
	public interface IDuringContinuity extends Serializable
	{
		void duringContinuity(PlayerEntity player, int passiveTime);
	}
	
	public interface IOnStartContinuity extends Serializable
	{
		boolean onStartContinuity(PlayerEntity player);
	}
	
	public interface IOnEndContinuity extends Serializable
	{
		boolean onEndContinuity(PlayerEntity player);
	}
}
