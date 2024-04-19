package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class QDLSuppressor extends ModelWithAttachments {
	private final ModelRenderer QDL_Suppressor;
	private final ModelRenderer cylinder;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cylinder2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cylinder3;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;

	public QDLSuppressor() {
		textureWidth = 150;
		textureHeight = 150;

		QDL_Suppressor = new ModelRenderer(this);
		QDL_Suppressor.setRotationPoint(1.925F, 2.2F, 18.9F);
		

		cylinder = new ModelRenderer(this);
		cylinder.setRotationPoint(-0.4828F, 0.3422F, 0.0F);
		QDL_Suppressor.addChild(cylinder);
		cylinder.cubeList.add(new ModelBox(cylinder, 0, 0, -1.7422F, -3.8422F, -1.0F, 2, 5, 2, 0.0F, false));
		cylinder.cubeList.add(new ModelBox(cylinder, 0, 0, -0.9422F, 1.1578F, -1.0F, 2, 2, 2, 0.0F, false));
		cylinder.cubeList.add(new ModelBox(cylinder, 0, 0, -0.9422F, -3.8422F, -1.0F, 2, 5, 2, 0.0F, false));
		cylinder.cubeList.add(new ModelBox(cylinder, 0, 0, -1.7422F, 1.1578F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.3422F, -0.3422F, 0.0F);
		cylinder.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 2.3562F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.4F, -3.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.6F, -3.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.4F, -1.5F, -1.0F, 2, 5, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -0.6F, -2.5F, -1.0F, 2, 6, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3422F, -0.3422F, 0.0F);
		cylinder.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5708F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.4F, -3.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.6F, -3.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.4F, -1.5F, -1.0F, 2, 5, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.6F, -1.5F, -1.0F, 2, 5, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.3422F, -0.3422F, 0.0F);
		cylinder.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.4F, -3.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.6F, -3.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.4F, 1.5F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -0.6F, 1.5F, -1.0F, 2, 2, 2, 0.0F, false));

		cylinder2 = new ModelRenderer(this);
		cylinder2.setRotationPoint(-0.3328F, -0.0578F, -18.5F);
		QDL_Suppressor.addChild(cylinder2);
		cylinder2.cubeList.add(new ModelBox(cylinder2, 0, 0, -1.85F, -4.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cylinder2.cubeList.add(new ModelBox(cylinder2, 0, 0, -2.15F, -4.0F, -16.5F, 1, 1, 34, 0.0F, false));
		cylinder2.cubeList.add(new ModelBox(cylinder2, 0, 0, 0.15F, 3.0F, -16.5F, 1, 1, 34, 0.0F, false));
		cylinder2.cubeList.add(new ModelBox(cylinder2, 0, 0, -2.15F, 3.0F, -16.5F, 3, 1, 34, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, 0.0F, 0.0F);
		cylinder2.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 2.3562F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.65F, 3.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.35F, -4.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.65F, -4.0F, -16.5F, 1, 1, 34, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, 0.65F, 3.0F, -16.5F, 1, 1, 34, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, 0.0F, 0.0F);
		cylinder2.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 1.5708F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.65F, 3.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.35F, -4.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.65F, -4.0F, -16.5F, 1, 1, 34, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 0.65F, 3.0F, -16.5F, 1, 1, 34, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, 0.0F, 0.0F);
		cylinder2.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.65F, 3.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.35F, -4.0F, -16.5F, 3, 1, 34, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.65F, -4.0F, -16.5F, 1, 1, 34, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, 0.65F, 3.0F, -16.5F, 1, 1, 34, 0.0F, false));

		cylinder3 = new ModelRenderer(this);
		cylinder3.setRotationPoint(-0.8328F, -0.0578F, -32.9F);
		QDL_Suppressor.addChild(cylinder3);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.8727F, 0.0F, 2.3562F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.65F, 3.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, 0.65F, 3.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.8727F, 0.0F, 2.3562F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.35F, -4.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, -1.65F, -4.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.8727F, 0.0F, 1.5708F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, -1.65F, 3.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 0, 0.65F, 3.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.8727F, 0.0F, 1.5708F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.35F, -4.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 0, -1.65F, -4.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.8727F, 0.0F, 0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -1.65F, 3.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.65F, 3.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.8727F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.35F, -4.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -1.65F, -4.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.8727F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -1.65F, 3.0F, -0.5F, 3, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, 0.65F, 3.0F, -0.5F, 1, 1, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
		cylinder3.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.8727F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.65F, -4.0F, -0.5F, 1, 1, 2, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 0, -1.35F, -4.0F, -0.5F, 3, 1, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.8F, -0.225F, -38.9625F);
		QDL_Suppressor.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -1.975F, -0.6375F, 7, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -1.975F, -1.6375F, 5, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -0.975F, -1.6375F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -0.975F, -1.6375F, 1, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -1.575F, -1.6375F, 3, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, 1.325F, -1.6375F, 5, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, 0.925F, -1.6375F, 3, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, 0.925F, 0.9625F, 7, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -1.675F, 0.9625F, 2, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.8F, -1.675F, 0.9625F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -1.575F, 0.9625F, 5, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.8F, -1.675F, 0.9625F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, -1.675F, 0.9625F, 2, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.8F, -1.675F, -1.6375F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.8F, -1.675F, -1.6375F, 1, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5F, 1.325F, -0.6375F, 7, 1, 5, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 1.825F, -1.1375F);
		bone.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.7418F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.95F, -0.5F, -1.975F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.55F, -3.8F, -1.975F, 1, 4, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.55F, -0.5F, -1.975F, 1, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 0, -2.95F, -3.8F, -1.975F, 1, 4, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(2.95F, -1.475F, -1.1375F);
		bone.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.7418F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.65F, -0.5F, -0.075F, 1, 4, 1, 0.0F, true));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.65F, 2.8F, -0.075F, 1, 1, 1, 0.0F, true));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.25F, -0.5F, -0.075F, 1, 4, 1, 0.0F, true));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.25F, 2.8F, -0.075F, 1, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		QDL_Suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
