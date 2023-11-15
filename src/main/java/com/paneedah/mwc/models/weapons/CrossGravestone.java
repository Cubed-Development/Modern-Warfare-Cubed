package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class CrossGravestone extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;

	public CrossGravestone() {
		textureWidth = 64;
		textureHeight = 64;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-6.0F, 24.0F, -4.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -2.0F, 1.0F, 12, 2, 6, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 33, 4.0F, -4.0F, 2.0F, 4, 2, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 20, 4.0F, -16.0F, 2.5F, 1, 12, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 6, 4.0F, -24.0F, 2.5F, 1, 6, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 14, 7.0F, -16.0F, 2.5F, 1, 12, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 37, 7.0F, -24.0F, 2.5F, 1, 6, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 36, 32, 5.0F, -24.0F, 2.5F, 2, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 14, 4.5F, -23.75F, 2.5F, 3, 20, 3, -0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 8, -1.5F, -18.75F, 2.501F, 15, 3, 3, -0.2F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 22, -2.0F, -19.0F, 2.501F, 6, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 25, 18, 8.0F, -19.0F, 2.501F, 6, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 38, 13.0F, -18.0F, 2.501F, 1, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 37, 37, -2.0F, -18.0F, 2.501F, 1, 2, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 28, 28, -2.0F, -16.0F, 2.501F, 6, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 14, 8.0F, -16.0F, 2.501F, 6, 1, 3, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(4.0F, -4.0F, 2.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.5585F);
		bone2.cubeList.add(new ModelBox(bone2, 24, 32, -4.0F, 0.0F, -0.01F, 4, 2, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(8.0F, -4.0F, 2.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.5585F);
		bone3.cubeList.add(new ModelBox(bone3, 30, 0, 0.0F, 0.0F, -0.01F, 4, 2, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}
