package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KBP9A91Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer mag3;
	private final ModelRenderer mag2;
	private final ModelRenderer mag1;

	public KBP9A91Mag() {
		textureWidth = 220;
		textureHeight = 220;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		mag3 = new ModelRenderer(this);
		mag3.setRotationPoint(-0.7F, -30.0F, -25.0F);
		mag.addChild(mag3);
		mag3.cubeList.add(new ModelBox(mag3, 38, 172, 0.0F, 0.0F, 0.0F, 1, 18, 6, 0.0F, false));

		mag2 = new ModelRenderer(this);
		mag2.setRotationPoint(-3.3F, -30.0F, -25.0F);
		mag.addChild(mag2);
		mag2.cubeList.add(new ModelBox(mag2, 118, 0, 0.0F, 0.001F, -0.001F, 3, 18, 6, 0.0F, false));

		mag1 = new ModelRenderer(this);
		mag1.setRotationPoint(-3.0F, -30.0F, -28.7F);
		mag.addChild(mag1);
		mag1.cubeList.add(new ModelBox(mag1, 152, 62, 0.0F, 0.0F, 0.0F, 3, 18, 4, -0.001F, false));
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