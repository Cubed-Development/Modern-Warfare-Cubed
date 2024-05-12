package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BushmasterACR extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun_r1;
	private final ModelRenderer gun_r2;
	private final ModelRenderer gun_r3;
	private final ModelRenderer gun_r4;
	private final ModelRenderer gun_r5;
	private final ModelRenderer gun_r6;
	private final ModelRenderer gun_r7;
	private final ModelRenderer gun_r8;
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
		textureWidth = 380;
		textureHeight = 380;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-1.5218F, -12.2474F, -27.7487F);
		gun.cubeList.add(new ModelBox(gun, 17, 154, -1.4782F, 3.8474F, 13.2487F, 3, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 217, 123, -2.2782F, 1.2474F, 14.2487F, 4, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 67, 93, 1.3318F, 1.2474F, 14.2487F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 145, 1.2218F, 1.4474F, 9.2487F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 218, 184, -2.1782F, 1.2474F, 5.2487F, 4, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 47, 1.2218F, 4.2474F, 5.2487F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 185, -2.1782F, 4.2474F, 5.2487F, 4, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 166, 26, 1.2218F, 6.2474F, 10.2487F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 162, -2.1782F, 6.2474F, 10.2487F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 155, 157, -2.2782F, 1.2474F, 5.2487F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 156, 140, 1.3218F, 1.2474F, 5.2487F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 54, 158, 1.3218F, 1.7474F, 3.7487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 99, -2.2782F, 1.7474F, 3.7487F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 165, -2.2782F, 1.7474F, 5.2487F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 165, 53, 1.3218F, 2.4474F, 4.4487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 159, 56, -2.2782F, 2.4474F, 4.4487F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 165, 51, 1.6218F, 1.7474F, 4.2487F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 165, 48, -2.3782F, 1.7474F, 4.2487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 153, 133, 1.2218F, 2.2474F, 5.2487F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 145, 1.2218F, 3.2474F, 9.2487F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 133, 1.1218F, 2.3474F, 9.2487F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 67, 1.3218F, -1.7526F, 25.7487F, 1, 4, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 68, -2.2682F, -1.7526F, 25.7487F, 4, 4, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 158, 1.3218F, 1.2474F, 3.7487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 33, -2.2782F, 1.2474F, 3.7487F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 38, -2.4782F, 1.2474F, 14.2487F, 5, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 15, -2.4782F, 3.2474F, 14.2487F, 5, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 80, -2.4782F, 2.2474F, 14.2487F, 5, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 151, 111, 1.7218F, 1.7474F, 14.7487F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 151, 69, -2.6782F, 1.7474F, 14.7487F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 54, 1.4218F, -1.2526F, 28.7487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 46, -2.3782F, -1.2526F, 28.7487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 79, -2.4782F, -0.7526F, 29.2487F, 5, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 157, -2.3782F, -0.5526F, 26.7487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 0, -2.1782F, -2.2526F, 15.7487F, 1, 4, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 307, 259, 1.2218F, -2.2526F, 3.7487F, 1, 4, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 11, -2.1782F, -2.2526F, 3.7487F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 92, -2.1782F, -0.9526F, 5.7487F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 143, 0, -2.4782F, -3.5526F, 15.7487F, 2, 2, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 245, 0.5218F, -3.5526F, 3.7487F, 2, 2, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 140, -2.4782F, -3.5526F, 3.7487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 165, 1, 1.8218F, -3.3526F, 4.0487F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 165, -2.5782F, -3.3526F, 4.0487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 140, -3.1782F, -3.7526F, 15.9487F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 152, -3.1782F, -2.2526F, 15.9487F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 151, 66, -3.1782F, -3.7526F, 17.4487F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 146, 164, -3.1782F, -2.2526F, 17.4487F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 280, 170, 0.2218F, -5.9726F, 3.7487F, 1, 2, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 277, 143, -1.1782F, -5.9526F, 3.7487F, 2, 2, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 131, 94, 0.3218F, -5.1526F, 27.7487F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 59, -2.9782F, -0.2526F, 3.2487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 109, -2.9782F, 0.2474F, 3.2487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 89, -2.9782F, -0.0026F, 3.0487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 43, -2.9782F, -0.0026F, 3.4487F, 6, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 153, -1.2782F, -5.1526F, 27.7487F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 0, -0.4782F, -1.7526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 94, -0.4782F, -1.2526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 48, -0.7282F, -1.5026F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 93, -0.2282F, -1.5026F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 92, -0.6282F, -1.6526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 1, -0.3282F, -1.6526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 47, -0.6282F, -1.3526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 46, -0.3282F, -1.3526F, -47.2513F, 1, 1, 45, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 165, -0.8782F, -1.8526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 164, -0.0782F, -1.8526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 162, 8, -0.0782F, -1.0526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 161, -0.8782F, -1.0526F, -49.2513F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 204, 70, -0.4782F, -4.2526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 187, 69, -0.4782F, -3.7526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 149, -0.7282F, -4.0026F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 133, -0.2282F, -4.0026F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 159, -0.3282F, -4.1526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 158, -0.6282F, -4.1526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 157, -0.6282F, -3.8526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 154, -0.3282F, -3.8526F, -28.2513F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 126, -0.4782F, -4.3526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 119, -0.8282F, -4.0026F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 140, -0.1282F, -4.0026F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 140, -0.4782F, -3.6526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 139, -0.2282F, -3.7526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 139, -0.2282F, -4.2526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 6, -0.7282F, -3.7526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 0, -0.7282F, -4.2526F, -28.2513F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 155, 161, -0.4782F, -2.6526F, -27.2513F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 172, -0.7282F, -1.7526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 163, 111, -0.7282F, -1.2526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 148, -0.2282F, -1.2526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 54, -0.2282F, -1.7526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 141, 46, -0.8282F, -1.5026F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 140, -0.1282F, -1.5026F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 125, -0.4782F, -1.1526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 121, -0.4782F, -1.8526F, -27.7513F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 218, 171, -0.4782F, -1.8526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 216, -0.2282F, -1.7526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 159, -0.1282F, -1.5026F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 159, 46, -0.2282F, -1.2526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 158, -0.4782F, -1.1526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 154, -0.7282F, -1.2526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 109, 140, -0.8282F, -1.5026F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 139, -0.7282F, -1.7526F, -43.7513F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 164, -0.4782F, -4.1526F, -28.7513F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 164, -0.4782F, -3.8526F, -28.7513F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 276, 115, -1.1782F, -5.9526F, -21.2513F, 2, 2, 25, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 280, 53, 0.2218F, -5.9726F, -21.2513F, 1, 2, 25, 0.0F, false));

		gun_r1 = new ModelRenderer(this);
		gun_r1.setRotationPoint(2.1218F, -2.2526F, 14.2487F);
		gun.addChild(gun_r1);
		setRotationAngle(gun_r1, 0.7418F, 0.0F, 0.0F);
		gun_r1.cubeList.add(new ModelBox(gun_r1, 165, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.05F, false));

		gun_r2 = new ModelRenderer(this);
		gun_r2.setRotationPoint(-2.0782F, -2.2526F, 24.7487F);
		gun.addChild(gun_r2);
		setRotationAngle(gun_r2, 0.7372F, 0.1762F, -0.1567F);
		gun_r2.cubeList.add(new ModelBox(gun_r2, 165, 5, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun_r3 = new ModelRenderer(this);
		gun_r3.setRotationPoint(2.1218F, -2.2526F, 24.7487F);
		gun.addChild(gun_r3);
		setRotationAngle(gun_r3, 0.7418F, 0.0F, 0.0F);
		gun_r3.cubeList.add(new ModelBox(gun_r3, 8, 165, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.05F, false));

		gun_r4 = new ModelRenderer(this);
		gun_r4.setRotationPoint(-2.0782F, -2.7526F, 29.7487F);
		gun.addChild(gun_r4);
		setRotationAngle(gun_r4, 0.829F, 0.0F, 0.0F);
		gun_r4.cubeList.add(new ModelBox(gun_r4, 46, 165, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		gun_r5 = new ModelRenderer(this);
		gun_r5.setRotationPoint(2.1218F, -2.7526F, 29.7487F);
		gun.addChild(gun_r5);
		setRotationAngle(gun_r5, 0.7418F, 0.0F, 0.0F);
		gun_r5.cubeList.add(new ModelBox(gun_r5, 165, 46, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.05F, false));

		gun_r6 = new ModelRenderer(this);
		gun_r6.setRotationPoint(-2.2782F, 2.7474F, 22.6487F);
		gun.addChild(gun_r6);
		setRotationAngle(gun_r6, 0.4373F, -0.0633F, -0.0295F);
		gun_r6.cubeList.add(new ModelBox(gun_r6, 47, 116, -0.4F, -0.7F, -1.0F, 1, 1, 2, -0.2F, false));

		gun_r7 = new ModelRenderer(this);
		gun_r7.setRotationPoint(0.0718F, 2.9474F, 21.8487F);
		gun.addChild(gun_r7);
		setRotationAngle(gun_r7, -0.4363F, 0.0F, 0.0F);
		gun_r7.cubeList.add(new ModelBox(gun_r7, 47, 112, -2.85F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));
		gun_r7.cubeList.add(new ModelBox(gun_r7, 143, 0, 1.85F, -1.0F, -1.0F, 1, 2, 2, -0.4F, false));

		gun_r8 = new ModelRenderer(this);
		gun_r8.setRotationPoint(2.4218F, 2.7474F, 22.6487F);
		gun.addChild(gun_r8);
		setRotationAngle(gun_r8, 0.4373F, -0.0633F, -0.0295F);
		gun_r8.cubeList.add(new ModelBox(gun_r8, 116, 98, -0.7F, -0.7F, -1.0F, 1, 1, 2, -0.2F, false));

		ACR138_r1 = new ModelRenderer(this);
		ACR138_r1.setRotationPoint(32.8894F, 17.4127F, 27.7487F);
		gun.addChild(ACR138_r1);
		setRotationAngle(ACR138_r1, 0.0F, 0.0F, -0.9295F);
		ACR138_r1.cubeList.add(new ModelBox(ACR138_r1, 127, 125, -3.1F, -40.7F, -45.0F, 1, 1, 5, 0.0F, false));

		ACR137_r1 = new ModelRenderer(this);
		ACR137_r1.setRotationPoint(-21.9805F, -37.3162F, 27.7487F);
		gun.addChild(ACR137_r1);
		setRotationAngle(ACR137_r1, 0.0F, 0.0F, 2.5133F);
		ACR137_r1.cubeList.add(new ModelBox(ACR137_r1, 127, 47, 0.2F, -40.6F, -45.0F, 1, 1, 5, 0.0F, false));

		ACR136_r1 = new ModelRenderer(this);
		ACR136_r1.setRotationPoint(33.5708F, 17.3718F, 27.7487F);
		gun.addChild(ACR136_r1);
		setRotationAngle(ACR136_r1, 0.0F, 0.0F, -0.9295F);
		ACR136_r1.cubeList.add(new ModelBox(ACR136_r1, 307, 53, -2.8F, -41.4F, -45.0F, 1, 1, 23, 0.0F, false));

		ACR135_r1 = new ModelRenderer(this);
		ACR135_r1.setRotationPoint(-23.1743F, -38.5283F, 27.7487F);
		gun.addChild(ACR135_r1);
		setRotationAngle(ACR135_r1, 0.0F, 0.0F, 2.5133F);
		ACR135_r1.cubeList.add(new ModelBox(ACR135_r1, 306, 142, -0.2F, -41.4F, -45.0F, 1, 1, 23, 0.0F, false));

		ACR134_r1 = new ModelRenderer(this);
		ACR134_r1.setRotationPoint(-20.8408F, -36.8865F, 27.7487F);
		gun.addChild(ACR134_r1);
		setRotationAngle(ACR134_r1, 0.0F, 0.0F, 2.5133F);
		ACR134_r1.cubeList.add(new ModelBox(ACR134_r1, 217, 153, 0.7F, -40.2F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR134_r1.cubeList.add(new ModelBox(ACR134_r1, 147, 151, 0.7F, -40.2F, -42.0F, 1, 1, 2, 0.0F, false));
		ACR134_r1.cubeList.add(new ModelBox(ACR134_r1, 138, 151, 0.7F, -40.2F, -45.0F, 1, 1, 2, 0.0F, false));

		ACR131_r1 = new ModelRenderer(this);
		ACR131_r1.setRotationPoint(32.2477F, 17.1328F, 27.7487F);
		gun.addChild(ACR131_r1);
		setRotationAngle(ACR131_r1, 0.0F, 0.0F, -0.9295F);
		ACR131_r1.cubeList.add(new ModelBox(ACR131_r1, 121, 216, -3.7F, -40.2F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR131_r1.cubeList.add(new ModelBox(ACR131_r1, 151, 27, -3.7F, -40.2F, -45.0F, 1, 1, 2, 0.0F, false));
		ACR131_r1.cubeList.add(new ModelBox(ACR131_r1, 151, 24, -3.7F, -40.2F, -42.0F, 1, 1, 2, 0.0F, false));

		ACR128_r1 = new ModelRenderer(this);
		ACR128_r1.setRotationPoint(31.8066F, 17.0531F, 27.7487F);
		gun.addChild(ACR128_r1);
		setRotationAngle(ACR128_r1, 0.0F, 0.0F, -0.9295F);
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 151, 20, -4.0F, -39.8F, -45.0F, 1, 1, 2, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 151, 17, -4.0F, -39.8F, -42.0F, 1, 1, 2, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 216, 100, -4.0F, -39.8006F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 14, 86, -4.0F, -39.8F, -40.0F, 3, 1, 4, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 130, 110, -4.0F, -39.8F, -43.0F, 3, 1, 1, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 0, 86, -4.0F, -39.8F, -49.0F, 3, 1, 4, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 113, 88, -4.0F, -39.8F, 2.0F, 2, 1, 1, 0.0F, false));
		ACR128_r1.cubeList.add(new ModelBox(ACR128_r1, 278, 28, -4.0F, -39.8F, -22.0F, 3, 1, 24, 0.0F, false));

		ACR126_r1 = new ModelRenderer(this);
		ACR126_r1.setRotationPoint(-20.063F, -36.3392F, 27.7487F);
		gun.addChild(ACR126_r1);
		setRotationAngle(ACR126_r1, 0.0F, 0.0F, 2.5133F);
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 151, 11, 1.0F, -39.8F, -45.0F, 1, 1, 2, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 151, 8, 1.0F, -39.8F, -42.0F, 1, 1, 2, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 0, 198, 1.0F, -39.8F, -36.0F, 1, 1, 14, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 78, 152, 1.0F, -39.8F, -40.0F, 1, 3, 4, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 26, 67, 1.0F, -39.8F, -43.0F, 1, 3, 1, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 32, 150, 1.0F, -39.8F, -49.0F, 1, 3, 4, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 151, 63, 1.0F, -39.8F, 2.0F, 1, 2, 1, 0.0F, false));
		ACR126_r1.cubeList.add(new ModelBox(ACR126_r1, 147, 288, 1.0F, -39.8023F, -22.0F, 1, 3, 24, 0.0F, false));

		ACR274_r1 = new ModelRenderer(this);
		ACR274_r1.setRotationPoint(1.5218F, -37.2661F, -113.568F);
		gun.addChild(ACR274_r1);
		setRotationAngle(ACR274_r1, 3.123F, 0.0F, 0.0F);
		ACR274_r1.cubeList.add(new ModelBox(ACR274_r1, 92, 159, -2.0F, -36.1F, -71.0F, 1, 1, 6, 0.0F, false));

		ACR273_r1 = new ModelRenderer(this);
		ACR273_r1.setRotationPoint(69.8706F, 36.2474F, -42.6499F);
		gun.addChild(ACR273_r1);
		setRotationAngle(ACR273_r1, 0.0F, 1.5243F, 0.0F);
		ACR273_r1.cubeList.add(new ModelBox(ACR273_r1, 14, 43, -2.7F, -37.75F, -71.0F, 6, 1, 1, 0.0F, false));

		ACR272_r1 = new ModelRenderer(this);
		ACR272_r1.setRotationPoint(-1.717F, 36.2474F, -114.1911F);
		gun.addChild(ACR272_r1);
		setRotationAngle(ACR272_r1, -3.1416F, -0.0372F, 3.1416F);
		ACR272_r1.cubeList.add(new ModelBox(ACR272_r1, 46, 158, -0.3F, -37.75F, -71.0F, 1, 1, 6, 0.0F, false));

		ACR271_r1 = new ModelRenderer(this);
		ACR271_r1.setRotationPoint(1.5218F, 70.4593F, -78.4113F);
		gun.addChild(ACR271_r1);
		setRotationAngle(ACR271_r1, -1.5243F, 0.0F, 0.0F);
		ACR271_r1.cubeList.add(new ModelBox(ACR271_r1, 89, 36, -2.0F, -38.5F, -71.0F, 1, 6, 1, 0.0F, false));

		ACR4_r1 = new ModelRenderer(this);
		ACR4_r1.setRotationPoint(1.5218F, 23.5196F, 43.1526F);
		gun.addChild(ACR4_r1);
		setRotationAngle(ACR4_r1, 1.041F, 0.0F, 0.0F);
		ACR4_r1.cubeList.add(new ModelBox(ACR4_r1, 82, 7, -3.5F, -19.8F, -3.4F, 4, 1, 2, -0.001F, false));

		ACR3_r1 = new ModelRenderer(this);
		ACR3_r1.setRotationPoint(1.5218F, 24.7014F, 7.6844F);
		gun.addChild(ACR3_r1);
		setRotationAngle(ACR3_r1, -1.1897F, 0.0F, 0.0F);
		ACR3_r1.cubeList.add(new ModelBox(ACR3_r1, 116, 105, -3.5F, -20.6F, -1.5F, 4, 2, 1, 0.0F, false));

		ACR2_r1 = new ModelRenderer(this);
		ACR2_r1.setRotationPoint(1.5218F, 18.1909F, -4.837F);
		gun.addChild(ACR2_r1);
		setRotationAngle(ACR2_r1, -1.1525F, 0.0F, 0.0F);
		ACR2_r1.cubeList.add(new ModelBox(ACR2_r1, 141, 111, -3.52F, -34.1F, -2.4F, 4, 1, 14, 0.0F, false));

		ACR1_r1 = new ModelRenderer(this);
		ACR1_r1.setRotationPoint(1.5218F, 16.0656F, -5.8739F);
		gun.addChild(ACR1_r1);
		setRotationAngle(ACR1_r1, -1.2217F, 0.0F, 0.0F);
		ACR1_r1.cubeList.add(new ModelBox(ACR1_r1, 94, 94, -3.5F, -34.1F, -2.4F, 4, 5, 14, 0.0F, false));

		ACR114_r1 = new ModelRenderer(this);
		ACR114_r1.setRotationPoint(1.5218F, 35.5135F, 19.8752F);
		gun.addChild(ACR114_r1);
		setRotationAngle(ACR114_r1, -0.1859F, 0.0F, 0.0F);
		ACR114_r1.cubeList.add(new ModelBox(ACR114_r1, 151, 38, -2.5F, -42.6F, 0.0F, 2, 1, 3, 0.0F, false));

		ACR105_r1 = new ModelRenderer(this);
		ACR105_r1.setRotationPoint(7.2027F, 36.2474F, 17.5448F);
		gun.addChild(ACR105_r1);
		setRotationAngle(ACR105_r1, 0.0F, 1.1897F, 0.0F);
		ACR105_r1.cubeList.add(new ModelBox(ACR105_r1, 151, 3, -4.7F, -38.5F, -9.3F, 1, 1, 2, 0.0F, false));
		ACR105_r1.cubeList.add(new ModelBox(ACR105_r1, 84, 139, -4.7F, -40.0F, -9.3F, 1, 2, 2, 0.0F, false));

		ACR103_r1 = new ModelRenderer(this);
		ACR103_r1.setRotationPoint(32.5667F, 11.0211F, 27.7487F);
		gun.addChild(ACR103_r1);
		setRotationAngle(ACR103_r1, 0.0F, 0.0F, -1.1154F);
		ACR103_r1.cubeList.add(new ModelBox(ACR103_r1, 103, 149, -4.7F, -37.5F, -10.3F, 1, 2, 1, 0.0F, false));
		ACR103_r1.cubeList.add(new ModelBox(ACR103_r1, 54, 139, -4.7F, -37.5F, -11.8F, 1, 2, 2, 0.0F, false));

		ACR87_r1 = new ModelRenderer(this);
		ACR87_r1.setRotationPoint(23.0809F, 26.5823F, 27.7487F);
		gun.addChild(ACR87_r1);
		setRotationAngle(ACR87_r1, 0.0F, 0.0F, -0.632F);
		ACR87_r1.cubeList.add(new ModelBox(ACR87_r1, 143, 17, -4.0F, -37.8F, -12.0F, 1, 1, 15, 0.0F, false));
		ACR87_r1.cubeList.add(new ModelBox(ACR87_r1, 151, 0, -4.0F, -37.8F, -24.0F, 1, 1, 2, 0.0F, false));

		ACR85_r1 = new ModelRenderer(this);
		ACR85_r1.setRotationPoint(-26.7287F, -25.5161F, 27.7487F);
		gun.addChild(ACR85_r1);
		setRotationAngle(ACR85_r1, 0.0F, 0.0F, 2.2307F);
		ACR85_r1.cubeList.add(new ModelBox(ACR85_r1, 222, 260, 1.0F, -37.8F, -24.0F, 1, 1, 27, 0.0F, false));

		ACR81_r1 = new ModelRenderer(this);
		ACR81_r1.setRotationPoint(1.5218F, 31.6258F, -5.9138F);
		gun.addChild(ACR81_r1);
		setRotationAngle(ACR81_r1, -0.8923F, 0.0F, 0.0F);
		ACR81_r1.cubeList.add(new ModelBox(ACR81_r1, 117, 164, -3.7F, -37.5F, -12.0F, 1, 1, 1, 0.0F, false));

		ACR80_r1 = new ModelRenderer(this);
		ACR80_r1.setRotationPoint(1.5218F, 41.8071F, -0.2604F);
		gun.addChild(ACR80_r1);
		setRotationAngle(ACR80_r1, -0.6692F, 0.0F, 0.0F);
		ACR80_r1.cubeList.add(new ModelBox(ACR80_r1, 164, 99, -3.7F, -37.5F, -22.0F, 1, 1, 1, 0.0F, false));

		ACR75_r1 = new ModelRenderer(this);
		ACR75_r1.setRotationPoint(-1.0558F, 36.2474F, 22.9459F);
		gun.addChild(ACR75_r1);
		setRotationAngle(ACR75_r1, 0.0F, 1.4871F, 0.0F);
		ACR75_r1.cubeList.add(new ModelBox(ACR75_r1, 58, 98, -3.9F, -36.8F, -1.0F, 2, 1, 1, 0.0F, false));

		ACR70_r1 = new ModelRenderer(this);
		ACR70_r1.setRotationPoint(1.5218F, 21.3981F, 50.6109F);
		gun.addChild(ACR70_r1);
		setRotationAngle(ACR70_r1, 0.8179F, 0.0F, 0.0F);
		

		ACR60_r1 = new ModelRenderer(this);
		ACR60_r1.setRotationPoint(1.5218F, -18.4209F, 49.8753F);
		gun.addChild(ACR60_r1);
		setRotationAngle(ACR60_r1, 2.2679F, 0.0F, 0.0F);
		ACR60_r1.cubeList.add(new ModelBox(ACR60_r1, 22, 148, -3.5F, -32.5F, -1.7F, 4, 3, 1, 0.0F, false));

		ACR59_r1 = new ModelRenderer(this);
		ACR59_r1.setRotationPoint(1.5218F, -24.1737F, 38.6468F);
		gun.addChild(ACR59_r1);
		setRotationAngle(ACR59_r1, 2.6769F, 0.0F, 0.0F);
		ACR59_r1.cubeList.add(new ModelBox(ACR59_r1, 143, 33, -3.5F, -31.5F, -1.7F, 4, 3, 1, 0.0F, false));

		ACR58_r1 = new ModelRenderer(this);
		ACR58_r1.setRotationPoint(1.5218F, 17.0381F, -7.0491F);
		gun.addChild(ACR58_r1);
		setRotationAngle(ACR58_r1, -1.1154F, 0.0F, 0.0F);
		ACR58_r1.cubeList.add(new ModelBox(ACR58_r1, 141, 94, -3.78F, -37.5F, -2.0F, 4, 6, 3, 0.0F, false));
		ACR58_r1.cubeList.add(new ModelBox(ACR58_r1, 114, 113, -0.2F, -37.5F, -2.0F, 1, 6, 3, -0.001F, false));

		ACR54_r1 = new ModelRenderer(this);
		ACR54_r1.setRotationPoint(1.5218F, -14.4605F, 50.4454F);
		gun.addChild(ACR54_r1);
		setRotationAngle(ACR54_r1, 2.082F, 0.0F, 0.0F);
		ACR54_r1.cubeList.add(new ModelBox(ACR54_r1, 57, 47, -0.22F, -32.0F, -3.5F, 1, 6, 2, 0.0F, false));
		ACR54_r1.cubeList.add(new ModelBox(ACR54_r1, 80, 68, -3.8F, -32.0F, -3.5F, 4, 6, 2, 0.0F, false));

		ACR52_r1 = new ModelRenderer(this);
		ACR52_r1.setRotationPoint(1.5218F, 18.4244F, -11.343F);
		gun.addChild(ACR52_r1);
		setRotationAngle(ACR52_r1, -1.3756F, 0.0F, 0.0F);
		ACR52_r1.cubeList.add(new ModelBox(ACR52_r1, 150, 57, -2.0F, -32.7F, -8.7F, 1, 1, 2, 0.0F, false));

		ACR51_r1 = new ModelRenderer(this);
		ACR51_r1.setRotationPoint(1.5218F, 1.2475F, -12.0614F);
		gun.addChild(ACR51_r1);
		setRotationAngle(ACR51_r1, -1.9705F, 0.0F, 0.0F);
		ACR51_r1.cubeList.add(new ModelBox(ACR51_r1, 150, 54, -2.0F, -30.7F, -8.3F, 1, 1, 2, 0.0F, false));

		ACR50_r1 = new ModelRenderer(this);
		ACR50_r1.setRotationPoint(1.5218F, 29.6236F, 39.6889F);
		gun.addChild(ACR50_r1);
		setRotationAngle(ACR50_r1, 0.409F, 0.0F, 0.0F);
		ACR50_r1.cubeList.add(new ModelBox(ACR50_r1, 92, 149, -2.0F, -32.1F, -10.0F, 1, 2, 1, 0.0F, false));

		ACR49_r1 = new ModelRenderer(this);
		ACR49_r1.setRotationPoint(1.5218F, -1.57F, 44.3681F);
		gun.addChild(ACR49_r1);
		setRotationAngle(ACR49_r1, 1.0782F, 0.0F, 0.0F);
		ACR49_r1.cubeList.add(new ModelBox(ACR49_r1, 109, 153, -3.7F, -32.8F, -23.3F, 4, 1, 1, 0.0F, false));
		ACR49_r1.cubeList.add(new ModelBox(ACR49_r1, 164, 97, -0.3F, -32.8F, -23.3F, 1, 1, 1, 0.0F, false));

		ACR46_r1 = new ModelRenderer(this);
		ACR46_r1.setRotationPoint(1.5218F, 40.4986F, 2.976F);
		gun.addChild(ACR46_r1);
		setRotationAngle(ACR46_r1, -0.6692F, 0.0F, 0.0F);
		ACR46_r1.cubeList.add(new ModelBox(ACR46_r1, 164, 95, -0.3F, -33.5F, -18.5F, 1, 1, 1, -0.002F, false));

		ACR41_r1 = new ModelRenderer(this);
		ACR41_r1.setRotationPoint(1.5218F, -35.6762F, 11.9661F);
		gun.addChild(ACR41_r1);
		setRotationAngle(ACR41_r1, 2.3794F, 0.0F, 0.0F);
		ACR41_r1.cubeList.add(new ModelBox(ACR41_r1, 131, 146, -0.2F, -32.8F, -22.3F, 1, 2, 1, -0.002F, false));
		ACR41_r1.cubeList.add(new ModelBox(ACR41_r1, 83, 164, -3.8F, -32.8F, -22.3F, 1, 1, 1, 0.0F, false));

		ACR37_r1 = new ModelRenderer(this);
		ACR37_r1.setRotationPoint(1.5218F, 8.1389F, 44.6043F);
		gun.addChild(ACR37_r1);
		setRotationAngle(ACR37_r1, 0.8179F, 0.0F, 0.0F);
		ACR37_r1.cubeList.add(new ModelBox(ACR37_r1, 63, 152, -3.8F, -33.5F, -24.0F, 4, 1, 1, 0.0F, false));
		ACR37_r1.cubeList.add(new ModelBox(ACR37_r1, 77, 164, -0.2F, -33.5F, -24.0F, 1, 1, 1, 0.0F, false));

		ACR35_r1 = new ModelRenderer(this);
		ACR35_r1.setRotationPoint(1.5218F, -32.9436F, 23.0565F);
		gun.addChild(ACR35_r1);
		setRotationAngle(ACR35_r1, 2.2679F, 0.0F, 0.0F);
		ACR35_r1.cubeList.add(new ModelBox(ACR35_r1, 11, 164, -3.9F, -33.5F, -18.5F, 1, 1, 1, 0.0F, false));

		ACR27_r1 = new ModelRenderer(this);
		ACR27_r1.setRotationPoint(1.5218F, -27.6087F, 25.7219F);
		gun.addChild(ACR27_r1);
		setRotationAngle(ACR27_r1, 2.3423F, 0.0F, 0.0F);
		ACR27_r1.cubeList.add(new ModelBox(ACR27_r1, 163, 121, -3.68F, -31.5F, -14.5F, 1, 1, 1, 0.0F, false));
		ACR27_r1.cubeList.add(new ModelBox(ACR27_r1, 163, 119, -0.3F, -31.5F, -14.5F, 1, 1, 1, -0.002F, false));

		ACR25_r1 = new ModelRenderer(this);
		ACR25_r1.setRotationPoint(-14.0271F, 33.4383F, 27.7487F);
		gun.addChild(ACR25_r1);
		setRotationAngle(ACR25_r1, 0.0F, 0.0F, 0.5205F);
		ACR25_r1.cubeList.add(new ModelBox(ACR25_r1, 46, 139, -2.5F, -30.6F, -14.7F, 1, 2, 2, 0.0F, false));

		ACR23_r1 = new ModelRenderer(this);
		ACR23_r1.setRotationPoint(-25.7033F, 20.5597F, 27.7487F);
		gun.addChild(ACR23_r1);
		setRotationAngle(ACR23_r1, 0.0F, 0.0F, 1.0782F);
		ACR23_r1.cubeList.add(new ModelBox(ACR23_r1, 166, 163, -0.5F, -30.6F, -14.7F, 2, 1, 2, 0.0F, false));

		ACR22_r1 = new ModelRenderer(this);
		ACR22_r1.setRotationPoint(1.5218F, -9.3726F, 39.0711F);
		gun.addChild(ACR22_r1);
		setRotationAngle(ACR22_r1, 1.3756F, 0.0F, 0.0F);
		ACR22_r1.cubeList.add(new ModelBox(ACR22_r1, 14, 23, -0.12F, -29.7F, -22.1F, 1, 7, 1, 0.0F, false));
		ACR22_r1.cubeList.add(new ModelBox(ACR22_r1, 71, 20, -3.92F, -29.7F, -22.1F, 4, 7, 1, 0.0F, false));

		ACR20_r1 = new ModelRenderer(this);
		ACR20_r1.setRotationPoint(1.5218F, 25.6942F, -13.4191F);
		gun.addChild(ACR20_r1);
		setRotationAngle(ACR20_r1, -1.4128F, 0.0F, 0.0F);
		ACR20_r1.cubeList.add(new ModelBox(ACR20_r1, 151, 91, -3.9F, -29.4F, -14.4F, 4, 1, 1, 0.0F, false));
		ACR20_r1.cubeList.add(new ModelBox(ACR20_r1, 163, 115, -0.1F, -29.4F, -14.4F, 1, 1, 1, 0.0F, false));

		ACR18_r1 = new ModelRenderer(this);
		ACR18_r1.setRotationPoint(1.5218F, 42.9167F, 12.1486F);
		gun.addChild(ACR18_r1);
		setRotationAngle(ACR18_r1, -0.4461F, 0.0F, 0.0F);
		ACR18_r1.cubeList.add(new ModelBox(ACR18_r1, 32, 148, -3.9F, -31.05F, -22.5F, 4, 1, 1, 0.0F, false));
		ACR18_r1.cubeList.add(new ModelBox(ACR18_r1, 163, 113, -0.1F, -31.05F, -22.5F, 1, 1, 1, 0.0F, false));

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
		ACR888_r1.cubeList.add(new ModelBox(ACR888_r1, 166, 160, -3.0F, -28.4F, -14.5F, 3, 2, 1, 0.0F, false));

		ACR6_r1 = new ModelRenderer(this);
		ACR6_r1.setRotationPoint(1.5218F, -18.7486F, 15.532F);
		gun.addChild(ACR6_r1);
		setRotationAngle(ACR6_r1, 3.0115F, 0.0F, 0.0F);
		ACR6_r1.cubeList.add(new ModelBox(ACR6_r1, 94, 77, -3.0F, -27.1F, -7.9F, 3, 1, 5, 0.0F, false));

		ACR5_r1 = new ModelRenderer(this);
		ACR5_r1.setRotationPoint(1.5218F, 22.1368F, -3.293F);
		gun.addChild(ACR5_r1);
		setRotationAngle(ACR5_r1, -1.2269F, 0.0F, 0.0F);
		ACR5_r1.cubeList.add(new ModelBox(ACR5_r1, 161, 73, -3.0F, -29.1F, -5.5F, 3, 3, 1, 0.0F, false));
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