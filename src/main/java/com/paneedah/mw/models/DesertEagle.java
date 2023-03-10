package com.paneedah.mw.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagle extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer slide90_r1;
	private final ModelRenderer gun1_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun36_r2;
	private final ModelRenderer gun36_r3;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun40_r3;
	private final ModelRenderer gun39_r2;
	private final ModelRenderer gun44_r1;
	private final ModelRenderer gun43_r1;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun46_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun90_r1;
	private final ModelRenderer gun89_r1;
	private final ModelRenderer gun92_r1;
	private final ModelRenderer gun91_r1;
	private final ModelRenderer gun94_r1;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun96_r1;
	private final ModelRenderer gun97_r1;
	private final ModelRenderer gun135_r1;
	private final ModelRenderer gun134_r1;
	private final ModelRenderer gun136_r1;
	private final ModelRenderer gun100_r1;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun113_r1;
	private final ModelRenderer gun113_r2;
	private final ModelRenderer gun123_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun121_r1;
	private final ModelRenderer gun122_r1;
	private final ModelRenderer gun122_r2;
	private final ModelRenderer gun124_r1;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun127_r1;
	private final ModelRenderer gun132_r1;
	private final ModelRenderer gun132_r2;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun162_r1;
	private final ModelRenderer gun161_r1;
	private final ModelRenderer bone;
	private final ModelRenderer gun116_r1;
	private final ModelRenderer gun115_r1;
	private final ModelRenderer gun114_r1;

	public DesertEagle() {
		textureWidth = 128;
		textureHeight = 128;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 64, 74, -0.6F, -32.9F, -0.4F, 1, 1, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 75, -3.4F, -32.9F, -0.4F, 1, 1, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 77, -2.0F, -33.0F, -23.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 69, -2.0F, -33.0F, -20.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 71, -2.0F, -33.0F, -17.6F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 74, -2.0F, -33.0F, -16.1F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 74, -2.0F, -33.0F, -19.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 76, -2.0F, -33.0F, -22.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 56, -2.0F, -33.0F, -25.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 20, -3.0F, -32.3F, -8.3F, 3, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 81, -2.0F, -38.8F, -27.3F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 22, -2.5F, -35.5F, -28.0F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 18, -3.0F, -32.8F, -0.4F, 3, 1, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 74, -1.8F, -38.5F, -12.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 0, -2.2F, -38.5F, -12.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 52, -2.0F, -38.5F, -28.0F, 1, 1, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 68, -2.0F, -38.5F, -22.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 18, -2.0F, -38.5F, -20.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 14, -2.0F, -38.5F, -18.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 21, 9, -2.0F, -38.5F, -16.0F, 1, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 50, -2.0F, -38.5F, -14.0F, 1, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 30, -2.6F, -37.9F, -28.0F, 2, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 44, -1.4F, -37.9F, -28.0F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 5, -2.35F, -33.6F, -27.2F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 0, -0.15F, -34.8F, -27.2F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 61, -0.65F, -34.8F, -23.2F, 1, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.35F, -34.8F, -23.2F, 1, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 63, -3.85F, -34.8F, -27.2F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 70, -2.0F, -33.3F, -25.1F, 1, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 50, -1.65F, -33.6F, -27.2F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 27, 32, -2.5F, -31.4F, -13.1F, 2, 3, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 26, -2.5F, -28.4F, -13.4F, 2, 1, 5, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 38, -3.0F, -28.8F, -7.1F, 3, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 26, -3.5F, -31.4F, -4.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 75, -3.0F, -32.5F, -12.1F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 38, -3.0F, -32.8F, -13.1F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.0F, -33.5F, -25.1F, 3, 1, 25, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 13, 0, -3.5F, -33.05F, -2.0F, 4, 7, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 0, -3.5F, -31.05F, -5.4F, 4, 5, 4, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 47, -3.5F, -27.0F, -4.7F, 4, 7, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 44, -3.0F, -20.0F, -6.0F, 3, 1, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 23, -3.0F, -20.0F, -5.7F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 26, -2.0F, -37.5F, 0.1F, 1, 4, 1, 0.0F, false));

		slide90_r1 = new ModelRenderer(this);
		slide90_r1.setRotationPoint(-1.8F, -37.7F, 1.4F);
		gun.addChild(slide90_r1);
		setRotationAngle(slide90_r1, 0.0F, 0.0F, 0.4363F);
		slide90_r1.cubeList.add(new ModelBox(slide90_r1, 75, 44, 0.05F, 0.0F, -1.0F, 1, 1, 1, -0.2F, false));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(-3.0F, -32.5F, -4.1F);
		gun.addChild(gun1_r1);
		setRotationAngle(gun1_r1, -1.4128F, 0.0F, 0.0F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 0, 26, 0.0F, -3.0F, -1.0F, 3, 6, 14, 0.001F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(-3.0F, -19.0F, 1.3F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 2.0076F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 57, 61, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-3.5F, -20.85F, 3.4F);
		gun.addChild(gun4_r1);
		setRotationAngle(gun4_r1, -3.0486F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 20, 26, 0.0F, 0.0F, 0.0F, 4, 3, 3, -0.001F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-3.5F, -23.8F, 3.1F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -2.7884F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 13, 13, 0.0F, 0.0F, 0.0F, 4, 7, 2, 0.002F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-3.5F, -33.05F, 0.0F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -1.3614F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 38, 38, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-3.0F, -20.0F, -6.0F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 1.1154F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 58, 0.0F, 0.0F, 0.0F, 3, 1, 2, -0.001F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-3.0F, -19.85F, 3.15F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 3.0672F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 20, 38, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-3.5F, -21.0F, -4.7F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 1.7474F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 56, 44, 0.0F, 0.0F, -1.0F, 4, 1, 11, 0.001F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-3.5F, -20.0F, 1.3F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 2.0076F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 56, 56, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(0.0F, -30.8F, -12.1F);
		gun.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.7854F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 0, 7, -3.0F, -1.0F, 0.0F, 3, 1, 2, -0.001F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(-3.0F, -30.8F, -13.1F);
		gun.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 2.1935F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 56, 51, 0.0F, 0.0F, 0.0F, 3, 1, 2, -0.001F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(-3.0F, -32.5F, -15.1F);
		gun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 1.0782F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 56, 35, 0.0F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-3.0F, -28.8F, -7.1F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 1.3756F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 49, 12, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-3.0F, -27.8F, -7.1F);
		gun.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.8551F, 0.0F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 56, 32, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-2.5F, -27.4F, -8.4F);
		gun.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 1.8218F, 0.0F, 0.0F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 72, 82, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-2.5F, -28.4F, -13.4F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 1.1525F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 65, 26, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(-3.85F, -32.8F, -27.2F);
		gun.addChild(gun36_r1);
		setRotationAngle(gun36_r1, 0.2618F, 0.0F, 0.0F);
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 13, 63, 0.0F, -2.0F, 0.0F, 2, 2, 1, -0.001F, false));
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 26, 63, 2.7F, -2.0F, 0.0F, 2, 2, 1, -0.001F, false));

		gun36_r2 = new ModelRenderer(this);
		gun36_r2.setRotationPoint(-3.85F, -34.6F, -27.65F);
		gun.addChild(gun36_r2);
		setRotationAngle(gun36_r2, 0.2826F, 0.0327F, 0.4252F);
		gun36_r2.cubeList.add(new ModelBox(gun36_r2, 31, 22, -0.08F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
		gun36_r2.cubeList.add(new ModelBox(gun36_r2, 69, 32, -0.08F, -1.3F, 0.0F, 1, 1, 1, -0.001F, false));

		gun36_r3 = new ModelRenderer(this);
		gun36_r3.setRotationPoint(0.85F, -34.6F, -27.65F);
		gun.addChild(gun36_r3);
		setRotationAngle(gun36_r3, 0.2826F, -0.0327F, -0.4252F);
		gun36_r3.cubeList.add(new ModelBox(gun36_r3, 69, 34, -0.92F, -1.3F, 0.0F, 1, 1, 1, -0.001F, false));
		gun36_r3.cubeList.add(new ModelBox(gun36_r3, 8, 38, -1.92F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-3.35F, -34.8F, -23.2F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.0F, 0.0F, -2.714F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 13, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(-3.85F, -34.8F, -23.2F);
		gun.addChild(gun40_r2);
		setRotationAngle(gun40_r2, 0.0F, 0.0F, -2.714F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 61, 56, -1.0F, 1.0F, 0.0F, 1, 2, 11, 0.0F, false));
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 17, 53, -1.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(0.85F, -34.8F, -23.2F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, 2.714F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 62, 0.0F, 1.0F, 0.0F, 1, 2, 11, 0.0F, false));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 50, 26, 0.0F, 1.0F, -4.8F, 1, 2, 1, 0.001F, false));
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 56, 44, 0.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F, false));

		gun40_r3 = new ModelRenderer(this);
		gun40_r3.setRotationPoint(-3.85F, -34.8F, -27.0F);
		gun.addChild(gun40_r3);
		setRotationAngle(gun40_r3, 0.0F, 0.0F, -2.714F);
		gun40_r3.cubeList.add(new ModelBox(gun40_r3, 43, 9, -1.0F, 1.0F, -1.0F, 1, 2, 1, 0.001F, false));

		gun39_r2 = new ModelRenderer(this);
		gun39_r2.setRotationPoint(0.35F, -34.8F, -23.2F);
		gun.addChild(gun39_r2);
		setRotationAngle(gun39_r2, 0.0F, 0.0F, 2.714F);
		gun39_r2.cubeList.add(new ModelBox(gun39_r2, 24, 63, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun44_r1 = new ModelRenderer(this);
		gun44_r1.setRotationPoint(-0.65F, -32.6F, -27.2F);
		gun.addChild(gun44_r1);
		setRotationAngle(gun44_r1, 0.0F, 0.0F, -1.8961F);
		gun44_r1.cubeList.add(new ModelBox(gun44_r1, 0, 68, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun43_r1 = new ModelRenderer(this);
		gun43_r1.setRotationPoint(-2.35F, -32.6F, -27.2F);
		gun.addChild(gun43_r1);
		setRotationAngle(gun43_r1, 0.0F, 0.0F, 1.8961F);
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 81, 45, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(-1.0F, -32.3F, -25.1F);
		gun.addChild(gun47_r1);
		setRotationAngle(gun47_r1, 0.0F, 0.0F, -1.7474F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 66, 0, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun46_r1 = new ModelRenderer(this);
		gun46_r1.setRotationPoint(-2.0F, -32.3F, -25.1F);
		gun.addChild(gun46_r1);
		setRotationAngle(gun46_r1, 0.0F, 0.0F, 1.7474F);
		gun46_r1.cubeList.add(new ModelBox(gun46_r1, 51, 69, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(-2.0F, -38.5F, -18.0F);
		gun.addChild(gun59_r1);
		setRotationAngle(gun59_r1, 0.0F, 0.0F, -0.6807F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 25, 58, -1.0F, 0.0F, 4.0F, 1, 1, 2, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 38, 29, -1.0F, 0.0F, 2.0F, 1, 1, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 34, 60, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 6, 68, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 68, 56, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 17, 47, -1.0F, 0.0F, -10.0F, 1, 1, 5, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(-1.0F, -38.5F, -18.0F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, 0.0F, 0.0F, 0.6807F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 48, 50, 0.0F, 0.0F, 4.0F, 1, 1, 2, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 21, 22, 0.0F, 0.0F, 2.0F, 1, 1, 1, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 0, 55, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 67, 29, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 31, 68, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 0, 46, 0.0F, 0.0F, -10.0F, 1, 1, 5, 0.0F, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(-0.8F, -38.5F, -12.5F);
		gun.addChild(gun88_r1);
		setRotationAngle(gun88_r1, 0.0F, 0.0F, 0.632F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 69, 32, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-2.2F, -38.5F, -12.5F);
		gun.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 0.0F, 0.0F, -0.632F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 77, 69, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun90_r1 = new ModelRenderer(this);
		gun90_r1.setRotationPoint(-3.01F, -37.9F, -12.5F);
		gun.addChild(gun90_r1);
		setRotationAngle(gun90_r1, 0.0F, 0.0F, -1.2641F);
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 64, 69, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(0.01F, -37.9F, -12.5F);
		gun.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0.0F, 0.0F, 1.2641F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 75, 49, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(0.31F, -36.95F, -12.5F);
		gun.addChild(gun92_r1);
		setRotationAngle(gun92_r1, 0.0F, 0.0F, 1.5987F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 50, 74, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun91_r1 = new ModelRenderer(this);
		gun91_r1.setRotationPoint(-3.31F, -36.95F, -12.5F);
		gun.addChild(gun91_r1);
		setRotationAngle(gun91_r1, 0.0F, 0.0F, -1.5987F);
		gun91_r1.cubeList.add(new ModelBox(gun91_r1, 75, 44, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun94_r1 = new ModelRenderer(this);
		gun94_r1.setRotationPoint(0.3F, -36.95F, -12.5F);
		gun.addChild(gun94_r1);
		setRotationAngle(gun94_r1, -1.0411F, -0.0088F, 0.0151F);
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 66, 0, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(-3.3F, -36.95F, -12.5F);
		gun.addChild(gun93_r1);
		setRotationAngle(gun93_r1, -1.0411F, 0.0088F, -0.0151F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 0, 68, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun96_r1 = new ModelRenderer(this);
		gun96_r1.setRotationPoint(-3.4F, -31.9F, 3.0F);
		gun.addChild(gun96_r1);
		setRotationAngle(gun96_r1, -2.5281F, 0.0F, 0.0F);
		gun96_r1.cubeList.add(new ModelBox(gun96_r1, 56, 25, 0.0F, 0.0F, 0.0F, 3, 2, 3, -0.001F, false));
		gun96_r1.cubeList.add(new ModelBox(gun96_r1, 45, 32, 2.8F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		gun97_r1 = new ModelRenderer(this);
		gun97_r1.setRotationPoint(-3.4F, -30.8F, 1.5F);
		gun.addChild(gun97_r1);
		setRotationAngle(gun97_r1, -1.8218F, 0.0F, 0.0F);
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 56, 6, 0.0F, 0.0F, -0.3F, 2, 2, 2, 0.0F, false));
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 24, 47, 1.8F, 0.0F, -0.3F, 2, 2, 2, -0.001F, false));

		gun135_r1 = new ModelRenderer(this);
		gun135_r1.setRotationPoint(-1.3F, -38.8F, -27.3F);
		gun.addChild(gun135_r1);
		setRotationAngle(gun135_r1, 0.0F, 0.0F, 0.5949F);
		gun135_r1.cubeList.add(new ModelBox(gun135_r1, 74, 59, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun134_r1 = new ModelRenderer(this);
		gun134_r1.setRotationPoint(-2.0F, -39.3F, -27.3F);
		gun.addChild(gun134_r1);
		setRotationAngle(gun134_r1, -0.2602F, 0.0F, 0.0F);
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 75, 32, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun136_r1 = new ModelRenderer(this);
		gun136_r1.setRotationPoint(-1.7F, -38.8F, -27.3F);
		gun.addChild(gun136_r1);
		setRotationAngle(gun136_r1, 0.0F, 0.0F, -0.5949F);
		gun136_r1.cubeList.add(new ModelBox(gun136_r1, 74, 56, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun100_r1 = new ModelRenderer(this);
		gun100_r1.setRotationPoint(-2.5F, -34.5F, -28.0F);
		gun.addChild(gun100_r1);
		setRotationAngle(gun100_r1, 0.409F, 0.0F, 0.0F);
		gun100_r1.cubeList.add(new ModelBox(gun100_r1, 66, 82, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(-1.8F, -33.3F, 2.6F);
		gun.addChild(gun112_r1);
		setRotationAngle(gun112_r1, -2.9371F, 0.0F, 0.0F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 49, 37, -1.0F, -0.5F, 0.0F, 1, 3, 1, 0.0F, false));
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 50, 18, 0.6F, -0.5F, 0.0F, 1, 3, 1, 0.0F, false));

		gun113_r1 = new ModelRenderer(this);
		gun113_r1.setRotationPoint(-2.3F, -33.3F, 2.5F);
		gun.addChild(gun113_r1);
		setRotationAngle(gun113_r1, -2.9371F, 0.0F, 0.0F);
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 37, 63, -1.0F, -0.5F, 0.0F, 1, 2, 1, 0.0F, false));
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 18, 65, 1.6F, -0.5F, 0.0F, 1, 2, 1, 0.0F, false));

		gun113_r2 = new ModelRenderer(this);
		gun113_r2.setRotationPoint(-0.2F, -33.5F, 2.5F);
		gun.addChild(gun113_r2);
		setRotationAngle(gun113_r2, -0.2231F, 0.0F, 0.0F);
		gun113_r2.cubeList.add(new ModelBox(gun113_r2, 77, 19, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun113_r2.cubeList.add(new ModelBox(gun113_r2, 21, 77, -2.6F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun123_r1 = new ModelRenderer(this);
		gun123_r1.setRotationPoint(-2.6F, -33.0F, -5.0F);
		gun.addChild(gun123_r1);
		setRotationAngle(gun123_r1, 0.0367F, 0.0058F, -0.157F);
		gun123_r1.cubeList.add(new ModelBox(gun123_r1, 72, 12, -1.4F, 0.0F, 0.1F, 1, 1, 2, 0.0F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-3.0F, -32.8F, -6.5F);
		gun.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.0F, 0.0F, -0.7064F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 7, 46, -1.3F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun121_r1 = new ModelRenderer(this);
		gun121_r1.setRotationPoint(-2.5F, -32.5F, -8.0F);
		gun.addChild(gun121_r1);
		setRotationAngle(gun121_r1, 0.0372F, 0.0F, 0.0F);
		gun121_r1.cubeList.add(new ModelBox(gun121_r1, 43, 18, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		gun121_r1.cubeList.add(new ModelBox(gun121_r1, 49, 6, 2.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun122_r1 = new ModelRenderer(this);
		gun122_r1.setRotationPoint(-2.5F, -32.5F, -8.0F);
		gun.addChild(gun122_r1);
		setRotationAngle(gun122_r1, 0.1115F, 0.0F, 0.0F);
		gun122_r1.cubeList.add(new ModelBox(gun122_r1, 38, 32, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.001F, false));
		gun122_r1.cubeList.add(new ModelBox(gun122_r1, 49, 0, 2.0F, 0.0F, 0.0F, 1, 1, 5, 0.001F, false));

		gun122_r2 = new ModelRenderer(this);
		gun122_r2.setRotationPoint(-0.4F, -33.0F, -5.0F);
		gun.addChild(gun122_r2);
		setRotationAngle(gun122_r2, 0.0367F, -0.0058F, 0.157F);
		gun122_r2.cubeList.add(new ModelBox(gun122_r2, 60, 82, 0.4F, 0.0F, 0.1F, 1, 1, 2, 0.0F, false));

		gun124_r1 = new ModelRenderer(this);
		gun124_r1.setRotationPoint(-3.0F, -31.3F, -8.3F);
		gun.addChild(gun124_r1);
		setRotationAngle(gun124_r1, 2.9371F, 0.0F, 0.0F);
		gun124_r1.cubeList.add(new ModelBox(gun124_r1, 13, 22, 0.0F, 0.0F, 0.0F, 3, 1, 1, -0.002F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-2.0F, -29.8F, -8.4F);
		gun.addChild(gun125_r1);
		setRotationAngle(gun125_r1, 1.9333F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 32, 82, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.001F, false));
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 26, 82, 0.0F, 0.4F, 0.0F, 1, 1, 2, 0.001F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(-3.2F, -32.0F, -13.3F);
		gun.addChild(gun129_r1);
		setRotationAngle(gun129_r1, 0.3346F, 0.0F, 0.0F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 79, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 79, 2, 2.4F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun127_r1 = new ModelRenderer(this);
		gun127_r1.setRotationPoint(-2.0F, -29.8F, -8.4F);
		gun.addChild(gun127_r1);
		setRotationAngle(gun127_r1, -0.7436F, 0.0F, 0.0F);
		gun127_r1.cubeList.add(new ModelBox(gun127_r1, 57, 67, 0.0F, -1.2F, -0.3F, 1, 2, 1, 0.0F, false));

		gun132_r1 = new ModelRenderer(this);
		gun132_r1.setRotationPoint(0.2F, -28.7F, -7.0F);
		gun.addChild(gun132_r1);
		setRotationAngle(gun132_r1, 0.1859F, 0.0F, 0.0F);
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 27, 77, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 78, 65, -3.4F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun132_r2 = new ModelRenderer(this);
		gun132_r2.setRotationPoint(0.0F, -32.8F, -6.5F);
		gun.addChild(gun132_r2);
		setRotationAngle(gun132_r2, 0.0F, 0.0F, 0.7064F);
		gun132_r2.cubeList.add(new ModelBox(gun132_r2, 7, 52, 0.3F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-1.0F, -33.5F, 1.9F);
		gun.addChild(gun158_r1);
		setRotationAngle(gun158_r1, -0.1859F, 0.0F, 0.0F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 38, 75, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 77, 16, -1.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 73, 16, 0.4F, 0.0F, 0.0F, 1, 1, 2, 0.002F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 73, 23, -2.4F, 0.0F, 0.0F, 1, 1, 2, 0.002F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 21, 75, -2.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun162_r1 = new ModelRenderer(this);
		gun162_r1.setRotationPoint(0.45F, -33.5F, 1.9F);
		gun.addChild(gun162_r1);
		setRotationAngle(gun162_r1, -0.1893F, -0.1886F, 0.0359F);
		gun162_r1.cubeList.add(new ModelBox(gun162_r1, 43, 63, -0.65F, 0.0F, 2.0F, 1, 1, 2, -0.001F, false));

		gun161_r1 = new ModelRenderer(this);
		gun161_r1.setRotationPoint(-3.45F, -33.5F, 1.9F);
		gun.addChild(gun161_r1);
		setRotationAngle(gun161_r1, -0.1893F, 0.1886F, -0.0359F);
		gun161_r1.cubeList.add(new ModelBox(gun161_r1, 64, 57, -0.35F, 0.0F, 2.0F, 1, 1, 2, -0.001F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.0F, -32.1F, 4.1F);
		gun.addChild(bone);
		setRotationAngle(bone, -0.925F, 0.0F, 0.0F);
		

		gun116_r1 = new ModelRenderer(this);
		gun116_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun116_r1);
		setRotationAngle(gun116_r1, -1.673F, 0.0F, 0.0F);
		gun116_r1.cubeList.add(new ModelBox(gun116_r1, 23, 53, 0.0F, 1.7118F, -1.0343F, 1, 1, 3, -0.001F, false));

		gun115_r1 = new ModelRenderer(this);
		gun115_r1.setRotationPoint(0.0F, -0.6F, 0.75F);
		bone.addChild(gun115_r1);
		setRotationAngle(gun115_r1, -2.1564F, 0.0F, 0.0F);
		gun115_r1.cubeList.add(new ModelBox(gun115_r1, 56, 0, 0.0F, 1.9964F, -0.1203F, 1, 1, 3, 0.0F, false));

		gun114_r1 = new ModelRenderer(this);
		gun114_r1.setRotationPoint(0.0F, -1.5F, 0.3F);
		bone.addChild(gun114_r1);
		setRotationAngle(gun114_r1, -1.1154F, 0.0F, 0.0F);
		gun114_r1.cubeList.add(new ModelBox(gun114_r1, 67, 61, 0.0F, 0.905F, -1.7835F, 1, 2, 1, 0.001F, false));

		
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