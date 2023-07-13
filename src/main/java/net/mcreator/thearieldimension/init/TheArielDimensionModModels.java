
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thearieldimension.client.model.Modelfirebullet;
import net.mcreator.thearieldimension.client.model.ModelTrollgiant;
import net.mcreator.thearieldimension.client.model.ModelSkyprotector;
import net.mcreator.thearieldimension.client.model.ModelSkybornOrb;
import net.mcreator.thearieldimension.client.model.ModelSkybornGiant;
import net.mcreator.thearieldimension.client.model.ModelSkyborn;
import net.mcreator.thearieldimension.client.model.ModelCrystalBeing;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TheArielDimensionModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelCrystalBeing.LAYER_LOCATION, ModelCrystalBeing::createBodyLayer);
		event.registerLayerDefinition(ModelSkybornOrb.LAYER_LOCATION, ModelSkybornOrb::createBodyLayer);
		event.registerLayerDefinition(ModelSkyborn.LAYER_LOCATION, ModelSkyborn::createBodyLayer);
		event.registerLayerDefinition(ModelSkybornGiant.LAYER_LOCATION, ModelSkybornGiant::createBodyLayer);
		event.registerLayerDefinition(ModelSkyprotector.LAYER_LOCATION, ModelSkyprotector::createBodyLayer);
		event.registerLayerDefinition(Modelfirebullet.LAYER_LOCATION, Modelfirebullet::createBodyLayer);
		event.registerLayerDefinition(ModelTrollgiant.LAYER_LOCATION, ModelTrollgiant::createBodyLayer);
	}
}
