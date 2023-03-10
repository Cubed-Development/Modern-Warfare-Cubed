package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UMP45mag extends ModelWithAttachments {
	private final QRenderer magazine;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;

	public UMP45mag() {
		textureWidth = 200;
		textureHeight = 200;

		

		magazine = new QRenderer(this);
		magazine.setRotationPoint(0.5F, 18.9F, -29.0F);
		setRotationAngle(magazine, -0.2094F, 0.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 106, 153, -4.0F, -30.0F, 0.0F, 4, 30, 5, 0.01F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 40, -4.5F, -0.1F, -0.7F, 5, 1, 6, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 98, 0, -0.85F, -30.0F, 0.7F, 1, 30, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 106, -0.85F, -30.0F, 3.7F, 1, 30, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 56, 111, -0.85F, -9.0F, 2.7F, 1, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 46, 53, -4.15F, -30.0F, 0.7F, 1, 30, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 27, 111, -4.15F, -9.0F, 2.7F, 1, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 104, 0, -4.15F, -30.0F, 3.7F, 1, 30, 1, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, 0.0F, -0.7F);
		magazine.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.5934F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 24, 10, -4.0F, -0.1F, 0.0F, 4, 1, 1, -0.01F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-1.0F, 0.0F, -0.7F);
		magazine.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.3665F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 54, 85, -3.3007F, -0.8249F, 0.7F, 1, 2, 5, -0.01F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 73, 101, -13.5409F, -27.9039F, 2.6705F, 1, 1, 3, 0.01F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, -0.7F);
		magazine.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.3665F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 76, 94, -0.5F, -1.9F, 0.7F, 1, 2, 5, -0.01F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 81, 101, 9.7401F, -28.979F, 2.6705F, 1, 1, 3, 0.01F, false));

		
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
