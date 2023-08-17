package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1MagExt extends ModelWithAttachments {
	private final ModelRenderer magazine_ext;
	private final ModelRenderer cube_r142_r1;
	private final ModelRenderer cube_r141_r1;
	private final ModelRenderer cube_r140_r1;
	private final ModelRenderer cube_r139_r1;
	private final ModelRenderer cube_r138_r1;
	private final ModelRenderer cube_r137_r1;

	public DSR1MagExt() {
		textureWidth = 400;
		textureHeight = 400;

		magazine_ext = new ModelRenderer(this);
		magazine_ext.setRotationPoint(0.0F, -3.0F, 7.1F);
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 66, 91, -1.2F, -5.4F, 0.0F, 1, 5, 10, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 0, 0, -2.8F, -5.4F, 0.0F, 2, 5, 10, -0.001F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 26, 92, -3.0F, -0.4F, -0.25F, 3, 7, 5, 0.1F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 0, 69, -0.75F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 41, 21, -0.35F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 86, 68, -0.35F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 86, 63, -0.35F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 35, 21, -0.35F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 68, 46, -0.75F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 105, 28, -0.75F, 0.499F, 5.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 58, 69, -0.75F, 0.499F, 2.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 21, 77, -0.75F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 23, 31, -3.65F, -0.79F, 3.25F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 74, 41, -3.65F, 0.61F, 4.65F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 15, 31, -3.65F, -0.79F, 5.65F, 1, 2, 1, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 74, 28, -3.65F, 0.61F, 3.25F, 1, 1, 2, -0.3F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 55, 63, -3.25F, 0.499F, 2.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 74, 18, -3.25F, 0.799F, 3.95F, 1, 1, 2, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 58, 14, -3.25F, 0.499F, 5.95F, 1, 6, 1, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 68, 41, -3.25F, -0.501F, 5.95F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 35, 21, -3.25F, -0.501F, -0.05F, 1, 1, 4, 0.0F, false));
		magazine_ext.cubeList.add(new ModelBox(magazine_ext, 129, 82, -3.0F, -0.4F, 4.15F, 3, 7, 6, 0.101F, false));

		cube_r142_r1 = new ModelRenderer(this);
		cube_r142_r1.setRotationPoint(3.3052F, 26.8284F, -7.1F);
		magazine_ext.addChild(cube_r142_r1);
		setRotationAngle(cube_r142_r1, 0.0F, 0.0F, -0.1222F);
		cube_r142_r1.cubeList.add(new ModelBox(cube_r142_r1, 39, 37, -0.75F, -30.101F, 11.05F, 1, 3, 2, 0.0F, false));

		cube_r141_r1 = new ModelRenderer(this);
		cube_r141_r1.setRotationPoint(-3.3276F, 27.1941F, -7.1F);
		magazine_ext.addChild(cube_r141_r1);
		setRotationAngle(cube_r141_r1, 0.0F, 0.0F, 0.1222F);
		cube_r141_r1.cubeList.add(new ModelBox(cube_r141_r1, 22, 37, -3.25F, -30.101F, 11.05F, 1, 3, 2, 0.0F, false));

		cube_r140_r1 = new ModelRenderer(this);
		cube_r140_r1.setRotationPoint(2.4855F, 26.9045F, -7.1F);
		magazine_ext.addChild(cube_r140_r1);
		setRotationAngle(cube_r140_r1, 0.0F, 0.0F, -0.0873F);
		cube_r140_r1.cubeList.add(new ModelBox(cube_r140_r1, 21, 82, -0.85F, -27.501F, 11.05F, 1, 1, 2, 0.0F, false));

		cube_r139_r1 = new ModelRenderer(this);
		cube_r139_r1.setRotationPoint(2.4506F, 26.9061F, -7.1F);
		magazine_ext.addChild(cube_r139_r1);
		setRotationAngle(cube_r139_r1, 0.0F, 0.0F, -0.0873F);
		cube_r139_r1.cubeList.add(new ModelBox(cube_r139_r1, 6, 82, -0.85F, -27.101F, 11.05F, 1, 1, 2, -0.001F, false));

		cube_r138_r1 = new ModelRenderer(this);
		cube_r138_r1.setRotationPoint(-2.4969F, 27.1661F, -7.1F);
		magazine_ext.addChild(cube_r138_r1);
		setRotationAngle(cube_r138_r1, 0.0F, 0.0F, 0.0873F);
		cube_r138_r1.cubeList.add(new ModelBox(cube_r138_r1, 6, 77, -3.15F, -27.501F, 11.05F, 1, 1, 2, 0.0F, false));

		cube_r137_r1 = new ModelRenderer(this);
		cube_r137_r1.setRotationPoint(-2.462F, 27.1676F, -7.1F);
		magazine_ext.addChild(cube_r137_r1);
		setRotationAngle(cube_r137_r1, 0.0F, 0.0F, 0.0873F);
		cube_r137_r1.cubeList.add(new ModelBox(cube_r137_r1, 74, 46, -3.15F, -27.101F, 11.05F, 1, 1, 2, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine_ext.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
