package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1BoltAction extends ModelWithAttachments {
	private final ModelRenderer boltaction;
	private final ModelRenderer cube_r125_r1;
	private final ModelRenderer cube_r124_r1;

	public DSR1BoltAction() {
		textureWidth = 400;
		textureHeight = 400;

		boltaction = new ModelRenderer(this);
		boltaction.setRotationPoint(0.1F, 24.25F, -12.0F);
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 31, -3.3F, -35.6F, 18.5F, 1, 3, 13, -0.1F, false));

		cube_r125_r1 = new ModelRenderer(this);
		cube_r125_r1.setRotationPoint(29.6159F, -22.2604F, 12.0F);
		boltaction.addChild(cube_r125_r1);
		setRotationAngle(cube_r125_r1, 0.0F, 0.0F, -1.0996F);
		cube_r125_r1.cubeList.add(new ModelBox(cube_r125_r1, 32, 31, -3.2F, -35.35F, 6.5F, 1, 1, 13, -0.1F, false));

		cube_r124_r1 = new ModelRenderer(this);
		cube_r124_r1.setRotationPoint(-33.7936F, -18.5697F, 12.0F);
		boltaction.addChild(cube_r124_r1);
		setRotationAngle(cube_r124_r1, 0.0F, 0.0F, 1.0996F);
		cube_r124_r1.cubeList.add(new ModelBox(cube_r124_r1, 32, 45, -1.77F, -36.5F, 6.5F, 1, 1, 13, -0.101F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}