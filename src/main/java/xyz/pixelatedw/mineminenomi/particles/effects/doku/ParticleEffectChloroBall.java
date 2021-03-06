package xyz.pixelatedw.mineminenomi.particles.effects.doku;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import xyz.pixelatedw.mineminenomi.api.math.WyMathHelper;
import xyz.pixelatedw.mineminenomi.particles.CustomParticle;
import xyz.pixelatedw.mineminenomi.particles.effects.ParticleEffect;
import xyz.pixelatedw.mineminenomi.values.ModValuesParticles;

public class ParticleEffectChloroBall extends ParticleEffect
{

	@Override
	public void spawn(PlayerEntity player, double posX, double posY, double posZ)
	{	
		for (int i = 0; i < 256; i++)
		{
	        double motionX = WyMathHelper.randomWithRange(-7, 7) + WyMathHelper.randomDouble();
	        double motionY = WyMathHelper.randomWithRange(-7, 7) + WyMathHelper.randomDouble();
	        double motionZ = WyMathHelper.randomWithRange(-7, 7) + WyMathHelper.randomDouble();
	        
            double middlePoint = 0.05;
            middlePoint *= player.world.rand.nextFloat() * player.world.rand.nextFloat() + 2.2F;
	        
	        motionX *= middlePoint / 2;
	        motionY *= middlePoint / 2;
	        motionZ *= middlePoint / 2;
			
			CustomParticle cp = new CustomParticle(player.world, ModValuesParticles.PARTICLE_ICON_DOKU,
					posX, 
					posY + 1,
					posZ, 
					motionX,
					motionY,
					motionZ)
					.setParticleAge(1).setParticleScale(2F);
			Minecraft.getInstance().particles.addEffect(cp);
		}
	}
}
