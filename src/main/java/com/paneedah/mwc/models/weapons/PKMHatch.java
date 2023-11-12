package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMHatch extends ModelWithAttachments {
	private final ModelRenderer hatch;
	private final ModelRenderer UpperPart;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public PKMHatch() {
		textureWidth = 400;
		textureHeight = 400;

		hatch = new ModelRenderer(this);
		hatch.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		UpperPart = new ModelRenderer(this);
		UpperPart.setRotationPoint(1.0F, -41.6F, -38.7F);
		hatch.addChild(UpperPart);
		UpperPart.cubeList.add(new ModelBox(UpperPart, 194, 273, -1.0F, 2.6F, 23.7F, 2, 1, 19, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 0, 30, -5.7F, 0.6F, 13.0F, 2, 3, 11, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 270, 83, -5.7F, 0.6F, 0.9F, 2, 2, 21, -0.002F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 179, 142, -5.7F, -2.0F, 2.0F, 2, 1, 2, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 43, 90, -4.7F, -1.4F, -1.0F, 4, 2, 5, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 214, 46, -8.7F, -1.4F, 0.4F, 5, 1, 12, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 87, 106, -8.7F, -0.4F, 11.4F, 5, 4, 1, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 87, 101, -8.7F, -0.4F, 0.4F, 5, 4, 1, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 144, 26, -5.7F, -1.2F, 11.9F, 2, 2, 10, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 207, 69, -5.7F, 0.1F, 18.8F, 2, 2, 22, -0.002F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 26, 175, -3.325F, 0.1F, 40.2F, 2, 2, 2, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 273, 130, -5.7F, 2.1F, 22.7F, 2, 1, 20, -0.002F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 130, 128, -5.0F, 2.6F, 41.7F, 4, 1, 1, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 144, 118, -5.0F, 2.1F, 40.7F, 4, 1, 2, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 165, 169, -5.7F, 2.6F, 23.7F, 2, 1, 19, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 272, 273, -0.8F, 1.6F, 23.9F, 2, 1, 13, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 157, 195, -5.8F, 1.6F, 23.9F, 2, 1, 13, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 273, 151, -1.0F, 2.1F, 22.7F, 2, 1, 20, -0.002F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 207, 93, -1.0F, 0.1F, 18.8F, 2, 2, 22, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 70, 142, -3.8F, -1.4F, 14.5F, 3, 2, 25, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 0, 140, -3.8F, -2.7F, 12.8F, 3, 2, 10, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 236, 46, -5.8F, -3.2F, 3.7F, 6, 3, 9, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 144, 108, -1.0F, -3.2F, 3.7F, 2, 1, 9, -0.001F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 72, 101, -1.0F, -1.2F, 10.9F, 2, 2, 11, -0.001F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 50, 178, -1.0F, -3.0F, 10.9F, 2, 2, 2, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 140, 153, -1.0F, -3.0F, 3.7F, 2, 1, 9, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 146, 179, -1.0F, -2.0F, 2.0F, 2, 1, 2, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 144, 272, -1.1F, 0.6F, 0.9F, 2, 2, 21, -0.001F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 72, 29, -1.1F, 0.6F, 13.0F, 2, 3, 11, 0.0F, false));
		UpperPart.cubeList.add(new ModelBox(UpperPart, 72, 131, -1.0F, 2.1F, 22.1F, 2, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -0.2F, 16.4F);
		UpperPart.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.6981F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 179, 146, -1.0F, -4.2F, 3.5F, 2, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 97, 179, -5.7F, -4.2F, 3.5F, 2, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -2.0F, 11.9F);
		UpperPart.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6981F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 131, -1.0F, 1.3F, 0.4F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 130, -1.0F, 0.9F, -0.3F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 121, 101, -3.8F, -0.4F, 0.4F, 2, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 62, 127, -3.8F, 1.0F, 0.4F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 121, 104, -2.8F, -0.4F, 0.4F, 2, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 54, 128, -2.8F, 1.3F, 0.4F, 2, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 72, -5.7F, -0.4F, 0.4F, 1, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 0, -5.7F, -0.1F, -0.6F, 1, 3, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 121, -5.0F, -0.4F, 0.4F, 6, 2, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 50, 23, -5.0F, -0.1F, -0.6F, 6, 3, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.2F, 1.1F, 38.8F);
		UpperPart.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.829F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 78, 179, -4.0F, -2.2F, -1.4F, 3, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 171, 169, -4.0F, -2.2F, -0.6F, 3, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 124, 131, -5.2F, -2.2F, 0.6F, 6, 2, 2, -0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 99, -5.9F, -2.2F, 1.4F, 1, 2, 2, -0.002F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 94, 85, -5.9F, -2.2F, 0.6F, 1, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 109, 160, -5.2F, -2.2F, 1.4F, 6, 2, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.8F, -1.7F, 17.8F);
		UpperPart.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.6545F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 170, 122, -1.0F, -3.8F, 3.4F, 3, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.2F, 0.0F, 0.0F);
		UpperPart.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 52, -1.2F, -2.6F, 6.8F, 2, 1, 15, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 144, 0, -0.2F, -1.6F, 14.5F, 2, 1, 25, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.2F, 0.0F, 0.0F);
		UpperPart.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 178, 52, -3.0F, -4.3F, 6.8F, 2, 1, 15, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 144, 26, -4.0F, -3.3F, 14.5F, 2, 1, 25, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-5.0F, 3.1F, 21.2F);
		UpperPart.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2705F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 46, 58, -0.8F, -2.2F, -6.4F, 2, 1, 9, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 16, 4.2F, -2.2F, -8.4F, 2, 1, 11, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 114, 4.0F, -2.2F, -8.4F, 2, 2, 11, 0.0005F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-8.7F, -0.9F, 6.4F);
		UpperPart.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 44, -0.35F, -0.4F, -6.0F, 1, 1, 12, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-4.7F, 0.0F, 0.0F);
		UpperPart.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3403F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 101, 113, 0.0F, -1.6F, -0.5F, 4, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		hatch.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}