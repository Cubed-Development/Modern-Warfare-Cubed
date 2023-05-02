package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UMP9Mag extends ModelWithAttachments {
	private final QRenderer magazine9mm;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;
	private final ModelRenderer cube_r98;

	public UMP9Mag() {
		textureWidth = 200;
		textureHeight = 200;

		magazine9mm = new QRenderer(this);
		magazine9mm.setRotationPoint(0.5F, 11.0F, -32.4F);
		

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-4.0401F, -20.679F, 14.5705F);
		magazine9mm.addChild(cube_r83);
		setRotationAngle(cube_r83, -0.21F, 0.0677F, 0.3496F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 37, 68, 0.0F, -1.0F, -3.0F, 1, 1, 3, 0.01F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.0401F, -20.679F, 14.5705F);
		magazine9mm.addChild(cube_r84);
		setRotationAngle(cube_r84, -0.21F, -0.0677F, -0.3496F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 83, 94, -1.0F, -1.0F, -3.0F, 1, 1, 3, 0.01F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(-4.15F, -13.95F, 16.6F);
		magazine9mm.addChild(cube_r85);
		setRotationAngle(cube_r85, -0.2269F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 76, 9, 0.0F, -6.0F, -5.0F, 1, 6, 1, 0.0F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 76, 31, 3.3F, -6.0F, -5.0F, 1, 6, 1, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-4.15F, -4.65F, 13.1F);
		magazine9mm.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.3665F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 37, 74, 0.0F, -10.0F, -5.0F, 1, 10, 1, 0.01F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 68, 106, 3.3F, -10.0F, -5.0F, 1, 10, 1, 0.01F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-4.15F, 0.85F, 3.4F);
		magazine9mm.addChild(cube_r87);
		setRotationAngle(cube_r87, -0.5934F, 0.0F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 68, 0, 0.0F, -10.0F, 0.0F, 1, 11, 1, 0.0F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 68, 21, 3.3F, -10.0F, 0.0F, 1, 11, 1, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(-4.15F, 0.15F, 0.5F);
		magazine9mm.addChild(cube_r88);
		setRotationAngle(cube_r88, -0.5934F, 0.0F, 0.0F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 104, 76, 0.0F, -10.0F, 0.0F, 1, 10, 2, -0.001F, false));
		cube_r88.cubeList.add(new ModelBox(cube_r88, 4, 106, 3.3F, -10.0F, 0.0F, 1, 10, 2, -0.001F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(-4.15F, -5.35F, 10.2F);
		magazine9mm.addChild(cube_r89);
		setRotationAngle(cube_r89, -0.3665F, 0.0F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 104, 57, 0.0F, -10.0F, -5.0F, 1, 10, 2, 0.01F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 10, 106, 3.3F, -10.0F, -5.0F, 1, 10, 2, 0.01F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(-4.15F, -14.65F, 13.7F);
		magazine9mm.addChild(cube_r90);
		setRotationAngle(cube_r90, -0.2269F, 0.0F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 54, 53, 0.0F, -6.0F, -5.0F, 1, 6, 2, 0.0F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 64, 53, 3.3F, -6.0F, -5.0F, 1, 6, 2, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(-4.15F, 0.35F, 1.5F);
		magazine9mm.addChild(cube_r91);
		setRotationAngle(cube_r91, -0.5934F, 0.0F, 0.0F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 15, 0, 0.0F, -6.0F, 1.0F, 1, 6, 1, -0.002F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 27, 53, 3.3F, -6.0F, 1.0F, 1, 6, 1, -0.002F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.0F, -14.8F, 13.2F);
		magazine9mm.addChild(cube_r92);
		setRotationAngle(cube_r92, -0.2269F, 0.0F, 0.0F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 0, 74, -4.0F, -6.0F, -5.0F, 4, 6, 5, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.0F, -5.5F, 9.7F);
		magazine9mm.addChild(cube_r93);
		setRotationAngle(cube_r93, -0.3665F, 0.0F, 0.0F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 0, 26, -4.0F, -10.0F, -5.0F, 4, 10, 5, 0.01F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(-4.5F, -0.1F, 0.1F);
		magazine9mm.addChild(cube_r94);
		setRotationAngle(cube_r94, -0.3344F, -0.4999F, -0.9436F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 40, 40, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.5F, -0.1F, 0.1F);
		magazine9mm.addChild(cube_r95);
		setRotationAngle(cube_r95, -0.3344F, 0.4999F, 0.9436F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 88, 41, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.0F, -0.6F, -0.7F);
		magazine9mm.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.1745F, 0.0F, 0.0F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 38, 9, -4.0F, 0.0F, 0.0F, 4, 1, 2, -0.01F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.5F, 0.2F, -1.3F);
		magazine9mm.addChild(cube_r97);
		setRotationAngle(cube_r97, -0.5934F, 0.0F, 0.0F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 0, 15, -5.0F, -1.0F, 0.0F, 5, 1, 6, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.0F, 0.0F, 0.0F);
		magazine9mm.addChild(cube_r98);
		setRotationAngle(cube_r98, -0.5934F, 0.0F, 0.0F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 0, 53, -4.0F, -10.0F, 0.0F, 4, 10, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine9mm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
