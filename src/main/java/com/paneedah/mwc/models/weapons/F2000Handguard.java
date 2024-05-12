package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class F2000Handguard extends ModelWithAttachments {
	private final ModelRenderer bone3;
	private final ModelRenderer handguard;
	private final ModelRenderer cube_r1;
	private final ModelRenderer gun27_r1_r1;
	private final ModelRenderer gun76_r1_r1;
	private final ModelRenderer gun81_r1_r1;
	private final ModelRenderer gun2_r1_r1;
	private final ModelRenderer gun5_r1_r1;
	private final ModelRenderer gun22_r1_r1;
	private final ModelRenderer gun23_r1_r1;
	private final ModelRenderer gun24_r1_r1;
	private final ModelRenderer gun29_r1_r1;
	private final ModelRenderer gun34_r1_r1;
	private final ModelRenderer gun40_r1_r1;
	private final ModelRenderer gun77_r1_r1;
	private final ModelRenderer gun78_r1_r1;
	private final ModelRenderer gun82_r1_r1;
	private final ModelRenderer gun83_r1_r1;

	public F2000Handguard() {
		textureWidth = 290;
		textureHeight = 290;

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(0.0F, 0.1415F, 0.0773F);
		bone3.addChild(handguard);
		handguard.cubeList.add(new ModelBox(handguard, 0, 32, -1.45F, -30.5415F, -30.7773F, 3, 3, 12, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 142, 116, -1.9F, -27.5415F, -25.4773F, 3, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 39, -1.9F, -26.5415F, -18.4773F, 1, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 142, 108, -1.1F, -27.5415F, -25.4773F, 3, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 53, 21, -1.1F, -27.5415F, -18.4773F, 3, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 142, 100, -1.1F, -26.5415F, -25.4773F, 3, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 18, 40, -1.1F, -26.5415F, -18.4773F, 3, 1, 3, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 33, 93, -1.9F, -26.5415F, -25.4773F, 1, 1, 7, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 60, -1.9F, -30.1415F, -31.2773F, 3, 1, 1, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 122, 37, -1.5F, -30.5415F, -18.5773F, 3, 3, 2, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 16, -1.5F, -31.5415F, -31.8773F, 3, 2, 12, 0.0F, false));
		handguard.cubeList.add(new ModelBox(handguard, 0, 0, -1.5F, -31.5415F, -29.8773F, 3, 4, 12, -0.001F, false));
		handguard.cubeList.add(new ModelBox(handguard, 50, 54, -1.1F, -30.1415F, -31.2773F, 3, 1, 1, -0.0015F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(2.1F, -22.5415F, 17.1227F);
		handguard.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7418F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 79, -0.95F, -26.0F, -22.1F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 79, 3, -0.95F, -32.0F, -29.1F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 35, -4.25F, -32.0F, -29.1F, 1, 1, 1, -0.2F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 72, 22, -4.3F, -28.0F, -24.6F, 1, 1, 1, -0.2F, false));

		gun27_r1_r1 = new ModelRenderer(this);
		gun27_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		handguard.addChild(gun27_r1_r1);
		setRotationAngle(gun27_r1_r1, 0.0873F, 0.0F, 0.0F);
		gun27_r1_r1.cubeList.add(new ModelBox(gun27_r1_r1, 52, 78, -1.1F, -27.7984F, -13.2046F, 3, 1, 4, 0.0F, false));
		gun27_r1_r1.cubeList.add(new ModelBox(gun27_r1_r1, 51, 8, -1.9F, -27.7984F, -13.2046F, 1, 1, 4, 0.0F, false));

		gun76_r1_r1 = new ModelRenderer(this);
		gun76_r1_r1.setRotationPoint(56.174F, -67.2941F, -0.0773F);
		handguard.addChild(gun76_r1_r1);
		setRotationAngle(gun76_r1_r1, 0.0F, 0.0F, -2.5281F);
		gun76_r1_r1.cubeList.add(new ModelBox(gun76_r1_r1, 50, 44, 23.482F, -60.7492F, -32.4F, 1, 1, 7, 0.0F, false));
		gun76_r1_r1.cubeList.add(new ModelBox(gun76_r1_r1, 131, 143, 23.482F, -61.7492F, -31.4F, 1, 1, 15, 0.0F, false));
		gun76_r1_r1.cubeList.add(new ModelBox(gun76_r1_r1, 72, 19, 23.482F, -61.2492F, -26.4F, 1, 1, 5, 0.0F, false));

		gun81_r1_r1 = new ModelRenderer(this);
		gun81_r1_r1.setRotationPoint(-56.174F, -67.2941F, -0.0773F);
		handguard.addChild(gun81_r1_r1);
		setRotationAngle(gun81_r1_r1, 0.0F, 0.0F, 2.5281F);
		gun81_r1_r1.cubeList.add(new ModelBox(gun81_r1_r1, 14, 70, -24.482F, -60.7492F, -32.4F, 1, 1, 7, 0.0F, false));
		gun81_r1_r1.cubeList.add(new ModelBox(gun81_r1_r1, 144, 0, -24.482F, -61.7492F, -31.4F, 1, 1, 15, 0.0F, false));
		gun81_r1_r1.cubeList.add(new ModelBox(gun81_r1_r1, 72, 32, -24.482F, -61.2492F, -26.4F, 1, 1, 5, 0.0F, false));

		gun2_r1_r1 = new ModelRenderer(this);
		gun2_r1_r1.setRotationPoint(0.0F, -62.6755F, 28.9461F);
		handguard.addChild(gun2_r1_r1);
		setRotationAngle(gun2_r1_r1, 2.2864F, 0.0F, 0.0F);
		gun2_r1_r1.cubeList.add(new ModelBox(gun2_r1_r1, 18, 8, -1.5F, -57.5706F, 1.6383F, 3, 1, 3, -0.001F, false));

		gun5_r1_r1 = new ModelRenderer(this);
		gun5_r1_r1.setRotationPoint(0.0F, 11.9701F, -4.1321F);
		handguard.addChild(gun5_r1_r1);
		setRotationAngle(gun5_r1_r1, -0.6981F, 0.0F, 0.0F);
		gun5_r1_r1.cubeList.add(new ModelBox(gun5_r1_r1, 86, 20, -1.5F, -25.7777F, -38.5282F, 3, 3, 2, 0.0F, false));

		gun22_r1_r1 = new ModelRenderer(this);
		gun22_r1_r1.setRotationPoint(0.0F, 0.983F, 0.7156F);
		handguard.addChild(gun22_r1_r1);
		setRotationAngle(gun22_r1_r1, -0.2094F, 0.0F, 0.0F);
		gun22_r1_r1.cubeList.add(new ModelBox(gun22_r1_r1, 72, 92, -1.9F, -22.4569F, -36.3563F, 3, 1, 5, -0.0015F, false));

		gun23_r1_r1 = new ModelRenderer(this);
		gun23_r1_r1.setRotationPoint(0.0F, 1.8394F, 11.3283F);
		handguard.addChild(gun23_r1_r1);
		setRotationAngle(gun23_r1_r1, 0.576F, 0.0F, 0.0F);
		gun23_r1_r1.cubeList.add(new ModelBox(gun23_r1_r1, 23, 70, -1.9F, -52.3438F, -19.3116F, 1, 6, 1, 0.0F, false));
		gun23_r1_r1.cubeList.add(new ModelBox(gun23_r1_r1, 72, 72, -1.1F, -52.3438F, -19.3116F, 3, 6, 1, 0.0F, false));

		gun24_r1_r1 = new ModelRenderer(this);
		gun24_r1_r1.setRotationPoint(0.0F, 6.7685F, 2.3468F);
		handguard.addChild(gun24_r1_r1);
		setRotationAngle(gun24_r1_r1, -0.4887F, 0.0F, 0.0F);
		gun24_r1_r1.cubeList.add(new ModelBox(gun24_r1_r1, 18, 24, -1.1F, -15.778F, -45.112F, 3, 1, 3, -0.0027F, false));

		gun29_r1_r1 = new ModelRenderer(this);
		gun29_r1_r1.setRotationPoint(0.0F, 0.9394F, 0.7204F);
		handguard.addChild(gun29_r1_r1);
		setRotationAngle(gun29_r1_r1, -0.2094F, 0.0F, 0.0F);
		gun29_r1_r1.cubeList.add(new ModelBox(gun29_r1_r1, 46, 93, -1.1F, -21.4559F, -36.0462F, 3, 1, 5, 0.0F, false));
		gun29_r1_r1.cubeList.add(new ModelBox(gun29_r1_r1, 83, 93, -1.9F, -21.4559F, -36.0462F, 1, 1, 5, -0.001F, false));

		gun34_r1_r1 = new ModelRenderer(this);
		gun34_r1_r1.setRotationPoint(0.0F, 17.7642F, 1.004F);
		handguard.addChild(gun34_r1_r1);
		setRotationAngle(gun34_r1_r1, -0.7505F, 0.0F, 0.0F);
		gun34_r1_r1.cubeList.add(new ModelBox(gun34_r1_r1, 0, 40, -1.9F, -13.02F, -56.2807F, 3, 1, 3, -0.002F, false));

		gun40_r1_r1 = new ModelRenderer(this);
		gun40_r1_r1.setRotationPoint(0.0F, 6.1016F, 2.1025F);
		handguard.addChild(gun40_r1_r1);
		setRotationAngle(gun40_r1_r1, -0.4538F, 0.0F, 0.0F);
		gun40_r1_r1.cubeList.add(new ModelBox(gun40_r1_r1, 48, 148, -1.9F, -18.3804F, -44.9908F, 3, 2, 6, -0.002F, false));
		gun40_r1_r1.cubeList.add(new ModelBox(gun40_r1_r1, 0, 158, -1.1F, -18.3804F, -44.9908F, 3, 2, 6, -0.0015F, false));

		gun77_r1_r1 = new ModelRenderer(this);
		gun77_r1_r1.setRotationPoint(57.639F, -22.5812F, -0.0773F);
		handguard.addChild(gun77_r1_r1);
		setRotationAngle(gun77_r1_r1, 0.0F, 0.0F, -1.8589F);
		gun77_r1_r1.cubeList.add(new ModelBox(gun77_r1_r1, 68, 161, 23.1538F, -54.7487F, -23.6F, 2, 1, 7, 0.0F, false));

		gun78_r1_r1 = new ModelRenderer(this);
		gun78_r1_r1.setRotationPoint(-59.2607F, -31.2067F, -0.0773F);
		handguard.addChild(gun78_r1_r1);
		setRotationAngle(gun78_r1_r1, 0.0F, 0.0F, 1.9705F);
		gun78_r1_r1.cubeList.add(new ModelBox(gun78_r1_r1, 72, 26, -23.7785F, -56.4572F, -26.6F, 2, 1, 3, 0.0F, false));

		gun82_r1_r1 = new ModelRenderer(this);
		gun82_r1_r1.setRotationPoint(-57.6389F, -22.5811F, -0.0773F);
		handguard.addChild(gun82_r1_r1);
		setRotationAngle(gun82_r1_r1, 0.0F, 0.0F, 1.8589F);
		gun82_r1_r1.cubeList.add(new ModelBox(gun82_r1_r1, 97, 162, -25.1538F, -54.7486F, -23.6F, 2, 1, 7, 0.0F, false));

		gun83_r1_r1 = new ModelRenderer(this);
		gun83_r1_r1.setRotationPoint(59.2606F, -31.2063F, -0.0773F);
		handguard.addChild(gun83_r1_r1);
		setRotationAngle(gun83_r1_r1, 0.0F, 0.0F, -1.9705F);
		gun83_r1_r1.cubeList.add(new ModelBox(gun83_r1_r1, 72, 62, 21.7786F, -56.457F, -26.6F, 2, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone3.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}