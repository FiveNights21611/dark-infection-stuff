
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.darkinfection.DarkInfectionMod;

public class DarkInfectionModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, DarkInfectionMod.MODID);
	public static final RegistryObject<Potion> VOIDCUREPOTION = REGISTRY.register("voidcurepotion",
			() -> new Potion(new MobEffectInstance(DarkInfectionModMobEffects.GIVEVOIDCURE.get(), 10, 0, false, true)));
	public static final RegistryObject<Potion> POTION_OF_ULTIMATE_DARKNESS = REGISTRY.register("potion_of_ultimate_darkness",
			() -> new Potion(new MobEffectInstance(DarkInfectionModMobEffects.ULTIMATE_DARKNESS.get(), 3600, 0, false, true)));
}
