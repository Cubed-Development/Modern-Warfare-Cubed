package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RK9Grip extends ModelWithAttachments {
	private final ModelRenderer RearGripRK_9;
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
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;

	public RK9Grip() {
		textureWidth = 256;
		textureHeight = 256;

		RearGripRK_9 = new ModelRenderer(this);
		RearGripRK_9.setRotationPoint(-1.75F, 3.5888F, -2.6425F);
		RearGripRK_9.cubeList.add(new ModelBox(RearGripRK_9, 157, 78, -1.0F, -10.5888F, -5.3575F, 3, 3, 6, 0.0F, false));
		RearGripRK_9.cubeList.add(new ModelBox(RearGripRK_9, 35, 8, -1.5F, -8.4688F, -2.563F, 4, 3, 3, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		RearGripRK_9.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 53, 117, -1.0F, -1.5F, 2.5F, 3, 3, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 0.5762F, -0.3242F);
		RearGripRK_9.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 90, 157, -2.0F, -1.5F, -2.5F, 4, 3, 5, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 2.3611F, 3.2625F);
		RearGripRK_9.addChild(cube_r3);
		setRotationAngle(cube_r3, -1.1825F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 117, -1.0F, -0.9375F, -0.6133F, 3, 3, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, 2.8611F, 3.2625F);
		RearGripRK_9.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.1825F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 99, 32, -2.0F, -1.9375F, -1.6133F, 4, 4, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -1.2198F, 3.3021F);
		RearGripRK_9.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.2348F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 129, 75, -1.7633F, 0.6836F, -6.6953F, 4, 4, 9, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 130, 0, -1.2367F, 0.9336F, -6.6953F, 4, 3, 9, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 157, 67, -1.5F, -0.5F, -2.0F, 4, 4, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.5F, -3.0381F, 2.6733F);
		RearGripRK_9.addChild(cube_r6);
		setRotationAngle(cube_r6, -1.0821F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 66, 80, -3.0F, -0.5F, -2.0F, 4, 3, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.5F, -5.5711F, 1.1926F);
		RearGripRK_9.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.9599F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 24, -3.0F, -0.5F, -2.0F, 4, 2, 3, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.8712F, -8.1546F, -2.5742F);
		RearGripRK_9.addChild(cube_r8);
		setRotationAngle(cube_r8, -0.3378F, -0.0805F, 2.3008F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 130, 160, -0.5F, 0.0352F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.8712F, -8.1546F, -2.5742F);
		RearGripRK_9.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0462F, -0.0805F, 2.3008F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 126, 160, -0.5F, 0.0352F, -0.5469F, 1, 1, 1, -0.4F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.7382F, -8.3031F, -2.5903F);
		RearGripRK_9.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0462F, -0.0805F, 2.3008F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 122, 160, -0.5F, 0.0352F, -0.5469F, 1, 1, 1, -0.4F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.7382F, -8.3031F, -2.5903F);
		RearGripRK_9.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3378F, -0.0805F, 2.3008F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 160, 63, -0.5F, 0.0352F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-0.6053F, -8.4517F, -2.6064F);
		RearGripRK_9.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0462F, -0.0805F, 2.3008F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 44, 160, -0.5F, 0.0352F, -0.5469F, 1, 1, 1, -0.4F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-0.6053F, -8.4517F, -2.6064F);
		RearGripRK_9.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3378F, -0.0805F, 2.3008F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 159, 113, -0.5F, 0.0352F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-0.7929F, -8.066F, -3.4783F);
		RearGripRK_9.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.3016F, -0.2888F, 0.7412F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 121, 90, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-0.7929F, -8.4688F, -0.563F);
		RearGripRK_9.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, 0.7854F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 114, 73, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(1.7929F, -8.4688F, -0.563F);
		RearGripRK_9.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, -0.7854F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 115, -0.5F, -0.5F, -2.0F, 1, 1, 3, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(2.0F, -9.9383F, 0.2979F);
		RearGripRK_9.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.576F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 99, 37, -3.0F, -1.8516F, -0.832F, 3, 3, 2, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.5F, -2.0993F, -2.2071F);
		RearGripRK_9.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.0167F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 83, 77, -2.0F, -2.207F, 1.0078F, 4, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 89, -2.0F, -0.0938F, -0.957F, 4, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(1.5F, -4.3666F, -1.3043F);
		RearGripRK_9.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.2313F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 15, -3.0F, -0.5F, -1.5F, 4, 6, 3, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(1.7382F, -8.3031F, -2.5903F);
		RearGripRK_9.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3378F, 0.0805F, -2.3008F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 142, 160, -0.5F, 0.0352F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(1.7382F, -8.3031F, -2.5903F);
		RearGripRK_9.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.0462F, 0.0805F, -2.3008F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 160, 135, -0.5F, 0.0352F, -0.5469F, 1, 1, 1, -0.4F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(1.8712F, -8.1546F, -2.5742F);
		RearGripRK_9.addChild(cube_r22);
		setRotationAngle(cube_r22, -0.3378F, 0.0805F, -2.3008F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 160, 144, -0.5F, 0.0352F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(1.8712F, -8.1546F, -2.5742F);
		RearGripRK_9.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.0462F, 0.0805F, -2.3008F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 160, 142, -0.5F, 0.0352F, -0.5469F, 1, 1, 1, -0.4F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(1.6053F, -8.4517F, -2.6064F);
		RearGripRK_9.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.0462F, 0.0805F, -2.3008F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 146, 160, -0.5F, 0.0352F, -0.5469F, 1, 1, 1, -0.4F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(1.6053F, -8.4517F, -2.6064F);
		RearGripRK_9.addChild(cube_r25);
		setRotationAngle(cube_r25, -0.3378F, 0.0805F, -2.3008F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 108, 161, -0.5F, 0.0352F, -0.5F, 1, 1, 1, -0.4F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(1.7929F, -8.066F, -3.4783F);
		RearGripRK_9.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.3016F, 0.2888F, -0.7412F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 70, 123, -0.5F, -0.5F, -1.0F, 1, 1, 2, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(1.5F, -6.9111F, -2.9702F);
		RearGripRK_9.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.4145F, 0.0F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 16, 0, -3.0F, -1.2617F, -1.0F, 4, 9, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RearGripRK_9.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}