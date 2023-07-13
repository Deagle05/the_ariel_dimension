package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.thearieldimension.entity.SkybornOrbEntity;
import net.mcreator.thearieldimension.client.model.ModelSkybornOrb;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SkybornOrbRenderer extends EntityRenderer<SkybornOrbEntity> {
	private static final ResourceLocation texture = new ResourceLocation("the_ariel_dimension:textures/entities/skybornorb.png");
	private final ModelSkybornOrb model;

	public SkybornOrbRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelSkybornOrb(context.bakeLayer(ModelSkybornOrb.LAYER_LOCATION));
	}

	@Override
	public void render(SkybornOrbEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(SkybornOrbEntity entity) {
		return texture;
	}
}
