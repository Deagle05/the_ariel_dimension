
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.thearieldimension.world.features.LostWorldLandscapeFeature;
import net.mcreator.thearieldimension.world.features.EndOutpoststructureFeature;
import net.mcreator.thearieldimension.world.features.AngelTreeFeature;
import net.mcreator.thearieldimension.TheArielDimensionMod;

@Mod.EventBusSubscriber
public class TheArielDimensionModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheArielDimensionMod.MODID);
	public static final RegistryObject<Feature<?>> ANGEL_TREE = REGISTRY.register("angel_tree", AngelTreeFeature::new);
	public static final RegistryObject<Feature<?>> LOST_WORLD_LANDSCAPE = REGISTRY.register("lost_world_landscape", LostWorldLandscapeFeature::new);
	public static final RegistryObject<Feature<?>> END_OUTPOSTSTRUCTURE = REGISTRY.register("end_outpoststructure", EndOutpoststructureFeature::new);
}
