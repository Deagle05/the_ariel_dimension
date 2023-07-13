
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thearieldimension.entity.SkybornEntity;
import net.mcreator.thearieldimension.client.model.ModelSkyborn;

public class SkybornRenderer extends MobRenderer<SkybornEntity, ModelSkyborn<SkybornEntity>> {
	public SkybornRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkyborn(context.bakeLayer(ModelSkyborn.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkybornEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/skyborn.png");
	}
}
