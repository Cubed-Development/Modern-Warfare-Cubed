package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MPXMag extends ModelWithAttachments {
	private final QRenderer magazine;
	private final ModelRenderer magazine_r1;
	private final ModelRenderer magazine_r2;
	private final ModelRenderer magazine_r3;
	private final ModelRenderer bone295;
	private final ModelRenderer bone296;
	private final ModelRenderer bone297;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;

	public MPXMag() {
		textureWidth = 256;
		textureHeight = 256;

		magazine = new QRenderer(this);
		magazine.setRotationPoint(-0.825F, 5.85F, -14.1F);
		setRotationAngle(magazine, -0.1309F, 0.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 75, 10, 0.225F, -12.6739F, -12.0983F, 1, 5, 5, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 50, -1.675F, -12.7F, -7.9F, 2, 5, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 40, -1.675F, -12.6475F, -12.1293F, 2, 5, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 75, 0, -2.575F, -12.6739F, -12.0983F, 1, 5, 5, 0.0F, false));

		magazine_r1 = new ModelRenderer(this);
		magazine_r1.setRotationPoint(0.325F, -7.7F, -7.9F);
		magazine.addChild(magazine_r1);
		setRotationAngle(magazine_r1, -0.5411F, 0.0F, 0.0F);
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 73, 115, -2.0F, -2.0263F, -0.3596F, 2, 2, 1, 0.0F, false));

		magazine_r2 = new ModelRenderer(this);
		magazine_r2.setRotationPoint(1.225F, -12.6653F, -7.2288F);
		magazine.addChild(magazine_r2);
		setRotationAngle(magazine_r2, 0.0F, 0.0F, 0.4189F);
		magazine_r2.cubeList.add(new ModelBox(magazine_r2, 98, 95, -3.4715F, 0.5456F, -4.0F, 1, 1, 4, 0.0F, false));

		magazine_r3 = new ModelRenderer(this);
		magazine_r3.setRotationPoint(1.225F, -12.6653F, -7.2288F);
		magazine.addChild(magazine_r3);
		setRotationAngle(magazine_r3, 0.0F, 0.0F, -0.4189F);
		magazine_r3.cubeList.add(new ModelBox(magazine_r3, 31, 99, -1.0F, -1.0F, -4.0F, 1, 1, 4, 0.0F, false));

		bone295 = new ModelRenderer(this);
		bone295.setRotationPoint(-0.675F, -5.95F, -8.15F);
		magazine.addChild(bone295);
		setRotationAngle(bone295, -0.0873F, 0.0F, 0.0F);
		bone295.cubeList.add(new ModelBox(bone295, 12, 58, -1.875F, -2.341F, -4.1895F, 1, 9, 3, 0.0F, false));
		bone295.cubeList.add(new ModelBox(bone295, 99, 72, -1.875F, -2.3066F, -0.1871F, 1, 9, 1, 0.001F, false));
		bone295.cubeList.add(new ModelBox(bone295, 23, 74, -1.125F, -2.341F, -4.1895F, 3, 9, 3, 0.001F, false));
		bone295.cubeList.add(new ModelBox(bone295, 0, 0, -1.125F, -2.3066F, -0.1871F, 3, 9, 1, 0.0F, false));
		bone295.cubeList.add(new ModelBox(bone295, 12, 97, 0.75F, -1.9598F, -1.8273F, 1, 9, 2, 0.0F, false));
		bone295.cubeList.add(new ModelBox(bone295, 86, 50, -1.75F, -1.9598F, -1.8273F, 1, 9, 2, 0.0F, false));

		bone296 = new ModelRenderer(this);
		bone296.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone295.addChild(bone296);
		setRotationAngle(bone296, -0.0436F, 0.0F, 0.0F);
		

		bone297 = new ModelRenderer(this);
		bone297.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone296.addChild(bone297);
		setRotationAngle(bone297, -0.0436F, 0.0F, 0.0F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone297.addChild(bone3);
		setRotationAngle(bone3, -0.0436F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 39, 24, -1.875F, 6.8819F, -3.2741F, 1, 10, 3, 0.001F, false));
		bone3.cubeList.add(new ModelBox(bone3, 14, 74, -1.875F, 6.394F, 0.6986F, 1, 10, 1, 0.002F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 58, -1.125F, 6.8819F, -3.2741F, 3, 10, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 37, 58, -1.125F, 6.394F, 0.6986F, 3, 10, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 37, 74, 0.75F, 6.8213F, -0.8908F, 1, 10, 2, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 8, 74, -1.75F, 6.8213F, -0.8908F, 1, 10, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone297.addChild(bone6);
		setRotationAngle(bone6, -0.0436F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 49, 59, -2.0F, 16.3518F, -3.1031F, 4, 1, 5, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 18, -2.0F, 15.3518F, -2.1031F, 4, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
