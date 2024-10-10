
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.creator.CreatorPlusMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CreatorPlusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreatorPlusMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATOR_PLUS = REGISTRY.register("creator_plus",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.creator_plus.creator_plus")).icon(() -> new ItemStack(CreatorPlusModItems.ONE_HUNDRED.get())).displayItems((parameters, tabData) -> {
				tabData.accept(CreatorPlusModItems.ONE_HUNDRED.get());
				tabData.accept(CreatorPlusModItems.ONE_THOUSAND.get());
				tabData.accept(CreatorPlusModItems.TEN_THOUSAND.get());
				tabData.accept(CreatorPlusModItems.ONE_HUNDRED_THOUSAND.get());
				tabData.accept(CreatorPlusModItems.ONE_MILLION.get());
				tabData.accept(CreatorPlusModItems.THE_NORTH_TREE_PICKAXE.get());
				tabData.accept(CreatorPlusModItems.CARD.get());
				tabData.accept(CreatorPlusModItems.DIAMOND_MINECART.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(CreatorPlusModItems.LOOT_CRATE_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.PLAYER_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.NORTH_WEST_TREES_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.DREAM_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.SSUNDEE_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.TOMMYINNIT_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.TECHNO_BLADE_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.APHMAU_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.AUTHENTIC_GAMES_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.DAN_TDM_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.EL_TROLLINO_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.POPULAR_MM_OS_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.MIKE_CRACK_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.GAMING_WITH_JEN_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.DIAMOND_MINECART_MOB_SPAWN_EGG.get());
			tabData.accept(CreatorPlusModItems.RECORDING_CAMERA_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CreatorPlusModItems.THE_NORTH_TREE_PICKAXE.get());
		}
	}
}
