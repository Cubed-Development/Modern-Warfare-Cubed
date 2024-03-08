package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G36C extends ModelWithAttachments {
	private final ModelRenderer body;
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
	private final ModelRenderer grip;
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
	private final ModelRenderer carryhandle;
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

	public G36C() {
		textureWidth = 256;
		textureHeight = 256;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.8457F, -11.0F, -22.7706F);
		body.cubeList.add(new ModelBox(body, 144, 163, -1.1705F, 3.0F, -1.7294F, 1, 4, 11, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 44, 111, -1.4707F, -6.0F, 10.2706F, 1, 1, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 37, 147, -1.1707F, 2.45F, -3.7294F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 60, 136, -0.9207F, 1.9F, 9.5206F, 1, 2, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 133, 43, -0.9206F, 1.9F, 10.4206F, 1, 3, 4, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 168, 107, -0.9221F, -1.7652F, -4.7294F, 1, 4, 32, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 81, 47, -0.6721F, -2.7652F, 27.2706F, 1, 7, 2, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 72, 149, -0.4221F, -2.7652F, 26.2706F, 1, 1, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 94, 39, -0.6721F, 2.2348F, 29.2706F, 1, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 133, 38, -2.9222F, 2.2348F, 24.2706F, 3, 2, 3, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 136, 34, -2.9221F, 2.2348F, 23.5706F, 3, 2, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 66, 0, -0.9221F, 2.2348F, 14.2206F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 106, 100, -0.9206F, 2.4098F, 15.4706F, 1, 2, 6, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 28, 141, -0.7137F, 2.3098F, 17.0706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 0, 141, -0.7137F, 3.4098F, 18.5706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 136, 5, -0.7137F, 4.2098F, 16.5706F, 1, 1, 4, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 136, 0, -4.9777F, 4.2098F, 16.5706F, 1, 1, 4, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 129, 140, -4.9777F, 3.4098F, 18.5706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 115, 140, -4.9777F, 2.3098F, 17.0706F, 1, 1, 2, -0.2F, false));
		body.cubeList.add(new ModelBox(body, 24, 133, -0.9221F, -1.7652F, -8.7294F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 164, 183, -2.2957F, 1.1F, -2.7294F, 2, 4, 24, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 0, 87, -4.1957F, 2.0F, -5.4794F, 4, 2, 1, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -4.3457F, -4.0F, -17.7294F, 4, 2, 45, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 202, 107, -4.3457F, -5.0F, 10.2706F, 4, 1, 17, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 144, 148, -4.5209F, 3.0F, -1.7294F, 1, 4, 11, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 136, 13, -4.5207F, 2.45F, -3.7294F, 1, 2, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 13, 31, -4.7707F, 0.9F, 9.5206F, 1, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 125, 132, -4.7708F, 1.9F, 10.4206F, 1, 3, 4, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 94, 39, -4.7694F, -1.7652F, 10.2706F, 1, 4, 17, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 86, 92, -5.5194F, -1.7652F, 10.2706F, 1, 2, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 70, 47, -4.7694F, -1.7652F, -4.7294F, 1, 4, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 109, 147, -4.7694F, 0.2348F, -1.7294F, 1, 2, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 109, 132, -4.7692F, 2.2348F, 24.2706F, 3, 2, 3, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 109, 140, -4.7694F, 2.2348F, 23.5706F, 2, 2, 1, 0.003F, false));
		body.cubeList.add(new ModelBox(body, 23, 61, -4.7694F, 2.2348F, 14.2206F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 106, 92, -4.7708F, 2.4098F, 15.4706F, 1, 2, 6, 0.002F, false));
		body.cubeList.add(new ModelBox(body, 88, 132, -4.7694F, -1.7652F, -8.7294F, 1, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 112, 182, -4.3957F, 1.1F, -2.7294F, 2, 4, 24, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 77, 92, -4.4957F, 2.0F, -5.4794F, 1, 2, 1, 0.001F, false));
		body.cubeList.add(new ModelBox(body, 205, 29, -4.2207F, -6.0F, 10.2706F, 3, 1, 17, 0.001F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.6386F, -5.0F, 18.7706F);
		body.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 97, 18, -0.5F, -0.5F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.6957F, 2.4135F, 23.295F);
		body.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.3927F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 108, -2.175F, 1.0F, -2.0F, 4, 1, 1, -0.1F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 20, 106, -1.125F, 1.0F, -2.0F, 4, 1, 1, -0.1F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.5957F, 3.3762F, 19.8813F);
		body.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.2182F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 113, 50, -2.175F, 0.0F, -2.0F, 3, 2, 4, -0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 103, -0.325F, 0.0F, -2.0F, 3, 2, 4, -0.001F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.5957F, 4.2114F, 14.9838F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.0873F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 130, -2.175F, -1.75F, 0.5F, 3, 3, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 128, 122, -0.325F, -1.75F, 0.5F, 3, 3, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.5957F, 4.9368F, 14.6694F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 11, 24, -2.1752F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 24, -0.3248F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.5957F, 4.7842F, 12.9261F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0873F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 94, 70, -2.175F, -0.5F, -2.5F, 3, 1, 4, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 94, 39, -0.325F, -0.5F, -2.5F, 3, 1, 4, -0.001F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-3.9957F, 2.6512F, -5.9047F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.48F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 114, 100, -0.4999F, -1.0F, -3.0F, 1, 2, 4, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 47, 79, -0.2001F, -1.0F, -3.0F, 4, 2, 4, 0.001F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-3.8956F, 2.6F, 22.2706F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.48F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 47, -0.5F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 23, 47, 2.5998F, -2.0F, -1.0F, 1, 4, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-3.8956F, 3.4691F, 15.7141F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.0873F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 11, 17, -0.5F, -2.0F, -1.5F, 1, 4, 3, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 17, 2.5998F, -2.0F, -1.5F, 1, 4, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.6457F, 2.6F, -2.9794F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.3054F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 128, 114, -0.7499F, -2.0F, -2.0F, 1, 4, 4, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 86, 92, -0.6501F, -2.0F, -2.0F, 4, 4, 4, 0.001F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-4.5694F, 3.9301F, 22.708F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.7854F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 136, 28, -0.5F, -0.5F, -1.0F, 2, 1, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 136, 21, 2.9473F, -0.5F, -1.0F, 2, 1, 2, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.2694F, 3.4705F, 21.8242F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.7854F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 96, 118, -0.4998F, -2.7F, -1.225F, 1, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 98, 140, -0.5001F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 111, 60, 3.347F, -2.7F, -1.225F, 1, 2, 3, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 92, 140, 3.3473F, -0.5F, -1.0F, 1, 1, 2, 0.002F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-4.8123F, -0.7652F, 11.2706F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.7854F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 136, -0.5F, -1.0F, -0.5F, 1, 2, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-4.0207F, 5.4403F, -1.4147F);
		body.addChild(cube_r14);
		setRotationAngle(cube_r14, -1.0908F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 131, -0.5F, -1.0F, -1.5F, 3, 2, 3, -0.002F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 131, 0.85F, -1.0F, -1.5F, 3, 2, 3, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-4.0207F, 4.7261F, -1.9479F);
		body.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7418F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 37, 131, -0.5F, -1.0F, -1.5F, 3, 2, 3, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 130, 84, 0.85F, -1.0F, -1.5F, 3, 2, 3, -0.002F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.0208F, 7.782F, 4.3866F);
		body.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 136, 0, -1.5F, -0.5F, -6.0F, 3, 1, 12, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 133, 52, -0.1498F, -0.5F, -6.0F, 3, 1, 12, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-1.0528F, -5.0F, 18.7706F);
		body.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 97, 0, -0.5F, -0.5F, -8.5F, 1, 1, 17, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-4.8694F, 4.5098F, 17.1706F);
		body.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.1063F, -0.1736F, -0.0184F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 60, 140, -0.5015F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-4.7694F, 5.0098F, 16.5706F);
		body.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.4189F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 8, 124, -0.5015F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 118, 106, 4.3487F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.1779F, 4.5098F, 17.1706F);
		body.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.1063F, 0.1736F, 0.0184F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 54, 140, -0.4985F, -1.0F, 0.0F, 1, 1, 2, -0.1F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.3684F, 0.7348F, 27.1478F);
		body.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.6109F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 34, 98, -0.5F, -3.5F, -0.5F, 1, 7, 1, 0.0F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-0.1721F, -0.0977F, 29.2414F);
		body.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.2182F, 0.0F, 0.0F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 45, 136, -0.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-0.1292F, -2.2652F, 27.2706F);
		body.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0F, 0.7854F, 0.0F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 66, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.1292F, -2.2652F, 26.2706F);
		body.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0F, 0.7854F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 60, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.5471F, -2.2652F, 25.2706F);
		body.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.1309F, 0.0F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 56, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-4.7693F, -1.7652F, -7.7294F);
		body.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0F, 0.0F, 0.2269F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 0, 130, 0.0F, -2.0F, 0.0F, 1, 2, 35, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.0779F, -1.7652F, -7.7294F);
		body.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, 0.0F, -0.2269F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 128, 77, -1.0F, -2.0F, 0.0F, 1, 2, 35, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-0.3915F, 0.9283F, -0.4854F);
		grip.cubeList.add(new ModelBox(grip, 57, 92, -1.6075F, -6.8532F, -7.9352F, 1, 2, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 86, 100, -1.9335F, -7.3283F, -16.0146F, 3, 4, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 64, 100, -3.2835F, -7.3283F, -16.0146F, 3, 4, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 75, 123, -2.1835F, -3.3283F, -13.2646F, 2, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 136, 0.0665F, -5.3283F, -20.0146F, 1, 1, 4, -0.001F, false));
		grip.cubeList.add(new ModelBox(grip, 94, 135, -3.2835F, -5.3283F, -20.0146F, 1, 1, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 122, 60, 0.3165F, -7.8283F, -15.0146F, 1, 1, 3, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 116, 118, 0.3165F, -7.3783F, -15.0136F, 1, 1, 3, 0.002F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(0.4719F, -6.3783F, -15.7471F);
		grip.addChild(cube_r28);
		setRotationAngle(cube_r28, 0.0F, 0.3927F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 24, 140, -0.5001F, -1.0F, -1.0F, 1, 1, 2, 0.001F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 18, 140, -0.5F, -1.45F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(1.0665F, -7.0783F, -12.7646F);
		grip.addChild(cube_r29);
		setRotationAngle(cube_r29, -0.3927F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 52, 149, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-1.1835F, -0.951F, -12.6128F);
		grip.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.1745F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 55, 121, -0.999F, -2.5F, -0.75F, 2, 3, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-1.1075F, -3.9851F, -7.6398F);
		grip.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.2182F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 86, 39, -0.499F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-1.1075F, -2.7094F, -4.7174F);
		grip.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.5236F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 0, 79, -1.501F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-1.1075F, -2.0359F, -9.1445F);
		grip.addChild(gun238_r1);
		setRotationAngle(gun238_r1, -0.0873F, 0.0F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 20, 91, -1.5F, -0.5F, -3.0F, 3, 1, 6, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.1085F, -0.8025F, -2.6389F);
		grip.addChild(bone);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);
		

		gun240_r2 = new ModelRenderer(this);
		gun240_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun240_r2);
		setRotationAngle(gun240_r2, 0.3054F, 0.0F, 0.0F);
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 0, 0, -2.002F, -6.5F, 0.175F, 4, 13, 3, 0.001F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 10, 47, -1.0F, -6.5F, -0.5F, 2, 13, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-1.0F, -0.0623F, 0.1975F);
		bone.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.4194F, -0.7401F, -0.2921F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 41, 0, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(-1.3876F, -0.247F, 0.7834F);
		bone.addChild(gun242_r1);
		setRotationAngle(gun242_r1, 2.2581F, -1.1712F, -2.2987F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 32, 17, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun240_r3 = new ModelRenderer(this);
		gun240_r3.setRotationPoint(0.0F, 0.4256F, 5.8394F);
		bone.addChild(gun240_r3);
		setRotationAngle(gun240_r3, 0.4363F, 0.0F, 0.0F);
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 123, 39, -1.0F, -6.0F, -1.5F, 2, 10, 2, 0.0F, false));

		gun241_r2 = new ModelRenderer(this);
		gun241_r2.setRotationPoint(0.0F, 1.2708F, 4.0268F);
		bone.addChild(gun241_r2);
		setRotationAngle(gun241_r2, 0.4363F, 0.0F, 0.0F);
		gun241_r2.cubeList.add(new ModelBox(gun241_r2, 53, 23, -2.003F, -6.0F, -1.175F, 4, 10, 3, -0.001F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.3374F, 2.6001F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -0.6545F, 0.0F, 0.0F);
		

		gun241_r3 = new ModelRenderer(this);
		gun241_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(gun241_r3);
		setRotationAngle(gun241_r3, 0.4363F, 0.0F, 0.0F);
		gun241_r3.cubeList.add(new ModelBox(gun241_r3, 31, 0, -1.0F, -8.0F, -0.5F, 2, 4, 1, 0.0F, false));

		gun242_r2 = new ModelRenderer(this);
		gun242_r2.setRotationPoint(0.0F, 0.8452F, -1.8126F);
		bone6.addChild(gun242_r2);
		setRotationAngle(gun242_r2, 0.4363F, 0.0F, 0.0F);
		gun242_r2.cubeList.add(new ModelBox(gun242_r2, 116, 0, -2.004F, -8.0F, -1.175F, 4, 4, 3, -0.003F, false));

		carryhandle = new ModelRenderer(this);
		carryhandle.setRotationPoint(0.0F, 24.0F, 0.0F);
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 17, -0.75F, -43.0F, -18.5F, 1, 2, 20, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 47, 48, -1.75F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 0, 47, -3.25F, -44.0F, -41.5F, 2, 1, 43, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 139, 56, -0.749F, -42.55F, -30.5F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 133, 56, -0.749F, -43.55F, -31.5F, 1, 1, 4, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 139, 43, -0.75F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 157, 163, -3.5F, -44.3F, -4.5F, 4, 1, 6, 0.004F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 73, 12, -3.0F, -44.6F, -3.6F, 3, 1, 5, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 6, 114, -1.0F, -45.63F, -3.3F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 111, 65, -3.0F, -45.63F, -3.3F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 10, 103, -2.0F, -45.38F, -2.9F, 1, 1, 3, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 106, 111, -3.7F, -44.9F, -4.298F, 1, 1, 6, -0.199F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 83, 32, -3.7F, -46.8F, -4.698F, 1, 3, 3, -0.201F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 47, 57, -3.7F, -46.8F, -2.298F, 1, 3, 1, -0.198F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 86, 111, -0.3F, -44.9F, -4.298F, 1, 1, 6, -0.199F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 53, 39, -0.3F, -46.8F, -2.298F, 1, 3, 1, -0.198F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 82, 76, -0.3F, -46.8F, -4.698F, 1, 3, 3, -0.201F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 133, 52, -2.75F, -42.0F, -43.0F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 128, 106, -2.75F, -43.0F, -42.25F, 3, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 96, 100, -3.25F, -43.0F, -42.25F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 74, 100, -3.25F, -42.0F, -43.0F, 1, 1, 3, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 201, 0, -3.25F, -43.0F, -18.5F, 3, 2, 20, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 92, 124, -2.5F, -41.5F, 1.4F, 2, 1, 4, 0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 138, 126, -3.25F, -43.0F, -20.0F, 1, 1, 2, -0.001F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 64, 138, -3.251F, -42.55F, -30.5F, 1, 1, 2, 0.0F, false));
		carryhandle.cubeList.add(new ModelBox(carryhandle, 112, 124, -3.251F, -43.55F, -31.5F, 1, 1, 4, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(-1.5F, -42.0F, -1.0F);
		carryhandle.addChild(cube_r101);
		setRotationAngle(cube_r101, -0.3927F, 0.0F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 146, 114, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r101.cubeList.add(new ModelBox(cube_r101, 146, 108, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(-1.5F, -42.0F, -11.0F);
		carryhandle.addChild(cube_r102);
		setRotationAngle(cube_r102, -0.3927F, 0.0F, 0.0F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 146, 106, -2.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r102.cubeList.add(new ModelBox(cube_r102, 146, 104, 1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(-2.75F, -42.7776F, -27.5036F);
		carryhandle.addChild(cube_r103);
		setRotationAngle(cube_r103, 0.5672F, 0.0F, 0.0F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 81, 39, -0.499F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));
		cube_r103.cubeList.add(new ModelBox(cube_r103, 65, 39, 1.999F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(-2.75F, -36.4831F, -20.6854F);
		carryhandle.addChild(cube_r104);
		setRotationAngle(cube_r104, -0.5672F, 0.0F, 0.0F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 10, 62, -0.499F, 0.0F, -14.0F, 1, 1, 3, 0.0F, false));
		cube_r104.cubeList.add(new ModelBox(cube_r104, 29, 33, 1.999F, 0.0F, -14.0F, 1, 1, 3, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(-2.75F, -36.4704F, -9.5288F);
		carryhandle.addChild(cube_r105);
		setRotationAngle(cube_r105, -0.5672F, 0.0F, 0.0F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 121, 70, -0.5F, 0.0F, -14.0F, 1, 1, 4, -0.002F, false));
		cube_r105.cubeList.add(new ModelBox(cube_r105, 114, 111, 2.0F, 0.0F, -14.0F, 1, 1, 4, -0.002F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-1.75F, -42.4944F, -39.4835F);
		carryhandle.addChild(cube_r106);
		setRotationAngle(cube_r106, -0.6545F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 18, 11, -1.499F, -1.5F, -0.5F, 1, 3, 1, 0.0F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 35, 61, -1.001F, -1.5F, -0.5F, 3, 3, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(-2.25F, -41.575F, -42.55F);
		carryhandle.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.6545F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 0, 39, -0.999F, -2.5F, -0.75F, 1, 4, 1, 0.0F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 105, 8, -0.501F, -2.5F, -0.75F, 3, 4, 1, -0.002F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-0.1F, -44.7F, 1.502F);
		carryhandle.addChild(cube_r108);
		setRotationAngle(cube_r108, -0.5585F, 0.0F, 0.0F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 114, 92, -0.2F, -0.2F, -3.8F, 1, 2, 4, -0.2F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 94, 111, -3.6F, -0.2F, -3.8F, 1, 2, 4, -0.2F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(1.0F, -44.6F, 1.4F);
		carryhandle.addChild(cube_r109);
		setRotationAngle(cube_r109, -0.5411F, 0.0F, 0.0F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 137, 120, -2.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 146, 102, -3.0F, 0.0F, -1.5F, 1, 1, 1, -0.001F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 101, 146, -3.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 115, 137, -4.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(-0.6082F, -40.7113F, -11.2F);
		carryhandle.addChild(rail);
		rail.cubeList.add(new ModelBox(rail, 0, 0, -1.8918F, -3.3387F, -30.252F, 2, 0, 37, 0.3F, false));

		DustCover4_r2 = new ModelRenderer(this);
		DustCover4_r2.setRotationPoint(-2.0961F, -3.475F, -14.15F);
		rail.addChild(DustCover4_r2);
		setRotationAngle(DustCover4_r2, 0.0F, 0.0F, 1.1781F);
		DustCover4_r2.cubeList.add(new ModelBox(DustCover4_r2, 86, 93, -0.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));

		DustCover3_r1 = new ModelRenderer(this);
		DustCover3_r1.setRotationPoint(0.3126F, -3.475F, -14.15F);
		rail.addChild(DustCover3_r1);
		setRotationAngle(DustCover3_r1, 0.0F, 0.0F, -1.1781F);
		DustCover3_r1.cubeList.add(new ModelBox(DustCover3_r1, 44, 92, -1.5F, -0.5F, -16.5F, 2, 1, 38, -0.3F, false));

		teeth = new ModelRenderer(this);
		teeth.setRotationPoint(-0.8918F, -0.2489F, 18.65F);
		rail.addChild(teeth);
		teeth.cubeList.add(new ModelBox(teeth, 115, 143, -1.0F, -4.0F, -13.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 109, 143, -1.0F, -4.0F, -15.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 94, 143, -1.0F, -4.0F, -16.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 88, 143, -1.0F, -4.0F, -18.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 143, 67, -1.0F, -4.0F, -21.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 143, 65, -1.0F, -4.0F, -20.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 18, 143, -1.0F, -4.0F, -24.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 143, 17, -1.0F, -4.0F, -23.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 143, 13, -1.0F, -4.0F, -37.875F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 5, 143, -1.0F, -4.0F, -36.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 78, 142, -1.0F, -4.0F, -26.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 72, 142, -1.0F, -4.0F, -28.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 69, -1.0F, -4.0F, -29.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 43, 142, -1.0F, -4.0F, -31.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 37, 142, -1.0F, -4.0F, -34.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 31, -1.0F, -4.0F, -33.0F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 28, -1.0F, -4.0F, -49.25F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 24, -1.0F, -4.0F, -39.5F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 21, -1.0F, -4.0F, -41.125F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 10, -1.0F, -4.0F, -42.75F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 7, -1.0F, -4.0F, -44.375F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 5, -1.0F, -4.0F, -47.625F, 2, 1, 1, -0.1F, false));
		teeth.cubeList.add(new ModelBox(teeth, 142, 2, -1.0F, -4.0F, -46.0F, 2, 1, 1, -0.1F, false));

		DustCover9_r2 = new ModelRenderer(this);
		DustCover9_r2.setRotationPoint(-0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover9_r2);
		setRotationAngle(DustCover9_r2, 0.0F, 0.0F, 0.7854F);
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 146, 100, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 146, 98, -0.5F, -0.5F, -2.128F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 146, 96, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 146, 94, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 66, 146, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 142, 49, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 142, 38, -0.5F, -0.5F, -3.753F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 66, 141, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 4, 141, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 119, 140, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 140, 98, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 96, 140, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 140, 94, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 140, 81, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 140, 79, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 140, 77, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 58, 140, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 22, 140, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 139, 102, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 139, 85, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 139, 83, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 82, 139, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover9_r2.cubeList.add(new ModelBox(DustCover9_r2, 76, 139, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));

		DustCover8_r3 = new ModelRenderer(this);
		DustCover8_r3.setRotationPoint(0.9F, -3.3343F, -45.498F);
		teeth.addChild(DustCover8_r3);
		setRotationAngle(DustCover8_r3, 0.0F, 0.0F, -0.7854F);
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 138, -0.5F, -0.5F, -0.503F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 119, 137, -0.5F, -0.5F, -2.128F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 113, 137, -0.5F, -0.5F, 1.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 100, 136, -0.5F, -0.5F, 2.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 82, 136, -0.5F, -0.5F, 4.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 76, 136, -0.5F, -0.5F, 5.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 58, 136, -0.5F, -0.5F, -3.753F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 136, 7, -0.5F, -0.5F, 12.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 136, 5, -0.5F, -0.5F, 10.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 136, 2, -0.5F, -0.5F, 14.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 136, 0, -0.5F, -0.5F, 15.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 0, 136, -0.5F, -0.5F, 17.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 131, 134, -0.5F, -0.5F, 18.997F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 134, 128, -0.5F, -0.5F, 9.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 125, 134, -0.5F, -0.5F, 7.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 101, 134, -0.5F, -0.5F, 22.247F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 88, 134, -0.5F, -0.5F, 20.622F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 133, 58, -0.5F, -0.5F, 25.497F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 133, 56, -0.5F, -0.5F, 23.872F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 133, 45, -0.5F, -0.5F, 27.122F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 133, 43, -0.5F, -0.5F, 28.747F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 131, 132, -0.5F, -0.5F, 30.372F, 1, 1, 1, -0.1F, false));
		DustCover8_r3.cubeList.add(new ModelBox(DustCover8_r3, 125, 132, -0.5F, -0.5F, 31.997F, 1, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		grip.render(f5);
		carryhandle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}