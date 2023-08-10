package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APSstock extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public APSstock() {
		textureWidth = 150;
		textureHeight = 150;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 7.2F, 3.0F);
		stock.cubeList.add(new ModelBox(stock, 63, 53, -3.499F, -7.1F, 1.0F, 4, 2, 22, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -12.7F, 27.7F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7679F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -4.002F, 0.0F, 0.0F, 4, 9, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.8F, 3.4F, -7.9F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0524F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -0.901F, -15.9F, 49.0F, 2, 11, 5, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 34, 65, -1.001F, -10.1F, 42.0F, 2, 3, 7, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2F, 2.6F, -6.8F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.0524F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 14, 18, -1.001F, -8.1F, 42.0F, 2, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2F, 3.5F, 0.0F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0524F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 13, 0, -1.001F, -9.1F, 42.0F, 2, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 0.0F, 0.0F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0524F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 70, 77, -4.001F, -14.1F, 27.0F, 4, 7, 20, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -4.001F, -7.1F, 1.0F, 4, 7, 46, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.5F, 0.0F, 0.0F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 0, -4.0F, -7.0F, 0.8F, 4, 7, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 11, -3.5F, -7.0F, -0.1F, 3, 7, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}