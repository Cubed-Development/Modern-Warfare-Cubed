package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TaurusRagingHunter extends ModelWithAttachments {
	private final QRenderer barrel;
	private final ModelRenderer gun160_r1;
	private final ModelRenderer gun158_r1;
	private final ModelRenderer gun243_r1;
	private final ModelRenderer gun255_r1;
	private final ModelRenderer gun253_r1;
	private final ModelRenderer gun257_r1;
	private final ModelRenderer gun256_r1;
	private final ModelRenderer gun264_r1;
	private final ModelRenderer gun263_r1;
	private final ModelRenderer gun268_r1;
	private final ModelRenderer gun267_r1;
	private final QRenderer gun;
	private final ModelRenderer gun126_r1;
	private final ModelRenderer gun129_r1;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun33_r2;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun47_r1;
	private final ModelRenderer gun49_r1;
	private final ModelRenderer gun45_r1;
	private final ModelRenderer gun51_r1;
	private final ModelRenderer gun53_r1;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun55_r1;
	private final ModelRenderer gun65_r1;
	private final ModelRenderer gun64_r1;
	private final ModelRenderer gun66_r1;
	private final ModelRenderer gun87_r1;
	private final ModelRenderer gun89_r1;
	private final ModelRenderer gun99_r1;
	private final ModelRenderer gun101_r1;
	private final ModelRenderer gun100_r1;
	private final ModelRenderer gun106_r1;
	private final ModelRenderer gun105_r1;
	private final ModelRenderer gun108_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r2;
	private final ModelRenderer gun116_r1;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun128_r1;
	private final ModelRenderer gun134_r1;
	private final ModelRenderer gun133_r1;
	private final ModelRenderer gun137_r1;
	private final ModelRenderer gun183_r1;
	private final ModelRenderer gun185_r1;
	private final ModelRenderer gun189_r1;
	private final ModelRenderer gun211_r1;
	private final ModelRenderer gun212_r1;
	private final ModelRenderer gun211_r2;
	private final ModelRenderer gun210_r1;
	private final ModelRenderer gun212_r2;
	private final ModelRenderer gun213_r1;
	private final ModelRenderer gun214_r1;
	private final ModelRenderer gun215_r1;
	private final ModelRenderer gun217_r1;
	private final ModelRenderer gun218_r1;
	private final ModelRenderer gun219_r1;
	private final ModelRenderer gun220_r1;
	private final ModelRenderer gun221_r1;
	private final ModelRenderer gun236_r1;
	private final QRenderer grip;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun192_r1;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun247_r1;
	private final ModelRenderer gun8_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun190_r1;
	private final ModelRenderer gun191_r1;
	private final ModelRenderer gun1_r1;
	private final ModelRenderer gun2_r1;

	public TaurusRagingHunter() {
		textureWidth = 128;
		textureHeight = 128;

		barrel = new QRenderer(this);
		barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrel.cubeList.add(new ModelBox(barrel, 68, 55, -2.5F, -39.7F, -45.5F, 2, 3, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 86, 11, -2.5F, -39.7F, -38.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 79, -2.5F, -39.7F, -36.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 78, 59, -2.5F, -39.7F, -34.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 69, 21, -2.5F, -39.7F, -30.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 17, 70, -2.5F, -39.7F, -32.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 36, -2.5F, -39.7F, -28.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 68, 59, -2.5F, -39.7F, -26.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 5, -2.5F, -39.7F, -24.5F, 2, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 98, 91, -1.7F, -40.0F, -45.2F, 1, 1, 4, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 98, -2.3F, -40.0F, -45.2F, 1, 1, 4, 0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 24, -0.5F, -37.3F, -45.5F, 1, 1, 17, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 52, 0, -3.5F, -37.3F, -45.5F, 1, 1, 23, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 3, -1.7F, -36.3F, -45.5F, 1, 3, 24, -0.001F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -2.3F, -36.3F, -45.5F, 1, 3, 24, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 58, 101, -2.5F, -37.45F, -45.9F, 2, 2, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 76, 24, -2.0F, -40.2F, -45.1F, 1, 1, 1, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 75, -3.5F, -36.3F, -39.5F, 1, 1, 17, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 26, 12, -0.5F, -36.3F, -39.5F, 1, 1, 11, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 50, 31, -0.5F, -37.5F, -45.5F, 1, 1, 23, 0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 25, 30, -3.5F, -37.5F, -45.5F, 1, 1, 23, 0.002F, false));
		barrel.cubeList.add(new ModelBox(barrel, 68, 55, -2.5F, -39.3F, -39.5F, 2, 1, 17, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 61, 88, -0.5F, -36.8F, -28.5F, 1, 1, 6, 0.001F, false));

		gun160_r1 = new ModelRenderer(this);
		gun160_r1.setRotationPoint(-2.5F, -39.7F, -24.1F);
		barrel.addChild(gun160_r1);
		setRotationAngle(gun160_r1, 0.0F, 0.0F, 0.8552F);
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 39, 0, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 18, 38, -0.2F, -0.2F, -0.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 39, 12, -0.2F, -0.2F, -2.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 39, 8, -0.2F, -0.2F, -2.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 43, 30, -0.2F, -0.2F, -8.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 37, 41, -0.2F, -0.2F, -8.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 18, 40, -0.2F, -0.2F, -6.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 39, 20, -0.2F, -0.2F, -6.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 39, 18, -0.2F, -0.2F, -4.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 39, 14, -0.2F, -0.2F, -4.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 0, 51, -0.2F, -0.2F, -14.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 45, 20, -0.2F, -0.2F, -14.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 45, 18, -0.2F, -0.2F, -12.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 45, 14, -0.2F, -0.2F, -12.2F, 1, 1, 1, -0.201F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 45, 12, -0.2F, -0.2F, -10.6F, 1, 1, 1, -0.2F, false));
		gun160_r1.cubeList.add(new ModelBox(gun160_r1, 45, 8, -0.2F, -0.2F, -10.2F, 1, 1, 1, -0.201F, false));

		gun158_r1 = new ModelRenderer(this);
		gun158_r1.setRotationPoint(-0.5F, -39.7F, -24.5F);
		barrel.addChild(gun158_r1);
		setRotationAngle(gun158_r1, 0.0F, 0.0F, -0.8552F);
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 19, 35, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 33, 21, -0.8F, -0.2F, 0.2F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 39, 6, -0.8F, -0.2F, -2.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 39, 2, -0.8F, -0.2F, -1.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 45, 6, -0.8F, -0.2F, -3.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 44, 36, -0.8F, -0.2F, -4.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 43, 43, -0.8F, -0.2F, -7.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 43, 41, -0.8F, -0.2F, -8.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 37, 43, -0.8F, -0.2F, -6.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 43, 32, -0.8F, -0.2F, -5.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 53, 35, -0.8F, -0.2F, -10.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 0, 53, -0.8F, -0.2F, -9.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 55, 57, -0.8F, -0.2F, -12.2F, 1, 1, 1, -0.2F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 55, 55, -0.8F, -0.2F, -11.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 61, 30, -0.8F, -0.2F, -13.8F, 1, 1, 1, -0.201F, false));
		gun158_r1.cubeList.add(new ModelBox(gun158_r1, 61, 32, -0.8F, -0.2F, -14.2F, 1, 1, 1, -0.2F, false));

		gun243_r1 = new ModelRenderer(this);
		gun243_r1.setRotationPoint(-1.0F, -39.974F, -45.1295F);
		barrel.addChild(gun243_r1);
		setRotationAngle(gun243_r1, -0.1859F, 0.0F, 0.0F);
		gun243_r1.cubeList.add(new ModelBox(gun243_r1, 15, 51, -1.0F, -1.0F, 0.0F, 1, 2, 3, -0.2F, false));

		gun255_r1 = new ModelRenderer(this);
		gun255_r1.setRotationPoint(-3.5F, -45.3F, -18.5F);
		barrel.addChild(gun255_r1);
		setRotationAngle(gun255_r1, 0.0F, 0.0F, 2.1118F);
		gun255_r1.cubeList.add(new ModelBox(gun255_r1, 75, 32, 7.0115F, -8.579F, -10.0F, 1, 1, 6, -0.001F, false));
		gun255_r1.cubeList.add(new ModelBox(gun255_r1, 75, 42, 6.5115F, -8.579F, -21.0F, 2, 1, 11, -0.001F, false));
		gun255_r1.cubeList.add(new ModelBox(gun255_r1, 53, 87, 6.9615F, -8.579F, -27.0F, 1, 1, 6, -0.002F, false));
		gun255_r1.cubeList.add(new ModelBox(gun255_r1, 0, 27, 7.8115F, -8.579F, -27.0F, 1, 1, 23, 0.001F, false));

		gun253_r1 = new ModelRenderer(this);
		gun253_r1.setRotationPoint(0.5F, -45.3F, -29.5F);
		barrel.addChild(gun253_r1);
		setRotationAngle(gun253_r1, 0.0F, 0.0F, -2.1118F);
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 69, 73, -8.5115F, -8.579F, -10.0F, 2, 1, 17, 0.0F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 30, 89, -7.9615F, -8.579F, -16.0F, 1, 1, 6, -0.001F, false));
		gun253_r1.cubeList.add(new ModelBox(gun253_r1, 0, 51, -8.8115F, -8.579F, -16.0F, 1, 1, 23, 0.001F, false));

		gun257_r1 = new ModelRenderer(this);
		gun257_r1.setRotationPoint(-3.5F, -46.3F, -35.5F);
		barrel.addChild(gun257_r1);
		setRotationAngle(gun257_r1, 0.0F, 0.0F, 1.7474F);
		gun257_r1.cubeList.add(new ModelBox(gun257_r1, 86, 9, 9.1418F, -5.6946F, -10.0F, 1, 1, 6, -0.001F, false));
		gun257_r1.cubeList.add(new ModelBox(gun257_r1, 85, 16, 9.5418F, -5.6946F, -10.0F, 1, 1, 6, 0.001F, false));

		gun256_r1 = new ModelRenderer(this);
		gun256_r1.setRotationPoint(0.5F, -46.3F, -35.5F);
		barrel.addChild(gun256_r1);
		setRotationAngle(gun256_r1, 0.0F, 0.0F, -1.7474F);
		gun256_r1.cubeList.add(new ModelBox(gun256_r1, 89, 55, -10.1418F, -5.6946F, -10.0F, 1, 1, 6, -0.001F, false));
		gun256_r1.cubeList.add(new ModelBox(gun256_r1, 44, 89, -10.5418F, -5.6946F, -10.0F, 1, 1, 6, 0.001F, false));

		gun264_r1 = new ModelRenderer(this);
		gun264_r1.setRotationPoint(-3.5F, -47.5F, -30.5F);
		barrel.addChild(gun264_r1);
		setRotationAngle(gun264_r1, 0.0F, 0.0F, 2.7314F);
		gun264_r1.cubeList.add(new ModelBox(gun264_r1, 25, 54, 0.3193F, -10.7656F, -10.0F, 1, 2, 18, 0.0F, false));

		gun263_r1 = new ModelRenderer(this);
		gun263_r1.setRotationPoint(0.5F, -47.5F, -30.5F);
		barrel.addChild(gun263_r1);
		setRotationAngle(gun263_r1, 0.0F, 0.0F, -2.7314F);
		gun263_r1.cubeList.add(new ModelBox(gun263_r1, 48, 56, -1.3193F, -10.7656F, -10.0F, 1, 2, 18, 0.0F, false));

		gun268_r1 = new ModelRenderer(this);
		gun268_r1.setRotationPoint(-7.5F, -47.5F, -35.5F);
		barrel.addChild(gun268_r1);
		setRotationAngle(gun268_r1, 0.0F, 0.0F, -2.7314F);
		gun268_r1.cubeList.add(new ModelBox(gun268_r1, 0, 75, -8.6557F, -7.1756F, -10.0F, 1, 2, 6, 0.001F, false));
		gun268_r1.cubeList.add(new ModelBox(gun268_r1, 68, 66, -8.6557F, -7.5756F, -10.0F, 1, 1, 1, 0.0F, false));

		gun267_r1 = new ModelRenderer(this);
		gun267_r1.setRotationPoint(4.5F, -47.5F, -35.5F);
		barrel.addChild(gun267_r1);
		setRotationAngle(gun267_r1, 0.0F, 0.0F, 2.7314F);
		gun267_r1.cubeList.add(new ModelBox(gun267_r1, 75, 24, 7.6557F, -7.1756F, -10.0F, 1, 2, 6, 0.001F, false));
		gun267_r1.cubeList.add(new ModelBox(gun267_r1, 33, 75, 7.6557F, -7.5756F, -10.0F, 1, 1, 1, 0.0F, false));

		gun = new QRenderer(this);
		gun.setRotationPoint(2.7F, -21.8F, -18.3F);
		gun.cubeList.add(new ModelBox(gun, 0, 13, -6.0F, 14.3F, -0.2F, 1, 1, 10, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 27, -3.4F, 14.3F, -0.2F, 1, 1, 10, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 36, -5.2F, 6.0F, 3.3F, 2, 1, 3, -0.01F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -5.2F, 5.8F, 6.3F, 2, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 26, -4.7F, 5.6F, 9.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 28, -5.7F, 5.1F, 9.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 76, -3.7F, 5.1F, 9.1F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 53, 76, -5.9F, 5.2F, 9.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 63, 76, -3.5F, 5.2F, 9.4F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 76, -3.5F, 5.2F, 8.8F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 8, -5.9F, 5.2F, 8.8F, 1, 1, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 33, -4.5F, 5.9F, 8.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 102, -4.5F, 5.9F, 9.4F, 2, 1, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 102, 36, -5.9F, 5.9F, 9.4F, 2, 1, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 38, 102, -5.9F, 5.9F, 8.8F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 101, 30, -3.0F, 10.3F, 8.3F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 55, -6.4F, 10.3F, 8.3F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 41, -5.2F, 13.8F, -0.2F, 2, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 55, -4.0F, 6.1F, -4.2F, 1, 1, 8, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 39, 0, -6.4F, 9.0F, -4.2F, 1, 2, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 0, -6.0F, 14.8F, 8.3F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 30, -6.0F, 14.8F, 1.3F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 98, 85, -5.7F, 20.05F, 4.0F, 3, 1, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 51, -5.7F, 20.05F, 3.55F, 3, 1, 1, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 64, 24, -6.7F, 9.8F, 7.3F, 5, 2, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 99, -3.0F, 8.6F, -4.2F, 1, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 69, 85, -6.4F, 8.6F, -4.2F, 4, 1, 4, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 89, 91, -5.2F, 15.7F, -3.2F, 2, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 50, 43, -5.4F, 6.1F, -4.2F, 2, 1, 8, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 61, 30, -5.4F, 7.1F, -4.2F, 2, 2, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 37, 30, -3.9F, 7.1F, -4.2F, 1, 2, 4, 0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 85, 97, -4.4F, 6.1F, 3.3F, 2, 1, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 97, 97, -6.0F, 6.1F, 3.3F, 2, 1, 4, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 19, 75, -6.0F, 6.8F, -4.2F, 1, 1, 12, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 33, 76, -3.4F, 6.8F, -4.2F, 1, 1, 12, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 13, -5.5F, 8.8F, -3.2F, 2, 7, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 100, -3.2F, 14.5F, -3.2F, 1, 1, 3, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 83, 36, -5.7F, 6.8F, 9.5F, 3, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 45, 54, -3.4F, 6.8F, 9.3F, 1, 8, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 27, -6.0F, 6.8F, 9.3F, 3, 8, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 30, -6.0F, 6.8F, 8.8F, 3, 8, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 99, -3.4F, 6.8F, 8.8F, 1, 8, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 6, 38, -3.4F, 14.8F, 1.3F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 12, 38, -3.4F, 14.8F, 8.3F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 25, 54, -5.7F, 15.3F, 8.3F, 3, 4, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 52, 13, -5.7F, 15.3F, 1.3F, 3, 4, 1, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 68, 36, -3.4F, 6.1F, 7.8F, 1, 9, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 26, 12, -6.0F, 6.1F, 7.8F, 3, 9, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 27, -6.0F, 6.1F, 7.3F, 3, 9, 1, -0.003F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 0, -3.4F, 6.1F, 7.3F, 1, 9, 1, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 38, -3.4F, 14.8F, -0.2F, 1, 1, 10, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 47, 76, -6.0F, 14.8F, -0.2F, 3, 1, 10, 0.002F, false));

		gun126_r1 = new ModelRenderer(this);
		gun126_r1.setRotationPoint(-1.7F, 11.05F, -6.4F);
		gun.addChild(gun126_r1);
		setRotationAngle(gun126_r1, -2.0071F, 0.0F, 0.0F);
		gun126_r1.cubeList.add(new ModelBox(gun126_r1, 55, 60, -4.0F, -13.2893F, 3.8369F, 3, 2, 1, -0.001F, false));

		gun129_r1 = new ModelRenderer(this);
		gun129_r1.setRotationPoint(-1.7F, 9.3F, -8.7F);
		gun.addChild(gun129_r1);
		setRotationAngle(gun129_r1, 2.082F, 0.0F, 0.0F);
		gun129_r1.cubeList.add(new ModelBox(gun129_r1, 8, 79, -4.0F, 3.8293F, -14.6138F, 3, 1, 1, 0.0F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-2.0F, 6.3F, 18.3F);
		gun.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 2.3051F, 0.0F, 0.0F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 45, 0, -4.0F, -14.1237F, -0.7226F, 3, 1, 2, -0.002F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 102, 0, -1.4F, -14.1237F, -0.7226F, 1, 1, 2, 0.0F, false));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(-9.0F, 6.8F, -8.7F);
		gun.addChild(gun34_r1);
		setRotationAngle(gun34_r1, -2.2679F, 0.0F, 0.0F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 52, 18, 3.0F, -14.087F, 0.2471F, 3, 2, 1, -0.002F, false));
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 6, 13, 5.6F, -14.087F, 0.2471F, 1, 2, 1, -0.001F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-9.0F, 6.8F, 12.3F);
		gun.addChild(gun33_r1);
		setRotationAngle(gun33_r1, 2.2679F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 25, 59, 3.0F, -14.087F, -1.2471F, 3, 2, 1, -0.002F, false));
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 38, 5.6F, -14.087F, -1.2471F, 1, 2, 1, -0.001F, false));

		gun33_r2 = new ModelRenderer(this);
		gun33_r2.setRotationPoint(-2.0F, 6.0F, 15.3F);
		gun.addChild(gun33_r2);
		setRotationAngle(gun33_r2, 1.7474F, 0.0F, 0.0F);
		gun33_r2.cubeList.add(new ModelBox(gun33_r2, 101, 6, -4.0F, -11.6013F, -8.0876F, 3, 3, 1, -0.001F, false));
		gun33_r2.cubeList.add(new ModelBox(gun33_r2, 0, 13, -1.4F, -11.6013F, -8.0876F, 1, 3, 1, -0.002F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(-9.0F, 6.0F, 15.3F);
		gun.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 2.9371F, 0.0F, 0.0F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 12, 44, 3.0F, -11.8223F, 7.7611F, 3, 1, 2, -0.002F, false));
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 70, 101, 5.6F, -11.8223F, 7.7611F, 1, 1, 2, -0.001F, false));

		gun47_r1 = new ModelRenderer(this);
		gun47_r1.setRotationPoint(-9.0F, -3.2F, 20.3F);
		gun.addChild(gun47_r1);
		setRotationAngle(gun47_r1, -1.1897F, 0.0F, 0.0F);
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 0, 38, 3.0F, 13.0019F, 5.5634F, 1, 2, 4, 0.002F, false));
		gun47_r1.cubeList.add(new ModelBox(gun47_r1, 37, 41, 5.6F, 13.0019F, 5.5634F, 1, 2, 4, 0.002F, false));

		gun49_r1 = new ModelRenderer(this);
		gun49_r1.setRotationPoint(-9.0F, -1.2F, 21.0F);
		gun.addChild(gun49_r1);
		setRotationAngle(gun49_r1, -0.7482F, 0.0F, 0.0F);
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 17, 0, 3.0F, 14.1324F, -0.5257F, 1, 2, 2, 0.001F, false));
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 78, 55, 5.6F, 14.1324F, -0.5257F, 1, 2, 2, 0.001F, false));
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 17, 62, 3.3F, 13.9324F, -0.5257F, 1, 2, 2, 0.0F, false));
		gun49_r1.cubeList.add(new ModelBox(gun49_r1, 77, 0, 5.3F, 13.9324F, -0.5257F, 1, 2, 2, 0.0F, false));

		gun45_r1 = new ModelRenderer(this);
		gun45_r1.setRotationPoint(-9.0F, 0.8F, 24.9F);
		gun.addChild(gun45_r1);
		setRotationAngle(gun45_r1, -1.8589F, 0.0F, 0.0F);
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 0, 13, 3.0F, 5.7461F, 12.4294F, 1, 6, 4, 0.003F, false));
		gun45_r1.cubeList.add(new ModelBox(gun45_r1, 26, 0, 5.6F, 5.7461F, 12.4294F, 1, 6, 4, 0.003F, false));

		gun51_r1 = new ModelRenderer(this);
		gun51_r1.setRotationPoint(-8.0F, 0.4F, 24.9F);
		gun.addChild(gun51_r1);
		setRotationAngle(gun51_r1, -1.8589F, 0.0F, 0.0F);
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 39, 65, 3.0F, 5.1461F, 12.5294F, 1, 1, 1, 0.001F, false));
		gun51_r1.cubeList.add(new ModelBox(gun51_r1, 63, 78, 3.6F, 5.1461F, 12.5294F, 1, 1, 1, 0.0F, false));

		gun53_r1 = new ModelRenderer(this);
		gun53_r1.setRotationPoint(-8.0F, 0.5F, 24.9F);
		gun.addChild(gun53_r1);
		setRotationAngle(gun53_r1, -1.1897F, 0.0F, 0.0F);
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 66, 0, 3.0F, 11.7519F, 6.5634F, 1, 1, 1, 0.0F, false));
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 53, 78, 3.6F, 11.7519F, 6.5634F, 1, 1, 1, 0.001F, false));
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 8, 90, 2.3F, 11.8519F, 6.5634F, 3, 1, 1, 0.0F, false));
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 0, 90, 2.3F, 11.8519F, 7.6634F, 3, 1, 1, 0.0F, false));
		gun53_r1.cubeList.add(new ModelBox(gun53_r1, 47, 78, 2.3F, 11.8519F, 7.0634F, 1, 1, 1, -0.001F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-8.7F, -3.2F, 20.5F);
		gun.addChild(gun62_r1);
		setRotationAngle(gun62_r1, -1.1897F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 12, 38, 3.0F, 13.0019F, 5.5634F, 1, 2, 4, 0.0F, false));
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 39, 12, 5.0F, 13.0019F, 5.5634F, 1, 2, 4, 0.0F, false));

		gun55_r1 = new ModelRenderer(this);
		gun55_r1.setRotationPoint(-8.7F, 0.6F, 24.9F);
		gun.addChild(gun55_r1);
		setRotationAngle(gun55_r1, -1.8589F, 0.0F, 0.0F);
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 50, 30, 3.0F, 5.2461F, 12.4294F, 1, 5, 1, 0.0F, false));
		gun55_r1.cubeList.add(new ModelBox(gun55_r1, 49, 55, 5.0F, 5.2461F, 12.4294F, 1, 5, 1, 0.0F, false));

		gun65_r1 = new ModelRenderer(this);
		gun65_r1.setRotationPoint(-2.2F, 15.5F, -3.2F);
		gun.addChild(gun65_r1);
		setRotationAngle(gun65_r1, 0.0F, 0.0F, -0.7854F);
		gun65_r1.cubeList.add(new ModelBox(gun65_r1, 0, 66, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun64_r1 = new ModelRenderer(this);
		gun64_r1.setRotationPoint(-2.2F, 14.5F, -3.2F);
		gun.addChild(gun64_r1);
		setRotationAngle(gun64_r1, 0.0F, 0.0F, -0.7854F);
		gun64_r1.cubeList.add(new ModelBox(gun64_r1, 8, 75, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun66_r1 = new ModelRenderer(this);
		gun66_r1.setRotationPoint(0.8F, 6.7F, 6.8F);
		gun.addChild(gun66_r1);
		setRotationAngle(gun66_r1, 0.0F, 0.0F, -2.3562F);
		gun66_r1.cubeList.add(new ModelBox(gun66_r1, 10, 99, -4.2426F, -9.8995F, -10.0F, 1, 1, 4, 0.0F, false));

		gun87_r1 = new ModelRenderer(this);
		gun87_r1.setRotationPoint(-1.5F, 2.0F, 5.8F);
		gun.addChild(gun87_r1);
		setRotationAngle(gun87_r1, 0.2094F, 0.0F, 0.0F);
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 0, 0, -4.0F, 7.7024F, -11.8106F, 2, 4, 1, 0.001F, false));
		gun87_r1.cubeList.add(new ModelBox(gun87_r1, 19, 13, -2.4F, 9.7024F, -11.8106F, 1, 2, 1, 0.0F, false));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(-1.2F, 1.3F, 5.8F);
		gun.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0.2094F, 0.0F, 0.0F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 44, 102, -4.0F, 11.8024F, -11.9606F, 2, 1, 1, 0.0F, false));

		gun99_r1 = new ModelRenderer(this);
		gun99_r1.setRotationPoint(-2.4F, 1.0F, 5.8F);
		gun.addChild(gun99_r1);
		setRotationAngle(gun99_r1, 0.0F, 0.0F, -2.2075F);
		gun99_r1.cubeList.add(new ModelBox(gun99_r1, 67, 95, -7.6626F, -9.1616F, -10.0F, 2, 1, 4, -0.001F, false));

		gun101_r1 = new ModelRenderer(this);
		gun101_r1.setRotationPoint(-6.0F, -1.4F, 5.8F);
		gun.addChild(gun101_r1);
		setRotationAngle(gun101_r1, 0.0F, 0.0F, 1.12F);
		gun101_r1.cubeList.add(new ModelBox(gun101_r1, 90, 85, 8.7437F, 0.7564F, -10.0F, 2, 1, 4, -0.001F, false));

		gun100_r1 = new ModelRenderer(this);
		gun100_r1.setRotationPoint(-2.4F, -1.4F, 5.8F);
		gun.addChild(gun100_r1);
		setRotationAngle(gun100_r1, 0.0F, 0.0F, -1.12F);
		gun100_r1.cubeList.add(new ModelBox(gun100_r1, 94, 36, -10.7437F, 0.7564F, -10.0F, 2, 1, 4, -0.001F, false));

		gun106_r1 = new ModelRenderer(this);
		gun106_r1.setRotationPoint(-6.4F, -3.2F, 5.8F);
		gun.addChild(gun106_r1);
		setRotationAngle(gun106_r1, 0.0F, 0.0F, 0.8029F);
		gun106_r1.cubeList.add(new ModelBox(gun106_r1, 52, 13, 8.972F, 4.0692F, -10.0F, 1, 1, 8, -0.001F, false));

		gun105_r1 = new ModelRenderer(this);
		gun105_r1.setRotationPoint(-2.0F, -3.2F, 5.8F);
		gun.addChild(gun105_r1);
		setRotationAngle(gun105_r1, 0.0F, 0.0F, -0.8029F);
		gun105_r1.cubeList.add(new ModelBox(gun105_r1, 0, 62, -9.972F, 4.0692F, -10.0F, 1, 1, 8, -0.001F, false));

		gun108_r1 = new ModelRenderer(this);
		gun108_r1.setRotationPoint(-2.0F, -3.9F, 13.3F);
		gun.addChild(gun108_r1);
		setRotationAngle(gun108_r1, -1.1154F, 0.0F, 0.0F);
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 66, 2, -1.4F, 13.9792F, 4.5821F, 1, 1, 1, -0.002F, false));
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 30, 93, -4.0F, 13.9792F, 4.5821F, 2, 1, 1, -0.002F, false));
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 87, 91, -2.4F, 13.3792F, 4.5821F, 2, 1, 1, -0.001F, false));
		gun108_r1.cubeList.add(new ModelBox(gun108_r1, 102, 38, -4.0F, 13.3792F, 4.5821F, 2, 1, 1, -0.001F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(-10.7F, 1.8F, 17.3F);
		gun.addChild(gun117_r1);
		setRotationAngle(gun117_r1, 0.0F, 0.0F, -2.3562F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 68, 48, -10.8995F, -4.2426F, -10.0F, 1, 1, 1, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(-10.7F, -0.2F, 17.3F);
		gun.addChild(gun118_r1);
		setRotationAngle(gun118_r1, 0.0F, 0.0F, -2.3562F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 45, 66, -10.8995F, -4.2426F, -10.0F, 1, 1, 1, 0.0F, false));

		gun117_r2 = new ModelRenderer(this);
		gun117_r2.setRotationPoint(2.3F, -0.2F, 17.3F);
		gun.addChild(gun117_r2);
		setRotationAngle(gun117_r2, 0.0F, 0.0F, 2.3562F);
		gun117_r2.cubeList.add(new ModelBox(gun117_r2, 68, 64, 9.8995F, -4.2426F, -10.0F, 1, 1, 1, 0.0F, false));

		gun116_r1 = new ModelRenderer(this);
		gun116_r1.setRotationPoint(2.3F, 1.8F, 17.3F);
		gun.addChild(gun116_r1);
		setRotationAngle(gun116_r1, 0.0F, 0.0F, 2.3562F);
		gun116_r1.cubeList.add(new ModelBox(gun116_r1, 40, 77, 9.8995F, -4.2426F, -10.0F, 1, 1, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(-1.7F, 11.05F, 17.0F);
		gun.addChild(gun125_r1);
		setRotationAngle(gun125_r1, 2.0071F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 97, 69, -4.0F, -13.2893F, -4.8369F, 3, 2, 1, -0.001F, false));

		gun128_r1 = new ModelRenderer(this);
		gun128_r1.setRotationPoint(-1.7F, 9.3F, 19.3F);
		gun.addChild(gun128_r1);
		setRotationAngle(gun128_r1, -2.082F, 0.0F, 0.0F);
		gun128_r1.cubeList.add(new ModelBox(gun128_r1, 83, 28, -4.0F, 3.8293F, 13.6138F, 3, 1, 1, 0.0F, false));

		gun134_r1 = new ModelRenderer(this);
		gun134_r1.setRotationPoint(-1.2F, 16.3F, 19.75F);
		gun.addChild(gun134_r1);
		setRotationAngle(gun134_r1, -0.4007F, 0.0F, 0.0F);
		gun134_r1.cubeList.add(new ModelBox(gun134_r1, 61, 87, -4.0F, 6.6303F, -12.4916F, 2, 2, 1, 0.0F, false));

		gun133_r1 = new ModelRenderer(this);
		gun133_r1.setRotationPoint(-1.2F, 5.3F, 14.75F);
		gun.addChild(gun133_r1);
		setRotationAngle(gun133_r1, 0.2974F, 0.0F, 0.0F);
		gun133_r1.cubeList.add(new ModelBox(gun133_r1, 75, 32, -4.0F, 6.6303F, -12.4916F, 2, 3, 1, 0.001F, false));

		gun137_r1 = new ModelRenderer(this);
		gun137_r1.setRotationPoint(-1.2F, 5.0F, 17.1F);
		gun.addChild(gun137_r1);
		setRotationAngle(gun137_r1, -1.041F, 0.0F, 0.0F);
		gun137_r1.cubeList.add(new ModelBox(gun137_r1, 64, 101, -4.0F, 13.6827F, 3.5755F, 2, 2, 1, -0.001F, false));

		gun183_r1 = new ModelRenderer(this);
		gun183_r1.setRotationPoint(1.6F, 4.3F, 9.8F);
		gun.addChild(gun183_r1);
		setRotationAngle(gun183_r1, 0.0F, 0.0F, 2.1192F);
		gun183_r1.cubeList.add(new ModelBox(gun183_r1, 25, 54, 10.6189F, -1.7996F, -10.0F, 1, 1, 8, 0.0F, false));

		gun185_r1 = new ModelRenderer(this);
		gun185_r1.setRotationPoint(1.6F, 4.0F, 6.4F);
		gun.addChild(gun185_r1);
		setRotationAngle(gun185_r1, 0.0F, 0.0F, 2.3562F);
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 100, 14, 9.8995F, -4.2426F, -10.0F, 1, 1, 3, 0.0F, false));
		gun185_r1.cubeList.add(new ModelBox(gun185_r1, 33, 77, 9.8995F, -4.2426F, -7.6F, 1, 1, 1, 0.001F, false));

		gun189_r1 = new ModelRenderer(this);
		gun189_r1.setRotationPoint(-2.0F, 4.3F, 9.8F);
		gun.addChild(gun189_r1);
		setRotationAngle(gun189_r1, 0.0F, 0.0F, -0.5205F);
		gun189_r1.cubeList.add(new ModelBox(gun189_r1, 25, 30, -8.4434F, 6.6864F, -10.0F, 1, 1, 10, 0.0F, false));

		gun211_r1 = new ModelRenderer(this);
		gun211_r1.setRotationPoint(-10.4F, 1.3F, 18.3F);
		gun.addChild(gun211_r1);
		setRotationAngle(gun211_r1, 0.0F, 0.0F, -2.3562F);
		gun211_r1.cubeList.add(new ModelBox(gun211_r1, 89, 58, -10.8995F, -4.2426F, -10.0F, 1, 1, 2, 0.0F, false));

		gun212_r1 = new ModelRenderer(this);
		gun212_r1.setRotationPoint(-10.4F, 0.3F, 18.3F);
		gun.addChild(gun212_r1);
		setRotationAngle(gun212_r1, 0.0F, 0.0F, -2.3562F);
		gun212_r1.cubeList.add(new ModelBox(gun212_r1, 52, 89, -10.8995F, -4.2426F, -10.0F, 1, 1, 2, 0.0F, false));

		gun211_r2 = new ModelRenderer(this);
		gun211_r2.setRotationPoint(2.0F, 0.3F, 18.3F);
		gun.addChild(gun211_r2);
		setRotationAngle(gun211_r2, 0.0F, 0.0F, 2.3562F);
		gun211_r2.cubeList.add(new ModelBox(gun211_r2, 61, 90, 9.8995F, -4.2426F, -10.0F, 1, 1, 2, 0.0F, false));

		gun210_r1 = new ModelRenderer(this);
		gun210_r1.setRotationPoint(2.0F, 1.3F, 18.3F);
		gun.addChild(gun210_r1);
		setRotationAngle(gun210_r1, 0.0F, 0.0F, 2.3562F);
		gun210_r1.cubeList.add(new ModelBox(gun210_r1, 101, 25, 9.8995F, -4.2426F, -10.0F, 1, 1, 2, 0.0F, false));

		gun212_r2 = new ModelRenderer(this);
		gun212_r2.setRotationPoint(-0.7F, -2.7F, 21.0F);
		gun.addChild(gun212_r2);
		setRotationAngle(gun212_r2, -1.1897F, 0.0F, 0.0F);
		gun212_r2.cubeList.add(new ModelBox(gun212_r2, 99, 73, -4.0F, 13.0019F, 5.5634F, 1, 1, 3, 0.0F, false));

		gun213_r1 = new ModelRenderer(this);
		gun213_r1.setRotationPoint(-0.7F, -0.7F, 21.3F);
		gun.addChild(gun213_r1);
		setRotationAngle(gun213_r1, -0.2231F, 0.0F, 0.0F);
		gun213_r1.cubeList.add(new ModelBox(gun213_r1, 101, 22, -4.0F, 11.9645F, -7.54F, 1, 1, 2, 0.001F, false));

		gun214_r1 = new ModelRenderer(this);
		gun214_r1.setRotationPoint(-0.7F, -0.25F, 23.25F);
		gun.addChild(gun214_r1);
		setRotationAngle(gun214_r1, -0.7064F, 0.0F, 0.0F);
		gun214_r1.cubeList.add(new ModelBox(gun214_r1, 101, 10, -4.0F, 14.098F, -1.1161F, 1, 1, 2, 0.0F, false));

		gun215_r1 = new ModelRenderer(this);
		gun215_r1.setRotationPoint(-0.7F, -0.25F, 23.25F);
		gun.addChild(gun215_r1);
		setRotationAngle(gun215_r1, -0.4461F, 0.0F, 0.0F);
		gun215_r1.cubeList.add(new ModelBox(gun215_r1, 26, 77, -4.0F, 13.3361F, -3.9063F, 1, 1, 1, 0.0F, false));

		gun217_r1 = new ModelRenderer(this);
		gun217_r1.setRotationPoint(-0.7F, -1.7F, 21.9F);
		gun.addChild(gun217_r1);
		setRotationAngle(gun217_r1, -1.8961F, 0.0F, 0.0F);
		gun217_r1.cubeList.add(new ModelBox(gun217_r1, 19, 77, -4.0F, 6.2795F, 12.6716F, 1, 1, 1, -0.001F, false));

		gun218_r1 = new ModelRenderer(this);
		gun218_r1.setRotationPoint(-0.7F, -1.7F, 21.9F);
		gun.addChild(gun218_r1);
		setRotationAngle(gun218_r1, 0.632F, 0.0F, 0.0F);
		gun218_r1.cubeList.add(new ModelBox(gun218_r1, 52, 100, -4.0F, 2.1604F, -14.9762F, 1, 1, 2, 0.001F, false));

		gun219_r1 = new ModelRenderer(this);
		gun219_r1.setRotationPoint(-0.7F, -2.25F, 22.6F);
		gun.addChild(gun219_r1);
		setRotationAngle(gun219_r1, 0.2602F, 0.0F, 0.0F);
		gun219_r1.cubeList.add(new ModelBox(gun219_r1, 77, 17, -4.0F, 7.09F, -12.2365F, 1, 1, 1, 0.0F, false));

		gun220_r1 = new ModelRenderer(this);
		gun220_r1.setRotationPoint(-0.7F, -2.25F, 22.6F);
		gun.addChild(gun220_r1);
		setRotationAngle(gun220_r1, 0.1487F, 0.0F, 0.0F);
		gun220_r1.cubeList.add(new ModelBox(gun220_r1, 77, 15, -4.0F, 8.308F, -10.5713F, 1, 1, 1, 0.001F, false));

		gun221_r1 = new ModelRenderer(this);
		gun221_r1.setRotationPoint(-0.7F, -1.7F, 21.9F);
		gun.addChild(gun221_r1);
		setRotationAngle(gun221_r1, -0.2231F, 0.0F, 0.0F);
		gun221_r1.cubeList.add(new ModelBox(gun221_r1, 77, 10, -4.0F, 12.2645F, -7.54F, 1, 1, 1, -0.001F, false));

		gun236_r1 = new ModelRenderer(this);
		gun236_r1.setRotationPoint(-1.2F, -4.2F, 16.3F);
		gun.addChild(gun236_r1);
		setRotationAngle(gun236_r1, -0.7854F, 0.0F, 0.0F);
		gun236_r1.cubeList.add(new ModelBox(gun236_r1, 97, 59, -4.0F, 14.1421F, 0.0F, 2, 1, 1, 0.0F, false));

		grip = new QRenderer(this);
		grip.setRotationPoint(0.0F, -17.3F, 4.4F);
		

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 1.6359F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 11, 72, -4.0F, -7.329F, -9.3287F, 5, 1, 1, -0.001F, false));
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 45, 64, -4.0F, -10.629F, -12.3287F, 5, 4, 4, 0.001F, false));

		gun192_r1 = new ModelRenderer(this);
		gun192_r1.setRotationPoint(0.0F, 14.2F, 0.7F);
		grip.addChild(gun192_r1);
		setRotationAngle(gun192_r1, 0.0524F, 0.0F, 0.0F);
		gun192_r1.cubeList.add(new ModelBox(gun192_r1, 25, 51, -4.0F, 9.4629F, -2.1097F, 5, 1, 1, 0.0F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(0.5F, -3.85F, 2.2F);
		grip.addChild(gun42_r1);
		setRotationAngle(gun42_r1, -0.1115F, 0.0F, 0.0F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 37, 47, -4.0F, 11.4509F, -8.5248F, 4, 1, 1, 0.001F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(0.5F, -2.3F, -2.5F);
		grip.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.3346F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 98, 62, -4.0F, 7.1614F, -8.6294F, 4, 3, 2, 0.002F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(0.0F, -1.7F, 4.0F);
		grip.addChild(gun15_r1);
		setRotationAngle(gun15_r1, -0.9295F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 0, 71, -4.0F, 13.9956F, 2.5304F, 5, 1, 1, 0.002F, false));
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 25, 63, -4.0F, 13.9956F, 3.0304F, 5, 5, 4, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(0.0F, 14.2F, 2.8F);
		grip.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.0524F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 77, 0, -4.0F, 9.4629F, -10.5097F, 5, 1, 7, 0.001F, false));

		gun247_r1 = new ModelRenderer(this);
		gun247_r1.setRotationPoint(0.0F, 14.2F, 2.8F);
		grip.addChild(gun247_r1);
		setRotationAngle(gun247_r1, 1.2421F, 0.0F, 0.0F);
		gun247_r1.cubeList.add(new ModelBox(gun247_r1, 52, 24, -4.0F, -6.2362F, -12.6929F, 5, 2, 1, 0.0F, false));

		gun8_r1 = new ModelRenderer(this);
		gun8_r1.setRotationPoint(0.0F, 6.9F, 8.9F);
		grip.addChild(gun8_r1);
		setRotationAngle(gun8_r1, -1.4128F, 0.0F, 0.0F);
		gun8_r1.cubeList.add(new ModelBox(gun8_r1, 0, 0, -4.0F, 11.449F, 8.3019F, 5, 6, 7, 0.003F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(0.0F, 5.3F, 1.5F);
		grip.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.1859F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 52, 0, -4.0F, 7.9795F, -11.676F, 5, 9, 4, -0.001F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(0.0F, 2.3F, 7.0F);
		grip.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -1.1897F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 0, 51, -4.0F, 13.0019F, 5.5634F, 5, 6, 5, 0.002F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(0.0F, 3.7F, 0.1F);
		grip.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.4461F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 14, 93, -4.0F, 4.7063F, -13.3361F, 5, 4, 2, -0.002F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.0F, 3.7F, -3.5F);
		grip.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 1.4128F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 75, 91, -4.0F, -8.3019F, -11.449F, 5, 5, 2, -0.001F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.0F, 1.7F, -0.5F);
		grip.addChild(gun12_r1);
		setRotationAngle(gun12_r1, 2.6025F, 0.0F, 0.0F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 75, 39, -4.0F, -12.2153F, 3.4482F, 5, 1, 1, -0.002F, false));
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 90, 80, -4.0F, -13.7153F, 1.4482F, 5, 2, 3, -0.001F, false));

		gun190_r1 = new ModelRenderer(this);
		gun190_r1.setRotationPoint(0.0F, 2.7F, -3.5F);
		grip.addChild(gun190_r1);
		setRotationAngle(gun190_r1, 1.8961F, 0.0F, 0.0F);
		gun190_r1.cubeList.add(new ModelBox(gun190_r1, 10, 68, -4.0F, -12.9716F, -7.1795F, 5, 1, 1, -0.002F, false));
		gun190_r1.cubeList.add(new ModelBox(gun190_r1, 0, 93, -4.0F, -12.6716F, -7.2795F, 5, 4, 2, 0.002F, false));

		gun191_r1 = new ModelRenderer(this);
		gun191_r1.setRotationPoint(0.0F, 2.7F, -3.5F);
		grip.addChild(gun191_r1);
		setRotationAngle(gun191_r1, 3.123F, 0.0F, 0.0F);
		gun191_r1.cubeList.add(new ModelBox(gun191_r1, 62, 19, -4.0F, -10.2842F, 9.1124F, 5, 1, 1, 0.001F, false));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(0.5F, 2.3F, -4.4F);
		grip.addChild(gun1_r1);
		setRotationAngle(gun1_r1, 1.1897F, 0.0F, 0.0F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 68, 64, -4.0F, -5.0634F, -12.5019F, 4, 3, 4, 0.001F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(0.5F, -2.2F, -2.5F);
		grip.addChild(gun2_r1);
		setRotationAngle(gun2_r1, 0.3316F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 63, 76, -4.0F, 6.6995F, -12.7109F, 4, 4, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel.render(f5);
		gun.render(f5);
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
