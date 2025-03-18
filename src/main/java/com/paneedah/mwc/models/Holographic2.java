package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Holographic2 extends ModelBase {
	private final ModelRenderer holo;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer gun150_r1;
	private final ModelRenderer gun149_r1;
	private final ModelRenderer gun143_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun131_r1;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun124_r1;
	private final ModelRenderer gun122_r1;
	private final ModelRenderer gun115_r1;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun108_r1;
	private final ModelRenderer gun107_r1;
	private final ModelRenderer gun106_r1;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer gun89_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer gun74_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun72_r1;
	private final ModelRenderer gun71_r1;
	private final ModelRenderer gun70_r1;
	private final ModelRenderer gun65_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun55_r1;
	private final ModelRenderer gun54_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun26_r1;

	public Holographic2() {
		textureWidth = 64;
		textureHeight = 64;

		holo = new ModelRenderer(this);
		holo.setRotationPoint(0, -22.0425F, 9.0714F);
		holo.cubeList.add(new ModelBox(holo, 23, 0, -5, 18.3425F, -14.0714F, 1, 2, 2, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 10, -4.5F, 18.1425F, -15.0714F, 6, 2, 7, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 0, -4.5F, 20.9425F, -10.7714F, 7, 1, 9, 0, false));
		holo.cubeList.add(new ModelBox(holo, 18, 11, -5, 17.0425F, -9.5714F, 1, 4, 8, 0, false));
		holo.cubeList.add(new ModelBox(holo, 17, 47, 1.7F, 17.0425F, -9.5714F, 1, 4, 4, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 32, -5, 13.0425F, -9.0714F, 1, 4, 6, -0.001F, false));
		holo.cubeList.add(new ModelBox(holo, 51, 32, 1.7F, 19.0425F, -11.5714F, 1, 2, 2, 0, false));
		holo.cubeList.add(new ModelBox(holo, 51, 3, -5, 19.0425F, -11.5714F, 1, 2, 2, 0, false));
		holo.cubeList.add(new ModelBox(holo, 18, 23, -4, 12.0425F, -9.0714F, 5, 1, 6, 0, false));
		holo.cubeList.add(new ModelBox(holo, 4, 54, -5, 19.0425F, -10.5714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 54, 1, 19.0425F, -10.5714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 29, 30, 1, 13.0425F, -9.0714F, 1, 4, 6, 0, false));
		holo.cubeList.add(new ModelBox(holo, 49, 48, -4, 12.0425F, -3.5714F, 5, 1, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 0, 19, -4.5F, 17.0425F, -8.2714F, 6, 1, 6, 0, false));
		holo.cubeList.add(new ModelBox(holo, 28, 41, -4.5F, 17.2425F, -14.1714F, 1, 1, 6, 0, false));
		holo.cubeList.add(new ModelBox(holo, 41, 12, 0.5F, 17.2425F, -14.1714F, 1, 1, 6, 0, false));
		holo.cubeList.add(new ModelBox(holo, 23, 0, -4, 17.4425F, -14.2714F, 5, 1, 6, 0, false));
		holo.cubeList.add(new ModelBox(holo, 22, 38, -4.7F, 13.0425F, -8.2714F, 1, 4, 5, 0, false));
		holo.cubeList.add(new ModelBox(holo, 34, 18, 0.7F, 13.0425F, -8.2714F, 1, 4, 5, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 26, -4, 12.3425F, -8.2714F, 5, 1, 5, 0, false));
		holo.cubeList.add(new ModelBox(holo, 22, 38, -5, 20.0425F, -2.0714F, 1, 2, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 16, 38, 1.7F, 20.0425F, -2.0714F, 1, 2, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 28, 17, -3.8F, 20.3425F, -2.1714F, 4, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 53, 0, -0.2F, 20.8425F, -2.1714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 52, 24, -3.8F, 20.8425F, -2.1714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 15, -0.5F, 20.3425F, -2.1714F, 2, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 33, 50, 1.8F, 19.8425F, -7.3714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 6, 50, 1.8F, 19.8425F, -11.0714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 23, 47, 1.71F, 17.8425F, -7.5714F, 1, 1, 3, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 4, 1.71F, 17.3425F, -7.5714F, 1, 1, 3, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 8, 32, 1.7F, 17.0425F, -10.0714F, 1, 2, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 36, 41, -5, 21.0425F, -7.0714F, 1, 1, 5, 0, false));
		holo.cubeList.add(new ModelBox(holo, 22, 30, 1.7F, 21.0425F, -7.0714F, 1, 1, 5, 0, false));
		holo.cubeList.add(new ModelBox(holo, 39, 0, -4.5F, 20.1425F, -14.0714F, 6, 1, 2, 0, false));
		holo.cubeList.add(new ModelBox(holo, 28, 12, -4, 19.9425F, -11.7714F, 5, 2, 3, 0, false));
		holo.cubeList.add(new ModelBox(holo, 29, 30, 1, 18.1425F, -15.0714F, 1, 2, 2, 0, false));
		holo.cubeList.add(new ModelBox(holo, 8, 45, 1, 20.1425F, -14.0714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 44, 6, 1, 17.2425F, -14.1714F, 1, 1, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 43, 43, 1, 17.2425F, -14.0714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 8, 42, -5, 18.1425F, -13.5714F, 1, 1, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 36, 41, -5, 19.5425F, -13.5714F, 1, 1, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 38, 27, -5, 18.8425F, -14.2714F, 1, 1, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 37, 34, -5, 18.8425F, -12.8714F, 1, 1, 1, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 0, 36, -5.1F, 19.8425F, -7.3714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 34, 27, -5.1F, 19.8425F, -2.2714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 15, 29, 1, 19.8425F, -2.3714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 27, 7, 1, 20.4425F, -2.3714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 0, 49, 1.7F, 18.5425F, -6.0714F, 1, 1, 4, -0.002F, false));
		holo.cubeList.add(new ModelBox(holo, 27, 48, 1.7F, 17.0425F, -5.5714F, 1, 2, 4, 0, false));
		holo.cubeList.add(new ModelBox(holo, 45, 34, 1.5F, 19.5425F, -6.0714F, 1, 2, 4, 0, false));
		holo.cubeList.add(new ModelBox(holo, 19, 26, 1.6F, 19.8425F, -5.3714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 18, 23, 1.6F, 19.8425F, -3.2714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 23, 7, 1.6F, 19.8425F, -5.0714F, 1, 1, 1, 0, false));
		holo.cubeList.add(new ModelBox(holo, 23, 4, 1.6F, 19.8425F, -3.5714F, 1, 1, 1, 0, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(7.0841F, 46.0425F, -5.0058F);
		holo.addChild(gun152_r1);
		setRotationAngle(gun152_r1, -3.1416F, -0.7854F, 3.1416F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 5, 0, 2.7F, -26.5F, 3.5F, 1, 2, 1, 0, false));

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(9.5589F, 46.0425F, 0.9691F);
		holo.addChild(gun151_r1);
		setRotationAngle(gun151_r1, -3.1416F, -0.7854F, 3.1416F);
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 5, 4, 2.7F, -26.5F, 7, 1, 2, 1, 0, false));

		gun150_r1 = new ModelRenderer(this);
		gun150_r1.setRotationPoint(-14.1292F, -1.105F, -9.0714F);
		holo.addChild(gun150_r1);
		setRotationAngle(gun150_r1, 0, 0, 2.3562F);
		gun150_r1.cubeList.add(new ModelBox(gun150_r1, 8, 32, 2.7F, -26.5F, 3, 1, 1, 4, 0, false));

		gun149_r1 = new ModelRenderer(this);
		gun149_r1.setRotationPoint(-13.0685F, 1.4556F, -9.0714F);
		holo.addChild(gun149_r1);
		setRotationAngle(gun149_r1, 0, 0, 2.3562F);
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 16, 38, 2.7F, -25, 3, 1, 1, 4, 0, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(0, 17.1193F, -31.4378F);
		holo.addChild(gun143_r1);
		setRotationAngle(gun143_r1, -1.3384F, 0, 0);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 0, 0, 1, -28.6F, 6.6F, 1, 1, 3, 0, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(0, 43.7469F, 5.549F);
		holo.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.5205F, 0, 0);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 0, 19, -5.1F, -28.6F, 3, 1, 2, 2, 0, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(0, 41.4458F, 4.1907F);
		holo.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 0.5205F, 0, 0);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 19, 10, -5.1F, -27.2F, -2, 1, 2, 2, 0, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(0, 0, 0);
		holo.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 2.3562F, 0, 0);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 43, 3, 1, -24.9F, -5, 1, 1, 1, 0, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 43, 16, 1, -24.9F, -4.6F, 1, 1, 1, -0.002F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 44, 9, -4.5F, -24.9F, -4.6F, 6, 1, 1, -0.001F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 33, 48, -4.5F, -24.9F, -5, 6, 1, 1, 0, false));

		gun131_r1 = new ModelRenderer(this);
		gun131_r1.setRotationPoint(0, 33.6281F, 8.8995F);
		holo.addChild(gun131_r1);
		setRotationAngle(gun131_r1, 0.7854F, 0, 0);
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 36, 43, 1, -27.9F, -6, 1, 1, 1, -0.002F, false));
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 43, 41, 1, -27.9F, -5.7F, 1, 1, 1, -0.002F, false));
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 16, 45, 0.5F, -27.9F, -5.7F, 1, 1, 1, 0, false));
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 45, 34, -4.5F, -27.9F, -5.7F, 1, 1, 1, 0, false));
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 45, 36, 0.5F, -27.9F, -6, 1, 1, 1, 0, false));
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 46, 22, -4.5F, -27.9F, -6, 1, 1, 1, -0.001F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(-1.2239F, 46.0425F, -16.1709F);
		holo.addChild(gun129_r1);
		setRotationAngle(gun129_r1, -3.1416F, -1.2687F, 3.1416F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 0, 10, 2, -28.8F, -4, 2, 4, 1, -0.002F, false));

		gun124_r1 = new ModelRenderer(this);
		gun124_r1.setRotationPoint(0, 34.2487F, -32.1288F);
		holo.addChild(gun124_r1);
		setRotationAngle(gun124_r1, -0.8923F, 0, 0);
		gun124_r1.cubeList.add(new ModelBox(gun124_r1, 0, 32, 0.7F, -30, 0.8F, 1, 2, 2, 0, false));
		gun124_r1.cubeList.add(new ModelBox(gun124_r1, 14, 32, -4.7F, -30, 0.8F, 1, 2, 2, 0, false));

		gun122_r1 = new ModelRenderer(this);
		gun122_r1.setRotationPoint(0, 40.1321F, -32.4423F);
		holo.addChild(gun122_r1);
		setRotationAngle(gun122_r1, -0.8551F, 0, 0);
		gun122_r1.cubeList.add(new ModelBox(gun122_r1, 49, 11, -4, -28.6F, -5.2F, 5, 1, 1, 0, false));

		gun115_r1 = new ModelRenderer(this);
		gun115_r1.setRotationPoint(0, 1.4142F, 3.4142F);
		holo.addChild(gun115_r1);
		setRotationAngle(gun115_r1, 2.3562F, 0, 0);
		gun115_r1.cubeList.add(new ModelBox(gun115_r1, 41, 19, -4.5F, -24.9F, -3, 6, 2, 1, 0, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(0, 6.4861F, 11.3133F);
		holo.addChild(gun112_r1);
		setRotationAngle(gun112_r1, 2.3562F, 0, 0);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 19, 14, -5, -24, 2, 1, 1, 2, -0.002F, false));
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 15, 26, 1.7F, -24, 2, 1, 1, 2, -0.001F, false));

		gun108_r1 = new ModelRenderer(this);
		gun108_r1.setRotationPoint(-15.7463F, 4.1648F, -9.0714F);
		holo.addChild(gun108_r1);
		setRotationAngle(gun108_r1, 0, 0, 2.3562F);
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 46, 24, -0.2F, -24.2F, 6.9F, 1, 1, 1, -0.002F, false));

		gun107_r1 = new ModelRenderer(this);
		gun107_r1.setRotationPoint(0, -7.3257F, -18.991F);
		holo.addChild(gun107_r1);
		setRotationAngle(gun107_r1, -2.2679F, 0, 0);
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 16, 47, 1, -28.3F, 7.5F, 1, 1, 1, 0, false));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 41, 12, -5, -29, 7.5F, 1, 2, 1, -0.002F, false));
		gun107_r1.cubeList.add(new ModelBox(gun107_r1, 52, 53, 1.3F, -29, 7.5F, 1, 1, 1, 0, false));

		gun106_r1 = new ModelRenderer(this);
		gun106_r1.setRotationPoint(-15.8969F, -5.3728F, -9.0714F);
		holo.addChild(gun106_r1);
		setRotationAngle(gun106_r1, 0, 0, 2.3562F);
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 13, 30, 2.7F, -29, -0.5F, 1, 1, 7, 0, false));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(0, 33.1923F, 11.5593F);
		holo.addChild(gun105_r1);
		setRotationAngle(gun105_r1, 0.9295F, 0, 0);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 49, 1.7F, -27, -1, 1, 1, 1, -0.001F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 43, 48, -5, -27, -2.5F, 1, 2, 4, -0.002F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 10, 51, 1.7F, -27, -2.5F, 1, 2, 2, -0.002F, false));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(-7.3836F, 44.7266F, -9.0714F);
		holo.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0, 0, 0.2974F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 54, 18, -0.3F, -25.3F, 7.1F, 1, 1, 1, 0, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(7.252F, 43.8473F, -9.0714F);
		holo.addChild(gun88_r1);
		setRotationAngle(gun88_r1, 0, 0, -0.2974F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 0, 23, -3.7F, -25.3F, 7.1F, 1, 1, 1, 0, false));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(0, 17.022F, -31.3608F);
		holo.addChild(gun86_r1);
		setRotationAngle(gun86_r1, -1.3384F, 0, 0);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 49, 13, -0.5F, -28.6F, 7.2F, 2, 1, 3, -0.001F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 41, 50, -0.2F, -28.6F, 7, 1, 1, 1, -0.002F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 50, 44, -3.8F, -28.6F, 7, 1, 1, 1, -0.002F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 49, 50, -0.4F, -28.7F, 7.4F, 1, 1, 1, 0, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 51, -3.6F, -28.7F, 7.4F, 1, 1, 1, 0, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 45, 28, -3.8F, -28.6F, 7.2F, 4, 1, 3, 0, false));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(23.6345F, -9.5678F, -9.0714F);
		holo.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 0, 0, -2.3562F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 43, 42, -0.7F, -32.7F, 0.8F, 1, 1, 5, 0, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(-28.7559F, -7.4464F, -9.0714F);
		holo.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 0, 0, 2.3562F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 44, 3, -3.3F, -32.7F, 0.8F, 1, 1, 5, 0, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-17.9454F, -4.5243F, -9.0714F);
		holo.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0, 0, 2.3562F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 9, 45, 1.5F, -29, 0.8F, 1, 1, 5, 0, false));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(-25.7981F, -1.2716F, -9.0714F);
		holo.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0, 0, 2.3562F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 45, 22, -3.1F, -29, 0.8F, 1, 1, 5, 0, false));

		gun71_r1 = new ModelRenderer(this);
		gun71_r1.setRotationPoint(-17.4534F, 4.8719F, -9.0714F);
		holo.addChild(gun71_r1);
		setRotationAngle(gun71_r1, 0, 0, 2.3562F);
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 51, 36, -1.2F, -24.2F, 6.9F, 1, 1, 1, -0.002F, false));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(12.3321F, 2.7506F, -9.0714F);
		holo.addChild(gun70_r1);
		setRotationAngle(gun70_r1, 0, 0, -2.3562F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 52, 22, -2.8F, -24.2F, 6.9F, 1, 1, 1, -0.002F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(0, -6.8179F, 3.2322F);
		holo.addChild(gun65_r1);
		setRotationAngle(gun65_r1, -3.002F, 0, 0);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 0, 26, 1.7F, -26, 8, 1, 3, 1, -0.002F, false));
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 22, 30, -5, -26, 8, 1, 3, 1, -0.002F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(0, 13.7876F, -31.8796F);
		holo.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -1.45F, 0, 0);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 28, 7, -4, -29, 6.8F, 6, 1, 4, 0, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(0, -7.4367F, -19.2422F);
		holo.addChild(gun59_r1);
		setRotationAngle(gun59_r1, -2.3051F, 0, 0);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 39, 3, 0.7F, -29, 6.8F, 1, 2, 1, 0, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 29, 40, -4.7F, -29, 6.8F, 1, 2, 1, 0, false));

		gun55_r1 = new ModelRenderer(this);
		gun55_r1.setRotationPoint(-23.7487F, 35.377F, -9.0714F);
		holo.addChild(gun55_r1);
		setRotationAngle(gun55_r1, 0, 0, 0.7854F);
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 53, 45, 1, -34, 5.5F, 1, 1, 1, -0.001F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 37, 34, 1.4F, -34, 0, 1, 1, 6, 0, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 8, 38, 1, -34, 0, 1, 1, 6, -0.002F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(-25.2132F, 38.9125F, -9.0714F);
		holo.addChild(gun54_r1);
		setRotationAngle(gun54_r1, 0, 0, 0.7854F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 53, 50, -4, -34, 5.5F, 1, 1, 1, -0.002F, false));
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 37, 27, -4, -33.5F, 0, 1, 1, 6, 0, false));
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 0, 42, -4, -34, 0, 1, 1, 6, -0.002F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0, 19.8459F, -34.2792F);
		holo.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -1.2269F, 0, 0);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 50, 40, -5, -31, 6, 1, 1, 3, -0.002F, false));
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 37, 30, 1, -31, 6, 1, 1, 2, -0.002F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(0, 45.4739F, -15.1706F);
		holo.addChild(gun26_r1);
		setRotationAngle(gun26_r1, -0.1859F, 0, 0);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 0, 42, 1, -33, 0, 1, 5, 1, 0.0015F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 37, 50, -5, -33, 0, 1, 5, 1, 0, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		holo.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
