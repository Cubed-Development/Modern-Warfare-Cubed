package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KedrMag extends ModelBase {
	private final ModelRenderer mag;
	private final ModelRenderer mag3_r1_r1;
	private final ModelRenderer mag4_r2_r1;
	private final ModelRenderer mag4_r1_r1;
	private final ModelRenderer mag5_r1_r1;

	public KedrMag() {
		textureWidth = 180;
		textureHeight = 180;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 22.8F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 28, 35, -2.5F, -29.0F, -19.1F, 2, 17, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 34, 70, -2.0F, -27.0F, -15.4F, 1, 15, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 40, 49, -2.0F, -27.9F, -15.6F, 1, 1, 1, -0.1F, false));
		mag.cubeList.add(new ModelBox(mag, 53, 70, -0.9F, -29.0F, -16.4F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 38, 70, -3.1F, -29.0F, -16.4F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 46, 70, -0.9F, -29.0F, -18.3F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 42, 70, -3.1F, -29.0F, -18.3F, 1, 14, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 65, 79, -2.0F, -30.001F, -15.901F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 36, 0, -3.0F, -29.001F, -18.9F, 3, 17, 4, 0.0F, false));

		mag3_r1_r1 = new ModelRenderer(this);
		mag3_r1_r1.setRotationPoint(5.2434F, 0.7414F, 0.0F);
		mag.addChild(mag3_r1_r1);
		setRotationAngle(mag3_r1_r1, 0.0F, 0.0F, -0.1745F);
		mag3_r1_r1.cubeList.add(new ModelBox(mag3_r1_r1, 52, 38, -0.998F, -31.201F, -17.9F, 1, 1, 1, 0.0F, false));
		mag3_r1_r1.cubeList.add(new ModelBox(mag3_r1_r1, 50, 53, -1.0F, -32.201F, -16.902F, 1, 2, 2, 0.0F, false));

		mag4_r2_r1 = new ModelRenderer(this);
		mag4_r2_r1.setRotationPoint(-5.2889F, 1.2622F, 0.0F);
		mag.addChild(mag4_r2_r1);
		setRotationAngle(mag4_r2_r1, 0.0F, 0.0F, 0.1745F);
		mag4_r2_r1.cubeList.add(new ModelBox(mag4_r2_r1, 20, 46, -3.002F, -31.201F, -17.9F, 1, 1, 1, 0.0F, false));
		mag4_r2_r1.cubeList.add(new ModelBox(mag4_r2_r1, 36, 53, -3.0F, -32.201F, -16.902F, 1, 2, 2, 0.0F, false));

		mag4_r1_r1 = new ModelRenderer(this);
		mag4_r1_r1.setRotationPoint(6.0279F, 5.1914F, -26.8911F);
		mag.addChild(mag4_r1_r1);
		setRotationAngle(mag4_r1_r1, -0.7854F, 0.0F, -0.1745F);
		mag4_r1_r1.cubeList.add(new ModelBox(mag4_r1_r1, 52, 47, -0.999F, -33.001F, -18.901F, 1, 1, 1, 0.0F, false));
		mag4_r1_r1.cubeList.add(new ModelBox(mag4_r1_r1, 29, 0, -1.0F, -32.201F, -18.9F, 1, 2, 1, 0.0F, false));

		mag5_r1_r1 = new ModelRenderer(this);
		mag5_r1_r1.setRotationPoint(-6.0734F, 5.7122F, -26.8911F);
		mag.addChild(mag5_r1_r1);
		setRotationAngle(mag5_r1_r1, -0.7854F, 0.0F, 0.1745F);
		mag5_r1_r1.cubeList.add(new ModelBox(mag5_r1_r1, 21, 30, -3.001F, -33.001F, -18.901F, 1, 1, 1, 0.0F, false));
		mag5_r1_r1.cubeList.add(new ModelBox(mag5_r1_r1, 8, 23, -3.0F, -32.201F, -18.9F, 1, 2, 1, 0.0F, false));
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