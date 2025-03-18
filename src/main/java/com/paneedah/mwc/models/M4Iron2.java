package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.3
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class M4Iron2 extends ModelBase {
    private final ModelRenderer sight7;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public M4Iron2() {
        textureWidth = 128;
        textureHeight = 64;

        sight7 = new ModelRenderer(this);
        sight7.setRotationPoint(-1.8F, -3, 2);
        setRotationAngle(sight7, -1.085F, 0, 0);
        sight7.cubeList.add(new ModelBox(sight7, 0, 0, 0.3F, -0.01F, 0, 1, 1, 5, 0, true));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0, 0, 0);
        sight7.addChild(bone4);
        setRotationAngle(bone4, 0, -0.1396F, 0);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, 0, 0, 0, 1, 1, 5, 0, true));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(1.6F, 0, 0);
        sight7.addChild(bone5);
        setRotationAngle(bone5, 0, 0.1396F, 0);
        bone5.cubeList.add(new ModelBox(bone5, 0, 0, -1, 0, 0, 1, 1, 5, 0, true));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0, 24, 0);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -25.5F, 0, 1, 5, 1, 0, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5F, -25, 0.5F, 1, 1, 1, 0, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.5F, -22.6F, 3.4F, 3, 3, 1, 0, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.49F, -21, -0.01F, 3, 1, 4, 0, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.8F, -27, 0, 1, 1, 2, 0, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.2F, -27, 0, 1, 1, 2, 0, true));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-2.5F, 3, 0);
        setRotationAngle(bone2, 0, 0, 1.6842F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -6, -1, -0.01F, 6, 1, 1, 0, false));
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, -6, -1, 0.99F, 2, 1, 1, 0, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.5F, 3, 0);
        setRotationAngle(bone3, 0, 0, -1.6842F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, 0, -1, -0.01F, 6, 1, 1, 0, false));
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, 4, -1, 0.99F, 2, 1, 1, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        sight7.render(f5);
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
