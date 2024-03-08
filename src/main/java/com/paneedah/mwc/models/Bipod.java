package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Bipod extends ModelWithAttachments {
	private final ModelRenderer bipode;
	private final ModelRenderer gun34AND35_r1;
	private final ModelRenderer gun34AND35_r2;
	private final ModelRenderer gun34AND35_r3;
	private final ModelRenderer gun34AND35_r4;
	private final ModelRenderer gun34AND35_r5;
	private final ModelRenderer gun34AND35_r6;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun37_r2;
	private final ModelRenderer gun37_r3;
	private final ModelRenderer gun37_r4;
	private final ModelRenderer gun37_r5;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun1_r1;
	private final ModelRenderer leg1;
	private final ModelRenderer gun34AND35_r7;
	private final ModelRenderer gun34AND35_r8;
	private final ModelRenderer gun34AND35_r9;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun43_r1;
	private final ModelRenderer gun53AND2_r1;
	private final ModelRenderer gun43_r2;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer leg2;
	private final ModelRenderer gun34AND35_r10;
	private final ModelRenderer gun34AND35_r11;
	private final ModelRenderer gun34AND35_r12;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun43_r3;
	private final ModelRenderer gun43_r4;
	private final ModelRenderer gun53AND2_r2;
	private final ModelRenderer gun25_r2;

	public Bipod() {
		textureWidth = 50;
		textureHeight = 50;

		bipode = new ModelRenderer(this);
		bipode.setRotationPoint(-3.1328F, -4.1398F, 1.5218F);
		bipode.cubeList.add(new ModelBox(bipode, 16, 0, 2.1328F, -3.3602F, -5.5218F, 4, 1, 5, 0.0F, false));
		bipode.cubeList.add(new ModelBox(bipode, 16, 10, 1.0328F, -2.7602F, -1.3218F, 6, 4, 1, -0.2F, false));
		bipode.cubeList.add(new ModelBox(bipode, 40, 3, 2.6328F, -2.8602F, -4.0218F, 3, 2, 2, 0.0F, false));
		bipode.cubeList.add(new ModelBox(bipode, 16, 6, 1.1328F, -1.9602F, -4.5218F, 6, 1, 3, 0.0F, false));
		bipode.cubeList.add(new ModelBox(bipode, 35, 27, 3.1328F, -2.6802F, -6.9518F, 2, 2, 1, 0.0F, false));
		bipode.cubeList.add(new ModelBox(bipode, 7, 23, 3.1328F, -0.2802F, -4.2518F, 2, 1, 3, 0.0F, false));

		gun34AND35_r1 = new ModelRenderer(this);
		gun34AND35_r1.setRotationPoint(0.207F, -1.9246F, -2.8218F);
		bipode.addChild(gun34AND35_r1);
		setRotationAngle(gun34AND35_r1, 0.0F, 0.829F, -1.0472F);
		gun34AND35_r1.cubeList.add(new ModelBox(gun34AND35_r1, 44, 16, -0.3F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));

		gun34AND35_r2 = new ModelRenderer(this);
		gun34AND35_r2.setRotationPoint(-0.5F, -0.3F, -3.5F);
		bipode.addChild(gun34AND35_r2);
		setRotationAngle(gun34AND35_r2, 0.0F, -0.9163F, -1.0472F);
		gun34AND35_r2.cubeList.add(new ModelBox(gun34AND35_r2, 20, 44, -0.5F, -0.5F, -0.2F, 1, 1, 1, 0.0F, false));
		gun34AND35_r2.cubeList.add(new ModelBox(gun34AND35_r2, 44, 25, -0.5F, -0.5F, -0.9F, 1, 1, 1, 0.0F, false));

		gun34AND35_r3 = new ModelRenderer(this);
		gun34AND35_r3.setRotationPoint(28.7966F, 12.1567F, 4.9782F);
		bipode.addChild(gun34AND35_r3);
		setRotationAngle(gun34AND35_r3, 0.0F, 0.0F, -1.0472F);
		gun34AND35_r3.cubeList.add(new ModelBox(gun34AND35_r3, 42, 42, -4.8F, -32.1F, -8.4F, 2, 1, 2, 0.0F, false));
		gun34AND35_r3.cubeList.add(new ModelBox(gun34AND35_r3, 39, 16, -0.3F, -32.1F, -9.4F, 1, 3, 3, -0.02F, false));
		gun34AND35_r3.cubeList.add(new ModelBox(gun34AND35_r3, 41, 7, -0.5F, -32.1F, -9.4F, 1, 1, 3, 0.0F, false));
		gun34AND35_r3.cubeList.add(new ModelBox(gun34AND35_r3, 32, 23, -3.5F, -32.1F, -9.4F, 3, 1, 3, 0.0F, false));

		gun34AND35_r4 = new ModelRenderer(this);
		gun34AND35_r4.setRotationPoint(-20.531F, 12.1567F, 4.9782F);
		bipode.addChild(gun34AND35_r4);
		setRotationAngle(gun34AND35_r4, 0.0F, 0.0F, 1.0472F);
		gun34AND35_r4.cubeList.add(new ModelBox(gun34AND35_r4, 6, 29, 0.5F, -32.1F, -9.4F, 3, 1, 3, 0.0F, false));
		gun34AND35_r4.cubeList.add(new ModelBox(gun34AND35_r4, 15, 29, 2.8F, -32.1F, -8.4F, 2, 1, 2, 0.0F, false));
		gun34AND35_r4.cubeList.add(new ModelBox(gun34AND35_r4, 19, 40, -0.5F, -32.1F, -9.4F, 1, 1, 3, 0.0F, false));
		gun34AND35_r4.cubeList.add(new ModelBox(gun34AND35_r4, 34, 13, -0.7F, -32.1F, -9.4F, 1, 3, 3, -0.02F, false));

		gun34AND35_r5 = new ModelRenderer(this);
		gun34AND35_r5.setRotationPoint(8.7656F, -0.3F, -3.5F);
		bipode.addChild(gun34AND35_r5);
		setRotationAngle(gun34AND35_r5, 0.0F, 0.9163F, 1.0472F);
		gun34AND35_r5.cubeList.add(new ModelBox(gun34AND35_r5, 19, 26, -0.5F, -0.5F, -0.9F, 1, 1, 1, 0.0F, false));
		gun34AND35_r5.cubeList.add(new ModelBox(gun34AND35_r5, 0, 26, -0.5F, -0.5F, -0.2F, 1, 1, 1, 0.0F, false));

		gun34AND35_r6 = new ModelRenderer(this);
		gun34AND35_r6.setRotationPoint(8.0586F, -1.9246F, -2.8218F);
		bipode.addChild(gun34AND35_r6);
		setRotationAngle(gun34AND35_r6, 0.0F, -0.829F, 1.0472F);
		gun34AND35_r6.cubeList.add(new ModelBox(gun34AND35_r6, 6, 0, -0.7F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(4.1328F, -2.7079F, -5.9151F);
		bipode.addChild(gun37_r1);
		setRotationAngle(gun37_r1, -1.0471F, 0.0031F, 0.0002F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 14, 41, -1.0F, -0.7F, -0.5F, 2, 1, 1, 0.0F, false));
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 42, 34, -1.0F, -0.1F, -0.5F, 2, 1, 1, 0.0F, false));

		gun37_r2 = new ModelRenderer(this);
		gun37_r2.setRotationPoint(4.1685F, 2.4594F, -4.9732F);
		bipode.addChild(gun37_r2);
		setRotationAngle(gun37_r2, -0.6276F, 0.7674F, -0.4666F);
		gun37_r2.cubeList.add(new ModelBox(gun37_r2, 41, 22, -1.0F, -0.9F, -1.0F, 2, 1, 2, -0.04F, false));

		gun37_r3 = new ModelRenderer(this);
		gun37_r3.setRotationPoint(4.1328F, 1.4198F, -10.7518F);
		bipode.addChild(gun37_r3);
		setRotationAngle(gun37_r3, -0.4363F, 0.0F, 0.0F);
		gun37_r3.cubeList.add(new ModelBox(gun37_r3, 0, 23, -0.5F, -3.9F, 5.1F, 1, 2, 1, 0.0F, false));

		gun37_r4 = new ModelRenderer(this);
		gun37_r4.setRotationPoint(4.1328F, -0.9802F, -6.4518F);
		bipode.addChild(gun37_r4);
		setRotationAngle(gun37_r4, -0.48F, 0.0F, 0.0F);
		gun37_r4.cubeList.add(new ModelBox(gun37_r4, 38, 27, -1.0F, -0.5F, -0.3F, 2, 1, 3, 0.0F, false));

		gun37_r5 = new ModelRenderer(this);
		gun37_r5.setRotationPoint(4.6328F, -1.1802F, -9.4518F);
		bipode.addChild(gun37_r5);
		setRotationAngle(gun37_r5, 0.0F, 0.0F, -0.7854F);
		gun37_r5.cubeList.add(new ModelBox(gun37_r5, 0, 31, -0.5F, -1.2F, 2.3F, 1, 1, 1, 0.0F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(26.3192F, 16.861F, -1.5218F);
		bipode.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, -0.8727F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 0, 23, -0.734F, -31.8428F, -4.0F, 1, 1, 5, 0.0F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 19, 27, -0.734F, -32.3428F, -4.0F, 1, 1, 5, 0.0F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-19.3391F, 15.3288F, -1.5218F);
		bipode.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0F, 0.0F, 0.8727F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 12, 23, 1.734F, -31.8428F, -4.0F, 1, 1, 5, 0.0F, false));
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 25, 10, 1.734F, -32.3428F, -4.0F, 1, 1, 5, 0.0F, false));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(4.0328F, -1.0602F, 0.1782F);
		bipode.addChild(gun1_r1);
		setRotationAngle(gun1_r1, 0.0F, 0.0F, 0.7854F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 20, 33, -0.5F, -0.5F, -1.4F, 1, 1, 1, -0.05F, false));

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(23.7132F, 24.9327F, 8.4782F);
		bipode.addChild(leg1);
		leg1.cubeList.add(new ModelBox(leg1, 0, 29, -22.7778F, -27.8438F, -10.3F, 1, 3, 4, -0.2F, false));

		gun34AND35_r7 = new ModelRenderer(this);
		gun34AND35_r7.setRotationPoint(-23.2778F, -26.7438F, -8.0F);
		leg1.addChild(gun34AND35_r7);
		setRotationAngle(gun34AND35_r7, -0.2268F, 0.0079F, 0.2522F);
		gun34AND35_r7.cubeList.add(new ModelBox(gun34AND35_r7, 10, 33, -0.5F, 0.5F, -0.6F, 1, 11, 1, 0.1F, false));

		gun34AND35_r8 = new ModelRenderer(this);
		gun34AND35_r8.setRotationPoint(-23.2778F, -26.7438F, -8.0F);
		leg1.addChild(gun34AND35_r8);
		setRotationAngle(gun34AND35_r8, -0.192F, 0.0F, 0.2182F);
		gun34AND35_r8.cubeList.add(new ModelBox(gun34AND35_r8, 44, 11, -0.5F, -0.2F, -0.6F, 1, 1, 1, -0.03F, false));

		gun34AND35_r9 = new ModelRenderer(this);
		gun34AND35_r9.setRotationPoint(-23.2778F, -26.7438F, -8.0F);
		leg1.addChild(gun34AND35_r9);
		setRotationAngle(gun34AND35_r9, 0.0F, 0.0F, 0.2182F);
		gun34AND35_r9.cubeList.add(new ModelBox(gun34AND35_r9, 24, 40, -0.8F, -0.9F, -0.5F, 2, 1, 1, -0.1F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-28.9955F, -5.7309F, -11.5F);
		leg1.addChild(gun25_r1);
		setRotationAngle(gun25_r1, -0.7854F, 0.0F, -1.2217F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 32, 13, -1.6F, -0.5619F, -0.5F, 1, 1, 1, 0.1F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 6, 43, -1.0F, -1.1619F, -1.0F, 1, 2, 2, 0.3F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 39, 36, -0.7F, -1.5619F, -1.5F, 1, 3, 3, 0.2F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 22, 19, -0.4F, -2.0219F, -1.95F, 1, 4, 4, -0.05F, false));

		gun43_r1 = new ModelRenderer(this);
		gun43_r1.setRotationPoint(-25.2166F, -16.0093F, -11.5313F);
		leg1.addChild(gun43_r1);
		setRotationAngle(gun43_r1, 0.0F, -0.7854F, 0.3491F);
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 29, 0, -1.5F, 8.7F, -1.4F, 3, 2, 3, 0.15F, false));
		gun43_r1.cubeList.add(new ModelBox(gun43_r1, 0, 36, -1.0F, 4.5F, -0.9F, 2, 5, 2, 0.2F, false));

		gun53AND2_r1 = new ModelRenderer(this);
		gun53AND2_r1.setRotationPoint(-25.4594F, -14.5425F, -11.3416F);
		leg1.addChild(gun53AND2_r1);
		setRotationAngle(gun53AND2_r1, 0.2182F, 0.0F, 0.3491F);
		gun53AND2_r1.cubeList.add(new ModelBox(gun53AND2_r1, 32, 9, -1.9F, -1.4F, -1.4F, 3, 1, 3, -0.05F, false));

		gun43_r2 = new ModelRenderer(this);
		gun43_r2.setRotationPoint(-25.0166F, -16.4093F, -11.5313F);
		leg1.addChild(gun43_r2);
		setRotationAngle(gun43_r2, 0.0F, -0.7854F, 0.3491F);
		gun43_r2.cubeList.add(new ModelBox(gun43_r2, 14, 33, -1.0F, -10.5F, -0.9F, 2, 5, 2, 0.0F, false));
		gun43_r2.cubeList.add(new ModelBox(gun43_r2, 8, 0, -1.0F, -10.6F, -0.9F, 2, 21, 2, -0.14F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(0.0F, 0.0F, -10.0F);
		leg1.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0F, 0.0F, -1.2217F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 16, 15, 1.1F, -30.1557F, -3.6F, 1, 2, 1, 0.0F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 40, 31, -2.0883F, -30.1557F, -3.8F, 3, 2, 1, -0.15F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 14, 43, -1.5883F, -30.6557F, -3.8F, 2, 3, 1, -0.15F, false));
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 38, 0, -1.8883F, -30.1557F, -3.0F, 4, 2, 1, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-15.4476F, 24.9327F, 8.4782F);
		bipode.addChild(leg2);
		leg2.cubeList.add(new ModelBox(leg2, 28, 16, 21.7778F, -27.8438F, -10.3F, 1, 3, 4, -0.2F, false));

		gun34AND35_r10 = new ModelRenderer(this);
		gun34AND35_r10.setRotationPoint(23.2778F, -26.7438F, -8.0F);
		leg2.addChild(gun34AND35_r10);
		setRotationAngle(gun34AND35_r10, -0.2267F, -0.0098F, -0.2607F);
		gun34AND35_r10.cubeList.add(new ModelBox(gun34AND35_r10, 30, 32, -0.5F, 0.5F, -0.6F, 1, 11, 1, 0.1F, false));

		gun34AND35_r11 = new ModelRenderer(this);
		gun34AND35_r11.setRotationPoint(23.2778F, -26.7438F, -8.0F);
		leg2.addChild(gun34AND35_r11);
		setRotationAngle(gun34AND35_r11, 0.0F, 0.0F, -0.2182F);
		gun34AND35_r11.cubeList.add(new ModelBox(gun34AND35_r11, 14, 0, -1.2F, -0.9F, -0.5F, 2, 1, 1, -0.1F, false));

		gun34AND35_r12 = new ModelRenderer(this);
		gun34AND35_r12.setRotationPoint(23.2778F, -26.7438F, -8.0F);
		leg2.addChild(gun34AND35_r12);
		setRotationAngle(gun34AND35_r12, -0.192F, 0.0F, -0.2182F);
		gun34AND35_r12.cubeList.add(new ModelBox(gun34AND35_r12, 6, 36, -0.5F, -0.2F, -0.6F, 1, 1, 1, -0.05F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(8.5272F, -15.0349F, -10.0F);
		leg2.addChild(gun17_r1);
		setRotationAngle(gun17_r1, 0.0F, 0.0F, 1.2217F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 0, 43, 11.1F, -17.5F, -3.7F, 2, 3, 1, -0.15F, false));
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 39, 13, 10.6F, -17.0F, -3.7F, 3, 2, 1, -0.15F, false));
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 22, 16, 9.1F, -17.0F, -3.0F, 4, 2, 1, 0.0F, false));
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 16, 2, 9.1F, -17.0F, -3.6F, 1, 2, 1, 0.0F, false));

		gun43_r3 = new ModelRenderer(this);
		gun43_r3.setRotationPoint(25.1166F, -16.4093F, -11.5313F);
		leg2.addChild(gun43_r3);
		setRotationAngle(gun43_r3, 0.0F, 0.7854F, -0.3491F);
		gun43_r3.cubeList.add(new ModelBox(gun43_r3, 0, 0, -1.0F, -10.6F, -0.9F, 2, 21, 2, -0.14F, false));
		gun43_r3.cubeList.add(new ModelBox(gun43_r3, 22, 33, -1.0F, -10.5F, -0.9F, 2, 5, 2, 0.0F, false));

		gun43_r4 = new ModelRenderer(this);
		gun43_r4.setRotationPoint(25.3166F, -16.0093F, -11.5313F);
		leg2.addChild(gun43_r4);
		setRotationAngle(gun43_r4, 0.0F, 0.7854F, -0.3491F);
		gun43_r4.cubeList.add(new ModelBox(gun43_r4, 34, 32, -1.0F, 4.5F, -0.9F, 2, 5, 2, 0.2F, false));
		gun43_r4.cubeList.add(new ModelBox(gun43_r4, 26, 27, -1.5F, 8.7F, -1.4F, 3, 2, 3, 0.15F, false));

		gun53AND2_r2 = new ModelRenderer(this);
		gun53AND2_r2.setRotationPoint(25.5594F, -14.5425F, -11.3416F);
		leg2.addChild(gun53AND2_r2);
		setRotationAngle(gun53AND2_r2, 0.2182F, 0.0F, -0.3491F);
		gun53AND2_r2.cubeList.add(new ModelBox(gun53AND2_r2, 31, 5, -1.1F, -1.4F, -1.4F, 3, 1, 3, -0.05F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(29.0955F, -5.7309F, -11.5F);
		leg2.addChild(gun25_r2);
		setRotationAngle(gun25_r2, -0.7854F, 0.0F, 1.2217F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 16, 15, -0.6F, -2.0219F, -1.95F, 1, 4, 4, -0.05F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 34, 39, -0.3F, -1.5619F, -1.5F, 1, 3, 3, 0.2F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 25, 42, 0.0F, -1.1619F, -1.0F, 1, 2, 2, 0.3F, false));
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 0, 29, 0.6F, -0.5619F, -0.5F, 1, 1, 1, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipode.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}