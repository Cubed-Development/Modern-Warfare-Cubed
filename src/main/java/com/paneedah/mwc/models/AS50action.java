package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS50action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer Action6_r1;
	private final ModelRenderer Action5_r1;
	private final ModelRenderer Action3_r1;
	private final ModelRenderer Action7_r1;

	public AS50action() {
		textureWidth = 352;
		textureHeight = 352;

		action = new ModelRenderer(this);
		action.setRotationPoint(22.2688F, 24.0F, -9.6383F);
		action.cubeList.add(new ModelBox(action, 37, 35, -26.7688F, -41.0F, -27.0617F, 1, 3, 21, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 74, 0, -26.7688F, -43.0F, -24.0617F, 1, 2, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 212, 50, -26.5688F, -41.0F, -6.0617F, 1, 3, 14, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 60, 111, -29.7688F, -40.7F, -26.0617F, 3, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 76, 71, -30.7688F, -41.2F, -26.5617F, 1, 2, 2, 0.0F, false));

		Action6_r1 = new ModelRenderer(this);
		Action6_r1.setRotationPoint(-4.0F, 12.0F, 1.0F);
		action.addChild(Action6_r1);
		setRotationAngle(Action6_r1, 0.0F, 0.7854F, 0.0F);
		Action6_r1.cubeList.add(new ModelBox(Action6_r1, 73, 18, -0.5F, -55.0F, -31.7F, 1, 2, 3, 0.0F, false));

		Action5_r1 = new ModelRenderer(this);
		Action5_r1.setRotationPoint(19.4398F, -14.6885F, 10.6383F);
		action.addChild(Action5_r1);
		setRotationAngle(Action5_r1, 0.0F, 0.0F, -1.0456F);
		Action5_r1.cubeList.add(new ModelBox(Action5_r1, 211, 133, -0.3F, -53.0F, -16.7F, 2, 1, 14, 0.0F, false));

		Action3_r1 = new ModelRenderer(this);
		Action3_r1.setRotationPoint(19.3401F, -14.8615F, 10.6383F);
		action.addChild(Action3_r1);
		setRotationAngle(Action3_r1, 0.0F, 0.0F, -1.0456F);
		Action3_r1.cubeList.add(new ModelBox(Action3_r1, 119, 37, -0.5F, -53.0F, -37.7F, 2, 1, 21, 0.0F, false));

		Action7_r1 = new ModelRenderer(this);
		Action7_r1.setRotationPoint(-1.8787F, 12.0F, 0.1213F);
		action.addChild(Action7_r1);
		setRotationAngle(Action7_r1, 0.0F, 0.7854F, 0.0F);
		Action7_r1.cubeList.add(new ModelBox(Action7_r1, 72, 26, -0.5F, -55.0F, -34.7F, 2, 2, 3, 0.0F, false));
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