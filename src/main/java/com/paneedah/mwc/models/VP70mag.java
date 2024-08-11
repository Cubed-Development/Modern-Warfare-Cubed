package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VP70mag extends ModelWithAttachments {
    private final ModelRenderer mag;
    private final ModelRenderer gun5_r5;

    public VP70mag() {
        textureWidth = 180;
        textureHeight = 180;

        mag = new ModelRenderer(this);
        mag.setRotationPoint(-1.4998F, 3.9326F, 0.9034F);
        mag.cubeList.add(new ModelBox(mag, 0, 108, -1.4992F, 3.3174F, -6.9034F, 4, 1, 9, 0.0F, false));

        gun5_r5 = new ModelRenderer(this);
        gun5_r5.setRotationPoint(0.4998F, -4.2882F, -3.9494F);
        mag.addChild(gun5_r5);
        setRotationAngle(gun5_r5, 0.2732F, 0.0F, 0.0F);
        gun5_r5.cubeList.add(new ModelBox(gun5_r5, 20, 87, -1.5F, 8.25F, 1.0F, 3, 1, 2, 0.0F, false));
        gun5_r5.cubeList.add(new ModelBox(gun5_r5, 115, 128, -1.5F, 7.25F, -2.0F, 3, 1, 5, 0.0F, false));
        gun5_r5.cubeList.add(new ModelBox(gun5_r5, 0, 65, -1.5F, -11.75F, -3.0F, 3, 19, 6, 0.0F, false));
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
