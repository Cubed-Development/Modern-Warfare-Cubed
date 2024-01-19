package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class StonerA1HATCH extends ModelWithAttachments {
	private final ModelRenderer hatch;
	private final ModelRenderer Hatch11_r1;

	public StonerA1HATCH() {
		textureWidth = 256;
		textureHeight = 256;

		hatch = new ModelRenderer(this);
		hatch.setRotationPoint(-14.2791F, 18.9461F, 0.0F);
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 11.2791F, -27.9461F, 38.0F, 7, 1, 1, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 12.2791F, -27.9461F, 38.0F, 5, 1, 4, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 12.2791F, -27.4461F, 40.0F, 5, 1, 3, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 12.2791F, -26.4461F, 41.0F, 5, 1, 2, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 11.7791F, -28.9461F, 37.0F, 1, 3, 4, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 16.7791F, -28.9461F, 37.0F, 1, 3, 4, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 13.2791F, -28.7461F, 52.0F, 3, 2, 2, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 17.2791F, -28.9461F, 42.0F, 1, 2, 10, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 12.1791F, -27.9461F, 39.5F, 1, 1, 1, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 12.2791F, -28.9461F, 40.0F, 5, 1, 12, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 11.2791F, -28.4461F, 45.0F, 1, 2, 7, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 11.2791F, -26.4461F, 45.0F, 1, 1, 1, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 11.2791F, -26.4461F, 50.0F, 1, 1, 2, 0.0F, true));
		hatch.cubeList.add(new ModelBox(hatch, 0, 0, 11.2791F, -28.4461F, 41.0F, 1, 3, 4, 0.0F, true));

		Hatch11_r1 = new ModelRenderer(this);
		Hatch11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		hatch.addChild(Hatch11_r1);
		setRotationAngle(Hatch11_r1, 0.0F, 0.0F, 0.4461F);
		Hatch11_r1.cubeList.add(new ModelBox(Hatch11_r1, 0, 0, 4.4F, -34.0F, 42.0F, 1, 1, 10, 0.0F, true));
		Hatch11_r1.cubeList.add(new ModelBox(Hatch11_r1, 0, 0, 4.0F, -34.0F, 42.0F, 1, 1, 10, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hatch.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
