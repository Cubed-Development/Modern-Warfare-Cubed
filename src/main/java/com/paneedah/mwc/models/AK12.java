package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK12 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun13_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun20_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun69_r1;
	private final ModelRenderer gun69_r2;
	private final ModelRenderer gun276_r1;
	private final ModelRenderer gun277_r1;
	private final ModelRenderer gun361_r1;
	private final ModelRenderer gun362_r1;
	private final ModelRenderer handguard;
	private final ModelRenderer gun81_r1;
	private final ModelRenderer gun80_r1;
	private final ModelRenderer gun86_r1;
	private final ModelRenderer gun98_r1;
	private final ModelRenderer gun97_r1;
	private final ModelRenderer gun97_r2;
	private final ModelRenderer gun96_r1;
	private final ModelRenderer gun142_r1;
	private final ModelRenderer gun141_r1;
	private final ModelRenderer gun144_r1;
	private final ModelRenderer gun143_r1;
	private final ModelRenderer gun157_r1;
	private final ModelRenderer gun156_r1;
	private final ModelRenderer gun159_r1;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun160_r1;
	private final ModelRenderer gun161_r1;
	private final ModelRenderer gun163_r1;
	private final ModelRenderer gun165_r1;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun344_r1;
	private final ModelRenderer gun364_r1;
	private final ModelRenderer handguard_b;
	private final ModelRenderer gun82_r1;
	private final ModelRenderer gun81_r2;
	private final ModelRenderer gun84_r1;
	private final ModelRenderer gun83_r1;
	private final ModelRenderer gun84_r2;
	private final ModelRenderer gun83_r2;
	private final ModelRenderer gun82_r2;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun143_r2;
	private final ModelRenderer gun142_r2;
	private final ModelRenderer gun158_r2;
	private final ModelRenderer gun157_r2;
	private final ModelRenderer gun170_r1;
	private final ModelRenderer gun169_r1;
	private final ModelRenderer gun169_r2;
	private final ModelRenderer gun168_r1;
	private final ModelRenderer gun220_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun345_r1;
	private final ModelRenderer gun365_r1;
	private final ModelRenderer stock;
	private final ModelRenderer gun314_r1;
	private final ModelRenderer gun313_r1;
	private final ModelRenderer gun317_r1;
	private final ModelRenderer gun316_r1;
	private final ModelRenderer gun319_r1;
	private final ModelRenderer gun329_r1;
	private final ModelRenderer gun331_r1;
	private final ModelRenderer gun331_r2;
	private final ModelRenderer gun332_r1;
	private final ModelRenderer gun335_r1;
	private final ModelRenderer gun337_r1;
	private final ModelRenderer stock_zenitco;
	private final ModelRenderer gun315_r1;
	private final ModelRenderer gun314_r2;
	private final ModelRenderer gun314_r3;
	private final ModelRenderer gun313_r2;
	private final ModelRenderer gun314_r4;
	private final ModelRenderer gun316_r2;
	private final ModelRenderer gun315_r2;
	private final ModelRenderer gun316_r3;
	private final ModelRenderer gun315_r3;
	private final ModelRenderer gun313_r3;
	private final ModelRenderer gun330_r1;
	private final ModelRenderer gun332_r2;
	private final ModelRenderer gun332_r3;
	private final ModelRenderer gun333_r1;
	private final ModelRenderer gun336_r1;
	private final ModelRenderer gun338_r1;
	private final ModelRenderer dustcover;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun26_r2;
	private final ModelRenderer gun308_r1;
	private final ModelRenderer gun212_r1;
	private final ModelRenderer gun240_r2;
	private final ModelRenderer gun307_r1;
	private final ModelRenderer gun307_r2;
	private final ModelRenderer gun306_r1;
	private final ModelRenderer dustcover_b;
	private final ModelRenderer gun26_r3;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r2;
	private final ModelRenderer gun27_r3;
	private final ModelRenderer gun28_r2;
	private final ModelRenderer gun27_r4;
	private final ModelRenderer gun27_r5;
	private final ModelRenderer gun28_r3;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun31_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun32_r2;
	private final ModelRenderer gun309_r1;
	private final ModelRenderer gun213_r1;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun308_r2;
	private final ModelRenderer gun308_r3;
	private final ModelRenderer gun307_r3;
	private final ModelRenderer grip;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun8_r2;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer grip_ergo;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun9_r2;
	private final ModelRenderer gun8_r3;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun8_r4;
	private final ModelRenderer gun7_r2;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun7_r3;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun5_r5;
	private final ModelRenderer gun8_r5;
	private final ModelRenderer gun7_r4;
	private final ModelRenderer gun8_r6;
	private final ModelRenderer gun9_r3;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;

	public AK12() {
		textureWidth = 200;
		textureHeight = 200;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 90, 23, -3.5F, -30.7F, -12.7F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 55, 53, -1.85F, -35.05F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 0, -2.15F, -35.05F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 8, -2.15F, -35.45F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 17, -1.85F, -35.45F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 25, -1.7F, -35.25F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 36, -2.3F, -35.25F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 56, 44, -2.0F, -34.9F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 17, 70, -2.0F, -35.6F, -66.0F, 1, 1, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 36, -2.2F, -35.5F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 47, -2.4F, -35.25F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 39, -2.2F, -35.0F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 44, -2.0F, -34.8F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 47, -1.8F, -35.0F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 52, -1.6F, -35.25F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 52, -1.8F, -35.5F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 17, -2.0F, -35.7F, -59.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 84, -2.0F, -34.8F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 88, -1.8F, -35.0F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 86, 88, -2.2F, -35.0F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 89, -2.4F, -35.25F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 0, -1.6F, -35.25F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 4, -1.8F, -35.5F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 13, -2.2F, -35.5F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 14, 90, -2.0F, -35.7F, -52.0F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 126, -2.2F, -37.55F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 52, -1.8F, -37.55F, -50.5F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 22, 126, -1.8F, -38.0F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 126, -2.2F, -38.0F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 126, 100, -2.4F, -37.8F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 127, -1.6F, -37.8F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 127, -2.0F, -37.35F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 127, -2.0F, -38.2F, -50.5F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 42, -2.2F, -37.8F, -50.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 49, -1.8F, -37.8F, -50.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 55, -2.0F, -37.55F, -50.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 84, -2.0F, -38.0F, -50.0F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -1.8F, -35.25F, -61.0F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 0, -2.2F, -35.25F, -61.0F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 17, -2.0F, -35.0F, -61.0F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 36, -2.0F, -35.5F, -61.0F, 1, 1, 16, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 96, 94, -3.5F, -35.5F, -1.5F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 46, -3.699F, -33.5F, 1.5F, 4, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 41, 132, -3.7F, -35.0F, -2.0F, 4, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 107, -3.702F, -33.0F, -2.0F, 4, 2, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 53, -3.7F, -32.1F, -5.3F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 46, 53, -0.3F, -32.1F, -5.3F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 116, -0.05F, -33.7F, -13.8F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 101, -3.95F, -33.7F, -13.8F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 48, -0.05F, -32.6F, -12.5F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 36, -3.95F, -32.6F, -12.5F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 42, -0.05F, -31.9F, -10.5F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 38, -3.95F, -31.9F, -10.5F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 40, 0.05F, -33.9F, -3.3F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 75, 100, 0.05F, -33.9F, 1.9F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 100, -0.05F, -35.0F, 1.0F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 100, 0.05F, -33.8F, 0.6F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 46, -4.05F, -33.8F, 0.6F, 1, 1, 1, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 65, 100, -4.05F, -33.9F, 1.9F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 101, -0.05F, -31.9F, -6.9F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 20, -4.05F, -33.9F, -3.3F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 100, 90, -3.95F, -31.9F, -6.9F, 1, 1, 1, -0.2F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 52, -0.15F, -33.4F, -21.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 18, -0.15F, -34.9F, -25.2F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 12, -3.85F, -34.9F, -25.2F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 16, -0.15F, -34.9F, -26.6F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 14, -3.85F, -34.9F, -26.6F, 1, 1, 1, -0.1F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 50, -3.85F, -33.4F, -21.5F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 55, -3.9F, -35.3F, -15.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 8, 55, -0.1F, -35.3F, -15.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 118, -3.5F, -33.3F, -20.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 55, -0.301F, -32.5F, -20.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 62, 120, -3.701F, -32.5F, -20.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 28, 55, -0.301F, -34.2F, -20.0F, 1, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 82, 121, -3.699F, -34.2F, -20.0F, 4, 1, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 107, -3.699F, -34.0F, -18.0F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 35, -3.699F, -34.0F, -27.0F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 35, -0.299F, -34.0F, -18.0F, 1, 2, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 18, 35, -0.299F, -34.0F, -27.0F, 1, 2, 7, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 23, 105, -0.4F, -34.0F, -6.0F, 1, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -3.6F, -34.0F, -6.0F, 4, 3, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 101, -3.701F, -34.0F, -6.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 116, -0.299F, -34.0F, -6.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 127, -3.702F, -34.8F, -6.0F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 73, 127, -0.298F, -34.8F, -6.0F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 113, -3.7F, -35.0F, -6.0F, 4, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 127, -0.3F, -35.0F, -6.0F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 36, 71, -0.3F, -35.0F, -2.001F, 1, 4, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 127, -3.7F, -35.0F, 2.001F, 4, 4, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 118, 146, -0.3F, -35.0F, -27.0F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 74, 147, -3.7F, -35.0F, -27.0F, 1, 1, 17, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 72, 84, -0.3F, -35.0F, -10.0F, 1, 4, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 16, 20, -0.8F, -32.7F, -13.5F, 1, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 88, -3.2F, -32.7F, -13.5F, 3, 5, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 54, -3.0F, -28.5F, -11.5F, 3, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 105, -3.7F, -35.0F, -10.0F, 4, 4, 4, 0.0F, false));

		gun13_r1 = new ModelRenderer(this);
		gun13_r1.setRotationPoint(-3.0F, -27.5F, -7.5F);
		gun.addChild(gun13_r1);
		setRotationAngle(gun13_r1, 1.9333F, 0.0F, 0.0F);
		gun13_r1.cubeList.add(new ModelBox(gun13_r1, 25, 90, 0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-0.5F, -28.3F, -12.8F);
		gun.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.1745F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 55, 53, -2.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun20_r1 = new ModelRenderer(this);
		gun20_r1.setRotationPoint(-0.3F, -31.0F, -10.0F);
		gun.addChild(gun20_r1);
		setRotationAngle(gun20_r1, 3.1154F, 0.0F, 0.0F);
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 146, 75, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));
		gun20_r1.cubeList.add(new ModelBox(gun20_r1, 108, 70, -3.4F, 0.0F, 0.0F, 4, 1, 17, 0.0F, false));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(-3.7F, -31.0F, -6.0F);
		gun.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 2.6704F, 0.0F, 0.0F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 18, 44, -0.001F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 29, 44, 3.399F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(-3.7F, -31.0F, -2.0F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, 2.1564F, 0.0F, 0.0F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 0, 99, 0.401F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 108, 100, 0.001F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-3.9F, -33.5F, -4.7F);
		gun.addChild(gun64_r1);
		setRotationAngle(gun64_r1, 0.2974F, 0.0F, 0.0F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 28, 59, 3.8F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 0, 62, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun69_r1 = new ModelRenderer(this);
		gun69_r1.setRotationPoint(-3.7F, -33.0F, 0.0F);
		gun.addChild(gun69_r1);
		setRotationAngle(gun69_r1, -2.4166F, 0.0F, 0.0F);
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 0, 0, 3.399F, -0.4F, 0.0F, 1, 3, 2, 0.0F, false));
		gun69_r1.cubeList.add(new ModelBox(gun69_r1, 0, 93, -0.001F, -0.4F, 0.0F, 4, 3, 2, 0.0F, false));

		gun69_r2 = new ModelRenderer(this);
		gun69_r2.setRotationPoint(-3.7F, -34.5F, 2.0F);
		gun.addChild(gun69_r2);
		setRotationAngle(gun69_r2, -0.8923F, 0.0F, 0.0F);
		gun69_r2.cubeList.add(new ModelBox(gun69_r2, 112, 27, -0.001F, 0.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun276_r1 = new ModelRenderer(this);
		gun276_r1.setRotationPoint(-2.0F, -37.35F, -50.5F);
		gun.addChild(gun276_r1);
		setRotationAngle(gun276_r1, -0.409F, 0.0F, 0.0F);
		gun276_r1.cubeList.add(new ModelBox(gun276_r1, 55, 56, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun277_r1 = new ModelRenderer(this);
		gun277_r1.setRotationPoint(-2.0F, -37.35F, -50.0F);
		gun.addChild(gun277_r1);
		setRotationAngle(gun277_r1, -0.1487F, 0.0F, 0.0F);
		gun277_r1.cubeList.add(new ModelBox(gun277_r1, 56, 44, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		gun361_r1 = new ModelRenderer(this);
		gun361_r1.setRotationPoint(-2.0F, -32.0F, -8.0F);
		gun.addChild(gun361_r1);
		setRotationAngle(gun361_r1, -0.2231F, 0.0F, 0.0F);
		gun361_r1.cubeList.add(new ModelBox(gun361_r1, 38, 60, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun362_r1 = new ModelRenderer(this);
		gun362_r1.setRotationPoint(-2.0F, -30.3F, -8.35F);
		gun.addChild(gun362_r1);
		setRotationAngle(gun362_r1, -0.4833F, 0.0F, 0.0F);
		gun362_r1.cubeList.add(new ModelBox(gun362_r1, 114, 108, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard.cubeList.add(new ModelBox(handguard, 101, 107, -2.5F, -34.0F, -45.001F, 2, 2, 18, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 19, -2.0F, -39.1F, -37.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 13, -2.0F, -39.1F, -40.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 7, -2.0F, -39.1F, -43.5F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 17, -2.0F, -39.1F, -39.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 15, -2.0F, -39.1F, -42.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 104, 10, -2.0F, -39.1F, -45.0F, 1, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 51, 146, -1.2F, -37.7F, -44.9F, 1, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 108, 84, -3.5F, -35.2F, -44.999F, 4, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 132, -3.0F, -34.5F, -45.0F, 3, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 164, 114, -2.8F, -37.7F, -44.9F, 2, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 159, 162, -0.1F, -35.0F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 164, -3.9F, -35.0F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 116, 164, -2.6F, -39.001F, -45.002F, 2, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 86, 84, -1.4F, -39.001F, -45.0F, 1, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 159, 93, -2.999F, -36.8F, -45.0F, 3, 2, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 163, 136, -2.999F, -38.2F, -45.0F, 3, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 61, 96, -3.001F, -37.0F, -37.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 86, 94, -3.001F, -37.0F, -41.3F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 94, -3.001F, -37.0F, -45.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 96, 81, -3.0F, -37.0F, -37.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 14, 96, -3.0F, -37.0F, -40.6F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 94, -3.0F, -37.0F, -44.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 71, -3.0F, -38.1F, -40.6F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 73, -3.0F, -38.1F, -41.3F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 75, -3.0F, -38.1F, -37.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 77, -3.0F, -38.1F, -37.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 83, -3.0F, -38.1F, -44.5F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 97, 85, -3.0F, -38.1F, -45.0F, 3, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 58, 164, 0.0F, -35.6F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 156, 0, 0.1F, -34.4F, -43.0F, 1, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 164, -4.0F, -35.6F, -43.0F, 1, 1, 10, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 153, 22, -4.1F, -34.4F, -43.0F, 1, 1, 11, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 81, -4.0F, -34.8F, -28.0F, 5, 1, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 22, 132, -3.798F, -33.6F, -28.0F, 4, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 55, 61, -0.198F, -33.6F, -28.0F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 16, 20, -3.8F, -35.2F, -35.0F, 1, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 39, 106, -0.2F, -35.2F, -35.0F, 1, 2, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 46, 60, -1.201F, -39.4F, -34.001F, 1, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 38, 44, -2.801F, -39.401F, -34.002F, 2, 2, 1, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 26, 74, -2.8F, -39.201F, -36.0F, 2, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 28, 52, -1.2F, -39.2F, -36.0F, 1, 1, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 6, -0.95F, -39.3F, -36.0F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 4, -0.85F, -39.3F, -34.1F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 2, -3.15F, -39.3F, -34.1F, 1, 1, 1, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 101, 0, -3.05F, -39.3F, -36.0F, 1, 1, 1, -0.2F, false));
		handguard.cubeList.add(new ModelBox(handguard, 36, 90, -3.0F, -38.2F, -36.0F, 3, 2, 3, 0.0F, false));

		gun81_r1 = new ModelRenderer(this);
		gun81_r1.setRotationPoint(0.8F, -35.2F, -35.0F);
		handguard.addChild(gun81_r1);
		setRotationAngle(gun81_r1, 0.0F, 0.0F, 1.1694F);
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 50, 84, -1.7F, -0.001F, -1.0F, 1, 1, 9, 0.0F, false));
		gun81_r1.cubeList.add(new ModelBox(gun81_r1, 14, 86, -1.0F, 0.0F, -1.0F, 1, 1, 9, 0.0F, false));

		gun80_r1 = new ModelRenderer(this);
		gun80_r1.setRotationPoint(-3.8F, -35.2F, -35.0F);
		handguard.addChild(gun80_r1);
		setRotationAngle(gun80_r1, 0.0F, 0.0F, -1.1694F);
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 86, 71, 0.7F, -0.001F, -1.0F, 1, 1, 9, 0.0F, false));
		gun80_r1.cubeList.add(new ModelBox(gun80_r1, 48, 164, 0.0F, 0.0F, -1.0F, 1, 1, 9, 0.0F, false));

		gun86_r1 = new ModelRenderer(this);
		gun86_r1.setRotationPoint(-0.2F, -31.6F, -28.0F);
		handguard.addChild(gun86_r1);
		setRotationAngle(gun86_r1, 2.0076F, 0.0F, 0.0F);
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 38, 39, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun86_r1.cubeList.add(new ModelBox(gun86_r1, 112, 14, -3.599F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun98_r1 = new ModelRenderer(this);
		gun98_r1.setRotationPoint(-4.1F, -34.4F, -32.0F);
		handguard.addChild(gun98_r1);
		setRotationAngle(gun98_r1, 0.0F, 1.7846F, 0.0F);
		gun98_r1.cubeList.add(new ModelBox(gun98_r1, 56, 27, -2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun97_r1 = new ModelRenderer(this);
		gun97_r1.setRotationPoint(-4.0F, -35.6F, -33.0F);
		handguard.addChild(gun97_r1);
		setRotationAngle(gun97_r1, 0.0F, 1.7846F, 0.0F);
		gun97_r1.cubeList.add(new ModelBox(gun97_r1, 101, 101, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun97_r2 = new ModelRenderer(this);
		gun97_r2.setRotationPoint(1.1F, -34.4F, -32.0F);
		handguard.addChild(gun97_r2);
		setRotationAngle(gun97_r2, 0.0F, -1.7846F, 0.0F);
		gun97_r2.cubeList.add(new ModelBox(gun97_r2, 56, 25, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun96_r1 = new ModelRenderer(this);
		gun96_r1.setRotationPoint(1.0F, -35.6F, -33.0F);
		handguard.addChild(gun96_r1);
		setRotationAngle(gun96_r1, 0.0F, -1.7846F, 0.0F);
		gun96_r1.cubeList.add(new ModelBox(gun96_r1, 16, 102, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun142_r1 = new ModelRenderer(this);
		gun142_r1.setRotationPoint(-3.0F, -38.2F, -45.0F);
		handguard.addChild(gun142_r1);
		setRotationAngle(gun142_r1, 0.0F, 0.0F, -2.3423F);
		gun142_r1.cubeList.add(new ModelBox(gun142_r1, 90, 0, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun141_r1 = new ModelRenderer(this);
		gun141_r1.setRotationPoint(0.0F, -38.2F, -45.0F);
		handguard.addChild(gun141_r1);
		setRotationAngle(gun141_r1, 0.0F, 0.0F, 2.3423F);
		gun141_r1.cubeList.add(new ModelBox(gun141_r1, 26, 164, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun144_r1 = new ModelRenderer(this);
		gun144_r1.setRotationPoint(1.0F, -35.6F, -43.0F);
		handguard.addChild(gun144_r1);
		setRotationAngle(gun144_r1, 0.0F, 0.0F, 0.5577F);
		gun144_r1.cubeList.add(new ModelBox(gun144_r1, 73, 127, -1.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun143_r1 = new ModelRenderer(this);
		gun143_r1.setRotationPoint(-4.0F, -35.6F, -43.0F);
		handguard.addChild(gun143_r1);
		setRotationAngle(gun143_r1, 0.0F, 0.0F, -0.5577F);
		gun143_r1.cubeList.add(new ModelBox(gun143_r1, 93, 147, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun157_r1 = new ModelRenderer(this);
		gun157_r1.setRotationPoint(-0.5F, -32.2F, -45.0F);
		handguard.addChild(gun157_r1);
		setRotationAngle(gun157_r1, 0.0F, 0.0F, 2.2679F);
		gun157_r1.cubeList.add(new ModelBox(gun157_r1, 124, 89, -2.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun156_r1 = new ModelRenderer(this);
		gun156_r1.setRotationPoint(-2.5F, -32.2F, -45.0F);
		handguard.addChild(gun156_r1);
		setRotationAngle(gun156_r1, 0.0F, 0.0F, -2.2679F);
		gun156_r1.cubeList.add(new ModelBox(gun156_r1, 0, 126, 0.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun159_r1 = new ModelRenderer(this);
		gun159_r1.setRotationPoint(1.1F, -33.4F, -43.0F);
		handguard.addChild(gun159_r1);
		setRotationAngle(gun159_r1, 0.0F, 0.0F, 0.8923F);
		gun159_r1.cubeList.add(new ModelBox(gun159_r1, 38, 146, -1.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-4.1F, -33.4F, -43.0F);
		handguard.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 0.0F, 0.0F, -0.8923F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 146, 93, 0.0F, 0.0F, 0.0F, 1, 2, 11, 0.0F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(-3.1F, -35.9F, -45.0F);
		handguard.addChild(gun160_r1);
		setRotationAngle(gun160_r1, 0.0F, 0.0F, 0.6692F);
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 102, 59, 0.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 115, 50, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));

		gun161_r1 = new ModelRenderer(this);
		gun161_r1.setRotationPoint(-3.0F, -33.6F, -45.0F);
		handguard.addChild(gun161_r1);
		setRotationAngle(gun161_r1, 0.0F, 0.0F, -2.3423F);
		gun161_r1.cubeList.add(new ModelBox(gun161_r1, 65, 102, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun161_r1.cubeList.add(new ModelBox(gun161_r1, 115, 48, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));

		gun163_r1 = new ModelRenderer(this);
		gun163_r1.setRotationPoint(-0.7F, -35.2F, -45.0F);
		handguard.addChild(gun163_r1);
		setRotationAngle(gun163_r1, 0.0F, 0.0F, -0.7064F);
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 75, 102, 0.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		gun163_r1.cubeList.add(new ModelBox(gun163_r1, 115, 46, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));

		gun165_r1 = new ModelRenderer(this);
		gun165_r1.setRotationPoint(-0.7F, -34.4F, -45.0F);
		handguard.addChild(gun165_r1);
		setRotationAngle(gun165_r1, 0.0F, 0.0F, -0.7238F);
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 102, 94, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun165_r1.cubeList.add(new ModelBox(gun165_r1, 115, 40, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(-2.7F, -39.1F, -45.0F);
		handguard.addChild(gun219_r1);
		setRotationAngle(gun219_r1, 0.0F, 0.0F, -0.2231F);
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 102, 96, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 103, 26, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 103, 30, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 103, 24, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 103, 28, 0.0F, 0.0F, 4.5F, 1, 1, 1, 0.0F, false));
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 103, 61, 0.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-1.3F, -39.3F, -45.0F);
		handguard.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.0F, 0.0F, 0.192F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 103, 65, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 104, 1, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 104, 3, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 103, 63, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 100, 103, 0.0F, 0.0F, 4.5F, 1, 1, 1, 0.0F, false));
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 104, 5, 0.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));

		gun344_r1 = new ModelRenderer(this);
		gun344_r1.setRotationPoint(-2.7F, -32.09F, -45.0F);
		handguard.addChild(gun344_r1);
		setRotationAngle(gun344_r1, 0.0F, 0.0F, -1.1154F);
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 37, 0.0F, 0.0F, 16.0F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 43, 112, 0.0F, 0.0F, 13.0F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 47, 0.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 39, 112, 0.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 49, 112, 0.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 35, 0.0F, 0.0F, 14.5F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 41, 0.0F, 0.0F, 11.5F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 45, 0.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 39, 0.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 112, 49, 0.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		gun344_r1.cubeList.add(new ModelBox(gun344_r1, 47, 20, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun364_r1 = new ModelRenderer(this);
		gun364_r1.setRotationPoint(-0.8F, -32.95F, -42.5F);
		handguard.addChild(gun364_r1);
		setRotationAngle(gun364_r1, 0.0F, 0.0F, 1.1897F);
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 112, 54, 0.0F, 0.0F, 13.5F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 93, 113, 0.0F, 0.0F, 10.5F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 105, 113, 0.0F, 0.0F, 4.5F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 0, 113, 0.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 111, 113, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 53, 112, 0.0F, 0.0F, 12.0F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 12, 113, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 101, 113, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 112, 56, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 47, 25, 0.0F, 0.0F, -2.5F, 1, 1, 2, 0.0F, false));
		gun364_r1.cubeList.add(new ModelBox(gun364_r1, 114, 110, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		handguard_b = new ModelRenderer(this);
		handguard_b.setRotationPoint(0.0F, 24.0F, 0.0F);
		handguard_b.cubeList.add(new ModelBox(handguard_b, 40, 106, -2.5F, -34.0F, -45.001F, 2, 2, 18, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 17, 74, -2.0F, -39.1F, -37.5F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 38, 63, -2.0F, -39.1F, -34.5F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 8, 74, -2.0F, -39.1F, -40.5F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 0, 74, -2.0F, -39.1F, -43.5F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 63, 73, -2.0F, -39.1F, -39.0F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 20, 62, -2.0F, -39.1F, -36.0F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 50, 73, -2.0F, -39.1F, -42.0F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 43, 73, -2.0F, -39.1F, -45.0F, 1, 1, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 137, 147, -4.0F, -34.95F, -45.0F, 5, 1, 14, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 0, 52, -3.0F, -36.95F, -44.999F, 3, 2, 14, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 112, 54, -3.999F, -34.45F, -45.001F, 5, 1, 14, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 164, 104, -2.8F, -37.7F, -44.9F, 2, 1, 9, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 0, 20, -2.6F, -39.001F, -45.0F, 2, 1, 12, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 36, 84, -1.4F, -39.001F, -45.0F, 1, 1, 12, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 145, 162, -2.999F, -38.2F, -45.0F, 3, 1, 9, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 36, 80, -4.0F, -34.8F, -28.0F, 5, 2, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 121, 131, -3.798F, -33.6F, -28.0F, 4, 2, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 49, 0, -0.198F, -33.6F, -28.0F, 1, 2, 1, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 78, 127, -3.8F, -35.2F, -45.0F, 1, 2, 18, 0.0F, false));
		handguard_b.cubeList.add(new ModelBox(handguard_b, 40, 126, -0.2F, -35.2F, -45.0F, 1, 2, 18, 0.0F, false));

		gun82_r1 = new ModelRenderer(this);
		gun82_r1.setRotationPoint(0.8F, -35.2F, -35.0F);
		handguard_b.addChild(gun82_r1);
		setRotationAngle(gun82_r1, 0.0F, 0.0F, 1.2043F);
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 20, 59, -1.7F, -0.001F, 2.0F, 1, 1, 6, 0.0F, false));
		gun82_r1.cubeList.add(new ModelBox(gun82_r1, 0, 70, -1.0F, 0.0F, 2.0F, 1, 1, 6, 0.0F, false));

		gun81_r2 = new ModelRenderer(this);
		gun81_r2.setRotationPoint(-3.8F, -35.2F, -35.0F);
		handguard_b.addChild(gun81_r2);
		setRotationAngle(gun81_r2, 0.0F, 0.0F, -1.309F);
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 38, 60, 0.7F, -0.001F, 2.0F, 1, 1, 6, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 36, 71, 1.5F, -0.001F, -10.0F, 1, 1, 12, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 76, 13, 2.0F, 0.0F, -10.0F, 1, 1, 12, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 27, 35, 1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 55, 64, 1.0F, 0.0F, -3.0F, 1, 1, 1, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 65, 0, 1.0F, 0.0F, -6.0F, 1, 1, 1, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 38, 20, 1.0F, 0.0F, -10.0F, 1, 1, 2, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 76, 49, 0.0F, 0.0F, -10.0F, 1, 1, 12, 0.0F, false));
		gun81_r2.cubeList.add(new ModelBox(gun81_r2, 0, 77, 0.0F, 0.0F, 2.0F, 1, 1, 6, 0.0F, false));

		gun84_r1 = new ModelRenderer(this);
		gun84_r1.setRotationPoint(0.8F, -35.2F, -47.0F);
		handguard_b.addChild(gun84_r1);
		setRotationAngle(gun84_r1, 0.0F, 0.0F, 1.309F);
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 72, 71, -2.5F, -0.001F, 2.0F, 1, 1, 12, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 76, 0, -3.0F, 0.0F, 2.0F, 1, 1, 12, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 38, 17, -2.0F, 0.0F, 12.0F, 1, 1, 2, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 65, 2, -2.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 65, 4, -2.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 38, 25, -2.0F, 0.0F, 2.0F, 1, 1, 2, 0.0F, false));
		gun84_r1.cubeList.add(new ModelBox(gun84_r1, 76, 36, -1.0F, 0.0F, 2.0F, 1, 1, 12, 0.0F, false));

		gun83_r1 = new ModelRenderer(this);
		gun83_r1.setRotationPoint(-3.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun83_r1);
		setRotationAngle(gun83_r1, 0.0F, 0.0F, 0.2618F);
		gun83_r1.cubeList.add(new ModelBox(gun83_r1, 38, 36, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun84_r2 = new ModelRenderer(this);
		gun84_r2.setRotationPoint(-3.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun84_r2);
		setRotationAngle(gun84_r2, 0.0F, -0.0524F, 0.2618F);
		gun84_r2.cubeList.add(new ModelBox(gun84_r2, 48, 119, 0.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		gun83_r2 = new ModelRenderer(this);
		gun83_r2.setRotationPoint(0.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun83_r2);
		setRotationAngle(gun83_r2, 0.0F, 0.0524F, -0.2618F);
		gun83_r2.cubeList.add(new ModelBox(gun83_r2, 120, 101, -1.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		gun82_r2 = new ModelRenderer(this);
		gun82_r2.setRotationPoint(0.5F, -37.1F, -40.0F);
		handguard_b.addChild(gun82_r2);
		setRotationAngle(gun82_r2, 0.0F, 0.0F, -0.2618F);
		gun82_r2.cubeList.add(new ModelBox(gun82_r2, 38, 44, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-0.2F, -31.6F, -28.0F);
		handguard_b.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 2.0076F, 0.0F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 27, 38, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 76, 9, -3.599F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(1.0F, -34.8F, -28.0F);
		handguard_b.addChild(gun88_r1);
		setRotationAngle(gun88_r1, -1.117F, 0.0F, 0.0F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 12, 99, -4.999F, 0.0F, 0.0F, 5, 1, 2, 0.0F, false));

		gun143_r2 = new ModelRenderer(this);
		gun143_r2.setRotationPoint(-3.0F, -38.2F, -45.0F);
		handguard_b.addChild(gun143_r2);
		setRotationAngle(gun143_r2, 0.0F, 0.0F, -2.0595F);
		gun143_r2.cubeList.add(new ModelBox(gun143_r2, 72, 84, -1.0F, 0.0F, -0.002F, 1, 1, 12, 0.0F, false));

		gun142_r2 = new ModelRenderer(this);
		gun142_r2.setRotationPoint(0.0F, -38.2F, -45.0F);
		handguard_b.addChild(gun142_r2);
		setRotationAngle(gun142_r2, 0.0F, 0.0F, 2.0595F);
		gun142_r2.cubeList.add(new ModelBox(gun142_r2, 0, 86, 0.0F, 0.0F, -0.002F, 1, 1, 12, 0.0F, false));

		gun158_r2 = new ModelRenderer(this);
		gun158_r2.setRotationPoint(-0.5F, -32.2F, -45.0F);
		handguard_b.addChild(gun158_r2);
		setRotationAngle(gun158_r2, 0.0F, 0.0F, 2.2679F);
		gun158_r2.cubeList.add(new ModelBox(gun158_r2, 112, 35, -2.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun157_r2 = new ModelRenderer(this);
		gun157_r2.setRotationPoint(-2.5F, -32.2F, -45.0F);
		handguard_b.addChild(gun157_r2);
		setRotationAngle(gun157_r2, 0.0F, 0.0F, -2.2679F);
		gun157_r2.cubeList.add(new ModelBox(gun157_r2, 123, 109, 0.0F, 0.0F, 0.001F, 2, 1, 18, 0.0F, false));

		gun170_r1 = new ModelRenderer(this);
		gun170_r1.setRotationPoint(-5.2F, -33.5F, -33.0F);
		handguard_b.addChild(gun170_r1);
		setRotationAngle(gun170_r1, 0.0F, 0.0F, -0.4446F);
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 21, 1.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 36, 1.0F, 0.0F, -3.002F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 40, 1.0F, 0.0F, -6.002F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 46, 1.0F, 0.0F, -9.002F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 66, 61, 1.0F, 0.0F, -12.002F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 25, 1.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 29, 1.0F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 38, 1.0F, 0.0F, -4.5F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 44, 1.0F, 0.0F, -7.5F, 1, 1, 1, 0.0F, false));
		gun170_r1.cubeList.add(new ModelBox(gun170_r1, 65, 48, 1.0F, 0.0F, -10.5F, 1, 1, 1, 0.0F, false));

		gun169_r1 = new ModelRenderer(this);
		gun169_r1.setRotationPoint(0.0F, -33.5F, -33.0F);
		handguard_b.addChild(gun169_r1);
		setRotationAngle(gun169_r1, 0.0F, 0.0F, 0.4446F);
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 65, 10, 0.0F, -1.0F, -0.002F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 68, 28, 0.0F, -1.0F, -3.002F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 68, 41, 0.0F, -1.0F, -6.002F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 0, 70, 0.0F, -1.0F, -9.002F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 17, 70, 0.0F, -1.0F, -12.002F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 65, 8, 0.0F, -1.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 68, 26, 0.0F, -1.0F, -1.5F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 68, 39, 0.0F, -1.0F, -4.5F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 68, 49, 0.0F, -1.0F, -7.5F, 1, 1, 1, 0.0F, false));
		gun169_r1.cubeList.add(new ModelBox(gun169_r1, 8, 70, 0.0F, -1.0F, -10.5F, 1, 1, 1, 0.0F, false));

		gun169_r2 = new ModelRenderer(this);
		gun169_r2.setRotationPoint(-3.0F, -34.9F, -33.0F);
		handguard_b.addChild(gun169_r2);
		setRotationAngle(gun169_r2, 0.0F, 0.0F, 0.4446F);
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 65, 19, -1.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 1, -1.0F, 0.0F, -3.002F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 5, -1.0F, 0.0F, -6.002F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 11, -1.0F, 0.0F, -9.002F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 18, -1.0F, 0.0F, -12.002F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 65, 27, -1.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 66, 63, -1.0F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 3, -1.0F, 0.0F, -4.5F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 9, -1.0F, 0.0F, -7.5F, 1, 1, 1, 0.0F, false));
		gun169_r2.cubeList.add(new ModelBox(gun169_r2, 68, 13, -1.0F, 0.0F, -10.5F, 1, 1, 1, 0.0F, false));

		gun168_r1 = new ModelRenderer(this);
		gun168_r1.setRotationPoint(0.0F, -34.9F, -33.0F);
		handguard_b.addChild(gun168_r1);
		setRotationAngle(gun168_r1, 0.0F, 0.0F, -0.4446F);
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 65, 12, 0.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 68, 20, 0.0F, 0.0F, -3.002F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 68, 30, 0.0F, 0.0F, -6.002F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 68, 45, 0.0F, 0.0F, -9.002F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 11, 71, 0.0F, 0.0F, -12.002F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 65, 17, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 68, 22, 0.0F, 0.0F, -1.5F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 68, 37, 0.0F, 0.0F, -4.5F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 68, 47, 0.0F, 0.0F, -7.5F, 1, 1, 1, 0.0F, false));
		gun168_r1.cubeList.add(new ModelBox(gun168_r1, 20, 71, 0.0F, 0.0F, -10.5F, 1, 1, 1, 0.0F, false));

		gun220_r1 = new ModelRenderer(this);
		gun220_r1.setRotationPoint(-2.7F, -39.1F, -45.0F);
		handguard_b.addChild(gun220_r1);
		setRotationAngle(gun220_r1, 0.0F, 0.0F, -0.2231F);
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 36, 71, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 43, 71, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 28, 62, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 50, 71, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 63, 71, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 0, 72, 0.0F, 0.0F, 4.5F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 49, 64, 0.0F, 0.0F, 10.5F, 1, 1, 1, 0.0F, false));
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 8, 72, 0.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-1.3F, -39.3F, -45.0F);
		handguard_b.addChild(gun240_r1);
		setRotationAngle(gun240_r1, 0.0F, 0.0F, 0.192F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 17, 72, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 53, 72, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 49, 62, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 66, 72, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 11, 73, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 20, 73, 0.0F, 0.0F, 4.5F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 46, 63, 0.0F, 0.0F, 10.5F, 1, 1, 1, 0.0F, false));
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 36, 73, 0.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));

		gun345_r1 = new ModelRenderer(this);
		gun345_r1.setRotationPoint(-2.7F, -32.09F, -45.0F);
		handguard_b.addChild(gun345_r1);
		setRotationAngle(gun345_r1, 0.0F, 0.0F, -1.1154F);
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 53, 74, 0.0F, 0.0F, 16.0F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 66, 74, 0.0F, 0.0F, 13.0F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 20, 75, 0.0F, 0.0F, 7.0F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 50, 75, 0.0F, 0.0F, 10.0F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 63, 75, 0.0F, 0.0F, 4.0F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 76, 13, 0.0F, 0.0F, 14.5F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 76, 15, 0.0F, 0.0F, 11.5F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 76, 19, 0.0F, 0.0F, 5.5F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 76, 21, 0.0F, 0.0F, 8.5F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 76, 26, 0.0F, 0.0F, 2.5F, 1, 1, 1, 0.0F, false));
		gun345_r1.cubeList.add(new ModelBox(gun345_r1, 38, 28, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun365_r1 = new ModelRenderer(this);
		gun365_r1.setRotationPoint(-0.8F, -32.95F, -42.5F);
		handguard_b.addChild(gun365_r1);
		setRotationAngle(gun365_r1, 0.0F, 0.0F, 1.1897F);
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 28, 0.0F, 0.0F, 13.5F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 30, 0.0F, 0.0F, 10.5F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 36, 0.0F, 0.0F, 4.5F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 38, 0.0F, 0.0F, 7.5F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 42, 0.0F, 0.0F, 1.5F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 44, 0.0F, 0.0F, 12.0F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 49, 0.0F, 0.0F, 9.0F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 51, 0.0F, 0.0F, 3.0F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 53, 76, 0.0F, 0.0F, 6.0F, 1, 1, 1, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 38, 36, 0.0F, 0.0F, -2.5F, 1, 1, 2, 0.0F, false));
		gun365_r1.cubeList.add(new ModelBox(gun365_r1, 76, 55, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock.cubeList.add(new ModelBox(stock, 76, 36, -2.0F, -32.1F, 9.0F, 1, 1, 5, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 115, -2.0F, -31.6F, 12.0F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 86, 75, -2.0F, -31.5F, 13.5F, 1, 1, 3, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 90, 17, -2.5F, -26.4F, 18.9F, 2, 1, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 112, 45, -2.5F, -31.8F, 15.0F, 2, 1, 7, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 90, 49, -0.7F, -35.6F, 10.0F, 1, 1, 9, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 163, 126, -3.3F, -35.6F, 10.0F, 3, 1, 9, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 133, 54, -0.7F, -35.3F, 4.5F, 1, 4, 17, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 0, 105, -3.3F, -35.3F, 4.5F, 3, 4, 17, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 100, 23, -3.5F, -34.3F, 5.5F, 1, 1, 1, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 123, 117, -3.0F, -35.3F, 2.5F, 3, 4, 2, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 38, 10, -0.05F, -35.3F, 3.0F, 1, 4, 1, 0.0F, false));

		gun314_r1 = new ModelRenderer(this);
		gun314_r1.setRotationPoint(-3.3F, -35.6F, 10.0F);
		stock.addChild(gun314_r1);
		setRotationAngle(gun314_r1, 0.0F, 0.0F, -1.3756F);
		gun314_r1.cubeList.add(new ModelBox(gun314_r1, 0, 163, -3.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F, false));

		gun313_r1 = new ModelRenderer(this);
		gun313_r1.setRotationPoint(0.3F, -35.6F, 10.0F);
		stock.addChild(gun313_r1);
		setRotationAngle(gun313_r1, 0.0F, 0.0F, 1.3756F);
		gun313_r1.cubeList.add(new ModelBox(gun313_r1, 101, 163, 0.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F, false));

		gun317_r1 = new ModelRenderer(this);
		gun317_r1.setRotationPoint(-3.9F, -32.65F, 10.0F);
		stock.addChild(gun317_r1);
		setRotationAngle(gun317_r1, 0.0F, 0.0F, -2.0076F);
		gun317_r1.cubeList.add(new ModelBox(gun317_r1, 90, 13, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun316_r1 = new ModelRenderer(this);
		gun316_r1.setRotationPoint(0.9F, -32.65F, 10.0F);
		stock.addChild(gun316_r1);
		setRotationAngle(gun316_r1, 0.0F, 0.0F, 2.0076F);
		gun316_r1.cubeList.add(new ModelBox(gun316_r1, 90, 36, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun319_r1 = new ModelRenderer(this);
		gun319_r1.setRotationPoint(-3.3F, -35.2F, 22.5F);
		stock.addChild(gun319_r1);
		setRotationAngle(gun319_r1, -1.673F, 0.0F, 0.0F);
		gun319_r1.cubeList.add(new ModelBox(gun319_r1, 76, 19, 2.6F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		gun319_r1.cubeList.add(new ModelBox(gun319_r1, 17, 78, 0.0F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun329_r1 = new ModelRenderer(this);
		gun329_r1.setRotationPoint(-2.5F, -30.0F, 17.7F);
		stock.addChild(gun329_r1);
		setRotationAngle(gun329_r1, 2.0448F, 0.0F, 0.0F);
		gun329_r1.cubeList.add(new ModelBox(gun329_r1, 18, 9, 0.0F, -1.0F, -4.6F, 2, 1, 6, 0.0F, false));
		gun329_r1.cubeList.add(new ModelBox(gun329_r1, 18, 0, 0.0F, 1.0F, -5.0F, 2, 3, 6, 0.0F, false));
		gun329_r1.cubeList.add(new ModelBox(gun329_r1, 56, 29, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun331_r1 = new ModelRenderer(this);
		gun331_r1.setRotationPoint(-3.0F, -35.05F, 24.0F);
		stock.addChild(gun331_r1);
		setRotationAngle(gun331_r1, -1.673F, 0.0F, 0.0F);
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 18, 44, -0.001F, 1.5F, 5.0F, 3, 1, 5, 0.0F, false));
		gun331_r1.cubeList.add(new ModelBox(gun331_r1, 112, 21, 0.0F, 0.0F, 0.0F, 3, 2, 10, 0.0F, false));

		gun331_r2 = new ModelRenderer(this);
		gun331_r2.setRotationPoint(-3.0F, -34.9F, 24.5F);
		stock.addChild(gun331_r2);
		setRotationAngle(gun331_r2, -1.7474F, 0.0F, 0.0F);
		gun331_r2.cubeList.add(new ModelBox(gun331_r2, 55, 61, -0.001F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun332_r1 = new ModelRenderer(this);
		gun332_r1.setRotationPoint(-3.0F, -25.05F, 23.0F);
		stock.addChild(gun332_r1);
		setRotationAngle(gun332_r1, 1.6359F, 0.0F, 0.0F);
		gun332_r1.cubeList.add(new ModelBox(gun332_r1, 36, 97, -0.001F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

		gun335_r1 = new ModelRenderer(this);
		gun335_r1.setRotationPoint(-2.0F, -30.6F, 12.0F);
		stock.addChild(gun335_r1);
		setRotationAngle(gun335_r1, 2.4538F, 0.0F, 0.0F);
		gun335_r1.cubeList.add(new ModelBox(gun335_r1, 114, 112, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun337_r1 = new ModelRenderer(this);
		gun337_r1.setRotationPoint(1.3F, -32.8F, 3.4F);
		stock.addChild(gun337_r1);
		setRotationAngle(gun337_r1, 0.0F, -0.384F, 0.0F);
		gun337_r1.cubeList.add(new ModelBox(gun337_r1, 47, 28, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		stock_zenitco = new ModelRenderer(this);
		stock_zenitco.setRotationPoint(0.0F, 24.0F, 0.0F);
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 76, 13, -2.0F, -32.1F, 9.0F, 1, 1, 5, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 59, 39, -2.0F, -31.6F, 12.0F, 1, 1, 1, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 86, 71, -2.0F, -31.5F, 13.5F, 1, 1, 3, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 64, 57, -2.5F, -26.4F, 18.9F, 2, 1, 2, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 72, 97, -2.5F, -31.8F, 15.0F, 2, 1, 7, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 0, 145, -2.0F, -35.6F, 5.0F, 1, 1, 17, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 0, 0, -1.2F, -35.3F, 5.5F, 1, 4, 16, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 18, 9, -0.26F, -33.5F, 11.0F, 1, 2, 2, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 10, 0, -0.26F, -33.5F, 20.0F, 1, 2, 2, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 0, 9, -3.74F, -33.5F, 20.0F, 1, 2, 2, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 38, 25, -0.26F, -32.5F, 13.0F, 1, 1, 7, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 76, 26, -3.5F, -33.2F, 13.0F, 4, 1, 7, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 123, 108, -0.06F, -33.7F, 12.2F, 1, 1, 8, -0.2F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 18, 0, -3.74F, -33.5F, 11.0F, 1, 2, 2, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 38, 17, -3.74F, -32.5F, 13.0F, 1, 1, 7, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 123, 88, -3.94F, -33.7F, 12.2F, 1, 1, 8, -0.2F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 112, 0, -2.8F, -35.3F, 4.5F, 2, 4, 17, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 72, 71, -3.0F, -35.3F, 2.5F, 3, 4, 3, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 25, 86, -2.0F, -36.2F, 3.6F, 1, 1, 3, -0.3F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 90, 42, -2.0F, -36.201F, 5.601F, 3, 1, 1, -0.3F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 90, 40, -2.0F, -31.401F, 5.601F, 3, 1, 1, -0.3F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 30, 30, -2.0F, -32.401F, 5.601F, 1, 2, 1, -0.3F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 10, 9, 0.0F, -35.801F, 5.601F, 1, 5, 1, -0.3F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 18, 35, -0.05F, -35.3F, 3.0F, 1, 4, 1, 0.0F, false));
		stock_zenitco.cubeList.add(new ModelBox(stock_zenitco, 20, 20, -2.0F, -35.95F, 3.0F, 1, 1, 1, 0.0F, false));

		gun315_r1 = new ModelRenderer(this);
		gun315_r1.setRotationPoint(-3.74F, -31.5F, 11.0F);
		stock_zenitco.addChild(gun315_r1);
		setRotationAngle(gun315_r1, -0.3142F, -0.0698F, 0.0F);
		gun315_r1.cubeList.add(new ModelBox(gun315_r1, 20, 52, 0.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

		gun314_r2 = new ModelRenderer(this);
		gun314_r2.setRotationPoint(0.74F, -31.5F, 11.0F);
		stock_zenitco.addChild(gun314_r2);
		setRotationAngle(gun314_r2, -0.3142F, 0.0698F, 0.0F);
		gun314_r2.cubeList.add(new ModelBox(gun314_r2, 38, 53, -1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F, false));

		gun314_r3 = new ModelRenderer(this);
		gun314_r3.setRotationPoint(-3.74F, -31.5F, 11.0F);
		stock_zenitco.addChild(gun314_r3);
		setRotationAngle(gun314_r3, -0.1571F, -0.0698F, 0.0F);
		gun314_r3.cubeList.add(new ModelBox(gun314_r3, 0, 52, 0.0F, -2.0F, -6.0F, 1, 1, 6, 0.0F, false));

		gun313_r2 = new ModelRenderer(this);
		gun313_r2.setRotationPoint(0.74F, -31.5F, 11.0F);
		stock_zenitco.addChild(gun313_r2);
		setRotationAngle(gun313_r2, -0.1571F, 0.0698F, 0.0F);
		gun313_r2.cubeList.add(new ModelBox(gun313_r2, 0, 59, -1.0F, -2.0F, -6.0F, 1, 1, 6, 0.0F, false));

		gun314_r4 = new ModelRenderer(this);
		gun314_r4.setRotationPoint(-2.0F, -35.6F, 5.0F);
		stock_zenitco.addChild(gun314_r4);
		setRotationAngle(gun314_r4, 0.0F, 0.0F, 1.3439F);
		gun314_r4.cubeList.add(new ModelBox(gun314_r4, 134, 22, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun316_r2 = new ModelRenderer(this);
		gun316_r2.setRotationPoint(-2.99F, -35.37F, 5.0F);
		stock_zenitco.addChild(gun316_r2);
		setRotationAngle(gun316_r2, 0.0F, 0.0F, 0.384F);
		gun316_r2.cubeList.add(new ModelBox(gun316_r2, 127, 22, 0.0F, 0.99F, 6.0F, 1, 1, 11, 0.0F, false));
		gun316_r2.cubeList.add(new ModelBox(gun316_r2, 82, 107, 0.0F, -0.01F, 0.0F, 1, 1, 17, 0.0F, false));

		gun315_r2 = new ModelRenderer(this);
		gun315_r2.setRotationPoint(-0.01F, -35.37F, 5.0F);
		stock_zenitco.addChild(gun315_r2);
		setRotationAngle(gun315_r2, 0.0F, 0.0F, -0.384F);
		gun315_r2.cubeList.add(new ModelBox(gun315_r2, 133, 75, -1.0F, 0.99F, 6.0F, 1, 1, 11, 0.0F, false));
		gun315_r2.cubeList.add(new ModelBox(gun315_r2, 22, 126, -1.0F, -0.01F, 0.0F, 1, 1, 17, 0.0F, false));

		gun316_r3 = new ModelRenderer(this);
		gun316_r3.setRotationPoint(-2.99F, -35.37F, 5.0F);
		stock_zenitco.addChild(gun316_r3);
		setRotationAngle(gun316_r3, 1.4137F, 0.0F, 0.384F);
		gun316_r3.cubeList.add(new ModelBox(gun316_r3, 0, 35, -0.001F, 0.29F, -1.0F, 1, 6, 1, 0.0F, false));

		gun315_r3 = new ModelRenderer(this);
		gun315_r3.setRotationPoint(-0.01F, -35.37F, 5.0F);
		stock_zenitco.addChild(gun315_r3);
		setRotationAngle(gun315_r3, 1.4137F, 0.0F, -0.384F);
		gun315_r3.cubeList.add(new ModelBox(gun315_r3, 9, 35, -0.999F, 0.29F, -1.0F, 1, 6, 1, 0.0F, false));

		gun313_r3 = new ModelRenderer(this);
		gun313_r3.setRotationPoint(-1.0F, -35.6F, 5.0F);
		stock_zenitco.addChild(gun313_r3);
		setRotationAngle(gun313_r3, 0.0F, 0.0F, -1.3439F);
		gun313_r3.cubeList.add(new ModelBox(gun313_r3, 144, 129, -1.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, false));

		gun330_r1 = new ModelRenderer(this);
		gun330_r1.setRotationPoint(-2.5F, -30.0F, 17.7F);
		stock_zenitco.addChild(gun330_r1);
		setRotationAngle(gun330_r1, 2.0448F, 0.0F, 0.0F);
		gun330_r1.cubeList.add(new ModelBox(gun330_r1, 0, 9, 0.0F, -1.0F, -4.6F, 2, 1, 6, 0.0F, false));
		gun330_r1.cubeList.add(new ModelBox(gun330_r1, 0, 0, 0.0F, 1.0F, -5.0F, 2, 3, 6, 0.0F, false));
		gun330_r1.cubeList.add(new ModelBox(gun330_r1, 10, 4, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun332_r2 = new ModelRenderer(this);
		gun332_r2.setRotationPoint(-3.0F, -35.05F, 24.0F);
		stock_zenitco.addChild(gun332_r2);
		setRotationAngle(gun332_r2, -1.673F, 0.0F, 0.0F);
		gun332_r2.cubeList.add(new ModelBox(gun332_r2, 161, 147, -0.001F, 1.5F, 1.0F, 3, 1, 9, 0.0F, false));
		gun332_r2.cubeList.add(new ModelBox(gun332_r2, 23, 106, 0.0F, 0.0F, 0.0F, 3, 2, 10, 0.0F, false));

		gun332_r3 = new ModelRenderer(this);
		gun332_r3.setRotationPoint(-3.0F, -34.9F, 24.5F);
		stock_zenitco.addChild(gun332_r3);
		setRotationAngle(gun332_r3, -1.7474F, 0.0F, 0.0F);
		gun332_r3.cubeList.add(new ModelBox(gun332_r3, 38, 10, -0.001F, 0.0F, 0.0F, 3, 1, 5, 0.0F, false));

		gun333_r1 = new ModelRenderer(this);
		gun333_r1.setRotationPoint(-3.0F, -25.05F, 23.0F);
		stock_zenitco.addChild(gun333_r1);
		setRotationAngle(gun333_r1, 1.6359F, 0.0F, 0.0F);
		gun333_r1.cubeList.add(new ModelBox(gun333_r1, 91, 26, -0.001F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

		gun336_r1 = new ModelRenderer(this);
		gun336_r1.setRotationPoint(-2.0F, -30.6F, 12.0F);
		stock_zenitco.addChild(gun336_r1);
		setRotationAngle(gun336_r1, 2.4538F, 0.0F, 0.0F);
		gun336_r1.cubeList.add(new ModelBox(gun336_r1, 59, 47, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun338_r1 = new ModelRenderer(this);
		gun338_r1.setRotationPoint(0.3F, -32.8F, 4.1F);
		stock_zenitco.addChild(gun338_r1);
		setRotationAngle(gun338_r1, -0.3491F, 0.0F, 0.0F);
		gun338_r1.cubeList.add(new ModelBox(gun338_r1, 8, 62, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		dustcover = new ModelRenderer(this);
		dustcover.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover.cubeList.add(new ModelBox(dustcover, 82, 109, -2.0F, -39.1F, -0.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 108, 100, -2.0F, -39.101F, 0.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 75, 109, -2.0F, -39.1F, -2.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 108, 102, -2.0F, -39.1F, -3.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 105, 109, -2.0F, -39.1F, -5.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 39, 110, -2.0F, -39.1F, -6.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 101, 109, -2.0F, -39.1F, -8.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 94, 109, -2.0F, -39.1F, -9.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 53, 110, -2.0F, -39.1F, -11.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 62, 110, -2.0F, -39.1F, -12.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 49, 110, -2.0F, -39.1F, -14.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 43, 110, -2.0F, -39.1F, -15.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 111, 107, -2.0F, -39.1F, -17.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 111, 109, -2.0F, -39.1F, -18.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 105, 111, -2.0F, -39.1F, -20.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 101, 111, -2.0F, -39.1F, -21.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 112, 2, -2.0F, -39.1F, -23.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 112, 4, -2.0F, -39.1F, -24.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 112, 0, -2.0F, -39.1F, -26.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 111, 111, -2.0F, -39.1F, -27.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 112, 7, -2.0F, -39.1F, -29.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 112, 9, -2.0F, -39.1F, -30.5F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 12, 115, -2.0F, -39.1F, -32.0F, 1, 1, 1, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 38, 1, -2.6F, -39.001F, -33.0F, 2, 1, 34, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 76, 0, -1.4F, -39.001F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 76, 35, -1.2F, -38.35F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 61, 107, 0.0F, -35.7F, -16.2F, 1, 1, 19, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 90, 10, -2.999F, -35.701F, 2.201F, 4, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 0, 70, -4.0F, -35.7F, -16.2F, 1, 1, 15, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 100, 88, -4.0F, -35.7F, -1.8F, 1, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 101, 56, -4.0F, -35.7F, 1.8F, 1, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 56, 21, -4.0F, -35.7F, 2.2F, 2, 1, 1, -0.2F, false));
		dustcover.cubeList.add(new ModelBox(dustcover, 38, 36, -2.8F, -38.35F, -33.0F, 2, 1, 34, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-3.8F, -35.5F, -16.0F);
		dustcover.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.0F, 0.0F, -1.2392F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 55, 146, 2.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 56, 4, 0.0F, -0.001F, 16.6F, 2, 1, 1, 0.0F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 133, 4, 0.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(0.8F, -35.5F, -16.0F);
		dustcover.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, 1.2392F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 19, 146, -3.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 56, 2, -2.0F, -0.001F, 16.6F, 2, 1, 1, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 121, 128, -3.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-3.8F, -35.5F, 2.8F);
		dustcover.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0F, 0.5411F, -1.2392F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 90, 59, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun26_r2 = new ModelRenderer(this);
		gun26_r2.setRotationPoint(0.8F, -35.5F, 2.8F);
		dustcover.addChild(gun26_r2);
		setRotationAngle(gun26_r2, 0.0F, -0.5411F, 1.2392F);
		gun26_r2.cubeList.add(new ModelBox(gun26_r2, 25, 93, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun308_r1 = new ModelRenderer(this);
		gun308_r1.setRotationPoint(-1.35F, -39.0F, 1.0F);
		dustcover.addChild(gun308_r1);
		setRotationAngle(gun308_r1, -1.2672F, 0.0F, 0.0F);
		gun308_r1.cubeList.add(new ModelBox(gun308_r1, 112, 11, -0.051F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun308_r1.cubeList.add(new ModelBox(gun308_r1, 38, 56, -1.251F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun212_r1 = new ModelRenderer(this);
		gun212_r1.setRotationPoint(-2.7F, -39.1F, 0.0F);
		dustcover.addChild(gun212_r1);
		setRotationAngle(gun212_r1, 0.0F, 0.0F, -0.2231F);
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 37, -0.001F, -0.001F, 0.001F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 39, 0.0F, 0.0F, -30.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 41, 0.0F, 0.0F, -32.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 43, 0.0F, 0.0F, -24.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 46, 0.0F, 0.0F, -26.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 49, 0.0F, 0.0F, -27.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 51, 0.0F, 0.0F, -29.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 53, 0.0F, 0.0F, -12.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 104, 55, 0.0F, 0.0F, -14.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 0, 105, 0.0F, 0.0F, -15.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 12, 105, 0.0F, 0.0F, -17.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 23, 105, 0.0F, 0.0F, -18.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 29, 105, 0.0F, 0.0F, -20.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 106, 23, 0.0F, 0.0F, -23.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 106, 25, 0.0F, 0.0F, -21.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 106, 27, 0.0F, 0.0F, -6.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 106, 29, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 39, 106, 0.0F, 0.0F, -11.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 43, 106, 0.0F, 0.0F, -9.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 49, 106, 0.0F, 0.0F, -5.0F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 53, 106, 0.0F, 0.0F, -3.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 106, 59, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 115, 38, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

		gun240_r2 = new ModelRenderer(this);
		gun240_r2.setRotationPoint(-1.3F, -39.3F, 0.0F);
		dustcover.addChild(gun240_r2);
		setRotationAngle(gun240_r2, 0.0F, 0.0F, 0.192F);
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 62, 106, -0.001F, -0.001F, 0.001F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 106, 62, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 106, 64, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 0, 107, 0.0F, 0.0F, -9.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 12, 107, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 23, 107, 0.0F, 0.0F, -6.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 29, 107, 0.0F, 0.0F, -5.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 75, 107, 0.0F, 0.0F, -3.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 82, 107, 0.0F, 0.0F, -21.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 94, 107, 0.0F, 0.0F, -20.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 101, 107, 0.0F, 0.0F, -18.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 105, 107, 0.0F, 0.0F, -17.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 39, 108, 0.0F, 0.0F, -15.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 43, 108, 0.0F, 0.0F, -14.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 49, 108, 0.0F, 0.0F, -11.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 53, 108, 0.0F, 0.0F, -12.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 62, 108, 0.0F, 0.0F, -27.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 108, 71, 0.0F, 0.0F, -26.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 108, 73, 0.0F, 0.0F, -23.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 108, 77, 0.0F, 0.0F, -24.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 108, 79, 0.0F, 0.0F, -29.0F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 108, 81, 0.0F, 0.0F, -30.5F, 1, 1, 1, 0.0F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 115, 36, 0.0F, 0.0F, -32.0F, 1, 1, 1, 0.0F, false));

		gun307_r1 = new ModelRenderer(this);
		gun307_r1.setRotationPoint(-1.8F, -35.5F, 3.0F);
		dustcover.addChild(gun307_r1);
		setRotationAngle(gun307_r1, 0.576F, 0.0F, 0.0F);
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 56, 12, -1.001F, -3.4F, -1.0F, 2, 1, 1, 0.0F, false));
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 101, 54, 0.599F, -3.4F, -0.999F, 1, 1, 1, 0.0F, false));
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 28, 9, -1.0F, -3.0F, -0.999F, 2, 3, 1, 0.0F, false));
		gun307_r1.cubeList.add(new ModelBox(gun307_r1, 56, 36, 0.6F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun307_r2 = new ModelRenderer(this);
		gun307_r2.setRotationPoint(-3.8F, -35.5F, 3.0F);
		dustcover.addChild(gun307_r2);
		setRotationAngle(gun307_r2, 0.5568F, -0.1501F, 0.2443F);
		gun307_r2.cubeList.add(new ModelBox(gun307_r2, 56, 8, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun306_r1 = new ModelRenderer(this);
		gun306_r1.setRotationPoint(0.8F, -35.5F, 3.0F);
		dustcover.addChild(gun306_r1);
		setRotationAngle(gun306_r1, 0.5568F, 0.1501F, -0.2443F);
		gun306_r1.cubeList.add(new ModelBox(gun306_r1, 56, 17, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		dustcover_b = new ModelRenderer(this);
		dustcover_b.setRotationPoint(0.0F, 24.0F, 0.0F);
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 48, 99, -2.0F, -39.1F, -0.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 36, 99, -2.0F, -39.101F, 0.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 0, 99, -2.0F, -39.1F, -2.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 75, 98, -2.0F, -39.1F, -3.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 65, 98, -2.0F, -39.1F, -5.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 61, 98, -2.0F, -39.1F, -6.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 98, 59, -2.0F, -39.1F, -8.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 28, 98, -2.0F, -39.1F, -9.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 97, 91, -2.0F, -39.1F, -11.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 97, 89, -2.0F, -39.1F, -12.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 97, 87, -2.0F, -39.1F, -14.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 83, 97, -2.0F, -39.1F, -15.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 72, 97, -2.0F, -39.1F, -17.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 48, 97, -2.0F, -39.1F, -18.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 36, 97, -2.0F, -39.1F, -20.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 28, 96, -2.0F, -39.1F, -21.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 22, 96, -2.0F, -39.1F, -23.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 95, 13, -2.0F, -39.1F, -24.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 95, 4, -2.0F, -39.1F, -26.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 95, 0, -2.0F, -39.1F, -27.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 94, 94, -2.0F, -39.1F, -29.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 66, 94, -2.0F, -39.1F, -30.5F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 91, 88, -2.0F, -39.1F, -32.0F, 1, 1, 1, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 0, 35, -2.6F, -39.001F, -33.0F, 2, 1, 34, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 72, 72, -1.4F, -39.001F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 36, 71, -1.2F, -38.35F, -33.0F, 1, 1, 34, 0.0F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 99, 145, 0.0F, -35.7F, -16.2F, 1, 1, 17, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 101, 117, -2.899F, -35.701F, 0.201F, 4, 1, 3, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 86, 81, -2.9F, -35.701F, -0.199F, 4, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 38, 53, -4.0F, -35.7F, -16.2F, 1, 1, 15, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 28, 78, -4.0F, -35.7F, -1.8F, 1, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 17, 78, -4.0F, -35.7F, 1.8F, 1, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 18, 13, -4.0F, -35.7F, 2.2F, 2, 1, 1, -0.2F, false));
		dustcover_b.cubeList.add(new ModelBox(dustcover_b, 0, 0, -2.8F, -38.35F, -33.0F, 2, 1, 34, 0.0F, false));

		gun26_r3 = new ModelRenderer(this);
		gun26_r3.setRotationPoint(-3.8F, -35.5F, -16.0F);
		dustcover_b.addChild(gun26_r3);
		setRotationAngle(gun26_r3, 0.0F, 0.0F, -1.2392F);
		gun26_r3.cubeList.add(new ModelBox(gun26_r3, 145, 108, 2.0F, 0.0F, -17.0F, 1, 1, 17, 0.0F, false));
		gun26_r3.cubeList.add(new ModelBox(gun26_r3, 98, 127, 0.0F, 0.0F, 0.0F, 3, 1, 17, 0.0F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(0.9F, -35.5F, 0.001F);
		dustcover_b.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0F, 0.0F, 1.2392F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 90, 49, -3.0F, -0.002F, 0.0F, 3, 1, 1, 0.0F, false));

		gun27_r2 = new ModelRenderer(this);
		gun27_r2.setRotationPoint(-3.9F, -35.5F, 0.001F);
		dustcover_b.addChild(gun27_r2);
		setRotationAngle(gun27_r2, 0.0F, 0.0F, -1.2392F);
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 90, 51, 0.0F, -0.002F, 0.0F, 3, 1, 1, 0.0F, false));
		gun27_r2.cubeList.add(new ModelBox(gun27_r2, 0, 13, 0.0F, -0.001F, 0.599F, 2, 1, 1, 0.0F, false));

		gun27_r3 = new ModelRenderer(this);
		gun27_r3.setRotationPoint(0.8F, -35.5F, -16.0F);
		dustcover_b.addChild(gun27_r3);
		setRotationAngle(gun27_r3, 0.0F, 0.0F, 1.2392F);
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 0, 70, -3.0F, 0.0F, -17.0F, 1, 1, 34, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 20, 96, -2.1F, 0.201F, 0.0F, 1, 1, 6, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 108, 70, -1.5F, 0.001F, 0.0F, 1, 1, 6, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 108, 88, -2.0F, 0.0F, 6.0F, 2, 1, 11, 0.0F, false));
		gun27_r3.cubeList.add(new ModelBox(gun27_r3, 108, 77, -1.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun28_r2 = new ModelRenderer(this);
		gun28_r2.setRotationPoint(-3.9F, -35.5F, 2.8F);
		dustcover_b.addChild(gun28_r2);
		setRotationAngle(gun28_r2, 0.0F, 0.5411F, -1.2392F);
		gun28_r2.cubeList.add(new ModelBox(gun28_r2, 90, 53, 0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun27_r4 = new ModelRenderer(this);
		gun27_r4.setRotationPoint(0.9F, -35.5F, 2.8F);
		dustcover_b.addChild(gun27_r4);
		setRotationAngle(gun27_r4, 0.0F, -0.5411F, 1.2392F);
		gun27_r4.cubeList.add(new ModelBox(gun27_r4, 90, 55, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, false));

		gun27_r5 = new ModelRenderer(this);
		gun27_r5.setRotationPoint(0.9F, -35.5F, -16.4F);
		dustcover_b.addChild(gun27_r5);
		setRotationAngle(gun27_r5, 0.0F, 0.0F, 1.2392F);
		gun27_r5.cubeList.add(new ModelBox(gun27_r5, 18, 4, -2.0F, -0.001F, 17.0F, 2, 1, 1, 0.0F, false));

		gun28_r3 = new ModelRenderer(this);
		gun28_r3.setRotationPoint(0.8F, -35.5F, -16.0F);
		dustcover_b.addChild(gun28_r3);
		setRotationAngle(gun28_r3, 0.0F, -0.4014F, 1.2392F);
		gun28_r3.cubeList.add(new ModelBox(gun28_r3, 8, 77, -1.3F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun28_r3.cubeList.add(new ModelBox(gun28_r3, 11, 78, -1.0F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(-2.95F, -38.35F, -1.75F);
		dustcover_b.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.0F, 0.0F, 0.4014F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 56, 40, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 46, 56, 0.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 56, 48, 0.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));

		gun31_r1 = new ModelRenderer(this);
		gun31_r1.setRotationPoint(-0.05F, -38.35F, -1.75F);
		dustcover_b.addChild(gun31_r1);
		setRotationAngle(gun31_r1, 0.0F, 0.0F, -0.4014F);
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 0, 59, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 8, 59, -1.0F, 0.0F, -4.0F, 1, 2, 1, 0.0F, false));
		gun31_r1.cubeList.add(new ModelBox(gun31_r1, 20, 59, -1.0F, 0.0F, -8.0F, 1, 2, 1, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-3.68F, -36.5F, -1.75F);
		dustcover_b.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 0.0F, 0.0F, -0.0175F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 76, 57, -0.05F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 76, 62, -0.05F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 76, 64, -0.05F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));

		gun32_r2 = new ModelRenderer(this);
		gun32_r2.setRotationPoint(0.72F, -36.5F, -1.75F);
		dustcover_b.addChild(gun32_r2);
		setRotationAngle(gun32_r2, 0.0F, 0.0F, 0.0175F);
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 66, 76, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 76, 66, -1.0F, 0.0F, -4.0F, 1, 1, 1, 0.0F, false));
		gun32_r2.cubeList.add(new ModelBox(gun32_r2, 0, 77, -1.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));

		gun309_r1 = new ModelRenderer(this);
		gun309_r1.setRotationPoint(-1.35F, -39.0F, 1.0F);
		dustcover_b.addChild(gun309_r1);
		setRotationAngle(gun309_r1, -1.2672F, 0.0F, 0.0F);
		gun309_r1.cubeList.add(new ModelBox(gun309_r1, 0, 79, -0.051F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		gun309_r1.cubeList.add(new ModelBox(gun309_r1, 28, 4, -1.251F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun213_r1 = new ModelRenderer(this);
		gun213_r1.setRotationPoint(-2.7F, -39.1F, 0.0F);
		dustcover_b.addChild(gun213_r1);
		setRotationAngle(gun213_r1, 0.0F, 0.0F, -0.2231F);
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 8, 79, -0.001F, -0.001F, 0.001F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 79, 27, 0.0F, 0.0F, -30.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 79, 29, 0.0F, 0.0F, -32.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 79, 31, 0.0F, 0.0F, -24.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 11, 80, 0.0F, 0.0F, -26.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 17, 80, 0.0F, 0.0F, -27.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 28, 80, 0.0F, 0.0F, -29.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 0, 81, 0.0F, 0.0F, -12.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 8, 81, 0.0F, 0.0F, -14.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 66, 81, 0.0F, 0.0F, -15.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 13, 0.0F, 0.0F, -17.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 15, 0.0F, 0.0F, -18.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 19, 0.0F, 0.0F, -20.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 21, 0.0F, 0.0F, -23.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 36, 0.0F, 0.0F, -21.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 38, 0.0F, 0.0F, -6.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 42, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 44, 0.0F, 0.0F, -11.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 49, 0.0F, 0.0F, -9.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 51, 0.0F, 0.0F, -5.0F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 55, 0.0F, 0.0F, -3.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 57, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 83, 99, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(-1.3F, -39.3F, 0.0F);
		dustcover_b.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.0F, 0.0F, 0.192F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 36, 84, -0.001F, -0.001F, 0.001F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 43, 84, 0.0F, 0.0F, -2.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 55, 84, 0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 72, 84, 0.0F, 0.0F, -9.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 78, 84, 0.0F, 0.0F, -8.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 66, 85, 0.0F, 0.0F, -6.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 30, 86, 0.0F, 0.0F, -5.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 36, 86, 0.0F, 0.0F, -3.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 43, 86, 0.0F, 0.0F, -21.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 72, 86, 0.0F, 0.0F, -20.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 78, 86, 0.0F, 0.0F, -18.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 55, 88, 0.0F, 0.0F, -17.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 66, 89, 0.0F, 0.0F, -15.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 19, 90, 0.0F, 0.0F, -14.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 90, 62, 0.0F, 0.0F, -11.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 90, 64, 0.0F, 0.0F, -12.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 91, 26, 0.0F, 0.0F, -27.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 91, 28, 0.0F, 0.0F, -26.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 91, 30, 0.0F, 0.0F, -23.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 91, 71, 0.0F, 0.0F, -24.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 91, 75, 0.0F, 0.0F, -29.0F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 91, 84, 0.0F, 0.0F, -30.5F, 1, 1, 1, 0.0F, false));
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 72, 99, 0.0F, 0.0F, -32.0F, 1, 1, 1, 0.0F, false));

		gun308_r2 = new ModelRenderer(this);
		gun308_r2.setRotationPoint(-1.8F, -35.5F, 3.0F);
		dustcover_b.addChild(gun308_r2);
		setRotationAngle(gun308_r2, 0.576F, 0.0F, 0.0F);
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 28, 13, -1.001F, -3.4F, -1.0F, 2, 1, 1, 0.0F, false));
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 100, 10, 0.599F, -3.4F, -0.999F, 1, 1, 1, 0.0F, false));
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 28, 0, -1.1F, -3.0F, -0.999F, 2, 3, 1, 0.0F, false));
		gun308_r2.cubeList.add(new ModelBox(gun308_r2, 49, 10, 0.7F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun308_r3 = new ModelRenderer(this);
		gun308_r3.setRotationPoint(-3.9F, -35.5F, 3.0F);
		dustcover_b.addChild(gun308_r3);
		setRotationAngle(gun308_r3, 0.5568F, -0.1501F, 0.2443F);
		gun308_r3.cubeList.add(new ModelBox(gun308_r3, 0, 44, 0.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		gun307_r3 = new ModelRenderer(this);
		gun307_r3.setRotationPoint(0.9F, -35.5F, 3.0F);
		dustcover_b.addChild(gun307_r3);
		setRotationAngle(gun307_r3, 0.5568F, 0.1501F, -0.2443F);
		gun307_r3.cubeList.add(new ModelBox(gun307_r3, 12, 44, -1.0F, -3.0F, -1.0F, 1, 3, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip.cubeList.add(new ModelBox(grip, 128, 22, -3.5F, -31.0F, -6.5F, 4, 3, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 101, 121, -3.5F, -31.5F, 0.5F, 4, 1, 2, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 156, 12, -3.5F, -31.0F, -5.5F, 4, 3, 6, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.2602F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 76, 0, 0.0F, 0.0F, 0.5F, 4, 8, 1, 0.0F, false));
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 62, 107, -0.001F, 0.0F, 1.0F, 4, 8, 5, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-3.5F, -30.5F, 2.5F);
		grip.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -2.5653F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 112, 59, 0.001F, 0.0F, 0.0F, 4, 2, 3, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(-3.5F, -21.0F, -3.5F);
		grip.addChild(gun8_r1);
		setRotationAngle(gun8_r1, 0.1115F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 121, 128, 0.001F, 0.0F, 0.3F, 4, 2, 1, 0.0F, false));
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 83, 97, 0.0F, 0.0F, 1.0F, 4, 2, 5, 0.0F, false));

		gun8_r2 = new ModelRenderer(this);
		gun8_r2.setRotationPoint(-3.5F, -27.3F, 0.8F);
		grip.addChild(gun8_r2);
		setRotationAngle(gun8_r2, -1.1154F, 0.0F, 0.0F);
		gun8_r2.cubeList.add(new ModelBox(gun8_r2, 0, 118, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-3.5F, -24.7F, 2.1F);
		grip.addChild(gun9_r1);
		setRotationAngle(gun9_r1, -1.3908F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 48, 97, 0.001F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-3.5F, -28.0F, -6.5F);
		grip.addChild(gun11_r1);
		setRotationAngle(gun11_r1, 1.1389F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 40, 118, 0.001F, 0.0F, 0.0F, 4, 3, 2, 0.0F, false));

		grip_ergo = new ModelRenderer(this);
		grip_ergo.setRotationPoint(0.0F, 24.0F, 0.0F);
		grip_ergo.cubeList.add(new ModelBox(grip_ergo, 50, 71, -3.0F, -31.0F, -6.5F, 3, 3, 7, 0.0F, false));
		grip_ergo.cubeList.add(new ModelBox(grip_ergo, 128, 26, -3.0F, -28.0F, -1.5F, 3, 1, 2, 0.0F, false));
		grip_ergo.cubeList.add(new ModelBox(grip_ergo, 76, 62, -3.5F, -31.5F, -3.5F, 4, 1, 6, 0.0F, false));
		grip_ergo.cubeList.add(new ModelBox(grip_ergo, 23, 112, -3.498F, -31.0F, -3.85F, 4, 3, 1, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.5F, -28.8F, -3.5F);
		grip_ergo.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -1.9373F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 108, 95, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		gun9_r2 = new ModelRenderer(this);
		gun9_r2.setRotationPoint(-3.05F, -19.1F, -2.8F);
		grip_ergo.addChild(gun9_r2);
		setRotationAngle(gun9_r2, 0.1222F, 0.0F, 0.0F);
		gun9_r2.cubeList.add(new ModelBox(gun9_r2, 72, 92, 0.05F, -1.0F, 0.0F, 3, 1, 3, 0.0F, false));

		gun8_r3 = new ModelRenderer(this);
		gun8_r3.setRotationPoint(-3.05F, -19.1F, -2.8F);
		grip_ergo.addChild(gun8_r3);
		setRotationAngle(gun8_r3, 0.2602F, 0.0F, 0.0F);
		gun8_r3.cubeList.add(new ModelBox(gun8_r3, 90, 20, 0.05F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-3.05F, -21.8F, -3.5F);
		grip_ergo.addChild(gun7_r1);
		setRotationAngle(gun7_r1, 0.2602F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 90, 36, 0.05F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun8_r4 = new ModelRenderer(this);
		gun8_r4.setRotationPoint(-3.05F, -19.1F, -2.7F);
		grip_ergo.addChild(gun8_r4);
		setRotationAngle(gun8_r4, 0.1222F, -0.1396F, -0.0524F);
		gun8_r4.cubeList.add(new ModelBox(gun8_r4, 26, 20, -0.001F, -1.0F, -0.1F, 1, 1, 3, 0.0F, false));

		gun7_r2 = new ModelRenderer(this);
		gun7_r2.setRotationPoint(-3.05F, -19.1F, -2.7F);
		grip_ergo.addChild(gun7_r2);
		setRotationAngle(gun7_r2, 0.2602F, -0.1396F, -0.0524F);
		gun7_r2.cubeList.add(new ModelBox(gun7_r2, 26, 24, 0.0F, -1.0F, -0.1F, 1, 1, 3, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(-3.05F, -21.8F, -3.5F);
		grip_ergo.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 0.2602F, -0.1396F, -0.0524F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 25, 30, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun7_r3 = new ModelRenderer(this);
		gun7_r3.setRotationPoint(0.05F, -19.1F, -2.7F);
		grip_ergo.addChild(gun7_r3);
		setRotationAngle(gun7_r3, 0.1222F, 0.1396F, 0.0524F);
		gun7_r3.cubeList.add(new ModelBox(gun7_r3, 64, 53, -0.999F, -1.0F, -0.1F, 1, 1, 3, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(0.05F, -19.1F, -2.7F);
		grip_ergo.addChild(gun6_r2);
		setRotationAngle(gun6_r2, 0.2602F, 0.1396F, 0.0524F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 26, 70, -1.0F, -1.0F, -0.1F, 1, 1, 3, 0.0F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(0.05F, -21.8F, -3.5F);
		grip_ergo.addChild(gun5_r2);
		setRotationAngle(gun5_r2, 0.2602F, 0.1396F, 0.0524F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 61, 81, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(-3.05F, -24.5F, -4.2F);
		grip_ergo.addChild(gun6_r3);
		setRotationAngle(gun6_r3, 0.2602F, 0.0F, 0.0F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 90, 38, 0.05F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(-3.05F, -24.5F, -4.2F);
		grip_ergo.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.2602F, -0.1396F, -0.0524F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 50, 84, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(0.05F, -24.5F, -4.2F);
		grip_ergo.addChild(gun4_r2);
		setRotationAngle(gun4_r2, 0.2602F, 0.1396F, 0.0524F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 61, 85, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(-3.5F, -27.5F, -5.5F);
		grip_ergo.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.2602F, 0.0F, 0.0F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 0, 20, 0.5F, 0.0F, 0.6F, 3, 8, 3, 0.0F, false));
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 38, 0, -0.001F, 1.0F, 3.0F, 4, 7, 3, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(0.5F, -30.5F, 2.5F);
		grip_ergo.addChild(gun5_r4);
		setRotationAngle(gun5_r4, -1.4486F, 0.0F, 0.0F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 0, 86, -3.999F, 0.0F, -1.0F, 4, 6, 1, 0.0F, false));

		gun5_r5 = new ModelRenderer(this);
		gun5_r5.setRotationPoint(-3.0F, -30.5F, 2.5F);
		grip_ergo.addChild(gun5_r5);
		setRotationAngle(gun5_r5, -2.5653F, 0.0F, 0.0F);
		gun5_r5.cubeList.add(new ModelBox(gun5_r5, 72, 78, 0.001F, 0.0F, 0.0F, 3, 2, 3, 0.0F, false));

		gun8_r5 = new ModelRenderer(this);
		gun8_r5.setRotationPoint(-3.5F, -20.1F, -2.5F);
		grip_ergo.addChild(gun8_r5);
		setRotationAngle(gun8_r5, 0.321F, 0.0F, 0.0F);
		gun8_r5.cubeList.add(new ModelBox(gun8_r5, 112, 64, 0.001F, 0.0F, 2.0F, 4, 1, 3, 0.0F, false));

		gun7_r4 = new ModelRenderer(this);
		gun7_r4.setRotationPoint(-3.5F, -20.1F, -2.5F);
		grip_ergo.addChild(gun7_r4);
		setRotationAngle(gun7_r4, 0.1115F, 0.0F, 0.0F);
		gun7_r4.cubeList.add(new ModelBox(gun7_r4, 82, 113, 0.0F, 0.0F, 2.0F, 4, 1, 3, 0.0F, false));

		gun8_r6 = new ModelRenderer(this);
		gun8_r6.setRotationPoint(-3.5F, -27.3F, 0.8F);
		grip_ergo.addChild(gun8_r6);
		setRotationAngle(gun8_r6, -1.1154F, 0.0F, 0.0F);
		gun8_r6.cubeList.add(new ModelBox(gun8_r6, 82, 117, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		gun9_r3 = new ModelRenderer(this);
		gun9_r3.setRotationPoint(-3.5F, -24.7F, 2.1F);
		grip_ergo.addChild(gun9_r3);
		setRotationAngle(gun9_r3, -1.3908F, 0.0F, 0.0F);
		gun9_r3.cubeList.add(new ModelBox(gun9_r3, 90, 62, 0.001F, 0.0F, 0.0F, 4, 1, 5, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(-3.0F, -28.0F, -6.5F);
		grip_ergo.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 0.8946F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 14, 86, 0.001F, 0.0F, 0.0F, 3, 3, 1, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(-3.5F, -28.0F, -6.5F);
		grip_ergo.addChild(gun11_r2);
		setRotationAngle(gun11_r2, 1.3658F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 112, 21, 0.001F, 0.0F, 0.0F, 4, 5, 1, 0.0F, false));

		action = new ModelRenderer(this);
		action.setRotationPoint(0.5F, -11.5F, -27.0F);
		action.cubeList.add(new ModelBox(action, 152, 54, -1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 16, 30, -4.5F, -2.0F, -6.0F, 5, 1, 1, -0.2F, false));
		action.cubeList.add(new ModelBox(action, 152, 42, -4.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-4.0F, 0.0F, 2.0F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.3316F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 112, 0, 0.0F, -2.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 60, 127, 0.0F, -2.0F, -2.0F, 1, 2, 11, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 2.0F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.3316F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 112, 7, -1.0F, -2.0F, -8.0F, 1, 1, 6, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 134, 40, -1.0F, -2.0F, -2.0F, 1, 2, 11, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.2F, -2.0F, -6.1F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.2443F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 40, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.8F, -2.0F, -6.1F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.2443F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 0, -2.0F, 0.0F, 0.0F, 2, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
//		handguard.render(f5);
//		handguard_b.render(f5);
//		stock.render(f5);
//		stock_zenitco.render(f5);
//		dustcover.render(f5);
//		dustcover_b.render(f5);
//		grip.render(f5);
//		grip_ergo.render(f5);
//		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
