
package net.mcreator.darkinfection.world.biome;

import net.minecraftforge.common.BiomeManager;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class DarkBiomeBiome {

	public static final Climate.ParameterPoint PARAMETER_POINT = new Climate.ParameterPoint(
			Climate.Parameter.span(-0.271428571429f, -0.128571428571f), Climate.Parameter.span(-1.071428571429f, -0.928571428571f),
			Climate.Parameter.span(0.438571428571f, 0.581428571429f), Climate.Parameter.span(0.728571428571f, 0.871428571429f),
			Climate.Parameter.point(0), Climate.Parameter.span(-0.549090547942f, -0.406233405084f), 0);

	public static final Climate.ParameterPoint PARAMETER_POINT_UNDERGROUND = new Climate.ParameterPoint(Climate.Parameter.span(-1, 1),
			Climate.Parameter.span(-1, 1), Climate.Parameter.span(0.01f, 1.01f), Climate.Parameter.span(0.3f, 1.3f),
			Climate.Parameter.span(0.2f, 0.9f), Climate.Parameter.span(-0.977661976513f, 0.022338023487f), 0);

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
