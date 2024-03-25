package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GasDetector extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer GasDetector25_r1;
	private final ModelRenderer GasDetector24_r1;
	private final ModelRenderer GasDetector22_r1;
	private final ModelRenderer GasDetector28_r1;

	public GasDetector() {
		textureWidth = 64;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -34.0F, 0.0F, 7, 11, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -27.0F, 1.0F, 7, 4, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -34.5F, 1.0F, 7, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -32.5F, 3.0F, 1, 6, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.0F, -32.5F, 1.0F, 1, 6, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 5.5F, -33.5F, 3.2F, 1, 5, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -33.5F, 3.2F, 4, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -33.5F, 3.2F, 1, 5, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -29.5F, 3.2F, 4, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -28.5F, 3.0F, 5, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.2F, -27.3F, 3.2F, 7, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -27.3F, 3.2F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -26.0F, 3.1F, 6, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -24.5F, 3.1F, 5, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -33.0F, 0.5F, 1, 6, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -33.0F, 2.5F, 1, 6, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 30, 0, 0.2F, -33.0F, 1.5F, 1, 6, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 30, 0, -0.5F, -26.0F, 1.5F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 30, 0, -0.3F, -24.5F, 1.5F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 30, 0, -0.3F, -34.8F, 1.5F, 3, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.1F, -34.6F, 0.1F, 3, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.1F, -33.6F, 0.1F, 1, 2, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.1F, -33.6F, 3.0F, 1, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.2F, -33.5F, -0.5F, 3, 10, 1, 0.0F, true));

		GasDetector25_r1 = new ModelRenderer(this);
		GasDetector25_r1.setRotationPoint(0.0F, -48.2742F, -24.5213F);
		bone.addChild(GasDetector25_r1);
		setRotationAngle(GasDetector25_r1, -1.9333F, 0.0F, 0.0F);
		GasDetector25_r1.cubeList.add(new ModelBox(GasDetector25_r1, 0, 0, 6.1F, -32.6F, 4.4F, 1, 1, 1, 0.0F, true));

		GasDetector24_r1 = new ModelRenderer(this);
		GasDetector24_r1.setRotationPoint(0.0F, -34.4995F, -30.7419F);
		bone.addChild(GasDetector24_r1);
		setRotationAngle(GasDetector24_r1, -1.45F, 0.0F, 0.0F);
		GasDetector24_r1.cubeList.add(new ModelBox(GasDetector24_r1, 0, 0, 4.1F, -34.6F, 4.1F, 3, 1, 2, 0.0F, true));

		GasDetector22_r1 = new ModelRenderer(this);
		GasDetector22_r1.setRotationPoint(0.0F, -0.2039F, -3.8518F);
		bone.addChild(GasDetector22_r1);
		setRotationAngle(GasDetector22_r1, -0.1115F, 0.0F, 0.0F);
		GasDetector22_r1.cubeList.add(new ModelBox(GasDetector22_r1, 0, 0, 4.1F, -34.6F, -0.1F, 3, 3, 1, 0.0F, true));

		GasDetector28_r1 = new ModelRenderer(this);
		GasDetector28_r1.setRotationPoint(0.0F, -21.4009F, -30.9322F);
		bone.addChild(GasDetector28_r1);
		setRotationAngle(GasDetector28_r1, -1.1525F, 0.0F, 0.0F);
		GasDetector28_r1.cubeList.add(new ModelBox(GasDetector28_r1, 0, 0, 0.0F, -34.5F, 1.0F, 5, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}