package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone;

	public DesertEagleMag() {
		textureWidth = 150;
		textureHeight = 150;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 22.0F, -0.2F);
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -2.3F, -13.6F, -2.9F, 2, 1, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -3.5F, -13.6F, -1.7F, 4, 1, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -0.06F, -13.6F, -1.7F, 1, 1, 8, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -21.0F, 0.0F);
		magazine.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.3F, -7.0F, -2.5F, 3, 15, 7, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -3.3F, 7.6F, 0.5F, 3, 1, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.2F, 7.6F, 0.5F, 2, 1, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.2F, -7.0F, -2.5F, 2, 15, 7, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.3F, -28.3434F, -0.6037F);
		magazine.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.4363F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.8F, 0.0F, -2.7F, 1, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.2F, 0.0F, -2.7F, 1, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -3.6F, 0.0F, -2.7F, 1, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -0.5F, 0.0F, -2.7F, 1, 1, 6, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-1.8F, -13.1F, -2.4F);
		magazine.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -0.5F, -0.7F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.7F, -0.5F, -0.7F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -21.0F, -0.2F);
		magazine.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.7854F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -2.12F, 7.4F, -1.7F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 0, -1.36F, 7.4F, -1.7F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.9F, -13.1F, -2.2F);
		magazine.addChild(bone);
		
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