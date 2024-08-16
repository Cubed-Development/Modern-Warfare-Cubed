package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M82Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action10_r1;
	private final ModelRenderer action2_r1;
	private final ModelRenderer action14_r1;

	public M82Action() {
		textureWidth = 410;
		textureHeight = 410;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 157, -4.8F, -38.5F, -33.0F, 1, 1, 32, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 59, 18, -4.9F, -38.5F, -8.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 59, 12, -4.9F, -38.5F, -6.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 47, 22, -4.9F, -38.5F, -4.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 28, -4.9F, -38.5F, -2.0F, 1, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 30, 31, -7.3F, -38.5F, -33.0F, 3, 1, 1, 0.0F, false));

		action10_r1 = new ModelRenderer(this);
		action10_r1.setRotationPoint(-7.3F, -37.5F, -33.0F);
		action.addChild(action10_r1);
		setRotationAngle(action10_r1, 1.9333F, 0.0F, 0.0F);
		action10_r1.cubeList.add(new ModelBox(action10_r1, 44, 52, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.001F, false));

		action2_r1 = new ModelRenderer(this);
		action2_r1.setRotationPoint(-4.8F, -38.5F, -33.0F);
		action.addChild(action2_r1);
		setRotationAngle(action2_r1, 0.0F, 0.0F, -1.041F);
		action2_r1.cubeList.add(new ModelBox(action2_r1, 52, 52, 0.0F, 0.0F, 0.0F, 2, 1, 24, 0.0F, false));

		action14_r1 = new ModelRenderer(this);
		action14_r1.setRotationPoint(-9.3F, -39.0F, -33.55F);
		action.addChild(action14_r1);
		setRotationAngle(action14_r1, 1.9333F, 0.0F, 0.0F);
		action14_r1.cubeList.add(new ModelBox(action14_r1, 43, 38, 0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, false));
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