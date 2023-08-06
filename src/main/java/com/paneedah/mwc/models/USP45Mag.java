package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class USP45Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer mag4;
	private final ModelRenderer mag3;
	private final ModelRenderer mag1;
	private final ModelRenderer mag2;

	public USP45Mag() {
		textureWidth = 128;
		textureHeight = 128;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-3.0F, -16.9F, -5.0F);
		mag.addChild(mag4);
		setRotationAngle(mag4, 0.1859F, 0.0F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 0, 32, 0.0F, -14.0F, 0.0F, 3, 15, 6, 0.0F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-3.5F, -16.9F, -4.8F);
		mag.addChild(mag3);
		setRotationAngle(mag3, 0.0744F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 63, 63, 0.001F, 1.0F, -1.3F, 4, 1, 2, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.5F, -16.9F, -4.8F);
		mag.addChild(mag1);
		setRotationAngle(mag1, 0.0744F, 0.0F, 0.0F);
		mag1.cubeList.add(new ModelBox(mag1, 98, 88, 0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-3.0F, -16.9F, -4.8F);
		mag.addChild(mag2);
		setRotationAngle(mag2, 0.0744F, 0.0F, 0.0F);
		mag2.cubeList.add(new ModelBox(mag2, 58, 11, 0.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, false));
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