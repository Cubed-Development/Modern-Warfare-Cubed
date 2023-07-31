package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinCycleBackLeft extends ModelWithAttachments {
  
	private final ModelRenderer cycler_back_left_FRONTSIGHT;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;

	public NinthSinCycleBackLeft() {
		textureWidth = 128;
		textureHeight = 128;

		cycler_back_left_FRONTSIGHT = new ModelRenderer(this);
		cycler_back_left_FRONTSIGHT.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-1.0F, -25.5F, -5.0F);
		cycler_back_left_FRONTSIGHT.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.0873F, 0.0F, 0.0F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 51, 98, 1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(1.0F, -25.5F, -5.0F);
		cycler_back_left_FRONTSIGHT.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.0681F, -0.0541F, -0.6981F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 74, 36, -1.0F, 1.0F, 0.0F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 94, 71, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cycler_back_left_FRONTSIGHT.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
