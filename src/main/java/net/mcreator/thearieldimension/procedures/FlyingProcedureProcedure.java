package net.mcreator.thearieldimension.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.thearieldimension.init.TheArielDimensionModMobEffects;

public class FlyingProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			_player.getAbilities().mayfly = (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(TheArielDimensionModMobEffects.FLYING.get()));
			_player.onUpdateAbilities();
		}
	}
}
