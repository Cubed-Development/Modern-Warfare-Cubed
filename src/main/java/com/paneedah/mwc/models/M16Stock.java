package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M16Stock extends ModelBase {
	private final ModelRenderer m110_stock;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver19_r1;
	private final ModelRenderer receiver18_r1;
	private final ModelRenderer receiver23_r1;
	private final ModelRenderer receiver22_r1;
	private final ModelRenderer receiver21_r1;
	private final ModelRenderer receiver20_r1;
	private final ModelRenderer receiver19_r2;
	private final ModelRenderer receiver18_r2;
	private final ModelRenderer receiver19_r3;
	private final ModelRenderer receiver18_r3;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver17_r2;

	public M16Stock() {
		textureWidth = 180;
		textureHeight = 180;

		m110_stock = new ModelRenderer(this);
		m110_stock.setRotationPoint(0.0F, 23.9F, 1.0F);
		m110_stock.cubeList.add(new ModelBox(m110_stock, 0, 33, -1.65F, -37.4F, 2.351F, 2, 1, 32, 0.001F, false));
		m110_stock.cubeList.add(new ModelBox(m110_stock, 0, 0, -3.35F, -37.4F, 2.352F, 2, 1, 32, 0.001F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-3.35F, -37.4F, 2.35F);
		m110_stock.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, 0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 100, 38, -0.001F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 36, 34, 0.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));

		receiver19_r1 = new ModelRenderer(this);
		receiver19_r1.setRotationPoint(0.0F, -30.7F, 10.25F);
		m110_stock.addChild(receiver19_r1);
		setRotationAngle(receiver19_r1, -0.3491F, 0.0F, 0.0F);
		receiver19_r1.cubeList.add(new ModelBox(receiver19_r1, 34, 67, -3.001F, -1.0F, 0.0F, 3, 1, 23, 0.0F, false));

		receiver18_r1 = new ModelRenderer(this);
		receiver18_r1.setRotationPoint(0.0F, -32.3F, 1.95F);
		m110_stock.addChild(receiver18_r1);
		setRotationAngle(receiver18_r1, -0.192F, 0.0F, 0.0F);
		receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 0, 19, -3.0F, -1.0F, 0.0F, 3, 1, 9, 0.0F, false));

		receiver23_r1 = new ModelRenderer(this);
		receiver23_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver23_r1);
		setRotationAngle(receiver23_r1, -0.1658F, -0.0052F, -0.0279F);
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 0, 0, 0.0F, 4.0F, -30.0F, 1, 5, 14, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 0, 0, 0.0F, 2.0F, -16.0F, 1, 8, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 45, 13, 0.0F, 1.0F, -11.0F, 1, 10, 5, 0.0F, false));
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 36, 0, 0.0F, 0.0F, -6.0F, 1, 12, 6, 0.0F, false));

		receiver22_r1 = new ModelRenderer(this);
		receiver22_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver22_r1);
		setRotationAngle(receiver22_r1, -0.1658F, 0.0052F, 0.0279F);
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 0, 33, -1.0F, 4.0F, -30.0F, 1, 5, 14, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 16, 0, -1.0F, 2.0F, -16.0F, 1, 8, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 45, 47, -1.0F, 1.0F, -11.0F, 1, 10, 5, 0.0F, false));
		receiver22_r1.cubeList.add(new ModelBox(receiver22_r1, 36, 34, -1.0F, 0.0F, -6.0F, 1, 12, 6, 0.0F, false));

		receiver21_r1 = new ModelRenderer(this);
		receiver21_r1.setRotationPoint(-3.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver21_r1);
		setRotationAngle(receiver21_r1, -0.3752F, -0.0052F, -0.0279F);
		receiver21_r1.cubeList.add(new ModelBox(receiver21_r1, 72, 38, -0.001F, 11.1F, -19.0F, 1, 2, 22, 0.0F, false));

		receiver20_r1 = new ModelRenderer(this);
		receiver20_r1.setRotationPoint(0.35F, -36.4F, 33.35F);
		m110_stock.addChild(receiver20_r1);
		setRotationAngle(receiver20_r1, -0.3752F, 0.0052F, 0.0279F);
		receiver20_r1.cubeList.add(new ModelBox(receiver20_r1, 33, 100, -0.999F, 11.1F, -19.0F, 1, 2, 22, 0.0F, false));

		receiver19_r2 = new ModelRenderer(this);
		receiver19_r2.setRotationPoint(-3.35F, -36.4F, 34.35F);
		m110_stock.addChild(receiver19_r2);
		setRotationAngle(receiver19_r2, -0.1658F, 0.0F, -0.0279F);
		receiver19_r2.cubeList.add(new ModelBox(receiver19_r2, 0, 33, 0.0F, 0.0F, -1.0F, 2, 13, 1, 0.0F, false));

		receiver18_r2 = new ModelRenderer(this);
		receiver18_r2.setRotationPoint(0.35F, -36.4F, 34.35F);
		m110_stock.addChild(receiver18_r2);
		setRotationAngle(receiver18_r2, -0.1658F, 0.0F, 0.0279F);
		receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 6, 33, -2.0F, 0.0F, -1.0F, 2, 13, 1, 0.0F, false));

		receiver19_r3 = new ModelRenderer(this);
		receiver19_r3.setRotationPoint(-3.35F, -36.4F, 2.0F);
		m110_stock.addChild(receiver19_r3);
		setRotationAngle(receiver19_r3, 0.0F, 0.0F, -0.0873F);
		receiver19_r3.cubeList.add(new ModelBox(receiver19_r3, 73, 3, 0.0F, 0.0F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver18_r3 = new ModelRenderer(this);
		receiver18_r3.setRotationPoint(0.35F, -36.4F, 2.0F);
		m110_stock.addChild(receiver18_r3);
		setRotationAngle(receiver18_r3, 0.0F, 0.0F, 0.0873F);
		receiver18_r3.cubeList.add(new ModelBox(receiver18_r3, 0, 100, -1.0F, 0.0F, 0.0F, 1, 4, 31, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(0.35F, -37.4F, 2.35F);
		m110_stock.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 36, 1, -2.0F, -1.0F, 0.0F, 2, 1, 32, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 100, 71, -0.999F, -1.4F, -0.0001F, 1, 1, 32, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(-1.5F, -39.25F, 2.35F);
		m110_stock.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, -0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 0, 66, -1.4F, -0.001F, 0.0049F, 1, 2, 32, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 64, 101, -1.0F, 0.0F, 0.002F, 1, 1, 32, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -39.25F, 2.35F);
		m110_stock.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, 0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 98, 104, 0.0F, 0.0F, 0.0F, 1, 1, 32, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 66, 67, 0.4F, -0.001F, 0.001F, 1, 2, 32, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		m110_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
