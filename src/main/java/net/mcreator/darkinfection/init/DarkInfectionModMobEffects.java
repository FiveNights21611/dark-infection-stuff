
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.darkinfection.potion.UltimateDarknessMobEffect;
import net.mcreator.darkinfection.potion.DarknessMobEffect;
import net.mcreator.darkinfection.potion.DarkcoruptMobEffect;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect DARKNESS = register(new DarknessMobEffect());
	public static final MobEffect DARKCORUPT = register(new DarkcoruptMobEffect());
	public static final MobEffect ULTIMATE_DARKNESS = register(new UltimateDarknessMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
