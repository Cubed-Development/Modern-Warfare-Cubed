package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AUGScopeRail extends ModelWithAttachments {
	private final ModelRenderer scoperail;
	private final ModelRenderer scoperail1_r1;
	private final ModelRenderer scoperail2_r1;

	public AUGScopeRail() {
		textureWidth = 300;
		textureHeight = 300;

		scoperail = new ModelRenderer(this);
		scoperail.setRotationPoint(-1.5556F, -16.0863F, -8.9535F);
		scoperail.cubeList.add(new ModelBox(scoperail, 89, 40, -0.9444F, 2.9863F, -12.5465F, 2, 1, 16, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 153, 0, -0.9444F, 1.9863F, -10.5465F, 2, 1, 13, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 82, 136, -0.9444F, -0.9137F, -7.5465F, 2, 1, 13, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 27, -1.4444F, -1.9137F, -9.0465F, 3, 1, 26, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 0, -1.4444F, -3.4137F, -9.0465F, 3, 1, 26, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 60, 60, -1.2444F, -2.4137F, -9.0465F, 1, 1, 26, 0.0F, false));
		scoperail.cubeList.add(new ModelBox(scoperail, 0, 60, -0.6444F, -2.4137F, -9.0465F, 2, 1, 26, 0.0F, false));

		scoperail1_r1 = new ModelRenderer(this);
		scoperail1_r1.setRotationPoint(1.5556F, 15.7401F, 28.3925F);
		scoperail.addChild(scoperail1_r1);
		setRotationAngle(scoperail1_r1, 0.7436F, 0.0F, 0.0F);
		scoperail1_r1.cubeList.add(new ModelBox(scoperail1_r1, 60, 96, -2.5F, -37.1F, -21.5F, 2, 2, 8, 0.0F, false));

		scoperail2_r1 = new ModelRenderer(this);
		scoperail2_r1.setRotationPoint(1.5556F, 18.3708F, 35.267F);
		scoperail.addChild(scoperail2_r1);
		setRotationAngle(scoperail2_r1, 0.9295F, 0.0F, 0.0F);
		scoperail2_r1.cubeList.add(new ModelBox(scoperail2_r1, 45, 12, -2.5F, -37.1F, -8.5F, 2, 2, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		scoperail.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}