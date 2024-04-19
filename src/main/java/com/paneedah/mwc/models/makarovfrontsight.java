package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class makarovfrontsight extends ModelWithAttachments {
	private final ModelRenderer _Dont_Resize_or_change_FrontSight;
	private final ModelRenderer sight4_r1;
	private final ModelRenderer sight3_r1;

	public makarovfrontsight() {
		textureWidth = 200;
		textureHeight = 200;

		_Dont_Resize_or_change_FrontSight = new ModelRenderer(this);
		_Dont_Resize_or_change_FrontSight.setRotationPoint(0.0F, 24.0F, 0.0F);
		_Dont_Resize_or_change_FrontSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_FrontSight, 93, 43, 0.0F, -26.0F, -3.0F, 3, 5, 4, 0.0F, false));
		_Dont_Resize_or_change_FrontSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_FrontSight, 50, 11, 0.0391F, -22.0F, -9.6F, 3, 1, 7, 0.0F, false));

		sight4_r1 = new ModelRenderer(this);
		sight4_r1.setRotationPoint(0.0F, -0.455F, -16.8086F);
		_Dont_Resize_or_change_FrontSight.addChild(sight4_r1);
		setRotationAngle(sight4_r1, -0.6692F, 0.0F, 0.0F);
		sight4_r1.cubeList.add(new ModelBox(sight4_r1, 11, 48, 0.0F, -24.4F, -7.75F, 3, 3, 3, 0.0F, false));

		sight3_r1 = new ModelRenderer(this);
		sight3_r1.setRotationPoint(0.0F, -15.2897F, -26.8807F);
		_Dont_Resize_or_change_FrontSight.addChild(sight3_r1);
		setRotationAngle(sight3_r1, -1.2641F, 0.0F, 0.0F);
		sight3_r1.cubeList.add(new ModelBox(sight3_r1, 77, 72, -0.0078F, -26.0F, -3.0F, 3, 5, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		_Dont_Resize_or_change_FrontSight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
