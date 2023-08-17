package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M712mag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag10_r1;
	private final ModelRenderer mag9_r1;
	private final ModelRenderer mag8_r1;
	private final ModelRenderer mag7_r1;
	private final ModelRenderer mag6_r1;
	private final ModelRenderer mag5_r1;
	private final ModelRenderer mag4_r1;

	public M712mag() {
		textureWidth = 512;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -3.5F, -38.9F, -26.3F, 4, 28, 8, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -2.5F, -38.9F, -27.3F, 2, 28, 1, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -2.5F, -38.9F, -18.3F, 2, 28, 1, 0.0F, true));

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		magazine.addChild(mag11_r1);
		setRotationAngle(mag11_r1, 0.0F, 0.7854F, 0.0F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 0, 0, 10.5F, -38.9F, -15.3F, 1, 28, 1, 0.0F, true));

		mag10_r1 = new ModelRenderer(this);
		mag10_r1.setRotationPoint(-12.0865F, 0.0F, -31.5936F);
		magazine.addChild(mag10_r1);
		setRotationAngle(mag10_r1, -3.1416F, -0.7854F, 3.1416F);
		mag10_r1.cubeList.add(new ModelBox(mag10_r1, 0, 0, 0.5F, -38.9F, -18.3F, 1, 28, 1, 0.0F, true));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(7.9652F, 0.0F, -31.3007F);
		magazine.addChild(mag9_r1);
		setRotationAngle(mag9_r1, -3.1416F, 0.7854F, 3.1416F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 0, 0, -2.5F, -38.9F, -17.3F, 1, 28, 1, 0.0F, true));

		mag8_r1 = new ModelRenderer(this);
		mag8_r1.setRotationPoint(11.3794F, 0.0F, -29.8865F);
		magazine.addChild(mag8_r1);
		setRotationAngle(mag8_r1, -3.1416F, 0.7854F, 3.1416F);
		mag8_r1.cubeList.add(new ModelBox(mag8_r1, 0, 0, -0.5F, -38.9F, -17.3F, 1, 28, 1, 0.0F, true));

		mag7_r1 = new ModelRenderer(this);
		mag7_r1.setRotationPoint(-19.4505F, 0.0F, -7.6424F);
		magazine.addChild(mag7_r1);
		setRotationAngle(mag7_r1, 0.0F, -0.7854F, 0.0F);
		mag7_r1.cubeList.add(new ModelBox(mag7_r1, 0, 0, -0.5F, -38.9F, -27.3F, 1, 28, 1, 0.0F, true));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(-20.0362F, 0.0F, -6.2282F);
		magazine.addChild(mag6_r1);
		setRotationAngle(mag6_r1, 0.0F, -0.7854F, 0.0F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 0, 0, -2.5F, -38.9F, -27.3F, 1, 28, 1, 0.0F, true));

		mag5_r1 = new ModelRenderer(this);
		mag5_r1.setRotationPoint(-17.7434F, 0.0F, -45.2505F);
		magazine.addChild(mag5_r1);
		setRotationAngle(mag5_r1, -3.1416F, -0.7854F, 3.1416F);
		mag5_r1.cubeList.add(new ModelBox(mag5_r1, 0, 0, 0.5F, -38.9F, -26.3F, 1, 28, 1, 0.0F, true));

		mag4_r1 = new ModelRenderer(this);
		mag4_r1.setRotationPoint(17.5718F, 0.0F, -10.178F);
		magazine.addChild(mag4_r1);
		setRotationAngle(mag4_r1, 0.0F, 0.7854F, 0.0F);
		mag4_r1.cubeList.add(new ModelBox(mag4_r1, 0, 0, -3.5F, -38.9F, -26.3F, 1, 28, 1, 0.0F, true));
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
