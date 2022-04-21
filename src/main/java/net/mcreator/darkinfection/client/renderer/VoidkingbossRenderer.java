package net.mcreator.darkinfection.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.darkinfection.entity.VoidkingbossEntity;
import net.mcreator.darkinfection.client.model.Modelvoidking;

public class VoidkingbossRenderer extends MobRenderer<VoidkingbossEntity, Modelvoidking<VoidkingbossEntity>> {
	public VoidkingbossRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelvoidking(context.bakeLayer(Modelvoidking.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(VoidkingbossEntity entity) {
		return new ResourceLocation("dark_infection:textures/voidking_armor.png");
	}
}
