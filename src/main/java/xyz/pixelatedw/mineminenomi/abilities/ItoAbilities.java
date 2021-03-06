package xyz.pixelatedw.mineminenomi.abilities;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import xyz.pixelatedw.mineminenomi.ID;
import xyz.pixelatedw.mineminenomi.api.WyHelper;
import xyz.pixelatedw.mineminenomi.api.WyHelper.Direction;
import xyz.pixelatedw.mineminenomi.api.abilities.Ability;
import xyz.pixelatedw.mineminenomi.entities.abilityprojectiles.ItoProjectiles;
import xyz.pixelatedw.mineminenomi.entities.mobs.misc.EntityBlackKnight;
import xyz.pixelatedw.mineminenomi.helpers.DevilFruitsHelper;
import xyz.pixelatedw.mineminenomi.init.ModAttributes;
import xyz.pixelatedw.mineminenomi.init.ModBlocks;
import xyz.pixelatedw.mineminenomi.init.ModNetwork;
import xyz.pixelatedw.mineminenomi.packets.server.SParticlesPacket;
import xyz.pixelatedw.mineminenomi.values.ModValues;

public class ItoAbilities 
{
	
	static
	{
		ModValues.abilityWebAppExtraParams.put("parasite", new String[] {"desc", "The user binds the opponent with a string that renders them immobile."});
		ModValues.abilityWebAppExtraParams.put("soranomichi", new String[] {"desc", "The user creates strings under their feet to launch themselves into the air."});
		ModValues.abilityWebAppExtraParams.put("overheat", new String[] {"desc", "The user shoots a rope made of heated strings at the opponent, exploding upon impact."});
		ModValues.abilityWebAppExtraParams.put("tamaito", new String[] {"desc", "The user shoots a small bundle of strings, acting like a bullet."});
		ModValues.abilityWebAppExtraParams.put("kumonosugaki", new String[] {"desc", "Creates a huge web that protects the user from any attack."});
		ModValues.abilityWebAppExtraParams.put("torikago", new String[] {"desc", "Creates an indestructible dome made of strings, that damage anyone who toches then"});
	}
	
	public static Ability[] abilitiesArray = new Ability[] {new Parasite(), new SoraNoMichi(), new Overheat(), new Tamaito(), new KumoNoSugaki(), new Torikago(), new BlackKnight()};	
	
	public static class BlackKnight extends Ability
	{
		private EntityBlackKnight blackKnight;

		public BlackKnight()
		{
			super(ModAttributes.BLACK_KNIGHT);
		}

		@Override
		public void passive(PlayerEntity player)
		{			
			if(this.passiveActive && player.isSneaking() && this.blackKnight != null)
			{
				this.blackKnight.isAggressive = !this.blackKnight.isAggressive;
				WyHelper.sendMsgToPlayer(player, "Your Black Knight is now " + (this.blackKnight.isAggressive ? "aggressive" : "defensive"));
			}
			else
				super.passive(player);
		}
		
		@Override
		public void startPassive(PlayerEntity player)
		{
			this.blackKnight = new EntityBlackKnight(player.world);
			this.blackKnight.setOwner(player);
			this.blackKnight.setPositionAndRotation(player.posX, player.posY, player.posZ, 180, 0);
			//this.blackKnight.data.putString("TextureName", "test");
			player.world.addEntity(this.blackKnight);
		}

		@Override
		public void endPassive(PlayerEntity player)
		{
			if (!WyHelper.getEntitiesNear(player, 20, EntityBlackKnight.class).isEmpty())
				WyHelper.getEntitiesNear(player, 20, EntityBlackKnight.class).forEach(x -> x.remove());

			this.startCooldown();
			this.startExtUpdate(player);
		}

	}
	
	public static class Torikago extends Ability
	{
		private List<int[]> blockList = new ArrayList<int[]>();
		
		public Torikago() 
		{
			super(ModAttributes.TORIKAGO); 
		}
		
		@Override
		public void passive(PlayerEntity player)
		{
			if(!this.isOnCooldown)
			{
				if(this.blockList.isEmpty())
				{
					this.blockList.addAll(WyHelper.createEmptySphere(player.world, (int)player.posX, (int)player.posY, (int)player.posZ, 20, ModBlocks.stringWall, "air", "foliage", "liquids", "nogrief"));
					player.world.setBlockState(new BlockPos(player.posX, player.posY, player.posZ), ModBlocks.stringMid.getDefaultState());
					this.blockList.add(new int[] {MathHelper.floor(player.posX), MathHelper.floor(player.posY), MathHelper.floor(player.posZ)});
				}
				
				super.passive(player);
			}
		}
		
