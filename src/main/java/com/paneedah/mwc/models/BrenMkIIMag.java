package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BrenMkIIMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer Mag11_r1;
	private final ModelRenderer Mag10_r1;
	private final ModelRenderer Mag8_r1;
	private final ModelRenderer Mag7_r1;
	private final ModelRenderer Mag5_r1;
	private final ModelRenderer Mag4_r1;
	private final ModelRenderer Mag3_r1;
	private final ModelRenderer Mag2_r1;

	public BrenMkIIMag() {
		textureWidth = 256;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 1.0F, -31.0F, 6.4F, 3, 2, 7, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 1.0F, -31.0F, 14.4F, 3, 2, 1, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 1.5F, -35.0F, 4.4F, 2, 6, 10, 0.0F, true));

		Mag11_r1 = new ModelRenderer(this);
		Mag11_r1.setRotationPoint(0.0F, -33.1896F, -23.3414F);
		magazine.addChild(Mag11_r1);
		setRotationAngle(Mag11_r1, -1.1302F, 0.0F, 0.0F);
		Mag11_r1.cubeList.add(new ModelBox(Mag11_r1, 0, 0, 1.5F, -35.0F, 4.5F, 2, 10, 10, 0.0F, true));

		Mag10_r1 = new ModelRenderer(this);
		Mag10_r1.setRotationPoint(0.0F, -15.9067F, -28.063F);
		magazine.addChild(Mag10_r1);
		setRotationAngle(Mag10_r1, -0.8031F, 0.0F, 0.0F);
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 0, 0, 1.5F, -47.3F, -3.95F, 2, 10, 11, 0.0F, true));
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 0, 0, 1.0F, -48.1F, -4.0F, 3, 1, 9, 0.0F, true));
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 0, 0, 1.0F, -46.0F, -4.0F, 3, 7, 9, 0.0F, true));

		Mag8_r1 = new ModelRenderer(this);
		Mag8_r1.setRotationPoint(0.0F, -26.7025F, -27.011F);
		magazine.addChild(Mag8_r1);
		setRotationAngle(Mag8_r1, -1.1302F, 0.0F, 0.0F);
		Mag8_r1.cubeList.add(new ModelBox(Mag8_r1, 0, 0, 1.0F, -41.65F, -1.45F, 3, 1, 10, 0.0F, true));

		Mag7_r1 = new ModelRenderer(this);
		Mag7_r1.setRotationPoint(0.0F, 1.6551F, 6.5002F);
		magazine.addChild(Mag7_r1);
		setRotationAngle(Mag7_r1, 0.1785F, 0.0F, 0.0F);
		Mag7_r1.cubeList.add(new ModelBox(Mag7_r1, 0, 0, 1.0F, -36.5F, 13.5F, 3, 6, 1, 0.0F, true));

		Mag5_r1 = new ModelRenderer(this);
		Mag5_r1.setRotationPoint(0.0F, -24.5328F, -27.6893F);
		magazine.addChild(Mag5_r1);
		setRotationAngle(Mag5_r1, -1.1302F, 0.0F, 0.0F);
		Mag5_r1.cubeList.add(new ModelBox(Mag5_r1, 0, 0, 1.0F, -41.1F, -2.5F, 3, 7, 9, 0.0F, true));

		Mag4_r1 = new ModelRenderer(this);
		Mag4_r1.setRotationPoint(0.0F, 0.2588F, 6.1069F);
		magazine.addChild(Mag4_r1);
		setRotationAngle(Mag4_r1, 0.1785F, 0.0F, 0.0F);
		Mag4_r1.cubeList.add(new ModelBox(Mag4_r1, 0, 0, 1.0F, -35.0F, 5.5F, 3, 6, 7, 0.0F, true));
		Mag4_r1.cubeList.add(new ModelBox(Mag4_r1, 0, 0, 1.0F, -34.0F, 2.5F, 3, 5, 2, 0.0F, true));

		Mag3_r1 = new ModelRenderer(this);
		Mag3_r1.setRotationPoint(0.0F, -13.6443F, -27.8347F);
		magazine.addChild(Mag3_r1);
		setRotationAngle(Mag3_r1, -0.8031F, 0.0F, 0.0F);
		Mag3_r1.cubeList.add(new ModelBox(Mag3_r1, 0, 0, 1.0F, -39.6F, -5.85F, 3, 2, 7, 0.0F, true));

		Mag2_r1 = new ModelRenderer(this);
		Mag2_r1.setRotationPoint(0.0F, -23.5709F, -28.1724F);
		magazine.addChild(Mag2_r1);
		setRotationAngle(Mag2_r1, -1.1302F, 0.0F, 0.0F);
		Mag2_r1.cubeList.add(new ModelBox(Mag2_r1, 0, 0, 1.0F, -34.0F, -2.5F, 3, 2, 7, 0.0F, true));
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