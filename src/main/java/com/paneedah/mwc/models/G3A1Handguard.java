package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3A1Handguard extends ModelWithAttachments {
	private final ModelRenderer handguard_a1;
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
	private final ModelRenderer cube_r17;

	public G3A1Handguard() {
		textureWidth = 300;
		textureHeight = 300;

		handguard_a1 = new ModelRenderer(this);
		handguard_a1.setRotationPoint(0.5F, -13.5F, -60.5F);
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 224, 45, -1.0F, 0.0F, 16.0F, 1, 1, 19, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 85, 223, -4.0F, 0.0F, 16.0F, 1, 1, 19, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 38, 56, -3.5F, 4.0F, 24.0F, 3, 1, 11, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 36, 109, -0.1F, 2.85F, 24.0F, 1, 1, 11, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 89, 21, 0.201F, 2.55F, 15.7F, 1, 1, 9, -0.3F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 13, 89, -5.201F, 2.55F, 15.7F, 1, 1, 9, -0.3F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 108, 82, -4.9F, 2.85F, 24.0F, 1, 1, 11, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 168, 222, 0.0F, 0.0F, 0.0F, 1, 3, 19, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.9F, 2.85F, 16.0F);
		handguard_a1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.0349F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 112, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 0, -0.3F, -0.3F, -16.3F, 1, 1, 16, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.9F, 2.85F, 16.0F);
		handguard_a1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0349F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 112, 18, -0.7F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 17, -0.699F, -0.3F, -16.3F, 1, 1, 16, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.3F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7418F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 91, -0.802F, -1.03F, -0.201F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 91, 4.398F, -1.03F, -0.201F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 91, -0.801F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 91, 4.399F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.9F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 107, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.901F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 91, 0.0F, 0.6F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.9F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 93, -0.999F, 0.6F, 0.0F, 1, 1, 11, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 70, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.25F, 5.0F, 24.0F);
		handguard_a1.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0489F, 0.0201F, 0.4014F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 62, -0.999F, -1.5F, -17.0F, 1, 1, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 55, -1.0F, -2.0F, -14.0F, 1, 1, 14, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 176, 62, -1.0F, -1.0F, -24.0F, 1, 1, 24, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.75F, 5.0F, 24.0F);
		handguard_a1.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0489F, -0.0201F, -0.4014F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 102, -0.001F, -1.5F, -17.0F, 1, 1, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 19, 0.0F, -2.0F, -14.0F, 1, 1, 14, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 79, 175, 0.0F, -1.0F, -24.0F, 1, 1, 24, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, 5.0F, 24.0F);
		handguard_a1.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 161, 174, -3.0F, -2.0F, -24.0F, 3, 2, 24, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0105F, -0.0332F, 0.3054F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.0F, -16.0F, 1, 3, 16, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0105F, 0.0332F, -0.3054F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, -1.0F, 0.0F, -16.0F, 1, 3, 16, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.65F, 0.15F, 28.0F);
		handguard_a1.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 37, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.25F, 0.35F, 28.0F);
		handguard_a1.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3054F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 19, -0.999F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 45, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.3054F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 223, -1.0F, 0.0F, 0.0F, 1, 3, 19, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.0349F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 72, 0.0F, 0.0F, -16.0F, 1, 1, 16, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0349F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 74, -1.0F, 0.0F, -16.0F, 1, 1, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard_a1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}