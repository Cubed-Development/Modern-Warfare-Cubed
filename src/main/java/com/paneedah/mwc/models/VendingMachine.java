package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class VendingMachine extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;

	public VendingMachine() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.0F, -19.5F, 5.5F);
		setRotationAngle(bone, -0.2618F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 48, 130, -6.0F, -0.7511F, -1.4014F, 14, 3, 10, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, -19.5F, 5.5F);
		setRotationAngle(bone2, 0.2618F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 130, -6.0F, -3.5981F, -19.2238F, 14, 3, 10, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.0F, -8.0F, 2.5F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.1745F);
		bone3.cubeList.add(new ModelBox(bone3, 104, 111, -3.0F, -1.0F, -8.5F, 9, 2, 17, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 52, 111, -4.9101F, 9.8329F, -8.5F, 9, 2, 17, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 111, -6.9939F, 21.6506F, -8.5F, 9, 2, 17, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 5.0F, -42.0F, -6.0F, 2, 35, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 62, 67, -7.0F, -42.0F, 11.0F, 14, 41, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 56, 0, -7.0F, -42.0F, -14.0F, 14, 41, 8, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 74, 146, -8.0F, -29.0F, -13.0F, 1, 21, 6, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 36, 173, -6.0F, -40.0F, -6.0F, 0, 33, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 67, -7.0F, -7.0F, -6.0F, 14, 6, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 96, 67, -7.0F, -42.0F, -6.0F, 12, 2, 17, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 38, 146, -7.0F, -44.5882F, -4.3407F, 14, 3, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 162, -7.0F, -44.5882F, -0.6593F, 14, 3, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 178, -7.0F, -1.0F, 9.0F, 14, 1, 4, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 173, -7.0F, -1.0F, -13.0F, 14, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
		bone4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
