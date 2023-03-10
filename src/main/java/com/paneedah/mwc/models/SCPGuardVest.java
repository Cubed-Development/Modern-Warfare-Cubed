package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class SCPGuardVest extends ModelBase {
	private final ModelRenderer head;
//	private final ModelRenderer body;
//	private final ModelRenderer rightarm;
//	private final ModelRenderer leftarm;
//	private final ModelRenderer rightleg;
//	private final ModelRenderer leftleg;
	private final ModelRenderer jacket;
	private final ModelRenderer jacket1;
	private final ModelRenderer jacket2;
	private final ModelRenderer jacket3;
	private final ModelRenderer jacket4;
	private final ModelRenderer jacket5;
	private final ModelRenderer jacket6;
	private final ModelRenderer jacket7;
	private final ModelRenderer leftleg_scp;
	private final ModelRenderer leftleg1;
	private final ModelRenderer leftleg2;
	private final ModelRenderer leftleg3;
	private final ModelRenderer leftleg4;
	private final ModelRenderer leftleg5;
	private final ModelRenderer rightleg_scp;
	private final ModelRenderer rightleg1;
	private final ModelRenderer bone18;
	private final ModelRenderer rightleg2;
	private final ModelRenderer rightleg3;
	private final ModelRenderer rightleg4;
	private final ModelRenderer leftarm_scp;
	private final ModelRenderer leftarm1;
	private final ModelRenderer leftarm2;
	private final ModelRenderer leftarm3;
	private final ModelRenderer leftarm4;
	private final ModelRenderer leftarm5;
	private final ModelRenderer leftarm6;
	private final ModelRenderer leftarm7;
	private final ModelRenderer rightarm_scp;
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
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone4;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone7;
	private final ModelRenderer bone10;
	private final ModelRenderer bone14;
	private final ModelRenderer vest;
	private final ModelRenderer bone17;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone15;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;
	private final ModelRenderer bone27;

	public SCPGuardVest()
    {
      textureWidth = 128;
      textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

//		bipedBody = new ModelRenderer(this);
//		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
//		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));
//
//		bipedRightArm = new ModelRenderer(this);
//		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
//		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 0, 46, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
//
//		bipedLeftArm = new ModelRenderer(this);
//		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
//		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 34, 35, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
//
//		bipedRightLeg = new ModelRenderer(this);
//		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
//		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 18, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
//
//		bipedLeftLeg = new ModelRenderer(this);
//		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
//		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 32, 8, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		jacket = new ModelRenderer(this);
		jacket.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		jacket1 = new ModelRenderer(this);
		jacket1.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket1);
		setRotationAngle(jacket1, 0.0F, -0.1047F, -0.0175F);
		jacket1.cubeList.add(new ModelBox(jacket1, 22, 69, -0.0418F, 0.85F, -2.58F, 4, 12, 1, 0.0F, false));

		jacket2 = new ModelRenderer(this);
		jacket2.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket2);
		setRotationAngle(jacket2, 0.0F, 0.0349F, 0.0349F);
		jacket2.cubeList.add(new ModelBox(jacket2, 0, 62, -3.93F, 0.8411F, -2.294F, 5, 12, 1, 0.0F, false));

		jacket3 = new ModelRenderer(this);
		jacket3.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket3);
		setRotationAngle(jacket3, -0.2094F, -0.1047F, 0.0F);
		jacket3.cubeList.add(new ModelBox(jacket3, 95, 71, -0.0209F, 0.4113F, -2.36F, 4, 1, 1, 0.0F, false));

		jacket4 = new ModelRenderer(this);
		jacket4.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket4);
		setRotationAngle(jacket4, 0.0F, -0.0524F, -0.0175F);
		jacket4.cubeList.add(new ModelBox(jacket4, 58, 58, 3.1F, -0.0483F, -2.1973F, 1, 13, 4, 0.0F, false));

		jacket5 = new ModelRenderer(this);
		jacket5.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket5);
		setRotationAngle(jacket5, 0.0F, 0.0524F, 0.0175F);
		jacket5.cubeList.add(new ModelBox(jacket5, 48, 52, -4.1135F, -0.1226F, -2.1748F, 1, 13, 4, 0.0F, false));

		jacket6 = new ModelRenderer(this);
		jacket6.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket6);
		setRotationAngle(jacket6, -0.1047F, 0.0349F, 0.0349F);
		jacket6.cubeList.add(new ModelBox(jacket6, 94, 4, -3.9195F, 0.1396F, -2.2031F, 5, 1, 1, 0.0F, false));

		jacket7 = new ModelRenderer(this);
		jacket7.setRotationPoint(0.0F, -24.0F, 0.0F);
		jacket.addChild(jacket7);
		setRotationAngle(jacket7, 0.0175F, 0.0F, 0.0F);
		jacket7.cubeList.add(new ModelBox(jacket7, 0, 32, -4.0F, -0.1191F, 1.0911F, 8, 13, 1, 0.0F, false));

		leftleg_scp = new ModelRenderer(this);
		leftleg_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftleg1 = new ModelRenderer(this);
		leftleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg1);
		setRotationAngle(leftleg1, 0.0F, -0.0524F, 0.0349F);
		leftleg1.cubeList.add(new ModelBox(leftleg1, 80, 62, 1.27F, -0.0955F, -2.1F, 1, 6, 4, 0.0F, false));

		leftleg2 = new ModelRenderer(this);
		leftleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg2);
		setRotationAngle(leftleg2, 0.0F, -0.0349F, -0.0349F);
		leftleg2.cubeList.add(new ModelBox(leftleg2, 10, 87, 0.9226F, 4.1F, -2.0509F, 1, 5, 4, 0.0F, false));

		leftleg3 = new ModelRenderer(this);
		leftleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg3);
		setRotationAngle(leftleg3, 0.0F, 0.0F, 0.0349F);
		leftleg3.cubeList.add(new ModelBox(leftleg3, 68, 8, -2.0965F, 0.068F, -2.03F, 1, 9, 4, 0.0F, false));

		leftleg4 = new ModelRenderer(this);
		leftleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg4);
		leftleg4.cubeList.add(new ModelBox(leftleg4, 56, 38, -1.9535F, -0.001F, -2.1786F, 4, 9, 3, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 68, 68, -2.0535F, -0.0001F, 0.2214F, 4, 9, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 89, 22, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 67, 89, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 71, 49, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 88, 79, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		leftleg4.cubeList.add(new ModelBox(leftleg4, 88, 5, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));

		leftleg5 = new ModelRenderer(this);
		leftleg5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg_scp.addChild(leftleg5);
		setRotationAngle(leftleg5, -0.1222F, -0.1047F, 0.0F);
		leftleg5.cubeList.add(new ModelBox(leftleg5, 95, 51, -2.1928F, 11.1268F, -0.9835F, 4, 1, 1, 0.0F, false));

		rightleg_scp = new ModelRenderer(this);
		rightleg_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightleg1 = new ModelRenderer(this);
		rightleg1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg1);
		rightleg1.cubeList.add(new ModelBox(rightleg1, 16, 51, -2.0F, -0.001F, -2.14F, 4, 9, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 75, -2.6F, 1.999F, -2.341F, 2, 4, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 26, 18, -2.4F, -0.002F, -1.091F, 1, 4, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 77, 57, -0.7F, 4.799F, -2.241F, 3, 1, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 77, 36, -0.7F, 2.199F, -2.241F, 3, 1, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 64, 58, -0.699F, 4.799F, 1.259F, 3, 1, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 40, 63, -0.699F, 2.199F, 1.259F, 3, 1, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 45, 0, -2.601F, 1.999F, 1.359F, 2, 4, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 78, 81, -2.0F, -0.0005F, 1.2F, 4, 9, 1, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 40, 88, -2.0F, 9.0F, -2.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 0, 88, -2.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 87, 35, -2.0F, 9.0F, 0.1F, 4, 3, 2, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 87, 53, 1.1F, 9.0F, -2.0F, 1, 3, 4, 0.0F, false));
		rightleg1.cubeList.add(new ModelBox(rightleg1, 67, 0, -2.0F, 11.01F, -2.0F, 4, 1, 4, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-2.6F, 1.7F, 0.9F);
		rightleg1.addChild(bone18);
		setRotationAngle(bone18, 2.9147F, 0.0F, 0.0F);
		bone18.cubeList.add(new ModelBox(bone18, 24, 0, -1.0F, -5.0F, 0.0F, 1, 5, 2, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 48, 52, -0.9F, -2.2205F, -0.82F, 1, 2, 1, 0.0F, false));

		rightleg2 = new ModelRenderer(this);
		rightleg2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg2);
		setRotationAngle(rightleg2, 0.0F, 0.0F, 0.0524F);
		rightleg2.cubeList.add(new ModelBox(rightleg2, 25, 86, -2.0948F, 0.0999F, -2.0F, 1, 5, 4, 0.0F, false));

		rightleg3 = new ModelRenderer(this);
		rightleg3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg3);
		setRotationAngle(rightleg3, 0.0F, 0.0F, -0.0175F);
		rightleg3.cubeList.add(new ModelBox(rightleg3, 84, 87, -2.3855F, 4.97F, -2.0F, 1, 4, 4, 0.0F, false));
		rightleg3.cubeList.add(new ModelBox(rightleg3, 41, 65, 1.1F, 0.05F, -2.0F, 1, 9, 4, 0.0F, false));

		rightleg4 = new ModelRenderer(this);
		rightleg4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg_scp.addChild(rightleg4);
		setRotationAngle(rightleg4, -0.1222F, 0.1047F, 0.0F);
		rightleg4.cubeList.add(new ModelBox(rightleg4, 95, 2, -1.8F, 11.1314F, -1.0206F, 4, 1, 1, 0.0F, false));

		leftarm_scp = new ModelRenderer(this);
		leftarm_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		leftarm1 = new ModelRenderer(this);
		leftarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm1);
		setRotationAngle(leftarm1, 0.0F, 0.0F, -0.0524F);
		leftarm1.cubeList.add(new ModelBox(leftarm1, 68, 79, 2.2489F, -1.75F, -2.0F, 1, 6, 4, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 68, 58, 1.5038F, -1.8368F, -2.5F, 2, 3, 5, 0.0F, false));
		leftarm1.cubeList.add(new ModelBox(leftarm1, 58, 91, -1.5523F, 4.0254F, -2.0F, 1, 3, 4, 0.0F, false));

		leftarm2 = new ModelRenderer(this);
		leftarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm2);
		setRotationAngle(leftarm2, 0.0F, 0.0F, 0.0349F);
		leftarm2.cubeList.add(new ModelBox(leftarm2, 52, 79, -1.1508F, -1.863F, -2.0F, 1, 6, 4, 0.0F, false));
		leftarm2.cubeList.add(new ModelBox(leftarm2, 31, 91, 2.5914F, 3.9688F, -2.0F, 1, 3, 4, 0.0F, false));

		leftarm3 = new ModelRenderer(this);
		leftarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm3);
		setRotationAngle(leftarm3, -0.0175F, -0.0698F, 0.0F);
		leftarm3.cubeList.add(new ModelBox(leftarm3, 91, 27, -1.1523F, -1.8719F, -2.2856F, 4, 6, 1, 0.0F, false));

		leftarm4 = new ModelRenderer(this);
		leftarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm4);
		setRotationAngle(leftarm4, 0.0698F, -0.0524F, 0.0F);
		leftarm4.cubeList.add(new ModelBox(leftarm4, 68, 94, -1.1F, 3.9185F, -2.7298F, 4, 3, 1, 0.0F, false));

		leftarm5 = new ModelRenderer(this);
		leftarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm5);
		leftarm5.cubeList.add(new ModelBox(leftarm5, 32, 80, -1.0F, -1.95F, 1.2F, 4, 9, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 95, 0, -1.0F, 7.05F, -2.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 94, 81, -1.0F, 7.05F, 1.1F, 4, 1, 1, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 92, 40, -1.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));
		leftarm5.cubeList.add(new ModelBox(leftarm5, 16, 92, 2.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));

		leftarm6 = new ModelRenderer(this);
		leftarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm6);
		setRotationAngle(leftarm6, 0.0F, 0.0F, 0.0873F);
		leftarm6.cubeList.add(new ModelBox(leftarm6, 63, 8, 2.9055F, 8.8926F, -1.5F, 1, 1, 3, 0.0F, false));
		leftarm6.cubeList.add(new ModelBox(leftarm6, 54, 52, -0.4953F, 7.8851F, -1.9F, 1, 1, 3, 0.0F, false));

		leftarm7 = new ModelRenderer(this);
		leftarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm_scp.addChild(leftarm7);
		setRotationAngle(leftarm7, 0.0F, 0.0F, 0.0349F);
		leftarm7.cubeList.add(new ModelBox(leftarm7, 27, 63, -1.0684F, -2.1712F, -2.51F, 4, 1, 5, 0.0F, false));
		leftarm7.cubeList.add(new ModelBox(leftarm7, 0, 83, 0.4244F, -2.3885F, -2.01F, 3, 1, 4, 0.0F, false));

		rightarm_scp = new ModelRenderer(this);
		rightarm_scp.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		rightarm1 = new ModelRenderer(this);
		rightarm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm1);
		rightarm1.cubeList.add(new ModelBox(rightarm1, 94, 6, -3.0F, 7.05F, -2.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 64, 50, -3.0F, 7.05F, 1.1F, 4, 1, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 78, 9, -3.0F, -1.95F, 1.2F, 4, 9, 1, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 12, 64, 0.2F, -1.95F, -2.0F, 1, 9, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 91, 17, -3.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));
		rightarm1.cubeList.add(new ModelBox(rightarm1, 90, 91, 0.1F, 7.05F, -2.0F, 1, 1, 4, 0.0F, false));

		rightarm2 = new ModelRenderer(this);
		rightarm2.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm2);
		setRotationAngle(rightarm2, 0.0F, 0.0F, 0.0524F);
		rightarm2.cubeList.add(new ModelBox(rightarm2, 42, 78, -3.1893F, -1.7398F, -2.0F, 1, 6, 4, 0.0F, false));
		rightarm2.cubeList.add(new ModelBox(rightarm2, 67, 32, -3.3942F, -1.8292F, -2.5F, 2, 3, 5, 0.0F, false));

		rightarm3 = new ModelRenderer(this);
		rightarm3.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm3);
		setRotationAngle(rightarm3, 0.0F, 0.0F, -0.0524F);
		rightarm3.cubeList.add(new ModelBox(rightarm3, 48, 89, -3.6773F, 3.8986F, -2.0F, 1, 3, 4, 0.0F, false));

		rightarm4 = new ModelRenderer(this);
		rightarm4.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm4);
		setRotationAngle(rightarm4, -0.0349F, 0.0349F, 0.0F);
		rightarm4.cubeList.add(new ModelBox(rightarm4, 90, 61, -2.93F, -1.8591F, -2.3035F, 4, 6, 1, 0.0F, false));

		rightarm5 = new ModelRenderer(this);
		rightarm5.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm5);
		setRotationAngle(rightarm5, 0.0349F, 0.1047F, 0.0F);
		rightarm5.cubeList.add(new ModelBox(rightarm5, 93, 53, -2.78F, 3.9794F, -2.6191F, 4, 3, 1, 0.0F, false));

		rightarm6 = new ModelRenderer(this);
		rightarm6.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm6);
		setRotationAngle(rightarm6, 0.0F, 0.0F, -0.0873F);
		rightarm6.cubeList.add(new ModelBox(rightarm6, 30, 35, -0.5F, 7.9063F, -1.9F, 1, 1, 3, 0.0F, false));
		rightarm6.cubeList.add(new ModelBox(rightarm6, 0, 0, -3.9F, 8.9F, -1.5F, 1, 1, 3, 0.0F, false));

		rightarm7 = new ModelRenderer(this);
		rightarm7.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm_scp.addChild(rightarm7);
		setRotationAngle(rightarm7, 0.0F, 0.0F, -0.0349F);
		rightarm7.cubeList.add(new ModelBox(rightarm7, 58, 52, -2.9437F, -2.2486F, -2.51F, 4, 1, 5, 0.0F, false));
		rightarm7.cubeList.add(new ModelBox(rightarm7, 82, 41, -3.2365F, -2.4589F, -2.01F, 3, 1, 4, 0.0F, false));

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone);
		setRotationAngle(bone, -0.2443F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 73, 21, -4.0F, -6.9093F, -6.0678F, 8, 2, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone16);
		setRotationAngle(bone16, 0.1571F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 56, 27, -4.0F, -7.4229F, 3.4514F, 8, 3, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.2094F);
		bone2.cubeList.add(new ModelBox(bone2, 47, 16, 4.746F, -7.1F, -4.001F, 1, 3, 8, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 12, 46, 5.1706F, -5.7858F, -1.3F, 1, 2, 2, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-0.95F, 1.9F, 0.0F);
		helmet.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 0, 95, 4.746F, -7.1F, 1.0F, 1, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 70, 40, -3.604F, -7.1F, -1.05F, 1, 4, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 51, 70, 4.496F, -7.1F, -1.05F, 1, 4, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 64, 34, -3.104F, -5.1F, 3.2F, 3, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 18, 64, -1.004F, -5.1F, 3.201F, 6, 2, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 28, 51, -3.604F, -7.85F, -2.05F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 16, 51, 4.496F, -7.85F, -2.05F, 1, 3, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 94, 76, -3.8F, -7.1F, 1.0F, 1, 2, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 65, 24, -3.054F, -7.1F, 3.7F, 8, 2, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.65F, -5.9F, -2.05F);
		bone3.addChild(bone6);
		setRotationAngle(bone6, 0.5236F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 40, 65, -0.95F, 0.866F, -0.5F, 1, 2, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 59, 52, 7.15F, 0.866F, -0.5F, 1, 2, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(5.8F, -5.1F, 1.0F);
		bone3.addChild(bone5);
		setRotationAngle(bone5, 0.8552F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 8, 96, -1.05F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 24, 95, -9.61F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone11);
		bone11.cubeList.add(new ModelBox(bone11, 24, 0, -3.5F, -8.9F, -3.49F, 7, 1, 7, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone12);
		setRotationAngle(bone12, -0.7854F, 0.0F, 0.0F);
		bone12.cubeList.add(new ModelBox(bone12, 76, 33, -3.5F, -3.8F, -8.76F, 7, 1, 1, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 56, 32, -3.5F, -8.7497F, -3.8103F, 7, 1, 1, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.7854F);
		bone13.cubeList.add(new ModelBox(bone13, 58, 0, -3.85F, -8.75F, -3.5F, 1, 1, 7, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 57, 16, -8.75F, -3.871F, -3.5F, 1, 1, 7, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.2094F);
		bone4.cubeList.add(new ModelBox(bone4, 46, 27, -5.7362F, -7.1F, -4.001F, 1, 3, 8, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 24, 82, -6.0651F, -5.688F, -1.3F, 1, 2, 2, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone8);
		setRotationAngle(bone8, -0.1571F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 90, 96, -4.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 51, 96, 3.2F, -5.1F, -3.9F, 1, 5, 1, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(bone9);
		setRotationAngle(bone9, 0.192F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 44, 0, -4.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 77, 43, -1.5F, -1.9616F, -4.14F, 3, 1, 1, 0.0F, false));
		bone9.cubeList.add(new ModelBox(bone9, 42, 43, 1.1F, -1.8253F, -3.9628F, 3, 1, 8, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(5.8F, -4.75F, -1.0F);
		helmet.addChild(bone7);
		setRotationAngle(bone7, -0.192F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 90, 86, -1.5F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 20, 12, -0.7F, 0.0F, -3.0F, 0, 4, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 90, 46, -11.1F, -1.0F, -3.0F, 1, 1, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -10.9F, 0.0F, -3.0F, 0, 4, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 58, 81, -8.85F, -1.0F, -4.9F, 6, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 83, 0, -8.8F, 0.0F, -4.77F, 6, 5, 0, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.5F, 0.0F, -3.0F);
		bone7.addChild(bone10);
		setRotationAngle(bone10, 0.0F, -0.6981F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 77, 41, -3.0F, -1.001F, 0.0F, 3, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 84, 95, -3.0F, 0.0F, 0.2F, 3, 5, 0, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-11.1F, 0.0F, -3.0F);
		bone7.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.6981F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 64, 60, 0.0F, -1.001F, 0.0F, 3, 1, 1, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 58, 0, 0.0F, 0.0F, 0.2F, 3, 5, 0, 0.0F, false));

		vest = new ModelRenderer(this);
		vest.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.cubeList.add(new ModelBox(vest, 12, 77, -2.0F, 1.3F, -3.25F, 4, 9, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 44, 9, -1.5F, 1.4F, -3.45F, 3, 2, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 84, 72, -2.5F, 4.0F, -3.45F, 5, 6, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 68, 66, -2.499F, 8.5F, -3.55F, 5, 1, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 47, 96, 0.25F, 3.25F, -4.15F, 1, 5, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 83, 46, 0.0F, 3.0F, -4.3F, 1, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 70, 40, -1.75F, 3.0F, -4.3F, 1, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 24, 24, -3.45F, 3.0F, -4.3F, 1, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 74, 5, -3.75F, 4.5F, -3.7F, 7, 3, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 32, 69, -1.45F, 3.25F, -4.15F, 1, 5, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 18, 32, -3.15F, 3.25F, -4.15F, 1, 5, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 64, 83, -0.25F, 3.249F, -4.151F, 1, 5, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 51, 69, -1.95F, 3.249F, -4.151F, 1, 5, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 12, 62, -3.65F, 3.249F, -4.151F, 1, 5, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 24, 24, -4.5F, 4.0F, -2.5F, 9, 6, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 32, 52, -3.5F, 0.2F, 1.8F, 7, 10, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 57, 16, 1.3F, 5.9F, 1.9F, 2, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 50, 38, -3.3F, 5.9F, 1.9F, 2, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 48, 16, -1.0F, 5.9F, 1.9F, 2, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 90, 68, -2.0F, 9.9F, -3.0F, 5, 2, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 90, 12, -2.5F, 10.9F, -3.2F, 5, 4, 1, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 48, 9, -4.6F, 9.8F, -2.8F, 5, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 32, 73, 2.6F, 9.8F, -2.6F, 2, 2, 5, 0.0F, false));
		vest.cubeList.add(new ModelBox(vest, 71, 54, -4.1F, 9.8F, 1.6F, 8, 2, 1, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(4.7F, 5.5F, -2.2F);
		vest.addChild(bone17);
		setRotationAngle(bone17, -1.3963F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 57, 84, -1.0F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 17, 82, -9.4F, -2.0F, -1.0F, 1, 2, 5, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 83, 46, -1.1F, -4.1666F, -0.618F, 1, 2, 5, 0.0F, false));
		bone17.cubeList.add(new ModelBox(bone17, 83, 14, -9.3F, -4.1666F, -0.618F, 1, 2, 5, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone19);
		setRotationAngle(bone19, 0.0F, -0.192F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 78, 93, 1.3523F, 1.3F, -3.5654F, 2, 9, 1, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.192F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 41, 93, -3.3423F, 1.3F, -3.5754F, 2, 9, 1, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 48, 21, -3.1078F, 1.4F, -3.7336F, 2, 2, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone21);
		setRotationAngle(bone21, -0.2618F, -0.192F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 83, 24, 1.3731F, 0.2132F, -3.107F, 2, 2, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 0, 46, 1.5891F, -0.0018F, -3.2706F, 1, 3, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 32, 8, 2.2F, -0.002F, -3.271F, 1, 3, 1, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 58, 58, 1.9F, 2.9807F, -3.1F, 1, 2, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(2.9618F, 0.4156F, -3.6814F);
		bone21.addChild(bone15);
		setRotationAngle(bone15, 0.1396F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 16, -1.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone22);
		setRotationAngle(bone22, -0.2618F, 0.192F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 48, 79, -3.3169F, 0.2166F, -3.1199F, 2, 2, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone23);
		setRotationAngle(bone23, 0.0F, -0.1745F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 75, 75, 1.4F, -0.6F, -2.9199F, 2, 1, 5, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(0.0F, 0.0F, 0.0F);
		vest.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.1745F, 0.0F);
		bone24.cubeList.add(new ModelBox(bone24, 58, 75, -3.35F, -0.6F, -2.9482F, 2, 1, 5, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(0.5F, 0.0F, 0.0F);
		vest.addChild(bone27);
		setRotationAngle(bone27, -0.0524F, 0.0F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 76, 27, -3.5F, 0.5117F, 2.3347F, 6, 5, 1, 0.0F, false));
		
//		this.bipedHead.addChild(helmet);
//		this.bipedBody.addChild(jacket);
//		this.bipedBody.addChild(vest);
//		this.bipedLeftArm.addChild(leftarm_scp);
//		this.bipedRightArm.addChild(rightarm_scp);
//		this.bipedLeftLeg.addChild(leftleg_scp);
//		this.bipedRightLeg.addChild(rightleg_scp);
		
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
		vest.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
