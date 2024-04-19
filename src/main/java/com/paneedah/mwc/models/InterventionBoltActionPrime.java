package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionBoltActionPrime extends ModelWithAttachments {
	private final ModelRenderer boltprime;
	private final ModelRenderer BoltAction12_r1_r1;
	private final ModelRenderer BoltAction14_r1_r1;
	private final ModelRenderer BoltAction28_r1_r1;
	private final ModelRenderer BoltAction30_r1_r1;
	private final ModelRenderer BoltAction39_r1_r1;

	public InterventionBoltActionPrime() {
		textureWidth = 512;
		textureHeight = 512;

		boltprime = new ModelRenderer(this);
		boltprime.setRotationPoint(-1.1923F, -18.478F, 3.5F);
		boltprime.cubeList.add(new ModelBox(boltprime, 76, 19, 2.1923F, -3.022F, 3.5F, 1, 4, 3, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 19, 69, 0.6923F, -1.522F, 3.5F, 4, 1, 3, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 159, 69, 0.4923F, -1.522F, 6.5F, 1, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 159, 64, 3.8923F, -1.522F, 6.5F, 1, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 159, 62, 2.1923F, -3.222F, 6.5F, 1, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 159, 60, 2.1923F, 0.178F, 6.5F, 1, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 66, 32, 1.6923F, -2.722F, 6.5F, 2, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 45, 19, 0.9923F, -2.022F, 6.5F, 1, 2, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 65, 45, 1.6923F, -0.322F, 6.5F, 2, 1, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 45, 0, 3.3923F, -2.022F, 6.5F, 1, 2, 1, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 203, 75, 2.1923F, -4.022F, 3.5F, 1, 1, 3, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 41, 203, 2.3923F, -3.822F, 3.48F, 1, 1, 3, 0.0F, false));
		boltprime.cubeList.add(new ModelBox(boltprime, 0, 203, 1.9923F, -3.822F, 3.48F, 1, 1, 3, 0.0F, false));

		BoltAction12_r1_r1 = new ModelRenderer(this);
		BoltAction12_r1_r1.setRotationPoint(-29.1935F, 30.8795F, -3.5F);
		boltprime.addChild(BoltAction12_r1_r1);
		setRotationAngle(BoltAction12_r1_r1, 0.0F, 0.0F, 0.7854F);
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 77, 66, -1.2133F, -47.0136F, 10.0F, 2, 1, 1, 0.0F, false));
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 0, 58, -1.9204F, -46.3065F, 10.0F, 1, 2, 1, 0.0F, false));
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 54, 19, -1.779F, -46.1651F, 7.0F, 1, 2, 3, 0.0F, false));
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 124, 57, -1.0719F, -46.8743F, 7.0F, 2, 1, 3, 0.0F, false));

		BoltAction14_r1_r1 = new ModelRenderer(this);
		BoltAction14_r1_r1.setRotationPoint(29.1932F, -30.8797F, -3.5F);
		boltprime.addChild(BoltAction14_r1_r1);
		setRotationAngle(BoltAction14_r1_r1, 0.0F, 0.0F, -2.3562F);
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 158, 58, -3.5754F, -41.7608F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 159, 48, -4.2826F, -41.0537F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 90, 54, -3.434F, -41.6194F, 7.0F, 2, 1, 3, 0.0F, false));
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 54, 0, -4.15F, -40.9123F, 7.0F, 1, 2, 3, 0.0F, false));

		BoltAction28_r1_r1 = new ModelRenderer(this);
		BoltAction28_r1_r1.setRotationPoint(30.8796F, 29.1933F, -3.5F);
		boltprime.addChild(BoltAction28_r1_r1);
		setRotationAngle(BoltAction28_r1_r1, 0.0F, 0.0F, -0.7854F);
		BoltAction28_r1_r1.cubeList.add(new ModelBox(BoltAction28_r1_r1, 56, 41, -0.4751F, -42.499F, 10.0F, 1, 2, 1, 0.0F, false));
		BoltAction28_r1_r1.cubeList.add(new ModelBox(BoltAction28_r1_r1, 158, 53, 0.232F, -43.2061F, 10.0F, 1, 1, 1, -0.001F, false));
		BoltAction28_r1_r1.cubeList.add(new ModelBox(BoltAction28_r1_r1, 109, 153, 0.3734F, -43.0539F, 7.0F, 1, 1, 3, 0.0F, false));
		BoltAction28_r1_r1.cubeList.add(new ModelBox(BoltAction28_r1_r1, 98, 153, -0.3337F, -42.3576F, 7.0F, 1, 1, 3, 0.0F, false));

		BoltAction30_r1_r1 = new ModelRenderer(this);
		BoltAction30_r1_r1.setRotationPoint(-30.8794F, -29.1936F, -3.5F);
		boltprime.addChild(BoltAction30_r1_r1);
		setRotationAngle(BoltAction30_r1_r1, 0.0F, 0.0F, 2.3562F);
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 157, 32, -4.5258F, -42.9561F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 157, 34, -4.5258F, -45.3561F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 157, 36, -5.5323F, -44.2126F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 157, 44, -3.1116F, -43.9419F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 77, 45, -5.0208F, -45.5682F, 10.0F, 2, 1, 1, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 158, 51, -5.7279F, -44.8611F, 10.0F, 1, 1, 1, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 131, 0, -5.5865F, -44.7197F, 7.0F, 1, 1, 3, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 119, 110, -4.8793F, -45.4268F, 7.0F, 1, 1, 3, 0.0F, false));

		BoltAction39_r1_r1 = new ModelRenderer(this);
		BoltAction39_r1_r1.setRotationPoint(23.4925F, 35.4105F, -3.5F);
		boltprime.addChild(BoltAction39_r1_r1);
		setRotationAngle(BoltAction39_r1_r1, 0.0F, 0.0F, -0.5577F);
		BoltAction39_r1_r1.cubeList.add(new ModelBox(BoltAction39_r1_r1, 63, 197, -8.283F, -42.8141F, 7.5F, 3, 2, 2, 0.0F, false));
		BoltAction39_r1_r1.cubeList.add(new ModelBox(BoltAction39_r1_r1, 0, 21, -5.283F, -42.3141F, 7.8F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1_r1.cubeList.add(new ModelBox(BoltAction39_r1_r1, 25, 21, -5.283F, -42.3141F, 8.2F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1_r1.cubeList.add(new ModelBox(BoltAction39_r1_r1, 90, 60, -5.283F, -42.0141F, 8.0F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1_r1.cubeList.add(new ModelBox(BoltAction39_r1_r1, 0, 93, -5.283F, -42.6141F, 8.0F, 4, 1, 1, 0.0F, false));
		BoltAction39_r1_r1.cubeList.add(new ModelBox(BoltAction39_r1_r1, 44, 222, -1.283F, -42.9141F, 7.0F, 2, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltprime.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
