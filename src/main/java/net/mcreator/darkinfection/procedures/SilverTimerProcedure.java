package net.mcreator.darkinfection.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.darkinfection.network.DarkInfectionModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SilverTimerProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent(
					(new java.text.DecimalFormat("##.##").format((entity.getCapability(DarkInfectionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new DarkInfectionModVariables.PlayerVariables())).Silver_Timer))),
					(true));
		if ((entity.getCapability(DarkInfectionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new DarkInfectionModVariables.PlayerVariables())).Silver_Timer > 0) {
			{
				double _setval = (entity.getCapability(DarkInfectionModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new DarkInfectionModVariables.PlayerVariables())).Silver_Timer - 1;
				entity.getCapability(DarkInfectionModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Silver_Timer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
