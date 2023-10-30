package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
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
		main.cubeList.add(new ModelBox(main, 112, 18, -3.5097F, -5.5843F, -17.5F, 7, 8, 2, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 56, 0, -3.5097F, 1.4157F, -31.5F, 7, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 76, 33, -2.5097F, 0.4157F, -31.5F, 1, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 47, -3.5097F, 1.4157F, -33.5F, 7, 1, 2, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 30, 25, -1.0097F, 2.4157F, -18.5F, 2, 4, 1, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 112, 43, -1.0097F, 6.9157F, -17.0F, 2, 1, 6, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 11, 0, -1.0097F, 2.4157F, -10.5F, 2, 4, 1, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 56, 7, -0.5097F, 3.4157F, -21.5F, 1, 1, 5, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 35, -2.0097F, -6.5843F, -17.5F, 4, 1, 4, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 56, 20, -1.5097F, -7.5843F, -13.5F, 3, 2, 3, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 0, -0.5097F, -2.5843F, -17.7F, 1, 1, 1, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 75, 52, 1.4903F, 0.4157F, -31.5F, 1, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 70, -1.5097F, 0.9157F, -31.5F, 3, 1, 14, 0.0F, false));
		main.cubeList.add(new ModelBox(main, 0, 44, -3.5097F, 1.4157F, -35.5F, 7, 1, 2, 0.0F, false));

		MAIN1D30SAFEGUARD_r1 = new ModelRenderer(this);
		MAIN1D30SAFEGUARD_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D30SAFEGUARD_r1);
		setRotationAngle(MAIN1D30SAFEGUARD_r1, -0.3316F, 0.0F, 0.0F);
		MAIN1D30SAFEGUARD_r1.cubeList.add(new ModelBox(MAIN1D30SAFEGUARD_r1, 73, 74, -1.0097F, -2.7798F, -8.2344F, 2, 1, 3, 0.0F, false));

		MAIN1D30SAFEGUARD_r2 = new ModelRenderer(this);
		MAIN1D30SAFEGUARD_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D30SAFEGUARD_r2);
		setRotationAngle(MAIN1D30SAFEGUARD_r2, 0.5411F, 0.0F, 0.0F);
		MAIN1D30SAFEGUARD_r2.cubeList.add(new ModelBox(MAIN1D30SAFEGUARD_r2, 75, 52, -1.0097F, -7.6152F, -3.7345F, 2, 2, 2, 0.0F, false));

		MAIN1D17_r1 = new ModelRenderer(this);
		MAIN1D17_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D17_r1);
		setRotationAngle(MAIN1D17_r1, -0.1571F, 0.0F, 0.0F);
		MAIN1D17_r1.cubeList.add(new ModelBox(MAIN1D17_r1, 75, 56, -0.5097F, -5.0804F, -11.8237F, 1, 1, 3, 0.0F, false));

		MAIN1D11_r1 = new ModelRenderer(this);
		MAIN1D11_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D11_r1);
		setRotationAngle(MAIN1D11_r1, 0.7679F, 0.0F, 0.0F);
		MAIN1D11_r1.cubeList.add(new ModelBox(MAIN1D11_r1, 75, 63, -1.0097F, -2.8675F, -13.3568F, 2, 1, 2, 0.0F, false));
		MAIN1D11_r1.cubeList.add(new ModelBox(MAIN1D11_r1, 64, 0, -1.0097F, -8.2361F, -17.7645F, 2, 2, 1, 0.0F, false));

		MAIN1D5_r1 = new ModelRenderer(this);
		MAIN1D5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D5_r1);
		setRotationAngle(MAIN1D5_r1, 0.0F, 0.0F, 0.5585F);
		MAIN1D5_r1.cubeList.add(new ModelBox(MAIN1D5_r1, 76, 17, -2.173F, 1.2585F, -31.5F, 1, 2, 14, 0.0F, false));

		MAIN1D4_r1 = new ModelRenderer(this);
		MAIN1D4_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		main.addChild(MAIN1D4_r1);
		setRotationAngle(MAIN1D4_r1, 0.0F, 0.0F, 0.9948F);
		MAIN1D4_r1.cubeList.add(new ModelBox(MAIN1D4_r1, 0, 102, 1.2856F, -2.1344F, -31.5F, 2, 1, 14, 0.0F, false));

		trigger = new ModelRenderer(this);
		trigger.setRotationPoint(0.0023F, 0.236F, 4.5056F);
		gun.addChild(trigger);
		trigger.cubeList.add(new ModelBox(trigger, 35, 45, -1.0097F, 2.4157F, -13.0F, 2, 2, 1, 0.0F, false));

		MAIN1D13TRIGGR_r1 = new ModelRenderer(this);
		MAIN1D13TRIGGR_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		trigger.addChild(MAIN1D13TRIGGR_r1);
		setRotationAngle(MAIN1D13TRIGGR_r1, -0.3665F, 0.0F, 0.0F);
		MAIN1D13TRIGGR_r1.cubeList.add(new ModelBox(MAIN1D13TRIGGR_r1, 43, 29, -1.0097F, 8.4653F, -10.5682F, 2, 2, 1, 0.0F, false));

		grip = new ModelRenderer(this);
		grip.setRotationPoint(0.0023F, 0.236F, 4.5056F);
		gun.addChild(grip);
		grip.cubeList.add(new ModelBox(grip, 20, 70, -4.0097F, -5.5843F, -15.5F, 8, 8, 6, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 0, 0, -3.5097F, -6.1026F, 11.2429F, 7, 8, 17, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 17, 85, -1.5097F, -8.1026F, 10.2429F, 3, 2, 13, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 52, 103, -3.4097F, 1.4426F, -1.3216F, 7, 4, 34, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 112, 0, -3.5097F, -1.2574F, 0.4784F, 7, 4, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 52, 103, -4.0097F, -11.5843F, 32.5F, 8, 17, 4, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 100, 103, -3.5097F, -11.5843F, 27.7F, 7, 13, 5, 0.0F, false));
		grip.cubeList.add(new ModelBox(grip, 84, 9, -3.0097F, 6.3157F, -0.5F, 6, 2, 2, 0.0F, false));

		MAIN1D30GRIP_r1 = new ModelRenderer(this);
		MAIN1D30GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D30GRIP_r1);
		setRotationAngle(MAIN1D30GRIP_r1, -0.7873F, 0.0F, 0.0F);
		MAIN1D30GRIP_r1.cubeList.add(new ModelBox(MAIN1D30GRIP_r1, 112, 9, -3.0097F, -0.1658F, 2.8852F, 6, 5, 4, 0.0F, false));

		MAIN1D30GRIP_r2 = new ModelRenderer(this);
		MAIN1D30GRIP_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D30GRIP_r2);
		setRotationAngle(MAIN1D30GRIP_r2, -0.5691F, 0.0F, 0.0F);
		MAIN1D30GRIP_r2.cubeList.add(new ModelBox(MAIN1D30GRIP_r2, 56, 86, -3.0097F, 5.2541F, -6.9842F, 6, 2, 11, 0.0F, false));

		MAIN1D28GRIP_r1 = new ModelRenderer(this);
		MAIN1D28GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D28GRIP_r1);
		setRotationAngle(MAIN1D28GRIP_r1, 0.5847F, 0.0F, 0.0F);
		MAIN1D28GRIP_r1.cubeList.add(new ModelBox(MAIN1D28GRIP_r1, 31, 0, -1.5097F, 5.4329F, 22.4212F, 3, 5, 6, 0.0F, false));

		MAIN1D28GRIP_r2 = new ModelRenderer(this);
		MAIN1D28GRIP_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D28GRIP_r2);
		setRotationAngle(MAIN1D28GRIP_r2, 0.8901F, 0.0F, 0.0F);
		MAIN1D28GRIP_r2.cubeList.add(new ModelBox(MAIN1D28GRIP_r2, 18, 102, -3.4097F, 14.2873F, 19.4042F, 7, 5, 7, 0.0F, false));

		MAIN1D25GRIP_r1 = new ModelRenderer(this);
		MAIN1D25GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r1);
		setRotationAngle(MAIN1D25GRIP_r1, 0.7854F, 0.0F, 0.0F);
		MAIN1D25GRIP_r1.cubeList.add(new ModelBox(MAIN1D25GRIP_r1, 30, 25, -1.5097F, -0.0484F, 1.3224F, 3, 6, 7, 0.0F, false));
		MAIN1D25GRIP_r1.cubeList.add(new ModelBox(MAIN1D25GRIP_r1, 79, 86, -3.5097F, 1.9516F, 2.5224F, 7, 6, 5, 0.0F, false));

		MAIN1D25GRIP_r2 = new ModelRenderer(this);
		MAIN1D25GRIP_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r2);
		setRotationAngle(MAIN1D25GRIP_r2, 0.4363F, 0.0F, 0.0F);
		MAIN1D25GRIP_r2.cubeList.add(new ModelBox(MAIN1D25GRIP_r2, 0, 0, -1.5097F, -2.9178F, 7.8513F, 3, 7, 5, 0.0F, false));
		MAIN1D25GRIP_r2.cubeList.add(new ModelBox(MAIN1D25GRIP_r2, 26, 51, -3.4097F, -0.7178F, 7.8513F, 7, 7, 5, 0.0F, false));

		MAIN1D25GRIP_r3 = new ModelRenderer(this);
		MAIN1D25GRIP_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r3);
		setRotationAngle(MAIN1D25GRIP_r3, 0.0F, 0.0F, -0.7854F);
		MAIN1D25GRIP_r3.cubeList.add(new ModelBox(MAIN1D25GRIP_r3, 56, 15, 1.775F, -6.7958F, 10.2429F, 3, 2, 14, 0.0F, false));

		MAIN1D25GRIP_r4 = new ModelRenderer(this);
		MAIN1D25GRIP_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D25GRIP_r4);
		setRotationAngle(MAIN1D25GRIP_r4, 0.0F, 0.0F, 0.7854F);
		MAIN1D25GRIP_r4.cubeList.add(new ModelBox(MAIN1D25GRIP_r4, 56, 31, -4.7958F, -6.775F, 11.2429F, 3, 2, 14, 0.0F, false));

		MAIN1D19GRIP_r1 = new ModelRenderer(this);
		MAIN1D19GRIP_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		grip.addChild(MAIN1D19GRIP_r1);
		setRotationAngle(MAIN1D19GRIP_r1, -0.3927F, 0.0F, 0.0F);
		MAIN1D19GRIP_r1.cubeList.add(new ModelBox(MAIN1D19GRIP_r1, 0, 51, -3.5097F, -1.44F, -10.7556F, 7, 7, 12, 0.0F, false));
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
