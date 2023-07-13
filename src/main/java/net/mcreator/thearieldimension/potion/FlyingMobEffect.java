
package net.mcreator.thearieldimension.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FlyingMobEffect extends MobEffect {
	public FlyingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3618561);
	}

	@Override
	public String getDescriptionId() {
		return "effect.the_ariel_dimension.flying";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
