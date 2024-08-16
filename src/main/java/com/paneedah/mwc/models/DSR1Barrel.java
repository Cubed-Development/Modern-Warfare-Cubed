package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1Barrel extends ModelWithAttachments {
	private final ModelRenderer barrel;
	private final ModelRenderer cube_r119_r1;
	private final ModelRenderer cube_r118_r1;
	private final ModelRenderer cube_r117_r1;
	private final ModelRenderer cube_r116_r1;

	public DSR1Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 108, 224, -2.0F, -36.088F, -59.5F, 1, 2, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 200, 201, -2.5F, -35.588F, -59.5F, 2, 1, 40, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 191, 159, -2.5F, -36.088F, -59.701F, 2, 2, 40, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 164, -2.0F, -34.838F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 159, 160, -2.0F, -36.338F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 155, 22, -1.25F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 149, 112, -2.75F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));

		cube_r119_r1 = new ModelRenderer(this);
		cube_r119_r1.setRotationPoint(25.0913F, -10.6003F, 0.0F);
		barrel.addChild(cube_r119_r1);
		setRotationAngle(cube_r119_r1, 0.0F, 0.0F, -0.7854F);
		cube_r119_r1.cubeList.add(new ModelBox(cube_r119_r1, 68, 145, -1.25F, -36.588F, -67.5F, 1, 1, 9, -0.002F, false));

		cube_r118_r1 = new ModelRenderer(this);
		cube_r118_r1.setRotationPoint(24.3842F, -10.3074F, 0.0F);
		barrel.addChild(cube_r118_r1);
		setRotationAngle(cube_r118_r1, 0.0F, 0.0F, -0.7854F);
		cube_r118_r1.cubeList.add(new ModelBox(cube_r118_r1, 106, 144, -1.25F, -35.588F, -67.5F, 1, 1, 9, -0.002F, false));

		cube_r117_r1 = new ModelRenderer(this);
		cube_r117_r1.setRotationPoint(-25.97F, -8.479F, 0.0F);
		barrel.addChild(cube_r117_r1);
		setRotationAngle(cube_r117_r1, 0.0F, 0.0F, 0.7854F);
		cube_r117_r1.cubeList.add(new ModelBox(cube_r117_r1, 27, 140, -2.75F, -36.588F, -67.5F, 1, 1, 9, -0.002F, false));

		cube_r116_r1 = new ModelRenderer(this);
		cube_r116_r1.setRotationPoint(-25.2629F, -8.1861F, 0.0F);
		barrel.addChild(cube_r116_r1);
		setRotationAngle(cube_r116_r1, 0.0F, 0.0F, 0.7854F);
		cube_r116_r1.cubeList.add(new ModelBox(cube_r116_r1, 0, 139, -2.75F, -35.588F, -67.5F, 1, 1, 9, -0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}