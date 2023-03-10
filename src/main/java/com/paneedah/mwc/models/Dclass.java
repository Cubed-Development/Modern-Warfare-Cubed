package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Dclass extends ModelBiped {
	private final ModelRenderer torso;
	private final ModelRenderer bone7;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer right_arm;
	private final ModelRenderer bone35;
	private final ModelRenderer bone39;
	private final ModelRenderer bone41;
	private final ModelRenderer bone42;
	private final ModelRenderer bone40;
	private final ModelRenderer bone37;
	private final ModelRenderer bone26;
	private final ModelRenderer bone38;
	private final ModelRenderer bone36;
	private final ModelRenderer bone33;
	private final ModelRenderer left_arm;
	private final ModelRenderer bone25;
	private final ModelRenderer bone28;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone34;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone45;
	private final ModelRenderer right_pant;
	private final ModelRenderer bone9;
	private final ModelRenderer bone16;
	private final ModelRenderer bone18;
	private final ModelRenderer bone20;
	private final ModelRenderer bone15;
	private final ModelRenderer bone13;
	private final ModelRenderer right_boot;
	private final ModelRenderer bone11;
	private final ModelRenderer left_pant;
	private final ModelRenderer bone8;
	private final ModelRenderer bone23;
	private final ModelRenderer bone17;
	private final ModelRenderer bone14;
	private final ModelRenderer bone21;
	private final ModelRenderer bone19;
	private final ModelRenderer left_boot;
	private final ModelRenderer bone12;
//	private final ModelRenderer rightarm;
//	private final ModelRenderer leftleg;
//	private final ModelRenderer rightleg;
//	private final ModelRenderer leftarm;
	private final ModelRenderer head;
	private final ModelRenderer body;
		
		public Dclass()
	    {
	        super(0.01f, 0, 128, 128);
	      textureWidth = 128;
	      textureHeight = 128;

		torso = new ModelRenderer(this);
		torso.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(torso, -3.1416F, 0.0F, 3.1416F);
		

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0F, 24.0F, 0.0F);
		torso.addChild(bone7);
		bone7.cubeList.add(new ModelBox(bone7, 26, 40, 3.25F, -24.0F, -2.0F, 1, 12, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 52, 67, 2.99F, -24.5F, -2.0F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 16, 36, -4.25F, -24.0F, -2.0F, 1, 12, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 58, 52, -3.99F, -24.5F, -2.0F, 1, 1, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone3);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 3.0F);
		bone3.addChild(bone);
		setRotationAngle(bone, 0.0F, -0.0873F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 20, 56, -4.0436F, -24.0F, -1.4981F, 4, 12, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 76, 6, -4.0654F, -24.4F, -1.7471F, 4, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 58, 58, -4.0436F, -24.0F, -1.4F, 3, 12, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, -12.5F, 3.5F);
		bone3.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0873F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 52, 13, -1.9052F, -11.5F, -2.1705F, 4, 12, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 76, 8, -1.8834F, -11.9F, -2.4196F, 4, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 58, 0, -0.9052F, -11.5F, -2.1F, 3, 12, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone7.addChild(bone4);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, -3.0F);
		bone4.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0873F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 36, 52, -4.0436F, -24.0F, 0.4981F, 4, 12, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 4, -4.0654F, -24.49F, 0.7471F, 4, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(2.0F, -12.5F, -3.5F);
		bone4.addChild(bone6);
		setRotationAngle(bone6, 0.0F, -0.0873F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 51, 27, -1.9052F, -11.5F, 1.1705F, 4, 12, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 76, 2, -1.8834F, -11.99F, 1.4196F, 4, 1, 1, 0.0F, false));

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(4.0F, 2.25F, -8.35F);
		right_arm.addChild(bone35);
		setRotationAngle(bone35, -0.0175F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 66, 0, -7.0F, -4.3584F, 6.1749F, 4, 9, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-1.0F, 5.3916F, -1.9251F);
		right_arm.addChild(bone39);
		setRotationAngle(bone39, 0.1134F, 0.0F, 0.0F);
		bone39.cubeList.add(new ModelBox(bone39, 76, 0, -2.0F, 1.5549F, -0.6076F, 4, 1, 1, 0.0F, false));

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-5.0F, 5.3916F, -1.9251F);
		right_arm.addChild(bone41);
		setRotationAngle(bone41, 0.1134F, 1.5708F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 49, 76, -3.9251F, 1.7897F, 1.4539F, 4, 1, 1, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(3.0F, 5.3916F, -1.9251F);
		right_arm.addChild(bone42);
		setRotationAngle(bone42, 0.1134F, -1.5708F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 75, 65, -0.0749F, 1.7897F, 1.4539F, 4, 1, 1, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(-1.0F, 5.3916F, 1.9251F);
		right_arm.addChild(bone40);
		setRotationAngle(bone40, -0.1134F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 59, 76, -2.0F, 1.5549F, -0.3924F, 4, 1, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(0.0F, 0.3916F, -1.6751F);
		right_arm.addChild(bone37);
		setRotationAngle(bone37, -0.0175F, 1.5708F, 0.0F);
		bone37.cubeList.add(new ModelBox(bone37, 30, 65, -3.6751F, -2.3371F, -3.1413F, 4, 9, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-2.0F, 0.3916F, -1.6751F);
		right_arm.addChild(bone26);
		setRotationAngle(bone26, -0.0175F, -1.5708F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 62, 13, -0.3249F, -2.3371F, -3.1413F, 4, 9, 1, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(-0.25F, 0.3916F, -1.6751F);
		right_arm.addChild(bone38);
		setRotationAngle(bone38, -0.0611F, 1.5708F, 0.0F);
		bone38.cubeList.add(new ModelBox(bone38, 72, 56, -3.6751F, -1.1191F, -3.0155F, 4, 2, 1, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(4.0F, 2.25F, 8.35F);
		right_arm.addChild(bone36);
		setRotationAngle(bone36, 0.0175F, 0.0F, 0.0F);
		bone36.cubeList.add(new ModelBox(bone36, 66, 66, -7.0F, -4.3584F, -7.1749F, 4, 9, 1, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(5.0F, -1.25F, 0.0F);
		right_arm.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -0.0436F);
		bone33.cubeList.add(new ModelBox(bone33, 54, 45, -7.9952F, -1.2181F, -2.0F, 4, 1, 4, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-4.0F, 2.25F, -8.35F);
		left_arm.addChild(bone25);
		setRotationAngle(bone25, -0.0175F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 61, 25, 3.0F, -4.3584F, 6.1749F, 4, 9, 1, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(1.0F, 5.3916F, -1.9251F);
		left_arm.addChild(bone28);
		setRotationAngle(bone28, 0.1134F, 0.0F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 75, 75, -2.0F, 1.5549F, -0.6076F, 4, 1, 1, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(5.0F, 5.3916F, -1.9251F);
		left_arm.addChild(bone29);
		setRotationAngle(bone29, 0.1134F, -1.5708F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 40, 75, -0.0749F, 1.7897F, 1.4539F, 4, 1, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(-3.0F, 5.3916F, -1.9251F);
		left_arm.addChild(bone30);
		setRotationAngle(bone30, 0.1134F, 1.5708F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 30, 75, -3.9251F, 1.7897F, 1.4539F, 4, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(1.0F, 5.3916F, 1.9251F);
		left_arm.addChild(bone31);
		setRotationAngle(bone31, -0.1134F, 0.0F, 0.0F);
		bone31.cubeList.add(new ModelBox(bone31, 54, 50, -2.0F, 1.5549F, -0.3924F, 4, 1, 1, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 0.3916F, -1.6751F);
		left_arm.addChild(bone32);
		setRotationAngle(bone32, -0.0175F, -1.5708F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 46, 61, -0.3249F, -2.3371F, -3.1413F, 4, 9, 1, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(2.0F, 0.3916F, -1.6751F);
		left_arm.addChild(bone34);
		setRotationAngle(bone34, -0.0175F, 1.5708F, 0.0F);
		bone34.cubeList.add(new ModelBox(bone34, 10, 61, -3.6751F, -2.3371F, -3.1413F, 4, 9, 1, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(0.25F, 0.3916F, -1.6751F);
		left_arm.addChild(bone43);
		setRotationAngle(bone43, -0.0611F, -1.5708F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 71, 32, -0.3249F, -1.1191F, -3.0155F, 4, 2, 1, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(-4.0F, 2.25F, 8.35F);
		left_arm.addChild(bone44);
		setRotationAngle(bone44, 0.0175F, 0.0F, 0.0F);
		bone44.cubeList.add(new ModelBox(bone44, 0, 61, 3.0F, -4.3584F, -7.1749F, 4, 9, 1, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-5.0F, -1.25F, 0.0F);
		left_arm.addChild(bone45);
		setRotationAngle(bone45, 0.0F, 0.0F, 0.0436F);
		bone45.cubeList.add(new ModelBox(bone45, 52, 40, 3.9952F, -1.2181F, -2.0F, 4, 1, 4, 0.0F, false));

		right_pant = new ModelRenderer(this);
		right_pant.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(right_pant, -3.1416F, 0.0F, 3.1416F);
		

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.0F, 12.0F, 1.25F);
		right_pant.addChild(bone9);
		bone9.cubeList.add(new ModelBox(bone9, 20, 69, -4.0F, -6.0F, 0.0F, 4, 3, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 68, 35, -4.0F, -7.0F, -3.5F, 4, 4, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 10, 48, -4.25F, -12.0F, -3.25F, 1, 9, 4, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 48, -0.75F, -6.0F, -3.25F, 1, 3, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-2.0F, -10.5F, 0.75F);
		bone9.addChild(bone16);
		setRotationAngle(bone16, 0.0436F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 72, 18, -2.0F, -1.4877F, -0.6848F, 4, 3, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-2.0F, -10.5F, -3.25F);
		bone9.addChild(bone18);
		setRotationAngle(bone18, -0.0436F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 50, 72, -2.0F, -1.4877F, -0.3152F, 4, 3, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-2.0F, -7.5F, -3.25F);
		bone9.addChild(bone20);
		setRotationAngle(bone20, 0.0436F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 36, 16, -2.0F, -1.7374F, -0.2891F, 4, 3, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-2.0F, -9.5F, 0.75F);
		bone9.addChild(bone15);
		setRotationAngle(bone15, -0.0436F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 72, 45, -1.99F, 0.4981F, -0.4128F, 4, 3, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, -7.5F, -1.25F);
		bone9.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -0.0175F);
		bone13.cubeList.add(new ModelBox(bone13, 66, 56, -0.6F, -4.5F, -2.0F, 1, 6, 4, 0.0F, false));

		right_boot = new ModelRenderer(this);
		right_boot.setRotationPoint(-2.0F, 12.0F, 0.0F);
		right_pant.addChild(right_boot);
		setRotationAngle(right_boot, 0.0F, 0.0F, 0.0F);
		right_boot.cubeList.add(new ModelBox(right_boot, 36, 20, 0.061F, -3.951F, -1.8195F, 4, 4, 4, 0.0F, false));
		right_boot.cubeList.add(new ModelBox(right_boot, 40, 67, -0.0353F, -3.95F, -2.0389F, 1, 4, 4, 0.0F, false));
		right_boot.cubeList.add(new ModelBox(right_boot, 71, 27, 0.05F, -3.95F, -2.0695F, 4, 4, 1, 0.0F, false));
		right_boot.cubeList.add(new ModelBox(right_boot, 0, 0, -0.061F, -3.95F, 1.1F, 1, 4, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(3.5F, -0.5F, 2.0F);
		right_boot.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.1309F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 76, 51, -3.4674F, -0.45F, -0.7479F, 4, 1, 1, 0.0F, false));

		left_pant = new ModelRenderer(this);
		left_pant.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(2.0F, 12.0F, 1.25F);
		left_pant.addChild(bone8);
		bone8.cubeList.add(new ModelBox(bone8, 10, 71, -4.0F, -7.0F, 0.0F, 4, 4, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 71, -4.0F, -6.0F, -3.5F, 4, 3, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 48, 0, -4.25F, -12.0F, -3.25F, 1, 9, 4, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 48, 48, -0.75F, -6.0F, -3.25F, 1, 3, 4, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 2.5F, -2.0F);
		left_pant.addChild(bone23);
		setRotationAngle(bone23, 0.0436F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 24, 0, -1.99F, 0.4981F, -0.5872F, 4, 3, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 1.5F, -2.0F);
		left_pant.addChild(bone17);
		setRotationAngle(bone17, -0.0436F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 72, 14, -2.0F, -1.4877F, -0.3152F, 4, 3, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(2.0F, 4.5F, 0.0F);
		left_pant.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, -0.0175F);
		bone14.cubeList.add(new ModelBox(bone14, 66, 46, -0.6F, -4.5F, -2.0F, 1, 6, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 4.5F, 2.0F);
		left_pant.addChild(bone21);
		setRotationAngle(bone21, -0.0436F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 12, 32, -2.0F, -1.7374F, -0.7109F, 4, 3, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 1.5F, 2.0F);
		left_pant.addChild(bone19);
		setRotationAngle(bone19, 0.0436F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 71, 10, -2.0F, -1.4877F, -0.6848F, 4, 3, 1, 0.0F, false));

		left_boot = new ModelRenderer(this);
		left_boot.setRotationPoint(-2.0F, 12.0F, 0.0F);
		left_pant.addChild(left_boot);
		setRotationAngle(left_boot, 0.0F, 3.1416F, 0.0F);
		left_boot.cubeList.add(new ModelBox(left_boot, 24, 16, -4.061F, -3.951F, -1.8195F, 4, 4, 4, 0.0F, false));
		left_boot.cubeList.add(new ModelBox(left_boot, 71, 22, -4.04F, -3.95F, -2.0695F, 4, 4, 1, 0.0F, false));
		left_boot.cubeList.add(new ModelBox(left_boot, 40, 28, -0.9647F, -3.95F, -2.0389F, 1, 4, 4, 0.0F, false));
		left_boot.cubeList.add(new ModelBox(left_boot, 4, 0, -0.912F, -3.95F, 1.1F, 1, 4, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-3.5F, -0.5F, 2.0F);
		left_boot.addChild(bone12);
		setRotationAngle(bone12, 0.0F, -0.1309F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 76, 49, -0.5326F, -0.45F, -0.7479F, 4, 1, 1, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 88, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 88, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 88, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 88, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 88, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 88, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, true));
		
		this.bipedBody.addChild(torso);
		this.bipedLeftArm.addChild(left_arm);
		this.bipedRightArm.addChild(right_arm);
		this.bipedLeftLeg.addChild(left_pant);
		this.bipedRightLeg.addChild(right_pant);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		head.render(f5);
//		body.render(f5);
//		rightarm.render(f5);
//		leftarm.render(f5);
//		rightleg.render(f5);
//		leftleg.render(f5);
//		jacket.render(f5);
//		leftleg_usmc.render(f5);
//		rightleg_usmc.render(f5);
//		leftarm_usmc.render(f5);
//		rightarm_usmc.render(f5);
//		helmet.render(f5);
//		vest.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
