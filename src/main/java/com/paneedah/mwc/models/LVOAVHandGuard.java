package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class LVOAVHandGuard extends ModelBase {
    private final ModelRenderer handguard;
    private final ModelRenderer handguard28_r1;
    private final ModelRenderer handguard28_r2;
    private final ModelRenderer handguard35_r1;
    private final ModelRenderer handguard34_r1;
    private final ModelRenderer handguard33_r1;
    private final ModelRenderer handguard32_r1;
    private final ModelRenderer handguard31_r1;
    private final ModelRenderer handguard30_r1;
    private final ModelRenderer handguard29_r1;
    private final ModelRenderer handguard28_r3;
    private final ModelRenderer handguard35_r2;
    private final ModelRenderer handguard34_r2;
    private final ModelRenderer handguard33_r2;
    private final ModelRenderer handguard32_r2;
    private final ModelRenderer handguard31_r2;
    private final ModelRenderer handguard30_r2;
    private final ModelRenderer handguard29_r2;
    private final ModelRenderer handguard28_r4;
    private final ModelRenderer handguard27_r1;
    private final ModelRenderer handguard30_r3;
    private final ModelRenderer handguard29_r3;
    private final ModelRenderer handguard28_r5;
    private final ModelRenderer handguard30_r4;
    private final ModelRenderer handguard29_r4;
    private final ModelRenderer handguard28_r6;
    private final ModelRenderer handguard31_r3;
    private final ModelRenderer handguard30_r5;
    private final ModelRenderer handguard29_r5;
    private final ModelRenderer handguard32_r3;
    private final ModelRenderer handguard31_r4;
    private final ModelRenderer handguard30_r6;
    private final ModelRenderer handguard33_r3;
    private final ModelRenderer handguard32_r4;
    private final ModelRenderer handguard31_r5;
    private final ModelRenderer handguard34_r3;
    private final ModelRenderer handguard33_r4;
    private final ModelRenderer handguard32_r5;
    private final ModelRenderer handguard35_r3;
    private final ModelRenderer handguard34_r4;
    private final ModelRenderer handguard33_r5;
    private final ModelRenderer handguard36_r1;
    private final ModelRenderer handguard35_r4;
    private final ModelRenderer handguard34_r5;
    private final ModelRenderer handguard37_r1;
    private final ModelRenderer handguard36_r2;
    private final ModelRenderer handguard35_r5;
    private final ModelRenderer handguard38_r1;
    private final ModelRenderer handguard37_r2;
    private final ModelRenderer handguard36_r3;
    private final ModelRenderer handguard31_r6;
    private final ModelRenderer handguard30_r7;
    private final ModelRenderer handguard29_r6;
    private final ModelRenderer handguard32_r6;
    private final ModelRenderer handguard31_r7;
    private final ModelRenderer handguard30_r8;
    private final ModelRenderer handguard33_r6;
    private final ModelRenderer handguard32_r7;
    private final ModelRenderer handguard31_r8;
    private final ModelRenderer handguard34_r6;
    private final ModelRenderer handguard33_r7;
    private final ModelRenderer handguard32_r8;
    private final ModelRenderer handguard35_r6;
    private final ModelRenderer handguard34_r7;
    private final ModelRenderer handguard33_r8;
    private final ModelRenderer handguard36_r4;
    private final ModelRenderer handguard35_r7;
    private final ModelRenderer handguard34_r8;
    private final ModelRenderer handguard37_r3;
    private final ModelRenderer handguard36_r5;
    private final ModelRenderer handguard35_r8;
    private final ModelRenderer handguard38_r2;
    private final ModelRenderer handguard37_r4;
    private final ModelRenderer handguard36_r6;
    private final ModelRenderer handguard30_r9;
    private final ModelRenderer handguard29_r7;
    private final ModelRenderer handguard31_r9;
    private final ModelRenderer handguard30_r10;
    private final ModelRenderer handguard29_r8;
    private final ModelRenderer handguard79_r1;
    private final ModelRenderer handguard78_r1;
    private final ModelRenderer handguard81_r1;
    private final ModelRenderer handguard80_r1;
    private final ModelRenderer handguard82_r1;
    private final ModelRenderer handguard81_r2;
    private final ModelRenderer handguard82_r2;
    private final ModelRenderer handguard81_r3;
    private final ModelRenderer handguard84_r1;
    private final ModelRenderer handguard83_r1;
    private final ModelRenderer handguard84_r2;
    private final ModelRenderer handguard83_r2;
    private final ModelRenderer handguard83_r3;
    private final ModelRenderer handguard82_r3;
    private final ModelRenderer handguard82_r4;
    private final ModelRenderer handguard81_r4;
    private final ModelRenderer handguard83_r4;
    private final ModelRenderer handguard82_r5;
    private final ModelRenderer handguard83_r5;
    private final ModelRenderer handguard82_r6;
    private final ModelRenderer handguard82_r7;
    private final ModelRenderer handguard81_r5;
    private final ModelRenderer handguard81_r6;
    private final ModelRenderer handguard80_r2;
    private final ModelRenderer handguard80_r3;
    private final ModelRenderer handguard79_r2;
    private final ModelRenderer handguard79_r3;
    private final ModelRenderer handguard78_r2;
    private final ModelRenderer handguard82_r8;
    private final ModelRenderer handguard81_r7;
    private final ModelRenderer handguard82_r9;
    private final ModelRenderer handguard81_r8;
    private final ModelRenderer handguard81_r9;
    private final ModelRenderer handguard80_r4;
    private final ModelRenderer handguard80_r5;
    private final ModelRenderer handguard79_r4;
    private final ModelRenderer handguard83_r6;
    private final ModelRenderer handguard82_r10;
    private final ModelRenderer handguard83_r7;
    private final ModelRenderer handguard82_r11;
    private final ModelRenderer handguard82_r12;
    private final ModelRenderer handguard81_r10;
    private final ModelRenderer handguard81_r11;
    private final ModelRenderer handguard80_r6;
    private final ModelRenderer handguard82_r13;
    private final ModelRenderer handguard81_r12;
    private final ModelRenderer handguard82_r14;
    private final ModelRenderer handguard81_r13;
    private final ModelRenderer handguard81_r14;
    private final ModelRenderer handguard80_r7;
    private final ModelRenderer handguard80_r8;
    private final ModelRenderer handguard79_r5;
    private final ModelRenderer handguard81_r15;
    private final ModelRenderer handguard80_r9;
    private final ModelRenderer handguard81_r16;
    private final ModelRenderer handguard80_r10;
    private final ModelRenderer handguard80_r11;
    private final ModelRenderer handguard79_r6;
    private final ModelRenderer handguard79_r7;
    private final ModelRenderer handguard78_r3;
    private final ModelRenderer handguard78_r4;
    private final ModelRenderer handguard77_r1;
    private final ModelRenderer handguard76_r1;
    private final ModelRenderer handguard75_r1;

    public LVOAVHandGuard() {
        textureWidth = 200;
        textureHeight = 200;

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(0.0F, 24.0F, 0.0F);
        handguard.cubeList.add(new ModelBox(handguard, 44, 0, -3.801F, -37.7F, -59.7F, 1, 1, 37, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 43, 41, -3.8F, -38.3F, -59.7F, 1, 1, 37, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 45, 79, -0.2F, -37.7F, -59.7F, 1, 1, 37, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 87, 114, 0.303F, -38.5F, -60.0F, 1, 1, 34, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 83, 0, -4.3F, -38.5F, -60.0F, 1, 1, 34, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 84, 79, 0.3F, -37.5F, -60.0F, 1, 1, 34, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 82, 38, -4.3F, -37.5F, -60.0F, 1, 1, 34, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 41, -2.5F, -35.9F, -61.7F, 2, 1, 39, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 0, -2.5F, -40.1F, -62.699F, 2, 1, 40, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 16, 35, -1.15F, -40.3F, -62.699F, 1, 1, 1, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 20, 26, -2.85F, -40.3F, -62.699F, 1, 1, 1, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 16, 32, -1.15F, -40.3F, -61.799F, 1, 1, 1, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 18, 29, -2.85F, -40.3F, -61.799F, 1, 1, 1, -0.3F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 81, -0.199F, -38.3F, -59.699F, 1, 1, 37, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 43, 53, 0.001F, -38.2F, -26.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 18, 38, -4.001F, -38.2F, -26.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 53, 41, 0.002F, -37.8F, -26.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 35, 44, -4.002F, -37.8F, -26.7F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 32, 53, 0.002F, -38.0F, -59.701F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 24, 51, -4.002F, -38.0F, -59.701F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 50, 52, 0.002F, -38.0F, -51.201F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 4, 51, -4.002F, -38.0F, -51.201F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 30, 0.002F, -38.0F, -42.701F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 43, 49, -4.002F, -38.0F, -42.701F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 32, 51, 0.002F, -38.0F, -34.301F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 49, 29, -4.002F, -38.0F, -34.301F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 28, 53, 0.002F, -38.0F, -56.301F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 16, 51, -4.002F, -38.0F, -56.301F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 4, 53, 0.002F, -38.0F, -47.801F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 50, 50, -4.002F, -38.0F, -47.801F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 34, 0.002F, -38.0F, -39.301F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 49, 33, -4.002F, -38.0F, -39.301F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 26, 0.002F, -38.0F, -30.901F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 49, 25, -4.002F, -38.0F, -30.901F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 16, 53, 0.002F, -38.0F, -52.901F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 8, 51, -4.002F, -38.0F, -52.901F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 12, 53, 0.002F, -38.0F, -44.401F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 50, 38, -4.002F, -38.0F, -44.401F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 46, 52, 0.002F, -38.0F, -35.901F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 30, 49, -4.002F, -38.0F, -35.901F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 28, 51, -0.001F, -38.0F, -27.501F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 35, 42, -3.999F, -38.0F, -27.501F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 24, 53, 0.002F, -38.0F, -58.001F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 20, 51, -4.002F, -38.0F, -58.001F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 53, 0.002F, -38.0F, -49.501F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 51, -4.002F, -38.0F, -49.501F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 32, 0.002F, -38.0F, -41.001F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 49, 35, -4.002F, -38.0F, -41.001F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 43, 51, 0.002F, -38.0F, -32.601F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 49, 27, -4.002F, -38.0F, -32.601F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 20, 53, 0.002F, -38.0F, -54.601F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 12, 51, -4.002F, -38.0F, -54.601F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 8, 53, 0.002F, -38.0F, -46.101F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 46, 50, -4.002F, -38.0F, -46.101F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 35, 52, 0.002F, -38.0F, -37.601F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 49, 31, -4.002F, -38.0F, -37.601F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 52, 28, 0.002F, -38.0F, -29.201F, 1, 1, 1, 0.0F, false));
        handguard.cubeList.add(new ModelBox(handguard, 35, 46, -4.002F, -38.0F, -29.201F, 1, 1, 1, 0.0F, false));

        handguard28_r1 = new ModelRenderer(this);
        handguard28_r1.setRotationPoint(0.8F, -38.3F, -59.7F);
        handguard.addChild(handguard28_r1);
        setRotationAngle(handguard28_r1, 0.0F, -0.6458F, 0.8378F);
        handguard28_r1.cubeList.add(new ModelBox(handguard28_r1, 24, 49, -2.0F, 0.001F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard28_r2 = new ModelRenderer(this);
        handguard28_r2.setRotationPoint(0.8F, -38.3F, -59.7F);
        handguard.addChild(handguard28_r2);
        setRotationAngle(handguard28_r2, 0.0F, 0.0F, 0.8378F);
        handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 125, 134, -2.5F, -0.201F, 2.8F, 1, 1, 32, -0.2F, false));
        handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 24, 4, -2.4F, 0.0F, -3.0F, 1, 1, 3, 0.0F, false));
        handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 78, 149, -0.8F, -0.201F, 2.8F, 1, 1, 32, -0.2F, false));
        handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 48, 46, -2.0F, 0.001F, 33.399F, 2, 1, 1, 0.0F, false));
        handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 0, 12, -2.0F, -0.002F, 33.999F, 2, 1, 3, 0.0F, false));
        handguard28_r2.cubeList.add(new ModelBox(handguard28_r2, 7, 13, -2.0F, -0.001F, 0.0F, 2, 1, 3, 0.0F, false));

        handguard35_r1 = new ModelRenderer(this);
        handguard35_r1.setRotationPoint(-0.6F, -39.855F, -28.4F);
        handguard.addChild(handguard35_r1);
        setRotationAngle(handguard35_r1, 0.0F, 0.4538F, 0.8378F);
        handguard35_r1.cubeList.add(new ModelBox(handguard35_r1, 0, 49, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard34_r1 = new ModelRenderer(this);
        handguard34_r1.setRotationPoint(-0.6F, -39.855F, -32.2F);
        handguard.addChild(handguard34_r1);
        setRotationAngle(handguard34_r1, 0.0F, 0.4538F, 0.8378F);
        handguard34_r1.cubeList.add(new ModelBox(handguard34_r1, 49, 3, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard33_r1 = new ModelRenderer(this);
        handguard33_r1.setRotationPoint(-0.6F, -39.855F, -36.0F);
        handguard.addChild(handguard33_r1);
        setRotationAngle(handguard33_r1, 0.0F, 0.4538F, 0.8378F);
        handguard33_r1.cubeList.add(new ModelBox(handguard33_r1, 6, 49, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard32_r1 = new ModelRenderer(this);
        handguard32_r1.setRotationPoint(-0.6F, -39.855F, -39.8F);
        handguard.addChild(handguard32_r1);
        setRotationAngle(handguard32_r1, 0.0F, 0.4538F, 0.8378F);
        handguard32_r1.cubeList.add(new ModelBox(handguard32_r1, 49, 9, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard31_r1 = new ModelRenderer(this);
        handguard31_r1.setRotationPoint(-0.6F, -39.855F, -43.6F);
        handguard.addChild(handguard31_r1);
        setRotationAngle(handguard31_r1, 0.0F, 0.4538F, 0.8378F);
        handguard31_r1.cubeList.add(new ModelBox(handguard31_r1, 12, 49, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard30_r1 = new ModelRenderer(this);
        handguard30_r1.setRotationPoint(-0.6F, -39.855F, -47.4F);
        handguard.addChild(handguard30_r1);
        setRotationAngle(handguard30_r1, 0.0F, 0.4538F, 0.8378F);
        handguard30_r1.cubeList.add(new ModelBox(handguard30_r1, 49, 15, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard29_r1 = new ModelRenderer(this);
        handguard29_r1.setRotationPoint(-0.6F, -39.855F, -51.2F);
        handguard.addChild(handguard29_r1);
        setRotationAngle(handguard29_r1, 0.0F, 0.4538F, 0.8378F);
        handguard29_r1.cubeList.add(new ModelBox(handguard29_r1, 18, 49, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard28_r3 = new ModelRenderer(this);
        handguard28_r3.setRotationPoint(-0.6F, -39.855F, -55.0F);
        handguard.addChild(handguard28_r3);
        setRotationAngle(handguard28_r3, 0.0F, 0.4538F, 0.8378F);
        handguard28_r3.cubeList.add(new ModelBox(handguard28_r3, 49, 21, -0.2F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard35_r2 = new ModelRenderer(this);
        handguard35_r2.setRotationPoint(-0.6F, -39.855F, -26.3F);
        handguard.addChild(handguard35_r2);
        setRotationAngle(handguard35_r2, 0.0F, -0.4538F, 0.8378F);
        handguard35_r2.cubeList.add(new ModelBox(handguard35_r2, 48, 48, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard34_r2 = new ModelRenderer(this);
        handguard34_r2.setRotationPoint(-0.6F, -39.855F, -30.1F);
        handguard.addChild(handguard34_r2);
        setRotationAngle(handguard34_r2, 0.0F, -0.4538F, 0.8378F);
        handguard34_r2.cubeList.add(new ModelBox(handguard34_r2, 49, 1, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard33_r2 = new ModelRenderer(this);
        handguard33_r2.setRotationPoint(-0.6F, -39.855F, -33.9F);
        handguard.addChild(handguard33_r2);
        setRotationAngle(handguard33_r2, 0.0F, -0.4538F, 0.8378F);
        handguard33_r2.cubeList.add(new ModelBox(handguard33_r2, 49, 5, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard32_r2 = new ModelRenderer(this);
        handguard32_r2.setRotationPoint(-0.6F, -39.855F, -37.7F);
        handguard.addChild(handguard32_r2);
        setRotationAngle(handguard32_r2, 0.0F, -0.4538F, 0.8378F);
        handguard32_r2.cubeList.add(new ModelBox(handguard32_r2, 49, 7, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard31_r2 = new ModelRenderer(this);
        handguard31_r2.setRotationPoint(-0.6F, -39.855F, -41.5F);
        handguard.addChild(handguard31_r2);
        setRotationAngle(handguard31_r2, 0.0F, -0.4538F, 0.8378F);
        handguard31_r2.cubeList.add(new ModelBox(handguard31_r2, 49, 11, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard30_r2 = new ModelRenderer(this);
        handguard30_r2.setRotationPoint(-0.6F, -39.855F, -45.3F);
        handguard.addChild(handguard30_r2);
        setRotationAngle(handguard30_r2, 0.0F, -0.4538F, 0.8378F);
        handguard30_r2.cubeList.add(new ModelBox(handguard30_r2, 49, 13, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard29_r2 = new ModelRenderer(this);
        handguard29_r2.setRotationPoint(-0.6F, -39.855F, -49.1F);
        handguard.addChild(handguard29_r2);
        setRotationAngle(handguard29_r2, 0.0F, -0.4538F, 0.8378F);
        handguard29_r2.cubeList.add(new ModelBox(handguard29_r2, 49, 17, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard28_r4 = new ModelRenderer(this);
        handguard28_r4.setRotationPoint(-0.6F, -39.855F, -52.9F);
        handguard.addChild(handguard28_r4);
        setRotationAngle(handguard28_r4, 0.0F, -0.4538F, 0.8378F);
        handguard28_r4.cubeList.add(new ModelBox(handguard28_r4, 49, 19, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard27_r1 = new ModelRenderer(this);
        handguard27_r1.setRotationPoint(-0.6F, -39.855F, -56.7F);
        handguard.addChild(handguard27_r1);
        setRotationAngle(handguard27_r1, 0.0F, -0.4538F, 0.8378F);
        handguard27_r1.cubeList.add(new ModelBox(handguard27_r1, 49, 23, -0.2F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard30_r3 = new ModelRenderer(this);
        handguard30_r3.setRotationPoint(-3.8F, -38.3F, -25.7F);
        handguard.addChild(handguard30_r3);
        setRotationAngle(handguard30_r3, 0.0F, 0.0F, -0.8378F);
        handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 0, 0, 0.0F, -0.002F, -0.001F, 2, 1, 3, 0.0F, false));
        handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 24, 43, 0.0F, 0.001F, -0.601F, 2, 1, 1, 0.0F, false));
        handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 118, 35, -0.2F, -0.201F, -31.2F, 1, 1, 32, -0.2F, false));
        handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 24, 0, 1.4F, 0.0F, -37.0F, 1, 1, 3, 0.0F, false));
        handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 44, 117, 1.5F, -0.201F, -31.2F, 1, 1, 32, -0.2F, false));
        handguard30_r3.cubeList.add(new ModelBox(handguard30_r3, 0, 4, 0.0F, -0.001F, -34.0F, 2, 1, 3, 0.0F, false));

        handguard29_r3 = new ModelRenderer(this);
        handguard29_r3.setRotationPoint(-3.8F, -36.7F, -25.7F);
        handguard.addChild(handguard29_r3);
        setRotationAngle(handguard29_r3, 0.0F, 0.0F, 0.8378F);
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 7, 1, 0.0F, -0.998F, -0.001F, 2, 1, 3, 0.0F, false));
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 44, 30, 0.0F, -1.001F, -0.601F, 2, 1, 1, 0.0F, false));
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 119, 0, -0.2F, -0.799F, -31.2F, 1, 1, 32, -0.2F, false));
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 30, 35, 1.4F, -1.0F, -36.0F, 1, 1, 2, 0.0F, false));
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 24, 13, 1.0F, -1.002F, -35.9F, 1, 1, 2, 0.0F, false));
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 0, 119, 1.5F, -0.799F, -31.2F, 1, 1, 32, -0.2F, false));
        handguard29_r3.cubeList.add(new ModelBox(handguard29_r3, 7, 5, 0.0F, -0.999F, -34.0F, 2, 1, 3, 0.0F, false));

        handguard28_r5 = new ModelRenderer(this);
        handguard28_r5.setRotationPoint(0.8F, -36.7F, -25.7F);
        handguard.addChild(handguard28_r5);
        setRotationAngle(handguard28_r5, 0.0F, 0.0F, -0.8378F);
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 0, 8, -2.0F, -0.998F, -0.001F, 2, 1, 3, 0.0F, false));
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 48, 44, -2.0F, -1.001F, -0.601F, 2, 1, 1, 0.0F, false));
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 123, 101, -0.8F, -0.799F, -31.2F, 1, 1, 32, -0.2F, false));
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 24, 17, -2.0F, -1.002F, -35.9F, 1, 1, 2, 0.0F, false));
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 22, 36, -2.4F, -1.0F, -36.0F, 1, 1, 2, 0.0F, false));
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 120, 68, -2.5F, -0.799F, -31.2F, 1, 1, 32, -0.2F, false));
        handguard28_r5.cubeList.add(new ModelBox(handguard28_r5, 7, 9, -2.0F, -0.999F, -34.0F, 2, 1, 3, 0.0F, false));

        handguard30_r4 = new ModelRenderer(this);
        handguard30_r4.setRotationPoint(-2.4F, -39.855F, -56.7F);
        handguard.addChild(handguard30_r4);
        setRotationAngle(handguard30_r4, 0.0F, 0.4538F, -0.8378F);
        handguard30_r4.cubeList.add(new ModelBox(handguard30_r4, 18, 43, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard29_r4 = new ModelRenderer(this);
        handguard29_r4.setRotationPoint(-2.4F, -35.145F, -56.7F);
        handguard.addChild(handguard29_r4);
        setRotationAngle(handguard29_r4, 0.0F, 0.4538F, 0.8378F);
        handguard29_r4.cubeList.add(new ModelBox(handguard29_r4, 44, 28, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard28_r6 = new ModelRenderer(this);
        handguard28_r6.setRotationPoint(-0.6F, -35.145F, -56.7F);
        handguard.addChild(handguard28_r6);
        setRotationAngle(handguard28_r6, 0.0F, -0.4538F, -0.8378F);
        handguard28_r6.cubeList.add(new ModelBox(handguard28_r6, 48, 42, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard31_r3 = new ModelRenderer(this);
        handguard31_r3.setRotationPoint(-2.4F, -39.855F, -52.9F);
        handguard.addChild(handguard31_r3);
        setRotationAngle(handguard31_r3, 0.0F, 0.4538F, -0.8378F);
        handguard31_r3.cubeList.add(new ModelBox(handguard31_r3, 12, 43, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard30_r5 = new ModelRenderer(this);
        handguard30_r5.setRotationPoint(-2.4F, -35.145F, -52.9F);
        handguard.addChild(handguard30_r5);
        setRotationAngle(handguard30_r5, 0.0F, 0.4538F, 0.8378F);
        handguard30_r5.cubeList.add(new ModelBox(handguard30_r5, 44, 26, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard29_r5 = new ModelRenderer(this);
        handguard29_r5.setRotationPoint(-0.6F, -35.145F, -52.9F);
        handguard.addChild(handguard29_r5);
        setRotationAngle(handguard29_r5, 0.0F, -0.4538F, -0.8378F);
        handguard29_r5.cubeList.add(new ModelBox(handguard29_r5, 43, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard32_r3 = new ModelRenderer(this);
        handguard32_r3.setRotationPoint(-2.4F, -39.855F, -49.1F);
        handguard.addChild(handguard32_r3);
        setRotationAngle(handguard32_r3, 0.0F, 0.4538F, -0.8378F);
        handguard32_r3.cubeList.add(new ModelBox(handguard32_r3, 6, 43, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard31_r4 = new ModelRenderer(this);
        handguard31_r4.setRotationPoint(-2.4F, -35.145F, -49.1F);
        handguard.addChild(handguard31_r4);
        setRotationAngle(handguard31_r4, 0.0F, 0.4538F, 0.8378F);
        handguard31_r4.cubeList.add(new ModelBox(handguard31_r4, 44, 24, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard30_r6 = new ModelRenderer(this);
        handguard30_r6.setRotationPoint(-0.6F, -35.145F, -49.1F);
        handguard.addChild(handguard30_r6);
        setRotationAngle(handguard30_r6, 0.0F, -0.4538F, -0.8378F);
        handguard30_r6.cubeList.add(new ModelBox(handguard30_r6, 30, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard33_r3 = new ModelRenderer(this);
        handguard33_r3.setRotationPoint(-2.4F, -39.855F, -45.3F);
        handguard.addChild(handguard33_r3);
        setRotationAngle(handguard33_r3, 0.0F, 0.4538F, -0.8378F);
        handguard33_r3.cubeList.add(new ModelBox(handguard33_r3, 0, 43, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard32_r4 = new ModelRenderer(this);
        handguard32_r4.setRotationPoint(-2.4F, -35.145F, -45.3F);
        handguard.addChild(handguard32_r4);
        setRotationAngle(handguard32_r4, 0.0F, 0.4538F, 0.8378F);
        handguard32_r4.cubeList.add(new ModelBox(handguard32_r4, 44, 22, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard31_r5 = new ModelRenderer(this);
        handguard31_r5.setRotationPoint(-0.6F, -35.145F, -45.3F);
        handguard.addChild(handguard31_r5);
        setRotationAngle(handguard31_r5, 0.0F, -0.4538F, -0.8378F);
        handguard31_r5.cubeList.add(new ModelBox(handguard31_r5, 24, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard34_r3 = new ModelRenderer(this);
        handguard34_r3.setRotationPoint(-2.4F, -39.855F, -41.5F);
        handguard.addChild(handguard34_r3);
        setRotationAngle(handguard34_r3, 0.0F, 0.4538F, -0.8378F);
        handguard34_r3.cubeList.add(new ModelBox(handguard34_r3, 30, 41, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard33_r4 = new ModelRenderer(this);
        handguard33_r4.setRotationPoint(-2.4F, -35.145F, -41.5F);
        handguard.addChild(handguard33_r4);
        setRotationAngle(handguard33_r4, 0.0F, 0.4538F, 0.8378F);
        handguard33_r4.cubeList.add(new ModelBox(handguard33_r4, 44, 20, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard32_r5 = new ModelRenderer(this);
        handguard32_r5.setRotationPoint(-0.6F, -35.145F, -41.5F);
        handguard.addChild(handguard32_r5);
        setRotationAngle(handguard32_r5, 0.0F, -0.4538F, -0.8378F);
        handguard32_r5.cubeList.add(new ModelBox(handguard32_r5, 18, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard35_r3 = new ModelRenderer(this);
        handguard35_r3.setRotationPoint(-2.4F, -39.855F, -37.7F);
        handguard.addChild(handguard35_r3);
        setRotationAngle(handguard35_r3, 0.0F, 0.4538F, -0.8378F);
        handguard35_r3.cubeList.add(new ModelBox(handguard35_r3, 24, 41, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard34_r4 = new ModelRenderer(this);
        handguard34_r4.setRotationPoint(-2.4F, -35.145F, -37.7F);
        handguard.addChild(handguard34_r4);
        setRotationAngle(handguard34_r4, 0.0F, 0.4538F, 0.8378F);
        handguard34_r4.cubeList.add(new ModelBox(handguard34_r4, 44, 18, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard33_r5 = new ModelRenderer(this);
        handguard33_r5.setRotationPoint(-0.6F, -35.145F, -37.7F);
        handguard.addChild(handguard33_r5);
        setRotationAngle(handguard33_r5, 0.0F, -0.4538F, -0.8378F);
        handguard33_r5.cubeList.add(new ModelBox(handguard33_r5, 12, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard36_r1 = new ModelRenderer(this);
        handguard36_r1.setRotationPoint(-2.4F, -39.855F, -33.9F);
        handguard.addChild(handguard36_r1);
        setRotationAngle(handguard36_r1, 0.0F, 0.4538F, -0.8378F);
        handguard36_r1.cubeList.add(new ModelBox(handguard36_r1, 18, 41, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard35_r4 = new ModelRenderer(this);
        handguard35_r4.setRotationPoint(-2.4F, -35.145F, -33.9F);
        handguard.addChild(handguard35_r4);
        setRotationAngle(handguard35_r4, 0.0F, 0.4538F, 0.8378F);
        handguard35_r4.cubeList.add(new ModelBox(handguard35_r4, 44, 16, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard34_r5 = new ModelRenderer(this);
        handguard34_r5.setRotationPoint(-0.6F, -35.145F, -33.9F);
        handguard.addChild(handguard34_r5);
        setRotationAngle(handguard34_r5, 0.0F, -0.4538F, -0.8378F);
        handguard34_r5.cubeList.add(new ModelBox(handguard34_r5, 6, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard37_r1 = new ModelRenderer(this);
        handguard37_r1.setRotationPoint(-2.4F, -39.855F, -30.1F);
        handguard.addChild(handguard37_r1);
        setRotationAngle(handguard37_r1, 0.0F, 0.4538F, -0.8378F);
        handguard37_r1.cubeList.add(new ModelBox(handguard37_r1, 12, 41, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard36_r2 = new ModelRenderer(this);
        handguard36_r2.setRotationPoint(-2.4F, -35.145F, -30.1F);
        handguard.addChild(handguard36_r2);
        setRotationAngle(handguard36_r2, 0.0F, 0.4538F, 0.8378F);
        handguard36_r2.cubeList.add(new ModelBox(handguard36_r2, 44, 14, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard35_r5 = new ModelRenderer(this);
        handguard35_r5.setRotationPoint(-0.6F, -35.145F, -30.1F);
        handguard.addChild(handguard35_r5);
        setRotationAngle(handguard35_r5, 0.0F, -0.4538F, -0.8378F);
        handguard35_r5.cubeList.add(new ModelBox(handguard35_r5, 0, 47, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard38_r1 = new ModelRenderer(this);
        handguard38_r1.setRotationPoint(-2.4F, -39.855F, -26.3F);
        handguard.addChild(handguard38_r1);
        setRotationAngle(handguard38_r1, 0.0F, 0.4538F, -0.8378F);
        handguard38_r1.cubeList.add(new ModelBox(handguard38_r1, 6, 41, -1.8F, 0.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard37_r2 = new ModelRenderer(this);
        handguard37_r2.setRotationPoint(-2.4F, -35.145F, -26.3F);
        handguard.addChild(handguard37_r2);
        setRotationAngle(handguard37_r2, 0.0F, 0.4538F, 0.8378F);
        handguard37_r2.cubeList.add(new ModelBox(handguard37_r2, 44, 12, -1.8F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard36_r3 = new ModelRenderer(this);
        handguard36_r3.setRotationPoint(-0.6F, -35.145F, -26.3F);
        handguard.addChild(handguard36_r3);
        setRotationAngle(handguard36_r3, 0.0F, -0.4538F, -0.8378F);
        handguard36_r3.cubeList.add(new ModelBox(handguard36_r3, 43, 45, -0.2F, -1.0F, -1.0F, 2, 1, 1, 0.0F, false));

        handguard31_r6 = new ModelRenderer(this);
        handguard31_r6.setRotationPoint(-2.4F, -39.855F, -55.0F);
        handguard.addChild(handguard31_r6);
        setRotationAngle(handguard31_r6, 0.0F, -0.4538F, -0.8378F);
        handguard31_r6.cubeList.add(new ModelBox(handguard31_r6, 0, 41, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard30_r7 = new ModelRenderer(this);
        handguard30_r7.setRotationPoint(-2.4F, -35.145F, -55.0F);
        handguard.addChild(handguard30_r7);
        setRotationAngle(handguard30_r7, 0.0F, -0.4538F, 0.8378F);
        handguard30_r7.cubeList.add(new ModelBox(handguard30_r7, 44, 10, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard29_r6 = new ModelRenderer(this);
        handguard29_r6.setRotationPoint(-0.6F, -35.145F, -55.0F);
        handguard.addChild(handguard29_r6);
        setRotationAngle(handguard29_r6, 0.0F, 0.4538F, -0.8378F);
        handguard29_r6.cubeList.add(new ModelBox(handguard29_r6, 30, 45, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard32_r6 = new ModelRenderer(this);
        handguard32_r6.setRotationPoint(-2.4F, -39.855F, -51.2F);
        handguard.addChild(handguard32_r6);
        setRotationAngle(handguard32_r6, 0.0F, -0.4538F, -0.8378F);
        handguard32_r6.cubeList.add(new ModelBox(handguard32_r6, 33, 38, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard31_r7 = new ModelRenderer(this);
        handguard31_r7.setRotationPoint(-2.4F, -35.145F, -51.2F);
        handguard.addChild(handguard31_r7);
        setRotationAngle(handguard31_r7, 0.0F, -0.4538F, 0.8378F);
        handguard31_r7.cubeList.add(new ModelBox(handguard31_r7, 44, 8, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard30_r8 = new ModelRenderer(this);
        handguard30_r8.setRotationPoint(-0.6F, -35.145F, -51.2F);
        handguard.addChild(handguard30_r8);
        setRotationAngle(handguard30_r8, 0.0F, 0.4538F, -0.8378F);
        handguard30_r8.cubeList.add(new ModelBox(handguard30_r8, 24, 45, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard33_r6 = new ModelRenderer(this);
        handguard33_r6.setRotationPoint(-2.4F, -39.855F, -47.4F);
        handguard.addChild(handguard33_r6);
        setRotationAngle(handguard33_r6, 0.0F, -0.4538F, -0.8378F);
        handguard33_r6.cubeList.add(new ModelBox(handguard33_r6, 27, 38, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard32_r7 = new ModelRenderer(this);
        handguard32_r7.setRotationPoint(-2.4F, -35.145F, -47.4F);
        handguard.addChild(handguard32_r7);
        setRotationAngle(handguard32_r7, 0.0F, -0.4538F, 0.8378F);
        handguard32_r7.cubeList.add(new ModelBox(handguard32_r7, 44, 6, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard31_r8 = new ModelRenderer(this);
        handguard31_r8.setRotationPoint(-0.6F, -35.145F, -47.4F);
        handguard.addChild(handguard31_r8);
        setRotationAngle(handguard31_r8, 0.0F, 0.4538F, -0.8378F);
        handguard31_r8.cubeList.add(new ModelBox(handguard31_r8, 18, 45, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard34_r6 = new ModelRenderer(this);
        handguard34_r6.setRotationPoint(-2.4F, -39.855F, -43.6F);
        handguard.addChild(handguard34_r6);
        setRotationAngle(handguard34_r6, 0.0F, -0.4538F, -0.8378F);
        handguard34_r6.cubeList.add(new ModelBox(handguard34_r6, 12, 38, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard33_r7 = new ModelRenderer(this);
        handguard33_r7.setRotationPoint(-2.4F, -35.145F, -43.6F);
        handguard.addChild(handguard33_r7);
        setRotationAngle(handguard33_r7, 0.0F, -0.4538F, 0.8378F);
        handguard33_r7.cubeList.add(new ModelBox(handguard33_r7, 44, 4, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard32_r8 = new ModelRenderer(this);
        handguard32_r8.setRotationPoint(-0.6F, -35.145F, -43.6F);
        handguard.addChild(handguard32_r8);
        setRotationAngle(handguard32_r8, 0.0F, 0.4538F, -0.8378F);
        handguard32_r8.cubeList.add(new ModelBox(handguard32_r8, 12, 45, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard35_r6 = new ModelRenderer(this);
        handguard35_r6.setRotationPoint(-2.4F, -39.855F, -39.8F);
        handguard.addChild(handguard35_r6);
        setRotationAngle(handguard35_r6, 0.0F, -0.4538F, -0.8378F);
        handguard35_r6.cubeList.add(new ModelBox(handguard35_r6, 6, 38, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard34_r7 = new ModelRenderer(this);
        handguard34_r7.setRotationPoint(-2.4F, -35.145F, -39.8F);
        handguard.addChild(handguard34_r7);
        setRotationAngle(handguard34_r7, 0.0F, -0.4538F, 0.8378F);
        handguard34_r7.cubeList.add(new ModelBox(handguard34_r7, 44, 2, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard33_r8 = new ModelRenderer(this);
        handguard33_r8.setRotationPoint(-0.6F, -35.145F, -39.8F);
        handguard.addChild(handguard33_r8);
        setRotationAngle(handguard33_r8, 0.0F, 0.4538F, -0.8378F);
        handguard33_r8.cubeList.add(new ModelBox(handguard33_r8, 6, 45, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard36_r4 = new ModelRenderer(this);
        handguard36_r4.setRotationPoint(-2.4F, -39.855F, -36.0F);
        handguard.addChild(handguard36_r4);
        setRotationAngle(handguard36_r4, 0.0F, -0.4538F, -0.8378F);
        handguard36_r4.cubeList.add(new ModelBox(handguard36_r4, 0, 38, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard35_r7 = new ModelRenderer(this);
        handguard35_r7.setRotationPoint(-2.4F, -35.145F, -36.0F);
        handguard.addChild(handguard35_r7);
        setRotationAngle(handguard35_r7, 0.0F, -0.4538F, 0.8378F);
        handguard35_r7.cubeList.add(new ModelBox(handguard35_r7, 44, 0, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard34_r8 = new ModelRenderer(this);
        handguard34_r8.setRotationPoint(-0.6F, -35.145F, -36.0F);
        handguard.addChild(handguard34_r8);
        setRotationAngle(handguard34_r8, 0.0F, 0.4538F, -0.8378F);
        handguard34_r8.cubeList.add(new ModelBox(handguard34_r8, 0, 45, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard37_r3 = new ModelRenderer(this);
        handguard37_r3.setRotationPoint(-2.4F, -39.855F, -32.2F);
        handguard.addChild(handguard37_r3);
        setRotationAngle(handguard37_r3, 0.0F, -0.4538F, -0.8378F);
        handguard37_r3.cubeList.add(new ModelBox(handguard37_r3, 34, 35, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard36_r5 = new ModelRenderer(this);
        handguard36_r5.setRotationPoint(-2.4F, -35.145F, -32.2F);
        handguard.addChild(handguard36_r5);
        setRotationAngle(handguard36_r5, 0.0F, -0.4538F, 0.8378F);
        handguard36_r5.cubeList.add(new ModelBox(handguard36_r5, 43, 43, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard35_r8 = new ModelRenderer(this);
        handguard35_r8.setRotationPoint(-0.6F, -35.145F, -32.2F);
        handguard.addChild(handguard35_r8);
        setRotationAngle(handguard35_r8, 0.0F, 0.4538F, -0.8378F);
        handguard35_r8.cubeList.add(new ModelBox(handguard35_r8, 44, 38, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard38_r2 = new ModelRenderer(this);
        handguard38_r2.setRotationPoint(-2.4F, -39.855F, -28.4F);
        handguard.addChild(handguard38_r2);
        setRotationAngle(handguard38_r2, 0.0F, -0.4538F, -0.8378F);
        handguard38_r2.cubeList.add(new ModelBox(handguard38_r2, 33, 8, -1.8F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard37_r4 = new ModelRenderer(this);
        handguard37_r4.setRotationPoint(-2.4F, -35.145F, -28.4F);
        handguard.addChild(handguard37_r4);
        setRotationAngle(handguard37_r4, 0.0F, -0.4538F, 0.8378F);
        handguard37_r4.cubeList.add(new ModelBox(handguard37_r4, 43, 41, -1.8F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard36_r6 = new ModelRenderer(this);
        handguard36_r6.setRotationPoint(-0.6F, -35.145F, -28.4F);
        handguard.addChild(handguard36_r6);
        setRotationAngle(handguard36_r6, 0.0F, 0.4538F, -0.8378F);
        handguard36_r6.cubeList.add(new ModelBox(handguard36_r6, 44, 34, -0.2F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard30_r9 = new ModelRenderer(this);
        handguard30_r9.setRotationPoint(-3.8F, -36.7F, -62.3F);
        handguard.addChild(handguard30_r9);
        setRotationAngle(handguard30_r9, 0.0F, -0.733F, 0.8378F);
        handguard30_r9.cubeList.add(new ModelBox(handguard30_r9, 36, 14, 1.2F, -1.001F, -1.2F, 1, 1, 1, 0.0F, false));

        handguard29_r7 = new ModelRenderer(this);
        handguard29_r7.setRotationPoint(0.8F, -36.7F, -62.3F);
        handguard.addChild(handguard29_r7);
        setRotationAngle(handguard29_r7, 0.0F, 0.733F, -0.8378F);
        handguard29_r7.cubeList.add(new ModelBox(handguard29_r7, 36, 32, -2.2F, -1.001F, -1.2F, 1, 1, 1, 0.0F, false));

        handguard31_r9 = new ModelRenderer(this);
        handguard31_r9.setRotationPoint(-3.8F, -38.3F, -59.7F);
        handguard.addChild(handguard31_r9);
        setRotationAngle(handguard31_r9, 0.0F, 0.6458F, -0.8378F);
        handguard31_r9.cubeList.add(new ModelBox(handguard31_r9, 10, 17, 0.0F, 0.001F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard30_r10 = new ModelRenderer(this);
        handguard30_r10.setRotationPoint(-3.8F, -36.7F, -59.7F);
        handguard.addChild(handguard30_r10);
        setRotationAngle(handguard30_r10, 0.0F, 0.6458F, 0.8378F);
        handguard30_r10.cubeList.add(new ModelBox(handguard30_r10, 30, 43, 0.0F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard29_r8 = new ModelRenderer(this);
        handguard29_r8.setRotationPoint(0.8F, -36.7F, -59.7F);
        handguard.addChild(handguard29_r8);
        setRotationAngle(handguard29_r8, 0.0F, -0.6458F, -0.8378F);
        handguard29_r8.cubeList.add(new ModelBox(handguard29_r8, 44, 32, -2.0F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));

        handguard79_r1 = new ModelRenderer(this);
        handguard79_r1.setRotationPoint(-4.2F, -37.3F, -27.7F);
        handguard.addChild(handguard79_r1);
        setRotationAngle(handguard79_r1, 0.3316F, 0.0F, -0.1571F);
        handguard79_r1.cubeList.add(new ModelBox(handguard79_r1, 25, 20, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard78_r1 = new ModelRenderer(this);
        handguard78_r1.setRotationPoint(1.2F, -37.3F, -27.7F);
        handguard.addChild(handguard78_r1);
        setRotationAngle(handguard78_r1, 0.3316F, 0.0F, 0.1571F);
        handguard78_r1.cubeList.add(new ModelBox(handguard78_r1, 12, 35, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r1 = new ModelRenderer(this);
        handguard81_r1.setRotationPoint(-4.2F, -36.9F, -28.8F);
        handguard.addChild(handguard81_r1);
        setRotationAngle(handguard81_r1, 0.5934F, -0.0873F, -0.2793F);
        handguard81_r1.cubeList.add(new ModelBox(handguard81_r1, 16, 26, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r1 = new ModelRenderer(this);
        handguard80_r1.setRotationPoint(1.2F, -36.9F, -28.8F);
        handguard.addChild(handguard80_r1);
        setRotationAngle(handguard80_r1, 0.5934F, 0.0873F, 0.2793F);
        handguard80_r1.cubeList.add(new ModelBox(handguard80_r1, 34, 29, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r1 = new ModelRenderer(this);
        handguard82_r1.setRotationPoint(-3.9F, -36.15F, -29.95F);
        handguard.addChild(handguard82_r1);
        setRotationAngle(handguard82_r1, 0.4363F, -0.3316F, -0.5236F);
        handguard82_r1.cubeList.add(new ModelBox(handguard82_r1, 22, 26, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r2 = new ModelRenderer(this);
        handguard81_r2.setRotationPoint(0.9F, -36.15F, -29.95F);
        handguard.addChild(handguard81_r2);
        setRotationAngle(handguard81_r2, 0.4363F, 0.3316F, 0.5236F);
        handguard81_r2.cubeList.add(new ModelBox(handguard81_r2, 34, 26, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r2 = new ModelRenderer(this);
        handguard82_r2.setRotationPoint(-3.9F, -38.85F, -29.95F);
        handguard.addChild(handguard82_r2);
        setRotationAngle(handguard82_r2, -0.4363F, -0.3316F, 0.5236F);
        handguard82_r2.cubeList.add(new ModelBox(handguard82_r2, 26, 27, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r3 = new ModelRenderer(this);
        handguard81_r3.setRotationPoint(0.9F, -38.85F, -29.95F);
        handguard.addChild(handguard81_r3);
        setRotationAngle(handguard81_r3, -0.4363F, 0.3316F, -0.5236F);
        handguard81_r3.cubeList.add(new ModelBox(handguard81_r3, 8, 34, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard84_r1 = new ModelRenderer(this);
        handguard84_r1.setRotationPoint(-4.0F, -36.45F, -40.35F);
        handguard.addChild(handguard84_r1);
        setRotationAngle(handguard84_r1, 0.4189F, -0.1571F, -0.384F);
        handguard84_r1.cubeList.add(new ModelBox(handguard84_r1, 0, 16, -0.301F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard83_r1 = new ModelRenderer(this);
        handguard83_r1.setRotationPoint(1.0F, -36.45F, -40.35F);
        handguard.addChild(handguard83_r1);
        setRotationAngle(handguard83_r1, 0.4189F, 0.1571F, 0.384F);
        handguard83_r1.cubeList.add(new ModelBox(handguard83_r1, 19, 13, -0.699F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard84_r2 = new ModelRenderer(this);
        handguard84_r2.setRotationPoint(-4.0F, -36.45F, -44.15F);
        handguard.addChild(handguard84_r2);
        setRotationAngle(handguard84_r2, 0.4189F, -0.1571F, -0.384F);
        handguard84_r2.cubeList.add(new ModelBox(handguard84_r2, 5, 17, -0.301F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard83_r2 = new ModelRenderer(this);
        handguard83_r2.setRotationPoint(1.0F, -36.45F, -44.15F);
        handguard.addChild(handguard83_r2);
        setRotationAngle(handguard83_r2, 0.4189F, 0.1571F, 0.384F);
        handguard83_r2.cubeList.add(new ModelBox(handguard83_r2, 19, 5, -0.699F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard83_r3 = new ModelRenderer(this);
        handguard83_r3.setRotationPoint(-4.0F, -36.45F, -35.85F);
        handguard.addChild(handguard83_r3);
        setRotationAngle(handguard83_r3, 0.4189F, -0.1571F, -0.384F);
        handguard83_r3.cubeList.add(new ModelBox(handguard83_r3, 14, 8, -0.301F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard82_r3 = new ModelRenderer(this);
        handguard82_r3.setRotationPoint(1.0F, -36.45F, -35.85F);
        handguard.addChild(handguard82_r3);
        setRotationAngle(handguard82_r3, 0.4189F, 0.1571F, 0.384F);
        handguard82_r3.cubeList.add(new ModelBox(handguard82_r3, 0, 20, -0.699F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard82_r4 = new ModelRenderer(this);
        handguard82_r4.setRotationPoint(-4.0F, -36.45F, -32.35F);
        handguard.addChild(handguard82_r4);
        setRotationAngle(handguard82_r4, 0.4189F, -0.1571F, -0.384F);
        handguard82_r4.cubeList.add(new ModelBox(handguard82_r4, 14, 0, -0.301F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard81_r4 = new ModelRenderer(this);
        handguard81_r4.setRotationPoint(1.0F, -36.45F, -32.35F);
        handguard.addChild(handguard81_r4);
        setRotationAngle(handguard81_r4, 0.4189F, 0.1571F, 0.384F);
        handguard81_r4.cubeList.add(new ModelBox(handguard81_r4, 5, 21, -0.699F, -0.7F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard83_r4 = new ModelRenderer(this);
        handguard83_r4.setRotationPoint(-4.0F, -38.55F, -40.35F);
        handguard.addChild(handguard83_r4);
        setRotationAngle(handguard83_r4, -0.4189F, -0.1571F, 0.384F);
        handguard83_r4.cubeList.add(new ModelBox(handguard83_r4, 14, 16, -0.301F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard82_r5 = new ModelRenderer(this);
        handguard82_r5.setRotationPoint(1.0F, -38.55F, -40.35F);
        handguard.addChild(handguard82_r5);
        setRotationAngle(handguard82_r5, -0.4189F, 0.1571F, -0.384F);
        handguard82_r5.cubeList.add(new ModelBox(handguard82_r5, 19, 17, -0.699F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard83_r5 = new ModelRenderer(this);
        handguard83_r5.setRotationPoint(-4.0F, -38.55F, -44.15F);
        handguard.addChild(handguard83_r5);
        setRotationAngle(handguard83_r5, -0.4189F, -0.1571F, 0.384F);
        handguard83_r5.cubeList.add(new ModelBox(handguard83_r5, 19, 1, -0.301F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard82_r6 = new ModelRenderer(this);
        handguard82_r6.setRotationPoint(1.0F, -38.55F, -44.15F);
        handguard.addChild(handguard82_r6);
        setRotationAngle(handguard82_r6, -0.4189F, 0.1571F, -0.384F);
        handguard82_r6.cubeList.add(new ModelBox(handguard82_r6, 19, 9, -0.699F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard82_r7 = new ModelRenderer(this);
        handguard82_r7.setRotationPoint(-4.0F, -38.55F, -35.85F);
        handguard.addChild(handguard82_r7);
        setRotationAngle(handguard82_r7, -0.4189F, -0.1571F, 0.384F);
        handguard82_r7.cubeList.add(new ModelBox(handguard82_r7, 14, 12, -0.301F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard81_r5 = new ModelRenderer(this);
        handguard81_r5.setRotationPoint(1.0F, -38.55F, -35.85F);
        handguard.addChild(handguard81_r5);
        setRotationAngle(handguard81_r5, -0.4189F, 0.1571F, -0.384F);
        handguard81_r5.cubeList.add(new ModelBox(handguard81_r5, 10, 20, -0.699F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard81_r6 = new ModelRenderer(this);
        handguard81_r6.setRotationPoint(-4.0F, -38.55F, -32.35F);
        handguard.addChild(handguard81_r6);
        setRotationAngle(handguard81_r6, -0.4189F, -0.1571F, 0.384F);
        handguard81_r6.cubeList.add(new ModelBox(handguard81_r6, 14, 4, -0.301F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard80_r2 = new ModelRenderer(this);
        handguard80_r2.setRotationPoint(1.0F, -38.55F, -32.35F);
        handguard.addChild(handguard80_r2);
        setRotationAngle(handguard80_r2, -0.4189F, 0.1571F, -0.384F);
        handguard80_r2.cubeList.add(new ModelBox(handguard80_r2, 15, 21, -0.699F, -0.3F, -2.7F, 1, 1, 3, -0.3F, false));

        handguard80_r3 = new ModelRenderer(this);
        handguard80_r3.setRotationPoint(-4.2F, -38.1F, -28.8F);
        handguard.addChild(handguard80_r3);
        setRotationAngle(handguard80_r3, -0.5934F, -0.0873F, 0.2793F);
        handguard80_r3.cubeList.add(new ModelBox(handguard80_r3, 26, 24, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard79_r2 = new ModelRenderer(this);
        handguard79_r2.setRotationPoint(1.2F, -38.1F, -28.8F);
        handguard.addChild(handguard79_r2);
        setRotationAngle(handguard79_r2, -0.5934F, 0.0873F, -0.2793F);
        handguard79_r2.cubeList.add(new ModelBox(handguard79_r2, 4, 35, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard79_r3 = new ModelRenderer(this);
        handguard79_r3.setRotationPoint(-4.3F, -38.2F, -28.6F);
        handguard.addChild(handguard79_r3);
        setRotationAngle(handguard79_r3, 0.0F, 0.0F, -0.0524F);
        handguard79_r3.cubeList.add(new ModelBox(handguard79_r3, 36, 10, -0.301F, -0.3F, -0.7F, 1, 2, 1, -0.3F, false));

        handguard78_r2 = new ModelRenderer(this);
        handguard78_r2.setRotationPoint(1.3F, -38.2F, -28.6F);
        handguard.addChild(handguard78_r2);
        setRotationAngle(handguard78_r2, 0.0F, 0.0F, 0.0524F);
        handguard78_r2.cubeList.add(new ModelBox(handguard78_r2, 35, 48, -0.699F, -0.3F, -0.7F, 1, 2, 1, -0.3F, false));

        handguard82_r8 = new ModelRenderer(this);
        handguard82_r8.setRotationPoint(-4.2F, -37.3F, -39.2F);
        handguard.addChild(handguard82_r8);
        setRotationAngle(handguard82_r8, 0.6807F, -0.0524F, -0.1571F);
        handguard82_r8.cubeList.add(new ModelBox(handguard82_r8, 29, 18, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r7 = new ModelRenderer(this);
        handguard81_r7.setRotationPoint(1.2F, -37.3F, -39.2F);
        handguard.addChild(handguard81_r7);
        setRotationAngle(handguard81_r7, 0.6807F, 0.0524F, 0.1571F);
        handguard81_r7.cubeList.add(new ModelBox(handguard81_r7, 12, 32, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r9 = new ModelRenderer(this);
        handguard82_r9.setRotationPoint(-4.2F, -37.3F, -43.0F);
        handguard.addChild(handguard82_r9);
        setRotationAngle(handguard82_r9, 0.6807F, -0.0524F, -0.1571F);
        handguard82_r9.cubeList.add(new ModelBox(handguard82_r9, 30, 25, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r8 = new ModelRenderer(this);
        handguard81_r8.setRotationPoint(1.2F, -37.3F, -43.0F);
        handguard.addChild(handguard81_r8);
        setRotationAngle(handguard81_r8, 0.6807F, 0.0524F, 0.1571F);
        handguard81_r8.cubeList.add(new ModelBox(handguard81_r8, 28, 31, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r9 = new ModelRenderer(this);
        handguard81_r9.setRotationPoint(-4.2F, -37.3F, -34.7F);
        handguard.addChild(handguard81_r9);
        setRotationAngle(handguard81_r9, 0.6807F, -0.0524F, -0.1571F);
        handguard81_r9.cubeList.add(new ModelBox(handguard81_r9, 4, 29, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r4 = new ModelRenderer(this);
        handguard80_r4.setRotationPoint(1.2F, -37.3F, -34.7F);
        handguard.addChild(handguard80_r4);
        setRotationAngle(handguard80_r4, 0.6807F, 0.0524F, 0.1571F);
        handguard80_r4.cubeList.add(new ModelBox(handguard80_r4, 33, 1, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r5 = new ModelRenderer(this);
        handguard80_r5.setRotationPoint(-4.2F, -37.3F, -31.2F);
        handguard.addChild(handguard80_r5);
        setRotationAngle(handguard80_r5, 0.6807F, -0.0524F, -0.1571F);
        handguard80_r5.cubeList.add(new ModelBox(handguard80_r5, 10, 28, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard79_r4 = new ModelRenderer(this);
        handguard79_r4.setRotationPoint(1.2F, -37.3F, -31.2F);
        handguard.addChild(handguard79_r4);
        setRotationAngle(handguard79_r4, 0.6807F, 0.0524F, 0.1571F);
        handguard79_r4.cubeList.add(new ModelBox(handguard79_r4, 34, 23, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard83_r6 = new ModelRenderer(this);
        handguard83_r6.setRotationPoint(-3.3F, -35.7F, -42.5F);
        handguard.addChild(handguard83_r6);
        setRotationAngle(handguard83_r6, -0.6458F, -0.3491F, -0.192F);
        handguard83_r6.cubeList.add(new ModelBox(handguard83_r6, 14, 29, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r10 = new ModelRenderer(this);
        handguard82_r10.setRotationPoint(0.3F, -35.7F, -42.5F);
        handguard.addChild(handguard82_r10);
        setRotationAngle(handguard82_r10, -0.6458F, 0.3491F, 0.192F);
        handguard82_r10.cubeList.add(new ModelBox(handguard82_r10, 32, 32, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard83_r7 = new ModelRenderer(this);
        handguard83_r7.setRotationPoint(-3.3F, -35.7F, -46.3F);
        handguard.addChild(handguard83_r7);
        setRotationAngle(handguard83_r7, -0.6458F, -0.3491F, -0.192F);
        handguard83_r7.cubeList.add(new ModelBox(handguard83_r7, 30, 28, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r11 = new ModelRenderer(this);
        handguard82_r11.setRotationPoint(0.3F, -35.7F, -46.3F);
        handguard.addChild(handguard82_r11);
        setRotationAngle(handguard82_r11, -0.6458F, 0.3491F, 0.192F);
        handguard82_r11.cubeList.add(new ModelBox(handguard82_r11, 4, 32, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r12 = new ModelRenderer(this);
        handguard82_r12.setRotationPoint(-3.3F, -35.7F, -38.0F);
        handguard.addChild(handguard82_r12);
        setRotationAngle(handguard82_r12, -0.6458F, -0.3491F, -0.192F);
        handguard82_r12.cubeList.add(new ModelBox(handguard82_r12, 29, 4, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r10 = new ModelRenderer(this);
        handguard81_r10.setRotationPoint(0.3F, -35.7F, -38.0F);
        handguard.addChild(handguard81_r10);
        setRotationAngle(handguard81_r10, -0.6458F, 0.3491F, 0.192F);
        handguard81_r10.cubeList.add(new ModelBox(handguard81_r10, 33, 20, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r11 = new ModelRenderer(this);
        handguard81_r11.setRotationPoint(-3.3F, -35.7F, -34.5F);
        handguard.addChild(handguard81_r11);
        setRotationAngle(handguard81_r11, -0.6458F, -0.3491F, -0.192F);
        handguard81_r11.cubeList.add(new ModelBox(handguard81_r11, 28, 12, -0.301F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r6 = new ModelRenderer(this);
        handguard80_r6.setRotationPoint(0.3F, -35.7F, -34.5F);
        handguard.addChild(handguard80_r6);
        setRotationAngle(handguard80_r6, -0.6458F, 0.3491F, 0.192F);
        handguard80_r6.cubeList.add(new ModelBox(handguard80_r6, 22, 33, -0.699F, -0.7F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r13 = new ModelRenderer(this);
        handguard82_r13.setRotationPoint(-3.3F, -39.3F, -42.5F);
        handguard.addChild(handguard82_r13);
        setRotationAngle(handguard82_r13, 0.6458F, -0.3491F, 0.192F);
        handguard82_r13.cubeList.add(new ModelBox(handguard82_r13, 29, 21, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r12 = new ModelRenderer(this);
        handguard81_r12.setRotationPoint(0.3F, -39.3F, -42.5F);
        handguard.addChild(handguard81_r12);
        setRotationAngle(handguard81_r12, 0.6458F, 0.3491F, -0.192F);
        handguard81_r12.cubeList.add(new ModelBox(handguard81_r12, 18, 32, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard82_r14 = new ModelRenderer(this);
        handguard82_r14.setRotationPoint(-3.3F, -39.3F, -46.3F);
        handguard.addChild(handguard82_r14);
        setRotationAngle(handguard82_r14, 0.6458F, -0.3491F, 0.192F);
        handguard82_r14.cubeList.add(new ModelBox(handguard82_r14, 0, 31, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r13 = new ModelRenderer(this);
        handguard81_r13.setRotationPoint(0.3F, -39.3F, -46.3F);
        handguard.addChild(handguard81_r13);
        setRotationAngle(handguard81_r13, 0.6458F, 0.3491F, -0.192F);
        handguard81_r13.cubeList.add(new ModelBox(handguard81_r13, 32, 11, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r14 = new ModelRenderer(this);
        handguard81_r14.setRotationPoint(-3.3F, -39.3F, -38.0F);
        handguard.addChild(handguard81_r14);
        setRotationAngle(handguard81_r14, 0.6458F, -0.3491F, 0.192F);
        handguard81_r14.cubeList.add(new ModelBox(handguard81_r14, 29, 8, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r7 = new ModelRenderer(this);
        handguard80_r7.setRotationPoint(0.3F, -39.3F, -38.0F);
        handguard.addChild(handguard80_r7);
        setRotationAngle(handguard80_r7, 0.6458F, 0.3491F, -0.192F);
        handguard80_r7.cubeList.add(new ModelBox(handguard80_r7, 33, 17, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r8 = new ModelRenderer(this);
        handguard80_r8.setRotationPoint(-3.3F, -39.3F, -34.5F);
        handguard.addChild(handguard80_r8);
        setRotationAngle(handguard80_r8, 0.6458F, -0.3491F, 0.192F);
        handguard80_r8.cubeList.add(new ModelBox(handguard80_r8, 28, 15, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard79_r5 = new ModelRenderer(this);
        handguard79_r5.setRotationPoint(0.3F, -39.3F, -34.5F);
        handguard.addChild(handguard79_r5);
        setRotationAngle(handguard79_r5, 0.6458F, 0.3491F, -0.192F);
        handguard79_r5.cubeList.add(new ModelBox(handguard79_r5, 0, 34, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r15 = new ModelRenderer(this);
        handguard81_r15.setRotationPoint(-4.2F, -37.7F, -39.2F);
        handguard.addChild(handguard81_r15);
        setRotationAngle(handguard81_r15, -0.6807F, -0.0524F, 0.1571F);
        handguard81_r15.cubeList.add(new ModelBox(handguard81_r15, 20, 29, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r9 = new ModelRenderer(this);
        handguard80_r9.setRotationPoint(1.2F, -37.7F, -39.2F);
        handguard.addChild(handguard80_r9);
        setRotationAngle(handguard80_r9, -0.6807F, 0.0524F, -0.1571F);
        handguard80_r9.cubeList.add(new ModelBox(handguard80_r9, 32, 14, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard81_r16 = new ModelRenderer(this);
        handguard81_r16.setRotationPoint(-4.2F, -37.7F, -43.0F);
        handguard.addChild(handguard81_r16);
        setRotationAngle(handguard81_r16, -0.6807F, -0.0524F, 0.1571F);
        handguard81_r16.cubeList.add(new ModelBox(handguard81_r16, 24, 30, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r10 = new ModelRenderer(this);
        handguard80_r10.setRotationPoint(1.2F, -37.7F, -43.0F);
        handguard.addChild(handguard80_r10);
        setRotationAngle(handguard80_r10, -0.6807F, 0.0524F, -0.1571F);
        handguard80_r10.cubeList.add(new ModelBox(handguard80_r10, 8, 31, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard80_r11 = new ModelRenderer(this);
        handguard80_r11.setRotationPoint(-4.2F, -37.7F, -34.7F);
        handguard.addChild(handguard80_r11);
        setRotationAngle(handguard80_r11, -0.6807F, -0.0524F, 0.1571F);
        handguard80_r11.cubeList.add(new ModelBox(handguard80_r11, 29, 0, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard79_r6 = new ModelRenderer(this);
        handguard79_r6.setRotationPoint(1.2F, -37.7F, -34.7F);
        handguard.addChild(handguard79_r6);
        setRotationAngle(handguard79_r6, -0.6807F, 0.0524F, -0.1571F);
        handguard79_r6.cubeList.add(new ModelBox(handguard79_r6, 33, 5, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard79_r7 = new ModelRenderer(this);
        handguard79_r7.setRotationPoint(-4.2F, -37.7F, -31.2F);
        handguard.addChild(handguard79_r7);
        setRotationAngle(handguard79_r7, -0.6807F, -0.0524F, 0.1571F);
        handguard79_r7.cubeList.add(new ModelBox(handguard79_r7, 0, 28, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard78_r3 = new ModelRenderer(this);
        handguard78_r3.setRotationPoint(1.2F, -37.7F, -31.2F);
        handguard.addChild(handguard78_r3);
        setRotationAngle(handguard78_r3, -0.6807F, 0.0524F, -0.1571F);
        handguard78_r3.cubeList.add(new ModelBox(handguard78_r3, 26, 34, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard78_r4 = new ModelRenderer(this);
        handguard78_r4.setRotationPoint(-4.2F, -37.7F, -27.7F);
        handguard.addChild(handguard78_r4);
        setRotationAngle(handguard78_r4, -0.3316F, 0.0F, 0.1571F);
        handguard78_r4.cubeList.add(new ModelBox(handguard78_r4, 6, 26, -0.301F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard77_r1 = new ModelRenderer(this);
        handguard77_r1.setRotationPoint(1.2F, -37.7F, -27.7F);
        handguard.addChild(handguard77_r1);
        setRotationAngle(handguard77_r1, -0.3316F, 0.0F, -0.1571F);
        handguard77_r1.cubeList.add(new ModelBox(handguard77_r1, 18, 35, -0.699F, -0.3F, -1.7F, 1, 1, 2, -0.3F, false));

        handguard76_r1 = new ModelRenderer(this);
        handguard76_r1.setRotationPoint(-4.0F, -38.2F, -25.7F);
        handguard.addChild(handguard76_r1);
        setRotationAngle(handguard76_r1, 0.0F, 0.0873F, 0.0F);
        handguard76_r1.cubeList.add(new ModelBox(handguard76_r1, 0, 24, 0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
        handguard76_r1.cubeList.add(new ModelBox(handguard76_r1, 20, 22, -0.001F, 0.4F, 0.0F, 1, 1, 3, 0.0F, false));

        handguard75_r1 = new ModelRenderer(this);
        handguard75_r1.setRotationPoint(1.0F, -38.2F, -25.7F);
        handguard.addChild(handguard75_r1);
        setRotationAngle(handguard75_r1, 0.0F, -0.0873F, 0.0F);
        handguard75_r1.cubeList.add(new ModelBox(handguard75_r1, 24, 8, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
        handguard75_r1.cubeList.add(new ModelBox(handguard75_r1, 10, 24, -0.999F, 0.4F, 0.0F, 1, 1, 3, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        handguard.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
