package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60 extends ModelWithAttachments {
	private final ModelRenderer body;
	private final ModelRenderer bone;
	private final ModelRenderer Main59_r1;
	private final ModelRenderer Main41_r1;
	private final ModelRenderer Main40_r1;
	private final ModelRenderer Main39_r1;
	private final ModelRenderer Main38_r1;
	private final ModelRenderer Main37_r1;
	private final ModelRenderer Main35_r1;
	private final ModelRenderer Main28_r1;
	private final ModelRenderer Main19_r1;
	private final ModelRenderer Main18_r1;
	private final ModelRenderer Main17_r1;
	private final ModelRenderer carryHandle;
	private final ModelRenderer Main77_r1;
	private final ModelRenderer Main79_r1;
	private final ModelRenderer Main81_r1;
	private final ModelRenderer Main83_r1;
	private final ModelRenderer Main82_r1;
	private final ModelRenderer grip;
	private final ModelRenderer Grip14_r1;
	private final ModelRenderer Grip13_r1;
	private final ModelRenderer Grip12_r1;
	private final ModelRenderer Grip9_r1;
	private final ModelRenderer Grip2_r1;
	private final ModelRenderer Stock;
	private final ModelRenderer Stock8_r1;
	private final ModelRenderer Stock7_r1;
	private final ModelRenderer Stock5_r1;
	private final ModelRenderer Stock2_r1;
	private final ModelRenderer Stock2_r2;
	private final ModelRenderer Stock1_r1;
	private final ModelRenderer Stock1_r2;
	private final ModelRenderer barrel;
	private final ModelRenderer Barrel20_r1;
	private final ModelRenderer Barrel19_r1;
	private final ModelRenderer Barrel18_r1;
	private final ModelRenderer Barrel17_r1;
	private final ModelRenderer Barrel12_r1;
	private final ModelRenderer Barrel11_r1;
	private final ModelRenderer muzzle;
	private final ModelRenderer Muzzle8_r1;
	private final ModelRenderer Muzzle7_r1;
	private final ModelRenderer Muzzle6_r1;
	private final ModelRenderer Muzzle5_r1;
	private final ModelRenderer frontsight;
	private final ModelRenderer IronsightFront25_r1;
	private final ModelRenderer IronsightFront23_r1;
	private final ModelRenderer IronsightFront18_r1;
	private final ModelRenderer IronsightFront17_r1;
	private final ModelRenderer IronsightFront12_r1;
	private final ModelRenderer IronsightFront11_r1;
	private final ModelRenderer IronsightFront6_r1;
	private final ModelRenderer IronsightFront3_r1;

	public M60() {
		textureWidth = 330;
		textureHeight = 330;

		body = new ModelRenderer(this);
		body.setRotationPoint(21.7851F, -9.6811F, -53.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-22.7851F, 11.6811F, 0.0F);
		body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 72, 96, 0.0F, -19.5F, 19.2F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 56, 111, -0.5F, -15.5F, 1.0F, 2, 2, 23, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 86, 37, 1.0F, -17.5F, 23.0F, 2, 2, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 82, -0.5F, -19.0F, 23.0F, 2, 2, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 67, -0.5F, -16.0F, 24.0F, 2, 2, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 86, 25, -2.0F, -17.5F, 23.0F, 2, 2, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 86, 0, -3.0F, -18.0F, 33.0F, 7, 10, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 82, 81, -1.5F, -12.5F, 24.0F, 4, 2, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 56, 81, -0.5F, -14.5F, 24.0F, 2, 5, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 166, 167, -3.0F, -11.0F, 36.0F, 7, 2, 45, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 171, 214, 3.0F, -18.0F, 38.0F, 1, 2, 43, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 141, 37, -2.4F, -20.0F, 33.0F, 4, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 110, 0.9F, -20.0F, 33.0F, 3, 4, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 148, 259, -3.0F, -20.0F, 52.0F, 1, 5, 29, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 141, 18, -3.0F, -23.0F, 35.0F, 6, 3, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, 5.0F, -17.5F, 38.0F, 1, 12, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 218, 104, -3.0F, -18.0F, 37.0F, 1, 1, 15, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 216, 214, -1.0F, -17.0F, 38.0F, 4, 1, 41, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 96, 64, -2.0F, -18.0F, 79.0F, 5, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 75, 194, -2.8F, -17.0F, 37.0F, 1, 2, 15, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 222, 0, 1.5F, -18.0F, 45.0F, 2, 1, 34, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 70, 221, -2.5F, -18.0F, 45.0F, 2, 1, 34, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 56, 106, -3.0F, -20.0F, 47.3F, 6, 2, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 92, -2.5F, -23.5F, 34.5F, 1, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 112, 123, -3.3F, -13.0F, 64.0F, 1, 3, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 75, 81, -3.1F, -22.5F, 35.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 109, 253, 3.4F, -11.5F, 39.0F, 1, 2, 33, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 225, 163, 3.4F, -14.5F, 39.0F, 1, 3, 33, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 135, 3.4F, -18.0F, 33.0F, 1, 9, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 255, 87, 3.4F, -17.5F, 39.0F, 1, 3, 32, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 110, 3.4F, -17.5F, 71.0F, 1, 3, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 69, 81, 3.6F, -13.0F, 63.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 33, 81, 3.6F, -13.0F, 49.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 80, 136, -3.4F, -18.0F, 33.0F, 1, 10, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 131, 216, -3.3F, -15.0F, 37.0F, 1, 2, 35, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 42, 55, -3.4F, -18.0F, 52.0F, 1, 2, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 82, 92, -3.4F, -18.0F, 71.0F, 1, 3, 10, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 81, -3.4F, -14.5F, 67.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 81, -3.4F, -14.5F, 54.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 81, -3.4F, -14.5F, 40.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 51, -3.5F, -16.0F, 34.0F, 8, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 51, -3.5F, -14.0F, 34.0F, 8, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 222, 51, 3.0F, -20.0F, 47.0F, 1, 2, 34, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 81, 3.1F, -22.5F, 35.5F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 137, 74, -2.4F, -19.7F, 29.0F, 5, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 104, -2.4F, -19.0F, 29.0F, 5, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 72, 33, -2.4F, -20.0F, 29.0F, 5, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 82, 62, -3.4F, -16.5F, 52.0F, 1, 1, 5, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 218, 104, -3.3F, -15.5F, 37.0F, 1, 1, 35, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 179, 259, -3.2F, -11.5F, 37.0F, 1, 1, 27, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 216, 214, -3.0F, -16.0F, 37.0F, 1, 1, 15, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 82, 81, 2.5F, -23.5F, 34.5F, 1, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 72, 6, -1.5F, -19.3F, 23.2F, 4, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 96, -1.5F, -19.5F, 23.7F, 4, 1, 1, -0.002F, false));
		bone.cubeList.add(new ModelBox(bone, 44, 97, -0.5F, -20.3F, 23.2F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 97, -0.5F, -20.7F, 23.2F, 2, 1, 2, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 103, 82, 0.0F, -20.9F, 23.2F, 1, 1, 2, -0.002F, false));
		bone.cubeList.add(new ModelBox(bone, 60, 6, -1.0F, -18.3F, 19.2F, 3, 2, 2, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 96, -0.2F, -19.3F, 19.2F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 67, 95, 0.2F, -19.3F, 19.2F, 1, 1, 3, 0.0F, false));

		Main59_r1 = new ModelRenderer(this);
		Main59_r1.setRotationPoint(-41.6586F, 0.0F, 29.299F);
		bone.addChild(Main59_r1);
		setRotationAngle(Main59_r1, 0.0F, 1.3756F, 0.0F);
		Main59_r1.cubeList.add(new ModelBox(Main59_r1, 12, 98, -3.0F, -20.0F, 40.0F, 3, 2, 1, 0.0F, false));

		Main41_r1 = new ModelRenderer(this);
		Main41_r1.setRotationPoint(7.5184F, -2.3912F, 0.0F);
		bone.addChild(Main41_r1);
		setRotationAngle(Main41_r1, 0.0F, 0.0F, -0.7679F);
		Main41_r1.cubeList.add(new ModelBox(Main41_r1, 116, 10, 0.8F, -10.3F, 24.0F, 1, 1, 9, 0.0F, false));

		Main40_r1 = new ModelRenderer(this);
		Main40_r1.setRotationPoint(6.8729F, -3.9889F, 0.0F);
		bone.addChild(Main40_r1);
		setRotationAngle(Main40_r1, 0.0F, 0.0F, -0.7679F);
		Main40_r1.cubeList.add(new ModelBox(Main40_r1, 116, 24, -1.5F, -10.3F, 24.0F, 1, 1, 9, 0.0F, false));

		Main39_r1 = new ModelRenderer(this);
		Main39_r1.setRotationPoint(9.4488F, -3.4135F, 0.0F);
		bone.addChild(Main39_r1);
		setRotationAngle(Main39_r1, 0.0F, 0.0F, -0.7679F);
		Main39_r1.cubeList.add(new ModelBox(Main39_r1, 112, 93, 0.4F, -13.4F, 24.0F, 1, 2, 9, 0.0F, false));

		Main38_r1 = new ModelRenderer(this);
		Main38_r1.setRotationPoint(-9.7252F, -3.9292F, 0.0F);
		bone.addChild(Main38_r1);
		setRotationAngle(Main38_r1, 0.0F, 0.0F, 0.7679F);
		Main38_r1.cubeList.add(new ModelBox(Main38_r1, 112, 112, -0.1F, -14.0F, 24.0F, 1, 2, 9, 0.0F, false));

		Main37_r1 = new ModelRenderer(this);
		Main37_r1.setRotationPoint(12.8037F, -4.8892F, 0.0F);
		bone.addChild(Main37_r1);
		setRotationAngle(Main37_r1, 0.0F, 0.0F, -0.7854F);
		Main37_r1.cubeList.add(new ModelBox(Main37_r1, 26, 110, -3.0F, -17.9F, 23.0F, 1, 2, 10, 0.0F, false));
		Main37_r1.cubeList.add(new ModelBox(Main37_r1, 56, 111, 1.0F, -17.9F, 23.0F, 1, 2, 10, 0.0F, false));

		Main35_r1 = new ModelRenderer(this);
		Main35_r1.setRotationPoint(11.9836F, -6.8691F, 0.0F);
		bone.addChild(Main35_r1);
		setRotationAngle(Main35_r1, 0.0F, 0.0F, -0.7854F);
		Main35_r1.cubeList.add(new ModelBox(Main35_r1, 0, 79, -2.3F, -14.4F, 23.0F, 2, 2, 10, 0.0F, false));
		Main35_r1.cubeList.add(new ModelBox(Main35_r1, 30, 13, -2.3F, -17.4F, 23.0F, 2, 1, 10, 0.0F, false));

		Main28_r1 = new ModelRenderer(this);
		Main28_r1.setRotationPoint(1.5144F, -0.2869F, 0.0F);
		bone.addChild(Main28_r1);
		setRotationAngle(Main28_r1, 0.0F, 0.0F, -0.0744F);
		Main28_r1.cubeList.add(new ModelBox(Main28_r1, 0, 79, -3.1F, -20.5F, 40.0F, 1, 3, 1, 0.0F, false));

		Main19_r1 = new ModelRenderer(this);
		Main19_r1.setRotationPoint(9.6513F, 0.0F, 0.1736F);
		bone.addChild(Main19_r1);
		setRotationAngle(Main19_r1, 0.0F, -0.2094F, 0.0F);
		Main19_r1.cubeList.add(new ModelBox(Main19_r1, 60, 14, 4.0F, -21.0F, 46.0F, 2, 3, 1, 0.0F, false));

		Main18_r1 = new ModelRenderer(this);
		Main18_r1.setRotationPoint(-7.6053F, 0.0F, 1.6402F);
		bone.addChild(Main18_r1);
		setRotationAngle(Main18_r1, 0.0F, 0.2094F, 0.0F);
		Main18_r1.cubeList.add(new ModelBox(Main18_r1, 82, 98, 3.0F, -21.0F, 37.0F, 3, 3, 1, 0.0F, false));

		Main17_r1 = new ModelRenderer(this);
		Main17_r1.setRotationPoint(-3.9466F, -1.3611F, 0.0F);
		bone.addChild(Main17_r1);
		setRotationAngle(Main17_r1, 0.0F, 0.0F, 0.2269F);
		Main17_r1.cubeList.add(new ModelBox(Main17_r1, 25, 135, 4.0F, -18.0F, 38.0F, 2, 1, 8, 0.0F, false));

		carryHandle = new ModelRenderer(this);
		carryHandle.setRotationPoint(-25.1901F, -7.7495F, 18.7714F);
		body.addChild(carryHandle);
		

		Main77_r1 = new ModelRenderer(this);
		Main77_r1.setRotationPoint(7.6501F, 18.9327F, -18.7714F);
		carryHandle.addChild(Main77_r1);
		setRotationAngle(Main77_r1, 0.0F, 0.0F, -0.2231F);
		Main77_r1.cubeList.add(new ModelBox(Main77_r1, 151, 0, -1.1F, -19.2F, 14.2F, 1, 1, 6, 0.0F, false));

		Main79_r1 = new ModelRenderer(this);
		Main79_r1.setRotationPoint(6.5501F, 19.1327F, -18.7714F);
		carryHandle.addChild(Main79_r1);
		setRotationAngle(Main79_r1, 0.0F, 0.0F, -0.2231F);
		Main79_r1.cubeList.add(new ModelBox(Main79_r1, 42, 62, 0.9F, -19.2F, 14.7F, 5, 1, 1, 0.0F, false));
		Main79_r1.cubeList.add(new ModelBox(Main79_r1, 72, 31, 0.9F, -19.2F, 14.2F, 5, 1, 1, 0.0F, false));

		Main81_r1 = new ModelRenderer(this);
		Main81_r1.setRotationPoint(-13.0594F, 0.1791F, -18.7714F);
		carryHandle.addChild(Main81_r1);
		setRotationAngle(Main81_r1, 0.0F, 0.0F, 1.2641F);
		Main81_r1.cubeList.add(new ModelBox(Main81_r1, 80, 136, 5.6F, -19.9F, 14.2F, 1, 1, 14, 0.0F, false));
		Main81_r1.cubeList.add(new ModelBox(Main81_r1, 0, 220, 5.1F, -20.9F, 14.2F, 2, 1, 14, 0.0F, false));

		Main83_r1 = new ModelRenderer(this);
		Main83_r1.setRotationPoint(26.0901F, 7.9495F, -18.7714F);
		carryHandle.addChild(Main83_r1);
		setRotationAngle(Main83_r1, 0.0F, 0.0F, -1.45F);
		Main83_r1.cubeList.add(new ModelBox(Main83_r1, 136, 136, 4.8F, -19.7F, 14.2F, 1, 1, 14, 0.0F, false));

		Main82_r1 = new ModelRenderer(this);
		Main82_r1.setRotationPoint(-9.9771F, 10.7085F, -18.7714F);
		carryHandle.addChild(Main82_r1);
		setRotationAngle(Main82_r1, 0.0F, 0.0F, 0.7808F);
		Main82_r1.cubeList.add(new ModelBox(Main82_r1, 24, 165, 4.2F, -20.6F, 14.2F, 1, 1, 14, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(-22.7851F, 56.5931F, 23.3836F);
		body.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 166, 167, -1.8F, -54.4121F, 13.6164F, 4, 3, 18, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 82, 69, -1.0F, -51.9121F, 15.6164F, 3, 4, 1, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 141, 31, -1.0F, -48.4121F, 16.1164F, 3, 1, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 26, 92, -2.0F, -52.3121F, 23.1164F, 5, 1, 8, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 172, 19, 1.8F, -54.4121F, 13.6164F, 1, 3, 18, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 141, 24, -2.0F, -51.3121F, 23.1164F, 5, 3, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, 0.0F, -51.9121F, 20.1164F, 1, 4, 4, 0.0F, false));

		Grip14_r1 = new ModelRenderer(this);
		Grip14_r1.setRotationPoint(0.0F, 0.9F, 0.4F);
		grip.addChild(Grip14_r1);
		setRotationAngle(Grip14_r1, 1.1053F, 0.0F, 0.0F);
		Grip14_r1.cubeList.add(new ModelBox(Grip14_r1, 34, 51, -2.0F, 3.5F, 48.1F, 5, 1, 2, 0.0F, false));

		Grip13_r1 = new ModelRenderer(this);
		Grip13_r1.setRotationPoint(0.0F, -94.8681F, 4.2884F);
		grip.addChild(Grip13_r1);
		setRotationAngle(Grip13_r1, -1.2741F, 0.0F, 0.0F);
		Grip13_r1.cubeList.add(new ModelBox(Grip13_r1, 12, 7, -2.0F, -5.0F, 58.0F, 5, 1, 1, 0.0F, false));

		Grip12_r1 = new ModelRenderer(this);
		Grip12_r1.setRotationPoint(0.0F, -4.9269F, 34.5887F);
		grip.addChild(Grip12_r1);
		setRotationAngle(Grip12_r1, 1.8218F, 0.0F, 0.0F);
		Grip12_r1.cubeList.add(new ModelBox(Grip12_r1, 56, 95, -1.0F, -2.5F, 44.5F, 3, 3, 1, 0.0F, false));

		Grip9_r1 = new ModelRenderer(this);
		Grip9_r1.setRotationPoint(0.0F, -97.6898F, 54.5391F);
		grip.addChild(Grip9_r1);
		setRotationAngle(Grip9_r1, -2.1935F, 0.0F, 0.0F);
		Grip9_r1.cubeList.add(new ModelBox(Grip9_r1, 40, 87, -2.0F, -6.4F, 52.5F, 5, 2, 2, 0.0F, false));

		Grip2_r1 = new ModelRenderer(this);
		Grip2_r1.setRotationPoint(0.0F, -95.7681F, 3.8884F);
		grip.addChild(Grip2_r1);
		setRotationAngle(Grip2_r1, -1.2741F, 0.0F, 0.0F);
		Grip2_r1.cubeList.add(new ModelBox(Grip2_r1, 168, 216, -2.0F, -10.0F, 49.0F, 5, 5, 11, 0.001F, false));

		Stock = new ModelRenderer(this);
		Stock.setRotationPoint(-22.7851F, 11.6811F, 0.0F);
		body.addChild(Stock);
		Stock.cubeList.add(new ModelBox(Stock, 26, 25, -3.5F, -21.3F, 84.0F, 8, 13, 5, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 168, 112, -3.5F, -18.0F, 72.0F, 8, 9, 12, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 82, 69, -2.0F, -22.3F, 81.0F, 5, 3, 8, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 30, 0, -3.0F, -9.0F, 84.0F, 7, 8, 5, -0.001F, false));
		Stock.cubeList.add(new ModelBox(Stock, 80, 166, -2.5F, -9.5F, 72.0F, 6, 1, 9, 0.0F, false));
		Stock.cubeList.add(new ModelBox(Stock, 56, 123, -3.5F, -21.3F, 81.0F, 8, 4, 3, 0.0F, false));

		Stock8_r1 = new ModelRenderer(this);
		Stock8_r1.setRotationPoint(-11.2595F, -9.8311F, 0.0F);
		Stock.addChild(Stock8_r1);
		setRotationAngle(Stock8_r1, 0.0F, 0.0F, 2.0077F);
		Stock8_r1.cubeList.add(new ModelBox(Stock8_r1, 26, 79, -3.5F, -8.5F, 72.0F, 1, 1, 12, 0.0F, false));

		Stock7_r1 = new ModelRenderer(this);
		Stock7_r1.setRotationPoint(12.6826F, -8.9249F, 0.0F);
		Stock.addChild(Stock7_r1);
		setRotationAngle(Stock7_r1, 0.0F, 0.0F, -2.0076F);
		Stock7_r1.cubeList.add(new ModelBox(Stock7_r1, 82, 56, 3.5F, -8.5F, 72.0F, 1, 1, 12, 0.0F, false));

		Stock5_r1 = new ModelRenderer(this);
		Stock5_r1.setRotationPoint(0.0F, 49.0818F, 151.4449F);
		Stock.addChild(Stock5_r1);
		setRotationAngle(Stock5_r1, 2.491F, 0.0F, 0.0F);
		Stock5_r1.cubeList.add(new ModelBox(Stock5_r1, 172, 0, -3.0F, -1.0F, 84.0F, 7, 6, 13, 0.0F, false));

		Stock2_r1 = new ModelRenderer(this);
		Stock2_r1.setRotationPoint(-3.7F, -17.0F, 73.5F);
		Stock.addChild(Stock2_r1);
		setRotationAngle(Stock2_r1, -0.0436F, 0.0F, 0.0F);
		Stock2_r1.cubeList.add(new ModelBox(Stock2_r1, 0, 0, -0.5F, -1.5F, -0.1F, 1, 3, 1, -0.2F, false));

		Stock2_r2 = new ModelRenderer(this);
		Stock2_r2.setRotationPoint(-4.0F, -17.0F, 73.5F);
		Stock.addChild(Stock2_r2);
		setRotationAngle(Stock2_r2, 0.1309F, 0.0F, 0.0F);
		Stock2_r2.cubeList.add(new ModelBox(Stock2_r2, 6, 0, -0.2F, -1.5F, -0.5F, 1, 3, 1, -0.2F, false));

		Stock1_r1 = new ModelRenderer(this);
		Stock1_r1.setRotationPoint(-2.4886F, -21.3363F, 85.0F);
		Stock.addChild(Stock1_r1);
		setRotationAngle(Stock1_r1, 0.0F, 0.0F, 0.9687F);
		Stock1_r1.cubeList.add(new ModelBox(Stock1_r1, 137, 65, -0.5F, -0.1F, -4.0F, 1, 1, 8, 0.0F, false));
		Stock1_r1.cubeList.add(new ModelBox(Stock1_r1, 137, 56, -0.5F, -0.9F, -4.0F, 1, 1, 8, 0.0F, false));

		Stock1_r2 = new ModelRenderer(this);
		Stock1_r2.setRotationPoint(3.4317F, -21.3414F, 81.5F);
		Stock.addChild(Stock1_r2);
		setRotationAngle(Stock1_r2, 0.0F, 0.0F, -0.9163F);
		Stock1_r2.cubeList.add(new ModelBox(Stock1_r2, 137, 82, -0.5F, -0.1F, -0.5F, 1, 1, 8, 0.0F, false));
		Stock1_r2.cubeList.add(new ModelBox(Stock1_r2, 137, 91, -0.5F, -0.9F, -0.5F, 1, 1, 8, 0.0F, false));

		barrel = new ModelRenderer(this);
		barrel.setRotationPoint(-22.7851F, 11.6811F, 0.0F);
		body.addChild(barrel);
		barrel.cubeList.add(new ModelBox(barrel, 56, 166, 0.0F, -16.0F, -30.0F, 1, 1, 54, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 0, -1.0F, -17.0F, -30.0F, 3, 1, 54, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 172, 0, 0.0F, -13.0F, -24.0F, 1, 3, 48, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 168, 55, -1.0F, -12.0F, -24.0F, 3, 1, 48, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 100, 37, 0.0F, -12.5F, -30.0F, 1, 2, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 37, 135, -0.5F, -12.0F, -30.0F, 2, 1, 6, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 75, 39, -0.5F, -16.0F, -21.0F, 2, 4, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 0, 25, -0.5F, -16.0F, -14.0F, 2, 4, 2, 0.0F, false));
		barrel.cubeList.add(new ModelBox(barrel, 116, 0, 0.0F, -18.0F, -30.0F, 1, 1, 54, 0.0F, false));

		Barrel20_r1 = new ModelRenderer(this);
		Barrel20_r1.setRotationPoint(12.3137F, -24.8995F, 0.0F);
		barrel.addChild(Barrel20_r1);
		setRotationAngle(Barrel20_r1, 0.0F, 0.0F, -2.3562F);
		Barrel20_r1.cubeList.add(new ModelBox(Barrel20_r1, 0, 55, 1.0F, -14.6F, -30.0F, 1, 1, 54, 0.0F, false));
		Barrel20_r1.cubeList.add(new ModelBox(Barrel20_r1, 56, 111, 1.0F, -15.0F, -30.0F, 1, 1, 54, 0.0F, false));

		Barrel19_r1 = new ModelRenderer(this);
		Barrel19_r1.setRotationPoint(10.6066F, -25.6066F, 0.0F);
		barrel.addChild(Barrel19_r1);
		setRotationAngle(Barrel19_r1, 0.0F, 0.0F, -2.3562F);
		Barrel19_r1.cubeList.add(new ModelBox(Barrel19_r1, 56, 56, 0.4F, -15.0F, -30.0F, 1, 1, 54, 0.0F, false));
		Barrel19_r1.cubeList.add(new ModelBox(Barrel19_r1, 112, 57, 0.0F, -15.0F, -30.0F, 1, 1, 54, 0.0F, false));

		Barrel18_r1 = new ModelRenderer(this);
		Barrel18_r1.setRotationPoint(-12.435F, -5.9792F, 0.0F);
		barrel.addChild(Barrel18_r1);
		setRotationAngle(Barrel18_r1, 0.0F, 0.0F, 0.7854F);
		Barrel18_r1.cubeList.add(new ModelBox(Barrel18_r1, 60, 1, 1.4F, -18.0F, -30.0F, 1, 1, 54, 0.0F, false));
		Barrel18_r1.cubeList.add(new ModelBox(Barrel18_r1, 0, 165, 1.0F, -18.0F, -30.0F, 1, 1, 54, 0.0F, false));

		Barrel17_r1 = new ModelRenderer(this);
		Barrel17_r1.setRotationPoint(12.7279F, -5.2721F, 0.0F);
		barrel.addChild(Barrel17_r1);
		setRotationAngle(Barrel17_r1, 0.0F, 0.0F, -0.7854F);
		Barrel17_r1.cubeList.add(new ModelBox(Barrel17_r1, 0, 110, -1.4F, -18.0F, -30.0F, 1, 1, 54, 0.0F, false));
		Barrel17_r1.cubeList.add(new ModelBox(Barrel17_r1, 112, 112, -1.0F, -18.0F, -30.0F, 1, 1, 54, 0.0F, false));

		Barrel12_r1 = new ModelRenderer(this);
		Barrel12_r1.setRotationPoint(8.1924F, -4.2218F, 0.0F);
		barrel.addChild(Barrel12_r1);
		setRotationAngle(Barrel12_r1, 0.0F, 0.0F, -0.7854F);
		Barrel12_r1.cubeList.add(new ModelBox(Barrel12_r1, 168, 112, -0.8F, -12.0F, -24.0F, 1, 3, 48, 0.0F, false));

		Barrel11_r1 = new ModelRenderer(this);
		Barrel11_r1.setRotationPoint(7.4853F, -3.9289F, 0.0F);
		barrel.addChild(Barrel11_r1);
		setRotationAngle(Barrel11_r1, 0.0F, 0.0F, -0.7854F);
		Barrel11_r1.cubeList.add(new ModelBox(Barrel11_r1, 112, 167, -1.0F, -10.8F, -24.0F, 3, 1, 48, 0.0F, false));

		muzzle = new ModelRenderer(this);
		muzzle.setRotationPoint(0.0F, 0.0F, 0.0F);
		barrel.addChild(muzzle);
		muzzle.cubeList.add(new ModelBox(muzzle, 141, 9, 1.5F, -17.0F, -38.0F, 1, 1, 8, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 141, 0, 0.0F, -18.5F, -38.0F, 1, 1, 8, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 137, 121, 0.0F, -15.5F, -38.0F, 1, 1, 8, 0.0F, false));
		muzzle.cubeList.add(new ModelBox(muzzle, 137, 112, -1.5F, -17.0F, -38.0F, 1, 1, 8, 0.0F, false));

		Muzzle8_r1 = new ModelRenderer(this);
		Muzzle8_r1.setRotationPoint(-10.2531F, -24.753F, 0.0F);
		muzzle.addChild(Muzzle8_r1);
		setRotationAngle(Muzzle8_r1, 0.0F, 0.0F, 2.3562F);
		Muzzle8_r1.cubeList.add(new ModelBox(Muzzle8_r1, 56, 136, -1.0F, -14.5F, -38.0F, 1, 2, 8, 0.0F, false));

		Muzzle7_r1 = new ModelRenderer(this);
		Muzzle7_r1.setRotationPoint(11.9602F, -24.0459F, 0.0F);
		muzzle.addChild(Muzzle7_r1);
		setRotationAngle(Muzzle7_r1, 0.0F, 0.0F, -2.3562F);
		Muzzle7_r1.cubeList.add(new ModelBox(Muzzle7_r1, 112, 136, 1.0F, -14.5F, -38.0F, 1, 2, 8, 0.0F, false));

		Muzzle6_r1 = new ModelRenderer(this);
		Muzzle6_r1.setRotationPoint(13.0815F, -5.4185F, 0.0F);
		muzzle.addChild(Muzzle6_r1);
		setRotationAngle(Muzzle6_r1, 0.0F, 0.0F, -0.7854F);
		Muzzle6_r1.cubeList.add(new ModelBox(Muzzle6_r1, 83, 122, -2.0F, -18.5F, -38.0F, 2, 1, 8, 0.0F, false));

		Muzzle5_r1 = new ModelRenderer(this);
		Muzzle5_r1.setRotationPoint(-12.7886F, -6.1256F, 0.0F);
		muzzle.addChild(Muzzle5_r1);
		setRotationAngle(Muzzle5_r1, 0.0F, 0.0F, 0.7854F);
		Muzzle5_r1.cubeList.add(new ModelBox(Muzzle5_r1, 0, 123, 1.0F, -18.5F, -38.0F, 2, 1, 8, 0.0F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(-40.1527F, 3.4102F, 0.0F);
		body.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 74, 61, 17.3676F, -17.7291F, -29.2F, 1, 8, 1, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 10, 25, 17.3676F, -17.7291F, -29.0F, 1, 3, 2, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 150, 17.3676F, -9.9291F, -30.0F, 1, 1, 6, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 33, 149, 18.5676F, -8.7291F, -30.0F, 1, 1, 6, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 147, 121, 16.1676F, -8.7291F, -30.0F, 1, 1, 6, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 18, 33, 17.3676F, -17.7291F, -29.5F, 1, 8, 1, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 147, 91, 17.3676F, -7.5291F, -30.0F, 1, 1, 6, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 100, 72, 17.6676F, -17.8291F, -29.5F, 1, 1, 2, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 71, 100, 17.0676F, -17.8291F, -29.5F, 1, 1, 2, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 79, 27, 17.0676F, -17.8291F, -28.0F, 1, 1, 1, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 26, 79, 17.6676F, -17.8291F, -28.0F, 1, 1, 1, 0.0F, false));

		IronsightFront25_r1 = new ModelRenderer(this);
		IronsightFront25_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		frontsight.addChild(IronsightFront25_r1);
		setRotationAngle(IronsightFront25_r1, 0.0F, 0.0F, 0.7854F);
		IronsightFront25_r1.cubeList.add(new ModelBox(IronsightFront25_r1, 79, 25, 0.3F, -25.1F, -28.0F, 1, 1, 1, 0.0F, false));
		IronsightFront25_r1.cubeList.add(new ModelBox(IronsightFront25_r1, 100, 40, 0.3F, -25.1F, -29.5F, 1, 1, 2, 0.0F, false));

		IronsightFront23_r1 = new ModelRenderer(this);
		IronsightFront23_r1.setRotationPoint(35.0281F, 0.7071F, 0.0F);
		frontsight.addChild(IronsightFront23_r1);
		setRotationAngle(IronsightFront23_r1, 0.0F, 0.0F, -0.7854F);
		IronsightFront23_r1.cubeList.add(new ModelBox(IronsightFront23_r1, 100, 69, -0.3F, -25.1F, -29.5F, 1, 1, 2, 0.0F, false));
		IronsightFront23_r1.cubeList.add(new ModelBox(IronsightFront23_r1, 33, 79, -0.3F, -25.1F, -28.0F, 1, 1, 1, 0.0F, false));

		IronsightFront18_r1 = new ModelRenderer(this);
		IronsightFront18_r1.setRotationPoint(29.5399F, -16.2872F, 0.0F);
		frontsight.addChild(IronsightFront18_r1);
		setRotationAngle(IronsightFront18_r1, 0.0F, 0.0F, -2.3562F);
		IronsightFront18_r1.cubeList.add(new ModelBox(IronsightFront18_r1, 147, 56, 1.0F, -14.1F, -30.0F, 1, 1, 6, 0.0F, false));
		IronsightFront18_r1.cubeList.add(new ModelBox(IronsightFront18_r1, 147, 82, 1.0F, -14.8F, -30.0F, 1, 1, 6, 0.0F, false));

		IronsightFront17_r1 = new ModelRenderer(this);
		IronsightFront17_r1.setRotationPoint(27.8328F, -16.9943F, 0.0F);
		frontsight.addChild(IronsightFront17_r1);
		setRotationAngle(IronsightFront17_r1, 0.0F, 0.0F, -2.3562F);
		IronsightFront17_r1.cubeList.add(new ModelBox(IronsightFront17_r1, 64, 147, 0.7F, -14.8F, -30.0F, 1, 1, 6, 0.0F, false));
		IronsightFront17_r1.cubeList.add(new ModelBox(IronsightFront17_r1, 147, 65, 0.0F, -14.8F, -30.0F, 1, 1, 6, 0.0F, false));

		IronsightFront12_r1 = new ModelRenderer(this);
		IronsightFront12_r1.setRotationPoint(17.3676F, 15.8611F, -43.6342F);
		frontsight.addChild(IronsightFront12_r1);
		setRotationAngle(IronsightFront12_r1, -1.2641F, 0.0F, 0.0F);
		IronsightFront12_r1.cubeList.add(new ModelBox(IronsightFront12_r1, 56, 95, 0.0F, -25.5F, -27.0F, 1, 1, 9, 0.0F, false));

		IronsightFront11_r1 = new ModelRenderer(this);
		IronsightFront11_r1.setRotationPoint(4.4983F, 2.9402F, 0.0F);
		frontsight.addChild(IronsightFront11_r1);
		setRotationAngle(IronsightFront11_r1, 0.0F, 0.0F, 0.7854F);
		IronsightFront11_r1.cubeList.add(new ModelBox(IronsightFront11_r1, 147, 112, 0.0F, -17.5F, -30.0F, 1, 1, 6, 0.0F, false));
		IronsightFront11_r1.cubeList.add(new ModelBox(IronsightFront11_r1, 120, 147, 0.0F, -18.2F, -30.0F, 1, 1, 6, 0.0F, false));

		IronsightFront6_r1 = new ModelRenderer(this);
		IronsightFront6_r1.setRotationPoint(4.7912F, 2.2331F, 0.0F);
		frontsight.addChild(IronsightFront6_r1);
		setRotationAngle(IronsightFront6_r1, 0.0F, 0.0F, 0.7854F);
		IronsightFront6_r1.cubeList.add(new ModelBox(IronsightFront6_r1, 149, 98, 1.7F, -18.2F, -30.0F, 1, 1, 6, 0.0F, false));
		IronsightFront6_r1.cubeList.add(new ModelBox(IronsightFront6_r1, 149, 128, 1.0F, -18.2F, -30.0F, 1, 1, 6, 0.0F, false));

		IronsightFront3_r1 = new ModelRenderer(this);
		IronsightFront3_r1.setRotationPoint(17.3676F, 16.3497F, -42.9669F);
		frontsight.addChild(IronsightFront3_r1);
		setRotationAngle(IronsightFront3_r1, -1.2641F, 0.0F, 0.0F);
		IronsightFront3_r1.cubeList.add(new ModelBox(IronsightFront3_r1, 116, 0, 0.0F, -25.3F, -27.0F, 1, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}