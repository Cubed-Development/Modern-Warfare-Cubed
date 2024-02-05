package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M60HandGuard extends ModelWithAttachments {
	private final ModelRenderer handguard;
	private final ModelRenderer cubes;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;

	public M60HandGuard() {
		textureWidth = 850;
		textureHeight = 850;

		handguard = new ModelRenderer(this);
		handguard.setRotationPoint(-1.0F, -12.0F, -29.0F);
		

		cubes = new ModelRenderer(this);
		cubes.setRotationPoint(-5.0F, 3.0F, -18.5F);
		handguard.addChild(cubes);
		cubes.cubeList.add(new ModelBox(cubes, 186, 619, 1.0F, -7.0F, -24.5F, 8, 9, 49, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 562, 705, 2.0F, -8.0F, -24.5F, 6, 1, 49, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 0, 51, 8.8F, 0.1F, -24.5F, 1, 2, 49, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 706, 199, 2.0F, 2.0F, -24.5F, 6, 1, 49, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 0, 309, 3.5F, -12.0F, -24.5F, 3, 1, 37, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 41, 124, 2.1601F, -10.4954F, 9.5F, 1, 3, 3, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 312, 35, 2.1601F, -9.4954F, -23.5F, 1, 2, 33, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 109, 2.1601F, -10.4954F, 7.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 31, 0, 6.8399F, -10.4954F, -24.5F, 1, 3, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 192, 128, 6.8399F, -10.4954F, -22.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 132, 192, 6.8399F, -10.4954F, -20.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 192, 132, 6.8399F, -10.4954F, -18.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 192, 134, 6.8399F, -10.4954F, -16.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 136, 192, 6.8399F, -10.4954F, -14.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 146, 192, 6.8399F, -10.4954F, -12.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 167, 192, 6.8399F, -10.4954F, -10.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 171, 192, 6.8399F, -10.4954F, -8.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 185, 192, 6.8399F, -10.4954F, -6.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 312, 0, 6.8399F, -9.4954F, -23.5F, 1, 2, 33, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 189, 192, 6.8399F, -10.4954F, -4.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 192, 191, 6.8399F, -10.4954F, -2.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 0, 6.8399F, -10.4954F, -0.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 2, 6.8399F, -10.4954F, 1.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 4, 6.8399F, -10.4954F, 3.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 6, 6.8399F, -10.4954F, 5.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 41, 91, 6.8399F, -10.4954F, 9.5F, 1, 3, 3, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 8, 6.8399F, -10.4954F, 7.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 107, 2.1601F, -10.4954F, 5.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 98, 2.1601F, -10.4954F, 3.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 105, 2.1601F, -10.4954F, 1.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 95, 2.1601F, -10.4954F, -0.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 98, 193, 2.1601F, -10.4954F, -2.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 78, 2.1601F, -10.4954F, -4.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 94, 193, 2.1601F, -10.4954F, -6.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 46, 2.1601F, -10.4954F, -8.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 58, 2.1601F, -10.4954F, -10.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 26, 2.1601F, -10.4954F, -12.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 40, 193, 2.1601F, -10.4954F, -14.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 22, 2.1601F, -10.4954F, -16.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 24, 2.1601F, -10.4954F, -18.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 18, 2.1601F, -10.4954F, -20.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 193, 20, 2.1601F, -10.4954F, -22.5F, 1, 1, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 51, 28, 2.1601F, -10.4954F, -24.5F, 1, 3, 1, 0.0F, false));
		cubes.cubeList.add(new ModelBox(cubes, 0, 154, 0.0F, 0.0F, -24.5F, 1, 2, 49, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		cubes.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.6109F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 104, 104, 0.0F, -2.0F, -24.5F, 1, 2, 49, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 2.0F, 0.0F);
		cubes.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.0908F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 0, 0.0F, 0.225F, -24.5F, 1, 2, 49, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 104, 51, 0.0F, 0.0F, -24.5F, 1, 2, 49, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(3.5F, -12.0F, -42.0F);
		cubes.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7418F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 162, 176, 0.0F, 0.0F, 17.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 137, 0.0F, 0.0F, 19.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 175, 176, 0.0F, 0.0F, 21.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 155, 0.0F, 0.0F, 23.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 141, 0.0F, 0.0F, 25.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 178, 81, 0.0F, 0.0F, 27.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 177, 159, 0.0F, 0.0F, 29.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 98, 178, 0.0F, 0.0F, 31.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 178, 85, 0.0F, 0.0F, 33.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 4, 0.0F, 0.0F, 35.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 0, 0.0F, 0.0F, 37.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 22, 0.0F, 0.0F, 39.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 18, 0.0F, 0.0F, 41.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 69, 0.0F, 0.0F, 43.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 66, 0.0F, 0.0F, 45.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 72, 0.0F, 0.0F, 47.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 179, 75, 0.0F, 0.0F, 49.5F, 1, 2, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 144, 86, 0.0F, 0.0F, 51.5F, 1, 2, 3, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(6.5F, -12.0F, -6.0F);
		cubes.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.7418F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 10, 133, -1.0F, 0.0F, 15.5F, 1, 2, 3, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 95, 176, -1.0F, 0.0F, 11.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 176, -1.0F, 0.0F, 13.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 176, -1.0F, 0.0F, 9.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 23, 176, -1.0F, 0.0F, 7.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 174, 56, -1.0F, 0.0F, 5.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 174, -1.0F, 0.0F, 3.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 173, 173, -1.0F, 0.0F, 1.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 160, 173, -1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 21, 173, -1.0F, 0.0F, -2.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 78, 172, -1.0F, 0.0F, -4.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 56, 172, -1.0F, 0.0F, -6.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 97, 170, -1.0F, 0.0F, -8.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 91, 170, -1.0F, 0.0F, -10.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 45, 170, -1.0F, 0.0F, -12.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 168, 56, -1.0F, 0.0F, -14.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 168, -1.0F, 0.0F, -16.5F, 1, 2, 1, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 167, 91, -1.0F, 0.0F, -18.5F, 1, 2, 1, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(8.0F, -8.0F, 0.0F);
		cubes.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 206, -1.0F, 0.425F, -24.5F, 1, 1, 49, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 104, 155, -1.0F, 0.0F, -24.5F, 1, 1, 49, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(9.8F, 0.1F, 0.0F);
		cubes.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -0.6109F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 103, -1.0F, -2.0F, -24.5F, 1, 2, 49, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(9.8F, 2.1F, 0.0F);
		cubes.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, 1.0908F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 0, -1.0F, 0.0F, -24.5F, 1, 2, 49, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(2.0F, -8.0F, 0.0F);
		cubes.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 104, 207, 0.0F, 0.425F, -24.5F, 1, 1, 49, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 208, 0, 0.0F, 0.0F, -24.5F, 1, 1, 49, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		handguard.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}