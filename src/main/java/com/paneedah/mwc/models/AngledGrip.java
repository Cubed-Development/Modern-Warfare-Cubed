package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AngledGrip extends ModelBase {
	private final QRenderer grip;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4_r1;

	public AngledGrip() {
		textureWidth = 64;
		textureHeight = 64;

		grip = new QRenderer(this);
		grip.setRotationPoint(2.5F, -6.5F, 9.5F);
		setRotationAngle(grip, 0.0F, 3.1416F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 17, 12, 0.0F, 0.0F, 0.0F, 3, 1, 8, 0.004F, false));
		grip.cubeList.add(new ModelBox(grip, 16, 0, -0.5F, -0.5F, 0.0F, 4, 1, 8, 0.006F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 12, -0.5F, -1.5F, 8.9F, 4, 1, 9, 0.004F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, 0.0F, -1.5F, 7.9F, 3, 2, 10, 0.002F, false));
		grip.cubeList.add(new ModelBox(grip, 10, 22, -0.3F, -0.8F, 9.9F, 1, 1, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 31, 9, 2.3F, -0.8F, 11.9F, 1, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 28, 22, 0.0F, -1.5F, 0.0F, 1, 1, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 22, 2.0F, -1.5F, 0.0F, 1, 1, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 18, 21, 1.0F, -1.5F, 1.0F, 1, 1, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 22, 0.5F, 3.0F, 3.5F, 2, 1, 2, -0.002F, false));
		grip.cubeList.add(new ModelBox(grip, 31, 17, 0.0F, 3.5F, 3.4F, 3, 1, 2, -0.002F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 31, 0.5F, 0.5F, 6.5F, 2, 2, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 18, 0.0F, 5.0F, 3.9F, 3, 1, 1, -0.002F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 15, 0.0F, 0.5F, 16.9F, 3, 2, 1, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(0.5F, 4.5F, 4.5F);
		grip.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 2.1564F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 0, 0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.0F, 6.0F, 5.0F);
		grip.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 2.1564F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 16, 30, 0.0F, 0.0F, 0.0F, 3, 11, 2, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.5F, 1.0F, 1.0F);
		grip.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.5949F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 16, 0, 0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(0.0F, 1.0F, 0.5F);
		grip.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.5949F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 12, 0.0F, 0.0F, 0.0F, 3, 6, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.0F, 1.0F, 8.0F);
		grip.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 2.2679F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 17, 12, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-0.5F, 0.5F, 8.0F);
		grip.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 2.2679F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 31, 14, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
