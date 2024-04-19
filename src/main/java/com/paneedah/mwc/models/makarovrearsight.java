package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class makarovrearsight extends ModelWithAttachments {
	private final ModelRenderer _Dont_Resize_or_change_RearSight;
	private final ModelRenderer sight16_r1;
	private final ModelRenderer sight15_r1;
	private final ModelRenderer sight13_r1;
	private final ModelRenderer sight12_r1;
	private final ModelRenderer sight11_r1;
	private final ModelRenderer sight10_r1;

	public makarovrearsight() {
		textureWidth = 200;
		textureHeight = 200;

		_Dont_Resize_or_change_RearSight = new ModelRenderer(this);
		_Dont_Resize_or_change_RearSight.setRotationPoint(0.0F, -12.1513F, -13.2788F);
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 36, 54, -1.7F, 10.3513F, 12.2788F, 2, 2, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 25, 49, -2.0F, 10.3474F, 12.2827F, 1, 5, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 50, 5, 2.7F, 10.3513F, 12.2788F, 2, 2, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 0, 48, 4.0F, 10.3474F, 12.2827F, 1, 5, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 13, 41, 1.7F, 11.9513F, 12.2476F, 3, 3, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 16, 112, -1.7F, 11.9318F, 12.2906F, 4, 3, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 16, 0, 5.0039F, 11.3513F, 12.2866F, 1, 4, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 0, 0, -2.9961F, 11.3513F, 12.2866F, 1, 4, 2, 0.0F, false));
		_Dont_Resize_or_change_RearSight.cubeList.add(new ModelBox(_Dont_Resize_or_change_RearSight, 112, 75, -3.043F, 14.3513F, 9.7788F, 9, 1, 7, 0.0F, false));

		sight16_r1 = new ModelRenderer(this);
		sight16_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		_Dont_Resize_or_change_RearSight.addChild(sight16_r1);
		setRotationAngle(sight16_r1, -2.1192F, 0.0F, 0.0F);
		sight16_r1.cubeList.add(new ModelBox(sight16_r1, 0, 17, -3.0F, -21.8F, 3.5F, 9, 3, 2, 0.0F, false));

		sight15_r1 = new ModelRenderer(this);
		sight15_r1.setRotationPoint(0.0F, 30.9961F, 24.2855F);
		_Dont_Resize_or_change_RearSight.addChild(sight15_r1);
		setRotationAngle(sight15_r1, 0.5577F, 0.0F, 0.0F);
		sight15_r1.cubeList.add(new ModelBox(sight15_r1, 93, 61, -3.0F, -21.8F, -3.5F, 9, 2, 3, 0.0F, false));

		sight13_r1 = new ModelRenderer(this);
		sight13_r1.setRotationPoint(16.6576F, 26.7663F, 13.2788F);
		_Dont_Resize_or_change_RearSight.addChild(sight13_r1);
		setRotationAngle(sight13_r1, 0.0F, 0.0F, -0.7854F);
		sight13_r1.cubeList.add(new ModelBox(sight13_r1, 50, 15, -3.0F, -24.8195F, -1.0F, 1, 1, 2, 0.0F, false));

		sight12_r1 = new ModelRenderer(this);
		sight12_r1.setRotationPoint(-7.2936F, -10.4275F, 13.2788F);
		_Dont_Resize_or_change_RearSight.addChild(sight12_r1);
		setRotationAngle(sight12_r1, 0.0F, 0.0F, 2.3562F);
		sight12_r1.cubeList.add(new ModelBox(sight12_r1, 63, 15, 5.9844F, -24.8F, -1.0F, 1, 1, 2, 0.0F, false));

		sight11_r1 = new ModelRenderer(this);
		sight11_r1.setRotationPoint(-18.8291F, 30.0089F, 13.2788F);
		_Dont_Resize_or_change_RearSight.addChild(sight11_r1);
		setRotationAngle(sight11_r1, 0.0F, 0.0F, 0.7854F);
		sight11_r1.cubeList.add(new ModelBox(sight11_r1, 64, 39, -2.0F, -25.8F, -1.0234F, 1, 1, 2, 0.0F, false));

		sight10_r1 = new ModelRenderer(this);
		sight10_r1.setRotationPoint(-16.7789F, 25.0592F, 13.2788F);
		_Dont_Resize_or_change_RearSight.addChild(sight10_r1);
		setRotationAngle(sight10_r1, 0.0F, 0.0F, 0.7854F);
		sight10_r1.cubeList.add(new ModelBox(sight10_r1, 14, 68, 5.0F, -25.8F, -1.0234F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		_Dont_Resize_or_change_RearSight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
