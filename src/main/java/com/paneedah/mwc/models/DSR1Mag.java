package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1Mag extends ModelWithAttachments {
	private final ModelRenderer magazine_actual;
	private final ModelRenderer cube_r136_r1;
	private final ModelRenderer cube_r135_r1;
	private final ModelRenderer cube_r134_r1;
	private final ModelRenderer cube_r133_r1;
	private final ModelRenderer cube_r132_r1;
	private final ModelRenderer cube_r131_r1;

	public DSR1Mag() {
		textureWidth = 400;
		textureHeight = 400;

		magazine_actual = new ModelRenderer(this);
		magazine_actual.setRotationPoint(0.0F, -3.0F, 7.1F);
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 0, 92, -1.2F, -5.4F, 0.0F, 1, 5, 10, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 35, 0, -2.8F, -5.4F, 0.0F, 2, 5, 10, -0.001F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 108, 91, -3.0F, -0.4F, -0.25F, 3, 3, 5, 0.1F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 80, 63, -0.75F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 57, 39, -0.35F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 18, 92, -0.35F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 84, 91, -0.35F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 24, 56, -0.35F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 15, 77, -0.75F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 47, 53, -0.75F, 0.499F, 5.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 32, 51, -0.75F, 0.499F, 2.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 33, -0.75F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 47, 39, -3.65F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 13, -3.65F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 15, 47, -3.65F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 5, -3.65F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 5, 47, -3.25F, 0.499F, 2.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 0, -3.25F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 32, 45, -3.25F, 0.499F, 5.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 0, 77, -3.25F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 51, 73, -3.25F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 131, 50, -3.0F, -0.4F, 4.15F, 3, 3, 6, 0.101F, false));

		cube_r136_r1 = new ModelRenderer(this);
		cube_r136_r1.setRotationPoint(3.3052F, 26.8284F, -7.1F);
		magazine_actual.addChild(cube_r136_r1);
		setRotationAngle(cube_r136_r1, 0.0F, 0.0F, -0.1222F);
		cube_r136_r1.cubeList.add(new ModelBox(cube_r136_r1, 22, 47, -0.75F, -30.101F, 11.05F, 1, 3, 2, 0.0F, false));

		cube_r135_r1 = new ModelRenderer(this);
		cube_r135_r1.setRotationPoint(-3.3276F, 27.1941F, -7.1F);
		magazine_actual.addChild(cube_r135_r1);
		setRotationAngle(cube_r135_r1, 0.0F, 0.0F, 0.1222F);
		cube_r135_r1.cubeList.add(new ModelBox(cube_r135_r1, 39, 45, -3.25F, -30.101F, 11.05F, 1, 3, 2, 0.0F, false));

		cube_r134_r1 = new ModelRenderer(this);
		cube_r134_r1.setRotationPoint(2.4855F, 26.9045F, -7.1F);
		magazine_actual.addChild(cube_r134_r1);
		setRotationAngle(cube_r134_r1, 0.0F, 0.0F, -0.0873F);
		cube_r134_r1.cubeList.add(new ModelBox(cube_r134_r1, 88, 46, -0.85F, -27.501F, 11.05F, 1, 1, 2, 0.0F, false));

		cube_r133_r1 = new ModelRenderer(this);
		cube_r133_r1.setRotationPoint(2.4506F, 26.9061F, -7.1F);
		magazine_actual.addChild(cube_r133_r1);
		setRotationAngle(cube_r133_r1, 0.0F, 0.0F, -0.0873F);
		cube_r133_r1.cubeList.add(new ModelBox(cube_r133_r1, 88, 41, -0.85F, -27.101F, 11.05F, 1, 1, 2, -0.001F, false));

		cube_r132_r1 = new ModelRenderer(this);
		cube_r132_r1.setRotationPoint(-2.4969F, 27.1661F, -7.1F);
		magazine_actual.addChild(cube_r132_r1);
		setRotationAngle(cube_r132_r1, 0.0F, 0.0F, 0.0873F);
		cube_r132_r1.cubeList.add(new ModelBox(cube_r132_r1, 88, 28, -3.15F, -27.501F, 11.05F, 1, 1, 2, 0.0F, false));

		cube_r131_r1 = new ModelRenderer(this);
		cube_r131_r1.setRotationPoint(-2.462F, 27.1676F, -7.1F);
		magazine_actual.addChild(cube_r131_r1);
		setRotationAngle(cube_r131_r1, 0.0F, 0.0F, 0.0873F);
		cube_r131_r1.cubeList.add(new ModelBox(cube_r131_r1, 88, 18, -3.15F, -27.101F, 11.05F, 1, 1, 2, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine_actual.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}