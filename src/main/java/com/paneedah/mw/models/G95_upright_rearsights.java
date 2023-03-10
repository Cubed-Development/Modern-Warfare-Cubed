package com.paneedah.mw.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class G95_upright_rearsights extends ModelBase {
	private final ModelRenderer sight8;
	private final ModelRenderer sight13;
	private final ModelRenderer sight17;
	private final ModelRenderer sight19;
	private final ModelRenderer sight31;
	private final ModelRenderer sight35;
	private final ModelRenderer sight36;
	private final ModelRenderer sight37;
	private final ModelRenderer sight38;
	private final ModelRenderer sight39;
	private final ModelRenderer sight40;
	private final ModelRenderer sight43;
	private final ModelRenderer sight44;
	private final ModelRenderer sight56;
	private final ModelRenderer sight57;
	private final ModelRenderer sight58;
	private final ModelRenderer sight59;
	private final ModelRenderer sight60;
	private final ModelRenderer bone;
	private final ModelRenderer bone2;

	public G95_upright_rearsights() {
		textureWidth = 128;
		textureHeight = 64;

		sight8 = new ModelRenderer(this);
		sight8.setRotationPoint(-4.7F, 5.0F, -4.3F);
		sight8.cubeList.add(new ModelBox(sight8, 0, 0, 0.0F, 0.0F, 0.0F, 8, 4, 2, 0.0F, true));

		sight13 = new ModelRenderer(this);
		sight13.setRotationPoint(-7.5F, 6.5F, -5.0F);
		setRotationAngle(sight13, 0.7854F, 0.0F, 0.0F);
		sight13.cubeList.add(new ModelBox(sight13, 0, 0, 0.0F, 0.0F, 0.0F, 3, 4, 4, 0.0F, true));

		sight17 = new ModelRenderer(this);
		sight17.setRotationPoint(0.0F, 5.3F, 0.8F);
		sight17.cubeList.add(new ModelBox(sight17, 0, 0, 0.0F, -8.0F, -1.5F, 3, 8, 2, 0.0F, true));

		sight19 = new ModelRenderer(this);
		sight19.setRotationPoint(-0.5F, 4.5F, -1.5F);
		sight19.cubeList.add(new ModelBox(sight19, 0, 0, 0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F, true));

		sight31 = new ModelRenderer(this);
		sight31.setRotationPoint(-4.7F, 5.0F, -2.3F);
		sight31.cubeList.add(new ModelBox(sight31, 0, 0, 0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, true));

		sight35 = new ModelRenderer(this);
		sight35.setRotationPoint(3.7F, 5.0F, -2.3F);
		sight35.cubeList.add(new ModelBox(sight35, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 11, 0.0F, true));

		sight36 = new ModelRenderer(this);
		sight36.setRotationPoint(5.7F, 5.0F, -2.3F);
		setRotationAngle(sight36, 0.0F, -2.1935F, 0.0F);
		sight36.cubeList.add(new ModelBox(sight36, 0, 0, 0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F, true));

		sight37 = new ModelRenderer(this);
		sight37.setRotationPoint(5.7F, 5.0F, -2.3F);
		setRotationAngle(sight37, 0.0F, -2.1935F, 0.0F);
		sight37.cubeList.add(new ModelBox(sight37, 0, 0, 0.5F, 0.0F, 0.0F, 1, 3, 3, 0.0F, true));

		sight38 = new ModelRenderer(this);
		sight38.setRotationPoint(5.2F, 6.0F, -1.5F);
		setRotationAngle(sight38, 0.7854F, 0.0F, 0.0F);
		sight38.cubeList.add(new ModelBox(sight38, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, true));

		sight39 = new ModelRenderer(this);
		sight39.setRotationPoint(-1.8F, 5.5F, -1.0F);
		sight39.cubeList.add(new ModelBox(sight39, 0, 0, 0.0F, 0.0F, 0.0F, 6, 2, 2, 0.0F, true));

		sight40 = new ModelRenderer(this);
		sight40.setRotationPoint(5.0F, 8.0F, -9.3F);
		sight40.cubeList.add(new ModelBox(sight40, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 17, 0.0F, true));

		sight43 = new ModelRenderer(this);
		sight43.setRotationPoint(-3.7F, 6.5F, -10.3F);
		sight43.cubeList.add(new ModelBox(sight43, 0, 0, 0.0F, 0.0F, 0.0F, 9, 3, 6, 0.0F, true));

		sight44 = new ModelRenderer(this);
		sight44.setRotationPoint(-0.5F, 5.0F, -7.3F);
		setRotationAngle(sight44, -1.1525F, 0.0F, 0.0F);
		sight44.cubeList.add(new ModelBox(sight44, 0, 0, 0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, true));

		sight56 = new ModelRenderer(this);
		sight56.setRotationPoint(-2.7F, 5.0F, -2.3F);
		sight56.cubeList.add(new ModelBox(sight56, 0, 0, 0.0F, 0.0F, 0.0F, 2, 3, 11, 0.0F, true));

		sight57 = new ModelRenderer(this);
		sight57.setRotationPoint(-0.5F, 5.0F, -7.3F);
		sight57.cubeList.add(new ModelBox(sight57, 0, 0, 0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F, true));

		sight58 = new ModelRenderer(this);
		sight58.setRotationPoint(-4.0F, 7.0F, -9.3F);
		sight58.cubeList.add(new ModelBox(sight58, 0, 0, 0.0F, 0.0F, 0.0F, 2, 4, 17, 0.0F, true));

		sight59 = new ModelRenderer(this);
		sight59.setRotationPoint(-2.9F, 7.5F, -9.35F);
		sight59.cubeList.add(new ModelBox(sight59, 0, 0, 0.0F, 0.0F, 0.0F, 9, 2, 17, 0.0F, true));

		sight60 = new ModelRenderer(this);
		sight60.setRotationPoint(6.1F, 7.5F, -9.3F);
		setRotationAngle(sight60, 0.0F, 0.0F, 0.5205F);
		sight60.cubeList.add(new ModelBox(sight60, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 17, 0.0F, true));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, -3.75F, -0.75F);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -1.0F, 0.05F, 1, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 2.0F, -1.0F, 0.05F, 1, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, 0.0F, -2.0F, 0.05F, 2, 1, 2, 0.0F, false));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-1.5F, 0.5F, 0.0F);
		bone.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.7854F);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0.0F, 0.7071F, 0.05F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.4142F, -0.7071F, 0.05F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.8F, -0.7071F, 0.05F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 3.2426F, 1.1213F, 0.05F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 3.2426F, 0.75F, 0.05F, 1, 1, 2, 0.0F, false));
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, 1.8284F, 2.5355F, 0.05F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		sight8.render(f5);
		sight13.render(f5);
		sight17.render(f5);
		sight19.render(f5);
		sight31.render(f5);
		sight35.render(f5);
		sight36.render(f5);
		sight37.render(f5);
		sight38.render(f5);
		sight39.render(f5);
		sight40.render(f5);
		sight43.render(f5);
		sight44.render(f5);
		sight56.render(f5);
		sight57.render(f5);
		sight58.render(f5);
		sight59.render(f5);
		sight60.render(f5);
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}