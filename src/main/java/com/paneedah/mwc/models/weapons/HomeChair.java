package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HomeChair extends ModelBase implements IModernModel {
	private final ModelRenderer chair;
	private final ModelRenderer chair2_r1;

	public HomeChair() {
		textureWidth = 128;
		textureHeight = 128;

		chair = new ModelRenderer(this);
		chair.setRotationPoint(0.0F, 24.0F, 0.0F);
		chair.cubeList.add(new ModelBox(chair, 0, 0, -7.0F, -11.0F, -6.0F, 14, 4, 13, 0.0F, true));
		chair.cubeList.add(new ModelBox(chair, 0, 50, -6.5F, -7.0F, -5.5F, 2, 7, 2, 0.0F, true));
		chair.cubeList.add(new ModelBox(chair, 0, 50, 4.5F, -7.0F, -5.5F, 2, 7, 2, 0.0F, true));
		chair.cubeList.add(new ModelBox(chair, 0, 50, 4.5F, -7.0F, 4.5F, 2, 7, 2, 0.0F, true));
		chair.cubeList.add(new ModelBox(chair, 0, 50, -6.5F, -7.0F, 4.5F, 2, 7, 2, 0.0F, true));

		chair2_r1 = new ModelRenderer(this);
		chair2_r1.setRotationPoint(0.0F, -11.4779F, 15.8289F);
		chair.addChild(chair2_r1);
		setRotationAngle(chair2_r1, 2.8256F, 0.0F, 0.0F);
		chair2_r1.cubeList.add(new ModelBox(chair2_r1, 0, 0, -7.0F, -7.0F, 7.0F, 14, 12, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		chair.render(f5);
	}
}