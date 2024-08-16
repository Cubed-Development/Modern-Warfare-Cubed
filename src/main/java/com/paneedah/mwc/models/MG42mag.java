package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MG42mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer mag35_r1;
	private final ModelRenderer mag34_r1;
	private final ModelRenderer mag31_r1;
	private final ModelRenderer mag28_r1;
	private final ModelRenderer mag26_r1;
	private final ModelRenderer mag20_r1;
	private final ModelRenderer mag18_r1;
	private final ModelRenderer mag17_r1;
	private final ModelRenderer mag16_r1;
	private final ModelRenderer mag15_r1;
	private final ModelRenderer mag14_r1;
	private final ModelRenderer mag13_r1;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag10_r1;
	private final ModelRenderer mag9_r1;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r1;

	public MG42mag() {
		textureWidth = 256;
		textureHeight = 128;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(4.0467F, 24.4887F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 100, 0, 7.4533F, -35.9887F, 0.4F, 2, 2, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 100, 0, 2.9533F, -36.4887F, -10.7F, 11, 3, 12, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 100, 0, 6.9533F, -40.4887F, -10.7F, 3, 11, 12, 0.0F, true));

		mag35_r1 = new ModelRenderer(this);
		mag35_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(mag35_r1);
		setRotationAngle(mag35_r1, 0.0F, 0.0F, -0.1115F);
		mag35_r1.cubeList.add(new ModelBox(mag35_r1, 100, 0, 6.4F, -36.0F, 0.5F, 8, 2, 1, 0.0F, true));

		mag34_r1 = new ModelRenderer(this);
		mag34_r1.setRotationPoint(16.8998F, -76.6299F, 0.0F);
		mag.addChild(mag34_r1);
		setRotationAngle(mag34_r1, 0.0F, 0.0F, 2.7512F);
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 100, 0, 17.8F, -35.0F, -1.0F, 3, 2, 1, 0.0F, true));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 100, 0, 17.6F, -35.5F, 0.2F, 1, 3, 1, 0.0F, true));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 100, 0, 17.8F, -35.0F, -0.5F, 3, 2, 2, 0.0F, true));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 100, 0, 17.9F, -34.3F, -9.7F, 1, 1, 8, 0.0F, true));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 100, 0, 17.9F, -35.7F, -9.7F, 1, 1, 8, 0.0F, true));
		mag34_r1.cubeList.add(new ModelBox(mag34_r1, 100, 0, 18.0F, -36.0F, -10.7F, 4, 3, 12, 0.0F, true));

		mag31_r1 = new ModelRenderer(this);
		mag31_r1.setRotationPoint(2.3259F, -0.4887F, -28.1153F);
		mag.addChild(mag31_r1);
		setRotationAngle(mag31_r1, 0.0F, -1.5184F, 0.0F);
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 100, 0, 24.0F, -34.5F, -11.2F, 3, 1, 1, 0.0F, true));
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 100, 0, 24.0F, -35.5F, -11.0F, 3, 2, 1, 0.0F, true));
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 100, 0, 23.0F, -35.5F, -10.8F, 5, 2, 1, 0.0F, true));
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 100, 0, 19.0F, -34.2F, -10.8F, 3, 1, 1, 0.0F, true));
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 100, 0, 19.0F, -35.8F, -10.8F, 3, 1, 1, 0.0F, true));
		mag31_r1.cubeList.add(new ModelBox(mag31_r1, 100, 0, 18.0F, -36.0F, -10.7F, 12, 3, 1, 0.0F, true));

		mag28_r1 = new ModelRenderer(this);
		mag28_r1.setRotationPoint(42.1154F, -27.8763F, 0.0F);
		mag.addChild(mag28_r1);
		setRotationAngle(mag28_r1, 0.0F, 0.0F, -1.9705F);
		mag28_r1.cubeList.add(new ModelBox(mag28_r1, 100, 0, 13.9F, -28.7F, -9.7F, 1, 1, 10, 0.0F, true));
		mag28_r1.cubeList.add(new ModelBox(mag28_r1, 100, 0, 13.9F, -27.3F, -9.7F, 1, 1, 10, 0.0F, true));
		mag28_r1.cubeList.add(new ModelBox(mag28_r1, 100, 0, 14.0F, -29.0F, -10.7F, 4, 3, 12, 0.0F, true));

		mag26_r1 = new ModelRenderer(this);
		mag26_r1.setRotationPoint(-9.4419F, -62.9108F, 0.0F);
		mag.addChild(mag26_r1);
		setRotationAngle(mag26_r1, 0.0F, 0.0F, 1.9705F);
		mag26_r1.cubeList.add(new ModelBox(mag26_r1, 100, 0, 19.7F, -33.1F, -9.7F, 1, 1, 10, 0.0F, true));
		mag26_r1.cubeList.add(new ModelBox(mag26_r1, 100, 0, 18.3F, -33.1F, -9.7F, 1, 1, 10, 0.0F, true));
		mag26_r1.cubeList.add(new ModelBox(mag26_r1, 100, 0, 18.0F, -33.0F, -10.7F, 3, 3, 12, 0.0F, true));

		mag20_r1 = new ModelRenderer(this);
		mag20_r1.setRotationPoint(-18.7986F, -9.3546F, 0.0F);
		mag.addChild(mag20_r1);
		setRotationAngle(mag20_r1, 0.0F, 0.0F, 0.409F);
		mag20_r1.cubeList.add(new ModelBox(mag20_r1, 100, 0, 15.7F, -40.1F, -9.7F, 1, 1, 10, 0.0F, true));
		mag20_r1.cubeList.add(new ModelBox(mag20_r1, 100, 0, 14.2F, -40.1F, -9.7F, 1, 1, 10, 0.0F, true));
		mag20_r1.cubeList.add(new ModelBox(mag20_r1, 100, 0, 14.0F, -40.0F, -10.7F, 3, 3, 12, 0.0F, true));

		mag18_r1 = new ModelRenderer(this);
		mag18_r1.setRotationPoint(5.1927F, 0.8061F, 0.0F);
		mag.addChild(mag18_r1);
		setRotationAngle(mag18_r1, 0.0F, 0.0F, -0.2231F);
		mag18_r1.cubeList.add(new ModelBox(mag18_r1, 100, 0, 10.4F, -40.6F, -6.3F, 3, 1, 2, 0.0F, true));

		mag17_r1 = new ModelRenderer(this);
		mag17_r1.setRotationPoint(-4.0467F, -1.1042F, 2.1049F);
		mag.addChild(mag17_r1);
		setRotationAngle(mag17_r1, 0.0524F, 0.0F, 0.0F);
		mag17_r1.cubeList.add(new ModelBox(mag17_r1, 100, 0, 12.3F, -40.5F, -9.5F, 1, 1, 9, 0.0F, true));

		mag16_r1 = new ModelRenderer(this);
		mag16_r1.setRotationPoint(32.3843F, -14.4794F, 0.0F);
		mag.addChild(mag16_r1);
		setRotationAngle(mag16_r1, 0.0F, 0.0F, -1.1154F);
		mag16_r1.cubeList.add(new ModelBox(mag16_r1, 100, 0, 7.0F, -36.2F, -9.7F, 3, 1, 10, 0.0F, true));

		mag15_r1 = new ModelRenderer(this);
		mag15_r1.setRotationPoint(-4.0467F, -1.1037F, 2.0892F);
		mag.addChild(mag15_r1);
		setRotationAngle(mag15_r1, 0.0524F, 0.0F, 0.0F);
		mag15_r1.cubeList.add(new ModelBox(mag15_r1, 100, 0, 10.8F, -40.2F, -9.7F, 2, 1, 10, 0.0F, true));

		mag14_r1 = new ModelRenderer(this);
		mag14_r1.setRotationPoint(-33.9875F, -32.8852F, 0.0F);
		mag.addChild(mag14_r1);
		setRotationAngle(mag14_r1, 0.0F, 0.0F, 1.1154F);
		mag14_r1.cubeList.add(new ModelBox(mag14_r1, 100, 0, 11.0F, -40.2F, -9.7F, 1, 3, 10, 0.0F, true));

		mag13_r1 = new ModelRenderer(this);
		mag13_r1.setRotationPoint(-4.0467F, -38.6562F, 18.8203F);
		mag.addChild(mag13_r1);
		setRotationAngle(mag13_r1, 1.5184F, 0.0F, 0.0F);
		mag13_r1.cubeList.add(new ModelBox(mag13_r1, 100, 0, 11.0F, -29.0F, -10.7F, 3, 12, 1, 0.0F, true));

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(-4.0467F, -1.1035F, 2.0788F);
		mag.addChild(mag11_r1);
		setRotationAngle(mag11_r1, 0.0524F, 0.0F, 0.0F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 100, 0, 11.0F, -40.0F, -10.7F, 3, 1, 12, 0.0F, true));

		mag10_r1 = new ModelRenderer(this);
		mag10_r1.setRotationPoint(9.6533F, -0.4265F, 0.0F);
		mag.addChild(mag10_r1);
		setRotationAngle(mag10_r1, 0.0F, 0.0F, -0.409F);
		mag10_r1.cubeList.add(new ModelBox(mag10_r1, 100, 0, 7.0F, -33.0F, -10.7F, 3, 3, 12, 0.0F, true));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(28.1612F, -52.121F, 0.0F);
		mag.addChild(mag9_r1);
		setRotationAngle(mag9_r1, 0.0F, 0.0F, -2.7512F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 100, 0, 11.0F, -29.0F, -10.7F, 3, 4, 12, 0.0F, true));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(32.2047F, -14.3674F, 0.0F);
		mag.addChild(mag6_r1);
		setRotationAngle(mag6_r1, 0.0F, 0.0F, -1.1154F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 100, 0, 7.0F, -36.0F, -10.7F, 3, 3, 12, 0.0F, true));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(-33.8079F, -32.7732F, 0.0F);
		mag.addChild(mag5_r1);
		setRotationAngle(mag5_r1, 0.0F, 0.0F, 1.1154F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 100, 0, 11.0F, -40.0F, -10.7F, 4, 3, 12, 0.0F, true));
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