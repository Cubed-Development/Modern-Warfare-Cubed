package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36CStock extends ModelWithAttachments {
	private final ModelRenderer stock;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;

	public G36CStock() {
		textureWidth = 256;
		textureHeight = 256;

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 17.05F);
		stock.cubeList.add(new ModelBox(stock, 133, 73, -1.625F, -41.0F, -12.5F, 2, 1, 2, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 133, 61, -3.375F, -40.999F, -12.5F, 2, 1, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 91, -3.5F, -40.0F, -12.5F, 4, 9, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 61, 67, -4.5F, -40.0F, -12.5F, 1, 9, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 98, 44, -3.5F, -40.0F, -10.075F, 4, 1, 1, -0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 44, 100, -3.5F, -39.0F, -9.5F, 4, 8, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 130, 77, -3.5F, -37.0F, -0.5F, 4, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 170, 35, -3.5F, -38.0F, 15.5F, 4, 18, 3, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 69, 23, -2.5F, -33.0F, 14.5F, 2, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 152, 211, -3.5F, -38.0F, -0.5F, 4, 1, 16, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 165, 98, -3.5F, -32.0F, -7.5F, 4, 1, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 114, -3.5F, -38.0F, -7.5F, 4, 2, 7, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.5F, -27.7705F, 12.0186F);
		stock.addChild(cube_r31);
		setRotationAngle(cube_r31, -1.0908F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 25, 77, -1.999F, -1.5F, 3.5F, 4, 2, 5, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		stock.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.6981F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 103, 167, -1.998F, -0.5F, 0.0F, 4, 1, 9, -0.003F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		stock.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.3054F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 23, 61, -2.0F, 1.5F, 4.75F, 4, 1, 4, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 12, 167, -1.999F, 0.5F, 2.5F, 4, 1, 6, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 200, 88, -1.999F, -0.5F, -8.5F, 4, 1, 17, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.5F, -39.7301F, -9.5581F);
		stock.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.5585F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 128, 102, -3.001F, -0.5F, 0.275F, 4, 1, 3, -0.002F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.625F, -39.7301F, -9.5581F);
		stock.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.6109F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 94, 132, -4.0F, -0.4989F, -1.5F, 2, 1, 2, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 126, 24, -2.25F, -0.4999F, -1.5F, 2, 1, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.5F, -37.5F, -2.5F);
		stock.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 18, 39, -2.001F, -0.5F, -5.0F, 4, 1, 5, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.501F, -27.8224F, 13.5659F);
		stock.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.2618F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 9, 140, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.001F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.501F, -29.0482F, 14.1175F);
		stock.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 146, 91, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.5F, -33.5747F, 15.459F);
		stock.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.5672F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 125, 139, -1.001F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-1.5F, -29.0F, 17.0F);
		stock.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.1309F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 73, 0, -2.001F, 0.0F, -1.5F, 4, 9, 3, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-1.5F, -29.0F, 17.0F);
		stock.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.0873F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 106, 118, -2.001F, -9.125F, 0.5F, 4, 9, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.2071F, -40.0F, -4.0F);
		stock.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.7854F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 88, 139, -0.5F, -0.5F, -8.5F, 1, 1, 2, 0.0F, false));
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
