package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UMP45Stock extends ModelWithAttachments {
	private final QRenderer stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public UMP45Stock() {
		textureWidth = 200;
		textureHeight = 200;

		

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 23.0F, 17.05F);
		stock.cubeList.add(new ModelBox(stock, 96, 94, -1.625F, -40.9F, -12.5F, 2, 1, 2, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 86, 5, -3.375F, -40.899F, -12.5F, 2, 1, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 88, 111, -4.5F, -40.9F, -11.5F, 2, 8, 1, -0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 40, 98, -4.3F, -33.9F, -14.3F, 2, 1, 3, -0.003F, false));
		stock.cubeList.add(new ModelBox(stock, 76, 21, -3.5F, -38.9F, -11.5F, 4, 6, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 72, 111, -2.5F, -37.1F, 3.9F, 2, 8, 1, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 112, -2.5F, -36.1F, -1.1F, 2, 3, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 54, 76, -2.5F, -32.1F, 4.6F, 2, 3, 1, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 54, 0, -3.5F, -38.2F, 16.5F, 4, 14, 3, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 41, 106, -2.5F, -36.75F, 15.5F, 2, 11, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 41, -3.5F, -38.0F, 11.5F, 4, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 74, 84, -3.0F, -37.0F, 11.5F, 3, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 53, -3.5F, -38.0F, -7.5F, 4, 2, 19, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -36.0F, 11.5F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3665F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 68, -4.0F, -1.0F, 0.0F, 4, 1, 3, -0.002F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -28.0864F, 8.1633F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3229F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 33, 106, -1.999F, -0.5F, -17.5F, 4, 1, 27, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, -39.6301F, -9.5581F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5585F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 74, 66, -3.001F, -0.5F, 0.275F, 4, 2, 3, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.625F, -39.6301F, -9.5581F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.6109F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 114, 10, -4.0F, -0.4989F, -1.5F, 2, 2, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 96, 53, -2.25F, -0.4999F, -1.5F, 2, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.5F, -37.5F, -2.5F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 16, -2.001F, -0.5F, -5.0F, 4, 1, 5, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.501F, -26.5224F, 14.1659F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2618F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 115, 15, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.501F, -27.7482F, 14.7175F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.2182F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 86, 58, -1.0F, -0.5F, -0.5F, 2, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-1.5F, -29.2F, 18.0F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 66, 94, -2.001F, -9.125F, 0.5F, 4, 9, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -30.4F, 2.2F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 112, 25, -2.0F, -3.0F, 0.0F, 2, 3, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, -28.7F, 6.6F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.2094F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 78, 111, -2.0F, -8.0F, -1.0F, 2, 8, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.5F, -33.3F, -8.7F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.2269F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 74, 53, -2.0F, -5.0F, 0.0F, 2, 5, 8, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.4F, -34.0F, -8.9F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.3464F, -0.2976F, -0.1042F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 15, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.4F, -38.9F, -11.5F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 1.1868F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 86, 101, 0.0F, -2.0F, 0.0F, 2, 2, 1, -0.003F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.5F, -32.9F, -11.5F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.7679F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 41, 0.0F, -8.0F, 0.0F, 2, 8, 1, -0.002F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.8F, -37.6F, -11.0F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.1745F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 98, 37, -1.0F, -3.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 65, 64, -1.0F, -2.1F, 0.0F, 1, 2, 2, 0.0F, false));
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
