package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MP40Action extends ModelWithAttachments {
    private final ModelRenderer action;

    public MP40Action() {
        textureWidth = 160;
        textureHeight = 160;

        action = new ModelRenderer(this);
        action.setRotationPoint(1.9F, -12.5F, -28.6F);
        action.cubeList.add(new ModelBox(action, 69, 47, -2.1F, -0.5F, -1.4F, 1, 1, 10, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 25, 66, -1.1F, -0.6F, -1.4F, 3, 1, 1, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 26, 37, -1.1F, -0.4F, -1.4F, 3, 1, 1, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 31, 7, -1.1F, -0.5F, -1.5F, 3, 1, 1, 0.0F, false));
        action.cubeList.add(new ModelBox(action, 20, 7, -1.1F, -0.5F, -1.3F, 3, 1, 1, 0.0F, false));
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
