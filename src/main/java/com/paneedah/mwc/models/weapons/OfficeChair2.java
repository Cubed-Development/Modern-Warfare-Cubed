package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OfficeChair2 extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer chair13_r1;
	private final ModelRenderer chair12_r1;
	private final ModelRenderer chair6_r1;
	private final ModelRenderer chair5_r1;
	private final ModelRenderer chair4_r1;
	private final ModelRenderer chair1_r1;

	public OfficeChair2() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 23.9834F, -0.8921F);
		bone.cubeList.add(new ModelBox(bone, 0, 50, -1.0F, -7.9834F, -0.6079F, 2, 6, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.0F, -1.9834F, -5.1079F, 2, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -1.9834F, -5.1079F, 2, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.0F, -1.9834F, 4.3921F, 2, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -1.9834F, 4.3921F, 2, 2, 2, 0.0F, true));

		chair13_r1 = new ModelRenderer(this);
		chair13_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(chair13_r1);
		setRotationAngle(chair13_r1, -0.0372F, 0.0F, 0.0F);
		chair13_r1.cubeList.add(new ModelBox(chair13_r1, 0, 0, -6.0F, -13.5F, -2.0F, 2, 2, 7, 0.0F, true));

		chair12_r1 = new ModelRenderer(this);
		chair12_r1.setRotationPoint(0.0F, 0.0816F, 0.3889F);
		bone.addChild(chair12_r1);
		setRotationAngle(chair12_r1, -0.0372F, 0.0F, 0.0F);
		chair12_r1.cubeList.add(new ModelBox(chair12_r1, 0, 0, 4.0F, -13.5F, -2.0F, 2, 2, 7, 0.0F, true));

		chair6_r1 = new ModelRenderer(this);
		chair6_r1.setRotationPoint(0.0F, 0.249F, 0.1395F);
		bone.addChild(chair6_r1);
		setRotationAngle(chair6_r1, -0.0744F, 0.0F, 0.0F);
		chair6_r1.cubeList.add(new ModelBox(chair6_r1, 0, 0, -5.0F, -10.0F, -4.5F, 10, 2, 9, 0.0F, true));

		chair5_r1 = new ModelRenderer(this);
		chair5_r1.setRotationPoint(-2.1924F, 0.0166F, -5.815F);
		bone.addChild(chair5_r1);
		setRotationAngle(chair5_r1, 0.0F, -0.7854F, 0.0F);
		chair5_r1.cubeList.add(new ModelBox(chair5_r1, 0, 50, 5.0F, -2.5F, -4.5F, 2, 1, 15, 0.0F, true));

		chair4_r1 = new ModelRenderer(this);
		chair4_r1.setRotationPoint(2.1924F, 0.0166F, -5.815F);
		bone.addChild(chair4_r1);
		setRotationAngle(chair4_r1, 0.0F, 0.7854F, 0.0F);
		chair4_r1.cubeList.add(new ModelBox(chair4_r1, 0, 50, -7.0F, -2.5F, -4.5F, 2, 1, 15, 0.0F, true));

		chair1_r1 = new ModelRenderer(this);
		chair1_r1.setRotationPoint(0.0F, -0.5281F, -0.8639F);
		bone.addChild(chair1_r1);
		setRotationAngle(chair1_r1, -0.1115F, 0.0F, 0.0F);
		chair1_r1.cubeList.add(new ModelBox(chair1_r1, 0, 0, -4.5F, -19.0F, 4.0F, 9, 11, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}