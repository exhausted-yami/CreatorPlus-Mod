
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.creator.item.inventory.CardInventoryCapability;
import net.mcreator.creator.item.TheNorthTreePickaxeItem;
import net.mcreator.creator.item.TenThousandItem;
import net.mcreator.creator.item.SpeedrunnersBladeItem;
import net.mcreator.creator.item.PranksterWandItem;
import net.mcreator.creator.item.OneThousandItem;
import net.mcreator.creator.item.OneMillionItem;
import net.mcreator.creator.item.OneHundredThousandItem;
import net.mcreator.creator.item.OneHundredItem;
import net.mcreator.creator.item.DiamondMinecartItem;
import net.mcreator.creator.item.CreatorPlusModLogoItem;
import net.mcreator.creator.item.ChaoticPotionItem;
import net.mcreator.creator.item.CardItem;
import net.mcreator.creator.CreatorPlusMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CreatorPlusModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, CreatorPlusMod.MODID);
	public static final DeferredHolder<Item, Item> ONE_HUNDRED = REGISTRY.register("one_hundred", OneHundredItem::new);
	public static final DeferredHolder<Item, Item> ONE_THOUSAND = REGISTRY.register("one_thousand", OneThousandItem::new);
	public static final DeferredHolder<Item, Item> TEN_THOUSAND = REGISTRY.register("ten_thousand", TenThousandItem::new);
	public static final DeferredHolder<Item, Item> ONE_HUNDRED_THOUSAND = REGISTRY.register("one_hundred_thousand", OneHundredThousandItem::new);
	public static final DeferredHolder<Item, Item> ONE_MILLION = REGISTRY.register("one_million", OneMillionItem::new);
	public static final DeferredHolder<Item, Item> LOOT_CRATE_SPAWN_EGG = REGISTRY.register("loot_crate_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.LOOT_CRATE, -65536, -10092544, new Item.Properties()));
	public static final DeferredHolder<Item, Item> THE_NORTH_TREE_PICKAXE = REGISTRY.register("the_north_tree_pickaxe", TheNorthTreePickaxeItem::new);
	public static final DeferredHolder<Item, Item> PLAYER_SPAWN_EGG = REGISTRY.register("player_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.PLAYER, -16764007, -2243180, new Item.Properties()));
	public static final DeferredHolder<Item, Item> CARD = REGISTRY.register("card", CardItem::new);
	public static final DeferredHolder<Item, Item> NORTH_WEST_TREES_SPAWN_EGG = REGISTRY.register("north_west_trees_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.NORTH_WEST_TREES, -10079488, -2243180, new Item.Properties()));
	public static final DeferredHolder<Item, Item> CREATOR_PLUS_MOD_LOGO = REGISTRY.register("creator_plus_mod_logo", CreatorPlusModLogoItem::new);
	public static final DeferredHolder<Item, Item> SPEEDRUNNERS_BLADE = REGISTRY.register("speedrunners_blade", SpeedrunnersBladeItem::new);
	public static final DeferredHolder<Item, Item> DREAM_SPAWN_EGG = REGISTRY.register("dream_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.DREAM, -16711936, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> SSUNDEE_SPAWN_EGG = REGISTRY.register("ssundee_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.SSUNDEE, -16777216, -16442322, new Item.Properties()));
	public static final DeferredHolder<Item, Item> CHAOTIC_POTION = REGISTRY.register("chaotic_potion", ChaoticPotionItem::new);
	public static final DeferredHolder<Item, Item> TOMMYINNIT_SPAWN_EGG = REGISTRY.register("tommyinnit_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.TOMMYINNIT, -256, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> TECHNO_BLADE_SPAWN_EGG = REGISTRY.register("techno_blade_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.TECHNO_BLADE, -1339756, -2372608, new Item.Properties()));
	public static final DeferredHolder<Item, Item> APHMAU_SPAWN_EGG = REGISTRY.register("aphmau_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.APHMAU, -3104513, -879273, new Item.Properties()));
	public static final DeferredHolder<Item, Item> AUTHENTIC_GAMES_SPAWN_EGG = REGISTRY.register("authentic_games_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.AUTHENTIC_GAMES, -16747404, -16381945, new Item.Properties()));
	public static final DeferredHolder<Item, Item> DAN_TDM_SPAWN_EGG = REGISTRY.register("dan_tdm_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.DAN_TDM, -9184776, -16763542, new Item.Properties()));
	public static final DeferredHolder<Item, Item> EL_TROLLINO_SPAWN_EGG = REGISTRY.register("el_trollino_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.EL_TROLLINO, -23765, -14381060, new Item.Properties()));
	public static final DeferredHolder<Item, Item> POPULAR_MM_OS_SPAWN_EGG = REGISTRY.register("popular_mm_os_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.POPULAR_MM_OS, -14896925, -14079703, new Item.Properties()));
	public static final DeferredHolder<Item, Item> MIKE_CRACK_SPAWN_EGG = REGISTRY.register("mike_crack_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.MIKE_CRACK, -1990870, -4365293, new Item.Properties()));
	public static final DeferredHolder<Item, Item> GAMING_WITH_JEN_SPAWN_EGG = REGISTRY.register("gaming_with_jen_spawn_egg", () -> new DeferredSpawnEggItem(CreatorPlusModEntities.GAMING_WITH_JEN, -1796425, -16424692, new Item.Properties()));
	public static final DeferredHolder<Item, Item> PRANKSTER_WAND = REGISTRY.register("prankster_wand", PranksterWandItem::new);
	public static final DeferredHolder<Item, Item> DIAMOND_MINECART = REGISTRY.register("diamond_minecart", DiamondMinecartItem::new);
	public static final DeferredHolder<Item, Item> DIAMOND_MINECART_MOB_SPAWN_EGG = REGISTRY.register("diamond_minecart_mob_spawn_egg",
			() -> new DeferredSpawnEggItem(CreatorPlusModEntities.DIAMOND_MINECART_MOB, -16711732, -16724788, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.ItemHandler.ITEM, (stack, context) -> new CardInventoryCapability(stack), CARD.get());
	}
}
