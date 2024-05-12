package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APSgrip extends ModelWithAttachments {
	private final ModelRenderer grip;
	private final ModelRenderer gun13;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer gun145;
	private final ModelRenderer gun143;
	private final ModelRenderer gun144;
	private final ModelRenderer gun135;
	private final ModelRenderer gun87;
	private final ModelRenderer gun127;
	private final ModelRenderer gun91;
	private final ModelRenderer gun178;
	private final ModelRenderer gun174;
	private final ModelRenderer gun89;
	private final ModelRenderer gun93;
	private final ModelRenderer gun172;
	private final ModelRenderer gun175;
	private final ModelRenderer gun173;
	private final ModelRenderer gun171;
	private final ModelRenderer gun179;
	private final ModelRenderer gun176;
	private final ModelRenderer gun177;
	private final ModelRenderer gun170;

	public APSgrip() {
		textureWidth = 150;
		textureHeight = 150;

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-4.0F, -29.0F, -6.0F);
		grip.addChild(gun13);
		setRotationAngle(gun13, 0.2231F, 0.0F, 0.0F);
		gun13.cubeList.add(new ModelBox(gun13, 21, 22, 0.002F, 0.0F, 0.0F, 5, 13, 6, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(4.0F, 29.0F, 6.0F);
		gun13.addChild(gun15_r1);
		setRotationAngle(gun15_r1, -0.0873F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 14, 14, -4.298F, -19.1981F, -4.6314F, 1, 2, 2, -0.2F, false));
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 21, 22, 0.302F, -19.1981F, -4.6314F, 1, 2, 2, -0.2F, false));

		gun145 = new ModelRenderer(this);
		gun145.setRotationPoint(-4.0F, -31.1F, -3.4F);
		grip.addChild(gun145);
		setRotationAngle(gun145, -0.1115F, 0.0F, 0.0F);
		gun145.cubeList.add(new ModelBox(gun145, 14, 42, 0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, false));

		gun143 = new ModelRenderer(this);
		gun143.setRotationPoint(-4.0F, -30.0F, -6.2F);
		grip.addChild(gun143);
		setRotationAngle(gun143, 0.3718F, 0.0F, 0.0F);
		gun143.cubeList.add(new ModelBox(gun143, 88, 27, 0.001F, 0.0F, 0.0F, 5, 2, 3, 0.0F, false));

		gun144 = new ModelRenderer(this);
		gun144.setRotationPoint(-4.0F, -30.0F, -6.2F);
		grip.addChild(gun144);
		setRotationAngle(gun144, 0.2231F, 0.0F, 0.0F);
		gun144.cubeList.add(new ModelBox(gun144, 45, 65, 0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, false));

		gun135 = new ModelRenderer(this);
		gun135.setRotationPoint(-4.0F, -30.5F, -3.2F);
		grip.addChild(gun135);
		gun135.cubeList.add(new ModelBox(gun135, 67, 26, 0.0015F, 0.0F, 0.0F, 5, 1, 4, 0.0F, false));

		gun87 = new ModelRenderer(this);
		gun87.setRotationPoint(-4.0F, -30.5F, 0.8F);
		grip.addChild(gun87);
		setRotationAngle(gun87, -1.3013F, 0.0F, 0.0F);
		gun87.cubeList.add(new ModelBox(gun87, 88, 0, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun127 = new ModelRenderer(this);
		gun127.setRotationPoint(-4.0F, -23.7F, 2.5F);
		grip.addChild(gun127);
		setRotationAngle(gun127, -3.0486F, 0.0F, 0.0F);
		gun127.cubeList.add(new ModelBox(gun127, 0, 73, -0.001F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		gun91 = new ModelRenderer(this);
		gun91.setRotationPoint(-4.0F, -17.6F, 3.2F);
		grip.addChild(gun91);
		setRotationAngle(gun91, -3.0486F, 0.0F, 0.0F);
		gun91.cubeList.add(new ModelBox(gun91, 63, 64, 0.001F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));

		gun178 = new ModelRenderer(this);
		gun178.setRotationPoint(-3.5F, -17.6F, 3.2F);
		grip.addChild(gun178);
		setRotationAngle(gun178, -3.0486F, 0.0F, 0.0F);
		

		gun174 = new ModelRenderer(this);
		gun174.setRotationPoint(-3.5F, -30.5F, 0.8F);
		grip.addChild(gun174);
		setRotationAngle(gun174, -1.3013F, 0.0F, 0.0F);
		gun174.cubeList.add(new ModelBox(gun174, 25, 86, 0.0F, -0.001F, 0.0F, 1, 2, 6, 0.0F, false));

		gun89 = new ModelRenderer(this);
		gun89.setRotationPoint(-4.0F, -18.5F, -3.3F);
		grip.addChild(gun89);
		gun89.cubeList.add(new ModelBox(gun89, 0, 65, 0.0F, 0.0F, 0.0F, 5, 2, 6, 0.0F, false));

		gun93 = new ModelRenderer(this);
		gun93.setRotationPoint(-4.0F, -17.6F, 2.2F);
		grip.addChild(gun93);
		gun93.cubeList.add(new ModelBox(gun93, 42, 81, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun172 = new ModelRenderer(this);
		gun172.setRotationPoint(0.0F, -30.5F, 0.8F);
		grip.addChild(gun172);
		setRotationAngle(gun172, -1.3013F, 0.0F, 0.0F);
		gun172.cubeList.add(new ModelBox(gun172, 48, 86, 0.0F, 0.0F, 0.0F, 1, 2, 6, 0.0F, false));

		gun175 = new ModelRenderer(this);
		gun175.setRotationPoint(-0.5F, -30.5F, 0.8F);
		grip.addChild(gun175);
		setRotationAngle(gun175, -1.3013F, 0.0F, 0.0F);
		gun175.cubeList.add(new ModelBox(gun175, 72, 0, 0.0F, -0.001F, 0.0F, 1, 2, 6, 0.0F, false));

		gun173 = new ModelRenderer(this);
		gun173.setRotationPoint(0.0F, -23.7F, 2.5F);
		grip.addChild(gun173);
		setRotationAngle(gun173, -3.0486F, 0.0F, 0.0F);
		gun173.cubeList.add(new ModelBox(gun173, 54, 72, 0.001F, 0.0F, 0.001F, 1, 1, 2, 0.0F, false));

		gun171 = new ModelRenderer(this);
		gun171.setRotationPoint(0.0F, -17.6F, 3.2F);
		grip.addChild(gun171);
		setRotationAngle(gun171, -3.0486F, 0.0F, 0.0F);
		gun171.cubeList.add(new ModelBox(gun171, 63, 53, -0.001F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));

		gun179 = new ModelRenderer(this);
		gun179.setRotationPoint(-0.5F, -17.6F, 3.2F);
		grip.addChild(gun179);
		setRotationAngle(gun179, -3.0486F, 0.0F, 0.0F);
		

		gun176 = new ModelRenderer(this);
		gun176.setRotationPoint(-3.5F, -23.7F, 2.5F);
		grip.addChild(gun176);
		setRotationAngle(gun176, -3.0486F, 0.0F, 0.0F);
		gun176.cubeList.add(new ModelBox(gun176, 72, 3, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun177 = new ModelRenderer(this);
		gun177.setRotationPoint(-0.5F, -23.7F, 2.5F);
		grip.addChild(gun177);
		setRotationAngle(gun177, -3.0486F, 0.0F, 0.0F);
		gun177.cubeList.add(new ModelBox(gun177, 72, 0, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

		gun170 = new ModelRenderer(this);
		gun170.setRotationPoint(0.0F, -17.6F, 2.2F);
		grip.addChild(gun170);
		gun170.cubeList.add(new ModelBox(gun170, 38, 81, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
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
