package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class S710TricunActionEjector extends ModelWithAttachments {
	private final ModelRenderer action_ejector;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;

	public S710TricunActionEjector() {
		textureWidth = 200;
		textureHeight = 200;

		action_ejector = new ModelRenderer(this);
		action_ejector.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-3.4F, -37.95F, -20.0F);
		action_ejector.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, 0.1745F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 6, 41, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(-3.4F, -37.95F, -20.0F);
		action_ejector.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, 0.0F, -0.7418F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 26, 39, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action_ejector.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
