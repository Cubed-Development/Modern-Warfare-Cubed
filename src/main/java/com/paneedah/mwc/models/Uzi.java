package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Uzi extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun100_r1_r1;
	private final ModelRenderer gun1_r1_r1;
	private final ModelRenderer gun6_r1_r1;
	private final ModelRenderer gun8_r1_r1;
	private final ModelRenderer gun25_r1_r1;
	private final ModelRenderer gun26_r1_r1;
	private final ModelRenderer gun77_r1_r1;
	private final ModelRenderer gun78_r1_r1;
	private final ModelRenderer gun79_r1_r1;
	private final ModelRenderer gun92_r1_r1;
	private final ModelRenderer gun93_r1_r1;
	private final ModelRenderer gun97_r1_r1;
	private final ModelRenderer gun98_r1_r1;
	private final ModelRenderer gun99_r1_r1;
	private final ModelRenderer gun112_r1_r1;
	private final ModelRenderer gun113_r1_r1;
	private final ModelRenderer gun114_r1_r1;
	private final ModelRenderer gun115_r1_r1;
	private final ModelRenderer gun129_r1_r1;
	private final ModelRenderer gun131_r1_r1;
	private final ModelRenderer gun132_r1_r1;
	private final ModelRenderer gun134_r1_r1;
	private final ModelRenderer gun135_r1_r1;
	private final ModelRenderer gun136_r1_r1;
	private final ModelRenderer gun139_r1_r1;
	private final ModelRenderer gun140_r1_r1;
	private final ModelRenderer gun143_r1_r1;
	private final ModelRenderer gun144_r1_r1;
	private final ModelRenderer gun147_r1_r1;
	private final ModelRenderer gun155_r1_r1;
	private final ModelRenderer gun162_r1_r1;
	private final ModelRenderer gun164_r1_r1;
	private final ModelRenderer gun197_r1_r1;
	private final ModelRenderer gun198_r1_r1;
	private final ModelRenderer gun199_r1_r1;
	private final ModelRenderer gun200_r1_r1;
	private final ModelRenderer gun201_r1_r1;
	private final ModelRenderer gun202_r1_r1;
	private final ModelRenderer gun203_r1_r1;
	private final ModelRenderer gun204_r1_r1;
	private final ModelRenderer gun211_r1_r1;
	private final ModelRenderer gun211_r1_r2;
	private final ModelRenderer gun222_r1_r1;
	private final ModelRenderer gun223_r1_r1;
	private final ModelRenderer gun224_r1_r1;
	private final ModelRenderer gun225_r1_r1;
	private final ModelRenderer gun226_r1_r1;
	private final ModelRenderer gun227_r1_r1;
	private final ModelRenderer gun228_r1_r1;
	private final ModelRenderer gun229_r1_r1;
	private final ModelRenderer gun230_r1_r1;
	private final ModelRenderer gun232_r1_r1;
	private final ModelRenderer gun236_r1_r1;
	private final ModelRenderer gun238_r1_r1;
	private final ModelRenderer gun239_r1_r1;
	private final ModelRenderer StandardHandguard;
	private final ModelRenderer gun118_r1_r1;
	private final ModelRenderer gun153_r1_r1;
	private final ModelRenderer gun194_r1_r1;
	private final ModelRenderer gun151_r1_r1;
	private final ModelRenderer gun190_r1_r1;
	private final ModelRenderer gun167_r1_r1;
	private final ModelRenderer gun169_r1_r1;
	private final ModelRenderer gun168_r1_r1;
	private final ModelRenderer gun170_r1_r1;
	private final ModelRenderer gun74_r1_r1;
	private final ModelRenderer gun75_r1_r1;
	private final ModelRenderer gun73_r1_r1;
	private final ModelRenderer gun72_r1_r1;
	private final ModelRenderer gun189_r1_r1;

	public Uzi() {
		textureWidth = 240;
		textureHeight = 240;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 26, 104, -4.0F, -34.0F, -13.5F, 5, 1, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 98, -3.5F, -31.5F, -6.0F, 4, 11, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 72, -3.0F, -31.5F, -6.5F, 3, 10, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 111, -3.0F, -25.5F, -1.5F, 3, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 62, -3.0F, -31.5F, -0.5F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -0.2F, -38.0F, -20.5F, 1, 5, 35, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 0, -3.8F, -38.0F, -20.5F, 1, 5, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 184, 111, -4.0F, -35.2F, -12.5F, 1, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 87, -3.8F, -35.3F, -8.5F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 72, -3.8F, -38.0F, -2.5F, 1, 5, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 40, -2.5F, -31.5F, -7.0F, 2, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 7, -2.5F, -27.5F, -12.0F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 40, -2.5F, -33.5F, -13.9F, 2, 5, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 58, -4.0F, -37.0F, -9.7F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 134, 135, -4.0F, -37.0F, -12.5F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 19, -4.0F, -37.0F, -2.3F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 0, -4.0F, -37.0F, -1.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 19, -3.3F, -38.0F, -25.5F, 3, 5, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 40, -0.7F, -38.0F, -25.5F, 1, 5, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 121, 87, -4.0F, -37.0F, 3.0F, 5, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 43, -4.0F, -35.2F, 3.0F, 5, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 148, -4.0F, -32.0F, -13.5F, 5, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 65, -4.0F, -33.0F, -13.5F, 5, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 59, -4.0F, -33.0F, -2.5F, 5, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 203, 25, -3.8F, -33.0F, -9.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 203, -0.2F, -33.0F, -9.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 184, 0.0F, -37.0F, -12.5F, 1, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 183, 0.0F, -35.2F, -12.5F, 1, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 136, 26, -1.0F, -39.0F, -20.5F, 2, 1, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 190, 169, -4.0F, -39.0F, -20.5F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 49, -4.0F, -39.0F, -2.5F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 195, 195, -3.3F, -39.7F, -9.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 194, 97, -0.7F, -39.7F, -9.5F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 182, -2.1F, -39.5F, -8.5F, 1, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 182, -1.9F, -39.5F, -8.5F, 1, 1, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 35, -2.1F, -39.5F, -23.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 34, 104, -1.9F, -39.5F, -23.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 65, -3.5F, -39.0F, -25.5F, 4, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 98, -3.5F, -38.0F, -25.5F, 4, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 119, -3.3F, -39.45F, -25.5F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 25, -1.7F, -39.45F, -25.5F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 54, -3.2F, -39.6F, -29.5F, 2, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 17, -1.8F, -39.6F, -29.5F, 2, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 197, 17, -3.0F, -38.9F, 8.5F, 3, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 109, -2.5F, -37.0F, -32.5F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 9, -3.5F, -36.0F, -32.5F, 4, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 186, -2.0F, -36.0F, -43.5F, 1, 2, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 58, -2.5F, -35.5F, -43.5F, 2, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 190, 55, -2.3F, -35.8F, -43.5F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 189, -2.3F, -35.2F, -43.5F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 152, 188, -1.7F, -35.2F, -43.5F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 187, -1.7F, -35.8F, -43.5F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 94, -3.0F, -33.98F, 1.5F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 25, -1.0F, -36.3F, -17.0F, 2, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 29, -3.3F, -39.0F, 4.5F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 109, -0.7F, -39.0F, 4.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 65, -2.5F, -31.3819F, -9.1534F, 2, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 125, 29, -3.0F, -37.0F, 13.5F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 19, -3.5F, -33.98F, 3.5F, 4, 1, 11, 0.0F, false));

		gun100_r1_r1 = new ModelRenderer(this);
		gun100_r1_r1.setRotationPoint(15.823F, 12.5093F, 0.0F);
		gun.addChild(gun100_r1_r1);
		setRotationAngle(gun100_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun100_r1_r1.cubeList.add(new ModelBox(gun100_r1_r1, 197, 157, 19.0115F, -47.0454F, 3.0F, 1, 1, 7, 0.0F, false));
		gun100_r1_r1.cubeList.add(new ModelBox(gun100_r1_r1, 179, 97, 19.0115F, -47.0454F, -12.5F, 1, 1, 13, 0.0F, false));

		gun1_r1_r1 = new ModelRenderer(this);
		gun1_r1_r1.setRotationPoint(0.0F, 2.0148F, -0.6176F);
		gun.addChild(gun1_r1_r1);
		setRotationAngle(gun1_r1_r1, -0.2974F, 0.0F, 0.0F);
		gun1_r1_r1.cubeList.add(new ModelBox(gun1_r1_r1, 19, 19, -2.0F, -33.5538F, -15.2335F, 1, 4, 1, 0.0F, false));

		gun6_r1_r1 = new ModelRenderer(this);
		gun6_r1_r1.setRotationPoint(0.0F, -95.1552F, -29.0601F);
		gun.addChild(gun6_r1_r1);
		setRotationAngle(gun6_r1_r1, -2.8256F, 0.0F, 0.0F);
		gun6_r1_r1.cubeList.add(new ModelBox(gun6_r1_r1, 96, 116, -2.99F, -75.3926F, -6.4498F, 3, 4, 1, 0.0F, false));

		gun8_r1_r1 = new ModelRenderer(this);
		gun8_r1_r1.setRotationPoint(0.0F, -84.6725F, -67.2763F);
		gun.addChild(gun8_r1_r1);
		setRotationAngle(gun8_r1_r1, -2.4538F, 0.0F, 0.0F);
		gun8_r1_r1.cubeList.add(new ModelBox(gun8_r1_r1, 56, 27, -2.999F, -84.883F, -17.9764F, 3, 1, 2, 0.0F, false));

		gun25_r1_r1 = new ModelRenderer(this);
		gun25_r1_r1.setRotationPoint(0.0F, 6.0475F, 17.5627F);
		gun.addChild(gun25_r1_r1);
		setRotationAngle(gun25_r1_r1, 0.7854F, 0.0F, 0.0F);
		gun25_r1_r1.cubeList.add(new ModelBox(gun25_r1_r1, 88, 83, -2.5F, -46.6762F, 2.1813F, 2, 2, 1, 0.0F, false));

		gun26_r1_r1 = new ModelRenderer(this);
		gun26_r1_r1.setRotationPoint(0.0F, 6.0476F, 16.4857F);
		gun.addChild(gun26_r1_r1);
		setRotationAngle(gun26_r1_r1, 0.7854F, 0.0F, 0.0F);
		gun26_r1_r1.cubeList.add(new ModelBox(gun26_r1_r1, 16, 62, -2.5F, -44.0762F, 2.9429F, 2, 1, 1, 0.0F, false));

		gun77_r1_r1 = new ModelRenderer(this);
		gun77_r1_r1.setRotationPoint(0.0F, 18.474F, -11.2666F);
		gun.addChild(gun77_r1_r1);
		setRotationAngle(gun77_r1_r1, -0.7854F, 0.0F, 0.0F);
		gun77_r1_r1.cubeList.add(new ModelBox(gun77_r1_r1, 100, 62, -4.0F, -40.263F, -36.6333F, 1, 1, 1, 0.0F, false));

		gun78_r1_r1 = new ModelRenderer(this);
		gun78_r1_r1.setRotationPoint(0.0F, 15.823F, -13.9176F);
		gun.addChild(gun78_r1_r1);
		setRotationAngle(gun78_r1_r1, -0.7854F, 0.0F, 0.0F);
		gun78_r1_r1.cubeList.add(new ModelBox(gun78_r1_r1, 66, 100, -4.0F, -44.7885F, -28.3588F, 1, 1, 1, 0.0F, false));

		gun79_r1_r1 = new ModelRenderer(this);
		gun79_r1_r1.setRotationPoint(0.0F, 15.9058F, -13.8348F);
		gun.addChild(gun79_r1_r1);
		setRotationAngle(gun79_r1_r1, -0.7854F, 0.0F, 0.0F);
		gun79_r1_r1.cubeList.add(new ModelBox(gun79_r1_r1, 76, 100, -3.8F, -44.6471F, -28.6174F, 1, 1, 1, 0.0F, false));

		gun92_r1_r1 = new ModelRenderer(this);
		gun92_r1_r1.setRotationPoint(27.4832F, 0.0F, 4.3222F);
		gun.addChild(gun92_r1_r1);
		setRotationAngle(gun92_r1_r1, 0.0F, 1.2315F, 0.0F);
		gun92_r1_r1.cubeList.add(new ModelBox(gun92_r1_r1, 15, 40, 12.9961F, -38.0F, -37.7613F, 2, 5, 1, 0.0F, false));

		gun93_r1_r1 = new ModelRenderer(this);
		gun93_r1_r1.setRotationPoint(-26.2154F, 0.0001F, -74.7246F);
		gun.addChild(gun93_r1_r1);
		setRotationAngle(gun93_r1_r1, 3.1416F, -0.3764F, -3.1416F);
		gun93_r1_r1.cubeList.add(new ModelBox(gun93_r1_r1, 28, 0, -5.1919F, -38.0F, -60.3587F, 1, 5, 2, 0.0F, false));

		gun97_r1_r1 = new ModelRenderer(this);
		gun97_r1_r1.setRotationPoint(16.9828F, 13.6691F, 0.0F);
		gun.addChild(gun97_r1_r1);
		setRotationAngle(gun97_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun97_r1_r1.cubeList.add(new ModelBox(gun97_r1_r1, 156, 155, 20.9914F, -50.6655F, 3.0F, 1, 1, 7, 0.0F, false));
		gun97_r1_r1.cubeList.add(new ModelBox(gun97_r1_r1, 88, 87, 20.9914F, -50.6655F, -1.5F, 1, 1, 2, 0.0F, false));
		gun97_r1_r1.cubeList.add(new ModelBox(gun97_r1_r1, 85, 100, 20.9914F, -50.6655F, -2.3F, 1, 1, 1, 0.0F, false));
		gun97_r1_r1.cubeList.add(new ModelBox(gun97_r1_r1, 98, 100, 20.9914F, -50.6655F, -9.7F, 1, 1, 1, 0.0F, false));
		gun97_r1_r1.cubeList.add(new ModelBox(gun97_r1_r1, 59, 127, 20.9914F, -50.6655F, -12.5F, 1, 1, 3, 0.0F, false));

		gun98_r1_r1 = new ModelRenderer(this);
		gun98_r1_r1.setRotationPoint(16.5686F, 13.2549F, 0.0F);
		gun.addChild(gun98_r1_r1);
		setRotationAngle(gun98_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun98_r1_r1.cubeList.add(new ModelBox(gun98_r1_r1, 121, 168, 20.2843F, -49.3726F, 3.0F, 1, 1, 7, 0.0F, false));
		gun98_r1_r1.cubeList.add(new ModelBox(gun98_r1_r1, 0, 90, 20.2843F, -49.3726F, -1.5F, 1, 1, 2, 0.0F, false));
		gun98_r1_r1.cubeList.add(new ModelBox(gun98_r1_r1, 52, 128, 20.2843F, -49.3726F, -12.5F, 1, 1, 3, 0.0F, false));

		gun99_r1_r1 = new ModelRenderer(this);
		gun99_r1_r1.setRotationPoint(16.2372F, 12.9235F, 0.0F);
		gun.addChild(gun99_r1_r1);
		setRotationAngle(gun99_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun99_r1_r1.cubeList.add(new ModelBox(gun99_r1_r1, 172, 69, 19.7186F, -48.3383F, 3.0F, 1, 1, 7, 0.0F, false));
		gun99_r1_r1.cubeList.add(new ModelBox(gun99_r1_r1, 8, 90, 19.7186F, -48.3383F, -1.5F, 1, 1, 2, 0.0F, false));
		gun99_r1_r1.cubeList.add(new ModelBox(gun99_r1_r1, 128, 54, 19.7186F, -48.3383F, -12.5F, 1, 1, 3, 0.0F, false));

		gun112_r1_r1 = new ModelRenderer(this);
		gun112_r1_r1.setRotationPoint(-86.9116F, -91.7403F, 0.0F);
		gun.addChild(gun112_r1_r1);
		setRotationAngle(gun112_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun112_r1_r1.cubeList.add(new ModelBox(gun112_r1_r1, 199, 111, -23.4559F, -100.87F, 3.0F, 1, 1, 7, 0.0F, false));
		gun112_r1_r1.cubeList.add(new ModelBox(gun112_r1_r1, 179, 133, -23.4559F, -100.87F, -12.5F, 1, 1, 13, 0.0F, false));

		gun113_r1_r1 = new ModelRenderer(this);
		gun113_r1_r1.setRotationPoint(-84.4974F, -89.3261F, 0.0F);
		gun.addChild(gun113_r1_r1);
		setRotationAngle(gun113_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun113_r1_r1.cubeList.add(new ModelBox(gun113_r1_r1, 0, 200, -22.7488F, -98.1629F, 3.0F, 1, 1, 7, 0.0F, false));
		gun113_r1_r1.cubeList.add(new ModelBox(gun113_r1_r1, 34, 180, -22.7488F, -98.1629F, -12.5F, 1, 1, 13, 0.0F, false));

		gun114_r1_r1 = new ModelRenderer(this);
		gun114_r1_r1.setRotationPoint(-82.5661F, -87.3949F, 0.0F);
		gun.addChild(gun114_r1_r1);
		setRotationAngle(gun114_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun114_r1_r1.cubeList.add(new ModelBox(gun114_r1_r1, 200, 68, -22.1831F, -95.9973F, 3.0F, 1, 1, 7, 0.0F, false));
		gun114_r1_r1.cubeList.add(new ModelBox(gun114_r1_r1, 182, 14, -22.1831F, -95.9973F, -12.5F, 1, 1, 13, 0.0F, false));

		gun115_r1_r1 = new ModelRenderer(this);
		gun115_r1_r1.setRotationPoint(-80.1518F, -84.9805F, 0.0F);
		gun.addChild(gun115_r1_r1);
		setRotationAngle(gun115_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun115_r1_r1.cubeList.add(new ModelBox(gun115_r1_r1, 136, 200, -21.476F, -93.2901F, 3.0F, 1, 1, 7, 0.0F, false));
		gun115_r1_r1.cubeList.add(new ModelBox(gun115_r1_r1, 49, 182, -21.476F, -93.2901F, -12.5F, 1, 1, 13, 0.0F, false));

		gun129_r1_r1 = new ModelRenderer(this);
		gun129_r1_r1.setRotationPoint(0.0F, 19.5538F, -78.4836F);
		gun.addChild(gun129_r1_r1);
		setRotationAngle(gun129_r1_r1, -1.5615F, 0.0F, 0.0F);
		gun129_r1_r1.cubeList.add(new ModelBox(gun129_r1_r1, 46, 129, -3.3F, -69.5314F, -58.61F, 1, 15, 1, 0.0F, false));
		gun129_r1_r1.cubeList.add(new ModelBox(gun129_r1_r1, 131, 62, -0.7F, -69.5314F, -58.61F, 1, 15, 1, 0.0F, false));

		gun131_r1_r1 = new ModelRenderer(this);
		gun131_r1_r1.setRotationPoint(0.0F, 0.2195F, -0.008F);
		gun.addChild(gun131_r1_r1);
		setRotationAngle(gun131_r1_r1, -0.0744F, 0.0F, 0.0F);
		gun131_r1_r1.cubeList.add(new ModelBox(gun131_r1_r1, 191, 186, -0.7F, -39.6983F, -4.4534F, 1, 1, 8, 0.0F, false));
		gun131_r1_r1.cubeList.add(new ModelBox(gun131_r1_r1, 192, 81, -3.3F, -39.6983F, -4.4534F, 1, 1, 8, 0.0F, false));

		gun132_r1_r1 = new ModelRenderer(this);
		gun132_r1_r1.setRotationPoint(-16.5686F, 16.3201F, 0.0F);
		gun.addChild(gun132_r1_r1);
		setRotationAngle(gun132_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun132_r1_r1.cubeList.add(new ModelBox(gun132_r1_r1, 193, 28, -27.6843F, -51.54F, -9.5F, 1, 1, 8, 0.0F, false));

		gun134_r1_r1 = new ModelRenderer(this);
		gun134_r1_r1.setRotationPoint(-15.0774F, 17.8112F, 0.0F);
		gun.addChild(gun134_r1_r1);
		setRotationAngle(gun134_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun134_r1_r1.cubeList.add(new ModelBox(gun134_r1_r1, 101, 17, -32.3387F, -48.9944F, -2.5F, 1, 1, 1, 0.0F, false));
		gun134_r1_r1.cubeList.add(new ModelBox(gun134_r1_r1, 101, 19, -32.3387F, -48.9944F, -9.5F, 1, 1, 1, 0.0F, false));

		gun135_r1_r1 = new ModelRenderer(this);
		gun135_r1_r1.setRotationPoint(-16.523F, 16.2828F, 0.0F);
		gun.addChild(gun135_r1_r1);
		setRotationAngle(gun135_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun135_r1_r1.cubeList.add(new ModelBox(gun135_r1_r1, 88, 80, -27.6265F, -51.4036F, -15.5F, 1, 1, 6, 0.0F, false));

		gun136_r1_r1 = new ModelRenderer(this);
		gun136_r1_r1.setRotationPoint(-15.0401F, 17.7656F, 0.0F);
		gun.addChild(gun136_r1_r1);
		setRotationAngle(gun136_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun136_r1_r1.cubeList.add(new ModelBox(gun136_r1_r1, 88, 87, -32.255F, -48.8722F, -15.5F, 1, 1, 6, 0.0F, false));

		gun139_r1_r1 = new ModelRenderer(this);
		gun139_r1_r1.setRotationPoint(-14.9987F, 17.7242F, 0.0F);
		gun.addChild(gun139_r1_r1);
		setRotationAngle(gun139_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun139_r1_r1.cubeList.add(new ModelBox(gun139_r1_r1, 57, 131, -32.1843F, -48.7429F, -1.5F, 1, 1, 3, 0.0F, false));
		gun139_r1_r1.cubeList.add(new ModelBox(gun139_r1_r1, 72, 73, -32.1843F, -48.7429F, -20.5F, 1, 1, 5, 0.0F, false));

		gun140_r1_r1 = new ModelRenderer(this);
		gun140_r1_r1.setRotationPoint(-16.4816F, 16.2414F, 0.0F);
		gun.addChild(gun140_r1_r1);
		setRotationAngle(gun140_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun140_r1_r1.cubeList.add(new ModelBox(gun140_r1_r1, 131, 79, -27.5558F, -51.2743F, -1.5F, 1, 1, 3, 0.0F, false));
		gun140_r1_r1.cubeList.add(new ModelBox(gun140_r1_r1, 16, 80, -27.5558F, -51.2743F, -20.5F, 1, 1, 5, 0.0F, false));

		gun143_r1_r1 = new ModelRenderer(this);
		gun143_r1_r1.setRotationPoint(-15.4917F, 17.2313F, 0.0F);
		gun.addChild(gun143_r1_r1);
		setRotationAngle(gun143_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun143_r1_r1.cubeList.add(new ModelBox(gun143_r1_r1, 77, 0, -30.6458F, -49.5844F, -23.5F, 1, 1, 28, 0.0F, false));

		gun144_r1_r1 = new ModelRenderer(this);
		gun144_r1_r1.setRotationPoint(-15.9887F, 16.7342F, 0.0F);
		gun.addChild(gun144_r1_r1);
		setRotationAngle(gun144_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun144_r1_r1.cubeList.add(new ModelBox(gun144_r1_r1, 80, 33, -29.0943F, -50.4329F, -23.5F, 1, 1, 28, 0.0F, false));

		gun147_r1_r1 = new ModelRenderer(this);
		gun147_r1_r1.setRotationPoint(-25.4974F, 0.0001F, -75.0083F);
		gun.addChild(gun147_r1_r1);
		setRotationAngle(gun147_r1_r1, 3.1416F, -0.3764F, -3.1416F);
		gun147_r1_r1.cubeList.add(new ModelBox(gun147_r1_r1, 88, 90, -4.6059F, -39.0F, -60.4322F, 1, 1, 2, 0.0F, false));

		gun155_r1_r1 = new ModelRenderer(this);
		gun155_r1_r1.setRotationPoint(0.0F, -145.5773F, 32.1086F);
		gun.addChild(gun155_r1_r1);
		setRotationAngle(gun155_r1_r1, 2.3562F, 0.0F, 0.0F);
		gun155_r1_r1.cubeList.add(new ModelBox(gun155_r1_r1, 77, 29, -3.5F, -116.2385F, -37.5955F, 4, 2, 1, 0.0F, false));

		gun162_r1_r1 = new ModelRenderer(this);
		gun162_r1_r1.setRotationPoint(-12.2253F, 15.8811F, 0.0F);
		gun.addChild(gun162_r1_r1);
		setRotationAngle(gun162_r1_r1, 0.0F, 0.0F, 0.733F);
		gun162_r1_r1.cubeList.add(new ModelBox(gun162_r1_r1, 91, 0, -29.7997F, -46.6843F, 8.5F, 1, 1, 6, 0.0F, false));
		gun162_r1_r1.cubeList.add(new ModelBox(gun162_r1_r1, 16, 94, -29.7997F, -46.8843F, 8.5F, 1, 1, 6, 0.0F, false));

		gun164_r1_r1 = new ModelRenderer(this);
		gun164_r1_r1.setRotationPoint(-19.6592F, 17.3927F, 0.0F);
		gun.addChild(gun164_r1_r1);
		setRotationAngle(gun164_r1_r1, 0.0F, 0.0F, 0.8465F);
		gun164_r1_r1.cubeList.add(new ModelBox(gun164_r1_r1, 26, 104, -28.9344F, -52.0241F, 8.5F, 1, 1, 6, 0.0F, false));
		gun164_r1_r1.cubeList.add(new ModelBox(gun164_r1_r1, 50, 104, -29.1344F, -52.0241F, 8.5F, 1, 1, 6, 0.0F, false));

		gun197_r1_r1 = new ModelRenderer(this);
		gun197_r1_r1.setRotationPoint(-14.2904F, 16.3615F, 0.0F);
		gun.addChild(gun197_r1_r1);
		setRotationAngle(gun197_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun197_r1_r1.cubeList.add(new ModelBox(gun197_r1_r1, 52, 132, -29.3952F, -46.0693F, -32.5F, 1, 1, 3, 0.0F, false));

		gun198_r1_r1 = new ModelRenderer(this);
		gun198_r1_r1.setRotationPoint(-15.1188F, 15.533F, 0.0F);
		gun.addChild(gun198_r1_r1);
		setRotationAngle(gun198_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun198_r1_r1.cubeList.add(new ModelBox(gun198_r1_r1, 71, 132, -26.8094F, -47.493F, -32.5F, 1, 1, 3, 0.0F, false));

		gun199_r1_r1 = new ModelRenderer(this);
		gun199_r1_r1.setRotationPoint(16.3615F, 13.462F, 0.0F);
		gun.addChild(gun199_r1_r1);
		setRotationAngle(gun199_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun199_r1_r1.cubeList.add(new ModelBox(gun199_r1_r1, 79, 132, 20.9307F, -49.019F, -32.5F, 1, 1, 3, 0.0F, false));

		gun200_r1_r1 = new ModelRenderer(this);
		gun200_r1_r1.setRotationPoint(15.533F, 12.6335F, 0.0F);
		gun.addChild(gun200_r1_r1);
		setRotationAngle(gun200_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun200_r1_r1.cubeList.add(new ModelBox(gun200_r1_r1, 132, 123, 19.5165F, -46.4332F, -32.5F, 1, 1, 3, 0.0F, false));

		gun201_r1_r1 = new ModelRenderer(this);
		gun201_r1_r1.setRotationPoint(73.6334F, -85.7049F, 0.0F);
		gun.addChild(gun201_r1_r1);
		setRotationAngle(gun201_r1_r1, 0.0F, 0.0F, -2.3562F);
		gun201_r1_r1.cubeList.add(new ModelBox(gun201_r1_r1, 132, 127, 16.5668F, -91.1023F, -32.5F, 1, 1, 3, 0.0F, false));

		gun202_r1_r1 = new ModelRenderer(this);
		gun202_r1_r1.setRotationPoint(78.4619F, -80.8765F, 0.0F);
		gun.addChild(gun202_r1_r1);
		setRotationAngle(gun202_r1_r1, 0.0F, 0.0F, -2.3562F);
		gun202_r1_r1.cubeList.add(new ModelBox(gun202_r1_r1, 133, 18, 21.981F, -89.6881F, -32.5F, 1, 1, 3, 0.0F, false));

		gun203_r1_r1 = new ModelRenderer(this);
		gun203_r1_r1.setRotationPoint(-85.7045F, -88.1191F, 0.0F);
		gun.addChild(gun203_r1_r1);
		setRotationAngle(gun203_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun203_r1_r1.cubeList.add(new ModelBox(gun203_r1_r1, 133, 55, -24.1023F, -97.8094F, -32.5F, 1, 1, 3, 0.0F, false));

		gun204_r1_r1 = new ModelRenderer(this);
		gun204_r1_r1.setRotationPoint(-80.8761F, -83.2907F, 0.0F);
		gun.addChild(gun204_r1_r1);
		setRotationAngle(gun204_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun204_r1_r1.cubeList.add(new ModelBox(gun204_r1_r1, 134, 131, -22.6881F, -92.3952F, -32.5F, 1, 1, 3, 0.0F, false));

		gun211_r1_r1 = new ModelRenderer(this);
		gun211_r1_r1.setRotationPoint(-1.5F, -28.9819F, -8.6534F);
		gun.addChild(gun211_r1_r1);
		setRotationAngle(gun211_r1_r1, -0.48F, 0.0F, 0.0F);
		gun211_r1_r1.cubeList.add(new ModelBox(gun211_r1_r1, 79, 73, -1.0F, -0.7F, -0.7F, 2, 2, 1, -0.1F, false));

		gun211_r1_r2 = new ModelRenderer(this);
		gun211_r1_r2.setRotationPoint(0.0F, -83.2906F, 44.6628F);
		gun.addChild(gun211_r1_r2);
		setRotationAngle(gun211_r1_r2, 2.3562F, 0.0F, 0.0F);
		gun211_r1_r2.cubeList.add(new ModelBox(gun211_r1_r2, 62, 0, -2.5F, -77.3952F, -2.9185F, 2, 3, 1, 0.0F, false));

		gun222_r1_r1 = new ModelRenderer(this);
		gun222_r1_r1.setRotationPoint(0.0F, 0.1648F, 0.0206F);
		gun.addChild(gun222_r1_r1);
		setRotationAngle(gun222_r1_r1, 0.0744F, 0.0F, 0.0F);
		gun222_r1_r1.cubeList.add(new ModelBox(gun222_r1_r1, 123, 114, -2.5F, -30.1943F, 0.7245F, 2, 4, 2, 0.0F, false));

		gun223_r1_r1 = new ModelRenderer(this);
		gun223_r1_r1.setRotationPoint(-74.8405F, -79.6693F, 0.0F);
		gun.addChild(gun223_r1_r1);
		setRotationAngle(gun223_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun223_r1_r1.cubeList.add(new ModelBox(gun223_r1_r1, 201, 0, -19.9203F, -87.3345F, -9.5F, 1, 1, 7, 0.0F, false));

		gun224_r1_r1 = new ModelRenderer(this);
		gun224_r1_r1.setRotationPoint(-77.2546F, -82.0835F, 0.0F);
		gun.addChild(gun224_r1_r1);
		setRotationAngle(gun224_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun224_r1_r1.cubeList.add(new ModelBox(gun224_r1_r1, 145, 201, -20.6274F, -90.0416F, -9.5F, 1, 1, 7, 0.0F, false));

		gun225_r1_r1 = new ModelRenderer(this);
		gun225_r1_r1.setRotationPoint(-20.5208F, 0.0F, -25.3492F);
		gun.addChild(gun225_r1_r1);
		setRotationAngle(gun225_r1_r1, 3.1416F, -0.7854F, -3.1416F);
		gun225_r1_r1.cubeList.add(new ModelBox(gun225_r1_r1, 102, 59, -4.0104F, -33.0F, -26.4246F, 1, 1, 1, 0.0F, false));

		gun226_r1_r1 = new ModelRenderer(this);
		gun226_r1_r1.setRotationPoint(-3.6214F, 0.0F, -8.4498F);
		gun.addChild(gun226_r1_r1);
		setRotationAngle(gun226_r1_r1, 3.1416F, -0.7854F, -3.1416F);
		gun226_r1_r1.cubeList.add(new ModelBox(gun226_r1_r1, 103, 29, 0.9393F, -33.0F, -7.4749F, 1, 1, 1, 0.0F, false));

		gun227_r1_r1 = new ModelRenderer(this);
		gun227_r1_r1.setRotationPoint(5.5919F, 0.0F, 2.2781F);
		gun.addChild(gun227_r1_r1);
		setRotationAngle(gun227_r1_r1, 0.0F, 0.7854F, 0.0F);
		gun227_r1_r1.cubeList.add(new ModelBox(gun227_r1_r1, 26, 104, 1.5459F, -33.0F, -15.1109F, 1, 1, 1, 0.0F, false));

		gun228_r1_r1 = new ModelRenderer(this);
		gun228_r1_r1.setRotationPoint(2.6924F, 0.0F, -0.6213F);
		gun.addChild(gun228_r1_r1);
		setRotationAngle(gun228_r1_r1, 0.0F, 0.7854F, 0.0F);
		gun228_r1_r1.cubeList.add(new ModelBox(gun228_r1_r1, 104, 33, -3.4038F, -33.0F, -6.0607F, 1, 1, 1, 0.0F, false));

		gun229_r1_r1 = new ModelRenderer(this);
		gun229_r1_r1.setRotationPoint(14.9117F, 11.598F, 0.0F);
		gun.addChild(gun229_r1_r1);
		setRotationAngle(gun229_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun229_r1_r1.cubeList.add(new ModelBox(gun229_r1_r1, 201, 182, 17.4558F, -44.201F, -9.5F, 1, 1, 7, 0.0F, false));

		gun230_r1_r1 = new ModelRenderer(this);
		gun230_r1_r1.setRotationPoint(15.326F, 12.0122F, 0.0F);
		gun.addChild(gun230_r1_r1);
		setRotationAngle(gun230_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun230_r1_r1.cubeList.add(new ModelBox(gun230_r1_r1, 9, 202, 18.163F, -45.4939F, -9.5F, 1, 1, 7, 0.0F, false));

		gun232_r1_r1 = new ModelRenderer(this);
		gun232_r1_r1.setRotationPoint(1.9293F, 4.5717F, 0.0F);
		gun.addChild(gun232_r1_r1);
		setRotationAngle(gun232_r1_r1, 0.0F, 0.0F, -0.3718F);
		gun232_r1_r1.cubeList.add(new ModelBox(gun232_r1_r1, 110, 104, 12.1187F, -38.1433F, -17.5F, 2, 1, 3, 0.0F, false));

		gun236_r1_r1 = new ModelRenderer(this);
		gun236_r1_r1.setRotationPoint(-30.9572F, 19.1773F, 0.0F);
		gun.addChild(gun236_r1_r1);
		setRotationAngle(gun236_r1_r1, 0.0F, 0.0F, 1.0085F);
		gun236_r1_r1.cubeList.add(new ModelBox(gun236_r1_r1, 202, 37, -32.3546F, -57.4607F, 1.5F, 1, 1, 7, 0.0F, false));
		gun236_r1_r1.cubeList.add(new ModelBox(gun236_r1_r1, 202, 45, -32.5546F, -57.4607F, 1.5F, 1, 1, 7, 0.0F, false));

		gun238_r1_r1 = new ModelRenderer(this);
		gun238_r1_r1.setRotationPoint(-5.5434F, 10.7026F, 0.0F);
		gun.addChild(gun238_r1_r1);
		setRotationAngle(gun238_r1_r1, 0.0F, 0.0F, 0.5623F);
		gun238_r1_r1.cubeList.add(new ModelBox(gun238_r1_r1, 202, 76, -24.6012F, -43.0459F, 1.5F, 1, 1, 7, 0.0F, false));
		gun238_r1_r1.cubeList.add(new ModelBox(gun238_r1_r1, 154, 202, -24.6012F, -43.2459F, 1.5F, 1, 1, 7, 0.0F, false));

		gun239_r1_r1 = new ModelRenderer(this);
		gun239_r1_r1.setRotationPoint(0.0F, -76.8271F, 19.9744F);
		gun.addChild(gun239_r1_r1);
		setRotationAngle(gun239_r1_r1, 2.6025F, 0.0F, 0.0F);
		gun239_r1_r1.cubeList.add(new ModelBox(gun239_r1_r1, 87, 29, -3.505F, -61.6727F, -6.6253F, 4, 2, 1, 0.0F, false));

		StandardHandguard = new ModelRenderer(this);
		StandardHandguard.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(StandardHandguard);
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 0, 117, -4.1F, -36.3F, -21.5F, 4, 4, 7, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 39, 40, -4.1F, -36.8F, -22.5F, 2, 4, 1, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 157, 67, -4.1F, -34.8F, -29.5F, 4, 2, 7, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 53, 168, -4.1F, -33.0F, -27.5F, 4, 1, 13, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 17, 175, -3.1F, -32.0F, -27.5F, 2, 1, 13, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 174, 155, -1.9F, -32.0F, -27.5F, 2, 1, 13, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 97, 29, -1.9F, -32.8F, -29.5F, 2, 1, 2, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 59, 94, -3.1F, -32.8F, -29.5F, 2, 1, 2, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 191, 38, -0.9F, -34.8F, -29.5F, 2, 2, 7, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 26, 119, -1.3F, -36.8F, -29.5F, 2, 1, 8, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 7, 40, -0.9F, -36.8F, -22.5F, 2, 4, 1, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 56, 19, -0.9F, -36.3F, -21.5F, 2, 4, 4, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 120, 17, -0.9F, -34.5F, -17.5F, 2, 2, 3, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 0, 173, -0.9F, -33.0F, -27.5F, 2, 1, 13, 0.0F, false));
		StandardHandguard.cubeList.add(new ModelBox(StandardHandguard, 77, 17, -3.7F, -36.8F, -29.5F, 4, 1, 8, 0.0F, false));

		gun118_r1_r1 = new ModelRenderer(this);
		gun118_r1_r1.setRotationPoint(0.0F, -21.2765F, -119.2115F);
		StandardHandguard.addChild(gun118_r1_r1);
		setRotationAngle(gun118_r1_r1, -2.1935F, 0.0F, 0.0F);
		gun118_r1_r1.cubeList.add(new ModelBox(gun118_r1_r1, 49, 49, 0.08F, -75.72F, -70.6476F, 1, 2, 1, 0.0F, false));

		gun153_r1_r1 = new ModelRenderer(this);
		gun153_r1_r1.setRotationPoint(0.0F, 24.1487F, -6.3375F);
		StandardHandguard.addChild(gun153_r1_r1);
		setRotationAngle(gun153_r1_r1, -0.7854F, 0.0F, 0.0F);
		gun153_r1_r1.cubeList.add(new ModelBox(gun153_r1_r1, 54, 4, -0.92F, -32.3757F, -53.8187F, 2, 1, 1, 0.0F, false));
		gun153_r1_r1.cubeList.add(new ModelBox(gun153_r1_r1, 62, 4, -4.1F, -32.3757F, -53.8187F, 2, 1, 1, 0.0F, false));

		gun194_r1_r1 = new ModelRenderer(this);
		gun194_r1_r1.setRotationPoint(0.0F, 35.87F, -17.5508F);
		StandardHandguard.addChild(gun194_r1_r1);
		setRotationAngle(gun194_r1_r1, -1.0038F, 0.0F, 0.0F);
		gun194_r1_r1.cubeList.add(new ModelBox(gun194_r1_r1, 37, 0, 0.12F, -34.856F, -63.9575F, 1, 4, 2, 0.0F, false));
		gun194_r1_r1.cubeList.add(new ModelBox(gun194_r1_r1, 15, 117, -4.1F, -34.856F, -63.9575F, 2, 4, 2, 0.0F, false));

		gun151_r1_r1 = new ModelRenderer(this);
		gun151_r1_r1.setRotationPoint(0.0F, 0.0464F, 0.0343F);
		StandardHandguard.addChild(gun151_r1_r1);
		setRotationAngle(gun151_r1_r1, -0.0349F, 0.0F, 0.0F);
		gun151_r1_r1.cubeList.add(new ModelBox(gun151_r1_r1, 105, 87, -3.7F, -36.0931F, -30.8127F, 4, 1, 8, 0.0F, false));
		gun151_r1_r1.cubeList.add(new ModelBox(gun151_r1_r1, 166, 187, -1.3F, -36.0931F, -30.8127F, 2, 1, 8, 0.0F, false));

		gun190_r1_r1 = new ModelRenderer(this);
		gun190_r1_r1.setRotationPoint(-21.2189F, -136.4297F, 0.0F);
		StandardHandguard.addChild(gun190_r1_r1);
		setRotationAngle(gun190_r1_r1, 0.0F, 0.0F, 2.9557F);
		gun190_r1_r1.cubeList.add(new ModelBox(gun190_r1_r1, 56, 40, -3.1508F, -104.0038F, -29.5F, 1, 2, 7, 0.0F, false));

		gun167_r1_r1 = new ModelRenderer(this);
		gun167_r1_r1.setRotationPoint(15.2845F, 11.8879F, 0.0F);
		StandardHandguard.addChild(gun167_r1_r1);
		setRotationAngle(gun167_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun167_r1_r1.cubeList.add(new ModelBox(gun167_r1_r1, 88, 68, 17.8922F, -45.306F, -29.5F, 1, 1, 2, 0.0F, false));

		gun169_r1_r1 = new ModelRenderer(this);
		gun169_r1_r1.setRotationPoint(77.0133F, -76.5309F, 0.0F);
		StandardHandguard.addChild(gun169_r1_r1);
		setRotationAngle(gun169_r1_r1, 0.0F, 0.0F, -2.3562F);
		gun169_r1_r1.cubeList.add(new ModelBox(gun169_r1_r1, 88, 72, 22.7567F, -86.0153F, -29.5F, 1, 1, 2, 0.0F, false));

		gun168_r1_r1 = new ModelRenderer(this);
		gun168_r1_r1.setRotationPoint(-76.5304F, -81.8421F, 0.0F);
		StandardHandguard.addChild(gun168_r1_r1);
		setRotationAngle(gun168_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun168_r1_r1.cubeList.add(new ModelBox(gun168_r1_r1, 88, 75, -20.2153F, -89.5709F, -29.5F, 1, 1, 2, 0.0F, false));

		gun170_r1_r1 = new ModelRenderer(this);
		gun170_r1_r1.setRotationPoint(69.2878F, -84.2563F, 0.0F);
		StandardHandguard.addChild(gun170_r1_r1);
		setRotationAngle(gun170_r1_r1, 0.0F, 0.0F, -2.3562F);
		gun170_r1_r1.cubeList.add(new ModelBox(gun170_r1_r1, 88, 80, 14.094F, -88.278F, -29.5F, 1, 1, 2, 0.0F, false));

		gun74_r1_r1 = new ModelRenderer(this);
		gun74_r1_r1.setRotationPoint(-74.599F, -79.9107F, 0.0F);
		StandardHandguard.addChild(gun74_r1_r1);
		setRotationAngle(gun74_r1_r1, 0.0F, 0.0F, 2.3562F);
		gun74_r1_r1.cubeList.add(new ModelBox(gun74_r1_r1, 175, 172, -19.6496F, -87.4052F, -27.5F, 1, 1, 13, 0.0F, false));

		gun75_r1_r1 = new ModelRenderer(this);
		gun75_r1_r1.setRotationPoint(75.0819F, -74.5995F, 0.0F);
		StandardHandguard.addChild(gun75_r1_r1);
		setRotationAngle(gun75_r1_r1, 0.0F, 0.0F, -2.3562F);
		gun75_r1_r1.cubeList.add(new ModelBox(gun75_r1_r1, 176, 0, 22.191F, -83.8496F, -27.5F, 1, 1, 13, 0.0F, false));

		gun73_r1_r1 = new ModelRenderer(this);
		gun73_r1_r1.setRotationPoint(67.3564F, -82.3249F, 0.0F);
		StandardHandguard.addChild(gun73_r1_r1);
		setRotationAngle(gun73_r1_r1, 0.0F, 0.0F, -2.3562F);
		gun73_r1_r1.cubeList.add(new ModelBox(gun73_r1_r1, 176, 41, 13.5283F, -86.1123F, -27.5F, 1, 1, 13, 0.0F, false));

		gun72_r1_r1 = new ModelRenderer(this);
		gun72_r1_r1.setRotationPoint(14.9532F, 11.5566F, 0.0F);
		StandardHandguard.addChild(gun72_r1_r1);
		setRotationAngle(gun72_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun72_r1_r1.cubeList.add(new ModelBox(gun72_r1_r1, 177, 83, 17.3266F, -44.2717F, -27.5F, 1, 1, 13, 0.0F, false));

		gun189_r1_r1 = new ModelRenderer(this);
		gun189_r1_r1.setRotationPoint(56.3174F, 4.3969F, 0.0F);
		StandardHandguard.addChild(gun189_r1_r1);
		setRotationAngle(gun189_r1_r1, 0.0F, 0.0F, -1.3756F);
		gun189_r1_r1.cubeList.add(new ModelBox(gun189_r1_r1, 197, 9, 26.7344F, -66.8727F, -29.5F, 2, 1, 7, 0.0F, false));
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