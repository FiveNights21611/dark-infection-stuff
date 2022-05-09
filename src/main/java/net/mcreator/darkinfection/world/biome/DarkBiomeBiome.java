
package net.mcreator.darkinfection.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class DarkBiomeBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(Climate.Parameter.span(-0.914285714286f, 0.514285714286f),
			Climate.Parameter.span(-1.714285714286f, -0.285714285714f), Climate.Parameter.span(-0.204285714286f, 1.224285714286f),
			Climate.Parameter.span(0.085714285714f, 1.514285714286f), Climate.Parameter.point(0),
			Climate.Parameter.span(-1.191947690799f, 0.236623737773f), 0);
	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(-4.49f, 5.51f), Climate.Parameter.span(-4.2f, 5.8f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-5.477661976513f, 4.522338023487f), 0);

	public static Biome createBiome() {
		BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder().fogColor(-13882324).waterColor(-13487566).waterFogColor(-16053493)
				.skyColor(-13882324).foliageColorOverride(-8684677).grassColorOverride(-11447983).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder();
		BiomeDefaultFeatures.addDefaultCarversAndLakes(biomeGenerationSettings);
		BiomeDefaultFeatures.addDefaultOres(biomeGenerationSettings);
		BiomeDefaultFeatures.addSurfaceFreezing(biomeGenerationSettings);
		MobSpawnSettings.Builder mobSpawnInfo = new MobSpawnSettings.Builder();
		return new Biome.BiomeBuilder().precipitation(Biome.Precipitation.NONE).biomeCategory(Biome.BiomeCategory.FOREST).temperature(0.2f)
				.downfall(0f).specialEffects(effects).mobSpawnSettings(mobSpawnInfo.build()).generationSettings(biomeGenerationSettings.build())
				.build();
	}

	public static void init() {
	}
}
