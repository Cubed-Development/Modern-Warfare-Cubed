package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ChainsawChainA extends ModelWithAttachments {
    private final ModelRenderer chainA;
    private final ModelRenderer chainA30_r1;
    private final ModelRenderer chainA29_r1;
    private final ModelRenderer chainA28_r1;
    private final ModelRenderer chainA27_r1;
    private final ModelRenderer chainA26_r1;
    private final ModelRenderer chainA25_r1;
    private final ModelRenderer chainA13_r1;
    private final ModelRenderer chainA1_r1;

    public ChainsawChainA() {
        textureWidth = 256;
        textureHeight = 256;

        chainA = new ModelRenderer(this);
        chainA.setRotationPoint(28.0772F, 24.0F, -65.37F);


        chainA30_r1 = new ModelRenderer(this);
        chainA30_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        chainA.addChild(chainA30_r1);
        setRotationAngle(chainA30_r1, -3.1416F, 0.7854F, 3.1416F);
        chainA30_r1.cubeList.add(new ModelBox(chainA30_r1, 0, 100, 0.5F, -23.0F, -38.5F, 1, 2, 1, 0.0F, true));

        chainA29_r1 = new ModelRenderer(this);
        chainA29_r1.setRotationPoint(-12.6488F, -8.6864F, 65.37F);
        chainA.addChild(chainA29_r1);
        setRotationAngle(chainA29_r1, 0.0F, 0.0F, -1.0038F);
        chainA29_r1.cubeList.add(new ModelBox(chainA29_r1, 0, 100, -0.2F, -18.4F, -38.0F, 1, 1, 1, 0.0F, true));

        chainA28_r1 = new ModelRenderer(this);
        chainA28_r1.setRotationPoint(-6.7441F, -11.9268F, 65.37F);
        chainA.addChild(chainA28_r1);
        setRotationAngle(chainA28_r1, 0.0F, 0.0F, -1.0038F);
        chainA28_r1.cubeList.add(new ModelBox(chainA28_r1, 0, 100, -0.2F, -25.4F, -38.0F, 1, 1, 1, 0.0F, true));

        chainA27_r1 = new ModelRenderer(this);
        chainA27_r1.setRotationPoint(-28.0772F, -26.7463F, 69.7691F);
        chainA.addChild(chainA27_r1);
        setRotationAngle(chainA27_r1, 0.632F, 0.0F, 0.0F);
        chainA27_r1.cubeList.add(new ModelBox(chainA27_r1, 0, 100, 0.0F, -20.1F, -38.7F, 1, 3, 1, 0.0F, true));

        chainA26_r1 = new ModelRenderer(this);
        chainA26_r1.setRotationPoint(-28.0772F, -39.0245F, 69.7588F);
        chainA.addChild(chainA26_r1);
        setRotationAngle(chainA26_r1, 0.8923F, 0.0F, 0.0F);
        chainA26_r1.cubeList.add(new ModelBox(chainA26_r1, 0, 100, 0.0F, -24.1F, -38.6F, 1, 1, 3, 0.0F, true));

        chainA25_r1 = new ModelRenderer(this);
        chainA25_r1.setRotationPoint(-28.0772F, -55.239F, 53.9992F);
        chainA.addChild(chainA25_r1);
        setRotationAngle(chainA25_r1, 1.3756F, 0.0F, 0.0F);
        chainA25_r1.cubeList.add(new ModelBox(chainA25_r1, 0, 100, 0.0F, -20.7F, -39.3F, 1, 1, 3, 0.0F, true));

        chainA13_r1 = new ModelRenderer(this);
        chainA13_r1.setRotationPoint(-5.9006F, -12.3897F, 65.37F);
        chainA.addChild(chainA13_r1);
        setRotationAngle(chainA13_r1, 0.0F, 0.0F, -1.0038F);
        chainA13_r1.cubeList.add(new ModelBox(chainA13_r1, 0, 100, -0.2F, -26.4F, -35.6F, 1, 1, 2, 0.0F, true));

        chainA1_r1 = new ModelRenderer(this);
        chainA1_r1.setRotationPoint(-28.0772F, -2.7473F, 67.2318F);
        chainA.addChild(chainA1_r1);
        setRotationAngle(chainA1_r1, 0.0744F, 0.0F, 0.0F);
        chainA1_r1.cubeList.add(new ModelBox(chainA1_r1, 0, 100, 0.0F, -26.4F, -36.0F, 1, 1, 3, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        chainA.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
