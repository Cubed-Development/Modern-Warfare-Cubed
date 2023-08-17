package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M79Cartridge extends ModelWithAttachments {
	private final ModelRenderer Cartridge;
	private final ModelRenderer MAIN2D19_r1;
	private final ModelRenderer MAIN2SCNDSCOPE6_r1;
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
		Cartridge.setRotationPoint(0.3734F, 6.3949F, -18.2101F);
		Cartridge.cubeList.add(new ModelBox(Cartridge, 84, 0, -1.3734F, -3.3949F, 22.2101F, 3, 1, 8, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 154, 55, -3.3734F, -0.3949F, -19.7899F, 1, 3, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 112, 2, 2.6266F, -0.3949F, -19.7899F, 1, 3, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 52, -1.3734F, -2.4949F, -19.7899F, 3, 1, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 112, 28, -2.3734F, 3.6051F, 9.2101F, 1, 1, 7, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 85, -2.3734F, 3.6051F, -5.7899F, 1, 1, 15, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 90, 76, 1.6266F, 3.6051F, 9.2101F, 1, 1, 7, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 73, 70, 1.6266F, 3.6051F, -5.7899F, 1, 1, 15, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 25, -3.3734F, 4.6051F, -3.7899F, 7, 1, 16, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 74, -3.8734F, -0.3949F, -19.7899F, 1, 3, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 73, 68, 3.1266F, -0.3949F, -19.7899F, 1, 3, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 68, -1.3734F, -2.8949F, -19.7899F, 3, 1, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 38, 63, -1.3734F, 4.1051F, -19.7899F, 3, 1, 3, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 42, 11, -0.8734F, -5.3949F, -19.2899F, 2, 3, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 62, 31, 3.6266F, -4.3949F, 0.2101F, 1, 8, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 31, -4.3734F, -4.3949F, 0.2101F, 1, 8, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 63, 7, -3.3734F, 2.6051F, 0.2101F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 43, 42, 2.6266F, 2.6051F, 0.2101F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 43, 25, 2.6266F, -1.8949F, 0.2101F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 43, 0, -3.3734F, -1.8949F, 0.2101F, 1, 2, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 47, -2.8734F, -2.8949F, 0.2101F, 6, 1, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 60, 52, -2.3734F, -17.3949F, 0.7101F, 1, 14, 1, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 56, 52, 1.6266F, -17.3949F, 0.7101F, 1, 14, 1, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 72, 48, -1.3734F, -17.3949F, 0.7101F, 3, 1, 1, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 30, 38, -3.3734F, -9.3949F, 0.2101F, 7, 1, 2, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 0, -1.3734F, 3.6051F, -19.7899F, 3, 1, 50, 0.0F, false));
		Cartridge.cubeList.add(new ModelBox(Cartridge, 0, 42, -4.8734F, -4.0949F, 0.7101F, 10, 1, 1, 0.0F, false));

		MAIN2D19_r1 = new ModelRenderer(this);
		MAIN2D19_r1.setRotationPoint(-11.168F, 8.4863F, 18.2101F);
		Cartridge.addChild(MAIN2D19_r1);
		setRotationAngle(MAIN2D19_r1, 0.0F, 0.0F, 0.9948F);
		MAIN2D19_r1.cubeList.add(new ModelBox(MAIN2D19_r1, 112, 36, 3.0F, -14.5F, -8.0F, 2, 1, 6, 0.0F, false));
		MAIN2D19_r1.cubeList.add(new ModelBox(MAIN2D19_r1, 56, 52, 3.0F, -14.5F, -23.0F, 2, 1, 15, 0.0F, false));

		MAIN2SCNDSCOPE6_r1 = new ModelRenderer(this);
		MAIN2SCNDSCOPE6_r1.setRotationPoint(-0.3734F, 17.6051F, 18.2101F);
		Cartridge.addChild(MAIN2SCNDSCOPE6_r1);
		setRotationAngle(MAIN2SCNDSCOPE6_r1, 0.7854F, 0.0F, 0.0F);
		MAIN2SCNDSCOPE6_r1.cubeList.add(new ModelBox(MAIN2SCNDSCOPE6_r1, 31, 0, -5.5F, -28.0F, 2.0F, 1, 2, 2, 0.0F, false));

		MAIN2D29BARREL_r1 = new ModelRenderer(this);
		MAIN2D29BARREL_r1.setRotationPoint(13.3289F, 13.1194F, 18.2101F);
		Cartridge.addChild(MAIN2D29BARREL_r1);
		setRotationAngle(MAIN2D29BARREL_r1, 0.0F, 0.0F, -0.7679F);
		MAIN2D29BARREL_r1.cubeList.add(new ModelBox(MAIN2D29BARREL_r1, 42, 67, -5.2F, -19.2F, -38.0F, 1, 3, 3, 0.0F, false));
		MAIN2D29BARREL_r1.cubeList.add(new ModelBox(MAIN2D29BARREL_r1, 56, 72, 1.8F, -19.2F, -38.0F, 1, 3, 3, 0.0F, false));
		MAIN2D29BARREL_r1.cubeList.add(new ModelBox(MAIN2D29BARREL_r1, 102, 103, 1.4F, -19.4F, -38.0F, 1, 3, 50, 0.0F, false));

		MAIN2D27BARREL_r1 = new ModelRenderer(this);
		MAIN2D27BARREL_r1.setRotationPoint(11.2885F, 10.4692F, 18.2101F);
		Cartridge.addChild(MAIN2D27BARREL_r1);
		setRotationAngle(MAIN2D27BARREL_r1, 0.0F, 0.0F, -0.7679F);
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 56, 41, -3.0F, -11.5F, -38.0F, 3, 1, 3, 0.0F, false));
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 0, 58, -3.0F, -18.5F, -38.0F, 3, 1, 3, 0.0F, false));
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 0, 51, -3.0F, -12.0F, -38.0F, 3, 1, 50, 0.0F, false));
		MAIN2D27BARREL_r1.cubeList.add(new ModelBox(MAIN2D27BARREL_r1, 56, 1, -3.0F, -18.0F, -38.0F, 3, 1, 50, 0.0F, false));

		MAIN2D21_r1 = new ModelRenderer(this);
		MAIN2D21_r1.setRotationPoint(-0.3734F, 26.2784F, 10.4149F);
		Cartridge.addChild(MAIN2D21_r1);
		setRotationAngle(MAIN2D21_r1, -0.4189F, 0.0F, 0.0F);
		MAIN2D21_r1.cubeList.add(new ModelBox(MAIN2D21_r1, 112, 55, -2.0F, -14.0F, -24.3F, 5, 1, 3, 0.0F, false));

		MAIN2D18_r1 = new ModelRenderer(this);
		MAIN2D18_r1.setRotationPoint(-8.3611F, 16.4616F, 18.2101F);
		Cartridge.addChild(MAIN2D18_r1);
		setRotationAngle(MAIN2D18_r1, 0.0F, 0.0F, 0.5585F);
		MAIN2D18_r1.cubeList.add(new ModelBox(MAIN2D18_r1, 56, 68, -2.0F, -14.5F, -23.0F, 1, 2, 15, 0.0F, false));
		MAIN2D18_r1.cubeList.add(new ModelBox(MAIN2D18_r1, 35, 42, -2.0F, -14.5F, -8.0F, 1, 2, 6, 0.0F, false));

		MAIN2D6BARREL_r1 = new ModelRenderer(this);
		MAIN2D6BARREL_r1.setRotationPoint(12.1305F, 12.5532F, 18.2101F);
		Cartridge.addChild(MAIN2D6BARREL_r1);
		setRotationAngle(MAIN2D6BARREL_r1, 0.0F, 0.0F, -0.7679F);
		MAIN2D6BARREL_r1.cubeList.add(new ModelBox(MAIN2D6BARREL_r1, 0, 102, -4.2F, -18.0F, -38.0F, 1, 3, 50, 0.0F, false));

		MAIN2D10_r1 = new ModelRenderer(this);
		MAIN2D10_r1.setRotationPoint(-0.3734F, 16.9061F, 24.7868F);
		Cartridge.addChild(MAIN2D10_r1);
		setRotationAngle(MAIN2D10_r1, 0.3316F, 0.0F, 0.0F);
		MAIN2D10_r1.cubeList.add(new ModelBox(MAIN2D10_r1, 0, 70, -1.0F, -20.0F, 1.2F, 3, 1, 3, 0.0F, false));
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
