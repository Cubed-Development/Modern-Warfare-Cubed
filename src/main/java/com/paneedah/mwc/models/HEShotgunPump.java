package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HEShotgunPump extends ModelWithAttachments {
	private final ModelRenderer pump;
	private final ModelRenderer pump25_r1;
	private final ModelRenderer pump24_r1;
	private final ModelRenderer pump23_r1;
	private final ModelRenderer pump22_r1;
	private final ModelRenderer pump21_r1;
	private final ModelRenderer pump20_r1;
	private final ModelRenderer pump19_r1;
	private final ModelRenderer pump18_r1;
	private final ModelRenderer pump15_r1;
	private final ModelRenderer pump14_r1;
	private final ModelRenderer pump13_r1;
	private final ModelRenderer pump12_r1;
	private final ModelRenderer pump10_r1;
	private final ModelRenderer pump9_r1;
	private final ModelRenderer pump8_r1;
	private final ModelRenderer pump7_r1;
	private final ModelRenderer pump6_r1;
	private final ModelRenderer pump5_r1;
	private final ModelRenderer pump4_r1;
	private final ModelRenderer pump3_r1;

	public HEShotgunPump() {
		textureWidth = 512;
		textureHeight = 256;

		pump = new ModelRenderer(this);
		pump.setRotationPoint(0.0F, -34.5466F, -14.6464F);
		pump.cubeList.add(new ModelBox(pump, 0, 0, -3.5F, 29.4466F, -24.3536F, 5, 4, 19, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, -3.5F, 31.4466F, -26.2536F, 5, 2, 2, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, -2.5F, 34.4466F, -6.3536F, 3, 1, 1, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, -3.5F, 33.4466F, -21.3536F, 5, 1, 4, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, -2.5F, 34.4466F, -21.3536F, 3, 1, 4, 0.0F, true));

		pump25_r1 = new ModelRenderer(this);
		pump25_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pump.addChild(pump25_r1);
		setRotationAngle(pump25_r1, 1.7408F, 0.0F, 0.0F);
		pump25_r1.cubeList.add(new ModelBox(pump25_r1, 0, 0, -2.5F, -23.1F, -32.0F, 3, 5, 1, 0.0F, true));

		pump24_r1 = new ModelRenderer(this);
		pump24_r1.setRotationPoint(0.0F, -1.1692F, 0.9856F);
		pump.addChild(pump24_r1);
		setRotationAngle(pump24_r1, 1.7408F, 0.0F, 0.0F);
		pump24_r1.cubeList.add(new ModelBox(pump24_r1, 0, 0, -3.5F, -24.1F, -32.0F, 5, 6, 1, 0.0F, true));

		pump23_r1 = new ModelRenderer(this);
		pump23_r1.setRotationPoint(0.0F, 5.0117F, -53.1403F);
		pump.addChild(pump23_r1);
		setRotationAngle(pump23_r1, 2.9845F, 0.0F, 0.0F);
		pump23_r1.cubeList.add(new ModelBox(pump23_r1, 0, 0, -3.5F, -24.1F, -36.0F, 5, 1, 5, 0.0F, true));

		pump22_r1 = new ModelRenderer(this);
		pump22_r1.setRotationPoint(0.0F, 6.9994F, -53.2967F);
		pump.addChild(pump22_r1);
		setRotationAngle(pump22_r1, 2.9845F, 0.0F, 0.0F);
		pump22_r1.cubeList.add(new ModelBox(pump22_r1, 0, 0, -2.5F, -23.1F, -36.0F, 3, 1, 5, 0.0F, true));

		pump21_r1 = new ModelRenderer(this);
		pump21_r1.setRotationPoint(-14.4806F, 16.3447F, 14.6464F);
		pump.addChild(pump21_r1);
		setRotationAngle(pump21_r1, 0.0F, 0.0F, 2.3562F);
		pump21_r1.cubeList.add(new ModelBox(pump21_r1, 0, 0, 1.5F, -24.1F, -36.0F, 1, 1, 4, 0.0F, true));

		pump20_r1 = new ModelRenderer(this);
		pump20_r1.setRotationPoint(16.0161F, 49.013F, 14.6464F);
		pump.addChild(pump20_r1);
		setRotationAngle(pump20_r1, 0.0F, 0.0F, -0.7854F);
		pump20_r1.cubeList.add(new ModelBox(pump20_r1, 0, 0, -3.5F, -24.1F, -36.0F, 1, 1, 4, 0.0F, true));

		pump19_r1 = new ModelRenderer(this);
		pump19_r1.setRotationPoint(17.1877F, 19.466F, 14.6464F);
		pump.addChild(pump19_r1);
		setRotationAngle(pump19_r1, 0.0F, 0.0F, -2.3562F);
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 0, 0, 0.5F, -23.1F, -36.0F, 1, 1, 4, 0.0F, true));

		pump18_r1 = new ModelRenderer(this);
		pump18_r1.setRotationPoint(12.0664F, 17.3447F, 14.6464F);
		pump.addChild(pump18_r1);
		setRotationAngle(pump18_r1, 0.0F, 0.0F, -2.3562F);
		pump18_r1.cubeList.add(new ModelBox(pump18_r1, 0, 0, -2.5F, -23.1F, -36.0F, 1, 1, 4, 0.0F, true));

		pump15_r1 = new ModelRenderer(this);
		pump15_r1.setRotationPoint(13.606F, 18.6998F, 14.6464F);
		pump.addChild(pump15_r1);
		setRotationAngle(pump15_r1, 0.0F, 0.0F, -2.2679F);
		pump15_r1.cubeList.add(new ModelBox(pump15_r1, 0, 0, -2.5F, -23.1F, -21.0F, 1, 1, 1, 0.0F, true));

		pump14_r1 = new ModelRenderer(this);
		pump14_r1.setRotationPoint(13.4153F, 52.013F, 14.6464F);
		pump.addChild(pump14_r1);
		setRotationAngle(pump14_r1, 0.0F, 0.0F, -0.5949F);
		pump14_r1.cubeList.add(new ModelBox(pump14_r1, 0, 0, -3.95F, -25.15F, -21.0F, 1, 2, 1, 0.0F, true));

		pump13_r1 = new ModelRenderer(this);
		pump13_r1.setRotationPoint(-14.9951F, 14.9117F, 14.6464F);
		pump.addChild(pump13_r1);
		setRotationAngle(pump13_r1, 0.0F, 0.0F, 2.3051F);
		pump13_r1.cubeList.add(new ModelBox(pump13_r1, 0, 0, 2.2F, -25.15F, -21.0F, 1, 1, 1, 0.0F, true));

		pump12_r1 = new ModelRenderer(this);
		pump12_r1.setRotationPoint(15.3053F, 17.7079F, 14.6464F);
		pump.addChild(pump12_r1);
		setRotationAngle(pump12_r1, 0.0F, 0.0F, -2.4677F);
		pump12_r1.cubeList.add(new ModelBox(pump12_r1, 0, 0, 0.5F, -23.1F, -21.0F, 1, 2, 1, 0.0F, true));

		pump10_r1 = new ModelRenderer(this);
		pump10_r1.setRotationPoint(-27.4184F, 33.0226F, 14.6464F);
		pump.addChild(pump10_r1);
		setRotationAngle(pump10_r1, 0.0F, 0.0F, 1.3963F);
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 0, 0, 1.5F, -29.1F, -21.0F, 4, 1, 1, 0.0F, true));

		pump9_r1 = new ModelRenderer(this);
		pump9_r1.setRotationPoint(-3.2607F, 58.7554F, 14.6464F);
		pump.addChild(pump9_r1);
		setRotationAngle(pump9_r1, 0.0F, 0.0F, 0.1115F);
		pump9_r1.cubeList.add(new ModelBox(pump9_r1, 0, 0, -3.5F, -29.1F, -21.0F, 1, 4, 1, 0.0F, true));

		pump8_r1 = new ModelRenderer(this);
		pump8_r1.setRotationPoint(15.2225F, 16.04F, 14.6464F);
		pump.addChild(pump8_r1);
		setRotationAngle(pump8_r1, 0.0F, 0.0F, -2.4958F);
		pump8_r1.cubeList.add(new ModelBox(pump8_r1, 0, 0, 0.5F, -23.8F, -42.0F, 1, 1, 22, 0.0F, true));

		pump7_r1 = new ModelRenderer(this);
		pump7_r1.setRotationPoint(-17.4104F, 16.8739F, 14.6464F);
		pump.addChild(pump7_r1);
		setRotationAngle(pump7_r1, 0.0F, 0.0F, 2.2307F);
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 0, 0, 1.5F, -25.1F, -42.0F, 1, 1, 22, 0.0F, true));

		pump6_r1 = new ModelRenderer(this);
		pump6_r1.setRotationPoint(14.237F, 51.548F, 14.6464F);
		pump.addChild(pump6_r1);
		setRotationAngle(pump6_r1, 0.0F, 0.0F, -0.6367F);
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 0, 0, -3.5F, -25.1F, -42.0F, 1, 1, 22, 0.0F, true));

		pump5_r1 = new ModelRenderer(this);
		pump5_r1.setRotationPoint(14.5377F, 17.9417F, 14.6464F);
		pump.addChild(pump5_r1);
		setRotationAngle(pump5_r1, 0.0F, 0.0F, -2.2447F);
		pump5_r1.cubeList.add(new ModelBox(pump5_r1, 0, 0, -2.5F, -23.8F, -42.0F, 1, 1, 22, 0.0F, true));

		pump4_r1 = new ModelRenderer(this);
		pump4_r1.setRotationPoint(0.0F, 77.4711F, -16.5139F);
		pump.addChild(pump4_r1);
		setRotationAngle(pump4_r1, -0.7679F, 0.0F, 0.0F);
		pump4_r1.cubeList.add(new ModelBox(pump4_r1, 0, 0, -3.5F, -29.1F, -39.0F, 5, 2, 1, 0.0F, true));

		pump3_r1 = new ModelRenderer(this);
		pump3_r1.setRotationPoint(0.0F, 20.8509F, 21.6521F);
		pump.addChild(pump3_r1);
		setRotationAngle(pump3_r1, 0.8029F, 0.0F, 0.0F);
		pump3_r1.cubeList.add(new ModelBox(pump3_r1, 0, 0, -3.5F, -27.1F, -40.9F, 5, 2, 2, 0.0F, true));
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