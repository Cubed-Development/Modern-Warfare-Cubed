package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Shotgun12Gauge2 extends ModelBase {
	private final ModelRenderer bone;

	public Shotgun12Gauge2() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 18, 0, -0.4F, -20.5F, 0.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -29.0F, 0.0F, 3, 9, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 16, 0.5F, -29.0F, -0.2F, 2, 9, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 0, 0.5F, -29.0F, 2.2F, 2, 9, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 12, -0.2F, -29.0F, 0.5F, 1, 9, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 10, 10, 2.2F, -29.0F, 0.5F, 1, 9, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 11, 0.0F, -20.5F, -0.4F, 3, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 16, 8, 0.0F, -20.5F, 1.4F, 3, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 4, 2.4F, -20.5F, 0.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}