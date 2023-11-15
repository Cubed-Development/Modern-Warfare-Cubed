package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CeilingTV extends ModelBase implements IModernModel {
	private final ModelRenderer tv;
	private final ModelRenderer tv8_r1;
	private final ModelRenderer tv6_r1;
	private final ModelRenderer tv5_r1;

	public CeilingTV() {
		textureWidth = 256;
		textureHeight = 256;

		tv = new ModelRenderer(this);
		tv.setRotationPoint(0.0F, 22.0208F, 9.5438F);
		tv.cubeList.add(new ModelBox(tv, 0, 0, -1.5F, -21.2208F, -8.4438F, 3, 9, 3, 0.0F, true));

		tv8_r1 = new ModelRenderer(this);
		tv8_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		tv.addChild(tv8_r1);
		setRotationAngle(tv8_r1, 0.409F, 0.0F, 0.0F);
		tv8_r1.cubeList.add(new ModelBox(tv8_r1, 0, 30, -11.0F, -17.0F, -4.8F, 22, 12, 1, 0.0F, true));

		tv6_r1 = new ModelRenderer(this);
		tv6_r1.setRotationPoint(0.0F, -1.2461F, -3.9913F);
		tv.addChild(tv6_r1);
		setRotationAngle(tv6_r1, 0.409F, 0.0F, 0.0F);
		tv6_r1.cubeList.add(new ModelBox(tv6_r1, 0, 0, -2.0F, -14.5F, -2.5F, 4, 4, 6, 0.0F, true));

		tv5_r1 = new ModelRenderer(this);
		tv5_r1.setRotationPoint(0.0F, -1.4935F, -2.7983F);
		tv.addChild(tv5_r1);
		setRotationAngle(tv5_r1, 0.409F, 0.0F, 0.0F);
		tv5_r1.cubeList.add(new ModelBox(tv5_r1, 0, 0, -11.5F, -17.5F, -4.5F, 23, 13, 1, 0.0F, true));
		tv5_r1.cubeList.add(new ModelBox(tv5_r1, 0, 0, -12.0F, -5.0F, -5.0F, 24, 1, 1, 0.0F, true));
		tv5_r1.cubeList.add(new ModelBox(tv5_r1, 0, 0, 11.0F, -17.0F, -5.0F, 1, 12, 1, 0.0F, true));
		tv5_r1.cubeList.add(new ModelBox(tv5_r1, 0, 0, -12.0F, -17.0F, -5.0F, 1, 12, 1, 0.0F, true));
		tv5_r1.cubeList.add(new ModelBox(tv5_r1, 0, 0, -12.0F, -18.0F, -5.0F, 24, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		tv.render(f5);
	}
}