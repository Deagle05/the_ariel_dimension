// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelTractor<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tractor"), "main");
	private final ModelPart blade;
	private final ModelPart body;

	public ModelTractor(ModelPart root) {
		this.blade = root.getChild("blade");
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition blade = partdefinition.addOrReplaceChild("blade",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, 0.0F, -3.0F, 12.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-6.0F, -4.0F, 1.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 19.0F, -24.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(20, 10)
						.addBox(6.0F, -9.0F, -24.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(-6.0F, -9.0F, -18.0F, 12.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-8.0F, -9.0F, -24.0F, 2.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-13.0F, -3.0F, -16.0F, 26.0F, 2.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(84, 84)
						.addBox(11.0F, -33.0F, -16.0F, 2.0F, 30.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(128, 96)
						.addBox(-11.0F, -13.0F, -16.0F, 22.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 84)
						.addBox(-13.0F, -33.0F, -16.0F, 2.0F, 30.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -35.0F, -16.0F, 26.0F, 2.0F, 40.0F, new CubeDeformation(0.0F)).texOffs(92, 0)
						.addBox(-11.0F, -33.0F, -15.0F, 22.0F, 20.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(128, 83)
						.addBox(-11.0F, -10.0F, -4.0F, 22.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(44, 84)
						.addBox(-8.0F, -19.0F, 6.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(132, 51)
						.addBox(-11.0F, -33.0F, 22.0F, 22.0F, 30.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(123, 109)
						.addBox(13.0F, -6.0F, -19.0F, 4.0F, 6.0F, 45.0F, new CubeDeformation(0.0F)).texOffs(123, 109)
						.addBox(-17.0F, -6.0F, -19.0F, 4.0F, 6.0F, 45.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		blade.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.blade.xRot = ageInTicks;
	}
}