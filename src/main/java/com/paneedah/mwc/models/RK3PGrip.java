package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RK3PGrip extends ModelWithAttachments {
	private final ModelRenderer RK3PGrip;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;

	public RK3PGrip() {
		textureWidth = 400;
		textureHeight = 400;

		RK3PGrip = new ModelRenderer(this);
		RK3PGrip.setRotationPoint(-1.4F, -4.0F, -2.0F);
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 102, 39, -2.0F, 1.0F, -3.0F, 4, 1, 5, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 0, 162, -2.0F, 2.0F, -2.0F, 4, 1, 3, -0.002F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 115, 164, -2.0F, -1.0F, -4.0F, 4, 2, 1, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 86, 82, -2.0F, -1.3F, -4.8F, 4, 1, 1, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 0, 118, -2.0F, -3.0F, -5.0F, 4, 2, 6, -0.002F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 33, 49, -3.0F, -3.0F, -5.0F, 6, 1, 6, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 72, 26, -3.0F, -3.0F, 0.7F, 6, 1, 1, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 72, 0, -1.0F, -1.0F, -3.0F, 2, 2, 4, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 82, 129, -1.5F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
		RK3PGrip.cubeList.add(new ModelBox(RK3PGrip, 72, 114, 0.5F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.4399F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 113, 3, -1.0F, 0.3F, -0.1F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 113, 10, -3.0F, 0.3F, -0.1F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 178, 127, -2.5F, 0.3F, -0.1F, 2, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, 1.5F, -0.5F);
		RK3PGrip.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 46, -1.0F, -0.5F, 1.4F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 52, -3.0F, -0.5F, 1.4F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 102, -2.5F, -0.5F, 1.4F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 72, 6, -3.5F, 0.4F, 0.4F, 4, 4, 2, -0.002F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.9599F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 113, -3.0F, -1.7F, 2.6F, 6, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 140, 163, -2.0F, -1.7F, 1.4F, 4, 2, 3, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.8F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8727F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 130, -2.4F, -1.05F, -5.0F, 1, 1, 6, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 127, -2.4F, -1.45F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.8727F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 52, -0.4F, -3.175F, -5.0F, 1, 1, 6, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 59, -0.4F, -3.575F, -5.0F, 1, 1, 6, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.55F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.48F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 125, 160, -2.55F, -2.4F, -4.0F, 4, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 9.2941F, 4.7099F);
		RK3PGrip.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.5236F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 15, 39, -2.0F, -0.3F, -0.125F, 4, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 26, -2.0F, -0.3F, -0.825F, 4, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.5F, -0.5F);
		RK3PGrip.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.3054F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 14, 44, -2.0F, 3.5F, 1.625F, 4, 6, 2, -0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 156, 118, -2.0F, 0.4F, -3.5F, 4, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		RK3PGrip.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2182F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 50, 99, -2.0F, 2.0F, -3.0F, 4, 9, 5, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.55F, 3.5F, -2.5F);
		RK3PGrip.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 132, 90, -2.0F, 3.55F, 2.0F, 3, 4, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.55F, 3.5F, -2.5F);
		RK3PGrip.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.6109F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 117, 124, -2.0F, 0.7F, 1.8F, 3, 2, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 10, -2.55F, -1.9F, -2.2F, 4, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 157, 113, -2.0F, -1.5F, -0.5F, 3, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RK3PGrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
