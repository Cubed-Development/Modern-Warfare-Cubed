package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUG9mmMag extends ModelBase {
	private final ModelRenderer magazine9mm;
	private final ModelRenderer mag3_r1_r1;
	private final ModelRenderer mag5_r1_r1;
	private final ModelRenderer mag5_r1_r2;
	private final ModelRenderer mag5_r1_r3;
	private final ModelRenderer mag5_r1_r4;

	public AUG9mmMag() {
		textureWidth = 300;
		textureHeight = 300;

		magazine9mm = new ModelRenderer(this);
		magazine9mm.setRotationPoint(-1.5F, 9.8816F, 13.4876F);
		

		mag3_r1_r1 = new ModelRenderer(this);
		mag3_r1_r1.setRotationPoint(1.5F, 15.1511F, -13.5047F);
		magazine9mm.addChild(mag3_r1_r1);
		setRotationAngle(mag3_r1_r1, -0.0372F, 0.0F, 0.0F);
		mag3_r1_r1.cubeList.add(new ModelBox(mag3_r1_r1, 290, 0, -2.0F, -26.5462F, 10.5238F, 1, 18, 1, 0.0F, false));
		mag3_r1_r1.cubeList.add(new ModelBox(mag3_r1_r1, 283, 0, -2.5F, -26.5462F, 14.7238F, 2, 18, 1, 0.0F, false));
		mag3_r1_r1.cubeList.add(new ModelBox(mag3_r1_r1, 260, 1, -2.5F, -26.5462F, 10.7238F, 2, 18, 4, 0.0F, false));

		mag5_r1_r1 = new ModelRenderer(this);
		mag5_r1_r1.setRotationPoint(1.5F, 15.1511F, -13.5046F);
		magazine9mm.addChild(mag5_r1_r1);
		setRotationAngle(mag5_r1_r1, -0.0372F, 0.0F, 0.0F);
		mag5_r1_r1.cubeList.add(new ModelBox(mag5_r1_r1, 86, 29, -1.4F, -9.5425F, 10.6237F, 1, 1, 5, 0.0F, false));
		mag5_r1_r1.cubeList.add(new ModelBox(mag5_r1_r1, 72, 96, -2.6F, -9.5425F, 10.6237F, 1, 1, 5, 0.0F, false));

		mag5_r1_r2 = new ModelRenderer(this);
		mag5_r1_r2.setRotationPoint(1.5F, 13.2524F, -13.4339F);
		magazine9mm.addChild(mag5_r1_r2);
		setRotationAngle(mag5_r1_r2, -0.0372F, 0.0F, 0.0F);
		mag5_r1_r2.cubeList.add(new ModelBox(mag5_r1_r2, 272, 0, -1.26F, -25.2425F, 11.9237F, 1, 1, 4, -0.25F, false));
		mag5_r1_r2.cubeList.add(new ModelBox(mag5_r1_r2, 272, 5, -2.74F, -25.2425F, 11.9237F, 1, 1, 4, -0.25F, false));

		mag5_r1_r3 = new ModelRenderer(this);
		mag5_r1_r3.setRotationPoint(0.74F, -12.9407F, -0.9018F);
		magazine9mm.addChild(mag5_r1_r3);
		setRotationAngle(mag5_r1_r3, 0.1439F, 0.3025F, 0.0431F);
		mag5_r1_r3.cubeList.add(new ModelBox(mag5_r1_r3, 272, 10, -0.6177F, 1.4812F, -1.3611F, 1, 1, 2, -0.25F, false));

		mag5_r1_r4 = new ModelRenderer(this);
		mag5_r1_r4.setRotationPoint(-0.74F, -12.9407F, -0.9018F);
		magazine9mm.addChild(mag5_r1_r4);
		setRotationAngle(mag5_r1_r4, 0.146F, -0.3456F, -0.0498F);
		mag5_r1_r4.cubeList.add(new ModelBox(mag5_r1_r4, 272, 13, -0.3936F, 1.4812F, -1.4573F, 1, 1, 2, -0.25F, false));
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