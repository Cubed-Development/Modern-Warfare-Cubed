package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TaurusLoader extends ModelWithAttachments {
	private final QRenderer loader;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;

	public TaurusLoader() {
		textureWidth = 128;
		textureHeight = 128;

		loader = new QRenderer(this);
		loader.setRotationPoint(-1.5F, 0.9F, 10.7F);
		loader.cubeList.add(new ModelBox(loader, 25, 41, -1.0F, -2.0F, -3.0F, 2, 5, 2, 0.0F, false));
		loader.cubeList.add(new ModelBox(loader, 68, 55, 1.9F, -0.9F, -3.0F, 1, 2, 2, 0.0F, false));
		loader.cubeList.add(new ModelBox(loader, 90, 49, -2.9F, -0.9F, -3.001F, 5, 2, 2, 0.0F, false));
		loader.cubeList.add(new ModelBox(loader, 89, 69, -1.0F, -2.8F, -3.001F, 2, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.0F, -2.8F, -3.0F);
		loader.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 59, 64, -2.7F, -0.001F, -0.003F, 1, 2, 2, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 9, 83, -2.0F, 0.0F, -0.002F, 2, 2, 2, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.0F, -2.8F, -3.0F);
		loader.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 62, 48, -1.999F, 1.7F, -0.003F, 2, 1, 2, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 24, -2.0F, 0.0F, -0.002F, 2, 2, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.6F, -1.3F, -1.4F);
		loader.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.3665F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 83, 32, -2.0F, 0.0F, -0.001F, 2, 2, 2, -0.3F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 69, 91, -2.0F, 0.0F, -0.401F, 2, 2, 1, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 81, 98, -2.0F, 0.0F, 1.399F, 2, 2, 1, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-1.0F, 3.0F, -3.0F);
		loader.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 69, 11, -2.7F, -2.0F, 0.003F, 1, 2, 2, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 93, 97, -2.0F, -2.0F, 0.002F, 2, 2, 2, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.0F, 3.0F, -3.0F);
		loader.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, 0.7854F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 49, 96, -1.999F, -2.7F, 0.002F, 2, 1, 2, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 6, 99, -2.0F, -2.0F, 0.001F, 2, 2, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		loader.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
