package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;

	public DesertEagleMag() {
		textureWidth = 50;
		textureHeight = 50;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 22.0F, -0.2F);
		magazine.cubeList.add(new ModelBox(magazine, 20, 16, -2.3F, -13.7F, -2.9F, 2, 1, 2, -0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 16, 0, -3.5F, -13.7F, -1.7F, 4, 1, 7, -0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -0.06F, -13.7F, 4.8F, 1, 1, 1, -0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 16, 12, -3.5F, -13.7F, 4.8F, 4, 1, 1, -0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 20, 8, -0.06F, -13.7F, -1.7F, 1, 1, 7, -0.1F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, -21.0F, 0.0F);
		magazine.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.2182F, 0.0F, 0.0F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 10, 14, -3.1F, -8.0F, -2.5F, 2, 14, 6, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 0, -1.5F, -7.9976F, -2.4784F, 2, 14, 6, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 26, 23, -1.5F, 5.8024F, -2.4784F, 2, 2, 6, -0.001F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 20, -1.5F, 7.4024F, 0.5216F, 2, 1, 3, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 16, 8, -3.1F, 7.4024F, 0.5216F, 2, 1, 3, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 26, 16, -3.1F, 5.8024F, -2.4784F, 2, 2, 6, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.3F, -28.3434F, -0.6037F);
		magazine.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.4363F, 0.0F, 0.0F);
		

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(-1.55F, 0.5F, -0.2F);
		cube_r93.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.0349F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 10, 0, 0.75F, -1.6F, -2.4F, 1, 1, 5, -0.001F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 0, 29, -1.85F, -1.6F, -2.4F, 1, 1, 5, -0.001F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(-1.8F, -13.1F, -2.4F);
		magazine.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.7854F, 0.0F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 10, 2, -1.0F, -0.6F, -0.7F, 1, 1, 1, -0.1F, false));
		cube_r94.cubeList.add(new ModelBox(cube_r94, 10, 0, -1.7F, -0.6F, -0.7F, 1, 1, 1, -0.1F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.0F, -21.0F, -0.2F);
		magazine.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, -0.7854F, 0.0F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 0, 4, -2.12F, 7.3F, -1.7F, 1, 1, 1, -0.1F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 0, 2, -1.36F, 7.3F, -1.7F, 1, 1, 1, -0.1F, false));
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