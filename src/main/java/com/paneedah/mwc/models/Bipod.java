package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.12
// Paste this class into your mod and generate all required imports


public class Bipod extends ModelBase {
    private final ModelRenderer gun1;
    private final ModelRenderer gun2;
    private final ModelRenderer gun3;
    private final ModelRenderer gun6;
    private final ModelRenderer gun7;
    private final ModelRenderer gun8;
    private final ModelRenderer gun9;
    private final ModelRenderer gun11AND12;
    private final ModelRenderer gun13AND14;
    private final ModelRenderer gun16;
    private final ModelRenderer gun17;
    private final ModelRenderer gun18;
    private final ModelRenderer gun19;
    private final ModelRenderer gun20;
    private final ModelRenderer gun21;
    private final ModelRenderer gun22;
    private final ModelRenderer gun23;
    private final ModelRenderer gun24;
    private final ModelRenderer gun25;
    private final ModelRenderer gun26;
    private final ModelRenderer gun27;
    private final ModelRenderer gun28;
    private final ModelRenderer gun29AND31;
    private final ModelRenderer gun32AND33;
    private final ModelRenderer gun34AND35;
    private final ModelRenderer gun36;
    private final ModelRenderer gun37;
    private final ModelRenderer gun38;
    private final ModelRenderer gun39;
    private final ModelRenderer gun40;
    private final ModelRenderer gun41;
    private final ModelRenderer gun42;
    private final ModelRenderer gun43;
    private final ModelRenderer gun44;
    private final ModelRenderer gun45AND53;
    private final ModelRenderer gun53AND2;

    public Bipod() {
        textureWidth = 64;
        textureHeight = 64;

        gun1 = new ModelRenderer(this);
        gun1.setRotationPoint(-1.0F, -6.5F, -3.0F);
        gun1.cubeList.add(new ModelBox(gun1, 12, 18, 0.0F, -1.0F, -1.0F, 4, 1, 5, 0.0F, false));

        gun2 = new ModelRenderer(this);
        gun2.setRotationPoint(-1.0F, -5.0F, -3.0F);
        gun2.cubeList.add(new ModelBox(gun2, 21, 39, 0.0F, 0.0F, 0.0F, 4, 1, 3, 0.0F, false));

        gun3 = new ModelRenderer(this);
        gun3.setRotationPoint(-0.5F, -6.0F, -2.5F);
        gun3.cubeList.add(new ModelBox(gun3, 19, 31, 0.0F, -1.0F, 0.0F, 3, 2, 2, 0.0F, false));

        gun6 = new ModelRenderer(this);
        gun6.setRotationPoint(-1.0F, -3.0F, -3.0F);
        gun6.cubeList.add(new ModelBox(gun6, 18, 43, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun7 = new ModelRenderer(this);
        gun7.setRotationPoint(2.0F, -3.0F, -3.0F);
        gun7.cubeList.add(new ModelBox(gun7, 27, 21, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun8 = new ModelRenderer(this);
        gun8.setRotationPoint(4.5F, -4.0F, -2.5F);
        setRotationAngle(gun8, 0.0F, 0.0F, 1.2269F);
        gun8.cubeList.add(new ModelBox(gun8, 0, 3, -2.0F, 0.0F, 0.5F, 23, 2, 1, 0.0F, false));

        gun9 = new ModelRenderer(this);
        gun9.setRotationPoint(-2.5F, -4.0F, -2.5F);
        setRotationAngle(gun9, 0.0F, 0.0F, 0.3491F);
        gun9.cubeList.add(new ModelBox(gun9, 6, 18, 0.0F, -2.0F, 0.5F, 2, 20, 1, 0.0F, false));

        gun11AND12 = new ModelRenderer(this);
        gun11AND12.setRotationPoint(-7.3F, 8.0F, -3.0F);
        setRotationAngle(gun11AND12, 0.0F, 0.0F, 0.3491F);
        gun11AND12.cubeList.add(new ModelBox(gun11AND12, 38, 29, 0.0F, 5.0F, 0.0F, 3, 3, 3, 0.0F, false));
        gun11AND12.cubeList.add(new ModelBox(gun11AND12, 44, 7, 0.5F, 7.4F, 0.5F, 2, 1, 2, 0.0F, false));

        gun13AND14 = new ModelRenderer(this);
        gun13AND14.setRotationPoint(9.3F, 8.0F, -2.0F);
        setRotationAngle(gun13AND14, 0.0F, 0.0F, 1.2269F);
        gun13AND14.cubeList.add(new ModelBox(gun13AND14, 9, 37, 5.0F, 0.0F, -1.0F, 3, 3, 3, 0.0F, false));
        gun13AND14.cubeList.add(new ModelBox(gun13AND14, 44, 10, 7.4F, 0.5F, -0.5F, 1, 2, 2, 0.0F, false));

        gun16 = new ModelRenderer(this);
        gun16.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun16, 0.0F, 0.0F, 1.2217F);
        gun16.cubeList.add(new ModelBox(gun16, 11, 43, 0.3F, -0.7F, 0.5F, 4, 2, 1, 0.0F, false));

        gun17 = new ModelRenderer(this);
        gun17.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun17, 0.0F, 0.0F, 1.2217F);
        gun17.cubeList.add(new ModelBox(gun17, 7, 46, 2.3F, -1.2F, -0.5F, 2, 3, 1, 0.0F, false));

        gun18 = new ModelRenderer(this);
        gun18.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun18, 0.0F, 0.0F, 1.2217F);
        gun18.cubeList.add(new ModelBox(gun18, 44, 25, 1.8F, -0.7F, -0.5F, 3, 2, 1, 0.0F, false));

        gun19 = new ModelRenderer(this);
        gun19.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun19, 0.0F, 0.0F, 1.2217F);
        gun19.cubeList.add(new ModelBox(gun19, 18, 37, 0.4F, -0.7F, -0.3F, 1, 2, 1, 0.0F, false));

        gun20 = new ModelRenderer(this);
        gun20.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun20, 0.0F, 0.0F, 1.2217F);
        gun20.cubeList.add(new ModelBox(gun20, 34, 21, 7.5F, -1.7F, 0.0F, 1, 4, 4, 0.0F, false));

