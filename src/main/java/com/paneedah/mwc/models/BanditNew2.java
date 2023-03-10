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


public class BanditNew2 extends ModelBiped {
	private final QRenderer head;
	private final QRenderer facebandana;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final QRenderer body;
	private final QRenderer chestharness;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer body_r6;
	private final QRenderer rightarm;
	private final QRenderer leftarm;
	private final QRenderer rightleg;
	private final QRenderer leftleg;

	public BanditNew2() {
		textureWidth = 100;
		textureHeight = 64;

		head = new QRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		facebandana = new QRenderer(this);
		facebandana.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(facebandana);
		

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.15F, -0.1F, 3.88F);
		facebandana.addChild(cube_r1);
		setRotation(cube_r1, -0.7156F, 0.576F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 20, 27, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.25F, -0.7F, 4.28F);
		facebandana.addChild(cube_r2);
		setRotation(cube_r2, -0.4712F, -0.4014F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 43, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-4.25F, -2.5F, -3.7F);
		facebandana.addChild(cube_r3);
		setRotation(cube_r3, -0.1222F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 59, 3, -0.2F, -0.2F, -0.2F, 9, 3, 9, -0.2F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -3.45F, -4.7F);
		facebandana.addChild(cube_r4);
		setRotation(cube_r4, -0.1222F, -0.0873F, 0.2094F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 48, 12, 0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -2.5F, -4.75F);
		facebandana.addChild(cube_r5);
		setRotation(cube_r5, 0.1222F, 0.1047F, -0.1047F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 32, 8, -4.3F, 0.0F, 0.01F, 1, 2, 1, 0.0F, true));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -2.5F, -4.75F);
		facebandana.addChild(cube_r6);
		setRotation(cube_r6, 0.1222F, -0.1047F, 0.1047F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 32, 8, 3.3F, 0.0F, 0.01F, 1, 2, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 1.3F, -4.35F);
		facebandana.addChild(cube_r7);
		setRotation(cube_r7, 0.1222F, -0.0698F, -0.2094F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 44, 8, 0.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 1.3F, -4.35F);
		facebandana.addChild(cube_r8);
		setRotation(cube_r8, 0.1745F, 0.0873F, 0.192F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 47, 0, -4.0F, -3.0F, 0.0F, 4, 3, 1, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -3.45F, -4.85F);
		facebandana.addChild(cube_r9);
		setRotation(cube_r9, -0.1396F, 0.1047F, -0.2269F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 48, 15, -4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F, false));

		body = new QRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 27, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		chestharness = new QRenderer(this);
		chestharness.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(chestharness);
		chestharness.cubeList.add(new ModelBox(chestharness, 36, 24, -3.999F, 6.0F, -2.75F, 8, 5, 1, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 27, -3.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 24, 0, 2.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 16, 43, 1.8F, -0.05F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 40, 33, -3.8F, -0.05F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 24, 0, -4.636F, 7.9791F, -2.5516F, 9, 3, 5, 0.0F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-3.9F, 3.25F, -2.75F);
		chestharness.addChild(body_r1);
		setRotation(body_r1, -0.1047F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 0, 16, 0.1F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
		body_r1.cubeList.add(new ModelBox(body_r1, 26, 20, 5.7F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(3.9F, 0.45F, 2.55F);
		chestharness.addChild(body_r2);
		setRotation(body_r2, -0.0524F, 0.0F, 0.2793F);
		body_r2.cubeList.add(new ModelBox(body_r2, 0, 20, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-3.9F, 0.45F, 2.55F);
		chestharness.addChild(body_r3);
		setRotation(body_r3, -0.0524F, 0.0F, -0.2793F);
		body_r3.cubeList.add(new ModelBox(body_r3, 26, 16, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r4);
		setRotation(body_r4, 0.0F, 0.0F, -0.8727F);
		body_r4.cubeList.add(new ModelBox(body_r4, 28, 43, 0.0F, -0.2F, -1.0F, 1, 9, 1, -0.1F, false));

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r5);
		setRotation(body_r5, 0.0F, 0.0F, 0.8727F);
		body_r5.cubeList.add(new ModelBox(body_r5, 32, 43, -1.0F, 0.0F, -0.97F, 1, 9, 1, -0.1F, false));

		body_r6 = new ModelRenderer(this);
		body_r6.setRotationPoint(-2.6F, 11.5F, -4.15F);
		chestharness.addChild(body_r6);
		setRotation(body_r6, 0.0F, 0.3316F, 0.0524F);
		body_r6.cubeList.add(new ModelBox(body_r6, 0, 0, -2.0F, -5.0F, 0.0F, 2, 5, 2, 0.0F, false));

		rightarm = new QRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 0, 43, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new QRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 36, 39, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new QRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 32, 8, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new QRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 27, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
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
