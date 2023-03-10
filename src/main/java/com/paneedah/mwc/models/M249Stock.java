package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M249Stock extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer Main154;
	private final ModelRenderer Barrel20;
	private final ModelRenderer Barrel19;
	private final ModelRenderer Barrel18;
	private final ModelRenderer Barrel17;
	private final ModelRenderer Barrel16;
	private final ModelRenderer Barrel15;
	private final ModelRenderer Barrel14;
	private final ModelRenderer Barrel13;
	private final ModelRenderer Barrel12;
	private final ModelRenderer Barrel11;
	private final ModelRenderer Barrel10;
	private final ModelRenderer Barrel9;
	private final ModelRenderer Barrel8;
	private final ModelRenderer Barrel7;
	private final ModelRenderer Barrel6;
	private final ModelRenderer Barrel5;
	private final ModelRenderer Main133;
	private final ModelRenderer Main132;
	private final ModelRenderer Main131;
	private final ModelRenderer Main130;
	private final ModelRenderer Main129;
	private final ModelRenderer Main128;
	private final ModelRenderer Main127;
	private final ModelRenderer Main126;
	private final ModelRenderer Main125;
	private final ModelRenderer Main124;
	private final ModelRenderer Main123;
	private final ModelRenderer Main122;
	private final ModelRenderer Main121;
	private final ModelRenderer Main119;
	private final ModelRenderer Main118;
	private final ModelRenderer Main117;
	private final ModelRenderer Main116;
	private final ModelRenderer Main115;
	private final ModelRenderer Main114;
	private final ModelRenderer Main113;
	private final ModelRenderer Main112;
	private final ModelRenderer Main111;
	private final ModelRenderer Main108;
	private final ModelRenderer Main103;
	private final ModelRenderer Main104;
	private final ModelRenderer Main102;
	private final ModelRenderer Grip15;
	private final ModelRenderer Grip14;
	private final ModelRenderer Grip13;
	private final ModelRenderer Grip12;
	private final ModelRenderer Grip11;
	private final ModelRenderer Grip10;
	private final ModelRenderer Grip9;
	private final ModelRenderer Grip8;
	private final ModelRenderer Grip7;
	private final ModelRenderer Grip6;
	private final ModelRenderer Grip5;
	private final ModelRenderer Main1055;
	private final ModelRenderer Main1044;
	private final ModelRenderer Main1033;
	private final ModelRenderer Main94;
	private final ModelRenderer Main93;
	private final ModelRenderer Main88;
	private final ModelRenderer Main86;
	private final ModelRenderer Main89;
	private final ModelRenderer Main87;
	private final ModelRenderer Main85;
	private final ModelRenderer Main84;
	private final ModelRenderer Main83;
	private final ModelRenderer Main82;
	private final ModelRenderer Main81;
	private final ModelRenderer Main78;
	private final ModelRenderer Main76;
	private final ModelRenderer Main74;
	private final ModelRenderer Main75;
	private final ModelRenderer Main71;
	private final ModelRenderer Main66;
	private final ModelRenderer Main64;
	private final ModelRenderer Main63;
	private final ModelRenderer Main62;
	private final ModelRenderer Main61;
	private final ModelRenderer Main60;
	private final ModelRenderer Unknownpart;
	private final ModelRenderer Muzzle4;
	private final ModelRenderer Muzzle3;
	private final ModelRenderer Muzzle2;
	private final ModelRenderer Muzzle1;
	private final ModelRenderer Main59;
	private final ModelRenderer LocationForBipod;
	private final ModelRenderer Main58;
	private final ModelRenderer Main57;
	private final ModelRenderer Main51;
	private final ModelRenderer Main50;
	private final ModelRenderer Main48;
	private final ModelRenderer Main47;
	private final ModelRenderer Main46;
	private final ModelRenderer Main45;
	private final ModelRenderer Main44;
	private final ModelRenderer Main43;
	private final ModelRenderer Main42;
	private final ModelRenderer Main41;
	private final ModelRenderer Main40;
	private final ModelRenderer Main39;
	private final ModelRenderer Main35;
	private final ModelRenderer Main33;
	private final ModelRenderer Main30;
	private final ModelRenderer Grip4;
	private final ModelRenderer Grip3;
	private final ModelRenderer Grip2;
	private final ModelRenderer Grip1;
	private final ModelRenderer Main28;
	private final ModelRenderer Main27;
	private final ModelRenderer Main26;
	private final ModelRenderer Main25;
	private final ModelRenderer Main24;
	private final ModelRenderer Main22;
	private final ModelRenderer Main21;
	private final ModelRenderer Main20;
	private final ModelRenderer Main19;
	private final ModelRenderer Main18;
	private final ModelRenderer Main17;
	private final ModelRenderer Main16;
	private final ModelRenderer Main9;
	private final ModelRenderer Main7;
	private final ModelRenderer Main6;
	private final ModelRenderer Main4;
	private final ModelRenderer Main3;
	private final ModelRenderer Main2;
	private final ModelRenderer Main1;
	private final ModelRenderer Barrel4;
	private final ModelRenderer Barrel3;
	private final ModelRenderer Barrel2;
	private final ModelRenderer Barrel1;
	private final QRenderer ironsight;
	private final ModelRenderer IronSight5;
	private final ModelRenderer IronSight4;
	private final ModelRenderer IronSight3;
	private final ModelRenderer IronSight2;
	private final ModelRenderer IronSight1;
	private final QRenderer belt;
	private final ModelRenderer Belt11;
	private final ModelRenderer Belt10;
	private final ModelRenderer Belt9;
	private final ModelRenderer Belt11_r1;
	private final ModelRenderer Belt8;
	private final ModelRenderer Belt7;
	private final ModelRenderer Belt6;
	private final ModelRenderer Belt5;
	private final ModelRenderer Belt4;
	private final ModelRenderer Belt3;
	private final ModelRenderer Belt2;
	private final ModelRenderer Belt1;
	private final QRenderer hatch;
	private final ModelRenderer Hatch39;
	private final ModelRenderer Hatch38;
	private final ModelRenderer Hatch37;
	private final ModelRenderer Hatch36;
	private final ModelRenderer Hatch35;
	private final ModelRenderer Hatch34;
	private final ModelRenderer Hatch33;
	private final ModelRenderer Hatch32;
	private final ModelRenderer Hatch31;
	private final ModelRenderer Hatch30;
	private final ModelRenderer Hatch29;
	private final ModelRenderer Hatch28;
	private final ModelRenderer Hatch27;
	private final ModelRenderer Hatch26;
	private final ModelRenderer Hatch25;
	private final ModelRenderer Hatch24;
	private final ModelRenderer Hatch23;
	private final ModelRenderer Hatch22;
	private final ModelRenderer Hatch21;
	private final ModelRenderer Hatch20;
	private final ModelRenderer Hatch19;
	private final ModelRenderer Hatch18;
	private final ModelRenderer Hatch17;
	private final ModelRenderer Hatch16;
	private final ModelRenderer Hatch15;
	private final ModelRenderer Hatch14;
	private final ModelRenderer Hatch13;
	private final ModelRenderer Hatch12;
	private final ModelRenderer Main120;
	private final ModelRenderer Hatch11;
	private final ModelRenderer Hatch9;
	private final ModelRenderer Hatch8;
	private final ModelRenderer Hatch6;
	private final ModelRenderer Hatch5;
	private final ModelRenderer Hatch4;
	private final ModelRenderer Hatch3;
	private final ModelRenderer Hatch2;
	private final ModelRenderer Hatch1;
	private final QRenderer stock;
	private final ModelRenderer Stock12;
	private final ModelRenderer Stock11;
	private final ModelRenderer Stock10;
	private final ModelRenderer Stock9;
	private final ModelRenderer Stock8;
	private final ModelRenderer Stock7;
	private final ModelRenderer Stock6;
	private final ModelRenderer Stock5;
	private final ModelRenderer Stock4;
	private final ModelRenderer Stock3;
	private final ModelRenderer Stock2;
	private final ModelRenderer Stock1;
	private final QRenderer mk48para_stock;
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
	private final ModelRenderer cube_r13;
	private final QRenderer stockadapter;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final QRenderer upperhandguard;
	private final ModelRenderer Main153;
	private final ModelRenderer Main152;
	private final ModelRenderer Main151;
	private final ModelRenderer Main150;
	private final ModelRenderer Main149;
	private final ModelRenderer Main148;
	private final ModelRenderer Main147;
	private final ModelRenderer Main146;
	private final ModelRenderer Main145;
	private final ModelRenderer Main144;
	private final ModelRenderer Main143;
	private final ModelRenderer Main142;
	private final ModelRenderer Main141;
	private final ModelRenderer Main140;
	private final ModelRenderer Main139;
	private final ModelRenderer Main138;
	private final ModelRenderer Main137;
	private final ModelRenderer Main136;
	private final ModelRenderer Main97;
	private final ModelRenderer Main98;
	private final ModelRenderer Main96;
	private final ModelRenderer Main95;
	private final ModelRenderer Main56;
	private final ModelRenderer Main55;
	private final ModelRenderer Main54;
	private final ModelRenderer Main53;
	private final ModelRenderer Main8;
	private final QRenderer mk48upperguard;
	private final ModelRenderer Main11_r1;
	private final ModelRenderer Main13_r1;
	private final ModelRenderer Main12_r1;
	private final QRenderer lowerhandguard;
	private final ModelRenderer Handguard20;
	private final ModelRenderer Handguard19;
	private final ModelRenderer Handguard18;
	private final ModelRenderer Handguard17;
	private final ModelRenderer Handguard16;
	private final ModelRenderer Handguard15;
	private final ModelRenderer Handguard14;
	private final ModelRenderer Handguard13;
	private final ModelRenderer Handguard12;
	private final ModelRenderer Handguard10;
	private final ModelRenderer Handguard11;
	private final ModelRenderer Handguard9;
	private final ModelRenderer Handguard8;
	private final ModelRenderer Handguard7;
	private final ModelRenderer Handguard4;
	private final ModelRenderer Handguard3;
	private final ModelRenderer Handguard2;
	private final ModelRenderer Handguard1;
	private final QRenderer mk48lowerguard;
	private final ModelRenderer Main15_r1;
	private final ModelRenderer Main14_r1;
	private final QRenderer action;
	private final ModelRenderer Action9;
	private final ModelRenderer Action8;
	private final ModelRenderer Action7;
	private final ModelRenderer Action6;
	private final ModelRenderer Action5;
	private final ModelRenderer Action4;
	private final ModelRenderer Action3;
	private final ModelRenderer Action2;
	private final ModelRenderer Action1;
	private final QRenderer mag;
	private final ModelRenderer Mag5;
	private final ModelRenderer Mag4;
	private final ModelRenderer Mag3;
	private final ModelRenderer Mag2;
	private final ModelRenderer Mag1;

	public M249Stock() {
		textureWidth = 350;
		textureHeight = 350;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Main154 = new ModelRenderer(this);
		Main154.setRotationPoint(0.0F, -21.6F, 61.4F);
		gun.addChild(Main154);
		setRotationAngle(Main154, -0.2231F, 0.0F, 0.0F);
		Main154.cubeList.add(new ModelBox(Main154, 54, 51, -2.0F, 5.9025F, -69.4141F, 1, 4, 2, 0.0F, false));

		Barrel20 = new ModelRenderer(this);
		Barrel20.setRotationPoint(1.0F, -25.7F, -30.0F);
		gun.addChild(Barrel20);
		setRotationAngle(Barrel20, 0.0F, 0.0F, -2.3562F);
		Barrel20.cubeList.add(new ModelBox(Barrel20, 122, 19, 9.1227F, 6.2932F, -69.001F, 1, 1, 8, 0.0F, false));

		Barrel19 = new ModelRenderer(this);
		Barrel19.setRotationPoint(0.0F, -25.7F, -30.0F);
		gun.addChild(Barrel19);
		setRotationAngle(Barrel19, 0.0F, 0.0F, -2.3562F);
		Barrel19.cubeList.add(new ModelBox(Barrel19, 48, 126, 9.1217F, 6.2922F, -69.002F, 1, 1, 8, 0.0F, false));

		Barrel18 = new ModelRenderer(this);
		Barrel18.setRotationPoint(2.3F, -27.0F, -30.0F);
		gun.addChild(Barrel18);
		setRotationAngle(Barrel18, 0.0F, 0.0F, 2.3562F);
		Barrel18.cubeList.add(new ModelBox(Barrel18, 136, 69, -6.2933F, 9.1217F, -69.002F, 1, 1, 8, 0.0F, false));

		Barrel17 = new ModelRenderer(this);
		Barrel17.setRotationPoint(2.3F, -28.0F, -30.0F);
		gun.addChild(Barrel17);
		setRotationAngle(Barrel17, 0.0F, 0.0F, 2.3562F);
		Barrel17.cubeList.add(new ModelBox(Barrel17, 136, 78, -6.2923F, 9.1217F, -69.001F, 1, 1, 8, 0.0F, false));

		Barrel16 = new ModelRenderer(this);
		Barrel16.setRotationPoint(-1.3F, -27.0F, -30.0F);
		gun.addChild(Barrel16);
		setRotationAngle(Barrel16, 0.0F, 0.0F, -0.7854F);
		Barrel16.cubeList.add(new ModelBox(Barrel16, 136, 92, 6.2933F, -9.1217F, -69.001F, 1, 1, 8, 0.0F, false));

		Barrel15 = new ModelRenderer(this);
		Barrel15.setRotationPoint(-1.3F, -28.0F, -30.0F);
		gun.addChild(Barrel15);
		setRotationAngle(Barrel15, 0.0F, 0.0F, -0.7854F);
		Barrel15.cubeList.add(new ModelBox(Barrel15, 136, 101, 6.2933F, -9.1227F, -69.002F, 1, 1, 8, 0.0F, false));

		Barrel14 = new ModelRenderer(this);
		Barrel14.setRotationPoint(0.0F, -29.3F, -30.0F);
		gun.addChild(Barrel14);
		setRotationAngle(Barrel14, 0.0F, 0.0F, 0.7854F);
		Barrel14.cubeList.add(new ModelBox(Barrel14, 0, 140, -9.1217F, -6.2933F, -69.001F, 1, 1, 8, 0.0F, false));

		Barrel13 = new ModelRenderer(this);
		Barrel13.setRotationPoint(1.0F, -29.3F, -30.0F);
		gun.addChild(Barrel13);
		setRotationAngle(Barrel13, 0.0F, 0.0F, 0.7854F);
		Barrel13.cubeList.add(new ModelBox(Barrel13, 122, 140, -9.1217F, -6.2933F, -69.002F, 1, 1, 8, 0.0F, false));

		Barrel12 = new ModelRenderer(this);
		Barrel12.setRotationPoint(1.0F, -26.0F, -25.0F);
		gun.addChild(Barrel12);
		setRotationAngle(Barrel12, 0.0F, 0.0F, -2.3562F);
		Barrel12.cubeList.add(new ModelBox(Barrel12, 71, 69, 9.1227F, 6.2932F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel11 = new ModelRenderer(this);
		Barrel11.setRotationPoint(0.0F, -26.0F, -25.0F);
		gun.addChild(Barrel11);
		setRotationAngle(Barrel11, 0.0F, 0.0F, -2.3562F);
		Barrel11.cubeList.add(new ModelBox(Barrel11, 78, 0, 9.1217F, 6.2922F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel10 = new ModelRenderer(this);
		Barrel10.setRotationPoint(2.0F, -27.0F, -25.0F);
		gun.addChild(Barrel10);
		setRotationAngle(Barrel10, 0.0F, 0.0F, 2.3562F);
		Barrel10.cubeList.add(new ModelBox(Barrel10, 77, 133, -6.2933F, 9.1217F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel9 = new ModelRenderer(this);
		Barrel9.setRotationPoint(2.0F, -28.0F, -25.0F);
		gun.addChild(Barrel9);
		setRotationAngle(Barrel9, 0.0F, 0.0F, 2.3562F);
		Barrel9.cubeList.add(new ModelBox(Barrel9, 136, 64, -6.2923F, 9.1217F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel8 = new ModelRenderer(this);
		Barrel8.setRotationPoint(-1.0F, -27.0F, -25.0F);
		gun.addChild(Barrel8);
		setRotationAngle(Barrel8, 0.0F, 0.0F, -0.7854F);
		Barrel8.cubeList.add(new ModelBox(Barrel8, 0, 140, 6.2933F, -9.1217F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel7 = new ModelRenderer(this);
		Barrel7.setRotationPoint(-1.0F, -28.0F, -25.0F);
		gun.addChild(Barrel7);
		setRotationAngle(Barrel7, 0.0F, 0.0F, -0.7854F);
		Barrel7.cubeList.add(new ModelBox(Barrel7, 142, 128, 6.2933F, -9.1227F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel6 = new ModelRenderer(this);
		Barrel6.setRotationPoint(0.0F, -29.0F, -25.0F);
		gun.addChild(Barrel6);
		setRotationAngle(Barrel6, 0.0F, 0.0F, 0.7854F);
		Barrel6.cubeList.add(new ModelBox(Barrel6, 142, 192, -9.1217F, -6.2933F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel5 = new ModelRenderer(this);
		Barrel5.setRotationPoint(1.0F, -29.0F, -25.0F);
		gun.addChild(Barrel5);
		setRotationAngle(Barrel5, 0.0F, 0.0F, 0.7854F);
		Barrel5.cubeList.add(new ModelBox(Barrel5, 65, 197, -9.1217F, -6.2933F, -69.0F, 1, 1, 63, 0.0F, false));

		Main133 = new ModelRenderer(this);
		Main133.setRotationPoint(-3.0F, -23.5F, 53.0F);
		gun.addChild(Main133);
		setRotationAngle(Main133, 0.1115F, 0.0F, 0.0F);
		Main133.cubeList.add(new ModelBox(Main133, 90, 6, -2.0F, -15.2204F, -66.0027F, 7, 1, 1, 0.0F, false));

		Main132 = new ModelRenderer(this);
		Main132.setRotationPoint(-2.7F, -23.5F, 53.0F);
		gun.addChild(Main132);
		setRotationAngle(Main132, 0.1115F, 0.0F, 0.0F);
		Main132.cubeList.add(new ModelBox(Main132, 85, 69, -2.001F, -15.7204F, -66.5017F, 1, 2, 2, 0.0F, false));

		Main131 = new ModelRenderer(this);
		Main131.setRotationPoint(2.7F, -23.5F, 53.0F);
		gun.addChild(Main131);
		setRotationAngle(Main131, 0.1115F, 0.0F, 0.0F);
		Main131.cubeList.add(new ModelBox(Main131, 83, 86, -1.999F, -15.7204F, -66.5017F, 1, 2, 2, 0.0F, false));

		Main130 = new ModelRenderer(this);
		Main130.setRotationPoint(2.7F, -23.5F, 53.0F);
		gun.addChild(Main130);
		setRotationAngle(Main130, 0.1115F, 0.0F, 0.0F);
		Main130.cubeList.add(new ModelBox(Main130, 78, 0, -2.0F, -17.2204F, -67.5027F, 1, 2, 3, 0.0F, false));

		Main129 = new ModelRenderer(this);
		Main129.setRotationPoint(-2.7F, -23.5F, 53.0F);
		gun.addChild(Main129);
		setRotationAngle(Main129, 0.1115F, 0.0F, 0.0F);
		Main129.cubeList.add(new ModelBox(Main129, 24, 81, -2.0F, -17.2204F, -67.5027F, 1, 2, 3, 0.0F, false));

		Main128 = new ModelRenderer(this);
		Main128.setRotationPoint(-2.7F, -25.5F, 40.0F);
		gun.addChild(Main128);
		Main128.cubeList.add(new ModelBox(Main128, 78, 29, -2.0F, -9.6F, -69.0F, 2, 2, 11, 0.0F, false));

		Main127 = new ModelRenderer(this);
		Main127.setRotationPoint(2.0F, -30.5F, 41.0F);
		gun.addChild(Main127);
		Main127.cubeList.add(new ModelBox(Main127, 0, 103, -2.0F, -9.6F, -69.0F, 1, 2, 10, 0.0F, false));

		Main126 = new ModelRenderer(this);
		Main126.setRotationPoint(4.5F, -30.5F, 43.5F);
		gun.addChild(Main126);
		setRotationAngle(Main126, 0.0F, 0.0F, 0.5934F);
		Main126.cubeList.add(new ModelBox(Main126, 52, 77, -6.0263F, -6.8404F, -69.0F, 1, 1, 7, 0.0F, false));

		Main125 = new ModelRenderer(this);
		Main125.setRotationPoint(5.2F, -31.8F, 42.1F);
		gun.addChild(Main125);
		setRotationAngle(Main125, 0.0F, 2.2307F, 0.0F);
		Main125.cubeList.add(new ModelBox(Main125, 34, 77, 55.7387F, -9.6F, 38.721F, 1, 3, 2, 0.0F, false));

		Main124 = new ModelRenderer(this);
		Main124.setRotationPoint(2.3F, -31.5F, 39.0F);
		gun.addChild(Main124);
		Main124.cubeList.add(new ModelBox(Main124, 109, 32, -2.0F, -9.6F, -69.0F, 1, 1, 2, 0.0F, false));

		Main123 = new ModelRenderer(this);
		Main123.setRotationPoint(-2.7F, -30.0F, 41.0F);
		gun.addChild(Main123);
		Main123.cubeList.add(new ModelBox(Main123, 195, 258, -2.0F, -9.6F, -69.0F, 1, 1, 34, 0.0F, false));

		Main122 = new ModelRenderer(this);
		Main122.setRotationPoint(-3.0F, -24.0F, 71.5F);
		gun.addChild(Main122);
		setRotationAngle(Main122, 1.3756F, 0.0F, 0.0F);
		Main122.cubeList.add(new ModelBox(Main122, 14, 69, -1.999F, -69.5517F, -3.9649F, 7, 4, 2, 0.0F, false));

		Main121 = new ModelRenderer(this);
		Main121.setRotationPoint(-3.0F, -25.0F, 71.5F);
		gun.addChild(Main121);
		Main121.cubeList.add(new ModelBox(Main121, 16, 31, -1.998F, -9.6F, -69.0F, 7, 1, 1, 0.0F, false));

		Main119 = new ModelRenderer(this);
		Main119.setRotationPoint(5.2F, -31.8F, 51.0F);
		gun.addChild(Main119);
		setRotationAngle(Main119, 0.0F, -2.2307F, 0.0F);
		Main119.cubeList.add(new ModelBox(Main119, 43, 77, -52.6547F, -9.6F, 43.3904F, 1, 3, 2, 0.0F, false));

		Main118 = new ModelRenderer(this);
		Main118.setRotationPoint(2.8F, -32.0F, 75.0F);
		gun.addChild(Main118);
		Main118.cubeList.add(new ModelBox(Main118, 0, 34, -1.999F, -9.6F, -69.0F, 1, 3, 3, 0.0F, false));

		Main117 = new ModelRenderer(this);
		Main117.setRotationPoint(1.8F, -20.9F, 78.0F);
		gun.addChild(Main117);
		setRotationAngle(Main117, 2.8999F, 0.0F, 0.0F);
		Main117.cubeList.add(new ModelBox(Main117, 121, 90, -2.0F, 0.8073F, 69.2934F, 2, 3, 4, 0.0F, false));

		Main116 = new ModelRenderer(this);
		Main116.setRotationPoint(-2.8F, -20.9F, 78.0F);
		gun.addChild(Main116);
		setRotationAngle(Main116, 2.8999F, 0.0F, 0.0F);
		Main116.cubeList.add(new ModelBox(Main116, 0, 131, -2.0F, 0.8083F, 69.2944F, 5, 3, 4, 0.0F, false));

		Main115 = new ModelRenderer(this);
		Main115.setRotationPoint(-2.0F, -34.1F, 77.5F);
		gun.addChild(Main115);
		setRotationAngle(Main115, -0.2603F, 0.0F, 0.0F);
		Main115.cubeList.add(new ModelBox(Main115, 121, 50, -2.0F, 9.4785F, -69.4468F, 5, 1, 4, 0.0F, false));

		Main114 = new ModelRenderer(this);
		Main114.setRotationPoint(4.5F, -26.5F, 75.0F);
		gun.addChild(Main114);
		setRotationAngle(Main114, 0.0F, 0.0F, 0.7854F);
		Main114.cubeList.add(new ModelBox(Main114, 34, 86, -9.2024F, -5.374F, -68.999F, 1, 1, 4, 0.0F, false));

		Main113 = new ModelRenderer(this);
		Main113.setRotationPoint(4.5F, -29.5F, 75.0F);
		gun.addChild(Main113);
		setRotationAngle(Main113, 0.0F, 0.0F, 0.7854F);
		Main113.cubeList.add(new ModelBox(Main113, 136, 120, -9.2024F, -5.374F, -69.0F, 1, 1, 5, 0.0F, false));

		Main112 = new ModelRenderer(this);
		Main112.setRotationPoint(-3.5F, -26.5F, 75.0F);
		gun.addChild(Main112);
		setRotationAngle(Main112, 0.0F, 0.0F, -0.7854F);
		Main112.cubeList.add(new ModelBox(Main112, 71, 86, 5.374F, -8.2024F, -68.999F, 1, 1, 4, 0.0F, false));

		Main111 = new ModelRenderer(this);
		Main111.setRotationPoint(-3.5F, -29.5F, 75.0F);
		gun.addChild(Main111);
		setRotationAngle(Main111, 0.0F, 0.0F, -0.7854F);
		Main111.cubeList.add(new ModelBox(Main111, 10, 140, 5.374F, -8.2024F, -68.999F, 1, 1, 5, 0.0F, false));

		Main108 = new ModelRenderer(this);
		Main108.setRotationPoint(-3.5F, -29.5F, 78.5F);
		gun.addChild(Main108);
		Main108.cubeList.add(new ModelBox(Main108, 35, 64, -1.999F, -9.6F, -69.0F, 8, 1, 1, 0.0F, false));

		Main103 = new ModelRenderer(this);
		Main103.setRotationPoint(-3.0F, -20.9F, 78.0F);
		gun.addChild(Main103);
		setRotationAngle(Main103, 2.8999F, 0.0F, 0.0F);
		Main103.cubeList.add(new ModelBox(Main103, 14, 91, -1.999F, -5.1917F, 69.2924F, 7, 6, 2, 0.0F, false));

		Main104 = new ModelRenderer(this);
		Main104.setRotationPoint(-3.5F, -20.9F, 78.0F);
		gun.addChild(Main104);
		setRotationAngle(Main104, 2.8999F, 0.0F, 0.0F);
		Main104.cubeList.add(new ModelBox(Main104, 78, 52, -1.998F, -1.4917F, 69.2944F, 8, 3, 1, 0.0F, false));

		Main102 = new ModelRenderer(this);
		Main102.setRotationPoint(-2.5F, -20.9F, 78.0F);
		gun.addChild(Main102);
		setRotationAngle(Main102, 2.8999F, 0.0F, 0.0F);
		Main102.cubeList.add(new ModelBox(Main102, 83, 93, -1.999F, -7.1917F, 69.2924F, 6, 2, 1, 0.0F, false));

		Grip15 = new ModelRenderer(this);
		Grip15.setRotationPoint(-2.0F, -20.5F, 74.0F);
		gun.addChild(Grip15);
		setRotationAngle(Grip15, 2.2075F, 0.0F, 0.0F);
		Grip15.cubeList.add(new ModelBox(Grip15, 92, 133, -1.999F, -49.7734F, 48.7418F, 5, 1, 1, 0.0F, false));

		Grip14 = new ModelRenderer(this);
		Grip14.setRotationPoint(-2.0F, -23.0F, 74.0F);
		gun.addChild(Grip14);
		Grip14.cubeList.add(new ModelBox(Grip14, 115, 57, -1.998F, -9.6F, -69.0F, 5, 2, 4, 0.0F, false));

		Grip13 = new ModelRenderer(this);
		Grip13.setRotationPoint(-1.0F, -21.1F, 62.4F);
		gun.addChild(Grip13);
		setRotationAngle(Grip13, -0.0372F, 0.0F, 0.0F);
		Grip13.cubeList.add(new ModelBox(Grip13, 35, 34, -1.999F, -7.0286F, -69.3092F, 3, 5, 1, 0.0F, false));

		Grip12 = new ModelRenderer(this);
		Grip12.setRotationPoint(-1.0F, -15.5F, 62.4F);
		gun.addChild(Grip12);
		setRotationAngle(Grip12, 2.1564F, 0.0F, 0.0F);
		Grip12.cubeList.add(new ModelBox(Grip12, 0, 40, -2.001F, -52.1991F, 46.1348F, 3, 1, 1, 0.0F, false));

		Grip11 = new ModelRenderer(this);
		Grip11.setRotationPoint(3.5F, -20.5F, 63.2F);
		gun.addChild(Grip11);
		setRotationAngle(Grip11, 0.0F, 0.0F, 0.7854F);
		Grip11.cubeList.add(new ModelBox(Grip11, 14, 81, -9.2024F, -5.374F, -69.0F, 1, 2, 8, 0.0F, false));

		Grip10 = new ModelRenderer(this);
		Grip10.setRotationPoint(-2.5F, -20.5F, 63.2F);
		gun.addChild(Grip10);
		setRotationAngle(Grip10, 0.0F, 0.0F, -0.7854F);
		Grip10.cubeList.add(new ModelBox(Grip10, 50, 103, 5.374F, -8.2024F, -69.0F, 1, 2, 8, 0.0F, false));

		Grip9 = new ModelRenderer(this);
		Grip9.setRotationPoint(-1.5F, -7.1F, 64.9F);
		gun.addChild(Grip9);
		setRotationAngle(Grip9, 1.1154F, 0.0F, 0.0F);
		Grip9.cubeList.add(new ModelBox(Grip9, 114, 126, -2.001F, -66.1893F, -21.7286F, 4, 1, 2, 0.0F, false));

		Grip8 = new ModelRenderer(this);
		Grip8.setRotationPoint(-1.5F, -20.0F, 63.0F);
		gun.addChild(Grip8);
		setRotationAngle(Grip8, 0.2231F, 0.0F, 0.0F);
		Grip8.cubeList.add(new ModelBox(Grip8, 87, 107, -2.0F, -11.6267F, -66.1666F, 4, 1, 1, 0.0F, false));

		Grip7 = new ModelRenderer(this);
		Grip7.setRotationPoint(-1.5F, -20.0F, 73.0F);
		gun.addChild(Grip7);
		setRotationAngle(Grip7, -2.6769F, 0.0F, 0.0F);
		Grip7.cubeList.add(new ModelBox(Grip7, 18, 131, -2.001F, 39.5065F, 57.3794F, 4, 2, 5, 0.0F, false));

		Grip6 = new ModelRenderer(this);
		Grip6.setRotationPoint(-1.5F, -18.0F, 70.0F);
		gun.addChild(Grip6);
		setRotationAngle(Grip6, -1.1897F, 0.0F, 0.0F);
		Grip6.cubeList.add(new ModelBox(Grip6, 35, 51, -1.999F, 60.4797F, -35.2741F, 4, 2, 11, 0.0F, false));

		Grip5 = new ModelRenderer(this);
		Grip5.setRotationPoint(-1.5F, -20.0F, 63.0F);
		gun.addChild(Grip5);
		setRotationAngle(Grip5, 0.2231F, 0.0F, 0.0F);
		Grip5.cubeList.add(new ModelBox(Grip5, 0, 69, -2.0F, -24.6267F, -65.1666F, 4, 14, 6, 0.0F, false));

		Main1055 = new ModelRenderer(this);
		Main1055.setRotationPoint(4.0F, -28.0F, 50.0F);
		gun.addChild(Main1055);
		setRotationAngle(Main1055, 0.0F, 0.0F, 0.5934F);
		Main1055.cubeList.add(new ModelBox(Main1055, 109, 39, -8.0263F, -8.8404F, -68.999F, 2, 2, 1, 0.0F, false));

		Main1044 = new ModelRenderer(this);
		Main1044.setRotationPoint(4.0F, -28.0F, 43.0F);
		gun.addChild(Main1044);
		setRotationAngle(Main1044, 0.0F, 0.0F, 0.5934F);
		Main1044.cubeList.add(new ModelBox(Main1044, 109, 42, -8.0263F, -8.8404F, -68.999F, 2, 2, 1, 0.0F, false));

		Main1033 = new ModelRenderer(this);
		Main1033.setRotationPoint(4.0F, -28.0F, 43.0F);
		gun.addChild(Main1033);
		setRotationAngle(Main1033, 0.0F, 0.0F, 0.5934F);
		Main1033.cubeList.add(new ModelBox(Main1033, 142, 142, -7.0263F, -6.8404F, -69.0F, 1, 1, 8, 0.0F, false));

		Main94 = new ModelRenderer(this);
		Main94.setRotationPoint(-2.0F, -30.0F, 10.0F);
		gun.addChild(Main94);
		Main94.cubeList.add(new ModelBox(Main94, 54, 58, -2.0F, -10.6F, -68.999F, 5, 2, 2, 0.0F, false));

		Main93 = new ModelRenderer(this);
		Main93.setRotationPoint(-2.0F, -29.0F, 9.0F);
		gun.addChild(Main93);
		Main93.cubeList.add(new ModelBox(Main93, 129, 57, -2.0F, -9.6F, -69.0F, 5, 2, 1, 0.0F, false));

		Main88 = new ModelRenderer(this);
		Main88.setRotationPoint(-1.0F, -29.5F, 7.0F);
		gun.addChild(Main88);
		setRotationAngle(Main88, 0.2793F, 0.0F, 0.0F);
		Main88.cubeList.add(new ModelBox(Main88, 122, 0, -1.999F, -29.4967F, -64.3226F, 3, 2, 6, 0.0F, false));

		Main86 = new ModelRenderer(this);
		Main86.setRotationPoint(-1.0F, -31.0F, 10.8F);
		gun.addChild(Main86);
		Main86.cubeList.add(new ModelBox(Main86, 87, 98, -2.0F, -10.9F, -69.0F, 3, 1, 2, 0.0F, false));

		Main89 = new ModelRenderer(this);
		Main89.setRotationPoint(-2.0F, -27.0F, 9.0F);
		gun.addChild(Main89);
		Main89.cubeList.add(new ModelBox(Main89, 0, 125, -2.0F, -9.6F, -68.999F, 5, 4, 1, 0.0F, false));

		Main87 = new ModelRenderer(this);
		Main87.setRotationPoint(-1.0F, -29.0F, 6.0F);
		gun.addChild(Main87);
		Main87.cubeList.add(new ModelBox(Main87, 109, 49, -2.0F, -10.9F, -69.0F, 3, 1, 6, 0.0F, false));

		Main85 = new ModelRenderer(this);
		Main85.setRotationPoint(-0.5F, -29.5F, 6.0F);
		gun.addChild(Main85);
		setRotationAngle(Main85, 0.3142F, 0.0F, 0.0F);
		Main85.cubeList.add(new ModelBox(Main85, 12, 115, -1.999F, -31.6887F, -62.2546F, 2, 1, 5, 0.0F, false));

		Main84 = new ModelRenderer(this);
		Main84.setRotationPoint(-0.5F, -29.5F, 1.0F);
		gun.addChild(Main84);
		Main84.cubeList.add(new ModelBox(Main84, 122, 149, -2.0F, -10.9F, -69.1F, 2, 1, 7, 0.0F, false));

		Main83 = new ModelRenderer(this);
		Main83.setRotationPoint(3.1F, -28.5F, 41.0F);
		gun.addChild(Main83);
		Main83.cubeList.add(new ModelBox(Main83, 101, 24, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Main82 = new ModelRenderer(this);
		Main82.setRotationPoint(3.1F, -28.5F, 57.0F);
		gun.addChild(Main82);
		Main82.cubeList.add(new ModelBox(Main82, 101, 46, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Main81 = new ModelRenderer(this);
		Main81.setRotationPoint(3.1F, -28.5F, 70.0F);
		gun.addChild(Main81);
		Main81.cubeList.add(new ModelBox(Main81, 64, 107, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Main78 = new ModelRenderer(this);
		Main78.setRotationPoint(-3.0F, -26.5F, 71.5F);
		gun.addChild(Main78);
		Main78.cubeList.add(new ModelBox(Main78, 95, 57, -2.0F, -9.6F, -69.0F, 7, 2, 3, 0.0F, false));

		Main76 = new ModelRenderer(this);
		Main76.setRotationPoint(-2.8F, -32.0F, 75.0F);
		gun.addChild(Main76);
		Main76.cubeList.add(new ModelBox(Main76, 54, 34, -2.001F, -9.6F, -69.0F, 1, 3, 3, 0.0F, false));

		Main74 = new ModelRenderer(this);
		Main74.setRotationPoint(-3.0F, -26.8F, 75.0F);
		gun.addChild(Main74);
		Main74.cubeList.add(new ModelBox(Main74, 110, 20, -2.0F, -9.6F, -69.0F, 7, 4, 3, 0.0F, false));

		Main75 = new ModelRenderer(this);
		Main75.setRotationPoint(-2.5F, -23.9F, 75.0F);
		gun.addChild(Main75);
		Main75.cubeList.add(new ModelBox(Main75, 29, 116, -2.0F, -9.6F, -69.0F, 6, 3, 3, 0.0F, false));

		Main71 = new ModelRenderer(this);
		Main71.setRotationPoint(-3.5F, -29.5F, 75.0F);
		gun.addChild(Main71);
		Main71.cubeList.add(new ModelBox(Main71, 103, 78, -2.0F, -9.6F, -69.0F, 8, 3, 4, 0.0F, false));

		Main66 = new ModelRenderer(this);
		Main66.setRotationPoint(-2.7F, -26.5F, 43.0F);
		gun.addChild(Main66);
		Main66.cubeList.add(new ModelBox(Main66, 83, 86, -2.0F, -9.6F, -69.0F, 2, 1, 6, 0.0F, false));

		Main64 = new ModelRenderer(this);
		Main64.setRotationPoint(-4.5F, -37.0F, 23.5F);
		gun.addChild(Main64);
		setRotationAngle(Main64, 0.2443F, 0.0F, 0.0F);
		Main64.cubeList.add(new ModelBox(Main64, 0, 89, -2.0F, -26.5075F, -63.628F, 2, 2, 10, 0.0F, false));

		Main63 = new ModelRenderer(this);
		Main63.setRotationPoint(-4.0F, -37.0F, 23.5F);
		gun.addChild(Main63);
		setRotationAngle(Main63, 0.2443F, 0.0F, 0.0F);
		Main63.cubeList.add(new ModelBox(Main63, 52, 77, -2.001F, -26.0075F, -64.628F, 1, 6, 1, 0.0F, false));

		Main62 = new ModelRenderer(this);
		Main62.setRotationPoint(-4.0F, -32.0F, 25.0F);
		gun.addChild(Main62);
		Main62.cubeList.add(new ModelBox(Main62, 71, 86, -2.0F, -9.6F, -69.0F, 1, 1, 10, 0.0F, false));

		Main61 = new ModelRenderer(this);
		Main61.setRotationPoint(-4.0F, -32.0F, 35.0F);
		gun.addChild(Main61);
		Main61.cubeList.add(new ModelBox(Main61, 116, 133, -2.0F, -9.6F, -69.0F, 5, 1, 1, 0.0F, false));

		Main60 = new ModelRenderer(this);
		Main60.setRotationPoint(-0.5F, -31.0F, 34.0F);
		gun.addChild(Main60);
		Main60.cubeList.add(new ModelBox(Main60, 0, 89, -2.0F, -9.6F, -69.0F, 2, 2, 3, 0.0F, false));

		Unknownpart = new ModelRenderer(this);
		Unknownpart.setRotationPoint(-3.0F, -24.0F, 15.5F);
		gun.addChild(Unknownpart);
		Unknownpart.cubeList.add(new ModelBox(Unknownpart, 78, 64, -2.0F, -9.6F, -69.0F, 7, 2, 2, 0.0F, false));

		Muzzle4 = new ModelRenderer(this);
		Muzzle4.setRotationPoint(1.3F, -28.0F, -30.0F);
		gun.addChild(Muzzle4);
		Muzzle4.cubeList.add(new ModelBox(Muzzle4, 143, 0, -2.0F, -10.9F, -69.0F, 1, 1, 8, 0.0F, false));

		Muzzle3 = new ModelRenderer(this);
		Muzzle3.setRotationPoint(-1.3F, -28.0F, -30.0F);
		gun.addChild(Muzzle3);
		Muzzle3.cubeList.add(new ModelBox(Muzzle3, 143, 9, -2.0F, -10.9F, -69.0F, 1, 1, 8, 0.0F, false));

		Muzzle2 = new ModelRenderer(this);
		Muzzle2.setRotationPoint(0.0F, -26.7F, -30.0F);
		gun.addChild(Muzzle2);
		Muzzle2.cubeList.add(new ModelBox(Muzzle2, 143, 20, -2.0F, -10.9F, -69.0F, 1, 1, 8, 0.0F, false));

		Muzzle1 = new ModelRenderer(this);
		Muzzle1.setRotationPoint(0.0F, -29.3F, -30.0F);
		gun.addChild(Muzzle1);
		Muzzle1.cubeList.add(new ModelBox(Muzzle1, 143, 29, -2.0F, -10.9F, -69.0F, 1, 1, 8, 0.0F, false));

		Main59 = new ModelRenderer(this);
		Main59.setRotationPoint(0.0F, -26.0F, 1.5F);
		gun.addChild(Main59);
		Main59.cubeList.add(new ModelBox(Main59, 93, 69, -2.0F, -10.9F, -69.0F, 1, 2, 2, 0.0F, false));

		LocationForBipod = new ModelRenderer(this);
		LocationForBipod.setRotationPoint(-1.0F, -24.0F, 6.0F);
		gun.addChild(LocationForBipod);
		LocationForBipod.cubeList.add(new ModelBox(LocationForBipod, 71, 133, -1.999F, -10.9F, -69.0F, 3, 2, 3, 0.0F, false));

		Main58 = new ModelRenderer(this);
		Main58.setRotationPoint(-0.5F, -23.0F, 49.0F);
		gun.addChild(Main58);
		Main58.cubeList.add(new ModelBox(Main58, 109, 49, -2.0F, -9.6F, -69.0F, 2, 2, 1, 0.0F, false));

		Main57 = new ModelRenderer(this);
		Main57.setRotationPoint(-0.5F, -23.0F, 44.0F);
		gun.addChild(Main57);
		Main57.cubeList.add(new ModelBox(Main57, 109, 52, -2.0F, -9.6F, -69.0F, 2, 2, 1, 0.0F, false));

		Main51 = new ModelRenderer(this);
		Main51.setRotationPoint(-2.5F, -29.5F, 34.0F);
		gun.addChild(Main51);
		Main51.cubeList.add(new ModelBox(Main51, 96, 64, -2.0F, -9.6F, -69.0F, 6, 1, 3, 0.0F, false));

		Main50 = new ModelRenderer(this);
		Main50.setRotationPoint(-1.5F, -33.5F, 37.0F);
		gun.addChild(Main50);
		Main50.cubeList.add(new ModelBox(Main50, 35, 0, -2.0F, -9.6F, -69.0F, 4, 9, 3, 0.0F, false));

		Main48 = new ModelRenderer(this);
		Main48.setRotationPoint(2.5F, -27.0F, 12.0F);
		gun.addChild(Main48);
		Main48.cubeList.add(new ModelBox(Main48, 201, 65, -1.999F, -9.6F, -69.0F, 1, 1, 25, 0.0F, false));

		Main47 = new ModelRenderer(this);
		Main47.setRotationPoint(2.5F, -25.0F, 12.0F);
		gun.addChild(Main47);
		Main47.cubeList.add(new ModelBox(Main47, 142, 133, -1.999F, -9.6F, -69.0F, 1, 2, 25, 0.0F, false));

		Main46 = new ModelRenderer(this);
		Main46.setRotationPoint(-2.5F, -27.0F, 12.0F);
		gun.addChild(Main46);
		Main46.cubeList.add(new ModelBox(Main46, 201, 91, -2.0F, -9.6F, -69.0F, 1, 1, 25, 0.0F, false));

		Main45 = new ModelRenderer(this);
		Main45.setRotationPoint(-2.5F, -25.0F, 12.0F);
		gun.addChild(Main45);
		Main45.cubeList.add(new ModelBox(Main45, 142, 160, -2.0F, -9.6F, -69.0F, 1, 2, 25, 0.0F, false));

		Main44 = new ModelRenderer(this);
		Main44.setRotationPoint(-0.5F, -25.8F, -2.0F);
		gun.addChild(Main44);
		Main44.cubeList.add(new ModelBox(Main44, 0, 149, -2.0F, -10.9F, -69.0F, 2, 2, 7, 0.0F, false));

		Main43 = new ModelRenderer(this);
		Main43.setRotationPoint(-0.5F, -26.3F, 5.0F);
		gun.addChild(Main43);
		Main43.cubeList.add(new ModelBox(Main43, 249, 193, -2.0F, -10.9F, -69.0F, 2, 3, 33, 0.0F, false));

		Main42 = new ModelRenderer(this);
		Main42.setRotationPoint(-1.0F, -25.8F, 5.0F);
		gun.addChild(Main42);
		Main42.cubeList.add(new ModelBox(Main42, 130, 197, -2.0F, -10.9F, -69.0F, 3, 2, 33, 0.0F, false));

		Main41 = new ModelRenderer(this);
		Main41.setRotationPoint(0.0F, -30.0F, 53.0F);
		gun.addChild(Main41);
		setRotationAngle(Main41, -0.0349F, 0.0F, 0.0F);
		Main41.cubeList.add(new ModelBox(Main41, 143, 0, -2.0F, -7.1861F, -69.293F, 1, 1, 19, 0.0F, false));

		Main40 = new ModelRenderer(this);
		Main40.setRotationPoint(1.0F, -29.5F, 51.0F);
		gun.addChild(Main40);
		Main40.cubeList.add(new ModelBox(Main40, 71, 69, -2.0F, -9.6F, -69.0F, 2, 1, 28, 0.0F, false));

		Main39 = new ModelRenderer(this);
		Main39.setRotationPoint(-2.0F, -29.5F, 51.0F);
		gun.addChild(Main39);
		Main39.cubeList.add(new ModelBox(Main39, 78, 0, -2.0F, -9.6F, -69.0F, 2, 1, 28, 0.0F, false));

		Main35 = new ModelRenderer(this);
		Main35.setRotationPoint(-2.3F, -31.5F, 39.0F);
		gun.addChild(Main35);
		Main35.cubeList.add(new ModelBox(Main35, 89, 109, -2.0F, -9.6F, -69.0F, 1, 1, 2, 0.0F, false));

		Main33 = new ModelRenderer(this);
		Main33.setRotationPoint(2.5F, -30.5F, 43.0F);
		gun.addChild(Main33);
		Main33.cubeList.add(new ModelBox(Main33, 0, 115, -2.0F, -9.601F, -69.0F, 2, 2, 8, 0.0F, false));

		Main30 = new ModelRenderer(this);
		Main30.setRotationPoint(-2.0F, -30.5F, 41.0F);
		gun.addChild(Main30);
		Main30.cubeList.add(new ModelBox(Main30, 159, 256, -2.0F, -9.6F, -69.0F, 1, 2, 34, 0.0F, false));

		Grip4 = new ModelRenderer(this);
		Grip4.setRotationPoint(-1.0F, -17.0F, 55.5F);
		gun.addChild(Grip4);
		setRotationAngle(Grip4, -0.0744F, 0.0F, 0.0F);
		Grip4.cubeList.add(new ModelBox(Grip4, 103, 85, -2.0F, -4.4476F, -70.5225F, 3, 1, 8, 0.0F, false));

		Grip3 = new ModelRenderer(this);
		Grip3.setRotationPoint(-1.0F, -21.5F, 54.5F);
		gun.addChild(Grip3);
		setRotationAngle(Grip3, -0.0372F, 0.0F, 0.0F);
		Grip3.cubeList.add(new ModelBox(Grip3, 0, 55, -1.999F, -7.0286F, -69.3092F, 3, 5, 1, 0.0F, false));

		Grip2 = new ModelRenderer(this);
		Grip2.setRotationPoint(-1.5F, -21.0F, 63.0F);
		gun.addChild(Grip2);
		Grip2.cubeList.add(new ModelBox(Grip2, 34, 86, -2.0F, -9.6F, -69.0F, 4, 1, 10, 0.0F, false));

		Grip1 = new ModelRenderer(this);
		Grip1.setRotationPoint(-2.0F, -22.5F, 54.0F);
		gun.addChild(Grip1);
		Grip1.cubeList.add(new ModelBox(Grip1, 65, 231, -2.0F, -9.6F, -69.0F, 5, 2, 20, 0.0F, false));

		Main28 = new ModelRenderer(this);
		Main28.setRotationPoint(-2.3F, -30.5F, 37.0F);
		gun.addChild(Main28);
		Main28.cubeList.add(new ModelBox(Main28, 22, 10, -2.0F, -9.6F, -68.999F, 1, 2, 4, 0.0F, false));

		Main27 = new ModelRenderer(this);
		Main27.setRotationPoint(-3.2F, -29.5F, 40.5F);
		gun.addChild(Main27);
		Main27.cubeList.add(new ModelBox(Main27, 61, 69, -2.001F, -9.601F, -71.0F, 1, 3, 3, 0.0F, false));

		Main26 = new ModelRenderer(this);
		Main26.setRotationPoint(-3.2F, -27.5F, 41.0F);
		gun.addChild(Main26);
		Main26.cubeList.add(new ModelBox(Main26, 0, 0, -2.0F, -9.6F, -69.0F, 1, 1, 33, 0.0F, false));

		Main25 = new ModelRenderer(this);
		Main25.setRotationPoint(-3.2F, -29.5F, 41.0F);
		gun.addChild(Main25);
		Main25.cubeList.add(new ModelBox(Main25, 0, 34, -2.0F, -9.6F, -69.0F, 1, 1, 33, 0.0F, false));

		Main24 = new ModelRenderer(this);
		Main24.setRotationPoint(2.5F, -27.0F, 37.0F);
		gun.addChild(Main24);
		Main24.cubeList.add(new ModelBox(Main24, 143, 0, -2.0F, -9.6F, -69.0F, 1, 4, 40, 0.0F, false));

		Main22 = new ModelRenderer(this);
		Main22.setRotationPoint(2.5F, -27.0F, 29.0F);
		gun.addChild(Main22);
		Main22.cubeList.add(new ModelBox(Main22, 52, 12, -7.0F, -8.6F, -69.0F, 6, 1, 2, 0.0F, false));

		Main21 = new ModelRenderer(this);
		Main21.setRotationPoint(2.5F, -27.0F, 25.0F);
		gun.addChild(Main21);
		Main21.cubeList.add(new ModelBox(Main21, 51, 64, -7.0F, -8.6F, -69.0F, 6, 1, 2, 0.0F, false));

		Main20 = new ModelRenderer(this);
		Main20.setRotationPoint(2.5F, -27.0F, 21.0F);
		gun.addChild(Main20);
		Main20.cubeList.add(new ModelBox(Main20, 52, 93, -7.0F, -8.6F, -69.0F, 6, 1, 2, 0.0F, false));

		Main19 = new ModelRenderer(this);
		Main19.setRotationPoint(2.5F, -27.0F, 14.0F);
		gun.addChild(Main19);
		Main19.cubeList.add(new ModelBox(Main19, 78, 57, -7.0F, -8.6F, -69.0F, 6, 1, 5, 0.0F, false));

		Main18 = new ModelRenderer(this);
		Main18.setRotationPoint(-3.0F, -29.0F, 41.0F);
		gun.addChild(Main18);
		Main18.cubeList.add(new ModelBox(Main18, 185, 0, -2.0F, -9.6F, -69.0F, 1, 2, 37, 0.0F, false));

		Main17 = new ModelRenderer(this);
		Main17.setRotationPoint(-3.0F, -29.0F, 9.0F);
		gun.addChild(Main17);
		Main17.cubeList.add(new ModelBox(Main17, 0, 69, -2.0F, -9.6F, -69.0F, 1, 2, 32, 0.0F, false));

		Main16 = new ModelRenderer(this);
		Main16.setRotationPoint(-2.5F, -27.0F, 49.0F);
		gun.addChild(Main16);
		Main16.cubeList.add(new ModelBox(Main16, 207, 193, -2.0F, -9.6F, -81.0F, 1, 4, 40, 0.0F, false));

		Main9 = new ModelRenderer(this);
		Main9.setRotationPoint(-2.5F, -27.0F, 9.0F);
		gun.addChild(Main9);
		Main9.cubeList.add(new ModelBox(Main9, 24, 0, -2.0F, -9.6F, -68.998F, 1, 4, 3, 0.0F, false));

		Main7 = new ModelRenderer(this);
		Main7.setRotationPoint(2.3F, -30.5F, 37.0F);
		gun.addChild(Main7);
		Main7.cubeList.add(new ModelBox(Main7, 35, 51, -2.0F, -9.6F, -68.999F, 1, 2, 4, 0.0F, false));

		Main6 = new ModelRenderer(this);
		Main6.setRotationPoint(2.3F, -30.5F, 51.0F);
		gun.addChild(Main6);
		Main6.cubeList.add(new ModelBox(Main6, 0, 167, -2.0F, -9.6F, -69.0F, 1, 2, 25, 0.0F, false));
		Main6.cubeList.add(new ModelBox(Main6, 0, 140, -2.0F, -10.7F, -69.0F, 1, 2, 25, -0.3F, false));
		Main6.cubeList.add(new ModelBox(Main6, 65, 140, -6.3F, -10.7F, -80.0F, 1, 2, 36, -0.3F, false));
		Main6.cubeList.add(new ModelBox(Main6, 100, 111, -5.7F, -10.901F, -69.4F, 5, 2, 1, 0.0F, false));
		Main6.cubeList.add(new ModelBox(Main6, 103, 94, -5.7F, -10.901F, -77.7F, 5, 2, 1, 0.0F, false));

		Main4 = new ModelRenderer(this);
		Main4.setRotationPoint(-2.0F, -23.5F, 9.0F);
		gun.addChild(Main4);
		Main4.cubeList.add(new ModelBox(Main4, 0, 0, -2.0F, -9.6F, -69.001F, 5, 1, 68, 0.0F, false));

		Main3 = new ModelRenderer(this);
		Main3.setRotationPoint(2.5F, -27.0F, 9.0F);
		gun.addChild(Main3);
		Main3.cubeList.add(new ModelBox(Main3, 24, 16, -2.0F, -9.6F, -69.0F, 1, 4, 3, 0.0F, false));

		Main2 = new ModelRenderer(this);
		Main2.setRotationPoint(4.5F, -30.5F, 42.0F);
		gun.addChild(Main2);
		setRotationAngle(Main2, 0.0F, 0.0F, 0.5934F);
		Main2.cubeList.add(new ModelBox(Main2, 100, 115, -7.0263F, -6.8404F, -69.0F, 1, 1, 9, 0.0F, false));

		Main1 = new ModelRenderer(this);
		Main1.setRotationPoint(3.0F, -29.0F, 9.0F);
		gun.addChild(Main1);
		Main1.cubeList.add(new ModelBox(Main1, 0, 69, -2.0F, -9.6F, -69.0F, 1, 2, 69, 0.0F, false));

		Barrel4 = new ModelRenderer(this);
		Barrel4.setRotationPoint(-1.0F, -28.0F, -25.0F);
		gun.addChild(Barrel4);
		Barrel4.cubeList.add(new ModelBox(Barrel4, 201, 1, -2.0F, -10.9F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel3 = new ModelRenderer(this);
		Barrel3.setRotationPoint(1.0F, -28.0F, -25.0F);
		gun.addChild(Barrel3);
		Barrel3.cubeList.add(new ModelBox(Barrel3, 0, 204, -2.0F, -10.9F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel2 = new ModelRenderer(this);
		Barrel2.setRotationPoint(0.0F, -29.0F, -25.0F);
		gun.addChild(Barrel2);
		Barrel2.cubeList.add(new ModelBox(Barrel2, 207, 65, -2.0F, -10.9F, -69.0F, 1, 1, 63, 0.0F, false));

		Barrel1 = new ModelRenderer(this);
		Barrel1.setRotationPoint(0.0F, -27.0F, -25.0F);
		gun.addChild(Barrel1);
		Barrel1.cubeList.add(new ModelBox(Barrel1, 207, 129, -2.0F, -10.9F, -69.0F, 1, 1, 63, 0.0F, false));

		ironsight = new QRenderer(this);
		ironsight.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		IronSight5 = new ModelRenderer(this);
		IronSight5.setRotationPoint(0.0F, -30.5F, 2.0F);
		ironsight.addChild(IronSight5);
		

		IronSight4 = new ModelRenderer(this);
		IronSight4.setRotationPoint(0.0F, -32.0F, 5.0F);
		ironsight.addChild(IronSight4);
		setRotationAngle(IronSight4, -2.7512F, 0.0F, 0.0F);
		IronSight4.cubeList.add(new ModelBox(IronSight4, 89, 112, -1.999F, 35.1347F, 61.1557F, 1, 3, 1, 0.0F, false));

		IronSight3 = new ModelRenderer(this);
		IronSight3.setRotationPoint(0.0F, -32.0F, 3.0F);
		ironsight.addChild(IronSight3);
		IronSight3.cubeList.add(new ModelBox(IronSight3, 112, 110, -2.0F, -9.6F, -69.0F, 1, 3, 1, 0.0F, false));

		IronSight2 = new ModelRenderer(this);
		IronSight2.setRotationPoint(0.0F, -35.0F, 2.0F);
		ironsight.addChild(IronSight2);
		IronSight2.cubeList.add(new ModelBox(IronSight2, 39, 40, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		IronSight1 = new ModelRenderer(this);
		IronSight1.setRotationPoint(0.0F, -35.0F, 1.0F);
		ironsight.addChild(IronSight1);
		IronSight1.cubeList.add(new ModelBox(IronSight1, 52, 69, -2.0F, -9.6F, -69.0F, 1, 6, 1, 0.0F, false));

		belt = new QRenderer(this);
		belt.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Belt11 = new ModelRenderer(this);
		Belt11.setRotationPoint(0.6F, -30.3F, 43.5F);
		belt.addChild(Belt11);
		setRotationAngle(Belt11, 0.0F, 0.0F, 0.3346F);
		Belt11.cubeList.add(new ModelBox(Belt11, 20, 75, -5.0417F, -8.4108F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt11.cubeList.add(new ModelBox(Belt11, 97, 46, -5.0417F, -8.4108F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt11.cubeList.add(new ModelBox(Belt11, 103, 85, -5.0417F, -8.4108F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt10 = new ModelRenderer(this);
		Belt10.setRotationPoint(1.6F, -31.3F, 43.5F);
		belt.addChild(Belt10);
		setRotationAngle(Belt10, 0.0F, 0.0F, 0.9295F);
		Belt10.cubeList.add(new ModelBox(Belt10, 118, 108, -8.889F, -4.1407F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt10.cubeList.add(new ModelBox(Belt10, 93, 87, -8.889F, -4.1407F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt10.cubeList.add(new ModelBox(Belt10, 87, 103, -8.889F, -4.1407F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt9 = new ModelRenderer(this);
		Belt9.setRotationPoint(2.2F, -31.7F, 43.5F);
		belt.addChild(Belt9);
		Belt9.cubeList.add(new ModelBox(Belt9, 84, 119, -2.0F, -9.6F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt9.cubeList.add(new ModelBox(Belt9, 93, 84, -2.0F, -9.6F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt9.cubeList.add(new ModelBox(Belt9, 103, 89, -2.0F, -9.6F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt11_r1 = new ModelRenderer(this);
		Belt11_r1.setRotationPoint(-4.2F, 22.1F, -112.5F);
		Belt9.addChild(Belt11_r1);
		setRotationAngle(Belt11_r1, 0.0F, 0.0F, -0.2269F);
		Belt11_r1.cubeList.add(new ModelBox(Belt11_r1, 34, 91, 8.0F, -30.1F, 46.5F, 2, 1, 3, -0.2F, false));

		Belt8 = new ModelRenderer(this);
		Belt8.setRotationPoint(4.8F, -31.6F, 43.5F);
		belt.addChild(Belt8);
		setRotationAngle(Belt8, 0.0F, 0.0F, 1.673F);
		Belt8.cubeList.add(new ModelBox(Belt8, 15, 121, -9.3457F, 2.9694F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt8.cubeList.add(new ModelBox(Belt8, 24, 86, -9.3457F, 2.9694F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt8.cubeList.add(new ModelBox(Belt8, 60, 103, -9.3457F, 2.9694F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt8.cubeList.add(new ModelBox(Belt8, 71, 69, -9.3457F, 2.9694F, -66.0F, 1, 2, 3, -0.2F, false));

		Belt7 = new ModelRenderer(this);
		Belt7.setRotationPoint(6.3F, -30.9F, 43.5F);
		belt.addChild(Belt7);
		setRotationAngle(Belt7, 0.0F, 0.0F, 2.1564F);
		Belt7.cubeList.add(new ModelBox(Belt7, 122, 124, -6.8953F, 6.9724F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt7.cubeList.add(new ModelBox(Belt7, 78, 46, -6.8953F, 6.9724F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt7.cubeList.add(new ModelBox(Belt7, 50, 103, -6.8953F, 6.9724F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt6 = new ModelRenderer(this);
		Belt6.setRotationPoint(7.3F, -30.0F, 43.5F);
		belt.addChild(Belt6);
		setRotationAngle(Belt6, 0.0F, 0.0F, 2.1564F);
		Belt6.cubeList.add(new ModelBox(Belt6, 71, 126, -6.8953F, 6.9724F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt6.cubeList.add(new ModelBox(Belt6, 78, 23, -6.8953F, 6.9724F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt6.cubeList.add(new ModelBox(Belt6, 98, 12, -6.8953F, 6.9724F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt6.cubeList.add(new ModelBox(Belt6, 24, 23, -6.8953F, 6.9724F, -66.0F, 1, 3, 3, -0.2F, false));

		Belt5 = new ModelRenderer(this);
		Belt5.setRotationPoint(8.3F, -28.5F, 43.5F);
		belt.addChild(Belt5);
		setRotationAngle(Belt5, 0.0F, 0.0F, 2.6025F);
		Belt5.cubeList.add(new ModelBox(Belt5, 83, 126, -3.2119F, 9.2652F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt5.cubeList.add(new ModelBox(Belt5, 78, 5, -3.2119F, 9.2652F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt5.cubeList.add(new ModelBox(Belt5, 98, 8, -3.2119F, 9.2652F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt4 = new ModelRenderer(this);
		Belt4.setRotationPoint(9.0F, -27.0F, 43.5F);
		belt.addChild(Belt4);
		setRotationAngle(Belt4, 0.0F, 0.0F, 2.6025F);
		Belt4.cubeList.add(new ModelBox(Belt4, 95, 126, -3.2119F, 9.2652F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt4.cubeList.add(new ModelBox(Belt4, 71, 74, -3.2119F, 9.2652F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt4.cubeList.add(new ModelBox(Belt4, 97, 42, -3.2119F, 9.2652F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt4.cubeList.add(new ModelBox(Belt4, 12, 0, -3.2119F, 9.2652F, -66.0F, 1, 4, 3, -0.2F, false));

		Belt3 = new ModelRenderer(this);
		Belt3.setRotationPoint(9.5F, -25.5F, 43.5F);
		belt.addChild(Belt3);
		setRotationAngle(Belt3, 0.0F, 0.0F, 2.7884F);
		Belt3.cubeList.add(new ModelBox(Belt3, 107, 126, -1.4441F, 9.6992F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt3.cubeList.add(new ModelBox(Belt3, 62, 54, -1.4441F, 9.6992F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt3.cubeList.add(new ModelBox(Belt3, 97, 20, -1.4441F, 9.6992F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt2 = new ModelRenderer(this);
		Belt2.setRotationPoint(10.0F, -24.0F, 43.5F);
		belt.addChild(Belt2);
		setRotationAngle(Belt2, 0.0F, 0.0F, 2.6769F);
		Belt2.cubeList.add(new ModelBox(Belt2, 36, 131, -2.5147F, 9.4782F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt2.cubeList.add(new ModelBox(Belt2, 54, 40, -2.5147F, 9.4782F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt2.cubeList.add(new ModelBox(Belt2, 97, 16, -2.5147F, 9.4782F, -66.0F, 1, 1, 3, 0.1F, false));

		Belt1 = new ModelRenderer(this);
		Belt1.setRotationPoint(10.5F, -22.5F, 43.5F);
		belt.addChild(Belt1);
		setRotationAngle(Belt1, 0.0F, 0.0F, 2.7884F);
		Belt1.cubeList.add(new ModelBox(Belt1, 136, 110, -1.4441F, 9.6992F, -67.0F, 1, 1, 5, 0.0F, false));
		Belt1.cubeList.add(new ModelBox(Belt1, 35, 40, -1.4441F, 9.6992F, -68.9F, 1, 1, 2, -0.1F, false));
		Belt1.cubeList.add(new ModelBox(Belt1, 25, 63, -1.4441F, 9.6992F, -66.0F, 1, 1, 3, 0.1F, false));
		Belt1.cubeList.add(new ModelBox(Belt1, 0, 0, -1.4441F, 8.4992F, -66.0F, 1, 6, 3, -0.2F, false));

		hatch = new QRenderer(this);
		hatch.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Hatch39 = new ModelRenderer(this);
		Hatch39.setRotationPoint(4.0F, -34.0F, 51.0F);
		hatch.addChild(Hatch39);
		setRotationAngle(Hatch39, 0.0F, -1.8218F, 0.0F);
		Hatch39.cubeList.add(new ModelBox(Hatch39, 130, 66, -66.342F, -9.599F, 19.0721F, 5, 1, 1, 0.0F, false));

		Hatch38 = new ModelRenderer(this);
		Hatch38.setRotationPoint(-3.1F, -32.1F, 59.0F);
		hatch.addChild(Hatch38);
		setRotationAngle(Hatch38, 0.0F, 0.0F, -0.8179F);
		Hatch38.cubeList.add(new ModelBox(Hatch38, 142, 133, 5.638F, -8.0233F, -69.0F, 1, 1, 8, 0.0F, false));

		Hatch37 = new ModelRenderer(this);
		Hatch37.setRotationPoint(-2.9F, -32.6F, 58.5F);
		hatch.addChild(Hatch37);
		Hatch37.cubeList.add(new ModelBox(Hatch37, 97, 24, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Hatch36 = new ModelRenderer(this);
		Hatch36.setRotationPoint(-2.9F, -32.8F, 66.5F);
		hatch.addChild(Hatch36);
		Hatch36.cubeList.add(new ModelBox(Hatch36, 47, 97, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Hatch35 = new ModelRenderer(this);
		Hatch35.setRotationPoint(-2.7F, -33.0F, 58.0F);
		hatch.addChild(Hatch35);
		setRotationAngle(Hatch35, -1.2641F, 0.0F, 0.0F);
		Hatch35.cubeList.add(new ModelBox(Hatch35, 50, 113, -1.999F, 62.881F, -29.9856F, 1, 3, 1, 0.0F, false));

		Hatch34 = new ModelRenderer(this);
		Hatch34.setRotationPoint(-2.7F, -33.0F, 60.0F);
		hatch.addChild(Hatch34);
		setRotationAngle(Hatch34, -0.3346F, 0.0F, 0.0F);
		Hatch34.cubeList.add(new ModelBox(Hatch34, 50, 107, -1.999F, 13.5919F, -68.3258F, 1, 1, 3, 0.0F, false));

		Hatch33 = new ModelRenderer(this);
		Hatch33.setRotationPoint(-2.7F, -33.4F, 66.0F);
		hatch.addChild(Hatch33);
		setRotationAngle(Hatch33, -1.1525F, 0.0F, 0.0F);
		Hatch33.cubeList.add(new ModelBox(Hatch33, 54, 113, -1.999F, 59.1528F, -36.7982F, 1, 3, 1, 0.0F, false));

		Hatch32 = new ModelRenderer(this);
		Hatch32.setRotationPoint(-2.7F, -33.4F, 68.0F);
		hatch.addChild(Hatch32);
		setRotationAngle(Hatch32, -0.0873F, 0.0F, 0.0F);
		Hatch32.cubeList.add(new ModelBox(Hatch32, 34, 77, -1.999F, -3.5497F, -69.5741F, 1, 1, 7, 0.0F, false));

		Hatch31 = new ModelRenderer(this);
		Hatch31.setRotationPoint(-2.7F, -33.0F, 58.0F);
		hatch.addChild(Hatch31);
		Hatch31.cubeList.add(new ModelBox(Hatch31, 0, 109, -2.0F, -9.6F, -69.0F, 1, 1, 2, 0.0F, false));

		Hatch30 = new ModelRenderer(this);
		Hatch30.setRotationPoint(-2.7F, -33.4F, 66.0F);
		hatch.addChild(Hatch30);
		Hatch30.cubeList.add(new ModelBox(Hatch30, 109, 29, -2.0F, -9.6F, -69.0F, 1, 1, 2, 0.0F, false));

		Hatch29 = new ModelRenderer(this);
		Hatch29.setRotationPoint(-2.7F, -31.0F, 55.0F);
		hatch.addChild(Hatch29);
		setRotationAngle(Hatch29, 0.0372F, 0.0F, 0.0F);
		Hatch29.cubeList.add(new ModelBox(Hatch29, 24, 268, -2.0F, -13.1581F, -68.5955F, 1, 2, 20, 0.0F, false));

		Hatch28 = new ModelRenderer(this);
		Hatch28.setRotationPoint(2.1F, -33.0F, 39.5F);
		hatch.addChild(Hatch28);
		Hatch28.cubeList.add(new ModelBox(Hatch28, 24, 99, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Hatch27 = new ModelRenderer(this);
		Hatch27.setRotationPoint(-2.1F, -33.0F, 39.5F);
		hatch.addChild(Hatch27);
		Hatch27.cubeList.add(new ModelBox(Hatch27, 28, 99, -2.0F, -9.6F, -69.0F, 1, 1, 1, 0.0F, false));

		Hatch26 = new ModelRenderer(this);
		Hatch26.setRotationPoint(3.0F, -34.0F, 42.0F);
		hatch.addChild(Hatch26);
		Hatch26.cubeList.add(new ModelBox(Hatch26, 13, 20, -2.0F, -9.6F, -68.999F, 1, 2, 9, 0.0F, false));
		Hatch26.cubeList.add(new ModelBox(Hatch26, 202, 273, -1.73F, -9.0F, -68.998F, 2, 1, 9, 0.0F, false));
		Hatch26.cubeList.add(new ModelBox(Hatch26, 238, 278, -1.729F, -8.6F, -68.997F, 2, 1, 9, 0.0F, false));

		Hatch25 = new ModelRenderer(this);
		Hatch25.setRotationPoint(-2.0F, -32.0F, 39.0F);
		hatch.addChild(Hatch25);
		setRotationAngle(Hatch25, 0.7854F, 0.0F, 0.0F);
		Hatch25.cubeList.add(new ModelBox(Hatch25, 118, 73, -2.0F, -55.5786F, -42.0021F, 5, 2, 1, 0.0F, false));

		Hatch24 = new ModelRenderer(this);
		Hatch24.setRotationPoint(-2.0F, -33.0F, 39.0F);
		hatch.addChild(Hatch24);
		setRotationAngle(Hatch24, 0.7854F, 0.0F, 0.0F);
		Hatch24.cubeList.add(new ModelBox(Hatch24, 119, 130, -1.999F, -55.5796F, -41.6021F, 5, 1, 1, 0.0F, false));

		Hatch23 = new ModelRenderer(this);
		Hatch23.setRotationPoint(-2.0F, -33.0F, 39.0F);
		hatch.addChild(Hatch23);
		setRotationAngle(Hatch23, 0.7854F, 0.0F, 0.0F);
		Hatch23.cubeList.add(new ModelBox(Hatch23, 43, 131, -2.0F, -55.5786F, -42.0021F, 5, 1, 1, 0.0F, false));

		Hatch22 = new ModelRenderer(this);
		Hatch22.setRotationPoint(-2.0F, -31.5F, 41.0F);
		hatch.addChild(Hatch22);
		Hatch22.cubeList.add(new ModelBox(Hatch22, 35, 12, -2.0F, -9.6F, -69.0F, 5, 1, 2, 0.0F, false));

		Hatch21 = new ModelRenderer(this);
		Hatch21.setRotationPoint(-2.0F, -32.5F, 40.0F);
		hatch.addChild(Hatch21);
		Hatch21.cubeList.add(new ModelBox(Hatch21, 118, 69, -1.999F, -9.6F, -69.0F, 5, 1, 3, 0.0F, false));

		Hatch20 = new ModelRenderer(this);
		Hatch20.setRotationPoint(-2.0F, -33.0F, 39.0F);
		hatch.addChild(Hatch20);
		Hatch20.cubeList.add(new ModelBox(Hatch20, 71, 119, -1.998F, -9.6F, -69.0F, 5, 1, 4, 0.0F, false));

		Hatch19 = new ModelRenderer(this);
		Hatch19.setRotationPoint(-0.9F, -34.4F, 41.0F);
		hatch.addChild(Hatch19);
		Hatch19.cubeList.add(new ModelBox(Hatch19, 71, 98, -2.0F, -9.6F, -68.999F, 1, 1, 27, 0.0F, false));

		Hatch18 = new ModelRenderer(this);
		Hatch18.setRotationPoint(0.9F, -34.4F, 41.0F);
		hatch.addChild(Hatch18);
		Hatch18.cubeList.add(new ModelBox(Hatch18, 0, 103, -2.0F, -9.6F, -68.999F, 1, 1, 27, 0.0F, false));

		Hatch17 = new ModelRenderer(this);
		Hatch17.setRotationPoint(0.8F, -35.0F, 41.0F);
		hatch.addChild(Hatch17);
		Hatch17.cubeList.add(new ModelBox(Hatch17, 136, 64, -2.0F, -9.601F, -69.001F, 1, 1, 27, 0.0F, false));

		Hatch16 = new ModelRenderer(this);
		Hatch16.setRotationPoint(-0.8F, -35.0F, 41.0F);
		hatch.addChild(Hatch16);
		Hatch16.cubeList.add(new ModelBox(Hatch16, 78, 29, -2.0F, -9.6F, -69.0F, 2, 1, 27, 0.0F, false));

		Hatch15 = new ModelRenderer(this);
		Hatch15.setRotationPoint(-2.0F, -34.0F, 76.0F);
		hatch.addChild(Hatch15);
		setRotationAngle(Hatch15, -0.3346F, 0.0F, 0.0F);
		Hatch15.cubeList.add(new ModelBox(Hatch15, 41, 126, -1.999F, 13.5909F, -67.8258F, 5, 2, 1, 0.0F, false));

		Hatch14 = new ModelRenderer(this);
		Hatch14.setRotationPoint(-2.0F, -34.0F, 76.0F);
		hatch.addChild(Hatch14);
		setRotationAngle(Hatch14, -0.3346F, 0.0F, 0.0F);
		Hatch14.cubeList.add(new ModelBox(Hatch14, 80, 133, -2.0F, 13.5919F, -68.3258F, 5, 1, 1, 0.0F, false));

		Hatch13 = new ModelRenderer(this);
		Hatch13.setRotationPoint(-2.5F, -33.5F, 75.0F);
		hatch.addChild(Hatch13);
		Hatch13.cubeList.add(new ModelBox(Hatch13, 78, 19, -2.0F, -9.6F, -69.0F, 1, 2, 2, 0.0F, false));

		Hatch12 = new ModelRenderer(this);
		Hatch12.setRotationPoint(2.5F, -33.5F, 75.0F);
		hatch.addChild(Hatch12);
		Hatch12.cubeList.add(new ModelBox(Hatch12, 78, 42, -2.0F, -9.6F, -69.0F, 1, 2, 2, 0.0F, false));

		Main120 = new ModelRenderer(this);
		Main120.setRotationPoint(4.5F, -33.5F, 51.5F);
		hatch.addChild(Main120);
		setRotationAngle(Main120, 0.0F, -1.8218F, 0.0F);
		Main120.cubeList.add(new ModelBox(Main120, 29, 126, -66.342F, -9.601F, 19.0721F, 5, 3, 1, 0.0F, false));
		Main120.cubeList.add(new ModelBox(Main120, 111, 115, -67.042F, -9.8F, 18.8731F, 1, 2, 1, -0.2F, false));

		Hatch11 = new ModelRenderer(this);
		Hatch11.setRotationPoint(4.0F, -34.0F, 42.0F);
		hatch.addChild(Hatch11);
		setRotationAngle(Hatch11, 0.0F, 0.0F, 0.4461F);
		Hatch11.cubeList.add(new ModelBox(Hatch11, 78, 109, -5.5465F, -7.7984F, -68.999F, 1, 1, 9, 0.0F, false));

		Hatch9 = new ModelRenderer(this);
		Hatch9.setRotationPoint(-2.5F, -33.5F, 45.0F);
		hatch.addChild(Hatch9);
		setRotationAngle(Hatch9, 0.0F, 1.3756F, 0.0F);
		Hatch9.cubeList.add(new ModelBox(Hatch9, 0, 94, 66.3019F, -9.601F, -15.3446F, 4, 3, 1, 0.0F, false));

		Hatch8 = new ModelRenderer(this);
		Hatch8.setRotationPoint(-2.5F, -33.5F, 51.0F);
		hatch.addChild(Hatch8);
		Hatch8.cubeList.add(new ModelBox(Hatch8, 136, 92, -2.0F, -9.6F, -69.999F, 1, 3, 25, 0.0F, false));

		Hatch6 = new ModelRenderer(this);
		Hatch6.setRotationPoint(-3.0F, -31.5F, 50.0F);
		hatch.addChild(Hatch6);
		Hatch6.cubeList.add(new ModelBox(Hatch6, 109, 35, -2.0F, -10.1F, -69.0F, 1, 1, 1, 0.0F, false));

		Hatch5 = new ModelRenderer(this);
		Hatch5.setRotationPoint(-3.0F, -31.5F, 45.0F);
		hatch.addChild(Hatch5);
		Hatch5.cubeList.add(new ModelBox(Hatch5, 109, 45, -2.0F, -10.1F, -69.0F, 1, 1, 1, 0.0F, false));

		Hatch4 = new ModelRenderer(this);
		Hatch4.setRotationPoint(-3.0F, -33.5F, 45.0F);
		hatch.addChild(Hatch4);
		Hatch4.cubeList.add(new ModelBox(Hatch4, 85, 69, -2.0F, -9.1F, -69.0F, 1, 1, 6, 0.0F, false));
		Hatch4.cubeList.add(new ModelBox(Hatch4, 54, 51, -2.001F, -10.1F, -68.999F, 1, 1, 6, 0.0F, false));

		Hatch3 = new ModelRenderer(this);
		Hatch3.setRotationPoint(4.0F, -34.0F, 42.0F);
		hatch.addChild(Hatch3);
		setRotationAngle(Hatch3, 0.0F, 0.0F, 0.4461F);
		Hatch3.cubeList.add(new ModelBox(Hatch3, 110, 10, -5.9465F, -7.7974F, -69.0F, 1, 1, 9, 0.0F, false));

		Hatch2 = new ModelRenderer(this);
		Hatch2.setRotationPoint(-2.0F, -34.0F, 40.0F);
		hatch.addChild(Hatch2);
		Hatch2.cubeList.add(new ModelBox(Hatch2, 234, 237, -2.001F, -9.6F, -69.0F, 5, 1, 36, 0.0F, false));

		Hatch1 = new ModelRenderer(this);
		Hatch1.setRotationPoint(2.5F, -33.5F, 51.0F);
		hatch.addChild(Hatch1);
		Hatch1.cubeList.add(new ModelBox(Hatch1, 65, 204, -2.0F, -9.6F, -69.0F, 1, 3, 24, 0.0F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Stock12 = new ModelRenderer(this);
		Stock12.setRotationPoint(-2.5F, -19.2F, 93.5F);
		stock.addChild(Stock12);
		setRotationAngle(Stock12, 0.8179F, 0.0F, 0.0F);
		Stock12.cubeList.add(new ModelBox(Stock12, 50, 97, -2.001F, -56.9153F, -40.1722F, 6, 2, 2, 0.0F, false));

		Stock11 = new ModelRenderer(this);
		Stock11.setRotationPoint(-2.5F, -19.2F, 93.5F);
		stock.addChild(Stock11);
		setRotationAngle(Stock11, -0.0372F, 0.0F, 0.0F);
		Stock11.cubeList.add(new ModelBox(Stock11, 174, 44, -1.999F, -7.0286F, -69.3092F, 6, 2, 14, 0.0F, false));

		Stock10 = new ModelRenderer(this);
		Stock10.setRotationPoint(-1.5F, -29.2F, 100.5F);
		stock.addChild(Stock10);
		setRotationAngle(Stock10, 0.0372F, 0.0F, 0.0F);
		Stock10.cubeList.add(new ModelBox(Stock10, 103, 69, -1.999F, -12.1581F, -68.5955F, 4, 2, 7, 0.0F, false));

		Stock9 = new ModelRenderer(this);
		Stock9.setRotationPoint(-1.5F, -29.2F, 100.5F);
		stock.addChild(Stock9);
		setRotationAngle(Stock9, -1.1525F, 0.0F, 0.0F);
		Stock9.cubeList.add(new ModelBox(Stock9, 21, 34, -2.0F, 59.1528F, -36.7982F, 4, 7, 2, 0.0F, false));

		Stock8 = new ModelRenderer(this);
		Stock8.setRotationPoint(-2.5F, -28.2F, 100.5F);
		stock.addChild(Stock8);
		setRotationAngle(Stock8, -1.1525F, 0.0F, 0.0F);
		Stock8.cubeList.add(new ModelBox(Stock8, 52, 86, -2.001F, 59.1528F, -36.7982F, 6, 5, 2, 0.0F, false));

		Stock7 = new ModelRenderer(this);
		Stock7.setRotationPoint(-1.5F, -31.0F, 79.0F);
		stock.addChild(Stock7);
		setRotationAngle(Stock7, -0.1745F, 0.0F, 0.0F);
		Stock7.cubeList.add(new ModelBox(Stock7, 35, 16, -1.999F, 3.5276F, -63.6188F, 4, 1, 12, 0.0F, false));

		Stock6 = new ModelRenderer(this);
		Stock6.setRotationPoint(-2.5F, -21.5F, 78.0F);
		stock.addChild(Stock6);
		setRotationAngle(Stock6, 1.673F, 0.0F, 0.0F);
		Stock6.cubeList.add(new ModelBox(Stock6, 29, 103, -2.0F, -67.6599F, 16.5923F, 6, 10, 3, 0.0F, false));

		Stock5 = new ModelRenderer(this);
		Stock5.setRotationPoint(-2.5F, -31.0F, 81.0F);
		stock.addChild(Stock5);
		setRotationAngle(Stock5, -0.6002F, 0.0F, 0.0F);
		Stock5.cubeList.add(new ModelBox(Stock5, 78, 42, -2.0F, 31.0513F, -63.3616F, 6, 3, 7, 0.0F, false));

		Stock4 = new ModelRenderer(this);
		Stock4.setRotationPoint(-2.5F, -28.2F, 100.5F);
		stock.addChild(Stock4);
		Stock4.cubeList.add(new ModelBox(Stock4, 78, 19, -2.0F, -9.6F, -69.0F, 6, 2, 7, 0.0F, false));

		Stock3 = new ModelRenderer(this);
		Stock3.setRotationPoint(-2.5F, -26.2F, 94.5F);
		stock.addChild(Stock3);
		Stock3.cubeList.add(new ModelBox(Stock3, 207, 193, -2.0F, -9.6F, -69.0F, 6, 8, 13, 0.0F, false));

		Stock2 = new ModelRenderer(this);
		Stock2.setRotationPoint(-2.5F, -30.0F, 79.0F);
		stock.addChild(Stock2);
		setRotationAngle(Stock2, -0.1745F, 0.0F, 0.0F);
		Stock2.cubeList.add(new ModelBox(Stock2, 154, 232, -1.999F, 3.5276F, -69.6188F, 6, 5, 17, 0.0F, false));

		Stock1 = new ModelRenderer(this);
		Stock1.setRotationPoint(-1.5F, -32.0F, 81.0F);
		stock.addChild(Stock1);
		setRotationAngle(Stock1, -0.6002F, 0.0F, 0.0F);
		Stock1.cubeList.add(new ModelBox(Stock1, 111, 115, -2.0F, 31.0513F, -62.3616F, 4, 3, 6, 0.0F, false));

		mk48para_stock = new QRenderer(this);
		mk48para_stock.setRotationPoint(3.0F, 4.25F, 81.0F);
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 0, 55, -7.499F, -16.85F, -69.0F, 6, 3, 8, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 78, 0, -5.499F, -20.85F, -69.002F, 2, 11, 8, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 207, 129, -5.499F, -20.35F, -61.002F, 2, 2, 23, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 206, 39, -5.499F, -12.35F, -61.002F, 2, 2, 23, 0.0F, false));
		mk48para_stock.cubeList.add(new ModelBox(mk48para_stock, 71, 69, -5.999F, -19.85F, -69.001F, 3, 9, 8, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0F, -9.8F, -70.9F);
		mk48para_stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9076F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 34, 97, -4.999F, -1.0F, -3.0F, 5, 1, 3, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -9.6F, -70.0F);
		mk48para_stock.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.0349F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 103, -4.499F, -12.0F, 0.0F, 4, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 118, 98, -4.998F, -10.8F, -2.0F, 5, 9, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 93, 29, -4.998F, -11.0F, -1.0F, 5, 10, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 0, -4.999F, -11.0F, 0.0F, 5, 11, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-7.5F, -13.85F, -69.0F);
		mk48para_stock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 12, 0, -0.001F, -2.0F, 0.001F, 2, 2, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-1.5F, -13.85F, -69.0F);
		mk48para_stock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 109, 39, -1.999F, -2.0F, 0.001F, 2, 2, 8, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-7.5F, -16.85F, -69.0F);
		mk48para_stock.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 109, 29, -0.001F, -2.0F, 0.001F, 2, 2, 8, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.5F, -16.85F, -69.0F);
		mk48para_stock.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 110, 0, -1.999F, -2.0F, 0.001F, 2, 2, 8, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-6.001F, -19.85F, -69.001F);
		mk48para_stock.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -1.0996F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 121, 10, 0.051F, 0.05F, -0.049F, 1, 1, 8, 0.05F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.001F, -10.85F, -69.001F);
		mk48para_stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 1.0996F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 121, 31, 0.051F, -1.05F, -0.049F, 1, 1, 8, 0.05F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.999F, -19.85F, -69.001F);
		mk48para_stock.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 1.0996F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 50, 113, -1.051F, 0.05F, -0.049F, 1, 1, 8, 0.05F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.999F, -10.85F, -69.001F);
		mk48para_stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -1.0996F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 121, 41, -1.051F, -1.05F, -0.049F, 1, 1, 8, 0.05F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.599F, -14.45F, -61.502F);
		mk48para_stock.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3316F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 96, 52, -2.5F, -2.5F, 2.0F, 2, 2, 2, -0.2F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 57, -3.0F, -3.0F, 0.5F, 3, 3, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.999F, -20.85F, -37.002F);
		mk48para_stock.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0524F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 98, -3.0F, 0.0F, -2.0F, 3, 11, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-2.0F, -9.6F, -70.0F);
		mk48para_stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.2269F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 130, 64, -5.0F, -1.0F, -1.0F, 5, 1, 1, 0.0F, false));

		stockadapter = new QRenderer(this);
		stockadapter.setRotationPoint(3.0F, 4.25F, 81.0F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-2.0F, -9.8F, -70.9F);
		stockadapter.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.9076F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 29, -4.999F, -1.0F, -3.0F, 5, 1, 3, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-2.0F, -9.6F, -70.0F);
		stockadapter.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0349F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 87, 101, -4.499F, -12.0F, 0.0F, 4, 1, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 12, 103, -4.998F, -10.8F, -2.0F, 5, 9, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 55, 16, -4.998F, -11.0F, -1.0F, 5, 10, 1, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 35, 16, -4.999F, -11.0F, 0.0F, 5, 11, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-2.0F, -9.6F, -70.0F);
		stockadapter.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.2269F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 121, 29, -5.0F, -1.0F, -1.0F, 5, 1, 1, 0.0F, false));

		upperhandguard = new QRenderer(this);
		upperhandguard.setRotationPoint(0.0F, 23.0F, 0.0F);
		

		Main153 = new ModelRenderer(this);
		Main153.setRotationPoint(-1.0F, -32.0F, 30.0F);
		upperhandguard.addChild(Main153);
		setRotationAngle(Main153, 0.0F, 0.0F, 0.9948F);
		Main153.cubeList.add(new ModelBox(Main153, 78, 29, -9.1405F, -2.5512F, -69.0F, 1, 1, 4, 0.0F, false));

		Main152 = new ModelRenderer(this);
		Main152.setRotationPoint(-1.0F, -32.0F, 28.0F);
		upperhandguard.addChild(Main152);
		setRotationAngle(Main152, 0.0F, 0.0F, 0.9948F);
		Main152.cubeList.add(new ModelBox(Main152, 58, 40, -9.1405F, -2.5512F, -69.0F, 1, 1, 1, 0.0F, false));

		Main151 = new ModelRenderer(this);
		Main151.setRotationPoint(-1.0F, -32.0F, 26.0F);
		upperhandguard.addChild(Main151);
		setRotationAngle(Main151, 0.0F, 0.0F, 0.9948F);
		Main151.cubeList.add(new ModelBox(Main151, 75, 74, -9.1405F, -2.5512F, -69.0F, 1, 1, 1, 0.0F, false));

		Main150 = new ModelRenderer(this);
		Main150.setRotationPoint(-1.0F, -32.0F, 24.0F);
		upperhandguard.addChild(Main150);
		setRotationAngle(Main150, 0.0F, 0.0F, 0.9948F);
		Main150.cubeList.add(new ModelBox(Main150, 82, 5, -9.1405F, -2.5512F, -69.0F, 1, 1, 1, 0.0F, false));

		Main149 = new ModelRenderer(this);
		Main149.setRotationPoint(-1.0F, -32.0F, 21.0F);
		upperhandguard.addChild(Main149);
		setRotationAngle(Main149, 0.0F, 0.0F, 0.9948F);
		Main149.cubeList.add(new ModelBox(Main149, 103, 69, -9.1405F, -2.5512F, -69.0F, 1, 1, 2, 0.0F, false));

		Main148 = new ModelRenderer(this);
		Main148.setRotationPoint(-1.0F, -32.0F, 19.0F);
		upperhandguard.addChild(Main148);
		setRotationAngle(Main148, 0.0F, 0.0F, 0.9948F);
		Main148.cubeList.add(new ModelBox(Main148, 43, 82, -9.1405F, -2.5512F, -69.0F, 1, 1, 1, 0.0F, false));

		Main147 = new ModelRenderer(this);
		Main147.setRotationPoint(-1.0F, -32.0F, 17.0F);
		upperhandguard.addChild(Main147);
		setRotationAngle(Main147, 0.0F, 0.0F, 0.9948F);
		Main147.cubeList.add(new ModelBox(Main147, 61, 82, -9.1405F, -2.5512F, -69.0F, 1, 1, 1, 0.0F, false));

		Main146 = new ModelRenderer(this);
		Main146.setRotationPoint(-1.0F, -32.0F, 15.0F);
		upperhandguard.addChild(Main146);
		setRotationAngle(Main146, 0.0F, 0.0F, 0.9948F);
		Main146.cubeList.add(new ModelBox(Main146, 65, 82, -9.1405F, -2.5512F, -69.0F, 1, 1, 1, 0.0F, false));

		Main145 = new ModelRenderer(this);
		Main145.setRotationPoint(-1.0F, -32.0F, 12.0F);
		upperhandguard.addChild(Main145);
		setRotationAngle(Main145, 0.0F, 0.0F, 0.9948F);
		Main145.cubeList.add(new ModelBox(Main145, 103, 72, -9.1405F, -2.5512F, -68.999F, 1, 1, 2, 0.0F, false));

		Main144 = new ModelRenderer(this);
		Main144.setRotationPoint(1.5F, -31.2F, 30.0F);
		upperhandguard.addChild(Main144);
		setRotationAngle(Main144, 0.0F, 0.0F, -0.9948F);
		Main144.cubeList.add(new ModelBox(Main144, 78, 34, 6.962F, -5.9059F, -69.0F, 1, 1, 4, 0.0F, false));

		Main143 = new ModelRenderer(this);
		Main143.setRotationPoint(1.5F, -31.2F, 28.0F);
		upperhandguard.addChild(Main143);
		setRotationAngle(Main143, 0.0F, 0.0F, -0.9948F);
		Main143.cubeList.add(new ModelBox(Main143, 85, 73, 6.962F, -5.9059F, -69.0F, 1, 1, 1, 0.0F, false));

		Main142 = new ModelRenderer(this);
		Main142.setRotationPoint(1.5F, -31.2F, 26.0F);
		upperhandguard.addChild(Main142);
		setRotationAngle(Main142, 0.0F, 0.0F, -0.9948F);
		Main142.cubeList.add(new ModelBox(Main142, 28, 86, 6.962F, -5.9059F, -69.0F, 1, 1, 1, 0.0F, false));

		Main141 = new ModelRenderer(this);
		Main141.setRotationPoint(1.5F, -31.2F, 24.0F);
		upperhandguard.addChild(Main141);
		setRotationAngle(Main141, 0.0F, 0.0F, -0.9948F);
		Main141.cubeList.add(new ModelBox(Main141, 83, 90, 6.962F, -5.9059F, -69.0F, 1, 1, 1, 0.0F, false));

		Main140 = new ModelRenderer(this);
		Main140.setRotationPoint(1.5F, -31.2F, 21.0F);
		upperhandguard.addChild(Main140);
		setRotationAngle(Main140, 0.0F, 0.0F, -0.9948F);
		Main140.cubeList.add(new ModelBox(Main140, 92, 103, 6.962F, -5.9059F, -69.0F, 1, 1, 2, 0.0F, false));

		Main139 = new ModelRenderer(this);
		Main139.setRotationPoint(1.5F, -31.2F, 19.0F);
		upperhandguard.addChild(Main139);
		setRotationAngle(Main139, 0.0F, 0.0F, -0.9948F);
		Main139.cubeList.add(new ModelBox(Main139, 93, 73, 6.962F, -5.9059F, -69.0F, 1, 1, 1, 0.0F, false));

		Main138 = new ModelRenderer(this);
		Main138.setRotationPoint(1.5F, -31.2F, 17.0F);
		upperhandguard.addChild(Main138);
		setRotationAngle(Main138, 0.0F, 0.0F, -0.9948F);
		Main138.cubeList.add(new ModelBox(Main138, 93, 90, 6.962F, -5.9059F, -69.0F, 1, 1, 1, 0.0F, false));

		Main137 = new ModelRenderer(this);
		Main137.setRotationPoint(1.5F, -31.2F, 15.0F);
		upperhandguard.addChild(Main137);
		setRotationAngle(Main137, 0.0F, 0.0F, -0.9948F);
		Main137.cubeList.add(new ModelBox(Main137, 94, 64, 6.962F, -5.9059F, -69.0F, 1, 1, 1, 0.0F, false));

		Main136 = new ModelRenderer(this);
		Main136.setRotationPoint(1.5F, -31.2F, 12.0F);
		upperhandguard.addChild(Main136);
		setRotationAngle(Main136, 0.0F, 0.0F, -0.9948F);
		Main136.cubeList.add(new ModelBox(Main136, 60, 107, 6.962F, -5.9059F, -68.999F, 1, 1, 2, 0.0F, false));

		Main97 = new ModelRenderer(this);
		Main97.setRotationPoint(2.8F, -30.5F, 12.0F);
		upperhandguard.addChild(Main97);
		setRotationAngle(Main97, 0.0F, 0.0F, -0.2967F);
		Main97.cubeList.add(new ModelBox(Main97, 130, 232, 0.8942F, -9.8653F, -69.001F, 1, 1, 22, 0.0F, false));

		Main98 = new ModelRenderer(this);
		Main98.setRotationPoint(-2.0F, -31.0F, 33.0F);
		upperhandguard.addChild(Main98);
		Main98.cubeList.add(new ModelBox(Main98, 12, 127, -2.0F, -9.6F, -68.999F, 5, 2, 1, 0.0F, false));

		Main96 = new ModelRenderer(this);
		Main96.setRotationPoint(1.5F, -31.2F, 12.0F);
		upperhandguard.addChild(Main96);
		setRotationAngle(Main96, 0.0F, 0.0F, -0.9948F);
		Main96.cubeList.add(new ModelBox(Main96, 266, 0, 6.962F, -6.9059F, -69.001F, 1, 1, 22, 0.0F, false));

		Main95 = new ModelRenderer(this);
		Main95.setRotationPoint(-2.0F, -31.0F, 12.0F);
		upperhandguard.addChild(Main95);
		Main95.cubeList.add(new ModelBox(Main95, 104, 133, -2.0F, -9.6F, -69.0F, 5, 1, 1, 0.0F, false));

		Main56 = new ModelRenderer(this);
		Main56.setRotationPoint(-1.0F, -32.0F, 12.0F);
		upperhandguard.addChild(Main56);
		Main56.cubeList.add(new ModelBox(Main56, 0, 231, -2.0F, -9.6F, -68.999F, 3, 1, 22, 0.0F, false));

		Main55 = new ModelRenderer(this);
		Main55.setRotationPoint(-1.0F, -32.0F, 12.0F);
		upperhandguard.addChild(Main55);
		setRotationAngle(Main55, 0.0F, 0.0F, 0.9948F);
		Main55.cubeList.add(new ModelBox(Main55, 266, 23, -9.1405F, -3.5512F, -69.001F, 1, 1, 22, 0.0F, false));

		Main54 = new ModelRenderer(this);
		Main54.setRotationPoint(-2.6F, -31.0F, 12.0F);
		upperhandguard.addChild(Main54);
		setRotationAngle(Main54, 0.0F, 0.0F, 0.3665F);
		Main54.cubeList.add(new ModelBox(Main54, 0, 268, -5.3075F, -8.1456F, -69.001F, 1, 1, 22, 0.0F, false));

		Main53 = new ModelRenderer(this);
		Main53.setRotationPoint(-3.0F, -30.0F, 12.0F);
		upperhandguard.addChild(Main53);
		Main53.cubeList.add(new ModelBox(Main53, 106, 261, -2.0F, -9.6F, -69.0F, 1, 2, 22, 0.0F, false));

		Main8 = new ModelRenderer(this);
		Main8.setRotationPoint(3.0F, -30.0F, 12.0F);
		upperhandguard.addChild(Main8);
		Main8.cubeList.add(new ModelBox(Main8, 130, 263, -2.0F, -9.6F, -69.0F, 1, 2, 22, 0.0F, false));

		mk48upperguard = new QRenderer(this);
		mk48upperguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 154, 261, 1.1F, -39.1F, -57.0F, 1, 2, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 272, 84, 1.101F, -37.6F, -56.999F, 1, 1, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 272, 129, 1.402F, -41.4F, -57.0F, 1, 1, 18, -0.3F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 104, 115, 1.1F, -41.1F, -57.0F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 115, 94, 1.1F, -41.1F, -54.25F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 5, 105, -5.1F, -41.1F, -54.25F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 92, 115, 1.1F, -41.1F, -51.5F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 112, 57, -5.1F, -41.1F, -51.5F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 12, 115, 1.1F, -41.1F, -48.75F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 60, 113, -5.1F, -41.1F, -48.75F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 4, 115, 1.1F, -41.1F, -46.0F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 64, 113, -5.1F, -41.1F, -46.0F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 0, 115, 1.1F, -41.1F, -43.25F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 114, 0, -5.1F, -41.1F, -43.25F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 114, 16, 1.1F, -41.1F, -40.5F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 114, 3, -5.1F, -41.1F, -40.5F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 114, 13, 1.101F, -41.1F, -40.0F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 114, 10, -5.099F, -41.1F, -40.0F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 143, 20, -2.8F, -44.6F, -57.0F, 2, 1, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 272, 148, -1.2F, -44.601F, -57.001F, 1, 1, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 46, 268, -3.5F, -43.65F, -57.0F, 4, 1, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 224, 0, -5.1F, -39.1F, -57.0F, 1, 2, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 272, 65, -5.101F, -37.6F, -56.999F, 1, 1, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 272, 103, -5.402F, -41.4F, -57.0F, 1, 1, 18, -0.3F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 100, 115, -5.1F, -41.1F, -57.0F, 1, 2, 1, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 265, 274, -1.1F, -44.0F, -56.998F, 1, 1, 18, 0.0F, false));
		mk48upperguard.cubeList.add(new ModelBox(mk48upperguard, 272, 167, -2.9F, -44.0F, -56.998F, 1, 1, 18, 0.0F, false));

		Main11_r1 = new ModelRenderer(this);
		Main11_r1.setRotationPoint(-5.1F, -41.1F, -57.0F);
		mk48upperguard.addChild(Main11_r1);
		setRotationAngle(Main11_r1, 0.0F, 0.0F, 0.5585F);
		Main11_r1.cubeList.add(new ModelBox(Main11_r1, 34, 69, 0.0F, -3.0F, 0.001F, 1, 3, 2, 0.0F, false));

		Main13_r1 = new ModelRenderer(this);
		Main13_r1.setRotationPoint(-5.1F, -41.1F, -57.0F);
		mk48upperguard.addChild(Main13_r1);
		setRotationAngle(Main13_r1, 0.0F, 0.0F, 0.5585F);
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 27, 167, -0.201F, -3.2F, 1.001F, 1, 1, 16, -0.2F, false));
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 165, 64, -0.201F, -0.8F, 1.001F, 1, 1, 16, -0.2F, false));
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 27, 55, 0.0F, -3.0F, 16.001F, 1, 3, 2, 0.0F, false));
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 110, 98, 0.0F, -3.0F, 13.001F, 1, 3, 1, 0.0F, false));
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 110, 10, 0.0F, -3.0F, 7.001F, 1, 3, 1, 0.0F, false));
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 110, 14, 0.0F, -3.0F, 10.001F, 1, 3, 1, 0.0F, false));
		Main13_r1.cubeList.add(new ModelBox(Main13_r1, 110, 4, 0.0F, -3.0F, 4.001F, 1, 3, 1, 0.0F, false));

		Main12_r1 = new ModelRenderer(this);
		Main12_r1.setRotationPoint(2.1F, -41.1F, -57.0F);
		mk48upperguard.addChild(Main12_r1);
		setRotationAngle(Main12_r1, 0.0F, 0.0F, -0.5585F);
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 169, 133, -0.799F, -3.2F, 1.001F, 1, 1, 16, -0.2F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 169, 160, -0.799F, -0.8F, 1.001F, 1, 1, 16, -0.2F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 0, 69, -1.0F, -3.0F, 16.001F, 1, 3, 2, 0.0F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 110, 106, -1.0F, -3.0F, 13.001F, 1, 3, 1, 0.0F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 94, 111, -1.0F, -3.0F, 7.001F, 1, 3, 1, 0.0F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 110, 102, -1.0F, -3.0F, 10.001F, 1, 3, 1, 0.0F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 23, 112, -1.0F, -3.0F, 4.001F, 1, 3, 1, 0.0F, false));
		Main12_r1.cubeList.add(new ModelBox(Main12_r1, 43, 69, -1.0F, -3.0F, 0.001F, 1, 3, 2, 0.0F, false));

		lowerhandguard = new QRenderer(this);
		lowerhandguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Handguard20 = new ModelRenderer(this);
		Handguard20.setRotationPoint(-3.0F, -25.5F, 20.0F);
		lowerhandguard.addChild(Handguard20);
		Handguard20.cubeList.add(new ModelBox(Handguard20, 96, 178, -2.0F, -9.6F, -69.0F, 7, 1, 12, 0.0F, false));

		Handguard19 = new ModelRenderer(this);
		Handguard19.setRotationPoint(-3.0F, -24.0F, 20.5F);
		lowerhandguard.addChild(Handguard19);
		Handguard19.cubeList.add(new ModelBox(Handguard19, 143, 44, -2.0F, -9.6F, -69.0F, 7, 1, 17, 0.0F, false));

		Handguard18 = new ModelRenderer(this);
		Handguard18.setRotationPoint(-3.0F, -22.5F, 20.5F);
		lowerhandguard.addChild(Handguard18);
		Handguard18.cubeList.add(new ModelBox(Handguard18, 65, 178, -2.0F, -9.6F, -69.0F, 7, 1, 17, 0.0F, false));

		Handguard17 = new ModelRenderer(this);
		Handguard17.setRotationPoint(-2.8F, -20.8F, 35.0F);
		lowerhandguard.addChild(Handguard17);
		Handguard17.cubeList.add(new ModelBox(Handguard17, 35, 29, -2.0F, -9.6F, -69.0F, 6, 1, 3, 0.0F, false));

		Handguard16 = new ModelRenderer(this);
		Handguard16.setRotationPoint(2.8F, -20.8F, 35.0F);
		lowerhandguard.addChild(Handguard16);
		Handguard16.cubeList.add(new ModelBox(Handguard16, 0, 105, -2.0F, -9.6F, -69.0F, 1, 1, 3, 0.0F, false));

		Handguard15 = new ModelRenderer(this);
		Handguard15.setRotationPoint(-3.0F, -27.0F, 33.0F);
		lowerhandguard.addChild(Handguard15);
		setRotationAngle(Handguard15, -1.5615F, 0.0F, 0.0F);
		Handguard15.cubeList.add(new ModelBox(Handguard15, 114, 64, -1.999F, 68.9078F, -10.2409F, 7, 3, 1, 0.0F, false));

		Handguard14 = new ModelRenderer(this);
		Handguard14.setRotationPoint(-3.0F, -27.0F, 33.0F);
		lowerhandguard.addChild(Handguard14);
		setRotationAngle(Handguard14, -1.1897F, 0.0F, 0.0F);
		Handguard14.cubeList.add(new ModelBox(Handguard14, 50, 29, -2.0F, 60.4797F, -34.5741F, 7, 1, 2, 0.0F, false));

		Handguard13 = new ModelRenderer(this);
		Handguard13.setRotationPoint(-3.0F, -24.8F, 38.0F);
		lowerhandguard.addChild(Handguard13);
		setRotationAngle(Handguard13, -1.7846F, 0.0F, 0.0F);
		Handguard13.cubeList.add(new ModelBox(Handguard13, 90, 0, -1.999F, 69.466F, 5.257F, 7, 5, 1, 0.0F, false));

		Handguard12 = new ModelRenderer(this);
		Handguard12.setRotationPoint(-3.3F, -25.0F, 19.7F);
		lowerhandguard.addChild(Handguard12);
		setRotationAngle(Handguard12, -1.6359F, 0.0F, 0.0F);
		Handguard12.cubeList.add(new ModelBox(Handguard12, 64, 0, -2.001F, 69.4782F, -5.0935F, 1, 7, 1, 0.0F, false));

		Handguard10 = new ModelRenderer(this);
		Handguard10.setRotationPoint(-3.3F, -24.4F, 18.7F);
		lowerhandguard.addChild(Handguard10);
		Handguard10.cubeList.add(new ModelBox(Handguard10, 117, 85, -2.0F, -9.601F, -68.999F, 7, 4, 1, 0.0F, false));

		Handguard11 = new ModelRenderer(this);
		Handguard11.setRotationPoint(3.3F, -25.0F, 19.7F);
		lowerhandguard.addChild(Handguard11);
		setRotationAngle(Handguard11, -1.6359F, 0.0F, 0.0F);
		Handguard11.cubeList.add(new ModelBox(Handguard11, 93, 76, -1.999F, 69.4782F, -5.0935F, 1, 7, 1, 0.0F, false));

		Handguard9 = new ModelRenderer(this);
		Handguard9.setRotationPoint(3.3F, -24.4F, 18.7F);
		lowerhandguard.addChild(Handguard9);
		Handguard9.cubeList.add(new ModelBox(Handguard9, 20, 55, -2.0F, -9.6F, -69.0F, 1, 4, 1, 0.0F, false));

		Handguard8 = new ModelRenderer(this);
		Handguard8.setRotationPoint(-3.2F, -20.5F, 19.0F);
		lowerhandguard.addChild(Handguard8);
		setRotationAngle(Handguard8, 1.5359F, 0.0F, 0.0F);
		Handguard8.cubeList.add(new ModelBox(Handguard8, 71, 98, -2.0F, -69.194F, 7.1871F, 7, 19, 1, 0.0F, false));

		Handguard7 = new ModelRenderer(this);
		Handguard7.setRotationPoint(3.2F, -20.5F, 19.0F);
		lowerhandguard.addChild(Handguard7);
		setRotationAngle(Handguard7, 1.5359F, 0.0F, 0.0F);
		Handguard7.cubeList.add(new ModelBox(Handguard7, 63, 34, -2.0F, -69.193F, 7.1861F, 1, 19, 1, 0.0F, false));

		Handguard4 = new ModelRenderer(this);
		Handguard4.setRotationPoint(-2.8F, -24.8F, 19.0F);
		lowerhandguard.addChild(Handguard4);
		Handguard4.cubeList.add(new ModelBox(Handguard4, 207, 154, -2.0F, -9.6F, -68.999F, 6, 4, 19, 0.0F, false));

		Handguard3 = new ModelRenderer(this);
		Handguard3.setRotationPoint(2.8F, -24.8F, 19.0F);
		lowerhandguard.addChild(Handguard3);
		Handguard3.cubeList.add(new ModelBox(Handguard3, 29, 103, -2.0F, -9.6F, -69.0F, 1, 4, 19, 0.0F, false));

		Handguard2 = new ModelRenderer(this);
		Handguard2.setRotationPoint(2.8F, -26.8F, 13.0F);
		lowerhandguard.addChild(Handguard2);
		Handguard2.cubeList.add(new ModelBox(Handguard2, 228, 65, -2.0F, -9.6F, -69.0F, 1, 2, 20, 0.0F, false));

		Handguard1 = new ModelRenderer(this);
		Handguard1.setRotationPoint(-2.8F, -26.8F, 13.0F);
		lowerhandguard.addChild(Handguard1);
		Handguard1.cubeList.add(new ModelBox(Handguard1, 228, 91, -2.0F, -9.6F, -69.0F, 1, 2, 20, 0.0F, false));

		mk48lowerguard = new QRenderer(this);
		mk48lowerguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 110, 0, 1.351F, -36.4F, -48.999F, 1, 3, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 78, 34, -5.351F, -36.4F, -48.999F, 1, 3, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 103, 78, 1.351F, -36.4F, -31.999F, 1, 3, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 22, 10, -5.351F, -36.4F, -31.999F, 1, 3, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 44, 103, 1.351F, -35.4F, -34.749F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 5, 0, -5.351F, -35.4F, -34.749F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 64, 96, 1.351F, -35.4F, -40.499F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 29, 23, -5.351F, -35.4F, -40.499F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 102, 20, 1.351F, -35.4F, -37.499F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 22, 16, -5.351F, -35.4F, -37.499F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 102, 16, 1.351F, -35.4F, -43.249F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 29, 0, -5.351F, -35.4F, -43.249F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 59, 34, 1.351F, -35.4F, -45.999F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 29, 16, -5.351F, -35.4F, -45.999F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 46, 0, 1.35F, -35.4F, -48.749F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 5, 34, -5.35F, -35.4F, -48.749F, 1, 2, 1, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 100, 98, 1.351F, -36.4F, -47.999F, 1, 1, 16, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 34, 69, -5.351F, -36.4F, -47.999F, 1, 1, 16, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 163, 92, 1.652F, -34.1F, -48.499F, 1, 1, 17, -0.3F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 103, 140, -5.652F, -34.1F, -48.499F, 1, 1, 17, -0.3F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 72, 269, -2.6F, -32.1F, -48.999F, 3, 1, 18, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 207, 214, -3.4F, -32.101F, -48.998F, 1, 1, 18, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 35, 0, -1.2F, -31.301F, -49.001F, 1, 1, 15, 0.0F, false));
		mk48lowerguard.cubeList.add(new ModelBox(mk48lowerguard, 185, 0, -2.8F, -31.3F, -49.0F, 2, 1, 15, 0.0F, false));

		Main15_r1 = new ModelRenderer(this);
		Main15_r1.setRotationPoint(-5.351F, -33.4F, -48.5F);
		mk48lowerguard.addChild(Main15_r1);
		setRotationAngle(Main15_r1, 0.0F, 0.0F, -0.6981F);
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 27, 140, -0.201F, 2.2F, 0.0F, 1, 1, 17, -0.2F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 65, 140, -0.201F, -0.2F, 0.0F, 1, 1, 17, -0.2F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 78, 57, 0.001F, 0.0F, 16.5F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 28, 10, 0.0F, 0.0F, 16.0F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 41, 51, 0.0F, 0.0F, 10.5F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 20, 75, 0.0F, 0.0F, 5.0F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 35, 51, 0.0F, 0.0F, 13.25F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 64, 8, 0.0F, 0.0F, 7.75F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 27, 75, 0.0F, 0.0F, 2.25F, 1, 3, 1, 0.0F, false));
		Main15_r1.cubeList.add(new ModelBox(Main15_r1, 78, 29, 0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		Main14_r1 = new ModelRenderer(this);
		Main14_r1.setRotationPoint(2.351F, -33.4F, -48.5F);
		mk48lowerguard.addChild(Main14_r1);
		setRotationAngle(Main14_r1, 0.0F, 0.0F, 0.6981F);
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 65, 158, -0.799F, 2.2F, 0.0F, 1, 1, 17, -0.2F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 103, 158, -0.799F, -0.2F, 0.0F, 1, 1, 17, -0.2F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 84, 29, -1.001F, 0.0F, 16.5F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 34, 86, -1.0F, 0.0F, 16.0F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 71, 86, -1.0F, 0.0F, 10.5F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 77, 86, -1.0F, 0.0F, 5.0F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 84, 34, -1.0F, 0.0F, 13.25F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 40, 86, -1.0F, 0.0F, 7.75F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 65, 102, -1.0F, 0.0F, 2.25F, 1, 3, 1, 0.0F, false));
		Main14_r1.cubeList.add(new ModelBox(Main14_r1, 6, 109, -1.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F, false));

		action = new QRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, -3.0F);
		

		Action9 = new ModelRenderer(this);
		Action9.setRotationPoint(-3.5F, -29.8F, 56.5F);
		action.addChild(Action9);
		setRotationAngle(Action9, 0.0F, 0.0F, -0.7854F);
		Action9.cubeList.add(new ModelBox(Action9, 43, 74, 5.5861F, -8.4156F, -69.999F, 2, 1, 1, 0.0F, false));

		Action8 = new ModelRenderer(this);
		Action8.setRotationPoint(-3.5F, -29.8F, 56.0F);
		action.addChild(Action8);
		setRotationAngle(Action8, 0.0F, 0.0F, -0.7854F);
		Action8.cubeList.add(new ModelBox(Action8, 34, 82, 5.5861F, -8.4146F, -70.0F, 2, 1, 1, 0.0F, false));

		Action7 = new ModelRenderer(this);
		Action7.setRotationPoint(-3.5F, -29.8F, 56.0F);
		action.addChild(Action7);
		Action7.cubeList.add(new ModelBox(Action7, 21, 116, -2.001F, -9.9F, -69.999F, 1, 2, 1, 0.0F, false));
		Action7.cubeList.add(new ModelBox(Action7, 0, 61, -0.601F, -11.3F, -69.999F, 2, 1, 1, 0.0F, false));

		Action6 = new ModelRenderer(this);
		Action6.setRotationPoint(-3.5F, -29.8F, 56.5F);
		action.addChild(Action6);
		Action6.cubeList.add(new ModelBox(Action6, 44, 116, -2.002F, -9.9F, -69.998F, 1, 2, 1, 0.0F, false));
		Action6.cubeList.add(new ModelBox(Action6, 34, 74, -0.6F, -11.301F, -70.0F, 2, 1, 1, 0.0F, false));

		Action5 = new ModelRenderer(this);
		Action5.setRotationPoint(-3.5F, -28.2F, 49.5F);
		action.addChild(Action5);
		Action5.cubeList.add(new ModelBox(Action5, 34, 69, -2.001F, -9.6F, -68.999F, 1, 1, 7, 0.0F, false));

		Action4 = new ModelRenderer(this);
		Action4.setRotationPoint(-3.5F, -28.8F, 49.5F);
		action.addChild(Action4);
		Action4.cubeList.add(new ModelBox(Action4, 52, 69, -2.0F, -9.6F, -69.0F, 1, 1, 7, 0.0F, false));

		Action3 = new ModelRenderer(this);
		Action3.setRotationPoint(-3.6F, -29.0F, 44.5F);
		action.addChild(Action3);
		setRotationAngle(Action3, 0.0F, -0.2603F, 0.0F);
		Action3.cubeList.add(new ModelBox(Action3, 61, 77, -19.6879F, -9.601F, -66.1618F, 1, 2, 3, 0.0F, false));

		Action2 = new ModelRenderer(this);
		Action2.setRotationPoint(-6.6F, -29.0F, 47.0F);
		action.addChild(Action2);
		Action2.cubeList.add(new ModelBox(Action2, 71, 91, -2.0F, -9.6F, -69.0F, 3, 2, 2, 0.0F, false));

		Action1 = new ModelRenderer(this);
		Action1.setRotationPoint(-3.6F, -29.0F, 44.5F);
		action.addChild(Action1);
		Action1.cubeList.add(new ModelBox(Action1, 20, 55, -2.0F, -9.6F, -69.0F, 1, 2, 5, 0.0F, false));

		mag = new QRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Mag5 = new ModelRenderer(this);
		Mag5.setRotationPoint(12.0F, -22.5F, 42.0F);
		mag.addChild(Mag5);
		Mag5.cubeList.add(new ModelBox(Mag5, 0, 0, -2.0F, -9.6F, -69.0F, 1, 19, 10, 0.0F, false));

		Mag4 = new ModelRenderer(this);
		Mag4.setRotationPoint(-4.0F, -22.0F, 42.5F);
		mag.addChild(Mag4);
		setRotationAngle(Mag4, 0.0F, 0.0F, 0.7854F);
		Mag4.cubeList.add(new ModelBox(Mag4, 35, 34, -8.2024F, -5.374F, -68.999F, 5, 8, 9, 0.0F, false));

		Mag3 = new ModelRenderer(this);
		Mag3.setRotationPoint(-9.7F, -16.0F, 42.5F);
		mag.addChild(Mag3);
		Mag3.cubeList.add(new ModelBox(Mag3, 0, 34, -2.0F, -9.6F, -69.001F, 6, 12, 9, 0.0F, false));

		Mag2 = new ModelRenderer(this);
		Mag2.setRotationPoint(-3.0F, -22.5F, 43.5F);
		mag.addChild(Mag2);
		Mag2.cubeList.add(new ModelBox(Mag2, 0, 194, -2.0F, -9.6F, -69.0F, 12, 1, 7, 0.0F, false));

		Mag1 = new ModelRenderer(this);
		Mag1.setRotationPoint(-4.0F, -22.0F, 42.5F);
		mag.addChild(Mag1);
		Mag1.cubeList.add(new ModelBox(Mag1, 0, 204, -2.0F, -9.6F, -69.0F, 16, 18, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		ironsight.render(f5);
//		belt.render(f5);
//		hatch.render(f5);
		stock.render(f5);
//		mk48para_stock.render(f5);
//		stockadapter.render(f5);
//		upperhandguard.render(f5);
//		mk48upperguard.render(f5);
//		lowerhandguard.render(f5);
//		mk48lowerguard.render(f5);
//		action.render(f5);
//		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
