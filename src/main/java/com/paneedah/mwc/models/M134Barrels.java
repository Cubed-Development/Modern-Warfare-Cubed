package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M134Barrels extends ModelWithAttachments {
	private final ModelRenderer Barrels;
	private final ModelRenderer barrel1;
	private final ModelRenderer BarrelBlock24_r1;
	private final ModelRenderer BarrelBlock23_r1;
	private final ModelRenderer BarrelBlock24_r2;
	private final ModelRenderer BarrelBlock23_r2;
	private final ModelRenderer barrel2;
	private final ModelRenderer BarrelBlock24_r3;
	private final ModelRenderer BarrelBlock23_r3;
	private final ModelRenderer BarrelBlock24_r4;
	private final ModelRenderer BarrelBlock23_r4;
	private final ModelRenderer barrel3;
	private final ModelRenderer BarrelBlock24_r5;
	private final ModelRenderer BarrelBlock23_r5;
	private final ModelRenderer BarrelBlock24_r6;
	private final ModelRenderer BarrelBlock23_r6;
	private final ModelRenderer barrel4;
	private final ModelRenderer BarrelBlock24_r7;
	private final ModelRenderer BarrelBlock23_r7;
	private final ModelRenderer BarrelBlock24_r8;
	private final ModelRenderer BarrelBlock23_r8;
	private final ModelRenderer barrel5;
	private final ModelRenderer BarrelBlock24_r9;
	private final ModelRenderer BarrelBlock23_r9;
	private final ModelRenderer BarrelBlock24_r10;
	private final ModelRenderer BarrelBlock23_r10;
	private final ModelRenderer barrel6;
	private final ModelRenderer BarrelBlock24_r11;
	private final ModelRenderer BarrelBlock23_r11;
	private final ModelRenderer BarrelBlock24_r12;
	private final ModelRenderer BarrelBlock23_r12;
	private final ModelRenderer barrelbelt;
	private final ModelRenderer BarrelCore19_r1;
	private final ModelRenderer BarrelCore20_r1;
	private final ModelRenderer BarrelCore21_r1;
	private final ModelRenderer BarrelCore22_r1;
	private final ModelRenderer BarrelCore39_r1;
	private final ModelRenderer BarrelCore36_r1;
	private final ModelRenderer BarrelCore39_r2;
	private final ModelRenderer BarrelCore36_r2;
	private final ModelRenderer BarrelCore36_r3;
	private final ModelRenderer BarrelCore39_r3;
	private final ModelRenderer BarrelCore39_r4;
	private final ModelRenderer BarrelCore36_r4;

	public M134Barrels() {
		textureWidth = 600;
		textureHeight = 600;

		Barrels = new ModelRenderer(this);
		Barrels.setRotationPoint(-15.2095F, 16.2504F, 0.0F);
		

		barrel1 = new ModelRenderer(this);
		barrel1.setRotationPoint(16.5857F, -12.7043F, -39.5F);
		Barrels.addChild(barrel1);
		barrel1.cubeList.add(new ModelBox(barrel1, 455, 193, 0.2071F, -2.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel1.cubeList.add(new ModelBox(barrel1, 455, 129, 1.2071F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel1.cubeList.add(new ModelBox(barrel1, 455, 65, 0.2071F, -0.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel1.cubeList.add(new ModelBox(barrel1, 455, 1, -0.7929F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r1 = new ModelRenderer(this);
		BarrelBlock24_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel1.addChild(BarrelBlock24_r1);
		setRotationAngle(BarrelBlock24_r1, 0.0F, 0.0F, -0.7854F);
		BarrelBlock24_r1.cubeList.add(new ModelBox(BarrelBlock24_r1, 390, 384, -0.4F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r1.cubeList.add(new ModelBox(BarrelBlock24_r1, 260, 448, -0.4F, -0.1F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r1 = new ModelRenderer(this);
		BarrelBlock23_r1.setRotationPoint(1.7071F, 0.2929F, 0.0F);
		barrel1.addChild(BarrelBlock23_r1);
		setRotationAngle(BarrelBlock23_r1, 0.0F, 0.0F, 0.7854F);
		BarrelBlock23_r1.cubeList.add(new ModelBox(BarrelBlock23_r1, 0, 448, -1.0F, -0.1F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r1.cubeList.add(new ModelBox(BarrelBlock23_r1, 130, 448, -1.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r2 = new ModelRenderer(this);
		BarrelBlock24_r2.setRotationPoint(0.0F, -1.3922F, 0.0F);
		barrel1.addChild(BarrelBlock24_r2);
		setRotationAngle(BarrelBlock24_r2, 0.0F, 0.0F, 0.7854F);
		BarrelBlock24_r2.cubeList.add(new ModelBox(BarrelBlock24_r2, 390, 448, -0.4F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r2.cubeList.add(new ModelBox(BarrelBlock24_r2, 65, 449, -0.4F, -0.1F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r2 = new ModelRenderer(this);
		BarrelBlock23_r2.setRotationPoint(1.7071F, -1.6851F, 0.0F);
		barrel1.addChild(BarrelBlock23_r2);
		setRotationAngle(BarrelBlock23_r2, 0.0F, 0.0F, -0.7854F);
		BarrelBlock23_r2.cubeList.add(new ModelBox(BarrelBlock23_r2, 195, 449, -1.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r2.cubeList.add(new ModelBox(BarrelBlock23_r2, 325, 449, -1.0132F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(18.1857F, -10.3043F, -39.5F);
		Barrels.addChild(barrel2);
		barrel2.cubeList.add(new ModelBox(barrel2, 455, 513, 0.2071F, -2.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 325, 513, 1.2071F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 195, 513, 0.2071F, -0.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 65, 513, -0.7929F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r3 = new ModelRenderer(this);
		BarrelBlock24_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel2.addChild(BarrelBlock24_r3);
		setRotationAngle(BarrelBlock24_r3, 0.0F, 0.0F, -0.7854F);
		BarrelBlock24_r3.cubeList.add(new ModelBox(BarrelBlock24_r3, 455, 257, -0.4F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r3.cubeList.add(new ModelBox(BarrelBlock24_r3, 455, 449, -0.4F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r3 = new ModelRenderer(this);
		BarrelBlock23_r3.setRotationPoint(1.7071F, 0.2929F, 0.0F);
		barrel2.addChild(BarrelBlock23_r3);
		setRotationAngle(BarrelBlock23_r3, 0.0F, 0.0F, 0.7854F);
		BarrelBlock23_r3.cubeList.add(new ModelBox(BarrelBlock23_r3, 455, 321, -1.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r3.cubeList.add(new ModelBox(BarrelBlock23_r3, 455, 385, -1.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r4 = new ModelRenderer(this);
		BarrelBlock24_r4.setRotationPoint(0.0F, -1.3922F, 0.0F);
		barrel2.addChild(BarrelBlock24_r4);
		setRotationAngle(BarrelBlock24_r4, 0.0F, 0.0F, 0.7854F);
		BarrelBlock24_r4.cubeList.add(new ModelBox(BarrelBlock24_r4, 0, 512, -0.4F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r4.cubeList.add(new ModelBox(BarrelBlock24_r4, 130, 512, -0.4F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r4 = new ModelRenderer(this);
		BarrelBlock23_r4.setRotationPoint(1.7071F, -1.6851F, 0.0F);
		barrel2.addChild(BarrelBlock23_r4);
		setRotationAngle(BarrelBlock23_r4, 0.0F, 0.0F, -0.7854F);
		BarrelBlock23_r4.cubeList.add(new ModelBox(BarrelBlock23_r4, 260, 512, -1.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r4.cubeList.add(new ModelBox(BarrelBlock23_r4, 390, 512, -1.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(16.5857F, -8.8965F, -39.5F);
		Barrels.addChild(barrel3);
		barrel3.cubeList.add(new ModelBox(barrel3, 390, 320, 0.2071F, 1.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 390, 256, 1.2071F, 0.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 390, 192, 0.2071F, -0.8149F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 390, 128, -0.7929F, 0.1851F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r5 = new ModelRenderer(this);
		BarrelBlock24_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel3.addChild(BarrelBlock24_r5);
		setRotationAngle(BarrelBlock24_r5, 0.0F, 0.0F, 0.7854F);
		BarrelBlock24_r5.cubeList.add(new ModelBox(BarrelBlock24_r5, 0, 384, -0.4F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r5.cubeList.add(new ModelBox(BarrelBlock24_r5, 65, 385, -0.4F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r5 = new ModelRenderer(this);
		BarrelBlock23_r5.setRotationPoint(1.7071F, -0.2929F, 0.0F);
		barrel3.addChild(BarrelBlock23_r5);
		setRotationAngle(BarrelBlock23_r5, 0.0F, 0.0F, -0.7854F);
		BarrelBlock23_r5.cubeList.add(new ModelBox(BarrelBlock23_r5, 130, 384, -1.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r5.cubeList.add(new ModelBox(BarrelBlock23_r5, 260, 384, -1.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r6 = new ModelRenderer(this);
		BarrelBlock24_r6.setRotationPoint(0.0F, 1.3922F, 0.0F);
		barrel3.addChild(BarrelBlock24_r6);
		setRotationAngle(BarrelBlock24_r6, 0.0F, 0.0F, -0.7854F);
		BarrelBlock24_r6.cubeList.add(new ModelBox(BarrelBlock24_r6, 195, 385, -0.4F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r6.cubeList.add(new ModelBox(BarrelBlock24_r6, 325, 385, -0.4F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r6 = new ModelRenderer(this);
		BarrelBlock23_r6.setRotationPoint(1.7071F, 1.6851F, 0.0F);
		barrel3.addChild(BarrelBlock23_r6);
		setRotationAngle(BarrelBlock23_r6, 0.0F, 0.0F, 0.7854F);
		BarrelBlock23_r6.cubeList.add(new ModelBox(BarrelBlock23_r6, 390, 0, -1.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r6.cubeList.add(new ModelBox(BarrelBlock23_r6, 390, 64, -1.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		barrel4 = new ModelRenderer(this);
		barrel4.setRotationPoint(15.0334F, -8.7965F, -39.5F);
		Barrels.addChild(barrel4);
		barrel4.cubeList.add(new ModelBox(barrel4, 65, 193, -1.2071F, 1.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel4.cubeList.add(new ModelBox(barrel4, 130, 192, -2.2071F, 0.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel4.cubeList.add(new ModelBox(barrel4, 0, 192, -1.2071F, -0.8149F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel4.cubeList.add(new ModelBox(barrel4, 130, 128, -0.2071F, 0.1851F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r7 = new ModelRenderer(this);
		BarrelBlock24_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel4.addChild(BarrelBlock24_r7);
		setRotationAngle(BarrelBlock24_r7, 0.0F, 0.0F, -0.7854F);
		BarrelBlock24_r7.cubeList.add(new ModelBox(BarrelBlock24_r7, 0, 0, -0.6F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r7.cubeList.add(new ModelBox(BarrelBlock24_r7, 65, 65, -0.6F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r7 = new ModelRenderer(this);
		BarrelBlock23_r7.setRotationPoint(-1.7071F, -0.2929F, 0.0F);
		barrel4.addChild(BarrelBlock23_r7);
		setRotationAngle(BarrelBlock23_r7, 0.0F, 0.0F, 0.7854F);
		BarrelBlock23_r7.cubeList.add(new ModelBox(BarrelBlock23_r7, 0, 64, 0.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r7.cubeList.add(new ModelBox(BarrelBlock23_r7, 65, 1, 0.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r8 = new ModelRenderer(this);
		BarrelBlock24_r8.setRotationPoint(0.0F, 1.3922F, 0.0F);
		barrel4.addChild(BarrelBlock24_r8);
		setRotationAngle(BarrelBlock24_r8, 0.0F, 0.0F, 0.7854F);
		BarrelBlock24_r8.cubeList.add(new ModelBox(BarrelBlock24_r8, 0, 128, -0.6F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r8.cubeList.add(new ModelBox(BarrelBlock24_r8, 65, 129, -0.6F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r8 = new ModelRenderer(this);
		BarrelBlock23_r8.setRotationPoint(-1.7071F, 1.6851F, 0.0F);
		barrel4.addChild(BarrelBlock23_r8);
		setRotationAngle(BarrelBlock23_r8, 0.0F, 0.0F, -0.7854F);
		BarrelBlock23_r8.cubeList.add(new ModelBox(BarrelBlock23_r8, 130, 0, 0.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r8.cubeList.add(new ModelBox(BarrelBlock23_r8, 130, 64, 0.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		barrel5 = new ModelRenderer(this);
		barrel5.setRotationPoint(13.5334F, -10.2043F, -39.5F);
		Barrels.addChild(barrel5);
		barrel5.cubeList.add(new ModelBox(barrel5, 325, 321, -1.2071F, -2.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel5.cubeList.add(new ModelBox(barrel5, 325, 257, -2.2071F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel5.cubeList.add(new ModelBox(barrel5, 325, 193, -1.2071F, -0.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel5.cubeList.add(new ModelBox(barrel5, 325, 129, -0.2071F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r9 = new ModelRenderer(this);
		BarrelBlock24_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel5.addChild(BarrelBlock24_r9);
		setRotationAngle(BarrelBlock24_r9, 0.0F, 0.0F, 0.7854F);
		BarrelBlock24_r9.cubeList.add(new ModelBox(BarrelBlock24_r9, 260, 256, -0.6F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r9.cubeList.add(new ModelBox(BarrelBlock24_r9, 260, 320, -0.6F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r9 = new ModelRenderer(this);
		BarrelBlock23_r9.setRotationPoint(-1.7071F, 0.2929F, 0.0F);
		barrel5.addChild(BarrelBlock23_r9);
		setRotationAngle(BarrelBlock23_r9, 0.0F, 0.0F, -0.7854F);
		BarrelBlock23_r9.cubeList.add(new ModelBox(BarrelBlock23_r9, 0, 320, 0.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r9.cubeList.add(new ModelBox(BarrelBlock23_r9, 130, 320, 0.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r10 = new ModelRenderer(this);
		BarrelBlock24_r10.setRotationPoint(0.0F, -1.3922F, 0.0F);
		barrel5.addChild(BarrelBlock24_r10);
		setRotationAngle(BarrelBlock24_r10, 0.0F, 0.0F, -0.7854F);
		BarrelBlock24_r10.cubeList.add(new ModelBox(BarrelBlock24_r10, 65, 321, -0.6F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r10.cubeList.add(new ModelBox(BarrelBlock24_r10, 195, 321, -0.6F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r10 = new ModelRenderer(this);
		BarrelBlock23_r10.setRotationPoint(-1.7071F, -1.6851F, 0.0F);
		barrel5.addChild(BarrelBlock23_r10);
		setRotationAngle(BarrelBlock23_r10, 0.0F, 0.0F, 0.7854F);
		BarrelBlock23_r10.cubeList.add(new ModelBox(BarrelBlock23_r10, 325, 1, 0.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r10.cubeList.add(new ModelBox(BarrelBlock23_r10, 325, 65, 0.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		barrel6 = new ModelRenderer(this);
		barrel6.setRotationPoint(14.9334F, -12.7043F, -39.5F);
		Barrels.addChild(barrel6);
		barrel6.cubeList.add(new ModelBox(barrel6, 260, 192, -1.2071F, -2.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel6.cubeList.add(new ModelBox(barrel6, 260, 128, -2.2071F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel6.cubeList.add(new ModelBox(barrel6, 260, 64, -1.2071F, -0.1851F, -31.5F, 1, 1, 63, -0.15F, false));
		barrel6.cubeList.add(new ModelBox(barrel6, 260, 0, -0.2071F, -1.1851F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r11 = new ModelRenderer(this);
		BarrelBlock24_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel6.addChild(BarrelBlock24_r11);
		setRotationAngle(BarrelBlock24_r11, 0.0F, 0.0F, 0.7854F);
		BarrelBlock24_r11.cubeList.add(new ModelBox(BarrelBlock24_r11, 195, 1, -0.6F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r11.cubeList.add(new ModelBox(BarrelBlock24_r11, 195, 193, -0.6F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r11 = new ModelRenderer(this);
		BarrelBlock23_r11.setRotationPoint(-1.7071F, 0.2929F, 0.0F);
		barrel6.addChild(BarrelBlock23_r11);
		setRotationAngle(BarrelBlock23_r11, 0.0F, 0.0F, -0.7854F);
		BarrelBlock23_r11.cubeList.add(new ModelBox(BarrelBlock23_r11, 195, 65, 0.0F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r11.cubeList.add(new ModelBox(BarrelBlock23_r11, 195, 129, 0.0F, -0.9F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock24_r12 = new ModelRenderer(this);
		BarrelBlock24_r12.setRotationPoint(0.0F, -1.3922F, 0.0F);
		barrel6.addChild(BarrelBlock24_r12);
		setRotationAngle(BarrelBlock24_r12, 0.0F, 0.0F, -0.7854F);
		BarrelBlock24_r12.cubeList.add(new ModelBox(BarrelBlock24_r12, 0, 256, -0.6F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock24_r12.cubeList.add(new ModelBox(BarrelBlock24_r12, 130, 256, -0.6F, -0.2F, -31.5F, 1, 1, 63, -0.15F, false));

		BarrelBlock23_r12 = new ModelRenderer(this);
		BarrelBlock23_r12.setRotationPoint(-1.7071F, -1.6851F, 0.0F);
		barrel6.addChild(BarrelBlock23_r12);
		setRotationAngle(BarrelBlock23_r12, 0.0F, 0.0F, 0.7854F);
		BarrelBlock23_r12.cubeList.add(new ModelBox(BarrelBlock23_r12, 65, 257, 0.0F, -0.8F, -31.5F, 1, 1, 63, -0.15F, false));
		BarrelBlock23_r12.cubeList.add(new ModelBox(BarrelBlock23_r12, 195, 257, 0.0F, -0.1F, -31.5F, 1, 1, 63, -0.15F, false));

		barrelbelt = new ModelRenderer(this);
		barrelbelt.setRotationPoint(0.0F, 24.0F, 6.9F);
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 65, 87, -2.8F, -15.1F, -18.2F, 7, 1, 3, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 65, 21, -2.8F, -23.1F, -52.2F, 7, 1, 4, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 0, -4.4F, -21.1F, -52.2F, 1, 5, 4, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 18, 0, 4.6F, -21.1F, -52.2F, 1, 5, 4, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 33, 48, -3.4F, -22.1F, -52.2F, 8, 7, 4, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 105, 29, -3.4F, -22.1F, -67.2F, 8, 7, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 95, 102, -3.4F, -22.1F, -71.2F, 8, 7, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 95, 94, -3.4F, -22.1F, -75.2F, 8, 7, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 84, -3.4F, -22.1F, -18.2F, 8, 7, 2, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 65, 58, -2.8F, -15.1F, -52.2F, 7, 1, 4, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 32, 61, -2.8F, -23.1F, -67.2F, 7, 1, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 79, 29, -4.4F, -21.1F, -67.2F, 1, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 87, 29, 4.6F, -21.1F, -67.2F, 1, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 65, 26, -2.8F, -15.1F, -67.2F, 7, 1, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 61, -2.8F, -23.1F, -71.2F, 7, 1, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 77, 65, -4.4F, -21.1F, -71.2F, 1, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 77, 76, 4.6F, -21.1F, -71.2F, 1, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 16, 61, -2.8F, -15.1F, -71.2F, 7, 1, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 47, 22, -2.8F, -23.1F, -75.2F, 7, 1, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 22, 64, -4.4F, -21.1F, -75.2F, 1, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 65, 11, 4.6F, -21.1F, -75.2F, 1, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 58, -2.8F, -15.1F, -75.2F, 7, 1, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 83, 58, -2.8F, -23.1F, -18.2F, 7, 1, 3, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 48, 4.6F, -21.1F, -18.2F, 1, 5, 3, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 33, -4.4F, -21.1F, -18.2F, 1, 5, 3, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 75, 117, -1.8F, -20.1F, -17.0F, 5, 3, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 95, 40, -0.8F, -21.1F, -17.0F, 3, 5, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 107, 44, -2.9F, -19.9F, -16.0F, 7, 3, 1, 0.0F, false));
		barrelbelt.cubeList.add(new ModelBox(barrelbelt, 0, 75, -1.0F, -22.0F, -16.0F, 3, 7, 1, 0.0F, false));

		BarrelCore19_r1 = new ModelRenderer(this);
		BarrelCore19_r1.setRotationPoint(-15.2148F, -8.1562F, 0.0F);
		barrelbelt.addChild(BarrelCore19_r1);
		setRotationAngle(BarrelCore19_r1, 0.0F, 0.0F, 0.8029F);
		BarrelCore19_r1.cubeList.add(new ModelBox(BarrelCore19_r1, 65, 29, 2.0F, -22.0F, -16.0F, 3, 7, 1, 0.0F, false));

		BarrelCore20_r1 = new ModelRenderer(this);
		BarrelCore20_r1.setRotationPoint(13.4269F, -8.1038F, 0.0F);
		barrelbelt.addChild(BarrelCore20_r1);
		setRotationAngle(BarrelCore20_r1, 0.0F, 0.0F, -0.8029F);
		BarrelCore20_r1.cubeList.add(new ModelBox(BarrelCore20_r1, 18, 48, -3.0F, -19.8F, -16.0F, 3, 7, 1, 0.0F, false));

		BarrelCore21_r1 = new ModelRenderer(this);
		BarrelCore21_r1.setRotationPoint(-15.0148F, -8.2562F, 0.0F);
		barrelbelt.addChild(BarrelCore21_r1);
		setRotationAngle(BarrelCore21_r1, 0.0F, 0.0F, 0.8029F);
		BarrelCore21_r1.cubeList.add(new ModelBox(BarrelCore21_r1, 24, 73, 3.0F, -21.5F, -17.0F, 1, 6, 1, 0.0F, false));

		BarrelCore22_r1 = new ModelRenderer(this);
		BarrelCore22_r1.setRotationPoint(14.317F, -8.0185F, 0.0F);
		barrelbelt.addChild(BarrelCore22_r1);
		setRotationAngle(BarrelCore22_r1, 0.0F, 0.0F, -0.7854F);
		BarrelCore22_r1.cubeList.add(new ModelBox(BarrelCore22_r1, 59, 12, -2.5F, -20.0F, -17.0F, 1, 6, 1, 0.0F, false));

		BarrelCore39_r1 = new ModelRenderer(this);
		BarrelCore39_r1.setRotationPoint(-3.0045F, -15.493F, -16.7F);
		barrelbelt.addChild(BarrelCore39_r1);
		setRotationAngle(BarrelCore39_r1, 0.0F, 0.0F, 0.5585F);
		BarrelCore39_r1.cubeList.add(new ModelBox(BarrelCore39_r1, 16, 21, -1.0656F, -0.6581F, -1.5F, 3, 1, 3, 0.0F, false));
		BarrelCore39_r1.cubeList.add(new ModelBox(BarrelCore39_r1, 48, 61, -1.0656F, -0.6581F, -58.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r1.cubeList.add(new ModelBox(BarrelCore39_r1, 79, 8, -1.0656F, -0.6581F, -54.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r1.cubeList.add(new ModelBox(BarrelCore39_r1, 16, 81, -1.0656F, -0.6581F, -50.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r1.cubeList.add(new ModelBox(BarrelCore39_r1, 49, 42, -1.0656F, -0.6581F, -35.5F, 3, 1, 4, 0.0F, false));

		BarrelCore36_r1 = new ModelRenderer(this);
		BarrelCore36_r1.setRotationPoint(-3.0045F, -15.493F, -16.7F);
		barrelbelt.addChild(BarrelCore36_r1);
		setRotationAngle(BarrelCore36_r1, 0.0F, 0.0F, -0.6458F);
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 37, 116, -0.7032F, 0.2511F, -1.5F, 1, 1, 3, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 85, 107, -0.7032F, -1.3489F, -1.5F, 1, 2, 3, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 16, 13, -0.7032F, -1.3489F, -58.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 53, 50, -0.7032F, 0.2511F, -58.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 18, 0, -0.7032F, -1.3489F, -54.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 65, 21, -0.7032F, 0.2511F, -54.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 24, 0, -0.7032F, -1.3489F, -50.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 65, 43, -0.7032F, 0.2511F, -50.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 83, 22, -0.7032F, -1.3489F, -35.5F, 1, 2, 4, 0.0F, false));
		BarrelCore36_r1.cubeList.add(new ModelBox(BarrelCore36_r1, 117, 79, -0.7032F, 0.2511F, -35.5F, 1, 1, 4, 0.0F, false));

		BarrelCore39_r2 = new ModelRenderer(this);
		BarrelCore39_r2.setRotationPoint(4.1045F, -15.493F, -16.7F);
		barrelbelt.addChild(BarrelCore39_r2);
		setRotationAngle(BarrelCore39_r2, 0.0F, 0.0F, -0.5585F);
		BarrelCore39_r2.cubeList.add(new ModelBox(BarrelCore39_r2, 115, 24, -1.9344F, -0.6581F, -1.5F, 3, 1, 3, 0.0F, false));
		BarrelCore39_r2.cubeList.add(new ModelBox(BarrelCore39_r2, 95, 25, -1.9344F, -0.6581F, -58.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r2.cubeList.add(new ModelBox(BarrelCore39_r2, 95, 71, -1.9344F, -0.6581F, -54.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r2.cubeList.add(new ModelBox(BarrelCore39_r2, 95, 90, -1.9344F, -0.6581F, -50.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r2.cubeList.add(new ModelBox(BarrelCore39_r2, 107, 111, -1.9344F, -0.6581F, -35.5F, 3, 1, 4, 0.0F, false));

		BarrelCore36_r2 = new ModelRenderer(this);
		BarrelCore36_r2.setRotationPoint(4.1045F, -15.493F, -16.7F);
		barrelbelt.addChild(BarrelCore36_r2);
		setRotationAngle(BarrelCore36_r2, 0.0F, 0.0F, 0.6458F);
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 119, 0, -0.1968F, -1.3489F, -1.5F, 1, 2, 3, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 119, 108, -0.1968F, 0.1511F, -1.5F, 1, 1, 3, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 58, 10, -0.1968F, 0.1511F, -58.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 24, 13, -0.1968F, -1.3489F, -58.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 65, 23, -0.1968F, 0.1511F, -54.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 23, 33, -0.1968F, -1.3489F, -54.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 65, 58, -0.1968F, 0.1511F, -50.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 40, 21, -0.1968F, -1.3489F, -50.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 83, 117, -0.1968F, 0.1511F, -35.5F, 1, 1, 4, 0.0F, false));
		BarrelCore36_r2.cubeList.add(new ModelBox(BarrelCore36_r2, 83, 11, -0.1968F, -1.3489F, -35.5F, 1, 2, 4, 0.0F, false));

		BarrelCore36_r3 = new ModelRenderer(this);
		BarrelCore36_r3.setRotationPoint(4.1045F, -21.707F, -16.7F);
		barrelbelt.addChild(BarrelCore36_r3);
		setRotationAngle(BarrelCore36_r3, 0.0F, 0.0F, -0.6458F);
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 120, 53, -0.1968F, -1.1511F, -1.5F, 1, 1, 3, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 119, 48, -0.1968F, -0.6511F, -1.5F, 1, 2, 3, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 65, 60, -0.1968F, -1.1511F, -58.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 49, 42, -0.1968F, -0.6511F, -58.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 65, 65, -0.1968F, -1.1511F, -54.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 58, 0, -0.1968F, -0.6511F, -54.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 58, 66, -0.1968F, -1.1511F, -50.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 59, 42, -0.1968F, -0.6511F, -50.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 117, 103, -0.1968F, -1.1511F, -35.5F, 1, 1, 4, 0.0F, false));
		BarrelCore36_r3.cubeList.add(new ModelBox(BarrelCore36_r3, 65, 116, -0.1968F, -0.6511F, -35.5F, 1, 2, 4, 0.0F, false));

		BarrelCore39_r3 = new ModelRenderer(this);
		BarrelCore39_r3.setRotationPoint(4.1045F, -21.707F, -16.7F);
		barrelbelt.addChild(BarrelCore39_r3);
		setRotationAngle(BarrelCore39_r3, 0.0F, 0.0F, 0.5585F);
		BarrelCore39_r3.cubeList.add(new ModelBox(BarrelCore39_r3, 107, 116, -1.9344F, -0.3419F, -1.5F, 3, 1, 3, 0.0F, false));
		BarrelCore39_r3.cubeList.add(new ModelBox(BarrelCore39_r3, 105, 90, -1.9344F, -0.3419F, -58.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r3.cubeList.add(new ModelBox(BarrelCore39_r3, 113, 38, -1.9344F, -0.3419F, -54.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r3.cubeList.add(new ModelBox(BarrelCore39_r3, 113, 72, -1.9344F, -0.3419F, -50.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r3.cubeList.add(new ModelBox(BarrelCore39_r3, 65, 111, -1.9344F, -0.3419F, -35.5F, 3, 1, 4, 0.0F, false));

		BarrelCore39_r4 = new ModelRenderer(this);
		BarrelCore39_r4.setRotationPoint(-3.0045F, -21.707F, -16.7F);
		barrelbelt.addChild(BarrelCore39_r4);
		setRotationAngle(BarrelCore39_r4, 0.0F, 0.0F, -0.5585F);
		BarrelCore39_r4.cubeList.add(new ModelBox(BarrelCore39_r4, 0, 21, -1.0656F, -0.3419F, -1.5F, 3, 1, 3, 0.0F, false));
		BarrelCore39_r4.cubeList.add(new ModelBox(BarrelCore39_r4, 65, 91, -1.0656F, -0.3419F, -58.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r4.cubeList.add(new ModelBox(BarrelCore39_r4, 95, 46, -1.0656F, -0.3419F, -54.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r4.cubeList.add(new ModelBox(BarrelCore39_r4, 95, 81, -1.0656F, -0.3419F, -50.5F, 3, 1, 1, 0.0F, false));
		BarrelCore39_r4.cubeList.add(new ModelBox(BarrelCore39_r4, 78, 41, -1.0656F, -0.3419F, -35.5F, 3, 1, 4, 0.0F, false));

		BarrelCore36_r4 = new ModelRenderer(this);
		BarrelCore36_r4.setRotationPoint(-3.0045F, -21.707F, -16.7F);
		barrelbelt.addChild(BarrelCore36_r4);
		setRotationAngle(BarrelCore36_r4, 0.0F, 0.0F, 0.6458F);
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 119, 6, -0.7032F, -0.6511F, -1.5F, 1, 2, 3, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 55, 24, -0.7032F, -1.2511F, -1.5F, 1, 1, 3, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 42, 33, -0.7032F, -0.6511F, -58.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 42, 36, -0.7032F, -1.2511F, -58.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 48, 0, -0.7032F, -0.6511F, -54.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 58, 64, -0.7032F, -1.2511F, -54.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 33, 48, -0.7032F, -0.6511F, -50.5F, 1, 2, 1, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 65, 41, -0.7032F, -1.2511F, -50.5F, 1, 1, 1, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 42, 116, -0.7032F, -0.6511F, -35.5F, 1, 2, 4, 0.0F, false));
		BarrelCore36_r4.cubeList.add(new ModelBox(BarrelCore36_r4, 117, 18, -0.7032F, -1.2511F, -35.5F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Barrels.render(f5);
		barrelbelt.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
