package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M202Rocket extends ModelWithAttachments {
	private final ModelRenderer mag;
	private final ModelRenderer magtube1;
	private final ModelRenderer magtube2;
	private final ModelRenderer magtube3;
	private final ModelRenderer magtube4;
	private final ModelRenderer stripe;

	public M202Rocket() {
		textureWidth = 256;
		textureHeight = 256;

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 0, 0, -12.0F, -29.0F, 50.0F, 6, 6, 12, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -10.0F, -27.0F, 61.0F, 2, 2, 2, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -9.0F, -30.0F, 61.0F, 1, 1, 7, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -9.0F, -23.0F, 61.0F, 1, 1, 7, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -9.0F, -29.5F, 67.5F, 1, 7, 1, 0.0F, true));
		mag.cubeList.add(new ModelBox(mag, 0, 0, -10.0F, -27.0F, 32.0F, 2, 2, 18, 0.0F, true));

		magtube1 = new ModelRenderer(this);
		magtube1.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(magtube1);
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -33.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -28.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -2.5F, -33.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.5F, -33.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -33.0F, 60.0F, 5, 5, 1, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -31.0F, 60.5F, 5, 1, 1, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -2.0F, -33.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -8.0F, -33.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -34.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -28.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -33.0F, 2.0F, 5, 5, 1, 0.0F, true));
		magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -5.0F, -31.0F, 1.5F, 1, 1, 1, 0.0F, true));

		magtube2 = new ModelRenderer(this);
		magtube2.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(magtube2);
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -33.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -28.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -11.5F, -33.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.5F, -33.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -33.0F, 60.0F, 5, 5, 1, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -31.0F, 60.5F, 5, 1, 1, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -11.0F, -33.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -17.0F, -33.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -34.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -28.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.0F, -33.0F, 2.0F, 5, 5, 1, 0.0F, true));
		magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -14.0F, -31.0F, 1.5F, 1, 1, 1, 0.0F, true));

		magtube3 = new ModelRenderer(this);
		magtube3.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(magtube3);
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -24.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -19.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -11.5F, -24.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.5F, -24.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -24.0F, 60.0F, 5, 5, 1, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -22.0F, 60.5F, 5, 1, 1, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -11.0F, -24.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -17.0F, -24.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -25.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -19.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.0F, -24.0F, 2.0F, 5, 5, 1, 0.0F, true));
		magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -14.0F, -22.0F, 1.5F, 1, 1, 1, 0.0F, true));

		magtube4 = new ModelRenderer(this);
		magtube4.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(magtube4);
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -24.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -19.5F, 20.0F, 5, 1, 42, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -2.5F, -24.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.5F, -24.0F, 20.0F, 1, 5, 42, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -24.0F, 60.0F, 5, 5, 1, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -22.0F, 60.5F, 5, 1, 1, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -2.0F, -24.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -8.0F, -24.0F, 3.0F, 1, 5, 17, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -25.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -19.0F, 3.0F, 5, 1, 17, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.0F, -24.0F, 2.0F, 5, 5, 1, 0.0F, true));
		magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -5.0F, -22.0F, 1.5F, 1, 1, 1, 0.0F, true));

		stripe = new ModelRenderer(this);
		stripe.setRotationPoint(0.0F, 0.0F, 0.0F);
		mag.addChild(stripe);
		stripe.cubeList.add(new ModelBox(stripe, 0, 0, -1.5F, -34.0F, 42.0F, 1, 16, 2, 0.0F, true));
		stripe.cubeList.add(new ModelBox(stripe, 0, 0, -17.5F, -34.0F, 42.0F, 1, 16, 2, 0.0F, true));
		stripe.cubeList.add(new ModelBox(stripe, 0, 0, -17.0F, -34.5F, 42.0F, 16, 1, 2, 0.0F, true));
		stripe.cubeList.add(new ModelBox(stripe, 0, 0, -17.0F, -18.5F, 42.0F, 16, 1, 2, 0.0F, true));
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
