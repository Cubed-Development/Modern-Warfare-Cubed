package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PKMAction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public PKMAction() {
		textureWidth = 400;
		textureHeight = 400;

		action = new ModelRenderer(this);
		action.setRotationPoint(1.0F, -17.6F, -38.7F);
		action.cubeList.add(new ModelBox(action, 80, 0, -3.7F, 3.6F, 15.4F, 1, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 79, 78, -2.0F, 3.6F, 15.4F, 1, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 34, 23, -4.825F, 4.8F, 13.4F, 5, 2, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 170, 107, -4.325F, 6.8F, 15.4F, 4, 2, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 101, -2.925F, 6.8F, 15.4F, 1, 1, 27, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 140, 169, -5.525F, 6.2F, 15.4F, 1, 2, 23, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 178, 9, -6.525F, 6.55F, 16.0F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 86, 95, -10.525F, 6.55F, 18.0F, 4, 1, 1, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 43, -2.825F, 4.8F, 8.4F, 1, 1, 5, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 154, 163, -3.325F, 4.3F, 6.4F, 2, 2, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 178, 13, -2.825F, 6.3F, 6.4F, 1, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 168, 142, -4.325F, 6.8F, 12.4F, 4, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 102, 19, -4.325F, 6.8F, 6.4F, 4, 2, 7, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 14, 162, -3.325F, 7.7F, 12.4F, 2, 1, 3, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 0, 140, -3.325F, 6.8F, -19.6F, 2, 2, 26, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 140, 142, -2.825F, 7.3F, -44.4F, 1, 1, 26, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 49, -3.7F, 2.2F, 10.0F, 1, 1, 5, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 72, 72, -2.0F, 2.2F, 10.0F, 1, 1, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-1.5F, 2.7F, 12.5F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -0.6545F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 30, 121, -1.9F, -0.5F, -3.7F, 1, 1, 2, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.5F, 2.7F, 12.5F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.6545F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 121, -1.2F, -0.5F, -5.3F, 1, 1, 2, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.3F, 0.0F, 0.0F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.7854F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 41, 121, -4.0F, -9.05F, 12.15F, 1, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 49, 121, -2.3F, -9.05F, 12.15F, 1, 1, 2, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0908F, 5.4842F, 9.9632F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, -0.3054F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 142, -0.4391F, -0.6842F, 0.0308F, 1, 1, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 16, 142, -0.4391F, -0.6842F, -0.7942F, 1, 1, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-2.0908F, 5.4842F, 9.9632F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.3054F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 6, 142, -0.7342F, -0.3891F, -0.7942F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 22, 142, -0.7342F, -0.3891F, 0.0808F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-2.325F, 5.3F, 10.9F);
		action.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 142, -0.5F, -0.5F, -1.025F, 1, 1, 1, 0.0F, false));
		cube_r6.cubeList.add(new ModelBox(cube_r6, 40, 142, -0.5F, -0.5F, -1.725F, 1, 1, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-2.325F, 5.3F, 10.9F);
		action.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.3054F, 0.0F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 51, 142, -0.5F, -0.5F, -0.925F, 1, 1, 1, 0.0F, false));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 61, 142, -0.5F, -0.5F, -1.725F, 1, 1, 1, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-6.025F, 7.05F, 17.5F);
		action.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, -0.7854F, 0.0F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 117, 59, -0.4F, -0.5F, 0.3F, 1, 1, 1, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 178, 5, -1.4F, -0.5F, -0.7F, 1, 1, 3, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}