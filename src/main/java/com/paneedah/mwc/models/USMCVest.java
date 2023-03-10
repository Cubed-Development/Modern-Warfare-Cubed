package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class USMCVest extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer jacket;
	private final ModelRenderer jacket1;
	private final ModelRenderer jacket2;
	private final ModelRenderer jacket3;
	private final ModelRenderer jacket4;
	private final ModelRenderer jacket5;
	private final ModelRenderer jacket6;
	private final ModelRenderer jacket7;
	private final ModelRenderer leftleg_usmc;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg4;
	private final ModelRenderer leftleg5;
	private final ModelRenderer rightleg_usmc;
	private final ModelRenderer rightleg1;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer rightleg4;
	private final ModelRenderer leftarm_usmc;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer leftarm4;
	private final ModelRenderer leftarm5;
	private final ModelRenderer leftarm6;
	private final ModelRenderer leftarm7;
	private final ModelRenderer rightarm_usmc;
	private final ModelRenderer rightarm1;
	private final ModelRenderer rightarm2;
	private final ModelRenderer rightarm3;
	private final ModelRenderer rightarm4;
	private final ModelRenderer rightarm5;
	private final ModelRenderer rightarm6;
	private final ModelRenderer rightarm7;
	private final ModelRenderer helmet;
	private final ModelRenderer bone;
	private final ModelRenderer bone16;
	private final ModelRenderer bone2;
	private final ModelRenderer bone14;
	private final ModelRenderer bone10;
	private final ModelRenderer bone18;
	private final ModelRenderer bone15;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer vest;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;

      public USMCVest()
      {
        textureWidth = 128;
        textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 46, 47, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 0, 46, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 34, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 18, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		jacket1 = new ModelRenderer(this);
		jacket1.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket1);
		setRotationAngle(jacket1, 0.0F, -0.1047F, -0.0175F);
		jacket1.cubeList.add(new ModelBox(jacket1, 0, 73, -0.0418F, 0.85F, -2.58F, 4, 12, 1, 0.0F, false));

		jacket2 = new ModelRenderer(this);
		jacket2.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket2);
		setRotationAngle(jacket2, 0.0F, 0.0349F, 0.0349F);
		jacket2.cubeList.add(new ModelBox(jacket2, 42, 63, -3.93F, 0.8411F, -2.294F, 5, 12, 1, 0.0F, false));

		jacket3 = new ModelRenderer(this);
		jacket3.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket3);
		setRotationAngle(jacket3, -0.2094F, -0.1047F, 0.0F);
		jacket3.cubeList.add(new ModelBox(jacket3, 34, 68, 0.9791F, 0.4113F, -2.36F, 3, 1, 1, 0.0F, false));

		jacket4 = new ModelRenderer(this);
		jacket4.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket4);
		setRotationAngle(jacket4, 0.0F, -0.0524F, -0.0175F);
		jacket4.cubeList.add(new ModelBox(jacket4, 58, 59, 3.1F, -0.0483F, -2.1973F, 1, 13, 4, 0.0F, false));

		jacket5 = new ModelRenderer(this);
		jacket5.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket5);
		setRotationAngle(jacket5, 0.0F, 0.0524F, 0.0175F);
		jacket5.cubeList.add(new ModelBox(jacket5, 32, 51, -4.1135F, -0.1226F, -2.1748F, 1, 13, 4, 0.0F, false));

		jacket6 = new ModelRenderer(this);
		jacket6.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket6);
		setRotationAngle(jacket6, -0.1047F, 0.0349F, 0.0349F);
		jacket6.cubeList.add(new ModelBox(jacket6, 64, 61, -3.9195F, 0.1396F, -2.2031F, 3, 1, 1, 0.0F, false));

		jacket7 = new ModelRenderer(this);
		jacket7.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket7);
		setRotationAngle(jacket7, 0.0175F, 0.0F, 0.0F);
		jacket7.cubeList.add(new ModelBox(jacket7, 0, 32, -4.0F, -0.1191F, 1.0911F, 8, 13, 1, 0.0F, false));

		leftleg_usmc = new ModelRenderer(this);
		leftleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg1);
		setRotationAngle(leftleg1, 0.0F, -0.0524F, 0.0349F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 60, 76, 1.27F, -0.0955F, -2.1F, 1, 6, 4, 0.0F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.0F, -0.0349F, -0.0349F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 81, 0, 0.9226F, 3.9944F, -2.0509F, 1, 5, 4, 0.0F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg3);
		setRotationAngle(leftleg3, 0.0F, 0.0F, 0.0349F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 50, 72, -2.0965F, -0.0032F, -2.03F, 1, 9, 4, 0.0F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 62, 22, -1.9535F, -0.0531F, -2.1786F, 4, 9, 3, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 68, 68, -2.0535F, -0.054F, 0.2214F, 4, 9, 2, 0.0F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_usmc.addChild(leftleg5);
		setRotationAngle(leftleg5, -0.1222F, -0.1047F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 91, 41, -2.1928F, 11.1268F, -0.9835F, 4, 1, 1, 0.0F, false));

		rightleg_usmc = new ModelRenderer(this);
		rightleg_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg1);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 16, 51, -2.0F, -0.01F, -2.14F, 4, 9, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 76, 21, -2.0F, -0.011F, 1.2F, 4, 9, 1, 0.0F, false));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg2);
		setRotationAngle(rightleg2, 0.0F, 0.0F, 0.0524F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 80, 81, -2.0948F, 0.0999F, -2.0F, 1, 5, 4, 0.0F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg3);
		setRotationAngle(rightleg3, 0.0F, 0.0F, -0.0175F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 44, 82, -2.3855F, 4.95F, -2.0F, 1, 4, 4, 0.0F, false));
		rightleg3.cubeList.add(new ModelBox(rightleg3, 28, 68, 1.1F, -0.0459F, -2.0F, 1, 9, 4, 0.0F, false));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_usmc.addChild(rightleg4);
		setRotationAngle(rightleg4, -0.1222F, 0.1047F, 0.0F);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 91, 13, -1.8F, 11.1314F, -1.0206F, 4, 1, 1, 0.0F, false));

		leftarm_usmc = new ModelRenderer(this);
		leftarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm1);
		setRotationAngle(leftarm1, 0.0F, 0.0F, -0.0524F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 70, 81, 2.2489F, -1.75F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 60, 86, -1.4477F, 3.0282F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 0.0F, 0.0349F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 28, 81, -1.1508F, -1.863F, -2.0F, 1, 5, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 34, 86, 2.5216F, 2.97F, -2.0F, 1, 2, 4, 0.0F, false));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm3);
		setRotationAngle(leftarm3, -0.0175F, -0.0698F, 0.0F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 86, 20, -1.1523F, -1.8719F, -2.2856F, 4, 5, 1, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.0698F, -0.0524F, 0.0F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 90, 34, -1.1F, 2.9234F, -2.5902F, 4, 2, 1, 0.0F, false));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm5);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 10, 84, -1.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 91, 3, -1.0F, 5.05F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 90, 52, -1.0F, 7.55F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 90, 91, -1.0F, 5.05F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 90, 37, -1.0F, 7.55F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 89, 44, -1.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 86, 86, -1.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 22, 89, 2.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 52, 9, 2.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));

		leftarm6 = new ModelRenderer(this);
		leftarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm6);
		setRotationAngle(leftarm6, 0.0F, 0.0F, 0.0873F);
		leftarm6.cubeList.add(new ModelBox(leftarm6, 38, 51, 2.9055F, 8.8926F, -1.5F, 1, 1, 3, 0.0F, false));
		leftarm6.cubeList.add(new ModelBox(leftarm6, 28, 51, -0.4953F, 7.8851F, -1.9F, 1, 1, 3, 0.0F, false));

		leftarm7 = new ModelRenderer(this);
		leftarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_usmc.addChild(leftarm7);
		setRotationAngle(leftarm7, 0.0F, 0.0F, 0.0349F);
		leftarm7.cubeList.add(new ModelBox(leftarm7, 71, 44, -1.0684F, -2.1712F, -2.01F, 4, 1, 4, 0.0F, false));

		rightarm_usmc = new ModelRenderer(this);
		rightarm_usmc.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm1);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 80, 91, -3.0F, 5.05F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 66, -3.0F, 7.55F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 68, -3.0F, 5.05F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 64, -3.0F, 7.55F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 78, 31, -3.0F, -1.95F, 1.2F, 4, 7, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 10, 73, 0.2F, -1.95F, -2.0F, 1, 7, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 87, 5, -3.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 86, 59, -3.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 86, 77, 0.1F, 5.05F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 86, 26, 0.1F, 7.55F, -2.0F, 1, 1, 4, 0.0F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm2);
		setRotationAngle(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 80, 61, -3.1893F, -1.7398F, -2.0F, 1, 5, 4, 0.0F, false));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm3);
		setRotationAngle(rightarm3, 0.0F, 0.0F, -0.0524F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 84, 35, -3.5726F, 2.9014F, -2.0F, 1, 2, 4, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0349F, 0.0349F, 0.0F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 0, 86, -2.93F, -1.8591F, -2.3035F, 4, 5, 1, 0.0F, false));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm5);
		setRotationAngle(rightarm5, 0.0349F, 0.1047F, 0.0F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 70, 90, -2.78F, 2.9806F, -2.5493F, 4, 2, 1, 0.0F, false));

		rightarm6 = new ModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm6);
		setRotationAngle(rightarm6, 0.0F, 0.0F, -0.0873F);
		rightarm6.cubeList.add(new ModelBox(rightarm6, 50, 39, -0.5F, 7.9063F, -1.9F, 1, 1, 3, 0.0F, false));
		rightarm6.cubeList.add(new ModelBox(rightarm6, 30, 35, -3.9F, 8.9F, -1.5F, 1, 1, 3, 0.0F, false));

		rightarm7 = new ModelRenderer(this);
		rightarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_usmc.addChild(rightarm7);
		setRotationAngle(rightarm7, 0.0F, 0.0F, -0.0349F);
		rightarm7.cubeList.add(new ModelBox(rightarm7, 71, 16, -2.9437F, -2.2486F, -2.01F, 4, 1, 4, 0.0F, false));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone);
		setRotationAngle(bone, -0.2443F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 32, 9, -4.0F, -6.9093F, -6.0678F, 8, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 12, 46, -1.0F, -7.0121F, -6.3595F, 2, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 64, 59, -1.5F, -5.0849F, -6.4807F, 3, 1, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone16);
		setRotationAngle(bone16, 0.1571F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 58, 0, -4.0F, -7.4229F, 3.4514F, 8, 5, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2094F);
		bone2.cubeList.add(new ModelBox(bone2, 50, 36, 4.746F, -7.1F, -4.0F, 1, 3, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 60, 36, 4.7462F, -4.7514F, 2.0F, 1, 3, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 76, 54, 5.0165F, -6.023F, -2.8F, 1, 2, 5, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone14);
		setRotationAngle(bone14, -0.0873F, 0.0F, 0.0349F);
		bone14.cubeList.add(new ModelBox(bone14, 41, 90, 3.7095F, -5.2174F, -2.4267F, 1, 3, 3, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 16, 51, 4.0848F, -6.0241F, -1.3931F, 1, 2, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone10);
		setRotationAngle(bone10, 0.4189F, 0.1047F, 0.0349F);
		bone10.cubeList.add(new ModelBox(bone10, 20, 16, 4.3965F, -3.6503F, -3.0403F, 1, 1, 3, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone18);
		setRotationAngle(bone18, 0.2618F, -0.2967F, -0.192F);
		bone18.cubeList.add(new ModelBox(bone18, 0, 6, 0.5022F, -2.7282F, -5.6578F, 3, 1, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone15);
		setRotationAngle(bone15, -0.0873F, 0.0F, -0.0349F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -4.6605F, -5.2263F, -2.4267F, 1, 3, 3, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 58, 9, -5.0F, -6.033F, -1.3931F, 1, 2, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone3);
		setRotationAngle(bone3, 0.2967F, 0.0F, -0.2094F);
		bone3.cubeList.add(new ModelBox(bone3, 45, 0, 4.9357F, -5.0554F, 2.0675F, 1, 4, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone5);
		setRotationAngle(bone5, 0.2967F, 0.0F, 0.2094F);
		bone5.cubeList.add(new ModelBox(bone5, 24, 0, -5.9108F, -5.0629F, 2.0809F, 1, 4, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 24, 0, -3.5F, -8.9F, -3.49F, 7, 1, 7, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 69, 41, -3.5F, -3.8F, -8.76F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 24, 22, -3.5F, -8.7497F, -3.8103F, 7, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 62, 44, -3.85F, -8.75F, -3.5F, 1, 1, 7, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 60, 36, -8.75F, -3.871F, -3.5F, 1, 1, 7, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.2094F);
		bone4.cubeList.add(new ModelBox(bone4, 47, 14, -5.7362F, -7.1F, -4.0F, 1, 3, 8, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 20, 76, -5.9319F, -6.023F, -2.8F, 1, 2, 5, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 92, -5.7262F, -4.7544F, 2.0F, 1, 3, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone8);
		setRotationAngle(bone8, -0.1571F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 42, 55, -4.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 18, 32, 3.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 0, 46, 3.2F, -4.2659F, 2.743F, 1, 2, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 25, 16, -4.2F, -4.2659F, 2.743F, 1, 2, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone9);
		setRotationAngle(bone9, 0.192F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 46, 27, -4.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 47, 25, -2.5F, -1.9616F, -4.14F, 5, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 44, 0, 1.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));

		vest = new ModelRenderer(this);
		vest.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.cubeList.add(new ModelBox(vest, 38, 76, -2.0F, 1.3F, -3.25F, 4, 9, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 83, 41, -1.5F, 6.2F, -4.95F, 3, 5, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 88, 31, -1.6F, 6.8F, -5.05F, 3, 1, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 86, 10, -1.6F, 8.3F, -5.05F, 3, 1, 2, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 83, 54, -2.5F, 2.0F, -3.45F, 5, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 24, 24, -4.5F, 4.0F, -2.5F, 9, 6, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 29, 13, -5.0F, 3.5F, -1.5F, 10, 6, 3, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 0, 62, -3.5F, 0.2F, 1.8F, 7, 10, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 46, 36, -2.0F, 9.9F, -3.0F, 5, 2, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 58, 47, -2.0F, 11.9F, -2.7F, 4, 3, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 57, 9, -4.6F, 9.8F, -2.8F, 5, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 69, 34, 2.6F, 9.8F, -2.6F, 2, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 57, 16, -4.1F, 9.8F, 1.6F, 8, 2, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.192F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 54, 85, 1.3523F, 1.3F, -3.5654F, 2, 9, 1, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 84, 70, 0.8903F, 6.2F, -5.0868F, 3, 5, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 87, 0, 0.9693F, 6.8F, -5.2041F, 3, 1, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 57, 19, 0.9693F, 8.3F, -5.2041F, 3, 1, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.192F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 20, 83, -3.3423F, 1.3F, -3.5754F, 2, 9, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 83, 13, -3.9278F, 6.2F, -5.0874F, 3, 5, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 88, 49, -4.0069F, 6.7F, -5.2046F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 86, 82, -4.0069F, 8.2F, -5.2046F, 3, 1, 2, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 68, 59, -5.7718F, 6.2F, -3.1308F, 2, 5, 4, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone21);
		setRotationAngle(bone21, -0.2618F, -0.192F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 78, 0, 1.3731F, 0.2132F, -3.107F, 2, 2, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 24, 24, 1.9423F, 0.0511F, -3.2747F, 1, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone22);
		setRotationAngle(bone22, -0.2618F, 0.192F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 77, 13, -3.3169F, 0.2166F, -3.1199F, 2, 2, 1, 0.0F, false));
		bone22.cubeList.add(new ModelBox(bone22, 0, 16, -2.8677F, -0.0268F, -3.239F, 1, 3, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone23);
		setRotationAngle(bone23, 0.0F, -0.1745F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 75, 75, 1.4F, -0.6F, -2.9199F, 2, 1, 5, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.1745F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 72, 7, -3.35F, -0.6F, -2.9482F, 2, 1, 5, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone25);
		setRotationAngle(bone25, -0.733F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 66, 7, -2.0F, 2.1363F, -2.2526F, 4, 1, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone26);
		setRotationAngle(bone26, -1.4661F, 0.0F, 0.3316F);
		bone26.cubeList.add(new ModelBox(bone26, 76, 50, -0.6482F, 3.1437F, 1.5609F, 5, 2, 2, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 50, 9, -0.4529F, 3.0041F, 3.146F, 2, 2, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone27);
		setRotationAngle(bone27, 0.0349F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 16, 64, -2.5F, 0.5117F, 2.3347F, 5, 10, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 62, 52, -3.0F, 6.1183F, 1.5136F, 6, 5, 2, 0.0F, false));
		
//		this.bipedHead.addChild(helmet);
//		this.bipedBody.addChild(jacket);
//		this.bipedBody.addChild(vest);
//		this.bipedLeftArm.addChild(leftarm_usmc);
//		this.bipedRightArm.addChild(rightarm_usmc);
//		this.bipedLeftLeg.addChild(leftleg_usmc);
//		this.bipedRightLeg.addChild(rightleg_usmc);
		
		bipedLeftArm.isHidden = true;
		bipedRightArm.isHidden = true;
		bipedBody = vest;
		bipedLeftLeg.isHidden = true;
		bipedRightLeg.isHidden = true;
		bipedHead.isHidden = true;
		bipedHeadwear.isHidden = true;
		
    }

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		if(entity != null) {
//			super.render(entity, f, f1, f2, f3, f4, f5);
//		} else vest.render(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
//		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
//		vest.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
