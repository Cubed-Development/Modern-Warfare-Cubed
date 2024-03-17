package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Jeans extends ModelBiped {
//	private final ModelRenderer head;
//	private final ModelRenderer body;
//	private final ModelRenderer rightarm;
//	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;

	public Jeans()
    {
        super(0.04f, 0, 64, 64);
      textureWidth = 64;
      textureHeight = 64;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		bipedBody = new ModelRenderer(this);
		bipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedBody.cubeList.add(new ModelBox(bipedBody, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		bipedRightArm = new ModelRenderer(this);
		bipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		bipedRightArm.cubeList.add(new ModelBox(bipedRightArm, 36, 36, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftArm = new ModelRenderer(this);
		bipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		bipedLeftArm.cubeList.add(new ModelBox(bipedLeftArm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));
		
		bipedRightLeg = new ModelRenderer(this);
		bipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		bipedRightLeg.cubeList.add(new ModelBox(bipedRightLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		bipedLeftLeg = new ModelRenderer(this);
		bipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		bipedLeftLeg.cubeList.add(new ModelBox(bipedLeftLeg, 24, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.11F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.11F, false));

		this.bipedLeftLeg.addChild(leftleg);
		this.bipedRightLeg.addChild(rightleg);
		
		this.bipedHeadwear.isHidden = true;
		this.bipedHead.isHidden = true;
		this.bipedBody.isHidden = true;
		this.bipedLeftArm.isHidden = true;
		this.bipedRightArm.isHidden = true;
//		this.bipedLeftLeg.isHidden = true; 
//		this.bipedRightLeg.isHidden = true; 
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		head.renderer(f5);
//		body.renderer(f5);
//		rightarm.renderer(f5);
//		leftarm.renderer(f5);
//		rightleg.renderer(f5);
//		leftleg.renderer(f5);
//		jacket.renderer(f5);
//		leftleg_usMC.renderer(f5);
//		rightleg_usMC.renderer(f5);
//		leftarm_usMC.renderer(f5);
//		rightarm_usMC.renderer(f5);
//		helmet.renderer(f5);
//		vest.renderer(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
