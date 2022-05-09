
package net.mcreator.darkinfection.world.biome;

import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class DarkBiomeBiome {
	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(
			Climate.Parameter.span(-0.214285714286f, -0.185714285714f), Climate.Parameter.span(-1.014285714286f, -0.985714285714f),
			Climate.Parameter.span(0.495714285714f, 0.524285714286f), Climate.Parameter.span(0.785714285714f, 0.814285714286f),
			Climate.Parameter.point(0), Climate.Parameter.span(-0.491947690799f, -0.463376262227f), 0);
	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(0.41f, 0.61f), Climate.Parameter.span(0.7f, 0.9f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.577661976513f, -0.377661976513f), 0);

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
