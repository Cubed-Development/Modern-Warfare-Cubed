package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRPrecisionHandguard extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer handguard1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone7;
	private final ModelRenderer handguard17;
	private final ModelRenderer bone2;
	private final ModelRenderer handguard20;
	private final ModelRenderer bone3;
	private final ModelRenderer ACR110;
	private final ModelRenderer bone8;
	private final ModelRenderer ACR2;
	private final ModelRenderer bone9;

	public ACRPrecisionHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 20, -1.3F, -42.2F, -68.0F, 1, 1, 19, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.7F, -42.2F, -68.0F, 2, 1, 19, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 91, 0.3F, -39.4F, -67.0F, 1, 1, 44, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 49, 0, -4.3F, -39.4F, -67.0F, 1, 1, 44, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 46, 47, -4.3F, -37.1F, -67.0F, 1, 1, 44, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 46, 0.3F, -37.1F, -67.0F, 1, 1, 44, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -35.3F, -68.0F, 2, 1, 45, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 10, -2.51F, -34.8F, -67.0F, 2, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 21, -3.0F, -35.8F, -29.0F, 3, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 48, -0.9F, -35.0F, -26.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 46, 46, -3.1F, -35.0F, -26.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 125, 84, -4.0F, -39.8F, -49.0F, 5, 3, 24, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 46, 46, -4.0F, -39.8F, -67.0F, 1, 1, 18, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 46, 0.0F, -39.8F, -67.0F, 1, 1, 18, 0.0F, false));

		handguard1 = new ModelRenderer(this);
		handguard1.setRotationPoint(0.3F, -39.4F, -49.0F);
		bone.addChild(handguard1);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard1.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 8, 34, -4.61F, 1.0F, 20.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 33, 28, -4.61F, 1.0F, 15.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 23, 5, -4.61F, 1.0F, 23.0F, 1, 2, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 15, 33, -4.61F, 1.0F, 10.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 4, 33, -4.61F, 1.0F, 8.5F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 40, 46, -4.611F, 0.5F, 5.5F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 32, 46, -4.611F, 0.5F, -6.5F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 28, 46, -4.611F, 0.5F, -10.5F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 36, 46, -4.611F, 0.5F, 9.5F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 33, -4.61F, 1.0F, 6.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 32, 23, -4.61F, 1.0F, 4.5F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 32, 20, -4.61F, 1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 32, 32, -4.61F, 1.0F, -5.5F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 25, 32, -4.61F, 1.0F, -7.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 21, 32, -4.61F, 1.0F, -9.5F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 11, 32, -4.61F, 1.0F, -11.0F, 1, 2, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 23, 0, -4.61F, 1.0F, -18.0F, 1, 2, 3, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(4.6F, 0.0F, 0.0F);
		handguard1.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 31, 16, -4.61F, 1.0F, 20.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 31, 13, -4.61F, 1.0F, 15.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 9, 20, -4.61F, 1.0F, 23.0F, 1, 2, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 31, 10, -4.61F, 1.0F, 10.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 31, 7, -4.61F, 1.0F, 8.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 16, 40, -4.611F, 0.5F, 5.5F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 12, 40, -4.611F, 0.5F, -6.5F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 8, 40, -4.611F, 0.5F, -10.5F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 4, 40, -4.611F, 0.5F, 9.5F, 1, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 31, 2, -4.61F, 1.0F, 6.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 8, 30, -4.61F, 1.0F, 4.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 4, 30, -4.61F, 1.0F, -0.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 30, -4.61F, 1.0F, -5.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 28, 5, -4.61F, 1.0F, -7.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 28, 0, -4.61F, 1.0F, -9.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 14, 20, -4.61F, 1.0F, -11.0F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 10, 10, -4.61F, 1.0F, -18.0F, 1, 2, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.6F, 3.2F, 21.0F);
		handguard1.addChild(bone5);
		setRotationAngle(bone5, 0.7854F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 24, 46, -1.011F, -0.9293F, -0.0707F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 20, 46, -1.011F, 0.4849F, 1.3435F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 12, 46, -1.011F, -0.8586F, 2.687F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 8, 46, -1.011F, -2.2728F, 1.2728F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 46, -1.011F, -2.9799F, 0.5657F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 46, -1.011F, -5.8083F, -2.2627F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 39, 43, -1.011F, -4.3941F, -3.677F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 42, -1.011F, -1.5657F, -0.8485F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 32, 42, -1.011F, -5.1012F, -4.3841F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 28, 42, -1.011F, -7.9296F, -7.2125F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 24, 42, -1.011F, -9.3439F, -5.7983F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 20, 42, -1.011F, -6.5154F, -2.9698F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 16, 42, -1.011F, -11.1116F, -7.566F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 12, 42, -1.011F, -12.1723F, -8.6267F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 8, 42, -1.011F, -13.9401F, -10.3945F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 4, 42, -1.011F, -16.7685F, -13.2229F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 42, -1.011F, -17.4756F, -13.93F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 19, -1.011F, -20.304F, -16.7584F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 13, -1.011F, -22.0718F, -18.5262F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 10, -1.011F, -23.1324F, -19.5869F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 7, -1.011F, -24.9002F, -21.3546F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 5, -1.011F, -27.7286F, -24.1831F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 3, -1.011F, -26.3144F, -25.5973F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 41, 1, -1.011F, -23.486F, -22.7688F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 39, 41, -1.011F, -21.7182F, -21.0011F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 40, 30, -1.011F, -20.6576F, -19.9404F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 40, 27, -1.011F, -18.8898F, -18.1726F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 40, -1.011F, -16.0614F, -15.3442F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 32, 40, -1.011F, -15.3543F, -14.6371F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 28, 40, -1.011F, -12.5258F, -11.8087F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 24, 40, -1.011F, -10.7581F, -10.0409F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 20, 40, -1.011F, -9.6974F, -8.9803F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(1.0F, 3.2F, 21.0F);
		handguard1.addChild(bone7);
		setRotationAngle(bone7, 0.7854F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 40, -1.011F, -0.9293F, -0.0707F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 37, -1.011F, 0.4849F, 1.3435F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 34, -1.011F, -0.8586F, 2.687F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 25, -1.011F, -2.2728F, 1.2728F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 23, -1.011F, -2.9799F, 0.5657F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 21, -1.011F, -5.8083F, -2.2627F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 17, -1.011F, -4.3941F, -3.677F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 39, 39, -1.011F, -1.5657F, -0.8485F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 32, -1.011F, -5.1012F, -4.3841F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 15, -1.011F, -7.9296F, -7.2125F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 12, -1.011F, -9.3439F, -5.7983F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 9, -1.011F, -6.5154F, -2.9698F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 6, -1.011F, -11.1116F, -7.566F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 4, -1.011F, -12.1723F, -8.6267F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 38, 0, -1.011F, -13.9401F, -10.3945F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 37, 29, -1.011F, -16.7685F, -13.2229F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 37, 2, -1.011F, -17.4756F, -13.93F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 28, 37, -1.011F, -20.304F, -16.7584F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 15, 37, -1.011F, -22.0718F, -18.5262F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 7, 37, -1.011F, -23.1324F, -19.5869F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 36, 27, -1.011F, -24.9002F, -21.3546F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 36, 24, -1.011F, -27.7286F, -24.1831F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 36, 20, -1.011F, -26.3144F, -25.5973F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 36, 36, -1.011F, -23.486F, -22.7688F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 25, 36, -1.011F, -21.7182F, -21.0011F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 4, 36, -1.011F, -20.6576F, -19.9404F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 35, 34, -1.011F, -18.8898F, -18.1726F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 35, 31, -1.011F, -16.0614F, -15.3442F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 35, 22, -1.011F, -15.3543F, -14.6371F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 13, 25, -1.011F, -12.5258F, -11.8087F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 9, 25, -1.011F, -10.7581F, -10.0409F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 15, 16, -1.011F, -9.6974F, -8.9803F, 1, 1, 1, 0.0F, false));

		handguard17 = new ModelRenderer(this);
		handguard17.setRotationPoint(-0.3F, -35.0F, -49.0F);
		bone.addChild(handguard17);
		setRotationAngle(handguard17, 0.0F, 0.0F, -2.3423F);
		handguard17.cubeList.add(new ModelBox(handguard17, 0, 20, 0.0F, -1.0F, 19.0F, 1, 3, 7, 0.0F, false));
		handguard17.cubeList.add(new ModelBox(handguard17, 95, 0, 0.0F, 1.2F, -18.0F, 1, 1, 37, 0.0F, false));
		handguard17.cubeList.add(new ModelBox(handguard17, 92, 45, 0.0F, -0.9F, -19.0F, 1, 1, 38, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, 2.0F, 19.1F);
		handguard17.addChild(bone2);
		setRotationAngle(bone2, 0.5934F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 29, 29, -1.0F, -2.9F, 0.0F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 15, 29, -1.0F, -5.2F, -3.3162F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 25, 28, -1.0F, -7.4F, -6.6323F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 28, -1.0F, -9.6F, -9.9485F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 3, 23, -1.0F, -11.9F, -13.2646F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 21, 21, -1.0F, -14.13F, -16.5808F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 20, -1.0F, -16.3F, -19.8969F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 15, 9, -1.0F, -18.6F, -23.2131F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 12, -1.0F, -20.8F, -26.5292F, 1, 3, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 36, -1.0F, -22.8618F, -30.5086F, 1, 2, 1, 0.0F, false));

		handguard20 = new ModelRenderer(this);
		handguard20.setRotationPoint(-2.7F, -35.0F, -30.0F);
		bone.addChild(handguard20);
		setRotationAngle(handguard20, 0.0F, 0.0F, 2.3422F);
		handguard20.cubeList.add(new ModelBox(handguard20, 0, 0, -1.0F, -1.0F, 0.0F, 1, 3, 7, 0.0F, false));
		handguard20.cubeList.add(new ModelBox(handguard20, 46, 92, -1.0F, -0.9F, -38.0F, 1, 1, 38, 0.0F, false));
		handguard20.cubeList.add(new ModelBox(handguard20, 86, 92, -1.0F, 1.1F, -37.0F, 1, 1, 37, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, -1.0F);
		handguard20.addChild(bone3);
		setRotationAngle(bone3, 0.5934F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 35, 16, -1.0F, -0.1118F, -0.1658F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 35, 13, -1.0F, -2.3486F, -3.482F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 35, 10, -1.0F, -4.5854F, -6.7981F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 35, 7, -1.0F, -6.8222F, -10.1143F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 32, 35, -1.0F, -9.0589F, -13.4304F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 21, 35, -1.0F, -11.2957F, -16.7466F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 12, 35, -1.0F, -13.5325F, -20.0627F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 34, 4, -1.0F, -15.7692F, -23.3789F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 34, 0, -1.0F, -18.006F, -26.695F, 1, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 28, 34, -1.0F, -20.6901F, -30.6744F, 1, 2, 1, 0.0F, false));

		ACR110 = new ModelRenderer(this);
		ACR110.setRotationPoint(-4.0F, -39.8F, -49.0F);
		bone.addChild(ACR110);
		setRotationAngle(ACR110, 0.0F, 0.0F, -0.9295F);
		ACR110.cubeList.add(new ModelBox(ACR110, 23, 16, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));
		ACR110.cubeList.add(new ModelBox(ACR110, 46, 65, 0.0F, 0.0F, -18.0F, 1, 1, 17, 0.0F, false));
		ACR110.cubeList.add(new ModelBox(ACR110, 0, 65, 1.8F, 0.0F, -18.0F, 1, 1, 17, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		ACR110.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.3142F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 23, 14, 0.3F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 23, 12, 1.5361F, 0.0F, -4.8042F, 3, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 23, 10, 2.7721F, 0.0F, -8.6085F, 3, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 8, 17, 4.0082F, 0.0F, -12.4127F, 3, 1, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 9, 3, 5.5533F, 0.0F, -17.168F, 3, 1, 2, 0.0F, false));

		ACR2 = new ModelRenderer(this);
		ACR2.setRotationPoint(1.0F, -39.8F, -49.0F);
		bone.addChild(ACR2);
		setRotationAngle(ACR2, 0.0F, 0.0F, 0.9295F);
		ACR2.cubeList.add(new ModelBox(ACR2, 0, 17, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));
		ACR2.cubeList.add(new ModelBox(ACR2, 49, 18, -3.0F, 0.0F, -18.0F, 1, 1, 17, 0.0F, false));
		ACR2.cubeList.add(new ModelBox(ACR2, 49, 0, -1.0F, 0.0F, -18.0F, 1, 1, 17, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		ACR2.addChild(bone9);
		setRotationAngle(bone9, 0.0F, -0.3142F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 10, -2.7F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 4, -3.9361F, 0.0F, -4.8042F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 2, -5.1721F, 0.0F, -8.6085F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -6.4082F, 0.0F, -12.4127F, 2, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 9, 0, -8.5F, 0.0F, -17.168F, 3, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}