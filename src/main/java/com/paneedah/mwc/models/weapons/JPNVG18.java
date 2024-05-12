package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class JPNVG18 extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer helmet1;
	private final ModelRenderer helmet2;
	private final ModelRenderer helmet3;
	private final ModelRenderer helmet4;
	private final ModelRenderer helmet5;
	private final ModelRenderer helmet6;
	private final ModelRenderer helmet7;
	private final ModelRenderer helmet8;
	private final ModelRenderer helmet9;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer helmet10;
	private final ModelRenderer bone3;
	private final ModelRenderer helmet11;
	private final ModelRenderer bone4;

	public JPNVG18()
    {
        super(0.01f, 0, 128, 128);
      textureWidth = 128;
      textureHeight = 128;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 0, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 36, 36, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 32, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 24, 24, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, false));

		helmet1 = new ModelRenderer(this);
		helmet1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet1, -0.2269F, 0.0F, 0.0F);
		helmet1.cubeList.add(new ModelBox(helmet1, 40, 25, -4.4F, -5.5306F, -5.5642F, 1, 2, 9, 0.0F, false));
		helmet1.cubeList.add(new ModelBox(helmet1, 18, 40, -3.4F, -6.5531F, 2.5332F, 7, 3, 1, 0.0F, false));
		helmet1.cubeList.add(new ModelBox(helmet1, 7, 39, 3.4F, -5.5306F, -5.5642F, 1, 2, 9, 0.0F, false));

		helmet2 = new ModelRenderer(this);
		helmet2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet2, -0.2443F, 0.0F, -0.2269F);
		helmet2.cubeList.add(new ModelBox(helmet2, 36, 25, -2.9526F, -6.2438F, -6.0209F, 4, 2, 1, 0.0F, false));

		helmet3 = new ModelRenderer(this);
		helmet3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet3, -0.2443F, 0.0F, 0.2269F);
		helmet3.cubeList.add(new ModelBox(helmet3, 20, 16, -1.05F, -6.27F, -6.03F, 4, 2, 1, 0.0F, false));

		helmet4 = new ModelRenderer(this);
		helmet4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet4, -0.4014F, 0.0F, 0.0F);
		helmet4.cubeList.add(new ModelBox(helmet4, 53, 53, -1.5F, -6.2841F, -7.2271F, 3, 3, 1, 0.0F, false));
		helmet4.cubeList.add(new ModelBox(helmet4, 0, 5, -1.0F, -5.5881F, -7.7907F, 2, 2, 1, 0.0F, false));

		helmet5 = new ModelRenderer(this);
		helmet5.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet5, -0.0349F, 0.0F, 0.0F);
		helmet5.cubeList.add(new ModelBox(helmet5, 36, 16, -1.5F, -8.5662F, -4.1596F, 3, 1, 8, 0.0F, false));
		helmet5.cubeList.add(new ModelBox(helmet5, 0, 50, -2.0F, -7.984F, 3.361F, 4, 7, 1, 0.0F, false));
		helmet5.cubeList.add(new ModelBox(helmet5, 21, 46, -4.2F, -1.2775F, -1.8144F, 4, 1, 6, 0.0F, false));
		helmet5.cubeList.add(new ModelBox(helmet5, 24, 16, 0.2F, -1.2775F, -1.8144F, 4, 1, 6, 0.0F, false));
		helmet5.cubeList.add(new ModelBox(helmet5, 12, 32, -2.5F, -5.2136F, 4.2583F, 5, 2, 1, 0.0F, false));

		helmet6 = new ModelRenderer(this);
		helmet6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet6, 0.192F, 0.0F, 0.0F);
		helmet6.cubeList.add(new ModelBox(helmet6, 44, 0, -3.7F, -1.6F, -4.1F, 8, 1, 3, 0.0F, false));
		helmet6.cubeList.add(new ModelBox(helmet6, 48, 4, -4.5F, -4.8147F, -2.2526F, 9, 4, 1, 0.0F, false));
		helmet6.cubeList.add(new ModelBox(helmet6, 24, 0, -1.5F, -1.4418F, -4.3345F, 3, 1, 3, 0.0F, false));
		helmet6.cubeList.add(new ModelBox(helmet6, 0, 0, -0.5F, -8.4991F, -5.629F, 1, 2, 3, 0.0F, false));
		helmet6.cubeList.add(new ModelBox(helmet6, 32, 53, -4.3F, -1.6F, -4.1F, 1, 1, 3, 0.0F, false));

		helmet7 = new ModelRenderer(this);
		helmet7.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet7, 0.0F, 0.2443F, 0.0F);
		helmet7.cubeList.add(new ModelBox(helmet7, 43, 53, -2.3505F, -6.0F, -6.4887F, 4, 1, 1, 0.0F, false));
		helmet7.cubeList.add(new ModelBox(helmet7, 48, 9, -2.5446F, -5.0F, -6.5371F, 4, 1, 1, 0.0F, false));

		helmet8 = new ModelRenderer(this);
		helmet8.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet8, 0.0F, -0.2443F, 0.0F);
		helmet8.cubeList.add(new ModelBox(helmet8, 25, 53, -1.6416F, -6.0F, -6.4645F, 4, 1, 1, 0.0F, false));
		helmet8.cubeList.add(new ModelBox(helmet8, 18, 44, -1.3505F, -5.0F, -6.5371F, 4, 1, 1, 0.0F, false));

		helmet9 = new ModelRenderer(this);
		helmet9.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet9.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.7854F);
		bone.cubeList.add(new ModelBox(bone, 20, 53, 3.2048F, -2.7879F, -7.8F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 40, 2.9219F, -2.505F, -7.8F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 52, 44, 3.4876F, -2.505F, -7.8F, 1, 1, 3, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 24, 19, 3.2048F, -2.505F, -7.81F, 1, 1, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 38, 52, 3.2048F, -2.2222F, -7.8F, 1, 1, 3, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet9.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.7854F);
		bone2.cubeList.add(new ModelBox(bone2, 51, 29, 1.5077F, -4.4849F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 51, 25, 1.2249F, -4.2021F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 15, 51, 1.7906F, -4.2021F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 24, 24, 1.5077F, -4.2021F, -7.81F, 1, 1, 1, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 50, 19, 1.5077F, -3.9192F, -7.8F, 1, 1, 3, 0.0F, false));

		helmet10 = new ModelRenderer(this);
		helmet10.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet10, 0.0F, -0.2967F, 0.0F);
		

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet10.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.7854F);
		bone3.cubeList.add(new ModelBox(bone3, 50, 15, 3.2048F, -2.7879F, -8.1F, 1, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 10, 50, 2.9219F, -2.505F, -8.1F, 1, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 49, 49, 3.4876F, -2.505F, -8.1F, 1, 1, 3, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 18, 3.2048F, -2.505F, -8.11F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 48, 36, 3.2048F, -2.2222F, -8.1F, 1, 1, 3, 0.0F, false));

		helmet11 = new ModelRenderer(this);
		helmet11.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(helmet11, 0.0F, 0.2967F, 0.0F);
		

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet11.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.7854F);
		bone4.cubeList.add(new ModelBox(bone4, 48, 11, 1.4841F, -4.5085F, -8.0659F, 1, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 40, 28, 1.2013F, -4.2257F, -8.0659F, 1, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 16, 35, 1.7669F, -4.2257F, -8.0659F, 1, 1, 3, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 16, 1.4841F, -4.2257F, -8.0759F, 1, 1, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 24, 4, 1.4841F, -3.9429F, -8.0659F, 1, 1, 3, 0.0F, false));
		
		this.bipedHead.addChild(helmet1);
		this.bipedHead.addChild(helmet2);
		this.bipedHead.addChild(helmet3);
		this.bipedHead.addChild(helmet4);
		this.bipedHead.addChild(helmet5);
		this.bipedHead.addChild(helmet6);
		this.bipedHead.addChild(helmet7);
		this.bipedHead.addChild(helmet8);
		this.bipedHead.addChild(helmet9);
		this.bipedHead.addChild(helmet10);
		this.bipedHead.addChild(helmet11);
		
    }

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		helmet1.render(f5);
		helmet2.render(f5);
		helmet3.render(f5);
		helmet4.render(f5);
		helmet5.render(f5);
		helmet6.render(f5);
		helmet7.render(f5);
		helmet8.render(f5);
		helmet9.render(f5);
		helmet10.render(f5);
		helmet11.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
