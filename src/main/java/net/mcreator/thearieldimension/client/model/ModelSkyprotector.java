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
public class ModelSkyprotector<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("the_ariel_dimension", "model_skyprotector"), "main");
	public final ModelPart right_leg;
	public final ModelPart bone;
	public final ModelPart head;
	public final ModelPart right_arm;
	public final ModelPart right_arm2;
	public final ModelPart right_leg2;

	public ModelSkyprotector(ModelPart root) {
		this.right_leg = root.getChild("right_leg");
		this.bone = root.getChild("bone");
		this.head = root.getChild("head");
		this.right_arm = root.getChild("right_arm");
		this.right_arm2 = root.getChild("right_arm2");
		this.right_leg2 = root.getChild("right_leg2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(0, 104).addBox(0.0F, 0.0F, -8.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition bone = partdefinition
				.addOrReplaceChild(
						"bone", CubeListBuilder.create().texOffs(0, 40).addBox(-16.0F, -80.0F, -8.0F, 32.0F, 48.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-16.0F, -40.0F, 8.0F, 32.0F, 8.0F, 32.0F, new CubeDeformation(0.0F))
								.texOffs(132, 132).addBox(-6.0F, -112.0F, -6.0F, 12.0F, 32.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(98, 0).addBox(-13.0F, -60.0F, 40.0F, 26.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(96, 40).addBox(-8.0F, -11.0F, -17.0F, 16.0F, 16.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(80, 40).addBox(-8.0F, -11.0F, -19.0F, 16.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -14.0F, -3.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 9).addBox(-1.0F, -19.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -93.0F, 0.0F));
		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(80, 88).addBox(16.0F, -4.0F, -8.0F, 16.0F, 40.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -52.0F, 0.0F));
		PartDefinition right_arm2 = partdefinition.addOrReplaceChild("right_arm2", CubeListBuilder.create().texOffs(80, 88).addBox(-32.0F, -4.0F, -8.0F, 16.0F, 40.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -52.0F, 0.0F));
		PartDefinition right_leg2 = partdefinition.addOrReplaceChild("right_leg2", CubeListBuilder.create().texOffs(0, 104).addBox(-16.0F, 0.0F, -8.0F, 16.0F, 32.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_arm2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
