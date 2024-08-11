package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class VeprDustCover extends ModelBase {
    private final ModelRenderer DustCover19;
    private final ModelRenderer DustCover17;
    private final ModelRenderer DustCover18;
    private final ModelRenderer DustCover37;
    private final ModelRenderer DustCover38;
    private final ModelRenderer DustCover13;
    private final ModelRenderer DustCover11;
    private final ModelRenderer DustCover12;
    private final ModelRenderer DustCover36;
    private final ModelRenderer DustCover14;
    private final ModelRenderer DustCover15;
    private final ModelRenderer DustCover47;
    private final ModelRenderer DustCover1;
    private final ModelRenderer DustCover10;
    private final ModelRenderer DustCover42;
    private final ModelRenderer DustCover41;
    private final ModelRenderer DustCover43;
    private final ModelRenderer DustCover39;
    private final ModelRenderer DustCover40;
    private final ModelRenderer DustCover50;
    private final ModelRenderer DustCover51;
    private final ModelRenderer DustCover52;
    private final ModelRenderer DustCover53;
    private final ModelRenderer DustCover54;
    private final ModelRenderer DustCover55;
    private final ModelRenderer DustCover56;
    private final ModelRenderer DustCover57;
    private final ModelRenderer DustCover58;
    private final ModelRenderer DustCover59;

    public VeprDustCover() {
        textureWidth = 128;
        textureHeight = 128;

        DustCover19 = new ModelRenderer(this);
        DustCover19.setRotationPoint(-0.2F, -12.0F, -24.5F);
        DustCover19.cubeList.add(new ModelBox(DustCover19, 38, 0, 0.0F, 0.0F, 0.0F, 1, 1, 28, 0.0F, false));

        DustCover17 = new ModelRenderer(this);
        DustCover17.setRotationPoint(-3.8F, -12.0F, -9.5F);
        DustCover17.cubeList.add(new ModelBox(DustCover17, 36, 35, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

        DustCover18 = new ModelRenderer(this);
        DustCover18.setRotationPoint(-3.8F, -12.0F, 2.5F);
        DustCover18.cubeList.add(new ModelBox(DustCover18, 0, 10, 0.0F, -0.001F, 0.001F, 4, 1, 1, 0.0F, false));

        DustCover37 = new ModelRenderer(this);
        DustCover37.setRotationPoint(-0.2F, -13.0F, -33.5F);
        DustCover37.cubeList.add(new ModelBox(DustCover37, 36, 48, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

        DustCover38 = new ModelRenderer(this);
        DustCover38.setRotationPoint(-0.2F, -13.5F, -33.5F);
        DustCover38.cubeList.add(new ModelBox(DustCover38, 14, 35, 0.001F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

        DustCover13 = new ModelRenderer(this);
        DustCover13.setRotationPoint(-3.8F, -11.0F, -9.5F);
        setRotationAngle(DustCover13, 2.1935F, 0.0F, 0.0F);
        DustCover13.cubeList.add(new ModelBox(DustCover13, 6, 5, 0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        DustCover11 = new ModelRenderer(this);
        DustCover11.setRotationPoint(-3.8F, -13.5F, -22.1F);
        DustCover11.cubeList.add(new ModelBox(DustCover11, 0, 35, 0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, false));

        DustCover12 = new ModelRenderer(this);
        DustCover12.setRotationPoint(-3.8F, -13.5F, -10.1F);
        setRotationAngle(DustCover12, -0.8923F, 0.0F, 0.0F);
        DustCover12.cubeList.add(new ModelBox(DustCover12, 9, 11, -0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        DustCover36 = new ModelRenderer(this);
        DustCover36.setRotationPoint(-0.2F, -13.5F, -24.5F);
        setRotationAngle(DustCover36, -1.1525F, 0.0F, 0.0F);
        DustCover36.cubeList.add(new ModelBox(DustCover36, 6, 0, -0.001F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        DustCover14 = new ModelRenderer(this);
        DustCover14.setRotationPoint(-3.7F, -13.7F, -11.0F);
        DustCover14.cubeList.add(new ModelBox(DustCover14, 0, 0, -0.001F, 0.0F, 0.0F, 1, 1, 13, 0.0F, false));

        DustCover15 = new ModelRenderer(this);
        DustCover15.setRotationPoint(-3.7F, -12.7F, -9.1F);
        DustCover15.cubeList.add(new ModelBox(DustCover15, 38, 12, -0.001F, 0.0F, 0.0F, 1, 1, 11, 0.0F, false));

        DustCover47 = new ModelRenderer(this);
        DustCover47.setRotationPoint(-3.7F, -13.0F, -9.5F);
        DustCover47.cubeList.add(new ModelBox(DustCover47, 9, 9, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        DustCover1 = new ModelRenderer(this);
        DustCover1.setRotationPoint(-2.5F, -15.8F, -33.5F);
        DustCover1.cubeList.add(new ModelBox(DustCover1, 0, 0, 0.0F, 0.0F, 0.0F, 2, 1, 34, 0.0F, false));

        DustCover10 = new ModelRenderer(this);
        DustCover10.setRotationPoint(-3.8F, -13.5F, -22.1F);
        setRotationAngle(DustCover10, 0.0F, 0.0F, -1.0782F);
        DustCover10.cubeList.add(new ModelBox(DustCover10, 0, 14, 0.0F, 0.0F, 0.0F, 2, 1, 12, 0.0F, false));

        DustCover42 = new ModelRenderer(this);
        DustCover42.setRotationPoint(-2.5F, -15.8F, 0.5F);
        setRotationAngle(DustCover42, -0.9295F, 0.0F, 0.0F);
        DustCover42.cubeList.add(new ModelBox(DustCover42, 15, 0, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

        DustCover41 = new ModelRenderer(this);
        DustCover41.setRotationPoint(-2.8F, -15.3F, 0.88F);
        setRotationAngle(DustCover41, -0.9295F, 0.0F, 0.0F);
        DustCover41.cubeList.add(new ModelBox(DustCover41, 0, 5, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        DustCover43 = new ModelRenderer(this);
        DustCover43.setRotationPoint(-1.2F, -15.3F, 0.88F);
        setRotationAngle(DustCover43, -0.9295F, 0.0F, 0.0F);
        DustCover43.cubeList.add(new ModelBox(DustCover43, 0, 0, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        DustCover39 = new ModelRenderer(this);
        DustCover39.setRotationPoint(-1.3F, -13.5F, 2.2F);
        setRotationAngle(DustCover39, -0.9295F, 0.0F, 0.0F);
        DustCover39.cubeList.add(new ModelBox(DustCover39, 15, 6, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        DustCover40 = new ModelRenderer(this);
        DustCover40.setRotationPoint(-3.7F, -13.5F, 2.2F);
        setRotationAngle(DustCover40, -0.9295F, 0.0F, 0.0F);
        DustCover40.cubeList.add(new ModelBox(DustCover40, 0, 14, 0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

        DustCover50 = new ModelRenderer(this);
        DustCover50.setRotationPoint(-0.3F, -13.7F, -25.1F);
        DustCover50.cubeList.add(new ModelBox(DustCover50, 69, 2, 0.001F, 0.0F, 0.0F, 1, 2, 27, 0.0F, false));

        DustCover51 = new ModelRenderer(this);
        DustCover51.setRotationPoint(-3.8F, -13.5F, -10.1F);
        setRotationAngle(DustCover51, 0.0F, 0.0F, -1.0782F);
        DustCover51.cubeList.add(new ModelBox(DustCover51, 38, 0, 0.2F, 0.0F, 0.0F, 2, 1, 11, 0.0F, false));

        DustCover52 = new ModelRenderer(this);
        DustCover52.setRotationPoint(-3.7F, -13.5F, 2.2F);
        setRotationAngle(DustCover52, -0.9295F, 0.0F, 0.0F);
        DustCover52.cubeList.add(new ModelBox(DustCover52, 0, 7, 0.001F, -0.001F, -0.2F, 1, 1, 1, 0.0F, false));

        DustCover53 = new ModelRenderer(this);
        DustCover53.setRotationPoint(-3.8F, -13.5F, -33.5F);
        setRotationAngle(DustCover53, 0.0F, 0.0F, -1.0782F);
        DustCover53.cubeList.add(new ModelBox(DustCover53, 36, 36, 1.6F, -0.001F, 0.0F, 1, 1, 34, 0.0F, false));

        DustCover54 = new ModelRenderer(this);
        DustCover54.setRotationPoint(0.8F, -13.5F, -33.5F);
        setRotationAngle(DustCover54, 0.0F, 0.0F, 1.0782F);
        DustCover54.cubeList.add(new ModelBox(DustCover54, 0, 48, -2.0F, 0.0F, 0.0F, 2, 1, 9, 0.0F, false));

        DustCover55 = new ModelRenderer(this);
        DustCover55.setRotationPoint(0.8F, -13.5F, -25.1F);
        setRotationAngle(DustCover55, 0.0F, 0.0F, 1.0782F);
        DustCover55.cubeList.add(new ModelBox(DustCover55, 0, 70, -2.2F, 0.001F, 0.0F, 2, 1, 26, 0.0F, false));

        DustCover56 = new ModelRenderer(this);
        DustCover56.setRotationPoint(-0.3F, -13.5F, 2.2F);
        setRotationAngle(DustCover56, -0.9295F, 0.0F, 0.0F);
        DustCover56.cubeList.add(new ModelBox(DustCover56, 0, 5, -0.001F, -0.001F, -0.2F, 1, 1, 1, 0.0F, false));

        DustCover57 = new ModelRenderer(this);
        DustCover57.setRotationPoint(0.8F, -13.5F, -33.5F);
        setRotationAngle(DustCover57, 0.0F, 0.0F, 1.0782F);
        DustCover57.cubeList.add(new ModelBox(DustCover57, 0, 35, -2.6F, -0.001F, 0.0F, 1, 1, 34, 0.0F, false));

        DustCover58 = new ModelRenderer(this);
        DustCover58.setRotationPoint(-3.8F, -13.5F, 0.5F);
        setRotationAngle(DustCover58, 0.0F, 0.0F, -1.0782F);
        DustCover58.cubeList.add(new ModelBox(DustCover58, 0, 2, 0.2F, -0.001F, 0.0F, 1, 1, 1, 0.0F, false));

        DustCover59 = new ModelRenderer(this);
        DustCover59.setRotationPoint(0.8F, -13.5F, 0.5F);
        setRotationAngle(DustCover59, 0.0F, 0.0F, 1.0782F);
        DustCover59.cubeList.add(new ModelBox(DustCover59, 0, 0, -1.2F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        DustCover19.render(f5);
        DustCover17.render(f5);
        DustCover18.render(f5);
        DustCover37.render(f5);
        DustCover38.render(f5);
        DustCover13.render(f5);
        DustCover11.render(f5);
        DustCover12.render(f5);
        DustCover36.render(f5);
        DustCover14.render(f5);
        DustCover15.render(f5);
        DustCover47.render(f5);
        DustCover1.render(f5);
        DustCover10.render(f5);
        DustCover42.render(f5);
        DustCover41.render(f5);
        DustCover43.render(f5);
        DustCover39.render(f5);
        DustCover40.render(f5);
        DustCover50.render(f5);
        DustCover51.render(f5);
        DustCover52.render(f5);
        DustCover53.render(f5);
        DustCover54.render(f5);
        DustCover55.render(f5);
        DustCover56.render(f5);
        DustCover57.render(f5);
        DustCover58.render(f5);
        DustCover59.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
