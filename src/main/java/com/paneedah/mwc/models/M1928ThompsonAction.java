package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1928ThompsonAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action7_r1;
	private final ModelRenderer action8_r1;
	private final ModelRenderer action10_r1;
	private final ModelRenderer action11_r1;

	public M1928ThompsonAction() {
		textureWidth = 512;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 0, -1.5F, -34.5F, -6.5F, 1, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -1.5F, -34.0F, -6.5F, 1, 1, 18, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -1.8F, -33.8F, -14.5F, 1, 1, 7, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -2.8F, -32.8F, -14.5F, 2, 1, 7, 0.0F, true));

		action7_r1 = new ModelRenderer(this);
		action7_r1.setRotationPoint(-24.4274F, -8.627F, 0.0F);
		action.addChild(action7_r1);
		setRotationAngle(action7_r1, 0.0F, 0.0F, 0.7854F);
		action7_r1.cubeList.add(new ModelBox(action7_r1, 0, 0, -1.8F, -33.8F, -14.5F, 1, 1, 7, 0.0F, true));

		action8_r1 = new ModelRenderer(this);
		action8_r1.setRotationPoint(22.373F, -11.5868F, 0.0F);
		action.addChild(action8_r1);
		setRotationAngle(action8_r1, 0.0F, 0.0F, -0.7854F);
		action8_r1.cubeList.add(new ModelBox(action8_r1, 0, 0, -2.8F, -32.8F, -14.5F, 1, 1, 7, 0.0F, true));

		action10_r1 = new ModelRenderer(this);
		action10_r1.setRotationPoint(-25.3709F, -9.3492F, 0.0F);
		action.addChild(action10_r1);
		setRotationAngle(action10_r1, 0.0F, 0.0F, 0.7854F);
		action10_r1.cubeList.add(new ModelBox(action10_r1, 0, 0, -1.4F, -35.3F, -6.5F, 1, 1, 1, 0.0F, true));

		action11_r1 = new ModelRenderer(this);
		action11_r1.setRotationPoint(-25.1366F, -9.9149F, 0.0F);
		action.addChild(action11_r1);
		setRotationAngle(action11_r1, 0.0F, 0.0F, 0.7854F);
		action11_r1.cubeList.add(new ModelBox(action11_r1, 0, 0, -0.6F, -35.3F, -6.5F, 1, 1, 1, 0.0F, true));
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