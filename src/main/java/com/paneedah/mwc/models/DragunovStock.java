package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DragunovStock extends ModelWithAttachments {
	private final QRenderer gripstock;
	private final ModelRenderer grip5_r1;
	private final ModelRenderer grip4_r1;
	private final ModelRenderer grip5_r2;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip11_r1;
	private final ModelRenderer grip9_r2;
	private final ModelRenderer grip9_r3;
	private final ModelRenderer grip7_r2;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip11_r2;
	private final ModelRenderer grip9_r4;
	private final ModelRenderer grip8_r1;
	private final ModelRenderer grip13_r1;
	private final ModelRenderer grip12_r1;
	private final ModelRenderer grip11_r3;
	private final ModelRenderer grip10_r2;
	private final ModelRenderer grip10_r3;
	private final ModelRenderer grip7_r3;
	private final ModelRenderer grip9_r5;
	private final ModelRenderer grip8_r2;
	private final ModelRenderer grip9_r6;
	private final ModelRenderer grip6_r2;
	private final ModelRenderer grip9_r7;
	private final ModelRenderer grip8_r3;
	private final ModelRenderer grip3_r1;
	private final ModelRenderer grip4_r2;
	private final ModelRenderer grip3_r2;
	private final ModelRenderer grip4_r3;
	private final ModelRenderer grip2_r1;

	public DragunovStock() {
		textureWidth = 350;
		textureHeight = 350;

		gripstock = new QRenderer(this);
		gripstock.setRotationPoint(0.0F, 24.0F, 0.0F);
		gripstock.cubeList.add(new ModelBox(gripstock, 71, 0, -3.5F, -30.5F, -6.0F, 4, 4, 5, 0.001F, false));
		gripstock.cubeList.add(new ModelBox(gripstock, 92, 102, -3.0F, -35.55F, 2.2F, 3, 2, 4, -0.1F, false));
		gripstock.cubeList.add(new ModelBox(gripstock, 78, 56, -3.8F, -35.1F, 2.1F, 1, 2, 4, 0.0F, false));
		gripstock.cubeList.add(new ModelBox(gripstock, 78, 47, -0.2F, -35.1F, 2.1F, 1, 2, 4, 0.0F, false));
		gripstock.cubeList.add(new ModelBox(gripstock, 0, 47, -3.8F, -24.05F, 31.0F, 4, 5, 6, 0.0F, false));
		gripstock.cubeList.add(new ModelBox(gripstock, 44, 93, -0.2F, -24.05F, 31.0F, 1, 5, 6, -0.002F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(-0.2F, -28.75F, -3.2F);
		gripstock.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 0.2443F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 91, 44, 0.0F, -3.0F, 0.0F, 1, 3, 7, 0.0F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 91, 63, -3.6F, -3.0F, 0.0F, 1, 3, 7, 0.0F, false));

		grip4_r1 = new ModelRenderer(this);
		grip4_r1.setRotationPoint(-0.2F, -29.25F, -6.0F);
		gripstock.addChild(grip4_r1);
		setRotationAngle(grip4_r1, -0.1745F, 0.0F, 0.0F);
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 13, 15, 0.0F, -3.0F, 0.0F, 1, 3, 3, 0.001F, false));
		grip4_r1.cubeList.add(new ModelBox(grip4_r1, 38, 11, -3.6F, -3.0F, 0.0F, 1, 3, 3, 0.001F, false));

		grip5_r2 = new ModelRenderer(this);
		grip5_r2.setRotationPoint(-0.2F, -31.25F, -5.4F);
		gripstock.addChild(grip5_r2);
		setRotationAngle(grip5_r2, 0.0698F, 0.0F, 0.0F);
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 43, 143, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.002F, false));
		grip5_r2.cubeList.add(new ModelBox(grip5_r2, 27, 144, -3.6F, -1.0F, 0.0F, 1, 1, 6, 0.002F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(-2.8F, -32.05F, 40.0F);
		gripstock.addChild(grip9_r1);
		setRotationAngle(grip9_r1, -0.1571F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 93, 19, -1.0F, 13.0F, -9.1F, 1, 2, 7, 0.003F, false));
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 21, 93, 2.6F, 13.0F, -9.1F, 1, 2, 7, 0.003F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(-0.2F, -31.05F, 40.0F);
		gripstock.addChild(grip7_r1);
		setRotationAngle(grip7_r1, -0.1222F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 26, 68, 0.0F, 0.0F, -3.0F, 1, 14, 4, 0.002F, false));
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 0, 24, -3.6F, 0.0F, -3.0F, 4, 14, 4, 0.001F, false));

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(-0.2F, -32.95F, 3.1F);
		gripstock.addChild(grip6_r1);
		setRotationAngle(grip6_r1, -0.0524F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 180, 0, 0.0F, -1.0F, -1.0F, 1, 1, 39, 0.002F, false));
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 93, 38, -2.8F, -1.0F, 25.0F, 3, 2, 2, 0.001F, false));
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 22, 24, -2.8F, -1.0F, 17.0F, 3, 12, 8, 0.001F, false));
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 179, 42, -3.6F, -1.0F, -1.0F, 4, 1, 39, 0.001F, false));

		grip11_r1 = new ModelRenderer(this);
		grip11_r1.setRotationPoint(-0.2F, -31.05F, 40.0F);
		gripstock.addChild(grip11_r1);
		setRotationAngle(grip11_r1, -0.0524F, 0.0087F, 0.0F);
		grip11_r1.cubeList.add(new ModelBox(grip11_r1, 82, 68, 0.0F, 0.0F, -14.0F, 1, 11, 2, -0.001F, false));
		grip11_r1.cubeList.add(new ModelBox(grip11_r1, 58, 93, 0.0F, -0.5F, -19.9F, 1, 11, 2, -0.001F, false));

		grip9_r2 = new ModelRenderer(this);
		grip9_r2.setRotationPoint(-0.2F, -31.05F, 40.0F);
		gripstock.addChild(grip9_r2);
		setRotationAngle(grip9_r2, -0.1745F, 0.0087F, 0.0F);
		grip9_r2.cubeList.add(new ModelBox(grip9_r2, 0, 0, 0.0F, 1.1F, -18.7F, 1, 11, 7, -0.002F, false));
		grip9_r2.cubeList.add(new ModelBox(grip9_r2, 221, 0, -2.0F, 12.1F, -33.2F, 3, 2, 31, 0.0F, false));

		grip9_r3 = new ModelRenderer(this);
		grip9_r3.setRotationPoint(-0.2F, -31.05F, 40.0F);
		gripstock.addChild(grip9_r3);
		setRotationAngle(grip9_r3, -0.4712F, 0.0087F, 0.0F);
		grip9_r3.cubeList.add(new ModelBox(grip9_r3, 92, 91, 0.0F, 10.35F, -8.5F, 1, 5, 6, -0.002F, false));

		grip7_r2 = new ModelRenderer(this);
		grip7_r2.setRotationPoint(-2.8F, -31.05F, 40.0F);
		gripstock.addChild(grip7_r2);
		setRotationAngle(grip7_r2, -0.1745F, -0.0087F, 0.0F);
		grip7_r2.cubeList.add(new ModelBox(grip7_r2, 221, 82, -1.0F, 12.1F, -33.2F, 3, 2, 31, 0.001F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(-0.2F, -24.05F, 35.4F);
		gripstock.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 0.7505F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 9, 87, 0.0F, 0.0F, 0.0F, 1, 1, 2, -0.003F, false));
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 0, 18, -3.6F, 0.0F, 0.0F, 4, 1, 2, -0.001F, false));

		grip11_r2 = new ModelRenderer(this);
		grip11_r2.setRotationPoint(-0.2F, -29.05F, 37.4F);
		gripstock.addChild(grip11_r2);
		setRotationAngle(grip11_r2, 2.2515F, 0.0F, 0.0F);
		grip11_r2.cubeList.add(new ModelBox(grip11_r2, 68, 51, 0.0F, 0.0F, 0.0F, 1, 1, 3, -0.002F, false));
		grip11_r2.cubeList.add(new ModelBox(grip11_r2, 48, 39, -3.6F, 0.0F, 0.0F, 4, 1, 3, -0.001F, false));

		grip9_r4 = new ModelRenderer(this);
		grip9_r4.setRotationPoint(-3.5F, -24.05F, 31.0F);
		gripstock.addChild(grip9_r4);
		setRotationAngle(grip9_r4, 1.0996F, 0.0F, 0.0F);
		grip9_r4.cubeList.add(new ModelBox(grip9_r4, 46, 77, 1.0F, -4.0F, -5.0F, 3, 4, 5, -0.001F, false));
		grip9_r4.cubeList.add(new ModelBox(grip9_r4, 0, 78, -0.3F, 0.0F, -5.0F, 4, 2, 5, -0.001F, false));

		grip8_r1 = new ModelRenderer(this);
		grip8_r1.setRotationPoint(0.0F, -35.45F, 6.1F);
		gripstock.addChild(grip8_r1);
		setRotationAngle(grip8_r1, -0.0475F, -0.0221F, -0.4358F);
		grip8_r1.cubeList.add(new ModelBox(grip8_r1, 187, 209, -1.0F, 0.0F, 0.0F, 1, 2, 35, 0.001F, false));

		grip13_r1 = new ModelRenderer(this);
		grip13_r1.setRotationPoint(0.8F, -35.1F, 6.1F);
		gripstock.addChild(grip13_r1);
		setRotationAngle(grip13_r1, -0.3633F, 0.177F, 0.4285F);
		grip13_r1.cubeList.add(new ModelBox(grip13_r1, 79, 122, -1.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));

		grip12_r1 = new ModelRenderer(this);
		grip12_r1.setRotationPoint(-3.8F, -35.1F, 6.1F);
		gripstock.addChild(grip12_r1);
		setRotationAngle(grip12_r1, -0.3633F, -0.177F, -0.4285F);
		grip12_r1.cubeList.add(new ModelBox(grip12_r1, 120, 122, 0.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));

		grip11_r3 = new ModelRenderer(this);
		grip11_r3.setRotationPoint(-3.8F, -35.1F, 6.1F);
		gripstock.addChild(grip11_r3);
		setRotationAngle(grip11_r3, 0.0F, 0.0F, -0.3665F);
		grip11_r3.cubeList.add(new ModelBox(grip11_r3, 124, 116, 0.0F, 0.0F, -4.0F, 1, 1, 4, -0.001F, false));

		grip10_r2 = new ModelRenderer(this);
		grip10_r2.setRotationPoint(0.8F, -35.1F, 6.1F);
		gripstock.addChild(grip10_r2);
		setRotationAngle(grip10_r2, 0.0F, 0.0F, 0.3665F);
		grip10_r2.cubeList.add(new ModelBox(grip10_r2, 32, 129, -1.0F, 0.0F, -4.0F, 1, 1, 4, -0.001F, false));

		grip10_r3 = new ModelRenderer(this);
		grip10_r3.setRotationPoint(0.8F, -35.1F, 6.1F);
		gripstock.addChild(grip10_r3);
		setRotationAngle(grip10_r3, -0.4014F, 0.0F, 0.0F);
		grip10_r3.cubeList.add(new ModelBox(grip10_r3, 27, 123, -1.0F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));
		grip10_r3.cubeList.add(new ModelBox(grip10_r3, 19, 87, -1.0F, 0.4F, 0.0F, 1, 1, 2, -0.002F, false));
		grip10_r3.cubeList.add(new ModelBox(grip10_r3, 46, 87, -4.6F, 0.4F, 0.0F, 1, 1, 2, -0.002F, false));
		grip10_r3.cubeList.add(new ModelBox(grip10_r3, 124, 111, -4.6F, 0.0F, 0.0F, 1, 1, 4, -0.001F, false));

		grip7_r3 = new ModelRenderer(this);
		grip7_r3.setRotationPoint(-3.0F, -35.45F, 6.1F);
		gripstock.addChild(grip7_r3);
		setRotationAngle(grip7_r3, -0.0475F, 0.0221F, 0.4358F);
		grip7_r3.cubeList.add(new ModelBox(grip7_r3, 137, 214, 0.0F, 0.0F, 0.0F, 1, 2, 35, 0.001F, false));

		grip9_r5 = new ModelRenderer(this);
		grip9_r5.setRotationPoint(0.0F, -38.1F, 12.1F);
		gripstock.addChild(grip9_r5);
		setRotationAngle(grip9_r5, -0.0454F, -0.0262F, -0.523F);
		grip9_r5.cubeList.add(new ModelBox(grip9_r5, 136, 43, -1.0F, 0.0F, 0.0F, 1, 2, 17, 0.0F, false));

		grip8_r2 = new ModelRenderer(this);
		grip8_r2.setRotationPoint(-3.0F, -38.1F, 12.1F);
		gripstock.addChild(grip8_r2);
		setRotationAngle(grip8_r2, -0.0454F, 0.0262F, 0.523F);
		grip8_r2.cubeList.add(new ModelBox(grip8_r2, 136, 62, 0.0F, 0.0F, 0.0F, 1, 2, 17, 0.0F, false));

		grip9_r6 = new ModelRenderer(this);
		grip9_r6.setRotationPoint(-3.0F, -38.1F, 12.1F);
		gripstock.addChild(grip9_r6);
		setRotationAngle(grip9_r6, -0.0524F, 0.0F, 0.0F);
		grip9_r6.cubeList.add(new ModelBox(grip9_r6, 0, 136, 3.0F, 1.7F, 0.0F, 1, 2, 17, 0.001F, false));
		grip9_r6.cubeList.add(new ModelBox(grip9_r6, 43, 136, -1.0F, 1.7F, 0.0F, 1, 2, 17, 0.001F, false));
		grip9_r6.cubeList.add(new ModelBox(grip9_r6, 181, 130, 0.0F, 1.0F, 2.0F, 3, 2, 13, 0.001F, false));
		grip9_r6.cubeList.add(new ModelBox(grip9_r6, 48, 20, 0.0F, 0.0F, 0.0F, 3, 2, 17, 0.001F, false));

		grip6_r2 = new ModelRenderer(this);
		grip6_r2.setRotationPoint(-2.0F, -35.45F, 6.1F);
		gripstock.addChild(grip6_r2);
		setRotationAngle(grip6_r2, -0.0524F, 0.0F, 0.0F);
		grip6_r2.cubeList.add(new ModelBox(grip6_r2, 181, 172, -1.0F, 0.0F, 0.0F, 3, 2, 35, 0.001F, false));

		grip9_r7 = new ModelRenderer(this);
		grip9_r7.setRotationPoint(0.0F, -30.65F, 16.1F);
		gripstock.addChild(grip9_r7);
		setRotationAngle(grip9_r7, 0.8552F, 0.0F, 0.0F);
		grip9_r7.cubeList.add(new ModelBox(grip9_r7, 79, 109, -3.0F, -3.0F, 0.0F, 3, 3, 2, 0.0F, false));

		grip8_r3 = new ModelRenderer(this);
		grip8_r3.setRotationPoint(0.0F, -30.65F, 16.1F);
		gripstock.addChild(grip8_r3);
		setRotationAngle(grip8_r3, -0.0524F, 0.0F, 0.0F);
		grip8_r3.cubeList.add(new ModelBox(grip8_r3, 32, 87, -3.0F, -2.0F, 0.0F, 3, 2, 2, 0.001F, false));

		grip3_r1 = new ModelRenderer(this);
		grip3_r1.setRotationPoint(0.5F, -25.5F, -2.5F);
		gripstock.addChild(grip3_r1);
		setRotationAngle(grip3_r1, -0.4363F, 0.0F, 0.0F);
		grip3_r1.cubeList.add(new ModelBox(grip3_r1, 76, 39, -4.0F, -1.0F, -3.0F, 4, 1, 3, -0.001F, false));

		grip4_r2 = new ModelRenderer(this);
		grip4_r2.setRotationPoint(0.5F, -30.4F, 4.0F);
		gripstock.addChild(grip4_r2);
		setRotationAngle(grip4_r2, 0.4887F, 0.0F, 0.0F);
		grip4_r2.cubeList.add(new ModelBox(grip4_r2, 68, 81, -4.0F, 8.0F, -2.0F, 4, 2, 3, 0.0F, false));

		grip3_r2 = new ModelRenderer(this);
		grip3_r2.setRotationPoint(0.5F, -29.6F, 3.0F);
		gripstock.addChild(grip3_r2);
		setRotationAngle(grip3_r2, 0.3665F, 0.0F, 0.0F);
		grip3_r2.cubeList.add(new ModelBox(grip3_r2, 68, 68, -4.0F, 0.0F, -2.0F, 4, 10, 3, -0.001F, false));

		grip4_r3 = new ModelRenderer(this);
		grip4_r3.setRotationPoint(-3.8F, -30.0F, 3.3F);
		gripstock.addChild(grip4_r3);
		setRotationAngle(grip4_r3, 0.7854F, 0.0F, 0.0F);
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 137, 27, 0.0F, -3.0F, 0.0F, 3, 3, 4, -0.002F, false));
		grip4_r3.cubeList.add(new ModelBox(grip4_r3, 138, 132, 1.6F, -3.0F, 0.0F, 3, 3, 4, -0.001F, false));

		grip2_r1 = new ModelRenderer(this);
		grip2_r1.setRotationPoint(0.5F, -25.5F, -2.5F);
		gripstock.addChild(grip2_r1);
		setRotationAngle(grip2_r1, 0.1222F, 0.0F, 0.0F);
		grip2_r1.cubeList.add(new ModelBox(grip2_r1, 22, 47, -4.0F, -5.0F, 0.0F, 4, 12, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gripstock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
