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


public class BanditNew5 extends ModelBiped {
	private final QRenderer head;
	private final ModelRenderer head_thing;
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
	private final QRenderer body;
	private final ModelRenderer backpack;
	private final ModelRenderer body_r1;
	private final ModelRenderer body_r2;
	private final ModelRenderer chestharness;
	private final ModelRenderer body_r3;
	private final ModelRenderer body_r4;
	private final ModelRenderer bone5;
	private final QRenderer rightarm;
	private final QRenderer leftarm;
	private final QRenderer rightleg;
	private final QRenderer leftleg;

	public BanditNew5() {
		textureWidth = 200;
		textureHeight = 64;

		head = new QRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		head_thing = new ModelRenderer(this);
		head_thing.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(head_thing);
		head_thing.cubeList.add(new ModelBox(head_thing, 103, 16, -4.0F, -7.8F, -4.0F, 8, 3, 8, 0.3F, false));
		head_thing.cubeList.add(new ModelBox(head_thing, 127, 0, -3.5F, -8.8F, -3.5F, 7, 1, 7, 0.0F, false));
		head_thing.cubeList.add(new ModelBox(head_thing, 157, 0, -4.0F, -6.6F, 3.75F, 8, 5, 1, 0.1F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 23.6F, 0.0F);
		head_thing.addChild(cube_r1);
		setRotation(cube_r1, -0.0592F, 0.0399F, -0.1569F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 135, 8, 0.1F, -25.8F, -6.1F, 5, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 23.7F, 0.0F);
		head_thing.addChild(cube_r2);
		setRotation(cube_r2, -0.0599F, -0.0389F, 0.1743F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 115, 43, -4.6F, -25.8F, -6.1F, 4, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r3);
		setRotation(cube_r3, -0.0181F, 0.383F, -1.3708F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 127, 20, 20.0F, -5.7F, 13.95F, 4, 1, 1, 0.1F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r4);
		setRotation(cube_r4, 0.0F, 0.384F, -0.9948F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 137, 20, 16.2F, -15.9F, 12.55F, 4, 1, 1, 0.1F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r5);
		setRotation(cube_r5, -0.1376F, -0.0262F, -0.0987F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 135, 47, 6.35F, -29.0F, -4.5F, 1, 3, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r6);
		setRotation(cube_r6, -0.1376F, 0.0262F, 0.0987F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 135, 55, -7.35F, -29.0F, -4.5F, 1, 3, 5, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 23.8F, 0.0F);
		head_thing.addChild(cube_r7);
		setRotation(cube_r7, 0.1578F, -0.009F, -0.0544F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 147, 0, -3.15F, -26.3F, 0.0F, 1, 2, 8, -0.1F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 23.8F, 0.0F);
		head_thing.addChild(cube_r8);
		setRotation(cube_r8, 0.1578F, 0.009F, 0.0544F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 151, 32, 2.15F, -26.3F, 0.0F, 1, 2, 8, -0.1F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r9);
		setRotation(cube_r9, 0.0909F, -0.0522F, -0.0699F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 159, 12, 1.8F, -26.0F, -2.3F, 4, 2, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 24.0F, 0.0F);
		head_thing.addChild(cube_r10);
		setRotation(cube_r10, 0.056F, 0.0522F, 0.0699F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 145, 36, -5.8F, -26.0F, -3.3F, 5, 2, 1, 0.0F, false));

		body = new QRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		backpack = new ModelRenderer(this);
		backpack.setRotationPoint(-2.05F, 0.85F, 2.1F);
		body.addChild(backpack);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		backpack.addChild(body_r1);
		setRotation(body_r1, -1.4401F, -0.4145F, -0.0583F);
		body_r1.cubeList.add(new ModelBox(body_r1, 23, 7, -1.0F, -2.0F, 0.0F, 4, 4, 9, 0.1F, false));

		body_r2 = new ModelRenderer(this);
		body_r2.setRotationPoint(4.1F, 0.0F, 0.0F);
		backpack.addChild(body_r2);
		setRotation(body_r2, -1.4401F, 0.4145F, 0.0583F);
		body_r2.cubeList.add(new ModelBox(body_r2, 15, 23, -3.0F, -2.0F, 0.0F, 4, 4, 9, 0.1F, false));

		chestharness = new ModelRenderer(this);
		chestharness.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(chestharness);
		chestharness.cubeList.add(new ModelBox(chestharness, 57, 32, -3.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 57, 16, 2.4F, 3.25F, -2.65F, 1, 3, 1, 0.0F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 57, 48, -4.0F, -0.25F, -2.0F, 2, 1, 4, 0.1F, false));
		chestharness.cubeList.add(new ModelBox(chestharness, 57, 53, 2.0F, -0.25F, -2.0F, 2, 1, 4, 0.1F, true));
		chestharness.cubeList.add(new ModelBox(chestharness, 89, 32, -4.0F, 7.9791F, -1.6516F, 8, 3, 4, 0.2F, false));

		body_r3 = new ModelRenderer(this);
		body_r3.setRotationPoint(3.0F, 11.5F, -4.15F);
		chestharness.addChild(body_r3);
		setRotation(body_r3, 0.0F, -0.3316F, -0.0524F);
		body_r3.cubeList.add(new ModelBox(body_r3, 57, 0, 0.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F, false));

		body_r4 = new ModelRenderer(this);
		body_r4.setRotationPoint(-3.0F, 11.5F, -4.15F);
		chestharness.addChild(body_r4);
		setRotation(body_r4, 0.0F, 0.3316F, 0.0524F);
		body_r4.cubeList.add(new ModelBox(body_r4, 81, 0, -2.0F, -6.0F, 0.0F, 2, 6, 2, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.9F, 3.25F, -2.75F);
		chestharness.addChild(bone5);
		setRotation(bone5, -0.1047F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 69, 32, -2.0F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 77, 16, -7.8F, -3.0F, 0.0F, 2, 3, 1, 0.0F, false));

		rightarm = new QRenderer(this);
		rightarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 40, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new QRenderer(this);
		leftarm.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 32, 36, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new QRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 16, 36, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new QRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));
	
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
