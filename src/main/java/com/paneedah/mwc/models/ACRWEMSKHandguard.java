package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRWEMSKHandguard extends ModelBase {
	private final ModelRenderer handguard1;
	private final ModelRenderer bone;
	private final ModelRenderer bone5;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone11;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone12;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public ACRWEMSKHandguard() {
		textureWidth = 256;
		textureHeight = 256;

		handguard1 = new ModelRenderer(this);
		handguard1.setRotationPoint(0.3F, -15.4F, -49.0F);
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 0, -2.8F, 4.1F, -3.0F, 2, 1, 29, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 6, -1.6F, 4.8F, 20.0F, 1, 1, 5, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 0, -3.0F, 4.8F, 20.0F, 2, 1, 5, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 22, 25, -1.5F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 14, 25, -3.1F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 0.0F, 0.0F);
		handguard1.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 59, 0.0F, 0.3F, -2.0F, 1, 1, 27, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 16, 0.0F, 1.3F, 21.0F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 17, 0.0F, 1.3F, 15.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 9, 0.0F, 1.3F, 9.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 22, 22, 0.0F, 1.3F, 3.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 22, 0.0F, 1.3F, -3.0F, 1, 1, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 30, 31, 0.0F, 2.3F, -3.0F, 1, 1, 28, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(1.1F, 2.5F, 4.0F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.7854F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 24, 12, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 19, 24, -1.0F, 3.2426F, 4.2426F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 11, 24, -1.0F, 7.4853F, 8.4853F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 7, 24, -1.0F, 11.7279F, 12.7279F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 3, 24, -1.0F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, 0.3F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.6632F);
		bone2.cubeList.add(new ModelBox(bone2, 84, 84, -1.0F, -1.0F, -1.0F, 1, 1, 26, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 84, 55, -0.99F, -1.4F, 0.0F, 1, 1, 25, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, -1.4F, 0.0F);
		bone2.addChild(bone3);
		setRotationAngle(bone3, -1.2043F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 6, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(1.0F, 0.3F, -2.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, -0.7854F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 25, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 24, 14, -1.0F, 0.4F, 0.0F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.0F, 3.3F, -3.0F);
		bone.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.6458F);
		bone11.cubeList.add(new ModelBox(bone11, 15, 0, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 12, -2.0F, -1.0F, 24.0F, 1, 1, 4, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 20, -2.0F, -1.0F, 18.0F, 1, 1, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 19, 6, -2.0F, -1.0F, 12.0F, 1, 1, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 19, 3, -2.0F, -1.0F, 6.0F, 1, 1, 2, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 26, 87, -3.0F, -1.0F, 2.0F, 1, 1, 23, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 13, 5, -1.0F, -1.0F, 2.0F, 1, 1, 4, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 60, 28, -1.4F, -1.01F, 2.0F, 1, 1, 26, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-2.4821F, 0.1341F, 7.0F);
		bone11.addChild(bone13);
		setRotationAngle(bone13, 0.7854F, 0.0F, 1.5446F);
		bone13.cubeList.add(new ModelBox(bone13, 12, 16, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 0, 14, -1.0F, 3.2426F, 4.2426F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 13, 7, -1.0F, 7.4853F, 8.4853F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 13, 5, -1.0F, 11.7279F, 12.7279F, 1, 1, 1, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 0, 12, -1.0F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-5.6F, 3.3F, -3.0F);
		bone.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.6458F);
		bone14.cubeList.add(new ModelBox(bone14, 14, 11, 0.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 8, 11, 1.0F, -1.0F, 24.0F, 1, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 14, 19, 1.0F, -1.0F, 18.0F, 1, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 0, 17, 1.0F, -1.0F, 12.0F, 1, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 6, 12, 1.0F, -1.0F, 6.0F, 1, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 9, 0, 0.0F, -1.0F, 2.0F, 1, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 51, 87, 0.4F, -1.0F, 6.0F, 1, 1, 22, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 7, 6, 2.0F, -1.0F, 2.0F, 1, 1, 4, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 56, 60, 1.6F, -1.01F, 2.0F, 1, 1, 26, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.5909F, -2.9328F, 7.0F);
		bone14.addChild(bone15);
		setRotationAngle(bone15, 0.7854F, 0.0F, 1.5446F);
		bone15.cubeList.add(new ModelBox(bone15, 9, 2, 2.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 9, 0, 2.0F, 3.2426F, 4.2426F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 0, 9, 2.0F, 7.4853F, 8.4853F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 7, 7, 2.0F, 11.7279F, 12.7279F, 1, 1, 1, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 0, 3, 2.0F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-5.6F, 3.3F, -3.0F);
		bone.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.6458F);
		

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-5.1F, 0.0F, 0.0F);
		handguard1.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 33, 0, 0.0F, 0.3F, -2.0F, 1, 1, 27, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 14, 14, 0.0F, 1.3F, 21.0F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 10, 21, 0.0F, 1.3F, 15.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 4, 21, 0.0F, 1.3F, 9.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 20, 14, 0.0F, 1.3F, 3.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 18, 20, 0.0F, 1.3F, -3.0F, 1, 1, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 30, 0.0F, 2.3F, -3.0F, 1, 1, 28, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.9F, 2.5F, 4.0F);
		bone6.addChild(bone7);
		setRotationAngle(bone7, 0.7854F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 23, 6, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 23, 3, -1.0F, 3.2426F, 4.2426F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 23, 0, -1.0F, 7.4853F, 8.4853F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 23, -1.0F, 11.7279F, 12.7279F, 1, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 22, 20, -1.0F, -5.2426F, -4.2426F, 1, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.3F, 0.0F);
		bone6.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.6632F);
		bone8.cubeList.add(new ModelBox(bone8, 62, 0, 0.0F, -1.0F, -1.0F, 1, 1, 26, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 29, 60, 0.01F, -1.4F, 0.0F, 1, 1, 25, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, -1.4F, 0.0F);
		bone8.addChild(bone9);
		setRotationAngle(bone9, -1.2043F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.0F, 0.3F, -2.0F);
		bone6.addChild(bone10);
		setRotationAngle(bone10, -0.7854F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 8, 21, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 4, 17, -1.0F, 0.4F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
