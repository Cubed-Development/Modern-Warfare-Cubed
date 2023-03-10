package com.paneedah.mw.models;

import com.paneedah.weaponlib.ai.EntityCustomMob;
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


public class SoldierSniper extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;
	private final ModelRenderer body;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer body_r5;
	private final ModelRenderer leftarm;
	private final ModelRenderer leftarm_r1;
	private final ModelRenderer leftarm_r2;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm_r3;
	private final ModelRenderer leftarm_r4;
	private final ModelRenderer leftleg;
	private final ModelRenderer leftleg_r1;
	private final ModelRenderer leftleg_r2;
	private final ModelRenderer leftleg_r3;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg_r4;
	private final ModelRenderer leftleg_r5;
	private final ModelRenderer leftleg_r6;

	public SoldierSniper() {
		textureWidth = 85;
		textureHeight = 85;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(5.4F, -3.8F, -3.6F);
		head.addChild(head_r1);
		setRotation(head_r1, 0.0162F, -0.05F, 0.0861F);
		head_r1.cubeList.add(new ModelBox(head_r1, 46, 0, -1.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-5.4F, -3.8F, -3.6F);
		head.addChild(head_r2);
		setRotation(head_r2, 0.0162F, 0.05F, -0.0861F);
		head_r2.cubeList.add(new ModelBox(head_r2, 46, 15, 0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(4.0F, -3.5F, 6.3F);
		head.addChild(head_r3);
		setRotation(head_r3, -1.8675F, 0.0F, 0.0F);
		head_r3.cubeList.add(new ModelBox(head_r3, 24, 0, -8.0F, 0.0F, 0.0F, 8, 3, 5, 0.0F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(4.0F, -9.2F, 3.9F);
		head.addChild(head_r4);
		setRotation(head_r4, -1.1694F, 0.0F, 0.0F);
		head_r4.cubeList.add(new ModelBox(head_r4, 24, 26, -8.0F, 0.0F, 0.0F, 8, 3, 6, 0.1F, false));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(4.0F, -8.1F, -5.2F);
		head.addChild(head_r5);
		setRotation(head_r5, 0.1571F, 0.0F, 0.0F);
		head_r5.cubeList.add(new ModelBox(head_r5, 0, 16, -8.0F, 0.0F, 0.0F, 8, 1, 9, 0.0F, false));

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(4.7F, -7.9F, 1.2F);
		head.addChild(head_r6);
		setRotation(head_r6, 0.4528F, -1.3252F, -0.7897F);
		head_r6.cubeList.add(new ModelBox(head_r6, 22, 65, -5.0F, 0.0F, 0.0F, 5, 7, 0, 0.0F, false));

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(-4.9F, -8.0F, 2.1F);
		head.addChild(head_r7);
		setRotation(head_r7, 0.3563F, 1.261F, 0.6894F);
		head_r7.cubeList.add(new ModelBox(head_r7, 64, 21, 0.0F, 0.0F, 0.0F, 5, 6, 0, 0.0F, false));

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(-4.9F, -8.0F, -3.9F);
		head.addChild(head_r8);
		setRotation(head_r8, 0.1436F, 0.7331F, 0.4452F);
		head_r8.cubeList.add(new ModelBox(head_r8, 45, 0, 0.0F, 0.0F, 0.0F, 3, 5, 0, 0.0F, false));

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(4.9F, -8.0F, -4.1F);
		head.addChild(head_r9);
		setRotation(head_r9, -0.0769F, -0.4091F, -0.125F);
		head_r9.cubeList.add(new ModelBox(head_r9, 50, 65, -5.0F, 0.0F, 0.0F, 5, 5, 0, 0.0F, false));

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(-4.2F, -8.0F, -4.9F);
		head.addChild(head_r10);
		setRotation(head_r10, 0.0847F, 0.0196F, 0.2641F);
		head_r10.cubeList.add(new ModelBox(head_r10, 15, 35, 0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F, false));

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(4.2F, -8.0F, -4.9F);
		head.addChild(head_r11);
		setRotation(head_r11, 0.0847F, -0.0196F, -0.2641F);
		head_r11.cubeList.add(new ModelBox(head_r11, 35, 35, -1.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 26, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.1F, false));
		body.cubeList.add(new ModelBox(body, 26, 10, -3.5F, 2.0F, -3.0F, 7, 7, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 27, -4.0F, 9.25F, -2.0F, 8, 1, 4, 0.3F, false));

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(3.7F, 2.1F, 3.3F);
		body.addChild(body_r1);
		setRotation(body_r1, 0.0119F, -0.2267F, 0.155F);
		body_r1.cubeList.add(new ModelBox(body_r1, 0, 61, -7.0F, -2.0F, 0.0F, 7, 13, 0, 0.0F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.0F, 2.0F, 1.8F);
		body.addChild(body_r2);
		setRotation(body_r2, 0.1222F, 0.1222F, 0.0F);
		body_r2.cubeList.add(new ModelBox(body_r2, 64, 45, -7.0F, -2.0F, 0.0F, 7, 13, 0, 0.0F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(-3.5F, 2.0F, -3.0F);
		body.addChild(body_r3);
		setRotation(body_r3, -0.2443F, 0.0F, 0.0F);
		body_r3.cubeList.add(new ModelBox(body_r3, 34, 23, 0.0F, -2.0F, 0.0F, 2, 2, 1, -0.01F, false));
		body_r3.cubeList.add(new ModelBox(body_r3, 40, 23, 5.0F, -2.0F, 0.0F, 2, 2, 1, -0.01F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-0.2F, 9.1F, -4.3F);
		body.addChild(body_r4);
		setRotation(body_r4, 0.0658F, 0.2441F, -0.0218F);
		body_r4.cubeList.add(new ModelBox(body_r4, 64, 2, -4.0F, -3.0F, 0.0F, 4, 3, 2, 0.0F, false));

		body_r5 = new ModelRenderer(this);
		body_r5.setRotationPoint(4.4F, 9.5F, -3.9F);
		body.addChild(body_r5);
		setRotation(body_r5, -0.0524F, -0.2443F, 0.0F);
		body_r5.cubeList.add(new ModelBox(body_r5, 32, 65, -3.0F, -4.0F, 0.0F, 3, 4, 2, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 48, 49, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 60, 8, -1.0F, -2.0F, -2.0F, 4, 9, 4, 0.1F, false));

		leftarm_r1 = new ModelRenderer(this);
		leftarm_r1.setRotationPoint(4.6F, 6.4F, 0.1F);
		leftarm.addChild(leftarm_r1);
		setRotation(leftarm_r1, -0.3629F, -0.2914F, 1.3906F);
		leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 22, 39, -7.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

		leftarm_r2 = new ModelRenderer(this);
		leftarm_r2.setRotationPoint(3.3F, 1.6F, -4.0F);
		leftarm.addChild(leftarm_r2);
		setRotation(leftarm_r2, 0.2429F, 0.2435F, 1.1165F);
		leftarm_r2.cubeList.add(new ModelBox(leftarm_r2, 52, 0, -5.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 0, 45, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		rightarm.cubeList.add(new ModelBox(rightarm, 55, 32, -3.0F, -2.0F, -2.0F, 4, 9, 4, 0.1F, false));

		leftarm_r3 = new ModelRenderer(this);
		leftarm_r3.setRotationPoint(-4.6F, 6.4F, 0.1F);
		rightarm.addChild(leftarm_r3);
		setRotation(leftarm_r3, -0.3629F, 0.2914F, -1.3906F);
		leftarm_r3.cubeList.add(new ModelBox(leftarm_r3, 22, 35, 0.0F, 0.0F, 0.0F, 7, 0, 4, 0.0F, false));

		leftarm_r4 = new ModelRenderer(this);
		leftarm_r4.setRotationPoint(-3.4F, 1.9F, -3.5F);
		rightarm.addChild(leftarm_r4);
		setRotation(leftarm_r4, 0.2079F, -0.2435F, -1.1165F);
		leftarm_r4.cubeList.add(new ModelBox(leftarm_r4, 16, 26, 0.0F, 0.0F, 0.0F, 5, 0, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 32, 49, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg_r1 = new ModelRenderer(this);
		leftleg_r1.setRotationPoint(-1.8F, 15.3F, 0.1F);
		leftleg.addChild(leftleg_r1);
		setRotation(leftleg_r1, 0.0302F, -0.244F, -0.0263F);
		leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 64, 58, 0.0F, -14.0F, 2.0F, 4, 10, 0, 0.0F, false));

		leftleg_r2 = new ModelRenderer(this);
		leftleg_r2.setRotationPoint(2.7F, 14.3F, 1.9F);
		leftleg.addChild(leftleg_r2);
		setRotation(leftleg_r2, -3.1345F, 1.2979F, 2.9536F);
		leftleg_r2.cubeList.add(new ModelBox(leftleg_r2, 42, 65, 0.0F, -12.0F, 2.0F, 4, 8, 0, 0.0F, false));

		leftleg_r3 = new ModelRenderer(this);
		leftleg_r3.setRotationPoint(0.0F, 12.0F, 2.7F);
		leftleg.addChild(leftleg_r3);
		setRotation(leftleg_r3, 0.1745F, 0.576F, 0.0F);
		leftleg_r3.cubeList.add(new ModelBox(leftleg_r3, 46, 35, 0.0F, -12.0F, 2.0F, 4, 9, 0, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 16, 49, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg_r4 = new ModelRenderer(this);
		leftleg_r4.setRotationPoint(1.8F, 15.3F, 0.1F);
		rightleg.addChild(leftleg_r4);
		setRotation(leftleg_r4, 0.0302F, 0.244F, 0.0263F);
		leftleg_r4.cubeList.add(new ModelBox(leftleg_r4, 14, 65, -4.0F, -14.0F, 2.0F, 4, 10, 0, 0.0F, false));

		leftleg_r5 = new ModelRenderer(this);
		leftleg_r5.setRotationPoint(-2.7F, 14.3F, 1.9F);
		rightleg.addChild(leftleg_r5);
		setRotation(leftleg_r5, -3.1345F, -1.2979F, -2.9536F);
		leftleg_r5.cubeList.add(new ModelBox(leftleg_r5, 0, 0, -4.0F, -12.0F, 2.0F, 4, 8, 0, 0.0F, false));

		leftleg_r6 = new ModelRenderer(this);
		leftleg_r6.setRotationPoint(0.0F, 12.0F, 2.7F);
		rightleg.addChild(leftleg_r6);
		setRotation(leftleg_r6, 0.1745F, -0.576F, 0.0F);
		leftleg_r6.cubeList.add(new ModelBox(leftleg_r6, 0, 16, -4.0F, -12.0F, 2.0F, 4, 9, 0, 0.0F, false));
	
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