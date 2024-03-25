package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Pin extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer Pin12_r1;
	private final ModelRenderer Pin11_r1;
	private final ModelRenderer Pin10_r1;
	private final ModelRenderer Pin9_r1;
	private final ModelRenderer Pin8_r1;
	private final ModelRenderer Pin7_r1;
	private final ModelRenderer Pin6_r1;
	private final ModelRenderer Pin13_r1;

	public Pin() {
		textureWidth = 256;
		textureHeight = 128;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -25.1815F, 43.4028F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, 5.1815F, -37.6028F, 4, 1, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.2F, 4.8815F, -38.1028F, 1, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.2F, 7.3815F, -34.6028F, 1, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.2F, 7.3815F, -40.6028F, 1, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 1.2F, 10.8815F, -38.1028F, 1, 1, 2, 0.0F, true));

		Pin12_r1 = new ModelRenderer(this);
		Pin12_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Pin12_r1);
		setRotationAngle(Pin12_r1, 2.082F, 0.0F, 0.0F);
		Pin12_r1.cubeList.add(new ModelBox(Pin12_r1, 0, 0, 1.2F, -37.3F, 7.3F, 1, 2, 1, 0.0F, true));

		Pin11_r1 = new ModelRenderer(this);
		Pin11_r1.setRotationPoint(0.0F, -18.2682F, -15.5113F);
		bone.addChild(Pin11_r1);
		setRotationAngle(Pin11_r1, 2.6397F, 0.0F, 0.0F);
		Pin11_r1.cubeList.add(new ModelBox(Pin11_r1, 0, 0, 1.2F, -37.3F, 5.3F, 1, 1, 2, 0.0F, true));

		Pin10_r1 = new ModelRenderer(this);
		Pin10_r1.setRotationPoint(0.0F, 45.3033F, -23.2388F);
		bone.addChild(Pin10_r1);
		setRotationAngle(Pin10_r1, 0.5205F, 0.0F, 0.0F);
		Pin10_r1.cubeList.add(new ModelBox(Pin10_r1, 0, 0, 1.2F, -39.8F, 2.8F, 1, 2, 1, 0.0F, true));

		Pin9_r1 = new ModelRenderer(this);
		Pin9_r1.setRotationPoint(0.0F, 30.9216F, -5.9481F);
		bone.addChild(Pin9_r1);
		setRotationAngle(Pin9_r1, 1.041F, 0.0F, 0.0F);
		Pin9_r1.cubeList.add(new ModelBox(Pin9_r1, 0, 0, 1.2F, -41.8F, 2.8F, 1, 1, 2, 0.0F, true));

		Pin8_r1 = new ModelRenderer(this);
		Pin8_r1.setRotationPoint(0.0F, 23.4987F, -78.6488F);
		bone.addChild(Pin8_r1);
		setRotationAngle(Pin8_r1, -1.0213F, 0.0F, 0.0F);
		Pin8_r1.cubeList.add(new ModelBox(Pin8_r1, 0, 0, 1.2F, -44.3F, 5.3F, 1, 2, 1, 0.0F, true));

		Pin7_r1 = new ModelRenderer(this);
		Pin7_r1.setRotationPoint(0.0F, 36.3111F, -68.1645F);
		bone.addChild(Pin7_r1);
		setRotationAngle(Pin7_r1, -0.632F, 0.0F, 0.0F);
		Pin7_r1.cubeList.add(new ModelBox(Pin7_r1, 0, 0, 1.2F, -44.3F, 7.3F, 1, 1, 2, 0.0F, true));

		Pin6_r1 = new ModelRenderer(this);
		Pin6_r1.setRotationPoint(0.0F, -32.4388F, -49.6534F);
		bone.addChild(Pin6_r1);
		setRotationAngle(Pin6_r1, -2.5281F, 0.0F, 0.0F);
		Pin6_r1.cubeList.add(new ModelBox(Pin6_r1, 0, 0, 1.2F, -41.8F, 9.8F, 1, 2, 1, 0.0F, true));

		Pin13_r1 = new ModelRenderer(this);
		Pin13_r1.setRotationPoint(0.0F, -18.6369F, -63.5201F);
		bone.addChild(Pin13_r1);
		setRotationAngle(Pin13_r1, -2.082F, 0.0F, 0.0F);
		Pin13_r1.cubeList.add(new ModelBox(Pin13_r1, 0, 0, 1.2F, -39.8F, 9.8F, 1, 1, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}