
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.darkinfection.potion.VoidCureMobEffect;
import net.mcreator.darkinfection.potion.UltimateDarknessMobEffect;
import net.mcreator.darkinfection.potion.GivevoidcureMobEffect;
import net.mcreator.darkinfection.potion.DarknessMobEffect;
import net.mcreator.darkinfection.potion.DarkcoruptMobEffect;
import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, DarkInfectionMod.MODID);
	public static final RegistryObject<MobEffect> DARKNESS = REGISTRY.register("darkness", () -> new DarknessMobEffect());
	public static final RegistryObject<MobEffect> DARKCORUPT = REGISTRY.register("darkcorupt", () -> new DarkcoruptMobEffect());
	public static final RegistryObject<MobEffect> VOID_CURE = REGISTRY.register("void_cure", () -> new VoidCureMobEffect());
	public static final RegistryObject<MobEffect> GIVEVOIDCURE = REGISTRY.register("givevoidcure", () -> new GivevoidcureMobEffect());
	public static final RegistryObject<MobEffect> ULTIMATE_DARKNESS = REGISTRY.register("ultimate_darkness", () -> new UltimateDarknessMobEffect());
}
