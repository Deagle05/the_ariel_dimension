
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.thearieldimension.block.TheArielDimensionPortalBlock;
import net.mcreator.thearieldimension.block.LostWorldPortalBlock;
import net.mcreator.thearieldimension.block.ChalkBlock;
import net.mcreator.thearieldimension.block.ArielDimensionPortalBlock;
import net.mcreator.thearieldimension.block.AngelLogBlock;
import net.mcreator.thearieldimension.block.AcidBlock;
import net.mcreator.thearieldimension.TheArielDimensionMod;

public class TheArielDimensionModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheArielDimensionMod.MODID);
	public static final RegistryObject<Block> ARIEL_DIMENSION_PORTAL = REGISTRY.register("ariel_dimension_portal", () -> new ArielDimensionPortalBlock());
	public static final RegistryObject<Block> CHALK = REGISTRY.register("chalk", () -> new ChalkBlock());
	public static final RegistryObject<Block> THE_ARIEL_DIMENSION_PORTAL = REGISTRY.register("the_ariel_dimension_portal", () -> new TheArielDimensionPortalBlock());
	public static final RegistryObject<Block> LOST_WORLD_PORTAL = REGISTRY.register("lost_world_portal", () -> new LostWorldPortalBlock());
	public static final RegistryObject<Block> ACID = REGISTRY.register("acid", () -> new AcidBlock());
	public static final RegistryObject<Block> ANGEL_LOG = REGISTRY.register("angel_log", () -> new AngelLogBlock());
}
