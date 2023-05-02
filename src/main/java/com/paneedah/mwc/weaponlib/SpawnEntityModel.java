package com.paneedah.mwc.weaponlib;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SpawnEntityModel extends ModelBase {
	ModelRenderer ammunition;

	public SpawnEntityModel() {
		textureWidth = 32;
		textureHeight = 32;

		ammunition = new ModelRenderer(this, 0, 0);
		ammunition.addBox(0F, 0F, 0F, 1, 1, 3);
		ammunition.setRotationPoint(-0.5F, 22F, -1.5F);
		ammunition.setTextureSize(32, 32);
		ammunition.mirror = true;
		setRotation(ammunition, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		ammunition.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