        gun21 = new ModelRenderer(this);
        gun21.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun21, 0.0F, 0.0F, -1.2217F);
        gun21.cubeList.add(new ModelBox(gun21, 38, 35, -9.4883F, -13.8557F, 0.5F, 4, 2, 1, 0.0F, false));

        gun22 = new ModelRenderer(this);
        gun22.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun22, 0.0F, 0.0F, -1.2217F);
        gun22.cubeList.add(new ModelBox(gun22, 45, 45, -9.4883F, -14.3557F, -0.5F, 2, 3, 1, 0.0F, false));

        gun23 = new ModelRenderer(this);
        gun23.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun23, 0.0F, 0.0F, -1.2217F);
        gun23.cubeList.add(new ModelBox(gun23, 0, 44, -9.9883F, -13.8557F, -0.5F, 3, 2, 1, 0.0F, false));

        gun24 = new ModelRenderer(this);
        gun24.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun24, 0.0F, 0.0F, -1.2217F);
        gun24.cubeList.add(new ModelBox(gun24, 32, 21, -6.6F, -13.8557F, -0.3F, 1, 2, 1, 0.0F, false));

        gun25 = new ModelRenderer(this);
        gun25.setRotationPoint(8.0F, 7.7F, -3.5F);
        setRotationAngle(gun25, 0.0F, 0.0F, -1.2217F);
        gun25.cubeList.add(new ModelBox(gun25, 32, 34, -13.2883F, -14.8557F, 0.0F, 1, 4, 4, 0.0F, false));

        gun26 = new ModelRenderer(this);
        gun26.setRotationPoint(-0.5F, -6.5F, -1.0F);
        setRotationAngle(gun26, 0.0F, 0.0F, -0.8727F);
        gun26.cubeList.add(new ModelBox(gun26, 24, 31, -0.234F, -1.8428F, -3.0F, 1, 2, 5, 0.0F, false));

        gun27 = new ModelRenderer(this);
        gun27.setRotationPoint(2.5F, -6.5F, -1.0F);
        setRotationAngle(gun27, 0.0F, 0.0F, 0.8727F);
        gun27.cubeList.add(new ModelBox(gun27, 12, 30, -0.766F, -1.8428F, -3.0F, 1, 2, 5, 0.0F, false));

        gun28 = new ModelRenderer(this);
        gun28.setRotationPoint(0.5F, -4.5F, -1.0F);
        gun28.cubeList.add(new ModelBox(gun28, 12, 24, 0.0F, -3.0F, -4.0F, 1, 3, 1, 0.0F, false));

        gun29AND31 = new ModelRenderer(this);
        gun29AND31.setRotationPoint(1.0F, -3.5F, -4.5F);
        setRotationAngle(gun29AND31, 0.8727F, 0.0F, 0.0F);
        gun29AND31.cubeList.add(new ModelBox(gun29AND31, 12, 18, -0.5F, -1.5F, 0.5F, 1, 3, 1, 0.0F, false));
        gun29AND31.cubeList.add(new ModelBox(gun29AND31, 31, 42, -0.5F, 1.5F, -0.5F, 1, 1, 4, 0.0F, false));
        gun29AND31.cubeList.add(new ModelBox(gun29AND31, 31, 31, -1.0F, 1.0F, -1.5F, 2, 2, 1, 0.0F, false));

        gun32AND33 = new ModelRenderer(this);
        gun32AND33.setRotationPoint(2.5F, -6.5F, -1.0F);
        setRotationAngle(gun32AND33, 0.0F, 0.0F, 1.0472F);
        gun32AND33.cubeList.add(new ModelBox(gun32AND33, 23, 25, 1.0F, -1.2F, -3.0F, 3, 1, 5, 0.0F, false));
        gun32AND33.cubeList.add(new ModelBox(gun32AND33, 30, 47, 2.0F, -1.4F, -1.0F, 1, 1, 1, 0.0F, false));

        gun34AND35 = new ModelRenderer(this);
        gun34AND35.setRotationPoint(-0.5F, -6.5F, -1.0F);
        setRotationAngle(gun34AND35, 0.0F, 0.0F, -1.0472F);
        gun34AND35.cubeList.add(new ModelBox(gun34AND35, 12, 24, -4.0F, -1.2F, -3.0F, 3, 1, 5, 0.0F, false));
        gun34AND35.cubeList.add(new ModelBox(gun34AND35, 20, 47, -3.0F, -1.4F, -1.0F, 1, 1, 1, 0.0F, false));

        gun36 = new ModelRenderer(this);
        gun36.setRotationPoint(0.5F, -7.2F, -1.5F);
        gun36.cubeList.add(new ModelBox(gun36, 40, 20, -2.0F, 1.2F, 2.0F, 5, 4, 1, 0.0F, false));

        gun37 = new ModelRenderer(this);
        gun37.setRotationPoint(0.5F, -7.2F, -4.5F);
        gun37.cubeList.add(new ModelBox(gun37, 25, 18, -2.5F, 1.1F, 2.0F, 6, 1, 2, 0.0F, false));

        gun38 = new ModelRenderer(this);
        gun38.setRotationPoint(0.5F, -7.2F, -4.5F);
        gun38.cubeList.add(new ModelBox(gun38, 40, 14, 0.0F, 3.1F, 2.5F, 1, 1, 4, 0.0F, false));

        gun39 = new ModelRenderer(this);
        gun39.setRotationPoint(4.5F, -4.0F, -2.5F);
        setRotationAngle(gun39, 0.0F, 0.0F, 1.2269F);
        gun39.cubeList.add(new ModelBox(gun39, 0, 0, -2.0F, 0.5F, 0.0F, 23, 1, 2, 0.0F, false));

        gun40 = new ModelRenderer(this);
        gun40.setRotationPoint(4.5F, -4.0F, -2.5F);
        setRotationAngle(gun40, -0.7854F, 0.0F, 1.2269F);
        gun40.cubeList.add(new ModelBox(gun40, 0, 15, -1.0F, -1.0F, 0.9F, 21, 2, 1, 0.0F, false));

        gun41 = new ModelRenderer(this);
        gun41.setRotationPoint(4.5F, -4.0F, -2.5F);
        setRotationAngle(gun41, -0.7854F, 0.0F, 1.2269F);
        gun41.cubeList.add(new ModelBox(gun41, 0, 9, -1.0F, -0.5F, 0.4F, 21, 1, 2, 0.0F, false));

        gun42 = new ModelRenderer(this);
        gun42.setRotationPoint(4.5F, -4.0F, -2.5F);
        setRotationAngle(gun42, -0.7854F, 0.0F, -1.2217F);
        gun42.cubeList.add(new ModelBox(gun42, 0, 12, -22.6424F, -5.6F, -3.8074F, 21, 2, 1, 0.0F, false));

        gun43 = new ModelRenderer(this);
        gun43.setRotationPoint(4.5F, -4.0F, -2.5F);
        setRotationAngle(gun43, -0.7854F, 0.0F, -1.2217F);
        gun43.cubeList.add(new ModelBox(gun43, 0, 6, -22.6424F, -5.2074F, -4.2F, 21, 1, 2, 0.0F, false));

        gun44 = new ModelRenderer(this);
        gun44.setRotationPoint(-2.5F, -4.0F, -2.5F);
        setRotationAngle(gun44, 0.0F, 0.0F, 0.3491F);
        gun44.cubeList.add(new ModelBox(gun44, 0, 18, 0.5F, -2.0F, 0.0F, 1, 20, 2, 0.0F, false));

        gun45AND53 = new ModelRenderer(this);
        gun45AND53.setRotationPoint(7.5F, 2.5F, -1.5F);
        setRotationAngle(gun45AND53, -0.1745F, 0.0F, -0.3491F);
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 16, 47, -0.7F, 0.5F, -0.2F, 1, 1, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 12, 30, -0.9F, -7.0F, -0.2F, 1, 2, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 0, 47, -0.7F, -0.6F, -0.2F, 1, 1, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 46, 16, -0.7F, -1.7F, -0.2F, 1, 1, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 46, 14, -0.7F, -2.8F, -0.2F, 1, 1, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 13, 46, -0.7F, -3.9F, -0.2F, 1, 1, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 45, 43, -0.7F, -5.0F, -0.2F, 1, 1, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 41, 43, -1.3F, -5.0F, -0.2F, 1, 6, 1, 0.0F, false));
        gun45AND53.cubeList.add(new ModelBox(gun45AND53, 0, 40, -3.0F, 1.0F, -1.2F, 3, 1, 3, 0.0F, false));

        gun53AND2 = new ModelRenderer(this);
        gun53AND2.setRotationPoint(-2.5F, 3.5F, -1.5F);
        setRotationAngle(gun53AND2, -0.1745F, 0.0F, 0.3491F);
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 37, 43, -3.3F, 0.5F, -0.2F, 1, 1, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 23, 24, -3.1F, -7.0F, -0.2F, 1, 2, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 30, 43, -3.3F, -0.6F, -0.2F, 1, 1, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 31, 34, -3.3F, -1.7F, -0.2F, 1, 1, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 12, 33, -3.3F, -2.8F, -0.2F, 1, 1, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 23, 27, -3.3F, -3.9F, -0.2F, 1, 1, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 25, 21, -3.3F, -5.0F, -0.2F, 1, 1, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 26, 43, -2.9F, -5.0F, -0.2F, 1, 6, 1, 0.0F, false));
        gun53AND2.cubeList.add(new ModelBox(gun53AND2, 39, 39, -3.0F, 1.0F, -1.2F, 3, 1, 3, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        gun1.render(f5);
        gun2.render(f5);
        gun3.render(f5);
        gun6.render(f5);
        gun7.render(f5);
        gun8.render(f5);
        gun9.render(f5);
        gun11AND12.render(f5);
        gun13AND14.render(f5);
        gun16.render(f5);
        gun17.render(f5);
        gun18.render(f5);
        gun19.render(f5);
        gun20.render(f5);
        gun21.render(f5);
        gun22.render(f5);
        gun23.render(f5);
        gun24.render(f5);
        gun25.render(f5);
        gun26.render(f5);
        gun27.render(f5);
        gun28.render(f5);
        gun29AND31.render(f5);
        gun32AND33.render(f5);
        gun34AND35.render(f5);
        gun36.render(f5);
        gun37.render(f5);
        gun38.render(f5);
        gun39.render(f5);
        gun40.render(f5);
        gun41.render(f5);
        gun42.render(f5);
        gun43.render(f5);
        gun44.render(f5);
        gun45AND53.render(f5);
        gun53AND2.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
