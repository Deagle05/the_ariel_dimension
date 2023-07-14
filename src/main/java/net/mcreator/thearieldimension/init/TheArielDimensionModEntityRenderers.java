
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thearieldimension.client.renderer.TrollRenderer;
import net.mcreator.thearieldimension.client.renderer.TrollGiantRenderer;
import net.mcreator.thearieldimension.client.renderer.TractorRenderer;
import net.mcreator.thearieldimension.client.renderer.SkybornRenderer;
import net.mcreator.thearieldimension.client.renderer.SkybornOrbRenderer;
import net.mcreator.thearieldimension.client.renderer.SkybornGiantRenderer;
import net.mcreator.thearieldimension.client.renderer.SkyGuardRenderer;
import net.mcreator.thearieldimension.client.renderer.NetherBeastRenderer;
import net.mcreator.thearieldimension.client.renderer.MadmanInfectedRenderer;
import net.mcreator.thearieldimension.client.renderer.HumanRenderer;
import net.mcreator.thearieldimension.client.renderer.FireBulletRenderer;
import net.mcreator.thearieldimension.client.renderer.CrystalBeingRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheArielDimensionModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheArielDimensionModEntities.SKYBORN_ORB.get(), SkybornOrbRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.CRYSTAL_BEING.get(), CrystalBeingRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.SKYBORN.get(), SkybornRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.SKY_GUARD.get(), SkyGuardRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.FIRE_BULLET.get(), FireBulletRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.NETHER_BEAST.get(), NetherBeastRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.TROLL_GIANT.get(), TrollGiantRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.SKYBORN_GIANT.get(), SkybornGiantRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.MADMAN_INFECTED.get(), MadmanInfectedRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.TROLL.get(), TrollRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.HUMAN.get(), HumanRenderer::new);
		event.registerEntityRenderer(TheArielDimensionModEntities.TRACTOR.get(), TractorRenderer::new);
	}
}
