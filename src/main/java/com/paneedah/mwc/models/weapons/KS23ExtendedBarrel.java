package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KS23ExtendedBarrel extends ModelWithAttachments {
	private final ModelRenderer extendedbarrel;
	private final ModelRenderer gun149_r1;
	private final ModelRenderer gun2;
	private final ModelRenderer gun3;
	private final ModelRenderer gun4;
	private final ModelRenderer gun5;
	private final ModelRenderer gun6;
	private final ModelRenderer gun7;
	private final ModelRenderer gun15;
	private final ModelRenderer gun17;
	private final ModelRenderer gun20;
	private final ModelRenderer gun23;
	private final ModelRenderer gun24;
	private final ModelRenderer gun25;
	private final ModelRenderer gun26;
	private final ModelRenderer gun27;
	private final ModelRenderer gun28;
	private final ModelRenderer gun29;
	private final ModelRenderer gun30;
	private final ModelRenderer gun31;

	public KS23ExtendedBarrel() {
		textureWidth = 300;
		textureHeight = 300;

		extendedbarrel = new ModelRenderer(this);
		extendedbarrel.setRotationPoint(0.0F, 24.0F, 0.0F);
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 26, 0, -0.4F, -29.6F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 87, 42, -0.4F, -29.6F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 0, 25, -2.6F, -29.6F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 6, 90, -2.6F, -29.6F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 14, 18, -1.5F, -28.5F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 61, 76, -1.5F, -28.5F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 0, 18, -1.5F, -30.7F, -67.001F, 1, 1, 4, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 62, 89, -1.5F, -30.7F, -45.001F, 1, 1, 2, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 0, 0, -2.5F, -29.6F, -65.0F, 3, 1, 51, 0.0F, false));
		extendedbarrel.cubeList.add(new ModelBox(extendedbarrel, 105, 102, -1.5F, -30.6F, -63.0F, 1, 3, 49, 0.0F, false));

		gun149_r1 = new ModelRenderer(this);
		gun149_r1.setRotationPoint(-1.5F, -31.2F, -64.0F);
		extendedbarrel.addChild(gun149_r1);
		setRotationAngle(gun149_r1, -0.1487F, 0.0F, 0.0F);
		gun149_r1.cubeList.add(new ModelBox(gun149_r1, 26, 41, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-1.5F, -31.2F, -49.0F);
		extendedbarrel.addChild(gun2);
		setRotationAngle(gun2, -1.3756F, 0.0F, 0.0F);
		gun2.cubeList.add(new ModelBox(gun2, 32, 0, 0.0F, 15.6962F, -3.1032F, 1, 2, 1, 0.0F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-1.5F, -31.2F, -49.0F);
		extendedbarrel.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 6, 7, 0.0F, 0.0F, -16.0F, 1, 1, 1, 0.0F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-1.5F, -27.5F, -51.0F);
		extendedbarrel.addChild(gun4);
		setRotationAngle(gun4, 0.0F, 0.0F, -2.3562F);
		gun4.cubeList.add(new ModelBox(gun4, 0, 38, 0.0F, -0.001F, -15.999F, 1, 1, 4, 0.0F, false));
		gun4.cubeList.add(new ModelBox(gun4, 0, 79, 0.0F, -0.001F, 6.001F, 1, 1, 2, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.6F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun5);
		setRotationAngle(gun5, 0.0F, 0.0F, -0.7854F);
		gun5.cubeList.add(new ModelBox(gun5, 26, 36, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));
		gun5.cubeList.add(new ModelBox(gun5, 10, 79, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-2.6F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun6);
		setRotationAngle(gun6, 0.0F, 0.0F, -0.7854F);
		gun6.cubeList.add(new ModelBox(gun6, 26, 30, 0.0F, -0.001F, -16.0F, 1, 1, 4, 0.0F, false));
		gun6.cubeList.add(new ModelBox(gun6, 90, 32, 0.0F, -0.001F, 6.0F, 1, 1, 2, 0.0F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-1.5F, -30.7F, -51.0F);
		extendedbarrel.addChild(gun7);
		setRotationAngle(gun7, 0.0F, 0.0F, 0.7854F);
		gun7.cubeList.add(new ModelBox(gun7, 0, 30, 0.0F, 0.0F, -16.002F, 1, 1, 4, 0.0F, false));
		gun7.cubeList.add(new ModelBox(gun7, 0, 90, 0.0F, 0.0F, 5.998F, 1, 1, 2, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-0.5F, -27.5F, -51.0F);
		extendedbarrel.addChild(gun15);
		setRotationAngle(gun15, 0.0F, 0.0F, -2.3562F);
		gun15.cubeList.add(new ModelBox(gun15, 26, 25, 0.001F, 0.0F, -15.999F, 1, 1, 4, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 69, 26, 0.001F, 0.0F, 6.001F, 1, 1, 2, 0.0F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(0.6F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun17);
		setRotationAngle(gun17, 0.0F, 0.0F, 2.3562F);
		gun17.cubeList.add(new ModelBox(gun17, 26, 18, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 69, 35, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(0.6F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun20);
		setRotationAngle(gun20, 0.0F, 0.0F, 2.3562F);
		gun20.cubeList.add(new ModelBox(gun20, 26, 13, 0.0F, 0.0F, -16.0F, 1, 1, 4, 0.0F, false));
		gun20.cubeList.add(new ModelBox(gun20, 11, 83, 0.0F, 0.0F, 6.0F, 1, 1, 2, 0.0F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-0.5F, -30.7F, -51.0F);
		extendedbarrel.addChild(gun23);
		setRotationAngle(gun23, 0.0F, 0.0F, 0.7854F);
		gun23.cubeList.add(new ModelBox(gun23, 26, 5, 0.0F, -0.001F, -16.003F, 1, 1, 4, 0.0F, false));
		gun23.cubeList.add(new ModelBox(gun23, 42, 89, 0.0F, -0.001F, 5.997F, 1, 1, 2, 0.0F, false));

		gun24 = new ModelRenderer(this);
		gun24.setRotationPoint(-1.5F, -27.6F, -51.0F);
		extendedbarrel.addChild(gun24);
		setRotationAngle(gun24, 0.0F, 0.0F, -2.3562F);
		gun24.cubeList.add(new ModelBox(gun24, 52, 104, 0.0F, -0.001F, -13.0F, 1, 1, 50, 0.0F, false));

		gun25 = new ModelRenderer(this);
		gun25.setRotationPoint(-2.5F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun25);
		setRotationAngle(gun25, 0.0F, 0.0F, -0.7854F);
		gun25.cubeList.add(new ModelBox(gun25, 104, 51, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun26 = new ModelRenderer(this);
		gun26.setRotationPoint(-2.5F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun26);
		setRotationAngle(gun26, 0.0F, 0.0F, -0.7854F);
		gun26.cubeList.add(new ModelBox(gun26, 0, 154, 0.0F, -0.001F, -12.0F, 1, 1, 49, 0.0F, false));

		gun27 = new ModelRenderer(this);
		gun27.setRotationPoint(-1.5F, -30.6F, -51.0F);
		extendedbarrel.addChild(gun27);
		setRotationAngle(gun27, 0.0F, 0.0F, 0.7854F);
		gun27.cubeList.add(new ModelBox(gun27, 109, 0, 0.0F, 0.0F, -12.0F, 1, 1, 49, 0.0F, false));

		gun28 = new ModelRenderer(this);
		gun28.setRotationPoint(-0.5F, -27.6F, -51.0F);
		extendedbarrel.addChild(gun28);
		setRotationAngle(gun28, 0.0F, 0.0F, -2.3562F);
		gun28.cubeList.add(new ModelBox(gun28, 0, 103, 0.001F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(0.5F, -28.6F, -51.0F);
		extendedbarrel.addChild(gun29);
		setRotationAngle(gun29, 0.0F, 0.0F, 2.3562F);
		gun29.cubeList.add(new ModelBox(gun29, 57, 0, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(0.5F, -29.6F, -51.0F);
		extendedbarrel.addChild(gun30);
		setRotationAngle(gun30, 0.0F, 0.0F, 2.3562F);
		gun30.cubeList.add(new ModelBox(gun30, 52, 53, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-0.5F, -30.6F, -51.0F);
		extendedbarrel.addChild(gun31);
		setRotationAngle(gun31, 0.0F, 0.0F, 0.8029F);
		gun31.cubeList.add(new ModelBox(gun31, 0, 52, 0.0F, 0.0F, -13.0F, 1, 1, 50, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		extendedbarrel.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
