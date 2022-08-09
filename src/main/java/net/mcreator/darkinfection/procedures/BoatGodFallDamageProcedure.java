package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BoatGodFallDamageProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player);
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getDisplayName().getString()).equals("BoatGod69") || (entity.getDisplayName().getString()).equals("Dev")) {
			if (DarkInfectionModVariables.WorldVariables.get(world).BoatGodFlyON == true) {
				entity.fallDistance = 0;
			}
		}
	}
}
