package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington870PoliceMagnumStock extends ModelWithAttachments {
	private final ModelRenderer stockPoliceMagnum;
	private final ModelRenderer gun463_r1;
	private final ModelRenderer stock33_r1;
	private final ModelRenderer stock32_r1;
	private final ModelRenderer stock31_r1;
	private final ModelRenderer stock30_r1;
	private final ModelRenderer stock29_r1;
	private final ModelRenderer stock28_r1;
	private final ModelRenderer stock27_r1;
	private final ModelRenderer stock26_r1;
	private final ModelRenderer stock25_r1;
	private final ModelRenderer stock24_r1;
	private final ModelRenderer stock23_r1;
	private final ModelRenderer stock21_r1;
	private final ModelRenderer stock13_r1;
	private final ModelRenderer stock12_r1;
	private final ModelRenderer stock5_r1;
	private final ModelRenderer stock2_r1;
	private final ModelRenderer stock12_r2;
	private final ModelRenderer stock2_r2;
	private final ModelRenderer stock2_r3;
	private final ModelRenderer stock4_r1;
	private final ModelRenderer stock7_r1;
	private final ModelRenderer stock6_r1;

	public Remington870PoliceMagnumStock() {
		textureWidth = 410;
		textureHeight = 410;

		stockPoliceMagnum = new ModelRenderer(this);
		stockPoliceMagnum.setRotationPoint(0.0F, 13.2677F, -10.0133F);
		

		gun463_r1 = new ModelRenderer(this);
		gun463_r1.setRotationPoint(0.0F, 1.6429F, -0.855F);
		stockPoliceMagnum.addChild(gun463_r1);
		setRotationAngle(gun463_r1, -0.4461F, 0.0F, 0.0F);
		gun463_r1.cubeList.add(new ModelBox(gun463_r1, 10, 67, -2.9F, -28.5F, 13.6F, 1, 1, 6, 0.0F, false));
		gun463_r1.cubeList.add(new ModelBox(gun463_r1, 71, 35, -0.1F, -28.5F, 13.6F, 1, 1, 6, 0.0F, false));

		stock33_r1 = new ModelRenderer(this);
		stock33_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		stockPoliceMagnum.addChild(stock33_r1);
		setRotationAngle(stock33_r1, -0.5949F, 0.0F, 0.0F);
		stock33_r1.cubeList.add(new ModelBox(stock33_r1, 84, 79, -2.5F, -21.7F, 13.5F, 3, 1, 2, 0.01F, false));

		stock32_r1 = new ModelRenderer(this);
		stock32_r1.setRotationPoint(0.0F, 9.4857F, 7.6824F);
		stockPoliceMagnum.addChild(stock32_r1);
		setRotationAngle(stock32_r1, -0.1115F, 0.0F, 0.0F);
		stock32_r1.cubeList.add(new ModelBox(stock32_r1, 57, 77, -2.5F, -21.5F, 10.0F, 3, 1, 4, 0.0F, false));

		stock31_r1 = new ModelRenderer(this);
		stock31_r1.setRotationPoint(0.0F, 17.5375F, 29.6372F);
		stockPoliceMagnum.addChild(stock31_r1);
		setRotationAngle(stock31_r1, 1.0782F, 0.0F, 0.0F);
		stock31_r1.cubeList.add(new ModelBox(stock31_r1, 0, 23, -2.5F, -13.0F, 15.5F, 3, 1, 1, 0.0F, false));

		stock30_r1 = new ModelRenderer(this);
		stock30_r1.setRotationPoint(0.0F, -33.8279F, 38.1028F);
		stockPoliceMagnum.addChild(stock30_r1);
		setRotationAngle(stock30_r1, -2.6025F, 0.0F, 0.0F);
		stock30_r1.cubeList.add(new ModelBox(stock30_r1, 114, 71, -2.5F, -18.4F, 20.2F, 3, 4, 1, 0.0F, false));

		stock29_r1 = new ModelRenderer(this);
		stock29_r1.setRotationPoint(0.0F, -21.2178F, 49.1339F);
		stockPoliceMagnum.addChild(stock29_r1);
		setRotationAngle(stock29_r1, -2.8999F, 0.0F, 0.0F);
		stock29_r1.cubeList.add(new ModelBox(stock29_r1, 99, 57, -2.5F, -13.6F, 21.5F, 3, 5, 2, 0.0F, false));

		stock28_r1 = new ModelRenderer(this);
		stock28_r1.setRotationPoint(0.0F, 12.3768F, 11.5566F);
		stockPoliceMagnum.addChild(stock28_r1);
		setRotationAngle(stock28_r1, 0.1115F, 0.0F, 0.0F);
		stock28_r1.cubeList.add(new ModelBox(stock28_r1, 65, 44, -2.5F, -13.0F, 15.5F, 3, 1, 6, 0.0F, false));

		stock27_r1 = new ModelRenderer(this);
		stock27_r1.setRotationPoint(0.0F, 13.7666F, 16.7604F);
		stockPoliceMagnum.addChild(stock27_r1);
		setRotationAngle(stock27_r1, 0.2974F, 0.0F, 0.0F);
		stock27_r1.cubeList.add(new ModelBox(stock27_r1, 114, 57, -2.5F, -21.0F, 13.5F, 3, 9, 5, -0.01F, false));

		stock26_r1 = new ModelRenderer(this);
		stock26_r1.setRotationPoint(0.0F, 9.4639F, 7.2929F);
		stockPoliceMagnum.addChild(stock26_r1);
		setRotationAngle(stock26_r1, -0.1115F, 0.0F, 0.0F);
		stock26_r1.cubeList.add(new ModelBox(stock26_r1, 0, 114, -2.5F, -26.0F, 10.0F, 3, 5, 9, 0.0F, false));

		stock25_r1 = new ModelRenderer(this);
		stock25_r1.setRotationPoint(0.0F, -38.8977F, 50.3797F);
		stockPoliceMagnum.addChild(stock25_r1);
		setRotationAngle(stock25_r1, -3.0115F, 0.0F, 0.0F);
		stock25_r1.cubeList.add(new ModelBox(stock25_r1, 77, 22, -2.0F, -23.5F, 21.8F, 2, 1, 2, 0.0F, false));

		stock24_r1 = new ModelRenderer(this);
		stock24_r1.setRotationPoint(0.0F, -11.3602F, 59.9291F);
		stockPoliceMagnum.addChild(stock24_r1);
		setRotationAngle(stock24_r1, 2.2679F, 0.0F, 0.0F);
		stock24_r1.cubeList.add(new ModelBox(stock24_r1, 73, 18, -2.0F, -22.7F, 19.8F, 2, 2, 1, 0.0F, false));

		stock23_r1 = new ModelRenderer(this);
		stock23_r1.setRotationPoint(0.0F, 4.0648F, 47.3394F);
		stockPoliceMagnum.addChild(stock23_r1);
		setRotationAngle(stock23_r1, 1.45F, 0.0F, 0.0F);
		stock23_r1.cubeList.add(new ModelBox(stock23_r1, 37, 71, -2.89F, -24.4F, 14.9F, 2, 7, 1, 0.0F, false));
		stock23_r1.cubeList.add(new ModelBox(stock23_r1, 79, 33, -1.1F, -24.4F, 14.9F, 2, 7, 1, 0.0F, false));

		stock21_r1 = new ModelRenderer(this);
		stock21_r1.setRotationPoint(0.0F, 5.5309F, 4.7719F);
		stockPoliceMagnum.addChild(stock21_r1);
		setRotationAngle(stock21_r1, -0.2231F, 0.0F, 0.0F);
		stock21_r1.cubeList.add(new ModelBox(stock21_r1, 118, 9, -2.9F, -26.0F, 15.6F, 2, 2, 7, 0.0F, false));
		stock21_r1.cubeList.add(new ModelBox(stock21_r1, 84, 97, -1.11F, -26.0F, 14.6F, 2, 2, 8, 0.0F, false));

		stock13_r1 = new ModelRenderer(this);
		stock13_r1.setRotationPoint(0.0F, 5.9361F, 4.3905F);
		stockPoliceMagnum.addChild(stock13_r1);
		setRotationAngle(stock13_r1, -0.2231F, 0.0F, 0.0F);
		stock13_r1.cubeList.add(new ModelBox(stock13_r1, 42, 83, -1.9F, -27.5F, 17.6F, 1, 2, 5, 0.0F, false));
		stock13_r1.cubeList.add(new ModelBox(stock13_r1, 84, 57, -1.1F, -27.5F, 17.6F, 1, 2, 5, 0.0F, false));

		stock12_r1 = new ModelRenderer(this);
		stock12_r1.setRotationPoint(0.4F, -15.9482F, 29.9656F);
		stockPoliceMagnum.addChild(stock12_r1);
		setRotationAngle(stock12_r1, -0.1521F, 0.1638F, 0.8165F);
		stock12_r1.cubeList.add(new ModelBox(stock12_r1, 13, 74, -0.5F, 0.2F, -2.5F, 1, 1, 5, 0.1F, false));

		stock5_r1 = new ModelRenderer(this);
		stock5_r1.setRotationPoint(0.0F, 6.4836F, 40.2927F);
		stockPoliceMagnum.addChild(stock5_r1);
		setRotationAngle(stock5_r1, 1.1897F, 0.0F, 0.0F);
		stock5_r1.cubeList.add(new ModelBox(stock5_r1, 77, 42, -2.0F, -25.5F, 12.0F, 2, 4, 2, 0.0F, false));

		stock2_r1 = new ModelRenderer(this);
		stock2_r1.setRotationPoint(-2.4F, -17.2636F, 26.2496F);
		stockPoliceMagnum.addChild(stock2_r1);
		setRotationAngle(stock2_r1, -0.3249F, -0.2529F, -0.639F);
		stock2_r1.cubeList.add(new ModelBox(stock2_r1, 67, 57, -0.4F, 0.0F, -3.0F, 1, 1, 6, 0.1F, false));

		stock12_r2 = new ModelRenderer(this);
		stock12_r2.setRotationPoint(-2.4F, -15.9482F, 29.9656F);
		stockPoliceMagnum.addChild(stock12_r2);
		setRotationAngle(stock12_r2, -0.1733F, -0.1412F, -0.6771F);
		stock12_r2.cubeList.add(new ModelBox(stock12_r2, 74, 16, -0.5F, 0.2F, -2.5F, 1, 1, 5, 0.1F, false));

		stock2_r2 = new ModelRenderer(this);
		stock2_r2.setRotationPoint(0.4F, -17.2636F, 26.2496F);
		stockPoliceMagnum.addChild(stock2_r2);
		setRotationAngle(stock2_r2, -0.3249F, 0.2529F, 0.639F);
		stock2_r2.cubeList.add(new ModelBox(stock2_r2, 67, 68, -0.6F, 0.0F, -3.0F, 1, 1, 6, 0.1F, false));

		stock2_r3 = new ModelRenderer(this);
		stock2_r3.setRotationPoint(0.0F, 2.5143F, -0.4142F);
		stockPoliceMagnum.addChild(stock2_r3);
		setRotationAngle(stock2_r3, -0.409F, 0.0F, 0.0F);
		stock2_r3.cubeList.add(new ModelBox(stock2_r3, 71, 9, -1.1F, -29.25F, 13.6F, 1, 1, 6, 0.0F, false));
		stock2_r3.cubeList.add(new ModelBox(stock2_r3, 71, 26, -1.9F, -29.25F, 13.6F, 1, 1, 6, 0.0F, false));

		stock4_r1 = new ModelRenderer(this);
		stock4_r1.setRotationPoint(0.0F, 6.9722F, 41.5706F);
		stockPoliceMagnum.addChild(stock4_r1);
		setRotationAngle(stock4_r1, 1.1897F, 0.0F, 0.0F);
		stock4_r1.cubeList.add(new ModelBox(stock4_r1, 93, 33, -0.1F, -26.2F, 13.0F, 1, 3, 3, 0.0F, false));

		stock7_r1 = new ModelRenderer(this);
		stock7_r1.setRotationPoint(0.0F, 6.8466F, 41.7562F);
		stockPoliceMagnum.addChild(stock7_r1);
		setRotationAngle(stock7_r1, 1.1897F, 0.0F, 0.0F);
		stock7_r1.cubeList.add(new ModelBox(stock7_r1, 84, 97, -2.9F, -26.4F, 13.0F, 1, 3, 3, 0.0F, false));

		stock6_r1 = new ModelRenderer(this);
		stock6_r1.setRotationPoint(0.0F, 4.845F, 46.2588F);
		stockPoliceMagnum.addChild(stock6_r1);
		setRotationAngle(stock6_r1, 1.45F, 0.0F, 0.0F);
		stock6_r1.cubeList.add(new ModelBox(stock6_r1, 27, 71, -2.0F, -23.4F, 14.8F, 2, 5, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		stockPoliceMagnum.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}