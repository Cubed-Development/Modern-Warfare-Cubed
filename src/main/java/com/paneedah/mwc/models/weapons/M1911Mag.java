package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public M1911Mag() {
		textureWidth = 52;
		textureHeight = 52;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.3F, 1.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.15F, -22.9871F, -0.6714F);
		mag.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 38, -1.65F, 8.1439F, -3.3482F, 1, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 31, -1.05F, 8.1439F, -3.3482F, 3, 1, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 43, -1.65F, 8.1439F, 1.4518F, 1, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 38, -1.05F, 8.1439F, 1.4518F, 3, 1, 3, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 3, -1.65F, 7.9439F, 2.4518F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 38, 32, -1.05F, 7.9439F, 2.4518F, 3, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 6, -1.65F, 7.4439F, -1.5482F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 37, -1.65F, 7.9439F, -3.3482F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 25, -1.05F, 7.4439F, -1.5482F, 3, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 31, -1.05F, 7.9439F, -3.3482F, 3, 1, 6, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -15.0194F, -1.7648F);
		mag.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.829F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 29, -1.5F, 0.0F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 44, -1.5F, -0.8F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -32.1802F, -4.9934F);
		mag.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.5673F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 42, 40, 0.5F, 0.1F, -1.1F, 1, 1, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 0, 0.5F, 0.1F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 19, 2, -1.5F, 0.1F, 1.3F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 43, -1.5F, 0.1F, -1.1F, 1, 1, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0F, -32.4802F, -1.5934F);
		mag.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.1047F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 36, -1.5F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 25, 0.5F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.15F, -22.9871F, -0.4714F);
		mag.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.2618F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 0, -1.35F, -9.5502F, -2.9883F, 3, 18, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}