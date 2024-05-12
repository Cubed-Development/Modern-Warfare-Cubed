package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziMLOKHandguard extends ModelWithAttachments {
	private final ModelRenderer LowerHandguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public UziMLOKHandguard() {
		textureWidth = 240;
		textureHeight = 240;

		LowerHandguard = new ModelRenderer(this);
		LowerHandguard.setRotationPoint(0.0F, 24.0F, 0.0F);
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 8, 99, 0.8845F, -35.1011F, -33.1F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 99, 9, 0.8845F, -35.1011F, -27.1F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 60, 99, 0.8845F, -35.1011F, -21.1F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 99, 66, 0.8845F, -35.1011F, -37.5F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 38, 123, 0.8845F, -35.1011F, -16.5F, 1, 1, 3, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 92, 123, 0.8845F, -36.1011F, -37.5F, 1, 1, 24, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 118, 124, 0.8845F, -34.1011F, -37.5F, 1, 1, 24, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 96, 80, -4.9155F, -35.1011F, -33.1F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 96, 82, -4.9155F, -35.1011F, -27.1F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 96, 84, -4.9155F, -35.1011F, -21.1F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 96, 87, -4.9155F, -35.1011F, -37.5F, 1, 1, 1, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 118, 54, -4.9155F, -35.1011F, -16.5F, 1, 1, 3, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 105, 62, -4.9155F, -36.1011F, -37.5F, 1, 1, 24, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 107, 0, -4.9155F, -34.1011F, -37.5F, 1, 1, 24, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 141, 172, -3.2155F, -38.6011F, -37.5F, 3, 1, 13, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 110, 29, -0.8155F, -31.6011F, -37.5F, 1, 1, 24, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 80, 97, -3.2155F, -31.6011F, -37.5F, 3, 1, 24, 0.0F, false));
		LowerHandguard.cubeList.add(new ModelBox(LowerHandguard, 175, 67, -0.8155F, -38.6011F, -37.5F, 1, 1, 13, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-3.7899F, -31.9785F, -25.5F);
		LowerHandguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.6021F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 133, 1, -0.3F, -1.5F, -12.0F, 1, 1, 24, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 131, 54, -0.3F, 0.5F, -12.0F, 1, 1, 24, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 99, -0.3F, -0.5F, 11.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 99, 75, -0.3F, -0.5F, -12.0F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 88, 65, -0.3F, -0.5F, -8.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 87, -0.3F, -0.5F, 6.0F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 87, -0.3F, -0.5F, -1.3F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-3.7899F, -37.2215F, -25.5F);
		LowerHandguard.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.6021F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 104, -0.3F, 0.5F, -12.0F, 1, 1, 24, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 85, 2, -0.3F, -0.5F, 11.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 85, 0, -0.3F, -0.5F, -12.0F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 75, -0.3F, -0.5F, -8.0F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 75, -0.3F, -0.5F, 6.0F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 24, 75, -0.3F, -0.5F, -1.3F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 40, 98, -0.3F, -1.5F, -12.0F, 1, 1, 24, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-3.2852F, -37.6027F, -36.4F);
		LowerHandguard.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.6021F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 82, -0.4848F, -3.8F, 2.7F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 80, 35, -0.4848F, -2.9F, 3.7F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 80, 33, -0.4848F, -6.6F, 7.3F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 16, 80, -0.4848F, -7.5F, 6.3F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 79, 76, -0.4848F, -1.9F, 2.6F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 75, -0.4848F, -2.8F, 1.6F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 74, -0.4848F, 0.6F, 0.2F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 72, 73, -0.4848F, -0.3F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 72, -0.4848F, -15.3F, 16.1F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 72, -0.4848F, -16.2F, 15.1F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 68, 52, -0.4848F, -12.8F, 13.7F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 67, -0.4848F, -13.7F, 12.7F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 52, 67, -0.4848F, -11.7F, 12.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 39, 67, -0.4848F, -12.6F, 11.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 67, 33, -0.4848F, -7.7F, 8.5F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 66, 65, -0.4848F, -8.6F, 7.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.7899F, -37.2215F, -25.5F);
		LowerHandguard.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.6021F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 129, -0.7F, 0.5F, -12.0F, 1, 1, 24, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 99, 73, -0.7F, -0.5F, 11.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 99, 68, -0.7F, -0.5F, -12.0F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 80, 83, -0.7F, -0.5F, -8.0F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 72, 83, -0.7F, -0.5F, 6.0F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 83, 9, -0.7F, -0.5F, -1.3F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 110, 98, -0.7F, -1.5F, -12.0F, 1, 1, 24, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.3845F, -34.3011F, -36.5F);
		LowerHandguard.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7854F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 98, 98, -0.5F, 6.5F, 5.9F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 98, 59, -0.5F, 10.0F, 11.2F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 98, -0.5F, 10.8F, 10.1F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 98, -0.5F, 6.9F, 6.4F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 98, -0.5F, 6.1F, 7.4F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 85, 98, -0.5F, 5.7F, 7.0F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 76, 98, -0.5F, 1.8F, 3.2F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 66, 98, -0.5F, 2.6F, 2.2F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 99, -0.5F, 2.3F, 1.6F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 99, 0, -0.5F, -1.3F, 0.1F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 97, -0.5F, 13.2F, 14.4F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 97, 26, -0.5F, 10.3F, 11.8F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 91, -0.5F, 11.2F, 10.8F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 89, -0.5F, 14.0F, 13.3F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 99, 2, -0.5F, 1.5F, 2.7F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 4, 99, -0.5F, -0.5F, -0.9F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 76, -6.3F, -0.5F, -0.9F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 74, -6.3F, 1.5F, 2.7F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 72, -6.3F, -1.3F, 0.1F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 69, -6.3F, 2.3F, 1.6F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 67, -6.3F, 6.5F, 5.9F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 65, -6.3F, 5.7F, 7.0F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 62, -6.3F, 1.8F, 3.2F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 24, 96, -6.3F, 2.6F, 2.2F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 96, -6.3F, 10.0F, 11.2F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 27, 95, -6.3F, 10.8F, 10.1F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 65, 94, -6.3F, 6.9F, 6.4F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 94, 59, -6.3F, 6.1F, 7.4F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 94, -6.3F, 13.2F, 14.4F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 49, 94, -6.3F, 10.3F, 11.8F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 41, 94, -6.3F, 11.2F, 10.8F, 1, 1, 1, -0.001F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 94, 33, -6.3F, 14.0F, 13.3F, 1, 1, 1, -0.001F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.2852F, -37.6027F, -36.4F);
		LowerHandguard.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.7854F, 0.0F, -0.6021F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 91, 3, -0.5152F, -15.3F, 16.1F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 89, 26, -0.5152F, -16.2F, 15.1F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 81, 88, -0.5152F, -12.8F, 13.7F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 88, 62, -0.5152F, -13.7F, 12.7F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 93, 17, -0.5152F, -1.9F, 2.6F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 92, 62, -0.5152F, -2.8F, 1.6F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 91, 9, -0.5152F, 0.6F, 0.2F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 91, 7, -0.5152F, -0.3F, -0.8F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 87, -0.5152F, -11.7F, 12.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 85, 26, -0.5152F, -12.6F, 11.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 85, 6, -0.5152F, -7.7F, 8.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 85, 4, -0.5152F, -8.6F, 7.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 93, 26, -0.5152F, -6.6F, 7.3F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 93, 19, -0.5152F, -7.5F, 6.3F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 94, -0.5152F, -2.9F, 3.7F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 24, 94, -0.5152F, -3.8F, 2.7F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.0118F, -31.7532F, -26.0F);
		LowerHandguard.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.6021F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 26, 123, -1.1F, -1.6F, -11.5F, 1, 1, 24, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 99, 7, -1.1F, -0.6F, 11.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 99, 4, -1.1F, -0.6F, -11.5F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 80, 80, -1.1F, -0.6F, -7.5F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 72, 80, -1.1F, -0.6F, 6.5F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 80, 68, -1.1F, -0.6F, -0.8F, 1, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 66, 122, -1.1F, 0.4F, -11.5F, 1, 1, 24, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		LowerHandguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}