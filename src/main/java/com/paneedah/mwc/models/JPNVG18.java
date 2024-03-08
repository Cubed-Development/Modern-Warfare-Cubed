package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JPNVG18 extends ModelBiped {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer helmet;
	private final ModelRenderer helmet8_r1;
	private final ModelRenderer helmet7_r1;
	private final ModelRenderer helmet6_r1;
	private final ModelRenderer helmet5_r1;
	private final ModelRenderer helmet4_r1;
	private final ModelRenderer helmet3_r1;
	private final ModelRenderer helmet2_r1;
	private final ModelRenderer helmet1_r1;
	private final ModelRenderer bone4_r1;
	private final ModelRenderer bone3_r1;
	private final ModelRenderer bone2_r1;

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

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 23.3848F, -5.399F);
		

		helmet8_r1 = new ModelRenderer(this);
		helmet8_r1.setRotationPoint(0.0F, 0.6152F, 5.399F);
		helmet.addChild(helmet8_r1);
		setRotationAngle(helmet8_r1, 0.0F, -0.2443F, 0.0F);
		helmet8_r1.cubeList.add(new ModelBox(helmet8_r1, 25, 53, -1.6416F, -30.0F, -6.4645F, 4, 1, 1, 0.0F, false));
		helmet8_r1.cubeList.add(new ModelBox(helmet8_r1, 18, 44, -1.3505F, -29.0F, -6.5371F, 4, 1, 1, 0.0F, false));

		helmet7_r1 = new ModelRenderer(this);
		helmet7_r1.setRotationPoint(0.0F, 0.6152F, 5.399F);
		helmet.addChild(helmet7_r1);
		setRotationAngle(helmet7_r1, 0.0F, 0.2443F, 0.0F);
		helmet7_r1.cubeList.add(new ModelBox(helmet7_r1, 43, 53, -2.3505F, -30.0F, -6.4887F, 4, 1, 1, 0.0F, false));
		helmet7_r1.cubeList.add(new ModelBox(helmet7_r1, 48, 9, -2.5446F, -29.0F, -6.5371F, 4, 1, 1, 0.0F, false));

		helmet6_r1 = new ModelRenderer(this);
		helmet6_r1.setRotationPoint(0.0F, 0.1741F, 9.9787F);
		helmet.addChild(helmet6_r1);
		setRotationAngle(helmet6_r1, 0.192F, 0.0F, 0.0F);
		helmet6_r1.cubeList.add(new ModelBox(helmet6_r1, 44, 0, -3.7F, -25.6F, -4.1F, 8, 1, 3, 0.0F, false));
		helmet6_r1.cubeList.add(new ModelBox(helmet6_r1, 48, 4, -4.5F, -28.8147F, -2.2526F, 9, 4, 1, 0.0F, false));
		helmet6_r1.cubeList.add(new ModelBox(helmet6_r1, 24, 0, -1.5F, -25.4418F, -4.3345F, 3, 1, 3, 0.0F, false));
		helmet6_r1.cubeList.add(new ModelBox(helmet6_r1, 0, 0, -0.5F, -32.4991F, -5.629F, 1, 2, 3, 0.0F, false));
		helmet6_r1.cubeList.add(new ModelBox(helmet6_r1, 32, 53, -4.3F, -25.6F, -4.1F, 1, 1, 3, 0.0F, false));

		helmet5_r1 = new ModelRenderer(this);
		helmet5_r1.setRotationPoint(0.0F, 0.6005F, 4.5616F);
		helmet.addChild(helmet5_r1);
		setRotationAngle(helmet5_r1, -0.0349F, 0.0F, 0.0F);
		helmet5_r1.cubeList.add(new ModelBox(helmet5_r1, 36, 16, -1.5F, -32.5662F, -4.1596F, 3, 1, 8, 0.0F, false));
		helmet5_r1.cubeList.add(new ModelBox(helmet5_r1, 0, 50, -2.0F, -31.984F, 3.361F, 4, 7, 1, 0.0F, false));
		helmet5_r1.cubeList.add(new ModelBox(helmet5_r1, 21, 46, -4.2F, -25.2775F, -1.8144F, 4, 1, 6, 0.0F, false));
		helmet5_r1.cubeList.add(new ModelBox(helmet5_r1, 24, 16, 0.2F, -25.2775F, -1.8144F, 4, 1, 6, 0.0F, false));
		helmet5_r1.cubeList.add(new ModelBox(helmet5_r1, 12, 32, -2.5F, -29.2136F, 4.2583F, 5, 2, 1, 0.0F, false));

		helmet4_r1 = new ModelRenderer(this);
		helmet4_r1.setRotationPoint(0.0F, -1.2925F, -3.978F);
		helmet.addChild(helmet4_r1);
		setRotationAngle(helmet4_r1, -0.4014F, 0.0F, 0.0F);
		helmet4_r1.cubeList.add(new ModelBox(helmet4_r1, 53, 53, -1.5F, -30.2841F, -7.2271F, 3, 3, 1, 0.0F, false));
		helmet4_r1.cubeList.add(new ModelBox(helmet4_r1, 0, 5, -1.0F, -29.5881F, -7.7907F, 2, 2, 1, 0.0F, false));

		helmet3_r1 = new ModelRenderer(this);
		helmet3_r1.setRotationPoint(-5.2387F, -0.6944F, -0.4061F);
		helmet.addChild(helmet3_r1);
		setRotationAngle(helmet3_r1, -0.2443F, 0.0F, 0.2269F);
		helmet3_r1.cubeList.add(new ModelBox(helmet3_r1, 20, 16, -1.05F, -30.27F, -6.03F, 4, 2, 1, 0.0F, false));

		helmet2_r1 = new ModelRenderer(this);
		helmet2_r1.setRotationPoint(5.2387F, -0.6944F, -0.4061F);
		helmet.addChild(helmet2_r1);
		setRotationAngle(helmet2_r1, -0.2443F, 0.0F, -0.2269F);
		helmet2_r1.cubeList.add(new ModelBox(helmet2_r1, 36, 25, -2.9526F, -30.2438F, -6.0209F, 4, 2, 1, 0.0F, false));

		helmet1_r1 = new ModelRenderer(this);
		helmet1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmet1_r1);
		setRotationAngle(helmet1_r1, -0.2269F, 0.0F, 0.0F);
		helmet1_r1.cubeList.add(new ModelBox(helmet1_r1, 40, 25, -4.4F, -29.5306F, -5.5642F, 1, 2, 9, 0.0F, false));
		helmet1_r1.cubeList.add(new ModelBox(helmet1_r1, 18, 40, -3.4F, -30.5531F, 2.5332F, 7, 3, 1, 0.0F, false));
		helmet1_r1.cubeList.add(new ModelBox(helmet1_r1, 7, 39, 3.4F, -29.5306F, -5.5642F, 1, 2, 9, 0.0F, false));

		bone4_r1 = new ModelRenderer(this);
		bone4_r1.setRotationPoint(16.2291F, -6.4143F, 0.4374F);
		helmet.addChild(bone4_r1);
		setRotationAngle(bone4_r1, -0.2129F, 0.2082F, -0.8077F);
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 48, 11, 1.4841F, -28.5085F, -8.0659F, 1, 1, 3, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 40, 28, 1.2013F, -28.2257F, -8.0659F, 1, 1, 3, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 16, 35, 1.7669F, -28.2257F, -8.0659F, 1, 1, 3, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 0, 16, 1.4841F, -28.2257F, -8.0759F, 1, 1, 1, 0.0F, false));
		bone4_r1.cubeList.add(new ModelBox(bone4_r1, 24, 4, 1.4841F, -27.9429F, -8.0659F, 1, 1, 3, 0.0F, false));

		bone3_r1 = new ModelRenderer(this);
		bone3_r1.setRotationPoint(16.2291F, -6.4143F, 10.3606F);
		helmet.addChild(bone3_r1);
		setRotationAngle(bone3_r1, 0.2129F, -0.2082F, -0.8077F);
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 50, 15, 3.2048F, -26.7879F, -8.1F, 1, 1, 3, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 10, 50, 2.9219F, -26.505F, -8.1F, 1, 1, 3, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 49, 49, 3.4876F, -26.505F, -8.1F, 1, 1, 3, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 18, 3.2048F, -26.505F, -8.11F, 1, 1, 1, 0.0F, false));
		bone3_r1.cubeList.add(new ModelBox(bone3_r1, 48, 36, 3.2048F, -26.2222F, -8.1F, 1, 1, 3, 0.0F, false));

		bone2_r1 = new ModelRenderer(this);
		bone2_r1.setRotationPoint(16.9706F, -6.4143F, 5.399F);
		helmet.addChild(bone2_r1);
		setRotationAngle(bone2_r1, 0.0F, 0.0F, -0.7854F);
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 51, 29, 1.5077F, -28.4849F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 51, 25, 1.2249F, -28.2021F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 15, 51, 1.7906F, -28.2021F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 24, 24, 1.5077F, -28.2021F, -7.81F, 1, 1, 1, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 50, 19, 1.5077F, -27.9192F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 20, 53, 3.2048F, -26.7879F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 52, 40, 2.9219F, -26.505F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 52, 44, 3.4876F, -26.505F, -7.8F, 1, 1, 3, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 24, 19, 3.2048F, -26.505F, -7.81F, 1, 1, 1, 0.0F, false));
		bone2_r1.cubeList.add(new ModelBox(bone2_r1, 38, 52, 3.2048F, -26.2222F, -7.8F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		helmet.render(f5);
		
		super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}