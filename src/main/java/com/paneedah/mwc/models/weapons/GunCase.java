package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GunCase extends ModelBase implements IModernModel {
	private final ModelRenderer guncase;
	private final ModelRenderer Shape86Hatch_r1;
	private final ModelRenderer Shape82Hatch_r1;
	private final ModelRenderer Shape79Hatch_r1;
	private final ModelRenderer Shape75Hatch_r1;
	private final ModelRenderer Shape25_r1;
	private final ModelRenderer Shape24_r1;
	private final ModelRenderer Shape23_r1;
	private final ModelRenderer Shape22_r1;

	public GunCase() {
		textureWidth = 256;
		textureHeight = 256;

		guncase = new ModelRenderer(this);
		guncase.setRotationPoint(17.8353F, 24.0F, -0.723F);
		guncase.cubeList.add(new ModelBox(guncase, 0, 0, -22.8353F, -6.0F, -23.277F, 14, 5, 60, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 91, 7, -23.8353F, -6.01F, -22.277F, 16, 5, 58, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 65, -25.1353F, -7.5F, -13.277F, 2, 3, 9, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 33, 42, -25.1353F, -7.5F, 17.723F, 2, 3, 9, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 65, -23.8353F, -9.1F, -22.827F, 16, 3, 59, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 13, -23.8253F, -9.3F, 0.723F, 16, 1, 12, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 0, -23.8253F, -9.3F, -14.277F, 16, 1, 12, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 26, -23.8253F, -9.3F, 15.723F, 16, 1, 12, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 45, -23.8253F, -9.3F, 30.723F, 16, 1, 5, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 39, -23.8253F, -9.3F, -22.277F, 16, 1, 5, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 44, 13, -8.3353F, -8.1F, -17.277F, 2, 5, 3, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 26, -8.3353F, -8.1F, -2.277F, 2, 5, 3, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 13, -8.3353F, -8.1F, 12.723F, 2, 5, 3, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 0, -8.3353F, -8.1F, 27.723F, 2, 5, 3, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 46, 39, -16.8353F, -8.1F, -24.777F, 3, 5, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 44, 26, -16.8353F, -8.1F, 36.223F, 3, 5, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 53, 0, -6.8353F, -7.1F, -13.777F, 1, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 53, 53, -6.8353F, -7.1F, -4.777F, 1, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 50, 8, -6.8353F, -7.1F, 16.223F, 1, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 127, -7.8353F, -7.1F, -22.277F, 1, 2, 58, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 44, 21, -6.8353F, -7.1F, 25.223F, 1, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 44, 8, -6.8353F, -7.1F, 31.223F, 1, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 55, -22.8353F, -7.1F, 35.723F, 14, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 51, -22.8353F, -7.1F, -24.277F, 14, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 92, 92, -24.8353F, -7.1F, -22.277F, 1, 2, 58, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 44, 0, -6.8353F, -7.1F, -19.777F, 1, 2, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 52, 31, -8.6353F, -5.0F, 1.723F, 2, 3, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 52, 19, -8.6353F, -5.0F, 9.723F, 2, 3, 2, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 36, -7.6353F, -3.5F, 10.223F, 3, 1, 1, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 0, 34, -7.6353F, -3.5F, 2.223F, 3, 1, 1, 0.0F, false));
		guncase.cubeList.add(new ModelBox(guncase, 44, 0, -5.3353F, -3.5F, 3.223F, 1, 1, 7, 0.0F, false));

		Shape86Hatch_r1 = new ModelRenderer(this);
		Shape86Hatch_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		guncase.addChild(Shape86Hatch_r1);
		setRotationAngle(Shape86Hatch_r1, 0.0F, 0.7505F, 0.0F);
		Shape86Hatch_r1.cubeList.add(new ModelBox(Shape86Hatch_r1, 44, 33, 8.1F, -7.1F, -23.9F, 2, 2, 3, 0.0F, false));

		Shape82Hatch_r1 = new ModelRenderer(this);
		Shape82Hatch_r1.setRotationPoint(-3.5427F, 0.0F, -9.8993F);
		guncase.addChild(Shape82Hatch_r1);
		setRotationAngle(Shape82Hatch_r1, 0.0F, 0.7679F, 0.0F);
		Shape82Hatch_r1.cubeList.add(new ModelBox(Shape82Hatch_r1, 0, 8, -6.8F, -7.1F, -23.7F, 3, 2, 2, 0.0F, false));

		Shape79Hatch_r1 = new ModelRenderer(this);
		Shape79Hatch_r1.setRotationPoint(-44.3415F, 0.0F, 6.7316F);
		guncase.addChild(Shape79Hatch_r1);
		setRotationAngle(Shape79Hatch_r1, 0.0F, 0.7854F, 0.0F);
		Shape79Hatch_r1.cubeList.add(new ModelBox(Shape79Hatch_r1, 46, 46, -6.7F, -7.1F, 34.2F, 2, 2, 3, 0.0F, false));

		Shape75Hatch_r1 = new ModelRenderer(this);
		Shape75Hatch_r1.setRotationPoint(-40.8886F, 0.0F, 17.7037F);
		guncase.addChild(Shape75Hatch_r1);
		setRotationAngle(Shape75Hatch_r1, 0.0F, 0.8203F, 0.0F);
		Shape75Hatch_r1.cubeList.add(new ModelBox(Shape75Hatch_r1, 0, 21, 7.2F, -7.1F, 35.1F, 3, 2, 2, 0.0F, false));

		Shape25_r1 = new ModelRenderer(this);
		Shape25_r1.setRotationPoint(-38.4606F, 0.0F, 14.0528F);
		guncase.addChild(Shape25_r1);
		setRotationAngle(Shape25_r1, 0.0F, 0.6981F, 0.0F);
		Shape25_r1.cubeList.add(new ModelBox(Shape25_r1, 0, 39, 8.3F, -5.0F, 35.4F, 1, 4, 1, 0.0F, false));

		Shape24_r1 = new ModelRenderer(this);
		Shape24_r1.setRotationPoint(-4.4554F, 0.0F, -8.5141F);
		guncase.addChild(Shape24_r1);
		setRotationAngle(Shape24_r1, 0.0F, 0.6981F, 0.0F);
		Shape24_r1.cubeList.add(new ModelBox(Shape24_r1, 37, 39, -5.8F, -5.0F, -23.2F, 1, 4, 1, 0.0F, false));

		Shape23_r1 = new ModelRenderer(this);
		Shape23_r1.setRotationPoint(-41.7356F, 0.0F, 5.0541F);
		guncase.addChild(Shape23_r1);
		setRotationAngle(Shape23_r1, 0.0F, 0.6981F, 0.0F);
		Shape23_r1.cubeList.add(new ModelBox(Shape23_r1, 0, 45, -6.1F, -5.0F, 35.2F, 1, 4, 1, 0.0F, false));

		Shape22_r1 = new ModelRenderer(this);
		Shape22_r1.setRotationPoint(-1.1803F, 0.0F, 0.4846F);
		guncase.addChild(Shape22_r1);
		setRotationAngle(Shape22_r1, 0.0F, 0.6981F, 0.0F);
		Shape22_r1.cubeList.add(new ModelBox(Shape22_r1, 37, 45, 8.5F, -5.0F, -22.9F, 1, 4, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		guncase.render(f5);
	}
}