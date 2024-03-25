package com.paneedah.mwc.models.weapons;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JunoGrip extends ModelBase {
	private final ModelRenderer JunoGrip;
	private final ModelRenderer grip34_r1;
	private final ModelRenderer grip33_r1;
	private final ModelRenderer grip31_r1;
	private final ModelRenderer grip30_r1;
	private final ModelRenderer grip29_r1;
	private final ModelRenderer grip28_r1;
	private final ModelRenderer grip27_r1;
	private final ModelRenderer grip25_r1;
	private final ModelRenderer grip24_r1;
	private final ModelRenderer grip23_r1;
	private final ModelRenderer grip21_r1;
	private final ModelRenderer grip17_r1;
	private final ModelRenderer grip15_r1;
	private final ModelRenderer grip10_r1;
	private final ModelRenderer grip9_r1;
	private final ModelRenderer grip7_r1;
	private final ModelRenderer grip6_r1;
	private final ModelRenderer grip5_r1;

	public JunoGrip() {
		textureWidth = 64;
		textureHeight = 64;

		JunoGrip = new ModelRenderer(this);
		JunoGrip.setRotationPoint(0.0F, 20.2533F, 10.5632F);
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 0, 37, 0.0F, -20.2533F, -10.5632F, 4, 4, 3, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 0, 0, 0.0F, -22.2533F, -17.5632F, 4, 2, 24, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 44, 13, 0.0F, -20.2533F, -17.5632F, 4, 2, 1, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 0, 8, 0.0F, -23.2533F, -17.5632F, 4, 1, 6, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 0, 26, 0.0F, -23.2533F, -4.5632F, 4, 1, 10, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 0, 0, 0.5F, -23.2533F, -11.5632F, 3, 1, 7, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 30, 32, 0.5F, -11.9533F, -4.4632F, 3, 3, 4, -0.002F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 14, 37, 0.5F, -20.9533F, 3.4368F, 3, 5, 3, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 26, 39, 1.0F, -10.5533F, -4.4632F, 2, 2, 4, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 44, 26, 1.0F, -15.9533F, 4.4368F, 2, 1, 2, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 0, 26, 0.5F, -20.7533F, -11.0632F, 3, 6, 1, 0.0F, false));
		JunoGrip.cubeList.add(new ModelBox(JunoGrip, 13, 0, 0.5F, -20.7533F, -7.5632F, 3, 6, 1, 0.0F, false));

		grip34_r1 = new ModelRenderer(this);
		grip34_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		JunoGrip.addChild(grip34_r1);
		setRotationAngle(grip34_r1, 0.7064F, 0.0F, 0.0F);
		grip34_r1.cubeList.add(new ModelBox(grip34_r1, 0, 44, 0.5F, -16.2F, 4.2F, 3, 5, 1, 0.0F, false));
		grip34_r1.cubeList.add(new ModelBox(grip34_r1, 18, 26, 0.0F, -16.2F, 0.2F, 4, 6, 4, 0.0F, false));

		grip33_r1 = new ModelRenderer(this);
		grip33_r1.setRotationPoint(0.0F, 2.5755F, -4.7458F);
		JunoGrip.addChild(grip33_r1);
		setRotationAngle(grip33_r1, 0.2974F, 0.0F, 0.0F);
		grip33_r1.cubeList.add(new ModelBox(grip33_r1, 16, 19, 0.5F, -20.0F, 3.0F, 3, 4, 1, -0.002F, false));
		grip33_r1.cubeList.add(new ModelBox(grip33_r1, 0, 15, 0.0F, -20.0F, -1.0F, 4, 4, 4, -0.002F, false));

		grip31_r1 = new ModelRenderer(this);
		grip31_r1.setRotationPoint(0.0F, 5.6975F, 10.1271F);
		JunoGrip.addChild(grip31_r1);
		setRotationAngle(grip31_r1, 0.7854F, 0.0F, 0.0F);
		grip31_r1.cubeList.add(new ModelBox(grip31_r1, 44, 3, 0.5F, -24.0F, 12.7F, 3, 2, 2, 0.0F, false));

		grip30_r1 = new ModelRenderer(this);
		grip30_r1.setRotationPoint(0.0F, -15.3287F, -24.6152F);
		JunoGrip.addChild(grip30_r1);
		setRotationAngle(grip30_r1, -0.7854F, 0.0F, 0.0F);
		grip30_r1.cubeList.add(new ModelBox(grip30_r1, 40, 34, 0.0F, -26.5F, 16.0F, 4, 1, 1, 0.0F, false));

		grip29_r1 = new ModelRenderer(this);
		grip29_r1.setRotationPoint(0.0F, 0.0812F, 10.2861F);
		JunoGrip.addChild(grip29_r1);
		setRotationAngle(grip29_r1, 0.7854F, 0.0F, 0.0F);
		grip29_r1.cubeList.add(new ModelBox(grip29_r1, 41, 0, 0.0F, -27.0F, 4.0F, 4, 1, 2, 0.0F, false));

		grip28_r1 = new ModelRenderer(this);
		grip28_r1.setRotationPoint(0.0F, -3.4543F, -29.948F);
		JunoGrip.addChild(grip28_r1);
		setRotationAngle(grip28_r1, -0.7854F, 0.0F, 0.0F);
		grip28_r1.cubeList.add(new ModelBox(grip28_r1, 43, 37, 0.0F, -27.0F, -1.0F, 4, 1, 2, -0.001F, false));

		grip27_r1 = new ModelRenderer(this);
		grip27_r1.setRotationPoint(0.0F, -2.1719F, 0.4498F);
		JunoGrip.addChild(grip27_r1);
		setRotationAngle(grip27_r1, 0.4833F, 0.0F, 0.0F);
		grip27_r1.cubeList.add(new ModelBox(grip27_r1, 30, 26, -0.5F, -25.3F, -6.5F, 5, 2, 2, 0.0F, false));

		grip25_r1 = new ModelRenderer(this);
		grip25_r1.setRotationPoint(0.0F, -2.2221F, 6.8467F);
		JunoGrip.addChild(grip25_r1);
		setRotationAngle(grip25_r1, 0.7854F, 0.0F, 0.0F);
		grip25_r1.cubeList.add(new ModelBox(grip25_r1, 12, 15, 0.0F, -24.0F, 1.5F, 4, 2, 2, -0.002F, false));

		grip24_r1 = new ModelRenderer(this);
		grip24_r1.setRotationPoint(-10.6951F, -0.8612F, -10.5632F);
		JunoGrip.addChild(grip24_r1);
		setRotationAngle(grip24_r1, 0.0F, 0.0F, 0.4833F);
		grip24_r1.cubeList.add(new ModelBox(grip24_r1, 44, 7, 3.0F, -24.0F, 14.0F, 1, 3, 3, 0.0F, false));

		grip23_r1 = new ModelRenderer(this);
		grip23_r1.setRotationPoint(11.1534F, 0.9977F, -10.5632F);
		JunoGrip.addChild(grip23_r1);
		setRotationAngle(grip23_r1, 0.0F, 0.0F, -0.4833F);
		grip23_r1.cubeList.add(new ModelBox(grip23_r1, 8, 44, 0.0F, -24.0F, 14.0F, 1, 3, 3, 0.0F, false));

		grip21_r1 = new ModelRenderer(this);
		grip21_r1.setRotationPoint(0.0F, -1.4595F, 6.4999F);
		JunoGrip.addChild(grip21_r1);
		setRotationAngle(grip21_r1, 1.5987F, 0.0F, 0.0F);
		grip21_r1.cubeList.add(new ModelBox(grip21_r1, 0, 4, 1.0F, -8.5F, 6.0F, 2, 1, 1, -0.001F, false));
		grip21_r1.cubeList.add(new ModelBox(grip21_r1, 0, 0, 1.0F, -10.9F, 6.0F, 2, 3, 1, 0.0F, false));

		grip17_r1 = new ModelRenderer(this);
		grip17_r1.setRotationPoint(0.0F, -9.4425F, 14.9213F);
		JunoGrip.addChild(grip17_r1);
		setRotationAngle(grip17_r1, 2.3794F, 0.0F, 0.0F);
		grip17_r1.cubeList.add(new ModelBox(grip17_r1, 38, 39, 1.0F, -12.7F, 10.1F, 2, 11, 1, -0.002F, false));

		grip15_r1 = new ModelRenderer(this);
		grip15_r1.setRotationPoint(0.0F, -11.1659F, 15.6118F);
		JunoGrip.addChild(grip15_r1);
		setRotationAngle(grip15_r1, 2.3794F, 0.0F, 0.0F);
		grip15_r1.cubeList.add(new ModelBox(grip15_r1, 32, 0, 0.5F, -12.7F, 10.1F, 3, 10, 3, 0.0F, false));

		grip10_r1 = new ModelRenderer(this);
		grip10_r1.setRotationPoint(0.0F, -38.6194F, -2.7809F);
		JunoGrip.addChild(grip10_r1);
		setRotationAngle(grip10_r1, 2.2679F, 0.0F, 0.0F);
		grip10_r1.cubeList.add(new ModelBox(grip10_r1, 0, 33, 0.0F, -23.0F, -6.0F, 4, 2, 1, -0.001F, false));

		grip9_r1 = new ModelRenderer(this);
		grip9_r1.setRotationPoint(0.0F, -36.9774F, -3.5476F);
		JunoGrip.addChild(grip9_r1);
		setRotationAngle(grip9_r1, 2.2679F, 0.0F, 0.0F);
		grip9_r1.cubeList.add(new ModelBox(grip9_r1, 14, 8, 0.0F, -22.0F, -6.0F, 4, 4, 1, -0.002F, false));

		grip7_r1 = new ModelRenderer(this);
		grip7_r1.setRotationPoint(0.0F, -9.0504F, 8.7557F);
		JunoGrip.addChild(grip7_r1);
		setRotationAngle(grip7_r1, 1.0038F, 0.0F, 0.0F);
		grip7_r1.cubeList.add(new ModelBox(grip7_r1, 32, 19, 0.0F, -24.0F, -2.0F, 4, 3, 2, -0.002F, false));

		grip6_r1 = new ModelRenderer(this);
		grip6_r1.setRotationPoint(0.0F, -6.3552F, 5.8445F);
		JunoGrip.addChild(grip6_r1);
		setRotationAngle(grip6_r1, 1.0038F, 0.0F, 0.0F);
		grip6_r1.cubeList.add(new ModelBox(grip6_r1, 40, 30, 0.0F, -20.0F, -1.0F, 4, 2, 2, -0.001F, false));

		grip5_r1 = new ModelRenderer(this);
		grip5_r1.setRotationPoint(0.0F, -0.0823F, 3.0752F);
		JunoGrip.addChild(grip5_r1);
		setRotationAngle(grip5_r1, 1.2269F, 0.0F, 0.0F);
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 32, 13, 0.0F, -11.6F, 4.1F, 4, 2, 4, -0.001F, false));
		grip5_r1.cubeList.add(new ModelBox(grip5_r1, 44, 19, 0.5F, -11.6F, 8.1F, 3, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		JunoGrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}