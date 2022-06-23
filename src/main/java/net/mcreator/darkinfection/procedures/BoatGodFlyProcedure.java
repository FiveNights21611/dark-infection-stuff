package net.mcreator.darkinfection.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;

public class BoatGodFlyProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("BoatGod69") && DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON == false) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (false);
				_player.onUpdateAbilities();
			}
		} else if ((entity.getDisplayName().getString()).equals("BoatGod69")
				&& DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON == true) {
			if (entity instanceof Player _player) {
				_player.getAbilities().mayfly = (false);
				_player.onUpdateAbilities();
			}
		}
	}
}
