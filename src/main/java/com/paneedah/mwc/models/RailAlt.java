package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class RailAlt extends ModelBase {
    private final ModelRenderer railalt;
    private final ModelRenderer Rail132_r1;
    private final ModelRenderer Rail112_r1;
    private final ModelRenderer Rail85_r1;
    private final ModelRenderer Rail84_r1;
    private final ModelRenderer Rail80_r1;
    private final ModelRenderer Rail51_r1;

    public RailAlt() {
        textureWidth = 256;
        textureHeight = 128;

        railalt = new ModelRenderer(this);
        railalt.setRotationPoint(23.2946F, 13.157F, 0.0F);
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 0.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 1.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 3.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 6.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 9.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 12.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 15.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 18.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 21.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 24.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 27.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 25.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 22.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 19.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 16.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 13.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 10.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 7.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 4.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.2946F, -13.157F, 28.5F, 1, 1, 2, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 0.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 3.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 6.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 9.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 12.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 15.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 18.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 21.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 24.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 27.0F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 28.5F, 1, 1, 2, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 25.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 22.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 19.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 16.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 13.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 10.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 7.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 4.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.7946F, -13.156F, 1.5F, 1, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -23.0946F, -12.357F, 0.5F, 2, 1, 30, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -23.6446F, -12.607F, 0.5F, 1, 0, 30, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -20.4446F, -12.607F, 0.5F, 2, 0, 30, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -21.9946F, -12.357F, 0.5F, 3, 1, 30, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.6446F, -12.657F, 0.5F, 3, 1, 30, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -23.0946F, -12.357F, 0.0F, 2, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -21.9946F, -12.357F, 0.0F, 3, 1, 1, 0.0F, true));
        railalt.cubeList.add(new ModelBox(railalt, 0, 0, -22.6446F, -12.657F, 0.0F, 3, 1, 1, 0.0F, true));

        Rail132_r1 = new ModelRenderer(this);
        Rail132_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        railalt.addChild(Rail132_r1);
        setRotationAngle(Rail132_r1, 0.0F, 0.0F, -1.12F);
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 4.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 7.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 10.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 13.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 13.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 16.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 19.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 22.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 25.5F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 28.5F, 1, 1, 2, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 27.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 24.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 21.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 18.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 15.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 12.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 9.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 6.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 3.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 0.0F, 1, 1, 1, 0.0F, true));
        Rail132_r1.cubeList.add(new ModelBox(Rail132_r1, 0, 0, 2.0F, -23.999F, 1.5F, 1, 1, 1, 0.0F, true));

        Rail112_r1 = new ModelRenderer(this);
        Rail112_r1.setRotationPoint(-44.0497F, -4.0503F, 0.0F);
        railalt.addChild(Rail112_r1);
        setRotationAngle(Rail112_r1, 0.0F, 0.0F, 1.12F);
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 1.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 4.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 7.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 10.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 13.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 16.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 19.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 22.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 28.5F, 1, 1, 2, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 25.5F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 27.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 24.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 21.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 18.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 15.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 12.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 9.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 6.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 3.0F, 1, 1, 1, 0.0F, true));
        Rail112_r1.cubeList.add(new ModelBox(Rail112_r1, 0, 0, 1.5F, -23.999F, 0.0F, 1, 1, 1, 0.0F, true));

        Rail85_r1 = new ModelRenderer(this);
        Rail85_r1.setRotationPoint(-34.6638F, -30.2241F, 0.0F);
        railalt.addChild(Rail85_r1);
        setRotationAngle(Rail85_r1, 0.0F, 0.0F, 2.1935F);
        Rail85_r1.cubeList.add(new ModelBox(Rail85_r1, 0, 0, 4.85F, -23.45F, 0.5F, 1, 0, 30, 0.0F, true));

        Rail84_r1 = new ModelRenderer(this);
        Rail84_r1.setRotationPoint(-10.2136F, 6.6188F, 0.0F);
        railalt.addChild(Rail84_r1);
        setRotationAngle(Rail84_r1, 0.0F, 0.0F, -0.5949F);
        Rail84_r1.cubeList.add(new ModelBox(Rail84_r1, 0, 0, -0.35F, -23.45F, 0.5F, 0, 1, 30, 0.0F, true));

        Rail80_r1 = new ModelRenderer(this);
        Rail80_r1.setRotationPoint(-43.3079F, -0.6888F, 0.0F);
        railalt.addChild(Rail80_r1);
        setRotationAngle(Rail80_r1, 0.0F, 0.0F, 1.0038F);
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 25.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 22.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 19.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 16.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 13.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 10.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 7.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 4.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 1.5F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 28.5F, 1, 1, 2, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 27.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 24.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 21.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 18.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 15.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 12.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 9.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 6.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 3.0F, 1, 1, 1, 0.0F, true));
        Rail80_r1.cubeList.add(new ModelBox(Rail80_r1, 0, 0, 0.5F, -24.0F, 0.0F, 1, 1, 1, 0.0F, true));

        Rail51_r1 = new ModelRenderer(this);
        Rail51_r1.setRotationPoint(-36.0569F, 4.4789F, 0.0F);
        railalt.addChild(Rail51_r1);
        setRotationAngle(Rail51_r1, 0.0F, 0.0F, 0.5949F);
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 28.5F, 1, 1, 2, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 1.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 4.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 7.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 10.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 13.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 16.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 19.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 22.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 25.5F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 27.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 24.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 21.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 18.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 15.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 12.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 9.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 6.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 3.0F, 1, 1, 1, 0.0F, true));
        Rail51_r1.cubeList.add(new ModelBox(Rail51_r1, 0, 0, 4.0F, -24.0F, 0.0F, 1, 1, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        railalt.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
