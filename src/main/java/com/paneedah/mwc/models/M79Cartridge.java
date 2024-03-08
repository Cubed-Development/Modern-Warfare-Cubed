package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M79Cartridge extends ModelWithAttachments {
	private final ModelRenderer Cartridge;
	private final ModelRenderer MAIN2D19_r1;
	private final ModelRenderer MAIN2D29BARREL_r1;
	private final ModelRenderer MAIN2D27BARREL_r1;
	private final ModelRenderer MAIN2D21_r1;
	private final ModelRenderer MAIN2D18_r1;
	private final ModelRenderer MAIN2D6BARREL_r1;
	private final ModelRenderer MAIN2D10_r1;

	public M79Cartridge() {
		textureWidth = 256;
		textureHeight = 200;

		Cartridge = new ModelRenderer(this);
		Cartridge.setRotationPoint(0.5F, -10.5111F, -42.0926F);
		Cartridge.cubeList.add(new ModelBox(Cartridge, 84, 0, -1.5F, -2.4889F, 22.0926F, 3, 1, 8, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 154, 55, -3.5F, 0.5111F, -19.9074F, 1, 3, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 112, 2, 2.5F, 0.5111F, -19.9074F, 1, 3, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 52, -1.5F, -1.5889F, -19.9074F, 3, 1, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 31, 42, -2.5F, 4.5111F, 9.0926F, 1, 1, 7, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 85, -2.5F, 4.5111F, -5.9074F, 1, 1, 15, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 15, 42, 1.5F, 4.5111F, 9.0926F, 1, 1, 7, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 73, 70, 1.5F, 4.5111F, -5.9074F, 1, 1, 15, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 25, -3.5F, 5.5111F, -3.9074F, 7, 1, 16, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 5, 73, -4.0F, 0.5111F, -19.9074F, 1, 3, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 72, 3.0F, 0.5111F, -19.9074F, 1, 3, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 38, 63, -1.5F, -1.9889F, -19.9074F, 3, 1, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 58, -1.5F, 5.0111F, -19.9074F, 3, 1, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 30, 25, 0.58F, -4.7889F, -19.6074F, 1, 3, 2, -0.2F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 0, -1.78F, -4.7889F, -18.2074F, 1, 3, 1, -0.2F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 32, 42, -0.65F, -4.4889F, -19.2074F, 1, 2, 2, -0.25F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 11, 0, -1.78F, -4.7889F, -19.6074F, 1, 3, 2, -0.2F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 25, 0.58F, -4.7889F, -18.2074F, 1, 3, 1, -0.2F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 40, 42, -1.6F, -2.9889F, -19.4074F, 3, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 62, 56, 3.5F, -3.4889F, 0.0926F, 1, 8, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 56, -4.5F, -3.4889F, 0.0926F, 1, 8, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 64, 19, -3.5F, 3.5111F, 0.0926F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 64, 15, 2.5F, 3.5111F, 0.0926F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 64, 0, 2.5F, -0.9889F, 0.0926F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 0, -3.5F, -0.9889F, 0.0926F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 112, 46, -3.0F, -1.9889F, 0.0926F, 6, 1, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 1, -1.5F, 4.5111F, -19.9074F, 3, 1, 50, 0.0F, false));

		MAIN2D19_r1 = new ModelRenderer(this);
		MAIN2D19_r1.setRotationPoint(-11.2946F, 25.3923F, 42.0926F);
		Cartridge.addChild(MAIN2D19_r1);
		setRotationAngle(MAIN2D19_r1, 0.0F, 0.0F, 0.9948F);
		MAIN2D19_r1.cubeList.add(new ModelBox(MAIN2D19_r1, 90, 78, -10.4184F, -23.2147F, -32.0F, 2, 1, 6, 0.0F, false));
		MAIN2D19_r1.cubeList.add(new ModelBox(MAIN2D19_r1, 56, 15, -10.4184F, -23.2147F, -47.0F, 2, 1, 15, 0.0F, false));

		MAIN2D29BARREL_r1 = new ModelRenderer(this);
		MAIN2D29BARREL_r1.setRotationPoint(13.2023F, 30.0254F, 42.0926F);
		Cartridge.addChild(MAIN2D29BARREL_r1);
		setRotationAngle(MAIN2D29BARREL_r1, 0.0F, 0.0F, -0.7679F);
		MAIN2D29BARREL_r1.cubeList.add(new ModelBox(MAIN2D29BARREL_r1, 0, 70, 5.914F, -30.7099F, -62.0F, 1, 3, 3, 0.0F, false));
		MAIN2D29BARREL_r1.cubeList.add(new ModelBox(MAIN2D29BARREL_r1, 42, 67, 12.914F, -30.7099F, -62.0F, 1, 3, 3, 0.0F, false));
		MAIN2D29BARREL_r1.cubeList.add(new ModelBox(MAIN2D29BARREL_r1, 102, 103, 12.514F, -30.9099F, -62.0F, 1, 3, 50, 0.0F, false));

		MAIN2D27BARREL_r1 = new ModelRenderer(this);
		MAIN2D27BARREL_r1.setRotationPoint(11.1619F, 27.3752F, 42.0926F);
		Cartridge.addChild(MAIN2D27BARREL_r1);
		setRotationAngle(MAIN2D27BARREL_r1, 0.0F, 0.0F, -0.7679F);
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 56, 52, 8.114F, -23.0099F, -62.0F, 3, 1, 3, 0.0F, false));
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 56, 40, 8.114F, -30.0099F, -62.0F, 3, 1, 3, 0.0F, false));
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 0, 51, 8.114F, -23.5099F, -62.0F, 3, 1, 50, 0.0F, false));
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 0, 0, 8.114F, -29.5099F, -62.0F, 3, 1, 50, 0.0F, false));

		MAIN2D21_r1 = new ModelRenderer(this);
		MAIN2D21_r1.setRotationPoint(-0.5F, 43.1844F, 34.2974F);
		Cartridge.addChild(MAIN2D21_r1);
		setRotationAngle(MAIN2D21_r1, -0.4189F, 0.0F, 0.0F);
		MAIN2D21_r1.cubeList.add(new ModelBox(MAIN2D21_r1, 84, 9, -2.0F, -18.8545F, -52.733F, 5, 1, 3, 0.0F, false));

		MAIN2D18_r1 = new ModelRenderer(this);
		MAIN2D18_r1.setRotationPoint(-8.4877F, 33.3676F, 42.0926F);
		Cartridge.addChild(MAIN2D18_r1);
		setRotationAngle(MAIN2D18_r1, 0.0F, 0.0F, 0.5585F);
		MAIN2D18_r1.cubeList.add(new ModelBox(MAIN2D18_r1, 56, 68, -10.4786F, -28.0688F, -47.0F, 1, 2, 15, 0.0F, false));
		MAIN2D18_r1.cubeList.add(new ModelBox(MAIN2D18_r1, 56, 0, -10.4786F, -28.0688F, -32.0F, 1, 2, 6, 0.0F, false));

		MAIN2D6BARREL_r1 = new ModelRenderer(this);
		MAIN2D6BARREL_r1.setRotationPoint(12.0039F, 29.4592F, 42.0926F);
		Cartridge.addChild(MAIN2D6BARREL_r1);
		setRotationAngle(MAIN2D6BARREL_r1, 0.0F, 0.0F, -0.7679F);
		MAIN2D6BARREL_r1.cubeList.add(new ModelBox(MAIN2D6BARREL_r1, 0, 102, 6.914F, -29.5099F, -62.0F, 1, 3, 50, 0.0F, false));

		MAIN2D10_r1 = new ModelRenderer(this);
		MAIN2D10_r1.setRotationPoint(-0.5F, 33.8121F, 48.6693F);
		Cartridge.addChild(MAIN2D10_r1);
		setRotationAngle(MAIN2D10_r1, 0.3316F, 0.0F, 0.0F);
		MAIN2D10_r1.cubeList.add(new ModelBox(MAIN2D10_r1, 56, 36, -1.0F, -42.9417F, -16.2836F, 3, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Cartridge.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}