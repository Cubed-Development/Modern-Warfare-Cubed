package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS50 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer grip;
	private final ModelRenderer Grip30_r1;
	private final ModelRenderer Grip27_r1;
	private final ModelRenderer Grip23_r1;
	private final ModelRenderer Grip22_r1;
	private final ModelRenderer Grip21_r1;
	private final ModelRenderer Grip20_r1;
	private final ModelRenderer Grip19_r1;
	private final ModelRenderer Grip18_r1;
	private final ModelRenderer Grip17_r1;
	private final ModelRenderer Grip15_r1;
	private final ModelRenderer Grip14_r1;
	private final ModelRenderer Grip9_r1;
	private final ModelRenderer Grip8_r1;
	private final ModelRenderer Grip3_r1;
	private final ModelRenderer Grip2_r1;
	private final ModelRenderer Grip1_r1;
	private final ModelRenderer Grip32_r1;
	private final ModelRenderer stock;
	private final ModelRenderer Stock32_r1;
	private final ModelRenderer Stock30_r1;
	private final ModelRenderer Stock29_r1;
	private final ModelRenderer Stock27_r1;
	private final ModelRenderer Stock21_r1;
	private final ModelRenderer Stock15_r1;
	private final ModelRenderer Stock9_r1;
	private final ModelRenderer Stock8_r1;
	private final ModelRenderer Stock5_r1;
	private final ModelRenderer shape;
	private final ModelRenderer Shape195_r1;
	private final ModelRenderer Shape194_r1;
	private final ModelRenderer Shape193_r1;
	private final ModelRenderer Shape192_r1;
	private final ModelRenderer Shape191_r1;
	private final ModelRenderer Shape190_r1;
	private final ModelRenderer Shape181_r1;
	private final ModelRenderer Shape178_r1;
	private final ModelRenderer Shape173_r1;
	private final ModelRenderer Shape170_r1;
	private final ModelRenderer Shape166_r1;
	private final ModelRenderer Shape165_r1;
	private final ModelRenderer Shape164_r1;
	private final ModelRenderer Shape158_r1;
	private final ModelRenderer Shape156_r1;
	private final ModelRenderer Shape147_r1;
	private final ModelRenderer Shape126_r1;
	private final ModelRenderer Shape125_r1;
	private final ModelRenderer Shape124_r1;
	private final ModelRenderer Shape123_r1;
	private final ModelRenderer Shape105_r1;
	private final ModelRenderer Shape104_r1;
	private final ModelRenderer Shape102_r1;
	private final ModelRenderer Shape100_r1;
	private final ModelRenderer Shape73_r1;
	private final ModelRenderer Shape64_r1;
	private final ModelRenderer Shape61_r1;
	private final ModelRenderer Shape53_r1;
	private final ModelRenderer Shape52_r1;
	private final ModelRenderer Shape51_r1;
	private final ModelRenderer Shape49_r1;
	private final ModelRenderer Shape47_r1;
	private final ModelRenderer Shape44_r1;
	private final ModelRenderer Shape43_r1;
	private final ModelRenderer Shape32_r1;
	private final ModelRenderer Shape14_r1;
	private final ModelRenderer Shape28_r1;
	private final ModelRenderer barrel;
	private final ModelRenderer Muzzle25_r1;
	private final ModelRenderer Muzzle27_r1;
	private final ModelRenderer Muzzle31_r1;
	private final ModelRenderer Muzzle15_r1;
	private final ModelRenderer Muzzle29_r1;
	private final ModelRenderer Muzzle33_r1;
	private final ModelRenderer Muzzle4_r1;
	private final ModelRenderer Muzzle12_r1;
	private final ModelRenderer Muzzle13_r1;
	private final ModelRenderer Muzzle3_r1;
	private final ModelRenderer Muzzle10_r1;
	private final ModelRenderer Muzzle9_r1;
	private final ModelRenderer Muzzle6_r1;
	private final ModelRenderer Muzzle7_r1;
	private final ModelRenderer Barrel22_r1;
	private final ModelRenderer Barrel21_r1;
	private final ModelRenderer Barrel12_r1;
	private final ModelRenderer Barrel11_r1;
	private final ModelRenderer Barrel20_r1;
	private final ModelRenderer Barrel19_r1;
	private final ModelRenderer Barrel25_r1;
	private final ModelRenderer Barrel2_r1;
	private final ModelRenderer Barrel4_r1;
	private final ModelRenderer Barrel6_r1;
	private final ModelRenderer Barrel8_r1;

	public AS50() {
		textureWidth = 352;
		textureHeight = 352;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 106, 74, -4.0F, -27.2F, -2.7F, 4, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 104, 24, -4.0F, -27.2F, 1.8F, 4, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 63, -4.0F, -27.2F, -1.7F, 4, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 108, 37, -3.5F, -27.2F, 2.5F, 3, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 74, -4.0F, -26.2F, -1.7F, 1, 3, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 69, 84, -1.0F, -26.2F, -1.7F, 1, 3, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 103, -4.0F, -27.2F, -3.3F, 4, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 86, -4.0F, -28.2F, -13.7F, 4, 1, 29, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 64, -4.0F, -27.8F, -6.3F, 4, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 18, 28, -4.0F, -24.2F, -6.3F, 4, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 6, -3.5F, -26.8F, -6.3F, 3, 3, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 104, 19, -4.0F, -27.2F, -13.7F, 4, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 58, -4.0F, -23.8F, -12.3F, 4, 1, 6, 0.0F, false));

		Grip30_r1 = new ModelRenderer(this);
		Grip30_r1.setRotationPoint(-4.0F, 6.5591F, -26.7354F);
		grip.addChild(Grip30_r1);
		setRotationAngle(Grip30_r1, -0.7854F, 0.0F, 0.0F);
		Grip30_r1.cubeList.add(new ModelBox(Grip30_r1, 59, 102, 0.0F, -36.2F, -7.3F, 4, 1, 1, 0.0F, false));

		Grip27_r1 = new ModelRenderer(this);
		Grip27_r1.setRotationPoint(-4.0F, 2.7994F, 21.2608F);
		grip.addChild(Grip27_r1);
		setRotationAngle(Grip27_r1, 0.576F, 0.0F, 0.0F);
		Grip27_r1.cubeList.add(new ModelBox(Grip27_r1, 84, 44, 0.0F, -38.8F, -5.4F, 4, 2, 1, 0.0F, false));

		Grip23_r1 = new ModelRenderer(this);
		Grip23_r1.setRotationPoint(-4.0F, -1.4211F, 24.6014F);
		grip.addChild(Grip23_r1);
		setRotationAngle(Grip23_r1, 0.7854F, 0.0F, 0.0F);
		Grip23_r1.cubeList.add(new ModelBox(Grip23_r1, 90, 74, 0.0F, -35.2F, -4.4F, 4, 2, 1, 0.0F, false));

		Grip22_r1 = new ModelRenderer(this);
		Grip22_r1.setRotationPoint(-4.0F, 11.7254F, -6.0131F);
		grip.addChild(Grip22_r1);
		setRotationAngle(Grip22_r1, -0.2094F, 0.0F, 0.0F);
		Grip22_r1.cubeList.add(new ModelBox(Grip22_r1, 100, 79, 0.0F, -33.5F, -2.2F, 4, 2, 1, 0.0F, false));

		Grip21_r1 = new ModelRenderer(this);
		Grip21_r1.setRotationPoint(-4.0F, 11.5513F, -5.4693F);
		grip.addChild(Grip21_r1);
		setRotationAngle(Grip21_r1, -0.2094F, 0.0F, 0.0F);
		Grip21_r1.cubeList.add(new ModelBox(Grip21_r1, 104, 58, 0.0F, -31.0F, -1.1F, 4, 2, 1, 0.0F, false));

		Grip20_r1 = new ModelRenderer(this);
		Grip20_r1.setRotationPoint(-4.0F, -4.0409F, 25.9686F);
		grip.addChild(Grip20_r1);
		setRotationAngle(Grip20_r1, 0.9774F, 0.0F, 0.0F);
		Grip20_r1.cubeList.add(new ModelBox(Grip20_r1, 69, 102, 0.0F, -31.5F, -2.6F, 4, 1, 1, 0.0F, false));

		Grip19_r1 = new ModelRenderer(this);
		Grip19_r1.setRotationPoint(-4.0F, -2.027F, 24.3809F);
		grip.addChild(Grip19_r1);
		setRotationAngle(Grip19_r1, 0.9774F, 0.0F, 0.0F);
		Grip19_r1.cubeList.add(new ModelBox(Grip19_r1, 23, 108, 0.0F, -29.0F, -1.5F, 4, 1, 1, 0.0F, false));

		Grip18_r1 = new ModelRenderer(this);
		Grip18_r1.setRotationPoint(-4.0F, 11.0548F, -6.3798F);
		grip.addChild(Grip18_r1);
		setRotationAngle(Grip18_r1, -0.2618F, 0.0F, 0.0F);
		Grip18_r1.cubeList.add(new ModelBox(Grip18_r1, 107, 0, 0.0F, -28.5F, -0.1F, 4, 2, 1, 0.0F, false));

		Grip17_r1 = new ModelRenderer(this);
		Grip17_r1.setRotationPoint(-4.0F, -1.7696F, 23.6497F);
		grip.addChild(Grip17_r1);
		setRotationAngle(Grip17_r1, 1.0472F, 0.0F, 0.0F);
		Grip17_r1.cubeList.add(new ModelBox(Grip17_r1, 37, 109, 0.0F, -26.5F, -0.6F, 4, 1, 1, 0.0F, false));

		Grip15_r1 = new ModelRenderer(this);
		Grip15_r1.setRotationPoint(-4.0F, 7.2439F, 18.75F);
		grip.addChild(Grip15_r1);
		setRotationAngle(Grip15_r1, 0.5236F, 0.0F, 0.0F);
		Grip15_r1.cubeList.add(new ModelBox(Grip15_r1, 8, 84, 3.0F, -35.5F, 0.0F, 1, 9, 2, 0.0F, false));
		Grip15_r1.cubeList.add(new ModelBox(Grip15_r1, 49, 84, 0.0F, -35.5F, 0.0F, 1, 9, 2, 0.0F, false));

		Grip14_r1 = new ModelRenderer(this);
		Grip14_r1.setRotationPoint(-4.0F, 7.6847F, 15.3018F);
		grip.addChild(Grip14_r1);
		setRotationAngle(Grip14_r1, 0.4189F, 0.0F, 0.0F);
		Grip14_r1.cubeList.add(new ModelBox(Grip14_r1, 18, 35, 3.0F, -35.8F, -3.0F, 1, 10, 4, 0.0F, false));
		Grip14_r1.cubeList.add(new ModelBox(Grip14_r1, 46, 0, 0.0F, -35.8F, -3.0F, 1, 10, 4, 0.0F, false));

		Grip9_r1 = new ModelRenderer(this);
		Grip9_r1.setRotationPoint(-4.0F, 12.6785F, 8.6462F);
		grip.addChild(Grip9_r1);
		setRotationAngle(Grip9_r1, 0.2618F, 0.0F, 0.0F);
		Grip9_r1.cubeList.add(new ModelBox(Grip9_r1, 37, 111, 0.5F, -28.7F, 6.4F, 3, 1, 1, 0.0F, false));

		Grip8_r1 = new ModelRenderer(this);
		Grip8_r1.setRotationPoint(-4.0F, 7.8429F, 19.7144F);
		grip.addChild(Grip8_r1);
		setRotationAngle(Grip8_r1, 0.5236F, 0.0F, 0.0F);
		Grip8_r1.cubeList.add(new ModelBox(Grip8_r1, 0, 84, 0.5F, -37.0F, 1.6F, 3, 10, 1, 0.0F, false));

		Grip3_r1 = new ModelRenderer(this);
		Grip3_r1.setRotationPoint(-4.0F, 7.4929F, 19.6206F);
		grip.addChild(Grip3_r1);
		setRotationAngle(Grip3_r1, 0.5236F, 0.0F, 0.0F);
		Grip3_r1.cubeList.add(new ModelBox(Grip3_r1, 72, 35, 0.0F, -37.0F, 0.9F, 4, 10, 1, 0.0F, false));

		Grip2_r1 = new ModelRenderer(this);
		Grip2_r1.setRotationPoint(-4.0F, 9.6657F, 11.9819F);
		grip.addChild(Grip2_r1);
		setRotationAngle(Grip2_r1, 0.4189F, 0.0F, 0.0F);
		Grip2_r1.cubeList.add(new ModelBox(Grip2_r1, 0, 53, 0.0F, -36.0F, 0.0F, 4, 10, 1, 0.0F, false));

		Grip1_r1 = new ModelRenderer(this);
		Grip1_r1.setRotationPoint(-4.0F, 11.1822F, 7.2117F);
		grip.addChild(Grip1_r1);
		setRotationAngle(Grip1_r1, 0.2618F, 0.0F, 0.0F);
		Grip1_r1.cubeList.add(new ModelBox(Grip1_r1, 60, 59, 0.0F, -27.0F, 0.0F, 4, 1, 7, 0.0F, false));

		Grip32_r1 = new ModelRenderer(this);
		Grip32_r1.setRotationPoint(-4.0F, 11.0917F, -29.1927F);
		grip.addChild(Grip32_r1);
		setRotationAngle(Grip32_r1, -0.7854F, 0.0F, 0.0F);
		Grip32_r1.cubeList.add(new ModelBox(Grip32_r1, 65, 14, 0.0F, -36.9F, -14.0F, 4, 1, 2, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 21.397F, 55.5394F);
		gun.addChild(stock);
		stock.cubeList.add(new ModelBox(stock, 121, 86, -4.5F, -54.897F, -37.2394F, 1, 5, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 37, 84, -0.5F, -54.897F, -37.2394F, 1, 5, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 18, 0, -4.0F, -60.497F, -37.2394F, 4, 11, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 119, 0, -4.0F, -56.497F, -34.2394F, 4, 7, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 84, 116, -4.2F, -65.097F, -41.2394F, 4, 2, 27, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 198, -0.8F, -65.097F, -41.2394F, 1, 2, 27, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 168, 30, 0.4F, -63.397F, -41.2394F, 1, 3, 27, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 168, 0, -5.4F, -63.397F, -41.2394F, 1, 3, 27, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 168, 144, 0.4F, -60.397F, -34.2394F, 1, 1, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 110, 145, -5.4F, -60.397F, -34.2394F, 1, 1, 20, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 15, 76, 0.4F, -59.597F, -33.6394F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 9, 76, -5.4F, -59.597F, -33.6394F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 191, 60, 0.4F, -59.597F, -33.2394F, 1, 1, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 190, 144, -5.4F, -59.597F, -33.2394F, 1, 1, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 95, -4.0F, -49.497F, -17.2394F, 4, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 68, 78, -4.0F, -50.197F, -16.2394F, 4, 3, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 46, 18, -4.0F, -60.397F, -15.2394F, 4, 13, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 37, 35, -4.0F, -64.597F, -14.2394F, 4, 17, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 37, 84, -4.5F, -65.097F, -11.2394F, 5, 18, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 60, 35, -4.0F, -64.797F, -10.2394F, 4, 18, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 98, 29, -4.0F, -63.097F, -8.2394F, 4, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 46, 15, -4.0F, -49.497F, -8.2394F, 4, 1, 1, 0.0F, false));

		Stock32_r1 = new ModelRenderer(this);
		Stock32_r1.setRotationPoint(-4.0F, 12.0F, 1.0F);
		stock.addChild(Stock32_r1);
		setRotationAngle(Stock32_r1, 1.0472F, 0.0F, 0.0F);
		Stock32_r1.cubeList.add(new ModelBox(Stock32_r1, 0, 48, 0.0F, -38.4F, 46.3F, 4, 1, 2, 0.0F, false));

		Stock30_r1 = new ModelRenderer(this);
		Stock30_r1.setRotationPoint(-4.0F, -0.439F, -45.1685F);
		stock.addChild(Stock30_r1);
		setRotationAngle(Stock30_r1, 0.2094F, 0.0F, 0.0F);
		Stock30_r1.cubeList.add(new ModelBox(Stock30_r1, 69, 91, 0.0F, -45.1F, 46.3F, 4, 5, 1, 0.0F, false));

		Stock29_r1 = new ModelRenderer(this);
		Stock29_r1.setRotationPoint(-4.0F, -20.3828F, -64.4627F);
		stock.addChild(Stock29_r1);
		setRotationAngle(Stock29_r1, -0.2094F, 0.0F, 0.0F);
		Stock29_r1.cubeList.add(new ModelBox(Stock29_r1, 84, 92, 0.0F, -52.7F, 46.3F, 4, 5, 1, 0.0F, false));

		Stock27_r1 = new ModelRenderer(this);
		Stock27_r1.setRotationPoint(-4.0F, 6.3308F, -20.6364F);
		stock.addChild(Stock27_r1);
		setRotationAngle(Stock27_r1, 0.5236F, 0.0F, 0.0F);
		Stock27_r1.cubeList.add(new ModelBox(Stock27_r1, 84, 12, 0.0F, -55.4F, 45.3F, 4, 2, 1, 0.0F, false));

		Stock21_r1 = new ModelRenderer(this);
		Stock21_r1.setRotationPoint(-4.0F, 6.331F, -16.7101F);
		stock.addChild(Stock21_r1);
		setRotationAngle(Stock21_r1, 0.7854F, 0.0F, 0.0F);
		Stock21_r1.cubeList.add(new ModelBox(Stock21_r1, 100, 96, 0.0F, -37.8F, 37.9F, 4, 1, 1, 0.0F, false));

		Stock15_r1 = new ModelRenderer(this);
		Stock15_r1.setRotationPoint(-4.0F, -7.4985F, -19.4529F);
		stock.addChild(Stock15_r1);
		setRotationAngle(Stock15_r1, 0.6632F, 0.0F, 0.0F);
		Stock15_r1.cubeList.add(new ModelBox(Stock15_r1, 23, 76, -1.4F, -50.0F, 20.3F, 1, 1, 1, 0.0F, false));
		Stock15_r1.cubeList.add(new ModelBox(Stock15_r1, 29, 76, 4.4F, -50.0F, 20.3F, 1, 1, 1, 0.0F, false));

		Stock9_r1 = new ModelRenderer(this);
		Stock9_r1.setRotationPoint(-35.4956F, -19.7058F, -54.5394F);
		stock.addChild(Stock9_r1);
		setRotationAngle(Stock9_r1, 0.0F, 0.0F, 0.6109F);
		Stock9_r1.cubeList.add(new ModelBox(Stock9_r1, 168, 86, -0.4F, -55.1F, 13.3F, 1, 2, 27, 0.0F, false));

		Stock8_r1 = new ModelRenderer(this);
		Stock8_r1.setRotationPoint(28.2189F, -17.4115F, -54.5394F);
		stock.addChild(Stock8_r1);
		setRotationAngle(Stock8_r1, 0.0F, 0.0F, -0.6109F);
		Stock8_r1.cubeList.add(new ModelBox(Stock8_r1, 168, 115, 3.4F, -55.1F, 13.3F, 1, 2, 27, 0.0F, false));

		Stock5_r1 = new ModelRenderer(this);
		Stock5_r1.setRotationPoint(-4.0F, -5.8376F, -37.2095F);
		stock.addChild(Stock5_r1);
		setRotationAngle(Stock5_r1, 0.3316F, 0.0F, 0.0F);
		Stock5_r1.cubeList.add(new ModelBox(Stock5_r1, 0, 103, 0.0F, -50.0F, 19.3F, 4, 4, 1, 0.0F, false));

		shape = new ModelRenderer(this);
		shape.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(shape);
		shape.cubeList.add(new ModelBox(shape, 252, 83, -3.5F, -44.0F, -43.7F, 1, 1, 41, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.0F, -29.0F, -15.7F, 6, 1, 34, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.0F, -42.0F, 17.3F, 6, 13, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 42, 76, -5.0F, -34.0F, -17.7F, 6, 5, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 84, 37, -5.0F, -33.0F, -15.7F, 1, 4, 33, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 84, 0, 0.0F, -33.0F, -15.7F, 1, 4, 33, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 53, 109, -5.0F, -29.0F, -17.7F, 2, 1, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 45, 109, -1.0F, -29.0F, -17.7F, 2, 1, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 14, -4.5F, -33.0F, -40.7F, 5, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 37, 195, -0.3F, -33.0F, -40.7F, 1, 1, 21, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 168, 60, -4.7F, -33.0F, -40.7F, 1, 1, 21, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 107, 66, -0.3F, -32.0F, -22.3F, 1, 1, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 107, 29, -4.7F, -32.0F, -22.3F, 1, 1, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 143, 170, 0.1F, -39.0F, -40.7F, 1, 6, 23, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 197, 0, -5.1F, -38.0F, -40.7F, 1, 2, 23, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 102, 42, -5.1F, -29.0F, -17.7F, 1, 1, 4, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 84, -5.1F, -39.0F, -17.7F, 1, 6, 35, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 35, 0.1F, -39.0F, -17.7F, 1, 6, 35, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 59, 84, -5.1F, -41.0F, -40.7F, 1, 3, 4, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 59, 91, 0.1F, -41.0F, -40.7F, 1, 2, 4, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 33, 125, -5.1F, -35.0F, -40.7F, 1, 2, 23, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 102, 37, -5.1F, -36.0F, -40.7F, 1, 1, 4, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 63, 18, -5.1F, -36.0F, -19.7F, 1, 1, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 197, 115, -4.7F, -36.0F, -36.7F, 1, 1, 17, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 56, 4, -5.1F, -30.0F, -16.8F, 1, 1, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 105, 103, -5.1F, -33.0F, -18.0F, 1, 2, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 84, 170, -2.5F, -43.5F, -40.7F, 2, 1, 55, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 143, 170, -0.3F, -41.4F, -36.7F, 1, 3, 51, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -4.7F, -41.4F, -1.7F, 1, 4, 16, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 160, 200, -4.7F, -40.0F, -16.7F, 1, 1, 15, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 98, 101, 0.1F, -29.0F, -17.7F, 1, 1, 4, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 51, 47, 0.1F, -30.0F, -16.8F, 1, 1, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 7, 105, 0.1F, -33.0F, -18.0F, 1, 2, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 52, 251, -3.5F, -45.5F, -43.7F, 3, 2, 41, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 30, -4.0F, -26.1F, 38.6F, 4, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 168, 0.8F, -41.3F, -35.0F, 1, 2, 28, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 197, 30, 0.8F, -35.5F, -33.4F, 1, 2, 18, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 20, -4.5F, -41.9F, -40.7F, 5, 9, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 7, 111, -3.5F, -42.6F, -40.7F, 3, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 20, -3.5F, -37.6F, -52.7F, 3, 2, 12, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 211, 148, -3.5F, -42.3F, -52.7F, 3, 3, 12, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 168, -4.7F, -39.8F, -52.7F, 2, 3, 12, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 84, 86, -1.3F, -39.8F, -52.7F, 2, 3, 12, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 125, -3.5F, -43.3F, -67.2F, 3, 1, 27, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 108, 42, -3.5F, -45.3F, -44.9F, 3, 2, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 119, 116, -3.5F, -45.3F, -64.9F, 3, 1, 20, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 59, 109, -3.5F, -44.3F, -52.9F, 3, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 104, 101, -3.5F, -44.3F, -56.9F, 3, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 27, 59, -3.5F, -44.3F, -60.9F, 3, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 67, 109, -3.5F, -44.3F, -48.9F, 3, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 37, 66, -3.5F, -44.3F, -65.9F, 3, 1, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 197, 86, -4.0F, -42.3F, -67.2F, 4, 1, 15, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 84, 197, -4.0F, -35.5F, -67.2F, 4, 1, 15, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 84, 0, 0.9F, -40.4F, -67.2F, 1, 4, 15, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 0, 84, -5.9F, -40.4F, -67.2F, 1, 4, 15, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 65, 84, -2.1F, -41.1F, -107.0F, 1, 1, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 74, 7, -2.9F, -41.1F, -107.0F, 1, 2, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 17, 53, -2.5F, -36.2F, -52.0F, 1, 2, 8, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 37, 59, -4.0F, -36.3F, -43.0F, 4, 6, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 60, 59, -2.5F, -36.0F, -43.7F, 1, 5, 2, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 53, 29, -2.5F, -34.0F, -46.7F, 1, 1, 3, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 29, 0, -2.5F, -33.0F, -46.7F, 1, 2, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 100, 63, -2.5F, -31.0F, -46.7F, 1, 1, 4, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 28, 14, -3.3F, -30.6F, -43.0F, 2, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 12, 14, -1.7F, -30.6F, -43.0F, 1, 1, 1, 0.0F, false));
		shape.cubeList.add(new ModelBox(shape, 46, 0, -3.5F, -43.5F, -2.7F, 1, 1, 17, 0.0F, false));

		Shape195_r1 = new ModelRenderer(this);
		Shape195_r1.setRotationPoint(-34.2006F, -1.0894F, 1.0F);
		shape.addChild(Shape195_r1);
		setRotationAngle(Shape195_r1, 0.0F, 0.0F, 0.7854F);
		Shape195_r1.cubeList.add(new ModelBox(Shape195_r1, 30, 32, 0.7F, -43.0F, -44.0F, 1, 1, 1, 0.0F, false));

		Shape194_r1 = new ModelRenderer(this);
		Shape194_r1.setRotationPoint(-33.439F, -2.9279F, 1.0F);
		shape.addChild(Shape194_r1);
		setRotationAngle(Shape194_r1, 0.0F, 0.0F, 0.7854F);
		Shape194_r1.cubeList.add(new ModelBox(Shape194_r1, 48, 35, 3.3F, -43.0F, -44.0F, 1, 1, 1, 0.0F, false));

		Shape193_r1 = new ModelRenderer(this);
		Shape193_r1.setRotationPoint(-4.0F, -32.6971F, 18.1082F);
		shape.addChild(Shape193_r1);
		setRotationAngle(Shape193_r1, 0.7854F, 0.0F, 0.0F);
		Shape193_r1.cubeList.add(new ModelBox(Shape193_r1, 12, 49, 1.5F, -43.0F, -45.4F, 1, 1, 1, 0.0F, false));

		Shape192_r1 = new ModelRenderer(this);
		Shape192_r1.setRotationPoint(-4.0F, -34.1113F, 17.5225F);
		shape.addChild(Shape192_r1);
		setRotationAngle(Shape192_r1, 0.7854F, 0.0F, 0.0F);
		Shape192_r1.cubeList.add(new ModelBox(Shape192_r1, 21, 53, 1.5F, -43.0F, -47.4F, 1, 1, 1, 0.0F, false));

		Shape191_r1 = new ModelRenderer(this);
		Shape191_r1.setRotationPoint(-4.0F, 31.6367F, -44.9929F);
		shape.addChild(Shape191_r1);
		setRotationAngle(Shape191_r1, -0.7854F, 0.0F, 0.0F);
		Shape191_r1.cubeList.add(new ModelBox(Shape191_r1, 56, 15, 1.5F, -45.7F, -46.7F, 1, 1, 1, 0.0F, false));

		Shape190_r1 = new ModelRenderer(this);
		Shape190_r1.setRotationPoint(-4.0F, 30.2225F, -44.4071F);
		shape.addChild(Shape190_r1);
		setRotationAngle(Shape190_r1, -0.7854F, 0.0F, 0.0F);
		Shape190_r1.cubeList.add(new ModelBox(Shape190_r1, 56, 27, 1.5F, -45.7F, -44.7F, 1, 1, 1, 0.0F, false));

		Shape181_r1 = new ModelRenderer(this);
		Shape181_r1.setRotationPoint(29.6675F, -3.5195F, 1.0F);
		shape.addChild(Shape181_r1);
		setRotationAngle(Shape181_r1, 0.0F, 0.0F, -0.7854F);
		Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 58, 9, -1.9F, -47.4F, -64.7F, 1, 1, 1, 0.0F, false));
		Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 58, 11, -1.9F, -47.4F, -61.2F, 1, 1, 1, 0.0F, false));
		Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 54, 59, -1.9F, -47.4F, -57.7F, 1, 1, 1, 0.0F, false));
		Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 29, 65, -1.9F, -47.4F, -54.2F, 1, 1, 1, 0.0F, false));
		Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 46, 18, -1.9F, -48.4F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape178_r1 = new ModelRenderer(this);
		Shape178_r1.setRotationPoint(-42.3959F, -3.9041F, 1.0F);
		shape.addChild(Shape178_r1);
		setRotationAngle(Shape178_r1, 0.0F, 0.0F, 0.7854F);
		Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 10, 60, 0.0F, -53.3F, -64.7F, 1, 1, 1, 0.0F, false));
		Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 10, 62, 0.0F, -53.3F, -61.2F, 1, 1, 1, 0.0F, false));
		Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 17, 63, 0.0F, -53.3F, -57.7F, 1, 1, 1, 0.0F, false));
		Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 31, 68, 0.0F, -53.3F, -54.2F, 1, 1, 1, 0.0F, false));
		Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 196, 197, 0.0F, -54.3F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape173_r1 = new ModelRenderer(this);
		Shape173_r1.setRotationPoint(-36.4959F, -6.348F, 1.0F);
		shape.addChild(Shape173_r1);
		setRotationAngle(Shape173_r1, 0.0F, 0.0F, 0.7854F);
		Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 63, 21, 4.9F, -47.4F, -64.7F, 1, 1, 1, 0.0F, false));
		Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 63, 26, 4.9F, -47.4F, -61.2F, 1, 1, 1, 0.0F, false));
		Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 63, 28, 4.9F, -47.4F, -57.7F, 1, 1, 1, 0.0F, false));
		Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 68, 68, 4.9F, -47.4F, -54.2F, 1, 1, 1, 0.0F, false));
		Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 0, 103, 4.9F, -48.4F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape170_r1 = new ModelRenderer(this);
		Shape170_r1.setRotationPoint(-41.2243F, -6.7325F, 1.0F);
		shape.addChild(Shape170_r1);
		setRotationAngle(Shape170_r1, 0.0F, 0.0F, 0.7854F);
		Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 29, 63, 5.0F, -54.3F, -61.2F, 1, 1, 1, 0.0F, false));
		Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 11, 64, 5.0F, -54.3F, -64.7F, 1, 1, 1, 0.0F, false));
		Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 65, 0, 5.0F, -54.3F, -57.7F, 1, 1, 1, 0.0F, false));
		Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 65, 2, 5.0F, -54.3F, -68.2F, 1, 1, 1, 0.0F, false));
		Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 75, 14, 5.0F, -54.3F, -54.2F, 1, 1, 1, 0.0F, false));
		Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 143, 199, 4.0F, -54.3F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape166_r1 = new ModelRenderer(this);
		Shape166_r1.setRotationPoint(-36.8805F, -1.6195F, 1.0F);
		shape.addChild(Shape166_r1);
		setRotationAngle(Shape166_r1, 0.0F, 0.0F, 0.7854F);
		Shape166_r1.cubeList.add(new ModelBox(Shape166_r1, 65, 7, -2.0F, -47.5F, -68.2F, 1, 1, 1, 0.0F, false));
		Shape166_r1.cubeList.add(new ModelBox(Shape166_r1, 45, 150, -1.0F, -47.5F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape165_r1 = new ModelRenderer(this);
		Shape165_r1.setRotationPoint(30.052F, 1.2089F, 1.0F);
		shape.addChild(Shape165_r1);
		setRotationAngle(Shape165_r1, 0.0F, 0.0F, -0.7854F);
		Shape165_r1.cubeList.add(new ModelBox(Shape165_r1, 65, 9, 5.0F, -47.5F, -68.2F, 1, 1, 1, 0.0F, false));
		Shape165_r1.cubeList.add(new ModelBox(Shape165_r1, 107, 198, 4.0F, -47.5F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape164_r1 = new ModelRenderer(this);
		Shape164_r1.setRotationPoint(34.3959F, -3.9041F, 1.0F);
		shape.addChild(Shape164_r1);
		setRotationAngle(Shape164_r1, 0.0F, 0.0F, -0.7854F);
		Shape164_r1.cubeList.add(new ModelBox(Shape164_r1, 17, 65, -2.0F, -54.3F, -68.2F, 1, 1, 1, 0.0F, false));

		Shape158_r1 = new ModelRenderer(this);
		Shape158_r1.setRotationPoint(-41.6089F, -2.0041F, 1.0F);
		shape.addChild(Shape158_r1);
		setRotationAngle(Shape158_r1, 0.0F, 0.0F, 0.7854F);
		Shape158_r1.cubeList.add(new ModelBox(Shape158_r1, 0, 53, -1.9F, -53.4F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape156_r1 = new ModelRenderer(this);
		Shape156_r1.setRotationPoint(34.7805F, 0.8243F, 1.0F);
		shape.addChild(Shape156_r1);
		setRotationAngle(Shape156_r1, 0.0F, 0.0F, -0.7854F);
		Shape156_r1.cubeList.add(new ModelBox(Shape156_r1, 132, 137, 4.9F, -53.4F, -68.2F, 1, 1, 15, 0.0F, false));

		Shape147_r1 = new ModelRenderer(this);
		Shape147_r1.setRotationPoint(-4.0F, 42.0141F, -66.4346F);
		shape.addChild(Shape147_r1);
		setRotationAngle(Shape147_r1, -0.8727F, 0.0F, 0.0F);
		Shape147_r1.cubeList.add(new ModelBox(Shape147_r1, 90, 65, 0.5F, -57.3F, -65.9F, 3, 3, 1, 0.0F, false));

		Shape126_r1 = new ModelRenderer(this);
		Shape126_r1.setRotationPoint(30.6834F, 0.5332F, 1.0F);
		shape.addChild(Shape126_r1);
		setRotationAngle(Shape126_r1, 0.0F, 0.0F, -0.7854F);
		Shape126_r1.cubeList.add(new ModelBox(Shape126_r1, 84, 19, 4.2F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));
		Shape126_r1.cubeList.add(new ModelBox(Shape126_r1, 168, 0, 3.5F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));

		Shape125_r1 = new ModelRenderer(this);
		Shape125_r1.setRotationPoint(-37.5118F, -2.2953F, 1.0F);
		shape.addChild(Shape125_r1);
		setRotationAngle(Shape125_r1, 0.0F, 0.0F, 0.7854F);
		Shape125_r1.cubeList.add(new ModelBox(Shape125_r1, 84, 101, -1.2F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));
		Shape125_r1.cubeList.add(new ModelBox(Shape125_r1, 168, 13, -0.5F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));

		Shape124_r1 = new ModelRenderer(this);
		Shape124_r1.setRotationPoint(-40.4515F, -5.9982F, 1.0F);
		shape.addChild(Shape124_r1);
		setRotationAngle(Shape124_r1, 0.0F, 0.0F, 0.7854F);
		Shape124_r1.cubeList.add(new ModelBox(Shape124_r1, 140, 62, 4.2F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));
		Shape124_r1.cubeList.add(new ModelBox(Shape124_r1, 168, 43, 3.5F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));

		Shape123_r1 = new ModelRenderer(this);
		Shape123_r1.setRotationPoint(33.6231F, -3.1698F, 1.0F);
		shape.addChild(Shape123_r1);
		setRotationAngle(Shape123_r1, 0.0F, 0.0F, -0.7854F);
		Shape123_r1.cubeList.add(new ModelBox(Shape123_r1, 0, 153, -1.2F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));
		Shape123_r1.cubeList.add(new ModelBox(Shape123_r1, 168, 30, -0.5F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));

		Shape105_r1 = new ModelRenderer(this);
		Shape105_r1.setRotationPoint(-4.0F, -3.3223F, -44.4339F);
		shape.addChild(Shape105_r1);
		setRotationAngle(Shape105_r1, -0.9599F, 0.0F, 0.0F);
		Shape105_r1.cubeList.add(new ModelBox(Shape105_r1, 51, 35, 4.8F, -51.3F, -10.0F, 1, 10, 2, 0.0F, false));

		Shape104_r1 = new ModelRenderer(this);
		Shape104_r1.setRotationPoint(-4.0F, 16.5467F, -13.2641F);
		shape.addChild(Shape104_r1);
		setRotationAngle(Shape104_r1, -0.2618F, 0.0F, 0.0F);
		Shape104_r1.cubeList.add(new ModelBox(Shape104_r1, 75, 59, 4.8F, -51.9F, -24.4F, 1, 5, 2, 0.0F, false));

		Shape102_r1 = new ModelRenderer(this);
		Shape102_r1.setRotationPoint(-4.0F, 0.9345F, 13.0507F);
		shape.addChild(Shape102_r1);
		setRotationAngle(Shape102_r1, 0.2618F, 0.0F, 0.0F);
		Shape102_r1.cubeList.add(new ModelBox(Shape102_r1, 17, 53, 4.8F, -51.3F, -36.0F, 1, 6, 2, 0.0F, false));

		Shape100_r1 = new ModelRenderer(this);
		Shape100_r1.setRotationPoint(28.6086F, 3.4212F, 1.0F);
		shape.addChild(Shape100_r1);
		setRotationAngle(Shape100_r1, 0.0F, 0.0F, -0.6109F);
		Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 37, 59, 2.7F, -53.0F, -22.0F, 1, 1, 10, 0.0F, false));
		Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 17, 84, 2.7F, -55.0F, -12.0F, 1, 3, 4, 0.0F, false));
		Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 49, 59, 2.7F, -53.0F, -34.0F, 1, 1, 9, 0.0F, false));
		Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 27, 53, 2.7F, -55.0F, -25.0F, 1, 3, 3, 0.0F, false));
		Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 84, 170, 2.7F, -56.0F, -34.0F, 1, 1, 26, 0.0F, false));
		Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 18, 20, 2.7F, -56.0F, -36.0F, 1, 4, 2, 0.0F, false));

		Shape73_r1 = new ModelRenderer(this);
		Shape73_r1.setRotationPoint(-4.0F, 7.9485F, -43.4999F);
		shape.addChild(Shape73_r1);
		setRotationAngle(Shape73_r1, -0.8378F, 0.0F, 0.0F);
		Shape73_r1.cubeList.add(new ModelBox(Shape73_r1, 46, 0, -0.7F, -52.0F, -17.7F, 1, 3, 1, 0.0F, false));

		Shape64_r1 = new ModelRenderer(this);
		Shape64_r1.setRotationPoint(-4.0F, 9.7164F, -35.9132F);
		shape.addChild(Shape64_r1);
		setRotationAngle(Shape64_r1, -0.7854F, 0.0F, 0.0F);
		Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 12, 43, 4.1F, -45.7F, -15.7F, 1, 2, 1, 0.0F, false));
		Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 56, 24, -1.1F, -45.7F, -15.7F, 1, 2, 1, 0.0F, false));

		Shape61_r1 = new ModelRenderer(this);
		Shape61_r1.setRotationPoint(-4.0F, -2.3243F, 20.259F);
		shape.addChild(Shape61_r1);
		setRotationAngle(Shape61_r1, 0.5236F, 0.0F, 0.0F);
		Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 10, 53, 4.1F, -43.1F, -17.1F, 1, 3, 1, 0.0F, false));
		Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 53, 50, -1.1F, -43.1F, -17.1F, 1, 3, 1, 0.0F, false));

		Shape53_r1 = new ModelRenderer(this);
		Shape53_r1.setRotationPoint(-4.0F, -29.7976F, 25.1082F);
		shape.addChild(Shape53_r1);
		setRotationAngle(Shape53_r1, 0.7854F, 0.0F, 0.0F);
		Shape53_r1.cubeList.add(new ModelBox(Shape53_r1, 0, 76, -1.1F, -50.0F, -38.4F, 1, 1, 1, 0.0F, false));

		Shape52_r1 = new ModelRenderer(this);
		Shape52_r1.setRotationPoint(-4.0F, 9.0225F, -43.0876F);
		shape.addChild(Shape52_r1);
		setRotationAngle(Shape52_r1, -0.8378F, 0.0F, 0.0F);
		Shape52_r1.cubeList.add(new ModelBox(Shape52_r1, 56, 18, -1.1F, -51.0F, -18.7F, 1, 2, 1, 0.0F, false));

		Shape51_r1 = new ModelRenderer(this);
		Shape51_r1.setRotationPoint(-4.0F, 8.4815F, -20.9532F);
		shape.addChild(Shape51_r1);
		setRotationAngle(Shape51_r1, -0.4189F, 0.0F, 0.0F);
		Shape51_r1.cubeList.add(new ModelBox(Shape51_r1, 56, 21, -0.7F, -53.4F, -2.7F, 1, 2, 1, 0.0F, false));

		Shape49_r1 = new ModelRenderer(this);
		Shape49_r1.setRotationPoint(-33.4731F, 2.4995F, 1.0F);
		shape.addChild(Shape49_r1);
		setRotationAngle(Shape49_r1, 0.0F, 0.0F, 0.576F);
		Shape49_r1.cubeList.add(new ModelBox(Shape49_r1, 0, 35, 0.3F, -54.5F, -2.7F, 1, 2, 16, 0.0F, false));

		Shape47_r1 = new ModelRenderer(this);
		Shape47_r1.setRotationPoint(26.1184F, 4.6781F, 1.0F);
		shape.addChild(Shape47_r1);
		setRotationAngle(Shape47_r1, 0.0F, 0.0F, -0.576F);
		Shape47_r1.cubeList.add(new ModelBox(Shape47_r1, 115, 226, 2.7F, -54.5F, -37.7F, 1, 2, 51, 0.0F, false));

		Shape44_r1 = new ModelRenderer(this);
		Shape44_r1.setRotationPoint(27.9595F, 3.5627F, 1.0F);
		shape.addChild(Shape44_r1);
		setRotationAngle(Shape44_r1, 0.0F, 0.0F, -0.6109F);
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 84, 19, 2.6F, -54.9F, -41.7F, 1, 3, 4, 0.0F, false));

		Shape43_r1 = new ModelRenderer(this);
		Shape43_r1.setRotationPoint(-35.2362F, 1.2684F, 1.0F);
		shape.addChild(Shape43_r1);
		setRotationAngle(Shape43_r1, 0.0F, 0.0F, 0.6109F);
		Shape43_r1.cubeList.add(new ModelBox(Shape43_r1, 84, 37, 0.4F, -54.9F, -41.7F, 1, 3, 4, 0.0F, false));

		Shape32_r1 = new ModelRenderer(this);
		Shape32_r1.setRotationPoint(-4.0F, -4.9324F, 20.7928F);
		shape.addChild(Shape32_r1);
		setRotationAngle(Shape32_r1, 0.5236F, 0.0F, 0.0F);
		Shape32_r1.cubeList.add(new ModelBox(Shape32_r1, 49, 59, -1.1F, -45.4F, -21.7F, 1, 6, 3, 0.0F, false));
		Shape32_r1.cubeList.add(new ModelBox(Shape32_r1, 27, 84, 4.1F, -45.4F, -21.7F, 1, 6, 3, 0.0F, false));

		Shape14_r1 = new ModelRenderer(this);
		Shape14_r1.setRotationPoint(-4.0F, 17.9816F, -6.3965F);
		shape.addChild(Shape14_r1);
		setRotationAngle(Shape14_r1, -0.1571F, 0.0F, 0.0F);
		Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 30, 168, -0.7F, -47.0F, -41.7F, 1, 3, 24, 0.0F, false));
		Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 196, 170, 3.7F, -47.0F, -41.7F, 1, 3, 24, 0.0F, false));
		Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 99, 251, -0.5F, -45.0F, -41.7F, 5, 1, 24, 0.0F, false));

		Shape28_r1 = new ModelRenderer(this);
		Shape28_r1.setRotationPoint(-4.0F, 8.6012F, 7.186F);
		shape.addChild(Shape28_r1);
		setRotationAngle(Shape28_r1, 0.1571F, 0.0F, 0.0F);
		Shape28_r1.cubeList.add(new ModelBox(Shape28_r1, 28, 20, 1.0F, -41.0F, -18.5F, 2, 4, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 168, -3.9F, -38.7F, -122.0F, 1, 1, 82, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 168, 0, -2.5F, -37.3F, -122.0F, 1, 1, 82, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 168, 83, -1.1F, -38.7F, -122.0F, 1, 1, 82, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 168, 166, -2.5F, -40.1F, -122.0F, 1, 1, 82, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 100, 91, -2.1F, -42.5F, -106.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 0, -2.9F, -42.1F, -106.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 5, -2.9F, -42.5F, -106.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 28, 39, -2.3F, -41.9F, -104.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 10, 46, -2.7F, -41.9F, -104.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 10, -2.3F, -42.7F, -106.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 84, 101, -2.7F, -42.7F, -106.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 169, 249, -2.7F, -42.3F, -102.0F, 1, 1, 50, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 221, 250, -2.3F, -42.3F, -102.0F, 1, 1, 50, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 251, -2.5F, -42.1F, -102.0F, 1, 1, 50, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 252, 0, -2.5F, -42.5F, -102.0F, 1, 1, 50, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 100, 86, -2.1F, -42.1F, -106.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 90, 77, -4.0F, -38.4F, -108.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 93, -1.0F, -38.4F, -108.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 94, 65, -4.0F, -39.0F, -108.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 96, 74, -1.0F, -39.0F, -108.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 84, 86, -2.9F, -37.3F, -108.0F, 1, 2, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 91, -2.1F, -37.3F, -108.0F, 1, 2, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 98, 58, -2.9F, -40.1F, -108.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 99, -2.1F, -40.1F, -108.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 56, 76, -3.0F, -35.7F, -126.5F, 2, 2, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 67, 71, -3.0F, -41.0F, -127.0F, 2, 2, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 65, 7, -4.8F, -39.2F, -127.0F, 2, 2, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 65, 0, -1.2F, -39.2F, -127.0F, 2, 2, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 26, -3.0F, -37.4F, -127.0F, 2, 2, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 18, -3.0F, -41.2F, -135.0F, 2, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 67, -3.5F, -41.2F, -129.0F, 3, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 20, -3.0F, -37.2F, -135.0F, 2, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 46, -3.5F, -37.2F, -129.0F, 3, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 84, 106, -0.9F, -39.8F, -129.0F, 2, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 61, -5.1F, -39.8F, -129.0F, 2, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 27, 103, -5.1F, -39.6F, -137.0F, 2, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 30, 44, -5.1F, -39.6F, -133.0F, 1, 3, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 91, 0, -0.9F, -39.8F, -137.0F, 2, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 12, 39, 0.1F, -39.8F, -133.0F, 1, 3, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 0, -3.5F, -41.2F, -137.0F, 3, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 24, 35, -3.5F, -37.2F, -137.0F, 3, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 110, 79, -3.5F, -41.2F, -133.0F, 3, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 74, 110, -3.5F, -36.2F, -133.0F, 3, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 14, -4.0F, -36.6F, -133.0F, 4, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 25, 110, -3.5F, -41.0F, -133.0F, 3, 1, 1, 0.0F, false));

		Muzzle25_r1 = new ModelRenderer(this);
		Muzzle25_r1.setRotationPoint(-36.934F, -1.8902F, 1.0F);
		barrel.addChild(Muzzle25_r1);
		setRotationAngle(Muzzle25_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle25_r1.cubeList.add(new ModelBox(Muzzle25_r1, 28, 42, -2.0F, -48.1F, -134.0F, 2, 1, 1, 0.0F, false));
		Muzzle25_r1.cubeList.add(new ModelBox(Muzzle25_r1, 65, 97, -2.2F, -49.2F, -130.0F, 2, 2, 2, 0.0F, false));

		Muzzle27_r1 = new ModelRenderer(this);
		Muzzle27_r1.setRotationPoint(30.4006F, 0.6503F, 1.0F);
		barrel.addChild(Muzzle27_r1);
		setRotationAngle(Muzzle27_r1, 0.0F, 0.0F, -0.7854F);
		Muzzle27_r1.cubeList.add(new ModelBox(Muzzle27_r1, 18, 49, 3.5F, -48.2F, -134.0F, 2, 1, 1, 0.0F, false));
		Muzzle27_r1.cubeList.add(new ModelBox(Muzzle27_r1, 107, 10, 3.5F, -49.2F, -138.0F, 2, 2, 2, 0.0F, false));
		Muzzle27_r1.cubeList.add(new ModelBox(Muzzle27_r1, 0, 108, 3.5F, -49.2F, -130.0F, 2, 2, 2, 0.0F, false));

		Muzzle31_r1 = new ModelRenderer(this);
		Muzzle31_r1.setRotationPoint(-41.4716F, -3.9355F, 1.0F);
		barrel.addChild(Muzzle31_r1);
		setRotationAngle(Muzzle31_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle31_r1.cubeList.add(new ModelBox(Muzzle31_r1, 49, 95, 0.5F, -53.2F, -138.0F, 2, 2, 2, 0.0F, false));
		Muzzle31_r1.cubeList.add(new ModelBox(Muzzle31_r1, 29, 28, 0.5F, -53.2F, -134.0F, 1, 2, 1, 0.0F, false));

		Muzzle15_r1 = new ModelRenderer(this);
		Muzzle15_r1.setRotationPoint(29.5393F, -1.2699F, 1.0F);
		barrel.addChild(Muzzle15_r1);
		setRotationAngle(Muzzle15_r1, 0.0F, 0.0F, -0.711F);
		Muzzle15_r1.cubeList.add(new ModelBox(Muzzle15_r1, 98, 106, -1.1F, -51.8F, -130.0F, 2, 2, 2, 0.0F, false));

		Muzzle29_r1 = new ModelRenderer(this);
		Muzzle29_r1.setRotationPoint(-39.259F, -4.5908F, 1.0F);
		barrel.addChild(Muzzle29_r1);
		setRotationAngle(Muzzle29_r1, 0.0F, 0.0F, 0.7482F);
		Muzzle29_r1.cubeList.add(new ModelBox(Muzzle29_r1, 56, 7, 3.5F, -53.2F, -134.0F, 2, 1, 1, 0.0F, false));
		Muzzle29_r1.cubeList.add(new ModelBox(Muzzle29_r1, 107, 5, 3.5F, -53.2F, -138.0F, 2, 2, 2, 0.0F, false));
		Muzzle29_r1.cubeList.add(new ModelBox(Muzzle29_r1, 17, 108, 3.5F, -53.2F, -130.0F, 2, 2, 2, 0.0F, false));

		Muzzle33_r1 = new ModelRenderer(this);
		Muzzle33_r1.setRotationPoint(-36.8462F, -2.1024F, 1.0F);
		barrel.addChild(Muzzle33_r1);
		setRotationAngle(Muzzle33_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle33_r1.cubeList.add(new ModelBox(Muzzle33_r1, 104, 108, -1.9F, -47.9F, -138.0F, 2, 1, 2, 0.0F, false));

		Muzzle4_r1 = new ModelRenderer(this);
		Muzzle4_r1.setRotationPoint(30.9955F, 0.4867F, 1.0F);
		barrel.addChild(Muzzle4_r1);
		setRotationAngle(Muzzle4_r1, 0.0F, 0.0F, -0.7854F);
		Muzzle4_r1.cubeList.add(new ModelBox(Muzzle4_r1, 23, 44, 4.3F, -49.0F, -128.0F, 1, 1, 5, 0.0F, false));

		Muzzle12_r1 = new ModelRenderer(this);
		Muzzle12_r1.setRotationPoint(-37.824F, -2.3417F, 1.0F);
		barrel.addChild(Muzzle12_r1);
		setRotationAngle(Muzzle12_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle12_r1.cubeList.add(new ModelBox(Muzzle12_r1, 46, 50, -1.3F, -49.0F, -128.0F, 1, 1, 5, 0.0F, false));

		Muzzle13_r1 = new ModelRenderer(this);
		Muzzle13_r1.setRotationPoint(-37.224F, -2.5902F, 1.0F);
		barrel.addChild(Muzzle13_r1);
		setRotationAngle(Muzzle13_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 67, 50, -1.0F, -48.4F, -128.0F, 2, 1, 5, 0.0F, false));

		Muzzle3_r1 = new ModelRenderer(this);
		Muzzle3_r1.setRotationPoint(30.3955F, 0.2382F, 1.0F);
		barrel.addChild(Muzzle3_r1);
		setRotationAngle(Muzzle3_r1, 0.0F, 0.0F, -0.7854F);
		Muzzle3_r1.cubeList.add(new ModelBox(Muzzle3_r1, 0, 76, 3.0F, -48.4F, -128.0F, 2, 1, 5, 0.0F, false));

		Muzzle10_r1 = new ModelRenderer(this);
		Muzzle10_r1.setRotationPoint(33.1696F, -3.0648F, 1.0F);
		barrel.addChild(Muzzle10_r1);
		setRotationAngle(Muzzle10_r1, 0.0F, 0.0F, -0.7854F);
		Muzzle10_r1.cubeList.add(new ModelBox(Muzzle10_r1, 51, 9, -1.3F, -52.4F, -128.0F, 1, 1, 5, 0.0F, false));

		Muzzle9_r1 = new ModelRenderer(this);
		Muzzle9_r1.setRotationPoint(33.7696F, -2.8162F, 1.0F);
		barrel.addChild(Muzzle9_r1);
		setRotationAngle(Muzzle9_r1, 0.0F, 0.0F, -0.7854F);
		Muzzle9_r1.cubeList.add(new ModelBox(Muzzle9_r1, 14, 76, -1.0F, -53.0F, -128.0F, 2, 1, 5, 0.0F, false));

		Muzzle6_r1 = new ModelRenderer(this);
		Muzzle6_r1.setRotationPoint(-39.998F, -5.8932F, 1.0F);
		barrel.addChild(Muzzle6_r1);
		setRotationAngle(Muzzle6_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle6_r1.cubeList.add(new ModelBox(Muzzle6_r1, 84, 0, 4.3F, -52.4F, -128.0F, 1, 1, 5, 0.0F, false));

		Muzzle7_r1 = new ModelRenderer(this);
		Muzzle7_r1.setRotationPoint(-40.598F, -5.6447F, 1.0F);
		barrel.addChild(Muzzle7_r1);
		setRotationAngle(Muzzle7_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle7_r1.cubeList.add(new ModelBox(Muzzle7_r1, 28, 76, 3.0F, -53.0F, -128.0F, 2, 1, 5, 0.0F, false));

		Barrel22_r1 = new ModelRenderer(this);
		Barrel22_r1.setRotationPoint(-39.9909F, -5.3103F, 1.0F);
		barrel.addChild(Barrel22_r1);
		setRotationAngle(Barrel22_r1, 0.0F, 0.0F, 0.7854F);
		Barrel22_r1.cubeList.add(new ModelBox(Barrel22_r1, 98, 24, 2.9F, -52.1F, -109.0F, 1, 1, 4, 0.0F, false));

		Barrel21_r1 = new ModelRenderer(this);
		Barrel21_r1.setRotationPoint(33.1624F, -2.4819F, 1.0F);
		barrel.addChild(Barrel21_r1);
		setRotationAngle(Barrel21_r1, 0.0F, 0.0F, -0.7854F);
		Barrel21_r1.cubeList.add(new ModelBox(Barrel21_r1, 98, 19, 0.1F, -52.1F, -109.0F, 1, 1, 4, 0.0F, false));

		Barrel12_r1 = new ModelRenderer(this);
		Barrel12_r1.setRotationPoint(31.0026F, -0.0961F, 1.0F);
		barrel.addChild(Barrel12_r1);
		setRotationAngle(Barrel12_r1, 0.0F, 0.0F, -0.7854F);
		Barrel12_r1.cubeList.add(new ModelBox(Barrel12_r1, 69, 97, 2.9F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));
		Barrel12_r1.cubeList.add(new ModelBox(Barrel12_r1, 23, 76, 3.5F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));

		Barrel11_r1 = new ModelRenderer(this);
		Barrel11_r1.setRotationPoint(-37.8311F, -2.9246F, 1.0F);
		barrel.addChild(Barrel11_r1);
		setRotationAngle(Barrel11_r1, 0.0F, 0.0F, 0.7854F);
		Barrel11_r1.cubeList.add(new ModelBox(Barrel11_r1, 59, 97, 0.1F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));
		Barrel11_r1.cubeList.add(new ModelBox(Barrel11_r1, 9, 76, -0.5F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));

		Barrel20_r1 = new ModelRenderer(this);
		Barrel20_r1.setRotationPoint(-39.8909F, -5.3518F, 1.0F);
		barrel.addChild(Barrel20_r1);
		setRotationAngle(Barrel20_r1, 0.0F, 0.0F, 0.7854F);
		Barrel20_r1.cubeList.add(new ModelBox(Barrel20_r1, 84, 65, 3.4F, -52.0F, -109.0F, 1, 1, 4, 0.0F, false));

		Barrel19_r1 = new ModelRenderer(this);
		Barrel19_r1.setRotationPoint(33.0624F, -2.5233F, 1.0F);
		barrel.addChild(Barrel19_r1);
		setRotationAngle(Barrel19_r1, 0.0F, 0.0F, -0.7854F);
		Barrel19_r1.cubeList.add(new ModelBox(Barrel19_r1, 84, 26, -0.4F, -52.0F, -109.0F, 1, 1, 4, 0.0F, false));

		Barrel25_r1 = new ModelRenderer(this);
		Barrel25_r1.setRotationPoint(-4.0F, 66.3224F, -55.2364F);
		barrel.addChild(Barrel25_r1);
		setRotationAngle(Barrel25_r1, -0.6632F, 0.0F, 0.0F);
		Barrel25_r1.cubeList.add(new ModelBox(Barrel25_r1, 18, 35, 1.9F, -54.5F, -107.0F, 1, 3, 1, 0.0F, false));
		Barrel25_r1.cubeList.add(new ModelBox(Barrel25_r1, 12, 35, 1.1F, -54.5F, -107.0F, 1, 3, 1, 0.0F, false));

		Barrel2_r1 = new ModelRenderer(this);
		Barrel2_r1.setRotationPoint(33.5725F, -1.492F, 1.0F);
		barrel.addChild(Barrel2_r1);
		setRotationAngle(Barrel2_r1, 0.0F, 0.0F, -0.7854F);
		Barrel2_r1.cubeList.add(new ModelBox(Barrel2_r1, 84, 86, 1.5F, -52.1F, -123.0F, 1, 2, 82, 0.0F, false));

		Barrel4_r1 = new ModelRenderer(this);
		Barrel4_r1.setRotationPoint(-38.0009F, -5.3145F, 1.0F);
		barrel.addChild(Barrel4_r1);
		setRotationAngle(Barrel4_r1, 0.0F, 0.0F, 0.7854F);
		Barrel4_r1.cubeList.add(new ModelBox(Barrel4_r1, 84, 2, 2.9F, -49.7F, -123.0F, 1, 2, 82, 0.0F, false));

		Barrel6_r1 = new ModelRenderer(this);
		Barrel6_r1.setRotationPoint(31.1725F, -2.4861F, 1.0F);
		barrel.addChild(Barrel6_r1);
		setRotationAngle(Barrel6_r1, 0.0F, 0.0F, -0.7854F);
		Barrel6_r1.cubeList.add(new ModelBox(Barrel6_r1, 0, 84, 0.1F, -49.7F, -123.0F, 1, 2, 82, 0.0F, false));

		Barrel8_r1 = new ModelRenderer(this);
		Barrel8_r1.setRotationPoint(-40.4009F, -4.3204F, 1.0F);
		barrel.addChild(Barrel8_r1);
		setRotationAngle(Barrel8_r1, 0.0F, 0.0F, 0.7854F);
		Barrel8_r1.cubeList.add(new ModelBox(Barrel8_r1, 0, 0, 1.5F, -52.1F, -123.0F, 1, 2, 82, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}