package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class MP43Edoublebarrel extends ModelBase {
    private final ModelRenderer Barrel1;
    private final ModelRenderer Barrel4;
    private final ModelRenderer Barrel5;
    private final ModelRenderer Barrel6;
    private final ModelRenderer Barrel7;
    private final ModelRenderer Barrel8;
    private final ModelRenderer Barrel9;
    private final ModelRenderer Barrel10;
    private final ModelRenderer Barrel12;
    private final ModelRenderer Barrel13;
    private final ModelRenderer Barrel14;
    private final ModelRenderer Barrel22;
    private final ModelRenderer Barrel25;
    private final ModelRenderer bone;
    private final ModelRenderer bone2;

    public MP43Edoublebarrel() {
        textureWidth = 470;
        textureHeight = 470;

        Barrel1 = new ModelRenderer(this);
        Barrel1.setRotationPoint(-1.5F, -8.0F, -77.0F);
        Barrel1.cubeList.add(new ModelBox(Barrel1, 0, 0, 0.0F, 1.0F, 0.0F, 1, 2, 79, 0.0F, false));

        Barrel4 = new ModelRenderer(this);
        Barrel4.setRotationPoint(-3.0F, -3.0F, -6.0F);
        setRotationAngle(Barrel4, 3.0858F, 0.0F, 0.0F);
        Barrel4.cubeList.add(new ModelBox(Barrel4, 0, 0, -0.001F, 0.0F, 0.0F, 4, 1, 4, 0.0F, false));

        Barrel5 = new ModelRenderer(this);
        Barrel5.setRotationPoint(1.0F, -4.8F, -5.9F);
        setRotationAngle(Barrel5, 0.0F, -1.7474F, 0.0F);
        Barrel5.cubeList.add(new ModelBox(Barrel5, 12, 0, 0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, false));

        Barrel6 = new ModelRenderer(this);
        Barrel6.setRotationPoint(-3.0F, -4.8F, -5.9F);
        setRotationAngle(Barrel6, 0.0F, 0.1859F, 0.0F);
        Barrel6.cubeList.add(new ModelBox(Barrel6, 0, 10, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

        Barrel7 = new ModelRenderer(this);
        Barrel7.setRotationPoint(-3.0F, -2.6F, -6.0F);
        setRotationAngle(Barrel7, 3.0858F, 0.0F, 0.0F);
        Barrel7.cubeList.add(new ModelBox(Barrel7, 0, 81, 0.001F, 0.0F, 0.0F, 4, 1, 22, 0.0F, false));

        Barrel8 = new ModelRenderer(this);
        Barrel8.setRotationPoint(1.0F, -4.8F, -30.9F);
        setRotationAngle(Barrel8, 0.0F, 0.0F, 2.3562F);
        Barrel8.cubeList.add(new ModelBox(Barrel8, 27, 53, 0.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

        Barrel9 = new ModelRenderer(this);
        Barrel9.setRotationPoint(-3.0F, -4.8F, -30.9F);
        setRotationAngle(Barrel9, 0.0F, 0.0F, -0.7854F);
        Barrel9.cubeList.add(new ModelBox(Barrel9, 0, 52, 0.0F, 0.0F, 0.0F, 1, 1, 25, 0.0F, false));

        Barrel10 = new ModelRenderer(this);
        Barrel10.setRotationPoint(-3.0F, -4.8F, -30.9F);
        setRotationAngle(Barrel10, -0.7808F, 0.0F, 0.0F);
        Barrel10.cubeList.add(new ModelBox(Barrel10, 0, 8, 0.001F, 0.0F, 0.0F, 4, 1, 1, 0.0F, false));

        Barrel12 = new ModelRenderer(this);
        Barrel12.setRotationPoint(-3.0F, -1.6F, -6.0F);
        setRotationAngle(Barrel12, 3.0858F, 0.0F, 0.0F);
        Barrel12.cubeList.add(new ModelBox(Barrel12, 0, 0, -0.001F, 0.0F, 0.0F, 4, 1, 25, 0.0F, false));

        Barrel13 = new ModelRenderer(this);
        Barrel13.setRotationPoint(-0.3F, -1.8F, -4.0F);
        setRotationAngle(Barrel13, -3.0486F, 0.0F, 0.0F);
        Barrel13.cubeList.add(new ModelBox(Barrel13, 8, 8, 0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F, false));

        Barrel14 = new ModelRenderer(this);
        Barrel14.setRotationPoint(-2.7F, -1.8F, -4.0F);
        setRotationAngle(Barrel14, -3.0486F, 0.0F, 0.0F);
        Barrel14.cubeList.add(new ModelBox(Barrel14, 0, 5, 0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F, false));

        Barrel22 = new ModelRenderer(this);
        Barrel22.setRotationPoint(1.5F, -6.6F, -77.0F);
        setRotationAngle(Barrel22, 0.0F, 0.0F, 2.3562F);
        Barrel22.cubeList.add(new ModelBox(Barrel22, 0, 321, 0.0F, 0.0F, -0.01F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 162, 240, 2.5456F, 2.5456F, -0.01F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 162, 0, 2.12F, 2.5456F, -0.01F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 162, 160, 3.2527F, 1.8385F, -0.01F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 162, 80, 3.253F, 1.42F, -0.011F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 0, 161, 2.5459F, 0.7129F, -0.011F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 81, 82, 1.8388F, 0.0058F, -0.011F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 0, 241, 0.7071F, -0.7071F, -0.01F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 81, 162, 1.12F, -0.708F, -0.011F, 1, 1, 79, 0.0F, false));
        Barrel22.cubeList.add(new ModelBox(Barrel22, 81, 242, 0.001F, 0.42F, -0.011F, 1, 1, 79, 0.0F, false));

        Barrel25 = new ModelRenderer(this);
        Barrel25.setRotationPoint(-2.5F, -7.6F, -77.0F);
        Barrel25.cubeList.add(new ModelBox(Barrel25, 243, 161, 0.0F, 0.0F, 0.0F, 1, 1, 79, 0.0F, false));
        Barrel25.cubeList.add(new ModelBox(Barrel25, 243, 81, 0.0F, 2.0F, 0.0F, 1, 1, 79, 0.0F, false));
        Barrel25.cubeList.add(new ModelBox(Barrel25, 243, 1, 2.0F, 2.0F, 0.0F, 1, 1, 79, 0.0F, false));
        Barrel25.cubeList.add(new ModelBox(Barrel25, 243, 243, -1.0F, 1.0F, 0.0F, 1, 1, 79, 0.0F, false));
        Barrel25.cubeList.add(new ModelBox(Barrel25, 162, 320, 3.0F, 1.0F, 0.0F, 1, 1, 79, 0.0F, false));
        Barrel25.cubeList.add(new ModelBox(Barrel25, 81, 322, 2.0F, 0.0F, 0.0F, 1, 1, 79, 0.0F, false));
        Barrel25.cubeList.add(new ModelBox(Barrel25, 0, 26, -0.5F, 2.8F, 46.1F, 4, 1, 25, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-0.5F, -7.9F, 1.0F);
        setRotationAngle(bone, 0.0F, 0.0F, -0.1745F);
        bone.cubeList.add(new ModelBox(bone, 81, 2, -0.9609F, -0.0921F, -78.001F, 1, 1, 79, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-1.5F, -7.9F, 1.0F);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.1745F);
        bone2.cubeList.add(new ModelBox(bone2, 0, 81, -0.0391F, -0.0921F, -77.999F, 1, 1, 79, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        Barrel1.render(f5);
        Barrel4.render(f5);
        Barrel5.render(f5);
        Barrel6.render(f5);
        Barrel7.render(f5);
        Barrel8.render(f5);
        Barrel9.render(f5);
        Barrel10.render(f5);
        Barrel12.render(f5);
        Barrel13.render(f5);
        Barrel14.render(f5);
        Barrel22.render(f5);
        Barrel25.render(f5);
        bone.render(f5);
        bone2.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
