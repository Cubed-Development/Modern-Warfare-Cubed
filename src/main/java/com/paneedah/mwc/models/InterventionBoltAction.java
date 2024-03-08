package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionBoltAction extends ModelWithAttachments {
	private final ModelRenderer boltaction;
	private final ModelRenderer BoltAction30_r1_r1;
	private final ModelRenderer BoltAction28_r1_r1;
	private final ModelRenderer BoltAction14_r1_r1;
	private final ModelRenderer BoltAction12_r1_r1;
	private final ModelRenderer BoltAction5_r1_r1;
	private final ModelRenderer BoltAction3_r1_r1;

	public InterventionBoltAction() {
		textureWidth = 512;
		textureHeight = 512;

		boltaction = new ModelRenderer(this);
		boltaction.setRotationPoint(0.8595F, -19.2376F, 6.4487F);
		boltaction.cubeList.add(new ModelBox(boltaction, 32, 115, 0.1405F, -2.2624F, -23.4487F, 1, 4, 24, 0.0F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 37, 106, -1.3595F, -0.7624F, -25.5487F, 4, 1, 7, 0.25F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 19, 58, 0.1405F, -2.2624F, -25.5487F, 1, 4, 7, 0.25F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 203, -1.3595F, -0.7624F, -23.4487F, 4, 1, 24, 0.0F, false));

		BoltAction30_r1_r1 = new ModelRenderer(this);
		BoltAction30_r1_r1.setRotationPoint(-32.9312F, -28.434F, -6.4487F);
		boltaction.addChild(BoltAction30_r1_r1);
		setRotationAngle(BoltAction30_r1_r1, 0.0F, 0.0F, 2.3562F);
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 248, 176, -4.8793F, -45.4268F, -17.0F, 1, 1, 24, 0.0F, false));
		BoltAction30_r1_r1.cubeList.add(new ModelBox(BoltAction30_r1_r1, 248, 225, -5.5865F, -44.7197F, -17.0F, 1, 1, 24, 0.0F, false));

		BoltAction28_r1_r1 = new ModelRenderer(this);
		BoltAction28_r1_r1.setRotationPoint(28.8278F, 29.9529F, -6.4487F);
		boltaction.addChild(BoltAction28_r1_r1);
		setRotationAngle(BoltAction28_r1_r1, 0.0F, 0.0F, -0.7854F);
		BoltAction28_r1_r1.cubeList.add(new ModelBox(BoltAction28_r1_r1, 248, 250, -0.3337F, -42.3576F, -17.0F, 1, 1, 24, 0.0F, false));
		BoltAction28_r1_r1.cubeList.add(new ModelBox(BoltAction28_r1_r1, 268, 109, 0.3734F, -43.0539F, -17.0F, 1, 1, 24, 0.0F, false));

		BoltAction14_r1_r1 = new ModelRenderer(this);
		BoltAction14_r1_r1.setRotationPoint(27.1414F, -30.1201F, -6.4487F);
		boltaction.addChild(BoltAction14_r1_r1);
		setRotationAngle(BoltAction14_r1_r1, 0.0F, 0.0F, -2.3562F);
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 0, 247, -4.15F, -40.9123F, -17.0F, 1, 2, 24, 0.0F, false));
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 230, 0, -3.434F, -41.6194F, -17.0F, 2, 1, 24, -0.001F, false));
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 134, 160, -3.234F, -41.7194F, -19.1F, 1, 1, 7, 0.25F, false));
		BoltAction14_r1_r1.cubeList.add(new ModelBox(BoltAction14_r1_r1, 162, 150, -2.534F, -41.7194F, -19.1F, 1, 1, 7, 0.25F, false));

		BoltAction12_r1_r1 = new ModelRenderer(this);
		BoltAction12_r1_r1.setRotationPoint(-31.2453F, 31.6391F, -6.4487F);
		boltaction.addChild(BoltAction12_r1_r1);
		setRotationAngle(BoltAction12_r1_r1, 0.0F, 0.0F, 0.7854F);
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 230, 25, -1.0719F, -46.8743F, -17.0F, 2, 1, 24, 0.0F, false));
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 248, 150, -1.779F, -46.1651F, -17.0F, 1, 2, 24, 0.0F, false));
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 150, 160, -1.879F, -45.87F, -19.1F, 1, 1, 7, 0.25F, false));
		BoltAction12_r1_r1.cubeList.add(new ModelBox(BoltAction12_r1_r1, 171, 151, -1.879F, -45.2651F, -19.1F, 1, 1, 7, 0.24F, false));

		BoltAction5_r1_r1 = new ModelRenderer(this);
		BoltAction5_r1_r1.setRotationPoint(-23.7391F, -32.2414F, -6.4487F);
		boltaction.addChild(BoltAction5_r1_r1);
		setRotationAngle(BoltAction5_r1_r1, 0.0F, 0.0F, 2.3562F);
		BoltAction5_r1_r1.cubeList.add(new ModelBox(BoltAction5_r1_r1, 118, 160, 5.234F, -41.7194F, -19.1F, 1, 1, 7, 0.25F, false));
		BoltAction5_r1_r1.cubeList.add(new ModelBox(BoltAction5_r1_r1, 102, 160, 4.534F, -41.7194F, -19.1F, 1, 1, 7, 0.25F, false));

		BoltAction3_r1_r1 = new ModelRenderer(this);
		BoltAction3_r1_r1.setRotationPoint(30.4049F, 33.7604F, -6.4487F);
		boltaction.addChild(BoltAction3_r1_r1);
		setRotationAngle(BoltAction3_r1_r1, 0.0F, 0.0F, -0.7854F);
		BoltAction3_r1_r1.cubeList.add(new ModelBox(BoltAction3_r1_r1, 86, 160, 3.879F, -45.87F, -19.1F, 1, 1, 7, 0.25F, false));
		BoltAction3_r1_r1.cubeList.add(new ModelBox(BoltAction3_r1_r1, 63, 160, 3.879F, -45.2651F, -19.1F, 1, 1, 7, 0.24F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}