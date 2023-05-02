package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACOG extends ModelBase {
	private final QRenderer bone;
	private final ModelRenderer scope;
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
	private final ModelRenderer bone18;
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
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer bone10;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer stand;
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
	private final ModelRenderer cube_r144;
	private final ModelRenderer cube_r145;
	private final ModelRenderer cube_r146;
	private final ModelRenderer cube_r147;
	private final ModelRenderer cube_r148;
	private final ModelRenderer cube_r149;
	private final ModelRenderer cube_r150;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r151;
	private final ModelRenderer cube_r152;
	private final ModelRenderer cube_r153;
	private final ModelRenderer cube_r154;
	private final ModelRenderer cube_r155;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r156;
	private final ModelRenderer cube_r157;
	private final ModelRenderer cube_r158;
	private final ModelRenderer cube_r159;
	private final ModelRenderer cube_r160;

	public ACOG() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new QRenderer(this);
		bone.setRotationPoint(0.0F, 23.75F, -1.0F);
		

		scope = new ModelRenderer(this);
		scope.setRotationPoint(1.0607F, -25.5964F, -10.25F);
		bone.addChild(scope);
		scope.cubeList.add(new ModelBox(scope, 24, 26, 0.9393F, -4.8546F, -3.2F, 2, 1, 1, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 0, 9, 0.4393F, -4.8536F, -2.5F, 3, 1, 4, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 38, 9, -1.0507F, -3.3536F, -0.5F, 6, 3, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 16, 22, 0.4393F, 0.1464F, -1.5F, 3, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.9393F, -1.9036F, -1.25F);
		scope.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.2182F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 46, -2.0F, -2.5F, -0.5F, 4, 5, 0, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.3091F, -4.7036F, 3.0596F);
		scope.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1222F, -0.1134F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 32, 16, -0.5F, -0.5F, -6.0F, 1, 1, 13, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.4607F, -1.9172F, 10.1465F);
		scope.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.48F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 28, 4, -1.0F, -1.0F, -1.0F, 2, 2, 2, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(4.8393F, -2.3036F, 10.35F);
		scope.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 31, -1.5F, -0.6F, -1.0F, 2, 2, 2, -0.25F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(3.9076F, -1.3536F, 4.3365F);
		scope.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, -0.0698F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 15, -0.5F, -2.0F, -1.0F, 1, 3, 6, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.0289F, -1.3536F, 4.3365F);
		scope.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0698F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -0.5F, -2.0F, -1.0F, 1, 3, 6, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.4393F, -0.0697F, 5.9304F);
		scope.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0698F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 20, -2.0F, -0.4838F, -3.5F, 3, 1, 7, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.4393F, -3.6374F, 5.9304F);
		scope.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0698F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 46, -2.0F, -0.5162F, -3.5F, 3, 1, 7, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.9076F, -1.3536F, 13.1365F);
		scope.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.0698F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 31, -0.5F, -2.0F, 4.0F, 1, 3, 1, -0.1F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(2.4393F, 0.0303F, 14.6304F);
		scope.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0698F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 43, -2.0F, -0.4838F, 2.5F, 3, 1, 1, -0.1F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.0289F, -1.3536F, 13.1365F);
		scope.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0698F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 24, -0.5F, -2.0F, 4.0F, 1, 3, 1, -0.1F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.4393F, -3.7374F, 14.6304F);
		scope.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0698F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 32, 43, -2.0F, -0.5162F, 2.5F, 3, 1, 1, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.2076F, -1.8536F, 2.3365F);
		scope.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, -0.2618F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 8, 15, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.3289F, -1.8536F, 2.3365F);
		scope.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.2618F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 15, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(1.9393F, -4.1118F, 2.3365F);
		scope.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.2618F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 16, 26, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.9393F, 0.4047F, 2.3365F);
		scope.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 22, 11, -1.5F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(3.8787F, 0.0F, 0.0F);
		scope.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 34, 47, -1.0F, -0.4976F, -1.49F, 2, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(3.7929F, 0.0858F, 0.0F);
		scope.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 24, 51, -1.0F, -0.5093F, -1.48F, 1, 1, 3, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.7574F, -2.2929F, 0.0F);
		scope.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 47, 20, 2.001F, -0.5F, -0.49F, 1, 2, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(3.701F, -3.3536F, 4.3221F);
		scope.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0494F, -0.0493F, -0.7866F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 16, 38, -0.5F, -0.5F, -1.2F, 1, 1, 4, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.4323F, -3.3508F, 7.4111F);
		scope.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0553F, -0.0493F, -0.7866F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 36, -0.5F, -0.5F, -4.2F, 1, 1, 4, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(3.4218F, -3.3157F, 8.1803F);
		scope.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.012F, -0.0464F, -0.7343F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 46, 35, -0.5F, -0.5F, -1.8F, 1, 1, 3, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(3.4218F, -0.3914F, 8.1803F);
		scope.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.012F, -0.0464F, 0.7343F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 6, 36, -0.5F, -0.5F, -1.8F, 1, 1, 3, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(3.701F, -0.3536F, 4.3221F);
		scope.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.0494F, -0.0493F, 0.7866F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 32, 16, -0.5F, -0.5F, -1.2F, 1, 1, 4, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(3.4323F, -0.3563F, 7.4111F);
		scope.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0553F, -0.0493F, 0.7866F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 32, 21, -0.5F, -0.5F, -4.2F, 1, 1, 4, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.1777F, -3.3536F, 4.3221F);
		scope.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0494F, 0.0493F, 0.7866F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 16, 33, -0.5F, -0.5F, -1.2F, 1, 1, 4, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.4463F, -3.3508F, 7.4111F);
		scope.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.0553F, 0.0493F, 0.7866F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 32, 33, -0.5F, -0.5F, -4.2F, 1, 1, 4, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.4568F, -3.3157F, 8.1803F);
		scope.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.012F, 0.0464F, 0.7343F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 22, 38, -0.5F, -0.5F, -1.8F, 1, 1, 3, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.1777F, -0.3536F, 4.3221F);
		scope.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.0494F, 0.0493F, -0.7866F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 24, -0.5F, -0.5F, -1.2F, 1, 1, 4, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.4568F, -0.3914F, 8.1803F);
		scope.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.012F, 0.0464F, -0.7343F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 22, 33, -0.5F, -0.5F, -1.8F, 1, 1, 3, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(3.4218F, -3.3157F, 16.8803F);
		scope.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.012F, -0.0464F, -0.7343F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 67, -0.5F, -0.5F, 0.2F, 1, 1, 1, -0.1F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(3.4218F, -0.3914F, 16.8803F);
		scope.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.012F, -0.0464F, 0.7343F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 25, 67, -0.5F, -0.5F, 0.2F, 1, 1, 1, -0.1F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.4568F, -0.3914F, 16.8803F);
		scope.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.012F, 0.0464F, -0.7343F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 67, 26, -0.5F, -0.5F, 0.2F, 1, 1, 1, -0.1F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.4568F, -3.3157F, 16.8803F);
		scope.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.012F, 0.0464F, 0.7343F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 67, 28, -0.5F, -0.5F, 0.2F, 1, 1, 1, -0.1F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.4463F, -0.3563F, 7.4111F);
		scope.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0553F, 0.0493F, -0.7866F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 0, 31, -0.5F, -0.5F, -4.2F, 1, 1, 4, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(4.0003F, -3.3657F, 2.274F);
		scope.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.2101F, -0.1739F, -0.8127F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 30, 62, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(3.4488F, -4.0542F, 1.587F);
		scope.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.2101F, -0.1739F, -0.8127F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 67, 32, -0.5015F, 0.3F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(3.441F, -3.9051F, 2.2748F);
		scope.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.1904F, -0.1932F, -0.7729F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 61, 12, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(3.441F, 0.1979F, 2.2748F);
		scope.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.1904F, -0.1932F, 0.7729F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 60, 21, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(4.0003F, -0.3414F, 2.274F);
		scope.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.2101F, -0.1739F, 0.8127F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 60, 24, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(3.4488F, 0.3471F, 1.587F);
		scope.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.2101F, -0.1739F, 0.8127F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 67, 5, -0.5015F, -1.3F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.4377F, 0.1979F, 2.2748F);
		scope.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.1904F, 0.1932F, -0.7729F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 10, 60, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.1216F, -0.3414F, 2.274F);
		scope.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.2101F, 0.1739F, -0.8127F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 60, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.4299F, 0.3471F, 1.587F);
		scope.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.2101F, 0.1739F, -0.8127F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 29, 67, -0.4985F, -1.3F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.4377F, -3.9051F, 2.2748F);
		scope.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.1904F, 0.1932F, 0.7729F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 60, 46, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.4299F, -4.0542F, 1.587F);
		scope.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.2101F, 0.1739F, 0.8127F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 67, 30, -0.4985F, 0.3F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-0.1216F, -3.3657F, 2.274F);
		scope.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.2101F, 0.1739F, 0.8127F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 60, 49, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(1.6716F, -2.3787F, 0.0F);
		scope.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.7854F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 64, 1.9968F, -0.5F, -0.48F, 1, 1, 2, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(2.2071F, -2.3787F, 0.0F);
		scope.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.7854F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 36, 62, -2.9968F, -0.5F, -0.48F, 1, 1, 2, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(2.1213F, -2.2929F, 0.0F);
		scope.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.7854F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 38, 38, -3.001F, -0.5F, -0.49F, 1, 2, 2, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0858F, 0.0858F, 0.0F);
		scope.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 0.7854F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 24, 47, 0.0F, -0.5093F, -1.48F, 1, 1, 3, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.0F, 0.0F, 0.0F);
		scope.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.7854F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 41, -1.0F, -0.4976F, -1.49F, 2, 1, 3, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(1.1521F, -5.192F, -1.9042F);
		scope.addChild(cube_r53);
		setRotationAngle(cube_r53, 1.3663F, -0.1038F, -0.1316F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 38, 33, -0.4946F, -1.1085F, -1.3816F, 1, 2, 2, -0.1F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(1.1521F, -5.192F, -1.9042F);
		scope.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.1608F, -0.1038F, -0.1316F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 32, 33, -0.495F, -0.6594F, -0.7556F, 1, 1, 12, -0.1F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(2.5543F, -5.192F, -1.7568F);
		scope.addChild(cube_r55);
		setRotationAngle(cube_r55, 1.3389F, -0.1038F, 0.1316F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 8, 40, -0.495F, -1.2059F, -1.4018F, 1, 2, 2, -0.1F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(2.5543F, -5.192F, -1.7568F);
		scope.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.1883F, -0.1038F, 0.1316F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 46, 30, -0.505F, -0.6594F, -0.7556F, 1, 1, 9, -0.1F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(2.6439F, -3.9706F, 5.4541F);
		scope.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.172F, -0.0414F, -0.0131F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 36, 59, -1.1023F, -0.5934F, -1.0925F, 1, 1, 2, -0.1F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(1.6716F, -2.3787F, 9.75F);
		scope.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 0, 46, -1.2322F, 1.9251F, -0.5F, 3, 1, 8, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 47, 9, 1.6778F, -0.9749F, -0.5F, 1, 3, 8, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 38, 0, -1.2322F, -1.8749F, -0.5F, 3, 1, 8, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 38, 16, -0.2322F, -3.6739F, -1.1F, 1, 2, 2, 0.1F, false));
		bone18.cubeList.add(new ModelBox(bone18, 34, 62, -0.2322F, -3.3749F, -1.3F, 1, 1, 1, 0.1F, false));
		bone18.cubeList.add(new ModelBox(bone18, 61, 33, -0.2322F, -3.3749F, 0.1F, 1, 1, 1, 0.1F, false));
		bone18.cubeList.add(new ModelBox(bone18, 37, 46, -2.1422F, -0.9749F, -0.5F, 1, 3, 8, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 22, 4, 1.8788F, 0.0251F, 8.101F, 1, 2, 1, -0.2F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 9, -2.3432F, -0.0249F, 8.101F, 1, 2, 1, -0.2F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.2678F, 2.6251F, 8.6F);
		bone18.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, 1.5708F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 16, 15, -0.49F, -1.5F, -0.499F, 1, 2, 1, -0.199F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-1.0322F, 2.9251F, 8.3F);
		bone18.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, 2.3562F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 10, 9, -0.8F, -0.2F, -0.199F, 1, 2, 1, -0.2F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(1.5678F, 2.9251F, 8.3F);
		bone18.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, -2.3562F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 10, 9, -0.2F, -0.2F, -0.199F, 1, 2, 1, -0.2F, true));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(1.5678F, -1.8749F, 8.3F);
		bone18.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 2.3562F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 10, 9, -0.2F, -1.8F, -0.199F, 1, 2, 1, -0.2F, true));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.0322F, -1.8749F, 8.3F);
		bone18.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, -2.3562F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 10, 9, -0.8F, -1.8F, -0.199F, 1, 2, 1, -0.2F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-0.7322F, 2.6251F, 8.6F);
		bone18.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -1.5708F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 10, 9, -0.49F, -0.5F, -0.499F, 1, 2, 1, -0.201F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-0.7322F, -1.5749F, 8.6F);
		bone18.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, -1.5708F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 10, 9, -0.49F, -0.5F, -0.499F, 1, 2, 1, -0.201F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(2.3678F, -0.4249F, 8.6F);
		bone18.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, -1.5708F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 10, 9, -1.49F, -0.5F, -0.499F, 2, 1, 1, -0.201F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-1.8322F, -0.4249F, 8.6F);
		bone18.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, -1.5708F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 10, 9, -1.49F, -0.5F, -0.499F, 2, 1, 1, -0.201F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.2678F, -1.5749F, 8.6F);
		bone18.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, 0.0F, -1.5708F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 10, 9, -0.49F, -0.5F, -0.499F, 1, 2, 1, -0.199F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-0.4322F, -1.6749F, 8.6F);
		bone18.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, -1.5708F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 34, 59, -0.5F, 0.2F, -0.51F, 1, 1, 1, -0.2F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(0.2678F, -2.6749F, -0.1F);
		bone18.addChild(cube_r69);
		setRotationAngle(cube_r69, -3.1416F, -1.1345F, 3.1416F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 24, 16, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.1F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.2678F, -2.6749F, -0.1F);
		bone18.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, -1.0036F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 30, 9, -0.5F, -1.001F, -1.0F, 1, 2, 2, 0.1F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.2678F, -2.8749F, -0.9F);
		bone18.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, -1.0036F, 0.0F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 24, 42, 0.2F, -0.5F, -0.4F, 1, 1, 2, 0.1F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 44, 60, 0.2F, -0.5F, -0.7F, 1, 1, 1, 0.1F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.2678F, -2.8749F, -0.9F);
		bone18.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 1.1345F, 0.0F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 61, 55, -1.3F, -0.5F, 0.5F, 1, 1, 1, 0.1F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 61, 58, -1.2F, -0.5F, -0.8F, 1, 1, 1, 0.1F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-1.518F, -1.6762F, 0.5823F);
		bone18.addChild(cube_r73);
		setRotationAngle(cube_r73, -0.1411F, -0.1883F, -0.5183F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 16, 16, -1.0F, -0.5F, -1.5F, 2, 2, 4, -0.1F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(-0.5715F, 2.8743F, 4.4218F);
		bone18.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.4625F, 0.0F, 0.1745F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 51, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-1.8645F, 2.8904F, 3.65F);
		bone18.addChild(cube_r75);
		setRotationAngle(cube_r75, -0.0109F, -0.0512F, 0.777F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 47, 50, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(-1.8645F, 2.8904F, 2.75F);
		bone18.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 0.5672F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 47, 24, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-2.8796F, 1.0344F, 2.75F);
		bone18.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, 1.5708F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 63, 15, -1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(-2.5038F, 1.7294F, 2.75F);
		bone18.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, 1.1345F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 38, 26, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(-1.1322F, 3.1751F, 2.75F);
		bone18.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, 0.1745F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 32, 26, -0.5F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(1.107F, 2.8743F, 4.4218F);
		bone18.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.4625F, 0.0F, -0.1745F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 52, 40, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(2.4F, 2.8904F, 3.65F);
		bone18.addChild(cube_r81);
		setRotationAngle(cube_r81, -0.0109F, 0.0512F, -0.777F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 57, 30, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(2.4F, 2.8904F, 2.75F);
		bone18.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.5672F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 20, 57, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(3.4151F, 1.0344F, 2.75F);
		bone18.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -1.5708F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 66, 11, 0.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.2558F, 0.5344F, 7.95F);
		bone18.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, -1.5708F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 38, 0, -0.5F, -3.0F, -1.5F, 1, 6, 2, -0.1F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(3.3509F, 1.0251F, 3.368F);
		bone18.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, -1.5708F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 41, 47, 0.0F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(2.9509F, 1.1251F, 3.368F);
		bone18.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, -1.5708F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 57, 14, 0.0F, -0.5F, -2.5F, 1, 1, 2, -0.1F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(3.0394F, 1.7294F, 2.75F);
		bone18.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, -1.1345F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 29, 47, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(1.6678F, 3.1751F, 2.75F);
		bone18.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.1745F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 34, 51, -1.5F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-0.5715F, -1.824F, 4.4218F);
		bone18.addChild(cube_r89);
		setRotationAngle(cube_r89, -0.4625F, 0.0F, -0.1745F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 57, 0, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-1.8645F, -1.8401F, 3.65F);
		bone18.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0109F, -0.0512F, -0.777F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 44, 57, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-1.8645F, -1.8401F, 2.75F);
		bone18.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.5672F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 57, 33, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(-2.5038F, -0.6606F, 2.75F);
		bone18.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -1.1345F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 14, 52, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-1.1322F, -2.1249F, 2.75F);
		bone18.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -0.1745F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 0, 55, -0.5F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(1.107F, -1.824F, 4.4218F);
		bone18.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.4625F, 0.0F, 0.1745F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 10, 57, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(2.4F, -1.8401F, 3.65F);
		bone18.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0109F, 0.0512F, 0.777F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 57, 58, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(2.4F, -1.8401F, 2.75F);
		bone18.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, 0.5672F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 48, 58, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(3.0394F, -0.6606F, 2.75F);
		bone18.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 1.1345F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 57, 37, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(1.6678F, -2.1249F, 2.75F);
		bone18.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, 0.1745F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 57, 4, -1.5F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.2678F, -2.4249F, 2.65F);
		bone18.addChild(cube_r99);
		setRotationAngle(cube_r99, -0.0175F, 0.0F, 0.0F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 58, 41, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.2678F, -1.6048F, 6.3884F);
		bone18.addChild(cube_r100);
		setRotationAngle(cube_r100, -0.0698F, 0.0F, 0.0F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 0, 58, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.2678F, -1.2002F, 7.7847F);
		bone18.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.0349F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 67, 3, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.2678F, -2.0542F, 4.3812F);
		bone18.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.4044F, 0.0F, 0.0F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 57, 55, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-1.4351F, -0.9749F, 0.5F);
		bone18.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.0F, 0.0F, 0.7854F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 47, 54, -0.5F, -0.5F, -1.01F, 1, 1, 8, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-1.2322F, -1.1678F, 0.5F);
		bone18.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.0F, 0.0F, 0.7854F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 0, 55, -0.51F, -0.5F, -0.99F, 1, 1, 8, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-1.4351F, 2.0251F, 0.5F);
		bone18.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, -0.7854F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 57, 1, -0.5F, -0.5F, -1.01F, 1, 1, 8, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-1.2322F, 2.218F, 0.5F);
		bone18.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, -0.7854F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 10, 57, -0.51F, -0.5F, -0.99F, 1, 1, 8, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(1.9707F, 2.0251F, 0.5F);
		bone18.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, 0.7854F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 57, 28, -0.5F, -0.5F, -1.01F, 1, 1, 8, 0.0F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(1.7678F, 2.218F, 0.5F);
		bone18.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, 0.7854F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 34, 57, -0.49F, -0.5F, -0.99F, 1, 1, 8, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.7678F, -1.1678F, 0.5F);
		bone18.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, -0.7854F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 57, 55, -0.49F, -0.5F, -0.99F, 1, 1, 8, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(1.9707F, -0.9749F, 0.5F);
		bone18.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.0F, 0.0F, -0.7854F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 58, 37, -0.5F, -0.5F, -1.01F, 1, 1, 8, 0.0F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(-2.4132F, 0.5251F, 3.9802F);
		bone18.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.2618F, 0.0F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 38, 21, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-2.1827F, 0.5251F, 5.0716F);
		bone18.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0F, 0.096F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 22, 4, -0.5F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-2.3843F, 0.5251F, 2.1897F);
		bone18.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.0F, -0.6109F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 51, 30, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-2.1132F, 0.5251F, 1.9428F);
		bone18.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.0F, -0.3491F, 0.0F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 0, 0, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(2.6488F, 0.5251F, 4.0802F);
		bone18.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.0F, -0.7854F, 0.0F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 30, 59, -0.3F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(2.9198F, 0.5251F, 2.1897F);
		bone18.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0F, 0.6109F, 0.0F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 51, 35, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(2.6488F, 0.5251F, 1.9428F);
		bone18.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.3491F, 0.0F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 8, 0, -0.5F, -1.5F, -1.0F, 1, 3, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(3.7929F, 0.0858F, 0.0F);
		scope.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 42, 0, -1.1863F, -4.9383F, -3.1996F, 1, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 22, 0, -4.8536F, -3.4393F, -1.25F, 6, 3, 1, 0.0F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.0858F, -0.0858F, -1.39F);
		bone12.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.3927F, -0.7854F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 4, 64, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.3964F, -1.9696F, -1.547F);
		bone12.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.1309F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 32, 33, -0.4F, -1.4001F, -0.5044F, 1, 3, 1, 0.0F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(0.6038F, -1.8649F, -2.1017F);
		bone12.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.3155F, 0.2494F, 0.0804F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 36, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-2.1855F, -2.2563F, -2.225F);
		bone12.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, -0.7854F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 16, 31, 3.0F, -0.5F, -0.49F, 0, 2, 2, 0.0F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(0.1118F, -3.7659F, -2.6001F);
		bone12.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0666F, 0.1191F, -0.7049F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 44, 66, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(-2.0355F, -2.3787F, -0.6F);
		bone12.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, -0.7854F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 40, 66, 2.0F, -0.5F, -0.49F, 1, 2, 1, 0.0F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-2.1213F, -2.4645F, -0.6F);
		bone12.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, 0.0F, -0.7854F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 67, 55, 1.9978F, -0.5F, -0.48F, 1, 1, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0858F, 0.0858F, 0.0F);
		scope.addChild(bone10);
		bone10.cubeList.add(new ModelBox(bone10, 16, 35, 0.1863F, -4.9383F, -3.1996F, 1, 1, 1, 0.0F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-0.0858F, -0.0858F, -1.39F);
		bone10.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, -0.3927F, 0.7854F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 44, 63, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(-0.3964F, -1.9696F, -1.547F);
		bone10.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.1309F, 0.0F, 0.0F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 32, 16, -0.6F, -1.4001F, -0.5044F, 1, 3, 1, 0.0F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(-0.6038F, -1.8649F, -2.1017F);
		bone10.addChild(cube_r127);
		setRotationAngle(cube_r127, 0.3155F, -0.2494F, -0.0804F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 32, 21, -0.5F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(2.1855F, -2.2563F, -2.225F);
		bone10.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.0F, 0.0F, 0.7854F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 25, 20, -3.0F, -0.5F, -0.49F, 0, 2, 2, 0.0F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(-0.1118F, -3.7659F, -2.6001F);
		bone10.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.0666F, -0.1191F, 0.7049F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 62, 40, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(2.0355F, -2.3787F, -0.6F);
		bone10.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0F, 0.7854F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 36, 66, -3.0F, -0.5F, -0.49F, 1, 2, 1, 0.0F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(2.1213F, -2.4645F, -0.6F);
		bone10.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 0.0F, 0.7854F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 67, 34, -2.9978F, -0.5F, -0.48F, 1, 1, 1, 0.0F, false));

		stand = new ModelRenderer(this);
		stand.setRotationPoint(2.95F, -22.6787F, -14.0223F);
		bone.addChild(stand);
		stand.cubeList.add(new ModelBox(stand, 0, 0, -1.9198F, -0.0726F, -1.1677F, 4, 1, 14, -0.2F, false));
		stand.cubeList.add(new ModelBox(stand, 20, 63, -0.9198F, -0.2726F, 12.0023F, 2, 1, 1, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 32, 38, -1.19F, -1.1713F, 9.3223F, 1, 1, 4, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 61, 10, -0.95F, -0.7713F, 12.4739F, 2, 1, 1, -0.2F, false));
		stand.cubeList.add(new ModelBox(stand, 46, 40, 0.29F, -1.1713F, 9.3223F, 1, 1, 4, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 14, 47, 0.3F, -1.7713F, 2.3223F, 1, 2, 3, 0.0F, false));
		stand.cubeList.add(new ModelBox(stand, 46, 30, -1.2F, -1.7713F, 2.3223F, 1, 2, 3, 0.0F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-0.7F, -0.3F, 0.0F);
		stand.addChild(cube_r132);
		setRotationAngle(cube_r132, -0.0436F, 0.0F, 0.0F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 67, 59, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r132.cubeList.add(new ModelBox(cube_r132, 67, 61, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(-0.7F, -0.3668F, 0.064F);
		stand.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0873F, 0.0F, 0.0F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 52, 0, -0.5F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));
		cube_r133.cubeList.add(new ModelBox(cube_r133, 52, 4, 1.0F, -0.5F, -0.5F, 1, 1, 3, 0.0F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-0.7F, -0.975F, 2.3451F);
		stand.addChild(cube_r134);
		setRotationAngle(cube_r134, -0.6109F, 0.0F, 0.0F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 54, 66, -0.49F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r134.cubeList.add(new ModelBox(cube_r134, 0, 67, 0.99F, -1.5F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(0.0354F, -0.7048F, 3.2155F);
		stand.addChild(cube_r135);
		setRotationAngle(cube_r135, -0.6109F, 0.0F, 0.0F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 67, 7, -0.4854F, -0.8F, -1.5F, 1, 1, 1, -0.15F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(0.35F, -1.6317F, 9.2247F);
		stand.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0769F, 0.0105F, -0.3053F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 24, 49, -0.5F, -1.5F, -4.4F, 1, 2, 8, 0.0F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(0.8F, -0.7283F, 9.3182F);
		stand.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0873F, 0.0F, 0.0F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 45, 63, -0.5F, -0.5F, -3.5F, 1, 1, 7, 0.0F, false));
		cube_r137.cubeList.add(new ModelBox(cube_r137, 60, 13, -2.0F, -0.5F, -3.5F, 1, 1, 7, 0.0F, false));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(0.99F, -1.3915F, 13.0439F);
		stand.addChild(cube_r138);
		setRotationAngle(cube_r138, -0.0698F, 0.0F, 0.0F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 54, 64, -1.499F, -0.5F, -0.5F, 2, 1, 1, -0.2F, false));
		cube_r138.cubeList.add(new ModelBox(cube_r138, 64, 24, -2.381F, -0.5F, -0.4987F, 2, 1, 1, -0.2F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(0.79F, -2.0713F, 13.2223F);
		stand.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0349F, 0.0F, 0.0F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 67, 57, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 64, 21, -1.98F, -0.5F, -0.49F, 2, 1, 1, 0.0F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.8F, -0.9713F, 5.4223F);
		stand.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, 0.0873F, 0.0F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 67, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(0.6036F, -1.1041F, 9.2853F);
		stand.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0501F, 0.0715F, -0.9581F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 60, 47, -0.5F, -0.5F, -3.5F, 1, 1, 7, 0.0F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-0.25F, -1.6317F, 9.2247F);
		stand.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0769F, -0.0105F, 0.3053F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 14, 47, -0.5F, -1.5F, -4.4F, 1, 2, 8, 0.0F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(0.05F, -2.0787F, 13.4322F);
		stand.addChild(cube_r143);
		setRotationAngle(cube_r143, 0.0175F, 0.0F, 0.0F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 0, 61, -1.0F, -0.5F, -0.4F, 2, 1, 1, 0.0F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(-0.7F, -0.9713F, 5.4223F);
		stand.addChild(cube_r144);
		setRotationAngle(cube_r144, 0.0F, -0.0873F, 0.0F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 48, 66, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-0.5036F, -1.1041F, 9.2853F);
		stand.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0501F, -0.0715F, 0.9581F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 21, 59, -0.5F, -0.5F, -3.5F, 1, 1, 7, 0.0F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(0.0F, 0.0F, 0.0F);
		stand.addChild(cube_r146);
		setRotationAngle(cube_r146, -0.0175F, 0.0F, 0.0F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 17, 33, -0.5F, -0.5F, -0.5F, 1, 1, 13, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(1.0259F, 0.3504F, -0.4777F);
		stand.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, 0.0F, 0.8203F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 22, 1, -0.5F, -0.5F, -0.491F, 1, 1, 14, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(-0.9259F, 0.3504F, -0.4777F);
		stand.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0F, 0.0F, -0.8203F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 0, 31, -0.5F, -0.5F, -0.491F, 1, 1, 14, 0.0F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-1.95F, -0.3213F, 6.0223F);
		stand.addChild(cube_r149);
		setRotationAngle(cube_r149, 0.0F, 0.0F, -0.0349F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 0, 15, 0.0F, 0.0F, -7.0F, 1, 2, 14, 0.0F, false));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(2.05F, -0.3213F, 6.0223F);
		stand.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.0F, 0.0F, 0.0349F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 16, 17, -1.0F, 0.0F, -7.0F, 1, 2, 14, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.05F, 1.2787F, 10.6223F);
		stand.addChild(bone6);
		setRotationAngle(bone6, 2.0944F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 60, 64, -0.492F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r151 = new ModelRenderer(this);
		cube_r151.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r151);
		setRotationAngle(cube_r151, 2.5744F, 0.0F, 0.0F);
		cube_r151.cubeList.add(new ModelBox(cube_r151, 16, 38, -0.493F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r152 = new ModelRenderer(this);
		cube_r152.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r152);
		setRotationAngle(cube_r152, 1.9635F, 0.0F, 0.0F);
		cube_r152.cubeList.add(new ModelBox(cube_r152, 32, 38, -0.494F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r153 = new ModelRenderer(this);
		cube_r153.setRotationPoint(-0.99F, 0.0339F, 0.034F);
		bone6.addChild(cube_r153);
		setRotationAngle(cube_r153, 1.0472F, 0.0F, 0.0F);
		cube_r153.cubeList.add(new ModelBox(cube_r153, 47, 46, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r154 = new ModelRenderer(this);
		cube_r154.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r154);
		setRotationAngle(cube_r154, 1.309F, 0.0F, 0.0F);
		cube_r154.cubeList.add(new ModelBox(cube_r154, 46, 40, -0.49F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r155 = new ModelRenderer(this);
		cube_r155.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r155);
		setRotationAngle(cube_r155, 0.6545F, 0.0F, 0.0F);
		cube_r155.cubeList.add(new ModelBox(cube_r155, 61, 28, -0.491F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.05F, 1.2787F, 1.6223F);
		stand.addChild(bone5);
		setRotationAngle(bone5, 2.0944F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 17, 66, -0.492F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r156 = new ModelRenderer(this);
		cube_r156.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r156);
		setRotationAngle(cube_r156, 2.5744F, 0.0F, 0.0F);
		cube_r156.cubeList.add(new ModelBox(cube_r156, 64, 64, -0.493F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r157 = new ModelRenderer(this);
		cube_r157.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r157);
		setRotationAngle(cube_r157, 1.9635F, 0.0F, 0.0F);
		cube_r157.cubeList.add(new ModelBox(cube_r157, 5, 66, -0.494F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r158 = new ModelRenderer(this);
		cube_r158.setRotationPoint(-0.99F, 0.0339F, 0.034F);
		bone5.addChild(cube_r158);
		setRotationAngle(cube_r158, 1.0472F, 0.0F, 0.0F);
		cube_r158.cubeList.add(new ModelBox(cube_r158, 57, 10, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		cube_r159 = new ModelRenderer(this);
		cube_r159.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r159);
		setRotationAngle(cube_r159, 1.309F, 0.0F, 0.0F);
		cube_r159.cubeList.add(new ModelBox(cube_r159, 9, 66, -0.49F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));

		cube_r160 = new ModelRenderer(this);
		cube_r160.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r160);
		setRotationAngle(cube_r160, 0.6545F, 0.0F, 0.0F);
		cube_r160.cubeList.add(new ModelBox(cube_r160, 13, 66, -0.491F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
