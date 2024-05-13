package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RipperZombie extends ModelBiped
{
  //fields
    ModelRenderer rightarm1;
    ModelRenderer rightarm2;
    ModelRenderer rightarm3;
    ModelRenderer rightarm4;
    ModelRenderer rightarm5;
    ModelRenderer rightarm6;
    ModelRenderer rightarm7;
    ModelRenderer rightarm8;
    ModelRenderer rightarm9;
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer leftarm3;
    ModelRenderer leftarm4;
    ModelRenderer leftarm5;
    ModelRenderer leftarm6;
    ModelRenderer leftarm7;
    ModelRenderer leftarm8;
    ModelRenderer leftarm9;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
  
    /** Records whether the model should be rendered holding an item in the left hand, and if that item is a block. */
    public int heldItemLeft;
    /** Records whether the model should be rendered holding an item in the right hand, and if that item is a block. */
    public int heldItemRight;
    public boolean isSneak;
    /** Records whether the model should be rendered aiming a bow. */
    public boolean aimedBow;

    public RipperZombie()
    {
        this(0.0F);
    }

    public RipperZombie(float p_i1148_1_)
    {
        this(p_i1148_1_, 0.0F, 256, 256);
    }

    public RipperZombie(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_)
    {
        this.textureWidth = p_i1149_3_;
        this.textureHeight = p_i1149_4_;
//        this.bipedCloak = new ModelRenderer(this, 0, 0);
//        this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1149_1_);
//        this.bipedEars = new ModelRenderer(this, 24, 0);
//        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1149_1_);
    
      bipedHead = new ModelRenderer(this, 0, 0);
      bipedHead.addBox(-4F, -8F, -4F, 8, 5, 8);
      bipedHead.setRotationPoint(0F, 0F, 0F);
      bipedHead.setTextureSize(64, 32);
      bipedHead.mirror = true;
      setRotation(bipedHead, 0F, 0F, 0F);
      bipedBody = new ModelRenderer(this, 16, 16);
      bipedBody.addBox(-4F, 0F, -2F, 8, 7, 4);
      bipedBody.setRotationPoint(0F, 0F, 0F);
      bipedBody.setTextureSize(64, 32);
      bipedBody.mirror = true;
      setRotation(bipedBody, 0.1115358F, 0F, 0F);
      bipedRightArm = new ModelRenderer(this, 0, 50);
      bipedRightArm.addBox(-3F, -2F, -2F, 4, 6, 4);
      bipedRightArm.setRotationPoint(-5F, 2F, 0F);
      bipedRightArm.setTextureSize(64, 32);
      bipedRightArm.mirror = true;
      setRotation(bipedRightArm, 0.4461433F, 0F, 0F);
      bipedLeftArm = new ModelRenderer(this, 0, 50);
      bipedLeftArm.addBox(-1F, -2F, -2F, 4, 6, 4);
      bipedLeftArm.setRotationPoint(5F, 2F, 0F);
      bipedLeftArm.setTextureSize(64, 32);
      bipedLeftArm.mirror = true;
      setRotation(bipedLeftArm, 0.4461433F, 0F, 0F);
      bipedRightLeg = new ModelRenderer(this, 0, 16);
      bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
      bipedRightLeg.setTextureSize(64, 32);
      bipedRightLeg.mirror = true;
      setRotation(bipedRightLeg, 0F, 0F, 0F);
      bipedLeftLeg = new ModelRenderer(this, 0, 16);
      bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
      bipedLeftLeg.setTextureSize(64, 32);
      bipedLeftLeg.mirror = true;
      setRotation(bipedLeftLeg, 0F, 0F, 0F);
      rightarm1 = new ModelRenderer(this, 0, 50);
      rightarm1.addBox(-2F, 3F, -0.5F, 4, 4, 4);
      rightarm1.setRotationPoint(0F, 0F, 0F);
      rightarm1.setTextureSize(64, 32);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, 0F, 0.2602503F);
      rightarm2 = new ModelRenderer(this, 0, 50);
      rightarm2.addBox(0.3F, 5F, -1F, 2, 4, 3);
      rightarm2.setRotationPoint(0F, 0F, 0F);
      rightarm2.setTextureSize(64, 32);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, 0F, 0.2974289F);
      rightarm3 = new ModelRenderer(this, 0, 50);
      rightarm3.addBox(-3F, 3F, 3.5F, 2, 8, 3);
      rightarm3.setRotationPoint(0F, 0F, 0F);
      rightarm3.setTextureSize(64, 32);
      rightarm3.mirror = true;
      setRotation(rightarm3, -0.4461433F, 0F, 0F);
      rightarm4 = new ModelRenderer(this, 0, 50);
      rightarm4.addBox(-2.5F, 9.5F, 0.5F, 1, 4, 3);
      rightarm4.setRotationPoint(0F, 0F, 0F);
      rightarm4.setTextureSize(64, 32);
      rightarm4.mirror = true;
      setRotation(rightarm4, -0.1115358F, 0F, 0F);
      rightarm5 = new ModelRenderer(this, 0, 50);
      rightarm5.addBox(-2.5F, 10.5F, 4F, 1, 1, 3);
      rightarm5.setRotationPoint(0F, 0F, 0F);
      rightarm5.setTextureSize(64, 32);
      rightarm5.mirror = true;
      setRotation(rightarm5, -0.6320364F, 0F, 0F);
      rightarm6 = new ModelRenderer(this, 0, 50);
      rightarm6.addBox(-2.5F, 11.5F, -6.5F, 1, 1, 3);
      rightarm6.setRotationPoint(0F, 0F, 0F);
      rightarm6.setTextureSize(64, 32);
      rightarm6.mirror = true;
      setRotation(rightarm6, 0.6320361F, 0F, 0F);
      rightarm7 = new ModelRenderer(this, 0, 50);
      rightarm7.addBox(-2.5F, 10.5F, -4.8F, 1, 2, 3);
      rightarm7.setRotationPoint(0F, 0F, 0F);
      rightarm7.setTextureSize(64, 32);
      rightarm7.mirror = true;
      setRotation(rightarm7, 0.1858931F, 0F, 0F);
      rightarm8 = new ModelRenderer(this, 0, 50);
      rightarm8.addBox(-2.5F, 10F, 5F, 1, 2, 2);
      rightarm8.setRotationPoint(0F, 0F, 0F);
      rightarm8.setTextureSize(64, 32);
      rightarm8.mirror = true;
      setRotation(rightarm8, -0.2974309F, 0F, 0F);
      rightarm9 = new ModelRenderer(this, 0, 50);
      rightarm9.addBox(-4.5F, 2F, 0F, 3, 6, 3);
      rightarm9.setRotationPoint(0F, 0F, 0F);
      rightarm9.setTextureSize(64, 32);
      rightarm9.mirror = true;
      setRotation(rightarm9, 0F, 0F, -0.0743572F);
      leftarm1 = new ModelRenderer(this, 0, 50);
      leftarm1.addBox(-2F, 3F, -0.5F, 4, 4, 4);
      leftarm1.setRotationPoint(0F, 0F, 0F);
      leftarm1.setTextureSize(64, 32);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0F, 0F, -0.2602429F);
      leftarm2 = new ModelRenderer(this, 0, 50);
      leftarm2.addBox(-2.3F, 5F, -1F, 2, 4, 3);
      leftarm2.setRotationPoint(0F, 0F, 0F);
      leftarm2.setTextureSize(64, 32);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0F, -0.2974216F);
      leftarm3 = new ModelRenderer(this, 0, 50);
      leftarm3.addBox(1F, 3F, 3.5F, 2, 8, 3);
      leftarm3.setRotationPoint(0F, 0F, 0F);
      leftarm3.setTextureSize(64, 32);
      leftarm3.mirror = true;
      setRotation(leftarm3, -0.4461433F, 0F, 0F);
      leftarm4 = new ModelRenderer(this, 0, 50);
      leftarm4.addBox(1.5F, 9.5F, 0.5F, 1, 4, 3);
      leftarm4.setRotationPoint(0F, 0F, 0F);
      leftarm4.setTextureSize(64, 32);
      leftarm4.mirror = true;
      setRotation(leftarm4, -0.1115358F, 0F, 0F);
      leftarm5 = new ModelRenderer(this, 0, 50);
      leftarm5.addBox(1.5F, 10.5F, 4F, 1, 1, 3);
      leftarm5.setRotationPoint(0F, 0F, 0F);
      leftarm5.setTextureSize(64, 32);
      leftarm5.mirror = true;
      setRotation(leftarm5, -0.6320364F, 0F, 0F);
      leftarm6 = new ModelRenderer(this, 0, 50);
      leftarm6.addBox(1.5F, 11.5F, -6.5F, 1, 1, 3);
      leftarm6.setRotationPoint(0F, 0F, 0F);
      leftarm6.setTextureSize(64, 32);
      leftarm6.mirror = true;
      setRotation(leftarm6, 0.6320361F, 0F, 0F);
      leftarm7 = new ModelRenderer(this, 0, 50);
      leftarm7.addBox(1.5F, 10.5F, -4.8F, 1, 2, 3);
      leftarm7.setRotationPoint(0F, 0F, 0F);
      leftarm7.setTextureSize(64, 32);
      leftarm7.mirror = true;
      setRotation(leftarm7, 0.1858931F, 0F, 0F);
      leftarm8 = new ModelRenderer(this, 0, 50);
      leftarm8.addBox(1.5F, 10F, 5F, 1, 2, 2);
      leftarm8.setRotationPoint(0F, 0F, 0F);
      leftarm8.setTextureSize(64, 32);
      leftarm8.mirror = true;
      setRotation(leftarm8, -0.2974309F, 0F, 0F);
      leftarm9 = new ModelRenderer(this, 0, 50);
      leftarm9.addBox(1.5F, 2F, 0F, 3, 6, 3);
      leftarm9.setRotationPoint(0F, 0F, 0F);
      leftarm9.setTextureSize(64, 32);
      leftarm9.mirror = true;
      setRotation(leftarm9, 0F, 0F, 0.074351F);
      body1 = new ModelRenderer(this, 16, 32);
      body1.addBox(-4F, 6.05F, -0.5F, 8, 6, 4);
      body1.setRotationPoint(0F, 0F, 0F);
      body1.setTextureSize(64, 32);
      body1.mirror = true;
      setRotation(body1, -0.2387144F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 50);
      body2.addBox(-4F, 2F, -2.5F, 3, 3, 1);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(64, 32);
      body2.mirror = true;
      setRotation(body2, 0F, 0.1858931F, 0F);
      body3 = new ModelRenderer(this, 0, 50);
      body3.addBox(-3F, 5F, -4F, 3, 2, 2);
      body3.setRotationPoint(0F, 0F, 0F);
      body3.setTextureSize(64, 32);
      body3.mirror = true;
      setRotation(body3, 0F, 0.7063936F, 0F);
      body4 = new ModelRenderer(this, 0, 50);
      body4.addBox(0F, 2F, -3F, 4, 2, 1);
      body4.setRotationPoint(0F, 0F, 0F);
      body4.setTextureSize(64, 32);
      body4.mirror = true;
      setRotation(body4, 0F, -0.3346075F, 0F);
      body5 = new ModelRenderer(this, 0, 50);
      body5.addBox(1F, 4F, -2.5F, 3, 1, 1);
      body5.setRotationPoint(0F, 0F, 0F);
      body5.setTextureSize(64, 32);
      body5.mirror = true;
      setRotation(body5, 0F, -0.1115358F, 0F);
      body6 = new ModelRenderer(this, 0, 50);
      body6.addBox(0.5F, 5.5F, -3.5F, 3, 1, 2);
      body6.setRotationPoint(0F, 0F, 0F);
      body6.setTextureSize(64, 32);
      body6.mirror = true;
      setRotation(body6, 0F, -0.4833219F, 0F);
      head1 = new ModelRenderer(this, 0, 50);
      head1.addBox(-4.5F, -2.5F, -0.5F, 3, 3, 4);
      head1.setRotationPoint(0F, 0F, 0F);
      head1.setTextureSize(64, 32);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, -0.2602503F);
      head2 = new ModelRenderer(this, 0, 50);
      head2.addBox(1.5F, -2.5F, -0.5F, 3, 3, 4);
      head2.setRotationPoint(0F, 0F, 0F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0.260246F);
      head3 = new ModelRenderer(this, 0, 50);
      head3.addBox(-4F, -3F, -1F, 8, 3, 5);
      head3.setRotationPoint(0F, 0F, 0F);
      head3.setTextureSize(64, 32);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      head4 = new ModelRenderer(this, 0, 50);
      head4.addBox(-4F, -3F, -5.5F, 1, 3, 5);
      head4.setRotationPoint(0F, 0F, 0F);
      head4.setTextureSize(64, 32);
      head4.mirror = true;
      setRotation(head4, 0F, 0.1858931F, 0F);
      head5 = new ModelRenderer(this, 0, 50);
      head5.addBox(3F, -3F, -5.5F, 1, 3, 5);
      head5.setRotationPoint(0F, 0F, 0F);
      head5.setTextureSize(64, 32);
      head5.mirror = true;
      setRotation(head5, 0F, -0.185895F, 0F);
  
      this.bipedRightArm.addChild(rightarm1);
      this.bipedRightArm.addChild(rightarm2);
      this.bipedRightArm.addChild(rightarm3);
      this.bipedRightArm.addChild(rightarm4);
      this.bipedRightArm.addChild(rightarm5);
      this.bipedRightArm.addChild(rightarm6);
      this.bipedRightArm.addChild(rightarm7);
      this.bipedRightArm.addChild(rightarm8);
      this.bipedRightArm.addChild(rightarm9);
      this.bipedLeftArm.addChild(leftarm1);
      this.bipedLeftArm.addChild(leftarm2);
      this.bipedLeftArm.addChild(leftarm3);
      this.bipedLeftArm.addChild(leftarm4);
      this.bipedLeftArm.addChild(leftarm5);
      this.bipedLeftArm.addChild(leftarm6);
      this.bipedLeftArm.addChild(leftarm7);
      this.bipedLeftArm.addChild(leftarm8);
      this.bipedLeftArm.addChild(leftarm9);
      this.bipedBody.addChild(body1);
      this.bipedBody.addChild(body2);
      this.bipedBody.addChild(body3);
      this.bipedBody.addChild(body4);
      this.bipedBody.addChild(body5);
      this.bipedBody.addChild(body6);
      this.bipedHead.addChild(head1);
      this.bipedHead.addChild(head2);
      this.bipedHead.addChild(head3);
      this.bipedHead.addChild(head4);
      this.bipedHead.addChild(head5);
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
          this.bipedHeadwear.render(p_78088_7_);
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
      this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI) + 0.2602503F;
      this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
      this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
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

