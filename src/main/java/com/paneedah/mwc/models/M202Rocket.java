package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M202Rocket extends ModelWithAttachments {
    private final ModelRenderer magtube1;

    public M202Rocket() {
        textureWidth = 256;
        textureHeight = 256;

        magtube1 = new ModelRenderer(this);
        magtube1.setRotationPoint(-4, 29, 0);
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -33.5F, 20, 5, 1, 42, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -28.5F, 20, 5, 1, 42, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -2.5F, -33, 20, 1, 5, 42, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.5F, -33, 20, 1, 5, 42, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -33, 60, 5, 5, 1, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -31, 60.5F, 5, 1, 1, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -2, -33, 3, 1, 5, 17, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -8, -33, 3, 1, 5, 17, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -34, 3, 5, 1, 17, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -28, 3, 5, 1, 17, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7, -33, 2, 5, 5, 1, 0, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -5, -31, 1.5F, 1, 1, 1, 0, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        magtube1.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
