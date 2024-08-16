package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KS23Barrel extends ModelWithAttachments {
    private final ModelRenderer barrel;
    private final ModelRenderer gun148_r1;
    private final ModelRenderer gun147;
    private final ModelRenderer gun146;
    private final ModelRenderer gun64;
    private final ModelRenderer gun63;
    private final ModelRenderer gun62;
    private final ModelRenderer gun61;
    private final ModelRenderer gun60;
    private final ModelRenderer gun59;
    private final ModelRenderer gun58;
    private final ModelRenderer gun57;
    private final ModelRenderer gun51;
    private final ModelRenderer gun50;
    private final ModelRenderer gun41;
    private final ModelRenderer gun40;
    private final ModelRenderer gun39;
    private final ModelRenderer gun38;
    private final ModelRenderer gun37;
    private final ModelRenderer gun36;

    public KS23Barrel() {
        textureWidth = 300;
        textureHeight = 300;

        barrel = new ModelRenderer(this);
        barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
        barrel.cubeList.add(new ModelBox(barrel, 81, 5, -0.4F, -29.6F, -51.001F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 10, 86, -2.6F, -29.6F, -51.001F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 91, 15, -1.5F, -28.5F, -51.001F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 91, 21, -1.5F, -30.7F, -51.001F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 118, 154, -2.5F, -29.6F, -50.0F, 3, 1, 36, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 89, 191, -1.5F, -30.6F, -48.0F, 1, 3, 34, 0.0F, false));

        gun148_r1 = new ModelRenderer(this);
        gun148_r1.setRotationPoint(-1.5F, -31.2F, -48.0F);
        barrel.addChild(gun148_r1);
        setRotationAngle(gun148_r1, -0.1487F, 0.0F, 0.0F);
        gun148_r1.cubeList.add(new ModelBox(gun148_r1, 0, 43, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun147 = new ModelRenderer(this);
        gun147.setRotationPoint(-1.5F, -31.2F, -49.0F);
        barrel.addChild(gun147);
        setRotationAngle(gun147, -1.3756F, 0.0F, 0.0F);
        gun147.cubeList.add(new ModelBox(gun147, 32, 5, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        gun146 = new ModelRenderer(this);
        gun146.setRotationPoint(-1.5F, -31.2F, -49.0F);
        barrel.addChild(gun146);
        gun146.cubeList.add(new ModelBox(gun146, 20, 6, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun64 = new ModelRenderer(this);
        gun64.setRotationPoint(-1.5F, -27.5F, -51.0F);
        barrel.addChild(gun64);
        setRotationAngle(gun64, 0.0F, 0.0F, -2.3562F);
        gun64.cubeList.add(new ModelBox(gun64, 40, 52, 0.0F, -0.001F, 0.001F, 1, 1, 4, 0.0F, false));

        gun63 = new ModelRenderer(this);
        gun63.setRotationPoint(-2.6F, -28.6F, -51.0F);
        barrel.addChild(gun63);
        setRotationAngle(gun63, 0.0F, 0.0F, -0.7854F);
        gun63.cubeList.add(new ModelBox(gun63, 62, 62, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun62 = new ModelRenderer(this);
        gun62.setRotationPoint(-2.6F, -29.6F, -51.0F);
        barrel.addChild(gun62);
        setRotationAngle(gun62, 0.0F, 0.0F, -0.7854F);
        gun62.cubeList.add(new ModelBox(gun62, 10, 74, 0.0F, -0.001F, 0.0F, 1, 1, 4, 0.0F, false));

        gun61 = new ModelRenderer(this);
        gun61.setRotationPoint(-1.5F, -30.7F, -51.0F);
        barrel.addChild(gun61);
        setRotationAngle(gun61, 0.0F, 0.0F, 0.7854F);
        gun61.cubeList.add(new ModelBox(gun61, 22, 74, 0.0F, 0.0F, -0.002F, 1, 1, 4, 0.0F, false));

        gun60 = new ModelRenderer(this);
        gun60.setRotationPoint(-0.5F, -27.5F, -51.0F);
        barrel.addChild(gun60);
        setRotationAngle(gun60, 0.0F, 0.0F, -2.3562F);
        gun60.cubeList.add(new ModelBox(gun60, 79, 21, 0.001F, 0.0F, 0.001F, 1, 1, 4, 0.0F, false));

        gun59 = new ModelRenderer(this);
        gun59.setRotationPoint(0.6F, -28.6F, -51.0F);
        barrel.addChild(gun59);
        setRotationAngle(gun59, 0.0F, 0.0F, 2.3562F);
        gun59.cubeList.add(new ModelBox(gun59, 22, 79, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun58 = new ModelRenderer(this);
        gun58.setRotationPoint(0.6F, -29.6F, -51.0F);
        barrel.addChild(gun58);
        setRotationAngle(gun58, 0.0F, 0.0F, 2.3562F);
        gun58.cubeList.add(new ModelBox(gun58, 79, 26, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun57 = new ModelRenderer(this);
        gun57.setRotationPoint(-0.5F, -30.7F, -51.0F);
        barrel.addChild(gun57);
        setRotationAngle(gun57, 0.0F, 0.0F, 0.7854F);
        gun57.cubeList.add(new ModelBox(gun57, 81, 0, 0.0F, -0.001F, -0.003F, 1, 1, 4, 0.0F, false));

        gun51 = new ModelRenderer(this);
        gun51.setRotationPoint(-1.5F, -27.6F, -51.0F);
        barrel.addChild(gun51);
        setRotationAngle(gun51, 0.0F, 0.0F, -2.3562F);
        gun51.cubeList.add(new ModelBox(gun51, 156, 50, 0.0F, -0.001F, 2.0F, 1, 1, 35, 0.0F, false));

        gun50 = new ModelRenderer(this);
        gun50.setRotationPoint(-2.5F, -28.6F, -51.0F);
        barrel.addChild(gun50);
        setRotationAngle(gun50, 0.0F, 0.0F, -0.7854F);
        gun50.cubeList.add(new ModelBox(gun50, 51, 156, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

        gun41 = new ModelRenderer(this);
        gun41.setRotationPoint(-2.5F, -29.6F, -51.0F);
        barrel.addChild(gun41);
        setRotationAngle(gun41, 0.0F, 0.0F, -0.7854F);
        gun41.cubeList.add(new ModelBox(gun41, 193, 36, 0.0F, -0.001F, 3.0F, 1, 1, 34, 0.0F, false));

        gun40 = new ModelRenderer(this);
        gun40.setRotationPoint(-1.5F, -30.6F, -51.0F);
        barrel.addChild(gun40);
        setRotationAngle(gun40, 0.0F, 0.0F, 0.7854F);
        gun40.cubeList.add(new ModelBox(gun40, 193, 86, 0.0F, 0.0F, 3.0F, 1, 1, 34, 0.0F, false));

        gun39 = new ModelRenderer(this);
        gun39.setRotationPoint(-0.5F, -27.6F, -51.0F);
        barrel.addChild(gun39);
        setRotationAngle(gun39, 0.0F, 0.0F, -2.3562F);
        gun39.cubeList.add(new ModelBox(gun39, 156, 102, 0.001F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

        gun38 = new ModelRenderer(this);
        gun38.setRotationPoint(0.5F, -28.6F, -51.0F);
        barrel.addChild(gun38);
        setRotationAngle(gun38, 0.0F, 0.0F, 2.3562F);
        gun38.cubeList.add(new ModelBox(gun38, 160, 0, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

        gun37 = new ModelRenderer(this);
        gun37.setRotationPoint(0.5F, -29.6F, -51.0F);
        barrel.addChild(gun37);
        setRotationAngle(gun37, 0.0F, 0.0F, 2.3562F);
        gun37.cubeList.add(new ModelBox(gun37, 160, 154, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));

        gun36 = new ModelRenderer(this);
        gun36.setRotationPoint(-0.5F, -30.6F, -51.0F);
        barrel.addChild(gun36);
        setRotationAngle(gun36, 0.0F, 0.0F, 0.8029F);
        gun36.cubeList.add(new ModelBox(gun36, 161, 190, 0.0F, 0.0F, 2.0F, 1, 1, 35, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        barrel.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
