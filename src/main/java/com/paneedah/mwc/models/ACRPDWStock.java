package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRPDWStock extends ModelBase {
	private final ModelRenderer PDW_stock;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone22_r1;
	private final ModelRenderer bone23_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone12_r1;
	private final ModelRenderer bone13_r1;

	public ACRPDWStock() {
		textureWidth = 400;
		textureHeight = 400;

		PDW_stock = new ModelRenderer(this);
		PDW_stock.setRotationPoint(-1.4993F, -13.7795F, 14.6392F);
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 64, 198, -0.5007F, -3.7205F, -11.9392F, 1, 1, 13, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 182, 17, -1.5007F, -2.7205F, -11.9392F, 3, 1, 12, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 47, 112, -0.5007F, -2.3205F, -11.9392F, 1, 1, 7, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 22, 129, -1.5007F, -1.3205F, -11.9392F, 3, 1, 7, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 141, 65, -1.5007F, 5.1795F, 10.5608F, 3, 4, 4, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 0, 111, -1.5007F, 2.1795F, 9.0608F, 3, 3, 5, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 33, 99, -1.9907F, -2.8205F, 12.4608F, 4, 2, 2, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 47, 93, -2.0007F, -0.8205F, 9.0608F, 4, 3, 5, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 22, 138, -2.0007F, -0.8205F, -11.9392F, 4, 3, 7, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 49, 39, -3.0007F, 0.3795F, 9.0608F, 6, 1, 4, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 245, 0, 1.7993F, 0.3795F, -15.9392F, 1, 1, 27, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 153, 241, -2.8007F, 0.3795F, -15.9392F, 1, 1, 27, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 94, 84, -3.0007F, 0.3795F, -11.9392F, 6, 1, 7, 0.0F, false));
		PDW_stock.cubeList.add(new ModelBox(PDW_stock, 0, 46, -2.0007F, -2.8205F, 14.0608F, 4, 12, 3, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(20.3304F, 30.8581F, -14.6392F);
		PDW_stock.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, 0.0F, -0.5236F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 96, 27, -3.5F, -38.6F, 2.7F, 1, 1, 7, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-17.7337F, 32.3581F, -14.6392F);
		PDW_stock.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.5236F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 110, 36, -0.5F, -38.6F, 2.7F, 1, 1, 7, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(1.4993F, 44.4581F, 7.836F);
		PDW_stock.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.5236F, 0.0F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 20, 104, -3.5F, -38.6F, 23.7F, 4, 2, 4, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(29.2585F, 23.796F, -14.6392F);
		PDW_stock.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.0F, -0.7854F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 19, 111, -3.0F, -40.5F, 2.7F, 1, 1, 12, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 64, 184, -2.6F, -40.51F, 2.7F, 1, 1, 13, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 66, 112, -1.8787F, -39.3787F, 2.7F, 1, 1, 12, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 95, 185, -1.87F, -39.8F, 2.7F, 1, 1, 13, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(1.4993F, -34.1359F, -1.2144F);
		PDW_stock.addChild(bone2_r1);
		setRotationAngle(bone2_r1, -2.9758F, 0.0F, 0.0F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 160, 80, -3.49F, -35.4F, 9.7F, 4, 2, 7, 0.0F, false));

		bone22_r1 = new ModelRenderer(this);
		bone22_r1.setRotationPoint(1.4993F, 32.5901F, -21.1655F);
		PDW_stock.addChild(bone22_r1);
		setRotationAngle(bone22_r1, -0.1745F, 0.0F, 0.0F);
		bone22_r1.cubeList.add(new ModelBox(bone22_r1, 83, 20, -3.49F, -41.5097F, 31.4979F, 4, 6, 1, 0.0F, false));

		bone23_r1 = new ModelRenderer(this);
		bone23_r1.setRotationPoint(1.4993F, 41.8293F, -8.3369F);
		PDW_stock.addChild(bone23_r1);
		setRotationAngle(bone23_r1, 0.1745F, 0.0F, 0.0F);
		bone23_r1.cubeList.add(new ModelBox(bone23_r1, 20, 92, -3.49F, -33.769F, 30.641F, 4, 6, 1, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(19.0656F, 30.9097F, -14.6392F);
		PDW_stock.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.0F, 0.0F, -0.5061F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 101, -4.5F, -37.4F, 2.7F, 2, 1, 7, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 147, -4.5F, -37.4F, 23.7F, 2, 1, 4, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(-16.7104F, 35.398F, -14.6392F);
		PDW_stock.addChild(bone6_r1);
		setRotationAngle(bone6_r1, 0.0F, 0.0F, 0.5061F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 47, 101, -4.5F, -37.4F, 2.7F, 2, 1, 7, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 138, 149, -4.5F, -37.4F, 23.7F, 2, 1, 4, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-16.443F, 32.364F, -14.6392F);
		PDW_stock.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.0F, 0.0F, 0.5061F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 120, 84, -0.5F, -37.4F, 2.7F, 2, 1, 7, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 77, 152, -0.5F, -37.4F, 23.7F, 2, 1, 4, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(19.333F, 33.9436F, -14.6392F);
		PDW_stock.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, 0.0F, -0.5061F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 114, 130, -0.5F, -37.4F, 2.7F, 2, 1, 7, 0.0F, false));
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 123, 153, -0.5F, -37.4F, 23.7F, 2, 1, 4, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(1.4993F, 22.1197F, -44.3291F);
		PDW_stock.addChild(bone11_r1);
		setRotationAngle(bone11_r1, -0.8029F, 0.0F, 0.0F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 0, 119, -2.0F, -42.8F, 3.6F, 1, 2, 2, 0.0F, false));

		bone12_r1 = new ModelRenderer(this);
		bone12_r1.setRotationPoint(18.822F, 19.2666F, -41.3743F);
		PDW_stock.addChild(bone12_r1);
		setRotationAngle(bone12_r1, -0.7577F, -0.297F, -0.3F);
		bone12_r1.cubeList.add(new ModelBox(bone12_r1, 119, 36, -2.0F, -42.8F, 3.6F, 1, 2, 2, 0.0F, false));

		bone13_r1 = new ModelRenderer(this);
		bone13_r1.setRotationPoint(-16.0827F, 20.1142F, -42.2521F);
		PDW_stock.addChild(bone13_r1);
		setRotationAngle(bone13_r1, -0.7577F, 0.297F, 0.3F);
		bone13_r1.cubeList.add(new ModelBox(bone13_r1, 47, 120, -2.0F, -42.8F, 3.6F, 1, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PDW_stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}