package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS50mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer Mag1_r1;

	public AS50mag() {
		textureWidth = 352;
		textureHeight = 352;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 84, 37, 0.0F, -43.3F, -30.0F, 4, 11, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 125, -0.5F, -43.3F, -37.0F, 5, 10, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 84, 116, -0.5F, -43.28F, -28.5F, 5, 11, 7, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 64, 117, 2.9F, -45.3F, -27.8F, 1, 2, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 119, 37, -0.1F, -44.3F, -35.8F, 1, 1, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 119, 46, 2.9F, -44.3F, -35.8F, 1, 1, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 119, 0, -0.1F, -45.3F, -27.8F, 1, 2, 8, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 35, -0.5F, -43.3F, -20.0F, 5, 12, 1, 0.0F, false));

		Mag1_r1 = new ModelRenderer(this);
		Mag1_r1.setRotationPoint(0.0F, 6.0924F, -5.9886F);
		mag.addChild(Mag1_r1);
		setRotationAngle(Mag1_r1, -0.1571F, 0.0F, 0.0F);
		Mag1_r1.cubeList.add(new ModelBox(Mag1_r1, 84, 145, -0.5F, -36.0F, -36.7F, 5, 2, 18, 0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
