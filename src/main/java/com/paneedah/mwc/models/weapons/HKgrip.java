package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HKgrip extends ModelBase {
	private final ModelRenderer hk_grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip8_r2;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip12_r2;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer grip8_r3;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip12_r3;

	public HKgrip() {
		textureWidth = 45;
		textureHeight = 45;

		hk_grip = new ModelRenderer(this);
		hk_grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		hk_grip.cubeList.add(new ModelBox(hk_grip, 9, 32, -3.0F, -30.7F, -1.0F, 3, 5, 1, 0.0F, false));
		hk_grip.cubeList.add(new ModelBox(hk_grip, 13, 9, -3.499F, -30.7F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -25.7F, -5.25F);
		hk_grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3194F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 18, 6, 0.001F, -0.2205F, -0.109F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 0, 0, 0.002F, 0.7795F, -0.109F, 4, 9, 5, 0.0F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(-2.1F, -29.7F, 0.0F);
		hk_grip.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -0.7243F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 24, 29, -1.0F, -3.0F, -2.0F, 3, 5, 2, 0.0F, false));
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 17, 32, 1.2F, -3.001F, -2.001F, 1, 5, 2, 0.0F, false));

		grip8_r2 = new ModelRenderer(this);
		grip8_r2.setRotationPoint(-3.5F, -26.25F, -1.0F);
		hk_grip.addChild(grip8_r2);
		setRotationAngle(grip8_r2, -1.0345F, 0.0F, 0.0F);
		grip8_r2.cubeList.add(new ModelBox(grip8_r2, 0, 14, -0.001F, -0.8581F, -1.7357F, 4, 1, 5, 0.0F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(-3.5F, -23.9F, 1.4F);
		hk_grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -1.2789F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 13, 0, 0.001F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(-3.5F, -15.75F, 0.15F);
		hk_grip.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 0.2269F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 24, 19, -0.001F, -2.0F, 0.0F, 4, 2, 3, 0.0F, false));

		grip12_r2 = new ModelRenderer(this);
		grip12_r2.setRotationPoint(-3.5F, -16.85F, -2.85F);
		hk_grip.addChild(grip12_r2);
		setRotationAngle(grip12_r2, -0.0349F, 0.0F, 0.0F);
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 6, 20, 0.001F, -1.0F, 1.0F, 4, 1, 2, 0.0F, false));
		grip12_r2.cubeList.add(new ModelBox(grip12_r2, 26, 6, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(-3.5F, -20.1F, 2.55F);
		hk_grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, -1.3662F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 26, 10, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(-3.0F, -20.3F, 3.05F);
		hk_grip.addChild(grip10_r2);
		setRotationAngle(grip10_r2, -1.3662F, 0.0F, 0.0F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 32, 29, 0.0F, 0.0F, 2.75F, 3, 1, 1, 0.0F, false));
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 31, 14, -0.001F, -0.001F, 0.0F, 3, 1, 3, 0.0F, false));

		grip8_r3 = new ModelRenderer(this);
		grip8_r3.setRotationPoint(-3.0F, -24.1F, 1.9F);
		hk_grip.addChild(grip8_r3);
		setRotationAngle(grip8_r3, -1.2789F, 0.0F, 0.0F);
		grip8_r3.cubeList.add(new ModelBox(grip8_r3, 24, 24, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(-3.0F, -27.25F, -1.0F);
		hk_grip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -1.0345F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 25, 1, -0.001F, -0.8581F, 0.2643F, 3, 1, 4, 0.0F, false));

		grip12_r3 = new ModelRenderer(this);
		grip12_r3.setRotationPoint(-3.6F, -26.3F, -5.7F);
		hk_grip.addChild(grip12_r3);
		setRotationAngle(grip12_r3, 0.302F, 0.0F, 0.0F);
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 14, 19, 0.0F, 0.7795F, 0.891F, 1, 9, 4, 0.0F, false));
		grip12_r3.cubeList.add(new ModelBox(grip12_r3, 0, 20, 3.2F, 0.7795F, 0.891F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hk_grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
