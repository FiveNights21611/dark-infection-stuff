
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DarkInfectionModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> DOINFECTIONSPREAD = GameRules.register("doInfectionSpread", GameRules.Category.UPDATES,
			GameRules.BooleanValue.create(true));
}
