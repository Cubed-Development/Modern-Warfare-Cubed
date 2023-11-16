package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VentCorner extends ModelBase implements IModernModel {
	private final ModelRenderer vent;
	private final ModelRenderer vent3_r1;

	public VentCorner() {
		textureWidth = 128;
		textureHeight = 128;

		vent = new ModelRenderer(this);
		vent.setRotationPoint(0.0F, 24.0F, 0.0F);
		vent.cubeList.add(new ModelBox(vent, 0, 0, -7.0F, -15.0F, 7.0F, 14, 14, 1, 0.0F, true));
		vent.cubeList.add(new ModelBox(vent, 0, 0, -8.0F, -15.0F, -7.0F, 15, 14, 14, 0.0F, true));

		vent3_r1 = new ModelRenderer(this);
		vent3_r1.setRotationPoint(-3.3995F, 0.0F, -6.7929F);
		vent.addChild(vent3_r1);
		setRotationAngle(vent3_r1, 0.0F, -0.7854F, 0.0F);
		vent3_r1.cubeList.add(new ModelBox(vent3_r1, 0, 40, 6.6F, -15.5F, -7.5F, 1, 15, 20, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		vent.render(f5);
	}
}