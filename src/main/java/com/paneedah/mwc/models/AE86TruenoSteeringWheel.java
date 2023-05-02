package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AE86TruenoSteeringWheel extends ModelBase {
	private final QRenderer steering_wheel;
	private final ModelRenderer bone111;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone110;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone112;
	private final ModelRenderer bone116;
	private final ModelRenderer bone117;
	private final ModelRenderer bone118;
	private final ModelRenderer bone115;
	private final ModelRenderer bone114;
	private final ModelRenderer bone113;
	private final ModelRenderer bone109;
	private final ModelRenderer cube_r3;
	private final QRenderer body_AE86;
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
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer bone12;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer headlights;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer bone14;
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
	private final ModelRenderer bone15;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer bone16;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer bone17;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer bone18;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer interior;
	private final ModelRenderer front_seats;
	private final ModelRenderer seat_driver;
	private final ModelRenderer upper_chair3;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer lower_chair3;
	private final ModelRenderer basechairpiece_r1;
	private final ModelRenderer basechairpiece_r2;
	private final ModelRenderer seat_passenger;
	private final ModelRenderer upper_chair4;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer lower_chair4;
	private final ModelRenderer basechairpiece_r3;
	private final ModelRenderer basechairpiece_r4;
	private final ModelRenderer front_seats_performance;
	private final ModelRenderer seat_driver_performance;
	private final ModelRenderer upper_chair;
	private final ModelRenderer bone96;
	private final ModelRenderer basechairpiece_r5;
	private final ModelRenderer bone101;
	private final ModelRenderer secondaryseatpad_r1;
	private final ModelRenderer bone99;
	private final ModelRenderer bone4;
	private final ModelRenderer secondaryseatpad_r2;
	private final ModelRenderer secondaryseatpad_r3;
	private final ModelRenderer bone100;
	private final ModelRenderer secondaryseatpad_r4;
	private final ModelRenderer secondaryseatpad_r5;
	private final ModelRenderer lower_chair;
	private final ModelRenderer secondaryseatpad_r6;
	private final ModelRenderer secondaryseatpad_r7;
	private final ModelRenderer seat_passenger_performance;
	private final ModelRenderer upper_chair2;
	private final ModelRenderer bone5;
	private final ModelRenderer basechairpiece_r6;
	private final ModelRenderer bone6;
	private final ModelRenderer secondaryseatpad_r8;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer secondaryseatpad_r9;
	private final ModelRenderer secondaryseatpad_r10;
	private final ModelRenderer bone9;
	private final ModelRenderer secondaryseatpad_r11;
	private final ModelRenderer secondaryseatpad_r12;
	private final ModelRenderer lower_chair2;
	private final ModelRenderer secondaryseatpad_r13;
	private final ModelRenderer secondaryseatpad_r14;
	private final ModelRenderer backseats;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer detailing;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer bone76;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer bone84;
	private final ModelRenderer bone85;
	private final ModelRenderer bone80;
	private final ModelRenderer bone93;
	private final ModelRenderer bone94;
	private final ModelRenderer bone81;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer bone3;
	private final ModelRenderer bone91;
	private final ModelRenderer bone92;
	private final QRenderer wheel;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final QRenderer windows;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;

	public AE86TruenoSteeringWheel() {
		textureWidth = 700;
		textureHeight = 800;

		steering_wheel = new QRenderer(this);
		steering_wheel.setRotationPoint(7.0F, 21.0F, -7.0F);
		setRotationAngle(steering_wheel, -0.1309F, 0.0F, 0.0F);
		

		bone111 = new ModelRenderer(this);
		bone111.setRotationPoint(-15.5F, -27.0F, 33.5F);
		steering_wheel.addChild(bone111);
		setRotationAngle(bone111, -1.2043F, -0.3142F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.5F, -1.3584F, 1.5664F);
		bone111.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.1309F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 658, -30.3044F, -9.6659F, -3.3716F, 4, 2, 2, 0.0F, false));

		bone110 = new ModelRenderer(this);
		bone110.setRotationPoint(-22.5F, -27.0F, 33.5F);
		steering_wheel.addChild(bone110);
		setRotationAngle(bone110, -1.2043F, 0.3142F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -1.3584F, 1.5664F);
		bone110.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, -0.1309F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 8, 662, -29.2234F, 7.0666F, -2.5397F, 4, 2, 2, 0.0F, false));

		bone112 = new ModelRenderer(this);
		bone112.setRotationPoint(-16.5F, -25.0F, 31.3F);
		steering_wheel.addChild(bone112);
		setRotationAngle(bone112, -1.0123F, 0.0F, 0.0F);
		bone112.cubeList.add(new ModelBox(bone112, 234, 642, -32.479F, -4.8294F, 1.3262F, 2, 1, 5, 0.0F, false));

		bone116 = new ModelRenderer(this);
		bone116.setRotationPoint(-20.0F, -32.0F, 32.7F);
		steering_wheel.addChild(bone116);
		setRotationAngle(bone116, 0.2269F, -0.1745F, 1.2217F);
		bone116.cubeList.add(new ModelBox(bone116, 248, 642, -12.5884F, 24.9713F, -4.126F, 2, 7, 2, 0.0F, false));

		bone117 = new ModelRenderer(this);
		bone117.setRotationPoint(-18.5F, -20.0F, 37.3F);
		steering_wheel.addChild(bone117);
		setRotationAngle(bone117, -0.0698F, 0.4189F, -1.8151F);
		bone117.cubeList.add(new ModelBox(bone117, 264, 642, 7.2049F, -28.6082F, 1.7481F, 2, 6, 2, 0.0F, false));

		bone118 = new ModelRenderer(this);
		bone118.setRotationPoint(-19.5F, -20.0F, 37.3F);
		steering_wheel.addChild(bone118);
		setRotationAngle(bone118, -0.0698F, -0.4189F, 1.8151F);
		bone118.cubeList.add(new ModelBox(bone118, 0, 658, 3.6134F, 27.93F, -0.0194F, 2, 6, 2, 0.0F, false));

		bone115 = new ModelRenderer(this);
		bone115.setRotationPoint(-18.0F, -32.0F, 32.7F);
		steering_wheel.addChild(bone115);
		setRotationAngle(bone115, 0.2269F, 0.1745F, -1.2217F);
		bone115.cubeList.add(new ModelBox(bone115, 256, 642, -8.9474F, -28.9089F, 4.778F, 2, 7, 2, 0.0F, false));

		bone114 = new ModelRenderer(this);
		bone114.setRotationPoint(-24.5F, -24.0F, 35.9F);
		steering_wheel.addChild(bone114);
		setRotationAngle(bone114, 0.3665F, 0.3142F, 0.0F);
		bone114.cubeList.add(new ModelBox(bone114, 218, 642, -29.4596F, -12.1218F, -7.648F, 2, 10, 2, 0.0F, false));

		bone113 = new ModelRenderer(this);
		bone113.setRotationPoint(-13.5F, -24.0F, 35.9F);
		steering_wheel.addChild(bone113);
		setRotationAngle(bone113, 0.3665F, -0.3142F, 0.0F);
		bone113.cubeList.add(new ModelBox(bone113, 226, 642, -27.7016F, -5.6987F, 9.0845F, 2, 10, 2, 0.0F, false));

		bone109 = new ModelRenderer(this);
		bone109.setRotationPoint(-18.5F, -29.0F, 32.0F);
		steering_wheel.addChild(bone109);
		setRotationAngle(bone109, -1.4137F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.5F, -2.0524F, 2.0007F);
		bone109.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2618F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 648, -30.5F, 1.0F, -1.0F, 3, 6, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 36, 658, -30.5F, -2.0F, 1.0F, 3, 4, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 172, 642, -31.5F, -2.0F, -2.0F, 5, 3, 3, 0.0F, false));

		body_AE86 = new QRenderer(this);
		body_AE86.setRotationPoint(31.0F, 24.0F, 0.0F);
		body_AE86.cubeList.add(new ModelBox(body_AE86, 0, 0, -89.0F, -9.0F, 12.0F, 58, 4, 61, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 0, 385, -87.0F, -29.0F, 21.0F, 54, 3, 2, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 390, 74, -80.0F, -48.0F, 38.0F, 40, 3, 36, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 138, 287, -86.0F, -11.0F, -27.0F, 52, 3, 15, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 138, 270, -86.0F, -8.0F, -28.0F, 52, 1, 16, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 188, 642, -43.0F, -10.25F, -29.0F, 6, 3, 2, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 172, 653, -83.0F, -10.25F, -29.0F, 6, 3, 2, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 248, 148, -84.0F, -23.0F, -12.0F, 48, 18, 24, 0.0F, false));
		body_AE86.cubeList.add(new ModelBox(body_AE86, 190, 317, -88.0F, -19.5F, -31.0F, 56, 1, 9, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-60.0F, -17.3368F, -28.7576F);
		body_AE86.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.1745F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 422, -24.0F, -2.0F, -1.5F, 50, 4, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-44.5F, -17.8368F, -29.2576F);
		body_AE86.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.1745F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 20, 658, -0.5F, -1.0F, -1.5F, 1, 4, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 188, 647, 8.5F, -1.0F, -1.5F, 4, 4, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 204, 642, -43.5F, -1.0F, -1.5F, 4, 4, 3, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 28, 658, -31.5F, -1.0F, -1.5F, 1, 4, 3, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-60.0F, -12.6476F, -27.563F);
		body_AE86.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.2182F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 116, 366, -28.0F, -2.0F, -1.5F, 56, 4, 3, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-60.0F, -14.8748F, -28.8235F);
		body_AE86.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.1745F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 236, 366, -28.0F, -0.5F, -1.5F, 56, 4, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-33.75F, -8.5F, -19.75F);
		body_AE86.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.1309F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 44, 546, -1.0F, -2.5F, -7.0F, 2, 3, 15, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 392, 521, -1.0F, 0.5F, -8.0F, 2, 1, 16, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-86.25F, -8.5F, -19.75F);
		body_AE86.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, -0.1309F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 78, 546, -1.0F, -2.5F, -7.0F, 2, 3, 15, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 428, 521, -1.0F, 0.5F, -8.0F, 2, 1, 16, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-32.0117F, -24.757F, -0.0459F);
		body_AE86.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0611F, 0.0873F, -0.1309F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 463, -2.0F, -1.5F, -12.0F, 4, 4, 24, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-87.9883F, -24.757F, -0.0459F);
		body_AE86.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0611F, -0.0873F, 0.1309F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 80, 457, -2.0F, -1.5F, -12.0F, 4, 4, 24, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-31.1086F, -25.4924F, 42.4476F);
		body_AE86.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0175F, 0.0F, -0.1309F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 130, 74, -2.0F, -5.5F, -30.5F, 4, 11, 61, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-88.8914F, -25.4924F, 42.4476F);
		body_AE86.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0175F, 0.0F, 0.1309F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 260, 74, -2.0F, -5.5F, -30.5F, 4, 11, 61, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-35.8343F, -34.6711F, 101.61F);
		body_AE86.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.3491F, -0.0436F, 0.2182F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 607, -2.0F, -1.0F, -5.0F, 4, 5, 9, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-84.1657F, -34.6711F, 101.61F);
		body_AE86.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.3491F, 0.0436F, -0.2182F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 150, 607, -2.0F, -1.0F, -5.0F, 4, 5, 9, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-33.1129F, -26.6536F, 103.9529F);
		body_AE86.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0436F, -0.0436F, -0.1309F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 110, 493, -2.0F, -7.0F, -7.0F, 4, 14, 14, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-86.8871F, -26.6536F, 103.9529F);
		body_AE86.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0436F, 0.0436F, 0.1309F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 146, 493, -2.0F, -7.0F, -7.0F, 4, 14, 14, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-32.2948F, -27.8081F, 80.9095F);
		body_AE86.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0436F, -0.0436F, -0.1309F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 112, 380, -2.0F, -5.0F, -16.0F, 4, 10, 32, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-87.7052F, -27.8081F, 80.9095F);
		body_AE86.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0436F, 0.0436F, 0.1309F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 184, 380, -2.0F, -5.0F, -16.0F, 4, 10, 32, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-32.3854F, -16.7215F, -19.5628F);
		body_AE86.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0175F, 0.0873F, 0.1745F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 495, -2.0F, -1.5F, -10.5F, 4, 3, 18, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-87.6146F, -16.7215F, -19.5628F);
		body_AE86.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0175F, -0.0873F, -0.1745F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 66, 493, -2.0F, -1.5F, -10.5F, 4, 3, 18, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-28.4625F, -17.036F, 42.5F);
		body_AE86.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0175F, 0.0F, 0.1745F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 0, 148, -0.5F, -1.5F, -30.5F, 1, 3, 61, 0.0F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-91.5375F, -17.036F, 42.5F);
		body_AE86.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0175F, 0.0F, -0.1745F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 124, 148, -0.5F, -1.5F, -30.5F, 1, 3, 61, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-33.182F, -15.76F, -19.7589F);
		body_AE86.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0175F, 0.0436F, 0.1745F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 36, 521, 0.0F, -4.0F, -8.0F, 2, 9, 16, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-86.818F, -15.76F, -19.7589F);
		body_AE86.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0175F, -0.0436F, -0.1745F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 72, 521, -2.0F, -4.0F, -8.0F, 2, 9, 16, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-31.2718F, -15.0005F, 19.0F);
		body_AE86.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0175F, 0.0F, 0.1745F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 428, 0, -2.0F, -5.5F, -7.0F, 4, 13, 61, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-88.7282F, -15.0005F, 19.0F);
		body_AE86.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0175F, 0.0F, -0.1745F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 0, 74, -2.0F, -5.5F, -7.0F, 4, 13, 61, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-94.5F, -32.5F, 23.5F);
		body_AE86.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3927F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 48, 642, -3.5F, -2.5F, -1.5F, 8, 5, 3, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-25.5F, -32.5F, 23.5F);
		body_AE86.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.0F, -0.3927F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 48, 650, -4.5F, -2.5F, -1.5F, 8, 5, 3, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-35.9252F, -37.7047F, 61.4784F);
		body_AE86.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0873F, 0.0F, -0.48F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 140, 581, -1.5F, -10.5F, -2.5F, 3, 21, 5, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-84.0748F, -37.7047F, 61.4784F);
		body_AE86.addChild(cube_r31);
		setRotationAngle(cube_r31, 0.0873F, 0.0F, 0.48F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 196, 581, -1.5F, -10.5F, -2.5F, 3, 21, 5, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-40.3926F, -40.838F, 88.6637F);
		body_AE86.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.2932F, 0.2547F, 0.3575F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 104, 422, -2.0F, -1.0F, -16.5F, 4, 2, 33, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-79.6074F, -40.838F, 88.6637F);
		body_AE86.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.2932F, -0.2547F, -0.3575F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 178, 422, -2.0F, -1.0F, -16.5F, 4, 2, 33, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-84.0F, -38.5676F, 27.3769F);
		body_AE86.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.5744F, 0.3911F, 0.0361F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 348, 422, -2.0F, -1.5F, -13.75F, 4, 3, 29, 0.0F, true));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-36.0F, -38.5676F, 27.3769F);
		body_AE86.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.5744F, -0.3911F, -0.0361F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 348, 422, -2.0F, -1.5F, -13.75F, 4, 3, 29, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-60.0F, -11.578F, 104.0369F);
		body_AE86.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0873F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 270, -27.0F, -3.0F, -7.0F, 54, 6, 14, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-61.0F, -11.0F, 95.0F);
		body_AE86.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.1745F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 236, 212, -23.0F, -2.0F, -23.0F, 48, 4, 25, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.1607F, -17.398F, 107.2391F);
		body_AE86.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.1309F, 0.0F);
		

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-57.5677F, -14.6583F, 105.4919F);
		body_AE86.addChild(bone11);
		

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(24.1354F, -0.25F, 0.0F);
		bone11.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0436F, -0.0436F, 0.1745F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 0, 521, -2.0F, -5.5F, -8.0F, 4, 11, 14, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-29.0F, -0.25F, 0.0F);
		bone11.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0436F, 0.0436F, -0.1745F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 108, 521, -2.0F, -5.5F, -8.0F, 4, 11, 14, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-31.0F, -24.5217F, -4.0775F);
		body_AE86.addChild(bone12);
		setRotationAngle(bone12, 0.2182F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 238, 0, -56.0F, -4.0F, -17.5F, 54, 3, 41, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 478, 422, -45.0F, -4.0F, -23.5F, 32, 5, 6, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(27.5F, -1.5237F, -0.2164F);
		bone12.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0436F, 0.0F, 1.309F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 274, 270, -9.6743F, 26.0057F, -23.8376F, 5, 3, 44, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-27.5F, -1.5237F, -0.2164F);
		bone12.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0436F, 0.0F, -1.309F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 317, -10.3372F, -29.9647F, -21.3939F, 5, 3, 44, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.001F, -3.1664F, -23.4239F);
		bone12.addChild(cube_r42);
		setRotationAngle(cube_r42, -0.3054F, 0.0F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 294, 477, -45.0F, 0.5F, -0.5F, 32, 3, 1, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.001F, -3.1664F, -23.4239F);
		bone12.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.5672F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 0, 493, -45.0F, -0.5F, -0.5F, 32, 1, 1, 0.0F, false));

		headlights = new ModelRenderer(this);
		headlights.setRotationPoint(0.0F, -1.5F, -17.0F);
		bone12.addChild(headlights);
		headlights.cubeList.add(new ModelBox(headlights, 92, 607, -55.0F, -2.5F, -6.5F, 10, 3, 6, 0.0F, false));
		headlights.cubeList.add(new ModelBox(headlights, 60, 607, -13.0F, -2.5F, -6.5F, 10, 3, 6, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-21.001F, -0.4013F, -7.2298F);
		headlights.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.5672F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 110, 642, 8.0F, -2.0F, -0.5F, 10, 4, 1, 0.0F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 110, 647, -34.0F, -2.0F, -0.5F, 10, 4, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-22.001F, 0.6834F, -2.0868F);
		headlights.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.4363F, 0.0F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 172, 546, 9.0F, -0.99F, -4.7939F, 10, 4, 8, 0.0F, false));
		cube_r45.cubeList.add(new ModelBox(cube_r45, 208, 546, -33.0F, -0.99F, -4.7939F, 10, 4, 8, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-31.0F, -25.9643F, 115.1429F);
		body_AE86.addChild(bone14);
		bone14.cubeList.add(new ModelBox(bone14, 190, 344, -56.0F, -10.0357F, -12.3929F, 54, 3, 8, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-29.0F, -6.6039F, -4.9175F);
		bone14.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.2618F, 0.0F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 354, 366, -27.5F, -3.0F, -1.5F, 55, 5, 3, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-29.0F, 12.6787F, -2.9675F);
		bone14.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.829F, 0.0F, 0.0F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 0, 380, -27.0F, -2.5F, -1.0F, 54, 3, 2, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-29.0F, 13.6787F, -3.4675F);
		bone14.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.3491F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 354, 374, -27.0F, -1.5F, -1.0F, 54, 4, 2, 0.0F, false));

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(1.0F, 8.9633F, -8.5992F);
		bone14.addChild(cube_r49);
		setRotationAngle(cube_r49, 0.0436F, -0.1309F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 182, 493, -1.0F, -3.5F, -9.0F, 2, 7, 17, 0.0F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-59.0F, 8.9633F, -8.5992F);
		bone14.addChild(cube_r50);
		setRotationAngle(cube_r50, 0.0436F, 0.1309F, 0.0F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 220, 493, -1.0F, -3.5F, -9.0F, 2, 7, 17, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-29.5F, 7.7143F, -8.6429F);
		bone14.addChild(cube_r51);
		setRotationAngle(cube_r51, 0.0436F, 0.0F, 0.0F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 392, 148, -28.5F, -2.5F, -9.0F, 58, 7, 18, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-38.75F, 4.4825F, -2.9957F);
		bone14.addChild(cube_r52);
		setRotationAngle(cube_r52, 0.1309F, 0.0F, 0.48F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 44, 662, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-19.25F, 4.4825F, -2.9957F);
		bone14.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.1309F, 0.0F, -0.48F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 52, 658, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-30.0F, 4.4868F, -2.9859F);
		bone14.addChild(cube_r54);
		setRotationAngle(cube_r54, 0.1309F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 136, 565, -9.0F, 0.0F, -1.0F, 20, 1, 2, 0.0F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-10.0F, 3.9868F, -2.9859F);
		bone14.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.1309F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 136, 568, -9.0F, -1.0F, -1.0F, 19, 3, 2, 0.0F, false));
		cube_r55.cubeList.add(new ModelBox(cube_r55, 136, 573, -48.0F, -1.0F, -1.0F, 19, 3, 2, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-10.0F, 3.2953F, -2.314F);
		bone14.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.2618F, 0.0F, 0.0F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 156, 581, -9.0F, -0.5F, -0.5F, 19, 1, 1, 0.0F, false));
		cube_r56.cubeList.add(new ModelBox(cube_r56, 156, 583, -48.0F, -0.5F, -0.5F, 19, 1, 1, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-8.75F, -1.0357F, -2.6429F);
		bone14.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.1309F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 546, -10.0F, -2.0F, -2.5F, 19, 6, 3, 0.0F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 555, -49.5F, -2.0F, -2.5F, 19, 6, 3, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-29.0F, -3.685F, -4.2844F);
		bone14.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.2182F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 116, 373, -28.5F, -1.0F, -1.5F, 57, 2, 3, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-29.0F, 1.0777F, -3.8732F);
		bone14.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.1309F, 0.0F, 0.0F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 346, 521, -11.0F, -4.0F, -0.5F, 22, 8, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-59.4883F, -25.757F, -0.0459F);
		body_AE86.addChild(bone15);
		setRotationAngle(bone15, 0.0F, -0.0873F, 0.0F);
		

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-1.0432F, 3.2443F, -8.4063F);
		bone15.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.6109F, -0.3054F, 0.3927F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 84, 581, -26.6952F, 13.5424F, -3.2921F, 3, 4, 11, 0.0F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(-1.0432F, 11.2443F, 12.9981F);
		bone15.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.0F, 0.3927F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 342, 622, -29.8081F, -5.25F, -10.2436F, 4, 13, 4, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(-1.0432F, 3.2443F, 9.4981F);
		bone15.addChild(cube_r62);
		setRotationAngle(cube_r62, -0.6109F, 0.3054F, 0.3927F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 270, 565, -28.2153F, 10.7771F, -3.7587F, 3, 4, 12, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(-1.0432F, 0.2443F, 0.4981F);
		bone15.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.0F, 0.0F, 0.5236F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 112, 581, -27.0192F, 12.9448F, -2.9725F, 3, 4, 11, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-59.2383F, -25.757F, 84.9541F);
		body_AE86.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0436F, 0.0873F);
		

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-1.0432F, 3.2443F, -8.4063F);
		bone16.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.6109F, -0.3054F, 0.3927F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 28, 581, -26.8875F, 13.2034F, -7.829F, 3, 4, 11, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-1.0432F, 11.2443F, -11.9063F);
		bone16.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.0F, -0.3927F, -0.2182F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 0, 642, -28.4768F, -8.8992F, 7.0993F, 4, 12, 4, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-1.0432F, 11.2443F, 12.9981F);
		bone16.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.0F, 0.3927F, -0.2182F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 32, 642, -27.5374F, -8.8992F, -13.3674F, 4, 11, 4, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-1.0432F, 3.2443F, 9.4981F);
		bone16.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.6109F, 0.3054F, 0.3927F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 240, 565, -26.1296F, 14.5821F, -5.1399F, 3, 4, 12, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(-1.0432F, 0.2443F, 0.4981F);
		bone16.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.0F, 0.0F, 0.5236F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 56, 581, -25.7316F, 15.12F, -6.7601F, 3, 4, 11, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-2.7617F, -25.757F, 84.9541F);
		body_AE86.addChild(bone17);
		setRotationAngle(bone17, 0.0F, -0.0436F, -0.0873F);
		

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(1.0432F, 3.2443F, -8.4063F);
		bone17.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.6109F, 0.3054F, -0.3927F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 390, 565, -25.8875F, -16.2034F, -3.171F, 3, 4, 11, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(1.0432F, 11.2443F, -11.9063F);
		bone17.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, 0.3927F, 0.2182F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 358, 622, -29.5646F, -1.3406F, -12.5574F, 4, 12, 4, 0.0F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(1.0432F, 11.2443F, 12.9981F);
		bone17.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, -0.3927F, 0.2182F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 16, 642, -28.5751F, -1.3406F, 10.9463F, 4, 11, 4, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(1.0432F, 3.2443F, 9.4981F);
		bone17.addChild(cube_r72);
		setRotationAngle(cube_r72, -0.6109F, -0.3054F, -0.3927F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 210, 565, -25.1296F, -17.5821F, -5.8601F, 3, 4, 12, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(1.0432F, 0.2443F, 0.4981F);
		bone17.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, -0.5236F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 0, 581, -24.7316F, -18.12F, -4.2399F, 3, 4, 11, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-2.5117F, -25.757F, -0.0459F);
		body_AE86.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0873F, 0.0F);
		

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(1.0432F, 3.2443F, -8.4063F);
		bone18.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.6109F, 0.3054F, -0.3927F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 334, 565, -25.6952F, -16.5424F, -7.7079F, 3, 4, 11, 0.0F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(1.0432F, 11.2443F, 12.9981F);
		bone18.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.0F, -0.3927F, 0.0F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 326, 622, -29.5074F, -5.25F, 7.1973F, 4, 13, 4, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(1.0432F, 3.2443F, 9.4981F);
		bone18.addChild(cube_r76);
		setRotationAngle(cube_r76, -0.6109F, -0.3054F, -0.3927F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 180, 565, -27.2153F, -13.7771F, -7.2413F, 3, 4, 12, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(1.0432F, 0.2443F, 0.4981F);
		bone18.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.0F, 0.0F, -0.5236F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 362, 565, -26.0192F, -15.9448F, -8.0275F, 3, 4, 11, 0.0F, false));

		interior = new ModelRenderer(this);
		interior.setRotationPoint(3.0F, -4.0F, -1.0F);
		body_AE86.addChild(interior);
		

		front_seats = new ModelRenderer(this);
		front_seats.setRotationPoint(0.0F, 1.0F, 0.0F);
		interior.addChild(front_seats);
		

		seat_driver = new ModelRenderer(this);
		seat_driver.setRotationPoint(-3.0F, 0.0F, 0.0F);
		front_seats.addChild(seat_driver);
		

		upper_chair3 = new ModelRenderer(this);
		upper_chair3.setRotationPoint(-19.0F, -19.5106F, 54.4386F);
		seat_driver.addChild(upper_chair3);
		setRotationAngle(upper_chair3, -0.3054F, 0.0F, 0.0F);
		upper_chair3.cubeList.add(new ModelBox(upper_chair3, 142, 546, -35.0F, -7.5F, -0.5F, 12, 16, 3, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(6.5F, 0.0F, -0.5F);
		upper_chair3.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.0F, -0.7854F, 0.0F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 122, 622, -22.0061F, -7.5F, 18.5061F, 3, 16, 4, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(-6.5F, 0.0F, -0.5F);
		upper_chair3.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.7854F, 0.0F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 136, 622, -22.0061F, -7.5F, -22.5061F, 3, 16, 4, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(0.0F, -13.6595F, -0.4602F);
		upper_chair3.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.1745F, 0.0F, 0.0F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 334, 607, -34.0F, -2.0F, -2.0F, 10, 4, 4, 0.0F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-6.0F, -11.4554F, -0.2282F);
		upper_chair3.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.1745F, 0.0F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 152, 642, -30.0F, -4.5F, -1.5F, 2, 9, 3, 0.0F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 162, 642, -18.0F, -4.5F, -1.5F, 2, 9, 3, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.0F, -8.2431F, 0.4948F);
		upper_chair3.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.1745F, 0.0F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 66, 629, -34.0F, -1.5F, -2.0F, 10, 3, 4, 0.0F, false));

		lower_chair3 = new ModelRenderer(this);
		lower_chair3.setRotationPoint(-19.0F, -11.9039F, 42.2091F);
		seat_driver.addChild(lower_chair3);
		setRotationAngle(lower_chair3, -0.1047F, 0.0F, 0.0F);
		lower_chair3.cubeList.add(new ModelBox(lower_chair3, 294, 457, -34.0F, -1.1071F, -7.0F, 10, 4, 16, 0.0F, false));

		basechairpiece_r1 = new ModelRenderer(this);
		basechairpiece_r1.setRotationPoint(6.2336F, -0.4465F, 0.0F);
		lower_chair3.addChild(basechairpiece_r1);
		setRotationAngle(basechairpiece_r1, 0.0F, 0.0F, -0.3927F);
		basechairpiece_r1.cubeList.add(new ModelBox(basechairpiece_r1, 270, 521, -28.2925F, -13.0978F, -7.0F, 3, 4, 16, 0.0F, false));

		basechairpiece_r2 = new ModelRenderer(this);
		basechairpiece_r2.setRotationPoint(-6.2336F, -0.4465F, 0.0F);
		lower_chair3.addChild(basechairpiece_r2);
		setRotationAngle(basechairpiece_r2, 0.0F, 0.0F, 0.3927F);
		basechairpiece_r2.cubeList.add(new ModelBox(basechairpiece_r2, 308, 521, -28.2925F, 9.0978F, -7.0F, 3, 4, 16, 0.0F, false));

		seat_passenger = new ModelRenderer(this);
		seat_passenger.setRotationPoint(-27.0F, 0.0F, 0.0F);
		front_seats.addChild(seat_passenger);
		

		upper_chair4 = new ModelRenderer(this);
		upper_chair4.setRotationPoint(-19.0F, -19.5106F, 54.4386F);
		seat_passenger.addChild(upper_chair4);
		setRotationAngle(upper_chair4, -0.3054F, 0.0F, 0.0F);
		upper_chair4.cubeList.add(new ModelBox(upper_chair4, 112, 546, -35.0F, -7.5F, -0.5F, 12, 16, 3, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(6.5F, 0.0F, -0.5F);
		upper_chair4.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, -0.7854F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 94, 622, -22.0061F, -7.5F, 18.5061F, 3, 16, 4, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-6.5F, 0.0F, -0.5F);
		upper_chair4.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.7854F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 108, 622, -22.0061F, -7.5F, -22.5061F, 3, 16, 4, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.0F, -13.6595F, -0.4602F);
		upper_chair4.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.1745F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 306, 607, -34.0F, -2.0F, -2.0F, 10, 4, 4, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-6.0F, -11.4554F, -0.2282F);
		upper_chair4.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.1745F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 132, 642, -30.0F, -4.5F, -1.5F, 2, 9, 3, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 142, 642, -18.0F, -4.5F, -1.5F, 2, 9, 3, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, -8.2431F, 0.4948F);
		upper_chair4.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.1745F, 0.0F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 66, 622, -34.0F, -1.5F, -2.0F, 10, 3, 4, 0.0F, false));

		lower_chair4 = new ModelRenderer(this);
		lower_chair4.setRotationPoint(-19.0F, -11.9039F, 42.2091F);
		seat_passenger.addChild(lower_chair4);
		setRotationAngle(lower_chair4, -0.1047F, 0.0F, 0.0F);
		lower_chair4.cubeList.add(new ModelBox(lower_chair4, 242, 457, -34.0F, -1.1071F, -7.0F, 10, 4, 16, 0.0F, false));

		basechairpiece_r3 = new ModelRenderer(this);
		basechairpiece_r3.setRotationPoint(6.2336F, -0.4465F, 0.0F);
		lower_chair4.addChild(basechairpiece_r3);
		setRotationAngle(basechairpiece_r3, 0.0F, 0.0F, -0.3927F);
		basechairpiece_r3.cubeList.add(new ModelBox(basechairpiece_r3, 194, 521, -28.2925F, -13.0978F, -7.0F, 3, 4, 16, 0.0F, false));

		basechairpiece_r4 = new ModelRenderer(this);
		basechairpiece_r4.setRotationPoint(-6.2336F, -0.4465F, 0.0F);
		lower_chair4.addChild(basechairpiece_r4);
		setRotationAngle(basechairpiece_r4, 0.0F, 0.0F, 0.3927F);
		basechairpiece_r4.cubeList.add(new ModelBox(basechairpiece_r4, 232, 521, -28.2925F, 9.0978F, -7.0F, 3, 4, 16, 0.0F, false));

		front_seats_performance = new ModelRenderer(this);
		front_seats_performance.setRotationPoint(0.0F, 1.0F, 0.0F);
		interior.addChild(front_seats_performance);
		

		seat_driver_performance = new ModelRenderer(this);
		seat_driver_performance.setRotationPoint(-3.0F, 0.0F, 0.0F);
		front_seats_performance.addChild(seat_driver_performance);
		

		upper_chair = new ModelRenderer(this);
		upper_chair.setRotationPoint(-27.0F, -15.0F, 34.0F);
		seat_driver_performance.addChild(upper_chair);
		

		bone96 = new ModelRenderer(this);
		bone96.setRotationPoint(8.0F, -13.0F, 25.0F);
		upper_chair.addChild(bone96);
		setRotationAngle(bone96, -0.3491F, 0.0F, 0.0F);
		

		basechairpiece_r5 = new ModelRenderer(this);
		basechairpiece_r5.setRotationPoint(0.0F, 8.7904F, -1.3573F);
		bone96.addChild(basechairpiece_r5);
		setRotationAngle(basechairpiece_r5, -0.2182F, 0.0F, 0.0F);
		basechairpiece_r5.cubeList.add(new ModelBox(basechairpiece_r5, 77, 0, -34.0F, -4.7904F, -1.6427F, 10, 17, 4, 0.0F, false));

		bone101 = new ModelRenderer(this);
		bone101.setRotationPoint(8.0F, -19.0F, 25.5F);
		upper_chair.addChild(bone101);
		setRotationAngle(bone101, -0.1396F, 0.0F, 0.0F);
		bone101.cubeList.add(new ModelBox(bone101, 351, 85, -32.0F, -1.4179F, -1.2619F, 6, 8, 4, 0.0F, false));

		secondaryseatpad_r1 = new ModelRenderer(this);
		secondaryseatpad_r1.setRotationPoint(0.0F, 14.3273F, -2.8154F);
		bone101.addChild(secondaryseatpad_r1);
		setRotationAngle(secondaryseatpad_r1, -0.2182F, 0.0F, 0.0F);
		secondaryseatpad_r1.cubeList.add(new ModelBox(secondaryseatpad_r1, 351, 52, -33.0F, -9.1493F, -0.6547F, 8, 5, 5, 0.0F, false));

		bone99 = new ModelRenderer(this);
		bone99.setRotationPoint(14.0F, -13.0F, 25.0F);
		upper_chair.addChild(bone99);
		setRotationAngle(bone99, -0.4014F, -0.8552F, 0.3142F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.0F, 10.0F, -1.5F);
		bone99.addChild(bone4);
		

		secondaryseatpad_r2 = new ModelRenderer(this);
		secondaryseatpad_r2.setRotationPoint(-3.3948F, -1.3429F, 4.8263F);
		bone4.addChild(secondaryseatpad_r2);
		setRotationAngle(secondaryseatpad_r2, -0.4408F, 0.0124F, 0.1699F);
		secondaryseatpad_r2.cubeList.add(new ModelBox(secondaryseatpad_r2, 278, 269, -16.6997F, -12.9721F, 15.9491F, 5, 13, 3, 0.0F, false));

		secondaryseatpad_r3 = new ModelRenderer(this);
		secondaryseatpad_r3.setRotationPoint(-3.3948F, -1.3429F, 4.8263F);
		bone4.addChild(secondaryseatpad_r3);
		setRotationAngle(secondaryseatpad_r3, 0.3446F, 0.0124F, 0.1699F);
		secondaryseatpad_r3.cubeList.add(new ModelBox(secondaryseatpad_r3, 370, 269, -16.6997F, 11.2975F, 11.258F, 5, 7, 2, 0.0F, false));

		bone100 = new ModelRenderer(this);
		bone100.setRotationPoint(2.0F, -13.0F, 25.0F);
		upper_chair.addChild(bone100);
		setRotationAngle(bone100, -0.4014F, 0.8552F, -0.3142F);
		

		secondaryseatpad_r4 = new ModelRenderer(this);
		secondaryseatpad_r4.setRotationPoint(5.3948F, 8.6571F, 3.3263F);
		bone100.addChild(secondaryseatpad_r4);
		setRotationAngle(secondaryseatpad_r4, 0.3446F, -0.0124F, -0.1699F);
		secondaryseatpad_r4.cubeList.add(new ModelBox(secondaryseatpad_r4, 259, 54, -24.4893F, -9.8366F, -28.8382F, 5, 7, 2, 0.0F, false));

		secondaryseatpad_r5 = new ModelRenderer(this);
		secondaryseatpad_r5.setRotationPoint(5.3948F, 8.6571F, 3.3263F);
		bone100.addChild(secondaryseatpad_r5);
		setRotationAngle(secondaryseatpad_r5, -0.4408F, -0.0124F, -0.1699F);
		secondaryseatpad_r5.cubeList.add(new ModelBox(secondaryseatpad_r5, 259, 95, -24.4893F, 0.4362F, -27.3472F, 5, 13, 3, 0.0F, false));

		lower_chair = new ModelRenderer(this);
		lower_chair.setRotationPoint(-27.0F, -15.0F, 33.0F);
		seat_driver_performance.addChild(lower_chair);
		setRotationAngle(lower_chair, -0.1047F, 0.0F, 0.0F);
		lower_chair.cubeList.add(new ModelBox(lower_chair, 0, 191, -26.0F, 1.989F, 2.2091F, 10, 4, 14, 0.0F, false));

		secondaryseatpad_r6 = new ModelRenderer(this);
		secondaryseatpad_r6.setRotationPoint(8.0F, 3.989F, 8.2091F);
		lower_chair.addChild(secondaryseatpad_r6);
		setRotationAngle(secondaryseatpad_r6, 0.0F, 0.0F, -0.3927F);
		secondaryseatpad_r6.cubeList.add(new ModelBox(secondaryseatpad_r6, 82, 660, -22.0209F, -11.9498F, -6.0F, 3, 4, 14, 0.0F, false));

		secondaryseatpad_r7 = new ModelRenderer(this);
		secondaryseatpad_r7.setRotationPoint(8.0F, 3.989F, 8.2091F);
		lower_chair.addChild(secondaryseatpad_r7);
		setRotationAngle(secondaryseatpad_r7, 0.0F, 0.0F, 0.3927F);
		secondaryseatpad_r7.cubeList.add(new ModelBox(secondaryseatpad_r7, 0, 667, -34.5641F, 10.2459F, -6.0F, 3, 4, 14, 0.0F, false));

		seat_passenger_performance = new ModelRenderer(this);
		seat_passenger_performance.setRotationPoint(-27.0F, 0.0F, 0.0F);
		front_seats_performance.addChild(seat_passenger_performance);
		

		upper_chair2 = new ModelRenderer(this);
		upper_chair2.setRotationPoint(-27.0F, -15.0F, 34.0F);
		seat_passenger_performance.addChild(upper_chair2);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(8.0F, -13.0F, 25.0F);
		upper_chair2.addChild(bone5);
		setRotationAngle(bone5, -0.3491F, 0.0F, 0.0F);
		

		basechairpiece_r6 = new ModelRenderer(this);
		basechairpiece_r6.setRotationPoint(0.0F, 8.7904F, -1.3573F);
		bone5.addChild(basechairpiece_r6);
		setRotationAngle(basechairpiece_r6, -0.2182F, 0.0F, 0.0F);
		basechairpiece_r6.cubeList.add(new ModelBox(basechairpiece_r6, 77, 0, -34.0F, -4.7904F, -1.6427F, 10, 17, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(8.0F, -19.0F, 25.5F);
		upper_chair2.addChild(bone6);
		setRotationAngle(bone6, -0.1396F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 351, 85, -32.0F, -1.4179F, -1.2619F, 6, 8, 4, 0.0F, false));

		secondaryseatpad_r8 = new ModelRenderer(this);
		secondaryseatpad_r8.setRotationPoint(0.0F, 14.3273F, -2.8154F);
		bone6.addChild(secondaryseatpad_r8);
		setRotationAngle(secondaryseatpad_r8, -0.2182F, 0.0F, 0.0F);
		secondaryseatpad_r8.cubeList.add(new ModelBox(secondaryseatpad_r8, 351, 52, -33.0F, -9.1493F, -0.6547F, 8, 5, 5, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(14.0F, -13.0F, 25.0F);
		upper_chair2.addChild(bone7);
		setRotationAngle(bone7, -0.4014F, -0.8552F, 0.3142F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-2.0F, 10.0F, -1.5F);
		bone7.addChild(bone8);
		

		secondaryseatpad_r9 = new ModelRenderer(this);
		secondaryseatpad_r9.setRotationPoint(-3.3948F, -1.3429F, 4.8263F);
		bone8.addChild(secondaryseatpad_r9);
		setRotationAngle(secondaryseatpad_r9, -0.4408F, 0.0124F, 0.1699F);
		secondaryseatpad_r9.cubeList.add(new ModelBox(secondaryseatpad_r9, 278, 269, -16.6997F, -12.9721F, 15.9491F, 5, 13, 3, 0.0F, false));

		secondaryseatpad_r10 = new ModelRenderer(this);
		secondaryseatpad_r10.setRotationPoint(-3.3948F, -1.3429F, 4.8263F);
		bone8.addChild(secondaryseatpad_r10);
		setRotationAngle(secondaryseatpad_r10, 0.3446F, 0.0124F, 0.1699F);
		secondaryseatpad_r10.cubeList.add(new ModelBox(secondaryseatpad_r10, 370, 269, -16.6997F, 11.2975F, 11.258F, 5, 7, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.0F, -13.0F, 25.0F);
		upper_chair2.addChild(bone9);
		setRotationAngle(bone9, -0.4014F, 0.8552F, -0.3142F);
		

		secondaryseatpad_r11 = new ModelRenderer(this);
		secondaryseatpad_r11.setRotationPoint(5.3948F, 8.6571F, 3.3263F);
		bone9.addChild(secondaryseatpad_r11);
		setRotationAngle(secondaryseatpad_r11, 0.3446F, -0.0124F, -0.1699F);
		secondaryseatpad_r11.cubeList.add(new ModelBox(secondaryseatpad_r11, 259, 54, -24.4893F, -9.8366F, -28.8382F, 5, 7, 2, 0.0F, false));

		secondaryseatpad_r12 = new ModelRenderer(this);
		secondaryseatpad_r12.setRotationPoint(5.3948F, 8.6571F, 3.3263F);
		bone9.addChild(secondaryseatpad_r12);
		setRotationAngle(secondaryseatpad_r12, -0.4408F, -0.0124F, -0.1699F);
		secondaryseatpad_r12.cubeList.add(new ModelBox(secondaryseatpad_r12, 259, 95, -24.4893F, 0.4362F, -27.3472F, 5, 13, 3, 0.0F, false));

		lower_chair2 = new ModelRenderer(this);
		lower_chair2.setRotationPoint(-27.0F, -15.0F, 33.0F);
		seat_passenger_performance.addChild(lower_chair2);
		setRotationAngle(lower_chair2, -0.1047F, 0.0F, 0.0F);
		lower_chair2.cubeList.add(new ModelBox(lower_chair2, 0, 191, -26.0F, 1.989F, 2.2091F, 10, 4, 14, 0.0F, false));

		secondaryseatpad_r13 = new ModelRenderer(this);
		secondaryseatpad_r13.setRotationPoint(8.0F, 3.989F, 8.2091F);
		lower_chair2.addChild(secondaryseatpad_r13);
		setRotationAngle(secondaryseatpad_r13, 0.0F, 0.0F, -0.3927F);
		secondaryseatpad_r13.cubeList.add(new ModelBox(secondaryseatpad_r13, 80, 658, -22.0209F, -11.9498F, -6.0F, 3, 4, 16, 0.0F, false));

		secondaryseatpad_r14 = new ModelRenderer(this);
		secondaryseatpad_r14.setRotationPoint(8.0F, 3.989F, 8.2091F);
		lower_chair2.addChild(secondaryseatpad_r14);
		setRotationAngle(secondaryseatpad_r14, 0.0F, 0.0F, 0.3927F);
		secondaryseatpad_r14.cubeList.add(new ModelBox(secondaryseatpad_r14, 0, 671, -34.5641F, 10.2459F, -6.0F, 3, 4, 14, 0.0F, false));

		backseats = new ModelRenderer(this);
		backseats.setRotationPoint(-34.0769F, -18.8012F, 75.4463F);
		interior.addChild(backseats);
		

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-8.4231F, 5.9461F, -3.1393F);
		backseats.addChild(cube_r88);
		setRotationAngle(cube_r88, -0.0436F, 0.0F, 0.0F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 244, 546, -2.5F, -2.5F, -6.0F, 5, 2, 12, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 278, 546, -43.5F, -2.5F, -6.0F, 5, 2, 12, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 80, 485, -38.5F, -2.5F, -6.0F, 36, 2, 3, 0.0F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 300, 565, -24.5F, -2.5F, -3.0F, 8, 2, 9, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-28.9231F, 2.4461F, 7.3607F);
		backseats.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.7418F, 0.0F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 0, 457, -18.0F, -2.5F, -7.0F, 36, 2, 4, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-28.9231F, 7.4457F, -2.6611F);
		backseats.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.2618F, 0.0F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 252, 422, -23.0F, -4.0F, -6.0F, 46, 4, 2, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-28.9231F, 7.9457F, -3.6611F);
		backseats.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.1309F, 0.0F, 0.0F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 0, 366, -23.0F, -3.0F, -6.0F, 46, 2, 12, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(-18.9231F, -10.3718F, 7.9402F);
		backseats.addChild(cube_r92);
		setRotationAngle(cube_r92, -0.48F, 0.0F, 0.0F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 212, 581, -4.0F, -2.0F, -2.0F, 10, 4, 6, 0.0F, false));
		cube_r92.cubeList.add(new ModelBox(cube_r92, 212, 591, -26.0F, -2.0F, -2.0F, 10, 4, 6, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-28.9231F, -8.1639F, 6.93F);
		backseats.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.1745F, 0.0F, 0.0F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 0, 390, -23.0F, -1.5F, -1.0F, 46, 3, 7, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(-6.9231F, -0.4683F, -0.3872F);
		backseats.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, -0.3054F, 0.0873F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 158, 457, -1.0F, -9.0F, -11.5F, 3, 18, 18, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(-50.9231F, -0.4683F, -0.3872F);
		backseats.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.3054F, -0.0873F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 200, 457, -2.0F, -9.0F, -11.5F, 3, 18, 18, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(-28.9231F, -0.2779F, 4.4824F);
		backseats.addChild(cube_r96);
		setRotationAngle(cube_r96, -0.2182F, 0.0F, 0.0F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 400, -23.0F, -9.0F, -1.0F, 46, 18, 2, 0.0F, false));

		detailing = new ModelRenderer(this);
		detailing.setRotationPoint(-38.0922F, -11.5947F, 29.0426F);
		interior.addChild(detailing);
		detailing.cubeList.add(new ModelBox(detailing, 382, 212, -47.9078F, -17.6553F, 58.9574F, 46, 19, 16, 0.0F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(-50.8226F, 4.4975F, 21.5716F);
		detailing.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, -0.7854F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 212, -2.5F, -2.0F, -36.0F, 5, 4, 54, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.1774F, 4.4975F, 21.5716F);
		detailing.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, -0.7854F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 118, 212, -2.5F, -2.0F, -36.0F, 5, 4, 54, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(-26.4078F, -13.1643F, -4.3556F);
		detailing.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.2618F, 0.0F, 0.0F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 232, 607, -2.0F, -3.0F, -2.5F, 4, 7, 8, 0.0F, false));
		cube_r99.cubeList.add(new ModelBox(cube_r99, 256, 607, -23.0F, -3.0F, -2.5F, 4, 7, 8, 0.0F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(-36.9078F, -16.5451F, -5.2615F);
		detailing.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.2618F, 0.0F, 0.0F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 144, 521, -8.5F, 0.5F, -2.5F, 17, 1, 8, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-24.9078F, -13.1053F, -23.0426F);
		detailing.addChild(bone76);
		setRotationAngle(bone76, -0.2443F, 0.0F, 0.0F);
		

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.0F, 0.0F, 8.0F);
		bone76.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.7418F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 0, 290, -27.0F, 5.296F, 0.7163F, 54, 3, 15, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(29.0F, -0.2168F, 15.7077F);
		bone76.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.5672F, 0.0F, 0.0F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 190, 327, -55.0F, -4.6373F, -3.8442F, 52, 9, 8, 0.0F, false));

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.25F, -0.4851F, 7.879F);
		bone76.addChild(bone84);
		setRotationAngle(bone84, 0.0F, -0.192F, 0.0F);
		

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(58.75F, -0.4851F, 7.879F);
		bone76.addChild(bone85);
		setRotationAngle(bone85, 0.0F, 0.192F, 0.0F);
		

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(4.0922F, -7.9053F, -7.0426F);
		detailing.addChild(bone80);
		setRotationAngle(bone80, -0.4189F, 0.0F, 0.0F);
		

		bone93 = new ModelRenderer(this);
		bone93.setRotationPoint(5.0F, -1.0F, 14.0F);
		bone80.addChild(bone93);
		setRotationAngle(bone93, 0.0F, 1.3788F, 0.0F);
		

		bone94 = new ModelRenderer(this);
		bone94.setRotationPoint(-5.0F, -1.0F, 14.0F);
		bone80.addChild(bone94);
		setRotationAngle(bone94, 0.0F, -1.3788F, 0.0F);
		

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(4.5922F, -3.6553F, 3.9574F);
		detailing.addChild(bone81);
		setRotationAngle(bone81, 0.0436F, 0.0F, 0.0F);
		

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-0.5F, -3.4205F, -6.6969F);
		bone81.addChild(cube_r103);
		setRotationAngle(cube_r103, -0.1309F, 0.0F, 0.0F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 280, 607, -32.5F, -2.8873F, -3.8324F, 7, 5, 6, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-0.5F, 1.5938F, -8.9354F);
		bone81.addChild(cube_r104);
		setRotationAngle(cube_r104, 0.1745F, 0.0F, 0.0F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 176, 607, -32.5F, -3.5952F, -2.6848F, 7, 5, 7, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.5F, 0.3811F, 11.0429F);
		bone81.addChild(cube_r105);
		setRotationAngle(cube_r105, 1.3526F, 0.0F, 0.0F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 60, 658, -30.5F, -3.8264F, -1.4848F, 1, 5, 1, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-0.5F, 3.6798F, 9.5874F);
		bone81.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.5672F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 172, 648, -31.5F, -1.0F, 0.5F, 5, 2, 3, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-0.5F, 4.9981F, 0.9128F);
		bone81.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.0873F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 204, 607, -31.5F, -4.9933F, 10.6947F, 5, 2, 9, 0.0F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 98, 317, -31.5F, -3.001F, -20.9564F, 5, 8, 41, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.625F, -1.4402F, 3.3246F);
		bone81.addChild(bone3);
		setRotationAngle(bone3, -0.3491F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 64, 658, -29.375F, -0.2555F, -0.3749F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 204, 649, -30.375F, 1.7272F, -2.0119F, 3, 3, 4, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 44, 658, -30.125F, -2.2445F, -1.1251F, 2, 2, 2, 0.0F, false));

		bone91 = new ModelRenderer(this);
		bone91.setRotationPoint(-5.0F, -1.0F, 0.0F);
		bone81.addChild(bone91);
		setRotationAngle(bone91, 0.0F, 0.0F, -1.1694F);
		

		bone92 = new ModelRenderer(this);
		bone92.setRotationPoint(4.0F, -1.0F, 0.0F);
		bone81.addChild(bone92);
		setRotationAngle(bone92, 0.0F, 0.0F, 1.1694F);
		

		wheel = new QRenderer(this);
		wheel.setRotationPoint(32.0F, 24.0F, 0.0F);
		wheel.cubeList.add(new ModelBox(wheel, 102, 565, -36.0F, -22.0F, -5.0F, 7, 4, 10, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 360, 493, -34.0F, -18.0F, -7.0F, 3, 14, 14, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 44, 622, -36.0F, -16.0F, 7.0F, 7, 10, 4, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 22, 622, -36.0F, -16.0F, -11.0F, 7, 10, 4, 0.0F, false));
		wheel.cubeList.add(new ModelBox(wheel, 68, 565, -36.0F, -4.0F, -5.0F, 7, 4, 10, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 6.0F);
		wheel.addChild(bone);
		setRotationAngle(bone, 0.7854F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 30, 607, -35.99F, -4.7071F, -0.7071F, 7, 4, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 304, 622, -35.99F, -15.7782F, -7.7782F, 7, 8, 4, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -22.0F, -5.0F);
		wheel.addChild(bone2);
		setRotationAngle(bone2, -0.7854F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 607, -35.99F, -7.0711F, 7.0711F, 7, 4, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 282, 622, -35.99F, 0.0F, 0.0F, 7, 8, 4, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 90, 650, -35.5F, 2.1213F, 9.1924F, 6, 4, 4, 0.0F, false));

		windows = new QRenderer(this);
		windows.setRotationPoint(0.0F, -9.0F, 0.0F);
		

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-58.4F, 2.4F, 19.1F);
		windows.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, 0.5236F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 447, 289, 0.0F, -27.0F, 0.0F, 0, 27, 42, 0.0F, true));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(-58.4F, 2.4F, 62.1F);
		windows.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.0192F, 0.0733F, 0.5285F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 533, 256, 0.0F, -27.0F, 0.0F, 0, 27, 42, 0.0F, true));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.4F, 2.4F, 62.1F);
		windows.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.0192F, -0.0733F, -0.5285F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 533, 256, 0.0F, -27.0F, 0.0F, 0, 27, 42, 0.0F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(0.4F, 2.4F, 19.1F);
		windows.addChild(cube_r111);
		setRotationAngle(cube_r111, 0.0F, 0.0F, -0.5236F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 447, 289, 0.0F, -27.0F, 0.0F, 0, 27, 42, 0.0F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-2.0F, -2.5F, 103.9F);
		windows.addChild(cube_r112);
		setRotationAngle(cube_r112, 1.2217F, 0.0F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 492, 369, -54.0F, -34.0F, 0.0F, 54, 34, 0, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-2.0F, 0.4F, 16.0F);
		windows.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.9774F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 447, 289, -54.0F, -27.0F, 0.0F, 54, 27, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		steering_wheel.render(f5);
//		body_AE86.render(f5);
//		wheel.render(f5);
//		windows.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
