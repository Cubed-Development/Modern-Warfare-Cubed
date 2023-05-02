package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MPXHandguardExtended extends ModelWithAttachments {
	private final QRenderer mpx_handguard3;
	private final ModelRenderer mpx_handguard_left_r49;
	private final ModelRenderer mpx_handguard_left_r50;
	private final ModelRenderer receiver_upper_r74;
	private final ModelRenderer receiver_upper_r75;
	private final ModelRenderer receiver_upper_r76;
	private final ModelRenderer receiver_upper_r77;
	private final ModelRenderer receiver_upper_r78;
	private final ModelRenderer receiver_upper_r79;
	private final ModelRenderer receiver_upper_r80;
	private final ModelRenderer receiver_upper_r81;
	private final ModelRenderer receiver_upper_r82;
	private final ModelRenderer receiver_upper_r83;
	private final ModelRenderer receiver_upper_r84;
	private final ModelRenderer receiver_upper_r85;
	private final ModelRenderer receiver_upper_r86;
	private final ModelRenderer receiver_upper_r87;
	private final ModelRenderer receiver_upper_r88;
	private final ModelRenderer receiver_upper_r89;
	private final ModelRenderer receiver_upper_r90;
	private final ModelRenderer receiver_upper_r91;
	private final ModelRenderer receiver_upper_r92;
	private final ModelRenderer receiver_upper_r93;
	private final ModelRenderer receiver_upper_r94;
	private final ModelRenderer receiver_upper_r95;
	private final ModelRenderer receiver_upper_r96;
	private final ModelRenderer receiver_upper_r97;
	private final ModelRenderer receiver_upper_r98;
	private final ModelRenderer receiver_upper_r99;
	private final ModelRenderer receiver_upper_r100;
	private final ModelRenderer receiver_upper_r101;
	private final ModelRenderer receiver_upper_r102;
	private final ModelRenderer receiver_upper_r103;
	private final ModelRenderer receiver_upper_r104;
	private final ModelRenderer receiver_upper_r105;
	private final ModelRenderer receiver_upper_r106;
	private final ModelRenderer receiver_upper_r107;
	private final ModelRenderer receiver_upper_r108;
	private final ModelRenderer receiver_upper_r109;
	private final ModelRenderer mpx_handguard_left_r51;
	private final ModelRenderer mpx_handguard_left_r52;
	private final ModelRenderer mpx_handguard_left_r53;
	private final ModelRenderer mpx_handguard_left_r54;
	private final ModelRenderer mpx_handguard_left_r55;
	private final ModelRenderer mpx_handguard_left_r56;
	private final ModelRenderer mpx_handguard_left_r57;
	private final ModelRenderer mpx_handguard_left_r58;
	private final ModelRenderer mpx_handguard_left_r59;
	private final ModelRenderer mpx_handguard_left_r60;
	private final ModelRenderer mpx_handguard_left_r61;
	private final ModelRenderer mpx_handguard_left_r62;
	private final ModelRenderer mpx_handguard_left_r63;
	private final ModelRenderer mpx_handguard_left_r64;
	private final ModelRenderer mpx_handguard_left_r65;
	private final ModelRenderer mpx_handguard_left_r66;
	private final ModelRenderer mpx_handguard_left_r67;
	private final ModelRenderer mpx_handguard_left_r68;
	private final ModelRenderer barrel3;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;

	public MPXHandguardExtended() {
		textureWidth = 256;
		textureHeight = 256;

		mpx_handguard3 = new QRenderer(this);
		mpx_handguard3.setRotationPoint(0.0F, 24.0F, 0.0F);
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 70, 74, 1.0F, -40.0F, -69.5F, 1, 3, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 0, 142, 1.0F, -40.0F, -67.5F, 1, 1, 38, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 94, 141, 1.0F, -38.0F, -67.5F, 1, 1, 38, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 105, 51, 1.0F, -39.0F, -61.5F, 1, 1, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 105, 45, 1.0F, -39.0F, -53.5F, 1, 1, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 59, 50, 1.0F, -40.0F, -29.5F, 1, 3, 4, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 9, 58, -5.0F, -39.0F, -61.5F, 1, 1, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 100, 0, -5.0F, -38.0F, -67.5F, 1, 1, 38, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 49, 74, -5.0F, -40.0F, -69.5F, 1, 3, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 140, 1, -5.0F, -40.0F, -67.5F, 1, 1, 38, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 89, 11, -5.0F, -39.0F, -45.5F, 1, 1, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 104, 34, -5.0F, -39.0F, -37.5F, 1, 1, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 37, 0, -5.0F, -40.0F, -29.5F, 1, 3, 4, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 104, 41, -5.0F, -39.0F, -53.5F, 1, 1, 2, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 49, 50, -3.0F, -36.25F, -69.5F, 3, 1, 44, 0.0F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 149, 173, -2.5F, -43.0F, -69.5F, 2, 1, 23, 0.001F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 0, 24, 0.0F, -41.8F, -69.5F, 1, 1, 23, 0.002F, false));
		mpx_handguard3.cubeList.add(new ModelBox(mpx_handguard3, 0, 0, -4.0F, -41.8F, -69.5F, 1, 1, 23, 0.002F, false));

		mpx_handguard_left_r49 = new ModelRenderer(this);
		mpx_handguard_left_r49.setRotationPoint(-4.0F, -41.8F, -65.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r49);
		setRotationAngle(mpx_handguard_left_r49, 0.0F, 0.0F, -0.9774F);
		mpx_handguard_left_r49.cubeList.add(new ModelBox(mpx_handguard_left_r49, 52, 0, 0.0F, 0.0F, -4.0F, 1, 1, 3, 0.001F, false));
		mpx_handguard_left_r49.cubeList.add(new ModelBox(mpx_handguard_left_r49, 58, 97, 0.0F, 0.0F, 15.0F, 1, 1, 4, 0.001F, false));

		mpx_handguard_left_r50 = new ModelRenderer(this);
		mpx_handguard_left_r50.setRotationPoint(-2.5F, -43.0F, -65.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r50);
		setRotationAngle(mpx_handguard_left_r50, 0.0F, 0.0F, 1.1868F);
		mpx_handguard_left_r50.cubeList.add(new ModelBox(mpx_handguard_left_r50, 39, 37, 0.0F, 0.0F, -4.0F, 1, 1, 3, 0.002F, false));
		mpx_handguard_left_r50.cubeList.add(new ModelBox(mpx_handguard_left_r50, 48, 97, 0.0F, 0.0F, 15.0F, 1, 1, 4, 0.002F, false));

		receiver_upper_r74 = new ModelRenderer(this);
		receiver_upper_r74.setRotationPoint(-3.37F, -42.68F, -59.25F);
		mpx_handguard3.addChild(receiver_upper_r74);
		setRotationAngle(receiver_upper_r74, 0.0F, 0.0F, -0.3316F);
		receiver_upper_r74.cubeList.add(new ModelBox(receiver_upper_r74, 106, 7, 0.0F, 0.0F, -8.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r74.cubeList.add(new ModelBox(receiver_upper_r74, 106, 1, 0.0F, 0.0F, -3.75F, 1, 1, 2, 0.0F, false));
		receiver_upper_r74.cubeList.add(new ModelBox(receiver_upper_r74, 105, 80, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver_upper_r74.cubeList.add(new ModelBox(receiver_upper_r74, 105, 61, 0.0F, 0.0F, 4.75F, 1, 1, 2, 0.0F, false));

		receiver_upper_r75 = new ModelRenderer(this);
		receiver_upper_r75.setRotationPoint(-3.84F, -42.1F, -66.5F);
		mpx_handguard3.addChild(receiver_upper_r75);
		setRotationAngle(receiver_upper_r75, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r75.cubeList.add(new ModelBox(receiver_upper_r75, 52, 102, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r76 = new ModelRenderer(this);
		receiver_upper_r76.setRotationPoint(-4.001F, -41.9F, -59.5F);
		mpx_handguard3.addChild(receiver_upper_r76);
		setRotationAngle(receiver_upper_r76, 0.0F, 0.0F, -0.8901F);
		receiver_upper_r76.cubeList.add(new ModelBox(receiver_upper_r76, 106, 4, 0.0F, 0.0F, -8.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r76.cubeList.add(new ModelBox(receiver_upper_r76, 105, 91, 0.0F, 0.0F, -3.75F, 1, 1, 2, 0.0F, false));
		receiver_upper_r76.cubeList.add(new ModelBox(receiver_upper_r76, 105, 67, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver_upper_r76.cubeList.add(new ModelBox(receiver_upper_r76, 105, 56, 0.0F, 0.0F, 4.75F, 1, 1, 2, 0.0F, false));

		receiver_upper_r77 = new ModelRenderer(this);
		receiver_upper_r77.setRotationPoint(-3.13F, -42.75F, -66.0F);
		mpx_handguard3.addChild(receiver_upper_r77);
		setRotationAngle(receiver_upper_r77, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r77.cubeList.add(new ModelBox(receiver_upper_r77, 99, 69, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r78 = new ModelRenderer(this);
		receiver_upper_r78.setRotationPoint(-3.84F, -42.1F, -62.25F);
		mpx_handguard3.addChild(receiver_upper_r78);
		setRotationAngle(receiver_upper_r78, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r78.cubeList.add(new ModelBox(receiver_upper_r78, 99, 67, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r79 = new ModelRenderer(this);
		receiver_upper_r79.setRotationPoint(-3.84F, -42.1F, -64.25F);
		mpx_handguard3.addChild(receiver_upper_r79);
		setRotationAngle(receiver_upper_r79, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r79.cubeList.add(new ModelBox(receiver_upper_r79, 99, 63, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r80 = new ModelRenderer(this);
		receiver_upper_r80.setRotationPoint(-3.13F, -42.75F, -63.75F);
		mpx_handguard3.addChild(receiver_upper_r80);
		setRotationAngle(receiver_upper_r80, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r80.cubeList.add(new ModelBox(receiver_upper_r80, 99, 61, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r81 = new ModelRenderer(this);
		receiver_upper_r81.setRotationPoint(-3.13F, -42.75F, -61.75F);
		mpx_handguard3.addChild(receiver_upper_r81);
		setRotationAngle(receiver_upper_r81, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r81.cubeList.add(new ModelBox(receiver_upper_r81, 99, 58, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r82 = new ModelRenderer(this);
		receiver_upper_r82.setRotationPoint(-3.84F, -42.1F, -58.0F);
		mpx_handguard3.addChild(receiver_upper_r82);
		setRotationAngle(receiver_upper_r82, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r82.cubeList.add(new ModelBox(receiver_upper_r82, 99, 56, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r83 = new ModelRenderer(this);
		receiver_upper_r83.setRotationPoint(-3.84F, -42.1F, -60.0F);
		mpx_handguard3.addChild(receiver_upper_r83);
		setRotationAngle(receiver_upper_r83, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r83.cubeList.add(new ModelBox(receiver_upper_r83, 31, 99, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r84 = new ModelRenderer(this);
		receiver_upper_r84.setRotationPoint(-3.13F, -42.75F, -59.5F);
		mpx_handguard3.addChild(receiver_upper_r84);
		setRotationAngle(receiver_upper_r84, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r84.cubeList.add(new ModelBox(receiver_upper_r84, 98, 45, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r85 = new ModelRenderer(this);
		receiver_upper_r85.setRotationPoint(-3.13F, -42.75F, -57.5F);
		mpx_handguard3.addChild(receiver_upper_r85);
		setRotationAngle(receiver_upper_r85, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r85.cubeList.add(new ModelBox(receiver_upper_r85, 16, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r86 = new ModelRenderer(this);
		receiver_upper_r86.setRotationPoint(-3.84F, -42.1F, -51.5F);
		mpx_handguard3.addChild(receiver_upper_r86);
		setRotationAngle(receiver_upper_r86, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r86.cubeList.add(new ModelBox(receiver_upper_r86, 10, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r87 = new ModelRenderer(this);
		receiver_upper_r87.setRotationPoint(-3.13F, -42.75F, -51.0F);
		mpx_handguard3.addChild(receiver_upper_r87);
		setRotationAngle(receiver_upper_r87, 0.0148F, -0.4012F, -0.3346F);
		receiver_upper_r87.cubeList.add(new ModelBox(receiver_upper_r87, 41, 93, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r88 = new ModelRenderer(this);
		receiver_upper_r88.setRotationPoint(-3.84F, -42.1F, -55.75F);
		mpx_handguard3.addChild(receiver_upper_r88);
		setRotationAngle(receiver_upper_r88, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r88.cubeList.add(new ModelBox(receiver_upper_r88, 92, 40, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r89 = new ModelRenderer(this);
		receiver_upper_r89.setRotationPoint(-3.13F, -42.75F, -53.25F);
		mpx_handguard3.addChild(receiver_upper_r89);
		setRotationAngle(receiver_upper_r89, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r89.cubeList.add(new ModelBox(receiver_upper_r89, 90, 45, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r90 = new ModelRenderer(this);
		receiver_upper_r90.setRotationPoint(-3.84F, -42.1F, -53.75F);
		mpx_handguard3.addChild(receiver_upper_r90);
		setRotationAngle(receiver_upper_r90, 0.0F, -0.4538F, -0.8901F);
		receiver_upper_r90.cubeList.add(new ModelBox(receiver_upper_r90, 23, 89, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r91 = new ModelRenderer(this);
		receiver_upper_r91.setRotationPoint(-3.13F, -42.75F, -55.25F);
		mpx_handguard3.addChild(receiver_upper_r91);
		setRotationAngle(receiver_upper_r91, 0.0074F, -0.4014F, -0.3157F);
		receiver_upper_r91.cubeList.add(new ModelBox(receiver_upper_r91, 10, 86, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r92 = new ModelRenderer(this);
		receiver_upper_r92.setRotationPoint(0.13F, -42.75F, -51.0F);
		mpx_handguard3.addChild(receiver_upper_r92);
		setRotationAngle(receiver_upper_r92, 0.0148F, 0.4012F, 0.3346F);
		receiver_upper_r92.cubeList.add(new ModelBox(receiver_upper_r92, 105, 48, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r93 = new ModelRenderer(this);
		receiver_upper_r93.setRotationPoint(0.84F, -42.1F, -51.5F);
		mpx_handguard3.addChild(receiver_upper_r93);
		setRotationAngle(receiver_upper_r93, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r93.cubeList.add(new ModelBox(receiver_upper_r93, 33, 104, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r94 = new ModelRenderer(this);
		receiver_upper_r94.setRotationPoint(0.13F, -42.75F, -66.0F);
		mpx_handguard3.addChild(receiver_upper_r94);
		setRotationAngle(receiver_upper_r94, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r94.cubeList.add(new ModelBox(receiver_upper_r94, 64, 102, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r95 = new ModelRenderer(this);
		receiver_upper_r95.setRotationPoint(1.001F, -41.9F, -59.5F);
		mpx_handguard3.addChild(receiver_upper_r95);
		setRotationAngle(receiver_upper_r95, 0.0F, 0.0F, 0.8901F);
		receiver_upper_r95.cubeList.add(new ModelBox(receiver_upper_r95, 54, 106, -1.0F, 0.0F, -8.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r95.cubeList.add(new ModelBox(receiver_upper_r95, 73, 106, -1.0F, 0.0F, -3.75F, 1, 1, 2, 0.0F, false));
		receiver_upper_r95.cubeList.add(new ModelBox(receiver_upper_r95, 106, 83, -1.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver_upper_r95.cubeList.add(new ModelBox(receiver_upper_r95, 106, 98, -1.0F, 0.0F, 4.75F, 1, 1, 2, 0.0F, false));

		receiver_upper_r96 = new ModelRenderer(this);
		receiver_upper_r96.setRotationPoint(0.84F, -42.1F, -66.5F);
		mpx_handguard3.addChild(receiver_upper_r96);
		setRotationAngle(receiver_upper_r96, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r96.cubeList.add(new ModelBox(receiver_upper_r96, 58, 102, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r97 = new ModelRenderer(this);
		receiver_upper_r97.setRotationPoint(0.37F, -42.68F, -59.25F);
		mpx_handguard3.addChild(receiver_upper_r97);
		setRotationAngle(receiver_upper_r97, 0.0F, 0.0F, 0.3316F);
		receiver_upper_r97.cubeList.add(new ModelBox(receiver_upper_r97, 48, 106, -1.0F, 0.0F, -8.0F, 1, 1, 2, 0.0F, false));
		receiver_upper_r97.cubeList.add(new ModelBox(receiver_upper_r97, 60, 106, -1.0F, 0.0F, -3.75F, 1, 1, 2, 0.0F, false));
		receiver_upper_r97.cubeList.add(new ModelBox(receiver_upper_r97, 79, 106, -1.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));
		receiver_upper_r97.cubeList.add(new ModelBox(receiver_upper_r97, 85, 106, -1.0F, 0.0F, 4.75F, 1, 1, 2, 0.0F, false));

		receiver_upper_r98 = new ModelRenderer(this);
		receiver_upper_r98.setRotationPoint(0.13F, -42.75F, -61.75F);
		mpx_handguard3.addChild(receiver_upper_r98);
		setRotationAngle(receiver_upper_r98, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r98.cubeList.add(new ModelBox(receiver_upper_r98, 102, 100, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r99 = new ModelRenderer(this);
		receiver_upper_r99.setRotationPoint(0.13F, -42.75F, -63.75F);
		mpx_handguard3.addChild(receiver_upper_r99);
		setRotationAngle(receiver_upper_r99, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r99.cubeList.add(new ModelBox(receiver_upper_r99, 89, 102, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r100 = new ModelRenderer(this);
		receiver_upper_r100.setRotationPoint(0.84F, -42.1F, -64.25F);
		mpx_handguard3.addChild(receiver_upper_r100);
		setRotationAngle(receiver_upper_r100, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r100.cubeList.add(new ModelBox(receiver_upper_r100, 83, 102, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r101 = new ModelRenderer(this);
		receiver_upper_r101.setRotationPoint(0.84F, -42.1F, -62.25F);
		mpx_handguard3.addChild(receiver_upper_r101);
		setRotationAngle(receiver_upper_r101, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r101.cubeList.add(new ModelBox(receiver_upper_r101, 77, 102, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r102 = new ModelRenderer(this);
		receiver_upper_r102.setRotationPoint(0.13F, -42.75F, -57.5F);
		mpx_handguard3.addChild(receiver_upper_r102);
		setRotationAngle(receiver_upper_r102, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r102.cubeList.add(new ModelBox(receiver_upper_r102, 103, 80, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r103 = new ModelRenderer(this);
		receiver_upper_r103.setRotationPoint(0.13F, -42.75F, -59.5F);
		mpx_handguard3.addChild(receiver_upper_r103);
		setRotationAngle(receiver_upper_r103, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r103.cubeList.add(new ModelBox(receiver_upper_r103, 40, 103, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r104 = new ModelRenderer(this);
		receiver_upper_r104.setRotationPoint(0.84F, -42.1F, -60.0F);
		mpx_handguard3.addChild(receiver_upper_r104);
		setRotationAngle(receiver_upper_r104, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r104.cubeList.add(new ModelBox(receiver_upper_r104, 27, 103, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r105 = new ModelRenderer(this);
		receiver_upper_r105.setRotationPoint(0.84F, -42.1F, -58.0F);
		mpx_handguard3.addChild(receiver_upper_r105);
		setRotationAngle(receiver_upper_r105, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r105.cubeList.add(new ModelBox(receiver_upper_r105, 4, 103, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r106 = new ModelRenderer(this);
		receiver_upper_r106.setRotationPoint(0.13F, -42.75F, -55.25F);
		mpx_handguard3.addChild(receiver_upper_r106);
		setRotationAngle(receiver_upper_r106, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r106.cubeList.add(new ModelBox(receiver_upper_r106, 58, 106, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r107 = new ModelRenderer(this);
		receiver_upper_r107.setRotationPoint(0.84F, -42.1F, -53.75F);
		mpx_handguard3.addChild(receiver_upper_r107);
		setRotationAngle(receiver_upper_r107, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r107.cubeList.add(new ModelBox(receiver_upper_r107, 52, 106, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r108 = new ModelRenderer(this);
		receiver_upper_r108.setRotationPoint(0.13F, -42.75F, -53.25F);
		mpx_handguard3.addChild(receiver_upper_r108);
		setRotationAngle(receiver_upper_r108, 0.0074F, 0.4014F, 0.3157F);
		receiver_upper_r108.cubeList.add(new ModelBox(receiver_upper_r108, 90, 105, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		receiver_upper_r109 = new ModelRenderer(this);
		receiver_upper_r109.setRotationPoint(0.84F, -42.1F, -55.75F);
		mpx_handguard3.addChild(receiver_upper_r109);
		setRotationAngle(receiver_upper_r109, 0.0F, 0.4538F, 0.8901F);
		receiver_upper_r109.cubeList.add(new ModelBox(receiver_upper_r109, 65, 105, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r51 = new ModelRenderer(this);
		mpx_handguard_left_r51.setRotationPoint(-0.5F, -43.0F, -65.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r51);
		setRotationAngle(mpx_handguard_left_r51, 0.0F, 0.0F, -1.1868F);
		mpx_handguard_left_r51.cubeList.add(new ModelBox(mpx_handguard_left_r51, 52, 23, -1.0F, 0.0F, -4.0F, 1, 1, 3, 0.002F, false));
		mpx_handguard_left_r51.cubeList.add(new ModelBox(mpx_handguard_left_r51, 83, 97, -1.0F, 0.0F, 15.0F, 1, 1, 4, 0.002F, false));

		mpx_handguard_left_r52 = new ModelRenderer(this);
		mpx_handguard_left_r52.setRotationPoint(1.0F, -41.8F, -65.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r52);
		setRotationAngle(mpx_handguard_left_r52, 0.0F, 0.0F, 0.9774F);
		mpx_handguard_left_r52.cubeList.add(new ModelBox(mpx_handguard_left_r52, 52, 4, -1.0F, 0.0F, -4.0F, 1, 1, 3, 0.001F, false));
		mpx_handguard_left_r52.cubeList.add(new ModelBox(mpx_handguard_left_r52, 73, 97, -1.0F, 0.0F, 15.0F, 1, 1, 4, 0.001F, false));

		mpx_handguard_left_r53 = new ModelRenderer(this);
		mpx_handguard_left_r53.setRotationPoint(2.0F, -40.0F, -46.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r53);
		setRotationAngle(mpx_handguard_left_r53, 0.0F, 0.0F, 0.925F);
		mpx_handguard_left_r53.cubeList.add(new ModelBox(mpx_handguard_left_r53, 52, 0, -2.0F, 0.0F, -23.0F, 2, 1, 44, 0.001F, false));

		mpx_handguard_left_r54 = new ModelRenderer(this);
		mpx_handguard_left_r54.setRotationPoint(-3.0F, -35.25F, -46.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r54);
		setRotationAngle(mpx_handguard_left_r54, 0.0F, 0.0F, 0.7156F);
		mpx_handguard_left_r54.cubeList.add(new ModelBox(mpx_handguard_left_r54, 99, 45, -2.6F, -1.0F, -23.0F, 1, 1, 44, -0.002F, false));
		mpx_handguard_left_r54.cubeList.add(new ModelBox(mpx_handguard_left_r54, 50, 95, -2.0F, -1.0F, -23.0F, 2, 1, 44, -0.001F, false));

		mpx_handguard_left_r55 = new ModelRenderer(this);
		mpx_handguard_left_r55.setRotationPoint(0.0F, -35.25F, -46.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r55);
		setRotationAngle(mpx_handguard_left_r55, 0.0F, 0.0F, -0.7156F);
		mpx_handguard_left_r55.cubeList.add(new ModelBox(mpx_handguard_left_r55, 48, 140, 1.6F, -1.0F, -23.0F, 1, 1, 44, -0.002F, false));
		mpx_handguard_left_r55.cubeList.add(new ModelBox(mpx_handguard_left_r55, 0, 97, 0.0F, -1.0F, -23.0F, 2, 1, 44, -0.001F, false));

		mpx_handguard_left_r56 = new ModelRenderer(this);
		mpx_handguard_left_r56.setRotationPoint(-5.2F, -38.2F, -29.1F);
		mpx_handguard3.addChild(mpx_handguard_left_r56);
		setRotationAngle(mpx_handguard_left_r56, -0.4189F, 0.0F, 0.0F);
		mpx_handguard_left_r56.cubeList.add(new ModelBox(mpx_handguard_left_r56, 25, 41, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r57 = new ModelRenderer(this);
		mpx_handguard_left_r57.setRotationPoint(-5.2F, -38.2F, -37.1F);
		mpx_handguard3.addChild(mpx_handguard_left_r57);
		setRotationAngle(mpx_handguard_left_r57, -0.4189F, 0.0F, 0.0F);
		mpx_handguard_left_r57.cubeList.add(new ModelBox(mpx_handguard_left_r57, 58, 18, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r58 = new ModelRenderer(this);
		mpx_handguard_left_r58.setRotationPoint(-5.2F, -38.2F, -45.1F);
		mpx_handguard3.addChild(mpx_handguard_left_r58);
		setRotationAngle(mpx_handguard_left_r58, -0.4189F, 0.0F, 0.0F);
		mpx_handguard_left_r58.cubeList.add(new ModelBox(mpx_handguard_left_r58, 33, 58, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r59 = new ModelRenderer(this);
		mpx_handguard_left_r59.setRotationPoint(-5.2F, -38.2F, -53.1F);
		mpx_handguard3.addChild(mpx_handguard_left_r59);
		setRotationAngle(mpx_handguard_left_r59, -0.4189F, 0.0F, 0.0F);
		mpx_handguard_left_r59.cubeList.add(new ModelBox(mpx_handguard_left_r59, 41, 74, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r59.cubeList.add(new ModelBox(mpx_handguard_left_r59, 74, 45, 6.4F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r60 = new ModelRenderer(this);
		mpx_handguard_left_r60.setRotationPoint(-5.2F, -38.2F, -69.1F);
		mpx_handguard3.addChild(mpx_handguard_left_r60);
		setRotationAngle(mpx_handguard_left_r60, -0.4189F, 0.0F, 0.0F);
		mpx_handguard_left_r60.cubeList.add(new ModelBox(mpx_handguard_left_r60, 66, 45, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r60.cubeList.add(new ModelBox(mpx_handguard_left_r60, 59, 83, 6.4F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r61 = new ModelRenderer(this);
		mpx_handguard_left_r61.setRotationPoint(-5.2F, -38.2F, -61.1F);
		mpx_handguard3.addChild(mpx_handguard_left_r61);
		setRotationAngle(mpx_handguard_left_r61, -0.4189F, 0.0F, 0.0F);
		mpx_handguard_left_r61.cubeList.add(new ModelBox(mpx_handguard_left_r61, 58, 45, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		mpx_handguard_left_r61.cubeList.add(new ModelBox(mpx_handguard_left_r61, 82, 45, 6.4F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		mpx_handguard_left_r62 = new ModelRenderer(this);
		mpx_handguard_left_r62.setRotationPoint(2.0F, -37.0F, -25.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r62);
		setRotationAngle(mpx_handguard_left_r62, -0.0249F, 0.6064F, 0.8305F);
		mpx_handguard_left_r62.cubeList.add(new ModelBox(mpx_handguard_left_r62, 19, 0, -1.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r63 = new ModelRenderer(this);
		mpx_handguard_left_r63.setRotationPoint(-5.0F, -37.0F, -25.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r63);
		setRotationAngle(mpx_handguard_left_r63, -0.0249F, -0.6064F, -0.8305F);
		mpx_handguard_left_r63.cubeList.add(new ModelBox(mpx_handguard_left_r63, 5, 24, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r64 = new ModelRenderer(this);
		mpx_handguard_left_r64.setRotationPoint(-5.0F, -40.0F, -25.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r64);
		setRotationAngle(mpx_handguard_left_r64, 0.0F, 0.7854F, 0.576F);
		mpx_handguard_left_r64.cubeList.add(new ModelBox(mpx_handguard_left_r64, 44, 24, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r65 = new ModelRenderer(this);
		mpx_handguard_left_r65.setRotationPoint(2.0F, -40.0F, -25.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r65);
		setRotationAngle(mpx_handguard_left_r65, 0.0F, -0.7854F, -0.576F);
		mpx_handguard_left_r65.cubeList.add(new ModelBox(mpx_handguard_left_r65, 44, 37, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		mpx_handguard_left_r66 = new ModelRenderer(this);
		mpx_handguard_left_r66.setRotationPoint(-5.0F, -37.0F, -25.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r66);
		setRotationAngle(mpx_handguard_left_r66, 0.0F, 0.7854F, 0.0F);
		mpx_handguard_left_r66.cubeList.add(new ModelBox(mpx_handguard_left_r66, 0, 18, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		mpx_handguard_left_r67 = new ModelRenderer(this);
		mpx_handguard_left_r67.setRotationPoint(2.0F, -37.0F, -25.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r67);
		setRotationAngle(mpx_handguard_left_r67, 0.0F, -0.7854F, 0.0F);
		mpx_handguard_left_r67.cubeList.add(new ModelBox(mpx_handguard_left_r67, 12, 18, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		mpx_handguard_left_r68 = new ModelRenderer(this);
		mpx_handguard_left_r68.setRotationPoint(-5.0F, -40.0F, -46.5F);
		mpx_handguard3.addChild(mpx_handguard_left_r68);
		setRotationAngle(mpx_handguard_left_r68, 0.0F, 0.0F, -0.925F);
		mpx_handguard_left_r68.cubeList.add(new ModelBox(mpx_handguard_left_r68, 98, 96, 0.0F, 0.0F, -23.0F, 2, 1, 44, 0.001F, false));

		barrel3 = new ModelRenderer(this);
		barrel3.setRotationPoint(-1.0F, -40.0F, -78.0F);
		mpx_handguard3.addChild(barrel3);
		barrel3.cubeList.add(new ModelBox(barrel3, 82, 5, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 0, 0, -1.5F, 0.5F, 5.0F, 2, 2, 48, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 30, 81, -1.0F, 2.0F, 0.0F, 1, 1, 5, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 17, 107, -2.0F, 1.0F, 4.0F, 1, 1, 1, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 4, 107, -2.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 83, 106, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		barrel3.cubeList.add(new ModelBox(barrel3, 77, 106, 0.0F, 1.0F, 4.0F, 1, 1, 1, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-1.0F, 0.3F, -0.8F);
		barrel3.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 236, 81, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.203F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-1.0F, 1.3F, -0.8F);
		barrel3.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 221, 76, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.203F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 1.3F, -0.8F);
		barrel3.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.7854F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 210, 72, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.202F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.0F, 0.3F, -0.8F);
		barrel3.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, 0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 182, 48, 0.0F, 0.0F, 1.0F, 1, 1, 5, 0.201F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-0.7F, -34.2F, -29.0F);
		mpx_handguard3.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 120, 2.1F, -5.3F, -17.5F, 1, 2, 19, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 24, 2.9F, -5.3F, -17.7F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 100, 20, 2.9F, -5.3F, -15.2F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 37, 97, 2.9F, -5.3F, -12.7F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 90, 36, 2.9F, -5.3F, -10.2F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 90, 0, 2.9F, -5.3F, -7.7F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 87, 89, 2.9F, -5.3F, -5.2F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 89, 15, 2.9F, -5.3F, -2.7F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 86, 61, 2.9F, -5.3F, -0.2F, 1, 2, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 74, -1.8F, -1.6F, -17.5F, 2, 1, 19, -0.001F, false));
		bone2.cubeList.add(new ModelBox(bone2, 68, 45, -1.8F, -0.8F, -17.7F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 60, 45, -1.8F, -0.8F, -15.2F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 60, 18, -1.8F, -0.8F, -12.7F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 49, 55, -1.8F, -0.8F, -10.2F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 52, 45, -1.8F, -0.8F, -7.7F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 52, 18, -1.8F, -0.8F, -5.2F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 34, 24, -1.8F, -0.8F, -2.7F, 2, 1, 2, -0.2F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 30, -1.8F, -0.8F, -0.2F, 2, 1, 2, -0.2F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, -0.576F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 106, 101, -0.2F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 106, 104, -0.2F, -0.8F, -2.7F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 6, 107, -0.2F, -0.8F, -5.2F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 107, 13, -0.2F, -0.8F, -7.7F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 107, 70, -0.2F, -0.8F, -10.2F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 98, 107, -0.2F, -0.8F, -12.7F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 10, 108, -0.2F, -0.8F, -15.2F, 1, 1, 2, -0.202F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 27, 108, -0.2F, -0.8F, -17.7F, 1, 1, 2, -0.202F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-1.6F, 0.0F, 0.0F);
		bone2.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.0F, 0.576F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 102, 106, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 107, -0.8F, -0.8F, -2.7F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 107, 10, -0.8F, -0.8F, -5.2F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 23, 107, -0.8F, -0.8F, -7.7F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 107, 74, -0.8F, -0.8F, -10.2F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 106, 107, -0.8F, -0.8F, -12.7F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 108, 20, -0.8F, -0.8F, -15.2F, 1, 1, 2, -0.202F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 108, 24, -0.8F, -0.8F, -17.7F, 1, 1, 2, -0.202F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(3.7F, -3.5F, 0.0F);
		bone2.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0F, 0.0F, 0.576F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 108, 28, -0.8F, -0.2F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 33, 108, -0.8F, -0.2F, -2.7F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 14, 109, -0.8F, -0.2F, -5.2F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 109, 46, -0.8F, -0.2F, -7.7F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 109, 49, -0.8F, -0.2F, -10.2F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 54, 109, -0.8F, -0.2F, -12.7F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 109, 58, -0.8F, -0.2F, -15.2F, 1, 1, 2, -0.202F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 109, 62, -0.8F, -0.2F, -17.7F, 1, 1, 2, -0.202F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(3.7F, -5.1F, 0.0F);
		bone2.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, -0.576F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 108, 32, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 108, 39, -0.8F, -0.8F, -2.7F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 109, -0.8F, -0.8F, -5.2F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 48, 109, -0.8F, -0.8F, -7.7F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 109, 52, -0.8F, -0.8F, -10.2F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 109, 55, -0.8F, -0.8F, -12.7F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 60, 109, -0.8F, -0.8F, -15.2F, 1, 1, 2, -0.202F, false));
		cube_r22.cubeList.add(new ModelBox(cube_r22, 73, 109, -0.8F, -0.8F, -17.7F, 1, 1, 2, -0.202F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mpx_handguard3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
