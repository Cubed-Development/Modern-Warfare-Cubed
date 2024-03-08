package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziMag45 extends ModelWithAttachments {
	private final ModelRenderer Mag45;
	private final ModelRenderer mag4_r1_r1;
	private final ModelRenderer mag5_r1_r1;
	private final ModelRenderer mag7_r1_r1;
	private final ModelRenderer mag8_r1_r1;
	private final ModelRenderer magazine_r1;

	public UziMag45() {
		textureWidth = 240;
		textureHeight = 240;

		Mag45 = new ModelRenderer(this);
		Mag45.setRotationPoint(-6.3658F, 24.0F, -0.9549F);
		Mag45.cubeList.add(new ModelBox(Mag45, 80, 33, 3.8658F, -31.4F, -5.0451F, 2, 23, 5, 0.0F, false));
		Mag45.cubeList.add(new ModelBox(Mag45, 94, 33, 3.3658F, -31.39F, -4.5451F, 3, 22, 4, 0.0F, false));
		Mag45.cubeList.add(new ModelBox(Mag45, 120, 0, 3.1658F, -9.4F, -4.5451F, 1, 1, 4, 0.0F, false));
		Mag45.cubeList.add(new ModelBox(Mag45, 86, 116, 5.5658F, -9.4F, -4.5451F, 1, 1, 4, 0.0F, false));

		mag4_r1_r1 = new ModelRenderer(this);
		mag4_r1_r1.setRotationPoint(9.2461F, 5.1F, -1.0269F);
		Mag45.addChild(mag4_r1_r1);
		setRotationAngle(mag4_r1_r1, 0.0F, 1.041F, 0.0F);
		mag4_r1_r1.cubeList.add(new ModelBox(mag4_r1_r1, 64, 27, -3.4885F, -14.5F, -5.0033F, 1, 1, 1, 0.0F, false));

		mag5_r1_r1 = new ModelRenderer(this);
		mag5_r1_r1.setRotationPoint(4.1419F, 5.1F, -4.2107F);
		Mag45.addChild(mag5_r1_r1);
		setRotationAngle(mag5_r1_r1, 3.1416F, -0.5391F, -3.1416F);
		mag5_r1_r1.cubeList.add(new ModelBox(mag5_r1_r1, 8, 65, -0.1984F, -14.5F, -4.39F, 1, 1, 1, 0.0F, false));

		mag7_r1_r1 = new ModelRenderer(this);
		mag7_r1_r1.setRotationPoint(14.1209F, 5.1001F, -14.543F);
		Mag45.addChild(mag7_r1_r1);
		setRotationAngle(mag7_r1_r1, 3.1416F, 0.5391F, -3.1416F);
		mag7_r1_r1.cubeList.add(new ModelBox(mag7_r1_r1, 39, 65, 1.3867F, -14.5F, -13.4702F, 1, 1, 1, 0.0F, false));

		mag8_r1_r1 = new ModelRenderer(this);
		mag8_r1_r1.setRotationPoint(2.393F, 5.1F, 5.9757F);
		Mag45.addChild(mag8_r1_r1);
		setRotationAngle(mag8_r1_r1, 0.0F, -1.041F, 0.0F);
		mag8_r1_r1.cubeList.add(new ModelBox(mag8_r1_r1, 52, 65, -8.7158F, -14.5F, -6.9849F, 1, 1, 1, 0.0F, false));

		magazine_r1 = new ModelRenderer(this);
		magazine_r1.setRotationPoint(4.8658F, -32.0F, -2.5451F);
		Mag45.addChild(magazine_r1);
		setRotationAngle(magazine_r1, 0.2618F, 0.0F, 0.0F);
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 120, 5, 0.5F, 0.0F, -2.2F, 1, 1, 4, 0.0F, false));
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 120, 12, -1.5F, 0.0F, -2.2F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Mag45.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}