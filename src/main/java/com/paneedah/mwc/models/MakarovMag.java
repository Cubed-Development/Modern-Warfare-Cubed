package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MakarovMag extends ModelWithAttachments {
	private final ModelRenderer Mag;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun19_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun14_r1;
	private final ModelRenderer gun10_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun1_r1;

	public MakarovMag() {
		textureWidth = 200;
		textureHeight = 200;

		Mag = new ModelRenderer(this);
		Mag.setRotationPoint(-1.5767F, -0.4483F, -0.2229F);
		setRotationAngle(Mag, 2.8449F, 0.0F, 3.1416F);
		Mag.cubeList.add(new ModelBox(Mag, 25, 17, -2.0233F, 6.1632F, 1.219F, 3, 1, 1, 0.0F, false));
		Mag.cubeList.add(new ModelBox(Mag, 4, 48, 0.5767F, 6.1632F, 1.219F, 1, 1, 1, 0.0F, false));
		Mag.cubeList.add(new ModelBox(Mag, 93, 52, -1.7233F, -6.8368F, -3.281F, 3, 1, 4, 0.0F, false));
		Mag.cubeList.add(new ModelBox(Mag, 36, 49, 0.5767F, -6.9368F, -1.481F, 1, 2, 3, 0.0F, false));
		Mag.cubeList.add(new ModelBox(Mag, 33, 112, -1.996F, -6.9563F, -1.4615F, 3, 2, 3, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(1.2767F, 22.4794F, 10.2169F);
		Mag.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.2231F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 25, 37, -3.3F, -30.1F, -6.5F, 1, 2, 2, 0.0F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 41, 37, -0.7195F, -30.1F, -6.5F, 1, 2, 2, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(1.2767F, 23.1349F, 8.3639F);
		Mag.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.2231F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 24, -0.7273F, -21.5F, -4.5F, 1, 3, 2, 0.0F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 16, 24, -3.3F, -21.5F, -4.5F, 1, 3, 2, 0.0F, false));

		gun19_r1 = new ModelRenderer(this);
		gun19_r1.setRotationPoint(1.2767F, 22.4819F, 10.1947F);
		Mag.addChild(gun19_r1);
		setRotationAngle(gun19_r1, 0.2231F, 0.0F, 0.0F);
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 83, 46, -0.9F, -30.0F, -6.5F, 1, 13, 2, 0.0F, false));
		gun19_r1.cubeList.add(new ModelBox(gun19_r1, 130, 16, -3.1F, -30.0F, -6.5F, 1, 13, 2, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(1.2767F, 22.7792F, 10.34F);
		Mag.addChild(gun15_r1);
		setRotationAngle(gun15_r1, 0.2231F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 61, 49, -0.6961F, -30.5F, -5.1F, 1, 13, 3, 0.0F, false));

		gun14_r1 = new ModelRenderer(this);
		gun14_r1.setRotationPoint(1.2767F, 22.7792F, 10.3596F);
		Mag.addChild(gun14_r1);
		setRotationAngle(gun14_r1, 0.2231F, 0.0F, 0.0F);
		gun14_r1.cubeList.add(new ModelBox(gun14_r1, 71, 46, -3.3937F, -30.5F, -5.1F, 3, 13, 3, 0.0F, false));

		gun10_r1 = new ModelRenderer(this);
		gun10_r1.setRotationPoint(1.2767F, 21.2726F, 12.3501F);
		Mag.addChild(gun10_r1);
		setRotationAngle(gun10_r1, 0.2974F, 0.0F, 0.0F);
		gun10_r1.cubeList.add(new ModelBox(gun10_r1, 59, 66, -3.0F, -30.5F, -7.0F, 3, 1, 2, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(1.2767F, 22.3713F, 10.1823F);
		Mag.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.2231F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 74, 109, -0.7F, -30.0F, -7.0F, 1, 13, 1, 0.0F, false));
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 62, 25, -3.3938F, -30.0F, -7.0391F, 3, 13, 1, 0.0F, false));

		gun1_r1 = new ModelRenderer(this);
		gun1_r1.setRotationPoint(1.2767F, 24.3983F, 7.275F);
		Mag.addChild(gun1_r1);
		setRotationAngle(gun1_r1, 0.1487F, 0.0F, 0.0F);
		gun1_r1.cubeList.add(new ModelBox(gun1_r1, 25, 61, -3.5F, -18.5F, -5.2F, 4, 2, 6, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
