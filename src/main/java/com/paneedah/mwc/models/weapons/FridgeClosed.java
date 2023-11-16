package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FridgeClosed extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer bone2_r1;
	private final ModelRenderer bone_r1;

	public FridgeClosed() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 99, -5.0245F, -30.0F, -8.0245F, 1, 8, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 80, -6.0245F, -31.0F, -7.0245F, 12, 10, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 80, -5.0F, -19.0F, -8.25F, 1, 16, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 80, -6.0F, -20.0F, -7.25F, 12, 18, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 100, 94, -5.0603F, -16.5F, -6.25F, 10, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 100, 94, -5.0603F, -10.5F, -6.25F, 10, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 99, 4.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 102, 4.0F, -1.0F, -6.5F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 46, -3.0F, -33.0353F, -7.5F, 6, 2, 15, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 96, 42, 6.0F, -32.0F, -7.5F, 1, 31, 15, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 75, 6, -6.0F, -32.0F, 6.5F, 12, 31, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 54, 103, -6.0F, -21.0F, -7.5F, 12, 1, 14, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 54, 103, -6.0F, -2.0F, -7.5F, 12, 1, 14, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -32.0F, -7.5F, 1, 31, 15, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 4, 105, -6.0F, -1.0F, -6.5F, 2, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 99, -6.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(-8.6705F, -1.1415F, 0.0F);
		bone.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, 0.2618F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 38, 46, 3.0F, -33.8628F, -7.5F, 4, 2, 15, 0.0F, false));

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(8.6705F, -1.1415F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, -0.2618F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 63, -7.0F, -33.8628F, -7.5F, 4, 2, 15, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}