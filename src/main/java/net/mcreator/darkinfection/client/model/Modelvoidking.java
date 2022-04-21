package net.mcreator.darkinfection.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelvoidking<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("dark_infection", "modelvoidking"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelvoidking(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.0F, -4.0F, 8.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -3.0F, -4.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(1.0F, -3.0F, -4.0F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(49, 5).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 40)
						.addBox(-2.0F, -2.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 41).addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F,
								1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -7.0F, -4.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(35, 6).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(36, 11).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -7.5F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r4 = Head.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(50, 12).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -5.25F, 0.0F, 0.0F, 0.0F, -0.3054F));
		PartDefinition cube_r5 = Head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(52, 16).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone = Body.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(52, 38).addBox(-1.0F, -4.0F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 38)
						.addBox(5.0F, -4.0F, 0.0F, 2.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 36)
						.addBox(-1.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 36)
						.addBox(6.0F, 3.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 34)
						.addBox(-1.0F, 5.0F, 0.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 42)
						.addBox(1.0F, 3.0F, 0.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 33).mirror()
						.addBox(2.0F, -3.0F, 0.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(-3.0F, 4.0F, -3.0F));
		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(42, 0).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.5F, -4.9F, 2.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -5.0F, 0.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -4.0F, 3.0F, -1.0472F, 0.0F, 0.0F));
		PartDefinition cube_r8 = bone.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(28, 0).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, 2.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition cube_r9 = bone.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(16, 33).addBox(-4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(10.6F, -5.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
		PartDefinition cube_r10 = bone.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 33).addBox(-4.0F, -1.0F, 1.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.7F, -4.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(40, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(32, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(1.9F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue,
			float alpha) {
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		RightArm.render(poseStack, buffer, packedLight, packedOverlay);
		LeftArm.render(poseStack, buffer, packedLight, packedOverlay);
		RightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
