package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KBP9A91 extends ModelWithAttachments
{
	private final ModelRenderer MainGUN;
	private final ModelRenderer gun94_r1;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun92_r1;
	private final ModelRenderer gun92_r2;
	private final ModelRenderer gun94_r2;
	private final ModelRenderer gun93_r2;
	private final ModelRenderer gun93_r3;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer gun343_r1;
	private final ModelRenderer gun342_r1;
	private final ModelRenderer gun342_r2;
	private final ModelRenderer gun343_r2;
	private final ModelRenderer gun344_r1;
	private final ModelRenderer gun342_r3;
	private final ModelRenderer gun342_r4;
	private final ModelRenderer gun343_r3;
	private final ModelRenderer gun344_r2;
	private final ModelRenderer gun343_r4;
	private final ModelRenderer gun342_r5;
	private final ModelRenderer MainGunBARREL;
	private final ModelRenderer gun285;
	private final ModelRenderer gun287;
	private final ModelRenderer gun286;
	private final ModelRenderer gun284;
	private final ModelRenderer gun283;
	private final ModelRenderer gun281;
	private final ModelRenderer gun282;
	private final ModelRenderer gun288;
	private final ModelRenderer gun129HAMMER;
	private final ModelRenderer gun113trigger;
	private final ModelRenderer gun112TRIGGER;
	private final ModelRenderer gun111TRIGGER;
	private final ModelRenderer gun110TRIGGER;
	private final ModelRenderer gun392;
	private final ModelRenderer gun391;
	private final ModelRenderer gun390;
	private final ModelRenderer gun389;
	private final ModelRenderer gun388;
	private final ModelRenderer gun387;
	private final ModelRenderer gun386;
	private final ModelRenderer gun385;
	private final ModelRenderer gun384;
	private final ModelRenderer gun383;
	private final ModelRenderer gun376;
	private final ModelRenderer gun375;
	private final ModelRenderer gun370;
	private final ModelRenderer gun369;
	private final ModelRenderer gun357;
	private final ModelRenderer gun361_r1;
	private final ModelRenderer gun361_r2;
	private final ModelRenderer gun356;
	private final ModelRenderer gun355;
	private final ModelRenderer gun354;
	private final ModelRenderer gun353;
	private final ModelRenderer gun339;
	private final ModelRenderer gun338;
	private final ModelRenderer gun337;
	private final ModelRenderer gun336;
	private final ModelRenderer gun335;
	private final ModelRenderer gun314;
	private final ModelRenderer gun312;
	private final ModelRenderer gun311;
	private final ModelRenderer gun310;
	private final ModelRenderer gun309;
	private final ModelRenderer gun308;
	private final ModelRenderer gun307;
	private final ModelRenderer gun306;
	private final ModelRenderer gun305;
	private final ModelRenderer gun304;
	private final ModelRenderer gun303;
	private final ModelRenderer gun302;
	private final ModelRenderer gun301;
	private final ModelRenderer gun300;
	private final ModelRenderer gun299;
	private final ModelRenderer gun298;
	private final ModelRenderer gun297;
	private final ModelRenderer gun296;
	private final ModelRenderer gun295;
	private final ModelRenderer gun933;
	private final ModelRenderer gun922;
	private final ModelRenderer gun911;
	private final ModelRenderer gun900;
	private final ModelRenderer gun899;
	private final ModelRenderer gun96;
	private final ModelRenderer gun95;
	private final ModelRenderer gun94;
	private final ModelRenderer gun93;
	private final ModelRenderer gun91;
	private final ModelRenderer gun92;
	private final ModelRenderer gun90;
	private final ModelRenderer gun89;
	private final ModelRenderer gun88;
	private final ModelRenderer gun74;
	private final ModelRenderer gun73;
	private final ModelRenderer gun69;
	private final ModelRenderer gun67;
	private final ModelRenderer gun66;
	private final ModelRenderer gun65;
	private final ModelRenderer gun61;
	private final ModelRenderer gun60;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer gun58;
	private final ModelRenderer gun56;
	private final ModelRenderer gun47;
	private final ModelRenderer gun44;
	private final ModelRenderer gun41;
	private final ModelRenderer gun39;
	private final ModelRenderer gun28;
	private final ModelRenderer gun25;
	private final ModelRenderer gun24;
	private final ModelRenderer gun23;
	private final ModelRenderer gun20;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun14;
	private final ModelRenderer gun12;
	private final ModelRenderer gun1;
	private final ModelRenderer Stock;
	private final ModelRenderer gun378;
	private final ModelRenderer gun378_r1;
	private final ModelRenderer gun377;
	private final ModelRenderer gun377_r1;
	private final ModelRenderer gun368;
	private final ModelRenderer gun367;
	private final ModelRenderer gun366;
	private final ModelRenderer gun365;
	private final ModelRenderer gun364;
	private final ModelRenderer gun363;
	private final ModelRenderer gun362;
	private final ModelRenderer gun361;
	private final ModelRenderer gun360;
	private final ModelRenderer gun359;
	private final ModelRenderer gun358;
	private final ModelRenderer GripArea;
	private final ModelRenderer gun294;
	private final ModelRenderer gun293;
	private final ModelRenderer gun292;
	private final ModelRenderer gun291;
	private final ModelRenderer gun290;
	private final ModelRenderer gun289;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer Handguard;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer Handguard_COMPACT;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer Handguard_KulaTactical_railmount;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer Suppressor;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer Action;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer mag;
	private final ModelRenderer mag3;
	private final ModelRenderer mag2;
	private final ModelRenderer mag1;

	public KBP9A91() {
		textureWidth = 220;
		textureHeight = 220;

		MainGUN = new ModelRenderer(this);
		MainGUN.setRotationPoint(0.0F, 24.0F, 0.0F);
		MainGUN.cubeList.add(new ModelBox(MainGUN, 123, 170, -2.0F, -39.6F, -48.51F, 1, 1, 19, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 46, 6, -2.0F, -39.6F, -43.21F, 1, 1, 5, 0.05F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 20, 45, -1.3F, -38.9F, -43.21F, 1, 1, 5, 0.05F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 40, 39, -2.7F, -38.9F, -43.21F, 1, 1, 5, 0.05F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 114, 31, -2.5F, -37.8F, -48.26F, 2, 2, 1, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 7, 0, -2.0F, -36.85F, -50.51F, 1, 3, 2, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 101, 45, -3.0F, -35.85F, -50.51F, 3, 1, 2, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 88, 77, -2.0F, -39.6F, -48.41F, 1, 1, 2, 0.05F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 90, 0, -2.7F, -38.9F, -48.41F, 1, 1, 2, 0.05F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 21, 94, -1.3F, -38.9F, -48.41F, 1, 1, 2, 0.05F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 112, 144, -2.0F, -38.2F, -48.51F, 1, 1, 19, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 167, 159, -2.7F, -38.9F, -48.51F, 1, 1, 19, 0.001F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 23, 152, -1.3F, -38.9F, -48.51F, 1, 1, 19, 0.001F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 0, 120, -0.7F, -37.0F, -34.5F, 1, 1, 2, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 57, 45, -0.8F, -36.9F, -34.5F, 1, 1, 5, -0.001F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 0, 23, -2.0F, -37.4F, -37.5F, 1, 1, 5, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 0, 7, -2.0F, -36.4F, -37.5F, 1, 1, 5, 0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 0, 99, -0.7F, -36.5F, -34.5F, 1, 1, 4, -0.001F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 21, 120, -0.7F, -37.0F, -30.5F, 1, 1, 2, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 40, 54, -3.2F, -36.9F, -34.5F, 1, 1, 5, -0.001F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 118, 0, -3.3F, -37.0F, -34.5F, 1, 1, 2, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 107, 81, -3.3F, -36.5F, -33.5F, 1, 1, 3, -0.001F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 123, 104, -3.3F, -37.0F, -30.5F, 1, 1, 1, 0.0F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 64, 48, -4.3F, -37.9F, -6.3F, 2, 1, 1, -0.2F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 47, 63, -4.3F, -37.9F, -11.7F, 2, 1, 1, -0.2F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 106, 31, -2.5F, -40.3F, -29.4F, 2, 1, 2, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 55, 100, -2.5F, -40.6F, -29.6F, 2, 2, 2, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 79, 39, -2.0F, -41.0F, -48.1F, 1, 2, 1, -0.4F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 108, 6, -1.7F, -40.4F, -48.6F, 1, 1, 2, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 112, 77, -1.3F, -41.1F, -48.3F, 1, 1, 1, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 27, 112, -1.3F, -41.1F, -47.9F, 1, 1, 1, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 110, 28, -2.7F, -41.1F, -48.3F, 1, 1, 1, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 110, 86, -2.7F, -41.1F, -47.9F, 1, 1, 1, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 108, 0, -2.3F, -40.4F, -48.6F, 1, 1, 2, -0.3F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 88, 96, -2.0F, -40.4F, -48.6F, 1, 1, 2, -0.301F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 24, 110, -2.0F, -40.1F, -48.1F, 1, 1, 1, -0.1F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 108, 20, -1.3F, -40.3F, -29.2F, 1, 1, 2, -0.301F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 19, 120, -1.3F, -40.3F, -29.4F, 1, 1, 1, -0.302F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 120, 91, -1.3F, -40.97F, -28.96F, 1, 1, 1, -0.299F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 120, 89, -1.3F, -40.67F, -28.96F, 1, 1, 1, -0.298F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 63, 120, -1.3F, -40.67F, -28.56F, 1, 1, 1, -0.298F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 112, 81, -2.7F, -40.3F, -29.4F, 1, 1, 1, -0.302F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 108, 14, -2.7F, -40.3F, -29.2F, 1, 1, 2, -0.301F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 68, 116, -2.7F, -40.67F, -28.96F, 1, 1, 1, -0.298F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 117, 42, -2.7F, -40.97F, -28.96F, 1, 1, 1, -0.299F, false));
		MainGUN.cubeList.add(new ModelBox(MainGUN, 117, 68, -2.7F, -40.67F, -28.56F, 1, 1, 1, -0.298F, false));

		gun94_r1 = new ModelRenderer(this);
		gun94_r1.setRotationPoint(-0.8F, -40.0F, -27.7F);
		MainGUN.addChild(gun94_r1);
		setRotationAngle(gun94_r1, -1.0297F, 0.0F, 0.0F);
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 120, 112, -0.7F, -0.3F, -1.3F, 1, 1, 1, -0.301F, false));
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 120, 114, -1.7F, -0.3F, -1.3F, 1, 1, 1, -0.301F, false));
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 120, 116, -1.7F, -0.3F, -1.1F, 1, 1, 1, -0.3F, false));
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 120, 118, -0.7F, -0.3F, -1.1F, 1, 1, 1, -0.3F, false));
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 26, 57, -1.7F, -0.3F, -0.7F, 2, 1, 1, -0.3F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(-2.2F, -40.0F, -27.7F);
		MainGUN.addChild(gun93_r1);
		setRotationAngle(gun93_r1, -1.0596F, 0.1856F, -0.3179F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 120, 108, -0.1F, -0.3F, -0.8F, 1, 1, 1, -0.301F, false));

		gun92_r1 = new ModelRenderer(this);
		gun92_r1.setRotationPoint(-0.8F, -40.0F, -27.7F);
		MainGUN.addChild(gun92_r1);
		setRotationAngle(gun92_r1, -1.0596F, -0.1856F, 0.3179F);
		gun92_r1.cubeList.add(new ModelBox(gun92_r1, 120, 110, -0.9F, -0.3F, -0.8F, 1, 1, 1, -0.301F, false));

		gun92_r2 = new ModelRenderer(this);
		gun92_r2.setRotationPoint(-2.6F, -40.0F, -27.5F);
		MainGUN.addChild(gun92_r2);
		setRotationAngle(gun92_r2, -0.8901F, 0.0F, 0.0F);
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 4, 120, -0.1F, -0.3F, -0.7F, 1, 1, 1, -0.3F, false));
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 117, 59, -0.1F, -0.3F, -1.1F, 1, 1, 1, -0.3F, false));
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 117, 56, -0.1F, -0.3F, -1.4F, 1, 1, 1, -0.301F, false));
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 120, 97, 1.3F, -0.3F, -1.4F, 1, 1, 1, -0.301F, false));
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 120, 100, 1.3F, -0.3F, -1.1F, 1, 1, 1, -0.3F, false));
		gun92_r2.cubeList.add(new ModelBox(gun92_r2, 120, 103, 1.3F, -0.3F, -0.7F, 1, 1, 1, -0.3F, false));

		gun94_r2 = new ModelRenderer(this);
		gun94_r2.setRotationPoint(-2.4F, -39.9F, -28.9F);
		MainGUN.addChild(gun94_r2);
		setRotationAngle(gun94_r2, 0.2094F, 0.0F, 0.0F);
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 26, 116, -0.3F, -0.7F, -0.3F, 1, 1, 1, -0.3F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 107, 113, -0.3F, -0.7F, -0.5F, 1, 1, 1, -0.301F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 101, 113, -0.3F, -1.0F, -0.5F, 1, 1, 1, -0.302F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 112, 108, -0.3F, -1.0F, -0.3F, 1, 1, 1, -0.301F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 57, 120, 1.1F, -0.7F, -0.5F, 1, 1, 1, -0.301F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 42, 120, 1.1F, -1.0F, -0.5F, 1, 1, 1, -0.302F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 120, 93, 1.1F, -1.0F, -0.3F, 1, 1, 1, -0.301F, false));
		gun94_r2.cubeList.add(new ModelBox(gun94_r2, 120, 95, 1.1F, -0.7F, -0.3F, 1, 1, 1, -0.3F, false));

		gun93_r2 = new ModelRenderer(this);
		gun93_r2.setRotationPoint(-2.0F, -39.7F, -48.3F);
		MainGUN.addChild(gun93_r2);
		setRotationAngle(gun93_r2, 0.0F, 0.0F, -2.0944F);
		gun93_r2.cubeList.add(new ModelBox(gun93_r2, 6, 99, -0.3F, -0.3F, -0.3F, 1, 1, 2, -0.301F, false));
		gun93_r2.cubeList.add(new ModelBox(gun93_r2, 98, 72, 0.1F, -0.3F, -0.3F, 1, 1, 2, -0.301F, false));

		gun93_r3 = new ModelRenderer(this);
		gun93_r3.setRotationPoint(-1.0F, -39.7F, -48.3F);
		MainGUN.addChild(gun93_r3);
		setRotationAngle(gun93_r3, 0.0F, 0.0F, 2.0944F);
		gun93_r3.cubeList.add(new ModelBox(gun93_r3, 21, 99, -1.1F, -0.3F, -0.3F, 1, 1, 2, -0.301F, false));
		gun93_r3.cubeList.add(new ModelBox(gun93_r3, 72, 100, -0.7F, -0.3F, -0.3F, 1, 1, 2, -0.301F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.1F, -37.1F, -11.5F);
		MainGUN.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.192F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 82, 96, -0.2F, -0.8F, -0.2F, 1, 1, 4, -0.202F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.1F, -37.1F, -5.5F);
		MainGUN.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.2618F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 107, 77, -0.2F, -0.8F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.3F, -37.0F, -34.5F);
		MainGUN.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.3665F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 118, 3, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 123, 96, 0.0F, -1.0F, 4.0F, 1, 1, 1, 0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.94F, -37.93F, -34.5F);
		MainGUN.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.8901F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 117, 65, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 123, 94, 0.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.2F, -36.9F, -37.5F);
		MainGUN.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.3665F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 97, 91, 0.0F, -1.0F, 3.0F, 1, 1, 4, 0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.84F, -37.83F, -38.5F);
		MainGUN.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.8901F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 54, 0.0F, -1.0F, 4.0F, 1, 1, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.2F, -35.9F, -37.5F);
		MainGUN.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.3665F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 94, 0.0F, 0.0F, 3.0F, 1, 1, 4, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.2F, -35.9F, -37.5F);
		MainGUN.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3665F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 15, 94, -1.0F, 0.0F, 3.0F, 1, 1, 4, 0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.2F, -36.9F, -37.5F);
		MainGUN.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.3665F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 97, 96, -1.0F, -1.0F, 3.0F, 1, 1, 4, 0.001F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.3F, -37.0F, -34.5F);
		MainGUN.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3665F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 120, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.002F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 120, -1.0F, -1.0F, 4.0F, 1, 1, 2, 0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.06F, -37.93F, -30.5F);
		MainGUN.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.8901F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 118, 24, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 120, 31, -1.0F, -1.0F, -4.0F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.16F, -37.83F, -38.5F);
		MainGUN.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, -0.8901F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 57, 39, -1.0F, -1.0F, 4.0F, 1, 1, 5, 0.0F, false));

		gun343_r1 = new ModelRenderer(this);
		gun343_r1.setRotationPoint(-2.0F, -37.2F, -48.51F);
		MainGUN.addChild(gun343_r1);
		setRotationAngle(gun343_r1, 0.0F, 0.0F, 0.7854F);
		gun343_r1.cubeList.add(new ModelBox(gun343_r1, 76, 113, -1.0F, -1.0F, 0.0F, 1, 1, 19, -0.001F, false));

		gun342_r1 = new ModelRenderer(this);
		gun342_r1.setRotationPoint(-1.0F, -37.2F, -48.51F);
		MainGUN.addChild(gun342_r1);
		setRotationAngle(gun342_r1, 0.0F, 0.0F, 0.7854F);
		gun342_r1.cubeList.add(new ModelBox(gun342_r1, 38, 80, -1.0F, -1.0F, 0.0F, 1, 1, 19, -0.001F, false));

		gun342_r2 = new ModelRenderer(this);
		gun342_r2.setRotationPoint(-2.0F, -39.6F, -48.51F);
		MainGUN.addChild(gun342_r2);
		setRotationAngle(gun342_r2, 0.0F, 0.0F, -0.7854F);
		gun342_r2.cubeList.add(new ModelBox(gun342_r2, 152, 103, -1.0F, 0.0F, 0.0F, 1, 1, 19, -0.001F, false));

		gun343_r2 = new ModelRenderer(this);
		gun343_r2.setRotationPoint(-1.0F, -39.6F, -53.41F);
		MainGUN.addChild(gun343_r2);
		setRotationAngle(gun343_r2, 0.0F, 0.0F, -0.7854F);
		gun343_r2.cubeList.add(new ModelBox(gun343_r2, 6, 94, -1.0F, 0.0F, 5.0F, 1, 1, 2, 0.052F, false));
		gun343_r2.cubeList.add(new ModelBox(gun343_r2, 46, 0, -1.0F, 0.0F, 10.2F, 1, 1, 5, 0.052F, false));
		gun343_r2.cubeList.add(new ModelBox(gun343_r2, 156, 139, -1.0F, 0.0F, 4.9F, 1, 1, 19, -0.001F, false));

		gun344_r1 = new ModelRenderer(this);
		gun344_r1.setRotationPoint(-2.0F, -39.6F, -53.41F);
		MainGUN.addChild(gun344_r1);
		setRotationAngle(gun344_r1, 0.0F, 0.0F, -0.7854F);
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 7, 89, -1.0F, 0.0F, 5.0F, 1, 1, 2, 0.051F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 40, 45, -1.0F, 0.0F, 10.2F, 1, 1, 5, 0.051F, false));

		gun342_r3 = new ModelRenderer(this);
		gun342_r3.setRotationPoint(-1.0F, -39.4F, -48.31F);
		MainGUN.addChild(gun342_r3);
		setRotationAngle(gun342_r3, 0.1745F, 0.0F, 0.0F);
		gun342_r3.cubeList.add(new ModelBox(gun342_r3, 79, 44, -1.0F, 0.2F, -2.2F, 1, 2, 1, -0.301F, false));

		gun342_r4 = new ModelRenderer(this);
		gun342_r4.setRotationPoint(-1.0F, -39.2F, -48.31F);
		MainGUN.addChild(gun342_r4);
		setRotationAngle(gun342_r4, 0.1745F, 0.0F, 0.0F);
		gun342_r4.cubeList.add(new ModelBox(gun342_r4, 104, 52, -1.0F, 1.4F, -2.1F, 1, 1, 3, -0.3F, false));
		gun342_r4.cubeList.add(new ModelBox(gun342_r4, 55, 104, -1.0F, 0.0F, -2.1F, 1, 1, 3, -0.3F, false));

		gun343_r3 = new ModelRenderer(this);
		gun343_r3.setRotationPoint(-1.0F, -33.85F, -50.51F);
		MainGUN.addChild(gun343_r3);
		setRotationAngle(gun343_r3, 0.0F, 0.0F, -0.7854F);
		gun343_r3.cubeList.add(new ModelBox(gun343_r3, 22, 116, 0.2F, -1.2F, 0.2F, 1, 1, 2, 0.201F, false));

		gun344_r2 = new ModelRenderer(this);
		gun344_r2.setRotationPoint(-2.0F, -33.85F, -50.51F);
		MainGUN.addChild(gun344_r2);
		setRotationAngle(gun344_r2, 0.0F, 0.0F, -0.7854F);
		gun344_r2.cubeList.add(new ModelBox(gun344_r2, 7, 116, 0.2F, -1.2F, 0.2F, 1, 1, 2, 0.201F, false));

		gun343_r4 = new ModelRenderer(this);
		gun343_r4.setRotationPoint(-2.0F, -36.85F, -50.51F);
		MainGUN.addChild(gun343_r4);
		setRotationAngle(gun343_r4, 0.0F, 0.0F, 0.7854F);
		gun343_r4.cubeList.add(new ModelBox(gun343_r4, 45, 116, 0.2F, 0.2F, 0.2F, 1, 1, 2, 0.201F, false));

		gun342_r5 = new ModelRenderer(this);
		gun342_r5.setRotationPoint(-1.0F, -36.85F, -50.51F);
		MainGUN.addChild(gun342_r5);
		setRotationAngle(gun342_r5, 0.0F, 0.0F, 0.7854F);
		gun342_r5.cubeList.add(new ModelBox(gun342_r5, 60, 116, 0.2F, 0.2F, 0.2F, 1, 1, 2, 0.201F, false));

		MainGunBARREL = new ModelRenderer(this);
		MainGunBARREL.setRotationPoint(0.0F, -0.2F, 0.0F);
		MainGUN.addChild(MainGunBARREL);
		

		gun285 = new ModelRenderer(this);
		gun285.setRotationPoint(-1.7F, -35.7F, -55.0F);
		MainGunBARREL.addChild(gun285);
		gun285.cubeList.add(new ModelBox(gun285, 167, 123, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun287 = new ModelRenderer(this);
		gun287.setRotationPoint(-2.0F, -36.0F, -55.0F);
		MainGunBARREL.addChild(gun287);
		gun287.cubeList.add(new ModelBox(gun287, 74, 162, 0.0F, 0.0F, -0.01F, 1, 1, 10, 0.0F, false));

		gun286 = new ModelRenderer(this);
		gun286.setRotationPoint(-1.8F, -35.9F, -55.0F);
		MainGunBARREL.addChild(gun286);
		gun286.cubeList.add(new ModelBox(gun286, 86, 163, 0.0F, 0.0F, 0.01F, 1, 1, 10, 0.0F, false));

		gun284 = new ModelRenderer(this);
		gun284.setRotationPoint(-2.3F, -35.7F, -55.0F);
		MainGunBARREL.addChild(gun284);
		gun284.cubeList.add(new ModelBox(gun284, 175, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun283 = new ModelRenderer(this);
		gun283.setRotationPoint(-2.2F, -35.5F, -55.0F);
		MainGunBARREL.addChild(gun283);
		gun283.cubeList.add(new ModelBox(gun283, 175, 11, 0.0F, 0.0F, -0.02F, 1, 1, 10, 0.0F, false));

		gun281 = new ModelRenderer(this);
		gun281.setRotationPoint(-2.0F, -35.4F, -55.0F);
		MainGunBARREL.addChild(gun281);
		gun281.cubeList.add(new ModelBox(gun281, 111, 175, 0.0F, 0.0F, 0.01F, 1, 1, 10, 0.0F, false));

		gun282 = new ModelRenderer(this);
		gun282.setRotationPoint(-1.8F, -35.5F, -55.0F);
		MainGunBARREL.addChild(gun282);
		gun282.cubeList.add(new ModelBox(gun282, 89, 175, 0.0F, 0.0F, -0.03F, 1, 1, 10, 0.0F, false));

		gun288 = new ModelRenderer(this);
		gun288.setRotationPoint(-2.2F, -35.9F, -55.0F);
		MainGunBARREL.addChild(gun288);
		gun288.cubeList.add(new ModelBox(gun288, 88, 149, 0.0F, 0.0F, 0.01F, 1, 1, 10, 0.0F, false));

		gun129HAMMER = new ModelRenderer(this);
		gun129HAMMER.setRotationPoint(-2.0F, -38.2F, 1.0F);
		MainGUN.addChild(gun129HAMMER);
		gun129HAMMER.cubeList.add(new ModelBox(gun129HAMMER, 120, 81, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun129HAMMER.cubeList.add(new ModelBox(gun129HAMMER, 88, 72, 0.0F, -0.3F, 0.2F, 1, 1, 2, -0.201F, false));
		gun129HAMMER.cubeList.add(new ModelBox(gun129HAMMER, 21, 87, 0.0F, 0.3F, 0.2F, 1, 1, 2, -0.201F, false));
		gun129HAMMER.cubeList.add(new ModelBox(gun129HAMMER, 73, 25, -0.3F, 0.0F, 0.2F, 1, 1, 2, -0.201F, false));
		gun129HAMMER.cubeList.add(new ModelBox(gun129HAMMER, 73, 3, 0.3F, 0.0F, 0.2F, 1, 1, 2, -0.201F, false));

		gun113trigger = new ModelRenderer(this);
		gun113trigger.setRotationPoint(-2.0F, -29.0F, -9.7F);
		MainGUN.addChild(gun113trigger);
		setRotationAngle(gun113trigger, -2.6397F, 0.0F, 0.0F);
		gun113trigger.cubeList.add(new ModelBox(gun113trigger, 23, 125, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun112TRIGGER = new ModelRenderer(this);
		gun112TRIGGER.setRotationPoint(-2.0F, -29.7F, -9.1F);
		MainGUN.addChild(gun112TRIGGER);
		setRotationAngle(gun112TRIGGER, -2.3051F, 0.0F, 0.0F);
		gun112TRIGGER.cubeList.add(new ModelBox(gun112TRIGGER, 125, 25, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun111TRIGGER = new ModelRenderer(this);
		gun111TRIGGER.setRotationPoint(-2.0F, -32.8F, -9.0F);
		MainGUN.addChild(gun111TRIGGER);
		setRotationAngle(gun111TRIGGER, -0.3718F, 0.0F, 0.0F);
		gun111TRIGGER.cubeList.add(new ModelBox(gun111TRIGGER, 27, 45, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun110TRIGGER = new ModelRenderer(this);
		gun110TRIGGER.setRotationPoint(-2.0F, -32.2F, -10.5F);
		MainGUN.addChild(gun110TRIGGER);
		setRotationAngle(gun110TRIGGER, 0.4461F, 0.0F, 0.0F);
		gun110TRIGGER.cubeList.add(new ModelBox(gun110TRIGGER, 15, 87, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.001F, false));

		gun392 = new ModelRenderer(this);
		gun392.setRotationPoint(-3.5F, -34.0F, -20.5F);
		MainGUN.addChild(gun392);
		gun392.cubeList.add(new ModelBox(gun392, 124, 66, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun391 = new ModelRenderer(this);
		gun391.setRotationPoint(-3.7F, -34.0F, -34.5F);
		MainGUN.addChild(gun391);
		gun391.cubeList.add(new ModelBox(gun391, 46, 15, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		gun390 = new ModelRenderer(this);
		gun390.setRotationPoint(-3.7F, -34.0F, -19.5F);
		MainGUN.addChild(gun390);
		gun390.cubeList.add(new ModelBox(gun390, 54, 100, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun389 = new ModelRenderer(this);
		gun389.setRotationPoint(-4.0F, -33.0F, -7.5F);
		MainGUN.addChild(gun389);
		setRotationAngle(gun389, 0.0F, 0.0F, -0.7854F);
		gun389.cubeList.add(new ModelBox(gun389, 68, 124, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun388 = new ModelRenderer(this);
		gun388.setRotationPoint(-4.0F, -34.0F, -7.5F);
		MainGUN.addChild(gun388);
		setRotationAngle(gun388, 0.0F, 0.0F, -0.7854F);
		gun388.cubeList.add(new ModelBox(gun388, 124, 72, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun387 = new ModelRenderer(this);
		gun387.setRotationPoint(-4.2F, -34.0F, -6.5F);
		MainGUN.addChild(gun387);
		setRotationAngle(gun387, 0.0F, 0.0F, -0.7854F);
		gun387.cubeList.add(new ModelBox(gun387, 124, 75, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun386 = new ModelRenderer(this);
		gun386.setRotationPoint(-4.2F, -33.0F, -6.5F);
		MainGUN.addChild(gun386);
		setRotationAngle(gun386, 0.0F, 0.0F, -0.7854F);
		gun386.cubeList.add(new ModelBox(gun386, 124, 78, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun385 = new ModelRenderer(this);
		gun385.setRotationPoint(-4.2F, -33.0F, -9.5F);
		MainGUN.addChild(gun385);
		setRotationAngle(gun385, 0.0F, 0.0F, -0.7854F);
		gun385.cubeList.add(new ModelBox(gun385, 65, 120, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun384 = new ModelRenderer(this);
		gun384.setRotationPoint(-4.2F, -34.0F, -9.5F);
		MainGUN.addChild(gun384);
		setRotationAngle(gun384, 0.0F, 0.0F, -0.7854F);
		gun384.cubeList.add(new ModelBox(gun384, 120, 72, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun383 = new ModelRenderer(this);
		gun383.setRotationPoint(-4.2F, -34.0F, -9.5F);
		MainGUN.addChild(gun383);
		gun383.cubeList.add(new ModelBox(gun383, 15, 99, 0.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));
		gun383.cubeList.add(new ModelBox(gun383, 19, 123, 0.2F, 0.0F, 4.5F, 1, 1, 1, -0.3F, false));
		gun383.cubeList.add(new ModelBox(gun383, 15, 123, 0.199F, 0.0F, -3.1F, 1, 1, 1, -0.3F, false));
		gun383.cubeList.add(new ModelBox(gun383, 8, 123, 0.199F, 0.0F, -3.85F, 1, 1, 1, -0.3F, false));
		gun383.cubeList.add(new ModelBox(gun383, 4, 123, 0.199F, 0.0F, -4.6F, 1, 1, 1, -0.3F, false));

		gun376 = new ModelRenderer(this);
		gun376.setRotationPoint(-3.0F, -37.0F, 1.7F);
		MainGUN.addChild(gun376);
		setRotationAngle(gun376, -0.2231F, 0.0F, 0.0F);
		gun376.cubeList.add(new ModelBox(gun376, 0, 39, 0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F, false));

		gun375 = new ModelRenderer(this);
		gun375.setRotationPoint(-3.0F, -32.4F, -14.0F);
		MainGUN.addChild(gun375);
		gun375.cubeList.add(new ModelBox(gun375, 15, 30, 0.0F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

		gun370 = new ModelRenderer(this);
		gun370.setRotationPoint(1.1F, -35.5F, -34.2F);
		MainGUN.addChild(gun370);
		setRotationAngle(gun370, 0.0F, 0.0F, 2.9371F);
		gun370.cubeList.add(new ModelBox(gun370, 120, 124, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun369 = new ModelRenderer(this);
		gun369.setRotationPoint(0.0F, -35.1F, -34.2F);
		MainGUN.addChild(gun369);
		gun369.cubeList.add(new ModelBox(gun369, 0, 125, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun357 = new ModelRenderer(this);
		gun357.setRotationPoint(-0.5F, -37.3F, 5.0F);
		MainGUN.addChild(gun357);
		gun357.cubeList.add(new ModelBox(gun357, 34, 12, -0.001F, 0.801F, 0.0F, 1, 4, 1, -0.001F, false));
		gun357.cubeList.add(new ModelBox(gun357, 0, 123, -0.01F, 0.01F, -0.75F, 1, 1, 1, 0.0F, false));
		gun357.cubeList.add(new ModelBox(gun357, 121, 62, -2.99F, 0.01F, -0.75F, 1, 1, 1, 0.0F, false));
		gun357.cubeList.add(new ModelBox(gun357, 33, 29, -2.999F, 0.801F, 0.0F, 1, 4, 1, -0.001F, false));

		gun361_r1 = new ModelRenderer(this);
		gun361_r1.setRotationPoint(-2.99F, 0.01F, -0.75F);
		gun357.addChild(gun361_r1);
		setRotationAngle(gun361_r1, -0.7854F, 0.0F, 0.0F);
		gun361_r1.cubeList.add(new ModelBox(gun361_r1, 121, 65, -0.009F, 0.1F, 0.0F, 1, 1, 1, -0.001F, false));
		gun361_r1.cubeList.add(new ModelBox(gun361_r1, 121, 59, -0.009F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun361_r1.cubeList.add(new ModelBox(gun361_r1, 122, 38, 2.989F, 0.1F, 0.0F, 1, 1, 1, -0.001F, false));
		gun361_r1.cubeList.add(new ModelBox(gun361_r1, 120, 122, 2.989F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun361_r2 = new ModelRenderer(this);
		gun361_r2.setRotationPoint(-2.99F, 0.01F, 0.25F);
		gun357.addChild(gun361_r2);
		setRotationAngle(gun361_r2, 0.7854F, 0.0F, 0.0F);
		gun361_r2.cubeList.add(new ModelBox(gun361_r2, 121, 56, -0.009F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		gun361_r2.cubeList.add(new ModelBox(gun361_r2, 121, 53, -0.009F, 0.1F, -1.0F, 1, 1, 1, -0.002F, false));
		gun361_r2.cubeList.add(new ModelBox(gun361_r2, 122, 24, 2.989F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		gun361_r2.cubeList.add(new ModelBox(gun361_r2, 121, 68, 2.989F, 0.1F, -1.0F, 1, 1, 1, -0.002F, false));

		gun356 = new ModelRenderer(this);
		gun356.setRotationPoint(-3.5F, -37.3F, 5.0F);
		MainGUN.addChild(gun356);
		

		gun355 = new ModelRenderer(this);
		gun355.setRotationPoint(-0.5F, -37.3F, 3.5F);
		MainGUN.addChild(gun355);
		gun355.cubeList.add(new ModelBox(gun355, 21, 16, 0.0F, 0.8F, 0.0F, 1, 4, 2, 0.001F, false));
		gun355.cubeList.add(new ModelBox(gun355, 21, 0, -3.0F, 0.8F, 0.0F, 1, 4, 2, 0.001F, false));

		gun354 = new ModelRenderer(this);
		gun354.setRotationPoint(-3.5F, -37.3F, 3.5F);
		MainGUN.addChild(gun354);
		

		gun353 = new ModelRenderer(this);
		gun353.setRotationPoint(-3.5F, -33.3F, 3.0F);
		MainGUN.addChild(gun353);
		gun353.cubeList.add(new ModelBox(gun353, 46, 30, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun339 = new ModelRenderer(this);
		gun339.setRotationPoint(-3.8F, -34.0F, -30.5F);
		MainGUN.addChild(gun339);
		gun339.cubeList.add(new ModelBox(gun339, 4, 125, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun338 = new ModelRenderer(this);
		gun338.setRotationPoint(-3.8F, -34.5F, -34.0F);
		MainGUN.addChild(gun338);
		gun338.cubeList.add(new ModelBox(gun338, 8, 125, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun337 = new ModelRenderer(this);
		gun337.setRotationPoint(0.4F, -33.8F, -33.0F);
		MainGUN.addChild(gun337);
		

		gun336 = new ModelRenderer(this);
		gun336.setRotationPoint(0.4F, -35.5F, -33.0F);
		MainGUN.addChild(gun336);
		gun336.cubeList.add(new ModelBox(gun336, 117, 31, -0.2F, -0.6F, -0.2F, 1, 1, 30, -0.2F, false));
		gun336.cubeList.add(new ModelBox(gun336, 152, 62, -0.2F, 1.6F, -0.2F, 1, 1, 23, -0.201F, false));
		gun336.cubeList.add(new ModelBox(gun336, 46, 15, -0.2F, 1.6F, 23.8F, 1, 1, 6, -0.201F, false));
		gun336.cubeList.add(new ModelBox(gun336, 61, 123, -0.2F, -0.6F, 29.25F, 1, 1, 1, -0.201F, false));
		gun336.cubeList.add(new ModelBox(gun336, 65, 123, -0.2F, 1.6F, 29.25F, 1, 1, 1, -0.202F, false));

		gun335 = new ModelRenderer(this);
		gun335.setRotationPoint(0.0F, -34.5F, -33.0F);
		MainGUN.addChild(gun335);
		gun335.cubeList.add(new ModelBox(gun335, 120, 72, -0.2F, 0.8F, 0.0F, 1, 1, 30, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 79, 64, -0.2F, -1.2F, 0.0F, 1, 2, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 57, 123, -0.2F, 0.0F, 1.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 53, 123, -0.2F, -1.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 123, 49, -0.2F, -1.3F, 7.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 123, 45, -0.201F, -1.5F, 19.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 42, 123, -0.201F, 0.5F, 19.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 46, 123, -0.201F, 0.7F, 7.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 23, 123, -0.2F, -1.3F, 28.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 38, 123, -0.201F, 0.7F, 28.0F, 1, 1, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 79, 55, -0.2F, -1.2F, 2.0F, 1, 2, 1, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 59, 80, -0.2F, -1.2F, 4.0F, 1, 2, 3, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 167, 87, -0.2F, -1.2F, 8.0F, 1, 2, 11, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 62, 15, -0.2F, -1.2F, 20.0F, 1, 2, 8, 0.0F, false));
		gun335.cubeList.add(new ModelBox(gun335, 79, 50, -0.2F, -1.2F, 29.0F, 1, 2, 1, 0.0F, false));

		gun314 = new ModelRenderer(this);
		gun314.setRotationPoint(-3.7F, -36.0F, -34.5F);
		MainGUN.addChild(gun314);
		gun314.cubeList.add(new ModelBox(gun314, 57, 54, 0.0F, 0.0F, 0.01F, 1, 1, 5, 0.0F, false));

		gun312 = new ModelRenderer(this);
		gun312.setRotationPoint(-2.0F, -38.5F, -34.5F);
		MainGUN.addChild(gun312);
		gun312.cubeList.add(new ModelBox(gun312, 120, 75, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun311 = new ModelRenderer(this);
		gun311.setRotationPoint(-3.5F, -29.0F, -20.0F);
		MainGUN.addChild(gun311);
		gun311.cubeList.add(new ModelBox(gun311, 46, 36, 0.0F, 0.0F, 0.0F, 4, 1, 1, -0.002F, false));

		gun310 = new ModelRenderer(this);
		gun310.setRotationPoint(-3.5F, -29.5F, -20.9F);
		MainGUN.addChild(gun310);
		gun310.cubeList.add(new ModelBox(gun310, 79, 60, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.001F, false));

		gun309 = new ModelRenderer(this);
		gun309.setRotationPoint(-0.7F, -30.0F, -29.0F);
		MainGUN.addChild(gun309);
		setRotationAngle(gun309, 1.4573F, 0.0F, 0.0F);
		gun309.cubeList.add(new ModelBox(gun309, 31, 16, 0.01F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		gun308 = new ModelRenderer(this);
		gun308.setRotationPoint(-3.3F, -30.0F, -29.0F);
		MainGUN.addChild(gun308);
		setRotationAngle(gun308, 1.4573F, 0.0F, 0.0F);
		gun308.cubeList.add(new ModelBox(gun308, 38, 80, 0.0F, -0.01F, 0.0F, 3, 5, 1, -0.001F, false));

		gun307 = new ModelRenderer(this);
		gun307.setRotationPoint(-0.7F, -32.0F, -29.0F);
		MainGUN.addChild(gun307);
		gun307.cubeList.add(new ModelBox(gun307, 84, 0, 0.0F, 0.0F, 0.01F, 1, 2, 4, 0.0F, false));

		gun306 = new ModelRenderer(this);
		gun306.setRotationPoint(-3.3F, -32.0F, -29.0F);
		MainGUN.addChild(gun306);
		gun306.cubeList.add(new ModelBox(gun306, 0, 108, 0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, false));

		gun305 = new ModelRenderer(this);
		gun305.setRotationPoint(-3.5F, -27.0F, -19.0F);
		MainGUN.addChild(gun305);
		setRotationAngle(gun305, 2.491F, 0.0F, 0.0F);
		gun305.cubeList.add(new ModelBox(gun305, 60, 30, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

		gun304 = new ModelRenderer(this);
		gun304.setRotationPoint(-3.5F, -29.5F, -25.0F);
		MainGUN.addChild(gun304);
		setRotationAngle(gun304, 1.3384F, 0.0F, 0.0F);
		gun304.cubeList.add(new ModelBox(gun304, 84, 6, 0.0F, 0.0F, 0.0F, 4, 5, 1, -0.002F, false));

		gun303 = new ModelRenderer(this);
		gun303.setRotationPoint(-3.5F, -32.5F, -25.0F);
		MainGUN.addChild(gun303);
		gun303.cubeList.add(new ModelBox(gun303, 76, 133, 0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F, false));

		gun302 = new ModelRenderer(this);
		gun302.setRotationPoint(-3.5F, -32.0F, -19.0F);
		MainGUN.addChild(gun302);
		gun302.cubeList.add(new ModelBox(gun302, 84, 14, 0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, false));

		gun301 = new ModelRenderer(this);
		gun301.setRotationPoint(-0.3F, -33.0F, 4.2F);
		MainGUN.addChild(gun301);
		setRotationAngle(gun301, -2.3562F, 0.0F, 0.0F);
		gun301.cubeList.add(new ModelBox(gun301, 19, 125, 0.01F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun300 = new ModelRenderer(this);
		gun300.setRotationPoint(-3.7F, -33.0F, 4.2F);
		MainGUN.addChild(gun300);
		setRotationAngle(gun300, -2.3562F, 0.0F, 0.0F);
		gun300.cubeList.add(new ModelBox(gun300, 56, 36, -0.01F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun299 = new ModelRenderer(this);
		gun299.setRotationPoint(-3.7F, -33.0F, 3.5F);
		MainGUN.addChild(gun299);
		gun299.cubeList.add(new ModelBox(gun299, 84, 24, 0.0F, -0.01F, 0.0F, 4, 1, 2, 0.0F, false));

		gun298 = new ModelRenderer(this);
		gun298.setRotationPoint(-0.3F, -33.0F, 3.5F);
		MainGUN.addChild(gun298);
		gun298.cubeList.add(new ModelBox(gun298, 120, 78, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun297 = new ModelRenderer(this);
		gun297.setRotationPoint(-3.0F, -27.9F, -14.5F);
		MainGUN.addChild(gun297);
		setRotationAngle(gun297, -2.3562F, 0.0F, 0.0F);
		gun297.cubeList.add(new ModelBox(gun297, 82, 108, 0.0F, 0.0F, 0.0F, 3, 2, 1, -0.002F, false));

		gun296 = new ModelRenderer(this);
		gun296.setRotationPoint(-3.0F, -27.9F, -15.5F);
		MainGUN.addChild(gun296);
		gun296.cubeList.add(new ModelBox(gun296, 48, 86, 0.0F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		gun295 = new ModelRenderer(this);
		gun295.setRotationPoint(-3.0F, -27.9F, -18.0F);
		MainGUN.addChild(gun295);
		gun295.cubeList.add(new ModelBox(gun295, 84, 20, 0.0F, 0.0F, 0.0F, 3, 1, 3, 0.001F, false));

		gun933 = new ModelRenderer(this);
		gun933.setRotationPoint(-3.8F, -37.5F, 2.2F);
		MainGUN.addChild(gun933);
		setRotationAngle(gun933, -0.9295F, 0.0F, 0.0F);
		gun933.cubeList.add(new ModelBox(gun933, 117, 45, -0.01F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun922 = new ModelRenderer(this);
		gun922.setRotationPoint(-1.2F, -37.5F, 2.2F);
		MainGUN.addChild(gun922);
		setRotationAngle(gun922, -0.9295F, 0.0F, 0.0F);
		gun922.cubeList.add(new ModelBox(gun922, 117, 49, 0.01F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		gun911 = new ModelRenderer(this);
		gun911.setRotationPoint(-1.2F, -39.3F, 0.88F);
		MainGUN.addChild(gun911);
		setRotationAngle(gun911, -0.9295F, 0.0F, 0.0F);
		gun911.cubeList.add(new ModelBox(gun911, 66, 100, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun900 = new ModelRenderer(this);
		gun900.setRotationPoint(-2.8F, -39.3F, 0.88F);
		MainGUN.addChild(gun900);
		setRotationAngle(gun900, -0.9295F, 0.0F, 0.0F);
		gun900.cubeList.add(new ModelBox(gun900, 102, 64, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun899 = new ModelRenderer(this);
		gun899.setRotationPoint(-2.0F, -39.8F, 0.5F);
		MainGUN.addChild(gun899);
		setRotationAngle(gun899, -0.9295F, 0.0F, 0.0F);
		gun899.cubeList.add(new ModelBox(gun899, 0, 60, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun96 = new ModelRenderer(this);
		gun96.setRotationPoint(-3.8F, -37.5F, -20.5F);
		MainGUN.addChild(gun96);
		setRotationAngle(gun96, 0.0F, 0.0F, -0.7436F);
		gun96.cubeList.add(new ModelBox(gun96, 52, 130, 0.0F, -0.01F, -0.01F, 1, 1, 9, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-3.8F, -37.5F, -12.0F);
		MainGUN.addChild(gun95);
		setRotationAngle(gun95, 0.0F, 0.0F, -0.7436F);
		gun95.cubeList.add(new ModelBox(gun95, 120, 122, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun94 = new ModelRenderer(this);
		gun94.setRotationPoint(-2.8F, -39.2F, -20.5F);
		MainGUN.addChild(gun94);
		setRotationAngle(gun94, 0.0F, 0.0F, 0.3346F);
		gun94.cubeList.add(new ModelBox(gun94, 0, 152, 0.0F, 0.0F, 0.0F, 1, 2, 21, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(0.8F, -37.5F, -29.5F);
		MainGUN.addChild(gun93);
		setRotationAngle(gun93, 0.0F, 0.0F, 2.3051F);
		gun93.cubeList.add(new ModelBox(gun93, 40, 60, 0.0F, 0.0F, -0.01F, 1, 1, 5, -0.001F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-0.17F, -39.25F, -29.5F);
		MainGUN.addChild(gun91);
		setRotationAngle(gun91, 0.0F, 0.0F, 1.3013F);
		gun91.cubeList.add(new ModelBox(gun91, 84, 0, 0.0F, 0.0F, 0.01F, 2, 1, 30, 0.0F, false));

		gun92 = new ModelRenderer(this);
		gun92.setRotationPoint(0.8F, -37.5F, -25.0F);
		MainGUN.addChild(gun92);
		setRotationAngle(gun92, 0.0F, 0.0F, 2.3051F);
		gun92.cubeList.add(new ModelBox(gun92, 147, 0, 0.0F, 0.0F, 0.0F, 1, 1, 26, 0.0F, false));

		gun90 = new ModelRenderer(this);
		gun90.setRotationPoint(-2.0F, -39.8F, -29.5F);
		MainGUN.addChild(gun90);
		setRotationAngle(gun90, 0.0F, 0.0F, 0.9295F);
		gun90.cubeList.add(new ModelBox(gun90, 120, 108, 0.0F, 0.0F, 0.001F, 1, 1, 30, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-1.0F, -39.8F, -29.5F);
		MainGUN.addChild(gun89);
		setRotationAngle(gun89, 0.0F, 0.0F, 0.5949F);
		gun89.cubeList.add(new ModelBox(gun89, 124, 139, 0.0F, 0.0F, 0.001F, 1, 1, 30, 0.0F, false));

		gun88 = new ModelRenderer(this);
		gun88.setRotationPoint(-2.0F, -39.8F, -29.5F);
		MainGUN.addChild(gun88);
		gun88.cubeList.add(new ModelBox(gun88, 80, 144, 0.0F, 0.0F, 0.0F, 1, 1, 30, 0.0F, false));

		gun74 = new ModelRenderer(this);
		gun74.setRotationPoint(-3.8F, -36.5F, -4.5F);
		MainGUN.addChild(gun74);
		gun74.cubeList.add(new ModelBox(gun74, 46, 22, 0.01F, 0.0F, 0.01F, 1, 1, 6, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-3.8F, -37.5F, -11.1F);
		MainGUN.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 0, 130, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		gun69 = new ModelRenderer(this);
		gun69.setRotationPoint(-3.8F, -37.5F, -20.5F);
		MainGUN.addChild(gun69);
		gun69.cubeList.add(new ModelBox(gun69, 176, 27, -0.01F, -0.01F, 0.0F, 1, 1, 10, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-0.2F, -37.5F, -25.0F);
		MainGUN.addChild(gun67);
		gun67.cubeList.add(new ModelBox(gun67, 118, 0, 0.0F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

		gun66 = new ModelRenderer(this);
		gun66.setRotationPoint(-0.2F, -37.5F, -29.5F);
		MainGUN.addChild(gun66);
		gun66.cubeList.add(new ModelBox(gun66, 57, 60, 0.01F, 0.0F, -0.02F, 1, 1, 5, 0.0F, false));

		gun65 = new ModelRenderer(this);
		gun65.setRotationPoint(-0.2F, -37.0F, -29.5F);
		MainGUN.addChild(gun65);
		gun65.cubeList.add(new ModelBox(gun65, 24, 70, 0.0F, 0.0F, -0.01F, 1, 1, 5, -0.001F, false));

		gun61 = new ModelRenderer(this);
		gun61.setRotationPoint(-3.8F, -36.0F, 2.5F);
		MainGUN.addChild(gun61);
		gun61.cubeList.add(new ModelBox(gun61, 76, 36, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-3.8F, -36.0F, -4.5F);
		MainGUN.addChild(gun60);
		gun60.cubeList.add(new ModelBox(gun60, 21, 0, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(0.0F, 1.0F, 0.0F);
		gun60.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -0.9076F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 117, 62, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.001F, false));

		gun58 = new ModelRenderer(this);
		gun58.setRotationPoint(-0.2F, -36.0F, 2.5F);
		MainGUN.addChild(gun58);
		gun58.cubeList.add(new ModelBox(gun58, 125, 33, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun56 = new ModelRenderer(this);
		gun56.setRotationPoint(-3.7F, -35.0F, -34.5F);
		MainGUN.addChild(gun56);
		gun56.cubeList.add(new ModelBox(gun56, 47, 150, 0.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));
		gun56.cubeList.add(new ModelBox(gun56, 149, 27, 0.002F, -0.4F, 5.0F, 1, 1, 25, 0.0F, false));

		gun47 = new ModelRenderer(this);
		gun47.setRotationPoint(-0.3F, -36.0F, -34.5F);
		MainGUN.addChild(gun47);
		gun47.cubeList.add(new ModelBox(gun47, 40, 39, 0.0F, 0.0F, 0.0F, 1, 1, 37, 0.0F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-3.7F, -35.0F, -9.5F);
		MainGUN.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 0, 0, 0.001F, -0.02F, 0.0F, 4, 3, 13, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-0.3F, -35.0F, -34.5F);
		MainGUN.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 0, 39, 0.0F, -0.01F, 0.001F, 1, 3, 38, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(-3.7F, -33.0F, -34.5F);
		MainGUN.addChild(gun39);
		gun39.cubeList.add(new ModelBox(gun39, 0, 0, 0.0F, 0.0F, 0.0F, 4, 1, 38, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-2.5F, -27.0F, -17.8F);
		MainGUN.addChild(gun28);
		setRotationAngle(gun28, 0.2603F, 0.0F, 0.0F);
		gun28.cubeList.add(new ModelBox(gun28, 120, 86, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-3.0F, -32.5F, -18.0F);
		MainGUN.addChild(gun25);
		gun25.cubeList.add(new ModelBox(gun25, 48, 80, 0.0F, 0.0F, 0.0F, 3, 5, 1, -0.001F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-3.0F, -32.5F, -17.5F);
		MainGUN.addChild(gun24);
		gun24.cubeList.add(new ModelBox(gun24, 15, 80, 0.0F, 0.0F, 0.0F, 3, 5, 2, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-2.5F, -26.8F, -14.5F);
		MainGUN.addChild(gun23);
		setRotationAngle(gun23, 2.4538F, 0.0F, 0.0F);
		gun23.cubeList.add(new ModelBox(gun23, 64, 57, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(-2.5F, -27.8F, -15.5F);
		MainGUN.addChild(gun20);
		setRotationAngle(gun20, 0.7436F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 64, 63, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-2.5F, -32.8F, -15.5F);
		MainGUN.addChild(gun18);
		gun18.cubeList.add(new ModelBox(gun18, 0, 30, 0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(-2.5F, -27.8F, -14.5F);
		MainGUN.addChild(gun17);
		gun17.cubeList.add(new ModelBox(gun17, 40, 68, 0.0F, 0.0F, 0.0F, 2, 1, 7, 0.001F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-2.5F, -27.5F, -6.7F);
		MainGUN.addChild(gun14);
		setRotationAngle(gun14, -2.3423F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 58, 74, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-2.5F, -32.5F, -7.5F);
		MainGUN.addChild(gun12);
		gun12.cubeList.add(new ModelBox(gun12, 15, 30, 0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-3.5F, -32.5F, -7.0F);
		MainGUN.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 38, 100, 0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F, false));

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun378 = new ModelRenderer(this);
		gun378.setRotationPoint(-3.7F, -37.0F, 4.3F);
		Stock.addChild(gun378);
		

		gun378_r1 = new ModelRenderer(this);
		gun378_r1.setRotationPoint(3.7F, 35.9F, -10.6F);
		gun378.addChild(gun378_r1);
		setRotationAngle(gun378_r1, -0.1745F, 0.0F, 0.0F);
		gun378_r1.cubeList.add(new ModelBox(gun378_r1, 124, 81, -3.7F, -37.0F, 4.3F, 1, 1, 1, 0.0F, false));

		gun377 = new ModelRenderer(this);
		gun377.setRotationPoint(-0.3F, -37.0F, 4.3F);
		Stock.addChild(gun377);
		

		gun377_r1 = new ModelRenderer(this);
		gun377_r1.setRotationPoint(0.3F, 35.9F, -10.6F);
		gun377.addChild(gun377_r1);
		setRotationAngle(gun377_r1, -0.1745F, 0.0F, 0.0F);
		gun377_r1.cubeList.add(new ModelBox(gun377_r1, 124, 100, -0.3F, -37.0F, 4.3F, 1, 1, 1, 0.0F, false));

		gun368 = new ModelRenderer(this);
		gun368.setRotationPoint(-0.8F, -30.5F, 36.5F);
		Stock.addChild(gun368);
		setRotationAngle(gun368, -1.2641F, 0.0F, 0.0F);
		gun368.cubeList.add(new ModelBox(gun368, 31, 8, 0.0F, 0.01F, 0.0F, 1, 2, 2, 0.0F, false));

		gun367 = new ModelRenderer(this);
		gun367.setRotationPoint(-3.2F, -30.5F, 36.5F);
		Stock.addChild(gun367);
		setRotationAngle(gun367, -1.2641F, 0.0F, 0.0F);
		gun367.cubeList.add(new ModelBox(gun367, 117, 34, 0.0F, 0.0F, 0.0F, 3, 2, 2, 0.0F, false));

		gun366 = new ModelRenderer(this);
		gun366.setRotationPoint(-0.8F, -30.5F, 36.5F);
		Stock.addChild(gun366);
		gun366.cubeList.add(new ModelBox(gun366, 69, 80, 0.0F, 0.01F, 0.0F, 1, 2, 3, 0.0F, false));

		gun365 = new ModelRenderer(this);
		gun365.setRotationPoint(-3.2F, -30.5F, 36.5F);
		Stock.addChild(gun365);
		gun365.cubeList.add(new ModelBox(gun365, 0, 80, 0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

		gun364 = new ModelRenderer(this);
		gun364.setRotationPoint(-3.2F, -30.5F, 39.5F);
		Stock.addChild(gun364);
		gun364.cubeList.add(new ModelBox(gun364, 76, 113, 0.0F, 0.0F, 0.0F, 3, 14, 1, 0.0F, false));

		gun363 = new ModelRenderer(this);
		gun363.setRotationPoint(-0.8F, -30.5F, 39.5F);
		Stock.addChild(gun363);
		gun363.cubeList.add(new ModelBox(gun363, 90, 113, 0.0F, 0.01F, -0.01F, 1, 14, 1, 0.0F, false));

		gun362 = new ModelRenderer(this);
		gun362.setRotationPoint(-3.2F, -33.0F, 5.5F);
		Stock.addChild(gun362);
		setRotationAngle(gun362, 1.4128F, 0.0F, 0.0F);
		gun362.cubeList.add(new ModelBox(gun362, 74, 13, -0.01F, 28.0F, -0.5F, 1, 7, 2, 0.0F, false));

		gun361 = new ModelRenderer(this);
		gun361.setRotationPoint(-0.8F, -33.0F, 5.5F);
		Stock.addChild(gun361);
		setRotationAngle(gun361, 1.4128F, 0.0F, 0.0F);
		gun361.cubeList.add(new ModelBox(gun361, 38, 100, 0.01F, 28.0F, -0.5F, 1, 7, 2, 0.0F, false));

		gun360 = new ModelRenderer(this);
		gun360.setRotationPoint(-2.5F, -32.6F, 5.5F);
		Stock.addChild(gun360);
		setRotationAngle(gun360, 1.4128F, 0.0F, 0.0F);
		gun360.cubeList.add(new ModelBox(gun360, 32, 39, 0.0F, 0.0F, 0.0F, 2, 35, 1, 0.0F, false));

		gun359 = new ModelRenderer(this);
		gun359.setRotationPoint(-3.2F, -33.0F, 5.5F);
		Stock.addChild(gun359);
		setRotationAngle(gun359, 1.4128F, 0.0F, 0.0F);
		gun359.cubeList.add(new ModelBox(gun359, 70, 39, 0.0F, 0.0F, 0.0F, 1, 30, 2, 0.0F, false));

		gun358 = new ModelRenderer(this);
		gun358.setRotationPoint(-0.8F, -33.0F, 5.5F);
		Stock.addChild(gun358);
		setRotationAngle(gun358, 1.4128F, 0.0F, 0.0F);
		gun358.cubeList.add(new ModelBox(gun358, 28, 80, 0.0F, 0.0F, 0.0F, 1, 30, 2, 0.0F, false));

		GripArea = new ModelRenderer(this);
		GripArea.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun294 = new ModelRenderer(this);
		gun294.setRotationPoint(-3.5F, -21.3F, 4.4F);
		GripArea.addChild(gun294);
		setRotationAngle(gun294, -1.673F, 0.0F, 0.0F);
		gun294.cubeList.add(new ModelBox(gun294, 66, 36, 0.0F, 0.0F, 1.7F, 4, 1, 1, -0.001F, false));

		gun293 = new ModelRenderer(this);
		gun293.setRotationPoint(-3.5F, -21.3F, 4.4F);
		GripArea.addChild(gun293);
		setRotationAngle(gun293, -1.673F, 0.0F, 0.0F);
		gun293.cubeList.add(new ModelBox(gun293, 0, 85, 0.0F, 0.0F, 0.0F, 4, 2, 2, 0.001F, false));

		gun292 = new ModelRenderer(this);
		gun292.setRotationPoint(-3.5F, -17.5F, -3.0F);
		GripArea.addChild(gun292);
		setRotationAngle(gun292, 0.8528F, 0.0F, 0.0F);
		gun292.cubeList.add(new ModelBox(gun292, 84, 31, 0.0F, 0.0F, 0.0F, 4, 1, 2, -0.001F, false));

		gun291 = new ModelRenderer(this);
		gun291.setRotationPoint(-3.5F, -17.5F, -3.0F);
		GripArea.addChild(gun291);
		setRotationAngle(gun291, 0.3695F, 0.0F, 0.0F);
		gun291.cubeList.add(new ModelBox(gun291, 0, 30, 0.0F, 0.5F, 0.0F, 4, 1, 7, 0.0F, false));

		gun290 = new ModelRenderer(this);
		gun290.setRotationPoint(-3.5F, -17.5F, -3.0F);
		GripArea.addChild(gun290);
		setRotationAngle(gun290, 0.3695F, 0.0F, 0.0F);
		gun290.cubeList.add(new ModelBox(gun290, 0, 68, 0.0F, 0.0F, 0.0F, 4, 1, 7, 0.001F, false));

		gun289 = new ModelRenderer(this);
		gun289.setRotationPoint(-3.5F, -28.0F, 0.0F);
		GripArea.addChild(gun289);
		setRotationAngle(gun289, -1.0038F, 0.0F, 0.0F);
		gun289.cubeList.add(new ModelBox(gun289, 149, 42, 0.0F, 0.0F, 0.0F, 4, 2, 8, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-3.5F, -30.7F, 0.67F);
		GripArea.addChild(gun11);
		setRotationAngle(gun11, -2.1564F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 82, 87, 0.0F, 0.0F, 0.0F, 4, 1, 2, -0.002F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(-3.5F, -31.5F, -0.4F);
		GripArea.addChild(gun10);
		gun10.cubeList.add(new ModelBox(gun10, 84, 28, 0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-3.5F, -27.5F, -7.0F);
		GripArea.addChild(gun9);
		setRotationAngle(gun9, 1.2269F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 101, 59, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-3.5F, -31.5F, -7.0F);
		GripArea.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 176, 38, 0.0F, 0.0F, 0.0F, 4, 4, 7, 0.001F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-3.5F, -31.5F, 2.0F);
		GripArea.addChild(gun3);
		setRotationAngle(gun3, -2.5281F, 0.0F, 0.0F);
		gun3.cubeList.add(new ModelBox(gun3, 62, 25, 0.0F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-3.5F, -27.5F, -6.0F);
		GripArea.addChild(gun2);
		setRotationAngle(gun2, 0.3695F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 133, 144, 0.0F, 0.0F, 0.0F, 4, 11, 6, 0.002F, false));

		Handguard = new ModelRenderer(this);
		Handguard.setRotationPoint(0.0F, -13.0F, -49.0F);
		Handguard.cubeList.add(new ModelBox(Handguard, 84, 0, -0.5F, 2.0F, 13.0F, 1, 2, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 53, 120, -0.5F, 1.5F, 12.0F, 1, 1, 2, 0.001F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 173, 100, -0.5F, -1.5F, 1.0F, 1, 4, 10, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 20, 45, -0.5F, -0.5F, 0.0F, 1, 3, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 40, 39, -0.5F, -0.5F, 11.0F, 1, 3, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 117, 53, -1.3F, 3.8F, 13.0F, 1, 1, 2, -0.001F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 108, 72, -2.7F, 3.8F, 13.0F, 2, 1, 2, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 9, 80, -3.5F, 2.0F, 13.0F, 1, 2, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 44, 120, -3.5F, 1.5F, 12.0F, 1, 1, 2, 0.001F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 144, 170, -3.5F, -1.5F, 1.0F, 1, 4, 10, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 20, 39, -3.5F, -0.5F, 0.0F, 1, 3, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 27, 39, -3.5F, -0.5F, 11.0F, 1, 3, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.5F, 4.0F, 13.0F);
		Handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 1.4661F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 109, 113, 0.0F, -13.0F, 0.0F, 1, 13, 2, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 116, 3.0F, -13.0F, 0.0F, 1, 13, 2, -0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.5F, -0.5F, 12.0F);
		Handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 123, 119, 0.0F, -1.4F, -0.999F, 1, 1, 1, -0.003F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 123, 117, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 52, 3.0F, -1.4F, -0.999F, 1, 1, 1, -0.003F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 41, 3.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.5F, -0.5F, 0.0F);
		Handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 123, 115, 0.0F, -1.4F, -0.001F, 1, 1, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 123, 113, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 54, 3.0F, -1.4F, -0.001F, 1, 1, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 63, 3.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.6F, 1.1F, 10.0F);
		Handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7069F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 123, 111, 0.0F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 110, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 123, 123, 3.2F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 63, 116, 3.2F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.6F, 0.5F, 2.6F);
		Handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7069F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 123, 109, 0.0F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 108, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 31, 3.2F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 117, 38, 3.2F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.6F, 0.5F, 2.6F);
		Handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1047F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 89, -0.1F, -0.3F, 1.0F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 80, -0.1F, 0.5F, 2.1F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 80, 0.0F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 89, 3.3F, 0.5F, 2.1F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 36, 3.3F, -0.3F, 1.0F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 50, 3.2F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.6F, 2.9F, 5.4F);
		Handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1047F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 68, 0.0F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 97, 77, 3.2F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.5F, 4.0F, 14.0F);
		Handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.5585F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 80, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.5F, 1.5F, 14.0F);
		Handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 120, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.002F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 59, 120, 3.0F, -1.0F, -2.0F, 1, 1, 2, -0.002F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 123, 90, -1.2F, -0.9F, 0.1F, 1, 1, 1, 0.05F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.4979F, 0.0753F, 0.8001F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 84, 113, -1.2F, -13.0F, -0.1F, 1, 13, 2, 0.05F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.4661F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 108, 89, -0.2F, -13.0F, 0.0F, 2, 13, 2, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 103, 113, 1.2F, -13.0F, 0.0F, 1, 13, 2, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 123, 92, 0.2F, -0.9F, 0.1F, 1, 1, 1, 0.05F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 1.4979F, -0.0753F, -0.8001F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 97, 113, 0.2F, -13.0F, -0.1F, 1, 13, 2, 0.05F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.5F, 4.0F, 14.0F);
		Handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.5585F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 82, 77, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		Handguard_COMPACT = new ModelRenderer(this);
		Handguard_COMPACT.setRotationPoint(1.0F, -11.8F, -34.5F);
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 27, 30, -0.8F, -0.5F, -1.0F, 1, 3, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 62, 15, -1.95F, -3.5F, -4.35F, 1, 4, 3, 0.05F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 0, 23, -1.95F, -3.0F, -1.25F, 1, 4, 1, 0.05F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 109, 52, -1.8F, -2.9F, -1.0F, 1, 1, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 44, 152, -1.8F, -3.9F, -13.0F, 1, 1, 12, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 21, 23, -1.8F, -2.9F, -14.0F, 1, 4, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 21, 104, -1.8F, 0.7F, -14.0F, 1, 1, 1, -0.002F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 109, 48, -3.0F, 1.7F, -14.0F, 1, 1, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 0, 7, -4.2F, -2.9F, -14.0F, 1, 4, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 91, 82, -4.2F, 0.7F, -14.0F, 1, 1, 1, -0.002F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 74, 149, -4.2F, -3.9F, -13.0F, 1, 1, 12, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 93, 21, -4.2F, -2.9F, -1.0F, 1, 1, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 21, 8, -5.2F, -0.5F, -1.0F, 1, 3, 1, 0.0F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 30, 0, -4.05F, -3.5F, -4.35F, 1, 4, 3, 0.05F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 0, 16, -4.05F, -3.0F, -1.25F, 1, 4, 1, 0.05F, false));
		Handguard_COMPACT.cubeList.add(new ModelBox(Handguard_COMPACT, 0, 110, -3.0F, 2.7F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-5.2F, 2.5F, -1.0F);
		Handguard_COMPACT.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.5061F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 46, 3, 1.5F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 32, 36, 0.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.2F, 2.5F, -1.0F);
		Handguard_COMPACT.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, -0.5061F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 109, 104, -2.5F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 7, 57, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-5.2F, 2.5F, -1.0F);
		Handguard_COMPACT.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, -0.0175F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 152, 1.28F, -6.0F, -12.05F, 1, 4, 9, 0.05F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-5.2F, -0.5F, -1.0F);
		Handguard_COMPACT.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, 0.5236F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 54, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-4.2F, -3.9F, -1.0F);
		Handguard_COMPACT.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.7854F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 93, 19, 0.0F, 0.4F, -1.0F, 1, 1, 1, 0.002F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 93, 11, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 100, 108, 2.4F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 94, 108, 2.4F, 0.4F, -1.0F, 1, 1, 1, 0.002F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-4.2F, -3.9F, -13.0F);
		Handguard_COMPACT.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.7854F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 93, 5, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 91, 84, 0.0F, 0.4F, 0.0F, 1, 1, 1, 0.002F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 106, 108, 2.4F, 0.4F, 0.0F, 1, 1, 1, 0.002F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 109, 36, 2.4F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-4.2F, 1.7F, -13.0F);
		Handguard_COMPACT.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, -0.8727F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 91, 0.0F, 0.55F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 74, 89, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.2F, -0.5F, -1.0F);
		Handguard_COMPACT.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.5236F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 73, 71, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-0.8F, 1.7F, -13.0F);
		Handguard_COMPACT.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 0.8727F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 109, 40, -1.0F, 0.55F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 109, 45, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.2F, 2.5F, -1.0F);
		Handguard_COMPACT.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0175F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 0, 175, -2.28F, -6.0F, -12.05F, 1, 4, 9, 0.05F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.05F, 1.5F, -3.0F);
		Handguard_COMPACT.addChild(bone5);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-0.8F, -1.0F, -9.5F);
		bone5.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.045F, 0.0748F, -0.5427F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 17, 60, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-0.8F, 0.0F, -9.5F);
		bone5.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0873F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 60, 104, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-0.8F, 0.0F, -9.5F);
		bone5.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.045F, 0.0748F, 0.5427F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 104, 56, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-0.6F, -1.0F, -7.5F);
		bone5.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.045F, 0.0748F, -0.5427F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 40, 60, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.6F, 0.0F, -7.5F);
		bone5.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0873F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 24, 105, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.6F, 0.0F, -7.5F);
		bone5.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.045F, 0.0748F, 0.5427F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 97, 93, -1.0F, 0.15F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 9, 105, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-0.45F, 0.0F, -5.5F);
		bone5.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.045F, 0.0748F, 0.5427F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 107, 62, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 73, 105, -1.0F, 0.25F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-0.45F, 0.0F, -5.5F);
		bone5.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0873F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 106, 28, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-0.45F, -1.0F, -5.5F);
		bone5.addChild(cube_r46);
		setRotationAngle(cube_r46, -0.045F, 0.0748F, -0.5427F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 57, 60, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-0.25F, -1.0F, -3.5F);
		bone5.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.045F, 0.0748F, -0.5427F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 63, 7, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-0.25F, 0.0F, -3.5F);
		bone5.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.045F, 0.0748F, 0.5427F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 108, 9, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 108, -1.0F, 0.4F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-0.25F, 0.0F, -3.5F);
		bone5.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0873F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 108, 3, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-0.1F, 0.0F, -1.5F);
		bone5.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.045F, 0.0748F, 0.5427F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 24, 108, -1.0F, 0.5F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 108, 23, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-0.1F, -1.0F, -1.5F);
		bone5.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.045F, 0.0748F, -0.5427F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 51, 68, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.1F, 0.0F, -1.5F);
		bone5.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0873F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 108, 17, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.1F, 0.0F, 0.5F);
		bone5.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.045F, 0.0748F, 0.5427F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 108, 56, -1.0F, 0.7F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 108, 64, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.1F, -1.0F, 0.5F);
		bone5.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.045F, 0.0748F, -0.5427F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 24, 70, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.1F, 0.0F, 0.5F);
		bone5.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0873F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 108, 66, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-5.05F, 1.5F, -3.0F);
		Handguard_COMPACT.addChild(bone6);
		

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.8F, -1.0F, -9.5F);
		bone6.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.045F, -0.0748F, 0.5427F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 17, 54, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.8F, 0.0F, -9.5F);
		bone6.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, -0.0873F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 101, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.8F, 0.0F, -9.5F);
		bone6.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.045F, -0.0748F, -0.5427F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 15, 101, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.6F, -1.0F, -7.5F);
		bone6.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.045F, -0.0748F, 0.5427F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 40, 54, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.6F, 0.0F, -7.5F);
		bone6.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, -0.0873F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 88, 101, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.6F, 0.0F, -7.5F);
		bone6.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.045F, -0.0748F, -0.5427F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 102, 28, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.45F, 0.0F, -5.5F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.045F, -0.0748F, -0.5427F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 102, 64, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 102, 66, 0.0F, 0.1F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.45F, 0.0F, -5.5F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, -0.0873F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 66, 102, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.45F, -1.0F, -5.5F);
		bone6.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.045F, -0.0748F, 0.5427F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 57, 39, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.25F, -1.0F, -3.5F);
		bone6.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.045F, -0.0748F, 0.5427F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 57, 45, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.25F, 0.0F, -3.5F);
		bone6.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.045F, -0.0748F, -0.5427F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 91, 102, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 24, 103, 0.0F, 0.3F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.25F, 0.0F, -3.5F);
		bone6.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, -0.0873F, 0.0F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 9, 103, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.1F, 0.0F, -1.5F);
		bone6.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.045F, -0.0748F, -0.5427F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 103, 91, 0.0F, 0.4F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 103, 93, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.1F, -1.0F, -1.5F);
		bone6.addChild(cube_r69);
		setRotationAngle(cube_r69, -0.045F, -0.0748F, 0.5427F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 57, 54, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.1F, 0.0F, -1.5F);
		bone6.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, -0.0873F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 103, 96, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-0.1F, 0.0F, 0.5F);
		bone6.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.045F, -0.0748F, -0.5427F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 103, 98, 0.0F, 0.5F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 103, 101, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-0.1F, -1.0F, 0.5F);
		bone6.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.045F, -0.0748F, 0.5427F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 60, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-0.1F, 0.0F, 0.5F);
		bone6.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, -0.0873F, 0.0F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 6, 104, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.05F, 3.6F, -3.0F);
		Handguard_COMPACT.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -1.5708F);
		

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.8F, 0.0F, -9.5F);
		bone7.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, -0.0873F, 0.0F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 98, 28, 0.0F, -0.95F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.8F, 0.0F, -9.5F);
		bone7.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.045F, -0.0748F, -0.5427F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 82, 98, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.6F, 0.0F, -7.5F);
		bone7.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, -0.0873F, 0.0F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 97, 98, 0.0F, -0.95F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.6F, 0.0F, -7.5F);
		bone7.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.045F, -0.0748F, -0.5427F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 97, 96, 0.0F, 0.15F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 99, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.45F, 0.0F, -5.5F);
		bone7.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.045F, -0.0748F, -0.5427F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 99, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 99, 6, 0.0F, 0.25F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.45F, 0.0F, -5.5F);
		bone7.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, -0.0873F, 0.0F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 99, 2, 0.0F, -0.95F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.25F, 0.0F, -3.5F);
		bone7.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.045F, -0.0748F, -0.5427F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 99, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 15, 99, 0.0F, 0.4F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.25F, 0.0F, -3.5F);
		bone7.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, -0.0873F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 99, 14, 0.0F, -0.95F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.1F, 0.0F, -1.5F);
		bone7.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.045F, -0.0748F, -0.5427F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 99, 16, 0.0F, 0.5F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 99, 20, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.1F, 0.0F, -1.5F);
		bone7.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, -0.0873F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 99, 22, 0.0F, -0.95F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-0.1F, 0.0F, 0.5F);
		bone7.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.045F, -0.0748F, -0.5427F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 42, 100, 0.0F, 0.6F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 66, 100, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-0.1F, 0.0F, 0.5F);
		bone7.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, -0.0873F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 91, 100, 0.0F, -0.95F, 0.0F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-2.95F, 3.6F, -3.0F);
		Handguard_COMPACT.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 1.5708F);
		

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-0.8F, 0.0F, -9.5F);
		bone11.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.045F, 0.0748F, 0.5427F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 53, 93, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-0.6F, 0.0F, -7.5F);
		bone11.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.045F, 0.0748F, 0.5427F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 74, 93, -1.0F, 0.15F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 0, 94, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-0.45F, 0.0F, -5.5F);
		bone11.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.045F, 0.0748F, 0.5427F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 15, 94, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 94, 28, -1.0F, 0.25F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-0.25F, 0.0F, -3.5F);
		bone11.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.045F, 0.0748F, 0.5427F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 94, 64, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 94, 66, -1.0F, 0.4F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-0.1F, 0.0F, -1.5F);
		bone11.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.045F, 0.0748F, 0.5427F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 96, -1.0F, 0.5F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 15, 96, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.1F, 0.0F, 0.5F);
		bone11.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.045F, 0.0748F, 0.5427F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 82, 96, -1.0F, 0.6F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 97, 91, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.2F, 1.0F, -1.0F);
		Handguard_COMPACT.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0873F, 0.0F);
		

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 68.8F, 0.0F);
		bone8.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, -0.0628F, 1.0821F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 40, 54, -63.6269F, -32.2996F, -9.0857F, 2, 1, 13, -0.001F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, -0.0628F, -1.0821F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 120, 72, -2.0F, -1.0F, -12.9F, 1, 1, 13, 0.001F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, -1.0821F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 120, 86, -1.0F, -1.0F, -13.0F, 1, 1, 13, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, 1.0821F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 120, 108, -1.0F, 0.0F, -13.0F, 1, 1, 13, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-5.2F, 1.0F, -1.0F);
		Handguard_COMPACT.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.0873F, 0.0F);
		

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.0F, 68.8F, 0.0F);
		bone10.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0628F, -1.0821F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 84, 0, 61.6269F, -32.2996F, -9.0857F, 1, 1, 13, -0.001F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0628F, 1.0821F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 84, 14, 1.0F, -1.0F, -12.9F, 1, 1, 13, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, 1.0821F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 82, 91, 0.0F, -1.0F, -13.0F, 1, 1, 13, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, -1.0821F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 0, 94, 0.0F, 0.0F, -13.0F, 1, 1, 13, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.5F, 3.7F, -1.0F);
		Handguard_COMPACT.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0873F, 1.5708F);
		

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0F, 68.8F, 0.0F);
		bone9.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, -0.0628F, 1.0821F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 0, 116, -62.6269F, -32.2996F, -9.0857F, 1, 1, 13, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, -0.0628F, -1.0821F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 38, 116, -2.0F, -1.0F, -12.9F, 1, 1, 13, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, -1.0821F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 117, 31, -1.0F, -1.0F, -13.0F, 1, 1, 13, -0.001F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, 1.0821F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 117, 45, -1.0F, 0.0F, -13.0F, 1, 1, 13, -0.001F, false));

		Handguard_KulaTactical_railmount = new ModelRenderer(this);
		Handguard_KulaTactical_railmount.setRotationPoint(-3.75F, -7.9F, -35.5F);
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 82, 91, 0.0F, -4.001F, 0.0F, 4, 4, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 64, 39, 0.75F, -1.08F, -0.8F, 3, 1, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 0, 16, 0.25F, -1.25F, -13.3F, 4, 1, 13, -0.251F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 7, 16, 0.0F, -3.0F, -2.0F, 1, 2, 2, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 15, 104, 0.0F, -4.0F, -2.0F, 2, 1, 2, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 73, 0, -0.8F, -3.7F, -8.7F, 2, 2, 1, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 99, 20, -0.8F, -2.7F, -8.3F, 2, 1, 5, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 79, 55, -0.8F, -3.5F, -8.3F, 2, 1, 4, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 104, 86, -0.8F, -3.5F, -5.7F, 2, 1, 2, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 79, 50, -0.8F, -4.3F, -8.3F, 2, 1, 4, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 79, 44, -0.8F, -5.1F, -8.4F, 2, 1, 4, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 53, 9, -0.8F, -4.3F, -5.1F, 2, 1, 1, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 97, 81, -0.3F, -4.3F, -3.4F, 1, 1, 3, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 94, 36, -0.3F, -5.1F, -3.7F, 1, 1, 3, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 99, 0, -0.25F, -5.5F, -5.35F, 2, 1, 5, -0.25F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 40, 68, -0.3F, -5.1F, -1.3F, 2, 2, 1, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 8, 46, -0.3F, -5.1F, -1.55F, 1, 2, 1, -0.303F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 97, 77, -0.3F, -3.5F, -3.4F, 1, 1, 3, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 72, 7, -0.3F, -3.1F, -2.8F, 1, 2, 3, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 40, 71, -0.8F, -5.1F, -8.7F, 2, 2, 1, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 0, 39, 0.0F, -4.8F, -13.102F, 4, 3, 12, -0.05F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 82, 77, -0.25F, -4.4F, -12.8F, 1, 2, 4, -0.1F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 88, 66, -0.55F, -4.1F, -12.8F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 88, 64, -0.55F, -4.1F, -12.3F, 1, 1, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 87, 50, -0.55F, -3.7F, -12.8F, 1, 1, 1, -0.002F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 87, 52, -0.55F, -3.7F, -12.3F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 76, 28, -0.55F, -4.1F, -9.8F, 1, 1, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 23, 80, -0.55F, -4.1F, -10.3F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 87, 39, -0.55F, -3.7F, -10.3F, 1, 1, 1, -0.002F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 87, 41, -0.55F, -3.7F, -9.8F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 93, 64, 0.0F, -5.35F, -13.1F, 2, 1, 5, -0.051F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 51, 68, 0.0F, -2.1F, -13.102F, 4, 1, 5, -0.051F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 0, 0, 3.5F, -4.0F, 0.0F, 1, 4, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 0, 54, 1.25F, -1.3F, -13.0F, 2, 1, 13, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 69, 85, 1.25F, -0.9F, -13.3F, 2, 1, 2, -0.2F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 59, 85, 1.25F, -0.9F, -8.1F, 2, 1, 2, -0.2F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 71, 30, 1.25F, -0.9F, -5.5F, 2, 1, 2, -0.2F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 0, 89, 1.25F, -0.9F, -2.9F, 2, 1, 3, -0.2F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 84, 36, 1.25F, -0.9F, -10.7F, 2, 1, 2, -0.2F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 7, 7, 3.5F, -3.0F, -2.0F, 1, 2, 2, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 7, 54, 3.5F, -4.0F, -2.0F, 1, 1, 2, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 54, 15, 3.3F, -3.7F, -8.7F, 2, 2, 1, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 17, 60, 3.3F, -2.7F, -8.3F, 2, 1, 5, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 0, 46, 3.3F, -3.5F, -8.3F, 2, 1, 4, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 82, 101, 3.3F, -3.5F, -5.7F, 2, 1, 2, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 65, 71, 3.3F, -4.3F, -8.3F, 2, 1, 4, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 79, 39, 3.3F, -5.1F, -8.4F, 2, 1, 4, -0.3F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 47, 42, 3.3F, -4.3F, -5.1F, 2, 1, 1, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 48, 93, 3.8F, -4.3F, -3.4F, 1, 1, 3, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 59, 93, 3.8F, -5.1F, -3.7F, 1, 1, 3, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 63, 7, 2.75F, -5.5F, -5.35F, 2, 1, 5, -0.25F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 26, 54, 2.8F, -5.1F, -1.3F, 2, 2, 1, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 46, 0, 3.8F, -5.1F, -1.55F, 1, 2, 1, -0.303F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 69, 93, 3.8F, -3.5F, -3.4F, 1, 1, 3, -0.302F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 30, 23, 3.8F, -3.1F, -2.8F, 1, 2, 3, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 47, 54, 3.3F, -5.1F, -8.7F, 2, 2, 1, -0.301F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 38, 130, 3.5F, -4.8F, -13.1F, 1, 3, 12, -0.05F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 27, 30, 3.75F, -4.4F, -12.8F, 1, 2, 4, -0.1F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 40, 48, 4.05F, -4.1F, -12.8F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 17, 57, 4.05F, -4.1F, -12.3F, 1, 1, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 57, 42, 4.05F, -3.7F, -12.8F, 1, 1, 1, -0.002F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 57, 48, 4.05F, -3.7F, -12.3F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 63, 10, 4.05F, -4.1F, -9.8F, 1, 1, 1, 0.0F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 40, 63, 4.05F, -4.1F, -10.3F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 57, 63, 4.05F, -3.7F, -10.3F, 1, 1, 1, -0.002F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 51, 71, 4.05F, -3.7F, -9.8F, 1, 1, 1, -0.001F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 79, 64, 2.5F, -5.35F, -13.1F, 2, 1, 5, -0.051F, false));
		Handguard_KulaTactical_railmount.cubeList.add(new ModelBox(Handguard_KulaTactical_railmount, 20, 39, 3.5F, -2.1F, -13.1F, 1, 1, 5, -0.051F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(3.8F, -6.65F, -13.1F);
		Handguard_KulaTactical_railmount.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, 1.1694F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 147, 0, -1.3F, -0.3F, 0.25F, 1, 1, 12, -0.301F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 79, 50, -1.1F, -0.3F, -0.25F, 1, 1, 13, -0.3F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 79, 36, -0.7F, -0.3F, -0.25F, 1, 1, 13, -0.301F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(3.8F, -6.65F, -13.1F);
		Handguard_KulaTactical_railmount.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, -0.1222F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 40, 39, -1.7F, -0.3F, -0.25F, 2, 2, 13, -0.3F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(5.05F, -2.7F, -10.3F);
		Handguard_KulaTactical_railmount.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, 0.6807F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 64, 71, -0.7F, -0.3F, 0.8F, 1, 1, 1, -0.3F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 63, 3, -0.7F, -0.3F, -0.3F, 1, 1, 2, -0.301F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 47, 60, -0.7F, -0.3F, -2.8F, 1, 1, 2, -0.301F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 57, 57, -0.7F, -0.3F, -1.7F, 1, 1, 1, -0.3F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(5.05F, -4.1F, -10.3F);
		Handguard_KulaTactical_railmount.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, -0.6807F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 63, 0, -0.7F, -0.7F, -0.3F, 1, 1, 2, -0.302F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 17, 63, -0.7F, -0.7F, 0.8F, 1, 1, 1, -0.301F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 57, -0.7F, -0.7F, -1.7F, 1, 1, 1, -0.301F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 26, 60, -0.7F, -0.7F, -2.8F, 1, 1, 2, -0.302F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(5.05F, -3.1F, -9.85F);
		Handguard_KulaTactical_railmount.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.4887F, 0.0F, 0.0F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 0, 63, -0.75F, -0.9F, -0.4F, 1, 1, 1, -0.2F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 24, 73, -5.85F, -0.9F, -0.4F, 1, 1, 1, -0.2F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(5.05F, -3.1F, -12.35F);
		Handguard_KulaTactical_railmount.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.4887F, 0.0F, 0.0F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 40, 57, -0.75F, -0.9F, -0.4F, 1, 1, 1, -0.2F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 87, 46, -5.85F, -0.9F, -0.4F, 1, 1, 1, -0.2F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(5.0F, -1.25F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, -0.6283F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 7, 60, -1.7F, -2.45F, -0.3F, 2, 2, 1, -0.301F, false));
		cube_r110.cubeList.add(new ModelBox(cube_r110, 57, 30, -1.7F, -3.85F, -0.3F, 2, 2, 1, -0.301F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(4.4F, -3.6F, -3.1F);
		Handguard_KulaTactical_railmount.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.7854F, 0.0F, 0.0F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 47, 48, -1.7F, 1.0F, 1.5F, 2, 1, 1, -0.2F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 53, 3, -4.6F, 1.0F, 1.5F, 2, 1, 1, -0.2F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(5.0F, -2.8F, -4.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0372F, -0.2944F, -0.1277F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 54, 25, -0.7F, -0.3F, 1.0F, 1, 1, 2, -0.3F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 38, 93, -0.7F, 1.08F, 1.8F, 1, 1, 3, -0.302F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 69, 89, -0.7F, 0.9F, 1.5F, 1, 1, 3, -0.301F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 59, 89, -0.7F, 0.5F, 0.8F, 1, 1, 3, -0.301F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 101, 72, -1.7F, 0.1F, 0.1F, 2, 1, 3, -0.3F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 94, 59, -1.7F, -2.32F, -1.0F, 2, 1, 3, -0.3F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 94, 45, -1.7F, -1.5F, -0.7F, 2, 1, 3, -0.3F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 91, 72, -1.7F, -0.7F, -0.3F, 2, 1, 3, -0.3F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(5.0F, -2.8F, -4.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.4864F, -0.2944F, -0.1277F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 54, 22, -0.7F, -0.2F, 1.0F, 1, 1, 2, -0.3F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 54, 18, -0.7F, -0.2F, 0.4F, 1, 1, 2, -0.299F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(5.0F, -2.8F, -4.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.3514F, -0.2944F, -0.1277F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 97, 101, -1.7F, -2.13F, 0.6F, 2, 1, 2, -0.302F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 97, 86, -1.7F, -2.43F, -0.4F, 2, 1, 3, -0.301F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(5.0F, -2.0F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.0F, 0.0F, 0.576F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 46, 9, -0.9F, 1.4F, 7.5F, 1, 1, 1, -0.101F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 15, 87, -0.9F, 0.9F, 4.7F, 1, 1, 4, -0.1F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 17, 54, -1.9F, 0.9F, -4.75F, 2, 1, 5, -0.1F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 0, 0, -0.9F, -0.1F, -0.1F, 1, 2, 5, -0.1F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(5.0F, -2.0F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.9425F, 0.0F, 0.576F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 46, -0.9F, 3.8F, 1.9F, 1, 2, 1, -0.101F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(5.0F, -4.8F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, -0.4712F, 0.7505F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 79, 72, -1.1F, -0.3F, 3.0F, 3, 1, 3, -0.302F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(5.0F, -4.8F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.0F, 0.7505F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 24, 68, -2.7F, -0.3F, 3.0F, 3, 1, 1, -0.301F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 21, 23, -2.4F, -0.301F, 3.049F, 2, 1, 5, -0.3F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 21, 16, -2.45F, -0.3F, -4.949F, 2, 1, 6, -0.301F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 21, 8, -2.7F, -0.3F, -0.3F, 3, 1, 4, -0.3F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(4.5F, 0.0F, 0.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.4538F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 40, 45, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 96, 31, -4.5F, -2.0F, -0.001F, 4, 2, 1, -0.001F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(1.45F, -0.1F, -10.5F);
		Handguard_KulaTactical_railmount.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, -1.2043F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 46, 25, -0.2F, -0.8F, -0.2F, 1, 1, 2, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 48, 89, -0.2F, -0.8F, 7.6F, 1, 1, 3, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 46, 18, -0.2F, -0.8F, 5.0F, 1, 1, 2, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 47, 45, -0.2F, -0.8F, 2.4F, 1, 1, 2, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 53, 0, -0.2F, -0.8F, -2.8F, 1, 1, 2, -0.201F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(3.05F, -0.1F, -10.5F);
		Handguard_KulaTactical_railmount.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 1.2043F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 46, 22, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.201F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 38, 89, -0.8F, -0.8F, 7.6F, 1, 1, 3, -0.201F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 46, 15, -0.8F, -0.8F, 5.0F, 1, 1, 2, -0.201F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 47, 39, -0.8F, -0.8F, 2.4F, 1, 1, 2, -0.201F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 53, 6, -0.8F, -0.8F, -2.8F, 1, 1, 2, -0.201F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.7F, -6.65F, -13.1F);
		Handguard_KulaTactical_railmount.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -1.1694F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 147, 13, 0.3F, -0.3F, 0.25F, 1, 1, 12, -0.301F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 0, 80, 0.1F, -0.3F, -0.25F, 1, 1, 13, -0.3F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 82, 77, -0.3F, -0.3F, -0.25F, 1, 1, 13, -0.301F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(0.7F, -6.65F, -13.1F);
		Handguard_KulaTactical_railmount.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, 0.1222F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 46, 0, -0.3F, -0.3F, -0.25F, 2, 2, 13, -0.3F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-0.55F, -2.7F, -10.3F);
		Handguard_KulaTactical_railmount.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, 0.0F, -0.6807F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 87, 44, -0.3F, -0.3F, 0.8F, 1, 1, 1, -0.3F, false));
		cube_r124.cubeList.add(new ModelBox(cube_r124, 64, 60, -0.3F, -0.3F, -0.3F, 1, 1, 2, -0.301F, false));
		cube_r124.cubeList.add(new ModelBox(cube_r124, 0, 68, -0.3F, -0.3F, -2.8F, 1, 1, 2, -0.301F, false));
		cube_r124.cubeList.add(new ModelBox(cube_r124, 87, 55, -0.3F, -0.3F, -1.7F, 1, 1, 1, -0.3F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-0.55F, -4.1F, -10.3F);
		Handguard_KulaTactical_railmount.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, 0.0F, 0.6807F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 64, 54, -0.3F, -0.7F, -0.3F, 1, 1, 2, -0.302F, false));
		cube_r125.cubeList.add(new ModelBox(cube_r125, 79, 67, -0.3F, -0.7F, 0.8F, 1, 1, 1, -0.301F, false));
		cube_r125.cubeList.add(new ModelBox(cube_r125, 87, 57, -0.3F, -0.7F, -1.7F, 1, 1, 1, -0.301F, false));
		cube_r125.cubeList.add(new ModelBox(cube_r125, 15, 68, -0.3F, -0.7F, -2.8F, 1, 1, 2, -0.302F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(-0.5F, -1.25F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.0F, 0.6283F, 0.0F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 64, 41, -0.3F, -2.45F, -0.3F, 2, 2, 1, -0.301F, false));
		cube_r126.cubeList.add(new ModelBox(cube_r126, 64, 45, -0.3F, -3.85F, -0.3F, 2, 2, 1, -0.301F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(-0.5F, -2.8F, -4.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.0372F, 0.2944F, 0.1277F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 15, 71, -0.3F, -0.3F, 1.0F, 1, 1, 2, -0.3F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 94, 40, -0.3F, 1.08F, 1.8F, 1, 1, 3, -0.302F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 94, 50, -0.3F, 0.9F, 1.5F, 1, 1, 3, -0.301F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 94, 54, -0.3F, 0.5F, 0.8F, 1, 1, 3, -0.301F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 38, 116, -0.3F, 0.1F, 0.1F, 2, 1, 3, -0.3F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 0, 116, -0.3F, -2.32F, -1.0F, 2, 1, 3, -0.3F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 15, 116, -0.3F, -1.5F, -0.7F, 2, 1, 3, -0.3F, false));
		cube_r127.cubeList.add(new ModelBox(cube_r127, 53, 116, -0.3F, -0.7F, -0.3F, 2, 1, 3, -0.3F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-0.5F, -2.8F, -4.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r128);
		setRotationAngle(cube_r128, -0.4864F, 0.2944F, 0.1277F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 64, 68, -0.3F, -0.2F, 1.0F, 1, 1, 2, -0.3F, false));
		cube_r128.cubeList.add(new ModelBox(cube_r128, 0, 71, -0.3F, -0.2F, 0.4F, 1, 1, 2, -0.299F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(-0.5F, -2.8F, -4.0F);
		Handguard_KulaTactical_railmount.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.3514F, 0.2944F, 0.1277F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 0, 104, -0.3F, -2.13F, 0.6F, 2, 1, 2, -0.302F, false));
		cube_r129.cubeList.add(new ModelBox(cube_r129, 66, 105, -0.3F, -2.43F, -0.4F, 2, 1, 3, -0.301F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(-0.5F, -2.0F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0F, -0.576F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 53, 89, -0.1F, 1.4F, 7.5F, 1, 1, 1, -0.101F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 88, 64, -0.1F, 0.9F, 4.7F, 1, 1, 4, -0.1F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 99, 14, -0.1F, 0.9F, -4.75F, 2, 1, 5, -0.1F, false));
		cube_r130.cubeList.add(new ModelBox(cube_r130, 0, 16, -0.1F, -0.1F, -0.1F, 1, 2, 5, -0.1F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-0.5F, -2.0F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.9425F, 0.0F, -0.576F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 46, 6, -0.1F, 3.8F, 1.9F, 1, 2, 1, -0.101F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-0.5F, -4.8F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, 0.4712F, -0.7505F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 82, 83, -1.9F, -0.3F, 3.0F, 3, 1, 3, -0.302F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-0.5F, -4.8F, -8.4F);
		Handguard_KulaTactical_railmount.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, 0.0F, -0.7505F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 38, 86, -0.3F, -0.3F, 3.0F, 3, 1, 1, -0.301F, false));
		cube_r133.cubeList.add(new ModelBox(cube_r133, 99, 6, 0.4F, -0.301F, 3.049F, 2, 1, 5, -0.3F, false));
		cube_r133.cubeList.add(new ModelBox(cube_r133, 63, 0, 0.45F, -0.3F, -4.949F, 2, 1, 6, -0.301F, false));
		cube_r133.cubeList.add(new ModelBox(cube_r133, 14, 108, -0.3F, -0.3F, -0.3F, 3, 1, 4, -0.3F, false));

		Suppressor = new ModelRenderer(this);
		Suppressor.setRotationPoint(-1.5F, -13.8F, -51.5F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.2F, 0.0F);
		Suppressor.addChild(bone);
		

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, -0.4363F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 0, 116, -1.8F, -0.2F, -32.8F, 2, 2, 34, -0.199F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, 0.4363F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 38, 113, -0.2F, -0.2F, -32.8F, 2, 2, 34, -0.201F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 4.4F, 0.0F);
		Suppressor.addChild(bone4);
		

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0F, 0.0F, 0.4363F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 46, 0, -1.8F, -1.8F, -32.8F, 2, 2, 34, -0.201F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.0F, -0.4363F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 44, 77, -0.2F, -1.8F, -32.8F, 2, 2, 34, -0.199F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.1F, 2.3F, 0.0F);
		Suppressor.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, 1.5708F);
		

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, -0.4363F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 82, 72, -1.8F, -0.2F, -32.8F, 2, 2, 34, -0.2F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0F, 0.4363F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 82, 108, -0.2F, -0.2F, -32.8F, 2, 2, 34, -0.201F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.1F, 2.3F, 0.0F);
		Suppressor.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -1.5708F);
		

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, 0.0F, 0.4363F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 79, 36, -0.2F, -0.2F, -32.8F, 2, 2, 34, -0.201F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0F, 0.0F, -0.4363F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 0, 80, -1.8F, -0.2F, -32.8F, 2, 2, 34, -0.2F, false));

		Action = new ModelRenderer(this);
		Action.setRotationPoint(-2.45F, -11.2F, -29.5F);
		Action.cubeList.add(new ModelBox(Action, 149, 29, -1.0F, -2.1F, 0.0F, 1, 2, 11, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 26, 63, -1.8F, -1.2F, -0.001F, 2, 1, 1, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 7, 63, -1.8F, -1.2F, 3.5F, 2, 1, 1, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 47, 57, -3.7F, -1.2F, 1.0F, 2, 1, 1, 0.0F, false));
		Action.cubeList.add(new ModelBox(Action, 7, 23, -1.0F, -2.0F, 12.0F, 1, 2, 2, 0.0F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-0.6F, -2.1F, 0.0F);
		Action.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0F, 0.0F, -1.2392F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 152, 86, 0.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-1.0F, -2.1F, 0.0F);
		Action.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0F, 0.0F, -0.7505F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 152, 123, 0.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.2F, 0.8F, 2.7F);
		Action.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, 0.0F, -0.1745F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 104, 48, -1.6F, -2.4F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-1.8F, -1.2F, 0.0F);
		Action.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, -0.7592F, 0.0F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 96, 108, 0.1F, 0.201F, -0.2F, 1, 1, 2, -0.203F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 90, 108, 0.1F, -0.199F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 108, 108, -0.2F, -0.199F, -0.2F, 1, 1, 2, -0.2F, false));
		cube_r145.cubeList.add(new ModelBox(cube_r145, 102, 108, -0.2F, 0.201F, -0.2F, 1, 1, 2, -0.201F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(-1.8F, -1.2F, 4.5F);
		Action.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, 0.2007F, 0.0F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 104, 36, -0.2F, -0.199F, -2.8F, 1, 1, 3, -0.2F, false));
		cube_r146.cubeList.add(new ModelBox(cube_r146, 104, 40, -0.2F, 0.201F, -2.8F, 1, 1, 3, -0.201F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-3.7F, -1.2F, 2.0F);
		Action.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, 0.8552F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 121, 42, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-0.7F, -30.0F, -25.0F);
		mag.addChild(mag3);
		mag3.cubeList.add(new ModelBox(mag3, 38, 172, 0.0F, 0.0F, 0.0F, 1, 18, 6, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-3.3F, -30.0F, -25.0F);
		mag.addChild(mag2);
		mag2.cubeList.add(new ModelBox(mag2, 118, 0, 0.0F, 0.001F, -0.001F, 3, 18, 6, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.0F, -30.0F, -28.7F);
		mag.addChild(mag1);
		mag1.cubeList.add(new ModelBox(mag1, 152, 62, 0.0F, 0.0F, 0.0F, 3, 18, 4, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		MainGUN.render(f5);
		Stock.render(f5);
		GripArea.render(f5);
//		Handguard.render(f5);
//		Handguard_COMPACT.render(f5);
//		Handguard_KulaTactical_railmount.render(f5);
//		Suppressor.render(f5);
//		Action.render(f5);
//		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
