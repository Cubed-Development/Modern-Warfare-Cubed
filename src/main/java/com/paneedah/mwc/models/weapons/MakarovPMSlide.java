package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MakarovPMSlide extends ModelBase {
	private final ModelRenderer gun;
	private final ModelRenderer gun149;
	private final ModelRenderer gun148;
	private final ModelRenderer gun147;
	private final ModelRenderer gun146;
	private final ModelRenderer gun145;
	private final ModelRenderer gun144;
	private final ModelRenderer gun143;
	private final ModelRenderer gun142;
	private final ModelRenderer gun141;
	private final ModelRenderer gun140;
	private final ModelRenderer gun137;
	private final ModelRenderer gun136;
	private final ModelRenderer gun135;
	private final ModelRenderer gun134;
	private final ModelRenderer gun183;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun180;
	private final ModelRenderer gun162;
	private final ModelRenderer gun179;
	private final ModelRenderer gun160;
	private final ModelRenderer gun161;
	private final ModelRenderer gun159;
	private final ModelRenderer gun158;
	private final ModelRenderer gun133;
	private final ModelRenderer gun132;
	private final ModelRenderer gun130;
	private final ModelRenderer gun131;
	private final ModelRenderer gun129;
	private final ModelRenderer gun128;
	private final ModelRenderer gun127;
	private final ModelRenderer gun126;
	private final ModelRenderer gun93;
	private final ModelRenderer gun92;
	private final ModelRenderer gun91;
	private final ModelRenderer gun89;
	private final ModelRenderer gun87;
	private final ModelRenderer gun86;
	private final ModelRenderer gun84;
	private final ModelRenderer gun85;
	private final ModelRenderer gun40;
	private final ModelRenderer gun83;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun13;
	private final ModelRenderer gun6;
	private final ModelRenderer gun2;
	private final ModelRenderer pm_slide;
	private final ModelRenderer gun211_r1;
	private final ModelRenderer gun210_r1;
	private final ModelRenderer gun209_r1;
	private final ModelRenderer gun208_r1;
	private final ModelRenderer gun209_r2;
	private final ModelRenderer gun208_r2;
	private final ModelRenderer gun207_r1;
	private final ModelRenderer gun206_r1;
	private final ModelRenderer gun205_r1;
	private final ModelRenderer gun204_r1;
	private final ModelRenderer gun203_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun153_r1;
	private final ModelRenderer gun151_r1;
	private final ModelRenderer gun153_r2;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun186_r1;
	private final ModelRenderer gun192_r1;
	private final ModelRenderer gun200_r1;
	private final ModelRenderer gun212_r1;
	private final ModelRenderer gun212_r2;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun220_r1;
	private final ModelRenderer gun219_r2;

	public MakarovPMSlide() {
		textureWidth = 512;
		textureHeight = 256;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.5F, -35.0F, -22.5F, 1, 2, 9, 0.0F, true));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.5F, -18.0F, 2.0F);
		gun.addChild(gun149);
		setRotationAngle(gun149, 2.167F, 0.0F, 0.0F);
		gun149.cubeList.add(new ModelBox(gun149, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, true));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.5F, -20.0F, -4.0F);
		gun.addChild(gun148);
		gun148.cubeList.add(new ModelBox(gun148, 0, 0, 0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, true));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-3.5F, -25.5F, -7.0F);
		gun.addChild(gun147);
		setRotationAngle(gun147, 0.8551F, 0.0F, 0.0F);
		gun147.cubeList.add(new ModelBox(gun147, 0, 0, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, true));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-3.5F, -30.5F, -7.0F);
		gun.addChild(gun146);
		gun146.cubeList.add(new ModelBox(gun146, 0, 0, 0.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F, true));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-4.0F, -31.1F, -3.4F);
		gun.addChild(gun145);
		setRotationAngle(gun145, -0.1115F, 0.0F, 0.0F);
		gun145.cubeList.add(new ModelBox(gun145, 0, 50, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, true));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-4.0F, -30.0F, -6.2F);
		gun.addChild(gun144);
		setRotationAngle(gun144, 0.2231F, 0.0F, 0.0F);
		gun144.cubeList.add(new ModelBox(gun144, 0, 50, 0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, true));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-4.0F, -30.0F, -6.2F);
		gun.addChild(gun143);
		setRotationAngle(gun143, 0.3718F, 0.0F, 0.0F);
		gun143.cubeList.add(new ModelBox(gun143, 0, 50, 0.0F, 0.0F, 0.0F, 5, 2, 3, 0.0F, true));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-0.2F, -32.2F, -8.0F);
		gun.addChild(gun142);
		gun142.cubeList.add(new ModelBox(gun142, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-3.5F, -30.5F, -10.2F);
		gun.addChild(gun141);
		setRotationAngle(gun141, 1.0782F, 0.0F, 0.0F);
		gun141.cubeList.add(new ModelBox(gun141, 0, 0, 0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, true));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(-3.5F, -33.2F, -22.5F);
		gun.addChild(gun140);
		gun140.cubeList.add(new ModelBox(gun140, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, true));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-0.2F, -31.8F, -8.0F);
		gun.addChild(gun137);
		gun137.cubeList.add(new ModelBox(gun137, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-0.35F, -34.0F, -8.0F);
		gun.addChild(gun136);
		gun136.cubeList.add(new ModelBox(gun136, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, true));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-4.0F, -30.5F, -3.2F);
		gun.addChild(gun135);
		gun135.cubeList.add(new ModelBox(gun135, 0, 50, 0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F, true));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-3.5F, -33.0F, -15.5F);
		gun.addChild(gun134);
		gun134.cubeList.add(new ModelBox(gun134, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, true));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-2.0F, -36.5F, -0.5F);
		gun.addChild(gun183);
		setRotationAngle(gun183, -0.8923F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, true));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-2.0F, -36.5F, 1.5F);
		gun.addChild(gun182);
		setRotationAngle(gun182, -0.8923F, 0.0F, 0.0F);
		gun182.cubeList.add(new ModelBox(gun182, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, true));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-2.3F, -36.8F, -9.7F);
		gun.addChild(gun181);
		gun181.cubeList.add(new ModelBox(gun181, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun180 = new ModelRenderer(this);
		gun180.setRotationPoint(-2.9F, -36.0F, -9.7F);
		gun.addChild(gun180);
		setRotationAngle(gun180, 0.0F, 0.0F, 0.3346F);
		gun180.cubeList.add(new ModelBox(gun180, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-1.3F, -35.35F, -23.0F);
		gun.addChild(gun162);
		gun162.cubeList.add(new ModelBox(gun162, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, true));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-2.3F, -36.8F, -9.7F);
		gun.addChild(gun179);
		setRotationAngle(gun179, 0.0F, 0.0F, 0.6692F);
		gun179.cubeList.add(new ModelBox(gun179, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.0F, -34.6F, -23.0F);
		gun.addChild(gun160);
		gun160.cubeList.add(new ModelBox(gun160, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 20, 0.0F, true));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.7F, -35.35F, -23.0F);
		gun.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, true));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-2.0F, -36.1F, -23.0F);
		gun.addChild(gun159);
		gun159.cubeList.add(new ModelBox(gun159, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, true));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-2.5F, -35.85F, -23.0F);
		gun.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 17, 0.0F, true));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-3.0F, -31.3F, -22.3F);
		gun.addChild(gun133);
		setRotationAngle(gun133, 0.0F, 0.0F, -2.0448F);
		gun133.cubeList.add(new ModelBox(gun133, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, true));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(0.0F, -31.3F, -22.3F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -2.6545F);
		gun132.cubeList.add(new ModelBox(gun132, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, true));

		gun130 = new ModelRenderer(this);
		gun130.setRotationPoint(-3.5F, -33.0F, -16.5F);
		gun.addChild(gun130);
		gun130.cubeList.add(new ModelBox(gun130, 0, 0, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, true));

		gun131 = new ModelRenderer(this);
		gun131.setRotationPoint(-3.0F, -33.3F, -22.3F);
		gun.addChild(gun131);
		gun131.cubeList.add(new ModelBox(gun131, 0, 0, 0.0F, 0.0F, 0.0F, 3, 2, 6, 0.0F, true));

		gun129 = new ModelRenderer(this);
		gun129.setRotationPoint(-2.5F, -26.2F, -7.9F);
		gun.addChild(gun129);
		setRotationAngle(gun129, -0.1859F, 0.0F, 0.0F);
		gun129.cubeList.add(new ModelBox(gun129, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, true));

		gun128 = new ModelRenderer(this);
		gun128.setRotationPoint(-2.5F, -29.1F, -13.5F);
		gun.addChild(gun128);
		setRotationAngle(gun128, 0.2603F, 0.0F, 0.0F);
		gun128.cubeList.add(new ModelBox(gun128, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, true));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-4.0F, -23.7F, 2.4F);
		gun.addChild(gun127);
		setRotationAngle(gun127, -2.9743F, 0.0F, 0.0F);
		gun127.cubeList.add(new ModelBox(gun127, 0, 50, 0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, true));

		gun126 = new ModelRenderer(this);
		gun126.setRotationPoint(-3.5F, -31.0F, -16.5F);
		gun.addChild(gun126);
		setRotationAngle(gun126, 1.45F, 0.0F, 0.0F);
		gun126.cubeList.add(new ModelBox(gun126, 0, 0, 0.0F, 0.0F, 0.0F, 4, 17, 2, 0.0F, true));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-4.0F, -19.6F, 2.2F);
		gun.addChild(gun93);
		gun93.cubeList.add(new ModelBox(gun93, 0, 50, 0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, true));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(-3.5F, -30.5F, -4.0F);
		gun.addChild(gun92);
		setRotationAngle(gun92, -1.3384F, 0.0F, 0.0F);
		gun92.cubeList.add(new ModelBox(gun92, 0, 0, 0.0F, 0.0F, 0.0F, 4, 3, 12, 0.0F, true));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-4.0F, -19.6F, 3.2F);
		gun.addChild(gun91);
		setRotationAngle(gun91, -2.9743F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 0, 50, 0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F, true));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-4.0F, -20.5F, -3.3F);
		gun.addChild(gun89);
		gun89.cubeList.add(new ModelBox(gun89, 0, 50, 0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F, true));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-4.0F, -30.5F, 0.8F);
		gun.addChild(gun87);
		setRotationAngle(gun87, -1.3384F, 0.0F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 0, 50, 0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F, true));

		gun86 = new ModelRenderer(this);
		gun86.setRotationPoint(-3.5F, -30.5F, 1.4F);
		gun.addChild(gun86);
		setRotationAngle(gun86, -1.9333F, 0.0F, 0.0F);
		gun86.cubeList.add(new ModelBox(gun86, 0, 0, 0.0F, 0.0F, 0.0F, 4, 2, 3, 0.0F, true));

		gun84 = new ModelRenderer(this);
		gun84.setRotationPoint(-3.5F, -32.5F, 0.5F);
		gun.addChild(gun84);
		gun84.cubeList.add(new ModelBox(gun84, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun85 = new ModelRenderer(this);
		gun85.setRotationPoint(-3.5F, -31.5F, 3.5F);
		gun.addChild(gun85);
		setRotationAngle(gun85, -2.9371F, 0.0F, 0.0F);
		gun85.cubeList.add(new ModelBox(gun85, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, true));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(-2.5F, -31.1F, -13.1F);
		gun.addChild(gun40);
		setRotationAngle(gun40, -0.2231F, 0.0F, 0.0F);
		gun40.cubeList.add(new ModelBox(gun40, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, true));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(-3.5F, -29.5F, 0.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 2.4166F, 0.0F, 0.0F);
		gun83.cubeList.add(new ModelBox(gun83, 0, 0, 0.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, true));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-2.5F, -27.0F, -12.5F);
		gun.addChild(gun15);
		setRotationAngle(gun15, -0.1859F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, true));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-2.5F, -26.0F, -7.5F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.4461F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, true));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-4.0F, -29.0F, -6.0F);
		gun.addChild(gun13);
		setRotationAngle(gun13, 0.2231F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 0, 50, 0.0F, 0.0F, 0.0F, 5, 11, 6, 0.0F, true));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -35.0F, -13.5F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 0, 0, 0.0F, 0.0F, 0.0F, 4, 4, 14, 0.0F, true));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-2.0F, -31.0F, -8.0F);
		gun.addChild(gun2);
		setRotationAngle(gun2, -0.5205F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, true));

		pm_slide = new ModelRenderer(this);
		pm_slide.setRotationPoint(0.0F, 24.0F, 0.0F);
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.801F, -35.0F, -1.5F, 1, 2, 3, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -0.199F, -35.0F, 0.5F, 1, 2, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.7F, -35.0F, -8.5F, 1, 3, 9, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -0.3F, -35.0F, -8.5F, 1, 3, 9, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -0.2F, -33.0F, -3.5F, 1, 1, 6, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.8F, -33.0F, -1.5F, 1, 1, 4, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.0F, -33.0F, 2.001F, 1, 1, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -1.0F, -33.0F, 2.001F, 1, 1, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -0.2F, -33.0F, 2.0F, 1, 1, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.8F, -33.0F, 2.0F, 1, 1, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, 0.2F, -34.5F, -3.1F, 1, 1, 3, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.5F, -35.2F, -22.7F, 4, 2, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.0F, -33.3F, -22.7F, 3, 1, 1, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -2.5F, -37.0F, -6.7F, 1, 1, 7, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -2.5F, -37.0F, -22.7F, 1, 1, 13, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -1.5F, -37.0F, -22.7F, 1, 1, 23, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -2.0F, -37.1F, -6.701F, 1, 1, 7, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -2.0F, -37.1F, -22.7F, 1, 1, 13, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -1.801F, -37.301F, -10.2F, 1, 1, 4, -0.2F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -0.2F, -35.0F, -22.5F, 1, 2, 14, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.8F, -35.0F, -22.5F, 1, 2, 14, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -0.2F, -33.0F, -15.5F, 1, 1, 7, 0.0F, true));
		pm_slide.cubeList.add(new ModelBox(pm_slide, 0, 0, -3.8F, -33.0F, -15.5F, 1, 1, 7, 0.0F, true));

		gun211_r1 = new ModelRenderer(this);
		gun211_r1.setRotationPoint(-4.1F, -35.35F, -2.3F);
		pm_slide.addChild(gun211_r1);
		setRotationAngle(gun211_r1, -1.45F, 0.0F, 0.0F);
		gun211_r1.cubeList.add(new ModelBox(gun211_r1, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun211_r1.cubeList.add(new ModelBox(gun211_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun210_r1 = new ModelRenderer(this);
		gun210_r1.setRotationPoint(-4.1F, -35.35F, -3.05F);
		pm_slide.addChild(gun210_r1);
		setRotationAngle(gun210_r1, -1.45F, 0.0F, 0.0F);
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun209_r1 = new ModelRenderer(this);
		gun209_r1.setRotationPoint(-4.1F, -35.35F, -4.55F);
		pm_slide.addChild(gun209_r1);
		setRotationAngle(gun209_r1, -1.45F, 0.0F, 0.0F);
		gun209_r1.cubeList.add(new ModelBox(gun209_r1, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun209_r1.cubeList.add(new ModelBox(gun209_r1, 0, 0, 4.201F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun209_r1.cubeList.add(new ModelBox(gun209_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));
		gun209_r1.cubeList.add(new ModelBox(gun209_r1, 0, 0, 4.199F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun208_r1 = new ModelRenderer(this);
		gun208_r1.setRotationPoint(-4.1F, -35.35F, -6.05F);
		pm_slide.addChild(gun208_r1);
		setRotationAngle(gun208_r1, -1.45F, 0.0F, 0.0F);
		gun208_r1.cubeList.add(new ModelBox(gun208_r1, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun208_r1.cubeList.add(new ModelBox(gun208_r1, 0, 0, 4.201F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun208_r1.cubeList.add(new ModelBox(gun208_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));
		gun208_r1.cubeList.add(new ModelBox(gun208_r1, 0, 0, 4.199F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun209_r2 = new ModelRenderer(this);
		gun209_r2.setRotationPoint(-4.1F, -35.35F, -3.8F);
		pm_slide.addChild(gun209_r2);
		setRotationAngle(gun209_r2, -1.45F, 0.0F, 0.0F);
		gun209_r2.cubeList.add(new ModelBox(gun209_r2, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun209_r2.cubeList.add(new ModelBox(gun209_r2, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun208_r2 = new ModelRenderer(this);
		gun208_r2.setRotationPoint(-4.1F, -35.35F, -5.3F);
		pm_slide.addChild(gun208_r2);
		setRotationAngle(gun208_r2, -1.45F, 0.0F, 0.0F);
		gun208_r2.cubeList.add(new ModelBox(gun208_r2, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun208_r2.cubeList.add(new ModelBox(gun208_r2, 0, 0, 4.201F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun208_r2.cubeList.add(new ModelBox(gun208_r2, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));
		gun208_r2.cubeList.add(new ModelBox(gun208_r2, 0, 0, 4.199F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun207_r1 = new ModelRenderer(this);
		gun207_r1.setRotationPoint(-4.1F, -35.35F, -6.8F);
		pm_slide.addChild(gun207_r1);
		setRotationAngle(gun207_r1, -1.45F, 0.0F, 0.0F);
		gun207_r1.cubeList.add(new ModelBox(gun207_r1, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun207_r1.cubeList.add(new ModelBox(gun207_r1, 0, 0, 4.201F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun207_r1.cubeList.add(new ModelBox(gun207_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));
		gun207_r1.cubeList.add(new ModelBox(gun207_r1, 0, 0, 4.199F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun206_r1 = new ModelRenderer(this);
		gun206_r1.setRotationPoint(-4.1F, -35.35F, -7.55F);
		pm_slide.addChild(gun206_r1);
		setRotationAngle(gun206_r1, -1.45F, 0.0F, 0.0F);
		gun206_r1.cubeList.add(new ModelBox(gun206_r1, 0, 0, 0.0F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun206_r1.cubeList.add(new ModelBox(gun206_r1, 0, 0, 4.201F, 0.0F, 1.6F, 1, 1, 2, -0.3F, true));
		gun206_r1.cubeList.add(new ModelBox(gun206_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));
		gun206_r1.cubeList.add(new ModelBox(gun206_r1, 0, 0, 4.199F, 0.0F, 0.0F, 1, 1, 3, -0.3F, true));

		gun205_r1 = new ModelRenderer(this);
		gun205_r1.setRotationPoint(-3.8F, -35.0F, -1.2F);
		pm_slide.addChild(gun205_r1);
		setRotationAngle(gun205_r1, -1.45F, 0.0F, 0.0F);
		gun205_r1.cubeList.add(new ModelBox(gun205_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun204_r1 = new ModelRenderer(this);
		gun204_r1.setRotationPoint(-0.2F, -35.0F, -3.5F);
		pm_slide.addChild(gun204_r1);
		setRotationAngle(gun204_r1, -1.45F, 0.0F, 0.0F);
		gun204_r1.cubeList.add(new ModelBox(gun204_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun203_r1 = new ModelRenderer(this);
		gun203_r1.setRotationPoint(-0.2F, -35.0F, -8.5F);
		pm_slide.addChild(gun203_r1);
		setRotationAngle(gun203_r1, -1.45F, 0.0F, 0.0F);
		gun203_r1.cubeList.add(new ModelBox(gun203_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));
		gun203_r1.cubeList.add(new ModelBox(gun203_r1, 0, 0, -3.601F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-2.5F, -37.0F, -6.7F);
		pm_slide.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0F, 0.0F, 0.6545F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, true));
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 0, 0, 0.0F, 0.0F, -16.0F, 1, 1, 13, 0.0F, true));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-0.5F, -37.0F, -22.7F);
		pm_slide.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, 0.0F, -0.6545F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 23, 0.0F, true));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(-3.1F, -36.2F, -6.7F);
		pm_slide.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.0F, 0.0F, -1.1897F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 0, 0, -1.3F, -0.001F, -0.001F, 1, 1, 7, 0.0F, true));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 0, 0, -1.3F, -0.001F, -16.001F, 1, 1, 13, 0.0F, true));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 0, 0, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, true));
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 0, 0, -1.0F, 0.0F, -16.0F, 1, 1, 13, 0.0F, true));

		gun151_r1 = new ModelRenderer(this);
		gun151_r1.setRotationPoint(0.1F, -36.2F, -22.7F);
		pm_slide.addChild(gun151_r1);
		setRotationAngle(gun151_r1, 0.0F, 0.0F, 1.1897F);
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 0, 0, 0.3F, -0.001F, -0.001F, 1, 1, 23, 0.0F, true));
		gun151_r1.cubeList.add(new ModelBox(gun151_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 23, 0.0F, true));

		gun153_r2 = new ModelRenderer(this);
		gun153_r2.setRotationPoint(0.78F, -35.0F, -22.5F);
		pm_slide.addChild(gun153_r2);
		setRotationAngle(gun153_r2, 0.0F, 0.0F, 0.4264F);
		gun153_r2.cubeList.add(new ModelBox(gun153_r2, 0, 0, -0.98F, 0.0F, 0.0F, 1, 1, 19, 0.0F, true));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-3.8F, -35.0F, -22.5F);
		pm_slide.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.0F, 0.0F, -0.4264F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 23, 0.0F, true));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-3.8F, -32.0F, -15.5F);
		pm_slide.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 2.9743F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 0, 0, 0.001F, 0.0F, 0.0F, 1, 1, 6, 0.0F, true));
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 0, 0, 3.601F, 0.0F, 0.0F, 1, 1, 6, 0.0F, true));

		gun186_r1 = new ModelRenderer(this);
		gun186_r1.setRotationPoint(0.2F, -35.4F, -2.8F);
		pm_slide.addChild(gun186_r1);
		setRotationAngle(gun186_r1, -0.3346F, 0.0F, 0.0F);
		gun186_r1.cubeList.add(new ModelBox(gun186_r1, 0, 0, 0.001F, 0.0F, 0.0F, 1, 1, 3, 0.0F, true));

		gun192_r1 = new ModelRenderer(this);
		gun192_r1.setRotationPoint(-0.95F, -35.2F, 1.4F);
		pm_slide.addChild(gun192_r1);
		setRotationAngle(gun192_r1, -1.0478F, 0.0F, 0.0F);
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 0, 0, -0.05F, -0.001F, 0.2F, 1, 1, 2, 0.0F, true));
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 0, 0, -2.85F, -0.001F, 0.2F, 1, 1, 2, 0.0F, true));
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 0, 0, 0.75F, 0.0F, 0.2F, 1, 1, 2, 0.0F, true));
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 0, 0, -2.05F, 0.0F, 0.2F, 1, 1, 2, 0.0F, true));

		gun200_r1 = new ModelRenderer(this);
		gun200_r1.setRotationPoint(-0.95F, -33.0F, 3.0F);
		pm_slide.addChild(gun200_r1);
		setRotationAngle(gun200_r1, -2.3051F, 0.0F, 0.0F);
		gun200_r1.cubeList.add(new ModelBox(gun200_r1, 0, 0, -0.05F, 0.0F, 0.001F, 1, 1, 1, 0.0F, true));
		gun200_r1.cubeList.add(new ModelBox(gun200_r1, 0, 0, -2.85F, 0.0F, 0.001F, 1, 1, 1, 0.0F, true));
		gun200_r1.cubeList.add(new ModelBox(gun200_r1, 0, 0, 0.75F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));
		gun200_r1.cubeList.add(new ModelBox(gun200_r1, 0, 0, -2.05F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

		gun212_r1 = new ModelRenderer(this);
		gun212_r1.setRotationPoint(-0.2F, -34.8F, 0.5F);
		pm_slide.addChild(gun212_r1);
		setRotationAngle(gun212_r1, -0.4833F, 0.0F, 0.0F);
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 0, 0, -0.001F, 0.0F, 0.0F, 1, 2, 1, 0.0F, true));

		gun212_r2 = new ModelRenderer(this);
		gun212_r2.setRotationPoint(-0.2F, -33.0F, -1.8F);
		pm_slide.addChild(gun212_r2);
		setRotationAngle(gun212_r2, 0.2602F, 0.0F, 0.0F);
		gun212_r2.cubeList.add(new ModelBox(gun212_r2, 0, 0, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(-1.949F, -35.0F, 1.0F);
		pm_slide.addChild(gun219_r1);
		setRotationAngle(gun219_r1, -1.2217F, 0.0F, 0.0F);
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 0, 0, -1.051F, -0.001F, -1.5F, 1, 1, 1, 0.0F, true));
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 0, 0, 0.949F, -0.001F, -1.5F, 1, 1, 1, 0.0F, true));

		gun220_r1 = new ModelRenderer(this);
		gun220_r1.setRotationPoint(-1.799F, -35.6F, 1.0F);
		pm_slide.addChild(gun220_r1);
		setRotationAngle(gun220_r1, -1.2217F, 0.0F, 0.0F);
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 0, 0, -1.001F, -0.001F, -1.7F, 1, 1, 1, -0.2F, true));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 0, 0, 0.599F, -0.001F, -1.7F, 1, 1, 1, -0.2F, true));

		gun219_r2 = new ModelRenderer(this);
		gun219_r2.setRotationPoint(-1.949F, -35.0F, 1.5F);
		pm_slide.addChild(gun219_r2);
		setRotationAngle(gun219_r2, -0.8203F, 0.0F, 0.0F);
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, -1.051F, -0.003F, -1.3F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, -1.051F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, -1.301F, -0.003F, -1.3F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, -1.301F, -0.002F, -1.0F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, 1.199F, -0.003F, -1.3F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, 1.199F, -0.002F, -1.0F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, 0.949F, -0.003F, -1.3F, 1, 1, 1, 0.0F, true));
		gun219_r2.cubeList.add(new ModelBox(gun219_r2, 0, 0, 0.949F, 0.0F, -1.0F, 1, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.renderer(f5);
		pm_slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
