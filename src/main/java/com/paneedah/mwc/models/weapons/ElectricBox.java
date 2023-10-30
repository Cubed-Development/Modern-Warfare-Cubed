package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ElectricBox extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;

	public ElectricBox() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0264F, 7.0F, 3.9276F);
		setRotationAngle(bone, 0.0F, 3.1416F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 20, 0, -2.7986F, -7.01F, -0.6682F, 8, 14, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 74, -3.0128F, -6.5F, -0.4836F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 74, -3.0128F, 5.5F, -0.4836F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 70, 3.3242F, -1.5F, -0.3646F, 1, 3, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 20.5F, 7.0F);
		setRotationAngle(bone2, 0.0F, -0.7854F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 49, -0.5F, -6.5F, -1.0F, 1, 13, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 20.5F, 7.0F);
		setRotationAngle(bone3, 0.0F, 0.7854F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 20, 34, -0.5F, -6.5F, -1.0F, 1, 13, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 18, 16, -5.0F, -24.0F, 4.0F, 10, 14, 4, 0.0F, false));
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
