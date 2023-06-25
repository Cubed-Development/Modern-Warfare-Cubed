package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Holographic extends ModelBase {
	private final ModelRenderer Holografics;
	private final ModelRenderer gun103_r1;
	private final ModelRenderer gun89_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun83_r1;
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
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun43_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun3_r1;

	public Holographic() {
		textureWidth = 100;
		textureHeight = 100;

		Holografics = new ModelRenderer(this);
		Holografics.setRotationPoint(-1.3299F, -3.8086F, 2.6645F);
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 0, -3.1701F, -0.0914F, -14.6645F, 6, 3, 18, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 21, -3.1701F, 2.8086F, -12.3645F, 6, 1, 17, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 53, -3.6701F, -1.1914F, -3.1645F, 1, 5, 8, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 0, 2.3299F, -1.1914F, -3.1645F, 1, 5, 8, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 59, 7, -3.6701F, -5.1914F, -2.6645F, 1, 4, 6, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 48, 42, 2.3299F, 1.8086F, -6.1645F, 1, 2, 4, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 15, 45, -3.6701F, 1.8086F, -6.1645F, 1, 2, 4, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 10, 54, -2.6701F, -6.1914F, -2.6645F, 5, 1, 6, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 45, 0, -3.6701F, 0.8086F, -4.1645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 45, 2.3299F, 0.8086F, -4.1645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 21, 2.3299F, -5.1914F, -2.6645F, 1, 4, 6, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 30, 9, -2.6701F, -6.1914F, 2.8355F, 5, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 45, 0, -3.1701F, -1.1914F, -1.8645F, 6, 1, 6, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 30, 49, -2.1701F, -0.9914F, -14.6645F, 1, 1, 13, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 44, 22, -1.1701F, -1.2914F, -5.6645F, 2, 1, 4, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 29, 30, 3.0299F, 1.3086F, -3.1645F, 1, 2, 2, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 21, -4.3701F, 1.3086F, -3.1645F, 1, 2, 2, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 39, 0.8299F, -0.9914F, -14.6645F, 1, 1, 13, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 33, 35, 0.3299F, -0.9914F, -14.6645F, 1, 1, 13, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 30, 0, -1.6701F, -0.9914F, -14.6645F, 1, 1, 13, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 29, 21, -0.6701F, -0.7914F, -14.4645F, 1, 1, 13, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 30, 0, -3.3701F, -5.1914F, -1.8645F, 1, 4, 5, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 29, 21, 2.0299F, -5.1914F, -1.8645F, 1, 4, 5, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 45, 7, -2.6701F, -5.8914F, -1.8645F, 5, 1, 5, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 29, 35, -3.1701F, 2.8086F, -12.8645F, 6, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 13, 21, -3.6701F, 1.8086F, 4.3355F, 1, 2, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 14, 15, 2.3299F, 1.8086F, 4.3355F, 1, 2, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 30, 11, -2.4701F, 2.1086F, 4.0355F, 4, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 44, 24, 1.1299F, 2.6086F, 4.0355F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 44, 22, -2.4701F, 2.6086F, 4.0355F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 41, 1.1299F, 2.1086F, 4.0355F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 22, 39, -4.3701F, 1.1086F, -2.6645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 15, 39, -4.3701F, 2.5086F, -2.6645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 7, 39, -4.3701F, 1.8086F, -3.3645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 39, -4.3701F, 1.8086F, -1.9645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 38, 32, 3.0299F, 1.1086F, -2.6645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 37, 2, 3.0299F, 2.5086F, -2.6645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 37, 0, 3.0299F, 1.8086F, -3.3645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 36, 24, 3.0299F, 1.8086F, -1.9645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 12, 25, 2.4299F, 2.6086F, 2.0355F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 8, 25, 2.4299F, 2.6086F, -5.9645F, 1, 1, 1, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 4, 2.3499F, 0.6086F, 1.8355F, 1, 1, 3, 0.0F, false));
		Holografics.cubeList.add(new ModelBox(Holografics, 0, 0, 2.3399F, 0.1086F, 1.8355F, 1, 1, 3, 0.0F, false));

		gun103_r1 = new ModelRenderer(this);
		gun103_r1.setRotationPoint(1.3299F, -7.5253F, -24.3283F);
		Holografics.addChild(gun103_r1);
		setRotationAngle(gun103_r1, -1.5615F, 0.0F, 0.0F);
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 11, 13, -1.3F, -29.0F, 8.3F, 2, 1, 1, 0.0F, false));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 0, 25, -3.7F, -29.0F, 8.3F, 2, 1, 1, 0.0F, false));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(-6.0536F, 26.4926F, -2.6645F);
		Holografics.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0.0F, 0.0F, 0.2974F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 30, 39, -0.3F, -25.3F, 6.9F, 1, 1, 1, 0.0F, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(8.582F, 25.6134F, -2.6645F);
		Holografics.addChild(gun88_r1);
		setRotationAngle(gun88_r1, 0.0F, 0.0F, -0.2974F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 38, 39, -3.7F, -25.3F, 6.9F, 1, 1, 1, 0.0F, false));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(1.3299F, -1.0173F, -25.1078F);
		Holografics.addChild(gun86_r1);
		setRotationAngle(gun86_r1, -1.3384F, 0.0F, 0.0F);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 10, 0, -0.2F, -28.6042F, 7.0F, 1, 1, 3, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 7, 41, -0.2F, -28.6F, 6.8F, 1, 1, 1, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 15, 41, -3.8F, -28.5842F, 6.8F, 1, 1, 1, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 41, 40, -3.2F, -28.75F, 8.6F, 1, 1, 1, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 42, 36, -0.8F, -28.7512F, 8.6F, 1, 1, 1, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 41, 42, -0.4F, -28.75F, 8.6F, 1, 1, 1, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 43, 16, -3.6F, -28.7512F, 8.6F, 1, 1, 1, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 0, 13, -3.8F, -28.6F, 7.0F, 4, 1, 3, 0.0F, false));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(1.3299F, -4.293F, -24.8997F);
		Holografics.addChild(gun83_r1);
		setRotationAngle(gun83_r1, -1.45F, 0.0F, 0.0F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 22, 41, -2.0F, -29.0084F, 7.3F, 1, 1, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 30, 41, -2.1F, -29.0F, 7.2F, 1, 1, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 38, 41, -1.9F, -29.0F, 7.2F, 1, 1, 1, 0.0F, false));
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 30, 43, -2.0F, -29.0084F, 7.1F, 1, 1, 1, 0.0F, false));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(24.9645F, -27.8017F, -2.6645F);
		Holografics.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 0.0F, 0.0F, -2.3562F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 0, 39, -0.7F, -32.7F, 0.8F, 1, 1, 5, 0.0F, false));

		gun74_r1 = new ModelRenderer(this);
		gun74_r1.setRotationPoint(-27.4259F, -25.6804F, -2.6645F);
		Holografics.addChild(gun74_r1);
		setRotationAngle(gun74_r1, 0.0F, 0.0F, 2.3562F);
		gun74_r1.cubeList.add(new ModelBox(gun74_r1, 15, 39, -3.3F, -32.7F, 0.8F, 1, 1, 5, 0.0F, false));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-16.6155F, -22.7582F, -2.6645F);
		Holografics.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, 2.3562F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 44, 16, 1.5F, -29.0F, 0.8F, 1, 1, 5, 0.0F, false));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(-24.4682F, -19.5055F, -2.6645F);
		Holografics.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0.0F, 0.0F, 2.3562F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 44, 28, -3.1F, -29.0F, 0.8F, 1, 1, 5, 0.0F, false));

		gun71_r1 = new ModelRenderer(this);
		gun71_r1.setRotationPoint(-16.1235F, -13.362F, -2.6645F);
		Holografics.addChild(gun71_r1);
		setRotationAngle(gun71_r1, 0.0F, 0.0F, 2.3562F);
		gun71_r1.cubeList.add(new ModelBox(gun71_r1, 38, 43, -1.2F, -24.2F, 6.68F, 1, 1, 1, 0.0F, false));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(13.662F, -15.4833F, -2.6645F);
		Holografics.addChild(gun70_r1);
		setRotationAngle(gun70_r1, 0.0F, 0.0F, -2.3562F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 44, 14, -2.8F, -24.2F, 6.68F, 1, 1, 1, 0.0F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(1.3299F, -25.0518F, 9.6392F);
		Holografics.addChild(gun65_r1);
		setRotationAngle(gun65_r1, -3.002F, 0.0F, 0.0F);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 29, 21, 1.0F, -26.0F, 8.0F, 1, 3, 1, 0.0F, false));
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 30, 0, -5.0F, -26.0F, 8.0F, 1, 3, 1, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(1.3299F, -4.4463F, -25.4727F);
		Holografics.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -1.45F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 45, 56, -4.5F, -29.0F, 6.8F, 6, 1, 4, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(1.3299F, -25.6707F, -12.8352F);
		Holografics.addChild(gun59_r1);
		setRotationAngle(gun59_r1, -2.3051F, 0.0F, 0.0F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 8, 31, 0.7F, -29.0F, 6.8F, 1, 2, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 8, 34, -4.7F, -29.0F, 6.8F, 1, 2, 1, 0.0F, false));

		gun55_r1 = new ModelRenderer(this);
		gun55_r1.setRotationPoint(-22.4188F, 17.1431F, -2.6645F);
		Holografics.addChild(gun55_r1);
		setRotationAngle(gun55_r1, 0.0F, 0.0F, 0.7854F);
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 44, 28, 1.0F, -34.0F, 5.5F, 1, 1, 1, 0.0F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 30, 39, 1.4F, -34.0F, 0.0F, 1, 1, 6, 0.0F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 26, 55, 1.0F, -34.0005F, 0.0F, 1, 1, 6, 0.0F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(-23.8833F, 20.6786F, -2.6645F);
		Holografics.addChild(gun54_r1);
		setRotationAngle(gun54_r1, 0.0F, 0.0F, 0.7854F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 44, 30, -4.0F, -34.0F, 5.5F, 1, 1, 1, 0.0F, false));
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 0, 31, -3.9868F, -33.5F, 0.0F, 1, 1, 6, 0.0F, false));
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 59, 17, -4.0F, -34.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(14.1657F, -22.4103F, -2.6645F);
		Holografics.addChild(gun45_r1);
		setRotationAngle(gun45_r1, 0.0F, 0.0F, -2.3213F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 15, 40, -5.5F, -27.55F, -12.0F, 1, 1, 13, 0.0F, false));
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 44, 14, -5.5F, -27.9F, -12.0F, 1, 1, 13, 0.0F, false));

		gun43_r1 = new ModelRenderer(this);
		gun43_r1.setRotationPoint(-16.5518F, -20.2162F, -2.6645F);
		Holografics.addChild(gun43_r1);
		setRotationAngle(gun43_r1, 0.0F, 0.0F, 2.3213F);
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 48, 28, 1.5F, -27.55F, -12.0F, 1, 1, 13, 0.0F, false));
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 48, 42, 1.5F, -27.9F, -12.0F, 1, 1, 13, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(1.3299F, -25.5596F, -12.584F);
		Holografics.addChild(gun33_r1);
		setRotationAngle(gun33_r1, -2.2679F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 35, 30, -5.0F, -29.0F, 7.5F, 1, 2, 1, 0.0F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 36, 21, 1.0F, -29.0F, 7.5F, 1, 2, 1, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(1.3299F, 1.612F, -27.8723F);
		Holografics.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -1.2269F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 10, 4, -5.0F, -31.0F, 6.0F, 1, 1, 3, 0.0F, false));
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 8, 21, 1.0F, -31.0F, 6.0F, 1, 1, 3, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(1.3299F, 27.24F, -8.7637F);
		Holografics.addChild(gun26_r1);
		setRotationAngle(gun26_r1, -0.1859F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 13, 30, 1.0F, -33.0F, 0.0F, 1, 5, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 0, 31, -5.0F, -33.0F, 0.0F, 1, 5, 1, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(1.3299F, 17.0316F, 15.2016F);
		Holografics.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.8179F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 0, 45, -5.0F, -26.0F, -3.5F, 1, 2, 4, 0.0F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 48, 35, 1.0F, -26.0F, -3.5F, 1, 2, 4, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(1.3299F, 3.0842F, 12.9757F);
		Holografics.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 1.1154F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 30, 14, -4.5F, -24.9F, -12.0F, 6, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Holografics.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}