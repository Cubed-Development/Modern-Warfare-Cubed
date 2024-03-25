package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Bat extends ModelWithAttachments {
	private final ModelRenderer bone;
	private final ModelRenderer Handle6_r1;
	private final ModelRenderer Handle5_r1;

	public Bat() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -48.0F, 0.0F, 4, 22, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -5.0F, 0.0F, 4, 1, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -5.3F, 0.5F, 3, 1, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -17.3F, 0.5F, 1, 12, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -17.3F, 1.5F, 3, 12, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -50.0F, 0.0F, 2, 33, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -50.0F, 1.0F, 4, 33, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -50.5F, 1.0F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -48.0F, 1.0F, 5, 24, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.0F, -48.0F, -0.5F, 2, 24, 5, 0.0F, true));

		Handle6_r1 = new ModelRenderer(this);
		Handle6_r1.setRotationPoint(0.842F, 0.0F, -2.084F);
		bone.addChild(Handle6_r1);
		setRotationAngle(Handle6_r1, 0.0F, -0.7679F, 0.0F);
		Handle6_r1.cubeList.add(new ModelBox(Handle6_r1, 0, 0, 3.2F, -17.3F, 0.6F, 1, 12, 3, 0.0F, true));

		Handle5_r1 = new ModelRenderer(this);
		Handle5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Handle5_r1);
		setRotationAngle(Handle5_r1, 0.0F, 0.7679F, 0.0F);
		Handle5_r1.cubeList.add(new ModelBox(Handle5_r1, 0, 0, -0.5F, -17.3F, 1.4F, 1, 12, 3, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}