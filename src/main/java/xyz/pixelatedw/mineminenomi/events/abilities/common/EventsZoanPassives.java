package xyz.pixelatedw.mineminenomi.events.abilities.common;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import xyz.pixelatedw.mineminenomi.Env;
import xyz.pixelatedw.mineminenomi.data.entity.devilfruit.DevilFruitCapability;
import xyz.pixelatedw.mineminenomi.data.entity.devilfruit.IDevilFruit;
import xyz.pixelatedw.mineminenomi.entities.zoan.ZoanInfoMoguMole;

@Mod.EventBusSubscriber(modid = Env.PROJECT_ID)
public class EventsZoanPassives
{
	@SubscribeEvent
	public static void onEntityAttack(LivingHurtEvent event)
	{
		if (event.getSource().getTrueSource() instanceof PlayerEntity)
		{
			PlayerEntity attacker = (PlayerEntity) event.getSource().getTrueSource();
			IDevilFruit props = DevilFruitCapability.get(attacker);
			LivingEntity attacked = event.getEntityLiving();

			if(props.getDevilFruit().equalsIgnoreCase("mogumogu") && props.getZoanPoint().equalsIgnoreCase(ZoanInfoMoguMole.FORM))
				event.setAmount(3);
		}
	}
	
	@SubscribeEvent
	public static void onEntityUpdate(LivingUpdateEvent event)
	{
		if (event.getEntityLiving() instanceof PlayerEntity)
		{
			PlayerEntity player = (PlayerEntity) event.getEntityLiving();
			IDevilFruit props = DevilFruitCapability.get(player);
			ItemStack heldItem = player.getHeldItemMainhand();
			
			if(props.getDevilFruit().equalsIgnoreCase("mogumogu") && props.getZoanPoint().equalsIgnoreCase(ZoanInfoMoguMole.FORM))
			{

			}
		}
	}
}
