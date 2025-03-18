package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class M202Rockets extends ModelWithAttachments {
    private final ModelRenderer mag;
    private final ModelRenderer magtube1;
    private final ModelRenderer magtube2;
    private final ModelRenderer magtube3;
    private final ModelRenderer magtube4;
    private final ModelRenderer stripe;

    public M202Rockets() {
        textureWidth = 256;
        textureHeight = 256;

        mag = new ModelRenderer(this);
        mag.setRotationPoint(0, 24, 0);
        mag.cubeList.add(new ModelBox(mag, 0, 0, -12, -29, 50, 6, 6, 12, 0, true));
        mag.cubeList.add(new ModelBox(mag, 0, 0, -10, -27, 61, 2, 2, 2, 0, true));
        mag.cubeList.add(new ModelBox(mag, 0, 0, -9, -30, 61, 1, 1, 7, 0, true));
        mag.cubeList.add(new ModelBox(mag, 0, 0, -9, -23, 61, 1, 1, 7, 0, true));
        mag.cubeList.add(new ModelBox(mag, 0, 0, -9, -29.5F, 67.5F, 1, 7, 1, 0, true));
        mag.cubeList.add(new ModelBox(mag, 0, 0, -10, -27, 32, 2, 2, 18, 0, true));

        magtube1 = new ModelRenderer(this);
        magtube1.setRotationPoint(0, 0, 0);
        mag.addChild(magtube1);
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

        magtube2 = new ModelRenderer(this);
        magtube2.setRotationPoint(0, 0, 0);
        mag.addChild(magtube2);
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -33.5F, 20, 5, 1, 42, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -28.5F, 20, 5, 1, 42, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -11.5F, -33, 20, 1, 5, 42, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16.5F, -33, 20, 1, 5, 42, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -33, 60, 5, 5, 1, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -31, 60.5F, 5, 1, 1, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -11, -33, 3, 1, 5, 17, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -17, -33, 3, 1, 5, 17, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -34, 3, 5, 1, 17, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -28, 3, 5, 1, 17, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -16, -33, 2, 5, 5, 1, 0, true));
        magtube2.cubeList.add(new ModelBox(magtube2, 0, 0, -14, -31, 1.5F, 1, 1, 1, 0, true));

        magtube3 = new ModelRenderer(this);
        magtube3.setRotationPoint(0, 0, 0);
        mag.addChild(magtube3);
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -24.5F, 20, 5, 1, 42, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -19.5F, 20, 5, 1, 42, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -11.5F, -24, 20, 1, 5, 42, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16.5F, -24, 20, 1, 5, 42, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -24, 60, 5, 5, 1, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -22, 60.5F, 5, 1, 1, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -11, -24, 3, 1, 5, 17, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -17, -24, 3, 1, 5, 17, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -25, 3, 5, 1, 17, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -19, 3, 5, 1, 17, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -16, -24, 2, 5, 5, 1, 0, true));
        magtube3.cubeList.add(new ModelBox(magtube3, 0, 0, -14, -22, 1.5F, 1, 1, 1, 0, true));

        magtube4 = new ModelRenderer(this);
        magtube4.setRotationPoint(0, 0, 0);
        mag.addChild(magtube4);
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -24.5F, 20, 5, 1, 42, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -19.5F, 20, 5, 1, 42, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -2.5F, -24, 20, 1, 5, 42, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7.5F, -24, 20, 1, 5, 42, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -24, 60, 5, 5, 1, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -22, 60.5F, 5, 1, 1, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -2, -24, 3, 1, 5, 17, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -8, -24, 3, 1, 5, 17, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -25, 3, 5, 1, 17, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -19, 3, 5, 1, 17, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -7, -24, 2, 5, 5, 1, 0, true));
        magtube4.cubeList.add(new ModelBox(magtube4, 0, 0, -5, -22, 1.5F, 1, 1, 1, 0, true));

        stripe = new ModelRenderer(this);
        stripe.setRotationPoint(0, 0, 0);
        mag.addChild(stripe);
        stripe.cubeList.add(new ModelBox(stripe, 0, 0, -1.5F, -34, 42, 1, 16, 2, 0, true));
        stripe.cubeList.add(new ModelBox(stripe, 0, 0, -17.5F, -34, 42, 1, 16, 2, 0, true));
        stripe.cubeList.add(new ModelBox(stripe, 0, 0, -17, -34.5F, 42, 16, 1, 2, 0, true));
        stripe.cubeList.add(new ModelBox(stripe, 0, 0, -17, -18.5F, 42, 16, 1, 2, 0, true));
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
