package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3ChargingHandle extends ModelWithAttachments {
    private final ModelRenderer charginghandle;
    private final ModelRenderer gun8_r8;
    private final ModelRenderer gun9_r9;
    private final ModelRenderer gun9_r10;
    private final ModelRenderer gun8_r9;

    public G3ChargingHandle() {
        textureWidth = 300;
        textureHeight = 300;

        charginghandle = new ModelRenderer(this);
        charginghandle.setRotationPoint(0.0F, -13.65F, -51.5F);
        charginghandle.cubeList.add(new ModelBox(charginghandle, 0, 224, -1.2F, -1.0F, 3.0F, 1, 1, 17, 0.0F, false));

        gun8_r8 = new ModelRenderer(this);
        gun8_r8.setRotationPoint(-0.2F, -1.0F, 17.0F);
        charginghandle.addChild(gun8_r8);
        setRotationAngle(gun8_r8, 0.0F, 0.0F, -0.7941F);
        gun8_r8.cubeList.add(new ModelBox(gun8_r8, 106, 110, -1.0F, -1.0F, -14.0F, 1, 1, 17, 0.0F, false));

        gun9_r9 = new ModelRenderer(this);
        gun9_r9.setRotationPoint(2.05F, 0.0F, 0.9F);
        charginghandle.addChild(gun9_r9);
        setRotationAngle(gun9_r9, 0.0F, -0.3491F, 0.0F);
        gun9_r9.cubeList.add(new ModelBox(gun9_r9, 13, 107, -1.05F, -1.0F, 0.0F, 1, 1, 3, -0.2F, false));

        gun9_r10 = new ModelRenderer(this);
        gun9_r10.setRotationPoint(2.85F, 0.0F, -1.3F);
        charginghandle.addChild(gun9_r10);
        setRotationAngle(gun9_r10, 0.0F, -0.2967F, 0.0F);
        gun9_r10.cubeList.add(new ModelBox(gun9_r10, 0, 107, -1.05F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun8_r9 = new ModelRenderer(this);
        gun8_r9.setRotationPoint(0.85F, 0.0F, 2.7F);
        charginghandle.addChild(gun8_r9);
        setRotationAngle(gun8_r9, 0.0F, 0.3142F, 0.0F);
        gun8_r9.cubeList.add(new ModelBox(gun8_r9, 55, 60, -2.05F, -1.0F, 0.0F, 2, 1, 1, -0.2F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        charginghandle.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
