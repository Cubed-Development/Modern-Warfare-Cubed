package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AX50Mag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer mag20_r1;
	private final ModelRenderer mag14_r1;
	private final ModelRenderer mag13_r1;
	private final ModelRenderer mag12_r1;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag6_r1;

	public AX50Mag() {
		textureWidth = 340;
		textureHeight = 340;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, -35.0801F, -11.1609F);
		magazine.cubeList.add(new ModelBox(magazine, 0, 110, -3.3F, 27.0801F, -11.3391F, 3, 13, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 68, 56, -0.7F, 27.0801F, -11.3391F, 1, 13, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 115, 0, -0.7F, 27.0801F, -29.0391F, 1, 10, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 89, 25, -3.3F, 27.0801F, -29.0391F, 3, 10, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 12, 110, -0.7F, 27.0801F, -16.3391F, 1, 12, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 93, 56, -3.3F, 27.0801F, -16.3391F, 1, 12, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 105, 25, -0.7F, 27.0801F, -19.3391F, 1, 11, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 105, 8, -3.3F, 27.0801F, -19.3391F, 1, 11, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 45, 82, -1.3F, 27.0801F, -23.3391F, 1, 11, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 76, 25, -2.7F, 27.0801F, -23.3391F, 1, 11, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 79, 56, -0.9F, 27.0801F, -17.3391F, 1, 12, 6, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 62, 25, -3.1F, 27.0801F, -17.3391F, 1, 12, 6, 0.0F, false));

		mag20_r1 = new ModelRenderer(this);
		mag20_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		magazine.addChild(mag20_r1);
		setRotationAngle(mag20_r1, 1.4128F, 0.0F, 0.0F);
		mag20_r1.cubeList.add(new ModelBox(mag20_r1, 22, 33, -3.31F, -12.0F, -40.2F, 1, 9, 1, 0.0F, false));
		mag20_r1.cubeList.add(new ModelBox(mag20_r1, 34, 27, -0.71F, -12.0F, -40.2F, 1, 9, 1, 0.0F, false));

		mag14_r1 = new ModelRenderer(this);
		mag14_r1.setRotationPoint(29.9467F, 59.0801F, -39.7356F);
		magazine.addChild(mag14_r1);
		setRotationAngle(mag14_r1, -3.1416F, 1.2455F, 3.1416F);
		mag14_r1.cubeList.add(new ModelBox(mag14_r1, 42, 110, -5.3F, -32.0F, -36.2F, 2, 10, 1, 0.0F, false));

		mag13_r1 = new ModelRenderer(this);
		mag13_r1.setRotationPoint(-33.9055F, 59.0801F, -36.893F);
		magazine.addChild(mag13_r1);
		setRotationAngle(mag13_r1, -3.1416F, -1.2455F, 3.1416F);
		mag13_r1.cubeList.add(new ModelBox(mag13_r1, 28, 27, 0.3F, -32.0F, -36.2F, 2, 10, 1, 0.0F, false));

		mag12_r1 = new ModelRenderer(this);
		mag12_r1.setRotationPoint(-0.7197F, 59.0801F, -49.9084F);
		magazine.addChild(mag12_r1);
		setRotationAngle(mag12_r1, -3.1416F, 0.192F, 3.1416F);
		mag12_r1.cubeList.add(new ModelBox(mag12_r1, 115, 23, -4.3F, -32.0F, -30.5F, 1, 11, 3, 0.0F, false));

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(-5.2252F, 59.0801F, -49.3359F);
		magazine.addChild(mag11_r1);
		setRotationAngle(mag11_r1, -3.1416F, -0.192F, 3.1416F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 123, 23, 0.3F, -32.0F, -30.5F, 1, 11, 3, 0.0F, false));

		mag6_r1 = new ModelRenderer(this);
		mag6_r1.setRotationPoint(0.0F, 0.9146F, -0.8948F);
		magazine.addChild(mag6_r1);
		setRotationAngle(mag6_r1, 1.4102F, 0.0F, 0.0F);
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 20, 0, -0.6F, -22.0F, -40.2F, 1, 21, 1, 0.0F, false));
		mag6_r1.cubeList.add(new ModelBox(mag6_r1, 44, 56, -3.4F, -22.0F, -40.2F, 3, 21, 1, 0.0F, false));
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