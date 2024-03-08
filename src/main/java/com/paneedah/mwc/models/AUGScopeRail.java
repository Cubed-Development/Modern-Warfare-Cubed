package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGScopeRail extends ModelWithAttachments {
	private final ModelRenderer scoperail;
	private final ModelRenderer scoperail1_r1;
	private final ModelRenderer scoperail2_r1;
	private final ModelRenderer handguard;
	private final ModelRenderer handguard28_r1;
	private final ModelRenderer handguard27_r1;
	private final ModelRenderer handguard26_r1;
	private final ModelRenderer handguard25_r1;
	private final ModelRenderer handguard24_r1;
	private final ModelRenderer handguard23_r1;
	private final ModelRenderer handguard22_r1;
	private final ModelRenderer handguard21_r1;
	private final ModelRenderer handguard19_r1;
	private final ModelRenderer handguard18_r1;
	private final ModelRenderer handguard17_r1;

	public AUGScopeRail() {
		textureWidth = 270;
		textureHeight = 270;

		scoperail = new ModelRenderer(this);
		scoperail.setRotationPoint(-1.5556F, -16.0863F, -8.9535F);
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 117, -0.9444F, 2.9863F, -12.5465F, 2, 1, 16, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 164, 115, -0.9444F, 1.9863F, -10.5465F, 2, 1, 13, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 82, 160, -0.9444F, -0.9137F, -7.5465F, 2, 1, 13, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 27, -1.4444F, -1.9137F, -9.0465F, 3, 1, 26, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 0, -1.4444F, -3.4137F, -9.0465F, 3, 1, 26, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 60, 60, -1.2444F, -2.4137F, -9.0465F, 1, 1, 26, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 60, -0.6444F, -2.4137F, -9.0465F, 2, 1, 26, 0.0F, false));

		scoperail1_r1 = new ModelRenderer(this);
		scoperail1_r1.setRotationPoint(1.5556F, 15.7401F, 28.3925F);
		scoperail.addChild(scoperail1_r1);
		setRotationAngle(scoperail1_r1, 0.7436F, 0.0F, 0.0F);
		scoperail1_r1.cubeList.add(new ModelBox(scoperail1_r1, 59, 134, -2.5F, -37.1F, -21.5F, 2, 2, 8, 0.0F, false));

		scoperail2_r1 = new ModelRenderer(this);
		scoperail2_r1.setRotationPoint(1.5556F, 18.3708F, 35.267F);
		scoperail.addChild(scoperail2_r1);
		setRotationAngle(scoperail2_r1, 0.9295F, 0.0F, 0.0F);
		scoperail2_r1.cubeList.add(new ModelBox(scoperail2_r1, 101, 100, -2.5F, -37.1F, -8.5F, 2, 2, 5, 0.0F, false));

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-1.4993F, -9.8948F, -27.5559F);
		handguard.cubeList.add(new ModelBox(handguard, 141, 119, -0.5007F, 0.3948F, -4.9441F, 1, 1, 9, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 153, 30, -1.5007F, -1.1052F, -4.4441F, 3, 1, 8, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 67, 0, -0.5007F, -2.1052F, -4.4441F, 1, 3, 8, 0.0F, false));

		handguard28_r1 = new ModelRenderer(this);
		handguard28_r1.setRotationPoint(-25.0873F, 23.2389F, 27.5559F);
		handguard.addChild(handguard28_r1);
		setRotationAngle(handguard28_r1, 0.0F, 0.0F, 0.8179F);
		handguard28_r1.cubeList.add(new ModelBox(handguard28_r1, 92, 175, -1.0F, -36.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard27_r1 = new ModelRenderer(this);
		handguard27_r1.setRotationPoint(-23.5921F, -25.5065F, 27.5559F);
		handguard.addChild(handguard27_r1);
		setRotationAngle(handguard27_r1, 0.0F, 0.0F, 2.3423F);
		handguard27_r1.cubeList.add(new ModelBox(handguard27_r1, 0, 182, 0.0F, -35.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard26_r1 = new ModelRenderer(this);
		handguard26_r1.setRotationPoint(-23.3978F, 25.7466F, 27.5559F);
		handguard.addChild(handguard26_r1);
		setRotationAngle(handguard26_r1, 0.0F, 0.0F, 0.7436F);
		handguard26_r1.cubeList.add(new ModelBox(handguard26_r1, 175, 41, -2.0F, -36.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard25_r1 = new ModelRenderer(this);
		handguard25_r1.setRotationPoint(24.3997F, 22.626F, 27.5559F);
		handguard.addChild(handguard25_r1);
		setRotationAngle(handguard25_r1, 0.0F, 0.0F, -0.7436F);
		handguard25_r1.cubeList.add(new ModelBox(handguard25_r1, 82, 174, -3.0F, -35.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard24_r1 = new ModelRenderer(this);
		handguard24_r1.setRotationPoint(26.1255F, 19.9395F, 27.5559F);
		handguard.addChild(handguard24_r1);
		setRotationAngle(handguard24_r1, 0.0F, 0.0F, -0.8551F);
		handguard24_r1.cubeList.add(new ModelBox(handguard24_r1, 59, 174, -3.0F, -34.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard23_r1 = new ModelRenderer(this);
		handguard23_r1.setRotationPoint(21.7625F, -23.5459F, 27.5559F);
		handguard.addChild(handguard23_r1);
		setRotationAngle(handguard23_r1, 0.0F, 0.0F, -2.3423F);
		handguard23_r1.cubeList.add(new ModelBox(handguard23_r1, 180, 160, -2.0F, -33.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard22_r1 = new ModelRenderer(this);
		handguard22_r1.setRotationPoint(-21.9773F, -24.6989F, 27.5559F);
		handguard.addChild(handguard22_r1);
		setRotationAngle(handguard22_r1, 0.0F, 0.0F, 2.3794F);
		handguard22_r1.cubeList.add(new ModelBox(handguard22_r1, 41, 174, 0.0F, -34.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard21_r1 = new ModelRenderer(this);
		handguard21_r1.setRotationPoint(22.562F, -23.6661F, 27.5559F);
		handguard.addChild(handguard21_r1);
		setRotationAngle(handguard21_r1, 0.0F, 0.0F, -2.3794F);
		handguard21_r1.cubeList.add(new ModelBox(handguard21_r1, 18, 173, -1.0F, -33.0F, -32.0F, 1, 1, 8, 0.0F, false));

		handguard19_r1 = new ModelRenderer(this);
		handguard19_r1.setRotationPoint(7.6358F, 32.7262F, 27.5559F);
		handguard.addChild(handguard19_r1);
		setRotationAngle(handguard19_r1, 0.0F, 0.0F, -0.1859F);
		handguard19_r1.cubeList.add(new ModelBox(handguard19_r1, 32, 27, -3.2F, -33.5F, -27.0F, 2, 3, 3, 0.0F, false));

		handguard18_r1 = new ModelRenderer(this);
		handguard18_r1.setRotationPoint(-31.2445F, -5.6874F, 27.5559F);
		handguard.addChild(handguard18_r1);
		setRotationAngle(handguard18_r1, 0.0F, 0.0F, 1.7474F);
		handguard18_r1.cubeList.add(new ModelBox(handguard18_r1, 118, 81, 0.2F, -33.5F, -27.0F, 3, 2, 3, 0.0F, false));

		handguard17_r1 = new ModelRenderer(this);
		handguard17_r1.setRotationPoint(1.4993F, 29.4505F, 32.216F);
		handguard.addChild(handguard17_r1);
		setRotationAngle(handguard17_r1, 0.1487F, 0.0F, 0.0F);
		handguard17_r1.cubeList.add(new ModelBox(handguard17_r1, 0, 78, -2.5F, -33.5F, -27.5F, 2, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		scoperail.render(f5);
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}