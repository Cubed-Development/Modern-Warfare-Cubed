package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class OperatingTableAlt extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer table15_r1;
	private final ModelRenderer table14_r1;
	private final ModelRenderer table13_r1;
	private final ModelRenderer table12_r1;
	private final ModelRenderer table11_r1;
	private final ModelRenderer table10_r1;
	private final ModelRenderer table8_r1;
	private final ModelRenderer table6_r1;
	private final ModelRenderer table4_r1;
	private final ModelRenderer table3_r1;

	public OperatingTableAlt() {
		textureWidth = 256;
		textureHeight = 256;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, -22.9382F, -7.0596F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -4.0F, 36.9382F, 3.0596F, 8, 6, 8, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 30, -5.0F, 42.9382F, 1.0596F, 10, 2, 15, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 60, -3.5F, 30.9382F, 3.5596F, 7, 6, 7, 0.0F, true));

		table15_r1 = new ModelRenderer(this);
		table15_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(table15_r1);
		setRotationAngle(table15_r1, -2.843F, 0.0F, 0.0F);
		table15_r1.cubeList.add(new ModelBox(table15_r1, 0, 0, -5.5F, -32.4F, -8.9F, 11, 2, 12, 0.0F, true));

		table14_r1 = new ModelRenderer(this);
		table14_r1.setRotationPoint(0.0F, 38.4552F, -15.7255F);
		bone.addChild(table14_r1);
		setRotationAngle(table14_r1, -1.2641F, 0.0F, 0.0F);
		table14_r1.cubeList.add(new ModelBox(table14_r1, 0, 90, -6.0F, -19.8F, -5.6F, 12, 12, 2, 0.0F, true));

		table13_r1 = new ModelRenderer(this);
		table13_r1.setRotationPoint(0.0F, 27.7175F, 29.8413F);
		bone.addChild(table13_r1);
		setRotationAngle(table13_r1, 2.1192F, 0.0F, 0.0F);
		table13_r1.cubeList.add(new ModelBox(table13_r1, 0, 90, -6.0F, -16.0F, 6.0F, 12, 12, 2, 0.0F, true));

		table12_r1 = new ModelRenderer(this);
		table12_r1.setRotationPoint(0.0F, 15.8521F, 21.085F);
		bone.addChild(table12_r1);
		setRotationAngle(table12_r1, 3.0115F, 0.0F, 0.0F);
		table12_r1.cubeList.add(new ModelBox(table12_r1, 0, 90, -6.0F, -16.0F, 6.0F, 12, 2, 12, 0.0F, true));

		table11_r1 = new ModelRenderer(this);
		table11_r1.setRotationPoint(0.0F, 30.3334F, 27.3739F);
		bone.addChild(table11_r1);
		setRotationAngle(table11_r1, 2.1192F, 0.0F, 0.0F);
		table11_r1.cubeList.add(new ModelBox(table11_r1, 0, 0, -5.5F, -14.0F, 5.5F, 11, 13, 2, 0.0F, true));

		table10_r1 = new ModelRenderer(this);
		table10_r1.setRotationPoint(0.0F, 19.7703F, 19.8297F);
		bone.addChild(table10_r1);
		setRotationAngle(table10_r1, 3.0115F, 0.0F, 0.0F);
		table10_r1.cubeList.add(new ModelBox(table10_r1, 0, 0, -5.5F, -14.0F, 5.5F, 11, 2, 12, 0.0F, true));

		table8_r1 = new ModelRenderer(this);
		table8_r1.setRotationPoint(0.0F, 51.2415F, 9.6705F);
		bone.addChild(table8_r1);
		setRotationAngle(table8_r1, 0.7854F, 0.0F, 0.0F);
		table8_r1.cubeList.add(new ModelBox(table8_r1, 0, 30, -4.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F, true));
		table8_r1.cubeList.add(new ModelBox(table8_r1, 0, 30, 2.5F, -1.0F, 6.5F, 2, 2, 2, 0.0F, true));

		table6_r1 = new ModelRenderer(this);
		table6_r1.setRotationPoint(0.0F, 38.5136F, 4.3984F);
		bone.addChild(table6_r1);
		setRotationAngle(table6_r1, 0.7854F, 0.0F, 0.0F);
		table6_r1.cubeList.add(new ModelBox(table6_r1, 0, 30, -5.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F, true));
		table6_r1.cubeList.add(new ModelBox(table6_r1, 0, 30, 3.5F, -1.0F, -11.5F, 2, 2, 2, 0.0F, true));

		table4_r1 = new ModelRenderer(this);
		table4_r1.setRotationPoint(-1.9297F, 46.9382F, 5.7611F);
		bone.addChild(table4_r1);
		setRotationAngle(table4_r1, 0.0F, -0.1859F, 0.0F);
		table4_r1.cubeList.add(new ModelBox(table4_r1, 0, 30, 3.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F, true));

		table3_r1 = new ModelRenderer(this);
		table3_r1.setRotationPoint(1.9297F, 46.9382F, 5.7611F);
		bone.addChild(table3_r1);
		setRotationAngle(table3_r1, 0.0F, 0.1859F, 0.0F);
		table3_r1.cubeList.add(new ModelBox(table3_r1, 0, 30, -6.0F, -4.0F, -11.0F, 3, 2, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}