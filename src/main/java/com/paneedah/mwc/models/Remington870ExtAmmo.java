package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington870ExtAmmo extends ModelWithAttachments {
	private final ModelRenderer extended_magazine;
	private final ModelRenderer magazine25_r1;
	private final ModelRenderer magazine23_r1;
	private final ModelRenderer magazine21_r1;
	private final ModelRenderer magazine20_r1;
	private final ModelRenderer magazine18_r1;
	private final ModelRenderer magazine17_r1;
	private final ModelRenderer magazine16_r1;
	private final ModelRenderer magazine15_r1;
	private final ModelRenderer magazine10_r1;
	private final ModelRenderer magazine8_r1;
	private final ModelRenderer magazine6_r1;
	private final ModelRenderer magazine5_r1;

	public Remington870ExtAmmo() {
		textureWidth = 410;
		textureHeight = 410;

		extended_magazine = new ModelRenderer(this);
		extended_magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 57, 258, -2.5F, -26.6F, -54.0F, 3, 1, 13, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 84, 115, -1.2F, -27.3F, -54.0F, 1, 2, 13, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 27, 114, -1.8F, -27.3F, -54.0F, 1, 2, 13, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 171, 70, -1.5F, -25.4F, -54.0F, 1, 1, 13, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 0, 83, -2.7F, -27.0F, -56.0F, 1, 2, 2, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 79, 26, -0.3F, -27.0F, -56.0F, 1, 2, 2, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 114, 108, -2.0F, -27.5F, -56.0F, 2, 2, 2, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 114, 87, -2.0F, -26.2F, -56.0F, 2, 2, 2, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 95, 71, -1.5F, -28.5F, -56.0F, 1, 1, 2, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 22, 32, -1.2F, -26.9F, -58.0F, 1, 2, 1, 0.0F, false));
		extended_magazine.cubeList.add(new ModelBox(extended_magazine, 14, 32, -1.8F, -26.9F, -58.0F, 1, 2, 1, 0.0F, false));

		magazine25_r1 = new ModelRenderer(this);
		magazine25_r1.setRotationPoint(0.0F, -74.6045F, -21.2025F);
		extended_magazine.addChild(magazine25_r1);
		setRotationAngle(magazine25_r1, 1.3756F, 0.0F, 0.0F);
		magazine25_r1.cubeList.add(new ModelBox(magazine25_r1, 28, 32, -1.8F, -26.4F, -56.0F, 1, 2, 1, 0.0F, false));
		magazine25_r1.cubeList.add(new ModelBox(magazine25_r1, 0, 33, -1.2F, -26.4F, -56.0F, 1, 2, 1, 0.0F, false));

		magazine23_r1 = new ModelRenderer(this);
		magazine23_r1.setRotationPoint(0.0F, 32.8509F, -72.0185F);
		extended_magazine.addChild(magazine23_r1);
		setRotationAngle(magazine23_r1, -1.3756F, 0.0F, 0.0F);
		magazine23_r1.cubeList.add(new ModelBox(magazine23_r1, 34, 11, -1.2F, -27.4F, -56.0F, 1, 2, 1, 0.0F, false));
		magazine23_r1.cubeList.add(new ModelBox(magazine23_r1, 34, 16, -1.8F, -27.4F, -56.0F, 1, 2, 1, 0.0F, false));

		magazine21_r1 = new ModelRenderer(this);
		magazine21_r1.setRotationPoint(-52.3896F, 0.0F, -37.5897F);
		extended_magazine.addChild(magazine21_r1);
		setRotationAngle(magazine21_r1, 0.0F, -1.2269F, 0.0F);
		magazine21_r1.cubeList.add(new ModelBox(magazine21_r1, 88, 44, -1.5F, -27.0F, -56.0F, 2, 2, 1, 0.0F, false));

		magazine20_r1 = new ModelRenderer(this);
		magazine20_r1.setRotationPoint(51.0639F, 0.0F, -39.4725F);
		extended_magazine.addChild(magazine20_r1);
		setRotationAngle(magazine20_r1, 0.0F, 1.2269F, 0.0F);
		magazine20_r1.cubeList.add(new ModelBox(magazine20_r1, 88, 48, -2.5F, -27.0F, -56.0F, 2, 2, 1, 0.0F, false));

		magazine18_r1 = new ModelRenderer(this);
		magazine18_r1.setRotationPoint(19.5273F, -42.564F, 0.0F);
		extended_magazine.addChild(magazine18_r1);
		setRotationAngle(magazine18_r1, 0.0F, 0.0F, -2.082F);
		magazine18_r1.cubeList.add(new ModelBox(magazine18_r1, 95, 74, -3.7F, -27.0F, -56.0F, 1, 1, 2, 0.0F, false));

		magazine17_r1 = new ModelRenderer(this);
		magazine17_r1.setRotationPoint(-22.5057F, -40.8197F, 0.0F);
		extended_magazine.addChild(magazine17_r1);
		setRotationAngle(magazine17_r1, 0.0F, 0.0F, 2.082F);
		magazine17_r1.cubeList.add(new ModelBox(magazine17_r1, 97, 14, 0.7F, -27.0F, -56.0F, 1, 1, 2, 0.0F, false));

		magazine16_r1 = new ModelRenderer(this);
		magazine16_r1.setRotationPoint(-16.1461F, -6.5149F, 0.0F);
		extended_magazine.addChild(magazine16_r1);
		setRotationAngle(magazine16_r1, 0.0F, 0.0F, 0.711F);
		magazine16_r1.cubeList.add(new ModelBox(magazine16_r1, 97, 17, -0.3F, -25.0F, -56.0F, 1, 1, 2, 0.0F, false));

		magazine15_r1 = new ModelRenderer(this);
		magazine15_r1.setRotationPoint(15.6613F, -7.82F, 0.0F);
		extended_magazine.addChild(magazine15_r1);
		setRotationAngle(magazine15_r1, 0.0F, 0.0F, -0.711F);
		magazine15_r1.cubeList.add(new ModelBox(magazine15_r1, 39, 97, -2.7F, -25.0F, -56.0F, 1, 1, 2, 0.0F, false));

		magazine10_r1 = new ModelRenderer(this);
		magazine10_r1.setRotationPoint(16.1015F, -7.835F, 0.0F);
		extended_magazine.addChild(magazine10_r1);
		setRotationAngle(magazine10_r1, 0.0F, 0.0F, -0.711F);
		magazine10_r1.cubeList.add(new ModelBox(magazine10_r1, 140, 140, -2.5F, -25.0F, -54.0F, 1, 1, 13, 0.0F, false));
		magazine10_r1.cubeList.add(new ModelBox(magazine10_r1, 141, 115, -2.5F, -25.6F, -54.0F, 1, 1, 13, 0.0F, false));

		magazine8_r1 = new ModelRenderer(this);
		magazine8_r1.setRotationPoint(-16.586F, -6.5296F, 0.0F);
		extended_magazine.addChild(magazine8_r1);
		setRotationAngle(magazine8_r1, 0.0F, 0.0F, 0.711F);
		magazine8_r1.cubeList.add(new ModelBox(magazine8_r1, 144, 0, -0.5F, -25.0F, -54.0F, 1, 1, 13, 0.0F, false));
		magazine8_r1.cubeList.add(new ModelBox(magazine8_r1, 144, 25, -0.5F, -25.6F, -54.0F, 1, 1, 13, 0.0F, false));

		magazine6_r1 = new ModelRenderer(this);
		magazine6_r1.setRotationPoint(-18.6626F, -8.1445F, 0.0F);
		extended_magazine.addChild(magazine6_r1);
		setRotationAngle(magazine6_r1, 0.0F, 0.0F, 0.7854F);
		magazine6_r1.cubeList.add(new ModelBox(magazine6_r1, 0, 170, -0.5F, -26.6F, -54.0F, 1, 1, 13, 0.0F, false));

		magazine5_r1 = new ModelRenderer(this);
		magazine5_r1.setRotationPoint(18.0768F, -9.5587F, 0.0F);
		extended_magazine.addChild(magazine5_r1);
		setRotationAngle(magazine5_r1, 0.0F, 0.0F, -0.7854F);
		magazine5_r1.cubeList.add(new ModelBox(magazine5_r1, 171, 56, -2.5F, -26.6F, -54.0F, 1, 1, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		extended_magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}