package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911Mag15 extends ModelWithAttachments {
	private final ModelRenderer mag15rnd;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public M1911Mag15() {
		textureWidth = 52;
		textureHeight = 52;

		mag15rnd = new ModelRenderer(this);
		mag15rnd.setRotationPoint(0.0F, 24.3F, 1.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.15F, -15.7871F, 1.3286F);
		mag15rnd.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 0, -1.65F, 8.1439F, -3.3482F, 1, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 0, -1.05F, 8.1439F, -3.3482F, 3, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 39, -1.65F, 8.1439F, 1.4518F, 1, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 13, -1.05F, 8.1439F, 1.4518F, 3, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -1.65F, 7.9439F, 2.4518F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 38, -1.05F, 7.9439F, 2.4518F, 3, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 22, 31, -1.65F, 7.4439F, -1.5482F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 32, -1.65F, 7.9439F, -3.3482F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 18, 24, -1.05F, 7.4439F, -1.5482F, 3, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 18, -1.05F, 7.9439F, -3.3482F, 3, 1, 6, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -7.8194F, 0.2352F);
		mag15rnd.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.829F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 7, 41, -1.5F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 21, -1.5F, -0.8F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -32.1802F, -4.9934F);
		mag15rnd.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5673F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 37, 39, 0.5F, 0.1F, -1.1F, 1, 1, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, 0.5F, 0.1F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 2, -1.5F, 0.1F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 23, 42, -1.5F, 0.1F, -1.1F, 1, 1, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -32.4802F, -1.5934F);
		mag15rnd.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 41, 0, -1.5F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 17, 0.5F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.15F, -22.9871F, -0.4714F);
		mag15rnd.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.35F, -9.5502F, -2.9883F, 3, 25, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag15rnd.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}