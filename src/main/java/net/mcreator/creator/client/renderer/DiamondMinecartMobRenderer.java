
package net.mcreator.creator.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.creator.entity.DiamondMinecartMobEntity;
import net.mcreator.creator.client.model.Modeldiamond_minecart;

public class DiamondMinecartMobRenderer extends MobRenderer<DiamondMinecartMobEntity, Modeldiamond_minecart<DiamondMinecartMobEntity>> {
	public DiamondMinecartMobRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeldiamond_minecart(context.bakeLayer(Modeldiamond_minecart.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DiamondMinecartMobEntity entity) {
		return new ResourceLocation("creator_plus:textures/entities/diamond_minecart_texture.png");
	}
}
