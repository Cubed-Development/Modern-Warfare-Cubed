package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PSO1 extends ModelBase {
    private final ModelRenderer gun;
    private final ModelRenderer Scope89_r1;
    private final ModelRenderer Scope88_r1;
    private final ModelRenderer Scope87_r1;
    private final ModelRenderer Scope86_r1;
    private final ModelRenderer Scope85_r1;
    private final ModelRenderer Scope84_r1;
    private final ModelRenderer Scope83_r1;
    private final ModelRenderer Scope82_r1;
    private final ModelRenderer Scope81_r1;
    private final ModelRenderer Scope80_r1;
    private final ModelRenderer Scope79_r1;
    private final ModelRenderer Scope78_r1;
    private final ModelRenderer Scope73_r1;
    private final ModelRenderer Scope72_r1;
    private final ModelRenderer Scope71_r1;
    private final ModelRenderer Scope70_r1;
    private final ModelRenderer Scope56_r1;
    private final ModelRenderer Scope55_r1;
    private final ModelRenderer Scope54_r1;
    private final ModelRenderer Scope53_r1;
    private final ModelRenderer Scope52_r1;
    private final ModelRenderer Scope51_r1;
    private final ModelRenderer Scope50_r1;
    private final ModelRenderer Scope49_r1;
    private final ModelRenderer Scope44_r1;
    private final ModelRenderer Scope43_r1;
    private final ModelRenderer Scope42_r1;
    private final ModelRenderer Scope41_r1;
    private final ModelRenderer Scope40_r1;
    private final ModelRenderer Scope39_r1;
    private final ModelRenderer Scope38_r1;
    private final ModelRenderer Scope37_r1;
    private final ModelRenderer Scope32_r1;
    private final ModelRenderer Scope30_r1;
    private final ModelRenderer Scope29_r1;
    private final ModelRenderer Scope28_r1;
    private final ModelRenderer Scope27_r1;
    private final ModelRenderer Scope26_r1;
    private final ModelRenderer Scope25_r1;
    private final ModelRenderer Scope24_r1;
    private final ModelRenderer Scope23_r1;
    private final ModelRenderer Scope22_r1;
    private final ModelRenderer Scope21_r1;
    private final ModelRenderer Scope31_r1;
    private final ModelRenderer Scope16_r1;
    private final ModelRenderer Scope12_r1;
    private final ModelRenderer Scope10_r1;
    private final ModelRenderer Scope5_r1;
    private final ModelRenderer Scope4_r1;

    public PSO1() {
        textureWidth = 64;
        textureHeight = 64;

        gun = new ModelRenderer(this);
        gun.setRotationPoint(-20.5405F, -24.7701F, 0.0F);
        gun.cubeList.add(new ModelBox(gun, 0, 0, 20.5405F, 24.7701F, 0.0F, 1, 3, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 11, 20.0405F, 24.7701F, -4.0F, 1, 2, 9, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 7, 57, 20.0405F, 26.7701F, 0.0F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 17, 55, 20.2405F, 21.7701F, -4.0F, 1, 5, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 11, 20.2405F, 21.7701F, 3.2F, 1, 5, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 19, 0, 20.8405F, 21.2701F, -4.2F, 1, 2, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 22, 18, 20.8405F, 21.2701F, -2.8F, 1, 2, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 51, 56, 19.8405F, 21.2701F, 3.2F, 2, 2, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 22, 21.0405F, 21.7701F, 3.2F, 1, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 19, 9, 19.6405F, 21.7701F, 3.2F, 1, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 5, 0, 19.5405F, 17.9701F, 1.0F, 1, 2, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 52, 18, 17.5405F, 19.2701F, 0.2F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 52, 12, 19.3405F, 17.5201F, 0.2F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 52, 6, 15.7405F, 17.5201F, 0.2F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 51, 39, 17.5405F, 15.7701F, 0.2F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 54, 17.0405F, 15.9701F, -2.5F, 2, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 18, 17.8405F, 16.1701F, -0.3F, 2, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 6, 17.0405F, 15.5701F, 0.2F, 2, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 15, 18, 17.5405F, 15.1701F, 1.0F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 11, 18, 17.5405F, 15.1701F, 0.4F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 5, 17, 17.2405F, 15.1701F, 0.7F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 4, 11, 17.8405F, 15.1701F, 0.7F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 14, 48, 17.5405F, 16.2701F, -4.0F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 48, 17.5405F, 18.7701F, -4.0F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 47, 33, 16.2405F, 17.5201F, -4.0F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 28, 47, 18.8405F, 17.5201F, -4.0F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 24, 30, 17.5405F, 18.8701F, -10.0F, 1, 1, 6, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 30, 21, 17.5405F, 16.1701F, -10.0F, 1, 1, 6, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 30, 14, 16.1405F, 17.5201F, -10.0F, 1, 1, 6, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 16, 29, 18.9405F, 17.5201F, -10.0F, 1, 1, 6, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 56, 50, 17.5405F, 16.7701F, 5.2F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 43, 56, 17.5405F, 18.2701F, 5.2F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 38, 55, 18.3405F, 17.5201F, 5.2F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 55, 24, 16.7405F, 17.5201F, 5.2F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 14, 42, 17.5405F, 16.2701F, 10.7F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 42, 17.5405F, 18.7701F, 10.7F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 30, 41, 18.8405F, 17.5201F, 10.7F, 1, 1, 5, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 41, 27, 16.2405F, 17.5201F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope89_r1 = new ModelRenderer(this);
        Scope89_r1.setRotationPoint(40.9302F, 1.2309F, 0.0F);
        gun.addChild(Scope89_r1);
        setRotationAngle(Scope89_r1, 0.0F, 0.0F, -2.1935F);
        Scope89_r1.cubeList.add(new ModelBox(Scope89_r1, 33, 35, -2.0F, -29.0F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope88_r1 = new ModelRenderer(this);
        Scope88_r1.setRotationPoint(-4.4873F, 0.5282F, 0.0F);
        gun.addChild(Scope88_r1);
        setRotationAngle(Scope88_r1, 0.0F, 0.0F, 2.2307F);
        Scope88_r1.cubeList.add(new ModelBox(Scope88_r1, 0, 36, -0.7F, -30.25F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope87_r1 = new ModelRenderer(this);
        Scope87_r1.setRotationPoint(29.8533F, -6.6571F, 0.0F);
        gun.addChild(Scope87_r1);
        setRotationAngle(Scope87_r1, 0.0F, 0.0F, -2.6025F);
        Scope87_r1.cubeList.add(new ModelBox(Scope87_r1, 16, 36, -3.0F, -29.0F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope86_r1 = new ModelRenderer(this);
        Scope86_r1.setRotationPoint(36.7538F, 41.1643F, 0.0F);
        gun.addChild(Scope86_r1);
        setRotationAngle(Scope86_r1, 0.0F, 0.0F, -0.5949F);
        Scope86_r1.cubeList.add(new ModelBox(Scope86_r1, 23, 37, -4.3F, -30.25F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope85_r1 = new ModelRenderer(this);
        Scope85_r1.setRotationPoint(43.8537F, 32.7702F, 0.0F);
        gun.addChild(Scope85_r1);
        setRotationAngle(Scope85_r1, 0.0F, 0.0F, -0.9295F);
        Scope85_r1.cubeList.add(new ModelBox(Scope85_r1, 38, 13, -4.3F, -31.25F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope84_r1 = new ModelRenderer(this);
        Scope84_r1.setRotationPoint(-7.5022F, 37.2011F, 0.0F);
        gun.addChild(Scope84_r1);
        setRotationAngle(Scope84_r1, 0.0F, 0.0F, 0.9666F);
        Scope84_r1.cubeList.add(new ModelBox(Scope84_r1, 38, 21, -3.0F, -32.5F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope83_r1 = new ModelRenderer(this);
        Scope83_r1.setRotationPoint(0.3559F, -6.9217F, 0.0F);
        gun.addChild(Scope83_r1);
        setRotationAngle(Scope83_r1, 0.0F, 0.0F, 2.491F);
        Scope83_r1.cubeList.add(new ModelBox(Scope83_r1, 7, 39, -0.7F, -31.25F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope82_r1 = new ModelRenderer(this);
        Scope82_r1.setRotationPoint(0.9536F, 43.6735F, 0.0F);
        gun.addChild(Scope82_r1);
        setRotationAngle(Scope82_r1, 0.0F, 0.0F, 0.632F);
        Scope82_r1.cubeList.add(new ModelBox(Scope82_r1, 40, 36, -2.0F, -32.5F, 10.7F, 1, 1, 5, 0.0F, false));

        Scope81_r1 = new ModelRenderer(this);
        Scope81_r1.setRotationPoint(21.7136F, 48.7701F, 0.6535F);
        gun.addChild(Scope81_r1);
        setRotationAngle(Scope81_r1, 0.0F, -0.1487F, 0.0F);
        Scope81_r1.cubeList.add(new ModelBox(Scope81_r1, 54, 32, -3.8F, -31.25F, 8.2F, 1, 1, 3, 0.0F, false));

        Scope80_r1 = new ModelRenderer(this);
        Scope80_r1.setRotationPoint(20.5405F, 30.9661F, 36.4965F);
        gun.addChild(Scope80_r1);
        setRotationAngle(Scope80_r1, 1.45F, 0.0F, 0.0F);
        Scope80_r1.cubeList.add(new ModelBox(Scope80_r1, 8, 22, -3.0F, -29.5F, 8.2F, 1, 3, 1, 0.0F, false));

        Scope79_r1 = new ModelRenderer(this);
        Scope79_r1.setRotationPoint(27.6254F, 48.7701F, 8.4029F);
        gun.addChild(Scope79_r1);
        setRotationAngle(Scope79_r1, 0.0F, -1.45F, 0.0F);
        Scope79_r1.cubeList.add(new ModelBox(Scope79_r1, 11, 7, -1.2F, -31.25F, 8.2F, 3, 1, 1, 0.0F, false));

        Scope78_r1 = new ModelRenderer(this);
        Scope78_r1.setRotationPoint(20.5405F, 49.6319F, 4.8318F);
        gun.addChild(Scope78_r1);
        setRotationAngle(Scope78_r1, 0.1487F, 0.0F, 0.0F);
        Scope78_r1.cubeList.add(new ModelBox(Scope78_r1, 23, 55, -3.0F, -32.0F, 8.2F, 1, 1, 3, 0.0F, false));

        Scope73_r1 = new ModelRenderer(this);
        Scope73_r1.setRotationPoint(41.4131F, 36.4301F, 0.0F);
        gun.addChild(Scope73_r1);
        setRotationAngle(Scope73_r1, 0.0F, 0.0F, -0.8179F);
        Scope73_r1.cubeList.add(new ModelBox(Scope73_r1, 11, 0, -3.8F, -30.25F, 5.2F, 1, 1, 6, 0.0F, false));

        Scope72_r1 = new ModelRenderer(this);
        Scope72_r1.setRotationPoint(-2.4147F, -2.5325F, 0.0F);
        gun.addChild(Scope72_r1);
        setRotationAngle(Scope72_r1, 0.0F, 0.0F, 2.3794F);
        Scope72_r1.cubeList.add(new ModelBox(Scope72_r1, 11, 11, -1.2F, -30.25F, 5.2F, 1, 1, 6, 0.0F, false));

        Scope71_r1 = new ModelRenderer(this);
        Scope71_r1.setRotationPoint(-1.6488F, 41.6777F, 0.0F);
        gun.addChild(Scope71_r1);
        setRotationAngle(Scope71_r1, 0.0F, 0.0F, 0.7436F);
        Scope71_r1.cubeList.add(new ModelBox(Scope71_r1, 14, 18, -2.0F, -32.0F, 5.2F, 1, 1, 6, 0.0F, false));

        Scope70_r1 = new ModelRenderer(this);
        Scope70_r1.setRotationPoint(-3.7597F, 40.8388F, 0.0F);
        gun.addChild(Scope70_r1);
        setRotationAngle(Scope70_r1, 0.0F, 0.0F, 0.8179F);
        Scope70_r1.cubeList.add(new ModelBox(Scope70_r1, 19, 1, -3.0F, -32.0F, 5.2F, 1, 1, 6, 0.0F, false));

        Scope56_r1 = new ModelRenderer(this);
        Scope56_r1.setRotationPoint(30.7726F, -5.9973F, 0.0F);
        gun.addChild(Scope56_r1);
        setRotationAngle(Scope56_r1, 0.0F, 0.0F, -2.5653F);
        Scope56_r1.cubeList.add(new ModelBox(Scope56_r1, 19, 8, -3.0F, -28.9F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope55_r1 = new ModelRenderer(this);
        Scope55_r1.setRotationPoint(37.5619F, 40.3271F, 0.0F);
        gun.addChild(Scope55_r1);
        setRotationAngle(Scope55_r1, 0.0F, 0.0F, -0.632F);
        Scope55_r1.cubeList.add(new ModelBox(Scope55_r1, 0, 22, -4.4F, -30.25F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope54_r1 = new ModelRenderer(this);
        Scope54_r1.setRotationPoint(44.864F, 30.5924F, 0.0F);
        gun.addChild(Scope54_r1);
        setRotationAngle(Scope54_r1, 0.0F, 0.0F, -1.0038F);
        Scope54_r1.cubeList.add(new ModelBox(Scope54_r1, 22, 15, -4.4F, -31.25F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope53_r1 = new ModelRenderer(this);
        Scope53_r1.setRotationPoint(-9.0743F, 35.2335F, 0.0F);
        gun.addChild(Scope53_r1);
        setRotationAngle(Scope53_r1, 0.0F, 0.0F, 1.041F);
        Scope53_r1.cubeList.add(new ModelBox(Scope53_r1, 22, 22, -3.0F, -32.6F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope52_r1 = new ModelRenderer(this);
        Scope52_r1.setRotationPoint(41.5205F, 2.2312F, 0.0F);
        gun.addChild(Scope52_r1);
        setRotationAngle(Scope52_r1, 0.0F, 0.0F, -2.1564F);
        Scope52_r1.cubeList.add(new ModelBox(Scope52_r1, 8, 25, -2.0F, -28.9F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope51_r1 = new ModelRenderer(this);
        Scope51_r1.setRotationPoint(-4.981F, 1.3637F, 0.0F);
        gun.addChild(Scope51_r1);
        setRotationAngle(Scope51_r1, 0.0F, 0.0F, 2.1935F);
        Scope51_r1.cubeList.add(new ModelBox(Scope51_r1, 27, 0, -0.6F, -30.25F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope50_r1 = new ModelRenderer(this);
        Scope50_r1.setRotationPoint(4.3801F, -9.587F, 0.0F);
        gun.addChild(Scope50_r1);
        setRotationAngle(Scope50_r1, 0.0F, 0.0F, 2.6397F);
        Scope50_r1.cubeList.add(new ModelBox(Scope50_r1, 27, 7, -0.6F, -31.25F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope49_r1 = new ModelRenderer(this);
        Scope49_r1.setRotationPoint(5.1615F, 45.9654F, 0.0F);
        gun.addChild(Scope49_r1);
        setRotationAngle(Scope49_r1, 0.0F, 0.0F, 0.4833F);
        Scope49_r1.cubeList.add(new ModelBox(Scope49_r1, 0, 29, -2.0F, -32.6F, -10.0F, 1, 1, 6, 0.0F, false));

        Scope44_r1 = new ModelRenderer(this);
        Scope44_r1.setRotationPoint(30.8271F, -6.1812F, 0.0F);
        gun.addChild(Scope44_r1);
        setRotationAngle(Scope44_r1, 0.0F, 0.0F, -2.5653F);
        Scope44_r1.cubeList.add(new ModelBox(Scope44_r1, 37, 42, -3.0F, -29.0F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope43_r1 = new ModelRenderer(this);
        Scope43_r1.setRotationPoint(37.5813F, 40.3862F, 0.0F);
        gun.addChild(Scope43_r1);
        setRotationAngle(Scope43_r1, 0.0F, 0.0F, -0.632F);
        Scope43_r1.cubeList.add(new ModelBox(Scope43_r1, 21, 43, -4.3F, -30.25F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope42_r1 = new ModelRenderer(this);
        Scope42_r1.setRotationPoint(40.2256F, 0.4114F, 0.0F);
        gun.addChild(Scope42_r1);
        setRotationAngle(Scope42_r1, 0.0F, 0.0F, -2.2307F);
        Scope42_r1.cubeList.add(new ModelBox(Scope42_r1, 44, 1, -2.0F, -29.0F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope41_r1 = new ModelRenderer(this);
        Scope41_r1.setRotationPoint(-5.1393F, 1.4449F, 0.0F);
        gun.addChild(Scope41_r1);
        setRotationAngle(Scope41_r1, 0.0F, 0.0F, 2.1935F);
        Scope41_r1.cubeList.add(new ModelBox(Scope41_r1, 44, 43, -0.7F, -30.25F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope40_r1 = new ModelRenderer(this);
        Scope40_r1.setRotationPoint(44.9103F, 30.6767F, 0.0F);
        gun.addChild(Scope40_r1);
        setRotationAngle(Scope40_r1, 0.0F, 0.0F, -1.0038F);
        Scope40_r1.cubeList.add(new ModelBox(Scope40_r1, 7, 45, -4.3F, -31.25F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope39_r1 = new ModelRenderer(this);
        Scope39_r1.setRotationPoint(-8.988F, 35.2829F, 0.0F);
        gun.addChild(Scope39_r1);
        setRotationAngle(Scope39_r1, 0.0F, 0.0F, 1.041F);
        Scope39_r1.cubeList.add(new ModelBox(Scope39_r1, 45, 8, -3.0F, -32.5F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope38_r1 = new ModelRenderer(this);
        Scope38_r1.setRotationPoint(4.1924F, -9.5389F, 0.0F);
        gun.addChild(Scope38_r1);
        setRotationAngle(Scope38_r1, 0.0F, 0.0F, 2.6397F);
        Scope38_r1.cubeList.add(new ModelBox(Scope38_r1, 45, 14, -0.7F, -31.25F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope37_r1 = new ModelRenderer(this);
        Scope37_r1.setRotationPoint(5.208F, 45.9769F, 0.0F);
        gun.addChild(Scope37_r1);
        setRotationAngle(Scope37_r1, 0.0F, 0.0F, 0.4833F);
        Scope37_r1.cubeList.add(new ModelBox(Scope37_r1, 45, 20, -2.0F, -32.5F, -4.0F, 1, 1, 5, 0.0F, false));

        Scope32_r1 = new ModelRenderer(this);
        Scope32_r1.setRotationPoint(40.1488F, 37.1214F, 0.0F);
        gun.addChild(Scope32_r1);
        setRotationAngle(Scope32_r1, 0.0F, 0.0F, -0.7808F);
        Scope32_r1.cubeList.add(new ModelBox(Scope32_r1, 35, 0, -4.35F, -29.65F, 0.2F, 2, 1, 5, 0.0F, false));

        Scope30_r1 = new ModelRenderer(this);
        Scope30_r1.setRotationPoint(-4.4189F, 41.1598F, 0.0F);
        gun.addChild(Scope30_r1);
        setRotationAngle(Scope30_r1, 0.0F, 0.0F, 0.8179F);
        Scope30_r1.cubeList.add(new ModelBox(Scope30_r1, 35, 7, -3.7F, -32.6F, 0.2F, 2, 1, 5, 0.0F, false));

        Scope29_r1 = new ModelRenderer(this);
        Scope29_r1.setRotationPoint(-2.7803F, 40.2436F, 0.0F);
        gun.addChild(Scope29_r1);
        setRotationAngle(Scope29_r1, 0.0F, 0.0F, 0.7808F);
        Scope29_r1.cubeList.add(new ModelBox(Scope29_r1, 9, 32, -1.3F, -32.6F, 0.2F, 1, 2, 5, 0.0F, false));

        Scope28_r1 = new ModelRenderer(this);
        Scope28_r1.setRotationPoint(37.4847F, 40.0908F, 0.0F);
        gun.addChild(Scope28_r1);
        setRotationAngle(Scope28_r1, 0.0F, 0.0F, -0.632F);
        Scope28_r1.cubeList.add(new ModelBox(Scope28_r1, 48, 26, -4.8F, -30.25F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope27_r1 = new ModelRenderer(this);
        Scope27_r1.setRotationPoint(30.5547F, -5.2619F, 0.0F);
        gun.addChild(Scope27_r1);
        setRotationAngle(Scope27_r1, 0.0F, 0.0F, -2.5653F);
        Scope27_r1.cubeList.add(new ModelBox(Scope27_r1, 35, 48, -3.0F, -28.5F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope26_r1 = new ModelRenderer(this);
        Scope26_r1.setRotationPoint(41.1871F, 2.8522F, 0.0F);
        gun.addChild(Scope26_r1);
        setRotationAngle(Scope26_r1, 0.0F, 0.0F, -2.1564F);
        Scope26_r1.cubeList.add(new ModelBox(Scope26_r1, 21, 49, -2.0F, -28.5F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope25_r1 = new ModelRenderer(this);
        Scope25_r1.setRotationPoint(-4.3477F, 1.0388F, 0.0F);
        gun.addChild(Scope25_r1);
        setRotationAngle(Scope25_r1, 0.0F, 0.0F, 2.1935F);
        Scope25_r1.cubeList.add(new ModelBox(Scope25_r1, 32, 28, -0.2F, -30.25F, 0.2F, 2, 2, 5, 0.0F, false));

        Scope24_r1 = new ModelRenderer(this);
        Scope24_r1.setRotationPoint(44.6788F, 30.255F, 0.0F);
        gun.addChild(Scope24_r1);
        setRotationAngle(Scope24_r1, 0.0F, 0.0F, -1.0038F);
        Scope24_r1.cubeList.add(new ModelBox(Scope24_r1, 42, 49, -4.8F, -31.25F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope23_r1 = new ModelRenderer(this);
        Scope23_r1.setRotationPoint(-9.4194F, 35.0356F, 0.0F);
        gun.addChild(Scope23_r1);
        setRotationAngle(Scope23_r1, 0.0F, 0.0F, 1.041F);
        Scope23_r1.cubeList.add(new ModelBox(Scope23_r1, 49, 50, -3.0F, -33.0F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope22_r1 = new ModelRenderer(this);
        Scope22_r1.setRotationPoint(4.1266F, -9.1952F, 0.0F);
        gun.addChild(Scope22_r1);
        setRotationAngle(Scope22_r1, 0.0F, 0.0F, 2.6025F);
        Scope22_r1.cubeList.add(new ModelBox(Scope22_r1, 51, 0, -0.2F, -31.25F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope21_r1 = new ModelRenderer(this);
        Scope21_r1.setRotationPoint(3.8643F, 45.3945F, 0.0F);
        gun.addChild(Scope21_r1);
        setRotationAngle(Scope21_r1, 0.0F, 0.0F, 0.5205F);
        Scope21_r1.cubeList.add(new ModelBox(Scope21_r1, 7, 51, -2.0F, -33.0F, 0.2F, 1, 1, 5, 0.0F, false));

        Scope31_r1 = new ModelRenderer(this);
        Scope31_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        gun.addChild(Scope31_r1);
        setRotationAngle(Scope31_r1, 0.0F, 0.0F, 2.3794F);
        Scope31_r1.cubeList.add(new ModelBox(Scope31_r1, 0, 0, -0.5F, -28.5F, -3.8F, 1, 2, 9, 0.0F, false));

        Scope16_r1 = new ModelRenderer(this);
        Scope16_r1.setRotationPoint(2.9308F, 0.8257F, 0.0F);
        gun.addChild(Scope16_r1);
        setRotationAngle(Scope16_r1, 0.0F, 0.0F, 2.3794F);
        Scope16_r1.cubeList.add(new ModelBox(Scope16_r1, 11, 0, 0.8F, -27.5F, -4.0F, 1, 3, 2, 0.0F, false));
        Scope16_r1.cubeList.add(new ModelBox(Scope16_r1, 11, 11, 0.8F, -27.5F, 3.2F, 1, 3, 2, 0.0F, false));

        Scope12_r1 = new ModelRenderer(this);
        Scope12_r1.setRotationPoint(-2.8032F, 16.5898F, 0.0F);
        gun.addChild(Scope12_r1);
        setRotationAngle(Scope12_r1, 0.0F, 0.0F, 1.7846F);
        Scope12_r1.cubeList.add(new ModelBox(Scope12_r1, 16, 25, 1.3F, -25.5F, 3.2F, 3, 1, 2, 0.0F, false));

        Scope10_r1 = new ModelRenderer(this);
        Scope10_r1.setRotationPoint(-3.152F, 17.6089F, 0.0F);
        gun.addChild(Scope10_r1);
        setRotationAngle(Scope10_r1, 0.0F, 0.0F, 1.7474F);
        Scope10_r1.cubeList.add(new ModelBox(Scope10_r1, 31, 54, 1.2F, -25.5F, -4.0F, 3, 1, 2, 0.0F, false));

        Scope5_r1 = new ModelRenderer(this);
        Scope5_r1.setRotationPoint(20.5405F, 21.6036F, 23.2971F);
        gun.addChild(Scope5_r1);
        setRotationAngle(Scope5_r1, 2.0076F, 0.0F, 0.0F);
        Scope5_r1.cubeList.add(new ModelBox(Scope5_r1, 0, 25, -0.5F, -21.0F, 3.0F, 1, 2, 1, 0.0F, false));

        Scope4_r1 = new ModelRenderer(this);
        Scope4_r1.setRotationPoint(20.5405F, 7.2076F, 4.2643F);
        gun.addChild(Scope4_r1);
        setRotationAngle(Scope4_r1, 2.9371F, 0.0F, 0.0F);
        Scope4_r1.cubeList.add(new ModelBox(Scope4_r1, 52, 45, -0.5F, -21.0F, 0.0F, 1, 1, 4, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        gun.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
