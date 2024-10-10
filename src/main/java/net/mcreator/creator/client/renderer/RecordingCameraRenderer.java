
package net.mcreator.creator.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.creator.entity.RecordingCameraEntity;
import net.mcreator.creator.client.model.Modelrecording_camera;

public class RecordingCameraRenderer extends MobRenderer<RecordingCameraEntity, Modelrecording_camera<RecordingCameraEntity>> {
	public RecordingCameraRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelrecording_camera(context.bakeLayer(Modelrecording_camera.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RecordingCameraEntity entity) {
		return new ResourceLocation("creator_plus:textures/entities/camera_texture.png");
	}
}
