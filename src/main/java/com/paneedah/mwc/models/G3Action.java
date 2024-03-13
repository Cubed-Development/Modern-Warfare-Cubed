package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer gun9_r5;
	private final ModelRenderer gun9_r6;
	private final ModelRenderer gun8_r6;

	public G3Action() {
		textureWidth = 300;
		textureHeight = 300;

		action = new ModelRenderer(this);
		action.setRotationPoint(-3.0F, -14.65F, -24.5F);
		action.cubeList.add(new ModelBox(action, 72, 122, 0.2F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 121, 70, 0.4F, 0.75F, 0.0F, 1, 1, 8, 0.0F, false));

		gun9_r5 = new ModelRenderer(this);
		gun9_r5.setRotationPoint(0.2F, 1.0F, 1.0F);
		action.addChild(gun9_r5);
		setRotationAngle(gun9_r5, 0.0F, 0.0F, -0.7854F);
		gun9_r5.cubeList.add(new ModelBox(gun9_r5, 121, 82, 0.0F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));

		gun9_r6 = new ModelRenderer(this);
		gun9_r6.setRotationPoint(-0.2F, 2.0F, 1.0F);
		action.addChild(gun9_r6);
		setRotationAngle(gun9_r6, 0.0F, 0.0F, -0.7854F);
		gun9_r6.cubeList.add(new ModelBox(gun9_r6, 36, 121, 0.0F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));

		gun8_r6 = new ModelRenderer(this);
		gun8_r6.setRotationPoint(0.2F, 0.0F, 1.0F);
		action.addChild(gun8_r6);
		setRotationAngle(gun8_r6, 0.0F, 0.0F, -0.7854F);
		gun8_r6.cubeList.add(new ModelBox(gun8_r6, 122, 55, 0.0F, 0.0F, -1.0F, 1, 1, 8, 0.0F, false));
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