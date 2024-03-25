package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LPscope extends ModelBase {
	private final ModelRenderer bone;

	public LPscope() {
		textureWidth = 128;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -34.0F, 0.0F, 12, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -39.5F, 0.0F, 1, 12, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 0.0F, -27.5F, 0.0F, 1, 5, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 0.0F, -59.5F, 0.0F, 1, 20, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 6.5F, -34.0F, 0.0F, 22, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, -27.5F, -34.0F, 0.0F, 22, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 0.0F, -22.5F, 0.0F, 1, 15, 0, 0.0F, true));
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