
package net.mcreator.darkinfection.world.biome;

import net.minecraftforge.common.BiomeDictionary;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceKey;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.darkinfection.init.DarkInfectionModBiomes;

public class DarkBiomeBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.914285714286f, 0.514285714286f),
			Climate.Parameter.span(-1.714285714286f, -0.285714285714f), Climate.Parameter.span(-0.204285714286f, 1.224285714286f),
			Climate.Parameter.span(0.085714285714f, 1.514285714286f), Climate.Parameter.point(0),
			Climate.Parameter.span(-1.191947690799f, 0.236623737773f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-16777216).waterColor(-13487566).waterFogColor(-16053493)
				.skyColor(-16777216).foliageColorOverride(-8684677).grassColorOverride(-11447983).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.FOREST).temperature(0.2f)
				.downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(DarkInfectionModBiomes.DARK_BIOME.get())),
				BiomeDictionary.Type.COLD, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.VOID, BiomeDictionary.Type.RARE);
	}
}
