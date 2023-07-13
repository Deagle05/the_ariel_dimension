
package net.mcreator.thearieldimension.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thearieldimension.entity.NetherBeastEntity;
import net.mcreator.thearieldimension.client.model.ModelSkyprotector;

public class NetherBeastRenderer extends MobRenderer<NetherBeastEntity, ModelSkyprotector<NetherBeastEntity>> {
	public NetherBeastRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkyprotector(context.bakeLayer(ModelSkyprotector.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NetherBeastEntity entity) {
		return new ResourceLocation("the_ariel_dimension:textures/entities/netherbeast.png");
	}
}
