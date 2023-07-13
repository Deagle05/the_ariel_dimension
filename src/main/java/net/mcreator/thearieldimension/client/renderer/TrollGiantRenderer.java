
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thearieldimension.entity.TrollGiantEntity;
import net.mcreator.thearieldimension.client.model.ModelTrollgiant;

public class TrollGiantRenderer extends MobRenderer<TrollGiantEntity, ModelTrollgiant<TrollGiantEntity>> {
	public TrollGiantRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTrollgiant(context.bakeLayer(ModelTrollgiant.LAYER_LOCATION)), 7.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TrollGiantEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/trollgiant.png");
	}
}
