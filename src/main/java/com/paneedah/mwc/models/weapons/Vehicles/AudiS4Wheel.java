package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.5
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class AudiS4Wheel extends ModelBase {
	private final ModelRenderer da_wheels;
	private final ModelRenderer wheel5;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public AudiS4Wheel() {
		textureWidth = 512;
		textureHeight = 512;

		da_wheels = new ModelRenderer(this);
		da_wheels.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		wheel5 = new ModelRenderer(this);
		wheel5.setRotationPoint(-0.3571F, -12.0714F, 0.0F);
		da_wheels.addChild(wheel5);
		wheel5.cubeList.add(new ModelBox(wheel5, 150, 121, -3.6429F, -10.9286F, -5.0F, 7, 4, 10, 0.0F, false));
		wheel5.cubeList.add(new ModelBox(wheel5, 0, 73, -1.6429F, -6.9286F, -7.0F, 3, 14, 14, 0.0F, false));
		wheel5.cubeList.add(new ModelBox(wheel5, 323, 279, -3.6429F, -4.9286F, 7.0F, 7, 10, 4, 0.0F, false));
		wheel5.cubeList.add(new ModelBox(wheel5, 46, 317, -3.6429F, -4.9286F, -11.0F, 7, 10, 4, 0.0F, false));
		wheel5.cubeList.add(new ModelBox(wheel5, 49, 93, -3.6429F, 7.0714F, -5.0F, 7, 4, 10, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(3.3571F, 11.0714F, 6.0F);
		wheel5.addChild(bone6);
		setRotationAngle(bone6, 0.7854F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 80, 287, -6.99F, -4.7071F, -0.7071F, 7, 4, 8, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 378, 155, -6.99F, -15.7782F, -7.7782F, 7, 8, 4, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(3.3571F, -10.9286F, -5.0F);
		wheel5.addChild(bone7);
		setRotationAngle(bone7, -0.7854F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 161, 146, -6.99F, -7.0711F, 7.0711F, 7, 4, 8, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 359, -6.99F, 0.0F, 0.0F, 7, 8, 4, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 102, 314, -6.5F, 2.1213F, 9.1924F, 6, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		da_wheels.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
