package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HP2 extends ModelBase {
	private final ModelRenderer reticle;

	public HP2() {
		textureWidth = 128;
		textureHeight = 64;

		reticle = new ModelRenderer(this);
		reticle.setRotationPoint(0.0F, 24.0F, 0.0F);
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -5.5F, -34.0F, 0.0F, 12, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 0.0F, -39.5F, 0.0F, 1, 12, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 20, 0.0F, -27.5F, 0.0F, 1, 5, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 20, 0.0F, -59.5F, 0.0F, 1, 20, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 20, 6.5F, -34.0F, 0.0F, 22, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 20, -27.5F, -34.0F, 0.0F, 22, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 20, 0.0F, -22.5F, 0.0F, 1, 15, 0, 0.0F, true));
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