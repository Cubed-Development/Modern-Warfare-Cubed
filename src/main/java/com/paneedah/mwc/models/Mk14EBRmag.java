package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Mk14EBRmag extends ModelBase {
	private final ModelRenderer gun;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun104_r1;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer gun104_r2;
	private final ModelRenderer gun103_r1;
	private final ModelRenderer gun105_r2;
	private final ModelRenderer gun104_r3;
	private final ModelRenderer gun101_r1;
	private final ModelRenderer gun102_r1;
	private final ModelRenderer gun102_r2;
	private final ModelRenderer gun103_r2;
	private final ModelRenderer gun100_r1;
	private final ModelRenderer gun103_r3;
	private final ModelRenderer gun102_r3;
	private final ModelRenderer gun427_r1;
	private final ModelRenderer gun429_r1;
	private final ModelRenderer gun178;
	private final ModelRenderer gun176;
	private final ModelRenderer gun174;
	private final ModelRenderer gun172;
	private final ModelRenderer gun118;
	private final ModelRenderer gun117;
	private final ModelRenderer gun116;
	private final ModelRenderer gun115;
	private final ModelRenderer gun114;
	private final ModelRenderer gun107;
	private final ModelRenderer gun95;
	private final ModelRenderer gun94;
	private final ModelRenderer gun92;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun87;
	private final ModelRenderer gun83;
	private final ModelRenderer gun81;
	private final ModelRenderer gun79;
	private final ModelRenderer gun75;
	private final ModelRenderer bone2;
	private final ModelRenderer gun79_r1;
	private final ModelRenderer gun78_r1;
	private final ModelRenderer gun78_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun80_r2;
	private final ModelRenderer gun79_r2;
	private final ModelRenderer gun81_r2;
	private final ModelRenderer gun80_r3;
	private final ModelRenderer gun79_r3;
	private final ModelRenderer gun24;
	private final ModelRenderer gun23;
	private final ModelRenderer gun22;
	private final ModelRenderer gun20;
	private final ModelRenderer gun19;
	private final ModelRenderer defaultchassis;
	private final ModelRenderer gun272;
	private final ModelRenderer gun271;
	private final ModelRenderer gun268;
	private final ModelRenderer gun267;
	private final ModelRenderer gun266;
	private final ModelRenderer gun265;
	private final ModelRenderer gun264;
	private final ModelRenderer gun213;
	private final ModelRenderer gun214;
	private final ModelRenderer gun212;
	private final ModelRenderer gun211;
	private final ModelRenderer gun210;
	private final ModelRenderer gun202;
	private final ModelRenderer gun201;
	private final ModelRenderer gun192;
	private final ModelRenderer gun191;
	private final ModelRenderer gun190;
	private final ModelRenderer gun189;
	private final ModelRenderer gun188;
	private final ModelRenderer gun185;
	private final ModelRenderer gun184;
	private final ModelRenderer gun183;
	private final ModelRenderer gun182;
	private final ModelRenderer gun181;
	private final ModelRenderer gun170;
	private final ModelRenderer gun169;
	private final ModelRenderer gun168;
	private final ModelRenderer gun167;
	private final ModelRenderer gun59;
	private final ModelRenderer gun58;
	private final ModelRenderer gun57;
	private final ModelRenderer gun56;
	private final ModelRenderer gun55;
	private final ModelRenderer gun54;
	private final ModelRenderer gun53;
	private final ModelRenderer gun52;
	private final ModelRenderer gun51;
	private final ModelRenderer gun50;
	private final ModelRenderer gun49;
	private final ModelRenderer gun48;
	private final ModelRenderer gun36;
	private final ModelRenderer gun35;
	private final ModelRenderer gun34;
	private final ModelRenderer gun33;
	private final ModelRenderer gun32;
	private final ModelRenderer gun31;
	private final ModelRenderer gun30;
	private final ModelRenderer gun29;
	private final ModelRenderer gun28;
	private final ModelRenderer gun26;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun1;
	private final ModelRenderer gun269;
	private final ModelRenderer socomchassis;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun25_r3;
	private final ModelRenderer gun27_r2;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer gun26_r2;
	private final ModelRenderer gun25_r4;
	private final ModelRenderer gun25_r5;
	private final ModelRenderer gun24_r2;
	private final ModelRenderer gun26_r3;
	private final ModelRenderer gun24_r3;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun24_r4;
	private final ModelRenderer gun23_r3;
	private final ModelRenderer gun21_r2;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun59_r1;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun59_r2;
	private final ModelRenderer gun108;
	private final ModelRenderer gun112;
	private final ModelRenderer gun113;
	private final ModelRenderer gun119;
	private final ModelRenderer gun120;
	private final ModelRenderer gun157;
	private final ModelRenderer gun158;
	private final ModelRenderer gun165;
	private final ModelRenderer gun166;
	private final ModelRenderer gun187;
	private final ModelRenderer gun193;
	private final ModelRenderer gun194;
	private final ModelRenderer gun195;
	private final ModelRenderer gun196;
	private final ModelRenderer gun197;
	private final ModelRenderer gun198;
	private final ModelRenderer gun199;
	private final ModelRenderer gun200;
	private final ModelRenderer gun215;
	private final ModelRenderer gun216;
	private final ModelRenderer gun217;
	private final ModelRenderer gun218;
	private final ModelRenderer gun219;
	private final ModelRenderer gun220;
	private final ModelRenderer gun221;
	private final ModelRenderer gun222;
	private final ModelRenderer gun93;
	private final ModelRenderer gun96;
	private final ModelRenderer gun100;
	private final ModelRenderer gun102;
	private final ModelRenderer gun103;
	private final ModelRenderer gun104;
	private final ModelRenderer gun105;
	private final ModelRenderer gun106;
	private final ModelRenderer standard_cover;
	private final ModelRenderer gun209;
	private final ModelRenderer gun208;
	private final ModelRenderer gun207;
	private final ModelRenderer gun206;
	private final ModelRenderer gun205;
	private final ModelRenderer gun204;
	private final ModelRenderer gun203;
	private final ModelRenderer gun164;
	private final ModelRenderer gun163;
	private final ModelRenderer gun162;
	private final ModelRenderer gun161;
	private final ModelRenderer gun160;
	private final ModelRenderer gun159;
	private final ModelRenderer gun156;
	private final ModelRenderer gun154;
	private final ModelRenderer gun153;
	private final ModelRenderer gun152;
	private final ModelRenderer gun151;
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
	private final ModelRenderer gun139;
	private final ModelRenderer gun138;
	private final ModelRenderer gun137;
	private final ModelRenderer gun136;
	private final ModelRenderer gun135;
	private final ModelRenderer gun134;
	private final ModelRenderer gun133;
	private final ModelRenderer gun124;
	private final ModelRenderer gun123;
	private final ModelRenderer trit_rail_cover;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone;
	private final ModelRenderer mag;
	private final ModelRenderer mag4;
	private final ModelRenderer mag3;
	private final ModelRenderer mag1;
	private final ModelRenderer mag2;
	private final ModelRenderer action;
	private final ModelRenderer action13;
	private final ModelRenderer action12;
	private final ModelRenderer action11;
	private final ModelRenderer action10;
	private final ModelRenderer action12_r1;
	private final ModelRenderer action11_r1;
	private final ModelRenderer action9;
	private final ModelRenderer action8;
	private final ModelRenderer action7;
	private final ModelRenderer action6;
	private final ModelRenderer action5;
	private final ModelRenderer action4;
	private final ModelRenderer action3;
	private final ModelRenderer action1;
	private final ModelRenderer barrel;

	public Mk14EBRmag() {
		textureWidth = 340;
		textureHeight = 340;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 101, 146, -3.0F, -40.9F, -26.01F, 3, 1, 3, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 111, 4, -2.7F, -41.2F, -23.71F, 3, 2, 1, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 47, -3.3F, -41.2F, -23.71F, 2, 2, 1, -0.302F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 62, -3.0F, -40.48F, -25.6F, 3, 1, 3, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 82, -3.0F, -40.3F, -23.4F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 30, -2.8F, -40.1F, -24.2F, 3, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 0, -3.2F, -40.1F, -24.2F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 75, -3.0F, -31.0F, -27.3F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 68, -3.5F, -31.1F, -27.3F, 4, 1, 6, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 21, -3.3F, -39.7F, -39.0F, 1, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 49, -4.0F, -36.5F, -15.2F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 94, -3.5F, -36.5F, -16.5F, 1, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 58, -3.65F, -36.7F, -13.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 188, 258, -3.8F, -37.3F, -39.0F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 72, -3.8F, -37.6F, -15.2F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 178, 183, -3.8F, -38.1F, -32.3F, 1, 1, 18, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 47, -3.7F, -39.0F, -32.3F, 1, 2, 7, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 47, -3.65F, -38.8F, -60.0F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 82, -0.1F, -39.5F, -34.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 68, -0.15F, -40.0F, -35.0F, 1, 2, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 70, 0.0F, -39.0F, -26.5F, 1, 2, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 76, 0.3F, -37.6F, -26.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 47, -2.5F, -40.3F, -39.0F, 2, 4, 3, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 82, -0.1F, -37.6F, -29.5F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 140, -0.1F, -38.3F, -38.5F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 151, -0.1F, -37.0F, -38.5F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 140, -0.3F, -40.0F, -38.5F, 1, 1, 6, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 29, -0.3F, -38.2F, -27.5F, 1, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 94, -0.3F, -39.3F, -38.5F, 1, 4, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 23, -0.5F, -39.1F, -27.5F, 1, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 124, 54, -3.5F, -39.8F, -18.5F, 4, 5, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -2.0F, -30.8F, -19.5F, 1, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 145, 146, -3.0F, -26.95F, -16.05F, 3, 1, 3, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(0.5F, -38.35F, -11.1F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -1.2217F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 102, 62, -4.0F, 0.0F, 0.0F, 4, 1, 3, -0.002F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(0.5F, -38.7F, -16.1F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.0698F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 73, 75, -4.0F, 0.0F, 0.0F, 4, 2, 5, -0.001F, false));

		gun104_r1 = new ModelRenderer(this);
		gun104_r1.setRotationPoint(-3.55F, -36.8F, -75.9F);
		gun.addChild(gun104_r1);
		setRotationAngle(gun104_r1, 0.0F, 0.0F, 0.2094F);
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 41, 47, 0.1F, -2.1F, -7.0F, 1, 2, 1, 0.0F, false));
		gun104_r1.cubeList.add(new ModelBox(gun104_r1, 192, 44, 0.35F, -2.05F, -7.1F, 2, 2, 34, -0.002F, false));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(-1.5F, -39.6F, -75.9F);
		gun.addChild(gun105_r1);
		setRotationAngle(gun105_r1, 0.0F, 0.0F, -0.4363F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 67, 26, -1.65F, 0.0F, -7.0F, 1, 1, 1, -0.001F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 66, 58, -1.0F, 0.0F, -7.0F, 1, 1, 1, 0.0F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 94, -1.0F, 0.0F, 26.9F, 1, 1, 7, 0.0F, false));
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 78, -1.65F, 0.0F, 26.9F, 1, 1, 7, -0.001F, false));

		gun104_r2 = new ModelRenderer(this);
		gun104_r2.setRotationPoint(-1.5F, -39.6F, -75.9F);
		gun.addChild(gun104_r2);
		setRotationAngle(gun104_r2, 0.0F, 0.0F, 0.4363F);
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 41, 63, 0.65F, 0.0F, -7.0F, 1, 1, 1, -0.001F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 29, 54, 0.0F, 0.0F, -7.0F, 1, 1, 1, 0.0F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 23, 81, 0.65F, 0.0F, 26.9F, 1, 1, 7, -0.001F, false));
		gun104_r2.cubeList.add(new ModelBox(gun104_r2, 98, 93, 0.0F, 0.0F, 26.9F, 1, 1, 7, 0.0F, false));

		gun103_r1 = new ModelRenderer(this);
		gun103_r1.setRotationPoint(0.55F, -36.8F, -75.9F);
		gun.addChild(gun103_r1);
		setRotationAngle(gun103_r1, 0.0F, 0.0F, -0.2094F);
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 35, 47, -1.1F, -2.1F, -7.0F, 1, 2, 1, 0.0F, false));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 219, 177, -2.35F, -2.05F, -7.1F, 2, 2, 34, -0.001F, false));
		gun103_r1.cubeList.add(new ModelBox(gun103_r1, 73, 29, -1.1F, -2.1F, 26.9F, 1, 2, 7, 0.0F, false));

		gun105_r2 = new ModelRenderer(this);
		gun105_r2.setRotationPoint(-1.5F, -39.35F, -49.0F);
		gun.addChild(gun105_r2);
		setRotationAngle(gun105_r2, 0.0F, 0.0F, -0.4363F);
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 187, 223, -1.35F, 0.0F, -34.0F, 1, 1, 34, -0.001F, false));
		gun105_r2.cubeList.add(new ModelBox(gun105_r2, 226, 129, -1.0F, 0.0F, -34.0F, 1, 1, 34, 0.0F, false));

		gun104_r3 = new ModelRenderer(this);
		gun104_r3.setRotationPoint(-1.5F, -39.35F, -49.0F);
		gun.addChild(gun104_r3);
		setRotationAngle(gun104_r3, 0.0F, 0.0F, 0.4363F);
		gun104_r3.cubeList.add(new ModelBox(gun104_r3, 224, 213, 0.35F, 0.0F, -34.0F, 1, 1, 34, -0.001F, false));
		gun104_r3.cubeList.add(new ModelBox(gun104_r3, 54, 227, 0.0F, 0.0F, -34.0F, 1, 1, 34, 0.0F, false));

		gun101_r1 = new ModelRenderer(this);
		gun101_r1.setRotationPoint(-1.5F, -40.1F, -61.0F);
		gun.addChild(gun101_r1);
		setRotationAngle(gun101_r1, 0.0F, 0.0F, -0.4363F);
		gun101_r1.cubeList.add(new ModelBox(gun101_r1, 61, 26, -2.0F, 0.0F, -1.0F, 2, 1, 2, 0.0F, false));
		gun101_r1.cubeList.add(new ModelBox(gun101_r1, 23, 94, -2.0F, 0.0F, 19.0F, 2, 1, 3, -0.001F, false));

		gun102_r1 = new ModelRenderer(this);
		gun102_r1.setRotationPoint(-1.5F, -40.1F, -61.0F);
		gun.addChild(gun102_r1);
		setRotationAngle(gun102_r1, 0.0F, 0.0F, 0.4363F);
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 23, 54, 0.0F, 0.0F, -1.0F, 2, 1, 2, -0.001F, false));
		gun102_r1.cubeList.add(new ModelBox(gun102_r1, 84, 82, 0.0F, 0.0F, 19.0F, 2, 1, 3, -0.001F, false));

		gun102_r2 = new ModelRenderer(this);
		gun102_r2.setRotationPoint(0.8F, -37.2F, -61.0F);
		gun.addChild(gun102_r2);
		setRotationAngle(gun102_r2, 0.0F, 0.0F, -0.2094F);
		gun102_r2.cubeList.add(new ModelBox(gun102_r2, 38, 11, -1.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, false));
		gun102_r2.cubeList.add(new ModelBox(gun102_r2, 12, 70, -1.0F, -2.0F, 19.0F, 1, 2, 3, -0.001F, false));

		gun103_r2 = new ModelRenderer(this);
		gun103_r2.setRotationPoint(-3.8F, -37.2F, -61.0F);
		gun.addChild(gun103_r2);
		setRotationAngle(gun103_r2, 0.0F, 0.0F, 0.2094F);
		gun103_r2.cubeList.add(new ModelBox(gun103_r2, 14, 35, 0.0F, -2.0F, -1.0F, 1, 2, 2, -0.001F, false));
		gun103_r2.cubeList.add(new ModelBox(gun103_r2, 23, 98, 0.0F, -2.0F, 19.0F, 1, 1, 3, -0.001F, false));

		gun100_r1 = new ModelRenderer(this);
		gun100_r1.setRotationPoint(-3.55F, -38.8F, -25.5F);
		gun.addChild(gun100_r1);
		setRotationAngle(gun100_r1, -0.0698F, 0.0F, 0.0F);
		gun100_r1.cubeList.add(new ModelBox(gun100_r1, 51, 21, -0.15F, -0.2F, -0.2F, 1, 2, 8, -0.201F, false));

		gun103_r3 = new ModelRenderer(this);
		gun103_r3.setRotationPoint(-3.8F, -37.6F, -14.2F);
		gun.addChild(gun103_r3);
		setRotationAngle(gun103_r3, 0.925F, 0.0F, 0.0F);
		gun103_r3.cubeList.add(new ModelBox(gun103_r3, 67, 63, -0.1F, -0.1F, -0.9F, 1, 1, 1, -0.102F, false));

		gun102_r3 = new ModelRenderer(this);
		gun102_r3.setRotationPoint(-3.8F, -37.6F, -15.2F);
		gun.addChild(gun102_r3);
		setRotationAngle(gun102_r3, -0.925F, 0.0F, 0.0F);
		gun102_r3.cubeList.add(new ModelBox(gun102_r3, 29, 70, -0.1F, -0.1F, -0.1F, 1, 1, 1, -0.101F, false));

		gun427_r1 = new ModelRenderer(this);
		gun427_r1.setRotationPoint(0.0F, -40.3F, -22.6F);
		gun.addChild(gun427_r1);
		setRotationAngle(gun427_r1, -1.4312F, 0.0F, 0.0F);
		gun427_r1.cubeList.add(new ModelBox(gun427_r1, 63, 75, -3.0F, -4.2F, 0.0F, 3, 4, 1, -0.001F, false));

		gun429_r1 = new ModelRenderer(this);
		gun429_r1.setRotationPoint(0.2F, -40.0F, -25.8F);
		gun.addChild(gun429_r1);
		setRotationAngle(gun429_r1, -0.7854F, 0.0F, 0.0F);
		gun429_r1.cubeList.add(new ModelBox(gun429_r1, 73, 2, -3.3F, -0.72F, -0.28F, 1, 1, 1, -0.202F, false));
		gun429_r1.cubeList.add(new ModelBox(gun429_r1, 51, 27, -3.1F, -0.72F, -0.28F, 3, 1, 1, -0.203F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-2.0F, -28.15F, -13.9F);
		gun.addChild(gun178);
		setRotationAngle(gun178, -2.0076F, 0.0F, 0.0F);
		gun178.cubeList.add(new ModelBox(gun178, 111, 70, 0.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-2.0F, -31.0F, -14.1F);
		gun.addChild(gun176);
		setRotationAngle(gun176, -1.2641F, 0.0F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 111, 75, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(-2.5F, -30.3F, -26.5F);
		gun.addChild(gun174);
		setRotationAngle(gun174, 0.3346F, 0.0F, 0.0F);
		gun174.cubeList.add(new ModelBox(gun174, 65, 31, 0.0F, 0.5583F, 1.6057F, 2, 3, 1, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(-3.5F, -30.1F, -27.0F);
		gun.addChild(gun172);
		setRotationAngle(gun172, 2.9371F, 0.0F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 226, 151, 0.0F, 0.0F, 0.0F, 4, 1, 10, 0.001F, false));

		gun118 = new ModelRenderer(this);
		gun118.setRotationPoint(-2.5F, -40.3F, -39.0F);
		gun.addChild(gun118);
		setRotationAngle(gun118, 0.0F, 0.0F, 0.8976F);
		gun118.cubeList.add(new ModelBox(gun118, 61, 107, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.001F, false));

		gun117 = new ModelRenderer(this);
		gun117.setRotationPoint(0.7F, -40.0F, -38.0F);
		gun.addChild(gun117);
		setRotationAngle(gun117, 0.0F, 0.0F, 1.8326F);
		

		gun116 = new ModelRenderer(this);
		gun116.setRotationPoint(0.7F, -40.0F, -38.5F);
		gun.addChild(gun116);
		setRotationAngle(gun116, 0.0F, 0.0F, 1.8326F);
		

		gun115 = new ModelRenderer(this);
		gun115.setRotationPoint(-0.5F, -40.3F, -38.5F);
		gun.addChild(gun115);
		setRotationAngle(gun115, 0.0F, 0.0F, 0.2244F);
		gun115.cubeList.add(new ModelBox(gun115, 73, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun114 = new ModelRenderer(this);
		gun114.setRotationPoint(-0.5F, -40.3F, -38.0F);
		gun.addChild(gun114);
		setRotationAngle(gun114, 0.0F, 0.0F, 0.2244F);
		gun114.cubeList.add(new ModelBox(gun114, 115, 50, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		gun107 = new ModelRenderer(this);
		gun107.setRotationPoint(-5.0F, -37.0F, -15.5F);
		gun.addChild(gun107);
		setRotationAngle(gun107, 0.2618F, 0.0F, 0.0F);
		gun107.cubeList.add(new ModelBox(gun107, 66, 55, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-0.15F, -40.0F, -35.0F);
		gun.addChild(gun95);
		setRotationAngle(gun95, -0.2603F, 0.0F, 0.0F);
		gun95.cubeList.add(new ModelBox(gun95, 67, 13, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-0.15F, -40.0F, -33.0F);
		gun.addChild(gun94);
		setRotationAngle(gun94, -1.3384F, 0.0F, 0.0F);
		gun94.cubeList.add(new ModelBox(gun94, 115, 68, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(1.3F, -37.8F, -26.5F);
		gun.addChild(gun92);
		setRotationAngle(gun92, 0.0F, 0.0F, 2.6025F);
		gun92.cubeList.add(new ModelBox(gun92, 115, 71, 0.1027F, -0.1716F, 0.0F, 1, 1, 2, -0.002F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(0.5F, -38.2F, -27.5F);
		gun.addChild(gun89);
		setRotationAngle(gun89, 0.0F, 0.0F, 0.8551F);
		gun89.cubeList.add(new ModelBox(gun89, 35, 75, 0.1509F, 0.1312F, 0.0F, 1, 1, 4, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(0.9F, -38.3F, -38.5F);
		gun.addChild(gun88);
		setRotationAngle(gun88, 0.0F, -2.0442F, 0.0F);
		gun88.cubeList.add(new ModelBox(gun88, 35, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(0.7F, -40.0F, -38.5F);
		gun.addChild(gun87);
		setRotationAngle(gun87, 0.0F, -2.0442F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 41, 0, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun83 = new ModelRenderer(this);
		gun83.setRotationPoint(0.9F, -38.3F, -38.5F);
		gun.addChild(gun83);
		setRotationAngle(gun83, 0.0F, 0.0F, 2.8256F);
		gun83.cubeList.add(new ModelBox(gun83, 45, 151, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun81 = new ModelRenderer(this);
		gun81.setRotationPoint(-0.3F, -40.0F, -32.5F);
		gun.addChild(gun81);
		setRotationAngle(gun81, -0.2557F, 0.0F, 0.0F);
		gun81.cubeList.add(new ModelBox(gun81, 13, 108, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.002F, false));

		gun79 = new ModelRenderer(this);
		gun79.setRotationPoint(-0.3F, -39.6F, -27.5F);
		gun.addChild(gun79);
		setRotationAngle(gun79, -1.3756F, 0.0F, 0.0F);
		gun79.cubeList.add(new ModelBox(gun79, 115, 79, 0.0F, 0.0582F, 0.2943F, 1, 1, 2, -0.001F, false));

		gun75 = new ModelRenderer(this);
		gun75.setRotationPoint(-3.5F, -39.8F, -15.5F);
		gun.addChild(gun75);
		setRotationAngle(gun75, -1.041F, 0.0F, 0.0F);
		gun75.cubeList.add(new ModelBox(gun75, 84, 102, 0.0F, 0.0F, 0.0F, 4, 1, 2, -0.002F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -39.5F, -15.5F);
		gun.addChild(bone2);
		

		gun79_r1 = new ModelRenderer(this);
		gun79_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(gun79_r1);
		setRotationAngle(gun79_r1, -0.0622F, 0.0412F, 0.5906F);
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 9, 94, 0.44F, 0.0F, -0.55F, 1, 1, 5, -0.001F, false));
		gun79_r1.cubeList.add(new ModelBox(gun79_r1, 9, 102, 0.0F, 0.0F, -0.55F, 1, 1, 5, 0.0F, false));

		gun78_r1 = new ModelRenderer(this);
		gun78_r1.setRotationPoint(-1.6F, 0.0F, 0.0F);
		bone2.addChild(gun78_r1);
		setRotationAngle(gun78_r1, -0.0622F, -0.0412F, -0.5906F);
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 32, 105, -1.44F, 0.0F, -0.55F, 1, 1, 5, -0.001F, false));
		gun78_r1.cubeList.add(new ModelBox(gun78_r1, 107, 93, -1.0F, 0.0F, -0.55F, 1, 1, 5, 0.0F, false));

		gun78_r2 = new ModelRenderer(this);
		gun78_r2.setRotationPoint(0.2F, 0.0F, 0.1F);
		bone2.addChild(gun78_r2);
		setRotationAngle(gun78_r2, -0.0746F, 0.0006F, 0.0F);
		gun78_r2.cubeList.add(new ModelBox(gun78_r2, 145, 93, -2.0F, -0.2F, -0.4F, 2, 1, 5, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-0.7F, -39.1F, -10.99F);
		gun.addChild(bone7);
		setRotationAngle(bone7, -1.1519F, 0.0F, 0.0F);
		

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun80_r1);
		setRotationAngle(gun80_r1, -0.0808F, -0.4835F, 0.3336F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 51, 35, -2.8097F, 0.4727F, 1.0227F, 2, 1, 1, -0.401F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 39, 38, -2.5097F, 0.4727F, 1.4027F, 2, 1, 1, -0.401F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 14, 39, -2.6097F, 0.4727F, 1.2127F, 2, 1, 1, -0.402F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun81_r1);
		setRotationAngle(gun81_r1, -0.0715F, 0.0212F, 0.2944F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 39, 65, -3.2703F, 0.4727F, -0.1686F, 1, 1, 2, -0.403F, false));

		gun80_r2 = new ModelRenderer(this);
		gun80_r2.setRotationPoint(3.0F, 0.0F, -0.01F);
		bone7.addChild(gun80_r2);
		setRotationAngle(gun80_r2, -0.0715F, 0.0212F, 0.2944F);
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 35, 52, -2.6303F, 0.8727F, 0.7314F, 1, 1, 4, 0.0F, false));
		gun80_r2.cubeList.add(new ModelBox(gun80_r2, 35, 47, -2.8703F, 0.8727F, 0.7314F, 1, 1, 4, 0.001F, false));

		gun79_r2 = new ModelRenderer(this);
		gun79_r2.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun79_r2);
		setRotationAngle(gun79_r2, -0.0715F, -0.0212F, -0.2944F);
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 35, 58, -1.24F, 0.0F, 0.73F, 1, 1, 4, 0.0F, false));
		gun79_r2.cubeList.add(new ModelBox(gun79_r2, 61, 13, -1.0F, 0.0F, 0.73F, 1, 1, 4, 0.001F, false));

		gun81_r2 = new ModelRenderer(this);
		gun81_r2.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun81_r2);
		setRotationAngle(gun81_r2, -0.0808F, 0.4835F, -0.3336F);
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 23, 62, -2.0F, -0.4F, 0.01F, 2, 1, 1, -0.401F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 65, 35, -1.9F, -0.4F, -0.18F, 2, 1, 1, -0.402F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 51, 72, -1.7F, -0.4F, -0.37F, 2, 1, 1, -0.401F, false));

		gun80_r3 = new ModelRenderer(this);
		gun80_r3.setRotationPoint(-1.6F, 0.0F, -0.01F);
		bone7.addChild(gun80_r3);
		setRotationAngle(gun80_r3, -0.0715F, -0.0212F, -0.2944F);
		gun80_r3.cubeList.add(new ModelBox(gun80_r3, 51, 75, -0.6F, -0.4F, -0.17F, 1, 1, 2, -0.403F, false));

		gun79_r3 = new ModelRenderer(this);
		gun79_r3.setRotationPoint(0.2F, 0.0F, 0.09F);
		bone7.addChild(gun79_r3);
		setRotationAngle(gun79_r3, -0.0746F, 0.0006F, 0.0F);
		gun79_r3.cubeList.add(new ModelBox(gun79_r3, 81, 129, -2.0F, -0.2F, -0.37F, 2, 1, 5, -0.2F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.0F, -29.3F, -18.0F);
		gun.addChild(gun24);
		setRotationAngle(gun24, 2.7338F, 0.0F, 0.0F);
		gun24.cubeList.add(new ModelBox(gun24, 124, 146, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-3.0F, -27.3F, -17.5F);
		gun.addChild(gun23);
		setRotationAngle(gun23, 1.8961F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 98, 109, 0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, false));

		gun22 = new ModelRenderer(this);
		gun22.setRotationPoint(-3.0F, -25.95F, -16.05F);
		gun.addChild(gun22);
		setRotationAngle(gun22, 2.4166F, 0.0F, 0.0F);
		gun22.cubeList.add(new ModelBox(gun22, 23, 30, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-3.0F, -27.3F, -11.6F);
		gun.addChild(gun20);
		setRotationAngle(gun20, -2.3794F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 35, 7, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-3.0F, -30.2F, -10.7F);
		gun.addChild(gun19);
		setRotationAngle(gun19, -1.8961F, 0.0F, 0.0F);
		gun19.cubeList.add(new ModelBox(gun19, 7, 147, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, false));

		defaultchassis = new ModelRenderer(this);
		defaultchassis.setRotationPoint(0.0F, 24.0F, 0.0F);
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 78, 0.8F, -34.5F, 15.5F, 1, 6, 1, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 23, 81, 0.8F, -34.5F, 13.0F, 1, 6, 1, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 94, -4.8F, -34.5F, 13.0F, 1, 6, 1, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 98, 92, -4.8F, -34.5F, 15.5F, 1, 6, 1, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 73, 63, -5.0F, -33.5F, 12.5F, 7, 2, 2, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 86, -5.0F, -33.5F, 15.0F, 7, 2, 2, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 192, 59, -4.51F, -31.5F, 9.3F, 6, 5, 10, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 147, 0, -2.5F, -37.0F, 0.3F, 2, 1, 19, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 147, 46, -4.5F, -34.5F, 0.3F, 1, 3, 19, 0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 147, 20, 0.5F, -34.5F, 0.3F, 1, 3, 19, 0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 51, 82, -3.5F, -18.6F, 26.7F, 4, 1, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 0, -4.0F, -33.6F, 26.7F, 5, 15, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 124, 14, -3.0F, -34.6F, 26.7F, 3, 1, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 232, 0, -3.0F, -34.5F, -0.3F, 3, 2, 27, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 45, 204, -4.0F, -31.75F, 18.7F, 5, 13, 8, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 23, 34, -4.0F, -32.2F, -2.7F, 5, 2, 6, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 90, 227, -3.5F, -23.75F, 18.7F, 4, 6, 8, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 230, 80, -4.0F, -33.5F, 0.7F, 5, 2, 26, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 28, 259, -4.0F, -37.2F, -82.0F, 1, 2, 22, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 71, 94, 0.0F, -35.4F, -27.0F, 1, 2, 3, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 145, 121, -4.0F, -36.7F, -27.0F, 4, 3, 3, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 159, 227, -4.0F, -36.7F, -24.0F, 5, 3, 8, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 73, 21, -3.01F, -36.7F, -16.5F, 4, 3, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 111, 0, -4.0F, -35.2F, -16.5F, 1, 1, 3, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 102, 37, -4.01F, -34.0F, -30.0F, 5, 1, 3, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 73, 68, -4.0F, -36.2F, -13.5F, 1, 2, 2, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 187, 227, -4.0F, -36.7F, -35.0F, 5, 3, 8, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 23, 23, 0.0F, -36.7F, -39.0F, 1, 3, 4, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 82, 47, -4.0F, -36.3F, -40.0F, 1, 2, 5, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 0, 47, -3.0F, -35.2F, -82.0F, 3, 2, 45, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 257, 164, -4.0F, -34.2F, -27.0F, 5, 4, 25, 0.0F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 47, 132, -3.51F, -16.4F, -4.7F, 4, 1, 3, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 121, 111, -3.5F, -16.4F, -1.7F, 4, 1, 2, -0.001F, false));
		defaultchassis.cubeList.add(new ModelBox(defaultchassis, 124, 79, -3.51F, -18.1F, -5.7F, 4, 2, 4, 0.0F, false));

		gun272 = new ModelRenderer(this);
		gun272.setRotationPoint(-4.5F, -31.5F, 0.3F);
		defaultchassis.addChild(gun272);
		setRotationAngle(gun272, 1.3013F, 0.0F, 0.0F);
		gun272.cubeList.add(new ModelBox(gun272, 0, 47, 0.01F, 0.0F, 0.0F, 6, 10, 3, 0.0F, false));

		gun271 = new ModelRenderer(this);
		gun271.setRotationPoint(-4.5F, -26.5F, 9.3F);
		defaultchassis.addChild(gun271);
		setRotationAngle(gun271, 2.3794F, 0.0F, 0.0F);
		gun271.cubeList.add(new ModelBox(gun271, 226, 140, -0.015F, 0.0F, 0.0F, 6, 3, 8, 0.0F, false));

		gun268 = new ModelRenderer(this);
		gun268.setRotationPoint(-2.5F, -37.0F, 0.3F);
		defaultchassis.addChild(gun268);
		setRotationAngle(gun268, 0.0F, 0.0F, 1.041F);
		gun268.cubeList.add(new ModelBox(gun268, 90, 203, 0.0F, 0.0F, 0.0F, 1, 1, 19, -0.001F, false));

		gun267 = new ModelRenderer(this);
		gun267.setRotationPoint(-4.5F, -34.5F, 0.3F);
		defaultchassis.addChild(gun267);
		setRotationAngle(gun267, 0.0F, 0.0F, -1.1154F);
		gun267.cubeList.add(new ModelBox(gun267, 145, 113, 0.0F, 0.0F, 0.0F, 2, 1, 19, 0.0F, false));

		gun266 = new ModelRenderer(this);
		gun266.setRotationPoint(-0.3F, -36.85F, 0.3F);
		defaultchassis.addChild(gun266);
		setRotationAngle(gun266, 0.0F, 0.0F, 0.632F);
		gun266.cubeList.add(new ModelBox(gun266, 134, 203, 0.0F, 0.0F, 0.0F, 1, 1, 19, -0.002F, false));

		gun265 = new ModelRenderer(this);
		gun265.setRotationPoint(-0.5F, -37.0F, 0.3F);
		defaultchassis.addChild(gun265);
		setRotationAngle(gun265, 0.0F, 0.0F, 0.632F);
		gun265.cubeList.add(new ModelBox(gun265, 0, 204, 0.0F, 0.0F, 0.0F, 1, 1, 19, -0.001F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(1.5F, -34.5F, 0.3F);
		defaultchassis.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 2.6397F);
		gun264.cubeList.add(new ModelBox(gun264, 0, 162, 0.0F, 0.0F, 0.0F, 1, 2, 19, 0.0F, false));

		gun213 = new ModelRenderer(this);
		gun213.setRotationPoint(-3.6F, -35.2F, -83.0F);
		defaultchassis.addChild(gun213);
		setRotationAngle(gun213, 0.0F, 0.0F, -0.7064F);
		gun213.cubeList.add(new ModelBox(gun213, 66, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun214 = new ModelRenderer(this);
		gun214.setRotationPoint(0.6F, -35.2F, -83.0F);
		defaultchassis.addChild(gun214);
		setRotationAngle(gun214, 0.0F, 0.0F, 2.3051F);
		gun214.cubeList.add(new ModelBox(gun214, 64, 85, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		gun212 = new ModelRenderer(this);
		gun212.setRotationPoint(-2.5F, -35.8F, -83.0F);
		defaultchassis.addChild(gun212);
		gun212.cubeList.add(new ModelBox(gun212, 111, 57, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun211 = new ModelRenderer(this);
		gun211.setRotationPoint(-1.4F, -37.2F, -83.0F);
		defaultchassis.addChild(gun211);
		gun211.cubeList.add(new ModelBox(gun211, 61, 111, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.001F, false));

		gun210 = new ModelRenderer(this);
		gun210.setRotationPoint(-3.6F, -37.2F, -83.0F);
		defaultchassis.addChild(gun210);
		gun210.cubeList.add(new ModelBox(gun210, 111, 21, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.001F, false));

		gun202 = new ModelRenderer(this);
		gun202.setRotationPoint(-3.0F, -19.4F, 14.0F);
		defaultchassis.addChild(gun202);
		setRotationAngle(gun202, -0.7436F, 0.0F, 0.0F);
		gun202.cubeList.add(new ModelBox(gun202, 23, 89, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun201 = new ModelRenderer(this);
		gun201.setRotationPoint(-3.0F, -18.85F, 13.9F);
		defaultchassis.addChild(gun201);
		setRotationAngle(gun201, 1.3384F, 0.0F, 0.0F);
		gun201.cubeList.add(new ModelBox(gun201, 86, 75, 0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		gun192 = new ModelRenderer(this);
		gun192.setRotationPoint(-4.0F, -20.1F, 12.9F);
		defaultchassis.addChild(gun192);
		setRotationAngle(gun192, 1.3384F, 0.0F, 0.0F);
		gun192.cubeList.add(new ModelBox(gun192, 185, 156, 0.01F, 0.0F, 0.0F, 5, 6, 13, 0.0F, false));

		gun191 = new ModelRenderer(this);
		gun191.setRotationPoint(-4.0F, -22.5F, 10.6F);
		defaultchassis.addChild(gun191);
		setRotationAngle(gun191, 0.8179F, 0.0F, 0.0F);
		gun191.cubeList.add(new ModelBox(gun191, 73, 8, 0.0F, 0.0F, 0.0F, 5, 4, 4, -0.001F, false));

		gun190 = new ModelRenderer(this);
		gun190.setRotationPoint(-4.0F, -26.8F, 7.7F);
		defaultchassis.addChild(gun190);
		setRotationAngle(gun190, 0.5949F, 0.0F, 0.0F);
		gun190.cubeList.add(new ModelBox(gun190, 178, 202, 0.0F, 0.0F, 0.0F, 5, 6, 10, 0.0F, false));

		gun189 = new ModelRenderer(this);
		gun189.setRotationPoint(-4.0F, -29.45F, 4.5F);
		defaultchassis.addChild(gun189);
		setRotationAngle(gun189, 0.8551F, 0.0F, 0.0F);
		gun189.cubeList.add(new ModelBox(gun189, 23, 11, 0.0F, 0.0F, 0.0F, 5, 5, 5, -0.001F, false));

		gun188 = new ModelRenderer(this);
		gun188.setRotationPoint(-4.0F, -31.5F, 0.5F);
		defaultchassis.addChild(gun188);
		setRotationAngle(gun188, 1.0782F, 0.0F, 0.0F);
		gun188.cubeList.add(new ModelBox(gun188, 23, 127, 0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F, false));

		gun185 = new ModelRenderer(this);
		gun185.setRotationPoint(-3.5F, -19.2F, 12.9F);
		defaultchassis.addChild(gun185);
		setRotationAngle(gun185, 1.3384F, 0.0F, 0.0F);
		gun185.cubeList.add(new ModelBox(gun185, 35, 23, 0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, false));

		gun184 = new ModelRenderer(this);
		gun184.setRotationPoint(-3.5F, -21.9F, 10.0F);
		defaultchassis.addChild(gun184);
		setRotationAngle(gun184, 0.8179F, 0.0F, 0.0F);
		gun184.cubeList.add(new ModelBox(gun184, 23, 75, 0.0F, 0.0F, 0.0F, 4, 4, 1, -0.001F, false));

		gun183 = new ModelRenderer(this);
		gun183.setRotationPoint(-3.5F, -26.8F, 6.3F);
		defaultchassis.addChild(gun183);
		setRotationAngle(gun183, 0.6692F, 0.0F, 0.0F);
		gun183.cubeList.add(new ModelBox(gun183, 145, 113, 0.0F, 0.0F, 0.0F, 4, 6, 2, 0.0F, false));

		gun182 = new ModelRenderer(this);
		gun182.setRotationPoint(-3.5F, -29.4F, 2.5F);
		defaultchassis.addChild(gun182);
		setRotationAngle(gun182, 0.9666F, 0.0F, 0.0F);
		gun182.cubeList.add(new ModelBox(gun182, 147, 26, 0.0F, 1.0F, 0.0F, 4, 4, 2, -0.001F, false));

		gun181 = new ModelRenderer(this);
		gun181.setRotationPoint(-3.5F, -30.65F, -0.5F);
		defaultchassis.addChild(gun181);
		setRotationAngle(gun181, 1.1154F, 0.0F, 0.0F);
		gun181.cubeList.add(new ModelBox(gun181, 32, 81, 0.0F, 0.0F, 0.0F, 4, 5, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.0F, -33.1F, -72.2F);
		defaultchassis.addChild(gun170);
		setRotationAngle(gun170, 0.632F, 0.0F, 0.0F);
		gun170.cubeList.add(new ModelBox(gun170, 23, 102, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun169 = new ModelRenderer(this);
		gun169.setRotationPoint(-3.0F, -35.1F, -76.0F);
		defaultchassis.addChild(gun169);
		gun169.cubeList.add(new ModelBox(gun169, 47, 118, 0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun168 = new ModelRenderer(this);
		gun168.setRotationPoint(-4.0F, -36.9F, -60.0F);
		defaultchassis.addChild(gun168);
		gun168.cubeList.add(new ModelBox(gun168, 98, 115, 0.0F, 0.0F, 0.0F, 1, 1, 21, -0.002F, false));

		gun167 = new ModelRenderer(this);
		gun167.setRotationPoint(-4.0F, -36.2F, -60.0F);
		defaultchassis.addChild(gun167);
		gun167.cubeList.add(new ModelBox(gun167, 0, 116, 0.0F, 0.0F, 0.0F, 1, 1, 21, -0.001F, false));

		gun59 = new ModelRenderer(this);
		gun59.setRotationPoint(-3.0F, -35.1F, -1.7F);
		defaultchassis.addChild(gun59);
		setRotationAngle(gun59, -0.2603F, 0.0F, 0.0F);
		gun59.cubeList.add(new ModelBox(gun59, 98, 131, 0.0F, 0.0F, 0.0F, 3, 2, 3, -0.001F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-3.0F, -36.37F, -8.55F);
		defaultchassis.addChild(gun58);
		setRotationAngle(gun58, -0.1859F, 0.0F, 0.0F);
		gun58.cubeList.add(new ModelBox(gun58, 51, 47, 0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, false));

		gun57 = new ModelRenderer(this);
		gun57.setRotationPoint(-3.5F, -36.7F, -11.5F);
		defaultchassis.addChild(gun57);
		setRotationAngle(gun57, -0.1115F, 0.0F, 0.0F);
		gun57.cubeList.add(new ModelBox(gun57, 102, 83, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-4.0F, -34.45F, -1.8F);
		defaultchassis.addChild(gun56);
		setRotationAngle(gun56, -0.409F, 0.0F, 0.0F);
		gun56.cubeList.add(new ModelBox(gun56, 124, 67, -0.01F, 0.0F, 0.0F, 5, 3, 3, 0.0F, false));

		gun55 = new ModelRenderer(this);
		gun55.setRotationPoint(-4.0F, -36.25F, -8.55F);
		defaultchassis.addChild(gun55);
		setRotationAngle(gun55, -0.2603F, 0.0F, 0.0F);
		gun55.cubeList.add(new ModelBox(gun55, 61, 228, -0.01F, 0.0F, 0.0F, 5, 3, 7, 0.0F, false));

		gun54 = new ModelRenderer(this);
		gun54.setRotationPoint(-4.0F, -36.7F, -11.5F);
		defaultchassis.addChild(gun54);
		setRotationAngle(gun54, -0.1487F, 0.0F, 0.0F);
		gun54.cubeList.add(new ModelBox(gun54, 124, 73, 0.01F, 0.0F, 0.0F, 5, 3, 3, 0.0F, false));

		gun53 = new ModelRenderer(this);
		gun53.setRotationPoint(-4.0F, -36.2F, -13.5F);
		defaultchassis.addChild(gun53);
		setRotationAngle(gun53, -0.4461F, 0.0F, 0.0F);
		gun53.cubeList.add(new ModelBox(gun53, 67, 21, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		gun52 = new ModelRenderer(this);
		gun52.setRotationPoint(-4.0F, -36.7F, -16.0F);
		defaultchassis.addChild(gun52);
		setRotationAngle(gun52, -1.2269F, 0.0F, 0.0F);
		gun52.cubeList.add(new ModelBox(gun52, 109, 115, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun51 = new ModelRenderer(this);
		gun51.setRotationPoint(-4.0F, -36.7F, -35.0F);
		defaultchassis.addChild(gun51);
		setRotationAngle(gun51, -1.3013F, 0.0F, 0.0F);
		gun51.cubeList.add(new ModelBox(gun51, 17, 70, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun50 = new ModelRenderer(this);
		gun50.setRotationPoint(0.0F, -36.7F, -24.0F);
		defaultchassis.addChild(gun50);
		setRotationAngle(gun50, -0.2231F, 0.0F, 0.0F);
		gun50.cubeList.add(new ModelBox(gun50, 23, 70, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		gun49 = new ModelRenderer(this);
		gun49.setRotationPoint(0.0F, -36.7F, -27.0F);
		defaultchassis.addChild(gun49);
		setRotationAngle(gun49, -1.3756F, 0.0F, 0.0F);
		gun49.cubeList.add(new ModelBox(gun49, 116, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun48 = new ModelRenderer(this);
		gun48.setRotationPoint(1.0F, -35.4F, -27.0F);
		defaultchassis.addChild(gun48);
		setRotationAngle(gun48, 0.0F, 0.0F, 2.8256F);
		gun48.cubeList.add(new ModelBox(gun48, 108, 109, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(1.0F, -35.2F, -82.0F);
		defaultchassis.addChild(gun36);
		setRotationAngle(gun36, 0.0F, 0.0F, 1.9333F);
		gun36.cubeList.add(new ModelBox(gun36, 90, 183, 0.0F, 0.0F, 0.0F, 1, 1, 42, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(0.55F, -34.0F, -82.0F);
		defaultchassis.addChild(gun35);
		setRotationAngle(gun35, 0.0F, 0.0F, -2.8256F);
		gun35.cubeList.add(new ModelBox(gun35, 133, 183, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(0.0F, -33.2F, -82.0F);
		defaultchassis.addChild(gun34);
		setRotationAngle(gun34, 0.0F, 0.0F, -2.6025F);
		gun34.cubeList.add(new ModelBox(gun34, 98, 93, 0.0F, 0.0F, 0.0F, 1, 1, 45, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-4.0F, -35.2F, -82.0F);
		defaultchassis.addChild(gun33);
		setRotationAngle(gun33, 0.0F, 0.0F, -0.409F);
		gun33.cubeList.add(new ModelBox(gun33, 0, 184, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-3.5F, -34.0F, -82.0F);
		defaultchassis.addChild(gun32);
		setRotationAngle(gun32, 0.0F, 0.0F, -1.9333F);
		gun32.cubeList.add(new ModelBox(gun32, 48, 138, 0.0F, 0.0F, 0.0F, 1, 1, 44, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-3.0F, -33.2F, -82.0F);
		defaultchassis.addChild(gun31);
		setRotationAngle(gun31, 0.0F, 0.0F, -2.1192F);
		gun31.cubeList.add(new ModelBox(gun31, 100, 0, 0.0F, 0.0F, 0.0F, 1, 1, 45, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-4.0F, -33.6F, -42.55F);
		defaultchassis.addChild(gun30);
		setRotationAngle(gun30, 2.2679F, 0.0F, 0.0F);
		gun30.cubeList.add(new ModelBox(gun30, 124, 37, -0.01F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-4.0F, -32.45F, -37.6F);
		defaultchassis.addChild(gun29);
		setRotationAngle(gun29, 2.9394F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 51, 55, 0.005F, -0.04F, 0.0F, 5, 3, 5, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-3.0F, -37.2F, -82.0F);
		defaultchassis.addChild(gun28);
		gun28.cubeList.add(new ModelBox(gun28, 51, 47, 0.0F, 0.0F, 0.0F, 4, 2, 43, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-4.0F, -30.2F, -27.0F);
		defaultchassis.addChild(gun26);
		setRotationAngle(gun26, 2.9371F, 0.0F, 0.0F);
		gun26.cubeList.add(new ModelBox(gun26, 190, 107, 0.01F, 0.0F, 0.0F, 5, 3, 12, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-3.5F, -15.4F, -4.7F);
		defaultchassis.addChild(gun17);
		setRotationAngle(gun17, 2.5281F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 35, 30, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-3.5F, -16.1F, -5.7F);
		defaultchassis.addChild(gun16);
		setRotationAngle(gun16, 0.9666F, 0.0F, 0.0F);
		gun16.cubeList.add(new ModelBox(gun16, 23, 42, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-3.5F, -22.2F, -0.2F);
		defaultchassis.addChild(gun13);
		setRotationAngle(gun13, -2.6397F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 11, 23, 0.01F, 0.0F, 0.0F, 4, 7, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-3.5F, -15.4F, 0.3F);
		defaultchassis.addChild(gun12);
		setRotationAngle(gun12, 2.3423F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 33, 42, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -16.4F, 1.3F);
		defaultchassis.addChild(gun10);
		setRotationAngle(gun10, -2.3794F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 51, 39, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -16.4F, 1.3F);
		defaultchassis.addChild(gun9);
		setRotationAngle(gun9, -2.8999F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 124, 21, 0.01F, 0.0F, 0.0F, 4, 6, 3, -0.001F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-3.5F, -30.5F, -2.7F);
		defaultchassis.addChild(gun7);
		setRotationAngle(gun7, -1.7846F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 0, 133, 0.01F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-3.5F, -31.0F, -1.5F);
		defaultchassis.addChild(gun6);
		setRotationAngle(gun6, -2.3423F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 124, 30, 0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-3.5F, -30.2F, -12.0F);
		defaultchassis.addChild(gun4);
		setRotationAngle(gun4, 1.0782F, 0.0F, 0.0F);
		gun4.cubeList.add(new ModelBox(gun4, 133, 46, 0.01F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -22.7F, -9.3F);
		defaultchassis.addChild(gun3);
		setRotationAngle(gun3, 1.3013F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 145, 127, 0.01F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -24.5F, -8.3F);
		defaultchassis.addChild(gun2);
		setRotationAngle(gun2, -0.5205F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 110, 0.01F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -32.5F, -5.2F);
		defaultchassis.addChild(gun1);
		setRotationAngle(gun1, -1.1897F, 0.0F, 0.0F);
		gun1.cubeList.add(new ModelBox(gun1, 94, 159, 0.0F, 0.0F, 0.0F, 4, 6, 16, 0.001F, false));

		gun269 = new ModelRenderer(this);
		gun269.setRotationPoint(-2.8F, -36.8F, 0.3F);
		defaultchassis.addChild(gun269);
		setRotationAngle(gun269, 0.0F, 0.0F, 1.041F);
		gun269.cubeList.add(new ModelBox(gun269, 45, 184, 0.0F, 0.0F, 0.0F, 1, 1, 19, -0.002F, false));

		socomchassis = new ModelRenderer(this);
		socomchassis.setRotationPoint(0.0F, 24.0F, 0.0F);
		socomchassis.cubeList.add(new ModelBox(socomchassis, 47, 94, -4.0F, -37.2F, -82.0F, 1, 2, 22, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 86, 36, 0.0F, -35.4F, -27.0F, 1, 2, 3, -0.001F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 145, 99, -4.0F, -36.7F, -27.0F, 4, 3, 3, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 125, 227, -4.0F, -36.7F, -24.0F, 5, 3, 8, -0.001F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 73, 0, -3.01F, -36.7F, -17.0F, 4, 3, 5, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 35, 99, -4.0F, -35.2F, -16.5F, 1, 1, 3, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 102, 16, -4.01F, -34.0F, -30.0F, 5, 1, 3, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 15, 60, -4.0F, -36.2F, -13.5F, 1, 2, 2, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 226, 164, -4.0F, -36.7F, -35.0F, 5, 3, 8, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 35, 0, 0.0F, -36.7F, -39.0F, 1, 3, 4, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 9, 78, -4.0F, -36.3F, -40.0F, 1, 2, 5, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 0, 0, -3.0F, -35.2F, -82.0F, 3, 2, 45, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 230, 108, -4.0F, -34.2F, -27.0F, 5, 3, 17, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 47, 118, -3.75F, -31.2F, -27.0F, 4, 1, 18, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 185, 137, -0.25F, -31.201F, -27.0F, 1, 1, 18, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 125, 227, -3.5F, -33.02F, 0.25F, 4, 6, 26, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 98, 115, -3.5F, -27.02F, 23.25F, 4, 6, 3, 0.003F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 31, 228, -2.5F, -34.02F, 0.25F, 2, 3, 26, 0.001F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 145, 93, -2.5F, -37.0F, 0.3F, 2, 1, 19, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 192, 44, -4.51F, -31.5F, 9.3F, 6, 5, 10, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 0, 140, -4.5F, -34.5F, 0.3F, 1, 3, 19, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 138, 139, 0.5F, -34.5F, 0.3F, 1, 3, 19, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 73, 16, -5.0F, -33.5F, 15.0F, 7, 2, 2, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 51, 63, -5.0F, -33.5F, 12.5F, 7, 2, 2, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 73, 47, 0.8F, -34.5F, 13.0F, 1, 6, 1, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 73, 29, 0.8F, -34.5F, 15.5F, 1, 6, 1, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 64, 47, -4.8F, -34.5F, 13.0F, 1, 6, 1, 0.0F, false));
		socomchassis.cubeList.add(new ModelBox(socomchassis, 51, 47, -4.8F, -34.5F, 15.5F, 1, 6, 1, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(0.5F, -26.36F, 3.9F);
		socomchassis.addChild(gun25_r1);
		setRotationAngle(gun25_r1, -0.2793F, 0.0F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 160, 260, -3.999F, -3.0F, 0.0F, 4, 3, 21, 0.0F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(0.5F, -23.36F, -1.1F);
		socomchassis.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.4538F, 0.0F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 67, 164, -3.998F, -6.0F, 0.0F, 4, 6, 8, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(0.5F, -29.2F, -2.6F);
		socomchassis.addChild(gun23_r1);
		setRotationAngle(gun23_r1, -1.309F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 73, 38, -3.999F, 0.0F, 4.0F, 4, 1, 2, 0.0F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 73, 68, -3.499F, 1.0F, 0.0F, 3, 1, 6, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(0.5F, -32.52F, -6.55F);
		socomchassis.addChild(gun26_r1);
		setRotationAngle(gun26_r1, -0.2443F, 0.0F, 0.0F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 73, 56, -4.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-2.5F, -33.52F, -6.55F);
		socomchassis.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -0.1745F, -0.1745F, -0.7854F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 9, 120, -1.4F, -0.001F, 0.0F, 1, 1, 5, 0.0F, false));
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 9, 127, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-0.5F, -33.52F, -6.55F);
		socomchassis.addChild(gun27_r1);
		setRotationAngle(gun27_r1, -0.1745F, -0.1745F, -0.7854F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 107, 101, -1.001F, 0.4F, 0.0F, 1, 1, 5, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 107, 127, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(-0.5F, -33.52F, -6.55F);
		socomchassis.addChild(gun25_r2);
		setRotationAngle(gun25_r2, -0.2443F, 0.0F, 0.0F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 47, 125, -2.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

		gun25_r3 = new ModelRenderer(this);
		gun25_r3.setRotationPoint(0.5F, -33.02F, 0.25F);
		socomchassis.addChild(gun25_r3);
		setRotationAngle(gun25_r3, -1.0647F, 0.0F, 0.0F);
		gun25_r3.cubeList.add(new ModelBox(gun25_r3, 0, 116, -4.0F, 0.0F, 0.0F, 4, 6, 3, 0.004F, false));

		gun27_r2 = new ModelRenderer(this);
		gun27_r2.setRotationPoint(-2.5F, -34.02F, 0.25F);
		socomchassis.addChild(gun27_r2);
		setRotationAngle(gun27_r2, -1.1868F, 0.3316F, -0.6807F);
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 51, 55, -1.4F, 0.0F, 0.0F, 1, 4, 1, -0.001F, false));
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 0, 60, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(-0.5F, -34.02F, 0.25F);
		socomchassis.addChild(gun28_r2);
		setRotationAngle(gun28_r2, -1.1868F, -0.3316F, 0.6807F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 0, 0, 0.3F, 0.0F, 0.001F, 1, 4, 1, 0.0F, false));
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 23, 11, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun26_r2 = new ModelRenderer(this);
		gun26_r2.setRotationPoint(-2.5F, -34.02F, 0.25F);
		socomchassis.addChild(gun26_r2);
		setRotationAngle(gun26_r2, 0.0F, 0.0F, -0.7854F);
		gun26_r2.cubeList.add(new ModelBox(gun26_r2, 0, 259, -1.4F, -0.001F, 0.0F, 1, 1, 26, -0.001F, false));

		gun25_r4 = new ModelRenderer(this);
		gun25_r4.setRotationPoint(-2.5F, -34.02F, 0.25F);
		socomchassis.addChild(gun25_r4);
		setRotationAngle(gun25_r4, 0.0F, 0.0F, -0.7854F);
		gun25_r4.cubeList.add(new ModelBox(gun25_r4, 260, 213, -1.0F, 0.0F, -0.001F, 1, 1, 26, -0.001F, false));

		gun25_r5 = new ModelRenderer(this);
		gun25_r5.setRotationPoint(-0.5F, -34.02F, 0.25F);
		socomchassis.addChild(gun25_r5);
		setRotationAngle(gun25_r5, 0.0F, 0.0F, -0.7854F);
		gun25_r5.cubeList.add(new ModelBox(gun25_r5, 132, 260, -1.001F, 0.4F, 0.0F, 1, 1, 26, -0.001F, false));
		gun25_r5.cubeList.add(new ModelBox(gun25_r5, 261, 29, -1.0F, 0.0F, -0.001F, 1, 1, 26, -0.001F, false));

		gun24_r2 = new ModelRenderer(this);
		gun24_r2.setRotationPoint(-0.5F, -34.02F, 0.25F);
		socomchassis.addChild(gun24_r2);
		setRotationAngle(gun24_r2, -1.0647F, 0.0F, 0.0F);
		gun24_r2.cubeList.add(new ModelBox(gun24_r2, 23, 0, -2.0F, 0.0F, 0.0F, 2, 6, 3, 0.0F, false));

		gun26_r3 = new ModelRenderer(this);
		gun26_r3.setRotationPoint(0.5F, -27.12F, 12.25F);
		socomchassis.addChild(gun26_r3);
		setRotationAngle(gun26_r3, -0.0873F, 0.0F, 0.0F);
		gun26_r3.cubeList.add(new ModelBox(gun26_r3, 192, 0, -3.998F, -1.0F, 0.0F, 4, 4, 12, 0.0F, false));

		gun24_r3 = new ModelRenderer(this);
		gun24_r3.setRotationPoint(-2.5F, -36.22F, -8.45F);
		socomchassis.addChild(gun24_r3);
		setRotationAngle(gun24_r3, -0.48F, 0.5498F, 0.7854F);
		gun24_r3.cubeList.add(new ModelBox(gun24_r3, 98, 124, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(-0.5F, -36.22F, -8.45F);
		socomchassis.addChild(gun23_r2);
		setRotationAngle(gun23_r2, -0.48F, -0.5498F, -0.7854F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 0, 125, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-0.5F, -36.22F, -8.45F);
		socomchassis.addChild(gun22_r1);
		setRotationAngle(gun22_r1, -0.7156F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 124, 46, -2.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(0.5F, -31.4F, -3.3F);
		socomchassis.addChild(gun22_r2);
		setRotationAngle(gun22_r2, -0.9599F, 0.0F, 0.0F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 51, 31, -3.999F, 1.0F, 0.0F, 4, 2, 6, 0.002F, false));
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 0, 70, -3.499F, 2.0F, 0.0F, 3, 2, 6, 0.001F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(0.5F, -34.2F, -9.0F);
		socomchassis.addChild(gun21_r1);
		setRotationAngle(gun21_r1, -0.4014F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 35, -3.999F, 1.0F, 0.0F, 4, 2, 6, 0.0F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 23, 58, -3.499F, 1.0F, 0.0F, 3, 3, 6, 0.0F, false));

		gun24_r4 = new ModelRenderer(this);
		gun24_r4.setRotationPoint(-4.0F, -34.2F, -10.0F);
		socomchassis.addChild(gun24_r4);
		setRotationAngle(gun24_r4, -0.6981F, 0.2209F, 0.2686F);
		gun24_r4.cubeList.add(new ModelBox(gun24_r4, 131, 104, 0.0F, -2.1F, -0.6F, 1, 1, 5, 0.0F, false));

		gun23_r3 = new ModelRenderer(this);
		gun23_r3.setRotationPoint(1.0F, -34.2F, -10.0F);
		socomchassis.addChild(gun23_r3);
		setRotationAngle(gun23_r3, -0.6981F, -0.2209F, -0.2686F);
		gun23_r3.cubeList.add(new ModelBox(gun23_r3, 133, 57, -1.0F, -2.1F, -0.6F, 1, 1, 5, 0.0F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(1.0F, -34.2F, -10.0F);
		socomchassis.addChild(gun21_r2);
		setRotationAngle(gun21_r2, -0.3665F, -0.0873F, 0.0349F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 84, 94, -1.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(-4.0F, -34.2F, -10.0F);
		socomchassis.addChild(gun20_r1);
		setRotationAngle(gun20_r1, -0.3665F, 0.0873F, -0.0349F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 107, 119, 0.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F, false));

		gun59_r1 = new ModelRenderer(this);
		gun59_r1.setRotationPoint(1.001F, -36.44F, -10.02F);
		socomchassis.addChild(gun59_r1);
		setRotationAngle(gun59_r1, -0.1833F, -0.7505F, 0.1257F);
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 29, 23, -1.001F, -0.002F, 1.2F, 1, 3, 1, 0.0F, false));
		gun59_r1.cubeList.add(new ModelBox(gun59_r1, 86, 0, -2.0F, -0.001F, 0.0F, 2, 3, 2, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(-3.999F, -36.44F, -10.02F);
		socomchassis.addChild(gun58_r1);
		setRotationAngle(gun58_r1, -0.1833F, 0.7505F, -0.1257F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 23, 23, -0.001F, -0.001F, 1.2F, 1, 3, 1, 0.0F, false));
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 86, 21, 0.0F, 0.0F, 0.0F, 2, 3, 2, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(1.001F, -36.4346F, -9.9957F);
		socomchassis.addChild(gun58_r2);
		setRotationAngle(gun58_r2, -0.8901F, -0.1047F, 0.0F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 61, 21, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 73, 10, -1.001F, 0.7F, 1.6F, 1, 1, 1, 0.0F, false));
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 73, 21, -0.999F, 0.7F, 0.8F, 1, 1, 1, 0.0F, false));

		gun59_r2 = new ModelRenderer(this);
		gun59_r2.setRotationPoint(-3.999F, -36.4346F, -9.9957F);
		socomchassis.addChild(gun59_r2);
		setRotationAngle(gun59_r2, -0.8901F, 0.1047F, 0.0F);
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 73, 23, -0.001F, 0.7F, 1.6F, 1, 1, 1, 0.0F, false));
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 73, 56, 0.001F, 0.7F, 0.8F, 1, 1, 1, 0.0F, false));
		gun59_r2.cubeList.add(new ModelBox(gun59_r2, 23, 70, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun108 = new ModelRenderer(this);
		gun108.setRotationPoint(-3.6F, -35.2F, -83.0F);
		socomchassis.addChild(gun108);
		setRotationAngle(gun108, 0.0F, 0.0F, -0.7064F);
		gun108.cubeList.add(new ModelBox(gun108, 41, 58, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(0.6F, -35.2F, -83.0F);
		socomchassis.addChild(gun112);
		setRotationAngle(gun112, 0.0F, 0.0F, 2.3051F);
		gun112.cubeList.add(new ModelBox(gun112, 0, 74, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-2.5F, -35.8F, -83.0F);
		socomchassis.addChild(gun113);
		gun113.cubeList.add(new ModelBox(gun113, 102, 3, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun119 = new ModelRenderer(this);
		gun119.setRotationPoint(-1.4F, -37.2F, -83.0F);
		socomchassis.addChild(gun119);
		gun119.cubeList.add(new ModelBox(gun119, 102, 0, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun120 = new ModelRenderer(this);
		gun120.setRotationPoint(-3.6F, -37.2F, -83.0F);
		socomchassis.addChild(gun120);
		gun120.cubeList.add(new ModelBox(gun120, 111, 8, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun157 = new ModelRenderer(this);
		gun157.setRotationPoint(-3.0F, -33.1F, -72.2F);
		socomchassis.addChild(gun157);
		setRotationAngle(gun157, 0.632F, 0.0F, 0.0F);
		gun157.cubeList.add(new ModelBox(gun157, 61, 18, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun158 = new ModelRenderer(this);
		gun158.setRotationPoint(-3.0F, -35.1F, -76.0F);
		socomchassis.addChild(gun158);
		gun158.cubeList.add(new ModelBox(gun158, 71, 109, 0.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, false));

		gun165 = new ModelRenderer(this);
		gun165.setRotationPoint(-4.0F, -36.9F, -60.0F);
		socomchassis.addChild(gun165);
		gun165.cubeList.add(new ModelBox(gun165, 0, 70, 0.0F, 0.0F, 0.0F, 1, 1, 21, -0.002F, false));

		gun166 = new ModelRenderer(this);
		gun166.setRotationPoint(-4.0F, -36.2F, -60.0F);
		socomchassis.addChild(gun166);
		gun166.cubeList.add(new ModelBox(gun166, 0, 23, 0.0F, 0.0F, 0.0F, 1, 1, 21, -0.001F, false));

		gun187 = new ModelRenderer(this);
		gun187.setRotationPoint(-4.0F, -36.7F, -11.5F);
		socomchassis.addChild(gun187);
		setRotationAngle(gun187, -0.1313F, 0.0F, 0.0F);
		gun187.cubeList.add(new ModelBox(gun187, 82, 109, 0.001F, 0.0654F, -0.4957F, 5, 3, 2, 0.0F, false));
		gun187.cubeList.add(new ModelBox(gun187, 86, 56, 1.51F, 0.0644F, 1.0943F, 2, 3, 2, 0.0F, false));

		gun193 = new ModelRenderer(this);
		gun193.setRotationPoint(-4.0F, -36.2F, -13.5F);
		socomchassis.addChild(gun193);
		setRotationAngle(gun193, -0.4461F, 0.0F, 0.0F);
		gun193.cubeList.add(new ModelBox(gun193, 35, 58, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		gun194 = new ModelRenderer(this);
		gun194.setRotationPoint(-4.0F, -36.7F, -16.0F);
		socomchassis.addChild(gun194);
		setRotationAngle(gun194, -1.2269F, 0.0F, 0.0F);
		gun194.cubeList.add(new ModelBox(gun194, 0, 102, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun195 = new ModelRenderer(this);
		gun195.setRotationPoint(-4.0F, -36.7F, -35.0F);
		socomchassis.addChild(gun195);
		setRotationAngle(gun195, -1.3013F, 0.0F, 0.0F);
		gun195.cubeList.add(new ModelBox(gun195, 41, 52, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		gun196 = new ModelRenderer(this);
		gun196.setRotationPoint(0.0F, -36.7F, -24.0F);
		socomchassis.addChild(gun196);
		setRotationAngle(gun196, -0.2231F, 0.0F, 0.0F);
		gun196.cubeList.add(new ModelBox(gun196, 35, 52, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		gun197 = new ModelRenderer(this);
		gun197.setRotationPoint(0.0F, -36.7F, -27.0F);
		socomchassis.addChild(gun197);
		setRotationAngle(gun197, -1.3756F, 0.0F, 0.0F);
		gun197.cubeList.add(new ModelBox(gun197, 98, 101, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun198 = new ModelRenderer(this);
		gun198.setRotationPoint(1.0F, -35.4F, -27.0F);
		socomchassis.addChild(gun198);
		setRotationAngle(gun198, 0.0F, 0.0F, 2.8256F);
		gun198.cubeList.add(new ModelBox(gun198, 71, 99, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun199 = new ModelRenderer(this);
		gun199.setRotationPoint(1.0F, -35.2F, -82.0F);
		socomchassis.addChild(gun199);
		setRotationAngle(gun199, 0.0F, 0.0F, 1.9333F);
		gun199.cubeList.add(new ModelBox(gun199, 94, 139, 0.0F, 0.0F, 0.0F, 1, 1, 42, 0.0F, false));

		gun200 = new ModelRenderer(this);
		gun200.setRotationPoint(0.55F, -34.0F, -82.0F);
		socomchassis.addChild(gun200);
		setRotationAngle(gun200, 0.0F, 0.0F, -2.8256F);
		gun200.cubeList.add(new ModelBox(gun200, 145, 93, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		gun215 = new ModelRenderer(this);
		gun215.setRotationPoint(0.0F, -33.2F, -82.0F);
		socomchassis.addChild(gun215);
		setRotationAngle(gun215, 0.0F, 0.0F, -2.6025F);
		gun215.cubeList.add(new ModelBox(gun215, 0, 94, 0.0F, 0.0F, 0.0F, 1, 1, 45, 0.0F, false));

		gun216 = new ModelRenderer(this);
		gun216.setRotationPoint(-4.0F, -35.2F, -82.0F);
		socomchassis.addChild(gun216);
		setRotationAngle(gun216, 0.0F, 0.0F, -0.409F);
		gun216.cubeList.add(new ModelBox(gun216, 0, 140, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		gun217 = new ModelRenderer(this);
		gun217.setRotationPoint(-3.5F, -34.0F, -82.0F);
		socomchassis.addChild(gun217);
		setRotationAngle(gun217, 0.0F, 0.0F, -1.9333F);
		gun217.cubeList.add(new ModelBox(gun217, 101, 48, 0.0F, 0.0F, 0.0F, 1, 1, 44, 0.0F, false));

		gun218 = new ModelRenderer(this);
		gun218.setRotationPoint(-3.0F, -33.2F, -82.0F);
		socomchassis.addChild(gun218);
		setRotationAngle(gun218, 0.0F, 0.0F, -2.1192F);
		gun218.cubeList.add(new ModelBox(gun218, 51, 92, 0.0F, 0.0F, 0.0F, 1, 1, 45, 0.0F, false));

		gun219 = new ModelRenderer(this);
		gun219.setRotationPoint(-4.0F, -33.6F, -42.55F);
		socomchassis.addChild(gun219);
		setRotationAngle(gun219, 2.2679F, 0.0F, 0.0F);
		gun219.cubeList.add(new ModelBox(gun219, 23, 58, 0.24F, -0.2051F, -0.0891F, 1, 2, 2, 0.0F, false));
		gun219.cubeList.add(new ModelBox(gun219, 76, 94, -0.001F, 0.4619F, 0.3958F, 1, 1, 2, 0.0F, false));
		gun219.cubeList.add(new ModelBox(gun219, 51, 31, 3.75F, -0.2051F, -0.0891F, 1, 2, 2, 0.0F, false));
		gun219.cubeList.add(new ModelBox(gun219, 76, 99, 4.001F, 0.4619F, 0.3958F, 1, 1, 2, 0.0F, false));

		gun220 = new ModelRenderer(this);
		gun220.setRotationPoint(-4.0F, -32.65F, -37.6F);
		socomchassis.addChild(gun220);
		setRotationAngle(gun220, 2.9917F, 0.0F, 0.0F);
		gun220.cubeList.add(new ModelBox(gun220, 0, 60, 0.005F, 0.8022F, -0.0299F, 5, 2, 5, 0.0F, false));

		gun221 = new ModelRenderer(this);
		gun221.setRotationPoint(-3.0F, -37.2F, -82.0F);
		socomchassis.addChild(gun221);
		gun221.cubeList.add(new ModelBox(gun221, 51, 0, 0.0F, 0.0F, 0.0F, 4, 2, 43, 0.0F, false));

		gun222 = new ModelRenderer(this);
		gun222.setRotationPoint(-4.0F, -30.2F, -27.0F);
		socomchassis.addChild(gun222);
		setRotationAngle(gun222, 2.9371F, 0.0F, 0.0F);
		gun222.cubeList.add(new ModelBox(gun222, 192, 16, 0.01F, 1.0F, 0.0F, 5, 2, 12, 0.0F, false));
		gun222.cubeList.add(new ModelBox(gun222, 45, 164, 0.26F, 0.0F, 0.0F, 3, 1, 16, 0.0F, false));
		gun222.cubeList.add(new ModelBox(gun222, 190, 90, 2.7501F, 0.0F, 0.0F, 2, 1, 16, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-2.5F, -37.0F, 0.3F);
		socomchassis.addChild(gun93);
		setRotationAngle(gun93, 0.0F, 0.0F, 1.041F);
		gun93.cubeList.add(new ModelBox(gun93, 0, 184, 0.0F, 0.0F, 0.0F, 1, 1, 19, 0.001F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-2.8F, -36.8F, 0.3F);
		socomchassis.addChild(gun96);
		setRotationAngle(gun96, 0.0F, 0.0F, 1.041F);
		gun96.cubeList.add(new ModelBox(gun96, 134, 183, 0.0F, 0.0F, 0.0F, 1, 1, 19, 0.0F, false));

		gun100 = new ModelRenderer(this);
		gun100.setRotationPoint(-4.5F, -34.5F, 0.3F);
		socomchassis.addChild(gun100);
		setRotationAngle(gun100, 0.0F, 0.0F, -1.1154F);
		gun100.cubeList.add(new ModelBox(gun100, 94, 139, 0.0F, 0.0F, 0.0F, 2, 1, 19, -0.001F, false));

		gun102 = new ModelRenderer(this);
		gun102.setRotationPoint(1.5F, -34.5F, 0.3F);
		socomchassis.addChild(gun102);
		setRotationAngle(gun102, 0.0F, 0.0F, 2.6397F);
		gun102.cubeList.add(new ModelBox(gun102, 147, 68, 0.0F, 0.0F, 0.0F, 1, 2, 19, -0.001F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(-0.5F, -37.0F, 0.3F);
		socomchassis.addChild(gun103);
		setRotationAngle(gun103, 0.0F, 0.0F, 0.632F);
		gun103.cubeList.add(new ModelBox(gun103, 90, 183, 0.0F, 0.0F, 0.0F, 1, 1, 19, 0.001F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(-0.3F, -36.85F, 0.3F);
		socomchassis.addChild(gun104);
		setRotationAngle(gun104, 0.0F, 0.0F, 0.632F);
		gun104.cubeList.add(new ModelBox(gun104, 138, 161, 0.0F, 0.0F, 0.0F, 1, 1, 19, 0.0F, false));

		gun105 = new ModelRenderer(this);
		gun105.setRotationPoint(-4.5F, -31.5F, 0.3F);
		socomchassis.addChild(gun105);
		setRotationAngle(gun105, 1.3013F, 0.0F, 0.0F);
		gun105.cubeList.add(new ModelBox(gun105, 61, 94, 5.01F, 0.0F, 0.0F, 1, 10, 3, 0.0F, false));
		gun105.cubeList.add(new ModelBox(gun105, 61, 0, 0.01F, 0.0F, 0.0F, 1, 10, 3, 0.0F, false));

		gun106 = new ModelRenderer(this);
		gun106.setRotationPoint(-4.5F, -26.5F, 9.3F);
		socomchassis.addChild(gun106);
		setRotationAngle(gun106, 2.3794F, 0.0F, 0.0F);
		gun106.cubeList.add(new ModelBox(gun106, 226, 129, -0.02F, 0.0F, 0.0F, 6, 3, 8, 0.0F, false));

		standard_cover = new ModelRenderer(this);
		standard_cover.setRotationPoint(0.0F, 24.0F, 0.0F);
		standard_cover.cubeList.add(new ModelBox(standard_cover, 111, 11, -3.0F, -39.9F, -83.0F, 3, 2, 1, 0.001F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 51, 68, -0.1F, -38.3F, -43.0F, 1, 2, 2, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 229, 248, -2.5F, -40.5F, -75.5F, 2, 1, 28, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 111, 24, -2.5F, -40.6F, -77.5F, 2, 1, 2, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 121, 104, -2.5F, -40.6F, -75.0F, 2, 1, 6, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 124, 0, -2.5F, -40.6F, -68.5F, 2, 1, 6, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 145, 105, -2.5F, -40.6F, -62.0F, 2, 1, 5, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 124, 7, -2.5F, -40.6F, -56.5F, 2, 1, 6, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 52, 262, -3.8F, -38.2F, -82.0F, 1, 1, 22, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 45, 183, -0.2F, -38.2F, -82.0F, 1, 1, 43, 0.0F, false));
		standard_cover.cubeList.add(new ModelBox(standard_cover, 60, 214, -2.5F, -40.6F, -50.0F, 2, 1, 11, 0.0F, false));

		gun209 = new ModelRenderer(this);
		gun209.setRotationPoint(-0.5F, -38.2F, -83.0F);
		standard_cover.addChild(gun209);
		gun209.cubeList.add(new ModelBox(gun209, 9, 80, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun208 = new ModelRenderer(this);
		gun208.setRotationPoint(0.5F, -38.2F, -83.0F);
		standard_cover.addChild(gun208);
		setRotationAngle(gun208, 0.0F, 0.0F, 2.9172F);
		gun208.cubeList.add(new ModelBox(gun208, 16, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun207 = new ModelRenderer(this);
		gun207.setRotationPoint(-0.1F, -39.9F, -83.0F);
		standard_cover.addChild(gun207);
		setRotationAngle(gun207, 0.0F, 0.0F, 1.122F);
		gun207.cubeList.add(new ModelBox(gun207, 82, 29, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun206 = new ModelRenderer(this);
		gun206.setRotationPoint(-3.5F, -38.2F, -83.0F);
		standard_cover.addChild(gun206);
		gun206.cubeList.add(new ModelBox(gun206, 61, 39, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun205 = new ModelRenderer(this);
		gun205.setRotationPoint(-3.5F, -38.2F, -83.0F);
		standard_cover.addChild(gun205);
		setRotationAngle(gun205, 0.0F, 0.0F, -1.309F);
		gun205.cubeList.add(new ModelBox(gun205, 82, 31, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun204 = new ModelRenderer(this);
		gun204.setRotationPoint(-2.9F, -39.9F, -83.0F);
		standard_cover.addChild(gun204);
		setRotationAngle(gun204, 0.0F, 0.0F, 0.4114F);
		gun204.cubeList.add(new ModelBox(gun204, 82, 47, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun203 = new ModelRenderer(this);
		gun203.setRotationPoint(-2.3F, -40.4F, -79.5F);
		standard_cover.addChild(gun203);
		setRotationAngle(gun203, 0.0F, 0.0F, 1.083F);
		gun203.cubeList.add(new ModelBox(gun203, 111, 67, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun164 = new ModelRenderer(this);
		gun164.setRotationPoint(0.9F, -38.3F, -43.0F);
		standard_cover.addChild(gun164);
		setRotationAngle(gun164, 0.0F, 0.0F, 2.88F);
		gun164.cubeList.add(new ModelBox(gun164, 111, 78, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun163 = new ModelRenderer(this);
		gun163.setRotationPoint(0.25F, -40.0F, -43.0F);
		standard_cover.addChild(gun163);
		setRotationAngle(gun163, 0.0F, 0.0F, 1.122F);
		gun163.cubeList.add(new ModelBox(gun163, 14, 112, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun162 = new ModelRenderer(this);
		gun162.setRotationPoint(-0.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun162);
		setRotationAngle(gun162, 0.0F, 0.0F, 0.748F);
		gun162.cubeList.add(new ModelBox(gun162, 113, 62, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun161 = new ModelRenderer(this);
		gun161.setRotationPoint(-2.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun161);
		gun161.cubeList.add(new ModelBox(gun161, 37, 88, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun160 = new ModelRenderer(this);
		gun160.setRotationPoint(-2.5F, -40.7F, -43.0F);
		standard_cover.addChild(gun160);
		setRotationAngle(gun160, 0.0F, 0.0F, 0.8228F);
		gun160.cubeList.add(new ModelBox(gun160, 113, 83, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun159 = new ModelRenderer(this);
		gun159.setRotationPoint(-3.2F, -40.0F, -43.0F);
		standard_cover.addChild(gun159);
		setRotationAngle(gun159, 0.0F, 0.0F, 0.4114F);
		gun159.cubeList.add(new ModelBox(gun159, 113, 107, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun156 = new ModelRenderer(this);
		gun156.setRotationPoint(-3.2F, -39.9F, -46.0F);
		standard_cover.addChild(gun156);
		setRotationAngle(gun156, 0.0F, 0.0F, 0.4114F);
		gun156.cubeList.add(new ModelBox(gun156, 102, 75, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun154 = new ModelRenderer(this);
		gun154.setRotationPoint(-0.65F, -40.4F, -79.5F);
		standard_cover.addChild(gun154);
		setRotationAngle(gun154, 0.0F, 0.0F, 0.561F);
		gun154.cubeList.add(new ModelBox(gun154, 115, 16, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun153 = new ModelRenderer(this);
		gun153.setRotationPoint(-0.5F, -40.6F, -77.5F);
		standard_cover.addChild(gun153);
		setRotationAngle(gun153, 0.0F, 0.0F, 0.748F);
		gun153.cubeList.add(new ModelBox(gun153, 115, 30, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun152 = new ModelRenderer(this);
		gun152.setRotationPoint(-2.45F, -40.5F, -76.5F);
		standard_cover.addChild(gun152);
		setRotationAngle(gun152, 0.0F, 0.0F, 0.8228F);
		gun152.cubeList.add(new ModelBox(gun152, 157, 231, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

		gun151 = new ModelRenderer(this);
		gun151.setRotationPoint(-2.5F, -40.6F, -77.5F);
		standard_cover.addChild(gun151);
		setRotationAngle(gun151, 0.0F, 0.0F, 0.8228F);
		gun151.cubeList.add(new ModelBox(gun151, 115, 33, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun149 = new ModelRenderer(this);
		gun149.setRotationPoint(-3.1F, -39.9F, -82.0F);
		standard_cover.addChild(gun149);
		setRotationAngle(gun149, 0.0F, 0.0F, 0.4114F);
		gun149.cubeList.add(new ModelBox(gun149, 178, 183, 0.0F, 0.0F, 0.0F, 1, 1, 39, 0.0F, false));

		gun148 = new ModelRenderer(this);
		gun148.setRotationPoint(-3.2F, -39.9F, -82.0F);
		standard_cover.addChild(gun148);
		setRotationAngle(gun148, 0.0F, 0.0F, 0.4114F);
		gun148.cubeList.add(new ModelBox(gun148, 115, 37, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun147 = new ModelRenderer(this);
		gun147.setRotationPoint(-3.8F, -38.2F, -82.0F);
		standard_cover.addChild(gun147);
		setRotationAngle(gun147, 0.0F, 0.0F, -1.309F);
		gun147.cubeList.add(new ModelBox(gun147, 261, 248, 0.0F, 0.0F, 0.0F, 1, 1, 22, 0.0F, false));

		gun146 = new ModelRenderer(this);
		gun146.setRotationPoint(-2.5F, -40.6F, -75.0F);
		standard_cover.addChild(gun146);
		setRotationAngle(gun146, 0.0F, 0.0F, 0.8228F);
		gun146.cubeList.add(new ModelBox(gun146, 31, 128, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-2.5F, -40.6F, -68.5F);
		standard_cover.addChild(gun145);
		setRotationAngle(gun145, 0.0F, 0.0F, 0.8228F);
		gun145.cubeList.add(new ModelBox(gun145, 73, 129, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-2.5F, -40.6F, -62.0F);
		standard_cover.addChild(gun144);
		setRotationAngle(gun144, 0.0F, 0.0F, 0.8228F);
		gun144.cubeList.add(new ModelBox(gun144, 147, 32, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-2.5F, -40.6F, -56.5F);
		standard_cover.addChild(gun143);
		setRotationAngle(gun143, 0.0F, 0.0F, 0.8228F);
		gun143.cubeList.add(new ModelBox(gun143, 129, 127, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun142 = new ModelRenderer(this);
		gun142.setRotationPoint(-2.5F, -40.6F, -50.0F);
		standard_cover.addChild(gun142);
		setRotationAngle(gun142, 0.0F, 0.0F, 0.8228F);
		gun142.cubeList.add(new ModelBox(gun142, 0, 228, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun141 = new ModelRenderer(this);
		gun141.setRotationPoint(-0.55F, -40.5F, -74.5F);
		standard_cover.addChild(gun141);
		setRotationAngle(gun141, 0.0F, 0.0F, 0.748F);
		gun141.cubeList.add(new ModelBox(gun141, 98, 261, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun140 = new ModelRenderer(this);
		gun140.setRotationPoint(0.1F, -39.9F, -82.0F);
		standard_cover.addChild(gun140);
		setRotationAngle(gun140, 0.0F, 0.0F, 1.122F);
		gun140.cubeList.add(new ModelBox(gun140, 185, 137, 0.0F, 0.0F, 0.0F, 1, 1, 39, 0.0F, false));

		gun139 = new ModelRenderer(this);
		gun139.setRotationPoint(0.2F, -39.9F, -82.0F);
		standard_cover.addChild(gun139);
		setRotationAngle(gun139, 0.0F, 0.0F, 1.122F);
		gun139.cubeList.add(new ModelBox(gun139, 115, 47, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.2F, -39.9F, -46.0F);
		standard_cover.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 1.122F);
		gun138.cubeList.add(new ModelBox(gun138, 23, 105, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun137 = new ModelRenderer(this);
		gun137.setRotationPoint(-0.5F, -40.6F, -75.0F);
		standard_cover.addChild(gun137);
		setRotationAngle(gun137, 0.0F, 0.0F, 0.748F);
		gun137.cubeList.add(new ModelBox(gun137, 94, 139, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun136 = new ModelRenderer(this);
		gun136.setRotationPoint(-0.5F, -40.6F, -68.5F);
		standard_cover.addChild(gun136);
		setRotationAngle(gun136, 0.0F, 0.0F, 0.748F);
		gun136.cubeList.add(new ModelBox(gun136, 117, 139, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-0.5F, -40.6F, -62.0F);
		standard_cover.addChild(gun135);
		setRotationAngle(gun135, 0.0F, 0.0F, 0.748F);
		gun135.cubeList.add(new ModelBox(gun135, 147, 46, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun134 = new ModelRenderer(this);
		gun134.setRotationPoint(-0.5F, -40.6F, -56.5F);
		standard_cover.addChild(gun134);
		setRotationAngle(gun134, 0.0F, 0.0F, 0.748F);
		gun134.cubeList.add(new ModelBox(gun134, 138, 139, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun133 = new ModelRenderer(this);
		gun133.setRotationPoint(-2.5F, -40.6F, -77.5F);
		standard_cover.addChild(gun133);
		setRotationAngle(gun133, -1.4586F, 0.0F, 0.0F);
		gun133.cubeList.add(new ModelBox(gun133, 23, 34, 0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

		gun124 = new ModelRenderer(this);
		gun124.setRotationPoint(-0.5F, -40.6F, -50.0F);
		standard_cover.addChild(gun124);
		setRotationAngle(gun124, 0.0F, 0.0F, 0.748F);
		gun124.cubeList.add(new ModelBox(gun124, 31, 228, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun123 = new ModelRenderer(this);
		gun123.setRotationPoint(0.8F, -38.2F, -82.0F);
		standard_cover.addChild(gun123);
		setRotationAngle(gun123, 0.0F, 0.0F, 2.9172F);
		gun123.cubeList.add(new ModelBox(gun123, 147, 46, 0.0F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));

		trit_rail_cover = new ModelRenderer(this);
		trit_rail_cover.setRotationPoint(3.0F, -14.0F, -42.0F);
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 0, 228, -2.7F, -1.0F, -19.0F, 1, 2, 29, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 98, 93, -2.8F, -0.5F, -39.8F, 1, 1, 21, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 0, 94, -7.2F, -0.5F, -39.8F, 1, 1, 21, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 0, 0, -3.2F, -1.0F, -40.001F, 1, 2, 21, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 45, 140, -6.8F, -1.0F, -40.001F, 1, 2, 22, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 138, 139, -5.5F, -2.8F, -40.0F, 2, 1, 43, 0.001F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 0, 23, -5.5F, -1.8F, -41.1F, 2, 5, 2, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 35, 70, -6.0F, -1.3F, -41.09F, 3, 3, 2, 0.0F, false));
		trit_rail_cover.cubeList.add(new ModelBox(trit_rail_cover, 73, 58, -2.55F, -0.5F, 7.5F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.2F, -1.0F, -40.0F);
		trit_rail_cover.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 1.1519F);
		bone3.cubeList.add(new ModelBox(bone3, 147, 20, -1.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 192, 0, -0.5F, 0.0F, 0.0F, 1, 1, 38, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 102, 70, -1.0F, 0.0F, 10.0F, 1, 1, 2, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 102, 67, -1.0F, 0.0F, 17.0F, 1, 1, 2, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 102, 57, -1.0F, 0.0F, 24.0F, 1, 1, 2, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 102, 54, -1.0F, 0.0F, 31.0F, 1, 1, 2, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 147, -1.0F, 0.0F, 38.0F, 1, 1, 5, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-6.8F, -1.0F, -40.0F);
		trit_rail_cover.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -1.1519F);
		bone4.cubeList.add(new ModelBox(bone4, 147, 12, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 147, 0, -0.5F, 0.0F, 0.0F, 1, 1, 43, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 102, 24, 0.0F, 0.0F, 10.0F, 1, 1, 2, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 102, 21, 0.0F, 0.0F, 17.0F, 1, 1, 2, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 102, 11, 0.0F, 0.0F, 24.0F, 1, 1, 2, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 102, 8, 0.0F, 0.0F, 31.0F, 1, 1, 2, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 117, 146, 0.0F, 0.0F, 38.0F, 1, 1, 5, -0.001F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.5F, -2.33F, -40.0F);
		trit_rail_cover.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -2.7053F);
		bone5.cubeList.add(new ModelBox(bone5, 147, 6, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 105, -1.0F, -1.0F, 10.0F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 90, 227, -0.5F, -1.0F, 5.0F, 1, 1, 33, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 98, 104, -1.0F, -1.0F, 17.0F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 102, 78, -1.0F, -1.0F, 24.0F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 102, 75, -1.0F, -1.0F, 31.0F, 1, 1, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 138, 146, -1.0F, -1.0F, 38.0F, 1, 1, 5, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-5.5F, -2.33F, -40.0F);
		trit_rail_cover.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 2.7053F);
		bone6.cubeList.add(new ModelBox(bone6, 147, 0, 0.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 190, 90, -0.5F, -1.0F, 0.0F, 1, 1, 38, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 102, 49, 0.0F, -1.0F, 10.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 102, 46, 0.0F, -1.0F, 17.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 102, 32, 0.0F, -1.0F, 24.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 102, 29, 0.0F, -1.0F, 31.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 94, 146, 0.0F, -1.0F, 38.0F, 1, 1, 5, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.7F, -1.0F, -19.0F);
		trit_rail_cover.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.5061F);
		bone.cubeList.add(new ModelBox(bone, 230, 39, -1.0F, 0.0F, 0.0F, 1, 1, 29, 0.0F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 21.9F, 2.0F);
		setRotationAngle(mag, 0.0698F, 0.0F, 0.0F);
		

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-3.0F, -16.1F, -28.5F);
		mag.addChild(mag4);
		setRotationAngle(mag4, 2.9743F, 0.0F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 219, 183, 0.0F, 0.0F, 1.0F, 3, 19, 6, 0.001F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag.addChild(mag3);
		setRotationAngle(mag3, 2.9743F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 47, 94, 0.0F, 0.0F, 7.0F, 4, 19, 3, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag.addChild(mag1);
		setRotationAngle(mag1, 2.9743F, 0.0F, 0.0F);
		mag1.cubeList.add(new ModelBox(mag1, 51, 0, 0.0F, 0.0F, 0.0F, 4, 19, 1, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-3.5F, -16.1F, -28.5F);
		mag.addChild(mag2);
		setRotationAngle(mag2, 2.9743F, 0.0F, 0.0F);
		mag2.cubeList.add(new ModelBox(mag2, 223, 223, 0.0F, 0.0F, 2.0F, 4, 19, 4, 0.0F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		action13 = new ModelRenderer(this);
		action13.setRotationPoint(-5.3F, -38.4F, -33.4F);
		action.addChild(action13);
		setRotationAngle(action13, 0.0F, -0.1859F, 0.0F);
		action13.cubeList.add(new ModelBox(action13, 73, 72, -0.2948F, 0.0F, 0.0554F, 2, 1, 1, -0.001F, false));

		action12 = new ModelRenderer(this);
		action12.setRotationPoint(-5.3F, -38.8F, -33.4F);
		action.addChild(action12);
		setRotationAngle(action12, 0.0F, -0.1859F, 0.0F);
		action12.cubeList.add(new ModelBox(action12, 65, 72, -0.2948F, 0.0F, 0.0554F, 2, 1, 1, 0.0F, false));

		action11 = new ModelRenderer(this);
		action11.setRotationPoint(-3.8F, -38.4F, -36.0F);
		action.addChild(action11);
		action11.cubeList.add(new ModelBox(action11, 0, 102, -0.3F, 0.0F, -3.0F, 1, 1, 7, 0.0F, false));

		action10 = new ModelRenderer(this);
		action10.setRotationPoint(-3.8F, -39.5F, -36.0F);
		action.addChild(action10);
		action10.cubeList.add(new ModelBox(action10, 85, 68, -0.4F, -1.05F, -3.1F, 1, 2, 3, -0.1F, false));

		action12_r1 = new ModelRenderer(this);
		action12_r1.setRotationPoint(1.3F, 0.2F, 0.3F);
		action10.addChild(action12_r1);
		setRotationAngle(action12_r1, -0.4014F, 0.0F, 0.0F);
		action12_r1.cubeList.add(new ModelBox(action12_r1, 51, 78, -1.7F, -0.3F, -0.1F, 1, 1, 2, -0.102F, false));

		action11_r1 = new ModelRenderer(this);
		action11_r1.setRotationPoint(1.3F, -0.8F, -0.35F);
		action10.addChild(action11_r1);
		setRotationAngle(action11_r1, -0.8203F, 0.0F, 0.0F);
		action11_r1.cubeList.add(new ModelBox(action11_r1, 39, 34, -1.7F, -0.3F, -0.11F, 1, 2, 2, -0.101F, false));

		action9 = new ModelRenderer(this);
		action9.setRotationPoint(-3.8F, -38.8F, -36.0F);
		action.addChild(action9);
		action9.cubeList.add(new ModelBox(action9, 98, 101, -0.3F, 0.0F, -3.0F, 1, 1, 7, 0.001F, false));

		action8 = new ModelRenderer(this);
		action8.setRotationPoint(-1.0F, -39.5F, -36.0F);
		action.addChild(action8);
		setRotationAngle(action8, 0.0F, 0.0F, -1.1525F);
		action8.cubeList.add(new ModelBox(action8, 58, 94, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		action7 = new ModelRenderer(this);
		action7.setRotationPoint(-2.0F, -39.5F, -36.0F);
		action.addChild(action7);
		setRotationAngle(action7, 0.0F, 0.0F, 1.1525F);
		action7.cubeList.add(new ModelBox(action7, 87, 8, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		action6 = new ModelRenderer(this);
		action6.setRotationPoint(-2.0F, -39.5F, -36.0F);
		action.addChild(action6);
		action6.cubeList.add(new ModelBox(action6, 64, 82, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		action5 = new ModelRenderer(this);
		action5.setRotationPoint(-1.0F, -39.3F, -36.0F);
		action.addChild(action5);
		setRotationAngle(action5, 0.0F, 0.0F, -1.1525F);
		action5.cubeList.add(new ModelBox(action5, 23, 47, -1.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		action4 = new ModelRenderer(this);
		action4.setRotationPoint(-2.0F, -39.3F, -36.0F);
		action.addChild(action4);
		setRotationAngle(action4, 0.0F, 0.0F, 1.1525F);
		action4.cubeList.add(new ModelBox(action4, 23, 23, 0.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		action3 = new ModelRenderer(this);
		action3.setRotationPoint(-2.9F, -38.9F, -36.0F);
		action.addChild(action3);
		action3.cubeList.add(new ModelBox(action3, 226, 197, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		action1 = new ModelRenderer(this);
		action1.setRotationPoint(-2.0F, -39.3F, -36.0F);
		action.addChild(action1);
		action1.cubeList.add(new ModelBox(action1, 23, 0, 0.0F, 0.0F, 1.0F, 1, 1, 10, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 102, 0, -1.75F, -38.75F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 21, -1.85F, -38.9F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 67, -2.0F, -39.0F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 68, -2.15F, -38.9F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 21, -2.25F, -38.75F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 47, -2.15F, -38.6F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 46, -2.0F, -38.5F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 0, -1.85F, -38.6F, -104.0F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 61, 21, -2.0F, -40.5F, -106.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 61, 13, -2.0F, -40.5F, -106.5F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 115, -1.55F, -38.75F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 21, 140, -1.75F, -39.0F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 45, 140, -2.0F, -39.2F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 116, -2.25F, -39.0F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 94, -2.45F, -38.75F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 93, -1.75F, -38.5F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 118, -2.0F, -38.3F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 70, -2.25F, -38.5F, -114.0F, 1, 1, 10, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 35, 75, -2.0F, -37.5F, -106.7F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 105, -2.0F, -38.0F, -107.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 29, -1.55F, -38.75F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 32, -1.75F, -39.0F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 37, 111, -2.0F, -39.2F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 46, -2.25F, -39.0F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 49, -2.45F, -38.75F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 111, 54, -2.25F, -38.5F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 108, -1.75F, -38.5F, -90.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 15, 0, -2.0F, -38.3F, -90.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 121, 126, -2.0F, -36.2F, -89.0F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 46, -1.75F, -36.0F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 39, 105, -2.0F, -35.75F, -92.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 54, -1.55F, -35.75F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 67, -1.75F, -35.5F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 8, -2.0F, -35.3F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 0, -2.25F, -36.0F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 29, -2.45F, -35.75F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 102, 21, -2.25F, -35.5F, -90.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 77, -1.55F, -38.75F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 35, 77, -1.75F, -39.0F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 16, 79, -2.0F, -39.2F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 77, -1.75F, -38.5F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 9, 78, -2.0F, -38.3F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 75, -2.25F, -39.0F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 41, 77, -2.45F, -38.75F, -84.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 75, -2.25F, -38.5F, -84.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		defaultchassis.render(f5);
//		socomchassis.render(f5);
//		standard_cover.render(f5);
//		trit_rail_cover.render(f5);
		mag.render(f5);
//		action.render(f5);
//		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
