package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
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
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public PKMMag() {
		textureWidth = 400;
		textureHeight = 400;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.5F, -4.0F, -30.0F);
		magazine.cubeList.add(new ModelBox(magazine, 122, 0, -11.0F, 3.8F, -9.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 13, 10.0F, 16.8F, 3.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 58, -11.0F, 19.8F, 3.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 0, -11.0F, 16.8F, 3.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 66, -11.0F, 15.8F, 3.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 64, -11.0F, -0.2F, 3.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 70, -11.0F, 0.8F, 3.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 62, -11.0F, 3.8F, 3.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 55, 0, 10.0F, 0.8F, 3.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 54, 30, -11.0F, 8.8F, 3.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 60, -11.0F, 7.8F, 3.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 58, -11.0F, 11.8F, 3.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 15, 16, 10.0F, 8.8F, 3.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 43, 10.0F, 16.8F, -9.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 62, -11.0F, 19.8F, -9.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 19, -11.0F, 16.8F, -9.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 60, -11.0F, 15.8F, -9.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 72, 10.0F, 8.8F, -9.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 66, -11.0F, 11.8F, -9.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 49, -11.0F, 8.8F, -9.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 72, 64, -11.0F, 7.8F, -9.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 77, 10.0F, 0.8F, -9.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 8, 77, -11.0F, 0.8F, -9.3F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 128, -11.0F, -0.2F, -9.3F, 22, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 79, 75, 15.4757F, 11.6414F, -3.0F, 1, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 55, 0, 15.4757F, 7.5414F, -5.0F, 1, 3, 5, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 122, 29, 15.4757F, 4.5414F, -6.0F, 1, 3, 7, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 54, 272, -16.0F, 3.8F, -9.0F, 32, 14, 13, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 270, 110, -11.0F, 17.8F, -9.0F, 22, 5, 13, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 33, 30, 1.0F, -1.6F, -8.0F, 3, 6, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 15, 30, 1.0F, -1.6F, -1.0F, 3, 6, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 34, 0, -4.0F, -1.6F, -8.0F, 3, 6, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 44, -4.0F, -1.6F, -1.0F, 3, 6, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 210, 191, -11.0F, -1.2F, -9.0F, 22, 6, 13, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 19.8F, -2.5F);
		magazine.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0908F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 233, 69, -8.8F, 8.3F, -6.5F, 3, 5, 13, -0.002F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 233, 93, -9.2F, 8.3F, -6.5F, 1, 5, 13, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 19.8F, -2.5F);
		magazine.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.5236F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 148, 212, -12.0F, 3.1F, -6.5F, 4, 5, 13, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 19.8F, -2.5F);
		magazine.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -1.0908F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 97, 5.7F, 12.3F, -6.5F, 1, 1, 13, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 170, 97, 6.2F, 7.3F, -6.5F, 3, 6, 13, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 19.8F, -2.5F);
		magazine.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.5236F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 33, 30, 8.0F, 2.1F, -6.5F, 4, 6, 13, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 1.8F, -2.5F);
		magazine.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.5236F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 10, 130, -12.0F, -8.1F, 5.5F, 4, 5, 1, -0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 98, 129, -12.0F, -8.1F, -6.5F, 4, 5, 1, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 1.8F, -14.5F);
		magazine.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.0908F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 51, 49, -9.2F, -13.3F, 5.5F, 3, 5, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 38, 70, -9.2F, -13.3F, 17.5F, 1, 5, 1, -0.002F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 234, 133, -8.8F, -13.3F, 5.5F, 3, 5, 13, -0.002F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-16.0F, 3.4F, -2.5F);
		magazine.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -1.8762F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 270, 248, 2.2235F, -0.2974F, -6.5F, 1, 1, 13, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 240, 273, -0.1765F, -0.2974F, -6.5F, 3, 1, 13, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-16.0F, 3.4F, -2.5F);
		magazine.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -1.309F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 193, 2.5966F, -1.9821F, -6.5F, 4, 1, 13, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 1.8F, -2.5F);
		magazine.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.0908F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 175, 189, 5.8F, -13.3F, -6.5F, 1, 6, 13, -0.002F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 209, 212, 6.2F, -13.3F, -6.5F, 3, 6, 13, -0.002F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 1.8F, -2.5F);
		magazine.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5236F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 0, 8.0F, -8.1F, -6.5F, 4, 6, 13, -0.002F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(16.4F, 4.3F, -2.5F);
		magazine.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 70, -0.7F, -0.1F, -6.5F, 1, 1, 13, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(15.9757F, 4.4414F, -2.5F);
		magazine.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 173, 8, -0.5F, 5.1F, 2.5F, 1, 1, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 15, 0, -0.5F, 2.6F, 5.1F, 1, 3, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-15.5F, 10.8F, -2.5F);
		magazine.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.5236F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 15, 16, -2.5F, -4.0F, -0.5F, 1, 5, 5, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-15.5F, 10.8F, -2.5F);
		magazine.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.1309F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 15, 0, -2.7F, -0.1F, -0.5F, 1, 5, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-15.5F, 10.8F, -2.5F);
		magazine.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8727F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -5.55F, 0.3F, -0.5F, 1, 5, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
