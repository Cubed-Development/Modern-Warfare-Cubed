package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer bone9;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;

	public M60Mag() {
		textureWidth = 850;
		textureHeight = 850;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(14.8F, -13.0F, -11.0F);
		mag.cubeList.add(new ModelBox(mag, 0, 51, -6.3F, -5.0F, 5.0F, 23, 18, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 0, 22, -6.3F, -5.0F, -6.6F, 23, 18, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 104, 155, 15.7F, -5.0F, -5.6F, 1, 18, 11, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 155, 51, -6.3F, -5.0F, -5.6F, 1, 18, 11, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 344, 171, -5.3F, -1.0F, -5.6F, 21, 14, 11, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(17.2F, -4.2F, -0.125F);
		mag.addChild(bone9);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.8F, -0.9F, -12.0F);
		bone9.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1745F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 0, -21.0F, -0.7F, 5.15F, 1, 3, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 208, 96, -23.0F, -0.9F, 5.15F, 24, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 178, 120, -1.0F, -0.9F, 6.525F, 2, 1, 10, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 36, 111, -21.0F, -1.6F, 10.675F, 4, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 45, -16.0F, -2.7F, 10.675F, 9, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 104, 97, -6.0F, -1.6F, 10.675F, 4, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 208, 191, -23.0F, -0.7F, 5.175F, 24, 1, 13, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 14, -21.0F, -0.7F, 17.175F, 1, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-21.1275F, -3.6719F, -6.35F);
		bone9.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.9599F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 162, 0, -2.2F, 0.4F, -0.5F, 3, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 74, -1.8F, -0.2F, -0.5F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 162, 18, -2.2F, 0.4F, 11.525F, 3, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 42, 191, -1.2F, -0.2F, 11.525F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-12.2642F, -2.1091F, -0.325F);
		bone9.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.0873F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 155, 98, -8.6F, -1.6F, -6.525F, 3, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 45, -8.6F, -1.2F, -6.525F, 12, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 41, -8.6F, -0.2F, -6.525F, 19, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 191, 51, -8.6F, -1.6F, 5.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 47, -8.6F, -1.2F, 5.5F, 12, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 43, -8.6F, -0.2F, 5.5F, 19, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-11.7433F, -5.0635F, -0.325F);
		bone9.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.0436F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 104, 46, -9.2F, -1.4F, -1.0F, 5, 1, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.8F, -0.9F, 0.025F);
		bone9.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.48F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 88, 95, -7.5F, -0.5F, -1.35F, 5, 1, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.3F, 0.025F);
		bone9.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 70, -0.8F, -0.5F, -6.2F, 1, 1, 12, 0.0F, false));
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
