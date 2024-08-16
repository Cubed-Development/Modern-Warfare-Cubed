package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

//
// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AR15FN15Handguard extends ModelWithAttachments {
    private final ModelRenderer handguard;
    private final ModelRenderer cube_r1;
    private final ModelRenderer cube_r2;
    private final ModelRenderer cube_r3;
    private final ModelRenderer cube_r4;
    private final ModelRenderer cube_r5;
    private final ModelRenderer cube_r6;
    private final ModelRenderer cube_r7;
    private final ModelRenderer cube_r8;
    private final ModelRenderer cube_r9;
    private final ModelRenderer cube_r10;

    public AR15FN15Handguard() {
        textureWidth = 300;
        textureHeight = 300;

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(-0.5F, -16.1F, -60.7F);
        handguard.cubeList.add(new ModelBox(handguard, 159, 7, -2.0F, 0.0F, -5.0F, 2, 1, 43, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 207, 12, -2.0F, 4.1F, -5.0F, 2, 1, 43, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 163, 5, 0.5F, 1.85F, 0.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 184, 43, 0.5F, 1.85F, -5.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 163, 12, 0.5F, 1.85F, 5.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 178, 27, 0.5F, 1.85F, 10.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 163, 29, 0.5F, 1.85F, 15.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 176, 9, 0.5F, 1.85F, 20.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 188, 6, 0.5F, 1.85F, 25.0F, 1, 2, 1, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 209, 5, 0.5F, 1.85F, 30.0F, 1, 2, 8, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 217, 69, 0.7F, 3.05F, -4.75F, 1, 1, 35, -0.2F, false));
        handguard.cubeList.add(new ModelBox(handguard, 177, 62, 0.7F, 1.65F, -4.75F, 1, 1, 35, -0.2F, false));
        handguard.cubeList.add(new ModelBox(handguard, 231, 20, 0.78F, 2.85F, 31.0F, 1, 1, 7, -0.002F, false));
        handguard.cubeList.add(new ModelBox(handguard, 231, 5, 0.58F, 3.15F, 31.0F, 1, 1, 7, -0.003F, false));
        handguard.cubeList.add(new ModelBox(handguard, 257, 6, -0.47F, 4.35F, 31.0F, 1, 1, 7, -0.003F, false));
        handguard.cubeList.add(new ModelBox(handguard, 261, 127, -1.17F, 5.05F, 31.0F, 1, 1, 7, -0.003F, false));
        handguard.cubeList.add(new ModelBox(handguard, 253, 152, -1.83F, 5.05F, 31.0F, 1, 1, 7, -0.004F, true));
        handguard.cubeList.add(new ModelBox(handguard, 231, 34, 0.78F, 2.05F, 31.0F, 1, 1, 7, -0.003F, false));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 0.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 5.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 10.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 15.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 20.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, 25.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 259, 111, -3.5F, 1.85F, 30.0F, 1, 2, 8, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 178, 103, -3.7F, 1.65F, -4.75F, 1, 1, 35, -0.2F, true));
        handguard.cubeList.add(new ModelBox(handguard, 218, 111, -3.7F, 3.05F, -4.75F, 1, 1, 35, -0.2F, true));
        handguard.cubeList.add(new ModelBox(handguard, 236, 65, -3.5F, 1.85F, -5.0F, 1, 2, 1, 0.001F, true));
        handguard.cubeList.add(new ModelBox(handguard, 258, 75, -3.78F, 2.85F, 31.0F, 1, 1, 7, -0.002F, true));
        handguard.cubeList.add(new ModelBox(handguard, 257, 62, -3.78F, 2.05F, 31.0F, 1, 1, 7, -0.003F, true));
        handguard.cubeList.add(new ModelBox(handguard, 183, 156, -3.58F, 3.15F, 31.0F, 1, 1, 7, -0.003F, true));
        handguard.cubeList.add(new ModelBox(handguard, 223, 121, -2.53F, 4.35F, 31.0F, 1, 1, 7, -0.003F, true));

        cube_r1 = new ModelRenderer(this);
        cube_r1.setRotationPoint(-3.5F, 3.85F, 2.25F);
        handguard.addChild(cube_r1);
        setRotationAngle(cube_r1, 0.0F, 0.0F, -0.925F);
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -6.6F, 1, 2, 1, -0.101F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -6.1F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -4.1F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, -2.0F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 4, 200, -0.2F, 1.2F, -6.45F, 1, 1, 34, -0.199F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 43, 194, -0.2F, -0.2F, -6.45F, 1, 1, 34, -0.199F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 283, 33, 0.0F, 0.0F, -7.25F, 1, 2, 1, 0.0F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 0.0F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 2.1F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 4.1F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 6.2F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 8.2F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 10.3F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 12.4F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 14.5F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 16.5F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 18.6F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 20.6F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 22.7F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 199, 112, -0.1F, -0.1F, 24.7F, 1, 2, 1, -0.1F, true));
        cube_r1.cubeList.add(new ModelBox(cube_r1, 278, 65, -0.1F, -0.1F, 26.8F, 1, 2, 2, -0.101F, true));

        cube_r2 = new ModelRenderer(this);
        cube_r2.setRotationPoint(-3.5F, 1.85F, -5.0F);
        handguard.addChild(cube_r2);
        setRotationAngle(cube_r2, 0.0F, 0.0F, 0.925F);
        cube_r2.cubeList.add(new ModelBox(cube_r2, 214, 150, -0.2F, -0.8F, 0.8F, 1, 1, 34, -0.199F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 172, 143, 0.0F, -2.5F, 1.0F, 1, 1, 34, 0.001F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 257, 30, 0.0F, -2.0F, 35.0F, 1, 2, 8, 0.0F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 34.05F, 1, 2, 2, -0.101F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 31.95F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 29.95F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 27.85F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 25.85F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 23.75F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 21.75F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 19.65F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 15.45F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 17.55F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 11.35F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 13.45F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 9.35F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 185, 114, -0.1F, -1.9F, 7.25F, 1, 2, 1, -0.1F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 285, 114, 0.0F, -2.0F, 5.0F, 1, 2, 1, 0.0F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 257, 89, 0.0F, -0.65F, 36.0F, 1, 1, 7, -0.001F, true));
        cube_r2.cubeList.add(new ModelBox(cube_r2, 259, 44, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, true));

        cube_r3 = new ModelRenderer(this);
        cube_r3.setRotationPoint(-2.53F, 5.35F, 31.0F);
        handguard.addChild(cube_r3);
        setRotationAngle(cube_r3, 0.0F, 0.0F, 0.7854F);
        cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 114, 0.0F, -1.0F, 0.0F, 1, 1, 7, -0.001F, true));

        cube_r4 = new ModelRenderer(this);
        cube_r4.setRotationPoint(-3.58F, 4.15F, 31.0F);
        handguard.addChild(cube_r4);
        setRotationAngle(cube_r4, 0.0F, 0.0F, -0.8552F);
        cube_r4.cubeList.add(new ModelBox(cube_r4, 219, 156, 0.0F, 0.0F, 0.0F, 1, 2, 7, -0.002F, true));

        cube_r5 = new ModelRenderer(this);
        cube_r5.setRotationPoint(-3.78F, 3.85F, 31.0F);
        handguard.addChild(cube_r5);
        setRotationAngle(cube_r5, 0.0F, -0.7854F, 0.0F);
        cube_r5.cubeList.add(new ModelBox(cube_r5, 243, 72, 0.0F, -1.0F, -1.0F, 1, 1, 1, -0.004F, true));
        cube_r5.cubeList.add(new ModelBox(cube_r5, 246, 63, 0.0F, -1.8F, -1.0F, 1, 1, 1, -0.003F, true));

        cube_r6 = new ModelRenderer(this);
        cube_r6.setRotationPoint(1.78F, 3.85F, 31.0F);
        handguard.addChild(cube_r6);
        setRotationAngle(cube_r6, 0.0F, 0.7854F, 0.0F);
        cube_r6.cubeList.add(new ModelBox(cube_r6, 212, 31, -1.0F, -1.0F, -1.0F, 1, 1, 1, -0.004F, false));
        cube_r6.cubeList.add(new ModelBox(cube_r6, 213, 45, -1.0F, -1.8F, -1.0F, 1, 1, 1, -0.003F, false));

        cube_r7 = new ModelRenderer(this);
        cube_r7.setRotationPoint(0.53F, 5.35F, 31.0F);
        handguard.addChild(cube_r7);
        setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
        cube_r7.cubeList.add(new ModelBox(cube_r7, 258, 17, -1.0F, -1.0F, 0.0F, 1, 1, 7, -0.001F, false));

        cube_r8 = new ModelRenderer(this);
        cube_r8.setRotationPoint(1.58F, 4.15F, 31.0F);
        handguard.addChild(cube_r8);
        setRotationAngle(cube_r8, 0.0F, 0.0F, 0.8552F);
        cube_r8.cubeList.add(new ModelBox(cube_r8, 217, 63, -1.0F, 0.0F, 0.0F, 1, 2, 7, -0.002F, false));

        cube_r9 = new ModelRenderer(this);
        cube_r9.setRotationPoint(1.5F, 1.85F, 31.0F);
        handguard.addChild(cube_r9);
        setRotationAngle(cube_r9, 0.0F, 0.0F, -0.925F);
        cube_r9.cubeList.add(new ModelBox(cube_r9, 210, 17, -1.0F, -0.65F, 0.0F, 1, 1, 7, -0.001F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -16.35F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -14.25F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -12.25F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -10.15F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -4.05F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -1.95F, 1, 2, 2, -0.101F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -8.15F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -6.05F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -18.45F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -20.55F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -22.55F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -24.65F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -26.65F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 221, 76, -0.9F, -1.9F, -28.75F, 1, 2, 1, -0.1F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 216, 28, -1.0F, -2.0F, -1.0F, 1, 2, 8, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 189, 31, -1.0F, -2.0F, -31.0F, 1, 2, 1, 0.0F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 167, 185, -0.8F, -0.8F, -35.2F, 1, 1, 34, -0.199F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 127, 180, -1.0F, -2.5F, -35.0F, 1, 1, 34, 0.001F, false));
        cube_r9.cubeList.add(new ModelBox(cube_r9, 200, 75, -1.0F, -2.0F, -36.0F, 1, 2, 1, 0.0F, false));

        cube_r10 = new ModelRenderer(this);
        cube_r10.setRotationPoint(1.5F, 3.85F, 29.05F);
        handguard.addChild(cube_r10);
        setRotationAngle(cube_r10, 0.0F, 0.0F, 0.925F);
        cube_r10.cubeList.add(new ModelBox(cube_r10, 234, 82, -0.9F, -0.1F, 0.0F, 1, 2, 2, -0.101F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -2.1F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -4.1F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -6.2F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -8.2F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -10.3F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -12.3F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -14.4F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -16.5F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -18.6F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -20.6F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -22.7F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -28.8F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 188, 69, -0.9F, -0.1F, -33.4F, 1, 2, 1, -0.101F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 188, 69, -0.9F, -0.1F, -32.9F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -30.9F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -24.7F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 221, 86, -0.9F, -0.1F, -26.8F, 1, 2, 1, -0.1F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 200, 84, -1.0F, 0.0F, -34.05F, 1, 2, 1, 0.0F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 206, 192, -0.8F, -0.2F, -33.25F, 1, 1, 34, -0.199F, false));
        cube_r10.cubeList.add(new ModelBox(cube_r10, 87, 189, -0.8F, 1.2F, -33.25F, 1, 1, 34, -0.199F, false));
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
