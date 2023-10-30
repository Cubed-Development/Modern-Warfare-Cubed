package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G43GewehrMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer mag22_r1;

	public G43GewehrMag() {
		textureWidth = 512;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(0.0F, -23.8788F, 2.4088F);
		

		mag22_r1 = new ModelRenderer(this);
		mag22_r1.setRotationPoint(0.0F, 7.1392F, -9.1592F);
		magazine.addChild(mag22_r1);
		setRotationAngle(mag22_r1, 3.0411F, 0.0F, 0.0F);
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.1F, -19.2F, 2.6F, 1, 6, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.9F, -19.2F, 2.6F, 1, 6, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.9F, -19.2F, -2.4F, 1, 6, 2, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.1F, -19.2F, -2.4F, 1, 6, 2, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.19F, -20.4F, 3.5F, 1, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.79F, -20.4F, 3.5F, 1, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.99F, -19.7F, 2.6F, 2, 1, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.99F, -20.2F, 3.3F, 2, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.0F, -20.2F, 3.1F, 2, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.99F, -19.7F, -2.4F, 2, 1, 3, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.0F, -19.2F, -0.4F, 2, 6, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.0F, -19.2F, -1.9F, 2, 6, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.2F, -20.2F, 0.6F, 1, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.8F, -20.2F, 0.6F, 1, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.0F, -20.2F, 1.6F, 2, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.2F, -20.2F, -4.4F, 1, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -1.8F, -20.2F, -4.4F, 1, 7, 1, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.1F, -20.5F, 2.1F, 1, 1, 2, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -0.9F, -20.5F, 2.1F, 1, 1, 2, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -0.8F, -20.5F, -2.4F, 1, 1, 5, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.2F, -20.5F, -2.4F, 1, 1, 5, 0.0F, true));
		mag22_r1.cubeList.add(new ModelBox(mag22_r1, 250, 0, -2.0F, -20.2F, -3.4F, 2, 7, 1, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
