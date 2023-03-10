package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RevolverSpeedloader extends ModelBase {
	private final ModelRenderer speedloader;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer speedloaderbullets;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public RevolverSpeedloader() {
		textureWidth = 32;
		textureHeight = 32;

		speedloader = new ModelRenderer(this);
		speedloader.setRotationPoint(9.5F, -18.1F, 7.7F);
		speedloader.cubeList.add(new ModelBox(speedloader, 0, 14, -8.0F, -5.0F, -9.0F, 2, 5, 2, 0.0F, false));
		speedloader.cubeList.add(new ModelBox(speedloader, 20, 19, -5.1F, -3.9F, -9.0F, 1, 2, 2, 0.0F, false));
		speedloader.cubeList.add(new ModelBox(speedloader, 0, 0, -9.9F, -3.9F, -9.001F, 5, 2, 2, 0.0F, false));
		speedloader.cubeList.add(new ModelBox(speedloader, 20, 9, -8.0F, -5.8F, -9.001F, 2, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-8.0F, -5.8F, -9.0F);
		speedloader.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 15, -2.7F, -0.001F, -0.003F, 1, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 14, 13, -2.0F, 0.0F, -0.002F, 2, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-6.0F, -5.8F, -9.0F);
		speedloader.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 6, 19, -1.999F, 1.7F, -0.003F, 2, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 15, -2.0F, 0.0F, -0.002F, 2, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-6.4F, -4.3F, -7.4F);
		speedloader.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.3665F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 0, -2.0F, 0.0F, -0.001F, 2, 2, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 13, 21, -2.0F, 0.0F, -0.401F, 2, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 22, -2.0F, 0.0F, 1.399F, 2, 2, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-8.0F, 0.0F, -9.0F);
		speedloader.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 21, -2.7F, -2.0F, 0.003F, 1, 2, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 17, -2.0F, -2.0F, 0.002F, 2, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-6.0F, 0.0F, -9.0F);
		speedloader.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 12, -1.999F, -2.7F, 0.002F, 2, 1, 2, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 4, -2.0F, -2.0F, 0.001F, 2, 2, 2, 0.0F, false));

		speedloaderbullets = new ModelRenderer(this);
		speedloaderbullets.setRotationPoint(9.5F, -18.1F, 4.7F);
		speedloaderbullets.cubeList.add(new ModelBox(speedloaderbullets, 12, 6, -7.5F, -5.501F, -10.003F, 1, 1, 4, 0.1F, false));
		speedloaderbullets.cubeList.add(new ModelBox(speedloaderbullets, 6, 10, -7.5F, -5.501F, -11.003F, 1, 1, 1, 0.0F, false));
		speedloaderbullets.cubeList.add(new ModelBox(speedloaderbullets, 0, 4, -7.5F, -1.301F, -10.003F, 1, 1, 4, 0.1F, false));
		speedloaderbullets.cubeList.add(new ModelBox(speedloaderbullets, 0, 4, -7.5F, -1.301F, -11.003F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-8.9F, -1.1F, -10.0F);
		speedloaderbullets.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.4014F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, 0.0F, -1.101F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 6, 5, 0.0F, -1.101F, -0.003F, 1, 1, 4, 0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.1F, -1.1F, -10.0F);
		speedloaderbullets.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.4014F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 6, 4, -1.0F, -1.101F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 9, -1.0F, -1.101F, -0.003F, 1, 1, 4, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-8.9F, -4.6F, -10.0F);
		speedloaderbullets.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.4014F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 6, 0.0F, -0.001F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 10, 0, 0.0F, -0.001F, -0.003F, 1, 1, 4, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-5.1F, -4.6F, -10.0F);
		speedloaderbullets.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.4014F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 9, -1.0F, -0.001F, -1.003F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 6, 10, -1.0F, -0.001F, -0.003F, 1, 1, 4, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		speedloader.render(f5);
//		speedloaderbullets.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
