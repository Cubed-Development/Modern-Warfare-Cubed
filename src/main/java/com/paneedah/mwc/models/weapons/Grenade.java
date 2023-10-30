package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Grenade extends ModelBase {
	// fields
	ModelRenderer Grenade1;
	ModelRenderer Grenade2;

	public Grenade() {
		textureWidth = 64;
		textureHeight = 32;

		Grenade1 = new ModelRenderer(this, 0, 0);
		Grenade1.addBox(0F, 0F, 0F, 3, 3, 5);
		Grenade1.setRotationPoint(0F, 0F, 0F);
		Grenade1.setTextureSize(64, 32);
		Grenade1.mirror = true;
		setRotation(Grenade1, 0F, 0F, 0F);
		Grenade2 = new ModelRenderer(this, 0, 0);
		Grenade2.addBox(0F, 0F, 0F, 2, 2, 1);
		Grenade2.setRotationPoint(0.5F, 0.5F, -1F);
		Grenade2.setTextureSize(64, 32);
		Grenade2.mirror = true;
		setRotation(Grenade2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Grenade1.render(f5);
		Grenade2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
