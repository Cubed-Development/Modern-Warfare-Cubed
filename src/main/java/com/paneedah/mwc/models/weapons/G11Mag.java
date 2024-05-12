package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G11Mag extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
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
	private final ModelRenderer cube_r99;
	private final ModelRenderer cube_r100;
	private final ModelRenderer cube_r101;
	private final ModelRenderer cube_r102;
	private final ModelRenderer bone4;
	private final ModelRenderer cube_r103;
	private final ModelRenderer cube_r104;
	private final ModelRenderer cube_r105;
	private final ModelRenderer cube_r106;
	private final ModelRenderer cube_r107;
	private final ModelRenderer cube_r108;
	private final ModelRenderer cube_r109;
	private final ModelRenderer cube_r110;

	public G11Mag() {
		textureWidth = 256;
		textureHeight = 256;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(-1.5F, -15.75F, -33.575F);
		mag.cubeList.add(new ModelBox(mag, 0, 74, -1.0F, -3.5F, -15.0F, 2, 1, 37, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 47, 38, -1.0F, -0.5F, -15.0F, 2, 1, 37, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 66, 4, -1.0F, -2.5F, -12.0F, 2, 2, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 66, 0, -1.05F, -2.5F, -14.0F, 2, 2, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 77, 38, -1.0F, -2.5F, -15.0F, 2, 2, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 26, 187, -1.0F, -2.5F, 1.0F, 2, 2, 21, 0.0F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(0.25F, -1.5F, -9.25F);
		mag.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.0F, 0.7854F, 0.0F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 99, 89, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(0.25F, -1.5F, -9.75F);
		mag.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.0F, 0.7854F, 0.0F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 99, 66, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(0.25F, -1.5F, -4.25F);
		mag.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.0F, 0.7854F, 0.0F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 101, 80, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.25F, -1.5F, -4.75F);
		mag.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0F, 0.7854F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 101, 38, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(0.25F, -1.5F, -3.75F);
		mag.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.0F, 0.7854F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 100, 95, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(0.25F, -1.5F, -3.25F);
		mag.addChild(cube_r86);
		setRotationAngle(cube_r86, 0.0F, 0.7854F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 100, 92, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.25F, -1.5F, -7.25F);
		mag.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.7854F, 0.0F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 100, 24, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.25F, -1.5F, -8.25F);
		mag.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.7854F, 0.0F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 100, 21, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.25F, -1.5F, -8.75F);
		mag.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.7854F, 0.0F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 4, 100, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.25F, -1.5F, -7.75F);
		mag.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.7854F, 0.0F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 0, 100, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.25F, -1.5F, -5.75F);
		mag.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.7854F, 0.0F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 86, 100, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.25F, -1.5F, -5.25F);
		mag.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.7854F, 0.0F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 71, 100, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.25F, -1.5F, -6.25F);
		mag.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.7854F, 0.0F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 67, 100, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.25F, -1.5F, -6.75F);
		mag.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.7854F, 0.0F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 63, 100, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.25F, -1.5F, -1.75F);
		mag.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.7854F, 0.0F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 102, 27, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.25F, -1.5F, -1.25F);
		mag.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.7854F, 0.0F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 15, 102, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.25F, -1.5F, -2.25F);
		mag.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.7854F, 0.0F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 11, 102, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r98 = new ModelRenderer(this);
		cube_r98.setRotationPoint(0.25F, -1.5F, -2.75F);
		mag.addChild(cube_r98);
		setRotationAngle(cube_r98, 0.0F, 0.7854F, 0.0F);
		cube_r98.cubeList.add(new ModelBox(cube_r98, 7, 102, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r99 = new ModelRenderer(this);
		cube_r99.setRotationPoint(0.25F, -1.5F, -0.25F);
		mag.addChild(cube_r99);
		setRotationAngle(cube_r99, 0.0F, 0.7854F, 0.0F);
		cube_r99.cubeList.add(new ModelBox(cube_r99, 49, 102, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r100 = new ModelRenderer(this);
		cube_r100.setRotationPoint(0.25F, -1.5F, -0.75F);
		mag.addChild(cube_r100);
		setRotationAngle(cube_r100, 0.0F, 0.7854F, 0.0F);
		cube_r100.cubeList.add(new ModelBox(cube_r100, 102, 33, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r101 = new ModelRenderer(this);
		cube_r101.setRotationPoint(0.25F, -1.5F, 0.25F);
		mag.addChild(cube_r101);
		setRotationAngle(cube_r101, 0.0F, 0.7854F, 0.0F);
		cube_r101.cubeList.add(new ModelBox(cube_r101, 53, 102, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r102 = new ModelRenderer(this);
		cube_r102.setRotationPoint(0.25F, -1.5F, 0.75F);
		mag.addChild(cube_r102);
		setRotationAngle(cube_r102, 0.0F, 0.7854F, 0.0F);
		cube_r102.cubeList.add(new ModelBox(cube_r102, 102, 68, -0.5F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, -2.1071F, -14.325F);
		mag.addChild(bone4);
		

		cube_r103 = new ModelRenderer(this);
		cube_r103.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone4.addChild(cube_r103);
		setRotationAngle(cube_r103, -0.3927F, 0.0F, 0.0F);
		cube_r103.cubeList.add(new ModelBox(cube_r103, 64, 23, -1.001F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r104 = new ModelRenderer(this);
		cube_r104.setRotationPoint(0.0F, -0.725F, 0.725F);
		bone4.addChild(cube_r104);
		setRotationAngle(cube_r104, -1.1781F, 0.0F, 0.0F);
		cube_r104.cubeList.add(new ModelBox(cube_r104, 28, 60, -1.002F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r105 = new ModelRenderer(this);
		cube_r105.setRotationPoint(0.0F, 1.9392F, 0.725F);
		bone4.addChild(cube_r105);
		setRotationAngle(cube_r105, 1.1781F, 0.0F, 0.0F);
		cube_r105.cubeList.add(new ModelBox(cube_r105, 57, 14, -1.002F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r106 = new ModelRenderer(this);
		cube_r106.setRotationPoint(0.0F, 1.9392F, 1.925F);
		bone4.addChild(cube_r106);
		setRotationAngle(cube_r106, -1.1781F, 0.0F, 0.0F);
		cube_r106.cubeList.add(new ModelBox(cube_r106, 41, 74, -1.002F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r107 = new ModelRenderer(this);
		cube_r107.setRotationPoint(0.0F, 1.2142F, 2.65F);
		bone4.addChild(cube_r107);
		setRotationAngle(cube_r107, -0.3927F, 0.0F, 0.0F);
		cube_r107.cubeList.add(new ModelBox(cube_r107, 22, 69, -1.001F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r108 = new ModelRenderer(this);
		cube_r108.setRotationPoint(0.0F, 0.0F, 2.65F);
		bone4.addChild(cube_r108);
		setRotationAngle(cube_r108, 0.3927F, 0.0F, 0.0F);
		cube_r108.cubeList.add(new ModelBox(cube_r108, 78, 33, -1.001F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r109 = new ModelRenderer(this);
		cube_r109.setRotationPoint(0.0F, -0.725F, 1.925F);
		bone4.addChild(cube_r109);
		setRotationAngle(cube_r109, 1.1781F, 0.0F, 0.0F);
		cube_r109.cubeList.add(new ModelBox(cube_r109, 10, 83, -1.002F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r110 = new ModelRenderer(this);
		cube_r110.setRotationPoint(0.0F, 1.2142F, 0.0F);
		bone4.addChild(cube_r110);
		setRotationAngle(cube_r110, 0.3927F, 0.0F, 0.0F);
		cube_r110.cubeList.add(new ModelBox(cube_r110, 67, 33, -1.001F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
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
