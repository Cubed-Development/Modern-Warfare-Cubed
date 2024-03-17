package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60FrontSight extends ModelWithAttachments {
	private final ModelRenderer m60ironsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;

	public M60FrontSight() {
		textureWidth = 150;
		textureHeight = 150;

		m60ironsight = new ModelRenderer(this);
		m60ironsight.setRotationPoint(-1.0F, -25.0F, -24.0F);
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.5F, -2.5F, -0.5F, 3, 3, 1, 0.0F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 0, 0, -1.95F, -4.1586F, -1.0F, 4, 2, 2, -0.2F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.3F, -4.6586F, 0.1F, 3, 1, 1, -0.3F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.7F, -4.6586F, 0.1F, 3, 1, 1, -0.3F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, 0.7F, -5.0586F, 0.1F, 1, 1, 1, -0.3F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, 0.3F, -5.0586F, 0.1F, 1, 1, 1, -0.3F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -0.1F, -5.0586F, 0.1F, 1, 1, 1, -0.3F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.7F, -5.0586F, 0.1F, 1, 1, 1, -0.3F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.3F, -5.0586F, 0.1F, 1, 1, 1, -0.3F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -0.9F, -5.0586F, 0.1F, 1, 1, 1, -0.3F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, 0.65F, -8.7586F, -0.3F, 1, 5, 1, -0.2F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, 0.65F, -8.7586F, -0.7F, 1, 5, 1, -0.2F, false));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.65F, -8.7586F, -0.3F, 1, 5, 1, -0.2F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.65F, -8.7586F, -0.7F, 1, 5, 1, -0.2F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.65F, -9.0586F, -0.3F, 3, 1, 1, -0.2F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.65F, -9.0586F, -0.7F, 3, 1, 1, -0.2F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.35F, -9.0586F, -0.3F, 3, 1, 1, -0.2F, true));
		m60ironsight.cubeList.add(new ModelBox(m60ironsight, 1, 1, -1.35F, -9.0586F, -0.7F, 3, 1, 1, -0.2F, true));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.05F, -3.1586F, 0.0F);
		m60ironsight.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, -2.6F, -1.0F, -1.0F, 1, 2, 2, -0.2F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-1.5F, -1.0F, -0.5F);
		m60ironsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.7854F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.2F, -1.0F, -0.5F, 2, 1, 2, -0.4F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.2F, -0.8F, -0.5F, 2, 1, 2, -0.4F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		m60ironsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}