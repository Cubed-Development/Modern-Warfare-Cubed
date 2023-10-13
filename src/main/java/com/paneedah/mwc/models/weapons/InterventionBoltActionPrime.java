package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionBoltActionPrime extends ModelWithAttachments {
	private final ModelRenderer boltaction;
	private final ModelRenderer BoltAction30_r1;
	private final ModelRenderer BoltAction28_r1;
	private final ModelRenderer BoltAction14_r1;
	private final ModelRenderer BoltAction12_r1;
	private final ModelRenderer BoltAction5_r1;
	private final ModelRenderer BoltAction3_r1;
	private final ModelRenderer boltprime;
	private final ModelRenderer BoltAction39_r1;

	public InterventionBoltActionPrime() {
		textureWidth = 512;
		textureHeight = 512;

		boltaction = new ModelRenderer(this);
		boltaction.setRotationPoint(0.8595F, -19.2376F, 6.4487F);
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 203, -1.3595F, -0.7624F, -23.4487F, 4, 1, 24, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 19, 58, 0.1405F, -2.2624F, -25.5487F, 1, 4, 7, 0.25F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 37, 106, -1.3595F, -0.7624F, -25.5487F, 4, 1, 7, 0.25F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 76, 19, 0.1405F, -2.2624F, 0.5513F, 1, 4, 3, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 19, 69, -1.3595F, -0.7624F, 0.5513F, 4, 1, 3, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 32, 115, 0.1405F, -2.2624F, -23.4487F, 1, 4, 24, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 159, 69, -1.5595F, -0.7624F, 3.5513F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 159, 64, 1.8405F, -0.7624F, 3.5513F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 159, 62, 0.1405F, -2.4624F, 3.5513F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 159, 60, 0.1405F, 0.9376F, 3.5513F, 1, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 66, 32, -0.3595F, -1.9624F, 3.5513F, 2, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 45, 19, -1.0595F, -1.2624F, 3.5513F, 1, 2, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 65, 45, -0.3595F, 0.4376F, 3.5513F, 2, 1, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 45, 0, 1.3405F, -1.2624F, 3.5513F, 1, 2, 1, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 203, 75, 0.1405F, -3.2624F, 0.5513F, 1, 1, 3, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 41, 203, 0.3405F, -3.0624F, 0.5313F, 1, 1, 3, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 203, -0.0595F, -3.0624F, 0.5313F, 1, 1, 3, 0.0F, false));

		BoltAction30_r1 = new ModelRenderer(this);
		BoltAction30_r1.setRotationPoint(-2.0518F, 0.7596F, -2.9487F);
		boltaction.addChild(BoltAction30_r1);
		setRotationAngle(BoltAction30_r1, 0.0F, 0.0F, 2.3562F);
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 248, 176, -3.687F, -2.9488F, -20.5F, 1, 1, 24, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 248, 225, -4.3942F, -2.2417F, -20.5F, 1, 1, 24, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 157, 32, -3.3335F, -0.4781F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 157, 34, -3.3335F, -2.8781F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 157, 36, -4.34F, -1.7346F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 157, 44, -1.9193F, -1.4639F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 77, 45, -3.8285F, -3.0902F, 6.5F, 2, 1, 1, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 158, 51, -4.5356F, -2.3831F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 131, 0, -4.3942F, -2.2417F, 3.5F, 1, 1, 3, 0.0F, false));
		BoltAction30_r1.cubeList.add(new ModelBox(BoltAction30_r1, 119, 110, -3.687F, -2.9488F, 3.5F, 1, 1, 3, 0.0F, false));

		BoltAction28_r1 = new ModelRenderer(this);
		BoltAction28_r1.setRotationPoint(-2.0518F, 0.7596F, -2.9487F);
		boltaction.addChild(BoltAction28_r1);
		setRotationAngle(BoltAction28_r1, 0.0F, 0.0F, -0.7854F);
		BoltAction28_r1.cubeList.add(new ModelBox(BoltAction28_r1, 248, 250, 0.8586F, 0.1204F, -20.5F, 1, 1, 24, 0.0F, false));
		BoltAction28_r1.cubeList.add(new ModelBox(BoltAction28_r1, 268, 109, 1.5657F, -0.5759F, -20.5F, 1, 1, 24, 0.0F, false));
		BoltAction28_r1.cubeList.add(new ModelBox(BoltAction28_r1, 56, 41, 0.7172F, -0.021F, 6.5F, 1, 2, 1, 0.0F, false));
		BoltAction28_r1.cubeList.add(new ModelBox(BoltAction28_r1, 158, 53, 1.4243F, -0.7281F, 6.5F, 1, 1, 1, -0.001F, false));
		BoltAction28_r1.cubeList.add(new ModelBox(BoltAction28_r1, 109, 153, 1.5657F, -0.5759F, 3.5F, 1, 1, 3, 0.0F, false));
		BoltAction28_r1.cubeList.add(new ModelBox(BoltAction28_r1, 98, 153, 0.8586F, 0.1204F, 3.5F, 1, 1, 3, 0.0F, false));

		BoltAction14_r1 = new ModelRenderer(this);
		BoltAction14_r1.setRotationPoint(-2.0518F, 0.7596F, -2.9487F);
		boltaction.addChild(BoltAction14_r1);
		setRotationAngle(BoltAction14_r1, 0.0F, 0.0F, -2.3562F);
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 158, 58, -2.3831F, 0.7172F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 159, 48, -3.0903F, 1.4243F, 6.5F, 1, 1, 1, 0.0F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 0, 247, -2.9577F, 1.5657F, -20.5F, 1, 2, 24, 0.0F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 230, 0, -2.2417F, 0.8586F, -20.5F, 2, 1, 24, -0.001F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 90, 54, -2.2417F, 0.8586F, 3.5F, 2, 1, 3, 0.0F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 54, 0, -2.9577F, 1.5657F, 3.5F, 1, 2, 3, 0.0F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 134, 160, -2.0417F, 0.7586F, -22.6F, 1, 1, 7, 0.25F, false));
		BoltAction14_r1.cubeList.add(new ModelBox(BoltAction14_r1, 162, 150, -1.3417F, 0.7586F, -22.6F, 1, 1, 7, 0.25F, false));

		BoltAction12_r1 = new ModelRenderer(this);
		BoltAction12_r1.setRotationPoint(-2.0518F, 0.7596F, -2.9487F);
		boltaction.addChild(BoltAction12_r1);
		setRotationAngle(BoltAction12_r1, 0.0F, 0.0F, 0.7854F);
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 77, 66, -0.021F, -4.5356F, 6.5F, 2, 1, 1, 0.0F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 0, 58, -0.7281F, -3.8285F, 6.5F, 1, 2, 1, 0.0F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 230, 25, 0.1204F, -4.3963F, -20.5F, 2, 1, 24, 0.0F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 248, 150, -0.5867F, -3.6871F, -20.5F, 1, 2, 24, 0.0F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 54, 19, -0.5867F, -3.6871F, 3.5F, 1, 2, 3, 0.0F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 124, 57, 0.1204F, -4.3963F, 3.5F, 2, 1, 3, 0.0F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 150, 160, -0.6867F, -3.392F, -22.6F, 1, 1, 7, 0.25F, false));
		BoltAction12_r1.cubeList.add(new ModelBox(BoltAction12_r1, 171, 151, -0.6867F, -2.7871F, -22.6F, 1, 1, 7, 0.24F, false));

		BoltAction5_r1 = new ModelRenderer(this);
		BoltAction5_r1.setRotationPoint(3.3328F, 0.7596F, -4.0487F);
		boltaction.addChild(BoltAction5_r1);
		setRotationAngle(BoltAction5_r1, 0.0F, 0.0F, 2.3562F);
		BoltAction5_r1.cubeList.add(new ModelBox(BoltAction5_r1, 118, 160, 1.0417F, 0.7586F, -21.5F, 1, 1, 7, 0.25F, false));
		BoltAction5_r1.cubeList.add(new ModelBox(BoltAction5_r1, 102, 160, 0.3417F, 0.7586F, -21.5F, 1, 1, 7, 0.25F, false));

		BoltAction3_r1 = new ModelRenderer(this);
		BoltAction3_r1.setRotationPoint(3.3328F, 0.7596F, -4.0487F);
		boltaction.addChild(BoltAction3_r1);
		setRotationAngle(BoltAction3_r1, 0.0F, 0.0F, -0.7854F);
		BoltAction3_r1.cubeList.add(new ModelBox(BoltAction3_r1, 86, 160, -0.3133F, -3.392F, -21.5F, 1, 1, 7, 0.25F, false));
		BoltAction3_r1.cubeList.add(new ModelBox(BoltAction3_r1, 63, 160, -0.3133F, -2.7871F, -21.5F, 1, 1, 7, 0.24F, false));

		boltprime = new ModelRenderer(this);
		boltprime.setRotationPoint(-1.1923F, -18.478F, 3.5F);
		

		BoltAction39_r1 = new ModelRenderer(this);
		BoltAction39_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		boltprime.addChild(BoltAction39_r1);
		setRotationAngle(BoltAction39_r1, 0.0F, 0.0F, -0.5577F);
		BoltAction39_r1.cubeList.add(new ModelBox(BoltAction39_r1, 63, 197, -7.0907F, -0.3361F, 4.0F, 3, 2, 2, 0.0F, false));
		BoltAction39_r1.cubeList.add(new ModelBox(BoltAction39_r1, 0, 21, -4.0907F, 0.1639F, 4.3F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1.cubeList.add(new ModelBox(BoltAction39_r1, 25, 21, -4.0907F, 0.1639F, 4.7F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1.cubeList.add(new ModelBox(BoltAction39_r1, 90, 60, -4.0907F, 0.4639F, 4.5F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1.cubeList.add(new ModelBox(BoltAction39_r1, 0, 93, -4.0907F, -0.1361F, 4.5F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1.cubeList.add(new ModelBox(BoltAction39_r1, 44, 222, -0.0907F, -0.4361F, 3.5F, 2, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
		boltprime.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}