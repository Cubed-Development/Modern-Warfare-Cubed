package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MakarovPBSSilencer extends ModelWithAttachments {
	private final ModelRenderer pbs_silencer;
	private final ModelRenderer gun144_r4_r1;
	private final ModelRenderer gun148_r1_r1;
	private final ModelRenderer gun146_r1_r1;
	private final ModelRenderer gun145_r3_r1;

	public MakarovPBSSilencer() {
		textureWidth = 200;
		textureHeight = 200;

		pbs_silencer = new ModelRenderer(this);
		pbs_silencer.setRotationPoint(0.0F, 24.0F, -13.0F);
		pbs_silencer.cubeList.add(new ModelBox(pbs_silencer, 50, 25, -2.5F, -37.4F, -30.7039F, 2, 1, 20, 0.0F, false));
		pbs_silencer.cubeList.add(new ModelBox(pbs_silencer, 42, 72, -0.1F, -36.0F, -30.7039F, 1, 2, 20, 0.0F, false));
		pbs_silencer.cubeList.add(new ModelBox(pbs_silencer, 50, 0, -2.5F, -33.6F, -30.7039F, 2, 1, 20, 0.0F, false));
		pbs_silencer.cubeList.add(new ModelBox(pbs_silencer, 0, 72, -3.9F, -36.0F, -30.7039F, 1, 2, 20, 0.0F, false));

		gun144_r4_r1 = new ModelRenderer(this);
		gun144_r4_r1.setRotationPoint(26.2994F, -11.3078F, 13.0F);
		pbs_silencer.addChild(gun144_r4_r1);
		setRotationAngle(gun144_r4_r1, 0.0F, 0.0F, -0.7854F);
		gun144_r4_r1.cubeList.add(new ModelBox(gun144_r4_r1, 49, 50, -1.5F, -37.4F, -43.7F, 1, 2, 20, 0.0F, false));

		gun148_r1_r1 = new ModelRenderer(this);
		gun148_r1_r1.setRotationPoint(24.3053F, -9.322F, 13.0F);
		pbs_silencer.addChild(gun148_r1_r1);
		setRotationAngle(gun148_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun148_r1_r1.cubeList.add(new ModelBox(gun148_r1_r1, 25, 49, -1.1F, -35.0F, -43.7F, 2, 1, 20, 0.0F, false));

		gun146_r1_r1 = new ModelRenderer(this);
		gun146_r1_r1.setRotationPoint(22.8994F, -12.7161F, 13.0F);
		pbs_silencer.addChild(gun146_r1_r1);
		setRotationAngle(gun146_r1_r1, 0.0F, 0.0F, -0.7854F);
		gun146_r1_r1.cubeList.add(new ModelBox(gun146_r1_r1, 71, 46, -3.9F, -34.0F, -43.7F, 1, 2, 20, 0.0F, false));

		gun145_r3_r1 = new ModelRenderer(this);
		gun145_r3_r1.setRotationPoint(-27.1781F, -9.1865F, 13.0F);
		pbs_silencer.addChild(gun145_r3_r1);
		setRotationAngle(gun145_r3_r1, 0.0F, 0.0F, 0.7854F);
		gun145_r3_r1.cubeList.add(new ModelBox(gun145_r3_r1, 71, 68, -2.5F, -37.4F, -43.7F, 1, 2, 20, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pbs_silencer.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}