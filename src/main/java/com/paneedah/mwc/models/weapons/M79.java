package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M79 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer main;
	private final ModelRenderer MAIN1D30SAFEGUARD_r1;
	private final ModelRenderer MAIN1D30SAFEGUARD_r2;
	private final ModelRenderer MAIN1D17_r1;
	private final ModelRenderer MAIN1D11_r1;
	private final ModelRenderer MAIN1D5_r1;
	private final ModelRenderer MAIN1D4_r1;
	private final ModelRenderer trigger;
	private final ModelRenderer MAIN1D13TRIGGR_r1;
	private final ModelRenderer grip;
	private final ModelRenderer MAIN1D30GRIP_r1;
	private final ModelRenderer MAIN1D30GRIP_r2;
	private final ModelRenderer MAIN1D28GRIP_r1;
	private final ModelRenderer MAIN1D28GRIP_r2;
	private final ModelRenderer MAIN1D25GRIP_r1;
	private final ModelRenderer MAIN1D25GRIP_r2;
	private final ModelRenderer MAIN1D25GRIP_r3;
	private final ModelRenderer MAIN1D25GRIP_r4;
	private final ModelRenderer MAIN1D19GRIP_r1;

	public M79() {
		textureWidth = 256;
		textureHeight = 200;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.5074F, 9.3483F, 24.9944F);
		

		main = new ModelRenderer(this);
		main.setRotationPoint(0.0023F, 0.236F, 4.5056F);
		gun.addChild(main);
		main.cubeList.add(new ModelBox(main, 112, 18, -3.5097F, -21.5843F, -41.5F, 7, 8, 2, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 56, 0, -3.5097F, -14.5843F, -55.5F, 7, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 76, 33, -2.5097F, -15.5843F, -55.5F, 1, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 47, -3.5097F, -14.5843F, -57.5F, 7, 1, 2, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 30, 25, -1.0097F, -13.5843F, -42.5F, 2, 4, 1, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 112, 43, -1.0097F, -9.0843F, -41.0F, 2, 1, 6, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 11, 0, -1.0097F, -13.5843F, -34.5F, 2, 4, 1, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 56, 7, -0.5097F, -12.5843F, -45.5F, 1, 1, 5, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 35, -2.0097F, -22.5843F, -41.5F, 4, 1, 4, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 56, 20, -1.5097F, -23.5843F, -37.5F, 3, 2, 3, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 0, -0.5097F, -18.5843F, -41.7F, 1, 1, 1, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 75, 52, 1.4903F, -15.5843F, -55.5F, 1, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 70, -1.5097F, -15.0843F, -55.5F, 3, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 44, -3.5097F, -14.5843F, -59.5F, 7, 1, 2, 0.0F, false));

		MAIN1D30SAFEGUARD_r1 = new ModelRenderer(this);
		MAIN1D30SAFEGUARD_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D30SAFEGUARD_r1);
		setRotationAngle(MAIN1D30SAFEGUARD_r1, -0.3316F, 0.0F, 0.0F);
		MAIN1D30SAFEGUARD_r1.cubeList.add(new ModelBox(MAIN1D30SAFEGUARD_r1, 73, 74, -1.0097F, -10.0948F, -36.1358F, 2, 1, 3, 0.0F, false));

		MAIN1D30SAFEGUARD_r2 = new ModelRenderer(this);
		MAIN1D30SAFEGUARD_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D30SAFEGUARD_r2);
		setRotationAngle(MAIN1D30SAFEGUARD_r2, 0.5411F, 0.0F, 0.0F);
		MAIN1D30SAFEGUARD_r2.cubeList.add(new ModelBox(MAIN1D30SAFEGUARD_r2, 75, 52, -1.0097F, -33.6914F, -16.0647F, 2, 2, 2, 0.0F, false));

		MAIN1D17_r1 = new ModelRenderer(this);
		MAIN1D17_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D17_r1);
		setRotationAngle(MAIN1D17_r1, -0.1571F, 0.0F, 0.0F);
		MAIN1D17_r1.cubeList.add(new ModelBox(MAIN1D17_r1, 75, 56, -0.5097F, -17.1285F, -38.0314F, 1, 1, 3, 0.0F, false));

		MAIN1D11_r1 = new ModelRenderer(this);
		MAIN1D11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D11_r1);
		setRotationAngle(MAIN1D11_r1, 0.7679F, 0.0F, 0.0F);
		MAIN1D11_r1.cubeList.add(new ModelBox(MAIN1D11_r1, 75, 63, -1.0097F, -31.0485F, -19.5077F, 2, 1, 2, 0.0F, false));
		MAIN1D11_r1.cubeList.add(new ModelBox(MAIN1D11_r1, 64, 0, -1.0097F, -36.4171F, -23.9154F, 2, 2, 1, 0.0F, false));

		MAIN1D5_r1 = new ModelRenderer(this);
		MAIN1D5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D5_r1);
		setRotationAngle(MAIN1D5_r1, 0.0F, 0.0F, 0.5585F);
		MAIN1D5_r1.cubeList.add(new ModelBox(MAIN1D5_r1, 76, 17, -10.6516F, -12.3103F, -55.5F, 1, 2, 14, 0.0F, false));

		MAIN1D4_r1 = new ModelRenderer(this);
		MAIN1D4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D4_r1);
		setRotationAngle(MAIN1D4_r1, 0.0F, 0.0F, 0.9948F);
		MAIN1D4_r1.cubeList.add(new ModelBox(MAIN1D4_r1, 0, 102, -12.1328F, -10.8491F, -55.5F, 2, 1, 14, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0023F, 0.236F, 4.5056F);
		gun.addChild(trigger);
		trigger.cubeList.add(new ModelBox(trigger, 35, 45, -1.0097F, -13.5843F, -37.0F, 2, 2, 1, 0.0F, false));

		MAIN1D13TRIGGR_r1 = new ModelRenderer(this);
		MAIN1D13TRIGGR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger.addChild(MAIN1D13TRIGGR_r1);
		setRotationAngle(MAIN1D13TRIGGR_r1, -0.3665F, 0.0F, 0.0F);
		MAIN1D13TRIGGR_r1.cubeList.add(new ModelBox(MAIN1D13TRIGGR_r1, 43, 29, -1.0097F, 2.1283F, -38.7079F, 2, 2, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0023F, 0.236F, 4.5056F);
		gun.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 20, 70, -4.0097F, -21.5843F, -39.5F, 8, 8, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5097F, -22.1026F, -12.7571F, 7, 8, 17, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 85, -1.5097F, -24.1026F, -13.7571F, 3, 2, 13, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 52, 103, -3.4097F, -14.5574F, -25.3216F, 7, 4, 34, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 112, 0, -3.5097F, -17.2574F, -23.5216F, 7, 4, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 52, 103, -4.0097F, -27.5843F, 8.5F, 8, 17, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 100, 103, -3.5097F, -27.5843F, 3.7F, 7, 13, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 9, -3.0097F, -9.6843F, -24.5F, 6, 2, 2, 0.0F, false));

		MAIN1D30GRIP_r1 = new ModelRenderer(this);
		MAIN1D30GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D30GRIP_r1);
		setRotationAngle(MAIN1D30GRIP_r1, -0.7873F, 0.0F, 0.0F);
		MAIN1D30GRIP_r1.cubeList.add(new ModelBox(MAIN1D30GRIP_r1, 112, 9, -3.0097F, 5.5448F, -25.3883F, 6, 5, 4, 0.0F, false));

		MAIN1D30GRIP_r2 = new ModelRenderer(this);
		MAIN1D30GRIP_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D30GRIP_r2);
		setRotationAngle(MAIN1D30GRIP_r2, -0.5691F, 0.0F, 0.0F);
		MAIN1D30GRIP_r2.cubeList.add(new ModelBox(MAIN1D30GRIP_r2, 56, 86, -3.0097F, 4.7089F, -35.8235F, 6, 2, 11, 0.0F, false));

		MAIN1D28GRIP_r1 = new ModelRenderer(this);
		MAIN1D28GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D28GRIP_r1);
		setRotationAngle(MAIN1D28GRIP_r1, 0.5847F, 0.0F, 0.0F);
		MAIN1D28GRIP_r1.cubeList.add(new ModelBox(MAIN1D28GRIP_r1, 31, 0, -1.5097F, -21.1559F, 11.2393F, 3, 5, 6, 0.0F, false));

		MAIN1D28GRIP_r2 = new ModelRenderer(this);
		MAIN1D28GRIP_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D28GRIP_r2);
		setRotationAngle(MAIN1D28GRIP_r2, 0.8901F, 0.0F, 0.0F);
		MAIN1D28GRIP_r2.cubeList.add(new ModelBox(MAIN1D28GRIP_r2, 18, 102, -3.4097F, -14.4333F, 16.7343F, 7, 5, 7, 0.0F, false));

		MAIN1D25GRIP_r1 = new ModelRenderer(this);
		MAIN1D25GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r1);
		setRotationAngle(MAIN1D25GRIP_r1, 0.7854F, 0.0F, 0.0F);
		MAIN1D25GRIP_r1.cubeList.add(new ModelBox(MAIN1D25GRIP_r1, 30, 25, -1.5097F, -28.3327F, -4.3344F, 3, 6, 7, 0.0F, false));
		MAIN1D25GRIP_r1.cubeList.add(new ModelBox(MAIN1D25GRIP_r1, 79, 86, -3.5097F, -26.3327F, -3.1344F, 7, 6, 5, 0.0F, false));

		MAIN1D25GRIP_r2 = new ModelRenderer(this);
		MAIN1D25GRIP_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r2);
		setRotationAngle(MAIN1D25GRIP_r2, 0.4363F, 0.0F, 0.0F);
		MAIN1D25GRIP_r2.cubeList.add(new ModelBox(MAIN1D25GRIP_r2, 0, 0, -1.5097F, -27.5611F, -7.139F, 3, 7, 5, 0.0F, false));
		MAIN1D25GRIP_r2.cubeList.add(new ModelBox(MAIN1D25GRIP_r2, 26, 51, -3.4097F, -25.3611F, -7.139F, 7, 7, 5, 0.0F, false));

		MAIN1D25GRIP_r3 = new ModelRenderer(this);
		MAIN1D25GRIP_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r3);
		setRotationAngle(MAIN1D25GRIP_r3, 0.0F, 0.0F, -0.7854F);
		MAIN1D25GRIP_r3.cubeList.add(new ModelBox(MAIN1D25GRIP_r3, 56, 15, 13.0887F, -18.1095F, -13.7571F, 3, 2, 14, 0.0F, false));

		MAIN1D25GRIP_r4 = new ModelRenderer(this);
		MAIN1D25GRIP_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r4);
		setRotationAngle(MAIN1D25GRIP_r4, 0.0F, 0.0F, 0.7854F);
		MAIN1D25GRIP_r4.cubeList.add(new ModelBox(MAIN1D25GRIP_r4, 56, 31, -16.1095F, -18.0887F, -12.7571F, 3, 2, 14, 0.0F, false));

		MAIN1D19GRIP_r1 = new ModelRenderer(this);
		MAIN1D19GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D19GRIP_r1);
		setRotationAngle(MAIN1D19GRIP_r1, -0.3927F, 0.0F, 0.0F);
		MAIN1D19GRIP_r1.cubeList.add(new ModelBox(MAIN1D19GRIP_r1, 0, 51, -3.5097F, -7.0376F, -39.0516F, 7, 7, 12, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}