		@Override
		public void endPassive(PlayerEntity player) 
		{
			for(int[] blockPos : this.blockList)
			{
				if(player.world.getBlockState(new BlockPos(blockPos[0], blockPos[1], blockPos[2])).getBlock() == ModBlocks.stringWall || player.world.getBlockState(new BlockPos(blockPos[0], blockPos[1], blockPos[2])).getBlock() == ModBlocks.stringMid)
					player.world.setBlockState(new BlockPos(blockPos[0], blockPos[1], blockPos[2]), Blocks.AIR.getDefaultState());
			}
            this.blockList = new ArrayList<int[]>();
            this.startCooldown();
            this.startExtUpdate(player);
		}
	}
	
	public static class KumoNoSugaki extends Ability
	{
		public KumoNoSugaki() 
		{
			super(ModAttributes.KUMO_NO_SUGAKI); 
		}
		
		@Override
		public void duringPassive(PlayerEntity player, int passiveTimer)
		{		
			ModNetwork.sendToAllAround(new SParticlesPacket(ID.PARTICLEFX_KUMONOSUGAKI, player), player);
			
			if(passiveTimer >= 300)
			{
				this.setPassiveActive(false);
				this.startCooldown();
				this.startExtUpdate(player);
				super.endPassive(player);
			}
		}
		
		@Override
		public void endPassive(PlayerEntity player) 
		{
			this.startCooldown();
			this.startExtUpdate(player);
		}
	}
	
	public static class Tamaito extends Ability
	{
		public Tamaito() 
		{
			super(ModAttributes.TAMAITO); 
		}
		
		@Override
		public void use(PlayerEntity player)
		{
			this.projectile = new ItoProjectiles.Tamaito(player.world, player, attr);
			super.use(player);
		}
	}
	
	public static class Overheat extends Ability
	{
		public Overheat() 
		{
			super(ModAttributes.OVERHEAT); 
		}
		
		@Override
		public void use(PlayerEntity player)
		{
			this.projectile = new ItoProjectiles.Overheat(player.world, player, attr);
			super.use(player);
		}
	}
	
	public static class SoraNoMichi extends Ability
	{
		private boolean used = false;

		public SoraNoMichi() 
		{
			super(ModAttributes.SORA_NO_MICHI); 
		}
		
		@Override
		public void use(PlayerEntity player)
		{
			if(!this.isOnCooldown)
			{
				Direction dir = WyHelper.get8Directions(player);
				
				double mX = 0;
				double mY = 0;
				double mZ = 0;
				
				if(player.onGround)
					mY += 1.8;
				else
					mY += 1.96;

				if(dir == WyHelper.Direction.NORTH) mZ -= 1;
				if(dir == WyHelper.Direction.NORTH_WEST) {mZ -= 1; mX -= 1;}
				if(dir == WyHelper.Direction.SOUTH) mZ += 1;
				if(dir == WyHelper.Direction.NORTH_EAST) {mZ -= 1; mX += 1;}
				if(dir == WyHelper.Direction.WEST) mX -= 1;
				if(dir == WyHelper.Direction.SOUTH_WEST) {mZ += 1; mX -= 1;}
				if(dir == WyHelper.Direction.EAST) mX += 1;
				if(dir == WyHelper.Direction.SOUTH_EAST) {mZ += 1; mX += 1;}
				
				DevilFruitsHelper.changeMotion("=", mX, mY, mZ, player);
				this.used = true;
				
				super.use(player);
			}
		}
		
		@Override
		public void tick(PlayerEntity player)
		{
			if(!player.world.isRemote && this.used)
			{
				player.fallDistance = 0;
				
				if(player.world.getBlockState(player.getPosition().down()).isSolid())
					this.used = false;
			}
		}
	}
	
	public static class Parasite extends Ability
	{
		public Parasite() 
		{
			super(ModAttributes.PARASITE); 
		}
		
		@Override
		public void use(PlayerEntity player)
		{
			if(!isOnCooldown)
			{			
				for(LivingEntity entity : WyHelper.getEntitiesNear(player, 20))
				{
					entity.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 200, 10));
					entity.addPotionEffect(new EffectInstance(Effects.NAUSEA, 200, 10));
					
					entity.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 200, 10));
					entity.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 200, 10));
				}
					
				super.use(player);
			}
		}
	}

}
