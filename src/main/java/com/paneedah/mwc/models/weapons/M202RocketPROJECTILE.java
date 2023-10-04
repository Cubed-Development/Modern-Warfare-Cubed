package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M202RocketPROJECTILE extends ModelWithAttachments {
	private final ModelRenderer proyectile;

	public M202RocketPROJECTILE() {
		textureWidth = 256;
		textureHeight = 256;

		proyectile = new ModelRenderer(this);
		proyectile.setRotationPoint(-0.5F, -1.5F, 1.0F);
		setRotationAngle(proyectile, -1.5708F, 0.0F, 0.0F);
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, -3.0F, -8.0F, 5, 1, 42, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, 2.0F, -8.0F, 5, 1, 42, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, 2.0F, -2.5F, -8.0F, 1, 5, 42, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -3.0F, -2.5F, -8.0F, 1, 5, 42, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, -2.5F, 32.0F, 5, 5, 1, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, -0.5F, 32.5F, 5, 1, 1, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, 2.5F, -2.5F, -25.0F, 1, 5, 17, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -3.5F, -2.5F, -25.0F, 1, 5, 17, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, -3.5F, -25.0F, 5, 1, 17, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, 2.5F, -25.0F, 5, 1, 17, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -2.5F, -2.5F, -26.0F, 5, 5, 1, 0.0F, true));
		proyectile.cubeList.add(new ModelBox(proyectile, 0, 0, -0.5F, -0.5F, -26.5F, 1, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		proyectile.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}