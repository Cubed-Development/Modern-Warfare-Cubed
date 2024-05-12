package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 * <p>
 * Exported with Blockbench Clean Exporter 0.2
 * <p>
 * Exported for Modern Warfare Cubed
 *
 * @author Desoroxxx
 */
public final class Plane extends ModelBase implements IModernModel {

	private final ModelRenderer plane;

	public Plane() {
		textureWidth = 1;
		textureHeight = 1;

		plane = new ModelRenderer(this);
		plane.setRotationPoint(0, 24, 0);
		plane.cubeList.add(new ModelBox(plane, 0, 0, -0.5F, -0.5F, 0, 1, 1, 0, 0, false));
	}

	@Override
	public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
		plane.render(scale);
	}
}
