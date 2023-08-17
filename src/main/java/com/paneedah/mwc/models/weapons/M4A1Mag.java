package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M4A1Mag extends ModelBase {
	private final ModelRenderer gun1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun8;
	private final ModelRenderer gun9;
	private final ModelRenderer gun10;
	private final ModelRenderer gun11;
	private final ModelRenderer gun12;
	private final ModelRenderer gun13;
	private final ModelRenderer gun14;
	private final ModelRenderer gun15;
	private final ModelRenderer gun16;

	public M4A1Mag() {
		textureWidth = 64;
		textureHeight = 64;

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(1.0F, -12.0F, -4.5F);
		gun1.cubeList.add(new ModelBox(gun1, 42, 42, -0.001F, -0.001F, -0.101F, 3, 7, 5, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 0, 26, 1.998F, -0.501F, 2.849F, 1, 1, 3, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 22, 0, -0.002F, -0.501F, 2.849F, 1, 1, 3, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 0, 0, 0.0F, -0.002F, 4.749F, 3, 7, 1, 0.0F, false));
		gun1.cubeList.add(new ModelBox(gun1, 16, 16, 0.5F, 0.999F, 4.999F, 2, 6, 1, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(1.0F, -5.0F, 1.5F);
		setRotationAngle(gun2, -1.7846F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 0, 0, 0.001F, 1.001F, 0.001F, 3, 5, 10, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 15, 0.002F, 0.251F, 0.0F, 3, 1, 10, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 26, 0.501F, 0.001F, 0.001F, 2, 1, 10, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(0.8F, -12.0F, -0.5F);
		gun3.cubeList.add(new ModelBox(gun3, 4, 37, -0.099F, 0.0F, -0.1F, 1, 7, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 30, 16, -0.098F, -0.499F, -0.101F, 1, 1, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 22, 16, -0.1F, 0.0F, -0.6F, 1, 7, 1, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 30, 18, -0.099F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(3.2F, -12.0F, -0.5F);
		gun4.cubeList.add(new ModelBox(gun4, 0, 37, 0.101F, 0.0F, -0.1F, 1, 7, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 6, 23, 0.201F, 2.0F, -0.5F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 22, 4, 0.2F, 1.999F, 0.0F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 21, 7, 0.3F, 2.699F, -0.2F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 6, 8, 0.501F, 3.099F, -0.2F, 1, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 30, 13, 0.102F, -0.499F, -0.101F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 6, 15, 0.1F, 0.0F, -0.6F, 1, 7, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 30, 11, 0.101F, -0.5F, -0.6F, 1, 1, 1, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 16, 0, -0.8F, -0.2F, 1.0F, 2, 7, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 30, 8, 0.201F, -0.7F, 1.001F, 1, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 0, 23, -0.799F, 6.3F, 1.001F, 2, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 0, 15, -2.6F, -0.2F, 1.0F, 2, 7, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 4, 30, -2.599F, -0.7F, 1.001F, 1, 1, 1, -0.2F, false));
		gun4.cubeList.add(new ModelBox(gun4, 16, 23, -2.599F, 6.3F, 1.001F, 2, 1, 1, -0.2F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(0.8F, -5.0F, 1.5F);
		setRotationAngle(gun5, -1.7846F, 0.0F, 0.0F);
		gun5.cubeList.add(new ModelBox(gun5, 30, 11, -0.098F, 1.0977F, 0.0212F, 1, 1, 10, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 14, 27, -0.099F, 1.5977F, 0.0212F, 1, 1, 10, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(3.2F, -5.0F, 1.5F);
		setRotationAngle(gun6, -1.7846F, 0.0F, 0.0F);
		gun6.cubeList.add(new ModelBox(gun6, 30, 0, 0.102F, 1.0977F, 0.0212F, 1, 1, 10, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 16, 16, -0.8F, -0.0023F, -0.0788F, 2, 1, 10, -0.2F, false));
		gun6.cubeList.add(new ModelBox(gun6, 26, 28, 0.101F, 1.5977F, 0.0212F, 1, 1, 10, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 0, 8, -0.799F, -0.003F, 9.2212F, 2, 1, 1, -0.2F, false));
		gun6.cubeList.add(new ModelBox(gun6, 16, 5, -2.6F, -0.0023F, -0.0788F, 2, 1, 10, -0.2F, false));
		gun6.cubeList.add(new ModelBox(gun6, 16, 8, -2.599F, -0.003F, 9.2212F, 2, 1, 1, -0.2F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(3.2F, -5.0F, -1.0F);
		setRotationAngle(gun7, -1.7846F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 42, 0, 0.001F, 1.0F, 0.0F, 1, 1, 9, 0.0F, false));
		gun7.cubeList.add(new ModelBox(gun7, 0, 37, 0.002F, 0.5F, 0.0F, 1, 1, 9, 0.0F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(3.2F, -12.0F, -3.0F);
		gun8.cubeList.add(new ModelBox(gun8, 34, 0, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 0, 30, -0.001F, 0.001F, -0.75F, 1, 1, 1, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 18, 27, 0.001F, 0.0F, 0.5F, 1, 7, 1, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(3.2F, -12.0F, -4.5F);
		gun9.cubeList.add(new ModelBox(gun9, 30, 27, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(3.2F, -5.0F, -3.5F);
		setRotationAngle(gun10, -1.7846F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 39, 32, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(0.8F, -12.0F, -4.5F);
		gun11.cubeList.add(new ModelBox(gun11, 30, 0, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(0.8F, -5.0F, -1.0F);
		setRotationAngle(gun12, -1.7846F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 22, 39, 0.001F, 1.0F, 0.0F, 1, 1, 9, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 11, 38, 0.002F, 0.5F, 0.0F, 1, 1, 9, 0.0F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(0.8F, -12.0F, -3.0F);
		gun13.cubeList.add(new ModelBox(gun13, 26, 27, 0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 5, 26, 0.001F, 0.001F, -0.75F, 1, 1, 1, 0.0F, false));
		gun13.cubeList.add(new ModelBox(gun13, 14, 27, 0.001F, 0.0F, 0.5F, 1, 7, 1, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(0.8F, -5.0F, -3.5F);
		setRotationAngle(gun14, -1.7846F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 38, 22, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(3.2F, 3.3F, -2.7F);
		setRotationAngle(gun15, -1.7846F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 4, 32, 0.0F, 1.1F, 0.0F, 1, 1, 1, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 30, 24, 0.001F, 0.6F, 0.0F, 1, 1, 1, 0.0F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(0.8F, 3.3F, -2.7F);
		setRotationAngle(gun16, -1.7846F, 0.0F, 0.0F);
		gun16.cubeList.add(new ModelBox(gun16, 0, 32, 0.0F, 1.1F, 0.0F, 1, 1, 1, 0.0F, false));
		gun16.cubeList.add(new ModelBox(gun16, 30, 22, 0.001F, 0.6F, 0.0F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun1.render(f5);
		gun2.render(f5);
		gun3.render(f5);
		gun4.render(f5);
		gun5.render(f5);
		gun6.render(f5);
		gun7.render(f5);
		gun8.render(f5);
		gun9.render(f5);
		gun10.render(f5);
		gun11.render(f5);
		gun12.render(f5);
		gun13.render(f5);
		gun14.render(f5);
		gun15.render(f5);
		gun16.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
