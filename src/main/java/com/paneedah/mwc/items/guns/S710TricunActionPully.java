package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class S710TricunActionPully extends ModelWithAttachments {
	private final ModelRenderer action_pully;
	private final ModelRenderer cube_r33;
	private final ModelRenderer cube_r34;
	private final ModelRenderer cube_r35;
	private final ModelRenderer cube_r36;
	private final ModelRenderer cube_r37;
	private final ModelRenderer cube_r38;
	private final ModelRenderer cube_r39;
	private final ModelRenderer cube_r40;
	private final ModelRenderer cube_r41;
	private final ModelRenderer cube_r42;
	private final ModelRenderer cube_r43;
	private final ModelRenderer cube_r44;
	private final ModelRenderer cube_r45;
	private final ModelRenderer cube_r46;

	public S710TricunActionPully() {
		textureWidth = 200;
		textureHeight = 200;

		action_pully = new ModelRenderer(this);
		action_pully.setRotationPoint(-3.4F, -13.95F, -20.0F);
		action_pully.cubeList.add(new ModelBox(action_pully, 0, 76, 0.9F, -2.5F, 0.9F, 2, 1, 20, -0.2F, false));
		action_pully.cubeList.add(new ModelBox(action_pully, 16, 46, 0.9F, -2.6F, 19.4F, 2, 1, 2, 0.0F, false));

		cube_r33 = new ModelRenderer(this);
		cube_r33.setRotationPoint(0.6F, -1.6F, 21.1F);
		action_pully.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, -0.384F, 0.0F);
		cube_r33.cubeList.add(new ModelBox(cube_r33, 24, 80, -1.8F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r33.cubeList.add(new ModelBox(cube_r33, 85, 8, -1.8F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r34 = new ModelRenderer(this);
		cube_r34.setRotationPoint(3.2F, -1.6F, 21.1F);
		action_pully.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 0.384F, 0.0F);
		cube_r34.cubeList.add(new ModelBox(cube_r34, 11, 86, -0.2F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r34.cubeList.add(new ModelBox(cube_r34, 86, 44, -0.2F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r35 = new ModelRenderer(this);
		cube_r35.setRotationPoint(1.3F, -1.65F, 20.0F);
		action_pully.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, -0.2443F, 0.0F);
		cube_r35.cubeList.add(new ModelBox(cube_r35, 62, 49, -1.8F, -0.75F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r35.cubeList.add(new ModelBox(cube_r35, 36, 69, -1.8F, -1.151F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r36 = new ModelRenderer(this);
		cube_r36.setRotationPoint(2.5F, -1.65F, 20.0F);
		action_pully.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.0F, 0.2443F, 0.0F);
		cube_r36.cubeList.add(new ModelBox(cube_r36, 85, 66, -0.2F, -0.75F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r36.cubeList.add(new ModelBox(cube_r36, 85, 69, -0.2F, -1.151F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r37 = new ModelRenderer(this);
		cube_r37.setRotationPoint(-0.9F, -1.6F, 20.5F);
		action_pully.addChild(cube_r37);
		setRotationAngle(cube_r37, 0.0F, -1.2654F, 0.0F);
		cube_r37.cubeList.add(new ModelBox(cube_r37, 44, 69, -1.8F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r37.cubeList.add(new ModelBox(cube_r37, 16, 73, -1.8F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r38 = new ModelRenderer(this);
		cube_r38.setRotationPoint(4.7F, -1.6F, 20.5F);
		action_pully.addChild(cube_r38);
		setRotationAngle(cube_r38, 0.0F, 1.2654F, 0.0F);
		cube_r38.cubeList.add(new ModelBox(cube_r38, 85, 10, -0.2F, -0.8F, -0.8F, 2, 1, 1, -0.2F, false));
		cube_r38.cubeList.add(new ModelBox(cube_r38, 85, 12, -0.2F, -1.2F, -0.8F, 2, 1, 1, -0.2F, false));

		cube_r39 = new ModelRenderer(this);
		cube_r39.setRotationPoint(-0.8F, -1.6F, 19.42F);
		action_pully.addChild(cube_r39);
		setRotationAngle(cube_r39, 0.0F, -1.2654F, 0.0F);
		cube_r39.cubeList.add(new ModelBox(cube_r39, 46, 59, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r39.cubeList.add(new ModelBox(cube_r39, 62, 15, -0.8F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r40 = new ModelRenderer(this);
		cube_r40.setRotationPoint(4.6F, -1.6F, 19.42F);
		action_pully.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, 1.2654F, 0.0F);
		cube_r40.cubeList.add(new ModelBox(cube_r40, 70, 52, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r40.cubeList.add(new ModelBox(cube_r40, 70, 58, -0.2F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r41 = new ModelRenderer(this);
		cube_r41.setRotationPoint(-0.25F, -1.6F, 19.6F);
		action_pully.addChild(cube_r41);
		setRotationAngle(cube_r41, 0.0F, -0.6283F, 0.0F);
		cube_r41.cubeList.add(new ModelBox(cube_r41, 63, 58, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r41.cubeList.add(new ModelBox(cube_r41, 0, 65, -0.8F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r42 = new ModelRenderer(this);
		cube_r42.setRotationPoint(4.05F, -1.6F, 19.6F);
		action_pully.addChild(cube_r42);
		setRotationAngle(cube_r42, 0.0F, 0.6283F, 0.0F);
		cube_r42.cubeList.add(new ModelBox(cube_r42, 6, 72, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r42.cubeList.add(new ModelBox(cube_r42, 15, 76, -0.2F, -1.2F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r43 = new ModelRenderer(this);
		cube_r43.setRotationPoint(0.9F, -2.0F, 21.4F);
		action_pully.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, -0.6981F, 0.0F);
		cube_r43.cubeList.add(new ModelBox(cube_r43, 18, 67, -0.8F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r43.cubeList.add(new ModelBox(cube_r43, 62, 65, -0.8F, -0.4F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r44 = new ModelRenderer(this);
		cube_r44.setRotationPoint(2.9F, -2.0F, 21.4F);
		action_pully.addChild(cube_r44);
		setRotationAngle(cube_r44, 0.0F, 0.6981F, 0.0F);
		cube_r44.cubeList.add(new ModelBox(cube_r44, 16, 79, -0.2F, -0.8F, -0.8F, 1, 1, 1, -0.2F, false));
		cube_r44.cubeList.add(new ModelBox(cube_r44, 79, 36, -0.2F, -0.4F, -0.8F, 1, 1, 1, -0.2F, false));

		cube_r45 = new ModelRenderer(this);
		cube_r45.setRotationPoint(-1.0F, -2.6F, 19.95F);
		action_pully.addChild(cube_r45);
		setRotationAngle(cube_r45, 0.0F, -0.3927F, 0.0F);
		cube_r45.cubeList.add(new ModelBox(cube_r45, 9, 80, 0.0F, 0.0F, -1.0F, 3, 1, 1, -0.1F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(2.1F, -2.6F, 21.15F);
		action_pully.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.3927F, 0.0F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 36, 80, 0.0F, 0.0F, -1.0F, 3, 1, 1, -0.1F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action_pully.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}