
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thearieldimension.entity.SkybornGiantEntity;
import net.mcreator.thearieldimension.client.model.ModelSkybornGiant;

public class SkybornGiantRenderer extends MobRenderer<SkybornGiantEntity, ModelSkybornGiant<SkybornGiantEntity>> {
	public SkybornGiantRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkybornGiant(context.bakeLayer(ModelSkybornGiant.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkybornGiantEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/skyborn_giant.png");
	}
}
