package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class InterventionKeystoneHandle extends ModelWithAttachments {
	private final ModelRenderer KeyStone_CarryHandle;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public InterventionKeystoneHandle() {
		textureWidth = 512;
		textureHeight = 512;

		KeyStone_CarryHandle = new ModelRenderer(this);
		KeyStone_CarryHandle.setRotationPoint(-2.0F, -17.7643F, -50.3037F);
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 238, 108, 1.5F, 10.2421F, 7.2994F, 4, 2, 23, -0.45F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 37, 85, 1.5F, 8.4921F, 12.2994F, 4, 3, 18, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 209, 28, 5.2654F, 6.3943F, 24.2994F, 2, 3, 4, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 204, 168, 2.8512F, 4.9801F, 24.2994F, 3, 2, 4, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 155, 191, 1.8512F, 1.9801F, 24.2994F, 3, 4, 4, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 144, 202, 1.1488F, 4.9801F, 24.2994F, 3, 2, 4, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 207, 0, -0.2654F, 6.3943F, 24.2994F, 2, 3, 4, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 60, 77, 0.5F, 8.2421F, 24.2994F, 6, 3, 4, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 118, 126, 2.0F, 8.785F, 7.403F, 3, 3, 6, -0.52F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 219, 137, 1.5F, 3.7539F, 3.331F, 4, 3, 2, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 32, 211, 1.5F, 3.461F, 9.0381F, 4, 4, 2, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 100, 191, 2.0F, 3.461F, 3.7881F, 3, 4, 7, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 112, 75, 1.5F, 3.461F, 3.0381F, 4, 2, 7, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 58, 127, 1.5F, 0.211F, 3.0381F, 4, 4, 8, -0.5F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 123, 19, 1.5F, 1.211F, 3.0381F, 4, 4, 8, -0.8F, false));
		KeyStone_CarryHandle.cubeList.add(new ModelBox(KeyStone_CarryHandle, 123, 219, 1.5F, 8.5824F, 11.5737F, 4, 3, 2, -0.5F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, -8.7056F, 8.1301F);
		KeyStone_CarryHandle.addChild(cube_r1);
		setRotationAngle(cube_r1, -0.7854F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 188, 182, 1.5F, 9.3324F, 12.5737F, 3, 4, 4, -0.5F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 127, 138, 1.0F, 8.5824F, 11.5737F, 4, 2, 5, -0.5F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 0.9764F, -9.7058F);
		KeyStone_CarryHandle.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.2182F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 52, 212, 1.5F, 7.5824F, 12.0737F, 3, 3, 3, -0.515F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 219, 150, 1.0F, 7.5824F, 11.5737F, 4, 3, 2, -0.5F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -1.8033F, -2.801F);
		KeyStone_CarryHandle.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 65, 41, 1.5F, -3.9176F, 11.5737F, 3, 6, 6, -0.51F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -1.0962F, -2.0939F);
		KeyStone_CarryHandle.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7854F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 134, 75, 1.5F, 0.5824F, 10.5737F, 4, 2, 6, -0.5F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.0139F, 7.3667F, 13.7258F);
		KeyStone_CarryHandle.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3927F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 207, 150, -5.5F, -0.9176F, 10.5737F, 2, 3, 4, -0.5F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(4.0655F, 3.6541F, 13.7258F);
		KeyStone_CarryHandle.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.7854F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 204, 191, -5.5F, -0.9176F, 10.5737F, 3, 2, 4, -0.5F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.9345F, 3.6541F, 13.7258F);
		KeyStone_CarryHandle.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 204, 197, 2.5F, -0.9176F, 10.5737F, 3, 2, 4, -0.5F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(1.9861F, 7.3667F, 13.7258F);
		KeyStone_CarryHandle.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.3927F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 158, 209, 3.5F, -0.9176F, 10.5737F, 2, 3, 4, -0.5F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, -2.0784F, 18.1383F);
		KeyStone_CarryHandle.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 155, 219, 1.5F, -0.9176F, 14.5737F, 4, 3, 2, -0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		KeyStone_CarryHandle.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}