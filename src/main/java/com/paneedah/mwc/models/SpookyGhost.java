package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.7.1
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class SpookyGhost extends ModelBase {
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public SpookyGhost() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(8.5F, 7.75F, 0.0F);
        setRotationAngle(bone, 0.0F, 0.0F, 0.6981F);
        bone.cubeList.add(new ModelBox(bone, 40, 40, -6.2856F, -6.5321F, -2.0F, 5, 10, 4, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-8.5F, 7.75F, 0.0F);
        setRotationAngle(bone2, 0.0F, 0.0F, -0.6981F);
        bone2.cubeList.add(new ModelBox(bone2, 40, 0, 0.0F, -5.0F, -2.0F, 5, 10, 4, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -0.5F, -33.0F, -0.5F, 1, 7, 1, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 40, 14, -11.0F, -21.0F, 0.0F, 6, 14, 0, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 48, 5.0F, -23.0F, 0.0F, 6, 14, 0, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -5.0F, -26.0F, -5.0F, 10, 2, 10, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 20, 38, -5.0F, -24.0F, -5.0F, 10, 18, 0, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 20, 5.0F, -24.0F, -5.0F, 0, 18, 10, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 2, -5.0F, -24.0F, -5.0F, 0, 18, 10, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 20, 20, -5.0F, -24.0F, 5.0F, 10, 18, 0, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        bone.render(f5);
        bone2.render(f5);
        bone3.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
