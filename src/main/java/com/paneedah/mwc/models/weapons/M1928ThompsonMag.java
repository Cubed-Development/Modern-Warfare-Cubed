package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M1928ThompsonMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer mag23_r1;
	private final ModelRenderer mag22_r1;
	private final ModelRenderer mag21_r1;
	private final ModelRenderer mag20_r1;
	private final ModelRenderer mag19_r1;
	private final ModelRenderer mag18_r1;
	private final ModelRenderer mag17_r1;
	private final ModelRenderer mag16_r1;
	private final ModelRenderer mag15_r1;
	private final ModelRenderer mag14_r1;
	private final ModelRenderer mag13_r1;
	private final ModelRenderer mag12_r1;
	private final ModelRenderer mag11_r1;
	private final ModelRenderer mag10_r1;
	private final ModelRenderer mag9_r1;

	public M1928ThompsonMag() {
		textureWidth = 512;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 0.0F, -31.5F, -12.5F, 1, 20, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -3.0F, -31.5F, -12.5F, 1, 20, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -2.0F, -30.5F, -12.5F, 2, 19, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -11.0F, -23.5F, -12.5F, 20, 4, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -8.0F, -19.5F, -12.5F, 5, 5, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -8.0F, -28.5F, -12.5F, 5, 5, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 1.0F, -28.5F, -12.5F, 5, 5, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, 1.0F, -19.5F, -12.5F, 5, 5, 5, 0.0F, true));
		magazine.cubeList.add(new ModelBox(magazine, 0, 0, -3.5F, -23.5F, -8.3F, 5, 4, 1, 0.0F, true));

		mag23_r1 = new ModelRenderer(this);
		mag23_r1.setRotationPoint(-25.9031F, -17.4077F, 0.0F);
		magazine.addChild(mag23_r1);
		setRotationAngle(mag23_r1, 0.0F, 0.0F, 1.3431F);
		mag23_r1.cubeList.add(new ModelBox(mag23_r1, 0, 0, -2.0F, -25.0F, -14.0F, 3, 6, 2, 0.0F, true));

		mag22_r1 = new ModelRenderer(this);
		mag22_r1.setRotationPoint(-19.1493F, -20.3056F, 0.0F);
		magazine.addChild(mag22_r1);
		setRotationAngle(mag22_r1, 0.0F, 0.0F, 1.3431F);
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 0, 0, 3.2F, -22.2F, -14.0F, 3, 6, 2, 0.0F, true));

		mag21_r1 = new ModelRenderer(this);
		mag21_r1.setRotationPoint(-18.2635F, -5.9081F, 0.0F);
		magazine.addChild(mag21_r1);
		setRotationAngle(mag21_r1, 0.0F, 0.0F, 0.7854F);
		mag21_r1.cubeList.add(new ModelBox(mag21_r1, 0, 0, -2.0F, -25.0F, -14.0F, 5, 5, 2, 0.0F, true));

		mag20_r1 = new ModelRenderer(this);
		mag20_r1.setRotationPoint(-10.4463F, -9.3804F, 0.0F);
		magazine.addChild(mag20_r1);
		setRotationAngle(mag20_r1, 0.0F, 0.0F, 0.7854F);
		mag20_r1.cubeList.add(new ModelBox(mag20_r1, 0, 0, 6.1F, -17.3F, -12.5F, 2, 4, 5, 0.0F, true));

		mag19_r1 = new ModelRenderer(this);
		mag19_r1.setRotationPoint(-14.6054F, 0.6605F, 0.0F);
		magazine.addChild(mag19_r1);
		setRotationAngle(mag19_r1, 0.0F, 0.0F, 0.7854F);
		mag19_r1.cubeList.add(new ModelBox(mag19_r1, 0, 0, -8.1F, -17.3F, -12.5F, 4, 2, 5, 0.0F, true));

		mag18_r1 = new ModelRenderer(this);
		mag18_r1.setRotationPoint(-19.8366F, -12.1102F, 0.0F);
		magazine.addChild(mag18_r1);
		setRotationAngle(mag18_r1, 0.0F, 0.0F, 0.7854F);
		mag18_r1.cubeList.add(new ModelBox(mag18_r1, 0, 0, 4.7F, -30.0F, -12.5F, 4, 2, 5, 0.0F, true));

		mag17_r1 = new ModelRenderer(this);
		mag17_r1.setRotationPoint(-23.1756F, -4.0492F, 0.0F);
		magazine.addChild(mag17_r1);
		setRotationAngle(mag17_r1, 0.0F, 0.0F, 0.7854F);
		mag17_r1.cubeList.add(new ModelBox(mag17_r1, 0, 0, -6.7F, -30.0F, -12.5F, 2, 4, 5, 0.0F, true));

		mag16_r1 = new ModelRenderer(this);
		mag16_r1.setRotationPoint(-6.7772F, -4.9285F, 0.0F);
		magazine.addChild(mag16_r1);
		setRotationAngle(mag16_r1, 0.0F, 0.0F, 0.3927F);
		mag16_r1.cubeList.add(new ModelBox(mag16_r1, 0, 0, 6.0F, -19.5F, -12.5F, 3, 4, 5, 0.0F, true));

		mag15_r1 = new ModelRenderer(this);
		mag15_r1.setRotationPoint(-2.4514F, -22.5153F, 0.0F);
		magazine.addChild(mag15_r1);
		setRotationAngle(mag15_r1, 0.0F, 0.0F, 2.7512F);
		mag15_r1.cubeList.add(new ModelBox(mag15_r1, 0, 0, -3.0F, -11.5F, -12.5F, 4, 3, 5, 0.0F, true));

		mag14_r1 = new ModelRenderer(this);
		mag14_r1.setRotationPoint(-1.3981F, -23.2764F, 0.0F);
		magazine.addChild(mag14_r1);
		setRotationAngle(mag14_r1, 0.0F, 0.0F, -2.7512F);
		mag14_r1.cubeList.add(new ModelBox(mag14_r1, 0, 0, -3.0F, -11.5F, -12.5F, 4, 3, 5, 0.0F, true));

		mag13_r1 = new ModelRenderer(this);
		mag13_r1.setRotationPoint(6.625F, -5.6939F, 0.0F);
		magazine.addChild(mag13_r1);
		setRotationAngle(mag13_r1, 0.0F, 0.0F, -0.3927F);
		mag13_r1.cubeList.add(new ModelBox(mag13_r1, 0, 0, -11.0F, -19.5F, -12.5F, 3, 4, 5, 0.0F, true));

		mag12_r1 = new ModelRenderer(this);
		mag12_r1.setRotationPoint(29.8683F, -18.856F, 0.0F);
		magazine.addChild(mag12_r1);
		setRotationAngle(mag12_r1, 0.0F, 0.0F, -1.1897F);
		mag12_r1.cubeList.add(new ModelBox(mag12_r1, 0, 0, -2.0F, -31.5F, -12.5F, 3, 4, 5, 0.0F, true));

		mag11_r1 = new ModelRenderer(this);
		mag11_r1.setRotationPoint(-16.1615F, -23.114F, 0.0F);
		magazine.addChild(mag11_r1);
		setRotationAngle(mag11_r1, 0.0F, 0.0F, 1.1897F);
		mag11_r1.cubeList.add(new ModelBox(mag11_r1, 0, 0, 5.0F, -23.5F, -12.5F, 4, 3, 5, 0.0F, true));

		mag10_r1 = new ModelRenderer(this);
		mag10_r1.setRotationPoint(-31.1245F, -16.9996F, 0.0F);
		magazine.addChild(mag10_r1);
		setRotationAngle(mag10_r1, 0.0F, 0.0F, 1.1897F);
		mag10_r1.cubeList.add(new ModelBox(mag10_r1, 0, 0, -3.0F, -31.5F, -12.5F, 3, 4, 5, 0.0F, true));

		mag9_r1 = new ModelRenderer(this);
		mag9_r1.setRotationPoint(14.9053F, -24.9707F, 0.0F);
		magazine.addChild(mag9_r1);
		setRotationAngle(mag9_r1, 0.0F, 0.0F, -1.1897F);
		mag9_r1.cubeList.add(new ModelBox(mag9_r1, 0, 0, -11.0F, -23.5F, -12.5F, 4, 3, 5, 0.0F, true));
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
