package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SpookyGhost extends ModelBase implements IModernModel {
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone_r1;
	private final ModelRenderer bone2_r1;

	public SpookyGhost() {
		textureWidth = 64;
		textureHeight = 64;

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.5F, -33.0F, -0.5F, 1, 7, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 40, 14, -11.0F, -21.0F, 0.0F, 6, 14, 0, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 48, 5.0F, -23.0F, 0.0F, 6, 14, 0, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -5.0F, -26.0F, -5.0F, 10, 2, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 20, 38, -5.0F, -24.0F, -5.0F, 10, 18, 0, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 20, 5.0F, -24.0F, -5.0F, 0, 18, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 2, -5.0F, -24.0F, -5.0F, 0, 18, 10, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 20, 20, -5.0F, -24.0F, 5.0F, 10, 18, 0, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-8.4565F, -9.2649F, 0.0F);
		bone2.addChild(bone);
		

		bone_r1 = new ModelRenderer(this);
		bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone_r1);
		setRotationAngle(bone_r1, 0.0F, 0.0F, 0.6981F);
		bone_r1.cubeList.add(new ModelBox(bone_r1, 40, 40, 2.2144F, -22.7821F, -2.0F, 5, 10, 4, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(16.9129F, 0.0F, 0.0F);
		bone.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, -0.6981F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 40, 0, -8.5F, -21.25F, -2.0F, 5, 10, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone2.render(f5);
	}
}