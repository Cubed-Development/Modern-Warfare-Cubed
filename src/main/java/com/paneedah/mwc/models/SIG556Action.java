package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SIG556Action extends ModelBase {
	private final QRenderer action;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;

	public SIG556Action() {
		textureWidth = 350;
		textureHeight = 350;

		action = new QRenderer(this);
		action.setRotationPoint(-3.5F, -14.3F, -23.3F);
		action.cubeList.add(new ModelBox(action, 92, 94, 0.0F, 0.3F, 0.0F, 1, 1, 9, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 35, 129, -0.5F, -1.4F, 0.4F, 1, 1, 1, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(0.0F, 0.3F, 1.0F);
		action.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.0F, 0.0F, 0.2618F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 65, 92, 0.0F, -2.0F, -1.0F, 1, 2, 9, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(0.5F, -1.4F, 1.9F);
		action.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, -0.1571F, 0.0F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 38, -3.0F, 0.0F, -1.0F, 3, 1, 1, 0.001F, false));

		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
