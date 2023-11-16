package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HangingBody extends ModelBase implements IModernModel {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer rightleg;
	private final ModelRenderer leftleg;
	private final ModelRenderer rope1;

	public HangingBody() {
		textureWidth = 256;
		textureHeight = 256;

		head = new ModelRenderer(this);
		head.setRotationPoint(-4.0F, -8.0F, -6.0F);
		setRotationAngle(head, 0.2974F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, 0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(-4.0F, -2.0F, -2.0F);
		setRotationAngle(body, -0.0744F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, 0.0F, 0.0F, 0.0F, 8, 12, 4, 0.0F, true));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-5.0F, 1.0F, 0.0F);
		setRotationAngle(rightarm, -0.0372F, 0.0F, 0.0372F);
		rightarm.cubeList.add(new ModelBox(rightarm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(3.5F, -1.5F, -2.0F);
		setRotationAngle(leftarm, 0.0F, 0.0F, -0.1115F);
		leftarm.cubeList.add(new ModelBox(leftarm, 40, 16, 0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F, true));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 10.0F, -1.0F);
		setRotationAngle(rightleg, 0.0F, 0.0F, 0.1115F);
		rightleg.cubeList.add(new ModelBox(rightleg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F, true));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(0.0F, 10.0F, -3.0F);
		setRotationAngle(leftleg, 0.1859F, 0.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 0, 16, 0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F, true));

		rope1 = new ModelRenderer(this);
		rope1.setRotationPoint(-4.5F, -0.5F, -4.3F);
		setRotationAngle(rope1, 0.4461F, 0.0F, 0.0F);
		rope1.cubeList.add(new ModelBox(rope1, 0, 46, 0.0F, 0.0F, 0.0F, 9, 2, 9, 0.0F, true));
		rope1.cubeList.add(new ModelBox(rope1, 0, 46, 3.5F, -20.0F, 7.0F, 2, 18, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		body.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		rightleg.render(f5);
		leftleg.render(f5);
		rope1.render(f5);
	}
}