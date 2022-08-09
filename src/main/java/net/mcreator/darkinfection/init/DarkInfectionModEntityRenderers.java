
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.darkinfection.client.renderer.VoidkingbossRenderer;
import net.mcreator.darkinfection.client.renderer.DarkOrbRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DarkInfectionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DarkInfectionModEntities.VOIDKINGBOSS.get(), VoidkingbossRenderer::new);
		event.registerEntityRenderer(DarkInfectionModEntities.DARK_ORB.get(), DarkOrbRenderer::new);
	}
}
