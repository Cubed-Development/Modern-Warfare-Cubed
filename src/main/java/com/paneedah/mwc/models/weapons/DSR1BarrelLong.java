package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1BarrelLong extends ModelWithAttachments {
	private final ModelRenderer barrel_long;
	private final ModelRenderer cube_r123_r1;
	private final ModelRenderer cube_r122_r1;
	private final ModelRenderer cube_r121_r1;
	private final ModelRenderer cube_r120_r1;

	public DSR1BarrelLong() {
		textureWidth = 400;
		textureHeight = 400;

		barrel_long = new ModelRenderer(this);
		barrel_long.setRotationPoint(0.0F, 24.0F, -19.0F);
		barrel_long.cubeList.add(new ModelBox(barrel_long, 69, 124, -2.0F, -36.088F, -59.5F, 1, 2, 59, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 68, 0, -2.5F, -35.588F, -59.5F, 2, 1, 59, -0.001F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 66, 63, -2.5F, -36.088F, -59.701F, 2, 2, 59, -0.2F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 130, 134, -2.0F, -34.838F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 131, 10, -2.0F, -36.338F, -67.5F, 1, 1, 9, 0.0F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 131, 0, -1.25F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));
		barrel_long.cubeList.add(new ModelBox(barrel_long, 130, 124, -2.75F, -35.588F, -67.5F, 1, 1, 9, -0.001F, false));

		cube_r123_r1 = new ModelRenderer(this);
		cube_r123_r1.setRotationPoint(25.0913F, -10.6003F, 19.0F);
		barrel_long.addChild(cube_r123_r1);
		setRotationAngle(cube_r123_r1, 0.0F, 0.0F, -0.7854F);
		cube_r123_r1.cubeList.add(new ModelBox(cube_r123_r1, 129, 112, -1.25F, -36.588F, -86.5F, 1, 1, 9, -0.002F, false));

		cube_r122_r1 = new ModelRenderer(this);
		cube_r122_r1.setRotationPoint(24.3842F, -10.3074F, 19.0F);
		barrel_long.addChild(cube_r122_r1);
		setRotationAngle(cube_r122_r1, 0.0F, 0.0F, -0.7854F);
		cube_r122_r1.cubeList.add(new ModelBox(cube_r122_r1, 104, 106, -1.25F, -35.588F, -86.5F, 1, 1, 9, -0.002F, false));

		cube_r121_r1 = new ModelRenderer(this);
		cube_r121_r1.setRotationPoint(-25.97F, -8.479F, 19.0F);
		barrel_long.addChild(cube_r121_r1);
		setRotationAngle(cube_r121_r1, 0.0F, 0.0F, 0.7854F);
		cube_r121_r1.cubeList.add(new ModelBox(cube_r121_r1, 66, 106, -2.75F, -36.588F, -86.5F, 1, 1, 9, -0.002F, false));

		cube_r120_r1 = new ModelRenderer(this);
		cube_r120_r1.setRotationPoint(-25.2629F, -8.1861F, 19.0F);
		barrel_long.addChild(cube_r120_r1);
		setRotationAngle(cube_r120_r1, 0.0F, 0.0F, 0.7854F);
		cube_r120_r1.cubeList.add(new ModelBox(cube_r120_r1, 93, 105, -2.75F, -35.588F, -86.5F, 1, 1, 9, -0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		barrel_long.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
