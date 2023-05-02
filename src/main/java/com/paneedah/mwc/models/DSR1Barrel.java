package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.0.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1Barrel extends ModelWithAttachments {
	private final QRenderer gun;
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
	private final ModelRenderer grip;
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
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final QRenderer handguard;
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
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final QRenderer handguard_railed;
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
	private final QRenderer barrel;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final QRenderer barrel_long;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer cube_r123;
	private final QRenderer boltaction;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final QRenderer boltaction_main;
	private final ModelRenderer cube_r126;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final QRenderer magazine_actual;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer cube_r136;
	private final QRenderer magazine_ext;
	private final ModelRenderer cube_r137;
	private final ModelRenderer cube_r138;
	private final ModelRenderer cube_r139;
	private final ModelRenderer cube_r140;
	private final ModelRenderer cube_r141;
	private final ModelRenderer cube_r142;

	public DSR1Barrel() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, -6.0F, -7.0F);
		gun.cubeList.add(new ModelBox(gun, 271, 75, -3.5F, -2.5F, -19.0F, 3, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 60, -3.5F, -3.5F, -19.0F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 181, 112, -3.0F, -1.6F, -19.0F, 3, 1, 46, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 164, -3.5F, -2.5F, 15.0F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 14, -3.5F, -4.1F, 15.0F, 3, 2, 11, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 28, -0.5F, -4.1F, 23.0F, 1, 2, 3, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 164, -3.5F, -4.1F, -18.25F, 4, 2, 15, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 127, -3.5F, -4.1F, -1.25F, 3, 2, 15, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 91, -0.5F, -4.1F, -1.25F, 1, 2, 25, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 182, 0, -0.5F, -2.5F, -19.0F, 1, 1, 46, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.5F, -5.95F, -13.25F, 4, 4, 27, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 120, 63, -0.299F, -5.25F, -4.75F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 120, 60, -0.299F, -5.25F, -1.15F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 81, -0.299F, -5.75F, 1.85F, 1, 1, 3, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 120, 56, -0.299F, -5.75F, 4.85F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 116, 119, -0.299F, -5.75F, 5.25F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 77, -0.299F, -5.05F, 1.85F, 1, 1, 3, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 71, -0.299F, -5.05F, 4.85F, 1, 1, 3, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 107, -3.5F, -2.85F, 34.65F, 4, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 149, 41, -3.5F, -5.85F, 36.65F, 4, 3, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 146, -0.1F, -5.15F, 26.65F, 1, 3, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 15, 0.1F, -5.65F, 27.65F, 1, 2, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 119, 94, 0.2F, -5.15F, 28.15F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 119, 0.2F, -5.15F, 32.15F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 9, 0.0F, -4.05F, 28.65F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 77, 0.0F, -4.05F, 31.65F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 86, 0.0F, -4.05F, 30.15F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 15, -0.1F, -6.15F, 25.15F, 1, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 15, -2.5F, -7.55F, 25.15F, 2, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 63, -3.5F, -2.6F, 31.65F, 4, 12, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 147, 104, -3.5F, -2.6F, 26.95F, 4, 2, 5, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 56, -2.5F, -0.9F, 25.75F, 2, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 85, -2.0F, -0.9F, 27.75F, 1, 1, 3, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 63, -2.5F, -2.6F, 29.95F, 2, 12, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 106, -2.5F, -2.35F, 34.65F, 2, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 104, -3.5F, 6.7F, 34.45F, 4, 2, 5, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 102, -3.5F, 8.2F, 31.95F, 4, 2, 4, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 0, -2.5F, 9.7F, 31.95F, 2, 6, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 18, -2.5F, 9.7F, 31.95F, 2, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 7, 63, -2.0F, 10.6F, 34.75F, 1, 2, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 120, 116, -2.0F, 11.6F, 33.75F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 31, -3.5F, -1.85F, 39.65F, 4, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 35, 15, -3.0F, 2.15F, 39.65F, 3, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 92, -0.5F, -5.95F, 13.55F, 1, 3, 24, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 63, -2.5F, -6.938F, 11.5F, 2, 1, 27, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 31, -2.6F, -6.941F, 37.75F, 2, 2, 4, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 63, -1.4F, -6.94F, 37.75F, 1, 2, 4, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 82, -3.5F, -4.95F, 14.95F, 1, 1, 8, -0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 30, 63, -3.5F, -5.75F, 22.65F, 1, 3, 15, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 179, -3.5F, -3.45F, 22.65F, 4, 1, 15, -0.099F, false));
		gun.cubeList.add(new ModelBox(gun, 131, 22, -2.75F, -1.5F, -17.5F, 3, 1, 18, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 47, -2.75F, -0.5F, -13.5F, 3, 3, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 72, -2.75F, 2.5F, -13.5F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 47, -0.6F, 1.75F, -12.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 45, -3.4F, 1.75F, -12.5F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 37, -3.4F, 0.75F, 16.8F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 37, -0.6F, 0.75F, 16.8F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 68, -3.0F, -0.5F, -16.5F, 3, 2, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 111, -3.0F, -1.25F, -17.5F, 3, 2, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 60, -2.75F, 2.3F, -4.7F, 3, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 127, -3.25F, 2.5F, -13.5F, 1, 1, 7, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 129, 60, -3.25F, -0.5F, -13.5F, 1, 3, 9, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 131, 22, -3.25F, -1.5F, 16.5F, 1, 4, 8, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 97, -3.25F, -1.5F, 13.25F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 93, 96, -0.75F, -1.5F, 13.25F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.75F, -1.5F, 13.25F, 1, 4, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 0, -2.25F, -1.5F, 13.25F, 2, 4, 4, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 127, -2.75F, -1.5F, 16.5F, 3, 4, 8, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 131, 38, -3.25F, 2.3F, -4.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 130, 146, -3.25F, -1.5F, -17.5F, 1, 1, 18, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 53, -3.0F, 2.4F, -4.0F, 3, 1, 4, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.25F, 2.3F, -3.7F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.9076F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 120, 37, -3.0F, 0.0F, -2.0F, 1, 1, 2, -0.001F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 97, 10, -2.5F, 0.0F, -2.0F, 3, 1, 2, -0.002F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.25F, 3.5F, -6.5F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6283F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 120, 34, -3.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 56, -2.5F, -1.0F, 0.0F, 3, 1, 2, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.25F, -1.5F, 13.25F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.1571F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 47, -1.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 37, -1.0F, 0.0F, 2.3F, 1, 4, 1, 0.003F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.75F, -1.5F, 13.25F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.1571F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 37, 0.0F, 0.0F, 2.3F, 1, 4, 1, 0.003F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 66, 78, 0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.25F, -0.5F, 13.25F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.9425F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 96, -1.0F, 0.0F, 0.0F, 1, 1, 4, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.25F, -0.5F, 13.25F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.9425F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 78, 96, 0.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.75F, -17.5F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.925F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 68, 38, -3.0F, 0.25F, 0.0F, 3, 1, 1, -0.003F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 68, 51, -3.0F, 0.0F, 0.0F, 3, 1, 1, -0.002F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.0F, -1.25F, -17.5F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.0611F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 68, 18, 0.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 38, 110, 0.0F, 1.75F, 1.0F, 1, 1, 3, -0.001F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 131, 34, 0.0F, 2.75F, 3.0F, 1, 1, 1, -0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.0F, 0.5F, -17.5F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.7854F, -0.0611F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 93, 96, 0.0F, 2.0F, 0.72F, 1, 2, 1, -0.002F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.5F, -17.5F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.7854F, 0.0611F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 97, -1.0F, 2.0F, 0.72F, 1, 2, 1, -0.002F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.5F, -17.5F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0611F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 131, 36, -1.0F, 1.0F, 3.0F, 1, 1, 1, -0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 52, 110, -1.0F, 0.0F, 1.0F, 1, 1, 3, -0.001F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 68, 28, -1.0F, -1.75F, 0.0F, 1, 2, 4, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 1.5F, -15.5F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 54, -3.0F, 1.85F, 0.0F, 3, 1, 1, -0.002F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 66, 110, -3.0F, 0.0F, 0.0F, 3, 2, 1, -0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.4F, 0.85F, 17.15F);
		gun.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3665F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 121, 83, -0.75F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 122, 14, -4.05F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.4F, 0.85F, 21.15F);
		gun.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3665F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 121, -0.75F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 121, 87, -4.05F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.4F, 1.85F, -12.15F);
		gun.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3665F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 122, 18, -0.25F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 122, 21, 3.05F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.4F, 1.85F, -8.15F);
		gun.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.3665F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 16, 122, -0.25F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 20, 122, 3.05F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.25F, -0.5F, -17.5F);
		gun.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, -0.3316F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 97, 0, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.25F, -0.5F, -17.5F);
		gun.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.3316F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 97, 5, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-1.0F, 0.4F, -0.5F);
		gun.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1396F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 120, 67, -1.0F, 0.8F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 120, 70, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.0F, 0.4F, -0.5F);
		gun.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.3142F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 91, 22, -1.0F, -2.0F, -1.0F, 1, 2, 1, 0.002F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.0F, -6.9F, 25.65F);
		gun.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 1.0996F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 53, 164, 0.13F, 0.15F, -0.15F, 1, 1, 13, -0.101F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.2F, -5.5F, 25.65F);
		gun.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -1.0996F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 179, -0.1F, -0.1F, -0.15F, 1, 1, 13, -0.1F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.5F, -5.85F, 37.85F);
		gun.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, -0.7854F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 78, 91, -0.9F, -0.9F, -0.1F, 1, 1, 4, -0.101F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 66, 91, -0.9F, -1.5F, -0.1F, 1, 1, 4, -0.102F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.5F, -5.85F, 37.85F);
		gun.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, 0.7854F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 12, 92, -0.1F, -1.5F, -0.1F, 1, 1, 4, -0.102F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 0, 92, -0.1F, -0.9F, -0.1F, 1, 1, 4, -0.101F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.4F, -5.85F, -13.15F);
		gun.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, 0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 0, -0.1F, -1.5F, -0.1F, 1, 1, 27, -0.102F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 68, 28, -0.1F, -0.9F, -0.1F, 1, 1, 27, -0.101F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.4F, -5.85F, -13.15F);
		gun.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, -0.7854F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 127, -0.9F, -1.5F, -0.1F, 1, 1, 51, -0.102F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 129, 60, -0.9F, -0.9F, -0.1F, 1, 1, 51, -0.101F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.5F, 2.15F, 39.65F);
		gun.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, 0.1222F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 47, 31, -1.0F, 0.0F, 0.0F, 1, 4, 2, -0.001F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-3.5F, 2.15F, 39.65F);
		gun.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, -0.1222F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 45, 0.0F, 0.0F, 0.0F, 1, 4, 2, -0.001F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.5F, -1.35F, 39.35F);
		gun.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.0873F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 15, 0.0F, 0.0F, 0.0F, 4, 10, 1, -0.001F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-3.5F, 10.2F, 35.95F);
		gun.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.9076F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 49, 6, 0.0F, -2.0F, 0.0F, 4, 2, 2, -0.003F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-2.0F, 9.8F, 32.25F);
		gun.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0524F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 47, 39, -1.0F, 5.0F, -1.0F, 3, 1, 4, -0.3F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.5F, -2.6F, 31.65F);
		gun.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.5411F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 31, -1.0F, 2.0F, -2.0F, 1, 10, 2, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.5F, -2.6F, 31.65F);
		gun.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.5411F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 6, 31, 0.0F, 2.0F, -2.0F, 1, 10, 2, -0.001F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-3.5F, -5.85F, 36.65F);
		gun.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.5934F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 0, 60, 0.0F, 2.6F, 0.0F, 4, 1, 1, -0.002F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 83, 83, 0.0F, 0.0F, 0.0F, 4, 3, 1, -0.001F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.9F, -6.15F, 25.15F);
		gun.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, -0.7854F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 27, 127, -1.0F, -2.0F, 0.0F, 1, 2, 11, -0.001F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.9F, -5.15F, 35.85F);
		gun.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.4712F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 48, 15, -1.1F, 0.1F, -2.1F, 1, 3, 2, 0.099F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.9F, -5.15F, 25.15F);
		gun.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.4712F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 39, 51, -1.1F, 0.1F, 0.1F, 1, 3, 2, 0.099F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-3.5F, -2.85F, 34.65F);
		gun.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.4363F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 87, 0.0F, -2.3F, 0.9F, 4, 2, 1, -0.003F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-3.6F, -2.4F, -17.65F);
		gun.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.3665F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 122, 44, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 35, 123, 3.4F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.4F, -3.6F, -2.35F);
		gun.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.3665F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 120, 99, -0.8F, -0.2F, -0.2F, 1, 1, 1, 0.0F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 120, 113, -4.0F, -0.2F, -0.2F, 1, 1, 1, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.4F, -3.5F, -2.15F);
		gun.addChild(cube_r41);
		setRotationAngle(cube_r41, -2.7053F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 91, 37, -0.75F, -0.2F, -0.2F, 1, 2, 1, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 91, 50, -4.05F, -0.2F, -0.2F, 1, 2, 1, -0.1F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.4F, -3.5F, -2.15F);
		gun.addChild(cube_r42);
		setRotationAngle(cube_r42, -2.7123F, 0.0807F, -0.1744F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 120, 73, -0.4F, 0.9F, -0.2F, 1, 1, 1, -0.101F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-3.4F, -3.5F, -2.15F);
		gun.addChild(cube_r43);
		setRotationAngle(cube_r43, -2.7123F, -0.0807F, 0.1744F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 120, 101, -0.6F, 0.9F, -0.2F, 1, 1, 1, -0.101F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-3.6F, -3.0F, 0.15F);
		gun.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.3665F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 122, 42, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 31, 123, 3.4F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-3.6F, -3.0F, 4.15F);
		gun.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.3665F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 28, 122, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 122, 50, 3.4F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-3.6F, -3.0F, 8.15F);
		gun.addChild(cube_r46);
		setRotationAngle(cube_r46, -0.3665F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 24, 122, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 123, 23, 3.4F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-3.5F, -4.1F, -1.25F);
		gun.addChild(cube_r47);
		setRotationAngle(cube_r47, 1.2392F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 48, 23, 0.0F, 0.0F, -2.0F, 4, 1, 2, -0.002F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-3.5F, -4.1F, -3.25F);
		gun.addChild(cube_r48);
		setRotationAngle(cube_r48, -1.2392F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 15, 53, 0.0F, 0.0F, 0.0F, 4, 1, 2, -0.002F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.5F, -3.5F, -19.0F);
		gun.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.6632F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 50, 60, -4.0F, 0.0F, 0.0F, 4, 1, 1, -0.002F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.5F, -4.1F, 26.0F);
		gun.addChild(cube_r50);
		setRotationAngle(cube_r50, -1.0297F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 15, 73, -4.0F, 0.0F, 0.0F, 4, 1, 2, -0.003F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-3.5F, -1.5F, -19.0F);
		gun.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.5236F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 182, 50, 0.0F, 0.0F, 0.0F, 1, 1, 46, -0.002F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.5F, -1.5F, -19.0F);
		gun.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.5236F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 54, 185, -1.0F, 0.0F, 0.0F, 1, 1, 46, -0.002F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 30.0F, 7.0F);
		gun.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 66, 78, -3.5F, -31.4F, -7.0F, 4, 1, 9, 0.1F, false));
		grip.cubeList.add(new ModelBox(grip, 53, 135, -3.0F, -30.5F, -6.0F, 3, 3, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 111, 50, -3.5F, -27.65F, -7.0F, 4, 1, 3, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 68, 34, -3.5F, -28.05F, -3.5F, 4, 2, 2, -0.001F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.5F, -26.65F, -7.0F);
		grip.addChild(cube_r53);
		setRotationAngle(cube_r53, 1.309F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 97, 14, -4.0F, 0.0F, 0.0F, 4, 3, 1, -0.002F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.5F, -27.5F, -5.3F);
		grip.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0524F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 74, -3.5F, 8.6F, 6.1F, 3, 1, 1, -0.002F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 129, 95, -4.0F, 8.6F, 0.1F, 4, 1, 6, -0.002F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 45, 92, -4.0F, 2.6F, 0.7F, 4, 6, 4, -0.001F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.5F, -25.0F, 0.5F);
		grip.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.5934F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 68, 10, -4.0F, -3.6F, -1.0F, 4, 1, 1, 0.003F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 111, 77, -4.0F, -3.0F, -3.0F, 4, 3, 3, 0.002F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(0.5F, -27.5F, -5.3F);
		grip.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.2793F, 0.0F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 49, 0, -4.0F, 0.0F, 0.0F, 4, 4, 2, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(0.5F, -25.0F, 0.5F);
		grip.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.1222F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 15, 15, -4.0F, 0.0F, -2.0F, 4, 6, 2, 0.001F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, -25.1F, 1.5F);
		grip.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.6981F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 97, 33, -3.0F, -4.0F, -1.0F, 3, 4, 1, 0.002F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(0.0F, -25.1F, 1.5F);
		grip.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.1222F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 30, 81, -3.0F, 0.0F, -1.0F, 3, 6, 1, 0.001F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-3.6F, -30.3F, -6.0F);
		grip.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, -0.6283F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 32, 51, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.6F, -30.3F, -6.0F);
		grip.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, 0.6283F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 63, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.0F, -30.3F, 2.1F);
		grip.addChild(cube_r62);
		setRotationAngle(cube_r62, -1.2741F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 97, 42, -3.0F, 0.0F, -1.0F, 3, 4, 1, -0.001F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, -30.3F, -7.1F);
		grip.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.8901F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 111, 83, -3.0F, 0.0F, 0.0F, 3, 2, 1, -0.001F, false));

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 4.0F, -15.5F);
		gun.addChild(magazine);
		magazine.cubeList.add(new ModelBox(magazine, 40, 110, -1.2F, -5.4F, 0.0F, 1, 5, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 66, 63, -2.8F, -5.4F, 0.0F, 2, 5, 10, -0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 111, 42, -3.0F, -0.4F, -0.25F, 3, 3, 5, 0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 82, 5, -0.75F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 66, 63, -0.35F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 102, 77, -0.35F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 102, 47, -0.35F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 41, 63, -0.35F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 82, 0, -0.75F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 68, 5, -0.75F, 0.499F, 5.95F, 1, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 68, 0, -0.75F, 0.499F, 2.95F, 1, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 102, 85, -0.75F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 57, 53, -3.65F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 97, 38, -3.65F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 63, -3.65F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 99, 96, -3.65F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine.cubeList.add(new ModelBox(magazine, 15, 63, -3.25F, 0.499F, 2.95F, 1, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 100, 91, -3.25F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 23, 63, -3.25F, 0.499F, 5.95F, 1, 2, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 80, 68, -3.25F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 82, -3.25F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 140, 112, -3.0F, -0.4F, 4.15F, 3, 3, 6, 0.101F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-3.15F, -1.1F, 0.95F);
		magazine.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, 0.0873F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 84, 96, 0.0F, 0.999F, 3.0F, 1, 1, 2, -0.001F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-3.15F, -1.5F, 0.95F);
		magazine.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, 0.0873F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 37, 92, 0.0F, 0.999F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(0.15F, -1.1F, 0.95F);
		magazine.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, -0.0873F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 102, 81, -1.0F, 0.999F, 3.0F, 1, 1, 2, -0.001F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(0.15F, -1.5F, 0.95F);
		magazine.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, 0.0F, -0.0873F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 103, 0, -1.0F, 0.999F, 3.0F, 1, 1, 2, 0.0F, false));

		handguard = new QRenderer(this);
		handguard.setRotationPoint(-3.35F, -11.5F, -56.1F);
		handguard.cubeList.add(new ModelBox(handguard, 282, 168, 0.35F, 3.0F, -2.7F, 1, 1, 33, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 226, 280, 2.35F, 3.0F, -2.7F, 1, 1, 33, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 119, -0.15F, 3.25F, 12.3F, 4, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 30, 81, 0.35F, 3.248F, 16.3F, 3, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 168, 3.05F, 3.45F, 15.9F, 1, 1, 9, -0.201F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 110, -0.15F, 3.25F, 24.3F, 4, 1, 4, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 130, 126, 2.85F, 3.25F, 19.8F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 29, 165, -0.35F, 3.45F, 15.9F, 1, 1, 9, -0.201F, false));
		handguard.cubeList.add(new ModelBox(handguard, 130, 124, -0.15F, 3.25F, 19.8F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 6, 69, 0.85F, -1.9F, -1.05F, 2, 3, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 101, 0.35F, 1.1F, -1.05F, 3, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 68, 56, -0.15F, 3.1F, -2.05F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 108, 56, 0.35F, 1.1F, -1.75F, 3, 2, 1, -0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 30, 60, -0.15F, 0.1F, -1.05F, 4, 1, 1, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 91, 0.85F, -2.3F, -0.15F, 2, 2, 3, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 31, 0.95F, -2.4F, 0.25F, 2, 1, 28, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 63, 0.75F, -2.4F, 0.25F, 1, 1, 28, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 109, 0.85F, -2.3F, 4.65F, 2, 2, 2, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 109, 0.85F, -2.3F, 8.45F, 2, 2, 2, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 15, 107, 0.85F, -2.3F, 12.25F, 2, 2, 2, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 66, 106, 0.85F, -2.3F, 16.05F, 2, 2, 2, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 105, 0.85F, -2.3F, 19.85F, 2, 2, 2, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 105, 0.85F, -2.3F, 23.65F, 2, 2, 2, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 114, 266, 0.85F, -2.3F, 27.45F, 2, 2, 34, -0.099F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 72, 0.9F, -2.7F, 58.6F, 1, 1, 3, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 124, 130, 0.9F, -2.7F, 57.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 130, 0.9F, -2.7F, 56.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 34, 130, 0.9F, -2.7F, 54.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 47, 130, 0.9F, -2.7F, 55.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 104, 0.9F, -2.7F, 50.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 106, 0.9F, -2.7F, 51.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 112, 0.9F, -2.7F, 52.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 116, 0.9F, -2.7F, 53.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 85, 129, 0.9F, -2.7F, 46.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 86, 0.9F, -2.7F, 47.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 95, 129, 0.9F, -2.7F, 48.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 97, 0.9F, -2.7F, 49.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 66, 0.9F, -2.7F, 42.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 72, 129, 0.9F, -2.7F, 43.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 74, 0.9F, -2.7F, 44.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 81, 129, 0.9F, -2.7F, 45.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 153, 124, 0.9F, -2.7F, 28.6F, 1, 1, 12, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 129, 0.9F, -2.7F, 40.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 119, 0.9F, -2.7F, 26.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 112, 119, 0.9F, -2.7F, 24.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 119, 107, 0.9F, -2.7F, 22.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 119, 91, 0.9F, -2.7F, 20.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 24, 119, 0.9F, -2.7F, 18.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 12, 119, 0.9F, -2.7F, 16.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 118, 0.9F, -2.7F, 14.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 118, 0.9F, -2.7F, 12.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 145, 0.9F, -2.7F, -0.4F, 1, 1, 13, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 129, 62, 0.9F, -2.7F, 41.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 35, 1.8F, -2.7F, 58.6F, 1, 1, 3, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 123, 55, 1.8F, -2.7F, 57.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 124, 60, 1.8F, -2.7F, 56.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 127, 1.8F, -2.7F, 55.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 127, 1.8F, -2.7F, 54.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 40, 127, 1.8F, -2.7F, 53.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 127, 1.8F, -2.7F, 52.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 66, 127, 1.8F, -2.7F, 51.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 72, 127, 1.8F, -2.7F, 50.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 91, 127, 1.8F, -2.7F, 49.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 99, 127, 1.8F, -2.7F, 48.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 121, 127, 1.8F, -2.7F, 47.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 34, 128, 1.8F, -2.7F, 46.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 128, 60, 1.8F, -2.7F, 45.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 128, 1.8F, -2.7F, 44.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 124, 128, 1.8F, -2.7F, 43.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 129, 1.8F, -2.7F, 42.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 129, 1.8F, -2.7F, 41.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 31, 129, 1.8F, -2.7F, 40.6F, 1, 1, 1, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 77, 1.8F, -2.7F, 28.6F, 1, 1, 12, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 38, 1.8F, -2.7F, 26.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 56, 1.8F, -2.7F, 24.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 67, 1.8F, -2.7F, 22.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 73, 1.8F, -2.7F, 20.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 52, 117, 1.8F, -2.7F, 18.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 15, 1.8F, -2.7F, 16.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 118, 21, 1.8F, -2.7F, 14.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 72, 118, 1.8F, -2.7F, 12.6F, 1, 1, 2, -0.25F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 28, 1.8F, -2.7F, -0.4F, 1, 1, 13, -0.25F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(2.55F, -2.45F, 11.85F);
		handguard.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, 0.4887F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 97, 63, -0.25F, -0.25F, -12.25F, 1, 1, 13, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 78, 118, -0.25F, -0.25F, 0.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 66, 118, -0.25F, -0.25F, 2.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 118, 18, -0.25F, -0.25F, 4.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 117, 84, -0.25F, -0.25F, 6.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 116, 116, -0.25F, -0.25F, 8.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 116, 70, -0.25F, -0.25F, 10.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 116, 64, -0.25F, -0.25F, 12.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 116, 35, -0.25F, -0.25F, 14.75F, 1, 1, 2, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 97, 42, -0.25F, -0.25F, 16.75F, 1, 1, 12, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 27, 129, -0.25F, -0.25F, 28.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 14, 129, -0.25F, -0.25F, 29.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 4, 129, -0.25F, -0.25F, 30.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 115, 128, -0.25F, -0.25F, 31.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 75, 128, -0.25F, -0.25F, 32.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 56, 128, -0.25F, -0.25F, 33.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 47, 128, -0.25F, -0.25F, 34.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 112, 127, -0.25F, -0.25F, 35.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 95, 127, -0.25F, -0.25F, 36.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 85, 127, -0.25F, -0.25F, 37.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 81, 127, -0.25F, -0.25F, 38.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 62, 127, -0.25F, -0.25F, 39.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 44, 127, -0.25F, -0.25F, 40.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 31, 127, -0.25F, -0.25F, 41.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 27, 127, -0.25F, -0.25F, 42.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 4, 127, -0.25F, -0.25F, 43.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 127, -0.25F, -0.25F, 44.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 123, 57, -0.25F, -0.25F, 45.75F, 1, 1, 1, -0.251F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 0, 179, -0.2F, -0.15F, -0.35F, 1, 1, 49, -0.3F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 102, 64, -0.25F, -0.25F, 46.75F, 1, 1, 3, -0.251F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(1.15F, -2.45F, 58.85F);
		handguard.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, 0.0F, -0.4887F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 140, 174, -0.8F, -0.15F, -47.35F, 1, 1, 49, -0.3F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 64, -0.75F, -0.25F, -17.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 91, 144, -0.75F, -0.25F, -59.25F, 1, 1, 13, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 84, 118, -0.75F, -0.25F, -46.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 96, 118, -0.75F, -0.25F, -44.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 108, 118, -0.75F, -0.25F, -42.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 18, 119, -0.75F, -0.25F, -40.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 30, 119, -0.75F, -0.25F, -38.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 119, 104, -0.75F, -0.25F, -36.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 119, 110, -0.75F, -0.25F, -34.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 120, 0, -0.75F, -0.25F, -32.25F, 1, 1, 2, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 62, 129, -0.75F, -0.25F, -18.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 154, 0, -0.75F, -0.25F, -30.25F, 1, 1, 12, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 82, -0.75F, -0.25F, -13.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 76, -0.75F, -0.25F, -14.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 72, -0.75F, -0.25F, -15.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 66, 129, -0.75F, -0.25F, -16.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 99, 129, -0.75F, -0.25F, -9.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 95, -0.75F, -0.25F, -10.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 91, 129, -0.75F, -0.25F, -11.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 84, -0.75F, -0.25F, -12.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 118, -0.75F, -0.25F, -5.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 114, -0.75F, -0.25F, -6.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 112, 129, -0.75F, -0.25F, -7.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 129, 99, -0.75F, -0.25F, -8.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 56, 130, -0.75F, -0.25F, -3.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 121, 129, -0.75F, -0.25F, -4.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 75, 130, -0.75F, -0.25F, -2.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 115, 130, -0.75F, -0.25F, -1.25F, 1, 1, 1, -0.251F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 102, 68, -0.75F, -0.25F, -0.25F, 1, 1, 3, -0.251F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(3.85F, 0.1F, -1.55F);
		handguard.addChild(cube_r70);
		setRotationAngle(cube_r70, -0.0524F, 0.2094F, 1.117F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 82, 38, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-0.15F, 0.1F, -1.55F);
		handguard.addChild(cube_r71);
		setRotationAngle(cube_r71, -0.0524F, -0.2094F, -1.117F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 82, 51, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-0.15F, 0.1F, -0.05F);
		handguard.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, -1.117F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 82, 60, 0.0F, 0.0F, -1.0F, 2, 1, 1, -0.002F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(3.85F, 0.1F, -0.05F);
		handguard.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, 1.117F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 66, 85, -2.0F, 0.0F, -1.0F, 2, 1, 1, -0.002F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(2.85F, -1.9F, -1.05F);
		handguard.addChild(cube_r74);
		setRotationAngle(cube_r74, 1.309F, 0.0F, 0.0F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 20, 60, -3.0F, 0.0F, -3.0F, 4, 1, 1, -0.002F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 10, 60, -3.0F, 0.0F, -6.0F, 4, 1, 1, -0.001F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 15, 87, -2.5F, 0.0F, -5.0F, 3, 1, 2, -0.001F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 12, 97, -2.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-0.15F, 3.1F, -2.05F);
		handguard.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, -1.0123F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 120, 3, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(3.85F, 3.1F, -2.05F);
		handguard.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 1.0123F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 120, 6, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-0.15F, 3.25F, 12.3F);
		handguard.addChild(cube_r77);
		setRotationAngle(cube_r77, -0.4538F, 0.0F, 0.384F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 6, 92, 0.0F, -2.2F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(-0.15F, 3.25F, 13.3F);
		handguard.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, 0.384F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 0, 92, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 78, 91, 0.0F, -2.0F, 4.25F, 1, 2, 1, 0.0F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 22, 151, -0.2F, -0.8F, 0.75F, 1, 1, 13, -0.199F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 72, 91, 0.0F, -2.0F, 8.75F, 1, 2, 1, 0.0F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 66, 91, 0.0F, -2.0F, 13.0F, 1, 2, 1, 0.0F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 150, 146, -0.2F, -2.2F, 0.75F, 1, 1, 13, -0.199F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(-0.15F, 3.25F, 28.3F);
		handguard.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.4538F, 0.0F, 0.384F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 57, 91, 0.0F, -2.2F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(3.85F, 3.25F, 28.3F);
		handguard.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.4538F, 0.0F, -0.384F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 66, 96, -1.0F, -2.2F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(3.85F, 3.25F, 12.3F);
		handguard.addChild(cube_r81);
		setRotationAngle(cube_r81, -0.4538F, 0.0F, -0.384F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 72, 96, -1.0F, -2.2F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(3.85F, 3.25F, 17.05F);
		handguard.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.384F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 152, 60, -0.8F, -0.8F, -3.0F, 1, 1, 13, -0.199F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 152, 82, -0.8F, -2.2F, -3.0F, 1, 1, 13, -0.199F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 12, 92, -1.0F, -2.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 26, 92, -1.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 45, 92, -1.0F, -2.0F, 9.25F, 1, 2, 1, 0.0F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 78, 96, -1.0F, -2.0F, -3.75F, 1, 2, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.8F, -1.9F, -0.05F);
		handguard.addChild(bone2);
		

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.05F, 0.05F, 0.0F);
		bone2.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, 0.5061F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 38, 269, 0.35F, 0.0F, 0.0F, 1, 1, 36, -0.001F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.05F, 0.05F, 0.0F);
		bone2.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, -0.5061F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 264, 270, -1.35F, 0.0F, 0.0F, 1, 1, 36, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.8F, 1.9F, -0.05F);
		handguard.addChild(bone4);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.05F, -0.05F, 0.0F);
		bone4.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, -0.5061F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 264, 233, 0.35F, -1.0F, 0.0F, 1, 1, 36, -0.001F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 0, 266, 0.0F, -1.0F, 0.0F, 1, 1, 36, 0.001F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.05F, -0.05F, 0.0F);
		bone4.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, 0.5061F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 76, 266, -1.35F, -1.0F, 0.0F, 1, 1, 36, -0.001F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 150, 266, -1.0F, -1.0F, 0.0F, 1, 1, 36, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, -0.05F);
		handguard.addChild(bone3);
		

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.5061F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 268, 1, 0.0F, -1.35F, 0.0F, 1, 1, 36, -0.002F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 130, 128, 0.0F, -1.0F, 23.5F, 1, 1, 1, 0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 131, 4, 0.0F, -1.0F, 18.5F, 1, 1, 1, 0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 181, 115, 0.0F, -1.0F, 29.0F, 1, 1, 9, 0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 14, 131, 0.0F, -1.0F, 13.5F, 1, 1, 1, 0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 131, 16, 0.0F, -1.0F, 8.5F, 1, 1, 1, 0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 131, 26, 0.0F, -1.0F, 3.5F, 1, 1, 1, 0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 120, 31, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 23.5F);
		bone3.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.5061F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 130, 130, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 131, 6, 0.0F, 0.0F, -5.0F, 1, 1, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 181, 125, 0.0F, 0.0F, 5.5F, 1, 1, 9, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 131, 14, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 18, 131, 0.0F, 0.0F, -15.0F, 1, 1, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 27, 131, 0.0F, 0.0F, -20.0F, 1, 1, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 268, 38, 0.0F, 0.35F, -23.5F, 1, 1, 36, -0.002F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 34, 120, 0.0F, 0.0F, -23.5F, 1, 1, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.7F, 0.0F, -0.05F);
		handguard.addChild(bone5);
		

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, -0.5061F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 226, 243, -1.0F, -1.35F, 0.0F, 1, 1, 36, -0.002F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 131, -1.0F, -1.0F, 23.5F, 1, 1, 1, 0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 4, 131, -1.0F, -1.0F, 18.5F, 1, 1, 1, 0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 23, 179, -1.0F, -1.0F, 29.0F, 1, 1, 9, 0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 131, 12, -1.0F, -1.0F, 13.5F, 1, 1, 1, 0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 131, 22, -1.0F, -1.0F, 8.5F, 1, 1, 1, 0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 131, 28, -1.0F, -1.0F, 3.5F, 1, 1, 1, 0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 120, 9, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 23.5F);
		bone5.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, 0.5061F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 131, 0, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 131, 2, -1.0F, 0.0F, -5.0F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 169, 112, -1.0F, 0.0F, 5.5F, 1, 1, 9, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 131, 10, -1.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 131, 24, -1.0F, 0.0F, -15.0F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 31, 131, -1.0F, 0.0F, -20.0F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 244, 196, -1.0F, 0.35F, -23.5F, 1, 1, 36, -0.002F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 120, 28, -1.0F, 0.0F, -23.5F, 1, 1, 2, 0.0F, false));

		handguard_railed = new QRenderer(this);
		handguard_railed.setRotationPoint(-3.35F, -11.5F, -56.1F);
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 191, 279, 0.35F, 3.0F, -2.7F, 1, 1, 33, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 273, 134, 2.35F, 3.0F, -2.7F, 1, 1, 33, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 108, 99, -0.15F, 3.25F, 4.3F, 4, 1, 4, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 151, 0.35F, 3.248F, 8.3F, 3, 1, 16, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 53, 127, 3.05F, 3.45F, 7.9F, 1, 1, 17, -0.201F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 26, 104, -0.15F, 3.25F, 24.3F, 4, 1, 4, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 22, 119, 2.85F, 3.25F, 19.8F, 1, 1, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 26, 92, -0.35F, 3.45F, 7.9F, 1, 1, 17, -0.201F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 16, 119, -0.15F, 3.25F, 19.8F, 1, 1, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 66, 2.85F, 3.25F, 15.55F, 1, 1, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 76, 38, -0.15F, 3.25F, 15.55F, 1, 1, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 32, 54, 2.85F, 3.25F, 11.3F, 1, 1, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 58, 23, -0.15F, 3.25F, 11.3F, 1, 1, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 55, 45, 0.85F, -1.9F, -1.05F, 2, 3, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 51, 0.35F, 1.1F, -1.05F, 3, 2, 1, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 15, 23, -0.15F, 3.1F, -2.05F, 4, 1, 2, 0.0F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 44, 86, 0.35F, 1.1F, -1.75F, 3, 2, 1, -0.002F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 8, -0.15F, 0.1F, -1.05F, 4, 1, 1, -0.001F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 63, 0.85F, -2.3F, -0.55F, 2, 2, 62, -0.099F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 127, 0.85F, 3.95F, 4.45F, 2, 1, 23, -0.099F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 0, 0.35F, 0.6F, -0.55F, 3, 1, 62, -0.099F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 188, 242, 2.85F, -0.45F, 0.05F, 1, 1, 36, -0.098F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 233, 97, 2.85F, 0.05F, 0.05F, 1, 1, 36, -0.097F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 230, 0, -0.15F, 0.05F, 0.05F, 1, 1, 36, -0.097F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 230, 47, -0.15F, -0.45F, 0.05F, 1, 1, 36, -0.098F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 67, 0.9F, -2.7F, 58.6F, 1, 1, 3, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 106, 118, 0.9F, -2.7F, 57.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 94, 118, 0.9F, -2.7F, 56.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 82, 118, 0.9F, -2.7F, 54.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 76, 118, 0.9F, -2.7F, 55.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 117, 87, 0.9F, -2.7F, 50.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 116, 60, 0.9F, -2.7F, 51.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 70, 113, 0.9F, -2.7F, 52.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 87, 112, 0.9F, -2.7F, 53.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 26, 112, 0.9F, -2.7F, 46.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 111, 44, 0.9F, -2.7F, 47.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 57, 110, 0.9F, -2.7F, 48.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 86, 109, 0.9F, -2.7F, 49.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 108, 93, 0.9F, -2.7F, 42.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 108, 91, 0.9F, -2.7F, 43.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 108, 60, 0.9F, -2.7F, 44.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 77, 106, 0.9F, -2.7F, 45.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 68, 41, 0.9F, -2.7F, 28.6F, 1, 1, 12, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 26, 106, 0.9F, -2.7F, 40.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 116, 10, 0.9F, -2.7F, 26.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 116, 1, 0.9F, -2.7F, 24.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 115, 108, 0.9F, -2.7F, 22.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 56, 115, 0.9F, -2.7F, 20.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 114, 20, 0.9F, -2.7F, 18.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 114, 14, 0.9F, -2.7F, 16.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 83, 112, 0.9F, -2.7F, 14.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 72, 0.9F, -2.7F, 12.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 93, 91, 0.9F, -2.7F, -0.4F, 1, 1, 13, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 105, 44, 0.9F, -2.7F, 41.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 47, 1.8F, -2.7F, 58.6F, 1, 1, 3, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 105, 10, 1.8F, -2.7F, 57.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 57, 104, 1.8F, -2.7F, 56.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 38, 104, 1.8F, -2.7F, 55.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 26, 104, 1.8F, -2.7F, 54.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 103, 18, 1.8F, -2.7F, 53.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 45, 102, 1.8F, -2.7F, 52.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 101, 23, 1.8F, -2.7F, 51.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 100, 60, 1.8F, -2.7F, 50.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 23, 1.8F, -2.7F, 49.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 7, 1.8F, -2.7F, 48.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 5, 1.8F, -2.7F, 47.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 97, 2, 1.8F, -2.7F, 46.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 37, 95, 1.8F, -2.7F, 45.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 57, 94, 1.8F, -2.7F, 44.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 89, 80, 1.8F, -2.7F, 43.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 86, 88, 1.8F, -2.7F, 42.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 74, 88, 1.8F, -2.7F, 41.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 66, 88, 1.8F, -2.7F, 40.6F, 1, 1, 1, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 68, 0, 1.8F, -2.7F, 28.6F, 1, 1, 12, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 66, 1.8F, -2.7F, 26.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 63, 1.8F, -2.7F, 24.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 34, 1.8F, -2.7F, 22.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 28, 1.8F, -2.7F, 20.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 6, 1.8F, -2.7F, 18.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 112, 0, 1.8F, -2.7F, 16.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 43, 110, 1.8F, -2.7F, 14.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 107, 1.8F, -2.7F, 12.6F, 1, 1, 2, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 0, 77, 1.8F, -2.7F, -0.4F, 1, 1, 13, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 68, 13, 0.85F, 4.5F, 4.3F, 2, 1, 4, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 68, 5, 0.85F, 4.5F, 8.3F, 2, 1, 4, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 68, 0, 0.85F, 4.5F, 12.3F, 2, 1, 4, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 15, 63, 0.85F, 4.5F, 16.3F, 2, 1, 4, -0.25F, false));
		handguard_railed.cubeList.add(new ModelBox(handguard_railed, 131, 41, 0.85F, 4.5F, 20.3F, 2, 1, 7, -0.25F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(3.75F, -0.1F, 31.05F);
		handguard_railed.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.3665F, 0.0F, 0.0F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 15, 50, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 76, 51, -4.0F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(3.75F, -0.1F, 19.05F);
		handguard_railed.addChild(cube_r92);
		setRotationAngle(cube_r92, -0.3665F, 0.0F, 0.0F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 32, 48, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 78, 56, -4.0F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(3.75F, -0.1F, 10.05F);
		handguard_railed.addChild(cube_r93);
		setRotationAngle(cube_r93, -0.3665F, 0.0F, 0.0F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 41, 0, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));
		cube_r93.cubeList.add(new ModelBox(cube_r93, 9, 86, -4.0F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(3.75F, -0.1F, 2.05F);
		handguard_railed.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.3665F, 0.0F, 0.0F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 4, 31, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));
		cube_r94.cubeList.add(new ModelBox(cube_r94, 88, 56, -4.0F, -0.2F, -0.2F, 1, 1, 1, -0.1F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(1.1F, 5.25F, 7.55F);
		handguard_railed.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, 0.4887F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 82, 28, -0.75F, -0.75F, -3.25F, 1, 1, 4, -0.251F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 82, 18, -0.75F, -0.75F, 0.75F, 1, 1, 4, -0.251F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 15, 82, -0.75F, -0.75F, 4.75F, 1, 1, 4, -0.251F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 82, 13, -0.75F, -0.75F, 8.75F, 1, 1, 4, -0.251F, false));
		cube_r95.cubeList.add(new ModelBox(cube_r95, 53, 127, -0.75F, -0.75F, 12.75F, 1, 1, 7, -0.251F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(2.6F, 5.25F, 23.55F);
		handguard_railed.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.4887F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 72, 127, -0.25F, -0.75F, -3.25F, 1, 1, 7, -0.251F, false));
		cube_r96.cubeList.add(new ModelBox(cube_r96, 82, 33, -0.25F, -0.75F, -7.25F, 1, 1, 4, -0.251F, false));
		cube_r96.cubeList.add(new ModelBox(cube_r96, 82, 41, -0.25F, -0.75F, -11.25F, 1, 1, 4, -0.251F, false));
		cube_r96.cubeList.add(new ModelBox(cube_r96, 82, 46, -0.25F, -0.75F, -15.25F, 1, 1, 4, -0.251F, false));
		cube_r96.cubeList.add(new ModelBox(cube_r96, 83, 78, -0.25F, -0.75F, -19.25F, 1, 1, 4, -0.251F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(2.55F, -2.45F, 11.85F);
		handguard_railed.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.4887F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 63, -0.25F, -0.25F, -12.25F, 1, 1, 13, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 103, 5, -0.25F, -0.25F, 0.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 110, -0.25F, -0.25F, 2.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 111, 86, -0.25F, -0.25F, 4.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 112, 3, -0.25F, -0.25F, 6.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 112, 9, -0.25F, -0.25F, 8.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 112, 31, -0.25F, -0.25F, 10.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 112, 37, -0.25F, -0.25F, 12.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 112, 69, -0.25F, -0.25F, 14.75F, 1, 1, 2, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 68, 13, -0.25F, -0.25F, 16.75F, 1, 1, 12, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 70, 88, -0.25F, -0.25F, 28.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 78, 88, -0.25F, -0.25F, 29.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 82, 88, -0.25F, -0.25F, 30.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 92, 60, -0.25F, -0.25F, 31.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 26, 95, -0.25F, -0.25F, 32.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 96, 60, -0.25F, -0.25F, 33.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 97, 0, -0.25F, -0.25F, 34.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 6, 97, -0.25F, -0.25F, 35.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 19, 97, -0.25F, -0.25F, 36.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 98, 56, -0.25F, -0.25F, 37.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 6, 99, -0.25F, -0.25F, 38.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 101, 101, -0.25F, -0.25F, 39.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 57, 102, -0.25F, -0.25F, 40.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 103, 39, -0.25F, -0.25F, 41.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 104, 22, -0.25F, -0.25F, 42.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 45, 104, -0.25F, -0.25F, 43.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 104, 50, -0.25F, -0.25F, 44.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 104, 60, -0.25F, -0.25F, 45.75F, 1, 1, 1, -0.251F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 131, 0, -0.2F, -0.15F, -0.35F, 1, 1, 49, -0.3F, false));
		cube_r97.cubeList.add(new ModelBox(cube_r97, 54, 86, -0.25F, -0.25F, 46.75F, 1, 1, 3, -0.251F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(1.15F, -2.45F, 58.85F);
		handguard_railed.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, -0.4887F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 130, 124, -0.8F, -0.15F, -47.35F, 1, 1, 49, -0.3F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 105, 42, -0.75F, -0.25F, -17.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 97, 0, -0.75F, -0.25F, -59.25F, 1, 1, 13, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 77, 112, -0.75F, -0.25F, -46.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 44, 113, -0.75F, -0.25F, -44.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 114, 17, -0.75F, -0.25F, -42.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 52, 114, -0.75F, -0.25F, -40.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 115, 105, -0.75F, -0.25F, -38.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 115, 111, -0.75F, -0.25F, -36.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 116, 4, -0.75F, -0.25F, -34.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 116, 7, -0.75F, -0.25F, -32.25F, 1, 1, 2, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 87, 105, -0.75F, -0.25F, -18.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 68, 28, -0.75F, -0.25F, -30.25F, 1, 1, 12, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 38, 106, -0.75F, -0.25F, -13.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 86, 107, -0.75F, -0.25F, -14.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 77, 108, -0.75F, -0.25F, -15.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 108, 99, -0.75F, -0.25F, -16.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 108, 101, -0.75F, -0.25F, -9.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 26, 110, -0.75F, -0.25F, -10.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 111, 42, -0.75F, -0.25F, -11.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 112, 60, -0.75F, -0.25F, -12.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 81, 112, -0.75F, -0.25F, -5.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 66, 113, -0.75F, -0.25F, -6.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 114, 23, -0.75F, -0.25F, -7.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 58, 118, -0.75F, -0.25F, -8.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 70, 118, -0.75F, -0.25F, -3.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 88, 118, -0.75F, -0.25F, -4.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 100, 118, -0.75F, -0.25F, -2.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 0, 119, -0.75F, -0.25F, -1.25F, 1, 1, 1, -0.251F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 97, 63, -0.75F, -0.25F, -0.25F, 1, 1, 3, -0.251F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(-0.05F, 0.95F, 0.15F);
		handguard_railed.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, -0.7854F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 0, 229, -0.1F, -0.1F, -0.1F, 1, 1, 36, -0.099F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(3.75F, 0.95F, 0.15F);
		handguard_railed.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.0F, 0.7854F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 38, 232, -0.9F, -0.1F, -0.1F, 1, 1, 36, -0.099F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-0.05F, -0.35F, 30.15F);
		handguard_railed.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, 0.7854F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 47, 31, -0.1F, -1.9F, -0.1F, 1, 2, 6, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 76, 0, -0.1F, -1.9F, -4.1F, 1, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 9, 73, -0.1F, -1.9F, -8.1F, 1, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 72, 63, -0.1F, -1.9F, -12.1F, 1, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 69, -0.1F, -1.9F, -16.1F, 1, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 44, 81, -0.1F, -1.9F, -30.1F, 1, 2, 3, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 68, 46, -0.1F, -1.9F, -24.1F, 1, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 102, 185, -0.1F, -2.05F, -30.1F, 1, 1, 36, -0.099F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 68, 41, -0.1F, -1.9F, -20.1F, 1, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 53, 127, -0.1F, -0.9F, -30.1F, 1, 1, 36, -0.099F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(3.75F, -0.35F, 0.15F);
		handguard_railed.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.0F, -0.7854F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 150, 224, -0.9F, -2.05F, -0.1F, 1, 1, 36, -0.099F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 47, 45, -0.9F, -1.9F, 29.9F, 1, 2, 6, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 76, 5, -0.9F, -1.9F, 25.9F, 1, 2, 1, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 76, 13, -0.9F, -1.9F, 21.9F, 1, 2, 1, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 0, 77, -0.9F, -1.9F, 17.9F, 1, 2, 1, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 15, 77, -0.9F, -1.9F, 13.9F, 1, 2, 1, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 71, 78, -0.9F, -1.9F, 9.9F, 1, 2, 1, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 80, 63, -0.9F, -1.9F, 5.9F, 1, 2, 1, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 54, 81, -0.9F, -1.9F, -0.1F, 1, 2, 3, -0.1F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 235, 159, -0.9F, -0.9F, -0.1F, 1, 1, 36, -0.099F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(3.85F, 0.1F, -1.55F);
		handguard_railed.addChild(cube_r103);
		setRotationAngle(cube_r103, -0.0524F, 0.2094F, 1.117F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 55, 49, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-0.15F, 0.1F, -1.55F);
		handguard_railed.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.0524F, -0.2094F, -1.117F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 76, 60, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.002F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-0.15F, 0.1F, -0.05F);
		handguard_railed.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.0F, 0.0F, -1.117F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 82, 10, 0.0F, 0.0F, -1.0F, 2, 1, 1, -0.002F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(3.85F, 0.1F, -0.05F);
		handguard_railed.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, 1.117F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 82, 23, -2.0F, 0.0F, -1.0F, 2, 1, 1, -0.002F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(2.85F, -1.9F, -1.05F);
		handguard_railed.addChild(cube_r107);
		setRotationAngle(cube_r107, 1.309F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 14, 8, -3.0F, 0.0F, -3.0F, 4, 1, 1, -0.002F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 35, 8, -3.0F, 0.0F, -6.0F, 4, 1, 1, -0.001F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 80, 56, -2.5F, 0.0F, -5.0F, 3, 1, 2, -0.001F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 66, 69, -2.0F, 0.0F, -3.0F, 2, 1, 3, -0.001F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.15F, 3.1F, -2.05F);
		handguard_railed.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, -1.0123F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 116, 29, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(3.85F, 3.1F, -2.05F);
		handguard_railed.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, 1.0123F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 116, 32, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-0.15F, 3.25F, 4.3F);
		handguard_railed.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.4538F, 0.0F, 0.384F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 80, 68, 0.0F, -2.2F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(-0.15F, 3.25F, 5.3F);
		handguard_railed.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, 0.384F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 0, 82, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 68, 13, 0.0F, -2.0F, 4.25F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 24, 68, 0.0F, -2.0F, 8.25F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 82, 0, 0.0F, -2.0F, 12.25F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 129, 60, -0.2F, -0.8F, 0.75F, 1, 1, 21, -0.199F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 82, 5, 0.0F, -2.0F, 16.75F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 82, 13, 0.0F, -2.0F, 21.0F, 1, 2, 1, 0.0F, false));
		cube_r111.cubeList.add(new ModelBox(cube_r111, 129, 82, -0.2F, -2.2F, 0.75F, 1, 1, 21, -0.199F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(3.85F, 3.25F, 9.55F);
		handguard_railed.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.0F, 0.0F, -0.384F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 68, 18, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 68, 28, -1.0F, -2.0F, 4.0F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 130, 124, -0.8F, -0.8F, -3.5F, 1, 1, 21, -0.199F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 131, 0, -0.8F, -2.2F, -3.5F, 1, 1, 21, -0.199F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 82, 33, -1.0F, -2.0F, 8.0F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 82, 41, -1.0F, -2.0F, 12.5F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 82, 46, -1.0F, -2.0F, 16.75F, 1, 2, 1, 0.0F, false));
		cube_r112.cubeList.add(new ModelBox(cube_r112, 83, 78, -1.0F, -2.0F, -4.25F, 1, 2, 1, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-0.15F, 3.25F, 28.3F);
		handguard_railed.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.4538F, 0.0F, 0.384F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 15, 82, 0.0F, -2.2F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(3.85F, 3.25F, 28.3F);
		handguard_railed.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.4538F, 0.0F, -0.384F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 82, 18, -1.0F, -2.2F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(3.85F, 3.25F, 4.3F);
		handguard_railed.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.4538F, 0.0F, -0.384F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 82, 28, -1.0F, -2.2F, 0.0F, 1, 2, 1, -0.001F, false));

		barrel = new QRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 108, 224, -2.0F, -36.088F, -59.5F, 1, 2, 40, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 200, 201, -2.5F, -35.588F, -59.5F, 2, 1, 40, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 191, 159, -2.5F, -36.088F, -59.701F, 2, 2, 40, -0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 82, 164, -2.0F, -34.838F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 159, 160, -2.0F, -36.338F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 155, 22, -1.25F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 149, 112, -2.75F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-2.75F, -34.588F, -67.5F);
		barrel.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0F, 0.0F, 0.7854F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 139, 0.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(-2.75F, -35.588F, -67.5F);
		barrel.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.0F, 0.7854F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 27, 140, 0.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(-0.25F, -34.588F, -67.5F);
		barrel.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.0F, -0.7854F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 106, 144, -1.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(-0.25F, -35.588F, -67.5F);
		barrel.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.0F, 0.0F, -0.7854F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 68, 145, -1.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		barrel_long = new QRenderer(this);
		barrel_long.setRotationPoint(0.0F, 24.0F, -19.0F);
		barrel_long.cubeList.add(new ModelBox(barrel_long, 69, 124, -2.0F, -36.088F, -59.5F, 1, 2, 59, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 68, 0, -2.5F, -35.588F, -59.5F, 2, 1, 59, -0.001F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 66, 63, -2.5F, -36.088F, -59.701F, 2, 2, 59, -0.2F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 130, 134, -2.0F, -34.838F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 131, 10, -2.0F, -36.338F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 131, 0, -1.25F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 130, 124, -2.75F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(-2.75F, -34.588F, -67.5F);
		barrel_long.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, 0.7854F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 93, 105, 0.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(-2.75F, -35.588F, -67.5F);
		barrel_long.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, 0.7854F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 66, 106, 0.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(-0.25F, -34.588F, -67.5F);
		barrel_long.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.7854F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 104, 106, -1.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(-0.25F, -35.588F, -67.5F);
		barrel_long.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, -0.7854F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 129, 112, -1.0F, -1.0F, 0.0F, 1, 1, 9, -0.002F, false));

		boltaction = new QRenderer(this);
		boltaction.setRotationPoint(0.1F, 24.25F, -12.0F);
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 31, -3.3F, -35.6F, 18.5F, 1, 3, 13, -0.1F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-2.0F, -36.9F, 18.65F);
		boltaction.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, 0.0F, 1.0996F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 32, 45, 0.13F, 0.15F, -0.15F, 1, 1, 13, -0.101F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-3.2F, -35.5F, 18.65F);
		boltaction.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, 0.0F, -1.0996F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 32, 31, -0.1F, -0.1F, -0.15F, 1, 1, 13, -0.1F, false));

		boltaction_main = new QRenderer(this);
		boltaction_main.setRotationPoint(0.0F, -15.35F, 6.5F);
		

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(-3.1F, 4.15F, 0.4F);
		boltaction_main.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.2123F, 0.0988F, 0.8593F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 55, 31, -0.1F, -1.0F, -0.15F, 1, 5, 1, -0.1F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-3.9F, 4.85F, 0.6F);
		boltaction_main.addChild(bone);
		

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r127);
		setRotationAngle(cube_r127, -0.0297F, 0.0561F, 0.8379F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 22, 0, -0.1F, -0.2F, -0.15F, 1, 3, 1, -0.1F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.4416F, 0.0561F, 0.8379F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 6, 0, -0.1F, 0.0F, -0.15F, 1, 3, 1, -0.1F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.2259F, 0.0607F, 1.0302F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 14, 0, -0.1F, -0.2F, -0.15F, 1, 3, 1, -0.1F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.1875F, 0.1405F, 0.6526F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 0, 0, -0.1F, 0.0F, -0.15F, 1, 3, 1, -0.1F, false));

		magazine_actual = new QRenderer(this);
		magazine_actual.setRotationPoint(0.0F, -3.0F, 7.1F);
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 0, 92, -1.2F, -5.4F, 0.0F, 1, 5, 10, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 35, 0, -2.8F, -5.4F, 0.0F, 2, 5, 10, -0.001F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 108, 91, -3.0F, -0.4F, -0.25F, 3, 3, 5, 0.1F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 80, 63, -0.75F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 57, 39, -0.35F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 18, 92, -0.35F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 84, 91, -0.35F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 24, 56, -0.35F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 15, 77, -0.75F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 47, 53, -0.75F, 0.499F, 5.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 32, 51, -0.75F, 0.499F, 2.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 33, -0.75F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 47, 39, -3.65F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 13, -3.65F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 15, 47, -3.65F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 5, -3.65F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 5, 47, -3.25F, 0.499F, 2.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 88, 0, -3.25F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 32, 45, -3.25F, 0.499F, 5.95F, 1, 2, 1, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 0, 77, -3.25F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 51, 73, -3.25F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_actual.cubeList.add(new ModelBox(magazine_actual, 131, 50, -3.0F, -0.4F, 4.15F, 3, 3, 6, 0.101F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(-3.15F, -1.1F, 0.95F);
		magazine_actual.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 0.0F, 0.0873F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 88, 18, 0.0F, 0.999F, 3.0F, 1, 1, 2, -0.001F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-3.15F, -1.5F, 0.95F);
		magazine_actual.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, 0.0F, 0.0873F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 88, 28, 0.0F, 0.999F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(0.15F, -1.1F, 0.95F);
		magazine_actual.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, 0.0F, -0.0873F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 88, 41, -1.0F, 0.999F, 3.0F, 1, 1, 2, -0.001F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(0.15F, -1.5F, 0.95F);
		magazine_actual.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.0F, -0.0873F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 88, 46, -1.0F, 0.999F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(-3.25F, -0.1F, 3.95F);
		magazine_actual.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, 0.0F, 0.1222F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 39, 45, 0.0F, -3.001F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(0.25F, -0.1F, 3.95F);
		magazine_actual.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0F, 0.0F, -0.1222F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 22, 47, -1.0F, -3.001F, 0.0F, 1, 3, 2, 0.0F, false));

		magazine_ext = new QRenderer(this);
		magazine_ext.setRotationPoint(0.0F, -3.0F, 7.1F);
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 66, 91, -1.2F, -5.4F, 0.0F, 1, 5, 10, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 0, 0, -2.8F, -5.4F, 0.0F, 2, 5, 10, -0.001F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 26, 92, -3.0F, -0.4F, -0.25F, 3, 7, 5, 0.1F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 0, 69, -0.75F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 41, 21, -0.35F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 86, 68, -0.35F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 86, 63, -0.35F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 35, 21, -0.35F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 68, 46, -0.75F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 105, 28, -0.75F, 0.499F, 5.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 58, 69, -0.75F, 0.499F, 2.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 21, 77, -0.75F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 23, 31, -3.65F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 74, 41, -3.65F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 15, 31, -3.65F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 74, 28, -3.65F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 55, 63, -3.25F, 0.499F, 2.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 74, 18, -3.25F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 58, 14, -3.25F, 0.499F, 5.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 68, 41, -3.25F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 35, 21, -3.25F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 129, 82, -3.0F, -0.4F, 4.15F, 3, 7, 6, 0.101F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-3.15F, -1.1F, 0.95F);
		magazine_ext.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.0F, 0.0873F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 74, 46, 0.0F, 0.999F, 3.0F, 1, 1, 2, -0.001F, false));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-3.15F, -1.5F, 0.95F);
		magazine_ext.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, 0.0873F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 6, 77, 0.0F, 0.999F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(0.15F, -1.1F, 0.95F);
		magazine_ext.addChild(cube_r139);
		setRotationAngle(cube_r139, 0.0F, 0.0F, -0.0873F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 6, 82, -1.0F, 0.999F, 3.0F, 1, 1, 2, -0.001F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(0.15F, -1.5F, 0.95F);
		magazine_ext.addChild(cube_r140);
		setRotationAngle(cube_r140, 0.0F, 0.0F, -0.0873F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 21, 82, -1.0F, 0.999F, 3.0F, 1, 1, 2, 0.0F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(-3.25F, -0.1F, 3.95F);
		magazine_ext.addChild(cube_r141);
		setRotationAngle(cube_r141, 0.0F, 0.0F, 0.1222F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 22, 37, 0.0F, -3.001F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(0.25F, -0.1F, 3.95F);
		magazine_ext.addChild(cube_r142);
		setRotationAngle(cube_r142, 0.0F, 0.0F, -0.1222F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 39, 37, -1.0F, -3.001F, 0.0F, 1, 3, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		handguard.render(f5);
//		handguard_railed.render(f5);
		barrel.render(f5);
//		barrel_long.render(f5);
//		boltaction.render(f5);
//		boltaction_main.render(f5);
//		magazine_actual.render(f5);
//		magazine_ext.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
