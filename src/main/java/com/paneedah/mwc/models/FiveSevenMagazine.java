package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FiveSevenMagazine extends ModelWithAttachments {
	private final QRenderer magazine;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;

	public FiveSevenMagazine() {
		textureWidth = 128;
		textureHeight = 128;

		magazine = new QRenderer(this);
		magazine.setRotationPoint(0.0F, 8.0F, 3.0F);
		magazine.cubeList.add(new ModelBox(magazine, 24, 36, -3.5F, -1.1F, -7.3F, 4, 1, 7, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 54, -3.0F, -1.2F, -0.4F, 3, 1, 1, -0.101F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(1.0F, 0.5F, -0.5F);
		magazine.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.0873F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 50, 64, -4.0F, -1.0F, -7.7F, 3, 1, 1, 0.001F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 86, 39, -4.5F, -1.0F, -7.0F, 4, 1, 7, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.5F, 0.5F, -0.5F);
		magazine.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.3491F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 60, 42, -3.5F, -0.9F, 0.7F, 3, 1, 1, -0.1F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 36, 64, -3.5F, -0.9F, -0.1F, 3, 1, 1, -0.1F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-2.25F, -1.1F, -0.3F);
		magazine.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2094F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 45, 0, -0.25F, -13.0F, -0.3F, 2, 14, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 23, 48, -0.75F, -13.0F, -5.5F, 3, 13, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 0, -1.0F, -13.0F, -5.0F, 3, 13, 5, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 0, 1.5F, -13.0F, -5.0F, 1, 13, 5, 0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
