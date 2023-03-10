package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarL extends ModelWithAttachments {
	private final ModelRenderer gun;
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
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun52_r1;
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

	public ScarL() {
		textureWidth = 360;
		textureHeight = 360;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun132 = new ModelRenderer(this);
		gun132.setRotationPoint(-0.15F, -35.9F, -12.8F);
		gun.addChild(gun132);
		setRotationAngle(gun132, 0.0F, 0.0F, -1.5783F);
		gun132.cubeList.add(new ModelBox(gun132, 144, 41, -0.7008F, 0.4322F, -2.95F, 2, 1, 1, -0.2F, false));
		gun132.cubeList.add(new ModelBox(gun132, 41, 144, -0.7001F, 0.4315F, -2.55F, 2, 1, 1, -0.2F, false));

		lowerreceiver = new ModelRenderer(this);
		lowerreceiver.setRotationPoint(0.0F, 0.0F, 0.0F);
		gun.addChild(lowerreceiver);
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 0, -2.999F, -31.0F, -7.5F, 3, 5, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 117, 63, 0.15F, -36.0F, -15.55F, 1, 2, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 159, 128, 0.2F, -34.5F, -15.551F, 1, 1, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 159, 126, -0.1F, -35.5F, -15.8F, 1, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 93, 152, 0.4F, -35.2F, -18.4F, 1, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 126, 133, 0.2F, -33.6F, -16.7F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 151, 124, 0.2F, -33.4F, -16.7F, 1, 1, 1, -0.201F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 122, 151, 0.2F, -32.0F, -16.7F, 1, 1, 1, -0.201F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 97, 132, 0.1F, -33.7F, -6.3F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 89, 150, 0.0F, -33.7F, -7.7F, 1, 1, 1, -0.301F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 89, 132, -4.1F, -33.7F, -6.3F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 150, 83, -4.0F, -33.7F, -7.7F, 1, 1, 1, -0.301F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 117, 85, -0.25F, -32.7F, -20.0F, 1, 1, 4, -0.16F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 133, 115, 0.2F, -31.8F, -16.7F, 1, 1, 2, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 159, 122, -0.1F, -35.5F, -15.3F, 1, 1, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 130, 44, -3.5F, -35.8F, -26.2F, 4, 2, 3, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 0, -3.5F, -36.0F, -23.2F, 4, 8, 8, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 16, -3.5F, -28.0F, -20.2F, 4, 1, 5, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 159, 71, -3.5F, -35.5F, -16.0F, 4, 5, 14, -0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 14, 0, -3.7F, -33.6F, -15.6F, 1, 3, 3, -0.1F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 8, 116, -3.9F, -33.1F, -16.4F, 1, 2, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 81, 132, -3.9F, -33.7F, -15.8F, 1, 1, 2, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 150, 68, -3.7F, -34.2F, -15.1F, 1, 1, 1, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 65, 150, -3.7F, -34.2F, -14.5F, 1, 1, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 116, 306, -3.85F, -34.2F, -14.8F, 1, 1, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 116, 306, -3.95F, -33.4F, -13.8F, 1, 1, 1, -0.2F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 77, 150, -3.8F, -33.6F, -13.6F, 1, 1, 1, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 150, 73, -3.8F, -33.6F, -14.0F, 1, 1, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 73, 150, -3.8F, -33.2F, -14.0F, 1, 1, 1, -0.097F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 69, 150, -3.8F, -33.2F, -13.6F, 1, 1, 1, -0.099F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 73, 132, -3.9F, -31.6F, -15.8F, 1, 1, 2, -0.098F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 26, 37, -3.001F, -32.0F, -15.8F, 3, 5, 1, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 64, -3.001F, -26.75F, -14.3F, 3, 1, 7, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 53, 0, -3.5F, -36.0F, -23.6F, 4, 8, 1, 0.001F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 0, 47, -3.501F, -34.2F, -25.4F, 4, 1, 3, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 106, 71, -3.5F, -33.65F, -1.998F, 4, 1, 4, -0.002F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 108, 15, -3.0F, -33.6F, -2.0F, 3, 2, 4, 0.0F, false));
		lowerreceiver.cubeList.add(new ModelBox(lowerreceiver, 108, 0, -3.5F, -36.0F, -2.001F, 4, 3, 4, 0.0F, false));

		gun58_r1 = new ModelRenderer(this);
		gun58_r1.setRotationPoint(0.499F, -33.8F, -26.2F);
		lowerreceiver.addChild(gun58_r1);
		setRotationAngle(gun58_r1, 0.925F, 0.0F, 0.0F);
		gun58_r1.cubeList.add(new ModelBox(gun58_r1, 82, 49, -3.999F, 0.0F, 0.0F, 4, 1, 1, -0.002F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-3.2F, -30.5F, -13.4F);
		lowerreceiver.addChild(gun31_r1);
		setRotationAngle(gun31_r1, 2.3562F, 0.0F, 0.0F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 32, 101, 0.2F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-3.2F, -30.5F, -8.6F);
		lowerreceiver.addChild(gun30_r1);
		setRotationAngle(gun30_r1, -2.3562F, 0.0F, 0.0F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 40, 101, 0.2F, -2.0F, -1.0F, 3, 2, 1, 0.0F, false));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-3.2F, -26.75F, -8.6F);
		lowerreceiver.addChild(gun29_r1);
		setRotationAngle(gun29_r1, -2.3562F, 0.0F, 0.0F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 11, 60, 0.2F, -1.0F, -2.0F, 3, 1, 2, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-3.2F, -26.45F, -13.6F);
		lowerreceiver.addChild(gun28_r1);
		setRotationAngle(gun28_r1, -2.3562F, 0.0F, 0.0F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 53, 101, 0.2F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-3.8F, -31.2F, -16.3F);
		lowerreceiver.addChild(gun41_r1);
		setRotationAngle(gun41_r1, -0.7854F, 0.0F, 0.0F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 81, 150, -0.1F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-3.8F, -33.0F, -16.3F);
		lowerreceiver.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.7854F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 150, 81, -0.1F, -0.9F, -0.1F, 1, 1, 1, -0.1F, false));

		gun40_r2 = new ModelRenderer(this);
		gun40_r2.setRotationPoint(-3.7F, -32.0F, -15.3F);
		lowerreceiver.addChild(gun40_r2);
		setRotationAngle(gun40_r2, -0.4887F, 0.0F, 0.0F);
		gun40_r2.cubeList.add(new ModelBox(gun40_r2, 150, 79, -0.05F, -0.9F, -0.1F, 1, 1, 1, 0.0F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-3.9F, -27.5F, -23.2F);
		lowerreceiver.addChild(gun51_r1);
		setRotationAngle(gun51_r1, 1.3756F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 53, 11, 0.1F, 0.0806F, 0.0981F, 4, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 10, 84, 0.101F, -0.7194F, 0.098F, 4, 1, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 59, 35, 3.7F, 0.08F, 0.098F, 1, 8, 1, 0.0F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 159, 116, 3.699F, -0.72F, 0.1F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-3.9F, -28.6F, -23.2F);
		lowerreceiver.addChild(gun53_r1);
		setRotationAngle(gun53_r1, 1.4272F, 0.1327F, 0.7409F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 134, 151, 0.065F, 7.0F, 0.085F, 1, 1, 1, -0.001F, false));
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 4, 54, 0.065F, -0.4F, 0.085F, 1, 8, 1, 0.0F, false));

		gun52_r1 = new ModelRenderer(this);
		gun52_r1.setRotationPoint(0.9F, -28.6F, -23.2F);
		lowerreceiver.addChild(gun52_r1);
		setRotationAngle(gun52_r1, 1.4272F, -0.1327F, -0.7409F);
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 138, 151, -1.065F, 7.0F, 0.085F, 1, 1, 1, -0.001F, false));
		gun52_r1.cubeList.add(new ModelBox(gun52_r1, 47, 54, -1.065F, -0.4F, 0.085F, 1, 8, 1, 0.0F, false));

		gun58_r2 = new ModelRenderer(this);
		gun58_r2.setRotationPoint(-3.5F, -33.5F, -25.2F);
		lowerreceiver.addChild(gun58_r2);
		setRotationAngle(gun58_r2, 0.9082F, 0.0F, 0.0F);
		gun58_r2.cubeList.add(new ModelBox(gun58_r2, 63, 48, 0.0F, -0.123F, 0.1577F, 4, 2, 1, -0.004F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-2.0F, -29.4F, -10.35F);
		lowerreceiver.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.1297F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 99, 20, 0.0F, -2.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun131_r1 = new ModelRenderer(this);
		gun131_r1.setRotationPoint(1.0F, -34.2F, -16.5F);
		lowerreceiver.addChild(gun131_r1);
		setRotationAngle(gun131_r1, 0.0F, 0.5236F, 0.0F);
		gun131_r1.cubeList.add(new ModelBox(gun131_r1, 85, 152, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.002F, false));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(1.4F, -34.2F, -17.4F);
		lowerreceiver.addChild(gun130_r1);
		setRotationAngle(gun130_r1, 0.0F, 1.1519F, 0.0F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 81, 152, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		gun130_r2 = new ModelRenderer(this);
		gun130_r2.setRotationPoint(1.0F, -34.2F, -19.3F);
		lowerreceiver.addChild(gun130_r2);
		setRotationAngle(gun130_r2, 0.0F, -0.5236F, 0.0F);
		gun130_r2.cubeList.add(new ModelBox(gun130_r2, 152, 88, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(1.4F, -34.2F, -18.4F);
		lowerreceiver.addChild(gun129_r1);
		setRotationAngle(gun129_r1, 0.0F, -1.1519F, 0.0F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 89, 152, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun131_r2 = new ModelRenderer(this);
		gun131_r2.setRotationPoint(1.0F, -31.0F, -14.9F);
		lowerreceiver.addChild(gun131_r2);
		setRotationAngle(gun131_r2, 0.0F, -0.6632F, 0.0F);
		gun131_r2.cubeList.add(new ModelBox(gun131_r2, 133, 112, -0.8F, -0.8F, -0.2F, 1, 1, 2, -0.201F, false));
		gun131_r2.cubeList.add(new ModelBox(gun131_r2, 118, 133, -0.8F, -2.6F, -0.2F, 1, 1, 2, -0.201F, false));

		gun131_r3 = new ModelRenderer(this);
		gun131_r3.setRotationPoint(1.1F, -31.7F, -15.8F);
		lowerreceiver.addChild(gun131_r3);
		setRotationAngle(gun131_r3, 0.0F, -0.2094F, 0.0F);
		gun131_r3.cubeList.add(new ModelBox(gun131_r3, 126, 151, -1.0F, -1.0F, 0.5F, 1, 1, 1, -0.001F, false));
		gun131_r3.cubeList.add(new ModelBox(gun131_r3, 130, 151, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun131_r4 = new ModelRenderer(this);
		gun131_r4.setRotationPoint(1.1F, -31.7F, -15.8F);
		lowerreceiver.addChild(gun131_r4);
		setRotationAngle(gun131_r4, 0.0F, 0.1745F, 0.0F);
		gun131_r4.cubeList.add(new ModelBox(gun131_r4, 118, 151, -1.0F, -1.0F, -0.9F, 1, 1, 1, -0.15F, false));

		gun132_r1 = new ModelRenderer(this);
		gun132_r1.setRotationPoint(-3.9F, -31.9F, -6.7F);
		lowerreceiver.addChild(gun132_r1);
		setRotationAngle(gun132_r1, 0.4538F, 0.0F, 0.0F);
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 44, 111, 0.0F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));
		gun132_r1.cubeList.add(new ModelBox(gun132_r1, 14, 114, 3.8F, -2.0F, 0.0F, 1, 2, 2, -0.2F, false));

		gun134_r1 = new ModelRenderer(this);
		gun134_r1.setRotationPoint(-3.6F, -32.9F, -4.5F);
		lowerreceiver.addChild(gun134_r1);
		setRotationAngle(gun134_r1, 0.4538F, 0.0F, 0.0F);
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 150, 63, 0.0F, -2.0F, 0.0F, 1, 1, 1, -0.1F, false));
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 85, 150, 3.2F, -2.0F, 0.0F, 1, 1, 1, -0.1F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-3.7F, -29.8F, -8.7F);
		lowerreceiver.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.4538F, 0.0F, 0.0F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 150, 61, 0.0F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 150, 85, 3.4F, -2.0F, 0.0F, 1, 1, 1, -0.2F, false));

		gun60 = new ModelRenderer(this);
		gun60.setRotationPoint(-0.4F, -35.6F, -22.1F);
		lowerreceiver.addChild(gun60);
		setRotationAngle(gun60, -0.3316F, 0.0F, 0.0F);
		gun60.cubeList.add(new ModelBox(gun60, 159, 120, 0.0F, 1.6122F, -3.1466F, 1, 1, 1, 0.0F, false));
		gun60.cubeList.add(new ModelBox(gun60, 159, 118, -3.2F, 1.6122F, -3.1466F, 1, 1, 1, 0.0F, false));

		gun67 = new ModelRenderer(this);
		gun67.setRotationPoint(-3.3F, -33.5F, 1.5F);
		lowerreceiver.addChild(gun67);
		setRotationAngle(gun67, -2.3423F, 0.0F, 0.0F);
		gun67.cubeList.add(new ModelBox(gun67, 130, 99, -0.2F, 0.7807F, 1.8013F, 4, 2, 3, -0.003F, false));
		gun67.cubeList.add(new ModelBox(gun67, 106, 99, 0.3F, -0.2941F, -0.0717F, 3, 2, 5, -0.001F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.7F, 3.4F);
		gun.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 129, 89, -1.8F, -37.8F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 89, 129, -2.2F, -37.8F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 73, 129, -2.2F, -38.2F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 129, 67, -1.8F, -38.2F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 53, 129, -1.6F, -38.0F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 36, 128, -2.4F, -38.0F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 128, -2.0F, -37.6F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 122, -2.0F, -38.4F, -80.5F, 1, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 122, 99, -2.0F, -38.55F, -59.5F, 1, 1, 6, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 92, 24, -2.0F, -39.65F, -58.4F, 1, 1, 5, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 131, 0, -2.0F, -39.65F, -59.6F, 1, 1, 2, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 92, 0, -2.0F, -40.85F, -57.5F, 1, 1, 5, 0.3F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 115, -2.4F, -40.85F, -57.7F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 106, 108, -1.6F, -40.85F, -57.7F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 53, 87, -2.0F, -42.35F, -56.8F, 1, 1, 3, 0.2F, false));
		barrel.cubeList.add(new ModelBox(barrel, 97, 107, -2.0F, -44.35F, -56.1F, 1, 2, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 8, 150, -1.4F, -39.25F, -56.9F, 1, 1, 1, -0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 4, 150, -2.6F, -39.25F, -56.9F, 1, 1, 1, -0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 90, 119, -2.0F, -37.55F, -59.5F, 1, 1, 6, 0.1F, false));
		barrel.cubeList.add(new ModelBox(barrel, 122, 44, -2.3F, -38.35F, -59.5F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 53, 121, -2.3F, -37.75F, -59.5F, 1, 1, 6, 0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 116, -1.7F, -38.35F, -59.5F, 1, 1, 6, 0.099F, false));
		barrel.cubeList.add(new ModelBox(barrel, 76, 119, -1.7F, -37.75F, -59.5F, 1, 1, 6, 0.101F, false));
		barrel.cubeList.add(new ModelBox(barrel, 161, 0, -2.2F, -38.0F, -75.499F, 1, 1, 47, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 148, 160, -1.8F, -38.0F, -75.501F, 1, 1, 47, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 159, 108, -2.0F, -37.8F, -75.5F, 1, 1, 47, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 159, 52, -2.0F, -38.2F, -75.5F, 1, 1, 47, 0.0F, false));

		gun710_r1 = new ModelRenderer(this);
		gun710_r1.setRotationPoint(-2.6F, -39.05F, -59.8F);
		barrel.addChild(gun710_r1);
		setRotationAngle(gun710_r1, 0.0F, 0.0F, 0.5411F);
		gun710_r1.cubeList.add(new ModelBox(gun710_r1, 117, 63, -0.1F, -1.0F, 0.0F, 1, 1, 4, -0.2F, false));

		gun709_r1 = new ModelRenderer(this);
		gun709_r1.setRotationPoint(-0.4F, -39.05F, -59.8F);
		barrel.addChild(gun709_r1);
		setRotationAngle(gun709_r1, 0.0F, 0.0F, -0.5411F);
		gun709_r1.cubeList.add(new ModelBox(gun709_r1, 117, 77, -0.9F, -1.0F, 0.0F, 1, 1, 4, -0.2F, false));

		gun708_r1 = new ModelRenderer(this);
		gun708_r1.setRotationPoint(-0.4F, -41.05F, -57.8F);
		barrel.addChild(gun708_r1);
		setRotationAngle(gun708_r1, 0.0F, 0.0F, -0.5411F);
		gun708_r1.cubeList.add(new ModelBox(gun708_r1, 126, 130, -0.9F, -1.0F, 0.0F, 1, 1, 2, -0.002F, false));

		gun707_r1 = new ModelRenderer(this);
		gun707_r1.setRotationPoint(-2.6F, -41.05F, -57.8F);
		barrel.addChild(gun707_r1);
		setRotationAngle(gun707_r1, 0.0F, 0.0F, 0.5411F);
		gun707_r1.cubeList.add(new ModelBox(gun707_r1, 0, 131, -0.1F, -1.0F, 0.0F, 1, 1, 2, -0.001F, false));

		gun706_r1 = new ModelRenderer(this);
		gun706_r1.setRotationPoint(-2.4F, -41.45F, -55.2F);
		barrel.addChild(gun706_r1);
		setRotationAngle(gun706_r1, -0.3491F, 0.0F, 0.0F);
		gun706_r1.cubeList.add(new ModelBox(gun706_r1, 6, 140, -0.1F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
