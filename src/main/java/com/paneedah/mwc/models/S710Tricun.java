package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class S710Tricun extends ModelWithAttachments {
	private final ModelRenderer receiver_10mm;
	private final ModelRenderer receiver25_r1;
	private final ModelRenderer receiver27_r1;
	private final ModelRenderer receiver27_r2;
	private final ModelRenderer receiver26_r1;
	private final ModelRenderer receiver27_r3;
	private final ModelRenderer receiver24_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun140_r1;
	private final ModelRenderer gun274_r1;
	private final ModelRenderer gun275_r1;
	private final ModelRenderer gun275_r2;
	private final ModelRenderer gun272_r1;
	private final ModelRenderer receiver7_r1;
	private final ModelRenderer receiver9_r1;
	private final ModelRenderer receiver10_r1;
	private final ModelRenderer receiver9_r2;
	private final ModelRenderer receiver8_r1;
	private final ModelRenderer receiver25;
	private final ModelRenderer receiver23;
	private final ModelRenderer receiver17;
	private final ModelRenderer receiver16;
	private final ModelRenderer receiver15;
	private final ModelRenderer receiver9;
	private final ModelRenderer receiver6;
	private final ModelRenderer gun264;
	private final ModelRenderer gun263;
	private final ModelRenderer gun262;
	private final ModelRenderer gun259;
	private final ModelRenderer gun;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun48_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer gun48_r2;
	private final ModelRenderer gun49_r2;
	private final ModelRenderer gun48_r3;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun54_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun60_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun69_r2;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun67_r1;
	private final ModelRenderer gun77_r1;
	private final ModelRenderer gun76_r1;
	private final ModelRenderer gun77_r2;
	private final ModelRenderer gun76_r2;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun118_r2;
	private final ModelRenderer gun119_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun152_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone_r2;
	private final ModelRenderer barrel;
	private final ModelRenderer handguard;
	private final ModelRenderer gun63_r2;
	private final ModelRenderer gun62_r1;
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
	private final ModelRenderer rail;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun63_r3;
	private final ModelRenderer gun62_r2;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer grip;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r27;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer action_pully;
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
	private final ModelRenderer action_ejector;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;

	public S710Tricun() {
		textureWidth = 200;
		textureHeight = 200;

		receiver_10mm = new ModelRenderer(this);
		receiver_10mm.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 55, 91, -0.2F, -38.0F, 0.6F, 1, 1, 1, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 52, 62, -0.6F, -39.3F, -19.5F, 1, 2, 3, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 84, 21, -3.7F, -38.0F, -22.4F, 1, 1, 2, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 118, 59, -3.7F, -38.0F, -11.7F, 1, 1, 13, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 48, 91, -0.3F, -38.0F, -0.4F, 1, 1, 1, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 0, 85, -0.3F, -38.0F, -22.4F, 1, 2, 1, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 85, 96, -0.4F, -38.0F, -21.4F, 1, 2, 6, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 69, 62, -0.4F, -38.0F, -11.4F, 1, 2, 2, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 0, 52, -0.4F, -38.0F, -9.4F, 1, 1, 9, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 24, 83, -0.3F, -38.0F, -12.4F, 1, 2, 1, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 78, 73, -0.3F, -38.0F, -15.4F, 1, 2, 1, 0.0F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 67, 29, -0.099F, -38.2F, -14.9F, 1, 1, 3, -0.2F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 79, 25, 0.001F, -36.7F, -22.1F, 1, 1, 7, -0.3F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 78, 78, 0.001F, -38.3F, -22.1F, 1, 1, 7, -0.3F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 129, 100, 0.001F, -38.3F, -12.1F, 1, 1, 12, -0.3F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 67, 25, 0.001F, -36.7F, -12.1F, 1, 1, 3, -0.3F, false));
		receiver_10mm.cubeList.add(new ModelBox(receiver_10mm, 52, 52, 0.0F, -37.7F, -8.3F, 1, 1, 9, -0.3F, false));

		receiver25_r1 = new ModelRenderer(this);
		receiver25_r1.setRotationPoint(-3.8F, -38.0F, 0.6F);
		receiver_10mm.addChild(receiver25_r1);
		setRotationAngle(receiver25_r1, 0.0F, 0.0F, -2.2689F);
		receiver25_r1.cubeList.add(new ModelBox(receiver25_r1, 79, 33, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver27_r1 = new ModelRenderer(this);
		receiver27_r1.setRotationPoint(-3.7F, -38.0F, -11.4F);
		receiver_10mm.addChild(receiver27_r1);
		setRotationAngle(receiver27_r1, 0.0F, 0.0F, -2.2689F);
		receiver27_r1.cubeList.add(new ModelBox(receiver27_r1, 120, 86, -1.0F, 0.0F, 0.0F, 1, 2, 12, 0.0F, false));
		receiver27_r1.cubeList.add(new ModelBox(receiver27_r1, 54, 74, -1.0F, 0.0F, -11.0F, 1, 2, 2, 0.0F, false));

		receiver27_r2 = new ModelRenderer(this);
		receiver27_r2.setRotationPoint(0.6F, -38.0F, -15.4F);
		receiver_10mm.addChild(receiver27_r2);
		setRotationAngle(receiver27_r2, 0.0F, 0.0F, 2.2689F);
		receiver27_r2.cubeList.add(new ModelBox(receiver27_r2, 101, 21, 0.1F, 0.0F, 0.0F, 1, 2, 15, 0.0F, false));

		receiver26_r1 = new ModelRenderer(this);
		receiver26_r1.setRotationPoint(0.7F, -38.0F, -0.4F);
		receiver_10mm.addChild(receiver26_r1);
		setRotationAngle(receiver26_r1, 0.0F, 0.0F, 2.2689F);
		receiver26_r1.cubeList.add(new ModelBox(receiver26_r1, 72, 25, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		receiver26_r1.cubeList.add(new ModelBox(receiver26_r1, 0, 76, 0.0F, 0.0F, -22.0F, 1, 2, 7, 0.0F, false));

		receiver27_r3 = new ModelRenderer(this);
		receiver27_r3.setRotationPoint(1.15F, -38.02F, -15.7F);
		receiver_10mm.addChild(receiver27_r3);
		setRotationAngle(receiver27_r3, 0.0F, 0.0F, 2.2689F);
		receiver27_r3.cubeList.add(new ModelBox(receiver27_r3, 100, 0, 0.01F, 1.03F, 0.0F, 1, 1, 16, -0.3F, false));
		receiver27_r3.cubeList.add(new ModelBox(receiver27_r3, 100, 69, 0.01F, 0.03F, 0.0F, 1, 1, 16, -0.3F, false));

		receiver24_r1 = new ModelRenderer(this);
		receiver24_r1.setRotationPoint(0.8F, -38.0F, 0.6F);
		receiver_10mm.addChild(receiver24_r1);
		setRotationAngle(receiver24_r1, 0.0F, 0.0F, 2.2689F);
		receiver24_r1.cubeList.add(new ModelBox(receiver24_r1, 16, 87, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
		receiver_10mm.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0F, -0.2603F, 0.0F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 85, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun140_r1 = new ModelRenderer(this);
		gun140_r1.setRotationPoint(-3.1F, -37.8F, -6.0F);
		receiver_10mm.addChild(gun140_r1);
		setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 51, 15, 0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
		gun140_r1.cubeList.add(new ModelBox(gun140_r1, 25, 65, 0.0F, -0.4F, 0.0F, 2, 1, 7, 0.0F, false));

		gun274_r1 = new ModelRenderer(this);
		gun274_r1.setRotationPoint(-4.58F, -37.1F, -21.0F);
		receiver_10mm.addChild(gun274_r1);
		setRotationAngle(gun274_r1, 0.0F, 0.0F, 0.0873F);
		gun274_r1.cubeList.add(new ModelBox(gun274_r1, 8, 91, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun274_r1.cubeList.add(new ModelBox(gun274_r1, 12, 91, 0.0F, 0.0F, 8.999F, 1, 1, 1, 0.0F, false));

		gun275_r1 = new ModelRenderer(this);
		gun275_r1.setRotationPoint(-4.58F, -37.1F, -21.0F);
		receiver_10mm.addChild(gun275_r1);
		setRotationAngle(gun275_r1, 0.0F, 0.0F, -0.5672F);
		gun275_r1.cubeList.add(new ModelBox(gun275_r1, 90, 88, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun275_r1.cubeList.add(new ModelBox(gun275_r1, 0, 91, 0.0F, 0.0F, 8.999F, 1, 1, 1, 0.0F, false));

		gun275_r2 = new ModelRenderer(this);
		gun275_r2.setRotationPoint(-3.98F, -37.7F, -21.0F);
		receiver_10mm.addChild(gun275_r2);
		setRotationAngle(gun275_r2, 0.0F, 0.0F, -1.0036F);
		gun275_r2.cubeList.add(new ModelBox(gun275_r2, 52, 62, 1.38F, 0.0F, 1.0F, 1, 2, 8, 0.0F, false));
		gun275_r2.cubeList.add(new ModelBox(gun275_r2, 76, 21, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));
		gun275_r2.cubeList.add(new ModelBox(gun275_r2, 77, 69, 0.0F, 0.0F, 9.0F, 3, 2, 1, 0.0F, false));

		gun272_r1 = new ModelRenderer(this);
		gun272_r1.setRotationPoint(-3.98F, -37.7F, -12.0F);
		receiver_10mm.addChild(gun272_r1);
		setRotationAngle(gun272_r1, 0.0F, 0.0F, 0.2182F);
		gun272_r1.cubeList.add(new ModelBox(gun272_r1, 70, 55, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun272_r1.cubeList.add(new ModelBox(gun272_r1, 70, 69, 0.0F, 0.0F, -9.0F, 1, 2, 1, 0.0F, false));

		receiver7_r1 = new ModelRenderer(this);
		receiver7_r1.setRotationPoint(1.0F, -35.6F, -9.5F);
		receiver_10mm.addChild(receiver7_r1);
		setRotationAngle(receiver7_r1, 0.5672F, 0.0F, 0.0F);
		receiver7_r1.cubeList.add(new ModelBox(receiver7_r1, 79, 25, -1.0F, -1.0F, 0.5F, 1, 1, 2, -0.3F, false));
		receiver7_r1.cubeList.add(new ModelBox(receiver7_r1, 14, 83, -0.999F, -1.0F, 0.0F, 1, 1, 2, -0.3F, false));

		receiver9_r1 = new ModelRenderer(this);
		receiver9_r1.setRotationPoint(0.6F, -36.1F, -9.5F);
		receiver_10mm.addChild(receiver9_r1);
		setRotationAngle(receiver9_r1, 0.6021F, 0.0F, 0.0F);
		receiver9_r1.cubeList.add(new ModelBox(receiver9_r1, 78, 78, -0.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver10_r1 = new ModelRenderer(this);
		receiver10_r1.setRotationPoint(-4.45F, -39.75F, -9.7F);
		receiver_10mm.addChild(receiver10_r1);
		setRotationAngle(receiver10_r1, 0.0F, 1.0036F, 0.2618F);
		receiver10_r1.cubeList.add(new ModelBox(receiver10_r1, 0, 52, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F, false));

		receiver9_r2 = new ModelRenderer(this);
		receiver9_r2.setRotationPoint(-4.45F, -39.75F, -10.7F);
		receiver_10mm.addChild(receiver9_r2);
		setRotationAngle(receiver9_r2, 0.0F, 0.48F, 0.2618F);
		receiver9_r2.cubeList.add(new ModelBox(receiver9_r2, 0, 4, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		receiver8_r1 = new ModelRenderer(this);
		receiver8_r1.setRotationPoint(-4.45F, -39.75F, -10.7F);
		receiver_10mm.addChild(receiver8_r1);
		setRotationAngle(receiver8_r1, 0.0F, 0.0F, 0.2618F);
		receiver8_r1.cubeList.add(new ModelBox(receiver8_r1, 0, 20, 0.0F, -0.001F, 0.0F, 2, 2, 1, 0.0F, false));

		receiver25 = new ModelRenderer(this);
		receiver25.setRotationPoint(0.8F, -37.0F, 0.5F);
		receiver_10mm.addChild(receiver25);
		setRotationAngle(receiver25, 0.0F, 0.0F, 2.042F);
		receiver25.cubeList.add(new ModelBox(receiver25, 86, 56, 0.0F, 0.0F, 0.1F, 2, 1, 1, 0.0F, false));

		receiver23 = new ModelRenderer(this);
		receiver23.setRotationPoint(-3.8F, -37.0F, 0.5F);
		receiver_10mm.addChild(receiver23);
		setRotationAngle(receiver23, 0.0F, 0.0F, -2.042F);
		receiver23.cubeList.add(new ModelBox(receiver23, 86, 52, -2.0F, 0.0F, 0.1F, 2, 1, 1, 0.0F, false));

		receiver17 = new ModelRenderer(this);
		receiver17.setRotationPoint(0.4F, -39.1F, -16.5F);
		receiver_10mm.addChild(receiver17);
		setRotationAngle(receiver17, 0.0F, 1.9333F, 0.0F);
		receiver17.cubeList.add(new ModelBox(receiver17, 86, 60, 0.0F, -0.2F, -1.0F, 1, 2, 1, 0.0F, false));

		receiver16 = new ModelRenderer(this);
		receiver16.setRotationPoint(0.4F, -39.1F, -19.5F);
		receiver_10mm.addChild(receiver16);
		setRotationAngle(receiver16, 0.0F, -1.9333F, 0.0F);
		receiver16.cubeList.add(new ModelBox(receiver16, 78, 86, 0.0F, -0.2F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver15 = new ModelRenderer(this);
		receiver15.setRotationPoint(0.4F, -39.1F, -19.5F);
		receiver_10mm.addChild(receiver15);
		setRotationAngle(receiver15, 0.0F, 0.0F, 1.9705F);
		receiver15.cubeList.add(new ModelBox(receiver15, 15, 69, -0.1842F, 0.0778F, 0.0F, 1, 1, 3, 0.0F, false));

		receiver9 = new ModelRenderer(this);
		receiver9.setRotationPoint(-3.7F, -37.0F, -22.7F);
		receiver_10mm.addChild(receiver9);
		setRotationAngle(receiver9, 0.0F, 0.0F, 2.6005F);
		receiver9.cubeList.add(new ModelBox(receiver9, 26, 49, -1.0F, -1.0F, 0.3F, 1, 1, 24, 0.0F, false));

		receiver6 = new ModelRenderer(this);
		receiver6.setRotationPoint(0.7F, -37.0F, -22.7F);
		receiver_10mm.addChild(receiver6);
		setRotationAngle(receiver6, 0.0F, 0.0F, -2.6005F);
		receiver6.cubeList.add(new ModelBox(receiver6, 26, 0, 0.0F, -2.0F, 14.3F, 1, 2, 10, 0.0F, false));
		receiver6.cubeList.add(new ModelBox(receiver6, 63, 74, 0.0F, -2.5F, 13.3F, 1, 2, 1, 0.0F, false));
		receiver6.cubeList.add(new ModelBox(receiver6, 72, 29, 0.001F, -2.3F, 13.9F, 1, 2, 1, 0.0F, false));

		gun264 = new ModelRenderer(this);
		gun264.setRotationPoint(-4.3F, -37.4F, -20.0F);
		receiver_10mm.addChild(gun264);
		setRotationAngle(gun264, 0.0F, 0.0F, 0.1665F);
		gun264.cubeList.add(new ModelBox(gun264, 56, 35, 0.0139F, 0.7278F, 0.0F, 1, 3, 8, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 40, 87, -0.2235F, 1.5336F, 3.5F, 1, 2, 1, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 66, 35, -0.0828F, 1.0824F, 0.25F, 1, 2, 3, 0.0F, false));
		gun264.cubeList.add(new ModelBox(gun264, 62, 17, -0.0828F, 1.0824F, 4.75F, 1, 2, 3, 0.0F, false));

		gun263 = new ModelRenderer(this);
		gun263.setRotationPoint(-4.1F, -37.0F, -21.5F);
		receiver_10mm.addChild(gun263);
		setRotationAngle(gun263, 0.0F, 0.0F, -0.9295F);
		gun263.cubeList.add(new ModelBox(gun263, 118, 73, -0.8194F, -0.2618F, -0.2F, 1, 1, 11, -0.2F, false));

		gun262 = new ModelRenderer(this);
		gun262.setRotationPoint(-4.3F, -36.5F, -21.0F);
		receiver_10mm.addChild(gun262);
		setRotationAngle(gun262, 0.0F, 0.0F, -1.2641F);
		

		gun259 = new ModelRenderer(this);
		gun259.setRotationPoint(-2.5125F, -39.5296F, -12.0F);
		receiver_10mm.addChild(gun259);
		setRotationAngle(gun259, 0.0F, 0.0F, -0.6458F);
		

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 0, 26, -0.05F, -36.7F, -13.9F, 1, 3, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 71, 91, -0.3F, -35.2F, -14.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 91, 7, -0.3F, -35.2F, -13.7F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 0, -2.5F, -39.3F, 0.001F, 2, 4, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 49, -3.9F, -37.9F, 1.0025F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 3, -0.1F, -37.9F, 1.002F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 0, -3.9F, -34.35F, -13.7F, 1, 2, 2, -0.25F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 64, -3.7F, -32.5F, -14.6F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 25, -3.7F, -35.2F, -20.6F, 1, 1, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 26, -0.55F, -37.7F, -21.6F, 1, 3, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 52, -3.45F, -36.7F, -21.6F, 1, 2, 11, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 26, -0.8F, -36.7F, -22.4F, 1, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 81, -1.3F, -39.5F, -1.4F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 73, -1.301F, -40.0F, -22.4F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 0, -1.302F, -40.0F, -1.9F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 0, -2.702F, -40.0F, -1.9F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 94, -1.4F, -40.5F, -22.4F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 79, 21, -2.6F, -40.5F, -22.4F, 1, 1, 20, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 91, -2.5F, -40.8F, -4.52F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 55, -2.0F, -40.8F, -0.65F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 25, -2.701F, -40.0F, -22.4F, 1, 2, 21, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 80, -2.7F, -39.5F, -1.4F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 0, -3.2F, -36.7F, -22.4F, 1, 2, 24, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 73, -3.0F, -33.35F, -1.0F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 86, -3.5F, -36.0F, 1.0F, 4, 3, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 20, -3.499F, -34.0F, -1.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 57, -3.5F, -32.1F, -5.85F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 26, -0.45F, -33.7F, -16.6F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 78, 86, -3.499F, -34.3F, -15.6F, 4, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 26, -3.499F, -35.3F, -22.4F, 4, 1, 22, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 16, -3.501F, -34.3F, -21.05F, 4, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 94, -3.3F, -35.0F, -14.0F, 3, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 48, 74, -0.7F, -35.0F, -14.0F, 1, 4, 13, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 76, -3.0F, -27.0F, -12.3F, 3, 1, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 12, -3.0F, -31.0F, -6.5F, 3, 5, 1, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(0.0F, -26.0F, -12.3F);
		gun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 0.2269F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 15, 0, -3.0F, -6.0F, 0.0F, 3, 6, 1, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-3.2F, -31.0F, -14.3F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.7854F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 38, 7, 0.2F, 1.1414F, 0.1414F, 3, 1, 2, 0.0F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(-3.2F, -31.0F, -7.8F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.7854F, 0.0F, 0.0F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 79, 42, 0.2F, 0.1414F, 0.1414F, 3, 2, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(-3.2F, -27.0F, -7.8F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.7854F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 38, 59, 0.2F, 0.1414F, 0.1414F, 3, 1, 2, 0.0F, false));

		gun48_r1 = new ModelRenderer(this);
		gun48_r1.setRotationPoint(0.5F, -32.35F, -17.0F);
		gun.addChild(gun48_r1);
		setRotationAngle(gun48_r1, 0.2182F, 0.0F, 0.0F);
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 79, 28, -1.0F, -4.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 40, 91, -0.9F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 0, 76, -0.9F, -3.0F, 0.0F, 1, 2, 2, 0.0F, false));
		gun48_r1.cubeList.add(new ModelBox(gun48_r1, 26, 39, -0.9F, 0.0F, 0.0F, 1, 6, 2, 0.0F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(-3.75F, -25.4F, -19.25F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, 0.1536F, 0.1553F, -0.7854F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 76, 8, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun48_r2 = new ModelRenderer(this);
		gun48_r2.setRotationPoint(0.75F, -25.4F, -19.25F);
		gun.addChild(gun48_r2);
		setRotationAngle(gun48_r2, 0.1536F, -0.1553F, 0.7854F);
		gun48_r2.cubeList.add(new ModelBox(gun48_r2, 77, 48, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun49_r2 = new ModelRenderer(this);
		gun49_r2.setRotationPoint(0.5F, -25.33F, -19.55F);
		gun.addChild(gun49_r2);
		setRotationAngle(gun49_r2, 0.9599F, 0.0F, 0.0F);
		gun49_r2.cubeList.add(new ModelBox(gun49_r2, 25, 60, -3.999F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun48_r3 = new ModelRenderer(this);
		gun48_r3.setRotationPoint(0.5F, -25.33F, -19.55F);
		gun.addChild(gun48_r3);
		setRotationAngle(gun48_r3, 0.2182F, 0.0F, 0.0F);
		gun48_r3.cubeList.add(new ModelBox(gun48_r3, 66, 40, -4.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(0.75F, -25.4F, -19.25F);
		gun.addChild(gun47_r1);
		setRotationAngle(gun47_r1, 0.2182F, 0.0F, 0.0F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 77, 56, -1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 26, 12, -4.5F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(0.5F, -33.7F, -21.1F);
		gun.addChild(gun45_r1);
		setRotationAngle(gun45_r1, 0.2182F, 0.0F, 0.0F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 0, 0, -4.0F, 0.0F, 0.0F, 4, 9, 7, 0.0F, false));

		gun54_r1 = new ModelRenderer(this);
		gun54_r1.setRotationPoint(0.501F, -34.3F, -22.4F);
		gun.addChild(gun54_r1);
		setRotationAngle(gun54_r1, 0.8727F, 0.0F, 0.0F);
		gun54_r1.cubeList.add(new ModelBox(gun54_r1, 38, 20, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(0.501F, -32.3F, -12.8F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -2.3562F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 11, 59, -4.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		gun60_r1 = new ModelRenderer(this);
		gun60_r1.setRotationPoint(-0.4F, -35.1F, -21.7F);
		gun.addChild(gun60_r1);
		setRotationAngle(gun60_r1, -0.3316F, 0.0F, 0.0F);
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 91, 15, -3.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun60_r1.cubeList.add(new ModelBox(gun60_r1, 91, 22, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -30.2F, -8.95F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.409F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 38, 52, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(0.5F, -31.1F, -2.85F);
		gun.addChild(gun69_r1);
		setRotationAngle(gun69_r1, -0.7854F, 0.0F, 0.0F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 26, 26, -0.999F, -4.0F, -1.0F, 1, 2, 1, 0.0F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 11, 52, -3.999F, -4.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun69_r2 = new ModelRenderer(this);
		gun69_r2.setRotationPoint(-3.5F, -32.1F, -5.85F);
		gun.addChild(gun69_r2);
		setRotationAngle(gun69_r2, 0.0F, -0.1047F, 0.0F);
		gun69_r2.cubeList.add(new ModelBox(gun69_r2, 77, 59, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(0.5F, -36.0F, 1.0F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, -1.1781F, 0.0F, 0.0F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 85, 104, -4.0F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		gun67_r1 = new ModelRenderer(this);
		gun67_r1.setRotationPoint(-3.3F, -33.5F, 1.5F);
		gun.addChild(gun67_r1);
		setRotationAngle(gun67_r1, -2.3423F, 0.0F, 0.0F);
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 99, 44, 0.3F, -0.7242F, -0.49F, 3, 2, 4, 0.0F, false));
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 62, 62, 2.599F, 0.0638F, -1.4959F, 1, 2, 5, 0.0F, false));
		gun67_r1.cubeList.add(new ModelBox(gun67_r1, 24, 83, 0.01F, 0.0638F, -1.4959F, 3, 2, 5, 0.0F, false));

		gun77_r1 = new ModelRenderer(this);
		gun77_r1.setRotationPoint(-0.5F, -40.8F, -6.9F);
		gun.addChild(gun77_r1);
		setRotationAngle(gun77_r1, 0.0F, 0.0F, -0.9163F);
		gun77_r1.cubeList.add(new ModelBox(gun77_r1, 63, 49, -0.7F, -0.3F, -0.2F, 1, 1, 5, -0.3F, false));

		gun76_r1 = new ModelRenderer(this);
		gun76_r1.setRotationPoint(-2.5F, -40.8F, -6.9F);
		gun.addChild(gun76_r1);
		setRotationAngle(gun76_r1, 0.0F, 0.0F, 0.9163F);
		gun76_r1.cubeList.add(new ModelBox(gun76_r1, 63, 55, -0.3F, -0.3F, -0.2F, 1, 1, 5, -0.3F, false));

		gun77_r2 = new ModelRenderer(this);
		gun77_r2.setRotationPoint(-0.5F, -40.8F, -0.52F);
		gun.addChild(gun77_r2);
		setRotationAngle(gun77_r2, 0.0F, -0.5236F, 0.0F);
		gun77_r2.cubeList.add(new ModelBox(gun77_r2, 30, 39, -1.0F, 0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun76_r2 = new ModelRenderer(this);
		gun76_r2.setRotationPoint(-2.5F, -40.8F, -0.52F);
		gun.addChild(gun76_r2);
		setRotationAngle(gun76_r2, 0.0F, 0.5236F, 0.0F);
		gun76_r2.cubeList.add(new ModelBox(gun76_r2, 44, 46, 0.0F, 0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(-3.7F, -32.5F, -14.6F);
		gun.addChild(gun84_r1);
		setRotationAngle(gun84_r1, -1.3439F, 0.0F, 0.0F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 18, 52, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(-3.9F, -37.9F, 1.0F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, -2.3562F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 69, 74, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(0.9F, -37.9F, 1.0F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, 0.0F, 0.0F, 2.3562F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 24, 76, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun118_r2 = new ModelRenderer(this);
		gun118_r2.setRotationPoint(0.9F, -37.0F, 1.0F);
		gun.addChild(gun118_r2);
		setRotationAngle(gun118_r2, 0.0F, 0.0F, 2.0448F);
		gun118_r2.cubeList.add(new ModelBox(gun118_r2, 36, 76, 0.089F, -0.0456F, 0.0F, 2, 2, 2, 0.0F, false));

		gun119_r1 = new ModelRenderer(this);
		gun119_r1.setRotationPoint(-3.9F, -37.0F, 1.0F);
		gun.addChild(gun119_r1);
		setRotationAngle(gun119_r1, 0.0F, 0.0F, -0.4833F);
		gun119_r1.cubeList.add(new ModelBox(gun119_r1, 9, 76, -0.0465F, 0.0885F, 0.0F, 2, 2, 2, 0.0F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-0.15F, -36.35F, -13.4F);
		gun.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.0F, 0.0F, -1.2641F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 86, 50, -0.7277F, 0.0207F, -0.35F, 2, 1, 1, -0.1F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 86, 58, -0.7277F, 0.0207F, -0.65F, 2, 1, 1, -0.1F, false));

		gun152_r1 = new ModelRenderer(this);
		gun152_r1.setRotationPoint(-0.6F, -33.1F, -6.0F);
		gun.addChild(gun152_r1);
		setRotationAngle(gun152_r1, 0.7854F, 0.0F, 0.0F);
		gun152_r1.cubeList.add(new ModelBox(gun152_r1, 67, 91, 0.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(0.8F, -32.7F, -5.6F);
		gun.addChild(gun156_r1);
		setRotationAngle(gun156_r1, -0.7505F, 0.0F, 0.0F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 35, 85, -1.0F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.1F, -32.8F, -17.1F);
		gun.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.7854F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 59, 91, -0.3636F, -0.3636F, 1.0F, 1, 1, 1, 0.0F, false));

		bone_r2 = new ModelRenderer(this);
		bone_r2.setRotationPoint(0.1F, -33.0F, -17.3F);
		gun.addChild(bone_r2);
		setRotationAngle(bone_r2, 0.0F, 0.0F, 0.7854F);
		bone_r2.cubeList.add(new ModelBox(bone_r2, 63, 91, -1.0F, -1.0F, 0.95F, 1, 1, 1, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 24.4F, 17.0F);
		barrel.cubeList.add(new ModelBox(barrel, 101, 21, -1.8F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 27, -2.2F, -37.8F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 101, 94, -2.2F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 3, 105, -1.8F, -38.2F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 18, 105, -1.6F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 105, -2.4F, -38.0F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 105, -2.0F, -37.6F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 60, -2.0F, -38.4F, -67.5F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 0, -2.2F, -38.0F, -62.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 51, 1, -1.8F, -38.0F, -62.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 52, -2.0F, -37.8F, -62.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 49, -2.0F, -38.2F, -62.5F, 1, 1, 23, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(1.0F, -14.5F, -23.4F);
		handguard.cubeList.add(new ModelBox(handguard, 70, 49, -1.099F, 0.3F, -18.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 45, 0, -4.899F, 0.3F, -18.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 116, -1.0F, 0.2F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 16, 115, -5.0F, 0.2F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 68, 115, -1.001F, 1.8F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 114, -5.001F, 1.8F, -17.2F, 1, 1, 14, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 20, -1.099F, 0.3F, -14.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 44, 26, -4.899F, 0.3F, -14.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 63, 55, -1.099F, 0.3F, -10.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 26, -4.899F, 0.3F, -10.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 63, 51, -1.099F, 0.3F, -6.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 32, 26, -4.899F, 0.3F, -6.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 52, -1.099F, 0.3F, -4.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 11, 52, -4.899F, 0.3F, -4.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 24, 77, -3.5F, 3.2F, -18.999F, 2, 1, 20, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 101, -2.2F, -2.2F, -17.0F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 99, 50, -3.8F, -2.2F, -17.0F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 72, -3.5F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 44, 65, -3.9F, -1.2F, -1.0F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 13, 62, -3.9F, -1.2F, -17.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 65, -2.1F, -1.2F, -1.0F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 56, 35, -2.1F, -1.2F, -17.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 77, 56, -3.0F, -1.0F, -15.0F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 83, -3.0F, -1.0F, -12.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 70, -3.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 60, -3.0F, -1.0F, -4.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 81, -3.0F, -1.0F, -10.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 79, -3.0F, -1.0F, -6.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 64, -3.0F, -1.0F, -2.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 25, 56, -3.501F, 4.0F, -2.6F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 86, -1.1F, 1.7F, -18.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 88, -4.9F, 1.7F, -18.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 86, -1.1F, 1.7F, -4.0F, 1, 1, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 75, -4.9F, 1.7F, -4.0F, 1, 1, 5, 0.0F, false));

		gun63_r2 = new ModelRenderer(this);
		gun63_r2.setRotationPoint(-3.7F, 3.8F, -2.2F);
		handguard.addChild(gun63_r2);
		setRotationAngle(gun63_r2, -0.3316F, 0.0F, 0.0F);
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 88, 27, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun63_r2.cubeList.add(new ModelBox(gun63_r2, 88, 29, 1.4F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-3.7F, 3.8F, -0.5F);
		handguard.addChild(gun62_r1);
		setRotationAngle(gun62_r1, -0.3316F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 88, 25, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 88, 73, 1.4F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.7F, 2.7F, -1.0F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 10, 26, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 52, 0.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 56, 0.0F, 0.0F, -10.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 45, 52, 0.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 57, 57, 0.0F, 0.0F, -14.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 51, 0, 0.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 32, 52, 0.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 5, 57, 0.0F, 0.0F, -12.0F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 11, 88, 0.0F, 1.0F, -18.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 12, 0.0F, 0.0F, -17.0F, 1, 2, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.3F, 2.7F, -1.0F);
		handguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 51, 15, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 19, 61, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 62, -1.0F, 0.0F, -10.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 25, -1.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 63, 0, -1.0F, 0.0F, -14.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 52, -1.0F, 0.0F, -2.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 61, 30, -1.0F, 0.0F, -6.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 62, -1.0F, 0.0F, -12.0F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 88, 21, -1.0F, 1.0F, -18.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 25, 65, -1.0F, 0.0F, -17.0F, 1, 2, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.05F, 2.8F, -16.2F);
		handguard.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 96, -0.95F, 1.0F, 0.0F, 1, 1, 16, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.2F, 2.8F, -16.2F);
		handguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 18, 98, -0.943F, 1.0F, 0.0F, 1, 1, 16, -0.2F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 99, 42, -0.943F, -0.4F, 0.0F, 1, 1, 16, -0.2F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-4.03F, 2.8F, -16.2F);
		handguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 97, -0.92F, -0.4F, 0.0F, 1, 1, 16, -0.2F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-4.0F, 3.4F, -19.0F);
		handguard.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6807F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 25, 69, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-1.0F, 3.4F, -19.0F);
		handguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.6807F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 71, 35, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.5F, 5.0F, -2.6F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 2.6616F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 8, 72, -1.002F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-2.5F, 5.0F, 0.4F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.4435F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 86, 48, -1.002F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0F, -1.0F, -2.0F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.8727F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 90, 5, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 33, 90, 0.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 15, 90, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 37, 90, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 24, 90, 0.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 89, 3, 0.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 77, 48, 0.0F, 0.0F, -13.0F, 1, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-2.0F, -1.0F, -2.0F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.8727F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 11, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 17, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 33, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 9, -1.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 13, -1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 35, -1.0F, 0.0F, -10.0F, 1, 1, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 77, 51, -1.0F, 0.0F, -13.0F, 1, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.76F, -0.35F, -15.0F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.3491F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 84, 116, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.24F, -0.35F, -15.0F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -0.3491F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 117, 38, -1.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.25F, -0.7F, -13.0F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.8727F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 50, 128, -0.265F, -0.17F, -0.2F, 1, 1, 12, -0.2F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.7F, -0.7F, -13.0F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -0.8727F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 129, -0.765F, -0.2F, -0.2F, 1, 1, 12, -0.2F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-4.11F, -0.5F, -15.0F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -1.0036F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 70, 96, -1.3F, 0.0F, 1.0F, 1, 1, 13, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.1F, -0.85F, -15.0F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 1.0036F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 118, 17, 0.7F, 0.0F, 1.0F, 1, 1, 13, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 52, 67, -0.2F, 0.0F, 14.0F, 2, 1, 2, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 89, 0, 0.4F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 25, 52, -0.2F, 0.0F, -2.0F, 2, 1, 3, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.9F, -0.85F, -17.0F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -1.0036F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 88, 75, -1.4F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 31, -1.8F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 56, 40, -1.8F, 0.0F, 16.0F, 2, 1, 2, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.11F, -0.5F, -18.0F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.7156F, -1.0036F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 46, 74, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.89F, -0.5F, -18.0F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, -0.7156F, 1.0036F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 76, 4, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-1.1F, -1.2F, -1.0F);
		handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.9512F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 76, 8, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-3.9F, -1.2F, -1.0F);
		handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.9512F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 76, 11, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.1F, -16.0F, -19.5F);
		rail.cubeList.add(new ModelBox(rail, 100, 69, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 0, -0.801F, -0.8F, 4.5F, 1, 1, 7, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 100, 6, -1.0F, -1.0F, 5.5F, 1, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 57, -1.0F, -1.0F, 11.0F, 1, 1, 3, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 76, 0, -2.4F, -1.75F, -4.9F, 2, 1, 20, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 78, 73, -1.5F, -1.25F, -4.899F, 1, 1, 20, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 77, 48, -2.3F, -1.25F, -4.899F, 1, 1, 20, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 24, 90, -2.4F, -1.75F, -20.9F, 2, 1, 5, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 52, 98, -0.9F, -1.25F, -21.15F, 1, 1, 6, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 18, 98, -2.9F, -1.25F, -21.15F, 1, 1, 6, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 116, 127, -2.601F, -1.95F, -16.4F, 1, 1, 12, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 102, 126, -1.201F, -1.95F, -16.4F, 1, 1, 12, -0.2F, false));
		rail.cubeList.add(new ModelBox(rail, 52, 113, -2.8F, -1.0F, 0.0F, 1, 1, 14, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 51, 19, -2.701F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 26, 16, -2.801F, -0.5F, 12.0F, 1, 1, 2, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 87, 82, -3.7F, -0.75F, 0.5F, 1, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 87, 80, -3.7F, -0.75F, 12.5F, 1, 1, 1, 0.0F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 16, -4.1F, -1.25F, 12.0F, 1, 2, 2, -0.3F, false));
		rail.cubeList.add(new ModelBox(rail, 0, 0, -4.1F, -1.25F, 0.0F, 1, 2, 2, -0.3F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-3.2F, -1.4F, -20.4F);
		rail.addChild(gun64_r1);
		setRotationAngle(gun64_r1, -0.3316F, 0.0F, 0.0F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 39, 85, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 24, 86, 2.6F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun63_r3 = new ModelRenderer(this);
		gun63_r3.setRotationPoint(-3.2F, -1.4F, -16.4F);
		rail.addChild(gun63_r3);
		setRotationAngle(gun63_r3, -0.3316F, 0.0F, 0.0F);
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 16, 81, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun63_r3.cubeList.add(new ModelBox(gun63_r3, 87, 16, 2.6F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun62_r2 = new ModelRenderer(this);
		gun62_r2.setRotationPoint(-0.7F, -1.1F, 12.8F);
		rail.addChild(gun62_r2);
		setRotationAngle(gun62_r2, -0.3316F, 0.0F, 0.0F);
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 87, 42, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-0.7F, -1.1F, 0.6F);
		rail.addChild(gun61_r1);
		setRotationAngle(gun61_r1, -0.3316F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 87, 78, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -1.0F, 11.0F);
		rail.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0F, 0.6109F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 56, 30, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 100, 0, -1.0F, 0.0F, -5.5F, 1, 1, 5, 0.0F, false));
		cube_r23.cubeList.add(new ModelBox(cube_r23, 99, 59, -1.0F, 0.0F, -11.0F, 1, 1, 5, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.8F, -1.0F, 0.0F);
		rail.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.0F, -0.6109F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 99, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-2.9F, -1.25F, -21.15F);
		rail.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.4363F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 36, 65, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.1F, -1.25F, -21.15F);
		rail.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.4363F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 98, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 15, 16, -3.001F, -31.0F, -1.0F, 3, 5, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 62, -3.5F, -31.0F, -6.0F, 4, 5, 5, 0.0F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(-3.5F, -26.0F, -5.5F);
		grip.addChild(grip3_r1);
		setRotationAngle(grip3_r1, 0.3718F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 51, 0, 0.001F, -0.5F, 0.0F, 4, 11, 4, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 48, 74, 3.1F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 63, 74, -0.1F, 0.5F, 1.0F, 1, 9, 4, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(-3.5F, -29.0F, -1.0F);
		grip.addChild(grip3_r2);
		setRotationAngle(grip3_r2, -1.0782F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 109, 111, -0.001F, 0.0F, 0.0F, 4, 3, 12, 0.0F, false));
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 118, 0, 0.5F, -1.0F, 0.0F, 3, 1, 12, 0.0F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.2231F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 0, 16, 0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 26, 8, 0.001F, 0.0F, 6.5F, 4, 1, 1, 0.0F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 82, 64, 0.5F, 0.0F, 7.4F, 3, 1, 1, 0.0F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 35, 83, 0.5F, -0.3F, 7.401F, 3, 1, 1, 0.0F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(-3.5F, -16.8F, -2.6F);
		grip.addChild(grip5_r2);
		setRotationAngle(grip5_r2, 1.0782F, 0.0F, 0.0F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 26, 34, 0.002F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-2.0F, -9.0F, -18.5F);
		magazine.cubeList.add(new ModelBox(magazine, 79, 33, -0.75F, 21.0F, 4.2F, 3, 2, 5, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 36, 39, -1.25F, 21.0F, 4.199F, 1, 2, 5, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.5F, 0.0F, 0.0F);
		magazine.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.2182F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 26, -2.0F, 4.0F, 3.2F, 2, 19, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 36, 39, -1.5F, 0.0F, 3.2F, 1, 4, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 43, 39, -1.5F, 0.0F, -0.2F, 1, 4, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 67, 0, -2.0F, 4.0F, -0.2F, 2, 19, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 26, -2.5F, 4.0F, 0.0F, 3, 19, 4, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-0.25F, 23.0F, 4.2F);
		magazine.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.192F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 48, 91, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 85, -0.5F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-1.0F, 3.9F, 0.86F);
		magazine.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.2182F, -0.0262F, 0.1222F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 26, 26, 0.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(2.0F, 3.9F, 0.86F);
		magazine.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.2182F, 0.0262F, -0.1222F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 26, 0, -1.0F, -4.0F, 0.0F, 1, 4, 4, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.3F, -1.15F, 1.05F);
		magazine.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.0436F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 52, 52, -1.0F, 0.0F, 0.0F, 1, 2, 3, -0.2F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 56, 25, 0.4F, 0.0F, 0.0F, 1, 2, 3, -0.2F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(1.9F, -0.4F, 0.5F);
		magazine.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.2182F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 70, 96, -3.0F, 8.2F, 2.0F, 3, 12, 1, 0.0F, false));
		cube_r32.cubeList.add(new ModelBox(cube_r32, 0, 97, -2.8F, 8.2F, 2.0F, 3, 12, 1, 0.0F, false));

		action_pully = new ModelRenderer(this);
		action_pully.setRotationPoint(-3.4F, -13.95F, -20.0F);
		action_pully.cubeList.add(new ModelBox(action_pully, 0, 76, 0.9F, -2.5F, 0.9F, 2, 1, 20, -0.2F, false));
		action_pully.cubeList.add(new ModelBox(action_pully, 16, 46, 0.9F, -2.6F, 19.4F, 2, 1, 2, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.6F, -1.6F, 21.1F);
		action_pully.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.384F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 80, -1.8F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 85, 8, -1.8F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(3.2F, -1.6F, 21.1F);
		action_pully.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.384F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 11, 86, -0.2F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 44, -0.2F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.3F, -1.65F, 20.0F);
		action_pully.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, -0.2443F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 49, -1.8F, -0.75F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 69, -1.8F, -1.151F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(2.5F, -1.65F, 20.0F);
		action_pully.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.2443F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 85, 66, -0.2F, -0.75F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 85, 69, -0.2F, -1.151F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-0.9F, -1.6F, 20.5F);
		action_pully.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, -1.2654F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 69, -1.8F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 73, -1.8F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(4.7F, -1.6F, 20.5F);
		action_pully.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 1.2654F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 85, 10, -0.2F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 85, 12, -0.2F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-0.8F, -1.6F, 19.42F);
		action_pully.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, -1.2654F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 46, 59, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 62, 15, -0.8F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(4.6F, -1.6F, 19.42F);
		action_pully.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 1.2654F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 70, 52, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 70, 58, -0.2F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-0.25F, -1.6F, 19.6F);
		action_pully.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, -0.6283F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 63, 58, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 65, -0.8F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(4.05F, -1.6F, 19.6F);
		action_pully.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.6283F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 6, 72, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 15, 76, -0.2F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.9F, -2.0F, 21.4F);
		action_pully.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, -0.6981F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 18, 67, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 62, 65, -0.8F, -0.4F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(2.9F, -2.0F, 21.4F);
		action_pully.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.6981F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 79, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 79, 36, -0.2F, -0.4F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-1.0F, -2.6F, 19.95F);
		action_pully.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, -0.3927F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 9, 80, 0.0F, 0.0F, -1.0F, 3, 1, 1, -0.1F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(2.1F, -2.6F, 21.15F);
		action_pully.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.3927F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 36, 80, 0.0F, 0.0F, -1.0F, 3, 1, 1, -0.1F, false));

		action_ejector = new ModelRenderer(this);
		action_ejector.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-3.4F, -37.95F, -20.0F);
		action_ejector.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 0.1745F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 6, 41, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-3.4F, -37.95F, -20.0F);
		action_ejector.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.7418F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 26, 39, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		receiver_10mm.render(f5);
		gun.render(f5);
		barrel.render(f5);
//		handguard.render(f5);
		rail.render(f5);
//		grip.render(f5);
//		magazine.render(f5);
//		action_pully.render(f5);
//		action_ejector.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
