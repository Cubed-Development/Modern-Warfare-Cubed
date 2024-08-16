package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington870Stock extends ModelWithAttachments {
    private final ModelRenderer stock;
    private final ModelRenderer stock29_r1;
    private final ModelRenderer stock28_r1;
    private final ModelRenderer stock28_r2;
    private final ModelRenderer stock27_r1;
    private final ModelRenderer gun463_r1;
    private final ModelRenderer stock24_r1;
    private final ModelRenderer stock10_r1;
    private final ModelRenderer stock8_r1;
    private final ModelRenderer stock17_r1;
    private final ModelRenderer stock24_r2;
    private final ModelRenderer stock24_r3;
    private final ModelRenderer stock24_r4;
    private final ModelRenderer stock24_r5;
    private final ModelRenderer stock24_r6;
    private final ModelRenderer stock24_r7;
    private final ModelRenderer stock2_r1;
    private final ModelRenderer stock17_r2;
    private final ModelRenderer stock24_r8;
    private final ModelRenderer stock23_r1;
    private final ModelRenderer stock18_r1;
    private final ModelRenderer stock17_r3;
    private final ModelRenderer stock17_r4;
    private final ModelRenderer stock15_r1;
    private final ModelRenderer stock14_r1;
    private final ModelRenderer stock5_r1;
    private final ModelRenderer stock9_r1;
    private final ModelRenderer stock8_r2;
    private final ModelRenderer stock2_r2;
    private final ModelRenderer stock2_r3;
    private final ModelRenderer stock6_r1;

    public Remington870Stock() {
        textureWidth = 410;
        textureHeight = 410;

        stock = new ModelRenderer(this);
        stock.setRotationPoint(0.0F, -47.5488F, 40.3807F);
        stock.cubeList.add(new ModelBox(stock, 42, 90, -1.1F, 45.2988F, -20.7807F, 1, 1, 5, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 70, 75, -1.9F, 45.2988F, -20.7807F, 1, 1, 5, 0.0F, false));

        stock29_r1 = new ModelRenderer(this);
        stock29_r1.setRotationPoint(0.0F, 0.0F, -0.3F);
        stock.addChild(stock29_r1);
        setRotationAngle(stock29_r1, -1.8589F, 0.0F, 0.0F);
        stock29_r1.cubeList.add(new ModelBox(stock29_r1, 66, 93, -3.1F, -22.7F, 47.1F, 4, 2, 3, 0.1F, false));

        stock28_r1 = new ModelRenderer(this);
        stock28_r1.setRotationPoint(0.0F, 62.0415F, -46.4761F);
        stock.addChild(stock28_r1);
        setRotationAngle(stock28_r1, -0.1164F, 0.0F, 0.0F);
        stock28_r1.cubeList.add(new ModelBox(stock28_r1, 355, 128, -1.103F, -18.7F, 35.0F, 2, 4, 16, 0.0F, false));
        stock28_r1.cubeList.add(new ModelBox(stock28_r1, 52, 351, -2.897F, -18.7F, 35.0F, 2, 4, 16, 0.0F, false));

        stock28_r2 = new ModelRenderer(this);
        stock28_r2.setRotationPoint(0.0F, 62.0415F, -46.4761F);
        stock.addChild(stock28_r2);
        setRotationAngle(stock28_r2, -0.3346F, 0.0F, 0.0F);
        stock28_r2.cubeList.add(new ModelBox(stock28_r2, 200, 360, -1.1F, -25.8F, 24.5F, 2, 4, 22, 0.0F, false));
        stock28_r2.cubeList.add(new ModelBox(stock28_r2, 152, 360, -2.9F, -25.8F, 24.5F, 2, 4, 22, 0.0F, false));

        stock27_r1 = new ModelRenderer(this);
        stock27_r1.setRotationPoint(0.0F, 62.0415F, -46.7761F);
        stock.addChild(stock27_r1);
        setRotationAngle(stock27_r1, -0.3346F, 0.0F, 0.0F);
        stock27_r1.cubeList.add(new ModelBox(stock27_r1, 99, 93, -2.1F, -21.9F, 46.5F, 2, 1, 2, 0.1F, false));
        stock27_r1.cubeList.add(new ModelBox(stock27_r1, 27, 91, -3.1F, -24.9F, 46.5F, 4, 3, 2, 0.1F, false));

        gun463_r1 = new ModelRenderer(this);
        gun463_r1.setRotationPoint(0.0F, 62.4594F, -51.249F);
        stock.addChild(gun463_r1);
        setRotationAngle(gun463_r1, -0.4461F, 0.0F, 0.0F);
        gun463_r1.cubeList.add(new ModelBox(gun463_r1, 114, 115, -2.9F, -28.5F, 13.6F, 1, 3, 8, 0.0F, false));

        stock24_r1 = new ModelRenderer(this);
        stock24_r1.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r1);
        setRotationAngle(stock24_r1, -0.1487F, 0.0F, 0.0F);
        stock24_r1.cubeList.add(new ModelBox(stock24_r1, 76, 352, -0.9F, -27.0F, 24.6F, 2, 2, 23, 0.0F, false));
        stock24_r1.cubeList.add(new ModelBox(stock24_r1, 355, 71, 0.9F, -27.0F, 24.6F, 2, 2, 23, 0.0F, false));

        stock10_r1 = new ModelRenderer(this);
        stock10_r1.setRotationPoint(-2.0F, 61.6672F, 13.1233F);
        stock.addChild(stock10_r1);
        setRotationAngle(stock10_r1, 2.1564F, 0.0F, 0.0F);
        stock10_r1.cubeList.add(new ModelBox(stock10_r1, 10, 67, -0.9F, -20.3F, 25.1F, 1, 4, 2, 0.0F, false));
        stock10_r1.cubeList.add(new ModelBox(stock10_r1, 67, 57, 1.9F, -20.3F, 25.1F, 1, 4, 2, 0.0F, false));
        stock10_r1.cubeList.add(new ModelBox(stock10_r1, 57, 115, 0.0F, -19.3F, 24.1F, 2, 3, 2, 0.0F, false));

        stock8_r1 = new ModelRenderer(this);
        stock8_r1.setRotationPoint(-2.0F, 76.9896F, -27.4551F);
        stock.addChild(stock8_r1);
        setRotationAngle(stock8_r1, 0.6579F, 0.0F, 0.0F);
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 18, 83, -0.9F, -19.9F, 22.0F, 1, 6, 2, 0.0F, false));
        stock8_r1.cubeList.add(new ModelBox(stock8_r1, 75, 83, 1.9F, -19.9F, 22.0F, 1, 6, 2, 0.0F, false));

        stock17_r1 = new ModelRenderer(this);
        stock17_r1.setRotationPoint(-2.0F, 36.5701F, -52.2013F);
        stock.addChild(stock17_r1);
        setRotationAngle(stock17_r1, -1.1719F, 0.0F, 0.0F);
        stock17_r1.cubeList.add(new ModelBox(stock17_r1, 84, 83, -0.89F, -30.4F, 21.5F, 1, 5, 4, 0.0F, false));
        stock17_r1.cubeList.add(new ModelBox(stock17_r1, 88, 0, 1.89F, -30.4F, 21.6F, 1, 5, 4, 0.0F, false));

        stock24_r2 = new ModelRenderer(this);
        stock24_r2.setRotationPoint(0.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r2);
        setRotationAngle(stock24_r2, -0.1055F, -0.105F, -0.7798F);
        stock24_r2.cubeList.add(new ModelBox(stock24_r2, 0, 103, 18.6F, -19.6F, 47.3F, 1, 1, 2, 0.1F, false));
        stock24_r2.cubeList.add(new ModelBox(stock24_r2, 360, 0, 18.6F, -19.6F, 24.2F, 1, 1, 23, 0.0F, false));

        stock24_r3 = new ModelRenderer(this);
        stock24_r3.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r3);
        setRotationAngle(stock24_r3, -0.2342F, 0.2465F, 0.7809F);
        stock24_r3.cubeList.add(new ModelBox(stock24_r3, 49, 100, -18.3F, -19.9F, 42.0F, 1, 1, 2, 0.1F, false));
        stock24_r3.cubeList.add(new ModelBox(stock24_r3, 254, 48, -18.3F, -20.1F, 22.2F, 1, 1, 19, 0.0F, false));

        stock24_r4 = new ModelRenderer(this);
        stock24_r4.setRotationPoint(2.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r4);
        setRotationAngle(stock24_r4, -0.2342F, -0.2465F, -0.7809F);
        stock24_r4.cubeList.add(new ModelBox(stock24_r4, 241, 24, 15.9F, -21.6F, 22.4F, 1, 1, 19, 0.0F, false));
        stock24_r4.cubeList.add(new ModelBox(stock24_r4, 39, 100, 15.8F, -21.6F, 42.0F, 1, 1, 2, 0.1F, false));

        stock24_r5 = new ModelRenderer(this);
        stock24_r5.setRotationPoint(2.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r5);
        setRotationAngle(stock24_r5, -0.2877F, -0.3512F, -0.7996F);
        stock24_r5.cubeList.add(new ModelBox(stock24_r5, 9, 84, 17.4F, -21.2F, 5.2F, 1, 1, 7, 0.0F, false));

        stock24_r6 = new ModelRenderer(this);
        stock24_r6.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r6);
        setRotationAngle(stock24_r6, -0.2877F, 0.3512F, 0.7996F);
        stock24_r6.cubeList.add(new ModelBox(stock24_r6, 84, 130, -19.6F, -19.5F, 5.2F, 1, 1, 7, 0.0F, false));

        stock24_r7 = new ModelRenderer(this);
        stock24_r7.setRotationPoint(-2.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r7);
        setRotationAngle(stock24_r7, -0.1055F, 0.105F, 0.7798F);
        stock24_r7.cubeList.add(new ModelBox(stock24_r7, 253, 350, -19.6F, -19.6F, 24.2F, 1, 1, 23, 0.0F, false));
        stock24_r7.cubeList.add(new ModelBox(stock24_r7, 96, 100, -19.6F, -19.6F, 47.3F, 1, 1, 2, 0.1F, false));

        stock2_r1 = new ModelRenderer(this);
        stock2_r1.setRotationPoint(-2.0F, 62.386F, -51.5726F);
        stock.addChild(stock2_r1);
        setRotationAngle(stock2_r1, -0.3734F, -0.2501F, -0.5634F);
        stock2_r1.cubeList.add(new ModelBox(stock2_r1, 57, 140, 15.7F, -23.65F, 13.9F, 1, 1, 8, 0.0F, false));

        stock17_r2 = new ModelRenderer(this);
        stock17_r2.setRotationPoint(-2.0F, 36.5701F, -52.2013F);
        stock.addChild(stock17_r2);
        setRotationAngle(stock17_r2, -1.2585F, 0.2523F, -0.6582F);
        stock17_r2.cubeList.add(new ModelBox(stock17_r2, 84, 71, -14.49F, -30.4F, 16.1F, 1, 5, 1, 0.0F, false));

        stock24_r8 = new ModelRenderer(this);
        stock24_r8.setRotationPoint(0.0F, 67.6059F, -44.1096F);
        stock.addChild(stock24_r8);
        setRotationAngle(stock24_r8, -0.4541F, 0.0F, 0.0F);
        stock24_r8.cubeList.add(new ModelBox(stock24_r8, 57, 115, -0.1F, -29.9F, 4.6F, 1, 3, 8, 0.0F, false));

        stock23_r1 = new ModelRenderer(this);
        stock23_r1.setRotationPoint(0.0F, 67.6059F, -44.4096F);
        stock.addChild(stock23_r1);
        setRotationAngle(stock23_r1, -0.1487F, 0.0F, 0.0F);
        stock23_r1.cubeList.add(new ModelBox(stock23_r1, 101, 52, -2.1F, -27.8F, 47.6F, 2, 1, 2, 0.1F, false));
        stock23_r1.cubeList.add(new ModelBox(stock23_r1, 84, 64, -3.1F, -27.0F, 47.6F, 4, 4, 2, 0.1F, false));

        stock18_r1 = new ModelRenderer(this);
        stock18_r1.setRotationPoint(0.0F, 62.0969F, -46.1477F);
        stock.addChild(stock18_r1);
        setRotationAngle(stock18_r1, -0.3346F, 0.0F, 0.0F);
        stock18_r1.cubeList.add(new ModelBox(stock18_r1, 114, 252, -2.0F, -21.8F, 25.1F, 2, 1, 21, 0.0F, false));

        stock17_r3 = new ModelRenderer(this);
        stock17_r3.setRotationPoint(0.0F, 36.5701F, -52.2013F);
        stock.addChild(stock17_r3);
        setRotationAngle(stock17_r3, -1.2585F, -0.2523F, 0.6582F);
        stock17_r3.cubeList.add(new ModelBox(stock17_r3, 88, 14, 13.49F, -30.4F, 16.1F, 1, 5, 1, 0.0F, false));

        stock17_r4 = new ModelRenderer(this);
        stock17_r4.setRotationPoint(0.0F, 36.5701F, -52.2013F);
        stock.addChild(stock17_r4);
        setRotationAngle(stock17_r4, -1.041F, 0.0F, 0.0F);
        stock17_r4.cubeList.add(new ModelBox(stock17_r4, 42, 83, -1.1F, -27.8F, 24.6F, 1, 4, 1, 0.0F, false));
        stock17_r4.cubeList.add(new ModelBox(stock17_r4, 84, 57, -1.9F, -27.8F, 24.6F, 1, 4, 1, 0.0F, false));

        stock15_r1 = new ModelRenderer(this);
        stock15_r1.setRotationPoint(0.0F, 47.5588F, -52.706F);
        stock.addChild(stock15_r1);
        setRotationAngle(stock15_r1, -0.7436F, 0.0F, 0.0F);
        stock15_r1.cubeList.add(new ModelBox(stock15_r1, 88, 40, -2.0F, -27.8F, 24.6F, 2, 3, 1, 0.0F, false));

        stock14_r1 = new ModelRenderer(this);
        stock14_r1.setRotationPoint(0.0F, 67.597F, -44.2282F);
        stock.addChild(stock14_r1);
        setRotationAngle(stock14_r1, -0.1487F, 0.0F, 0.0F);
        stock14_r1.cubeList.add(new ModelBox(stock14_r1, 0, 248, -2.0F, -27.8F, 24.6F, 2, 1, 23, 0.0F, false));

        stock5_r1 = new ModelRenderer(this);
        stock5_r1.setRotationPoint(0.0F, 63.5727F, -6.6733F);
        stock.addChild(stock5_r1);
        setRotationAngle(stock5_r1, 1.3756F, 0.0F, 0.0F);
        stock5_r1.cubeList.add(new ModelBox(stock5_r1, 71, 26, -2.0F, -25.5F, 12.0F, 2, 4, 1, 0.0F, false));

        stock9_r1 = new ModelRenderer(this);
        stock9_r1.setRotationPoint(0.0F, 67.6401F, 3.1376F);
        stock.addChild(stock9_r1);
        setRotationAngle(stock9_r1, 1.8589F, 0.0F, 0.0F);
        stock9_r1.cubeList.add(new ModelBox(stock9_r1, 0, 114, -2.0F, -18.2F, 20.3F, 2, 4, 2, 0.0F, false));

        stock8_r2 = new ModelRenderer(this);
        stock8_r2.setRotationPoint(0.0F, 76.9896F, -27.4551F);
        stock.addChild(stock8_r2);
        setRotationAngle(stock8_r2, 0.4833F, 0.0F, 0.0F);
        stock8_r2.cubeList.add(new ModelBox(stock8_r2, 57, 68, -2.0F, -23.5F, 17.5F, 2, 6, 2, 0.0F, false));

        stock2_r2 = new ModelRenderer(this);
        stock2_r2.setRotationPoint(0.0F, 62.386F, -51.5726F);
        stock.addChild(stock2_r2);
        setRotationAngle(stock2_r2, -0.3734F, 0.2501F, 0.5634F);
        stock2_r2.cubeList.add(new ModelBox(stock2_r2, 140, 97, -16.7F, -23.65F, 13.9F, 1, 1, 8, 0.0F, false));

        stock2_r3 = new ModelRenderer(this);
        stock2_r3.setRotationPoint(0.0F, 62.386F, -51.5726F);
        stock.addChild(stock2_r3);
        setRotationAngle(stock2_r3, -0.4461F, 0.0F, 0.0F);
        stock2_r3.cubeList.add(new ModelBox(stock2_r3, 142, 71, -1.1F, -29.25F, 13.6F, 1, 1, 8, 0.0F, false));
        stock2_r3.cubeList.add(new ModelBox(stock2_r3, 144, 14, -1.9F, -29.25F, 13.6F, 1, 1, 8, 0.0F, false));

        stock6_r1 = new ModelRenderer(this);
        stock6_r1.setRotationPoint(0.0F, 67.5481F, -8.6983F);
        stock.addChild(stock6_r1);
        setRotationAngle(stock6_r1, 1.2269F, 0.0F, 0.0F);
        stock6_r1.cubeList.add(new ModelBox(stock6_r1, 27, 97, -2.0F, -26.5F, 13.0F, 2, 8, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        stock.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
