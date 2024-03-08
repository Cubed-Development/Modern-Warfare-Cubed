package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUG9mmMag extends ModelWithAttachments {
	private final ModelRenderer magazine9mm;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag3_r1;

	public AUG9mmMag() {
		textureWidth = 270;
		textureHeight = 270;

		magazine9mm = new ModelRenderer(this);
		magazine9mm.setRotationPoint(-1.5F, 8.8816F, 13.4876F);
		

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(1.5F, 14.678F, -14.3755F);
		magazine9mm.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -0.0372F, 0.0F, 0.0F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 110, 6, -1.4F, -12.1F, 11.4F, 1, 1, 5, 0.0F, false));
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 110, 16, -2.6F, -12.1F, 11.4F, 1, 1, 5, 0.0F, false));

		mag3_r1 = new ModelRenderer(this);
		mag3_r1.setRotationPoint(1.5F, 14.6743F, -14.3754F);
		magazine9mm.addChild(mag3_r1);
		setRotationAngle(mag3_r1, -0.0372F, 0.0F, 0.0F);
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 46, 60, -2.0F, -26.1F, 11.3F, 1, 15, 1, 0.0F, false));
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 18, 60, -2.5F, -26.1F, 15.5F, 2, 15, 1, 0.0F, false));
		mag3_r1.cubeList.add(new ModelBox(mag3_r1, 134, 41, -2.5F, -26.1F, 11.5F, 2, 15, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine9mm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}