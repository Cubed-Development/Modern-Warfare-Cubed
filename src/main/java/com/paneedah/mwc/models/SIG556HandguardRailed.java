package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SIG556HandguardRailed extends ModelWithAttachments {
	private final QRenderer handguard2;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;
	private final ModelRenderer cube_r111;
	private final ModelRenderer cube_r112;
	private final ModelRenderer cube_r113;
	private final ModelRenderer cube_r114;
	private final ModelRenderer rail5;
	private final ModelRenderer cube_r115;
	private final ModelRenderer cube_r116;
	private final ModelRenderer rail6;
	private final ModelRenderer cube_r117;
	private final ModelRenderer cube_r118;
	private final ModelRenderer rail7;
	private final ModelRenderer cube_r119;
	private final ModelRenderer cube_r120;

	public SIG556HandguardRailed() {
		textureWidth = 350;
		textureHeight = 350;

		handguard2 = new QRenderer(this);
		handguard2.setRotationPoint(0.0F, -15.3F, -35.0F);
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 0, -2.5F, 2.3F, -36.85F, 2, 2, 45, -0.1F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 35, 0, -2.5F, -1.0F, -20.85F, 2, 6, 3, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 70, 63, -2.0F, -1.45F, -20.85F, 1, 1, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 21, -2.0F, -4.2F, -20.35F, 1, 3, 2, -0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 40, 88, -2.0F, 4.8F, -19.6F, 1, 2, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 32, 47, -3.0F, 0.8F, -20.85F, 3, 4, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 131, 129, -0.2F, -0.4F, -18.05F, 1, 4, 27, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 100, -0.195F, 0.0F, -17.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 97, 66, -0.195F, 0.0F, -14.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 97, 63, -0.195F, 0.0F, -11.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 27, 95, -0.195F, 0.0F, -8.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 18, 95, -0.195F, 0.0F, -5.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 9, 95, -0.195F, 0.0F, -2.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 95, -0.195F, 0.0F, 0.95F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 27, 92, -0.195F, 0.0F, 3.95F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 21, 82, -3.805F, 0.0F, 3.95F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 38, 85, -3.805F, 0.0F, 0.95F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 7, 87, -3.805F, 0.0F, -2.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 46, 87, -3.805F, 0.0F, -5.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 88, 37, -3.805F, 0.0F, -8.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 92, -3.805F, 0.0F, -11.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 9, 92, -3.805F, 0.0F, -14.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 18, 92, -3.805F, 0.0F, -17.05F, 1, 1, 2, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 160, 115, 0.6F, 1.05F, -18.15F, 1, 2, 27, -0.101F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 35, 127, -0.2F, -0.7F, -18.05F, 1, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 108, 24, -0.2F, -0.7F, -16.55F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 106, 64, -0.2F, -0.7F, -12.05F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 106, 59, -0.2F, -0.7F, -7.55F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 105, 72, -0.2F, -0.7F, -3.05F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 76, 103, -0.2F, -0.7F, 1.45F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 21, 67, -0.2F, -0.7F, 5.95F, 1, 1, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 131, 98, -3.8F, -0.4F, -18.05F, 1, 4, 27, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 31, 127, -3.8F, -0.7F, -18.05F, 1, 1, 1, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 86, 0, -3.8F, -0.7F, -16.55F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 86, 5, -3.8F, -0.7F, -12.05F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 76, 92, -3.8F, -0.7F, -7.55F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 98, 28, -3.8F, -0.7F, -3.05F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 47, 102, -3.8F, -0.7F, 1.45F, 1, 1, 4, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 10, 34, -3.8F, -0.7F, 5.95F, 1, 1, 3, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 153, 0, -2.5F, -2.6F, -18.15F, 2, 1, 27, -0.101F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 150, 29, -2.5F, 5.2F, -18.15F, 2, 1, 27, -0.101F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 90, 149, -2.35F, 4.35F, -18.15F, 2, 1, 27, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 160, 144, -2.65F, 4.35F, -18.15F, 1, 1, 27, 0.001F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 63, 36, -2.5F, 2.3F, -40.85F, 2, 2, 4, 0.1F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 240, 48, -2.0F, 2.1F, -36.85F, 1, 1, 19, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 21, 78, -2.0F, 2.0F, -43.95F, 1, 1, 7, 0.1F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 66, 0, -2.0F, 3.6F, -43.95F, 1, 1, 7, 0.1F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 65, 16, -1.2F, 2.8F, -43.95F, 1, 1, 7, 0.09F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 63, 47, -2.8F, 2.8F, -43.95F, 1, 1, 7, 0.09F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 47, -2.0F, 3.4F, -36.85F, 1, 1, 44, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 67, -1.4F, 2.8F, -36.85F, 1, 1, 19, 0.0F, false));
		handguard2.cubeList.add(new ModelBox(handguard2, 0, 47, -2.6F, 2.8F, -36.85F, 1, 1, 19, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(-3.55F, -0.7F, 5.95F);
		handguard2.addChild(cube_r106);
		setRotationAngle(cube_r106, 0.0F, 0.0F, -0.7679F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 35, 14, 0.0F, 0.0F, 0.0F, 2, 1, 3, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 121, 16, 0.0F, 0.0F, -4.0F, 2, 1, 1, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 121, 14, 0.0F, 0.0F, -8.0F, 2, 1, 1, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 121, 12, 0.0F, 0.0F, -12.0F, 2, 1, 1, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 12, 121, 0.0F, 0.0F, -16.0F, 2, 1, 1, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 0, 214, -0.45F, -0.1F, -23.5F, 1, 1, 24, -0.1F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 121, 10, 0.0F, 0.0F, -24.0F, 2, 1, 1, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 121, 8, 0.0F, 0.0F, -20.0F, 2, 1, 1, -0.01F, false));
		cube_r106.cubeList.add(new ModelBox(cube_r106, 212, 0, 1.4F, -0.1F, -23.5F, 1, 1, 24, -0.1F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.55F, -0.7F, 1.95F);
		handguard2.addChild(cube_r107);
		setRotationAngle(cube_r107, 0.0F, 0.0F, 0.7679F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 18, 121, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.01F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 83, 76, -2.0F, 0.0F, 4.0F, 2, 1, 3, -0.01F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 121, 20, -2.0F, 0.0F, -8.0F, 2, 1, 1, -0.01F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 121, 18, -2.0F, 0.0F, -4.0F, 2, 1, 1, -0.01F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 121, 22, -2.0F, 0.0F, -12.0F, 2, 1, 1, -0.01F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 24, 121, -2.0F, 0.0F, -16.0F, 2, 1, 1, -0.01F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 214, 53, -2.4F, -0.1F, -19.5F, 1, 1, 24, -0.1F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 117, 216, -0.55F, -0.1F, -19.5F, 1, 1, 24, -0.1F, false));
		cube_r107.cubeList.add(new ModelBox(cube_r107, 121, 24, -2.0F, 0.0F, -20.0F, 2, 1, 1, -0.01F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(-3.8F, 3.6F, -18.05F);
		handguard2.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.0F, 0.0F, -0.5585F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 49, 36, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.01F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 26, 71, 0.0F, 0.0F, 5.0F, 1, 2, 1, 0.01F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 26, 67, 0.0F, 0.0F, 9.0F, 1, 2, 1, 0.01F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 57, 57, 0.0F, 0.0F, 13.0F, 1, 2, 1, 0.01F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 26, 47, 0.0F, 0.0F, 17.0F, 1, 2, 1, 0.01F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 15, 21, 0.0F, 0.0F, 21.0F, 1, 2, 1, 0.01F, false));
		cube_r108.cubeList.add(new ModelBox(cube_r108, 12, 13, 0.0F, 0.0F, 25.0F, 1, 2, 2, 0.01F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.8F, 3.6F, 2.95F);
		handguard2.addChild(cube_r109);
		setRotationAngle(cube_r109, 0.0F, 0.0F, 0.5585F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 75, 63, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.01F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 54, 47, -1.0F, 0.0F, 4.0F, 1, 2, 2, 0.01F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 15, 76, -1.0F, 0.0F, -8.0F, 1, 2, 1, 0.01F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 75, 67, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.01F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 40, 77, -1.0F, 0.0F, -12.0F, 1, 2, 1, 0.01F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 15, 80, -1.0F, 0.0F, -16.0F, 1, 2, 1, 0.01F, false));
		cube_r109.cubeList.add(new ModelBox(cube_r109, 57, 0, -1.0F, 0.0F, -21.0F, 1, 2, 2, 0.01F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(-3.0F, 1.55F, -5.15F);
		handguard2.addChild(cube_r110);
		setRotationAngle(cube_r110, -0.384F, 0.0F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 15, 17, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r111 = new ModelRenderer(this);
		cube_r111.setRotationPoint(-3.0F, 1.55F, 6.85F);
		handguard2.addChild(cube_r111);
		setRotationAngle(cube_r111, -0.384F, 0.0F, 0.0F);
		cube_r111.cubeList.add(new ModelBox(cube_r111, 41, 41, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r112 = new ModelRenderer(this);
		cube_r112.setRotationPoint(-3.0F, 1.55F, -17.15F);
		handguard2.addChild(cube_r112);
		setRotationAngle(cube_r112, -0.384F, 0.0F, 0.0F);
		cube_r112.cubeList.add(new ModelBox(cube_r112, 41, 43, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r113 = new ModelRenderer(this);
		cube_r113.setRotationPoint(-1.0F, -4.2F, -20.35F);
		handguard2.addChild(cube_r113);
		setRotationAngle(cube_r113, -0.1745F, 0.0F, 0.0F);
		cube_r113.cubeList.add(new ModelBox(cube_r113, 0, 13, -1.0F, 0.0F, 0.0F, 1, 3, 1, -0.002F, false));

		cube_r114 = new ModelRenderer(this);
		cube_r114.setRotationPoint(-1.0F, -2.0F, -20.95F);
		handguard2.addChild(cube_r114);
		setRotationAngle(cube_r114, 0.4712F, 0.0F, 0.0F);
		cube_r114.cubeList.add(new ModelBox(cube_r114, 39, 127, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.2F, false));

		rail5 = new ModelRenderer(this);
		rail5.setRotationPoint(-0.7F, -2.2F, -21.8F);
		handguard2.addChild(rail5);
		setRotationAngle(rail5, 0.0F, 0.0F, -3.1416F);
		rail5.cubeList.add(new ModelBox(rail5, 121, 6, -0.2F, -0.2F, 12.05F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 6, 121, -0.2F, -0.2F, 13.3F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 121, 4, -0.2F, -0.2F, 14.55F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 121, 2, -0.2F, -0.2F, 15.8F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 121, 0, -0.2F, -0.2F, 18.3F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 0, 121, -0.2F, -0.2F, 17.05F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 118, 119, -0.2F, -0.2F, 20.8F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 112, 119, -0.2F, -0.2F, 19.55F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 106, 119, -0.2F, -0.2F, 23.3F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 100, 119, -0.2F, -0.2F, 22.05F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 92, 119, -0.2F, -0.2F, 25.8F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 86, 119, -0.2F, -0.2F, 24.55F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 81, 97, -0.2F, -0.2F, 28.3F, 2, 1, 2, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 80, 119, -0.2F, -0.2F, 27.05F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 74, 119, -0.2F, -0.2F, 29.85F, 2, 1, 1, -0.201F, false));
		rail5.cubeList.add(new ModelBox(rail5, 63, 119, -0.2F, -0.2F, 7.05F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 57, 119, -0.2F, -0.2F, 8.3F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 119, 46, -0.2F, -0.2F, 9.55F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 24, 119, -0.2F, -0.2F, 10.8F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 18, 119, -0.2F, -0.2F, 5.8F, 2, 1, 1, -0.2F, false));
		rail5.cubeList.add(new ModelBox(rail5, 97, 59, -0.2F, -0.2F, 3.55F, 2, 1, 2, -0.2F, false));

		cube_r115 = new ModelRenderer(this);
		cube_r115.setRotationPoint(0.0F, 0.6F, 4.75F);
		rail5.addChild(cube_r115);
		setRotationAngle(cube_r115, 0.0F, 0.0F, -0.9425F);
		cube_r115.cubeList.add(new ModelBox(cube_r115, 27, 100, -0.2F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 5, -0.2F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 11, -0.2F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 15, -0.2F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 19, -0.2F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 23, -0.2F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 30, -0.2F, -0.8F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 9, 103, -0.2F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 34, -0.2F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 41, -0.2F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 43, -0.2F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 88, -0.2F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 90, -0.2F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 100, -0.2F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 102, -0.2F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 108, -0.2F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 110, -0.2F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 126, 114, -0.2F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 4, 127, -0.2F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 12, 127, -0.2F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 20, 127, -0.2F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r115.cubeList.add(new ModelBox(cube_r115, 0, 187, -0.1F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		cube_r116 = new ModelRenderer(this);
		cube_r116.setRotationPoint(1.6F, 0.6F, 4.75F);
		rail5.addChild(cube_r116);
		setRotationAngle(cube_r116, 0.0F, 0.0F, 0.9425F);
		cube_r116.cubeList.add(new ModelBox(cube_r116, 102, 71, -0.8F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 7, -0.8F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 9, -0.8F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 13, -0.8F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 17, -0.8F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 21, -0.8F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 103, -0.8F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 25, -0.8F, -0.8F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 32, -0.8F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 37, -0.8F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 39, -0.8F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 84, -0.8F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 86, -0.8F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 92, -0.8F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 98, -0.8F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 104, -0.8F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 106, -0.8F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 126, 112, -0.8F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 0, 127, -0.8F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 8, 127, -0.8F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 16, 127, -0.8F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r116.cubeList.add(new ModelBox(cube_r116, 186, 55, -0.9F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		rail6 = new ModelRenderer(this);
		rail6.setRotationPoint(1.3F, 2.8F, -21.8F);
		handguard2.addChild(rail6);
		setRotationAngle(rail6, 0.0F, 0.0F, -1.5708F);
		rail6.cubeList.add(new ModelBox(rail6, 12, 119, -0.2F, -0.2F, 12.05F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 6, 119, -0.2F, -0.2F, 13.3F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 0, 119, -0.2F, -0.2F, 14.55F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 118, 110, -0.2F, -0.2F, 15.8F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 118, 100, -0.2F, -0.2F, 18.3F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 118, 98, -0.2F, -0.2F, 17.05F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 117, 42, -0.2F, -0.2F, 20.8F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 25, 116, -0.2F, -0.2F, 19.55F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 15, 116, -0.2F, -0.2F, 23.3F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 9, 116, -0.2F, -0.2F, 22.05F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 0, 116, -0.2F, -0.2F, 25.8F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 115, 0, -0.2F, -0.2F, 24.55F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 74, 20, -0.2F, -0.2F, 28.3F, 2, 1, 2, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 98, 114, -0.2F, -0.2F, 27.05F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 92, 114, -0.2F, -0.2F, 29.85F, 2, 1, 1, -0.201F, false));
		rail6.cubeList.add(new ModelBox(rail6, 112, 21, -0.2F, -0.2F, 7.05F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 112, 13, -0.2F, -0.2F, 8.3F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 65, 110, -0.2F, -0.2F, 9.55F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 109, 77, -0.2F, -0.2F, 10.8F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 109, 5, -0.2F, -0.2F, 5.8F, 2, 1, 1, -0.2F, false));
		rail6.cubeList.add(new ModelBox(rail6, 60, 72, -0.2F, -0.2F, 3.55F, 2, 1, 2, -0.2F, false));

		cube_r117 = new ModelRenderer(this);
		cube_r117.setRotationPoint(0.0F, 0.6F, 4.75F);
		rail6.addChild(cube_r117);
		setRotationAngle(cube_r117, 0.0F, 0.0F, -0.9425F);
		cube_r117.cubeList.add(new ModelBox(cube_r117, 100, 0, -0.2F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 113, 89, -0.2F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 114, 29, -0.2F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 114, 91, -0.2F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 115, 5, -0.2F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 49, 118, -0.2F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 119, 84, -0.2F, -0.8F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 18, 100, -0.2F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 119, 112, -0.2F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 30, 121, -0.2F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 30, 123, -0.2F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 108, 123, -0.2F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 112, 123, -0.2F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 74, 125, -0.2F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 78, 125, -0.2F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 90, 125, -0.2F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 94, 125, -0.2F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 104, 125, -0.2F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 112, 125, -0.2F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 120, 125, -0.2F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 126, 3, -0.2F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r117.cubeList.add(new ModelBox(cube_r117, 184, 0, -0.1F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		cube_r118 = new ModelRenderer(this);
		cube_r118.setRotationPoint(1.6F, 0.6F, 4.75F);
		rail6.addChild(cube_r118);
		setRotationAngle(cube_r118, 0.0F, 0.0F, 0.9425F);
		cube_r118.cubeList.add(new ModelBox(cube_r118, 100, 3, -0.8F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 114, 24, -0.8F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 114, 26, -0.8F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 36, 114, -0.8F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 115, 2, -0.8F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 115, 7, -0.8F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 9, 100, -0.8F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 30, 119, -0.8F, -0.8F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 119, 102, -0.8F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 120, 90, -0.8F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 120, 92, -0.8F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 100, 123, -0.8F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 104, 123, -0.8F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 116, 123, -0.8F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 120, 123, -0.8F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 82, 125, -0.8F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 86, 125, -0.8F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 100, 125, -0.8F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 108, 125, -0.8F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 116, 125, -0.8F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 126, 1, -0.8F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r118.cubeList.add(new ModelBox(cube_r118, 181, 28, -0.9F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		rail7 = new ModelRenderer(this);
		rail7.setRotationPoint(-2.3F, 6.0F, -21.8F);
		handguard2.addChild(rail7);
		rail7.cubeList.add(new ModelBox(rail7, 103, 59, -0.2F, -0.2F, 12.05F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 103, 47, -0.2F, -0.2F, 13.3F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 100, 8, -0.2F, -0.2F, 14.55F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 97, 47, -0.2F, -0.2F, 15.8F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 96, 28, -0.2F, -0.2F, 18.3F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 89, 47, -0.2F, -0.2F, 17.05F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 71, 88, -0.2F, -0.2F, 20.8F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 87, 43, -0.2F, -0.2F, 19.55F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 83, 47, -0.2F, -0.2F, 23.3F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 66, 72, -0.2F, -0.2F, 22.05F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 71, 59, -0.2F, -0.2F, 25.8F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 71, 24, -0.2F, -0.2F, 24.55F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 10, 72, -0.2F, -0.2F, 28.3F, 2, 1, 2, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 65, 24, -0.2F, -0.2F, 27.05F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 63, 59, -0.2F, -0.2F, 29.85F, 2, 1, 1, -0.201F, false));
		rail7.cubeList.add(new ModelBox(rail7, 57, 11, -0.2F, -0.2F, 7.05F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 57, 4, -0.2F, -0.2F, 8.3F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 54, 51, -0.2F, -0.2F, 9.55F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 49, 40, -0.2F, -0.2F, 10.8F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 13, 38, -0.2F, -0.2F, 5.8F, 2, 1, 1, -0.2F, false));
		rail7.cubeList.add(new ModelBox(rail7, 0, 72, -0.2F, -0.2F, 3.55F, 2, 1, 2, -0.2F, false));

		cube_r119 = new ModelRenderer(this);
		cube_r119.setRotationPoint(0.0F, 0.6F, 4.75F);
		rail7.addChild(cube_r119);
		setRotationAngle(cube_r119, 0.0F, 0.0F, -0.9425F);
		cube_r119.cubeList.add(new ModelBox(cube_r119, 72, 51, -0.2F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 40, 54, -0.2F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 28, 87, -0.2F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 102, 41, -0.2F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 70, 103, -0.2F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 47, 104, -0.2F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 76, 105, -0.2F, -0.8F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 55, 76, -0.2F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 41, 106, -0.2F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 106, 66, -0.2F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 108, 94, -0.2F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 109, 0, -0.2F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 109, 2, -0.2F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 107, 109, -0.2F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 9, 111, -0.2F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 36, 112, -0.2F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 46, 112, -0.2F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 112, 61, -0.2F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 112, 66, -0.2F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 15, 113, -0.2F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 75, 113, -0.2F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r119.cubeList.add(new ModelBox(cube_r119, 59, 180, -0.1F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));

		cube_r120 = new ModelRenderer(this);
		cube_r120.setRotationPoint(1.6F, 0.6F, 4.75F);
		rail7.addChild(cube_r120);
		setRotationAngle(cube_r120, 0.0F, 0.0F, 0.9425F);
		cube_r120.cubeList.add(new ModelBox(cube_r120, 75, 4, -0.8F, -0.8F, -1.2F, 1, 1, 2, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 77, 29, -0.8F, -0.8F, 1.05F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 17, 87, -0.8F, -0.8F, 6.05F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 98, 30, -0.8F, -0.8F, 4.8F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 47, 102, -0.8F, -0.8F, 3.55F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 76, 103, -0.8F, -0.8F, 2.3F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 75, 8, -0.8F, -0.8F, 23.55F, 1, 1, 2, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 97, 104, -0.8F, -0.8F, 25.1F, 1, 1, 1, -0.201F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 106, 8, -0.8F, -0.8F, 22.3F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 56, 106, -0.8F, -0.8F, 21.05F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 106, 64, -0.8F, -0.8F, 19.8F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 108, 98, -0.8F, -0.8F, 18.55F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 108, 105, -0.8F, -0.8F, 17.3F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 109, 84, -0.8F, -0.8F, 16.05F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 109, 86, -0.8F, -0.8F, 14.8F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 15, 111, -0.8F, -0.8F, 13.55F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 108, 111, -0.8F, -0.8F, 12.3F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 112, 59, -0.8F, -0.8F, 11.05F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 112, 64, -0.8F, -0.8F, 9.8F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 9, 113, -0.8F, -0.8F, 8.55F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 69, 113, -0.8F, -0.8F, 7.3F, 1, 1, 1, -0.202F, false));
		cube_r120.cubeList.add(new ModelBox(cube_r120, 179, 172, -0.9F, -0.9F, -0.45F, 1, 1, 26, -0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
