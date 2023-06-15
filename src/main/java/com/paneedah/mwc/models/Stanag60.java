package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Stanag60 extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer mag52_r1;
	private final ModelRenderer mag51_r1;
	private final ModelRenderer mag47_r1;
	private final ModelRenderer mag46_r1;
	private final ModelRenderer mag34_r1;
	private final ModelRenderer mag33_r1;
	private final ModelRenderer mag31_r1;
	private final ModelRenderer mag30_r1;
	private final ModelRenderer mag29_r1;
	private final ModelRenderer mag28_r1;
	private final ModelRenderer mag27_r1;
	private final ModelRenderer mag26_r1;
	private final ModelRenderer mag25_r1;
	private final ModelRenderer mag24_r1;
	private final ModelRenderer mag13_r1;
	private final ModelRenderer mag12_r1;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag10_r1;
	private final ModelRenderer mag9_r1;
	private final ModelRenderer mag8_r1;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag1_r1;

	public Stanag60() {
		textureWidth = 70;
		textureHeight = 70;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(14.7424F, 17.087F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 13, 13, -20.7424F, -15.587F, -20.5F, 3, 3, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 13, 3, -17.7424F, -18.587F, -20.5F, 3, 3, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 40, 3, -17.9424F, -19.587F, -19.7F, 1, 2, 6, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 35, -15.5424F, -19.587F, -19.7F, 1, 2, 6, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -16.0424F, -19.587F, -21.2F, 1, 2, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 59, -17.4424F, -19.587F, -21.2F, 2, 2, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 27, 53, -20.2424F, -15.587F, -23.2F, 2, 3, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 51, 31, -17.7424F, -18.087F, -23.2F, 3, 2, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 10, -17.7424F, -12.587F, -20.5F, 3, 3, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -14.7424F, -15.587F, -20.5F, 3, 3, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 18, 58, -17.7424F, -15.587F, -14.8F, 3, 3, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 39, 11, -17.7424F, -12.087F, -23.2F, 3, 2, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 17, 52, -14.2424F, -15.587F, -23.2F, 2, 3, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 42, 18, -18.2424F, -16.087F, -23.0F, 4, 4, 3, 0.0F, false));

		mag52_r1 = new ModelRenderer(this);
		mag52_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag52_r1);
		setRotationAngle(mag52_r1, 0.0F, 0.0F, -0.632F);
		mag52_r1.cubeList.add(new ModelBox(mag52_r1, 40, 27, -4.2F, -26.0F, -19.5F, 1, 1, 6, 0.0F, false));

		mag51_r1 = new ModelRenderer(this);
		mag51_r1.setRotationPoint(-30.0642F, 1.7724F, 0.0F);
		mag.addChild(mag51_r1);
		setRotationAngle(mag51_r1, 0.0F, 0.0F, 0.632F);
		mag51_r1.cubeList.add(new ModelBox(mag51_r1, 8, 41, 0.2F, -26.0F, -19.5F, 1, 1, 6, 0.0F, false));

		mag47_r1 = new ModelRenderer(this);
		mag47_r1.setRotationPoint(3.7282F, 0.5049F, 0.0F);
		mag.addChild(mag47_r1);
		setRotationAngle(mag47_r1, 0.0F, 0.0F, -0.7854F);
		mag47_r1.cubeList.add(new ModelBox(mag47_r1, 8, 34, -8.5F, -25.5F, -23.2F, 2, 2, 2, 0.0F, false));
		mag47_r1.cubeList.add(new ModelBox(mag47_r1, 56, 0, -1.1F, -25.5F, -23.2F, 2, 2, 2, 0.0F, false));
		mag47_r1.cubeList.add(new ModelBox(mag47_r1, 8, 48, -0.7F, -25.5F, -21.5F, 2, 2, 4, 0.0F, false));
		mag47_r1.cubeList.add(new ModelBox(mag47_r1, 48, 25, -8.9F, -25.5F, -21.5F, 2, 2, 4, 0.0F, false));
		mag47_r1.cubeList.add(new ModelBox(mag47_r1, 44, 42, -9.3F, -25.5F, -18.3F, 2, 2, 5, 0.0F, false));
		mag47_r1.cubeList.add(new ModelBox(mag47_r1, 17, 45, -0.3F, -25.5F, -18.3F, 2, 2, 5, 0.0F, false));

		mag46_r1 = new ModelRenderer(this);
		mag46_r1.setRotationPoint(2.0072F, -4.2498F, 0.0F);
		mag.addChild(mag46_r1);
		setRotationAngle(mag46_r1, 0.0F, 0.0F, -0.7854F);
		mag46_r1.cubeList.add(new ModelBox(mag46_r1, 53, 43, -6.9F, -24.6F, -23.2F, 2, 2, 2, 0.0F, false));
		mag46_r1.cubeList.add(new ModelBox(mag46_r1, 20, 32, -6.9F, -17.2F, -23.2F, 2, 2, 2, -0.01F, false));
		mag46_r1.cubeList.add(new ModelBox(mag46_r1, 48, 0, -6.9F, -16.8F, -21.5F, 2, 2, 4, 0.0F, false));
		mag46_r1.cubeList.add(new ModelBox(mag46_r1, 34, 49, -6.9F, -25.0F, -21.5F, 2, 2, 4, 0.0F, false));
		mag46_r1.cubeList.add(new ModelBox(mag46_r1, 46, 11, -6.9F, -16.4F, -18.3F, 2, 2, 5, 0.0F, false));
		mag46_r1.cubeList.add(new ModelBox(mag46_r1, 42, 34, -6.9F, -25.4F, -18.3F, 2, 2, 5, 0.0F, false));

		mag34_r1 = new ModelRenderer(this);
		mag34_r1.setRotationPoint(-14.7424F, 2.2143F, 5.8074F);
		mag.addChild(mag34_r1);
		setRotationAngle(mag34_r1, 0.1859F, 0.0F, 0.0F);
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 37, 55, -2.5F, -32.5F, -16.2F, 2, 7, 1, 0.0F, false));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 0, 49, -3.0F, -33.5F, -20.9F, 3, 9, 1, -0.01F, false));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 46, 49, -2.5F, -33.5F, -22.3F, 2, 8, 2, 0.0F, false));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 0, 20, -3.0F, -33.5F, -20.5F, 3, 9, 5, 0.0F, false));

		mag33_r1 = new ModelRenderer(this);
		mag33_r1.setRotationPoint(-14.7424F, -3.6721F, -39.3481F);
		mag.addChild(mag33_r1);
		setRotationAngle(mag33_r1, -1.45F, 0.0F, 0.0F);
		mag33_r1.cubeList.add(new ModelBox(mag33_r1, 13, 0, -3.0F, -27.5F, -13.7F, 3, 1, 2, 0.0F, false));

		mag31_r1 = new ModelRenderer(this);
		mag31_r1.setRotationPoint(-0.8461F, -6.5491F, 0.0F);
		mag.addChild(mag31_r1);
		setRotationAngle(mag31_r1, 0.0F, 0.0F, -1.1897F);
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 53, 38, -3.0F, -19.0F, -23.2F, 2, 2, 3, 0.0F, false));

		mag30_r1 = new ModelRenderer(this);
		mag30_r1.setRotationPoint(-39.8332F, -6.0042F, 0.0F);
		mag.addChild(mag30_r1);
		setRotationAngle(mag30_r1, 0.0F, 0.0F, 1.1897F);
		mag30_r1.cubeList.add(new ModelBox(mag30_r1, 54, 6, -3.0F, -25.0F, -23.2F, 2, 2, 3, 0.0F, false));

		mag29_r1 = new ModelRenderer(this);
		mag29_r1.setRotationPoint(-36.298F, -0.2291F, 0.0F);
		mag.addChild(mag29_r1);
		setRotationAngle(mag29_r1, 0.0F, 0.0F, 1.1897F);
		mag29_r1.cubeList.add(new ModelBox(mag29_r1, 54, 49, -5.5F, -21.5F, -23.2F, 2, 2, 3, -0.01F, false));

		mag28_r1 = new ModelRenderer(this);
		mag28_r1.setRotationPoint(2.6892F, -12.3242F, 0.0F);
		mag.addChild(mag28_r1);
		setRotationAngle(mag28_r1, 0.0F, 0.0F, -1.1897F);
		mag28_r1.cubeList.add(new ModelBox(mag28_r1, 54, 54, -5.5F, -22.5F, -23.2F, 2, 2, 3, -0.01F, false));

		mag27_r1 = new ModelRenderer(this);
		mag27_r1.setRotationPoint(-30.5229F, -3.7643F, 0.0F);
		mag.addChild(mag27_r1);
		setRotationAngle(mag27_r1, 0.0F, 0.0F, 1.1897F);
		mag27_r1.cubeList.add(new ModelBox(mag27_r1, 8, 55, -2.0F, -19.0F, -23.2F, 2, 2, 3, 0.0F, false));

		mag26_r1 = new ModelRenderer(this);
		mag26_r1.setRotationPoint(4.929F, -3.0139F, 0.0F);
		mag.addChild(mag26_r1);
		setRotationAngle(mag26_r1, 0.0F, 0.0F, -1.1897F);
		mag26_r1.cubeList.add(new ModelBox(mag26_r1, 55, 11, 0.5F, -21.5F, -23.2F, 2, 2, 3, 0.0F, false));

		mag25_r1 = new ModelRenderer(this);
		mag25_r1.setRotationPoint(8.4643F, -8.789F, 0.0F);
		mag.addChild(mag25_r1);
		setRotationAngle(mag25_r1, 0.0F, 0.0F, -1.1897F);
		mag25_r1.cubeList.add(new ModelBox(mag25_r1, 56, 18, -2.0F, -25.0F, -23.2F, 2, 2, 3, -0.01F, false));

		mag24_r1 = new ModelRenderer(this);
		mag24_r1.setRotationPoint(-34.0581F, -9.5394F, 0.0F);
		mag.addChild(mag24_r1);
		setRotationAngle(mag24_r1, 0.0F, 0.0F, 1.1897F);
		mag24_r1.cubeList.add(new ModelBox(mag24_r1, 56, 23, 0.5F, -22.5F, -23.2F, 2, 2, 3, 0.0F, false));

		mag13_r1 = new ModelRenderer(this);
		mag13_r1.setRotationPoint(8.9284F, -9.103F, 0.0F);
		mag.addChild(mag13_r1);
		setRotationAngle(mag13_r1, 0.0F, 0.0F, -1.1897F);
		mag13_r1.cubeList.add(new ModelBox(mag13_r1, 16, 23, -3.0F, -25.5F, -20.5F, 3, 2, 7, 0.0F, false));

		mag12_r1 = new ModelRenderer(this);
		mag12_r1.setRotationPoint(-33.7441F, -10.0036F, 0.0F);
		mag.addChild(mag12_r1);
		setRotationAngle(mag12_r1, 0.0F, 0.0F, 1.1897F);
		mag12_r1.cubeList.add(new ModelBox(mag12_r1, 29, 27, 1.0F, -22.5F, -20.5F, 2, 2, 7, 0.0F, false));

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(-30.0587F, -3.4503F, 0.0F);
		mag.addChild(mag11_r1);
		setRotationAngle(mag11_r1, 0.0F, 0.0F, 1.1897F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 26, 0, -3.0F, -18.5F, -20.5F, 3, 2, 7, 0.0F, false));

		mag10_r1 = new ModelRenderer(this);
		mag10_r1.setRotationPoint(5.2431F, -2.5497F, 0.0F);
		mag.addChild(mag10_r1);
		setRotationAngle(mag10_r1, 0.0F, 0.0F, -1.1897F);
		mag10_r1.cubeList.add(new ModelBox(mag10_r1, 9, 32, 1.0F, -21.5F, -20.5F, 2, 2, 7, 0.0F, false));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(-1.3102F, -6.2351F, 0.0F);
		mag.addChild(mag9_r1);
		setRotationAngle(mag9_r1, 0.0F, 0.0F, -1.1897F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 26, 9, -3.0F, -18.5F, -20.5F, 3, 2, 7, 0.0F, false));

		mag8_r1 = new ModelRenderer(this);
		mag8_r1.setRotationPoint(-36.612F, 0.2351F, 0.0F);
		mag.addChild(mag8_r1);
		setRotationAngle(mag8_r1, 0.0F, 0.0F, 1.1897F);
		mag8_r1.cubeList.add(new ModelBox(mag8_r1, 20, 36, -6.0F, -21.5F, -20.5F, 2, 2, 7, 0.0F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(-40.2973F, -6.3181F, 0.0F);
		mag.addChild(mag6_r1);
		setRotationAngle(mag6_r1, 0.0F, 0.0F, 1.1897F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 29, 18, -3.0F, -25.5F, -20.5F, 3, 2, 7, 0.0F, false));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(2.3751F, -12.7883F, 0.0F);
		mag.addChild(mag5_r1);
		setRotationAngle(mag5_r1, 0.0F, 0.0F, -1.1897F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 31, 38, -6.0F, -22.5F, -20.5F, 2, 2, 7, 0.0F, false));

		mag1_r1 = new ModelRenderer(this);
		mag1_r1.setRotationPoint(-14.7424F, 2.2143F, 5.8074F);
		mag.addChild(mag1_r1);
		setRotationAngle(mag1_r1, 0.142F, -0.1203F, 0.6983F);
		mag1_r1.cubeList.add(new ModelBox(mag1_r1, 0, 43, -22.7F, -25.5F, -20.5F, 1, 1, 5, 0.0F, false));
		mag1_r1.cubeList.add(new ModelBox(mag1_r1, 26, 47, -24.0F, -24.5F, -20.5F, 1, 1, 5, 0.0F, false));
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