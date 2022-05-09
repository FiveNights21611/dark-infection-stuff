
package net.mcreator.darkinfection.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class DarkBiomeBiome {

	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.485714285714f, 0.085714285714f),
			Climate.Parameter.span(-1.285714285714f, -0.714285714286f), Climate.Parameter.span(0.224285714286f, 0.795714285714f),
			Climate.Parameter.span(0.514285714286f, 1.085714285714f), Climate.Parameter.point(0),
			Climate.Parameter.span(-0.763376262227f, -0.191947690799f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-10066330).waterColor(-10066330).waterFogColor(-16777216)
				.skyColor(-10066330).foliageColorOverride(-10066330).grassColorOverride(-10066330).build();

		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();

		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);

		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();

		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.PLAINS).temperature(0.2f)
				.downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
		BiomeDictionary.addTypes(ResourceKey.create(Registry.BIOME_REGISTRY, BuiltinRegistries.BIOME.getKey(DarkInfectionModBiomes.DARK_BIOME.get())),
				BiomeDictionary.Type.FOREST, BiomeDictionary.Type.PLAINS);
	}

}
