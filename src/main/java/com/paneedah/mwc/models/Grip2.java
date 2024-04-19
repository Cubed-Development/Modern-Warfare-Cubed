package com.paneedah.mwc.models;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Grip2 extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun34_r2;

	public Grip2() {
		textureWidth = 50;
		textureHeight = 50;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 14, 0, -0.5F, -19.6F, -2.5F, 3, 2, 3, -0.1F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 7, -1.0F, -30.5F, -4.0F, 4, 1, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -1.0F, -29.7F, -4.0F, 4, 1, 6, -0.155F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 24, 2.0F, -30.5F, 1.8F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 24, 14, -1.0F, -30.5F, 1.8F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 14, 7, -0.5F, -30.0F, 1.8F, 3, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 14, 10, -0.5F, -30.5F, -4.5F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 14, 0.0F, -28.5F, -2.5F, 2, 8, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 14, 24, -0.8F, -24.0F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 8, 24, 1.8F, -24.0F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 23, 0, 1.8F, -22.7F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 22, 11, -0.8F, -22.7F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 7, 1.8F, -21.5F, -2.0F, 1, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -0.8F, -21.5F, -2.0F, 1, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 22, 8, 1.8F, -25.5F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 22, 5, -0.8F, -25.5F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 5, 0.0F, -25.5F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 3, 0.0F, -25.5F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 25, 20, 0.0F, -24.0F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 25, 17, 0.0F, -22.7F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 25, 0.0F, -22.7F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 21, 0.0F, -21.5F, -2.8F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 18, 0.0F, -21.5F, -0.2F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 24, 24, 0.0F, -24.0F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 15, 1.8F, -29.0F, -2.0F, 1, 1, 2, 0.01F, false));
		grip.cubeList.add(new ModelBox(grip, 18, 12, -0.8F, -29.0F, -2.0F, 1, 1, 2, 0.01F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 11, 0.0F, -29.0F, -0.2F, 2, 1, 1, 0.01F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 4, 0.0F, -29.0F, -2.8F, 2, 1, 1, 0.01F, false));
		grip.cubeList.add(new ModelBox(grip, 10, 14, -0.5F, -28.5F, -2.0F, 3, 8, 2, 0.0F, false));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(2.3F, -25.0F, -2.3F);
		grip.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 0.0F, 0.7854F, 0.0F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 31, 27, -0.855F, -0.5F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 17, 27, -0.855F, 3.5F, -0.57F, 1, 2, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 13, 27, -0.855F, 3.5F, -0.43F, 1, 2, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 31, 11, -0.855F, 2.3F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 31, 6, -0.855F, 2.3F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 21, 31, -0.855F, 1.0F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 17, 31, -0.855F, 1.0F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 31, 4, -3.815F, -0.5F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 28, 13, -3.815F, -4.0F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 21, 27, -3.815F, -4.0F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 3, 31, -3.815F, -0.5F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 27, 30, -3.815F, 1.0F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 30, 21, -3.815F, 1.0F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 30, 18, -3.815F, 2.3F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 30, 15, -3.815F, 2.3F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 27, 10, -3.815F, 3.5F, -0.57F, 1, 2, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 9, 27, -3.815F, 3.5F, -0.43F, 1, 2, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 27, 0, -0.855F, -4.0F, -0.57F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 26, 22, -0.855F, -4.0F, -0.43F, 1, 1, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 31, 29, -0.855F, -0.5F, -0.57F, 1, 1, 1, 0.0F, false));

		gun34_r2 = new ModelRenderer(this);
		gun34_r2.setRotationPoint(-2.3F, -25.0F, 2.3F);
		grip.addChild(gun34_r2);
		setRotationAngle(gun34_r2, 0.0F, 0.7854F, 0.0F);
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 18, 24, 4.23F, -4.0F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 12, 24, 4.105F, -4.0F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 14, 30, 4.23F, -0.5F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 27, 7, 4.105F, 3.5F, -1.98F, 1, 2, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 0, 27, 4.23F, 3.5F, -1.98F, 1, 2, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 30, 1, 4.105F, 2.3F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 0, 30, 4.23F, 2.3F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 30, 9, 4.105F, 1.0F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 6, 30, 4.23F, 1.0F, -1.98F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 20, 5, 4.105F, -4.0F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 7, 14, 4.23F, -4.0F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 29, 25, 4.105F, -0.5F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 24, 29, 4.23F, -0.5F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 29, 23, 4.105F, 1.0F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 20, 29, 4.23F, 1.0F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 3, 29, 4.23F, 2.3F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 28, 28, 4.105F, 2.3F, 0.97F, 1, 1, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 25, 26, 4.105F, 3.5F, 0.97F, 1, 2, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 5, 26, 4.23F, 3.5F, 0.97F, 1, 2, 1, 0.0F, false));
		gun34_r2.cubeList.add(new ModelBox(gun34_r2, 10, 30, 4.105F, -0.5F, -1.98F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
