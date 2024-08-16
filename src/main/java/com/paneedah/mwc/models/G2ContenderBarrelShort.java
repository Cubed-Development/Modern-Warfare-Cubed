package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class G2ContenderBarrelShort extends ModelWithAttachments {
    private final ModelRenderer barrel_SHORT;
    private final ModelRenderer barrel_short2;
    private final ModelRenderer barrel4;
    private final ModelRenderer underbarrel4;
    private final ModelRenderer bone102;
    private final ModelRenderer cube_r26;
    private final ModelRenderer bone103;
    private final ModelRenderer cube_r27;
    private final ModelRenderer bone104;
    private final ModelRenderer cube_r28;
    private final ModelRenderer bone105;
    private final ModelRenderer cube_r29;
    private final ModelRenderer bone106;
    private final ModelRenderer cube_r30;
    private final ModelRenderer bone107;
    private final ModelRenderer cube_r31;
    private final ModelRenderer bone108;
    private final ModelRenderer cube_r32;
    private final ModelRenderer bone109;
    private final ModelRenderer cube_r33;
    private final ModelRenderer bone110;
    private final ModelRenderer cube_r34;
    private final ModelRenderer cube_r35;
    private final ModelRenderer cube_r36;
    private final ModelRenderer cube_r37;
    private final ModelRenderer cube_r38;
    private final ModelRenderer cube_r39;
    private final ModelRenderer bone111;
    private final ModelRenderer cube_r40;
    private final ModelRenderer bone112;
    private final ModelRenderer cube_r41;
    private final ModelRenderer bone113;
    private final ModelRenderer cube_r42;
    private final ModelRenderer bone114;
    private final ModelRenderer cube_r43;

    public G2ContenderBarrelShort() {
        textureWidth = 512;
        textureHeight = 512;

        barrel_SHORT = new ModelRenderer(this);
        barrel_SHORT.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(barrel_SHORT, 0.0F, 3.1416F, 0.0F);


        barrel_short2 = new ModelRenderer(this);
        barrel_short2.setRotationPoint(-7.5F, -32.0F, 16.0F);
        barrel_SHORT.addChild(barrel_short2);


        barrel4 = new ModelRenderer(this);
        barrel4.setRotationPoint(0.0F, -2.25F, 11.5F);
        barrel_short2.addChild(barrel4);
        barrel4.cubeList.add(new ModelBox(barrel4, 0, 276, 8.25F, 4.25F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 249, 153, 7.5F, 4.0F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 249, 77, 7.5F, 3.0F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 249, 39, 8.5F, 3.0F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 249, 1, 8.75F, 3.25F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 241, 248, 8.75F, 3.75F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 210, 210, 7.25F, 3.75F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 210, 0, 7.25F, 3.25F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 249, 115, 8.5F, 4.0F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 249, 191, 8.25F, 2.75F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 210, 138, 7.75F, 2.75F, -30.0F, 1, 1, 37, 0.0F, false));
        barrel4.cubeList.add(new ModelBox(barrel4, 210, 69, 7.75F, 4.25F, -30.0F, 1, 1, 37, 0.0F, false));

        underbarrel4 = new ModelRenderer(this);
        underbarrel4.setRotationPoint(-1.5F, 32.0F, -16.0F);
        barrel_short2.addChild(underbarrel4);


        bone102 = new ModelRenderer(this);
        bone102.setRotationPoint(0.5F, -30.0F, 15.0F);
        underbarrel4.addChild(bone102);


        cube_r26 = new ModelRenderer(this);
        cube_r26.setRotationPoint(1.0F, -0.9472F, 8.9696F);
        bone102.addChild(cube_r26);
        setRotationAngle(cube_r26, 0.1309F, 0.0F, 0.0F);
        cube_r26.cubeList.add(new ModelBox(cube_r26, 140, 0, 6.5F, 0.9647F, -20.4237F, 4, 2, 17, 0.0F, false));

        bone103 = new ModelRenderer(this);
        bone103.setRotationPoint(1.5F, -30.9472F, 15.9696F);
        underbarrel4.addChild(bone103);
        setRotationAngle(bone103, -0.5672F, 0.0F, 0.0F);


        cube_r27 = new ModelRenderer(this);
        cube_r27.setRotationPoint(0.0F, 0.0737F, 7.9277F);
        bone103.addChild(cube_r27);
        setRotationAngle(cube_r27, 0.1309F, 0.0F, 0.0F);
        cube_r27.cubeList.add(new ModelBox(cube_r27, 87, 73, 6.5F, 7.9853F, -17.2321F, 4, 1, 1, 0.0F, false));

        bone104 = new ModelRenderer(this);
        bone104.setRotationPoint(1.5F, -30.9472F, 15.9696F);
        underbarrel4.addChild(bone104);
        setRotationAngle(bone104, -0.9599F, 0.0F, 0.0F);


        cube_r28 = new ModelRenderer(this);
        cube_r28.setRotationPoint(0.0F, 0.2426F, 7.6118F);
        bone104.addChild(cube_r28);
        setRotationAngle(cube_r28, 0.1309F, 0.0F, 0.0F);
        cube_r28.cubeList.add(new ModelBox(cube_r28, 82, 3, 6.5F, 9.6811F, -13.3202F, 4, 2, 1, 0.0F, false));

        bone105 = new ModelRenderer(this);
        bone105.setRotationPoint(1.5F, -30.9472F, 15.9696F);
        underbarrel4.addChild(bone105);
        setRotationAngle(bone105, -1.7017F, 0.0F, 0.0F);


        cube_r29 = new ModelRenderer(this);
        cube_r29.setRotationPoint(0.0F, 0.3945F, 8.0658F);
        bone105.addChild(cube_r29);
        setRotationAngle(cube_r29, 0.1309F, 0.0F, 0.0F);
        cube_r29.cubeList.add(new ModelBox(cube_r29, 87, 70, 6.5F, 11.0F, -4.5F, 4, 1, 1, 0.0F, false));

        bone106 = new ModelRenderer(this);
        bone106.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel4.addChild(bone106);
        setRotationAngle(bone106, -1.7017F, 0.0F, 0.0F);


        cube_r30 = new ModelRenderer(this);
        cube_r30.setRotationPoint(0.0F, 0.3945F, 8.0658F);
        bone106.addChild(cube_r30);
        setRotationAngle(cube_r30, 0.1309F, 0.0F, 0.0F);
        cube_r30.cubeList.add(new ModelBox(cube_r30, 87, 12, 6.5F, 11.0F, -4.5F, 4, 1, 1, 0.0F, false));

        bone107 = new ModelRenderer(this);
        bone107.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel4.addChild(bone107);
        setRotationAngle(bone107, -2.0071F, 0.0F, 0.0F);


        cube_r31 = new ModelRenderer(this);
        cube_r31.setRotationPoint(0.0F, 0.5215F, 7.6894F);
        bone107.addChild(cube_r31);
        setRotationAngle(cube_r31, 0.1309F, 0.0F, 0.0F);
        cube_r31.cubeList.add(new ModelBox(cube_r31, 87, 6, 6.5F, 9.2649F, -1.227F, 4, 1, 1, 0.0F, false));

        bone108 = new ModelRenderer(this);
        bone108.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel4.addChild(bone108);
        setRotationAngle(bone108, -2.4435F, 0.0F, 0.0F);


        cube_r32 = new ModelRenderer(this);
        cube_r32.setRotationPoint(0.0F, 0.7371F, 7.6598F);
        bone108.addChild(cube_r32);
        setRotationAngle(cube_r32, 0.1309F, 0.0F, 0.0F);
        cube_r32.cubeList.add(new ModelBox(cube_r32, 87, 0, 6.5F, 5.2763F, 2.2184F, 4, 1, 1, 0.0F, false));

        bone109 = new ModelRenderer(this);
        bone109.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel4.addChild(bone109);
        setRotationAngle(bone109, -2.7925F, 0.0F, 0.0F);


        cube_r33 = new ModelRenderer(this);
        cube_r33.setRotationPoint(0.0F, 0.9665F, 7.5118F);
        bone109.addChild(cube_r33);
        setRotationAngle(cube_r33, 0.1309F, 0.0F, 0.0F);
        cube_r33.cubeList.add(new ModelBox(cube_r33, 20, 87, 6.5F, 1.2621F, 3.5476F, 4, 1, 1, 0.0F, false));

        bone110 = new ModelRenderer(this);
        bone110.setRotationPoint(1.5F, -31.4472F, 15.9696F);
        underbarrel4.addChild(bone110);
        bone110.cubeList.add(new ModelBox(bone110, 70, 139, 6.5F, 1.2926F, -11.5806F, 4, 1, 18, 0.0F, false));
        bone110.cubeList.add(new ModelBox(bone110, 96, 139, 6.5F, 2.2926F, -12.5806F, 4, 1, 17, 0.0F, false));
        bone110.cubeList.add(new ModelBox(bone110, 37, 37, 6.5F, 3.2926F, -12.5806F, 4, 1, 7, 0.0F, false));

        cube_r34 = new ModelRenderer(this);
        cube_r34.setRotationPoint(0.0F, 0.5254F, 8.9194F);
        bone110.addChild(cube_r34);
        setRotationAngle(cube_r34, 0.0396F, 0.1248F, -1.2629F);
        cube_r34.cubeList.add(new ModelBox(cube_r34, 102, 70, -0.7075F, 7.0385F, -20.9237F, 1, 1, 17, 0.0F, false));

        cube_r35 = new ModelRenderer(this);
        cube_r35.setRotationPoint(-0.9591F, 1.9496F, 9.1069F);
        bone110.addChild(cube_r35);
        setRotationAngle(cube_r35, 0.1309F, 0.0F, 0.0F);
        cube_r35.cubeList.add(new ModelBox(cube_r35, 140, 88, 8.4128F, 0.6555F, -20.9237F, 2, 1, 17, 0.0F, false));

        cube_r36 = new ModelRenderer(this);
        cube_r36.setRotationPoint(-1.3728F, -2.3809F, 8.9194F);
        bone110.addChild(cube_r36);
        setRotationAngle(cube_r36, 0.0F, 0.0F, 1.2654F);
        cube_r36.cubeList.add(new ModelBox(cube_r36, 98, 101, 5.8709F, -7.4038F, -20.5F, 1, 1, 18, 0.0F, false));

        cube_r37 = new ModelRenderer(this);
        cube_r37.setRotationPoint(0.1335F, 1.9496F, 9.1069F);
        bone110.addChild(cube_r37);
        setRotationAngle(cube_r37, 0.1309F, 0.0F, 0.0F);
        cube_r37.cubeList.add(new ModelBox(cube_r37, 31, 100, 8.4128F, 0.6555F, -20.9237F, 1, 1, 17, 0.0F, false));

        cube_r38 = new ModelRenderer(this);
        cube_r38.setRotationPoint(0.0F, 0.5254F, 8.9194F);
        bone110.addChild(cube_r38);
        setRotationAngle(cube_r38, 0.0396F, -0.1248F, 1.2629F);
        cube_r38.cubeList.add(new ModelBox(cube_r38, 140, 106, 4.8195F, -9.1747F, -20.9237F, 1, 1, 17, 0.0F, false));

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(1.3728F, -2.3809F, 8.9194F);
        bone110.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, -1.2654F);
        cube_r39.cubeList.add(new ModelBox(cube_r39, 140, 19, -1.7589F, 8.8094F, -20.5F, 1, 1, 18, 0.0F, false));

        bone111 = new ModelRenderer(this);
        bone111.setRotationPoint(0.25F, 1.6156F, 0.0474F);
        bone110.addChild(bone111);


        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(0.0F, 0.0234F, -0.1522F);
        bone111.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.5236F, 0.0F, 0.0F);
        cube_r40.cubeList.add(new ModelBox(cube_r40, 23, 35, 7.2037F, 8.7141F, -8.4593F, 2, 1, 1, 0.0F, false));
        cube_r40.cubeList.add(new ModelBox(cube_r40, 38, 21, 8.2963F, 8.7141F, -8.4593F, 1, 1, 1, 0.0F, false));

        bone112 = new ModelRenderer(this);
        bone112.setRotationPoint(1.5F, -31.4472F, 32.9696F);
        underbarrel4.addChild(bone112);


        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(0.0F, -1.3539F, 0.307F);
        bone112.addChild(cube_r41);
        setRotationAngle(cube_r41, -0.2618F, 0.0F, 0.0F);
        cube_r41.cubeList.add(new ModelBox(cube_r41, 70, 76, 6.5F, 6.3401F, -11.5729F, 4, 1, 2, 0.0F, false));

        bone113 = new ModelRenderer(this);
        bone113.setRotationPoint(1.5F, -32.8011F, 33.2766F);
        underbarrel4.addChild(bone113);
        setRotationAngle(bone113, -0.5236F, 0.0F, 0.0F);


        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(0.0F, 0.7071F, 0.0F);
        bone113.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.2618F, 0.0F, 0.0F);
        cube_r42.cubeList.add(new ModelBox(cube_r42, 32, 76, 6.5F, 10.4602F, -6.8033F, 4, 1, 2, 0.0F, false));

        bone114 = new ModelRenderer(this);
        bone114.setRotationPoint(1.5F, -32.8011F, 33.2766F);
        underbarrel4.addChild(bone114);
        setRotationAngle(bone114, -1.1781F, 0.0F, 0.0F);


        cube_r43 = new ModelRenderer(this);
        cube_r43.setRotationPoint(0.0F, 1.1304F, 0.4429F);
        bone114.addChild(cube_r43);
        setRotationAngle(cube_r43, -0.3491F, 0.0F, 0.0F);
        cube_r43.cubeList.add(new ModelBox(cube_r43, 20, 82, 6.5F, 11.1635F, 2.9946F, 4, 2, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        barrel_SHORT.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
