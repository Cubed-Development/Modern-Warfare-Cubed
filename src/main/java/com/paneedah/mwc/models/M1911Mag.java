package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;

	public M1911Mag() {
		textureWidth = 160;
		textureHeight = 160;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-0.6F, 22.1638F, 6.2899F);
		

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.2618F, 0.0F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 64, 29, -3.5F, -32.2373F, -2.4597F, 3, 18, 6, -0.01F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(0.0F, 0.522F, -9.2562F);
		mag.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, -0.1047F, 0.0F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 58, 81, -3.5F, -32.8802F, -2.0934F, 1, 1, 3, 0.0F, false));
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 82, 56, -1.5F, -32.8802F, -2.0934F, 1, 1, 3, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(0.0F, -6.5035F, 10.6156F);
		mag.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.5673F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 0, 83, -1.5F, -31.7802F, -5.0934F, 1, 1, 3, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 29, 15, -1.5F, -31.7802F, -2.6934F, 1, 1, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 51, 35, -3.5F, -31.7802F, -2.6934F, 1, 1, 1, 0.0F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 72, 83, -3.5F, -31.7802F, -5.0934F, 1, 1, 3, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(0.0F, -3.5747F, -16.9899F);
		mag.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.829F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 17, 12, -3.5F, -14.7194F, -1.2648F, 3, 1, 1, 0.0F, false));
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 26, 5, -3.5F, -15.5194F, -1.2648F, 3, 1, 1, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.0F, 0.485F, -2.9258F);
		mag.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.1309F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 51, 20, -3.8F, -14.5432F, -3.0196F, 1, 1, 5, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 28, 81, -3.2F, -14.5432F, -3.0196F, 3, 1, 5, -0.001F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 80, 83, -3.8F, -14.5432F, 1.7804F, 1, 1, 3, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 8, 12, -3.2F, -14.5432F, 1.7804F, 3, 1, 3, -0.001F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 49, 4, -3.8F, -14.7432F, 2.7804F, 1, 1, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 24, 25, -3.2F, -14.7432F, 2.7804F, 3, 1, 2, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 20, 8, -3.8F, -15.2432F, -1.2196F, 1, 1, 6, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 20, 53, -3.8F, -14.7432F, -3.0196F, 1, 1, 6, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 36, 62, -3.2F, -15.2432F, -1.2196F, 3, 1, 6, 0.0F, false));
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 28, 116, -3.2F, -14.7432F, -3.0196F, 3, 1, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
