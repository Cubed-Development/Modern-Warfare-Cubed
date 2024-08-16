package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinPanelLower extends ModelWithAttachments {
	private final ModelRenderer panel_lower_EXTRA2;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;

	public NinthSinPanelLower() {
		textureWidth = 128;
		textureHeight = 128;

		panel_lower_EXTRA2 = new ModelRenderer(this);
		panel_lower_EXTRA2.setRotationPoint(-9.6F, 9.75F, -4.5F);
		panel_lower_EXTRA2.cubeList.add(new ModelBox(panel_lower_EXTRA2, 0, 66, 0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, false));
		panel_lower_EXTRA2.cubeList.add(new ModelBox(panel_lower_EXTRA2, 0, 58, -0.299F, 1.3F, 0.0F, 1, 1, 7, -0.3F, false));
		panel_lower_EXTRA2.cubeList.add(new ModelBox(panel_lower_EXTRA2, 3, 67, 0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		panel_lower_EXTRA2.cubeList.add(new ModelBox(panel_lower_EXTRA2, 33, 58, 0.0F, 1.0F, 5.0F, 1, 1, 7, 0.0F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.0F, 2.0F, 0.0F);
		panel_lower_EXTRA2.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, -0.7854F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 40, 78, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(0.0F, 0.25F, 7.0F);
		panel_lower_EXTRA2.addChild(cube_r44);
		setRotationAngle(cube_r44, -0.1571F, 0.0F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 112, 59, -0.001F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		panel_lower_EXTRA2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}