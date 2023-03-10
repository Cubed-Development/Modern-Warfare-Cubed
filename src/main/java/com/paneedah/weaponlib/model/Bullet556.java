package com.paneedah.weaponlib.model;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Bullet556 extends ModelBase {
	private final QRenderer casing;
	private final ModelRenderer bullet_r1;
	private final ModelRenderer bullet_r2;
	private final ModelRenderer bullet_r3;
	private final ModelRenderer bullet_r4;
	private final ModelRenderer bullet_r5;
	private final ModelRenderer bullet_r6;
	private final ModelRenderer bullet_r7;
	private final ModelRenderer bullet_r8;
	private final ModelRenderer bullet_r9;
	private final ModelRenderer bullet_r10;
	private final ModelRenderer bullet_r11;
	private final ModelRenderer bullet_r12;
	private final ModelRenderer bullet_r13;
	private final ModelRenderer bullet_r14;
	private final ModelRenderer bullet_r15;
	private final ModelRenderer bullet_r16;
	private final ModelRenderer bullet_r17;
	private final ModelRenderer bullet_r18;
	private final ModelRenderer bullet_r19;
	private final ModelRenderer bullet_r20;
	private final ModelRenderer bullet_r21;
	private final ModelRenderer bullet_r22;
	private final ModelRenderer bullet_r23;
	private final ModelRenderer bullet_r24;
	private final ModelRenderer bullet_r25;
	private final ModelRenderer bullet_r26;
	private final ModelRenderer bullet_r27;
	private final ModelRenderer bullet_r28;
	private final ModelRenderer bullet_r29;
	private final ModelRenderer bullet_r30;
	private final ModelRenderer bullet_r31;
	private final ModelRenderer bullet_r32;
	private final ModelRenderer bullet_r33;
	private final ModelRenderer bullet_r34;
	private final ModelRenderer bullet_r35;
	private final ModelRenderer bullet_r36;
	private final ModelRenderer bullet_r37;
	private final ModelRenderer bullet_r38;
	private final ModelRenderer bullet_r39;
	private final ModelRenderer bullet_r40;
	private final ModelRenderer bullet556bottom;
	private final ModelRenderer bullet_r41;
	private final ModelRenderer bullet_r42;
	private final ModelRenderer bullet_r43;
	private final ModelRenderer bullet_r44;
	private final ModelRenderer bullet_r45;
	private final ModelRenderer bullet_r46;
	private final ModelRenderer bullet_r47;
	private final ModelRenderer bullet_r48;
	private final ModelRenderer bullet_r49;
	private final ModelRenderer bullet_r50;
	private final ModelRenderer bullet_r51;
	private final ModelRenderer bullet_r52;
	private final ModelRenderer bullet_r53;
	private final ModelRenderer bullet_r54;
	private final ModelRenderer bullet_r55;
	private final ModelRenderer bullet_r56;
	private final ModelRenderer bullet_r57;
	private final ModelRenderer bullet_r58;
	private final ModelRenderer bullet_r59;
	private final ModelRenderer bullet_r60;
	private final ModelRenderer bullet_r61;
	private final ModelRenderer bullet_r62;
	private final ModelRenderer bullet_r63;
	private final ModelRenderer bullet_r64;
	private final ModelRenderer bullet_r65;
	private final ModelRenderer bullet_r66;
	private final ModelRenderer bullet_r67;
	private final ModelRenderer bullet_r68;
	private final ModelRenderer bullet_r69;
	private final ModelRenderer bullet_r70;
	private final ModelRenderer bullet_r71;
	private final ModelRenderer bullet_r72;
	private final ModelRenderer bullet_r73;
	private final ModelRenderer bullet_r74;
	private final ModelRenderer bullet_r75;
	private final ModelRenderer bullet_r76;
	private final ModelRenderer bullet_r77;
	private final ModelRenderer bullet_r78;
	private final ModelRenderer bullet_r79;
	private final ModelRenderer bullet_r80;
	private final ModelRenderer bullet556;
	private final ModelRenderer bullet_r81;
	private final ModelRenderer bullet_r82;
	private final ModelRenderer bullet_r83;
	private final ModelRenderer bullet_r84;
	private final ModelRenderer bullet_r85;
	private final ModelRenderer bullet_r86;
	private final ModelRenderer bullet_r87;
	private final ModelRenderer bullet_r88;

	public Bullet556() {
		textureWidth = 64;
		textureHeight = 64;

		casing = new QRenderer(this);
		casing.setRotationPoint(-0.0511F, 1.91F, 0.5218F);
		casing.cubeList.add(new ModelBox(casing, 16, 30, 1.0055F, -15.8737F, 1.2994F, 1, 6, 1, -0.2F, false));
		casing.cubeList.add(new ModelBox(casing, 28, 30, 0.2949F, -15.8737F, 0.5888F, 1, 6, 1, -0.2F, false));
		casing.cubeList.add(new ModelBox(casing, 36, 0, 1.7162F, -15.8737F, 0.5888F, 1, 6, 1, -0.2F, false));
		casing.cubeList.add(new ModelBox(casing, 36, 7, 1.0055F, -15.8737F, -0.1218F, 1, 6, 1, -0.2F, false));

		bullet_r1 = new ModelRenderer(this);
		bullet_r1.setRotationPoint(1.9154F, -14.3737F, 1.6896F);
		casing.addChild(bullet_r1);
		setRotationAngle(bullet_r1, 0.0F, 0.5236F, 0.0F);
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 32, 21, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r2 = new ModelRenderer(this);
		bullet_r2.setRotationPoint(2.1064F, -14.3737F, 1.4986F);
		casing.addChild(bullet_r2);
		setRotationAngle(bullet_r2, 0.0F, -0.5236F, 0.0F);
		bullet_r2.cubeList.add(new ModelBox(bullet_r2, 32, 14, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r3 = new ModelRenderer(this);
		bullet_r3.setRotationPoint(2.1064F, -14.3737F, 0.679F);
		casing.addChild(bullet_r3);
		setRotationAngle(bullet_r3, 0.0F, 0.5236F, 0.0F);
		bullet_r3.cubeList.add(new ModelBox(bullet_r3, 32, 35, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r4 = new ModelRenderer(this);
		bullet_r4.setRotationPoint(1.9154F, -14.3737F, 0.488F);
		casing.addChild(bullet_r4);
		setRotationAngle(bullet_r4, 0.0F, -0.5236F, 0.0F);
		bullet_r4.cubeList.add(new ModelBox(bullet_r4, 32, 28, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r5 = new ModelRenderer(this);
		bullet_r5.setRotationPoint(0.9047F, -14.3737F, 0.679F);
		casing.addChild(bullet_r5);
		setRotationAngle(bullet_r5, 0.0F, -0.5236F, 0.0F);
		bullet_r5.cubeList.add(new ModelBox(bullet_r5, 32, 0, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r6 = new ModelRenderer(this);
		bullet_r6.setRotationPoint(1.0957F, -14.3737F, 0.488F);
		casing.addChild(bullet_r6);
		setRotationAngle(bullet_r6, 0.0F, 0.5236F, 0.0F);
		bullet_r6.cubeList.add(new ModelBox(bullet_r6, 32, 7, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r7 = new ModelRenderer(this);
		bullet_r7.setRotationPoint(0.9047F, -14.3737F, 1.4986F);
		casing.addChild(bullet_r7);
		setRotationAngle(bullet_r7, 0.0F, 0.5236F, 0.0F);
		bullet_r7.cubeList.add(new ModelBox(bullet_r7, 24, 30, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r8 = new ModelRenderer(this);
		bullet_r8.setRotationPoint(1.0957F, -14.3737F, 1.6896F);
		casing.addChild(bullet_r8);
		setRotationAngle(bullet_r8, 0.0F, -0.5236F, 0.0F);
		bullet_r8.cubeList.add(new ModelBox(bullet_r8, 20, 30, -0.5F, -1.5F, -0.5F, 1, 6, 1, -0.2F, false));

		bullet_r9 = new ModelRenderer(this);
		bullet_r9.setRotationPoint(1.5055F, 0.982F, 2.6511F);
		casing.addChild(bullet_r9);
		setRotationAngle(bullet_r9, 0.0175F, 0.0F, 0.0F);
		bullet_r9.cubeList.add(new ModelBox(bullet_r9, 12, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r10 = new ModelRenderer(this);
		bullet_r10.setRotationPoint(-0.0568F, 0.982F, 1.0888F);
		casing.addChild(bullet_r10);
		setRotationAngle(bullet_r10, 0.0F, 0.0F, 0.0175F);
		bullet_r10.cubeList.add(new ModelBox(bullet_r10, 0, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r11 = new ModelRenderer(this);
		bullet_r11.setRotationPoint(1.5055F, 0.982F, -0.4735F);
		casing.addChild(bullet_r11);
		setRotationAngle(bullet_r11, -0.0175F, 0.0F, 0.0F);
		bullet_r11.cubeList.add(new ModelBox(bullet_r11, 16, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r12 = new ModelRenderer(this);
		bullet_r12.setRotationPoint(0.8443F, 0.9838F, -0.3718F);
		casing.addChild(bullet_r12);
		setRotationAngle(bullet_r12, -0.058F, -1.2649F, 0.0553F);
		bullet_r12.cubeList.add(new ModelBox(bullet_r12, 8, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r13 = new ModelRenderer(this);
		bullet_r13.setRotationPoint(0.3475F, 0.982F, -0.0693F);
		casing.addChild(bullet_r13);
		setRotationAngle(bullet_r13, -0.0175F, 0.7854F, 0.0F);
		bullet_r13.cubeList.add(new ModelBox(bullet_r13, 4, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r14 = new ModelRenderer(this);
		bullet_r14.setRotationPoint(0.0447F, 0.982F, 0.4297F);
		casing.addChild(bullet_r14);
		setRotationAngle(bullet_r14, -0.0175F, 1.2654F, 0.0F);
		bullet_r14.cubeList.add(new ModelBox(bullet_r14, 12, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r15 = new ModelRenderer(this);
		bullet_r15.setRotationPoint(0.0447F, 0.982F, 1.7479F);
		casing.addChild(bullet_r15);
		setRotationAngle(bullet_r15, 0.0175F, -1.2654F, 0.0F);
		bullet_r15.cubeList.add(new ModelBox(bullet_r15, 8, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r16 = new ModelRenderer(this);
		bullet_r16.setRotationPoint(0.3475F, 0.982F, 2.2469F);
		casing.addChild(bullet_r16);
		setRotationAngle(bullet_r16, 0.0175F, -0.7854F, 0.0F);
		bullet_r16.cubeList.add(new ModelBox(bullet_r16, 4, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r17 = new ModelRenderer(this);
		bullet_r17.setRotationPoint(0.8443F, 0.9796F, 2.5493F);
		casing.addChild(bullet_r17);
		setRotationAngle(bullet_r17, 0.058F, 1.2649F, 0.0553F);
		bullet_r17.cubeList.add(new ModelBox(bullet_r17, 0, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r18 = new ModelRenderer(this);
		bullet_r18.setRotationPoint(2.6636F, 0.982F, 2.2469F);
		casing.addChild(bullet_r18);
		setRotationAngle(bullet_r18, 0.0175F, 0.7854F, 0.0F);
		bullet_r18.cubeList.add(new ModelBox(bullet_r18, 20, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r19 = new ModelRenderer(this);
		bullet_r19.setRotationPoint(2.9664F, 0.982F, 1.7479F);
		casing.addChild(bullet_r19);
		setRotationAngle(bullet_r19, 0.0175F, 1.2654F, 0.0F);
		bullet_r19.cubeList.add(new ModelBox(bullet_r19, 20, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r20 = new ModelRenderer(this);
		bullet_r20.setRotationPoint(2.9664F, 0.982F, 0.4297F);
		casing.addChild(bullet_r20);
		setRotationAngle(bullet_r20, -0.0175F, -1.2654F, 0.0F);
		bullet_r20.cubeList.add(new ModelBox(bullet_r20, 24, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r21 = new ModelRenderer(this);
		bullet_r21.setRotationPoint(2.6636F, 0.982F, -0.0693F);
		casing.addChild(bullet_r21);
		setRotationAngle(bullet_r21, -0.0175F, -0.7854F, 0.0F);
		bullet_r21.cubeList.add(new ModelBox(bullet_r21, 24, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r22 = new ModelRenderer(this);
		bullet_r22.setRotationPoint(2.1668F, 0.9838F, 2.5493F);
		casing.addChild(bullet_r22);
		setRotationAngle(bullet_r22, 0.058F, -1.2649F, -0.0553F);
		bullet_r22.cubeList.add(new ModelBox(bullet_r22, 16, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r23 = new ModelRenderer(this);
		bullet_r23.setRotationPoint(2.1668F, 0.9796F, -0.3717F);
		casing.addChild(bullet_r23);
		setRotationAngle(bullet_r23, -0.058F, 1.2649F, -0.0553F);
		bullet_r23.cubeList.add(new ModelBox(bullet_r23, 28, 0, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet_r24 = new ModelRenderer(this);
		bullet_r24.setRotationPoint(1.5055F, -13.0888F, 2.0915F);
		casing.addChild(bullet_r24);
		setRotationAngle(bullet_r24, 1.5708F, -1.1606F, -1.5708F);
		bullet_r24.cubeList.add(new ModelBox(bullet_r24, 39, 39, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r25 = new ModelRenderer(this);
		bullet_r25.setRotationPoint(0.9423F, -13.0888F, 0.1728F);
		casing.addChild(bullet_r25);
		setRotationAngle(bullet_r25, -0.9017F, -1.0646F, 0.9657F);
		bullet_r25.cubeList.add(new ModelBox(bullet_r25, 0, 38, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r26 = new ModelRenderer(this);
		bullet_r26.setRotationPoint(0.7432F, -13.0888F, 0.3264F);
		casing.addChild(bullet_r26);
		setRotationAngle(bullet_r26, -0.3794F, -0.7056F, 0.5513F);
		bullet_r26.cubeList.add(new ModelBox(bullet_r26, 36, 37, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r27 = new ModelRenderer(this);
		bullet_r27.setRotationPoint(0.5784F, -13.0888F, 0.598F);
		casing.addChild(bullet_r27);
		setRotationAngle(bullet_r27, -0.1251F, -0.2794F, 0.4278F);
		bullet_r27.cubeList.add(new ModelBox(bullet_r27, 27, 37, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r28 = new ModelRenderer(this);
		bullet_r28.setRotationPoint(0.5029F, -13.0888F, 1.0888F);
		casing.addChild(bullet_r28);
		setRotationAngle(bullet_r28, 0.0F, 0.0F, 0.4102F);
		bullet_r28.cubeList.add(new ModelBox(bullet_r28, 23, 37, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r29 = new ModelRenderer(this);
		bullet_r29.setRotationPoint(0.5784F, -13.0888F, 1.5796F);
		casing.addChild(bullet_r29);
		setRotationAngle(bullet_r29, 0.1251F, 0.2794F, 0.4278F);
		bullet_r29.cubeList.add(new ModelBox(bullet_r29, 19, 37, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r30 = new ModelRenderer(this);
		bullet_r30.setRotationPoint(0.7432F, -13.0888F, 1.8512F);
		casing.addChild(bullet_r30);
		setRotationAngle(bullet_r30, 0.3794F, 0.7056F, 0.5513F);
		bullet_r30.cubeList.add(new ModelBox(bullet_r30, 15, 37, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r31 = new ModelRenderer(this);
		bullet_r31.setRotationPoint(0.9423F, -13.0888F, 2.0048F);
		casing.addChild(bullet_r31);
		setRotationAngle(bullet_r31, 0.9017F, 1.0646F, 0.9657F);
		bullet_r31.cubeList.add(new ModelBox(bullet_r31, 36, 34, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r32 = new ModelRenderer(this);
		bullet_r32.setRotationPoint(2.0688F, -13.0846F, 2.0048F);
		casing.addChild(bullet_r32);
		setRotationAngle(bullet_r32, 0.9017F, -1.0646F, -0.9657F);
		bullet_r32.cubeList.add(new ModelBox(bullet_r32, 12, 39, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r33 = new ModelRenderer(this);
		bullet_r33.setRotationPoint(2.2679F, -13.0888F, 1.8512F);
		casing.addChild(bullet_r33);
		setRotationAngle(bullet_r33, 0.3794F, -0.7056F, -0.5513F);
		bullet_r33.cubeList.add(new ModelBox(bullet_r33, 8, 38, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r34 = new ModelRenderer(this);
		bullet_r34.setRotationPoint(2.4327F, -13.0888F, 1.5796F);
		casing.addChild(bullet_r34);
		setRotationAngle(bullet_r34, 0.1251F, -0.2794F, -0.4278F);
		bullet_r34.cubeList.add(new ModelBox(bullet_r34, 4, 38, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r35 = new ModelRenderer(this);
		bullet_r35.setRotationPoint(2.4327F, -13.0888F, 0.598F);
		casing.addChild(bullet_r35);
		setRotationAngle(bullet_r35, -0.1251F, 0.2794F, -0.4278F);
		bullet_r35.cubeList.add(new ModelBox(bullet_r35, 40, 6, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r36 = new ModelRenderer(this);
		bullet_r36.setRotationPoint(1.5055F, -13.0888F, 0.0861F);
		casing.addChild(bullet_r36);
		setRotationAngle(bullet_r36, -1.5708F, 1.1606F, -1.5708F);
		bullet_r36.cubeList.add(new ModelBox(bullet_r36, 40, 0, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r37 = new ModelRenderer(this);
		bullet_r37.setRotationPoint(2.0688F, -13.0888F, 0.1728F);
		casing.addChild(bullet_r37);
		setRotationAngle(bullet_r37, -0.9017F, 1.0646F, -0.9657F);
		bullet_r37.cubeList.add(new ModelBox(bullet_r37, 40, 3, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r38 = new ModelRenderer(this);
		bullet_r38.setRotationPoint(2.2679F, -13.0888F, 0.3264F);
		casing.addChild(bullet_r38);
		setRotationAngle(bullet_r38, -0.3794F, 0.7056F, -0.5513F);
		bullet_r38.cubeList.add(new ModelBox(bullet_r38, 40, 9, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r39 = new ModelRenderer(this);
		bullet_r39.setRotationPoint(2.5082F, -13.0888F, 1.0888F);
		casing.addChild(bullet_r39);
		setRotationAngle(bullet_r39, 0.0F, 0.0F, -0.4102F);
		bullet_r39.cubeList.add(new ModelBox(bullet_r39, 40, 12, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.1F, false));

		bullet_r40 = new ModelRenderer(this);
		bullet_r40.setRotationPoint(3.0679F, 0.982F, 1.0888F);
		casing.addChild(bullet_r40);
		setRotationAngle(bullet_r40, 0.0F, 0.0F, -0.0175F);
		bullet_r40.cubeList.add(new ModelBox(bullet_r40, 28, 15, -0.5F, -13.5F, -0.5F, 1, 14, 1, -0.1F, false));

		bullet556bottom = new ModelRenderer(this);
		bullet556bottom.setRotationPoint(0.0511F, -4.2041F, -28.7644F);
		casing.addChild(bullet556bottom);
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 15, 44, -0.6092F, 6.4041F, 29.3532F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 8, 43, 0.96F, 6.4041F, 30.9224F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 0, 45, -0.04F, 6.4141F, 28.4224F, 3, 1, 3, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 19, 44, 0.96F, 6.4041F, 27.7839F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 43, 19, 2.5292F, 6.4041F, 29.3532F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 39, 28, -0.2767F, 6.2041F, 29.3532F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 40, 15, 0.9545F, 6.2041F, 30.5843F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 20, 40, 0.9545F, 6.2041F, 28.122F, 1, 1, 1, -0.1F, false));
		bullet556bottom.cubeList.add(new ModelBox(bullet556bottom, 35, 41, 2.1856F, 6.2041F, 29.3532F, 1, 1, 1, -0.1F, false));

		bullet_r41 = new ModelRenderer(this);
		bullet_r41.setRotationPoint(0.5306F, 6.7041F, 28.9292F);
		bullet556bottom.addChild(bullet_r41);
		setRotationAngle(bullet_r41, 0.0F, 0.7854F, 0.0F);
		bullet_r41.cubeList.add(new ModelBox(bullet_r41, 8, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r42 = new ModelRenderer(this);
		bullet_r42.setRotationPoint(0.3094F, 6.7041F, 29.2936F);
		bullet556bottom.addChild(bullet_r42);
		setRotationAngle(bullet_r42, 0.0F, 1.2654F, 0.0F);
		bullet_r42.cubeList.add(new ModelBox(bullet_r42, 4, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r43 = new ModelRenderer(this);
		bullet_r43.setRotationPoint(0.8949F, 6.7041F, 28.7081F);
		bullet556bottom.addChild(bullet_r43);
		setRotationAngle(bullet_r43, 0.0F, -1.2654F, 0.0F);
		bullet_r43.cubeList.add(new ModelBox(bullet_r43, 0, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r44 = new ModelRenderer(this);
		bullet_r44.setRotationPoint(2.014F, 6.7041F, 28.7081F);
		bullet556bottom.addChild(bullet_r44);
		setRotationAngle(bullet_r44, 0.0F, 1.2654F, 0.0F);
		bullet_r44.cubeList.add(new ModelBox(bullet_r44, 40, 30, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r45 = new ModelRenderer(this);
		bullet_r45.setRotationPoint(3.0855F, 6.7041F, 29.6364F);
		bullet556bottom.addChild(bullet_r45);
		setRotationAngle(bullet_r45, 0.0F, -0.7854F, 0.0F);
		bullet_r45.cubeList.add(new ModelBox(bullet_r45, 28, 40, -1.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r46 = new ModelRenderer(this);
		bullet_r46.setRotationPoint(2.5995F, 6.7041F, 29.2936F);
		bullet556bottom.addChild(bullet_r46);
		setRotationAngle(bullet_r46, 0.0F, -1.2654F, 0.0F);
		bullet_r46.cubeList.add(new ModelBox(bullet_r46, 40, 25, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r47 = new ModelRenderer(this);
		bullet_r47.setRotationPoint(2.5995F, 6.7041F, 30.4127F);
		bullet556bottom.addChild(bullet_r47);
		setRotationAngle(bullet_r47, 0.0F, 1.2654F, 0.0F);
		bullet_r47.cubeList.add(new ModelBox(bullet_r47, 24, 40, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r48 = new ModelRenderer(this);
		bullet_r48.setRotationPoint(3.0855F, 6.7041F, 30.07F);
		bullet556bottom.addChild(bullet_r48);
		setRotationAngle(bullet_r48, 0.0F, 0.7854F, 0.0F);
		bullet_r48.cubeList.add(new ModelBox(bullet_r48, 40, 20, -1.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r49 = new ModelRenderer(this);
		bullet_r49.setRotationPoint(2.014F, 6.7041F, 30.9982F);
		bullet556bottom.addChild(bullet_r49);
		setRotationAngle(bullet_r49, 0.0F, -1.2654F, 0.0F);
		bullet_r49.cubeList.add(new ModelBox(bullet_r49, 16, 40, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r50 = new ModelRenderer(this);
		bullet_r50.setRotationPoint(0.8949F, 6.7041F, 30.9982F);
		bullet556bottom.addChild(bullet_r50);
		setRotationAngle(bullet_r50, 0.0F, 1.2654F, 0.0F);
		bullet_r50.cubeList.add(new ModelBox(bullet_r50, 39, 36, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r51 = new ModelRenderer(this);
		bullet_r51.setRotationPoint(0.5306F, 6.7041F, 30.7771F);
		bullet556bottom.addChild(bullet_r51);
		setRotationAngle(bullet_r51, 0.0F, -0.7854F, 0.0F);
		bullet_r51.cubeList.add(new ModelBox(bullet_r51, 39, 33, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r52 = new ModelRenderer(this);
		bullet_r52.setRotationPoint(0.3094F, 6.7041F, 30.4127F);
		bullet556bottom.addChild(bullet_r52);
		setRotationAngle(bullet_r52, 0.0F, -1.2654F, 0.0F);
		bullet_r52.cubeList.add(new ModelBox(bullet_r52, 39, 23, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r53 = new ModelRenderer(this);
		bullet_r53.setRotationPoint(0.297F, 6.9041F, 28.6902F);
		bullet556bottom.addChild(bullet_r53);
		setRotationAngle(bullet_r53, 0.0F, 0.7854F, 0.0F);
		bullet_r53.cubeList.add(new ModelBox(bullet_r53, 41, 43, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r54 = new ModelRenderer(this);
		bullet_r54.setRotationPoint(-0.0075F, 6.9041F, 29.1919F);
		bullet556bottom.addChild(bullet_r54);
		setRotationAngle(bullet_r54, 0.0F, 1.2654F, 0.0F);
		bullet_r54.cubeList.add(new ModelBox(bullet_r54, 43, 39, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r55 = new ModelRenderer(this);
		bullet_r55.setRotationPoint(0.7988F, 6.9041F, 28.3857F);
		bullet556bottom.addChild(bullet_r55);
		setRotationAngle(bullet_r55, 0.0F, -1.2654F, 0.0F);
		bullet_r55.cubeList.add(new ModelBox(bullet_r55, 44, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r56 = new ModelRenderer(this);
		bullet_r56.setRotationPoint(2.1212F, 6.9041F, 28.3857F);
		bullet556bottom.addChild(bullet_r56);
		setRotationAngle(bullet_r56, 0.0F, 1.2654F, 0.0F);
		bullet_r56.cubeList.add(new ModelBox(bullet_r56, 43, 24, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r57 = new ModelRenderer(this);
		bullet_r57.setRotationPoint(3.3301F, 6.9041F, 29.3973F);
		bullet556bottom.addChild(bullet_r57);
		setRotationAngle(bullet_r57, 0.0F, -0.7854F, 0.0F);
		bullet_r57.cubeList.add(new ModelBox(bullet_r57, 43, 29, -1.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r58 = new ModelRenderer(this);
		bullet_r58.setRotationPoint(2.9275F, 6.9041F, 29.1919F);
		bullet556bottom.addChild(bullet_r58);
		setRotationAngle(bullet_r58, 0.0F, -1.2654F, 0.0F);
		bullet_r58.cubeList.add(new ModelBox(bullet_r58, 34, 43, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r59 = new ModelRenderer(this);
		bullet_r59.setRotationPoint(2.9275F, 6.9041F, 30.5144F);
		bullet556bottom.addChild(bullet_r59);
		setRotationAngle(bullet_r59, 0.0F, 1.2654F, 0.0F);
		bullet_r59.cubeList.add(new ModelBox(bullet_r59, 43, 2, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r60 = new ModelRenderer(this);
		bullet_r60.setRotationPoint(3.3301F, 6.9041F, 30.309F);
		bullet556bottom.addChild(bullet_r60);
		setRotationAngle(bullet_r60, 0.0F, 0.7854F, 0.0F);
		bullet_r60.cubeList.add(new ModelBox(bullet_r60, 4, 43, -1.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r61 = new ModelRenderer(this);
		bullet_r61.setRotationPoint(2.1212F, 6.9041F, 31.3206F);
		bullet556bottom.addChild(bullet_r61);
		setRotationAngle(bullet_r61, 0.0F, -1.2654F, 0.0F);
		bullet_r61.cubeList.add(new ModelBox(bullet_r61, 43, 5, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r62 = new ModelRenderer(this);
		bullet_r62.setRotationPoint(0.7988F, 6.9041F, 31.3206F);
		bullet556bottom.addChild(bullet_r62);
		setRotationAngle(bullet_r62, 0.0F, 1.2654F, 0.0F);
		bullet_r62.cubeList.add(new ModelBox(bullet_r62, 43, 8, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r63 = new ModelRenderer(this);
		bullet_r63.setRotationPoint(0.297F, 6.9041F, 31.0161F);
		bullet556bottom.addChild(bullet_r63);
		setRotationAngle(bullet_r63, 0.0F, -0.7854F, 0.0F);
		bullet_r63.cubeList.add(new ModelBox(bullet_r63, 43, 11, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r64 = new ModelRenderer(this);
		bullet_r64.setRotationPoint(-0.0075F, 6.9041F, 30.5144F);
		bullet556bottom.addChild(bullet_r64);
		setRotationAngle(bullet_r64, 0.0F, -1.2654F, 0.0F);
		bullet_r64.cubeList.add(new ModelBox(bullet_r64, 43, 14, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r65 = new ModelRenderer(this);
		bullet_r65.setRotationPoint(0.1125F, 5.7725F, 30.4748F);
		bullet556bottom.addChild(bullet_r65);
		setRotationAngle(bullet_r65, 0.2783F, 0.1274F, 1.1523F);
		bullet_r65.cubeList.add(new ModelBox(bullet_r65, 27, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r66 = new ModelRenderer(this);
		bullet_r66.setRotationPoint(0.3845F, 5.7725F, 30.9231F);
		bullet556bottom.addChild(bullet_r66);
		setRotationAngle(bullet_r66, 0.7363F, 0.3035F, 1.2523F);
		bullet_r66.cubeList.add(new ModelBox(bullet_r66, 23, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r67 = new ModelRenderer(this);
		bullet_r67.setRotationPoint(0.8328F, 5.7725F, 31.1951F);
		bullet556bottom.addChild(bullet_r67);
		setRotationAngle(bullet_r67, 1.236F, 0.4149F, 1.4315F);
		bullet_r67.cubeList.add(new ModelBox(bullet_r67, 42, 22, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r68 = new ModelRenderer(this);
		bullet_r68.setRotationPoint(1.4545F, 5.7725F, 31.2908F);
		bullet556bottom.addChild(bullet_r68);
		setRotationAngle(bullet_r68, 1.5708F, -0.4363F, -1.5708F);
		bullet_r68.cubeList.add(new ModelBox(bullet_r68, 19, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r69 = new ModelRenderer(this);
		bullet_r69.setRotationPoint(2.0761F, 5.7725F, 31.1951F);
		bullet556bottom.addChild(bullet_r69);
		setRotationAngle(bullet_r69, 1.236F, -0.4149F, -1.4315F);
		bullet_r69.cubeList.add(new ModelBox(bullet_r69, 42, 17, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r70 = new ModelRenderer(this);
		bullet_r70.setRotationPoint(2.5244F, 5.7725F, 30.9231F);
		bullet556bottom.addChild(bullet_r70);
		setRotationAngle(bullet_r70, 0.7363F, -0.3035F, -1.2523F);
		bullet_r70.cubeList.add(new ModelBox(bullet_r70, 15, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r71 = new ModelRenderer(this);
		bullet_r71.setRotationPoint(2.7964F, 5.7725F, 30.4748F);
		bullet556bottom.addChild(bullet_r71);
		setRotationAngle(bullet_r71, 0.2783F, -0.1274F, -1.1523F);
		bullet_r71.cubeList.add(new ModelBox(bullet_r71, 11, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r72 = new ModelRenderer(this);
		bullet_r72.setRotationPoint(1.4545F, 5.7725F, 28.4155F);
		bullet556bottom.addChild(bullet_r72);
		setRotationAngle(bullet_r72, -1.5708F, 0.4363F, -1.5708F);
		bullet_r72.cubeList.add(new ModelBox(bullet_r72, 42, 37, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r73 = new ModelRenderer(this);
		bullet_r73.setRotationPoint(0.1125F, 5.7725F, 29.2315F);
		bullet556bottom.addChild(bullet_r73);
		setRotationAngle(bullet_r73, -0.2783F, -0.1274F, 1.1523F);
		bullet_r73.cubeList.add(new ModelBox(bullet_r73, 42, 34, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r74 = new ModelRenderer(this);
		bullet_r74.setRotationPoint(0.3845F, 5.7725F, 28.7832F);
		bullet556bottom.addChild(bullet_r74);
		setRotationAngle(bullet_r74, -0.7363F, -0.3035F, 1.2523F);
		bullet_r74.cubeList.add(new ModelBox(bullet_r74, 42, 32, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r75 = new ModelRenderer(this);
		bullet_r75.setRotationPoint(0.8328F, 5.7725F, 28.5112F);
		bullet556bottom.addChild(bullet_r75);
		setRotationAngle(bullet_r75, -1.236F, -0.4149F, 1.4315F);
		bullet_r75.cubeList.add(new ModelBox(bullet_r75, 31, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r76 = new ModelRenderer(this);
		bullet_r76.setRotationPoint(2.0761F, 5.7725F, 28.5112F);
		bullet556bottom.addChild(bullet_r76);
		setRotationAngle(bullet_r76, -1.236F, 0.4149F, -1.4315F);
		bullet_r76.cubeList.add(new ModelBox(bullet_r76, 38, 42, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r77 = new ModelRenderer(this);
		bullet_r77.setRotationPoint(2.5244F, 5.7725F, 28.7832F);
		bullet556bottom.addChild(bullet_r77);
		setRotationAngle(bullet_r77, -0.7363F, 0.3035F, -1.2523F);
		bullet_r77.cubeList.add(new ModelBox(bullet_r77, 42, 41, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r78 = new ModelRenderer(this);
		bullet_r78.setRotationPoint(2.7964F, 5.7725F, 29.2315F);
		bullet556bottom.addChild(bullet_r78);
		setRotationAngle(bullet_r78, -0.2783F, 0.1274F, -1.1523F);
		bullet_r78.cubeList.add(new ModelBox(bullet_r78, 0, 43, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r79 = new ModelRenderer(this);
		bullet_r79.setRotationPoint(-0.8167F, 5.1682F, 29.8532F);
		bullet556bottom.addChild(bullet_r79);
		setRotationAngle(bullet_r79, 0.0F, 0.0F, 1.1345F);
		bullet_r79.cubeList.add(new ModelBox(bullet_r79, 42, 27, 0.4F, -1.0F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet_r80 = new ModelRenderer(this);
		bullet_r80.setRotationPoint(3.7256F, 5.1682F, 29.8532F);
		bullet556bottom.addChild(bullet_r80);
		setRotationAngle(bullet_r80, 0.0F, 0.0F, -1.1345F);
		bullet_r80.cubeList.add(new ModelBox(bullet_r80, 11, 44, -1.4F, -1.0F, -0.5F, 1, 1, 1, -0.1F, false));

		bullet556 = new ModelRenderer(this);
		bullet556.setRotationPoint(-3.0511F, -12.39F, 0.5218F);
		bullet556.cubeList.add(new ModelBox(bullet556, 39, 18, 4.0055F, -8.1737F, 0.5782F, 1, 1, 1, -0.2F, false));

		bullet_r81 = new ModelRenderer(this);
		bullet_r81.setRotationPoint(4.6633F, -3.6023F, 1.466F);
		bullet556.addChild(bullet_r81);
		setRotationAngle(bullet_r81, 1.5708F, -1.4748F, -1.5708F);
		bullet_r81.cubeList.add(new ModelBox(bullet_r81, 0, 30, -0.3831F, -4.5209F, -0.3423F, 1, 7, 1, -0.2F, false));

		bullet_r82 = new ModelRenderer(this);
		bullet_r82.setRotationPoint(4.6633F, -3.6023F, 1.466F);
		bullet556.addChild(bullet_r82);
		setRotationAngle(bullet_r82, 2.9932F, -0.7854F, 3.1416F);
		bullet_r82.cubeList.add(new ModelBox(bullet_r82, 36, 14, -0.6586F, -1.4666F, -0.4855F, 1, 4, 1, -0.2F, false));

		bullet_r83 = new ModelRenderer(this);
		bullet_r83.setRotationPoint(4.1284F, -3.6023F, 1.2465F);
		bullet556.addChild(bullet_r83);
		setRotationAngle(bullet_r83, 2.9932F, 0.7854F, 3.1416F);
		bullet_r83.cubeList.add(new ModelBox(bullet_r83, 36, 19, -0.6586F, -1.4666F, -0.4855F, 1, 4, 1, -0.2F, false));

		bullet_r84 = new ModelRenderer(this);
		bullet_r84.setRotationPoint(4.1284F, -3.6023F, 1.2465F);
		bullet556.addChild(bullet_r84);
		setRotationAngle(bullet_r84, -3.1416F, 0.0F, -3.0456F);
		bullet_r84.cubeList.add(new ModelBox(bullet_r84, 4, 30, -0.3831F, -4.5209F, -0.3423F, 1, 7, 1, -0.2F, false));

		bullet_r85 = new ModelRenderer(this);
		bullet_r85.setRotationPoint(4.3478F, -3.6023F, 0.7116F);
		bullet556.addChild(bullet_r85);
		setRotationAngle(bullet_r85, -0.1484F, 0.7854F, 0.0F);
		bullet_r85.cubeList.add(new ModelBox(bullet_r85, 36, 24, -0.6586F, -1.4666F, -0.4855F, 1, 4, 1, -0.2F, false));

		bullet_r86 = new ModelRenderer(this);
		bullet_r86.setRotationPoint(4.3478F, -3.6023F, 0.7116F);
		bullet556.addChild(bullet_r86);
		setRotationAngle(bullet_r86, -1.5708F, 1.4748F, -1.5708F);
		bullet_r86.cubeList.add(new ModelBox(bullet_r86, 8, 30, -0.3831F, -4.5209F, -0.3423F, 1, 7, 1, -0.2F, false));

		bullet_r87 = new ModelRenderer(this);
		bullet_r87.setRotationPoint(4.9492F, -4.132F, 1.0888F);
		bullet556.addChild(bullet_r87);
		setRotationAngle(bullet_r87, 0.0F, 0.0F, -0.096F);
		bullet_r87.cubeList.add(new ModelBox(bullet_r87, 12, 30, -0.5F, -4.0F, -0.5F, 1, 7, 1, -0.2F, false));

		bullet_r88 = new ModelRenderer(this);
		bullet_r88.setRotationPoint(4.8058F, -3.1715F, 0.7838F);
		bullet556.addChild(bullet_r88);
		setRotationAngle(bullet_r88, -0.1484F, -0.7854F, 0.0F);
		bullet_r88.cubeList.add(new ModelBox(bullet_r88, 36, 29, -0.5F, -1.9F, -0.5F, 1, 4, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		casing.render(f5);
		
		//bullet556.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}