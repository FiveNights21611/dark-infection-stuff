
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModPotions {
	private static final List<Potion> REGISTRY = new ArrayList<>();
	public static final Potion VOIDCUREPOTION = register(
			new Potion(new MobEffectInstance(DarkInfectionModMobEffects.GIVEVOIDCURE, 10, 0, false, true)).setRegistryName("voidcurepotion"));
	public static final Potion POTION_OF_ULTIMATE_DARKNESS = register(
			new Potion(new MobEffectInstance(DarkInfectionModMobEffects.ULTIMATE_DARKNESS, 3600, 0, false, true))
					.setRegistryName("potion_of_ultimate_darkness"));

	private static Potion register(Potion potion) {
		REGISTRY.add(potion);
		return potion;
	}

	@SubscribeEvent
	public static void registerPotions(RegistryEvent.Register<Potion> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Potion[0]));
	}
}
