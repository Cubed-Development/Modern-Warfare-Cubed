package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziSightRail extends ModelWithAttachments {
	private final ModelRenderer SightRail1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer rail;

	public UziSightRail() {
		textureWidth = 240;
		textureHeight = 240;

		SightRail1 = new ModelRenderer(this);
		SightRail1.setRotationPoint(-2.9667F, -15.5F, 4.7667F);
		SightRail1.cubeList.add(new ModelBox(SightRail1, 162, 26, 0.0167F, -1.9F, -11.9667F, 3, 1, 14, 0.0F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 87, 168, 0.0167F, -1.3F, -10.9667F, 3, 1, 13, 0.0F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 51, 94, -0.2333F, -0.9F, 0.4333F, 2, 1, 2, -0.25F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 43, 94, -0.2333F, -0.9F, -4.3667F, 2, 1, 2, -0.25F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 47, 44, 0.4667F, -1.6F, 0.3333F, 2, 1, 1, 0.0F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 39, 49, -1.2333F, -0.08F, -4.1667F, 1, 2, 1, -0.04F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 8, 63, -1.4333F, 0.92F, 0.9333F, 1, 1, 1, -0.17F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 48, 9, -1.2333F, -0.08F, 0.6333F, 1, 2, 1, -0.04F, false));
		SightRail1.cubeList.add(new ModelBox(SightRail1, 24, 62, -1.4333F, 0.92F, -3.8667F, 1, 1, 1, -0.17F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.9667F, -1.1F, -9.5667F);
		SightRail1.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.0647F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 40, -1.1F, 2.15F, 5.4F, 1, 2, 1, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 49, -1.1F, 2.15F, 10.2F, 1, 2, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5167F, -1.0479F, -11.1289F);
		SightRail1.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.576F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 77, 26, -1.5F, -0.5F, -0.5F, 3, 1, 1, -0.001F, false));

		rail = new ModelRenderer(this);
		rail.setRotationPoint(0.0F, 0.0F, 0.0F);
		SightRail1.addChild(rail);
		
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		SightRail1.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}