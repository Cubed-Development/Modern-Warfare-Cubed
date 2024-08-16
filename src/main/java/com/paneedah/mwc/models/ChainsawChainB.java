package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ChainsawChainB extends ModelWithAttachments {
    private final ModelRenderer ChainB;
    private final ModelRenderer chainB43_r1;
    private final ModelRenderer chainB31_r1;
    private final ModelRenderer chainB32_r1;
    private final ModelRenderer chainB42_r1;
    private final ModelRenderer chainB41_r1;
    private final ModelRenderer chainB40_r1;
    private final ModelRenderer chainB39_r1;
    private final ModelRenderer chainB38_r1;
    private final ModelRenderer chainB37_r1;
    private final ModelRenderer chainB36_r1;
    private final ModelRenderer chainB35_r1;
    private final ModelRenderer chainB34_r1;
    private final ModelRenderer chainB33_r1;

    public ChainsawChainB() {
        textureWidth = 256;
        textureHeight = 256;

        ChainB = new ModelRenderer(this);
        ChainB.setRotationPoint(-12.5815F, 18.3744F, 0.0F);


        chainB43_r1 = new ModelRenderer(this);
        chainB43_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        ChainB.addChild(chainB43_r1);
        setRotationAngle(chainB43_r1, 0.0F, 0.0F, 0.7854F);
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -35.6F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -25.1F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -18.1F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -11.1F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -4.1F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, 2.9F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -0.6F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -7.6F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -14.6F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -21.6F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -28.6F, 1, 1, 2, 0.0F, true));
        chainB43_r1.cubeList.add(new ModelBox(chainB43_r1, 0, 100, 0.5F, -18.0F, -32.1F, 1, 1, 2, 0.0F, true));

        chainB31_r1 = new ModelRenderer(this);
        chainB31_r1.setRotationPoint(12.5815F, 2.9009F, 1.2526F);
        ChainB.addChild(chainB31_r1);
        setRotationAngle(chainB31_r1, 0.0744F, 0.0F, 0.0F);
        chainB31_r1.cubeList.add(new ModelBox(chainB31_r1, 0, 100, 0.0F, -18.2F, -36.0F, 1, 1, 3, 0.0F, true));

        chainB32_r1 = new ModelRenderer(this);
        chainB32_r1.setRotationPoint(12.5815F, 3.161F, 1.2622F);
        ChainB.addChild(chainB32_r1);
        setRotationAngle(chainB32_r1, 0.0744F, 0.0F, 0.0F);
        chainB32_r1.cubeList.add(new ModelBox(chainB32_r1, 0, 100, 0.0F, -18.2F, -32.5F, 1, 1, 3, 0.0F, true));

        chainB42_r1 = new ModelRenderer(this);
        chainB42_r1.setRotationPoint(12.5815F, 5.7611F, 1.359F);
        ChainB.addChild(chainB42_r1);
        setRotationAngle(chainB42_r1, 0.0744F, 0.0F, 0.0F);
        chainB42_r1.cubeList.add(new ModelBox(chainB42_r1, 0, 100, 0.0F, -18.2F, 2.5F, 1, 1, 3, 0.0F, true));

        chainB41_r1 = new ModelRenderer(this);
        chainB41_r1.setRotationPoint(12.5815F, 5.5011F, 1.3493F);
        ChainB.addChild(chainB41_r1);
        setRotationAngle(chainB41_r1, 0.0744F, 0.0F, 0.0F);
        chainB41_r1.cubeList.add(new ModelBox(chainB41_r1, 0, 100, 0.0F, -18.2F, -1.0F, 1, 1, 3, 0.0F, true));

        chainB40_r1 = new ModelRenderer(this);
        chainB40_r1.setRotationPoint(12.5815F, 5.241F, 1.3396F);
        ChainB.addChild(chainB40_r1);
        setRotationAngle(chainB40_r1, 0.0744F, 0.0F, 0.0F);
        chainB40_r1.cubeList.add(new ModelBox(chainB40_r1, 0, 100, 0.0F, -18.2F, -4.5F, 1, 1, 3, 0.0F, true));

        chainB39_r1 = new ModelRenderer(this);
        chainB39_r1.setRotationPoint(12.5815F, 4.981F, 1.3299F);
        ChainB.addChild(chainB39_r1);
        setRotationAngle(chainB39_r1, 0.0744F, 0.0F, 0.0F);
        chainB39_r1.cubeList.add(new ModelBox(chainB39_r1, 0, 100, 0.0F, -18.2F, -8.0F, 1, 1, 3, 0.0F, true));

        chainB38_r1 = new ModelRenderer(this);
        chainB38_r1.setRotationPoint(12.5815F, 4.721F, 1.3203F);
        ChainB.addChild(chainB38_r1);
        setRotationAngle(chainB38_r1, 0.0744F, 0.0F, 0.0F);
        chainB38_r1.cubeList.add(new ModelBox(chainB38_r1, 0, 100, 0.0F, -18.2F, -11.5F, 1, 1, 3, 0.0F, true));

        chainB37_r1 = new ModelRenderer(this);
        chainB37_r1.setRotationPoint(12.5815F, 4.461F, 1.3106F);
        ChainB.addChild(chainB37_r1);
        setRotationAngle(chainB37_r1, 0.0744F, 0.0F, 0.0F);
        chainB37_r1.cubeList.add(new ModelBox(chainB37_r1, 0, 100, 0.0F, -18.2F, -15.0F, 1, 1, 3, 0.0F, true));

        chainB36_r1 = new ModelRenderer(this);
        chainB36_r1.setRotationPoint(12.5815F, 4.201F, 1.3009F);
        ChainB.addChild(chainB36_r1);
        setRotationAngle(chainB36_r1, 0.0744F, 0.0F, 0.0F);
        chainB36_r1.cubeList.add(new ModelBox(chainB36_r1, 0, 100, 0.0F, -18.2F, -18.5F, 1, 1, 3, 0.0F, true));

        chainB35_r1 = new ModelRenderer(this);
        chainB35_r1.setRotationPoint(12.5815F, 3.941F, 1.2913F);
        ChainB.addChild(chainB35_r1);
        setRotationAngle(chainB35_r1, 0.0744F, 0.0F, 0.0F);
        chainB35_r1.cubeList.add(new ModelBox(chainB35_r1, 0, 100, 0.0F, -18.2F, -22.0F, 1, 1, 3, 0.0F, true));

        chainB34_r1 = new ModelRenderer(this);
        chainB34_r1.setRotationPoint(12.5815F, 3.681F, 1.2816F);
        ChainB.addChild(chainB34_r1);
        setRotationAngle(chainB34_r1, 0.0744F, 0.0F, 0.0F);
        chainB34_r1.cubeList.add(new ModelBox(chainB34_r1, 0, 100, 0.0F, -18.2F, -25.5F, 1, 1, 3, 0.0F, true));

        chainB33_r1 = new ModelRenderer(this);
        chainB33_r1.setRotationPoint(12.5815F, 3.421F, 1.2719F);
        ChainB.addChild(chainB33_r1);
        setRotationAngle(chainB33_r1, 0.0744F, 0.0F, 0.0F);
        chainB33_r1.cubeList.add(new ModelBox(chainB33_r1, 0, 100, 0.0F, -18.2F, -29.0F, 1, 1, 3, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        ChainB.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
