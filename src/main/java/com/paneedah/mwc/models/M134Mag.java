package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M134Mag extends ModelWithAttachments {
	private final ModelRenderer Magazine;
	private final ModelRenderer Magonminus3_r1;
	private final ModelRenderer Magonminus3_r2;
	private final ModelRenderer Magonminus3_r3;
	private final ModelRenderer Magonminus3_r4;
	private final ModelRenderer bullet;
	private final ModelRenderer bullet_r1;
	private final ModelRenderer bullet_r2;
	private final ModelRenderer bullet_r3;
	private final ModelRenderer bullet_r4;
	private final ModelRenderer bullet_r5;

	public M134Mag() {
		textureWidth = 600;
		textureHeight = 600;

		Magazine = new ModelRenderer(this);
		Magazine.setRotationPoint(0.0F, 24.0F, 0.0F);
		Magazine.cubeList.add(new ModelBox(Magazine, 0, 95, -22.0F, -19.0F, 2.0F, 20, 13, 8, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 130, 44, -22.5F, -21.0F, 1.5F, 16, 3, 9, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 0, 0, -15.5F, -21.4F, 1.0F, 4, 3, 10, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 0, 71, -14.5F, -22.1F, 5.0F, 2, 1, 2, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 0, 0, -6.7F, -21.0F, 9.5F, 1, 3, 1, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 56, 61, -6.7F, -21.1F, 9.5F, 2, 1, 1, 0.0F, false));
		Magazine.cubeList.add(new ModelBox(Magazine, 53, 48, -6.7F, -21.1F, 1.5F, 2, 1, 1, 0.0F, false));

		Magonminus3_r1 = new ModelRenderer(this);
		Magonminus3_r1.setRotationPoint(-19.3F, -21.6F, -5.9F);
		Magazine.addChild(Magonminus3_r1);
		setRotationAngle(Magonminus3_r1, 0.0F, -0.2967F, 0.192F);
		Magonminus3_r1.cubeList.add(new ModelBox(Magonminus3_r1, 107, 40, 1.1F, -0.598F, 7.9F, 6, 2, 2, 0.0F, false));

		Magonminus3_r2 = new ModelRenderer(this);
		Magonminus3_r2.setRotationPoint(-19.3F, -21.6F, 5.9F);
		Magazine.addChild(Magonminus3_r2);
		setRotationAngle(Magonminus3_r2, 0.0F, 0.2967F, 0.192F);
		Magonminus3_r2.cubeList.add(new ModelBox(Magonminus3_r2, 95, 111, -2.3F, -0.598F, 1.2F, 6, 2, 2, 0.0F, false));

		Magonminus3_r3 = new ModelRenderer(this);
		Magonminus3_r3.setRotationPoint(-19.3F, -21.6F, 5.9F);
		Magazine.addChild(Magonminus3_r3);
		setRotationAngle(Magonminus3_r3, 0.0F, 0.0F, 0.192F);
		Magonminus3_r3.cubeList.add(new ModelBox(Magonminus3_r3, 33, 86, -1.8F, -0.6F, -2.0F, 6, 2, 4, 0.0F, false));

		Magonminus3_r4 = new ModelRenderer(this);
		Magonminus3_r4.setRotationPoint(-9.2F, -21.5F, 6.0F);
		Magazine.addChild(Magonminus3_r4);
		setRotationAngle(Magonminus3_r4, 0.0F, -0.6545F, 0.0F);
		Magonminus3_r4.cubeList.add(new ModelBox(Magonminus3_r4, 65, 72, -1.0F, -0.1F, -1.0F, 2, 1, 2, 0.0F, false));

		bullet = new ModelRenderer(this);
		bullet.setRotationPoint(-5.0F, -20.5F, 6.4F);
		Magazine.addChild(bullet);
		bullet.cubeList.add(new ModelBox(bullet, 112, 6, -1.5321F, 0.3662F, -2.6F, 1, 1, 5, 0.0F, false));

		bullet_r1 = new ModelRenderer(this);
		bullet_r1.setRotationPoint(1.1091F, -0.1692F, -0.6F);
		bullet.addChild(bullet_r1);
		setRotationAngle(bullet_r1, 0.0F, 0.0F, 1.5359F);
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 87, 19, 0.7F, 0.5F, -3.7F, 1, 1, 2, -0.13F, false));
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 87, 79, 0.5F, 1.7F, -3.7F, 1, 1, 2, -0.13F, false));
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 87, 89, 0.1F, -2.9F, -3.7F, 1, 1, 2, -0.13F, false));
		bullet_r1.cubeList.add(new ModelBox(bullet_r1, 16, 75, 0.1F, -2.9F, -2.0F, 1, 1, 5, 0.0F, false));

		bullet_r2 = new ModelRenderer(this);
		bullet_r2.setRotationPoint(1.1091F, -0.1692F, -0.6F);
		bullet.addChild(bullet_r2);
		setRotationAngle(bullet_r2, 0.0F, 0.0F, 1.2392F);
		bullet_r2.cubeList.add(new ModelBox(bullet_r2, 79, 94, 0.4F, -0.3298F, -3.7F, 1, 1, 2, -0.13F, false));
		bullet_r2.cubeList.add(new ModelBox(bullet_r2, 95, 7, 0.4F, -1.5F, -3.7F, 1, 1, 2, -0.13F, false));
		bullet_r2.cubeList.add(new ModelBox(bullet_r2, 80, 87, 0.4F, -1.5F, -2.0F, 1, 1, 5, 0.0F, false));

		bullet_r3 = new ModelRenderer(this);
		bullet_r3.setRotationPoint(2.3601F, 1.0285F, -0.1F);
		bullet.addChild(bullet_r3);
		setRotationAngle(bullet_r3, 0.0F, 0.0F, 1.5533F);
		bullet_r3.cubeList.add(new ModelBox(bullet_r3, 49, 33, -0.5F, -2.7F, -3.0F, 1, 3, 6, -0.2F, false));

		bullet_r4 = new ModelRenderer(this);
		bullet_r4.setRotationPoint(1.1091F, -0.0692F, -0.1F);
		bullet.addChild(bullet_r4);
		setRotationAngle(bullet_r4, 0.0F, 0.0F, 1.2915F);
		bullet_r4.cubeList.add(new ModelBox(bullet_r4, 14, 64, 0.9F, -1.1F, -3.0F, 1, 3, 6, -0.2F, false));
		bullet_r4.cubeList.add(new ModelBox(bullet_r4, 51, 111, 0.3F, -0.4F, -2.5F, 1, 1, 5, 0.0F, false));

		bullet_r5 = new ModelRenderer(this);
		bullet_r5.setRotationPoint(-0.3821F, 0.5162F, -0.6F);
		bullet.addChild(bullet_r5);
		setRotationAngle(bullet_r5, 0.0F, 0.0F, -0.0349F);
		bullet_r5.cubeList.add(new ModelBox(bullet_r5, 112, 0, -0.05F, 0.05F, -2.0F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}