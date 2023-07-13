package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRPDWStock extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer ACR181;
	private final ModelRenderer bone3;
	private final ModelRenderer bone6;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone11;
	private final ModelRenderer bone12;
	private final ModelRenderer bone13;
	private final ModelRenderer bone21;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone10;

	public ACRPDWStock() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		ACR181 = new ModelRenderer(this);
		ACR181.setRotationPoint(-2.4F, -39.8F, 2.7F);
		bone.addChild(ACR181);
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 28, -2.1F, 2.4F, 0.0F, 6, 1, 7, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 28, -1.9F, 2.4F, -4.0F, 1, 1, 27, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 0, 2.7F, 2.4F, -4.0F, 1, 1, 27, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 29, 50, -2.1F, 2.4F, 21.0F, 6, 1, 4, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 29, 14, -1.1F, 1.2F, 0.0F, 4, 3, 7, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 44, 0, -1.1F, 1.2F, 21.0F, 4, 3, 5, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 14, 7, -1.09F, -0.8F, 24.4F, 4, 2, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 48, 57, -0.6F, 4.2F, 21.0F, 3, 3, 5, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 58, 15, -0.6F, 7.2F, 22.5F, 3, 4, 4, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 29, 42, -0.6F, 0.7F, 0.0F, 3, 1, 7, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 57, 58, 0.4F, -0.3F, 0.0F, 1, 1, 7, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 29, 29, -0.6F, -0.7F, 0.0F, 3, 1, 12, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 43, 15, 0.4F, -1.7F, 0.0F, 1, 1, 13, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.1F, 2.4F, 0.05F);
		ACR181.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.5061F);
		bone3.cubeList.add(new ModelBox(bone3, 14, 56, 0.0F, 0.0F, -0.05F, 2, 1, 7, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 14, 14, 0.0F, 0.0F, 20.95F, 2, 1, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-2.1F, 3.4F, 0.05F);
		ACR181.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 0.0F, 0.5061F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 45, 0.0F, -1.0F, -0.05F, 2, 1, 7, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 13, 0.0F, -1.0F, 20.95F, 2, 1, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(3.9F, 2.4F, 0.05F);
		ACR181.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, 0.5061F);
		bone4.cubeList.add(new ModelBox(bone4, 55, 1, -2.0F, 0.0F, -0.05F, 2, 1, 7, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 5, -2.0F, 0.0F, 20.95F, 2, 1, 4, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(3.9F, 3.4F, 0.05F);
		ACR181.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.5061F);
		bone5.cubeList.add(new ModelBox(bone5, 47, 29, -2.0F, -1.0F, -0.05F, 2, 1, 7, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -2.0F, -1.0F, 20.95F, 2, 1, 4, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(1.4F, -3.0F, 0.9F);
		ACR181.addChild(bone11);
		setRotationAngle(bone11, -0.8029F, 0.0F, 0.0F);
		bone11.cubeList.add(new ModelBox(bone11, 0, 28, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone11.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, -0.4189F);
		bone12.cubeList.add(new ModelBox(bone12, 20, 20, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-1.0F, 0.0F, 0.0F);
		bone11.addChild(bone13);
		setRotationAngle(bone13, 0.0F, 0.0F, 0.4189F);
		bone13.cubeList.add(new ModelBox(bone13, 14, 19, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.6F, -38.9F, 24.4F);
		bone.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 0, 56, -1.9F, -1.7F, 4.3F, 4, 12, 3, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.9F, -1.0F, 2.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, -0.1745F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 0, 18, -0.99F, -1.6097F, 5.0979F, 4, 6, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.9F, 4.9F, 1.9F);
		bone21.addChild(bone23);
		setRotationAngle(bone23, 0.1745F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 14, 0, -0.99F, 0.231F, 4.341F, 4, 6, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, -35.4F, 9.7F);
		bone.addChild(bone2);
		setRotationAngle(bone2, -2.9758F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 36, -3.49F, 0.0F, 0.0F, 4, 2, 7, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-3.0F, -40.5F, 2.7F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 0.0F, -0.7854F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 13, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 29, 0, 0.4F, -0.01F, 0.0F, 1, 1, 13, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 1.1213F, 1.1213F, 0.0F, 1, 1, 12, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 43, 43, 1.13F, 0.7F, 0.0F, 1, 1, 13, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.5F, -38.6F, 23.7F);
		bone.addChild(bone8);
		setRotationAngle(bone8, 0.5236F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 57, 9, -4.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(0.5F, -38.6F, 8.7F);
		bone.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 0.5236F);
		bone9.cubeList.add(new ModelBox(bone9, 32, 56, -1.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-3.5F, -38.6F, 8.7F);
		bone.addChild(bone10);
		setRotationAngle(bone10, 0.0F, 0.0F, -0.5236F);
		bone10.cubeList.add(new ModelBox(bone10, 11, 46, 0.0F, 0.0F, -6.0F, 1, 1, 7, 0.0F, false));
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
