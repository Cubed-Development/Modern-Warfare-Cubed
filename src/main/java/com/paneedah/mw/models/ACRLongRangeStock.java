package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRLongRangeStock extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer ACR181;
	private final ModelRenderer bone3;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone2;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
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

	public ACRLongRangeStock() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		ACR181 = new ModelRenderer(this);
		ACR181.setRotationPoint(-2.4F, -39.8F, 2.7F);
		bone.addChild(ACR181);
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 0, -1.09F, -0.2F, 0.0F, 4, 5, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 46, 30, -2.09F, 0.0F, 0.8F, 1, 5, 1, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 11, 45, -1.09F, 1.8F, 2.0F, 4, 3, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 27, -1.1F, 0.8F, 2.0F, 4, 1, 24, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 28, 13, -0.1F, -0.2F, 24.2F, 2, 1, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 40, 18, -0.1F, -0.2F, 2.0F, 2, 1, 3, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 18, -1.1F, 4.3F, 0.0F, 4, 1, 7, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 22, 52, -1.1F, 13.2F, 16.7F, 4, 1, 10, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 27, -0.6F, 9.1F, 17.7F, 3, 1, 8, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 45, -0.6F, 6.2F, 12.1F, 3, 1, 5, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 32, 42, -0.6F, 7.2F, 14.8F, 3, 1, 3, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 41, -0.6F, 6.2F, 23.7F, 3, 3, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 0, -0.6F, 5.2F, 9.5F, 3, 1, 16, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 58, 48, 0.4F, 1.7F, 12.5F, 1, 4, 13, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 24, -1.2F, 1.7F, 16.5F, 1, 4, 13, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 26, -1.2F, 1.7F, 29.5F, 3, 9, 1, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 12, 36, -0.61F, 1.8F, 9.5F, 3, 4, 3, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 53, 7, -1.1F, 6.2F, 25.7F, 4, 7, 1, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 52, -1.1F, 0.8F, 23.2F, 4, 6, 3, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 28, 9, -0.1F, -1.9F, 0.0F, 2, 2, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 28, 0, -0.6F, 4.75F, 0.0F, 3, 1, 8, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 36, -0.1F, 9.6F, 17.8F, 2, 1, 8, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 28, 9, -0.1F, 12.9F, 17.7F, 2, 1, 8, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 44, 42, -0.11F, 10.6F, 24.7F, 2, 3, 1, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.4F, 10.3F, 18.2F);
		ACR181.addChild(bone3);
		setRotationAngle(bone3, -0.1222F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 53, 17, -3.5F, -1.8707F, -1.1144F, 4, 5, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.1F, -0.2F, 0.0F);
		ACR181.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -1.0472F);
		bone8.cubeList.add(new ModelBox(bone8, 40, 27, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.9F, -0.2F, 0.0F);
		ACR181.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 1.0472F);
		bone9.cubeList.add(new ModelBox(bone9, 0, 32, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.5F, -35.5F, 9.7F);
		bone.addChild(bone2);
		setRotationAngle(bone2, -1.9199F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 14, 0, -4.0F, -12.0F, 0.0F, 4, 12, 1, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.5F, -29.2F, 21.6F);
		bone.addChild(bone4);
		setRotationAngle(bone4, -0.1745F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 46, 58, -2.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 40, 58, -2.0F, -0.6078F, 2.4468F, 2, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -33.6F, 19.6F);
		bone.addChild(bone5);
		setRotationAngle(bone5, -0.8203F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 40, 52, -3.01F, 0.0F, -1.0F, 3, 1, 5, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.5F, -40.0F, 4.7F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -0.2618F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 28, 18, -0.99F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.5F, -39.0F, 26.9F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, 0.7854F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, -1.0F, -24.0F, 1, 1, 26, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 41, -0.01F, -1.4F, 0.0F, 1, 1, 2, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 28, 0, 1.8284F, -2.8284F, -21.0F, 1, 1, 23, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 32, 48, 1.4F, -2.81F, 0.0F, 1, 1, 2, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(1.0F, -35.0F, 13.7F);
		bone.addChild(bone10);
		setRotationAngle(bone10, 0.7854F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 42, 4, -5.0F, -1.3636F, -0.6364F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 42, 0, -5.0F, 6.6974F, 8.2731F, 1, 2, 2, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 22, 24, -1.7F, -2.0253F, 0.9646F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 19, 23, -1.0F, 9.642F, 8.6721F, 1, 1, 1, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 15, 23, -1.0F, 7.3792F, 10.9349F, 1, 1, 1, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(-2.6F, -34.1F, 30.2F);
		bone.addChild(bone11);
		setRotationAngle(bone11, 0.4189F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 21, 13, -0.99F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 15, 13, -1.01F, -1.9184F, 0.8541F, 1, 5, 1, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(bone12);
		bone12.cubeList.add(new ModelBox(bone12, 32, 32, -4.1F, -36.3F, 32.71F, 5, 6, 4, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 0, 0, -3.1F, -40.2F, 32.7F, 3, 14, 4, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 32, 27, -2.6F, -40.7F, 32.7F, 2, 1, 4, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(0.9F, -36.3F, 32.7F);
		bone12.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, -0.2443F);
		bone13.cubeList.add(new ModelBox(bone13, 22, 52, -1.0F, -4.0F, 0.01F, 1, 4, 4, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-4.1F, -36.3F, 32.7F);
		bone12.addChild(bone14);
		setRotationAngle(bone14, 0.0F, 0.0F, 0.2443F);
		bone14.cubeList.add(new ModelBox(bone14, 40, 9, 0.0F, -4.0F, 0.01F, 1, 4, 4, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(-4.1F, -30.3F, 32.7F);
		bone12.addChild(bone15);
		setRotationAngle(bone15, 0.0F, 0.0F, -0.2443F);
		bone15.cubeList.add(new ModelBox(bone15, 14, 27, 0.0F, 0.0F, 0.01F, 1, 4, 4, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(0.9F, -30.3F, 32.7F);
		bone12.addChild(bone16);
		setRotationAngle(bone16, 0.0F, 0.0F, 0.2443F);
		bone16.cubeList.add(new ModelBox(bone16, 15, 15, -1.0F, 0.0F, 0.01F, 1, 4, 4, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(-0.1F, -26.2F, 32.7F);
		bone12.addChild(bone17);
		setRotationAngle(bone17, 1.3439F, 0.0F, 0.0F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 27, -3.01F, 0.0F, 0.0F, 3, 4, 1, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-1.5F, -42.0F, 8.5F);
		bone.addChild(bone18);
		bone18.cubeList.add(new ModelBox(bone18, 0, 52, -1.0F, -1.0F, 0.0F, 2, 1, 18, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 10, 0, -0.5F, 0.0F, 5.7F, 1, 3, 1, 0.0F, false));
		bone18.cubeList.add(new ModelBox(bone18, 0, 0, -0.5F, 0.0F, 3.8F, 1, 3, 1, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(-1.0F, -1.0F, 0.0F);
		bone18.addChild(bone19);
		setRotationAngle(bone19, 0.0F, 0.0F, 0.6458F);
		bone19.cubeList.add(new ModelBox(bone19, 37, 48, 0.0F, 0.0F, -1.0F, 1, 2, 19, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(1.0F, -1.0F, 0.0F);
		bone18.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, -0.6458F);
		bone20.cubeList.add(new ModelBox(bone20, 32, 27, -1.0F, 0.0F, -1.0F, 1, 2, 19, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone18.addChild(bone21);
		setRotationAngle(bone21, 1.0647F, 0.0F, 0.0F);
		bone21.cubeList.add(new ModelBox(bone21, 0, 36, -1.0F, -4.0F, 0.0F, 2, 4, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(1.0F, -1.0F, 1.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, 0.0F, -0.6632F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 28, 0, -1.0F, -3.0F, -2.0F, 1, 4, 2, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-1.0F, -1.0F, 1.0F);
		bone21.addChild(bone23);
		setRotationAngle(bone23, 0.0F, 0.6632F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 0, 18, 0.0F, -3.0F, -2.0F, 1, 4, 2, 0.0F, false));
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