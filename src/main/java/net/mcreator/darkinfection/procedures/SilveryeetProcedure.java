package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SilveryeetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getDisplayName().getString()).equals("Dev") || (entity.getDisplayName().getString()).equals("51LV3R_WR47H"))
				&& (entity.getCapability(DarkInfectionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DarkInfectionModVariables.PlayerVariables())).Silver_Timer == 0) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 2.5, (entity.getDeltaMovement().z())));
			{
				double _setval = 120;
				entity.getCapability(DarkInfectionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Silver_Timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
