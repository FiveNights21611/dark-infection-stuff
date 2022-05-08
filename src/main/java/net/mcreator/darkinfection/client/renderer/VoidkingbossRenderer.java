
package net.mcreator.darkinfection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.darkinfection.entity.VoidkingbossEntity;

public class VoidkingbossRenderer extends HumanoidMobRenderer<VoidkingbossEntity, HumanoidModel<VoidkingbossEntity>> {
	public VoidkingbossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)),
				new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(VoidkingbossEntity entity) {
		return new ResourceLocation("dark_infection:textures/36453b20f2f76704eb7314afd1cc70b28a33a658.png");
	}
}
