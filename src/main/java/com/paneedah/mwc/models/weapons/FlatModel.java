package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class FlatModel extends ModelBase {

	private ModelRenderer gun1;

	public FlatModel() {
		textureWidth = 64;
		textureHeight = 64;

		gun1 = new ModelRenderer(this, 0, 0);
		gun1.addBox(0F, 0F, 0F, 1, 1, 0);
		gun1.setRotationPoint(0F, 0F, 0F);
		gun1.setTextureSize(64, 64);
		gun1.mirror = true;
		setRotation(gun1, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		gun1.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
