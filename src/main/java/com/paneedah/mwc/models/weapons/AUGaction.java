package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGaction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action3_r1;
	private final ModelRenderer action2_r1;
	private final ModelRenderer action1_r1;
	private final ModelRenderer action4_r1;

	public AUGaction() {
		textureWidth = 300;
		textureHeight = 300;

		action = new ModelRenderer(this);
		action.setRotationPoint(1.7514F, -9.7904F, -17.3F);
		

		action3_r1 = new ModelRenderer(this);
		action3_r1.setRotationPoint(24.623F, 22.3055F, 17.3F);
		action.addChild(action3_r1);
		setRotationAngle(action3_r1, 0.0F, 0.0F, -0.887F);
		action3_r1.cubeList.add(new ModelBox(action3_r1, 32, 87, 1.1F, -33.5F, -20.5F, 1, 1, 3, 0.0F, false));

		action2_r1 = new ModelRenderer(this);
		action2_r1.setRotationPoint(24.8407F, 22.3636F, 17.3F);
		action.addChild(action2_r1);
		setRotationAngle(action2_r1, 0.0F, 0.0F, -0.887F);
		action2_r1.cubeList.add(new ModelBox(action2_r1, 47, 47, 1.27F, -33.7F, -20.0F, 1, 1, 1, 0.0F, false));

		action1_r1 = new ModelRenderer(this);
		action1_r1.setRotationPoint(25.1764F, 22.4702F, 17.3F);
		action.addChild(action1_r1);
		setRotationAngle(action1_r1, 0.0F, 0.0F, -0.887F);
		action1_r1.cubeList.add(new ModelBox(action1_r1, 67, 45, 1.55F, -34.03F, -19.5F, 2, 1, 2, 0.0F, false));

		action4_r1 = new ModelRenderer(this);
		action4_r1.setRotationPoint(-28.3225F, -17.037F, 17.3F);
		action.addChild(action4_r1);
		setRotationAngle(action4_r1, 0.0F, 0.0F, 2.0702F);
		action4_r1.cubeList.add(new ModelBox(action4_r1, 118, 81, 1.8F, -33.3F, -19.7F, 1, 2, 15, 0.0F, false));
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
