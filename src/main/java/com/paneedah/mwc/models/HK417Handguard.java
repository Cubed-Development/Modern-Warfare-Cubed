package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK417Handguard extends ModelWithAttachments {
	private final ModelRenderer handguard;
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

	public HK417Handguard() {
		textureWidth = 220;
		textureHeight = 220;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, -15.1F, -19.5F);
		handguard.cubeList.add(new ModelBox(handguard, 35, 89, -2.5F, -1.0F, -36.0F, 2, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 88, -2.5F, 3.8F, -36.001F, 2, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 120, -1.4F, 3.45F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 45, -0.4F, 2.4F, -16.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 75, 18, -3.6F, 2.4F, -16.0F, 1, 2, 5, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 103, 78, -1.401F, 3.15F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 103, 110, -2.6F, 3.45F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 70, 90, -2.601F, 3.15F, -36.0F, 1, 1, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 54, 0, 0.0F, 1.15F, -8.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 136, 64, 0.2F, 0.95F, -36.3F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 64, 122, -4.1F, 0.95F, -36.3F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 123, 33, 0.201F, 1.35F, -36.301F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 123, 0, -4.099F, 1.35F, -36.301F, 1, 2, 29, -0.3F, false));
		handguard.cubeList.add(new ModelBox(handguard, 9, 44, -3.9F, 1.15F, -8.0F, 1, 2, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 45, -1.3F, -0.7F, -36.0F, 1, 2, 31, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 90, 0, -2.7F, -0.7F, -36.0F, 1, 2, 31, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.0F, 3.15F, -8.0F);
		handguard.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, -0.5061F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 75, 77, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(1.0F, 1.15F, -8.0F);
		handguard.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, 0.5061F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 52, 83, -2.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.9F, 3.15F, -8.0F);
		handguard.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.5061F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 6, 0.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-3.9F, 1.15F, -8.0F);
		handguard.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, -0.5061F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 90, 21, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.9F, 3.05F, -23.25F);
		handguard.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.0F, 0.0F, 1.0647F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 45, 45, -0.9F, -0.1F, -0.1F, 1, 2, 16, -0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 58, 97, -0.899F, -0.1F, -6.45F, 1, 1, 3, -0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 36, -0.9F, -0.1F, -3.85F, 1, 2, 2, -0.1F, false));
		cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 18, -0.9F, -0.1F, -12.85F, 1, 2, 7, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-3.8F, 3.05F, -23.25F);
		handguard.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.0F, 0.0F, -1.0647F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 45, 18, -0.1F, -0.1F, -0.1F, 1, 2, 16, -0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 27, -0.1F, -0.1F, -3.85F, 1, 2, 2, -0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 50, 97, -0.101F, -0.1F, -6.35F, 1, 1, 3, -0.1F, false));
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 0, -0.1F, -0.1F, -12.85F, 1, 2, 7, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.8F, 1.25F, -36.0F);
		handguard.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 1.0647F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 53, -0.1F, -1.9F, -0.1F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 18, -0.1F, -1.9F, 17.9F, 1, 2, 11, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 38, -0.1F, -1.9F, 13.4F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 18, -0.1F, -1.9F, 8.9F, 1, 2, 2, -0.1F, false));
		cube_r14.cubeList.add(new ModelBox(cube_r14, 45, 45, -0.1F, -1.9F, 4.4F, 1, 2, 2, -0.1F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.9F, 1.25F, -18.0F);
		handguard.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.0F, 0.0F, -1.0647F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 0, -0.9F, -1.9F, -0.1F, 1, 2, 11, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 36, 34, -0.9F, -1.9F, -4.6F, 1, 2, 2, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 10, -0.9F, -1.9F, -9.1F, 1, 2, 2, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 26, -0.9F, -1.9F, -13.6F, 1, 2, 2, -0.1F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 18, -0.699F, -1.75F, -16.5F, 1, 1, 17, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 45, 0, -0.699F, -0.7F, -16.5F, 1, 1, 17, -0.3F, false));
		cube_r15.cubeList.add(new ModelBox(cube_r15, 11, 54, -0.9F, -1.9F, -18.1F, 1, 2, 2, -0.1F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(-3.8F, 1.25F, -34.4F);
		handguard.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.0F, 0.0F, 1.0647F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, -0.299F, -1.7F, -0.1F, 1, 1, 17, -0.3F, false));
		cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 44, -0.299F, -0.7F, -0.1F, 1, 1, 17, -0.3F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(-2.6F, 4.4F, -11.0F);
		handguard.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.9163F, 0.0F, 0.0F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 56, 36, -0.999F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));
		cube_r17.cubeList.add(new ModelBox(cube_r17, 19, 56, 2.201F, -2.0F, -1.0F, 1, 2, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-2.6F, 4.4F, -16.0F);
		handguard.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.9163F, 0.0F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 45, 57, -0.999F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 57, 57, 2.201F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(-2.9F, 4.1F, -12.0F);
		handguard.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.3142F, 0.0F, 0.0F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 45, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 69, 63, 2.8F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(-2.9F, 4.1F, -16.3F);
		handguard.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.3142F, 0.0F, 0.0F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 9, 64, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));
		cube_r20.cubeList.add(new ModelBox(cube_r20, 39, 74, 2.8F, -1.0F, 0.0F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}