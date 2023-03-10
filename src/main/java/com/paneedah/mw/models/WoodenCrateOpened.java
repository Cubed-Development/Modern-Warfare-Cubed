package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class WoodenCrateOpened extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone10;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public WoodenCrateOpened() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.0F, 16.0F, -7.0F);
		setRotationAngle(bone, -1.5708F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 18, 75, -1.0F, -1.0F, -9.0F, 2, 2, 14, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 57, -15.0F, -1.0F, -9.0F, 2, 2, 14, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(7.0F, 16.0F, 7.0F);
		setRotationAngle(bone2, -1.5708F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 73, -1.0F, -1.0F, -9.0F, 2, 2, 14, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 18, 59, -15.0F, -1.0F, -9.0F, 2, 2, 14, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-21.0F, 10.0F, 15.0F);
		bone3.cubeList.add(new ModelBox(bone3, 52, 52, 14.0F, -1.0F, -22.0F, 14, 12, 14, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 89, 27.0F, -3.0F, -21.0F, 2, 2, 12, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 82, 84, 13.0F, -3.0F, -21.0F, 2, 2, 12, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 48, 20, 13.0F, 11.0F, -23.0F, 16, 2, 16, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 36, 57, 15.0F, -3.0F, -23.0F, 12, 2, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 94, 51, 13.0F, 13.0F, -9.0F, 16, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 90, 46, 13.0F, 13.0F, -16.0F, 16, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 66, 17, 13.0F, 13.0F, -23.0F, 16, 1, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 36, 61, 15.0F, -3.0F, -9.0F, 12, 2, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(24.0F, -4.9167F, -16.0F);
		bone3.addChild(bone11);
		setRotationAngle(bone11, 0.0F, -1.2217F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 54, 38, -6.0F, 0.9167F, -6.0F, 12, 1, 12, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 38, 82, -8.0F, -0.0833F, -6.0F, 2, 2, 12, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 90, 42, -8.0F, -0.0833F, -8.0F, 16, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 90, 38, -8.0F, -0.0833F, 6.0F, 16, 2, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 66, 82, 6.0F, -0.0833F, -6.0F, 2, 2, 12, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.6667F, 0.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, -0.7854F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 76, 78, -9.0F, -0.5F, -1.0F, 18, 2, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.5F, 0.0F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 1.5708F, 0.0F);
		

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.5F, 0.0F);
		bone12.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 1.5708F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 36, 78, -9.0F, -1.01F, -1.0F, 18, 2, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(20.5F, 7.5F, -4.0F);
		bone3.addChild(bone10);
		setRotationAngle(bone10, -1.0472F, 0.0F, 0.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(14.0F, 5.0F, -15.0F);
		bone3.addChild(bone4);
		setRotationAngle(bone4, 0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -0.5F, -1.0F, -9.0F, 15, 2, 18, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(14.25F, 5.0F, -15.0F);
		bone3.addChild(bone5);
		setRotationAngle(bone5, -0.7854F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 20, -0.74F, -1.0F, -9.0F, 15, 2, 18, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(21.0F, 5.0F, -22.0F);
		bone3.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, -0.7854F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 40, -9.0F, -1.0F, -0.51F, 18, 2, 15, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(21.0F, 5.0F, -21.75F);
		bone3.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 0.7854F);
		bone7.cubeList.add(new ModelBox(bone7, 48, 0, -9.0F, -1.0F, -0.75F, 18, 2, 15, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(21.0F, -2.0F, 1.0F);
		bone3.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -0.7854F, 0.0F);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(21.0F, 12.0F, -15.0F);
		bone3.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.7854F, 0.0F);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
		bone2.render(f5);
		bone3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}