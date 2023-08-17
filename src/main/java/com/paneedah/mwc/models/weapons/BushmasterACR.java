package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BushmasterACR extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer ACR138_r1;
	private final ModelRenderer ACR137_r1;
	private final ModelRenderer ACR136_r1;
	private final ModelRenderer ACR135_r1;
	private final ModelRenderer ACR134_r1;
	private final ModelRenderer ACR131_r1;
	private final ModelRenderer ACR128_r1;
	private final ModelRenderer ACR126_r1;
	private final ModelRenderer ACR274_r1;
	private final ModelRenderer ACR273_r1;
	private final ModelRenderer ACR272_r1;
	private final ModelRenderer ACR271_r1;
	private final ModelRenderer ACR4_r1;
	private final ModelRenderer ACR3_r1;
	private final ModelRenderer ACR2_r1;
	private final ModelRenderer ACR1_r1;
	private final ModelRenderer ACR151_r1;
	private final ModelRenderer ACR114_r1;
	private final ModelRenderer ACR105_r1;
	private final ModelRenderer ACR103_r1;
	private final ModelRenderer ACR87_r1;
	private final ModelRenderer ACR85_r1;
	private final ModelRenderer ACR81_r1;
	private final ModelRenderer ACR80_r1;
	private final ModelRenderer ACR75_r1;
	private final ModelRenderer ACR70_r1;
	private final ModelRenderer ACR60_r1;
	private final ModelRenderer ACR59_r1;
	private final ModelRenderer ACR58_r1;
	private final ModelRenderer ACR54_r1;
	private final ModelRenderer ACR52_r1;
	private final ModelRenderer ACR51_r1;
	private final ModelRenderer ACR50_r1;
	private final ModelRenderer ACR49_r1;
	private final ModelRenderer ACR46_r1;
	private final ModelRenderer ACR41_r1;
	private final ModelRenderer ACR37_r1;
	private final ModelRenderer ACR35_r1;
	private final ModelRenderer ACR27_r1;
	private final ModelRenderer ACR25_r1;
	private final ModelRenderer ACR23_r1;
	private final ModelRenderer ACR22_r1;
	private final ModelRenderer ACR20_r1;
	private final ModelRenderer ACR18_r1;
	private final ModelRenderer ACR14_r1;
	private final ModelRenderer ACR888_r1;
	private final ModelRenderer ACR6_r1;
	private final ModelRenderer ACR5_r1;

	public BushmasterACR() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-1.5218F, -12.2474F, -27.7487F);
		gun.cubeList.add(new ModelBox(gun, 158, 52, -1.4782F, 3.8474F, 13.2487F, 3, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 214, 14, -2.2782F, 1.2474F, 14.2487F, 4, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 47, 1.3318F, 1.2474F, 14.2487F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 149, 1.2218F, 1.4474F, 9.2487F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 217, 135, -2.1782F, 1.2474F, 5.2487F, 4, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 0, 1.2218F, 4.2474F, 5.2487F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 185, -2.1782F, 4.2474F, 5.2487F, 4, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 155, 163, 1.2218F, 6.2474F, 10.2487F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 163, 69, -2.1782F, 6.2474F, 10.2487F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 155, 159, -2.2782F, 1.2474F, 5.2487F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 155, 140, 1.3218F, 1.2474F, 5.2487F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 146, 149, 1.3218F, 1.7474F, 3.7487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 119, -2.2782F, 1.7474F, 3.7487F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 167, -2.2782F, 1.7474F, 5.2487F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 161, 1.3218F, 2.4474F, 4.4487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 151, 91, -2.2782F, 2.4474F, 4.4487F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 161, 1.4218F, 1.7474F, 4.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 161, -2.3782F, 1.7474F, 4.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 158, 46, 1.2218F, 2.2474F, 5.2487F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 146, 1.2218F, 3.2474F, 9.2487F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 146, 1.1218F, 2.3474F, 9.2487F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 67, 1.3218F, -1.7526F, 25.7487F, 1, 4, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 92, -2.2682F, -1.7526F, 25.7487F, 4, 4, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 149, 114, 1.3218F, 1.2474F, 3.7487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 116, 105, -2.2782F, 1.2474F, 3.7487F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 38, -2.4782F, 1.2474F, 14.2487F, 5, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 15, -2.4782F, 3.2474F, 14.2487F, 5, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 105, -2.4782F, 2.2474F, 14.2487F, 5, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 150, 73, 1.7218F, 1.7474F, 14.7487F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 150, 55, -2.6782F, 1.7474F, 14.7487F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 140, 1.4218F, 2.2474F, 21.7487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 160, -2.3782F, 2.2474F, 21.7487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 111, 1.4218F, -1.2526F, 28.7487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 94, -2.3782F, -1.2526F, 28.7487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 104, -2.4782F, -0.7526F, 29.2487F, 5, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 149, 111, -2.3782F, -0.5526F, 26.7487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 20, -2.1782F, -2.2526F, 15.7487F, 1, 4, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 304, 143, 1.2218F, -2.2526F, 3.7487F, 1, 4, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 59, -2.1782F, -2.2526F, 3.7487F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 113, -2.1782F, -0.9526F, 5.7487F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 0, -2.4782F, -3.5526F, 15.7487F, 2, 2, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 189, 232, 0.5218F, -3.5526F, 3.7487F, 2, 2, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 140, -2.4782F, -3.5526F, 3.7487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 82, 1.6218F, -3.2526F, 29.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 80, -2.5782F, -3.2526F, 29.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 160, 1.6218F, -2.7526F, 24.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 160, -2.5782F, -2.7526F, 24.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 28, 1.6218F, -2.7526F, 13.7487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 160, 26, 1.6218F, -3.3526F, 4.0487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 148, 159, -2.5782F, -3.3526F, 4.0487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 140, -3.1782F, -3.7526F, 15.9487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 149, 94, -3.1782F, -2.2526F, 15.9487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 150, -3.1782F, -3.7526F, 17.4487F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 159, -3.1782F, -2.2526F, 17.4487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 276, 88, 0.2218F, -5.9726F, 3.7487F, 1, 2, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 274, 0, -1.1782F, -5.9526F, 3.7487F, 2, 2, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 155, 140, 0.3218F, -5.1526F, 27.7487F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 60, -2.9782F, -0.2526F, 3.2487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 109, -2.9782F, 0.2474F, 3.2487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 80, -2.9782F, -0.0026F, 3.0487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 43, -2.9782F, -0.0026F, 3.4487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 155, -1.2782F, -5.1526F, 27.7487F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 0, -0.4782F, -1.7526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 94, -0.4782F, -1.2526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 48, -0.7282F, -1.5026F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 93, -0.2282F, -1.5026F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 92, -0.6282F, -1.6526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 1, -0.3282F, -1.6526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 47, -0.6282F, -1.3526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 46, -0.3282F, -1.3526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 0, -0.8782F, -1.8526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 118, -0.0782F, -1.8526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 111, -0.0782F, -1.0526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 130, -0.8782F, -1.0526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 187, 69, -0.4782F, -4.2526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 149, -0.4782F, -3.7526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 133, -0.7282F, -4.0026F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 159, -0.2282F, -4.0026F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 157, -0.3282F, -4.1526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 156, -0.6282F, -4.1526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 154, -0.6282F, -3.8526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 17, -0.3282F, -3.8526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 102, -0.4782F, -4.3526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 140, -0.8282F, -4.0026F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 140, -0.1282F, -4.0026F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 139, -0.4782F, -3.6526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 139, -0.2282F, -3.7526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 127, 47, -0.2282F, -4.2526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 114, -0.7282F, -3.7526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 108, -0.7282F, -4.2526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 161, 150, -0.4782F, -2.6526F, -27.2513F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 162, 0, -0.7282F, -1.7526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 148, -0.7282F, -1.2526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 147, -0.2282F, -1.2526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 140, -0.2282F, -1.7526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 139, -0.8282F, -1.5026F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 125, -0.1282F, -1.5026F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 121, -0.4782F, -1.1526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 120, -0.4782F, -1.8526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 216, -0.4782F, -1.8526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 158, 46, -0.2282F, -1.7526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 157, -0.1282F, -1.5026F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 156, -0.2282F, -1.2526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 154, -0.4782F, -1.1526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 140, -0.7282F, -1.2526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 139, -0.8282F, -1.5026F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 18, -0.7282F, -1.7526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 158, -0.4782F, -4.1526F, -28.7513F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 158, -0.4782F, -3.8526F, -28.7513F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 275, 56, -1.1782F, -5.9526F, -21.2513F, 2, 2, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 276, 116, 0.2218F, -5.9726F, -21.2513F, 1, 2, 25, 0.0F, false));

		ACR138_r1 = new ModelRenderer(this);
		ACR138_r1.setRotationPoint(32.8894F, 17.4127F, 27.7487F);
		gun.addChild(ACR138_r1);
		setRotationAngle(ACR138_r1, 0.0F, 0.0F, -0.9295F);
		ACR138_r1.cubeList.add(new ModelBox(ACR138_r1, 64, 145, -3.1F, -40.7F, -45.0F, 1, 1, 5, 0.0F, false));

		ACR137_r1 = new ModelRenderer(this);
		ACR137_r1.setRotationPoint(-21.9805F, -37.3162F, 27.7487F);
		gun.addChild(ACR137_r1);
		setRotationAngle(ACR137_r1, 0.0F, 0.0F, 2.5133F);
		ACR137_r1.cubeList.add(new ModelBox(ACR137_r1, 78, 145, 0.2F, -40.6F, -45.0F, 1, 1, 5, 0.0F, false));

		ACR136_r1 = new ModelRenderer(this);
		ACR136_r1.setRotationPoint(33.5708F, 17.3718F, 27.7487F);
		gun.addChild(ACR136_r1);
		setRotationAngle(ACR136_r1, 0.0F, 0.0F, -0.9295F);
		ACR136_r1.cubeList.add(new ModelBox(ACR136_r1, 304, 52, -2.8F, -41.4F, -45.0F, 1, 1, 23, 0.0F, false));

		ACR135_r1 = new ModelRenderer(this);
		ACR135_r1.setRotationPoint(-23.1743F, -38.5283F, 27.7487F);
		gun.addChild(ACR135_r1);
		setRotationAngle(ACR135_r1, 0.0F, 0.0F, 2.5133F);
		ACR135_r1.cubeList.add(new ModelBox(ACR135_r1, 77, 304, -0.2F, -41.4F, -45.0F, 1, 1, 23, 0.0F, false));

		ACR134_r1 = new ModelRenderer(this);
		ACR134_r1.setRotationPoint(-20.8408F, -36.8865F, 27.7487F);
		gun.addChild(ACR134_r1);
		setRotationAngle(ACR134_r1, 0.0F, 0.0F, 2.5133F);
		ACR134_r1.cubeList.add(new ModelBox(ACR134_r1, 187, 38, 0.7F, -40.2F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR134_r1.cubeList.add(new ModelBox(ACR134_r1, 146, 143, 0.7F, -40.2F, -42.0F, 1, 1, 2, 0.0F, false));
		ACR134_r1.cubeList.add(new ModelBox(ACR134_r1, 8, 147, 0.7F, -40.2F, -45.0F, 1, 1, 2, 0.0F, false));

		ACR131_r1 = new ModelRenderer(this);
		ACR131_r1.setRotationPoint(32.2477F, 17.1328F, 27.7487F);
		gun.addChild(ACR131_r1);
		setRotationAngle(ACR131_r1, 0.0F, 0.0F, -0.9295F);
		ACR131_r1.cubeList.add(new ModelBox(ACR131_r1, 187, 53, -3.7F, -40.2F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR131_r1.cubeList.add(new ModelBox(ACR131_r1, 46, 147, -3.7F, -40.2F, -45.0F, 1, 1, 2, 0.0F, false));
		ACR131_r1.cubeList.add(new ModelBox(ACR131_r1, 55, 147, -3.7F, -40.2F, -42.0F, 1, 1, 2, 0.0F, false));

		ACR128_r1 = new ModelRenderer(this);
		ACR128_r1.setRotationPoint(31.8066F, 17.0531F, 27.7487F);
		gun.addChild(ACR128_r1);
		setRotationAngle(ACR128_r1, 0.0F, 0.0F, -0.9295F);
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 30, 148, -4.0F, -39.8F, -45.0F, 1, 1, 2, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 38, 148, -4.0F, -39.8F, -42.0F, 1, 1, 2, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 235, 153, -4.0F, -39.8006F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 0, 86, -4.0F, -39.8F, -40.0F, 3, 1, 4, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 122, 126, -4.0F, -39.8F, -43.0F, 3, 1, 1, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 14, 86, -4.0F, -39.8F, -49.0F, 3, 1, 4, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 58, 106, -4.0F, -39.8F, 2.0F, 2, 1, 1, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 278, 27, -4.0F, -39.8F, -22.0F, 3, 1, 24, 0.0F, false));

		ACR126_r1 = new ModelRenderer(this);
		ACR126_r1.setRotationPoint(-20.063F, -36.3392F, 27.7487F);
		gun.addChild(ACR126_r1);
		setRotationAngle(ACR126_r1, 0.0F, 0.0F, 2.5133F);
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 92, 148, 1.0F, -39.8F, -45.0F, 1, 1, 2, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 101, 148, 1.0F, -39.8F, -42.0F, 1, 1, 2, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 220, 232, 1.0F, -39.8F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 131, 0, 1.0F, -39.8F, -40.0F, 1, 3, 4, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 81, 39, 1.0F, -39.8F, -43.0F, 1, 3, 1, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 63, 156, 1.0F, -39.8F, -49.0F, 1, 3, 4, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 138, 149, 1.0F, -39.8F, 2.0F, 1, 2, 1, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 213, 287, 1.0F, -39.8023F, -22.0F, 1, 3, 24, 0.0F, false));

		ACR274_r1 = new ModelRenderer(this);
		ACR274_r1.setRotationPoint(1.5218F, -37.2661F, -113.568F);
		gun.addChild(ACR274_r1);
		setRotationAngle(ACR274_r1, 3.123F, 0.0F, 0.0F);
		ACR274_r1.cubeList.add(new ModelBox(ACR274_r1, 143, 7, -2.0F, -36.1F, -71.0F, 1, 1, 6, 0.0F, false));

		ACR273_r1 = new ModelRenderer(this);
		ACR273_r1.setRotationPoint(69.8706F, 36.2474F, -42.6499F);
		gun.addChild(ACR273_r1);
		setRotationAngle(ACR273_r1, 0.0F, 1.5243F, 0.0F);
		ACR273_r1.cubeList.add(new ModelBox(ACR273_r1, 0, 43, -2.7F, -37.75F, -71.0F, 6, 1, 1, 0.0F, false));

		ACR272_r1 = new ModelRenderer(this);
		ACR272_r1.setRotationPoint(-1.717F, 36.2474F, -114.1911F);
		gun.addChild(ACR272_r1);
		setRotationAngle(ACR272_r1, -3.1416F, -0.0372F, 3.1416F);
		ACR272_r1.cubeList.add(new ModelBox(ACR272_r1, 143, 17, -0.3F, -37.75F, -71.0F, 1, 1, 6, 0.0F, false));

		ACR271_r1 = new ModelRenderer(this);
		ACR271_r1.setRotationPoint(1.5218F, 70.4593F, -78.4113F);
		gun.addChild(ACR271_r1);
		setRotationAngle(ACR271_r1, -1.5243F, 0.0F, 0.0F);
		ACR271_r1.cubeList.add(new ModelBox(ACR271_r1, 88, 105, -2.0F, -38.5F, -71.0F, 1, 6, 1, 0.0F, false));

		ACR4_r1 = new ModelRenderer(this);
		ACR4_r1.setRotationPoint(1.5218F, 23.5196F, 43.1526F);
		gun.addChild(ACR4_r1);
		setRotationAngle(ACR4_r1, 1.041F, 0.0F, 0.0F);
		ACR4_r1.cubeList.add(new ModelBox(ACR4_r1, 79, 100, -3.5F, -19.8F, -3.4F, 4, 1, 2, 0.0F, false));

		ACR3_r1 = new ModelRenderer(this);
		ACR3_r1.setRotationPoint(1.5218F, 24.7014F, 7.6844F);
		gun.addChild(ACR3_r1);
		setRotationAngle(ACR3_r1, -1.1897F, 0.0F, 0.0F);
		ACR3_r1.cubeList.add(new ModelBox(ACR3_r1, 114, 120, -3.5F, -20.6F, -1.5F, 4, 2, 1, 0.0F, false));

		ACR2_r1 = new ModelRenderer(this);
		ACR2_r1.setRotationPoint(1.5218F, 18.1909F, -4.837F);
		gun.addChild(ACR2_r1);
		setRotationAngle(ACR2_r1, -1.1525F, 0.0F, 0.0F);
		ACR2_r1.cubeList.add(new ModelBox(ACR2_r1, 141, 65, -3.52F, -34.1F, -2.4F, 4, 1, 14, 0.0F, false));

		ACR1_r1 = new ModelRenderer(this);
		ACR1_r1.setRotationPoint(1.5218F, 16.0656F, -5.8739F);
		gun.addChild(ACR1_r1);
		setRotationAngle(ACR1_r1, -1.2217F, 0.0F, 0.0F);
		ACR1_r1.cubeList.add(new ModelBox(ACR1_r1, 94, 94, -3.5F, -34.1F, -2.4F, 4, 5, 14, 0.0F, false));

		ACR151_r1 = new ModelRenderer(this);
		ACR151_r1.setRotationPoint(1.5218F, -4.2068F, -39.9653F);
		gun.addChild(ACR151_r1);
		setRotationAngle(ACR151_r1, -2.1564F, 0.0F, 0.0F);
		ACR151_r1.cubeList.add(new ModelBox(ACR151_r1, 132, 159, 0.3F, -38.4F, -23.0F, 1, 1, 1, 0.0F, false));

		ACR114_r1 = new ModelRenderer(this);
		ACR114_r1.setRotationPoint(1.5218F, 35.5135F, 19.8752F);
		gun.addChild(ACR114_r1);
		setRotationAngle(ACR114_r1, -0.1859F, 0.0F, 0.0F);
		ACR114_r1.cubeList.add(new ModelBox(ACR114_r1, 127, 53, -2.5F, -42.6F, 0.0F, 2, 1, 3, 0.0F, false));

		ACR105_r1 = new ModelRenderer(this);
		ACR105_r1.setRotationPoint(7.2027F, 36.2474F, 17.5448F);
		gun.addChild(ACR105_r1);
		setRotationAngle(ACR105_r1, 0.0F, 1.1897F, 0.0F);
		ACR105_r1.cubeList.add(new ModelBox(ACR105_r1, 148, 102, -4.7F, -38.5F, -9.3F, 1, 1, 2, 0.0F, false));
		ACR105_r1.cubeList.add(new ModelBox(ACR105_r1, 55, 139, -4.7F, -40.0F, -9.3F, 1, 2, 2, 0.0F, false));

		ACR103_r1 = new ModelRenderer(this);
		ACR103_r1.setRotationPoint(32.5667F, 11.0211F, 27.7487F);
		gun.addChild(ACR103_r1);
		setRotationAngle(ACR103_r1, 0.0F, 0.0F, -1.1154F);
		ACR103_r1.cubeList.add(new ModelBox(ACR103_r1, 46, 150, -4.7F, -37.5F, -10.3F, 1, 2, 1, 0.0F, false));
		ACR103_r1.cubeList.add(new ModelBox(ACR103_r1, 92, 140, -4.7F, -37.5F, -11.8F, 1, 2, 2, 0.0F, false));

		ACR87_r1 = new ModelRenderer(this);
		ACR87_r1.setRotationPoint(23.0809F, 26.5823F, 27.7487F);
		gun.addChild(ACR87_r1);
		setRotationAngle(ACR87_r1, 0.0F, 0.0F, -0.632F);
		ACR87_r1.cubeList.add(new ModelBox(ACR87_r1, 204, 70, -4.0F, -37.8F, -12.0F, 1, 1, 15, 0.0F, false));
		ACR87_r1.cubeList.add(new ModelBox(ACR87_r1, 149, 97, -4.0F, -37.8F, -24.0F, 1, 1, 2, 0.0F, false));

		ACR85_r1 = new ModelRenderer(this);
		ACR85_r1.setRotationPoint(-26.7287F, -25.5161F, 27.7487F);
		gun.addChild(ACR85_r1);
		setRotationAngle(ACR85_r1, 0.0F, 0.0F, 2.2307F);
		ACR85_r1.cubeList.add(new ModelBox(ACR85_r1, 87, 249, 1.0F, -37.8F, -24.0F, 1, 1, 27, 0.0F, false));

		ACR81_r1 = new ModelRenderer(this);
		ACR81_r1.setRotationPoint(1.5218F, 31.6258F, -5.9138F);
		gun.addChild(ACR81_r1);
		setRotationAngle(ACR81_r1, -0.8923F, 0.0F, 0.0F);
		ACR81_r1.cubeList.add(new ModelBox(ACR81_r1, 160, 84, -3.7F, -37.5F, -12.0F, 1, 1, 1, 0.0F, false));

		ACR80_r1 = new ModelRenderer(this);
		ACR80_r1.setRotationPoint(1.5218F, 41.8071F, -0.2604F);
		gun.addChild(ACR80_r1);
		setRotationAngle(ACR80_r1, -0.6692F, 0.0F, 0.0F);
		ACR80_r1.cubeList.add(new ModelBox(ACR80_r1, 123, 160, -3.7F, -37.5F, -22.0F, 1, 1, 1, 0.0F, false));

		ACR75_r1 = new ModelRenderer(this);
		ACR75_r1.setRotationPoint(-1.0558F, 36.2474F, 22.9459F);
		gun.addChild(ACR75_r1);
		setRotationAngle(ACR75_r1, 0.0F, 1.4871F, 0.0F);
		ACR75_r1.cubeList.add(new ModelBox(ACR75_r1, 113, 88, -3.9F, -36.8F, -1.0F, 2, 1, 1, 0.0F, false));

		ACR70_r1 = new ModelRenderer(this);
		ACR70_r1.setRotationPoint(1.5218F, 21.3981F, 50.6109F);
		gun.addChild(ACR70_r1);
		setRotationAngle(ACR70_r1, 0.8179F, 0.0F, 0.0F);
		ACR70_r1.cubeList.add(new ModelBox(ACR70_r1, 125, 79, -4.0F, -33.8F, -5.7F, 5, 1, 1, 0.0F, false));

		ACR60_r1 = new ModelRenderer(this);
		ACR60_r1.setRotationPoint(1.5218F, -18.4209F, 49.8753F);
		gun.addChild(ACR60_r1);
		setRotationAngle(ACR60_r1, 2.2679F, 0.0F, 0.0F);
		ACR60_r1.cubeList.add(new ModelBox(ACR60_r1, 35, 132, -3.5F, -32.5F, -1.7F, 4, 3, 1, 0.0F, false));

		ACR59_r1 = new ModelRenderer(this);
		ACR59_r1.setRotationPoint(1.5218F, -24.1737F, 38.6468F);
		gun.addChild(ACR59_r1);
		setRotationAngle(ACR59_r1, 2.6769F, 0.0F, 0.0F);
		ACR59_r1.cubeList.add(new ModelBox(ACR59_r1, 79, 133, -3.5F, -31.5F, -1.7F, 4, 3, 1, 0.0F, false));

		ACR58_r1 = new ModelRenderer(this);
		ACR58_r1.setRotationPoint(1.5218F, 17.0381F, -7.0491F);
		gun.addChild(ACR58_r1);
		setRotationAngle(ACR58_r1, -1.1154F, 0.0F, 0.0F);
		ACR58_r1.cubeList.add(new ModelBox(ACR58_r1, 141, 46, -3.78F, -37.5F, -2.0F, 4, 6, 3, 0.0F, false));
		ACR58_r1.cubeList.add(new ModelBox(ACR58_r1, 131, 81, -0.2F, -37.5F, -2.0F, 1, 6, 3, 0.0F, false));

		ACR54_r1 = new ModelRenderer(this);
		ACR54_r1.setRotationPoint(1.5218F, -14.4605F, 50.4454F);
		gun.addChild(ACR54_r1);
		setRotationAngle(ACR54_r1, 2.082F, 0.0F, 0.0F);
		ACR54_r1.cubeList.add(new ModelBox(ACR54_r1, 59, 10, -0.22F, -32.0F, -3.5F, 1, 6, 2, 0.0F, false));
		ACR54_r1.cubeList.add(new ModelBox(ACR54_r1, 80, 68, -3.8F, -32.0F, -3.5F, 4, 6, 2, 0.0F, false));

		ACR52_r1 = new ModelRenderer(this);
		ACR52_r1.setRotationPoint(1.5218F, 18.4244F, -11.343F);
		gun.addChild(ACR52_r1);
		setRotationAngle(ACR52_r1, -1.3756F, 0.0F, 0.0F);
		ACR52_r1.cubeList.add(new ModelBox(ACR52_r1, 149, 118, -2.0F, -32.7F, -8.7F, 1, 1, 2, 0.0F, false));

		ACR51_r1 = new ModelRenderer(this);
		ACR51_r1.setRotationPoint(1.5218F, 1.2475F, -12.0614F);
		gun.addChild(ACR51_r1);
		setRotationAngle(ACR51_r1, -1.9705F, 0.0F, 0.0F);
		ACR51_r1.cubeList.add(new ModelBox(ACR51_r1, 149, 121, -2.0F, -30.7F, -8.3F, 1, 1, 2, 0.0F, false));

		ACR50_r1 = new ModelRenderer(this);
		ACR50_r1.setRotationPoint(1.5218F, 29.6236F, 39.6889F);
		gun.addChild(ACR50_r1);
		setRotationAngle(ACR50_r1, 0.409F, 0.0F, 0.0F);
		ACR50_r1.cubeList.add(new ModelBox(ACR50_r1, 151, 0, -2.0F, -32.1F, -10.0F, 1, 2, 1, 0.0F, false));

		ACR49_r1 = new ModelRenderer(this);
		ACR49_r1.setRotationPoint(1.5218F, -1.57F, 44.3681F);
		gun.addChild(ACR49_r1);
		setRotationAngle(ACR49_r1, 1.0782F, 0.0F, 0.0F);
		ACR49_r1.cubeList.add(new ModelBox(ACR49_r1, 141, 91, -3.7F, -32.8F, -23.3F, 4, 1, 1, 0.0F, false));
		ACR49_r1.cubeList.add(new ModelBox(ACR49_r1, 160, 145, -0.3F, -32.8F, -23.3F, 1, 1, 1, 0.0F, false));

		ACR46_r1 = new ModelRenderer(this);
		ACR46_r1.setRotationPoint(1.5218F, 40.4986F, 2.976F);
		gun.addChild(ACR46_r1);
		setRotationAngle(ACR46_r1, -0.6692F, 0.0F, 0.0F);
		ACR46_r1.cubeList.add(new ModelBox(ACR46_r1, 160, 159, -0.3F, -33.5F, -18.5F, 1, 1, 1, 0.0F, false));

		ACR41_r1 = new ModelRenderer(this);
		ACR41_r1.setRotationPoint(1.5218F, -35.6762F, 11.9661F);
		gun.addChild(ACR41_r1);
		setRotationAngle(ACR41_r1, 2.3794F, 0.0F, 0.0F);
		ACR41_r1.cubeList.add(new ModelBox(ACR41_r1, 151, 3, -0.2F, -32.8F, -22.3F, 1, 2, 1, 0.0F, false));
		ACR41_r1.cubeList.add(new ModelBox(ACR41_r1, 17, 161, -3.8F, -32.8F, -22.3F, 1, 1, 1, 0.0F, false));

		ACR37_r1 = new ModelRenderer(this);
		ACR37_r1.setRotationPoint(1.5218F, 8.1389F, 44.6043F);
		gun.addChild(ACR37_r1);
		setRotationAngle(ACR37_r1, 0.8179F, 0.0F, 0.0F);
		ACR37_r1.cubeList.add(new ModelBox(ACR37_r1, 64, 152, -3.8F, -33.5F, -24.0F, 4, 1, 1, 0.0F, false));
		ACR37_r1.cubeList.add(new ModelBox(ACR37_r1, 40, 161, -0.2F, -33.5F, -24.0F, 1, 1, 1, 0.0F, false));

		ACR35_r1 = new ModelRenderer(this);
		ACR35_r1.setRotationPoint(1.5218F, -32.9436F, 23.0565F);
		gun.addChild(ACR35_r1);
		setRotationAngle(ACR35_r1, 2.2679F, 0.0F, 0.0F);
		ACR35_r1.cubeList.add(new ModelBox(ACR35_r1, 161, 91, -3.9F, -33.5F, -18.5F, 1, 1, 1, 0.0F, false));

		ACR27_r1 = new ModelRenderer(this);
		ACR27_r1.setRotationPoint(1.5218F, -27.6087F, 25.7219F);
		gun.addChild(ACR27_r1);
		setRotationAngle(ACR27_r1, 2.3423F, 0.0F, 0.0F);
		ACR27_r1.cubeList.add(new ModelBox(ACR27_r1, 161, 94, -3.68F, -31.5F, -14.5F, 1, 1, 1, 0.0F, false));
		ACR27_r1.cubeList.add(new ModelBox(ACR27_r1, 161, 96, -0.3F, -31.5F, -14.5F, 1, 1, 1, 0.0F, false));

		ACR25_r1 = new ModelRenderer(this);
		ACR25_r1.setRotationPoint(-14.0271F, 33.4383F, 27.7487F);
		gun.addChild(ACR25_r1);
		setRotationAngle(ACR25_r1, 0.0F, 0.0F, 0.5205F);
		ACR25_r1.cubeList.add(new ModelBox(ACR25_r1, 141, 118, -2.5F, -30.6F, -14.7F, 1, 2, 2, 0.0F, false));

		ACR23_r1 = new ModelRenderer(this);
		ACR23_r1.setRotationPoint(-25.7033F, 20.5597F, 27.7487F);
		gun.addChild(ACR23_r1);
		setRotationAngle(ACR23_r1, 0.0F, 0.0F, 1.0782F);
		ACR23_r1.cubeList.add(new ModelBox(ACR23_r1, 166, 164, -0.5F, -30.6F, -14.7F, 2, 1, 2, 0.0F, false));

		ACR22_r1 = new ModelRenderer(this);
		ACR22_r1.setRotationPoint(1.5218F, -9.3726F, 39.0711F);
		gun.addChild(ACR22_r1);
		setRotationAngle(ACR22_r1, 1.3756F, 0.0F, 0.0F);
		ACR22_r1.cubeList.add(new ModelBox(ACR22_r1, 40, 63, -0.12F, -29.7F, -22.1F, 1, 7, 1, 0.0F, false));
		ACR22_r1.cubeList.add(new ModelBox(ACR22_r1, 71, 20, -3.92F, -29.7F, -22.1F, 4, 7, 1, 0.0F, false));

		ACR20_r1 = new ModelRenderer(this);
		ACR20_r1.setRotationPoint(1.5218F, 25.6942F, -13.4191F);
		gun.addChild(ACR20_r1);
		setRotationAngle(ACR20_r1, -1.4128F, 0.0F, 0.0F);
		ACR20_r1.cubeList.add(new ModelBox(ACR20_r1, 110, 153, -3.9F, -29.4F, -14.4F, 4, 1, 1, 0.0F, false));
		ACR20_r1.cubeList.add(new ModelBox(ACR20_r1, 161, 98, -0.1F, -29.4F, -14.4F, 1, 1, 1, 0.0F, false));

		ACR18_r1 = new ModelRenderer(this);
		ACR18_r1.setRotationPoint(1.5218F, 42.9167F, 12.1486F);
		gun.addChild(ACR18_r1);
		setRotationAngle(ACR18_r1, -0.4461F, 0.0F, 0.0F);
		ACR18_r1.cubeList.add(new ModelBox(ACR18_r1, 158, 59, -3.9F, -31.05F, -22.5F, 4, 1, 1, 0.0F, false));
		ACR18_r1.cubeList.add(new ModelBox(ACR18_r1, 161, 102, -0.1F, -31.05F, -22.5F, 1, 1, 1, 0.0F, false));

		ACR14_r1 = new ModelRenderer(this);
		ACR14_r1.setRotationPoint(1.5218F, -10.0068F, 39.0429F);
		gun.addChild(ACR14_r1);
		setRotationAngle(ACR14_r1, 1.3756F, 0.0F, 0.0F);
		ACR14_r1.cubeList.add(new ModelBox(ACR14_r1, 23, 0, -3.9F, -30.0F, -22.5F, 4, 8, 1, 0.0F, false));
		ACR14_r1.cubeList.add(new ModelBox(ACR14_r1, 14, 0, -0.1F, -30.0F, -22.5F, 1, 8, 1, 0.0F, false));

		ACR888_r1 = new ModelRenderer(this);
		ACR888_r1.setRotationPoint(1.5218F, 2.5992F, 44.7013F);
		gun.addChild(ACR888_r1);
		setRotationAngle(ACR888_r1, 1.2641F, 0.0F, 0.0F);
		ACR888_r1.cubeList.add(new ModelBox(ACR888_r1, 167, 38, -3.0F, -28.4F, -14.5F, 3, 2, 1, 0.0F, false));

		ACR6_r1 = new ModelRenderer(this);
		ACR6_r1.setRotationPoint(1.5218F, -18.7486F, 15.532F);
		gun.addChild(ACR6_r1);
		setRotationAngle(ACR6_r1, 3.0115F, 0.0F, 0.0F);
		ACR6_r1.cubeList.add(new ModelBox(ACR6_r1, 63, 130, -3.0F, -27.1F, -7.9F, 3, 1, 5, 0.0F, false));

		ACR5_r1 = new ModelRenderer(this);
		ACR5_r1.setRotationPoint(1.5218F, 22.1368F, -3.293F);
		gun.addChild(ACR5_r1);
		setRotationAngle(ACR5_r1, -1.2269F, 0.0F, 0.0F);
		ACR5_r1.cubeList.add(new ModelBox(ACR5_r1, 98, 164, -3.0F, -29.1F, -5.5F, 3, 3, 1, 0.0F, false));
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
