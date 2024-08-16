package com.paneedah.mwc.models;

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


public class Soldier2 extends ModelBiped {
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
    private final ModelRenderer head_r12;
    private final ModelRenderer body;
    private final ModelRenderer body_r1;
    private final ModelRenderer body_r2;
    private final ModelRenderer body_r3;
    private final ModelRenderer body_r4;
    private final ModelRenderer rightarm;
    private final ModelRenderer leftarm;
    private final ModelRenderer rightleg;
    private final ModelRenderer leftleg;
    private final ModelRenderer leftleg_r1;

    public Soldier2() {
        textureWidth = 85;
        textureHeight = 85;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 0.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 54, 35, -4.0F, -0.9F, -4.1F, 8, 1, 1, 0.1F, false));
        head.cubeList.add(new ModelBox(head, 0, 25, -4.0F, -8.0F, -3.0F, 8, 3, 7, 0.3F, false));
        head.cubeList.add(new ModelBox(head, 0, 16, -4.0F, -9.0F, -4.0F, 8, 1, 8, 0.0F, false));

        head_r1 = new ModelRenderer(this);
        head_r1.setRotationPoint(-4.9F, -4.8F, -0.05F);
        head.addChild(head_r1);
        setRotation(head_r1, 0.2946F, -0.0356F, 0.1169F);
        head_r1.cubeList.add(new ModelBox(head_r1, 14, 57, 0.0F, -1.0F, 0.0F, 1, 4, 4, 0.0F, false));

        head_r2 = new ModelRenderer(this);
        head_r2.setRotationPoint(4.5F, -5.8F, 3.35F);
        head.addChild(head_r2);
        setRotation(head_r2, 0.3142F, 0.0F, 0.0F);
        head_r2.cubeList.add(new ModelBox(head_r2, 48, 51, -9.0F, 0.0F, 0.0F, 9, 3, 1, 0.0F, false));

        head_r3 = new ModelRenderer(this);
        head_r3.setRotationPoint(4.9F, -4.8F, -0.05F);
        head.addChild(head_r3);
        setRotation(head_r3, 0.2946F, 0.0356F, -0.1169F);
        head_r3.cubeList.add(new ModelBox(head_r3, 24, 57, -1.0F, -1.0F, 0.0F, 1, 4, 4, 0.0F, false));

        head_r4 = new ModelRenderer(this);
        head_r4.setRotationPoint(-2.85F, -5.2F, -6.2F);
        head.addChild(head_r4);
        setRotation(head_r4, -0.1537F, -0.0325F, -0.2069F);
        head_r4.cubeList.add(new ModelBox(head_r4, 4, 20, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        head_r5 = new ModelRenderer(this);
        head_r5.setRotationPoint(-1.35F, -5.7F, -6.2F);
        head.addChild(head_r5);
        setRotation(head_r5, -0.157F, -0.0055F, -0.0345F);
        head_r5.cubeList.add(new ModelBox(head_r5, 0, 20, 0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        head_r6 = new ModelRenderer(this);
        head_r6.setRotationPoint(1.35F, -5.7F, -6.2F);
        head.addChild(head_r6);
        setRotation(head_r6, -0.157F, 0.0055F, 0.0345F);
        head_r6.cubeList.add(new ModelBox(head_r6, 24, 2, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        head_r7 = new ModelRenderer(this);
        head_r7.setRotationPoint(2.85F, -5.2F, -6.2F);
        head.addChild(head_r7);
        setRotation(head_r7, -0.1537F, 0.0325F, 0.2069F);
        head_r7.cubeList.add(new ModelBox(head_r7, 24, 16, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

        head_r8 = new ModelRenderer(this);
        head_r8.setRotationPoint(2.5F, -5.8F, -5.3F);
        head.addChild(head_r8);
        setRotation(head_r8, 0.2793F, 0.0F, 0.0F);
        head_r8.cubeList.add(new ModelBox(head_r8, 24, 0, -5.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, false));

        head_r9 = new ModelRenderer(this);
        head_r9.setRotationPoint(1.5F, -5.2F, -5.0F);
        head.addChild(head_r9);
        setRotation(head_r9, -0.1047F, 0.0F, 0.0F);
        head_r9.cubeList.add(new ModelBox(head_r9, 0, 0, -3.0F, -2.0F, 0.0F, 3, 2, 1, 0.0F, false));

        head_r10 = new ModelRenderer(this);
        head_r10.setRotationPoint(4.0F, -5.2F, -4.5F);
        head.addChild(head_r10);
        setRotation(head_r10, -0.1745F, 0.0F, 0.0F);
        head_r10.cubeList.add(new ModelBox(head_r10, 18, 53, -8.0F, -3.0F, 0.0F, 8, 3, 1, 0.31F, false));

        head_r11 = new ModelRenderer(this);
        head_r11.setRotationPoint(-3.1F, 0.1F, -3.0F);
        head.addChild(head_r11);
        setRotation(head_r11, 0.5247F, -0.0604F, -0.0349F);
        head_r11.cubeList.add(new ModelBox(head_r11, 30, 53, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.1F, false));

        head_r12 = new ModelRenderer(this);
        head_r12.setRotationPoint(3.1F, 0.1F, -3.0F);
        head.addChild(head_r12);
        setRotation(head_r12, 0.5247F, 0.0604F, 0.0349F);
        head_r12.cubeList.add(new ModelBox(head_r12, 54, 23, 0.0F, -1.0F, 0.0F, 1, 1, 6, 0.1F, false));

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 0.0F, 0.0F);
        body.cubeList.add(new ModelBox(body, 30, 21, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.1F, false));
        body.cubeList.add(new ModelBox(body, 0, 51, -4.0F, 2.75F, -2.75F, 8, 7, 1, 0.0F, false));
        body.cubeList.add(new ModelBox(body, 24, 16, -4.0F, 10.0F, -2.0F, 8, 1, 4, 0.3F, false));
        body.cubeList.add(new ModelBox(body, 46, 60, 1.5F, -0.25F, -2.15F, 2, 1, 4, 0.01F, false));
        body.cubeList.add(new ModelBox(body, 34, 60, -3.5F, -0.25F, -2.15F, 2, 1, 4, 0.01F, false));
        body.cubeList.add(new ModelBox(body, 50, 14, -4.0F, 1.75F, 1.55F, 8, 8, 1, 0.0F, false));

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(1.5F, 1.75F, 2.55F);
        body.addChild(body_r1);
        setRotation(body_r1, 0.1222F, 0.0F, 0.0F);
        body_r1.cubeList.add(new ModelBox(body_r1, 56, 55, -5.0F, -2.0F, -1.0F, 7, 2, 1, 0.0F, false));

        body_r2 = new ModelRenderer(this);
        body_r2.setRotationPoint(1.5F, 2.75F, -2.75F);
        body.addChild(body_r2);
        setRotation(body_r2, -0.1222F, 0.0F, 0.0F);
        body_r2.cubeList.add(new ModelBox(body_r2, 0, 3, 0.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
        body_r2.cubeList.add(new ModelBox(body_r2, 0, 16, -5.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

        body_r3 = new ModelRenderer(this);
        body_r3.setRotationPoint(1.5F, 10.85F, -4.15F);
        body.addChild(body_r3);
        setRotation(body_r3, 0.0F, -0.0873F, 0.0F);
        body_r3.cubeList.add(new ModelBox(body_r3, 58, 58, -3.0F, -5.0F, 0.0F, 3, 5, 2, 0.0F, false));

        body_r4 = new ModelRenderer(this);
        body_r4.setRotationPoint(-2.6F, 10.85F, -4.35F);
        body.addChild(body_r4);
        setRotation(body_r4, 0.0F, 0.3665F, 0.0F);
        body_r4.cubeList.add(new ModelBox(body_r4, 0, 59, -3.0F, -5.0F, 0.0F, 3, 5, 2, 0.0F, false));

        rightarm = new ModelRenderer(this);
        rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightarm.cubeList.add(new ModelBox(rightarm, 32, 37, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        rightarm.cubeList.add(new ModelBox(rightarm, 48, 0, -3.0F, -2.0F, -2.0F, 4, 10, 4, 0.1F, false));

        leftarm = new ModelRenderer(this);
        leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftarm.cubeList.add(new ModelBox(leftarm, 16, 35, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
        leftarm.cubeList.add(new ModelBox(leftarm, 48, 37, -1.0F, -2.0F, -2.0F, 4, 10, 4, 0.1F, false));

        rightleg = new ModelRenderer(this);
        rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
        rightleg.cubeList.add(new ModelBox(rightleg, 0, 35, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

        leftleg = new ModelRenderer(this);
        leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
        leftleg.cubeList.add(new ModelBox(leftleg, 32, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
        leftleg.cubeList.add(new ModelBox(leftleg, 44, 55, -2.0F, 1.35F, -2.0F, 4, 1, 4, 0.1F, false));
        leftleg.cubeList.add(new ModelBox(leftleg, 54, 30, -2.0F, 3.45F, -2.0F, 4, 1, 4, 0.1F, false));

        leftleg_r1 = new ModelRenderer(this);
        leftleg_r1.setRotationPoint(3.0F, 5.0F, -1.5F);
        leftleg.addChild(leftleg_r1);
        setRotation(leftleg_r1, -0.0073F, -0.1045F, 0.0702F);
        leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 7, 63, -2.0F, -4.0F, 0.0F, 2, 4, 3, 0.0F, false));

        this.bipedRightArm.addChild(rightarm);
        this.bipedLeftArm.addChild(leftarm);
        this.bipedBody.addChild(body);
        this.bipedHead.addChild(head);
        this.bipedLeftLeg.addChild(leftleg);
        this.bipedRightLeg.addChild(rightleg);

        bipedHeadwear.isHidden = true;
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        ItemStack itemstack = ((EntityLivingBase) entityIn).getHeldItemMainhand();
        EntityCustomMob entityCustomMob = (EntityCustomMob) entityIn;

        if (entityCustomMob.isSwingingArms() && itemstack.getItem() != Items.BOW) {
            float f = MathHelper.sin(this.swingProgress * (float) Math.PI);
            float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float) Math.PI);
            this.bipedRightArm.rotateAngleZ = 0.0F;
            this.bipedLeftArm.rotateAngleZ = 0.0F;
            this.bipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
            this.bipedLeftArm.rotateAngleY = 0.1F - f * 0.6F;
            this.bipedRightArm.rotateAngleX = -((float) Math.PI / 2F);
            this.bipedLeftArm.rotateAngleX = -((float) Math.PI / 2F);
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

        if (itemstack.getItem() == Items.BOW
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
