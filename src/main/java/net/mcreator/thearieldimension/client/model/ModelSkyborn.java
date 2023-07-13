package net.mcreator.thearieldimension.client.model;

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

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSkyborn<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("the_ariel_dimension", "model_skyborn"), "main");
	public final ModelPart right_leg;
	public final ModelPart right_leg2;
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart wings;
	public final ModelPart r2_arm;
	public final ModelPart r1_arm;
	public final ModelPart l1_arm;
	public final ModelPart l1_arm2;

	public ModelSkyborn(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.right_leg2 = root.getChild("right_leg2");
		this.bone = root.getChild("bone");
		this.head = root.getChild("head");
		this.wings = root.getChild("wings");
		this.r2_arm = root.getChild("r2_arm");
		this.r1_arm = root.getChild("r1_arm");
		this.l1_arm = root.getChild("l1_arm");
		this.l1_arm2 = root.getChild("l1_arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(24, 26).addBox(0.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition right_leg2 = partdefinition.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(24, 26).addBox(-4.0F, 0.0F, -2.0F, 4.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, 0.0F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 16).addBox(-4.0F, -30.0F, -2.0F, 8.0F, 15.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 5)
				.addBox(4.0F, -30.0F, -2.0F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 5).addBox(-13.0F, -30.0F, -2.0F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition wings = partdefinition.addOrReplaceChild("wings",
				CubeListBuilder.create().texOffs(24, 16).addBox(1.0F, -30.0F, 2.0F, 12.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 45).addBox(1.0F, -30.0F, 2.0F, 12.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 53)
						.addBox(-13.0F, -30.0F, 2.0F, 12.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 45).addBox(-13.0F, -30.0F, 2.0F, 12.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition r2_arm = partdefinition.addOrReplaceChild("r2_arm", CubeListBuilder.create().texOffs(0, 35).addBox(9.0F, -1.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition r1_arm = partdefinition.addOrReplaceChild("r1_arm", CubeListBuilder.create().texOffs(0, 35).addBox(4.0F, -1.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition l1_arm = partdefinition.addOrReplaceChild("l1_arm", CubeListBuilder.create().texOffs(0, 35).addBox(-8.0F, -1.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));
		PartDefinition l1_arm2 = partdefinition.addOrReplaceChild("l1_arm2", CubeListBuilder.create().texOffs(0, 35).addBox(-8.0F, -1.0F, -2.0F, 4.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -4.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r2_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		r1_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l1_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		l1_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.l1_arm2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.r2_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.l1_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.r1_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}
