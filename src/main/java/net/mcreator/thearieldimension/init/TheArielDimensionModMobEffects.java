
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.thearieldimension.potion.FlyingMobEffect;
import net.mcreator.thearieldimension.potion.DoomedMobEffect;
import net.mcreator.thearieldimension.potion.AntidoteMobEffect;
import net.mcreator.thearieldimension.TheArielDimensionMod;

public class TheArielDimensionModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, TheArielDimensionMod.MODID);
	public static final RegistryObject<MobEffect> DOOMED = REGISTRY.register("doomed", () -> new DoomedMobEffect());
	public static final RegistryObject<MobEffect> FLYING = REGISTRY.register("flying", () -> new FlyingMobEffect());
	public static final RegistryObject<MobEffect> ANTIDOTE = REGISTRY.register("antidote", () -> new AntidoteMobEffect());
}
