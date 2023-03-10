package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class Necromorph extends ModelBiped
{
  //fields
    ModelRenderer rightarm;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer leftarm;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer leftarm3;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;
    ModelRenderer rightarm5;
    ModelRenderer leftarm6;
    ModelRenderer rightarm6;
    ModelRenderer rightleg;
    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer leftleg;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer body;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer body9;
    ModelRenderer head;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
  
    /** Records whether the model should be rendered holding an item in the left hand, and if that item is a block. */
    public int heldItemLeft;
    /** Records whether the model should be rendered holding an item in the right hand, and if that item is a block. */
    public int heldItemRight;
    public boolean isSneak;
    /** Records whether the model should be rendered aiming a bow. */
    public boolean aimedBow;

    public Necromorph()
    {
        this(0.0F);
    }

    public Necromorph(float p_i1148_1_)
    {
        this(p_i1148_1_, 0.0F, 128, 128);
    }

    public Necromorph(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_)
    {
        this.textureWidth = p_i1149_3_;
        this.textureHeight = p_i1149_4_;
//        this.bipedCloak = new ModelRenderer(this, 0, 0);
//        this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1149_1_);
//        this.bipedEars = new ModelRenderer(this, 24, 0);
//        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1149_1_);
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-3.5F, -6F, -4F, 7, 5, 7);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, 0.1115358F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 4, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 1.041001F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 4, 4);
      rightarm.setRotationPoint(0F, 0F, 0F);
      rightarm.setTextureSize(128, 128);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0.5205006F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 4, 4);
      leftarm.setRotationPoint(0F, 0F, 0F);
      leftarm.setTextureSize(128, 128);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, -0.5205006F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 4, 4);
      rightleg.setRotationPoint(0F, 0F, 0F);
      rightleg.setTextureSize(128, 128);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0.3717861F);
      leftleg = new ModelRenderer(this, 0, 60);
      leftleg.addBox(-2F, 0F, -2F, 4, 4, 4);
      leftleg.setRotationPoint(0F, 0F, 0F);
      leftleg.setTextureSize(128, 128);
      leftleg.mirror = true;
      setRotation(leftleg, -0.2230717F, 0F, 0F);
      rightarm1 = new ModelRenderer(this, 40, 16);
      rightarm1.addBox(-7F, -2F, -2F, 4, 3, 4);
      rightarm1.setRotationPoint(0F, 0F, 0F);
      rightarm1.setTextureSize(128, 128);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, 0F, 0.5205006F);
      rightarm2 = new ModelRenderer(this, 40, 16);
      rightarm2.addBox(-7.9F, -5.2F, 1F, 5, 3, 4);
      rightarm2.setRotationPoint(0F, 0F, 0F);
      rightarm2.setTextureSize(128, 128);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, -0.6692116F, 0F);
      rightarm3 = new ModelRenderer(this, 50, 30);
      rightarm3.addBox(-9.5F, -6.2F, -5F, 3, 3, 7);
      rightarm3.setRotationPoint(0F, 0F, 0F);
      rightarm3.setTextureSize(128, 128);
      rightarm3.mirror = true;
      setRotation(rightarm3, 1.003822F, 0F, 0F);
      rightarm4 = new ModelRenderer(this, 50, 45);
      rightarm4.addBox(-9.5F, -1.2F, -9F, 2, 1, 3);
      rightarm4.setRotationPoint(0F, 0F, 0F);
      rightarm4.setTextureSize(128, 128);
      rightarm4.mirror = true;
      setRotation(rightarm4, 0.1858931F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 40, 16);
      leftarm1.addBox(3F, -2F, -2F, 4, 3, 4);
      leftarm1.setRotationPoint(0F, 0F, 0F);
      leftarm1.setTextureSize(128, 128);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0F, 0F, -0.5205006F);
      leftarm2 = new ModelRenderer(this, 40, 16);
      leftarm2.addBox(3.1F, -5.2F, 1F, 5, 3, 4);
      leftarm2.setRotationPoint(0F, 0F, 0F);
      leftarm2.setTextureSize(128, 128);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0.669215F, 0F);
      leftarm3 = new ModelRenderer(this, 50, 30);
      leftarm3.addBox(6.5F, -6.2F, -5F, 3, 3, 7);
      leftarm3.setRotationPoint(0F, 0F, 0F);
      leftarm3.setTextureSize(128, 128);
      leftarm3.mirror = true;
      setRotation(leftarm3, 1.003822F, 0F, 0F);
      leftarm4 = new ModelRenderer(this, 50, 45);
      leftarm4.addBox(7.5F, -1.2F, -9F, 2, 1, 3);
      leftarm4.setRotationPoint(0F, 0F, 0F);
      leftarm4.setTextureSize(128, 128);
      leftarm4.mirror = true;
      setRotation(leftarm4, 0.1858931F, 0F, 0F);
      leftarm5 = new ModelRenderer(this, 50, 45);
      leftarm5.addBox(7F, -7.2F, -6F, 2, 2, 5);
      leftarm5.setRotationPoint(0F, 0F, 0F);
      leftarm5.setTextureSize(128, 128);
      leftarm5.mirror = true;
      setRotation(leftarm5, 1.487144F, 0F, 0F);
      rightarm5 = new ModelRenderer(this, 50, 45);
      rightarm5.addBox(-9F, -7.2F, -6F, 2, 2, 5);
      rightarm5.setRotationPoint(0F, 0F, 0F);
      rightarm5.setTextureSize(128, 128);
      rightarm5.mirror = true;
      setRotation(rightarm5, 1.487144F, 0F, 0F);
      leftarm6 = new ModelRenderer(this, 50, 45);
      leftarm6.addBox(7.5F, -7.7F, -10F, 1, 1, 7);
      leftarm6.setRotationPoint(0F, 0F, 0F);
      leftarm6.setTextureSize(128, 128);
      leftarm6.mirror = true;
      setRotation(leftarm6, 1.747395F, 0F, 0F);
      rightarm6 = new ModelRenderer(this, 50, 45);
      rightarm6.addBox(-8.5F, -7.7F, -10F, 1, 1, 7);
      rightarm6.setRotationPoint(0F, 0F, 0F);
      rightarm6.setTextureSize(128, 128);
      rightarm6.mirror = true;
      setRotation(rightarm6, 1.747395F, 0F, 0F);
      rightleg1 = new ModelRenderer(this, 0, 60);
      rightleg1.addBox(-3F, 2F, -3.5F, 4, 6, 4);
      rightleg1.setRotationPoint(0F, 0F, 0F);
      rightleg1.setTextureSize(128, 128);
      rightleg1.mirror = true;
      setRotation(rightleg1, 0.5227726F, 0F, 0F);
      rightleg2 = new ModelRenderer(this, 0, 60);
      rightleg2.addBox(-3F, 5F, 2.3F, 4, 7, 4);
      rightleg2.setRotationPoint(0F, 0F, 0F);
      rightleg2.setTextureSize(128, 128);
      rightleg2.mirror = true;
      setRotation(rightleg2, -0.3346075F, 0F, 0F);
      leftleg1 = new ModelRenderer(this, 0, 60);
      leftleg1.addBox(-2.8F, 2.5F, -3F, 4, 6, 4);
      leftleg1.setRotationPoint(0F, 0F, 0F);
      leftleg1.setTextureSize(128, 128);
      leftleg1.mirror = true;
      setRotation(leftleg1, 0F, 0F, -0.2602503F);
      leftleg2 = new ModelRenderer(this, 0, 60);
      leftleg2.addBox(-0.8F, 7.5F, -2.2F, 4, 5, 4);
      leftleg2.setRotationPoint(0F, 0F, 0F);
      leftleg2.setTextureSize(128, 128);
      leftleg2.mirror = true;
      setRotation(leftleg2, -0.1115358F, 0F, 0F);
      body1 = new ModelRenderer(this, 16, 30);
      body1.addBox(-4F, 0.5F, 0.5F, 8, 6, 4);
      body1.setRotationPoint(0F, 0F, 0F);
      body1.setTextureSize(128, 128);
      body1.mirror = true;
      setRotation(body1, 0.1115358F, 0F, 0F);
      body2 = new ModelRenderer(this, 16, 45);
      body2.addBox(-4F, 3.4F, 3.1F, 8, 8, 4);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(128, 128);
      body2.mirror = true;
      setRotation(body2, -0.4089647F, 0F, 0F);
      body3 = new ModelRenderer(this, 20, 60);
      body3.addBox(-4.5F, 2.4F, 3.1F, 9, 3, 4);
      body3.setRotationPoint(0F, 0F, 0F);
      body3.setTextureSize(128, 128);
      body3.mirror = true;
      setRotation(body3, -0.7435722F, 0F, 0F);
      body4 = new ModelRenderer(this, 20, 60);
      body4.addBox(-4.5F, 5.8F, -2.9F, 2, 4, 2);
      body4.setRotationPoint(0F, 0F, 0F);
      body4.setTextureSize(128, 128);
      body4.mirror = true;
      setRotation(body4, 0.2230717F, 0F, 0F);
      body5 = new ModelRenderer(this, 20, 60);
      body5.addBox(2.5F, 5.8F, -2.9F, 2, 4, 2);
      body5.setRotationPoint(0F, 0F, 0F);
      body5.setTextureSize(128, 128);
      body5.mirror = true;
      setRotation(body5, 0.2230717F, 0F, 0F);
      body6 = new ModelRenderer(this, 20, 60);
      body6.addBox(-2.5F, 6.8F, -4.9F, 2, 2, 5);
      body6.setRotationPoint(0F, 0F, 0F);
      body6.setTextureSize(128, 128);
      body6.mirror = true;
      setRotation(body6, 0F, 0.669215F, 0F);
      body7 = new ModelRenderer(this, 20, 60);
      body7.addBox(1F, 6.8F, -3.9F, 2, 2, 3);
      body7.setRotationPoint(0F, 0F, 0F);
      body7.setTextureSize(128, 128);
      body7.mirror = true;
      setRotation(body7, 0.2230717F, 0F, 0F);
      body8 = new ModelRenderer(this, 20, 60);
      body8.addBox(1F, 1.5F, -10.7F, 2, 2, 3);
      body8.setRotationPoint(0F, 0F, 0F);
      body8.setTextureSize(128, 128);
      body8.mirror = true;
      setRotation(body8, 1.07818F, 0F, 0F);
      body9 = new ModelRenderer(this, 20, 60);
      body9.addBox(-5F, 2.4F, -10F, 2, 2, 3);
      body9.setRotationPoint(0F, 0F, 0F);
      body9.setTextureSize(128, 128);
      body9.mirror = true;
      setRotation(body9, 0.8179294F, 0F, 0F);
      head1 = new ModelRenderer(this, 65, 0);
      head1.addBox(-3.5F, -1F, -2F, 7, 2, 5);
      head1.setRotationPoint(0F, 0F, 0F);
      head1.setTextureSize(128, 128);
      head1.mirror = true;
      setRotation(head1, 0.1115358F, 0F, 0F);
      head2 = new ModelRenderer(this, 40, 0);
      head2.addBox(-3.5F, -1F, -3F, 7, 1, 2);
      head2.setRotationPoint(0F, 0F, 0F);
      head2.setTextureSize(128, 128);
      head2.mirror = true;
      setRotation(head2, 0.8551081F, 0F, 0F);
      head3 = new ModelRenderer(this, 40, 0);
      head3.addBox(-3.5F, -2F, -5F, 1, 3, 3);
      head3.setRotationPoint(0F, 0F, 0F);
      head3.setTextureSize(128, 128);
      head3.mirror = true;
      setRotation(head3, 0F, 0.1487144F, 0F);
      head4 = new ModelRenderer(this, 40, 0);
      head4.addBox(2.5F, -2F, -5F, 1, 3, 3);
      head4.setRotationPoint(0F, 0F, 0F);
      head4.setTextureSize(128, 128);
      head4.mirror = true;
      setRotation(head4, 0F, -0.1487195F, 0F);
      
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedRightArm.setRotationPoint(-5.0F, 2.0F + p_i1149_2_, 0.0F);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedLeftArm.setRotationPoint(5.0F, 2.0F + p_i1149_2_, 0.0F);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedRightLeg.setRotationPoint(-1.9F, 12.0F + p_i1149_2_, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedLeftLeg.setRotationPoint(1.9F, 12.0F + p_i1149_2_, 0.0F);
      this.bipedHead = new ModelRenderer(this, 0, 0);
      this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 0, 0, 0, p_i1149_1_);
      this.bipedHead.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
      this.bipedBody = new ModelRenderer(this, 16, 16);
      this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedBody.setRotationPoint(0.0F, 0.0F + p_i1149_2_, 0.0F);
  
      this.bipedRightArm.addChild(rightarm);
      this.bipedRightArm.addChild(rightarm1);
      this.bipedRightArm.addChild(rightarm2);
      this.bipedRightArm.addChild(rightarm3);
      this.bipedRightArm.addChild(rightarm4);
      this.bipedRightArm.addChild(rightarm5);
      this.bipedRightArm.addChild(rightarm6);
      this.bipedLeftArm.addChild(leftarm);
      this.bipedLeftArm.addChild(leftarm1);
      this.bipedLeftArm.addChild(leftarm2);
      this.bipedLeftArm.addChild(leftarm3);
      this.bipedLeftArm.addChild(leftarm4);
      this.bipedLeftArm.addChild(leftarm5);
      this.bipedLeftArm.addChild(leftarm6);
      this.bipedBody.addChild(body);
      this.bipedBody.addChild(body1);
      this.bipedBody.addChild(body2);
      this.bipedBody.addChild(body3);
      this.bipedBody.addChild(body4);
      this.bipedBody.addChild(body5);
      this.bipedBody.addChild(body6);
      this.bipedBody.addChild(body7);
      this.bipedBody.addChild(body8);
      this.bipedBody.addChild(body9);
      this.bipedHead.addChild(head);
      this.bipedHead.addChild(head1);
      this.bipedHead.addChild(head2);
      this.bipedHead.addChild(head3);
      this.bipedHead.addChild(head4);
      this.bipedLeftLeg.addChild(leftleg);
      this.bipedLeftLeg.addChild(leftleg1);
      this.bipedLeftLeg.addChild(leftleg2);
      this.bipedRightLeg.addChild(rightleg);
      this.bipedRightLeg.addChild(rightleg1);
      this.bipedRightLeg.addChild(rightleg2);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity p_78088_1_, float p_78088_2_, float p_78088_3_, float p_78088_4_, float p_78088_5_, float p_78088_6_, float p_78088_7_)
    {
        this.setRotationAngles(p_78088_2_, p_78088_3_, p_78088_4_, p_78088_5_, p_78088_6_, p_78088_7_, p_78088_1_);

        if (this.isChild)
        {
            float f6 = 2.0F;
            GL11.glPushMatrix();
            GL11.glScalef(1.5F / f6, 1.5F / f6, 1.5F / f6);
            GL11.glTranslatef(0.0F, 16.0F * p_78088_7_, 0.0F);
            this.bipedHead.render(p_78088_7_);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
            GL11.glTranslatef(0.0F, 24.0F * p_78088_7_, 0.0F);
            this.bipedBody.render(p_78088_7_);
            this.bipedRightArm.render(p_78088_7_);
            this.bipedLeftArm.render(p_78088_7_);
            this.bipedRightLeg.render(p_78088_7_);
            this.bipedLeftLeg.render(p_78088_7_);
            this.bipedHeadwear.render(p_78088_7_);
            GL11.glPopMatrix();
        }
        else
        {
            this.bipedHead.render(p_78088_7_);
            this.bipedBody.render(p_78088_7_);
            this.bipedRightArm.render(p_78088_7_);
            this.bipedLeftArm.render(p_78088_7_);
            this.bipedRightLeg.render(p_78088_7_);
            this.bipedLeftLeg.render(p_78088_7_);
        }
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        this.bipedHead.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
        this.bipedRightArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
        this.bipedRightLeg.rotateAngleY = 0.0F;
        this.bipedLeftLeg.rotateAngleY = 0.0F;
        
//        this.bipedHead.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
//        this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
//        this.bipedRightArm.rotateAngleX = MathHelper.cos(0.0F) * p_78087_2_ * 0.0F;
//        this.bipedLeftArm.rotateAngleX = MathHelper.cos(0.0F) * p_78087_2_ * 0.0F;
//        
//        this.bipedRightArm.rotateAngleY = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 2.0F * p_78087_2_ * 0.5F;
//        this.bipedLeftArm.rotateAngleY = MathHelper.cos(p_78087_1_ * 0.6662F) * 2.0F * p_78087_2_ * 0.5F;
//        
//        this.bipedRightLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F) * 1.4F * p_78087_2_;
//        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(p_78087_1_ * 0.6662F + (float)Math.PI) * 1.4F * p_78087_2_;
//        this.bipedRightLeg.rotateAngleY = 0.0F;
//        this.bipedLeftLeg.rotateAngleY = 0.0F;

        if (this.isRiding)
        {
            this.bipedRightArm.rotateAngleX += -((float)Math.PI / 5F);
            this.bipedLeftArm.rotateAngleX += -((float)Math.PI / 5F);
            this.bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
            this.bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
            this.bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
        }

        if (this.heldItemLeft != 0)
        {
            this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemLeft;
        }

        if (this.heldItemRight != 0)
        {
            this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
        }

        this.bipedRightArm.rotateAngleY = 0.0F;
        this.bipedLeftArm.rotateAngleY = 0.0F;
        float f6;
        float f7;

//        if (this.onGround > -9990.0F)
//        {
//            f6 = this.onGround;
//            this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
//            this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
//            this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
//            this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
//            this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
//            this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
//            this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
//            this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
//            f6 = 1.0F - this.onGround;
//            f6 *= f6;
//            f6 *= f6;
//            f6 = 1.0F - f6;
//            f7 = MathHelper.sin(f6 * (float)Math.PI);
//            float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
//            this.bipedRightArm.rotateAngleX = (float)((double)this.bipedRightArm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
//            this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
//            this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
//        }

        if (this.isSneak)
        {
            this.bipedBody.rotateAngleX = 0.5F;
            this.bipedRightArm.rotateAngleX += 0.4F;
            this.bipedLeftArm.rotateAngleX += 0.4F;
            this.bipedRightLeg.rotationPointZ = 4.0F;
            this.bipedLeftLeg.rotationPointZ = 4.0F;
            this.bipedRightLeg.rotationPointY = 9.0F;
            this.bipedLeftLeg.rotationPointY = 9.0F;
            this.bipedHead.rotationPointY = 1.0F;
        }
        else
        {
            this.bipedBody.rotateAngleX = 0.0F;
            this.bipedRightLeg.rotationPointZ = 0.1F;
            this.bipedLeftLeg.rotationPointZ = 0.1F;
            this.bipedRightLeg.rotationPointY = 12.0F;
            this.bipedLeftLeg.rotationPointY = 12.0F;
            this.bipedHead.rotationPointY = 0F;
        }

        this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;

        if (this.aimedBow)
        {
            f6 = 0.0F;
            f7 = 0.0F;
            this.bipedRightArm.rotateAngleZ = 0.0F;
            this.bipedLeftArm.rotateAngleZ = 0.0F;
            this.bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F) + this.bipedHead.rotateAngleY;
            this.bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F + this.bipedHead.rotateAngleY + 0.4F;
            this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
            this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
            this.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
            this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
            this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
            this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
            this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
        }
    }

//    /**
//     * renders the ears (specifically, deadmau5's)
//     */
//    public void renderEars(float p_78110_1_)
//    {
//        this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
//        this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
//        this.bipedEars.rotationPointX = 0.0F;
//        this.bipedEars.rotationPointY = 0.0F;
//        this.bipedEars.render(p_78110_1_);
//    }

//    /**
//     * Renders the cloak of the current biped (in most cases, it's a player)
//     */
//    public void renderCloak(float p_78111_1_)
//    {
//        this.bipedCloak.render(p_78111_1_);
//    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

  }
