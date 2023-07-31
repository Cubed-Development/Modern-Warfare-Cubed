package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AACHoneyBadgerReceiver extends ModelWithAttachments {
	private final ModelRenderer receiver;
	private final ModelRenderer gun784_r1;
	private final ModelRenderer gun783_r1;
	private final ModelRenderer gun776_r1;
	private final ModelRenderer gun737_r1;
	private final ModelRenderer gun99_r1;
	private final ModelRenderer gun736_r1;
	private final ModelRenderer gun138_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer gun764_r1;
	private final ModelRenderer gun771_r1;
	private final ModelRenderer gun767_r1;

	public AACHoneyBadgerReceiver() {
		textureWidth = 256;
		textureHeight = 256;

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		receiver.cubeList.add(new ModelBox(receiver, 48, 50, 0.21F, -37.2F, -9.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 53, 0.2F, -37.7F, -9.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 26, 54, -0.29F, -37.8F, -22.0F, 1, 1, 24, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 0, 27, -0.3F, -38.4F, -22.0F, 1, 1, 25, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 18, 64, -0.29F, -39.1F, -18.5F, 1, 1, 2, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 54, 34, -0.31F, -38.4F, -22.7F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 6, 55, -0.3F, -37.8F, -22.7F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 122, 153, -3.7F, -38.4F, -11.0F, 1, 1, 13, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 48, 37, -4.2F, -37.7F, -9.0F, 1, 1, 1, 0.0F, false));
		receiver.cubeList.add(new ModelBox(receiver, 48, 34, -4.2F, -37.2F, -9.0F, 1, 1, 1, 0.0F, false));

		gun784_r1 = new ModelRenderer(this);
		gun784_r1.setRotationPoint(5.1338F, 0.0F, -5.6059F);
		receiver.addChild(gun784_r1);
		setRotationAngle(gun784_r1, 0.0F, 0.7854F, 0.0F);
		gun784_r1.cubeList.add(new ModelBox(gun784_r1, 48, 23, -4.2F, -37.7F, -9.0F, 1, 1, 1, 0.0F, false));
		gun784_r1.cubeList.add(new ModelBox(gun784_r1, 6, 50, -4.2F, -37.2F, -9.0F, 2, 1, 1, 0.0F, false));

		gun783_r1 = new ModelRenderer(this);
		gun783_r1.setRotationPoint(-27.1174F, -8.3329F, 0.0F);
		receiver.addChild(gun783_r1);
		setRotationAngle(gun783_r1, 0.0F, 0.0F, 0.7854F);
		gun783_r1.cubeList.add(new ModelBox(gun783_r1, 86, 123, -3.5F, -36.9F, -9.0F, 2, 1, 12, 0.0F, false));

		gun776_r1 = new ModelRenderer(this);
		gun776_r1.setRotationPoint(-28.1781F, -8.7723F, 0.0F);
		receiver.addChild(gun776_r1);
		setRotationAngle(gun776_r1, 0.0F, 0.0F, 0.7854F);
		gun776_r1.cubeList.add(new ModelBox(gun776_r1, 158, 71, -3.5F, -38.4F, -9.0F, 1, 1, 12, 0.0F, false));

		gun737_r1 = new ModelRenderer(this);
		gun737_r1.setRotationPoint(-38.6041F, -21.9698F, 0.0F);
		receiver.addChild(gun737_r1);
		setRotationAngle(gun737_r1, 0.0F, 0.0F, 1.2269F);
		gun737_r1.cubeList.add(new ModelBox(gun737_r1, 104, 137, -3.7F, -40.4F, -10.0F, 1, 2, 13, 0.0F, false));

		gun99_r1 = new ModelRenderer(this);
		gun99_r1.setRotationPoint(-24.8264F, -63.3166F, 0.0F);
		receiver.addChild(gun99_r1);
		setRotationAngle(gun99_r1, 0.0F, 0.0F, 2.3562F);
		gun99_r1.cubeList.add(new ModelBox(gun99_r1, 0, 53, 0.7F, -36.8F, -22.0F, 1, 1, 24, 0.0F, false));
		gun99_r1.cubeList.add(new ModelBox(gun99_r1, 0, 55, 0.7F, -36.8F, -22.7F, 1, 1, 1, 0.0F, false));

		gun736_r1 = new ModelRenderer(this);
		gun736_r1.setRotationPoint(-34.9562F, -52.6718F, 0.0F);
		receiver.addChild(gun736_r1);
		setRotationAngle(gun736_r1, 0.0F, 0.0F, 1.9333F);
		gun736_r1.cubeList.add(new ModelBox(gun736_r1, 6, 39, 0.71F, -38.4F, -22.7F, 1, 2, 1, 0.0F, false));
		gun736_r1.cubeList.add(new ModelBox(gun736_r1, 0, 0, 0.7F, -38.4F, -22.0F, 1, 2, 25, 0.0F, false));

		gun138_r1 = new ModelRenderer(this);
		gun138_r1.setRotationPoint(-35.6107F, -53.62F, 0.0F);
		receiver.addChild(gun138_r1);
		setRotationAngle(gun138_r1, 0.0F, 0.0F, 1.9333F);
		gun138_r1.cubeList.add(new ModelBox(gun138_r1, 45, 45, 0.7F, -39.1F, -18.5F, 1, 2, 2, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-40.3835F, -41.0357F, -6.0046F);
		receiver.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, 0.925F, 1.9333F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 27, 29, 0.7076F, -39.0801F, -16.5F, 1, 2, 1, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(-30.4714F, -67.1709F, -7.9312F);
		receiver.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, -0.925F, 1.9333F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 27, 12, 0.7076F, -39.0801F, -19.5F, 1, 2, 1, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(0.0F, -2.026F, -37.1538F);
		receiver.addChild(bone9_r1);
		setRotationAngle(bone9_r1, -0.9076F, 0.0F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 21, 6, -0.31F, -39.1F, -16.5F, 1, 1, 1, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(0.0F, -28.031F, 24.4699F);
		receiver.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.9076F, 0.0F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 20, 0, -0.31F, -40.676F, -18.7313F, 1, 1, 1, 0.0F, false));

		gun764_r1 = new ModelRenderer(this);
		gun764_r1.setRotationPoint(-27.0065F, -11.6007F, 0.0F);
		receiver.addChild(gun764_r1);
		setRotationAngle(gun764_r1, 0.0F, 0.0F, 0.7854F);
		gun764_r1.cubeList.add(new ModelBox(gun764_r1, 58, 160, 0.5F, -38.4F, -9.0F, 1, 1, 12, 0.0F, false));

		gun771_r1 = new ModelRenderer(this);
		gun771_r1.setRotationPoint(-4.3154F, 0.0F, -16.2125F);
		receiver.addChild(gun771_r1);
		setRotationAngle(gun771_r1, -3.1416F, -0.7854F, 3.1416F);
		gun771_r1.cubeList.add(new ModelBox(gun771_r1, 62, 21, 1.2F, -37.7F, -9.0F, 1, 1, 2, 0.0F, false));
		gun771_r1.cubeList.add(new ModelBox(gun771_r1, 62, 45, 1.2F, -37.2F, -9.0F, 1, 1, 2, 0.0F, false));

		gun767_r1 = new ModelRenderer(this);
		gun767_r1.setRotationPoint(-25.9458F, -11.1614F, 0.0F);
		receiver.addChild(gun767_r1);
		setRotationAngle(gun767_r1, 0.0F, 0.0F, 0.7854F);
		gun767_r1.cubeList.add(new ModelBox(gun767_r1, 50, 79, 0.5F, -36.9F, -9.0F, 1, 2, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		receiver.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}