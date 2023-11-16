package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SCPLocker extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer locker13_r1;
	private final ModelRenderer locker12_r1;

	public SCPLocker() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5F, -45.0F, -7.0F, 1, 45, 14, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -35.0F, -7.3F, 9, 32, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -44.0F, -7.3F, 1, 9, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.5F, -44.0F, -7.3F, 1, 9, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -44.0F, -7.3F, 9, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -39.5F, -7.2F, 9, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 5.5F, -45.0F, -7.0F, 1, 45, 14, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5F, -45.0F, 6.0F, 12, 45, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -45.4F, -7.0F, 11, 2, 13, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -38.5F, -7.2F, 1, 4, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.5F, -38.5F, -7.2F, 1, 4, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -43.2F, -7.2F, 4, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -3.0F, -7.0F, 11, 3, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.5F, -35.0F, -7.3F, 2, 11, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.5F, -18.0F, -7.3F, 2, 15, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.5F, -24.0F, -7.1F, 2, 6, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.0F, -23.5F, -7.3F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 70, 4.0F, -21.5F, -7.2F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 80, 4.0F, -19.5F, -7.2F, 1, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 90, -4.5F, -43.0F, -6.3F, 9, 8, 1, 0.0F, true));

		locker13_r1 = new ModelRenderer(this);
		locker13_r1.setRotationPoint(-31.2364F, -22.0813F, 0.0F);
		bone.addChild(locker13_r1);
		setRotationAngle(locker13_r1, 0.0F, 0.0F, 1.0038F);
		locker13_r1.cubeList.add(new ModelBox(locker13_r1, 0, 0, -0.5F, -39.5F, -7.2F, 5, 1, 1, 0.0F, true));

		locker12_r1 = new ModelRenderer(this);
		locker12_r1.setRotationPoint(31.2363F, -22.0811F, 0.0F);
		bone.addChild(locker12_r1);
		setRotationAngle(locker12_r1, 0.0F, 0.0F, -1.0038F);
		locker12_r1.cubeList.add(new ModelBox(locker12_r1, 0, 0, -4.5F, -39.5F, -7.2F, 5, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}