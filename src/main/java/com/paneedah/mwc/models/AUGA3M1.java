package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGA3M1 extends ModelWithAttachments {
	private final ModelRenderer a3aug;
	private final ModelRenderer a3aug10_r1;
	private final ModelRenderer a3aug6_r1;

	public AUGA3M1() {
		textureWidth = 300;
		textureHeight = 300;

		a3aug = new ModelRenderer(this);
		a3aug.setRotationPoint(-1.3889F, -13.7725F, -3.467F);
		a3aug.cubeList.add(new ModelBox(a3aug, 118, 81, -1.6111F, 0.4725F, -18.533F, 3, 1, 33, 0.0F, false));
		a3aug.cubeList.add(new ModelBox(a3aug, 41, 159, -1.6111F, -1.0275F, -16.533F, 3, 1, 30, 0.0F, false));
		a3aug.cubeList.add(new ModelBox(a3aug, 157, 81, -1.5111F, -0.0275F, -17.033F, 2, 1, 31, 0.0F, false));
		a3aug.cubeList.add(new ModelBox(a3aug, 159, 41, 0.2889F, -0.0275F, -17.033F, 1, 1, 31, 0.0F, false));
		a3aug.cubeList.add(new ModelBox(a3aug, 77, 160, 0.1889F, -1.3275F, -16.533F, 1, 1, 30, 0.0F, false));
		a3aug.cubeList.add(new ModelBox(a3aug, 132, 159, -1.4111F, -1.3275F, -16.533F, 2, 1, 30, 0.0F, false));

		a3aug10_r1 = new ModelRenderer(this);
		a3aug10_r1.setRotationPoint(1.3889F, 12.7836F, -24.1454F);
		a3aug.addChild(a3aug10_r1);
		setRotationAngle(a3aug10_r1, -0.9666F, 0.0F, 0.0F);
		a3aug10_r1.cubeList.add(new ModelBox(a3aug10_r1, 8, 80, -3.0F, -38.8F, 10.8F, 3, 1, 1, 0.0F, false));
		a3aug10_r1.cubeList.add(new ModelBox(a3aug10_r1, 30, 82, -3.0F, -38.8F, 10.0F, 3, 1, 1, 0.0F, false));

		a3aug6_r1 = new ModelRenderer(this);
		a3aug6_r1.setRotationPoint(1.3889F, 38.2111F, -35.6582F);
		a3aug.addChild(a3aug6_r1);
		setRotationAngle(a3aug6_r1, -0.9295F, 0.0F, 0.0F);
		a3aug6_r1.cubeList.add(new ModelBox(a3aug6_r1, 16, 54, -3.0F, -38.8F, -20.0F, 3, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		a3aug.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}