package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumHandSide;
import net.minecraft.util.math.MathHelper;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class BanditNew3 extends ModelBiped {
	private final QRenderer head;
	private final QRenderer headset;
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
	private final ModelRenderer cube_r15;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer cube_r20;
	private final ModelRenderer cube_r21;
	private final ModelRenderer bone2;
	private final ModelRenderer cube_r22;
	private final ModelRenderer cube_r23;
	private final ModelRenderer cube_r24;
	private final ModelRenderer cube_r25;
	private final ModelRenderer cube_r26;
	private final ModelRenderer cube_r27;
	private final ModelRenderer body;
	private final QRenderer platecarrier;
	private final ModelRenderer cube_r28;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer cube_r31;
	private final ModelRenderer cube_r32;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final QRenderer rightarm;
	private final QRenderer leftarm;
	private final QRenderer rightleg;
	private final QRenderer leftleg;

	public BanditNew3() {
		textureWidth = 85;
		textureHeight = 128;

		head = new QRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		headset = new QRenderer(this);
		headset.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(headset);
		headset.cubeList.add(new ModelBox(headset, 21, 81, -4.0F, -8.5F, -1.0F, 8, 1, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.8F, -1.5F, -5.4F);
		headset.addChild(cube_r1);
		setRotation(cube_r1, -0.3665F, 1.0123F, 1.2392F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 41, 92, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.2F, -1.8F, -4.3F);
		headset.addChild(cube_r2);
		setRotation(cube_r2, -0.9425F, 0.6458F, 0.6283F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 41, 81, -1.0F, 0.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(5.35F, -3.2F, -1.9F);
		headset.addChild(cube_r3);
		setRotation(cube_r3, -1.0472F, 0.0349F, 0.1745F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 1, 81, -1.0F, 0.0F, 0.0F, 1, 3, 1, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-5.15F, -5.35F, -1.0F);
		headset.addChild(cube_r4);
		setRotation(cube_r4, 0.0F, 0.0F, 0.2618F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 68, 0.1114F, -3.0871F, -0.001F, 1, 3, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(4.95F, -5.35F, -1.0F);
		headset.addChild(cube_r5);
		setRotation(cube_r5, 0.0F, 0.0F, -0.2618F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 25, 84, -0.8886F, -3.0871F, -0.001F, 1, 3, 2, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-3.95F, -3.95F, 1.9F);
		headset.addChild(cube_r6);
		setRotation(cube_r6, 0.0F, -0.733F, -0.1222F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 1, 97, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(5.4F, -3.75F, 1.9F);
		headset.addChild(cube_r7);
		setRotation(cube_r7, 0.0F, -0.733F, 0.1222F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 103, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-5.6F, -5.5F, -2.45F);
		headset.addChild(cube_r8);
		setRotation(cube_r8, -0.9076F, 1.5882F, -0.1222F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 25, 65, -5.0F, -1.0F, 0.0F, 5, 1, 1, -0.3F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(5.5F, -5.5F, 2.55F);
		headset.addChild(cube_r9);
		setRotation(cube_r9, -0.9076F, -1.5882F, 0.1222F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 25, 67, -5.0F, -1.0F, 0.0F, 5, 1, 1, -0.3F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.95F, -3.95F, -1.9F);
		headset.addChild(cube_r10);
		setRotation(cube_r10, 0.0F, -0.733F, -0.1222F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 25, 89, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(5.4F, -3.75F, -1.9F);
		headset.addChild(cube_r11);
		setRotation(cube_r11, 0.0F, -0.733F, 0.1222F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 24, 105, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.3F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(-4.9F, -3.4F, -0.3F);
		headset.addChild(cube_r12);
		setRotation(cube_r12, -0.9076F, 0.0F, 0.2793F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 5, 68, 0.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(4.9F, -3.4F, -0.3F);
		headset.addChild(cube_r13);
		setRotation(cube_r13, -0.9076F, 0.0F, -0.2793F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 41, 90, -1.0F, -1.0F, 0.0F, 1, 1, 1, -0.1F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-5.71F, -3.83F, -1.0F);
		headset.addChild(cube_r14);
		setRotation(cube_r14, 0.0F, 0.0F, 0.4189F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 19, 116, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(5.71F, -3.83F, -1.0F);
		headset.addChild(cube_r15);
		setRotation(cube_r15, 0.0F, 0.0F, -0.4189F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 19, 111, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(5.25F, -2.25F, 1.85F);
		headset.addChild(bone);
		

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r16);
		setRotation(cube_r16, 0.0F, -0.733F, 0.1222F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 28, 105, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.0F, -3.75F);
		bone.addChild(cube_r17);
		setRotation(cube_r17, 0.0F, -0.733F, 0.1222F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 32, 105, -1.0F, -2.0F, 0.0F, 1, 2, 1, -0.2F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(-0.25F, 0.5F, -1.1F);
		bone.addChild(cube_r18);
		setRotation(cube_r18, 0.0F, 0.0F, 0.1222F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 19, 97, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 17, 100, -2.0F, -2.0F, -2.5F, 2, 2, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.0F, -1.5F, -0.1F);
		bone.addChild(cube_r19);
		setRotation(cube_r19, 0.8378F, 0.0F, 0.1222F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 37, 84, -2.005F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r20 = new ModelRenderer(this);
		cube_r20.setRotationPoint(0.0F, -1.5F, -3.6F);
		bone.addChild(cube_r20);
		setRotation(cube_r20, -0.8378F, 0.0F, 0.1222F);
		cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 88, -2.005F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r21 = new ModelRenderer(this);
		cube_r21.setRotationPoint(-0.04F, -1.18F, -2.85F);
		bone.addChild(cube_r21);
		setRotation(cube_r21, 0.0F, 0.0F, 0.1222F);
		cube_r21.cubeList.add(new ModelBox(cube_r21, 25, 69, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.85F, -2.6F, 1.85F);
		headset.addChild(bone2);
		setRotation(bone2, 0.0F, 0.0F, -0.2793F);
		

		cube_r22 = new ModelRenderer(this);
		cube_r22.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone2.addChild(cube_r22);
		setRotation(cube_r22, 0.0F, -0.733F, 0.1222F);
		cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 90, -1.6355F, -2.0342F, 0.5722F, 1, 2, 1, -0.2F, false));

		cube_r23 = new ModelRenderer(this);
		cube_r23.setRotationPoint(0.0F, 0.0F, -3.75F);
		bone2.addChild(cube_r23);
		setRotation(cube_r23, 0.0F, -0.733F, 0.1222F);
		cube_r23.cubeList.add(new ModelBox(cube_r23, 17, 103, -1.6355F, -2.0342F, 0.5722F, 1, 2, 1, -0.2F, false));

		cube_r24 = new ModelRenderer(this);
		cube_r24.setRotationPoint(-0.25F, 0.5F, -1.1F);
		bone2.addChild(cube_r24);
		setRotation(cube_r24, 0.0F, 0.0F, 0.1222F);
		cube_r24.cubeList.add(new ModelBox(cube_r24, 31, 84, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));
		cube_r24.cubeList.add(new ModelBox(cube_r24, 13, 97, -2.0F, -2.0F, -2.5F, 2, 2, 1, 0.0F, false));

		cube_r25 = new ModelRenderer(this);
		cube_r25.setRotationPoint(0.0F, -1.5F, -0.1F);
		bone2.addChild(cube_r25);
		setRotation(cube_r25, 0.8378F, 0.0F, 0.1222F);
		cube_r25.cubeList.add(new ModelBox(cube_r25, 31, 87, -2.0F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

		cube_r26 = new ModelRenderer(this);
		cube_r26.setRotationPoint(0.0F, -1.5F, -3.6F);
		bone2.addChild(cube_r26);
		setRotation(cube_r26, -0.8378F, 0.0F, 0.1222F);
		cube_r26.cubeList.add(new ModelBox(cube_r26, 36, 86, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

		cube_r27 = new ModelRenderer(this);
		cube_r27.setRotationPoint(-0.04F, -1.18F, -2.85F);
		bone2.addChild(cube_r27);
		setRotation(cube_r27, 0.0F, 0.0F, 0.1222F);
		cube_r27.cubeList.add(new ModelBox(cube_r27, 1, 65, -2.0F, -1.0F, 0.0F, 2, 1, 2, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 27, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		platecarrier = new QRenderer(this);
		platecarrier.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(platecarrier);
		platecarrier.cubeList.add(new ModelBox(platecarrier, 27, 22, -3.5F, 1.75F, -2.58F, 7, 9, 5, -0.1F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 24, 36, -3.0F, 5.45F, -3.07F, 6, 5, 6, 0.0F, false));
		platecarrier.cubeList.add(new ModelBox(platecarrier, 27, 11, -4.0F, 6.25F, -2.62F, 8, 4, 5, 0.1F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r28);
		setRotation(cube_r28, -0.192F, 0.0F, -0.1571F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 0, -2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(-3.5F, 1.75F, -2.5F);
		platecarrier.addChild(cube_r29);
		setRotation(cube_r29, -0.192F, 0.0F, 0.1571F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 0, 3, 0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(-3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r30);
		setRotation(cube_r30, 0.1396F, 0.0F, -0.1222F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 0, 16, 0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r31 = new ModelRenderer(this);
		cube_r31.setRotationPoint(3.0F, 0.05F, 2.1F);
		platecarrier.addChild(cube_r31);
		setRotation(cube_r31, 0.1396F, 0.0F, 0.1222F);
		cube_r31.cubeList.add(new ModelBox(cube_r31, 0, 19, -2.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, false));

		cube_r32 = new ModelRenderer(this);
		cube_r32.setRotationPoint(3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r32);
		setRotation(cube_r32, 0.0F, -0.0698F, 0.0F);
		cube_r32.cubeList.add(new ModelBox(cube_r32, 48, 11, -2.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(-3.2F, -0.25F, -1.9F);
		platecarrier.addChild(cube_r33);
		setRotation(cube_r33, 0.0F, 0.0698F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 58, 7, 0.0F, 0.0F, -0.05F, 2, 1, 4, 0.0F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(-0.5F, 4.65F, -4.05F);
		platecarrier.addChild(cube_r34);
		setRotation(cube_r34, 0.05F, -0.065F, -0.025F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 58, 32, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(-4.6F, 5.05F, -3.35F);
		platecarrier.addChild(cube_r35);
		setRotation(cube_r35, -0.0433F, 0.2406F, -0.1798F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 58, 57, 0.0F, 0.0F, -0.22F, 3, 5, 2, 0.0F, false));

		rightarm = new QRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 51, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new QRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 16, 47, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new QRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 44, 43, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new QRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 43, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
		this.bipedRightArm.addChild(rightarm);
	    this.bipedLeftArm.addChild(leftarm);
	    this.bipedBody.addChild(body);
	    this.bipedHead.addChild(head);
	    this.bipedLeftLeg.addChild(leftleg);
	    this.bipedRightLeg.addChild(rightleg);
	    
	    bipedHeadwear.isHidden = true;
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        ItemStack itemstack = ((EntityLivingBase)entityIn).getHeldItemMainhand();
        EntityCustomMob entityCustomMob = (EntityCustomMob)entityIn;

        if (entityCustomMob.isSwingingArms() && (itemstack == null || itemstack.getItem() != Items.BOW))
        {
            float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
            this.bipedRightArm.rotateAngleZ = 0.0F;
            this.bipedLeftArm.rotateAngleZ = 0.0F;
            this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
            this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
            this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F);
            this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F);
            this.bipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedLeftArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
            this.bipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
            this.bipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            this.bipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float p_78086_2_, float p_78086_3_,
            float partialTickTime) {
        this.rightArmPose = ModelBiped.ArmPose.EMPTY;
        this.leftArmPose = ModelBiped.ArmPose.EMPTY;
        ItemStack itemstack = entitylivingbaseIn.getHeldItem(EnumHand.MAIN_HAND);

        if (itemstack != null && itemstack.getItem() == Items.BOW
                && ((EntityCustomMob) entitylivingbaseIn).isSwingingArms()) {
            if (entitylivingbaseIn.getPrimaryHand() == EnumHandSide.RIGHT) {
                this.rightArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
            } else {
                this.leftArmPose = ModelBiped.ArmPose.BOW_AND_ARROW;
            }
        }

        super.setLivingAnimations(entitylivingbaseIn, p_78086_2_, p_78086_3_, partialTickTime);
    }

    @Override
    public void postRenderArm(float scale, EnumHandSide side) {
        float f = side == EnumHandSide.RIGHT ? 1.0F : -1.0F;
        ModelRenderer modelrenderer = this.getArmForSide(side);
        modelrenderer.rotationPointX += f;
        modelrenderer.postRender(scale * 1.25f);
        modelrenderer.rotationPointX -= f;
    }

}
