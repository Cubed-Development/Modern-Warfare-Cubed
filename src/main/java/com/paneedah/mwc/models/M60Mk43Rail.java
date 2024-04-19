package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Mk43Rail extends ModelWithAttachments {
	private final ModelRenderer Mk43Rail;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public M60Mk43Rail() {
		textureWidth = 16;
		textureHeight = 16;

		Mk43Rail = new ModelRenderer(this);
		Mk43Rail.setRotationPoint(-1.0F, 24.0F, -3.0F);
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, -1, -1, -1.0F, -49.5F, 3.0F, 2, 1, 3, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 0, 0, -1.0F, -49.5F, -12.4F, 2, 1, 2, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, -20, -20, -1.5F, -50.5F, -13.0F, 3, 1, 22, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, 8.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, -2.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, 0.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, 2.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, -8.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, -6.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, -4.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 0, 0, -1.0F, -51.3F, -13.0F, 2, 1, 2, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, -10.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, 6.0F, 2, 1, 1, 0.0F, false));
		Mk43Rail.cubeList.add(new ModelBox(Mk43Rail, 1, 1, -1.0F, -51.3F, 4.0F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -50.3F, -6.0F);
		Mk43Rail.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 10.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 12.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 14.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, -4.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -1.4F, -7.0F, 1, 1, 2, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 2.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 0.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, -2.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 8.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 6.0F, 1, 1, 1, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 1, 1, 0.0F, -1.4F, 4.0F, 1, 1, 1, 0.0F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -50.3F, -6.0F);
		Mk43Rail.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 10.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 12.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, -4.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -1.4F, -7.0F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 2.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 0.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, -2.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 8.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 4.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 1, 1, -1.0F, -1.4F, 14.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Mk43Rail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
