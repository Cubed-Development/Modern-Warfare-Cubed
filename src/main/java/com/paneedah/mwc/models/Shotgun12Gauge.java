package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Shotgun12Gauge extends ModelBase {
	private final ModelRenderer Shape1;
	private final ModelRenderer Shape3;
	private final ModelRenderer Shape4;
	private final ModelRenderer Shape5;
	private final ModelRenderer Shape6;
	private final ModelRenderer Shape11;
	private final ModelRenderer Shape12;
	private final ModelRenderer Shape13;
	private final ModelRenderer Shape14;

	public Shotgun12Gauge() {
		textureWidth = 32;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this);
		Shape1.setRotationPoint(0.0F, -5.0F, 0.0F);
		Shape1.cubeList.add(new ModelBox(Shape1, 0, 0, 0.0F, 0.0F, 0.0F, 3, 9, 3, 0.0F, false));

		Shape3 = new ModelRenderer(this);
		Shape3.setRotationPoint(0.5F, -5.0F, -0.2F);
		Shape3.cubeList.add(new ModelBox(Shape3, 16, 16, 0.0F, 0.0F, 0.0F, 2, 9, 1, 0.0F, false));

		Shape4 = new ModelRenderer(this);
		Shape4.setRotationPoint(0.5F, -5.0F, 2.2F);
		Shape4.cubeList.add(new ModelBox(Shape4, 12, 0, 0.0F, 0.0F, 0.0F, 2, 9, 1, 0.0F, false));

		Shape5 = new ModelRenderer(this);
		Shape5.setRotationPoint(-0.2F, -5.0F, 0.5F);
		Shape5.cubeList.add(new ModelBox(Shape5, 0, 12, 0.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F, false));

		Shape6 = new ModelRenderer(this);
		Shape6.setRotationPoint(2.2F, -5.0F, 0.5F);
		Shape6.cubeList.add(new ModelBox(Shape6, 10, 10, 0.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F, false));

		Shape11 = new ModelRenderer(this);
		Shape11.setRotationPoint(0.0F, 3.5F, -0.4F);
		Shape11.cubeList.add(new ModelBox(Shape11, 16, 11, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		Shape12 = new ModelRenderer(this);
		Shape12.setRotationPoint(0.0F, 3.5F, 2.4F);
		Shape12.cubeList.add(new ModelBox(Shape12, 16, 8, 0.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F, false));

		Shape13 = new ModelRenderer(this);
		Shape13.setRotationPoint(2.4F, 3.5F, 0.0F);
		Shape13.cubeList.add(new ModelBox(Shape13, 18, 4, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		Shape14 = new ModelRenderer(this);
		Shape14.setRotationPoint(-0.4F, 3.5F, 0.0F);
		Shape14.cubeList.add(new ModelBox(Shape14, 18, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Shape1.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
		Shape6.render(f5);
		Shape11.render(f5);
		Shape12.render(f5);
		Shape13.render(f5);
		Shape14.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
