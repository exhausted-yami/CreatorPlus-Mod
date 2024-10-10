// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelrecording_camera<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "recording_camera"), "main");
	private final ModelPart Stand;
	private final ModelPart Camera;
	private final ModelPart Film;

	public Modelrecording_camera(ModelPart root) {
		this.Stand = root.getChild("Stand");
		this.Camera = root.getChild("Camera");
		this.Film = this.Camera.getChild("Film");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Stand = partdefinition.addOrReplaceChild("Stand", CubeListBuilder.create(),
				PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition cube_r1 = Stand
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(4, 23).addBox(0.0F, 0.0F, 0.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		PartDefinition cube_r2 = Stand
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r3 = Stand
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(8, 23).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 18.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.3054F, 0.0F, 0.0F));

		PartDefinition Camera = partdefinition.addOrReplaceChild("Camera",
				CubeListBuilder.create().texOffs(0, 15)
						.addBox(-2.5F, -6.0F, -3.4725F, 5.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -5.0F, -4.4725F, 6.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(30, 9)
						.addBox(-1.0F, -3.0F, -6.4725F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 0)
						.addBox(-2.0F, -4.0F, -7.4725F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 6.0F, 0.9725F));

		PartDefinition cube_r4 = Camera.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(16, 30).addBox(0.0F, -1.0F, -2.0F, 0.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0009F, -3.0F, -7.4721F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r5 = Camera.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(12, 30).addBox(0.0F, -1.0F, -2.0F, 0.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, -7.4725F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r6 = Camera.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(30, 7).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0009F, -7.4721F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Camera.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(30, 5).addBox(-1.0F, 0.0F, -2.0F, 4.0F, 0.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -4.0F, -7.4725F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Camera.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(24, 15).addBox(-1.0F, -1.5F, 0.0F, 1.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -2.5F, -1.4725F, 0.0F, -0.0873F, 0.0F));

		PartDefinition Film = Camera.addOrReplaceChild("Film",
				CubeListBuilder.create().texOffs(12, 23)
						.addBox(-1.5F, -3.0F, -2.5F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(28, 23)
						.addBox(-1.5F, -4.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(28, 28)
						.addBox(-1.5F, -1.0F, -2.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.75F, 2.7775F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Stand.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Camera.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}