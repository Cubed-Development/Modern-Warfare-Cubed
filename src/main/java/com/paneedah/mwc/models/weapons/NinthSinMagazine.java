package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinMagazine extends ModelWithAttachments {
	private final ModelRenderer energy_cell_MAGAZINE;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;

	public NinthSinMagazine() {
		textureWidth = 128;
		textureHeight = 128;

		energy_cell_MAGAZINE = new ModelRenderer(this);
		energy_cell_MAGAZINE.setRotationPoint(-7.5F, 8.75F, -4.0F);
		energy_cell_MAGAZINE.cubeList.add(new ModelBox(energy_cell_MAGAZINE, 0, 75, 0.0F, -1.0F, 0.0F, 1, 4, 12, 0.0F, false));
		energy_cell_MAGAZINE.cubeList.add(new ModelBox(energy_cell_MAGAZINE, 26, 75, -1.0F, -0.5F, 0.0F, 1, 3, 12, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.0F, 3.0F, 0.0F);
		energy_cell_MAGAZINE.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.0F, 0.0F, -0.7854F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 78, 0, 0.0F, -1.0F, 0.0F, 1, 1, 12, 0.0F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(0.0F, -1.0F, 0.0F);
		energy_cell_MAGAZINE.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, 0.0F, 0.7854F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 80, 80, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		energy_cell_MAGAZINE.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
