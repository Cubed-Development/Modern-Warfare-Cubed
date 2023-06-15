package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKDrum100 extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer mag25_r1;
	private final ModelRenderer mag17_r1;
	private final ModelRenderer mag16_r1;
	private final ModelRenderer mag15_r1;
	private final ModelRenderer mag14_r1;
	private final ModelRenderer mag13_r1;
	private final ModelRenderer mag12_r1;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag10_r1;
	private final ModelRenderer mag9_r1;
	private final ModelRenderer mag8_r1;
	private final ModelRenderer mag7_r1;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag2_r1;
	private final ModelRenderer mag1_r1;
	private final ModelRenderer mag1_r2;
	private final ModelRenderer mag1_r3;

	public AKDrum100() {
		textureWidth = 90;
		textureHeight = 90;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-2.613F, 24.0F, 0.4758F);
		mag.cubeList.add(new ModelBox(mag, 0, 17, -1.887F, -26.0F, -25.0758F, 6, 2, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 51, -0.887F, -25.4F, -25.1758F, 4, 4, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 48, 39, -7.387F, -18.9F, -25.1758F, 4, 4, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 27, 5.613F, -18.9F, -25.1958F, 4, 4, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 20, 19, -0.887F, -12.4F, -25.1958F, 4, 4, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -3.887F, -21.4F, -25.5768F, 10, 9, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 32, 31, -2.387F, -21.9F, -25.4758F, 7, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 20, 17, -2.387F, -12.9F, -25.4758F, 7, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 4, 17, -4.387F, -19.9F, -25.4758F, 1, 6, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 17, 5.613F, -19.9F, -25.4758F, 1, 6, 1, 0.0F, false));

		mag25_r1 = new ModelRenderer(this);
		mag25_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag25_r1);
		setRotationAngle(mag25_r1, 0.0F, -0.1487F, 0.0F);
		mag25_r1.cubeList.add(new ModelBox(mag25_r1, 0, 0, -4.5F, -19.3F, -17.3F, 3, 5, 1, 0.0F, false));

		mag17_r1 = new ModelRenderer(this);
		mag17_r1.setRotationPoint(-5.5472F, -5.6996F, -0.4758F);
		mag.addChild(mag17_r1);
		setRotationAngle(mag17_r1, 0.0F, 0.0F, 0.7854F);
		mag17_r1.cubeList.add(new ModelBox(mag17_r1, 52, 4, 2.8F, -13.7F, -24.7F, 3, 2, 8, 0.0F, false));

		mag16_r1 = new ModelRenderer(this);
		mag16_r1.setRotationPoint(-13.0567F, -9.97F, -0.4758F);
		mag.addChild(mag16_r1);
		setRotationAngle(mag16_r1, 0.0F, 0.0F, 0.7854F);
		mag16_r1.cubeList.add(new ModelBox(mag16_r1, 30, 59, 4.2F, -23.9F, -24.7F, 2, 3, 8, 0.0F, false));

		mag15_r1 = new ModelRenderer(this);
		mag15_r1.setRotationPoint(-8.4761F, 1.3714F, -0.4758F);
		mag.addChild(mag15_r1);
		setRotationAngle(mag15_r1, 0.0F, 0.0F, 0.7854F);
		mag15_r1.cubeList.add(new ModelBox(mag15_r1, 0, 63, -7.2F, -13.7F, -24.7F, 2, 3, 8, 0.0F, false));

		mag14_r1 = new ModelRenderer(this);
		mag14_r1.setRotationPoint(-16.3957F, -1.909F, -0.4758F);
		mag.addChild(mag14_r1);
		setRotationAngle(mag14_r1, 0.0F, 0.0F, 0.7854F);
		mag14_r1.cubeList.add(new ModelBox(mag14_r1, 16, 55, -7.2F, -23.9F, -24.7F, 3, 2, 8, 0.0F, false));

		mag13_r1 = new ModelRenderer(this);
		mag13_r1.setRotationPoint(-10.5347F, -18.3686F, -0.4758F);
		mag.addChild(mag13_r1);
		setRotationAngle(mag13_r1, 0.0F, 0.0F, 1.1897F);
		mag13_r1.cubeList.add(new ModelBox(mag13_r1, 16, 31, 3.0F, -18.9F, -24.7F, 4, 4, 8, 0.0F, false));

		mag12_r1 = new ModelRenderer(this);
		mag12_r1.setRotationPoint(20.8407F, -2.8606F, -0.4758F);
		mag.addChild(mag12_r1);
		setRotationAngle(mag12_r1, 0.0F, 0.0F, -1.1897F);
		mag12_r1.cubeList.add(new ModelBox(mag12_r1, 32, 35, 3.0F, -18.9F, -24.7F, 4, 4, 8, 0.0F, false));

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(-17.499F, -0.0758F, -0.4758F);
		mag.addChild(mag11_r1);
		setRotationAngle(mag11_r1, 0.0F, 0.0F, 1.1897F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 36, 0, -10.0F, -18.9F, -24.7F, 4, 4, 8, 0.0F, false));

		mag10_r1 = new ModelRenderer(this);
		mag10_r1.setRotationPoint(8.2121F, -8.5248F, -0.4758F);
		mag.addChild(mag10_r1);
		setRotationAngle(mag10_r1, 0.0F, 0.0F, -1.1897F);
		mag10_r1.cubeList.add(new ModelBox(mag10_r1, 36, 12, -3.5F, -12.4F, -24.7F, 4, 4, 8, 0.0F, false));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(-4.8704F, -5.74F, -0.4758F);
		mag.addChild(mag9_r1);
		setRotationAngle(mag9_r1, 0.0F, 0.0F, 1.1897F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 0, 39, -3.5F, -12.4F, -24.7F, 4, 4, 8, 0.0F, false));

		mag8_r1 = new ModelRenderer(this);
		mag8_r1.setRotationPoint(26.5049F, -15.4891F, -0.4758F);
		mag.addChild(mag8_r1);
		setRotationAngle(mag8_r1, 0.0F, 0.0F, -1.1897F);
		mag8_r1.cubeList.add(new ModelBox(mag8_r1, 16, 43, -3.5F, -25.4F, -24.7F, 4, 4, 8, 0.0F, false));

		mag7_r1 = new ModelRenderer(this);
		mag7_r1.setRotationPoint(-23.1632F, -12.7042F, -0.4758F);
		mag.addChild(mag7_r1);
		setRotationAngle(mag7_r1, 0.0F, 0.0F, 1.1897F);
		mag7_r1.cubeList.add(new ModelBox(mag7_r1, 32, 47, -3.5F, -25.4F, -24.7F, 4, 4, 8, 0.0F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(13.8764F, -21.1533F, -0.4758F);
		mag.addChild(mag6_r1);
		setRotationAngle(mag6_r1, 0.0F, 0.0F, -1.1897F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 48, 24, -10.0F, -18.9F, -24.7F, 4, 4, 8, 0.0F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(-11.7564F, -4.7093F, -0.4758F);
		mag.addChild(mag5_r1);
		setRotationAngle(mag5_r1, 0.0F, 0.0F, 0.7854F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 44, 24, -1.5F, -19.7F, -17.6F, 4, 4, 1, 0.0F, false));

		mag2_r1 = new ModelRenderer(this);
		mag2_r1.setRotationPoint(2.613F, -5.4729F, 5.0358F);
		mag.addChild(mag2_r1);
		setRotationAngle(mag2_r1, 0.1859F, 0.0F, 0.0F);
		mag2_r1.cubeList.add(new ModelBox(mag2_r1, 28, 0, -3.0F, -29.7F, -26.6F, 3, 6, 2, 0.0F, false));

		mag1_r1 = new ModelRenderer(this);
		mag1_r1.setRotationPoint(2.613F, -5.172F, 5.0079F);
		mag.addChild(mag1_r1);
		setRotationAngle(mag1_r1, 0.1573F, -0.0995F, 0.5594F);
		mag1_r1.cubeList.add(new ModelBox(mag1_r1, 60, 14, -19.0F, -24.5F, -25.0F, 1, 1, 7, 0.0F, false));

		mag1_r2 = new ModelRenderer(this);
		mag1_r2.setRotationPoint(2.613F, -5.172F, 5.0079F);
		mag.addChild(mag1_r2);
		setRotationAngle(mag1_r2, 0.1573F, 0.0995F, -0.5594F);
		mag1_r2.cubeList.add(new ModelBox(mag1_r2, 64, 22, 15.5F, -26.0F, -25.0F, 1, 1, 7, 0.0F, false));

		mag1_r3 = new ModelRenderer(this);
		mag1_r3.setRotationPoint(2.613F, -5.172F, 5.0079F);
		mag.addChild(mag1_r3);
		setRotationAngle(mag1_r3, 0.1859F, 0.0F, 0.0F);
		mag1_r3.cubeList.add(new ModelBox(mag1_r3, 49, 52, -3.5F, -30.0F, -25.0F, 4, 6, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}