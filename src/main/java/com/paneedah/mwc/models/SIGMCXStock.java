package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SIGMCXStock extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer receiver_lower;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer receiver_lower_r1;
	private final ModelRenderer receiver_lower_r2;
	private final ModelRenderer receiver_lower_r3;
	private final ModelRenderer receiver_lower_r4;
	private final ModelRenderer receiver_lower_r5;
	private final ModelRenderer bone271;
	private final ModelRenderer bone265;
	private final ModelRenderer bone3;
	private final ModelRenderer bone288;
	private final ModelRenderer bone289;
	private final ModelRenderer bone2;
	private final ModelRenderer bone;
	private final ModelRenderer bone287;
	private final ModelRenderer bone5;
	private final ModelRenderer bone290;
	private final ModelRenderer bone291;
	private final ModelRenderer bone4;
	private final ModelRenderer gun132;
	private final ModelRenderer bone7;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer side_things;
	private final ModelRenderer cube_r1;
	private final ModelRenderer trigger;
	private final ModelRenderer bone292;
	private final ModelRenderer bone293;
	private final ModelRenderer bone294;
	private final ModelRenderer receiver_upper;
	private final ModelRenderer receiver_upper_r1;
	private final ModelRenderer receiver_upper_r2;
	private final ModelRenderer receiver_upper_r3;
	private final ModelRenderer receiver_upper_r4;
	private final ModelRenderer receiver_upper_r5;
	private final ModelRenderer receiver_upper_r6;
	private final ModelRenderer receiver_upper_r7;
	private final ModelRenderer receiver_upper_r8;
	private final ModelRenderer receiver_upper_r9;
	private final ModelRenderer receiver_upper_r10;
	private final ModelRenderer receiver_upper_r11;
	private final ModelRenderer receiver_upper_r12;
	private final ModelRenderer receiver_upper_r13;
	private final ModelRenderer receiver_upper_r14;
	private final ModelRenderer receiver_upper_r15;
	private final ModelRenderer receiver_upper_r16;
	private final ModelRenderer receiver_upper_r17;
	private final ModelRenderer receiver_upper_r18;
	private final ModelRenderer receiver_upper_r19;
	private final ModelRenderer receiver_upper_r20;
	private final ModelRenderer receiver_upper_r21;
	private final ModelRenderer receiver_upper_r22;
	private final ModelRenderer receiver_upper_r23;
	private final ModelRenderer receiver_upper_r24;
	private final ModelRenderer bone6;
	private final ModelRenderer bone253;
	private final ModelRenderer bone254;
	private final ModelRenderer bone276;
	private final ModelRenderer bone283;
	private final ModelRenderer bone279;
	private final ModelRenderer bone278;
	private final ModelRenderer bone277;
	private final ModelRenderer bone280;
	private final ModelRenderer bone281;
	private final ModelRenderer bone282;
	private final ModelRenderer bone251;
	private final ModelRenderer bone252;
	private final ModelRenderer bone319;
	private final ModelRenderer bone320;
	private final ModelRenderer bone8;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun153_r1;
	private final QRenderer handguard;
	private final ModelRenderer handguard_normalboi2;
	private final ModelRenderer long_guard_right3;
	private final ModelRenderer long_guard_right8_r1;
	private final ModelRenderer long_guard_right6_r1;
	private final ModelRenderer long_guard_right7_r1;
	private final ModelRenderer long_guard_right11_r1;
	private final ModelRenderer long_guard_right10_r1;
	private final ModelRenderer long_guard_right9_r1;
	private final ModelRenderer long_guard_right8_r2;
	private final ModelRenderer long_guard_right7_r2;
	private final ModelRenderer long_guard_right6_r2;
	private final ModelRenderer long_guard_right5_r1;
	private final ModelRenderer long_guard_right5_r2;
	private final ModelRenderer long_guard_right9_r2;
	private final ModelRenderer long_guard_right6_r3;
	private final ModelRenderer long_guard_right9_r3;
	private final ModelRenderer long_guard_right8_r3;
	private final ModelRenderer long_guard_right8_r4;
	private final ModelRenderer long_guard_right7_r3;
	private final ModelRenderer long_guard_right8_r5;
	private final ModelRenderer long_guard_right7_r4;
	private final ModelRenderer long_guard_right8_r6;
	private final ModelRenderer long_guard_right7_r5;
	private final ModelRenderer long_guard_right12_r1;
	private final ModelRenderer long_guard_right11_r2;
	private final ModelRenderer long_guard_right10_r2;
	private final ModelRenderer long_guard_right9_r4;
	private final ModelRenderer long_guard_right8_r7;
	private final ModelRenderer long_guard_right10_r3;
	private final ModelRenderer long_guard_right9_r5;
	private final ModelRenderer long_guard_right8_r8;
	private final ModelRenderer long_guard_right7_r6;
	private final ModelRenderer long_guard_right9_r6;
	private final ModelRenderer long_guard_right8_r9;
	private final ModelRenderer long_guard_right7_r7;
	private final ModelRenderer long_guard_right6_r4;
	private final ModelRenderer long_guard_right8_r10;
	private final ModelRenderer long_guard_right7_r8;
	private final ModelRenderer long_guard_right6_r5;
	private final ModelRenderer long_guard_right5_r3;
	private final ModelRenderer long_guard_right7_r9;
	private final ModelRenderer long_guard_right8_r11;
	private final ModelRenderer long_guard_right9_r7;
	private final ModelRenderer long_guard_right11_r3;
	private final ModelRenderer long_guard_right10_r4;
	private final ModelRenderer long_guard_right6_r6;
	private final ModelRenderer long_guard_right7_r10;
	private final ModelRenderer long_guard_right8_r12;
	private final ModelRenderer long_guard_right9_r8;
	private final ModelRenderer long_guard_right5_r4;
	private final ModelRenderer long_guard_right6_r7;
	private final ModelRenderer long_guard_right7_r11;
	private final ModelRenderer long_guard_right8_r13;
	private final ModelRenderer long_guard_right7_r12;
	private final ModelRenderer long_guard_right6_r8;
	private final ModelRenderer long_guard_right5_r5;
	private final ModelRenderer long_guard_right4_r1;
	private final ModelRenderer bone129;
	private final ModelRenderer handguard_lower13;
	private final ModelRenderer handguard_normalboi3;
	private final ModelRenderer long_guard_left4;
	private final ModelRenderer bone213;
	private final QRenderer handguard_short;
	private final ModelRenderer handguard_normalboi4;
	private final ModelRenderer long_guard_right2;
	private final ModelRenderer long_guard_right9_r9;
	private final ModelRenderer long_guard_right10_r5;
	private final ModelRenderer long_guard_right9_r10;
	private final ModelRenderer long_guard_right12_r2;
	private final ModelRenderer long_guard_right11_r4;
	private final ModelRenderer long_guard_right10_r6;
	private final ModelRenderer long_guard_right9_r11;
	private final ModelRenderer long_guard_right8_r14;
	private final ModelRenderer long_guard_right7_r13;
	private final ModelRenderer long_guard_right6_r9;
	private final ModelRenderer long_guard_right6_r10;
	private final ModelRenderer long_guard_right10_r7;
	private final ModelRenderer long_guard_right8_r15;
	private final ModelRenderer long_guard_right9_r12;
	private final ModelRenderer long_guard_right9_r13;
	private final ModelRenderer long_guard_right13_r1;
	private final ModelRenderer long_guard_right12_r3;
	private final ModelRenderer long_guard_right11_r5;
	private final ModelRenderer long_guard_right10_r8;
	private final ModelRenderer long_guard_right9_r14;
	private final ModelRenderer long_guard_right11_r6;
	private final ModelRenderer long_guard_right10_r9;
	private final ModelRenderer long_guard_right9_r15;
	private final ModelRenderer long_guard_right8_r16;
	private final ModelRenderer long_guard_right10_r10;
	private final ModelRenderer long_guard_right9_r16;
	private final ModelRenderer long_guard_right8_r17;
	private final ModelRenderer long_guard_right8_r18;
	private final ModelRenderer long_guard_right9_r17;
	private final ModelRenderer long_guard_right10_r11;
	private final ModelRenderer long_guard_right12_r4;
	private final ModelRenderer long_guard_right11_r7;
	private final ModelRenderer long_guard_right7_r14;
	private final ModelRenderer long_guard_right8_r19;
	private final ModelRenderer long_guard_right9_r18;
	private final ModelRenderer long_guard_right10_r12;
	private final ModelRenderer long_guard_right7_r15;
	private final ModelRenderer long_guard_right8_r20;
	private final ModelRenderer long_guard_right9_r19;
	private final ModelRenderer bone10;
	private final ModelRenderer handguard_lower2;
	private final ModelRenderer handguard_normalboi5;
	private final ModelRenderer long_guard_left2;
	private final ModelRenderer bone11;
	private final QRenderer stonk;
	private final ModelRenderer bone316;
	private final ModelRenderer bone300;
	private final ModelRenderer bone302;
	private final ModelRenderer bone301;
	private final ModelRenderer bone303;
	private final ModelRenderer bone305;
	private final ModelRenderer bone304;
	private final ModelRenderer bone306;
	private final ModelRenderer bone307;
	private final ModelRenderer bone308;
	private final ModelRenderer bone309;
	private final ModelRenderer bone310;
	private final ModelRenderer bone311;
	private final ModelRenderer bone317;
	private final ModelRenderer bone312;
	private final ModelRenderer bone313;
	private final ModelRenderer bone314;
	private final ModelRenderer bone315;
	private final QRenderer action;
	private final ModelRenderer receiver16_r1;
	private final ModelRenderer receiver16_r2;
	private final ModelRenderer receiver15_r1;
	private final ModelRenderer receiver16_r3;

	public SIGMCXStock() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.7F, 1.5F);
		gun.cubeList.add(new ModelBox(gun, 54, 85, -0.2F, -34.9F, -8.2F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 15, 84, -0.2F, -34.9F, -8.6F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 45, -0.2F, -34.9F, -5.4F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 11, 84, -0.2F, -34.9F, -5.8F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 43, 103, -2.0F, -38.9F, -72.0F, 1, 1, 41, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 101, -2.0F, -38.5F, -72.0F, 1, 1, 41, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 43, -1.8F, -38.7F, -72.001F, 1, 1, 41, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 1, -2.2F, -38.7F, -71.999F, 1, 1, 41, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 29, 101, -2.0F, -39.1F, -77.0F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 52, -2.0F, -38.3F, -77.0F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 43, -2.4F, -38.7F, -77.0F, 1, 1, 5, 0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 86, -1.6F, -38.7F, -77.0F, 1, 1, 5, 0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 63, -1.8F, -38.9F, -77.0F, 1, 1, 5, 0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 42, -2.2F, -38.9F, -77.0F, 1, 1, 5, 0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 32, -2.2F, -38.5F, -77.0F, 1, 1, 5, 0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 81, 12, -1.8F, -38.5F, -77.0F, 1, 1, 5, 0.199F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 103, -2.0F, -39.1F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 103, -2.4F, -38.7F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 101, -2.2F, -38.9F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 29, -2.2F, -38.5F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 20, -2.0F, -38.3F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 9, -1.8F, -38.9F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 0, -1.6F, -38.7F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 43, -1.8F, -38.5F, -63.0F, 1, 1, 8, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 77, -2.0F, -39.1F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 43, -1.6F, -38.7F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 31, -1.8F, -38.9F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 11, -1.8F, -38.5F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 42, -2.0F, -38.3F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 63, -2.2F, -38.9F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 43, -2.4F, -38.7F, -71.5F, 1, 1, 5, 0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 32, -2.2F, -38.5F, -71.5F, 1, 1, 5, 0.2F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(0.7F, -33.5F, -13.9F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, -0.3316F, 0.0F, 0.0F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 81, 14, -0.95F, -0.7F, -0.8F, 1, 1, 1, -0.3F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(0.7F, -32.7F, -10.2F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, -0.3316F, 0.0F, 0.0F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 81, 34, -0.95F, -0.7F, -0.8F, 1, 1, 1, -0.3F, false));

		receiver_lower = new ModelRenderer(this);
		receiver_lower.setRotationPoint(0.0F, 0.0F, -6.0F);
		gun.addChild(receiver_lower);
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 86, 120, -3.4997F, -35.5F, -19.5F, 4, 4, 11, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 86, 103, -3.4997F, -35.6F, -8.6F, 4, 4, 13, -0.1F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 61, 57, -3.35F, -35.5F, -14.7F, 4, 2, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 62, 16, -3.35F, -32.7F, -14.7F, 4, 1, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 12, 57, -3.35F, -35.5F, -14.2F, 4, 2, 1, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 8, -3.35F, -32.7F, -14.2F, 4, 1, 1, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 37, 96, -0.05F, -32.7F, -12.4F, 1, 1, 1, -0.1F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 55, 181, -0.3F, -36.5F, -19.5F, 1, 1, 25, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 25, 77, -1.3F, -36.5F, -21.5F, 2, 2, 2, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 100, 24, 0.2F, -36.5F, -21.5F, 1, 2, 2, -0.4F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 100, 20, -4.2F, -36.5F, -21.5F, 1, 2, 2, -0.4F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 12, 6, -3.7F, -36.5F, -21.5F, 3, 2, 2, -0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 28, 180, -3.7F, -36.5F, -19.5F, 1, 1, 25, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 51, -3.8F, -36.55F, -19.8F, 1, 1, 10, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 77, -3.8F, -36.15F, -19.5F, 1, 1, 9, -0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 81, -3.8F, -35.75F, -19.5F, 1, 1, 3, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 12, 26, -3.85F, -34.75F, -12.8F, 1, 3, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 105, -3.85F, -35.75F, -11.8F, 1, 1, 2, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 100, 33, -0.4F, -39.5F, 6.5F, 1, 2, 2, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 100, 29, -3.6F, -39.5F, 6.5F, 1, 2, 2, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 37, 38, -3.0F, -42.5F, 6.5F, 3, 6, 3, -0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 11, 82, -3.5F, -42.25F, 8.5F, 4, 1, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 43, -3.5F, -31.5F, -19.5F, 4, 3, 1, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 17, 119, -3.5F, -32.1F, -18.8F, 4, 4, 8, -0.05F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 17, -3.5F, -31.5F, -11.5F, 4, 3, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 36, 69, -3.5F, -28.5F, -12.5F, 4, 1, 2, -0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 25, 51, -3.0F, -31.75F, -10.5F, 3, 5, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 41, 13, -3.0F, -31.75F, -2.5F, 3, 5, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 12, 32, -2.5F, -27.25F, -7.5F, 2, 1, 3, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.2F, -31.8F, -14.7F);
		receiver_lower.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 54, 97, -1.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));
		bone_r1.cubeList.add(new ModelBox(bone_r1, 50, 97, -1.0F, -1.0F, 0.499F, 1, 1, 1, -0.001F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.2F, -33.0F, -14.2F);
		receiver_lower.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 0.7854F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 58, 97, -1.0F, -1.0F, -0.001F, 1, 1, 1, -0.001F, false));
		bone_r2.cubeList.add(new ModelBox(bone_r2, 62, 97, -1.0F, -1.0F, -0.501F, 1, 1, 1, 0.0F, false));

		receiver_lower_r1 = new ModelRenderer(this);
		receiver_lower_r1.setRotationPoint(0.5F, -30.2F, -11.5F);
		receiver_lower.addChild(receiver_lower_r1);
		setRotationAngle(receiver_lower_r1, 0.733F, 0.0F, 0.0F);
		receiver_lower_r1.cubeList.add(new ModelBox(receiver_lower_r1, 12, 43, -4.0F, -2.0F, 0.0F, 4, 2, 1, -0.001F, false));

		receiver_lower_r2 = new ModelRenderer(this);
		receiver_lower_r2.setRotationPoint(-3.85F, -34.75F, -12.8F);
		receiver_lower.addChild(receiver_lower_r2);
		setRotationAngle(receiver_lower_r2, -0.7854F, 0.0F, 0.0F);
		receiver_lower_r2.cubeList.add(new ModelBox(receiver_lower_r2, 89, 20, 0.0F, -1.4F, 0.0F, 1, 1, 1, 0.001F, false));
		receiver_lower_r2.cubeList.add(new ModelBox(receiver_lower_r2, 43, 89, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		receiver_lower_r3 = new ModelRenderer(this);
		receiver_lower_r3.setRotationPoint(-3.85F, -31.75F, -12.8F);
		receiver_lower.addChild(receiver_lower_r3);
		setRotationAngle(receiver_lower_r3, 0.7156F, 0.0F, 0.0F);
		receiver_lower_r3.cubeList.add(new ModelBox(receiver_lower_r3, 43, 113, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		receiver_lower_r4 = new ModelRenderer(this);
		receiver_lower_r4.setRotationPoint(-3.8F, -35.4F, 5.5F);
		receiver_lower.addChild(receiver_lower_r4);
		setRotationAngle(receiver_lower_r4, 0.3927F, 0.0F, 0.0F);
		receiver_lower_r4.cubeList.add(new ModelBox(receiver_lower_r4, 11, 92, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));
		receiver_lower_r4.cubeList.add(new ModelBox(receiver_lower_r4, 92, 63, 3.6F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver_lower_r5 = new ModelRenderer(this);
		receiver_lower_r5.setRotationPoint(0.85F, -31.8F, -12.3F);
		receiver_lower.addChild(receiver_lower_r5);
		setRotationAngle(receiver_lower_r5, 0.0F, 0.0F, -0.7679F);
		receiver_lower_r5.cubeList.add(new ModelBox(receiver_lower_r5, 61, 74, -0.9F, -0.9F, -0.1F, 1, 1, 4, -0.101F, false));

		bone271 = new ModelRenderer(this);
		bone271.setRotationPoint(-1.5F, -38.5F, 8.75F);
		receiver_lower.addChild(bone271);
		setRotationAngle(bone271, -0.7854F, 0.0F, 0.0F);
		bone271.cubeList.add(new ModelBox(bone271, 0, 51, 0.9F, 0.0F, -1.0F, 1, 8, 2, -0.001F, false));
		bone271.cubeList.add(new ModelBox(bone271, 0, 51, -1.9F, 0.0F, -1.0F, 1, 8, 2, -0.001F, false));

		bone265 = new ModelRenderer(this);
		bone265.setRotationPoint(0.0F, -38.5F, 10.0F);
		receiver_lower.addChild(bone265);
		setRotationAngle(bone265, 0.0F, -0.2182F, 0.0F);
		bone265.cubeList.add(new ModelBox(bone265, 115, 14, -0.7389F, -1.0F, -1.5943F, 1, 2, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-3.0F, -38.5F, 10.0F);
		receiver_lower.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.2182F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 13, 113, -0.2611F, -1.0F, -1.5943F, 1, 2, 1, 0.0F, false));

		bone288 = new ModelRenderer(this);
		bone288.setRotationPoint(-1.5F, -31.25F, -10.5F);
		receiver_lower.addChild(bone288);
		setRotationAngle(bone288, -0.7854F, 0.0F, 0.0F);
		bone288.cubeList.add(new ModelBox(bone288, 85, 6, -1.5F, -1.7071F, 0.2071F, 3, 2, 1, -0.001F, false));

		bone289 = new ModelRenderer(this);
		bone289.setRotationPoint(-1.5F, -31.25F, -2.5F);
		receiver_lower.addChild(bone289);
		setRotationAngle(bone289, 0.7854F, 0.0F, 0.0F);
		bone289.cubeList.add(new ModelBox(bone289, 36, 83, -1.5F, -1.0F, -0.5F, 3, 2, 1, -0.001F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5F, -35.5F, 6.5F);
		receiver_lower.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 37, 26, -1.5F, -2.8991F, -1.6565F, 3, 7, 3, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.0F, -26.25F, -17.75F);
		receiver_lower.addChild(bone);
		setRotationAngle(bone, -0.1309F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 129, 127, -1.75F, -2.0851F, -2.4522F, 4, 1, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 41, 19, -1.0071F, -2.7922F, -2.4522F, 3, 1, 1, -0.002F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 26, 1.75F, -2.0851F, -2.4522F, 1, 1, 10, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 25, 13, -1.5F, -3.1091F, -1.3349F, 4, 1, 8, 0.0F, false));

		bone287 = new ModelRenderer(this);
		bone287.setRotationPoint(2.5F, -1.4872F, 1.8042F);
		bone.addChild(bone287);
		setRotationAngle(bone287, 0.0F, 0.0F, 0.7854F);
		bone287.cubeList.add(new ModelBox(bone287, 0, 37, -1.246F, -0.5996F, -4.2564F, 1, 1, 10, -0.001F, false));
		bone287.cubeList.add(new ModelBox(bone287, 0, 11, -3.428F, 1.5824F, -4.2564F, 1, 1, 10, -0.001F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -27.0F, -8.5F);
		receiver_lower.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 32, -1.0F, -0.435F, -1.885F, 2, 1, 3, 0.001F, false));

		bone290 = new ModelRenderer(this);
		bone290.setRotationPoint(-1.5F, -27.685F, -9.385F);
		receiver_lower.addChild(bone290);
		setRotationAngle(bone290, -0.829F, 0.0F, 0.0F);
		bone290.cubeList.add(new ModelBox(bone290, 63, 5, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone291 = new ModelRenderer(this);
		bone291.setRotationPoint(-1.5F, -27.685F, -2.635F);
		receiver_lower.addChild(bone291);
		setRotationAngle(bone291, -2.3998F, 0.0F, 0.0F);
		bone291.cubeList.add(new ModelBox(bone291, 25, 57, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -27.0F, -3.5F);
		receiver_lower.addChild(bone4);
		setRotationAngle(bone4, 0.1745F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 12, 17, -1.0F, -0.435F, -1.115F, 2, 1, 3, 0.001F, false));

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(0.05F, -36.9F, -10.4F);
		receiver_lower.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.491F);
		gun132.cubeList.add(new ModelBox(gun132, 50, 58, -0.7277F, 0.2207F, -0.15F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 53, 37, -0.727F, 0.22F, 0.25F, 2, 1, 1, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, -0.7F, 4.2F);
		receiver_lower.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 107, 103, -0.1F, -35.6F, -14.8F, 1, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 113, 52, 0.15F, -36.1F, -14.55F, 1, 2, 1, -0.2F, false));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(1.2F, -33.5F, -15.351F);
		bone7.addChild(gun130_r1);
		setRotationAngle(gun130_r1, 0.0F, 0.0F, 0.4538F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 107, 106, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.2F, false));

		side_things = new ModelRenderer(this);
		side_things.setRotationPoint(0.0F, 0.0F, 6.0F);
		receiver_lower.addChild(side_things);
		side_things.cubeList.add(new ModelBox(side_things, 86, 103, -0.4F, -33.65F, -20.65F, 1, 1, 5, 0.0F, false));
		side_things.cubeList.add(new ModelBox(side_things, 33, 96, -0.4F, -33.65F, -16.65F, 1, 1, 1, 0.1F, false));
		side_things.cubeList.add(new ModelBox(side_things, 55, 113, -3.5F, -34.2F, -17.35F, 1, 2, 1, 0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.05F, -31.75F, -20.05F);
		side_things.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.3142F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 29, 96, -1.65F, -1.9F, 4.1F, 1, 1, 1, 0.101F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0F, -0.25F, 6.0F);
		receiver_lower.addChild(trigger);
		

		bone292 = new ModelRenderer(this);
		bone292.setRotationPoint(-1.5F, -31.5F, -11.5F);
		trigger.addChild(bone292);
		setRotationAngle(bone292, 0.2182F, 0.0F, 0.0F);
		bone292.cubeList.add(new ModelBox(bone292, 115, 11, -0.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, false));

		bone293 = new ModelRenderer(this);
		bone293.setRotationPoint(-1.5F, -31.5F, -11.5F);
		trigger.addChild(bone293);
		setRotationAngle(bone293, -0.0436F, 0.0F, 0.0F);
		bone293.cubeList.add(new ModelBox(bone293, 100, 58, -0.5F, 1.3195F, -0.1288F, 1, 1, 1, 0.0F, false));

		bone294 = new ModelRenderer(this);
		bone294.setRotationPoint(-1.5F, -31.5F, -11.5F);
		trigger.addChild(bone294);
		setRotationAngle(bone294, -0.2182F, 0.0F, 0.0F);
		bone294.cubeList.add(new ModelBox(bone294, 100, 55, -0.5F, 2.133F, 0.2607F, 1, 1, 1, 0.0F, false));

		receiver_upper = new ModelRenderer(this);
		receiver_upper.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(receiver_upper);
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 25, 87, -0.4F, -39.5F, -1.5F, 1, 3, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 104, 43, -0.4F, -37.0F, -6.5F, 1, 1, 5, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 87, -3.6F, -39.5F, -1.5F, 1, 3, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 71, 103, -3.6F, -37.0F, -6.5F, 1, 1, 5, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 50, 51, -0.25F, -39.75F, -32.5F, 1, 3, 9, -0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 121, 20, -3.75F, -39.75F, -32.5F, 1, 3, 7, -0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 85, 89, -0.25F, -37.75F, -23.5F, 1, 1, 1, -0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 180, 0, -0.5F, -39.5F, -26.5F, 1, 3, 25, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 119, -3.5F, -39.5F, -16.5F, 1, 3, 15, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 50, 85, -3.6F, -37.5F, -25.5F, 1, 1, 9, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 21, 105, -4.0F, -38.5F, -27.5F, 1, 1, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 100, 43, -3.0F, -41.5F, -14.5F, 3, 2, 17, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 62, -0.25F, -42.5F, -32.5F, 1, 3, 9, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 104, 33, -0.25F, -41.5F, -15.5F, 1, 1, 1, 0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 61, 112, -3.5F, -42.5F, -16.5F, 4, 3, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 25, 77, -3.0F, -41.3F, -25.5F, 1, 1, 9, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 123, 43, -3.75F, -42.5F, -32.5F, 1, 3, 7, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 53, 0, -0.4F, -42.6F, -23.5F, 1, 3, 8, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 25, 81, -5.45F, -40.75F, -14.5F, 3, 3, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 100, 62, -3.25F, -42.5F, -15.5F, 4, 1, 16, -0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 180, -3.75F, -42.5F, -25.5F, 1, 1, 26, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 43, 120, -0.25F, -42.5F, -51.4F, 1, 1, 15, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 100, 85, -3.75F, -42.5F, -51.4F, 1, 1, 15, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 60, 120, -0.248F, -40.5F, -23.5F, 1, 1, 8, -0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 107, 52, -0.25F, -40.75F, -21.5F, 1, 1, 4, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 104, 29, -0.275F, -41.65F, -16.9F, 1, 1, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 29, 104, -0.275F, -41.65F, -23.1F, 1, 1, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 0, -2.5F, -44.0F, -50.4F, 2, 2, 49, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 66, 79, -2.5F, -44.0F, -51.175F, 2, 2, 1, 0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 100, 79, -2.5F, -43.3F, -1.6F, 2, 1, 4, -0.001F, false));

		receiver_upper_r1 = new ModelRenderer(this);
		receiver_upper_r1.setRotationPoint(0.75F, -41.5F, -16.5F);
		receiver_upper.addChild(receiver_upper_r1);
		setRotationAngle(receiver_upper_r1, 0.0F, 0.0F, -0.733F);
		receiver_upper_r1.cubeList.add(new ModelBox(receiver_upper_r1, 43, 103, -1.0F, -1.0F, 1.0F, 1, 1, 16, 0.0F, false));

		receiver_upper_r2 = new ModelRenderer(this);
		receiver_upper_r2.setRotationPoint(-3.55F, -41.5F, -16.5F);
		receiver_upper.addChild(receiver_upper_r2);
		setRotationAngle(receiver_upper_r2, 0.0F, 0.0F, 0.733F);
		receiver_upper_r2.cubeList.add(new ModelBox(receiver_upper_r2, 0, 101, 0.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, false));

		receiver_upper_r3 = new ModelRenderer(this);
		receiver_upper_r3.setRotationPoint(-3.75F, -42.5F, -3.4F);
		receiver_upper.addChild(receiver_upper_r3);
		setRotationAngle(receiver_upper_r3, 0.0F, 0.0F, 1.1868F);
		receiver_upper_r3.cubeList.add(new ModelBox(receiver_upper_r3, 24, 26, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

		receiver_upper_r4 = new ModelRenderer(this);
		receiver_upper_r4.setRotationPoint(-3.75F, -42.5F, 0.6F);
		receiver_upper.addChild(receiver_upper_r4);
		setRotationAngle(receiver_upper_r4, 0.1223F, 0.052F, 1.1932F);
		receiver_upper_r4.cubeList.add(new ModelBox(receiver_upper_r4, 100, 4, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver_upper_r5 = new ModelRenderer(this);
		receiver_upper_r5.setRotationPoint(0.75F, -42.5F, 0.6F);
		receiver_upper.addChild(receiver_upper_r5);
		setRotationAngle(receiver_upper_r5, 0.1223F, -0.052F, -1.1932F);
		receiver_upper_r5.cubeList.add(new ModelBox(receiver_upper_r5, 100, 9, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver_upper_r6 = new ModelRenderer(this);
		receiver_upper_r6.setRotationPoint(0.75F, -42.5F, -3.4F);
		receiver_upper.addChild(receiver_upper_r6);
		setRotationAngle(receiver_upper_r6, 0.0F, 0.0F, -1.1868F);
		receiver_upper_r6.cubeList.add(new ModelBox(receiver_upper_r6, 0, 37, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

		receiver_upper_r7 = new ModelRenderer(this);
		receiver_upper_r7.setRotationPoint(0.75F, -42.5F, -30.4F);
		receiver_upper.addChild(receiver_upper_r7);
		setRotationAngle(receiver_upper_r7, 0.0F, 0.0F, -0.9076F);
		receiver_upper_r7.cubeList.add(new ModelBox(receiver_upper_r7, 0, 51, -1.0F, -2.0F, -21.0F, 1, 2, 48, 0.0F, false));

		receiver_upper_r8 = new ModelRenderer(this);
		receiver_upper_r8.setRotationPoint(-3.75F, -42.5F, -30.4F);
		receiver_upper.addChild(receiver_upper_r8);
		setRotationAngle(receiver_upper_r8, 0.0F, 0.0F, 0.9076F);
		receiver_upper_r8.cubeList.add(new ModelBox(receiver_upper_r8, 50, 53, 0.0F, -2.0F, -21.0F, 1, 2, 48, 0.0F, false));

		receiver_upper_r9 = new ModelRenderer(this);
		receiver_upper_r9.setRotationPoint(-3.75F, -41.5F, -25.5F);
		receiver_upper.addChild(receiver_upper_r9);
		setRotationAngle(receiver_upper_r9, 0.0F, 0.0F, 0.7679F);
		receiver_upper_r9.cubeList.add(new ModelBox(receiver_upper_r9, 24, 38, 0.0F, -1.0F, 0.0F, 2, 1, 9, 0.0F, false));

		receiver_upper_r10 = new ModelRenderer(this);
		receiver_upper_r10.setRotationPoint(-3.75F, -41.5F, 0.5F);
		receiver_upper.addChild(receiver_upper_r10);
		setRotationAngle(receiver_upper_r10, 0.0F, 0.1222F, 0.0F);
		receiver_upper_r10.cubeList.add(new ModelBox(receiver_upper_r10, 43, 105, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r11 = new ModelRenderer(this);
		receiver_upper_r11.setRotationPoint(0.75F, -41.5F, 0.5F);
		receiver_upper.addChild(receiver_upper_r11);
		setRotationAngle(receiver_upper_r11, 0.0F, -0.1222F, 0.0F);
		receiver_upper_r11.cubeList.add(new ModelBox(receiver_upper_r11, 61, 106, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r12 = new ModelRenderer(this);
		receiver_upper_r12.setRotationPoint(-5.45F, -40.75F, -14.5F);
		receiver_upper.addChild(receiver_upper_r12);
		setRotationAngle(receiver_upper_r12, 0.0F, 0.6981F, 0.0F);
		receiver_upper_r12.cubeList.add(new ModelBox(receiver_upper_r12, 25, 0, 1.0F, 0.0F, 0.5F, 1, 3, 1, -0.002F, false));
		receiver_upper_r12.cubeList.add(new ModelBox(receiver_upper_r12, 61, 68, 0.0F, 0.0F, 0.0F, 3, 3, 1, -0.001F, false));

		receiver_upper_r13 = new ModelRenderer(this);
		receiver_upper_r13.setRotationPoint(-5.45F, -40.75F, -14.5F);
		receiver_upper.addChild(receiver_upper_r13);
		setRotationAngle(receiver_upper_r13, 0.0F, 0.0F, -0.4014F);
		receiver_upper_r13.cubeList.add(new ModelBox(receiver_upper_r13, 25, 19, 0.0F, 0.0F, 0.0F, 3, 1, 1, -0.001F, false));

		receiver_upper_r14 = new ModelRenderer(this);
		receiver_upper_r14.setRotationPoint(-3.75F, -40.3F, -25.5F);
		receiver_upper.addChild(receiver_upper_r14);
		setRotationAngle(receiver_upper_r14, 0.7679F, 0.0F, 0.0F);
		receiver_upper_r14.cubeList.add(new ModelBox(receiver_upper_r14, 9, 105, 0.0F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		receiver_upper_r15 = new ModelRenderer(this);
		receiver_upper_r15.setRotationPoint(-4.0F, -37.5F, -25.4F);
		receiver_upper.addChild(receiver_upper_r15);
		setRotationAngle(receiver_upper_r15, 0.0F, 0.0F, 0.3316F);
		receiver_upper_r15.cubeList.add(new ModelBox(receiver_upper_r15, 0, 0, 0.0F, -1.0F, -1.0F, 1, 1, 10, -0.101F, false));
		receiver_upper_r15.cubeList.add(new ModelBox(receiver_upper_r15, 74, 0, 0.0F, -1.0F, 5.9F, 1, 1, 3, 0.0F, false));
		receiver_upper_r15.cubeList.add(new ModelBox(receiver_upper_r15, 74, 4, 0.0F, -1.0F, -0.1F, 1, 1, 3, 0.0F, false));

		receiver_upper_r16 = new ModelRenderer(this);
		receiver_upper_r16.setRotationPoint(-3.5F, -39.5F, -12.5F);
		receiver_upper.addChild(receiver_upper_r16);
		setRotationAngle(receiver_upper_r16, 0.0F, 0.0F, 0.5061F);
		receiver_upper_r16.cubeList.add(new ModelBox(receiver_upper_r16, 129, 103, 0.0F, -1.0F, -1.0F, 1, 1, 13, 0.0F, false));

		receiver_upper_r17 = new ModelRenderer(this);
		receiver_upper_r17.setRotationPoint(0.5F, -39.5F, -12.5F);
		receiver_upper.addChild(receiver_upper_r17);
		setRotationAngle(receiver_upper_r17, 0.0F, 0.0F, -0.5061F);
		receiver_upper_r17.cubeList.add(new ModelBox(receiver_upper_r17, 117, 85, -1.0F, -1.0F, -2.0F, 1, 1, 14, 0.0F, false));

		receiver_upper_r18 = new ModelRenderer(this);
		receiver_upper_r18.setRotationPoint(0.75F, -36.75F, -21.5F);
		receiver_upper.addChild(receiver_upper_r18);
		setRotationAngle(receiver_upper_r18, 0.7505F, 0.0F, 0.0F);
		receiver_upper_r18.cubeList.add(new ModelBox(receiver_upper_r18, 25, 6, -1.0F, -3.3F, -1.0F, 1, 3, 1, 0.0F, false));

		receiver_upper_r19 = new ModelRenderer(this);
		receiver_upper_r19.setRotationPoint(-3.75F, -36.75F, -26.5F);
		receiver_upper.addChild(receiver_upper_r19);
		setRotationAngle(receiver_upper_r19, 0.0F, 0.0F, -0.4887F);
		receiver_upper_r19.cubeList.add(new ModelBox(receiver_upper_r19, 53, 11, 0.0F, 0.0F, -6.0F, 1, 1, 7, -0.001F, false));

		receiver_upper_r20 = new ModelRenderer(this);
		receiver_upper_r20.setRotationPoint(0.75F, -36.75F, -26.5F);
		receiver_upper.addChild(receiver_upper_r20);
		setRotationAngle(receiver_upper_r20, 0.0F, 0.0F, 0.4887F);
		receiver_upper_r20.cubeList.add(new ModelBox(receiver_upper_r20, 74, 74, -1.0F, 0.0F, -6.0F, 1, 1, 11, -0.001F, false));

		receiver_upper_r21 = new ModelRenderer(this);
		receiver_upper_r21.setRotationPoint(-3.6F, -39.5F, -1.5F);
		receiver_upper.addChild(receiver_upper_r21);
		setRotationAngle(receiver_upper_r21, 0.0F, 0.0F, 0.5934F);
		receiver_upper_r21.cubeList.add(new ModelBox(receiver_upper_r21, 12, 37, 0.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

		receiver_upper_r22 = new ModelRenderer(this);
		receiver_upper_r22.setRotationPoint(-3.6F, -39.5F, 2.5F);
		receiver_upper.addChild(receiver_upper_r22);
		setRotationAngle(receiver_upper_r22, 0.0873F, 0.192F, 0.5934F);
		receiver_upper_r22.cubeList.add(new ModelBox(receiver_upper_r22, 73, 112, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver_upper_r23 = new ModelRenderer(this);
		receiver_upper_r23.setRotationPoint(0.6F, -39.5F, 2.5F);
		receiver_upper.addChild(receiver_upper_r23);
		setRotationAngle(receiver_upper_r23, 0.0873F, -0.192F, -0.5934F);
		receiver_upper_r23.cubeList.add(new ModelBox(receiver_upper_r23, 79, 112, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver_upper_r24 = new ModelRenderer(this);
		receiver_upper_r24.setRotationPoint(0.6F, -39.5F, -1.5F);
		receiver_upper.addChild(receiver_upper_r24);
		setRotationAngle(receiver_upper_r24, 0.0F, 0.0F, -0.5934F);
		receiver_upper_r24.cubeList.add(new ModelBox(receiver_upper_r24, 38, 0, -1.0F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-4.4F, -37.9F, -25.5F);
		receiver_upper.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.2793F);
		bone6.cubeList.add(new ModelBox(bone6, 25, 51, 0.1F, -0.3F, 0.0F, 1, 3, 9, -0.2F, false));
		bone6.cubeList.add(new ModelBox(bone6, 24, 38, -0.2F, -0.3F, 0.2F, 1, 3, 3, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 74, 86, -0.2F, -0.3F, 1.7F, 1, 3, 2, -0.399F, false));
		bone6.cubeList.add(new ModelBox(bone6, 50, 85, -0.2F, -0.3F, 6.7F, 1, 3, 2, -0.399F, false));
		bone6.cubeList.add(new ModelBox(bone6, 25, 13, -0.2F, -0.3F, 5.2F, 1, 3, 3, -0.4F, false));
		bone6.cubeList.add(new ModelBox(bone6, 100, 13, -0.3F, 0.4F, 3.4F, 1, 2, 2, -0.299F, false));

		bone253 = new ModelRenderer(this);
		bone253.setRotationPoint(-1.0F, -37.5F, -5.75F);
		receiver_upper.addChild(bone253);
		setRotationAngle(bone253, -0.0873F, -0.2182F, 0.0F);
		

		bone254 = new ModelRenderer(this);
		bone254.setRotationPoint(4.0F, 37.75F, 8.0F);
		bone253.addChild(bone254);
		

		bone276 = new ModelRenderer(this);
		bone276.setRotationPoint(-5.75F, -1.5F, 11.5F);
		bone254.addChild(bone276);
		bone276.cubeList.add(new ModelBox(bone276, 111, 113, -2.75F, -37.5F, -22.5F, 1, 1, 2, 0.0F, false));
		bone276.cubeList.add(new ModelBox(bone276, 107, 112, -2.75F, -37.0F, -22.5F, 1, 1, 2, -0.001F, false));
		bone276.cubeList.add(new ModelBox(bone276, 111, 43, -3.25F, -37.0F, -22.5F, 1, 1, 2, 0.0F, false));
		bone276.cubeList.add(new ModelBox(bone276, 8, 111, -3.25F, -37.5F, -22.5F, 1, 1, 2, 0.001F, false));

		bone283 = new ModelRenderer(this);
		bone283.setRotationPoint(-5.75F, -1.5F, 8.5F);
		bone254.addChild(bone283);
		bone283.cubeList.add(new ModelBox(bone283, 87, 79, -2.7F, -37.55F, -24.5F, 1, 1, 4, 0.0F, false));
		bone283.cubeList.add(new ModelBox(bone283, 87, 74, -2.7F, -36.95F, -24.5F, 1, 1, 4, -0.001F, false));
		bone283.cubeList.add(new ModelBox(bone283, 87, 56, -3.3F, -36.95F, -24.5F, 1, 1, 4, 0.0F, false));
		bone283.cubeList.add(new ModelBox(bone283, 87, 51, -3.3F, -37.55F, -24.5F, 1, 1, 4, 0.001F, false));

		bone279 = new ModelRenderer(this);
		bone279.setRotationPoint(-8.5F, -38.25F, -8.75F);
		bone254.addChild(bone279);
		

		bone278 = new ModelRenderer(this);
		bone278.setRotationPoint(3.0429F, 36.2929F, 21.0F);
		bone279.addChild(bone278);
		bone278.cubeList.add(new ModelBox(bone278, 13, 101, -3.25F, -36.0858F, -21.5F, 1, 1, 1, 0.002F, false));
		bone278.cubeList.add(new ModelBox(bone278, 104, 4, -2.5429F, -36.7929F, -21.5F, 1, 1, 1, 0.001F, false));
		bone278.cubeList.add(new ModelBox(bone278, 104, 0, -3.9571F, -36.7929F, -21.5F, 1, 1, 1, 0.001F, false));
		bone278.cubeList.add(new ModelBox(bone278, 65, 103, -3.25F, -37.5F, -21.5F, 1, 1, 1, 0.002F, false));

		bone277 = new ModelRenderer(this);
		bone277.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone279.addChild(bone277);
		setRotationAngle(bone277, 0.0F, 0.0F, -0.7854F);
		bone277.cubeList.add(new ModelBox(bone277, 29, 92, 0.4142F, -0.2929F, -0.5F, 1, 1, 1, 0.0F, false));
		bone277.cubeList.add(new ModelBox(bone277, 89, 92, -0.2929F, 0.4142F, -0.5F, 1, 1, 1, 0.0F, false));
		bone277.cubeList.add(new ModelBox(bone277, 25, 96, -1.0F, -0.2929F, -0.5F, 1, 1, 1, 0.0F, false));
		bone277.cubeList.add(new ModelBox(bone277, 90, 45, -0.2929F, -1.0F, -0.5F, 1, 1, 1, 0.0F, false));

		bone280 = new ModelRenderer(this);
		bone280.setRotationPoint(-8.5F, -38.25F, -11.0F);
		bone254.addChild(bone280);
		

		bone281 = new ModelRenderer(this);
		bone281.setRotationPoint(3.0429F, 36.2929F, 21.0F);
		bone280.addChild(bone281);
		bone281.cubeList.add(new ModelBox(bone281, 110, 75, -3.25F, -36.0858F, -22.5F, 1, 1, 2, 0.002F, false));
		bone281.cubeList.add(new ModelBox(bone281, 110, 57, -2.5429F, -36.7929F, -22.5F, 1, 1, 2, 0.001F, false));
		bone281.cubeList.add(new ModelBox(bone281, 110, 32, -3.9571F, -36.7929F, -22.5F, 1, 1, 2, 0.001F, false));
		bone281.cubeList.add(new ModelBox(bone281, 110, 29, -3.25F, -37.5F, -22.5F, 1, 1, 2, 0.002F, false));

		bone282 = new ModelRenderer(this);
		bone282.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone280.addChild(bone282);
		setRotationAngle(bone282, 0.0F, 0.0F, -0.7854F);
		bone282.cubeList.add(new ModelBox(bone282, 52, 107, 0.4142F, -0.2929F, -1.5F, 1, 1, 2, 0.0F, false));
		bone282.cubeList.add(new ModelBox(bone282, 27, 110, -0.2929F, 0.4142F, -1.5F, 1, 1, 2, 0.0F, false));
		bone282.cubeList.add(new ModelBox(bone282, 110, 23, -1.0F, -0.2929F, -1.5F, 1, 1, 2, 0.0F, false));
		bone282.cubeList.add(new ModelBox(bone282, 106, 97, -0.2929F, -1.0F, -1.5F, 1, 1, 2, 0.0F, false));

		bone251 = new ModelRenderer(this);
		bone251.setRotationPoint(-1.5F, -40.25F, -15.25F);
		receiver_upper.addChild(bone251);
		setRotationAngle(bone251, 0.7854F, 0.0F, 0.0F);
		bone251.cubeList.add(new ModelBox(bone251, 104, 24, 1.252F, -0.6464F, -0.7071F, 1, 1, 1, 0.0F, false));
		bone251.cubeList.add(new ModelBox(bone251, 104, 13, 1.252F, -6.3033F, -6.364F, 1, 1, 1, 0.0F, false));
		bone251.cubeList.add(new ModelBox(bone251, 104, 20, 1.25F, -0.6464F, -0.2929F, 1, 1, 1, 0.0F, false));

		bone252 = new ModelRenderer(this);
		bone252.setRotationPoint(-1.5F, -38.1564F, -12.7273F);
		receiver_upper.addChild(bone252);
		

		bone319 = new ModelRenderer(this);
		bone319.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone252.addChild(bone319);
		setRotationAngle(bone319, -0.7854F, 0.0F, 0.0F);
		bone319.cubeList.add(new ModelBox(bone319, 115, 2, 1.101F, -4.1535F, 4.4077F, 1, 2, 1, 0.001F, false));
		bone319.cubeList.add(new ModelBox(bone319, 49, 113, -2.101F, -4.1535F, 4.4077F, 1, 2, 1, 0.001F, false));

		bone320 = new ModelRenderer(this);
		bone320.setRotationPoint(0.0F, 0.6564F, 5.7273F);
		bone252.addChild(bone320);
		setRotationAngle(bone320, -0.3927F, 0.0F, 0.0F);
		bone320.cubeList.add(new ModelBox(bone320, 66, 97, 1.101F, -3.096F, 4.6624F, 1, 1, 1, 0.0F, false));
		bone320.cubeList.add(new ModelBox(bone320, 89, 69, -2.101F, -3.096F, 4.6624F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.6F, -33.1F, -6.5F);
		gun.addChild(bone8);
		setRotationAngle(bone8, 1.5533F, 0.0F, 0.0F);
		

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone8.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -1.5708F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 85, 92, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-1.3F, -0.1F, -0.2F);
		bone8.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 78, 86, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.6F, -33.1F, -6.5F);
		gun.addChild(bone9);
		setRotationAngle(bone9, 1.5533F, 0.0F, 0.0F);
		

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone9.addChild(gun157_r1);
		setRotationAngle(gun157_r1, -1.5708F, 0.0F, 0.0F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 37, 92, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun153_r1 = new ModelRenderer(this);
		gun153_r1.setRotationPoint(1.3F, -0.1F, -0.2F);
		bone9.addChild(gun153_r1);
		setRotationAngle(gun153_r1, 0.7854F, 0.0F, 0.0F);
		gun153_r1.cubeList.add(new ModelBox(gun153_r1, 85, 66, -1.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard = new QRenderer(this);
		handguard.setRotationPoint(0.0F, 24.7F, 4.7F);
		

		handguard_normalboi2 = new ModelRenderer(this);
		handguard_normalboi2.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(handguard_normalboi2);
		

		long_guard_right3 = new ModelRenderer(this);
		long_guard_right3.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard_normalboi2.addChild(long_guard_right3);
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 50, 74, 0.0F, -37.75F, -39.75F, 1, 2, 9, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 74, 20, -4.0F, -37.75F, -39.75F, 1, 2, 9, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 52, 103, 0.5F, -39.25F, -37.75F, 1, 2, 2, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 43, 101, 0.5F, -39.25F, -34.0F, 1, 2, 2, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 53, 0, -3.0F, -35.75F, -71.75F, 3, 1, 41, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 143, 0, -2.5F, -43.5F, -72.575F, 2, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 23, 207, -2.5F, -44.0F, -73.375F, 2, 1, 19, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 172, 127, 0.2F, -39.75F, -72.75F, 1, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 121, 0, 0.2F, -39.75F, -39.75F, 1, 3, 7, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 0, 143, 0.2F, -39.75F, -72.75F, 1, 3, 34, -0.2F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 43, 80, 0.2F, -39.75F, -32.95F, 1, 1, 1, 0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 25, 92, 0.2F, -37.75F, -32.75F, 1, 1, 2, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 18, 11, 0.2F, -39.75F, -73.35F, 1, 3, 1, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 0, 11, -4.2F, -39.75F, -73.35F, 1, 3, 1, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 172, 77, 0.2F, -37.75F, -72.75F, 1, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 19, 101, 0.0F, -42.0784F, -73.3284F, 1, 5, 1, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 124, 62, 0.0F, -42.5784F, -39.5784F, 1, 3, 6, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 74, 56, 0.0F, -42.5784F, -58.3784F, 1, 1, 4, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 25, 68, 0.0F, -42.5784F, -65.5784F, 1, 1, 3, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 74, 51, 0.0F, -42.5784F, -73.33F, 1, 1, 4, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 62, 11, -4.0F, -42.5784F, -73.33F, 1, 1, 4, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 61, 63, -4.0F, -42.5784F, -58.3784F, 1, 1, 4, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 50, 67, -4.0F, -42.5784F, -65.5784F, 1, 1, 3, -0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 100, 20, 0.0F, -42.0784F, -58.3284F, 1, 1, 19, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 140, 165, 0.0F, -39.9784F, -72.3284F, 1, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 105, 120, -4.2F, -39.75F, -39.75F, 1, 3, 7, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 74, 37, -4.2F, -39.75F, -32.95F, 1, 1, 1, 0.001F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 91, 69, -4.2F, -37.75F, -32.75F, 1, 1, 2, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 143, 43, -4.2F, -39.75F, -72.75F, 1, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 70, 146, -4.2F, -37.75F, -72.75F, 1, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 136, 127, -4.2F, -39.75F, -72.75F, 1, 3, 34, -0.2F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 105, 164, -4.0F, -39.9784F, -72.3284F, 1, 1, 33, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 49, 114, 0.0F, -42.0784F, -65.5784F, 1, 1, 4, 0.0F, false));
		long_guard_right3.cubeList.add(new ModelBox(long_guard_right3, 43, 113, 0.0F, -42.0784F, -72.5784F, 1, 1, 4, 0.0F, false));

		long_guard_right8_r1 = new ModelRenderer(this);
		long_guard_right8_r1.setRotationPoint(-4.0F, -41.0784F, -69.5284F);
		long_guard_right3.addChild(long_guard_right8_r1);
		setRotationAngle(long_guard_right8_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right8_r1.cubeList.add(new ModelBox(long_guard_right8_r1, 29, 101, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right8_r1.cubeList.add(new ModelBox(long_guard_right8_r1, 36, 101, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right6_r1 = new ModelRenderer(this);
		long_guard_right6_r1.setRotationPoint(-4.0F, -41.0784F, -65.5284F);
		long_guard_right3.addChild(long_guard_right6_r1);
		setRotationAngle(long_guard_right6_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right6_r1.cubeList.add(new ModelBox(long_guard_right6_r1, 23, 101, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right6_r1.cubeList.add(new ModelBox(long_guard_right6_r1, 86, 103, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right7_r1 = new ModelRenderer(this);
		long_guard_right7_r1.setRotationPoint(-4.0F, -41.0784F, -62.5284F);
		long_guard_right3.addChild(long_guard_right7_r1);
		setRotationAngle(long_guard_right7_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right7_r1.cubeList.add(new ModelBox(long_guard_right7_r1, 100, 79, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right7_r1.cubeList.add(new ModelBox(long_guard_right7_r1, 71, 103, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right11_r1 = new ModelRenderer(this);
		long_guard_right11_r1.setRotationPoint(-4.0F, -41.0784F, -40.3284F);
		long_guard_right3.addChild(long_guard_right11_r1);
		setRotationAngle(long_guard_right11_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right11_r1.cubeList.add(new ModelBox(long_guard_right11_r1, 100, 52, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));
		long_guard_right11_r1.cubeList.add(new ModelBox(long_guard_right11_r1, 104, 43, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right10_r1 = new ModelRenderer(this);
		long_guard_right10_r1.setRotationPoint(-4.0F, -41.0784F, -43.3284F);
		long_guard_right3.addChild(long_guard_right10_r1);
		setRotationAngle(long_guard_right10_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right10_r1.cubeList.add(new ModelBox(long_guard_right10_r1, 44, 95, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right10_r1.cubeList.add(new ModelBox(long_guard_right10_r1, 37, 107, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right9_r1 = new ModelRenderer(this);
		long_guard_right9_r1.setRotationPoint(-4.0F, -41.0784F, -46.3284F);
		long_guard_right3.addChild(long_guard_right9_r1);
		setRotationAngle(long_guard_right9_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right9_r1.cubeList.add(new ModelBox(long_guard_right9_r1, 93, 79, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right9_r1.cubeList.add(new ModelBox(long_guard_right9_r1, 107, 52, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right8_r2 = new ModelRenderer(this);
		long_guard_right8_r2.setRotationPoint(-4.0F, -41.0784F, -49.3284F);
		long_guard_right3.addChild(long_guard_right8_r2);
		setRotationAngle(long_guard_right8_r2, 0.4189F, 0.0F, 0.0F);
		long_guard_right8_r2.cubeList.add(new ModelBox(long_guard_right8_r2, 93, 74, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right8_r2.cubeList.add(new ModelBox(long_guard_right8_r2, 79, 109, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right7_r2 = new ModelRenderer(this);
		long_guard_right7_r2.setRotationPoint(-4.0F, -41.0784F, -52.3284F);
		long_guard_right3.addChild(long_guard_right7_r2);
		setRotationAngle(long_guard_right7_r2, 0.4189F, 0.0F, 0.0F);
		long_guard_right7_r2.cubeList.add(new ModelBox(long_guard_right7_r2, 93, 56, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right7_r2.cubeList.add(new ModelBox(long_guard_right7_r2, 86, 109, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right6_r2 = new ModelRenderer(this);
		long_guard_right6_r2.setRotationPoint(-4.0F, -41.0784F, -55.3284F);
		long_guard_right3.addChild(long_guard_right6_r2);
		setRotationAngle(long_guard_right6_r2, 0.4189F, 0.0F, 0.0F);
		long_guard_right6_r2.cubeList.add(new ModelBox(long_guard_right6_r2, 93, 52, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right6_r2.cubeList.add(new ModelBox(long_guard_right6_r2, 94, 109, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right5_r1 = new ModelRenderer(this);
		long_guard_right5_r1.setRotationPoint(-4.0F, -41.0784F, -58.3284F);
		long_guard_right3.addChild(long_guard_right5_r1);
		setRotationAngle(long_guard_right5_r1, 0.4189F, 0.0F, 0.0F);
		long_guard_right5_r1.cubeList.add(new ModelBox(long_guard_right5_r1, 43, 92, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right5_r1.cubeList.add(new ModelBox(long_guard_right5_r1, 19, 110, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right5_r2 = new ModelRenderer(this);
		long_guard_right5_r2.setRotationPoint(-4.0F, -42.5784F, -33.5784F);
		long_guard_right3.addChild(long_guard_right5_r2);
		setRotationAngle(long_guard_right5_r2, 0.5236F, 0.0F, 0.0F);
		long_guard_right5_r2.cubeList.add(new ModelBox(long_guard_right5_r2, 53, 11, 0.0F, 0.0F, -2.0F, 1, 5, 2, -0.002F, false));
		long_guard_right5_r2.cubeList.add(new ModelBox(long_guard_right5_r2, 92, 86, 0.0F, 3.5F, -2.2F, 1, 2, 2, 0.199F, false));
		long_guard_right5_r2.cubeList.add(new ModelBox(long_guard_right5_r2, 100, 0, 4.0F, 3.5F, -2.2F, 1, 2, 2, 0.199F, false));
		long_guard_right5_r2.cubeList.add(new ModelBox(long_guard_right5_r2, 0, 62, 4.0F, 0.0F, -2.0F, 1, 5, 2, -0.002F, false));

		long_guard_right9_r2 = new ModelRenderer(this);
		long_guard_right9_r2.setRotationPoint(-4.0F, -42.5784F, -58.3784F);
		long_guard_right3.addChild(long_guard_right9_r2);
		setRotationAngle(long_guard_right9_r2, 0.5411F, 0.0F, 0.9599F);
		long_guard_right9_r2.cubeList.add(new ModelBox(long_guard_right9_r2, 112, 49, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right6_r3 = new ModelRenderer(this);
		long_guard_right6_r3.setRotationPoint(-4.0F, -42.5784F, -58.3784F);
		long_guard_right3.addChild(long_guard_right6_r3);
		setRotationAngle(long_guard_right6_r3, 0.0F, 0.0F, 0.9599F);
		long_guard_right6_r3.cubeList.add(new ModelBox(long_guard_right6_r3, 25, 0, 0.0F, -2.0F, 0.0F, 1, 2, 4, -0.001F, false));
		long_guard_right6_r3.cubeList.add(new ModelBox(long_guard_right6_r3, 12, 11, 0.0F, -2.0F, -14.9516F, 1, 2, 4, -0.001F, false));
		long_guard_right6_r3.cubeList.add(new ModelBox(long_guard_right6_r3, 24, 26, 0.0F, -2.5F, -11.0F, 1, 1, 11, -0.003F, false));
		long_guard_right6_r3.cubeList.add(new ModelBox(long_guard_right6_r3, 63, 0, 0.0F, -2.0F, -7.2F, 1, 2, 3, -0.001F, false));

		long_guard_right9_r3 = new ModelRenderer(this);
		long_guard_right9_r3.setRotationPoint(-4.0F, -42.5784F, -68.5784F);
		long_guard_right3.addChild(long_guard_right9_r3);
		setRotationAngle(long_guard_right9_r3, 0.384F, 0.0F, 0.9599F);
		long_guard_right9_r3.cubeList.add(new ModelBox(long_guard_right9_r3, 111, 96, 0.0F, -2.2F, -1.0F, 1, 2, 1, -0.002F, false));

		long_guard_right8_r3 = new ModelRenderer(this);
		long_guard_right8_r3.setRotationPoint(-4.0F, -42.5784F, -65.5784F);
		long_guard_right3.addChild(long_guard_right8_r3);
		setRotationAngle(long_guard_right8_r3, 0.5411F, 0.0F, 0.9599F);
		long_guard_right8_r3.cubeList.add(new ModelBox(long_guard_right8_r3, 0, 111, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right8_r4 = new ModelRenderer(this);
		long_guard_right8_r4.setRotationPoint(-4.0F, -42.5784F, -61.5784F);
		long_guard_right3.addChild(long_guard_right8_r4);
		setRotationAngle(long_guard_right8_r4, 0.384F, 0.0F, 0.9599F);
		long_guard_right8_r4.cubeList.add(new ModelBox(long_guard_right8_r4, 37, 110, 0.0F, -2.2F, -1.0F, 1, 2, 1, -0.002F, false));

		long_guard_right7_r3 = new ModelRenderer(this);
		long_guard_right7_r3.setRotationPoint(1.0F, -42.5784F, -73.5784F);
		long_guard_right3.addChild(long_guard_right7_r3);
		setRotationAngle(long_guard_right7_r3, 0.0F, 0.0F, -0.9599F);
		long_guard_right7_r3.cubeList.add(new ModelBox(long_guard_right7_r3, 0, 26, -1.0F, -2.0F, 0.2484F, 1, 2, 4, -0.001F, false));
		long_guard_right7_r3.cubeList.add(new ModelBox(long_guard_right7_r3, 25, 63, -1.0F, -2.0F, 8.0F, 1, 2, 3, -0.001F, false));
		long_guard_right7_r3.cubeList.add(new ModelBox(long_guard_right7_r3, 74, 51, -1.0F, -2.5F, 4.2F, 1, 1, 11, -0.003F, false));
		long_guard_right7_r3.cubeList.add(new ModelBox(long_guard_right7_r3, 12, 26, -1.0F, -2.0F, 15.2F, 1, 2, 4, -0.001F, false));

		long_guard_right8_r5 = new ModelRenderer(this);
		long_guard_right8_r5.setRotationPoint(1.0F, -42.5784F, -68.5784F);
		long_guard_right3.addChild(long_guard_right8_r5);
		setRotationAngle(long_guard_right8_r5, 0.384F, 0.0F, -0.9599F);
		long_guard_right8_r5.cubeList.add(new ModelBox(long_guard_right8_r5, 112, 68, -1.0F, -2.2F, -1.0F, 1, 2, 1, -0.002F, false));

		long_guard_right7_r4 = new ModelRenderer(this);
		long_guard_right7_r4.setRotationPoint(1.0F, -42.5784F, -61.5784F);
		long_guard_right3.addChild(long_guard_right7_r4);
		setRotationAngle(long_guard_right7_r4, 0.384F, 0.0F, -0.9599F);
		long_guard_right7_r4.cubeList.add(new ModelBox(long_guard_right7_r4, 112, 71, -1.0F, -2.2F, -1.0F, 1, 2, 1, -0.002F, false));

		long_guard_right8_r6 = new ModelRenderer(this);
		long_guard_right8_r6.setRotationPoint(1.0F, -42.5784F, -58.3784F);
		long_guard_right3.addChild(long_guard_right8_r6);
		setRotationAngle(long_guard_right8_r6, 0.5411F, 0.0F, -0.9599F);
		long_guard_right8_r6.cubeList.add(new ModelBox(long_guard_right8_r6, 112, 62, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right7_r5 = new ModelRenderer(this);
		long_guard_right7_r5.setRotationPoint(1.0F, -42.5784F, -65.5784F);
		long_guard_right3.addChild(long_guard_right7_r5);
		setRotationAngle(long_guard_right7_r5, 0.5411F, 0.0F, -0.9599F);
		long_guard_right7_r5.cubeList.add(new ModelBox(long_guard_right7_r5, 112, 65, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right12_r1 = new ModelRenderer(this);
		long_guard_right12_r1.setRotationPoint(-4.0F, -37.0784F, -41.2284F);
		long_guard_right3.addChild(long_guard_right12_r1);
		setRotationAngle(long_guard_right12_r1, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right12_r1.cubeList.add(new ModelBox(long_guard_right12_r1, 85, 63, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right11_r2 = new ModelRenderer(this);
		long_guard_right11_r2.setRotationPoint(-4.0F, -37.0784F, -43.3284F);
		long_guard_right3.addChild(long_guard_right11_r2);
		setRotationAngle(long_guard_right11_r2, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right11_r2.cubeList.add(new ModelBox(long_guard_right11_r2, 61, 85, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r2 = new ModelRenderer(this);
		long_guard_right10_r2.setRotationPoint(-4.0F, -37.0784F, -45.3284F);
		long_guard_right3.addChild(long_guard_right10_r2);
		setRotationAngle(long_guard_right10_r2, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right10_r2.cubeList.add(new ModelBox(long_guard_right10_r2, 44, 83, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r4 = new ModelRenderer(this);
		long_guard_right9_r4.setRotationPoint(-4.0F, -37.0784F, -47.3284F);
		long_guard_right3.addChild(long_guard_right9_r4);
		setRotationAngle(long_guard_right9_r4, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right9_r4.cubeList.add(new ModelBox(long_guard_right9_r4, 83, 42, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r7 = new ModelRenderer(this);
		long_guard_right8_r7.setRotationPoint(-4.0F, -37.0784F, -49.3284F);
		long_guard_right3.addChild(long_guard_right8_r7);
		setRotationAngle(long_guard_right8_r7, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right8_r7.cubeList.add(new ModelBox(long_guard_right8_r7, 81, 31, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r3 = new ModelRenderer(this);
		long_guard_right10_r3.setRotationPoint(-4.0F, -37.0784F, -51.3284F);
		long_guard_right3.addChild(long_guard_right10_r3);
		setRotationAngle(long_guard_right10_r3, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right10_r3.cubeList.add(new ModelBox(long_guard_right10_r3, 81, 11, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r5 = new ModelRenderer(this);
		long_guard_right9_r5.setRotationPoint(-4.0F, -37.0784F, -53.3284F);
		long_guard_right3.addChild(long_guard_right9_r5);
		setRotationAngle(long_guard_right9_r5, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right9_r5.cubeList.add(new ModelBox(long_guard_right9_r5, 5, 81, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r8 = new ModelRenderer(this);
		long_guard_right8_r8.setRotationPoint(-4.0F, -37.0784F, -55.3284F);
		long_guard_right3.addChild(long_guard_right8_r8);
		setRotationAngle(long_guard_right8_r8, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right8_r8.cubeList.add(new ModelBox(long_guard_right8_r8, 80, 79, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r6 = new ModelRenderer(this);
		long_guard_right7_r6.setRotationPoint(-4.0F, -37.0784F, -57.3284F);
		long_guard_right3.addChild(long_guard_right7_r6);
		setRotationAngle(long_guard_right7_r6, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right7_r6.cubeList.add(new ModelBox(long_guard_right7_r6, 80, 74, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r6 = new ModelRenderer(this);
		long_guard_right9_r6.setRotationPoint(-4.0F, -37.0784F, -59.3284F);
		long_guard_right3.addChild(long_guard_right9_r6);
		setRotationAngle(long_guard_right9_r6, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right9_r6.cubeList.add(new ModelBox(long_guard_right9_r6, 80, 56, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r9 = new ModelRenderer(this);
		long_guard_right8_r9.setRotationPoint(-4.0F, -37.0784F, -61.3284F);
		long_guard_right3.addChild(long_guard_right8_r9);
		setRotationAngle(long_guard_right8_r9, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right8_r9.cubeList.add(new ModelBox(long_guard_right8_r9, 80, 51, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r7 = new ModelRenderer(this);
		long_guard_right7_r7.setRotationPoint(-4.0F, -37.0784F, -63.3284F);
		long_guard_right3.addChild(long_guard_right7_r7);
		setRotationAngle(long_guard_right7_r7, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right7_r7.cubeList.add(new ModelBox(long_guard_right7_r7, 74, 79, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right6_r4 = new ModelRenderer(this);
		long_guard_right6_r4.setRotationPoint(-4.0F, -37.0784F, -65.3284F);
		long_guard_right3.addChild(long_guard_right6_r4);
		setRotationAngle(long_guard_right6_r4, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right6_r4.cubeList.add(new ModelBox(long_guard_right6_r4, 79, 67, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r10 = new ModelRenderer(this);
		long_guard_right8_r10.setRotationPoint(-4.0F, -37.0784F, -67.3284F);
		long_guard_right3.addChild(long_guard_right8_r10);
		setRotationAngle(long_guard_right8_r10, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right8_r10.cubeList.add(new ModelBox(long_guard_right8_r10, 79, 63, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r8 = new ModelRenderer(this);
		long_guard_right7_r8.setRotationPoint(-4.0F, -37.0784F, -69.3284F);
		long_guard_right3.addChild(long_guard_right7_r8);
		setRotationAngle(long_guard_right7_r8, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right7_r8.cubeList.add(new ModelBox(long_guard_right7_r8, 79, 24, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right6_r5 = new ModelRenderer(this);
		long_guard_right6_r5.setRotationPoint(-4.0F, -37.0784F, -71.3284F);
		long_guard_right3.addChild(long_guard_right6_r5);
		setRotationAngle(long_guard_right6_r5, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right6_r5.cubeList.add(new ModelBox(long_guard_right6_r5, 79, 20, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right5_r3 = new ModelRenderer(this);
		long_guard_right5_r3.setRotationPoint(-4.0F, -37.0784F, -73.3284F);
		long_guard_right3.addChild(long_guard_right5_r3);
		setRotationAngle(long_guard_right5_r3, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right5_r3.cubeList.add(new ModelBox(long_guard_right5_r3, 79, 4, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r9 = new ModelRenderer(this);
		long_guard_right7_r9.setRotationPoint(1.0F, -37.0784F, -49.3284F);
		long_guard_right3.addChild(long_guard_right7_r9);
		setRotationAngle(long_guard_right7_r9, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right7_r9.cubeList.add(new ModelBox(long_guard_right7_r9, 17, 87, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r11 = new ModelRenderer(this);
		long_guard_right8_r11.setRotationPoint(1.0F, -37.0784F, -47.3284F);
		long_guard_right3.addChild(long_guard_right8_r11);
		setRotationAngle(long_guard_right8_r11, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right8_r11.cubeList.add(new ModelBox(long_guard_right8_r11, 11, 87, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r7 = new ModelRenderer(this);
		long_guard_right9_r7.setRotationPoint(1.0F, -37.0784F, -45.3284F);
		long_guard_right3.addChild(long_guard_right9_r7);
		setRotationAngle(long_guard_right9_r7, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right9_r7.cubeList.add(new ModelBox(long_guard_right9_r7, 85, 86, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right11_r3 = new ModelRenderer(this);
		long_guard_right11_r3.setRotationPoint(1.0F, -37.0784F, -41.2284F);
		long_guard_right3.addChild(long_guard_right11_r3);
		setRotationAngle(long_guard_right11_r3, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right11_r3.cubeList.add(new ModelBox(long_guard_right11_r3, 67, 85, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r4 = new ModelRenderer(this);
		long_guard_right10_r4.setRotationPoint(1.0F, -37.0784F, -43.3284F);
		long_guard_right3.addChild(long_guard_right10_r4);
		setRotationAngle(long_guard_right10_r4, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right10_r4.cubeList.add(new ModelBox(long_guard_right10_r4, 44, 86, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right6_r6 = new ModelRenderer(this);
		long_guard_right6_r6.setRotationPoint(1.0F, -37.0784F, -57.3284F);
		long_guard_right3.addChild(long_guard_right6_r6);
		setRotationAngle(long_guard_right6_r6, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right6_r6.cubeList.add(new ModelBox(long_guard_right6_r6, 87, 74, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r10 = new ModelRenderer(this);
		long_guard_right7_r10.setRotationPoint(1.0F, -37.0784F, -55.3284F);
		long_guard_right3.addChild(long_guard_right7_r10);
		setRotationAngle(long_guard_right7_r10, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right7_r10.cubeList.add(new ModelBox(long_guard_right7_r10, 87, 56, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r12 = new ModelRenderer(this);
		long_guard_right8_r12.setRotationPoint(1.0F, -37.0784F, -53.3284F);
		long_guard_right3.addChild(long_guard_right8_r12);
		setRotationAngle(long_guard_right8_r12, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right8_r12.cubeList.add(new ModelBox(long_guard_right8_r12, 87, 51, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r8 = new ModelRenderer(this);
		long_guard_right9_r8.setRotationPoint(1.0F, -37.0784F, -51.3284F);
		long_guard_right3.addChild(long_guard_right9_r8);
		setRotationAngle(long_guard_right9_r8, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right9_r8.cubeList.add(new ModelBox(long_guard_right9_r8, 37, 87, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right5_r4 = new ModelRenderer(this);
		long_guard_right5_r4.setRotationPoint(1.0F, -37.0784F, -65.3284F);
		long_guard_right3.addChild(long_guard_right5_r4);
		setRotationAngle(long_guard_right5_r4, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right5_r4.cubeList.add(new ModelBox(long_guard_right5_r4, 90, 42, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right6_r7 = new ModelRenderer(this);
		long_guard_right6_r7.setRotationPoint(1.0F, -37.0784F, -63.3284F);
		long_guard_right3.addChild(long_guard_right6_r7);
		setRotationAngle(long_guard_right6_r7, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right6_r7.cubeList.add(new ModelBox(long_guard_right6_r7, 90, 25, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r11 = new ModelRenderer(this);
		long_guard_right7_r11.setRotationPoint(1.0F, -37.0784F, -61.3284F);
		long_guard_right3.addChild(long_guard_right7_r11);
		setRotationAngle(long_guard_right7_r11, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right7_r11.cubeList.add(new ModelBox(long_guard_right7_r11, 55, 89, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r13 = new ModelRenderer(this);
		long_guard_right8_r13.setRotationPoint(1.0F, -37.0784F, -59.3284F);
		long_guard_right3.addChild(long_guard_right8_r13);
		setRotationAngle(long_guard_right8_r13, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right8_r13.cubeList.add(new ModelBox(long_guard_right8_r13, 87, 79, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r12 = new ModelRenderer(this);
		long_guard_right7_r12.setRotationPoint(1.0F, -37.0784F, -67.3284F);
		long_guard_right3.addChild(long_guard_right7_r12);
		setRotationAngle(long_guard_right7_r12, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right7_r12.cubeList.add(new ModelBox(long_guard_right7_r12, 67, 90, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right6_r8 = new ModelRenderer(this);
		long_guard_right6_r8.setRotationPoint(1.0F, -37.0784F, -69.3284F);
		long_guard_right3.addChild(long_guard_right6_r8);
		setRotationAngle(long_guard_right6_r8, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right6_r8.cubeList.add(new ModelBox(long_guard_right6_r8, 79, 90, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right5_r5 = new ModelRenderer(this);
		long_guard_right5_r5.setRotationPoint(1.0F, -37.0784F, -71.3284F);
		long_guard_right3.addChild(long_guard_right5_r5);
		setRotationAngle(long_guard_right5_r5, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right5_r5.cubeList.add(new ModelBox(long_guard_right5_r5, 5, 91, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right4_r1 = new ModelRenderer(this);
		long_guard_right4_r1.setRotationPoint(1.0F, -37.0784F, -73.3284F);
		long_guard_right3.addChild(long_guard_right4_r1);
		setRotationAngle(long_guard_right4_r1, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right4_r1.cubeList.add(new ModelBox(long_guard_right4_r1, 17, 92, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		bone129 = new ModelRenderer(this);
		bone129.setRotationPoint(0.5F, -35.25F, -34.75F);
		long_guard_right3.addChild(bone129);
		setRotationAngle(bone129, 0.0F, 0.0F, 0.7854F);
		bone129.cubeList.add(new ModelBox(bone129, 0, 87, -1.0F, -0.7071F, -5.0F, 1, 1, 9, -0.001F, false));
		bone129.cubeList.add(new ModelBox(bone129, 129, 85, -1.0F, -0.2929F, -37.0F, 1, 1, 41, 0.0F, false));
		bone129.cubeList.add(new ModelBox(bone129, 86, 104, -3.1213F, 1.8284F, -37.0F, 1, 1, 41, 0.0F, false));

		handguard_lower13 = new ModelRenderer(this);
		handguard_lower13.setRotationPoint(0.0F, 0.0F, 0.0F);
		long_guard_right3.addChild(handguard_lower13);
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 104, 58, 0.2F, -38.75F, -45.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 104, 49, 0.2F, -38.75F, -52.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 104, 46, 0.2F, -38.75F, -59.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 36, 104, 0.2F, -38.75F, -66.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 76, 45, -4.2F, -38.75F, -45.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 78, 17, -4.2F, -38.75F, -52.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 78, 37, -4.2F, -38.75F, -66.5F, 1, 1, 1, 0.0F, false));
		handguard_lower13.cubeList.add(new ModelBox(handguard_lower13, 36, 80, -4.2F, -38.75F, -59.5F, 1, 1, 1, 0.0F, false));

		handguard_normalboi3 = new ModelRenderer(this);
		handguard_normalboi3.setRotationPoint(-3.0F, 0.0F, 0.0F);
		handguard.addChild(handguard_normalboi3);
		

		long_guard_left4 = new ModelRenderer(this);
		long_guard_left4.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard_normalboi3.addChild(long_guard_left4);
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 9, 101, -1.5F, -39.25F, -37.75F, 1, 2, 2, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 0, 101, -1.5F, -39.25F, -34.0F, 1, 2, 2, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 19, 115, -1.0F, -39.75F, -39.575F, 1, 2, 1, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 97, 42, -1.0F, -42.0784F, -73.3284F, 1, 5, 1, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 121, 30, -1.0F, -42.5784F, -39.5784F, 1, 3, 6, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 100, 0, -1.0F, -42.0784F, -58.3284F, 1, 1, 19, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 73, 112, -1.0F, -42.0784F, -65.5784F, 1, 1, 4, 0.0F, false));
		long_guard_left4.cubeList.add(new ModelBox(long_guard_left4, 31, 110, -1.0F, -42.0784F, -72.5784F, 1, 1, 4, 0.0F, false));

		bone213 = new ModelRenderer(this);
		bone213.setRotationPoint(-0.5F, -35.25F, -34.75F);
		long_guard_left4.addChild(bone213);
		setRotationAngle(bone213, 0.0F, 0.0F, -0.7854F);
		bone213.cubeList.add(new ModelBox(bone213, 74, 86, 0.0F, -0.7071F, -5.0F, 1, 1, 9, -0.001F, false));

		handguard_short = new QRenderer(this);
		handguard_short.setRotationPoint(0.0F, 24.7F, 4.7F);
		

		handguard_normalboi4 = new ModelRenderer(this);
		handguard_normalboi4.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard_short.addChild(handguard_normalboi4);
		

		long_guard_right2 = new ModelRenderer(this);
		long_guard_right2.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard_normalboi4.addChild(long_guard_right2);
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 74, 0, 0.0F, -37.75F, -39.75F, 1, 2, 9, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 25, 63, -4.0F, -37.75F, -39.75F, 1, 2, 9, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 0, 92, 0.5F, -39.25F, -37.75F, 1, 2, 2, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 74, 91, 0.5F, -39.25F, -34.0F, 1, 2, 2, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 36, 145, -3.0F, -35.75F, -60.75F, 3, 1, 30, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 25, 87, -2.5F, -44.0F, -62.375F, 2, 1, 8, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 155, 199, 0.2F, -39.75F, -61.75F, 1, 1, 22, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 43, 103, 0.2F, -39.75F, -39.75F, 1, 3, 7, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 0, 51, 0.2F, -39.75F, -61.75F, 1, 3, 23, -0.2F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 74, 34, 0.2F, -39.75F, -32.95F, 1, 1, 1, 0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 85, 69, 0.2F, -37.75F, -32.75F, 1, 1, 2, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 18, 0, 0.2F, -39.75F, -62.35F, 1, 3, 1, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 6, 11, -4.2F, -39.75F, -62.35F, 1, 3, 1, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 109, 199, 0.2F, -37.75F, -61.75F, 1, 1, 22, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 44, 62, 0.0F, -42.0784F, -62.3284F, 1, 5, 1, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 43, 120, 0.0F, -42.5784F, -39.5784F, 1, 3, 6, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 38, 6, 0.0F, -42.5784F, -58.3784F, 1, 1, 4, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 74, 17, 0.0F, -42.5784F, -62.33F, 1, 1, 1, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 25, 6, -4.0F, -42.5784F, -58.3784F, 1, 1, 4, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 53, 20, 0.0F, -42.0784F, -58.3284F, 1, 1, 19, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 85, 198, 0.0F, -39.9784F, -61.3284F, 1, 1, 22, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 0, 101, -4.2F, -39.75F, -39.75F, 1, 3, 7, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 74, 14, -4.2F, -39.75F, -32.95F, 1, 1, 1, 0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 85, 26, -4.2F, -37.75F, -32.75F, 1, 1, 2, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 50, 74, -4.2F, -39.75F, -61.75F, 1, 1, 22, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 50, 51, -4.2F, -37.75F, -61.75F, 1, 1, 22, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 0, 0, -4.2F, -39.75F, -61.75F, 1, 3, 23, -0.2F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 0, 26, -4.0F, -39.9784F, -61.3284F, 1, 1, 22, 0.0F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 12, 11, 0.0F, -42.0784F, -61.5784F, 1, 3, 1, 0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 12, 0, -4.0F, -42.0784F, -61.5784F, 1, 3, 1, 0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 54, 51, -4.0F, -42.5784F, -62.33F, 1, 1, 1, -0.001F, false));
		long_guard_right2.cubeList.add(new ModelBox(long_guard_right2, 6, 51, -4.0F, -42.0784F, -62.3284F, 1, 5, 1, 0.0F, false));

		long_guard_right9_r9 = new ModelRenderer(this);
		long_guard_right9_r9.setRotationPoint(-4.0F, -41.0784F, -61.5284F);
		long_guard_right2.addChild(long_guard_right9_r9);
		setRotationAngle(long_guard_right9_r9, 0.4189F, 0.0F, 0.0F);
		long_guard_right9_r9.cubeList.add(new ModelBox(long_guard_right9_r9, 24, 26, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right9_r9.cubeList.add(new ModelBox(long_guard_right9_r9, 53, 42, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right10_r5 = new ModelRenderer(this);
		long_guard_right10_r5.setRotationPoint(-4.0F, -42.5784F, -60.5784F);
		long_guard_right2.addChild(long_guard_right10_r5);
		setRotationAngle(long_guard_right10_r5, 0.384F, 0.0F, 0.9599F);
		long_guard_right10_r5.cubeList.add(new ModelBox(long_guard_right10_r5, 18, 26, 0.0F, -2.2F, -1.0F, 1, 2, 1, -0.002F, false));

		long_guard_right9_r10 = new ModelRenderer(this);
		long_guard_right9_r10.setRotationPoint(-4.0F, -42.5784F, -65.5784F);
		long_guard_right2.addChild(long_guard_right9_r10);
		setRotationAngle(long_guard_right9_r10, 0.0F, 0.0F, 0.9599F);
		long_guard_right9_r10.cubeList.add(new ModelBox(long_guard_right9_r10, 19, 17, 0.0F, -2.0F, 3.2484F, 1, 2, 1, -0.001F, false));
		long_guard_right9_r10.cubeList.add(new ModelBox(long_guard_right9_r10, 0, 11, 0.0F, -2.0F, 7.2F, 1, 2, 4, -0.001F, false));
		long_guard_right9_r10.cubeList.add(new ModelBox(long_guard_right9_r10, 24, 32, 0.0F, -2.5F, 3.2F, 1, 1, 4, -0.003F, false));

		long_guard_right12_r2 = new ModelRenderer(this);
		long_guard_right12_r2.setRotationPoint(-4.0F, -41.0784F, -40.3284F);
		long_guard_right2.addChild(long_guard_right12_r2);
		setRotationAngle(long_guard_right12_r2, 0.4189F, 0.0F, 0.0F);
		long_guard_right12_r2.cubeList.add(new ModelBox(long_guard_right12_r2, 31, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));
		long_guard_right12_r2.cubeList.add(new ModelBox(long_guard_right12_r2, 18, 37, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right11_r4 = new ModelRenderer(this);
		long_guard_right11_r4.setRotationPoint(-4.0F, -41.0784F, -43.3284F);
		long_guard_right2.addChild(long_guard_right11_r4);
		setRotationAngle(long_guard_right11_r4, 0.4189F, 0.0F, 0.0F);
		long_guard_right11_r4.cubeList.add(new ModelBox(long_guard_right11_r4, 31, 6, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right11_r4.cubeList.add(new ModelBox(long_guard_right11_r4, 38, 0, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right10_r6 = new ModelRenderer(this);
		long_guard_right10_r6.setRotationPoint(-4.0F, -41.0784F, -46.3284F);
		long_guard_right2.addChild(long_guard_right10_r6);
		setRotationAngle(long_guard_right10_r6, 0.4189F, 0.0F, 0.0F);
		long_guard_right10_r6.cubeList.add(new ModelBox(long_guard_right10_r6, 24, 32, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right10_r6.cubeList.add(new ModelBox(long_guard_right10_r6, 38, 6, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right9_r11 = new ModelRenderer(this);
		long_guard_right9_r11.setRotationPoint(-4.0F, -41.0784F, -49.3284F);
		long_guard_right2.addChild(long_guard_right9_r11);
		setRotationAngle(long_guard_right9_r11, 0.4189F, 0.0F, 0.0F);
		long_guard_right9_r11.cubeList.add(new ModelBox(long_guard_right9_r11, 30, 32, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right9_r11.cubeList.add(new ModelBox(long_guard_right9_r11, 29, 38, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right8_r14 = new ModelRenderer(this);
		long_guard_right8_r14.setRotationPoint(-4.0F, -41.0784F, -52.3284F);
		long_guard_right2.addChild(long_guard_right8_r14);
		setRotationAngle(long_guard_right8_r14, 0.4189F, 0.0F, 0.0F);
		long_guard_right8_r14.cubeList.add(new ModelBox(long_guard_right8_r14, 0, 37, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right8_r14.cubeList.add(new ModelBox(long_guard_right8_r14, 44, 0, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right7_r13 = new ModelRenderer(this);
		long_guard_right7_r13.setRotationPoint(-4.0F, -41.0784F, -55.3284F);
		long_guard_right2.addChild(long_guard_right7_r13);
		setRotationAngle(long_guard_right7_r13, 0.4189F, 0.0F, 0.0F);
		long_guard_right7_r13.cubeList.add(new ModelBox(long_guard_right7_r13, 6, 37, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right7_r13.cubeList.add(new ModelBox(long_guard_right7_r13, 44, 6, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right6_r9 = new ModelRenderer(this);
		long_guard_right6_r9.setRotationPoint(-4.0F, -41.0784F, -58.3284F);
		long_guard_right2.addChild(long_guard_right6_r9);
		setRotationAngle(long_guard_right6_r9, 0.4189F, 0.0F, 0.0F);
		long_guard_right6_r9.cubeList.add(new ModelBox(long_guard_right6_r9, 12, 37, 0.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));
		long_guard_right6_r9.cubeList.add(new ModelBox(long_guard_right6_r9, 6, 57, 4.0F, 0.0F, 0.0F, 1, 2, 1, -0.001F, false));

		long_guard_right6_r10 = new ModelRenderer(this);
		long_guard_right6_r10.setRotationPoint(-4.0F, -42.5784F, -33.5784F);
		long_guard_right2.addChild(long_guard_right6_r10);
		setRotationAngle(long_guard_right6_r10, 0.5236F, 0.0F, 0.0F);
		long_guard_right6_r10.cubeList.add(new ModelBox(long_guard_right6_r10, 50, 51, 0.0F, 0.0F, -2.0F, 1, 5, 2, -0.002F, false));
		long_guard_right6_r10.cubeList.add(new ModelBox(long_guard_right6_r10, 50, 90, 0.0F, 3.5F, -2.2F, 1, 2, 2, 0.199F, false));
		long_guard_right6_r10.cubeList.add(new ModelBox(long_guard_right6_r10, 61, 90, 4.0F, 3.5F, -2.2F, 1, 2, 2, 0.199F, false));
		long_guard_right6_r10.cubeList.add(new ModelBox(long_guard_right6_r10, 53, 0, 4.0F, 0.0F, -2.0F, 1, 5, 2, -0.002F, false));

		long_guard_right10_r7 = new ModelRenderer(this);
		long_guard_right10_r7.setRotationPoint(-4.0F, -42.5784F, -58.3784F);
		long_guard_right2.addChild(long_guard_right10_r7);
		setRotationAngle(long_guard_right10_r7, 0.5411F, 0.0F, 0.9599F);
		long_guard_right10_r7.cubeList.add(new ModelBox(long_guard_right10_r7, 62, 11, 0.0F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right8_r15 = new ModelRenderer(this);
		long_guard_right8_r15.setRotationPoint(1.0F, -42.5784F, -65.5784F);
		long_guard_right2.addChild(long_guard_right8_r15);
		setRotationAngle(long_guard_right8_r15, 0.0F, 0.0F, -0.9599F);
		long_guard_right8_r15.cubeList.add(new ModelBox(long_guard_right8_r15, 30, 63, -1.0F, -2.0F, 3.2484F, 1, 2, 1, -0.001F, false));
		long_guard_right8_r15.cubeList.add(new ModelBox(long_guard_right8_r15, 50, 63, -1.0F, -2.5F, 4.2F, 1, 1, 3, -0.003F, false));
		long_guard_right8_r15.cubeList.add(new ModelBox(long_guard_right8_r15, 12, 0, -1.0F, -2.0F, 7.2F, 1, 2, 4, -0.001F, false));

		long_guard_right9_r12 = new ModelRenderer(this);
		long_guard_right9_r12.setRotationPoint(1.0F, -42.5784F, -60.5784F);
		long_guard_right2.addChild(long_guard_right9_r12);
		setRotationAngle(long_guard_right9_r12, 0.384F, 0.0F, -0.9599F);
		long_guard_right9_r12.cubeList.add(new ModelBox(long_guard_right9_r12, 36, 63, -1.0F, -2.2F, -1.0F, 1, 2, 1, -0.002F, false));

		long_guard_right9_r13 = new ModelRenderer(this);
		long_guard_right9_r13.setRotationPoint(1.0F, -42.5784F, -58.3784F);
		long_guard_right2.addChild(long_guard_right9_r13);
		setRotationAngle(long_guard_right9_r13, 0.5411F, 0.0F, -0.9599F);
		long_guard_right9_r13.cubeList.add(new ModelBox(long_guard_right9_r13, 63, 42, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.002F, false));

		long_guard_right13_r1 = new ModelRenderer(this);
		long_guard_right13_r1.setRotationPoint(-4.0F, -37.0784F, -41.2284F);
		long_guard_right2.addChild(long_guard_right13_r1);
		setRotationAngle(long_guard_right13_r1, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right13_r1.cubeList.add(new ModelBox(long_guard_right13_r1, 55, 63, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right12_r3 = new ModelRenderer(this);
		long_guard_right12_r3.setRotationPoint(-4.0F, -37.0784F, -43.3284F);
		long_guard_right2.addChild(long_guard_right12_r3);
		setRotationAngle(long_guard_right12_r3, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right12_r3.cubeList.add(new ModelBox(long_guard_right12_r3, 61, 63, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right11_r5 = new ModelRenderer(this);
		long_guard_right11_r5.setRotationPoint(-4.0F, -37.0784F, -45.3284F);
		long_guard_right2.addChild(long_guard_right11_r5);
		setRotationAngle(long_guard_right11_r5, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right11_r5.cubeList.add(new ModelBox(long_guard_right11_r5, 55, 67, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r8 = new ModelRenderer(this);
		long_guard_right10_r8.setRotationPoint(-4.0F, -37.0784F, -47.3284F);
		long_guard_right2.addChild(long_guard_right10_r8);
		setRotationAngle(long_guard_right10_r8, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right10_r8.cubeList.add(new ModelBox(long_guard_right10_r8, 67, 63, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r14 = new ModelRenderer(this);
		long_guard_right9_r14.setRotationPoint(-4.0F, -37.0784F, -49.3284F);
		long_guard_right2.addChild(long_guard_right9_r14);
		setRotationAngle(long_guard_right9_r14, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right9_r14.cubeList.add(new ModelBox(long_guard_right9_r14, 68, 0, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right11_r6 = new ModelRenderer(this);
		long_guard_right11_r6.setRotationPoint(-4.0F, -37.0784F, -51.3284F);
		long_guard_right2.addChild(long_guard_right11_r6);
		setRotationAngle(long_guard_right11_r6, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right11_r6.cubeList.add(new ModelBox(long_guard_right11_r6, 68, 11, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r9 = new ModelRenderer(this);
		long_guard_right10_r9.setRotationPoint(-4.0F, -37.0784F, -53.3284F);
		long_guard_right2.addChild(long_guard_right10_r9);
		setRotationAngle(long_guard_right10_r9, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right10_r9.cubeList.add(new ModelBox(long_guard_right10_r9, 30, 68, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r15 = new ModelRenderer(this);
		long_guard_right9_r15.setRotationPoint(-4.0F, -37.0784F, -55.3284F);
		long_guard_right2.addChild(long_guard_right9_r15);
		setRotationAngle(long_guard_right9_r15, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right9_r15.cubeList.add(new ModelBox(long_guard_right9_r15, 69, 42, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r16 = new ModelRenderer(this);
		long_guard_right8_r16.setRotationPoint(-4.0F, -37.0784F, -57.3284F);
		long_guard_right2.addChild(long_guard_right8_r16);
		setRotationAngle(long_guard_right8_r16, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right8_r16.cubeList.add(new ModelBox(long_guard_right8_r16, 74, 11, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r10 = new ModelRenderer(this);
		long_guard_right10_r10.setRotationPoint(-4.0F, -37.0784F, -59.3284F);
		long_guard_right2.addChild(long_guard_right10_r10);
		setRotationAngle(long_guard_right10_r10, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right10_r10.cubeList.add(new ModelBox(long_guard_right10_r10, 74, 31, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r16 = new ModelRenderer(this);
		long_guard_right9_r16.setRotationPoint(-4.0F, -37.0784F, -61.3284F);
		long_guard_right2.addChild(long_guard_right9_r16);
		setRotationAngle(long_guard_right9_r16, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right9_r16.cubeList.add(new ModelBox(long_guard_right9_r16, 74, 51, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r17 = new ModelRenderer(this);
		long_guard_right8_r17.setRotationPoint(-4.0F, -37.0784F, -62.6284F);
		long_guard_right2.addChild(long_guard_right8_r17);
		setRotationAngle(long_guard_right8_r17, 0.6288F, 0.0333F, -0.2791F);
		long_guard_right8_r17.cubeList.add(new ModelBox(long_guard_right8_r17, 55, 74, -0.1F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r18 = new ModelRenderer(this);
		long_guard_right8_r18.setRotationPoint(1.0F, -37.0784F, -49.3284F);
		long_guard_right2.addChild(long_guard_right8_r18);
		setRotationAngle(long_guard_right8_r18, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right8_r18.cubeList.add(new ModelBox(long_guard_right8_r18, 74, 56, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r17 = new ModelRenderer(this);
		long_guard_right9_r17.setRotationPoint(1.0F, -37.0784F, -47.3284F);
		long_guard_right2.addChild(long_guard_right9_r17);
		setRotationAngle(long_guard_right9_r17, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right9_r17.cubeList.add(new ModelBox(long_guard_right9_r17, 61, 74, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r11 = new ModelRenderer(this);
		long_guard_right10_r11.setRotationPoint(1.0F, -37.0784F, -45.3284F);
		long_guard_right2.addChild(long_guard_right10_r11);
		setRotationAngle(long_guard_right10_r11, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right10_r11.cubeList.add(new ModelBox(long_guard_right10_r11, 67, 74, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right12_r4 = new ModelRenderer(this);
		long_guard_right12_r4.setRotationPoint(1.0F, -37.0784F, -41.2284F);
		long_guard_right2.addChild(long_guard_right12_r4);
		setRotationAngle(long_guard_right12_r4, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right12_r4.cubeList.add(new ModelBox(long_guard_right12_r4, 74, 74, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right11_r7 = new ModelRenderer(this);
		long_guard_right11_r7.setRotationPoint(1.0F, -37.0784F, -43.3284F);
		long_guard_right2.addChild(long_guard_right11_r7);
		setRotationAngle(long_guard_right11_r7, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right11_r7.cubeList.add(new ModelBox(long_guard_right11_r7, 76, 42, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r14 = new ModelRenderer(this);
		long_guard_right7_r14.setRotationPoint(1.0F, -37.0784F, -57.3284F);
		long_guard_right2.addChild(long_guard_right7_r14);
		setRotationAngle(long_guard_right7_r14, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right7_r14.cubeList.add(new ModelBox(long_guard_right7_r14, 5, 77, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r19 = new ModelRenderer(this);
		long_guard_right8_r19.setRotationPoint(1.0F, -37.0784F, -55.3284F);
		long_guard_right2.addChild(long_guard_right8_r19);
		setRotationAngle(long_guard_right8_r19, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right8_r19.cubeList.add(new ModelBox(long_guard_right8_r19, 11, 77, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r18 = new ModelRenderer(this);
		long_guard_right9_r18.setRotationPoint(1.0F, -37.0784F, -53.3284F);
		long_guard_right2.addChild(long_guard_right9_r18);
		setRotationAngle(long_guard_right9_r18, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right9_r18.cubeList.add(new ModelBox(long_guard_right9_r18, 17, 77, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right10_r12 = new ModelRenderer(this);
		long_guard_right10_r12.setRotationPoint(1.0F, -37.0784F, -51.3284F);
		long_guard_right2.addChild(long_guard_right10_r12);
		setRotationAngle(long_guard_right10_r12, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right10_r12.cubeList.add(new ModelBox(long_guard_right10_r12, 36, 77, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right7_r15 = new ModelRenderer(this);
		long_guard_right7_r15.setRotationPoint(1.0F, -37.0784F, -62.6284F);
		long_guard_right2.addChild(long_guard_right7_r15);
		setRotationAngle(long_guard_right7_r15, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right7_r15.cubeList.add(new ModelBox(long_guard_right7_r15, 43, 77, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right8_r20 = new ModelRenderer(this);
		long_guard_right8_r20.setRotationPoint(1.0F, -37.0784F, -61.3284F);
		long_guard_right2.addChild(long_guard_right8_r20);
		setRotationAngle(long_guard_right8_r20, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right8_r20.cubeList.add(new ModelBox(long_guard_right8_r20, 55, 78, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		long_guard_right9_r19 = new ModelRenderer(this);
		long_guard_right9_r19.setRotationPoint(1.0F, -37.0784F, -59.3284F);
		long_guard_right2.addChild(long_guard_right9_r19);
		setRotationAngle(long_guard_right9_r19, 0.6288F, -0.0333F, 0.2791F);
		long_guard_right9_r19.cubeList.add(new ModelBox(long_guard_right9_r19, 79, 0, -0.9F, 0.4F, 0.0F, 1, 2, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.5F, -35.25F, -34.75F);
		long_guard_right2.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, 0.7854F);
		bone10.cubeList.add(new ModelBox(bone10, 74, 63, -1.0F, -0.7071F, -5.0F, 1, 1, 9, -0.001F, false));
		bone10.cubeList.add(new ModelBox(bone10, 178, 34, -1.0F, -0.2929F, -26.0F, 1, 1, 30, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 175, 164, -3.1213F, 1.8284F, -26.0F, 1, 1, 30, 0.0F, false));

		handguard_lower2 = new ModelRenderer(this);
		handguard_lower2.setRotationPoint(0.0F, 0.0F, 0.0F);
		long_guard_right2.addChild(handguard_lower2);
		handguard_lower2.cubeList.add(new ModelBox(handguard_lower2, 69, 45, 0.2F, -38.75F, -45.5F, 1, 1, 1, 0.0F, false));
		handguard_lower2.cubeList.add(new ModelBox(handguard_lower2, 5, 68, 0.2F, -38.75F, -52.5F, 1, 1, 1, 0.0F, false));
		handguard_lower2.cubeList.add(new ModelBox(handguard_lower2, 36, 66, 0.2F, -38.75F, -59.5F, 1, 1, 1, 0.0F, false));
		handguard_lower2.cubeList.add(new ModelBox(handguard_lower2, 4, 62, -4.2F, -38.75F, -45.5F, 1, 1, 1, 0.0F, false));
		handguard_lower2.cubeList.add(new ModelBox(handguard_lower2, 55, 57, -4.2F, -38.75F, -52.5F, 1, 1, 1, 0.0F, false));
		handguard_lower2.cubeList.add(new ModelBox(handguard_lower2, 57, 0, -4.2F, -38.75F, -59.5F, 1, 1, 1, 0.0F, false));

		handguard_normalboi5 = new ModelRenderer(this);
		handguard_normalboi5.setRotationPoint(-3.0F, 0.0F, 0.0F);
		handguard_short.addChild(handguard_normalboi5);
		

		long_guard_left2 = new ModelRenderer(this);
		long_guard_left2.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard_normalboi5.addChild(long_guard_left2);
		long_guard_left2.cubeList.add(new ModelBox(long_guard_left2, 88, 31, -1.5F, -39.25F, -37.75F, 1, 2, 2, 0.0F, false));
		long_guard_left2.cubeList.add(new ModelBox(long_guard_left2, 88, 11, -1.5F, -39.25F, -34.0F, 1, 2, 2, 0.0F, false));
		long_guard_left2.cubeList.add(new ModelBox(long_guard_left2, 30, 26, -1.0F, -39.75F, -39.575F, 1, 2, 1, 0.0F, false));
		long_guard_left2.cubeList.add(new ModelBox(long_guard_left2, 117, 85, -1.0F, -42.5784F, -39.5784F, 1, 3, 6, 0.0F, false));
		long_guard_left2.cubeList.add(new ModelBox(long_guard_left2, 53, 0, -1.0F, -42.0784F, -58.3284F, 1, 1, 19, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-0.5F, -35.25F, -34.75F);
		long_guard_left2.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.7854F);
		bone11.cubeList.add(new ModelBox(bone11, 50, 63, 0.0F, -0.7071F, -5.0F, 1, 1, 9, -0.001F, false));

		stonk = new QRenderer(this);
		stonk.setRotationPoint(0.0F, 24.7F, 0.5F);
		stonk.cubeList.add(new ModelBox(stonk, 61, 51, -3.0F, -42.0F, 4.5F, 3, 4, 2, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 6, 26, 0.0F, -40.75F, 4.75F, 1, 3, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 82, 97, 0.0F, -42.0F, 4.75F, 1, 1, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 70, 97, 0.0F, -37.5F, 4.75F, 1, 1, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 0, 26, 0.0F, -40.75F, 5.25F, 1, 3, 1, -0.001F, false));
		stonk.cubeList.add(new ModelBox(stonk, 67, 31, -0.25F, -41.75F, 5.0F, 1, 5, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 86, 97, 0.0F, -42.0F, 5.25F, 1, 1, 1, -0.001F, false));
		stonk.cubeList.add(new ModelBox(stonk, 74, 97, 0.0F, -37.5F, 5.25F, 1, 1, 1, -0.001F, false));
		stonk.cubeList.add(new ModelBox(stonk, 78, 97, -0.5F, -37.5F, 5.25F, 1, 1, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 0, 143, -2.5F, -41.75F, 5.5F, 2, 1, 11, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 133, 85, -2.5F, -39.5F, 5.5F, 2, 1, 11, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 25, 0, -2.0F, -41.25F, 5.5F, 1, 2, 11, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 187, 195, -3.5F, -42.25F, 16.5F, 4, 4, 21, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 0, 77, -2.5F, -43.25F, 16.5F, 2, 1, 21, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 100, 62, -3.5F, -38.25F, 35.5F, 4, 13, 2, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 143, 0, -3.0F, -42.75F, 37.0F, 3, 17, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 53, 42, -3.0F, -37.1036F, 24.7322F, 3, 2, 4, -0.001F, false));
		stonk.cubeList.add(new ModelBox(stonk, 86, 109, -2.5F, -37.3536F, 22.4822F, 2, 2, 4, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 110, 20, -2.25F, -39.0F, 4.25F, 2, 2, 1, 0.0F, false));
		stonk.cubeList.add(new ModelBox(stonk, 115, 5, -2.75F, -39.0F, 4.25F, 1, 2, 1, 0.0F, false));

		bone316 = new ModelRenderer(this);
		bone316.setRotationPoint(-1.0F, -42.75F, 26.5F);
		stonk.addChild(bone316);
		setRotationAngle(bone316, 0.0F, 0.0F, 0.7854F);
		bone316.cubeList.add(new ModelBox(bone316, 44, 207, 0.4142F, -0.7071F, -10.0F, 1, 1, 21, 0.0F, false));
		bone316.cubeList.add(new ModelBox(bone316, 0, 207, -1.4142F, 1.1213F, -10.0F, 1, 1, 21, 0.0F, false));
		bone316.cubeList.add(new ModelBox(bone316, 133, 199, -1.4142F, 0.7071F, -10.0F, 1, 1, 21, 0.001F, false));
		bone316.cubeList.add(new ModelBox(bone316, 207, 0, 0.0F, -0.7071F, -10.0F, 1, 1, 21, 0.001F, false));

		bone300 = new ModelRenderer(this);
		bone300.setRotationPoint(-1.5F, -34.75F, 30.5F);
		stonk.addChild(bone300);
		setRotationAngle(bone300, 0.7854F, 0.0F, 0.0F);
		bone300.cubeList.add(new ModelBox(bone300, 53, 20, -1.5F, -6.5F, -1.0F, 3, 14, 3, 0.0F, false));
		bone300.cubeList.add(new ModelBox(bone300, 100, 85, -2.0003F, -3.9142F, 1.4749F, 4, 10, 2, 0.0F, false));
		bone300.cubeList.add(new ModelBox(bone300, 36, 51, -2.001F, -2.1517F, 3.0659F, 4, 6, 2, 0.0F, false));
		bone300.cubeList.add(new ModelBox(bone300, 108, 79, -2.0004F, 0.0806F, 4.8336F, 4, 2, 2, 0.0F, false));

		bone302 = new ModelRenderer(this);
		bone302.setRotationPoint(-1.0F, -33.75F, 25.5F);
		stonk.addChild(bone302);
		setRotationAngle(bone302, 0.7854F, 0.0F, 0.0F);
		bone302.cubeList.add(new ModelBox(bone302, 65, 20, -1.0F, -1.5F, 1.0F, 1, 10, 1, 0.0F, false));

		bone301 = new ModelRenderer(this);
		bone301.setRotationPoint(-1.5F, -34.75F, 26.5F);
		stonk.addChild(bone301);
		setRotationAngle(bone301, 0.7854F, 0.0F, 0.0F);
		bone301.cubeList.add(new ModelBox(bone301, 11, 62, -1.5F, -6.5F, -1.0F, 3, 5, 3, -0.002F, false));

		bone303 = new ModelRenderer(this);
		bone303.setRotationPoint(-1.0F, -34.75F, 24.5F);
		stonk.addChild(bone303);
		setRotationAngle(bone303, 0.7854F, 0.0F, 0.0F);
		bone303.cubeList.add(new ModelBox(bone303, 0, 0, -1.5F, -6.8536F, -1.0F, 2, 5, 3, -0.001F, false));

		bone305 = new ModelRenderer(this);
		bone305.setRotationPoint(-0.75F, -39.0F, 4.25F);
		stonk.addChild(bone305);
		bone305.cubeList.add(new ModelBox(bone305, 19, 110, -1.75F, 12.75F, 27.25F, 2, 1, 4, 0.0F, false));
		bone305.cubeList.add(new ModelBox(bone305, 12, 51, -2.25F, 8.75F, 29.25F, 3, 4, 2, 0.0F, false));

		bone304 = new ModelRenderer(this);
		bone304.setRotationPoint(-0.75F, 10.0F, 28.75F);
		bone305.addChild(bone304);
		setRotationAngle(bone304, 0.6545F, 0.0F, 0.0F);
		bone304.cubeList.add(new ModelBox(bone304, 0, 111, -1.0F, -0.5F, -3.0F, 2, 1, 4, 0.0F, false));

		bone306 = new ModelRenderer(this);
		bone306.setRotationPoint(-0.75F, 10.0F, 26.25F);
		bone305.addChild(bone306);
		setRotationAngle(bone306, 1.309F, 0.0F, 0.0F);
		bone306.cubeList.add(new ModelBox(bone306, 0, 69, -1.0F, 0.1919F, -2.4286F, 2, 1, 1, 0.0F, false));

		bone307 = new ModelRenderer(this);
		bone307.setRotationPoint(-0.75F, 13.25F, 28.25F);
		bone305.addChild(bone307);
		setRotationAngle(bone307, -0.7854F, 0.0F, 0.0F);
		bone307.cubeList.add(new ModelBox(bone307, 24, 44, -1.0F, 0.0607F, -2.3536F, 2, 1, 2, 0.0F, false));

		bone308 = new ModelRenderer(this);
		bone308.setRotationPoint(0.0F, -17.1562F, 20.9688F);
		stonk.addChild(bone308);
		setRotationAngle(bone308, 0.0F, 0.1309F, 0.0F);
		bone308.cubeList.add(new ModelBox(bone308, 11, 87, -2.401F, -9.0938F, 10.4722F, 1, 1, 4, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 61, 85, -2.401F, -10.0938F, 9.9722F, 1, 1, 4, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 61, 79, -2.401F, -11.0938F, 10.4722F, 1, 1, 3, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 110, 9, -2.401F, -12.0938F, 11.7222F, 1, 1, 2, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 85, 20, -2.401F, -13.0938F, 12.4722F, 1, 4, 2, -0.001F, false));

		bone309 = new ModelRenderer(this);
		bone309.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone308.addChild(bone309);
		setRotationAngle(bone309, 0.6545F, 0.0F, 0.0F);
		bone309.cubeList.add(new ModelBox(bone309, 37, 87, -0.901F, -0.5359F, -3.0469F, 1, 1, 4, 0.001F, false));

		bone310 = new ModelRenderer(this);
		bone310.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone308.addChild(bone310);
		setRotationAngle(bone310, 1.309F, 0.0F, 0.0F);
		bone310.cubeList.add(new ModelBox(bone310, 94, 97, -0.901F, 0.1348F, -2.4439F, 1, 1, 1, 0.0F, false));

		bone311 = new ModelRenderer(this);
		bone311.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone308.addChild(bone311);
		setRotationAngle(bone311, -0.7854F, 0.0F, 0.0F);
		bone311.cubeList.add(new ModelBox(bone311, 110, 12, -0.901F, 0.1024F, -2.3953F, 1, 1, 2, -0.001F, false));

		bone317 = new ModelRenderer(this);
		bone317.setRotationPoint(-2.401F, -20.0938F, -5.5278F);
		bone308.addChild(bone317);
		

		bone312 = new ModelRenderer(this);
		bone312.setRotationPoint(0.0F, -17.1562F, 20.9688F);
		stonk.addChild(bone312);
		setRotationAngle(bone312, 0.0F, -0.1309F, 0.0F);
		bone312.cubeList.add(new ModelBox(bone312, 11, 77, -1.5733F, -9.0938F, 10.8638F, 1, 1, 4, -0.001F, false));
		bone312.cubeList.add(new ModelBox(bone312, 74, 74, -1.5733F, -10.0938F, 10.3638F, 1, 1, 4, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 50, 78, -1.5733F, -11.0938F, 10.8638F, 1, 1, 3, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 110, 0, -1.5733F, -12.0938F, 12.1138F, 1, 1, 2, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 85, 0, -1.5733F, -13.0938F, 12.8638F, 1, 4, 2, 0.001F, false));

		bone313 = new ModelRenderer(this);
		bone313.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone312.addChild(bone313);
		setRotationAngle(bone313, 0.6545F, 0.0F, 0.0F);
		bone313.cubeList.add(new ModelBox(bone313, 74, 79, -0.0733F, -0.2976F, -2.7362F, 1, 1, 4, -0.001F, false));

		bone314 = new ModelRenderer(this);
		bone314.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone312.addChild(bone314);
		setRotationAngle(bone314, 1.309F, 0.0F, 0.0F);
		bone314.cubeList.add(new ModelBox(bone314, 90, 97, -0.0733F, 0.513F, -2.3426F, 1, 1, 1, 0.0F, false));

		bone315 = new ModelRenderer(this);
		bone315.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone312.addChild(bone315);
		setRotationAngle(bone315, -0.7854F, 0.0F, 0.0F);
		bone315.cubeList.add(new ModelBox(bone315, 110, 3, -0.0733F, -0.1745F, -2.1184F, 1, 1, 2, -0.002F, false));

		action = new QRenderer(this);
		action.setRotationPoint(0.1F, 23.1F, -2.0F);
		

		receiver16_r1 = new ModelRenderer(this);
		receiver16_r1.setRotationPoint(-2.3F, -38.8F, -15.0F);
		action.addChild(receiver16_r1);
		setRotationAngle(receiver16_r1, 0.0F, 0.0F, -0.4014F);
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 91, 92, -1.0F, -0.001F, 0.001F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 74, 20, -0.75F, -0.001F, -4.499F, 1, 1, 3, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 4, 87, -1.0F, -0.001F, -5.499F, 1, 1, 1, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 100, 97, -1.0F, 0.0F, -1.499F, 1, 1, 2, 0.0F, false));
		receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 61, 103, -1.0F, 0.0F, -6.999F, 1, 1, 2, 0.0F, false));

		receiver16_r2 = new ModelRenderer(this);
		receiver16_r2.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver16_r2);
		setRotationAngle(receiver16_r2, 0.0F, 0.0F, -0.4014F);
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 29, 87, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 50, 74, 0.0F, 0.0F, 0.5F, 1, 1, 3, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 74, 24, 0.05F, 0.2F, -3.0F, 1, 1, 3, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 88, 15, -0.001F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		receiver16_r2.cubeList.add(new ModelBox(receiver16_r2, 78, 103, 0.0F, 0.0F, -5.5F, 1, 1, 2, 0.0F, false));

		receiver15_r1 = new ModelRenderer(this);
		receiver15_r1.setRotationPoint(-3.6F, -37.5F, -16.5F);
		action.addChild(receiver15_r1);
		setRotationAngle(receiver15_r1, 0.0F, 0.0F, 0.4014F);
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 88, 35, -0.001F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 74, 63, 0.0F, -1.0F, 0.5F, 1, 1, 3, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 89, 0, -0.001F, -1.0F, -4.001F, 1, 1, 1, 0.0F, false));
		receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 93, 103, 0.0F, -1.0F, -5.5F, 1, 1, 2, 0.0F, false));

		receiver16_r3 = new ModelRenderer(this);
		receiver16_r3.setRotationPoint(-3.5F, -37.3F, -19.5F);
		action.addChild(receiver16_r3);
		setRotationAngle(receiver16_r3, 0.0F, 0.0F, 0.4014F);
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 74, 67, 0.0F, -1.3F, -0.001F, 1, 1, 3, 0.0F, false));
		receiver16_r3.cubeList.add(new ModelBox(receiver16_r3, 0, 77, -0.001F, -1.0F, -0.001F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		gun.render(f5);
//		handguard.render(f5);
//		handguard_short.render(f5);
		stonk.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
