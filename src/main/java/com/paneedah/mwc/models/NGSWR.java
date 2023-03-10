package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NGSWR extends ModelWithAttachments {
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
	private final ModelRenderer bone;
	private final ModelRenderer gun143_r1;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun170;
	private final ModelRenderer gun249;
	private final ModelRenderer rails;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final QRenderer handguard;
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
	private final ModelRenderer cube_r118;
	private final ModelRenderer rails_attachment;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r121;
	private final ModelRenderer cube_r122;
	private final ModelRenderer action;
	private final ModelRenderer cube_r123;
	private final ModelRenderer cube_r124;
	private final ModelRenderer cube_r125;
	private final ModelRenderer cube_r126;
	private final QRenderer stock_adapter;
	private final ModelRenderer cube_r127;
	private final ModelRenderer cube_r128;
	private final ModelRenderer cube_r129;
	private final ModelRenderer cube_r130;
	private final ModelRenderer cube_r131;
	private final ModelRenderer cube_r132;
	private final ModelRenderer cube_r133;
	private final ModelRenderer cube_r134;
	private final ModelRenderer cube_r135;
	private final ModelRenderer magazine;
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

	public NGSWR() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 88, 112, -0.65F, -35.7F, -14.0F, 1, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 62, -0.45F, -35.9F, -14.2F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 84, 79, -0.55F, -35.4F, -0.9F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 46, -3.55F, -35.9F, -14.2F, 1, 1, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 177, 38, -0.15F, -37.25F, -27.5F, 1, 1, 28, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 11, -3.5F, -37.55F, -28.5F, 4, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 102, -0.15F, -37.75F, 1.6F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 102, -0.15F, -36.25F, -27.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 35, -3.85F, -36.25F, -27.5F, 4, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 67, -3.85F, -38.75F, 1.6F, 1, 2, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 140, -0.15F, -36.85F, -26.5F, 1, 1, 12, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 173, -3.85F, -37.25F, -27.5F, 4, 1, 28, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 53, -3.85F, -36.85F, -26.5F, 1, 1, 12, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -0.35F, -35.7F, -24.0F, 1, 4, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -2.5F, -43.7F, -45.0F, 2, 1, 47, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 63, -1.75F, -43.7F, 1.55F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 63, -2.25F, -43.7F, 1.55F, 1, 1, 1, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 95, -2.5F, -39.7F, -68.0F, 2, 2, 37, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 39, -2.0F, -39.9F, -68.0F, 1, 1, 37, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 0, -2.0F, -38.5F, -68.0F, 1, 1, 37, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 135, -1.3F, -39.2F, -68.0F, 1, 1, 37, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 84, -1.1F, -38.95F, -70.1F, 1, 1, 2, 0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 22, -2.9F, -38.95F, -70.1F, 1, 1, 2, 0.101F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 29, -1.3F, -39.45F, -70.1F, 1, 2, 2, 0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 59, -2.7F, -39.45F, -70.1F, 1, 2, 2, 0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 128, 124, -2.7F, -39.2F, -68.0F, 1, 1, 37, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 94, -1.3F, -43.2F, -45.0F, 1, 1, 45, -0.003F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 0, -2.7F, -43.2F, -45.0F, 1, 1, 45, -0.003F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 95, -0.55F, -41.55F, -23.5F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 85, -0.45F, -41.4F, -23.5F, 1, 1, 8, -0.05F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 99, -0.3F, -41.4F, -24.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 99, -0.3F, -41.4F, -16.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 100, -0.55F, -40.85F, -24.2F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 99, -0.55F, -40.85F, -15.8F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 167, 124, -0.05F, -39.25F, -28.0F, 1, 1, 31, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 35, 0.1F, -39.25F, -12.3F, 1, 1, 9, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 71, 0.3F, -39.3F, -21.3F, 1, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 112, -0.3F, -39.6F, -25.6F, 2, 2, 2, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 71, 0.3F, -38.8F, -21.3F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 12, 0.1F, -38.85F, -12.3F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 167, 77, -0.05F, -38.85F, -28.0F, 1, 1, 31, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 196, -0.75F, -42.4F, -28.0F, 1, 2, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 85, -0.65F, -41.7F, -1.0F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 87, -0.35F, -42.8F, -1.9F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 59, -2.65F, -42.5F, -1.0F, 3, 1, 4, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 17, -4.15F, -39.2F, -15.0F, 1, 2, 15, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 120, 63, -4.15F, -39.2F, 0.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 59, -4.15F, -39.2F, -28.0F, 1, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 40, -3.35F, -42.501F, -1.0F, 1, 1, 4, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 84, -3.65F, -42.8F, -1.9F, 1, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 104, -3.35F, -41.7F, -1.0F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 140, -3.25F, -42.4F, -28.0F, 1, 2, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 94, -0.35F, -31.7F, -15.0F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 103, -0.35F, -29.7F, -15.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 103, -0.35F, -28.9F, -15.0F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 103, -0.35F, -28.3F, -15.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 19, -0.45F, -32.0F, -23.9F, 1, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 78, -0.45F, -30.0F, -20.9F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 119, -0.45F, -29.0F, -17.9F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 119, -3.55F, -29.0F, -17.9F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 38, -3.55F, -30.0F, -20.9F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 0, -3.55F, -32.0F, -23.9F, 1, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 19, -0.35F, -35.85F, -24.5F, 1, 5, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 77, -0.35F, -36.35F, -26.0F, 1, 2, 2, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 54, -3.65F, -36.35F, -26.0F, 4, 2, 2, -0.003F, false));
		gun.cubeList.add(new ModelBox(gun, 138, 39, -3.65F, -35.7F, -24.0F, 4, 4, 10, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 48, -3.9F, -35.4F, -24.0F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 38, -3.9F, -34.5F, -16.5F, 1, 3, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 97, -0.1F, -34.35F, -17.0F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 3, -0.2F, -32.3F, -15.1F, 1, 1, 2, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 0, 0.0F, -32.1F, -13.3F, 1, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 96, 0.1F, -32.75F, -17.2F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 78, 0.0F, -34.05F, -2.3F, 1, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 37, 0.2F, -34.05F, -1.3F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 92, 32, 0.2F, -34.05F, -1.8F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 89, -4.2F, -34.05F, -1.3F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 90, -4.2F, -34.05F, -1.8F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 77, -4.0F, -34.05F, -2.3F, 1, 1, 2, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 116, 117, -0.1F, -33.45F, -17.5F, 1, 1, 3, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 81, -0.1F, -33.45F, -14.6F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 96, 0.1F, -32.75F, -16.8F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 95, -0.3F, -34.75F, -5.2F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 95, -0.3F, -34.75F, -4.85F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 59, -3.9F, -34.0F, -15.2F, 1, 2, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 38, -3.65F, -35.85F, -24.5F, 4, 5, 1, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 115, 52, -3.65F, -31.7F, -15.0F, 4, 2, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 108, -3.65F, -29.7F, -15.0F, 4, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 109, -3.65F, -28.9F, -15.0F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 88, 109, -3.65F, -28.3F, -15.0F, 4, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 86, -3.0F, -35.95F, 0.0F, 3, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 67, -3.0F, -40.65F, 2.9F, 3, 5, 4, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 38, -2.5F, -41.35F, 2.2F, 3, 1, 5, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 5, -2.5F, -42.75F, 2.7F, 3, 2, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 50, -2.5F, -41.75F, 6.2F, 3, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 94, -2.5F, -42.15F, 6.2F, 3, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 64, -3.5F, -42.15F, 6.2F, 3, 1, 1, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 81, -3.5F, -41.75F, 6.2F, 3, 1, 1, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 108, -2.5F, -42.75F, 3.1F, 3, 1, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 90, -3.5F, -42.75F, 3.1F, 3, 1, 2, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 53, -3.5F, -42.75F, 2.7F, 3, 2, 1, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 39, -3.5F, -41.35F, 2.2F, 3, 1, 5, -0.301F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 48, -0.1F, -39.55F, 2.9F, 1, 2, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 51, 11, -0.55F, -37.85F, 2.4F, 1, 4, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 11, -0.15F, -35.75F, 2.4F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 59, -3.85F, -35.75F, 2.4F, 1, 2, 2, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 48, -3.45F, -37.85F, 2.4F, 1, 4, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 67, -3.9F, -39.55F, 2.9F, 1, 2, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 112, -3.35F, -35.7F, -14.0F, 1, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 106, 95, -0.65F, -32.0F, -14.0F, 1, 1, 8, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 0, -3.0F, -31.0F, -7.0F, 3, 4, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 59, 48, -3.0F, -31.0F, -14.5F, 3, 4, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 66, -3.0F, -26.9F, -10.7F, 3, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 112, -3.35F, -32.0F, -14.0F, 1, 1, 8, -0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -25.9F, -9.7F);
		gun.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3491F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 30, -3.0F, -1.0F, 0.0F, 3, 1, 4, -0.002F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -25.9F, -10.7F);
		gun.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.3491F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 98, 17, -3.0F, -1.0F, -4.0F, 3, 1, 4, -0.002F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -30.0F, -6.8F);
		gun.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7418F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 115, 46, -3.0F, -1.0F, -2.0F, 3, 1, 2, -0.002F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -30.0F, -13.5F);
		gun.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7418F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 115, 49, -3.0F, -1.0F, 0.0F, 3, 1, 2, -0.002F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-1.0F, -29.7F, -8.0F);
		gun.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3316F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 90, 20, -1.0F, -2.0F, -1.0F, 1, 2, 1, -0.002F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-1.0F, -29.7F, -8.0F);
		gun.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3316F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 90, 64, -1.0F, 0.0F, -1.0F, 1, 2, 1, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.35F, -31.7F, -1.0F);
		gun.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.829F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 82, 0, -1.0F, -3.0F, 0.0F, 1, 3, 6, -0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.35F, -31.7F, -1.0F);
		gun.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.829F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 82, 19, -1.0F, -3.0F, 0.0F, 1, 3, 6, -0.001F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.9F, -37.55F, 6.9F);
		gun.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.6981F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 47, 103, 0.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.9F, -39.55F, 6.9F);
		gun.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.6981F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 6, 103, 0.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.5F, -37.15F, 6.9F);
		gun.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.8727F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 102, 0.0F, 0.0F, -4.0F, 1, 1, 4, -0.001F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.5F, -39.95F, 6.9F);
		gun.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.8727F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 100, 69, 0.0F, -1.0F, -4.0F, 1, 1, 4, -0.001F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.9F, -37.55F, 6.9F);
		gun.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.6981F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 71, 106, -1.0F, 0.0F, -4.0F, 1, 1, 4, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.5F, -37.15F, 6.9F);
		gun.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8727F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 94, 104, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.5F, -39.95F, 6.9F);
		gun.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8727F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 65, 105, -1.0F, -1.0F, -4.0F, 1, 1, 4, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.9F, -39.55F, 6.9F);
		gun.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.6981F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 106, 104, -1.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.2F, -42.45F, 4.8F);
		gun.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.2793F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 98, 58, -0.3F, -0.3F, -0.3F, 3, 1, 2, -0.303F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 76, 79, -0.3F, -0.3F, 0.5F, 3, 1, 2, -0.304F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 98, 74, 0.7F, -0.3F, 0.5F, 3, 1, 2, -0.302F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 18, 107, 0.7F, -0.3F, -0.3F, 3, 1, 2, -0.301F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(9.0F, -32.95F, 4.0F);
		gun.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.7418F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 14, 86, -12.0F, -3.0F, 0.0F, 3, 3, 4, -0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-0.65F, -30.3F, -21.2F);
		gun.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.2967F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 20, 67, -3.0F, 0.0F, -3.0F, 1, 1, 10, -0.003F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 48, 0.3F, 0.0F, -3.0F, 1, 1, 10, -0.002F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.9F, -31.5F, -16.5F);
		gun.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.8203F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 57, 59, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.9F, -33.45F, -12.6F);
		gun.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, -0.733F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 3, 96, -1.0F, 0.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.2F, -35.45F, -14.2F);
		gun.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.1047F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 81, -0.8F, 1.2F, -1.5F, 1, 1, 2, -0.35F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 51, 38, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.15F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.2F, -35.45F, -14.2F);
		gun.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.0175F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 48, -1.1F, -1.6F, 0.2F, 1, 2, 1, -0.001F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 32, 48, -1.1F, -1.6F, -0.2F, 1, 2, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-3.6F, -32.55F, -8.7F);
		gun.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.4363F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 80, 95, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 88, 95, 3.2F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-3.3F, -33.55F, -3.2F);
		gun.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.4464F, -0.2053F, -0.0973F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 90, 23, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.2F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.3F, -33.55F, -3.2F);
		gun.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.4464F, 0.2053F, 0.0973F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 92, 43, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.2F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.8F, -35.5F, -15.1F);
		gun.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.0873F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 82, 19, -1.0F, 0.9F, 1.75F, 1, 1, 2, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 12, 96, -1.0F, 0.1F, 1.75F, 1, 1, 1, -0.001F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 40, 96, -1.0F, 0.55F, 0.05F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 50, 96, -1.0F, 0.1F, 0.05F, 1, 1, 1, -0.001F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.65F, -35.7F, -24.0F);
		gun.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.3491F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 9, 97, -0.75F, 0.7F, -1.3F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 97, -4.55F, 0.7F, -1.3F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.65F, -34.35F, -26.0F);
		gun.addChild(cube_r29);
		setRotationAngle(cube_r29, 1.1345F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 115, 34, 0.0F, 0.0F, 0.0F, 4, 2, 1, -0.004F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 89, 90, 3.3F, 0.0F, 0.0F, 1, 2, 1, -0.003F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.9F, -30.2F, -25.1F);
		gun.addChild(cube_r30);
		setRotationAngle(cube_r30, 1.2654F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 35, 41, -4.9F, 10.7F, 0.0F, 5, 1, 1, 0.0F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 18, 94, -4.9F, 0.0F, 0.0F, 5, 11, 1, 0.001F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-0.65F, -31.95F, -16.4F);
		gun.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.8203F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 39, -3.0F, -1.0F, 0.0F, 1, 3, 1, -0.002F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 11, 39, 0.3F, -1.0F, 0.0F, 1, 3, 1, -0.002F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-3.65F, -31.2F, -16.4F);
		gun.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.8203F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 42, 12, 0.0F, -1.0F, 0.0F, 1, 3, 1, -0.001F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 42, 23, 3.3F, -1.0F, 0.0F, 1, 3, 1, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.35F, -40.5F, -27.7F);
		gun.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 86, 0.0F, -2.0F, -1.0F, 1, 1, 2, -0.002F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-3.35F, -39.6F, -27.0F);
		gun.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 120, 67, 0.0F, -2.0F, -2.0F, 1, 1, 3, -0.002F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-3.35F, -40.4F, -26.1F);
		gun.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.7418F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 90, 79, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-3.35F, -40.7F, -1.0F);
		gun.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.5411F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 100, 100, -0.3F, -2.15F, -0.3F, 1, 1, 1, -0.301F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 100, 98, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 100, 96, -0.1F, -1.7F, -0.1F, 1, 1, 1, -0.103F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 12, 102, 3.0F, -2.15F, -0.3F, 1, 1, 1, -0.301F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 102, 46, 2.8F, -1.7F, -0.1F, 1, 1, 1, -0.103F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 102, 62, 2.7F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-3.35F, -40.6F, -25.0F);
		gun.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, 0.7418F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 196, 156, 0.0F, -1.0F, -3.0F, 1, 1, 27, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-3.35F, -40.7F, -1.0F);
		gun.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, 1.2392F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 104, 79, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-3.35F, -42.5F, -45.0F);
		gun.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, -0.4451F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 48, 0.0F, 0.0F, 0.0F, 2, 1, 45, -0.001F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-4.95F, -37.5F, -15.0F);
		gun.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, -0.384F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 47, 120, 0.0F, 0.0F, -3.0F, 1, 1, 3, -0.001F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 111, 0.0F, 0.0F, -13.0F, 1, 1, 14, -0.1F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 69, 38, 0.0F, 0.0F, -11.0F, 1, 1, 5, -0.001F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-4.85F, -37.5F, -26.0F);
		gun.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, 0.1047F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 62, 38, -0.2F, 0.8F, 6.0F, 1, 2, 1, 0.0F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 41, 63, -0.1F, 0.5F, 4.65F, 1, 2, 1, -0.101F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 63, 59, -0.1F, 0.5F, 7.4F, 1, 2, 1, -0.101F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 49, 48, -0.1F, 0.5F, 7.9F, 1, 2, 3, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 51, 0, -0.1F, 0.5F, 2.1F, 1, 2, 3, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 69, 67, 0.0F, 0.0F, 2.0F, 1, 3, 9, -0.1F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-4.15F, -39.2F, -28.0F);
		gun.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, -1.1694F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 100, 53, 0.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 51, 19, 0.0F, 0.0F, 13.0F, 1, 1, 18, -0.001F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-4.15F, -38.2F, 3.0F);
		gun.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.0815F, -0.0312F, -0.3652F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 38, 59, 0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-4.15F, -37.2F, 0.0F);
		gun.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.2967F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 120, 56, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-3.75F, -40.15F, -12.0F);
		gun.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, 0.0F, -0.4887F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 51, 0, 0.0F, 0.0F, -3.0F, 1, 1, 18, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 88, 103, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.35F, -40.6F, -25.0F);
		gun.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, -0.7418F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 163, 197, -1.0F, -1.0F, -3.0F, 1, 1, 27, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(0.35F, -42.5F, -45.0F);
		gun.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 0.4451F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 49, 49, -2.0F, 0.0F, 0.0F, 2, 1, 45, -0.002F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.35F, -40.7F, -1.0F);
		gun.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -1.2392F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 31, 107, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(0.35F, -39.6F, -27.0F);
		gun.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 120, 71, -1.0F, -2.0F, -2.0F, 1, 1, 3, -0.002F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(0.35F, -40.5F, -27.7F);
		gun.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 67, -1.0F, -2.0F, -17.0F, 1, 1, 18, -0.002F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.35F, -40.4F, -26.1F);
		gun.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.7418F, 0.0F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 92, 28, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(0.85F, -36.85F, -25.0F);
		gun.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, 0.3229F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 0, 175, -1.0F, -1.0F, -3.0F, 1, 1, 30, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.75F, -40.15F, -25.0F);
		gun.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, 0.4887F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 37, 173, -1.0F, 0.0F, -3.0F, 1, 1, 31, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.85F, -36.85F, 2.0F);
		gun.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, -0.1396F, 0.3229F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 47, 103, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.85F, -40.25F, 2.0F);
		gun.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, -0.1396F, -0.3229F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 53, 103, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(1.3F, -38.55F, -19.3F);
		gun.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, -0.2094F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 0, 77, -1.0F, -1.0F, 0.0F, 1, 1, 7, -0.001F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(1.3F, -38.55F, -19.3F);
		gun.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 0.2094F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 94, -1.0F, 0.0F, 0.0F, 1, 1, 7, -0.001F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(1.55F, -38.8F, -20.9F);
		gun.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.4189F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 77, 62, -1.05F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(1.7F, -38.6F, -21.3F);
		gun.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0698F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 20, 48, -1.0F, -1.0F, -3.0F, 1, 2, 1, -0.002F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 32, 75, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.001F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 77, 59, -1.7F, 0.5F, -4.7F, 2, 1, 5, -0.3F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 51, 33, -1.7F, -0.6F, -4.7F, 2, 2, 1, -0.302F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 62, 33, -1.7F, -1.0F, -4.7F, 2, 2, 1, -0.301F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 51, 5, -1.7F, 0.1F, -2.7F, 2, 1, 2, -0.303F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 51, 24, -1.7F, -1.0F, -2.7F, 2, 1, 2, -0.303F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 28, 78, -1.7F, -1.4F, -4.7F, 2, 1, 5, -0.3F, false));
		cube_r59.cubeList.add(new ModelBox(cube_r59, 76, 41, -1.0F, -0.9F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(1.47F, 38.4F, -24.6F);
		gun.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.4014F, 0.0698F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 69, 41, -1.0F, -71.95F, 31.18F, 1, 1, 1, -0.002F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(1.47F, -40.4F, -24.6F);
		gun.addChild(cube_r61);
		setRotationAngle(cube_r61, -0.4014F, 0.0698F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 71, 15, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(1.47F, -40.4F, -24.6F);
		gun.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0698F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 69, 63, -1.0F, 0.0F, 0.5F, 1, 1, 1, 0.001F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 71, 34, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.45F, -41.55F, -15.5F);
		gun.addChild(cube_r63);
		setRotationAngle(cube_r63, -0.7854F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 50, 100, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(0.45F, -41.55F, -23.5F);
		gun.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.7854F, 0.0F, 0.0F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 59, 100, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.85F, -40.25F, -25.0F);
		gun.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, -0.3229F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 177, 0, -1.0F, 0.0F, -3.0F, 1, 1, 30, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-1.5F, -40.15F, -73.0F);
		gun.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.0F, -0.4363F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 69, 59, -1.0F, 0.0F, -1.0F, 1, 1, 6, -0.001F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-1.5F, -40.15F, -73.0F);
		gun.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.0F, 0.0F, 0.4363F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 61, 38, 0.0F, 0.0F, -1.0F, 1, 1, 6, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-1.5F, -36.85F, -73.0F);
		gun.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, -0.4363F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 71, 11, 0.0F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-1.5F, -36.85F, -73.0F);
		gun.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, 0.0F, 0.4363F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 71, 30, -1.0F, -1.0F, -1.0F, 1, 1, 6, -0.001F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-3.85F, -36.25F, 0.5F);
		gun.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.2967F, 0.0F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 71, 30, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.001F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 62, 87, 3.7F, -1.0F, 0.0F, 1, 1, 2, 0.001F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-3.85F, -36.25F, 0.5F);
		gun.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.2095F, 0.2094F, -0.7502F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 62, 84, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-3.85F, -36.25F, -14.3F);
		gun.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, -0.7505F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 88, 95, 0.0F, 0.0F, -1.0F, 1, 1, 16, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-3.85F, -35.85F, -26.5F);
		gun.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, -0.9774F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 18, 94, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.85F, -36.25F, 0.5F);
		gun.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.2095F, -0.2094F, 0.7502F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 87, 53, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(0.85F, -35.85F, -26.5F);
		gun.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, 0.0F, 0.9774F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 0, 140, -1.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(0.85F, -36.25F, -14.3F);
		gun.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 0.7505F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 98, 0, -1.0F, 0.0F, -1.0F, 1, 1, 16, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-3.85F, -35.25F, -26.5F);
		gun.addChild(cube_r77);
		setRotationAngle(cube_r77, 2.3387F, 0.0F, 0.0F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 115, 29, 0.0F, 0.0F, 0.0F, 4, 2, 1, -0.003F, false));
		cube_r77.cubeList.add(new ModelBox(cube_r77, 0, 94, 3.7F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(0.55F, -35.6F, 2.5F);
		gun.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.7928F, 0.0121F, 0.1109F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 31, 120, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(-3.55F, -35.6F, 2.5F);
		gun.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.7928F, -0.0121F, -0.1109F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 88, 120, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-3.55F, -34.9F, 0.8F);
		gun.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.4014F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 38, 87, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));
		cube_r80.cubeList.add(new ModelBox(cube_r80, 49, 87, 3.1F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.45F, -34.4F, 0.1F);
		gun.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.4363F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 58, 80, -0.8F, -0.8F, -1.4F, 1, 1, 1, -0.2F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 49, 80, -0.73F, -0.9F, -0.9F, 1, 1, 1, -0.2F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 28, 81, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-5.4F, -38.0F, -6.2F);
		gun.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0175F, 0.0F);
		

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, -0.2603F, 0.0F);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 49, 84, -0.5F, -1.5F, 0.7F, 2, 2, 1, -0.3F, false));
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 91, 100, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(1.6F, 1.2F, -6.5F);
		bone.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 0.2539F, -0.0579F, -1.3513F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 49, 67, 0.9644F, -0.225F, 0.0F, 1, 3, 7, -0.001F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(1.6F, 0.2F, -6.5F);
		bone.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 69, 84, -0.01F, -1.0F, 0.0F, 3, 1, 7, 0.0F, false));
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 51, 29, -0.01F, -1.4F, 0.0F, 2, 1, 7, -0.001F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(1.6F, -0.2F, -6.5F);
		bone.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0688F, -0.2512F, -0.2705F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 49, 84, 0.2488F, -0.9659F, 0.0F, 3, 1, 7, 0.001F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(-3.5F, -39.0F, -13.0F);
		gun.addChild(gun170);
		setRotationAngle(gun170, 0.0F, 0.0F, 0.2443F);
		gun170.cubeList.add(new ModelBox(gun170, 49, 53, -2.5381F, -1.0575F, -1.0F, 3, 2, 1, 0.0F, false));

		gun249 = new ModelRenderer(this);
		gun249.setRotationPoint(-1.3F, 2.0F, 0.0F);
		gun170.addChild(gun249);
		setRotationAngle(gun249, 0.0F, 1.1154F, 0.0F);
		gun249.cubeList.add(new ModelBox(gun249, 51, 19, -0.5445F, -3.0575F, -1.1119F, 1, 2, 3, -0.001F, false));

		rails = new ModelRenderer(this);
		rails.setRotationPoint(-2.3F, -43.1F, -39.75F);
		gun.addChild(rails);
		rails.cubeList.add(new ModelBox(rails, 115, 21, -0.2F, -1.2F, 35.55F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 115, 17, -0.2F, -1.2F, 32.3F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 16, 115, -0.2F, -1.2F, 29.05F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 0, 115, -0.2F, -1.2F, 25.8F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 112, 104, -0.2F, -1.2F, 16.05F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 110, 113, -0.2F, -1.2F, 19.3F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 114, 85, -0.2F, -1.2F, 22.55F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 72, 112, -0.2F, -1.2F, 6.3F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 88, 112, -0.2F, -1.2F, 9.55F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 103, 112, -0.2F, -1.2F, 12.8F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 49, 77, -0.2F, -1.2F, -5.45F, 2, 1, 5, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 16, 111, -0.2F, -1.2F, -8.2F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 0, 111, -0.2F, -1.2F, -11.45F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 110, 78, -0.2F, -1.2F, -14.7F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 110, 39, -0.2F, -1.2F, -17.95F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 108, 34, -0.2F, -1.2F, -21.2F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 51, 11, -0.2F, -1.2F, -27.45F, 2, 1, 6, -0.199F, false));
		rails.cubeList.add(new ModelBox(rails, 31, 112, -0.2F, -1.2F, -0.2F, 2, 1, 3, -0.2F, false));
		rails.cubeList.add(new ModelBox(rails, 47, 112, -0.2F, -1.2F, 3.05F, 2, 1, 3, -0.2F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, -1.0F, 0.0F);
		rails.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.0F, -0.7854F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 115, 62, -0.8F, -0.2F, -0.2F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 49, 59, -0.8F, -0.2F, -27.45F, 1, 1, 6, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 104, 22, -0.8F, -0.2F, -21.2F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 104, 46, -0.8F, -0.2F, -17.95F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 106, 0, -0.8F, -0.2F, -14.7F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 106, 95, -0.8F, -0.2F, -11.45F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 37, 107, -0.8F, -0.2F, -8.2F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 32, 48, -0.8F, -0.2F, -5.45F, 1, 1, 5, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 31, 116, -0.8F, -0.2F, 12.8F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 116, 12, -0.8F, -0.2F, 9.55F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 116, 0, -0.8F, -0.2F, 6.3F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 116, 95, -0.8F, -0.2F, 22.55F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 116, 90, -0.8F, -0.2F, 19.3F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 62, 116, -0.8F, -0.2F, 16.05F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 103, 116, -0.8F, -0.2F, 25.8F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 117, 40, -0.8F, -0.2F, 29.05F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 117, 79, -0.8F, -0.2F, 32.3F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 93, 117, -0.8F, -0.2F, 35.55F, 1, 1, 3, -0.201F, false));
		cube_r82.cubeList.add(new ModelBox(cube_r82, 115, 66, -0.8F, -0.2F, 3.05F, 1, 1, 3, -0.201F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(1.6F, -1.0F, 3.25F);
		rails.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, -0.7854F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 115, 55, -0.8F, -0.2F, -0.2F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 62, 112, -0.8F, -0.2F, -3.45F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 20, 59, -0.8F, -0.2F, -30.7F, 1, 1, 6, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 37, 102, -0.8F, -0.2F, -24.45F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 104, 27, -0.8F, -0.2F, -21.2F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 104, 62, -0.8F, -0.2F, -17.95F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 106, 8, -0.8F, -0.2F, -14.7F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 106, 99, -0.8F, -0.2F, -11.45F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 35, 35, -0.8F, -0.2F, -8.7F, 1, 1, 5, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 116, 8, -0.8F, -0.2F, 9.55F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 116, 4, -0.8F, -0.2F, 6.3F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 115, 70, -0.8F, -0.2F, 3.05F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 88, 116, -0.8F, -0.2F, 19.3F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 72, 116, -0.8F, -0.2F, 16.05F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 47, 116, -0.8F, -0.2F, 12.8F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 116, 99, -0.8F, -0.2F, 22.55F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 36, 117, -0.8F, -0.2F, 25.8F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 52, 117, -0.8F, -0.2F, 29.05F, 1, 1, 3, -0.201F, false));
		cube_r83.cubeList.add(new ModelBox(cube_r83, 108, 117, -0.8F, -0.2F, 32.3F, 1, 1, 3, -0.201F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0F, -1.0F, 38.35F);
		rails.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.1745F, -0.1719F, -0.7703F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 34, 64, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(1.6F, -1.0F, 38.35F);
		rails.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.1745F, 0.1719F, 0.7703F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 65, 25, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(1.6F, -1.0F, 38.35F);
		rails.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.2443F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 24, 41, -1.8F, -0.2F, -0.2F, 2, 1, 2, -0.2F, false));

		handguard = new QRenderer(this);
		handguard.setRotationPoint(0.35F, -14.0F, -66.0F);
		handguard.cubeList.add(new ModelBox(handguard, 127, 85, -0.1F, -2.0F, 0.0F, 1, 1, 38, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 192, 197, -2.85F, -5.7F, -1.0F, 2, 1, 22, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 23, -1.65F, -5.2F, -1.0F, 1, 1, 22, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -3.05F, -5.2F, -1.0F, 1, 1, 22, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 46, -0.1F, 0.0F, 0.0F, 1, 1, 38, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 8, -0.1F, 1.0F, 32.0F, 1, 2, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 14, -3.85F, 1.7F, 32.0F, 4, 2, 6, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 141, -2.5F, 1.45F, 0.0F, 2, 1, 32, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 162, 164, -3.2F, 1.45F, 0.0F, 1, 1, 32, 0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 0, -4.6F, 1.0F, 32.0F, 1, 2, 6, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 56, 99, -0.1F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 47, 99, -0.1F, -1.0F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 9, 99, -0.1F, -1.0F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 99, -0.1F, -1.0F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 91, 98, -0.1F, -1.0F, 21.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 80, -0.1F, -1.0F, 26.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 88, 95, -0.1F, -1.0F, 31.0F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 67, 0.15F, -1.5F, 33.0F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 49, 67, -4.85F, -1.5F, 33.0F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 87, 96, -4.6F, -2.0F, 0.0F, 1, 1, 38, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 39, -4.6F, -1.0F, 6.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 0, -4.6F, 0.0F, 0.0F, 1, 1, 38, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 40, 98, -4.6F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 41, -4.6F, -1.0F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 98, -4.6F, -1.0F, 16.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 59, 98, -4.6F, -1.0F, 21.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 98, 78, -4.6F, -1.0F, 26.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 47, 95, -4.6F, -1.0F, 31.0F, 1, 1, 7, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-4.6F, -2.0F, 0.0F);
		handguard.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.3491F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 98, 17, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 0, 89, 0.0F, -2.65F, -1.0F, 1, 2, 1, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 53, 0.0F, -2.0F, 15.0F, 1, 2, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 128, 135, -0.3F, -0.7F, 5.6F, 1, 1, 13, -0.301F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 81, 48, 0.0F, -2.0F, 10.0F, 1, 2, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 80, 67, 0.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 12, 98, 0.0F, -2.65F, 5.0F, 1, 1, 1, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 98, 10, 0.0F, -2.65F, 10.0F, 1, 1, 1, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 98, 8, 0.0F, -2.65F, 15.0F, 1, 1, 1, -0.001F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 94, 135, -0.3F, -2.95F, 5.6F, 1, 1, 13, -0.302F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 79, 30, 0.0F, -2.65F, 18.0F, 1, 2, 1, -0.003F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 0, 94, -0.2F, -1.8F, 5.6F, 1, 1, 16, -0.201F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 5, 120, 0.0F, -1.0F, 18.0F, 1, 1, 3, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 98, 2, 0.1F, -1.3F, 18.7F, 1, 1, 1, 0.2F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-4.6F, -2.0F, 0.0F);
		handguard.addChild(cube_r88);
		setRotationAngle(cube_r88, 1.1345F, 0.0F, 0.3491F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 98, 12, 0.0F, -1.1F, 0.2F, 1, 1, 1, -0.002F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-3.7F, -4.5F, -1.0F);
		handguard.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, -0.4451F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 109, 169, 0.0F, 0.0F, 0.0F, 2, 1, 22, -0.002F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-4.3F, -4.0F, 21.0F);
		handguard.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, 1.0297F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 48, 0.0F, -1.0F, 0.0F, 1, 1, 18, -0.001F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.0F, -4.5F, -1.0F);
		handguard.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, 0.4451F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 136, 196, -2.0F, 0.0F, 0.0F, 2, 1, 22, -0.002F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(-4.6F, 3.0F, 32.0F);
		handguard.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, -0.7854F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 62, 84, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-4.6F, 1.0F, 31.0F);
		handguard.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.4712F, 0.0F, 0.0F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 75, 22, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		cube_r93.cubeList.add(new ModelBox(cube_r93, 90, 17, 4.5F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.9F, 3.0F, 32.0F);
		handguard.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, 0.7854F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 86, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.15F, 3.7F, 32.0F);
		handguard.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.7505F, 0.0F, 0.0F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 115, 25, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.001F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(-4.6F, 1.0F, 0.0F);
		handguard.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.7854F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 94, 135, 0.0F, 0.0F, 0.0F, 1, 2, 32, -0.001F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.9F, 1.0F, 0.0F);
		handguard.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.7854F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 128, 162, -1.0F, 0.0F, 0.0F, 1, 2, 32, -0.001F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.9F, -2.0F, 18.0F);
		handguard.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, -0.3491F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 47, 95, -0.8F, -1.8F, -12.4F, 1, 1, 16, -0.201F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 138, 0, -0.7F, -2.95F, -12.4F, 1, 1, 13, -0.302F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 138, 14, -0.7F, -0.7F, -12.4F, 1, 1, 13, -0.301F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 3, 0, -1.0F, -1.65F, 0.0F, 1, 0, 1, -0.001F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 98, 29, -1.0F, -2.65F, -3.0F, 1, 1, 1, -0.001F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 98, 27, -1.0F, -2.65F, -8.0F, 1, 1, 1, -0.001F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 89, 76, -1.0F, -2.65F, -19.0F, 1, 2, 1, -0.001F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 98, 22, -1.0F, -2.65F, -13.0F, 1, 1, 1, -0.001F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 3, 1, -1.0F, -2.0F, 0.0F, 1, 0, 1, 0.0F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 89, 30, -1.0F, -2.65F, 0.0F, 1, 2, 1, -0.003F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 3, 98, -1.1F, -1.3F, 0.7F, 1, 1, 1, 0.2F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 21, 120, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 90, 0, -1.0F, -2.0F, -3.0F, 1, 2, 1, 0.0F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 90, 3, -1.0F, -2.0F, -8.0F, 1, 2, 1, 0.0F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 98, 24, -1.0F, -1.0F, -18.0F, 1, 1, 1, 0.0F, false));
		cube_r98.cubeList.add(new ModelBox(cube_r98, 90, 10, -1.0F, -2.0F, -13.0F, 1, 2, 1, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.6F, -4.0F, 21.0F);
		handguard.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, -1.0297F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 49, 48, -1.0F, -1.0F, 0.0F, 1, 1, 18, -0.001F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(-4.6F, -2.0F, 35.0F);
		handguard.addChild(cube_r100);
		setRotationAngle(cube_r100, -0.9774F, 0.0F, 0.1571F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 75, 19, 0.0F, -3.9F, 0.4F, 1, 2, 1, -0.001F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-4.6F, -2.0F, 35.0F);
		handguard.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.0F, 0.1571F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 56, 97, 0.0F, -2.0F, 3.0F, 1, 1, 1, 0.0F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 17, 125, -0.2F, -2.2F, -13.5F, 1, 1, 13, -0.201F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 36, 23, 0.0F, -2.0F, -1.0F, 1, 2, 4, 0.0F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 16, 111, -0.2F, -0.8F, -13.5F, 1, 1, 13, -0.201F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 26, 67, 0.0F, -2.0F, -14.0F, 1, 2, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-4.6F, -2.0F, 31.6F);
		handguard.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.3665F, 0.0F, 0.1571F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 75, 6, -0.2F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-4.6F, -2.0F, 29.6F);
		handguard.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.3665F, 0.0F, 0.1571F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 75, 3, -0.2F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-4.6F, -2.0F, 27.6F);
		handguard.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.3665F, 0.0F, 0.1571F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 75, 0, -0.2F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-4.6F, -2.0F, 25.6F);
		handguard.addChild(cube_r105);
		setRotationAngle(cube_r105, 0.3665F, 0.0F, 0.1571F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 69, 48, -0.2F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-4.6F, -2.0F, 23.6F);
		handguard.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.3665F, 0.0F, 0.1571F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 69, 38, -0.2F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-4.6F, -2.0F, 21.6F);
		handguard.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.3665F, 0.0F, 0.1571F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 20, 67, -0.2F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.9F, -2.0F, 31.6F);
		handguard.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.3665F, 0.0F, -0.1571F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 75, 48, -0.8F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.9F, -2.0F, 29.6F);
		handguard.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.3665F, 0.0F, -0.1571F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 76, 38, -0.8F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.9F, -2.0F, 27.6F);
		handguard.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.3665F, 0.0F, -0.1571F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 14, 77, -0.8F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.9F, -2.0F, 25.6F);
		handguard.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.3665F, 0.0F, -0.1571F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 49, 77, -0.8F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(0.9F, -2.0F, 23.6F);
		handguard.addChild(cube_r112);
		setRotationAngle(cube_r112, 0.3665F, 0.0F, -0.1571F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 77, 59, -0.8F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(0.9F, -2.0F, 21.6F);
		handguard.addChild(cube_r113);
		setRotationAngle(cube_r113, 0.3665F, 0.0F, -0.1571F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 28, 78, -0.8F, -1.1F, 2.0F, 1, 2, 1, -0.202F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(0.9F, -2.0F, 21.5F);
		handguard.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.0F, 0.0F, -0.1571F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 127, 95, -0.8F, -2.2F, 0.0F, 1, 1, 13, -0.201F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 127, 109, -0.8F, -0.8F, 0.0F, 1, 1, 13, -0.201F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 98, 4, -1.0F, -2.0F, 16.5F, 1, 1, 1, 0.0F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 20, 48, -1.0F, -2.0F, 12.5F, 1, 2, 4, 0.0F, false));
		cube_r114.cubeList.add(new ModelBox(cube_r114, 89, 48, -1.0F, -2.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(0.9F, -2.0F, 35.0F);
		handguard.addChild(cube_r115);
		setRotationAngle(cube_r115, -0.9774F, 0.0F, -0.1571F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 75, 25, -1.0F, -3.9F, 0.4F, 1, 2, 1, -0.001F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(-4.6F, -2.0F, 18.0F);
		handguard.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.6109F, 0.0F, 0.3491F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 97, 95, 0.0F, -1.3F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 88, 97, 0.0F, -2.2F, 0.7F, 1, 1, 1, -0.004F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(0.9F, -2.0F, 18.0F);
		handguard.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.6109F, 0.0F, -0.3491F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 97, 97, -1.0F, -2.2F, 0.7F, 1, 1, 1, -0.004F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 98, 0, -1.0F, -1.3F, 0.0F, 1, 1, 1, -0.002F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(0.9F, -2.0F, 0.0F);
		handguard.addChild(cube_r118);
		setRotationAngle(cube_r118, 1.1345F, 0.0F, -0.3491F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 98, 19, -1.0F, -1.1F, 0.2F, 1, 1, 1, -0.002F, false));

		rails_attachment = new ModelRenderer(this);
		rails_attachment.setRotationPoint(0.0F, 24.0F, 0.0F);
		rails_attachment.cubeList.add(new ModelBox(rails_attachment, 24, 23, 0.85F, -39.5F, -39.0F, 1, 2, 10, 0.1F, false));
		rails_attachment.cubeList.add(new ModelBox(rails_attachment, 49, 67, -2.5F, -35.9F, -51.7F, 2, 1, 16, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -33.5F, -51.75F);
		rails_attachment.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -3.1416F);
		bone2.cubeList.add(new ModelBox(bone2, 36, 29, -0.2F, 0.8F, 12.8F, 2, 1, 3, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 20, 54, -0.2F, 0.8F, 9.55F, 2, 1, 3, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 69, 54, -0.2F, 0.8F, 6.3F, 2, 1, 3, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 20, 73, -0.2F, 0.8F, 3.05F, 2, 1, 3, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 69, 79, -0.2F, 0.8F, -0.2F, 2, 1, 3, -0.2F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.0F, 0.0F, -0.7854F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 75, 95, -1.5071F, 0.5071F, -0.2F, 1, 1, 3, -0.201F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 24, 86, -1.5071F, 0.5071F, 3.05F, 1, 1, 3, -0.201F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 37, 78, -1.5071F, 0.5071F, 6.3F, 1, 1, 3, -0.201F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 0, 71, -1.5071F, 0.5071F, 9.55F, 1, 1, 3, -0.201F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 10, 67, -1.5071F, 0.5071F, 12.8F, 1, 1, 3, -0.201F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(1.6F, 0.0F, 0.0F);
		bone2.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, -0.7854F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 65, 95, -1.5071F, 0.5071F, -0.2F, 1, 1, 3, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 86, 59, -1.5071F, 0.5071F, 3.05F, 1, 1, 3, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 9, 77, -1.5071F, 0.5071F, 6.3F, 1, 1, 3, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 10, 71, -1.5071F, 0.5071F, 9.55F, 1, 1, 3, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 0, 67, -1.5071F, 0.5071F, 12.8F, 1, 1, 3, -0.201F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.5F, -38.4F, -31.5F);
		rails_attachment.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 1.5708F);
		bone3.cubeList.add(new ModelBox(bone3, 98, 34, -1.2F, -0.1F, -0.2F, 2, 1, 3, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 8, 86, -1.2F, -0.1F, -3.45F, 2, 1, 3, -0.2F, false));
		bone3.cubeList.add(new ModelBox(bone3, 81, 48, -1.2F, -0.1F, -7.7F, 2, 1, 4, -0.2F, false));

		cube_r121 = new ModelRenderer(this);
		cube_r121.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r121);
		setRotationAngle(cube_r121, 0.0F, 0.0F, -0.7854F);
		cube_r121.cubeList.add(new ModelBox(cube_r121, 98, 78, -1.5778F, -0.8364F, -7.7F, 1, 1, 4, -0.201F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 98, 89, -1.5778F, -0.8364F, -3.45F, 1, 1, 3, -0.201F, false));
		cube_r121.cubeList.add(new ModelBox(cube_r121, 75, 99, -1.5778F, -0.8364F, -0.2F, 1, 1, 3, -0.201F, false));

		cube_r122 = new ModelRenderer(this);
		cube_r122.setRotationPoint(1.6F, 0.0F, 0.0F);
		bone3.addChild(cube_r122);
		setRotationAngle(cube_r122, 0.0F, 0.0F, -0.7854F);
		cube_r122.cubeList.add(new ModelBox(cube_r122, 98, 39, -1.5778F, -0.8364F, -7.7F, 1, 1, 4, -0.201F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 98, 85, -1.5778F, -0.8364F, -3.45F, 1, 1, 3, -0.201F, false));
		cube_r122.cubeList.add(new ModelBox(cube_r122, 65, 99, -1.5778F, -0.8364F, -0.2F, 1, 1, 3, -0.201F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.8F, -12.8F, -16.0F);
		setRotationAngle(action, 0.0F, 0.0F, -0.0349F);
		

		cube_r123 = new ModelRenderer(this);
		cube_r123.setRotationPoint(0.1F, 0.4F, -0.6F);
		action.addChild(cube_r123);
		setRotationAngle(cube_r123, 0.0F, 0.0F, 0.4014F);
		cube_r123.cubeList.add(new ModelBox(cube_r123, 35, 12, -0.3584F, -3.9336F, -5.0F, 1, 3, 5, 0.0F, false));

		cube_r124 = new ModelRenderer(this);
		cube_r124.setRotationPoint(-0.2F, 0.4F, -5.1F);
		action.addChild(cube_r124);
		setRotationAngle(cube_r124, 0.0F, -0.3316F, 0.4014F);
		cube_r124.cubeList.add(new ModelBox(cube_r124, 35, 35, -0.3388F, -3.9336F, -0.8833F, 1, 3, 1, 0.0F, false));

		cube_r125 = new ModelRenderer(this);
		cube_r125.setRotationPoint(-0.2F, 0.4F, -5.1F);
		action.addChild(cube_r125);
		setRotationAngle(cube_r125, 0.0F, 0.0F, 0.4014F);
		cube_r125.cubeList.add(new ModelBox(cube_r125, 24, 35, -0.3584F, -3.9336F, -3.0F, 1, 3, 3, 0.0F, false));
		cube_r125.cubeList.add(new ModelBox(cube_r125, 39, 48, -0.3584F, -3.9336F, 4.1F, 1, 3, 2, 0.0F, false));

		cube_r126 = new ModelRenderer(this);
		cube_r126.setRotationPoint(-0.2F, 0.4F, -1.0F);
		action.addChild(cube_r126);
		setRotationAngle(cube_r126, 0.0F, -0.3491F, 0.4014F);
		cube_r126.cubeList.add(new ModelBox(cube_r126, 36, 23, -0.3368F, -3.9336F, -0.8774F, 1, 3, 1, 0.0F, false));

		stock_adapter = new QRenderer(this);
		stock_adapter.setRotationPoint(0.0F, -11.3F, 6.9F);
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 11, 23, -3.0F, -5.2F, 0.0F, 3, 4, 2, 0.0F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 14, 14, -2.5F, -5.2F, 2.0F, 2, 4, 2, 0.0F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 14, 48, -0.2F, -4.25F, 0.0F, 1, 2, 1, 0.0F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 29, 35, -3.8F, -4.25F, 0.0F, 1, 2, 1, 0.0F, false));
		stock_adapter.cubeList.add(new ModelBox(stock_adapter, 61, 15, -3.0F, -5.8F, 0.0F, 3, 1, 1, -0.001F, false));

		cube_r127 = new ModelRenderer(this);
		cube_r127.setRotationPoint(0.0F, -5.8F, 1.0F);
		stock_adapter.addChild(cube_r127);
		setRotationAngle(cube_r127, -0.7505F, 0.0F, 0.0F);
		cube_r127.cubeList.add(new ModelBox(cube_r127, 9, 53, -3.0F, 0.0F, 0.0F, 3, 1, 1, -0.002F, false));

		cube_r128 = new ModelRenderer(this);
		cube_r128.setRotationPoint(-3.8F, -2.25F, 0.0F);
		stock_adapter.addChild(cube_r128);
		setRotationAngle(cube_r128, 0.0F, 0.0F, -0.925F);
		cube_r128.cubeList.add(new ModelBox(cube_r128, 51, 41, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r129 = new ModelRenderer(this);
		cube_r129.setRotationPoint(-3.8F, -4.25F, 0.0F);
		stock_adapter.addChild(cube_r129);
		setRotationAngle(cube_r129, 0.0F, 0.0F, 0.8029F);
		cube_r129.cubeList.add(new ModelBox(cube_r129, 42, 35, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r130 = new ModelRenderer(this);
		cube_r130.setRotationPoint(0.8F, -2.25F, 0.0F);
		stock_adapter.addChild(cube_r130);
		setRotationAngle(cube_r130, 0.0F, 0.0F, 0.925F);
		cube_r130.cubeList.add(new ModelBox(cube_r130, 62, 41, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r131 = new ModelRenderer(this);
		cube_r131.setRotationPoint(0.8F, -4.25F, 0.0F);
		stock_adapter.addChild(cube_r131);
		setRotationAngle(cube_r131, 0.0F, 0.0F, -0.8029F);
		cube_r131.cubeList.add(new ModelBox(cube_r131, 43, 29, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.001F, false));

		cube_r132 = new ModelRenderer(this);
		cube_r132.setRotationPoint(-3.8F, -2.25F, 1.0F);
		stock_adapter.addChild(cube_r132);
		setRotationAngle(cube_r132, 0.0F, 0.4887F, 0.0F);
		cube_r132.cubeList.add(new ModelBox(cube_r132, 51, 29, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		cube_r133 = new ModelRenderer(this);
		cube_r133.setRotationPoint(0.8F, -2.25F, 1.0F);
		stock_adapter.addChild(cube_r133);
		setRotationAngle(cube_r133, 0.0F, -0.4887F, 0.0F);
		cube_r133.cubeList.add(new ModelBox(cube_r133, 20, 59, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		cube_r134 = new ModelRenderer(this);
		cube_r134.setRotationPoint(-3.0F, -1.2F, 2.0F);
		stock_adapter.addChild(cube_r134);
		setRotationAngle(cube_r134, 0.0F, 0.1571F, 0.0F);
		cube_r134.cubeList.add(new ModelBox(cube_r134, 0, 14, 0.0F, -4.0F, 0.0F, 1, 4, 2, -0.001F, false));

		cube_r135 = new ModelRenderer(this);
		cube_r135.setRotationPoint(0.0F, -1.2F, 2.0F);
		stock_adapter.addChild(cube_r135);
		setRotationAngle(cube_r135, 0.0F, -0.1571F, 0.0F);
		cube_r135.cubeList.add(new ModelBox(cube_r135, 0, 23, -1.0F, -4.0F, 0.0F, 1, 4, 2, -0.001F, false));

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.25F, -3.0F, -24.0F);
		magazine.cubeList.add(new ModelBox(magazine, 73, 67, -1.0F, 1.0F, 8.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 12, -2.75F, 1.0F, 0.0F, 2, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 23, -1.25F, 1.0F, 2.75F, 1, 8, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 0, -3.25F, 1.0F, 2.75F, 1, 8, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 24, 0, -0.9F, 9.0F, 0.0F, 1, 2, 10, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 65, 140, -3.75F, 9.25F, 1.2F, 4, 2, 9, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 64, -3.75F, 10.25F, 0.2F, 4, 1, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 126, -3.6F, 9.0F, 0.0F, 3, 2, 10, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 36, 0, -2.75F, 0.0F, 9.0F, 2, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 32, 51, -1.0F, 0.2F, 8.0F, 1, 1, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 35, 12, -1.0F, -2.0F, 0.0F, 1, 3, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 71, 19, -3.5F, 1.0F, 8.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 23, -1.0F, 1.0F, 4.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 0, -3.5F, 1.0F, 4.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 85, 79, -1.1F, 1.0F, 5.0F, 1, 8, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 32, 94, -3.4F, 1.0F, 5.0F, 1, 8, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 18, 29, -1.0F, 1.0F, 6.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 0, -3.5F, 1.0F, 6.0F, 1, 8, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 38, -3.5F, 0.2F, 8.0F, 1, 1, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 61, 11, -3.5F, -2.0F, 0.0F, 3, 3, 1, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 23, -3.0F, -8.0F, 0.5F, 2, 9, 7, 0.002F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 48, -1.5F, -8.0F, 0.5F, 1, 9, 7, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 35, 64, -2.25F, -8.0F, 6.6F, 1, 9, 3, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 61, 19, -2.25F, -7.0F, 0.2F, 1, 7, 1, 0.001F, false));

		cube_r136 = new ModelRenderer(this);
		cube_r136.setRotationPoint(-0.5F, -8.0F, 7.5F);
		magazine.addChild(cube_r136);
		setRotationAngle(cube_r136, 0.0F, -0.2443F, 0.0F);
		cube_r136.cubeList.add(new ModelBox(cube_r136, 98, 46, -1.0F, 0.0F, 0.0F, 1, 9, 2, -0.001F, false));

		cube_r137 = new ModelRenderer(this);
		cube_r137.setRotationPoint(-3.0F, -8.0F, 7.5F);
		magazine.addChild(cube_r137);
		setRotationAngle(cube_r137, 0.0F, 0.2443F, 0.0F);
		cube_r137.cubeList.add(new ModelBox(cube_r137, 98, 62, 0.0F, 0.0F, 0.0F, 1, 9, 2, 0.0F, false));

		cube_r138 = new ModelRenderer(this);
		cube_r138.setRotationPoint(-0.5F, -6.4F, 5.5F);
		magazine.addChild(cube_r138);
		setRotationAngle(cube_r138, 0.0F, 0.0F, -0.2094F);
		cube_r138.cubeList.add(new ModelBox(cube_r138, 9, 48, -1.0F, 0.0F, 0.0F, 1, 2, 3, 0.001F, false));

		cube_r139 = new ModelRenderer(this);
		cube_r139.setRotationPoint(-3.5F, 1.9F, 1.0F);
		magazine.addChild(cube_r139);
		setRotationAngle(cube_r139, -0.2618F, 0.0F, 0.0F);
		cube_r139.cubeList.add(new ModelBox(cube_r139, 98, 27, 0.0F, 2.0F, 4.0F, 1, 1, 4, -0.001F, false));
		cube_r139.cubeList.add(new ModelBox(cube_r139, 98, 22, 2.5F, 2.0F, 4.0F, 1, 1, 4, -0.001F, false));

		cube_r140 = new ModelRenderer(this);
		cube_r140.setRotationPoint(-3.1F, 1.9F, 1.0F);
		magazine.addChild(cube_r140);
		setRotationAngle(cube_r140, -0.2628F, -0.0843F, 0.0226F);
		cube_r140.cubeList.add(new ModelBox(cube_r140, 11, 39, 0.0F, 2.0F, 0.0F, 1, 1, 4, -0.001F, false));

		cube_r141 = new ModelRenderer(this);
		cube_r141.setRotationPoint(-0.4F, 1.9F, 1.0F);
		magazine.addChild(cube_r141);
		setRotationAngle(cube_r141, -0.2628F, 0.0843F, -0.0226F);
		cube_r141.cubeList.add(new ModelBox(cube_r141, 81, 53, -1.0F, 2.0F, 0.0F, 1, 1, 4, -0.001F, false));

		cube_r142 = new ModelRenderer(this);
		cube_r142.setRotationPoint(-3.5F, -2.0F, 1.0F);
		magazine.addChild(cube_r142);
		setRotationAngle(cube_r142, -0.2618F, 0.0F, 0.0F);
		cube_r142.cubeList.add(new ModelBox(cube_r142, 49, 48, 0.0F, 0.0F, 0.0F, 1, 3, 8, -0.001F, false));
		cube_r142.cubeList.add(new ModelBox(cube_r142, 51, 0, 2.5F, 0.0F, 0.0F, 1, 3, 8, -0.001F, false));

		cube_r143 = new ModelRenderer(this);
		cube_r143.setRotationPoint(-3.5F, -2.0F, 1.0F);
		magazine.addChild(cube_r143);
		setRotationAngle(cube_r143, -0.2302F, 0.1258F, 0.4916F);
		cube_r143.cubeList.add(new ModelBox(cube_r143, 51, 19, 0.0F, -2.0F, 0.0F, 1, 2, 8, -0.001F, false));

		cube_r144 = new ModelRenderer(this);
		cube_r144.setRotationPoint(0.0F, -2.0F, 1.0F);
		magazine.addChild(cube_r144);
		setRotationAngle(cube_r144, -0.2302F, -0.1258F, -0.4916F);
		cube_r144.cubeList.add(new ModelBox(cube_r144, 0, 67, -1.0F, -2.0F, 0.0F, 1, 2, 8, -0.001F, false));

		cube_r145 = new ModelRenderer(this);
		cube_r145.setRotationPoint(-3.5F, 0.2F, 9.0F);
		magazine.addChild(cube_r145);
		setRotationAngle(cube_r145, 0.0F, 0.925F, 0.0F);
		cube_r145.cubeList.add(new ModelBox(cube_r145, 6, 0, 0.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

		cube_r146 = new ModelRenderer(this);
		cube_r146.setRotationPoint(0.0F, 0.2F, 9.0F);
		magazine.addChild(cube_r146);
		setRotationAngle(cube_r146, 0.0F, -0.925F, 0.0F);
		cube_r146.cubeList.add(new ModelBox(cube_r146, 18, 0, -1.0F, 0.0F, 0.0F, 1, 9, 1, 0.0F, false));

		cube_r147 = new ModelRenderer(this);
		cube_r147.setRotationPoint(-3.5F, 1.0F, 4.0F);
		magazine.addChild(cube_r147);
		setRotationAngle(cube_r147, 0.0F, -0.5236F, 0.0F);
		cube_r147.cubeList.add(new ModelBox(cube_r147, 69, 67, 0.0F, 0.0F, -1.0F, 1, 8, 1, 0.0F, false));

		cube_r148 = new ModelRenderer(this);
		cube_r148.setRotationPoint(0.0F, 1.0F, 4.0F);
		magazine.addChild(cube_r148);
		setRotationAngle(cube_r148, 0.0F, 0.5236F, 0.0F);
		cube_r148.cubeList.add(new ModelBox(cube_r148, 71, 0, -1.0F, 0.0F, -1.0F, 1, 8, 1, 0.0F, false));

		cube_r149 = new ModelRenderer(this);
		cube_r149.setRotationPoint(-3.25F, 1.0F, 2.75F);
		magazine.addChild(cube_r149);
		setRotationAngle(cube_r149, 0.0F, -0.1571F, 0.0F);
		cube_r149.cubeList.add(new ModelBox(cube_r149, 0, 0, 0.0F, 0.0F, -2.0F, 1, 8, 2, 0.0F, false));

		cube_r150 = new ModelRenderer(this);
		cube_r150.setRotationPoint(-0.25F, 1.0F, 2.75F);
		magazine.addChild(cube_r150);
		setRotationAngle(cube_r150, 0.0F, 0.1571F, 0.0F);
		cube_r150.cubeList.add(new ModelBox(cube_r150, 12, 0, -1.0F, 0.0F, -2.0F, 1, 8, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		handguard.render(f5);
//		rails_attachment.render(f5);
//		action.render(f5);
		stock_adapter.render(f5);
//		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
