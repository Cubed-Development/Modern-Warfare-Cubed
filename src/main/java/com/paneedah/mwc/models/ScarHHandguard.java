package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarHHandguard extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer gun132;
	private final ModelRenderer lowerreceiver;
	private final ModelRenderer gun58_r1;
	private final ModelRenderer gun31_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun40_r2;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun52_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun52_r2;
	private final ModelRenderer gun51_r2;
	private final ModelRenderer gun58_r2;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun131_r1;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun130_r2;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun131_r2;
	private final ModelRenderer gun131_r3;
	private final ModelRenderer gun131_r4;
	private final ModelRenderer gun132_r1;
	private final ModelRenderer gun134_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun60;
	private final ModelRenderer gun67;
	private final ModelRenderer barrel;
	private final ModelRenderer gun710_r1;
	private final ModelRenderer gun709_r1;
	private final ModelRenderer gun708_r1;
	private final ModelRenderer gun707_r1;
	private final ModelRenderer gun706_r1;
	private final QRenderer upperreceiver;
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
	private final ModelRenderer bone3;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final QRenderer action;
	private final QRenderer handguard;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer bone6;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer bone5;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final QRenderer magazine;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;

	public ScarHHandguard() {
		textureWidth = 300;
		textureHeight = 300;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -35.9F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.5783F);
		gun132.cubeList.add(new ModelBox(gun132, 117, 20, -0.7008F, 0.4322F, -2.95F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 116, 95, -0.7001F, 0.4315F, -2.55F, 2, 1, 1, -0.2F, false));

		lowerreceiver = new ModelRenderer(this);
		lowerreceiver.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(lowerreceiver);
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 39, 14, -2.999F, -31.0F, -7.5F, 3, 5, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 65, 93, 0.15F, -36.0F, -15.55F, 1, 2, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 130, 79, 0.2F, -34.5F, -15.551F, 1, 1, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 130, 54, -0.1F, -35.5F, -15.8F, 1, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 120, 68, 0.4F, -35.2F, -18.4F, 1, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 95, 104, 0.2F, -33.6F, -16.7F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 100, 117, 0.2F, -33.4F, -16.7F, 1, 1, 1, -0.201F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 96, 117, 0.2F, -32.0F, -16.7F, 1, 1, 1, -0.201F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 36, 103, 0.1F, -33.7F, -6.3F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 22, 106, 0.0F, -33.7F, -7.7F, 1, 1, 1, -0.301F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 30, 103, -4.1F, -33.7F, -6.3F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 4, 106, -4.0F, -33.7F, -7.7F, 1, 1, 1, -0.301F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 81, 63, -0.25F, -32.7F, -20.0F, 1, 1, 4, -0.16F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 91, 103, 0.2F, -31.8F, -16.7F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 129, 108, -0.1F, -35.5F, -15.3F, 1, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 55, 48, -3.5F, -35.8F, -28.2F, 4, 2, 3, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 24, -3.5F, -36.0F, -23.2F, 4, 8, 8, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 40, -3.5F, -28.0F, -20.2F, 4, 1, 5, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 112, 19, -3.5F, -35.5F, -16.0F, 4, 5, 14, -0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 24, -3.7F, -33.6F, -15.6F, 1, 3, 3, -0.1F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 90, 71, -3.9F, -33.1F, -16.4F, 1, 2, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 24, 103, -3.9F, -33.7F, -15.8F, 1, 1, 2, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 71, 103, -3.7F, -34.2F, -15.1F, 1, 1, 1, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 65, 103, -3.7F, -34.2F, -14.5F, 1, 1, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 94, 34, -3.85F, -34.2F, -14.8F, 1, 1, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 94, 32, -3.95F, -33.4F, -13.8F, 1, 1, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 103, 101, -3.8F, -33.6F, -13.6F, 1, 1, 1, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 89, 103, -3.8F, -33.6F, -14.0F, 1, 1, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 83, 103, -3.8F, -33.2F, -14.0F, 1, 1, 1, -0.097F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 77, 103, -3.8F, -33.2F, -13.6F, 1, 1, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 18, 103, -3.9F, -31.6F, -15.8F, 1, 1, 2, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 55, 67, -3.001F, -32.0F, -15.8F, 3, 5, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 14, -3.001F, -26.75F, -14.3F, 3, 1, 7, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 39, 56, -3.5F, -36.0F, -25.6F, 4, 7, 3, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 24, 73, -3.501F, -34.2F, -27.4F, 4, 1, 3, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 47, -3.5F, -33.65F, -1.998F, 4, 1, 4, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 16, 47, -3.0F, -33.6F, -2.0F, 3, 2, 4, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 24, 94, -3.5F, -36.0F, -2.001F, 4, 3, 4, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.499F, -33.8F, -28.2F);
		lowerreceiver.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.925F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 90, 19, -3.999F, 0.0F, 0.0F, 4, 1, 1, -0.002F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-3.2F, -30.5F, -13.4F);
		lowerreceiver.addChild(gun31_r1);
		setRotationAngle(gun31_r1, 2.3562F, 0.0F, 0.0F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 63, 99, 0.2F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -30.5F, -8.6F);
		lowerreceiver.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 99, 64, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -26.75F, -8.6F);
		lowerreceiver.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 39, 66, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -26.45F, -13.6F);
		lowerreceiver.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 100, 7, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-3.8F, -31.2F, -16.3F);
		lowerreceiver.addChild(gun41_r1);
		setRotationAngle(gun41_r1, -0.7854F, 0.0F, 0.0F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 104, 88, -0.1F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-3.8F, -33.0F, -16.3F);
		lowerreceiver.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.7854F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 99, 104, -0.1F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(-3.7F, -32.0F, -15.3F);
		lowerreceiver.addChild(gun40_r2);
		setRotationAngle(gun40_r2, -0.4887F, 0.0F, 0.0F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 104, 67, -0.05F, -0.9F, -0.1F, 1, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -23.2F);
		lowerreceiver.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 40, 0, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 66, 72, 0.101F, -2.7194F, 0.098F, 4, 3, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 73, 0, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 55, 11, 3.699F, -2.72F, 0.1F, 1, 3, 1, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(-3.9F, -28.6F, -23.2F);
		lowerreceiver.addChild(gun52_r1);
		setRotationAngle(gun52_r1, 1.4102F, 0.1115F, 0.6019F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 34, 0, 0.065F, -2.4F, 0.085F, 1, 10, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.9F, -28.6F, -23.2F);
		lowerreceiver.addChild(gun53_r1);
		setRotationAngle(gun53_r1, 1.4102F, 0.1115F, 0.6019F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 73, 24, 0.065F, 7.0F, 0.085F, 1, 1, 1, -0.001F, false));

		gun52_r2 = new ModelRenderer(this);
		gun52_r2.setRotationPoint(0.9F, -28.6F, -23.2F);
		lowerreceiver.addChild(gun52_r2);
		setRotationAngle(gun52_r2, 1.4102F, -0.1115F, -0.6019F);
		gun52_r2.cubeList.add(new ModelBox(gun52_r2, 118, 54, -1.065F, 7.0F, 0.085F, 1, 1, 1, -0.001F, false));

		gun51_r2 = new ModelRenderer(this);
		gun51_r2.setRotationPoint(0.9F, -28.6F, -23.2F);
		lowerreceiver.addChild(gun51_r2);
		setRotationAngle(gun51_r2, 1.4102F, -0.1115F, -0.6019F);
		gun51_r2.cubeList.add(new ModelBox(gun51_r2, 39, 80, -1.065F, -2.4F, 0.085F, 1, 10, 1, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(-3.5F, -33.5F, -27.2F);
		lowerreceiver.addChild(gun58_r2);
		setRotationAngle(gun58_r2, 0.9082F, 0.0F, 0.0F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 66, 63, 0.0F, -0.123F, 0.1577F, 4, 2, 1, -0.004F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -29.4F, -10.35F);
		lowerreceiver.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.1297F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 79, 24, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun131_r1 = new ModelRenderer(this);
		gun131_r1.setRotationPoint(1.0F, -34.2F, -16.5F);
		lowerreceiver.addChild(gun131_r1);
		setRotationAngle(gun131_r1, 0.0F, 0.5236F, 0.0F);
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 120, 61, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(1.4F, -34.2F, -17.4F);
		lowerreceiver.addChild(gun130_r1);
		setRotationAngle(gun130_r1, 0.0F, 1.1519F, 0.0F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 120, 59, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		gun130_r2 = new ModelRenderer(this);
		gun130_r2.setRotationPoint(1.0F, -34.2F, -19.3F);
		lowerreceiver.addChild(gun130_r2);
		setRotationAngle(gun130_r2, 0.0F, -0.5236F, 0.0F);
		gun130_r2.cubeList.add(new ModelBox(gun130_r2, 120, 63, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(1.4F, -34.2F, -18.4F);
		lowerreceiver.addChild(gun129_r1);
		setRotationAngle(gun129_r1, 0.0F, -1.1519F, 0.0F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 120, 66, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun131_r2 = new ModelRenderer(this);
		gun131_r2.setRotationPoint(1.0F, -31.0F, -14.9F);
		lowerreceiver.addChild(gun131_r2);
		setRotationAngle(gun131_r2, 0.0F, -0.6632F, 0.0F);
		gun131_r2.cubeList.add(new ModelBox(gun131_r2, 85, 103, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.201F, false));
		gun131_r2.cubeList.add(new ModelBox(gun131_r2, 46, 104, -0.8F, -2.6F, -0.2F, 1, 1, 2, -0.201F, false));

		gun131_r3 = new ModelRenderer(this);
		gun131_r3.setRotationPoint(1.1F, -31.7F, -15.8F);
		lowerreceiver.addChild(gun131_r3);
		setRotationAngle(gun131_r3, 0.0F, -0.2094F, 0.0F);
		gun131_r3.cubeList.add(new ModelBox(gun131_r3, 104, 117, -1.0F, -1.0F, 0.5F, 1, 1, 1, -0.001F, false));
		gun131_r3.cubeList.add(new ModelBox(gun131_r3, 118, 16, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun131_r4 = new ModelRenderer(this);
		gun131_r4.setRotationPoint(1.1F, -31.7F, -15.8F);
		lowerreceiver.addChild(gun131_r4);
		setRotationAngle(gun131_r4, 0.0F, 0.1745F, 0.0F);
		gun131_r4.cubeList.add(new ModelBox(gun131_r4, 92, 117, -1.0F, -1.0F, -0.9F, 1, 1, 1, -0.15F, false));

		gun132_r1 = new ModelRenderer(this);
		gun132_r1.setRotationPoint(-3.9F, -31.9F, -6.7F);
		lowerreceiver.addChild(gun132_r1);
		setRotationAngle(gun132_r1, 0.4538F, 0.0F, 0.0F);
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 94, 80, 0.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 93, 95, 3.8F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		gun134_r1 = new ModelRenderer(this);
		gun134_r1.setRotationPoint(-3.6F, -32.9F, -4.5F);
		lowerreceiver.addChild(gun134_r1);
		setRotationAngle(gun134_r1, 0.4538F, 0.0F, 0.0F);
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 59, 103, 0.0F, -2.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 10, 106, 3.2F, -2.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-3.7F, -29.8F, -8.7F);
		lowerreceiver.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.4538F, 0.0F, 0.0F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 40, 103, 0.0F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 16, 106, 3.4F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lowerreceiver.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 101, 129, 0.0F, 2.2633F, -5.0376F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 97, 129, -3.2F, 2.2633F, -5.0376F, 1, 1, 1, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lowerreceiver.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 69, 48, -0.2F, 0.7807F, 1.8013F, 4, 2, 3, -0.003F, false));
		gun67.cubeList.add(new ModelBox(gun67, 90, 38, 0.3F, -0.2941F, -0.0717F, 3, 2, 5, -0.001F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.7F, 3.4F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 135, 94, -1.8F, -37.8F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 135, 33, -2.2F, -37.8F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 134, 19, -2.2F, -38.2F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 133, 57, -1.8F, -38.2F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 23, 132, -1.6F, -38.0F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 79, 80, -2.4F, -38.0F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 24, 80, -2.0F, -37.6F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 79, 57, -2.0F, -38.4F, -87.5F, 1, 1, 13, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 111, -2.0F, -38.55F, -61.5F, 1, 1, 6, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 79, 24, -2.0F, -39.65F, -60.4F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 12, 103, -2.0F, -39.65F, -61.6F, 1, 1, 2, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 39, 47, -2.0F, -40.85F, -59.5F, 1, 1, 5, 0.3F, false));
		barrel.cubeList.add(new ModelBox(barrel, 94, 57, -2.4F, -40.85F, -59.7F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 94, 0, -1.6F, -40.85F, -59.7F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 8, 24, -2.0F, -42.35F, -58.8F, 1, 1, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 79, 94, -2.0F, -44.35F, -58.1F, 1, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 96, -1.4F, -39.25F, -58.9F, 1, 1, 1, -0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 24, 96, -2.6F, -39.25F, -58.9F, 1, 1, 1, -0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 34, 95, -2.0F, -37.55F, -61.5F, 1, 1, 6, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 110, 100, -2.3F, -38.35F, -61.5F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 110, 88, -2.3F, -37.75F, -61.5F, 1, 1, 6, 0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 79, 94, -1.7F, -38.35F, -61.5F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 93, 94, -1.7F, -37.75F, -61.5F, 1, 1, 6, 0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 167, 0, -2.2F, -38.0F, -77.499F, 1, 1, 47, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 148, 166, -1.8F, -38.0F, -77.501F, 1, 1, 47, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 112, -2.0F, -37.8F, -77.5F, 1, 1, 47, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 165, 54, -2.0F, -38.2F, -77.5F, 1, 1, 47, 0.0F, false));

		gun710_r1 = new ModelRenderer(this);
		gun710_r1.setRotationPoint(-2.6F, -39.05F, -61.8F);
		barrel.addChild(gun710_r1);
		setRotationAngle(gun710_r1, 0.0F, 0.0F, 0.5411F);
		gun710_r1.cubeList.add(new ModelBox(gun710_r1, 42, 27, -0.1F, -1.0F, 0.0F, 1, 1, 4, -0.2F, false));

		gun709_r1 = new ModelRenderer(this);
		gun709_r1.setRotationPoint(-0.4F, -39.05F, -61.8F);
		barrel.addChild(gun709_r1);
		setRotationAngle(gun709_r1, 0.0F, 0.0F, -0.5411F);
		gun709_r1.cubeList.add(new ModelBox(gun709_r1, 79, 80, -0.9F, -1.0F, 0.0F, 1, 1, 4, -0.2F, false));

		gun708_r1 = new ModelRenderer(this);
		gun708_r1.setRotationPoint(-0.4F, -41.05F, -59.8F);
		barrel.addChild(gun708_r1);
		setRotationAngle(gun708_r1, 0.0F, 0.0F, -0.5411F);
		gun708_r1.cubeList.add(new ModelBox(gun708_r1, 0, 103, -0.9F, -1.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun707_r1 = new ModelRenderer(this);
		gun707_r1.setRotationPoint(-2.6F, -41.05F, -59.8F);
		barrel.addChild(gun707_r1);
		setRotationAngle(gun707_r1, 0.0F, 0.0F, 0.5411F);
		gun707_r1.cubeList.add(new ModelBox(gun707_r1, 6, 103, -0.1F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		gun706_r1 = new ModelRenderer(this);
		gun706_r1.setRotationPoint(-2.4F, -41.45F, -57.2F);
		barrel.addChild(gun706_r1);
		setRotationAngle(gun706_r1, -0.3491F, 0.0F, 0.0F);
		gun706_r1.cubeList.add(new ModelBox(gun706_r1, 85, 90, -0.1F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		upperreceiver = new QRenderer(this);
		upperreceiver.setRotationPoint(0.65F, -12.5F, -49.0F);
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 133, 166, -4.45F, -1.999F, -2.0F, 4, 3, 25, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 94, 27, -4.95F, -1.4F, 18.5F, 1, 1, 4, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 94, 7, -4.95F, -1.1F, 18.5F, 1, 1, 4, 0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 39, 88, -0.35F, -1.1F, 18.5F, 1, 1, 4, 0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 90, 14, -0.35F, -1.4F, 18.5F, 1, 1, 4, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 50, 165, -4.45F, -2.0F, 35.0F, 1, 3, 16, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 79, 24, -4.75F, -2.3F, 22.5F, 1, 1, 13, -0.301F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 79, 0, -4.55F, 0.1F, 22.5F, 1, 1, 13, -0.101F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 0, 0, -0.85F, -2.0F, -2.0F, 1, 3, 53, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 112, 0, -1.7F, -5.4F, -2.0F, 1, 1, 18, 0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 55, 111, -1.7F, -5.4F, 33.0F, 1, 3, 18, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 94, 32, -1.7F, -4.5F, -2.0F, 1, 1, 4, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 93, 129, -1.7F, -4.5F, 5.0F, 1, 1, 1, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 47, 129, -1.7F, -4.5F, 9.25F, 1, 1, 1, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 110, 60, -1.7F, -4.5F, 13.5F, 1, 1, 2, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 110, 133, -1.7F, -3.6F, -2.0F, 1, 1, 17, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 165, 112, -1.6F, -5.5F, 15.4F, 1, 1, 16, -0.1F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 39, 129, -1.5F, -5.6F, 31.1F, 1, 1, 1, -0.2F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 110, 57, -1.5F, -5.6F, 31.7F, 1, 1, 2, -0.201F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 47, 110, -1.5F, -3.5F, 31.7F, 1, 1, 2, -0.201F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 35, 129, -1.5F, -3.5F, 31.1F, 1, 1, 1, -0.2F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 165, 70, -1.6F, -3.6F, 15.4F, 1, 1, 16, -0.1F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 43, 129, -1.7F, -3.6F, 14.5F, 1, 1, 1, 0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 127, 115, -3.6F, -5.4F, -2.0F, 1, 1, 17, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 55, 132, -3.6F, -3.6F, -2.0F, 1, 1, 17, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 83, 48, -3.6F, -4.5F, -2.0F, 1, 1, 4, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 83, 120, -3.6F, -4.5F, 5.0F, 1, 1, 1, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 120, 83, -3.6F, -4.5F, 9.25F, 1, 1, 1, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 101, 104, -3.6F, -4.5F, 13.5F, 1, 1, 2, -0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 120, 85, -3.6F, -3.6F, 14.5F, 1, 1, 1, 0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 120, 107, -3.6F, -5.4F, 14.5F, 1, 1, 1, 0.001F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 74, 132, -3.7F, -3.6F, 15.4F, 1, 1, 16, -0.1F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 118, 120, -3.8F, -3.5F, 31.1F, 1, 1, 1, -0.2F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 0, 106, -3.8F, -3.5F, 31.7F, 1, 1, 2, -0.201F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 110, 79, -3.6F, -5.4F, 33.0F, 1, 3, 18, 0.0F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 129, 133, -3.7F, -5.5F, 15.4F, 1, 1, 16, -0.1F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 6, 106, -3.8F, -5.6F, 31.7F, 1, 1, 2, -0.201F, false));
		upperreceiver.cubeList.add(new ModelBox(upperreceiver, 121, 101, -3.8F, -5.6F, 31.1F, 1, 1, 1, -0.2F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.6F, -3.5F, 31.3F);
		upperreceiver.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 121, 115, -0.25F, -0.25F, -0.25F, 1, 1, 1, -0.251F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 127, 105, 2.15F, -0.25F, -0.25F, 1, 1, 1, -0.251F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.6F, -3.5F, 33.0F);
		upperreceiver.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 121, 113, -0.25F, -0.25F, -0.25F, 1, 1, 1, -0.252F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 127, 103, 2.15F, -0.25F, -0.25F, 1, 1, 1, -0.252F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.6F, -4.6F, 33.0F);
		upperreceiver.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 104, 121, -0.25F, -0.75F, -0.25F, 1, 1, 1, -0.252F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 15, 128, 2.15F, -0.75F, -0.25F, 1, 1, 1, -0.252F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.6F, -4.6F, 31.3F);
		upperreceiver.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 121, 103, -0.25F, -0.75F, -0.25F, 1, 1, 1, -0.251F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 128, 112, 2.15F, -0.75F, -0.25F, 1, 1, 1, -0.251F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-3.6F, -5.4F, 0.0F);
		upperreceiver.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.4014F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 56, 0.0F, 0.0F, -2.0F, 1, 1, 53, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.6F, -4.3F, 15.5F);
		upperreceiver.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7854F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 100, 121, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 128, 114, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.6F, -3.8F, 15.5F);
		upperreceiver.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.7854F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 96, 121, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 128, 116, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.6F, -4.2F, 13.5F);
		upperreceiver.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.7854F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 92, 121, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 128, 118, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.6F, -3.8F, 13.5F);
		upperreceiver.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 121, 91, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 128, 120, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6F, -3.8F, 10.25F);
		upperreceiver.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7854F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 121, 89, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 128, 122, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.6F, -4.2F, 10.25F);
		upperreceiver.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 86, 121, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 128, 124, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-3.6F, -4.2F, 9.25F);
		upperreceiver.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 121, 15, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 128, 126, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.6F, -3.8F, 9.25F);
		upperreceiver.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 121, 13, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 129, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.6F, -3.8F, 6.0F);
		upperreceiver.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 121, 11, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 4, 129, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.6F, -4.2F, 6.0F);
		upperreceiver.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 121, 9, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 8, 129, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.6F, -3.8F, 5.0F);
		upperreceiver.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7854F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 121, 7, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 12, 129, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.6F, -3.8F, 2.0F);
		upperreceiver.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7854F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 121, 5, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 23, 129, 2.1F, -0.2F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.6F, -4.2F, 5.0F);
		upperreceiver.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.7854F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 121, 3, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 27, 129, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.6F, -4.2F, 2.0F);
		upperreceiver.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.7854F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 121, 1, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 129, 2.1F, -0.8F, -0.2F, 1, 1, 1, -0.202F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-0.7F, -5.4F, 0.0F);
		upperreceiver.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.4014F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 55, 57, -1.0F, 0.0F, -2.0F, 1, 1, 53, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-4.45F, -2.0F, 0.0F);
		upperreceiver.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.6283F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 110, 58, 0.0F, -1.0F, -2.0F, 1, 1, 53, 0.001F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 110, 0.0F, -1.58F, -2.0F, 1, 1, 53, -0.001F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.15F, -2.0F, 0.0F);
		upperreceiver.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.6283F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 55, 111, -1.0F, -1.0F, -2.0F, 1, 1, 53, 0.001F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 112, 0, -1.0F, -1.58F, -2.0F, 1, 1, 53, -0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-5.75F, -1.6F, 35.2F);
		upperreceiver.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.0873F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 99, 49, 0.0F, -0.1F, 0.0F, 3, 2, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-5.75F, -1.6F, 35.2F);
		upperreceiver.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.2618F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 55, 99, 0.0F, -0.1F, 0.0F, 3, 2, 1, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-4.45F, 0.6F, 23.0F);
		upperreceiver.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.7854F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 127, 101, -0.3F, -0.7F, -0.3F, 1, 1, 1, -0.302F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-4.45F, -1.4F, 23.0F);
		upperreceiver.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.7854F, 0.0F, 0.0F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 103, 127, -0.3F, -0.7F, -0.3F, 1, 1, 1, -0.302F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.65F, -1.4F, 22.5F);
		upperreceiver.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -1.117F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 122, 21, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r27.cubeList.add(new ModelBox(cube_r27, 122, 19, -1.0F, 0.3F, 0.0F, 1, 1, 1, 0.001F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.65F, -1.4F, 19.5F);
		upperreceiver.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.0F, 0.4189F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 90, 71, -1.0F, 0.0F, -1.0F, 1, 1, 4, -0.001F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.95F, -1.4F, 21.7F);
		upperreceiver.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.2967F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 121, 121, -1.05F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r29.cubeList.add(new ModelBox(cube_r29, 75, 122, -6.15F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.95F, -1.4F, 18.7F);
		upperreceiver.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.2967F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 121, 119, -1.05F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 122, 54, -6.15F, 0.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(0.75F, -1.4F, 20.2F);
		upperreceiver.addChild(cube_r31);
		setRotationAngle(cube_r31, -0.2967F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 121, 117, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r31.cubeList.add(new ModelBox(cube_r31, 79, 122, -5.85F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(0.65F, -0.1F, 19.5F);
		upperreceiver.addChild(cube_r32);
		setRotationAngle(cube_r32, 0.0F, 0.0F, -0.4189F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 79, 85, -1.0F, -1.0F, -1.0F, 1, 1, 4, -0.001F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.65F, -0.1F, 18.5F);
		upperreceiver.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.1011F, 0.2228F, -0.4302F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 30, 106, -1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(0.65F, -1.1F, 18.5F);
		upperreceiver.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.2443F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 24, 106, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.001F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 18, 106, -1.0F, -0.3F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.65F, -1.4F, 18.5F);
		upperreceiver.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.1011F, 0.2228F, 0.4302F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 12, 106, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(0.25F, -1.1F, 50.0F);
		upperreceiver.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.2967F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 79, 120, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 120, 81, -4.85F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-2.85F, -5.4F, -0.6F);
		upperreceiver.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.2967F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 36, 94, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 96, 16, 1.35F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.25F, -1.7F, 29.6F);
		upperreceiver.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.2967F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 120, 70, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(0.25F, -1.7F, 37.6F);
		upperreceiver.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.2967F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 120, 72, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.25F, -1.7F, 47.6F);
		upperreceiver.addChild(cube_r40);
		setRotationAngle(cube_r40, -0.2967F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 75, 120, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(0.25F, -1.1F, 48.8F);
		upperreceiver.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.2967F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 120, 75, -0.95F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 120, 79, -4.85F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-4.55F, -1.1F, 37.7F);
		upperreceiver.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.2967F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 120, 57, -0.05F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-4.55F, -1.1F, 36.5F);
		upperreceiver.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.2967F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 120, 48, -0.05F, 0.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-4.95F, -1.1F, 18.5F);
		upperreceiver.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, -0.2443F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 55, 106, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.001F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 61, 106, 0.0F, -0.3F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-4.95F, -0.1F, 18.5F);
		upperreceiver.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.1011F, -0.2228F, 0.4302F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 36, 106, 0.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-4.95F, -1.4F, 18.5F);
		upperreceiver.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.1011F, -0.2228F, -0.4302F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 42, 106, 0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-4.95F, -0.1F, 19.5F);
		upperreceiver.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 0.4189F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 93, 48, 0.0F, -1.0F, -1.0F, 1, 1, 4, -0.001F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-4.95F, -1.4F, 19.5F);
		upperreceiver.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.4189F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 65, 93, 0.0F, 0.0F, -1.0F, 1, 1, 4, -0.001F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-4.95F, -1.1F, 22.5F);
		upperreceiver.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0F, 1.117F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 83, 122, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));
		cube_r49.cubeList.add(new ModelBox(cube_r49, 122, 95, 0.0F, -0.3F, 0.0F, 1, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.35F, -6.6F, 1.25F);
		upperreceiver.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 116, 10, -1.8F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 116, 8, -1.8F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 116, 6, -1.8F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 116, 4, -1.8F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 116, 2, -1.8F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 116, 0, -1.8F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 115, 108, -1.8F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 98, 115, -1.8F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 23, 115, -1.8F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 29, 115, -1.8F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 41, 115, -1.8F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 47, 115, -1.8F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 75, 115, -1.8F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 115, 76, -1.8F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 83, 115, -1.8F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 92, 115, -1.8F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 23, 113, -1.8F, -0.2F, 20.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 29, 113, -1.8F, -0.2F, 22.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 41, 113, -1.8F, -0.2F, 23.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 47, 113, -1.8F, -0.2F, 24.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 75, 113, -1.8F, -0.2F, 25.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 83, 113, -1.8F, -0.2F, 27.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 92, 113, -1.8F, -0.2F, 28.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 98, 113, -1.8F, -0.2F, 29.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 31, -1.8F, -0.2F, 30.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 38, -1.8F, -0.2F, 32.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 40, -1.8F, -0.2F, 33.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 42, -1.8F, -0.2F, 34.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 44, -1.8F, -0.2F, 35.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 46, -1.8F, -0.2F, 37.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 48, -1.8F, -0.2F, 38.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 54, -1.8F, -0.2F, 39.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 21, -1.8F, -0.2F, 40.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 23, -1.8F, -0.2F, 42.05F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 25, -1.8F, -0.2F, 43.3F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 27, -1.8F, -0.2F, 44.55F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 112, 29, -1.8F, -0.2F, 45.8F, 2, 1, 1, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 87, 97, -1.8F, -0.2F, 47.05F, 2, 1, 2, -0.198F, false));
		bone3.cubeList.add(new ModelBox(bone3, 14, 98, -1.8F, -0.2F, 47.95F, 2, 1, 2, -0.199F, false));
		bone3.cubeList.add(new ModelBox(bone3, 55, 3, -1.7F, 0.4F, -3.25F, 2, 1, 53, -0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 110, 112, -1.9F, 0.4F, -3.25F, 1, 1, 53, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 99, 46, -1.8F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone3.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0F, 0.0F, 0.8901F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 91, 106, -0.2F, -0.2F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 0, 164, -0.25F, -0.05F, 1.2F, 1, 1, 48, -0.35F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 79, 106, -0.2F, -0.2F, 49.2F, 1, 1, 2, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 67, 106, -0.2F, -0.2F, 48.3F, 1, 1, 2, -0.197F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 123, 58, -0.2F, -0.2F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 43, 123, -0.2F, -0.2F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 35, 123, -0.2F, -0.2F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 27, 123, -0.2F, -0.2F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 118, 122, -0.2F, -0.2F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 123, 106, -0.2F, -0.2F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 104, 123, -0.2F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 96, 123, -0.2F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 86, 123, -0.2F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 123, 82, -0.2F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 123, 76, -0.2F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 123, 69, -0.2F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 123, 62, -0.2F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 90, -0.2F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 88, -0.2F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 79, 124, -0.2F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 16, -0.2F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 12, -0.2F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 8, -0.2F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 4, -0.2F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 0, -0.2F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 15, 126, -0.2F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 121, 125, -0.2F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 55, 125, -0.2F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 43, 125, -0.2F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 35, 125, -0.2F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 27, 125, -0.2F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 118, 124, -0.2F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 124, 102, -0.2F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 126, 59, -0.2F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 126, 63, -0.2F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 126, 68, -0.2F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 126, 72, -0.2F, -0.2F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 126, 107, -0.2F, -0.2F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 8, 127, -0.2F, -0.2F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 23, 127, -0.2F, -0.2F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r50.cubeList.add(new ModelBox(cube_r50, 31, 127, -0.2F, -0.2F, 2.05F, 1, 1, 1, -0.198F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone3.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0F, 0.0F, -0.8901F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 110, -0.8F, -0.2F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 50, 165, -0.75F, -0.05F, 1.2F, 1, 1, 48, -0.35F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 85, 106, -0.8F, -0.2F, 49.2F, 1, 1, 2, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 73, 106, -0.8F, -0.2F, 48.3F, 1, 1, 2, -0.197F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 123, 60, -0.8F, -0.2F, 47.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 47, 123, -0.8F, -0.2F, 45.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 39, 123, -0.8F, -0.2F, 44.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 31, 123, -0.8F, -0.2F, 43.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 123, -0.8F, -0.2F, 42.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 121, 123, -0.8F, -0.2F, 40.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 123, 108, -0.8F, -0.2F, 39.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 100, 123, -0.8F, -0.2F, 38.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 92, 123, -0.8F, -0.2F, 37.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 123, 84, -0.8F, -0.2F, 35.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 123, 80, -0.8F, -0.2F, 34.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 123, 71, -0.8F, -0.2F, 33.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 123, 67, -0.8F, -0.2F, 32.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 100, -0.8F, -0.2F, 30.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 92, -0.8F, -0.2F, 29.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 83, 124, -0.8F, -0.2F, 28.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 75, 124, -0.8F, -0.2F, 27.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 14, -0.8F, -0.2F, 25.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 10, -0.8F, -0.2F, 24.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 6, -0.8F, -0.2F, 23.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 2, -0.8F, -0.2F, 22.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 57, -0.8F, -0.2F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 54, -0.8F, -0.2F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 59, 125, -0.8F, -0.2F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 47, 125, -0.8F, -0.2F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 39, 125, -0.8F, -0.2F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 31, 125, -0.8F, -0.2F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 23, 125, -0.8F, -0.2F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 124, 104, -0.8F, -0.2F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 61, -0.8F, -0.2F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 66, -0.8F, -0.2F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 70, -0.8F, -0.2F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 126, 75, -0.8F, -0.2F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 118, 126, -0.8F, -0.2F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 12, 127, -0.8F, -0.2F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 27, 127, -0.8F, -0.2F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r51.cubeList.add(new ModelBox(cube_r51, 35, 127, -0.8F, -0.2F, 2.05F, 1, 1, 1, -0.198F, false));

		action = new QRenderer(this);
		action.setRotationPoint(-0.25F, -15.7F, -45.0F);
		action.cubeList.add(new ModelBox(action, 197, 160, -1.0F, -2.0F, -2.0F, 1, 2, 31, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 90, 76, -0.5F, -1.35F, 11.8F, 3, 1, 1, -0.05F, false));
		action.cubeList.add(new ModelBox(action, 96, 73, -0.5F, -1.35F, 11.8F, 1, 1, 1, 0.05F, false));
		action.cubeList.add(new ModelBox(action, 34, 103, 1.9F, -0.95F, 11.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 22, 103, 1.9F, -0.95F, 11.8F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 28, 103, 1.9F, -0.95F, 12.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 4, 103, 1.9F, -1.75F, 11.8F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 10, 103, 1.9F, -1.75F, 11.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 16, 103, 1.9F, -1.75F, 12.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 49, 98, 1.9F, -1.35F, 12.2F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 97, 77, 1.9F, -1.35F, 11.4F, 1, 1, 1, -0.3F, false));
		action.cubeList.add(new ModelBox(action, 100, 166, -2.5F, -2.0F, -2.0F, 1, 2, 31, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 26, 0, -3.3F, 1.5F, 19.0F, 1, 2, 12, 0.0F, false));

		handguard = new QRenderer(this);
		handguard.setRotationPoint(-3.8F, -11.2F, -51.0F);
		handguard.cubeList.add(new ModelBox(handguard, 55, 0, 2.5F, -0.6F, 0.0F, 1, 2, 22, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 80, 3.5F, -1.0F, 0.0F, 1, 1, 22, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, 1.1F, -0.6F, 0.0F, 2, 2, 22, 0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 55, 80, 0.1F, -1.0F, 0.0F, 1, 1, 22, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 91, 127, 4.075F, -6.33F, -0.3F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 127, 4.075F, -5.93F, -0.3F, 1, 1, 1, -0.198F, false));
		handguard.cubeList.add(new ModelBox(handguard, 87, 127, 3.65F, -5.5F, -0.3F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 99, 127, 3.65F, -6.75F, -0.3F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 85, 57, 2.05F, -6.85F, -0.3F, 2, 4, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 71, 0.55F, -6.85F, -0.3F, 2, 4, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 47, 127, -0.05F, -6.75F, -0.3F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 127, -0.475F, -5.93F, -0.3F, 1, 1, 1, -0.198F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 127, -0.475F, -6.33F, -0.3F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 59, 127, -0.05F, -5.5F, -0.3F, 1, 1, 1, -0.199F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 38, 2.9F, -3.55F, -0.3F, 2, 3, 1, -0.201F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 14, 2.9F, -1.05F, -0.3F, 2, 1, 1, -0.202F, false));
		handguard.cubeList.add(new ModelBox(handguard, 100, 32, -0.3F, -3.55F, -0.3F, 2, 3, 1, -0.201F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 12, -0.3F, -1.05F, -0.3F, 2, 1, 1, -0.202F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-0.1F, -3.35F, -0.1F);
		handguard.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.0F, 0.0F, -0.9076F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 29, 110, -0.2F, -0.2F, -0.2F, 2, 2, 1, -0.202F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(4.7F, -3.35F, -0.1F);
		handguard.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.0F, 0.0F, 0.9076F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 41, 110, -1.8F, -0.2F, -0.2F, 2, 2, 1, -0.202F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.15F, -4.7F, -0.1F);
		handguard.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.0F, 0.0F, -0.7854F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 55, 127, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.201F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(0.15F, -6.55F, -0.1F);
		handguard.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, 0.7854F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 43, 127, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(4.45F, -6.55F, -0.1F);
		handguard.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, -0.7854F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 95, 127, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(4.45F, -4.7F, -0.1F);
		handguard.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.0F, 0.0F, 0.7854F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 83, 127, -0.8F, -0.8F, -0.2F, 1, 1, 1, -0.201F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.1F, 0.0F, 0.0F);
		handguard.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.0F, 0.0F, -0.8552F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 56, 0.0F, 0.0F, 0.0F, 1, 2, 22, -0.002F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(4.5F, 0.0F, 0.0F);
		handguard.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.0F, 0.0F, 0.8552F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 55, 24, -1.0F, 0.0F, 0.0F, 1, 2, 22, -0.002F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(5.3F, -14.9F, 1.25F);
		handguard.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 1.5708F);
		bone4.cubeList.add(new ModelBox(bone4, 112, 19, 12.2F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 112, 16, 12.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 98, 111, 12.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 92, 111, 12.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 83, 111, 12.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 75, 111, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 110, 107, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 110, 104, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone4.cubeList.add(new ModelBox(bone4, 80, 149, 12.3F, 0.4F, -1.25F, 2, 1, 11, -0.001F, false));
		bone4.cubeList.add(new ModelBox(bone4, 110, 102, 12.3F, 0.4F, 9.35F, 2, 1, 1, -0.002F, false));
		bone4.cubeList.add(new ModelBox(bone4, 165, 87, 12.1F, 0.4F, -1.25F, 1, 1, 11, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 45, 119, 12.1F, 0.4F, 9.35F, 1, 1, 1, -0.003F, false));
		bone4.cubeList.add(new ModelBox(bone4, 55, 95, 12.2F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone4.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.0F, 0.0F, 0.8901F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 73, 103, 8.6105F, -11.08F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 165, 129, 8.5605F, -10.93F, 0.4F, 1, 1, 11, -0.35F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 86, 119, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 96, 119, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 104, 119, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 25, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 29, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 38, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 42, 8.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 46, 8.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone4.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.0F, -0.8901F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 79, 103, 8.0105F, 10.68F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 165, 141, 8.0605F, 10.83F, 0.4F, 1, 1, 11, -0.35F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 49, 119, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 92, 119, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 100, 119, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 23, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 27, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 31, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 40, 8.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 44, 8.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(15.5F, 2.2F, 1.25F);
		handguard.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
		bone6.cubeList.add(new ModelBox(bone6, 110, 75, 12.2F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 110, 72, 12.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 110, 70, 12.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 110, 68, 12.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 110, 66, 12.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 110, 63, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 97, 107, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 106, 0, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 6, 100, 12.2F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 102, 91, 12.2F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 42, 99, 12.2F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 100, 12.2F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 96, 71, 12.2F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 79, 98, 12.2F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 94, 61, 12.2F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 94, 4, 12.2F, -0.2F, 19.95F, 2, 1, 1, -0.198F, false));
		bone6.cubeList.add(new ModelBox(bone6, 96, 14, 12.2F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 24, 12.3F, 0.4F, -1.25F, 2, 1, 22, -0.001F, false));
		bone6.cubeList.add(new ModelBox(bone6, 55, 57, 12.1F, 0.4F, -1.25F, 1, 1, 22, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 87, 94, 12.2F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
		bone6.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 42, 103, 8.6105F, -11.08F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 110, 8.5605F, -10.93F, 0.4F, 1, 1, 21, -0.35F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 65, 106, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 28, 106, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 106, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 89, 106, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 77, 106, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 69, 111, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 103, 107, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 114, 60, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 104, 113, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 23, 117, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 26, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 28, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 31, 117, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 41, 117, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 43, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 45, 8.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r62.cubeList.add(new ModelBox(cube_r62, 49, 117, 8.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone6.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 55, 103, 8.0105F, 10.68F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 110, 57, 8.0605F, 10.83F, 0.4F, 1, 1, 21, -0.35F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 71, 106, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 34, 106, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 59, 106, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 48, 107, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 83, 106, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 104, 111, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 63, 111, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 104, 115, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 114, 57, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 22, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 24, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 27, 117, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 30, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 39, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 41, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 45, 117, 8.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 47, 8.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-0.7F, -14.9F, 1.25F);
		handguard.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -1.5708F);
		bone5.cubeList.add(new ModelBox(bone5, 110, 100, -14.2F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 95, -14.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 92, -14.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 90, -14.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 88, -14.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 85, -14.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 83, -14.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 81, -14.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 148, -14.3F, 0.4F, -1.25F, 2, 1, 11, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 79, -14.3F, 0.4F, 9.35F, 2, 1, 1, -0.002F, false));
		bone5.cubeList.add(new ModelBox(bone5, 110, 151, -13.1F, 0.4F, -1.25F, 1, 1, 11, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 75, 118, -13.1F, 0.4F, 9.35F, 1, 1, 1, -0.003F, false));
		bone5.cubeList.add(new ModelBox(bone5, 94, 90, -14.2F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(1.6F, 0.0F, -1.25F);
		bone5.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.0F, 0.0F, -0.8901F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 61, 103, -9.6105F, -11.08F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 20, 164, -9.5605F, -10.93F, 0.4F, 1, 1, 11, -0.35F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 83, 118, -9.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 90, -9.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 100, -9.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 104, -9.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 114, -9.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 118, -9.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 27, 119, -9.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r64.cubeList.add(new ModelBox(cube_r64, 41, 119, -9.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.0F, 0.0F, -1.25F);
		bone5.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, 0.0F, 0.8901F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 67, 103, -9.0105F, 10.68F, -0.2F, 1, 1, 2, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 68, 165, -9.0605F, 10.83F, 0.4F, 1, 1, 11, -0.35F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 79, 118, -9.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 88, -9.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 92, -9.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 102, -9.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 112, -9.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 116, -9.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 23, 119, -9.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 31, 119, -9.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));

		magazine = new QRenderer(this);
		magazine.setRotationPoint(0.25F, -4.0F, -24.95F);
		magazine.cubeList.add(new ModelBox(magazine, 114, 112, -1.0F, -5.0F, 0.25F, 1, 15, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 12, 24, -1.35F, -5.0F, 0.45F, 1, 18, 4, -0.002F, false));
		magazine.cubeList.add(new ModelBox(magazine, 55, 24, -3.25F, -5.0F, 5.45F, 3, 18, 3, -0.002F, false));
		magazine.cubeList.add(new ModelBox(magazine, 8, 80, -2.15F, -5.0F, 3.75F, 2, 18, 2, -0.003F, false));
		magazine.cubeList.add(new ModelBox(magazine, 55, 67, -0.7F, 12.3F, 0.05F, 1, 1, 9, -0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 66, 48, -1.0F, 12.2F, 7.45F, 1, 1, 2, -0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 27, -0.7F, 10.3F, -0.25F, 1, 3, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 110, 112, -1.0F, -5.0F, 0.75F, 1, 15, 1, -0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 65, 111, -1.0F, -5.0F, 2.5F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 101, 71, -1.0F, -5.0F, 5.0F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 11, 73, -1.0F, 9.8F, 5.0F, 1, 1, 2, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 73, 80, -1.0F, -5.0F, 8.0F, 1, 16, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 48, 14, -3.5F, -5.0F, 8.0F, 1, 16, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 16, 80, -3.5F, -5.0F, 5.0F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 101, 14, -3.5F, -5.0F, 2.5F, 1, 15, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 16, 110, -3.5F, -5.0F, 0.75F, 1, 15, 1, -0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 112, 0, -3.5F, -5.0F, 0.25F, 1, 15, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 24, -3.15F, -5.0F, 0.45F, 2, 18, 4, -0.003F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 24, -3.5F, 9.8F, 5.0F, 1, 1, 2, 0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 26, 47, -3.5F, 12.2F, 7.45F, 1, 1, 2, -0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 55, 57, -3.8F, 12.3F, 0.05F, 1, 1, 9, -0.1F, false));
		magazine.cubeList.add(new ModelBox(magazine, 18, 24, -3.8F, 10.3F, -0.25F, 1, 3, 1, -0.2F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 80, -3.35F, -5.0F, 3.75F, 2, 18, 2, -0.004F, false));
		magazine.cubeList.add(new ModelBox(magazine, 8, 110, -3.25F, -3.0F, 8.45F, 3, 16, 1, -0.001F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 110, -3.25F, -5.0F, -0.1F, 3, 18, 1, -0.001F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-3.5F, 10.0F, 0.25F);
		magazine.addChild(cube_r66);
		setRotationAngle(cube_r66, 1.3736F, 0.0F, 0.0F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 12, 58, 0.0F, 7.8F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 56, 0.0F, 4.8F, 0.0F, 1, 2, 1, -0.002F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 49, 8, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 18, 0, 0.0F, 0.4F, 0.0F, 1, 1, 1, -0.003F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 24, 0.0F, 2.2F, 0.0F, 1, 3, 1, -0.001F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 64, 24, 2.5F, 0.4F, 0.0F, 1, 1, 1, -0.003F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 11, 71, 2.5F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 61, 0, 2.5F, 7.8F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 24, 56, 2.5F, 4.8F, 0.0F, 1, 2, 1, -0.002F, false));
		cube_r66.cubeList.add(new ModelBox(cube_r66, 0, 47, 2.5F, 2.2F, 0.0F, 1, 3, 1, -0.001F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-3.5F, 10.2F, 0.25F);
		magazine.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.192F, 0.0F, 0.0F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 55, 0, -0.2F, -0.2F, -0.4F, 1, 1, 10, -0.2F, false));
		cube_r67.cubeList.add(new ModelBox(cube_r67, 55, 11, 2.7F, -0.2F, -0.4F, 1, 1, 10, -0.2F, false));
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
