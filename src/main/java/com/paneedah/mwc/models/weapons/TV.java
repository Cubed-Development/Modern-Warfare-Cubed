package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TV extends ModelBase implements IModernModel {
	private final ModelRenderer tv;
	private final ModelRenderer tv2_r1;

	public TV() {
		textureWidth = 128;
		textureHeight = 128;

		tv = new ModelRenderer(this);
		tv.setRotationPoint(0.0F, 24.0F, 0.0F);
		tv.cubeList.add(new ModelBox(tv, 0, 0, -7.0F, -1.0F, -3.0F, 14, 1, 5, 0.0F, true));
		tv.cubeList.add(new ModelBox(tv, 0, 0, -21.5F, -5.5F, -2.5F, 43, 2, 1, 0.0F, true));
		tv.cubeList.add(new ModelBox(tv, 0, 0, -21.5F, -24.5F, -2.5F, 1, 19, 1, 0.0F, true));
		tv.cubeList.add(new ModelBox(tv, 0, 0, 20.5F, -24.5F, -2.5F, 1, 19, 1, 0.0F, true));
		tv.cubeList.add(new ModelBox(tv, 0, 0, -21.5F, -25.5F, -2.5F, 43, 1, 1, 0.0F, true));
		tv.cubeList.add(new ModelBox(tv, 0, 0, -21.0F, -25.0F, -1.5F, 42, 20, 1, 0.0F, true));
		tv.cubeList.add(new ModelBox(tv, 0, 50, -20.5F, -24.5F, -2.4F, 41, 19, 1, 0.0F, true));

		tv2_r1 = new ModelRenderer(this);
		tv2_r1.setRotationPoint(0.0F, 0.0499F, -0.317F);
		tv.addChild(tv2_r1);
		setRotationAngle(tv2_r1, -0.0372F, 0.0F, 0.0F);
		tv2_r1.cubeList.add(new ModelBox(tv2_r1, 0, 0, -3.5F, -11.5F, -1.5F, 7, 11, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tv.render(f5);
	}
}