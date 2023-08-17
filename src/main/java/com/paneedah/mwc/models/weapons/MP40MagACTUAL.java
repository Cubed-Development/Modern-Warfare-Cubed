package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP40MagACTUAL extends ModelWithAttachments {
	private final ModelRenderer magazine;

	public MP40MagACTUAL() {
		textureWidth = 160;
		textureHeight = 160;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.3464F, 3.2418F, -36.3435F);
		magazine.cubeList.add(new ModelBox(magazine, 6, 126, -1.3536F, -8.2418F, -2.1665F, 2, 23, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 102, 0, -1.3536F, -8.2418F, -0.6665F, 2, 18, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 92, 74, -1.3536F, -8.2418F, 0.8335F, 2, 18, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 103, 0.2464F, -8.2418F, 0.8335F, 1, 18, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 31, 0, 0.2464F, 9.7582F, -1.1665F, 1, 4, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 20, 0, -1.3536F, 9.7582F, -1.1665F, 1, 4, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 22, 75, 0.2464F, -8.2418F, -0.6665F, 1, 18, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 55, 125, 0.1464F, -8.2418F, -1.1665F, 1, 23, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 49, 125, -1.2536F, -8.2418F, -1.1665F, 1, 23, 2, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 0, 126, -0.7536F, -8.2418F, -2.1565F, 2, 23, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 35, 50, -1.5536F, 13.7582F, -2.0565F, 3, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 35, 41, -1.0536F, -13.2418F, -2.1565F, 2, 5, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 45, 125, -0.5536F, -13.4918F, 0.9935F, 1, 28, 1, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 66, 0, -1.1036F, -9.2418F, -1.6565F, 1, 1, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 59, 57, -0.0429F, -8.1811F, -1.6565F, 1, 1, 3, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 87, 25, 0.6464F, -14.1418F, -2.1565F, 1, 1, 4, 0.0F, false));
		magazine.cubeList.add(new ModelBox(magazine, 30, 35, -1.8036F, -14.0418F, -2.1565F, 1, 1, 4, 0.0F, false));
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
