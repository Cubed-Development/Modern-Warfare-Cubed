package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGaction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action_r1;
	private final ModelRenderer action_r2;
	private final ModelRenderer action_r3;
	private final ModelRenderer action4_r1;

	public AUGaction() {
		textureWidth = 270;
		textureHeight = 270;

		action = new ModelRenderer(this);
		action.setRotationPoint(1.7514F, -9.7904F, -17.3F);
		

		action_r1 = new ModelRenderer(this);
		action_r1.setRotationPoint(-16.7225F, 14.0802F, 13.3F);
		action.addChild(action_r1);
		setRotationAngle(action_r1, 0.0F, 0.0F, 0.7854F);
		action_r1.cubeList.add(new ModelBox(action_r1, 36, 54, 1.55F, -22.425F, -16.5F, 1, 1, 3, 0.0F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 5, 34, 1.4F, -21.825F, -15.1F, 1, 1, 1, -0.2F, false));
		action_r1.cubeList.add(new ModelBox(action_r1, 50, 68, 1.55F, -24.425F, -16.25F, 1, 2, 2, -0.001F, false));

		action_r2 = new ModelRenderer(this);
		action_r2.setRotationPoint(0.2304F, 0.7335F, -3.2F);
		action.addChild(action_r2);
		setRotationAngle(action_r2, 1.7977F, 0.0F, 0.7854F);
		action_r2.cubeList.add(new ModelBox(action_r2, 16, 54, -1.0F, 2.15F, 0.3F, 1, 1, 3, 0.001F, false));

		action_r3 = new ModelRenderer(this);
		action_r3.setRotationPoint(0.2304F, 0.7335F, -3.2F);
		action.addChild(action_r3);
		setRotationAngle(action_r3, 2.6398F, 0.0F, 0.7854F);
		action_r3.cubeList.add(new ModelBox(action_r3, 52, 54, -1.0F, 2.575F, -0.15F, 1, 2, 2, 0.0F, false));

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