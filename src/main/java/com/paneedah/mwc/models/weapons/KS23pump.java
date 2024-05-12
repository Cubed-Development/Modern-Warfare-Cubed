package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KS23pump extends ModelWithAttachments {
	private final ModelRenderer pump;
	private final ModelRenderer pump34_r1;
	private final ModelRenderer pump30;
	private final ModelRenderer pump29;
	private final ModelRenderer pump28;
	private final ModelRenderer pump27;
	private final ModelRenderer pump26;
	private final ModelRenderer pump25;
	private final ModelRenderer pump24;
	private final ModelRenderer pump23;
	private final ModelRenderer pump22;
	private final ModelRenderer pump21;
	private final ModelRenderer pump20;
	private final ModelRenderer pump19;
	private final ModelRenderer pump18;
	private final ModelRenderer pump17;
	private final ModelRenderer pump16;
	private final ModelRenderer pump15;
	private final ModelRenderer pump14;
	private final ModelRenderer pump13;
	private final ModelRenderer pump12;
	private final ModelRenderer pump11;
	private final ModelRenderer pump10;
	private final ModelRenderer pump6;
	private final ModelRenderer pump5;

	public KS23pump() {
		textureWidth = 300;
		textureHeight = 300;

		pump = new ModelRenderer(this);
		pump.setRotationPoint(0.0F, 24.0F, 0.0F);
		pump.cubeList.add(new ModelBox(pump, 104, 69, -2.5F, -24.4F, -29.002F, 3, 1, 15, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 19, 103, 0.41F, -27.4F, -29.0F, 1, 3, 14, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 0, 13, -2.0F, -24.6F, -39.0F, 2, 1, 10, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 0, 25, -3.0F, -27.4F, -39.0F, 1, 3, 10, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 0, 0, 0.0F, -27.4F, -39.0F, 1, 3, 10, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 71, 104, -3.41F, -27.4F, -29.0F, 1, 3, 14, 0.0F, false));
		pump.cubeList.add(new ModelBox(pump, 52, 62, -2.601F, -29.6F, -12.0F, 1, 2, 8, 0.0F, false));

		pump34_r1 = new ModelRenderer(this);
		pump34_r1.setRotationPoint(-2.601F, -29.6F, -12.0F);
		pump.addChild(pump34_r1);
		setRotationAngle(pump34_r1, 0.0F, 0.0F, -0.7854F);
		pump34_r1.cubeList.add(new ModelBox(pump34_r1, 0, 74, 0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, false));

		pump30 = new ModelRenderer(this);
		pump30.setRotationPoint(-3.5F, -27.4F, -18.5F);
		pump.addChild(pump30);
		pump30.cubeList.add(new ModelBox(pump30, 12, 25, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump30.cubeList.add(new ModelBox(pump30, 0, 25, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump29 = new ModelRenderer(this);
		pump29.setRotationPoint(-3.5F, -27.4F, -21.5F);
		pump.addChild(pump29);
		pump29.cubeList.add(new ModelBox(pump29, 19, 25, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump29.cubeList.add(new ModelBox(pump29, 19, 0, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump28 = new ModelRenderer(this);
		pump28.setRotationPoint(-3.5F, -27.4F, -24.5F);
		pump.addChild(pump28);
		pump28.cubeList.add(new ModelBox(pump28, 26, 0, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump28.cubeList.add(new ModelBox(pump28, 6, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump27 = new ModelRenderer(this);
		pump27.setRotationPoint(-3.5F, -27.4F, -27.5F);
		pump.addChild(pump27);
		pump27.cubeList.add(new ModelBox(pump27, 26, 5, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump27.cubeList.add(new ModelBox(pump27, 12, 0, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump26 = new ModelRenderer(this);
		pump26.setRotationPoint(-3.5F, -27.4F, -26.0F);
		pump.addChild(pump26);
		pump26.cubeList.add(new ModelBox(pump26, 26, 13, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump26.cubeList.add(new ModelBox(pump26, 0, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump25 = new ModelRenderer(this);
		pump25.setRotationPoint(-3.5F, -27.4F, -23.0F);
		pump.addChild(pump25);
		pump25.cubeList.add(new ModelBox(pump25, 26, 18, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump25.cubeList.add(new ModelBox(pump25, 14, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump24 = new ModelRenderer(this);
		pump24.setRotationPoint(-3.5F, -27.4F, -20.0F);
		pump.addChild(pump24);
		pump24.cubeList.add(new ModelBox(pump24, 26, 25, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump24.cubeList.add(new ModelBox(pump24, 20, 18, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump23 = new ModelRenderer(this);
		pump23.setRotationPoint(-3.5F, -27.4F, -17.0F);
		pump.addChild(pump23);
		pump23.cubeList.add(new ModelBox(pump23, 0, 30, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));
		pump23.cubeList.add(new ModelBox(pump23, 6, 25, 4.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump22 = new ModelRenderer(this);
		pump22.setRotationPoint(-3.6F, -24.4F, -15.0F);
		pump.addChild(pump22);
		setRotationAngle(pump22, 0.0F, 0.0F, -0.7854F);
		pump22.cubeList.add(new ModelBox(pump22, 32, 13, -0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		pump21 = new ModelRenderer(this);
		pump21.setRotationPoint(-2.5F, -23.3F, -15.0F);
		pump.addChild(pump21);
		setRotationAngle(pump21, 0.0F, 0.0F, -2.3562F);
		pump21.cubeList.add(new ModelBox(pump21, 32, 15, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

		pump20 = new ModelRenderer(this);
		pump20.setRotationPoint(0.5F, -23.3F, -15.0F);
		pump.addChild(pump20);
		setRotationAngle(pump20, 0.0F, 0.0F, -2.3562F);
		pump20.cubeList.add(new ModelBox(pump20, 32, 18, 0.001F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));

		pump19 = new ModelRenderer(this);
		pump19.setRotationPoint(1.6F, -24.4F, -15.0F);
		pump.addChild(pump19);
		setRotationAngle(pump19, 0.0F, 0.0F, 2.3562F);
		pump19.cubeList.add(new ModelBox(pump19, 32, 20, 0.0F, 0.0F, -0.002F, 1, 1, 1, 0.0F, false));

		pump18 = new ModelRenderer(this);
		pump18.setRotationPoint(-2.5F, -24.3F, -15.0F);
		pump.addChild(pump18);
		pump18.cubeList.add(new ModelBox(pump18, 26, 47, 0.0F, 0.0F, 0.002F, 3, 1, 1, 0.0F, false));

		pump17 = new ModelRenderer(this);
		pump17.setRotationPoint(0.6F, -27.4F, -15.0F);
		pump.addChild(pump17);
		pump17.cubeList.add(new ModelBox(pump17, 6, 30, 0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, false));

		pump16 = new ModelRenderer(this);
		pump16.setRotationPoint(-3.6F, -27.4F, -15.0F);
		pump.addChild(pump16);
		pump16.cubeList.add(new ModelBox(pump16, 26, 30, 0.0F, 0.001F, 0.0F, 1, 3, 1, 0.0F, false));

		pump15 = new ModelRenderer(this);
		pump15.setRotationPoint(-3.4F, -27.4F, -29.0F);
		pump.addChild(pump15);
		setRotationAngle(pump15, 0.0F, 1.3059F, 0.0F);
		pump15.cubeList.add(new ModelBox(pump15, 74, 56, 0.0F, 0.001F, 0.0F, 2, 3, 1, 0.0F, false));

		pump14 = new ModelRenderer(this);
		pump14.setRotationPoint(1.4F, -27.4F, -29.0F);
		pump.addChild(pump14);
		setRotationAngle(pump14, 0.0F, -2.8767F, 0.0F);
		pump14.cubeList.add(new ModelBox(pump14, 69, 21, 0.0F, 0.001F, 0.0F, 1, 3, 2, 0.0F, false));

		pump13 = new ModelRenderer(this);
		pump13.setRotationPoint(1.0F, -24.4F, -39.0F);
		pump.addChild(pump13);
		setRotationAngle(pump13, 0.0F, 0.0F, 2.4784F);
		pump13.cubeList.add(new ModelBox(pump13, 0, 38, 0.3F, -0.001F, -0.001F, 1, 1, 10, 0.0F, false));

		pump12 = new ModelRenderer(this);
		pump12.setRotationPoint(1.0F, -24.4F, -39.0F);
		pump.addChild(pump12);
		setRotationAngle(pump12, 0.0F, 0.0F, 2.4784F);
		pump12.cubeList.add(new ModelBox(pump12, 79, 21, 0.0F, 0.0F, 0.001F, 1, 1, 10, 0.0F, false));

		pump11 = new ModelRenderer(this);
		pump11.setRotationPoint(-3.0F, -24.4F, -39.0F);
		pump.addChild(pump11);
		setRotationAngle(pump11, 0.0F, 0.0F, -0.8901F);
		pump11.cubeList.add(new ModelBox(pump11, 81, 0, -0.001F, 0.3F, -0.001F, 1, 1, 10, 0.0F, false));

		pump10 = new ModelRenderer(this);
		pump10.setRotationPoint(-3.0F, -24.4F, -39.0F);
		pump.addChild(pump10);
		setRotationAngle(pump10, 0.0F, 0.0F, -0.8901F);
		pump10.cubeList.add(new ModelBox(pump10, 123, 51, 0.0F, 0.0F, 0.001F, 1, 1, 10, 0.0F, false));

		pump6 = new ModelRenderer(this);
		pump6.setRotationPoint(-2.5F, -23.4F, -29.0F);
		pump.addChild(pump6);
		setRotationAngle(pump6, 0.0F, 0.0F, -2.3038F);
		pump6.cubeList.add(new ModelBox(pump6, 121, 85, 0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));
		pump6.cubeList.add(new ModelBox(pump6, 0, 121, 0.35F, -0.001F, -0.001F, 1, 1, 14, 0.0F, false));

		pump5 = new ModelRenderer(this);
		pump5.setRotationPoint(0.5F, -23.4F, -29.0F);
		pump.addChild(pump5);
		setRotationAngle(pump5, 0.0F, 0.0F, 2.3038F);
		pump5.cubeList.add(new ModelBox(pump5, 104, 120, -1.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, false));
		pump5.cubeList.add(new ModelBox(pump5, 109, 31, -1.35F, -0.001F, -0.001F, 1, 1, 14, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pump.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
