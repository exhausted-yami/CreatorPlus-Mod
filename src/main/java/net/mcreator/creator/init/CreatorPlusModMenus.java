
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.creator.world.inventory.CardGuiMenu;
import net.mcreator.creator.CreatorPlusMod;

public class CreatorPlusModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, CreatorPlusMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<CardGuiMenu>> CARD_GUI = REGISTRY.register("card_gui", () -> IMenuTypeExtension.create(CardGuiMenu::new));
}
