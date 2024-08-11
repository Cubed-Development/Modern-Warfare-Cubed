package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 3.8.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class HK416Receiver extends ModelBase {
    private final ModelRenderer receiver;
    private final ModelRenderer gun263_r1;
    private final ModelRenderer gun263_r2;
    private final ModelRenderer gun264_r1;
    private final ModelRenderer gun264_r2;
    private final ModelRenderer gun143_r1;
    private final ModelRenderer gun140_r1;
    private final ModelRenderer receiver18_r1;
    private final ModelRenderer receiver17_r1;
    private final ModelRenderer receiver14_r1;
    private final ModelRenderer receiver14_r2;
    private final ModelRenderer receiver13_r1;
    private final ModelRenderer receiver12_r1;
    private final ModelRenderer receiver15_r1;
    private final ModelRenderer receiver14_r3;
    private final ModelRenderer receiver14_r4;
    private final ModelRenderer receiver13_r2;
    private final ModelRenderer receiver13_r3;
    private final ModelRenderer receiver14_r5;
    private final ModelRenderer receiver14_r6;
    private final ModelRenderer receiver15_r2;
    private final ModelRenderer receiver14_r7;
    private final ModelRenderer receiver14_r8;
    private final ModelRenderer receiver13_r4;
    private final ModelRenderer receiver12_r2;
    private final ModelRenderer receiver13_r5;
    private final ModelRenderer receiver13_r6;
    private final ModelRenderer receiver12_r3;
    private final ModelRenderer receiver11_r1;
    private final ModelRenderer receiver16_r1;
    private final ModelRenderer receiver18_r2;
    private final ModelRenderer receiver17_r2;
    private final ModelRenderer gun125_r1;
    private final ModelRenderer gun170;
    private final ModelRenderer gun172_r1;
    private final ModelRenderer gun172_r2;
    private final ModelRenderer gun264;
    private final ModelRenderer bone2;
    private final ModelRenderer bone_r1;

    public HK416Receiver() {
        textureWidth = 200;
        textureHeight = 200;

        receiver = new ModelRenderer(this);
        receiver.setRotationPoint(0.0F, 24.0F, 0.0F);
        receiver.cubeList.add(new ModelBox(receiver, 32, 80, -2.0F, -40.3F, -1.0F, 1, 1, 2, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 86, 72, -2.501F, -40.101F, -22.7F, 2, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 26, 85, -2.5F, -40.1F, -22.0F, 2, 1, 21, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 33, 100, -1.401F, -39.301F, -22.701F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 86, 70, -2.601F, -39.301F, -22.702F, 2, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 49, 79, -0.6F, -38.85F, -18.5F, 1, 1, 2, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 12, 100, -0.599F, -38.85F, -19.0F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 103, 109, -1.4F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 102, 85, -2.6F, -39.3F, -22.0F, 1, 1, 23, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 92, 96, -2.0F, -38.8F, -23.699F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 88, 96, -2.0F, -37.2F, -23.699F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 37, 100, -4.3F, -37.4F, -21.0F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 0, 100, -4.3F, -37.4F, -12.0F, 1, 1, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 74, 49, -2.5F, -37.001F, -22.701F, 2, 2, 1, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 51, 85, -0.6F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 50, 85, -0.8F, -37.0F, -22.698F, 1, 2, 24, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 62, 43, -3.4F, -37.1F, -21.201F, 1, 2, 10, 0.0F, false));
        receiver.cubeList.add(new ModelBox(receiver, 0, 84, -3.2F, -37.0F, -22.699F, 1, 2, 24, 0.0F, false));

        gun263_r1 = new ModelRenderer(this);
        gun263_r1.setRotationPoint(-4.3F, -37.4F, -21.0F);
        receiver.addChild(gun263_r1);
        setRotationAngle(gun263_r1, 0.0F, 0.0F, -0.3491F);
        gun263_r1.cubeList.add(new ModelBox(gun263_r1, 99, 51, 0.0F, 0.0F, -0.001F, 1, 1, 1, 0.0F, false));
        gun263_r1.cubeList.add(new ModelBox(gun263_r1, 51, 99, 0.0F, 0.0F, 8.999F, 1, 1, 1, 0.0F, false));

        gun263_r2 = new ModelRenderer(this);
        gun263_r2.setRotationPoint(-3.8F, -37.5F, -21.0F);
        receiver.addChild(gun263_r2);
        setRotationAngle(gun263_r2, 0.0F, 0.0F, 0.4014F);
        gun263_r2.cubeList.add(new ModelBox(gun263_r2, 67, 99, 0.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F, false));
        gun263_r2.cubeList.add(new ModelBox(gun263_r2, 63, 99, -0.001F, -1.22F, -0.001F, 1, 1, 1, 0.0F, false));
        gun263_r2.cubeList.add(new ModelBox(gun263_r2, 59, 99, 0.0F, -0.7F, 9.0F, 1, 1, 1, 0.0F, false));
        gun263_r2.cubeList.add(new ModelBox(gun263_r2, 99, 57, -0.001F, -1.22F, 8.999F, 1, 1, 1, 0.0F, false));

        gun264_r1 = new ModelRenderer(this);
        gun264_r1.setRotationPoint(-3.32F, -38.62F, -21.0F);
        receiver.addChild(gun264_r1);
        setRotationAngle(gun264_r1, 0.0F, 0.0F, 0.8203F);
        gun264_r1.cubeList.add(new ModelBox(gun264_r1, 99, 59, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        gun264_r1.cubeList.add(new ModelBox(gun264_r1, 20, 0, -0.101F, -1.1F, 0.5F, 1, 1, 9, -0.1F, false));
        gun264_r1.cubeList.add(new ModelBox(gun264_r1, 55, 99, 0.0F, -1.0F, 9.0F, 1, 1, 1, 0.0F, false));

        gun264_r2 = new ModelRenderer(this);
        gun264_r2.setRotationPoint(-4.5F, -36.8F, -22.4F);
        receiver.addChild(gun264_r2);
        setRotationAngle(gun264_r2, 0.0F, 0.0F, -0.9295F);
        gun264_r2.cubeList.add(new ModelBox(gun264_r2, 75, 77, 0.0F, 0.0F, 5.35F, 1, 1, 2, -0.2F, false));
        gun264_r2.cubeList.add(new ModelBox(gun264_r2, 58, 61, 0.0F, 0.0F, 0.0F, 1, 1, 12, -0.3F, false));

        gun143_r1 = new ModelRenderer(this);
        gun143_r1.setRotationPoint(-4.7F, -38.0F, 0.5F);
        receiver.addChild(gun143_r1);
        setRotationAngle(gun143_r1, 0.0F, -0.2603F, 0.0F);
        gun143_r1.cubeList.add(new ModelBox(gun143_r1, 75, 37, -0.5F, -0.5F, 1.4F, 2, 2, 1, -0.4F, false));
        gun143_r1.cubeList.add(new ModelBox(gun143_r1, 51, 85, 0.0F, 0.0F, -0.1F, 1, 1, 2, 0.0F, false));

        gun140_r1 = new ModelRenderer(this);
        gun140_r1.setRotationPoint(-3.1F, -37.8F, -6.0F);
        receiver.addChild(gun140_r1);
        setRotationAngle(gun140_r1, 0.0F, -0.2603F, 0.0F);
        gun140_r1.cubeList.add(new ModelBox(gun140_r1, 64, 74, -0.01F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));
        gun140_r1.cubeList.add(new ModelBox(gun140_r1, 20, 29, -0.011F, -0.4F, -0.001F, 2, 1, 7, 0.0F, false));

        receiver18_r1 = new ModelRenderer(this);
        receiver18_r1.setRotationPoint(-2.6F, -39.25F, 1.0F);
        receiver.addChild(receiver18_r1);
        setRotationAngle(receiver18_r1, 0.0F, 0.0F, -0.8029F);
        receiver18_r1.cubeList.add(new ModelBox(receiver18_r1, 8, 100, -0.9F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

        receiver17_r1 = new ModelRenderer(this);
        receiver17_r1.setRotationPoint(-0.4F, -39.25F, 1.0F);
        receiver.addChild(receiver17_r1);
        setRotationAngle(receiver17_r1, 0.0F, 0.0F, 0.8029F);
        receiver17_r1.cubeList.add(new ModelBox(receiver17_r1, 100, 18, -0.1F, 0.0F, -0.4F, 1, 1, 1, 0.0F, false));

        receiver14_r1 = new ModelRenderer(this);
        receiver14_r1.setRotationPoint(-3.6F, -37.5F, -11.7F);
        receiver.addChild(receiver14_r1);
        setRotationAngle(receiver14_r1, 0.0F, 0.0F, -0.4014F);
        receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 86, 68, 0.0F, 0.0F, 0.001F, 1, 1, 13, 0.0F, false));
        receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 62, 19, -0.4F, -0.2F, -8.999F, 1, 2, 10, -0.4F, false));
        receiver14_r1.cubeList.add(new ModelBox(receiver14_r1, 78, 20, 0.0F, 0.0F, -10.998F, 1, 1, 2, 0.0F, false));

        receiver14_r2 = new ModelRenderer(this);
        receiver14_r2.setRotationPoint(-3.2F, -37.5F, -23.7F);
        receiver.addChild(receiver14_r2);
        setRotationAngle(receiver14_r2, 0.0F, 0.0F, -0.4014F);
        receiver14_r2.cubeList.add(new ModelBox(receiver14_r2, 97, 19, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

        receiver13_r1 = new ModelRenderer(this);
        receiver13_r1.setRotationPoint(0.2F, -37.5F, -23.7F);
        receiver.addChild(receiver13_r1);
        setRotationAngle(receiver13_r1, 0.0F, 0.0F, 0.4014F);
        receiver13_r1.cubeList.add(new ModelBox(receiver13_r1, 97, 39, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

        receiver12_r1 = new ModelRenderer(this);
        receiver12_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
        receiver.addChild(receiver12_r1);
        setRotationAngle(receiver12_r1, 0.0F, 0.0F, 0.4014F);
        receiver12_r1.cubeList.add(new ModelBox(receiver12_r1, 86, 43, -1.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

        receiver15_r1 = new ModelRenderer(this);
        receiver15_r1.setRotationPoint(-3.7F, -37.5F, 0.6F);
        receiver.addChild(receiver15_r1);
        setRotationAngle(receiver15_r1, -0.925F, 0.0F, -0.3142F);
        receiver15_r1.cubeList.add(new ModelBox(receiver15_r1, 79, 55, 0.001F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

        receiver14_r3 = new ModelRenderer(this);
        receiver14_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
        receiver.addChild(receiver14_r3);
        setRotationAngle(receiver14_r3, -0.925F, 0.0F, 0.3142F);
        receiver14_r3.cubeList.add(new ModelBox(receiver14_r3, 79, 62, -0.999F, 0.3F, 0.5F, 1, 2, 1, 0.0F, false));

        receiver14_r4 = new ModelRenderer(this);
        receiver14_r4.setRotationPoint(-3.7F, -37.5F, 0.6F);
        receiver.addChild(receiver14_r4);
        setRotationAngle(receiver14_r4, 0.0F, 0.0F, -0.3142F);
        receiver14_r4.cubeList.add(new ModelBox(receiver14_r4, 79, 31, 0.0F, 0.0F, 0.001F, 1, 2, 1, 0.0F, false));

        receiver13_r2 = new ModelRenderer(this);
        receiver13_r2.setRotationPoint(0.7F, -37.5F, 0.6F);
        receiver.addChild(receiver13_r2);
        setRotationAngle(receiver13_r2, 0.0F, 0.0F, 0.3142F);
        receiver13_r2.cubeList.add(new ModelBox(receiver13_r2, 80, 5, -1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        receiver13_r3 = new ModelRenderer(this);
        receiver13_r3.setRotationPoint(0.7F, -37.5F, 0.6F);
        receiver.addChild(receiver13_r3);
        setRotationAngle(receiver13_r3, 0.0F, 0.0F, -0.4014F);
        receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 20, 100, -0.999F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));
        receiver13_r3.cubeList.add(new ModelBox(receiver13_r3, 100, 20, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        receiver14_r5 = new ModelRenderer(this);
        receiver14_r5.setRotationPoint(-3.7F, -37.5F, 0.6F);
        receiver.addChild(receiver14_r5);
        setRotationAngle(receiver14_r5, 0.0F, 0.0F, 0.4014F);
        receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 4, 100, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        receiver14_r5.cubeList.add(new ModelBox(receiver14_r5, 100, 11, -0.001F, -1.2F, 0.001F, 1, 1, 1, 0.0F, false));

        receiver14_r6 = new ModelRenderer(this);
        receiver14_r6.setRotationPoint(-2.3F, -38.8F, -11.7F);
        receiver.addChild(receiver14_r6);
        setRotationAngle(receiver14_r6, 0.0F, 0.0F, -0.4014F);
        receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 101, 69, -1.0F, 0.0F, 0.001F, 1, 1, 13, 0.0F, false));
        receiver14_r6.cubeList.add(new ModelBox(receiver14_r6, 78, 23, -1.0F, 0.0F, -10.999F, 1, 1, 2, 0.0F, false));

        receiver15_r2 = new ModelRenderer(this);
        receiver15_r2.setRotationPoint(-1.9F, -36.2F, -23.7F);
        receiver.addChild(receiver15_r2);
        setRotationAngle(receiver15_r2, 0.0F, 0.0F, 0.4014F);
        receiver15_r2.cubeList.add(new ModelBox(receiver15_r2, 96, 96, -1.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

        receiver14_r7 = new ModelRenderer(this);
        receiver14_r7.setRotationPoint(-1.1F, -36.2F, -23.7F);
        receiver.addChild(receiver14_r7);
        setRotationAngle(receiver14_r7, 0.0F, 0.0F, -0.4014F);
        receiver14_r7.cubeList.add(new ModelBox(receiver14_r7, 30, 97, 0.0F, -1.0F, -0.001F, 1, 1, 1, 0.0F, false));

        receiver14_r8 = new ModelRenderer(this);
        receiver14_r8.setRotationPoint(-1.9F, -38.8F, -23.7F);
        receiver.addChild(receiver14_r8);
        setRotationAngle(receiver14_r8, 0.0F, 0.0F, -0.4014F);
        receiver14_r8.cubeList.add(new ModelBox(receiver14_r8, 97, 21, -1.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

        receiver13_r4 = new ModelRenderer(this);
        receiver13_r4.setRotationPoint(-1.1F, -38.8F, -23.7F);
        receiver.addChild(receiver13_r4);
        setRotationAngle(receiver13_r4, 0.0F, 0.0F, 0.4014F);
        receiver13_r4.cubeList.add(new ModelBox(receiver13_r4, 51, 97, 0.0F, 0.0F, 0.001F, 1, 1, 1, 0.0F, false));

        receiver12_r2 = new ModelRenderer(this);
        receiver12_r2.setRotationPoint(-0.7F, -38.8F, -22.7F);
        receiver.addChild(receiver12_r2);
        setRotationAngle(receiver12_r2, 0.0F, 0.0F, 0.4014F);
        receiver12_r2.cubeList.add(new ModelBox(receiver12_r2, 86, 0, 0.0F, 0.0F, 0.001F, 1, 1, 24, 0.0F, false));

        receiver13_r5 = new ModelRenderer(this);
        receiver13_r5.setRotationPoint(-3.6F, -37.5F, -11.7F);
        receiver.addChild(receiver13_r5);
        setRotationAngle(receiver13_r5, 0.0F, 0.0F, 0.4014F);
        receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 103, 25, 0.0F, -1.0F, 0.0F, 1, 1, 13, 0.0F, false));
        receiver13_r5.cubeList.add(new ModelBox(receiver13_r5, 78, 26, 0.0F, -1.0F, -11.0F, 1, 1, 2, 0.0F, false));

        receiver13_r6 = new ModelRenderer(this);
        receiver13_r6.setRotationPoint(-3.2F, -37.5F, -23.7F);
        receiver.addChild(receiver13_r6);
        setRotationAngle(receiver13_r6, 0.0F, 0.0F, 0.4014F);
        receiver13_r6.cubeList.add(new ModelBox(receiver13_r6, 26, 97, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        receiver12_r3 = new ModelRenderer(this);
        receiver12_r3.setRotationPoint(0.2F, -37.5F, -23.7F);
        receiver.addChild(receiver12_r3);
        setRotationAngle(receiver12_r3, 0.0F, 0.0F, -0.4014F);
        receiver12_r3.cubeList.add(new ModelBox(receiver12_r3, 97, 48, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        receiver11_r1 = new ModelRenderer(this);
        receiver11_r1.setRotationPoint(0.6F, -37.5F, -22.7F);
        receiver.addChild(receiver11_r1);
        setRotationAngle(receiver11_r1, 0.0F, 0.0F, -0.4014F);
        receiver11_r1.cubeList.add(new ModelBox(receiver11_r1, 76, 87, -1.0F, -1.0F, 0.0F, 1, 1, 24, 0.0F, false));

        receiver16_r1 = new ModelRenderer(this);
        receiver16_r1.setRotationPoint(0.4F, -38.85F, -19.0F);
        receiver.addChild(receiver16_r1);
        setRotationAngle(receiver16_r1, 0.0F, 0.0F, 1.9705F);
        receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 16, 100, 0.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        receiver16_r1.cubeList.add(new ModelBox(receiver16_r1, 55, 79, 0.0F, 0.0F, 0.5F, 1, 1, 2, 0.0F, false));

        receiver18_r2 = new ModelRenderer(this);
        receiver18_r2.setRotationPoint(0.4F, -38.85F, -19.0F);
        receiver.addChild(receiver18_r2);
        setRotationAngle(receiver18_r2, 0.0F, -1.9333F, 0.0F);
        receiver18_r2.cubeList.add(new ModelBox(receiver18_r2, 80, 47, 0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, false));

        receiver17_r2 = new ModelRenderer(this);
        receiver17_r2.setRotationPoint(0.4F, -38.85F, -16.5F);
        receiver.addChild(receiver17_r2);
        setRotationAngle(receiver17_r2, 0.0F, 1.9333F, 0.0F);
        receiver17_r2.cubeList.add(new ModelBox(receiver17_r2, 80, 76, 0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));

        gun125_r1 = new ModelRenderer(this);
        gun125_r1.setRotationPoint(-2.5F, -40.1F, -1.0F);
        receiver.addChild(gun125_r1);
        setRotationAngle(gun125_r1, -0.632F, 0.0F, 0.0F);
        gun125_r1.cubeList.add(new ModelBox(gun125_r1, 72, 68, -0.001F, 0.0F, 0.0F, 2, 1, 2, 0.0F, false));

        gun170 = new ModelRenderer(this);
        gun170.setRotationPoint(-3.5F, -39.25F, -10.3F);
        receiver.addChild(gun170);
        setRotationAngle(gun170, 0.0F, 0.0F, -0.0524F);
        gun170.cubeList.add(new ModelBox(gun170, 73, 3, -1.3F, -0.001F, 0.0F, 3, 2, 1, 0.0F, false));

        gun172_r1 = new ModelRenderer(this);
        gun172_r1.setRotationPoint(-1.3F, -0.05F, 1.0F);
        gun170.addChild(gun172_r1);
        setRotationAngle(gun172_r1, 0.0F, -0.2618F, 0.0F);
        gun172_r1.cubeList.add(new ModelBox(gun172_r1, 62, 31, 0.0F, 0.05F, -1.0F, 3, 2, 1, 0.0F, false));

        gun172_r2 = new ModelRenderer(this);
        gun172_r2.setRotationPoint(-1.3F, -0.05F, 0.0F);
        gun170.addChild(gun172_r2);
        setRotationAngle(gun172_r2, 0.0F, -0.9076F, 0.0F);
        gun172_r2.cubeList.add(new ModelBox(gun172_r2, 79, 58, 1.0F, 0.05F, -2.0F, 1, 2, 1, 0.0F, false));
        gun172_r2.cubeList.add(new ModelBox(gun172_r2, 43, 9, 0.0F, 0.05F, -3.0F, 1, 2, 3, 0.0F, false));

        gun264 = new ModelRenderer(this);
        gun264.setRotationPoint(-3.7F, -34.2F, -20.0F);
        receiver.addChild(gun264);
        setRotationAngle(gun264, 0.0F, 0.0F, 0.1578F);
        gun264.cubeList.add(new ModelBox(gun264, 0, 19, -1.0F, -3.0F, -0.3F, 1, 3, 8, -0.3F, false));
        gun264.cubeList.add(new ModelBox(gun264, 30, 42, -0.85F, -2.7F, 0.25F, 1, 2, 3, -0.1F, false));
        gun264.cubeList.add(new ModelBox(gun264, 33, 19, -0.85F, -2.7F, 4.65F, 1, 2, 3, -0.1F, false));
        gun264.cubeList.add(new ModelBox(gun264, 99, 45, -1.0F, -1.3F, 3.45F, 1, 1, 1, -0.1F, false));
        gun264.cubeList.add(new ModelBox(gun264, 99, 43, -1.001F, -1.7F, 3.449F, 1, 1, 1, -0.1F, false));
        gun264.cubeList.add(new ModelBox(gun264, 0, 30, -1.0F, -3.0F, 7.1F, 1, 3, 1, -0.3F, false));
        gun264.cubeList.add(new ModelBox(gun264, 0, 0, -1.001F, -3.001F, 7.3F, 1, 3, 1, -0.3F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-0.5F, -16.75F, -50.7F);
        bone2.cubeList.add(new ModelBox(bone2, 45, 160, -1.05F, 0.0F, 28.001F, 1, 1, 21, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 45, 160, -1.95F, -0.001F, 28.0F, 1, 1, 21, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(-0.95F, 0.0F, 49.001F);
        bone2.addChild(bone_r1);
        setRotationAngle(bone_r1, -0.5934F, 0.0F, 0.0F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 54, 163, -1.001F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 54, 163, -0.101F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        receiver.render(f5);
        bone2.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
