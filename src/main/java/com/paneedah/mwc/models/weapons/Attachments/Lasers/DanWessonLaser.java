package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DanWessonLaser extends ModelBase {
	private final ModelRenderer DWessonLaser;
	private final ModelRenderer laser23_r1;
	private final ModelRenderer laser22_r1;
	private final ModelRenderer laser17_r1;
	private final ModelRenderer laser16_r1;
	private final ModelRenderer laser13_r1;
	private final ModelRenderer laser12_r1;
	private final ModelRenderer laser11_r1;
	private final ModelRenderer laser10_r1;
	private final ModelRenderer laser8_r1;

	public DanWessonLaser() {
		textureWidth = 256;
		textureHeight = 256;

		DWessonLaser = new ModelRenderer(this);
		DWessonLaser.setRotationPoint(0.0F, 24.0F, 0.0F);
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 0, 0.0F, -24.0F, 0.0F, 5, 5, 5, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 0, 1.0F, -24.5F, 0.0F, 3, 1, 5, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 0, 1.0F, -19.5F, 0.0F, 3, 1, 5, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 0, -0.5F, -23.0F, 0.0F, 1, 3, 5, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 0, 4.5F, -23.0F, 0.0F, 1, 3, 5, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 0.5F, -25.2F, 5.0F, 4, 7, 9, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, -1.0F, -23.0F, 5.0F, 7, 2, 11, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 1.0F, -21.5F, 13.5F, 3, 3, 4, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 0.5F, -25.2F, 14.0F, 4, 6, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 0.5F, -24.2F, 16.0F, 4, 4, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 0.0F, -23.2F, 15.5F, 5, 2, 3, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 1.0F, -24.5F, 16.0F, 3, 1, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 1.0F, -20.9F, 16.0F, 3, 1, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 2.8F, -21.5F, 5.5F, 3, 2, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, -0.8F, -21.5F, 5.5F, 3, 2, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, -0.8F, -21.5F, 11.5F, 3, 2, 2, 0.0F, true));
		DWessonLaser.cubeList.add(new ModelBox(DWessonLaser, 0, 50, 2.8F, -21.5F, 11.5F, 3, 2, 2, 0.0F, true));

		laser23_r1 = new ModelRenderer(this);
		laser23_r1.setRotationPoint(20.6591F, -15.4666F, 0.0F);
		DWessonLaser.addChild(laser23_r1);
		setRotationAngle(laser23_r1, 0.0F, 0.0F, -1.1897F);
		laser23_r1.cubeList.add(new ModelBox(laser23_r1, 0, 50, -0.1F, -23.0F, 5.5F, 3, 1, 4, 0.0F, true));

		laser22_r1 = new ModelRenderer(this);
		laser22_r1.setRotationPoint(-17.5188F, -20.108F, 0.0F);
		DWessonLaser.addChild(laser22_r1);
		setRotationAngle(laser22_r1, 0.0F, 0.0F, 1.1897F);
		laser22_r1.cubeList.add(new ModelBox(laser22_r1, 0, 50, 2.1F, -23.0F, 5.5F, 3, 1, 4, 0.0F, true));

		laser17_r1 = new ModelRenderer(this);
		laser17_r1.setRotationPoint(-13.0919F, -10.3934F, 0.0F);
		DWessonLaser.addChild(laser17_r1);
		setRotationAngle(laser17_r1, 0.0F, 0.0F, 0.7854F);
		laser17_r1.cubeList.add(new ModelBox(laser17_r1, 0, 50, 4.0F, -21.0F, 14.0F, 2, 2, 2, 0.0F, true));

		laser16_r1 = new ModelRenderer(this);
		laser16_r1.setRotationPoint(14.5563F, -6.8579F, 0.0F);
		DWessonLaser.addChild(laser16_r1);
		setRotationAngle(laser16_r1, 0.0F, 0.0F, -0.7854F);
		laser16_r1.cubeList.add(new ModelBox(laser16_r1, 0, 50, -1.0F, -21.0F, 14.0F, 2, 2, 2, 0.0F, true));

		laser13_r1 = new ModelRenderer(this);
		laser13_r1.setRotationPoint(20.0954F, -13.7813F, 0.0F);
		DWessonLaser.addChild(laser13_r1);
		setRotationAngle(laser13_r1, 0.0F, 0.0F, -1.1154F);
		laser13_r1.cubeList.add(new ModelBox(laser13_r1, 0, 50, 1.0F, -23.0F, 5.0F, 2, 2, 7, 0.0F, true));

		laser12_r1 = new ModelRenderer(this);
		laser12_r1.setRotationPoint(-17.2947F, -18.2716F, 0.0F);
		DWessonLaser.addChild(laser12_r1);
		setRotationAngle(laser12_r1, 0.0F, 0.0F, 1.1154F);
		laser12_r1.cubeList.add(new ModelBox(laser12_r1, 0, 50, 2.0F, -23.0F, 5.0F, 2, 3, 7, 0.0F, true));
		laser12_r1.cubeList.add(new ModelBox(laser12_r1, 0, 50, 4.0F, -23.0F, 5.0F, 2, 2, 11, 0.0F, true));

		laser11_r1 = new ModelRenderer(this);
		laser11_r1.setRotationPoint(22.2202F, -6.3745F, 0.0F);
		DWessonLaser.addChild(laser11_r1);
		setRotationAngle(laser11_r1, 0.0F, 0.0F, -1.1154F);
		laser11_r1.cubeList.add(new ModelBox(laser11_r1, 0, 50, 3.0F, -23.0F, 5.0F, 3, 2, 9, 0.0F, true));

		laser10_r1 = new ModelRenderer(this);
		laser10_r1.setRotationPoint(-19.4195F, -10.8649F, 0.0F);
		DWessonLaser.addChild(laser10_r1);
		setRotationAngle(laser10_r1, 0.0F, 0.0F, 1.1154F);
		laser10_r1.cubeList.add(new ModelBox(laser10_r1, 0, 50, -1.0F, -23.0F, 5.0F, 3, 2, 9, 0.0F, true));

		laser8_r1 = new ModelRenderer(this);
		laser8_r1.setRotationPoint(20.0954F, -13.7814F, 0.0F);
		DWessonLaser.addChild(laser8_r1);
		setRotationAngle(laser8_r1, 0.0F, 0.0F, -1.1154F);
		laser8_r1.cubeList.add(new ModelBox(laser8_r1, 0, 50, -1.0F, -23.0F, 5.0F, 2, 2, 11, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		DWessonLaser.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}