
package net.mcreator.creator.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.creator.procedures.RandomEffectStartedappliedProcedure;

public class RandomMobEffect extends MobEffect {
	public RandomMobEffect() {
		super(MobEffectCategory.NEUTRAL, -154);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		RandomEffectStartedappliedProcedure.execute(entity);
	}
}
