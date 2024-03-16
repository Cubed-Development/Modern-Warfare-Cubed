package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Suppressor762x51 extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r1;

	public Suppressor762x51() {
		textureWidth = 256;
		textureHeight = 128;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(0.0F, 24.0F, 0.0F);
		suppressor.cubeList.add(new ModelBox(suppressor, 100, 0, -1.0F, -22.5F, 20.0F, 4, 1, 2, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -24.0F, -2.0F, 2, 3, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 2.0F, -23.0F, -2.0F, 1, 2, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -1.0F, -23.0F, -2.0F, 1, 2, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, 0.0F, -21.0F, -2.0F, 2, 1, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 100, 0, -0.5F, -23.5F, 20.0F, 3, 3, 2, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 100, 0, 0.5F, -24.0F, 20.0F, 1, 4, 2, 0.0F, true));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-16.8915F, -6.9508F, 0.0F);
		suppressor.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.0F, 0.0F, 0.7808F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 0, 0, 0.0F, -24.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-15.1919F, -39.9131F, 0.0F);
		suppressor.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.0F, 0.0F, 2.3794F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 0, 0, 0.4F, -23.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-13.8109F, -36.4664F, 0.0F);
		suppressor.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 0.0F, 0.0F, 2.3794F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 0, 0, 0.4F, -21.0F, 0.0F, 1, 1, 20, 0.0F, true));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 0, 0, 0.4F, -21.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-15.0616F, -6.1978F, 0.0F);
		suppressor.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.0F, 0.0F, 0.7808F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 0, 0.0F, -21.4F, -2.0F, 1, 1, 22, 0.0F, true));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-14.4824F, -7.6054F, 0.0F);
		suppressor.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.0F, 0.0F, 0.7808F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 0, 2.0F, -21.4F, -2.0F, 1, 1, 22, 0.0F, true));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-16.3123F, -8.3584F, 0.0F);
		suppressor.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.0F, 0.0F, 0.7808F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 0, 2.0F, -24.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-9.3302F, -38.2617F, 0.0F);
		suppressor.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.0F, 0.0F, 2.3794F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 0, 0, 3.0F, -21.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-10.7112F, -41.7084F, 0.0F);
		suppressor.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.0F, 0.0F, 2.3794F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 0, 3.0F, -23.0F, -2.0F, 1, 1, 22, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
