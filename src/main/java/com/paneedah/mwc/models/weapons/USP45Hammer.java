package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class USP45Hammer extends ModelWithAttachments {
	private final ModelRenderer hammer;
	private final ModelRenderer gun234;
	private final ModelRenderer gun294;

	public USP45Hammer() {
		textureWidth = 128;
		textureHeight = 128;

		hammer = new ModelRenderer(this);
		hammer.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun234 = new ModelRenderer(this);
		gun234.setRotationPoint(-2.0F, -34.7F, 1.5F);
		hammer.addChild(gun234);
		setRotationAngle(gun234, 0.2603F, 0.0F, 0.0F);
		gun234.cubeList.add(new ModelBox(gun234, 23, 0, -0.001F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun294 = new ModelRenderer(this);
		gun294.setRotationPoint(-2.0F, -33.7F, 1.5F);
		hammer.addChild(gun294);
		setRotationAngle(gun294, 0.1487F, 0.0F, 0.0F);
		gun294.cubeList.add(new ModelBox(gun294, 72, 72, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hammer.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
