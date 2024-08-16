package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1897Pump extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action35_r1;
	private final ModelRenderer action34_r1;
	private final ModelRenderer action33_r1;
	private final ModelRenderer action32_r1;
	private final ModelRenderer action30_r1;
	private final ModelRenderer action29_r1;
	private final ModelRenderer action28_r1;
	private final ModelRenderer action27_r1;
	private final ModelRenderer action26_r1;
	private final ModelRenderer action22_r1;
	private final ModelRenderer action21_r1;
	private final ModelRenderer action20_r1;
	private final ModelRenderer action18_r1;
	private final ModelRenderer action17_r1;
	private final ModelRenderer action16_r1;
	private final ModelRenderer action12_r1;
	private final ModelRenderer action10_r1;
	private final ModelRenderer action7_r1;
	private final ModelRenderer action5_r1;

	public M1897Pump() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(20.2743F, -12.3265F, 0.0F);
		action.cubeList.add(new ModelBox(action, 250, 0, -23.2743F, 9.7265F, -38.0F, 1, 1, 16, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 250, 0, -20.2743F, 9.7265F, -38.0F, 1, 1, 16, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -22.7743F, 6.8265F, -6.0F, 3, 1, 13, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -22.7743F, 7.3265F, -6.0F, 3, 1, 16, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -22.2743F, 5.8265F, -6.0F, 2, 1, 11, 0.0F, true));

		action35_r1 = new ModelRenderer(this);
		action35_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		action.addChild(action35_r1);
		setRotationAngle(action35_r1, 0.0F, 0.0F, -2.082F);
		action35_r1.cubeList.add(new ModelBox(action35_r1, 250, 0, -0.5F, -23.9F, -38.0F, 1, 1, 16, 0.0F, true));
		action35_r1.cubeList.add(new ModelBox(action35_r1, 250, 0, -0.5F, -24.1F, -38.0F, 1, 1, 16, 0.0F, true));

		action34_r1 = new ModelRenderer(this);
		action34_r1.setRotationPoint(-46.3563F, -3.067F, 0.0F);
		action.addChild(action34_r1);
		setRotationAngle(action34_r1, 0.0F, 0.0F, 2.0077F);
		action34_r1.cubeList.add(new ModelBox(action34_r1, 250, 0, -0.5F, -29.2F, -38.0F, 1, 1, 16, 0.0F, true));

		action33_r1 = new ModelRenderer(this);
		action33_r1.setRotationPoint(2.9615F, -4.8792F, 0.0F);
		action.addChild(action33_r1);
		setRotationAngle(action33_r1, 0.0F, 0.0F, -2.0077F);
		action33_r1.cubeList.add(new ModelBox(action33_r1, 250, 0, -2.5F, -29.2F, -38.0F, 1, 1, 16, 0.0F, true));

		action32_r1 = new ModelRenderer(this);
		action32_r1.setRotationPoint(-43.527F, 1.7441F, 0.0F);
		action.addChild(action32_r1);
		setRotationAngle(action32_r1, 0.0F, 0.0F, 2.082F);
		action32_r1.cubeList.add(new ModelBox(action32_r1, 250, 0, -2.5F, -24.1F, -38.0F, 1, 1, 16, 0.0F, true));
		action32_r1.cubeList.add(new ModelBox(action32_r1, 250, 0, -2.5F, -23.9F, -38.0F, 1, 1, 16, 0.0F, true));

		action30_r1 = new ModelRenderer(this);
		action30_r1.setRotationPoint(-8.0696F, -12.3129F, 0.0F);
		action.addChild(action30_r1);
		setRotationAngle(action30_r1, 0.0F, 0.0F, -2.728F);
		action30_r1.cubeList.add(new ModelBox(action30_r1, 250, 0, 1.0F, -26.6F, -38.0F, 1, 1, 16, 0.0F, true));

		action29_r1 = new ModelRenderer(this);
		action29_r1.setRotationPoint(-36.3104F, -11.5091F, 0.0F);
		action.addChild(action29_r1);
		setRotationAngle(action29_r1, 0.0F, 0.0F, 2.728F);
		action29_r1.cubeList.add(new ModelBox(action29_r1, 250, 0, -4.0F, -26.6F, -38.0F, 1, 1, 16, 0.0F, true));

		action28_r1 = new ModelRenderer(this);
		action28_r1.setRotationPoint(-15.3304F, -15.8362F, 0.0F);
		action.addChild(action28_r1);
		setRotationAngle(action28_r1, 0.0F, 0.0F, -2.728F);
		action28_r1.cubeList.add(new ModelBox(action28_r1, 250, 0, -4.0F, -26.6F, -38.0F, 1, 1, 16, 0.0F, true));

		action27_r1 = new ModelRenderer(this);
		action27_r1.setRotationPoint(-33.5285F, -19.2757F, 0.0F);
		action.addChild(action27_r1);
		setRotationAngle(action27_r1, 0.0F, 0.0F, 2.6397F);
		action27_r1.cubeList.add(new ModelBox(action27_r1, 0, 0, 0.5F, -29.5F, -6.0F, 1, 1, 11, 0.0F, true));

		action26_r1 = new ModelRenderer(this);
		action26_r1.setRotationPoint(4.4004F, 18.5753F, 0.0F);
		action.addChild(action26_r1);
		setRotationAngle(action26_r1, 0.0F, 0.0F, -1.0782F);
		action26_r1.cubeList.add(new ModelBox(action26_r1, 0, 0, -2.5F, -29.5F, -6.0F, 1, 1, 11, 0.0F, true));

		action22_r1 = new ModelRenderer(this);
		action22_r1.setRotationPoint(-20.2743F, 29.0427F, 25.9283F);
		action.addChild(action22_r1);
		setRotationAngle(action22_r1, 0.9295F, 0.0F, 0.0F);
		action22_r1.cubeList.add(new ModelBox(action22_r1, 0, 0, -1.5F, -29.5F, 6.3F, 1, 1, 1, 0.0F, true));

		action21_r1 = new ModelRenderer(this);
		action21_r1.setRotationPoint(-20.2743F, 22.8012F, -17.8874F);
		action.addChild(action21_r1);
		setRotationAngle(action21_r1, -0.7436F, 0.0F, 0.0F);
		action21_r1.cubeList.add(new ModelBox(action21_r1, 0, 0, -1.5F, -29.7F, 8.4F, 1, 1, 1, 0.0F, true));

		action20_r1 = new ModelRenderer(this);
		action20_r1.setRotationPoint(-20.2743F, 34.5528F, -5.4276F);
		action.addChild(action20_r1);
		setRotationAngle(action20_r1, -0.1859F, 0.0F, 0.0F);
		action20_r1.cubeList.add(new ModelBox(action20_r1, 0, 0, -1.5F, -30.0F, 7.4F, 1, 1, 1, 0.0F, true));
		action20_r1.cubeList.add(new ModelBox(action20_r1, 0, 0, -1.5F, -30.0F, 6.8F, 1, 1, 1, 0.0F, true));

		action18_r1 = new ModelRenderer(this);
		action18_r1.setRotationPoint(-20.2743F, 35.1153F, 15.5483F);
		action.addChild(action18_r1);
		setRotationAngle(action18_r1, 0.5205F, 0.0F, 0.0F);
		action18_r1.cubeList.add(new ModelBox(action18_r1, 0, 0, -1.5F, -29.8F, 5.5F, 1, 1, 1, 0.0F, true));

		action17_r1 = new ModelRenderer(this);
		action17_r1.setRotationPoint(-20.2743F, 34.3379F, -5.333F);
		action.addChild(action17_r1);
		setRotationAngle(action17_r1, -0.1859F, 0.0F, 0.0F);
		action17_r1.cubeList.add(new ModelBox(action17_r1, 0, 0, -1.5F, -29.6F, 9.0F, 1, 1, 1, 0.0F, true));
		action17_r1.cubeList.add(new ModelBox(action17_r1, 0, 0, -0.5F, -29.6F, 8.0F, 1, 1, 2, 0.0F, true));
		action17_r1.cubeList.add(new ModelBox(action17_r1, 0, 0, -2.5F, -29.6F, 8.0F, 1, 1, 2, 0.0F, true));

		action16_r1 = new ModelRenderer(this);
		action16_r1.setRotationPoint(-20.2743F, 34.0617F, -6.4216F);
		action.addChild(action16_r1);
		setRotationAngle(action16_r1, -0.2231F, 0.0F, 0.0F);
		action16_r1.cubeList.add(new ModelBox(action16_r1, 0, 0, -0.7F, -29.8F, 4.9F, 1, 1, 5, 0.0F, true));
		action16_r1.cubeList.add(new ModelBox(action16_r1, 0, 0, -2.3F, -29.8F, 4.9F, 1, 1, 5, 0.0F, true));

		action12_r1 = new ModelRenderer(this);
		action12_r1.setRotationPoint(-20.2743F, 30.2769F, -13.5441F);
		action.addChild(action12_r1);
		setRotationAngle(action12_r1, -0.4833F, 0.0F, 0.0F);
		action12_r1.cubeList.add(new ModelBox(action12_r1, 0, 0, -0.5F, -30.5F, 5.5F, 1, 1, 2, 0.0F, true));
		action12_r1.cubeList.add(new ModelBox(action12_r1, 0, 0, -2.5F, -30.5F, 5.5F, 1, 1, 2, 0.0F, true));

		action10_r1 = new ModelRenderer(this);
		action10_r1.setRotationPoint(-20.2743F, 33.901F, -7.5345F);
		action.addChild(action10_r1);
		setRotationAngle(action10_r1, -0.2602F, 0.0F, 0.0F);
		action10_r1.cubeList.add(new ModelBox(action10_r1, 0, 0, -2.5F, -30.0F, 5.5F, 3, 2, 5, 0.0F, true));

		action7_r1 = new ModelRenderer(this);
		action7_r1.setRotationPoint(-20.2743F, 36.8546F, -0.3542F);
		action.addChild(action7_r1);
		setRotationAngle(action7_r1, -0.014F, 0.0F, 0.0F);
		action7_r1.cubeList.add(new ModelBox(action7_r1, 250, 0, -1.5F, -25.1F, -38.0F, 1, 1, 16, 0.0F, true));

		action5_r1 = new ModelRenderer(this);
		action5_r1.setRotationPoint(-29.0497F, -15.0324F, 0.0F);
		action.addChild(action5_r1);
		setRotationAngle(action5_r1, 0.0F, 0.0F, 2.728F);
		action5_r1.cubeList.add(new ModelBox(action5_r1, 250, 0, 1.0F, -26.6F, -38.0F, 1, 1, 16, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}