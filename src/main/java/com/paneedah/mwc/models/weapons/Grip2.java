package com.paneedah.mwc.models.weapons;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Grip2 extends ModelBase {
	private final ModelRenderer grip;

	public Grip2() {
		textureWidth = 35;
		textureHeight = 35;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 14, 0, -0.5F, -19.5F, -2.5F, 3, 2, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -1.0F, -30.5F, -4.0F, 4, 2, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 26, 2.0F, -30.5F, 2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 14, 26, -1.0F, -30.5F, 2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 20, -0.5F, -30.0F, 2.0F, 3, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 13, -0.5F, -30.5F, -4.5F, 3, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 8, 0.0F, -28.5F, -2.5F, 2, 8, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 15, -0.5F, -21.5F, -2.5F, 3, 2, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 20, 9, -0.5F, -22.7F, -2.5F, 3, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 7, 18, -0.5F, -24.0F, -2.5F, 3, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 13, -0.8F, -24.0F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 26, 1.8F, -24.0F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 10, 25, 1.8F, -22.7F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 4, 25, -0.8F, -22.7F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 19, 1.8F, -21.5F, -2.0F, 1, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -0.8F, -21.5F, -2.0F, 1, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 22, 23, 1.8F, -25.5F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 23, -0.8F, -25.5F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 27, 5, 0.0F, -25.5F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 24, 26, 0.0F, -25.5F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 22, 0.0F, -24.0F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 16, 0.0F, -22.7F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 3, 0.0F, -22.7F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 16, 23, 0.0F, -21.5F, -2.8F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 23, 0, 0.0F, -21.5F, -0.2F, 2, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 25, 20, 0.0F, -24.0F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 10, 22, 1.8F, -29.0F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 4, 22, -0.8F, -29.0F, -2.0F, 1, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 4, 19, 0.0F, -29.0F, -0.2F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 4, 0.0F, -29.0F, -2.8F, 2, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 10, 8, -0.5F, -28.5F, -2.0F, 3, 8, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 18, 5, -0.5F, -25.5F, -2.5F, 3, 1, 3, 0.0F, false));
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