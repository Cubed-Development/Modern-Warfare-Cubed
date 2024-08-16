package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Kobra extends ModelBase {
    private final ModelRenderer sight;
    private final ModelRenderer gun48_r1;
    private final ModelRenderer gun47_r1;
    private final ModelRenderer gun46_r1;
    private final ModelRenderer gun45_r1;
    private final ModelRenderer gun44_r1;
    private final ModelRenderer gun43_r1;
    private final ModelRenderer gun42_r1;
    private final ModelRenderer gun41_r1;
    private final ModelRenderer gun40_r1;
    private final ModelRenderer gun39_r1;
    private final ModelRenderer gun37_r1;
    private final ModelRenderer gun35_r1;
    private final ModelRenderer gun33_r1;
    private final ModelRenderer gun29_r1;
    private final ModelRenderer gun21_r1;
    private final ModelRenderer gun20_r1;
    private final ModelRenderer gun17_r1;
    private final ModelRenderer gun16_r1;

    public Kobra() {
        textureWidth = 256;
        textureHeight = 128;

        sight = new ModelRenderer(this);
        sight.setRotationPoint(13.4262F, 18.4724F, 0.0F);
        sight.cubeList.add(new ModelBox(sight, 0, 0, -16.4262F, -23.2724F, -12.0F, 3, 1, 3, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -17.9262F, -22.4724F, -12.0F, 6, 3, 18, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -17.4262F, -20.4724F, -10.0F, 5, 2, 13, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -17.4262F, -23.2724F, -12.0F, 1, 1, 12, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -17.4262F, -23.9724F, 0.0F, 5, 2, 6, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -17.9262F, -23.6724F, 0.0F, 6, 2, 6, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -15.4262F, -24.4724F, 1.0F, 3, 1, 3, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -14.9262F, -24.4724F, 0.8F, 2, 1, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -14.9262F, -24.4724F, 3.2F, 2, 1, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -15.6262F, -24.4724F, 1.5F, 1, 1, 2, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -13.2262F, -24.4724F, 1.5F, 1, 1, 2, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -18.4262F, -22.9724F, 1.5F, 1, 3, 3, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -18.4262F, -22.4724F, 1.3F, 1, 2, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -18.4262F, -22.4724F, 3.7F, 1, 2, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -18.4262F, -23.1724F, 2.0F, 1, 1, 2, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -18.4262F, -20.7724F, 2.0F, 1, 1, 2, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -13.4262F, -23.2724F, -12.0F, 1, 1, 12, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -16.4262F, -22.9724F, -12.0F, 3, 1, 12, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -16.9262F, -21.9724F, 6.0F, 1, 2, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -16.2262F, -21.9724F, 6.0F, 1, 2, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -14.6262F, -21.9724F, 6.0F, 1, 2, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -13.9262F, -21.9724F, 6.0F, 1, 2, 1, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -17.9262F, -26.2724F, -12.0F, 1, 4, 3, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -12.9262F, -26.2724F, -12.0F, 1, 4, 3, 0.0F, true));
        sight.cubeList.add(new ModelBox(sight, 0, 0, -16.4262F, -28.2724F, -12.0F, 3, 1, 3, 0.0F, true));

        gun48_r1 = new ModelRenderer(this);
        gun48_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        sight.addChild(gun48_r1);
        setRotationAngle(gun48_r1, 0.0F, 0.0F, -0.4833F);
        gun48_r1.cubeList.add(new ModelBox(gun48_r1, 0, 0, -4.5F, -30.0F, -12.0F, 1, 3, 3, 0.0F, true));

        gun47_r1 = new ModelRenderer(this);
        gun47_r1.setRotationPoint(-23.349F, 3.6829F, 0.0F);
        sight.addChild(gun47_r1);
        setRotationAngle(gun47_r1, 0.0F, 0.0F, 0.3346F);
        gun47_r1.cubeList.add(new ModelBox(gun47_r1, 0, 0, 0.5F, -30.3F, -12.0F, 1, 3, 3, 0.0F, true));

        gun46_r1 = new ModelRenderer(this);
        gun46_r1.setRotationPoint(-38.5485F, -9.4464F, 0.0F);
        sight.addChild(gun46_r1);
        setRotationAngle(gun46_r1, 0.0F, 0.0F, 1.041F);
        gun46_r1.cubeList.add(new ModelBox(gun46_r1, 0, 0, 0.5F, -29.4F, -12.0F, 1, 3, 3, 0.0F, true));

        gun45_r1 = new ModelRenderer(this);
        gun45_r1.setRotationPoint(8.953F, -11.6929F, 0.0F);
        sight.addChild(gun45_r1);
        setRotationAngle(gun45_r1, 0.0F, 0.0F, -1.0038F);
        gun45_r1.cubeList.add(new ModelBox(gun45_r1, 0, 0, -4.5F, -29.0F, -12.0F, 1, 3, 3, 0.0F, true));

        gun44_r1 = new ModelRenderer(this);
        gun44_r1.setRotationPoint(9.1077F, -7.8792F, 0.0F);
        sight.addChild(gun44_r1);
        setRotationAngle(gun44_r1, 0.0F, 0.0F, -0.8179F);
        gun44_r1.cubeList.add(new ModelBox(gun44_r1, 0, 0, -4.2F, -32.7F, -12.0F, 1, 1, 3, 0.0F, true));

        gun43_r1 = new ModelRenderer(this);
        gun43_r1.setRotationPoint(-33.0121F, -52.4445F, 0.0F);
        sight.addChild(gun43_r1);
        setRotationAngle(gun43_r1, 0.0F, 0.0F, 2.4166F);
        gun43_r1.cubeList.add(new ModelBox(gun43_r1, 0, 0, 1.2F, -32.7F, -12.0F, 1, 1, 3, 0.0F, true));

        gun42_r1 = new ModelRenderer(this);
        gun42_r1.setRotationPoint(13.529F, -19.7871F, 0.0F);
        sight.addChild(gun42_r1);
        setRotationAngle(gun42_r1, 0.0F, 0.0F, -1.2269F);
        gun42_r1.cubeList.add(new ModelBox(gun42_r1, 0, 0, -4.5F, -31.8F, -12.0F, 1, 1, 3, 0.0F, true));

        gun41_r1 = new ModelRenderer(this);
        gun41_r1.setRotationPoint(-21.5184F, -56.6283F, 0.0F);
        sight.addChild(gun41_r1);
        setRotationAngle(gun41_r1, 0.0F, 0.0F, 2.7884F);
        gun41_r1.cubeList.add(new ModelBox(gun41_r1, 0, 0, 1.5F, -31.8F, -12.0F, 1, 1, 3, 0.0F, true));

        gun40_r1 = new ModelRenderer(this);
        gun40_r1.setRotationPoint(-41.7154F, -5.6473F, 0.0F);
        sight.addChild(gun40_r1);
        setRotationAngle(gun40_r1, 0.0F, 0.0F, 0.9295F);
        gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 0, -3.0F, -33.8F, -12.0F, 1, 1, 3, 0.0F, true));

        gun39_r1 = new ModelRenderer(this);
        gun39_r1.setRotationPoint(-34.3948F, -1.7628F, 0.0F);
        sight.addChild(gun39_r1);
        setRotationAngle(gun39_r1, 0.0F, 0.0F, 0.6692F);
        gun39_r1.cubeList.add(new ModelBox(gun39_r1, 0, 0, 0.0F, -33.8F, -12.0F, 1, 1, 3, 0.0F, true));

        gun37_r1 = new ModelRenderer(this);
        gun37_r1.setRotationPoint(-13.4262F, 5.6921F, -15.3821F);
        sight.addChild(gun37_r1);
        setRotationAngle(gun37_r1, -0.5205F, 0.0F, 0.0F);
        gun37_r1.cubeList.add(new ModelBox(gun37_r1, 0, 0, -4.5F, -28.8F, -8.0F, 1, 1, 2, 0.0F, true));
        gun37_r1.cubeList.add(new ModelBox(gun37_r1, 0, 0, 0.5F, -28.8F, -8.0F, 1, 1, 2, 0.0F, true));

        gun35_r1 = new ModelRenderer(this);
        gun35_r1.setRotationPoint(-13.4262F, -7.3928F, -35.6451F);
        sight.addChild(gun35_r1);
        setRotationAngle(gun35_r1, -1.2641F, 0.0F, 0.0F);
        gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, -4.5F, -30.8F, -9.0F, 1, 1, 2, 0.0F, true));
        gun35_r1.cubeList.add(new ModelBox(gun35_r1, 0, 0, 0.5F, -30.8F, -9.0F, 1, 1, 2, 0.0F, true));

        gun33_r1 = new ModelRenderer(this);
        gun33_r1.setRotationPoint(-13.4262F, 3.2314F, -23.5802F);
        sight.addChild(gun33_r1);
        setRotationAngle(gun33_r1, -0.7808F, 0.0F, 0.0F);
        gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, -4.5F, -29.8F, -9.0F, 1, 2, 4, 0.0F, true));
        gun33_r1.cubeList.add(new ModelBox(gun33_r1, 0, 0, 0.5F, -29.8F, -9.0F, 1, 2, 4, 0.0F, true));

        gun29_r1 = new ModelRenderer(this);
        gun29_r1.setRotationPoint(-13.4262F, -48.8455F, -2.1152F);
        sight.addChild(gun29_r1);
        setRotationAngle(gun29_r1, -2.5653F, 0.0F, 0.0F);
        gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 0, -0.5F, -27.5F, 7.0F, 1, 2, 1, 0.0F, true));
        gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 0, -1.2F, -27.5F, 7.0F, 1, 2, 1, 0.0F, true));
        gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 0, -3.5F, -27.5F, 7.0F, 1, 2, 1, 0.0F, true));
        gun29_r1.cubeList.add(new ModelBox(gun29_r1, 0, 0, -2.8F, -27.5F, 7.0F, 1, 2, 1, 0.0F, true));

        gun21_r1 = new ModelRenderer(this);
        gun21_r1.setRotationPoint(-38.8019F, -9.652F, 0.0F);
        sight.addChild(gun21_r1);
        setRotationAngle(gun21_r1, 0.0F, 0.0F, 1.0782F);
        gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 0, 0.0F, -28.8F, -12.0F, 1, 1, 12, 0.0F, true));

        gun20_r1 = new ModelRenderer(this);
        gun20_r1.setRotationPoint(-26.1468F, 4.003F, 0.0F);
        sight.addChild(gun20_r1);
        setRotationAngle(gun20_r1, 0.0F, 0.0F, 0.4461F);
        gun20_r1.cubeList.add(new ModelBox(gun20_r1, 0, 0, -3.0F, -28.8F, -12.0F, 1, 1, 12, 0.0F, true));

        gun17_r1 = new ModelRenderer(this);
        gun17_r1.setRotationPoint(-13.4262F, 0.5118F, -16.3634F);
        sight.addChild(gun17_r1);
        setRotationAngle(gun17_r1, -0.5949F, 0.0F, 0.0F);
        gun17_r1.cubeList.add(new ModelBox(gun17_r1, 0, 0, -4.5F, -29.2F, 0.0F, 6, 2, 1, 0.0F, true));

        gun16_r1 = new ModelRenderer(this);
        gun16_r1.setRotationPoint(-13.4262F, 0.4603F, -16.5315F);
        sight.addChild(gun16_r1);
        setRotationAngle(gun16_r1, -0.5949F, 0.0F, 0.0F);
        gun16_r1.cubeList.add(new ModelBox(gun16_r1, 0, 0, -4.0F, -29.5F, 0.0F, 5, 2, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        sight.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
