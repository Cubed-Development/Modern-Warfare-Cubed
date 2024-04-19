package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AX50BoltAction extends ModelWithAttachments {
	private final ModelRenderer boltaction;
	private final ModelRenderer boltaction28_r1;
	private final ModelRenderer BOLTaction24_r1;
	private final ModelRenderer BOLTaction23_r1;
	private final ModelRenderer BOLTaction22_r1;
	private final ModelRenderer BOLTaction18_r1;
	private final ModelRenderer BOLTaction16_r1;
	private final ModelRenderer BOLTaction14_r1;
	private final ModelRenderer BOLTaction12_r1;
	private final ModelRenderer BOLTaction11_r1;

	public AX50BoltAction() {
		textureWidth = 340;
		textureHeight = 340;

		boltaction = new ModelRenderer(this);
		boltaction.setRotationPoint(-37.3556F, 3.8836F, 0.0F);
		boltaction.cubeList.add(new ModelBox(boltaction, 142, 242, 34.3556F, -19.5836F, -38.2F, 3, 1, 30, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 138, 208, 35.3556F, -20.5836F, -38.2F, 1, 3, 30, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 62, 0, 35.3556F, -20.5836F, -8.2F, 1, 3, 3, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 42, 45, 34.3556F, -19.5836F, -8.2F, 3, 1, 3, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 14, 56, 35.3556F, -20.2836F, -5.2F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 32, 50, 36.0556F, -19.5836F, -5.21F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 50, 11, 34.6556F, -19.5836F, -5.21F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 49, 42, 35.3556F, -18.8836F, -5.2F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 62, 25, 34.1556F, -19.1836F, -12.5F, 1, 2, 2, 0.0F, false));

		boltaction28_r1 = new ModelRenderer(this);
		boltaction28_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		boltaction.addChild(boltaction28_r1);
		setRotationAngle(boltaction28_r1, 0.0F, 0.0F, 1.1525F);
		boltaction28_r1.cubeList.add(new ModelBox(boltaction28_r1, 86, 50, -3.7F, -35.5F, -12.5F, 2, 2, 2, 0.0F, false));
		boltaction28_r1.cubeList.add(new ModelBox(boltaction28_r1, 22, 22, -3.19F, -37.0F, -12.0F, 1, 2, 1, 0.0F, false));
		boltaction28_r1.cubeList.add(new ModelBox(boltaction28_r1, 33, 39, -3.2F, -38.8F, -12.0F, 1, 2, 1, 0.0F, false));

		BOLTaction24_r1 = new ModelRenderer(this);
		BOLTaction24_r1.setRotationPoint(8.2027F, 9.6978F, 0.0F);
		boltaction.addChild(BOLTaction24_r1);
		setRotationAngle(BOLTaction24_r1, 0.0F, 0.0F, 0.7854F);
		BOLTaction24_r1.cubeList.add(new ModelBox(BOLTaction24_r1, 34, 19, -2.0F, -40.4F, -5.19F, 1, 1, 1, 0.0F, false));
		BOLTaction24_r1.cubeList.add(new ModelBox(BOLTaction24_r1, 245, 35, -2.0F, -40.4F, -38.2F, 1, 1, 30, 0.0F, false));

		BOLTaction23_r1 = new ModelRenderer(this);
		BOLTaction23_r1.setRotationPoint(8.9098F, 9.9907F, 0.0F);
		boltaction.addChild(BOLTaction23_r1);
		setRotationAngle(BOLTaction23_r1, 0.0F, 0.0F, 0.7854F);
		BOLTaction23_r1.cubeList.add(new ModelBox(BOLTaction23_r1, 38, 23, -2.0F, -39.4F, -5.19F, 1, 1, 1, 0.0F, false));
		BOLTaction23_r1.cubeList.add(new ModelBox(BOLTaction23_r1, 245, 0, -2.0F, -39.4F, -38.2F, 1, 1, 30, 0.0F, false));

		BOLTaction22_r1 = new ModelRenderer(this);
		BOLTaction22_r1.setRotationPoint(9.2027F, 9.2835F, 0.0F);
		boltaction.addChild(BOLTaction22_r1);
		setRotationAngle(BOLTaction22_r1, 0.0F, 0.0F, 0.7854F);
		BOLTaction22_r1.cubeList.add(new ModelBox(BOLTaction22_r1, 34, 47, -1.0F, -39.4F, -5.19F, 1, 1, 1, 0.0F, false));
		BOLTaction22_r1.cubeList.add(new ModelBox(BOLTaction22_r1, 240, 243, -1.0F, -39.4F, -38.2F, 1, 1, 30, 0.0F, false));

		BOLTaction18_r1 = new ModelRenderer(this);
		BOLTaction18_r1.setRotationPoint(8.4956F, 8.9907F, 0.0F);
		boltaction.addChild(BOLTaction18_r1);
		setRotationAngle(BOLTaction18_r1, 0.0F, 0.0F, 0.7854F);
		BOLTaction18_r1.cubeList.add(new ModelBox(BOLTaction18_r1, 38, 50, -1.0F, -40.4F, -5.19F, 1, 1, 1, 0.0F, false));
		BOLTaction18_r1.cubeList.add(new ModelBox(BOLTaction18_r1, 178, 243, -1.0F, -40.4F, -38.2F, 1, 1, 30, 0.0F, false));

		BOLTaction16_r1 = new ModelRenderer(this);
		BOLTaction16_r1.setRotationPoint(62.3064F, -44.9486F, 0.0F);
		boltaction.addChild(BOLTaction16_r1);
		setRotationAngle(BOLTaction16_r1, 0.0F, 0.0F, -2.3562F);
		BOLTaction16_r1.cubeList.add(new ModelBox(BOLTaction16_r1, 0, 87, -1.0F, -37.3F, -8.22F, 1, 1, 3, 0.0F, false));
		BOLTaction16_r1.cubeList.add(new ModelBox(BOLTaction16_r1, 11, 87, -1.0F, -37.7F, -8.21F, 1, 1, 3, 0.0F, false));

		BOLTaction14_r1 = new ModelRenderer(this);
		BOLTaction14_r1.setRotationPoint(8.2835F, 8.9028F, 0.0F);
		boltaction.addChild(BOLTaction14_r1);
		setRotationAngle(BOLTaction14_r1, 0.0F, 0.0F, 0.7854F);
		BOLTaction14_r1.cubeList.add(new ModelBox(BOLTaction14_r1, 87, 56, -0.6F, -40.69F, -8.22F, 1, 1, 3, 0.0F, false));
		BOLTaction14_r1.cubeList.add(new ModelBox(BOLTaction14_r1, 91, 86, -1.0F, -40.7F, -8.21F, 1, 1, 3, 0.0F, false));

		BOLTaction12_r1 = new ModelRenderer(this);
		BOLTaction12_r1.setRotationPoint(63.8419F, 6.6601F, 0.0F);
		boltaction.addChild(BOLTaction12_r1);
		setRotationAngle(BOLTaction12_r1, 0.0F, 0.0F, -0.7854F);
		BOLTaction12_r1.cubeList.add(new ModelBox(BOLTaction12_r1, 17, 22, -2.99F, -38.3F, -8.22F, 1, 1, 3, 0.0F, false));
		BOLTaction12_r1.cubeList.add(new ModelBox(BOLTaction12_r1, 95, 74, -3.0F, -38.7F, -8.21F, 1, 1, 3, 0.0F, false));

		BOLTaction11_r1 = new ModelRenderer(this);
		BOLTaction11_r1.setRotationPoint(64.5491F, 6.3673F, 0.0F);
		boltaction.addChild(BOLTaction11_r1);
		setRotationAngle(BOLTaction11_r1, 0.0F, 0.0F, -0.7854F);
		BOLTaction11_r1.cubeList.add(new ModelBox(BOLTaction11_r1, 94, 50, -2.6F, -39.7F, -8.22F, 1, 1, 3, 0.0F, false));
		BOLTaction11_r1.cubeList.add(new ModelBox(BOLTaction11_r1, 95, 96, -3.0F, -39.69F, -8.21F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
