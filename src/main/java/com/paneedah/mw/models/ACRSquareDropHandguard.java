package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRSquareDropHandguard extends ModelBase {
	private final ModelRenderer handguard1;
	private final ModelRenderer bone;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone10;
	private final ModelRenderer bone9;
	private final ModelRenderer bone7;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer bone35;
	private final ModelRenderer bone36;
	private final ModelRenderer bone37;
	private final ModelRenderer bone38;
	private final ModelRenderer bone39;
	private final ModelRenderer bone40;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone2;
	private final ModelRenderer bone11;
	private final ModelRenderer bone14;
	private final ModelRenderer bone6;
	private final ModelRenderer bone8;
	private final ModelRenderer bone46;
	private final ModelRenderer bone47;
	private final ModelRenderer bone48;
	private final ModelRenderer ACR83;

	public ACRSquareDropHandguard() {
		textureWidth = 128;
		textureHeight = 128;

		handguard1 = new ModelRenderer(this);
		handguard1.setRotationPoint(0.3F, -15.4F, -49.0F);
		handguard1.cubeList.add(new ModelBox(handguard1, 0, 0, -2.8F, 4.1F, -3.0F, 2, 1, 29, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 10, 0, -1.6F, 4.8F, 20.0F, 1, 1, 5, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 10, 10, -3.0F, 4.8F, 20.0F, 2, 1, 5, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 36, 13, -1.5F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));
		handguard1.cubeList.add(new ModelBox(handguard1, 36, 11, -3.1F, 4.6F, 23.0F, 1, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, 0.0F, 0.0F);
		handguard1.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 52, 60, 0.0F, 0.3F, -3.0F, 1, 1, 24, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 7, 22, 0.0F, -0.7F, 1.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 20, 16, -0.3F, -0.7F, 0.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 6, 18, -5.3F, -0.7F, 0.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 21, 21, -5.6F, -0.7F, 1.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 18, -0.3F, 0.5F, 21.0F, 1, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 16, -5.3F, 0.5F, 21.0F, 1, 3, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 25, 0.0F, 1.3F, -3.0F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 26, 59, 0.0F, 2.3F, -3.0F, 1, 1, 24, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(1.0F, 0.3F, 21.0F);
		bone.addChild(bone3);
		setRotationAngle(bone3, -1.3614F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 4, -0.99F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -6.61F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.7F, -0.7F, 0.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.3316F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 13, -1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 9, -6.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-6.3F, 38.4F, 52.0F);
		bone.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 35, 36, 6.3F, -37.1F, -50.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 1, 6.3F, -37.1F, -47.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 3, 6.3F, -37.1F, -44.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 5, 6.3F, -37.1F, -41.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 36, 7, 6.3F, -37.1F, -38.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 29, 36, 0.7F, -37.1F, -38.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 20, 36, 0.7F, -37.1F, -41.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 16, 36, 0.7F, -37.1F, -44.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 12, 36, 0.7F, -37.1F, -47.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 8, 36, 0.7F, -37.1F, -50.0F, 1, 1, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 18, 5, 6.3F, -37.1F, -35.0F, 1, 1, 4, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone5.addChild(bone10);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone10.addChild(bone9);
		setRotationAngle(bone9, -1.7802F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 12, 33, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone10.addChild(bone7);
		setRotationAngle(bone7, 1.7802F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 16, 33, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-5.6F, 0.0F, 0.0F);
		bone5.addChild(bone28);
		

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone28.addChild(bone29);
		setRotationAngle(bone29, -1.7802F, 0.0F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 4, 30, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone28.addChild(bone30);
		setRotationAngle(bone30, 1.7802F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 0, 30, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(-5.6F, 0.0F, -3.0F);
		bone5.addChild(bone31);
		

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone31.addChild(bone32);
		setRotationAngle(bone32, -1.7802F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 8, 26, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone31.addChild(bone33);
		setRotationAngle(bone33, 1.7802F, 0.0F, 0.0F);
		bone33.cubeList.add(new ModelBox(bone33, 25, 14, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-5.6F, 0.0F, -6.0F);
		bone5.addChild(bone34);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone34.addChild(bone35);
		setRotationAngle(bone35, -1.7802F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 22, 25, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone34.addChild(bone36);
		setRotationAngle(bone36, 1.7802F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 24, 5, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-5.6F, 0.0F, -9.0F);
		bone5.addChild(bone37);
		

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone37.addChild(bone38);
		setRotationAngle(bone38, -1.7802F, 0.0F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 23, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone37.addChild(bone39);
		setRotationAngle(bone39, 1.7802F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 18, 6, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-5.6F, 0.0F, -12.0F);
		bone5.addChild(bone40);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone40.addChild(bone41);
		setRotationAngle(bone41, -1.7802F, 0.0F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 0, 18, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone40.addChild(bone42);
		setRotationAngle(bone42, 1.7802F, 0.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 17, 0, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-5.6F, 0.0F, -15.0F);
		bone5.addChild(bone43);
		

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone43.addChild(bone44);
		setRotationAngle(bone44, -1.7802F, 0.0F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 10, 0, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone43.addChild(bone45);
		setRotationAngle(bone45, 1.7802F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 10, 10, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, -3.0F);
		bone5.addChild(bone12);
		

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, -1.7802F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 8, 33, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone12.addChild(bone15);
		setRotationAngle(bone15, 1.7802F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 4, 33, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, -6.0F);
		bone5.addChild(bone16);
		

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone16.addChild(bone17);
		setRotationAngle(bone17, -1.7802F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 33, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone16.addChild(bone18);
		setRotationAngle(bone18, 1.7802F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 32, 32, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, -9.0F);
		bone5.addChild(bone19);
		

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone19.addChild(bone20);
		setRotationAngle(bone20, -1.7802F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 23, 32, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone19.addChild(bone21);
		setRotationAngle(bone21, 1.7802F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 29, 30, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, -12.0F);
		bone5.addChild(bone22);
		

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone22.addChild(bone23);
		setRotationAngle(bone23, -1.7802F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 20, 30, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone22.addChild(bone24);
		setRotationAngle(bone24, 1.7802F, 0.0F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 16, 30, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, -15.0F);
		bone5.addChild(bone25);
		

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(7.29F, -36.5F, -37.0F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, -1.7802F, 0.0F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 12, 30, -1.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(7.3F, -36.7F, -37.0F);
		bone25.addChild(bone27);
		setRotationAngle(bone27, 1.7802F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 8, 30, -1.01F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(1.0F, 0.3F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -1.0995F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 83, -1.0F, -1.0F, 3.0F, 1, 1, 18, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.0F, 3.3F, -3.0F);
		bone.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.6458F);
		bone11.cubeList.add(new ModelBox(bone11, 19, 10, -3.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 29, 34, -2.0F, -1.0F, 5.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 20, 34, -2.0F, -1.0F, 8.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 33, 30, -2.0F, -1.0F, 11.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 33, 24, -2.0F, -1.0F, 14.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 33, 22, -2.0F, -1.0F, 17.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 9, -2.0F, -1.0F, 20.0F, 1, 1, 8, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 62, 0, -3.0F, -1.0F, 3.0F, 1, 1, 25, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 36, 9, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 33, 0, -1.4F, -1.01F, 1.0F, 1, 1, 27, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-5.6F, 3.3F, -3.0F);
		bone.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.6458F);
		bone14.cubeList.add(new ModelBox(bone14, 10, 6, 0.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 0, 0, 1.0F, -1.0F, 20.0F, 1, 1, 8, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 17, 23, 1.0F, -1.0F, 1.0F, 1, 1, 2, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 4, 36, 1.0F, -1.0F, 5.0F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 0, 36, 1.0F, -1.0F, 8.0F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 35, 34, 1.0F, -1.0F, 11.0F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 32, 35, 1.0F, -1.0F, 14.0F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 23, 35, 1.0F, -1.0F, 17.0F, 1, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 29, 31, 0.4F, -1.0F, 1.0F, 1, 1, 27, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 0, 30, 2.0F, -1.0F, 1.0F, 1, 1, 27, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-5.1F, 0.0F, 0.0F);
		handguard1.addChild(bone6);
		bone6.cubeList.add(new ModelBox(bone6, 58, 28, 0.0F, 0.3F, -3.0F, 1, 1, 24, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 17, 0, 0.0F, 1.3F, 17.0F, 1, 1, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 12, 23, 0.0F, 1.3F, -3.0F, 1, 1, 3, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 58, 0.0F, 2.3F, -3.0F, 1, 1, 24, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.3F, 0.0F);
		bone6.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 1.0995F);
		bone8.cubeList.add(new ModelBox(bone8, 78, 53, 0.0F, -1.0F, 3.0F, 1, 1, 18, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(1.6F, 0.8F, 0.4F);
		handguard1.addChild(bone46);
		setRotationAngle(bone46, 0.2618F, 0.0F, 0.0F);
		bone46.cubeList.add(new ModelBox(bone46, 33, 20, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone46.cubeList.add(new ModelBox(bone46, 33, 18, -6.8F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(1.6F, 2.3F, 18.1F);
		handguard1.addChild(bone47);
		setRotationAngle(bone47, 0.6109F, -0.7854F, -0.4538F);
		bone47.cubeList.add(new ModelBox(bone47, 33, 16, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 14, -0.7172F, -0.8378F, 0.2317F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 12, -0.4343F, -0.6755F, 0.4634F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 10, -0.1515F, -0.5133F, 0.6951F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 8, 0.1314F, -0.3511F, 0.9268F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 6, 0.4142F, -0.1888F, 1.1585F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 4, 0.6971F, -0.0266F, 1.3901F, 1, 1, 1, 0.0F, false));
		bone47.cubeList.add(new ModelBox(bone47, 33, 2, 0.9799F, 0.1356F, 1.6218F, 1, 1, 1, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-3.8F, 2.3F, 18.1F);
		handguard1.addChild(bone48);
		setRotationAngle(bone48, 0.6109F, -0.7854F, -0.4538F);
		bone48.cubeList.add(new ModelBox(bone48, 33, 0, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 25, 27, -0.7172F, -0.8378F, 0.2317F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 16, 27, -0.4343F, -0.6755F, 0.4634F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 12, 27, -0.1515F, -0.5133F, 0.6951F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 25, 17, 0.1314F, -0.3511F, 0.9268F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 11, 18, 0.4142F, -0.1888F, 1.1585F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 10, 13, 0.6971F, -0.0266F, 1.3901F, 1, 1, 1, 0.0F, false));
		bone48.cubeList.add(new ModelBox(bone48, 10, 3, 0.9799F, 0.1356F, 1.6218F, 1, 1, 1, 0.0F, false));

		ACR83 = new ModelRenderer(this);
		ACR83.setRotationPoint(-1.0F, -15.8F, -25.0F);
		ACR83.cubeList.add(new ModelBox(ACR83, 0, 0, -3.0F, 0.0F, -20.0F, 5, 2, 21, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard1.render(f5);
		ACR83.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}