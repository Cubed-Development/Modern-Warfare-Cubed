package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Super90Pump extends ModelWithAttachments {
	private final ModelRenderer pump;
	private final ModelRenderer pump19_r1;
	private final ModelRenderer pump18_r1;
	private final ModelRenderer pump17_r1;
	private final ModelRenderer pump16_r1;
	private final ModelRenderer pump13_r1;
	private final ModelRenderer pump12_r1;
	private final ModelRenderer pump11_r1;
	private final ModelRenderer pump10_r1;
	private final ModelRenderer pump7_r1;
	private final ModelRenderer pump6_r1;
	private final ModelRenderer pump5_r1;
	private final ModelRenderer pump4_r1;
	private final ModelRenderer action;
	private final ModelRenderer action7_r1;
	private final ModelRenderer action6_r1;

	public Super90Pump() {
		textureWidth = 512;
		textureHeight = 256;

		pump = new ModelRenderer(this);
		pump.setRotationPoint(-22.5947F, 8.0919F, 0.0F);
		pump.cubeList.add(new ModelBox(pump, 0, 0, 19.0947F, -11.0919F, -37.5F, 5, 1, 14, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, 20.5947F, -8.9919F, -37.5F, 2, 1, 15, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, 19.5947F, -13.0919F, -25.5F, 4, 2, 2, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, 19.8947F, -13.0919F, -37.5F, 1, 2, 12, 0.0F, true));
		pump.cubeList.add(new ModelBox(pump, 0, 0, 22.2947F, -13.0919F, -37.5F, 1, 2, 12, 0.0F, true));

		pump19_r1 = new ModelRenderer(this);
		pump19_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		pump.addChild(pump19_r1);
		setRotationAngle(pump19_r1, 0.0F, 0.0F, 1.2269F);
		pump19_r1.cubeList.add(new ModelBox(pump19_r1, 0, 0, -3.4F, -26.1F, -23.5F, 2, 2, 1, 0.0F, true));

		pump18_r1 = new ModelRenderer(this);
		pump18_r1.setRotationPoint(44.7524F, -4.6207F, 0.0F);
		pump.addChild(pump18_r1);
		setRotationAngle(pump18_r1, 0.0F, 0.0F, -1.2269F);
		pump18_r1.cubeList.add(new ModelBox(pump18_r1, 0, 0, -3.5F, -26.0F, -23.5F, 2, 2, 1, 0.0F, true));

		pump17_r1 = new ModelRenderer(this);
		pump17_r1.setRotationPoint(6.7462F, -25.8814F, 0.0F);
		pump.addChild(pump17_r1);
		setRotationAngle(pump17_r1, 0.0F, 0.0F, 2.4166F);
		pump17_r1.cubeList.add(new ModelBox(pump17_r1, 0, 0, -1.7F, -23.9F, -37.5F, 1, 1, 15, 0.0F, true));
		pump17_r1.cubeList.add(new ModelBox(pump17_r1, 0, 0, -1.0F, -23.9F, -37.5F, 1, 1, 15, 0.0F, true));

		pump16_r1 = new ModelRenderer(this);
		pump16_r1.setRotationPoint(34.9463F, -27.2075F, 0.0F);
		pump.addChild(pump16_r1);
		setRotationAngle(pump16_r1, 0.0F, 0.0F, -2.4166F);
		pump16_r1.cubeList.add(new ModelBox(pump16_r1, 0, 0, -1.3F, -23.9F, -37.5F, 1, 1, 15, 0.0F, true));
		pump16_r1.cubeList.add(new ModelBox(pump16_r1, 0, 0, -2.0F, -23.9F, -37.5F, 1, 1, 15, 0.0F, true));

		pump13_r1 = new ModelRenderer(this);
		pump13_r1.setRotationPoint(43.4111F, -19.9389F, 0.0F);
		pump.addChild(pump13_r1);
		setRotationAngle(pump13_r1, 0.0F, 0.0F, -1.8218F);
		pump13_r1.cubeList.add(new ModelBox(pump13_r1, 0, 0, -4.5F, -26.0F, -37.5F, 1, 1, 15, 0.0F, true));

		pump12_r1 = new ModelRenderer(this);
		pump12_r1.setRotationPoint(-0.7183F, -18.0014F, 0.0F);
		pump.addChild(pump12_r1);
		setRotationAngle(pump12_r1, 0.0F, 0.0F, 1.8218F);
		pump12_r1.cubeList.add(new ModelBox(pump12_r1, 0, 0, 1.5F, -26.0F, -37.5F, 1, 1, 15, 0.0F, true));

		pump11_r1 = new ModelRenderer(this);
		pump11_r1.setRotationPoint(29.0276F, 15.3445F, 0.0F);
		pump.addChild(pump11_r1);
		setRotationAngle(pump11_r1, 0.0F, 0.0F, -0.2231F);
		pump11_r1.cubeList.add(new ModelBox(pump11_r1, 0, 0, -0.3F, -29.0F, -37.5F, 1, 2, 13, 0.0F, true));

		pump10_r1 = new ModelRenderer(this);
		pump10_r1.setRotationPoint(16.1123F, 15.7869F, 0.0F);
		pump.addChild(pump10_r1);
		setRotationAngle(pump10_r1, 0.0F, 0.0F, 0.2231F);
		pump10_r1.cubeList.add(new ModelBox(pump10_r1, 0, 0, -2.7F, -29.0F, -37.5F, 1, 2, 13, 0.0F, true));

		pump7_r1 = new ModelRenderer(this);
		pump7_r1.setRotationPoint(-0.813F, -0.563F, 0.0F);
		pump.addChild(pump7_r1);
		setRotationAngle(pump7_r1, 0.0F, 0.0F, 1.1154F);
		pump7_r1.cubeList.add(new ModelBox(pump7_r1, 0, 0, -0.5F, -27.0F, -37.5F, 2, 1, 12, 0.0F, true));

		pump6_r1 = new ModelRenderer(this);
		pump6_r1.setRotationPoint(44.8821F, -2.359F, 0.0F);
		pump.addChild(pump6_r1);
		setRotationAngle(pump6_r1, 0.0F, 0.0F, -1.1154F);
		pump6_r1.cubeList.add(new ModelBox(pump6_r1, 0, 0, -3.5F, -27.0F, -37.5F, 2, 1, 12, 0.0F, true));

		pump5_r1 = new ModelRenderer(this);
		pump5_r1.setRotationPoint(-2.525F, -6.3338F, 0.0F);
		pump.addChild(pump5_r1);
		setRotationAngle(pump5_r1, 0.0F, 0.0F, 1.3384F);
		pump5_r1.cubeList.add(new ModelBox(pump5_r1, 0, 0, -0.5F, -27.0F, -25.5F, 2, 1, 2, 0.0F, true));

		pump4_r1 = new ModelRenderer(this);
		pump4_r1.setRotationPoint(46.1751F, -8.2802F, 0.0F);
		pump.addChild(pump4_r1);
		setRotationAngle(pump4_r1, 0.0F, 0.0F, -1.3384F);
		pump4_r1.cubeList.add(new ModelBox(pump4_r1, 0, 0, -3.5F, -27.0F, -25.5F, 2, 1, 2, 0.0F, true));

		action = new ModelRenderer(this);
		action.setRotationPoint(15.6663F, 17.4892F, 0.0F);
		action.cubeList.add(new ModelBox(action, 0, 100, -20.1663F, -22.3892F, -9.9F, 3, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 100, -20.1663F, -22.4892F, -10.0F, 2, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 100, -20.1663F, -22.2892F, -10.0F, 3, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 100, -20.1663F, -22.3892F, -10.1F, 3, 1, 1, 0.0F, true));
		action.cubeList.add(new ModelBox(action, 0, 100, -18.3663F, -23.0892F, -12.0F, 1, 1, 8, 0.0F, true));

		action7_r1 = new ModelRenderer(this);
		action7_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		action.addChild(action7_r1);
		setRotationAngle(action7_r1, 0.0F, 0.0F, -0.5995F);
		action7_r1.cubeList.add(new ModelBox(action7_r1, 0, 100, -2.7F, -28.6F, -12.0F, 1, 2, 18, 0.0F, true));

		action6_r1 = new ModelRenderer(this);
		action6_r1.setRotationPoint(4.4733F, -4.068F, 0.0F);
		action.addChild(action6_r1);
		setRotationAngle(action6_r1, 0.0F, 0.0F, -0.7854F);
		action6_r1.cubeList.add(new ModelBox(action6_r1, 0, 100, -2.7F, -29.6F, -12.0F, 1, 1, 8, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		pump.render(f5);
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
