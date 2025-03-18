package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.2
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class G95_upright_frontsights extends ModelBase {
    private final ModelRenderer sight1;
    private final ModelRenderer sight2;
    private final ModelRenderer sight3;
    private final ModelRenderer sight4;
    private final ModelRenderer sight5;
    private final ModelRenderer sight6;
    private final ModelRenderer sight7;
    private final ModelRenderer sight8;
    private final ModelRenderer sight9;
    private final ModelRenderer sight13;
    private final ModelRenderer sight14;
    private final ModelRenderer sight15;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;

    public G95_upright_frontsights() {
        textureWidth = 128;
        textureHeight = 128;

        sight1 = new ModelRenderer(this);
        sight1.setRotationPoint(5, 8, -9);
        sight1.cubeList.add(new ModelBox(sight1, 0, 0, 0, 0, 0, 2, 4, 17, 0, true));

        sight2 = new ModelRenderer(this);
        sight2.setRotationPoint(-4, 8, -9);
        sight2.cubeList.add(new ModelBox(sight2, 0, 0, 0, 0, 0, 2, 4, 17, 0, true));

        sight3 = new ModelRenderer(this);
        sight3.setRotationPoint(5, 7, -9);
        sight3.cubeList.add(new ModelBox(sight3, 0, 0, 0, 0, 0, 2, 1, 7, 0, true));

        sight4 = new ModelRenderer(this);
        sight4.setRotationPoint(-4, 7, -9);
        sight4.cubeList.add(new ModelBox(sight4, 0, 0, 0, 0, 0, 2, 1, 7, 0, true));

        sight5 = new ModelRenderer(this);
        sight5.setRotationPoint(-4, 7.5F, -11);
        sight5.cubeList.add(new ModelBox(sight5, 0, 0, 0, 0, 0, 11, 5, 2, 0, true));

        sight6 = new ModelRenderer(this);
        sight6.setRotationPoint(-4, 8.5F, -16);
        sight6.cubeList.add(new ModelBox(sight6, 0, 0, 0, 0, 0, 11, 4, 5, 0, true));

        sight7 = new ModelRenderer(this);
        sight7.setRotationPoint(-4, 7.5F, -11);
        setRotationAngle(sight7, -1.3756F, 0, 0);
        sight7.cubeList.add(new ModelBox(sight7, 0, 0, 0, 0, 0, 11, 5, 1, 0, true));

        sight8 = new ModelRenderer(this);
        sight8.setRotationPoint(-2, 6.5F, -7);
        setRotationAngle(sight8, -0.409F, 0, 0);
        sight8.cubeList.add(new ModelBox(sight8, 0, 0, 0, 0, 0, 7, 4, 4, 0, true));

        sight9 = new ModelRenderer(this);
        sight9.setRotationPoint(0, 7, -7);
        sight9.cubeList.add(new ModelBox(sight9, 0, 0, 0, -8, 0, 3, 11, 3, 0, true));

        sight13 = new ModelRenderer(this);
        sight13.setRotationPoint(-6, 8.5F, -13);
        setRotationAngle(sight13, -0.5577F, 0, 0);
        sight13.cubeList.add(new ModelBox(sight13, 0, 0, 0, 0, 0, 15, 3, 3, 0, true));

        sight14 = new ModelRenderer(this);
        sight14.setRotationPoint(-4.5F, 7.5F, -6);
        setRotationAngle(sight14, -0.5577F, 0, 0);
        sight14.cubeList.add(new ModelBox(sight14, 0, 0, 0, 0, 0, 12, 2, 2, 0, true));

        sight15 = new ModelRenderer(this);
        sight15.setRotationPoint(-2, 9.5F, -9);
        sight15.cubeList.add(new ModelBox(sight15, 0, 0, 0, 0, 0, 7, 2, 16, 0, true));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(2, -1, -6);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1, -2, 0, 1, 2, 1, 0, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-2, 0.5F, 0);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0, 0, -0.4014F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 0, 0, -3, -1, 1, 3, 3, 0, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(1, 0.5F, 0);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0, 0, 0.4014F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 0, -1, -3, -1, 1, 3, 3, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        sight1.render(f5);
        sight2.render(f5);
        sight3.render(f5);
        sight4.render(f5);
        sight5.render(f5);
        sight6.render(f5);
        sight7.render(f5);
        sight8.render(f5);
        sight9.render(f5);
        sight13.render(f5);
        sight14.render(f5);
        sight15.render(f5);
        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
