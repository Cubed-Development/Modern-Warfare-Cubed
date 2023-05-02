package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UMP45 extends ModelWithAttachments {
	private final QRenderer grip;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun239_r2;
	private final ModelRenderer gun239_r3;
	private final ModelRenderer gun238_r1;
	private final ModelRenderer bone;
	private final ModelRenderer gun240_r2;
	private final ModelRenderer gun242_r1;
	private final ModelRenderer gun240_r3;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer bone6;
	private final ModelRenderer gun241_r2;
	private final ModelRenderer gun242_r2;

	public UMP45() {
		textureWidth = 200;
		textureHeight = 200;

		grip = new QRenderer(this);
		grip.setRotationPoint(-0.3915F, 0.9283F, -0.4854F);
		

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(-1.1075F, -4.1851F, -7.0398F);
		grip.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.3054F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 0, 74, -0.499F, -1.0F, -0.5F, 1, 2, 1, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(-1.1075F, -5.9532F, -6.9352F);
		grip.addChild(gun239_r1);
		setRotationAngle(gun239_r1, 0.1222F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 38, 33, -0.5F, -2.0F, -0.5F, 1, 3, 1, 0.0F, false));

		gun239_r2 = new ModelRenderer(this);
		gun239_r2.setRotationPoint(-1.1075F, -2.7094F, -4.7174F);
		grip.addChild(gun239_r2);
		setRotationAngle(gun239_r2, 0.5236F, 0.0F, 0.0F);
		gun239_r2.cubeList.add(new ModelBox(gun239_r2, 38, 33, -1.501F, -0.5F, -2.0F, 3, 1, 4, 0.0F, false));

		gun239_r3 = new ModelRenderer(this);
		gun239_r3.setRotationPoint(-1.1075F, -1.6359F, -13.6445F);
		grip.addChild(gun239_r3);
		setRotationAngle(gun239_r3, -1.0297F, 0.0F, 0.0F);
		gun239_r3.cubeList.add(new ModelBox(gun239_r3, 37, 16, -1.501F, -1.5F, -4.0F, 3, 1, 4, 0.0F, false));

		gun238_r1 = new ModelRenderer(this);
		gun238_r1.setRotationPoint(-1.1075F, -2.0359F, -9.1445F);
		grip.addChild(gun238_r1);
		setRotationAngle(gun238_r1, -0.0873F, 0.0F, 0.0F);
		gun238_r1.cubeList.add(new ModelBox(gun238_r1, 74, 76, -1.5F, -0.5F, -4.0F, 3, 1, 7, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-1.1085F, -0.8025F, -2.6389F);
		grip.addChild(bone);
		setRotationAngle(bone, 0.1309F, 0.0F, 0.0F);
		

		gun240_r2 = new ModelRenderer(this);
		gun240_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(gun240_r2);
		setRotationAngle(gun240_r2, 0.3054F, 0.0F, 0.0F);
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 54, 21, -2.002F, -7.5F, 0.175F, 4, 14, 3, 0.001F, false));
		gun240_r2.cubeList.add(new ModelBox(gun240_r2, 96, 76, -1.0F, -7.5F, -0.5F, 2, 14, 2, 0.0F, false));

		gun242_r1 = new ModelRenderer(this);
		gun242_r1.setRotationPoint(-1.3876F, -0.247F, 0.7834F);
		bone.addChild(gun242_r1);
		setRotationAngle(gun242_r1, 2.2581F, -1.1712F, -2.2987F);
		gun242_r1.cubeList.add(new ModelBox(gun242_r1, 18, 26, -0.5F, -6.5F, -0.5F, 1, 13, 1, 0.0F, false));

		gun240_r3 = new ModelRenderer(this);
		gun240_r3.setRotationPoint(0.0F, 0.4256F, 5.8394F);
		bone.addChild(gun240_r3);
		setRotationAngle(gun240_r3, 0.4363F, 0.0F, 0.0F);
		gun240_r3.cubeList.add(new ModelBox(gun240_r3, 96, 57, -1.0F, -6.0F, -1.5F, 2, 10, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(0.0F, 1.2708F, 4.0268F);
		bone.addChild(gun241_r1);
		setRotationAngle(gun241_r1, 0.4363F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 20, 74, -2.003F, -6.0F, -1.175F, 4, 10, 3, -0.001F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, 0.3374F, 2.6001F);
		bone.addChild(bone6);
		setRotationAngle(bone6, -0.6545F, 0.0F, 0.0F);
		

		gun241_r2 = new ModelRenderer(this);
		gun241_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone6.addChild(gun241_r2);
		setRotationAngle(gun241_r2, 0.4363F, 0.0F, 0.0F);
		gun241_r2.cubeList.add(new ModelBox(gun241_r2, 16, 15, -1.0F, -8.0F, -0.5F, 2, 4, 1, 0.0F, false));

		gun242_r2 = new ModelRenderer(this);
		gun242_r2.setRotationPoint(0.0F, 0.8452F, -1.8126F);
		bone6.addChild(gun242_r2);
		setRotationAngle(gun242_r2, 0.4363F, 0.0F, 0.0F);
		gun242_r2.cubeList.add(new ModelBox(gun242_r2, 38, 26, -2.004F, -8.0F, -1.175F, 4, 4, 3, -0.003F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		grip.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
