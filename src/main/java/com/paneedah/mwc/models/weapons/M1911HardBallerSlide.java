package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911HardBallerSlide extends ModelWithAttachments {
	private final ModelRenderer HardballerSlide;
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

	public M1911HardBallerSlide() {
		textureWidth = 280;
		textureHeight = 280;

		HardballerSlide = new ModelRenderer(this);
		HardballerSlide.setRotationPoint(-2.2416F, -13.5686F, -10.7976F);
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 46, 0, -1.7584F, -1.5314F, 10.8976F, 1, 4, 2, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 55, -0.8584F, -1.9314F, 10.4976F, 2, 4, 2, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 72, -0.8584F, 1.3686F, 10.4976F, 2, 1, 2, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 90, 0.9416F, -0.1314F, -32.2024F, 1, 1, 17, -0.001F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 26, 0, -1.7584F, -0.1314F, -32.2024F, 1, 1, 0, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 122, 25, -1.7584F, -1.5314F, -32.9024F, 1, 2, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 140, 123, 0.9416F, -1.5314F, -32.9024F, 1, 2, 1, -0.002F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 16, 0, 0.9416F, -0.1314F, -32.2024F, 1, 1, 0, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 46, 0, 0.9416F, -1.5314F, -32.2024F, 1, 2, 36, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 4, 156, 0.9416F, 1.3436F, 12.6976F, 1, 1, 1, -0.002F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 156, 0.9416F, 1.4686F, 12.6976F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 114, 100, 0.9416F, -1.5314F, 10.4976F, 1, 4, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 67, 0.9416F, -0.5314F, -15.2024F, 1, 3, 19, -0.001F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 37, 10, 0.9416F, -1.5314F, 10.8976F, 1, 4, 2, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 155, 119, -1.7584F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 155, 117, -1.7584F, 1.3436F, 12.6976F, 1, 1, 1, -0.002F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 155, 115, -1.3834F, 1.4686F, 12.6976F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 155, 113, -1.3834F, 1.3436F, 12.6976F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 30, 155, 0.5916F, 1.4686F, 12.6976F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 26, 155, 0.5916F, 1.3436F, 12.6976F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 64, 112, -1.7584F, -1.5314F, 10.4976F, 1, 4, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 45, -1.7584F, -0.5314F, -15.2024F, 1, 3, 19, -0.002F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 46, 45, -1.5584F, -1.5314F, 3.7976F, 1, 4, 7, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 46, 0, 0.7416F, -1.5314F, 3.7976F, 1, 4, 7, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 84, 66, -1.7584F, -0.9314F, -6.2024F, 1, 1, 7, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 38, 90, -1.7584F, -1.5314F, 0.7976F, 1, 1, 3, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 153, 154, -1.7584F, -1.5314F, 0.0976F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 168, 74, -1.7584F, -1.5314F, -32.2024F, 1, 2, 26, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 140, 154, -1.7584F, -1.5314F, -6.4024F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 84, 57, -1.7584F, -0.1314F, -32.2024F, 1, 1, 17, -0.001F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 128, 154, 0.9416F, -0.1314F, -32.9024F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 118, 154, -1.7584F, -0.1314F, -32.9024F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 38, 112, -0.9084F, -2.6547F, 0.8318F, 2, 2, 11, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 160, 0, -0.9084F, -2.6547F, -32.4682F, 2, 1, 27, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 48, 103, -0.9084F, -2.6547F, -32.8932F, 2, 2, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 4, 154, -0.4084F, 2.3453F, -33.1932F, 1, 1, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 0, 20, -1.4084F, 0.3453F, -32.1932F, 3, 3, 18, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 9, 90, -1.4084F, 0.0453F, -32.8932F, 3, 3, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 48, 99, -0.9084F, 1.2453F, -32.8932F, 2, 3, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 10, 81, -1.4084F, 0.3453F, -32.8932F, 3, 3, 1, 0.0F, false));
		HardballerSlide.cubeList.add(new ModelBox(HardballerSlide, 114, 150, -0.9084F, 1.2453F, -32.1932F, 2, 3, 18, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(4.3916F, 0.2453F, 0.0318F);
		HardballerSlide.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 224, 136, -2.975F, 1.575F, -32.225F, 1, 1, 18, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 136, 154, -2.975F, 1.575F, -32.925F, 1, 1, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 8, 156, -2.975F, 1.575F, -32.225F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		HardballerSlide.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.9774F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 147, 229, -2.775F, 2.025F, -32.225F, 1, 1, 18, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 154, -2.775F, 2.025F, -32.925F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0916F, 0.2453F, -0.6682F);
		HardballerSlide.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.4887F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 153, 152, -2.775F, 2.05F, -32.225F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 167, 230, -2.775F, 2.05F, -31.525F, 1, 1, 18, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		HardballerSlide.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4363F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 232, 155, -1.925F, -0.225F, -32.225F, 1, 1, 18, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 124, 154, -1.925F, -0.225F, -32.925F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 12, 156, -1.925F, -0.225F, -32.225F, 1, 1, 1, -0.001F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0916F, -1.6547F, 11.3318F);
		HardballerSlide.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.7156F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 75, 94, -1.0F, 0.125F, 0.1F, 2, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.0916F, -1.5766F, 12.1947F);
		HardballerSlide.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.7156F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 8, 154, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 154, 52, -2.5F, -0.4847F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0916F, 0.2453F, 0.0318F);
		HardballerSlide.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.925F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.725F, -2.5517F, -32.2F, 1, 1, 44, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 45, -1.325F, -2.55F, -32.2F, 1, 1, 44, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 154, -1.325F, -2.55F, -32.925F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 16, 154, -1.725F, -2.55F, -32.925F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0916F, -1.908F, 0.0318F);
		HardballerSlide.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.925F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 68, 103, 0.325F, 1.55F, -32.225F, 1, 1, 10, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 154, 54, 0.725F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0916F, -1.908F, 0.0318F);
		HardballerSlide.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.925F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 154, 56, -1.325F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r9.cubeList.add(new ModelBox(cube_r9, 154, 65, -1.725F, 1.55F, -23.225F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0916F, 0.2453F, -9.6682F);
		HardballerSlide.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.925F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 154, 108, 0.325F, -2.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 114, 154, 0.725F, -2.55F, -23.225F, 1, 1, 1, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 164, 0.325F, -2.55F, -22.8F, 1, 1, 27, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 166, 111, 0.725F, -2.55F, -22.8F, 1, 1, 27, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 76, 156, 0.325F, -2.55F, 10.5F, 1, 1, 11, 0.0F, false));
		cube_r10.cubeList.add(new ModelBox(cube_r10, 160, 0, 0.725F, -2.55F, 10.5F, 1, 1, 11, 0.0F, false));

		slide_r1 = new ModelRenderer(this);
		slide_r1.setRotationPoint(-1.2584F, 0.3686F, -19.2024F);
		HardballerSlide.addChild(slide_r1);
		setRotationAngle(slide_r1, -0.4363F, 0.0F, 0.0F);
		slide_r1.cubeList.add(new ModelBox(slide_r1, 10, 55, -0.5F, -2.2F, 1.6F, 1, 2, 3, -0.002F, false));
		slide_r1.cubeList.add(new ModelBox(slide_r1, 55, 11, 2.2F, -2.2F, 1.6F, 1, 2, 3, -0.002F, false));

		slide_r2 = new ModelRenderer(this);
		slide_r2.setRotationPoint(1.2416F, 0.4686F, 10.2976F);
		HardballerSlide.addChild(slide_r2);
		setRotationAngle(slide_r2, 0.0F, 0.7854F, 0.0F);
		slide_r2.cubeList.add(new ModelBox(slide_r2, 13, 11, 3.7F, -2.0F, -4.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 46, 11, 3.2F, -2.0F, -4.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 46, 38, 2.7F, -2.0F, -3.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 46, 56, 2.2F, -2.0F, -3.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 64, 74, 1.7F, -2.0F, -2.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 31, 79, 1.2F, -2.0F, -2.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 70, 82, 0.7F, -2.0F, -1.7F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 77, 82, 0.2F, -2.0F, -1.2F, 1, 4, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 84, 29, -0.3F, -2.0F, -0.7F, 1, 4, 1, 0.0F, false));

		slide_r3 = new ModelRenderer(this);
		slide_r3.setRotationPoint(-1.0584F, 0.4686F, 10.2976F);
		HardballerSlide.addChild(slide_r3);
		setRotationAngle(slide_r3, 0.0F, -0.7854F, 0.0F);
		slide_r3.cubeList.add(new ModelBox(slide_r3, 84, 49, -4.7F, -2.0F, -4.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 59, 103, -4.2F, -2.0F, -4.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 80, 103, -3.7F, -2.0F, -3.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 110, 100, -3.2F, -2.0F, -3.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 112, 2, -2.7F, -2.0F, -2.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 112, 8, -2.2F, -2.0F, -2.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 112, 19, -1.7F, -2.0F, -1.7F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 53, 112, -1.2F, -2.0F, -1.2F, 1, 4, 1, 0.0F, false));
		slide_r3.cubeList.add(new ModelBox(slide_r3, 60, 112, -0.7F, -2.0F, -0.7F, 1, 4, 1, 0.0F, false));

		slide_r4 = new ModelRenderer(this);
		slide_r4.setRotationPoint(-1.2584F, 0.4686F, 11.3976F);
		HardballerSlide.addChild(slide_r4);
		setRotationAngle(slide_r4, 0.2618F, 0.0F, 0.0F);
		slide_r4.cubeList.add(new ModelBox(slide_r4, 21, 79, 1.85F, -1.55F, -0.025F, 1, 3, 2, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 22, 155, -0.15F, -0.55F, 1.0F, 1, 1, 1, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 38, 79, -0.125F, -1.55F, -0.025F, 1, 3, 2, 0.0F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 46, 82, -0.5F, -1.55F, -0.025F, 1, 3, 2, -0.002F, false));
		slide_r4.cubeList.add(new ModelBox(slide_r4, 84, 0, 2.2F, -1.55F, -0.025F, 1, 3, 2, -0.002F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		HardballerSlide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}