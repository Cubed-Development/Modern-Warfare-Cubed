package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911Slide extends ModelWithAttachments {
	private final ModelRenderer slide;
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
	private final ModelRenderer slide_r1;
	private final ModelRenderer slide_r2;
	private final ModelRenderer slide_r3;
	private final ModelRenderer slide_r4;

	public M1911Slide() {
		textureWidth = 280;
		textureHeight = 280;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(-2.2416F, -13.5686F, -10.7976F);
		slide.cubeList.add(new ModelBox(slide, 21, 57, -1.7594F, -1.5314F, 10.8976F, 1, 4, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 55, 0, -0.8584F, -1.9314F, 10.4976F, 2, 4, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 4, -0.8584F, 1.3686F, 10.4976F, 2, 1, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 146, 123, 0.9396F, -0.1314F, -23.2024F, 1, 1, 8, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 160, 37, 0.9416F, -1.5314F, -23.2024F, 1, 2, 27, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 157, 92, 0.9416F, 1.3436F, 12.6976F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 157, 94, 0.9416F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 146, 65, 0.9416F, -1.5314F, 10.4976F, 1, 4, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 38, 90, 0.9396F, -0.5314F, -15.2024F, 1, 3, 19, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 46, 45, 0.9419F, -1.5314F, 10.8976F, 1, 4, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 158, -1.7584F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 156, 157, -1.7584F, 1.3436F, 12.6976F, 1, 1, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 30, 157, -1.3834F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 157, 75, -1.3834F, 1.3436F, 12.6976F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 22, 157, 0.5916F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 26, 157, 0.5916F, 1.3436F, 12.6976F, 1, 1, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 146, 132, -1.7584F, -1.5314F, 10.4976F, 1, 4, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 76, 119, -1.7564F, -0.5314F, -15.2024F, 1, 3, 19, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 65, 0, -1.5584F, -1.5314F, 3.7976F, 1, 4, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 46, 64, 0.7416F, -1.5314F, 3.7976F, 1, 4, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 99, -1.7584F, -0.9314F, -6.2024F, 1, 1, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 57, -1.7584F, -1.5314F, 0.7976F, 1, 1, 3, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 157, 145, -1.7584F, -1.5314F, 0.0976F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 46, 45, -1.7584F, -1.5314F, -23.2024F, 1, 2, 17, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 108, 157, -1.7584F, -1.5314F, -6.4024F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 146, 132, -1.7564F, -0.1314F, -23.2024F, 1, 1, 8, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 130, 76, -0.9084F, -2.6547F, 0.8318F, 2, 2, 11, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 149, 183, -0.9084F, -2.6547F, -22.4682F, 2, 1, 17, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 143, 118, -0.9084F, -2.6547F, -23.1932F, 2, 2, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 156, 141, -0.4084F, 2.3453F, -23.1932F, 1, 1, 1, 0.15F, false));
		slide.cubeList.add(new ModelBox(slide, 160, 12, -1.4084F, 0.3453F, -23.1932F, 3, 3, 9, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 0, -1.4084F, 0.0453F, -23.1932F, 3, 3, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 21, 67, -0.9084F, 1.2453F, -23.1932F, 2, 3, 9, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.3916F, 0.2453F, 0.0318F);
		slide.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 171, -2.975F, 1.575F, -23.225F, 1, 1, 9, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		slide.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.9774F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 76, 168, -2.775F, 2.025F, -23.225F, 1, 1, 9, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		slide.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4887F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 168, 158, -2.775F, 2.05F, -23.225F, 1, 1, 9, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		slide.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 134, 171, -1.925F, -0.225F, -23.225F, 1, 1, 9, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0916F, -1.6547F, 11.3318F);
		slide.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7156F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 114, 52, -1.0F, -0.425F, 0.1F, 2, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0916F, -1.5766F, 12.1947F);
		slide.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7156F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 157, 81, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 157, 90, -2.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		slide.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.925F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 132, 148, -1.725F, -2.55F, -22.2F, 1, 1, 34, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 130, 113, -1.325F, -2.55F, -22.2F, 1, 1, 34, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 157, 79, -1.325F, -2.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 157, 77, -1.725F, -2.55F, -23.225F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0916F, -1.908F, 0.0318F);
		slide.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.925F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 156, 155, 0.325F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 156, 153, 0.725F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0916F, -1.908F, 0.0318F);
		slide.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.925F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 153, 156, -1.325F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 156, 151, -1.725F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		slide.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.925F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 157, 88, 0.325F, -2.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 83, 157, 0.725F, -2.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 108, 0.325F, -2.5367F, -22.5F, 1, 1, 17, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 92, 82, 0.725F, -2.55F, -22.5F, 1, 1, 17, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 160, 37, 0.325F, -2.5367F, 0.8F, 1, 1, 11, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 160, 49, 0.725F, -2.55F, 0.8F, 1, 1, 11, 0.0F, false));

		slide_r1 = new ModelRenderer(this);
		slide_r1.setRotationPoint(-1.2584F, 0.3686F, -19.2024F);
		slide.addChild(slide_r1);
		setRotationAngle(slide_r1, -0.4363F, 0.0F, 0.0F);
		slide_r1.cubeList.add(new ModelBox(slide_r1, 64, 64, -0.5F, -2.2F, 1.6F, 1, 2, 3, -0.001F, false));
		slide_r1.cubeList.add(new ModelBox(slide_r1, 61, 21, 2.199F, -2.2F, 1.6F, 1, 2, 3, -0.002F, false));

		slide_r2 = new ModelRenderer(this);
		slide_r2.setRotationPoint(1.2416F, 0.4686F, 10.2976F);
		slide.addChild(slide_r2);
		setRotationAngle(slide_r2, 0.0F, 0.7854F, 0.0F);
		slide_r2.cubeList.add(new ModelBox(slide_r2, 135, 39, 3.7F, -2.0F, -4.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 132, 65, 3.2F, -2.0F, -4.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 112, 130, 2.7F, -2.0F, -3.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 108, 130, 2.2F, -2.0F, -3.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 130, 102, 1.7F, -2.0F, -2.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 97, 130, 1.2F, -2.0F, -2.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 124, 129, 0.7F, -2.0F, -1.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 116, 19, 0.2F, -2.0F, -1.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 116, 2, -0.3F, -2.0F, -0.7F, 1, 4, 1, 0.0F, false));

		slide_r3 = new ModelRenderer(this);
		slide_r3.setRotationPoint(-1.0584F, 0.4686F, 10.2976F);
		slide.addChild(slide_r3);
		setRotationAngle(slide_r3, 0.0F, -0.7854F, 0.0F);
		slide_r3.cubeList.add(new ModelBox(slide_r3, 136, 0, -4.7F, -2.0F, -4.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 96, 141, -4.2F, -2.0F, -4.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 89, 141, -3.7F, -2.0F, -3.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 139, 65, -3.2F, -2.0F, -3.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 138, 25, -2.7F, -2.0F, -2.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 143, 113, -2.2F, -2.0F, -2.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 142, 21, -1.7F, -2.0F, -1.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 145, 76, -1.2F, -2.0F, -1.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 145, 89, -0.7F, -2.0F, -0.7F, 1, 4, 1, 0.0F, false));

		slide_r4 = new ModelRenderer(this);
		slide_r4.setRotationPoint(-1.2584F, 0.4686F, 11.3976F);
		slide.addChild(slide_r4);
		setRotationAngle(slide_r4, 0.2618F, 0.0F, 0.0F);
		slide_r4.cubeList.add(new ModelBox(slide_r4, 84, 10, 1.85F, -1.55F, -0.024F, 1, 3, 2, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 156, 143, -0.15F, -0.55F, 1.0F, 1, 1, 1, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 84, 19, -0.125F, -1.55F, -0.024F, 1, 3, 2, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 84, 66, -0.5F, -1.55F, -0.025F, 1, 3, 2, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 84, 57, 2.2F, -1.55F, -0.025F, 1, 3, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}