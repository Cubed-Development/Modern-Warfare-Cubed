package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class DefiledZombie extends ModelBiped
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer leftarm3;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;
    ModelRenderer rightarm;
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer rightleg1;
    ModelRenderer rightleg2;
    ModelRenderer leftleg1;
    ModelRenderer leftleg2;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
  
    /** Records whether the model should be rendered holding an item in the left hand, and if that item is a block. */
    public int heldItemLeft;
    /** Records whether the model should be rendered holding an item in the right hand, and if that item is a block. */
    public int heldItemRight;
    public boolean isSneak;
    /** Records whether the model should be rendered aiming a bow. */
    public boolean aimedBow;

    public DefiledZombie()
    {
        this(0.0F);
    }

    public DefiledZombie(float p_i1148_1_)
    {
        this(p_i1148_1_, 0.0F, 128, 128);
    }

    public DefiledZombie(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_)
    {
        this.textureWidth = p_i1149_3_;
        this.textureHeight = p_i1149_4_;
//        this.bipedCloak = new ModelRenderer(this, 0, 0);
//        this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1149_1_);
//        this.bipedEars = new ModelRenderer(this, 24, 0);
//        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1149_1_);
    
      head = new ModelRenderer(this, 25, 0);
      head.addBox(-4F, -6F, -4F, 8, 4, 8);
      head.setRotationPoint(0F, 0F, 0F);
      head.setTextureSize(128, 128);
      head.mirror = true;
      setRotation(head, -0.6320364F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 4, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(128, 128);
      body.mirror = true;
      setRotation(body, 0.4089647F, 0F, 0F);
      leftarm = new ModelRenderer(this, 0, 50);
      leftarm.addBox(-1F, -12.5F, -2F, 2, 12, 2);
      leftarm.setRotationPoint(-5F, 0F, -2F);
      leftarm.setTextureSize(128, 128);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0.3346075F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 4, 4);
      rightleg.setRotationPoint(0F, 0F, 0F);
      rightleg.setTextureSize(128, 128);
      rightleg.mirror = true;
      setRotation(rightleg, -0.669215F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2.5F, 4, 3, 4);
      leftleg.setRotationPoint(0F, 0F, 0F);
      leftleg.setTextureSize(128, 128);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, -0.7435722F);
      head1 = new ModelRenderer(this, 0, 0);
      head1.addBox(-4F, -2F, -4F, 1, 4, 8);
      head1.setRotationPoint(0F, 0F, 0F);
      head1.setTextureSize(128, 128);
      head1.mirror = true;
      setRotation(head1, -0.6320364F, 0F, 0F);
      head2 = new ModelRenderer(this, 0, 0);
      head2.addBox(3F, -2F, -4F, 1, 4, 8);
      head2.setRotationPoint(0F, 0F, 0F);
      head2.setTextureSize(128, 128);
      head2.mirror = true;
      setRotation(head2, -0.6320364F, 0F, 0F);
      head3 = new ModelRenderer(this, 0, 0);
      head3.addBox(-3.5F, 1.5F, -3F, 7, 2, 5);
      head3.setRotationPoint(0F, 0F, 0F);
      head3.setTextureSize(128, 128);
      head3.mirror = true;
      setRotation(head3, -1.003822F, 0F, 0F);
      head4 = new ModelRenderer(this, 25, 0);
      head4.addBox(-3F, -2F, 3F, 6, 4, 1);
      head4.setRotationPoint(0F, 0F, 0F);
      head4.setTextureSize(128, 128);
      head4.mirror = true;
      setRotation(head4, -0.6320364F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 0, 50);
      leftarm1.addBox(-10.8F, -10.3F, -2F, 2, 4, 2);
      leftarm1.setRotationPoint(-5F, 0F, -2F);
      leftarm1.setTextureSize(128, 128);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0F, 0F, 1.301251F);
      leftarm2 = new ModelRenderer(this, 0, 50);
      leftarm2.addBox(5.2F, -13.3F, 3.5F, 5, 2, 2);
      leftarm2.setRotationPoint(-5F, 0F, -2F);
      leftarm2.setTextureSize(128, 128);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0.8551081F, 0F);
      leftarm3 = new ModelRenderer(this, 0, 50);
      leftarm3.addBox(13.2F, -8.2F, -5.5F, 2, 16, 2);
      leftarm3.setRotationPoint(-5F, 0F, -2F);
      leftarm3.setTextureSize(128, 128);
      leftarm3.mirror = true;
      setRotation(leftarm3, 0F, 0F, -0.3717861F);
      leftarm4 = new ModelRenderer(this, 0, 50);
      leftarm4.addBox(14.2F, 2.8F, -4.5F, 3, 25, 3);
      leftarm4.setRotationPoint(-5F, 0F, -2F);
      leftarm4.setTextureSize(128, 128);
      leftarm4.mirror = true;
      setRotation(leftarm4, -0.3717861F, 0F, 0F);
      leftarm5 = new ModelRenderer(this, 0, 50);
      leftarm5.addBox(15.2F, -0.2F, -3.5F, 1, 22, 6);
      leftarm5.setRotationPoint(-5F, 0F, -2F);
      leftarm5.setTextureSize(128, 128);
      leftarm5.mirror = true;
      setRotation(leftarm5, -0.5576792F, 0F, 0F);
      rightarm = new ModelRenderer(this, 0, 50);
      rightarm.addBox(-1F, -12.5F, -1.5F, 2, 12, 2);
      rightarm.setRotationPoint(5F, 0F, -2F);
      rightarm.setTextureSize(128, 128);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, -0.4461433F);
      rightarm1 = new ModelRenderer(this, 0, 50);
      rightarm1.addBox(-5F, -12F, 3.5F, 2, 2, 8);
      rightarm1.setRotationPoint(5F, 0F, -2F);
      rightarm1.setTextureSize(128, 128);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, -0.8922867F, 0F);
      rightarm2 = new ModelRenderer(this, 0, 50);
      rightarm2.addBox(-12F, -10F, -8.5F, 2, 2, 18);
      rightarm2.setRotationPoint(5F, 0F, -2F);
      rightarm2.setTextureSize(128, 128);
      rightarm2.mirror = true;
      setRotation(rightarm2, -1.07818F, 0F, 0F);
      rightarm3 = new ModelRenderer(this, 0, 50);
      rightarm3.addBox(-10.5F, 8F, 11F, 3, 23, 3);
      rightarm3.setRotationPoint(5F, 0F, -2F);
      rightarm3.setTextureSize(128, 128);
      rightarm3.mirror = true;
      setRotation(rightarm3, 0F, 0F, 0.4089647F);
      rightarm4 = new ModelRenderer(this, 0, 50);
      rightarm4.addBox(-7.5F, 7F, 12F, 5, 18, 1);
      rightarm4.setRotationPoint(5F, 0F, -2F);
      rightarm4.setTextureSize(128, 128);
      rightarm4.mirror = true;
      setRotation(rightarm4, 0F, 0F, 0.5948578F);
      rightleg1 = new ModelRenderer(this, 0, 16);
      rightleg1.addBox(0F, 1F, -5F, 4, 4, 4);
      rightleg1.setRotationPoint(0F, 0F, 0F);
      rightleg1.setTextureSize(128, 128);
      rightleg1.mirror = true;
      setRotation(rightleg1, 0F, 0.8551081F, 0F);
      rightleg2 = new ModelRenderer(this, 0, 16);
      rightleg2.addBox(-4F, 3F, -5F, 4, 11, 4);
      rightleg2.setRotationPoint(0F, 0F, 0F);
      rightleg2.setTextureSize(128, 128);
      rightleg2.mirror = true;
      setRotation(rightleg2, -0.3717861F, 0F, 0F);
      leftleg1 = new ModelRenderer(this, 0, 16);
      leftleg1.addBox(0F, 0F, -4F, 4, 4, 4);
      leftleg1.setRotationPoint(0F, 0F, 0F);
      leftleg1.setTextureSize(128, 128);
      leftleg1.mirror = true;
      setRotation(leftleg1, 0F, -0.5948578F, 0F);
      leftleg2 = new ModelRenderer(this, 0, 16);
      leftleg2.addBox(2F, 1F, -2F, 4, 11, 4);
      leftleg2.setRotationPoint(0F, 0F, 0F);
      leftleg2.setTextureSize(128, 128);
      leftleg2.mirror = true;
      setRotation(leftleg2, 0.2974289F, 0F, 0F);
      body1 = new ModelRenderer(this, 16, 16);
      body1.addBox(-4F, 7F, 5F, 8, 4, 4);
      body1.setRotationPoint(0F, 0F, 0F);
      body1.setTextureSize(128, 128);
      body1.mirror = true;
      setRotation(body1, -0.5205006F, 0F, 0F);
      body2 = new ModelRenderer(this, 50, 16);
      body2.addBox(-1F, 3F, -1F, 2, 4, 2);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(128, 128);
      body2.mirror = true;
      setRotation(body2, 0.5205006F, 0F, 0F);
      body3 = new ModelRenderer(this, 50, 16);
      body3.addBox(-1F, 2F, 5F, 2, 6, 2);
      body3.setRotationPoint(0F, 0F, 0F);
      body3.setTextureSize(128, 128);
      body3.mirror = true;
      setRotation(body3, -0.4461433F, 0F, 0F);
      body4 = new ModelRenderer(this, 50, 16);
      body4.addBox(-2.5F, 5F, 0.5F, 5, 1, 1);
      body4.setRotationPoint(0F, 0F, 0F);
      body4.setTextureSize(128, 128);
      body4.mirror = true;
      setRotation(body4, 0.5205006F, 0F, 0F);
      body5 = new ModelRenderer(this, 50, 16);
      body5.addBox(-3F, 6F, 3F, 6, 1, 1);
      body5.setRotationPoint(0F, 0F, 0F);
      body5.setTextureSize(128, 128);
      body5.mirror = true;
      setRotation(body5, 0.1858931F, 0F, 0F);
      body6 = new ModelRenderer(this, 50, 16);
      body6.addBox(-3.5F, 5.2F, 5.8F, 7, 1, 1);
      body6.setRotationPoint(0F, 0F, 0F);
      body6.setTextureSize(128, 128);
      body6.mirror = true;
      setRotation(body6, -0.3346075F, 0F, 0F);
      body7 = new ModelRenderer(this, 50, 16);
      body7.addBox(-1F, -1F, -3F, 2, 4, 2);
      body7.setRotationPoint(0F, 0F, 0F);
      body7.setTextureSize(128, 128);
      body7.mirror = true;
      setRotation(body7, 0.9666439F, 0F, 0F);
      body8 = new ModelRenderer(this, 50, 16);
      body8.addBox(-0.5F, -4F, -2.8F, 1, 4, 1);
      body8.setRotationPoint(0F, 0F, 0F);
      body8.setTextureSize(128, 128);
      body8.mirror = true;
      setRotation(body8, 1.189716F, 0F, 0F);
  
      this.bipedRightArm = new ModelRenderer(this, 40, 16);
      this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedRightArm.setRotationPoint(-1.0F, 0.0F + p_i1149_2_, -2.0F);
      this.bipedLeftArm = new ModelRenderer(this, 40, 16);
      this.bipedLeftArm.mirror = true;
      this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedLeftArm.setRotationPoint(0.0F, 0.0F + p_i1149_2_, -2.0F);
      this.bipedRightLeg = new ModelRenderer(this, 0, 16);
      this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedRightLeg.setRotationPoint(-2.0F, 13.0F + p_i1149_2_, 0.0F);
      this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
      this.bipedLeftLeg.mirror = true;
      this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 0, 0, 0, p_i1149_1_);
      this.bipedLeftLeg.setRotationPoint(2.0F, 13.0F + p_i1149_2_, 0.0F);
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
      this.bipedLeftArm.addChild(leftarm);
      this.bipedLeftArm.addChild(leftarm1);
      this.bipedLeftArm.addChild(leftarm2);
      this.bipedLeftArm.addChild(leftarm3);
      this.bipedLeftArm.addChild(leftarm4);
      this.bipedLeftArm.addChild(leftarm5);
      this.bipedBody.addChild(body);
      this.bipedBody.addChild(body1);
      this.bipedBody.addChild(body2);
      this.bipedBody.addChild(body3);
      this.bipedBody.addChild(body4);
      this.bipedBody.addChild(body5);
      this.bipedBody.addChild(body6);
      this.bipedBody.addChild(body7);
      this.bipedBody.addChild(body8);
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
//            this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f6) * (float)Math.PI * 2.0F) * 0.2F;
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

//        this.bipedRightArm.rotateAngleZ += MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
//        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(p_78087_3_ * 0.09F) * 0.05F + 0.05F;
//        this.bipedRightArm.rotateAngleX += MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;
//        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(p_78087_3_ * 0.067F) * 0.05F;

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
