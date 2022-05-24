
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.darkinfection.world.features.ores.VoidStoneRedstoneOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneLapisOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneIronOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneGoldOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneEmeraldOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneDiamondOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneCopperOreFeature;
import net.mcreator.darkinfection.world.features.ores.VoidStoneCoalOreFeature;
import net.mcreator.darkinfection.world.features.VoidtempleFeature;
import net.mcreator.darkinfection.DarkInfectionMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class DarkInfectionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DarkInfectionMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> VOIDTEMPLE = register("voidtemple", VoidtempleFeature::feature, new FeatureRegistration(
			GenerationStep.Decoration.SURFACE_STRUCTURES, VoidtempleFeature.GENERATE_BIOMES, VoidtempleFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_COAL_ORE = register("void_stone_coal_ore", VoidStoneCoalOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneCoalOreFeature.GENERATE_BIOMES,
					VoidStoneCoalOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_IRON_ORE = register("void_stone_iron_ore", VoidStoneIronOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneIronOreFeature.GENERATE_BIOMES,
					VoidStoneIronOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_REDSTONE_ORE = register("void_stone_redstone_ore", VoidStoneRedstoneOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneRedstoneOreFeature.GENERATE_BIOMES,
					VoidStoneRedstoneOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_LAPIS_ORE = register("void_stone_lapis_ore", VoidStoneLapisOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneLapisOreFeature.GENERATE_BIOMES,
					VoidStoneLapisOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_EMERALD_ORE = register("void_stone_emerald_ore", VoidStoneEmeraldOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneEmeraldOreFeature.GENERATE_BIOMES,
					VoidStoneEmeraldOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_DIAMOND_ORE = register("void_stone_diamond_ore", VoidStoneDiamondOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneDiamondOreFeature.GENERATE_BIOMES,
					VoidStoneDiamondOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_COPPER_ORE = register("void_stone_copper_ore", VoidStoneCopperOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneCopperOreFeature.GENERATE_BIOMES,
					VoidStoneCopperOreFeature::placedFeature));
	public static final RegistryObject<Feature<?>> VOID_STONE_GOLD_ORE = register("void_stone_gold_ore", VoidStoneGoldOreFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, VoidStoneGoldOreFeature.GENERATE_BIOMES,
					VoidStoneGoldOreFeature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
