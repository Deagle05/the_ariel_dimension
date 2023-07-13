
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.thearieldimension.TheArielDimensionMod;

public class TheArielDimensionModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TheArielDimensionMod.MODID);
	public static final RegistryObject<Potion> MADMAN_VIRUS = REGISTRY.register("madman_virus",
			() -> new Potion(new MobEffectInstance(TheArielDimensionModMobEffects.DOOMED.get(), 12000, 0, false, true), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 12000, 3, false, true),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 12000, 5, false, true), new MobEffectInstance(MobEffects.JUMP, 12000, 2, false, true), new MobEffectInstance(MobEffects.REGENERATION, 12000, 0, false, true),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 12000, 0, false, true), new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 12000, 2, false, true), new MobEffectInstance(MobEffects.HUNGER, 12000, 7, false, true)));
	public static final RegistryObject<Potion> FLYING_POTION = REGISTRY.register("flying_potion", () -> new Potion(new MobEffectInstance(TheArielDimensionModMobEffects.FLYING.get(), 3600, 0, false, true)));
	public static final RegistryObject<Potion> ANTIDOTE_POTION = REGISTRY.register("antidote_potion", () -> new Potion(new MobEffectInstance(TheArielDimensionModMobEffects.ANTIDOTE.get(), 600, 0, false, true)));
}
