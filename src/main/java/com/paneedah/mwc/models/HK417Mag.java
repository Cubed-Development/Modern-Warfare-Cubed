package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK417Mag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;

	public HK417Mag() {
		textureWidth = 220;
		textureHeight = 220;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-2.25F, -7.0F, -13.7F);
		mag.cubeList.add(new ModelBox(mag, 90, 14, -0.9F, 0.299F, -1.999F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 32, 0, -0.9F, 0.3F, -5.4F, 2, 5, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 9, 0, -0.9F, 0.3F, -8.9F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 44, -0.7F, 0.298F, -6.9F, 2, 5, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 90, 0, 0.4F, 0.3F, -2.0F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 54, 55, -1.0F, 0.4F, -1.001F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 55, 14, 1.501F, -0.5F, -1.001F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 27, 36, 1.501F, 0.2F, -8.801F, 1, 4, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 27, 1.501F, 0.2F, -7.801F, 1, 1, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 44, -1.0F, 3.0F, -1.0F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 90, 72, -1.001F, 3.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 74, 11, -1.001F, 1.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 0, -1.0F, 1.9F, -3.85F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 90, 53, 1.501F, 3.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 71, 64, 1.501F, 1.4F, -3.5F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 26, 18, 1.5F, 1.9F, -3.85F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 54, 1.5F, 0.4F, -1.001F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 57, -1.001F, -0.5F, -1.001F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 14, 36, -1.001F, 0.2F, -8.801F, 1, 4, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 9, -1.001F, 0.2F, -7.801F, 1, 1, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 26, 44, 1.5F, 3.0F, -1.0F, 1, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 19, 44, 0.4F, 0.3F, -5.4F, 2, 5, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 9, 9, 0.4F, 0.3F, -8.9F, 2, 5, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 45, 0, 0.2F, 0.299F, -6.9F, 2, 5, 5, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.8F, 9.97F, -0.64F);
		mag.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.2531F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 60, -2.0F, 0.0F, -9.0F, 2, 6, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 9, -2.0F, 0.0F, -4.0F, 2, 6, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 45, -2.0F, 0.0F, -2.0F, 2, 6, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 19, 62, -0.1F, 0.0F, -9.0F, 2, 6, 2, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 73, -1.8F, 0.0F, -8.0F, 2, 6, 7, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 102, -0.3F, 0.0F, -8.0F, 2, 6, 7, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 63, 63, -0.1F, 0.0F, -2.0F, 2, 6, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.8F, 5.0F, 0.0F);
		mag.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1309F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 18, -2.0F, 0.0F, -9.0F, 2, 5, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 18, -2.0F, 0.0F, -4.0F, 2, 5, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 35, 88, -2.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 27, -0.1F, 0.0F, -9.0F, 2, 5, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 35, 103, -1.8F, 0.0F, -8.0F, 2, 5, 7, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 103, -0.3F, 0.0F, -8.0F, 2, 5, 7, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 70, 89, -0.1F, 0.0F, -2.0F, 2, 5, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.2F, 9.87F, -0.84F);
		mag.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.2531F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 0, 88, -1.95F, 0.0F, -9.0F, 3, 6, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.55F, 15.57F, -1.89F);
		mag.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.2531F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 19, 62, -2.0F, 0.0F, -9.0F, 3, 1, 9, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 90, 33, 0.4F, 0.0F, -9.0F, 2, 1, 9, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(2.7F, 13.39F, -10.19F);
		mag.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.2531F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 27, -3.95F, 0.02F, -1.0F, 4, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(2.7F, 10.17F, -0.04F);
		mag.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.2531F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 19, 18, -2.0F, 0.0F, -6.0F, 2, 6, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.3F, 5.0F, -0.2F);
		mag.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.1309F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 90, 7, -2.05F, 0.0F, -9.0F, 3, 5, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(2.7F, 5.2F, 0.6F);
		mag.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.1309F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 44, -2.0F, 0.0F, -6.0F, 2, 5, 3, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(2.1F, -0.5F, -5.0F);
		mag.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.2618F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 56, 36, -1.001F, 0.0F, -0.001F, 1, 1, 4, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-0.6F, -0.5F, -5.0F);
		mag.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.2618F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 45, 81, -0.001F, 0.0F, -0.001F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}