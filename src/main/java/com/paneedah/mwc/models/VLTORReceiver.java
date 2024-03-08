package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VLTORReceiver extends ModelWithAttachments {
	private final ModelRenderer bone;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer receiver38_r1;
	private final ModelRenderer receiver35_r1;
	private final ModelRenderer receiver33_r1;
	private final ModelRenderer receiver31_r1;
	private final ModelRenderer receiver30_r1;
	private final ModelRenderer receiver29_r1;
	private final ModelRenderer receiver28_r1;
	private final ModelRenderer receiver27_r1;
	private final ModelRenderer receiver25_r1;
	private final ModelRenderer receiver23_r1;
	private final ModelRenderer receiver9_r1;
	private final ModelRenderer receiver6_r1;

	public VLTORReceiver() {
		textureWidth = 100;
		textureHeight = 100;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 16.8445F, -23.8838F);
		bone.cubeList.add(new ModelBox(bone, 5, 0, -2.0F, -33.1445F, 22.8838F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, -0.4F, -30.3445F, 1.1838F, 1, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 40, 52, -3.7F, -30.8445F, 12.1838F, 1, 1, 13, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 7, -3.7F, -30.8445F, 1.1838F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 50, -2.7F, -32.1445F, 1.8838F, 1, 1, 23, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 27, 27, -1.3F, -32.1445F, 1.8838F, 1, 1, 23, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 13, -0.3F, -31.2445F, 4.3838F, 1, 1, 3, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 19, 2, -0.2F, -30.8445F, 24.3838F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 19, -3.8F, -30.8445F, 24.3838F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 9, -2.7F, -32.1445F, 1.1838F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 5, 18, -1.3F, -32.1445F, 1.1838F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, -0.3F, -30.8445F, 1.1838F, 1, 1, 24, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 13, 4, -3.7F, -30.3445F, 1.1838F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 17, 0, -0.4F, -30.3445F, 13.1838F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 0, -2.5F, -32.9445F, 1.8838F, 2, 1, 21, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 11, 16, -2.5F, -32.9445F, 1.1838F, 2, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 15, 13, -2.5F, -33.0445F, 21.8838F, 2, 1, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 0, 8, -2.5F, -40.1F, -1.0F, 2, 1, 2, 0.0F, false));

		receiver38_r1 = new ModelRenderer(this);
		receiver38_r1.setRotationPoint(19.4181F, -60.6253F, 23.8838F);
		bone.addChild(receiver38_r1);
		setRotationAngle(receiver38_r1, 0.0F, 0.0F, -2.6164F);
		receiver38_r1.cubeList.add(new ModelBox(receiver38_r1, 7, 7, 0.6F, -38.0F, -10.7F, 1, 1, 1, 0.0F, false));
		receiver38_r1.cubeList.add(new ModelBox(receiver38_r1, 5, 13, 0.6F, -37.5F, -10.7F, 1, 1, 1, 0.0F, false));

		receiver35_r1 = new ModelRenderer(this);
		receiver35_r1.setRotationPoint(17.8916F, -62.3325F, 23.8838F);
		bone.addChild(receiver35_r1);
		setRotationAngle(receiver35_r1, 0.0F, 0.0F, -2.4435F);
		receiver35_r1.cubeList.add(new ModelBox(receiver35_r1, 5, 4, -4.7F, -37.5F, -22.7F, 1, 1, 2, 0.0F, false));
		receiver35_r1.cubeList.add(new ModelBox(receiver35_r1, 25, 51, -4.7F, -37.5F, -11.7F, 1, 1, 13, 0.0F, false));
		receiver35_r1.cubeList.add(new ModelBox(receiver35_r1, 11, 13, -4.7F, -38.0F, -22.7F, 1, 1, 2, 0.0F, false));
		receiver35_r1.cubeList.add(new ModelBox(receiver35_r1, 52, 26, -4.7F, -38.0F, -11.7F, 1, 1, 13, 0.0F, false));

		receiver33_r1 = new ModelRenderer(this);
		receiver33_r1.setRotationPoint(-23.0062F, -61.6244F, 23.8838F);
		bone.addChild(receiver33_r1);
		setRotationAngle(receiver33_r1, 0.0F, 0.0F, 2.6953F);
		receiver33_r1.cubeList.add(new ModelBox(receiver33_r1, 48, 51, -4.7F, -39.0F, -20.7F, 1, 2, 22, 0.0F, false));

		receiver31_r1 = new ModelRenderer(this);
		receiver31_r1.setRotationPoint(-23.1897F, -60.4042F, 23.8838F);
		bone.addChild(receiver31_r1);
		setRotationAngle(receiver31_r1, 0.0F, 0.0F, 2.4435F);
		receiver31_r1.cubeList.add(new ModelBox(receiver31_r1, 0, 0, 0.7F, -37.4F, -22.7F, 1, 1, 24, 0.0F, false));
		receiver31_r1.cubeList.add(new ModelBox(receiver31_r1, 26, 1, 0.7F, -38.0F, -22.7F, 1, 1, 24, -0.002F, false));

		receiver30_r1 = new ModelRenderer(this);
		receiver30_r1.setRotationPoint(18.2623F, -62.0165F, 23.8838F);
		bone.addChild(receiver30_r1);
		setRotationAngle(receiver30_r1, 0.0F, 0.0F, -2.426F);
		receiver30_r1.cubeList.add(new ModelBox(receiver30_r1, 17, 4, -4.8F, -37.3F, 0.5F, 1, 1, 1, 0.0F, false));
		receiver30_r1.cubeList.add(new ModelBox(receiver30_r1, 11, 18, -4.8F, -38.0F, 0.5F, 1, 1, 1, 0.0F, false));

		receiver29_r1 = new ModelRenderer(this);
		receiver29_r1.setRotationPoint(-23.5265F, -60.0483F, 23.8838F);
		bone.addChild(receiver29_r1);
		setRotationAngle(receiver29_r1, 0.0F, 0.0F, 2.426F);
		receiver29_r1.cubeList.add(new ModelBox(receiver29_r1, 17, 7, 0.8F, -37.3F, 0.5F, 1, 1, 1, 0.0F, false));
		receiver29_r1.cubeList.add(new ModelBox(receiver29_r1, 16, 17, 0.8F, -38.0F, 0.5F, 1, 1, 1, 0.0F, false));

		receiver28_r1 = new ModelRenderer(this);
		receiver28_r1.setRotationPoint(17.1098F, -62.9623F, 23.8838F);
		bone.addChild(receiver28_r1);
		setRotationAngle(receiver28_r1, 0.0F, 0.0F, -2.6953F);
		receiver28_r1.cubeList.add(new ModelBox(receiver28_r1, 0, 0, 0.6F, -39.0F, -9.7F, 1, 2, 11, 0.0F, false));

		receiver27_r1 = new ModelRenderer(this);
		receiver27_r1.setRotationPoint(-27.3359F, -57.4941F, 23.8838F);
		bone.addChild(receiver27_r1);
		setRotationAngle(receiver27_r1, 0.0F, 0.0F, 2.3051F);
		receiver27_r1.cubeList.add(new ModelBox(receiver27_r1, 0, 0, 0.7F, -38.1F, -19.5F, 1, 1, 3, 0.0F, false));
		receiver27_r1.cubeList.add(new ModelBox(receiver27_r1, 0, 4, 0.7F, -38.4F, -19.5F, 1, 1, 3, -0.001F, false));

		receiver25_r1 = new ModelRenderer(this);
		receiver25_r1.setRotationPoint(-31.8041F, -47.355F, 23.8838F);
		bone.addChild(receiver25_r1);
		setRotationAngle(receiver25_r1, 0.0F, 0.0F, 2.042F);
		receiver25_r1.cubeList.add(new ModelBox(receiver25_r1, 16, 15, 0.8F, -37.0F, 0.5F, 2, 1, 1, 0.0F, false));

		receiver23_r1 = new ModelRenderer(this);
		receiver23_r1.setRotationPoint(27.4421F, -50.028F, 23.8838F);
		bone.addChild(receiver23_r1);
		setRotationAngle(receiver23_r1, 0.0F, 0.0F, -2.042F);
		receiver23_r1.cubeList.add(new ModelBox(receiver23_r1, 0, 17, -5.8F, -37.0F, 0.5F, 2, 1, 1, 0.0F, false));

		receiver9_r1 = new ModelRenderer(this);
		receiver9_r1.setRotationPoint(-32.1257F, -52.5376F, 23.8838F);
		bone.addChild(receiver9_r1);
		setRotationAngle(receiver9_r1, 0.0F, 0.0F, 2.3562F);
		receiver9_r1.cubeList.add(new ModelBox(receiver9_r1, 13, 0, -4.7F, -38.5F, -22.7F, 1, 2, 2, 0.0F, false));

		receiver6_r1 = new ModelRenderer(this);
		receiver6_r1.setRotationPoint(26.8337F, -54.7296F, 23.8838F);
		bone.addChild(receiver6_r1);
		setRotationAngle(receiver6_r1, 0.0F, 0.0F, -2.3562F);
		receiver6_r1.cubeList.add(new ModelBox(receiver6_r1, 0, 13, 0.6F, -38.5F, -22.7F, 1, 2, 9, 0.0F, false));
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