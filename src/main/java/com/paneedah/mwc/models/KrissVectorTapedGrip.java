package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KrissVectorTapedGrip extends ModelWithAttachments {
	private final ModelRenderer main;
	private final ModelRenderer toprail;
	private final ModelRenderer gun184_r1;
	private final ModelRenderer gun210_r1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer bone;
	private final ModelRenderer gun3_r2;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun5_r5;
	private final ModelRenderer bone2;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun5_r6;
	private final ModelRenderer gun6_r4;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer gun237_r1;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun18_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer grip;
	private final ModelRenderer gun248_r1;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer trigger;
	private final ModelRenderer gun250_r1;
	private final ModelRenderer gun249_r1;
	private final ModelRenderer bolt;
	private final ModelRenderer gun110_r1;
	private final ModelRenderer gun111_r1;
	private final ModelRenderer gun109_r1;
	private final ModelRenderer gun108_r1;
	private final ModelRenderer gun;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer default_kit;
	private final ModelRenderer handguard2;
	private final ModelRenderer handguard_r1;
	private final ModelRenderer handguard_r2;
	private final ModelRenderer handguard79_r3;
	private final ModelRenderer handguard78_r3;
	private final ModelRenderer handguard77_r3;
	private final ModelRenderer handguard76_r3;
	private final ModelRenderer handguard75_r3;
	private final ModelRenderer handguard71_r2;
	private final ModelRenderer handguard64_r2;
	private final ModelRenderer handguard50_r3;
	private final ModelRenderer handguard49_r3;
	private final ModelRenderer handguard45_r3;
	private final ModelRenderer handguard35_r3;
	private final ModelRenderer handguard31_r3;
	private final ModelRenderer handguard30_r3;
	private final ModelRenderer handguard29_r3;
	private final ModelRenderer handguard28_r3;
	private final ModelRenderer handguard27_r3;
	private final ModelRenderer handguard22_r3;
	private final ModelRenderer handguard20_r3;
	private final ModelRenderer handguard19_r3;
	private final ModelRenderer handguard18_r3;
	private final ModelRenderer handguard3_r3;
	private final ModelRenderer barrel2;
	private final ModelRenderer kit_556;
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
	private final ModelRenderer handguard3;
	private final ModelRenderer handguard_r3;
	private final ModelRenderer handguard_r4;
	private final ModelRenderer handguard_r5;
	private final ModelRenderer handguard_r6;
	private final ModelRenderer handguard_r7;
	private final ModelRenderer handguard_r8;
	private final ModelRenderer handguard79_r2;
	private final ModelRenderer handguard78_r2;
	private final ModelRenderer handguard77_r2;
	private final ModelRenderer handguard76_r2;
	private final ModelRenderer handguard75_r2;
	private final ModelRenderer handguard71_r3;
	private final ModelRenderer handguard64_r3;
	private final ModelRenderer handguard50_r2;
	private final ModelRenderer handguard49_r2;
	private final ModelRenderer handguard45_r2;
	private final ModelRenderer handguard35_r2;
	private final ModelRenderer handguard31_r2;
	private final ModelRenderer handguard30_r2;
	private final ModelRenderer handguard29_r2;
	private final ModelRenderer handguard28_r2;
	private final ModelRenderer handguard27_r2;
	private final ModelRenderer handguard22_r2;
	private final ModelRenderer handguard20_r2;
	private final ModelRenderer handguard19_r2;
	private final ModelRenderer handguard18_r2;
	private final ModelRenderer handguard3_r2;
	private final ModelRenderer barrel3;
	private final ModelRenderer stock;
	private final ModelRenderer stock13_r1;
	private final ModelRenderer stock11_r1;
	private final ModelRenderer stock9_r1;
	private final ModelRenderer stock8_r1;
	private final ModelRenderer stock6_r1;
	private final ModelRenderer stock4_r1;
	private final ModelRenderer stock3_r1;
	private final ModelRenderer stock_adapter;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone3;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver14_r1;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver17_r1;
	private final ModelRenderer receiver17_r2;
	private final ModelRenderer receiver17_r3;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver16_r3;
	private final ModelRenderer action;
	private final ModelRenderer mk1_modular_guard;
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
	private final ModelRenderer gun210_r2;
	private final ModelRenderer gun210_r3;
	private final ModelRenderer carbine_guard;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer bone8;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer taped_grip;
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
	private final ModelRenderer magazine_25;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer cube_r115;
	private final ModelRenderer magazine_50;
	private final ModelRenderer cube_r116;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer cube_r121;

	public KrissVectorTapedGrip() {
		textureWidth = 256;
		textureHeight = 256;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, -25.9674F, -4.7717F);
		

		toprail = new ModelRenderer(this);
		toprail.setRotationPoint(-37.781F, 25.9639F, 4.7717F);
		main.addChild(toprail);
		toprail.cubeList.add(new ModelBox(toprail, 62, 1, 34.781F, -12.4965F, -51.19F, 3, 1, 54, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 0, 55, 34.281F, -13.3965F, -51.2F, 4, 1, 54, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 149, 46, 35.281F, -13.7965F, -51.2F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 149, 43, 35.281F, -13.7965F, -49.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 43, 149, 35.281F, -13.7965F, -47.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 149, 40, 35.281F, -13.7965F, -45.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 149, 32, 35.281F, -13.7965F, -43.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 31, 149, 35.281F, -13.7965F, -41.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 149, 30, 35.281F, -13.7965F, -39.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 149, 28, 35.281F, -13.7965F, -37.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 25, 149, 35.281F, -13.7965F, -35.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 19, 149, 35.281F, -13.7965F, -33.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 13, 149, 35.281F, -13.7965F, -31.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 137, 147, 35.281F, -13.7965F, -29.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 129, 147, 35.281F, -13.7965F, -27.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 77, 147, 35.281F, -13.7965F, -25.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 32, 147, 35.281F, -13.7965F, -23.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 26, 147, 35.281F, -13.7965F, -21.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 20, 147, 35.281F, -13.7965F, -19.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 14, 147, 35.281F, -13.7965F, -17.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 146, 92, 35.281F, -13.7965F, -15.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 144, 36, 35.281F, -13.7965F, -13.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 27, 144, 35.281F, -13.7965F, -11.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 21, 144, 35.281F, -13.7965F, -9.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 92, 142, 35.281F, -13.7965F, -7.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 86, 142, 35.281F, -13.7965F, -5.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 141, 104, 35.281F, -13.7965F, -3.201F, 2, 1, 1, 0.0F, false));
		toprail.cubeList.add(new ModelBox(toprail, 41, 83, 35.281F, -13.7965F, -1.2F, 2, 1, 4, 0.0F, false));

		gun184_r1 = new ModelRenderer(this);
		gun184_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		toprail.addChild(gun184_r1);
		setRotationAngle(gun184_r1, 0.0F, 0.0F, 1.2641F);
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 8, 158, -2.5F, -37.8F, -51.19F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 4, 158, -2.5F, -37.8F, -37.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 106, 0, -2.5F, -37.8F, -1.2F, 1, 1, 4, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 0, 158, -2.5F, -37.8F, -3.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 157, 151, -2.5F, -37.8F, -5.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 157, 149, -2.5F, -37.8F, -7.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 157, 147, -2.5F, -37.8F, -9.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 146, 157, -2.5F, -37.8F, -11.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 142, 157, -2.5F, -37.8F, -13.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 126, 157, -2.5F, -37.8F, -15.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 122, 157, -2.5F, -37.8F, -17.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 112, 157, -2.5F, -37.8F, -19.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 108, 157, -2.5F, -37.8F, -21.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 100, 157, -2.5F, -37.8F, -23.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 92, 157, -2.5F, -37.8F, -25.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 39, 157, -2.5F, -37.8F, -27.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 144, -2.5F, -37.8F, -29.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 137, -2.5F, -37.8F, -31.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 135, -2.5F, -37.8F, -33.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 133, -2.5F, -37.8F, -35.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 131, -2.5F, -37.8F, -39.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 129, -2.5F, -37.8F, -41.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 127, -2.5F, -37.8F, -43.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 122, -2.5F, -37.8F, -45.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 120, -2.5F, -37.8F, -47.2F, 1, 1, 1, 0.0F, false));
		gun184_r1.cubeList.add(new ModelBox(gun184_r1, 156, 118, -2.5F, -37.8F, -49.2F, 1, 1, 1, 0.0F, false));

		gun210_r1 = new ModelRenderer(this);
		gun210_r1.setRotationPoint(26.6812F, 22.4903F, 0.0F);
		toprail.addChild(gun210_r1);
		setRotationAngle(gun210_r1, 0.0F, 0.0F, 0.2974F);
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 105, 56, -0.5F, -37.8F, -1.2F, 1, 1, 4, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 156, 116, -0.5F, -37.8F, -47.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 156, 114, -0.5F, -37.8F, -51.19F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 156, 112, -0.5F, -37.8F, -49.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 80, 156, -0.5F, -37.8F, -45.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 76, 156, -0.5F, -37.8F, -43.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 72, 156, -0.5F, -37.8F, -41.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 64, 156, -0.5F, -37.8F, -39.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 56, 156, -0.5F, -37.8F, -37.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 42, 156, -0.5F, -37.8F, -35.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 36, 156, -0.5F, -37.8F, -33.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 30, 156, -0.5F, -37.8F, -31.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 26, 156, -0.5F, -37.8F, -29.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 22, 156, -0.5F, -37.8F, -27.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 8, 156, -0.5F, -37.8F, -25.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 4, 156, -0.5F, -37.8F, -23.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 0, 156, -0.5F, -37.8F, -21.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 146, 155, -0.5F, -37.8F, -19.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 155, 142, -0.5F, -37.8F, -17.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 142, 155, -0.5F, -37.8F, -15.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 126, 155, -0.5F, -37.8F, -13.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 122, 155, -0.5F, -37.8F, -11.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 112, 155, -0.5F, -37.8F, -9.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 108, 155, -0.5F, -37.8F, -7.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 104, 155, -0.5F, -37.8F, -5.2F, 1, 1, 1, 0.0F, false));
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 100, 155, -0.5F, -37.8F, -3.2F, 1, 1, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(0.0F, 49.9674F, 4.7717F);
		main.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 74, 157, 0.5F, -35.0F, -35.2F, 1, 5, 32, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 94, 81, 0.5F, -35.0F, -51.2F, 1, 5, 10, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 56, 154, 0.5F, -34.0F, -41.2F, 1, 4, 6, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 86, 146, 0.5F, -34.5F, -41.2F, 1, 1, 6, -0.001F, false));
		gun2.cubeList.add(new ModelBox(gun2, 114, 211, -4.5F, -35.0F, -51.2F, 5, 5, 16, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 187, -4.5F, -35.0F, -27.2F, 5, 5, 24, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 94, -4.5F, -35.0F, -3.2F, 6, 4, 6, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 88, 41, -4.5F, -35.99F, -24.2F, 6, 2, 5, -0.001F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, -3.5F, -36.0F, -51.2F, 4, 1, 54, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 118, 132, 0.0F, -35.5F, -34.2F, 2, 2, 2, -0.2F, false));
		gun2.cubeList.add(new ModelBox(gun2, 98, 104, -5.0F, -33.5F, -41.2F, 7, 2, 2, -0.2F, false));
		gun2.cubeList.add(new ModelBox(gun2, 108, 132, 0.0F, -32.5F, -30.2F, 2, 2, 2, -0.2F, false));
		gun2.cubeList.add(new ModelBox(gun2, 41, 24, 0.702F, -30.1F, -26.8F, 1, 1, 5, -0.2F, false));
		gun2.cubeList.add(new ModelBox(gun2, 145, 43, 0.702F, -33.1F, -20.5F, 1, 1, 2, -0.2F, false));
		gun2.cubeList.add(new ModelBox(gun2, 154, 71, 0.702F, -35.2F, -20.0F, 1, 1, 1, -0.2F, false));
		gun2.cubeList.add(new ModelBox(gun2, 64, 154, 0.702F, -35.2F, -20.25F, 1, 1, 1, -0.201F, false));
		gun2.cubeList.add(new ModelBox(gun2, 80, 104, -5.0F, -33.5F, -16.2F, 7, 2, 2, -0.2F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(-4.51F, -35.0F, -27.2F);
		gun2.addChild(gun5_r2);
		setRotationAngle(gun5_r2, 0.0F, 0.0F, 1.0297F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 62, 56, 0.0F, -2.0F, -24.0F, 1, 2, 54, -0.001F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(1.51F, -34.5F, -17.2F);
		gun2.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.0F, 0.0F, -1.1868F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 218, 227, -1.0F, -2.0F, -24.0F, 1, 2, 6, -0.001F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(1.51F, -35.0F, -27.2F);
		gun2.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.0F, 0.0F, -1.0297F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 137, 56, -1.0F, -2.0F, -24.0F, 1, 2, 10, -0.001F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 122, 0, -1.0F, -2.0F, -8.0F, 1, 2, 38, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(-4.49F, -30.0F, -35.2F);
		gun2.addChild(gun6_r2);
		setRotationAngle(gun6_r2, 0.0F, 0.6283F, 0.0F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 62, 13, -0.01F, -5.0F, 0.0F, 1, 6, 3, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-4.49F, -30.0F, -27.2F);
		gun2.addChild(gun5_r4);
		setRotationAngle(gun5_r4, 0.0F, -0.6283F, 0.0F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 62, 38, -0.01F, -5.0F, -3.0F, 1, 6, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.8F, -33.8F, -24.0F);
		gun2.addChild(bone);
		

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(0.0F, 0.2F, 0.0F);
		bone.addChild(gun3_r2);
		setRotationAngle(gun3_r2, -0.2793F, 0.0F, 0.0F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 66, 136, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(0.0F, 0.5F, 1.3F);
		bone.addChild(gun4_r2);
		setRotationAngle(gun4_r2, -0.2793F, 0.0F, 0.0F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 145, 46, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		gun5_r5 = new ModelRenderer(this);
		gun5_r5.setRotationPoint(0.3F, 0.7F, 1.4F);
		bone.addChild(gun5_r5);
		setRotationAngle(gun5_r5, -0.2807F, 0.1006F, -0.029F);
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 76, 124, -1.0F, -1.0F, -1.0F, 1, 1, 3, -0.2F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.8F, -33.3F, -6.0F);
		gun2.addChild(bone2);
		setRotationAngle(bone2, -0.4712F, 0.0F, 0.0F);
		

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(-3.6F, 0.3F, 1.3F);
		bone2.addChild(gun6_r3);
		setRotationAngle(gun6_r3, -0.2793F, 0.0F, 0.0F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 77, 144, -3.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 145, 40, 2.6F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-3.9F, 0.5F, 1.4F);
		bone2.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.2807F, -0.1006F, 0.029F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 118, 98, -2.9836F, -1.0F, -0.6864F, 1, 1, 3, -0.2F, false));

		gun5_r6 = new ModelRenderer(this);
		gun5_r6.setRotationPoint(-3.6F, 0.0F, 0.0F);
		bone2.addChild(gun5_r6);
		setRotationAngle(gun5_r6, -0.2793F, 0.0F, 0.0F);
		gun5_r6.cubeList.add(new ModelBox(gun5_r6, 0, 136, -3.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));
		gun5_r6.cubeList.add(new ModelBox(gun5_r6, 6, 136, 2.6F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun6_r4 = new ModelRenderer(this);
		gun6_r4.setRotationPoint(0.3F, 0.5F, 1.4F);
		bone2.addChild(gun6_r4);
		setRotationAngle(gun6_r4, -0.2807F, 0.1006F, -0.029F);
		gun6_r4.cubeList.add(new ModelBox(gun6_r4, 118, 102, -1.0F, -1.0F, -1.0F, 1, 1, 3, -0.2F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-28.0423F, -54.2699F, 0.0F);
		gun2.addChild(gun238_r1);
		setRotationAngle(gun238_r1, 0.0F, 0.0F, 2.1192F);
		

		gun237_r1 = new ModelRenderer(this);
		gun237_r1.setRotationPoint(-27.738F, -54.4405F, 0.0F);
		gun2.addChild(gun237_r1);
		setRotationAngle(gun237_r1, 0.0F, 0.0F, 2.1192F);
		

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(17.856F, -7.6316F, 0.0F);
		gun2.addChild(gun129_r1);
		setRotationAngle(gun129_r1, 0.0F, 0.0F, -0.5577F);
		

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(0.0F, -38.4207F, 25.7712F);
		gun2.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 1.7474F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 143, 147, -4.51F, -30.0F, -3.2F, 6, 6, 1, 0.0F, false));

		gun18_r1 = new ModelRenderer(this);
		gun18_r1.setRotationPoint(0.0F, 3.4949F, -29.4369F);
		gun2.addChild(gun18_r1);
		setRotationAngle(gun18_r1, -0.7436F, 0.0F, 0.0F);
		gun18_r1.cubeList.add(new ModelBox(gun18_r1, 32, 106, -4.5F, -36.0F, -19.2F, 6, 1, 2, -0.002F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(0.0F, -22.6374F, 14.8325F);
		gun2.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.632F, 0.0F, 0.0F);
		

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(0.0F, 3.7484F, -41.5697F);
		gun2.addChild(gun16_r1);
		setRotationAngle(gun16_r1, -1.0038F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 147, -4.5F, -36.0F, -24.2F, 6, 2, 1, -0.002F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 49.9674F, 4.7717F);
		main.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 86, 126, -3.5F, -25.7F, -13.2F, 4, 1, 4, 0.0F, false));

		gun248_r1 = new ModelRenderer(this);
		gun248_r1.setRotationPoint(0.0F, -42.7861F, 9.9735F);
		grip.addChild(gun248_r1);
		setRotationAngle(gun248_r1, 1.9705F, 0.0F, 0.0F);
		gun248_r1.cubeList.add(new ModelBox(gun248_r1, 105, 41, -3.51F, -24.7F, -9.2F, 4, 4, 1, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(0.0F, -41.7391F, -43.2308F);
		grip.addChild(gun13_r1);
		setRotationAngle(gun13_r1, -2.3423F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 16, 106, -4.51F, -30.0F, -12.8F, 6, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(0.0F, -16.817F, -20.6279F);
		grip.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -2.1935F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 129, 112, -4.01F, -13.7F, -6.0F, 5, 3, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(0.0F, -16.1992F, -14.08F);
		grip.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -1.3384F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 43, 110, -4.0F, -17.0F, 3.2F, 5, 16, 2, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.0F, -23.0784F, -31.5771F);
		grip.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -1.3384F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 212, 178, -4.01F, -31.5F, -1.2F, 5, 5, 16, 0.0F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(0.0F, -24.2055F, -31.002F);
		grip.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -1.3384F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 0, 110, -3.5F, -31.7F, -0.2F, 4, 7, 16, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0F, 49.9674F, 4.7717F);
		main.addChild(trigger);
		

		gun250_r1 = new ModelRenderer(this);
		gun250_r1.setRotationPoint(0.0F, -43.687F, 12.9697F);
		trigger.addChild(gun250_r1);
		setRotationAngle(gun250_r1, 1.8961F, 0.0F, 0.0F);
		gun250_r1.cubeList.add(new ModelBox(gun250_r1, 24, 110, -2.49F, -26.5F, -9.2F, 2, 4, 1, 0.0F, false));

		gun249_r1 = new ModelRenderer(this);
		gun249_r1.setRotationPoint(0.0F, 1.2286F, -5.8193F);
		trigger.addChild(gun249_r1);
		setRotationAngle(gun249_r1, -0.1859F, 0.0F, 0.0F);
		gun249_r1.cubeList.add(new ModelBox(gun249_r1, 26, 97, -2.5F, -30.6F, -9.5F, 2, 4, 1, 0.0F, false));

		bolt = new ModelRenderer(this);
		bolt.setRotationPoint(0.0F, 49.9674F, 4.7717F);
		main.addChild(bolt);
		bolt.cubeList.add(new ModelBox(bolt, 119, 146, 1.5F, -30.49F, -47.99F, 1, 1, 2, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 80, 223, 0.99F, -30.5F, -48.0F, 1, 1, 8, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 137, 74, 1.0F, -30.0F, -48.01F, 1, 1, 10, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 100, 146, 1.49F, -30.0F, -48.0F, 1, 1, 2, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 175, 182, -0.3F, -30.0F, -41.0F, 1, 1, 14, 0.0F, false));
		bolt.cubeList.add(new ModelBox(bolt, 129, 147, 0.0F, -30.0F, -35.0F, 1, 1, 6, 0.0F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(-34.6914F, 0.0F, -56.0542F);
		bolt.addChild(gun110_r1);
		setRotationAngle(gun110_r1, -3.1416F, -1.2083F, 3.1416F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 141, 24, 2.0F, -30.49F, -40.0F, 2, 1, 1, 0.0F, false));

		gun111_r1 = new ModelRenderer(this);
		gun111_r1.setRotationPoint(-17.0292F, 0.0F, -70.9529F);
		bolt.addChild(gun111_r1);
		setRotationAngle(gun111_r1, -3.1416F, -0.5763F, 3.1416F);
		gun111_r1.cubeList.add(new ModelBox(gun111_r1, 141, 6, 2.0F, -30.01F, -38.0F, 2, 1, 1, 0.0F, false));

		gun109_r1 = new ModelRenderer(this);
		gun109_r1.setRotationPoint(-28.7343F, 0.0F, -79.8625F);
		bolt.addChild(gun109_r1);
		setRotationAngle(gun109_r1, -3.1416F, -0.7993F, 3.1416F);
		gun109_r1.cubeList.add(new ModelBox(gun109_r1, 155, 93, 2.5F, -30.01F, -45.9975F, 1, 1, 1, 0.0F, false));

		gun108_r1 = new ModelRenderer(this);
		gun108_r1.setRotationPoint(-28.7343F, 0.0F, -79.8625F);
		bolt.addChild(gun108_r1);
		setRotationAngle(gun108_r1, -3.1416F, -0.7993F, 3.1416F);
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 92, 155, 2.5F, -30.51F, -46.0F, 1, 1, 1, 0.0F, false));

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, -30.5292F, -51.3761F);
		main.addChild(gun);
		gun.cubeList.add(new ModelBox(gun, 24, 121, -4.51F, 66.2965F, 43.1477F, 6, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 96, -5.0F, 65.4965F, 44.9477F, 7, 2, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 118, 98, -4.499F, 50.4965F, 28.9477F, 6, 1, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 144, 198, -4.5F, 50.4965F, 11.9477F, 4, 1, 9, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 2.3794F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 43, 135, -4.49F, -29.0F, -44.2F, 4, 1, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(0.0F, 62.9292F, 31.1349F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -2.1935F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 107, 124, -4.51F, -15.2F, -8.0F, 6, 4, 2, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(0.0F, 55.5673F, 52.7602F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 1.8589F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 88, 73, -4.49F, -11.2F, -11.0F, 6, 4, 3, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.0F, 70.4536F, 15.0509F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -1.3384F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 161, 74, -4.5F, -31.0F, -14.2F, 6, 3, 19, -0.001F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.0F, 56.79F, 71.774F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.8551F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 118, 92, -4.51F, -29.0F, -18.2F, 6, 3, 2, 0.0F, false));

		default_kit = new ModelRenderer(this);
		default_kit.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		handguard2 = new ModelRenderer(this);
		handguard2.setRotationPoint(0.0F, 0.0F, 0.0F);
		default_kit.addChild(handguard2);
		handguard2.cubeList.add(new ModelBox(handguard2, 80, 50, -5.0F, -15.0F, -22.2F, 7, 2, 2, -0.2F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 88, 25, -2.7F, -30.0F, -51.0F, 4, 6, 10, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 172, 147, -2.7F, -29.0F, -41.0F, 4, 5, 26, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 172, 164, -2.71F, -24.0F, -38.0F, 4, 2, 7, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 219, 0, -4.3F, -30.0F, -51.01F, 3, 6, 10, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 118, 56, -4.3F, -29.0F, -41.0F, 2, 5, 6, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 221, 106, -4.29F, -24.001F, -38.0F, 2, 2, 7, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 216, -2.69F, -13.4F, -23.75F, 4, 2, 11, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 170, 213, -4.31F, -13.41F, -23.75F, 4, 2, 11, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 199, 106, -2.71F, -16.0F, -24.0F, 4, 3, 6, -0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 60, 198, -4.29F, -16.0F, -24.0F, 4, 3, 6, -0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 172, 147, -4.298F, -24.0F, -26.0F, 4, 8, 9, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 165, 103, -2.702F, -24.0F, -26.0F, 4, 8, 9, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 129, 142, -4.01F, -13.25F, -29.4F, 5, 2, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 146, 94, 0.3F, -12.8F, -28.6F, 1, 1, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 57, 146, -4.3F, -12.8F, -28.6F, 5, 1, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 94, 146, 0.29F, -12.2F, -28.58F, 1, 1, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 43, 146, -4.29F, -12.21F, -28.59F, 5, 1, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 88, 198, -4.3F, -29.0F, -35.0F, 1, 5, 20, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 145, 41, -3.5F, -24.0F, -50.8F, 4, 1, 13, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 43, 132, -4.0F, -23.4F, -51.0F, 5, 1, 13, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 137, 62, -3.0F, -23.0F, -50.99F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 137, 60, -3.0F, -23.0F, -49.0F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 137, 58, -3.0F, -23.0F, -47.0F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 137, 56, -3.0F, -23.0F, -45.0F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 32, 137, -3.0F, -23.0F, -43.0F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 21, 137, -3.0F, -23.0F, -41.0F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 133, 136, -3.0F, -23.0F, -39.0F, 3, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 57, 110, 0.7F, -28.99F, -34.0F, 1, 5, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 112, 0, 0.7F, -29.0F, -27.0F, 1, 3, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 100, 146, 0.7F, -28.99F, -33.0F, 1, 1, 6, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 129, 136, 1.0F, -28.0F, -33.0F, 1, 2, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 86, 112, 1.0F, -28.0F, -30.0F, 1, 2, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 86, 146, 0.9F, -27.5F, -31.5F, 1, 1, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 76, 132, 1.0F, -25.5F, -32.0F, 1, 1, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 66, 132, 0.99F, -25.0F, -32.01F, 1, 1, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 155, 91, 0.9F, -25.25F, -33.0F, 1, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 71, 146, 0.5F, -25.25F, -28.0F, 1, 1, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 75, -5.0F, -27.2F, -41.7F, 7, 2, 2, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 62, 50, -5.0F, -27.2F, -48.2F, 7, 2, 2, 0.0F, false));

		handguard_r1 = new ModelRenderer(this);
		handguard_r1.setRotationPoint(-4.6F, -15.2F, -25.1F);
		handguard2.addChild(handguard_r1);
		setRotationAngle(handguard_r1, -0.4189F, 0.0F, 0.0F);
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 18, 75, 0.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		handguard_r1.cubeList.add(new ModelBox(handguard_r1, 118, 136, 5.2F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		handguard_r2 = new ModelRenderer(this);
		handguard_r2.setRotationPoint(-4.6F, -20.5F, -27.2F);
		handguard2.addChild(handguard_r2);
		setRotationAngle(handguard_r2, -0.4189F, 0.0F, 0.0F);
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 18, 24, 0.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		handguard_r2.cubeList.add(new ModelBox(handguard_r2, 108, 136, 5.2F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		handguard79_r3 = new ModelRenderer(this);
		handguard79_r3.setRotationPoint(-23.0634F, 0.0F, -34.1033F);
		handguard2.addChild(handguard79_r3);
		setRotationAngle(handguard79_r3, -3.1416F, -1.3198F, 3.1416F);
		handguard79_r3.cubeList.add(new ModelBox(handguard79_r3, 135, 138, 1.7F, -27.0F, -26.0F, 2, 1, 1, 0.0F, false));

		handguard78_r3 = new ModelRenderer(this);
		handguard78_r3.setRotationPoint(-23.597F, 0.0F, -32.2413F);
		handguard2.addChild(handguard78_r3);
		setRotationAngle(handguard78_r3, -3.1416F, -1.3942F, 3.1416F);
		handguard78_r3.cubeList.add(new ModelBox(handguard78_r3, 131, 4, 1.7F, -29.0F, -26.0F, 3, 1, 1, 0.0F, false));

		handguard77_r3 = new ModelRenderer(this);
		handguard77_r3.setRotationPoint(-4.7861F, 0.0F, -67.4189F);
		handguard2.addChild(handguard77_r3);
		setRotationAngle(handguard77_r3, -3.1416F, -0.2417F, 3.1416F);
		handguard77_r3.cubeList.add(new ModelBox(handguard77_r3, 145, 49, 1.7F, -25.0F, -34.0F, 1, 1, 2, 0.0F, false));

		handguard76_r3 = new ModelRenderer(this);
		handguard76_r3.setRotationPoint(-2.2856F, 0.0F, -67.8084F);
		handguard2.addChild(handguard76_r3);
		setRotationAngle(handguard76_r3, -3.1416F, -0.1673F, 3.1416F);
		handguard76_r3.cubeList.add(new ModelBox(handguard76_r3, 131, 0, 1.7F, -27.0F, -34.0F, 1, 1, 3, 0.0F, false));

		handguard75_r3 = new ModelRenderer(this);
		handguard75_r3.setRotationPoint(-1.0262F, 0.0F, -67.9331F);
		handguard2.addChild(handguard75_r3);
		setRotationAngle(handguard75_r3, -3.1416F, -0.1301F, 3.1416F);
		handguard75_r3.cubeList.add(new ModelBox(handguard75_r3, 127, 74, 1.7F, -28.99F, -34.0F, 1, 1, 3, 0.0F, false));

		handguard71_r2 = new ModelRenderer(this);
		handguard71_r2.setRotationPoint(21.3109F, -27.4633F, 0.0F);
		handguard2.addChild(handguard71_r2);
		setRotationAngle(handguard71_r2, 0.0F, 0.0F, -1.8218F);
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 155, 80, 0.0F, -22.0F, -39.0F, 1, 1, 1, 0.0F, false));
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 155, 77, 0.0F, -22.0F, -41.0F, 1, 1, 1, 0.0F, false));
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 155, 75, 0.0F, -22.0F, -43.0F, 1, 1, 1, 0.0F, false));
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 155, 68, 0.0F, -22.0F, -45.0F, 1, 1, 1, 0.0F, false));
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 155, 62, 0.0F, -22.0F, -47.0F, 1, 1, 1, 0.0F, false));
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 155, 59, 0.0F, -22.0F, -49.0F, 1, 1, 1, 0.0F, false));
		handguard71_r2.cubeList.add(new ModelBox(handguard71_r2, 39, 155, 0.0F, -22.0F, -50.98F, 1, 1, 1, 0.0F, false));

		handguard64_r2 = new ModelRenderer(this);
		handguard64_r2.setRotationPoint(-0.6479F, -44.0787F, 0.0F);
		handguard2.addChild(handguard64_r2);
		setRotationAngle(handguard64_r2, 0.0F, 0.0F, -2.8999F);
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 155, 33, -3.0F, -22.0F, -39.0F, 1, 1, 1, 0.0F, false));
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 155, 15, -3.0F, -22.0F, -41.0F, 1, 1, 1, 0.0F, false));
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 155, 13, -3.0F, -22.0F, -43.0F, 1, 1, 1, 0.0F, false));
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 155, 11, -3.0F, -22.0F, -45.0F, 1, 1, 1, 0.0F, false));
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 80, 154, -3.0F, -22.0F, -47.0F, 1, 1, 1, 0.0F, false));
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 76, 154, -3.0F, -22.0F, -49.0F, 1, 1, 1, 0.0F, false));
		handguard64_r2.cubeList.add(new ModelBox(handguard64_r2, 72, 154, -3.0F, -22.0F, -50.98F, 1, 1, 1, 0.0F, false));

		handguard50_r3 = new ModelRenderer(this);
		handguard50_r3.setRotationPoint(-18.4475F, -36.452F, 0.0F);
		handguard2.addChild(handguard50_r3);
		setRotationAngle(handguard50_r3, 0.0F, 0.0F, 2.1192F);
		handguard50_r3.cubeList.add(new ModelBox(handguard50_r3, 47, 218, 1.0F, -23.4F, -50.79F, 1, 1, 13, 0.0F, false));

		handguard49_r3 = new ModelRenderer(this);
		handguard49_r3.setRotationPoint(12.4261F, -6.261F, 0.0F);
		handguard2.addChild(handguard49_r3);
		setRotationAngle(handguard49_r3, 0.0F, 0.0F, -0.5949F);
		handguard49_r3.cubeList.add(new ModelBox(handguard49_r3, 32, 217, -4.0F, -23.4F, -50.79F, 1, 1, 13, 0.0F, false));

		handguard45_r3 = new ModelRenderer(this);
		handguard45_r3.setRotationPoint(0.0F, 8.3073F, -39.7222F);
		handguard2.addChild(handguard45_r3);
		setRotationAngle(handguard45_r3, -1.1897F, 0.0F, 0.0F);
		handguard45_r3.cubeList.add(new ModelBox(handguard45_r3, 219, 75, -2.71F, -25.2F, -26.0F, 4, 3, 9, 0.0F, false));
		handguard45_r3.cubeList.add(new ModelBox(handguard45_r3, 108, 146, -2.71F, -24.5F, -17.0F, 4, 3, 3, 0.0F, false));
		handguard45_r3.cubeList.add(new ModelBox(handguard45_r3, 40, 97, -4.29F, -24.5F, -17.0F, 4, 3, 3, 0.0F, false));
		handguard45_r3.cubeList.add(new ModelBox(handguard45_r3, 62, 218, -4.3F, -25.2F, -26.0F, 4, 3, 9, -0.001F, false));

		handguard35_r3 = new ModelRenderer(this);
		handguard35_r3.setRotationPoint(0.0F, -36.3345F, -30.4498F);
		handguard2.addChild(handguard35_r3);
		setRotationAngle(handguard35_r3, 2.3051F, 0.0F, 0.0F);
		handguard35_r3.cubeList.add(new ModelBox(handguard35_r3, 122, 48, -4.3F, -11.734F, -22.9985F, 4, 2, 2, 0.0F, false));
		handguard35_r3.cubeList.add(new ModelBox(handguard35_r3, 122, 44, -2.7F, -11.7295F, -22.9985F, 4, 2, 2, 0.0F, false));

		handguard31_r3 = new ModelRenderer(this);
		handguard31_r3.setRotationPoint(0.0F, 12.4739F, -39.5643F);
		handguard2.addChild(handguard31_r3);
		setRotationAngle(handguard31_r3, -1.1897F, 0.0F, 0.0F);
		handguard31_r3.cubeList.add(new ModelBox(handguard31_r3, 36, 169, -4.0F, -24.0F, -29.0F, 5, 3, 11, 0.1F, false));

		handguard30_r3 = new ModelRenderer(this);
		handguard30_r3.setRotationPoint(0.0F, 12.146F, -42.0489F);
		handguard2.addChild(handguard30_r3);
		setRotationAngle(handguard30_r3, -1.1897F, 0.0F, 0.0F);
		handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 0, 180, -4.28F, -26.0F, -30.0F, 4, 3, 3, 0.0F, false));
		handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 108, 173, -2.7F, -26.0F, -30.0F, 4, 3, 3, -0.001F, false));

		handguard29_r3 = new ModelRenderer(this);
		handguard29_r3.setRotationPoint(0.0F, 14.3304F, -40.8204F);
		handguard2.addChild(handguard29_r3);
		setRotationAngle(handguard29_r3, -1.1897F, 0.0F, 0.0F);
		

		handguard28_r3 = new ModelRenderer(this);
		handguard28_r3.setRotationPoint(0.0F, 15.3575F, -36.1025F);
		handguard2.addChild(handguard28_r3);
		setRotationAngle(handguard28_r3, -1.1897F, 0.0F, 0.0F);
		handguard28_r3.cubeList.add(new ModelBox(handguard28_r3, 0, 166, -4.31F, -19.0F, -34.4F, 4, 2, 12, 0.0F, false));
		handguard28_r3.cubeList.add(new ModelBox(handguard28_r3, 165, 129, -2.69F, -19.0F, -34.4F, 4, 2, 12, 0.0F, false));

		handguard27_r3 = new ModelRenderer(this);
		handguard27_r3.setRotationPoint(0.0F, 13.6432F, -32.2361F);
		handguard2.addChild(handguard27_r3);
		setRotationAngle(handguard27_r3, -1.1897F, 0.0F, 0.0F);
		handguard27_r3.cubeList.add(new ModelBox(handguard27_r3, 26, 81, -4.3F, -18.0F, -26.2F, 4, 4, 2, 0.0F, false));
		handguard27_r3.cubeList.add(new ModelBox(handguard27_r3, 41, 30, -2.7F, -18.0F, -26.2F, 4, 4, 2, 0.0F, false));

		handguard22_r3 = new ModelRenderer(this);
		handguard22_r3.setRotationPoint(0.0F, -0.3604F, -29.4557F);
		handguard2.addChild(handguard22_r3);
		setRotationAngle(handguard22_r3, -1.3384F, 0.0F, 0.0F);
		handguard22_r3.cubeList.add(new ModelBox(handguard22_r3, 215, 54, -4.1F, -18.8F, -14.5F, 1, 3, 6, 0.0F, false));
		handguard22_r3.cubeList.add(new ModelBox(handguard22_r3, 191, 182, 0.1F, -18.8F, -14.5F, 1, 3, 6, 0.0F, false));

		handguard20_r3 = new ModelRenderer(this);
		handguard20_r3.setRotationPoint(0.0F, -3.4305F, -34.9371F);
		handguard2.addChild(handguard20_r3);
		setRotationAngle(handguard20_r3, -1.3384F, 0.0F, 0.0F);
		

		handguard19_r3 = new ModelRenderer(this);
		handguard19_r3.setRotationPoint(0.0F, -1.5282F, -28.532F);
		handguard2.addChild(handguard19_r3);
		setRotationAngle(handguard19_r3, -1.3384F, 0.0F, 0.0F);
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 85, 203, -4.3F, -18.8F, -13.3F, 4, 2, 6, 0.0F, false));
		handguard19_r3.cubeList.add(new ModelBox(handguard19_r3, 175, 197, -2.7F, -18.8F, -13.3F, 4, 2, 6, 0.0F, false));

		handguard18_r3 = new ModelRenderer(this);
		handguard18_r3.setRotationPoint(0.0F, 2.6882F, -30.6015F);
		handguard2.addChild(handguard18_r3);
		setRotationAngle(handguard18_r3, -1.3384F, 0.0F, 0.0F);
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 199, 97, -4.3F, -18.0F, -17.0F, 4, 3, 6, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 34, 198, -4.3F, -20.977F, -22.9027F, 4, 3, 6, -0.001F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 197, 0, -2.7F, -18.0F, -17.0F, 4, 3, 6, 0.0F, false));
		handguard18_r3.cubeList.add(new ModelBox(handguard18_r3, 197, 9, -2.7F, -20.977F, -22.9027F, 4, 3, 6, -0.001F, false));

		handguard3_r3 = new ModelRenderer(this);
		handguard3_r3.setRotationPoint(0.0F, 15.2587F, -41.4485F);
		handguard2.addChild(handguard3_r3);
		setRotationAngle(handguard3_r3, -1.1897F, 0.0F, 0.0F);
		handguard3_r3.cubeList.add(new ModelBox(handguard3_r3, 0, 152, -4.0F, -23.0F, -32.2F, 5, 2, 12, 0.0F, false));
		handguard3_r3.cubeList.add(new ModelBox(handguard3_r3, 76, 136, 0.5F, -22.8143F, -30.2744F, 1, 2, 2, 0.0F, false));

		barrel2 = new ModelRenderer(this);
		barrel2.setRotationPoint(0.0F, 0.0F, 0.0F);
		default_kit.addChild(barrel2);
		barrel2.cubeList.add(new ModelBox(barrel2, 221, 97, -2.5F, -28.5F, -57.99F, 2, 2, 7, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 219, 87, -2.5F, -27.5F, -57.99F, 2, 2, 7, 0.0F, false));
		barrel2.cubeList.add(new ModelBox(barrel2, 201, 129, -3.0F, -28.0F, -58.0F, 3, 2, 7, 0.0F, false));

		kit_556 = new ModelRenderer(this);
		kit_556.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.6F, -38.05F, -35.95F);
		kit_556.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.0077F, -0.3316F, -1.2322F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 133, -4.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.4F, -38.05F, -35.45F);
		kit_556.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.1047F, -0.1222F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 129, 133, -4.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(2.0F, -34.65F, -36.05F);
		kit_556.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1794F, -0.1083F, -0.4268F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.0F, -4.0F, 0.0F, 1, 4, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(2.1F, -26.85F, -37.75F);
		kit_556.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2076F, -0.0266F, -0.0149F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 94, 81, -1.0F, -8.0F, 0.0F, 1, 8, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-5.0F, -27.05F, -38.25F);
		kit_556.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.139F, 0.0097F, -0.0004F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 141, 75, 0.0F, -7.5F, 0.0F, 1, 1, 2, 0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 62, 69, 0.0F, -7.0F, 0.0F, 1, 7, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.4F, -22.05F, -38.75F);
		kit_556.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, -0.1222F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 106, 81, 0.0F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.4F, -22.05F, -38.75F);
		kit_556.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.1047F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 106, -5.9F, -0.8F, 0.0F, 6, 1, 2, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-4.35F, -10.55F, -28.45F);
		kit_556.addChild(cube_r8);
		setRotationAngle(cube_r8, 1.0828F, -0.0668F, -0.0204F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 62, 38, 0.0F, -2.0F, 0.0F, 3, 2, 9, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.85F, -18.55F, -22.05F);
		kit_556.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3486F, 0.011F, 0.0192F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 110, 194, 0.0F, -2.0F, 0.0F, 4, 2, 11, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-4.9F, -18.15F, -24.35F);
		kit_556.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.1226F, 0.0199F, -0.0098F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 129, 112, 0.0F, -2.0F, 0.0F, 4, 2, 13, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.05F, -15.85F, -31.65F);
		kit_556.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.2967F, 0.0167F, 0.0051F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 86, 132, 0.0F, -2.0F, 0.0F, 5, 2, 1, -0.001F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.35F, -15.85F, -31.65F);
		kit_556.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.2974F, -0.0668F, -0.0204F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 141, 0, 0.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-7.4F, -23.0F, -25.25F);
		kit_556.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0333F, 0.021F, -0.132F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 161, 83, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-6.9F, -25.95F, -25.35F);
		kit_556.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0382F, 0.0097F, 0.182F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 108, 132, 0.0F, 0.0F, 0.0F, 1, 3, 8, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-6.9F, -25.95F, -25.35F);
		kit_556.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0528F, 0.0199F, -0.0098F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 108, 155, 0.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-7.1F, -19.65F, -25.25F);
		kit_556.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0345F, 0.0199F, -0.0098F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 62, 13, 0.0F, -1.0F, 0.0F, 3, 2, 9, -0.1F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-6.9F, -24.15F, -25.35F);
		kit_556.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.1226F, 0.0199F, -0.0098F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 55, 0.0F, -1.0F, 0.0F, 3, 12, 8, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(1.9F, -18.15F, -24.35F);
		kit_556.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1226F, -0.0199F, 0.0098F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 129, 127, -4.0F, -2.0F, 0.0F, 4, 2, 13, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.85F, -18.55F, -22.05F);
		kit_556.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.3486F, -0.011F, -0.0192F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 72, 170, -5.0F, -2.0F, 0.0F, 5, 2, 11, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.35F, -10.55F, -28.45F);
		kit_556.addChild(cube_r20);
		setRotationAngle(cube_r20, 1.0828F, 0.0668F, 0.0204F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 62, 69, -3.0F, -2.0F, 0.0F, 3, 2, 9, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.35F, -15.85F, -31.65F);
		kit_556.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.2974F, 0.0668F, 0.0204F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 141, 18, -1.0F, -2.0F, 0.0F, 1, 2, 8, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.4F, -22.05F, -38.75F);
		kit_556.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.192F, 0.0F, 0.1222F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 64, 112, -1.0F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));

		handguard3 = new ModelRenderer(this);
		handguard3.setRotationPoint(0.0F, 0.0F, 0.0F);
		kit_556.addChild(handguard3);
		handguard3.cubeList.add(new ModelBox(handguard3, 36, 50, -5.0F, -15.0F, -22.2F, 7, 2, 2, -0.2F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 88, 0, -2.7F, -30.0F, -51.0F, 4, 6, 10, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 165, 98, -2.7F, -29.0F, -41.0F, 4, 5, 26, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 108, 164, -2.71F, -24.0F, -38.0F, 4, 2, 7, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 144, 182, -4.3F, -30.0F, -51.01F, 3, 6, 10, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 24, 110, -4.3F, -29.0F, -41.0F, 2, 5, 6, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 204, 216, -4.29F, -24.001F, -38.0F, 2, 2, 7, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 140, 213, -2.69F, -13.4F, -22.95F, 4, 2, 11, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 184, 130, 0.01F, -10.95F, -26.95F, 2, 1, 13, -0.201F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 199, 97, 0.86F, -28.15F, -58.35F, 1, 4, 20, -0.201F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 66, 132, -0.14F, -28.15F, -58.35F, 1, 4, 8, -0.201F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 62, 81, 0.36F, -28.15F, -58.35F, 1, 4, 1, -0.202F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 26, 81, 0.01F, -13.55F, -26.95F, 1, 3, 13, -0.201F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 106, 25, -4.59F, -34.35F, -28.3F, 1, 5, 2, -0.199F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 64, 112, -4.89F, -33.35F, -28.05F, 1, 3, 9, -0.199F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 196, 54, -4.31F, -13.41F, -22.95F, 4, 2, 11, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 0, 196, -2.71F, -16.0F, -24.0F, 4, 3, 6, -0.001F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 85, 194, -4.29F, -16.0F, -24.0F, 4, 3, 6, -0.001F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 142, 155, -4.298F, -24.0F, -26.0F, 4, 8, 9, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 88, 56, -2.702F, -24.0F, -26.0F, 4, 8, 9, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 137, 68, -4.01F, -13.25F, -29.4F, 5, 2, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 34, 144, 0.3F, -12.8F, -28.6F, 1, 1, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 143, 142, -4.3F, -12.8F, -28.6F, 5, 1, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 120, 143, 0.29F, -12.2F, -28.58F, 1, 1, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 43, 128, -4.29F, -12.21F, -28.59F, 5, 1, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 197, 0, -4.3F, -29.0F, -35.0F, 1, 5, 20, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 0, 133, -3.5F, -24.0F, -50.8F, 4, 1, 13, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 122, 40, -4.0F, -23.4F, -51.0F, 5, 1, 13, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 130, 36, -3.0F, -23.0F, -50.99F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 127, 78, -3.0F, -23.0F, -49.0F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 122, 36, -3.0F, -23.0F, -47.0F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 64, 119, -3.0F, -23.0F, -45.0F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 118, 106, -3.0F, -23.0F, -43.0F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 86, 117, -3.0F, -23.0F, -41.0F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 41, 92, -3.0F, -23.0F, -39.0F, 3, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 78, 94, 0.7F, -28.99F, -34.0F, 1, 5, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 111, 56, 0.7F, -29.0F, -27.0F, 1, 3, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 141, 28, 0.7F, -28.99F, -33.0F, 1, 1, 6, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 32, 133, 1.0F, -28.0F, -33.0F, 1, 2, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 75, 112, 1.0F, -28.0F, -30.0F, 1, 2, 3, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 6, 143, 0.9F, -27.5F, -31.5F, 1, 1, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 75, 117, 1.0F, -25.5F, -32.0F, 1, 1, 3, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 96, 116, 0.99F, -25.0F, -32.01F, 1, 1, 3, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 56, 154, 0.9F, -25.25F, -33.0F, 1, 1, 1, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 141, 81, 0.5F, -25.25F, -28.0F, 1, 1, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 18, 50, -5.0F, -27.2F, -41.7F, 7, 2, 2, 0.0F, false));
		handguard3.cubeList.add(new ModelBox(handguard3, 0, 50, -5.0F, -27.2F, -48.2F, 7, 2, 2, 0.0F, false));

		handguard_r3 = new ModelRenderer(this);
		handguard_r3.setRotationPoint(1.81F, -10.15F, -26.95F);
		handguard3.addChild(handguard_r3);
		setRotationAngle(handguard_r3, 0.0F, 0.0F, 0.2269F);
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 21, 133, -0.8F, -6.4F, 4.0F, 1, 2, 9, -0.2F, false));
		handguard_r3.cubeList.add(new ModelBox(handguard_r3, 26, 24, -0.8F, -4.8F, 0.0F, 1, 5, 13, -0.2F, false));

		handguard_r4 = new ModelRenderer(this);
		handguard_r4.setRotationPoint(-1.19F, -6.35F, -13.95F);
		handguard3.addChild(handguard_r4);
		setRotationAngle(handguard_r4, 0.2618F, 0.0F, 0.0F);
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 78, 86, -0.8F, -8.8F, 0.0F, 1, 7, 1, 0.2F, false));
		handguard_r4.cubeList.add(new ModelBox(handguard_r4, 100, 81, -0.8F, -6.8F, 0.0F, 1, 7, 1, 0.0F, false));

		handguard_r5 = new ModelRenderer(this);
		handguard_r5.setRotationPoint(-4.24F, -29.25F, -28.75F);
		handguard3.addChild(handguard_r5);
		setRotationAngle(handguard_r5, -0.2967F, 0.0F, 0.0F);
		handguard_r5.cubeList.add(new ModelBox(handguard_r5, 132, 18, -0.8F, -5.8F, 5.8F, 1, 2, 2, -0.199F, false));

		handguard_r6 = new ModelRenderer(this);
		handguard_r6.setRotationPoint(-4.39F, -29.55F, -28.1F);
		handguard3.addChild(handguard_r6);
		setRotationAngle(handguard_r6, 0.0F, 0.4014F, 0.0F);
		handguard_r6.cubeList.add(new ModelBox(handguard_r6, 77, 38, -2.8F, -4.8F, -0.2F, 3, 5, 1, -0.2F, false));

		handguard_r7 = new ModelRenderer(this);
		handguard_r7.setRotationPoint(1.6F, -20.5F, -27.2F);
		handguard3.addChild(handguard_r7);
		setRotationAngle(handguard_r7, -0.4189F, 0.0F, 0.0F);
		handguard_r7.cubeList.add(new ModelBox(handguard_r7, 86, 135, -1.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		handguard_r8 = new ModelRenderer(this);
		handguard_r8.setRotationPoint(1.6F, -15.2F, -25.1F);
		handguard3.addChild(handguard_r8);
		setRotationAngle(handguard_r8, -0.4189F, 0.0F, 0.0F);
		handguard_r8.cubeList.add(new ModelBox(handguard_r8, 92, 135, -1.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		handguard79_r2 = new ModelRenderer(this);
		handguard79_r2.setRotationPoint(-23.0634F, 0.0F, -34.1033F);
		handguard3.addChild(handguard79_r2);
		setRotationAngle(handguard79_r2, -3.1416F, -1.3198F, 3.1416F);
		handguard79_r2.cubeList.add(new ModelBox(handguard79_r2, 138, 36, 1.7F, -27.0F, -26.0F, 2, 1, 1, 0.0F, false));

		handguard78_r2 = new ModelRenderer(this);
		handguard78_r2.setRotationPoint(-23.597F, 0.0F, -32.2413F);
		handguard3.addChild(handguard78_r2);
		setRotationAngle(handguard78_r2, -3.1416F, -1.3942F, 3.1416F);
		handguard78_r2.cubeList.add(new ModelBox(handguard78_r2, 41, 81, 1.7F, -29.0F, -26.0F, 3, 1, 1, 0.0F, false));

		handguard77_r2 = new ModelRenderer(this);
		handguard77_r2.setRotationPoint(-4.7861F, 0.0F, -67.4189F);
		handguard3.addChild(handguard77_r2);
		setRotationAngle(handguard77_r2, -3.1416F, -0.2417F, 3.1416F);
		handguard77_r2.cubeList.add(new ModelBox(handguard77_r2, 141, 78, 1.7F, -25.0F, -34.0F, 1, 1, 2, 0.0F, false));

		handguard76_r2 = new ModelRenderer(this);
		handguard76_r2.setRotationPoint(-2.2856F, 0.0F, -67.8084F);
		handguard3.addChild(handguard76_r2);
		setRotationAngle(handguard76_r2, -3.1416F, -0.1673F, 3.1416F);
		handguard76_r2.cubeList.add(new ModelBox(handguard76_r2, 96, 112, 1.7F, -27.0F, -34.0F, 1, 1, 3, 0.0F, false));

		handguard75_r2 = new ModelRenderer(this);
		handguard75_r2.setRotationPoint(-1.0262F, 0.0F, -67.9331F);
		handguard3.addChild(handguard75_r2);
		setRotationAngle(handguard75_r2, -3.1416F, -0.1301F, 3.1416F);
		handguard75_r2.cubeList.add(new ModelBox(handguard75_r2, 106, 76, 1.7F, -28.99F, -34.0F, 1, 1, 3, 0.0F, false));

		handguard71_r3 = new ModelRenderer(this);
		handguard71_r3.setRotationPoint(21.3109F, -27.4633F, 0.0F);
		handguard3.addChild(handguard71_r3);
		setRotationAngle(handguard71_r3, 0.0F, 0.0F, -1.8218F);
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 154, 44, 0.0F, -22.0F, -39.0F, 1, 1, 1, 0.0F, false));
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 42, 154, 0.0F, -22.0F, -41.0F, 1, 1, 1, 0.0F, false));
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 154, 41, 0.0F, -22.0F, -43.0F, 1, 1, 1, 0.0F, false));
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 154, 36, 0.0F, -22.0F, -45.0F, 1, 1, 1, 0.0F, false));
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 36, 154, 0.0F, -22.0F, -47.0F, 1, 1, 1, 0.0F, false));
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 154, 31, 0.0F, -22.0F, -49.0F, 1, 1, 1, 0.0F, false));
		handguard71_r3.cubeList.add(new ModelBox(handguard71_r3, 30, 154, 0.0F, -22.0F, -50.98F, 1, 1, 1, 0.0F, false));

		handguard64_r3 = new ModelRenderer(this);
		handguard64_r3.setRotationPoint(-0.6479F, -44.0787F, 0.0F);
		handguard3.addChild(handguard64_r3);
		setRotationAngle(handguard64_r3, 0.0F, 0.0F, -2.8999F);
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 154, 29, -3.0F, -22.0F, -39.0F, 1, 1, 1, 0.0F, false));
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 26, 154, -3.0F, -22.0F, -41.0F, 1, 1, 1, 0.0F, false));
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 154, 23, -3.0F, -22.0F, -43.0F, 1, 1, 1, 0.0F, false));
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 22, 154, -3.0F, -22.0F, -45.0F, 1, 1, 1, 0.0F, false));
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 154, 21, -3.0F, -22.0F, -47.0F, 1, 1, 1, 0.0F, false));
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 154, 19, -3.0F, -22.0F, -49.0F, 1, 1, 1, 0.0F, false));
		handguard64_r3.cubeList.add(new ModelBox(handguard64_r3, 8, 154, -3.0F, -22.0F, -50.98F, 1, 1, 1, 0.0F, false));

		handguard50_r2 = new ModelRenderer(this);
		handguard50_r2.setRotationPoint(-18.4475F, -36.452F, 0.0F);
		handguard3.addChild(handguard50_r2);
		setRotationAngle(handguard50_r2, 0.0F, 0.0F, 2.1192F);
		handguard50_r2.cubeList.add(new ModelBox(handguard50_r2, 17, 216, 1.0F, -23.4F, -50.79F, 1, 1, 13, 0.0F, false));

		handguard49_r2 = new ModelRenderer(this);
		handguard49_r2.setRotationPoint(12.4261F, -6.261F, 0.0F);
		handguard3.addChild(handguard49_r2);
		setRotationAngle(handguard49_r2, 0.0F, 0.0F, -0.5949F);
		handguard49_r2.cubeList.add(new ModelBox(handguard49_r2, 166, 40, -4.0F, -23.4F, -50.79F, 1, 1, 13, 0.0F, false));

		handguard45_r2 = new ModelRenderer(this);
		handguard45_r2.setRotationPoint(0.0F, 8.3073F, -39.7222F);
		handguard3.addChild(handguard45_r2);
		setRotationAngle(handguard45_r2, -1.1897F, 0.0F, 0.0F);
		handguard45_r2.cubeList.add(new ModelBox(handguard45_r2, 72, 155, -2.71F, -25.2F, -26.0F, 4, 3, 12, 0.0F, false));
		handguard45_r2.cubeList.add(new ModelBox(handguard45_r2, 36, 154, -4.3F, -25.2F, -26.0F, 4, 3, 12, -0.001F, false));

		handguard35_r2 = new ModelRenderer(this);
		handguard35_r2.setRotationPoint(0.0F, -36.3345F, -30.4498F);
		handguard3.addChild(handguard35_r2);
		setRotationAngle(handguard35_r2, 2.3051F, 0.0F, 0.0F);
		handguard35_r2.cubeList.add(new ModelBox(handguard35_r2, 122, 40, -4.3F, -11.1402F, -23.5345F, 4, 2, 2, 0.0F, false));
		handguard35_r2.cubeList.add(new ModelBox(handguard35_r2, 41, 88, -2.7F, -11.1357F, -23.5345F, 4, 2, 2, 0.0F, false));

		handguard31_r2 = new ModelRenderer(this);
		handguard31_r2.setRotationPoint(0.0F, 12.4739F, -39.5643F);
		handguard3.addChild(handguard31_r2);
		setRotationAngle(handguard31_r2, -1.1897F, 0.0F, 0.0F);
		handguard31_r2.cubeList.add(new ModelBox(handguard31_r2, 162, 14, -4.0F, -24.0F, -29.0F, 5, 3, 11, 0.0F, false));

		handguard30_r2 = new ModelRenderer(this);
		handguard30_r2.setRotationPoint(0.0F, 12.146F, -42.0489F);
		handguard3.addChild(handguard30_r2);
		setRotationAngle(handguard30_r2, -1.1897F, 0.0F, 0.0F);
		handguard30_r2.cubeList.add(new ModelBox(handguard30_r2, 156, 172, -4.28F, -26.0F, -30.0F, 4, 3, 3, 0.0F, false));
		handguard30_r2.cubeList.add(new ModelBox(handguard30_r2, 142, 172, -2.7F, -26.0F, -30.0F, 4, 3, 3, -0.001F, false));

		handguard29_r2 = new ModelRenderer(this);
		handguard29_r2.setRotationPoint(0.0F, 14.3304F, -40.8204F);
		handguard3.addChild(handguard29_r2);
		setRotationAngle(handguard29_r2, -1.1897F, 0.0F, 0.0F);
		

		handguard28_r2 = new ModelRenderer(this);
		handguard28_r2.setRotationPoint(0.0F, 15.3575F, -36.1025F);
		handguard3.addChild(handguard28_r2);
		setRotationAngle(handguard28_r2, -1.1897F, 0.0F, 0.0F);
		handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 162, 0, -4.31F, -19.0F, -34.4F, 4, 2, 12, 0.0F, false));
		handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 161, 56, -2.69F, -19.0F, -34.4F, 4, 2, 12, 0.0F, false));

		handguard27_r2 = new ModelRenderer(this);
		handguard27_r2.setRotationPoint(0.0F, 13.6432F, -32.2361F);
		handguard3.addChild(handguard27_r2);
		setRotationAngle(handguard27_r2, -1.1897F, 0.0F, 0.0F);
		handguard27_r2.cubeList.add(new ModelBox(handguard27_r2, 26, 30, -4.3F, -18.0F, -26.2F, 4, 4, 2, 0.0F, false));
		handguard27_r2.cubeList.add(new ModelBox(handguard27_r2, 26, 24, -2.7F, -18.0F, -26.2F, 4, 4, 2, 0.0F, false));

		handguard22_r2 = new ModelRenderer(this);
		handguard22_r2.setRotationPoint(0.0F, -0.3604F, -29.4557F);
		handguard3.addChild(handguard22_r2);
		setRotationAngle(handguard22_r2, -1.3384F, 0.0F, 0.0F);
		handguard22_r2.cubeList.add(new ModelBox(handguard22_r2, 175, 182, -4.1F, -18.8F, -14.5F, 1, 3, 6, 0.0F, false));
		handguard22_r2.cubeList.add(new ModelBox(handguard22_r2, 20, 166, 0.1F, -18.8F, -14.5F, 1, 3, 6, 0.0F, false));

		handguard20_r2 = new ModelRenderer(this);
		handguard20_r2.setRotationPoint(0.0F, -3.4305F, -34.9371F);
		handguard3.addChild(handguard20_r2);
		setRotationAngle(handguard20_r2, -1.3384F, 0.0F, 0.0F);
		

		handguard19_r2 = new ModelRenderer(this);
		handguard19_r2.setRotationPoint(0.0F, -1.5282F, -28.532F);
		handguard3.addChild(handguard19_r2);
		setRotationAngle(handguard19_r2, -1.3384F, 0.0F, 0.0F);
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 197, 25, -4.3F, -18.8F, -13.3F, 4, 2, 6, 0.0F, false));
		handguard19_r2.cubeList.add(new ModelBox(handguard19_r2, 26, 97, -2.7F, -18.8F, -13.3F, 4, 2, 6, 0.0F, false));

		handguard18_r2 = new ModelRenderer(this);
		handguard18_r2.setRotationPoint(0.0F, 2.6882F, -30.6015F);
		handguard3.addChild(handguard18_r2);
		setRotationAngle(handguard18_r2, -1.3384F, 0.0F, 0.0F);
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 60, 189, -4.3F, -18.0F, -17.0F, 4, 3, 6, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 34, 189, -4.3F, -20.977F, -22.9027F, 4, 3, 6, -0.001F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 0, 187, -2.7F, -18.0F, -17.0F, 4, 3, 6, 0.0F, false));
		handguard18_r2.cubeList.add(new ModelBox(handguard18_r2, 108, 180, -2.7F, -20.977F, -22.9027F, 4, 3, 6, -0.001F, false));

		handguard3_r2 = new ModelRenderer(this);
		handguard3_r2.setRotationPoint(0.0F, 15.2587F, -41.4485F);
		handguard3.addChild(handguard3_r2);
		setRotationAngle(handguard3_r2, -1.1897F, 0.0F, 0.0F);
		handguard3_r2.cubeList.add(new ModelBox(handguard3_r2, 86, 132, -4.0F, -23.0F, -32.2F, 5, 2, 12, 0.0F, false));
		handguard3_r2.cubeList.add(new ModelBox(handguard3_r2, 21, 133, 0.5F, -22.8143F, -30.2744F, 1, 2, 2, 0.0F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(0.0F, 0.0F, 0.0F);
		kit_556.addChild(barrel3);
		barrel3.cubeList.add(new ModelBox(barrel3, 144, 184, -2.5F, -28.5F, -77.99F, 2, 2, 27, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 159, 213, -2.5F, -28.8F, -78.99F, 2, 2, 7, 0.002F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 192, 74, -2.5F, -27.2F, -78.99F, 2, 2, 7, 0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 204, 207, -2.0F, -28.5F, -78.99F, 2, 2, 7, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 196, 43, -3.0F, -28.5F, -78.99F, 2, 2, 7, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 192, 83, -3.0F, -27.5F, -78.99F, 2, 2, 7, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 196, 34, -2.0F, -27.5F, -78.99F, 2, 2, 7, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 60, 207, -1.7F, -28.0F, -78.99F, 2, 2, 7, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 206, 144, -3.3F, -28.0F, -78.99F, 2, 2, 7, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 141, 21, -2.5F, -28.8F, -70.99F, 2, 2, 1, 0.002F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 141, 28, -2.0F, -28.5F, -70.99F, 2, 2, 1, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 141, 31, -1.7F, -28.0F, -70.99F, 2, 2, 1, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 43, 141, -2.5F, -27.2F, -70.99F, 2, 2, 1, 0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 49, 141, -2.0F, -27.5F, -70.99F, 2, 2, 1, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 141, 98, -3.3F, -28.0F, -70.99F, 2, 2, 1, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 141, 101, -3.0F, -28.5F, -70.99F, 2, 2, 1, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 0, 143, -3.0F, -27.5F, -70.99F, 2, 2, 1, -0.001F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 113, 182, -2.5F, -27.5F, -77.99F, 2, 2, 27, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 179, 178, -3.0F, -28.0F, -78.0F, 3, 2, 27, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 90, 223, -3.5F, -37.5F, 2.8F, 4, 3, 5, -0.01F, false));
		stock.cubeList.add(new ModelBox(stock, 206, 162, -4.5F, -35.0F, 2.8F, 6, 3, 8, -0.011F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 0, -4.5F, -34.0F, 6.8F, 6, 3, 21, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 141, 98, -4.49F, -29.0F, 27.8F, 6, 3, 8, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 110, -4.51F, -26.0F, 33.8F, 6, 10, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 24, -5.0F, -30.0F, 35.8F, 7, 18, 4, 0.0F, false));

		stock13_r1 = new ModelRenderer(this);
		stock13_r1.setRotationPoint(0.0F, -49.9674F, -4.7717F);
		stock.addChild(stock13_r1);
		setRotationAngle(stock13_r1, -1.3384F, 0.0F, 0.0F);
		stock13_r1.cubeList.add(new ModelBox(stock13_r1, 196, 34, -4.51F, -28.0F, 23.2F, 6, 2, 18, 0.0F, false));

		stock11_r1 = new ModelRenderer(this);
		stock11_r1.setRotationPoint(0.0F, 16.9509F, 36.7697F);
		stock.addChild(stock11_r1);
		setRotationAngle(stock11_r1, 1.3756F, 0.0F, 0.0F);
		stock11_r1.cubeList.add(new ModelBox(stock11_r1, 107, 112, -4.5F, -13.9F, 28.7F, 6, 8, 4, 0.0F, false));

		stock9_r1 = new ModelRenderer(this);
		stock9_r1.setRotationPoint(0.0F, 8.3332F, 10.2568F);
		stock.addChild(stock9_r1);
		setRotationAngle(stock9_r1, 0.3346F, 0.0F, 0.0F);
		stock9_r1.cubeList.add(new ModelBox(stock9_r1, 88, 16, -4.5F, -26.2F, 28.8F, 6, 2, 6, 0.0F, false));

		stock8_r1 = new ModelRenderer(this);
		stock8_r1.setRotationPoint(0.0F, -52.2502F, -12.4578F);
		stock.addChild(stock8_r1);
		setRotationAngle(stock8_r1, -1.3384F, 0.0F, 0.0F);
		stock8_r1.cubeList.add(new ModelBox(stock8_r1, 62, 81, -4.501F, -34.0F, 26.8F, 6, 3, 20, -0.01F, false));

		stock6_r1 = new ModelRenderer(this);
		stock6_r1.setRotationPoint(0.0F, -57.0801F, 24.885F);
		stock.addChild(stock6_r1);
		setRotationAngle(stock6_r1, 2.7512F, 0.0F, 0.0F);
		stock6_r1.cubeList.add(new ModelBox(stock6_r1, 62, 104, -4.51F, -31.0F, 6.8F, 6, 1, 3, 0.0F, false));

		stock4_r1 = new ModelRenderer(this);
		stock4_r1.setRotationPoint(0.0F, -11.0186F, -16.8863F);
		stock.addChild(stock4_r1);
		setRotationAngle(stock4_r1, -0.5577F, 0.0F, 0.0F);
		stock4_r1.cubeList.add(new ModelBox(stock4_r1, 98, 50, -4.51F, -35.0F, 10.8F, 6, 1, 3, 0.0F, false));

		stock3_r1 = new ModelRenderer(this);
		stock3_r1.setRotationPoint(0.0F, -15.1779F, -23.3258F);
		stock.addChild(stock3_r1);
		setRotationAngle(stock3_r1, -0.7436F, 0.0F, 0.0F);
		stock3_r1.cubeList.add(new ModelBox(stock3_r1, 137, 85, -3.5F, -37.5F, 7.8F, 4, 2, 4, 0.0F, false));

		stock_adapter = new ModelRenderer(this);
		stock_adapter.setRotationPoint(1.4F, -7.0F, 2.8F);
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 122, 27, -5.0F, -4.0F, 0.0F, 5, 4, 3, 0.001F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 141, 10, -4.9F, -4.0F, 3.0F, 4, 4, 3, 0.002F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 39, 42, -4.9F, -6.4F, 0.0F, 4, 2, 3, 0.0F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 0, 55, -5.8F, -4.0F, 0.0F, 1, 4, 3, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-5.8F, -4.0F, 0.0F);
		stock_adapter.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 1.0297F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 106, 5, 0.0F, -2.0F, 0.0F, 1, 2, 3, -0.001F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-5.8F, 0.0F, 2.9F);
		stock_adapter.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.2094F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 42, 72, 0.0F, -3.0F, 0.0F, 1, 3, 3, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-5.8F, -4.0F, 3.0F);
		stock_adapter.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0172F, 0.3578F, 1.0285F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 73, 81, 0.0F, -2.0F, 0.0F, 1, 2, 3, -0.001F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -4.0F, 3.0F);
		stock_adapter.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0172F, -0.3578F, -1.0285F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 88, 56, -1.0F, -2.0F, 0.0F, 1, 2, 3, -0.001F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0F, -4.0F, 0.0F);
		stock_adapter.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -1.0297F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 106, 16, -1.0F, -2.0F, 0.0F, 1, 2, 3, -0.001F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.9F, -6.4F, 3.0F);
		stock_adapter.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.6632F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 64, 124, -4.0F, 0.0F, 0.0F, 4, 2, 4, -0.001F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 2.9F);
		stock_adapter.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -0.2094F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 77, 13, -1.0F, -3.0F, 0.0F, 1, 3, 3, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-5.8F, -4.0F, 3.0F);
		stock_adapter.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.3141F, 0.2099F, -0.0317F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 105, 61, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, -4.0F, 3.0F);
		stock_adapter.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.3141F, -0.2099F, 0.0317F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 122, -5.0F, 0.0F, 0.0F, 5, 1, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.9F, -8.25F, -0.45F);
		stock_adapter.addChild(bone3);
		

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(0.0F, 4.6F, 5.9F);
		bone3.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, -0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 78, 128, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 121, 128, -1.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));

		receiver14_r1 = new ModelRenderer(this);
		receiver14_r1.setRotationPoint(-1.75F, 6.35F, 5.9F);
		bone3.addChild(receiver14_r1);
		setRotationAngle(receiver14_r1, 0.0F, 0.0F, 0.4014F);
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 137, 74, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 137, 77, -0.001F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-1.75F, 6.35F, 5.9F);
		bone3.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 137, 80, -0.001F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 43, 138, 0.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver17_r1 = new ModelRenderer(this);
		receiver17_r1.setRotationPoint(0.0F, 8.1F, 5.9F);
		bone3.addChild(receiver17_r1);
		setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.4014F);
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 49, 138, -1.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 21, 139, -1.0F, -1.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver17_r2 = new ModelRenderer(this);
		receiver17_r2.setRotationPoint(0.0F, 8.1F, 5.9F);
		bone3.addChild(receiver17_r2);
		setRotationAngle(receiver17_r2, 0.0F, 0.0F, -0.4014F);
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 32, 139, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 86, 139, 0.35F, -0.999F, 0.001F, 1, 1, 2, 0.0F, false));

		receiver17_r3 = new ModelRenderer(this);
		receiver17_r3.setRotationPoint(1.75F, 6.35F, 5.9F);
		bone3.addChild(receiver17_r3);
		setRotationAngle(receiver17_r3, 0.0F, 0.0F, 0.4014F);
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 92, 139, -0.999F, 0.3F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver17_r3.cubeList.add(new ModelBox(receiver17_r3, 0, 140, -1.0F, 0.0F, 0.002F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(0.0F, 4.6F, 5.9F);
		bone3.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, 0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 6, 140, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 141, 0, 0.35F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(1.75F, 6.35F, 5.9F);
		bone3.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, 0.0F, 0.0F, -0.4014F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 141, 3, -0.999F, -1.35F, -0.0001F, 1, 1, 2, 0.0F, false));
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 141, 18, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 86, 112, -3.0F, -35.0F, -35.2F, 1, 6, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 227, 215, -3.3F, -33.0F, -34.2F, 1, 2, 6, 0.0F, false));

		mk1_modular_guard = new ModelRenderer(this);
		mk1_modular_guard.setRotationPoint(2.5F, -4.5F, -68.0F);
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 36, 154, -1.0F, 0.5F, -7.0F, 1, 1, 34, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 0, 152, -1.0F, 0.0F, -7.0F, 1, 1, 34, 0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 60, 194, -1.0F, -3.0F, -5.25F, 1, 1, 23, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 182, 207, -2.35F, -6.5F, -3.25F, 1, 1, 20, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 105, 56, -2.35F, -5.5F, 15.75F, 1, 3, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 94, 25, -2.35F, -5.5F, -3.5F, 1, 3, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 55, 126, -2.35F, -5.5F, 5.5F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 122, 149, -1.0F, 1.5F, -7.0F, 1, 2, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 129, 67, -1.0F, 1.5F, 0.5F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 128, 56, -1.0F, -2.0F, 0.5F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 102, 149, -1.0F, -1.8F, -5.9F, 1, 2, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 98, 126, -1.0F, -2.0F, 11.0F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 98, 149, -1.0F, -1.6F, 17.5F, 1, 2, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 128, 84, -1.0F, 1.5F, 11.0F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 88, 25, -1.0F, 1.5F, 18.75F, 1, 2, 4, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 88, 31, -1.0F, 1.5F, 22.75F, 1, 1, 3, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 88, 0, -1.0F, 2.5F, 25.75F, 1, 2, 4, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 132, 10, -1.0F, 0.5F, 25.65F, 1, 2, 2, -0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 88, 61, -1.0F, 2.0F, 26.75F, 1, 1, 3, -0.004F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 162, 0, -1.0F, 3.5F, -7.0F, 1, 1, 33, -0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 129, 112, -8.0F, 0.5F, -7.0F, 1, 1, 34, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 161, 40, -8.0F, 3.5F, -7.0F, 1, 1, 33, -0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 108, 155, -6.5F, 4.9F, -7.0F, 5, 1, 24, -0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 13, 81, -8.0F, 1.5F, 18.75F, 1, 2, 4, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 26, 87, -8.0F, 2.5F, 25.75F, 1, 2, 4, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 149, 85, -8.0F, 1.5F, -7.0F, 1, 2, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 118, 56, -8.0F, 0.5F, 25.65F, 1, 2, 2, -0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 77, 74, -8.0F, 2.0F, 26.75F, 1, 1, 3, -0.004F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 88, 6, -8.0F, 1.5F, 22.75F, 1, 1, 3, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 118, 74, -8.0F, 1.5F, 0.5F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 118, 84, -8.0F, 1.5F, 11.0F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 35, 193, -8.0F, -3.0F, -5.25F, 1, 1, 23, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 136, 147, -8.0F, 0.0F, -7.0F, 1, 1, 34, 0.001F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 122, 0, -8.0F, -2.0F, 0.5F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 122, 10, -8.0F, -2.0F, 11.0F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 86, 149, -8.0F, -1.8F, -5.9F, 1, 2, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 94, 149, -8.0F, -1.6F, 17.5F, 1, 2, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 192, 77, -6.0F, -8.9F, -2.25F, 4, 1, 19, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 206, 121, -5.5F, -8.0F, -2.25F, 3, 1, 19, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 206, 141, -6.65F, -6.5F, -3.25F, 1, 1, 20, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 88, 41, -6.65F, -5.5F, 15.75F, 1, 3, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 122, 18, -6.65F, -5.5F, 5.5F, 1, 2, 2, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 94, 0, -6.65F, -5.5F, -3.5F, 1, 3, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 128, 60, -5.0F, -9.3F, 14.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 121, 124, -5.0F, -9.3F, 12.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 122, 14, -5.0F, -9.3F, 8.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 122, 22, -5.0F, -9.3F, 10.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 118, 60, -5.0F, -9.3F, 6.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 118, 88, -5.0F, -9.3F, 4.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 110, 96, -5.0F, -9.3F, 2.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 34, 114, -5.0F, -9.3F, 0.81F, 2, 1, 1, 0.0F, false));
		mk1_modular_guard.cubeList.add(new ModelBox(mk1_modular_guard, 77, 19, -5.0F, -9.3F, -2.19F, 2, 1, 2, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-8.0F, 4.5F, -7.0F);
		mk1_modular_guard.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.7679F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 24, 0.0F, 0.0F, 0.0F, 1, 2, 24, -0.002F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-6.65F, -5.5F, 15.05F);
		mk1_modular_guard.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.7854F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 26, 152, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 152, 4.3F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-8.0F, -3.0F, 14.7F);
		mk1_modular_guard.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, -0.7854F, -0.6632F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 22, 152, 0.95F, 0.0F, -0.45F, 1, 1, 1, -0.003F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-8.0F, -3.0F, 8.5F);
		mk1_modular_guard.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.7854F, -0.6632F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 152, 10, 0.95F, 0.0F, -0.55F, 1, 1, 1, -0.003F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-6.65F, -5.5F, 8.15F);
		mk1_modular_guard.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.7854F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 8, 152, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 152, 58, 4.3F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-8.0F, -3.0F, -1.5F);
		mk1_modular_guard.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.7854F, -0.6632F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 4, 152, 0.95F, 0.0F, -0.55F, 1, 1, 1, -0.003F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-8.0F, -3.0F, 4.45F);
		mk1_modular_guard.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, -0.7854F, -0.6632F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 152, 0.95F, 0.0F, -0.45F, 1, 1, 1, -0.003F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-6.65F, -5.5F, -1.85F);
		mk1_modular_guard.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.7854F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 137, 151, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 152, 69, 4.3F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-6.65F, -5.5F, 4.8F);
		mk1_modular_guard.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.7854F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 129, 151, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 152, 76, 4.3F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-8.0F, -3.0F, -5.25F);
		mk1_modular_guard.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, -0.4014F, -0.6632F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 132, 14, 0.4F, 0.0F, -0.05F, 2, 1, 1, -0.002F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-8.0F, -3.0F, -3.55F);
		mk1_modular_guard.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, -0.6632F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 43, 112, 0.0F, 0.0F, 1.05F, 1, 1, 19, -0.002F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 128, 88, 0.0F, 0.0F, 19.3F, 2, 1, 1, -0.001F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 106, 32, 0.0F, 0.0F, 9.05F, 2, 1, 2, -0.001F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 77, 44, 0.0F, 0.0F, -0.95F, 2, 1, 2, -0.001F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-6.65F, -6.5F, -3.25F);
		mk1_modular_guard.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.5061F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 41, 24, 0.0F, 0.0F, 0.0F, 1, 4, 1, -0.001F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 26, 42, 4.3F, 0.0F, 0.0F, 1, 4, 1, -0.001F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-6.65F, -6.5F, -3.25F);
		mk1_modular_guard.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, -0.6109F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 204, 207, 0.0F, 0.0F, 1.0F, 2, 1, 19, -0.001F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-8.0F, -2.0F, 16.8F);
		mk1_modular_guard.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.7854F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 151, 24, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 152, 79, 7.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-8.0F, 0.0F, 16.8F);
		mk1_modular_guard.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.7854F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 151, 22, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r46.cubeList.add(new ModelBox(cube_r46, 152, 82, 7.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-8.0F, -2.0F, 13.6F);
		mk1_modular_guard.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.7854F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 151, 20, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r47.cubeList.add(new ModelBox(cube_r47, 152, 87, 7.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-8.0F, 0.0F, 13.6F);
		mk1_modular_guard.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.7854F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 151, 18, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r48.cubeList.add(new ModelBox(cube_r48, 152, 92, 7.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-8.0F, -2.0F, -4.2F);
		mk1_modular_guard.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.7854F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 151, 6, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 39, 153, 7.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-8.0F, 0.0F, -4.2F);
		mk1_modular_guard.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.7854F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 151, 4, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 153, 50, 7.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-8.0F, -2.0F, 3.1F);
		mk1_modular_guard.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.7854F, 0.0F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 151, 2, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 153, 56, 7.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-8.0F, 0.0F, 3.1F);
		mk1_modular_guard.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.7854F, 0.0F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 151, 0, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 153, 73, 7.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-8.0F, 0.0F, 10.3F);
		mk1_modular_guard.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.7854F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 150, 137, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 153, 85, 7.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-8.0F, -2.0F, 10.3F);
		mk1_modular_guard.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.7854F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 150, 135, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 153, 89, 7.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-8.0F, -2.0F, -0.2F);
		mk1_modular_guard.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.7854F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 150, 133, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 153, 95, 7.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-8.0F, 0.0F, -0.2F);
		mk1_modular_guard.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.7854F, 0.0F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 150, 131, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 153, 113, 7.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-8.0F, -3.0F, 17.75F);
		mk1_modular_guard.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.5323F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 33, 0, 0.0F, 0.0F, -1.0F, 1, 4, 1, -0.002F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 44, 0, 7.0F, 0.0F, -1.0F, 1, 4, 1, -0.002F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-8.0F, -3.0F, -5.25F);
		mk1_modular_guard.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.5323F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 150, 129, 0.0F, 2.5F, 0.0F, 1, 1, 1, -0.003F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 88, 25, 0.0F, 0.0F, 0.0F, 1, 3, 1, -0.002F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 153, 115, 7.0F, 2.5F, 0.0F, 1, 1, 1, -0.003F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 106, 0, 7.0F, 0.0F, 0.0F, 1, 3, 1, -0.002F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-8.1F, 2.2F, 27.45F);
		mk1_modular_guard.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.4538F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 150, 127, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 153, 117, 7.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-8.1F, 2.2F, 20.45F);
		mk1_modular_guard.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.4538F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 150, 122, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 153, 119, 7.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-8.0F, 1.5F, 18.2F);
		mk1_modular_guard.addChild(cube_r61);
		setRotationAngle(cube_r61, -0.7854F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 150, 120, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 153, 121, 7.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-8.0F, 3.5F, 18.2F);
		mk1_modular_guard.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.7854F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 150, 118, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 153, 123, 7.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-8.0F, 3.5F, 13.6F);
		mk1_modular_guard.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.7854F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 150, 116, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 153, 128, 7.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-8.0F, 1.5F, 13.6F);
		mk1_modular_guard.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.7854F, 0.0F, 0.0F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 150, 114, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 153, 130, 7.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-8.0F, 1.5F, 3.1F);
		mk1_modular_guard.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.7854F, 0.0F, 0.0F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 150, 112, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 153, 132, 7.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-8.0F, 3.5F, 3.1F);
		mk1_modular_guard.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.7854F, 0.0F, 0.0F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 150, 94, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 153, 134, 7.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-8.0F, 3.5F, 10.3F);
		mk1_modular_guard.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.7854F, 0.0F, 0.0F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 150, 71, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r67.cubeList.add(new ModelBox(cube_r67, 153, 136, 7.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-8.0F, 1.5F, 10.3F);
		mk1_modular_guard.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.7854F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 150, 51, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 153, 138, 7.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-8.0F, 3.5F, -5.4F);
		mk1_modular_guard.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.7854F, 0.0F, 0.0F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 150, 36, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));
		cube_r69.cubeList.add(new ModelBox(cube_r69, 0, 154, 7.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-8.0F, 3.5F, -0.2F);
		mk1_modular_guard.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.7854F, 0.0F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 137, 149, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 154, 1, 7.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-8.0F, 1.5F, -0.2F);
		mk1_modular_guard.addChild(cube_r71);
		setRotationAngle(cube_r71, -0.7854F, 0.0F, 0.0F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 129, 149, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 154, 3, 7.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-8.0F, 1.5F, -5.4F);
		mk1_modular_guard.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.7854F, 0.0F, 0.0F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 77, 149, 0.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 4, 154, 7.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-8.0F, 0.0F, 27.0F);
		mk1_modular_guard.addChild(cube_r73);
		setRotationAngle(cube_r73, -0.6283F, 0.0F, 0.0F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 73, 149, 0.0F, 0.0F, 2.4F, 1, 1, 1, -0.003F, false));
		cube_r73.cubeList.add(new ModelBox(cube_r73, 46, 16, 0.0F, 0.0F, 0.0F, 1, 2, 3, -0.002F, false));
		cube_r73.cubeList.add(new ModelBox(cube_r73, 154, 5, 7.0F, 0.0F, 2.4F, 1, 1, 1, -0.003F, false));
		cube_r73.cubeList.add(new ModelBox(cube_r73, 77, 69, 7.0F, 0.0F, 0.0F, 1, 2, 3, -0.002F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 4.5F, -7.0F);
		mk1_modular_guard.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, 0.7679F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 55, -1.0F, 0.0F, 0.0F, 1, 2, 24, -0.002F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-1.35F, -6.5F, -3.25F);
		mk1_modular_guard.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, 0.6109F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 210, 55, -2.0F, 0.0F, 1.0F, 2, 1, 19, -0.001F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.0F, -3.0F, 8.5F);
		mk1_modular_guard.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, -0.7854F, 0.6632F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 152, 48, -1.95F, 0.0F, -0.55F, 1, 1, 1, -0.003F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(0.0F, -3.0F, 14.7F);
		mk1_modular_guard.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.7854F, 0.6632F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 36, 152, -1.95F, 0.0F, -0.45F, 1, 1, 1, -0.003F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.0F, -3.0F, 14.7F);
		mk1_modular_guard.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, 0.0F, 0.6632F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 137, 64, -2.0F, 0.0F, 1.05F, 2, 1, 1, -0.001F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 106, 88, -2.0F, 0.0F, -9.2F, 2, 1, 2, -0.001F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 86, 112, -1.0F, 0.0F, -17.2F, 1, 1, 19, -0.002F, false));
		cube_r78.cubeList.add(new ModelBox(cube_r78, 108, 46, -2.0F, 0.0F, -19.2F, 2, 1, 2, -0.001F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(0.0F, -3.0F, -1.5F);
		mk1_modular_guard.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, -0.7854F, 0.6632F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 152, 61, -1.95F, 0.0F, -0.55F, 1, 1, 1, -0.003F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, -3.0F, 4.45F);
		mk1_modular_guard.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.7854F, 0.6632F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 152, 64, -1.95F, 0.0F, -0.45F, 1, 1, 1, -0.003F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.0F, -3.0F, -5.25F);
		mk1_modular_guard.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.4014F, 0.6632F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 132, 22, -2.4F, 0.0F, -0.05F, 2, 1, 1, -0.002F, false));

		gun210_r2 = new ModelRenderer(this);
		gun210_r2.setRotationPoint(-13.5998F, 26.9868F, 50.0F);
		mk1_modular_guard.addChild(gun210_r2);
		setRotationAngle(gun210_r2, 0.0F, 0.0F, 0.2974F);
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 69, 149, -0.5F, -37.8F, -47.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 123, 102, -0.5F, -37.8F, -52.19F, 1, 1, 2, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 149, 68, -0.5F, -37.8F, -49.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 65, 149, -0.5F, -37.8F, -45.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 61, 149, -0.5F, -37.8F, -43.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 57, 149, -0.5F, -37.8F, -41.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 53, 149, -0.5F, -37.8F, -39.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 149, 49, -0.5F, -37.8F, -37.2F, 1, 1, 1, 0.0F, false));
		gun210_r2.cubeList.add(new ModelBox(gun210_r2, 49, 149, -0.5F, -37.8F, -35.2F, 1, 1, 1, 0.0F, false));

		gun210_r3 = new ModelRenderer(this);
		gun210_r3.setRotationPoint(5.5998F, 26.9868F, 50.0F);
		mk1_modular_guard.addChild(gun210_r3);
		setRotationAngle(gun210_r3, 0.0F, 0.0F, -0.2974F);
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 123, 146, -0.5F, -37.8F, -47.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 123, 98, -0.5F, -37.8F, -52.19F, 1, 1, 2, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 98, 146, -0.5F, -37.8F, -49.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 69, 146, -0.5F, -37.8F, -45.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 55, 146, -0.5F, -37.8F, -43.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 145, 18, -0.5F, -37.8F, -41.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 145, 3, -0.5F, -37.8F, -39.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 145, 0, -0.5F, -37.8F, -37.2F, 1, 1, 1, 0.0F, false));
		gun210_r3.cubeList.add(new ModelBox(gun210_r3, 143, 64, -0.5F, -37.8F, -35.2F, 1, 1, 1, 0.0F, false));

		carbine_guard = new ModelRenderer(this);
		carbine_guard.setRotationPoint(2.5F, -2.5F, -81.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.1F, 0.0F, 0.0F);
		carbine_guard.addChild(bone4);
		

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, 0.0F, 35.0F);
		bone4.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, 0.4363F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 0, 81, -1.0F, 0.0F, -3.0F, 1, 2, 11, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 135, 27, -1.0F, 0.0F, -8.5F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 64, 124, -1.0F, 0.0F, -5.0F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 149, 59, -1.0F, 0.0F, -15.5F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 37, 148, -1.0F, 0.0F, -12.0F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 149, 74, -1.0F, 0.0F, -22.5F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 149, 62, -1.0F, 0.0F, -19.0F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 149, 77, -1.0F, 0.0F, -26.0F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 149, 80, -1.0F, 0.0F, -29.5F, 1, 2, 1, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 118, 56, -1.0F, 1.5F, -33.0F, 1, 1, 41, -0.001F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 132, 92, -1.0F, 2.0F, -13.0F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 25, 133, -1.0F, 2.0F, -20.0F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 36, 133, -1.0F, 2.0F, -27.0F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 90, 135, -1.0F, 2.0F, -30.5F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 4, 136, -1.0F, 2.0F, -23.5F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 70, 136, -1.0F, 2.0F, -16.5F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 80, 136, -1.0F, 2.0F, -9.5F, 1, 1, 1, -0.003F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 122, 18, -1.0F, 2.0F, -9.0F, 1, 1, 17, -0.002F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 101, 116, -1.0F, 0.0F, -33.0F, 1, 2, 1, 0.001F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 18, 94, -1.0F, 0.0F, -35.0F, 1, 3, 2, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.0F, 0.0F, 35.0F);
		bone4.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.4363F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 62, 56, -1.0F, -2.0F, -3.0F, 1, 2, 11, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 86, 126, -1.0F, -2.0F, -8.5F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 123, 112, -1.0F, -2.0F, -5.0F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 149, 56, -1.0F, -2.0F, -15.5F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 137, 85, -1.0F, -2.0F, -12.0F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 78, 81, -1.0F, -2.0F, -22.5F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 82, 13, -1.0F, -2.0F, -19.0F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 67, 38, -1.0F, -2.0F, -26.0F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 67, 13, -1.0F, -2.0F, -29.5F, 1, 2, 1, -0.003F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 43, 112, -1.0F, -2.5F, -33.0F, 1, 1, 41, 0.0F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 49, 92, -1.0F, -3.0F, -30.5F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 100, 89, -1.0F, -3.0F, -23.5F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 96, 50, -1.0F, -3.0F, -27.0F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 77, 104, -1.0F, -3.0F, -16.5F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 46, 103, -1.0F, -3.0F, -20.0F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 96, 104, -1.0F, -3.0F, -13.0F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 14, 106, -1.0F, -3.0F, -9.5F, 1, 1, 1, -0.002F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 118, 74, -1.0F, -3.0F, -9.0F, 1, 1, 17, -0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 50, 47, -1.0F, -2.0F, -33.0F, 1, 2, 1, 0.001F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 48, 24, -1.0F, -3.0F, -35.0F, 1, 3, 2, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-8.2F, 0.0F, -13.5F);
		bone4.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.0F, 0.4363F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 35, 92, 0.0F, -3.0F, 25.0F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 118, 56, 0.0F, -3.0F, 39.5F, 1, 1, 17, -0.001F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 78, 50, 0.0F, -3.0F, 39.0F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 16, 75, 0.0F, -3.0F, 35.5F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 66, 69, 0.0F, -3.0F, 32.0F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 34, 50, 0.0F, -3.0F, 28.5F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 16, 50, 0.0F, -3.0F, 21.5F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 20, 46, 0.0F, -3.0F, 18.0F, 1, 1, 1, -0.002F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 0, 110, 0.0F, -2.5F, 15.5F, 1, 1, 41, 0.0F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 50, 42, 0.0F, -2.0F, 15.5F, 1, 2, 1, 0.001F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 14, 0, 0.0F, -3.0F, 13.5F, 1, 3, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-8.1F, 0.0F, 0.0F);
		carbine_guard.addChild(bone5);
		

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, 0.0F, 35.0F);
		bone5.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.0F, -0.4363F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 62, 0, 0.0F, 0.0F, -3.0F, 1, 2, 11, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 82, 69, 0.0F, 0.0F, -8.5F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 93, 6, 0.0F, 0.0F, -5.0F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 93, 56, 0.0F, 0.0F, -15.5F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 111, 5, 0.0F, 0.0F, -12.0F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 111, 76, 0.0F, 0.0F, -22.5F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 112, 30, 0.0F, 0.0F, -19.0F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 112, 83, 0.0F, 0.0F, -26.0F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 101, 112, 0.0F, 0.0F, -29.5F, 1, 2, 1, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 86, 113, 0.0F, 1.5F, -33.0F, 1, 1, 41, -0.001F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 30, 106, 0.0F, 2.0F, -13.0F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 112, 21, 0.0F, 2.0F, -20.0F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 68, 112, 0.0F, 2.0F, -27.0F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 118, 70, 0.0F, 2.0F, -30.5F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 125, 105, 0.0F, 2.0F, -23.5F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 125, 107, 0.0F, 2.0F, -16.5F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 123, 126, 0.0F, 2.0F, -9.5F, 1, 1, 1, -0.003F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 122, 0, 0.0F, 2.0F, -9.0F, 1, 1, 17, -0.002F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 57, 116, 0.0F, 0.0F, -33.0F, 1, 2, 1, 0.001F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 26, 72, 0.0F, 0.0F, -35.0F, 1, 3, 2, -0.001F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.0F, 0.0F, 35.0F);
		bone5.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.0F, 0.4363F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 62, 25, 0.0F, -2.0F, -3.0F, 1, 2, 11, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 82, 74, 0.0F, -2.0F, -8.5F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 93, 31, 0.0F, -2.0F, -5.0F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 93, 61, 0.0F, -2.0F, -15.5F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 111, 16, 0.0F, -2.0F, -12.0F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 112, 27, 0.0F, -2.0F, -22.5F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 80, 112, 0.0F, -2.0F, -19.0F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 112, 86, 0.0F, -2.0F, -26.0F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 107, 112, 0.0F, -2.0F, -29.5F, 1, 2, 1, -0.003F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-4.0F, 4.0F, 0.0F);
		carbine_guard.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 1.5708F);
		

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 44.0F, 0.0F);
		bone7.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.4363F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 62, -19.5952F, -39.8775F, 25.5F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 62, 56, -19.5952F, -39.8775F, 26.0F, 1, 3, 4, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 56, -19.5952F, -39.8775F, 18.5F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 31, -19.5952F, -39.8775F, 22.0F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 25, -19.5952F, -39.8775F, 11.5F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 19, 81, -19.5952F, -39.8775F, 15.0F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 13, 81, -19.5952F, -39.8775F, 8.0F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 6, 81, -19.5952F, -39.8775F, 4.5F, 1, 3, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 62, 56, -19.5952F, -39.8775F, 2.0F, 1, 1, 24, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 88, 16, -19.5952F, -39.8775F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.4363F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 41, 83, -1.0F, -3.0F, 25.5F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 75, 0, -1.0F, -3.0F, 26.0F, 1, 3, 4, -0.001F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 6, 87, -1.0F, -3.0F, 18.5F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 0, 87, -1.0F, -3.0F, 22.0F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 19, 87, -1.0F, -3.0F, 11.5F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 13, 87, -1.0F, -3.0F, 15.0F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 26, 87, -1.0F, -3.0F, 8.0F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 88, 0, -1.0F, -3.0F, 4.5F, 1, 3, 1, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 0, 81, -1.0F, -1.0F, 2.0F, 1, 1, 24, -0.001F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 0, 94, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.0F, -4.0F, 0.0F);
		carbine_guard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -1.5708F);
		

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.0F, -44.0F, 0.0F);
		bone6.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, -0.4363F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 24, -19.5952F, 36.8775F, 25.5F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 62, 0, -19.5952F, 36.8775F, 26.0F, 1, 3, 4, -0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 62, 0, -19.5952F, 36.8775F, 18.5F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 62, 25, -19.5952F, 36.8775F, 22.0F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 62, 56, -19.5952F, 36.8775F, 11.5F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 68, 0, -19.5952F, 36.8775F, 15.0F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 68, 25, -19.5952F, 36.8775F, 8.0F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 68, 56, -19.5952F, 36.8775F, 4.5F, 1, 3, 1, 0.0F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 62, 0, -19.5952F, 38.8775F, 2.0F, 1, 1, 24, -0.001F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 26, 55, -19.5952F, 36.8775F, 0.0F, 1, 3, 2, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, 0.4363F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 75, 0, -1.0F, 0.0F, 25.5F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 62, 25, -1.0F, 0.0F, 26.0F, 1, 3, 4, -0.001F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 75, 25, -1.0F, 0.0F, 18.5F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 75, 31, -1.0F, 0.0F, 22.0F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 75, 56, -1.0F, 0.0F, 11.5F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 75, 62, -1.0F, 0.0F, 15.0F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 81, -1.0F, 0.0F, 8.0F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 81, 0, -1.0F, 0.0F, 4.5F, 1, 3, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 62, 25, -1.0F, 0.0F, 2.0F, 1, 1, 24, -0.001F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 48, 55, -1.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.75F, -1.0F, 40.0F);
		carbine_guard.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 34, 110, -1.0F, 0.0F, -7.0F, 1, 2, 2, 0.001F, false));
		bone8.cubeList.add(new ModelBox(bone8, 57, 122, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.001F, false));
		bone8.cubeList.add(new ModelBox(bone8, 122, 0, -1.4F, -0.5F, -6.0F, 1, 3, 7, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 57, 119, -1.0F, 0.0F, -2.0F, 1, 2, 1, 0.001F, false));
		bone8.cubeList.add(new ModelBox(bone8, 110, 23, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.001F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, 0.9948F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 110, 80, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 36, 139, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 4, 140, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 122, 4, -1.0F, 0.0F, -7.0F, 1, 1, 2, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, 2.0F, 0.0F);
		bone8.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.9948F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 110, 98, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 90, 139, -1.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 141, 142, -1.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 118, 78, -1.0F, -1.0F, -7.0F, 1, 1, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-8.75F, -1.0F, 40.0F);
		carbine_guard.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 48, 104, 0.0F, 0.0F, -7.0F, 1, 2, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 118, 67, 0.0F, 0.0F, -4.0F, 1, 2, 1, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 118, 74, 0.4F, -0.5F, -6.0F, 1, 3, 7, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 80, 117, 0.0F, 0.0F, -2.0F, 1, 2, 1, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 32, 87, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.001F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -0.9948F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 67, 32, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r93.cubeList.add(new ModelBox(cube_r93, 47, 138, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r93.cubeList.add(new ModelBox(cube_r93, 25, 139, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r93.cubeList.add(new ModelBox(cube_r93, 110, 61, 0.0F, 0.0F, -7.0F, 1, 1, 2, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.0F, 2.0F, 0.0F);
		bone9.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, 0.9948F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 67, 63, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r94.cubeList.add(new ModelBox(cube_r94, 112, 136, 0.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r94.cubeList.add(new ModelBox(cube_r94, 122, 136, 0.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r94.cubeList.add(new ModelBox(cube_r94, 80, 7, 0.0F, -1.0F, -7.0F, 1, 1, 2, 0.0F, false));

		taped_grip = new ModelRenderer(this);
		taped_grip.setRotationPoint(2.0F, 0.0F, 0.0F);
		

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(-6.05F, 7.9F, -2.7F);
		taped_grip.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.6459F, -0.0125F, -0.0152F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 212, 178, 0.0F, -2.0F, 0.0F, 1, 2, 7, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(-6.05F, 4.7F, -3.9F);
		taped_grip.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.227F, 0.0014F, -0.0047F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 226, 162, 0.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(-6.15F, 3.0F, -4.1F);
		taped_grip.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.3667F, -0.0326F, -0.0125F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 150, 226, 0.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(-0.95F, 7.9F, -2.7F);
		taped_grip.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.6459F, 0.0125F, 0.0152F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 101, 225, -1.0F, -2.0F, 0.0F, 1, 2, 7, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(-0.95F, 4.7F, -3.9F);
		taped_grip.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.227F, -0.0014F, 0.0047F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 164, 226, -1.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(-6.15F, 0.7F, -4.5F);
		taped_grip.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.5061F, 0.0132F, 0.0129F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 226, 33, 0.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-0.85F, 0.7F, -4.5F);
		taped_grip.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.2618F, -0.0132F, -0.0129F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 129, 127, -5.15F, 2.1F, -1.1F, 5, 2, 1, -0.1F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 43, 132, -5.15F, -2.0F, -1.0F, 5, 2, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-0.85F, 0.7F, -4.5F);
		taped_grip.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.2967F, -0.0132F, -0.0129F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 134, 92, -5.15F, 5.5F, -1.5F, 5, 2, 2, -0.1F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-0.85F, 0.7F, -4.5F);
		taped_grip.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.2094F, -0.0132F, -0.0129F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 129, 130, -5.15F, 0.3F, -1.0F, 5, 2, 1, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-0.85F, 3.9F, 2.9F);
		taped_grip.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.2443F, 0.0037F, -0.0084F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 103, 73, -5.15F, -2.0F, -1.0F, 5, 2, 1, 0.1F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-0.85F, 3.2F, 2.6F);
		taped_grip.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.2443F, 0.0037F, -0.0084F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 129, 116, -5.15F, -2.0F, -1.0F, 5, 2, 1, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-0.85F, 0.8F, 2.0F);
		taped_grip.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.2617F, 0.0037F, -0.0084F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 129, 119, -5.15F, -2.0F, -1.0F, 5, 2, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-0.85F, -2.3F, 1.2F);
		taped_grip.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.2617F, 0.0037F, -0.0084F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 129, 122, -5.15F, -2.0F, -1.0F, 5, 2, 1, 0.0F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.85F, 0.7F, -4.5F);
		taped_grip.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.5061F, -0.0132F, -0.0129F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 226, 41, -1.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(-0.85F, 3.0F, -4.1F);
		taped_grip.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.3667F, 0.0326F, 0.0125F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 227, 207, -1.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, false));

		magazine_25 = new ModelRenderer(this);
		magazine_25.setRotationPoint(-7.0F, 14.0F, -25.5F);
		magazine_25.cubeList.add(new ModelBox(magazine_25, 217, 25, 3.5F, -1.5F, -2.2F, 4, 3, 5, -0.002F, false));
		magazine_25.cubeList.add(new ModelBox(magazine_25, 0, 46, 3.5F, -1.5F, 2.0F, 4, 1, 1, -0.004F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(6.5F, -1.8F, -2.4F);
		magazine_25.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.1957F, 0.2909F, -0.9661F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 0, 87, 8.7F, -8.65F, 0.5F, 1, 1, 4, -0.001F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(4.5F, -1.8F, -2.4F);
		magazine_25.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.1957F, -0.2909F, 0.9661F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 13, 87, -9.7F, -8.65F, 0.5F, 1, 1, 4, -0.001F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(4.0F, -1.5F, -2.3F);
		magazine_25.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.3491F, 0.0F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 50, 72, 1.0F, -12.0F, 3.7F, 1, 14, 1, -0.001F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(4.5F, -1.5F, -3.3F);
		magazine_25.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.3491F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 62, 81, -0.5F, -12.0F, 0.5F, 3, 14, 5, 0.0F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 62, 7, -1.0F, 0.3F, 0.0F, 4, 3, 1, -0.001F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 10, 46, -1.0F, 2.25F, 5.0F, 4, 1, 1, -0.003F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 118, 67, -1.25F, 16.0F, -0.5F, 3, 1, 5, -0.001F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 122, 10, 1.25F, 16.0F, -0.5F, 2, 1, 6, 0.0F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 75, 56, -1.15F, 13.0F, 1.0F, 1, 2, 4, 0.0F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 81, 2.15F, 13.0F, 1.0F, 1, 2, 4, 0.0F, false));
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 0, -1.0F, 3.0F, 0.0F, 4, 14, 6, 0.0F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(6.1F, 5.8F, -1.2F);
		magazine_25.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.2433F, 0.2528F, -0.7892F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 62, 63, -7.0F, 2.0F, 2.0F, 1, 1, 3, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(4.9F, 5.8F, -1.2F);
		magazine_25.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.2433F, -0.2528F, 0.7892F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 75, 7, 6.0F, 2.0F, 2.0F, 1, 1, 3, 0.0F, false));

		magazine_50 = new ModelRenderer(this);
		magazine_50.setRotationPoint(-7.0F, 14.0F, -25.5F);
		magazine_50.cubeList.add(new ModelBox(magazine_50, 206, 153, 3.5F, -1.5F, -2.2F, 4, 3, 5, -0.002F, false));
		magazine_50.cubeList.add(new ModelBox(magazine_50, 33, 19, 3.5F, -1.5F, 2.0F, 4, 1, 1, -0.004F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(6.5F, -1.8F, -2.4F);
		magazine_50.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.1957F, 0.2909F, -0.9661F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 75, 31, 8.7F, -8.65F, 0.5F, 1, 1, 4, -0.001F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(4.5F, -1.8F, -2.4F);
		magazine_50.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.1957F, -0.2909F, 0.9661F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 75, 62, -9.7F, -8.65F, 0.5F, 1, 1, 4, -0.001F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(4.0F, -1.5F, -2.3F);
		magazine_50.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.3491F, 0.0F, 0.0F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 49, 0, 1.0F, -12.0F, 3.7F, 1, 14, 1, -0.001F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(4.5F, -1.5F, -3.3F);
		magazine_50.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.3491F, 0.0F, 0.0F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 33, 0, -0.5F, -12.0F, 0.5F, 3, 14, 5, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 14, 55, -1.0F, 0.3F, 0.0F, 4, 6, 1, -0.001F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 161, 74, -1.0F, 2.25F, 1.0F, 4, 4, 5, -0.003F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 26, 42, -1.25F, 16.0F, -0.5F, 4, 1, 5, -0.001F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 26, 72, 2.25F, 16.0F, -0.5F, 5, 1, 6, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 75, 25, -1.15F, 13.0F, 1.0F, 1, 2, 4, 0.0F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 92, 155, 3.0F, 3.75F, 0.0F, 1, 3, 6, -0.001F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 26, 55, -1.0F, 6.0F, 0.0F, 8, 11, 6, 0.0F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(6.1F, 5.8F, -1.2F);
		magazine_50.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.2433F, 0.2528F, -0.7892F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 62, 32, -7.0F, 2.0F, 2.0F, 1, 1, 3, 0.0F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(4.5F, -1.5F, -3.3F);
		magazine_50.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.2156F, 0.2767F, -0.8949F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 118, 84, -2.6F, 8.15F, 0.0F, 2, 1, 6, -0.003F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 122, 18, -2.6F, 5.45F, 0.0F, 2, 3, 6, -0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		taped_grip.render(f5);
//		magazine_25.render(f5);
//		magazine_50.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
