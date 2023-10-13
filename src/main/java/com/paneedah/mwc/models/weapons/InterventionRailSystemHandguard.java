package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionRailSystemHandguard extends ModelWithAttachments {
	private final ModelRenderer RailSystemHandguard;
	private final ModelRenderer Shape44_r1;
	private final ModelRenderer Shape44_r2;
	private final ModelRenderer Shape44_r3;
	private final ModelRenderer Shape44_r4;

	public InterventionRailSystemHandguard() {
		textureWidth = 512;
		textureHeight = 512;

		RailSystemHandguard = new ModelRenderer(this);
		RailSystemHandguard.setRotationPoint(13.7997F, 22.6221F, 0.0F);
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 230, 0, -13.8F, -39.2F, -77.0F, 3, 1, 53, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 248, 225, -10.7F, -43.6F, -77.0F, 1, 1, 53, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 248, 150, -10.7F, -41.3F, -77.0F, 1, 1, 53, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 238, 54, -14.8F, -43.6F, -77.0F, 1, 1, 53, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 52, 143, -14.8F, -43.0F, -77.0F, 1, 2, 15, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 9, 58, -14.8F, -43.0F, -55.4F, 1, 2, 2, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 65, 41, -14.8F, -43.0F, -47.4F, 1, 2, 2, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 66, 28, -14.8F, -43.0F, -39.6F, 1, 2, 2, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 118, 138, -14.8F, -43.0F, -31.0F, 1, 2, 7, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 0, 247, -14.8F, -41.3F, -77.0F, 1, 1, 53, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 144, 127, -10.7F, -43.0F, -31.0F, 1, 2, 7, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 78, 28, -10.7F, -43.0F, -39.6F, 1, 2, 2, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 77, 62, -10.7F, -43.0F, -47.4F, 1, 2, 2, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 77, 41, -10.7F, -43.0F, -55.4F, 1, 2, 2, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 76, 220, -10.7F, -43.0F, -77.0F, 1, 2, 15, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 166, 0, -13.8F, -45.5F, -77.0F, 3, 1, 58, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 200, 59, -13.8F, -44.5F, -33.0F, 3, 1, 14, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 52, 160, -13.8F, -40.2F, -73.0F, 3, 1, 4, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 107, 25, -13.8F, -40.1F, -64.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 150, 69, -13.8F, -40.1F, -56.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 162, 132, -13.8F, -40.1F, -48.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 166, 22, -13.8F, -40.1F, -40.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 166, 59, -13.8F, -40.1F, -33.0F, 3, 1, 14, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 101, 184, -13.8F, -44.5F, -73.0F, 3, 1, 4, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 178, 22, -13.8F, -44.5F, -64.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 176, 97, -13.8F, -44.5F, -56.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 176, 83, -13.8F, -44.5F, -48.0F, 3, 1, 3, 0.0F, false));
		RailSystemHandguard.cubeList.add(new ModelBox(RailSystemHandguard, 166, 54, -13.8F, -44.5F, -40.0F, 3, 1, 3, 0.0F, false));

		Shape44_r1 = new ModelRenderer(this);
		Shape44_r1.setRotationPoint(-12.2445F, -39.8503F, -48.5F);
		RailSystemHandguard.addChild(Shape44_r1);
		setRotationAngle(Shape44_r1, 0.0F, 0.0F, -0.7854F);
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 90, 32, -1.5F, -2.05F, 15.5F, 1, 2, 14, 0.0F, false));
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 118, 117, -1.5F, -2.05F, 8.5F, 1, 2, 3, 0.0F, false));
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 115, 63, -1.5F, -2.05F, 0.5F, 1, 2, 3, 0.0F, false));
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 47, 115, -1.5F, -2.05F, -7.5F, 1, 2, 3, 0.0F, false));
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 113, 0, -1.5F, -2.05F, -15.5F, 1, 2, 3, 0.0F, false));
		Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 124, 51, -1.5F, -2.05F, -24.5F, 1, 2, 4, 0.0F, false));

		Shape44_r2 = new ModelRenderer(this);
		Shape44_r2.setRotationPoint(-12.2445F, -39.9503F, -48.5F);
		RailSystemHandguard.addChild(Shape44_r2);
		setRotationAngle(Shape44_r2, 0.0F, 0.0F, 0.7854F);
		Shape44_r2.cubeList.add(new ModelBox(Shape44_r2, 90, 48, 0.55F, -2.0F, -24.5F, 1, 2, 4, 0.0F, false));
		Shape44_r2.cubeList.add(new ModelBox(Shape44_r2, 105, 63, 0.55F, -2.0F, -15.5F, 1, 2, 3, 0.0F, false));
		Shape44_r2.cubeList.add(new ModelBox(Shape44_r2, 47, 94, 0.55F, -2.0F, -7.5F, 1, 2, 3, 0.0F, false));
		Shape44_r2.cubeList.add(new ModelBox(Shape44_r2, 37, 94, 0.55F, -2.0F, 0.5F, 1, 2, 3, 0.0F, false));
		Shape44_r2.cubeList.add(new ModelBox(Shape44_r2, 76, 76, 0.55F, -2.0F, 8.5F, 1, 2, 3, 0.0F, false));
		Shape44_r2.cubeList.add(new ModelBox(Shape44_r2, 90, 0, 0.55F, -2.0F, 15.5F, 1, 2, 14, 0.0F, false));

		Shape44_r3 = new ModelRenderer(this);
		Shape44_r3.setRotationPoint(-10.3F, -44.0F, -62.5F);
		RailSystemHandguard.addChild(Shape44_r3);
		setRotationAngle(Shape44_r3, 0.0F, 0.0F, 0.7854F);
		Shape44_r3.cubeList.add(new ModelBox(Shape44_r3, 186, 59, -2.8F, 1.5F, 29.5F, 1, 2, 9, 0.0F, false));
		Shape44_r3.cubeList.add(new ModelBox(Shape44_r3, 123, 19, -2.8F, 1.5F, 22.5F, 1, 2, 3, 0.0F, false));
		Shape44_r3.cubeList.add(new ModelBox(Shape44_r3, 119, 105, -2.8F, 1.5F, 14.5F, 1, 2, 3, 0.0F, false));
		Shape44_r3.cubeList.add(new ModelBox(Shape44_r3, 119, 94, -2.8F, 1.5F, 6.5F, 1, 2, 3, 0.0F, false));
		Shape44_r3.cubeList.add(new ModelBox(Shape44_r3, 119, 85, -2.8F, 1.5F, -1.5F, 1, 2, 3, 0.0F, false));
		Shape44_r3.cubeList.add(new ModelBox(Shape44_r3, 74, 127, -2.8F, 1.5F, -10.5F, 1, 2, 4, 0.0F, false));

		Shape44_r4 = new ModelRenderer(this);
		Shape44_r4.setRotationPoint(-10.3F, -44.0F, -62.5F);
		RailSystemHandguard.addChild(Shape44_r4);
		setRotationAngle(Shape44_r4, 0.0F, 0.0F, -0.7854F);
		Shape44_r4.cubeList.add(new ModelBox(Shape44_r4, 186, 137, -0.9F, -1.3F, 29.5F, 1, 2, 9, 0.0F, false));
		Shape44_r4.cubeList.add(new ModelBox(Shape44_r4, 124, 32, -0.9F, -1.3F, 22.5F, 1, 2, 3, 0.0F, false));
		Shape44_r4.cubeList.add(new ModelBox(Shape44_r4, 58, 127, -0.9F, -1.3F, 14.5F, 1, 2, 3, 0.0F, false));
		Shape44_r4.cubeList.add(new ModelBox(Shape44_r4, 128, 117, -0.9F, -1.3F, 6.5F, 1, 2, 3, 0.0F, false));
		Shape44_r4.cubeList.add(new ModelBox(Shape44_r4, 86, 148, -0.9F, -1.3F, -10.5F, 1, 2, 4, 0.0F, false));
		Shape44_r4.cubeList.add(new ModelBox(Shape44_r4, 129, 85, -0.9F, -1.3F, -1.5F, 1, 2, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		RailSystemHandguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}