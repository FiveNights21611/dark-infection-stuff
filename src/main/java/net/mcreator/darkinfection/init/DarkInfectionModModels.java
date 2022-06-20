
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.darkinfection.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.darkinfection.client.model.Modelvoidking_armor;
import net.mcreator.darkinfection.client.model.Modelvoidking;
import net.mcreator.darkinfection.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DarkInfectionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelvoidking.LAYER_LOCATION, Modelvoidking::createBodyLayer);
		event.registerLayerDefinition(Modelvoidking_armor.LAYER_LOCATION, Modelvoidking_armor::createBodyLayer);
	}
}
