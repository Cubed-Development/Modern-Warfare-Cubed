package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington870SawedGrip extends ModelWithAttachments {
    private final ModelRenderer stockSawed;
    private final ModelRenderer stock28_r1;
    private final ModelRenderer stock25_r1;
    private final ModelRenderer stock23_r1;
    private final ModelRenderer stock23_r2;
    private final ModelRenderer stock27_r1;
    private final ModelRenderer stock21_r1;
    private final ModelRenderer stock20_r1;
    private final ModelRenderer stock2_r1;
    private final ModelRenderer stock20_r2;
    private final ModelRenderer stock19_r1;
    private final ModelRenderer stock13_r1;
    private final ModelRenderer stock5_r1;
    private final ModelRenderer stock12_r1;
    private final ModelRenderer stock12_r2;
    private final ModelRenderer stock10_r1;
    private final ModelRenderer stock10_r2;
    private final ModelRenderer stock9_r1;
    private final ModelRenderer stock8_r1;
    private final ModelRenderer stock2_r2;
    private final ModelRenderer stock2_r3;
    private final ModelRenderer stock4_r1;
    private final ModelRenderer stock6_r1;
    private final ModelRenderer stock6_r2;
    private final ModelRenderer stock22_r1;
    private final ModelRenderer stock12_r3;
    private final ModelRenderer stock6_r3;
    private final ModelRenderer stock22_r2;

    public Remington870SawedGrip() {
        textureWidth = 410;
        textureHeight = 410;

        stockSawed = new ModelRenderer(this);
        stockSawed.setRotationPoint(0, 18.7985F, -5.2415F);


        stock28_r1 = new ModelRenderer(this);
        stock28_r1.setRotationPoint(0, -3.8879F, -5.6269F);
        stockSawed.addChild(stock28_r1);
        setRotationAngle(stock28_r1, -0.4461F, 0, 0);
        stock28_r1.cubeList.add(new ModelBox(stock28_r1, 94, 71, -2.9F, -28.5F, 13.6F, 1, 3, 8, 0, false));
        stock28_r1.cubeList.add(new ModelBox(stock28_r1, 114, 92, -0.09F, -28.5F, 13.6F, 1, 3, 8, 0, false));

        stock25_r1 = new ModelRenderer(this);
        stock25_r1.setRotationPoint(0, -33.3357F, -2.5144F);
        stockSawed.addChild(stock25_r1);
        setRotationAngle(stock25_r1, -1.1897F, 0, 0);
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 106, 40, -2.9F, -25, 24.6F, 2, 2, 3, 0, false));
        stock25_r1.cubeList.add(new ModelBox(stock25_r1, 106, 45, -1.1F, -25, 24.6F, 2, 2, 3, 0, false));

        stock23_r1 = new ModelRenderer(this);
        stock23_r1.setRotationPoint(0.1F, -16.1777F, 30.2149F);
        stockSawed.addChild(stock23_r1);
        setRotationAngle(stock23_r1, -1.0398F, 0.5275F, -0.7086F);
        stock23_r1.cubeList.add(new ModelBox(stock23_r1, 34, 27, -1.6F, -1.1F, -2.4F, 1, 2, 1, 0.01F, false));

        stock23_r2 = new ModelRenderer(this);
        stock23_r2.setRotationPoint(-0.1F, -16.1777F, 30.2149F);
        stockSawed.addChild(stock23_r2);
        setRotationAngle(stock23_r2, -1.0398F, -0.5275F, 0.7086F);
        stock23_r2.cubeList.add(new ModelBox(stock23_r2, 34, 32, -0.7F, -1.1F, -0.9F, 1, 2, 1, 0.01F, false));

        stock27_r1 = new ModelRenderer(this);
        stock27_r1.setRotationPoint(0, -28.7511F, -4.9892F);
        stockSawed.addChild(stock27_r1);
        setRotationAngle(stock27_r1, -1.041F, 0, 0);
        stock27_r1.cubeList.add(new ModelBox(stock27_r1, 128, 25, -2, -25.9F, 24.5F, 2, 2, 5, 0, false));

        stock21_r1 = new ModelRenderer(this);
        stock21_r1.setRotationPoint(0, 0, 0);
        stockSawed.addChild(stock21_r1);
        setRotationAngle(stock21_r1, -0.2231F, 0, 0);
        stock21_r1.cubeList.add(new ModelBox(stock21_r1, 39, 97, -2.9F, -26, 18.6F, 2, 2, 6, 0, false));
        stock21_r1.cubeList.add(new ModelBox(stock21_r1, 96, 97, -1.1F, -26, 18.6F, 2, 2, 6, 0, false));

        stock20_r1 = new ModelRenderer(this);
        stock20_r1.setRotationPoint(-2.4F, -21.0649F, 26.9273F);
        stockSawed.addChild(stock20_r1);
        setRotationAngle(stock20_r1, -0.1745F, -0.1397F, -0.6684F);
        stock20_r1.cubeList.add(new ModelBox(stock20_r1, 128, 34, -0.6F, 0.2F, -3.2F, 1, 1, 6, 0.1F, false));

        stock2_r1 = new ModelRenderer(this);
        stock2_r1.setRotationPoint(-2.4F, -22.7345F, 21.4299F);
        stockSawed.addChild(stock2_r1);
        setRotationAngle(stock2_r1, -0.355F, -0.2557F, -0.6287F);
        stock2_r1.cubeList.add(new ModelBox(stock2_r1, 10, 140, -0.4F, 0, -2.5F, 1, 1, 6, 0.1F, false));

        stock20_r2 = new ModelRenderer(this);
        stock20_r2.setRotationPoint(0.4F, -21.0649F, 26.9273F);
        stockSawed.addChild(stock20_r2);
        setRotationAngle(stock20_r2, -0.1745F, 0.1397F, 0.6684F);
        stock20_r2.cubeList.add(new ModelBox(stock20_r2, 41, 140, -0.4F, 0.2F, -3.2F, 1, 1, 6, 0.1F, false));

        stock19_r1 = new ModelRenderer(this);
        stock19_r1.setRotationPoint(0, -1.0187F, 50.4855F);
        stockSawed.addChild(stock19_r1);
        setRotationAngle(stock19_r1, 1.8589F, 0, 0);
        stock19_r1.cubeList.add(new ModelBox(stock19_r1, 73, 0, -2.92F, -20, 20.3F, 2, 4, 4, 0, false));
        stock19_r1.cubeList.add(new ModelBox(stock19_r1, 27, 83, -1.08F, -20, 20.3F, 2, 4, 4, 0, false));

        stock13_r1 = new ModelRenderer(this);
        stock13_r1.setRotationPoint(0, 0.1964F, -0.246F);
        stockSawed.addChild(stock13_r1);
        setRotationAngle(stock13_r1, -0.2231F, 0, 0);
        stock13_r1.cubeList.add(new ModelBox(stock13_r1, 67, 140, -1.9F, -27, 18.6F, 1, 1, 6, 0, false));
        stock13_r1.cubeList.add(new ModelBox(stock13_r1, 98, 140, -1.1F, -27, 18.6F, 1, 1, 6, 0, false));

        stock5_r1 = new ModelRenderer(this);
        stock5_r1.setRotationPoint(0, -2.7746F, 38.9488F);
        stockSawed.addChild(stock5_r1);
        setRotationAngle(stock5_r1, 1.3756F, 0, 0);
        stock5_r1.cubeList.add(new ModelBox(stock5_r1, 67, 68, -2, -25.5F, 12, 2, 4, 1, 0, false));

        stock12_r1 = new ModelRenderer(this);
        stock12_r1.setRotationPoint(0.4F, -16.2953F, 24.2282F);
        stockSawed.addChild(stock12_r1);
        setRotationAngle(stock12_r1, 0.6041F, 0.6127F, 0.3778F);
        stock12_r1.cubeList.add(new ModelBox(stock12_r1, 22, 46, -1, -2, -0.4F, 1, 4, 1, 0, false));

        stock12_r2 = new ModelRenderer(this);
        stock12_r2.setRotationPoint(0, 11.1071F, 18.2815F);
        stockSawed.addChild(stock12_r2);
        setRotationAngle(stock12_r2, 0.4833F, 0, 0);
        stock12_r2.cubeList.add(new ModelBox(stock12_r2, 71, 9, -1.1F, -23.5F, 18.5F, 2, 4, 1, 0, false));
        stock12_r2.cubeList.add(new ModelBox(stock12_r2, 0, 67, -2.9F, -25.5F, 18.5F, 2, 6, 2, 0, false));

        stock10_r1 = new ModelRenderer(this);
        stock10_r1.setRotationPoint(-1, -16.0074F, 31.3153F);
        stockSawed.addChild(stock10_r1);
        setRotationAngle(stock10_r1, 2.3571F, 0, 0);
        stock10_r1.cubeList.add(new ModelBox(stock10_r1, 97, 40, -1, -1.1F, -0.4F, 2, 2, 1, 0, false));

        stock10_r2 = new ModelRenderer(this);
        stock10_r2.setRotationPoint(0, -4.6801F, 58.7454F);
        stockSawed.addChild(stock10_r2);
        setRotationAngle(stock10_r2, 2.1564F, 0, 0);
        stock10_r2.cubeList.add(new ModelBox(stock10_r2, 114, 115, -2, -19.3F, 24.1F, 2, 2, 2, 0, false));

        stock9_r1 = new ModelRenderer(this);
        stock9_r1.setRotationPoint(0, 1.2928F, 48.7597F);
        stockSawed.addChild(stock9_r1);
        setRotationAngle(stock9_r1, 1.8589F, 0, 0);
        stock9_r1.cubeList.add(new ModelBox(stock9_r1, 104, 71, -2, -18.2F, 20.3F, 2, 4, 2, 0, false));

        stock8_r1 = new ModelRenderer(this);
        stock8_r1.setRotationPoint(0, 10.5794F, 21.2964F);
        stockSawed.addChild(stock8_r1);
        setRotationAngle(stock8_r1, 0.5949F, 0, 0);
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 47, 71, -2, -24.2F, 16.8F, 2, 7, 2, 0, false));

        stock2_r2 = new ModelRenderer(this);
        stock2_r2.setRotationPoint(0.4F, -22.7345F, 21.4299F);
        stockSawed.addChild(stock2_r2);
        setRotationAngle(stock2_r2, -0.355F, 0.2557F, 0.6287F);
        stock2_r2.cubeList.add(new ModelBox(stock2_r2, 124, 140, -0.6F, 0, -2.5F, 1, 1, 6, 0.1F, false));

        stock2_r3 = new ModelRenderer(this);
        stock2_r3.setRotationPoint(0, -3.9613F, -5.9505F);
        stockSawed.addChild(stock2_r3);
        setRotationAngle(stock2_r3, -0.4461F, 0, 0);
        stock2_r3.cubeList.add(new ModelBox(stock2_r3, 57, 126, -1.1F, -29.25F, 13.6F, 1, 1, 8, 0, false));
        stock2_r3.cubeList.add(new ModelBox(stock2_r3, 114, 126, -1.9F, -29.25F, 13.6F, 1, 1, 8, 0, false));

        stock4_r1 = new ModelRenderer(this);
        stock4_r1.setRotationPoint(0, 0.6042F, 37.7711F);
        stockSawed.addChild(stock4_r1);
        setRotationAngle(stock4_r1, 1.2269F, 0, 0);
        stock4_r1.cubeList.add(new ModelBox(stock4_r1, 57, 91, -0.1F, -26.4F, 13, 1, 7, 1, 0, false));
        stock4_r1.cubeList.add(new ModelBox(stock4_r1, 75, 64, -2.91F, -26.4F, 13, 1, 7, 2, 0, false));

        stock6_r1 = new ModelRenderer(this);
        stock6_r1.setRotationPoint(0.5F, -18.9264F, 20.7637F);
        stockSawed.addChild(stock6_r1);
        setRotationAngle(stock6_r1, 1.3187F, 0.2364F, 0.7378F);
        stock6_r1.cubeList.add(new ModelBox(stock6_r1, 19, 92, -1, -3.7F, -0.5F, 1, 7, 1, 0, false));

        stock6_r2 = new ModelRenderer(this);
        stock6_r2.setRotationPoint(0, 1.2008F, 36.9238F);
        stockSawed.addChild(stock6_r2);
        setRotationAngle(stock6_r2, 1.2269F, 0, 0);
        stock6_r2.cubeList.add(new ModelBox(stock6_r2, 88, 26, -2, -26.5F, 13, 2, 8, 2, 0, false));

        stock22_r1 = new ModelRenderer(this);
        stock22_r1.setRotationPoint(-1.9F, -14.8875F, 27.6011F);
        stockSawed.addChild(stock22_r1);
        setRotationAngle(stock22_r1, 1.7532F, 0.2243F, -0.8782F);
        stock22_r1.cubeList.add(new ModelBox(stock22_r1, 20, 74, -0.1F, -2, -0.1F, 1, 4, 1, 0.1F, false));

        stock12_r3 = new ModelRenderer(this);
        stock12_r3.setRotationPoint(-2.4F, -16.2953F, 24.2282F);
        stockSawed.addChild(stock12_r3);
        setRotationAngle(stock12_r3, 0.6041F, -0.6127F, -0.3778F);
        stock12_r3.cubeList.add(new ModelBox(stock12_r3, 77, 75, 0, -2, -0.4F, 1, 4, 1, 0, false));

        stock6_r3 = new ModelRenderer(this);
        stock6_r3.setRotationPoint(-2.5F, -18.9264F, 20.7637F);
        stockSawed.addChild(stock6_r3);
        setRotationAngle(stock6_r3, 1.3187F, -0.2364F, -0.7378F);
        stock6_r3.cubeList.add(new ModelBox(stock6_r3, 118, 0, 0, -3.7F, -0.5F, 1, 7, 1, 0, false));

        stock22_r2 = new ModelRenderer(this);
        stock22_r2.setRotationPoint(-0.1F, -14.8875F, 27.6011F);
        stockSawed.addChild(stock22_r2);
        setRotationAngle(stock22_r2, 1.7532F, -0.2243F, 0.8782F);
        stock22_r2.cubeList.add(new ModelBox(stock22_r2, 81, 16, -0.9F, -2, -0.1F, 1, 4, 1, 0.1F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        stockSawed.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
