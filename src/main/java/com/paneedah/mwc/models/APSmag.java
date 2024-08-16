package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APSmag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer mag7;
	private final ModelRenderer mag6;
	private final ModelRenderer mag5;
	private final ModelRenderer mag3;
	private final ModelRenderer mag2;
	private final ModelRenderer mag4;
	private final ModelRenderer mag1;

	public APSmag() {
		textureWidth = 150;
		textureHeight = 150;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		mag7 = new ModelRenderer(this);
		mag7.setRotationPoint(-2.5F, -28.7F, -5.4F);
		mag.addChild(mag7);
		setRotationAngle(mag7, 0.2231F, 0.0F, 0.0F);
		mag7.cubeList.add(new ModelBox(mag7, 70, 81, -0.4F, 0.3F, 0.2F, 2, 13, 3, 0.0F, false));
		mag7.cubeList.add(new ModelBox(mag7, 70, 81, 0.4F, 0.3F, 0.2F, 2, 13, 3, 0.0F, false));

		mag6 = new ModelRenderer(this);
		mag6.setRotationPoint(-3.0F, -17.7F, -2.4F);
		mag.addChild(mag6);
		mag6.cubeList.add(new ModelBox(mag6, 93, 68, 0.0F, 0.9F, 0.0F, 3, 2, 3, 0.0F, false));
		mag6.cubeList.add(new ModelBox(mag6, 118, 62, -0.001F, 0.899F, 2.6F, 3, 2, 1, 0.0F, false));

		mag5 = new ModelRenderer(this);
		mag5.setRotationPoint(-3.0F, -30.4F, -5.6F);
		mag.addChild(mag5);
		setRotationAngle(mag5, 0.1487F, 0.0F, 0.0F);
		mag5.cubeList.add(new ModelBox(mag5, 88, 8, 0.001F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-3.0F, -29.9F, -6.4F);
		mag.addChild(mag3);
		setRotationAngle(mag3, 0.2231F, 0.0F, 0.0F);
		mag3.cubeList.add(new ModelBox(mag3, 0, 111, -0.001F, 0.3F, 0.0F, 3, 15, 1, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-0.3F, -15.9F, -4.6F);
		mag.addChild(mag2);
		setRotationAngle(mag2, -0.0744F, 0.0F, 0.0F);
		

		mag4 = new ModelRenderer(this);
		mag4.setRotationPoint(-3.0F, -29.9F, -3.4F);
		mag.addChild(mag4);
		setRotationAngle(mag4, 0.2231F, 0.0F, 0.0F);
		mag4.cubeList.add(new ModelBox(mag4, 12, 111, 0.0F, 0.3F, 0.9F, 3, 15, 1, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.7F, -15.9F, -4.6F);
		mag.addChild(mag1);
		setRotationAngle(mag1, -0.0744F, 0.0F, 0.0F);
		mag1.cubeList.add(new ModelBox(mag1, 0, 14, 0.2F, 0.1F, 0.0F, 4, 1, 6, 0.0F, false));
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