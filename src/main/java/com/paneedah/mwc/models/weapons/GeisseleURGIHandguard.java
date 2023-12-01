package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GeisseleURGIHandguard extends ModelWithAttachments {
	private final ModelRenderer handguard;
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
	private final ModelRenderer rail1;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer rail2;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;

	public GeisseleURGIHandguard() {
		textureWidth = 200;
		textureHeight = 200;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-0.0607F, -12.7464F, -47.5F);
		handguard.cubeList.add(new ModelBox(handguard, 4, 41, 0.2117F, -1.9893F, -8.5F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 41, 0.2117F, -1.9893F, -2.75F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 40, 39, 0.2117F, -1.9893F, 3.0F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 34, 0.2117F, -1.9893F, 8.5F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 52, 0, 0.2117F, -1.9893F, 14.25F, 1, 1, 8, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 78, 76, 0.4107F, -1.1893F, -14.1F, 1, 1, 36, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 76, 0.4107F, -2.9893F, -13.1F, 1, 1, 35, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 16, 30, 0.3107F, -2.8893F, -14.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 28, 28, -4.1893F, -2.8893F, -14.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 40, 39, -1.6893F, -5.3536F, -13.55F, 1, 1, 9, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 0, -2.2393F, -5.8536F, -13.55F, 2, 1, 36, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 39, -2.6393F, -5.8546F, -13.55F, 2, 1, 36, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 15, 18, -2.6393F, -5.8546F, -14.3F, 2, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 19, -2.2393F, -5.8536F, -14.3F, 2, 1, 2, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 16, -1.6893F, -5.3536F, -14.15F, 1, 1, 1, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 15, -1.6893F, -5.3536F, -1.8F, 1, 1, 3, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 15, 0, -1.6893F, -5.3536F, 3.95F, 1, 1, 3, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 15, -1.6893F, -5.3536F, 9.95F, 1, 2, 13, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 14, -2.1893F, -5.3536F, -14.15F, 1, 1, 1, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 5, 6, -2.1893F, -5.3536F, -1.8F, 1, 1, 3, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 9, -2.1893F, -5.3536F, 3.95F, 1, 1, 3, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -2.1893F, -5.3536F, 9.95F, 1, 2, 13, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 13, 40, -2.1893F, -5.3536F, -13.55F, 1, 1, 9, -0.14F, false));
		handguard.cubeList.add(new ModelBox(handguard, 8, 30, -1.9393F, -2.2893F, -13.999F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 4, 35, -4.0903F, -1.9893F, -8.5F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 8, 35, -4.0903F, -1.9893F, -2.75F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 12, 35, -4.0903F, -1.9893F, 3.0F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 16, 35, -4.0903F, -1.9893F, 8.5F, 1, 1, 1, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 49, -4.0903F, -1.9893F, 14.25F, 1, 1, 8, 0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 40, 75, -4.2893F, -1.1893F, -14.1F, 1, 1, 36, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 0, -4.2893F, -2.9893F, -13.1F, 1, 1, 35, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.1287F, 0.0642F, 0.0F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 12, 30, -0.5007F, -1.0F, -14.001F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.6944F, -0.6429F, 2.85F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 10, 50, -0.501F, 0.65F, 11.25F, 1, 1, 8, 0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 12, -0.501F, 0.65F, 8.5F, 1, 1, 1, 0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 10, -0.501F, 0.65F, 3.0F, 1, 1, 1, 0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 6, -0.501F, 0.65F, -2.75F, 1, 1, 1, 0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 39, 4, -0.501F, 0.65F, -8.5F, 1, 1, 1, 0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 4, 39, -0.501F, 0.65F, -14.0F, 1, 1, 1, 0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.1216F, 1.2127F, 0.9F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 76, -0.5F, -1.0F, -15.0F, 1, 1, 36, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.2701F, 0.0642F, 0.9F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 76, 113, -0.5F, -1.0F, -14.0F, 1, 1, 35, -0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.1216F, -4.3914F, 0.9F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 113, -0.5F, 0.0F, -14.0F, 1, 1, 35, -0.1F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.2701F, -3.2429F, 0.9F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 39, 112, -0.5F, 0.0F, -14.0F, 1, 1, 35, -0.1F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.6944F, -2.5358F, 2.85F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 40, 49, -0.501F, -1.65F, 11.25F, 1, 1, 8, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 2, -0.501F, -1.65F, 8.5F, 1, 1, 1, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 39, 0, -0.501F, -1.65F, 3.0F, 1, 1, 1, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 39, -0.501F, -1.65F, -2.75F, 1, 1, 1, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 28, 35, -0.501F, -1.65F, -8.5F, 1, 1, 1, 0.1F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 24, 35, -0.501F, -1.65F, -14.0F, 1, 1, 1, 0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.5913F, -1.4893F, 17.75F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.1309F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 20, 35, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 13, 39, 3.804F, -0.5F, -0.5F, 1, 1, 1, 0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.25F, 0.0642F, 0.0F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 20, 30, -0.4993F, -1.0F, -14.001F, 1, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-2.7815F, -3.4958F, 0.0F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 20, 0, -0.5668F, -1.0F, -14.0F, 1, 2, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.0971F, -3.4958F, 0.0F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 4, 30, -0.4332F, -1.0F, -14.0F, 1, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.8157F, -0.6429F, 2.85F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 50, 50, -0.499F, 0.65F, 11.25F, 1, 1, 8, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 24, -0.499F, 0.65F, 8.5F, 1, 1, 1, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 39, -0.499F, 0.65F, 3.0F, 1, 1, 1, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 22, -0.499F, 0.65F, -2.75F, 1, 1, 1, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 39, 20, -0.499F, 0.65F, -8.5F, 1, 1, 1, 0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 39, -0.499F, 0.65F, -14.0F, 1, 1, 1, 0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.7571F, 1.2127F, 0.9F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 78, 39, -0.5F, -1.0F, -15.0F, 1, 1, 36, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.3914F, 0.0642F, 0.9F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.7854F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 113, 114, -0.5F, -1.0F, -14.0F, 1, 1, 35, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.7571F, -4.3914F, 0.9F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 116, 1, -0.5F, 0.0F, -14.0F, 1, 1, 35, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.3914F, -3.2429F, 0.9F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 116, 37, -0.5F, 0.0F, -14.0F, 1, 1, 35, -0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.8157F, -2.5358F, 2.85F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 51, 39, -0.499F, -1.65F, 11.25F, 1, 1, 8, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 26, -0.499F, -1.65F, 8.5F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 28, 39, -0.499F, -1.65F, 3.0F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 30, -0.499F, -1.65F, -2.75F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 39, -0.499F, -1.65F, -8.5F, 1, 1, 1, 0.1F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 39, 32, -0.499F, -1.65F, -14.0F, 1, 1, 1, 0.1F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.1287F, -3.2429F, 0.0F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 30, -0.5F, -1.0F, -14.001F, 1, 2, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.25F, -3.2429F, 0.0F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 30, -0.5F, -1.0F, -14.001F, 1, 2, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.7036F, 0.1749F, -0.5F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 1.5708F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 4, -3.25F, -1.3F, 21.0F, 3, 4, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.2036F, 0.1749F, 0.0F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 1.5708F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 0, -4.25F, -1.3F, 21.0F, 5, 3, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-1.7036F, 0.9249F, 0.0F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 1.5708F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 0, -0.25F, -1.3F, -13.999F, 1, 2, 37, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-1.7036F, -4.3678F, 0.0F);
		handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 1.5708F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 40, 37, -0.2358F, -1.3F, -13.999F, 1, 2, 36, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.0903F, -2.3893F, 17.95F);
		handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.3927F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 28, 33, -0.5F, -0.5F, 3.0F, 1, 1, 1, 0.1F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.0903F, -0.7178F, 17.95F);
		handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.3927F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 24, 33, -0.5F, -0.5F, 3.0F, 1, 1, 1, 0.1F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.2117F, -0.7178F, 17.95F);
		handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.3927F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 31, 34, -0.5F, -0.5F, 3.0F, 1, 1, 1, 0.1F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.2117F, -2.3893F, 17.95F);
		handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.3927F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 35, -0.5F, -0.5F, 3.0F, 1, 1, 1, 0.1F, false));

		rail1 = new ModelRenderer(this);
		rail1.setRotationPoint(1.5788F, -1.8351F, -9.5161F);
		handguard.addChild(rail1);
		setRotationAngle(rail1, 0.0F, 0.0F, 1.5708F);
		

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.0F, 0.1114F, 0.2661F);
		rail1.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -3.1416F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 26, -1.0F, -0.168F, 1.35F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 11, -1.0F, -0.168F, 0.1F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 26, 26, -1.0F, -0.168F, 2.6F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 0, -1.0F, -0.168F, 3.85F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 2, -1.0F, -0.168F, -1.15F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 4, -1.0F, -0.168F, -2.4F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 39, 0, -1.0F, -0.468F, -4.25F, 2, 1, 9, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 13, -1.0F, -0.168F, -4.85F, 2, 1, 1, -0.2F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 28, 21, -1.0F, -0.168F, -3.65F, 2, 1, 1, -0.2F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.1114F, 0.2661F);
		rail1.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 2.1991F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 5, -1.1816F, -1.0757F, 0.1F, 1, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 8, 33, -1.1816F, -1.0757F, 1.35F, 1, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 12, -1.1816F, -1.0757F, 2.6F, 1, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 16, -1.1816F, -1.0757F, 3.85F, 1, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 20, 33, -1.1816F, -1.0757F, -1.15F, 1, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 33, 20, -1.1816F, -1.0757F, -2.4F, 1, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 15, -1.1816F, -1.0757F, -4.85F, 2, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 28, 17, -1.1816F, -1.0757F, -3.65F, 2, 1, 1, -0.202F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 39, 20, -1.0816F, -1.1757F, -4.05F, 2, 1, 9, -0.3F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 15, 15, -1.0811F, -1.1765F, -4.95F, 2, 1, 2, -0.3F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.1114F, 0.2661F);
		rail1.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, -2.1991F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 7, 0.1816F, -1.0757F, 0.1F, 1, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 12, 33, 0.1816F, -1.0757F, 2.6F, 1, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 14, 0.1816F, -1.0757F, 1.35F, 1, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 16, 33, 0.1816F, -1.0757F, 3.85F, 1, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 18, 0.1816F, -1.0757F, -1.15F, 1, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 33, 22, 0.1816F, -1.0757F, -2.4F, 1, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 6, -0.8184F, -1.0757F, -4.85F, 2, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 28, 19, -0.8184F, -1.0757F, -3.65F, 2, 1, 1, -0.202F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 15, 10, -0.9189F, -1.1765F, -4.95F, 2, 1, 2, -0.3F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 39, 10, -0.9184F, -1.1757F, -4.05F, 2, 1, 9, -0.3F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(-4.4212F, -1.8351F, -9.5161F);
		handguard.addChild(rail2);
		setRotationAngle(rail2, 0.0F, 0.0F, -1.5708F);
		

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, 0.1114F, 0.2661F);
		rail2.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 0.0F, -3.1416F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 10, -1.0F, -0.168F, 1.35F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 7, -1.0F, -0.168F, 0.1F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 18, -1.0F, -0.168F, 2.6F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 7, 21, -1.0F, -0.168F, 3.85F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 10, -1.0F, -0.168F, -1.15F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 21, -1.0F, -0.168F, -2.4F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 15, 0, -1.0F, -0.468F, -4.25F, 2, 1, 9, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 5, 23, -1.0F, -0.168F, -4.85F, 2, 1, 1, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 21, 25, -1.0F, -0.168F, -3.65F, 2, 1, 1, -0.2F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.1114F, 0.2661F);
		rail2.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 2.1991F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 8, 4, -1.1816F, -1.0757F, 0.1F, 1, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 10, -1.1816F, -1.0757F, 1.35F, 1, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 27, -1.1816F, -1.0757F, 2.6F, 1, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 31, 32, -1.1816F, -1.0757F, 3.85F, 1, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 33, 1, -1.1816F, -1.0757F, -1.15F, 1, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 33, 3, -1.1816F, -1.0757F, -2.4F, 1, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 24, -1.1816F, -1.0757F, -4.85F, 2, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 5, 25, -1.1816F, -1.0757F, -3.65F, 2, 1, 1, -0.202F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 39, -1.0816F, -1.1757F, -4.05F, 2, 1, 9, -0.3F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 5, 15, -1.0811F, -1.1765F, -4.95F, 2, 1, 2, -0.3F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, 0.1114F, 0.2661F);
		rail2.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, -2.1991F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 22, 0.1816F, -1.0757F, 0.1F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 25, 0.1816F, -1.0757F, 2.6F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 28, 31, 0.1816F, -1.0757F, 1.35F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 31, 30, 0.1816F, -1.0757F, 3.85F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 33, 0.1816F, -1.0757F, -1.15F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 4, 33, 0.1816F, -1.0757F, -2.4F, 1, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 22, -0.8184F, -1.0757F, -4.85F, 2, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 25, -0.8184F, -1.0757F, -3.65F, 2, 1, 1, -0.202F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 4, -0.9189F, -1.1765F, -4.95F, 2, 1, 2, -0.3F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 15, 15, -0.9184F, -1.1757F, -4.05F, 2, 1, 9, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}