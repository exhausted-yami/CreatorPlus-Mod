
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.creator.client.model.Modelloot_crate;
import net.mcreator.creator.client.model.Modeldiamond_minecart;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CreatorPlusModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeldiamond_minecart.LAYER_LOCATION, Modeldiamond_minecart::createBodyLayer);
		event.registerLayerDefinition(Modelloot_crate.LAYER_LOCATION, Modelloot_crate::createBodyLayer);
	}
}
