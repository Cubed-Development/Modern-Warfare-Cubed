package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PSO1reticle extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer gun88_r1;
	private final ModelRenderer gun75_r1;
	private final ModelRenderer gun73_r1;
	private final ModelRenderer gun72_r1;
	private final ModelRenderer gun70_r1;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun39_r1;
	private final ModelRenderer gun38_r1;
	private final ModelRenderer gun37_r1;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun35_r1;
	private final ModelRenderer gun34_r1;
	private final ModelRenderer gun30_r1;
	private final ModelRenderer gun29_r1;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun4_r1;
	private final ModelRenderer gun1_r1;
	private final ModelRenderer gun89_r1;

	public PSO1reticle() {
		textureWidth = 128;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(11.0548F, 27.3067F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -9.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -11.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -13.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -15.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.4452F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.4452F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.4452F, -67.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.4452F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 8.4452F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 10.4452F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 12.4452F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 14.4452F, -67.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -17.5548F, -67.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -19.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -21.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -23.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -25.5548F, -67.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.5548F, -67.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -68.5548F, -67.3067F, 0.0F, 40, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 16.4452F, -67.3067F, 0.0F, 40, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5548F, -41.3067F, 0.0F, 1, 30, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.4452F, -31.3067F, 0.0F, 52, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.4452F, -49.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 55.4452F, -39.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 40.9452F, -40.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 28.9452F, -41.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 16.9452F, -43.5067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 46.9452F, -38.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 34.9452F, -39.1067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 22.9452F, -40.6067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 10.9452F, -43.3067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 57.4452F, -44.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 55.4452F, -44.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 54.4452F, -44.9067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 54.4452F, -41.9067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 53.4452F, -44.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 40.9452F, -45.9067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 40.9452F, -42.3067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 40.9452F, -44.4067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 41.6452F, -45.7067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 40.2452F, -45.7067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 40.1452F, -43.6067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 41.7452F, -43.6067F, 0.0F, 1, 2, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 27.9452F, -46.9067F, 0.0F, 3, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 29.9452F, -45.9067F, 0.0F, 1, 3, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 27.9452F, -43.9067F, 0.0F, 2, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 27.9452F, -44.9067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 27.9452F, -45.3067F, 0.0F, 2, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 15.9452F, -46.9067F, 0.0F, 3, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 16.4452F, -47.9067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.4452F, -51.3067F, 0.0F, 3, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.4452F, -55.2067F, 0.0F, 2, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 16.4452F, -62.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -25.5548F, -62.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -27.5548F, -62.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -29.5548F, -62.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.5548F, -62.3067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -28.5548F, -59.3067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 14.4452F, -62.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 12.4452F, -62.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 13.4452F, -62.3067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 13.4452F, -59.3067F, 0.0F, 1, 1, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 6.4452F, -29.3067F, 0.0F, 1, 4, 0, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.4452F, -29.3067F, 0.0F, 3, 1, 0, 0.0F, true));

		gun88_r1 = new ModelRenderer(this);
		gun88_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun88_r1);
		setRotationAngle(gun88_r1, 0.0F, 0.0F, -0.409F);
		gun88_r1.cubeList.add(new ModelBox(gun88_r1, 0, 0, 13.5F, -25.0F, 0.0F, 1, 3, 0, 0.0F, true));

		gun75_r1 = new ModelRenderer(this);
		gun75_r1.setRotationPoint(-39.9088F, -24.1168F, 0.0F);
		bone.addChild(gun75_r1);
		setRotationAngle(gun75_r1, 0.0F, 0.0F, 0.6692F);
		gun75_r1.cubeList.add(new ModelBox(gun75_r1, 0, 0, 15.5F, -51.9F, 0.0F, 1, 2, 0, 0.0F, true));

		gun73_r1 = new ModelRenderer(this);
		gun73_r1.setRotationPoint(-16.7498F, -98.7011F, 0.0F);
		bone.addChild(gun73_r1);
		setRotationAngle(gun73_r1, 0.0F, 0.0F, 2.3423F);
		gun73_r1.cubeList.add(new ModelBox(gun73_r1, 0, 0, 17.3F, -48.9F, 0.0F, 1, 3, 0, 0.0F, true));

		gun72_r1 = new ModelRenderer(this);
		gun72_r1.setRotationPoint(13.8337F, -101.8603F, 0.0F);
		bone.addChild(gun72_r1);
		setRotationAngle(gun72_r1, 0.0F, 0.0F, 2.9371F);
		gun72_r1.cubeList.add(new ModelBox(gun72_r1, 0, 0, 17.5F, -48.0F, 0.0F, 1, 1, 0, 0.0F, true));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(39.4667F, -95.6902F, 0.0F);
		bone.addChild(gun70_r1);
		setRotationAngle(gun70_r1, 0.0F, 0.0F, 2.9371F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 0, 0, 30.0F, -43.6F, 0.0F, 1, 2, 0, 0.0F, true));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(79.8079F, 29.2799F, 0.0F);
		bone.addChild(gun42_r1);
		setRotationAngle(gun42_r1, 0.0F, 0.0F, -1.5243F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 0, 0, 62.5F, -31.3F, 0.0F, 1, 5, 0, 0.0F, true));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(74.3863F, 23.0003F, 0.0F);
		bone.addChild(gun41_r1);
		setRotationAngle(gun41_r1, 0.0F, 0.0F, -1.5243F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 0, 0, 56.5F, -31.6F, 0.0F, 1, 4, 0, 0.0F, true));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(69.0646F, 16.6254F, 0.0F);
		bone.addChild(gun40_r1);
		setRotationAngle(gun40_r1, 0.0F, 0.0F, -1.5243F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 0, 50.5F, -32.0F, 0.0F, 1, 4, 0, 0.0F, true));

		gun39_r1 = new ModelRenderer(this);
		gun39_r1.setRotationPoint(62.1134F, 11.2532F, 0.0F);
		bone.addChild(gun39_r1);
		setRotationAngle(gun39_r1, 0.0F, 0.0F, -1.4871F);
		gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 0, 44.5F, -32.5F, 0.0F, 1, 4, 0, 0.0F, true));

		gun38_r1 = new ModelRenderer(this);
		gun38_r1.setRotationPoint(57.3123F, 4.6327F, 0.0F);
		bone.addChild(gun38_r1);
		setRotationAngle(gun38_r1, 0.0F, 0.0F, -1.4871F);
		gun38_r1.cubeList.add(new ModelBox(gun38_r1, 0, 0, 38.5F, -33.2F, 0.0F, 1, 4, 0, 0.0F, true));

		gun37_r1 = new ModelRenderer(this);
		gun37_r1.setRotationPoint(51.2799F, -0.9454F, 0.0F);
		bone.addChild(gun37_r1);
		setRotationAngle(gun37_r1, 0.0F, 0.0F, -1.45F);
		gun37_r1.cubeList.add(new ModelBox(gun37_r1, 0, 0, 32.5F, -34.0F, 0.0F, 1, 4, 0, 0.0F, true));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(45.8393F, -6.6295F, 0.0F);
		bone.addChild(gun36_r1);
		setRotationAngle(gun36_r1, 0.0F, 0.0F, -1.4128F);
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 0, 0, 26.5F, -35.0F, 0.0F, 1, 4, 0, 0.0F, true));

		gun35_r1 = new ModelRenderer(this);
		gun35_r1.setRotationPoint(37.3669F, -8.532F, 0.0F);
		bone.addChild(gun35_r1);
		setRotationAngle(gun35_r1, 0.0F, 0.0F, -1.2269F);
		gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 20.5F, -37.0F, 0.0F, 1, 4, 0, 0.0F, true));

		gun34_r1 = new ModelRenderer(this);
		gun34_r1.setRotationPoint(14.8639F, -1.7492F, 0.0F);
		bone.addChild(gun34_r1);
		setRotationAngle(gun34_r1, 0.0F, 0.0F, -0.5949F);
		gun34_r1.cubeList.add(new ModelBox(gun34_r1, 0, 0, 15.5F, -41.5F, 0.0F, 1, 3, 0, 0.0F, true));

		gun30_r1 = new ModelRenderer(this);
		gun30_r1.setRotationPoint(-45.6592F, -34.1633F, 0.0F);
		bone.addChild(gun30_r1);
		setRotationAngle(gun30_r1, 0.0F, 0.0F, 1.1897F);
		gun30_r1.cubeList.add(new ModelBox(gun30_r1, 0, 0, 5.5F, -41.0F, 0.0F, 3, 1, 0, 0.0F, true));

		gun29_r1 = new ModelRenderer(this);
		gun29_r1.setRotationPoint(-25.6418F, -7.7426F, 0.0F);
		bone.addChild(gun29_r1);
		setRotationAngle(gun29_r1, 0.0F, 0.0F, 0.3718F);
		gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 0, 4.5F, -41.0F, 0.0F, 1, 3, 0, 0.0F, true));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-53.0853F, -39.1879F, 0.0F);
		bone.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0F, 0.0F, 1.1897F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 0, 0, 5.5F, -49.0F, 0.0F, 3, 1, 0, 0.0F, true));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-28.5481F, -8.2892F, 0.0F);
		bone.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0F, 0.0F, 0.3718F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 0, 0, 4.5F, -49.0F, 0.0F, 1, 3, 0, 0.0F, true));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-31.4543F, -8.8357F, 0.0F);
		bone.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, 0.3718F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 0, 0, 4.5F, -57.0F, 0.0F, 1, 3, 0, 0.0F, true));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(-60.5114F, -44.2125F, 0.0F);
		bone.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.0F, 0.0F, 1.1897F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 0, 0, 5.5F, -57.0F, 0.0F, 3, 1, 0, 0.0F, true));

		gun4_r1 = new ModelRenderer(this);
		gun4_r1.setRotationPoint(-54.8452F, -25.5874F, 0.0F);
		bone.addChild(gun4_r1);
		setRotationAngle(gun4_r1, 0.0F, 0.0F, 0.7854F);
		gun4_r1.cubeList.add(new ModelBox(gun4_r1, 0, 0, 5.0F, -64.0F, 0.0F, 3, 1, 0, 0.0F, true));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(-28.0254F, -10.3362F, 0.0F);
		bone.addChild(gun1_r1);
		setRotationAngle(gun1_r1, 0.0F, 0.0F, 0.7854F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 0, 0, 5.0F, -64.0F, 0.0F, 1, 3, 0, 0.0F, true));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(-0.8322F, 0.5873F, 0.0F);
		bone.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0.0F, 0.0F, -0.409F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 0, 0, 14.5F, -22.7F, 0.0F, 1, 1, 0, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}