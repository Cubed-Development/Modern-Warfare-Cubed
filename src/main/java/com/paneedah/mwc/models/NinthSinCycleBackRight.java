package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinCycleBackRight extends ModelWithAttachments {

	private final ModelRenderer cycler_back_right_BACKGRIP;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;

	public NinthSinCycleBackRight() {
		textureWidth = 128;
		textureHeight = 128;

		cycler_back_right_BACKGRIP = new ModelRenderer(this);
		cycler_back_right_BACKGRIP.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-1.0F, -25.5F, -5.0F);
		cycler_back_right_BACKGRIP.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.0681F, 0.0541F, 0.6981F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 74, 29, 0.0F, 1.0F, 0.0F, 1, 1, 3, 0.0F, false));
		cube_r67.cubeList.add(new ModelBox(cube_r67, 95, 96, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-2.0F, -25.5F, -5.0F);
		cycler_back_right_BACKGRIP.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.0873F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 14, 75, 1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cycler_back_right_BACKGRIP.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
