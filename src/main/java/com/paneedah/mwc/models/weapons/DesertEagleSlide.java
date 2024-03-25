package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleSlide extends ModelWithAttachments {
	private final ModelRenderer Slide;
	private final ModelRenderer cube_r21_r1_r1;
	private final ModelRenderer FireSelector;
	private final ModelRenderer FireSelector_r1;
	private final ModelRenderer cube_r53;
	private final ModelRenderer cube_r54;
	private final ModelRenderer RearSight;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer Cubes2;
	private final ModelRenderer cube_r57;
	private final ModelRenderer cube_r58;
	private final ModelRenderer cube_r59;
	private final ModelRenderer cube_r60;
	private final ModelRenderer cube_r61;
	private final ModelRenderer cube_r62;
	private final ModelRenderer cube_r63;
	private final ModelRenderer cube_r64;
	private final ModelRenderer cube_r65;
	private final ModelRenderer cube_r66;
	private final ModelRenderer cube_r67;
	private final ModelRenderer cube_r68;
	private final ModelRenderer cube_r69;
	private final ModelRenderer cube_r70;
	private final ModelRenderer cube_r71;
	private final ModelRenderer cube_r72;
	private final ModelRenderer cube_r73;
	private final ModelRenderer cube_r74;
	private final ModelRenderer cube_r75;
	private final ModelRenderer cube_r76;
	private final ModelRenderer cube_r77;
	private final ModelRenderer cube_r78;
	private final ModelRenderer cube_r79;
	private final ModelRenderer cube_r80;
	private final ModelRenderer cube_r81;
	private final ModelRenderer cube_r82;
	private final ModelRenderer cube_r83;
	private final ModelRenderer cube_r84;
	private final ModelRenderer cube_r85;
	private final ModelRenderer cube_r86;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;
	private final ModelRenderer cube_r90;
	private final ModelRenderer deco;
	private final ModelRenderer cube_r91;

	public DesertEagleSlide() {
		textureWidth = 128;
		textureHeight = 128;

		Slide = new ModelRenderer(this);
		Slide.setRotationPoint(-2.0316F, -13.0337F, -1.4061F);
		Slide.cubeList.add(new ModelBox(Slide, 25, 38, -0.3684F, -2.9663F, 3.8061F, 2, 5, 1, 0.0F, false));

		cube_r21_r1_r1 = new ModelRenderer(this);
		cube_r21_r1_r1.setRotationPoint(-13.4601F, 53.6851F, 1.4061F);
		Slide.addChild(cube_r21_r1_r1);
		setRotationAngle(cube_r21_r1_r1, 0.0F, 0.0F, 0.7854F);
		cube_r21_r1_r1.cubeList.add(new ModelBox(cube_r21_r1_r1, 25, 78, -29.7458F, -49.6744F, 2.8F, 1, 1, 1, -0.17F, false));

		FireSelector = new ModelRenderer(this);
		FireSelector.setRotationPoint(0.0F, -1.5F, 3.5F);
		Slide.addChild(FireSelector);
		FireSelector.cubeList.add(new ModelBox(FireSelector, 59, 60, -1.8F, -0.825F, -4.35F, 2, 1, 4, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 20, 73, -2.1F, -0.825F, -4.35F, 2, 1, 1, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 9, 73, 1.4F, -0.825F, -4.35F, 2, 1, 1, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 10, 60, 1.1F, -0.825F, -4.35F, 2, 1, 4, 0.0F, false));

		FireSelector_r1 = new ModelRenderer(this);
		FireSelector_r1.setRotationPoint(2.3F, 0.275F, -0.65F);
		FireSelector.addChild(FireSelector_r1);
		setRotationAngle(FireSelector_r1, -0.7854F, 0.0F, 0.0F);
		FireSelector_r1.cubeList.add(new ModelBox(FireSelector_r1, 34, 62, -1.0F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));
		FireSelector_r1.cubeList.add(new ModelBox(FireSelector_r1, 0, 73, -4.3F, -0.5F, -0.5F, 2, 1, 1, 0.0F, false));

		cube_r53 = new ModelRenderer(this);
		cube_r53.setRotationPoint(0.2F, 0.0F, 0.0F);
		FireSelector.addChild(cube_r53);
		setRotationAngle(cube_r53, 0.8727F, 0.0F, 0.0F);
		cube_r53.cubeList.add(new ModelBox(cube_r53, 50, 38, -2.0F, -0.3F, -1.5F, 2, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 42, 62, 0.9F, -0.8F, -0.6F, 2, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 65, 13, 0.9F, -0.3F, -0.6F, 2, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 42, 67, 0.9F, -0.3F, -1.5F, 2, 1, 1, -0.002F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 37, 73, -2.0F, -0.8F, -0.6F, 2, 1, 1, 0.0F, false));
		cube_r53.cubeList.add(new ModelBox(cube_r53, 73, 45, -2.0F, -0.3F, -0.6F, 2, 1, 1, 0.0F, false));

		cube_r54 = new ModelRenderer(this);
		cube_r54.setRotationPoint(0.2F, 0.0F, 0.0F);
		FireSelector.addChild(cube_r54);
		setRotationAngle(cube_r54, -0.3316F, 0.0F, 0.0F);
		cube_r54.cubeList.add(new ModelBox(cube_r54, 59, 52, -2.0F, 0.675F, -4.05F, 2, 1, 1, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 62, 4, -2.0F, -0.125F, -1.85F, 2, 1, 1, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 10, 43, -2.0F, 0.675F, -3.85F, 2, 1, 4, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 59, 47, 0.9F, 0.675F, -3.85F, 2, 1, 4, -0.002F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 65, 67, 0.9F, -0.125F, -1.85F, 2, 1, 1, 0.0F, false));
		cube_r54.cubeList.add(new ModelBox(cube_r54, 52, 71, 0.9F, 0.675F, -4.05F, 2, 1, 1, 0.0F, false));

		RearSight = new ModelRenderer(this);
		RearSight.setRotationPoint(0.6F, -4.0F, 2.8F);
		Slide.addChild(RearSight);
		RearSight.cubeList.add(new ModelBox(RearSight, 11, 57, -2.0F, -0.3F, -0.3F, 4, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 103, 44, -2.0F, 0.2F, -1.2F, 4, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 89, 2, -2.3867F, 0.15F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 89, 0, 1.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 88, 74, -1.9867F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 88, 70, 1.4F, 0.15F, -0.3F, 1, 1, 1, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(1.7177F, -0.8312F, -0.9735F);
		RearSight.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.6981F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 103, 41, -3.9F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 103, 41, -4.1F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 103, 41, -0.5F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 103, 41, -0.3F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(1.6677F, -0.1821F, 0.2F);
		RearSight.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, -0.3927F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 88, 23, -0.45F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-1.6544F, -0.1821F, 0.2F);
		RearSight.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.3927F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 88, 72, -0.55F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

		Cubes2 = new ModelRenderer(this);
		Cubes2.setRotationPoint(0.2316F, 0.0337F, -3.2939F);
		Slide.addChild(Cubes2);
		Cubes2.cubeList.add(new ModelBox(Cubes2, 69, 86, -2.1F, 2.0F, 6.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 25, 47, -2.1F, 0.7F, -26.6F, 1, 1, 23, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 25, -2.1F, 1.0F, -26.6F, 1, 2, 23, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 86, 61, 1.4F, -0.7F, 7.4F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 86, 58, 1.4F, -2.7F, 6.6F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 0, 1.9F, 1.0F, -26.6F, 1, 2, 23, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 80, 28, 1.9F, -0.6F, -5.1F, 1, 2, 1, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 80, 21, 1.9F, -0.8F, -4.6F, 1, 2, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 25, 23, 1.9F, 0.7F, -26.6F, 1, 1, 23, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 79, 73, -2.1F, -0.6F, -5.1F, 1, 2, 1, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 79, 70, -2.1F, -0.8F, -4.6F, 1, 2, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 74, 53, 1.9F, -2.7F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 81, 8, 1.9F, -3.6F, 1.2F, 1, 1, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 86, 49, -2.1F, 2.0F, -2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 41, 85, -2.1F, 2.0F, -0.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 84, -2.1F, 2.0F, 1.15F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 83, 55, -2.1F, 2.0F, 4.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 83, 48, -2.1F, 2.0F, 2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 34, 38, -2.1F, -3.6F, 1.2F, 1, 1, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 26, 90, -1.1F, -3.6F, -4.8F, 3, 1, 12, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 11, 7, -2.1F, -3.6F, 6.6F, 5, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 74, 45, -2.1F, -2.7F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 53, 0, -1.6F, -2.7F, -4.8F, 1, 6, 7, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 14, 78, 1.925F, 2.0F, 2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 14, 76, 1.925F, 2.0F, 4.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 14, 74, 1.925F, 2.0F, 1.15F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 66, 28, 1.925F, 2.0F, -0.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 65, 19, 1.925F, 2.0F, -2.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 44, 55, 1.925F, 2.0F, 6.85F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 81, 1.225F, -2.7F, 2.0F, 1, 3, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 52, 71, 1.425F, 0.3F, 2.1F, 1, 3, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 47, 1.425F, -2.7F, -4.8F, 1, 6, 7, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 80, 19, -1.4F, -2.7F, 2.0F, 1, 3, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 33, -1.6F, 0.3F, 2.1F, 1, 3, 7, 0.0F, false));

		cube_r57 = new ModelRenderer(this);
		cube_r57.setRotationPoint(-1.1F, -0.9858F, 8.209F);
		Cubes2.addChild(cube_r57);
		setRotationAngle(cube_r57, 0.8727F, 0.0F, 0.0F);
		cube_r57.cubeList.add(new ModelBox(cube_r57, 44, 50, -0.5F, 0.1F, -1.4F, 1, 1, 1, -0.002F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 0, 50, -0.5F, -0.4F, -2.9F, 1, 1, 3, 0.0F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 50, 23, 2.525F, -0.4F, -2.9F, 1, 1, 3, -0.002F, false));
		cube_r57.cubeList.add(new ModelBox(cube_r57, 28, 54, 2.525F, 0.1F, -1.4F, 1, 1, 1, 0.0F, false));

		cube_r58 = new ModelRenderer(this);
		cube_r58.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r58);
		setRotationAngle(cube_r58, 0.3491F, 0.0F, 0.0F);
		cube_r58.cubeList.add(new ModelBox(cube_r58, 50, 47, 1.4F, 0.2F, 0.3F, 1, 1, 2, 0.0F, false));
		cube_r58.cubeList.add(new ModelBox(cube_r58, 50, 47, -1.6F, 0.2F, 0.3F, 1, 1, 2, 0.0F, false));

		cube_r59 = new ModelRenderer(this);
		cube_r59.setRotationPoint(2.425F, 0.8999F, 7.02F);
		Cubes2.addChild(cube_r59);
		setRotationAngle(cube_r59, 0.236F, 0.1507F, -0.5581F);
		cube_r59.cubeList.add(new ModelBox(cube_r59, 4, 56, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r60 = new ModelRenderer(this);
		cube_r60.setRotationPoint(0.825F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r60);
		setRotationAngle(cube_r60, 0.2793F, 0.0F, 0.0F);
		cube_r60.cubeList.add(new ModelBox(cube_r60, 28, 59, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 86, 54, -2.925F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 34, 13, 1.075F, 0.7F, 8.0F, 1, 4, 1, 0.0F, false));
		cube_r60.cubeList.add(new ModelBox(cube_r60, 35, 0, -2.925F, 0.7F, 8.0F, 1, 4, 1, -0.002F, false));

		cube_r61 = new ModelRenderer(this);
		cube_r61.setRotationPoint(0.825F, 0.0F, -9.7F);
		Cubes2.addChild(cube_r61);
		setRotationAngle(cube_r61, 0.2793F, 0.0F, 0.0F);
		cube_r61.cubeList.add(new ModelBox(cube_r61, 4, 60, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 42, 0, 1.1F, 0.8F, 6.0F, 1, 3, 1, -0.001F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 86, 47, -2.925F, 3.1F, 6.0F, 1, 1, 1, -0.002F, false));
		cube_r61.cubeList.add(new ModelBox(cube_r61, 59, 60, -2.925F, 0.8F, 6.0F, 1, 3, 1, 0.0F, false));

		cube_r62 = new ModelRenderer(this);
		cube_r62.setRotationPoint(2.425F, 0.8999F, -2.68F);
		Cubes2.addChild(cube_r62);
		setRotationAngle(cube_r62, 0.2632F, 0.0944F, -0.3366F);
		cube_r62.cubeList.add(new ModelBox(cube_r62, 5, 0, 0.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r63 = new ModelRenderer(this);
		cube_r63.setRotationPoint(0.825F, 0.0F, -7.7F);
		Cubes2.addChild(cube_r63);
		setRotationAngle(cube_r63, 0.2793F, 0.0F, 0.0F);
		cube_r63.cubeList.add(new ModelBox(cube_r63, 65, 23, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 19, 42, 1.1F, 0.8F, 6.0F, 1, 3, 1, -0.001F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 52, 84, -2.925F, 3.1F, 6.0F, 1, 1, 1, -0.002F, false));
		cube_r63.cubeList.add(new ModelBox(cube_r63, 18, 60, -2.925F, 0.8F, 6.0F, 1, 3, 1, 0.0F, false));

		cube_r64 = new ModelRenderer(this);
		cube_r64.setRotationPoint(2.425F, 0.8999F, -0.68F);
		Cubes2.addChild(cube_r64);
		setRotationAngle(cube_r64, 0.2632F, 0.0944F, -0.3366F);
		cube_r64.cubeList.add(new ModelBox(cube_r64, 5, 50, 0.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r65 = new ModelRenderer(this);
		cube_r65.setRotationPoint(0.825F, 0.0F, -5.7F);
		Cubes2.addChild(cube_r65);
		setRotationAngle(cube_r65, 0.2793F, 0.0F, 0.0F);
		cube_r65.cubeList.add(new ModelBox(cube_r65, 67, 5, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 11, 50, 1.1F, 0.8F, 6.0F, 1, 3, 1, -0.001F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 69, 83, -2.925F, 3.1F, 6.0F, 1, 1, 1, -0.002F, false));
		cube_r65.cubeList.add(new ModelBox(cube_r65, 10, 60, -2.925F, 0.8F, 6.0F, 1, 3, 1, 0.0F, false));

		cube_r66 = new ModelRenderer(this);
		cube_r66.setRotationPoint(2.425F, 0.8999F, 1.32F);
		Cubes2.addChild(cube_r66);
		setRotationAngle(cube_r66, 0.2632F, 0.0944F, -0.3366F);
		cube_r66.cubeList.add(new ModelBox(cube_r66, 55, 23, 0.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r67 = new ModelRenderer(this);
		cube_r67.setRotationPoint(2.425F, 0.8999F, 5.02F);
		Cubes2.addChild(cube_r67);
		setRotationAngle(cube_r67, 0.236F, 0.1507F, -0.5581F);
		cube_r67.cubeList.add(new ModelBox(cube_r67, 25, 74, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r68 = new ModelRenderer(this);
		cube_r68.setRotationPoint(0.825F, 0.0F, -2.0F);
		Cubes2.addChild(cube_r68);
		setRotationAngle(cube_r68, 0.2793F, 0.0F, 0.0F);
		cube_r68.cubeList.add(new ModelBox(cube_r68, 42, 74, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r68.cubeList.add(new ModelBox(cube_r68, 83, 53, -2.925F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));

		cube_r69 = new ModelRenderer(this);
		cube_r69.setRotationPoint(2.425F, 0.8999F, 3.02F);
		Cubes2.addChild(cube_r69);
		setRotationAngle(cube_r69, 0.236F, 0.1507F, -0.5581F);
		cube_r69.cubeList.add(new ModelBox(cube_r69, 25, 76, -0.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r70 = new ModelRenderer(this);
		cube_r70.setRotationPoint(0.825F, 0.0F, -4.0F);
		Cubes2.addChild(cube_r70);
		setRotationAngle(cube_r70, 0.2793F, 0.0F, 0.0F);
		cube_r70.cubeList.add(new ModelBox(cube_r70, 42, 76, 1.1F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));
		cube_r70.cubeList.add(new ModelBox(cube_r70, 82, 75, -2.925F, 3.1F, 6.0F, 1, 1, 1, 0.0F, false));

		cube_r71 = new ModelRenderer(this);
		cube_r71.setRotationPoint(3.6F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r71);
		setRotationAngle(cube_r71, 0.0F, 0.0F, -0.8029F);
		cube_r71.cubeList.add(new ModelBox(cube_r71, 25, 13, 0.45F, -3.725F, -4.8F, 1, 1, 7, 0.0F, false));
		cube_r71.cubeList.add(new ModelBox(cube_r71, 25, 38, 0.45F, -3.375F, -4.8F, 1, 1, 7, 0.0F, false));

		cube_r72 = new ModelRenderer(this);
		cube_r72.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r72);
		setRotationAngle(cube_r72, 0.0F, 0.0F, 0.8029F);
		cube_r72.cubeList.add(new ModelBox(cube_r72, 50, 60, -3.4F, -1.7F, -4.8F, 1, 1, 7, 0.0F, false));
		cube_r72.cubeList.add(new ModelBox(cube_r72, 0, 73, -3.4F, -1.35F, -4.8F, 1, 1, 7, 0.0F, false));

		cube_r73 = new ModelRenderer(this);
		cube_r73.setRotationPoint(3.6F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r73);
		setRotationAngle(cube_r73, 0.0F, 0.7854F, 0.0F);
		cube_r73.cubeList.add(new ModelBox(cube_r73, 50, 50, -2.35F, -3.6F, -1.675F, 1, 1, 2, -0.002F, false));

		cube_r74 = new ModelRenderer(this);
		cube_r74.setRotationPoint(0.0F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r74);
		setRotationAngle(cube_r74, 0.0F, -0.7854F, 0.0F);
		cube_r74.cubeList.add(new ModelBox(cube_r74, 53, 0, -0.65F, -3.6F, 0.325F, 1, 1, 2, -0.002F, false));

		cube_r75 = new ModelRenderer(this);
		cube_r75.setRotationPoint(-1.6F, -2.5558F, 7.5411F);
		Cubes2.addChild(cube_r75);
		setRotationAngle(cube_r75, 0.7243F, 0.0F, 0.0F);
		cube_r75.cubeList.add(new ModelBox(cube_r75, 42, 78, -0.5F, 0.5F, -0.55F, 1, 1, 1, 0.0F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 17, 50, 2.6F, -0.2F, -0.25F, 1, 3, 1, 0.0F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 80, 40, 0.4F, -0.7F, -0.25F, 1, 1, 1, 0.0F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 42, 80, 2.6F, -0.7F, -0.25F, 1, 1, 1, 0.0F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 59, 47, 0.4F, -0.2F, -0.25F, 1, 3, 1, -0.002F, false));
		cube_r75.cubeList.add(new ModelBox(cube_r75, 55, 27, -0.5F, -1.0F, -0.55F, 1, 2, 1, 0.0F, false));

		cube_r76 = new ModelRenderer(this);
		cube_r76.setRotationPoint(5.2F, -2.5558F, 7.5411F);
		Cubes2.addChild(cube_r76);
		setRotationAngle(cube_r76, 0.7479F, -0.2272F, -0.206F);
		cube_r76.cubeList.add(new ModelBox(cube_r76, 25, 80, -6.775F, -0.7F, 1.625F, 1, 1, 1, 0.0F, false));

		cube_r77 = new ModelRenderer(this);
		cube_r77.setRotationPoint(-1.6F, -2.5558F, 7.5411F);
		Cubes2.addChild(cube_r77);
		setRotationAngle(cube_r77, 0.7479F, 0.2272F, 0.206F);
		cube_r77.cubeList.add(new ModelBox(cube_r77, 80, 31, 3.1F, -0.7F, 0.75F, 1, 1, 1, 0.0F, false));

		cube_r78 = new ModelRenderer(this);
		cube_r78.setRotationPoint(-1.6F, 0.8999F, 3.02F);
		Cubes2.addChild(cube_r78);
		setRotationAngle(cube_r78, 0.236F, -0.1507F, 0.5581F);
		cube_r78.cubeList.add(new ModelBox(cube_r78, 82, 72, -0.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r79 = new ModelRenderer(this);
		cube_r79.setRotationPoint(-1.6F, 0.8999F, 5.02F);
		Cubes2.addChild(cube_r79);
		setRotationAngle(cube_r79, 0.236F, -0.1507F, 0.5581F);
		cube_r79.cubeList.add(new ModelBox(cube_r79, 83, 50, -0.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r80 = new ModelRenderer(this);
		cube_r80.setRotationPoint(-1.6F, 0.8999F, 7.02F);
		Cubes2.addChild(cube_r80);
		setRotationAngle(cube_r80, 0.236F, -0.1507F, 0.5581F);
		cube_r80.cubeList.add(new ModelBox(cube_r80, 83, 57, -0.3F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r81 = new ModelRenderer(this);
		cube_r81.setRotationPoint(-1.6F, 0.8999F, 1.32F);
		Cubes2.addChild(cube_r81);
		setRotationAngle(cube_r81, 0.2632F, -0.0944F, 0.3366F);
		cube_r81.cubeList.add(new ModelBox(cube_r81, 66, 25, -1.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r82 = new ModelRenderer(this);
		cube_r82.setRotationPoint(-1.6F, 0.8999F, -0.68F);
		Cubes2.addChild(cube_r82);
		setRotationAngle(cube_r82, 0.2632F, -0.0944F, 0.3366F);
		cube_r82.cubeList.add(new ModelBox(cube_r82, 66, 40, -1.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r83 = new ModelRenderer(this);
		cube_r83.setRotationPoint(-1.6F, 0.8999F, -2.68F);
		Cubes2.addChild(cube_r83);
		setRotationAngle(cube_r83, 0.2632F, -0.0944F, 0.3366F);
		cube_r83.cubeList.add(new ModelBox(cube_r83, 67, 15, -1.2F, -3.7F, -0.5F, 1, 2, 1, 0.0F, false));

		cube_r84 = new ModelRenderer(this);
		cube_r84.setRotationPoint(0.4F, 0.6351F, 9.45F);
		Cubes2.addChild(cube_r84);
		setRotationAngle(cube_r84, 0.0785F, 0.0F, 0.0F);
		cube_r84.cubeList.add(new ModelBox(cube_r84, 62, 0, 1.5F, -0.6351F, -0.45F, 1, 3, 1, 0.0F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 0, 63, -1.6F, -1.6351F, -0.45F, 1, 3, 1, 0.0F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 4, 63, 0.6F, -1.6351F, -0.45F, 1, 3, 1, 0.0F, false));
		cube_r84.cubeList.add(new ModelBox(cube_r84, 50, 63, -2.5F, -0.6351F, -0.45F, 1, 3, 1, 0.0F, false));

		cube_r85 = new ModelRenderer(this);
		cube_r85.setRotationPoint(2.8F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r85);
		setRotationAngle(cube_r85, 0.7243F, 0.0F, 0.0F);
		cube_r85.cubeList.add(new ModelBox(cube_r85, 69, 71, -0.9F, 2.0827F, 6.7915F, 1, 2, 1, 0.0F, false));
		cube_r85.cubeList.add(new ModelBox(cube_r85, 86, 56, -0.9F, 3.5827F, 6.7915F, 1, 1, 1, 0.0F, false));

		cube_r86 = new ModelRenderer(this);
		cube_r86.setRotationPoint(-1.2F, 0.0F, 0.0F);
		Cubes2.addChild(cube_r86);
		setRotationAngle(cube_r86, -0.4014F, 0.0F, 0.0F);
		cube_r86.cubeList.add(new ModelBox(cube_r86, 24, 62, -0.9F, 0.0F, -5.2F, 1, 3, 1, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 68, 78, -0.9F, -0.3F, -4.9F, 1, 2, 1, -0.003F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 28, 62, 3.1F, 0.0F, -5.2F, 1, 3, 1, 0.0F, false));
		cube_r86.cubeList.add(new ModelBox(cube_r86, 80, 37, 3.1F, -0.3F, -4.9F, 1, 2, 1, -0.003F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(-1.434F, 0.4325F, -15.6F);
		Cubes2.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.2182F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 0, 50, -0.586F, -0.5825F, -11.0F, 1, 1, 22, 0.0F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(2.234F, 0.4325F, -15.6F);
		Cubes2.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.0F, 0.0F, -0.2182F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 50, 47, -0.414F, -0.5825F, -11.0F, 1, 1, 22, 0.0F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.4F, 0.6351F, 9.45F);
		Cubes2.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0556F, 0.0555F, -0.7839F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 14, 87, 1.2075F, -0.0156F, -0.45F, 1, 1, 1, -0.002F, false));
		cube_r89.cubeList.add(new ModelBox(cube_r89, 87, 45, 1.2075F, 0.2844F, -0.45F, 1, 1, 1, -0.001F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.4F, 0.6351F, 9.45F);
		Cubes2.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0556F, -0.0555F, 0.7839F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 88, 19, -2.2276F, 0.0045F, -0.45F, 1, 1, 1, -0.002F, false));
		cube_r90.cubeList.add(new ModelBox(cube_r90, 88, 21, -2.2276F, 0.3045F, -0.45F, 1, 1, 1, -0.001F, false));

		deco = new ModelRenderer(this);
		deco.setRotationPoint(1.0566F, 0.0337F, -3.2939F);
		Slide.addChild(deco);
		

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(1.4F, -0.2F, 3.9F);
		deco.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.7854F, 0.0F, 0.0F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 29, 0, -3.875F, -0.6F, -0.5F, 1, 1, 1, -0.2F, false));
		cube_r91.cubeList.add(new ModelBox(cube_r91, 29, 25, -0.775F, -0.6F, -0.5F, 1, 1, 1, -0.2F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}