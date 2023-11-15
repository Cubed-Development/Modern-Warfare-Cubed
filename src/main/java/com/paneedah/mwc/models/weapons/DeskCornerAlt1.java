package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DeskCornerAlt1 extends ModelBase implements IModernModel {
	private final ModelRenderer deska1;
	private final ModelRenderer desk7_r1;

	public DeskCornerAlt1() {
		textureWidth = 256;
		textureHeight = 256;

		deska1 = new ModelRenderer(this);
		deska1.setRotationPoint(0.7772F, 24.0F, -1.4643F);
		deska1.cubeList.add(new ModelBox(deska1, 0, 0, -7.7772F, -16.0F, 7.9643F, 15, 15, 1, 0.0F, true));
		deska1.cubeList.add(new ModelBox(deska1, 0, 0, -7.7772F, -16.0F, -5.5357F, 15, 4, 14, 0.0F, true));
		deska1.cubeList.add(new ModelBox(deska1, 0, 0, -8.2772F, -16.0F, -5.5357F, 1, 15, 14, 0.0F, true));
		deska1.cubeList.add(new ModelBox(deska1, 0, 0, -8.3772F, -15.95F, 7.0643F, 2, 16, 2, 0.0F, true));

		desk7_r1 = new ModelRenderer(this);
		desk7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		deska1.addChild(desk7_r1);
		setRotationAngle(desk7_r1, 0.0F, 0.5949F, 0.0F);
		desk7_r1.cubeList.add(new ModelBox(desk7_r1, 0, 50, -1.0F, -8.0F, 3.0F, 4, 8, 1, 0.0F, true));
		desk7_r1.cubeList.add(new ModelBox(desk7_r1, 0, 50, -1.0F, -8.0F, -2.0F, 4, 8, 1, 0.0F, true));
		desk7_r1.cubeList.add(new ModelBox(desk7_r1, 0, 50, -2.0F, -8.0F, -2.0F, 1, 8, 6, 0.0F, true));
		desk7_r1.cubeList.add(new ModelBox(desk7_r1, 0, 50, 3.0F, -8.0F, -2.0F, 1, 8, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		deska1.render(f5);
	}
}