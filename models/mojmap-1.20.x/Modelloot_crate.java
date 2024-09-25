// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelloot_crate<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "loot_crate"), "main");
	private final ModelPart bb_main;

	public Modelloot_crate(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 43)
						.addBox(-4.5F, -31.0F, -4.5F, 9.0F, 10.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(0.0F, -21.0F, -1.0F, 0.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 7)
						.addBox(-1.0F, -21.0F, 0.0F, 2.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition knob_r1 = bb_main.addOrReplaceChild("knob_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -9.0F, -7.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition lid_r1 = bb_main.addOrReplaceChild("lid_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -2.5F, -7.0F, 14.0F, 5.0F, 14.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -11.5F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition base_r1 = bb_main
				.addOrReplaceChild("base_r1",
						CubeListBuilder.create().texOffs(0, 19).addBox(-7.0F, -5.0F, -7.0F, 14.0F, 10.0F, 14.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -5.0F, 0.0F, 3.1416F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}