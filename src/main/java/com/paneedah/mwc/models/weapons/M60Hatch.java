package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Hatch extends ModelWithAttachments {
	private final ModelRenderer hatch;
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
	private final ModelRenderer cube_r16;

	public M60Hatch() {
		textureWidth = 850;
		textureHeight = 850;

		hatch = new ModelRenderer(this);
		hatch.setRotationPoint(-1.0F, -24.0F, -20.0F);
		hatch.cubeList.add(new ModelBox(hatch, 17, 92, -1.5F, -1.0F, 0.0F, 3, 2, 3, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 51, 144, -2.5F, -1.0F, 21.0F, 5, 2, 3, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 51, 139, -2.5F, 0.3F, 33.0F, 5, 2, 3, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 0, 119, -2.5F, 0.3F, 33.0F, 5, 2, 3, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 74, -3.0F, 2.0F, 16.0F, 1, 3, 20, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 0, 125, -2.0F, 2.0F, 16.0F, 2, 3, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 128, 97, -2.5F, 0.3F, 36.0F, 5, 2, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 51, 28, -2.025F, 1.3F, 37.0F, 4, 1, 19, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 66, 0, -3.0F, 2.0F, 56.0F, 1, 3, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 124, -3.0F, 4.0F, 37.0F, 1, 1, 19, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 36, 191, -2.8F, 2.9F, 37.4F, 1, 1, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 191, 33, -2.8F, 2.9F, 48.0F, 1, 1, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 20, 191, 1.8F, 2.9F, 37.4F, 1, 1, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 32, 191, 1.8F, 2.9F, 48.0F, 1, 1, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 104, 2.0F, 4.0F, 37.0F, 1, 1, 19, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 120, -2.5F, 0.3F, 56.0F, 5, 2, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 66, 9, 2.0F, 2.0F, 56.0F, 1, 3, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 0, -2.7F, 2.0F, 36.0F, 1, 3, 20, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 51, 1.6F, 2.0F, 36.0F, 1, 3, 20, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 104, 23, 1.7F, 2.0F, 36.0F, 1, 3, 20, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 23, 70, -3.0F, 2.0F, 36.0F, 1, 3, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 66, 51, 2.0F, 2.0F, 36.0F, 1, 3, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 42, 14, 2.0F, 2.0F, 34.0F, 1, 3, 2, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 0, 103, -3.0F, 0.7F, 3.05F, 1, 1, 21, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 0, 70, -3.0F, 1.7F, 3.05F, 1, 1, 21, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 347, 0, -2.5F, -1.0F, 3.0F, 11, 2, 18, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 155, 80, 6.9F, 0.0F, 3.0F, 1, 2, 16, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 60, 51, -1.1F, -0.2F, 11.5F, 1, 2, 4, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 9, 83, -1.1F, -0.2F, 5.8F, 1, 2, 5, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 82, 119, -0.1F, -0.6F, 14.0F, 5, 2, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 118, 46, -0.1F, -0.6F, 9.5F, 5, 2, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 116, 97, -0.1F, -0.6F, 6.0F, 5, 2, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 51, 119, -0.1F, -0.6F, 12.0F, 5, 2, 1, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 0, 78, -1.5F, -1.6F, 10.0F, 7, 2, 3, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 88, 138, -0.35F, -1.6F, 13.0F, 2, 2, 5, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 0, 154, 7.5F, 0.5F, 3.0F, 1, 1, 18, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 51, 51, 7.5F, 1.5F, 19.0F, 1, 4, 2, 0.0F, false));
		hatch.cubeList.add(new ModelBox(hatch, 51, 0, 7.5F, 1.5F, 18.7F, 1, 4, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.5F, -0.3082F, 29.2547F);
		hatch.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.1252F, 0.0382F, 0.2943F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 155, 185, 0.0F, 0.7914F, -5.3695F, 1, 1, 10, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 104, 186, 0.0F, -0.0086F, -5.3695F, 1, 1, 10, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.5F, -0.3082F, 29.2547F);
		hatch.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1309F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 155, 36, 0.0F, -0.0086F, -5.3695F, 5, 2, 11, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(8.5F, 3.5F, 21.0F);
		hatch.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.3752F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 103, -1.0F, -3.5F, 0.0F, 1, 2, 5, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 155, 137, -1.0F, -1.5F, 0.0F, 1, 1, 15, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 155, 155, -1.0F, -1.0F, 0.0F, 1, 3, 15, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.2948F, 2.0F, 26.6954F);
		hatch.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2086F, -0.3143F, 0.6004F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 88, 164, -4.3356F, 0.0F, 0.8927F, 2, 1, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 51, 184, -3.0356F, 0.0F, 0.8927F, 3, 1, 9, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 149, 193, -5.0356F, 0.0F, 0.1927F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 92, -5.0356F, 0.0F, -6.1073F, 5, 1, 7, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(8.5F, 0.0F, 21.0F);
		hatch.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.3752F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 92, -6.0F, -1.0F, 0.0F, 6, 3, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.65F, -1.6F, 18.0F);
		hatch.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6545F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 79, 154, -1.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.5F, -1.6F, 11.5F);
		hatch.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.6545F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 185, 159, 0.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.5F, -1.6F, 11.5F);
		hatch.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.6545F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 186, 51, -1.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(2.9F, 0.4F, 10.0F);
		hatch.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.7854F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 165, 166, 1.0F, -1.0F, 0.7F, 1, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(4.9F, 1.0F, 13.5F);
		hatch.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.3054F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 114, 132, 1.2F, -1.6F, -1.5F, 1, 2, 3, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 145, 0.0F, -1.6F, -7.5F, 2, 2, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 60, 0, 1.2F, -1.6F, -7.5F, 1, 2, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 51, 164, 0.0F, -1.6F, -1.5F, 2, 2, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(2.5F, 0.3F, 37.5F);
		hatch.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3054F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 140, 193, -1.0F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 193, 136, -1.0F, 0.8F, 18.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 193, 116, -1.0F, 0.0F, 18.5F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 193, 138, -1.0F, 0.8F, -1.5F, 1, 1, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.5F, 0.3F, 57.5F);
		hatch.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3054F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 193, 113, 0.0F, 0.8F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 193, 111, 0.0F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 193, 142, 0.0F, 0.8F, -21.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 193, 140, 0.0F, 0.0F, -21.5F, 1, 1, 1, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 186, 55, 0.0F, 0.8F, -24.5F, 1, 1, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 186, 0.0F, 0.0F, -24.5F, 1, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.025F, 1.3F, 46.5F);
		hatch.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 125, -1.0F, 0.0F, -9.5F, 1, 1, 19, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.025F, 1.3F, 46.5F);
		hatch.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 51, 131, 0.0F, 0.0F, -9.5F, 1, 1, 19, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.5F, -1.0F, 22.5F);
		hatch.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.288F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, 0.0F, 0.8F, -19.5F, 2, 1, 21, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 255, 104, 0.0F, 0.0F, -19.5F, 5, 1, 21, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-0.5F, 2.7F, 24.0F);
		hatch.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1309F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 25, 0, -2.5F, -2.0F, -0.2F, 1, 3, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hatch.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}