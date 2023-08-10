package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M82Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
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

	public M82Mag() {
		textureWidth = 410;
		textureHeight = 410;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.5F, 5.0F, -31.0F);
		mag.cubeList.add(new ModelBox(mag, 26, 0, -4.0F, -12.0F, 0.0F, 4, 12, 4, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 43, 84, -4.15F, -11.8F, 1.0F, 1, 12, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 37, 84, -0.85F, -11.8F, 1.0F, 1, 12, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 42, 0, -0.85F, -11.9F, 10.5F, 1, 14, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 52, -4.15F, -11.9F, 10.5F, 1, 14, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -4.0F, -12.0F, 9.0F, 4, 13, 6, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 25, -3.5F, -12.0F, 4.0F, 3, 12, 5, 0.002F, false));
		mag.cubeList.add(new ModelBox(mag, 52, 52, -4.0F, 0.8F, 9.0F, 4, 1, 6, -0.001F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 42, -4.0F, 1.7F, 13.0F, 4, 1, 2, -0.002F, false));
		mag.cubeList.add(new ModelBox(mag, 66, 77, -3.5F, -12.0F, -0.25F, 3, 12, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, 0.2F, 4.3F);
		mag.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2269F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 59, 15, -3.0F, -2.0F, 0.0F, 3, 2, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.0F, 1.0F, 9.0F);
		mag.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.2618F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 60, 0.0F, -13.0F, -2.0F, 1, 13, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 1.0F, 9.0F);
		mag.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.2618F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 75, 32, -1.0F, -13.0F, -2.0F, 1, 13, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.0F, -12.0F, 9.0F);
		mag.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.5061F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 68, 25, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.002F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.0F, -12.0F, 9.0F);
		mag.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1376F, -0.2448F, 0.4986F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 38, 0, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -12.0F, 9.0F);
		mag.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.1376F, 0.2448F, -0.4986F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 52, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, -12.0F, 9.0F);
		mag.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.5061F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 35, 77, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.002F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.0F, 0.0F, 4.0F);
		mag.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.2269F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 59, 0.0F, -12.0F, 0.0F, 1, 12, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 42, 17, 0.0F, -0.5F, 0.0F, 1, 1, 3, 0.002F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.5F, 4.0F);
		mag.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.2269F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 25, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.002F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 60, -1.0F, -12.5F, 0.0F, 1, 12, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.2094F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 77, -4.0F, -1.0F, 0.0F, 4, 1, 15, 0.002F, false));
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