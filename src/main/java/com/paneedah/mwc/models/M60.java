package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer stock;
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
	private final ModelRenderer grip;
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
	private final ModelRenderer receiver;
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
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r45;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r46;
	private final ModelRenderer barrel;
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
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r73;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r74;

	public M60() {
		textureWidth = 850;
		textureHeight = 850;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-1.0F, 24.0F, -3.0F);
		

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, -32.5F, 35.5F);
		gun.addChild(stock);
		stock.cubeList.add(new ModelBox(stock, 51, 103, -3.025F, -9.5F, -3.5F, 6, 9, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 51, 51, -3.425F, -9.5F, -3.5F, 6, 9, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 51, 0, -2.525F, -9.5F, -3.5F, 6, 9, 19, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 23, 83, -3.0F, -0.5F, -3.5F, 6, 1, 7, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stock.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 17, -3.0F, 1.8F, -3.8F, 6, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 45, -3.0F, 1.8F, -3.1F, 6, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0F, -15.7909F, 10.4606F);
		stock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.1415F, -0.1666F, 0.8608F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 67, 186, 0.0F, -0.0237F, -4.2164F, 4, 1, 8, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 23, 115, 0.0F, 0.8763F, -4.2164F, 4, 1, 8, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -15.7909F, 10.4606F);
		stock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.1415F, 0.1666F, -0.8608F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 116, 186, -4.0F, -0.0237F, -4.2164F, 4, 1, 8, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 169, 190, -4.0F, 0.8763F, -4.2164F, 4, 1, 8, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.0F, -15.8F, 19.8F);
		stock.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0968F, -0.0883F, -0.7375F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 168, 56, -1.0F, 0.4046F, -6.007F, 1, 1, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 147, 91, -1.0F, 0.0046F, -2.007F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 34, 170, -1.0F, 0.0046F, -6.007F, 1, 1, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 95, 154, -1.0F, 0.4046F, -2.007F, 1, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(2.0F, 8.5704F, 15.7076F);
		stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0657F, -0.1133F, -1.0435F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 133, 0.0F, -0.9914F, -5.1305F, 2, 1, 6, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(3.0F, 4.2473F, 7.9378F);
		stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.5182F, 0.2421F, 0.3981F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 79, -1.0F, 0.2638F, -10.4343F, 1, 2, 14, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 72, 131, -1.0F, -0.0362F, -10.4343F, 1, 2, 14, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.0F, 4.2473F, 7.9378F);
		stock.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.5182F, -0.2421F, -0.3981F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 154, 0.0F, 0.2638F, -10.4343F, 1, 2, 14, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 114, 170, 0.0F, -0.0362F, -10.4343F, 1, 2, 14, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0F, 8.5704F, 15.7076F);
		stock.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0657F, 0.1133F, 1.0435F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 135, 12, -2.0F, -0.9914F, -5.1305F, 2, 1, 6, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.0F, -15.8F, 19.8F);
		stock.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0968F, 0.0883F, 0.7375F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 85, 170, 0.0F, 0.4046F, -6.007F, 1, 1, 4, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 91, 171, 0.0F, 0.0046F, -6.007F, 1, 1, 4, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 27, 158, 0.0F, 0.4046F, -2.007F, 1, 1, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 158, 0.0F, 0.0046F, -2.007F, 1, 1, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.0F, 8.5704F, 15.7076F);
		stock.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1309F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 154, 0.0F, -1.9914F, -1.1305F, 4, 2, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -4.5F, 6.0F);
		stock.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1309F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 35, 154, -2.0F, -13.0F, 10.2F, 4, 2, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 173, -3.0F, -12.0F, 10.2F, 6, 22, 2, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 135, 63, -2.0F, -13.0F, 6.2F, 4, 2, 4, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 28, -2.0F, 9.7F, 5.2F, 4, 2, 5, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 130, 155, -3.0F, -12.0F, 6.2F, 6, 22, 4, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-2.0F, -15.7909F, 10.4606F);
		stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 16, 185, 0.0F, -0.0237F, -4.2164F, 4, 2, 8, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.0F, 4.2473F, 7.9378F);
		stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.5672F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 155, 120, 0.0F, -6.0362F, -7.4343F, 6, 6, 11, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, -4.5F, 6.0F);
		stock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 155, 104, -2.0F, 6.3F, -4.1F, 4, 2, 14, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -9.5F, 6.0F);
		stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.2182F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 125, -3.45F, -4.0F, 1.45F, 6, 9, 8, 0.0F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 125, 104, -2.55F, -4.0F, 1.45F, 6, 9, 8, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, -30.0F, 0.0F);
		gun.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 255, 50, -2.0F, -3.0F, -13.0F, 4, 2, 22, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 137, 146, -2.1F, -3.0F, -2.0F, 4, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 140, -2.1F, -3.0F, -8.0F, 4, 2, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 60, 84, -2.1F, -2.5F, -4.6F, 4, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 60, 64, -2.1F, -2.5F, -9.6F, 4, 1, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 347, -2.0F, -1.0F, -16.0F, 4, 1, 24, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 51, 194, -2.0F, -0.5F, -13.0F, 4, 1, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 25, 0, -0.5F, 0.5F, -7.1F, 1, 3, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 64, 28, -1.0F, 0.0F, -13.3F, 2, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 135, 35, -1.0F, 4.6F, -10.9F, 2, 1, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 181, 167, -2.0F, 0.0F, -4.0F, 4, 4, 8, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.2618F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 104, 132, -1.0F, 13.2F, -2.3F, 2, 1, 6, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 78, 40, -2.0F, 12.3F, -1.5F, 4, 1, 5, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 10.6F, 8.075F);
		grip.addChild(cube_r17);
		setRotationAngle(cube_r17, 1.2217F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 91, 8, -1.0F, -1.0195F, -2.3387F, 2, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 91, 36, -2.0F, -1.6195F, -1.6387F, 4, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 185, 145, -1.0F, -1.0195F, -1.9387F, 2, 1, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-1.0F, 5.783F, 5.8448F);
		grip.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.587F, -0.7029F, -0.4061F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 120, 51, -1.4F, -5.7113F, -0.9532F, 1, 11, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 120, 74, -1.0F, -5.7113F, -0.9532F, 1, 11, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.0F, 5.783F, 5.8448F);
		grip.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.587F, 0.7029F, 0.4061F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 120, 23, 0.0F, -5.7113F, -0.9532F, 1, 11, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 120, 0, 0.4F, -5.7113F, -0.9532F, 1, 11, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.4363F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 154, -1.0F, 2.0F, 1.9F, 2, 11, 1, 0.0F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 0, -2.0F, 2.0F, -4.1F, 4, 11, 6, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 2.0F, -4.0F);
		grip.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.7418F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 139, 80, -2.0F, -3.0F, 0.0F, 4, 3, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 12.1F, 1.3F);
		grip.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.2618F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 21, 125, -1.0F, -2.0F, -1.3F, 2, 4, 2, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 4.0F, -13.3F);
		grip.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.6109F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 185, 163, -1.0F, -1.0177F, 0.8978F, 2, 1, 2, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 186, 81, -1.0F, -1.0177F, -0.0022F, 2, 1, 2, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, 5.6F, -4.9F);
		grip.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.48F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 168, -1.0F, -0.9902F, 0.0282F, 2, 1, 3, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, 1.0F, -7.1F);
		grip.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7418F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 23, 180, -0.5F, -1.5F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, 1.0F, -7.1F);
		grip.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.3491F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 186, 75, -0.5F, 2.0F, -1.4F, 1, 1, 3, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, 0.0F, -9.0F);
		grip.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.7854F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 168, 181, -1.0F, -2.2F, -3.7F, 2, 1, 2, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, -1.0F, 9.0F);
		grip.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.5672F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 70, -2.0F, -2.0F, -7.0F, 4, 2, 6, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, -3.0F, -13.0F);
		grip.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.5236F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 60, 108, -2.0F, 1.6F, 0.0F, 4, 1, 1, 0.0F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 78, 36, -2.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, -1.0F, 9.0F);
		grip.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.7854F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 60, 92, -2.0F, -1.0F, -1.5F, 4, 1, 1, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 91, 98, -2.0F, -1.0F, -1.0F, 4, 1, 1, 0.0F, false));

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, -37.0F, 0.0F);
		gun.addChild(receiver);
		receiver.cubeList.add(new ModelBox(receiver, 663, 682, -3.0F, 3.0F, -20.0F, 6, 1, 52, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 35, -3.0F, -6.0F, -20.0F, 6, 9, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 176, 36, -2.5F, -8.0F, -22.0F, 5, 2, 8, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 139, 6, -2.5F, -6.0F, -22.0F, 5, 3, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 14, 0, -2.5F, -12.0F, -22.0F, 1, 4, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 0, 1.5F, -12.0F, -22.0F, 1, 4, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 70, -2.5F, -12.0F, -16.0F, 1, 4, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 59, 1.5F, -12.0F, -16.0F, 1, 4, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 104, 144, -3.4F, 4.0F, -20.0F, 7, 2, 7, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 689, 598, -3.0F, -3.0F, -20.0F, 1, 6, 52, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 20, 154, -3.4F, -0.9F, 18.5F, 1, 3, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 146, 23, -3.4F, -2.5F, 24.7F, 1, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 191, 145, -3.5F, -2.2F, 24.9F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 192, 13, -3.4F, -1.7F, 26.5F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 149, 191, -3.4F, -1.7F, 23.325F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 146, 19, -3.4F, -2.5F, 24.1F, 1, 2, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 125, 124, -3.4F, -0.9F, 19.0F, 1, 3, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 405, 619, -3.0F, -3.0F, -20.0F, 1, 6, 52, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 208, 207, -3.0F, -6.0F, 1.0F, 1, 3, 42, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 125, 124, 2.0F, -10.0F, 40.0F, 1, 9, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 23, 115, -3.0F, -10.0F, 40.0F, 1, 4, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 139, 57, -2.0F, -10.4F, 40.0F, 4, 1, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 139, 23, -3.0F, -6.0F, -20.0F, 1, 3, 5, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 154, -2.7F, -6.3F, -15.3F, 2, 1, 17, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 155, 18, -3.3F, -6.3F, -15.3F, 1, 1, 17, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 155, 0, -3.0F, -6.3F, -15.3F, 1, 1, 17, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 624, 610, 2.0F, -6.0F, -20.0F, 1, 9, 63, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 191, 87, 2.2F, -2.2F, 19.5F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 191, 75, 2.2F, -2.2F, 5.5F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 79, 2.2F, -2.5F, -20.2F, 1, 2, 19, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 95, 2.7F, -2.3F, -2.6F, 7, 2, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 104, 16, 2.7F, 2.3F, -4.6F, 6, 1, 3, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 23, 103, 8.8F, -2.7F, -4.6F, 1, 5, 3, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 91, 28, 8.8F, -3.3F, -4.6F, 1, 5, 3, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 23, 70, 8.8F, -2.7F, -11.0F, 1, 5, 5, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 37, 70, 8.8F, -3.3F, -11.0F, 1, 5, 5, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 38, 0, 8.8F, -2.7F, -15.2F, 1, 5, 3, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 78, 28, 8.8F, -3.3F, -15.2F, 1, 5, 3, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 17, 2.7F, 2.3F, -15.2F, 6, 1, 3, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 25, 14, 2.7F, 2.3F, -11.0F, 6, 1, 5, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 82, 67, 2.7F, -2.8F, -2.6F, 7, 2, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 67, 2.7F, -2.3F, -15.6F, 7, 2, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 82, 16, 2.7F, -2.8F, -15.6F, 7, 2, 1, -0.3F, false));
		receiver.cubeList.add(new ModelBox(receiver, 51, 0, 2.2F, -0.5F, -20.2F, 1, 3, 7, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 70, 172, 2.2F, 1.5F, -13.2F, 1, 1, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 174, 30, 2.2F, 0.5F, -3.2F, 1, 1, 3, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 165, 148, 2.2F, -0.5F, -3.2F, 1, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 165, 111, 2.2F, -0.5F, -3.7F, 1, 2, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 36, 103, 2.2F, 1.5F, -20.2F, 1, 3, 5, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 208, 104, 1.0F, -6.0F, -2.0F, 1, 1, 45, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 208, 50, -2.0F, -6.0F, -2.0F, 1, 1, 45, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 168, 51, 3.0F, -7.0F, -13.5F, 4, 1, 10, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 6, 154, 1.5F, -9.0F, -3.0F, 5, 3, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 36, 148, 1.5F, -9.0F, -15.0F, 5, 3, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(6.5F, -8.0F, -2.0F);
		receiver.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, -0.3054F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 60, 0, -0.3F, -1.0F, -1.0F, 1, 3, 1, 0.0F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 186, 84, 0.0F, -1.0F, -1.0F, 2, 3, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(6.5F, -8.0F, -15.0F);
		receiver.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.3054F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 60, 51, -0.3F, -1.0F, 0.0F, 1, 3, 1, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 83, 186, 0.0F, -1.0F, 0.0F, 2, 3, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(7.0F, -7.0F, -8.0F);
		receiver.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.8727F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 182, 179, 0.0F, 0.0F, -5.5F, 2, 1, 10, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, 0.0F, 0.0F);
		receiver.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.7854F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 191, 55, 2.6F, 0.8F, 0.325F, 1, 1, 1, -0.2F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 191, 66, 2.2F, 0.5F, 0.625F, 1, 1, 1, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 191, 68, 2.2F, 0.9F, 0.625F, 1, 1, 1, 0.0F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 191, 71, 2.2F, 0.5F, 0.2F, 1, 1, 1, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(8.4F, 3.0F, -3.1F);
		receiver.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.7418F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 139, 0, -0.2F, -0.7F, -7.9F, 2, 1, 5, -0.3F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 20, 163, -0.2F, -0.7F, -1.5F, 2, 1, 3, -0.3F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 35, 163, -0.3F, -0.7F, -1.5F, 2, 1, 3, -0.3F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 155, 114, -0.3F, -0.7F, -12.1F, 2, 1, 3, -0.3F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 143, 133, -0.2F, -0.7F, -12.1F, 2, 1, 3, -0.3F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-2.0F, -10.4F, 41.5F);
		receiver.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.0F, 1.1868F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 186, 71, 0.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-2.5F, -5.5F, 41.5F);
		receiver.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.6109F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 179, 144, 4.5F, -0.5F, -2.1F, 1, 2, 1, 0.0F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 179, 162, -0.5F, -0.5F, -2.1F, 1, 2, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-2.9F, -0.7F, -26.5F);
		receiver.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.7854F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 155, 191, -0.5F, -36.95F, 34.5F, 1, 1, 1, 0.0F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 191, 151, -0.5F, -37.05F, 34.5F, 1, 1, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-2.9F, -0.7F, 26.5F);
		receiver.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.7854F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 159, 191, -0.5F, -1.0F, 0.4F, 1, 1, 1, 0.0F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 191, 163, -0.5F, -1.1F, 0.4F, 1, 1, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-2.7F, 0.5F, -12.0F);
		receiver.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.7854F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 191, 93, -0.5F, -1.4F, -1.575F, 1, 1, 1, 0.0F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 191, 118, -0.5F, -0.875F, -1.575F, 1, 1, 1, 0.0F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 139, 191, -0.5F, -1.4F, -0.975F, 1, 1, 1, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, -11.0F, -15.0F);
		receiver.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.7854F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 43, 161, -2.5F, -1.4F, -2.0F, 1, 2, 2, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 96, 157, 1.5F, -1.4F, -2.0F, 1, 2, 2, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.0F, -10.0F, -21.0F);
		receiver.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.7854F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 147, 148, -2.5F, -2.4F, 0.4F, 1, 2, 2, -0.3F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 0, 133, 4.4F, -2.3F, 0.3F, 1, 2, 2, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 35, 175, 2.9F, -2.3F, 0.3F, 2, 2, 2, -0.1F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 98, 191, 2.2F, -1.8F, 0.8F, 1, 1, 1, 0.0F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 147, 71, 1.8F, -2.4F, 0.4F, 1, 2, 2, -0.3F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 147, 63, 1.2F, -2.4F, 0.4F, 1, 2, 2, -0.3F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 147, 51, 1.5F, -2.4F, 0.4F, 1, 2, 2, -0.3F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 146, 155, -2.2F, -2.4F, 0.4F, 1, 2, 2, -0.3F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 80, 157, -2.8F, -2.4F, 0.4F, 1, 2, 2, -0.3F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, -5.0F, 41.5F);
		receiver.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.9163F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 72, 95, -3.0F, 0.2F, 0.0F, 6, 1, 2, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(2.0F, -10.4F, 41.5F);
		receiver.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, -1.1868F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 186, 67, -1.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		receiver.addChild(bone6);
		

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.7854F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 94, 191, -3.0F, -5.0F, -3.9F, 1, 1, 1, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 143, 191, -3.0F, -5.0F, -3.1F, 1, 1, 1, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 133, 144, -3.0F, -3.8F, -2.0F, 1, 2, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 0.0F, -16.8F);
		bone6.addChild(bone7);
		

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r46);
		setRotationAngle(cube_r46, -0.7854F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 135, 35, -3.0F, -6.0F, -4.1F, 1, 2, 2, 0.0F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 104, 144, -3.0F, -3.8F, -2.0F, 1, 2, 2, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-0.8F, -17.4F, -29.0F);
		barrel.cubeList.add(new ModelBox(barrel, 51, 10, -3.2F, -3.0F, -5.5F, 6, 4, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 155, 165, -1.2F, -5.0F, -5.5F, 2, 2, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 520, 104, -1.0F, -2.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 346, 138, -1.2F, 3.0F, -73.0F, 2, 1, 28, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 168, 51, -1.2F, 1.0F, -62.0F, 2, 2, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 58, 166, -1.2F, 1.0F, -71.0F, 2, 2, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 185, 155, -1.1F, -2.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 155, 185, -0.3F, -2.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 141, 185, -1.1F, 1.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 177, 104, -0.3F, -2.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 177, 108, -1.1F, -2.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 179, 62, -0.3F, 1.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 39, 180, -1.1F, 1.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 104, 104, -0.3F, -2.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 111, -1.1F, -2.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 146, 121, -0.7F, -12.2F, -91.0F, 1, 10, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 164, -1.2F, -13.2F, -91.0F, 2, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 167, 80, -0.7F, -14.5F, -90.05F, 1, 2, 1, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 167, 86, -0.7F, -12.2F, -89.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 63, -0.3F, 1.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 131, -1.1F, 1.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 185, 141, -0.3F, 1.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 624, 104, -1.2F, 3.7F, -84.0F, 1, 4, 91, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 624, 0, -0.6F, 3.7F, -84.0F, 1, 4, 91, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 346, 104, -1.2F, 7.0F, -73.0F, 2, 1, 28, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 104, 516, -0.4F, 1.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 312, 516, -1.0F, 1.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 520, 1, -0.4F, -2.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 16, 173, -0.4F, 1.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 173, 69, -1.0F, 1.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 174, 0, -0.4F, -2.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 174, 18, -1.0F, -2.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 312, 310, -1.0F, -2.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 344, 70, -1.2F, 3.0F, -73.0F, 2, 1, 28, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 60, 79, -1.2F, 1.0F, -62.0F, 2, 2, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 60, 59, -1.2F, 1.0F, -71.0F, 2, 2, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 174, 22, -1.1F, -2.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 172, 141, -0.3F, -2.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 172, 137, -1.1F, 1.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 162, 162, -0.3F, -2.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 162, 157, -1.1F, -2.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 20, 145, -0.3F, 1.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 8, 145, -1.1F, 1.2F, -62.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 103, -0.3F, -2.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 103, -1.1F, -2.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 140, 124, -0.7F, -12.2F, -91.0F, 1, 10, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 25, 7, -1.2F, -13.2F, -91.0F, 2, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 106, -0.7F, -14.5F, -90.05F, 1, 2, 1, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 95, 164, -0.7F, -12.2F, -89.0F, 1, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 79, -0.3F, 1.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 51, -1.1F, 1.2F, -91.0F, 1, 1, 7, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 41, -0.3F, 1.2F, -71.0F, 1, 1, 3, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 613, 408, -1.2F, 3.7F, -84.0F, 1, 4, 91, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 520, 207, -0.6F, 3.7F, -84.0F, 1, 4, 91, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 42, 256, -1.2F, 7.0F, -73.0F, 2, 1, 28, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 312, 207, -0.4F, 1.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 312, 104, -1.0F, 1.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 312, 1, -0.4F, -2.0F, -96.0F, 1, 1, 102, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 172, 155, -0.4F, 1.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 172, 137, -1.0F, 1.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 23, -0.4F, -2.0F, -107.0F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 126, 0, -1.0F, -2.0F, -107.0F, 1, 1, 11, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.2618F, 0.0F, -0.7854F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 4, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 82, 12, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 104, 63, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 104, 78, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.2618F, 0.0F, -0.7854F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 82, 55, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 23, 87, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 104, 86, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 0, 107, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.2618F, 0.0F, -2.3562F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 82, 63, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 83, 28, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 104, 55, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 104, 35, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.2618F, 0.0F, -2.3562F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 51, 83, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 87, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 104, 27, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 104, 12, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-0.2F, 0.0F, -42.5F);
		barrel.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, 2.3562F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 0, -0.2F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 103, -0.8F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 1, -0.8F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 104, -0.2F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 120, 190, -0.8F, 1.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 132, 190, -0.2F, 1.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 190, 141, -0.8F, -2.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 146, 190, -0.2F, -2.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 190, 159, -0.8F, 1.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 167, 190, -0.2F, 1.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 189, 190, -0.8F, -2.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 191, 15, -0.2F, -2.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 312, 413, -0.2F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 413, -0.8F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 208, 412, -0.8F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 0, 412, -0.2F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 192, 90, -0.8F, 1.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 87, 192, -0.2F, 1.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 192, 81, -0.8F, -2.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 192, 63, -0.2F, -2.0F, -64.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 192, 120, -0.8F, 1.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 120, 192, -0.2F, 1.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 104, 192, -0.8F, -2.0F, -54.5F, 1, 1, 1, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 91, 192, -0.2F, -2.0F, -54.5F, 1, 1, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.2F, 0.0F, -42.5F);
		barrel.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 1.5708F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 206, -0.2F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 104, 207, -0.8F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 208, 0, -0.8F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 208, 103, -0.2F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 78, 28, -0.2F, -2.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 23, 103, -0.8F, -2.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 126, 51, -0.8F, 1.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 126, 74, -0.2F, 1.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 416, 309, -0.2F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 416, 206, -0.8F, -2.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 416, 103, -0.8F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 416, 0, -0.2F, 1.0F, -53.5F, 1, 1, 102, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 177, 104, -0.2F, -2.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 168, 174, -0.8F, -2.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 155, 173, -0.8F, 1.0F, -64.5F, 1, 1, 11, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 173, 81, -0.2F, 1.0F, -64.5F, 1, 1, 11, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-0.2F, 0.0F, -144.5F);
		barrel.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, 0.7854F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 190, 112, -0.2F, -2.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 116, 190, -0.8F, -2.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 136, 190, -0.2F, 1.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 190, 137, -0.8F, 1.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 190, 149, -0.8F, -2.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 190, 155, -0.2F, -2.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 171, 190, -0.2F, 1.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 185, 190, -0.8F, 1.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 208, 206, -0.2F, -2.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 309, -0.8F, -2.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 208, 309, -0.8F, 1.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 104, 310, -0.2F, 1.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 192, 124, -0.2F, -2.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 192, 122, -0.8F, -2.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 192, 84, -0.2F, 1.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 83, 192, -0.8F, 1.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 45, 192, -0.8F, -2.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 192, 31, -0.2F, -2.0F, 37.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 116, 192, -0.2F, 1.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 108, 192, -0.8F, 1.0F, 47.5F, 1, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 416, 515, -0.2F, -2.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 208, 515, -0.8F, -2.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 0, 515, -0.8F, 1.0F, 48.5F, 1, 1, 102, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 416, 412, -0.2F, 1.0F, 48.5F, 1, 1, 102, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.2618F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 42, 87, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 91, 4, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 113, 78, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 113, 55, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.2618F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 51, 91, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 104, 4, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 113, 4, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 113, 27, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.2618F, 0.0F, 1.5708F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 91, 55, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 96, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 104, 108, -0.8F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 91, 107, -0.2F, 0.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-0.2F, 0.0F, -107.8365F);
		barrel.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.2618F, 0.0F, 1.5708F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 96, 28, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 28, 103, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 82, 107, -0.2F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 51, 107, -0.8F, -1.7153F, -0.6743F, 1, 1, 2, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-0.2F, 5.5F, -59.0F);
		barrel.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, 2.3562F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 312, 171, -1.0F, -2.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 312, 207, -1.0F, 1.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 344, 237, -1.0F, -2.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 344, 208, -1.0F, 1.5F, -14.0F, 2, 1, 28, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-0.2F, 5.5F, -59.0F);
		barrel.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, 1.5708F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 312, 236, -1.0F, -2.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 312, 265, -1.0F, 1.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 344, 311, -1.0F, -2.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 344, 266, -1.0F, 1.5F, -14.0F, 2, 1, 28, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-0.2F, 5.5F, -59.0F);
		barrel.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.7854F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 312, 310, -1.0F, -2.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 312, 339, -1.0F, 1.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 208, 345, -1.0F, -2.5F, -14.0F, 2, 1, 28, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 344, 340, -1.0F, 1.5F, -14.0F, 2, 1, 28, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-0.4F, 5.7F, -63.0F);
		barrel.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 2.3562F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 520, 309, -0.8F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 520, 412, -0.2F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 618, -0.8F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 613, 503, -0.2F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-0.4F, 5.7F, -63.0F);
		barrel.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 1.5708F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 520, 515, -0.8F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 531, 610, -0.2F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 427, 618, -0.8F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 219, 618, -0.2F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-0.4F, 5.7F, -63.0F);
		barrel.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, 0.7854F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 613, 211, -0.8F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 613, 313, -0.2F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 312, 622, -0.8F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 93, 622, -0.2F, -2.0F, -21.0F, 1, 4, 91, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-0.2F, 0.0F, -85.5F);
		barrel.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, 0.7854F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 51, 59, -0.1F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 82, 8, -0.9F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 51, 87, -0.9F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 103, -0.1F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 145, 12, -0.1F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 145, 104, -0.9F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 162, 139, -0.9F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 162, 144, -0.1F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 174, 0, -0.9F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 174, 4, -0.9F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 174, 12, -0.1F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 174, 18, -0.1F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 126, 86, -0.1F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 126, 12, -0.9F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 82, 111, -0.9F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 51, 111, -0.1F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 85, 179, -0.1F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 179, 31, -0.9F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 168, 177, -0.9F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 155, 177, -0.1F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 185, 137, -0.9F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 32, 185, -0.9F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 16, 185, -0.1F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 104, 184, -0.1F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-0.2F, 0.0F, -85.5F);
		barrel.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, 2.3562F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 82, 0, -0.1F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 82, 51, -0.9F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 104, 0, -0.9F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 104, 8, -0.1F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 145, 35, -0.1F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 145, 108, -0.9F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 10, 165, -0.9F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 40, 170, -0.1F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 172, 155, -0.9F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 172, 159, -0.9F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 16, 173, -0.1F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 29, 173, -0.1F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 126, 35, -0.1F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 125, -0.9F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 104, 82, -0.9F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 104, 74, -0.1F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 34, 179, -0.1F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 179, 13, -0.9F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 29, 177, -0.9F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 16, 177, -0.1F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 184, 12, -0.9F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 181, 179, -0.9F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 144, 181, -0.1F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 90, 180, -0.1F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-0.2F, 0.0F, -85.5F);
		barrel.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, 1.5708F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 82, 59, -0.9F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 83, -0.1F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 23, -0.9F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 31, -0.1F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 162, 82, -0.9F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 162, 87, -0.1F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 51, 172, -0.9F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 73, 172, -0.1F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 173, 81, -0.9F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 173, 85, -0.9F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 155, 173, -0.1F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 168, 173, -0.1F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 124, -0.9F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 112, -0.1F, -2.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 59, -0.9F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 104, 51, -0.1F, 1.2F, -5.5F, 1, 1, 7, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 178, 124, -0.9F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 178, 120, -0.1F, -2.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 90, 176, -0.9F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 73, 176, -0.1F, 1.2F, 23.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 184, 63, -0.9F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 51, 184, -0.9F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 37, 184, -0.1F, 1.2F, 14.5F, 1, 1, 3, 0.0F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 184, 30, -0.1F, -2.2F, 14.5F, 1, 1, 3, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-0.2F, -7.2F, -90.0F);
		barrel.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.3491F, 0.0F, 0.0F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 65, 35, -0.5F, -4.0F, 2.5F, 1, 11, 1, 0.0F, false));
		cube_r67.cubeList.add(new ModelBox(cube_r67, 98, 0, -0.5F, -5.0F, 2.9F, 1, 12, 1, 0.0F, false));
		cube_r67.cubeList.add(new ModelBox(cube_r67, 98, 103, -0.5F, -4.0F, 2.5F, 1, 11, 1, 0.0F, false));
		cube_r67.cubeList.add(new ModelBox(cube_r67, 98, 51, -0.5F, -5.0F, 2.9F, 1, 12, 1, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-0.2F, -12.7F, -89.5F);
		barrel.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, 0.9163F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 94, 45, 0.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 51, 176, 0.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-0.2F, -12.7F, -89.5F);
		barrel.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, 0.0F, -0.9163F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 130, 133, -1.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 176, 40, -1.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-0.2F, -12.7F, -89.5F);
		barrel.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.7854F, 0.0F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 16, 191, -0.5F, -1.3F, -0.425F, 1, 1, 1, -0.2F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 0, 115, -0.5F, -1.6F, -0.925F, 1, 1, 2, -0.2F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 192, 126, -0.5F, -1.3F, -0.425F, 1, 1, 1, -0.2F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 138, 46, -0.5F, -1.6F, -0.925F, 1, 1, 2, -0.2F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-0.2F, -5.0F, -4.0F);
		barrel.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, 0.0F, 0.7854F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 176, 36, -0.7F, -0.3F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 40, 176, -0.3F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-0.2F, -0.5F, -4.0F);
		barrel.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.7854F, 0.0F, 0.0F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 104, 67, -3.0F, -2.8F, 0.8F, 6, 2, 2, 0.0F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 104, 90, -3.0F, -2.8F, 0.7F, 6, 2, 2, 0.0F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 104, 139, -3.0F, -2.7F, 0.8F, 6, 2, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.9F, -4.2828F, -11.2F);
		barrel.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.7854F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.2F, -4.7828F, -7.2F);
		barrel.addChild(bone4);
		setRotationAngle(bone4, 0.2182F, 0.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.2F, -4.5F, -4.7F);
		barrel.addChild(bone2);
		

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, 0.7854F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 161, 91, -0.7F, -0.7F, -1.5F, 1, 1, 4, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.2F, -5.0F, -4.0F);
		barrel.addChild(bone);
		

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, 0.7854F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 85, 175, -0.7F, -0.7F, -1.5F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		barrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
