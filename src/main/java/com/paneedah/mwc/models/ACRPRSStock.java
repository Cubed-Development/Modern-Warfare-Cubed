package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRPRSStock extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer ACR175;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer ACR181;
	private final ModelRenderer ACR185;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone14;
	private final ModelRenderer bone15;
	private final ModelRenderer bone16;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone24;

	public ACRPRSStock() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		ACR175 = new ModelRenderer(this);
		ACR175.setRotationPoint(-2.5F, -41.4F, 3.0F);
		bone.addChild(ACR175);
		setRotationAngle(ACR175, -0.3498F, 0.0F, 0.0F);
		ACR175.cubeList.add(new ModelBox(ACR175, 12, 56, 0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(0.0F, 0.0F, 0.0F);
		ACR175.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -2.7925F);
		bone10.cubeList.add(new ModelBox(bone10, 38, 24, -1.0F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(2.0F, 0.0F, 0.0F);
		ACR175.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, 2.7925F);
		bone11.cubeList.add(new ModelBox(bone11, 38, 0, 0.0F, -2.0F, 0.0F, 1, 2, 5, 0.0F, false));

		ACR181 = new ModelRenderer(this);
		ACR181.setRotationPoint(-2.4F, -39.8F, 2.7F);
		bone.addChild(ACR181);
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 24, -1.1F, 0.8F, 0.0F, 4, 4, 7, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 31, 56, -1.1F, 1.8F, 7.0F, 4, 2, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 38, -0.6F, -0.07F, 0.0F, 3, 1, 7, 0.0F, false));

		ACR185 = new ModelRenderer(this);
		ACR185.setRotationPoint(-3.0F, -37.05F, 2.2F);
		bone.addChild(ACR185);
		ACR185.cubeList.add(new ModelBox(ACR185, 53, 14, 0.0F, 2.0F, 0.5F, 3, 1, 9, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, -38.0F, 11.7F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 2.81F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 53, 46, -3.99F, -1.0F, 0.0F, 4, 1, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.5F, -36.0F, 11.7F);
		bone.addChild(bone3);
		setRotationAngle(bone3, -2.81F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 38, 14, -3.99F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.5F, -39.0F, 2.7F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 1.1868F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 8, 20, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5F, -39.0F, 2.7F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.1868F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 20, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.9F, -38.0F, 3.6F);
		bone.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 1.6755F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 17, 33, -4.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 33, -4.0F, 2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.9F, -38.0F, 3.6F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -1.6755F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 25, 24, 0.0F, -1.0F, 0.0F, 4, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 13, 0.0F, 2.0F, 0.0F, 4, 1, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-3.5F, -39.0F, 2.7F);
		bone.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, 2.0944F);
		bone8.cubeList.add(new ModelBox(bone8, 22, 56, -1.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.5F, -39.0F, 2.7F);
		bone.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, -2.0944F);
		bone9.cubeList.add(new ModelBox(bone9, 34, 40, 0.0F, -1.0F, 0.0F, 1, 1, 7, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, -38.75F, 9.7F);
		bone.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -3.0F, -1.0F, 0.0F, 3, 5, 15, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 21, 5, -0.6F, -0.25F, 0.0F, 1, 4, 15, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 20, -3.4F, -0.25F, 0.0F, 1, 4, 15, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 53, 53, -0.6F, 3.75F, 5.0F, 1, 5, 10, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 35, 52, -4.1F, 8.25F, 6.0F, 5, 1, 9, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 53, -3.4F, 3.75F, 5.0F, 1, 5, 10, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.0F, 10.0F, 5.0F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, -0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 18, 43, -3.41F, -2.4801F, -0.2055F, 3, 3, 10, 0.0F, false));
		bone13.cubeList.add(new ModelBox(bone13, 53, 0, -0.59F, -2.4801F, -0.2055F, 1, 3, 10, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(0.0F, 8.75F, 5.0F);
		bone12.addChild(bone14);
		setRotationAngle(bone14, 0.576F, 0.0F, 0.0F);
		bone14.cubeList.add(new ModelBox(bone14, 54, 52, -3.41F, -6.0F, 0.0F, 1, 6, 3, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 53, 14, -0.61F, -6.0F, 0.0F, 1, 6, 3, 0.0F, false));
		bone14.cubeList.add(new ModelBox(bone14, 46, 62, -2.51F, -6.0F, -0.5F, 2, 7, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.0F, 4.25F, 0.0F);
		bone12.addChild(bone15);
		setRotationAngle(bone15, 1.2217F, 0.0F, 0.0F);
		bone15.cubeList.add(new ModelBox(bone15, 22, 64, -3.409F, -2.0F, 0.0F, 3, 5, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 17, 22, -0.609F, -2.0F, 0.0F, 1, 5, 2, 0.0F, false));
		bone15.cubeList.add(new ModelBox(bone15, 0, 0, -2.509F, -0.829F, -0.4698F, 2, 4, 1, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.0F, -39.15F, 11.0F);
		bone.addChild(bone16);
		bone16.cubeList.add(new ModelBox(bone16, 19, 26, -3.0F, -1.0F, 0.0F, 3, 1, 13, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 0, 20, -0.41F, 0.4F, 4.5F, 1, 7, 6, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 38, 31, -0.405F, 0.4F, 1.1F, 1, 2, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 38, 7, -3.605F, 0.4F, 1.1F, 1, 2, 4, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 0, 0, -3.59F, 0.4F, 4.5F, 1, 7, 6, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 38, 0, -3.6F, -0.2F, 0.0F, 1, 1, 13, 0.0F, false));
		bone16.cubeList.add(new ModelBox(bone16, 38, 38, -0.4F, -0.2F, 0.0F, 1, 1, 13, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.0F, -1.0F, 0.0F);
		bone16.addChild(bone17);
		setRotationAngle(bone17, 0.0F, 0.0F, -0.6458F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 39, -1.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-3.0F, -1.0F, 0.0F);
		bone16.addChild(bone18);
		setRotationAngle(bone18, 0.0F, 0.0F, 0.6458F);
		bone18.cubeList.add(new ModelBox(bone18, 38, 24, 0.0F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.6F, 0.8F, 0.0F);
		bone16.addChild(bone19);
		setRotationAngle(bone19, -0.9774F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 8, 3, -0.99F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 32, 62, -1.0F, -3.0F, 2.0F, 1, 3, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 17, 24, -4.2F, -3.0F, 2.0F, 1, 3, 6, 0.0F, false));
		bone19.cubeList.add(new ModelBox(bone19, 8, 0, -4.21F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(0.6F, 0.8F, 13.0F);
		bone16.addChild(bone20);
		setRotationAngle(bone20, 2.81F, 0.0F, 0.0F);
		bone20.cubeList.add(new ModelBox(bone20, 15, 40, -0.99F, -7.0F, 0.0F, 1, 7, 3, 0.0F, false));
		bone20.cubeList.add(new ModelBox(bone20, 0, 39, -4.21F, -7.0F, 0.0F, 1, 7, 3, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.6F, -38.9F, 24.4F);
		bone.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 21, 0, -1.9F, -1.0F, 0.0F, 4, 12, 2, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.9F, -1.0F, 2.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, -0.1745F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 53, 0, -0.99F, 0.0F, 0.0F, 4, 6, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.9F, 4.9F, 1.9F);
		bone21.addChild(bone23);
		setRotationAngle(bone23, 0.1745F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 0, 53, -0.99F, 0.0F, -1.0F, 4, 6, 1, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(1.3F, -30.3F, 22.4F);
		bone.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 0.7854F);
		bone24.cubeList.add(new ModelBox(bone24, 43, 43, -3.0F, -1.0F, 0.0F, 3, 3, 1, 0.0F, false));
		bone24.cubeList.add(new ModelBox(bone24, 33, 0, -5.0153F, 1.0153F, 0.0F, 3, 3, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
