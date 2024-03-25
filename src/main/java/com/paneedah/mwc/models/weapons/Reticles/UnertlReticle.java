package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UnertlReticle extends ModelBase {
	private final ModelRenderer reticle;

	public UnertlReticle() {
		textureWidth = 256;
		textureHeight = 256;

		reticle = new ModelRenderer(this);
		reticle.setRotationPoint(0.0F, 24.0F, 0.0F);
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 13.0F, -94.5F, 0.0F, 80, 2, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -80.0F, 0.0F, 2, 80, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, 0.0F, -105.0F, 0.0F, 1, 25, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -12.0F, -94.0F, 0.0F, 25, 1, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -0.5F, -185.0F, 0.0F, 2, 80, 0, 0.0F, true));
		reticle.cubeList.add(new ModelBox(reticle, 0, 0, -92.0F, -94.5F, 0.0F, 80, 2, 0, 0.0F, true));
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