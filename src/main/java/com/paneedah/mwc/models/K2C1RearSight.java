package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class K2C1RearSight extends ModelBase {
	private final ModelRenderer sight17;
	private final ModelRenderer bone5;
	private final ModelRenderer bone3;
	private final ModelRenderer bone4;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone6;

	public K2C1RearSight() {
		textureWidth = 128;
		textureHeight = 64;

		sight17 = new ModelRenderer(this);
		sight17.setRotationPoint(0.0F, 5.3F, 0.8F);
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -0.5F, -8.05F, -1.5F, 4, 5, 2, 0.0F, true));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, 2.5F, -10.05F, -1.5F, 1, 2, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -0.5F, -10.05F, -1.5F, 1, 2, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, 0.5F, -11.05F, -1.5F, 2, 1, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -4.0F, -3.4F, -24.0F, 11, 8, 25, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -1.0F, -7.15F, -23.0F, 5, 2, 8, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -0.75F, -6.901F, -15.0F, 1, 1, 9, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, 2.75F, -6.901F, -15.0F, 1, 1, 9, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -1.0F, -6.9F, -6.5F, 5, 2, 5, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, 5.0F, -7.4F, -24.0F, 2, 4, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -4.0F, -7.4F, -24.0F, 2, 4, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -5.0F, 1.1F, -24.01F, 13, 2, 26, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, 5.0F, -11.0F, -5.0F, 2, 8, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -4.0F, -11.0F, -5.0F, 2, 8, 2, 0.0F, false));
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, -4.0F, -1.4F, 1.0F, 11, 6, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(8.0F, 1.1F, -20.01F);
		sight17.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.7854F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -2.0F, 0.0F, -4.01F, 2, 1, 26, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -9.1924F, 7.1924F, -4.01F, 1, 2, 26, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -7.7782F, 8.6066F, -4.01F, 2, 2, 26, 0.0F, false));
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -0.5858F, 1.4142F, -4.01F, 2, 2, 26, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(7.0F, -11.0F, -3.0F);
		sight17.addChild(bone3);
		setRotationAngle(bone3, -0.8552F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -2.001F, 0.0F, 0.0F, 2, 4, 5, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -11.001F, 0.0F, 0.0F, 2, 4, 5, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(7.0F, -7.2F, 0.3F);
		sight17.addChild(bone4);
		setRotationAngle(bone4, -1.309F, 0.0F, 0.0F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -2.001F, 0.0F, 0.0F, 2, 5, 6, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -11.001F, 0.0F, 0.0F, 2, 5, 6, 0.0F, false));
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, -9.001F, 0.0F, 4.0F, 7, 1, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(7.0F, -11.0F, -5.0F);
		sight17.addChild(bone);
		setRotationAngle(bone, -1.4137F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.99F, 0.0F, 0.0F, 2, 19, 8, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -10.99F, 0.0F, 0.0F, 2, 19, 8, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.0F, -8.55F, -1.55F);
		sight17.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.7854F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, 0.7071F, 0.049F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.4142F, -0.7071F, 0.049F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.8F, -0.7071F, 0.051F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 3.2426F, 1.1213F, 0.049F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 3.2426F, 0.75F, 0.051F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.8284F, 2.5355F, 0.049F, 1, 1, 2, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.0F, -4.5F, -6.5F);
		sight17.addChild(bone6);
		setRotationAngle(bone6, -0.7854F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -2.0F, -3.0F, 0.0F, 7, 2, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -8.0F, -4.0F, -1.0F, 4, 4, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, 7.0F, -6.0F, -3.0F, 2, 8, 8, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, 6.5F, -4.0F, -1.0F, 4, 4, 4, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, 5.5F, 3.0711F, -9.4853F, 2, 4, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight17.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
