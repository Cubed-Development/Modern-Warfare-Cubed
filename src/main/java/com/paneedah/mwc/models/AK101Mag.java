package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AK101Mag extends ModelBase {
	private final QRenderer mag;
	private final ModelRenderer bone5;
	private final ModelRenderer Magazine6_r1;
	private final ModelRenderer Magazine5_r1;
	private final ModelRenderer bone7;
	private final ModelRenderer Magazine7_r1;
	private final ModelRenderer Magazine6_r2;
	private final ModelRenderer bone8;
	private final ModelRenderer Magazine8_r1;
	private final ModelRenderer Magazine7_r2;
	private final ModelRenderer bone9;
	private final ModelRenderer Magazine9_r1;
	private final ModelRenderer Magazine8_r2;

	public AK101Mag() {
		textureWidth = 64;
		textureHeight = 64;

		mag = new QRenderer(this);
		mag.setRotationPoint(0.0F, 23.7F, 0.1F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 18, 32, -1.5F, -2.6593F, -2.7842F, 3, 6, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 15, 19, -2.0F, -2.6593F, -1.5342F, 4, 6, 7, 0.0F, false));

		Magazine6_r1 = new ModelRenderer(this);
		Magazine6_r1.setRotationPoint(3.0F, 0.3407F, 1.9658F);
		bone5.addChild(Magazine6_r1);
		setRotationAngle(Magazine6_r1, 0.0F, 0.4363F, 0.0F);
		Magazine6_r1.cubeList.add(new ModelBox(Magazine6_r1, 32, 34, -0.4052F, 0.8212F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine6_r1.cubeList.add(new ModelBox(Magazine6_r1, 28, 36, -0.4052F, -0.9288F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine6_r1.cubeList.add(new ModelBox(Magazine6_r1, 36, 36, -0.4052F, -2.6788F, -5.1655F, 1, 1, 2, -0.2F, false));

		Magazine5_r1 = new ModelRenderer(this);
		Magazine5_r1.setRotationPoint(0.0F, 0.3407F, 1.9658F);
		bone5.addChild(Magazine5_r1);
		setRotationAngle(Magazine5_r1, 0.0F, -0.4363F, 0.0F);
		Magazine5_r1.cubeList.add(new ModelBox(Magazine5_r1, 35, 17, -3.3138F, 0.8212F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine5_r1.cubeList.add(new ModelBox(Magazine5_r1, 36, 33, -3.3138F, -0.9288F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine5_r1.cubeList.add(new ModelBox(Magazine5_r1, 0, 37, -3.3138F, -2.6788F, -3.8976F, 1, 1, 2, -0.2F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-1.5F, -28.6927F, -23.9674F);
		mag.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 8, 32, -1.5F, 2.5987F, -2.3949F, 3, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 15, 6, -2.0F, 2.5987F, -1.1449F, 4, 6, 7, 0.001F, false));

		Magazine7_r1 = new ModelRenderer(this);
		Magazine7_r1.setRotationPoint(3.0F, 5.5987F, 2.3551F);
		bone7.addChild(Magazine7_r1);
		setRotationAngle(Magazine7_r1, 0.0F, 0.4363F, 0.0F);
		Magazine7_r1.cubeList.add(new ModelBox(Magazine7_r1, 30, 19, -0.4052F, 1.0712F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine7_r1.cubeList.add(new ModelBox(Magazine7_r1, 28, 33, -0.4052F, -0.6788F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine7_r1.cubeList.add(new ModelBox(Magazine7_r1, 34, 9, -0.4052F, -2.4288F, -5.1655F, 1, 1, 2, -0.2F, false));

		Magazine6_r2 = new ModelRenderer(this);
		Magazine6_r2.setRotationPoint(0.0F, 5.5987F, 2.3551F);
		bone7.addChild(Magazine6_r2);
		setRotationAngle(Magazine6_r2, 0.0F, -0.4363F, 0.0F);
		Magazine6_r2.cubeList.add(new ModelBox(Magazine6_r2, 30, 22, -3.3138F, 1.0712F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine6_r2.cubeList.add(new ModelBox(Magazine6_r2, 0, 34, -3.3138F, -0.6788F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine6_r2.cubeList.add(new ModelBox(Magazine6_r2, 34, 20, -3.3138F, -2.4288F, -3.8976F, 1, 1, 2, -0.2F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.1883F, -23.3512F, -24.1008F);
		mag.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 30, 0, 0.1883F, 2.8635F, -3.4591F, 3, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 13, -0.3117F, 2.8635F, -2.2091F, 4, 6, 7, 0.0F, false));

		Magazine8_r1 = new ModelRenderer(this);
		Magazine8_r1.setRotationPoint(4.6883F, 5.8635F, 1.2909F);
		bone8.addChild(Magazine8_r1);
		setRotationAngle(Magazine8_r1, 0.0F, 0.4363F, 0.0F);
		Magazine8_r1.cubeList.add(new ModelBox(Magazine8_r1, 15, 3, -0.4052F, 1.3212F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine8_r1.cubeList.add(new ModelBox(Magazine8_r1, 19, 1, -0.4052F, -0.4288F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine8_r1.cubeList.add(new ModelBox(Magazine8_r1, 23, 3, -0.4052F, -2.1788F, -5.1655F, 1, 1, 2, -0.2F, false));

		Magazine7_r2 = new ModelRenderer(this);
		Magazine7_r2.setRotationPoint(1.6883F, 5.8635F, 1.2909F);
		bone8.addChild(Magazine7_r2);
		setRotationAngle(Magazine7_r2, 0.0F, -0.4363F, 0.0F);
		Magazine7_r2.cubeList.add(new ModelBox(Magazine7_r2, 0, 16, -3.3138F, 1.3212F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine7_r2.cubeList.add(new ModelBox(Magazine7_r2, 23, 0, -3.3138F, -0.4288F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine7_r2.cubeList.add(new ModelBox(Magazine7_r2, 30, 8, -3.3138F, -2.1788F, -3.8976F, 1, 1, 2, -0.2F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-3.1883F, -17.745F, -25.2985F);
		mag.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 26, 0.1883F, 2.4396F, -4.1169F, 3, 6, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 0, -0.3117F, 2.4396F, -2.8669F, 4, 6, 7, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 29, 24, -0.3117F, 8.3396F, -3.9669F, 4, 1, 8, 0.0F, false));

		Magazine9_r1 = new ModelRenderer(this);
		Magazine9_r1.setRotationPoint(4.6883F, 5.4396F, 0.6331F);
		bone9.addChild(Magazine9_r1);
		setRotationAngle(Magazine9_r1, 0.0F, 0.4363F, 0.0F);
		Magazine9_r1.cubeList.add(new ModelBox(Magazine9_r1, 0, 0, -0.4052F, 0.5712F, -5.1655F, 1, 1, 2, -0.2F, false));
		Magazine9_r1.cubeList.add(new ModelBox(Magazine9_r1, 0, 13, -0.4052F, -1.1788F, -5.1655F, 1, 1, 2, -0.2F, false));

		Magazine8_r2 = new ModelRenderer(this);
		Magazine8_r2.setRotationPoint(1.6883F, 5.4396F, 0.6331F);
		bone9.addChild(Magazine8_r2);
		setRotationAngle(Magazine8_r2, 0.0F, -0.4363F, 0.0F);
		Magazine8_r2.cubeList.add(new ModelBox(Magazine8_r2, 0, 3, -3.3138F, 0.5712F, -3.8976F, 1, 1, 2, -0.2F, false));
		Magazine8_r2.cubeList.add(new ModelBox(Magazine8_r2, 15, 0, -3.3138F, -1.1788F, -3.8976F, 1, 1, 2, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
