package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class B51ScopeMountRail extends ModelWithAttachments {
	private final ModelRenderer B51ScopeMountRail;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public B51ScopeMountRail() {
		textureWidth = 400;
		textureHeight = 400;

		B51ScopeMountRail = new ModelRenderer(this);
		B51ScopeMountRail.setRotationPoint(-1.4F, -22.0F, -27.0F);
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 41, 99, -3.0F, 0.6F, -10.2F, 1, 1, 2, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 43, 0, -3.0F, 2.6F, -12.2F, 1, 2, 1, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 47, 23, -3.0F, 1.8F, -12.2F, 1, 1, 1, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 5, 16, 1.4F, 0.6F, -10.2F, 1, 1, 2, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 273, 172, -1.6F, 0.2F, -9.2F, 3, 1, 16, -0.002F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 163, 52, -2.0F, -1.8F, -5.2F, 1, 1, 14, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 209, 235, -1.8F, -1.2F, 6.8F, 1, 1, 15, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 140, 194, 0.2F, -1.2F, 6.8F, 1, 1, 15, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 0, 30, -1.8F, -1.8F, -5.2F, 3, 1, 27, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 104, 188, -2.0F, 0.2F, -9.2F, 1, 1, 16, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 0, 10, -2.0F, 1.2F, 5.8F, 4, 1, 2, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 42, 30, 1.4F, 2.6F, -12.2F, 1, 2, 1, 0.0F, false));
		B51ScopeMountRail.cubeList.add(new ModelBox(B51ScopeMountRail, 7, 39, 1.4F, 1.8F, -12.2F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9F, 1.1F, -9.2F);
		B51ScopeMountRail.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5236F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 30, -0.5F, -0.9F, -2.9F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 25, -0.5F, -0.9F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 80, -4.9F, -0.9F, -2.9F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 55, -4.9F, -0.9F, -1.5F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.8F, 0.0F, 0.0F);
		B51ScopeMountRail.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.8727F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 159, 76, -5.4F, -5.1F, -4.9F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 159, 72, -7.8F, -3.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 140, 157, -5.4F, -3.5F, -3.5F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 152, -7.8F, 1.3F, 0.3F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 130, 150, -5.4F, 1.3F, 0.3F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 144, 77, -7.8F, 4.5F, 3.0F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 132, 104, -5.4F, 4.5F, 3.0F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 144, 112, -7.8F, 2.9F, 1.7F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 144, 108, -5.4F, 2.9F, 1.7F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 156, -7.8F, -1.9F, -2.3F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 156, -5.4F, -1.9F, -2.3F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 140, 153, -7.8F, -0.3F, -0.9F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 152, -5.4F, -0.3F, -0.9F, 1, 1, 3, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 160, 38, -7.8F, -5.1F, -4.9F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		B51ScopeMountRail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}