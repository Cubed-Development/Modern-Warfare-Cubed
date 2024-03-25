package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JPUreticle extends ModelBase {
	private final ModelRenderer reticle;

	public JPUreticle() {
		textureWidth = 128;
		textureHeight = 64;

		reticle = new ModelRenderer(this);
		reticle.setRotationPoint(0.0F, 24.0F, 0.0F);
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 0.0F, -103.0F, 0.0F, 1, 39, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 0.0F, -63.0F, 0.0F, 1, 39, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 1.0F, -64.0F, 0.0F, 39, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -39.0F, -64.0F, 0.0F, 40, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -3.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -7.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -11.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -15.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -19.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -94.0F, -64.5F, 0.0F, 55, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 39.0F, -64.5F, 0.0F, 55, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -158.0F, 0.0F, 2, 55, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -25.0F, 0.0F, 2, 55, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 3.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 7.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 11.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 15.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 19.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -67.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -71.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -75.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -79.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -83.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -61.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -57.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -53.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -49.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -45.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 23.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 27.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 31.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 35.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -87.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -91.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -95.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -99.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -23.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -27.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -31.0F, -65.0F, 0.0F, 1, 3, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -35.0F, -64.5F, 0.0F, 1, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -37.0F, 0.0F, 2, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -41.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -1.0F, -33.0F, 0.0F, 3, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -29.0F, 0.0F, 2, 1, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		reticle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}