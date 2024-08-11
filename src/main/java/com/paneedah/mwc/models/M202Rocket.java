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
        magtube1.setRotationPoint(-4.0F, 29.0F, 0.0F);
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -33.5F, 20.0F, 5, 1, 42, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -28.5F, 20.0F, 5, 1, 42, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -2.5F, -33.0F, 20.0F, 1, 5, 42, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.5F, -33.0F, 20.0F, 1, 5, 42, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -33.0F, 60.0F, 5, 5, 1, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -31.0F, 60.5F, 5, 1, 1, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -2.0F, -33.0F, 3.0F, 1, 5, 17, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -8.0F, -33.0F, 3.0F, 1, 5, 17, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -34.0F, 3.0F, 5, 1, 17, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -28.0F, 3.0F, 5, 1, 17, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -7.0F, -33.0F, 2.0F, 5, 5, 1, 0.0F, true));
        magtube1.cubeList.add(new ModelBox(magtube1, 0, 0, -5.0F, -31.0F, 1.5F, 1, 1, 1, 0.0F, true));
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
