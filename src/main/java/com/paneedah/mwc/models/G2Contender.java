package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G2Contender extends ModelWithAttachments {
	private final ModelRenderer GUN;
	private final ModelRenderer gun2;
	private final ModelRenderer grip33;
	private final ModelRenderer grip34;
	private final ModelRenderer grip35;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip36;
	private final ModelRenderer grip11_r1;
	private final ModelRenderer grip37;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip38;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer grip39;
	private final ModelRenderer grip11_r2;
	private final ModelRenderer grip40;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip41;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer grip42;
	private final ModelRenderer grip137;
	private final ModelRenderer grip138;
	private final ModelRenderer grip16_r1;
	private final ModelRenderer grip15_r1;
	private final ModelRenderer grip139;
	private final ModelRenderer grip140;
	private final ModelRenderer grip141;
	private final ModelRenderer middle2;
	private final ModelRenderer grip142;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip143;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip144;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip145;
	private final ModelRenderer grip6_r2;
	private final ModelRenderer grip146;
	private final ModelRenderer grip147;
	private final ModelRenderer grip148;
	private final ModelRenderer grip149;
	private final ModelRenderer grip10_r3;
	private final ModelRenderer grip150;
	private final ModelRenderer grip6_r3;
	private final ModelRenderer trigger2;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer cube_r1;
	private final ModelRenderer bone49;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bone50;
	private final ModelRenderer cube_r3;
	private final ModelRenderer bone51;
	private final ModelRenderer cube_r4;
	private final ModelRenderer bone52;
	private final ModelRenderer cube_r5;
	private final ModelRenderer bone53;
	private final ModelRenderer cube_r6;
	private final ModelRenderer bone54;
	private final ModelRenderer cube_r7;
	private final ModelRenderer bone55;
	private final ModelRenderer cube_r8;
	private final ModelRenderer bone56;
	private final ModelRenderer cube_r9;
	private final ModelRenderer bone57;
	private final ModelRenderer cube_r10;
	private final ModelRenderer bone58;
	private final ModelRenderer cube_r11;
	private final ModelRenderer bone59;
	private final ModelRenderer cube_r12;
	private final ModelRenderer bone60;
	private final ModelRenderer cube_r13;
	private final ModelRenderer bone61;
	private final ModelRenderer cube_r14;
	private final ModelRenderer bone62;
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone63;
	private final ModelRenderer cube_r16;
	private final ModelRenderer hammer2;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer cube_r17;
	private final ModelRenderer bone66;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone67;
	private final ModelRenderer cube_r19;
	private final ModelRenderer bone68;
	private final ModelRenderer cube_r20;
	private final ModelRenderer bone69;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone70;
	private final ModelRenderer cube_r22;
	private final ModelRenderer bone71;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;

	public G2Contender() {
		textureWidth = 512;
		textureHeight = 512;

		GUN = new ModelRenderer(this);
		GUN.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(GUN, 0.0F, 3.1416F, 0.0F);
		

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-9.0F, 0.0F, 0.0F);
		GUN.addChild(gun2);
		

		grip33 = new ModelRenderer(this);
		grip33.setRotationPoint(2.0F, -34.5F, 7.25F);
		gun2.addChild(grip33);
		grip33.cubeList.add(new ModelBox(grip33, 10, 89, 6.0F, 3.8451F, -10.5572F, 4, 1, 1, 0.0F, false));

		grip34 = new ModelRenderer(this);
		grip34.setRotationPoint(2.0F, -34.5F, 7.25F);
		gun2.addChild(grip34);
		grip34.cubeList.add(new ModelBox(grip34, 60, 3, 6.5F, 2.9791F, -10.5572F, 3, 1, 1, 0.0F, false));

		grip35 = new ModelRenderer(this);
		grip35.setRotationPoint(0.0F, -35.1549F, 8.6928F);
		gun2.addChild(grip35);
		setRotationAngle(grip35, 0.0F, 0.0F, 0.8727F);
		

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(0.3605F, 0.0636F, 0.0F);
		grip35.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 0.0F, 0.0F, -0.3491F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 0, 40, 8.8612F, -1.2859F, -11.5F, 1, 1, 1, 0.0F, false));
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 25, 45, 8.8612F, -1.2859F, -12.0F, 1, 1, 1, 0.0F, false));

		grip36 = new ModelRenderer(this);
		grip36.setRotationPoint(2.0F, -35.1549F, 8.6928F);
		gun2.addChild(grip36);
		setRotationAngle(grip36, 0.0F, 0.0F, -0.8727F);
		

		grip11_r1 = new ModelRenderer(this);
		grip11_r1.setRotationPoint(0.2823F, 0.8296F, 0.0F);
		grip36.addChild(grip11_r1);
		setRotationAngle(grip11_r1, 0.0F, 0.0F, 0.3491F);
		grip11_r1.cubeList.add(new ModelBox(grip11_r1, 24, 40, 4.8612F, 7.2141F, -11.5F, 1, 1, 1, 0.0F, false));
		grip11_r1.cubeList.add(new ModelBox(grip11_r1, 0, 42, 4.8612F, 7.2141F, -12.0F, 1, 1, 1, 0.0F, false));

		grip37 = new ModelRenderer(this);
		grip37.setRotationPoint(1.5F, -33.1549F, 8.6928F);
		gun2.addChild(grip37);
		setRotationAngle(grip37, 0.8727F, 0.0F, 0.0F);
		

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.0F, -0.1252F, 0.4672F);
		grip37.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -0.1745F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 88, 40, 6.5F, -4.8279F, -11.8807F, 4, 1, 1, 0.0F, false));

		grip38 = new ModelRenderer(this);
		grip38.setRotationPoint(1.5F, -33.2801F, 10.16F);
		gun2.addChild(grip38);
		setRotationAngle(grip38, 1.6581F, 0.0F, 0.0F);
		

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(0.0F, -0.7263F, 0.0522F);
		grip38.addChild(grip10_r2);
		setRotationAngle(grip10_r2, -0.3054F, 0.0F, 0.0F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 88, 20, 6.5F, -10.8616F, -6.8942F, 4, 1, 1, 0.0F, false));

		grip39 = new ModelRenderer(this);
		grip39.setRotationPoint(1.5F, -34.0064F, 11.2122F);
		gun2.addChild(grip39);
		setRotationAngle(grip39, 2.138F, 0.0F, 0.0F);
		

		grip11_r2 = new ModelRenderer(this);
		grip11_r2.setRotationPoint(0.0F, -1.2854F, -0.0191F);
		grip39.addChild(grip11_r2);
		setRotationAngle(grip11_r2, -0.2618F, 0.0F, 0.0F);
		grip11_r2.cubeList.add(new ModelBox(grip11_r2, 82, 15, 6.5F, -12.6706F, -0.8568F, 4, 2, 1, 0.0F, false));

		grip40 = new ModelRenderer(this);
		grip40.setRotationPoint(1.5F, -34.2917F, 11.1931F);
		gun2.addChild(grip40);
		setRotationAngle(grip40, 1.9635F, 0.0F, 0.0F);
		

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(0.0F, -0.2569F, -0.5294F);
		grip40.addChild(grip12_r1);
		setRotationAngle(grip12_r1, -0.2618F, 0.0F, 0.0F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 82, 9, 6.5F, -12.4237F, -2.9647F, 4, 2, 1, 0.0F, false));

		grip41 = new ModelRenderer(this);
		grip41.setRotationPoint(1.5F, -34.2917F, 11.1931F);
		gun2.addChild(grip41);
		

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(0.0F, 0.2465F, 2.8165F);
		grip41.addChild(grip13_r1);
		setRotationAngle(grip13_r1, -1.2217F, 0.0F, 0.0F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 80, 88, 6.5F, 11.6745F, -0.6745F, 4, 1, 1, 0.0F, false));

		grip42 = new ModelRenderer(this);
		grip42.setRotationPoint(1.5F, -34.2917F, 12.1931F);
		gun2.addChild(grip42);
		

		grip137 = new ModelRenderer(this);
		grip137.setRotationPoint(1.5F, -34.2917F, 12.1931F);
		gun2.addChild(grip137);
		

		grip138 = new ModelRenderer(this);
		grip138.setRotationPoint(1.5F, -34.2917F, 11.1931F);
		gun2.addChild(grip138);
		grip138.cubeList.add(new ModelBox(grip138, 50, 10, 6.5F, 3.8874F, -12.9823F, 4, 1, 4, 0.0F, false));

		grip16_r1 = new ModelRenderer(this);
		grip16_r1.setRotationPoint(0.9994F, 1.6898F, 0.7677F);
		grip138.addChild(grip16_r1);
		setRotationAngle(grip16_r1, 0.0F, 0.0F, -1.309F);
		grip16_r1.cubeList.add(new ModelBox(grip16_r1, 70, 6, -0.6637F, 8.7456F, -14.5F, 1, 1, 5, 0.0F, false));

		grip15_r1 = new ModelRenderer(this);
		grip15_r1.setRotationPoint(-0.9994F, 1.6898F, 0.7677F);
		grip138.addChild(grip15_r1);
		setRotationAngle(grip15_r1, 0.0F, 0.0F, 1.309F);
		grip15_r1.cubeList.add(new ModelBox(grip15_r1, 70, 12, 4.0637F, -7.6751F, -14.5F, 1, 1, 5, 0.0F, false));

		grip139 = new ModelRenderer(this);
		grip139.setRotationPoint(1.5F, -29.9044F, 10.7108F);
		gun2.addChild(grip139);
		setRotationAngle(grip139, -0.5236F, 0.0F, 0.0F);
		grip139.cubeList.add(new ModelBox(grip139, 37, 47, 9.25F, 8.6226F, -8.8008F, 1, 1, 1, 0.0F, false));
		grip139.cubeList.add(new ModelBox(grip139, 24, 47, 6.75F, 8.6226F, -8.8008F, 1, 1, 1, 0.0F, false));

		grip140 = new ModelRenderer(this);
		grip140.setRotationPoint(2.0F, -34.5F, 7.75F);
		gun2.addChild(grip140);
		grip140.cubeList.add(new ModelBox(grip140, 0, 89, 6.0F, 3.8451F, -10.5572F, 4, 1, 1, 0.0F, false));

		grip141 = new ModelRenderer(this);
		grip141.setRotationPoint(1.5F, -34.1549F, 9.1928F);
		gun2.addChild(grip141);
		setRotationAngle(grip141, -0.7418F, 0.0F, 0.0F);
		grip141.cubeList.add(new ModelBox(grip141, 70, 88, 6.5F, 10.012F, -5.7455F, 4, 1, 1, 0.0F, false));

		middle2 = new ModelRenderer(this);
		middle2.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun2.addChild(middle2);
		

		grip142 = new ModelRenderer(this);
		grip142.setRotationPoint(-3.5F, -34.5F, 23.0F);
		middle2.addChild(grip142);
		

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(5.0F, 3.25F, -13.0F);
		grip142.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.3927F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 70, 42, 7.0F, 0.2947F, -15.1553F, 3, 1, 3, 0.0F, false));

		grip143 = new ModelRenderer(this);
		grip143.setRotationPoint(-3.5F, -38.5F, 22.0F);
		middle2.addChild(grip143);
		

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(5.0F, 3.25F, -13.0F);
		grip143.addChild(grip6_r1);
		setRotationAngle(grip6_r1, 0.3927F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 32, 69, 7.0F, 0.2947F, -16.1553F, 3, 4, 3, 0.0F, false));

		grip144 = new ModelRenderer(this);
		grip144.setRotationPoint(1.5F, -33.25F, 6.75F);
		middle2.addChild(grip144);
		setRotationAngle(grip144, 0.5236F, 0.0F, 0.0F);
		

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(0.0F, -1.5F, 2.5F);
		grip144.addChild(grip7_r1);
		setRotationAngle(grip7_r1, 0.3927F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 46, 31, 7.0F, -5.6885F, -12.1742F, 3, 2, 1, 0.0F, false));

		grip145 = new ModelRenderer(this);
		grip145.setRotationPoint(1.5F, -29.75F, 12.0F);
		middle2.addChild(grip145);
		setRotationAngle(grip145, -0.2182F, 0.0F, 0.0F);
		

		grip6_r2 = new ModelRenderer(this);
		grip6_r2.setRotationPoint(0.0F, -0.4096F, 0.2437F);
		grip145.addChild(grip6_r2);
		setRotationAngle(grip6_r2, 0.3491F, 0.0F, 0.0F);
		grip6_r2.cubeList.add(new ModelBox(grip6_r2, 38, 9, 7.0F, -0.9179F, -14.9478F, 3, 4, 6, 0.0F, false));

		grip146 = new ModelRenderer(this);
		grip146.setRotationPoint(1.5F, -31.75F, 11.75F);
		middle2.addChild(grip146);
		setRotationAngle(grip146, -0.4363F, 0.0F, 0.0F);
		

		grip147 = new ModelRenderer(this);
		grip147.setRotationPoint(1.5F, -33.0F, 12.0F);
		middle2.addChild(grip147);
		setRotationAngle(grip147, -0.6109F, 0.0F, 0.0F);
		

		grip148 = new ModelRenderer(this);
		grip148.setRotationPoint(1.5F, -33.0F, 12.0F);
		middle2.addChild(grip148);
		setRotationAngle(grip148, -0.7854F, 0.0F, 0.0F);
		grip148.cubeList.add(new ModelBox(grip148, 20, 27, 7.0F, 8.1233F, -4.7396F, 3, 1, 2, 0.0F, false));

		grip149 = new ModelRenderer(this);
		grip149.setRotationPoint(1.5F, -33.0F, 12.0F);
		middle2.addChild(grip149);
		

		grip10_r3 = new ModelRenderer(this);
		grip10_r3.setRotationPoint(0.0F, -0.8369F, 3.0637F);
		grip149.addChild(grip10_r3);
		setRotationAngle(grip10_r3, -0.0873F, 0.0F, 0.0F);
		grip10_r3.cubeList.add(new ModelBox(grip10_r3, 70, 38, 7.0F, 4.4871F, -11.6076F, 3, 1, 3, 0.0F, false));

		grip150 = new ModelRenderer(this);
		grip150.setRotationPoint(-3.5F, -33.5F, 23.0F);
		middle2.addChild(grip150);
		

		grip6_r3 = new ModelRenderer(this);
		grip6_r3.setRotationPoint(5.0F, 3.25F, -15.0F);
		grip150.addChild(grip6_r3);
		setRotationAngle(grip6_r3, 0.7418F, 0.0F, 0.0F);
		grip6_r3.cubeList.add(new ModelBox(grip6_r3, 70, 18, 7.0F, -4.8202F, -13.1811F, 3, 2, 3, 0.0F, false));

		trigger2 = new ModelRenderer(this);
		trigger2.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun2.addChild(trigger2);
		

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(1.5F, -27.5F, 8.0F);
		trigger2.addChild(bone47);
		bone47.cubeList.add(new ModelBox(bone47, 82, 90, 7.5F, 3.0F, -11.5F, 2, 1, 1, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(1.5F, -27.5F, 8.0F);
		trigger2.addChild(bone48);
		setRotationAngle(bone48, -0.2618F, 0.0F, 0.0F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone48.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.2182F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 76, 90, 7.5F, 7.6929F, -8.2389F, 2, 1, 1, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(1.5F, -28.25F, 8.5F);
		trigger2.addChild(bone49);
		setRotationAngle(bone49, -0.2618F, 0.0F, 0.0F);
		

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone49.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.2182F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 89, 7.5F, 6.6929F, -8.2389F, 2, 2, 1, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(1.5F, -28.25F, 8.5F);
		trigger2.addChild(bone50);
		setRotationAngle(bone50, -0.48F, 0.0F, 0.0F);
		

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.8396F, 0.9021F);
		bone50.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.8727F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 9, 7.5F, 9.5932F, 0.9161F, 2, 3, 1, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(1.5F, -27.6653F, 9.6148F);
		trigger2.addChild(bone51);
		setRotationAngle(bone51, -0.5236F, 0.0F, 0.0F);
		

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.3501F, 0.1006F);
		bone51.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.2618F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 16, 7.5F, 10.4602F, -5.8033F, 2, 1, 2, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(1.5F, -27.6653F, 9.6148F);
		trigger2.addChild(bone52);
		setRotationAngle(bone52, -0.6981F, 0.0F, 0.0F);
		

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.6244F, 1.9396F);
		bone52.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.4363F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 72, 7.5F, 11.613F, -1.7349F, 2, 1, 1, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(1.5F, -27.1653F, 11.6148F);
		trigger2.addChild(bone53);
		setRotationAngle(bone53, -1.5708F, 0.0F, 0.0F);
		

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.6244F, 1.9396F);
		bone53.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 6, 7.5F, 9.2649F, 6.773F, 2, 1, 2, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(1.5F, -26.1653F, 11.6148F);
		trigger2.addChild(bone54);
		setRotationAngle(bone54, -1.5708F, 0.0F, 0.0F);
		

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.8112F, 1.8462F);
		bone54.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.48F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 4, 7.5F, 7.8536F, 9.3582F, 2, 1, 1, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(1.5F, -26.2909F, 11.5544F);
		trigger2.addChild(bone55);
		setRotationAngle(bone55, -0.6981F, 0.0F, 0.0F);
		

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.0F, 0.0F);
		bone55.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.4363F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 52, 40, 7.5F, 9.613F, -1.7349F, 2, 3, 1, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(1.5F, -26.2909F, 11.5544F);
		trigger2.addChild(bone56);
		setRotationAngle(bone56, -0.6981F, 0.0F, 0.0F);
		

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -1.6337F, 1.1041F);
		bone56.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.1745F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 62, 0, 7.5F, 10.8807F, -4.8279F, 2, 1, 1, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(1.5F, -27.9245F, 12.6585F);
		trigger2.addChild(bone57);
		setRotationAngle(bone57, -0.3054F, 0.0F, 0.0F);
		

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.071F, 1.3683F);
		bone57.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 61, 57, 7.5F, 8.3582F, -8.8536F, 2, 1, 1, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(1.5F, -28.9245F, 12.6585F);
		trigger2.addChild(bone58);
		setRotationAngle(bone58, 0.1745F, 0.0F, 0.0F);
		

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 1.0081F, 1.3027F);
		bone58.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.1745F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 23, 56, 7.5F, 3.5F, -12.0F, 2, 1, 1, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(1.5F, -28.9245F, 12.6585F);
		trigger2.addChild(bone59);
		setRotationAngle(bone59, 0.6109F, 0.0F, 0.0F);
		

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.0F, 0.7622F, 1.0454F);
		bone59.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.1745F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 70, 90, 7.5F, -2.7349F, -12.613F, 2, 2, 1, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(1.5F, -28.9245F, 12.6585F);
		trigger2.addChild(bone60);
		setRotationAngle(bone60, 1.2217F, 0.0F, 0.0F);
		

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, 0.1113F, 0.9984F);
		bone60.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.1745F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 46, 34, 7.5F, -8.4593F, -9.7141F, 2, 1, 1, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(1.5F, -28.9245F, 13.4085F);
		trigger2.addChild(bone61);
		setRotationAngle(bone61, 1.2217F, 0.0F, 0.0F);
		

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 0.1113F, 0.9984F);
		bone61.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.1745F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 38, 13, 7.5F, -8.4593F, -9.7141F, 2, 1, 1, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger2.addChild(bone62);
		

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(2.0F, -28.25F, 10.25F);
		bone62.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3927F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 25, 0, 7.5F, -1.7053F, -12.1553F, 1, 2, 1, 0.0F, false));

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(1.5F, -27.75F, 10.75F);
		trigger2.addChild(bone63);
		setRotationAngle(bone63, 0.6545F, 0.0F, 0.0F);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.5F, 1.0345F, -0.4728F);
		bone63.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0436F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 37, 45, 7.5F, -5.0915F, -11.2255F, 1, 1, 1, 0.0F, false));

		hammer2 = new ModelRenderer(this);
		hammer2.setRotationPoint(1.5F, -33.25F, 7.25F);
		gun2.addChild(hammer2);
		

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(0.0F, -0.25F, -0.25F);
		hammer2.addChild(bone64);
		

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone64.addChild(bone65);
		

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone65.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.3927F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 13, 10, 8.0F, -2.2053F, -12.6553F, 1, 2, 1, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(0.0F, -1.0F, -0.25F);
		bone64.addChild(bone66);
		setRotationAngle(bone66, -0.9599F, 0.0F, 0.0F);
		

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 1.0F, 1.0F);
		bone66.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.3927F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 19, 8.0F, 8.0525F, -9.0498F, 1, 1, 1, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(0.0F, -2.0F, -1.25F);
		bone64.addChild(bone67);
		setRotationAngle(bone67, -0.48F, 0.0F, 0.0F);
		

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.9608F, 2.3703F);
		bone67.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.3927F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 24, 38, 8.0F, 3.4871F, -13.6076F, 1, 1, 1, 0.0F, false));

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(0.0F, -2.0392F, -1.8797F);
		bone64.addChild(bone68);
		setRotationAngle(bone68, -0.3927F, 0.0F, 0.0F);
		

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, 1.4483F, -0.8789F);
		bone68.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.7418F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 33, 8.0F, -0.6745F, -12.6745F, 1, 1, 1, 0.0F, false));

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(0.0F, -2.0392F, -1.8797F);
		bone64.addChild(bone69);
		setRotationAngle(bone69, 0.1745F, 0.0F, 0.0F);
		

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(0.0F, 0.7117F, -0.6593F);
		bone69.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.0873F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 37, 31, 8.0F, 2.4825F, -12.3049F, 1, 1, 1, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(0.0F, -0.5F, 0.25F);
		bone64.addChild(bone70);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, -0.25F, 0.0F);
		bone70.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.3927F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 13, 0, 8.0F, -2.2053F, -12.6553F, 1, 3, 1, 0.0F, false));

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(0.0F, -0.5F, 0.5F);
		bone64.addChild(bone71);
		

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, -0.25F, -0.5F);
		bone71.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.3927F, 0.0F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 25, 25, 8.0F, -2.2053F, -12.6553F, 1, 1, 1, 0.0F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(0.0F, -0.25F, -0.75F);
		bone71.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.3927F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 25, 9, 8.0F, -2.2053F, -12.6553F, 1, 1, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -0.25F, 0.0F);
		bone71.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.3927F, 0.0F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 25, 11, 8.0F, -2.2053F, -12.6553F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GUN.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}