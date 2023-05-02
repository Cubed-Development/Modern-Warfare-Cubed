package com.paneedah.mwc.models;

import com.paneedah.weaponlib.render.qrender.QRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.9.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class SOCOM_Mag extends ModelBase {
	private final QRenderer mag;
	private final ModelRenderer gun41;
	private final ModelRenderer gun40;
	private final ModelRenderer gun39;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun36;
	private final ModelRenderer gun35;
	private final ModelRenderer gun34;
	private final ModelRenderer gun33;
	private final ModelRenderer gun30;
	private final ModelRenderer gun21;
	private final ModelRenderer gun20;
	private final ModelRenderer gun17;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun16_r1;
	private final ModelRenderer gun12;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun7;
	private final ModelRenderer gun1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun2_r1;

	public SOCOM_Mag() {
		textureWidth = 50;
		textureHeight = 50;

		mag = new QRenderer(this);
		mag.setRotationPoint(0.0F, 24.0F, 0.0F);
		mag.cubeList.add(new ModelBox(mag, 17, 24, 3.2F, -33.301F, -0.7F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 21, 6, 3.401F, -32.901F, -0.7F, 1, 1, 1, -0.2F, false));
		mag.cubeList.add(new ModelBox(mag, 4, 11, 3.101F, -34.0F, -1.0F, 1, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 6, 0, 3.1F, -34.001F, -0.5F, 1, 1, 1, 0.0F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(2.8F, -36.0F, -4.5F);
		mag.addChild(gun41);
		gun41.cubeList.add(new ModelBox(gun41, 0, 11, 0.0F, 0.0F, 0.0F, 1, 7, 2, 0.001F, false));

		gun40 = new ModelRenderer(this);
		gun40.setRotationPoint(1.2F, -36.0F, -4.5F);
		mag.addChild(gun40);
		gun40.cubeList.add(new ModelBox(gun40, 0, 0, 0.0F, 0.0F, 0.0F, 2, 7, 2, 0.0F, false));

		gun39 = new ModelRenderer(this);
		gun39.setRotationPoint(1.05F, -19.91F, -0.2F);
		mag.addChild(gun39);
		setRotationAngle(gun39, -1.7846F, 0.0F, 0.0F);
		gun39.cubeList.add(new ModelBox(gun39, 26, 19, 0.0F, 4.2F, 0.0F, 3, 2, 1, 0.0F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(3.3F, -19.9F, -0.2F);
		mag.addChild(gun38);
		setRotationAngle(gun38, -1.7846F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 8, 30, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.001F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(0.7F, -19.9F, -0.2F);
		mag.addChild(gun37);
		setRotationAngle(gun37, -1.7846F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 15, 12, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(1.0F, -29.0F, 0.0F);
		mag.addChild(gun36);
		setRotationAngle(gun36, -1.7846F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 0, 23, 0.0F, 0.0F, 0.0F, 3, 1, 6, 0.0F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(1.0F, -22.5F, -0.5F);
		mag.addChild(gun35);
		setRotationAngle(gun35, -1.7846F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 33, 21, 0.0F, 0.0F, 0.0F, 3, 3, 3, -0.001F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(1.0F, -29.0F, -1.6F);
		mag.addChild(gun34);
		setRotationAngle(gun34, -1.7846F, 0.0F, 0.0F);
		gun34.cubeList.add(new ModelBox(gun34, 0, 11, 0.0F, 0.0F, 0.0F, 3, 3, 9, 0.0F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(1.0F, -29.0F, 1.5F);
		mag.addChild(gun33);
		setRotationAngle(gun33, -1.7846F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 0, 0, 0.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(3.1F, -30.2F, -4.6F);
		mag.addChild(gun30);
		gun30.cubeList.add(new ModelBox(gun30, 34, 19, -1.0F, 0.0F, 0.001F, 2, 1, 1, 0.0F, false));
		gun30.cubeList.add(new ModelBox(gun30, 28, 26, -2.2F, -0.001F, 0.0F, 2, 1, 1, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(3.1F, -25.5F, -1.85F);
		mag.addChild(gun21);
		setRotationAngle(gun21, -1.7846F, 0.0F, 0.0F);
		gun21.cubeList.add(new ModelBox(gun21, 12, 30, -1.0F, 0.599F, 0.0F, 2, 3, 1, -0.001F, false));
		gun21.cubeList.add(new ModelBox(gun21, 34, 16, -1.0F, 2.599F, 1.98F, 2, 1, 1, -0.001F, false));
		gun21.cubeList.add(new ModelBox(gun21, 28, 7, -2.2F, 0.6F, -0.001F, 2, 3, 1, -0.001F, false));
		gun21.cubeList.add(new ModelBox(gun21, 34, 12, -2.2F, 2.6F, 1.981F, 2, 1, 1, -0.001F, false));

		gun20 = new ModelRenderer(this);
		gun20.setRotationPoint(3.1F, -27.6F, -1.85F);
		mag.addChild(gun20);
		setRotationAngle(gun20, -1.7846F, 0.0F, 0.0F);
		gun20.cubeList.add(new ModelBox(gun20, 34, 7, -1.0F, 0.129F, 0.0F, 2, 3, 1, -0.001F, false));
		gun20.cubeList.add(new ModelBox(gun20, 28, 0, -2.2F, 0.13F, -0.001F, 2, 3, 1, -0.001F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(3.1F, -29.0F, -0.8F);
		mag.addChild(gun17);
		setRotationAngle(gun17, -1.7846F, 0.0F, 0.0F);
		gun17.cubeList.add(new ModelBox(gun17, 26, 29, 0.0F, 0.0F, -0.3F, 1, 1, 6, 0.0F, false));
		gun17.cubeList.add(new ModelBox(gun17, 26, 12, -2.2F, 0.0F, -0.3F, 1, 1, 6, 0.0F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(3.1F, -29.0F, 0.8F);
		mag.addChild(gun15);
		setRotationAngle(gun15, -1.7846F, 0.0F, 0.0F);
		gun15.cubeList.add(new ModelBox(gun15, 0, 30, 0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
		gun15.cubeList.add(new ModelBox(gun15, 28, 0, -2.2F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(3.1F, -29.0F, 1.5F);
		mag.addChild(gun14);
		setRotationAngle(gun14, -1.7846F, 0.0F, 0.0F);
		gun14.cubeList.add(new ModelBox(gun14, 14, 35, -1.0F, 0.0F, 0.0F, 2, 6, 1, 0.001F, false));
		gun14.cubeList.add(new ModelBox(gun14, 34, 27, -2.2F, -0.001F, 0.001F, 2, 6, 1, 0.001F, false));

		gun16_r1 = new ModelRenderer(this);
		gun16_r1.setRotationPoint(-0.2F, 1.1128F, -1.0598F);
		gun14.addChild(gun16_r1);
		setRotationAngle(gun16_r1, 0.0873F, 0.0F, 0.0F);
		gun16_r1.cubeList.add(new ModelBox(gun16_r1, 15, 18, -1.4F, -1.2506F, 1.1778F, 2, 1, 1, 0.001F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(3.1F, -30.5F, -2.5F);
		mag.addChild(gun12);
		setRotationAngle(gun12, -1.7846F, 0.0F, 0.0F);
		gun12.cubeList.add(new ModelBox(gun12, 16, 1, 0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));
		gun12.cubeList.add(new ModelBox(gun12, 14, 13, -2.2F, 0.0F, 0.0F, 1, 1, 10, 0.0F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(3.1F, -27.0F, 1.15F);
		mag.addChild(gun11);
		setRotationAngle(gun11, -1.7846F, 0.0F, 0.0F);
		gun11.cubeList.add(new ModelBox(gun11, 20, 35, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));
		gun11.cubeList.add(new ModelBox(gun11, 28, 4, -2.2F, -0.001F, 0.001F, 2, 1, 1, -0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(3.1F, -25.0F, 0.75F);
		mag.addChild(gun10);
		setRotationAngle(gun10, -1.7846F, 0.0F, 0.0F);
		gun10.cubeList.add(new ModelBox(gun10, 36, 0, -1.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));
		gun10.cubeList.add(new ModelBox(gun10, 34, 14, -2.2F, -0.001F, 0.001F, 2, 1, 1, -0.001F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(3.1F, -23.0F, 0.35F);
		mag.addChild(gun9);
		setRotationAngle(gun9, -1.7846F, 0.0F, 0.0F);
		gun9.cubeList.add(new ModelBox(gun9, 26, 12, -1.0F, 0.0F, 0.0F, 2, 5, 1, -0.001F, false));
		gun9.cubeList.add(new ModelBox(gun9, 0, 23, -2.2F, -0.001F, 0.001F, 2, 5, 1, -0.001F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(3.2F, -20.1F, -0.2F);
		mag.addChild(gun7);
		setRotationAngle(gun7, -1.7846F, 0.0F, 0.0F);
		gun7.cubeList.add(new ModelBox(gun7, 16, 0, -2.0F, 0.0F, 0.0F, 3, 5, 1, 0.001F, false));
		gun7.cubeList.add(new ModelBox(gun7, 0, 30, -2.4F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(1.0F, -36.0F, -2.5F);
		mag.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 18, 24, 0.0F, 0.0F, 0.0F, 3, 7, 4, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(0.0F, 0.0F, 1.0F);
		gun1.addChild(gun3_r1);
		setRotationAngle(gun3_r1, 0.0F, 0.0F, 0.576F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 16, 6, 0.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(3.0F, 0.0F, 1.0F);
		gun1.addChild(gun2_r1);
		setRotationAngle(gun2_r1, 0.0F, 0.0F, -0.576F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 12, 24, -1.0F, -1.0F, 0.0F, 1, 1, 3, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
