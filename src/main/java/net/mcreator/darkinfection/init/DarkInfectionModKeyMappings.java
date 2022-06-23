
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.darkinfection.network.SummonBoatsBoatGodMessage;
import net.mcreator.darkinfection.network.SilveryeetbindMessage;
import net.mcreator.darkinfection.network.FlightBoatGodMessage;
import net.mcreator.darkinfection.DarkInfectionMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DarkInfectionModKeyMappings {
	public static final KeyMapping FLIGHT_BOAT_GOD = new KeyMapping("key.dark_infection.flight_boat_god", GLFW.GLFW_KEY_K, "key.categories.movement");
	public static final KeyMapping SUMMON_BOATS_BOAT_GOD = new KeyMapping("key.dark_infection.summon_boats_boat_god", GLFW.GLFW_KEY_N,
			"key.categories.multiplayer");
	public static final KeyMapping SILVERYEETBIND = new KeyMapping("key.dark_infection.silveryeetbind", GLFW.GLFW_KEY_0, "key.categories.movement");
	private static long FLIGHT_BOAT_GOD_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(FLIGHT_BOAT_GOD);
		ClientRegistry.registerKeyBinding(SUMMON_BOATS_BOAT_GOD);
		ClientRegistry.registerKeyBinding(SILVERYEETBIND);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == FLIGHT_BOAT_GOD.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						FLIGHT_BOAT_GOD_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - FLIGHT_BOAT_GOD_LASTPRESS);
						DarkInfectionMod.PACKET_HANDLER.sendToServer(new FlightBoatGodMessage(1, dt));
						FlightBoatGodMessage.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
				if (event.getKey() == SUMMON_BOATS_BOAT_GOD.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DarkInfectionMod.PACKET_HANDLER.sendToServer(new SummonBoatsBoatGodMessage(0, 0));
						SummonBoatsBoatGodMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
				if (event.getKey() == SILVERYEETBIND.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DarkInfectionMod.PACKET_HANDLER.sendToServer(new SilveryeetbindMessage(0, 0));
						SilveryeetbindMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
