package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JohnsonLMG extends ModelWithAttachments {
	private final ModelRenderer main;
	private final ModelRenderer Main202_r1;
	private final ModelRenderer Main201_r1;
	private final ModelRenderer Main199_r1;
	private final ModelRenderer Main198_r1;
	private final ModelRenderer Main197_r1;
	private final ModelRenderer Main192_r1;
	private final ModelRenderer Main190_r1;
	private final ModelRenderer Main189_r1;
	private final ModelRenderer Main188_r1;
	private final ModelRenderer Main187_r1;
	private final ModelRenderer Main183_r1;
	private final ModelRenderer Main60Grip_r1;
	private final ModelRenderer Main51_r1;
	private final ModelRenderer Main50_r1;
	private final ModelRenderer Main49_r1;
	private final ModelRenderer Main40_r1;
	private final ModelRenderer Main28_r1;
	private final ModelRenderer Main26_r1;
	private final ModelRenderer Main21_r1;
	private final ModelRenderer Main20_r1;
	private final ModelRenderer Main11_r1;
	private final ModelRenderer stock;
	private final ModelRenderer Main197Stock_r1;
	private final ModelRenderer Main196Stock_r1;
	private final ModelRenderer Main193Stock_r1;
	private final ModelRenderer Main194Stock_r1;
	private final ModelRenderer Main195Stock_r1;
	private final ModelRenderer ironsplach;
	private final ModelRenderer Main45IRONSPLACHLD_r1;
	private final ModelRenderer Main42IRONSPLACHLD_r1;
	private final ModelRenderer Main41IRONSPLACHLD_r1;
	private final ModelRenderer barrelCov;
	private final ModelRenderer Main68HandGuard_r1;
	private final ModelRenderer Main67HandGuard_r1;
	private final ModelRenderer Main161BarrelCov_r1;
	private final ModelRenderer Main152BarrelCov_r1;
	private final ModelRenderer Main143BarrelCov_r1;
	private final ModelRenderer Main133BarrelCov_r1;
	private final ModelRenderer Main121BarrelCov_r1;
	private final ModelRenderer Main120BarrelCov_r1;
	private final ModelRenderer Main119BarrelCov_r1;
	private final ModelRenderer Main118BarrelCov_r1;
	private final ModelRenderer Main117BarrelCov_r1;
	private final ModelRenderer Main116BarrelCov_r1;
	private final ModelRenderer Main115BarrelCov_r1;
	private final ModelRenderer Main114BarrelCov_r1;
	private final ModelRenderer barrel;
	private final ModelRenderer Main178Barrel_r1;
	private final ModelRenderer Main177Barrel_r1;
	private final ModelRenderer Main174Barrel_r1;
	private final ModelRenderer Main172Barrel_r1;

	public JohnsonLMG() {
		textureWidth = 256;
		textureHeight = 256;

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0F, 24.0F, 0.0F);
		main.cubeList.add(new ModelBox(main, 0, 0, 1.2F, -26.5F, 25.5F, 1, 2, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.0F, 10.0F, 12, 3, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.0F, 20.0F, 12, 3, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -18.5F, 11.0F, 12, 1, 9, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.5F, 11.0F, 12, 1, 3, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -18.0F, 10.0F, 5, 4, 11, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -18.0F, 21.0F, 5, 4, 16, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 5.0F, -18.3F, 13.0F, 6, 1, 5, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.8F, -20.0F, 23.0F, 1, 2, 15, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.8F, -20.0F, 21.0F, 1, 2, 17, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.9F, -24.0F, 37.0F, 1, 4, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.9F, -23.0F, 36.0F, 1, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -24.5F, 19.0F, 3, 6, 19, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -23.0F, 10.0F, 4, 2, 26, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 2.5F, -22.5F, 19.0F, 1, 1, 6, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -18.4F, 33.0F, 6, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.9F, -24.0F, 37.0F, 1, 4, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.9F, -23.0F, 36.0F, 1, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 2.2F, -16.2F, 27.5F, 1, 2, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -24.0F, 10.0F, 3, 1, 9, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.2F, -25.5F, 35.0F, 3, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.2F, -25.5F, 35.0F, 1, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.2F, -24.5F, 25.0F, 1, 1, 10, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.2F, -24.5F, 25.0F, 1, 1, 10, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.2F, -26.5F, 25.5F, 1, 2, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -24.2F, 14.0F, 1, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -24.2F, 14.0F, 2, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -21.0F, 10.0F, 2, 1, 11, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -19.0F, 19.0F, 2, 1, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -20.0F, 20.0F, 2, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -20.0F, 10.0F, 4, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -3.2F, -18.0F, 10.0F, 2, 3, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -3.2F, -18.0F, 20.0F, 2, 3, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -15.0F, 20.0F, 1, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -15.0F, 10.0F, 1, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 2.7F, -18.0F, 10.0F, 1, 4, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 2.7F, -18.0F, 20.0F, 1, 4, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -14.8F, 10.0F, 5, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -14.8F, 20.0F, 5, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -14.0F, 22.0F, 2, 3, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -11.0F, 22.5F, 2, 1, 6, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -14.0F, 28.0F, 3, 4, 6, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -19.5F, -18.0F, 2, 2, 28, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -18.0F, 3.0F, 2, 2, 7, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 0.0F, -18.0F, -17.5F, 1, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -17.0F, -17.5F, 4, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -15.5F, -17.5F, 4, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -16.75F, -17.5F, 1, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -16.75F, -17.5F, 1, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -22.0F, 10.0F, 5, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.5F, 18.0F, 12, 1, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.5F, 14.0F, 3, 1, 4, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 10.0F, -22.0F, 14.0F, 3, 1, 4, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 4.0F, -21.5F, 14.0F, 4, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 4.0F, -21.5F, 17.0F, 4, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 4.9F, -22.5F, 17.2F, 3, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 4.9F, -22.5F, 13.8F, 3, 1, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -23.5F, 42.0F, 3, 3, 18, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -22.5F, 38.0F, 6, 4, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, -1.5F, -24.5F, 38.0F, 4, 2, 1, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 1.5F, -20.0F, 21.0F, 1, 2, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 0.0F, -25.5F, -51.7F, 1, 3, 2, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 0.0F, -18.0F, -9.0F, 1, 2, 3, 0.0F, true));
		main.cubeList.add(new ModelBox(main, 0, 0, 0.0F, -30.5F, -48.5F, 1, 2, 3, 0.0F, true));

		Main202_r1 = new ModelRenderer(this);
		Main202_r1.setRotationPoint(0.0F, 26.1723F, -41.1329F);
		main.addChild(Main202_r1);
		setRotationAngle(Main202_r1, -0.9666F, 0.0F, 0.0F);
		Main202_r1.cubeList.add(new ModelBox(Main202_r1, 0, 0, 0.0F, -28.1F, -45.5F, 1, 2, 6, 0.0F, true));

		Main201_r1 = new ModelRenderer(this);
		Main201_r1.setRotationPoint(0.0F, 23.7777F, -52.8776F);
		main.addChild(Main201_r1);
		setRotationAngle(Main201_r1, -1.1154F, 0.0F, 0.0F);
		Main201_r1.cubeList.add(new ModelBox(Main201_r1, 0, 0, 0.0F, -30.5F, -45.5F, 1, 2, 4, 0.0F, true));

		Main199_r1 = new ModelRenderer(this);
		Main199_r1.setRotationPoint(0.0F, 13.7725F, -10.2736F);
		main.addChild(Main199_r1);
		setRotationAngle(Main199_r1, -0.2974F, 0.0F, 0.0F);
		Main199_r1.cubeList.add(new ModelBox(Main199_r1, 0, 0, 0.0F, -27.4F, -51.1F, 1, 2, 2, 0.0F, true));

		Main198_r1 = new ModelRenderer(this);
		Main198_r1.setRotationPoint(0.0F, 24.1827F, -31.4031F);
		main.addChild(Main198_r1);
		setRotationAngle(Main198_r1, -0.7064F, 0.0F, 0.0F);
		Main198_r1.cubeList.add(new ModelBox(Main198_r1, 0, 0, 0.0F, -30.5F, -48.5F, 1, 4, 2, 0.0F, true));

		Main197_r1 = new ModelRenderer(this);
		Main197_r1.setRotationPoint(7.8562F, -4.3698F, 0.0F);
		main.addChild(Main197_r1);
		setRotationAngle(Main197_r1, 0.0F, 0.0F, -0.5949F);
		Main197_r1.cubeList.add(new ModelBox(Main197_r1, 0, 0, -3.2F, -14.8F, 20.0F, 1, 1, 1, 0.0F, true));
		Main197_r1.cubeList.add(new ModelBox(Main197_r1, 0, 0, -3.2F, -14.8F, 10.0F, 1, 1, 1, 0.0F, true));
		Main197_r1.cubeList.add(new ModelBox(Main197_r1, 0, 0, -3.2F, -15.0F, 10.0F, 1, 1, 1, 0.0F, true));
		Main197_r1.cubeList.add(new ModelBox(Main197_r1, 0, 0, -3.2F, -15.0F, 20.0F, 1, 1, 1, 0.0F, true));

		Main192_r1 = new ModelRenderer(this);
		Main192_r1.setRotationPoint(0.0F, -11.3317F, -5.1141F);
		main.addChild(Main192_r1);
		setRotationAngle(Main192_r1, -0.4363F, 0.0F, 0.0F);
		Main192_r1.cubeList.add(new ModelBox(Main192_r1, 0, 0, 2.2F, -16.7F, 23.0F, 1, 1, 2, 0.0F, true));
		Main192_r1.cubeList.add(new ModelBox(Main192_r1, 0, 0, 2.2F, -17.2F, 23.0F, 1, 1, 2, 0.0F, true));

		Main190_r1 = new ModelRenderer(this);
		Main190_r1.setRotationPoint(11.0694F, -35.4149F, 0.0F);
		main.addChild(Main190_r1);
		setRotationAngle(Main190_r1, 0.0F, 0.0F, -2.3562F);
		Main190_r1.cubeList.add(new ModelBox(Main190_r1, 0, 0, -2.8F, -20.0F, 21.0F, 1, 1, 16, 0.0F, true));

		Main189_r1 = new ModelRenderer(this);
		Main189_r1.setRotationPoint(-9.3622F, -36.122F, 0.0F);
		main.addChild(Main189_r1);
		setRotationAngle(Main189_r1, 0.0F, 0.0F, 2.3562F);
		Main189_r1.cubeList.add(new ModelBox(Main189_r1, 0, 0, 2.8F, -20.0F, 23.0F, 1, 1, 14, 0.0F, true));

		Main188_r1 = new ModelRenderer(this);
		Main188_r1.setRotationPoint(-11.6776F, -2.1636F, 0.0F);
		main.addChild(Main188_r1);
		setRotationAngle(Main188_r1, 0.0F, 0.0F, 0.4887F);
		Main188_r1.cubeList.add(new ModelBox(Main188_r1, 0, 0, -1.5F, -24.4F, 38.0F, 1, 2, 1, 0.0F, true));

		Main187_r1 = new ModelRenderer(this);
		Main187_r1.setRotationPoint(11.4546F, -2.0581F, 0.0F);
		main.addChild(Main187_r1);
		setRotationAngle(Main187_r1, 0.0F, 0.0F, -0.4887F);
		Main187_r1.cubeList.add(new ModelBox(Main187_r1, 0, 0, 1.6F, -23.9F, 38.0F, 1, 2, 1, 0.0F, true));

		Main183_r1 = new ModelRenderer(this);
		Main183_r1.setRotationPoint(3.9038F, 0.6208F, 0.0F);
		main.addChild(Main183_r1);
		setRotationAngle(Main183_r1, 0.0F, 0.0F, -0.1745F);
		Main183_r1.cubeList.add(new ModelBox(Main183_r1, 0, 0, 5.5F, -22.0F, 11.8F, 5, 1, 2, 0.0F, true));

		Main60Grip_r1 = new ModelRenderer(this);
		Main60Grip_r1.setRotationPoint(0.0F, 8.3252F, 5.4366F);
		main.addChild(Main60Grip_r1);
		setRotationAngle(Main60Grip_r1, 0.3142F, 0.0F, 0.0F);
		Main60Grip_r1.cubeList.add(new ModelBox(Main60Grip_r1, 200, 0, -1.5F, -13.0F, 29.0F, 4, 10, 4, 0.0F, true));

		Main51_r1 = new ModelRenderer(this);
		Main51_r1.setRotationPoint(8.5008F, -4.8242F, 0.0F);
		main.addChild(Main51_r1);
		setRotationAngle(Main51_r1, 0.0F, 0.0F, -0.6465F);
		Main51_r1.cubeList.add(new ModelBox(Main51_r1, 0, 0, -2.95F, -15.1F, 11.0F, 1, 1, 9, 0.0F, true));

		Main50_r1 = new ModelRenderer(this);
		Main50_r1.setRotationPoint(2.1234F, -0.5377F, 0.0F);
		main.addChild(Main50_r1);
		setRotationAngle(Main50_r1, 0.0F, 0.0F, -0.126F);
		Main50_r1.cubeList.add(new ModelBox(Main50_r1, 0, 0, -3.2F, -17.1F, 11.0F, 2, 2, 9, 0.0F, true));

		Main49_r1 = new ModelRenderer(this);
		Main49_r1.setRotationPoint(-13.0988F, -3.8766F, 0.0F);
		main.addChild(Main49_r1);
		setRotationAngle(Main49_r1, 0.0F, 0.0F, 0.733F);
		Main49_r1.cubeList.add(new ModelBox(Main49_r1, 0, 0, -1.5F, -18.5333F, 11.0F, 1, 2, 9, 0.0F, true));
		Main49_r1.cubeList.add(new ModelBox(Main49_r1, 0, 0, -1.5F, -21.0F, 11.0F, 1, 3, 8, 0.0F, true));

		Main40_r1 = new ModelRenderer(this);
		Main40_r1.setRotationPoint(0.0F, 0.4601F, 0.2745F);
		main.addChild(Main40_r1);
		setRotationAngle(Main40_r1, 0.0175F, 0.0F, 0.0F);
		Main40_r1.cubeList.add(new ModelBox(Main40_r1, 0, 0, -2.5F, -15.5F, 26.5F, 1, 1, 3, 0.0F, true));

		Main28_r1 = new ModelRenderer(this);
		Main28_r1.setRotationPoint(0.0F, 6.1385F, 18.5725F);
		main.addChild(Main28_r1);
		setRotationAngle(Main28_r1, 0.6632F, 0.0F, 0.0F);
		Main28_r1.cubeList.add(new ModelBox(Main28_r1, 0, 0, -1.0F, -23.9F, 18.2F, 3, 1, 1, 0.0F, true));

		Main26_r1 = new ModelRenderer(this);
		Main26_r1.setRotationPoint(0.0F, -10.9278F, -5.2923F);
		main.addChild(Main26_r1);
		setRotationAngle(Main26_r1, -0.4363F, 0.0F, 0.0F);
		Main26_r1.cubeList.add(new ModelBox(Main26_r1, 0, 0, 2.2F, -17.4F, 22.0F, 1, 1, 4, 0.0F, true));

		Main21_r1 = new ModelRenderer(this);
		Main21_r1.setRotationPoint(-17.0919F, 0.0F, 8.7365F);
		main.addChild(Main21_r1);
		setRotationAngle(Main21_r1, 0.0F, 0.7854F, 0.0F);
		Main21_r1.cubeList.add(new ModelBox(Main21_r1, 0, 0, 1.0F, -22.5F, 25.0F, 2, 1, 1, 0.0F, true));

		Main20_r1 = new ModelRenderer(this);
		Main20_r1.setRotationPoint(-12.8492F, 0.0F, 6.9792F);
		main.addChild(Main20_r1);
		setRotationAngle(Main20_r1, 0.0F, 0.7854F, 0.0F);
		Main20_r1.cubeList.add(new ModelBox(Main20_r1, 0, 0, 2.0F, -22.5F, 18.0F, 1, 1, 2, 0.0F, true));

		Main11_r1 = new ModelRenderer(this);
		Main11_r1.setRotationPoint(6.2486F, 0.1461F, 0.0F);
		main.addChild(Main11_r1);
		setRotationAngle(Main11_r1, 0.0F, 0.0F, -0.384F);
		Main11_r1.cubeList.add(new ModelBox(Main11_r1, 0, 0, 2.5F, -16.0F, 13.5F, 7, 1, 4, 0.0F, true));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(stock);
		stock.cubeList.add(new ModelBox(stock, 200, 0, -2.5F, -19.0F, 36.5F, 6, 4, 30, 0.0F, true));
		stock.cubeList.add(new ModelBox(stock, 200, 0, -2.5F, -22.9F, 39.0F, 6, 4, 19, 0.0F, true));
		stock.cubeList.add(new ModelBox(stock, 200, 0, -1.5F, -24.6F, 39.0F, 4, 2, 19, 0.0F, true));
		stock.cubeList.add(new ModelBox(stock, 200, 0, -2.5F, -15.0F, 58.5F, 6, 7, 8, 0.0F, true));

		Main197Stock_r1 = new ModelRenderer(this);
		Main197Stock_r1.setRotationPoint(20.4856F, -13.4626F, 0.0F);
		stock.addChild(Main197Stock_r1);
		setRotationAngle(Main197Stock_r1, 0.0F, 0.0F, -1.041F);
		Main197Stock_r1.cubeList.add(new ModelBox(Main197Stock_r1, 200, 0, -3.5F, -24.6F, 39.0F, 2, 1, 19, 0.0F, true));

		Main196Stock_r1 = new ModelRenderer(this);
		Main196Stock_r1.setRotationPoint(-19.991F, -14.3255F, 0.0F);
		stock.addChild(Main196Stock_r1);
		setRotationAngle(Main196Stock_r1, 0.0F, 0.0F, 1.041F);
		Main196Stock_r1.cubeList.add(new ModelBox(Main196Stock_r1, 200, 0, 2.5F, -24.6F, 39.0F, 2, 1, 19, 0.0F, true));

		Main193Stock_r1 = new ModelRenderer(this);
		Main193Stock_r1.setRotationPoint(0.0F, 23.4519F, 45.3714F);
		stock.addChild(Main193Stock_r1);
		setRotationAngle(Main193Stock_r1, 1.4076F, 0.0F, 0.0F);
		Main193Stock_r1.cubeList.add(new ModelBox(Main193Stock_r1, 200, 0, -2.5F, -15.0F, 36.5F, 6, 17, 4, 0.0F, true));

		Main194Stock_r1 = new ModelRenderer(this);
		Main194Stock_r1.setRotationPoint(0.0F, -3.9543F, 117.4057F);
		stock.addChild(Main194Stock_r1);
		setRotationAngle(Main194Stock_r1, 2.9371F, 0.0F, 0.0F);
		Main194Stock_r1.cubeList.add(new ModelBox(Main194Stock_r1, 200, 0, -2.5F, -8.0F, 58.5F, 6, 7, 4, 0.0F, true));

		Main195Stock_r1 = new ModelRenderer(this);
		Main195Stock_r1.setRotationPoint(0.0F, 5.6408F, 107.9754F);
		stock.addChild(Main195Stock_r1);
		setRotationAngle(Main195Stock_r1, 2.714F, 0.0F, 0.0F);
		Main195Stock_r1.cubeList.add(new ModelBox(Main195Stock_r1, 200, 0, -2.5F, -8.9F, 54.6F, 6, 7, 12, 0.0F, true));

		ironsplach = new ModelRenderer(this);
		ironsplach.setRotationPoint(18.3898F, 0.0F, 7.2031F);
		main.addChild(ironsplach);
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -19.1898F, -32.0F, 18.7969F, 1, 3, 1, 0.0F, true));
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -17.5898F, -32.0F, 18.7969F, 1, 3, 1, 0.0F, true));
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -17.3898F, -28.7F, 18.7969F, 1, 2, 1, 0.0F, true));
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -19.3898F, -28.7F, 18.7969F, 1, 2, 1, 0.0F, true));
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -18.8898F, -27.7F, 18.5969F, 2, 2, 1, 0.0F, true));
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -18.8898F, -27.7F, 18.9969F, 2, 2, 1, 0.0F, true));
		ironsplach.cubeList.add(new ModelBox(ironsplach, 0, 0, -18.8898F, -32.0F, 18.7969F, 2, 1, 1, 0.0F, true));

		Main45IRONSPLACHLD_r1 = new ModelRenderer(this);
		Main45IRONSPLACHLD_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsplach.addChild(Main45IRONSPLACHLD_r1);
		setRotationAngle(Main45IRONSPLACHLD_r1, 0.0F, -0.7854F, 0.0F);
		Main45IRONSPLACHLD_r1.cubeList.add(new ModelBox(Main45IRONSPLACHLD_r1, 0, 0, 0.5F, -29.7F, 25.8F, 1, 2, 1, 0.0F, true));

		Main42IRONSPLACHLD_r1 = new ModelRenderer(this);
		Main42IRONSPLACHLD_r1.setRotationPoint(-44.779F, -24.037F, -7.2031F);
		ironsplach.addChild(Main42IRONSPLACHLD_r1);
		setRotationAngle(Main42IRONSPLACHLD_r1, 0.0F, 0.0F, 1.3384F);
		Main42IRONSPLACHLD_r1.cubeList.add(new ModelBox(Main42IRONSPLACHLD_r1, 0, 0, 1.0F, -28.7F, 26.0F, 1, 1, 1, 0.0F, true));

		Main41IRONSPLACHLD_r1 = new ModelRenderer(this);
		Main41IRONSPLACHLD_r1.setRotationPoint(8.7691F, -23.0641F, -7.2031F);
		ironsplach.addChild(Main41IRONSPLACHLD_r1);
		setRotationAngle(Main41IRONSPLACHLD_r1, 0.0F, 0.0F, -1.3384F);
		Main41IRONSPLACHLD_r1.cubeList.add(new ModelBox(Main41IRONSPLACHLD_r1, 0, 0, -1.0F, -28.7F, 26.0F, 1, 1, 1, 0.0F, true));

		barrelCov = new ModelRenderer(this);
		barrelCov.setRotationPoint(0.0F, 24.0F, 0.0F);
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, 4.0F, 1, 1, 6, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -18.0F, 1, 1, 3, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -20.0F, -18.0F, 1, 1, 28, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -18.0F, 1, 1, 3, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -18.0F, 1, 1, 3, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, 4.0F, 1, 1, 6, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, 2.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, 0.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -2.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -4.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -6.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -8.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -10.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -12.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 0.0F, -24.0F, -14.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, 0.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, 2.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -4.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -6.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -8.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -10.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -12.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 2.0F, -22.0F, -14.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, 4.0F, 1, 1, 6, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, 2.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, 0.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -4.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -6.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -8.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -10.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -12.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -2.0F, -22.0F, -14.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -1.0F, -23.0F, -18.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 1.0F, -23.0F, -18.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, -1.0F, -21.0F, -18.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 0, 0, 1.0F, -21.0F, -18.0F, 1, 1, 1, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 200, 0, -1.0F, -19.5F, -3.0F, 1, 6, 13, 0.0F, true));
		barrelCov.cubeList.add(new ModelBox(barrelCov, 200, 0, 1.0F, -19.5F, -3.0F, 1, 6, 13, 0.0F, true));

		Main68HandGuard_r1 = new ModelRenderer(this);
		Main68HandGuard_r1.setRotationPoint(-2.7333F, 0.0886F, 0.0F);
		barrelCov.addChild(Main68HandGuard_r1);
		setRotationAngle(Main68HandGuard_r1, 0.0F, 0.0F, 0.1396F);
		Main68HandGuard_r1.cubeList.add(new ModelBox(Main68HandGuard_r1, 200, 0, -2.0F, -19.6F, -3.0F, 2, 6, 13, 0.0F, true));

		Main67HandGuard_r1 = new ModelRenderer(this);
		Main67HandGuard_r1.setRotationPoint(2.7333F, 0.0886F, 0.0F);
		barrelCov.addChild(Main67HandGuard_r1);
		setRotationAngle(Main67HandGuard_r1, 0.0F, 0.0F, -0.1396F);
		Main67HandGuard_r1.cubeList.add(new ModelBox(Main67HandGuard_r1, 200, 0, 1.0F, -19.5F, -3.0F, 2, 6, 13, 0.0F, true));

		Main161BarrelCov_r1 = new ModelRenderer(this);
		Main161BarrelCov_r1.setRotationPoint(-15.1421F, -5.4437F, 0.0F);
		barrelCov.addChild(Main161BarrelCov_r1);
		setRotationAngle(Main161BarrelCov_r1, 0.0F, 0.0F, 0.7854F);
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -13.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -11.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -9.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -7.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -5.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -3.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -1.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, 1.0F, 1, 1, 1, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, 3.0F, 1, 1, 7, 0.0F, true));
		Main161BarrelCov_r1.cubeList.add(new ModelBox(Main161BarrelCov_r1, 0, 0, -0.8F, -20.9F, -18.0F, 1, 1, 4, 0.0F, true));

		Main152BarrelCov_r1 = new ModelRenderer(this);
		Main152BarrelCov_r1.setRotationPoint(-17.2635F, -6.3223F, 0.0F);
		barrelCov.addChild(Main152BarrelCov_r1);
		setRotationAngle(Main152BarrelCov_r1, 0.0F, 0.0F, 0.7854F);
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -13.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -11.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -9.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -7.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -5.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -3.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -1.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, 1.0F, 1, 1, 1, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, 3.0F, 1, 1, 7, 0.0F, true));
		Main152BarrelCov_r1.cubeList.add(new ModelBox(Main152BarrelCov_r1, 0, 0, -0.7F, -23.8F, -18.0F, 1, 1, 4, 0.0F, true));

		Main143BarrelCov_r1 = new ModelRenderer(this);
		Main143BarrelCov_r1.setRotationPoint(-14.2635F, -7.565F, 0.0F);
		barrelCov.addChild(Main143BarrelCov_r1);
		setRotationAngle(Main143BarrelCov_r1, 0.0F, 0.0F, 0.7854F);
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, 1.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -1.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -3.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -5.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -7.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -9.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -11.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -13.0F, 1, 1, 1, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, 3.0F, 1, 1, 7, 0.0F, true));
		Main143BarrelCov_r1.cubeList.add(new ModelBox(Main143BarrelCov_r1, 0, 0, 2.1F, -20.8F, -18.0F, 1, 1, 4, 0.0F, true));

		Main133BarrelCov_r1 = new ModelRenderer(this);
		Main133BarrelCov_r1.setRotationPoint(-16.1019F, -8.3265F, 0.0F);
		barrelCov.addChild(Main133BarrelCov_r1);
		setRotationAngle(Main133BarrelCov_r1, 0.0F, 0.0F, 0.7854F);
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, 1.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -1.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -3.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -5.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -7.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -9.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -11.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -13.0F, 1, 1, 1, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, -18.0F, 1, 1, 4, 0.0F, true));
		Main133BarrelCov_r1.cubeList.add(new ModelBox(Main133BarrelCov_r1, 0, 0, 2.0F, -23.6F, 3.0F, 1, 1, 7, 0.0F, true));

		Main121BarrelCov_r1 = new ModelRenderer(this);
		Main121BarrelCov_r1.setRotationPoint(7.0618F, -1.9505F, 0.0F);
		barrelCov.addChild(Main121BarrelCov_r1);
		setRotationAngle(Main121BarrelCov_r1, 0.0F, 0.0F, -0.3491F);
		Main121BarrelCov_r1.cubeList.add(new ModelBox(Main121BarrelCov_r1, 0, 0, -2.0F, -21.0F, -18.0F, 1, 1, 28, 0.0F, true));

		Main120BarrelCov_r1 = new ModelRenderer(this);
		Main120BarrelCov_r1.setRotationPoint(7.8382F, -0.7473F, 0.0F);
		barrelCov.addChild(Main120BarrelCov_r1);
		setRotationAngle(Main120BarrelCov_r1, 0.0F, 0.0F, -0.3491F);
		Main120BarrelCov_r1.cubeList.add(new ModelBox(Main120BarrelCov_r1, 0, 0, 1.7F, -22.6F, -18.0F, 1, 1, 28, 0.0F, true));

		Main119BarrelCov_r1 = new ModelRenderer(this);
		Main119BarrelCov_r1.setRotationPoint(-7.1926F, -2.0088F, 0.0F);
		barrelCov.addChild(Main119BarrelCov_r1);
		setRotationAngle(Main119BarrelCov_r1, 0.0F, 0.0F, 0.3491F);
		Main119BarrelCov_r1.cubeList.add(new ModelBox(Main119BarrelCov_r1, 0, 0, 2.1F, -21.4F, -18.0F, 1, 1, 28, 0.0F, true));

		Main118BarrelCov_r1 = new ModelRenderer(this);
		Main118BarrelCov_r1.setRotationPoint(-7.963F, -0.8398F, 0.0F);
		barrelCov.addChild(Main118BarrelCov_r1);
		setRotationAngle(Main118BarrelCov_r1, 0.0F, 0.0F, 0.3491F);
		Main118BarrelCov_r1.cubeList.add(new ModelBox(Main118BarrelCov_r1, 0, 0, -1.6F, -23.0F, -18.0F, 1, 1, 28, 0.0F, true));

		Main117BarrelCov_r1 = new ModelRenderer(this);
		Main117BarrelCov_r1.setRotationPoint(6.8766F, -1.0009F, 0.0F);
		barrelCov.addChild(Main117BarrelCov_r1);
		setRotationAngle(Main117BarrelCov_r1, 0.0F, 0.0F, -0.3491F);
		Main117BarrelCov_r1.cubeList.add(new ModelBox(Main117BarrelCov_r1, 0, 0, 0.6F, -20.0F, -18.0F, 1, 1, 28, 0.0F, true));

		Main116BarrelCov_r1 = new ModelRenderer(this);
		Main116BarrelCov_r1.setRotationPoint(-6.9792F, -1.019F, 0.0F);
		barrelCov.addChild(Main116BarrelCov_r1);
		setRotationAngle(Main116BarrelCov_r1, 0.0F, 0.0F, 0.3491F);
		Main116BarrelCov_r1.cubeList.add(new ModelBox(Main116BarrelCov_r1, 0, 0, -0.6F, -20.3F, -18.0F, 1, 1, 28, 0.0F, true));

		Main115BarrelCov_r1 = new ModelRenderer(this);
		Main115BarrelCov_r1.setRotationPoint(8.0516F, -1.7371F, 0.0F);
		barrelCov.addChild(Main115BarrelCov_r1);
		setRotationAngle(Main115BarrelCov_r1, 0.0F, 0.0F, -0.3491F);
		Main115BarrelCov_r1.cubeList.add(new ModelBox(Main115BarrelCov_r1, 0, 0, -0.9F, -23.6F, -18.0F, 1, 1, 28, 0.0F, true));

		Main114BarrelCov_r1 = new ModelRenderer(this);
		Main114BarrelCov_r1.setRotationPoint(-8.1482F, -1.7894F, 0.0F);
		barrelCov.addChild(Main114BarrelCov_r1);
		setRotationAngle(Main114BarrelCov_r1, 0.0F, 0.0F, 0.3491F);
		Main114BarrelCov_r1.cubeList.add(new ModelBox(Main114BarrelCov_r1, 0, 0, 1.0F, -24.0F, -18.0F, 1, 1, 28, 0.0F, true));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrelCov.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -1.0F, -22.0F, -53.0F, 1, 1, 35, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, 0.0F, -23.0F, -53.0F, 1, 1, 35, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, 0.0F, -21.0F, -53.0F, 1, 1, 35, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, 1.0F, -22.0F, -53.0F, 1, 1, 35, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, 0.0F, -23.0F, -18.0F, 1, 1, 28, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, 0.0F, -21.0F, -18.0F, 1, 1, 28, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -1.0F, -22.0F, -18.0F, 1, 1, 28, 0.0F, true));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, 1.0F, -22.0F, -18.0F, 1, 1, 28, 0.0F, true));

		Main178Barrel_r1 = new ModelRenderer(this);
		Main178Barrel_r1.setRotationPoint(14.1421F, -34.1421F, 0.0F);
		barrel.addChild(Main178Barrel_r1);
		setRotationAngle(Main178Barrel_r1, 0.0F, 0.0F, -2.3562F);
		Main178Barrel_r1.cubeList.add(new ModelBox(Main178Barrel_r1, 0, 0, 0.4F, -20.0F, -53.0F, 1, 1, 35, 0.0F, true));
		Main178Barrel_r1.cubeList.add(new ModelBox(Main178Barrel_r1, 0, 0, 0.0F, -20.0F, -53.0F, 1, 1, 35, 0.0F, true));

		Main177Barrel_r1 = new ModelRenderer(this);
		Main177Barrel_r1.setRotationPoint(15.8492F, -33.435F, 0.0F);
		barrel.addChild(Main177Barrel_r1);
		setRotationAngle(Main177Barrel_r1, 0.0F, 0.0F, -2.3562F);
		Main177Barrel_r1.cubeList.add(new ModelBox(Main177Barrel_r1, 0, 0, 1.0F, -19.6F, -53.0F, 1, 1, 35, 0.0F, true));
		Main177Barrel_r1.cubeList.add(new ModelBox(Main177Barrel_r1, 0, 0, 1.0F, -20.0F, -53.0F, 1, 1, 35, 0.0F, true));

		Main174Barrel_r1 = new ModelRenderer(this);
		Main174Barrel_r1.setRotationPoint(-16.2635F, -6.7365F, 0.0F);
		barrel.addChild(Main174Barrel_r1);
		setRotationAngle(Main174Barrel_r1, 0.0F, 0.0F, 0.7854F);
		Main174Barrel_r1.cubeList.add(new ModelBox(Main174Barrel_r1, 0, 0, 0.0F, -22.6F, -53.0F, 1, 1, 35, 0.0F, true));
		Main174Barrel_r1.cubeList.add(new ModelBox(Main174Barrel_r1, 0, 0, 0.0F, -23.0F, -53.0F, 1, 1, 35, 0.0F, true));

		Main172Barrel_r1 = new ModelRenderer(this);
		Main172Barrel_r1.setRotationPoint(-15.9706F, -7.4437F, 0.0F);
		barrel.addChild(Main172Barrel_r1);
		setRotationAngle(Main172Barrel_r1, 0.0F, 0.0F, 0.7854F);
		Main172Barrel_r1.cubeList.add(new ModelBox(Main172Barrel_r1, 0, 0, 1.4F, -23.0F, -53.0F, 1, 1, 35, 0.0F, true));
		Main172Barrel_r1.cubeList.add(new ModelBox(Main172Barrel_r1, 0, 0, 1.0F, -23.0F, -53.0F, 1, 1, 35, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		main.render(f5);
		barrelCov.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
