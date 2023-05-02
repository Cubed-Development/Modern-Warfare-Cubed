package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3Action extends ModelWithAttachments {
	private final QRenderer grip;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun241_r2;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun243_r1;
	private final ModelRenderer gun241_r3;
	private final QRenderer gun;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun5_r5;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun5_r6;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun4_r4;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun8_r3;
	private final ModelRenderer gun6_r4;
	private final ModelRenderer gun9_r4;
	private final ModelRenderer gun8_r4;
	private final ModelRenderer gun8_r5;
	private final ModelRenderer gun7_r3;
	private final ModelRenderer gun6_r5;
	private final ModelRenderer gun4_r5;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun4_r6;
	private final ModelRenderer gun4_r7;
	private final ModelRenderer gun3_r2;
	private final QRenderer action;
	private final ModelRenderer gun9_r5;
	private final ModelRenderer gun9_r6;
	private final ModelRenderer gun8_r6;
	private final QRenderer barrel;
	private final ModelRenderer gun7_r4;
	private final ModelRenderer gun8_r7;
	private final ModelRenderer gun9_r7;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r2;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun9_r8;
	private final ModelRenderer gun15_r3;
	private final ModelRenderer gun14_r2;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun14_r3;
	private final ModelRenderer gun16_r2;
	private final ModelRenderer gun14_r4;
	private final ModelRenderer gun13_r2;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer bone;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun16_r3;
	private final ModelRenderer gun16_r4;
	private final ModelRenderer gun15_r4;
	private final QRenderer charginghandle;
	private final ModelRenderer gun8_r8;
	private final ModelRenderer gun9_r9;
	private final ModelRenderer gun9_r10;
	private final ModelRenderer gun8_r9;
	private final QRenderer handguard_a1;
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
	private final QRenderer stock;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun9_r11;
	private final ModelRenderer gun12_r6;
	private final ModelRenderer gun13_r3;
	private final ModelRenderer gun12_r7;
	private final ModelRenderer gun11_r5;
	private final ModelRenderer gun13_r4;
	private final ModelRenderer gun12_r8;
	private final ModelRenderer gun13_r5;
	private final ModelRenderer gun12_r9;
	private final ModelRenderer gun12_r10;
	private final ModelRenderer gun14_r5;
	private final ModelRenderer gun13_r6;
	private final ModelRenderer gun13_r7;
	private final ModelRenderer gun12_r11;
	private final ModelRenderer gun11_r6;
	private final ModelRenderer gun14_r6;
	private final ModelRenderer gun13_r8;
	private final ModelRenderer gun10_r3;
	private final ModelRenderer gun11_r7;
	private final ModelRenderer gun10_r4;
	private final ModelRenderer gun9_r12;
	private final ModelRenderer gun10_r5;
	private final ModelRenderer gun9_r13;
	private final ModelRenderer gun12_r12;
	private final ModelRenderer gun12_r13;
	private final ModelRenderer gun11_r8;
	private final ModelRenderer gun11_r9;
	private final ModelRenderer gun10_r6;
	private final ModelRenderer gun12_r14;
	private final ModelRenderer gun12_r15;
	private final ModelRenderer gun11_r10;
	private final ModelRenderer gun10_r7;
	private final ModelRenderer gun11_r11;
	private final ModelRenderer gun11_r12;
	private final ModelRenderer gun10_r8;
	private final ModelRenderer gun10_r9;
	private final ModelRenderer gun10_r10;
	private final ModelRenderer gun12_r16;
	private final ModelRenderer gun14_r7;
	private final ModelRenderer gun13_r9;
	private final ModelRenderer gun13_r10;
	private final ModelRenderer gun11_r13;
	private final ModelRenderer gun12_r17;
	private final ModelRenderer gun13_r11;
	private final ModelRenderer gun12_r18;
	private final ModelRenderer gun11_r14;
	private final ModelRenderer gun14_r8;
	private final ModelRenderer gun13_r12;
	private final ModelRenderer gun12_r19;
	private final ModelRenderer gun11_r15;
	private final ModelRenderer gun10_r11;
	private final ModelRenderer gun10_r12;
	private final ModelRenderer gun10_r13;
	private final ModelRenderer gun9_r14;
	private final QRenderer mag;
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
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer bone7;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final QRenderer handguard_a3;
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

	public G3Action() {
		textureWidth = 300;
		textureHeight = 300;

		grip = new QRenderer(this);
		grip.setRotationPoint(-0.25F, 23.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 88, 83, -3.252F, -29.5F, -1.9F, 4, 3, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 29, -3.25F, -31.0F, -1.65F, 4, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 16, 29, -3.25F, -29.0F, -4.65F, 4, 1, 3, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-2.25F, -29.0F, -5.65F);
		grip.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.3491F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 0, 0, -0.999F, 1.0F, 0.0F, 4, 10, 4, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-2.25F, -29.0F, -4.65F);
		grip.addChild(gun240_r1);
		setRotationAngle(gun240_r1, 0.3491F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 0, 55, -1.0F, 0.0F, -1.0F, 4, 11, 1, 0.0F, false));

		gun241_r2 = new ModelRenderer(this);
		gun241_r2.setRotationPoint(-2.25F, -31.0F, -1.65F);
		grip.addChild(gun241_r2);
		setRotationAngle(gun241_r2, -0.7854F, 0.0F, 0.0F);
		gun241_r2.cubeList.add(new ModelBox(gun241_r2, 0, 85, -0.999F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(-2.25F, -30.3F, -2.35F);
		grip.addChild(gun242_r1);
		setRotationAngle(gun242_r1, -0.2618F, 0.0F, 0.0F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 12, 101, -0.9985F, 0.0F, 0.0F, 4, 2, 2, 0.0F, false));

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(-2.25F, -21.1F, 4.0F);
		grip.addChild(gun245_r1);
		setRotationAngle(gun245_r1, -1.0123F, 0.0F, 0.0F);
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 92, 122, -1.0F, 0.0F, -2.0F, 4, 6, 2, 0.0F, false));

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(-2.25F, -25.6F, 1.9F);
		grip.addChild(gun244_r1);
		setRotationAngle(gun244_r1, 0.4363F, 0.0F, 0.0F);
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 16, 19, -0.998F, 0.0F, -5.0F, 4, 5, 5, 0.0F, false));

		gun243_r1 = new ModelRenderer(this);
		gun243_r1.setRotationPoint(-2.25F, -28.0F, 0.1F);
		grip.addChild(gun243_r1);
		setRotationAngle(gun243_r1, 0.6545F, 0.0F, 0.0F);
		gun243_r1.cubeList.add(new ModelBox(gun243_r1, 112, 24, -1.001F, 0.0F, -5.0F, 4, 3, 5, 0.0F, false));

		gun241_r3 = new ModelRenderer(this);
		gun241_r3.setRotationPoint(-2.25F, -30.0F, 1.35F);
		grip.addChild(gun241_r3);
		setRotationAngle(gun241_r3, -1.0559F, 0.0F, 0.0F);
		gun241_r3.cubeList.add(new ModelBox(gun241_r3, 100, 21, -0.998F, 0.0F, -1.0F, 4, 3, 1, 0.0F, false));

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 38, 37, -2.6F, -35.0F, -15.5F, 3, 5, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 25, -0.1F, -35.65F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 105, -0.95F, -38.65F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 57, -3.3F, -38.551F, -4.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 49, -0.7F, -38.551F, -4.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 112, -2.0F, -39.751F, -4.45F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 54, -3.3F, -38.551F, -13.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 52, -0.7F, -38.551F, -13.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 41, -3.3F, -38.551F, -27.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 84, -0.7F, -38.551F, -27.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 48, -2.0F, -39.851F, -13.25F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 146, 33, -0.75F, -38.65F, -27.5F, 1, 1, 28, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 200, -2.0F, -39.8F, -27.5F, 1, 1, 23, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 224, -3.25F, -38.65F, -16.5F, 1, 1, 17, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 71, -3.25F, -38.65F, -27.5F, 1, 1, 3, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, -1.2F, -37.65F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 9, -2.8F, -37.65F, -30.5F, 2, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 216, 145, -2.8F, -37.65F, -16.5F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 70, -2.1F, -39.601F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 74, -1.9F, -39.6F, -30.5F, 1, 1, 34, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 123, 94, -2.5F, -35.25F, -30.5F, 2, 2, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 125, 117, -3.05F, -38.65F, -30.5F, 1, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 217, 189, -3.05F, -38.65F, -16.5F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 8, -0.099F, -36.15F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 175, -0.349F, -36.15F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 132, 174, -3.649F, -36.15F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 174, 137, -0.35F, -35.65F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 103, 173, -3.65F, -35.65F, -23.5F, 1, 1, 27, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 17, -3.9F, -35.65F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 58, 0, -3.91F, -36.15F, -30.5F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 37, -0.5F, -33.5F, -6.5F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 37, -2.75F, -34.0F, -17.5F, 3, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 9, -3.25F, -34.0F, -17.5F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 31, -2.599F, -31.0F, -16.9F, 3, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 94, -2.45F, -34.2F, -25.8F, 3, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 14, -2.45F, -33.6F, -25.8F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 91, -2.45F, -33.2F, -24.4F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 61, -3.55F, -33.2F, -24.4F, 3, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 101, -2.45F, -32.2F, -20.8F, 3, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 63, -0.35F, -32.55F, -18.6F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 7, 94, -0.65F, -32.55F, -16.9F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 83, -0.099F, -33.8F, -18.25F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 25, -0.099F, -33.3F, -18.25F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 21, -0.099F, -31.8F, -18.25F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 19, -3.899F, -33.8F, -18.25F, 1, 3, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 98, -0.098F, -33.8F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 42, 96, -3.898F, -33.8F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 67, -0.099F, -33.35F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 96, -3.899F, -33.35F, -24.1F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 127, -0.099F, -34.23F, -23.67F, 1, 1, 6, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 45, -3.899F, -34.23F, -23.67F, 1, 1, 6, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 35, -3.55F, -34.2F, -25.8F, 2, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 5, -3.55F, -33.6F, -25.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 0, -3.55F, -32.2F, -20.8F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 74, -3.4F, -35.0F, -15.5F, 1, 5, 14, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 70, -3.401F, -31.0F, -16.9F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 72, -3.0F, -26.0F, -11.5F, 3, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 130, -2.6F, -35.0F, -1.5F, 3, 3, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 44, 74, -3.4F, -35.0F, -1.5F, 1, 3, 3, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.0F, -25.0F, -11.5F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.3229F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 26, 55, -3.0F, -6.0F, 0.0F, 3, 6, 1, 0.0F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(0.0F, -30.3F, -6.0F);
		gun.addChild(gun5_r2);
		setRotationAngle(gun5_r2, 0.3665F, 0.0F, 0.0F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 76, 21, -3.0F, 0.0F, 0.0F, 3, 4, 2, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(0.0F, -25.0F, -6.5F);
		gun.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.6545F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 45, -3.0F, -1.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(-2.55F, -28.9F, -17.5F);
		gun.addChild(gun5_r3);
		setRotationAngle(gun5_r3, -0.2443F, 0.0F, 0.0F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 108, 97, -1.001F, -5.3F, -1.001F, 2, 2, 1, 0.0F, false));
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 49, 0, -1.0F, -5.03F, -1.0F, 2, 4, 1, 0.0F, false));
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 62, 95, 0.101F, -5.3F, -1.001F, 3, 2, 1, 0.0F, false));
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 62, 81, 0.1015F, -5.03F, -1.0F, 3, 4, 1, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-3.1F, -31.0F, -17.45F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -0.7854F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 95, 93, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 42, 98, 3.0F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-3.1F, -33.6F, -23.05F);
		gun.addChild(gun9_r2);
		setRotationAngle(gun9_r2, -0.7854F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 96, 61, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 96, 70, 3.0F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-3.1F, -33.6F, -17.45F);
		gun.addChild(gun8_r1);
		setRotationAngle(gun8_r1, -0.7854F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 95, 95, -0.8F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 79, 98, 3.0F, -0.2F, -0.8F, 1, 1, 1, -0.2F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-3.1F, -32.55F, -23.9F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 1.2566F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 47, 47, -0.799F, 4.55F, -0.2F, 1, 2, 1, -0.2F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 10, 55, 3.001F, 4.55F, -0.2F, 1, 2, 1, -0.2F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 40, 0, -0.8F, -0.2F, -0.2F, 1, 6, 1, -0.2F, false));
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 40, 8, 3.0F, -0.2F, -0.2F, 1, 6, 1, -0.2F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-0.55F, -33.2F, -25.8F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.7069F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 67, -2.999F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 67, 0, -1.899F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(1.55F, -30.1F, -18.1F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.3142F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 89, 37, -3.001F, -1.0F, -8.0F, 2, 1, 8, 0.0F, false));
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 112, 45, -5.101F, -1.0F, -8.0F, 3, 1, 8, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-0.4F, -31.0F, -16.9F);
		gun.addChild(gun5_r4);
		setRotationAngle(gun5_r4, -0.9599F, 0.0F, 0.0F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 100, 46, -2.999F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 36, 103, -2.201F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(-0.6F, -32.0F, -8.1F);
		gun.addChild(gun7_r2);
		setRotationAngle(gun7_r2, -1.8326F, 0.0F, 0.0F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 93, 0, -3.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(-0.6F, -31.2F, -16.7F);
		gun.addChild(gun6_r2);
		setRotationAngle(gun6_r2, -1.8326F, 0.0F, 0.0F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 38, 68, -3.001F, -1.0F, 0.0F, 3, 1, 1, -0.1F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 46, 68, -1.801F, -1.0F, 0.0F, 3, 1, 1, -0.1F, false));

		gun5_r5 = new ModelRenderer(this);
		gun5_r5.setRotationPoint(0.5F, -33.5F, -5.5F);
		gun.addChild(gun5_r5);
		setRotationAngle(gun5_r5, 0.8552F, 0.0F, 0.0F);
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 79, 93, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(0.5F, -31.5F, -5.5F);
		gun.addChild(gun4_r2);
		setRotationAngle(gun4_r2, -0.8552F, 0.0F, 0.0F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 11, 45, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(0.75F, -32.5F, -5.65F);
		gun.addChild(gun6_r3);
		setRotationAngle(gun6_r3, -0.2443F, 0.4014F, -0.0873F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 93, 46, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun5_r6 = new ModelRenderer(this);
		gun5_r6.setRotationPoint(0.75F, -32.75F, -6.75F);
		gun.addChild(gun5_r6);
		setRotationAngle(gun5_r6, -0.2269F, 0.0F, 0.0F);
		gun5_r6.cubeList.add(new ModelBox(gun5_r6, 59, 112, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(0.75F, -32.75F, -6.75F);
		gun.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.1396F, 0.0F, 0.0F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 93, 58, -0.999F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun4_r4 = new ModelRenderer(this);
		gun4_r4.setRotationPoint(-3.9F, -34.65F, -29.5F);
		gun.addChild(gun4_r4);
		setRotationAngle(gun4_r4, 0.0F, 0.0F, -0.7854F);
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 0, 36, 0.0F, 0.0F, -1.0F, 2, 2, 34, 0.0F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(-3.05F, -38.65F, -29.5F);
		gun.addChild(gun9_r3);
		setRotationAngle(gun9_r3, 0.0F, 0.0F, 0.7854F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 72, 75, 0.0F, -1.35F, -1.0F, 1, 1, 34, 0.0F, false));
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 213, 214, -0.001F, -1.0F, 13.0F, 1, 1, 20, 0.0F, false));
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 125, 35, -0.001F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-3.0F, -37.65F, -29.5F);
		gun.addChild(gun8_r2);
		setRotationAngle(gun8_r2, 0.0F, 0.0F, 0.7854F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 216, 166, 0.0F, -1.0F, 13.0F, 1, 1, 20, 0.0F, false));
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 125, 110, 0.0F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));

		gun8_r3 = new ModelRenderer(this);
		gun8_r3.setRotationPoint(0.05F, -38.65F, -29.5F);
		gun.addChild(gun8_r3);
		setRotationAngle(gun8_r3, 0.0F, 0.0F, 0.7854F);
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 76, 0, -1.35F, 0.0F, -1.0F, 1, 1, 34, 0.0F, false));
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 76, 35, -1.0F, -0.001F, -1.0F, 1, 1, 34, 0.0F, false));

		gun6_r4 = new ModelRenderer(this);
		gun6_r4.setRotationPoint(0.05F, -37.65F, -29.5F);
		gun.addChild(gun6_r4);
		setRotationAngle(gun6_r4, 0.0F, 0.0F, 0.7854F);
		gun6_r4.cubeList.add(new ModelBox(gun6_r4, 0, 107, -1.0F, 0.0F, -1.0F, 1, 1, 34, 0.0F, false));

		gun9_r4 = new ModelRenderer(this);
		gun9_r4.setRotationPoint(-1.0F, -39.751F, -2.25F);
		gun.addChild(gun9_r4);
		setRotationAngle(gun9_r4, -0.1222F, 0.0F, 0.0F);
		gun9_r4.cubeList.add(new ModelBox(gun9_r4, 93, 2, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun8_r4 = new ModelRenderer(this);
		gun8_r4.setRotationPoint(-1.0F, -39.751F, -4.45F);
		gun.addChild(gun8_r4);
		setRotationAngle(gun8_r4, 0.1222F, 0.0F, 0.0F);
		gun8_r4.cubeList.add(new ModelBox(gun8_r4, 18, 93, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun8_r5 = new ModelRenderer(this);
		gun8_r5.setRotationPoint(-3.9F, -36.15F, -16.9F);
		gun.addChild(gun8_r5);
		setRotationAngle(gun8_r5, 0.0F, 0.6632F, -0.7854F);
		gun8_r5.cubeList.add(new ModelBox(gun8_r5, 112, 38, 0.0F, -0.001F, 0.0F, 1, 1, 2, 0.0F, false));

		gun7_r3 = new ModelRenderer(this);
		gun7_r3.setRotationPoint(-3.9F, -36.15F, -29.5F);
		gun.addChild(gun7_r3);
		setRotationAngle(gun7_r3, 0.0F, 0.0F, -0.7854F);
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 82, 123, 0.0F, 0.0F, 5.0F, 1, 1, 8, 0.0F, false));
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 56, 176, 0.0F, 0.0F, 13.0F, 2, 1, 20, 0.0F, false));
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 55, 56, 0.0F, 0.0F, -1.0F, 2, 2, 6, 0.0F, false));

		gun6_r5 = new ModelRenderer(this);
		gun6_r5.setRotationPoint(-3.9F, -36.15F, -23.25F);
		gun.addChild(gun6_r5);
		setRotationAngle(gun6_r5, 0.0F, 0.672F, -0.7854F);
		gun6_r5.cubeList.add(new ModelBox(gun6_r5, 65, 60, 1.0F, -0.001F, -1.0F, 2, 1, 1, 0.0F, false));

		gun4_r5 = new ModelRenderer(this);
		gun4_r5.setRotationPoint(0.9F, -36.15F, -29.5F);
		gun.addChild(gun4_r5);
		setRotationAngle(gun4_r5, 0.0F, 0.0F, 0.7854F);
		gun4_r5.cubeList.add(new ModelBox(gun4_r5, 0, 0, -3.0F, 0.0F, -1.0F, 3, 2, 34, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.9F, -34.65F, -29.5F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.0F, 0.0F, 0.7854F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 38, 38, -2.0F, 0.0F, -1.0F, 2, 2, 34, 0.0F, false));

		gun4_r6 = new ModelRenderer(this);
		gun4_r6.setRotationPoint(-0.5F, -27.8F, -7.0F);
		gun.addChild(gun4_r6);
		setRotationAngle(gun4_r6, -0.7505F, 0.0F, 0.0F);
		gun4_r6.cubeList.add(new ModelBox(gun4_r6, 112, 45, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		gun4_r7 = new ModelRenderer(this);
		gun4_r7.setRotationPoint(-0.5F, -30.8F, -15.7F);
		gun.addChild(gun4_r7);
		setRotationAngle(gun4_r7, 0.2618F, 0.0F, 0.0F);
		gun4_r7.cubeList.add(new ModelBox(gun4_r7, 66, 37, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(-0.5F, -30.8F, -7.5F);
		gun.addChild(gun3_r2);
		setRotationAngle(gun3_r2, 0.1571F, 0.0F, 0.0F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 66, 44, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		action = new QRenderer(this);
		action.setRotationPoint(-3.0F, -14.65F, -24.5F);
		action.cubeList.add(new ModelBox(action, 72, 122, 0.2F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 121, 70, 0.4F, 0.75F, 0.0F, 1, 1, 8, 0.0F, false));

		gun9_r5 = new ModelRenderer(this);
		gun9_r5.setRotationPoint(0.2F, 1.0F, 1.0F);
		action.addChild(gun9_r5);
		setRotationAngle(gun9_r5, 0.0F, 0.0F, -0.7854F);
		gun9_r5.cubeList.add(new ModelBox(gun9_r5, 121, 82, 0.0F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));

		gun9_r6 = new ModelRenderer(this);
		gun9_r6.setRotationPoint(-0.2F, 2.0F, 1.0F);
		action.addChild(gun9_r6);
		setRotationAngle(gun9_r6, 0.0F, 0.0F, -0.7854F);
		gun9_r6.cubeList.add(new ModelBox(gun9_r6, 36, 121, 0.0F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));

		gun8_r6 = new ModelRenderer(this);
		gun8_r6.setRotationPoint(0.2F, 0.0F, 1.0F);
		action.addChild(gun8_r6);
		setRotationAngle(gun8_r6, 0.0F, 0.0F, -0.7854F);
		gun8_r6.cubeList.add(new ModelBox(gun8_r6, 122, 55, 0.0F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));

		barrel = new QRenderer(this);
		barrel.setRotationPoint(-1.0F, -14.5F, -62.5F);
		barrel.cubeList.add(new ModelBox(barrel, 36, 112, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 35, -1.0F, -1.0F, -2.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 15, -1.5F, -0.5F, -2.75F, 2, 2, 1, -0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 49, 99, -1.5F, 1.0F, -2.5F, 2, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 125, 12, -1.0F, -1.0F, 3.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 12, -1.0F, -0.9F, -0.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 125, 0, -1.0F, -1.0F, 26.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 81, -1.851F, -0.15F, 3.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 5, 107, -1.851F, -0.15F, 0.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 49, 94, -1.851F, -0.15F, -2.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 54, 74, -0.15F, -0.15F, 3.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 108, 85, -0.15F, -0.15F, 0.0F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 105, -0.15F, -0.15F, -2.5F, 1, 1, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 10, 36, 0.1F, 1.4F, 0.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 36, -2.1F, 1.4F, 0.0F, 1, 3, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 112, 0, -0.3F, -0.15F, -0.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 72, 110, -1.7F, -0.15F, -0.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 92, 70, -0.15F, -0.15F, 31.0F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 54, 99, -1.851F, -0.15F, 26.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 96, -0.05F, -0.15F, 10.0F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 40, 2, -1.0F, 2.6F, -0.5F, 1, 1, 34, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 191, 213, -1.0F, 2.35F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 130, 24, -1.0F, 1.85F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 125, 129, -1.0F, 3.35F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 12, 129, -0.25F, 2.6F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 118, 128, -1.75F, 2.6F, -4.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 205, 0, -1.0F, 2.85F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 145, 203, -0.75F, 2.6F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 203, 124, -1.25F, 2.6F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 203, 87, -1.15F, 2.45F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 123, 202, -1.15F, 2.75F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 203, 24, -0.85F, 2.45F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 203, -0.85F, 2.75F, -20.5F, 1, 1, 20, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 63, 225, -1.0F, -1.1F, 10.0F, 1, 1, 18, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 223, -1.95F, -0.15F, 10.0F, 1, 1, 18, 0.0F, false));

		gun7_r4 = new ModelRenderer(this);
		gun7_r4.setRotationPoint(0.95F, 0.85F, 11.0F);
		barrel.addChild(gun7_r4);
		setRotationAngle(gun7_r4, 0.0F, 0.0F, 0.7854F);
		gun7_r4.cubeList.add(new ModelBox(gun7_r4, 100, 144, -1.0F, 0.0F, -1.0F, 1, 1, 18, 0.0F, false));

		gun8_r7 = new ModelRenderer(this);
		gun8_r7.setRotationPoint(-1.95F, 0.85F, 11.0F);
		barrel.addChild(gun8_r7);
		setRotationAngle(gun8_r7, 0.0F, 0.0F, 0.7854F);
		gun8_r7.cubeList.add(new ModelBox(gun8_r7, 104, 201, 0.0F, -1.0F, -1.0F, 1, 1, 18, 0.0F, false));

		gun9_r7 = new ModelRenderer(this);
		gun9_r7.setRotationPoint(-1.95F, -0.15F, 11.0F);
		barrel.addChild(gun9_r7);
		setRotationAngle(gun9_r7, 0.0F, 0.0F, 0.7854F);
		gun9_r7.cubeList.add(new ModelBox(gun9_r7, 126, 224, -0.001F, -1.0F, -1.0F, 1, 1, 18, 0.0F, false));
		gun9_r7.cubeList.add(new ModelBox(gun9_r7, 225, 21, 0.0F, -1.35F, -1.0F, 1, 1, 18, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.75F, 3.6F, -4.5F);
		barrel.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.0F, 0.0F, -0.7854F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 56, 127, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-1.75F, 3.6F, -4.5F);
		barrel.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0F, 0.0F, -0.7854F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 86, 0, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun15_r2 = new ModelRenderer(this);
		gun15_r2.setRotationPoint(-1.75F, 2.6F, -4.5F);
		barrel.addChild(gun15_r2);
		setRotationAngle(gun15_r2, 0.0F, 0.0F, -0.7854F);
		gun15_r2.cubeList.add(new ModelBox(gun15_r2, 91, 102, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.75F, 2.6F, -4.5F);
		barrel.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.0F, 0.0F, -0.7854F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 106, 128, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

		gun9_r8 = new ModelRenderer(this);
		gun9_r8.setRotationPoint(0.95F, -0.15F, 11.0F);
		barrel.addChild(gun9_r8);
		setRotationAngle(gun9_r8, 0.0F, 0.0F, 0.7854F);
		gun9_r8.cubeList.add(new ModelBox(gun9_r8, 225, 78, -1.35F, 0.0F, -1.0F, 1, 1, 18, 0.0F, false));
		gun9_r8.cubeList.add(new ModelBox(gun9_r8, 225, 108, -1.0F, -0.001F, -1.0F, 1, 1, 18, 0.0F, false));

		gun15_r3 = new ModelRenderer(this);
		gun15_r3.setRotationPoint(-1.85F, 0.85F, 27.5F);
		barrel.addChild(gun15_r3);
		setRotationAngle(gun15_r3, 0.0F, 0.0F, 0.7854F);
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 18, 99, -0.001F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 49, 91, -0.001F, -1.0F, -30.0F, 1, 1, 2, 0.0F, false));
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 84, 105, -0.001F, -1.0F, -27.5F, 1, 1, 2, 0.0F, false));
		gun15_r3.cubeList.add(new ModelBox(gun15_r3, 20, 79, -0.001F, -1.0F, -24.0F, 1, 1, 6, 0.0F, false));

		gun14_r2 = new ModelRenderer(this);
		gun14_r2.setRotationPoint(-1.85F, -0.15F, 27.5F);
		barrel.addChild(gun14_r2);
		setRotationAngle(gun14_r2, 0.0F, 0.0F, 0.7854F);
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 106, 117, -0.001F, -1.0F, -1.0F, 1, 1, 6, 0.0F, false));
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 44, 103, -0.001F, -1.0F, -30.0F, 1, 1, 2, 0.0F, false));
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 108, 75, -0.001F, -1.0F, -27.5F, 1, 1, 2, 0.0F, false));
		gun14_r2.cubeList.add(new ModelBox(gun14_r2, 54, 81, -0.001F, -1.0F, -24.0F, 1, 1, 6, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(0.85F, 0.85F, 28.0F);
		barrel.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 0.0F, 0.0F, -0.7854F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 76, 54, -1.001F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 78, 105, -1.001F, -1.0F, -30.5F, 1, 1, 2, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 108, 88, -1.001F, -1.0F, -28.0F, 1, 1, 2, 0.0F, false));
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 36, 74, -1.001F, -1.0F, -24.5F, 1, 1, 6, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.85F, -0.15F, 31.0F);
		barrel.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.0F, 0.0F, -0.7854F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 84, 70, -1.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 103, 49, -1.001F, -1.0F, -33.5F, 1, 1, 2, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 108, 78, -1.001F, -1.0F, -31.0F, 1, 1, 2, 0.0F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 72, 74, -1.001F, -1.0F, -27.5F, 1, 1, 6, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(-1.2F, 2.6F, 0.4F);
		barrel.addChild(gun12_r2);
		setRotationAngle(gun12_r2, -0.3142F, 0.0F, 0.0F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 89, 66, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 0, 91, 1.4F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun14_r3 = new ModelRenderer(this);
		gun14_r3.setRotationPoint(-1.0F, -1.0F, -1.5F);
		barrel.addChild(gun14_r3);
		setRotationAngle(gun14_r3, 0.0F, 0.0F, -0.7854F);
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 100, 83, -1.0F, 0.0F, -1.0F, 1, 1, 2, 0.0F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 18, 107, -1.0F, 0.0F, 1.5F, 1, 1, 2, 0.0F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 72, 81, -1.0F, 0.0F, 5.0F, 1, 1, 6, 0.0F, false));
		gun14_r3.cubeList.add(new ModelBox(gun14_r3, 106, 110, -1.0F, 0.0F, 28.0F, 1, 1, 6, 0.0F, false));

		gun16_r2 = new ModelRenderer(this);
		gun16_r2.setRotationPoint(0.0F, -1.0F, 3.5F);
		barrel.addChild(gun16_r2);
		setRotationAngle(gun16_r2, 0.0F, 0.0F, -0.7854F);
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 103, 52, -1.0F, 0.0F, -6.0F, 1, 1, 2, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 108, 82, -1.0F, 0.0F, -3.5F, 1, 1, 2, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 0, 78, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 10, 85, -1.0F, 0.0F, 27.5F, 1, 1, 1, 0.0F, false));
		gun16_r2.cubeList.add(new ModelBox(gun16_r2, 108, 94, -1.0F, 0.0F, 22.75F, 1, 1, 2, 0.0F, false));

		gun14_r4 = new ModelRenderer(this);
		gun14_r4.setRotationPoint(0.0F, -1.42F, 31.7F);
		barrel.addChild(gun14_r4);
		setRotationAngle(gun14_r4, 0.0F, 0.0F, -0.7854F);
		gun14_r4.cubeList.add(new ModelBox(gun14_r4, 76, 49, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.3F, false));

		gun13_r2 = new ModelRenderer(this);
		gun13_r2.setRotationPoint(-1.0F, 0.2F, 0.5F);
		barrel.addChild(gun13_r2);
		setRotationAngle(gun13_r2, 0.0F, 0.0F, -0.7854F);
		gun13_r2.cubeList.add(new ModelBox(gun13_r2, 76, 37, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(-1.0F, -0.9F, 0.5F);
		barrel.addChild(gun12_r3);
		setRotationAngle(gun12_r3, 0.0F, 0.0F, -0.7854F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 76, 49, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(0.0F, 0.2F, 0.5F);
		barrel.addChild(gun12_r4);
		setRotationAngle(gun12_r4, 0.0F, 0.0F, -0.7854F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 76, 21, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(0.0F, -0.9F, 0.5F);
		barrel.addChild(gun11_r2);
		setRotationAngle(gun11_r2, 0.0F, 0.0F, -0.7854F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 0, 89, -1.0F, 0.0F, -1.0F, 1, 1, 11, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.75F, 3.6F, -27.5F);
		barrel.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 10, 120, 0.75F, -1.65F, 5.4F, 1, 1, 8, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 118, 1.4F, -1.0F, 5.4F, 1, 1, 8, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 85, 110, 0.75F, -0.35F, 5.4F, 1, 1, 8, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 49, 109, 0.1F, -1.0F, 5.4F, 1, 1, 8, -0.1F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(0.1F, 0.0F, 5.4F);
		bone.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.0F, 0.0F, -0.7854F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 92, 58, 0.0F, 0.0F, 0.0F, 1, 1, 8, -0.1F, false));

		gun16_r3 = new ModelRenderer(this);
		gun16_r3.setRotationPoint(0.1F, -1.0F, 5.4F);
		bone.addChild(gun16_r3);
		setRotationAngle(gun16_r3, 0.0F, 0.0F, -0.7854F);
		gun16_r3.cubeList.add(new ModelBox(gun16_r3, 85, 93, 0.0F, 0.0F, 0.0F, 1, 1, 8, -0.1F, false));

		gun16_r4 = new ModelRenderer(this);
		gun16_r4.setRotationPoint(2.4F, 0.0F, 5.4F);
		bone.addChild(gun16_r4);
		setRotationAngle(gun16_r4, 0.0F, 0.0F, -0.7854F);
		gun16_r4.cubeList.add(new ModelBox(gun16_r4, 112, 54, -1.0F, -1.0F, 0.0F, 1, 1, 8, -0.1F, false));

		gun15_r4 = new ModelRenderer(this);
		gun15_r4.setRotationPoint(2.4F, -1.0F, 5.4F);
		bone.addChild(gun15_r4);
		setRotationAngle(gun15_r4, 0.0F, 0.0F, -0.7854F);
		gun15_r4.cubeList.add(new ModelBox(gun15_r4, 0, 119, -1.0F, -1.0F, 0.0F, 1, 1, 8, -0.1F, false));

		charginghandle = new QRenderer(this);
		charginghandle.setRotationPoint(0.0F, -13.65F, -51.5F);
		charginghandle.cubeList.add(new ModelBox(charginghandle, 0, 224, -1.2F, -1.0F, 3.0F, 1, 1, 17, 0.0F, false));

		gun8_r8 = new ModelRenderer(this);
		gun8_r8.setRotationPoint(-0.2F, -1.0F, 17.0F);
		charginghandle.addChild(gun8_r8);
		setRotationAngle(gun8_r8, 0.0F, 0.0F, -0.7941F);
		gun8_r8.cubeList.add(new ModelBox(gun8_r8, 106, 110, -1.0F, -1.0F, -14.0F, 1, 1, 17, 0.0F, false));

		gun9_r9 = new ModelRenderer(this);
		gun9_r9.setRotationPoint(2.05F, 0.0F, 0.9F);
		charginghandle.addChild(gun9_r9);
		setRotationAngle(gun9_r9, 0.0F, -0.3491F, 0.0F);
		gun9_r9.cubeList.add(new ModelBox(gun9_r9, 13, 107, -1.05F, -1.0F, 0.0F, 1, 1, 3, -0.2F, false));

		gun9_r10 = new ModelRenderer(this);
		gun9_r10.setRotationPoint(2.85F, 0.0F, -1.3F);
		charginghandle.addChild(gun9_r10);
		setRotationAngle(gun9_r10, 0.0F, -0.2967F, 0.0F);
		gun9_r10.cubeList.add(new ModelBox(gun9_r10, 0, 107, -1.05F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun8_r9 = new ModelRenderer(this);
		gun8_r9.setRotationPoint(0.85F, 0.0F, 2.7F);
		charginghandle.addChild(gun8_r9);
		setRotationAngle(gun8_r9, 0.0F, 0.3142F, 0.0F);
		gun8_r9.cubeList.add(new ModelBox(gun8_r9, 55, 60, -2.05F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));

		handguard_a1 = new QRenderer(this);
		handguard_a1.setRotationPoint(0.5F, -13.5F, -60.5F);
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 224, 45, -1.0F, 0.0F, 16.0F, 1, 1, 19, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 85, 223, -4.0F, 0.0F, 16.0F, 1, 1, 19, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 38, 56, -3.5F, 4.0F, 24.0F, 3, 1, 11, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 36, 109, -0.1F, 2.85F, 24.0F, 1, 1, 11, 0.0F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 89, 21, 0.201F, 2.55F, 15.7F, 1, 1, 9, -0.3F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 13, 89, -5.201F, 2.55F, 15.7F, 1, 1, 9, -0.3F, false));
		handguard_a1.cubeList.add(new ModelBox(handguard_a1, 108, 82, -4.9F, 2.85F, 24.0F, 1, 1, 11, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3054F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 168, 222, 0.0F, 0.0F, 0.0F, 1, 3, 19, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-4.9F, 2.85F, 16.0F);
		handguard_a1.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.0349F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 17, 112, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 0, -0.3F, -0.3F, -16.3F, 1, 1, 16, -0.3F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.9F, 2.85F, 16.0F);
		handguard_a1.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0349F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 112, 18, -0.7F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 40, 17, -0.699F, -0.3F, -16.3F, 1, 1, 16, -0.3F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-4.3F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7418F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 24, 91, -0.802F, -1.03F, -0.201F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 91, 4.398F, -1.03F, -0.201F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 6, 91, -0.801F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 43, 91, 4.399F, -0.8F, -0.2F, 1, 1, 1, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.9F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 107, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.901F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 36, 91, 0.0F, 0.6F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.9F, 3.85F, 24.0F);
		handguard_a1.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 93, -0.999F, 0.6F, 0.0F, 1, 1, 11, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 108, 70, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.25F, 5.0F, 24.0F);
		handguard_a1.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.0489F, 0.0201F, 0.4014F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 62, -0.999F, -1.5F, -17.0F, 1, 1, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 55, -1.0F, -2.0F, -14.0F, 1, 1, 14, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 176, 62, -1.0F, -1.0F, -24.0F, 1, 1, 24, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.75F, 5.0F, 24.0F);
		handguard_a1.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0489F, -0.0201F, -0.4014F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 98, 102, -0.001F, -1.5F, -17.0F, 1, 1, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 19, 0.0F, -2.0F, -14.0F, 1, 1, 14, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 79, 175, 0.0F, -1.0F, -24.0F, 1, 1, 24, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, 5.0F, 24.0F);
		handguard_a1.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.0524F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 161, 174, -3.0F, -2.0F, -24.0F, 3, 2, 24, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0105F, -0.0332F, 0.3054F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 0.0F, 0.0F, -16.0F, 1, 3, 16, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0105F, 0.0332F, -0.3054F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, -1.0F, 0.0F, -16.0F, 1, 3, 16, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.65F, 0.15F, 28.0F);
		handguard_a1.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3054F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 38, 37, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.25F, 0.35F, 28.0F);
		handguard_a1.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, -0.3054F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 19, -0.999F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 45, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.3054F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 23, 223, -1.0F, 0.0F, 0.0F, 1, 3, 19, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, -0.0349F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 72, 0.0F, 0.0F, -16.0F, 1, 1, 16, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 16.0F);
		handguard_a1.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0349F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 36, 74, -1.0F, 0.0F, -16.0F, 1, 1, 16, 0.0F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(-1.55F, -14.85F, 3.5F);
		stock.cubeList.add(new ModelBox(stock, 102, 58, -0.2F, -0.9F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 13, 89, -0.7F, -0.9F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 192, 189, -0.7F, 2.6F, 3.9F, 1, 1, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 191, 165, -0.2F, 2.6F, 3.9F, 1, 1, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 176, 31, -0.35F, 3.85F, 3.9F, 2, 3, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 38, 37, -0.35F, 6.85F, 21.9F, 2, 5, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 72, 84, -0.35F, 11.35F, 25.7F, 2, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 36, -0.351F, 6.15F, 15.9F, 2, 3, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 29, 176, -1.55F, 3.85F, 3.9F, 2, 3, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 19, -1.55F, 6.85F, 21.9F, 2, 5, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 67, 2, -1.55F, 11.35F, 25.7F, 2, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 18, 0, -1.549F, 6.15F, 15.9F, 2, 3, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 178, 0, -0.351F, 3.2F, 3.9F, 2, 1, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 176, 100, -1.551F, 3.2F, 3.9F, 2, 1, 23, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 101, 41, 0.75F, 0.2F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 16, 19, 0.749F, 0.6F, 3.0F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 95, 98, -1.651F, 0.6F, 3.0F, 3, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 62, 91, 1.35F, 2.8F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 112, 6, 1.35F, 2.9F, 2.0F, 1, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 4, 112, -2.25F, 2.9F, 2.0F, 1, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 6, 89, 1.352F, 2.8F, -1.5F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 89, 25, 1.351F, 3.2F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 89, 49, -1.95F, 3.899F, -2.1F, 4, 3, 6, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 18, 89, 1.35F, 3.2F, -1.5F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 89, 41, -2.25F, 2.8F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 88, 70, -2.251F, 2.8F, -1.5F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 89, 37, -2.251F, 3.2F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 89, -2.252F, 3.2F, -1.5F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 85, 93, 0.55F, 0.95F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 13, 93, -1.45F, 0.95F, -1.0F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 101, 37, -1.65F, 0.2F, -1.0F, 1, 1, 3, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(-1.65F, 0.2F, -1.0F);
		stock.addChild(gun11_r3);
		setRotationAngle(gun11_r3, 0.0F, 0.0F, 0.7156F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 98, 78, -0.001F, -1.45F, 0.0F, 1, 1, 3, 0.0F, false));
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 62, 99, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.75F, 0.2F, -1.0F);
		stock.addChild(gun10_r1);
		setRotationAngle(gun10_r1, 0.0F, 0.0F, -0.7156F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 26, 99, -0.999F, -1.45F, 0.0F, 1, 1, 3, 0.0F, false));
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 100, 25, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(-1.65F, 0.2F, 2.0F);
		stock.addChild(gun12_r5);
		setRotationAngle(gun12_r5, -0.1571F, 0.1571F, 0.7156F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 72, 110, 0.0F, -1.45F, -0.15F, 1, 1, 2, 0.0F, false));
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 85, 110, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(1.75F, 0.2F, 2.0F);
		stock.addChild(gun11_r4);
		setRotationAngle(gun11_r4, -0.1571F, -0.1571F, -0.7156F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 63, 110, -1.0F, -1.45F, -0.15F, 1, 1, 2, 0.0F, false));
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 95, 110, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(-1.65F, 1.2F, -1.0F);
		stock.addChild(gun10_r2);
		setRotationAngle(gun10_r2, 0.0F, 0.0F, 0.733F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 85, 97, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun9_r11 = new ModelRenderer(this);
		gun9_r11.setRotationPoint(1.75F, 1.2F, -1.0F);
		stock.addChild(gun9_r11);
		setRotationAngle(gun9_r11, 0.0F, 0.0F, -0.733F);
		gun9_r11.cubeList.add(new ModelBox(gun9_r11, 98, 74, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun12_r6 = new ModelRenderer(this);
		gun12_r6.setRotationPoint(-2.55F, 2.65F, -1.5F);
		stock.addChild(gun12_r6);
		setRotationAngle(gun12_r6, 0.0F, 0.0F, 0.8029F);
		gun12_r6.cubeList.add(new ModelBox(gun12_r6, 89, 46, -0.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun12_r6.cubeList.add(new ModelBox(gun12_r6, 8, 78, 0.0F, -2.0F, 0.5F, 1, 2, 3, 0.0F, false));

		gun13_r3 = new ModelRenderer(this);
		gun13_r3.setRotationPoint(-1.825F, 1.95F, -1.5F);
		stock.addChild(gun13_r3);
		setRotationAngle(gun13_r3, -0.7679F, 0.0F, 0.8029F);
		gun13_r3.cubeList.add(new ModelBox(gun13_r3, 24, 89, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun12_r7 = new ModelRenderer(this);
		gun12_r7.setRotationPoint(1.925F, 1.95F, -1.5F);
		stock.addChild(gun12_r7);
		setRotationAngle(gun12_r7, -0.7679F, 0.0F, -0.8029F);
		gun12_r7.cubeList.add(new ModelBox(gun12_r7, 30, 89, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun11_r5 = new ModelRenderer(this);
		gun11_r5.setRotationPoint(2.65F, 2.65F, -1.5F);
		stock.addChild(gun11_r5);
		setRotationAngle(gun11_r5, 0.0F, 0.0F, -0.8029F);
		gun11_r5.cubeList.add(new ModelBox(gun11_r5, 89, 58, -0.999F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun11_r5.cubeList.add(new ModelBox(gun11_r5, 44, 81, -1.0F, -2.0F, 0.5F, 1, 2, 3, 0.0F, false));

		gun13_r4 = new ModelRenderer(this);
		gun13_r4.setRotationPoint(-2.55F, 4.15F, -1.5F);
		stock.addChild(gun13_r4);
		setRotationAngle(gun13_r4, 0.0F, 0.0F, 0.8029F);
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 58, 41, -0.001F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 24, 94, 0.0F, -1.0F, 0.5F, 2, 1, 3, 0.0F, false));

		gun12_r8 = new ModelRenderer(this);
		gun12_r8.setRotationPoint(2.65F, 4.15F, -1.5F);
		stock.addChild(gun12_r8);
		setRotationAngle(gun12_r8, 0.0F, 0.0F, -0.8029F);
		gun12_r8.cubeList.add(new ModelBox(gun12_r8, 58, 48, -1.999F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));
		gun12_r8.cubeList.add(new ModelBox(gun12_r8, 72, 98, -2.0F, -1.0F, 0.5F, 2, 1, 3, 0.0F, false));

		gun13_r5 = new ModelRenderer(this);
		gun13_r5.setRotationPoint(-2.55F, 4.15F, 2.0F);
		stock.addChild(gun13_r5);
		setRotationAngle(gun13_r5, 0.0F, 0.192F, -0.8029F);
		gun13_r5.cubeList.add(new ModelBox(gun13_r5, 58, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun12_r9 = new ModelRenderer(this);
		gun12_r9.setRotationPoint(-2.55F, 2.65F, 2.0F);
		stock.addChild(gun12_r9);
		setRotationAngle(gun12_r9, 0.0F, 0.192F, 0.8029F);
		gun12_r9.cubeList.add(new ModelBox(gun12_r9, 58, 17, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun12_r10 = new ModelRenderer(this);
		gun12_r10.setRotationPoint(2.65F, 4.15F, 2.0F);
		stock.addChild(gun12_r10);
		setRotationAngle(gun12_r10, 0.0F, -0.192F, 0.8029F);
		gun12_r10.cubeList.add(new ModelBox(gun12_r10, 58, 8, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun14_r5 = new ModelRenderer(this);
		gun14_r5.setRotationPoint(-2.55F, 4.15F, 2.0F);
		stock.addChild(gun14_r5);
		setRotationAngle(gun14_r5, 0.1396F, 0.1396F, 0.0F);
		gun14_r5.cubeList.add(new ModelBox(gun14_r5, 76, 111, 0.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun13_r6 = new ModelRenderer(this);
		gun13_r6.setRotationPoint(2.65F, 4.15F, 2.0F);
		stock.addChild(gun13_r6);
		setRotationAngle(gun13_r6, 0.1396F, -0.1396F, 0.0F);
		gun13_r6.cubeList.add(new ModelBox(gun13_r6, 112, 0, -0.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun13_r7 = new ModelRenderer(this);
		gun13_r7.setRotationPoint(-2.55F, 2.65F, 2.0F);
		stock.addChild(gun13_r7);
		setRotationAngle(gun13_r7, -0.1396F, 0.1396F, 0.0F);
		gun13_r7.cubeList.add(new ModelBox(gun13_r7, 13, 111, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun12_r11 = new ModelRenderer(this);
		gun12_r11.setRotationPoint(2.65F, 2.65F, 2.0F);
		stock.addChild(gun12_r11);
		setRotationAngle(gun12_r11, -0.1396F, -0.1396F, 0.0F);
		gun12_r11.cubeList.add(new ModelBox(gun12_r11, 112, 3, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r6 = new ModelRenderer(this);
		gun11_r6.setRotationPoint(2.65F, 2.65F, 2.0F);
		stock.addChild(gun11_r6);
		setRotationAngle(gun11_r6, 0.0F, -0.192F, -0.8029F);
		gun11_r6.cubeList.add(new ModelBox(gun11_r6, 58, 25, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun14_r6 = new ModelRenderer(this);
		gun14_r6.setRotationPoint(-1.25F, 5.25F, 0.8F);
		stock.addChild(gun14_r6);
		setRotationAngle(gun14_r6, -0.3491F, 0.0F, 0.0F);
		gun14_r6.cubeList.add(new ModelBox(gun14_r6, 58, 37, -1.0F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));
		gun14_r6.cubeList.add(new ModelBox(gun14_r6, 8, 65, 2.6F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));

		gun13_r8 = new ModelRenderer(this);
		gun13_r8.setRotationPoint(-1.25F, 5.25F, -1.7F);
		stock.addChild(gun13_r8);
		setRotationAngle(gun13_r8, -0.3491F, 0.0F, 0.0F);
		gun13_r8.cubeList.add(new ModelBox(gun13_r8, 58, 44, -1.0F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));
		gun13_r8.cubeList.add(new ModelBox(gun13_r8, 65, 56, 2.6F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-1.65F, 1.2F, 2.0F);
		stock.addChild(gun10_r3);
		setRotationAngle(gun10_r3, 0.0F, 0.0F, 0.3142F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 49, 8, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun11_r7 = new ModelRenderer(this);
		gun11_r7.setRotationPoint(-1.85F, 0.8F, 0.25F);
		stock.addChild(gun11_r7);
		setRotationAngle(gun11_r7, 0.0F, 0.0F, 0.2618F);
		gun11_r7.cubeList.add(new ModelBox(gun11_r7, 0, 0, 0.0F, -1.0F, 0.0F, 1, 3, 1, -0.2F, false));

		gun10_r4 = new ModelRenderer(this);
		gun10_r4.setRotationPoint(1.95F, 0.8F, 0.25F);
		stock.addChild(gun10_r4);
		setRotationAngle(gun10_r4, 0.0F, 0.0F, -0.2618F);
		gun10_r4.cubeList.add(new ModelBox(gun10_r4, 12, 0, -1.0F, -1.0F, 0.0F, 1, 3, 1, -0.2F, false));

		gun9_r12 = new ModelRenderer(this);
		gun9_r12.setRotationPoint(1.75F, 1.2F, 2.0F);
		stock.addChild(gun9_r12);
		setRotationAngle(gun9_r12, 0.0F, 0.0F, -0.3142F);
		gun9_r12.cubeList.add(new ModelBox(gun9_r12, 55, 56, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun10_r5 = new ModelRenderer(this);
		gun10_r5.setRotationPoint(-0.65F, 0.2F, 2.0F);
		stock.addChild(gun10_r5);
		setRotationAngle(gun10_r5, -0.2182F, 0.0F, 0.0F);
		gun10_r5.cubeList.add(new ModelBox(gun10_r5, 106, 110, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun10_r5.cubeList.add(new ModelBox(gun10_r5, 0, 111, 1.4F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun9_r13 = new ModelRenderer(this);
		gun9_r13.setRotationPoint(0.3F, -0.9F, 2.0F);
		stock.addChild(gun9_r13);
		setRotationAngle(gun9_r13, -0.2182F, 0.0F, 0.0F);
		gun9_r13.cubeList.add(new ModelBox(gun9_r13, 80, 81, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun9_r13.cubeList.add(new ModelBox(gun9_r13, 112, 12, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun12_r12 = new ModelRenderer(this);
		gun12_r12.setRotationPoint(0.4F, 6.85F, 7.9F);
		stock.addChild(gun12_r12);
		setRotationAngle(gun12_r12, -0.3491F, 0.0F, 0.0F);
		gun12_r12.cubeList.add(new ModelBox(gun12_r12, 169, 200, -1.951F, -3.0F, 0.0F, 2, 3, 19, 0.0F, false));
		gun12_r12.cubeList.add(new ModelBox(gun12_r12, 81, 201, -0.749F, -3.0F, 0.0F, 2, 3, 19, 0.0F, false));

		gun12_r13 = new ModelRenderer(this);
		gun12_r13.setRotationPoint(-1.85F, 6.85F, 3.9F);
		stock.addChild(gun12_r13);
		setRotationAngle(gun12_r13, 0.0F, 0.192F, 0.0F);
		gun12_r13.cubeList.add(new ModelBox(gun12_r13, 28, 0, 0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun11_r8 = new ModelRenderer(this);
		gun11_r8.setRotationPoint(1.95F, 6.85F, 3.9F);
		stock.addChild(gun11_r8);
		setRotationAngle(gun11_r8, 0.0F, -0.192F, 0.0F);
		gun11_r8.cubeList.add(new ModelBox(gun11_r8, 28, 9, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		gun11_r9 = new ModelRenderer(this);
		gun11_r9.setRotationPoint(-0.7F, 2.6F, 7.9F);
		stock.addChild(gun11_r9);
		setRotationAngle(gun11_r9, 0.0F, 0.0F, 0.9425F);
		gun11_r9.cubeList.add(new ModelBox(gun11_r9, 36, 202, 0.0F, 0.0F, -1.0F, 1, 1, 20, 0.0F, false));

		gun10_r6 = new ModelRenderer(this);
		gun10_r6.setRotationPoint(0.8F, 2.6F, 7.9F);
		stock.addChild(gun10_r6);
		setRotationAngle(gun10_r6, 0.0F, 0.0F, -0.9425F);
		gun10_r6.cubeList.add(new ModelBox(gun10_r6, 202, 57, -1.0F, 0.0F, -1.0F, 1, 1, 20, 0.0F, false));

		gun12_r14 = new ModelRenderer(this);
		gun12_r14.setRotationPoint(-1.75F, 2.2F, 26.9F);
		stock.addChild(gun12_r14);
		setRotationAngle(gun12_r14, -0.0349F, 0.0F, 0.0F);
		gun12_r14.cubeList.add(new ModelBox(gun12_r14, 28, 72, 0.0F, 1.0F, 0.0F, 1, 10, 2, 0.0F, false));
		gun12_r14.cubeList.add(new ModelBox(gun12_r14, 28, 124, 2.6F, 1.0F, 0.0F, 1, 10, 2, 0.0F, false));

		gun12_r15 = new ModelRenderer(this);
		gun12_r15.setRotationPoint(-0.95F, 2.5F, 26.9F);
		stock.addChild(gun12_r15);
		setRotationAngle(gun12_r15, -0.0262F, 0.0262F, 0.9076F);
		gun12_r15.cubeList.add(new ModelBox(gun12_r15, 36, 84, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r10 = new ModelRenderer(this);
		gun11_r10.setRotationPoint(1.05F, 2.5F, 26.9F);
		stock.addChild(gun11_r10);
		setRotationAngle(gun11_r10, -0.0262F, -0.0262F, -0.9076F);
		gun11_r10.cubeList.add(new ModelBox(gun11_r10, 54, 84, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun10_r7 = new ModelRenderer(this);
		gun10_r7.setRotationPoint(1.05F, 2.5F, 26.9F);
		stock.addChild(gun10_r7);
		setRotationAngle(gun10_r7, -0.0349F, 0.0F, 0.0F);
		gun10_r7.cubeList.add(new ModelBox(gun10_r7, 18, 72, -2.0F, 0.0F, 0.0F, 2, 11, 2, 0.0F, false));

		gun11_r11 = new ModelRenderer(this);
		gun11_r11.setRotationPoint(0.45F, 1.8F, 5.0F);
		stock.addChild(gun11_r11);
		setRotationAngle(gun11_r11, -0.4974F, 0.0F, 0.0F);
		gun11_r11.cubeList.add(new ModelBox(gun11_r11, 89, 61, -2.002F, -0.05F, 0.0F, 2, 2, 3, 0.0F, false));
		gun11_r11.cubeList.add(new ModelBox(gun11_r11, 0, 94, -0.802F, -0.05F, 0.0F, 2, 2, 3, 0.0F, false));

		gun11_r12 = new ModelRenderer(this);
		gun11_r12.setRotationPoint(-0.7F, 1.0F, 5.0F);
		stock.addChild(gun11_r12);
		setRotationAngle(gun11_r12, -0.3229F, 0.384F, 0.8378F);
		gun11_r12.cubeList.add(new ModelBox(gun11_r12, 0, 89, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun10_r8 = new ModelRenderer(this);
		gun10_r8.setRotationPoint(0.8F, 1.0F, 5.0F);
		stock.addChild(gun10_r8);
		setRotationAngle(gun10_r8, -0.3229F, -0.384F, -0.8378F);
		gun10_r8.cubeList.add(new ModelBox(gun10_r8, 24, 89, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun10_r9 = new ModelRenderer(this);
		gun10_r9.setRotationPoint(1.8F, 1.0F, 5.0F);
		stock.addChild(gun10_r9);
		setRotationAngle(gun10_r9, -0.4974F, 0.0F, 0.0F);
		gun10_r9.cubeList.add(new ModelBox(gun10_r9, 76, 43, -2.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
		gun10_r9.cubeList.add(new ModelBox(gun10_r9, 95, 93, -2.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun10_r10 = new ModelRenderer(this);
		gun10_r10.setRotationPoint(0.45F, 0.5F, 4.1F);
		stock.addChild(gun10_r10);
		setRotationAngle(gun10_r10, -0.829F, 0.0F, 0.0F);
		gun10_r10.cubeList.add(new ModelBox(gun10_r10, 36, 91, -1.999F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));
		gun10_r10.cubeList.add(new ModelBox(gun10_r10, 72, 93, -0.799F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

		gun12_r16 = new ModelRenderer(this);
		gun12_r16.setRotationPoint(-2.1F, 2.9F, 4.0F);
		stock.addChild(gun12_r16);
		setRotationAngle(gun12_r16, 0.0F, 0.1396F, 0.3142F);
		gun12_r16.cubeList.add(new ModelBox(gun12_r16, 58, 88, 0.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun14_r7 = new ModelRenderer(this);
		gun14_r7.setRotationPoint(-2.1F, 2.9F, 4.0F);
		stock.addChild(gun14_r7);
		setRotationAngle(gun14_r7, 0.0F, 0.1396F, 0.3142F);
		gun14_r7.cubeList.add(new ModelBox(gun14_r7, 40, 88, 0.0F, -1.65F, 0.0F, 1, 1, 1, 0.0F, false));

		gun13_r9 = new ModelRenderer(this);
		gun13_r9.setRotationPoint(2.2F, 2.9F, 4.0F);
		stock.addChild(gun13_r9);
		setRotationAngle(gun13_r9, 0.0F, -0.1396F, -0.3142F);
		gun13_r9.cubeList.add(new ModelBox(gun13_r9, 48, 88, -1.0F, -1.65F, 0.0F, 1, 1, 1, 0.0F, false));
		gun13_r9.cubeList.add(new ModelBox(gun13_r9, 54, 88, -0.999F, -2.0F, -0.3F, 1, 1, 1, 0.0F, false));
		gun13_r9.cubeList.add(new ModelBox(gun13_r9, 62, 88, -0.999F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun13_r10 = new ModelRenderer(this);
		gun13_r10.setRotationPoint(-2.1F, 2.9F, 4.0F);
		stock.addChild(gun13_r10);
		setRotationAngle(gun13_r10, 0.0F, 0.1396F, 0.3142F);
		gun13_r10.cubeList.add(new ModelBox(gun13_r10, 44, 88, 0.001F, -2.0F, -0.3F, 1, 1, 1, 0.0F, false));

		gun11_r13 = new ModelRenderer(this);
		gun11_r13.setRotationPoint(-1.95F, 2.9F, 5.0F);
		stock.addChild(gun11_r13);
		setRotationAngle(gun11_r13, 0.0F, 0.1571F, 0.0F);
		gun11_r13.cubeList.add(new ModelBox(gun11_r13, 26, 86, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun12_r17 = new ModelRenderer(this);
		gun12_r17.setRotationPoint(-1.95F, 2.9F, 5.0F);
		stock.addChild(gun12_r17);
		setRotationAngle(gun12_r17, 0.0F, 0.3665F, 0.3142F);
		gun12_r17.cubeList.add(new ModelBox(gun12_r17, 18, 86, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun13_r11 = new ModelRenderer(this);
		gun13_r11.setRotationPoint(-1.95F, 2.9F, 5.0F);
		stock.addChild(gun13_r11);
		setRotationAngle(gun13_r11, 0.0F, 0.3665F, 0.0F);
		gun13_r11.cubeList.add(new ModelBox(gun13_r11, 36, 109, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun12_r18 = new ModelRenderer(this);
		gun12_r18.setRotationPoint(2.05F, 2.9F, 5.0F);
		stock.addChild(gun12_r18);
		setRotationAngle(gun12_r18, 0.0F, -0.3665F, 0.0F);
		gun12_r18.cubeList.add(new ModelBox(gun12_r18, 49, 109, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun11_r14 = new ModelRenderer(this);
		gun11_r14.setRotationPoint(2.05F, 2.9F, 5.0F);
		stock.addChild(gun11_r14);
		setRotationAngle(gun11_r14, 0.0F, -0.3665F, -0.3142F);
		gun11_r14.cubeList.add(new ModelBox(gun11_r14, 22, 86, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun14_r8 = new ModelRenderer(this);
		gun14_r8.setRotationPoint(2.05F, 3.9F, 5.0F);
		stock.addChild(gun14_r8);
		setRotationAngle(gun14_r8, -0.2531F, -0.2705F, 0.7679F);
		gun14_r8.cubeList.add(new ModelBox(gun14_r8, 108, 100, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun13_r12 = new ModelRenderer(this);
		gun13_r12.setRotationPoint(-1.95F, 3.9F, 5.0F);
		stock.addChild(gun13_r12);
		setRotationAngle(gun13_r12, -0.2531F, 0.2705F, -0.7679F);
		gun13_r12.cubeList.add(new ModelBox(gun13_r12, 108, 105, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun12_r19 = new ModelRenderer(this);
		gun12_r19.setRotationPoint(-1.95F, 3.9F, 5.0F);
		stock.addChild(gun12_r19);
		setRotationAngle(gun12_r19, -0.1047F, 0.1222F, -0.7679F);
		gun12_r19.cubeList.add(new ModelBox(gun12_r19, 86, 0, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun11_r15 = new ModelRenderer(this);
		gun11_r15.setRotationPoint(2.05F, 3.9F, 5.0F);
		stock.addChild(gun11_r15);
		setRotationAngle(gun11_r15, -0.1047F, -0.1222F, 0.7679F);
		gun11_r15.cubeList.add(new ModelBox(gun11_r15, 86, 2, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun10_r11 = new ModelRenderer(this);
		gun10_r11.setRotationPoint(2.05F, 2.9F, 5.0F);
		stock.addChild(gun10_r11);
		setRotationAngle(gun10_r11, 0.0F, -0.1571F, 0.0F);
		gun10_r11.cubeList.add(new ModelBox(gun10_r11, 66, 88, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		gun10_r12 = new ModelRenderer(this);
		gun10_r12.setRotationPoint(-0.7F, -0.4F, 4.0F);
		stock.addChild(gun10_r12);
		setRotationAngle(gun10_r12, -0.5149F, 0.6807F, 0.8378F);
		gun10_r12.cubeList.add(new ModelBox(gun10_r12, 59, 109, 0.0F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));
		gun10_r12.cubeList.add(new ModelBox(gun10_r12, 30, 86, -0.001F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

		gun10_r13 = new ModelRenderer(this);
		gun10_r13.setRotationPoint(0.8F, -0.4F, 4.0F);
		stock.addChild(gun10_r13);
		setRotationAngle(gun10_r13, -0.5149F, -0.6807F, -0.8378F);
		gun10_r13.cubeList.add(new ModelBox(gun10_r13, 36, 88, -1.001F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));
		gun10_r13.cubeList.add(new ModelBox(gun10_r13, 40, 110, -1.0F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

		gun9_r14 = new ModelRenderer(this);
		gun9_r14.setRotationPoint(1.8F, -0.4F, 4.0F);
		stock.addChild(gun9_r14);
		setRotationAngle(gun9_r14, -0.829F, 0.0F, 0.0F);
		gun9_r14.cubeList.add(new ModelBox(gun9_r14, 88, 78, -2.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		gun9_r14.cubeList.add(new ModelBox(gun9_r14, 89, 21, -2.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		mag = new QRenderer(this);
		mag.setRotationPoint(0.0F, -8.0F, -17.7F);
		mag.cubeList.add(new ModelBox(mag, 88, 74, -0.848F, -1.7F, -7.45F, 1, 1, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 58, 44, -0.748F, -1.6F, -6.45F, 1, 1, 6, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 55, 64, -2.748F, -1.1F, -1.45F, 3, 1, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 54, 68, -0.748F, -1.1F, -6.45F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 58, 37, -3.248F, -1.6F, -6.45F, 1, 1, 6, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 72, 81, -3.248F, -1.1F, -1.45F, 1, 1, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 58, 68, -3.248F, -1.1F, -6.45F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 16, 55, -3.148F, -1.7F, -7.45F, 1, 1, 8, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.15F, 3.1F, -0.9F);
		mag.addChild(cube_r18);
		setRotationAngle(cube_r18, -1.6842F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 19, -1.002F, 3.2F, -2.4F, 1, 4, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 18, 0, -1.001F, 3.2F, -4.0F, 1, 4, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 55, -1.0F, 0.0F, -4.0F, 1, 4, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 76, 27, -1.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 62, 74, -0.698F, 3.2F, -2.4F, 3, 4, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 56, -0.699F, 3.2F, -4.0F, 3, 4, 2, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 0, 128, -0.7F, 0.0F, -4.0F, 3, 4, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 16, 64, -0.7F, -1.0F, -4.0F, 3, 1, 4, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.15F, -1.7F, 0.55F);
		mag.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.5411F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 38, 62, 0.002F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.15F, -1.7F, 0.55F);
		mag.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, -0.5411F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 62, 64, -0.998F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-2.15F, 3.1F, -0.9F);
		mag.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.3142F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 82, 56, -1.0F, -1.0F, -7.3F, 1, 1, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 0, -1.0F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 14, -0.7F, -1.0F, -7.3F, 3, 1, 1, 0.0F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 40, 8, 1.3F, -1.0F, -7.0F, 1, 1, 7, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -0.9F, 0.5F);
		mag.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 18, 36, -3.0F, 0.3F, -7.1F, 3, 15, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 26, 36, -3.0F, 0.3F, -8.0F, 3, 15, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 17, -3.0F, 0.3F, -5.2F, 3, 14, 1, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 24, 107, -3.0F, 0.3F, -3.6F, 3, 15, 2, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 38, 47, -3.0F, 14.3F, -6.6F, 3, 1, 3, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 76, 0, -2.8F, 0.299F, -7.0F, 2, 15, 6, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 92, 0, -1.2F, 0.299F, -7.0F, 1, 15, 6, 0.0F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 40, 17, -3.0F, 0.3F, -1.0F, 3, 15, 1, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-3.1F, 14.1F, -6.1F);
		mag.addChild(cube_r23);
		setRotationAngle(cube_r23, -0.0349F, 0.1047F, 1.1868F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 67, 8, -1.0F, -1.0F, -3.3F, 1, 1, 2, -0.2F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 26, 64, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.1F, 14.1F, -6.1F);
		mag.addChild(cube_r24);
		setRotationAngle(cube_r24, -0.0349F, -0.1047F, -1.1868F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 67, 11, 0.0F, -1.0F, -3.3F, 1, 1, 2, -0.2F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 88, 74, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.2F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.4F, 3.9F, -1.6F);
		mag.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.1047F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 0, 48, -1.0F, 8.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 62, 1.8F, 8.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 38, 40, -1.0F, 8.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 16, 66, 1.8F, 8.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 74, -1.0F, 8.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 76, 64, 1.8F, 8.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 67, 17, -1.0F, 8.3F, -2.0F, 1, 1, 2, -0.3F, false));
		cube_r25.cubeList.add(new ModelBox(cube_r25, 80, 74, 1.8F, 8.3F, -2.0F, 1, 1, 2, -0.3F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-2.4F, 3.7F, -1.6F);
		mag.addChild(cube_r26);
		setRotationAngle(cube_r26, -0.1047F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 11, 48, -1.0F, 6.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 44, 62, 1.8F, 6.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 30, 32, -1.0F, 6.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 66, 41, 1.8F, 6.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 54, 74, -1.0F, 6.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 77, 1.8F, 6.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 67, 20, -1.0F, 6.3F, -2.0F, 1, 1, 2, -0.3F, false));
		cube_r26.cubeList.add(new ModelBox(cube_r26, 80, 77, 1.8F, 6.3F, -2.0F, 1, 1, 2, -0.3F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-2.4F, 3.5F, -1.6F);
		mag.addChild(cube_r27);
		setRotationAngle(cube_r27, -0.1047F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 10, 58, -1.0F, 4.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 64, 1.8F, 4.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 29, 22, -1.0F, 4.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 66, 48, 1.8F, 4.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 72, 74, -1.0F, 4.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 54, 77, 1.8F, 4.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 25, -1.0F, 4.3F, -2.0F, 1, 1, 2, -0.3F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 81, 1.8F, 4.3F, -2.0F, 1, 1, 2, -0.3F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.4F, 3.3F, -1.6F);
		mag.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.1047F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 60, -1.0F, 2.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 38, 64, 1.8F, 2.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 16, 22, -1.0F, 2.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 67, 5, 1.8F, 2.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 76, 0, -1.0F, 2.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 78, 1.8F, 2.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 67, 28, -1.0F, 2.3F, -2.0F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 36, 81, 1.8F, 2.3F, -2.0F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 10, 62, -1.0F, 0.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 44, 64, 1.8F, 0.3F, -3.7F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 47, 40, -1.0F, 0.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 30, 68, 1.8F, 0.3F, -3.4F, 1, 1, 1, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 76, 3, -1.0F, 0.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 72, 77, 1.8F, 0.3F, -6.4F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 76, 61, -1.0F, 0.3F, -2.0F, 1, 1, 2, -0.3F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 54, 81, 1.8F, 0.3F, -2.0F, 1, 1, 2, -0.3F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.35F, 1.0F, -6.0F);
		mag.addChild(bone2);
		setRotationAngle(bone2, -0.3142F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 82, 54, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, 0.0F, 0.6981F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 82, 51, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, -1.0F, -1.0F);
		bone2.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, -1.1519F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 82, 45, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone2.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0F, 1.1519F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 82, 49, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.35F, 0.7F, -6.95F);
		mag.addChild(bone5);
		setRotationAngle(bone5, 0.3142F, 3.1416F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 76, 49, -1.0F, -1.0F, -1.05F, 1, 1, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.0F, 0.0F, -0.05F);
		bone5.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, 0.6981F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 76, 29, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.0F, -1.0F, -1.05F);
		bone5.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -1.1519F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 76, 43, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.0F, -1.0F, -0.05F);
		bone5.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 1.1519F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 76, 45, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.35F, 1.5F, -4.35F);
		mag.addChild(bone6);
		setRotationAngle(bone6, 0.3142F, 3.1416F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 76, 27, -1.0F, -1.0F, -0.95F, 1, 1, 1, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.0F, 0.0F, 0.05F);
		bone6.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 0.0F, 0.6981F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 24, 72, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.0F, -1.0F, -0.95F);
		bone6.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, -1.1519F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 74, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(0.0F, -1.0F, 0.05F);
		bone6.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 1.1519F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 11, 74, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.35F, 2.3F, -1.88F);
		mag.addChild(bone7);
		setRotationAngle(bone7, 0.3142F, 3.1416F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 11, 72, -1.0F, -1.0F, -0.92F, 1, 1, 1, 0.0F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.0F, 0.0F, 0.08F);
		bone7.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, 0.6981F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 68, 64, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.0F, -1.0F, -0.92F);
		bone7.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, -1.1519F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 68, 66, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.0F, -1.0F, 0.08F);
		bone7.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 1.1519F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 72, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.35F, 1.8F, -3.4F);
		mag.addChild(bone3);
		setRotationAngle(bone3, -0.3142F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 82, 43, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, 0.0F, 0.6981F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 80, 70, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(0.0F, -1.0F, -1.0F);
		bone3.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, -1.1519F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 82, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone3.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 1.1519F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 82, 29, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.35F, 2.6F, -1.0F);
		mag.addChild(bone4);
		setRotationAngle(bone4, -0.3142F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 76, 70, -1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.0F, 0.6981F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 76, 51, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(0.0F, -1.0F, -1.0F);
		bone4.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, -1.1519F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 76, 54, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone4.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 1.1519F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 76, 56, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		handguard_a3 = new QRenderer(this);
		handguard_a3.setRotationPoint(1.0F, -11.2F, -31.5F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-5.0F, 0.6F, 1.0F);
		handguard_a3.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0087F, -0.015F, -0.5411F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 112, 35, 0.0F, 0.0F, -32.0F, 1, 1, 32, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.6F, 1.0F);
		handguard_a3.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0087F, 0.015F, 0.5411F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 106, 140, -1.0F, 0.0F, -32.0F, 1, 1, 32, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-3.1F, -0.4F, -30.8F);
		handguard_a3.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 0.0175F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 49, 12, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-0.8F, -0.4F, -30.8F);
		handguard_a3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0175F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 58, 12, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-3.1F, -0.4F, -31.0F);
		handguard_a3.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.1571F, 0.0175F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 58, 4, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 27, 29, -1.051F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.8F, -0.4F, -31.0F);
		handguard_a3.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.1571F, 0.0175F, 0.0F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 58, 21, -1.05F, -1.6F, 0.0F, 1, 1, 2, 0.0F, false));
		cube_r52.cubeList.add(new ModelBox(cube_r52, 58, 29, -1.049F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.0F, 0.0F, 1.0F);
		handguard_a3.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0175F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 34, 143, -1.0F, -0.4F, -32.0F, 1, 1, 32, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 146, 0, -1.0F, -1.0F, -30.0F, 1, 1, 30, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-5.0F, 0.6F, 1.0F);
		handguard_a3.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, -0.0175F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 0, 142, 0.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 68, 144, 0.0F, -1.6F, -30.0F, 1, 1, 30, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-3.5F, 2.0F, 1.0F);
		handguard_a3.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.0087F, -0.0122F, 0.4712F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 72, 111, -1.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-1.5F, 2.0F, 1.0F);
		handguard_a3.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.0087F, 0.0122F, -0.4712F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 112, 0, 0.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-3.5F, 2.0F, 1.0F);
		handguard_a3.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.0017F, -0.0148F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 38, 110, 0.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-1.5F, 2.0F, 1.0F);
		handguard_a3.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.0017F, 0.0148F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 140, 141, -1.0F, -1.0F, -32.0F, 1, 1, 32, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-5.0F, -1.0F, 1.0F);
		handguard_a3.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.0122F, -0.0122F, 0.8029F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 144, 68, 0.0F, -2.0F, -30.0F, 1, 2, 30, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.0F, -1.0F, 1.0F);
		handguard_a3.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.0122F, 0.0122F, -0.8029F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 144, 105, -1.0F, -2.0F, -30.0F, 1, 2, 30, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
//		charginghandle.render(f5);
//		stock.render(f5);
//		mag.render(f5);
//		handguard_a3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
