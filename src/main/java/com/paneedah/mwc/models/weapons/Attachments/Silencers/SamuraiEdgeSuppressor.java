package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SamuraiEdgeSuppressor extends ModelWithAttachments {
	private final ModelRenderer samurai_edge_suppressor;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;

	public SamuraiEdgeSuppressor() {
		textureWidth = 200;
		textureHeight = 200;

		samurai_edge_suppressor = new ModelRenderer(this);
		samurai_edge_suppressor.setRotationPoint(-0.7F, -14.2F, -59.4F);
		samurai_edge_suppressor.cubeList.add(new ModelBox(samurai_edge_suppressor, 33, 4, -0.5F, 1.6F, 0.0F, 2, 4, 27, 0.0F, false));
		samurai_edge_suppressor.cubeList.add(new ModelBox(samurai_edge_suppressor, 0, 0, -3.1F, 1.6F, 0.0F, 3, 4, 27, -0.001F, false));
		samurai_edge_suppressor.cubeList.add(new ModelBox(samurai_edge_suppressor, 0, 61, -1.8F, 0.0F, 0.0F, 2, 2, 27, -0.001F, false));
		samurai_edge_suppressor.cubeList.add(new ModelBox(samurai_edge_suppressor, 33, 35, -1.8F, 5.2F, 0.0F, 2, 2, 27, -0.002F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-1.8F, 7.2F, 0.0F);
		samurai_edge_suppressor.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, 0.0F, -0.6807F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 64, 29, 0.03F, -2.03F, 0.03F, 1, 2, 27, 0.031F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(0.2F, 7.2F, 0.0F);
		samurai_edge_suppressor.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 0.0F, 0.6807F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 64, 0, -1.03F, -2.03F, 0.03F, 1, 2, 27, 0.031F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-1.8F, 0.0F, 0.0F);
		samurai_edge_suppressor.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, 0.0F, 0.6807F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 31, 64, 0.03F, 0.03F, 0.03F, 1, 2, 27, 0.031F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(0.2F, 0.0F, 0.0F);
		samurai_edge_suppressor.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 0.0F, -0.6807F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 64, 58, -1.03F, 0.03F, 0.03F, 1, 2, 27, 0.031F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		samurai_edge_suppressor.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}