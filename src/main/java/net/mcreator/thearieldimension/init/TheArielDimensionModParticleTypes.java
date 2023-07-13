
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thearieldimension.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.thearieldimension.TheArielDimensionMod;

public class TheArielDimensionModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, TheArielDimensionMod.MODID);
	public static final RegistryObject<SimpleParticleType> SKY_ORB_PARTICLE = REGISTRY.register("sky_orb_particle", () -> new SimpleParticleType(false));
}
