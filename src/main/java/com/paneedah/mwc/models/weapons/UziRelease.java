package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class UziRelease extends ModelWithAttachments {
	private final ModelRenderer release;
	private final ModelRenderer Release3_r1_r1;
	private final ModelRenderer Release4_r1_r1;
	private final ModelRenderer Release7_r1_r1;

	public UziRelease() {
		textureWidth = 240;
		textureHeight = 240;

		release = new ModelRenderer(this);
		release.setRotationPoint(19.9106F, 24.0F, -25.928F);
		release.cubeList.add(new ModelBox(release, 159, 172, -21.8106F, -39.597F, 3.428F, 1, 1, 14, 0.0F, false));
		release.cubeList.add(new ModelBox(release, 105, 168, -22.0106F, -39.6F, 3.428F, 1, 1, 14, 0.0F, false));
		release.cubeList.add(new ModelBox(release, 57, 100, -21.8106F, -40.3F, 3.628F, 1, 1, 1, 0.0F, false));
		release.cubeList.add(new ModelBox(release, 100, 25, -22.0106F, -40.3F, 3.628F, 1, 1, 1, 0.0F, false));

		Release3_r1_r1 = new ModelRenderer(this);
		Release3_r1_r1.setRotationPoint(-35.9407F, 16.7756F, 25.928F);
		release.addChild(Release3_r1_r1);
		setRotationAngle(Release3_r1_r1, 0.0F, 0.0F, 0.7854F);
		Release3_r1_r1.cubeList.add(new ModelBox(Release3_r1_r1, 72, 80, -29.165F, -50.5622F, -22.5F, 1, 1, 14, 0.0F, false));

		Release4_r1_r1 = new ModelRenderer(this);
		Release4_r1_r1.setRotationPoint(-35.4436F, 17.2727F, 25.928F);
		release.addChild(Release4_r1_r1);
		setRotationAngle(Release4_r1_r1, 0.0F, 0.0F, 0.7854F);
		Release4_r1_r1.cubeList.add(new ModelBox(Release4_r1_r1, 0, 87, -30.7165F, -49.7136F, -22.5F, 1, 1, 14, 0.0F, false));

		Release7_r1_r1 = new ModelRenderer(this);
		Release7_r1_r1.setRotationPoint(29.0226F, 0.0004F, 15.0459F);
		release.addChild(Release7_r1_r1);
		setRotationAngle(Release7_r1_r1, 3.1416F, 1.3942F, -3.1416F);
		Release7_r1_r1.cubeList.add(new ModelBox(Release7_r1_r1, 58, 123, 19.0106F, -40.3F, -47.228F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		release.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}