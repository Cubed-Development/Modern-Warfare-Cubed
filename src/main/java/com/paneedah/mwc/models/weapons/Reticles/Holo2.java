package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Holo2 extends ModelBase {
	private final ModelRenderer holo;

	public Holo2() {
		textureWidth = 128;
		textureHeight = 64;

		holo = new ModelRenderer(this);
		holo.setRotationPoint(0.0F, 24.0F, 0.0F);
		holo.cubeList.add(new ModelBox(holo, 0, 0, 0.0F, -39.0F, 0.0F, 1, 2, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, 0.0F, -34.0F, 0.0F, 1, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -1.0F, -31.0F, 0.0F, 3, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -1.0F, -37.0F, 0.0F, 3, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -5.0F, -34.0F, 0.0F, 2, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, 3.0F, -35.0F, 0.0F, 1, 3, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -2.0F, -36.0F, 0.0F, 1, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, 2.0F, -36.0F, 0.0F, 1, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, 2.0F, -32.0F, 0.0F, 1, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -2.0F, -32.0F, 0.0F, 1, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, 4.0F, -34.0F, 0.0F, 2, 1, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -3.0F, -35.0F, 0.0F, 1, 3, 0, 0.0F, true));
		holo.cubeList.add(new ModelBox(holo, 0, 0, 0.0F, -30.0F, 0.0F, 1, 2, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		holo.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}