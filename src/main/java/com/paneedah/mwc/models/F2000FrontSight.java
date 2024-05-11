package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000FrontSight extends ModelWithAttachments {
	private final ModelRenderer ironsight2;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r5;

	public F2000FrontSight() {
		textureWidth = 290;
		textureHeight = 290;

		ironsight2 = new ModelRenderer(this);
		ironsight2.setRotationPoint(0.0F, 17.0F, -7.6F);
		

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, 0.0F);
		ironsight2.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.5F, -32.8F, -22.6F, 3, 1, 2, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 1, 1, -0.5F, -33.2F, -22.4F, 1, 1, 1, -0.1F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 1, 1, -0.5F, -34.4F, -22.4F, 1, 2, 1, -0.4F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, -1, -1, -1.925F, -33.75F, -23.3F, 1, 2, 3, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.925F, -34.9F, -22.3F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.925F, -34.9F, -22.3F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.925F, -35.2F, -22.4F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.925F, -35.2F, -22.4F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.925F, -34.9F, -22.6F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.925F, -34.9F, -22.6F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, -1, -1, 0.925F, -33.75F, -23.3F, 1, 2, 3, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.775F, -35.2F, -22.4F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.775F, -34.9F, -22.6F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, 0.775F, -34.9F, -22.3F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, -1, -1, 0.775F, -33.75F, -23.3F, 1, 2, 3, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.775F, -35.2F, -22.4F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.775F, -34.9F, -22.6F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.775F, -34.9F, -22.3F, 1, 2, 2, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, -1, -1, -1.775F, -33.75F, -23.3F, 1, 2, 3, -0.42F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 0, 0, -1.5F, -32.8F, -23.0F, 3, 1, 2, 0.0F, true));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, -31.8F, -21.8F);
		frontsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.7854F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -1.0F, -1.2F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 0, 0.0F, -1.0F, -0.8F, 1, 1, 2, 0.0F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(1.5F, -31.8F, -21.8F);
		frontsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -1.0F, -1.2F, 1, 1, 2, 0.0F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 0, -1.0F, -1.0F, -0.8F, 1, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -34.775F, -20.825F);
		frontsight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.425F, -0.275F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -2.425F, -0.275F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -2.275F, -0.425F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -2.275F, -0.275F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.425F, -0.425F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.275F, -0.275F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, 0.275F, -0.425F, -0.575F, 1, 1, 1, -0.42F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 1, 1, -2.425F, -0.425F, -0.575F, 1, 1, 1, -0.42F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.6F, -34.4692F, -22.1634F);
		frontsight.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5585F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.325F, -0.2312F, -0.4306F, 1, 2, 2, -0.42F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.525F, -0.2312F, -0.4306F, 1, 2, 2, -0.42F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, -1.325F, -0.7812F, -0.4306F, 1, 2, 2, -0.42F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 0, 1.525F, -0.7812F, -0.4306F, 1, 2, 2, -0.42F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.45F, -34.4692F, -22.1634F);
		frontsight.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.5585F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.325F, -0.2312F, -0.4306F, 1, 2, 2, -0.42F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 1.225F, -0.2312F, -0.4306F, 1, 2, 2, -0.42F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.325F, -0.7812F, -0.4306F, 1, 2, 2, -0.42F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, 1.225F, -0.7812F, -0.4306F, 1, 2, 2, -0.42F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		ironsight2.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}