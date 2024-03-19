package com.paneedah.mwc.models.weapons;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class TabletModel extends ModelBase {
	private final ModelRenderer Tablet;
	private final ModelRenderer IPad52_r1;
	private final ModelRenderer IPad44_r1;
	private final ModelRenderer IPad43_r1;
	private final ModelRenderer IPad36_r1;
	private final ModelRenderer IPad32_r1;
	private final ModelRenderer IPad31_r1;
	private final ModelRenderer IPad27_r1;
	private final ModelRenderer IPad26_r1;
	private final ModelRenderer IPad19_r1;
	private final ModelRenderer IPad18_r1;
	private final ModelRenderer IPad15_r1;
	private final ModelRenderer IPad14_r1;

	public TabletModel() {
		textureWidth = 256;
		textureHeight = 128;

		Tablet = new ModelRenderer(this);
		Tablet.setRotationPoint(0.0F, 9.8487F, 20.4884F);
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.0F, -9.8487F, -20.4884F, 20, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.0F, -19.8487F, -20.4884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, 9.0F, -19.8487F, -20.4884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.0F, -19.8487F, -20.9884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, 9.0F, -19.8487F, -20.9884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.0F, -9.8487F, -20.9884F, 20, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.0F, -20.8487F, -20.9884F, 20, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.0F, -20.8487F, -20.4884F, 20, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -9.0F, -19.8487F, -21.4884F, 18, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, 8.5F, -19.8487F, -20.4884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -9.5F, -19.8487F, -20.4884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -10.5F, -19.8487F, -20.7884F, 1, 10, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, 9.5F, -19.8487F, -20.7384F, 1, 3, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, 9.5F, -12.8487F, -20.7384F, 1, 3, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, 9.1F, -20.9487F, -20.3884F, 1, 5, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, 9.1F, -13.7487F, -20.3884F, 1, 5, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -9.5F, -20.9487F, -20.3884F, 19, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -10.1F, -20.9487F, -20.3884F, 1, 12, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -10.1F, -9.7487F, -20.3884F, 18, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, 7.9F, -9.7487F, -20.3884F, 2, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, 9.1F, -14.1487F, -20.3884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, 9.1F, -16.5487F, -20.3884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, 8.7F, -15.3487F, -20.4384F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -9.8F, -17.8487F, -21.7884F, 6, 2, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -9.8F, -13.8487F, -21.7884F, 6, 2, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -9.1F, -17.3487F, -20.4384F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 0, 0, -9.1F, -13.3487F, -20.4384F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -9.4F, -19.9487F, -20.3884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -9.4F, -10.7487F, -20.3884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -9.4F, -11.7487F, -20.3884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 100, 0, -9.4F, -18.9487F, -20.3884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 70, 0, 5.1F, -10.8487F, -21.5884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 70, 0, 8.1F, -10.8487F, -21.5884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 70, 0, 6.6F, -10.8487F, -21.5884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 70, 0, 5.1F, -10.3487F, -21.5884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 70, 0, 8.1F, -10.3487F, -21.5884F, 1, 1, 1, 0.0F, true));
		Tablet.cubeList.add(new ModelBox(Tablet, 70, 0, 6.6F, -10.3487F, -21.5884F, 1, 1, 1, 0.0F, true));

		IPad52_r1 = new ModelRenderer(this);
		IPad52_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tablet.addChild(IPad52_r1);
		setRotationAngle(IPad52_r1, 1.1154F, 0.0F, 0.0F);
		IPad52_r1.cubeList.add(new ModelBox(IPad52_r1, 70, 0, 8.1F, -23.5F, -1.1F, 1, 1, 1, 0.0F, true));
		IPad52_r1.cubeList.add(new ModelBox(IPad52_r1, 70, 0, 5.1F, -23.5F, -1.1F, 1, 1, 1, 0.0F, true));
		IPad52_r1.cubeList.add(new ModelBox(IPad52_r1, 70, 0, 6.6F, -23.5F, -1.1F, 1, 1, 1, 0.0F, true));

		IPad44_r1 = new ModelRenderer(this);
		IPad44_r1.setRotationPoint(-33.748F, -39.3601F, -20.4884F);
		Tablet.addChild(IPad44_r1);
		setRotationAngle(IPad44_r1, 0.0F, 0.0F, 2.5281F);
		IPad44_r1.cubeList.add(new ModelBox(IPad44_r1, 100, 0, -8.4F, -32.1F, 0.1F, 1, 1, 1, 0.0F, true));

		IPad43_r1 = new ModelRenderer(this);
		IPad43_r1.setRotationPoint(-34.0117F, -20.9905F, -20.4884F);
		Tablet.addChild(IPad43_r1);
		setRotationAngle(IPad43_r1, 0.0F, 0.0F, 2.2307F);
		IPad43_r1.cubeList.add(new ModelBox(IPad43_r1, 100, 0, -8.4F, -25.9F, 0.1F, 1, 1, 1, 0.0F, true));

		IPad36_r1 = new ModelRenderer(this);
		IPad36_r1.setRotationPoint(-0.8303F, 14.1513F, -19.0845F);
		Tablet.addChild(IPad36_r1);
		setRotationAngle(IPad36_r1, 0.0F, -0.409F, 0.0F);
		IPad36_r1.cubeList.add(new ModelBox(IPad36_r1, 0, 0, -3.8F, -32.0F, -1.3F, 1, 2, 1, 0.0F, true));
		IPad36_r1.cubeList.add(new ModelBox(IPad36_r1, 0, 0, -3.8F, -28.0F, -1.3F, 1, 2, 1, 0.0F, true));

		IPad32_r1 = new ModelRenderer(this);
		IPad32_r1.setRotationPoint(0.0F, 7.7591F, -5.1495F);
		Tablet.addChild(IPad32_r1);
		setRotationAngle(IPad32_r1, 0.7064F, 0.0F, 0.0F);
		IPad32_r1.cubeList.add(new ModelBox(IPad32_r1, 0, 0, -9.0F, -24.0F, -1.0F, 18, 1, 1, 0.0F, true));

		IPad31_r1 = new ModelRenderer(this);
		IPad31_r1.setRotationPoint(0.0F, 1.7053F, 4.8255F);
		Tablet.addChild(IPad31_r1);
		setRotationAngle(IPad31_r1, 0.8551F, 0.0F, 0.0F);
		IPad31_r1.cubeList.add(new ModelBox(IPad31_r1, 0, 0, -9.0F, -34.0F, -1.0F, 18, 1, 1, 0.0F, true));

		IPad27_r1 = new ModelRenderer(this);
		IPad27_r1.setRotationPoint(-5.9689F, 11.4443F, -20.4884F);
		Tablet.addChild(IPad27_r1);
		setRotationAngle(IPad27_r1, 0.0F, 0.0F, 0.2231F);
		IPad27_r1.cubeList.add(new ModelBox(IPad27_r1, 100, 0, 9.1F, -28.0F, 0.1F, 1, 5, 1, 0.0F, true));

		IPad26_r1 = new ModelRenderer(this);
		IPad26_r1.setRotationPoint(40.4201F, -14.4837F, -20.4884F);
		Tablet.addChild(IPad26_r1);
		setRotationAngle(IPad26_r1, 0.0F, 0.0F, -1.8218F);
		IPad26_r1.cubeList.add(new ModelBox(IPad26_r1, 100, 0, 9.1F, -30.0F, 0.1F, 5, 1, 1, 0.0F, true));

		IPad19_r1 = new ModelRenderer(this);
		IPad19_r1.setRotationPoint(-2.9719F, -52.7844F, -20.4884F);
		Tablet.addChild(IPad19_r1);
		setRotationAngle(IPad19_r1, 0.0F, 0.0F, 2.4538F);
		IPad19_r1.cubeList.add(new ModelBox(IPad19_r1, 0, 0, 10.5F, -34.0F, -0.25F, 1, 1, 1, 0.0F, true));

		IPad18_r1 = new ModelRenderer(this);
		IPad18_r1.setRotationPoint(-0.28F, -33.7243F, -20.4884F);
		Tablet.addChild(IPad18_r1);
		setRotationAngle(IPad18_r1, 0.0F, 0.0F, 2.3051F);
		IPad18_r1.cubeList.add(new ModelBox(IPad18_r1, 0, 0, 10.5F, -24.0F, -0.25F, 1, 1, 1, 0.0F, true));

		IPad15_r1 = new ModelRenderer(this);
		IPad15_r1.setRotationPoint(13.8506F, -0.1895F, -20.4884F);
		Tablet.addChild(IPad15_r1);
		setRotationAngle(IPad15_r1, 0.0F, 0.0F, -0.7808F);
		IPad15_r1.cubeList.add(new ModelBox(IPad15_r1, 0, 0, -10.5F, -24.0F, -0.3F, 1, 1, 1, 0.0F, true));

		IPad14_r1 = new ModelRenderer(this);
		IPad14_r1.setRotationPoint(20.2439F, -1.9305F, -20.4884F);
		Tablet.addChild(IPad14_r1);
		setRotationAngle(IPad14_r1, 0.0F, 0.0F, -0.7436F);
		IPad14_r1.cubeList.add(new ModelBox(IPad14_r1, 0, 0, -10.5F, -34.0F, -0.3F, 1, 1, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Tablet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
