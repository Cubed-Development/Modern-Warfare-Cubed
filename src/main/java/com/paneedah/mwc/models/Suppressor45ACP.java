package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Suppressor45ACP extends ModelBase {
	private final ModelRenderer suppressor;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun9_r1;

	public Suppressor45ACP() {
		textureWidth = 256;
		textureHeight = 128;

		suppressor = new ModelRenderer(this);
		suppressor.setRotationPoint(20.0017F, 11.4369F, 0.0F);
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -20.0017F, -11.4369F, -2.0F, 2, 3, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -18.5017F, -10.4369F, -2.0F, 1, 2, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -20.5017F, -10.4369F, -2.0F, 1, 2, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -20.0017F, -8.4369F, -2.0F, 2, 1, 22, 0.0F, true));
		suppressor.cubeList.add(new ModelBox(suppressor, 0, 0, -20.5017F, -8.7369F, -2.0F, 3, 1, 22, 0.0F, true));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		suppressor.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.0F, 0.0F, -1.0782F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 0, -0.5F, -23.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-31.1551F, 9.814F, 0.0F);
		suppressor.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.0F, 0.0F, 0.4833F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 0, 0.0F, -24.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-40.094F, -1.8487F, 0.0F);
		suppressor.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.0F, 0.0F, 1.0782F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 0, 2.0F, -24.0F, -2.0F, 1, 1, 22, 0.0F, true));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-25.5751F, -32.118F, 0.0F);
		suppressor.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.0F, 0.0F, 2.6769F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 0, 2.5F, -23.0F, -2.0F, 1, 1, 22, 0.0F, true));
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