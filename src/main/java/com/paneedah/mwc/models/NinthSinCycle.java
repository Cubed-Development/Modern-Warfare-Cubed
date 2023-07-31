package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinCycle extends ModelWithAttachments {
  
	private final ModelRenderer cycler_GUARD;
	private final ModelRenderer cube_r69;

	public NinthSinCycle() {
		textureWidth = 128;
		textureHeight = 128;

		cycler_GUARD = new ModelRenderer(this);
		cycler_GUARD.setRotationPoint(1.0F, 1.2F, -19.5F);
		

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-1.0F, 0.0F, 0.0F);
		cycler_GUARD.addChild(cube_r69);
		setRotationAngle(cube_r69, -1.3788F, 0.0F, 0.0F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 3, 54, -1.001F, -9.001F, 0.499F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 62, 54, 0.001F, -9.001F, 0.499F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 48, 52, -1.001F, -7.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 65, 10, 0.001F, -7.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 14, 37, -1.001F, -5.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 65, 40, 0.001F, -5.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 34, 37, -1.001F, -3.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 65, 42, 0.001F, -3.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 18, 61, -1.001F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 65, 55, 0.001F, -1.0F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 34, 27, -0.5F, -9.0F, 0.0F, 1, 9, 1, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 14, 75, -1.0F, -9.0F, 1.0F, 2, 9, 2, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 27, 0, -1.0F, -9.0F, 0.0F, 2, 9, 3, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		cycler_GUARD.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
