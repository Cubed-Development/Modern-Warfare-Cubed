package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PGMHecateIIMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer bone6_r1;
	private final ModelRenderer bone131_r1;
	private final ModelRenderer bone10_r1;
	private final ModelRenderer bone130_r1;
	private final ModelRenderer bone8_r1;
	private final ModelRenderer bone9_r1;
	private final ModelRenderer bone133_r1;
	private final ModelRenderer bone132_r1;
	private final ModelRenderer bone7_r1;
	private final ModelRenderer magazine_r1;
	private final ModelRenderer magazine_r2;

	public PGMHecateIIMag() {
		textureWidth = 360;
		textureHeight = 360;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.75F, 30.0F, -6.0F);
		magazine.cubeList.add(new ModelBox(magazine, 42, 0, -1.75F, -41.5F, -12.0F, 4, 9, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -1.75F, -41.5F, -20.0F, 4, 7, 8, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 41, 25, -1.25F, -41.5F, -22.75F, 3, 5, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 56, 111, -1.75F, -41.5F, -26.75F, 4, 6, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 42, 10, -1.748F, -36.3F, -23.75F, 4, 1, 1, 0.0F, false));

		bone6_r1 = new ModelRenderer(this);
		bone6_r1.setRotationPoint(1.75F, -1.7364F, 1.1555F);
		magazine.addChild(bone6_r1);
		setRotationAngle(bone6_r1, -0.1745F, 0.0F, 0.0F);
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 28, 14, -3.499F, -30.0126F, -26.2966F, 4, 2, 8, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 56, 20, -3.498F, -29.0134F, -26.5708F, 4, 1, 1, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 96, 56, -3.001F, -31.0126F, -29.2966F, 3, 3, 3, 0.0F, false));
		bone6_r1.cubeList.add(new ModelBox(bone6_r1, 56, 75, -3.499F, -29.0126F, -33.2966F, 4, 1, 4, 0.0F, false));

		bone131_r1 = new ModelRenderer(this);
		bone131_r1.setRotationPoint(-7.5538F, -2.6351F, 1.6395F);
		magazine.addChild(bone131_r1);
		setRotationAngle(bone131_r1, -0.1396F, -0.4189F, 0.0F);
		bone131_r1.cubeList.add(new ModelBox(bone131_r1, 74, 56, -3.5F, -28.9708F, -28.4174F, 1, 1, 2, 0.0F, false));

		bone10_r1 = new ModelRenderer(this);
		bone10_r1.setRotationPoint(-9.1283F, -6.0F, 5.1756F);
		magazine.addChild(bone10_r1);
		setRotationAngle(bone10_r1, 0.0F, -0.4189F, 0.0F);
		bone10_r1.cubeList.add(new ModelBox(bone10_r1, 56, 56, -3.5F, -35.48F, -28.0F, 1, 7, 2, 0.0F, false));

		bone130_r1 = new ModelRenderer(this);
		bone130_r1.setRotationPoint(10.7944F, -2.6351F, 0.4193F);
		magazine.addChild(bone130_r1);
		setRotationAngle(bone130_r1, -0.1396F, 0.4189F, 0.0F);
		bone130_r1.cubeList.add(new ModelBox(bone130_r1, 74, 65, -0.499F, -28.9708F, -28.4174F, 1, 1, 2, 0.0F, false));

		bone8_r1 = new ModelRenderer(this);
		bone8_r1.setRotationPoint(12.3689F, -6.0F, 3.9553F);
		magazine.addChild(bone8_r1);
		setRotationAngle(bone8_r1, 0.0F, 0.4189F, 0.0F);
		bone8_r1.cubeList.add(new ModelBox(bone8_r1, 56, 10, -0.5F, -35.48F, -28.0F, 1, 7, 2, 0.0F, false));

		bone9_r1 = new ModelRenderer(this);
		bone9_r1.setRotationPoint(13.1416F, -6.0F, 2.0905F);
		magazine.addChild(bone9_r1);
		setRotationAngle(bone9_r1, 0.0F, 0.4189F, 0.0F);
		bone9_r1.cubeList.add(new ModelBox(bone9_r1, 56, 0, -3.5F, -35.48F, -28.75F, 1, 7, 2, 0.0F, false));

		bone133_r1 = new ModelRenderer(this);
		bone133_r1.setRotationPoint(11.3112F, -1.8283F, -2.0205F);
		magazine.addChild(bone133_r1);
		setRotationAngle(bone133_r1, -0.1571F, 0.4189F, 0.0F);
		bone133_r1.cubeList.add(new ModelBox(bone133_r1, 10, 73, -3.499F, -29.4631F, -29.2194F, 1, 1, 2, 0.0F, false));

		bone132_r1 = new ModelRenderer(this);
		bone132_r1.setRotationPoint(-8.0706F, -1.8283F, -0.8002F);
		magazine.addChild(bone132_r1);
		setRotationAngle(bone132_r1, -0.1571F, -0.4189F, 0.0F);
		bone132_r1.cubeList.add(new ModelBox(bone132_r1, 18, 73, -0.499F, -29.4631F, -29.2194F, 1, 1, 2, 0.0F, false));

		bone7_r1 = new ModelRenderer(this);
		bone7_r1.setRotationPoint(-9.901F, -6.0F, 3.3108F);
		magazine.addChild(bone7_r1);
		setRotationAngle(bone7_r1, 0.0F, -0.4189F, 0.0F);
		bone7_r1.cubeList.add(new ModelBox(bone7_r1, 56, 26, -0.5F, -35.48F, -28.75F, 1, 7, 2, 0.0F, false));

		magazine_r1 = new ModelRenderer(this);
		magazine_r1.setRotationPoint(1.75F, -6.0F, 6.0F);
		magazine.addChild(magazine_r1);
		setRotationAngle(magazine_r1, 0.0F, 0.0F, -0.7854F);
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 88, 104, 24.4213F, -25.7213F, -32.7F, 1, 1, 4, 0.0F, false));
		magazine_r1.cubeList.add(new ModelBox(magazine_r1, 90, 126, 24.4213F, -25.7213F, -26.0F, 1, 1, 9, 0.0F, false));

		magazine_r2 = new ModelRenderer(this);
		magazine_r2.setRotationPoint(1.75F, -6.0F, 6.0F);
		magazine.addChild(magazine_r2);
		setRotationAngle(magazine_r2, 0.0F, 0.0F, 0.7854F);
		magazine_r2.cubeList.add(new ModelBox(magazine_r2, 0, 118, -27.5213F, -23.7213F, -26.0F, 1, 1, 9, 0.0F, false));
		magazine_r2.cubeList.add(new ModelBox(magazine_r2, 82, 103, -27.5213F, -23.7213F, -32.7F, 1, 1, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
