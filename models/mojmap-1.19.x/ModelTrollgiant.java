// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTrollgiant<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "trollgiant"), "main");
	private final ModelPart spawner;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart body;
	private final ModelPart right_arm;
	private final ModelPart head;
	private final ModelPart right_arm2;

	public ModelTrollgiant(ModelPart root) {
		this.spawner = root.getChild("spawner");
		this.right_leg = root.getChild("right_leg");
		this.left_leg = root.getChild("left_leg");
		this.body = root.getChild("body");
		this.right_arm = root.getChild("right_arm");
		this.head = root.getChild("head");
		this.right_arm2 = root.getChild("right_arm2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition spawner = partdefinition.addOrReplaceChild("spawner", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create()
				.texOffs(0, 352).addBox(0.0F, 0.0F, -24.0F, 48.0F, 64.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -40.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(0, 352)
				.addBox(0.0F, 0.0F, -24.0F, 48.0F, 64.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-48.0F, -40.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 192)
						.addBox(-48.0F, -176.0F, -24.0F, 96.0F, 112.0F, 48.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-6.0F, -166.0F, 24.0F, 10.0F, 10.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(240, 192)
						.addBox(-6.0F, -206.0F, -14.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(240, 192).addBox(-6.0F, -206.0F, 6.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F))
						.texOffs(0, 52).addBox(-6.0F, -126.0F, 24.0F, 10.0F, 10.0F, 20.0F, new CubeDeformation(0.0F))
						.texOffs(0, 52).addBox(-6.0F, -106.0F, 24.0F, 10.0F, 10.0F, 20.0F, new CubeDeformation(0.0F))
						.texOffs(0, 52).addBox(-6.0F, -146.0F, 24.0F, 10.0F, 10.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create()
				.texOffs(288, 192).addBox(48.0F, -1.0F, -24.0F, 48.0F, 128.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -151.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-48.0F, -79.0F, -177.0F, 96.0F, 96.0F, 96.0F, new CubeDeformation(0.0F)).texOffs(240, 192)
				.addBox(-6.0F, -109.0F, -159.0F, 10.0F, 30.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(48.0F, -49.0F, -133.0F, 30.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 192)
				.addBox(14.0F, -32.0F, -185.0F, 16.0F, 32.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 192)
				.addBox(-30.0F, -32.0F, -185.0F, 16.0F, 32.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
				.addBox(-8.0F, -65.0F, -190.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-78.0F, -49.0F, -133.0F, 30.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -131.0F, 57.0F));

		PartDefinition troll_in_spawner = head.addOrReplaceChild("troll_in_spawner",
				CubeListBuilder.create().texOffs(505, 509)
						.addBox(-2.0F, -2.0F, -1.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(497, 509)
						.addBox(1.0F, -2.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(497, 509)
						.addBox(-3.0F, -2.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(498, 493)
						.addBox(-2.0F, 3.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(498, 493)
						.addBox(0.0F, 3.0F, -1.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(476, 506)
						.addBox(-2.0F, -5.0F, -2.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -57.0F, -181.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition right_arm2 = partdefinition.addOrReplaceChild("right_arm2", CubeListBuilder.create()
				.texOffs(288, 192).addBox(-96.0F, -1.0F, -24.0F, 48.0F, 128.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -151.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 512, 512);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		spawner.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		left_leg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		right_arm2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.right_arm2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}