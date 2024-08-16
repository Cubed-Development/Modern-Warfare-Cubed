package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class JohnsonLMGACTION extends ModelWithAttachments {
    private final ModelRenderer action;

    public JohnsonLMGACTION() {
        textureWidth = 256;
        textureHeight = 256;

        action = new ModelRenderer(this);
        action.setRotationPoint(0.0F, 24.0F, 0.0F);
        action.cubeList.add(new ModelBox(action, 0, 0, -3.9F, -22.5F, 12.0F, 2, 1, 1, 0.0F, true));
        action.cubeList.add(new ModelBox(action, 0, 0, -1.9F, -22.4F, 11.0F, 1, 1, 9, 0.0F, true));
        action.cubeList.add(new ModelBox(action, 0, 0, -1.9F, -22.6F, 11.0F, 1, 1, 9, 0.0F, true));
        action.cubeList.add(new ModelBox(action, 0, 0, -1.7F, -22.5F, 11.0F, 1, 1, 17, 0.0F, true));
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
