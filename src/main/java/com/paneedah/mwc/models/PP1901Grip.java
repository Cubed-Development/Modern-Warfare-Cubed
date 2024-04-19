package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PP1901Grip extends ModelWithAttachments {
	private final ModelRenderer RearGrip;
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

	public PP1901Grip() {
		textureWidth = 256;
		textureHeight = 256;

		RearGrip = new ModelRenderer(this);
		RearGrip.setRotationPoint(-2.5F, 1.397F, -1.1043F);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		RearGrip.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3447F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 86, 129, -0.5469F, -6.4688F, -2.9844F, 3, 11, 5, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 106, 129, 0.0469F, -6.4688F, -2.9844F, 3, 11, 5, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.2031F, -6.2712F, -6.2956F);
		RearGrip.addChild(cube_r2);
		setRotationAngle(cube_r2, -1.5708F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.5F, -5.4531F, -3.8711F, 3, 6, 4, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(1.7031F, 3.4675F, 3.7607F);
		RearGrip.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 94, -2.0F, -0.5F, -1.0234F, 3, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.7031F, 4.2335F, 1.7409F);
		RearGrip.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.2793F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 158, 0, -2.0F, -0.2461F, -4.5F, 3, 1, 6, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.7031F, 3.0826F, 3.79F);
		RearGrip.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.1257F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 99, 57, -2.0F, -0.5F, -0.5F, 3, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.7031F, 3.1938F, 3.731F);
		RearGrip.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.213F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 99, 91, -2.0F, -0.5F, -1.0234F, 3, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.2031F, -8.5361F, 0.5071F);
		RearGrip.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.4363F, 0.0F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 64, 99, -1.5078F, -0.3594F, -1.2617F, 3, 3, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.2031F, -4.7455F, -1.8425F);
		RearGrip.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.1396F, 0.0F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 158, 7, -1.4922F, -2.5F, -2.5234F, 3, 4, 5, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, 0.0F, 0.0F);
		RearGrip.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.4494F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 155, -3.2969F, -4.5F, -2.2227F, 3, 9, 5, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.2031F, -5.1445F, -3.814F);
		RearGrip.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.5585F, 0.0F, 0.0F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 99, 42, -1.5039F, -0.4531F, -2.8711F, 3, 1, 2, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(1.7031F, 3.2998F, 3.3397F);
		RearGrip.addChild(cube_r11);
		setRotationAngle(cube_r11, 1.1257F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 99, 62, -2.0F, -4.0F, -3.5F, 3, 1, 2, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(1.7031F, 4.5925F, -1.2089F);
		RearGrip.addChild(cube_r12);
		setRotationAngle(cube_r12, 0.7418F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 17, 85, -2.0F, -0.5F, -1.5F, 3, 1, 3, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(2.5F, 0.4627F, -0.8387F);
		RearGrip.addChild(cube_r13);
		setRotationAngle(cube_r13, 0.3403F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 32, -2.7969F, -4.5F, -2.7227F, 3, 9, 2, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.7031F, -4.7455F, -2.3425F);
		RearGrip.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.1396F, 0.0F, 0.0F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 32, 120, -1.0F, -1.5F, -2.8008F, 3, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RearGrip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
