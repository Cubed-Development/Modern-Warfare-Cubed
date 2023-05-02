package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Dragunov98Stock extends ModelBase {
	private final QRenderer grip;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver15_r2;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer receiver15_r3;
	private final ModelRenderer receiver15_r4;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip9_r2;
	private final ModelRenderer grip8_r2;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer grip4_r2;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r3;
	private final ModelRenderer grip5_r3;
	private final ModelRenderer grip13_r1;

	public Dragunov98Stock() {
		textureWidth = 370;
		textureHeight = 370;

		grip = new QRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.0F, -30.25F, 0.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 65, 65, -3.499F, -30.25F, -5.0F, 4, 5, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 67, 49, -2.5F, -38.15F, 3.0F, 2, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 0, -3.85F, -34.5F, 3.0F, 1, 2, 3, 0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 67, 21, -3.15F, -34.5F, 3.0F, 4, 2, 3, 0.002F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 56, -3.0F, -32.7F, 1.0F, 3, 2, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 11, -3.499F, -30.15F, -5.9F, 4, 5, 1, -0.1F, false));
		grip.cubeList.add(new ModelBox(grip, 30, 16, -3.499F, -31.15F, -5.9F, 4, 1, 7, -0.1F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-1.5F, -38.0F, 5.85F);
		grip.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, 0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 71, 75, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 79, 36, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(-1.5F, -38.0F, 5.85F);
		grip.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 75, 76, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 17, 77, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-3.25F, -36.25F, 5.85F);
		grip.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 46, 77, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 12, 78, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver15_r2 = new ModelRenderer(this);
		receiver15_r2.setRotationPoint(-3.25F, -36.25F, 5.85F);
		grip.addChild(receiver15_r2);
		setRotationAngle(receiver15_r2, 0.0F, 0.0F, -0.4014F);
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 52, 77, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));
		receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 78, 50, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(-1.5F, -34.5F, 5.85F);
		grip.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 78, 21, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 65, 78, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(-1.5F, -34.5F, 5.85F);
		grip.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, -0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 78, 65, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 71, 78, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(0.25F, -36.25F, 5.85F);
		grip.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 79, 13, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 79, 16, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver15_r3 = new ModelRenderer(this);
		receiver15_r3.setRotationPoint(0.25F, -36.25F, 5.85F);
		grip.addChild(receiver15_r3);
		setRotationAngle(receiver15_r3, 0.0F, 0.0F, -0.4014F);
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 79, 29, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver15_r3.cubeList.add(new ModelBox(receiver15_r3, 79, 33, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver15_r4 = new ModelRenderer(this);
		receiver15_r4.setRotationPoint(-1.5F, -36.25F, 6.3F);
		grip.addChild(receiver15_r4);
		setRotationAngle(receiver15_r4, 0.0F, 0.0F, -0.3316F);
		receiver15_r4.cubeList.add(new ModelBox(receiver15_r4, 28, 27, -1.0F, -1.001F, 0.0015F, 2, 2, 15, -0.2F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-2.5F, -38.15F, 3.0F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.0F, 0.0F, -0.7854F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 36, 0, -1.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-0.5F, -38.15F, 3.0F);
		grip.addChild(grip4_r1);
		setRotationAngle(grip4_r1, 0.0F, 0.0F, -0.7854F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 54, 16, -1.0F, 0.0F, 0.0F, 1, 1, 3, -0.001F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(0.85F, -32.5F, 6.0F);
		grip.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -1.0297F, 0.0F, 0.0F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 13, 45, -4.0F, 0.0F, -2.0F, 4, 3, 2, 0.001F, false));
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 20, 11, -4.7F, 0.0F, -2.0F, 1, 3, 2, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(-3.0F, -30.7F, 1.0F);
		grip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 0.0F, 0.0F, -0.3665F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 13, 11, 0.0F, -2.0F, 0.0F, 1, 2, 5, -0.001F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.0F, -30.7F, 1.0F);
		grip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, 0.0F, 0.0F, 0.3665F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 13, 27, -1.0F, -2.0F, 0.0F, 1, 2, 5, -0.001F, false));

		grip9_r2 = new ModelRenderer(this);
		grip9_r2.setRotationPoint(0.0F, -29.7F, 1.0F);
		grip.addChild(grip9_r2);
		setRotationAngle(grip9_r2, 0.6632F, 0.0F, 0.0F);
		grip9_r2.cubeList.add(new ModelBox(grip9_r2, 11, 56, -3.0F, -2.0F, 0.0F, 3, 2, 2, -0.002F, false));

		grip8_r2 = new ModelRenderer(this);
		grip8_r2.setRotationPoint(0.85F, -31.0F, 3.4F);
		grip.addChild(grip8_r2);
		setRotationAngle(grip8_r2, 0.1047F, 0.0F, 0.0F);
		grip8_r2.cubeList.add(new ModelBox(grip8_r2, 0, 0, -4.0F, -2.0F, -9.0F, 4, 2, 9, 0.003F, false));
		grip8_r2.cubeList.add(new ModelBox(grip8_r2, 0, 64, -4.7F, -2.0F, -9.0F, 1, 2, 9, 0.002F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(-3.2F, -37.45F, 3.0F);
		grip.addChild(grip5_r2);
		setRotationAngle(grip5_r2, 0.0F, 0.0F, 0.2147F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 13, 39, 0.0F, 0.0F, 0.0F, 3, 3, 3, 0.001F, false));

		grip4_r2 = new ModelRenderer(this);
		grip4_r2.setRotationPoint(0.2F, -37.45F, 3.0F);
		grip.addChild(grip4_r2);
		setRotationAngle(grip4_r2, 0.0F, 0.0F, -0.2147F);
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 24, 56, -3.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -25.25F, -4.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 30, 24, 0.001F, 3.0F, -0.5F, 4, 1, 1, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 47, 0, 0.0F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -28.25F, 0.0F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 147, 101, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 132, 51, 0.499F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip4_r3 = new ModelRenderer(this);
		grip4_r3.setRotationPoint(-3.5F, -16.05F, -1.6F);
		grip.addChild(grip4_r3);
		setRotationAngle(grip4_r3, 0.2231F, 0.0F, 0.0F);
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 28, 44, 0.001F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 10, 51, 0.0F, -0.001F, 6.45F, 4, 1, 1, 0.0F, false));
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 18, 23, 0.5F, 0.0F, 7.421F, 3, 1, 1, 0.0F, false));
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 54, 67, 0.501F, -0.25F, 7.42F, 3, 1, 1, 0.0F, false));

		grip5_r3 = new ModelRenderer(this);
		grip5_r3.setRotationPoint(-3.5F, -16.05F, -1.6F);
		grip.addChild(grip5_r3);
		setRotationAngle(grip5_r3, 1.0782F, 0.0F, 0.0F);
		grip5_r3.cubeList.add(new ModelBox(grip5_r3, 0, 51, -0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(-3.6F, -25.25F, -4.5F);
		grip.addChild(grip13_r1);
		setRotationAngle(grip13_r1, 0.3665F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 28, 27, 3.2F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 30, 0, 0.0F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
