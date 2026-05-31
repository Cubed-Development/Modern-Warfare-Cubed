package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class SightMount extends ModelBase {
    private final ModelRenderer mount;
    private final ModelRenderer mount2;
    private final ModelRenderer mount3;
    private final ModelRenderer mount4;

    public SightMount() {
        textureWidth = 16;
        textureHeight = 16;

        mount = new ModelRenderer(this);
        mount.setRotationPoint(-2, 17.25F, 0.9F);
        mount.cubeList.add(new ModelBox(mount, 0, 0, -1, -1, -4, 8, 2, 14, 0, false));
        mount.cubeList.add(new ModelBox(mount, 0, 0, -1, 4, -4, 8, 2, 14, 0, false));
        mount.cubeList.add(new ModelBox(mount, 0, 0, 7, 4, -4.5F, 1, 3, 15, 0, false));
        mount.cubeList.add(new ModelBox(mount, 0, 0, 0, 1, -4, 6, 3, 14, 0, false));
        mount.cubeList.add(new ModelBox(mount, 0, 0, -2.65F, 5.5F, -4, 2, 2, 14, 0, false));

        mount2 = new ModelRenderer(this);
        mount2.setRotationPoint(8, 4, -4.5F);
        mount.addChild(mount2);
        setRotationAngle(mount2, 0, 0, -0.7854F);
        mount2.cubeList.add(new ModelBox(mount2, 0, 0, -1, -1, 0, 1, 1, 15, 0, false));
        mount2.cubeList.add(new ModelBox(mount2, 0, 0, -3.1213F, 1.1213F, 0, 1, 1, 15, 0, false));
        mount2.cubeList.add(new ModelBox(mount2, 0, 0, -8.6014F, -6.4801F, 0.49F, 4, 2, 14, 0, false));

        mount3 = new ModelRenderer(this);
        mount3.setRotationPoint(7, 1, -4);
        mount.addChild(mount3);
        setRotationAngle(mount3, 0, 0, 0.7854F);
        mount3.cubeList.add(new ModelBox(mount3, 0, 0, -1, 0, -0.01F, 1, 2, 14, 0, false));
        mount3.cubeList.add(new ModelBox(mount3, 0, 0, -5.6569F, 4.6569F, -0.01F, 2, 1, 14, 0, false));

        mount4 = new ModelRenderer(this);
        mount4.setRotationPoint(8.5F, 6, -2.75F);
        mount.addChild(mount4);
        setRotationAngle(mount4, -0.576F, 0, 0);
        mount4.cubeList.add(new ModelBox(mount4, 0, 0, -1, -3, 0, 1, 3, 3, 0, false));
        mount4.cubeList.add(new ModelBox(mount4, 0, 0, -1, -7.221F, 6.4997F, 1, 3, 3, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        mount.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
