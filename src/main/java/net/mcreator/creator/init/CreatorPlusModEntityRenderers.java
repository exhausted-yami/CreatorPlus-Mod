
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.creator.client.renderer.TommyinnitRenderer;
import net.mcreator.creator.client.renderer.TechnoBladeRenderer;
import net.mcreator.creator.client.renderer.SSundeeRenderer;
import net.mcreator.creator.client.renderer.PopularMMOsRenderer;
import net.mcreator.creator.client.renderer.PlayerRenderer;
import net.mcreator.creator.client.renderer.NorthWestTreesRenderer;
import net.mcreator.creator.client.renderer.MikeCrackRenderer;
import net.mcreator.creator.client.renderer.LootCrateRenderer;
import net.mcreator.creator.client.renderer.GamingWithJenRenderer;
import net.mcreator.creator.client.renderer.ElTrollinoRenderer;
import net.mcreator.creator.client.renderer.DreamRenderer;
import net.mcreator.creator.client.renderer.DiamondMinecartMobRenderer;
import net.mcreator.creator.client.renderer.DanTDMRenderer;
import net.mcreator.creator.client.renderer.AuthenticGamesRenderer;
import net.mcreator.creator.client.renderer.AphmauRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CreatorPlusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CreatorPlusModEntities.LOOT_CRATE.get(), LootCrateRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.PLAYER.get(), PlayerRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.NORTH_WEST_TREES.get(), NorthWestTreesRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.DREAM.get(), DreamRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.SSUNDEE.get(), SSundeeRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.TOMMYINNIT.get(), TommyinnitRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.TECHNO_BLADE.get(), TechnoBladeRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.APHMAU.get(), AphmauRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.AUTHENTIC_GAMES.get(), AuthenticGamesRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.DAN_TDM.get(), DanTDMRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.EL_TROLLINO.get(), ElTrollinoRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.POPULAR_MM_OS.get(), PopularMMOsRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.MIKE_CRACK.get(), MikeCrackRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.GAMING_WITH_JEN.get(), GamingWithJenRenderer::new);
		event.registerEntityRenderer(CreatorPlusModEntities.DIAMOND_MINECART_MOB.get(), DiamondMinecartMobRenderer::new);
	}
}
