package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class TornZombie extends ModelBiped
{
  //fields
    ModelRenderer leftarm1;
    ModelRenderer leftarm2;
    ModelRenderer leftarm3;
    ModelRenderer rightarm1;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer head1;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
    ModelRenderer head6;
    ModelRenderer head7;
  
    /** Records whether the model should be rendered holding an item in the left hand, and if that item is a block. */
    public int heldItemLeft;
    /** Records whether the model should be rendered holding an item in the right hand, and if that item is a block. */
    public int heldItemRight;
    public boolean isSneak;
    /** Records whether the model should be rendered aiming a bow. */
    public boolean aimedBow;

    public TornZombie()
    {
        this(0.0F);
    }

    public TornZombie(float p_i1148_1_)
    {
        this(p_i1148_1_, 0.0F, 128, 128);
    }

    public TornZombie(float p_i1149_1_, float p_i1149_2_, int p_i1149_3_, int p_i1149_4_)
    {
        this.textureWidth = p_i1149_3_;
        this.textureHeight = p_i1149_4_;
//        this.bipedCloak = new ModelRenderer(this, 0, 0);
//        this.bipedCloak.addBox(-5.0F, 0.0F, -1.0F, 10, 16, 1, p_i1149_1_);
//        this.bipedEars = new ModelRenderer(this, 24, 0);
//        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1, p_i1149_1_);
    
      bipedHead = new ModelRenderer(this, 0, 0);
      bipedHead.addBox(-4F, -8F, -4F, 5, 5, 8);
      bipedHead.setRotationPoint(0F, 0F, 0F);
      bipedHead.setTextureSize(128, 128);
      bipedHead.mirror = true;
      setRotation( bipedHead, 0F, 0F, 0.2230717F);
      bipedBody = new ModelRenderer(this, 16, 16);
      bipedBody.addBox(-4F, 0F, -2F, 8, 6, 4);
      bipedBody.setRotationPoint(0F, 0F, 0F);
      bipedBody.setTextureSize(128, 128);
      bipedBody.mirror = true;
      setRotation(bipedBody, 0.2230717F, 0F, 0F);
      bipedRightArm = new ModelRenderer(this, 0, 50);
      bipedRightArm.addBox(-3F, -2F, -2F, 4, 4, 4);
      bipedRightArm.setRotationPoint(-5F, 2F, 0F);
      bipedRightArm.setTextureSize(128, 128);
      bipedRightArm.mirror = true;
      setRotation(bipedRightArm, 0F, 0F, 0.1858931F);
      bipedLeftArm = new ModelRenderer(this, 0, 50);
      bipedLeftArm.addBox(-1F, -2F, -2F, 4, 2, 4);
      bipedLeftArm.setRotationPoint(5F, 2F, 0F);
      bipedLeftArm.setTextureSize(128, 128);
      bipedLeftArm.mirror = true;
      setRotation(bipedLeftArm, -0.1115358F, 0F, 0F);
      bipedRightLeg = new ModelRenderer(this, 0, 16);
      bipedRightLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedRightLeg.setRotationPoint(-2F, 12F, 0F);
      bipedRightLeg.setTextureSize(128, 128);
      bipedRightLeg.mirror = true;
      setRotation(bipedRightLeg, 0F, 0F, 0F);
      bipedLeftLeg = new ModelRenderer(this, 0, 16);
      bipedLeftLeg.addBox(-2F, 0F, -2F, 4, 12, 4);
      bipedLeftLeg.setRotationPoint(2F, 12F, 0F);
      bipedLeftLeg.setTextureSize(128, 128);
      bipedLeftLeg.mirror = true;
      setRotation(bipedLeftLeg, 0F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 0, 50);
      leftarm1.addBox(0F, -0.2F, -1F, 2, 1, 2);
      leftarm1.setRotationPoint(0F, 0F, 0F);
      leftarm1.setTextureSize(128, 128);
      leftarm1.mirror = true;
      setRotation(leftarm1, -0.1115358F, 0F, 0F);
      leftarm2 = new ModelRenderer(this, 0, 50);
      leftarm2.addBox(-1F, -3.3F, -2.3F, 4, 3, 4);
      leftarm2.setRotationPoint(0F, 0F, 0F);
      leftarm2.setTextureSize(128, 128);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0F, 0.4089647F);
      leftarm3 = new ModelRenderer(this, 0, 50);
      leftarm3.addBox(-1F, 0F, 0F, 4, 1, 2);
      leftarm3.setRotationPoint(0F, 0F, 0F);
      leftarm3.setTextureSize(128, 128);
      leftarm3.mirror = true;
      setRotation(leftarm3, -0.1115358F, 0F, 0F);
      rightarm1 = new ModelRenderer(this, 0, 50);
      rightarm1.addBox(-3.6F, -1.5F, -1.5F, 2, 3, 4);
      rightarm1.setRotationPoint(0F, 0F, 0F);
      rightarm1.setTextureSize(128, 128);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, 0F, -0.1115358F);
      body1 = new ModelRenderer(this, 16, 30);
      body1.addBox(-4F, 4.7F, -0F, 8, 8, 4);
      body1.setRotationPoint(0F, 0F, 0F);
      body1.setTextureSize(128, 128);
      body1.mirror = true;
      setRotation(body1, -0.3858931F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 50);
      body2.addBox(1F, 5.5F, -1.5F, 3, 3, 4);
      body2.setRotationPoint(0F, 0F, 0F);
      body2.setTextureSize(128, 128);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, -0.1487144F);
      body3 = new ModelRenderer(this, 0, 50);
      body3.addBox(4F, 3.5F, -2.3F, 2, 4, 2);
      body3.setRotationPoint(0F, 0F, 0F);
      body3.setTextureSize(128, 128);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0.1858931F);
      body4 = new ModelRenderer(this, 0, 50);
      body4.addBox(1F, 5.5F, -3F, 3, 1, 2);
      body4.setRotationPoint(0F, 0F, 0F);
      body4.setTextureSize(128, 128);
      body4.mirror = true;
      setRotation(body4, 0F, -0.1115358F, 0F);
      body5 = new ModelRenderer(this, 0, 50);
      body5.addBox(1F, 7F, -4.3F, 3, 2, 2);
      body5.setRotationPoint(0F, 0F, 0F);
      body5.setTextureSize(128, 128);
      body5.mirror = true;
      setRotation(body5, 0F, -0.4461433F, 0F);
      head1 = new ModelRenderer(this, 0, 50);
      head1.addBox(-4F, -3F, -2F, 8, 3, 6);
      head1.setRotationPoint(0F, 0F, 0F);
      head1.setTextureSize(128, 128);
      head1.mirror = true;
      setRotation(head1, 0F, 0F, 0.2230717F);
      head2 = new ModelRenderer(this, 0, 50);
      head2.addBox(-4F, -4F, -5F, 2, 3, 3);
      head2.setRotationPoint(0F, 0F, 0F);
      head2.setTextureSize(128, 128);
      head2.mirror = true;
      setRotation(head2, 0F, 0.1487144F, 0F);
      head3 = new ModelRenderer(this, 0, 50);
      head3.addBox(3.5F, -2.5F, -5F, 1, 3, 3);
      head3.setRotationPoint(0F, 0F, 0F);
      head3.setTextureSize(128, 128);
      head3.mirror = true;
      setRotation(head3, 0F, -0.1487195F, 0F);
      head4 = new ModelRenderer(this, 0, 50);
      head4.addBox(-4.5F, -5.5F, -3F, 3, 5, 5);
      head4.setRotationPoint(0F, 0F, 0F);
      head4.setTextureSize(128, 128);
      head4.mirror = true;
      setRotation(head4, 0F, 0F, -0.1858931F);
      head5 = new ModelRenderer(this, 0, 50);
      head5.addBox(-6.5F, -4F, -3.5F, 2, 2, 2);
      head5.setRotationPoint(0F, 0F, 0F);
      head5.setTextureSize(128, 128);
      head5.mirror = true;
      setRotation(head5, 0F, 0F, 0.4089647F);
      head6 = new ModelRenderer(this, 0, 50);
      head6.addBox(1F, -6F, -4F, 3, 3, 8);
      head6.setRotationPoint(0F, 0F, 0F);
      head6.setTextureSize(128, 128);
      head6.mirror = true;
      setRotation(head6, 0F, 0F, 0.2230717F);
      head7 = new ModelRenderer(this, 0, 70);
      head7.addBox(0.5F, -7.5F, -3.5F, 3, 3, 7);
      head7.setRotationPoint(0F, 0F, 0F);
      head7.setTextureSize(128, 128);
      head7.mirror = true;
      setRotation(head7, 0F, 0F, 0.2230717F);
      
      this.bipedRightArm.addChild(rightarm1);
      this.bipedLeftArm.addChild(leftarm1);
      this.bipedLeftArm.addChild(leftarm2);
      this.bipedLeftArm.addChild(leftarm3);
      this.bipedBody.addChild(body1);
      this.bipedBody.addChild(body2);
      this.bipedBody.addChild(body3);
      this.bipedBody.addChild(body4);
      this.bipedBody.addChild(body5);
      this.bipedHead.addChild(head1);
      this.bipedHead.addChild(head2);
      this.bipedHead.addChild(head3);
      this.bipedHead.addChild(head4);
      this.bipedHead.addChild(head5);
      this.bipedHead.addChild(head6);
      this.bipedHead.addChild(head7);
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
      this.bipedHead.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
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
          this.bipedBody.rotateAngleX = 0.2230717F;
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

//      /**
//       * renders the ears (specifically, deadmau5's)
//       */
//      public void renderEars(float p_78110_1_)
//      {
//          this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
//          this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
//          this.bipedEars.rotationPointX = 0.0F;
//          this.bipedEars.rotationPointY = 0.0F;
//          this.bipedEars.render(p_78110_1_);
//      }
    
//      /**
//       * Renders the cloak of the current biped (in most cases, it's a player)
//       */
//      public void renderCloak(float p_78111_1_)
//      {
//          this.bipedCloak.render(p_78111_1_);
//      }
      
      private void setRotation(ModelRenderer model, float x, float y, float z)
      {
          model.rotateAngleX = x;
          model.rotateAngleY = y;
          model.rotateAngleZ = z;
      }
  
}

