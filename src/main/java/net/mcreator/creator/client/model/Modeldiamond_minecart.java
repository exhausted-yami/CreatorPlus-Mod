package net.mcreator.creator.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modeldiamond_minecart<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("creator_plus", "modeldiamond_minecart"), "main");
	public final ModelPart Cart;
	public final ModelPart front2;
	public final ModelPart back2;
	public final ModelPart right2;
	public final ModelPart left2;
	public final ModelPart base;

	public Modeldiamond_minecart(ModelPart root) {
		this.Cart = root.getChild("Cart");
		this.front2 = root.getChild("front2");
		this.back2 = root.getChild("back2");
		this.right2 = root.getChild("right2");
		this.left2 = root.getChild("left2");
		this.base = root.getChild("base");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Cart = partdefinition.addOrReplaceChild("Cart", CubeListBuilder.create(), PartPose.offset(0.0F, 23.0F, 9.0F));
		PartDefinition front2 = Cart.addOrReplaceChild("front2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition back2 = Cart.addOrReplaceChild("back2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, 8.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -9.0F));
		PartDefinition right2 = Cart.addOrReplaceChild("right2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, 6.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition left2 = Cart.addOrReplaceChild("left2", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -10.0F, 6.0F, 16.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition base = Cart.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 10).addBox(-10.0F, -8.0F, 0.0F, 20.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -9.0F, 0.0F, -1.5708F, 1.5708F));
		return LayerDefinition.create(meshdefinition, 64, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Cart.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
