package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class PGMHecateIIBoltAction1 extends ModelBase {
	private final ModelRenderer grip;
	private final ModelRenderer grip12;
	private final ModelRenderer grip11;
	private final ModelRenderer grip8;
	private final ModelRenderer grip5;
	private final ModelRenderer bone84;
	private final ModelRenderer grip4;
	private final ModelRenderer grip3;
	private final ModelRenderer grip2;
	private final ModelRenderer grip1;
	private final ModelRenderer handle_arm;
	private final ModelRenderer bone46;
	private final ModelRenderer bone87;
	private final ModelRenderer bone86;
	private final ModelRenderer chassis;
	private final ModelRenderer bone48;
	private final ModelRenderer bone4;
	private final ModelRenderer bone3;
	private final ModelRenderer bone92;
	private final ModelRenderer bone91;
	private final ModelRenderer bone45;
	private final ModelRenderer bone44;
	private final ModelRenderer bone43;
	private final ModelRenderer bone112;
	private final ModelRenderer bone111;
	private final ModelRenderer bone115;
	private final ModelRenderer bone114;
	private final ModelRenderer bone110;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone106;
	private final ModelRenderer bone88;
	private final ModelRenderer bone105;
	private final ModelRenderer bone117;
	private final ModelRenderer bone116;
	private final ModelRenderer bone113;
	private final ModelRenderer bone90;
	private final ModelRenderer bone89;
	private final ModelRenderer bone83;
	private final ModelRenderer bone82;
	private final ModelRenderer bone31;
	private final ModelRenderer bone81;
	private final ModelRenderer bone49;
	private final ModelRenderer bone166;
	private final ModelRenderer bone167;
	private final ModelRenderer bone85;
	private final ModelRenderer bone164;
	private final ModelRenderer bone165;
	private final ModelRenderer barrel;
	private final ModelRenderer barrel_thick;
	private final ModelRenderer bone127;
	private final ModelRenderer bone128;
	private final ModelRenderer bone129;
	private final ModelRenderer bone121;
	private final ModelRenderer bone122;
	private final ModelRenderer bone123;
	private final ModelRenderer bone118;
	private final ModelRenderer bone119;
	private final ModelRenderer bone120;
	private final ModelRenderer bone124;
	private final ModelRenderer bone125;
	private final ModelRenderer bone126;
	private final ModelRenderer barrel_thick2;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer bone69;
	private final ModelRenderer bone156;
	private final ModelRenderer bone157;
	private final ModelRenderer bone158;
	private final ModelRenderer bone159;
	private final ModelRenderer bone160;
	private final ModelRenderer bone161;
	private final ModelRenderer barrel_taper1;
	private final ModelRenderer bone136;
	private final ModelRenderer bone135;
	private final ModelRenderer bone134;
	private final ModelRenderer bone143;
	private final ModelRenderer bone144;
	private final ModelRenderer bone145;
	private final ModelRenderer bone137;
	private final ModelRenderer bone138;
	private final ModelRenderer bone139;
	private final ModelRenderer bone140;
	private final ModelRenderer bone141;
	private final ModelRenderer bone142;
	private final ModelRenderer barrel_long;
	private final ModelRenderer bone146;
	private final ModelRenderer muzzle;
	private final ModelRenderer bone162;
	private final ModelRenderer bone163;
	private final ModelRenderer bone50;
	private final ModelRenderer bone62;
	private final ModelRenderer bone60;
	private final ModelRenderer bone51;
	private final ModelRenderer bone59;
	private final ModelRenderer bone61;
	private final ModelRenderer magazine;
	private final ModelRenderer bone7;
	private final ModelRenderer bone132;
	private final ModelRenderer bone133;
	private final ModelRenderer bone9;
	private final ModelRenderer bone8;
	private final ModelRenderer bone130;
	private final ModelRenderer bone10;
	private final ModelRenderer bone131;
	private final ModelRenderer bone6;
	private final ModelRenderer stock;
	private final ModelRenderer stock_metal;
	private final ModelRenderer bone5;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone11;
	private final ModelRenderer stock_wood;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone14;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone30;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer stock_design;
	private final ModelRenderer bone71;
	private final ModelRenderer bone57;
	private final ModelRenderer bone70;
	private final ModelRenderer bone72;
	private final ModelRenderer bone73;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;
	private final ModelRenderer bone77;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer bone80;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer stock_butt;
	private final ModelRenderer bone42;
	private final ModelRenderer bone47;
	private final ModelRenderer bone55;
	private final ModelRenderer bone56;
	private final ModelRenderer bone52;
	private final ModelRenderer bone53;
	private final ModelRenderer bone54;
	private final ModelRenderer grab_thingy;
	private final ModelRenderer bone58;
	private final ModelRenderer bone68;
	private final ModelRenderer slide;
	private final ModelRenderer bone96;
	private final ModelRenderer bone95;
	private final ModelRenderer bone93;
	private final ModelRenderer bone102;
	private final ModelRenderer bone103;
	private final ModelRenderer bone104;
	private final ModelRenderer bone94;
	private final ModelRenderer bone97;
	private final ModelRenderer bone98;
	private final ModelRenderer bone99;
	private final ModelRenderer bone100;
	private final ModelRenderer bone101;
	private final ModelRenderer bone108;
	private final ModelRenderer bone109;
	private final ModelRenderer bone107;
	private final ModelRenderer carry_handle;
	private final ModelRenderer bone147;
	private final ModelRenderer bone154;
	private final ModelRenderer bone152;
	private final ModelRenderer bone153;
	private final ModelRenderer bone155;
	private final ModelRenderer bone148;
	private final ModelRenderer bone151;
	private final ModelRenderer bone149;
	private final ModelRenderer bone150;

	public PGMHecateIIBoltAction1() {
		textureWidth = 360;
		textureHeight = 360;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		grip12 = new ModelRenderer(this);
		grip12.setRotationPoint(-3.5F, -18.5F, -4.2F);
		grip.addChild(grip12);
		setRotationAngle(grip12, 0.9295F, 0.0F, 0.0F);
		grip12.cubeList.add(new ModelBox(grip12, 28, 9, 0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		grip11 = new ModelRenderer(this);
		grip11.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(grip11);
		setRotationAngle(grip11, 0.2603F, 0.0F, 0.0F);
		grip11.cubeList.add(new ModelBox(grip11, 66, 52, 0.0F, 9.0F, -1.0F, 4, 1, 1, 0.0F, false));

		grip8 = new ModelRenderer(this);
		grip8.setRotationPoint(-3.5F, -27.5F, -7.0F);
		grip.addChild(grip8);
		setRotationAngle(grip8, 1.041F, 0.0F, 0.0F);
		grip8.cubeList.add(new ModelBox(grip8, 34, 50, 0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, false));

		grip5 = new ModelRenderer(this);
		grip5.setRotationPoint(-3.5F, -31.5F, -1.5F);
		grip.addChild(grip5);
		grip5.cubeList.add(new ModelBox(grip5, 24, 50, 0.0F, 1.0F, 0.0F, 4, 3, 1, 0.0F, false));
		grip5.cubeList.add(new ModelBox(grip5, 56, 151, 0.0F, -1.0F, -5.5F, 4, 2, 9, 0.0F, false));

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(2.0F, 0.0F, 1.5F);
		grip5.addChild(bone84);
		setRotationAngle(bone84, 0.2182F, 0.0F, 0.0F);
		bone84.cubeList.add(new ModelBox(bone84, 80, 8, -2.0F, -0.5908F, -1.2638F, 4, 2, 3, 0.0F, false));

		grip4 = new ModelRenderer(this);
		grip4.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip.addChild(grip4);
		setRotationAngle(grip4, -2.6769F, 0.0F, 0.0F);
		grip4.cubeList.add(new ModelBox(grip4, 11, 91, 0.0F, 0.0F, 0.0F, 4, 5, 1, 0.0F, false));

		grip3 = new ModelRenderer(this);
		grip3.setRotationPoint(-3.5F, -24.2F, 1.5F);
		grip.addChild(grip3);
		setRotationAngle(grip3, -1.3384F, 0.0F, 0.0F);
		grip3.cubeList.add(new ModelBox(grip3, 80, 41, 0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		grip2 = new ModelRenderer(this);
		grip2.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(grip2);
		setRotationAngle(grip2, 0.2603F, 0.0F, 0.0F);
		grip2.cubeList.add(new ModelBox(grip2, 0, 55, 0.001F, 0.0F, 0.0F, 4, 10, 5, 0.0F, false));

		grip1 = new ModelRenderer(this);
		grip1.setRotationPoint(-3.5F, -31.5F, -7.0F);
		grip.addChild(grip1);
		grip1.cubeList.add(new ModelBox(grip1, 26, 69, 0.0F, 1.0F, 0.0F, 4, 3, 6, 0.0F, false));

		handle_arm = new ModelRenderer(this);
		handle_arm.setRotationPoint(0.0F, 24.0F, 0.0F);
		handle_arm.cubeList.add(new ModelBox(handle_arm, 82, 56, -3.5F, -34.5F, -7.0F, 1, 2, 12, 0.0F, false));
		handle_arm.cubeList.add(new ModelBox(handle_arm, 28, 0, -0.5F, -34.5F, -7.0F, 1, 2, 12, 0.0F, false));
		handle_arm.cubeList.add(new ModelBox(handle_arm, 95, 81, -2.5F, -34.5F, -7.0F, 2, 2, 5, 0.0F, false));
		handle_arm.cubeList.add(new ModelBox(handle_arm, 94, 72, -2.5F, -34.5F, -1.0F, 2, 2, 6, 0.0F, false));
		handle_arm.cubeList.add(new ModelBox(handle_arm, 49, 41, -3.0F, -34.501F, -2.0F, 1, 2, 1, 0.0F, false));
		handle_arm.cubeList.add(new ModelBox(handle_arm, 20, 25, -1.0F, -34.501F, -2.0F, 1, 2, 1, 0.0F, false));
		handle_arm.cubeList.add(new ModelBox(handle_arm, 0, 58, -2.0F, -34.251F, -2.0F, 1, 1, 1, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-3.5F, -33.0F, -0.7F);
		handle_arm.addChild(bone46);
		setRotationAngle(bone46, -0.5934F, 0.0F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 32, 55, -1.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(1.25F, -34.5F, -7.0F);
		handle_arm.addChild(bone87);
		setRotationAngle(bone87, 0.0F, -0.7679F, 0.0F);
		bone87.cubeList.add(new ModelBox(bone87, 18, 65, -0.9281F, -0.002F, -0.0695F, 1, 2, 2, 0.0F, false));

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(-4.25F, -34.5F, -7.0F);
		handle_arm.addChild(bone86);
		setRotationAngle(bone86, 0.0F, 0.7679F, 0.0F);
		bone86.cubeList.add(new ModelBox(bone86, 18, 69, -0.0719F, -0.002F, -0.0695F, 1, 2, 2, 0.0F, false));

		chassis = new ModelRenderer(this);
		chassis.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(0.0F, 0.0F, 0.0F);
		chassis.addChild(bone48);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.25F, -37.0F, -33.0F);
		bone48.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.6981F);
		bone4.cubeList.add(new ModelBox(bone4, 26, 26, 0.6003F, -1.9626F, -14.001F, 1, 2, 13, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.75F, -37.0F, -47.0F);
		bone48.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.8727F);
		bone3.cubeList.add(new ModelBox(bone3, 56, 166, -0.0374F, -1.6003F, -0.01F, 2, 2, 13, 0.0F, false));

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(2.2001F, -36.25F, -7.501F);
		bone48.addChild(bone92);
		setRotationAngle(bone92, 0.0F, -1.3265F, 0.0F);
		bone92.cubeList.add(new ModelBox(bone92, 48, 82, -1.121F, -1.002F, 0.4851F, 1, 1, 1, 0.0F, false));

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(1.6992F, -36.25F, -8.5017F);
		bone48.addChild(bone91);
		setRotationAngle(bone91, 0.0F, -1.2566F, 0.0F);
		bone91.cubeList.add(new ModelBox(bone91, 0, 30, -2.0F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-0.5F, -35.25F, -7.0F);
		bone48.addChild(bone45);
		setRotationAngle(bone45, 0.0F, -0.9076F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 82, 52, -1.0925F, -0.001F, -0.8818F, 1, 1, 1, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-2.5F, -35.25F, -7.0F);
		bone48.addChild(bone44);
		setRotationAngle(bone44, 0.0F, 0.9076F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 82, 56, 0.0921F, -0.001F, -0.8818F, 1, 1, 1, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-3.5F, -35.25F, -8.0F);
		bone48.addChild(bone43);
		setRotationAngle(bone43, 1.1519F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 0, 43, -0.851F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(-2.45F, -39.5321F, -37.0F);
		bone48.addChild(bone112);
		setRotationAngle(bone112, -0.5236F, 0.0F, 0.0F);
		bone112.cubeList.add(new ModelBox(bone112, 102, 41, -0.05F, -1.4879F, 2.5981F, 2, 1, 2, 0.0F, false));

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(-2.7F, -39.5321F, -37.0F);
		bone48.addChild(bone111);
		setRotationAngle(bone111, -0.5236F, 0.1745F, 0.0F);
		bone111.cubeList.add(new ModelBox(bone111, 48, 79, -0.5209F, -1.4772F, 2.5586F, 1, 1, 2, 0.0F, false));

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(-2.7F, -39.5321F, -37.0F);
		bone48.addChild(bone115);
		setRotationAngle(bone115, -0.4014F, 0.3665F, 0.4538F);
		bone115.cubeList.add(new ModelBox(bone115, 9, 82, -1.0751F, -1.0943F, 2.5781F, 1, 1, 1, 0.0F, false));

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(-0.3F, -39.5321F, -37.0F);
		bone48.addChild(bone114);
		setRotationAngle(bone114, -0.4014F, -0.3665F, -0.4538F);
		bone114.cubeList.add(new ModelBox(bone114, 48, 62, 0.0751F, -1.0943F, 2.5781F, 1, 2, 2, 0.0F, false));

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(-0.3F, -39.5321F, -37.0F);
		bone48.addChild(bone110);
		setRotationAngle(bone110, -0.5236F, -0.1745F, 0.0F);
		bone110.cubeList.add(new ModelBox(bone110, 0, 80, -0.4791F, -1.4772F, 2.5586F, 1, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.5F, -38.8F, -37.75F);
		bone48.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.8796F);
		bone2.cubeList.add(new ModelBox(bone2, 41, 41, -2.0F, 0.0F, 19.75F, 2, 1, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 36, 103, -2.35F, -0.001F, 19.749F, 1, 1, 4, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, -38.8F, -37.75F);
		bone48.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, 0.8796F);
		bone.cubeList.add(new ModelBox(bone, 66, 221, 0.0F, 0.0F, 0.0F, 2, 1, 30, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 100, 222, 1.35F, -0.001F, 0.001F, 1, 1, 30, 0.0F, false));

		bone106 = new ModelRenderer(this);
		bone106.setRotationPoint(0.0F, -37.0F, -11.75F);
		bone48.addChild(bone106);
		setRotationAngle(bone106, 0.0F, 0.0F, 0.4538F);
		bone106.cubeList.add(new ModelBox(bone106, 67, 0, 0.0F, 0.0F, 0.002F, 1, 3, 4, 0.0F, false));

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(-4.0F, -37.0F, -10.751F);
		bone48.addChild(bone88);
		setRotationAngle(bone88, 0.0F, 0.0F, -0.4014F);
		bone88.cubeList.add(new ModelBox(bone88, 30, 102, 0.0F, 0.0F, -1.0F, 1, 1, 4, 0.0F, false));

		bone105 = new ModelRenderer(this);
		bone105.setRotationPoint(-3.0F, -37.0F, -11.75F);
		bone48.addChild(bone105);
		setRotationAngle(bone105, 0.0F, 0.0F, -0.4538F);
		bone105.cubeList.add(new ModelBox(bone105, 67, 10, -1.0F, 0.0F, 0.001F, 1, 3, 4, 0.0F, false));

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(1.0F, -38.0F, -37.0F);
		bone48.addChild(bone117);
		setRotationAngle(bone117, -0.6632F, 0.2793F, 0.3491F);
		bone117.cubeList.add(new ModelBox(bone117, 102, 21, -2.8169F, -1.7754F, 2.2725F, 2, 1, 2, 0.0F, false));

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(1.0F, -38.0F, -37.0F);
		bone48.addChild(bone116);
		setRotationAngle(bone116, -0.7156F, 0.0F, 0.0F);
		bone116.cubeList.add(new ModelBox(bone116, 48, 75, -0.9995F, -1.9682F, 2.2641F, 1, 1, 2, 0.0F, false));

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(1.0F, -38.0F, -37.0F);
		bone48.addChild(bone113);
		setRotationAngle(bone113, -0.7156F, 0.0F, 0.8552F);
		bone113.cubeList.add(new ModelBox(bone113, 17, 15, -2.0F, -1.9682F, 2.2641F, 2, 1, 1, 0.0F, false));

		bone90 = new ModelRenderer(this);
		bone90.setRotationPoint(-4.351F, -36.0F, -57.5F);
		bone48.addChild(bone90);
		setRotationAngle(bone90, 0.0F, 0.0F, -0.6109F);
		bone90.cubeList.add(new ModelBox(bone90, 217, 0, 0.0F, -0.01F, 3.499F, 1, 1, 39, 0.0F, false));

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(1.351F, -36.0F, -58.0F);
		bone48.addChild(bone89);
		setRotationAngle(bone89, 0.0F, 0.0F, 0.6109F);
		bone89.cubeList.add(new ModelBox(bone89, 168, 110, -1.0F, 0.0F, 3.999F, 1, 1, 46, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(-1.5F, -28.25F, -12.5F);
		bone48.addChild(bone83);
		setRotationAngle(bone83, -0.7854F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 56, 52, -2.0F, -0.2929F, -1.0607F, 4, 1, 1, 0.0F, false));
		bone83.cubeList.add(new ModelBox(bone83, 56, 46, -2.0F, -3.8284F, 2.4749F, 4, 1, 1, 0.0F, false));

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(-1.5F, -31.25F, -9.75F);
		bone48.addChild(bone82);
		setRotationAngle(bone82, -0.2182F, 0.0F, 0.0F);
		

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone82.addChild(bone31);
		setRotationAngle(bone31, 0.3927F, 0.0F, 0.0F);
		bone31.cubeList.add(new ModelBox(bone31, 26, 41, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(0.0F, -0.25F, 0.25F);
		bone82.addChild(bone81);
		setRotationAngle(bone81, -0.3927F, 0.0F, 0.0F);
		bone81.cubeList.add(new ModelBox(bone81, 82, 58, -0.5F, 1.0337F, 0.2789F, 1, 1, 1, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(0.0F, 0.0F, 0.0F);
		chassis.addChild(bone49);
		bone49.cubeList.add(new ModelBox(bone49, 79, 96, 0.2001F, -37.25F, -12.251F, 1, 1, 5, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 59, 82, 0.7001F, -37.25F, -8.501F, 1, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 13, 55, -0.6499F, -35.25F, -8.001F, 2, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 0, 20, -2.4501F, -34.65F, -8.0F, 2, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 80, 30, -4.3501F, -35.25F, -8.001F, 2, 1, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 25, 80, -2.7F, -39.53F, -47.001F, 1, 1, 13, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 16, 165, -2.3F, -39.5321F, -47.0F, 2, 1, 13, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 37, 221, -2.5F, -38.783F, -34.751F, 2, 1, 27, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 0, 80, -2.5F, -39.534F, -29.251F, 2, 1, 21, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 132, 222, 0.001F, -37.0F, -34.751F, 1, 2, 27, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 80, 18, -3.5F, -35.75F, -13.0F, 1, 1, 2, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 102, 44, -3.0F, -36.0F, -8.75F, 3, 2, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 67, 81, -4.0F, -37.0F, -11.75F, 1, 3, 4, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 112, 38, -4.0F, -38.0F, -47.0F, 5, 2, 13, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 67, 26, -4.0F, -37.0F, -18.0F, 1, 3, 4, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 112, 131, -4.0F, -36.75F, -34.0F, 1, 2, 16, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 26, 102, -4.001F, -34.8F, -14.0F, 1, 1, 3, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 183, 217, -4.352F, -36.0F, -54.0F, 5, 2, 39, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 168, 55, 0.351F, -36.0F, -54.0F, 1, 2, 46, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 28, 0, -4.0F, -33.0F, -32.5F, 1, 4, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 35, 0, 0.0F, -33.0F, -32.5F, 1, 4, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 26, 41, -3.999F, -32.0F, -37.5F, 5, 3, 5, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 137, 0, -4.0F, -32.75F, -41.5F, 5, 2, 9, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 14, 50, -3.499F, -31.5F, -14.0F, 4, 3, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 80, 15, -3.499F, -28.75F, -13.0F, 4, 1, 6, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 66, 103, -3.499F, -32.5F, -8.0F, 4, 4, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 17, 38, 0.0F, -33.0F, -18.0F, 1, 6, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 56, 36, -4.0F, -33.0F, -18.0F, 1, 6, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 41, 55, -4.0F, -33.0F, -17.0F, 5, 6, 1, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 168, 168, -3.65F, -34.5F, -54.0F, 5, 2, 47, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 16, 150, -4.0F, -32.5F, -17.0F, 5, 1, 10, 0.0F, false));
		bone49.cubeList.add(new ModelBox(bone49, 168, 0, -4.35F, -34.5F, -54.0F, 1, 2, 47, 0.0F, false));

		bone166 = new ModelRenderer(this);
		bone166.setRotationPoint(-0.3F, -38.85F, -29.25F);
		bone49.addChild(bone166);
		setRotationAngle(bone166, 0.0F, 0.0F, -1.0297F);
		bone166.cubeList.add(new ModelBox(bone166, 0, 110, -1.0F, -1.0F, 0.0F, 1, 1, 21, 0.0F, false));

		bone167 = new ModelRenderer(this);
		bone167.setRotationPoint(-2.7F, -38.85F, -29.25F);
		bone49.addChild(bone167);
		setRotationAngle(bone167, 0.0F, 0.0F, 1.0297F);
		bone167.cubeList.add(new ModelBox(bone167, 56, 81, 0.0F, -1.0F, 0.0F, 1, 1, 21, 0.0F, false));

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(-3.5F, -35.6F, -11.35F);
		bone49.addChild(bone85);
		setRotationAngle(bone85, 0.0F, -0.192F, 0.0F);
		bone85.cubeList.add(new ModelBox(bone85, 10, 70, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone164 = new ModelRenderer(this);
		bone164.setRotationPoint(1.0F, -31.0F, -16.0F);
		bone49.addChild(bone164);
		setRotationAngle(bone164, 0.0F, -0.2443F, 0.0F);
		bone164.cubeList.add(new ModelBox(bone164, 67, 89, -2.0F, -1.0F, 0.0F, 2, 3, 3, 0.0F, false));

		bone165 = new ModelRenderer(this);
		bone165.setRotationPoint(-4.0F, -31.0F, -16.0F);
		bone49.addChild(bone165);
		setRotationAngle(bone165, 0.0F, 0.2443F, 0.0F);
		bone165.cubeList.add(new ModelBox(bone165, 41, 33, 0.0F, -1.0F, 0.0F, 3, 3, 3, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-1.0F, 29.5F, -7.0F);
		

		barrel_thick = new ModelRenderer(this);
		barrel_thick.setRotationPoint(0.0F, 4.0F, 0.0F);
		barrel.addChild(barrel_thick);
		

		bone127 = new ModelRenderer(this);
		bone127.setRotationPoint(-0.5F, -44.0035F, -55.0F);
		barrel_thick.addChild(bone127);
		setRotationAngle(bone127, 0.0F, 0.0F, -3.1416F);
		

		bone128 = new ModelRenderer(this);
		bone128.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone127.addChild(bone128);
		setRotationAngle(bone128, 0.0F, 0.0F, -1.117F);
		bone128.cubeList.add(new ModelBox(bone128, 0, 149, -1.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone128.cubeList.add(new ModelBox(bone128, 136, 111, -1.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone129 = new ModelRenderer(this);
		bone129.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone127.addChild(bone129);
		setRotationAngle(bone129, 0.0F, 0.0F, 1.117F);
		bone129.cubeList.add(new ModelBox(bone129, 80, 0, 0.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone129.cubeList.add(new ModelBox(bone129, 134, 39, -0.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone121 = new ModelRenderer(this);
		bone121.setRotationPoint(2.0F, -46.5035F, -55.0F);
		barrel_thick.addChild(bone121);
		setRotationAngle(bone121, 0.0F, 0.0F, 1.5708F);
		

		bone122 = new ModelRenderer(this);
		bone122.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone121.addChild(bone122);
		setRotationAngle(bone122, 0.0F, 0.0F, -1.117F);
		bone122.cubeList.add(new ModelBox(bone122, 0, 165, -1.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone122.cubeList.add(new ModelBox(bone122, 79, 81, -0.95F, 0.0F, 9.75F, 1, 1, 1, 0.0F, false));
		bone122.cubeList.add(new ModelBox(bone122, 56, 81, -0.95F, 0.0F, 12.75F, 1, 1, 1, 0.0F, false));
		bone122.cubeList.add(new ModelBox(bone122, 128, 150, -1.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone123 = new ModelRenderer(this);
		bone123.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone121.addChild(bone123);
		setRotationAngle(bone123, 0.0F, 0.0F, 1.117F);
		bone123.cubeList.add(new ModelBox(bone123, 112, 149, 0.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone123.cubeList.add(new ModelBox(bone123, 73, 81, -0.0562F, -0.0265F, 9.75F, 1, 1, 1, 0.0F, false));
		bone123.cubeList.add(new ModelBox(bone123, 67, 81, -0.0562F, -0.0265F, 12.75F, 1, 1, 1, 0.0F, false));
		bone123.cubeList.add(new ModelBox(bone123, 20, 102, -0.0562F, 0.9035F, 9.75F, 1, 1, 4, 0.0F, false));
		bone123.cubeList.add(new ModelBox(bone123, 76, 149, -0.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(-0.5F, -49.0035F, -55.0F);
		barrel_thick.addChild(bone118);
		

		bone119 = new ModelRenderer(this);
		bone119.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone118.addChild(bone119);
		setRotationAngle(bone119, 0.0F, 0.0F, -1.117F);
		bone119.cubeList.add(new ModelBox(bone119, 74, 134, -1.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone119.cubeList.add(new ModelBox(bone119, 10, 102, -0.95F, 0.0F, 9.75F, 1, 1, 4, 0.0F, false));
		bone119.cubeList.add(new ModelBox(bone119, 66, 97, -0.95F, 0.9035F, 9.75F, 1, 1, 4, 0.0F, false));
		bone119.cubeList.add(new ModelBox(bone119, 128, 94, -1.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone120 = new ModelRenderer(this);
		bone120.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone118.addChild(bone120);
		setRotationAngle(bone120, 0.0F, 0.0F, 1.117F);
		bone120.cubeList.add(new ModelBox(bone120, 26, 55, 0.0F, 0.0F, 4.75F, 1, 1, 13, 0.0F, false));
		bone120.cubeList.add(new ModelBox(bone120, 0, 102, -0.0562F, -0.0265F, 9.75F, 1, 1, 4, 0.0F, false));
		bone120.cubeList.add(new ModelBox(bone120, 98, 48, -0.0562F, 0.9035F, 9.75F, 1, 1, 4, 0.0F, false));
		bone120.cubeList.add(new ModelBox(bone120, 112, 93, -0.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone124 = new ModelRenderer(this);
		bone124.setRotationPoint(-3.0F, -46.5035F, -55.0F);
		barrel_thick.addChild(bone124);
		setRotationAngle(bone124, 0.0F, 0.0F, -1.5708F);
		

		bone125 = new ModelRenderer(this);
		bone125.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone124.addChild(bone125);
		setRotationAngle(bone125, 0.0F, 0.0F, -1.117F);
		bone125.cubeList.add(new ModelBox(bone125, 77, 111, -1.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone125.cubeList.add(new ModelBox(bone125, 56, 97, -0.95F, 0.0F, 9.75F, 1, 1, 4, 0.0F, false));
		bone125.cubeList.add(new ModelBox(bone125, 96, 62, -0.95F, 0.9035F, 9.75F, 1, 1, 4, 0.0F, false));
		bone125.cubeList.add(new ModelBox(bone125, 23, 110, -1.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		bone126 = new ModelRenderer(this);
		bone126.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone124.addChild(bone126);
		setRotationAngle(bone126, 0.0F, 0.0F, 1.117F);
		bone126.cubeList.add(new ModelBox(bone126, 79, 81, 0.0F, 0.0F, 3.75F, 1, 1, 14, 0.0F, false));
		bone126.cubeList.add(new ModelBox(bone126, 86, 96, -0.0562F, -0.0265F, 9.75F, 1, 1, 4, 0.0F, false));
		bone126.cubeList.add(new ModelBox(bone126, 35, 94, -0.0562F, 0.9035F, 9.75F, 1, 1, 4, 0.0F, false));
		bone126.cubeList.add(new ModelBox(bone126, 80, 26, -0.001F, 0.8535F, 3.749F, 1, 1, 14, 0.0F, false));

		barrel_thick2 = new ModelRenderer(this);
		barrel_thick2.setRotationPoint(0.0F, 4.0F, -70.5F);
		barrel.addChild(barrel_thick2);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(-0.5F, -44.0035F, -55.0F);
		barrel_thick2.addChild(bone63);
		setRotationAngle(bone63, 0.0F, 0.0F, -3.1416F);
		

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(bone64);
		setRotationAngle(bone64, 0.0F, 0.0F, -1.117F);
		bone64.cubeList.add(new ModelBox(bone64, 80, 41, -1.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 0, 55, -1.5F, 0.0F, 3.747F, 1, 2, 1, 0.0F, false));
		bone64.cubeList.add(new ModelBox(bone64, 80, 36, -1.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone63.addChild(bone65);
		setRotationAngle(bone65, 0.0F, 0.0F, 1.117F);
		bone65.cubeList.add(new ModelBox(bone65, 80, 34, 0.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 41, 62, 0.5F, 0.0F, 3.748F, 1, 2, 1, 0.0F, false));
		bone65.cubeList.add(new ModelBox(bone65, 25, 80, -0.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(2.0F, -46.5035F, -55.0F);
		barrel_thick2.addChild(bone66);
		setRotationAngle(bone66, 0.0F, 0.0F, 1.5708F);
		

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone66.addChild(bone67);
		setRotationAngle(bone67, 0.0F, 0.0F, -1.117F);
		bone67.cubeList.add(new ModelBox(bone67, 16, 80, -1.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 26, 55, -1.5F, 0.0F, 3.747F, 1, 2, 1, 0.0F, false));
		bone67.cubeList.add(new ModelBox(bone67, 9, 80, -1.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone66.addChild(bone69);
		setRotationAngle(bone69, 0.0F, 0.0F, 1.117F);
		bone69.cubeList.add(new ModelBox(bone69, 75, 70, 0.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone69.cubeList.add(new ModelBox(bone69, 50, 25, 0.5F, 0.0F, 3.748F, 1, 2, 1, 0.0F, false));
		bone69.cubeList.add(new ModelBox(bone69, 75, 68, -0.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone156 = new ModelRenderer(this);
		bone156.setRotationPoint(-0.5F, -49.0035F, -55.0F);
		barrel_thick2.addChild(bone156);
		

		bone157 = new ModelRenderer(this);
		bone157.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone156.addChild(bone157);
		setRotationAngle(bone157, 0.0F, 0.0F, -1.117F);
		bone157.cubeList.add(new ModelBox(bone157, 75, 62, -1.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone157.cubeList.add(new ModelBox(bone157, 35, 63, -1.5F, 0.0F, 3.747F, 1, 2, 1, 0.0F, false));
		bone157.cubeList.add(new ModelBox(bone157, 67, 59, -1.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone158 = new ModelRenderer(this);
		bone158.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone156.addChild(bone158);
		setRotationAngle(bone158, 0.0F, 0.0F, 1.117F);
		bone158.cubeList.add(new ModelBox(bone158, 35, 66, 0.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone158.cubeList.add(new ModelBox(bone158, 50, 14, 0.5F, 0.0F, 3.748F, 1, 2, 1, 0.0F, false));
		bone158.cubeList.add(new ModelBox(bone158, 41, 65, -0.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone159 = new ModelRenderer(this);
		bone159.setRotationPoint(-3.0F, -46.5035F, -55.0F);
		barrel_thick2.addChild(bone159);
		setRotationAngle(bone159, 0.0F, 0.0F, -1.5708F);
		

		bone160 = new ModelRenderer(this);
		bone160.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone159.addChild(bone160);
		setRotationAngle(bone160, 0.0F, 0.0F, -1.117F);
		bone160.cubeList.add(new ModelBox(bone160, 60, 56, -1.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone160.cubeList.add(new ModelBox(bone160, 50, 33, -1.5F, 0.0F, 3.747F, 1, 2, 1, 0.0F, false));
		bone160.cubeList.add(new ModelBox(bone160, 60, 26, -1.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		bone161 = new ModelRenderer(this);
		bone161.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone159.addChild(bone161);
		setRotationAngle(bone161, 0.0F, 0.0F, 1.117F);
		bone161.cubeList.add(new ModelBox(bone161, 60, 10, 0.0F, 0.0F, 3.75F, 1, 1, 1, 0.0F, false));
		bone161.cubeList.add(new ModelBox(bone161, 13, 57, 0.5F, 0.0F, 3.748F, 1, 2, 1, 0.0F, false));
		bone161.cubeList.add(new ModelBox(bone161, 60, 0, -0.001F, 0.8535F, 3.749F, 1, 1, 1, 0.0F, false));

		barrel_taper1 = new ModelRenderer(this);
		barrel_taper1.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(barrel_taper1);
		

		bone136 = new ModelRenderer(this);
		bone136.setRotationPoint(-0.5F, -44.4F, -58.0F);
		barrel_taper1.addChild(bone136);
		bone136.cubeList.add(new ModelBox(bone136, 96, 32, -0.5F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone135 = new ModelRenderer(this);
		bone135.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone136.addChild(bone135);
		setRotationAngle(bone135, 0.0F, 0.0F, 1.0472F);
		bone135.cubeList.add(new ModelBox(bone135, 79, 89, 0.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone134 = new ModelRenderer(this);
		bone134.setRotationPoint(0.5F, 0.0F, 0.0F);
		bone136.addChild(bone134);
		setRotationAngle(bone134, 0.0F, 0.0F, -1.0472F);
		bone134.cubeList.add(new ModelBox(bone134, 94, 15, -1.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone143 = new ModelRenderer(this);
		bone143.setRotationPoint(-0.5F, -40.62F, -58.0F);
		barrel_taper1.addChild(bone143);
		setRotationAngle(bone143, 0.0F, 0.0F, -3.1416F);
		bone143.cubeList.add(new ModelBox(bone143, 41, 62, -0.5F, -0.03F, 1.75F, 1, 1, 5, 0.0F, false));

		bone144 = new ModelRenderer(this);
		bone144.setRotationPoint(-0.5F, -0.03F, 0.0F);
		bone143.addChild(bone144);
		setRotationAngle(bone144, 0.0F, 0.0F, 1.0472F);
		bone144.cubeList.add(new ModelBox(bone144, 68, 68, 0.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone145 = new ModelRenderer(this);
		bone145.setRotationPoint(0.5F, -0.03F, 0.0F);
		bone143.addChild(bone145);
		setRotationAngle(bone145, 0.0F, 0.0F, -1.0472F);
		bone145.cubeList.add(new ModelBox(bone145, 67, 56, -1.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone137 = new ModelRenderer(this);
		bone137.setRotationPoint(-2.4F, -42.5F, -58.0F);
		barrel_taper1.addChild(bone137);
		setRotationAngle(bone137, 0.0F, 0.0F, -1.5708F);
		bone137.cubeList.add(new ModelBox(bone137, 82, 56, -0.5F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone138 = new ModelRenderer(this);
		bone138.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone137.addChild(bone138);
		setRotationAngle(bone138, 0.0F, 0.0F, 1.0472F);
		bone138.cubeList.add(new ModelBox(bone138, 25, 86, 0.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone139 = new ModelRenderer(this);
		bone139.setRotationPoint(0.5F, 0.0F, 0.0F);
		bone137.addChild(bone139);
		setRotationAngle(bone139, 0.0F, 0.0F, -1.0472F);
		bone139.cubeList.add(new ModelBox(bone139, 82, 62, -1.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone140 = new ModelRenderer(this);
		bone140.setRotationPoint(1.4F, -42.5F, -58.0F);
		barrel_taper1.addChild(bone140);
		setRotationAngle(bone140, 0.0F, 0.0F, 1.5708F);
		bone140.cubeList.add(new ModelBox(bone140, 9, 80, -0.5F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone141 = new ModelRenderer(this);
		bone141.setRotationPoint(-0.5F, 0.0F, 0.0F);
		bone140.addChild(bone141);
		setRotationAngle(bone141, 0.0F, 0.0F, 1.0472F);
		bone141.cubeList.add(new ModelBox(bone141, 80, 34, 0.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		bone142 = new ModelRenderer(this);
		bone142.setRotationPoint(0.5F, 0.0F, 0.0F);
		bone140.addChild(bone142);
		setRotationAngle(bone142, 0.0F, 0.0F, -1.0472F);
		bone142.cubeList.add(new ModelBox(bone142, 25, 80, -1.0F, 0.0F, 1.75F, 1, 1, 5, 0.0F, false));

		barrel_long = new ModelRenderer(this);
		barrel_long.setRotationPoint(0.0F, -0.3F, 1.0F);
		barrel.addChild(barrel_long);
		barrel_long.cubeList.add(new ModelBox(barrel_long, 112, 55, -1.0F, -43.9F, -111.25F, 1, 1, 54, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 0, 165, -2.2F, -42.7F, -111.25F, 1, 1, 54, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 112, 167, 0.2F, -42.7F, -111.25F, 1, 1, 54, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 56, 166, -1.0F, -41.5F, -111.25F, 1, 1, 54, 0.0F, false));

		bone146 = new ModelRenderer(this);
		bone146.setRotationPoint(0.0F, -43.9F, -62.0F);
		barrel_long.addChild(bone146);
		setRotationAngle(bone146, 0.0F, 0.0F, -0.7854F);
		bone146.cubeList.add(new ModelBox(bone146, 112, 0, -1.0F, 0.0F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 56, 1, -2.4042F, 1.4042F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 0, 0, -3.1113F, 0.6971F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 56, 56, -1.7F, 1.404F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 0, 55, -3.1142F, -0.0102F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 56, 111, -1.7071F, -0.7071F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 0, 110, -2.4F, -0.708F, -49.25F, 1, 1, 54, 0.0F, false));
		bone146.cubeList.add(new ModelBox(bone146, 112, 112, -1.001F, 0.7F, -49.25F, 1, 1, 54, 0.0F, false));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, -43.5F, -111.25F);
		barrel.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 0, 110, -3.0F, -1.0F, -3.0F, 5, 4, 4, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 0, 38, -3.0F, -2.001F, -10.0F, 5, 1, 7, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 0, 15, -3.0F, 2.999F, -10.0F, 5, 1, 7, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 44, 50, -2.5F, -2.0F, -10.3F, 4, 2, 1, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 14, 46, -2.5F, 2.0F, -10.3F, 4, 2, 1, 0.0F, false));

		bone162 = new ModelRenderer(this);
		bone162.setRotationPoint(0.0F, -2.0F, -3.0F);
		muzzle.addChild(bone162);
		setRotationAngle(bone162, -0.9076F, 0.0F, 0.0F);
		bone162.cubeList.add(new ModelBox(bone162, 0, 50, -2.999F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

		bone163 = new ModelRenderer(this);
		bone163.setRotationPoint(0.0F, 4.0F, -3.0F);
		muzzle.addChild(bone163);
		setRotationAngle(bone163, 0.9076F, 0.0F, 0.0F);
		bone163.cubeList.add(new ModelBox(bone163, 0, 46, -2.999F, -1.0F, 0.0F, 5, 1, 2, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(2.0F, -2.25F, -3.0F);
		muzzle.addChild(bone50);
		setRotationAngle(bone50, 0.0F, -0.2094F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 0, 91, -2.0F, 0.25F, -7.0F, 2, 1, 7, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 0, 25, -2.0F, 1.25F, -7.0F, 2, 4, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 17, 17, -2.0F, 1.25F, -1.0F, 2, 4, 1, 0.0F, false));
		bone50.cubeList.add(new ModelBox(bone50, 56, 89, -2.0F, 5.25F, -7.0F, 2, 1, 7, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, 1.25F, -2.0F);
		bone50.addChild(bone62);
		setRotationAngle(bone62, -0.7854F, 0.0F, 0.0F);
		bone62.cubeList.add(new ModelBox(bone62, 28, 19, -1.999F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));
		bone62.cubeList.add(new ModelBox(bone62, 48, 72, -1.999F, 0.8284F, 2.8284F, 2, 2, 1, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(0.0F, 1.25F, -4.9022F);
		bone50.addChild(bone60);
		setRotationAngle(bone60, 0.7854F, 0.0F, 0.0F);
		bone60.cubeList.add(new ModelBox(bone60, 26, 64, -2.999F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));
		bone60.cubeList.add(new ModelBox(bone60, 16, 5, -2.999F, 0.8284F, -3.8284F, 3, 2, 1, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(-3.0F, -2.25F, -3.0F);
		muzzle.addChild(bone51);
		setRotationAngle(bone51, 0.0F, 0.2094F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 0, 38, 0.0F, 1.25F, -7.0F, 2, 4, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 0, 15, 0.0F, 1.25F, -1.0F, 2, 4, 1, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 56, 81, 0.0F, 0.25F, -7.0F, 2, 1, 7, 0.0F, false));
		bone51.cubeList.add(new ModelBox(bone51, 82, 70, 0.0F, 5.25F, -7.0F, 2, 1, 7, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(0.0F, 1.25F, -2.0F);
		bone51.addChild(bone59);
		setRotationAngle(bone59, -0.7854F, 0.0F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 69, 40, -0.001F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));
		bone59.cubeList.add(new ModelBox(bone59, 40, 72, -0.001F, 0.8284F, 2.8284F, 2, 2, 1, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(0.0F, 1.25F, -4.9022F);
		bone51.addChild(bone61);
		setRotationAngle(bone61, 0.7854F, 0.0F, 0.0F);
		bone61.cubeList.add(new ModelBox(bone61, 67, 62, -0.001F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));
		bone61.cubeList.add(new ModelBox(bone61, 46, 46, -0.001F, 0.8284F, -3.8284F, 3, 2, 1, 0.0F, false));

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.75F, 30.0F, -6.0F);
		magazine.cubeList.add(new ModelBox(magazine, 42, 0, -1.75F, -38.5F, -12.0F, 4, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -1.75F, -38.5F, -20.0F, 4, 7, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 41, 25, -1.25F, -38.5F, -22.75F, 3, 5, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 56, 111, -1.75F, -38.5F, -26.75F, 4, 6, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 10, -1.748F, -33.3F, -23.75F, 4, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(2.25F, -32.5F, -22.75F);
		magazine.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -0.4189F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 56, 26, -1.0F, -6.0F, 0.0F, 1, 7, 2, 0.0F, false));

		bone132 = new ModelRenderer(this);
		bone132.setRotationPoint(2.25F, -32.5F, -22.75F);
		magazine.addChild(bone132);
		setRotationAngle(bone132, -0.1571F, -0.4189F, 0.0F);
		bone132.cubeList.add(new ModelBox(bone132, 18, 73, -0.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone133 = new ModelRenderer(this);
		bone133.setRotationPoint(-1.75F, -32.5F, -22.75F);
		magazine.addChild(bone133);
		setRotationAngle(bone133, -0.1571F, 0.4189F, 0.0F);
		bone133.cubeList.add(new ModelBox(bone133, 10, 73, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.75F, -32.5F, -22.75F);
		magazine.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.4189F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 56, 0, 0.0F, -6.0F, 0.0F, 1, 7, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(2.25F, -32.5F, -20.0F);
		magazine.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.4189F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 56, 10, -1.0F, -6.0F, -2.0F, 1, 7, 2, 0.0F, false));

		bone130 = new ModelRenderer(this);
		bone130.setRotationPoint(2.25F, -32.0F, -20.0F);
		magazine.addChild(bone130);
		setRotationAngle(bone130, -0.1396F, 0.4189F, 0.0F);
		bone130.cubeList.add(new ModelBox(bone130, 74, 65, -0.999F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-1.75F, -32.5F, -20.0F);
		magazine.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.4189F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 56, 56, 0.0F, -6.0F, -2.0F, 1, 7, 2, 0.0F, false));

		bone131 = new ModelRenderer(this);
		bone131.setRotationPoint(-1.75F, -32.0F, -20.0F);
		magazine.addChild(bone131);
		setRotationAngle(bone131, -0.1396F, -0.4189F, 0.0F);
		bone131.cubeList.add(new ModelBox(bone131, 74, 56, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.25F, -31.5601F, -20.7934F);
		magazine.addChild(bone6);
		setRotationAngle(bone6, -0.1745F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 28, 14, -1.999F, -1.4981F, 1.0176F, 4, 2, 8, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 56, 20, -1.998F, -0.4989F, 0.7434F, 4, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 96, 56, -1.501F, -2.4981F, -1.9824F, 3, 3, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 56, 75, -1.999F, -0.4981F, -5.9824F, 4, 1, 4, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		stock_metal = new ModelRenderer(this);
		stock_metal.setRotationPoint(-1.75F, 6.0F, -6.0F);
		stock.addChild(stock_metal);
		stock_metal.cubeList.add(new ModelBox(stock_metal, 0, 80, 1.25F, -42.5F, 11.0F, 1, 4, 7, 0.0F, false));
		stock_metal.cubeList.add(new ModelBox(stock_metal, 56, 36, -1.75F, -41.5F, 11.0F, 3, 3, 7, 0.0F, false));
		stock_metal.cubeList.add(new ModelBox(stock_metal, 112, 0, -1.75F, -42.5F, 18.0F, 4, 2, 17, 0.0F, false));
		stock_metal.cubeList.add(new ModelBox(stock_metal, 56, 56, -0.6602F, -45.131F, 11.002F, 1, 1, 24, 0.0F, false));
		stock_metal.cubeList.add(new ModelBox(stock_metal, 0, 25, 0.1602F, -45.131F, 11.001F, 1, 1, 24, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.75F, -44.0F, 20.0F);
		stock_metal.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.7854F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 55, 0.0898F, -0.5097F, -9.0F, 1, 1, 24, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0707F, -0.2121F, 0.0F);
		bone5.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -1.0036F);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -2.0007F, 0.2121F, -9.0F, 2, 1, 24, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-0.6364F, -0.9192F, 0.0F);
		bone5.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 1.0036F);
		bone13.cubeList.add(new ModelBox(bone13, 112, 75, -1.0236F, 0.0192F, -1.0F, 2, 2, 16, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.75F, -44.0F, 20.0F);
		stock_metal.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.7854F);
		bone11.cubeList.add(new ModelBox(bone11, 56, 134, -1.1974F, -1.7969F, -1.0F, 1, 1, 16, 0.0F, false));

		stock_wood = new ModelRenderer(this);
		stock_wood.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(stock_wood);
		stock_wood.cubeList.add(new ModelBox(stock_wood, 0, 220, -3.25F, -34.5F, 6.0F, 4, 4, 29, 0.0F, false));
		stock_wood.cubeList.add(new ModelBox(stock_wood, 56, 26, -3.752F, -34.5F, 6.0F, 1, 4, 22, 0.0F, false));
		stock_wood.cubeList.add(new ModelBox(stock_wood, 40, 88, -2.5F, -24.0F, 29.0F, 2, 1, 4, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(0.25F, -34.0F, 27.0F);
		stock_wood.addChild(bone36);
		setRotationAngle(bone36, 0.2618F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 92, 96, -0.499F, -1.1124F, -2.3536F, 1, 1, 3, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone36.addChild(bone37);
		setRotationAngle(bone37, 0.2618F, 0.0F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 15, 25, -0.498F, -0.9072F, -0.0877F, 1, 2, 3, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone37.addChild(bone38);
		setRotationAngle(bone38, 0.2618F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 82, 70, -0.5F, -0.3813F, 2.082F, 1, 1, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-3.25F, -34.0F, 27.0F);
		stock_wood.addChild(bone39);
		setRotationAngle(bone39, 0.2618F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 0, 74, -0.5F, -1.1124F, -2.3536F, 1, 1, 3, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone39.addChild(bone40);
		setRotationAngle(bone40, 0.2618F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 16, 0, -0.501F, -0.9072F, -0.0877F, 1, 2, 3, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone40.addChild(bone41);
		setRotationAngle(bone41, 0.2618F, 0.0F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 82, 64, -0.5F, -0.3813F, 2.082F, 1, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-1.5F, -31.0F, 14.0F);
		stock_wood.addChild(bone14);
		setRotationAngle(bone14, -0.1745F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 112, 112, -1.5F, 1.4611F, -7.6099F, 3, 1, 18, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 56, 111, -2.2071F, -2.246F, -7.6099F, 1, 4, 19, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 56, 0, 1.206F, -2.246F, -7.6099F, 1, 4, 22, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 1.9611F, 1.3901F);
		bone14.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 0.7854F);
		bone18.cubeList.add(new ModelBox(bone18, 112, 56, 0.4142F, -1.7071F, -9.0F, 1, 1, 18, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(1.0F, 1.9611F, 1.3901F);
		bone14.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, -0.7854F);
		bone19.cubeList.add(new ModelBox(bone19, 112, 19, -2.1213F, -2.4142F, -9.0F, 1, 1, 18, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone14.addChild(bone15);
		setRotationAngle(bone15, -0.3054F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 76, 103, -1.5F, -1.7772F, 10.6493F, 3, 1, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -2.208F, -6.4843F, 9.6493F, 1, 5, 3, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 28, 14, 1.208F, -3.4843F, 9.6493F, 1, 2, 3, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 1.9611F, 1.3901F);
		bone15.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, 0.7854F);
		bone16.cubeList.add(new ModelBox(bone16, 16, 102, -1.8756F, -3.9969F, 8.2592F, 1, 1, 3, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(1.0F, 1.9611F, 1.3901F);
		bone15.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, -0.7854F);
		bone17.cubeList.add(new ModelBox(bone17, 6, 102, 0.1685F, -4.704F, 8.2592F, 1, 1, 3, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone15.addChild(bone20);
		setRotationAngle(bone20, -0.3927F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 42, 103, -1.5F, -6.5587F, 11.389F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 44, 14, -2.2071F, -10.2658F, 9.389F, 1, 4, 4, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 26, 55, 1.2071F, -11.2658F, 9.389F, 1, 5, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 1.9611F, 1.3901F);
		bone20.addChild(bone21);
		setRotationAngle(bone21, 0.0F, 0.0F, 0.7854F);
		bone21.cubeList.add(new ModelBox(bone21, 101, 15, -5.2566F, -7.3779F, 8.9989F, 1, 1, 3, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(1.0F, 1.9611F, 1.3901F);
		bone20.addChild(bone22);
		setRotationAngle(bone22, 0.0F, 0.0F, -0.7854F);
		bone22.cubeList.add(new ModelBox(bone22, 62, 97, 3.5495F, -8.0851F, 8.9989F, 1, 1, 3, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone20.addChild(bone23);
		setRotationAngle(bone23, -0.3927F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 67, 33, -1.5F, -11.2593F, 10.2426F, 3, 1, 1, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 80, 15, -2.2071F, -11.9664F, 9.2426F, 1, 1, 2, 0.0F, false));
		bone23.cubeList.add(new ModelBox(bone23, 40, 80, 1.2071F, -11.9664F, 9.2426F, 1, 1, 2, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 1.9611F, 1.3901F);
		bone23.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 0.7854F);
		bone24.cubeList.add(new ModelBox(bone24, 80, 3, -8.5805F, -10.7018F, 7.8525F, 1, 1, 2, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(1.0F, 1.9611F, 1.3901F);
		bone23.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -0.7854F);
		bone25.cubeList.add(new ModelBox(bone25, 80, 0, 6.8734F, -11.4089F, 7.8525F, 1, 1, 2, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.25F, -35.25F, 6.0F);
		stock_wood.addChild(bone30);
		bone30.cubeList.add(new ModelBox(bone30, 79, 81, 3.0F, -1.0F, 23.0F, 1, 2, 6, 0.0F, false));
		bone30.cubeList.add(new ModelBox(bone30, 80, 26, -0.5F, -1.0F, 23.0F, 1, 2, 6, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(2.25F, -2.75F, 12.0F);
		bone30.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.7854F);
		bone26.cubeList.add(new ModelBox(bone26, 96, 7, 0.0898F, -0.1561F, 11.0F, 1, 1, 6, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.1414F, -0.1414F, 0.0F);
		bone26.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -1.0036F);
		bone27.cubeList.add(new ModelBox(bone27, 25, 94, -2.3314F, 0.3298F, 11.0F, 2, 1, 6, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(-0.5657F, -0.8485F, 0.0F);
		bone26.addChild(bone29);
		setRotationAngle(bone29, 0.0F, 0.0F, 1.0036F);
		bone29.cubeList.add(new ModelBox(bone29, 80, 0, -1.3314F, 0.3298F, 11.0F, 1, 2, 6, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-13.3087F, 10.5987F, 40.5F);
		bone30.addChild(bone28);
		setRotationAngle(bone28, 3.1416F, 0.0F, -2.3562F);
		bone28.cubeList.add(new ModelBox(bone28, 96, 0, -0.7658F, -19.8896F, 11.5F, 1, 1, 6, 0.0F, false));

		stock_design = new ModelRenderer(this);
		stock_design.setRotationPoint(-1.0833F, -20.2103F, 20.6667F);
		stock_wood.addChild(stock_design);
		setRotationAngle(stock_design, 0.0F, 0.0F, 3.1416F);
		stock_design.cubeList.add(new ModelBox(stock_design, 28, 0, 1.6667F, 4.2897F, 7.3333F, 1, 4, 5, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 41, 41, 1.4167F, 10.5397F, 9.3333F, 1, 3, 1, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 0, 70, 1.6673F, 7.7897F, 8.3333F, 1, 1, 3, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 32, 80, 1.6673F, 12.7897F, 8.8333F, 1, 1, 2, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 26, 69, 1.6667F, 8.2897F, 11.8333F, 1, 5, 1, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 68, 66, 1.6667F, 8.2897F, 6.8333F, 1, 5, 1, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 96, 26, 1.6667F, 13.2897F, 7.3333F, 1, 1, 5, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 0, 25, -1.8333F, 4.2897F, 7.3333F, 4, 6, 7, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 0, 70, -0.7435F, 2.6587F, 6.3333F, 1, 1, 8, 0.0F, false));
		stock_design.cubeList.add(new ModelBox(stock_design, 56, 66, -0.4231F, 2.6587F, 6.3333F, 2, 1, 8, 0.0F, false));

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(2.1667F, 10.7897F, 7.3333F);
		stock_design.addChild(bone71);
		

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone71.addChild(bone57);
		setRotationAngle(bone57, -0.3927F, 0.0F, 0.0F);
		bone57.cubeList.add(new ModelBox(bone57, 73, 26, -0.5F, -2.6533F, -0.7294F, 1, 2, 1, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone71.addChild(bone70);
		setRotationAngle(bone70, -1.1781F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 73, 10, -0.5F, -2.6131F, -2.0824F, 1, 2, 1, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(2.1667F, 10.7897F, 7.3333F);
		stock_design.addChild(bone72);
		setRotationAngle(bone72, 1.5708F, 0.0F, 0.0F);
		

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone72.addChild(bone73);
		setRotationAngle(bone73, -0.3927F, 0.0F, 0.0F);
		bone73.cubeList.add(new ModelBox(bone73, 73, 0, -0.5F, 0.6131F, -2.0824F, 1, 2, 1, 0.0F, false));

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone72.addChild(bone74);
		setRotationAngle(bone74, -1.1781F, 0.0F, 0.0F);
		bone74.cubeList.add(new ModelBox(bone74, 50, 69, -0.5F, 0.6533F, -0.7294F, 1, 2, 1, 0.0F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(2.1667F, 10.7897F, 7.3333F);
		stock_design.addChild(bone75);
		setRotationAngle(bone75, -3.1416F, 0.0F, 0.0F);
		

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone75.addChild(bone76);
		setRotationAngle(bone76, -0.3927F, 0.0F, 0.0F);
		bone76.cubeList.add(new ModelBox(bone76, 67, 56, -0.5F, -0.7399F, -5.3488F, 1, 2, 1, 0.0F, false));

		bone77 = new ModelRenderer(this);
		bone77.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone75.addChild(bone77);
		setRotationAngle(bone77, -1.1781F, 0.0F, 0.0F);
		bone77.cubeList.add(new ModelBox(bone77, 67, 26, -0.5F, 2.0063F, -3.9958F, 1, 2, 1, 0.0F, false));

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(2.1667F, 10.7897F, 7.3333F);
		stock_design.addChild(bone78);
		setRotationAngle(bone78, -1.5708F, 0.0F, 0.0F);
		

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone78.addChild(bone79);
		setRotationAngle(bone79, -0.3927F, 0.0F, 0.0F);
		bone79.cubeList.add(new ModelBox(bone79, 67, 10, -0.5F, -4.0063F, -3.9958F, 1, 2, 1, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone78.addChild(bone80);
		setRotationAngle(bone80, -1.1781F, 0.0F, 0.0F);
		bone80.cubeList.add(new ModelBox(bone80, 67, 0, -0.5F, -1.2601F, -5.3488F, 1, 2, 1, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0833F, -13.7897F, -2.6667F);
		stock_design.addChild(bone32);
		setRotationAngle(bone32, 0.0F, 0.0F, -0.7854F);
		bone32.cubeList.add(new ModelBox(bone32, 112, 0, -11.5746F, 12.6868F, 10.0F, 1, 1, 7, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone32.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -1.1781F);
		bone33.cubeList.add(new ModelBox(bone33, 112, 112, -17.6917F, -5.532F, 10.0F, 1, 1, 7, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-15.4753F, -0.441F, 25.8333F);
		stock_design.addChild(bone34);
		setRotationAngle(bone34, 3.1416F, 0.0F, -2.3562F);
		bone34.cubeList.add(new ModelBox(bone34, 93, 111, -13.6087F, -8.2252F, 11.5F, 1, 1, 7, 0.0F, false));

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(-0.4413F, -19.3487F, 2.5F);
		bone34.addChild(bone35);
		setRotationAngle(bone35, 0.0F, 0.0F, -1.1781F);
		bone35.cubeList.add(new ModelBox(bone35, 93, 96, -16.857F, -7.6017F, 9.0F, 1, 1, 7, 0.0F, false));

		stock_butt = new ModelRenderer(this);
		stock_butt.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(stock_butt);
		

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(-3.25F, -35.25F, 10.0F);
		stock_butt.addChild(bone42);
		bone42.cubeList.add(new ModelBox(bone42, 40, 96, 0.5898F, -3.631F, 19.0F, 1, 1, 6, 0.0F, false));
		bone42.cubeList.add(new ModelBox(bone42, 92, 41, 0.9102F, -3.631F, 19.0F, 2, 1, 6, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(-1.0833F, -24.2103F, 22.6667F);
		stock_butt.addChild(bone47);
		setRotationAngle(bone47, 0.0F, 0.0F, -3.1416F);
		bone47.cubeList.add(new ModelBox(bone47, 26, 26, -1.3327F, 0.2897F, 10.3343F, 4, 10, 2, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(0.4167F, 4.8791F, 12.0445F);
		bone47.addChild(bone55);
		setRotationAngle(bone55, -0.2182F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 40, 69, -2.0F, -4.0067F, -1.1888F, 4, 2, 1, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(0.4167F, 4.8791F, 12.0445F);
		bone47.addChild(bone56);
		setRotationAngle(bone56, -0.3054F, 0.0F, 0.0F);
		bone56.cubeList.add(new ModelBox(bone56, 66, 20, -2.0F, -4.975F, -1.5373F, 4, 1, 1, 0.0F, false));
		bone56.cubeList.add(new ModelBox(bone56, 67, 7, -1.5F, -5.975F, -1.5373F, 3, 1, 1, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(0.4167F, 10.2897F, 12.8333F);
		bone47.addChild(bone52);
		setRotationAngle(bone52, -0.3927F, 0.0F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 67, 17, -1.5F, 2.232F, 0.0904F, 3, 1, 1, 0.0F, false));
		bone52.cubeList.add(new ModelBox(bone52, 80, 28, -1.0F, 3.232F, 0.0904F, 2, 1, 1, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(0.4167F, 12.5021F, 13.2721F);
		bone47.addChild(bone53);
		setRotationAngle(bone53, -0.1745F, 0.0F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 66, 46, -2.0F, -0.6875F, -1.2348F, 4, 1, 1, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(0.4167F, 11.2864F, 12.6099F);
		bone47.addChild(bone54);
		setRotationAngle(bone54, 0.2182F, 0.0F, 0.0F);
		bone54.cubeList.add(new ModelBox(bone54, 56, 103, -2.0F, -3.3948F, -0.5704F, 4, 4, 1, 0.0F, false));

		grab_thingy = new ModelRenderer(this);
		grab_thingy.setRotationPoint(-3.5F, -11.25F, -13.0F);
		setRotationAngle(grab_thingy, 0.0F, 0.0F, -0.48F);
		grab_thingy.cubeList.add(new ModelBox(grab_thingy, 74, 59, -0.463F, -1.4429F, -0.75F, 2, 1, 1, 0.0F, false));
		grab_thingy.cubeList.add(new ModelBox(grab_thingy, 80, 26, -0.464F, -0.943F, -0.751F, 2, 1, 1, 0.0F, false));
		grab_thingy.cubeList.add(new ModelBox(grab_thingy, 72, 78, -0.463F, -0.9429F, -0.25F, 2, 1, 1, 0.0F, false));
		grab_thingy.cubeList.add(new ModelBox(grab_thingy, 76, 52, -0.464F, -1.443F, -0.251F, 2, 1, 1, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(-2.0F, 0.5F, -0.5F);
		grab_thingy.addChild(bone58);
		bone58.cubeList.add(new ModelBox(bone58, 15, 30, -1.463F, -1.6929F, 0.0F, 3, 1, 1, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(-4.0462F, 1.3387F, 0.25F);
		grab_thingy.addChild(bone68);
		bone68.cubeList.add(new ModelBox(bone68, 56, 70, -1.3339F, -3.0161F, -1.3F, 2, 2, 2, 0.0F, false));

		slide = new ModelRenderer(this);
		slide.setRotationPoint(-1.0F, 30.0F, 53.5F);
		slide.cubeList.add(new ModelBox(slide, 56, 75, -1.25F, -43.75F, -61.499F, 1, 2, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 74, 36, -0.75F, -43.75F, -61.5F, 1, 2, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 44, 14, -1.0F, -44.0F, -61.501F, 1, 3, 1, 0.0F, false));

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(-0.5F, -44.5F, -91.0F);
		slide.addChild(bone96);
		

		bone95 = new ModelRenderer(this);
		bone95.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone96.addChild(bone95);
		setRotationAngle(bone95, 0.0F, 0.0F, 1.117F);
		bone95.cubeList.add(new ModelBox(bone95, 193, 259, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone95.cubeList.add(new ModelBox(bone95, 164, 258, -0.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone96.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 0.0F, -1.117F);
		bone93.cubeList.add(new ModelBox(bone93, 260, 92, -1.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone93.cubeList.add(new ModelBox(bone93, 258, 0, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone102 = new ModelRenderer(this);
		bone102.setRotationPoint(-0.5F, -41.5F, -91.0F);
		slide.addChild(bone102);
		setRotationAngle(bone102, 0.0F, 0.0F, -3.1416F);
		

		bone103 = new ModelRenderer(this);
		bone103.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone102.addChild(bone103);
		setRotationAngle(bone103, 0.0F, 0.0F, 1.117F);
		bone103.cubeList.add(new ModelBox(bone103, 232, 217, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone103.cubeList.add(new ModelBox(bone103, 225, 185, -0.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone104 = new ModelRenderer(this);
		bone104.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone102.addChild(bone104);
		setRotationAngle(bone104, 0.0F, 0.0F, -1.117F);
		bone104.cubeList.add(new ModelBox(bone104, 225, 157, -1.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone104.cubeList.add(new ModelBox(bone104, 161, 224, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(1.0F, -43.0F, -91.0F);
		slide.addChild(bone94);
		setRotationAngle(bone94, 0.0F, 0.0F, 1.5708F);
		

		bone97 = new ModelRenderer(this);
		bone97.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone94.addChild(bone97);
		setRotationAngle(bone97, 0.0F, 0.0F, 1.117F);
		bone97.cubeList.add(new ModelBox(bone97, 254, 176, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone97.cubeList.add(new ModelBox(bone97, 254, 148, -0.001F, 0.1F, -26.002F, 1, 1, 27, 0.0F, false));

		bone98 = new ModelRenderer(this);
		bone98.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone94.addChild(bone98);
		setRotationAngle(bone98, 0.0F, 0.0F, -1.117F);
		bone98.cubeList.add(new ModelBox(bone98, 97, 254, -1.0F, 0.0F, -25.999F, 1, 1, 27, 0.0F, false));
		bone98.cubeList.add(new ModelBox(bone98, 68, 253, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(-2.0F, -43.0F, -91.0F);
		slide.addChild(bone99);
		setRotationAngle(bone99, 0.0F, 0.0F, -1.5708F);
		

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone99.addChild(bone100);
		setRotationAngle(bone100, 0.0F, 0.0F, 1.117F);
		bone100.cubeList.add(new ModelBox(bone100, 0, 253, 0.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone100.cubeList.add(new ModelBox(bone100, 135, 252, -0.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(0.0F, 0.0F, 29.0F);
		bone99.addChild(bone101);
		setRotationAngle(bone101, 0.0F, 0.0F, -1.117F);
		bone101.cubeList.add(new ModelBox(bone101, 39, 252, -1.0F, 0.0F, -26.0F, 1, 1, 27, 0.0F, false));
		bone101.cubeList.add(new ModelBox(bone101, 244, 245, -1.001F, 0.1F, -26.001F, 1, 1, 27, 0.0F, false));

		bone108 = new ModelRenderer(this);
		bone108.setRotationPoint(0.25F, -41.75F, -61.501F);
		slide.addChild(bone108);
		setRotationAngle(bone108, 0.0F, 0.0F, 1.0472F);
		bone108.cubeList.add(new ModelBox(bone108, 25, 82, -1.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(-1.25F, -41.75F, -61.501F);
		slide.addChild(bone109);
		setRotationAngle(bone109, 0.0F, 0.0F, -1.0472F);
		bone109.cubeList.add(new ModelBox(bone109, 16, 82, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		bone107 = new ModelRenderer(this);
		bone107.setRotationPoint(0.2F, -43.2F, -61.25F);
		slide.addChild(bone107);
		setRotationAngle(bone107, 0.0F, 0.0F, -0.7854F);
		bone107.cubeList.add(new ModelBox(bone107, 82, 62, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		carry_handle = new ModelRenderer(this);
		carry_handle.setRotationPoint(-1.0F, 30.75F, 53.5F);
		

		bone147 = new ModelRenderer(this);
		bone147.setRotationPoint(0.0F, -45.0F, -115.5F);
		carry_handle.addChild(bone147);
		bone147.cubeList.add(new ModelBox(bone147, 40, 80, -0.6F, -2.75F, 3.75F, 1, 2, 6, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 56, 66, -0.6F, -2.75F, 9.75F, 1, 1, 3, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 130, 133, -7.3F, 2.65F, 10.75F, 1, 1, 16, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 10, 70, -1.4F, -2.75F, 3.75F, 1, 2, 6, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 69, 36, -1.4F, -2.75F, 9.751F, 1, 1, 3, 0.0F, false));
		bone147.cubeList.add(new ModelBox(bone147, 132, 56, -8.1F, 2.65F, 10.751F, 1, 1, 16, 0.0F, false));

		bone154 = new ModelRenderer(this);
		bone154.setRotationPoint(0.25F, -2.35F, -0.25F);
		bone147.addChild(bone154);
		setRotationAngle(bone154, 0.0F, 0.0F, -0.7854F);
		bone154.cubeList.add(new ModelBox(bone154, 80, 43, -1.0F, -1.0F, 3.75F, 1, 1, 1, 0.0F, false));

		bone152 = new ModelRenderer(this);
		bone152.setRotationPoint(0.4F, -1.25F, 0.0F);
		bone147.addChild(bone152);
		setRotationAngle(bone152, 0.0F, 0.0F, -2.0769F);
		bone152.cubeList.add(new ModelBox(bone152, 95, 88, -1.0F, -1.0F, 3.748F, 1, 1, 6, 0.0F, false));

		bone153 = new ModelRenderer(this);
		bone153.setRotationPoint(-1.4F, -1.25F, 0.0F);
		bone147.addChild(bone153);
		setRotationAngle(bone153, 0.0F, 0.0F, 2.0769F);
		bone153.cubeList.add(new ModelBox(bone153, 40, 72, 0.0F, -1.0F, 3.748F, 1, 1, 6, 0.0F, false));

		bone155 = new ModelRenderer(this);
		bone155.setRotationPoint(-1.4F, -2.45F, 0.0F);
		bone147.addChild(bone155);
		setRotationAngle(bone155, 0.0F, 0.0F, 0.9076F);
		bone155.cubeList.add(new ModelBox(bone155, 18, 55, 0.0F, 0.0F, 10.75F, 1, 8, 2, 0.0F, false));

		bone148 = new ModelRenderer(this);
		bone148.setRotationPoint(-1.4F, -2.75F, 0.0F);
		bone147.addChild(bone148);
		setRotationAngle(bone148, 0.0F, 0.0F, 2.6704F);
		bone148.cubeList.add(new ModelBox(bone148, 56, 26, -1.0F, -1.0F, 3.748F, 1, 1, 9, 0.0F, false));
		bone148.cubeList.add(new ModelBox(bone148, 18, 133, 7.4213F, -2.7697F, 10.748F, 1, 1, 16, 0.0F, false));

		bone151 = new ModelRenderer(this);
		bone151.setRotationPoint(-1.4F, -1.75F, 0.0F);
		bone147.addChild(bone151);
		setRotationAngle(bone151, 0.0F, 0.0F, -2.6704F);
		bone151.cubeList.add(new ModelBox(bone151, 56, 56, -1.0F, 0.0F, 3.748F, 1, 1, 9, 0.0F, false));
		bone151.cubeList.add(new ModelBox(bone151, 132, 19, 2.5182F, -7.8532F, 10.748F, 1, 1, 16, 0.0F, false));

		bone149 = new ModelRenderer(this);
		bone149.setRotationPoint(0.4F, -2.75F, 0.0F);
		bone147.addChild(bone149);
		setRotationAngle(bone149, 0.0F, 0.0F, -2.6704F);
		bone149.cubeList.add(new ModelBox(bone149, 56, 10, 0.0F, -1.0F, 3.749F, 1, 1, 9, 0.0F, false));
		bone149.cubeList.add(new ModelBox(bone149, 132, 77, 3.5182F, -8.8532F, 10.749F, 1, 1, 16, 0.0F, false));

		bone150 = new ModelRenderer(this);
		bone150.setRotationPoint(0.4F, -1.75F, 0.0F);
		bone147.addChild(bone150);
		setRotationAngle(bone150, 0.0F, 0.0F, 2.6704F);
		bone150.cubeList.add(new ModelBox(bone150, 56, 0, 0.0F, 0.0F, 3.749F, 1, 1, 9, 0.0F, false));
		bone150.cubeList.add(new ModelBox(bone150, 0, 132, 8.4213F, -1.7697F, 10.749F, 1, 1, 16, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		grip.render(f5);
//		handle_arm.render(f5);
//		chassis.render(f5);
//		barrel.render(f5);
//		magazine.render(f5);
//		stock.render(f5);
//		grab_thingy.render(f5);
		slide.render(f5);
//		carry_handle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}