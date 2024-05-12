package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KedrAction extends ModelBase {
	private final ModelRenderer action;
	private final ModelRenderer action3_r1_r1;
	private final ModelRenderer action4_r1_r1;
	private final ModelRenderer action2_r1_r1;
	private final ModelRenderer gun53_r1_r1;

	public KedrAction() {
		textureWidth = 180;
		textureHeight = 180;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 14, 74, -3.3F, -37.5F, -18.0F, 3, 1, 6, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 51, 21, -3.9F, -36.9F, -18.0F, 1, 2, 6, 0.0F, false));

		action3_r1_r1 = new ModelRenderer(this);
		action3_r1_r1.setRotationPoint(-3.9853F, 0.0F, -23.9728F);
		action.addChild(action3_r1_r1);
		setRotationAngle(action3_r1_r1, -3.1416F, -0.6878F, 3.1416F);
		action3_r1_r1.cubeList.add(new ModelBox(action3_r1_r1, 36, 40, 2.3F, -35.5F, -12.7F, 3, 1, 1, 0.0F, false));

		action4_r1_r1 = new ModelRenderer(this);
		action4_r1_r1.setRotationPoint(3.7876F, 0.0F, -0.0545F);
		action.addChild(action4_r1_r1);
		setRotationAngle(action4_r1_r1, 0.0F, 0.2793F, 0.0F);
		action4_r1_r1.cubeList.add(new ModelBox(action4_r1_r1, 10, 0, 0.7F, -35.5F, -14.5F, 1, 1, 1, 0.0F, false));

		action2_r1_r1 = new ModelRenderer(this);
		action2_r1_r1.setRotationPoint(-10.8336F, 0.0F, -17.9804F);
		action.addChild(action2_r1_r1);
		setRotationAngle(action2_r1_r1, -3.1416F, -1.4314F, 3.1416F);
		action2_r1_r1.cubeList.add(new ModelBox(action2_r1_r1, 64, 70, 2.4F, -35.501F, -13.7F, 1, 1, 2, 0.0F, false));

		gun53_r1_r1 = new ModelRenderer(this);
		gun53_r1_r1.setRotationPoint(-27.6538F, -8.638F, 0.0F);
		action.addChild(gun53_r1_r1);
		setRotationAngle(gun53_r1_r1, 0.0F, 0.0F, 0.7854F);
		gun53_r1_r1.cubeList.add(new ModelBox(gun53_r1_r1, 58, 59, -3.261F, -37.7F, -14.9F, 1, 1, 3, -0.07F, false));
		gun53_r1_r1.cubeList.add(new ModelBox(gun53_r1_r1, 0, 35, -3.26F, -37.7F, -18.1F, 1, 1, 4, -0.07F, false));
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
