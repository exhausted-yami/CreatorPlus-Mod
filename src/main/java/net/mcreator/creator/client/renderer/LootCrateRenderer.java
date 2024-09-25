
package net.mcreator.creator.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.creator.entity.LootCrateEntity;
import net.mcreator.creator.client.model.Modelloot_crate;

public class LootCrateRenderer extends MobRenderer<LootCrateEntity, Modelloot_crate<LootCrateEntity>> {
	public LootCrateRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelloot_crate(context.bakeLayer(Modelloot_crate.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LootCrateEntity entity) {
		return new ResourceLocation("creator_plus:textures/entities/loot_crate_texture.png");
	}
}
