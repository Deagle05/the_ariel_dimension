
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.thearieldimension.entity.CrystalBeingEntity;
import net.mcreator.thearieldimension.client.model.ModelCrystalBeing;

public class CrystalBeingRenderer extends MobRenderer<CrystalBeingEntity, ModelCrystalBeing<CrystalBeingEntity>> {
	public CrystalBeingRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrystalBeing(context.bakeLayer(ModelCrystalBeing.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<CrystalBeingEntity, ModelCrystalBeing<CrystalBeingEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("the_ariel_dimension:textures/entities/crystalbeingglow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(CrystalBeingEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/crystalbeing.png");
	}
}
