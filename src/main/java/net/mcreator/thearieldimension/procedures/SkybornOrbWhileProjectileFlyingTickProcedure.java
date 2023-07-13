package net.mcreator.thearieldimension.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.thearieldimension.init.TheArielDimensionModParticleTypes;

public class SkybornOrbWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (TheArielDimensionModParticleTypes.SKY_ORB_PARTICLE.get()), x, y, z, 10, 0.1, 0.1, 0.1, 0.33);
	}
}
