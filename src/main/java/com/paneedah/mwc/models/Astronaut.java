package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Astronaut extends ModelBiped {
	private final ModelRenderer head;
//	private final ModelRenderer body;
//	private final ModelRenderer rightarm;
//	private final ModelRenderer leftarm;
//	private final ModelRenderer rightleg;
//	private final ModelRenderer leftleg;
	private final ModelRenderer torso_piece;
	private final ModelRenderer bone16;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone8;
	private final ModelRenderer body_r1;
	private final ModelRenderer bone9;
	private final ModelRenderer body_r2;
	private final ModelRenderer bone10;
	private final ModelRenderer bone13;
	private final ModelRenderer bone4;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone3;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone17;
	private final ModelRenderer bone19;
	private final ModelRenderer bone22;
	private final ModelRenderer bone18;
	private final ModelRenderer bone21;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone20;
	private final ModelRenderer arm_right;
	private final ModelRenderer bone25;
	private final ModelRenderer arm_left;
	private final ModelRenderer bone26;
	private final ModelRenderer leg_right;
	private final ModelRenderer bone29;
	private final ModelRenderer bone30;
	private final ModelRenderer bone27;
	private final ModelRenderer bone28;
	private final ModelRenderer leg_left;
	private final ModelRenderer bone31;
	private final ModelRenderer bone32;
	private final ModelRenderer bone33;
	private final ModelRenderer bone34;
	private final ModelRenderer helmet;
	private final ModelRenderer bone48;
	private final ModelRenderer bone51;
	private final ModelRenderer bone60;
	private final ModelRenderer bone50;
	private final ModelRenderer bone59;
	private final ModelRenderer bone49;
	private final ModelRenderer bone53;
	private final ModelRenderer bone61;
	private final ModelRenderer bone52;
	private final ModelRenderer bone62;
	private final ModelRenderer bone82;
	private final ModelRenderer bone81;
	private final ModelRenderer bone80;
	private final ModelRenderer bone86;
	private final ModelRenderer bone87;
	private final ModelRenderer bone88;
	private final ModelRenderer bone83;
	private final ModelRenderer bone84;
	private final ModelRenderer bone85;
	private final ModelRenderer bone58;
	private final ModelRenderer bone78;
	private final ModelRenderer bone79;
	private final ModelRenderer bone40;
	private final ModelRenderer bone42;
	private final ModelRenderer bone43;
	private final ModelRenderer bone44;
	private final ModelRenderer bone41;
	private final ModelRenderer bone45;
	private final ModelRenderer bone54;
	private final ModelRenderer bone89;
	private final ModelRenderer mandible;
	private final ModelRenderer bone35;
	private final ModelRenderer bone37;
	private final ModelRenderer bone39;
	private final ModelRenderer bone36;
	private final ModelRenderer bone38;
	private final ModelRenderer forehead;
	private final ModelRenderer bone47;
	private final ModelRenderer bone56;
	private final ModelRenderer bone55;
	private final ModelRenderer bone57;
	private final ModelRenderer bone46;
	private final ModelRenderer forehead2;
	private final ModelRenderer bone63;
	private final ModelRenderer bone64;
	private final ModelRenderer bone65;
	private final ModelRenderer bone66;
	private final ModelRenderer bone67;
	private final ModelRenderer forehead3;
	private final ModelRenderer bone68;
	private final ModelRenderer bone69;
	private final ModelRenderer bone70;
	private final ModelRenderer bone71;
	private final ModelRenderer bone72;
	private final ModelRenderer forehead4;
	private final ModelRenderer bone73;
	private final ModelRenderer bone74;
	private final ModelRenderer bone75;
	private final ModelRenderer bone76;

	public Astronaut()
    {
        super(0.01f, 0, 128, 128);
      textureWidth = 128;
      textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 30, 30, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 16, 52, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 50, 4, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 50, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 36, 46, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		torso_piece = new ModelRenderer(this);
		torso_piece.setRotationPoint(0.0F, 0.0F, 0.0F);
		torso_piece.cubeList.add(new ModelBox(torso_piece, 54, 20, -4.0F, 0.0F, -2.5F, 8, 12, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 94, 59, -3.0F, 1.5F, -3.75F, 6, 3, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 89, 83, -3.0F, 0.01F, -2.75F, 6, 3, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 105, 26, -2.0F, 4.5F, -3.15F, 4, 2, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 87, 24, -3.5F, 5.75F, -3.251F, 7, 4, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 81, 105, -1.5F, 5.5F, -3.501F, 3, 4, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 24, 16, -4.5F, 8.0F, -3.0F, 9, 1, 6, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 0, 25, -4.5F, 1.25F, -3.0F, 9, 5, 6, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 105, 23, -2.0F, 9.75F, -2.75F, 4, 2, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 107, 56, -1.5F, 2.75F, -4.25F, 3, 2, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 50, 42, -4.0F, -0.25F, -2.0F, 8, 1, 4, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 24, 25, -4.0F, 11.25F, -2.0F, 8, 1, 4, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 52, 52, -4.0F, 9.0F, 1.5F, 8, 3, 1, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 80, 42, -4.25F, 0.0F, -2.0F, 1, 12, 4, 0.0F, false));
		torso_piece.cubeList.add(new ModelBox(torso_piece, 79, 79, 3.25F, 0.0F, -2.0F, 1, 12, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 1.25F, -2.0F);
		torso_piece.addChild(bone16);
		setRotationAngle(bone16, -0.2618F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 99, 70, -2.5F, -0.8059F, -1.2244F, 5, 2, 1, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(3.944F, 4.1186F, -2.6148F);
		torso_piece.addChild(bone14);
		setRotationAngle(bone14, 0.3927F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 30, 30, -0.6F, -1.6728F, -0.1189F, 1, 3, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-3.9439F, 4.119F, -2.6091F);
		torso_piece.addChild(bone15);
		setRotationAngle(bone15, 0.3927F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 24, 25, -0.4F, -1.6728F, -0.1189F, 1, 3, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 4.75F, -2.5F);
		torso_piece.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -0.3927F);
		bone11.cubeList.add(new ModelBox(bone11, 105, 5, -3.9356F, -2.2574F, -0.75F, 4, 2, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 24, 5, -3.0227F, -1.6496F, -1.5F, 2, 1, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(3.0F, 4.75F, -2.5F);
		torso_piece.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 0.3927F);
		bone12.cubeList.add(new ModelBox(bone12, 104, 63, -2.8383F, -1.067F, -0.75F, 4, 2, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 29, -1.749F, -0.5016F, -1.5F, 2, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 1.75F, -2.25F);
		torso_piece.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 0.0873F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(3.5501F, -0.6015F, 0.0F);
		bone8.addChild(body_r1);
		setRotationAngle(body_r1, -0.1309F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 50, 23, -0.5218F, -1.2469F, -0.5325F, 1, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-2.0F, 2.25F, -2.25F);
		torso_piece.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -0.0873F);
		

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(-1.5142F, -0.9253F, 0.0F);
		bone9.addChild(body_r2);
		setRotationAngle(body_r2, -0.1309F, 0.0F, 0.0F);
		body_r2.cubeList.add(new ModelBox(body_r2, 0, 50, -0.4782F, -1.2469F, -0.5325F, 1, 2, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 11.0F, -2.25F);
		torso_piece.addChild(bone10);
		setRotationAngle(bone10, -0.1745F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 82, 95, -1.0F, -0.9566F, -0.7462F, 2, 2, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 5.5F, -2.5F);
		torso_piece.addChild(bone13);
		setRotationAngle(bone13, 0.2182F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 14, 95, -1.0F, -1.1623F, -1.2322F, 2, 2, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.75F, 5.5F, -2.75F);
		torso_piece.addChild(bone4);
		setRotationAngle(bone4, 0.3927F, 0.0F, -0.3927F);
		bone4.cubeList.add(new ModelBox(bone4, 32, 56, -1.1137F, 0.1695F, -1.0479F, 1, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.25F, 8.75F, -3.0F);
		torso_piece.addChild(bone7);
		setRotationAngle(bone7, -0.0436F, -0.0873F, -0.3054F);
		bone7.cubeList.add(new ModelBox(bone7, 106, 35, -2.2616F, -0.3292F, -0.269F, 3, 3, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 107, 78, -2.261F, -0.33F, -0.519F, 3, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.75F, 5.5F, -2.75F);
		torso_piece.addChild(bone5);
		setRotationAngle(bone5, 0.3927F, 0.0F, 0.3927F);
		bone5.cubeList.add(new ModelBox(bone5, 16, 54, 0.1137F, 0.1695F, -1.0479F, 1, 1, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.25F, 8.75F, -3.0F);
		torso_piece.addChild(bone6);
		setRotationAngle(bone6, -0.0436F, 0.0873F, 0.3054F);
		bone6.cubeList.add(new ModelBox(bone6, 106, 93, -0.7384F, -0.3292F, -0.269F, 3, 3, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 107, 68, -0.739F, -0.33F, -0.519F, 3, 1, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 1.5F, -2.25F);
		torso_piece.addChild(bone3);
		setRotationAngle(bone3, -0.3054F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 42, 23, -1.0F, -0.2745F, -1.2153F, 2, 1, 1, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(4.5F, 2.0F, -0.5F);
		torso_piece.addChild(bone);
		setRotationAngle(bone, -0.1309F, 0.0F, 0.0873F);
		bone.cubeList.add(new ModelBox(bone, 81, 0, -1.0977F, -2.9151F, -2.7467F, 1, 4, 6, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-4.0F, 2.0F, -0.5F);
		torso_piece.addChild(bone2);
		setRotationAngle(bone2, -0.1309F, 0.0F, -0.0873F);
		bone2.cubeList.add(new ModelBox(bone2, 75, 66, -0.4004F, -2.9587F, -2.7467F, 1, 4, 6, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, 0.0F, 0.0F);
		torso_piece.addChild(bone17);
		bone17.cubeList.add(new ModelBox(bone17, 89, 0, -2.5F, -0.75F, 3.25F, 5, 4, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 47, 0, -4.0F, 3.25F, 2.5F, 8, 2, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 32, 8, -3.5F, 5.25F, 2.25F, 7, 5, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 74, 59, -4.0F, 5.25F, 1.75F, 8, 4, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 10, 41, -2.5F, 9.75F, 1.5F, 5, 1, 2, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 5, 95, -1.0F, 7.25F, 3.75F, 2, 2, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 36, 46, -2.75F, 5.5F, 3.5F, 1, 2, 1, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 10, 36, 1.75F, 5.5F, 3.5F, 1, 2, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(3.5F, 2.0F, 4.0F);
		bone17.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.0873F);
		bone19.cubeList.add(new ModelBox(bone19, 55, 105, -1.0019F, -2.5614F, -1.1441F, 2, 3, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 11, 113, -1.9981F, -2.4743F, -1.3941F, 2, 3, 2, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(3.5F, 2.0F, 4.0F);
		bone17.addChild(bone22);
		setRotationAngle(bone22, -0.2182F, 0.0F, 0.0873F);
		bone22.cubeList.add(new ModelBox(bone22, 63, 106, -1.0019F, 0.2429F, -1.0694F, 2, 2, 2, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-3.5F, 2.0F, 4.0F);
		bone17.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, -0.0873F);
		bone18.cubeList.add(new ModelBox(bone18, 13, 105, -0.9981F, -2.5611F, -1.1384F, 2, 3, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 11, 113, -0.0019F, -2.4739F, -1.3884F, 2, 3, 2, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-3.5F, 2.0F, 4.0F);
		bone17.addChild(bone21);
		setRotationAngle(bone21, -0.2182F, 0.0F, -0.0873F);
		bone21.cubeList.add(new ModelBox(bone21, 106, 14, -0.9981F, 0.242F, -1.0638F, 2, 2, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.75F, 3.75F, 4.0F);
		bone17.addChild(bone23);
		setRotationAngle(bone23, -0.2182F, -0.0873F, -0.3927F);
		bone23.cubeList.add(new ModelBox(bone23, 45, 65, -4.215F, -0.2767F, -7.2431F, 2, 2, 7, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.75F, 3.5F, 3.5F);
		bone17.addChild(bone24);
		setRotationAngle(bone24, -0.2182F, 0.0873F, 0.3927F);
		bone24.cubeList.add(new ModelBox(bone24, 63, 63, 2.3365F, -0.0347F, -6.6771F, 2, 2, 7, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 7.0F, 4.0F);
		bone17.addChild(bone20);
		setRotationAngle(bone20, -0.0873F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 99, 87, -1.5F, -3.5218F, -0.251F, 3, 6, 1, 0.0F, false));

		arm_right = new ModelRenderer(this);
		arm_right.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm_right.cubeList.add(new ModelBox(arm_right, 30, 78, 0.25F, -2.0F, -2.0F, 1, 12, 4, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 46, 74, -3.25F, -2.0F, -2.0F, 1, 12, 4, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 76, 95, -3.575F, 4.0F, -2.001F, 1, 4, 4, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 82, 99, -3.825F, 4.25F, -2.0F, 1, 2, 4, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 48, 20, -4.075F, 5.0F, -0.5F, 1, 1, 1, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 81, 12, -3.625F, 8.0F, -1.0F, 1, 2, 2, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 72, 24, -3.5F, 6.0F, -2.5F, 5, 1, 5, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 72, 18, -3.5F, 7.25F, -2.5F, 5, 1, 5, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 99, 63, -3.5F, -2.25F, -1.5F, 1, 4, 3, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 50, 29, -3.75F, -2.5F, -0.5F, 1, 1, 1, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 89, 65, -3.0F, -2.0F, 1.25F, 4, 12, 1, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 47, 103, -3.001F, 3.0F, 1.5F, 4, 3, 1, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 89, 89, -3.0F, -2.0F, -2.25F, 4, 12, 1, 0.0F, false));
		arm_right.cubeList.add(new ModelBox(arm_right, 86, 41, -3.0F, 9.25F, -2.0F, 4, 1, 4, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(-1.25F, -2.25F, 0.0F);
		arm_right.addChild(bone25);
		setRotationAngle(bone25, 0.0F, 0.0F, -0.1745F);
		bone25.cubeList.add(new ModelBox(bone25, 66, 18, -2.4186F, -0.6803F, -0.5F, 4, 1, 1, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 86, 54, -1.9186F, -0.1803F, -2.0F, 4, 1, 4, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 89, 29, -2.1686F, -0.4303F, -1.5F, 4, 1, 3, 0.0F, false));

		arm_left = new ModelRenderer(this);
		arm_left.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(arm_left, -3.1416F, 0.0F, 3.1416F);
		arm_left.cubeList.add(new ModelBox(arm_left, 69, 72, 0.25F, -2.0F, -2.0F, 1, 12, 4, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 59, 72, -3.25F, -2.0F, -2.0F, 1, 12, 4, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 8, 95, -3.575F, 4.0F, -1.999F, 1, 4, 4, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 2, 113, -3.825F, 4.05F, -1.0F, 1, 4, 2, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 74, 65, -3.625F, 8.0F, -1.0F, 1, 2, 2, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 30, 72, -3.5F, 6.0F, -2.5F, 5, 1, 5, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 69, 36, -3.5F, 7.25F, -2.5F, 5, 1, 5, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 44, 62, -3.5F, -2.25F, -1.5F, 1, 4, 3, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 22, 41, -3.75F, -2.5F, -0.5F, 1, 1, 1, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 66, 88, -3.0F, -2.0F, -2.25F, 4, 12, 1, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 102, 80, -3.001F, 3.0F, -2.5F, 4, 3, 1, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 56, 88, -3.0F, -2.0F, 1.25F, 4, 12, 1, 0.0F, false));
		arm_left.cubeList.add(new ModelBox(arm_left, 84, 36, -3.0F, 9.25F, -2.0F, 4, 1, 4, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-1.25F, -2.25F, 0.0F);
		arm_left.addChild(bone26);
		setRotationAngle(bone26, 0.0F, 0.0F, -0.1745F);
		bone26.cubeList.add(new ModelBox(bone26, 32, 23, -2.4186F, -0.6803F, -0.5F, 4, 1, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 85, 78, -1.9186F, -0.1803F, -2.0F, 4, 1, 4, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 56, 65, -2.1686F, -0.4303F, -1.5F, 4, 1, 3, 0.0F, false));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(0.0F, 0.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 70, 43, 1.25F, 0.0F, -2.0F, 1, 12, 4, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 87, 10, -2.0F, 0.0F, 1.25F, 4, 12, 1, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 20, 86, -2.0F, 0.0F, -2.25F, 4, 12, 1, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 105, 50, -1.5F, 4.75F, -2.5F, 3, 3, 1, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 107, 66, -1.5F, 5.5F, -2.75F, 3, 1, 1, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 104, 32, -2.0F, 10.0F, -2.5F, 4, 2, 1, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 107, 8, -1.5F, 11.0F, -3.25F, 3, 1, 1, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 97, 16, -1.5F, 11.0F, -1.5F, 3, 1, 3, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 52, 47, -2.0F, -0.25F, -2.0F, 4, 1, 4, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 20, 70, -2.25F, 0.0F, -2.001F, 1, 12, 4, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 98, 51, -3.85F, 1.4F, -1.75F, 2, 3, 3, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 66, 6, -2.5F, 1.5F, -2.5F, 5, 1, 5, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 62, 0, -2.5F, 3.25F, -2.5F, 5, 1, 5, 0.0F, false));
		leg_right.cubeList.add(new ModelBox(leg_right, 95, 105, -3.85F, 4.4F, -1.75F, 2, 2, 2, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 11.0F, 1.75F);
		leg_right.addChild(bone29);
		setRotationAngle(bone29, -0.0873F, 0.0F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 37, 104, -2.0F, -1.0474F, -0.4147F, 4, 2, 1, 0.0F, false));

		bone30 = new ModelRenderer(this);
		bone30.setRotationPoint(0.0F, 10.9526F, 1.8353F);
		leg_right.addChild(bone30);
		setRotationAngle(bone30, 0.0873F, 0.0F, 0.0F);
		bone30.cubeList.add(new ModelBox(bone30, 103, 84, -2.0F, -2.8901F, -0.3308F, 4, 2, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-1.75F, 11.0F, 0.0F);
		leg_right.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.0F, -0.0873F);
		bone27.cubeList.add(new ModelBox(bone27, 95, 98, -0.5853F, -1.0474F, -2.0F, 1, 2, 4, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(-1.965F, 9.0342F, 0.0F);
		leg_right.addChild(bone28);
		setRotationAngle(bone28, 0.0F, 0.0F, 0.0873F);
		bone28.cubeList.add(new ModelBox(bone28, 97, 74, -0.3728F, -0.9903F, -2.0F, 1, 2, 4, 0.0F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leg_left, -3.1416F, 0.0F, 3.1416F);
		leg_left.cubeList.add(new ModelBox(leg_left, 10, 66, 1.25F, 0.0F, -2.0F, 1, 12, 4, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 10, 82, -2.0F, 0.0F, -2.25F, 4, 12, 1, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 82, -2.0F, 0.0F, 1.25F, 4, 12, 1, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 76, 42, -1.5F, 4.75F, 1.5F, 3, 3, 1, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 94, 63, -1.5F, 5.5F, 1.75F, 3, 1, 1, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 79, 76, -2.0F, 10.0F, 1.5F, 4, 2, 1, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 89, 87, -1.5F, 11.0F, 2.25F, 3, 1, 1, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 94, 20, -1.5F, 11.0F, -1.5F, 3, 1, 3, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 10, 36, -2.0F, -0.25F, -2.0F, 4, 1, 4, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 66, -2.25F, 0.0F, -1.999F, 1, 12, 4, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 90, 46, -2.5F, 1.75F, -1.98F, 1, 4, 4, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 44, 23, -2.75F, 2.0F, -1.98F, 1, 2, 4, 0.0F, false));
		leg_left.cubeList.add(new ModelBox(leg_left, 22, 38, -3.0F, 2.75F, -0.499F, 1, 1, 1, 0.0F, false));

		bone31 = new ModelRenderer(this);
		bone31.setRotationPoint(0.0F, 11.0F, -1.75F);
		leg_left.addChild(bone31);
		setRotationAngle(bone31, 0.0873F, 0.0F, 0.0F);
		bone31.cubeList.add(new ModelBox(bone31, 103, 20, -2.0F, -1.0474F, -0.5853F, 4, 2, 1, 0.0F, false));

		bone32 = new ModelRenderer(this);
		bone32.setRotationPoint(0.0F, 10.9526F, -1.8353F);
		leg_left.addChild(bone32);
		setRotationAngle(bone32, -0.0873F, 0.0F, 0.0F);
		bone32.cubeList.add(new ModelBox(bone32, 103, 10, -2.0F, -2.8901F, -0.6692F, 4, 2, 1, 0.0F, false));

		bone33 = new ModelRenderer(this);
		bone33.setRotationPoint(-1.75F, 11.0F, 0.0F);
		leg_left.addChild(bone33);
		setRotationAngle(bone33, 0.0F, 0.0F, -0.0873F);
		bone33.cubeList.add(new ModelBox(bone33, 97, 10, -0.5853F, -1.0474F, -2.0F, 1, 2, 4, 0.0F, false));

		bone34 = new ModelRenderer(this);
		bone34.setRotationPoint(-1.965F, 9.0342F, 0.0F);
		leg_left.addChild(bone34);
		setRotationAngle(bone34, 0.0F, 0.0F, 0.0873F);
		bone34.cubeList.add(new ModelBox(bone34, 48, 97, -0.3728F, -0.9903F, -2.0F, 1, 2, 4, 0.0F, false));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 54, 33, -4.5F, -7.75F, 3.25F, 9, 7, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 18, 38, 3.25F, -6.0F, -4.0F, 1, 6, 8, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 83, 65, 3.75F, -6.0F, -0.25F, 1, 5, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 95, 3.752F, -8.75F, 0.75F, 1, 7, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 30, 94, -4.752F, -8.75F, 0.75F, 1, 7, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 100, 26, -5.25F, -6.25F, 0.0F, 1, 3, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 34, 62, 4.25F, -6.25F, 0.0F, 1, 3, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 21, 103, -4.751F, -8.75F, -2.25F, 1, 2, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 5, 103, 3.751F, -8.75F, -2.25F, 1, 2, 3, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 40, 82, -4.75F, -6.0F, -0.25F, 1, 5, 1, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 0, 36, -4.25F, -6.0F, -4.0F, 1, 6, 8, 0.0F, false));
		helmet.cubeList.add(new ModelBox(helmet, 24, 0, -4.0F, -8.25F, -3.0F, 8, 1, 7, 0.0F, false));

		bone48 = new ModelRenderer(this);
		bone48.setRotationPoint(-0.5F, -3.0F, -5.0F);
		helmet.addChild(bone48);
		setRotationAngle(bone48, 0.1309F, 0.0F, 0.0F);
		bone48.cubeList.add(new ModelBox(bone48, 29, 104, -1.0F, -2.0F, -0.5F, 3, 4, 1, 0.0F, false));

		bone51 = new ModelRenderer(this);
		bone51.setRotationPoint(-3.5F, -3.0F, -5.0F);
		helmet.addChild(bone51);
		setRotationAngle(bone51, 0.1309F, 0.3927F, 0.0F);
		bone51.cubeList.add(new ModelBox(bone51, 103, 0, -0.8857F, -1.8938F, 0.3064F, 3, 4, 1, 0.0F, false));

		bone60 = new ModelRenderer(this);
		bone60.setRotationPoint(-4.0F, -3.0F, -4.5F);
		helmet.addChild(bone60);
		setRotationAngle(bone60, 0.1309F, 1.5272F, 0.0F);
		bone60.cubeList.add(new ModelBox(bone60, 77, 0, -4.3804F, -1.9726F, -0.2919F, 4, 4, 1, 0.0F, false));

		bone50 = new ModelRenderer(this);
		bone50.setRotationPoint(2.525F, -3.0F, -4.75F);
		helmet.addChild(bone50);
		setRotationAngle(bone50, 0.1309F, -0.3927F, 0.0F);
		bone50.cubeList.add(new ModelBox(bone50, 103, 73, -1.3092F, -1.9727F, -0.2925F, 3, 4, 1, 0.0F, false));

		bone59 = new ModelRenderer(this);
		bone59.setRotationPoint(2.525F, -3.0F, -4.75F);
		helmet.addChild(bone59);
		setRotationAngle(bone59, 0.1309F, -1.5272F, 0.0F);
		bone59.cubeList.add(new ModelBox(bone59, 99, 40, 0.6304F, -2.1651F, -1.7543F, 4, 4, 1, 0.0F, false));

		bone49 = new ModelRenderer(this);
		bone49.setRotationPoint(-0.5F, -7.0F, -5.0F);
		helmet.addChild(bone49);
		setRotationAngle(bone49, -0.2618F, 0.0F, 0.0F);
		bone49.cubeList.add(new ModelBox(bone49, 65, 72, -1.0F, -0.7927F, -0.192F, 3, 3, 1, 0.0F, false));

		bone53 = new ModelRenderer(this);
		bone53.setRotationPoint(-0.5F, -7.0F, -5.0F);
		helmet.addChild(bone53);
		setRotationAngle(bone53, -0.2618F, 0.3927F, 0.0F);
		bone53.cubeList.add(new ModelBox(bone53, 6, 66, -3.6574F, -0.7061F, -0.5153F, 3, 3, 1, 0.0F, false));

		bone61 = new ModelRenderer(this);
		bone61.setRotationPoint(-0.5F, -7.0F, -9.0F);
		helmet.addChild(bone61);
		setRotationAngle(bone61, -0.2618F, 1.5272F, 0.0F);
		bone61.cubeList.add(new ModelBox(bone61, 101, 98, -9.0288F, 0.0072F, -3.1772F, 4, 3, 1, 0.0F, false));

		bone52 = new ModelRenderer(this);
		bone52.setRotationPoint(-0.5F, -7.0F, -5.0F);
		helmet.addChild(bone52);
		setRotationAngle(bone52, -0.2618F, -0.3927F, 0.0F);
		bone52.cubeList.add(new ModelBox(bone52, 26, 70, 1.5813F, -0.6071F, -0.8849F, 3, 3, 1, 0.0F, false));

		bone62 = new ModelRenderer(this);
		bone62.setRotationPoint(-0.5F, -7.0F, -8.0F);
		helmet.addChild(bone62);
		setRotationAngle(bone62, -0.2618F, -1.5272F, 0.0F);
		bone62.cubeList.add(new ModelBox(bone62, 58, 101, 4.0092F, 0.2802F, -4.1962F, 4, 3, 1, 0.0F, false));

		bone82 = new ModelRenderer(this);
		bone82.setRotationPoint(0.0F, 24.0F, 1.75F);
		helmet.addChild(bone82);
		bone82.cubeList.add(new ModelBox(bone82, 40, 90, -2.0F, -32.0F, 2.0F, 4, 5, 2, 0.0F, false));

		bone81 = new ModelRenderer(this);
		bone81.setRotationPoint(0.0F, -29.0F, 3.0F);
		bone82.addChild(bone81);
		setRotationAngle(bone81, 0.0F, 0.3927F, 0.0F);
		bone81.cubeList.add(new ModelBox(bone81, 96, 33, 1.4651F, -3.0F, -0.3108F, 3, 5, 2, 0.0F, false));

		bone80 = new ModelRenderer(this);
		bone80.setRotationPoint(0.0F, -29.0F, 3.0F);
		bone82.addChild(bone80);
		setRotationAngle(bone80, 0.0F, -0.3927F, 0.0F);
		bone80.cubeList.add(new ModelBox(bone80, 38, 97, -4.4651F, -3.0F, -0.3108F, 3, 5, 2, 0.0F, false));

		bone86 = new ModelRenderer(this);
		bone86.setRotationPoint(0.0F, 8.4167F, 16.5833F);
		helmet.addChild(bone86);
		setRotationAngle(bone86, 0.7854F, 0.0F, 0.0F);
		bone86.cubeList.add(new ModelBox(bone86, 95, 6, -2.0F, -21.6667F, 2.1667F, 4, 2, 2, 0.0F, false));

		bone87 = new ModelRenderer(this);
		bone87.setRotationPoint(0.0F, -18.6667F, 3.1667F);
		bone86.addChild(bone87);
		setRotationAngle(bone87, 0.0F, 0.3927F, 0.0F);
		bone87.cubeList.add(new ModelBox(bone87, 20, 99, 1.4651F, -3.0F, -0.3108F, 3, 2, 2, 0.0F, false));

		bone88 = new ModelRenderer(this);
		bone88.setRotationPoint(0.0F, -18.6667F, 3.1667F);
		bone86.addChild(bone88);
		setRotationAngle(bone88, 0.0F, -0.3927F, 0.0F);
		bone88.cubeList.add(new ModelBox(bone88, 36, 78, -4.4651F, -3.0F, -0.3108F, 3, 2, 2, 0.0F, false));

		bone83 = new ModelRenderer(this);
		bone83.setRotationPoint(0.0F, 14.8333F, -0.5833F);
		helmet.addChild(bone83);
		setRotationAngle(bone83, -0.1309F, 0.0F, 0.0F);
		bone83.cubeList.add(new ModelBox(bone83, 96, 46, -2.0F, -18.3333F, 1.8333F, 4, 2, 2, 0.0F, false));

		bone84 = new ModelRenderer(this);
		bone84.setRotationPoint(0.0F, -18.3333F, 2.8333F);
		bone83.addChild(bone84);
		setRotationAngle(bone84, 0.0F, 0.3927F, 0.0F);
		bone84.cubeList.add(new ModelBox(bone84, 28, 52, 1.4651F, 0.0F, -0.3108F, 2, 2, 2, 0.0F, false));

		bone85 = new ModelRenderer(this);
		bone85.setRotationPoint(0.0F, -18.3333F, 2.8333F);
		bone83.addChild(bone85);
		setRotationAngle(bone85, 0.0F, -0.3927F, 0.0F);
		bone85.cubeList.add(new ModelBox(bone85, 12, 50, -3.4651F, 0.0F, -0.3108F, 2, 2, 2, 0.0F, false));

		bone58 = new ModelRenderer(this);
		bone58.setRotationPoint(3.75F, -4.0F, -2.0F);
		helmet.addChild(bone58);
		setRotationAngle(bone58, 0.0F, 0.1745F, 0.0F);
		

		bone78 = new ModelRenderer(this);
		bone78.setRotationPoint(4.5F, -8.5F, -1.5F);
		helmet.addChild(bone78);
		setRotationAngle(bone78, 0.0F, -0.1309F, -0.3927F);
		bone78.cubeList.add(new ModelBox(bone78, 102, 102, -0.5F, -1.0F, -1.5F, 1, 2, 3, 0.0F, false));

		bone79 = new ModelRenderer(this);
		bone79.setRotationPoint(-4.5F, -8.5F, -1.75F);
		helmet.addChild(bone79);
		setRotationAngle(bone79, 0.0F, 0.1309F, 0.3927F);
		bone79.cubeList.add(new ModelBox(bone79, 89, 102, -0.5392F, -1.0F, -1.2026F, 1, 2, 3, 0.0F, false));

		bone40 = new ModelRenderer(this);
		bone40.setRotationPoint(4.25F, -1.25F, -0.25F);
		helmet.addChild(bone40);
		setRotationAngle(bone40, 0.0873F, 0.0F, 0.0F);
		bone40.cubeList.add(new ModelBox(bone40, 34, 62, -0.4999F, -1.0F, -4.0F, 1, 2, 8, 0.0F, false));

		bone42 = new ModelRenderer(this);
		bone42.setRotationPoint(4.25F, -4.25F, 1.25F);
		helmet.addChild(bone42);
		setRotationAngle(bone42, 0.8727F, 0.0F, 0.0F);
		bone42.cubeList.add(new ModelBox(bone42, 73, 103, -0.499F, -1.0F, -4.0F, 1, 2, 3, 0.0F, false));

		bone43 = new ModelRenderer(this);
		bone43.setRotationPoint(-4.25F, -4.25F, 1.25F);
		helmet.addChild(bone43);
		setRotationAngle(bone43, 0.8727F, 0.0F, 0.0F);
		bone43.cubeList.add(new ModelBox(bone43, 68, 101, -0.501F, -1.0F, -4.0F, 1, 2, 3, 0.0F, false));

		bone44 = new ModelRenderer(this);
		bone44.setRotationPoint(4.25F, -7.25F, 0.75F);
		helmet.addChild(bone44);
		setRotationAngle(bone44, 0.8727F, 0.0F, 0.0F);
		

		bone41 = new ModelRenderer(this);
		bone41.setRotationPoint(-4.25F, -1.25F, -0.25F);
		helmet.addChild(bone41);
		setRotationAngle(bone41, 0.0873F, 0.0F, 0.0F);
		bone41.cubeList.add(new ModelBox(bone41, 24, 60, -0.5001F, -1.0F, -4.0F, 1, 2, 8, 0.0F, false));

		bone45 = new ModelRenderer(this);
		bone45.setRotationPoint(-4.25F, -7.25F, 0.5F);
		helmet.addChild(bone45);
		setRotationAngle(bone45, 0.8727F, 0.0F, 0.0F);
		bone45.cubeList.add(new ModelBox(bone45, 24, 16, -0.51F, -1.8393F, -2.1915F, 1, 3, 2, 0.0F, false));

		bone54 = new ModelRenderer(this);
		bone54.setRotationPoint(4.25F, -7.25F, 0.5F);
		helmet.addChild(bone54);
		setRotationAngle(bone54, 0.8727F, 0.0F, 0.0F);
		bone54.cubeList.add(new ModelBox(bone54, 24, 0, -0.49F, -1.8393F, -2.1915F, 1, 3, 2, 0.0F, false));

		bone89 = new ModelRenderer(this);
		bone89.setRotationPoint(0.0F, -10.25F, 0.0F);
		helmet.addChild(bone89);
		setRotationAngle(bone89, -0.1745F, 0.0F, 0.0F);
		bone89.cubeList.add(new ModelBox(bone89, 99, 94, -1.0F, -0.5F, -1.5F, 2, 1, 3, 0.0F, false));

		mandible = new ModelRenderer(this);
		mandible.setRotationPoint(0.0F, 0.25F, -0.5F);
		helmet.addChild(mandible);
		

		bone35 = new ModelRenderer(this);
		bone35.setRotationPoint(0.0F, -0.75F, -4.75F);
		mandible.addChild(bone35);
		setRotationAngle(bone35, 0.2182F, 0.0F, 0.0F);
		bone35.cubeList.add(new ModelBox(bone35, 0, 25, -1.0F, -1.7559F, -0.5541F, 2, 3, 1, 0.0F, false));

		bone37 = new ModelRenderer(this);
		bone37.setRotationPoint(-1.5F, -0.75F, -4.5F);
		mandible.addChild(bone37);
		setRotationAngle(bone37, 0.2182F, 0.2618F, 0.1745F);
		bone37.cubeList.add(new ModelBox(bone37, 45, 107, -2.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));

		bone39 = new ModelRenderer(this);
		bone39.setRotationPoint(-1.75F, -0.75F, -5.5F);
		mandible.addChild(bone39);
		setRotationAngle(bone39, 0.6109F, 0.6545F, 0.3927F);
		bone39.cubeList.add(new ModelBox(bone39, 47, 4, -3.7837F, -1.014F, -0.7182F, 2, 2, 1, 0.0F, false));

		bone36 = new ModelRenderer(this);
		bone36.setRotationPoint(1.5F, -0.75F, -4.5F);
		mandible.addChild(bone36);
		setRotationAngle(bone36, 0.2182F, -0.2618F, -0.1745F);
		bone36.cubeList.add(new ModelBox(bone36, 103, 107, -1.0F, -1.0F, -0.5F, 3, 2, 1, 0.0F, false));

		bone38 = new ModelRenderer(this);
		bone38.setRotationPoint(1.5F, -0.75F, -5.5F);
		mandible.addChild(bone38);
		setRotationAngle(bone38, 0.6109F, -0.6545F, -0.3927F);
		bone38.cubeList.add(new ModelBox(bone38, 56, 69, 1.967F, -1.0162F, -0.8883F, 2, 2, 1, 0.0F, false));

		forehead = new ModelRenderer(this);
		forehead.setRotationPoint(0.0F, 24.25F, 0.0F);
		helmet.addChild(forehead);
		

		bone47 = new ModelRenderer(this);
		bone47.setRotationPoint(4.25F, -31.5F, 0.5F);
		forehead.addChild(bone47);
		setRotationAngle(bone47, 1.0908F, 0.2618F, -0.1309F);
		bone47.cubeList.add(new ModelBox(bone47, 64, 47, 0.1455F, -4.0578F, -1.6998F, 1, 2, 2, 0.0F, false));

		bone56 = new ModelRenderer(this);
		bone56.setRotationPoint(-0.5F, -32.5F, -5.0F);
		forehead.addChild(bone56);
		setRotationAngle(bone56, -0.48F, -0.3927F, 0.1745F);
		bone56.cubeList.add(new ModelBox(bone56, 52, 74, 1.7331F, -0.7604F, -1.0093F, 3, 1, 1, 0.0F, false));

		bone55 = new ModelRenderer(this);
		bone55.setRotationPoint(-0.5F, -32.5F, -5.0F);
		forehead.addChild(bone55);
		setRotationAngle(bone55, -0.48F, 0.0F, 0.0F);
		bone55.cubeList.add(new ModelBox(bone55, 89, 33, -1.0F, -0.7927F, -0.192F, 3, 1, 1, 0.0F, false));

		bone57 = new ModelRenderer(this);
		bone57.setRotationPoint(-0.5F, -32.5F, -5.0F);
		forehead.addChild(bone57);
		setRotationAngle(bone57, -0.48F, 0.3927F, -0.1745F);
		bone57.cubeList.add(new ModelBox(bone57, 16, 68, -3.8233F, -0.7804F, -0.5948F, 3, 1, 1, 0.0F, false));

		bone46 = new ModelRenderer(this);
		bone46.setRotationPoint(-7.25F, -31.5F, 0.5F);
		forehead.addChild(bone46);
		setRotationAngle(bone46, 1.0908F, -0.2618F, 0.1309F);
		bone46.cubeList.add(new ModelBox(bone46, 73, 30, 1.7275F, -4.9214F, -1.7079F, 1, 2, 2, 0.0F, false));

		forehead2 = new ModelRenderer(this);
		forehead2.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.addChild(forehead2);
		setRotationAngle(forehead2, -0.3927F, 0.0F, 0.0F);
		

		bone63 = new ModelRenderer(this);
		bone63.setRotationPoint(4.25F, -31.25F, 0.5F);
		forehead2.addChild(bone63);
		setRotationAngle(bone63, 1.0908F, 0.2618F, 0.0F);
		

		bone64 = new ModelRenderer(this);
		bone64.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead2.addChild(bone64);
		setRotationAngle(bone64, -0.48F, -0.3927F, 0.1745F);
		bone64.cubeList.add(new ModelBox(bone64, 62, 6, -2.2329F, 7.4154F, -9.3212F, 3, 1, 1, 0.0F, false));

		bone65 = new ModelRenderer(this);
		bone65.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead2.addChild(bone65);
		setRotationAngle(bone65, -0.48F, 0.0F, 0.0F);
		bone65.cubeList.add(new ModelBox(bone65, 18, 44, -1.0F, 7.7388F, -9.0732F, 3, 1, 1, 0.0F, false));

		bone66 = new ModelRenderer(this);
		bone66.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead2.addChild(bone66);
		setRotationAngle(bone66, -0.48F, 0.3927F, -0.1745F);
		bone66.cubeList.add(new ModelBox(bone66, 22, 36, 0.1427F, 7.3954F, -8.9068F, 3, 1, 1, 0.0F, false));

		bone67 = new ModelRenderer(this);
		bone67.setRotationPoint(-7.25F, -31.25F, 0.5F);
		forehead2.addChild(bone67);
		setRotationAngle(bone67, 1.0908F, -0.2618F, 0.0F);
		

		forehead3 = new ModelRenderer(this);
		forehead3.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.addChild(forehead3);
		setRotationAngle(forehead3, -0.7854F, 0.0F, 0.0F);
		

		bone68 = new ModelRenderer(this);
		bone68.setRotationPoint(4.25F, -31.25F, 0.5F);
		forehead3.addChild(bone68);
		setRotationAngle(bone68, 1.0908F, 0.2618F, 0.0F);
		

		bone69 = new ModelRenderer(this);
		bone69.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead3.addChild(bone69);
		setRotationAngle(bone69, -0.48F, -0.3927F, 0.1745F);
		bone69.cubeList.add(new ModelBox(bone69, 37, 107, -4.6639F, 17.492F, -14.1234F, 3, 2, 1, 0.0F, false));

		bone70 = new ModelRenderer(this);
		bone70.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead3.addChild(bone70);
		setRotationAngle(bone70, -0.48F, 0.0F, 0.0F);
		bone70.cubeList.add(new ModelBox(bone70, 106, 45, -1.0F, 18.0196F, -14.0135F, 3, 2, 1, 0.0F, false));

		bone71 = new ModelRenderer(this);
		bone71.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead3.addChild(bone71);
		setRotationAngle(bone71, -0.48F, 0.3927F, -0.1745F);
		bone71.cubeList.add(new ModelBox(bone71, 48, 47, 2.5737F, 17.472F, -13.709F, 3, 2, 1, 0.0F, false));

		bone72 = new ModelRenderer(this);
		bone72.setRotationPoint(-7.25F, -31.25F, 0.5F);
		forehead3.addChild(bone72);
		setRotationAngle(bone72, 1.0908F, -0.2618F, 0.0F);
		

		forehead4 = new ModelRenderer(this);
		forehead4.setRotationPoint(0.0F, 24.0F, 0.0F);
		helmet.addChild(forehead4);
		setRotationAngle(forehead4, -1.1781F, 0.0F, 0.0F);
		

		bone73 = new ModelRenderer(this);
		bone73.setRotationPoint(4.25F, -31.25F, 0.5F);
		forehead4.addChild(bone73);
		setRotationAngle(bone73, 1.0908F, 0.2618F, 0.0F);
		

		bone74 = new ModelRenderer(this);
		bone74.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead4.addChild(bone74);
		setRotationAngle(bone74, -0.48F, -0.3927F, 0.1745F);
		bone74.cubeList.add(new ModelBox(bone74, 0, 36, -5.3161F, 24.8451F, -15.0077F, 3, 6, 1, 0.0F, false));

		bone75 = new ModelRenderer(this);
		bone75.setRotationPoint(0.0F, -3.8417F, -19.1434F);
		forehead4.addChild(bone75);
		setRotationAngle(bone75, -0.4363F, 0.0F, 0.0F);
		bone75.cubeList.add(new ModelBox(bone75, 0, 16, -1.5F, -6.9842F, -15.1871F, 3, 6, 1, 0.0F, false));

		bone76 = new ModelRenderer(this);
		bone76.setRotationPoint(-0.5F, -32.25F, -5.0F);
		forehead4.addChild(bone76);
		setRotationAngle(bone76, -0.48F, 0.3927F, -0.1745F);
		bone76.cubeList.add(new ModelBox(bone76, 0, 0, 3.226F, 24.8251F, -14.5932F, 3, 6, 1, 0.0F, false));

		this.bipedHead.addChild(helmet);
		this.bipedBody.addChild(torso_piece);
//		this.bipedBody.addChild(vest);
		this.bipedLeftArm.addChild(arm_left);
		this.bipedRightArm.addChild(arm_right);
		this.bipedLeftLeg.addChild(leg_left);
		this.bipedRightLeg.addChild(leg_right);
		
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
