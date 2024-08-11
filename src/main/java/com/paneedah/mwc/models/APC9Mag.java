package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class APC9Mag extends ModelWithAttachments {
    private final ModelRenderer mag;

    public APC9Mag() {
        textureWidth = 256;
        textureHeight = 256;

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0.0F, 13.5F, -19.95F);
        setRotationAngle(mag, -0.0873F, 0.0F, 0.0F);
        mag.cubeList.add(new ModelBox(mag, 179, 38, -3.0F, -24.0F, -4.0F, 3, 24, 5, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 108, 42, -0.9F, -24.9346F, -2.3F, 1, 24, 3, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 34, 44, -3.15F, -24.9346F, -2.3F, 1, 24, 3, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 45, 26, -2.75F, -1.0F, -4.0F, 3, 1, 5, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 77, 48, -2.75F, -1.0654F, -4.2529F, 3, 1, 1, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 77, 46, -2.75F, -0.9595F, 0.2736F, 3, 1, 1, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 84, 90, -3.25F, -0.9595F, 0.2736F, 1, 1, 1, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 92, 44, -3.25F, -1.0654F, -4.2529F, 1, 1, 1, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 0, 14, -3.25F, -1.0F, -4.0F, 3, 1, 5, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        mag.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
