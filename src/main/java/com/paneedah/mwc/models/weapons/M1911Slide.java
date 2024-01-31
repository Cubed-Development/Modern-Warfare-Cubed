package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1911Slide extends ModelWithAttachments {
	private final ModelRenderer slide;
	private final ModelRenderer slide_r4_r1;
	private final ModelRenderer slide_r4_r2;
	private final ModelRenderer slide_r3_r1;
	private final ModelRenderer slide_r2_r1;
	private final ModelRenderer slide_r1_r1;
	private final ModelRenderer slide_r1_r2;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r7_r2;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer slide_r1;
	private final ModelRenderer slide_r2;
	private final ModelRenderer slide_r3;

	public M1911Slide() {
		textureWidth = 160;
		textureHeight = 160;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(-2.9416F, -13.5686F, -10.7976F);
		slide.cubeList.add(new ModelBox(slide, 0, 35, -1.7594F, -1.5314F, 10.8976F, 1, 4, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 19, -0.6567F, -1.9191F, 10.4976F, 3, 4, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 72, 69, -0.6567F, 1.3809F, 10.4976F, 3, 1, 2, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 30, 124, 1.9413F, -0.1191F, -23.2024F, 1, 1, 8, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 36, 0, 1.9433F, -1.5191F, -23.2024F, 1, 2, 27, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 69, 93, 1.9433F, 1.3559F, 12.6976F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 65, 93, 1.9433F, 1.4809F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 20, 83, 1.9433F, -1.5191F, 10.4976F, 1, 4, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 107, 108, 1.9413F, -0.5191F, -15.2024F, 1, 3, 19, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 28, 8, 1.9436F, -1.5191F, 10.8976F, 1, 4, 2, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 24, -1.7584F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 22, -1.7584F, 1.3436F, 12.6976F, 1, 1, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 16, -1.3834F, 1.4686F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 6, -1.1834F, 1.3436F, 12.6976F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 92, 51, 1.3933F, 1.4809F, 12.6976F, 1, 1, 1, -0.002F, false));
		slide.cubeList.add(new ModelBox(slide, 48, 92, 1.3933F, 1.3559F, 12.6976F, 1, 1, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 13, 83, -1.7584F, -1.5314F, 10.4976F, 1, 4, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 0, -1.7564F, -0.5314F, -15.2024F, 1, 3, 19, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 56, 89, -1.5584F, -1.5314F, 3.7976F, 1, 4, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 28, 70, 1.7433F, -1.5191F, 3.7976F, 1, 4, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 17, 0, -1.7584F, -0.9314F, -6.2024F, 1, 1, 7, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 90, 83, -1.7584F, -1.5314F, 0.7976F, 1, 1, 3, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 41, 92, -1.7584F, -1.5314F, 0.0976F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 37, 116, -1.7584F, -1.5314F, -23.2024F, 1, 2, 17, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 41, 90, -1.7584F, -1.5314F, -6.4024F, 1, 1, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 93, 10, -1.7564F, -0.1314F, -23.2024F, 1, 1, 8, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 84, 113, 0.0916F, -2.7364F, -22.4682F, 1, 2, 17, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 18, 19, 0.0916F, -2.7364F, -23.1682F, 1, 2, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 7, 55, 0.0916F, -2.7364F, 0.8318F, 1, 2, 11, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 7, 90, 0.0933F, 1.3576F, -23.1932F, 1, 1, 1, 0.15F, false));
		slide.cubeList.add(new ModelBox(slide, 0, 0, -1.4084F, 0.3453F, -23.1932F, 4, 3, 9, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 72, 62, -1.4084F, 0.0453F, -23.1932F, 4, 3, 1, -0.001F, false));
		slide.cubeList.add(new ModelBox(slide, 92, 39, -0.9084F, 1.2453F, -23.1932F, 3, 3, 9, 0.0F, false));

		slide_r4_r1 = new ModelRenderer(this);
		slide_r4_r1.setRotationPoint(3.0433F, 36.472F, 20.4203F);
		slide.addChild(slide_r4_r1);
		setRotationAngle(slide_r4_r1, 0.2618F, 0.0F, 0.0F);
		slide_r4_r1.cubeList.add(new ModelBox(slide_r4_r1, 47, 35, -1.65F, -38.65F, 0.576F, 1, 3, 2, -0.0015F, false));
		slide_r4_r1.cubeList.add(new ModelBox(slide_r4_r1, 12, 35, -1.1F, -38.65F, 0.575F, 1, 3, 2, 0.0F, false));

		slide_r4_r2 = new ModelRenderer(this);
		slide_r4_r2.setRotationPoint(2.4416F, 36.4597F, 20.4203F);
		slide.addChild(slide_r4_r2);
		setRotationAngle(slide_r4_r2, 0.2618F, 0.0F, 0.0F);
		slide_r4_r2.cubeList.add(new ModelBox(slide_r4_r2, 80, 0, -3.65F, -37.65F, 1.6F, 1, 1, 1, 0.0F, false));
		slide_r4_r2.cubeList.add(new ModelBox(slide_r4_r2, 36, 35, -3.625F, -38.65F, 0.576F, 1, 3, 2, 0.0F, false));
		slide_r4_r2.cubeList.add(new ModelBox(slide_r4_r2, 36, 0, -4.2F, -38.65F, 0.575F, 1, 3, 2, 0.0F, false));

		slide_r3_r1 = new ModelRenderer(this);
		slide_r3_r1.setRotationPoint(0.9215F, 37.5686F, 12.9846F);
		slide.addChild(slide_r3_r1);
		setRotationAngle(slide_r3_r1, 0.0F, -0.7854F, 0.0F);
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 66, 29, -8.0F, -39.1F, -5.2F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 64, 62, -7.5F, -39.1F, -4.7F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 55, 62, -7.0F, -39.1F, -4.2F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 48, 62, -6.5F, -39.1F, -3.7F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 36, 62, -6.0F, -39.1F, -3.2F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 29, 60, -5.5F, -39.1F, -2.7F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 20, 60, -5.0F, -39.1F, -2.2F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 58, 16, -4.5F, -39.1F, -1.7F, 1, 4, 1, 0.0F, false));
		slide_r3_r1.cubeList.add(new ModelBox(slide_r3_r1, 56, 54, -4.0F, -39.1F, -1.2F, 1, 4, 1, 0.0F, false));

		slide_r2_r1 = new ModelRenderer(this);
		slide_r2_r1.setRotationPoint(3.3039F, 37.5809F, 9.944F);
		slide.addChild(slide_r2_r1);
		setRotationAngle(slide_r2_r1, 0.0F, 0.7854F, 0.0F);
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 66, 81, 2.7F, -39.1F, -5.2F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 47, 81, 2.2F, -39.1F, -4.7F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 39, 81, 1.7F, -39.1F, -4.2F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 28, 81, 1.2F, -39.1F, -3.7F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 76, 29, 0.7F, -39.1F, -3.2F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 72, 73, 0.2F, -39.1F, -2.7F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 28, 70, -0.3F, -39.1F, -2.2F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 20, 70, -0.8F, -39.1F, -1.7F, 1, 4, 1, 0.0F, false));
		slide_r2_r1.cubeList.add(new ModelBox(slide_r2_r1, 13, 70, -1.3F, -39.1F, -1.2F, 1, 4, 1, 0.0F, false));

		slide_r1_r1 = new ModelRenderer(this);
		slide_r1_r1.setRotationPoint(2.2416F, 46.7614F, -7.7331F);
		slide.addChild(slide_r1_r1);
		setRotationAngle(slide_r1_r1, -0.4363F, 0.0F, 0.0F);
		slide_r1_r1.cubeList.add(new ModelBox(slide_r1_r1, 37, 70, -4.0F, -39.4F, -28.4F, 1, 2, 3, -0.001F, false));

		slide_r1_r2 = new ModelRenderer(this);
		slide_r1_r2.setRotationPoint(3.2433F, 46.7737F, -7.7331F);
		slide.addChild(slide_r1_r2);
		setRotationAngle(slide_r1_r2, -0.4363F, 0.0F, 0.0F);
		slide_r1_r2.cubeList.add(new ModelBox(slide_r1_r2, 26, 0, -1.301F, -39.4F, -28.4F, 1, 2, 3, -0.002F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(31.1927F, 20.9907F, 10.7976F);
		slide.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, 0.0F, 0.0F, -0.925F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 21, 76, -1.825F, -39.8733F, -33.9908F, 1, 1, 1, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 41, 75, -1.425F, -39.8733F, -33.9908F, 1, 1, 1, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 0, 124, -1.825F, -39.86F, -33.2658F, 1, 1, 17, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 28, 70, -1.425F, -39.8733F, -33.2658F, 1, 1, 17, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 92, 27, -1.825F, -39.86F, -9.9658F, 1, 1, 11, 0.0F, false));
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 0, 83, -1.425F, -39.8733F, -9.9658F, 1, 1, 11, 0.0F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(33.9141F, 20.1456F, 10.7976F);
		slide.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.0F, 0.0F, -0.925F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 63, 85, -3.475F, -37.9266F, -33.9908F, 1, 1, 1, 0.0F, false));
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 80, 29, -3.875F, -37.9266F, -33.9908F, 1, 1, 1, 0.0F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(-30.1413F, 23.5674F, 10.7976F);
		slide.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.0F, 0.0F, 0.925F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 85, 75, -1.825F, -37.9266F, -33.9908F, 1, 1, 1, 0.0F, false));
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 85, 73, -1.425F, -37.9266F, -33.9908F, 1, 1, 1, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(-27.4199F, 24.4371F, 10.7976F);
		slide.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.0F, 0.0F, 0.925F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 0, 35, -3.875F, -39.8733F, -32.9658F, 1, 1, 34, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 0, 0, -3.475F, -39.8733F, -32.9658F, 1, 1, 34, 0.0F, false));

		cube_r7_r2 = new ModelRenderer(this);
		cube_r7_r2.setRotationPoint(-27.4108F, 24.4546F, 10.7884F);
		slide.addChild(cube_r7_r2);
		setRotationAngle(cube_r7_r2, 0.0F, 0.0F, 0.925F);
		cube_r7_r2.cubeList.add(new ModelBox(cube_r7_r2, 37, 75, -3.475F, -39.8733F, -33.9908F, 1, 1, 1, 0.0F, false));
		cube_r7_r2.cubeList.add(new ModelBox(cube_r7_r2, 0, 79, -3.875F, -39.8733F, -33.9908F, 1, 1, 1, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(3.2433F, 28.8952F, 36.8223F);
		slide.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.7156F, 0.0F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 13, 79, -1.85F, -39.6452F, 0.8971F, 1, 1, 1, 0.0F, false));
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 41, 88, -1.65F, -39.6452F, 0.8971F, 1, 1, 1, 0.0F, false));

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setRotationPoint(2.2416F, 28.8829F, 36.8223F);
		slide.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.7156F, 0.0F, 0.0F);
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 17, 79, -3.45F, -39.6452F, 0.8971F, 1, 1, 1, 0.0F, false));
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 66, 86, -3.65F, -39.6452F, 0.8971F, 1, 1, 1, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(2.2416F, 28.2976F, 36.6619F);
		slide.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.7156F, 0.0F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 36, 25, -3.15F, -39.6483F, 0.6342F, 3, 1, 1, 0.0F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(17.8126F, 33.1636F, 10.7976F);
		slide.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.0F, 0.0F, -0.4363F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 13, 19, -4.075F, -37.5483F, -33.9908F, 1, 1, 9, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(19.5124F, 32.1903F, 10.7976F);
		slide.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.0F, 0.0F, -0.4887F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 100, 56, -4.925F, -35.2733F, -33.9908F, 1, 1, 9, 0.0F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(33.2213F, 19.2702F, 10.7976F);
		slide.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, 0.0F, 0.0F, -0.9774F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 100, 66, -4.925F, -35.2983F, -33.9908F, 1, 1, 9, 0.0F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(-12.3277F, 33.1759F, 10.7976F);
		slide.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.0F, 0.0F, 0.4363F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 100, 83, -0.825F, -35.7483F, -33.9908F, 1, 1, 9, 0.0F, false));

		slide_r1 = new ModelRenderer(this);
		slide_r1.setRotationPoint(-0.2084F, -1.6547F, -11.6682F);
		slide.addChild(slide_r1);
		setRotationAngle(slide_r1, 0.0F, 0.0F, -0.0873F);
		slide_r1.cubeList.add(new ModelBox(slide_r1, 24, 19, -0.6F, -1.0567F, -11.5F, 1, 2, 1, 0.0F, false));
		slide_r1.cubeList.add(new ModelBox(slide_r1, 114, 0, -0.6F, -1.0567F, -10.8F, 1, 2, 17, 0.0F, false));
		slide_r1.cubeList.add(new ModelBox(slide_r1, 0, 19, -0.6F, -1.0567F, 12.5F, 1, 2, 11, 0.0F, false));

		slide_r2 = new ModelRenderer(this);
		slide_r2.setRotationPoint(1.5916F, -1.6547F, -11.6682F);
		slide.addChild(slide_r2);
		setRotationAngle(slide_r2, 0.0F, 0.0F, 0.0873F);
		slide_r2.cubeList.add(new ModelBox(slide_r2, 5, 0, -0.6F, -1.0367F, -11.5F, 1, 2, 1, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 65, 110, -0.6F, -1.0367F, -10.8F, 1, 2, 17, 0.0F, false));
		slide_r2.cubeList.add(new ModelBox(slide_r2, 0, 70, -0.6F, -1.0367F, 12.5F, 1, 2, 11, 0.0F, false));

		slide_r3 = new ModelRenderer(this);
		slide_r3.setRotationPoint(0.8433F, -0.4191F, 13.6976F);
		slide.addChild(slide_r3);
		setRotationAngle(slide_r3, 0.0F, 0.0F, 0.7854F);
		slide_r3.cubeList.add(new ModelBox(slide_r3, 4, 79, -0.7017F, -0.4F, -2.0F, 1, 1, 1, -0.15F, false));
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