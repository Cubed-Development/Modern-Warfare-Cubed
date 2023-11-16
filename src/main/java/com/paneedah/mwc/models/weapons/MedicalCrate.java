package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MedicalCrate extends ModelBase implements IModernModel {
	private final ModelRenderer shape;
	private final ModelRenderer Shape69_r1;
	private final ModelRenderer Shape67_r1;
	private final ModelRenderer Shape66_r1;
	private final ModelRenderer Shape64_r1;
	private final ModelRenderer Shape61_r1;
	private final ModelRenderer black;

	public MedicalCrate() {
		textureWidth = 512;
		textureHeight = 512;

		shape = new ModelRenderer(this);
		shape.setRotationPoint(0.0F, 0.6672F, 11.2852F);
		shape.cubeList.add(new ModelBox(shape, 0, 0, -7.0F, 13.3328F, -19.2852F, 18, 8, 27, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 6.0F, 13.3328F, -22.2852F, 6, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.0F, 13.3328F, -22.2852F, 6, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.0F, 13.3328F, 7.7148F, 6, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 6.0F, 13.3328F, 7.7148F, 6, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 13.3328F, -7.2852F, 1, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.0F, 13.3328F, -19.2852F, 1, 7, 27, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 13.3328F, -17.2852F, 1, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 13.3328F, -14.2852F, 1, 2, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 13.3328F, -9.2852F, 1, 2, 7, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 10.6F, 13.3328F, -19.2852F, 1, 7, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 10.6F, 13.3328F, -12.2852F, 1, 2, 13, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 13.3328F, 2.7148F, 1, 7, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 13.3328F, 0.7148F, 1, 2, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 10.6F, 13.3328F, 5.7148F, 1, 7, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.0F, 11.2328F, -21.2852F, 19, 2, 30, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -6.0F, 10.8328F, -21.2852F, 16, 2, 30, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 11.2328F, -17.2852F, 1, 2, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 11.2328F, -9.2852F, 1, 2, 7, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 11.0F, 11.2328F, 0.7148F, 1, 2, 5, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 10.6F, 11.2328F, 5.7148F, 1, 2, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 10.6F, 11.2328F, -12.2852F, 1, 2, 13, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 10.6F, 11.2328F, -19.2852F, 1, 2, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 3.0F, 11.2328F, -22.2852F, 9, 2, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.0F, 11.2328F, -22.2852F, 9, 2, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 1.0F, 11.2328F, -21.7852F, 2, 2, 32, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 3.0F, 11.2328F, 7.7148F, 9, 2, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -8.0F, 11.2328F, 7.7148F, 9, 2, 3, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -2.0F, 13.3328F, -22.2852F, 3, 2, 33, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 3.0F, 13.3328F, -22.2852F, 3, 2, 33, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, 1.0F, 13.3328F, -21.7852F, 2, 2, 32, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -2.0F, 15.3328F, -20.2852F, 8, 5, 29, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.0F, 10.3328F, -18.2852F, 14, 1, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.0F, 10.3328F, -11.2852F, 14, 1, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.0F, 10.3328F, -2.2852F, 14, 1, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 0, 0, -5.0F, 10.3328F, 4.7148F, 14, 1, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 150, 0, 11.2F, 16.3328F, -6.7852F, 1, 1, 2, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 150, 0, 11.2F, 15.8328F, -6.2852F, 1, 2, 1, 0.0F, true));
		shape.cubeList.add(new ModelBox(shape, 170, 0, 11.1F, 15.3328F, -6.7852F, 1, 4, 2, 0.0F, true));

		Shape69_r1 = new ModelRenderer(this);
		Shape69_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		shape.addChild(Shape69_r1);
		setRotationAngle(Shape69_r1, -1.2566F, 0.0F, 0.0F);
		Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 0, 0, -7.0F, -3.9F, 21.7F, 5, 3, 1, 0.0F, true));
		Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 0, 0, 6.0F, -3.9F, 21.7F, 5, 3, 1, 0.0F, true));
		Shape69_r1.cubeList.add(new ModelBox(Shape69_r1, 0, 0, -2.0F, -1.9F, 21.7F, 8, 1, 1, 0.0F, true));

		Shape67_r1 = new ModelRenderer(this);
		Shape67_r1.setRotationPoint(-0.1613F, 16.9335F, -11.2852F);
		shape.addChild(Shape67_r1);
		setRotationAngle(Shape67_r1, 0.0F, 0.0F, -0.7679F);
		Shape67_r1.cubeList.add(new ModelBox(Shape67_r1, 0, 0, -8.0F, -2.8F, -8.0F, 1, 1, 27, 0.0F, true));

		Shape66_r1 = new ModelRenderer(this);
		Shape66_r1.setRotationPoint(0.5584F, 14.7506F, -11.2852F);
		shape.addChild(Shape66_r1);
		setRotationAngle(Shape66_r1, 0.0F, 0.0F, 0.7679F);
		Shape66_r1.cubeList.add(new ModelBox(Shape66_r1, 0, 0, 10.9F, -3.6F, 17.0F, 1, 1, 2, 0.0F, true));
		Shape66_r1.cubeList.add(new ModelBox(Shape66_r1, 0, 0, 10.9F, -3.6F, -8.0F, 1, 1, 2, 0.0F, true));

		Shape64_r1 = new ModelRenderer(this);
		Shape64_r1.setRotationPoint(0.863F, 15.1969F, -11.2852F);
		shape.addChild(Shape64_r1);
		setRotationAngle(Shape64_r1, 0.0F, 0.0F, 0.7679F);
		Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 0, 0, 10.5F, -3.8F, 14.0F, 1, 1, 3, 0.0F, true));
		Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 0, 0, 10.5F, -3.8F, 4.0F, 1, 1, 3, 0.0F, true));
		Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 0, 0, 10.5F, -3.8F, -6.0F, 1, 1, 3, 0.0F, true));

		Shape61_r1 = new ModelRenderer(this);
		Shape61_r1.setRotationPoint(0.0F, 10.7982F, -16.0329F);
		shape.addChild(Shape61_r1);
		setRotationAngle(Shape61_r1, 1.2566F, 0.0F, 0.0F);
		Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 0, 0, -2.0F, -1.0F, -11.0F, 8, 1, 1, 0.0F, true));
		Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 0, 0, -7.0F, -3.0F, -11.0F, 5, 3, 1, 0.0F, true));
		Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 0, 0, 6.0F, -3.0F, -11.0F, 5, 3, 1, 0.0F, true));

		black = new ModelRenderer(this);
		black.setRotationPoint(0.0F, 24.0F, 0.0F);
		black.cubeList.add(new ModelBox(black, 0, 100, 11.0F, -11.5F, 0.0F, 1, 3, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 11.0F, -11.5F, 10.0F, 1, 3, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 11.0F, -11.5F, -7.5F, 1, 3, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 11.0F, -11.5F, 17.5F, 1, 3, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, -8.5F, -11.0F, -8.0F, 1, 2, 27, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 1.5F, -11.5F, -11.0F, 1, 3, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 1.5F, -11.5F, 21.0F, 1, 3, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.3F, -7.6F, -2.5F, 1, 2, 6, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.3F, -7.6F, 7.5F, 1, 2, 6, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.6F, -6.8F, -2.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.6F, -6.8F, 2.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.6F, -3.8F, -1.5F, 1, 1, 4, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.6F, -6.8F, 7.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.6F, -6.8F, 12.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 10.6F, -3.8F, 8.5F, 1, 1, 4, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, -1.0F, -7.6F, -10.0F, 6, 2, 31, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, -1.0F, -6.6F, -10.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 4.0F, -6.56F, -10.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 0.0F, -3.6F, -10.5F, 4, 1, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, -1.0F, -6.6F, 20.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 4.0F, -6.6F, 20.5F, 1, 4, 1, 0.0F, true));
		black.cubeList.add(new ModelBox(black, 0, 100, 0.0F, -3.6F, 20.5F, 4, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		shape.render(f5);
		black.render(f5);
	}
}