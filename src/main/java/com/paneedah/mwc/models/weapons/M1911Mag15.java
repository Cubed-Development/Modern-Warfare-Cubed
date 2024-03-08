package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911Mag15 extends ModelWithAttachments {
	private final ModelRenderer mag15rnd;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public M1911Mag15() {
		textureWidth = 160;
		textureHeight = 160;

		mag15rnd = new ModelRenderer(this);
		mag15rnd.setRotationPoint(-0.7F, 24.3F, 1.2F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.15F, -15.7871F, 1.3286F);
		mag15rnd.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 62, -1.65F, 8.1439F, -3.3482F, 1, 1, 5, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 47, 81, -1.05F, 8.1439F, -3.3482F, 3, 1, 5, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 90, -1.65F, 8.1439F, 1.4518F, 1, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 29, -1.05F, 8.1439F, 1.4518F, 3, 1, 3, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 28, 53, -1.65F, 7.9439F, 2.4518F, 1, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 66, -1.05F, 7.9439F, 2.4518F, 3, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 76, 48, -1.65F, 7.4439F, -1.5482F, 1, 1, 6, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 48, 54, -1.65F, 7.9439F, -3.3482F, 1, 1, 6, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 128, 99, -1.05F, 7.4439F, -1.5482F, 3, 1, 6, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 103, 120, -1.05F, 7.9439F, -3.3482F, 3, 1, 6, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.0F, -7.8194F, 0.2352F);
		mag15rnd.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.829F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 10, 32, -1.5F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 13, 26, -1.5F, -0.8F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, -32.1802F, -4.9934F);
		mag15rnd.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.5673F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 65, 89, 0.5F, 0.1F, -1.1F, 1, 1, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 72, 53, 0.5F, 0.1F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 30, 67, -1.5F, 0.1F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 89, -1.5F, 0.1F, -1.1F, 1, 1, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -32.4802F, -1.5934F);
		mag15rnd.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1047F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 87, -1.5F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 84, 0.5F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.15F, -22.9871F, -0.4714F);
		mag15rnd.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2618F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 35, -1.35F, -9.5502F, -2.9883F, 3, 25, 6, 0.0F, false));
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