package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Laser3 extends ModelBase {
    private final ModelRenderer laser;
    private final ModelRenderer laser52_r1;
    private final ModelRenderer laser51_r1;
    private final ModelRenderer laser50_r1;
    private final ModelRenderer laser49_r1;
    private final ModelRenderer laser47_r1;
    private final ModelRenderer laser46_r1;
    private final ModelRenderer laser45_r1;
    private final ModelRenderer laser44_r1;
    private final ModelRenderer laser43_r1;
    private final ModelRenderer laser42_r1;
    private final ModelRenderer laser40_r1;
    private final ModelRenderer laser37_r1;
    private final ModelRenderer laser33_r1;
    private final ModelRenderer laser32_r1;
    private final ModelRenderer laser31_r1;
    private final ModelRenderer laser30_r1;
    private final ModelRenderer laser29_r1;
    private final ModelRenderer laser28_r1;
    private final ModelRenderer laser27_r1;
    private final ModelRenderer laser24_r1;
    private final ModelRenderer laser23_r1;
    private final ModelRenderer laser20_r1;
    private final ModelRenderer laser16_r1;
    private final ModelRenderer laser15_r1;
    private final ModelRenderer laser14_r1;
    private final ModelRenderer laser13_r1;
    private final ModelRenderer laser12_r1;
    private final ModelRenderer laser11_r1;
    private final ModelRenderer laser10_r1;
    private final ModelRenderer laser88_r1;
    private final ModelRenderer laser5_r1;
    private final ModelRenderer laser53_r1;

    public Laser3() {
        textureWidth = 512;
        textureHeight = 256;

        laser = new ModelRenderer(this);
        laser.setRotationPoint(0.3306F, 24.0F, -0.9575F);
        laser.cubeList.add(new ModelBox(laser, 50, 0, 1.6694F, -25.0F, 0.9575F, 3, 5, 10, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 0, 0, 0.3694F, -24.5F, 1.9575F, 2, 4, 6, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 50, 0, 1.8694F, -25.2F, 0.9575F, 2, 1, 10, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 50, 0, 3.4694F, -25.2F, 0.9575F, 1, 1, 10, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 0, 0, 0.8694F, -19.1F, 3.9575F, 1, 1, 2, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 0, 0, 0.8694F, -20.8F, 3.2575F, 1, 2, 1, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 0, 0, 0.8694F, -20.8F, 5.6575F, 1, 2, 1, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 50, 0, 3.4694F, -20.8F, 0.9575F, 1, 1, 10, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 50, 0, 1.8694F, -20.8F, 0.9575F, 2, 1, 10, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 0, 50, 0.1694F, -19.7F, 6.8575F, 1, 1, 2, 0.0F, true));
        laser.cubeList.add(new ModelBox(laser, 50, 0, 4.0694F, -22.5F, 1.1575F, 1, 2, 8, 0.0F, true));

        laser52_r1 = new ModelRenderer(this);
        laser52_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        laser.addChild(laser52_r1);
        setRotationAngle(laser52_r1, 0.0F, -0.3346F, 0.0F);
        laser52_r1.cubeList.add(new ModelBox(laser52_r1, 0, 0, 3.0F, -19.8F, 0.5F, 2, 1, 2, 0.0F, true));

        laser51_r1 = new ModelRenderer(this);
        laser51_r1.setRotationPoint(18.2491F, -37.3267F, 0.9575F);
        laser.addChild(laser51_r1);
        setRotationAngle(laser51_r1, 0.0F, 0.0F, -2.7512F);
        laser51_r1.cubeList.add(new ModelBox(laser51_r1, 50, 0, 5.6F, -21.5F, 5.2F, 1, 1, 2, 0.0F, true));

        laser50_r1 = new ModelRenderer(this);
        laser50_r1.setRotationPoint(1.8861F, -45.4382F, 0.9575F);
        laser.addChild(laser50_r1);
        setRotationAngle(laser50_r1, 0.0F, 0.0F, 2.7512F);
        laser50_r1.cubeList.add(new ModelBox(laser50_r1, 50, 0, 5.6F, -22.5F, 5.2F, 1, 1, 2, 0.0F, true));

        laser49_r1 = new ModelRenderer(this);
        laser49_r1.setRotationPoint(13.9403F, 0.0F, 4.9494F);
        laser.addChild(laser49_r1);
        setRotationAngle(laser49_r1, -3.1416F, -1.4314F, 3.1416F);
        laser49_r1.cubeList.add(new ModelBox(laser49_r1, 50, 0, 5.4F, -22.5F, 8.2F, 2, 2, 1, 0.0F, true));

        laser47_r1 = new ModelRenderer(this);
        laser47_r1.setRotationPoint(25.7444F, -13.8654F, 0.9575F);
        laser.addChild(laser47_r1);
        setRotationAngle(laser47_r1, 0.0F, 0.0F, -1.3756F);
        laser47_r1.cubeList.add(new ModelBox(laser47_r1, 0, 0, 4.6F, -24.8F, 9.8F, 1, 2, 1, 0.0F, true));

        laser46_r1 = new ModelRenderer(this);
        laser46_r1.setRotationPoint(-20.9518F, -24.5027F, 0.9575F);
        laser.addChild(laser46_r1);
        setRotationAngle(laser46_r1, 0.0F, 0.0F, 1.3756F);
        laser46_r1.cubeList.add(new ModelBox(laser46_r1, 0, 0, 4.6F, -24.8F, 9.8F, 1, 2, 1, 0.0F, true));

        laser45_r1 = new ModelRenderer(this);
        laser45_r1.setRotationPoint(-0.385F, 0.0F, 0.8821F);
        laser.addChild(laser45_r1);
        setRotationAngle(laser45_r1, 0.0F, -0.0372F, 0.0F);
        laser45_r1.cubeList.add(new ModelBox(laser45_r1, 0, 70, 2.0F, -21.7F, 10.2F, 1, 2, 1, 0.0F, true));
        laser45_r1.cubeList.add(new ModelBox(laser45_r1, 0, 70, 2.0F, -20.3F, -1.5F, 1, 1, 12, 0.0F, true));

        laser44_r1 = new ModelRenderer(this);
        laser44_r1.setRotationPoint(-2.5876F, -0.5727F, 0.9575F);
        laser.addChild(laser44_r1);
        setRotationAngle(laser44_r1, 0.0F, 0.0F, 0.1115F);
        laser44_r1.cubeList.add(new ModelBox(laser44_r1, 0, 0, 2.0F, -21.5F, 10.5F, 2, 1, 1, 0.0F, true));

        laser43_r1 = new ModelRenderer(this);
        laser43_r1.setRotationPoint(2.1986F, 0.3054F, 0.9575F);
        laser.addChild(laser43_r1);
        setRotationAngle(laser43_r1, 0.0F, 0.0F, -0.1115F);
        laser43_r1.cubeList.add(new ModelBox(laser43_r1, 0, 0, 2.0F, -22.5F, 10.5F, 2, 1, 1, 0.0F, true));

        laser42_r1 = new ModelRenderer(this);
        laser42_r1.setRotationPoint(1.78F, 0.0F, 0.3153F);
        laser.addChild(laser42_r1);
        setRotationAngle(laser42_r1, 0.0F, -0.1859F, 0.0F);
        laser42_r1.cubeList.add(new ModelBox(laser42_r1, 0, 0, 2.5F, -22.0F, 11.0F, 2, 1, 1, 0.0F, true));

        laser40_r1 = new ModelRenderer(this);
        laser40_r1.setRotationPoint(-0.3306F, -1.0018F, -1.1863F);
        laser.addChild(laser40_r1);
        setRotationAngle(laser40_r1, -0.1115F, 0.0F, 0.0F);
        laser40_r1.cubeList.add(new ModelBox(laser40_r1, 0, 50, 0.5F, -19.7F, 7.9F, 1, 1, 2, 0.0F, true));

        laser37_r1 = new ModelRenderer(this);
        laser37_r1.setRotationPoint(0.4869F, 0.0F, -0.698F);
        laser.addChild(laser37_r1);
        setRotationAngle(laser37_r1, 0.0F, -0.5577F, 0.0F);
        laser37_r1.cubeList.add(new ModelBox(laser37_r1, 0, 0, 3.8F, -26.0F, 0.6F, 1, 1, 1, 0.0F, true));
        laser37_r1.cubeList.add(new ModelBox(laser37_r1, 0, 0, 3.8F, -26.0F, 1.1F, 1, 1, 1, 0.0F, true));
        laser37_r1.cubeList.add(new ModelBox(laser37_r1, 0, 0, 3.3F, -26.0F, 1.1F, 1, 1, 1, 0.0F, true));
        laser37_r1.cubeList.add(new ModelBox(laser37_r1, 0, 0, 3.3F, -26.0F, 0.6F, 1, 1, 1, 0.0F, true));

        laser33_r1 = new ModelRenderer(this);
        laser33_r1.setRotationPoint(-7.017F, -49.4858F, 0.9575F);
        laser.addChild(laser33_r1);
        setRotationAngle(laser33_r1, 0.0F, 0.0F, 2.6397F);
        laser33_r1.cubeList.add(new ModelBox(laser33_r1, 50, 0, 3.0F, -26.6F, 0.0F, 1, 1, 1, 0.0F, true));

        laser32_r1 = new ModelRenderer(this);
        laser32_r1.setRotationPoint(-7.0652F, -49.6735F, 0.9575F);
        laser.addChild(laser32_r1);
        setRotationAngle(laser32_r1, 0.0F, 0.0F, 2.6397F);
        laser32_r1.cubeList.add(new ModelBox(laser32_r1, 50, 0, 3.0F, -26.7F, 2.5F, 1, 1, 1, 0.0F, true));

        laser31_r1 = new ModelRenderer(this);
        laser31_r1.setRotationPoint(19.4924F, -46.1182F, 0.9575F);
        laser.addChild(laser31_r1);
        setRotationAngle(laser31_r1, 0.0F, 0.0F, -2.6397F);
        laser31_r1.cubeList.add(new ModelBox(laser31_r1, 50, 0, 3.0F, -26.6F, 0.0F, 1, 1, 1, 0.0F, true));

        laser30_r1 = new ModelRenderer(this);
        laser30_r1.setRotationPoint(19.5405F, -46.3058F, 0.9575F);
        laser.addChild(laser30_r1);
        setRotationAngle(laser30_r1, 0.0F, 0.0F, -2.6397F);
        laser30_r1.cubeList.add(new ModelBox(laser30_r1, 50, 0, 3.0F, -26.7F, 2.5F, 1, 1, 1, 0.0F, true));

        laser29_r1 = new ModelRenderer(this);
        laser29_r1.setRotationPoint(-0.3306F, -0.925F, -3.7662F);
        laser.addChild(laser29_r1);
        setRotationAngle(laser29_r1, -0.1859F, 0.0F, 0.0F);
        laser29_r1.cubeList.add(new ModelBox(laser29_r1, 50, 0, 3.0F, -25.8F, 2.6F, 1, 1, 3, 0.0F, true));

        laser28_r1 = new ModelRenderer(this);
        laser28_r1.setRotationPoint(-0.3306F, -2.1742F, 11.0415F);
        laser.addChild(laser28_r1);
        setRotationAngle(laser28_r1, 0.409F, 0.0F, 0.0F);
        laser28_r1.cubeList.add(new ModelBox(laser28_r1, 50, 0, 3.0F, -25.4F, -0.2F, 1, 1, 1, 0.0F, true));

        laser27_r1 = new ModelRenderer(this);
        laser27_r1.setRotationPoint(-0.3306F, 0.2358F, 2.4167F);
        laser.addChild(laser27_r1);
        setRotationAngle(laser27_r1, 0.0744F, 0.0F, 0.0F);
        laser27_r1.cubeList.add(new ModelBox(laser27_r1, 0, 50, 0.5F, -19.5F, 3.9F, 1, 1, 2, 0.0F, true));

        laser24_r1 = new ModelRenderer(this);
        laser24_r1.setRotationPoint(-0.3306F, -2.1284F, 16.1299F);
        laser.addChild(laser24_r1);
        setRotationAngle(laser24_r1, 0.7808F, 0.0F, 0.0F);
        laser24_r1.cubeList.add(new ModelBox(laser24_r1, 0, 0, 1.2F, -19.5F, 4.0F, 1, 1, 1, 0.0F, true));

        laser23_r1 = new ModelRenderer(this);
        laser23_r1.setRotationPoint(-0.3306F, -7.759F, -11.8981F);
        laser.addChild(laser23_r1);
        setRotationAngle(laser23_r1, -0.7808F, 0.0F, 0.0F);
        laser23_r1.cubeList.add(new ModelBox(laser23_r1, 0, 0, 1.2F, -19.5F, 3.0F, 1, 1, 1, 0.0F, true));

        laser20_r1 = new ModelRenderer(this);
        laser20_r1.setRotationPoint(-0.3306F, -0.4251F, 6.3531F);
        laser.addChild(laser20_r1);
        setRotationAngle(laser20_r1, 0.2231F, 0.0F, 0.0F);
        laser20_r1.cubeList.add(new ModelBox(laser20_r1, 0, 0, 4.8F, -24.3F, 1.3F, 1, 1, 1, 0.0F, true));
        laser20_r1.cubeList.add(new ModelBox(laser20_r1, 0, 0, 4.8F, -23.8F, 1.3F, 1, 1, 1, 0.0F, true));
        laser20_r1.cubeList.add(new ModelBox(laser20_r1, 0, 0, 4.8F, -23.8F, 0.8F, 1, 1, 1, 0.0F, true));
        laser20_r1.cubeList.add(new ModelBox(laser20_r1, 0, 0, 4.8F, -24.3F, 0.8F, 1, 1, 1, 0.0F, true));

        laser16_r1 = new ModelRenderer(this);
        laser16_r1.setRotationPoint(-7.8033F, -45.6059F, 0.9575F);
        laser.addChild(laser16_r1);
        setRotationAngle(laser16_r1, 0.0F, 0.0F, 2.3794F);
        laser16_r1.cubeList.add(new ModelBox(laser16_r1, 50, 0, 5.4F, -24.3F, 0.0F, 1, 1, 1, 0.0F, true));

        laser15_r1 = new ModelRenderer(this);
        laser15_r1.setRotationPoint(22.2935F, -39.8946F, 0.9575F);
        laser.addChild(laser15_r1);
        setRotationAngle(laser15_r1, 0.0F, 0.0F, -2.5653F);
        laser15_r1.cubeList.add(new ModelBox(laser15_r1, 50, 0, 5.4F, -24.3F, 0.0F, 1, 1, 1, 0.0F, true));

        laser14_r1 = new ModelRenderer(this);
        laser14_r1.setRotationPoint(22.4774F, -39.8401F, 0.9575F);
        laser.addChild(laser14_r1);
        setRotationAngle(laser14_r1, 0.0F, 0.0F, -2.5653F);
        laser14_r1.cubeList.add(new ModelBox(laser14_r1, 50, 0, 5.5F, -24.3F, 2.5F, 1, 1, 1, 0.0F, true));

        laser13_r1 = new ModelRenderer(this);
        laser13_r1.setRotationPoint(-8.4167F, -45.1844F, 0.9575F);
        laser.addChild(laser13_r1);
        setRotationAngle(laser13_r1, 0.0F, 0.0F, 2.3423F);
        laser13_r1.cubeList.add(new ModelBox(laser13_r1, 50, 0, 5.5F, -24.3F, 2.5F, 1, 1, 1, 0.0F, true));

        laser12_r1 = new ModelRenderer(this);
        laser12_r1.setRotationPoint(8.9006F, 0.0F, -1.4847F);
        laser.addChild(laser12_r1);
        setRotationAngle(laser12_r1, -3.1416F, -1.357F, 3.1416F);
        laser12_r1.cubeList.add(new ModelBox(laser12_r1, 50, 0, 5.6F, -24.3F, 2.5F, 3, 1, 1, 0.0F, true));

        laser11_r1 = new ModelRenderer(this);
        laser11_r1.setRotationPoint(3.1785F, 0.0F, -4.2348F);
        laser.addChild(laser11_r1);
        setRotationAngle(laser11_r1, 0.0F, -1.2641F, 0.0F);
        laser11_r1.cubeList.add(new ModelBox(laser11_r1, 50, 0, 5.3F, -24.3F, -0.2F, 1, 1, 1, 0.0F, true));

        laser10_r1 = new ModelRenderer(this);
        laser10_r1.setRotationPoint(-10.0247F, -3.2547F, 0.9575F);
        laser.addChild(laser10_r1);
        setRotationAngle(laser10_r1, 0.0F, 0.0F, 0.409F);
        laser10_r1.cubeList.add(new ModelBox(laser10_r1, 0, 0, 3.5F, -25.0F, -1.0F, 1, 1, 1, 0.0F, true));
        laser10_r1.cubeList.add(new ModelBox(laser10_r1, 0, 0, 3.5F, -24.5F, -1.0F, 1, 1, 1, 0.0F, true));
        laser10_r1.cubeList.add(new ModelBox(laser10_r1, 0, 0, 3.0F, -25.0F, -1.0F, 1, 1, 1, 0.0F, true));
        laser10_r1.cubeList.add(new ModelBox(laser10_r1, 0, 0, 3.0F, -24.5F, -1.0F, 1, 1, 1, 0.0F, true));

        laser88_r1 = new ModelRenderer(this);
        laser88_r1.setRotationPoint(-9.2294F, -3.0897F, 0.9575F);
        laser.addChild(laser88_r1);
        setRotationAngle(laser88_r1, 0.0F, 0.0F, 0.409F);
        laser88_r1.cubeList.add(new ModelBox(laser88_r1, 0, 0, 3.0F, -23.0F, -1.5F, 2, 2, 12, 0.0F, true));

        laser5_r1 = new ModelRenderer(this);
        laser5_r1.setRotationPoint(-10.0714F, -3.8798F, 0.9575F);
        laser.addChild(laser5_r1);
        setRotationAngle(laser5_r1, 0.0F, 0.0F, 0.4833F);
        laser5_r1.cubeList.add(new ModelBox(laser5_r1, 0, 70, 3.0F, -21.7F, -1.8F, 1, 2, 1, 0.0F, true));

        laser53_r1 = new ModelRenderer(this);
        laser53_r1.setRotationPoint(-0.3306F, 0.0F, 0.9575F);
        laser.addChild(laser53_r1);
        setRotationAngle(laser53_r1, 0.0F, -0.3346F, 0.0F);
        laser53_r1.cubeList.add(new ModelBox(laser53_r1, 0, 0, 3.5F, -20.4F, 8.0F, 1, 1, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        laser.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
