package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HeraArmsGrip extends ModelWithAttachments {
	private final ModelRenderer HeraArmsgrip;
	private final ModelRenderer grip14_r1;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip3_r1;

	public HeraArmsGrip() {
		textureWidth = 256;
		textureHeight = 128;

		HeraArmsgrip = new ModelRenderer(this);
		HeraArmsgrip.setRotationPoint(0.0F, 1.6195F, 13.6821F);
		HeraArmsgrip.cubeList.add(new ModelBox(HeraArmsgrip, 0, 0, -3.5F, 2.8805F, -9.4821F, 4, 1, 2, 0.0F, true));
		HeraArmsgrip.cubeList.add(new ModelBox(HeraArmsgrip, 0, 0, -3.5F, -8.6195F, -19.6821F, 4, 5, 5, 0.0F, true));
		HeraArmsgrip.cubeList.add(new ModelBox(HeraArmsgrip, 0, 0, -3.0F, -9.6195F, -15.1821F, 3, 5, 2, 0.0F, true));

		grip14_r1 = new ModelRenderer(this);
		grip14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		HeraArmsgrip.addChild(grip14_r1);
		setRotationAngle(grip14_r1, 2.1935F, 0.0F, 0.0F);
		grip14_r1.cubeList.add(new ModelBox(grip14_r1, 0, 0, -3.5F, -14.7F, 1.1F, 4, 7, 1, 0.0F, true));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(0.0F, 22.4703F, -14.8683F);
		HeraArmsgrip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, -0.0744F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 0, 0, -3.5F, -17.9F, -1.8F, 4, 3, 3, 0.0F, true));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(0.0F, 18.6061F, -4.6126F);
		HeraArmsgrip.addChild(grip12_r1);
		setRotationAngle(grip12_r1, 0.3718F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 0, 0, -3.6F, -25.5F, -4.5F, 1, 9, 4, 0.0F, true));
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 0, 0, -0.4F, -26.0F, -4.5F, 1, 12, 4, 0.0F, true));
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 0, 0, -3.5F, -26.5F, -5.5F, 4, 11, 4, 0.0F, true));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(0.0F, 7.9766F, -39.7611F);
		HeraArmsgrip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -1.0782F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 0, 0, -3.0F, -30.0F, -1.0F, 3, 1, 12, 0.0F, true));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(0.0F, 11.2349F, -0.2501F);
		HeraArmsgrip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.0782F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 0, 0, -3.5F, -16.8F, -2.6F, 4, 1, 1, 0.0F, true));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(0.0F, 20.2882F, -7.7567F);
		HeraArmsgrip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.3718F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 0, 0, -3.5F, -16.8F, -2.6F, 4, 2, 1, 0.0F, true));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(0.0F, 8.8987F, -39.2012F);
		HeraArmsgrip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, -1.041F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 0, 0, -3.5F, -29.0F, -1.2F, 4, 3, 13, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HeraArmsgrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}