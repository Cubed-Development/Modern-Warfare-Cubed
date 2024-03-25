// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class VehicleKey extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer KEY3_r1;
	private final ModelRenderer KEY6_r1;
	private final ModelRenderer KEY5_r1;
	private final ModelRenderer KEY4_r1;
	private final ModelRenderer KEY2_r1;

	public VehicleKey() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 2, -5.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 18, -6.0F, -3.0F, -7.03F, 10, 5, 8, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 12, -5.0F, -1.0F, -9.0F, 8, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 4, 2.0F, -1.0F, -8.0F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 18, 1, -1.5F, 0.5F, 7.9F, 1, 1, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 27, 31, -6.0F, -2.0F, 0.9F, 10, 4, 7, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 7, -1.5F, -1.85F, 7.9F, 1, 1, 5, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 17, -1.5F, -1.5F, 7.9F, 1, 1, 16, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -1.0F, 7.9F, 1, 1, 16, 0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -0.5F, 7.9F, 1, 1, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, 0.25F, 15.9F, 1, 1, 1, -0.001F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 17, -1.5F, 0.25F, 19.4F, 1, 1, 4, -0.001F, false));

		KEY3_r1 = new ModelRenderer(this);
		KEY3_r1.setRotationPoint(4.0F, -3.0F, 7.9F);
		bone.addChild(KEY3_r1);
		setRotationAngle(KEY3_r1, -0.1396F, 0.0F, 0.0F);
		KEY3_r1.cubeList.add(new ModelBox(KEY3_r1, 0, 35, -10.0F, 1.0F, -7.0F, 10, 1, 7, -0.001F, false));

		KEY6_r1 = new ModelRenderer(this);
		KEY6_r1.setRotationPoint(3.0F, -4.2F, 0.3F);
		bone.addChild(KEY6_r1);
		setRotationAngle(KEY6_r1, 0.0873F, 0.0F, 0.0F);
		KEY6_r1.cubeList.add(new ModelBox(KEY6_r1, 36, 0, -8.0F, 0.6F, -7.0F, 8, 1, 3, 0.0F, false));

		KEY5_r1 = new ModelRenderer(this);
		KEY5_r1.setRotationPoint(3.0F, -4.2F, -0.15F);
		bone.addChild(KEY5_r1);
		setRotationAngle(KEY5_r1, 0.0873F, 0.0F, 0.0F);
		KEY5_r1.cubeList.add(new ModelBox(KEY5_r1, 36, 4, -8.0F, 0.6F, -3.0F, 8, 1, 3, 0.0F, false));

		KEY4_r1 = new ModelRenderer(this);
		KEY4_r1.setRotationPoint(3.0F, -4.2F, 0.4F);
		bone.addChild(KEY4_r1);
		setRotationAngle(KEY4_r1, -0.1571F, 0.0F, 0.0F);
		KEY4_r1.cubeList.add(new ModelBox(KEY4_r1, 36, 8, -8.0F, 0.6F, 0.0F, 8, 1, 3, 0.0F, false));

		KEY2_r1 = new ModelRenderer(this);
		KEY2_r1.setRotationPoint(2.8F, 12.0F, 9.2F);
		bone.addChild(KEY2_r1);
		setRotationAngle(KEY2_r1, 0.0F, -0.3316F, 0.0F);
		KEY2_r1.cubeList.add(new ModelBox(KEY2_r1, 7, 7, -8.0F, -15.0F, -2.0F, 2, 1, 2, 0.0F, false));
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.rotateAngleX = (float) Math.toRadians(f);
		bone.rotateAngleY = (float) Math.toRadians(f1);
		bone.rotateAngleZ = (float) Math.toRadians(f2);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
