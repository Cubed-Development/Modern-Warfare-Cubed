package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PT2Stock extends ModelWithAttachments {
	private final ModelRenderer PT2Stock;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;

	public PT2Stock() {
		textureWidth = 400;
		textureHeight = 400;

		PT2Stock = new ModelRenderer(this);
		PT2Stock.setRotationPoint(-1.4F, -10.0F, 8.0F);
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 72, 101, -2.0F, -3.0F, -4.0F, 4, 6, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 101, 101, -1.0F, -3.0F, -3.0F, 2, 6, 6, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 86, 43, -2.0F, -2.9F, -3.0F, 1, 5, 6, -0.001F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 102, 72, -1.5F, -1.5F, 3.0F, 3, 2, 16, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 217, 273, -1.5F, 0.5F, 3.0F, 3, 1, 17, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 122, 2, -1.5F, 1.5F, 4.0F, 3, 5, 5, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 70, 147, -1.5F, 5.5F, 8.0F, 3, 2, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 172, 72, -1.5F, 10.5F, 10.0F, 3, 2, 12, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 84, 147, -1.5F, 0.9F, 18.0F, 3, 1, 2, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 130, 163, -1.5F, -1.1F, 25.6F, 3, 3, 1, -0.001F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 70, 178, -1.5F, -1.5F, 19.0F, 3, 2, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 30, 90, -1.5F, -1.5F, 20.0F, 3, 1, 7, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 102, 10, -1.5F, 1.9F, 21.0F, 3, 3, 5, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 72, 108, -2.2F, 2.2F, 24.0F, 3, 2, 2, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 59, 118, -1.0F, -6.1F, 22.0F, 2, 5, 2, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 169, 273, -2.0F, -7.1F, 6.7F, 4, 1, 18, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 97, 169, -1.0F, -8.1F, 6.7F, 2, 1, 18, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 22, 104, -1.1F, -1.1F, 21.7F, 2, 9, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 21, 70, -1.1F, -1.1F, 23.0F, 2, 9, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 86, 47, -1.1F, 6.9F, 22.7F, 2, 1, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 144, 94, -1.5F, 1.9F, 20.0F, 3, 1, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 124, 135, -1.5F, 1.9F, 19.5F, 3, 1, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 102, 85, -2.5F, -1.5F, 27.0F, 5, 1, 2, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 130, 135, -1.5F, -2.5F, 27.0F, 3, 1, 2, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 94, 89, -1.0F, 1.8F, 3.0F, 2, 1, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 14, 84, -1.0F, -2.9F, 3.0F, 2, 5, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 41, 118, -2.0F, 1.8F, -3.0F, 1, 1, 6, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 14, 84, 1.0F, -2.9F, -3.0F, 1, 5, 6, -0.002F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 86, 89, 1.4F, 1.8F, 0.625F, 2, 1, 1, 0.0F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 30, 70, 1.4F, -2.9F, 0.625F, 2, 5, 1, -0.001F, false));
		PT2Stock.cubeList.add(new ModelBox(PT2Stock, 117, 19, 1.0F, 1.8F, -3.0F, 1, 1, 6, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.8F, 0.0F, -1.75F);
		PT2Stock.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.7854F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 131, 28, -2.4F, -3.0F, -0.25F, 1, 6, 2, -0.002F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, -1.75F);
		PT2Stock.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 131, 56, -0.6F, -3.0F, -2.25F, 1, 6, 2, -0.002F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 30, 90, -4.1F, -3.0F, 3.05F, 1, 6, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 0, -4.1F, -3.0F, 2.65F, 1, 6, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 102, 19, -3.6F, -3.0F, 3.05F, 1, 6, 1, -0.001F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, -1.75F);
		PT2Stock.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 45, 59, 3.325F, 1.8F, 1.775F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 48, 60, 3.775F, -2.9F, 2.35F, 1, 5, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 175, 2, 3.775F, 1.8F, 2.35F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 102, 90, 3.775F, -2.9F, -0.05F, 1, 5, 3, -0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 173, 4, 3.775F, 1.8F, -0.05F, 1, 1, 3, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 28, 1.925F, -2.9F, 3.775F, 1, 5, 1, -0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 63, 70, 1.925F, 1.8F, 3.775F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 33, 49, 2.075F, -2.9F, -0.725F, 2, 5, 1, -0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 86, 76, 2.075F, 1.8F, -0.725F, 2, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 84, 2.375F, -2.9F, 3.775F, 1, 5, 1, -0.001F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 79, 16, 2.375F, 1.8F, 3.775F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 11.676F, 23.4206F);
		PT2Stock.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.6981F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 8, -1.5F, -1.0F, 0.3F, 3, 2, 3, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.5F, 0.0F, 26.5F);
		PT2Stock.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.0873F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 87, 35, -2.0F, 10.9F, -3.55F, 3, 2, 3, -0.002F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 60, 49, -2.0F, -0.6F, -0.55F, 3, 14, 1, 0.0005F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 13.8863F, 26.7368F);
		PT2Stock.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.0618F, 0.0617F, 0.7835F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 101, 101, 0.4F, -2.1F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 102, 29, 0.4F, -1.7F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 102, 32, -1.7F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 102, 48, -2.1F, 0.4F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.5F, 0.0F, 27.5F);
		PT2Stock.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.0873F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 124, -2.0F, 13.4F, -0.55F, 3, 1, 2, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 70, -3.0F, -0.6F, -0.55F, 5, 14, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, -2.0F, 28.0F);
		PT2Stock.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 102, 51, 0.425F, 0.7F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 101, 104, 0.425F, 1.1F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 112, 72, -1.7F, -1.4F, -1.0F, 1, 1, 2, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 113, 0, -2.1F, -1.4F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 3.4F, 23.5F);
		PT2Stock.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.6545F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 175, 177, -1.5F, -1.325F, -2.9F, 3, 1, 1, -0.002F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 132, 95, -1.5F, -2.225F, -1.9F, 3, 1, 1, -0.002F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 178, -1.5F, -2.825F, -2.9F, 3, 2, 1, -0.002F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 3.4F, 23.5F);
		PT2Stock.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.9599F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 172, 89, -1.5F, -6.425F, -1.9F, 3, 3, 1, -0.002F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, -7.6F, 15.7F);
		PT2Stock.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.7854F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 0, -1.375F, -1.05F, -9.0F, 1, 1, 18, 0.0F, false));
		cube_r11.cubeList.add(new ModelBox(cube_r11, 102, 29, -1.775F, -1.05F, -9.0F, 1, 1, 18, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(2.8F, -7.6F, 15.7F);
		PT2Stock.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 0.7854F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 101, 101, -1.225F, 0.925F, -9.0F, 1, 1, 18, 0.0F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 30, 99, -1.625F, 0.925F, -9.0F, 1, 1, 18, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(0.0F, -0.6F, 26.1F);
		PT2Stock.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.7854F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 112, 45, -1.5F, 5.6F, -3.0F, 3, 1, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 92, 98, -1.5F, 1.6F, 0.9F, 3, 1, 1, -0.002F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 111, 124, -1.5F, 3.9F, -4.8F, 3, 1, 1, 0.0F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 132, 16, -1.5F, -0.1F, -0.8F, 3, 1, 1, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.0F, 11.5F, 16.0F);
		PT2Stock.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.5672F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 72, 37, -1.5F, 1.9F, -6.0F, 3, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, 4.0F, 6.5F);
		PT2Stock.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.6545F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 131, 64, -1.5F, 0.5F, -3.5F, 3, 2, 1, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 4.0F, 6.5F);
		PT2Stock.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.3491F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 99, -1.5F, 9.5F, 0.2F, 3, 1, 4, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 59, 19, -1.0F, 10.4F, -1.3F, 2, 1, 2, 0.0F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 54, 30, -1.5F, 1.5F, -2.8F, 3, 9, 4, -0.002F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 2.0F, 11.0F);
		PT2Stock.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, -0.7854F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 59, 64, -1.0F, -0.5F, -1.0F, 2, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		PT2Stock.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}