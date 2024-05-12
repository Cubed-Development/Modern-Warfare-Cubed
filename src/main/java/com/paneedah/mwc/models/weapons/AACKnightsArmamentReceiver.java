package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AACKnightsArmamentReceiver extends ModelBase {
	private final ModelRenderer receiver;
	private final ModelRenderer gun767;
	private final ModelRenderer gun764;
	private final ModelRenderer bone4;
	private final ModelRenderer gun2;
	private final ModelRenderer gun97;
	private final ModelRenderer gun135;
	private final ModelRenderer bone3;
	private final ModelRenderer bone9;
	private final ModelRenderer gun138;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer gun99;
	private final ModelRenderer gun765;
	private final ModelRenderer gun3;
	private final ModelRenderer gun73;
	private final ModelRenderer gun70;
	private final ModelRenderer gun95;
	private final ModelRenderer gun303;
	private final ModelRenderer gun104;
	private final ModelRenderer gun111;
	private final ModelRenderer gun125;
	private final ModelRenderer gun319;
	private final ModelRenderer gun121;
	private final ModelRenderer gun103;
	private final ModelRenderer gun109;
	private final ModelRenderer gun346;
	private final ModelRenderer gun251;
	private final ModelRenderer gun263;
	private final ModelRenderer gun112;
	private final ModelRenderer gun113;
	private final ModelRenderer gun98;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone5;

	public AACKnightsArmamentReceiver() {
		textureWidth = 128;
		textureHeight = 128;

		receiver = new ModelRenderer(this);
		receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun767 = new ModelRenderer(this);
		gun767.setRotationPoint(0.5F, -36.9F, -9.0F);
		receiver.addChild(gun767);
		setRotationAngle(gun767, 0.0F, 0.0F, 0.7854F);
		gun767.cubeList.add(new ModelBox(gun767, 0, 0, 0.0F, 0.4F, 0.1F, 1, 2, 12, 0.0F, false));
		gun767.cubeList.add(new ModelBox(gun767, 0, 0, -2.5456F, 2.9456F, -13.9F, 2, 1, 26, 0.0F, false));

		gun764 = new ModelRenderer(this);
		gun764.setRotationPoint(0.7F, -38.3F, -9.0F);
		receiver.addChild(gun764);
		setRotationAngle(gun764, 0.0F, 0.0F, 0.9425F);
		gun764.cubeList.add(new ModelBox(gun764, 56, 0, -0.0342F, -0.1372F, -5.0F, 1, 1, 17, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(2.1622F, 1.4473F, -0.9F);
		gun764.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.6458F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 27, -1.0F, -2.0F, -1.0F, 1, 3, 2, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-5.2F, -38.1F, -9.0F);
		receiver.addChild(gun2);
		setRotationAngle(gun2, 0.0F, 0.0F, -0.9425F);
		gun2.cubeList.add(new ModelBox(gun2, 69, 49, -0.0342F, 0.8628F, -3.0F, 1, 1, 15, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 26, 27, 1.9658F, 0.8628F, -12.0F, 1, 1, 10, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 0, 3, 0.9658F, 0.8628F, -3.0F, 1, 1, 1, 0.0F, false));
		gun2.cubeList.add(new ModelBox(gun2, 14, 10, -0.0342F, 0.8628F, -12.0F, 2, 1, 1, 0.0F, false));

		gun97 = new ModelRenderer(this);
		gun97.setRotationPoint(-0.3F, -37.8F, -22.0F);
		receiver.addChild(gun97);
		gun97.cubeList.add(new ModelBox(gun97, 30, 0, 0.11F, -0.3F, -0.7F, 1, 1, 24, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-0.3F, -39.1F, -19.5F);
		receiver.addChild(gun135);
		gun135.cubeList.add(new ModelBox(gun135, 26, 30, -0.19F, -0.3F, 1.0F, 1, 1, 2, 0.0F, false));
		gun135.cubeList.add(new ModelBox(gun135, 0, 6, -0.189F, 0.2F, -3.2F, 1, 1, 5, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.8F, 0.2F, -3.2F);
		gun135.addChild(bone3);
		setRotationAngle(bone3, 0.0F, 0.0F, 0.5585F);
		bone3.cubeList.add(new ModelBox(bone3, 30, 11, -2.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(1.0F, 0.0F, 3.0F);
		gun135.addChild(bone9);
		setRotationAngle(bone9, -1.0996F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 7, 0, -1.21F, -0.1362F, -0.2673F, 1, 1, 1, 0.0F, false));

		gun138 = new ModelRenderer(this);
		gun138.setRotationPoint(0.7F, -39.1F, -18.5F);
		receiver.addChild(gun138);
		setRotationAngle(gun138, 0.0F, 0.0F, 2.0206F);
		gun138.cubeList.add(new ModelBox(gun138, 12, 27, -0.2096F, 0.2934F, 0.0F, 1, 2, 2, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.0076F, 0.0199F, 2.0F);
		gun138.addChild(bone7);
		setRotationAngle(bone7, 0.0F, 1.0996F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 7, 7, -0.0951F, 0.2934F, -0.1867F, 1, 2, 1, 0.0F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(0.0076F, 0.0199F, 0.0F);
		gun138.addChild(bone8);
		setRotationAngle(bone8, 0.0F, -1.0996F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 0, 6, -0.0951F, 0.2934F, -0.8133F, 1, 2, 1, 0.0F, false));

		gun99 = new ModelRenderer(this);
		gun99.setRotationPoint(0.7F, -36.8F, -22.0F);
		receiver.addChild(gun99);
		setRotationAngle(gun99, 0.0F, 0.0F, 2.3562F);
		gun99.cubeList.add(new ModelBox(gun99, 26, 29, -0.2828F, 0.1414F, -0.7F, 1, 1, 24, 0.0F, false));

		gun765 = new ModelRenderer(this);
		gun765.setRotationPoint(1.1F, -37.7F, -8.9F);
		receiver.addChild(gun765);
		setRotationAngle(gun765, 0.0F, 0.0F, 1.7453F);
		gun765.cubeList.add(new ModelBox(gun765, 52, 77, -0.0985F, 0.0174F, 0.0F, 2, 1, 12, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-4.3F, -37.9F, -8.9F);
		receiver.addChild(gun3);
		setRotationAngle(gun3, 0.0F, 0.0F, -1.7453F);
		gun3.cubeList.add(new ModelBox(gun3, 36, 76, -2.0985F, 0.0174F, 0.0F, 2, 1, 12, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 0, 14, -2.3592F, -0.2317F, -3.0F, 2, 2, 3, 0.0F, false));
		gun3.cubeList.add(new ModelBox(gun3, 18, 27, -2.3592F, -0.2317F, -12.1F, 2, 2, 1, 0.0F, false));

		gun73 = new ModelRenderer(this);
		gun73.setRotationPoint(-0.55F, -38.0F, -21.2F);
		receiver.addChild(gun73);
		gun73.cubeList.add(new ModelBox(gun73, 0, 27, 0.0F, 0.0F, 0.0F, 1, 2, 10, 0.0F, false));

		gun70 = new ModelRenderer(this);
		gun70.setRotationPoint(-0.75F, -38.0F, -22.0F);
		receiver.addChild(gun70);
		gun70.cubeList.add(new ModelBox(gun70, 0, 27, 0.0F, 0.0F, 0.0F, 1, 2, 24, 0.0F, false));

		gun95 = new ModelRenderer(this);
		gun95.setRotationPoint(-0.75F, -38.0F, -22.7F);
		receiver.addChild(gun95);
		gun95.cubeList.add(new ModelBox(gun95, 0, 0, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

		gun303 = new ModelRenderer(this);
		gun303.setRotationPoint(-1.3F, -39.3F, -22.0F);
		receiver.addChild(gun303);
		gun303.cubeList.add(new ModelBox(gun303, 0, 53, 0.0F, 0.0F, 0.0F, 1, 2, 23, 0.0F, false));

		gun104 = new ModelRenderer(this);
		gun104.setRotationPoint(-2.5F, -40.1F, -22.0F);
		receiver.addChild(gun104);
		gun104.cubeList.add(new ModelBox(gun104, 25, 54, 0.0F, 0.0F, 0.0F, 2, 1, 21, 0.0F, false));

		gun111 = new ModelRenderer(this);
		gun111.setRotationPoint(-2.5F, -40.1F, -22.7F);
		receiver.addChild(gun111);
		gun111.cubeList.add(new ModelBox(gun111, 20, 10, -0.001F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun125 = new ModelRenderer(this);
		gun125.setRotationPoint(-2.5F, -40.1F, -1.0F);
		receiver.addChild(gun125);
		setRotationAngle(gun125, -0.632F, 0.0F, 0.0F);
		gun125.cubeList.add(new ModelBox(gun125, 13, 22, 0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

		gun319 = new ModelRenderer(this);
		gun319.setRotationPoint(-2.0F, -40.3F, -1.0F);
		receiver.addChild(gun319);
		gun319.cubeList.add(new ModelBox(gun319, 4, 30, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun121 = new ModelRenderer(this);
		gun121.setRotationPoint(-2.5F, -39.3F, 1.0F);
		receiver.addChild(gun121);
		gun121.cubeList.add(new ModelBox(gun121, 0, 19, 0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F, false));

		gun103 = new ModelRenderer(this);
		gun103.setRotationPoint(-2.7F, -39.3F, -22.0F);
		receiver.addChild(gun103);
		gun103.cubeList.add(new ModelBox(gun103, 52, 25, 0.0F, 0.0F, 0.0F, 2, 1, 23, 0.0F, false));

		gun109 = new ModelRenderer(this);
		gun109.setRotationPoint(-2.7F, -39.3F, -22.7F);
		receiver.addChild(gun109);
		gun109.cubeList.add(new ModelBox(gun109, 17, 30, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun346 = new ModelRenderer(this);
		gun346.setRotationPoint(-2.8F, -39.3F, -21.0F);
		receiver.addChild(gun346);
		gun346.cubeList.add(new ModelBox(gun346, 30, 0, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun251 = new ModelRenderer(this);
		gun251.setRotationPoint(-3.3F, -39.2F, -10.3F);
		receiver.addChild(gun251);
		setRotationAngle(gun251, 0.2094F, 2.6529F, -0.1859F);
		gun251.cubeList.add(new ModelBox(gun251, 13, 19, -2.0798F, -0.4222F, -1.9864F, 3, 1, 2, 0.0F, false));

		gun263 = new ModelRenderer(this);
		gun263.setRotationPoint(-4.1F, -37.0F, -21.5F);
		receiver.addChild(gun263);
		setRotationAngle(gun263, 0.0F, 0.0F, -0.9295F);
		gun263.cubeList.add(new ModelBox(gun263, 0, 14, 0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

		gun112 = new ModelRenderer(this);
		gun112.setRotationPoint(-3.7F, -38.4F, -22.7F);
		receiver.addChild(gun112);
		setRotationAngle(gun112, 0.0F, 0.0F, 1.2269F);
		gun112.cubeList.add(new ModelBox(gun112, 20, 5, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

		gun113 = new ModelRenderer(this);
		gun113.setRotationPoint(-3.7F, -38.4F, -22.7F);
		receiver.addChild(gun113);
		gun113.cubeList.add(new ModelBox(gun113, 26, 27, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun98 = new ModelRenderer(this);
		gun98.setRotationPoint(-3.7F, -37.8F, -22.7F);
		receiver.addChild(gun98);
		gun98.cubeList.add(new ModelBox(gun98, 20, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.8F, -38.1F, -9.0F);
		receiver.addChild(bone);
		setRotationAngle(bone, 0.0F, 0.0F, -0.8378F);
		bone.cubeList.add(new ModelBox(bone, 50, 54, -1.0F, -2.0F, -9.0F, 1, 2, 17, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 5, -1.0F, -1.0F, 8.0F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 14, 0, -1.0F, -1.7F, 8.0F, 1, 1, 4, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -1.0F, -13.7F, 1, 1, 5, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, -9.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, -0.576F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 13, 14, -2.99F, -2.708F, 1.0903F, 3, 2, 3, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-3.8F, -38.1F, -9.0F);
		receiver.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.8378F);
		bone5.cubeList.add(new ModelBox(bone5, 75, 0, 0.0F, -1.0F, -2.0F, 1, 1, 14, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 72, 72, 0.0F, -1.7F, -2.0F, 1, 1, 14, 0.0F, false));
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
