package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Shell extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer Shell40_r1;
	private final ModelRenderer Shell39_r1;
	private final ModelRenderer Shell38_r1;
	private final ModelRenderer Shell37_r1;
	private final ModelRenderer Shell36_r1;
	private final ModelRenderer Shell35_r1;
	private final ModelRenderer Shell34_r1;
	private final ModelRenderer Shell33_r1;
	private final ModelRenderer Shell32_r1;
	private final ModelRenderer Shell31_r1;
	private final ModelRenderer Shell30_r1;
	private final ModelRenderer Shell25_r1;
	private final ModelRenderer Shell24_r1;
	private final ModelRenderer Shell23_r1;
	private final ModelRenderer Shell22_r1;
	private final ModelRenderer Shell21_r1;
	private final ModelRenderer Shell20_r1;
	private final ModelRenderer Shell18_r1;
	private final ModelRenderer Shell16_r1;
	private final ModelRenderer Shell41_r1;

	public Shell() {
		textureWidth = 256;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -27.3249F, -25.0581F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, 18.3249F, 25.0581F, 1, 12, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.0F, 18.3249F, 25.0581F, 1, 12, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, 18.3249F, 23.5581F, 1, 12, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, 18.3249F, 26.5581F, 1, 12, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, 30.8249F, 23.5581F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.0F, 30.8249F, 25.0581F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, 30.8249F, 25.0581F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, 30.8249F, 26.5581F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, 16.3249F, 25.0581F, 1, 15, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, 16.3249F, 26.0581F, 1, 15, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, 16.3249F, 24.0581F, 1, 15, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.5F, 16.3249F, 25.0581F, 1, 15, 1, 0.0F, true));

		Shell40_r1 = new ModelRenderer(this);
		Shell40_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Shell40_r1);
		setRotationAngle(Shell40_r1, -2.082F, 0.0F, 0.0F);
		Shell40_r1.cubeList.add(new ModelBox(Shell40_r1, 0, 0, 1.5F, -33.0F, 2.5F, 1, 1, 1, 0.0F, true));

		Shell39_r1 = new ModelRenderer(this);
		Shell39_r1.setRotationPoint(15.3359F, 47.545F, 25.0581F);
		bone.addChild(Shell39_r1);
		setRotationAngle(Shell39_r1, 0.0F, 0.0F, -0.4833F);
		Shell39_r1.cubeList.add(new ModelBox(Shell39_r1, 0, 0, 0.0F, -33.0F, 0.0F, 1, 1, 1, 0.0F, true));

		Shell38_r1 = new ModelRenderer(this);
		Shell38_r1.setRotationPoint(0.0F, 46.8479F, 40.2221F);
		bone.addChild(Shell38_r1);
		setRotationAngle(Shell38_r1, 0.4833F, 0.0F, 0.0F);
		Shell38_r1.cubeList.add(new ModelBox(Shell38_r1, 0, 0, 1.5F, -33.0F, -1.5F, 1, 1, 1, 0.0F, true));

		Shell37_r1 = new ModelRenderer(this);
		Shell37_r1.setRotationPoint(0.1448F, 51.3249F, 25.41F);
		bone.addChild(Shell37_r1);
		setRotationAngle(Shell37_r1, 0.0F, 0.7808F, 0.0F);
		Shell37_r1.cubeList.add(new ModelBox(Shell37_r1, 0, 0, 0.5F, -35.0F, 0.0F, 1, 15, 1, 0.0F, true));

		Shell36_r1 = new ModelRenderer(this);
		Shell36_r1.setRotationPoint(-0.2694F, 51.3249F, 23.7127F);
		bone.addChild(Shell36_r1);
		setRotationAngle(Shell36_r1, 0.0F, -0.7808F, 0.0F);
		Shell36_r1.cubeList.add(new ModelBox(Shell36_r1, 0, 0, 1.5F, -35.0F, -1.0F, 1, 15, 1, 0.0F, true));

		Shell35_r1 = new ModelRenderer(this);
		Shell35_r1.setRotationPoint(0.0202F, 51.3249F, 23.0089F);
		bone.addChild(Shell35_r1);
		setRotationAngle(Shell35_r1, 0.0F, -0.7808F, 0.0F);
		Shell35_r1.cubeList.add(new ModelBox(Shell35_r1, 0, 0, 2.5F, -35.0F, -1.0F, 1, 15, 1, 0.0F, true));

		Shell34_r1 = new ModelRenderer(this);
		Shell34_r1.setRotationPoint(5.9401F, 51.3249F, 22.5489F);
		bone.addChild(Shell34_r1);
		setRotationAngle(Shell34_r1, -3.1416F, -0.7993F, 3.1416F);
		Shell34_r1.cubeList.add(new ModelBox(Shell34_r1, 0, 0, 3.5F, -35.0F, 0.0F, 1, 15, 1, 0.0F, true));

		Shell33_r1 = new ModelRenderer(this);
		Shell33_r1.setRotationPoint(6.5875F, 51.3249F, 24.13F);
		bone.addChild(Shell33_r1);
		setRotationAngle(Shell33_r1, -3.1416F, -0.8365F, 3.1416F);
		Shell33_r1.cubeList.add(new ModelBox(Shell33_r1, 0, 0, 3.5F, -35.0F, 1.0F, 1, 15, 1, 0.0F, true));

		Shell32_r1 = new ModelRenderer(this);
		Shell32_r1.setRotationPoint(2.8092F, 51.3249F, 30.2447F);
		bone.addChild(Shell32_r1);
		setRotationAngle(Shell32_r1, -3.1416F, 0.7993F, 3.1416F);
		Shell32_r1.cubeList.add(new ModelBox(Shell32_r1, 0, 0, 2.5F, -35.0F, 2.0F, 1, 15, 1, 0.0F, true));

		Shell31_r1 = new ModelRenderer(this);
		Shell31_r1.setRotationPoint(1.204F, 51.3249F, 29.5405F);
		bone.addChild(Shell31_r1);
		setRotationAngle(Shell31_r1, -3.1416F, 0.7622F, 3.1416F);
		Shell31_r1.cubeList.add(new ModelBox(Shell31_r1, 0, 0, 1.5F, -35.0F, 2.0F, 1, 15, 1, 0.0F, true));

		Shell30_r1 = new ModelRenderer(this);
		Shell30_r1.setRotationPoint(-0.5716F, 51.3249F, 25.7392F);
		bone.addChild(Shell30_r1);
		setRotationAngle(Shell30_r1, 0.0F, 0.8179F, 0.0F);
		Shell30_r1.cubeList.add(new ModelBox(Shell30_r1, 0, 0, 0.5F, -35.0F, 1.0F, 1, 15, 1, 0.0F, true));

		Shell25_r1 = new ModelRenderer(this);
		Shell25_r1.setRotationPoint(0.0F, 51.3249F, 25.0581F);
		bone.addChild(Shell25_r1);
		setRotationAngle(Shell25_r1, 0.0F, 1.041F, 0.0F);
		Shell25_r1.cubeList.add(new ModelBox(Shell25_r1, 0, 0, 0.0F, -20.5F, 0.0F, 1, 1, 2, 0.0F, true));
		Shell25_r1.cubeList.add(new ModelBox(Shell25_r1, 0, 0, 0.0F, -33.0F, 0.0F, 1, 12, 1, 0.0F, true));

		Shell24_r1 = new ModelRenderer(this);
		Shell24_r1.setRotationPoint(-0.531F, 51.3249F, 22.9458F);
		bone.addChild(Shell24_r1);
		setRotationAngle(Shell24_r1, 0.0F, -1.0782F, 0.0F);
		Shell24_r1.cubeList.add(new ModelBox(Shell24_r1, 0, 0, 1.5F, -20.5F, -1.5F, 2, 1, 1, 0.0F, true));
		Shell24_r1.cubeList.add(new ModelBox(Shell24_r1, 0, 0, 1.5F, -33.0F, -1.5F, 1, 12, 1, 0.0F, true));

		Shell23_r1 = new ModelRenderer(this);
		Shell23_r1.setRotationPoint(-0.4112F, 51.3249F, 23.3994F);
		bone.addChild(Shell23_r1);
		setRotationAngle(Shell23_r1, 0.0F, -0.5949F, 0.0F);
		Shell23_r1.cubeList.add(new ModelBox(Shell23_r1, 0, 0, 2.5F, -20.5F, -1.5F, 1, 1, 3, 0.0F, true));
		Shell23_r1.cubeList.add(new ModelBox(Shell23_r1, 0, 0, 2.5F, -33.0F, -1.5F, 1, 12, 1, 0.0F, true));

		Shell22_r1 = new ModelRenderer(this);
		Shell22_r1.setRotationPoint(7.354F, 51.3249F, 22.8785F);
		bone.addChild(Shell22_r1);
		setRotationAngle(Shell22_r1, -3.1416F, -0.5763F, 3.1416F);
		Shell22_r1.cubeList.add(new ModelBox(Shell22_r1, 0, 0, 4.0F, -20.5F, 0.0F, 3, 1, 1, 0.0F, true));
		Shell22_r1.cubeList.add(new ModelBox(Shell22_r1, 0, 0, 4.0F, -33.0F, 0.0F, 1, 12, 1, 0.0F, true));

		Shell21_r1 = new ModelRenderer(this);
		Shell21_r1.setRotationPoint(7.0441F, 51.3249F, 23.2771F);
		bone.addChild(Shell21_r1);
		setRotationAngle(Shell21_r1, -3.1416F, -0.9852F, 3.1416F);
		Shell21_r1.cubeList.add(new ModelBox(Shell21_r1, 0, 0, 4.0F, -20.5F, 1.0F, 1, 1, 2, 0.0F, true));
		Shell21_r1.cubeList.add(new ModelBox(Shell21_r1, 0, 0, 4.0F, -33.0F, 1.0F, 1, 12, 1, 0.0F, true));

		Shell20_r1 = new ModelRenderer(this);
		Shell20_r1.setRotationPoint(1.7982F, 51.3249F, 31.0232F);
		bone.addChild(Shell20_r1);
		setRotationAngle(Shell20_r1, -3.1416F, 0.9852F, 3.1416F);
		Shell20_r1.cubeList.add(new ModelBox(Shell20_r1, 0, 0, 2.5F, -20.5F, 2.5F, 2, 1, 1, 0.0F, true));
		Shell20_r1.cubeList.add(new ModelBox(Shell20_r1, 0, 0, 2.5F, -33.0F, 2.5F, 1, 12, 1, 0.0F, true));

		Shell18_r1 = new ModelRenderer(this);
		Shell18_r1.setRotationPoint(-0.5604F, 51.3249F, 25.2298F);
		bone.addChild(Shell18_r1);
		setRotationAngle(Shell18_r1, 0.0F, 0.5949F, 0.0F);
		Shell18_r1.cubeList.add(new ModelBox(Shell18_r1, 0, 0, 0.0F, -20.5F, 1.0F, 2, 1, 1, 0.0F, true));
		Shell18_r1.cubeList.add(new ModelBox(Shell18_r1, 0, 0, 0.0F, -33.0F, 1.0F, 1, 12, 1, 0.0F, true));

		Shell16_r1 = new ModelRenderer(this);
		Shell16_r1.setRotationPoint(1.3955F, 51.3249F, 30.4717F);
		bone.addChild(Shell16_r1);
		setRotationAngle(Shell16_r1, -3.1416F, 0.5763F, 3.1416F);
		Shell16_r1.cubeList.add(new ModelBox(Shell16_r1, 0, 0, 1.5F, -20.5F, 2.5F, 1, 1, 2, 0.0F, true));
		Shell16_r1.cubeList.add(new ModelBox(Shell16_r1, 0, 0, 1.5F, -33.0F, 2.5F, 1, 12, 1, 0.0F, true));

		Shell41_r1 = new ModelRenderer(this);
		Shell41_r1.setRotationPoint(-23.1845F, -0.8062F, 25.0581F);
		bone.addChild(Shell41_r1);
		setRotationAngle(Shell41_r1, 0.0F, 0.0F, 2.0634F);
		Shell41_r1.cubeList.add(new ModelBox(Shell41_r1, 0, 0, 4.0F, -33.0F, 0.0F, 1, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}