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


public class BanditNew4 extends ModelBiped {
	private final QRenderer head;
	private final QRenderer body;
	private final ModelRenderer chestharness;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone5;
	private final QRenderer rightarm;
	private final QRenderer leftarm;
	private final QRenderer rightleg;
	private final QRenderer leftleg;

	public BanditNew4() {
		textureWidth = 64;
		textureHeight = 64;

		head = new QRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new QRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		chestharness = new ModelRenderer(this);
		chestharness.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(chestharness);
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 32, -3.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 16, 2.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 48, -4.0F, -0.25F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 0, 53, 2.0F, -0.25F, -2.0F, 2, 1, 4, 0.1F, true));
		chestharness.cubeList.add(new ModelBox(chestharness, 32, 32, -4.0F, 7.9791F, -1.6516F, 8, 3, 4, 0.2F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(-2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r1);
		setRotation(body_r1, 0.0F, 0.0F, -0.8727F);
		body_r1.cubeList.add(new ModelBox(body_r1, 48, 5, 0.0F, -0.4F, -1.0F, 1, 9, 1, -0.1F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(2.9F, 3.05F, 2.35F);
		chestharness.addChild(body_r2);
		setRotation(body_r2, 0.0F, 0.0F, 0.8727F);
		body_r2.cubeList.add(new ModelBox(body_r2, 12, 48, -1.0F, -0.4F, -0.97F, 1, 9, 1, -0.1F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(3.0F, 11.5F, -4.15F);
		chestharness.addChild(body_r3);
		setRotation(body_r3, 0.0F, -0.3316F, -0.0524F);
		body_r3.cubeList.add(new ModelBox(body_r3, 0, 0, 0.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-3.0F, 11.5F, -4.15F);
		chestharness.addChild(body_r4);
		setRotation(body_r4, 0.0F, 0.3316F, 0.0524F);
		body_r4.cubeList.add(new ModelBox(body_r4, 24, 0, -2.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.9F, 0.45F, 2.55F);
		chestharness.addChild(bone6);
		setRotation(bone6, -0.0524F, 0.0F, 0.2793F);
		bone6.cubeList.add(new ModelBox(bone6, 36, 16, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.9F, 0.45F, 2.55F);
		chestharness.addChild(bone7);
		setRotation(bone7, -0.0524F, 0.0F, -0.2793F);
		bone7.cubeList.add(new ModelBox(bone7, 28, 32, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.9F, 3.25F, -2.75F);
		chestharness.addChild(bone5);
		setRotation(bone5, -0.1047F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 12, 32, -2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 20, 16, -7.8F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

		rightarm = new QRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 16, 32, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		rightarm.cubeList.add(new ModelBox(rightarm, 32, 39, -3.0F, -2.0F, -2.0F, 4, 10, 4, 0.12F, false));

		leftarm = new QRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 10, 4, 0.12F, false));

		rightleg = new QRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new QRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
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
