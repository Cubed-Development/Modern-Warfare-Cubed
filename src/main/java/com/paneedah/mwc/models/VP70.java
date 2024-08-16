package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VP70 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4_r2;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun11_r2;
	private final ModelRenderer gun10_r2;
	private final ModelRenderer gun10_r3;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun5_r2;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r3;
	private final ModelRenderer gun5_r4;
	private final ModelRenderer gun6_r2;
	private final ModelRenderer gun11_r3;
	private final ModelRenderer gun13_r4;
	private final ModelRenderer gun12_r1;
	private final ModelRenderer gun12_r2;
	private final ModelRenderer gun13_r5;
	private final ModelRenderer gun12_r3;
	private final ModelRenderer gun3_r2;
	private final ModelRenderer gun3_r3;
	private final ModelRenderer gun3_r4;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r3;
	private final ModelRenderer gun6_r4;
	private final ModelRenderer gun3_r5;
	private final ModelRenderer gun12_r4;
	private final ModelRenderer gun14_r6;
	private final ModelRenderer gun13_r6;
	private final ModelRenderer gun13_r7;
	private final ModelRenderer gun14_r7;
	private final ModelRenderer gun13_r8;
	private final ModelRenderer gun4_r3;
	private final ModelRenderer gun4_r4;
	private final ModelRenderer gun12_r5;
	private final ModelRenderer gun11_r4;
	private final ModelRenderer gun13_r9;
	private final ModelRenderer gun12_r6;
	private final ModelRenderer gun13_r10;
	private final ModelRenderer gun33_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun41_r2;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun62_r1;
	private final ModelRenderer gun63_r1;
	private final ModelRenderer gun62_r2;
	private final ModelRenderer gun61_r1;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer gun18_r4;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun21_r2;

	public VP70() {
		textureWidth = 180;
		textureHeight = 180;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 24.0F, 0.0F);
		gun.cubeList.add(new ModelBox(gun, 25, 24, -1.501F, -31.9161F, -13.0465F, 1, 6, 3, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 128, -3.499F, -33.5F, -7.0F, 5, 3, 6, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 0, 44, -3.499F, -33.5F, -1.25F, 5, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 99, 26, -0.751F, -34.2706F, 3.9033F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 91, -3.249F, -34.2706F, 3.9033F, 2, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 104, 98, -1.5F, -34.3858F, 3.4193F, 1, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 90, 105, -3.2501F, -19.3463F, -3.976F, 1, 3, 7, -0.002F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 16, -3.601F, -33.25F, -17.0F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 16, -3.249F, -30.3463F, -3.351F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 112, 32, 0.2753F, -19.3463F, -3.976F, 1, 3, 7, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 10, 40, -1.399F, -33.25F, -17.0F, 3, 2, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 60, 32, 0.249F, -30.3463F, -3.351F, 1, 4, 2, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 76, 117, -3.499F, -34.0F, -16.0F, 5, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 122, 114, -2.499F, -33.5F, -16.0F, 3, 2, 9, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 32, 65, -2.0F, -31.5F, -10.75F, 2, 5, 4, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 4, 108, -0.75F, -27.5F, -10.0F, 1, 1, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 80, 96, -2.501F, -29.5F, -1.5F, 3, 3, 1, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 66, 116, -2.0F, -26.5F, -17.75F, 2, 1, 7, 0.0F, false));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-0.951F, -32.3122F, 4.0015F);
		gun.addChild(gun4_r1);
		setRotationAngle(gun4_r1, -0.6109F, 0.0F, 0.0F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 79, 92, -2.075F, -0.5F, -0.5F, 4, 1, 1, -0.2F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(-1.001F, -30.25F, 0.0F);
		gun.addChild(gun2_r1);
		setRotationAngle(gun2_r1, -0.6545F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 94, 84, -1.5F, -2.5F, -0.5F, 3, 4, 1, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-1.001F, -18.2901F, 3.0452F);
		gun.addChild(gun5_r1);
		setRotationAngle(gun5_r1, -1.2819F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 47, 72, -2.0F, -1.0F, -1.25F, 4, 2, 3, 0.0F, false));

		gun4_r2 = new ModelRenderer(this);
		gun4_r2.setRotationPoint(-1.001F, -23.0829F, 0.6207F);
		gun.addChild(gun4_r2);
		setRotationAngle(gun4_r2, -1.0637F, 0.0F, 0.0F);
		gun4_r2.cubeList.add(new ModelBox(gun4_r2, 123, 76, -1.5F, -1.0F, -4.5F, 3, 1, 9, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(-1.0F, -25.75F, -7.25F);
		gun.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -0.829F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 98, 47, -1.002F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(-1.0F, -26.25F, -8.25F);
		gun.addChild(gun10_r1);
		setRotationAngle(gun10_r1, -0.1309F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 90, 99, -1.001F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(-1.0F, -26.2418F, -9.9135F);
		gun.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 0.2618F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 0, 100, -1.002F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));

		gun11_r2 = new ModelRenderer(this);
		gun11_r2.setRotationPoint(-1.0F, -30.8981F, -10.6009F);
		gun.addChild(gun11_r2);
		setRotationAngle(gun11_r2, 0.7854F, 0.0F, 0.0F);
		gun11_r2.cubeList.add(new ModelBox(gun11_r2, 39, 100, -1.002F, -1.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun10_r2 = new ModelRenderer(this);
		gun10_r2.setRotationPoint(-1.0F, -27.1019F, -10.6009F);
		gun.addChild(gun10_r2);
		setRotationAngle(gun10_r2, -0.7854F, 0.0F, 0.0F);
		gun10_r2.cubeList.add(new ModelBox(gun10_r2, 50, 100, -1.002F, -0.5F, -0.5F, 2, 2, 1, 0.0F, false));

		gun10_r3 = new ModelRenderer(this);
		gun10_r3.setRotationPoint(-1.0F, -27.6075F, -19.9554F);
		gun.addChild(gun10_r3);
		setRotationAngle(gun10_r3, -0.6196F, 0.0F, 0.0F);
		gun10_r3.cubeList.add(new ModelBox(gun10_r3, 49, 86, -1.0F, -0.5F, -0.25F, 2, 1, 3, 0.001F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(-1.001F, -32.6195F, 1.7586F);
		gun.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.2618F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 80, 66, -0.25F, -1.7F, -1.95F, 2, 3, 4, 0.0F, false));
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 49, 79, -1.748F, -1.7F, -1.95F, 2, 3, 4, 0.0F, false));

		gun5_r2 = new ModelRenderer(this);
		gun5_r2.setRotationPoint(0.75F, -28.3463F, -2.351F);
		gun.addChild(gun5_r2);
		setRotationAngle(gun5_r2, -0.6545F, 0.0F, 0.0F);
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 104, 101, -0.5F, -3.25F, -0.75F, 1, 2, 1, 0.0F, false));
		gun5_r2.cubeList.add(new ModelBox(gun5_r2, 30, 24, -4.0F, -3.25F, -0.75F, 1, 2, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(0.3447F, -30.1747F, 0.1942F);
		gun.addChild(gun6_r1);
		setRotationAngle(gun6_r1, -0.7132F, -0.3751F, 0.3069F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 29, 13, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun5_r3 = new ModelRenderer(this);
		gun5_r3.setRotationPoint(0.4054F, -28.3463F, -0.6185F);
		gun.addChild(gun5_r3);
		setRotationAngle(gun5_r3, 0.0F, -0.3927F, 0.0F);
		gun5_r3.cubeList.add(new ModelBox(gun5_r3, 29, 0, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun5_r4 = new ModelRenderer(this);
		gun5_r4.setRotationPoint(-0.1368F, -22.037F, 0.6972F);
		gun.addChild(gun5_r4);
		setRotationAngle(gun5_r4, -1.0294F, -0.3411F, -0.1985F);
		gun5_r4.cubeList.add(new ModelBox(gun5_r4, 12, 124, 0.5F, -1.0F, -5.5F, 1, 1, 9, 0.0F, false));

		gun6_r2 = new ModelRenderer(this);
		gun6_r2.setRotationPoint(-0.251F, -22.5829F, -0.3793F);
		gun.addChild(gun6_r2);
		setRotationAngle(gun6_r2, -1.0637F, 0.0F, 0.0F);
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 47, 127, 0.5001F, -1.25F, -4.5F, 1, 3, 9, 0.0F, false));
		gun6_r2.cubeList.add(new ModelBox(gun6_r2, 123, 125, -2.9981F, -1.25F, -4.5F, 1, 3, 9, 0.0F, false));

		gun11_r3 = new ModelRenderer(this);
		gun11_r3.setRotationPoint(-1.3274F, -29.7929F, -4.0F);
		gun.addChild(gun11_r3);
		setRotationAngle(gun11_r3, 0.0F, 0.0F, -0.7854F);
		gun11_r3.cubeList.add(new ModelBox(gun11_r3, 60, 32, 1.5F, -1.5F, -3.0F, 1, 3, 6, 0.0F, false));

		gun13_r4 = new ModelRenderer(this);
		gun13_r4.setRotationPoint(0.384F, -31.192F, -8.3325F);
		gun.addChild(gun13_r4);
		setRotationAngle(gun13_r4, -0.281F, 0.4478F, 0.9828F);
		gun13_r4.cubeList.add(new ModelBox(gun13_r4, 94, 79, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

		gun12_r1 = new ModelRenderer(this);
		gun12_r1.setRotationPoint(0.383F, -31.7563F, -9.5541F);
		gun.addChild(gun12_r1);
		setRotationAngle(gun12_r1, -0.2042F, 0.3378F, 1.0123F);
		gun12_r1.cubeList.add(new ModelBox(gun12_r1, 76, 23, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun12_r2 = new ModelRenderer(this);
		gun12_r2.setRotationPoint(0.8107F, -32.153F, -11.5F);
		gun.addChild(gun12_r2);
		setRotationAngle(gun12_r2, 0.0F, 0.0F, 1.0036F);
		gun12_r2.cubeList.add(new ModelBox(gun12_r2, 0, 135, -0.5F, -0.5F, -4.5F, 1, 1, 9, 0.0F, false));

		gun13_r5 = new ModelRenderer(this);
		gun13_r5.setRotationPoint(0.7939F, -32.1635F, 2.4918F);
		gun.addChild(gun13_r5);
		setRotationAngle(gun13_r5, 0.1872F, 0.1841F, -0.7681F);
		gun13_r5.cubeList.add(new ModelBox(gun13_r5, 50, 96, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun12_r3 = new ModelRenderer(this);
		gun12_r3.setRotationPoint(-0.6206F, -32.7241F, 0.0253F);
		gun.addChild(gun12_r3);
		setRotationAngle(gun12_r3, 0.3876F, -0.3614F, 0.7137F);
		gun12_r3.cubeList.add(new ModelBox(gun12_r3, 0, 91, -2.501F, -0.5F, -2.0F, 5, 1, 3, 0.0F, false));

		gun3_r2 = new ModelRenderer(this);
		gun3_r2.setRotationPoint(-0.2598F, -21.9813F, -5.1074F);
		gun.addChild(gun3_r2);
		setRotationAngle(gun3_r2, 0.411F, 0.8296F, 0.3111F);
		gun3_r2.cubeList.add(new ModelBox(gun3_r2, 20, 71, 0.0F, -9.5F, -0.5F, 1, 15, 1, 0.0F, false));

		gun3_r3 = new ModelRenderer(this);
		gun3_r3.setRotationPoint(0.3041F, -23.8388F, -5.8908F);
		gun.addChild(gun3_r3);
		setRotationAngle(gun3_r3, 0.2944F, 0.3774F, 0.1113F);
		gun3_r3.cubeList.add(new ModelBox(gun3_r3, 71, 136, -0.5001F, -7.5F, 0.0F, 1, 15, 1, 0.0F, false));
		gun3_r3.cubeList.add(new ModelBox(gun3_r3, 24, 71, -0.5F, -7.5F, 0.25F, 1, 15, 1, 0.001F, false));

		gun3_r4 = new ModelRenderer(this);
		gun3_r4.setRotationPoint(-0.75F, -24.3463F, -2.476F);
		gun.addChild(gun3_r4);
		setRotationAngle(gun3_r4, 0.2732F, 0.0F, 0.0F);
		gun3_r4.cubeList.add(new ModelBox(gun3_r4, 0, 24, 1.0F, -8.0F, -2.5F, 1, 15, 4, 0.0F, false));
		gun3_r4.cubeList.add(new ModelBox(gun3_r4, 0, 0, -2.5F, -8.0F, -2.5F, 1, 15, 4, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(-2.3447F, -30.1747F, 0.1942F);
		gun.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.7132F, 0.3751F, -0.3069F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 25, 36, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun6_r3 = new ModelRenderer(this);
		gun6_r3.setRotationPoint(-2.4054F, -28.3463F, -0.6185F);
		gun.addChild(gun6_r3);
		setRotationAngle(gun6_r3, 0.0F, 0.3927F, 0.0F);
		gun6_r3.cubeList.add(new ModelBox(gun6_r3, 0, 44, -0.5F, -2.0F, -1.0F, 1, 4, 1, 0.0F, false));

		gun6_r4 = new ModelRenderer(this);
		gun6_r4.setRotationPoint(-1.8632F, -22.037F, 0.6972F);
		gun.addChild(gun6_r4);
		setRotationAngle(gun6_r4, -1.0294F, 0.3411F, 0.1985F);
		gun6_r4.cubeList.add(new ModelBox(gun6_r4, 93, 128, -1.5F, -1.0F, -5.5F, 1, 1, 9, 0.0F, false));

		gun3_r5 = new ModelRenderer(this);
		gun3_r5.setRotationPoint(-1.0F, -21.8228F, -5.673F);
		gun.addChild(gun3_r5);
		setRotationAngle(gun3_r5, 0.2732F, 0.0F, 0.0F);
		gun3_r5.cubeList.add(new ModelBox(gun3_r5, 10, 0, -1.0F, -9.5F, -0.5F, 2, 15, 1, 0.0F, false));

		gun12_r4 = new ModelRenderer(this);
		gun12_r4.setRotationPoint(-0.6726F, -29.7929F, -4.0F);
		gun.addChild(gun12_r4);
		setRotationAngle(gun12_r4, 0.0F, 0.0F, 0.7854F);
		gun12_r4.cubeList.add(new ModelBox(gun12_r4, 60, 16, -2.5F, -1.5F, -3.0F, 1, 3, 6, 0.0F, false));

		gun14_r6 = new ModelRenderer(this);
		gun14_r6.setRotationPoint(-2.384F, -31.192F, -8.3325F);
		gun.addChild(gun14_r6);
		setRotationAngle(gun14_r6, -0.281F, -0.4478F, -0.9828F);
		gun14_r6.cubeList.add(new ModelBox(gun14_r6, 94, 72, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

		gun13_r6 = new ModelRenderer(this);
		gun13_r6.setRotationPoint(-2.383F, -31.7563F, -9.5541F);
		gun.addChild(gun13_r6);
		setRotationAngle(gun13_r6, -0.2042F, -0.3378F, -1.0123F);
		gun13_r6.cubeList.add(new ModelBox(gun13_r6, 44, 13, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun13_r7 = new ModelRenderer(this);
		gun13_r7.setRotationPoint(-2.8107F, -32.153F, -11.5F);
		gun.addChild(gun13_r7);
		setRotationAngle(gun13_r7, 0.0F, 0.0F, -1.0036F);
		gun13_r7.cubeList.add(new ModelBox(gun13_r7, 104, 129, -0.5F, -0.5F, -4.5F, 1, 1, 9, 0.0F, false));

		gun14_r7 = new ModelRenderer(this);
		gun14_r7.setRotationPoint(-2.7939F, -32.1635F, 2.4918F);
		gun.addChild(gun14_r7);
		setRotationAngle(gun14_r7, 0.1872F, -0.1841F, 0.7681F);
		gun14_r7.cubeList.add(new ModelBox(gun14_r7, 15, 44, -0.5F, -0.5F, -1.5F, 1, 1, 3, 0.0F, false));

		gun13_r8 = new ModelRenderer(this);
		gun13_r8.setRotationPoint(-1.3794F, -32.7241F, 0.0253F);
		gun.addChild(gun13_r8);
		setRotationAngle(gun13_r8, 0.3876F, 0.3614F, -0.7137F);
		gun13_r8.cubeList.add(new ModelBox(gun13_r8, 34, 44, -2.499F, -0.5F, -2.0F, 5, 1, 3, 0.0F, false));

		gun4_r3 = new ModelRenderer(this);
		gun4_r3.setRotationPoint(-1.7402F, -21.9813F, -5.1074F);
		gun.addChild(gun4_r3);
		setRotationAngle(gun4_r3, 0.411F, -0.8296F, -0.3111F);
		gun4_r3.cubeList.add(new ModelBox(gun4_r3, 38, 136, -1.0F, -9.5F, -0.5F, 1, 15, 1, 0.0F, false));

		gun4_r4 = new ModelRenderer(this);
		gun4_r4.setRotationPoint(-2.3041F, -23.8388F, -5.8908F);
		gun.addChild(gun4_r4);
		setRotationAngle(gun4_r4, 0.2944F, -0.3774F, -0.1113F);
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 42, 136, -0.4999F, -7.5F, 0.0F, 1, 15, 1, 0.0F, false));
		gun4_r4.cubeList.add(new ModelBox(gun4_r4, 67, 136, -0.5F, -7.5F, 0.25F, 1, 15, 1, 0.001F, false));

		gun12_r5 = new ModelRenderer(this);
		gun12_r5.setRotationPoint(-0.999F, -33.049F, -8.4151F);
		gun.addChild(gun12_r5);
		setRotationAngle(gun12_r5, -0.5236F, 0.0F, 0.0F);
		gun12_r5.cubeList.add(new ModelBox(gun12_r5, 63, 89, -2.501F, -0.5F, -0.5F, 5, 2, 3, 0.0F, false));

		gun11_r4 = new ModelRenderer(this);
		gun11_r4.setRotationPoint(-0.999F, -33.3722F, -9.426F);
		gun.addChild(gun11_r4);
		setRotationAngle(gun11_r4, -0.3927F, 0.0F, 0.0F);
		gun11_r4.cubeList.add(new ModelBox(gun11_r4, 102, 32, -2.502F, 0.475F, -0.5F, 5, 1, 2, 0.0F, false));

		gun13_r9 = new ModelRenderer(this);
		gun13_r9.setRotationPoint(-1.0F, -32.366F, 0.2321F);
		gun.addChild(gun13_r9);
		setRotationAngle(gun13_r9, 0.5236F, 0.0F, 0.0F);
		gun13_r9.cubeList.add(new ModelBox(gun13_r9, 12, 65, -2.5F, -1.0F, -2.0F, 5, 2, 4, 0.0F, false));

		gun12_r6 = new ModelRenderer(this);
		gun12_r6.setRotationPoint(-0.999F, -33.0F, 1.75F);
		gun.addChild(gun12_r6);
		setRotationAngle(gun12_r6, 0.2618F, 0.0F, 0.0F);
		gun12_r6.cubeList.add(new ModelBox(gun12_r6, 85, 43, -2.5F, 0.0F, -1.0F, 5, 1, 3, -0.003F, false));

		gun13_r10 = new ModelRenderer(this);
		gun13_r10.setRotationPoint(0.499F, -33.0F, 4.25F);
		gun.addChild(gun13_r10);
		setRotationAngle(gun13_r10, -0.3927F, 0.0F, 0.0F);
		gun13_r10.cubeList.add(new ModelBox(gun13_r10, 99, 29, -4.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
		gun13_r10.cubeList.add(new ModelBox(gun13_r10, 100, 66, -0.998F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		gun33_r1 = new ModelRenderer(this);
		gun33_r1.setRotationPoint(-0.999F, -32.8467F, -20.9412F);
		gun.addChild(gun33_r1);
		setRotationAngle(gun33_r1, -0.0873F, 0.0F, 0.0F);
		gun33_r1.cubeList.add(new ModelBox(gun33_r1, 104, 117, -2.0F, -0.5F, -4.5F, 4, 1, 10, 0.0F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(-1.0F, -31.914F, -20.7218F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, 1.9785F, 0.0F, 0.0F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 93, 19, -1.003F, -1.5F, -2.0F, 2, 2, 4, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(-1.0F, -29.3215F, -20.4192F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 1.9785F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 98, 43, -1.002F, -0.75F, -1.5F, 2, 1, 2, 0.0F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(-1.0F, -32.06F, -16.6935F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, 1.8039F, 0.0F, 0.0F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 94, 66, -1.0F, -3.5F, -0.7F, 2, 4, 2, 0.0F, false));

		gun41_r2 = new ModelRenderer(this);
		gun41_r2.setRotationPoint(-1.0F, -29.1903F, -20.1687F);
		gun.addChild(gun41_r2);
		setRotationAngle(gun41_r2, 0.8876F, 0.0F, 0.0F);
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 80, 6, -1.001F, -0.75F, -0.5F, 2, 1, 3, -0.003F, false));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(-1.0F, -29.1903F, -20.1687F);
		gun.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 1.673F, 0.0F, 0.0F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 15, 100, -1.001F, -0.5F, -1.5F, 2, 1, 2, 0.0F, false));

		gun62_r1 = new ModelRenderer(this);
		gun62_r1.setRotationPoint(-1.001F, -31.8827F, -14.8203F);
		gun.addChild(gun62_r1);
		setRotationAngle(gun62_r1, -0.2618F, 0.0F, 0.0F);
		gun62_r1.cubeList.add(new ModelBox(gun62_r1, 60, 96, -0.5F, 0.0F, -1.5F, 1, 1, 3, -0.001F, false));

		gun63_r1 = new ModelRenderer(this);
		gun63_r1.setRotationPoint(-1.001F, -30.7736F, -12.7294F);
		gun.addChild(gun63_r1);
		setRotationAngle(gun63_r1, -0.7854F, 0.0F, 0.0F);
		gun63_r1.cubeList.add(new ModelBox(gun63_r1, 76, 16, -0.5F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

		gun62_r2 = new ModelRenderer(this);
		gun62_r2.setRotationPoint(-1.001F, -27.0673F, -12.5703F);
		gun.addChild(gun62_r2);
		setRotationAngle(gun62_r2, 0.7854F, 0.0F, 0.0F);
		gun62_r2.cubeList.add(new ModelBox(gun62_r2, 44, 0, -0.5F, -1.225F, -1.0F, 1, 2, 2, 0.0F, false));

		gun61_r1 = new ModelRenderer(this);
		gun61_r1.setRotationPoint(-1.001F, -26.6003F, -14.9497F);
		gun.addChild(gun61_r1);
		setRotationAngle(gun61_r1, 0.2618F, 0.0F, 0.0F);
		gun61_r1.cubeList.add(new ModelBox(gun61_r1, 70, 96, -0.5F, -0.5F, -1.5F, 1, 1, 3, -0.001F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-1.5F, -37.5F, -18.0F);
		gun.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 25, 24, -0.5F, 0.0F, -11.0F, 2, 2, 10, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.1359F, -37.7531F, -3.25F);
		gun.addChild(bone5);
		

		gun18_r4 = new ModelRenderer(this);
		gun18_r4.setRotationPoint(0.9388F, 0.6766F, -8.0F);
		bone5.addChild(gun18_r4);
		setRotationAngle(gun18_r4, 0.0F, 0.0F, -0.3927F);
		gun18_r4.cubeList.add(new ModelBox(gun18_r4, 76, 20, -0.5F, -0.5F, -0.5001F, 2, 1, 1, 0.0F, false));
		gun18_r4.cubeList.add(new ModelBox(gun18_r4, 93, 6, -0.5F, -0.5F, -5.5001F, 2, 1, 1, 0.0F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(0.4829F, 1.3595F, -8.0F);
		bone5.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 0.0F, 0.0F, -1.2654F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 68, 36, -1.15F, -0.475F, -0.5F, 2, 1, 1, 0.0F, false));
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 76, 27, -1.15F, -0.475F, -5.5F, 2, 1, 1, 0.0F, false));

		gun21_r2 = new ModelRenderer(this);
		gun21_r2.setRotationPoint(0.9671F, 1.0656F, -10.5F);
		bone5.addChild(gun21_r2);
		setRotationAngle(gun21_r2, 0.0F, 0.0F, 0.7418F);
		gun21_r2.cubeList.add(new ModelBox(gun21_r2, 39, 24, -0.5F, -1.0F, -2.0F, 1, 2, 4, 0.0F, false));
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