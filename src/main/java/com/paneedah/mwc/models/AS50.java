package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AS50 extends ModelWithAttachments {
    private final ModelRenderer gun;
    private final ModelRenderer Stock32_r1;
    private final ModelRenderer Stock30_r1;
    private final ModelRenderer Stock29_r1;
    private final ModelRenderer Stock27_r1;
    private final ModelRenderer Stock21_r1;
    private final ModelRenderer Stock15_r1;
    private final ModelRenderer Stock9_r1;
    private final ModelRenderer Stock8_r1;
    private final ModelRenderer Stock5_r1;
    private final ModelRenderer Grip30_r1;
    private final ModelRenderer Grip27_r1;
    private final ModelRenderer Grip23_r1;
    private final ModelRenderer Grip22_r1;
    private final ModelRenderer Grip21_r1;
    private final ModelRenderer Grip20_r1;
    private final ModelRenderer Grip19_r1;
    private final ModelRenderer Grip18_r1;
    private final ModelRenderer Grip17_r1;
    private final ModelRenderer Grip15_r1;
    private final ModelRenderer Grip14_r1;
    private final ModelRenderer Grip9_r1;
    private final ModelRenderer Grip8_r1;
    private final ModelRenderer Grip3_r1;
    private final ModelRenderer Grip2_r1;
    private final ModelRenderer Grip1_r1;
    private final ModelRenderer Grip32_r1;
    private final ModelRenderer Trigger3_r1;
    private final ModelRenderer Trigger1_r1;
    private final ModelRenderer Trigger4_r1;
    private final ModelRenderer Shape195_r1;
    private final ModelRenderer Shape194_r1;
    private final ModelRenderer Shape193_r1;
    private final ModelRenderer Shape192_r1;
    private final ModelRenderer Shape191_r1;
    private final ModelRenderer Shape190_r1;
    private final ModelRenderer Shape181_r1;
    private final ModelRenderer Shape178_r1;
    private final ModelRenderer Shape173_r1;
    private final ModelRenderer Shape170_r1;
    private final ModelRenderer Shape166_r1;
    private final ModelRenderer Shape165_r1;
    private final ModelRenderer Shape164_r1;
    private final ModelRenderer Shape158_r1;
    private final ModelRenderer Shape156_r1;
    private final ModelRenderer Shape147_r1;
    private final ModelRenderer Shape126_r1;
    private final ModelRenderer Shape125_r1;
    private final ModelRenderer Shape124_r1;
    private final ModelRenderer Shape123_r1;
    private final ModelRenderer Shape105_r1;
    private final ModelRenderer Shape104_r1;
    private final ModelRenderer Shape102_r1;
    private final ModelRenderer Shape100_r1;
    private final ModelRenderer Shape73_r1;
    private final ModelRenderer Shape64_r1;
    private final ModelRenderer Shape61_r1;
    private final ModelRenderer Shape53_r1;
    private final ModelRenderer Shape52_r1;
    private final ModelRenderer Shape51_r1;
    private final ModelRenderer Shape49_r1;
    private final ModelRenderer Shape47_r1;
    private final ModelRenderer Shape44_r1;
    private final ModelRenderer Shape43_r1;
    private final ModelRenderer Shape32_r1;
    private final ModelRenderer Shape14_r1;
    private final ModelRenderer Shape28_r1;
    private final ModelRenderer barrel;
    private final ModelRenderer Muzzle25_r1;
    private final ModelRenderer Muzzle27_r1;
    private final ModelRenderer Muzzle31_r1;
    private final ModelRenderer Muzzle15_r1;
    private final ModelRenderer Muzzle29_r1;
    private final ModelRenderer Muzzle33_r1;
    private final ModelRenderer Muzzle4_r1;
    private final ModelRenderer Muzzle12_r1;
    private final ModelRenderer Muzzle13_r1;
    private final ModelRenderer Muzzle3_r1;
    private final ModelRenderer Muzzle10_r1;
    private final ModelRenderer Muzzle9_r1;
    private final ModelRenderer Muzzle6_r1;
    private final ModelRenderer Muzzle7_r1;
    private final ModelRenderer Barrel22_r1;
    private final ModelRenderer Barrel21_r1;
    private final ModelRenderer Barrel12_r1;
    private final ModelRenderer Barrel11_r1;
    private final ModelRenderer Barrel20_r1;
    private final ModelRenderer Barrel19_r1;
    private final ModelRenderer Barrel25_r1;
    private final ModelRenderer Barrel2_r1;
    private final ModelRenderer Barrel4_r1;
    private final ModelRenderer Barrel6_r1;
    private final ModelRenderer Barrel8_r1;

    public AS50() {
        textureWidth = 352;
        textureHeight = 352;

        gun = new ModelRenderer(this);
        gun.setRotationPoint(0.0F, 24.0F, 0.0F);
        gun.cubeList.add(new ModelBox(gun, 252, 83, 0.5F, -56.0F, -44.7F, 1, 1, 41, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -1.0F, -41.0F, -16.7F, 6, 1, 34, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -1.0F, -54.0F, 16.3F, 6, 13, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 42, 76, -1.0F, -46.0F, -18.7F, 6, 5, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 37, -1.0F, -45.0F, -16.7F, 1, 4, 33, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 0, 4.0F, -45.0F, -16.7F, 1, 4, 33, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 53, 109, -1.0F, -41.0F, -18.7F, 2, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 45, 109, 3.0F, -41.0F, -18.7F, 2, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 14, -0.5F, -45.0F, -41.7F, 5, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 37, 195, 3.7F, -45.0F, -41.7F, 1, 1, 21, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 168, 60, -0.7F, -45.0F, -41.7F, 1, 1, 21, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 107, 66, 3.7F, -44.0F, -23.3F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 107, 29, -0.7F, -44.0F, -23.3F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 143, 170, 4.1F, -51.0F, -41.7F, 1, 6, 23, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 197, 0, -1.1F, -50.0F, -41.7F, 1, 2, 23, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 102, 42, -1.1F, -41.0F, -18.7F, 1, 1, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 84, -1.1F, -51.0F, -18.7F, 1, 6, 35, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 35, 4.1F, -51.0F, -18.7F, 1, 6, 35, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 59, 84, -1.1F, -53.0F, -41.7F, 1, 3, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 59, 91, 4.1F, -53.0F, -41.7F, 1, 2, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 33, 125, -1.1F, -47.0F, -41.7F, 1, 2, 23, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 102, 37, -1.1F, -48.0F, -41.7F, 1, 1, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 63, 18, -1.1F, -48.0F, -20.7F, 1, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 197, 115, -0.7F, -48.0F, -37.7F, 1, 1, 17, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 56, 4, -1.1F, -42.0F, -17.8F, 1, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 105, 103, -1.1F, -45.0F, -19.0F, 1, 2, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 170, 1.5F, -55.5F, -41.7F, 2, 1, 55, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 143, 170, 3.7F, -53.4F, -37.7F, 1, 3, 51, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -0.7F, -53.4F, -2.7F, 1, 4, 16, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 160, 200, -0.7F, -52.0F, -17.7F, 1, 1, 15, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 98, 101, 4.1F, -41.0F, -18.7F, 1, 1, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 51, 47, 4.1F, -42.0F, -17.8F, 1, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 7, 105, 4.1F, -45.0F, -19.0F, 1, 2, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 52, 251, 0.5F, -57.5F, -44.7F, 3, 2, 41, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 30, 0.0F, -38.1F, 37.6F, 4, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 168, 4.8F, -53.3F, -36.0F, 1, 2, 28, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 197, 30, 4.8F, -47.5F, -34.4F, 1, 2, 18, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 20, -0.5F, -53.9F, -41.7F, 5, 9, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 7, 111, 0.5F, -54.6F, -41.7F, 3, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 20, 0.5F, -49.6F, -53.7F, 3, 2, 12, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 211, 148, 0.5F, -54.3F, -53.7F, 3, 3, 12, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 168, -0.7F, -51.8F, -53.7F, 2, 3, 12, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 86, 2.7F, -51.8F, -53.7F, 2, 3, 12, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 125, 0.5F, -55.3F, -68.2F, 3, 1, 27, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 108, 42, 0.5F, -57.3F, -45.9F, 3, 2, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 119, 116, 0.5F, -57.3F, -65.9F, 3, 1, 20, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 59, 109, 0.5F, -56.3F, -53.9F, 3, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 104, 101, 0.5F, -56.3F, -57.9F, 3, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 27, 59, 0.5F, -56.3F, -61.9F, 3, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 67, 109, 0.5F, -56.3F, -49.9F, 3, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 37, 66, 0.5F, -56.3F, -66.9F, 3, 1, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 197, 86, 0.0F, -54.3F, -68.2F, 4, 1, 15, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 197, 0.0F, -47.5F, -68.2F, 4, 1, 15, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 0, 4.9F, -52.4F, -68.2F, 1, 4, 15, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 84, -1.9F, -52.4F, -68.2F, 1, 4, 15, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 17, 53, 1.5F, -48.2F, -53.0F, 1, 2, 8, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 37, 59, 0.0F, -48.3F, -44.0F, 4, 6, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 60, 59, 1.5F, -48.0F, -44.7F, 1, 5, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 53, 29, 1.5F, -46.0F, -47.7F, 1, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 29, 0, 1.5F, -45.0F, -47.7F, 1, 2, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 100, 63, 1.5F, -43.0F, -47.7F, 1, 1, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 28, 14, 0.7F, -42.6F, -44.0F, 2, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 12, 14, 2.3F, -42.6F, -44.0F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 46, 0, 0.5F, -55.5F, -3.7F, 1, 1, 17, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 10, 57, 1.5F, -39.2F, -9.5F, 1, 2, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 106, 74, 0.0F, -39.2F, -3.7F, 4, 4, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 104, 24, 0.0F, -39.2F, 0.8F, 4, 3, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 17, 63, 0.0F, -39.2F, -2.7F, 4, 1, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 108, 37, 0.5F, -39.2F, 1.5F, 3, 3, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 74, 0.0F, -38.2F, -2.7F, 1, 3, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 69, 84, 3.0F, -38.2F, -2.7F, 1, 3, 4, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 17, 103, 0.0F, -39.2F, -4.3F, 4, 4, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 86, 0.0F, -40.2F, -14.7F, 4, 1, 29, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 64, 0.0F, -39.8F, -7.3F, 4, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 18, 28, 0.0F, -36.2F, -7.3F, 4, 1, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 6, 0.5F, -38.8F, -7.3F, 3, 3, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 104, 19, 0.0F, -39.2F, -14.7F, 4, 3, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 58, 0.0F, -35.8F, -13.3F, 4, 1, 6, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 121, 86, -0.5F, -45.5F, 17.3F, 1, 5, 20, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 37, 84, 3.5F, -45.5F, 17.3F, 1, 5, 20, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 18, 0, 0.0F, -51.1F, 17.3F, 4, 11, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 119, 0, 0.0F, -47.1F, 20.3F, 4, 7, 19, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 84, 116, -0.2F, -55.7F, 13.3F, 4, 2, 27, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 198, 3.2F, -55.68F, 13.3F, 1, 2, 27, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 168, 30, 4.4F, -54.0F, 13.3F, 1, 3, 27, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 168, 0, -1.4F, -54.0F, 13.3F, 1, 3, 27, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 168, 144, 4.4F, -51.0F, 20.3F, 1, 1, 20, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 110, 145, -1.4F, -51.0F, 20.3F, 1, 1, 20, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 15, 76, 4.4F, -50.2F, 20.9F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 9, 76, -1.4F, -50.2F, 20.9F, 1, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 191, 60, 4.4F, -50.2F, 21.3F, 1, 1, 19, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 190, 144, -1.4F, -50.2F, 21.3F, 1, 1, 19, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 0, 95, 0.0F, -40.1F, 37.3F, 4, 3, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 68, 78, 0.0F, -40.8F, 38.3F, 4, 3, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 46, 18, 0.0F, -51.0F, 39.3F, 4, 13, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 37, 35, 0.0F, -55.2F, 40.3F, 4, 17, 3, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 37, 84, -0.5F, -55.7F, 43.3F, 5, 18, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 60, 35, 0.0F, -55.4F, 44.3F, 4, 18, 2, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 98, 29, 0.0F, -53.7F, 46.3F, 4, 1, 1, 0.0F, false));
        gun.cubeList.add(new ModelBox(gun, 46, 15, 0.0F, -40.1F, 46.3F, 4, 1, 1, 0.0F, false));

        Stock32_r1 = new ModelRenderer(this);
        Stock32_r1.setRotationPoint(0.0F, 21.397F, 55.5394F);
        gun.addChild(Stock32_r1);
        setRotationAngle(Stock32_r1, 1.0472F, 0.0F, 0.0F);
        Stock32_r1.cubeList.add(new ModelBox(Stock32_r1, 0, 48, 0.0F, -38.4F, 46.3F, 4, 1, 2, 0.0F, false));

        Stock30_r1 = new ModelRenderer(this);
        Stock30_r1.setRotationPoint(0.0F, 8.9579F, 9.3709F);
        gun.addChild(Stock30_r1);
        setRotationAngle(Stock30_r1, 0.2094F, 0.0F, 0.0F);
        Stock30_r1.cubeList.add(new ModelBox(Stock30_r1, 69, 91, 0.0F, -45.1F, 46.3F, 4, 5, 1, 0.0F, false));

        Stock29_r1 = new ModelRenderer(this);
        Stock29_r1.setRotationPoint(0.0F, -10.9858F, -9.9233F);
        gun.addChild(Stock29_r1);
        setRotationAngle(Stock29_r1, -0.2094F, 0.0F, 0.0F);
        Stock29_r1.cubeList.add(new ModelBox(Stock29_r1, 84, 92, 0.0F, -52.7F, 46.3F, 4, 5, 1, 0.0F, false));

        Stock27_r1 = new ModelRenderer(this);
        Stock27_r1.setRotationPoint(0.0F, 15.7278F, 33.903F);
        gun.addChild(Stock27_r1);
        setRotationAngle(Stock27_r1, 0.5236F, 0.0F, 0.0F);
        Stock27_r1.cubeList.add(new ModelBox(Stock27_r1, 84, 12, 0.0F, -55.4F, 45.3F, 4, 2, 1, 0.0F, false));

        Stock21_r1 = new ModelRenderer(this);
        Stock21_r1.setRotationPoint(0.0F, 15.728F, 37.8293F);
        gun.addChild(Stock21_r1);
        setRotationAngle(Stock21_r1, 0.7854F, 0.0F, 0.0F);
        Stock21_r1.cubeList.add(new ModelBox(Stock21_r1, 100, 96, 0.0F, -37.8F, 37.9F, 4, 1, 1, 0.0F, false));

        Stock15_r1 = new ModelRenderer(this);
        Stock15_r1.setRotationPoint(0.0F, 1.8985F, 35.0865F);
        gun.addChild(Stock15_r1);
        setRotationAngle(Stock15_r1, 0.6632F, 0.0F, 0.0F);
        Stock15_r1.cubeList.add(new ModelBox(Stock15_r1, 23, 76, -1.4F, -50.0F, 20.3F, 1, 1, 1, 0.0F, false));
        Stock15_r1.cubeList.add(new ModelBox(Stock15_r1, 29, 76, 4.4F, -50.0F, 20.3F, 1, 1, 1, 0.0F, false));

        Stock9_r1 = new ModelRenderer(this);
        Stock9_r1.setRotationPoint(-31.4956F, -10.3089F, 0.0F);
        gun.addChild(Stock9_r1);
        setRotationAngle(Stock9_r1, 0.0F, 0.0F, 0.6109F);
        Stock9_r1.cubeList.add(new ModelBox(Stock9_r1, 168, 86, -0.4F, -55.1F, 13.3F, 1, 2, 27, 0.0F, false));

        Stock8_r1 = new ModelRenderer(this);
        Stock8_r1.setRotationPoint(32.2189F, -8.0146F, 0.0F);
        gun.addChild(Stock8_r1);
        setRotationAngle(Stock8_r1, 0.0F, 0.0F, -0.6109F);
        Stock8_r1.cubeList.add(new ModelBox(Stock8_r1, 168, 115, 3.4F, -55.1F, 13.3F, 1, 2, 27, 0.0F, false));

        Stock5_r1 = new ModelRenderer(this);
        Stock5_r1.setRotationPoint(0.0F, 3.5594F, 17.3299F);
        gun.addChild(Stock5_r1);
        setRotationAngle(Stock5_r1, 0.3316F, 0.0F, 0.0F);
        Stock5_r1.cubeList.add(new ModelBox(Stock5_r1, 0, 103, 0.0F, -50.0F, 19.3F, 4, 4, 1, 0.0F, false));

        Grip30_r1 = new ModelRenderer(this);
        Grip30_r1.setRotationPoint(0.0F, -5.4409F, -27.7354F);
        gun.addChild(Grip30_r1);
        setRotationAngle(Grip30_r1, -0.7854F, 0.0F, 0.0F);
        Grip30_r1.cubeList.add(new ModelBox(Grip30_r1, 59, 102, 0.0F, -36.2F, -7.3F, 4, 1, 1, 0.0F, false));

        Grip27_r1 = new ModelRenderer(this);
        Grip27_r1.setRotationPoint(0.0F, -9.2006F, 20.2608F);
        gun.addChild(Grip27_r1);
        setRotationAngle(Grip27_r1, 0.576F, 0.0F, 0.0F);
        Grip27_r1.cubeList.add(new ModelBox(Grip27_r1, 84, 44, 0.0F, -38.8F, -5.4F, 4, 2, 1, 0.0F, false));

        Grip23_r1 = new ModelRenderer(this);
        Grip23_r1.setRotationPoint(0.0F, -13.4211F, 23.6014F);
        gun.addChild(Grip23_r1);
        setRotationAngle(Grip23_r1, 0.7854F, 0.0F, 0.0F);
        Grip23_r1.cubeList.add(new ModelBox(Grip23_r1, 90, 74, 0.0F, -35.2F, -4.4F, 4, 2, 1, 0.0F, false));

        Grip22_r1 = new ModelRenderer(this);
        Grip22_r1.setRotationPoint(0.0F, -0.2746F, -7.0131F);
        gun.addChild(Grip22_r1);
        setRotationAngle(Grip22_r1, -0.2094F, 0.0F, 0.0F);
        Grip22_r1.cubeList.add(new ModelBox(Grip22_r1, 100, 79, 0.0F, -33.5F, -2.2F, 4, 2, 1, 0.0F, false));

        Grip21_r1 = new ModelRenderer(this);
        Grip21_r1.setRotationPoint(0.0F, -0.4487F, -6.4693F);
        gun.addChild(Grip21_r1);
        setRotationAngle(Grip21_r1, -0.2094F, 0.0F, 0.0F);
        Grip21_r1.cubeList.add(new ModelBox(Grip21_r1, 104, 58, 0.0F, -31.0F, -1.1F, 4, 2, 1, 0.0F, false));

        Grip20_r1 = new ModelRenderer(this);
        Grip20_r1.setRotationPoint(0.0F, -16.0409F, 24.9686F);
        gun.addChild(Grip20_r1);
        setRotationAngle(Grip20_r1, 0.9774F, 0.0F, 0.0F);
        Grip20_r1.cubeList.add(new ModelBox(Grip20_r1, 69, 102, 0.0F, -31.5F, -2.6F, 4, 1, 1, 0.0F, false));

        Grip19_r1 = new ModelRenderer(this);
        Grip19_r1.setRotationPoint(0.0F, -14.027F, 23.3809F);
        gun.addChild(Grip19_r1);
        setRotationAngle(Grip19_r1, 0.9774F, 0.0F, 0.0F);
        Grip19_r1.cubeList.add(new ModelBox(Grip19_r1, 23, 108, 0.0F, -29.0F, -1.5F, 4, 1, 1, 0.0F, false));

        Grip18_r1 = new ModelRenderer(this);
        Grip18_r1.setRotationPoint(0.0F, -0.9452F, -7.3798F);
        gun.addChild(Grip18_r1);
        setRotationAngle(Grip18_r1, -0.2618F, 0.0F, 0.0F);
        Grip18_r1.cubeList.add(new ModelBox(Grip18_r1, 107, 0, 0.0F, -28.5F, -0.1F, 4, 2, 1, 0.0F, false));

        Grip17_r1 = new ModelRenderer(this);
        Grip17_r1.setRotationPoint(0.0F, -13.7696F, 22.6497F);
        gun.addChild(Grip17_r1);
        setRotationAngle(Grip17_r1, 1.0472F, 0.0F, 0.0F);
        Grip17_r1.cubeList.add(new ModelBox(Grip17_r1, 37, 109, 0.0F, -26.5F, -0.6F, 4, 1, 1, 0.0F, false));

        Grip15_r1 = new ModelRenderer(this);
        Grip15_r1.setRotationPoint(0.0F, -4.7561F, 17.75F);
        gun.addChild(Grip15_r1);
        setRotationAngle(Grip15_r1, 0.5236F, 0.0F, 0.0F);
        Grip15_r1.cubeList.add(new ModelBox(Grip15_r1, 8, 84, 3.0F, -35.5F, 0.0F, 1, 9, 2, 0.0F, false));
        Grip15_r1.cubeList.add(new ModelBox(Grip15_r1, 49, 84, 0.0F, -35.5F, 0.0F, 1, 9, 2, 0.0F, false));

        Grip14_r1 = new ModelRenderer(this);
        Grip14_r1.setRotationPoint(0.0F, -4.3153F, 14.3018F);
        gun.addChild(Grip14_r1);
        setRotationAngle(Grip14_r1, 0.4189F, 0.0F, 0.0F);
        Grip14_r1.cubeList.add(new ModelBox(Grip14_r1, 18, 35, 3.1F, -35.8F, -3.0F, 1, 10, 4, 0.0F, false));
        Grip14_r1.cubeList.add(new ModelBox(Grip14_r1, 46, 0, 0.0F, -35.8F, -3.0F, 1, 10, 4, 0.0F, false));

        Grip9_r1 = new ModelRenderer(this);
        Grip9_r1.setRotationPoint(0.0F, 0.6785F, 7.6462F);
        gun.addChild(Grip9_r1);
        setRotationAngle(Grip9_r1, 0.2618F, 0.0F, 0.0F);
        Grip9_r1.cubeList.add(new ModelBox(Grip9_r1, 37, 111, 0.5F, -28.7F, 6.4F, 3, 1, 1, 0.0F, false));

        Grip8_r1 = new ModelRenderer(this);
        Grip8_r1.setRotationPoint(0.0F, -4.1571F, 18.7144F);
        gun.addChild(Grip8_r1);
        setRotationAngle(Grip8_r1, 0.5236F, 0.0F, 0.0F);
        Grip8_r1.cubeList.add(new ModelBox(Grip8_r1, 0, 84, 0.5F, -37.0F, 1.6F, 3, 10, 1, 0.0F, false));

        Grip3_r1 = new ModelRenderer(this);
        Grip3_r1.setRotationPoint(0.0F, -4.5071F, 18.6206F);
        gun.addChild(Grip3_r1);
        setRotationAngle(Grip3_r1, 0.5236F, 0.0F, 0.0F);
        Grip3_r1.cubeList.add(new ModelBox(Grip3_r1, 72, 35, 0.0F, -37.0F, 0.9F, 4, 10, 1, 0.0F, false));

        Grip2_r1 = new ModelRenderer(this);
        Grip2_r1.setRotationPoint(0.0F, -2.3343F, 10.9819F);
        gun.addChild(Grip2_r1);
        setRotationAngle(Grip2_r1, 0.4189F, 0.0F, 0.0F);
        Grip2_r1.cubeList.add(new ModelBox(Grip2_r1, 0, 53, 0.0F, -36.0F, 0.0F, 4, 10, 1, 0.0F, false));

        Grip1_r1 = new ModelRenderer(this);
        Grip1_r1.setRotationPoint(0.0F, -0.8178F, 6.2117F);
        gun.addChild(Grip1_r1);
        setRotationAngle(Grip1_r1, 0.2618F, 0.0F, 0.0F);
        Grip1_r1.cubeList.add(new ModelBox(Grip1_r1, 60, 59, 0.0F, -27.0F, 0.0F, 4, 1, 7, 0.0F, false));

        Grip32_r1 = new ModelRenderer(this);
        Grip32_r1.setRotationPoint(0.0F, -0.9083F, -30.1927F);
        gun.addChild(Grip32_r1);
        setRotationAngle(Grip32_r1, -0.7854F, 0.0F, 0.0F);
        Grip32_r1.cubeList.add(new ModelBox(Grip32_r1, 65, 14, 0.0F, -36.9F, -14.0F, 4, 1, 2, 0.0F, false));

        Trigger3_r1 = new ModelRenderer(this);
        Trigger3_r1.setRotationPoint(0.0F, 0.5726F, -16.106F);
        gun.addChild(Trigger3_r1);
        setRotationAngle(Trigger3_r1, -0.4189F, 0.0F, 0.0F);
        Trigger3_r1.cubeList.add(new ModelBox(Trigger3_r1, 76, 50, 1.5F, -37.6F, -9.4F, 1, 1, 1, 0.0F, false));

        Trigger1_r1 = new ModelRenderer(this);
        Trigger1_r1.setRotationPoint(0.0F, -18.6939F, 24.7311F);
        gun.addChild(Trigger1_r1);
        setRotationAngle(Trigger1_r1, 0.7854F, 0.0F, 0.0F);
        Trigger1_r1.cubeList.add(new ModelBox(Trigger1_r1, 76, 52, 1.5F, -39.2F, -10.2F, 1, 1, 1, 0.0F, false));

        Trigger4_r1 = new ModelRenderer(this);
        Trigger4_r1.setRotationPoint(0.0F, -4.0488F, -28.9747F);
        gun.addChild(Trigger4_r1);
        setRotationAngle(Trigger4_r1, -0.7854F, 0.0F, 0.0F);
        Trigger4_r1.cubeList.add(new ModelBox(Trigger4_r1, 37, 76, 1.5F, -37.0F, -9.6F, 1, 1, 1, 0.0F, false));

        Shape195_r1 = new ModelRenderer(this);
        Shape195_r1.setRotationPoint(-30.2006F, -13.0894F, 0.0F);
        gun.addChild(Shape195_r1);
        setRotationAngle(Shape195_r1, 0.0F, 0.0F, 0.7854F);
        Shape195_r1.cubeList.add(new ModelBox(Shape195_r1, 30, 32, 0.7F, -43.0F, -44.0F, 1, 1, 1, 0.0F, false));

        Shape194_r1 = new ModelRenderer(this);
        Shape194_r1.setRotationPoint(-29.439F, -14.9279F, 0.0F);
        gun.addChild(Shape194_r1);
        setRotationAngle(Shape194_r1, 0.0F, 0.0F, 0.7854F);
        Shape194_r1.cubeList.add(new ModelBox(Shape194_r1, 48, 35, 3.3F, -43.0F, -44.0F, 1, 1, 1, 0.0F, false));

        Shape193_r1 = new ModelRenderer(this);
        Shape193_r1.setRotationPoint(0.0F, -44.6971F, 17.1082F);
        gun.addChild(Shape193_r1);
        setRotationAngle(Shape193_r1, 0.7854F, 0.0F, 0.0F);
        Shape193_r1.cubeList.add(new ModelBox(Shape193_r1, 12, 49, 1.5F, -43.0F, -45.4F, 1, 1, 1, 0.0F, false));

        Shape192_r1 = new ModelRenderer(this);
        Shape192_r1.setRotationPoint(0.0F, -46.1113F, 16.5225F);
        gun.addChild(Shape192_r1);
        setRotationAngle(Shape192_r1, 0.7854F, 0.0F, 0.0F);
        Shape192_r1.cubeList.add(new ModelBox(Shape192_r1, 21, 53, 1.5F, -43.0F, -47.4F, 1, 1, 1, 0.0F, false));

        Shape191_r1 = new ModelRenderer(this);
        Shape191_r1.setRotationPoint(0.0F, 19.6367F, -45.9929F);
        gun.addChild(Shape191_r1);
        setRotationAngle(Shape191_r1, -0.7854F, 0.0F, 0.0F);
        Shape191_r1.cubeList.add(new ModelBox(Shape191_r1, 56, 15, 1.5F, -45.7F, -46.7F, 1, 1, 1, 0.0F, false));

        Shape190_r1 = new ModelRenderer(this);
        Shape190_r1.setRotationPoint(0.0F, 18.2225F, -45.4071F);
        gun.addChild(Shape190_r1);
        setRotationAngle(Shape190_r1, -0.7854F, 0.0F, 0.0F);
        Shape190_r1.cubeList.add(new ModelBox(Shape190_r1, 56, 27, 1.5F, -45.7F, -44.7F, 1, 1, 1, 0.0F, false));

        Shape181_r1 = new ModelRenderer(this);
        Shape181_r1.setRotationPoint(33.6675F, -15.5195F, 0.0F);
        gun.addChild(Shape181_r1);
        setRotationAngle(Shape181_r1, 0.0F, 0.0F, -0.7854F);
        Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 58, 9, -1.9F, -47.4F, -64.7F, 1, 1, 1, 0.0F, false));
        Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 58, 11, -1.9F, -47.4F, -61.2F, 1, 1, 1, 0.0F, false));
        Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 54, 59, -1.9F, -47.4F, -57.7F, 1, 1, 1, 0.0F, false));
        Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 29, 65, -1.9F, -47.4F, -54.2F, 1, 1, 1, 0.0F, false));
        Shape181_r1.cubeList.add(new ModelBox(Shape181_r1, 46, 18, -1.9F, -48.4F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape178_r1 = new ModelRenderer(this);
        Shape178_r1.setRotationPoint(-38.3959F, -15.9041F, 0.0F);
        gun.addChild(Shape178_r1);
        setRotationAngle(Shape178_r1, 0.0F, 0.0F, 0.7854F);
        Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 10, 60, 0.0F, -53.3F, -64.7F, 1, 1, 1, 0.0F, false));
        Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 10, 62, 0.0F, -53.3F, -61.2F, 1, 1, 1, 0.0F, false));
        Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 17, 63, 0.0F, -53.3F, -57.7F, 1, 1, 1, 0.0F, false));
        Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 31, 68, 0.0F, -53.3F, -54.2F, 1, 1, 1, 0.0F, false));
        Shape178_r1.cubeList.add(new ModelBox(Shape178_r1, 196, 197, 0.0F, -54.3F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape173_r1 = new ModelRenderer(this);
        Shape173_r1.setRotationPoint(-32.4959F, -18.348F, 0.0F);
        gun.addChild(Shape173_r1);
        setRotationAngle(Shape173_r1, 0.0F, 0.0F, 0.7854F);
        Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 63, 21, 4.9F, -47.4F, -64.7F, 1, 1, 1, 0.0F, false));
        Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 63, 26, 4.9F, -47.4F, -61.2F, 1, 1, 1, 0.0F, false));
        Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 63, 28, 4.9F, -47.4F, -57.7F, 1, 1, 1, 0.0F, false));
        Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 68, 68, 4.9F, -47.4F, -54.2F, 1, 1, 1, 0.0F, false));
        Shape173_r1.cubeList.add(new ModelBox(Shape173_r1, 0, 103, 4.9F, -48.4F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape170_r1 = new ModelRenderer(this);
        Shape170_r1.setRotationPoint(-37.2243F, -18.7325F, 0.0F);
        gun.addChild(Shape170_r1);
        setRotationAngle(Shape170_r1, 0.0F, 0.0F, 0.7854F);
        Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 29, 63, 5.0F, -54.3F, -61.2F, 1, 1, 1, 0.0F, false));
        Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 11, 64, 5.0F, -54.3F, -64.7F, 1, 1, 1, 0.0F, false));
        Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 65, 0, 5.0F, -54.3F, -57.7F, 1, 1, 1, 0.0F, false));
        Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 65, 2, 5.0F, -54.3F, -68.2F, 1, 1, 1, 0.0F, false));
        Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 75, 14, 5.0F, -54.3F, -54.2F, 1, 1, 1, 0.0F, false));
        Shape170_r1.cubeList.add(new ModelBox(Shape170_r1, 143, 199, 4.0F, -54.3F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape166_r1 = new ModelRenderer(this);
        Shape166_r1.setRotationPoint(-32.8805F, -13.6195F, 0.0F);
        gun.addChild(Shape166_r1);
        setRotationAngle(Shape166_r1, 0.0F, 0.0F, 0.7854F);
        Shape166_r1.cubeList.add(new ModelBox(Shape166_r1, 65, 7, -2.0F, -47.5F, -68.2F, 1, 1, 1, 0.0F, false));
        Shape166_r1.cubeList.add(new ModelBox(Shape166_r1, 45, 150, -1.0F, -47.5F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape165_r1 = new ModelRenderer(this);
        Shape165_r1.setRotationPoint(34.052F, -10.7911F, 0.0F);
        gun.addChild(Shape165_r1);
        setRotationAngle(Shape165_r1, 0.0F, 0.0F, -0.7854F);
        Shape165_r1.cubeList.add(new ModelBox(Shape165_r1, 65, 9, 5.0F, -47.5F, -68.2F, 1, 1, 1, 0.0F, false));
        Shape165_r1.cubeList.add(new ModelBox(Shape165_r1, 107, 198, 4.0F, -47.5F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape164_r1 = new ModelRenderer(this);
        Shape164_r1.setRotationPoint(38.3959F, -15.9041F, 0.0F);
        gun.addChild(Shape164_r1);
        setRotationAngle(Shape164_r1, 0.0F, 0.0F, -0.7854F);
        Shape164_r1.cubeList.add(new ModelBox(Shape164_r1, 17, 65, -2.0F, -54.3F, -68.2F, 1, 1, 1, 0.0F, false));

        Shape158_r1 = new ModelRenderer(this);
        Shape158_r1.setRotationPoint(-37.6089F, -14.0041F, 0.0F);
        gun.addChild(Shape158_r1);
        setRotationAngle(Shape158_r1, 0.0F, 0.0F, 0.7854F);
        Shape158_r1.cubeList.add(new ModelBox(Shape158_r1, 0, 53, -1.9F, -53.4F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape156_r1 = new ModelRenderer(this);
        Shape156_r1.setRotationPoint(38.7805F, -11.1757F, 0.0F);
        gun.addChild(Shape156_r1);
        setRotationAngle(Shape156_r1, 0.0F, 0.0F, -0.7854F);
        Shape156_r1.cubeList.add(new ModelBox(Shape156_r1, 132, 137, 4.9F, -53.4F, -68.2F, 1, 1, 15, 0.0F, false));

        Shape147_r1 = new ModelRenderer(this);
        Shape147_r1.setRotationPoint(0.0F, 30.0141F, -67.4346F);
        gun.addChild(Shape147_r1);
        setRotationAngle(Shape147_r1, -0.8727F, 0.0F, 0.0F);
        Shape147_r1.cubeList.add(new ModelBox(Shape147_r1, 90, 65, 0.5F, -57.3F, -65.9F, 3, 3, 1, 0.0F, false));

        Shape126_r1 = new ModelRenderer(this);
        Shape126_r1.setRotationPoint(34.6834F, -11.4668F, 0.0F);
        gun.addChild(Shape126_r1);
        setRotationAngle(Shape126_r1, 0.0F, 0.0F, -0.7854F);
        Shape126_r1.cubeList.add(new ModelBox(Shape126_r1, 84, 19, 4.2F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));
        Shape126_r1.cubeList.add(new ModelBox(Shape126_r1, 168, 0, 3.5F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));

        Shape125_r1 = new ModelRenderer(this);
        Shape125_r1.setRotationPoint(-33.5118F, -14.2953F, 0.0F);
        gun.addChild(Shape125_r1);
        setRotationAngle(Shape125_r1, 0.0F, 0.0F, 0.7854F);
        Shape125_r1.cubeList.add(new ModelBox(Shape125_r1, 84, 101, -1.2F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));
        Shape125_r1.cubeList.add(new ModelBox(Shape125_r1, 168, 13, -0.5F, -48.6F, -53.7F, 1, 1, 12, 0.0F, false));

        Shape124_r1 = new ModelRenderer(this);
        Shape124_r1.setRotationPoint(-36.4515F, -17.9982F, 0.0F);
        gun.addChild(Shape124_r1);
        setRotationAngle(Shape124_r1, 0.0F, 0.0F, 0.7854F);
        Shape124_r1.cubeList.add(new ModelBox(Shape124_r1, 140, 62, 4.2F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));
        Shape124_r1.cubeList.add(new ModelBox(Shape124_r1, 168, 43, 3.5F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));

        Shape123_r1 = new ModelRenderer(this);
        Shape123_r1.setRotationPoint(37.6231F, -15.1698F, 0.0F);
        gun.addChild(Shape123_r1);
        setRotationAngle(Shape123_r1, 0.0F, 0.0F, -0.7854F);
        Shape123_r1.cubeList.add(new ModelBox(Shape123_r1, 0, 153, -1.2F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));
        Shape123_r1.cubeList.add(new ModelBox(Shape123_r1, 168, 30, -0.5F, -53.0F, -53.7F, 1, 1, 12, 0.0F, false));

        Shape105_r1 = new ModelRenderer(this);
        Shape105_r1.setRotationPoint(0.0F, -15.3223F, -45.4339F);
        gun.addChild(Shape105_r1);
        setRotationAngle(Shape105_r1, -0.9599F, 0.0F, 0.0F);
        Shape105_r1.cubeList.add(new ModelBox(Shape105_r1, 51, 35, 4.8F, -51.3F, -10.0F, 1, 10, 2, 0.0F, false));

        Shape104_r1 = new ModelRenderer(this);
        Shape104_r1.setRotationPoint(0.0F, 4.5467F, -14.2641F);
        gun.addChild(Shape104_r1);
        setRotationAngle(Shape104_r1, -0.2618F, 0.0F, 0.0F);
        Shape104_r1.cubeList.add(new ModelBox(Shape104_r1, 75, 59, 4.8F, -51.9F, -24.4F, 1, 5, 2, 0.0F, false));

        Shape102_r1 = new ModelRenderer(this);
        Shape102_r1.setRotationPoint(0.0F, -11.0655F, 12.0507F);
        gun.addChild(Shape102_r1);
        setRotationAngle(Shape102_r1, 0.2618F, 0.0F, 0.0F);
        Shape102_r1.cubeList.add(new ModelBox(Shape102_r1, 17, 53, 4.8F, -51.3F, -36.0F, 1, 6, 2, 0.0F, false));

        Shape100_r1 = new ModelRenderer(this);
        Shape100_r1.setRotationPoint(32.6086F, -8.5788F, 0.0F);
        gun.addChild(Shape100_r1);
        setRotationAngle(Shape100_r1, 0.0F, 0.0F, -0.6109F);
        Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 37, 59, 2.7F, -53.0F, -22.0F, 1, 1, 10, 0.0F, false));
        Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 17, 84, 2.7F, -55.0F, -12.0F, 1, 3, 4, 0.0F, false));
        Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 49, 59, 2.7F, -53.0F, -34.0F, 1, 1, 9, 0.0F, false));
        Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 27, 53, 2.7F, -55.0F, -25.0F, 1, 3, 3, 0.0F, false));
        Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 84, 170, 2.7F, -56.0F, -34.0F, 1, 1, 26, 0.0F, false));
        Shape100_r1.cubeList.add(new ModelBox(Shape100_r1, 18, 20, 2.7F, -56.0F, -36.0F, 1, 4, 2, 0.0F, false));

        Shape73_r1 = new ModelRenderer(this);
        Shape73_r1.setRotationPoint(0.0F, -4.0515F, -44.4999F);
        gun.addChild(Shape73_r1);
        setRotationAngle(Shape73_r1, -0.8378F, 0.0F, 0.0F);
        Shape73_r1.cubeList.add(new ModelBox(Shape73_r1, 46, 0, -0.7F, -52.0F, -17.7F, 1, 3, 1, 0.0F, false));

        Shape64_r1 = new ModelRenderer(this);
        Shape64_r1.setRotationPoint(0.0F, -2.2836F, -36.9132F);
        gun.addChild(Shape64_r1);
        setRotationAngle(Shape64_r1, -0.7854F, 0.0F, 0.0F);
        Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 12, 43, 4.1F, -45.7F, -15.7F, 1, 2, 1, 0.0F, false));
        Shape64_r1.cubeList.add(new ModelBox(Shape64_r1, 56, 24, -1.1F, -45.7F, -15.7F, 1, 2, 1, 0.0F, false));

        Shape61_r1 = new ModelRenderer(this);
        Shape61_r1.setRotationPoint(0.0F, -14.3243F, 19.259F);
        gun.addChild(Shape61_r1);
        setRotationAngle(Shape61_r1, 0.5236F, 0.0F, 0.0F);
        Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 10, 53, 4.1F, -43.1F, -17.1F, 1, 3, 1, 0.0F, false));
        Shape61_r1.cubeList.add(new ModelBox(Shape61_r1, 53, 50, -1.1F, -43.1F, -17.1F, 1, 3, 1, 0.0F, false));

        Shape53_r1 = new ModelRenderer(this);
        Shape53_r1.setRotationPoint(0.0F, -41.7976F, 24.1082F);
        gun.addChild(Shape53_r1);
        setRotationAngle(Shape53_r1, 0.7854F, 0.0F, 0.0F);
        Shape53_r1.cubeList.add(new ModelBox(Shape53_r1, 0, 76, -1.1F, -50.0F, -38.4F, 1, 1, 1, 0.0F, false));

        Shape52_r1 = new ModelRenderer(this);
        Shape52_r1.setRotationPoint(0.0F, -2.9775F, -44.0876F);
        gun.addChild(Shape52_r1);
        setRotationAngle(Shape52_r1, -0.8378F, 0.0F, 0.0F);
        Shape52_r1.cubeList.add(new ModelBox(Shape52_r1, 56, 18, -1.1F, -51.0F, -18.7F, 1, 2, 1, 0.0F, false));

        Shape51_r1 = new ModelRenderer(this);
        Shape51_r1.setRotationPoint(0.0F, -3.5185F, -21.9532F);
        gun.addChild(Shape51_r1);
        setRotationAngle(Shape51_r1, -0.4189F, 0.0F, 0.0F);
        Shape51_r1.cubeList.add(new ModelBox(Shape51_r1, 56, 21, -0.7F, -53.4F, -2.7F, 1, 2, 1, 0.0F, false));

        Shape49_r1 = new ModelRenderer(this);
        Shape49_r1.setRotationPoint(-29.4731F, -9.5005F, 0.0F);
        gun.addChild(Shape49_r1);
        setRotationAngle(Shape49_r1, 0.0F, 0.0F, 0.576F);
        Shape49_r1.cubeList.add(new ModelBox(Shape49_r1, 0, 35, 0.3F, -54.5F, -2.7F, 1, 2, 16, 0.0F, false));

        Shape47_r1 = new ModelRenderer(this);
        Shape47_r1.setRotationPoint(30.1184F, -7.3219F, 0.0F);
        gun.addChild(Shape47_r1);
        setRotationAngle(Shape47_r1, 0.0F, 0.0F, -0.576F);
        Shape47_r1.cubeList.add(new ModelBox(Shape47_r1, 115, 226, 2.7F, -54.5F, -37.7F, 1, 2, 51, 0.0F, false));

        Shape44_r1 = new ModelRenderer(this);
        Shape44_r1.setRotationPoint(31.9595F, -8.4373F, 0.0F);
        gun.addChild(Shape44_r1);
        setRotationAngle(Shape44_r1, 0.0F, 0.0F, -0.6109F);
        Shape44_r1.cubeList.add(new ModelBox(Shape44_r1, 84, 19, 2.6F, -54.9F, -41.7F, 1, 3, 4, 0.0F, false));

        Shape43_r1 = new ModelRenderer(this);
        Shape43_r1.setRotationPoint(-31.2362F, -10.7316F, 0.0F);
        gun.addChild(Shape43_r1);
        setRotationAngle(Shape43_r1, 0.0F, 0.0F, 0.6109F);
        Shape43_r1.cubeList.add(new ModelBox(Shape43_r1, 84, 37, 0.4F, -54.9F, -41.7F, 1, 3, 4, 0.0F, false));

        Shape32_r1 = new ModelRenderer(this);
        Shape32_r1.setRotationPoint(0.0F, -16.9324F, 19.7928F);
        gun.addChild(Shape32_r1);
        setRotationAngle(Shape32_r1, 0.5236F, 0.0F, 0.0F);
        Shape32_r1.cubeList.add(new ModelBox(Shape32_r1, 49, 59, -1.1F, -45.4F, -21.7F, 1, 6, 3, 0.0F, false));
        Shape32_r1.cubeList.add(new ModelBox(Shape32_r1, 27, 84, 4.1F, -45.4F, -21.7F, 1, 6, 3, 0.0F, false));

        Shape14_r1 = new ModelRenderer(this);
        Shape14_r1.setRotationPoint(0.0F, 5.9816F, -7.3965F);
        gun.addChild(Shape14_r1);
        setRotationAngle(Shape14_r1, -0.1571F, 0.0F, 0.0F);
        Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 30, 168, -0.7F, -47.0F, -41.7F, 1, 3, 24, 0.0F, false));
        Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 196, 170, 3.7F, -47.0F, -41.7F, 1, 3, 24, 0.0F, false));
        Shape14_r1.cubeList.add(new ModelBox(Shape14_r1, 99, 251, -0.5F, -45.0F, -41.7F, 5, 1, 24, 0.0F, false));

        Shape28_r1 = new ModelRenderer(this);
        Shape28_r1.setRotationPoint(0.0F, -3.3988F, 6.186F);
        gun.addChild(Shape28_r1);
        setRotationAngle(Shape28_r1, 0.1571F, 0.0F, 0.0F);
        Shape28_r1.cubeList.add(new ModelBox(Shape28_r1, 28, 20, 1.0F, -41.0F, -18.5F, 2, 4, 1, 0.0F, false));

        barrel = new ModelRenderer(this);
        barrel.setRotationPoint(0.0F, 24.0F, 0.0F);
        barrel.cubeList.add(new ModelBox(barrel, 0, 168, 0.1F, -50.7F, -123.0F, 1, 1, 82, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 168, 0, 1.5F, -49.3F, -123.0F, 1, 1, 82, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 168, 83, 2.9F, -50.7F, -123.0F, 1, 1, 82, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 168, 166, 1.5F, -52.1F, -123.0F, 1, 1, 82, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 100, 91, 1.9F, -54.5F, -107.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 101, 0, 1.1F, -54.1F, -107.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 101, 5, 1.1F, -54.5F, -107.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 28, 39, 1.7F, -53.9F, -105.0F, 1, 1, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 10, 46, 1.3F, -53.9F, -105.0F, 1, 1, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 101, 10, 1.7F, -54.7F, -107.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 84, 101, 1.3F, -54.7F, -107.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 169, 249, 1.3F, -54.3F, -103.0F, 1, 1, 50, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 221, 250, 1.7F, -54.3F, -103.0F, 1, 1, 50, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 0, 251, 1.5F, -54.1F, -103.0F, 1, 1, 50, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 252, 0, 1.5F, -54.5F, -103.0F, 1, 1, 50, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 100, 86, 1.9F, -54.1F, -107.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 90, 77, 0.0F, -50.4F, -109.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 23, 93, 3.0F, -50.4F, -109.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 94, 65, 0.0F, -51.0F, -109.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 96, 74, 3.0F, -51.0F, -109.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 84, 86, 1.1F, -49.3F, -109.0F, 1, 2, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 17, 91, 1.9F, -49.3F, -109.0F, 1, 2, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 98, 58, 1.1F, -52.1F, -109.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 45, 99, 1.9F, -52.1F, -109.0F, 1, 1, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 56, 76, 1.0F, -47.7F, -127.5F, 2, 2, 4, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 67, 71, 1.0F, -53.0F, -128.0F, 2, 2, 5, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 65, 7, -0.8F, -51.2F, -128.0F, 2, 2, 5, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 65, 0, 2.8F, -51.2F, -128.0F, 2, 2, 5, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 63, 26, 1.0F, -49.4F, -128.0F, 2, 2, 5, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 63, 18, 1.0F, -53.2F, -136.0F, 2, 2, 6, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 72, 67, 0.5F, -53.2F, -130.0F, 3, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 18, 20, 1.0F, -49.2F, -136.0F, 2, 2, 6, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 72, 46, 0.5F, -49.2F, -130.0F, 3, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 84, 106, 3.1F, -51.8F, -130.0F, 2, 3, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 106, 61, -1.1F, -51.8F, -130.0F, 2, 3, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 27, 103, -1.1F, -51.6F, -138.0F, 2, 3, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 30, 44, -1.1F, -51.6F, -134.0F, 1, 3, 1, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 91, 0, 3.1F, -51.8F, -138.0F, 2, 3, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 12, 39, 4.1F, -51.8F, -134.0F, 1, 3, 1, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 52, 0, 0.5F, -53.2F, -138.0F, 3, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 24, 35, 0.5F, -49.2F, -138.0F, 3, 2, 2, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 110, 79, 0.5F, -53.2F, -134.0F, 3, 1, 1, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 74, 110, 0.5F, -48.2F, -134.0F, 3, 1, 1, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 18, 14, 0.0F, -48.6F, -134.0F, 4, 1, 1, 0.0F, false));
        barrel.cubeList.add(new ModelBox(barrel, 25, 110, 0.5F, -53.0F, -134.0F, 3, 1, 1, 0.0F, false));

        Muzzle25_r1 = new ModelRenderer(this);
        Muzzle25_r1.setRotationPoint(-32.934F, -13.8902F, 0.0F);
        barrel.addChild(Muzzle25_r1);
        setRotationAngle(Muzzle25_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle25_r1.cubeList.add(new ModelBox(Muzzle25_r1, 28, 42, -2.0F, -48.1F, -134.0F, 2, 1, 1, 0.0F, false));
        Muzzle25_r1.cubeList.add(new ModelBox(Muzzle25_r1, 65, 97, -2.2F, -49.2F, -130.0F, 2, 2, 2, 0.0F, false));

        Muzzle27_r1 = new ModelRenderer(this);
        Muzzle27_r1.setRotationPoint(34.4006F, -11.3497F, 0.0F);
        barrel.addChild(Muzzle27_r1);
        setRotationAngle(Muzzle27_r1, 0.0F, 0.0F, -0.7854F);
        Muzzle27_r1.cubeList.add(new ModelBox(Muzzle27_r1, 18, 49, 3.5F, -48.2F, -134.0F, 2, 1, 1, 0.0F, false));
        Muzzle27_r1.cubeList.add(new ModelBox(Muzzle27_r1, 107, 10, 3.5F, -49.2F, -138.0F, 2, 2, 2, 0.0F, false));
        Muzzle27_r1.cubeList.add(new ModelBox(Muzzle27_r1, 0, 108, 3.5F, -49.2F, -130.0F, 2, 2, 2, 0.0F, false));

        Muzzle31_r1 = new ModelRenderer(this);
        Muzzle31_r1.setRotationPoint(-37.4716F, -15.9355F, 0.0F);
        barrel.addChild(Muzzle31_r1);
        setRotationAngle(Muzzle31_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle31_r1.cubeList.add(new ModelBox(Muzzle31_r1, 49, 95, 0.5F, -53.2F, -138.0F, 2, 2, 2, 0.0F, false));
        Muzzle31_r1.cubeList.add(new ModelBox(Muzzle31_r1, 29, 28, 0.5F, -53.2F, -134.0F, 1, 2, 1, 0.0F, false));

        Muzzle15_r1 = new ModelRenderer(this);
        Muzzle15_r1.setRotationPoint(33.5393F, -13.2699F, 0.0F);
        barrel.addChild(Muzzle15_r1);
        setRotationAngle(Muzzle15_r1, 0.0F, 0.0F, -0.711F);
        Muzzle15_r1.cubeList.add(new ModelBox(Muzzle15_r1, 98, 106, -1.1F, -51.8F, -130.0F, 2, 2, 2, 0.0F, false));

        Muzzle29_r1 = new ModelRenderer(this);
        Muzzle29_r1.setRotationPoint(-35.259F, -16.5908F, 0.0F);
        barrel.addChild(Muzzle29_r1);
        setRotationAngle(Muzzle29_r1, 0.0F, 0.0F, 0.7482F);
        Muzzle29_r1.cubeList.add(new ModelBox(Muzzle29_r1, 56, 7, 3.5F, -53.2F, -134.0F, 2, 1, 1, 0.0F, false));
        Muzzle29_r1.cubeList.add(new ModelBox(Muzzle29_r1, 107, 5, 3.5F, -53.2F, -138.0F, 2, 2, 2, 0.0F, false));
        Muzzle29_r1.cubeList.add(new ModelBox(Muzzle29_r1, 17, 108, 3.5F, -53.2F, -130.0F, 2, 2, 2, 0.0F, false));

        Muzzle33_r1 = new ModelRenderer(this);
        Muzzle33_r1.setRotationPoint(-32.8462F, -14.1024F, 0.0F);
        barrel.addChild(Muzzle33_r1);
        setRotationAngle(Muzzle33_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle33_r1.cubeList.add(new ModelBox(Muzzle33_r1, 104, 108, -1.9F, -47.9F, -138.0F, 2, 1, 2, 0.0F, false));

        Muzzle4_r1 = new ModelRenderer(this);
        Muzzle4_r1.setRotationPoint(34.9955F, -11.5133F, 0.0F);
        barrel.addChild(Muzzle4_r1);
        setRotationAngle(Muzzle4_r1, 0.0F, 0.0F, -0.7854F);
        Muzzle4_r1.cubeList.add(new ModelBox(Muzzle4_r1, 23, 44, 4.3F, -49.0F, -128.0F, 1, 1, 5, 0.0F, false));

        Muzzle12_r1 = new ModelRenderer(this);
        Muzzle12_r1.setRotationPoint(-33.824F, -14.3417F, 0.0F);
        barrel.addChild(Muzzle12_r1);
        setRotationAngle(Muzzle12_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle12_r1.cubeList.add(new ModelBox(Muzzle12_r1, 46, 50, -1.3F, -49.0F, -128.0F, 1, 1, 5, 0.0F, false));

        Muzzle13_r1 = new ModelRenderer(this);
        Muzzle13_r1.setRotationPoint(-33.224F, -14.5902F, 0.0F);
        barrel.addChild(Muzzle13_r1);
        setRotationAngle(Muzzle13_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle13_r1.cubeList.add(new ModelBox(Muzzle13_r1, 67, 50, -1.0F, -48.4F, -128.0F, 2, 1, 5, 0.0F, false));

        Muzzle3_r1 = new ModelRenderer(this);
        Muzzle3_r1.setRotationPoint(34.3955F, -11.7618F, 0.0F);
        barrel.addChild(Muzzle3_r1);
        setRotationAngle(Muzzle3_r1, 0.0F, 0.0F, -0.7854F);
        Muzzle3_r1.cubeList.add(new ModelBox(Muzzle3_r1, 0, 76, 3.0F, -48.4F, -128.0F, 2, 1, 5, 0.0F, false));

        Muzzle10_r1 = new ModelRenderer(this);
        Muzzle10_r1.setRotationPoint(37.1696F, -15.0648F, 0.0F);
        barrel.addChild(Muzzle10_r1);
        setRotationAngle(Muzzle10_r1, 0.0F, 0.0F, -0.7854F);
        Muzzle10_r1.cubeList.add(new ModelBox(Muzzle10_r1, 51, 9, -1.3F, -52.4F, -128.0F, 1, 1, 5, 0.0F, false));

        Muzzle9_r1 = new ModelRenderer(this);
        Muzzle9_r1.setRotationPoint(37.7696F, -14.8162F, 0.0F);
        barrel.addChild(Muzzle9_r1);
        setRotationAngle(Muzzle9_r1, 0.0F, 0.0F, -0.7854F);
        Muzzle9_r1.cubeList.add(new ModelBox(Muzzle9_r1, 14, 76, -1.0F, -53.0F, -128.0F, 2, 1, 5, 0.0F, false));

        Muzzle6_r1 = new ModelRenderer(this);
        Muzzle6_r1.setRotationPoint(-35.998F, -17.8932F, 0.0F);
        barrel.addChild(Muzzle6_r1);
        setRotationAngle(Muzzle6_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle6_r1.cubeList.add(new ModelBox(Muzzle6_r1, 84, 0, 4.3F, -52.4F, -128.0F, 1, 1, 5, 0.0F, false));

        Muzzle7_r1 = new ModelRenderer(this);
        Muzzle7_r1.setRotationPoint(-36.598F, -17.6447F, 0.0F);
        barrel.addChild(Muzzle7_r1);
        setRotationAngle(Muzzle7_r1, 0.0F, 0.0F, 0.7854F);
        Muzzle7_r1.cubeList.add(new ModelBox(Muzzle7_r1, 28, 76, 3.0F, -53.0F, -128.0F, 2, 1, 5, 0.0F, false));

        Barrel22_r1 = new ModelRenderer(this);
        Barrel22_r1.setRotationPoint(-35.9909F, -17.3103F, 0.0F);
        barrel.addChild(Barrel22_r1);
        setRotationAngle(Barrel22_r1, 0.0F, 0.0F, 0.7854F);
        Barrel22_r1.cubeList.add(new ModelBox(Barrel22_r1, 98, 24, 2.9F, -52.1F, -109.0F, 1, 1, 4, 0.0F, false));

        Barrel21_r1 = new ModelRenderer(this);
        Barrel21_r1.setRotationPoint(37.1624F, -14.4819F, 0.0F);
        barrel.addChild(Barrel21_r1);
        setRotationAngle(Barrel21_r1, 0.0F, 0.0F, -0.7854F);
        Barrel21_r1.cubeList.add(new ModelBox(Barrel21_r1, 98, 19, 0.1F, -52.1F, -109.0F, 1, 1, 4, 0.0F, false));

        Barrel12_r1 = new ModelRenderer(this);
        Barrel12_r1.setRotationPoint(35.0026F, -12.0961F, 0.0F);
        barrel.addChild(Barrel12_r1);
        setRotationAngle(Barrel12_r1, 0.0F, 0.0F, -0.7854F);
        Barrel12_r1.cubeList.add(new ModelBox(Barrel12_r1, 69, 97, 2.9F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));
        Barrel12_r1.cubeList.add(new ModelBox(Barrel12_r1, 23, 76, 3.5F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));

        Barrel11_r1 = new ModelRenderer(this);
        Barrel11_r1.setRotationPoint(-33.8311F, -14.9246F, 0.0F);
        barrel.addChild(Barrel11_r1);
        setRotationAngle(Barrel11_r1, 0.0F, 0.0F, 0.7854F);
        Barrel11_r1.cubeList.add(new ModelBox(Barrel11_r1, 59, 97, 0.1F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));
        Barrel11_r1.cubeList.add(new ModelBox(Barrel11_r1, 9, 76, -0.5F, -49.3F, -109.0F, 1, 1, 4, 0.0F, false));

        Barrel20_r1 = new ModelRenderer(this);
        Barrel20_r1.setRotationPoint(-35.8909F, -17.3518F, 0.0F);
        barrel.addChild(Barrel20_r1);
        setRotationAngle(Barrel20_r1, 0.0F, 0.0F, 0.7854F);
        Barrel20_r1.cubeList.add(new ModelBox(Barrel20_r1, 84, 65, 3.4F, -51.9982F, -109.0F, 1, 1, 4, 0.0F, false));

        Barrel19_r1 = new ModelRenderer(this);
        Barrel19_r1.setRotationPoint(37.0624F, -14.5233F, 0.0F);
        barrel.addChild(Barrel19_r1);
        setRotationAngle(Barrel19_r1, 0.0F, 0.0F, -0.7854F);
        Barrel19_r1.cubeList.add(new ModelBox(Barrel19_r1, 84, 26, -0.4F, -52.0F, -109.0F, 1, 1, 4, 0.0F, false));

        Barrel25_r1 = new ModelRenderer(this);
        Barrel25_r1.setRotationPoint(0.0F, 54.3224F, -56.2364F);
        barrel.addChild(Barrel25_r1);
        setRotationAngle(Barrel25_r1, -0.6632F, 0.0F, 0.0F);
        Barrel25_r1.cubeList.add(new ModelBox(Barrel25_r1, 18, 35, 1.9F, -54.5F, -107.0F, 1, 3, 1, 0.0F, false));
        Barrel25_r1.cubeList.add(new ModelBox(Barrel25_r1, 12, 35, 1.1F, -54.5F, -107.0F, 1, 3, 1, 0.0F, false));

        Barrel2_r1 = new ModelRenderer(this);
        Barrel2_r1.setRotationPoint(37.5725F, -13.492F, 0.0F);
        barrel.addChild(Barrel2_r1);
        setRotationAngle(Barrel2_r1, 0.0F, 0.0F, -0.7854F);
        Barrel2_r1.cubeList.add(new ModelBox(Barrel2_r1, 84, 86, 1.5F, -52.1F, -123.0F, 1, 2, 82, 0.0F, false));

        Barrel4_r1 = new ModelRenderer(this);
        Barrel4_r1.setRotationPoint(-34.0009F, -17.3145F, 0.0F);
        barrel.addChild(Barrel4_r1);
        setRotationAngle(Barrel4_r1, 0.0F, 0.0F, 0.7854F);
        Barrel4_r1.cubeList.add(new ModelBox(Barrel4_r1, 84, 2, 2.9F, -49.7F, -123.0F, 1, 2, 82, 0.0F, false));

        Barrel6_r1 = new ModelRenderer(this);
        Barrel6_r1.setRotationPoint(35.1725F, -14.4861F, 0.0F);
        barrel.addChild(Barrel6_r1);
        setRotationAngle(Barrel6_r1, 0.0F, 0.0F, -0.7854F);
        Barrel6_r1.cubeList.add(new ModelBox(Barrel6_r1, 0, 84, 0.1F, -49.7F, -123.0F, 1, 2, 82, 0.0F, false));

        Barrel8_r1 = new ModelRenderer(this);
        Barrel8_r1.setRotationPoint(-36.4009F, -16.3204F, 0.0F);
        barrel.addChild(Barrel8_r1);
        setRotationAngle(Barrel8_r1, 0.0F, 0.0F, 0.7854F);
        Barrel8_r1.cubeList.add(new ModelBox(Barrel8_r1, 0, 0, 1.5F, -52.1F, -123.0F, 1, 2, 82, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        gun.render(f5);
        barrel.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
