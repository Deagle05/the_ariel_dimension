
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thearieldimension.entity.TractorEntity;
import net.mcreator.thearieldimension.client.model.ModelTractor;

public class TractorRenderer extends MobRenderer<TractorEntity, ModelTractor<TractorEntity>> {
	public TractorRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTractor(context.bakeLayer(ModelTractor.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(TractorEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/tractor.png");
	}
}
