package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ATVWheel extends ModelBase {
	private final QRenderer body;
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
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final QRenderer steering_thing;
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
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;
	private final ModelRenderer cube_r143;
	private final QRenderer wheel_small;
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer cube_r149;
	private final ModelRenderer cube_r150;
	private final ModelRenderer cube_r151;
	private final ModelRenderer cube_r152;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;

	public ATVWheel() {
		textureWidth = 170;
		textureHeight = 170;

		body = new QRenderer(this);
		body.setRotationPoint(0.0F, 9.9311F, 22.2017F);
		body.cubeList.add(new ModelBox(body, 31, 25, -14.0F, -8.7029F, -18.2022F, 28, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 19, 112, 8.9411F, -9.2771F, -25.1578F, 3, 2, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 111, 111, -11.9411F, -9.2771F, -25.1578F, 3, 2, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 38, 32, -10.0F, -8.7011F, -26.2022F, 20, 2, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 92, 4, -4.5F, -9.2783F, -28.1964F, 9, 2, 8, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 64, 4, -3.0F, -5.7029F, -30.2022F, 6, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -13.5F, 3.5689F, -10.9517F, 27, 2, 10, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 12, -3.5F, -7.4311F, -27.9517F, 7, 13, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 37, 53, -3.5F, -4.4311F, -0.7017F, 7, 9, 13, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.3491F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 64, -13.0F, -5.5F, -1.0F, 2, 11, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 39, 131, 11.0F, -5.5F, -1.0F, 2, 11, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-13.25F, 0.0F, 0.0F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3488F, -0.0149F, -0.041F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 130, -0.5F, -5.5F, -1.0017F, 1, 11, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-12.5F, -6.3791F, 2.5211F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 111, -1.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 105, 111, 23.5F, -1.5F, -1.0F, 3, 3, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(13.25F, 0.0F, 0.0F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3488F, 0.0149F, 0.041F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 132, -0.5F, -5.5F, -1.0017F, 1, 11, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.5F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 64, 53, -11.0F, -5.5F, -1.0F, 22, 11, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(5.8998F, -0.3117F, 10.5483F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, -0.3927F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 42, -1.0F, -5.0F, -1.0F, 2, 12, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.8998F, -0.3117F, 10.5483F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.3927F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 42, -1.0F, -5.0F, -1.0F, 2, 12, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.8998F, -0.3117F, -21.4517F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0873F, 0.0F, 0.3927F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 88, 130, -1.0F, -5.0F, -1.0F, 2, 12, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(5.8998F, -0.3117F, -21.4517F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, -0.3927F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 96, 130, -1.0F, -5.0F, -1.0F, 2, 12, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(5.7221F, -6.2736F, -20.4517F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.3927F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 88, 34, -3.5F, -0.5F, -5.5F, 7, 2, 10, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-5.7221F, -6.2736F, -20.4517F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.3927F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 92, -3.5F, -0.5F, -5.5F, 7, 2, 10, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.5302F, 5.1479F, 8.2983F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.1309F, -0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 11, 128, -4.0F, -1.0F, -2.0F, 8, 2, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.5302F, 5.1479F, 9.2983F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.1309F, 0.3491F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 52, 126, -4.0F, -1.0F, 0.0F, 8, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(4.5302F, 5.1479F, 8.2983F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, -0.1309F, 0.3491F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 111, -4.0F, -1.0F, -2.0F, 8, 2, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.5302F, 5.1479F, 9.2983F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, -0.1309F, -0.3491F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 112, 54, -4.0F, -1.0F, 0.0F, 8, 2, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(4.5302F, 5.1479F, -21.7017F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.1309F, 0.3491F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 129, 58, -4.0F, -1.0F, 0.0F, 8, 2, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(4.5302F, 5.1479F, -22.7017F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.1309F, 0.3491F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 70, 128, -4.0F, -1.0F, -2.0F, 8, 2, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.5302F, 5.1479F, -21.7017F);
		body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -0.1309F, -0.3491F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 129, 62, -4.0F, -1.0F, 0.0F, 8, 2, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.5302F, 5.1479F, -22.7017F);
		body.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.1309F, -0.3491F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 129, 89, -4.0F, -1.0F, -2.0F, 8, 2, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -5.9844F, -14.7284F);
		body.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.829F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 31, 12, -13.99F, -0.75F, -3.0F, 28, 2, 5, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(12.75F, 1.9128F, -11.5962F);
		body.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.4784F, -0.0403F, 0.0774F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 92, -1.0F, -3.5F, -1.0056F, 2, 7, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-12.75F, 1.9128F, -11.5962F);
		body.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.4784F, 0.0403F, -0.0774F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 97, 66, -1.0F, -3.5F, -1.0056F, 2, 7, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 1.9128F, -11.5962F);
		body.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.48F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 33, 44, -13.0F, -3.5F, -1.0F, 26, 7, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -2.2506F, -14.1136F);
		body.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.1745F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 19, -14.0F, -2.5F, -0.25F, 28, 4, 2, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-8.4445F, -7.7029F, -25.941F);
		body.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.4363F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 112, 34, -4.5F, -1.0002F, -1.25F, 9, 2, 3, -0.01F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-8.2219F, -8.7647F, -26.6468F);
		body.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.6981F, 0.4363F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 130, 81, -4.0F, -0.25F, -0.5F, 8, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(8.2219F, -8.7647F, -26.6468F);
		body.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.6981F, -0.4363F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 130, 85, -4.0F, -0.25F, -0.5F, 8, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(8.4445F, -7.7029F, -25.941F);
		body.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, -0.4363F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 120, 104, -4.5F, -1.0002F, -1.25F, 8, 2, 3, -0.01F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, -6.3118F, -29.0768F);
		body.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.2182F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 76, 78, -4.0F, -1.5F, -1.0F, 8, 3, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, -7.9311F, -29.0241F);
		body.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.8727F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 130, 83, -4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 118, 7, -5.0F, -1.5F, -0.5F, 10, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-4.1872F, -2.7642F, -29.0138F);
		body.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.1201F, 0.4205F, -0.2875F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 22, -0.5F, -2.0F, -1.0F, 1, 4, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(4.1872F, -2.7642F, -29.0138F);
		body.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.1201F, -0.4205F, 0.2875F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 64, 97, -0.5F, -2.0F, -1.0F, 1, 4, 2, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(3.25F, -2.7029F, -29.4522F);
		body.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.4363F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 130, 133, -1.0F, -2.0F, -1.0F, 2, 4, 2, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-3.25F, -2.7029F, -29.4522F);
		body.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.4363F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 134, -1.0F, -2.0F, -1.0F, 2, 4, 2, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(3.519F, 1.5125F, -29.2429F);
		body.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.2823F, -0.3786F, -0.1068F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 52, 87, -1.0F, -2.5F, -0.5F, 2, 6, 1, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-3.519F, 1.5125F, -29.2429F);
		body.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.2823F, 0.3786F, 0.1068F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 91, 19, -1.0F, -2.5F, -0.5F, 2, 6, 1, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-5.5F, -0.6209F, -29.4743F);
		body.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.2618F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 51, 103, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 64, 103, 10.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 1.4878F, -29.1505F);
		body.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.2618F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 112, 39, -3.0F, -2.75F, -0.75F, 6, 1, 1, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 112, 41, -3.0F, 3.25F, -0.75F, 6, 1, 1, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 69, 132, -3.0F, -2.5F, -0.5F, 6, 6, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-6.8367F, -8.2776F, -23.6762F);
		body.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.4363F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 64, 99, -4.0F, -0.9985F, -3.5F, 8, 2, 7, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(6.8367F, -8.2776F, -23.6762F);
		body.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, -0.4363F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 107, 80, -4.0F, -0.9985F, -3.5F, 8, 2, 7, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-12.9404F, -7.907F, -21.5929F);
		body.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.0503F, -0.1209F, 0.3957F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 124, 120, -0.5F, -0.925F, -3.5F, 2, 2, 7, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-11.5603F, -7.7029F, -21.4112F);
		body.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, -0.1309F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 36, 98, -1.5F, -1.25F, -3.5F, 4, 2, 7, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(12.9404F, -7.907F, -21.5929F);
		body.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.0503F, 0.1209F, -0.3957F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 125, -1.5F, -0.925F, -3.5F, 2, 2, 7, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(11.5603F, -7.7029F, -21.4112F);
		body.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.1309F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 109, 25, -2.5F, -1.25F, -3.5F, 4, 2, 7, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-7.8053F, -6.5032F, 5.1747F);
		body.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.8326F, -0.3923F, -0.0181F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 89, 46, -4.0F, -1.0F, -2.5F, 8, 2, 4, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(8.5146F, -7.345F, 6.8521F);
		body.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0472F, 0.3923F, 0.0181F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 107, 89, -4.25F, -0.9961F, -1.5F, 8, 2, 6, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(9.7446F, -4.0337F, 16.4408F);
		body.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.0174F, 0.3513F, -0.1699F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 128, 129, -4.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-9.7446F, -4.0337F, 16.4408F);
		body.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.0174F, -0.3513F, 0.1699F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 130, 77, -3.0F, -1.0F, -1.0F, 7, 2, 2, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-13.6642F, -6.228F, 14.9171F);
		body.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.0174F, -0.3513F, 0.1699F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 91, 4, -0.5F, -2.5F, -1.0F, 2, 5, 2, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(13.6642F, -6.228F, 14.9171F);
		body.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.0174F, 0.3513F, -0.1699F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 103, 16, -1.5F, -2.5F, -1.0F, 2, 5, 2, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(8.8263F, -5.79F, 16.8733F);
		body.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.0174F, 0.3513F, -0.1699F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 130, 47, -4.0F, -1.75F, -0.5F, 8, 3, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-8.8263F, -5.79F, 16.8733F);
		body.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.0174F, -0.3513F, 0.1699F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 51, 130, -4.0F, -1.75F, -0.5F, 8, 3, 1, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-9.1915F, -6.7189F, 17.1055F);
		body.addChild(cube_r53);
		setRotationAngle(cube_r53, -0.259F, -0.3487F, -0.0159F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 56, -3.5F, -1.25F, -0.425F, 7, 2, 1, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(9.1915F, -6.7189F, 17.1055F);
		body.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.259F, 0.3487F, 0.0159F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 131, 71, -3.5F, -1.25F, -0.425F, 7, 2, 1, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(6.8174F, -7.6138F, 12.7322F);
		body.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0464F, 0.3487F, 0.0159F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 28, 75, -5.0F, -0.9973F, -4.5F, 10, 2, 10, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-6.8174F, -7.6138F, 12.7322F);
		body.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0464F, -0.3487F, -0.0159F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 67, 66, -5.0F, -0.9973F, -4.5F, 10, 2, 10, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-8.5146F, -7.345F, 6.8521F);
		body.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0472F, -0.3923F, -0.0181F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 109, 69, -3.75F, -0.9961F, -1.5F, 8, 2, 6, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(7.8053F, -6.5032F, 5.1747F);
		body.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.8326F, 0.3923F, 0.0181F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 110, 48, -4.0F, -1.0F, -2.5F, 8, 2, 4, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.0F, -5.0762F, 2.9618F);
		body.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0436F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 64, 0, -11.0F, -0.5F, -1.5F, 22, 1, 3, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-4.5141F, -7.3991F, 8.0915F);
		body.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0436F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 48, 124, -0.5F, -0.999F, -1.0F, 1, 2, 2, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 125, 8.5282F, -0.999F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(4.7466F, -4.3579F, 17.7575F);
		body.addChild(cube_r61);
		setRotationAngle(cube_r61, -0.0554F, 0.3753F, -0.3719F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 0, -0.45F, -2.75F, -1.5F, 2, 5, 3, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-4.7466F, -4.3579F, 17.7575F);
		body.addChild(cube_r62);
		setRotationAngle(cube_r62, -0.0554F, -0.3753F, 0.3719F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 58, 75, -1.55F, -2.75F, -1.5F, 2, 5, 3, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-3.8549F, -4.9513F, 19.233F);
		body.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.043F, 0.0076F, -0.1744F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 31, 12, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(3.8549F, -4.9513F, 19.233F);
		body.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.043F, -0.0076F, 0.1744F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 25, 66, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, -3.8958F, 19.2791F);
		body.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.3491F, 0.0F, 0.0F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 8, -2.0F, -0.5F, -0.75F, 4, 1, 1, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.0F, -7.6739F, 14.1093F);
		body.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0436F, 0.0F, 0.0F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 103, 14, -3.0F, 5.0F, -4.5F, 6, 2, 9, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 81, -4.0F, 4.0F, -4.5F, 8, 1, 10, 0.01F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 26, 87, -4.0F, -1.0F, -4.5F, 8, 1, 10, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-0.25F, -0.1987F, 12.7188F);
		body.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.3491F, 0.0F, 0.0F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 0, 12, -2.25F, -3.5F, -1.5F, 5, 7, 3, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.0F, -6.893F, 19.1482F);
		body.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0436F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 92, 14, -4.0F, -0.5F, -0.75F, 8, 1, 1, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(12.5F, -7.5431F, 10.8622F);
		body.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0436F, 0.0F, 0.0F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 84, 16, -1.5F, -1.0F, -8.5F, 3, 2, 13, 0.01F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 73, 84, -26.5F, -1.0F, -8.5F, 3, 2, 13, 0.01F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(10.2822F, -9.8995F, 7.5196F);
		body.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0438F, -0.0872F, -0.0038F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 71, 30, -3.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(10.75F, -9.7572F, 4.2593F);
		body.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0436F, 0.0F, 0.0F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 14, 112, -2.5F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 14, 114, -24.0F, -0.5F, -0.5F, 5, 1, 1, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(7.75F, -9.8226F, 5.7579F);
		body.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0436F, 0.0F, 0.0F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 51, 98, -0.5F, -0.4985F, -2.0F, 1, 1, 4, 0.0F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 87, 108, -16.0F, -0.4985F, -2.0F, 1, 1, 4, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-10.2822F, -9.8995F, 7.5196F);
		body.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0438F, 0.0872F, 0.0038F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 36, 107, -3.0F, -0.5F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(8.1348F, -8.9206F, 8.8414F);
		body.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0472F, -0.3923F, -0.0181F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 6, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-8.1348F, -8.9206F, 8.8414F);
		body.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0472F, 0.3923F, 0.0181F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 33, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(6.2213F, -10.1568F, 13.4113F);
		body.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0472F, -0.3923F, -0.0181F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 94, 66, -0.5F, -0.4643F, -6.5F, 1, 1, 13, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(13.75F, -9.9971F, 9.7541F);
		body.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0436F, 0.0F, 0.0F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 104, -0.5F, -0.5F, -6.0F, 1, 1, 12, 0.0F, false));
		cube_r77.cubeList.add(new ModelBox(cube_r77, 106, 98, -28.0F, -0.5F, -6.0F, 1, 1, 12, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(-6.2213F, -10.1568F, 13.4113F);
		body.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0472F, 0.3923F, 0.0181F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 21, 98, -0.5F, -0.4643F, -6.5F, 1, 1, 13, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(13.75F, -9.1308F, 3.9142F);
		body.addChild(cube_r79);
		setRotationAngle(cube_r79, -0.2956F, 0.0779F, 0.2502F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 89, 46, -0.75F, -0.75F, -0.25F, 1, 2, 1, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-13.75F, -9.1308F, 3.9142F);
		body.addChild(cube_r80);
		setRotationAngle(cube_r80, -0.2956F, -0.0779F, -0.2502F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 92, 87, -0.25F, -0.75F, -0.25F, 1, 2, 1, 0.0F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-3.4974F, -3.7871F, -13.5425F);
		body.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0485F, 0.0594F, 0.2078F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 75, 108, -1.5F, -5.5F, 0.0F, 3, 14, 6, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-3.383F, -1.314F, -5.1313F);
		body.addChild(cube_r82);
		setRotationAngle(cube_r82, -0.4307F, 0.0198F, 0.2261F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 94, 88, -1.5F, -5.5F, -5.5F, 1, 11, 11, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-2.7864F, -7.646F, -15.2317F);
		body.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0485F, 0.0594F, 0.2078F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 0, 104, -1.5F, -1.5F, -1.5F, 3, 4, 3, 0.01F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(1.4194F, -6.7204F, -17.8606F);
		body.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0647F, 0.7249F, -0.162F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 122, 133, -0.5F, -2.0F, 1.0F, 2, 4, 2, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-1.4194F, -6.7204F, -17.8606F);
		body.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0647F, -0.7249F, 0.162F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 8, 134, -1.5F, -2.0F, 1.0F, 2, 4, 2, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(2.9901F, -7.1042F, -16.7031F);
		body.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0485F, -0.0594F, -0.2078F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 110, 133, -1.5F, -2.0F, 0.0F, 3, 4, 3, 0.01F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(3.4974F, -3.7871F, -13.5425F);
		body.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0485F, -0.0594F, -0.2078F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 93, 110, -1.5F, -5.5F, 0.0F, 3, 14, 6, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(3.383F, -1.314F, -5.1313F);
		body.addChild(cube_r88);
		setRotationAngle(cube_r88, -0.4307F, -0.0198F, -0.2261F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 51, 97, 0.5F, -5.5F, -5.5F, 1, 11, 11, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, -5.7641F, 5.7252F);
		body.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0436F, 0.0F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 42, -4.0F, -2.0F, -4.0F, 8, 5, 17, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, -5.5024F, -0.2691F);
		body.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0436F, 0.0F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 117, -3.0F, -2.0F, -2.0F, 6, 4, 4, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-2.9217F, -5.513F, -0.0264F);
		body.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0457F, -0.3051F, -0.0138F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 0, 81, -0.5F, -1.9881F, -2.0F, 1, 4, 4, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(2.9217F, -5.513F, -0.0264F);
		body.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0457F, 0.3051F, 0.0138F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 88, 34, -0.5F, -1.9881F, -2.0F, 1, 4, 4, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, -7.7959F, -4.1815F);
		body.addChild(cube_r93);
		setRotationAngle(cube_r93, -0.3491F, 0.0F, 0.0F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 109, 58, -3.0F, -0.5F, -4.0F, 6, 3, 8, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.0F, -5.1811F, -15.7017F);
		body.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0436F, 0.0F, 0.0F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 64, -3.0F, -4.5F, -5.0F, 6, 4, 13, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-4.2988F, -9.3817F, 19.1485F);
		body.addChild(bone3);
		

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(4.2988F, -1.0079F, 0.097F);
		bone3.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0436F, 0.0F, 0.0F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 131, 32, -4.0F, -0.5F, -2.5F, 8, 1, 1, 0.0F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 131, 69, -4.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(1.4623F, -2.6837F, 0.0238F);
		bone3.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0426F, -0.0094F, 0.218F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 81, -0.5F, -1.5F, -0.5041F, 1, 3, 1, 0.0F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(7.1353F, -2.6837F, 0.0238F);
		bone3.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0426F, 0.0094F, -0.218F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 6, 81, -0.5F, -1.5F, -0.5041F, 1, 3, 1, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(4.2988F, -4.0051F, -0.0339F);
		bone3.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0436F, 0.0F, 0.0F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 36, 109, -3.0F, -0.25F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(8.5495F, -0.1952F, -0.141F);
		bone3.addChild(cube_r99);
		setRotationAngle(cube_r99, -0.3026F, 0.3487F, 0.0159F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 51, 98, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r99.cubeList.add(new ModelBox(cube_r99, 94, 34, 9.25F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.0482F, -0.1952F, -0.141F);
		bone3.addChild(cube_r100);
		setRotationAngle(cube_r100, -0.3026F, -0.3487F, -0.0159F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 57, 98, -10.25F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r100.cubeList.add(new ModelBox(cube_r100, 58, 103, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(12.8812F, -0.8428F, -3.6212F);
		bone3.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0464F, 0.3487F, 0.0159F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 109, 46, -5.0F, -0.5F, -0.5F, 10, 1, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-4.2835F, -0.8428F, -3.6212F);
		bone3.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0464F, -0.3487F, -0.0159F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 109, 77, -5.0F, -0.5F, -0.5F, 10, 1, 1, 0.0F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(12.8263F, -0.9319F, -1.5812F);
		bone3.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0464F, 0.3487F, 0.0159F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 48, 29, -5.0F, -0.5F, -0.5F, 11, 1, 1, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-4.2286F, -0.9319F, -1.5812F);
		bone3.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0464F, -0.3487F, -0.0159F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 25, 64, -6.0F, -0.5F, -0.5F, 11, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-6.2411F, -6.131F, -28.7655F);
		body.addChild(bone2);
		setRotationAngle(bone2, 0.1744F, 0.0076F, -0.043F);
		

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(2.649F, -0.1605F, -0.9899F);
		bone2.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.3185F, 0.3035F, 0.8345F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 24, 92, -2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(1.6112F, -0.0026F, -0.506F);
		bone2.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.1481F, 0.4323F, 0.1443F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 8, 71, -0.325F, -1.25F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-2.2077F, -0.5574F, 1.2748F);
		bone2.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.1481F, 0.4323F, 0.1443F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 110, 129, -4.075F, -1.25F, -0.5F, 8, 3, 1, 0.0F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(1.9259F, 1.3346F, -1.2044F);
		bone2.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.1636F, 0.3747F, 0.5672F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 52, 94, -0.375F, -1.4F, -0.7419F, 2, 2, 1, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(-5.8662F, -0.3251F, 2.4291F);
		bone2.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.2291F, -0.0175F, -0.5195F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 88, 34, -0.6F, -1.0F, -0.55F, 1, 2, 1, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-3.5675F, 0.7633F, 1.1529F);
		bone2.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.2921F, 0.4253F, 0.2399F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 103, 25, -2.6F, -0.4F, -0.5F, 5, 1, 1, 0.0F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.939F, 1.7025F, -0.7446F);
		bone2.addChild(cube_r111);
		setRotationAngle(cube_r111, -0.3319F, 0.4323F, 0.1443F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 103, 27, -2.6F, -0.4F, -0.7F, 5, 1, 1, 0.0F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-6.3269F, -1.186F, 2.8412F);
		bone2.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.0164F, -0.0693F, 0.5481F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 75, 108, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-1.9633F, -1.7788F, 1.1608F);
		bone2.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.0406F, 0.4346F, 0.0962F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 124, 115, -4.0F, -0.5F, -1.0F, 8, 1, 2, 0.01F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(6.2411F, -6.131F, -28.7655F);
		body.addChild(bone4);
		setRotationAngle(bone4, 0.1744F, -0.0076F, 0.043F);
		

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-2.649F, -0.1605F, -0.9899F);
		bone4.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.3185F, -0.3035F, -0.8345F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 26, 81, -2.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(-1.6112F, -0.0026F, -0.506F);
		bone4.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.1481F, -0.4323F, -0.1443F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 32, 66, -0.675F, -1.25F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(2.2077F, -0.5574F, 1.2748F);
		bone4.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.1481F, -0.4323F, -0.1443F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 32, 112, -3.925F, -1.25F, -0.5F, 8, 3, 1, 0.0F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-1.9259F, 1.3346F, -1.2044F);
		bone4.addChild(cube_r117);
		setRotationAngle(cube_r117, -0.1636F, -0.3747F, -0.5672F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 91, 26, -1.625F, -1.4F, -0.7419F, 2, 2, 1, 0.0F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(5.8662F, -0.3251F, 2.4291F);
		bone4.addChild(cube_r118);
		setRotationAngle(cube_r118, -0.2291F, 0.0175F, 0.5195F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 13, 12, -0.4F, -1.0F, -0.55F, 1, 2, 1, 0.0F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(3.5675F, 0.7633F, 1.1529F);
		bone4.addChild(cube_r119);
		setRotationAngle(cube_r119, -0.2921F, -0.4253F, -0.2399F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 25, 75, -2.4F, -0.4F, -0.5F, 5, 1, 1, 0.0F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(-0.939F, 1.7025F, -0.7446F);
		bone4.addChild(cube_r120);
		setRotationAngle(cube_r120, -0.3319F, -0.4323F, -0.1443F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 24, 95, -2.4F, -0.4F, -0.7F, 5, 1, 1, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(6.3269F, -1.186F, 2.8412F);
		bone4.addChild(cube_r121);
		setRotationAngle(cube_r121, -0.0164F, 0.0693F, -0.5481F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 107, 89, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(1.9633F, -1.7788F, 1.1608F);
		bone4.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0406F, -0.4346F, -0.0962F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 88, 31, -4.0F, -0.5F, -1.0F, 8, 1, 2, 0.01F, false));

		steering_thing = new QRenderer(this);
		steering_thing.setRotationPoint(0.0F, 0.2141F, 6.5824F);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(-3.429F, -4.2801F, 2.7897F);
		steering_thing.addChild(cube_r123);
		setRotationAngle(cube_r123, -0.525F, 0.1194F, -0.634F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 36, 98, -0.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(0.7325F, -3.8798F, -2.634F);
		steering_thing.addChild(cube_r124);
		setRotationAngle(cube_r124, -0.3927F, -0.345F, 0.1128F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 108, 80, -1.0F, -1.5F, -0.5F, 2, 3, 1, 0.0F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-0.7325F, -3.8798F, -2.634F);
		steering_thing.addChild(cube_r125);
		setRotationAngle(cube_r125, -0.3927F, 0.345F, -0.1128F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 109, 69, -1.0F, -1.5F, -0.5F, 2, 3, 1, 0.0F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(1.1945F, -2.3381F, -3.3492F);
		steering_thing.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.0472F, -0.3923F, -0.0181F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 58, 83, -1.5F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(-0.6997F, -2.4482F, -0.8506F);
		steering_thing.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.0472F, 0.3923F, 0.0181F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 0, 89, -1.0F, -0.5F, -3.0F, 3, 1, 1, 0.0F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(0.0F, -0.0689F, 2.2189F);
		steering_thing.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.0436F, 0.0F, 0.0F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 8, 22, -1.0F, -2.1F, -2.0F, 2, 4, 2, 0.0F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(3.429F, -4.2801F, 2.7897F);
		steering_thing.addChild(cube_r129);
		setRotationAngle(cube_r129, -0.525F, -0.1194F, 0.634F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 8, 64, -0.5F, -3.0F, -0.5F, 1, 6, 1, 0.0F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(-0.6997F, -5.6191F, -0.3033F);
		steering_thing.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.1886F, 0.3864F, 0.0718F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 24, 98, -1.0F, -0.496F, -3.0F, 3, 1, 2, 0.0F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(9.7771F, -6.0777F, 3.5486F);
		steering_thing.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.2977F, -0.0036F, 0.0898F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 33, 57, -3.0F, -0.25F, -0.5F, 6, 1, 1, 0.0F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(6.592F, -6.3795F, 4.4225F);
		steering_thing.addChild(cube_r132);
		setRotationAngle(cube_r132, 1.3494F, -0.1704F, 0.0381F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 129, 93, -2.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));
		cube_r132.cubeList.add(new ModelBox(cube_r132, 114, 0, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-6.592F, -6.3795F, 4.4225F);
		steering_thing.addChild(cube_r133);
		setRotationAngle(cube_r133, 1.3494F, 0.1704F, -0.0381F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 22, 132, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));
		cube_r133.cubeList.add(new ModelBox(cube_r133, 130, 54, -6.0F, -0.5F, -0.5F, 8, 1, 1, 0.0F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(0.0F, -5.6111F, -0.3394F);
		steering_thing.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.1745F, 0.0F, 0.0F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 124, 17, -2.0F, -0.5F, -2.0F, 4, 1, 5, 0.0F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(0.0F, -4.0746F, 2.7842F);
		steering_thing.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.2182F, 0.0F, 0.0F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 76, 83, -2.0F, -2.5F, -0.5F, 4, 4, 1, 0.0F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(2.2167F, -3.8928F, -2.2393F);
		steering_thing.addChild(cube_r136);
		setRotationAngle(cube_r136, -0.2185F, -0.0057F, 0.1308F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 87, 99, -0.5007F, -2.0F, -0.5F, 1, 3, 2, 0.0F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-2.2167F, -3.8928F, -2.2393F);
		steering_thing.addChild(cube_r137);
		setRotationAngle(cube_r137, -0.2185F, 0.0057F, -0.1308F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 99, 87, -0.4993F, -2.0F, -0.5F, 1, 3, 2, 0.0F, false));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-2.5174F, -4.3821F, 0.5163F);
		steering_thing.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.1742F, 0.0057F, -0.1308F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 25, 66, -0.25F, -2.0F, -2.5F, 1, 4, 5, 0.01F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(-1.8234F, -2.8694F, -0.2012F);
		steering_thing.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.1734F, -0.017F, -0.0018F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 0, 22, -1.0F, -0.5F, -3.0F, 1, 1, 6, 0.0F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(1.8234F, -2.8694F, -0.2012F);
		steering_thing.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.1734F, 0.017F, 0.0018F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 25, 131, 0.0F, -0.5F, -3.0F, 1, 1, 6, 0.0F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(2.5174F, -4.3821F, 0.5163F);
		steering_thing.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.1742F, -0.0057F, 0.1308F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 92, 87, -0.75F, -2.0F, -2.5F, 1, 4, 5, 0.01F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(0.0F, -2.4793F, 0.1118F);
		steering_thing.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0436F, 0.0F, 0.0F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 74, 4, -2.5F, -0.5F, -3.5F, 5, 1, 7, 0.0F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(0.6997F, -5.6191F, -0.3033F);
		steering_thing.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.1886F, -0.3864F, -0.0718F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 26, 87, -2.0F, -0.497F, -3.0F, 3, 1, 2, 0.0F, false));

		wheel_small = new QRenderer(this);
		wheel_small.setRotationPoint(11.0F, 16.5308F, 0.0F);
		wheel_small.cubeList.add(new ModelBox(wheel_small, 32, 124, -3.0F, 4.4692F, -2.0F, 6, 3, 4, 0.01F, false));
		wheel_small.cubeList.add(new ModelBox(wheel_small, 58, 78, -2.0F, -4.5308F, -5.0F, 4, 9, 10, 0.0F, false));
		wheel_small.cubeList.add(new ModelBox(wheel_small, 120, 97, -3.0F, -7.459F, -2.0F, 6, 3, 4, 0.01F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(-1.0F, -6.9949F, -1.0359F);
		wheel_small.addChild(cube_r144);
		setRotationAngle(cube_r144, -1.5708F, 0.0F, 0.0F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 92, 80, -2.0F, -8.5F, 5.0F, 6, 3, 4, 0.01F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-1.0F, 4.3042F, 2.4821F);
		wheel_small.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.5236F, 0.0F, 0.0F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 14, 104, -2.0F, -0.5F, -2.0F, 6, 3, 4, -0.01F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(-1.0F, 2.4872F, 4.299F);
		wheel_small.addChild(cube_r146);
		setRotationAngle(cube_r146, 1.0472F, 0.0F, 0.0F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 35, 117, -2.0F, -0.5F, -2.0F, 6, 3, 4, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-1.0F, -4.2939F, 2.4821F);
		wheel_small.addChild(cube_r147);
		setRotationAngle(cube_r147, -0.5236F, 0.0F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 118, 0, -2.0F, -2.5F, -2.0F, 6, 3, 4, -0.01F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(-1.0F, -2.4769F, 4.299F);
		wheel_small.addChild(cube_r148);
		setRotationAngle(cube_r148, -1.0472F, 0.0F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 55, 119, -2.0F, -2.5F, -2.0F, 6, 3, 4, 0.0F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-1.0F, 7.0051F, 1.0359F);
		wheel_small.addChild(cube_r149);
		setRotationAngle(cube_r149, -1.5708F, 0.0F, 0.0F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 111, 120, -2.0F, 5.5F, -9.0F, 6, 3, 4, 0.01F, false));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(-1.0F, -4.2939F, -2.4821F);
		wheel_small.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.5236F, 0.0F, 0.0F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 16, 121, -2.0F, -2.5F, -2.0F, 6, 3, 4, -0.01F, false));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(-1.0F, -2.4769F, -4.299F);
		wheel_small.addChild(cube_r151);
		setRotationAngle(cube_r151, 1.0472F, 0.0F, 0.0F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 122, 39, -2.0F, -2.5F, -2.0F, 6, 3, 4, 0.0F, false));

		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(-1.0F, 4.3042F, -2.4821F);
		wheel_small.addChild(cube_r152);
		setRotationAngle(cube_r152, -0.5236F, 0.0F, 0.0F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 124, 10, -2.0F, -0.5F, -2.0F, 6, 3, 4, -0.01F, false));

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(-1.0F, 2.4872F, -4.299F);
		wheel_small.addChild(cube_r153);
		setRotationAngle(cube_r153, -1.0472F, 0.0F, 0.0F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 124, 25, -2.0F, -0.5F, -2.0F, 6, 3, 4, 0.0F, false));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.0F, -0.0308F, 0.0F);
		wheel_small.addChild(cube_r154);
		setRotationAngle(cube_r154, 0.7854F, 0.0F, 0.0F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 33, 53, -3.0F, -1.0F, -1.0F, 6, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		body.render(f5);
//		steering_thing.render(f5);
		wheel_small.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
