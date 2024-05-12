package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000Scope extends ModelWithAttachments {
	private final ModelRenderer bone3;
	private final ModelRenderer scope;
	private final ModelRenderer cube_r1;
	private final ModelRenderer scope12_r1_r1;
	private final ModelRenderer scope16_r1_r1;
	private final ModelRenderer scope20_r1_r1;
	private final ModelRenderer scope23_r1_r1;
	private final ModelRenderer scope23_r1_r2;
	private final ModelRenderer scope23_r1_r3;
	private final ModelRenderer scope23_r1_r4;
	private final ModelRenderer scope23_r1_r5;
	private final ModelRenderer scope23_r1_r6;
	private final ModelRenderer scope23_r1_r7;
	private final ModelRenderer scope32_r1_r1;
	private final ModelRenderer scope33_r1_r1;
	private final ModelRenderer scope38_r1_r1;
	private final ModelRenderer scope49_r1_r1;
	private final ModelRenderer scope50_r1_r1;
	private final ModelRenderer scope54_r1_r1;
	private final ModelRenderer scope56_r1_r1;
	private final ModelRenderer scope60_r1_r1;
	private final ModelRenderer scope62_r1_r1;
	private final ModelRenderer scope64_r1_r1;
	private final ModelRenderer scope66_r1_r1;
	private final ModelRenderer scope67_r1_r1;
	private final ModelRenderer scope68_r1_r1;
	private final ModelRenderer scope69_r1_r1;
	private final ModelRenderer scope69_r1_r2;
	private final ModelRenderer scope69_r1_r3;
	private final ModelRenderer scope69_r1_r4;

	public F2000Scope() {
		textureWidth = 290;
		textureHeight = 290;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		scope = new ModelRenderer(this);
		scope.setRotationPoint(-0.0391F, -34.6067F, -5.2241F);
		bone3.addChild(scope);
		scope.cubeList.add(new ModelBox(scope, 128, 75, 0.7391F, -3.8933F, -23.2759F, 1, 1, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 142, 82, 0.7391F, -6.3933F, 0.2241F, 1, 1, 9, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 142, 72, -1.6609F, -6.3933F, 0.2241F, 1, 1, 9, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 68, 143, -0.6609F, -9.3933F, -18.7759F, 1, 1, 27, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 15, 83, -0.9609F, -4.3933F, -23.2759F, 2, 1, 1, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 72, 32, -1.2609F, -5.5933F, -21.2759F, 2, 3, 27, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 68, 171, 0.6391F, -8.3933F, -16.7759F, 1, 3, 25, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 72, 72, 0.3391F, -5.5933F, -21.2759F, 1, 3, 27, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 60, 128, 0.2391F, -10.1933F, 6.1241F, 1, 1, 2, -0.2F, false));
		scope.cubeList.add(new ModelBox(scope, 122, 42, 0.2391F, -10.1933F, 6.5241F, 1, 1, 2, -0.201F, false));
		scope.cubeList.add(new ModelBox(scope, 11, 119, -1.1609F, -10.1933F, 6.1241F, 1, 1, 2, -0.2F, false));
		scope.cubeList.add(new ModelBox(scope, 121, 62, -1.1609F, -10.1933F, 6.5241F, 1, 1, 2, -0.2F, false));
		scope.cubeList.add(new ModelBox(scope, 113, 62, -0.8609F, -10.1933F, 6.1241F, 1, 1, 2, -0.2F, false));
		scope.cubeList.add(new ModelBox(scope, 116, 55, -0.8609F, -10.1933F, 6.5241F, 1, 1, 2, -0.2F, false));
		scope.cubeList.add(new ModelBox(scope, 110, 38, -0.0609F, -10.1933F, 6.1241F, 1, 1, 2, -0.2F, false));
		scope.cubeList.add(new ModelBox(scope, 111, 0, -0.0609F, -10.1933F, 6.5241F, 1, 1, 2, -0.201F, false));
		scope.cubeList.add(new ModelBox(scope, 128, 56, -1.7609F, -8.9933F, 6.3241F, 1, 1, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 54, 128, 0.8391F, -8.9933F, 6.3241F, 1, 1, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 128, 42, -1.6609F, -3.8933F, -23.2759F, 1, 1, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 128, 23, -1.0609F, -10.3933F, -18.2759F, 1, 1, 2, -0.1F, false));
		scope.cubeList.add(new ModelBox(scope, 110, 6, 0.1391F, -10.3933F, -18.4759F, 1, 1, 2, -0.1F, false));
		scope.cubeList.add(new ModelBox(scope, 110, 23, 0.1391F, -10.3933F, -18.2759F, 1, 1, 2, -0.101F, false));
		scope.cubeList.add(new ModelBox(scope, 110, 32, -1.0609F, -10.3933F, -18.4759F, 1, 1, 2, -0.1F, false));
		scope.cubeList.add(new ModelBox(scope, 86, 13, 0.8391F, -9.5933F, -18.3759F, 1, 2, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 142, 100, -0.2609F, -9.4933F, -18.7759F, 1, 1, 27, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 108, 55, -0.4609F, -9.8683F, -18.7509F, 1, 1, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 150, 30, -0.4609F, -9.8683F, -17.3759F, 1, 1, 1, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 112, 130, 0.8391F, -9.5933F, -18.9759F, 1, 2, 1, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 108, 130, -1.7609F, -9.5933F, -18.9759F, 1, 2, 1, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 40, 76, -1.7609F, -9.5933F, -18.3759F, 1, 2, 2, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 0, 167, -1.5609F, -8.3933F, -16.7759F, 1, 3, 25, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 72, 82, -1.5609F, -8.3933F, -19.7759F, 1, 4, 3, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 23, 80, 0.6391F, -8.3933F, -19.7759F, 1, 4, 3, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 80, 124, 0.6391F, -5.3933F, -16.7759F, 1, 1, 3, 0.0F, false));
		scope.cubeList.add(new ModelBox(scope, 72, 124, -1.5609F, -5.3933F, -16.7759F, 1, 1, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.1391F, 12.2067F, 24.9241F);
		scope.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 35, -1.27F, -23.4F, -0.9F, 1, 1, 1, -0.2F, false));

		scope12_r1_r1 = new ModelRenderer(this);
		scope12_r1_r1.setRotationPoint(0.0391F, 37.8883F, 31.5331F);
		scope.addChild(scope12_r1_r1);
		setRotationAngle(scope12_r1_r1, 0.8551F, 0.0F, 0.0F);
		scope12_r1_r1.cubeList.add(new ModelBox(scope12_r1_r1, 58, 27, -1.0F, -69.1039F, -4.055F, 2, 1, 2, 0.0F, false));

		scope16_r1_r1 = new ModelRenderer(this);
		scope16_r1_r1.setRotationPoint(0.0391F, 38.4073F, 31.0819F);
		scope.addChild(scope16_r1_r1);
		setRotationAngle(scope16_r1_r1, 0.8551F, 0.0F, 0.0F);
		scope16_r1_r1.cubeList.add(new ModelBox(scope16_r1_r1, 86, 38, 0.6F, -68.3493F, -3.7111F, 1, 1, 5, 0.0F, false));
		scope16_r1_r1.cubeList.add(new ModelBox(scope16_r1_r1, 86, 32, -1.6F, -68.3493F, -3.7111F, 1, 1, 5, 0.0F, false));

		scope20_r1_r1 = new ModelRenderer(this);
		scope20_r1_r1.setRotationPoint(-18.4675F, 50.6461F, 5.2241F);
		scope.addChild(scope20_r1_r1);
		setRotationAngle(scope20_r1_r1, 0.0F, 0.0F, 0.8378F);
		scope20_r1_r1.cubeList.add(new ModelBox(scope20_r1_r1, 192, 182, -31.417F, -54.4447F, -22.0F, 1, 1, 25, 0.0F, false));
		scope20_r1_r1.cubeList.add(new ModelBox(scope20_r1_r1, 183, 0, -31.767F, -54.4461F, -22.0F, 1, 1, 25, 0.0F, false));

		scope23_r1_r1 = new ModelRenderer(this);
		scope23_r1_r1.setRotationPoint(-1.7609F, -8.97F, 8.1625F);
		scope.addChild(scope23_r1_r1);
		setRotationAngle(scope23_r1_r1, -1.364F, 0.2281F, -0.8227F);
		scope23_r1_r1.cubeList.add(new ModelBox(scope23_r1_r1, 150, 22, 0.0926F, -0.4849F, 0.1101F, 1, 1, 1, -0.001F, false));
		scope23_r1_r1.cubeList.add(new ModelBox(scope23_r1_r1, 21, 150, -0.1074F, -0.4849F, 0.1101F, 1, 1, 1, -0.001F, false));

		scope23_r1_r2 = new ModelRenderer(this);
		scope23_r1_r2.setRotationPoint(1.8391F, -8.97F, 8.1625F);
		scope.addChild(scope23_r1_r2);
		setRotationAngle(scope23_r1_r2, -1.364F, -0.2281F, 0.8227F);
		scope23_r1_r2.cubeList.add(new ModelBox(scope23_r1_r2, 150, 24, -1.0926F, -0.4849F, 0.1101F, 1, 1, 1, -0.002F, false));
		scope23_r1_r2.cubeList.add(new ModelBox(scope23_r1_r2, 150, 26, -0.8926F, -0.4849F, 0.1101F, 1, 1, 1, -0.002F, false));

		scope23_r1_r3 = new ModelRenderer(this);
		scope23_r1_r3.setRotationPoint(-0.4609F, -8.92F, 8.1625F);
		scope.addChild(scope23_r1_r3);
		setRotationAngle(scope23_r1_r3, -1.3505F, -0.2151F, 0.7615F);
		scope23_r1_r3.cubeList.add(new ModelBox(scope23_r1_r3, 150, 56, 0.7F, -0.5F, -1.3F, 1, 1, 1, 0.0F, false));

		scope23_r1_r4 = new ModelRenderer(this);
		scope23_r1_r4.setRotationPoint(0.0391F, 34.1159F, -45.0171F);
		scope.addChild(scope23_r1_r4);
		setRotationAngle(scope23_r1_r4, -1.2641F, 0.0F, 0.0F);
		scope23_r1_r4.cubeList.add(new ModelBox(scope23_r1_r4, 59, 49, -1.0F, -64.191F, -25.4722F, 2, 1, 1, 0.0F, false));
		scope23_r1_r4.cubeList.add(new ModelBox(scope23_r1_r4, 21, 78, -1.0F, -64.191F, -25.7722F, 2, 1, 1, 0.0F, false));
		scope23_r1_r4.cubeList.add(new ModelBox(scope23_r1_r4, 0, 124, 0.8F, -64.191F, -24.8722F, 1, 1, 3, 0.0F, false));
		scope23_r1_r4.cubeList.add(new ModelBox(scope23_r1_r4, 36, 60, -0.975F, -64.191F, -22.8722F, 2, 1, 1, 0.0F, false));
		scope23_r1_r4.cubeList.add(new ModelBox(scope23_r1_r4, 123, 8, -1.8F, -64.191F, -24.8722F, 1, 1, 3, -0.001F, false));

		scope23_r1_r5 = new ModelRenderer(this);
		scope23_r1_r5.setRotationPoint(-0.8751F, -6.7254F, 8.8479F);
		scope.addChild(scope23_r1_r5);
		setRotationAngle(scope23_r1_r5, -1.3505F, -0.2151F, 0.7615F);
		scope23_r1_r5.cubeList.add(new ModelBox(scope23_r1_r5, 48, 150, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		scope23_r1_r6 = new ModelRenderer(this);
		scope23_r1_r6.setRotationPoint(-0.4609F, -6.995F, 8.7625F);
		scope.addChild(scope23_r1_r6);
		setRotationAngle(scope23_r1_r6, -1.3505F, -0.2151F, 0.7615F);
		scope23_r1_r6.cubeList.add(new ModelBox(scope23_r1_r6, 150, 34, 0.7F, -0.5F, -1.3F, 1, 1, 1, 0.0F, false));

		scope23_r1_r7 = new ModelRenderer(this);
		scope23_r1_r7.setRotationPoint(-0.8751F, -8.6504F, 8.2479F);
		scope.addChild(scope23_r1_r7);
		setRotationAngle(scope23_r1_r7, -1.3505F, -0.2151F, 0.7615F);
		scope23_r1_r7.cubeList.add(new ModelBox(scope23_r1_r7, 150, 58, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		scope32_r1_r1 = new ModelRenderer(this);
		scope32_r1_r1.setRotationPoint(0.0391F, 34.6696F, 5.2438F);
		scope.addChild(scope32_r1_r1);
		setRotationAngle(scope32_r1_r1, 0.0436F, 0.0F, 0.0F);
		scope32_r1_r1.cubeList.add(new ModelBox(scope32_r1_r1, 72, 45, -1.7F, -41.2186F, -14.1354F, 1, 1, 11, 0.0F, false));
		scope32_r1_r1.cubeList.add(new ModelBox(scope32_r1_r1, 36, 32, -1.3F, -41.2186F, -14.1354F, 3, 1, 11, 0.0F, false));

		scope33_r1_r1 = new ModelRenderer(this);
		scope33_r1_r1.setRotationPoint(0.0391F, 35.3138F, 5.8947F);
		scope.addChild(scope33_r1_r1);
		setRotationAngle(scope33_r1_r1, 0.16F, 0.0F, 0.0F);
		scope33_r1_r1.cubeList.add(new ModelBox(scope33_r1_r1, 36, 0, -1.7F, -43.3546F, -22.5502F, 1, 1, 13, 0.0F, false));
		scope33_r1_r1.cubeList.add(new ModelBox(scope33_r1_r1, 144, 16, -1.3F, -43.3546F, -22.5502F, 3, 1, 13, 0.0F, false));

		scope38_r1_r1 = new ModelRenderer(this);
		scope38_r1_r1.setRotationPoint(0.0391F, 34.2977F, -44.6666F);
		scope.addChild(scope38_r1_r1);
		setRotationAngle(scope38_r1_r1, -1.2641F, 0.0F, 0.0F);
		scope38_r1_r1.cubeList.add(new ModelBox(scope38_r1_r1, 8, 60, -1.5F, -63.6608F, -22.0211F, 3, 1, 1, -0.002F, false));
		scope38_r1_r1.cubeList.add(new ModelBox(scope38_r1_r1, 72, 79, -1.7F, -63.6608F, -22.5211F, 2, 1, 1, -0.001F, false));
		scope38_r1_r1.cubeList.add(new ModelBox(scope38_r1_r1, 78, 57, -0.3F, -63.6608F, -22.5211F, 2, 1, 1, 0.0F, false));

		scope49_r1_r1 = new ModelRenderer(this);
		scope49_r1_r1.setRotationPoint(0.0391F, 52.4213F, 1.0331F);
		scope.addChild(scope49_r1_r1);
		setRotationAngle(scope49_r1_r1, -0.7064F, 0.0F, 0.0F);
		scope49_r1_r1.cubeList.add(new ModelBox(scope49_r1_r1, 14, 47, -1.6F, -31.558F, -53.6254F, 1, 3, 1, -0.001F, false));
		scope49_r1_r1.cubeList.add(new ModelBox(scope49_r1_r1, 7, 47, 0.6F, -31.558F, -53.6254F, 1, 3, 1, -0.001F, false));

		scope50_r1_r1 = new ModelRenderer(this);
		scope50_r1_r1.setRotationPoint(0.0391F, 38.6315F, 5.6722F);
		scope.addChild(scope50_r1_r1);
		setRotationAngle(scope50_r1_r1, 0.3346F, 0.0F, 0.0F);
		scope50_r1_r1.cubeList.add(new ModelBox(scope50_r1_r1, 85, 124, -1.8F, -43.8249F, 15.9272F, 1, 1, 2, 0.0F, false));
		scope50_r1_r1.cubeList.add(new ModelBox(scope50_r1_r1, 77, 124, 0.8F, -43.8249F, 15.9272F, 1, 1, 2, 0.0F, false));

		scope54_r1_r1 = new ModelRenderer(this);
		scope54_r1_r1.setRotationPoint(0.0391F, 58.4212F, 28.1461F);
		scope.addChild(scope54_r1_r1);
		setRotationAngle(scope54_r1_r1, 1.0038F, 0.0F, 0.0F);
		scope54_r1_r1.cubeList.add(new ModelBox(scope54_r1_r1, 85, 151, 0.8F, -52.8419F, 44.2039F, 1, 1, 1, -0.001F, false));
		scope54_r1_r1.cubeList.add(new ModelBox(scope54_r1_r1, 41, 151, -1.8F, -52.8419F, 44.2039F, 1, 1, 1, -0.001F, false));
		scope54_r1_r1.cubeList.add(new ModelBox(scope54_r1_r1, 18, 151, -1.8F, -51.9419F, 43.7039F, 1, 1, 1, 0.0F, false));
		scope54_r1_r1.cubeList.add(new ModelBox(scope54_r1_r1, 104, 130, -1.8F, -53.3419F, 43.7039F, 1, 2, 1, 0.0F, false));
		scope54_r1_r1.cubeList.add(new ModelBox(scope54_r1_r1, 14, 151, 0.8F, -51.9419F, 43.7039F, 1, 1, 1, -0.001F, false));
		scope54_r1_r1.cubeList.add(new ModelBox(scope54_r1_r1, 100, 130, 0.8F, -53.3419F, 43.7039F, 1, 2, 1, 0.0F, false));

		scope56_r1_r1 = new ModelRenderer(this);
		scope56_r1_r1.setRotationPoint(0.0391F, -44.6668F, -110.3172F);
		scope.addChild(scope56_r1_r1);
		setRotationAngle(scope56_r1_r1, -2.5653F, 0.0F, 0.0F);
		scope56_r1_r1.cubeList.add(new ModelBox(scope56_r1_r1, 108, 112, -1.8F, -82.2758F, -58.5675F, 1, 2, 3, -0.001F, false));
		scope56_r1_r1.cubeList.add(new ModelBox(scope56_r1_r1, 91, 102, 0.75F, -82.2758F, -58.5675F, 1, 2, 3, 0.0F, false));

		scope60_r1_r1 = new ModelRenderer(this);
		scope60_r1_r1.setRotationPoint(0.0391F, -77.4762F, -91.8272F);
		scope.addChild(scope60_r1_r1);
		setRotationAngle(scope60_r1_r1, -2.8999F, 0.0F, 0.0F);
		scope60_r1_r1.cubeList.add(new ModelBox(scope60_r1_r1, 89, 125, 0.8F, -86.2623F, -53.899F, 1, 1, 2, -0.001F, false));
		scope60_r1_r1.cubeList.add(new ModelBox(scope60_r1_r1, 16, 125, -1.8F, -86.2623F, -53.899F, 1, 1, 2, 0.0F, false));
		scope60_r1_r1.cubeList.add(new ModelBox(scope60_r1_r1, 124, 62, -1.8F, -86.9623F, -53.699F, 1, 1, 3, 0.0F, false));
		scope60_r1_r1.cubeList.add(new ModelBox(scope60_r1_r1, 8, 124, 0.8F, -86.9623F, -53.699F, 1, 1, 3, -0.001F, false));

		scope62_r1_r1 = new ModelRenderer(this);
		scope62_r1_r1.setRotationPoint(-22.0899F, 51.5728F, 5.2241F);
		scope.addChild(scope62_r1_r1);
		setRotationAngle(scope62_r1_r1, 0.0F, 0.0F, 0.8901F);
		scope62_r1_r1.cubeList.add(new ModelBox(scope62_r1_r1, 93, 126, -32.9899F, -56.72F, 1.1F, 1, 1, 2, 0.0F, false));
		scope62_r1_r1.cubeList.add(new ModelBox(scope62_r1_r1, 20, 126, -33.2899F, -56.72F, 1.1F, 1, 1, 2, 0.0F, false));

		scope64_r1_r1 = new ModelRenderer(this);
		scope64_r1_r1.setRotationPoint(22.1681F, 51.5728F, 5.2241F);
		scope.addChild(scope64_r1_r1);
		setRotationAngle(scope64_r1_r1, 0.0F, 0.0F, -0.8901F);
		scope64_r1_r1.cubeList.add(new ModelBox(scope64_r1_r1, 128, 0, 31.9899F, -56.72F, 1.1F, 1, 1, 2, 0.0F, false));
		scope64_r1_r1.cubeList.add(new ModelBox(scope64_r1_r1, 127, 72, 32.2899F, -56.72F, 1.1F, 1, 1, 2, 0.0F, false));

		scope66_r1_r1 = new ModelRenderer(this);
		scope66_r1_r1.setRotationPoint(18.5457F, 50.646F, 5.2241F);
		scope.addChild(scope66_r1_r1);
		setRotationAngle(scope66_r1_r1, 0.0F, 0.0F, -0.8378F);
		scope66_r1_r1.cubeList.add(new ModelBox(scope66_r1_r1, 109, 203, 30.4669F, -54.4461F, -22.0F, 1, 1, 25, 0.0F, false));
		scope66_r1_r1.cubeList.add(new ModelBox(scope66_r1_r1, 200, 26, 30.7669F, -54.4467F, -22.0F, 1, 1, 25, 0.0F, false));

		scope67_r1_r1 = new ModelRenderer(this);
		scope67_r1_r1.setRotationPoint(-19.179F, 52.2277F, 5.2241F);
		scope.addChild(scope67_r1_r1);
		setRotationAngle(scope67_r1_r1, 0.0F, 0.0F, 0.8551F);
		scope67_r1_r1.cubeList.add(new ModelBox(scope67_r1_r1, 105, 62, -35.2273F, -54.7208F, -23.6F, 1, 1, 2, 0.0F, false));
		scope67_r1_r1.cubeList.add(new ModelBox(scope67_r1_r1, 128, 4, -35.2273F, -54.7708F, -23.6F, 1, 1, 2, 0.0F, false));

		scope68_r1_r1 = new ModelRenderer(this);
		scope68_r1_r1.setRotationPoint(19.2571F, 52.2277F, 5.2241F);
		scope.addChild(scope68_r1_r1);
		setRotationAngle(scope68_r1_r1, 0.0F, 0.0F, -0.8551F);
		scope68_r1_r1.cubeList.add(new ModelBox(scope68_r1_r1, 83, 105, 34.2272F, -54.6957F, -23.6F, 1, 1, 2, 0.0F, false));
		scope68_r1_r1.cubeList.add(new ModelBox(scope68_r1_r1, 128, 8, 34.2272F, -54.7707F, -23.6F, 1, 1, 2, 0.0F, false));

		scope69_r1_r1 = new ModelRenderer(this);
		scope69_r1_r1.setRotationPoint(0.0391F, 40.1443F, 31.3943F);
		scope.addChild(scope69_r1_r1);
		setRotationAngle(scope69_r1_r1, 0.8551F, 0.0F, 0.0F);
		scope69_r1_r1.cubeList.add(new ModelBox(scope69_r1_r1, 36, 63, -1.0F, -70.6597F, -1.3299F, 2, 1, 2, 0.0F, false));

		scope69_r1_r2 = new ModelRenderer(this);
		scope69_r1_r2.setRotationPoint(0.0391F, 39.5693F, 31.8943F);
		scope.addChild(scope69_r1_r2);
		setRotationAngle(scope69_r1_r2, 0.8551F, 0.0F, 0.0F);
		scope69_r1_r2.cubeList.add(new ModelBox(scope69_r1_r2, 87, 72, -1.8F, -70.6597F, -1.3299F, 1, 1, 5, -0.001F, false));
		scope69_r1_r2.cubeList.add(new ModelBox(scope69_r1_r2, 16, 60, -1.0F, -70.6597F, 3.0701F, 2, 1, 1, 0.0F, false));
		scope69_r1_r2.cubeList.add(new ModelBox(scope69_r1_r2, 89, 151, -1.1F, -70.7597F, 3.7701F, 1, 1, 1, -0.1F, false));
		scope69_r1_r2.cubeList.add(new ModelBox(scope69_r1_r2, 86, 82, 0.8F, -70.6597F, -1.3299F, 1, 1, 5, 0.0F, false));
		scope69_r1_r2.cubeList.add(new ModelBox(scope69_r1_r2, 150, 32, 0.1F, -70.7597F, 3.7701F, 1, 1, 1, -0.1F, false));

		scope69_r1_r3 = new ModelRenderer(this);
		scope69_r1_r3.setRotationPoint(-0.4609F, -8.2827F, -19.4707F);
		scope.addChild(scope69_r1_r3);
		setRotationAngle(scope69_r1_r3, 1.0196F, -0.4825F, -0.6465F);
		scope69_r1_r3.cubeList.add(new ModelBox(scope69_r1_r3, 150, 60, -2.6F, -0.5F, -2.0F, 1, 1, 1, 0.0F, false));
		scope69_r1_r3.cubeList.add(new ModelBox(scope69_r1_r3, 60, 150, -1.3F, -0.5F, -3.3F, 1, 1, 1, 0.0F, false));

		scope69_r1_r4 = new ModelRenderer(this);
		scope69_r1_r4.setRotationPoint(-0.4609F, -8.8577F, -18.9707F);
		scope.addChild(scope69_r1_r4);
		setRotationAngle(scope69_r1_r4, 1.0196F, -0.4825F, -0.6465F);
		scope69_r1_r4.cubeList.add(new ModelBox(scope69_r1_r4, 150, 64, -0.8F, -0.5F, -0.2F, 1, 1, 1, 0.0F, false));
		scope69_r1_r4.cubeList.add(new ModelBox(scope69_r1_r4, 150, 66, 0.5F, -0.5F, -1.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
