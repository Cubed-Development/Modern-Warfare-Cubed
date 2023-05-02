package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MPX extends ModelWithAttachments {
	private final QRenderer gun;
	private final ModelRenderer receiver_lower;
	private final ModelRenderer side_things_r1;
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
	private final ModelRenderer bone288;
	private final ModelRenderer bone289;
	private final ModelRenderer bone;
	private final ModelRenderer bone287;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone5;
	private final ModelRenderer bone290;
	private final ModelRenderer bone291;
	private final ModelRenderer bone4;
	private final ModelRenderer bone272;
	private final ModelRenderer bone275_r2;
	private final ModelRenderer bone274_r2;
	private final ModelRenderer bone273_r2;
	private final ModelRenderer bone275_r1;
	private final ModelRenderer bone274_r1;
	private final ModelRenderer bone273_r1;
	private final ModelRenderer bone273;
	private final ModelRenderer bone274;
	private final ModelRenderer bone275;
	private final ModelRenderer trigger;
	private final ModelRenderer bone293;
	private final ModelRenderer bone294;
	private final ModelRenderer side_things;
	private final ModelRenderer side_things_r2;
	private final ModelRenderer side_things_r3;
	private final ModelRenderer receiver_upper;
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
	private final ModelRenderer receiver_upper_r25;
	private final ModelRenderer receiver_upper_r26;
	private final ModelRenderer receiver_upper_r27;
	private final ModelRenderer receiver_upper_r28;
	private final ModelRenderer receiver_upper_r29;
	private final ModelRenderer receiver_upper_r30;
	private final ModelRenderer receiver_upper_r31;
	private final ModelRenderer receiver_upper_r32;
	private final ModelRenderer receiver_upper_r33;
	private final ModelRenderer receiver_upper_r34;
	private final ModelRenderer receiver_upper_r35;
	private final ModelRenderer receiver_upper_r36;
	private final ModelRenderer receiver_upper_r37;
	private final ModelRenderer receiver_upper_r38;
	private final ModelRenderer receiver_upper_r39;
	private final ModelRenderer receiver_upper_r40;
	private final ModelRenderer receiver_upper_r41;
	private final ModelRenderer receiver_upper_r42;
	private final ModelRenderer receiver_upper_r43;
	private final ModelRenderer receiver_upper_r44;
	private final ModelRenderer receiver_upper_r45;
	private final ModelRenderer receiver_upper_r46;
	private final ModelRenderer receiver_upper_r47;
	private final ModelRenderer receiver_upper_r48;
	private final ModelRenderer receiver_upper_r49;
	private final ModelRenderer receiver_upper_r50;
	private final ModelRenderer receiver_upper_r51;
	private final ModelRenderer receiver_upper_r52;
	private final ModelRenderer receiver_upper_r53;
	private final ModelRenderer receiver_upper_r54;
	private final ModelRenderer receiver_upper_r55;
	private final ModelRenderer receiver_upper_r56;
	private final ModelRenderer receiver_upper_r57;
	private final ModelRenderer receiver_upper_r58;
	private final ModelRenderer receiver_upper_r59;
	private final ModelRenderer receiver_upper_r60;
	private final ModelRenderer receiver_upper_r61;
	private final ModelRenderer receiver_upper_r62;
	private final ModelRenderer receiver_upper_r63;
	private final ModelRenderer receiver_upper_r64;
	private final ModelRenderer receiver_upper_r65;
	private final ModelRenderer receiver_upper_r66;
	private final ModelRenderer receiver_upper_r67;
	private final ModelRenderer receiver_upper_r68;
	private final ModelRenderer receiver_upper_r69;
	private final ModelRenderer receiver_upper_r70;
	private final ModelRenderer receiver_upper_r71;
	private final ModelRenderer receiver_upper_r72;
	private final ModelRenderer receiver_upper_r73;
	private final ModelRenderer action_flap;
	private final QRenderer stock;
	private final ModelRenderer bone312_r2;
	private final ModelRenderer bone308_r2;
	private final ModelRenderer bone303_r2;
	private final ModelRenderer bone301_r2;
	private final ModelRenderer bone302_r2;
	private final ModelRenderer bone300_r2;
	private final ModelRenderer bone316_r2;
	private final ModelRenderer bone312_r1;
	private final ModelRenderer bone308_r1;
	private final ModelRenderer bone303_r1;
	private final ModelRenderer bone301_r1;
	private final ModelRenderer bone302_r1;
	private final ModelRenderer bone300_r1;
	private final ModelRenderer bone316_r1;
	private final ModelRenderer bone316;
	private final ModelRenderer bone300;
	private final ModelRenderer bone302;
	private final ModelRenderer bone301;
	private final ModelRenderer bone303;
	private final ModelRenderer bone305;
	private final ModelRenderer bone307_r2;
	private final ModelRenderer bone306_r2;
	private final ModelRenderer bone304_r2;
	private final ModelRenderer bone307_r1;
	private final ModelRenderer bone306_r1;
	private final ModelRenderer bone304_r1;
	private final ModelRenderer bone304;
	private final ModelRenderer bone306;
	private final ModelRenderer bone307;
	private final ModelRenderer bone308;
	private final ModelRenderer bone311_r2;
	private final ModelRenderer bone310_r2;
	private final ModelRenderer bone309_r2;
	private final ModelRenderer bone311_r1;
	private final ModelRenderer bone310_r1;
	private final ModelRenderer bone309_r1;
	private final ModelRenderer bone309;
	private final ModelRenderer bone310;
	private final ModelRenderer bone311;
	private final ModelRenderer bone317;
	private final ModelRenderer bone312;
	private final ModelRenderer bone315_r2;
	private final ModelRenderer bone314_r2;
	private final ModelRenderer bone313_r2;
	private final ModelRenderer bone315_r1;
	private final ModelRenderer bone314_r1;
	private final ModelRenderer bone313_r1;
	private final ModelRenderer bone313;
	private final ModelRenderer bone314;
	private final ModelRenderer bone315;
	private final ModelRenderer bone265;
	private final ModelRenderer bone266;
	private final ModelRenderer bone259;
	private final ModelRenderer bone258;

	public MPX() {
		textureWidth = 256;
		textureHeight = 256;

		gun = new QRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, -0.5F);
		

		receiver_lower = new ModelRenderer(this);
		receiver_lower.setRotationPoint(0.0F, 0.0F, -5.5F);
		gun.addChild(receiver_lower);
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 13, 50, -3.0F, -31.75F, -11.5F, 3, 5, 1, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 14, 40, -3.0F, -31.75F, -2.5F, 3, 5, 1, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 31, 88, -2.5F, -27.25F, -8.5F, 2, 1, 4, 0.001F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 0, -0.5F, -39.5F, -18.5F, 1, 8, 10, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 145, 40, -0.75F, -37.5F, -9.0F, 1, 6, 13, 0.002F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 134, 141, -3.25F, -37.5F, -10.0F, 1, 6, 14, 0.002F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 49, 50, -0.3F, -33.5F, -11.501F, 1, 2, 3, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 62, 0, -0.3F, -37.5F, -12.501F, 1, 3, 4, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 52, 23, -0.05F, -35.75F, -21.501F, 1, 1, 8, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 25, 0, -3.95F, -35.65F, -21.501F, 1, 1, 10, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 99, 46, -3.95F, -34.75F, -19.501F, 1, 1, 4, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 63, 74, -3.95F, -35.75F, -12.201F, 1, 3, 1, 0.002F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 102, 117, -3.951F, -33.05F, -12.201F, 1, 1, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 121, 117, -0.049F, -35.25F, -21.501F, 1, 1, 2, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 23, 97, -0.05F, -36.5F, -13.501F, 1, 2, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 3, 87, -0.049F, -37.0F, -13.502F, 1, 1, 5, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 122, 45, -0.3F, -34.5F, -10.501F, 1, 1, 2, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 62, 32, -0.4F, -34.5F, -13.501F, 1, 1, 3, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 25, 120, -0.3F, -33.5F, -12.501F, 1, 1, 1, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 25, 11, -3.5F, -31.5F, -18.0F, 4, 4, 7, 0.0F, false));
		receiver_lower.cubeList.add(new ModelBox(receiver_lower, 0, 24, -3.5F, -38.5F, -18.5F, 1, 7, 9, 0.0F, false));

		side_things_r1 = new ModelRenderer(this);
		side_things_r1.setRotationPoint(1.0F, -36.95F, -10.75F);
		receiver_lower.addChild(side_things_r1);
		setRotationAngle(side_things_r1, 0.0F, 0.0F, 0.0873F);
		side_things_r1.cubeList.add(new ModelBox(side_things_r1, 48, 97, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		side_things_r1.cubeList.add(new ModelBox(side_things_r1, 73, 97, -1.0F, -2.0F, 0.5F, 1, 2, 1, 0.001F, false));

		receiver_upper_r1 = new ModelRenderer(this);
		receiver_upper_r1.setRotationPoint(0.5F, -28.55F, -19.8F);
		receiver_lower.addChild(receiver_upper_r1);
		setRotationAngle(receiver_upper_r1, -0.2269F, 0.0F, 0.0F);
		receiver_upper_r1.cubeList.add(new ModelBox(receiver_upper_r1, 70, 83, -4.001F, -5.0F, 0.0F, 4, 5, 2, 0.0F, false));

		receiver_upper_r2 = new ModelRenderer(this);
		receiver_upper_r2.setRotationPoint(0.5F, -34.5F, -21.5F);
		receiver_lower.addChild(receiver_upper_r2);
		setRotationAngle(receiver_upper_r2, 1.1345F, 0.0F, 0.0F);
		receiver_upper_r2.cubeList.add(new ModelBox(receiver_upper_r2, 0, 97, -3.999F, 0.0F, 0.0F, 4, 4, 2, 0.0F, false));

		receiver_upper_r3 = new ModelRenderer(this);
		receiver_upper_r3.setRotationPoint(0.5F, -32.5F, -12.201F);
		receiver_lower.addChild(receiver_upper_r3);
		setRotationAngle(receiver_upper_r3, 0.7854F, 0.0F, 0.0F);
		receiver_upper_r3.cubeList.add(new ModelBox(receiver_upper_r3, 10, 120, -0.999F, 0.0F, 0.0F, 1, 1, 1, 0.2F, false));

		receiver_upper_r4 = new ModelRenderer(this);
		receiver_upper_r4.setRotationPoint(0.95F, -35.75F, -19.501F);
		receiver_lower.addChild(receiver_upper_r4);
		setRotationAngle(receiver_upper_r4, 0.0F, 0.0F, 1.1694F);
		receiver_upper_r4.cubeList.add(new ModelBox(receiver_upper_r4, 29, 64, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		receiver_upper_r5 = new ModelRenderer(this);
		receiver_upper_r5.setRotationPoint(0.951F, -34.25F, -19.501F);
		receiver_lower.addChild(receiver_upper_r5);
		setRotationAngle(receiver_upper_r5, 0.7854F, 0.0F, 0.0F);
		receiver_upper_r5.cubeList.add(new ModelBox(receiver_upper_r5, 4, 120, -1.002F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r6 = new ModelRenderer(this);
		receiver_upper_r6.setRotationPoint(-3.95F, -35.75F, -11.801F);
		receiver_lower.addChild(receiver_upper_r6);
		setRotationAngle(receiver_upper_r6, 0.1396F, 0.0F, 0.0F);
		receiver_upper_r6.cubeList.add(new ModelBox(receiver_upper_r6, 121, 95, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r7 = new ModelRenderer(this);
		receiver_upper_r7.setRotationPoint(-3.95F, -33.15F, -12.601F);
		receiver_lower.addChild(receiver_upper_r7);
		setRotationAngle(receiver_upper_r7, -0.1222F, 0.0F, 0.0F);
		receiver_upper_r7.cubeList.add(new ModelBox(receiver_upper_r7, 121, 98, 0.0F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r8 = new ModelRenderer(this);
		receiver_upper_r8.setRotationPoint(-3.95F, -32.95F, -10.801F);
		receiver_lower.addChild(receiver_upper_r8);
		setRotationAngle(receiver_upper_r8, 0.0F, 0.3665F, 0.0F);
		receiver_upper_r8.cubeList.add(new ModelBox(receiver_upper_r8, 88, 80, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver_upper_r9 = new ModelRenderer(this);
		receiver_upper_r9.setRotationPoint(-2.95F, -33.75F, -15.501F);
		receiver_lower.addChild(receiver_upper_r9);
		setRotationAngle(receiver_upper_r9, 0.5585F, 0.0F, 0.0F);
		receiver_upper_r9.cubeList.add(new ModelBox(receiver_upper_r9, 121, 91, -1.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r10 = new ModelRenderer(this);
		receiver_upper_r10.setRotationPoint(-0.75F, -33.95F, 4.7F);
		receiver_lower.addChild(receiver_upper_r10);
		setRotationAngle(receiver_upper_r10, 0.4014F, 0.0F, 0.0F);
		receiver_upper_r10.cubeList.add(new ModelBox(receiver_upper_r10, 49, 74, 0.001F, -3.0F, -1.0F, 1, 3, 6, 0.0F, false));
		receiver_upper_r10.cubeList.add(new ModelBox(receiver_upper_r10, 52, 9, -2.499F, -3.0F, -1.0F, 3, 3, 6, 0.0F, false));

		receiver_upper_r11 = new ModelRenderer(this);
		receiver_upper_r11.setRotationPoint(-2.25F, -31.5F, 4.0F);
		receiver_lower.addChild(receiver_upper_r11);
		setRotationAngle(receiver_upper_r11, 1.1345F, 0.0F, 0.0F);
		receiver_upper_r11.cubeList.add(new ModelBox(receiver_upper_r11, 49, 65, -1.0F, -2.0F, 0.0F, 3, 2, 4, 0.0F, false));
		receiver_upper_r11.cubeList.add(new ModelBox(receiver_upper_r11, 57, 74, 1.5F, -2.0F, 0.0F, 1, 2, 4, 0.0F, false));

		receiver_upper_r12 = new ModelRenderer(this);
		receiver_upper_r12.setRotationPoint(0.55F, -36.3F, -8.5F);
		receiver_lower.addChild(receiver_upper_r12);
		setRotationAngle(receiver_upper_r12, 0.0F, 0.0F, 0.5061F);
		receiver_upper_r12.cubeList.add(new ModelBox(receiver_upper_r12, 145, 72, -1.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

		receiver_upper_r13 = new ModelRenderer(this);
		receiver_upper_r13.setRotationPoint(-4.0F, -37.25F, -8.5F);
		receiver_lower.addChild(receiver_upper_r13);
		setRotationAngle(receiver_upper_r13, 0.0F, 0.0F, 0.7854F);
		receiver_upper_r13.cubeList.add(new ModelBox(receiver_upper_r13, 62, 36, 0.0F, -1.0F, -12.0F, 1, 1, 3, 0.0F, false));
		receiver_upper_r13.cubeList.add(new ModelBox(receiver_upper_r13, 50, 185, 0.0F, -1.0F, -3.0F, 1, 1, 19, 0.0F, false));

		receiver_upper_r14 = new ModelRenderer(this);
		receiver_upper_r14.setRotationPoint(1.0F, -37.25F, -19.5F);
		receiver_lower.addChild(receiver_upper_r14);
		setRotationAngle(receiver_upper_r14, 0.0F, 0.0F, 0.7854F);
		receiver_upper_r14.cubeList.add(new ModelBox(receiver_upper_r14, 52, 32, -1.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
		receiver_upper_r14.cubeList.add(new ModelBox(receiver_upper_r14, 185, 155, -1.0F, 0.0F, 11.0F, 1, 1, 16, 0.0F, false));

		bone288 = new ModelRenderer(this);
		bone288.setRotationPoint(-1.5F, -31.25F, -10.5F);
		receiver_lower.addChild(bone288);
		setRotationAngle(bone288, -0.7854F, 0.0F, 0.0F);
		bone288.cubeList.add(new ModelBox(bone288, 100, 15, -1.5F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));

		bone289 = new ModelRenderer(this);
		bone289.setRotationPoint(-1.5F, -31.25F, -2.5F);
		receiver_lower.addChild(bone289);
		setRotationAngle(bone289, 0.7854F, 0.0F, 0.0F);
		bone289.cubeList.add(new ModelBox(bone289, 100, 12, -1.5F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-2.0F, -26.0F, -17.75F);
		receiver_lower.addChild(bone);
		setRotationAngle(bone, -0.0873F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 40, -1.75F, -1.9545F, 0.5564F, 4, 1, 6, 0.002F, false));
		bone.cubeList.add(new ModelBox(bone, 78, 59, 1.75F, -1.9545F, 0.5564F, 1, 1, 6, 0.0F, false));

		bone287 = new ModelRenderer(this);
		bone287.setRotationPoint(2.5F, -1.4872F, 1.8042F);
		bone.addChild(bone287);
		setRotationAngle(bone287, 0.0F, 0.0F, 0.7854F);
		bone287.cubeList.add(new ModelBox(bone287, 77, 30, -1.1537F, -0.5073F, -1.2479F, 1, 1, 6, 0.0F, false));
		bone287.cubeList.add(new ModelBox(bone287, 77, 23, -3.3357F, 1.6747F, -1.2479F, 1, 1, 6, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-2.0F, -26.6F, -20.0F);
		receiver_lower.addChild(bone8);
		setRotationAngle(bone8, -0.2182F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 25, 43, -1.75F, -1.9202F, -0.2464F, 4, 1, 3, 0.001F, false));
		bone8.cubeList.add(new ModelBox(bone8, 84, 85, 1.75F, -1.9202F, -0.2464F, 1, 1, 3, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.5F, -1.4872F, 1.8042F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.7854F);
		bone9.cubeList.add(new ModelBox(bone9, 85, 37, -1.1294F, -0.483F, -2.0507F, 1, 1, 3, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 11, 85, -3.3114F, 1.699F, -2.0507F, 1, 1, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -27.0F, -9.5F);
		receiver_lower.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 82, 11, -1.0F, -0.435F, -1.885F, 2, 1, 3, 0.0F, false));

		bone290 = new ModelRenderer(this);
		bone290.setRotationPoint(-1.5F, -27.685F, -10.385F);
		receiver_lower.addChild(bone290);
		setRotationAngle(bone290, -0.829F, 0.0F, 0.0F);
		bone290.cubeList.add(new ModelBox(bone290, 100, 9, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.001F, false));

		bone291 = new ModelRenderer(this);
		bone291.setRotationPoint(-1.5F, -27.685F, -2.635F);
		receiver_lower.addChild(bone291);
		setRotationAngle(bone291, -2.3998F, 0.0F, 0.0F);
		bone291.cubeList.add(new ModelBox(bone291, 100, 6, -1.0F, -0.5F, -1.0F, 2, 1, 2, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -27.0F, -3.5F);
		receiver_lower.addChild(bone4);
		setRotationAngle(bone4, 0.1745F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 59, 65, -1.0F, -0.435F, -1.115F, 2, 1, 3, 0.0F, false));

		bone272 = new ModelRenderer(this);
		bone272.setRotationPoint(-4.5F, -38.1564F, 0.2727F);
		receiver_lower.addChild(bone272);
		

		bone275_r2 = new ModelRenderer(this);
		bone275_r2.setRotationPoint(0.0F, 0.6564F, 5.7273F);
		bone272.addChild(bone275_r2);
		setRotationAngle(bone275_r2, -0.3927F, 0.0F, 0.0F);
		

		bone274_r2 = new ModelRenderer(this);
		bone274_r2.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone272.addChild(bone274_r2);
		setRotationAngle(bone274_r2, -0.7854F, 0.0F, 0.0F);
		

		bone273_r2 = new ModelRenderer(this);
		bone273_r2.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone272.addChild(bone273_r2);
		setRotationAngle(bone273_r2, -1.0036F, 0.0F, 0.0F);
		

		bone275_r1 = new ModelRenderer(this);
		bone275_r1.setRotationPoint(0.0F, 0.6564F, 5.7273F);
		bone272.addChild(bone275_r1);
		setRotationAngle(bone275_r1, -0.3927F, 0.0F, 0.0F);
		

		bone274_r1 = new ModelRenderer(this);
		bone274_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone272.addChild(bone274_r1);
		setRotationAngle(bone274_r1, -0.7854F, 0.0F, 0.0F);
		

		bone273_r1 = new ModelRenderer(this);
		bone273_r1.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone272.addChild(bone273_r1);
		setRotationAngle(bone273_r1, -1.0036F, 0.0F, 0.0F);
		

		bone273 = new ModelRenderer(this);
		bone273.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone272.addChild(bone273);
		setRotationAngle(bone273, -1.0036F, 0.0F, 0.0F);
		

		bone274 = new ModelRenderer(this);
		bone274.setRotationPoint(0.0F, 0.0F, 5.0F);
		bone272.addChild(bone274);
		setRotationAngle(bone274, -0.7854F, 0.0F, 0.0F);
		

		bone275 = new ModelRenderer(this);
		bone275.setRotationPoint(0.0F, 0.6564F, 5.7273F);
		bone272.addChild(bone275);
		setRotationAngle(bone275, -0.3927F, 0.0F, 0.0F);
		

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0F, -0.25F, 6.0F);
		receiver_lower.addChild(trigger);
		

		bone293 = new ModelRenderer(this);
		bone293.setRotationPoint(-1.5F, -31.5F, -11.5F);
		trigger.addChild(bone293);
		setRotationAngle(bone293, -0.0436F, 0.0F, 0.0F);
		bone293.cubeList.add(new ModelBox(bone293, 78, 74, -0.5F, -0.6805F, -0.1288F, 1, 3, 1, 0.0F, false));

		bone294 = new ModelRenderer(this);
		bone294.setRotationPoint(-1.5F, -31.5F, -11.5F);
		trigger.addChild(bone294);
		setRotationAngle(bone294, -0.2182F, 0.0F, 0.0F);
		bone294.cubeList.add(new ModelBox(bone294, 71, 120, -0.5F, 2.133F, 0.2607F, 1, 1, 1, -0.001F, false));

		side_things = new ModelRenderer(this);
		side_things.setRotationPoint(0.0F, 0.0F, 6.0F);
		receiver_lower.addChild(side_things);
		

		side_things_r2 = new ModelRenderer(this);
		side_things_r2.setRotationPoint(1.25F, -36.9F, -16.95F);
		side_things.addChild(side_things_r2);
		setRotationAngle(side_things_r2, 0.0F, 0.0F, 0.1396F);
		side_things_r2.cubeList.add(new ModelBox(side_things_r2, 121, 120, -1.0F, 1.0F, -1.0F, 1, 1, 2, 0.0F, false));

		side_things_r3 = new ModelRenderer(this);
		side_things_r3.setRotationPoint(1.25F, -36.95F, -16.5F);
		side_things.addChild(side_things_r3);
		setRotationAngle(side_things_r3, 0.0F, 0.0F, 0.1745F);
		side_things_r3.cubeList.add(new ModelBox(side_things_r3, 89, 97, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		receiver_upper = new ModelRenderer(this);
		receiver_upper.setRotationPoint(0.0F, 0.0F, 0.5F);
		gun.addChild(receiver_upper);
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 146, 122, 0.0F, -39.25F, -14.5F, 1, 2, 16, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 29, 33, 0.0F, -39.25F, -25.5F, 1, 2, 8, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 67, 120, 0.001F, -42.0F, -26.5F, 1, 3, 12, 0.001F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 100, 0, -4.0F, -39.25F, -16.5F, 1, 2, 18, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 89, 5, -3.999F, -42.0F, -26.5F, 1, 3, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 35, 104, -4.0F, -39.25F, -26.5F, 1, 2, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 39, 87, -3.999F, -42.0F, -16.5F, 1, 3, 2, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 142, -0.599F, -42.0F, -14.5F, 1, 3, 16, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 94, 141, -3.399F, -42.0F, -14.5F, 1, 3, 16, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 121, 101, -2.5F, -39.25F, 1.95F, 2, 2, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 75, 0, -2.0F, -42.0F, 1.95F, 1, 3, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 52, 0, -4.0F, -38.25F, -24.5F, 1, 1, 8, 0.002F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 49, 50, -3.5F, -42.05F, -24.5F, 1, 1, 8, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 62, 0, -3.5F, -41.05F, -24.5F, 1, 3, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 59, 50, -3.5F, -41.05F, -17.5F, 1, 3, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 0, 50, -2.499F, -44.1F, -46.5F, 2, 2, 45, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 72, 66, -2.499F, -43.1F, -2.5F, 2, 1, 4, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 49, 59, -3.5F, -38.5F, -25.5F, 1, 4, 1, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 99, 67, 0.001F, -42.0F, -46.5F, 1, 1, 21, 0.0F, false));
		receiver_upper.cubeList.add(new ModelBox(receiver_upper, 98, 117, -3.999F, -42.0F, -46.5F, 1, 1, 21, 0.0F, false));

		receiver_upper_r15 = new ModelRenderer(this);
		receiver_upper_r15.setRotationPoint(-2.499F, -43.1F, 1.5F);
		receiver_upper.addChild(receiver_upper_r15);
		setRotationAngle(receiver_upper_r15, -0.5411F, 0.0F, -0.384F);
		receiver_upper_r15.cubeList.add(new ModelBox(receiver_upper_r15, 90, 114, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r16 = new ModelRenderer(this);
		receiver_upper_r16.setRotationPoint(-0.499F, -43.1F, 1.5F);
		receiver_upper.addChild(receiver_upper_r16);
		setRotationAngle(receiver_upper_r16, -0.5411F, 0.0F, 0.384F);
		receiver_upper_r16.cubeList.add(new ModelBox(receiver_upper_r16, 114, 95, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r17 = new ModelRenderer(this);
		receiver_upper_r17.setRotationPoint(-0.499F, -43.1F, 1.5F);
		receiver_upper.addChild(receiver_upper_r17);
		setRotationAngle(receiver_upper_r17, -0.5411F, 0.0F, 0.0F);
		receiver_upper_r17.cubeList.add(new ModelBox(receiver_upper_r17, 104, 20, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r18 = new ModelRenderer(this);
		receiver_upper_r18.setRotationPoint(-4.0F, -38.25F, -23.5F);
		receiver_upper.addChild(receiver_upper_r18);
		setRotationAngle(receiver_upper_r18, 0.3491F, 0.0F, 0.0F);
		receiver_upper_r18.cubeList.add(new ModelBox(receiver_upper_r18, 49, 65, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.001F, false));

		receiver_upper_r19 = new ModelRenderer(this);
		receiver_upper_r19.setRotationPoint(-4.0F, -38.25F, -17.5F);
		receiver_upper.addChild(receiver_upper_r19);
		setRotationAngle(receiver_upper_r19, -0.3491F, 0.0F, 0.0F);
		receiver_upper_r19.cubeList.add(new ModelBox(receiver_upper_r19, 65, 50, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		receiver_upper_r20 = new ModelRenderer(this);
		receiver_upper_r20.setRotationPoint(0.401F, -39.0F, 1.5F);
		receiver_upper.addChild(receiver_upper_r20);
		setRotationAngle(receiver_upper_r20, 0.0F, -0.7854F, 0.0F);
		receiver_upper_r20.cubeList.add(new ModelBox(receiver_upper_r20, 77, 23, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		receiver_upper_r21 = new ModelRenderer(this);
		receiver_upper_r21.setRotationPoint(-3.399F, -39.0F, 1.5F);
		receiver_upper.addChild(receiver_upper_r21);
		setRotationAngle(receiver_upper_r21, 0.0F, 0.7854F, 0.0F);
		receiver_upper_r21.cubeList.add(new ModelBox(receiver_upper_r21, 77, 30, 0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		receiver_upper_r22 = new ModelRenderer(this);
		receiver_upper_r22.setRotationPoint(-4.0F, -39.25F, 1.5F);
		receiver_upper.addChild(receiver_upper_r22);
		setRotationAngle(receiver_upper_r22, 0.5585F, 0.5585F, 0.8378F);
		receiver_upper_r22.cubeList.add(new ModelBox(receiver_upper_r22, 121, 104, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r23 = new ModelRenderer(this);
		receiver_upper_r23.setRotationPoint(1.0F, -39.25F, 1.5F);
		receiver_upper.addChild(receiver_upper_r23);
		setRotationAngle(receiver_upper_r23, 0.5585F, -0.5585F, -0.8378F);
		receiver_upper_r23.cubeList.add(new ModelBox(receiver_upper_r23, 121, 107, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r24 = new ModelRenderer(this);
		receiver_upper_r24.setRotationPoint(-4.0F, -37.25F, 1.5F);
		receiver_upper.addChild(receiver_upper_r24);
		setRotationAngle(receiver_upper_r24, 0.0F, 0.7854F, 0.0F);
		receiver_upper_r24.cubeList.add(new ModelBox(receiver_upper_r24, 29, 104, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver_upper_r25 = new ModelRenderer(this);
		receiver_upper_r25.setRotationPoint(1.0F, -37.25F, 1.5F);
		receiver_upper.addChild(receiver_upper_r25);
		setRotationAngle(receiver_upper_r25, 0.0F, -0.7854F, 0.0F);
		receiver_upper_r25.cubeList.add(new ModelBox(receiver_upper_r25, 104, 30, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		receiver_upper_r26 = new ModelRenderer(this);
		receiver_upper_r26.setRotationPoint(-4.0F, -41.55F, -13.8F);
		receiver_upper.addChild(receiver_upper_r26);
		setRotationAngle(receiver_upper_r26, -0.8029F, -0.3142F, 0.3316F);
		receiver_upper_r26.cubeList.add(new ModelBox(receiver_upper_r26, 108, 117, -0.001F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r27 = new ModelRenderer(this);
		receiver_upper_r27.setRotationPoint(1.0F, -41.55F, -13.8F);
		receiver_upper.addChild(receiver_upper_r27);
		setRotationAngle(receiver_upper_r27, -0.8029F, 0.3142F, -0.3316F);
		receiver_upper_r27.cubeList.add(new ModelBox(receiver_upper_r27, 114, 117, -1.001F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r28 = new ModelRenderer(this);
		receiver_upper_r28.setRotationPoint(-4.0F, -39.95F, -14.5F);
		receiver_upper.addChild(receiver_upper_r28);
		setRotationAngle(receiver_upper_r28, -0.5236F, -0.6109F, -0.7854F);
		receiver_upper_r28.cubeList.add(new ModelBox(receiver_upper_r28, 99, 90, -0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		receiver_upper_r29 = new ModelRenderer(this);
		receiver_upper_r29.setRotationPoint(1.0F, -39.95F, -14.5F);
		receiver_upper.addChild(receiver_upper_r29);
		setRotationAngle(receiver_upper_r29, -0.5236F, 0.6109F, 0.7854F);
		receiver_upper_r29.cubeList.add(new ModelBox(receiver_upper_r29, 100, 0, -2.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		receiver_upper_r30 = new ModelRenderer(this);
		receiver_upper_r30.setRotationPoint(-3.999F, -39.0F, -14.5F);
		receiver_upper.addChild(receiver_upper_r30);
		setRotationAngle(receiver_upper_r30, 0.0F, -0.7854F, 0.0F);
		receiver_upper_r30.cubeList.add(new ModelBox(receiver_upper_r30, 75, 10, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		receiver_upper_r31 = new ModelRenderer(this);
		receiver_upper_r31.setRotationPoint(1.001F, -39.0F, -14.5F);
		receiver_upper.addChild(receiver_upper_r31);
		setRotationAngle(receiver_upper_r31, 0.0F, -0.7854F, 0.0F);
		receiver_upper_r31.cubeList.add(new ModelBox(receiver_upper_r31, 77, 37, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		receiver_upper_r32 = new ModelRenderer(this);
		receiver_upper_r32.setRotationPoint(-3.0F, -42.25F, -14.5F);
		receiver_upper.addChild(receiver_upper_r32);
		setRotationAngle(receiver_upper_r32, -0.7854F, 0.0F, 0.0F);
		receiver_upper_r32.cubeList.add(new ModelBox(receiver_upper_r32, 119, 35, -1.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		receiver_upper_r32.cubeList.add(new ModelBox(receiver_upper_r32, 115, 119, 2.999F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r33 = new ModelRenderer(this);
		receiver_upper_r33.setRotationPoint(-3.0F, -39.95F, -14.5F);
		receiver_upper.addChild(receiver_upper_r33);
		setRotationAngle(receiver_upper_r33, -0.7854F, 0.0F, 0.0F);
		receiver_upper_r33.cubeList.add(new ModelBox(receiver_upper_r33, 121, 110, -1.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r33.cubeList.add(new ModelBox(receiver_upper_r33, 121, 113, 2.999F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		receiver_upper_r34 = new ModelRenderer(this);
		receiver_upper_r34.setRotationPoint(-4.0F, -39.25F, -13.5F);
		receiver_upper.addChild(receiver_upper_r34);
		setRotationAngle(receiver_upper_r34, 0.0F, 0.0F, -0.7854F);
		receiver_upper_r34.cubeList.add(new ModelBox(receiver_upper_r34, 94, 160, 0.0F, 0.0F, -1.0F, 1, 1, 16, 0.0F, false));

		receiver_upper_r35 = new ModelRenderer(this);
		receiver_upper_r35.setRotationPoint(-4.0F, -41.95F, -13.5F);
		receiver_upper.addChild(receiver_upper_r35);
		setRotationAngle(receiver_upper_r35, 0.0F, 0.0F, -0.7854F);
		receiver_upper_r35.cubeList.add(new ModelBox(receiver_upper_r35, 0, 161, 0.0F, 0.0F, -1.0F, 1, 1, 16, 0.0F, false));

		receiver_upper_r36 = new ModelRenderer(this);
		receiver_upper_r36.setRotationPoint(1.0F, -41.95F, -13.5F);
		receiver_upper.addChild(receiver_upper_r36);
		setRotationAngle(receiver_upper_r36, 0.0F, 0.0F, 0.7854F);
		receiver_upper_r36.cubeList.add(new ModelBox(receiver_upper_r36, 167, 154, -1.0F, 0.0F, -1.0F, 1, 1, 16, 0.0F, false));

		receiver_upper_r37 = new ModelRenderer(this);
		receiver_upper_r37.setRotationPoint(1.0F, -39.25F, -13.5F);
		receiver_upper.addChild(receiver_upper_r37);
		setRotationAngle(receiver_upper_r37, 0.0F, 0.0F, 0.7854F);
		receiver_upper_r37.cubeList.add(new ModelBox(receiver_upper_r37, 180, 22, -1.0F, 0.0F, -1.0F, 1, 1, 16, 0.0F, false));

		receiver_upper_r38 = new ModelRenderer(this);
		receiver_upper_r38.setRotationPoint(-3.17F, -42.84F, -42.0F);
		receiver_upper.addChild(receiver_upper_r38);
		setRotationAngle(receiver_upper_r38, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r38.cubeList.add(new ModelBox(receiver_upper_r38, 32, 74, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r39 = new ModelRenderer(this);
		receiver_upper_r39.setRotationPoint(-3.17F, -42.84F, -38.0F);
		receiver_upper.addChild(receiver_upper_r39);
		setRotationAngle(receiver_upper_r39, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r39.cubeList.add(new ModelBox(receiver_upper_r39, 49, 91, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r40 = new ModelRenderer(this);
		receiver_upper_r40.setRotationPoint(-3.17F, -42.84F, -34.0F);
		receiver_upper.addChild(receiver_upper_r40);
		setRotationAngle(receiver_upper_r40, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r40.cubeList.add(new ModelBox(receiver_upper_r40, 78, 91, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r41 = new ModelRenderer(this);
		receiver_upper_r41.setRotationPoint(-3.17F, -42.84F, -44.0F);
		receiver_upper.addChild(receiver_upper_r41);
		setRotationAngle(receiver_upper_r41, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r41.cubeList.add(new ModelBox(receiver_upper_r41, 66, 18, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r42 = new ModelRenderer(this);
		receiver_upper_r42.setRotationPoint(-3.17F, -42.84F, -40.0F);
		receiver_upper.addChild(receiver_upper_r42);
		setRotationAngle(receiver_upper_r42, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r42.cubeList.add(new ModelBox(receiver_upper_r42, 63, 69, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r43 = new ModelRenderer(this);
		receiver_upper_r43.setRotationPoint(-3.17F, -42.84F, -36.0F);
		receiver_upper.addChild(receiver_upper_r43);
		setRotationAngle(receiver_upper_r43, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r43.cubeList.add(new ModelBox(receiver_upper_r43, 82, 50, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r44 = new ModelRenderer(this);
		receiver_upper_r44.setRotationPoint(-3.17F, -42.84F, -32.0F);
		receiver_upper.addChild(receiver_upper_r44);
		setRotationAngle(receiver_upper_r44, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r44.cubeList.add(new ModelBox(receiver_upper_r44, 31, 97, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r45 = new ModelRenderer(this);
		receiver_upper_r45.setRotationPoint(0.13F, -42.85F, -42.0F);
		receiver_upper.addChild(receiver_upper_r45);
		setRotationAngle(receiver_upper_r45, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r45.cubeList.add(new ModelBox(receiver_upper_r45, 77, 109, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r46 = new ModelRenderer(this);
		receiver_upper_r46.setRotationPoint(0.13F, -42.85F, -38.0F);
		receiver_upper.addChild(receiver_upper_r46);
		setRotationAngle(receiver_upper_r46, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r46.cubeList.add(new ModelBox(receiver_upper_r46, 31, 111, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r47 = new ModelRenderer(this);
		receiver_upper_r47.setRotationPoint(0.13F, -42.85F, -34.0F);
		receiver_upper.addChild(receiver_upper_r47);
		setRotationAngle(receiver_upper_r47, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r47.cubeList.add(new ModelBox(receiver_upper_r47, 111, 74, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r48 = new ModelRenderer(this);
		receiver_upper_r48.setRotationPoint(0.13F, -42.85F, -44.0F);
		receiver_upper.addChild(receiver_upper_r48);
		setRotationAngle(receiver_upper_r48, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r48.cubeList.add(new ModelBox(receiver_upper_r48, 90, 108, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r49 = new ModelRenderer(this);
		receiver_upper_r49.setRotationPoint(0.13F, -42.85F, -40.0F);
		receiver_upper.addChild(receiver_upper_r49);
		setRotationAngle(receiver_upper_r49, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r49.cubeList.add(new ModelBox(receiver_upper_r49, 52, 109, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r50 = new ModelRenderer(this);
		receiver_upper_r50.setRotationPoint(0.13F, -42.85F, -36.0F);
		receiver_upper.addChild(receiver_upper_r50);
		setRotationAngle(receiver_upper_r50, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r50.cubeList.add(new ModelBox(receiver_upper_r50, 83, 109, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r51 = new ModelRenderer(this);
		receiver_upper_r51.setRotationPoint(0.13F, -42.85F, -32.0F);
		receiver_upper.addChild(receiver_upper_r51);
		setRotationAngle(receiver_upper_r51, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r51.cubeList.add(new ModelBox(receiver_upper_r51, 112, 20, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r52 = new ModelRenderer(this);
		receiver_upper_r52.setRotationPoint(0.13F, -42.85F, -30.0F);
		receiver_upper.addChild(receiver_upper_r52);
		setRotationAngle(receiver_upper_r52, 0.0F, 0.4014F, 0.2967F);
		receiver_upper_r52.cubeList.add(new ModelBox(receiver_upper_r52, 112, 23, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r53 = new ModelRenderer(this);
		receiver_upper_r53.setRotationPoint(-3.17F, -42.84F, -30.0F);
		receiver_upper.addChild(receiver_upper_r53);
		setRotationAngle(receiver_upper_r53, 0.0F, -0.4014F, -0.2967F);
		receiver_upper_r53.cubeList.add(new ModelBox(receiver_upper_r53, 37, 101, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		receiver_upper_r54 = new ModelRenderer(this);
		receiver_upper_r54.setRotationPoint(-3.37F, -42.78F, -41.5F);
		receiver_upper.addChild(receiver_upper_r54);
		setRotationAngle(receiver_upper_r54, 0.0F, 0.0F, -0.2967F);
		receiver_upper_r54.cubeList.add(new ModelBox(receiver_upper_r54, 62, 23, 0.0F, 0.0F, -5.0F, 1, 1, 3, 0.0F, false));
		receiver_upper_r54.cubeList.add(new ModelBox(receiver_upper_r54, 14, 115, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r54.cubeList.add(new ModelBox(receiver_upper_r54, 48, 115, 0.0F, 0.0F, 4.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r54.cubeList.add(new ModelBox(receiver_upper_r54, 60, 115, 0.0F, 0.0F, 8.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r54.cubeList.add(new ModelBox(receiver_upper_r54, 134, 141, 0.0F, 0.0F, 12.0F, 1, 1, 31, 0.0F, false));

		receiver_upper_r55 = new ModelRenderer(this);
		receiver_upper_r55.setRotationPoint(-3.84F, -42.2F, -42.5F);
		receiver_upper.addChild(receiver_upper_r55);
		setRotationAngle(receiver_upper_r55, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r55.cubeList.add(new ModelBox(receiver_upper_r55, 58, 112, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r56 = new ModelRenderer(this);
		receiver_upper_r56.setRotationPoint(-3.84F, -42.2F, -38.5F);
		receiver_upper.addChild(receiver_upper_r56);
		setRotationAngle(receiver_upper_r56, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r56.cubeList.add(new ModelBox(receiver_upper_r56, 83, 112, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r57 = new ModelRenderer(this);
		receiver_upper_r57.setRotationPoint(-3.84F, -42.2F, -34.5F);
		receiver_upper.addChild(receiver_upper_r57);
		setRotationAngle(receiver_upper_r57, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r57.cubeList.add(new ModelBox(receiver_upper_r57, 4, 113, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r58 = new ModelRenderer(this);
		receiver_upper_r58.setRotationPoint(-3.84F, -42.2F, -44.5F);
		receiver_upper.addChild(receiver_upper_r58);
		setRotationAngle(receiver_upper_r58, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r58.cubeList.add(new ModelBox(receiver_upper_r58, 112, 31, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r59 = new ModelRenderer(this);
		receiver_upper_r59.setRotationPoint(-3.84F, -42.2F, -40.5F);
		receiver_upper.addChild(receiver_upper_r59);
		setRotationAngle(receiver_upper_r59, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r59.cubeList.add(new ModelBox(receiver_upper_r59, 52, 112, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r60 = new ModelRenderer(this);
		receiver_upper_r60.setRotationPoint(-3.84F, -42.2F, -36.5F);
		receiver_upper.addChild(receiver_upper_r60);
		setRotationAngle(receiver_upper_r60, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r60.cubeList.add(new ModelBox(receiver_upper_r60, 77, 112, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r61 = new ModelRenderer(this);
		receiver_upper_r61.setRotationPoint(-3.84F, -42.2F, -32.5F);
		receiver_upper.addChild(receiver_upper_r61);
		setRotationAngle(receiver_upper_r61, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r61.cubeList.add(new ModelBox(receiver_upper_r61, 113, 34, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r62 = new ModelRenderer(this);
		receiver_upper_r62.setRotationPoint(0.84F, -42.2F, -42.5F);
		receiver_upper.addChild(receiver_upper_r62);
		setRotationAngle(receiver_upper_r62, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r62.cubeList.add(new ModelBox(receiver_upper_r62, 109, 67, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r63 = new ModelRenderer(this);
		receiver_upper_r63.setRotationPoint(0.84F, -42.2F, -38.5F);
		receiver_upper.addChild(receiver_upper_r63);
		setRotationAngle(receiver_upper_r63, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r63.cubeList.add(new ModelBox(receiver_upper_r63, 110, 35, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r64 = new ModelRenderer(this);
		receiver_upper_r64.setRotationPoint(0.84F, -42.2F, -34.5F);
		receiver_upper.addChild(receiver_upper_r64);
		setRotationAngle(receiver_upper_r64, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r64.cubeList.add(new ModelBox(receiver_upper_r64, 65, 111, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r65 = new ModelRenderer(this);
		receiver_upper_r65.setRotationPoint(0.84F, -42.2F, -44.5F);
		receiver_upper.addChild(receiver_upper_r65);
		setRotationAngle(receiver_upper_r65, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r65.cubeList.add(new ModelBox(receiver_upper_r65, 108, 95, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r66 = new ModelRenderer(this);
		receiver_upper_r66.setRotationPoint(0.84F, -42.2F, -40.5F);
		receiver_upper.addChild(receiver_upper_r66);
		setRotationAngle(receiver_upper_r66, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r66.cubeList.add(new ModelBox(receiver_upper_r66, 58, 109, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r67 = new ModelRenderer(this);
		receiver_upper_r67.setRotationPoint(0.84F, -42.2F, -36.5F);
		receiver_upper.addChild(receiver_upper_r67);
		setRotationAngle(receiver_upper_r67, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r67.cubeList.add(new ModelBox(receiver_upper_r67, 4, 110, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r68 = new ModelRenderer(this);
		receiver_upper_r68.setRotationPoint(0.84F, -42.2F, -32.5F);
		receiver_upper.addChild(receiver_upper_r68);
		setRotationAngle(receiver_upper_r68, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r68.cubeList.add(new ModelBox(receiver_upper_r68, 90, 111, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r69 = new ModelRenderer(this);
		receiver_upper_r69.setRotationPoint(0.84F, -42.2F, -30.5F);
		receiver_upper.addChild(receiver_upper_r69);
		setRotationAngle(receiver_upper_r69, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r69.cubeList.add(new ModelBox(receiver_upper_r69, 112, 27, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r70 = new ModelRenderer(this);
		receiver_upper_r70.setRotationPoint(-3.84F, -42.2F, -30.5F);
		receiver_upper.addChild(receiver_upper_r70);
		setRotationAngle(receiver_upper_r70, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r70.cubeList.add(new ModelBox(receiver_upper_r70, 114, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r71 = new ModelRenderer(this);
		receiver_upper_r71.setRotationPoint(-3.999F, -42.0F, -41.5F);
		receiver_upper.addChild(receiver_upper_r71);
		setRotationAngle(receiver_upper_r71, 0.0F, 0.0F, -0.8901F);
		receiver_upper_r71.cubeList.add(new ModelBox(receiver_upper_r71, 52, 36, 0.0F, 0.0F, -5.0F, 1, 1, 3, 0.0F, false));
		receiver_upper_r71.cubeList.add(new ModelBox(receiver_upper_r71, 114, 85, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r71.cubeList.add(new ModelBox(receiver_upper_r71, 37, 115, 0.0F, 0.0F, 4.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r71.cubeList.add(new ModelBox(receiver_upper_r71, 54, 115, 0.0F, 0.0F, 8.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r71.cubeList.add(new ModelBox(receiver_upper_r71, 145, 40, 0.0F, 0.0F, 12.0F, 1, 1, 31, 0.0F, false));

		receiver_upper_r72 = new ModelRenderer(this);
		receiver_upper_r72.setRotationPoint(0.37F, -42.78F, -37.5F);
		receiver_upper.addChild(receiver_upper_r72);
		setRotationAngle(receiver_upper_r72, 0.0F, 0.0F, 0.2967F);
		receiver_upper_r72.cubeList.add(new ModelBox(receiver_upper_r72, 52, 32, -1.0F, 0.0F, -9.0F, 1, 1, 3, 0.0F, false));
		receiver_upper_r72.cubeList.add(new ModelBox(receiver_upper_r72, 106, 113, -1.0F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r72.cubeList.add(new ModelBox(receiver_upper_r72, 27, 114, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r72.cubeList.add(new ModelBox(receiver_upper_r72, 114, 82, -1.0F, 0.0F, 4.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r72.cubeList.add(new ModelBox(receiver_upper_r72, 146, 90, -1.0F, 0.0F, 8.0F, 1, 1, 31, 0.0F, false));

		receiver_upper_r73 = new ModelRenderer(this);
		receiver_upper_r73.setRotationPoint(1.001F, -42.0F, -37.5F);
		receiver_upper.addChild(receiver_upper_r73);
		setRotationAngle(receiver_upper_r73, 0.0F, 0.0F, 0.8901F);
		receiver_upper_r73.cubeList.add(new ModelBox(receiver_upper_r73, 52, 27, -1.0F, 0.0F, -9.0F, 1, 1, 3, 0.0F, false));
		receiver_upper_r73.cubeList.add(new ModelBox(receiver_upper_r73, 98, 113, -1.0F, 0.0F, -4.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r73.cubeList.add(new ModelBox(receiver_upper_r73, 10, 114, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r73.cubeList.add(new ModelBox(receiver_upper_r73, 33, 114, -1.0F, 0.0F, 4.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r73.cubeList.add(new ModelBox(receiver_upper_r73, 167, 122, -1.0F, 0.0F, 8.0F, 1, 1, 31, 0.0F, false));

		action_flap = new ModelRenderer(this);
		action_flap.setRotationPoint(-4.75F, -35.75F, -23.25F);
		receiver_upper.addChild(action_flap);
		setRotationAngle(action_flap, 3.1416F, 0.0F, 0.3054F);
		action_flap.cubeList.add(new ModelBox(action_flap, 89, 85, -0.4251F, 0.2333F, -3.25F, 1, 2, 1, 0.0F, false));
		action_flap.cubeList.add(new ModelBox(action_flap, 70, 74, -0.2395F, -0.0228F, -5.75F, 1, 3, 6, 0.0F, false));

		stock = new QRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 85, 30, -3.0F, -42.0F, 4.5F, 3, 4, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 72, 65, -0.25F, -41.75F, 5.0F, 1, 4, 1, 0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 133, 74, -0.25F, -37.05F, 5.0F, 1, 1, 1, 0.2F, false));
		stock.cubeList.add(new ModelBox(stock, 27, 11, -0.25F, -41.75F, 5.0F, 1, 5, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 40, 167, -2.5F, -41.75F, 5.5F, 2, 1, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 145, 59, -2.5F, -39.5F, 5.5F, 2, 1, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 66, 167, -2.0F, -41.25F, 5.5F, 1, 2, 11, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 40, 142, -3.5F, -42.25F, 16.5F, 4, 4, 21, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 178, 195, -2.5F, -43.25F, 16.5F, 2, 1, 21, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 72, 50, -3.5F, -38.25F, 35.5F, 4, 13, 2, 0.002F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 74, -3.0F, -42.75F, 37.0F, 3, 17, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 78, 74, -3.0F, -37.1036F, 24.7322F, 3, 2, 4, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 23, 97, -2.5F, -37.3536F, 22.4822F, 2, 2, 4, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 122, 60, -2.25F, -39.0F, 4.25F, 2, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 64, 97, -2.75F, -39.0F, 4.25F, 1, 2, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 25, 0, -3.0F, -42.5F, 2.5F, 3, 6, 2, 0.001F, false));
		stock.cubeList.add(new ModelBox(stock, 36, 43, -3.5F, -42.25F, 2.5F, 4, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 37, 7, -3.5F, -39.5F, 2.5F, 4, 2, 1, 0.0F, false));

		bone312_r2 = new ModelRenderer(this);
		bone312_r2.setRotationPoint(0.0F, -17.1563F, 20.9688F);
		stock.addChild(bone312_r2);
		setRotationAngle(bone312_r2, 0.0F, -0.1309F, 0.0F);
		

		bone308_r2 = new ModelRenderer(this);
		bone308_r2.setRotationPoint(0.0F, -17.1563F, 20.9688F);
		stock.addChild(bone308_r2);
		setRotationAngle(bone308_r2, 0.0F, 0.1309F, 0.0F);
		

		bone303_r2 = new ModelRenderer(this);
		bone303_r2.setRotationPoint(-1.0F, -34.75F, 24.5F);
		stock.addChild(bone303_r2);
		setRotationAngle(bone303_r2, 0.7854F, 0.0F, 0.0F);
		

		bone301_r2 = new ModelRenderer(this);
		bone301_r2.setRotationPoint(-1.5F, -34.75F, 26.5F);
		stock.addChild(bone301_r2);
		setRotationAngle(bone301_r2, 0.7854F, 0.0F, 0.0F);
		

		bone302_r2 = new ModelRenderer(this);
		bone302_r2.setRotationPoint(-1.0F, -33.75F, 25.5F);
		stock.addChild(bone302_r2);
		setRotationAngle(bone302_r2, 0.7854F, 0.0F, 0.0F);
		

		bone300_r2 = new ModelRenderer(this);
		bone300_r2.setRotationPoint(-1.5F, -34.75F, 30.5F);
		stock.addChild(bone300_r2);
		setRotationAngle(bone300_r2, 0.7854F, 0.0F, 0.0F);
		

		bone316_r2 = new ModelRenderer(this);
		bone316_r2.setRotationPoint(-1.0F, -42.75F, 26.5F);
		stock.addChild(bone316_r2);
		setRotationAngle(bone316_r2, 0.0F, 0.0F, 0.7854F);
		

		bone312_r1 = new ModelRenderer(this);
		bone312_r1.setRotationPoint(0.0F, -17.1563F, 20.9688F);
		stock.addChild(bone312_r1);
		setRotationAngle(bone312_r1, 0.0F, -0.1309F, 0.0F);
		

		bone308_r1 = new ModelRenderer(this);
		bone308_r1.setRotationPoint(0.0F, -17.1563F, 20.9688F);
		stock.addChild(bone308_r1);
		setRotationAngle(bone308_r1, 0.0F, 0.1309F, 0.0F);
		

		bone303_r1 = new ModelRenderer(this);
		bone303_r1.setRotationPoint(-1.0F, -34.75F, 24.5F);
		stock.addChild(bone303_r1);
		setRotationAngle(bone303_r1, 0.7854F, 0.0F, 0.0F);
		

		bone301_r1 = new ModelRenderer(this);
		bone301_r1.setRotationPoint(-1.5F, -34.75F, 26.5F);
		stock.addChild(bone301_r1);
		setRotationAngle(bone301_r1, 0.7854F, 0.0F, 0.0F);
		

		bone302_r1 = new ModelRenderer(this);
		bone302_r1.setRotationPoint(-1.0F, -33.75F, 25.5F);
		stock.addChild(bone302_r1);
		setRotationAngle(bone302_r1, 0.7854F, 0.0F, 0.0F);
		

		bone300_r1 = new ModelRenderer(this);
		bone300_r1.setRotationPoint(-1.5F, -34.75F, 30.5F);
		stock.addChild(bone300_r1);
		setRotationAngle(bone300_r1, 0.7854F, 0.0F, 0.0F);
		

		bone316_r1 = new ModelRenderer(this);
		bone316_r1.setRotationPoint(-1.0F, -42.75F, 26.5F);
		stock.addChild(bone316_r1);
		setRotationAngle(bone316_r1, 0.0F, 0.0F, 0.7854F);
		

		bone316 = new ModelRenderer(this);
		bone316.setRotationPoint(-1.0F, -42.75F, 26.5F);
		stock.addChild(bone316);
		setRotationAngle(bone316, 0.0F, 0.0F, 0.7854F);
		bone316.cubeList.add(new ModelBox(bone316, 0, 203, 0.4142F, -0.7071F, -10.0F, 1, 1, 21, 0.0F, false));
		bone316.cubeList.add(new ModelBox(bone316, 96, 202, -1.4142F, 1.1213F, -10.0F, 1, 1, 21, 0.0F, false));
		bone316.cubeList.add(new ModelBox(bone316, 200, 116, -1.4142F, 0.7071F, -10.0F, 1, 1, 21, -0.001F, false));
		bone316.cubeList.add(new ModelBox(bone316, 142, 197, 0.0F, -0.7071F, -10.0F, 1, 1, 21, -0.001F, false));

		bone300 = new ModelRenderer(this);
		bone300.setRotationPoint(-1.5F, -34.75F, 30.5F);
		stock.addChild(bone300);
		setRotationAngle(bone300, 0.7854F, 0.0F, 0.0F);
		bone300.cubeList.add(new ModelBox(bone300, 25, 24, -1.5F, -6.5F, -1.0F, 3, 14, 3, 0.001F, false));
		bone300.cubeList.add(new ModelBox(bone300, 23, 58, -2.0003F, -3.9142F, 1.4749F, 4, 10, 2, -0.002F, false));
		bone300.cubeList.add(new ModelBox(bone300, 49, 83, -2.001F, -2.1517F, 3.0659F, 4, 6, 2, -0.002F, false));
		bone300.cubeList.add(new ModelBox(bone300, 80, 66, -2.0004F, 0.0806F, 4.8336F, 4, 2, 2, 0.0F, false));

		bone302 = new ModelRenderer(this);
		bone302.setRotationPoint(-1.0F, -33.75F, 25.5F);
		stock.addChild(bone302);
		setRotationAngle(bone302, 0.7854F, 0.0F, 0.0F);
		bone302.cubeList.add(new ModelBox(bone302, 63, 80, -1.0F, -1.5F, 1.0F, 1, 10, 1, 0.0F, false));

		bone301 = new ModelRenderer(this);
		bone301.setRotationPoint(-1.5F, -34.75F, 26.5F);
		stock.addChild(bone301);
		setRotationAngle(bone301, 0.7854F, 0.0F, 0.0F);
		bone301.cubeList.add(new ModelBox(bone301, 11, 24, -1.5F, -6.5F, -1.0F, 3, 5, 3, -0.001F, false));

		bone303 = new ModelRenderer(this);
		bone303.setRotationPoint(-1.0F, -34.75F, 24.5F);
		stock.addChild(bone303);
		setRotationAngle(bone303, 0.7854F, 0.0F, 0.0F);
		bone303.cubeList.add(new ModelBox(bone303, 12, 0, -1.5F, -6.8536F, -1.0F, 2, 5, 3, 0.0F, false));

		bone305 = new ModelRenderer(this);
		bone305.setRotationPoint(-0.75F, -39.0F, 4.25F);
		stock.addChild(bone305);
		bone305.cubeList.add(new ModelBox(bone305, 82, 0, -1.75F, 12.75F, 27.25F, 2, 1, 4, 0.0F, false));
		bone305.cubeList.add(new ModelBox(bone305, 85, 23, -2.25F, 8.75F, 29.25F, 3, 4, 2, 0.0F, false));

		bone307_r2 = new ModelRenderer(this);
		bone307_r2.setRotationPoint(-0.75F, 13.25F, 28.25F);
		bone305.addChild(bone307_r2);
		setRotationAngle(bone307_r2, -0.7854F, 0.0F, 0.0F);
		

		bone306_r2 = new ModelRenderer(this);
		bone306_r2.setRotationPoint(-0.75F, 10.0F, 26.25F);
		bone305.addChild(bone306_r2);
		setRotationAngle(bone306_r2, 1.309F, 0.0F, 0.0F);
		

		bone304_r2 = new ModelRenderer(this);
		bone304_r2.setRotationPoint(-0.75F, 10.0F, 28.75F);
		bone305.addChild(bone304_r2);
		setRotationAngle(bone304_r2, 0.6545F, 0.0F, 0.0F);
		

		bone307_r1 = new ModelRenderer(this);
		bone307_r1.setRotationPoint(-0.75F, 13.25F, 28.25F);
		bone305.addChild(bone307_r1);
		setRotationAngle(bone307_r1, -0.7854F, 0.0F, 0.0F);
		

		bone306_r1 = new ModelRenderer(this);
		bone306_r1.setRotationPoint(-0.75F, 10.0F, 26.25F);
		bone305.addChild(bone306_r1);
		setRotationAngle(bone306_r1, 1.309F, 0.0F, 0.0F);
		

		bone304_r1 = new ModelRenderer(this);
		bone304_r1.setRotationPoint(-0.75F, 10.0F, 28.75F);
		bone305.addChild(bone304_r1);
		setRotationAngle(bone304_r1, 0.6545F, 0.0F, 0.0F);
		

		bone304 = new ModelRenderer(this);
		bone304.setRotationPoint(-0.75F, 10.0F, 28.75F);
		bone305.addChild(bone304);
		setRotationAngle(bone304, 0.6545F, 0.0F, 0.0F);
		

		bone306 = new ModelRenderer(this);
		bone306.setRotationPoint(-0.75F, 10.0F, 26.25F);
		bone305.addChild(bone306);
		setRotationAngle(bone306, 1.309F, 0.0F, 0.0F);
		bone306.cubeList.add(new ModelBox(bone306, 104, 39, -1.0F, 0.1919F, -2.4286F, 2, 1, 1, 0.0F, false));

		bone307 = new ModelRenderer(this);
		bone307.setRotationPoint(-0.75F, 13.25F, 28.25F);
		bone305.addChild(bone307);
		setRotationAngle(bone307, -0.7854F, 0.0F, 0.0F);
		bone307.cubeList.add(new ModelBox(bone307, 100, 3, -1.0F, 0.0607F, -2.3536F, 2, 1, 2, 0.0F, false));

		bone308 = new ModelRenderer(this);
		bone308.setRotationPoint(0.0F, -17.1563F, 20.9688F);
		stock.addChild(bone308);
		setRotationAngle(bone308, 0.0F, 0.1309F, 0.0F);
		bone308.cubeList.add(new ModelBox(bone308, 99, 67, -2.401F, -9.0938F, 10.4722F, 1, 1, 4, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 99, 61, -2.401F, -10.0938F, 9.9722F, 1, 1, 4, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 64, 9, -2.401F, -11.0938F, 10.4722F, 1, 1, 3, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 122, 57, -2.401F, -12.0938F, 11.7222F, 1, 1, 2, 0.0F, false));
		bone308.cubeList.add(new ModelBox(bone308, 52, 9, -2.401F, -13.0938F, 12.4722F, 1, 4, 2, 0.001F, false));

		bone311_r2 = new ModelRenderer(this);
		bone311_r2.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone308.addChild(bone311_r2);
		setRotationAngle(bone311_r2, -0.7854F, 0.0F, 0.0F);
		

		bone310_r2 = new ModelRenderer(this);
		bone310_r2.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone308.addChild(bone310_r2);
		setRotationAngle(bone310_r2, 1.309F, 0.0F, 0.0F);
		

		bone309_r2 = new ModelRenderer(this);
		bone309_r2.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone308.addChild(bone309_r2);
		setRotationAngle(bone309_r2, 0.6545F, 0.0F, 0.0F);
		

		bone311_r1 = new ModelRenderer(this);
		bone311_r1.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone308.addChild(bone311_r1);
		setRotationAngle(bone311_r1, -0.7854F, 0.0F, 0.0F);
		

		bone310_r1 = new ModelRenderer(this);
		bone310_r1.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone308.addChild(bone310_r1);
		setRotationAngle(bone310_r1, 1.309F, 0.0F, 0.0F);
		

		bone309_r1 = new ModelRenderer(this);
		bone309_r1.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone308.addChild(bone309_r1);
		setRotationAngle(bone309_r1, 0.6545F, 0.0F, 0.0F);
		

		bone309 = new ModelRenderer(this);
		bone309.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone308.addChild(bone309);
		setRotationAngle(bone309, 0.6545F, 0.0F, 0.0F);
		bone309.cubeList.add(new ModelBox(bone309, 80, 80, -1.901F, -0.5359F, -3.0469F, 2, 1, 4, 0.002F, false));

		bone310 = new ModelRenderer(this);
		bone310.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone308.addChild(bone310);
		setRotationAngle(bone310, 1.309F, 0.0F, 0.0F);
		bone310.cubeList.add(new ModelBox(bone310, 52, 120, -0.901F, 0.1348F, -2.4439F, 1, 1, 1, -0.002F, false));

		bone311 = new ModelRenderer(this);
		bone311.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone308.addChild(bone311);
		setRotationAngle(bone311, -0.7854F, 0.0F, 0.0F);
		bone311.cubeList.add(new ModelBox(bone311, 122, 54, -0.901F, 0.1024F, -2.3953F, 1, 1, 2, -0.001F, false));

		bone317 = new ModelRenderer(this);
		bone317.setRotationPoint(-2.401F, -20.0938F, -5.5278F);
		bone308.addChild(bone317);
		

		bone312 = new ModelRenderer(this);
		bone312.setRotationPoint(0.0F, -17.1563F, 20.9688F);
		stock.addChild(bone312);
		setRotationAngle(bone312, 0.0F, -0.1309F, 0.0F);
		bone312.cubeList.add(new ModelBox(bone312, 99, 56, -1.5733F, -9.0938F, 10.8638F, 1, 1, 4, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 99, 51, -1.5733F, -10.0938F, 10.3638F, 1, 1, 4, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 62, 59, -1.5733F, -11.0938F, 10.8638F, 1, 1, 3, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 122, 51, -1.5733F, -12.0938F, 12.1138F, 1, 1, 2, 0.0F, false));
		bone312.cubeList.add(new ModelBox(bone312, 23, 50, -1.5733F, -13.0938F, 12.8638F, 1, 4, 2, 0.001F, false));

		bone315_r2 = new ModelRenderer(this);
		bone315_r2.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone312.addChild(bone315_r2);
		setRotationAngle(bone315_r2, -0.7854F, 0.0F, 0.0F);
		

		bone314_r2 = new ModelRenderer(this);
		bone314_r2.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone312.addChild(bone314_r2);
		setRotationAngle(bone314_r2, 1.309F, 0.0F, 0.0F);
		

		bone313_r2 = new ModelRenderer(this);
		bone313_r2.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone312.addChild(bone313_r2);
		setRotationAngle(bone313_r2, 0.6545F, 0.0F, 0.0F);
		

		bone315_r1 = new ModelRenderer(this);
		bone315_r1.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone312.addChild(bone315_r1);
		setRotationAngle(bone315_r1, -0.7854F, 0.0F, 0.0F);
		

		bone314_r1 = new ModelRenderer(this);
		bone314_r1.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone312.addChild(bone314_r1);
		setRotationAngle(bone314_r1, 1.309F, 0.0F, 0.0F);
		

		bone313_r1 = new ModelRenderer(this);
		bone313_r1.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone312.addChild(bone313_r1);
		setRotationAngle(bone313_r1, 0.6545F, 0.0F, 0.0F);
		

		bone313 = new ModelRenderer(this);
		bone313.setRotationPoint(-1.5F, -11.8438F, 12.0313F);
		bone312.addChild(bone313);
		setRotationAngle(bone313, 0.6545F, 0.0F, 0.0F);
		bone313.cubeList.add(new ModelBox(bone313, 77, 37, -0.0733F, -0.2976F, -2.7362F, 2, 1, 4, 0.002F, false));

		bone314 = new ModelRenderer(this);
		bone314.setRotationPoint(-1.5F, -11.8438F, 9.5313F);
		bone312.addChild(bone314);
		setRotationAngle(bone314, 1.309F, 0.0F, 0.0F);
		bone314.cubeList.add(new ModelBox(bone314, 31, 120, -0.0733F, 0.513F, -2.3426F, 1, 1, 1, -0.002F, false));

		bone315 = new ModelRenderer(this);
		bone315.setRotationPoint(-1.5F, -8.5938F, 11.5313F);
		bone312.addChild(bone315);
		setRotationAngle(bone315, -0.7854F, 0.0F, 0.0F);
		bone315.cubeList.add(new ModelBox(bone315, 122, 48, -0.0733F, -0.1745F, -2.1184F, 1, 1, 2, -0.001F, false));

		bone265 = new ModelRenderer(this);
		bone265.setRotationPoint(0.0F, -38.5F, 4.0F);
		stock.addChild(bone265);
		setRotationAngle(bone265, 0.0F, -0.2182F, 0.0F);
		bone265.cubeList.add(new ModelBox(bone265, 99, 51, -0.6201F, -1.0F, -0.5964F, 1, 2, 1, 0.0F, false));

		bone266 = new ModelRenderer(this);
		bone266.setRotationPoint(0.0F, -38.5F, 4.0F);
		stock.addChild(bone266);
		setRotationAngle(bone266, 0.0F, 0.2182F, 0.0F);
		bone266.cubeList.add(new ModelBox(bone266, 98, 95, -3.3088F, -1.0F, -1.2457F, 1, 2, 1, 0.0F, false));

		bone259 = new ModelRenderer(this);
		bone259.setRotationPoint(0.0F, -41.5F, 1.0F);
		stock.addChild(bone259);
		setRotationAngle(bone259, 0.0F, 0.0F, 0.3927F);
		bone259.cubeList.add(new ModelBox(bone259, 122, 63, -2.2372F, 2.0915F, 1.5F, 1, 1, 2, 0.0F, false));

		bone258 = new ModelRenderer(this);
		bone258.setRotationPoint(0.0F, -41.5F, 1.0F);
		stock.addChild(bone258);
		setRotationAngle(bone258, 0.0F, 0.0F, -0.3927F);
		bone258.cubeList.add(new ModelBox(bone258, 122, 67, -1.5344F, 0.9434F, 1.5F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
		stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
