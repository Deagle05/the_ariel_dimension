
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.thearieldimension.entity.SkyGuardEntity;

public class SkyGuardRenderer extends HumanoidMobRenderer<SkyGuardEntity, HumanoidModel<SkyGuardEntity>> {
	public SkyGuardRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new EyesLayer<SkyGuardEntity, HumanoidModel<SkyGuardEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("the_ariel_dimension:textures/entities/sky_guard_glow_new.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SkyGuardEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/sky_guard_base_new.png");
	}
}
