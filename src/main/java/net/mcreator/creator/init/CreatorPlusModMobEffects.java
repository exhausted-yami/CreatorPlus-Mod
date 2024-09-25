
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.creator.potion.RandomMobEffect;
import net.mcreator.creator.CreatorPlusMod;

public class CreatorPlusModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, CreatorPlusMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> RANDOM = REGISTRY.register("random", () -> new RandomMobEffect());
}
