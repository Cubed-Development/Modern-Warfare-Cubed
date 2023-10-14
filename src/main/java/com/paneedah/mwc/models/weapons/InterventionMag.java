package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionMag extends ModelBase {
	private final ModelRenderer maganize;
	private final ModelRenderer Mag18_r1;
	private final ModelRenderer Mag18_r2;
	private final ModelRenderer Mag17_r1;

	public InterventionMag() {
		textureWidth = 512;
		textureHeight = 512;

		maganize = new ModelRenderer(this);
		maganize.setRotationPoint(1.5F, -7.2064F, -10.4511F);
		maganize.cubeList.add(new ModelBox(maganize, 124, 172, -1.5F, -7.2936F, 4.4511F, 3, 13, 2, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 102, 132, -1.5F, -7.2936F, 1.4511F, 3, 12, 2, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 17, 115, -1.5F, -7.2936F, -7.5489F, 3, 11, 2, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 184, 106, -1.52F, -7.2936F, 2.9511F, 3, 12, 1, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 134, 172, -1.52F, -7.2936F, -0.0489F, 3, 12, 1, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 86, 132, -1.5F, -7.2936F, -1.5489F, 3, 12, 2, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 0, 115, -1.5F, -7.2936F, -4.5489F, 3, 11, 2, 0.0F, false));
		maganize.cubeList.add(new ModelBox(maganize, 45, 33, -1.5F, 4.2064F, 1.9511F, 3, 1, 2, -0.01F, false));
		maganize.cubeList.add(new ModelBox(maganize, 58, 106, -1.0F, -7.2936F, -5.5489F, 2, 11, 10, 0.01F, false));
		maganize.cubeList.add(new ModelBox(maganize, 95, 160, 0.4F, -8.0936F, -0.6489F, 1, 1, 6, -0.15F, false));
		maganize.cubeList.add(new ModelBox(maganize, 150, 212, -1.3F, -7.8936F, -7.5489F, 1, 1, 5, -0.15F, false));
		maganize.cubeList.add(new ModelBox(maganize, 139, 152, -1.4F, -8.0936F, -0.6489F, 1, 1, 6, -0.15F, false));
		maganize.cubeList.add(new ModelBox(maganize, 143, 211, 0.4F, -7.8936F, -7.5489F, 1, 1, 5, -0.15F, false));

		Mag18_r1 = new ModelRenderer(this);
		Mag18_r1.setRotationPoint(0.0F, 69.8188F, -0.3975F);
		maganize.addChild(Mag18_r1);
		setRotationAngle(Mag18_r1, -1.0123F, 0.0F, 0.0F);
		Mag18_r1.cubeList.add(new ModelBox(Mag18_r1, 135, 8, 0.4F, -46.0F, -63.1F, 1, 1, 1, -0.15F, false));
		Mag18_r1.cubeList.add(new ModelBox(Mag18_r1, 135, 6, -1.4F, -46.0F, -63.1F, 1, 1, 1, -0.15F, false));

		Mag18_r2 = new ModelRenderer(this);
		Mag18_r2.setRotationPoint(0.0F, -7.4061F, -0.3975F);
		maganize.addChild(Mag18_r2);
		setRotationAngle(Mag18_r2, 1.0123F, 0.0F, 0.0F);
		Mag18_r2.cubeList.add(new ModelBox(Mag18_r2, 135, 10, 0.4F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));
		Mag18_r2.cubeList.add(new ModelBox(Mag18_r2, 136, 0, -1.4F, -0.5F, -0.5F, 1, 1, 1, -0.15F, false));

		Mag17_r1 = new ModelRenderer(this);
		Mag17_r1.setRotationPoint(-1.5F, -8.6182F, 22.92F);
		maganize.addChild(Mag17_r1);
		setRotationAngle(Mag17_r1, 1.3756F, 0.0F, 0.0F);
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 76, 172, 0.5F, -26.5F, -17.9F, 2, 12, 3, -0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 101, 85, 0.0F, -15.3F, -18.0F, 3, 2, 1, 0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 47, 120, 0.0F, -17.0F, -18.0F, 3, 1, 1, 0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 105, 68, 0.0F, -18.5F, -18.0F, 3, 2, 1, 0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 123, 15, 0.0F, -20.0F, -18.0F, 3, 1, 1, 0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 115, 68, 0.0F, -21.5F, -18.0F, 3, 2, 1, 0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 119, 90, 0.0F, -24.5F, -18.0F, 3, 2, 1, 0.01F, false));
		Mag17_r1.cubeList.add(new ModelBox(Mag17_r1, 119, 99, 0.0F, -27.5F, -18.0F, 3, 2, 1, 0.01F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		maganize.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}