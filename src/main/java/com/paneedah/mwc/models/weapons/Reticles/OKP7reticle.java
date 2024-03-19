package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OKP7reticle extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer gun4_r1;

	public OKP7reticle() {
		textureWidth = 128;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -34.0F, 0.0F, 5, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.0F, -34.0F, 0.0F, 5, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -31.0F, 0.0F, 1, 2, 0, 0.0F, true));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-24.0416F, -9.9584F, 0.0F);
		bone.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.0F, 0.0F, 0.7854F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 0, 0.0F, -34.0F, 0.0F, 4, 1, 0, 0.0F, true));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 0, 0.0F, -34.0F, 0.0F, 1, 4, 0, 0.0F, true));
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