//      if (this.onGround > -9990.0F)
//      {
//          f6 = this.onGround;
//          this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f6) * (float)Math.PI * 2.0F) * 0.2F;
//          this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0F;
//          this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY;
//          this.bipedLeftArm.rotateAngleY += this.bipedBody.rotateAngleY;
//          this.bipedLeftArm.rotateAngleX += this.bipedBody.rotateAngleY;
//          f6 = 1.0F - this.onGround;
//          f6 *= f6;
//          f6 *= f6;
//          f6 = 1.0F - f6;
//          f7 = MathHelper.sin(f6 * (float)Math.PI);
//          float f8 = MathHelper.sin(this.onGround * (float)Math.PI) * -(this.bipedHead.rotateAngleX - 0.7F) * 0.75F;
//          this.bipedRightArm.rotateAngleX = (float)((double)this.bipedRightArm.rotateAngleX - ((double)f7 * 1.2D + (double)f8));
//          this.bipedRightArm.rotateAngleY += this.bipedBody.rotateAngleY * 2.0F;
//          this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * (float)Math.PI) * -0.4F;
//      }

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
          this.bipedHeadwear.rotationPointY = 1.0F;
      }
      else
      {
          this.bipedBody.rotateAngleX = 0.1115358F;
          this.bipedRightLeg.rotationPointZ = 0.1F;
          this.bipedLeftLeg.rotationPointZ = 0.1F;
          this.bipedRightLeg.rotationPointY = 12.0F;
          this.bipedLeftLeg.rotationPointY = 12.0F;
          this.bipedHead.rotationPointY = 0.0F;
          this.bipedHeadwear.rotationPointY = 0.0F;
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

//  /**
//   * renders the ears (specifically, deadmau5's)
//   */
//  public void renderEars(float p_78110_1_)
//  {
//      this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
//      this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
//      this.bipedEars.rotationPointX = 0.0F;
//      this.bipedEars.rotationPointY = 0.0F;
//      this.bipedEars.renderer(p_78110_1_);
//  }

//  /**
//   * Renders the cloak of the current biped (in most cases, it's a player)
//   */
//  public void renderCloak(float p_78111_1_)
//  {
//      this.bipedCloak.renderer(p_78111_1_);
//  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
  }

}
