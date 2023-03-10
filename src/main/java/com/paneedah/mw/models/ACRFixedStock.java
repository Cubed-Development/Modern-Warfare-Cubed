package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class ACRFixedStock extends ModelBase {
	private final ModelRenderer bone;
	private final ModelRenderer ACR181;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;
	private final ModelRenderer bone21;
	private final ModelRenderer bone29;
	private final ModelRenderer bone28;
	private final ModelRenderer bone22;
	private final ModelRenderer bone23;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone25;
	private final ModelRenderer bone26;
	private final ModelRenderer bone27;
	private final ModelRenderer bone10;
	private final ModelRenderer bone11;
	private final ModelRenderer bone17;
	private final ModelRenderer bone18;
	private final ModelRenderer bone15;
	private final ModelRenderer bone12;
	private final ModelRenderer bone14;
	private final ModelRenderer bone13;
	private final ModelRenderer bone16;
	private final ModelRenderer bone19;
	private final ModelRenderer bone20;
	private final ModelRenderer bone24;

	public ACRFixedStock() {
		textureWidth = 128;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		ACR181 = new ModelRenderer(this);
		ACR181.setRotationPoint(-2.4F, -39.8F, 2.7F);
		bone.addChild(ACR181);
		ACR181.cubeList.add(new ModelBox(ACR181, 0, 0, -1.1F, 2.3F, 0.0F, 4, 2, 23, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 50, 57, -1.1F, 4.3F, 0.0F, 4, 1, 10, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 23, 35, -1.1F, -0.2F, 0.0F, 4, 3, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 18, 16, 2.6F, 0.8F, 0.2F, 1, 4, 1, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 16, 48, -0.1F, -1.9F, 0.0F, 2, 2, 2, 0.0F, false));
		ACR181.cubeList.add(new ModelBox(ACR181, 16, 48, -0.6F, 4.75F, 0.0F, 3, 1, 9, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.1F, -0.2F, 0.0F);
		ACR181.addChild(bone8);
		setRotationAngle(bone8, 0.0F, 0.0F, -1.0472F);
		bone8.cubeList.add(new ModelBox(bone8, 48, 48, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(2.9F, -0.2F, 0.0F);
		ACR181.addChild(bone9);
		setRotationAngle(bone9, 0.0F, 0.0F, 1.0472F);
		bone9.cubeList.add(new ModelBox(bone9, 5, 48, -2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-3.5F, -39.0F, 2.7F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 1.1868F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 25, -1.0F, 1.5F, 0.0F, 1, 3, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5F, -39.0F, 2.7F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, -1.1868F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 19, 10, 0.0F, 1.5F, 0.0F, 1, 3, 1, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(-3.9F, -38.0F, 3.6F);
		bone.addChild(bone6);
		setRotationAngle(bone6, 0.0F, 1.6755F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 31, 48, -4.0F, 0.5F, 0.0F, 4, 1, 1, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 44, 42, -4.0F, 2.5F, 0.0F, 4, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.9F, -38.0F, 3.6F);
		bone.addChild(bone7);
		setRotationAngle(bone7, 0.0F, -1.6755F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 23, 42, 0.0F, 0.5F, 0.0F, 4, 1, 1, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 21, 0.0F, 2.5F, 0.0F, 4, 1, 1, 0.0F, false));

		bone21 = new ModelRenderer(this);
		bone21.setRotationPoint(-1.6F, -38.9F, 24.4F);
		bone.addChild(bone21);
		bone21.cubeList.add(new ModelBox(bone21, 0, 0, -1.9F, 0.0F, 1.25F, 4, 12, 3, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 23, 30, -1.9F, 10.0F, -1.75F, 4, 2, 3, 0.0F, false));
		bone21.cubeList.add(new ModelBox(bone21, 31, 0, -1.9F, 11.0F, -4.75F, 4, 1, 3, 0.0F, false));

		bone29 = new ModelRenderer(this);
		bone29.setRotationPoint(0.0F, 10.0F, 0.25F);
		bone21.addChild(bone29);
		setRotationAngle(bone29, 0.7854F, 0.0F, 0.0F);
		bone29.cubeList.add(new ModelBox(bone29, 11, 0, -1.89F, 0.0F, 0.0F, 4, 1, 2, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 9, 40, -1.89F, -4.7376F, 4.7376F, 4, 2, 1, 0.0F, false));
		bone29.cubeList.add(new ModelBox(bone29, 23, 25, -1.91F, -13.0915F, -4.6163F, 4, 2, 3, 0.0F, false));

		bone28 = new ModelRenderer(this);
		bone28.setRotationPoint(0.0F, 12.0F, -1.75F);
		bone21.addChild(bone28);
		setRotationAngle(bone28, 2.5656F, 0.0F, 0.0F);
		bone28.cubeList.add(new ModelBox(bone28, 31, 0, -1.89F, 0.0F, 0.0F, 4, 2, 14, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 0, 31, -1.89F, -1.6339F, 2.516F, 4, 1, 3, 0.0F, false));
		bone28.cubeList.add(new ModelBox(bone28, 0, 38, -1.89F, -1.6339F, 5.516F, 4, 2, 1, 0.0F, false));

		bone22 = new ModelRenderer(this);
		bone22.setRotationPoint(-0.9F, -1.0F, 2.0F);
		bone21.addChild(bone22);
		setRotationAngle(bone22, -0.1745F, 0.0F, 0.0F);
		bone22.cubeList.add(new ModelBox(bone22, 43, 25, -0.99F, 0.5941F, 2.3895F, 4, 6, 1, 0.0F, false));

		bone23 = new ModelRenderer(this);
		bone23.setRotationPoint(-0.9F, 4.9F, 1.9F);
		bone21.addChild(bone23);
		setRotationAngle(bone23, 0.1745F, 0.0F, 0.0F);
		bone23.cubeList.add(new ModelBox(bone23, 43, 16, -0.99F, 1.3755F, 1.0422F, 4, 6, 1, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-3.5F, -40.0F, 4.7F);
		bone.addChild(bone2);
		setRotationAngle(bone2, -0.7505F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 25, -0.01F, 0.0F, 0.0F, 4, 2, 4, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.5F, -39.4F, 22.2F);
		bone.addChild(bone3);
		setRotationAngle(bone3, 0.6981F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 15, -4.01F, 0.0F, -4.0F, 4, 2, 4, 0.0F, false));

		bone25 = new ModelRenderer(this);
		bone25.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone3.addChild(bone25);
		setRotationAngle(bone25, -2.3562F, 0.0F, 0.0F);
		bone25.cubeList.add(new ModelBox(bone25, 31, 4, -3.99F, -4.0F, 0.0F, 4, 4, 2, 0.0F, false));
		bone25.cubeList.add(new ModelBox(bone25, 14, 3, -2.99F, -7.0087F, -0.9004F, 2, 7, 1, 0.0F, false));

		bone26 = new ModelRenderer(this);
		bone26.setRotationPoint(-3.0F, -0.0212F, -0.9053F);
		bone25.addChild(bone26);
		setRotationAngle(bone26, 0.0F, -0.8378F, 0.0F);
		bone26.cubeList.add(new ModelBox(bone26, 47, 33, 0.0F, -7.0F, 0.0F, 1, 7, 1, 0.0F, false));
		bone26.cubeList.add(new ModelBox(bone26, 43, 33, -0.01F, -7.0F, 0.3553F, 1, 7, 1, 0.0F, false));

		bone27 = new ModelRenderer(this);
		bone27.setRotationPoint(-1.0F, -0.0212F, -0.9053F);
		bone25.addChild(bone27);
		setRotationAngle(bone27, 0.0F, 0.8378F, 0.0F);
		bone27.cubeList.add(new ModelBox(bone27, 44, 44, -1.0F, -7.0F, 0.0F, 1, 7, 1, 0.0F, false));
		bone27.cubeList.add(new ModelBox(bone27, 15, 30, -1.01F, -7.0F, 0.3553F, 1, 7, 1, 0.0F, false));

		bone10 = new ModelRenderer(this);
		bone10.setRotationPoint(-0.5F, -41.75F, 5.25F);
		bone.addChild(bone10);
		setRotationAngle(bone10, -0.0873F, 0.0F, 0.0F);
		bone10.cubeList.add(new ModelBox(bone10, 23, 25, -2.0F, 0.0F, 0.0F, 2, 1, 16, 0.0F, false));
		bone10.cubeList.add(new ModelBox(bone10, 0, 25, -2.0F, 0.2989F, -0.9739F, 2, 4, 19, 0.0F, false));

		bone11 = new ModelRenderer(this);
		bone11.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone10.addChild(bone11);
		setRotationAngle(bone11, 0.0F, 0.0F, -2.1642F);
		bone11.cubeList.add(new ModelBox(bone11, 43, 16, -1.0F, -1.0F, 0.0F, 1, 1, 16, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 0, 48, -2.0F, -1.0F, 1.0F, 1, 1, 14, 0.0F, false));
		bone11.cubeList.add(new ModelBox(bone11, 31, 16, -3.0F, -1.0F, 2.0F, 1, 1, 5, 0.0F, false));

		bone17 = new ModelRenderer(this);
		bone17.setRotationPoint(0.5F, 0.756F, 16.0269F);
		bone10.addChild(bone17);
		setRotationAngle(bone17, 0.1571F, -2.3387F, -2.2864F);
		bone17.cubeList.add(new ModelBox(bone17, 0, 48, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

		bone18 = new ModelRenderer(this);
		bone18.setRotationPoint(-2.5F, 0.8557F, 16.0356F);
		bone10.addChild(bone18);
		setRotationAngle(bone18, 1.6057F, -0.7505F, 2.0769F);
		bone18.cubeList.add(new ModelBox(bone18, 0, 15, -1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, false));

		bone15 = new ModelRenderer(this);
		bone15.setRotationPoint(0.6F, 0.8966F, 0.0784F);
		bone10.addChild(bone15);
		setRotationAngle(bone15, 0.1047F, 0.576F, -1.9897F);
		bone15.cubeList.add(new ModelBox(bone15, 0, 41, -3.0F, -1.0F, 0.0F, 3, 1, 2, 0.0F, false));

		bone12 = new ModelRenderer(this);
		bone12.setRotationPoint(-2.0F, 0.0F, 0.0F);
		bone10.addChild(bone12);
		setRotationAngle(bone12, 0.0F, 0.0F, 2.1642F);
		bone12.cubeList.add(new ModelBox(bone12, 26, 42, 0.0F, -1.0F, 0.0F, 1, 1, 16, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 44, 42, 1.0F, -1.0F, 1.0F, 1, 1, 14, 0.0F, false));
		bone12.cubeList.add(new ModelBox(bone12, 11, 16, 2.0F, -1.0F, 2.0F, 1, 1, 5, 0.0F, false));

		bone14 = new ModelRenderer(this);
		bone14.setRotationPoint(-2.6F, 0.8966F, 0.0784F);
		bone10.addChild(bone14);
		setRotationAngle(bone14, 0.1222F, 0.9774F, 2.1642F);
		bone14.cubeList.add(new ModelBox(bone14, 12, 12, -2.0F, -1.0F, 0.0F, 2, 1, 3, 0.0F, false));

		bone13 = new ModelRenderer(this);
		bone13.setRotationPoint(-2.6F, 5.0327F, 0.9924F);
		bone10.addChild(bone13);
		setRotationAngle(bone13, 0.0873F, 0.0F, 0.0F);
		bone13.cubeList.add(new ModelBox(bone13, 53, 0, -0.9F, -2.0F, 1.6F, 5, 2, 11, 0.0F, false));

		bone16 = new ModelRenderer(this);
		bone16.setRotationPoint(-0.9F, 0.0F, 1.6F);
		bone13.addChild(bone16);
		setRotationAngle(bone16, -1.1694F, 0.0F, 0.0F);
		bone16.cubeList.add(new ModelBox(bone16, 0, 35, -0.01F, -1.0F, -2.0F, 5, 1, 2, 0.0F, false));

		bone19 = new ModelRenderer(this);
		bone19.setRotationPoint(0.1F, 0.0F, 12.6F);
		bone13.addChild(bone19);
		setRotationAngle(bone19, 1.0647F, 0.0F, 0.0F);
		bone19.cubeList.add(new ModelBox(bone19, 31, 10, -0.95F, -1.0F, 0.0F, 5, 1, 2, 0.0F, false));

		bone20 = new ModelRenderer(this);
		bone20.setRotationPoint(-0.9F, -2.0F, 1.7F);
		bone13.addChild(bone20);
		setRotationAngle(bone20, 0.0F, 0.0F, -0.6632F);
		bone20.cubeList.add(new ModelBox(bone20, 34, 60, 0.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

		bone24 = new ModelRenderer(this);
		bone24.setRotationPoint(4.1F, -2.0F, 1.7F);
		bone13.addChild(bone24);
		setRotationAngle(bone24, 0.0F, 0.0F, 0.6632F);
		bone24.cubeList.add(new ModelBox(bone24, 19, 59, -2.0F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));
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