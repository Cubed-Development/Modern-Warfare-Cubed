package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G3Stock extends ModelWithAttachments {
    private final ModelRenderer stock;
    private final ModelRenderer gun11_r3;
    private final ModelRenderer gun10_r1;
    private final ModelRenderer gun12_r5;
    private final ModelRenderer gun11_r4;
    private final ModelRenderer gun10_r2;
    private final ModelRenderer gun9_r11;
    private final ModelRenderer gun12_r6;
    private final ModelRenderer gun13_r3;
    private final ModelRenderer gun12_r7;
    private final ModelRenderer gun11_r5;
    private final ModelRenderer gun13_r4;
    private final ModelRenderer gun12_r8;
    private final ModelRenderer gun13_r5;
    private final ModelRenderer gun12_r9;
    private final ModelRenderer gun12_r10;
    private final ModelRenderer gun14_r5;
    private final ModelRenderer gun13_r6;
    private final ModelRenderer gun13_r7;
    private final ModelRenderer gun12_r11;
    private final ModelRenderer gun11_r6;
    private final ModelRenderer gun14_r6;
    private final ModelRenderer gun13_r8;
    private final ModelRenderer gun10_r3;
    private final ModelRenderer gun11_r7;
    private final ModelRenderer gun10_r4;
    private final ModelRenderer gun9_r12;
    private final ModelRenderer gun10_r5;
    private final ModelRenderer gun9_r13;
    private final ModelRenderer gun12_r12;
    private final ModelRenderer gun12_r13;
    private final ModelRenderer gun11_r8;
    private final ModelRenderer gun11_r9;
    private final ModelRenderer gun10_r6;
    private final ModelRenderer gun12_r14;
    private final ModelRenderer gun12_r15;
    private final ModelRenderer gun11_r10;
    private final ModelRenderer gun10_r7;
    private final ModelRenderer gun11_r11;
    private final ModelRenderer gun11_r12;
    private final ModelRenderer gun10_r8;
    private final ModelRenderer gun10_r9;
    private final ModelRenderer gun10_r10;
    private final ModelRenderer gun12_r16;
    private final ModelRenderer gun14_r7;
    private final ModelRenderer gun13_r9;
    private final ModelRenderer gun13_r10;
    private final ModelRenderer gun11_r13;
    private final ModelRenderer gun12_r17;
    private final ModelRenderer gun13_r11;
    private final ModelRenderer gun12_r18;
    private final ModelRenderer gun11_r14;
    private final ModelRenderer gun14_r8;
    private final ModelRenderer gun13_r12;
    private final ModelRenderer gun12_r19;
    private final ModelRenderer gun11_r15;
    private final ModelRenderer gun10_r11;
    private final ModelRenderer gun10_r12;
    private final ModelRenderer gun10_r13;
    private final ModelRenderer gun9_r14;

    public G3Stock() {
        textureWidth = 300;
        textureHeight = 300;

        stock = new ModelRenderer(this);
        stock.setRotationPoint(-1.55F, -14.85F, 3.5F);
        stock.cubeList.add(new ModelBox(stock, 102, 58, -0.2F, -0.9F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 13, 89, -0.7F, -0.9F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 192, 189, -0.7F, 2.6F, 3.9F, 1, 1, 23, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 191, 165, -0.2F, 2.6F, 3.9F, 1, 1, 23, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 176, 31, -0.35F, 3.85F, 3.9F, 2, 3, 23, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 38, 37, -0.35F, 6.85F, 21.9F, 2, 5, 5, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 72, 84, -0.35F, 11.35F, 25.7F, 2, 2, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 36, -0.351F, 6.15F, 15.9F, 2, 3, 6, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 29, 176, -1.55F, 3.85F, 3.9F, 2, 3, 23, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 19, -1.55F, 6.85F, 21.9F, 2, 5, 5, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 67, 2, -1.55F, 11.35F, 25.7F, 2, 2, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 18, 0, -1.549F, 6.15F, 15.9F, 2, 3, 6, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 178, 0, -0.351F, 3.2F, 3.9F, 2, 1, 23, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 176, 100, -1.551F, 3.2F, 3.9F, 2, 1, 23, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 101, 41, 0.75F, 0.2F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 16, 19, 0.749F, 0.6F, 3.0F, 1, 2, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 95, 98, -1.651F, 0.6F, 3.0F, 3, 2, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 62, 91, 1.35F, 2.8F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 112, 6, 1.35F, 2.9F, 2.0F, 1, 1, 2, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 4, 112, -2.25F, 2.9F, 2.0F, 1, 1, 2, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 6, 89, 1.352F, 2.8F, -1.5F, 1, 1, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 89, 25, 1.351F, 3.2F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 89, 49, -1.95F, 3.899F, -2.1F, 4, 3, 6, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 18, 89, 1.35F, 3.2F, -1.5F, 1, 1, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 89, 41, -2.25F, 2.8F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 88, 70, -2.251F, 2.8F, -1.5F, 1, 1, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 89, 37, -2.251F, 3.2F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 0, 89, -2.252F, 3.2F, -1.5F, 1, 1, 1, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 85, 93, 0.55F, 0.95F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 13, 93, -1.45F, 0.95F, -1.0F, 1, 1, 3, 0.0F, false));
        stock.cubeList.add(new ModelBox(stock, 101, 37, -1.65F, 0.2F, -1.0F, 1, 1, 3, 0.0F, false));

        gun11_r3 = new ModelRenderer(this);
        gun11_r3.setRotationPoint(-1.65F, 0.2F, -1.0F);
        stock.addChild(gun11_r3);
        setRotationAngle(gun11_r3, 0.0F, 0.0F, 0.7156F);
        gun11_r3.cubeList.add(new ModelBox(gun11_r3, 98, 78, -0.001F, -1.45F, 0.0F, 1, 1, 3, 0.0F, false));
        gun11_r3.cubeList.add(new ModelBox(gun11_r3, 62, 99, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun10_r1 = new ModelRenderer(this);
        gun10_r1.setRotationPoint(1.75F, 0.2F, -1.0F);
        stock.addChild(gun10_r1);
        setRotationAngle(gun10_r1, 0.0F, 0.0F, -0.7156F);
        gun10_r1.cubeList.add(new ModelBox(gun10_r1, 26, 99, -0.999F, -1.45F, 0.0F, 1, 1, 3, 0.0F, false));
        gun10_r1.cubeList.add(new ModelBox(gun10_r1, 100, 25, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun12_r5 = new ModelRenderer(this);
        gun12_r5.setRotationPoint(-1.65F, 0.2F, 2.0F);
        stock.addChild(gun12_r5);
        setRotationAngle(gun12_r5, -0.1571F, 0.1571F, 0.7156F);
        gun12_r5.cubeList.add(new ModelBox(gun12_r5, 72, 110, 0.0F, -1.45F, -0.15F, 1, 1, 2, 0.0F, false));
        gun12_r5.cubeList.add(new ModelBox(gun12_r5, 85, 110, 0.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun11_r4 = new ModelRenderer(this);
        gun11_r4.setRotationPoint(1.75F, 0.2F, 2.0F);
        stock.addChild(gun11_r4);
        setRotationAngle(gun11_r4, -0.1571F, -0.1571F, -0.7156F);
        gun11_r4.cubeList.add(new ModelBox(gun11_r4, 63, 110, -1.0F, -1.45F, -0.15F, 1, 1, 2, 0.0F, false));
        gun11_r4.cubeList.add(new ModelBox(gun11_r4, 95, 110, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun10_r2 = new ModelRenderer(this);
        gun10_r2.setRotationPoint(-1.65F, 1.2F, -1.0F);
        stock.addChild(gun10_r2);
        setRotationAngle(gun10_r2, 0.0F, 0.0F, 0.733F);
        gun10_r2.cubeList.add(new ModelBox(gun10_r2, 85, 97, 0.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun9_r11 = new ModelRenderer(this);
        gun9_r11.setRotationPoint(1.75F, 1.2F, -1.0F);
        stock.addChild(gun9_r11);
        setRotationAngle(gun9_r11, 0.0F, 0.0F, -0.733F);
        gun9_r11.cubeList.add(new ModelBox(gun9_r11, 98, 74, -1.0F, -1.0F, 0.0F, 1, 1, 3, 0.0F, false));

        gun12_r6 = new ModelRenderer(this);
        gun12_r6.setRotationPoint(-2.55F, 2.65F, -1.5F);
        stock.addChild(gun12_r6);
        setRotationAngle(gun12_r6, 0.0F, 0.0F, 0.8029F);
        gun12_r6.cubeList.add(new ModelBox(gun12_r6, 89, 46, -0.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        gun12_r6.cubeList.add(new ModelBox(gun12_r6, 8, 78, 0.0F, -2.0F, 0.5F, 1, 2, 3, 0.0F, false));

        gun13_r3 = new ModelRenderer(this);
        gun13_r3.setRotationPoint(-1.825F, 1.95F, -1.5F);
        stock.addChild(gun13_r3);
        setRotationAngle(gun13_r3, -0.7679F, 0.0F, 0.8029F);
        gun13_r3.cubeList.add(new ModelBox(gun13_r3, 24, 89, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun12_r7 = new ModelRenderer(this);
        gun12_r7.setRotationPoint(1.925F, 1.95F, -1.5F);
        stock.addChild(gun12_r7);
        setRotationAngle(gun12_r7, -0.7679F, 0.0F, -0.8029F);
        gun12_r7.cubeList.add(new ModelBox(gun12_r7, 30, 89, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun11_r5 = new ModelRenderer(this);
        gun11_r5.setRotationPoint(2.65F, 2.65F, -1.5F);
        stock.addChild(gun11_r5);
        setRotationAngle(gun11_r5, 0.0F, 0.0F, -0.8029F);
        gun11_r5.cubeList.add(new ModelBox(gun11_r5, 89, 58, -0.999F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        gun11_r5.cubeList.add(new ModelBox(gun11_r5, 44, 81, -1.0F, -2.0F, 0.5F, 1, 2, 3, 0.0F, false));

        gun13_r4 = new ModelRenderer(this);
        gun13_r4.setRotationPoint(-2.55F, 4.15F, -1.5F);
        stock.addChild(gun13_r4);
        setRotationAngle(gun13_r4, 0.0F, 0.0F, 0.8029F);
        gun13_r4.cubeList.add(new ModelBox(gun13_r4, 58, 41, -0.001F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));
        gun13_r4.cubeList.add(new ModelBox(gun13_r4, 24, 94, 0.0F, -1.0F, 0.5F, 2, 1, 3, 0.0F, false));

        gun12_r8 = new ModelRenderer(this);
        gun12_r8.setRotationPoint(2.65F, 4.15F, -1.5F);
        stock.addChild(gun12_r8);
        setRotationAngle(gun12_r8, 0.0F, 0.0F, -0.8029F);
        gun12_r8.cubeList.add(new ModelBox(gun12_r8, 58, 48, -1.999F, -1.001F, 0.0F, 2, 1, 1, 0.0F, false));
        gun12_r8.cubeList.add(new ModelBox(gun12_r8, 72, 98, -2.0F, -1.0F, 0.5F, 2, 1, 3, 0.0F, false));

        gun13_r5 = new ModelRenderer(this);
        gun13_r5.setRotationPoint(-2.55F, 4.15F, 2.0F);
        stock.addChild(gun13_r5);
        setRotationAngle(gun13_r5, 0.0F, 0.192F, -0.8029F);
        gun13_r5.cubeList.add(new ModelBox(gun13_r5, 58, 0, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        gun12_r9 = new ModelRenderer(this);
        gun12_r9.setRotationPoint(-2.55F, 2.65F, 2.0F);
        stock.addChild(gun12_r9);
        setRotationAngle(gun12_r9, 0.0F, 0.192F, 0.8029F);
        gun12_r9.cubeList.add(new ModelBox(gun12_r9, 58, 17, 0.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        gun12_r10 = new ModelRenderer(this);
        gun12_r10.setRotationPoint(2.65F, 4.15F, 2.0F);
        stock.addChild(gun12_r10);
        setRotationAngle(gun12_r10, 0.0F, -0.192F, 0.8029F);
        gun12_r10.cubeList.add(new ModelBox(gun12_r10, 58, 8, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        gun14_r5 = new ModelRenderer(this);
        gun14_r5.setRotationPoint(-2.55F, 4.15F, 2.0F);
        stock.addChild(gun14_r5);
        setRotationAngle(gun14_r5, 0.1396F, 0.1396F, 0.0F);
        gun14_r5.cubeList.add(new ModelBox(gun14_r5, 76, 111, 0.001F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun13_r6 = new ModelRenderer(this);
        gun13_r6.setRotationPoint(2.65F, 4.15F, 2.0F);
        stock.addChild(gun13_r6);
        setRotationAngle(gun13_r6, 0.1396F, -0.1396F, 0.0F);
        gun13_r6.cubeList.add(new ModelBox(gun13_r6, 112, 0, -0.999F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun13_r7 = new ModelRenderer(this);
        gun13_r7.setRotationPoint(-2.55F, 2.65F, 2.0F);
        stock.addChild(gun13_r7);
        setRotationAngle(gun13_r7, -0.1396F, 0.1396F, 0.0F);
        gun13_r7.cubeList.add(new ModelBox(gun13_r7, 13, 111, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun12_r11 = new ModelRenderer(this);
        gun12_r11.setRotationPoint(2.65F, 2.65F, 2.0F);
        stock.addChild(gun12_r11);
        setRotationAngle(gun12_r11, -0.1396F, -0.1396F, 0.0F);
        gun12_r11.cubeList.add(new ModelBox(gun12_r11, 112, 3, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun11_r6 = new ModelRenderer(this);
        gun11_r6.setRotationPoint(2.65F, 2.65F, 2.0F);
        stock.addChild(gun11_r6);
        setRotationAngle(gun11_r6, 0.0F, -0.192F, -0.8029F);
        gun11_r6.cubeList.add(new ModelBox(gun11_r6, 58, 25, -1.0F, -2.0F, 0.0F, 1, 2, 2, 0.0F, false));

        gun14_r6 = new ModelRenderer(this);
        gun14_r6.setRotationPoint(-1.25F, 5.25F, 0.8F);
        stock.addChild(gun14_r6);
        setRotationAngle(gun14_r6, -0.3491F, 0.0F, 0.0F);
        gun14_r6.cubeList.add(new ModelBox(gun14_r6, 58, 37, -1.0F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));
        gun14_r6.cubeList.add(new ModelBox(gun14_r6, 8, 65, 2.6F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));

        gun13_r8 = new ModelRenderer(this);
        gun13_r8.setRotationPoint(-1.25F, 5.25F, -1.7F);
        stock.addChild(gun13_r8);
        setRotationAngle(gun13_r8, -0.3491F, 0.0F, 0.0F);
        gun13_r8.cubeList.add(new ModelBox(gun13_r8, 58, 44, -1.0F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));
        gun13_r8.cubeList.add(new ModelBox(gun13_r8, 65, 56, 2.6F, -1.0F, 0.0F, 1, 2, 2, -0.2F, false));

        gun10_r3 = new ModelRenderer(this);
        gun10_r3.setRotationPoint(-1.65F, 1.2F, 2.0F);
        stock.addChild(gun10_r3);
        setRotationAngle(gun10_r3, 0.0F, 0.0F, 0.3142F);
        gun10_r3.cubeList.add(new ModelBox(gun10_r3, 49, 8, 0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        gun11_r7 = new ModelRenderer(this);
        gun11_r7.setRotationPoint(-1.85F, 0.8F, 0.25F);
        stock.addChild(gun11_r7);
        setRotationAngle(gun11_r7, 0.0F, 0.0F, 0.2618F);
        gun11_r7.cubeList.add(new ModelBox(gun11_r7, 0, 0, 0.0F, -1.0F, 0.0F, 1, 3, 1, -0.2F, false));

        gun10_r4 = new ModelRenderer(this);
        gun10_r4.setRotationPoint(1.95F, 0.8F, 0.25F);
        stock.addChild(gun10_r4);
        setRotationAngle(gun10_r4, 0.0F, 0.0F, -0.2618F);
        gun10_r4.cubeList.add(new ModelBox(gun10_r4, 12, 0, -1.0F, -1.0F, 0.0F, 1, 3, 1, -0.2F, false));

        gun9_r12 = new ModelRenderer(this);
        gun9_r12.setRotationPoint(1.75F, 1.2F, 2.0F);
        stock.addChild(gun9_r12);
        setRotationAngle(gun9_r12, 0.0F, 0.0F, -0.3142F);
        gun9_r12.cubeList.add(new ModelBox(gun9_r12, 55, 56, -1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, false));

        gun10_r5 = new ModelRenderer(this);
        gun10_r5.setRotationPoint(-0.65F, 0.2F, 2.0F);
        stock.addChild(gun10_r5);
        setRotationAngle(gun10_r5, -0.2182F, 0.0F, 0.0F);
        gun10_r5.cubeList.add(new ModelBox(gun10_r5, 106, 110, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
        gun10_r5.cubeList.add(new ModelBox(gun10_r5, 0, 111, 1.4F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun9_r13 = new ModelRenderer(this);
        gun9_r13.setRotationPoint(0.3F, -0.9F, 2.0F);
        stock.addChild(gun9_r13);
        setRotationAngle(gun9_r13, -0.2182F, 0.0F, 0.0F);
        gun9_r13.cubeList.add(new ModelBox(gun9_r13, 80, 81, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));
        gun9_r13.cubeList.add(new ModelBox(gun9_r13, 112, 12, -0.5F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun12_r12 = new ModelRenderer(this);
        gun12_r12.setRotationPoint(0.4F, 6.85F, 7.9F);
        stock.addChild(gun12_r12);
        setRotationAngle(gun12_r12, -0.3491F, 0.0F, 0.0F);
        gun12_r12.cubeList.add(new ModelBox(gun12_r12, 169, 200, -1.951F, -3.0F, 0.0F, 2, 3, 19, 0.0F, false));
        gun12_r12.cubeList.add(new ModelBox(gun12_r12, 81, 201, -0.749F, -3.0F, 0.0F, 2, 3, 19, 0.0F, false));

        gun12_r13 = new ModelRenderer(this);
        gun12_r13.setRotationPoint(-1.85F, 6.85F, 3.9F);
        stock.addChild(gun12_r13);
        setRotationAngle(gun12_r13, 0.0F, 0.192F, 0.0F);
        gun12_r13.cubeList.add(new ModelBox(gun12_r13, 28, 0, 0.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

        gun11_r8 = new ModelRenderer(this);
        gun11_r8.setRotationPoint(1.95F, 6.85F, 3.9F);
        stock.addChild(gun11_r8);
        setRotationAngle(gun11_r8, 0.0F, -0.192F, 0.0F);
        gun11_r8.cubeList.add(new ModelBox(gun11_r8, 28, 9, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F, false));

        gun11_r9 = new ModelRenderer(this);
        gun11_r9.setRotationPoint(-0.7F, 2.6F, 7.9F);
        stock.addChild(gun11_r9);
        setRotationAngle(gun11_r9, 0.0F, 0.0F, 0.9425F);
        gun11_r9.cubeList.add(new ModelBox(gun11_r9, 36, 202, 0.0F, 0.0F, -1.0F, 1, 1, 20, 0.0F, false));

        gun10_r6 = new ModelRenderer(this);
        gun10_r6.setRotationPoint(0.8F, 2.6F, 7.9F);
        stock.addChild(gun10_r6);
        setRotationAngle(gun10_r6, 0.0F, 0.0F, -0.9425F);
        gun10_r6.cubeList.add(new ModelBox(gun10_r6, 202, 57, -1.0F, 0.0F, -1.0F, 1, 1, 20, 0.0F, false));

        gun12_r14 = new ModelRenderer(this);
        gun12_r14.setRotationPoint(-1.75F, 2.2F, 26.9F);
        stock.addChild(gun12_r14);
        setRotationAngle(gun12_r14, -0.0349F, 0.0F, 0.0F);
        gun12_r14.cubeList.add(new ModelBox(gun12_r14, 28, 72, 0.0F, 1.0F, 0.0F, 1, 10, 2, 0.0F, false));
        gun12_r14.cubeList.add(new ModelBox(gun12_r14, 28, 124, 2.6F, 1.0F, 0.0F, 1, 10, 2, 0.0F, false));

        gun12_r15 = new ModelRenderer(this);
        gun12_r15.setRotationPoint(-0.95F, 2.5F, 26.9F);
        stock.addChild(gun12_r15);
        setRotationAngle(gun12_r15, -0.0262F, 0.0262F, 0.9076F);
        gun12_r15.cubeList.add(new ModelBox(gun12_r15, 36, 84, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun11_r10 = new ModelRenderer(this);
        gun11_r10.setRotationPoint(1.05F, 2.5F, 26.9F);
        stock.addChild(gun11_r10);
        setRotationAngle(gun11_r10, -0.0262F, -0.0262F, -0.9076F);
        gun11_r10.cubeList.add(new ModelBox(gun11_r10, 54, 84, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun10_r7 = new ModelRenderer(this);
        gun10_r7.setRotationPoint(1.05F, 2.5F, 26.9F);
        stock.addChild(gun10_r7);
        setRotationAngle(gun10_r7, -0.0349F, 0.0F, 0.0F);
        gun10_r7.cubeList.add(new ModelBox(gun10_r7, 18, 72, -2.0F, 0.0F, 0.0F, 2, 11, 2, 0.0F, false));

        gun11_r11 = new ModelRenderer(this);
        gun11_r11.setRotationPoint(0.45F, 1.8F, 5.0F);
        stock.addChild(gun11_r11);
        setRotationAngle(gun11_r11, -0.4974F, 0.0F, 0.0F);
        gun11_r11.cubeList.add(new ModelBox(gun11_r11, 89, 61, -2.002F, -0.05F, 0.0F, 2, 2, 3, 0.0F, false));
        gun11_r11.cubeList.add(new ModelBox(gun11_r11, 0, 94, -0.802F, -0.05F, 0.0F, 2, 2, 3, 0.0F, false));

        gun11_r12 = new ModelRenderer(this);
        gun11_r12.setRotationPoint(-0.7F, 1.0F, 5.0F);
        stock.addChild(gun11_r12);
        setRotationAngle(gun11_r12, -0.3229F, 0.384F, 0.8378F);
        gun11_r12.cubeList.add(new ModelBox(gun11_r12, 0, 89, 0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun10_r8 = new ModelRenderer(this);
        gun10_r8.setRotationPoint(0.8F, 1.0F, 5.0F);
        stock.addChild(gun10_r8);
        setRotationAngle(gun10_r8, -0.3229F, -0.384F, -0.8378F);
        gun10_r8.cubeList.add(new ModelBox(gun10_r8, 24, 89, -1.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun10_r9 = new ModelRenderer(this);
        gun10_r9.setRotationPoint(1.8F, 1.0F, 5.0F);
        stock.addChild(gun10_r9);
        setRotationAngle(gun10_r9, -0.4974F, 0.0F, 0.0F);
        gun10_r9.cubeList.add(new ModelBox(gun10_r9, 76, 43, -2.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));
        gun10_r9.cubeList.add(new ModelBox(gun10_r9, 95, 93, -2.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        gun10_r10 = new ModelRenderer(this);
        gun10_r10.setRotationPoint(0.45F, 0.5F, 4.1F);
        stock.addChild(gun10_r10);
        setRotationAngle(gun10_r10, -0.829F, 0.0F, 0.0F);
        gun10_r10.cubeList.add(new ModelBox(gun10_r10, 36, 91, -1.999F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));
        gun10_r10.cubeList.add(new ModelBox(gun10_r10, 72, 93, -0.799F, 0.0F, 0.0F, 2, 2, 3, 0.0F, false));

        gun12_r16 = new ModelRenderer(this);
        gun12_r16.setRotationPoint(-2.1F, 2.9F, 4.0F);
        stock.addChild(gun12_r16);
        setRotationAngle(gun12_r16, 0.0F, 0.1396F, 0.3142F);
        gun12_r16.cubeList.add(new ModelBox(gun12_r16, 58, 88, 0.001F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun14_r7 = new ModelRenderer(this);
        gun14_r7.setRotationPoint(-2.1F, 2.9F, 4.0F);
        stock.addChild(gun14_r7);
        setRotationAngle(gun14_r7, 0.0F, 0.1396F, 0.3142F);
        gun14_r7.cubeList.add(new ModelBox(gun14_r7, 40, 88, 0.0F, -1.65F, 0.0F, 1, 1, 1, 0.0F, false));

        gun13_r9 = new ModelRenderer(this);
        gun13_r9.setRotationPoint(2.2F, 2.9F, 4.0F);
        stock.addChild(gun13_r9);
        setRotationAngle(gun13_r9, 0.0F, -0.1396F, -0.3142F);
        gun13_r9.cubeList.add(new ModelBox(gun13_r9, 48, 88, -1.0F, -1.65F, 0.0F, 1, 1, 1, 0.0F, false));
        gun13_r9.cubeList.add(new ModelBox(gun13_r9, 54, 88, -0.999F, -2.0F, -0.3F, 1, 1, 1, 0.0F, false));
        gun13_r9.cubeList.add(new ModelBox(gun13_r9, 62, 88, -0.999F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun13_r10 = new ModelRenderer(this);
        gun13_r10.setRotationPoint(-2.1F, 2.9F, 4.0F);
        stock.addChild(gun13_r10);
        setRotationAngle(gun13_r10, 0.0F, 0.1396F, 0.3142F);
        gun13_r10.cubeList.add(new ModelBox(gun13_r10, 44, 88, 0.001F, -2.0F, -0.3F, 1, 1, 1, 0.0F, false));

        gun11_r13 = new ModelRenderer(this);
        gun11_r13.setRotationPoint(-1.95F, 2.9F, 5.0F);
        stock.addChild(gun11_r13);
        setRotationAngle(gun11_r13, 0.0F, 0.1571F, 0.0F);
        gun11_r13.cubeList.add(new ModelBox(gun11_r13, 26, 86, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        gun12_r17 = new ModelRenderer(this);
        gun12_r17.setRotationPoint(-1.95F, 2.9F, 5.0F);
        stock.addChild(gun12_r17);
        setRotationAngle(gun12_r17, 0.0F, 0.3665F, 0.3142F);
        gun12_r17.cubeList.add(new ModelBox(gun12_r17, 18, 86, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun13_r11 = new ModelRenderer(this);
        gun13_r11.setRotationPoint(-1.95F, 2.9F, 5.0F);
        stock.addChild(gun13_r11);
        setRotationAngle(gun13_r11, 0.0F, 0.3665F, 0.0F);
        gun13_r11.cubeList.add(new ModelBox(gun13_r11, 36, 109, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun12_r18 = new ModelRenderer(this);
        gun12_r18.setRotationPoint(2.05F, 2.9F, 5.0F);
        stock.addChild(gun12_r18);
        setRotationAngle(gun12_r18, 0.0F, -0.3665F, 0.0F);
        gun12_r18.cubeList.add(new ModelBox(gun12_r18, 49, 109, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun11_r14 = new ModelRenderer(this);
        gun11_r14.setRotationPoint(2.05F, 2.9F, 5.0F);
        stock.addChild(gun11_r14);
        setRotationAngle(gun11_r14, 0.0F, -0.3665F, -0.3142F);
        gun11_r14.cubeList.add(new ModelBox(gun11_r14, 22, 86, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        gun14_r8 = new ModelRenderer(this);
        gun14_r8.setRotationPoint(2.05F, 3.9F, 5.0F);
        stock.addChild(gun14_r8);
        setRotationAngle(gun14_r8, -0.2531F, -0.2705F, 0.7679F);
        gun14_r8.cubeList.add(new ModelBox(gun14_r8, 108, 100, -1.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun13_r12 = new ModelRenderer(this);
        gun13_r12.setRotationPoint(-1.95F, 3.9F, 5.0F);
        stock.addChild(gun13_r12);
        setRotationAngle(gun13_r12, -0.2531F, 0.2705F, -0.7679F);
        gun13_r12.cubeList.add(new ModelBox(gun13_r12, 108, 105, 0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, false));

        gun12_r19 = new ModelRenderer(this);
        gun12_r19.setRotationPoint(-1.95F, 3.9F, 5.0F);
        stock.addChild(gun12_r19);
        setRotationAngle(gun12_r19, -0.1047F, 0.1222F, -0.7679F);
        gun12_r19.cubeList.add(new ModelBox(gun12_r19, 86, 0, 0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        gun11_r15 = new ModelRenderer(this);
        gun11_r15.setRotationPoint(2.05F, 3.9F, 5.0F);
        stock.addChild(gun11_r15);
        setRotationAngle(gun11_r15, -0.1047F, -0.1222F, 0.7679F);
        gun11_r15.cubeList.add(new ModelBox(gun11_r15, 86, 2, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        gun10_r11 = new ModelRenderer(this);
        gun10_r11.setRotationPoint(2.05F, 2.9F, 5.0F);
        stock.addChild(gun10_r11);
        setRotationAngle(gun10_r11, 0.0F, -0.1571F, 0.0F);
        gun10_r11.cubeList.add(new ModelBox(gun10_r11, 66, 88, -1.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));

        gun10_r12 = new ModelRenderer(this);
        gun10_r12.setRotationPoint(-0.7F, -0.4F, 4.0F);
        stock.addChild(gun10_r12);
        setRotationAngle(gun10_r12, -0.5149F, 0.6807F, 0.8378F);
        gun10_r12.cubeList.add(new ModelBox(gun10_r12, 59, 109, 0.0F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));
        gun10_r12.cubeList.add(new ModelBox(gun10_r12, 30, 86, -0.001F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));

        gun10_r13 = new ModelRenderer(this);
        gun10_r13.setRotationPoint(0.8F, -0.4F, 4.0F);
        stock.addChild(gun10_r13);
        setRotationAngle(gun10_r13, -0.5149F, -0.6807F, -0.8378F);
        gun10_r13.cubeList.add(new ModelBox(gun10_r13, 36, 88, -1.001F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));
        gun10_r13.cubeList.add(new ModelBox(gun10_r13, 40, 110, -1.0F, 0.0F, 1.0F, 1, 1, 2, 0.0F, false));

        gun9_r14 = new ModelRenderer(this);
        gun9_r14.setRotationPoint(1.8F, -0.4F, 4.0F);
        stock.addChild(gun9_r14);
        setRotationAngle(gun9_r14, -0.829F, 0.0F, 0.0F);
        gun9_r14.cubeList.add(new ModelBox(gun9_r14, 88, 78, -2.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
        gun9_r14.cubeList.add(new ModelBox(gun9_r14, 89, 21, -2.5F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));
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
