package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PP1901Mag extends ModelWithAttachments {
	private final ModelRenderer Mag;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public PP1901Mag() {
		textureWidth = 256;
		textureHeight = 256;

		Mag = new ModelRenderer(this);
		Mag.setRotationPoint(0.0508F, -6.5996F, -20.222F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Mag.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0698F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 15, 118, -2.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 69, 118, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.0F, 13.413F, -5.0806F);
		Mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.4145F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 155, 117, -2.0F, 5.5F, -3.25F, 4, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 156, -1.5F, -2.5F, -2.5F, 3, 8, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.0F, 16.9277F, -8.2659F);
		Mag.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8072F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 100, 22, -1.5F, -0.3398F, -1.0F, 3, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.0F, 7.0668F, -2.7063F);
		Mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3272F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 57, 157, -1.5F, -2.5F, -2.5F, 3, 7, 5, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, 2.5548F, -1.4868F);
		Mag.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.2007F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 157, 124, -1.5F, -2.5F, -2.5F, 3, 5, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
