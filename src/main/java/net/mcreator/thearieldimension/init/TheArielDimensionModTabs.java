
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheArielDimensionModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(TheArielDimensionModBlocks.ARIEL_DIMENSION_PORTAL.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(TheArielDimensionModItems.SKYBORN_ORB.get());
			tabData.accept(TheArielDimensionModItems.FIRE_BULLET.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TheArielDimensionModItems.CRYSTAL_BEING_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.SKYBORN_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.SKY_GUARD_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.NETHER_BEAST_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.TROLL_GIANT_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.SKYBORN_GIANT_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.MADMAN_INFECTED_SPAWN_EGG.get());
			tabData.accept(TheArielDimensionModItems.TROLL_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(TheArielDimensionModItems.ACID_BUCKET.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(TheArielDimensionModBlocks.CHALK.get().asItem());
			tabData.accept(TheArielDimensionModBlocks.ANGEL_LOG.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(TheArielDimensionModItems.THE_ARIEL_DIMENSION.get());
		}

		if (tabData.getTab() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(TheArielDimensionModItems.FLYING_BEAST_MILK.get());
			tabData.accept(TheArielDimensionModItems.ORANGE.get());
			tabData.accept(TheArielDimensionModItems.ORANGE_JUICE.get());
		}
	}
}
