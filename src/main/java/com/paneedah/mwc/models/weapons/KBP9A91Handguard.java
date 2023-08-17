package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KBP9A91Handguard extends ModelWithAttachments {
	private final ModelRenderer Handguard;
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

	public KBP9A91Handguard() {
		textureWidth = 220;
		textureHeight = 220;

		Handguard = new ModelRenderer(this);
		Handguard.setRotationPoint(0.0F, -13.0F, -49.0F);
		Handguard.cubeList.add(new ModelBox(Handguard, 84, 0, -0.5F, 2.0F, 13.0F, 1, 2, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 53, 120, -0.5F, 1.5F, 12.0F, 1, 1, 2, 0.001F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 173, 100, -0.5F, -1.5F, 1.0F, 1, 4, 10, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 20, 45, -0.5F, -0.5F, 0.0F, 1, 3, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 40, 39, -0.5F, -0.5F, 11.0F, 1, 3, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 117, 53, -1.3F, 3.8F, 13.0F, 1, 1, 2, -0.001F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 108, 72, -2.7F, 3.8F, 13.0F, 2, 1, 2, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 9, 80, -3.5F, 2.0F, 13.0F, 1, 2, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 44, 120, -3.5F, 1.5F, 12.0F, 1, 1, 2, 0.001F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 144, 170, -3.5F, -1.5F, 1.0F, 1, 4, 10, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 20, 39, -3.5F, -0.5F, 0.0F, 1, 3, 1, 0.0F, false));
		Handguard.cubeList.add(new ModelBox(Handguard, 27, 39, -3.5F, -0.5F, 11.0F, 1, 3, 1, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.5F, 4.0F, 13.0F);
		Handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 1.4661F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 109, 113, 0.0F, -13.0F, 0.0F, 1, 13, 2, -0.001F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 28, 116, 3.0F, -13.0F, 0.0F, 1, 13, 2, -0.001F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.5F, -0.5F, 12.0F);
		Handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.7854F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 123, 119, 0.0F, -1.4F, -0.999F, 1, 1, 1, -0.003F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 123, 117, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 52, 3.0F, -1.4F, -0.999F, 1, 1, 1, -0.003F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 124, 41, 3.0F, -1.0F, -1.0F, 1, 1, 1, -0.001F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(-3.5F, -0.5F, 0.0F);
		Handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.7854F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 123, 115, 0.0F, -1.4F, -0.001F, 1, 1, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 123, 113, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 54, 3.0F, -1.4F, -0.001F, 1, 1, 1, -0.003F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 124, 63, 3.0F, -1.0F, 0.0F, 1, 1, 1, -0.001F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.6F, 1.1F, 10.0F);
		Handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.7069F, 0.0F, 0.0F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 123, 111, 0.0F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 38, 110, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 123, 123, 3.2F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 63, 116, 3.2F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-3.6F, 0.5F, 2.6F);
		Handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.7069F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 123, 109, 0.0F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 108, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 124, 31, 3.2F, -1.0F, 2.7F, 1, 1, 1, -0.002F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 117, 38, 3.2F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-3.6F, 0.5F, 2.6F);
		Handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.1047F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 89, -0.1F, -0.3F, 1.0F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 80, -0.1F, 0.5F, 2.1F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 38, 80, 0.0F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 59, 89, 3.3F, 0.5F, 2.1F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 36, 3.3F, -0.3F, 1.0F, 1, 1, 8, -0.1F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 94, 50, 3.2F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-3.6F, 2.9F, 5.4F);
		Handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.1047F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 14, 68, 0.0F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 97, 77, 3.2F, -1.0F, 0.0F, 1, 1, 8, 0.001F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-3.5F, 4.0F, 14.0F);
		Handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, 0.0F, 0.5585F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 74, 80, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-3.5F, 1.5F, 14.0F);
		Handguard.addChild(cube_r21);
		setRotationAngle(cube_r21, 0.1745F, 0.0F, 0.0F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 38, 120, 0.0F, -1.0F, -2.0F, 1, 1, 2, -0.002F, false));
		cube_r21.cubeList.add(new ModelBox(cube_r21, 59, 120, 3.0F, -1.0F, -2.0F, 1, 1, 2, -0.002F, false));

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(-2.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.0F, 0.0F, 0.7854F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 123, 90, -1.2F, -0.9F, 0.1F, 1, 1, 1, 0.05F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(-2.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r23);
		setRotationAngle(cube_r23, 1.4979F, 0.0753F, 0.8001F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 84, 113, -1.2F, -13.0F, -0.1F, 1, 13, 2, 0.05F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-2.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r24);
		setRotationAngle(cube_r24, 1.4661F, 0.0F, 0.0F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 108, 89, -0.2F, -13.0F, 0.0F, 2, 13, 2, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 103, 113, 1.2F, -13.0F, 0.0F, 1, 13, 2, -0.001F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(-0.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0F, 0.0F, -0.7854F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 123, 92, 0.2F, -0.9F, 0.1F, 1, 1, 1, 0.05F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(-0.5F, 4.8F, 13.0F);
		Handguard.addChild(cube_r26);
		setRotationAngle(cube_r26, 1.4979F, -0.0753F, -0.8001F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 97, 113, 0.2F, -13.0F, -0.1F, 1, 13, 2, 0.05F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(0.5F, 4.0F, 14.0F);
		Handguard.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.0F, -0.5585F, 0.0F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 82, 77, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
