package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BrowningAuto5Action extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action6_r1;
	private final ModelRenderer action2_r1;

	public BrowningAuto5Action() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(0.0F, 24.0F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 0, -1.1F, -29.5F, 3.0F, 1, 1, 11, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -2.1F, -29.5F, 3.3F, 1, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -1.7F, -29.5F, 3.5F, 1, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -4.0F, -29.8F, 2.9F, 1, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 0, -4.0F, -29.4F, 2.9F, 1, 1, 1, 0.0F, true));

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(0.616F, 0.0F, 1.0255F);
		action.addChild(action6_r1);
		setRotationAngle(action6_r1, 0.0F, -0.2677F, 0.0F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 0, 0, -3.5F, -29.4F, 2.8F, 2, 1, 1, 0.0F, true));
		action6_r1.cubeList.add(new ModelBox(action6_r1, 0, 0, -3.5F, -29.8F, 2.8F, 2, 1, 1, 0.0F, true));

		action2_r1 = new ModelRenderer(this);
		action2_r1.setRotationPoint(27.6775F, -22.9184F, 0.0F);
		action.addChild(action2_r1);
		setRotationAngle(action2_r1, 0.0F, 0.0F, -1.3087F);
		action2_r1.cubeList.add(new ModelBox(action2_r1, 0, 0, -1.1F, -29.5F, 3.0F, 1, 1, 11, 0.0F, true));
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
