package xyz.pixelatedw.mineminenomi.abilities;

import java.io.Serializable;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.api.data.ability.AbilityDataCapability;
import xyz.pixelatedw.mineminenomi.init.ModNetwork;
import xyz.pixelatedw.mineminenomi.packets.server.SUpdateHotbarStatePacket;

public class ChargeableAbility extends Ability
{
	private int chargeTime;
	private int maxChargeTime;
	
	// Setting the defaults so that no crash occurs and so they will be null safe.
	protected IOnStartCharging onStartChargingEvent = (player) -> {};
	protected IOnEndCharging onEndChargingEvent = (player) -> {};
	protected IDuringCharging duringChargingEvent = (player, chargeTime) -> {};

	public ChargeableAbility(String name, Category category)
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
		
		if(!this.isOnStandby())
			return;			
		
		this.onStartChargingEvent.onStartCharging(player);

		this.startCharging();
		ModNetwork.sendTo(new SUpdateHotbarStatePacket(AbilityDataCapability.get(player)), (ServerPlayerEntity)player);
	}
	
	/*
	 *  Setters / Getters
	 */
	
	public void setMaxChargeTime(int time)
	{
		this.maxChargeTime = time * 20;
		this.chargeTime = this.maxChargeTime;
	}

	
	
	/*
	 *  Methods
	 */

	public void charging(PlayerEntity player)
	{
		if(player.world.isRemote)
			return;
		
		if(this.isCharging() && this.chargeTime > 0)
		{
			this.chargeTime--;
			
			this.duringChargingEvent.duringCharging(player, this.chargeTime);
		}
		else if(this.isCharging() && this.chargeTime <= 0)
		{
			this.chargeTime = this.maxChargeTime;				
			this.startCooldown();
			this.onEndChargingEvent.onEndCharging(player);
			ModNetwork.sendTo(new SUpdateHotbarStatePacket(AbilityDataCapability.get(player)), (ServerPlayerEntity)player);
		}
	}
	
	
	/*
	 *	Interfaces
	 */
	public interface IDuringCharging extends Serializable
	{
		void duringCharging(PlayerEntity player, int chargeTime);
	}
	
	public interface IOnStartCharging extends Serializable
	{
		void onStartCharging(PlayerEntity player);
	}
	
	public interface IOnEndCharging extends Serializable
	{
		void onEndCharging(PlayerEntity player);
	}
}