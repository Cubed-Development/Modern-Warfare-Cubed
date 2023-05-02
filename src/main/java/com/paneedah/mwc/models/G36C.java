package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36C extends ModelWithAttachments {
	private final QRenderer body;
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
	private final QRenderer grip;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer bone;
	private final ModelRenderer gun240_r2;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun240_r3;
	private final ModelRenderer gun241_r2;
	private final ModelRenderer bone6;
	private final ModelRenderer gun241_r3;
	private final ModelRenderer gun242_r2;
	private final QRenderer stock;
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
	private final QRenderer mag;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;
	private final ModelRenderer mag2;
	private final ModelRenderer cube_r49;
	private final ModelRenderer cube_r50;
	private final ModelRenderer cube_r51;
	private final ModelRenderer cube_r52;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer mag3;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer mag4;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final QRenderer handguard;
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
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer DustCover7_r1;
	private final ModelRenderer DustCover8_r1;
	private final ModelRenderer DustCover5_r1;
	private final ModelRenderer DustCover4_r1;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
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
	private final ModelRenderer rail2;
	private final ModelRenderer DustCover6_r1;
	private final ModelRenderer DustCover5_r2;
	private final ModelRenderer teeth3;
	private final ModelRenderer DustCover8_r2;
	private final ModelRenderer DustCover9_r1;
	private final QRenderer carryhandle;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer rail;
	private final ModelRenderer DustCover4_r2;
	private final ModelRenderer DustCover3_r1;
	private final ModelRenderer teeth;
	private final ModelRenderer DustCover9_r2;
	private final ModelRenderer DustCover8_r3;
	private final QRenderer action;

	public G36C() {
		textureWidth = 220;
		textureHeight = 220;

		body = new QRenderer(this);
		body.setRotationPoint(0.8457F, -11.0F, -22.7706F);
		body.cubeList.add(new ModelBox(body, 130, 0, -1.1705F, 3.0F, -1.7294F, 1, 4, 11, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 69, 129, -1.4707F, -6.0F, 10.2706F, 1, 1, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 116, 110, -1.1707F, 2.45F, -3.7294F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 70, 92, -0.9207F, 1.9F, 9.5206F, 1, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 27, 100, -0.9206F, 1.9F, 10.4206F, 1, 3, 4, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 130, -0.9221F, -1.7652F, -4.7294F, 1, 4, 32, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 23, 65, -0.6721F, -2.7652F, 27.2706F, 1, 7, 2, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 65, 117, -0.4221F, -2.7652F, 26.2706F, 1, 1, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 64, 30, -0.6721F, 2.2348F, 29.2706F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 60, 100, -2.9222F, 2.2348F, 24.2706F, 3, 2, 3, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 110, 85, -2.9221F, 2.2348F, 23.5706F, 3, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 38, 47, -0.9221F, 2.2348F, 14.2206F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 2, 74, -0.9206F, 2.4098F, 15.4706F, 1, 2, 6, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 84, 61, -0.7137F, 2.3098F, 17.0706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 58, 47, -0.7137F, 3.4098F, 18.5706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 100, 50, -0.7137F, 4.2098F, 16.5706F, 1, 1, 4, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 80, 31, -4.9777F, 4.2098F, 16.5706F, 1, 1, 4, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 28, 39, -4.9777F, 3.4098F, 18.5706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 11, 47, -4.9777F, 2.3098F, 17.0706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 100, 39, -0.9221F, -1.7652F, -8.7294F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 151, 110, -2.2957F, 1.1F, -2.7294F, 2, 4, 24, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 94, 66, -4.1957F, 2.0F, -5.4794F, 4, 2, 1, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -4.3457F, -4.0F, -17.7294F, 4, 2, 45, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 47, 47, -4.3457F, -5.0F, 10.2706F, 4, 1, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 130, -4.5209F, 3.0F, -1.7294F, 1, 4, 11, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 116, 92, -4.5207F, 2.45F, -3.7294F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 22, 30, -4.7707F, 0.9F, 9.5206F, 1, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 96, 92, -4.7708F, 1.9F, 10.4206F, 1, 3, 4, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 53, 0, -4.7694F, -1.7652F, 10.2706F, 1, 4, 17, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 11, 0, -5.5194F, -1.7652F, 10.2706F, 1, 2, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 17, -4.7694F, -1.7652F, -4.7294F, 1, 4, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 88, 129, -4.7694F, 0.2348F, -1.7294F, 1, 2, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 95, 22, -4.7692F, 2.2348F, 24.2706F, 3, 2, 3, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 112, 29, -4.7694F, 2.2348F, 23.5706F, 2, 2, 1, 0.003F, false));
		body.cubeList.add(new ModelBox(body, 25, 47, -4.7694F, 2.2348F, 14.2206F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 72, 55, -4.7708F, 2.4098F, 15.4706F, 1, 2, 6, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 95, 15, -4.7694F, -1.7652F, -8.7294F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 151, 63, -4.3957F, 1.1F, -2.7294F, 2, 4, 24, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 59, -4.4957F, 2.0F, -5.4794F, 1, 2, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 65, -4.2207F, -6.0F, 10.2706F, 3, 1, 17, 0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.6386F, -5.0F, 18.7706F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 91, -0.5F, -0.5F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6957F, 2.4135F, 23.295F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 87, -2.175F, 1.0F, -2.0F, 4, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 34, -1.125F, 1.0F, -2.0F, 4, 1, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5957F, 3.3762F, 19.8813F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 53, 39, -2.175F, 0.0F, -2.0F, 3, 2, 4, -0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 39, -0.325F, 0.0F, -2.0F, 3, 2, 4, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5957F, 4.2114F, 14.9838F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 32, 39, -2.175F, -1.75F, 0.5F, 3, 3, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 83, -0.325F, -1.75F, 0.5F, 3, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5957F, 4.9368F, 14.6694F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -2.1752F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 24, -0.3248F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5957F, 4.7842F, 12.9261F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 59, -2.175F, -0.5F, -2.5F, 3, 1, 4, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 71, 75, -0.325F, -0.5F, -2.5F, 3, 1, 4, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.9957F, 2.6512F, -5.9047F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.48F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 98, 84, -0.4999F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 39, -0.2001F, -1.0F, -3.0F, 4, 2, 4, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.8956F, 2.6F, 22.2706F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.48F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 17, -0.5F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 65, 2.5998F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.8956F, 3.4691F, 15.7141F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 8, 65, -0.5F, -2.0F, -1.5F, 1, 4, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 71, 21, 2.5998F, -2.0F, -1.5F, 1, 4, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6457F, 2.6F, -2.9794F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 95, 0, -0.7499F, -2.0F, -2.0F, 1, 4, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 53, 8, -0.6501F, -2.0F, -2.0F, 4, 4, 4, 0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.5694F, 3.9301F, 22.708F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 33, 79, -0.5F, -0.5F, -1.0F, 2, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 111, 0, 2.9473F, -0.5F, -1.0F, 2, 1, 2, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.2694F, 3.4705F, 21.8242F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 9, 101, -0.4998F, -2.7F, -1.225F, 1, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 111, 9, -0.5001F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 69, 102, 3.347F, -2.7F, -1.225F, 1, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 114, 3.3473F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.8123F, -0.7652F, 11.2706F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 13, 31, -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.0207F, 5.4403F, -1.4147F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.0908F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 99, -0.5F, -1.0F, -1.5F, 3, 2, 3, -0.002F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 42, 102, 0.85F, -1.0F, -1.5F, 3, 2, 3, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.0207F, 4.7261F, -1.9479F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 99, -0.5F, -1.0F, -1.5F, 3, 2, 3, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 79, 108, 0.85F, -1.0F, -1.5F, 3, 2, 3, -0.002F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0208F, 7.782F, 4.3866F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 42, 109, -1.5F, -0.5F, -6.0F, 3, 1, 12, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 110, 76, -0.1498F, -0.5F, -6.0F, 3, 1, 12, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0528F, -5.0F, 18.7706F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 109, -0.5F, -0.5F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.8694F, 4.5098F, 17.1706F);
		body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1063F, -0.1736F, -0.0184F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 36, 87, -0.5015F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.7694F, 5.0098F, 16.5706F);
		body.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.4189F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 30, 11, -0.5015F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 31, 0, 4.3487F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.1779F, 4.5098F, 17.1706F);
		body.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1063F, 0.1736F, 0.0184F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 11, 91, -0.4985F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.3684F, 0.7348F, 27.1478F);
		body.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.6109F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 92, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.1721F, -0.0977F, 29.2414F);
		body.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 9, 113, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.1292F, -2.2652F, 27.2706F);
		body.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.7854F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 117, 53, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.1292F, -2.2652F, 26.2706F);
		body.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.7854F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 117, 65, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.5471F, -2.2652F, 25.2706F);
		body.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.1309F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 117, 84, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-4.7693F, -1.7652F, -7.7294F);
		body.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.2269F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 42, 92, 0.0F, -2.0F, 0.0F, 1, 2, 35, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0779F, -1.7652F, -7.7294F);
		body.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.2269F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 94, 39, -1.0F, -2.0F, 0.0F, 1, 2, 35, 0.0F, false));

		grip = new QRenderer(this);
		grip.setRotationPoint(-0.3915F, 0.9283F, -0.4854F);
		grip.cubeList.add(new ModelBox(grip, 47, 65, -1.6075F, -6.8532F, -7.9352F, 1, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 60, 92, -1.9335F, -7.3283F, -16.0146F, 3, 4, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 47, 65, -3.2835F, -7.3283F, -16.0146F, 3, 4, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 85, 0, -2.1835F, -3.3283F, -13.2646F, 2, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 102, 109, 0.0665F, -5.3283F, -20.0146F, 1, 1, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 102, 102, -3.2835F, -5.3283F, -20.0146F, 1, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 6, 109, 0.3165F, -7.8283F, -15.0146F, 1, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 107, 29, 0.3165F, -7.3783F, -15.0136F, 1, 1, 3, 0.002F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.4719F, -6.3783F, -15.7471F);
		grip.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3927F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 19, 114, -0.5001F, -1.0F, -1.0F, 1, 1, 2, 0.001F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 25, 114, -0.5F, -1.45F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.0665F, -7.0783F, -12.7646F);
		grip.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.3927F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 86, 117, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.1835F, -0.951F, -12.6128F);
		grip.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 84, 65, -0.999F, -2.5F, -0.75F, 2, 3, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-1.1075F, -3.9851F, -7.6398F);
		grip.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.2182F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 39, 65, -0.499F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-1.1075F, -2.7094F, -4.7174F);
		grip.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.5236F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 47, 59, -1.501F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-1.1075F, -2.0359F, -9.1445F);
		grip.addChild(gun238_r1);
		setRotationAngle(gun238_r1, -0.0873F, 0.0F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 72, 10, -1.5F, -0.5F, -3.0F, 3, 1, 6, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.1085F, -0.8025F, -2.6389F);
		grip.addChild(bone);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);
		

		gun240_r2 = new ModelRenderer(this);
		gun240_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun240_r2);
		setRotationAngle(gun240_r2, 0.3054F, 0.0F, 0.0F);
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 0, 0, -2.002F, -6.5F, 0.175F, 4, 13, 3, 0.001F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 0, 65, -1.0F, -6.5F, -0.5F, 2, 13, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-1.0F, -0.0623F, 0.1975F);
		bone.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.4194F, -0.7401F, -0.2921F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 41, 0, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(-1.3876F, -0.247F, 0.7834F);
		bone.addChild(gun242_r1);
		setRotationAngle(gun242_r1, 2.2581F, -1.1712F, -2.2987F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 41, 14, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun240_r3 = new ModelRenderer(this);
		gun240_r3.setRotationPoint(0.0F, 0.4256F, 5.8394F);
		bone.addChild(gun240_r3);
		setRotationAngle(gun240_r3, 0.4363F, 0.0F, 0.0F);
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 94, 76, -1.0F, -6.0F, -1.5F, 2, 10, 2, 0.0F, false));

		gun241_r2 = new ModelRenderer(this);
		gun241_r2.setRotationPoint(0.0F, 1.2708F, 4.0268F);
		bone.addChild(gun241_r2);
		setRotationAngle(gun241_r2, 0.4363F, 0.0F, 0.0F);
		gun241_r2.cubeList.add(new ModelBox(gun241_r2, 22, 17, -2.003F, -6.0F, -1.175F, 4, 10, 3, -0.001F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.3374F, 2.6001F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -0.6545F, 0.0F, 0.0F);
		

		gun241_r3 = new ModelRenderer(this);
		gun241_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(gun241_r3);
		setRotationAngle(gun241_r3, 0.4363F, 0.0F, 0.0F);
		gun241_r3.cubeList.add(new ModelBox(gun241_r3, 30, 30, -1.0F, -8.0F, -0.5F, 2, 4, 1, 0.0F, false));

		gun242_r2 = new ModelRenderer(this);
		gun242_r2.setRotationPoint(0.0F, 0.8452F, -1.8126F);
		bone6.addChild(gun242_r2);
		setRotationAngle(gun242_r2, 0.4363F, 0.0F, 0.0F);
		gun242_r2.cubeList.add(new ModelBox(gun242_r2, 53, 30, -2.004F, -8.0F, -1.175F, 4, 4, 3, -0.003F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 17.05F);
		stock.cubeList.add(new ModelBox(stock, 110, 79, -1.625F, -41.0F, -12.5F, 2, 1, 2, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 82, 27, -3.375F, -40.999F, -12.5F, 2, 1, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 47, -3.5F, -40.0F, -12.5F, 4, 9, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 33, 91, -4.5F, -40.0F, -12.5F, 1, 9, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 94, 72, -3.5F, -40.0F, -10.075F, 4, 1, 1, -0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 42, 92, -3.5F, -39.0F, -9.5F, 4, 8, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 96, 99, -3.5F, -37.0F, -0.5F, 4, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 151, 110, -3.5F, -38.0F, 15.5F, 4, 18, 3, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 10, 72, -2.5F, -33.0F, 14.5F, 2, 6, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 65, -3.5F, -38.0F, -0.5F, 4, 1, 16, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 47, 82, -3.5F, -32.0F, -7.5F, 4, 1, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 131, 63, -3.5F, -38.0F, -7.5F, 4, 2, 7, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(-1.5F, -27.7705F, 12.0186F);
		stock.addChild(cube_r31);
		setRotationAngle(cube_r31, -1.0908F, 0.0F, 0.0F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 25, 57, -1.999F, -1.5F, 3.5F, 4, 2, 5, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		stock.addChild(cube_r32);
		setRotationAngle(cube_r32, -0.6981F, 0.0F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 131, 49, -1.998F, -0.5F, 0.0F, 4, 1, 9, -0.003F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-1.5F, -29.1864F, 8.1633F);
		stock.addChild(cube_r33);
		setRotationAngle(cube_r33, -0.3054F, 0.0F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 18, 11, -2.0F, 1.5F, 4.75F, 4, 1, 4, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 83, -1.999F, 0.5F, 2.5F, 4, 1, 6, 0.0F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 0, 47, -1.999F, -0.5F, -8.5F, 4, 1, 17, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.5F, -39.7301F, -9.5581F);
		stock.addChild(cube_r34);
		setRotationAngle(cube_r34, -0.5585F, 0.0F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 28, 83, -3.001F, -0.5F, 0.275F, 4, 1, 3, -0.002F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(0.625F, -39.7301F, -9.5581F);
		stock.addChild(cube_r35);
		setRotationAngle(cube_r35, -0.6109F, 0.0F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 60, 105, -4.0F, -0.4989F, -1.5F, 2, 1, 2, 0.0F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 110, 76, -2.25F, -0.4999F, -1.5F, 2, 1, 2, 0.0F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(-1.5F, -37.5F, -2.5F);
		stock.addChild(cube_r36);
		setRotationAngle(cube_r36, -0.1745F, 0.0F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 0, 31, -2.001F, -0.5F, -5.0F, 4, 1, 5, 0.0F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.501F, -27.8224F, 13.5659F);
		stock.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.2618F, 0.0F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 112, 51, -1.0F, -1.5F, -0.5F, 2, 2, 1, 0.001F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(-1.501F, -29.0482F, 14.1175F);
		stock.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.2182F, 0.0F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 115, 5, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.5F, -33.5747F, 15.459F);
		stock.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.5672F, 0.0F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 113, 35, -1.001F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(-1.5F, -29.0F, 17.0F);
		stock.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.1309F, 0.0F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 47, -2.001F, 0.0F, -1.5F, 4, 9, 3, 0.0F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-1.5F, -29.0F, 17.0F);
		stock.addChild(cube_r41);
		setRotationAngle(cube_r41, -0.0873F, 0.0F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 94, 56, -2.001F, -9.125F, 0.5F, 4, 9, 1, 0.0F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(-0.2071F, -40.0F, -4.0F);
		stock.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.0F, 0.7854F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 113, 66, -0.5F, -0.5F, -8.5F, 1, 1, 2, 0.0F, false));

		mag = new QRenderer(this);
		mag.setRotationPoint(-0.8249F, -3.218F, -17.884F);
		

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(-0.75F, 3.0687F, -1.3137F);
		mag.addChild(cube_r43);
		setRotationAngle(cube_r43, -0.1309F, 0.0F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 77, 39, -2.5F, -2.0F, -0.5F, 5, 2, 2, 0.0F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 72, 0, -2.0F, -3.0F, -1.0F, 4, 5, 5, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(-3.8107F, 2.9844F, -1.9547F);
		mag.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.1841F, 0.7769F, -0.1298F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 112, 21, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-3.8107F, 2.8538F, -2.9461F);
		mag.addChild(cube_r45);
		setRotationAngle(cube_r45, -0.1841F, 0.7769F, -0.1298F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 112, 15, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(-1.2249F, 2.9844F, -1.9547F);
		mag.addChild(cube_r46);
		setRotationAngle(cube_r46, -0.1841F, 0.7769F, -0.1298F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 112, 39, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-1.2249F, 2.8538F, -2.9461F);
		mag.addChild(cube_r47);
		setRotationAngle(cube_r47, -0.1841F, 0.7769F, -0.1298F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 112, 45, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-0.75F, 2.6119F, -4.7838F);
		mag.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.1309F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 19, 91, -2.0F, -3.0F, -1.5F, 4, 5, 3, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag2);
		setRotationAngle(mag2, 0.0436F, 0.0F, 0.0F);
		

		cube_r49 = new ModelRenderer(this);
		cube_r49.setRotationPoint(-0.75F, -2.7046F, -0.567F);
		mag2.addChild(cube_r49);
		setRotationAngle(cube_r49, -0.1309F, 0.0F, 0.0F);
		cube_r49.cubeList.add(new ModelBox(cube_r49, 18, 0, -2.0F, -3.0F, -1.0F, 4, 6, 5, 0.001F, false));

		cube_r50 = new ModelRenderer(this);
		cube_r50.setRotationPoint(-3.8107F, -2.789F, -1.2079F);
		mag2.addChild(cube_r50);
		setRotationAngle(cube_r50, -0.1841F, 0.7769F, -0.1298F);
		cube_r50.cubeList.add(new ModelBox(cube_r50, 47, 82, 1.0F, -3.0F, 0.5F, 1, 6, 1, 0.0F, false));

		cube_r51 = new ModelRenderer(this);
		cube_r51.setRotationPoint(-3.8107F, -2.9195F, -2.1994F);
		mag2.addChild(cube_r51);
		setRotationAngle(cube_r51, -0.1841F, 0.7769F, -0.1298F);
		cube_r51.cubeList.add(new ModelBox(cube_r51, 102, 76, 1.0F, -3.0F, 0.5F, 1, 6, 1, 0.0F, false));

		cube_r52 = new ModelRenderer(this);
		cube_r52.setRotationPoint(-1.2249F, -2.789F, -1.2079F);
		mag2.addChild(cube_r52);
		setRotationAngle(cube_r52, -0.1841F, 0.7769F, -0.1298F);
		cube_r52.cubeList.add(new ModelBox(cube_r52, 105, 4, 1.0F, -3.0F, 0.5F, 1, 6, 1, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(-1.2249F, -2.9195F, -2.1994F);
		mag2.addChild(cube_r53);
		setRotationAngle(cube_r53, -0.1841F, 0.7769F, -0.1298F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 106, 46, 1.0F, -3.0F, 0.5F, 1, 6, 1, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(-0.75F, -3.1615F, -4.0371F);
		mag2.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.1309F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 53, 21, -2.0F, -3.0F, -1.5F, 4, 6, 3, 0.001F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag3);
		setRotationAngle(mag3, -0.0873F, 0.0F, 0.0F);
		

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(-0.75F, 7.7094F, -1.4821F);
		mag3.addChild(cube_r55);
		setRotationAngle(cube_r55, -0.1309F, 0.0F, 0.0F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 71, 65, -2.0F, -3.0F, -1.0F, 4, 5, 5, -0.001F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-3.8107F, 7.6251F, -2.123F);
		mag3.addChild(cube_r56);
		setRotationAngle(cube_r56, -0.1841F, 0.7769F, -0.1298F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 111, 3, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-3.8107F, 7.4945F, -3.1144F);
		mag3.addChild(cube_r57);
		setRotationAngle(cube_r57, -0.1841F, 0.7769F, -0.1298F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 111, 56, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(-1.2249F, 7.6251F, -2.123F);
		mag3.addChild(cube_r58);
		setRotationAngle(cube_r58, -0.1841F, 0.7769F, -0.1298F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 111, 62, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(-1.2249F, 7.4945F, -3.1144F);
		mag3.addChild(cube_r59);
		setRotationAngle(cube_r59, -0.1841F, 0.7769F, -0.1298F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 13, 112, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(-0.75F, 7.2526F, -4.9521F);
		mag3.addChild(cube_r60);
		setRotationAngle(cube_r60, -0.1309F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 0, 91, -2.0F, -3.0F, -1.5F, 4, 5, 3, -0.001F, false));

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-0.75F, 6.7922F, -3.2605F);
		mag.addChild(mag4);
		setRotationAngle(mag4, -0.1745F, 0.0F, 0.0F);
		

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.0F, 8.2232F, 5.4171F);
		mag4.addChild(cube_r61);
		setRotationAngle(cube_r61, -0.1309F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 23, 79, -2.5001F, -0.4999F, -1.5F, 5, 1, 1, 0.001F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(0.0F, 7.5706F, 0.4599F);
		mag4.addChild(cube_r62);
		setRotationAngle(cube_r62, -0.1309F, 0.0F, 0.0F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 130, 15, -2.5F, -0.5F, -5.0F, 5, 1, 9, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.0F, 5.0919F, 0.7862F);
		mag4.addChild(cube_r63);
		setRotationAngle(cube_r63, -0.1309F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 76, 82, -2.5F, -2.0F, -0.5F, 5, 2, 2, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 25, 47, -2.0F, -3.0F, -1.0F, 4, 5, 5, 0.001F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(-3.0607F, 5.0076F, 0.1453F);
		mag4.addChild(cube_r64);
		setRotationAngle(cube_r64, -0.1841F, 0.7769F, -0.1298F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 0, 83, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(-3.0607F, 4.877F, -0.8462F);
		mag4.addChild(cube_r65);
		setRotationAngle(cube_r65, -0.1841F, 0.7769F, -0.1298F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 84, 10, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(-0.4749F, 5.0076F, 0.1453F);
		mag4.addChild(cube_r66);
		setRotationAngle(cube_r66, -0.1841F, 0.7769F, -0.1298F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 84, 47, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(-0.4749F, 4.877F, -0.8462F);
		mag4.addChild(cube_r67);
		setRotationAngle(cube_r67, -0.1841F, 0.7769F, -0.1298F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 106, 96, 1.0F, -3.0F, 0.5F, 1, 5, 1, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.0F, 4.6351F, -2.6839F);
		mag4.addChild(cube_r68);
		setRotationAngle(cube_r68, -0.1309F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 47, 73, -2.0F, -3.0F, -1.5F, 4, 5, 3, 0.001F, false));

		handguard = new QRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 64, 21, 0.25F, -40.999F, -41.751F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 19, 109, -3.5F, -41.0F, -41.5F, 4, 4, 1, 0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 93, 39, -1.7071F, -41.0F, -44.4571F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 81, 127, -2.0F, -37.25F, -59.7F, 1, 1, 33, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 110, -1.2929F, -36.5429F, -59.7F, 1, 1, 33, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 76, -2.7071F, -36.5429F, -59.7F, 1, 1, 33, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 95, 0, -2.0F, -35.8358F, -59.7F, 1, 1, 33, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 95, 0, -2.0F, -39.25F, -54.95F, 1, 1, 14, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 62, 82, 0.75F, -36.5F, -42.75F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 57, 65, 0.75F, -36.5F, -54.75F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 92, -2.0F, -32.45F, -55.452F, 1, 1, 15, 0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 115, 3, -2.5F, -31.5398F, -41.05F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 102, 114, -2.5F, -31.5398F, -42.675F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 114, 61, -2.5F, -31.5398F, -44.3F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 60, 114, -2.5F, -31.5398F, -45.925F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 48, 114, -2.5F, -31.5398F, -49.175F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 42, 114, -2.5F, -31.5398F, -47.55F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 29, 114, -2.5F, -31.5398F, -52.425F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 111, 12, -2.5F, -31.5398F, -50.8F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 110, 72, -2.5F, -31.5398F, -54.05F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 107, 36, -2.5F, -31.5398F, -55.675F, 2, 1, 1, -0.1F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 0, -4.0F, -41.0F, -43.75F, 5, 5, 3, 0.002F, false));
		handguard.cubeList.add(new ModelBox(handguard, 57, 59, -4.75F, -36.5F, -42.75F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 10, 59, -4.75F, -36.5F, -54.75F, 1, 2, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 86, -3.2929F, -41.0F, -44.4571F, 2, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 57, -4.25F, -40.999F, -41.751F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 79, 92, -2.5F, -37.0F, -59.7F, 2, 2, 33, 0.01F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(-2.2642F, -40.28F, -47.25F);
		handguard.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.0F, 0.0F, -0.2182F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 95, 15, -1.0F, -0.5F, -6.5F, 2, 1, 13, -0.001F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(-2.4079F, -37.8251F, -30.4401F);
		handguard.addChild(cube_r70);
		setRotationAngle(cube_r70, 1.1345F, 0.0F, 0.1745F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 71, 31, -1.3999F, -0.5F, -0.6F, 1, 1, 1, -0.001F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(-3.7393F, -35.4572F, -29.183F);
		handguard.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.5236F, 0.0F, 0.1745F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 72, 10, -0.5001F, -2.75F, -0.25F, 1, 5, 1, 0.001F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(-3.7245F, -35.5409F, -30.0F);
		handguard.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, 0.1745F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 5, 17, -0.5F, 0.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 31, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(-3.6377F, -36.0333F, -35.5F);
		handguard.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.0F, 0.1745F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 34, 130, -0.5F, -2.5F, -5.0F, 1, 5, 10, 0.0F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(-3.5509F, -36.5257F, -50.0F);
		handguard.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, 0.0F, 0.1745F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 71, 33, -0.5F, -3.0F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 48, 109, -0.5F, -3.0F, 4.0F, 1, 1, 2, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 71, 65, -0.5F, -3.0F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 16, 17, -0.5F, 1.0F, -5.5F, 1, 2, 1, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 72, 47, -0.5F, -2.0F, -4.5F, 1, 5, 1, 0.0F, false));
		cube_r74.cubeList.add(new ModelBox(cube_r74, 0, 17, -0.5F, -2.0F, -3.5F, 1, 5, 9, 0.0F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-2.9697F, -39.8215F, -53.3206F);
		handguard.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.3927F, 0.0F, 0.1745F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 71, 67, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(-2.9431F, -39.9725F, -49.0F);
		handguard.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.0F, 0.0F, 0.1745F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 71, 21, -0.5F, -0.5F, -4.05F, 1, 1, 9, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-3.5235F, -36.6807F, -54.7011F);
		handguard.addChild(cube_r77);
		setRotationAngle(cube_r77, -0.3491F, 0.0F, 0.1745F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 41, 28, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.001F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(-3.3062F, -37.9133F, -41.0303F);
		handguard.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.6545F, 0.0F, 0.1745F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 72, 0, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(-3.464F, -37.0181F, -46.5F);
		handguard.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.0F, 0.0F, 0.1745F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 79, 92, -0.5F, -3.5F, 2.0F, 1, 7, 4, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-2.4135F, -32.7268F, -40.0F);
		handguard.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.0F, 0.0F, 0.3927F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 130, 0, -1.5F, -0.5F, -16.5F, 3, 1, 29, -0.001F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-3.8678F, -33.5353F, -55.875F);
		handguard.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.0F, 0.9599F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 72, 2, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));
		cube_r81.cubeList.add(new ModelBox(cube_r81, 131, 34, -0.5F, -0.5F, 0.375F, 1, 1, 28, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-3.5429F, -39.999F, -41.751F);
		handguard.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, -0.7854F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 16, 39, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.001F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-1.4216F, -37.5848F, -41.251F);
		handguard.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.0F, 0.7854F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 58, 73, -3.0F, 0.0F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(-3.2929F, -38.5F, -43.75F);
		handguard.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, -0.7854F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 72, 55, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		DustCover7_r1 = new ModelRenderer(this);
		DustCover7_r1.setRotationPoint(-0.6F, -31.2054F, -55.173F);
		handguard.addChild(DustCover7_r1);
		setRotationAngle(DustCover7_r1, 0.0F, 0.0F, 0.7854F);
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 90, 92, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 79, 94, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 95, 2, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 95, 10, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 95, 17, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 96, 92, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 96, 94, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 100, 39, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 103, 65, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover7_r1.cubeList.add(new ModelBox(DustCover7_r1, 104, 23, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));

		DustCover8_r1 = new ModelRenderer(this);
		DustCover8_r1.setRotationPoint(-2.4F, -31.2054F, -55.173F);
		handguard.addChild(DustCover8_r1);
		setRotationAngle(DustCover8_r1, 0.0F, 0.0F, -0.7854F);
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 60, 94, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 94, 88, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 95, 0, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 95, 8, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 95, 15, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 89, 96, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 89, 98, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 33, 101, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 104, 21, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r1.cubeList.add(new ModelBox(DustCover8_r1, 104, 83, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));

		DustCover5_r1 = new ModelRenderer(this);
		DustCover5_r1.setRotationPoint(-2.7044F, -31.3137F, -61.35F);
		handguard.addChild(DustCover5_r1);
		setRotationAngle(DustCover5_r1, 0.0F, 0.0F, -1.1781F);
		DustCover5_r1.cubeList.add(new ModelBox(DustCover5_r1, 42, 92, -0.5F, -0.5F, 5.5F, 1, 1, 16, -0.3F, false));

		DustCover4_r1 = new ModelRenderer(this);
		DustCover4_r1.setRotationPoint(-0.2956F, -31.3137F, -61.35F);
		handguard.addChild(DustCover4_r1);
		setRotationAngle(DustCover4_r1, 0.0F, 0.0F, 1.1781F);
		DustCover4_r1.cubeList.add(new ModelBox(DustCover4_r1, 94, 39, -0.5F, -0.5F, 5.5F, 1, 1, 16, -0.3F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.2929F, -38.5F, -43.75F);
		handguard.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.7854F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 73, 112, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.5429F, -39.999F, -41.751F);
		handguard.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.7854F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 47, 59, -0.5F, -1.0F, -0.5F, 1, 2, 1, -0.001F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-1.5784F, -37.5848F, -41.251F);
		handguard.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, -0.7854F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 117, 50, 2.0F, 0.0F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.8678F, -33.5353F, -55.875F);
		handguard.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.9599F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 3, 118, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 121, 144, -0.5F, -0.5F, 0.375F, 1, 1, 28, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-0.0303F, -39.8215F, -53.3206F);
		handguard.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.3927F, 0.0F, -0.1745F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 12, 118, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.5509F, -36.5257F, -48.5F);
		handguard.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -0.1745F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 65, 8, -0.5F, 1.0F, -7.0F, 1, 2, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 69, 113, -0.5F, -2.0F, -6.0F, 1, 5, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 114, 25, -0.5F, -3.0F, 2.5F, 1, 1, 2, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 30, 118, -0.5F, -3.0F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 34, 118, -0.5F, -3.0F, -5.5F, 1, 1, 1, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 23, 65, -0.5F, -2.0F, -5.0F, 1, 5, 9, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.5235F, -36.6807F, -54.7011F);
		handguard.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.3491F, 0.0F, -0.1745F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 54, 100, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.001F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.3062F, -37.9133F, -41.0303F);
		handguard.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.6545F, 0.0F, -0.1745F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 118, 24, -0.5F, -0.5F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(-0.5865F, -32.7268F, -40.0F);
		handguard.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, -0.3927F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 34, 130, -1.5F, -0.5F, -16.5F, 3, 1, 29, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.7245F, -35.5409F, -30.0F);
		handguard.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, -0.1745F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 13, 65, -0.5F, 0.0F, 0.5F, 1, 2, 1, 0.0F, false));
		cube_r94.cubeList.add(new ModelBox(cube_r94, 0, 39, -0.5F, -2.0F, -0.5F, 1, 4, 1, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(-0.5921F, -37.8251F, -30.4401F);
		handguard.addChild(cube_r95);
		setRotationAngle(cube_r95, 1.1345F, 0.0F, -0.1745F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 118, 29, 0.3999F, -0.5F, -0.6F, 1, 1, 1, -0.001F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.7393F, -35.4572F, -29.183F);
		handguard.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.5236F, 0.0F, -0.1745F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 79, 113, -0.4999F, -2.75F, -0.25F, 1, 5, 1, 0.001F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(-0.0569F, -39.9725F, -49.0F);
		handguard.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, -0.1745F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 144, 63, -0.5F, -0.5F, -4.05F, 1, 1, 9, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.6377F, -36.0333F, -35.5F);
		handguard.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.0F, -0.1745F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 131, 34, -0.5F, -2.5F, -5.0F, 1, 5, 10, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(-0.7358F, -40.28F, -47.25F);
		handguard.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.0F, 0.2182F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 79, 108, -1.0F, -0.5F, -6.5F, 2, 1, 13, 0.0F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.464F, -37.0181F, -46.5F);
		handguard.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.0F, -0.1745F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 94, 43, -0.5F, -3.5F, 2.0F, 1, 7, 4, 0.0F, false));

		rail2 = new ModelRenderer(this);
		rail2.setRotationPoint(1.5F, -35.5258F, -47.884F);
		handguard.addChild(rail2);
		setRotationAngle(rail2, 0.0F, 0.0F, -1.5708F);
		rail2.cubeList.add(new ModelBox(rail2, 94, 76, -0.5F, -0.9242F, -6.568F, 1, 1, 14, 0.3F, false));

		DustCover6_r1 = new ModelRenderer(this);
		DustCover6_r1.setRotationPoint(-1.2044F, 0.2121F, -13.466F);
		rail2.addChild(DustCover6_r1);
		setRotationAngle(DustCover6_r1, 0.0F, 0.0F, -1.1781F);
		DustCover6_r1.cubeList.add(new ModelBox(DustCover6_r1, 0, 0, -0.5F, -0.5F, 5.5F, 1, 1, 16, -0.3F, false));

		DustCover5_r2 = new ModelRenderer(this);
		DustCover5_r2.setRotationPoint(1.2044F, 0.2121F, -13.466F);
		rail2.addChild(DustCover5_r2);
		setRotationAngle(DustCover5_r2, 0.0F, 0.0F, 1.1781F);
		DustCover5_r2.cubeList.add(new ModelBox(DustCover5_r2, 53, 21, -0.5F, -0.5F, 5.5F, 1, 1, 16, -0.3F, false));

		teeth3 = new ModelRenderer(this);
		teeth3.setRotationPoint(0.0F, -3.014F, 20.334F);
		rail2.addChild(teeth3);
		teeth3.cubeList.add(new ModelBox(teeth3, 10, 106, -1.0F, 3.0F, -13.5F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 104, 72, -1.0F, 3.0F, -15.125F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 69, 100, -1.0F, 3.0F, -16.75F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 9, 99, -1.0F, 3.0F, -18.375F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 76, 86, -1.0F, 3.0F, -21.625F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 62, 86, -1.0F, 3.0F, -20.0F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 84, 79, -1.0F, 3.0F, -24.875F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 81, 43, -1.0F, 3.0F, -23.25F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 34, 72, -1.0F, 3.0F, -26.5F, 2, 1, 1, -0.1F, false));
		teeth3.cubeList.add(new ModelBox(teeth3, 71, 28, -1.0F, 3.0F, -28.125F, 2, 1, 1, -0.1F, false));

		DustCover8_r2 = new ModelRenderer(this);
		DustCover8_r2.setRotationPoint(0.9F, 3.3343F, -27.623F);
		teeth3.addChild(DustCover8_r2);
		setRotationAngle(DustCover8_r2, 0.0F, 0.0F, 0.7854F);
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 71, 75, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 71, 77, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 80, 33, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 80, 57, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 39, 84, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 86, 33, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 86, 55, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 86, 75, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 87, 21, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r2.cubeList.add(new ModelBox(DustCover8_r2, 60, 92, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));

		DustCover9_r1 = new ModelRenderer(this);
		DustCover9_r1.setRotationPoint(-0.9F, 3.3343F, -27.623F);
		teeth3.addChild(DustCover9_r1);
		setRotationAngle(DustCover9_r1, 0.0F, 0.0F, -0.7854F);
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 76, 21, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 39, 79, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 80, 31, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 80, 55, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 39, 82, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 86, 31, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 86, 57, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 86, 86, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 87, 36, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r1.cubeList.add(new ModelBox(DustCover9_r1, 79, 92, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));

		carryhandle = new QRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 17, -0.75F, -43.0F, -18.5F, 1, 2, 20, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 47, 48, -1.75F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 47, -3.25F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 113, -0.749F, -42.55F, -30.5F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 42, 109, -0.749F, -43.55F, -31.5F, 1, 1, 4, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 83, 113, -0.75F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 62, 82, -3.5F, -44.3F, -4.5F, 4, 1, 6, 0.004F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 39, -3.0F, -44.6F, -3.6F, 3, 1, 5, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 81, 75, -1.0F, -45.63F, -3.3F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 63, 39, -3.0F, -45.63F, -3.3F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 11, 39, -2.0F, -45.38F, -2.9F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 20, 83, -3.7F, -44.9F, -4.298F, 1, 1, 6, -0.199F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 100, -3.7F, -46.8F, -4.698F, 1, 3, 3, -0.201F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 33, 16, -3.7F, -46.8F, -2.298F, 1, 3, 1, -0.198F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 22, 30, -0.3F, -44.9F, -4.298F, 1, 1, 6, -0.199F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 18, 11, -0.3F, -46.8F, -2.298F, 1, 3, 1, -0.198F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 82, 21, -0.3F, -46.8F, -4.698F, 1, 3, 3, -0.201F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 34, -2.75F, -42.0F, -43.0F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 29, -2.75F, -43.0F, -42.25F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 85, 92, -3.25F, -43.0F, -42.25F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 101, 0, -3.25F, -42.0F, -43.0F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 151, 144, -3.25F, -43.0F, -18.5F, 3, 2, 20, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 95, 8, -2.5F, -41.5F, 1.4F, 2, 1, 4, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 11, 109, -3.25F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 104, 29, -3.251F, -42.55F, -30.5F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 108, -3.251F, -43.55F, -31.5F, 1, 1, 4, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-1.5F, -42.0F, -1.0F);
		carryhandle.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.3927F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 27, 65, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 27, 117, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-1.5F, -42.0F, -11.0F);
		carryhandle.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.3927F, 0.0F, 0.0F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 66, 0, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 117, 31, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-2.75F, -42.7776F, -27.5036F);
		carryhandle.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.5672F, 0.0F, 0.0F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 102, 92, -0.499F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 0, 104, 1.999F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-2.75F, -36.4831F, -20.6854F);
		carryhandle.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.5672F, 0.0F, 0.0F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 79, 103, -0.499F, 0.0F, -14.0F, 1, 1, 3, 0.0F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 19, 104, 1.999F, 0.0F, -14.0F, 1, 1, 3, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-2.75F, -36.4704F, -9.5288F);
		carryhandle.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.5672F, 0.0F, 0.0F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 0, 109, -0.5F, 0.0F, -14.0F, 1, 1, 4, -0.002F, false));
		cube_r105.cubeList.add(new ModelBox(cube_r105, 60, 109, 2.0F, 0.0F, -14.0F, 1, 1, 4, -0.002F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-1.75F, -42.4944F, -39.4835F);
		carryhandle.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.6545F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 38, -1.499F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 66, 109, -1.001F, -1.5F, -0.5F, 3, 3, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-2.25F, -41.575F, -42.55F);
		carryhandle.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.6545F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 18, 0, -0.999F, -2.5F, -0.75F, 1, 4, 1, 0.0F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 29, 109, -0.501F, -2.5F, -0.75F, 3, 4, 1, -0.002F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.1F, -44.7F, 1.502F);
		carryhandle.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.5585F, 0.0F, 0.0F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 80, 55, -0.2F, -0.2F, -3.8F, 1, 2, 4, -0.2F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 87, 39, -3.6F, -0.2F, -3.8F, 1, 2, 4, -0.2F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.0F, -44.6F, 1.4F);
		carryhandle.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.5411F, 0.0F, 0.0F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 101, 15, -2.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 38, 60, -3.0F, 0.0F, -1.5F, 1, 1, 1, -0.001F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 6, 65, -3.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 5, 104, -4.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.6082F, -40.7113F, -11.2F);
		carryhandle.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 0, -1.8918F, -3.3387F, -30.252F, 2, 0, 37, 0.3F, false));

		DustCover4_r2 = new ModelRenderer(this);
		DustCover4_r2.setRotationPoint(-2.0961F, -3.475F, -14.15F);
		rail.addChild(DustCover4_r2);
		setRotationAngle(DustCover4_r2, 0.0F, 0.0F, 1.1781F);
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 53, 0, -0.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));

		DustCover3_r1 = new ModelRenderer(this);
		DustCover3_r1.setRotationPoint(0.3126F, -3.475F, -14.15F);
		rail.addChild(DustCover3_r1);
		setRotationAngle(DustCover3_r1, 0.0F, 0.0F, -1.1781F);
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 0, 91, -1.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(-0.8918F, -0.2489F, 18.65F);
		rail.addChild(teeth);
		teeth.cubeList.add(new ModelBox(teeth, 116, 82, -1.0F, -4.0F, -13.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 79, -1.0F, -4.0F, -15.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 76, -1.0F, -4.0F, -16.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 72, -1.0F, -4.0F, -18.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 60, 116, -1.0F, -4.0F, -21.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 48, -1.0F, -4.0F, -20.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 48, 116, -1.0F, -4.0F, -24.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 46, -1.0F, -4.0F, -23.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 42, 116, -1.0F, -4.0F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 41, -1.0F, -4.0F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 39, -1.0F, -4.0F, -26.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 30, 116, -1.0F, -4.0F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 22, -1.0F, -4.0F, -29.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 17, -1.0F, -4.0F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 15, -1.0F, -4.0F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 116, 11, -1.0F, -4.0F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 63, -1.0F, -4.0F, -49.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 58, -1.0F, -4.0F, -39.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 56, -1.0F, -4.0F, -41.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 44, -1.0F, -4.0F, -42.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 20, -1.0F, -4.0F, -44.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 9, -1.0F, -4.0F, -47.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 115, 7, -1.0F, -4.0F, -46.0F, 2, 1, 1, -0.1F, false));

		DustCover9_r2 = new ModelRenderer(this);
		DustCover9_r2.setRotationPoint(-0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover9_r2);
		setRotationAngle(DustCover9_r2, 0.0F, 0.0F, 0.7854F);
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 104, 85, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 106, 41, -0.5F, -0.5F, -2.128F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 96, 108, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 108, 102, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 108, 108, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 42, 109, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 60, 109, -0.5F, -0.5F, -3.753F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 102, 110, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 0, 111, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 87, 113, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 114, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 65, 115, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 5, 116, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 83, 116, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 94, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 96, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 100, 116, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 102, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 107, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 112, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 116, 116, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 117, 0, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 23, 117, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, 0.0F, 0.0F, -0.7854F);
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 106, 39, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 107, 92, -0.5F, -0.5F, -2.128F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 88, 108, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 102, 108, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 104, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 109, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 96, 110, -0.5F, -0.5F, -3.753F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 110, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 42, 111, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 60, 111, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 4, 114, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 114, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 88, 115, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 92, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 96, 116, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 98, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 100, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 104, 116, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 108, 116, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 110, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 116, 114, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 117, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 19, 117, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));

		action = new QRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 71, 31, -2.5F, -40.5F, -36.5F, 2, 1, 5, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 110, 82, -2.5F, -40.3F, -31.5F, 2, 1, 2, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 47, -3.0F, -40.3F, -29.5F, 3, 2, 6, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 116, 127, -3.0F, -40.5F, -23.5F, 3, 2, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 94, 56, -3.3F, -36.9F, -24.5F, 2, 3, 13, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		grip.render(f5);
		stock.render(f5);
//		mag.render(f5);
		handguard.render(f5);
		carryhandle.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
