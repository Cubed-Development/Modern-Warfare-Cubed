package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class TritiumRearSights extends ModelBase {
	private final ModelRenderer sight23;
	private final ModelRenderer sight26;
	private final ModelRenderer sight32;
	private final ModelRenderer sight38;
	private final ModelRenderer sight44;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private final ModelRenderer bone5;
	private final ModelRenderer bone4;
	private final ModelRenderer bone6;
	private final ModelRenderer bone7;

	public TritiumRearSights() {
		textureWidth = 128;
		textureHeight = 64;

		sight23 = new ModelRenderer(this);
		sight23.setRotationPoint(3.0F, -4.0F, -1.0F);
		setRotationAngle(sight23, 0.0F, 0.0F, 2.3562F);
		sight23.cubeList.add(new ModelBox(sight23, 0, 20, -0.7071F, 0.0F, 0.0F, 1, 1, 2, 0.0F, true));
		sight23.cubeList.add(new ModelBox(sight23, 0, 20, -0.7071F, 0.4F, 0.0F, 1, 1, 2, 0.0F, true));

		sight26 = new ModelRenderer(this);
		sight26.setRotationPoint(0.0F, -4.0F, -1.0F);
		setRotationAngle(sight26, 0.0F, 0.0F, -0.7854F);
		sight26.cubeList.add(new ModelBox(sight26, 0, 20, 0.0F, -0.7071F, 0.0F, 1, 1, 2, 0.0F, true));
		sight26.cubeList.add(new ModelBox(sight26, 0, 20, 0.4F, -0.7071F, 0.0F, 1, 1, 2, 0.0F, true));

		sight32 = new ModelRenderer(this);
		sight32.setRotationPoint(-3.7F, 5.0F, 1.7F);
		setRotationAngle(sight32, -0.7717F, 0.0F, 0.0F);
		sight32.cubeList.add(new ModelBox(sight32, 0, 0, 0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, true));

		sight38 = new ModelRenderer(this);
		sight38.setRotationPoint(5.2F, 6.5F, -1.5F);
		setRotationAngle(sight38, 0.7854F, 0.0F, 0.0F);
		sight38.cubeList.add(new ModelBox(sight38, 0, 0, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, true));

		sight44 = new ModelRenderer(this);
		sight44.setRotationPoint(-3.7F, 5.0F, -4.3F);
		setRotationAngle(sight44, -1.1525F, 0.0F, 0.0F);
		sight44.cubeList.add(new ModelBox(sight44, 0, 0, 0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.7F, -17.5F, -7.3F, 8, 3, 3, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.2F, -18.3F, -6.3F, 2, 3, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.8F, -18.5F, -1.0F, 6, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 3.7F, -19.0F, -2.3F, 2, 3, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.7F, -17.0F, -4.3F, 3, 3, 8, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.7F, -19.0F, -2.3F, 3, 2, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -23.2F, -2.0F, 4, 7, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -26.7F, -2.0F, 1, 3, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.5F, -26.7F, -2.0F, 1, 3, 4, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -28.7F, 1.0F, 1, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.5F, -28.7F, 1.0F, 1, 2, 1, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.511F, -29.4F, -0.7F, 1, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 4.489F, -29.4F, -0.7F, 1, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.5F, -26.5F, -1.0F, 2, 3, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.7F, -19.0F, -4.3F, 8, 2, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 0.5F, -29.5F, -1.0F, 2, 1, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, 2.5F, -28.5F, -1.0F, 1, 5, 2, 0.0F, true));
		bone.cubeList.add(new ModelBox(bone, 0, 20, -0.5F, -28.5F, -1.0F, 1, 5, 2, 0.0F, true));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.5F, -27.2F, -2.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 1.1345F, 0.0F, 0.0F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.01F, 0.2113F, -0.4532F, 1, 2, 3, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 6.99F, 0.2113F, -0.4532F, 1, 2, 3, 0.0F, false));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-1.5F, -29.9F, 1.3F);
		bone.addChild(bone3);
		setRotationAngle(bone3, -2.3562F, 0.0F, 0.0F);
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1.0F, -1.3536F, 0.3536F, 1, 1, 1, 0.0F, false));
		bone3.cubeList.add(new ModelBox(bone3, 0, 0, 6.0F, -1.3536F, 0.3536F, 1, 1, 1, 0.0F, false));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(5.5F, -23.7F, -2.0F);
		bone.addChild(bone5);
		setRotationAngle(bone5, 0.0F, 0.0F, 0.8203F);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-2.5F, -23.7F, -2.0F);
		bone.addChild(bone4);
		setRotationAngle(bone4, 0.0F, 0.0F, -0.8203F);
		bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, false));

		bone6 = new ModelRenderer(this);
		bone6.setRotationPoint(0.5F, -24.9F, 0.7F);
		bone.addChild(bone6);
		setRotationAngle(bone6, 0.7854F, 0.0F, 0.0F);
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -0.99F, -1.0F, -1.0F, 4, 2, 2, 0.0F, false));
		bone6.cubeList.add(new ModelBox(bone6, 0, 0, -1.99F, -1.0F, -1.0F, 6, 1, 1, 0.0F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(-2.6F, -0.8F, -0.4F);
		setRotationAngle(bone7, -1.0996F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, 0.0F, -3.0F, -2.0F, 1, 3, 3, 0.0F, false));
		bone7.cubeList.add(new ModelBox(bone7, 0, 0, -1.3F, 0.8657F, 6.468F, 1, 3, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight23.render(f5);
		sight26.render(f5);
		sight32.render(f5);
		sight38.render(f5);
		sight44.render(f5);
		bone.render(f5);
		bone7.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}