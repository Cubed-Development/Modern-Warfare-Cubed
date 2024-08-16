package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ACRSquareDropHandguard extends ModelBase {
	private final ModelRenderer SquareDrop_Handguard;
	private final ModelRenderer handguard1;
	private final ModelRenderer bone48_r1;
	private final ModelRenderer bone47_r1;
	private final ModelRenderer bone46_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone32_r1;
	private final ModelRenderer bone33_r1;
	private final ModelRenderer bone35_r1;
	private final ModelRenderer bone36_r1;
	private final ModelRenderer bone38_r1;
	private final ModelRenderer bone39_r1;
	private final ModelRenderer bone41_r1;
	private final ModelRenderer bone42_r1;
	private final ModelRenderer bone44_r1;
	private final ModelRenderer bone45_r1;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone11_r1;
	private final ModelRenderer bone14_r1;

	public ACRSquareDropHandguard() {
		textureWidth = 400;
		textureHeight = 400;

		SquareDrop_Handguard = new ModelRenderer(this);
		SquareDrop_Handguard.setRotationPoint(-1.5F, -14.8F, -34.5F);
		SquareDrop_Handguard.cubeList.add(new ModelBox(SquareDrop_Handguard, 216, 99, -2.5F, -1.0F, -10.5F, 5, 2, 21, 0.0F, false));

		handguard1 = new ModelRenderer(this);
		handguard1.setRotationPoint(1.8F, -0.6F, -14.5F);
		SquareDrop_Handguard.addChild(handguard1);
		handguard1.cubeList.add(new ModelBox(handguard1, 188, 202, -2.8F, 4.1F, -3.0F, 2, 1, 29, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 115, 24, -1.6F, 4.8F, 20.0F, 1, 1, 5, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 141, 55, -3.0F, 4.8F, 20.0F, 2, 1, 5, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 154, 128, -1.5F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 85, 154, -3.1F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 46, 163, 0.5F, 1.3F, 17.0F, 1, 1, 4, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 149, 153, -5.1F, 1.3F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 153, 135, -5.1F, 1.3F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 131, 153, -5.1F, 1.3F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 101, 153, -5.1F, 1.3F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 92, 153, -5.1F, 1.3F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 104, 152, 0.5F, 1.3F, 14.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 95, 152, 0.5F, 1.3F, 11.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 85, 152, 0.5F, 1.3F, 8.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 58, 152, 0.5F, 1.3F, 5.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 49, 152, 0.5F, 1.3F, 2.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 303, 0, 0.5F, 2.3F, -3.0F, 1, 1, 24, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 159, 33, 0.5F, 1.3F, -3.0F, 1, 1, 3, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 35, 125, -4.8F, 0.5F, 21.0F, 1, 3, 4, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 116, 67, 0.2F, 0.5F, 21.0F, 1, 3, 4, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 157, 128, -5.1F, -0.7F, 1.0F, 1, 1, 3, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 155, 145, -4.8F, -0.7F, 0.0F, 1, 1, 3, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 151, 38, 0.2F, -0.7F, 0.0F, 1, 1, 3, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 151, 33, 0.5F, -0.7F, 1.0F, 1, 1, 3, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 50, 301, 0.5F, 0.3F, -3.0F, 1, 1, 24, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 301, -5.1F, 2.3F, -3.0F, 1, 1, 24, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 149, 128, -5.1F, 1.3F, -3.0F, 1, 1, 3, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 162, 8, -5.1F, 1.3F, 17.0F, 1, 1, 4, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 137, 296, -5.1F, 0.3F, -3.0F, 1, 1, 24, 0.0F, false));

		bone48_r1 = new ModelRenderer(this);
		bone48_r1.setRotationPoint(-25.6343F, 27.0414F, 53.5203F);
		handguard1.addChild(bone48_r1);
		setRotationAngle(bone48_r1, 0.6109F, -0.7854F, -0.4538F);
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 150, 76, -4.5F, -38.1F, -30.9F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 7, -4.2172F, -37.9378F, -30.6683F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 9, -3.9343F, -37.7755F, -30.4366F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 11, -3.6515F, -37.6133F, -30.2049F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 17, -3.3686F, -37.4511F, -29.9732F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 19, -3.0858F, -37.2888F, -29.7415F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 21, -2.8029F, -37.1266F, -29.5099F, 1, 1, 1, 0.0F, false));
		bone48_r1.cubeList.add(new ModelBox(bone48_r1, 151, 24, -2.5201F, -36.9644F, -29.2782F, 1, 1, 1, 0.0F, false));

		bone47_r1 = new ModelRenderer(this);
		bone47_r1.setRotationPoint(-23.6662F, 28.7153F, 49.7019F);
		handguard1.addChild(bone47_r1);
		setRotationAngle(bone47_r1, 0.6109F, -0.7854F, -0.4538F);
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 151, 26, 0.9F, -38.1F, -30.9F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 151, 28, 1.1828F, -37.9378F, -30.6683F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 38, 151, 1.4657F, -37.7755F, -30.4366F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 151, 42, 1.7485F, -37.6133F, -30.2049F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 151, 65, 2.0314F, -37.4511F, -29.9732F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 151, 67, 2.3142F, -37.2888F, -29.7415F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 92, 151, 2.5971F, -37.1266F, -29.5099F, 1, 1, 1, 0.0F, false));
		bone47_r1.cubeList.add(new ModelBox(bone47_r1, 101, 151, 2.8799F, -36.9644F, -29.2782F, 1, 1, 1, 0.0F, false));

		bone46_r1 = new ModelRenderer(this);
		bone46_r1.setRotationPoint(-0.3F, 25.5061F, 57.3344F);
		handguard1.addChild(bone46_r1);
		setRotationAngle(bone46_r1, 0.2618F, 0.0F, 0.0F);
		bone46_r1.cubeList.add(new ModelBox(bone46_r1, 151, 133, 0.9F, -39.6F, -48.6F, 1, 1, 1, 0.0F, false));
		bone46_r1.cubeList.add(new ModelBox(bone46_r1, 152, 46, -4.9F, -39.6F, -48.6F, 1, 1, 1, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-37.7579F, 22.3297F, 49.0F);
		handguard1.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.0F, 1.0995F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 0, 92, -4.8F, -40.1F, -46.0F, 1, 1, 18, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(-0.3F, 35.8161F, -11.4256F);
		handguard1.addChild(bone3_r1);
		setRotationAngle(bone3_r1, -1.3614F, 0.0F, 0.0F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 155, 159, 0.81F, -39.1F, -28.0F, 1, 1, 3, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 11, 15, -4.81F, -39.1F, -28.0F, 1, 1, 3, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(-0.3F, 21.2632F, 59.3854F);
		handguard1.addChild(bone4_r1);
		setRotationAngle(bone4_r1, 0.3316F, 0.0F, 0.0F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 160, 17, 0.5F, -40.1F, -52.0F, 1, 1, 3, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 160, 21, -4.5F, -40.1F, -52.0F, 1, 1, 3, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(-0.3F, 27.3619F, -28.7486F);
		handguard1.addChild(bone9_r1);
		setRotationAngle(bone9_r1, -1.7802F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 126, 114, 0.79F, -39.5F, -34.0F, 1, 2, 1, 0.0F, false));
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 87, 120, -4.81F, -39.5F, -34.0F, 1, 2, 1, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-0.3F, -39.3942F, 44.8087F);
		handguard1.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 1.7802F, 0.0F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 127, 47, 0.79F, -37.7F, -34.0F, 1, 2, 1, 0.0F, false));
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 122, 18, -4.81F, -37.7F, -34.0F, 1, 2, 1, 0.0F, false));

		bone32_r1 = new ModelRenderer(this);
		bone32_r1.setRotationPoint(-0.3F, 30.2964F, -32.3722F);
		handguard1.addChild(bone32_r1);
		setRotationAngle(bone32_r1, -1.7802F, 0.0F, 0.0F);
		bone32_r1.cubeList.add(new ModelBox(bone32_r1, 15, 129, -4.81F, -39.5F, -37.0F, 1, 2, 1, 0.0F, false));
		bone32_r1.cubeList.add(new ModelBox(bone32_r1, 78, 139, 0.79F, -39.5F, -37.0F, 1, 2, 1, 0.0F, false));

		bone33_r1 = new ModelRenderer(this);
		bone33_r1.setRotationPoint(-0.3F, -42.3287F, 41.185F);
		handguard1.addChild(bone33_r1);
		setRotationAngle(bone33_r1, 1.7802F, 0.0F, 0.0F);
		bone33_r1.cubeList.add(new ModelBox(bone33_r1, 24, 129, -4.81F, -37.7F, -37.0F, 1, 2, 1, 0.0F, false));
		bone33_r1.cubeList.add(new ModelBox(bone33_r1, 67, 106, 0.79F, -37.7F, -37.0F, 1, 2, 1, 0.0F, false));

		bone35_r1 = new ModelRenderer(this);
		bone35_r1.setRotationPoint(-0.3F, 33.2309F, -35.9959F);
		handguard1.addChild(bone35_r1);
		setRotationAngle(bone35_r1, -1.7802F, 0.0F, 0.0F);
		bone35_r1.cubeList.add(new ModelBox(bone35_r1, 47, 130, -4.81F, -39.5F, -40.0F, 1, 2, 1, 0.0F, false));
		bone35_r1.cubeList.add(new ModelBox(bone35_r1, 0, 111, 0.79F, -39.5F, -40.0F, 1, 2, 1, 0.0F, false));

		bone36_r1 = new ModelRenderer(this);
		bone36_r1.setRotationPoint(-0.3F, -45.2631F, 37.5614F);
		handguard1.addChild(bone36_r1);
		setRotationAngle(bone36_r1, 1.7802F, 0.0F, 0.0F);
		bone36_r1.cubeList.add(new ModelBox(bone36_r1, 131, 0, -4.81F, -37.7F, -40.0F, 1, 2, 1, 0.0F, false));
		bone36_r1.cubeList.add(new ModelBox(bone36_r1, 66, 112, 0.79F, -37.7F, -40.0F, 1, 2, 1, 0.0F, false));

		bone38_r1 = new ModelRenderer(this);
		bone38_r1.setRotationPoint(-0.3F, 36.1653F, -39.6195F);
		handguard1.addChild(bone38_r1);
		setRotationAngle(bone38_r1, -1.7802F, 0.0F, 0.0F);
		bone38_r1.cubeList.add(new ModelBox(bone38_r1, 134, 47, -4.81F, -39.5F, -43.0F, 1, 2, 1, 0.0F, false));
		bone38_r1.cubeList.add(new ModelBox(bone38_r1, 85, 139, 0.79F, -39.5F, -43.0F, 1, 2, 1, 0.0F, false));

		bone39_r1 = new ModelRenderer(this);
		bone39_r1.setRotationPoint(-0.3F, -48.1976F, 33.9378F);
		handguard1.addChild(bone39_r1);
		setRotationAngle(bone39_r1, 1.7802F, 0.0F, 0.0F);
		bone39_r1.cubeList.add(new ModelBox(bone39_r1, 134, 53, -4.81F, -37.7F, -43.0F, 1, 2, 1, 0.0F, false));
		bone39_r1.cubeList.add(new ModelBox(bone39_r1, 110, 140, 0.79F, -37.7F, -43.0F, 1, 2, 1, 0.0F, false));

		bone41_r1 = new ModelRenderer(this);
		bone41_r1.setRotationPoint(-0.3F, 39.0998F, -43.2431F);
		handguard1.addChild(bone41_r1);
		setRotationAngle(bone41_r1, -1.7802F, 0.0F, 0.0F);
		bone41_r1.cubeList.add(new ModelBox(bone41_r1, 137, 0, -4.81F, -39.5F, -46.0F, 1, 2, 1, 0.0F, false));
		bone41_r1.cubeList.add(new ModelBox(bone41_r1, 117, 140, 0.79F, -39.5F, -46.0F, 1, 2, 1, 0.0F, false));

		bone42_r1 = new ModelRenderer(this);
		bone42_r1.setRotationPoint(-0.3F, -51.1321F, 30.3142F);
		handguard1.addChild(bone42_r1);
		setRotationAngle(bone42_r1, 1.7802F, 0.0F, 0.0F);
		bone42_r1.cubeList.add(new ModelBox(bone42_r1, 137, 41, -4.81F, -37.7F, -46.0F, 1, 2, 1, 0.0F, false));
		bone42_r1.cubeList.add(new ModelBox(bone42_r1, 124, 140, 0.79F, -37.7F, -46.0F, 1, 2, 1, 0.0F, false));

		bone44_r1 = new ModelRenderer(this);
		bone44_r1.setRotationPoint(-0.3F, 42.0343F, -46.8667F);
		handguard1.addChild(bone44_r1);
		setRotationAngle(bone44_r1, -1.7802F, 0.0F, 0.0F);
		bone44_r1.cubeList.add(new ModelBox(bone44_r1, 64, 139, -4.81F, -39.5F, -49.0F, 1, 2, 1, 0.0F, false));
		bone44_r1.cubeList.add(new ModelBox(bone44_r1, 131, 140, 0.79F, -39.5F, -49.0F, 1, 2, 1, 0.0F, false));

		bone45_r1 = new ModelRenderer(this);
		bone45_r1.setRotationPoint(-0.3F, -54.0665F, 26.6905F);
		handguard1.addChild(bone45_r1);
		setRotationAngle(bone45_r1, 1.7802F, 0.0F, 0.0F);
		bone45_r1.cubeList.add(new ModelBox(bone45_r1, 71, 139, -4.81F, -37.7F, -49.0F, 1, 2, 1, 0.0F, false));
		bone45_r1.cubeList.add(new ModelBox(bone45_r1, 120, 0, 0.79F, -37.7F, -49.0F, 1, 2, 1, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(35.5201F, 19.6568F, 49.0F);
		handguard1.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, -1.0995F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 47, 93, 0.8F, -40.1F, -46.0F, 1, 1, 18, 0.0F, false));

		bone11_r1 = new ModelRenderer(this);
		bone11_r1.setRotationPoint(21.7888F, 33.2134F, 49.0F);
		handguard1.addChild(bone11_r1);
		setRotationAngle(bone11_r1, 0.0F, 0.0F, -0.6458F);
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 80, 120, -1.2F, -37.1F, -52.0F, 2, 1, 3, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 0, 154, -0.2F, -37.1F, -47.0F, 1, 1, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 154, 2, -0.2F, -37.1F, -44.0F, 1, 1, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 8, 154, -0.2F, -37.1F, -41.0F, 1, 1, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 154, 8, -0.2F, -37.1F, -38.0F, 1, 1, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 154, 10, -0.2F, -37.1F, -35.0F, 1, 1, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 49, 10, -0.2F, -37.1F, -32.0F, 1, 1, 8, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 278, 172, -1.2F, -37.1F, -49.0F, 1, 1, 25, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 154, 18, 0.8F, -37.1F, -52.0F, 1, 1, 1, 0.0F, false));
		bone11_r1.cubeList.add(new ModelBox(bone11_r1, 247, 116, 0.4F, -37.11F, -51.0F, 1, 1, 27, 0.0F, false));

		bone14_r1 = new ModelRenderer(this);
		bone14_r1.setRotationPoint(-22.993F, 35.019F, 49.0F);
		handguard1.addChild(bone14_r1);
		setRotationAngle(bone14_r1, 0.0F, 0.0F, 0.6458F);
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 9, 124, -4.8F, -37.1F, -52.0F, 3, 1, 1, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 47, 57, -3.8F, -37.1F, -32.0F, 1, 1, 8, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 47, 124, -3.8F, -37.1F, -51.0F, 1, 1, 2, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 124, 143, -3.8F, -37.1F, -47.0F, 1, 1, 1, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 154, 20, -3.8F, -37.1F, -44.0F, 1, 1, 1, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 131, 143, -3.8F, -37.1F, -41.0F, 1, 1, 1, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 154, 25, -3.8F, -37.1F, -38.0F, 1, 1, 1, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 154, 27, -3.8F, -37.1F, -35.0F, 1, 1, 1, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 58, 248, -4.4F, -37.1F, -51.0F, 1, 1, 27, 0.0F, false));
		bone14_r1.cubeList.add(new ModelBox(bone14_r1, 248, 144, -2.8F, -37.1F, -51.0F, 1, 1, 27, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		SquareDrop_Handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}