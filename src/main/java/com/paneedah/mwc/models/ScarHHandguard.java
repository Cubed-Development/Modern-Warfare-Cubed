package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class ScarHHandguard extends ModelWithAttachments {
    private final ModelRenderer handguard;
    private final ModelRenderer cube_r52;
    private final ModelRenderer cube_r53;
    private final ModelRenderer cube_r54;
    private final ModelRenderer cube_r55;
    private final ModelRenderer cube_r56;
    private final ModelRenderer cube_r57;
    private final ModelRenderer cube_r58;
    private final ModelRenderer cube_r59;
    private final ModelRenderer bone4;
    private final ModelRenderer cube_r60;
    private final ModelRenderer cube_r61;
    private final ModelRenderer bone6;
    private final ModelRenderer cube_r62;
    private final ModelRenderer cube_r63;
    private final ModelRenderer bone5;
    private final ModelRenderer cube_r64;
    private final ModelRenderer cube_r65;

    public ScarHHandguard() {
        textureWidth = 300;
        textureHeight = 300;

        handguard = new ModelRenderer(this);
        handguard.setRotationPoint(-3.8F, -11.2F, -51.0F);
        handguard.cubeList.add(new ModelBox(handguard, 55, 0, 2.5F, -0.6F, 0.0F, 1, 2, 22, 0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 80, 3.5F, -1.0F, 0.0F, 1, 1, 22, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 0, 0, 1.1F, -0.6F, 0.0F, 2, 2, 22, 0.002F, false));
        handguard.cubeList.add(new ModelBox(handguard, 55, 80, 0.1F, -1.0F, 0.0F, 1, 1, 22, -0.001F, false));
        handguard.cubeList.add(new ModelBox(handguard, 91, 127, 4.075F, -6.33F, -0.3F, 1, 1, 1, -0.2F, false));
        handguard.cubeList.add(new ModelBox(handguard, 79, 127, 4.075F, -5.93F, -0.3F, 1, 1, 1, -0.198F, false));
        handguard.cubeList.add(new ModelBox(handguard, 87, 127, 3.65F, -5.5F, -0.3F, 1, 1, 1, -0.199F, false));
        handguard.cubeList.add(new ModelBox(handguard, 99, 127, 3.65F, -6.75F, -0.3F, 1, 1, 1, -0.199F, false));
        handguard.cubeList.add(new ModelBox(handguard, 85, 57, 2.05F, -6.85F, -0.3F, 2, 4, 1, -0.199F, false));
        handguard.cubeList.add(new ModelBox(handguard, 79, 71, 0.55F, -6.85F, -0.3F, 2, 4, 1, -0.2F, false));
        handguard.cubeList.add(new ModelBox(handguard, 47, 127, -0.05F, -6.75F, -0.3F, 1, 1, 1, -0.199F, false));
        handguard.cubeList.add(new ModelBox(handguard, 39, 127, -0.475F, -5.93F, -0.3F, 1, 1, 1, -0.198F, false));
        handguard.cubeList.add(new ModelBox(handguard, 75, 127, -0.475F, -6.33F, -0.3F, 1, 1, 1, -0.2F, false));
        handguard.cubeList.add(new ModelBox(handguard, 59, 127, -0.05F, -5.5F, -0.3F, 1, 1, 1, -0.199F, false));
        handguard.cubeList.add(new ModelBox(handguard, 101, 38, 2.9F, -3.55F, -0.3F, 2, 3, 1, -0.201F, false));
        handguard.cubeList.add(new ModelBox(handguard, 116, 14, 2.9F, -1.05F, -0.3F, 2, 1, 1, -0.202F, false));
        handguard.cubeList.add(new ModelBox(handguard, 100, 32, -0.3F, -3.55F, -0.3F, 2, 3, 1, -0.201F, false));
        handguard.cubeList.add(new ModelBox(handguard, 116, 12, -0.3F, -1.05F, -0.3F, 2, 1, 1, -0.202F, false));

        cube_r52 = new ModelRenderer(this);
        cube_r52.setRotationPoint(-0.1F, -3.35F, -0.1F);
        handguard.addChild(cube_r52);
        setRotationAngle(cube_r52, 0.0F, 0.0F, -0.9076F);
        cube_r52.cubeList.add(new ModelBox(cube_r52, 29, 110, -0.2F, -0.2F, -0.2F, 2, 2, 1, -0.202F, false));

        cube_r53 = new ModelRenderer(this);
        cube_r53.setRotationPoint(4.7F, -3.35F, -0.1F);
        handguard.addChild(cube_r53);
        setRotationAngle(cube_r53, 0.0F, 0.0F, 0.9076F);
        cube_r53.cubeList.add(new ModelBox(cube_r53, 41, 110, -1.8F, -0.2F, -0.2F, 2, 2, 1, -0.202F, false));

        cube_r54 = new ModelRenderer(this);
        cube_r54.setRotationPoint(0.15F, -4.7F, -0.1F);
        handguard.addChild(cube_r54);
        setRotationAngle(cube_r54, 0.0F, 0.0F, -0.7854F);
        cube_r54.cubeList.add(new ModelBox(cube_r54, 55, 127, -0.2F, -0.8F, -0.2F, 1, 1, 1, -0.201F, false));

        cube_r55 = new ModelRenderer(this);
        cube_r55.setRotationPoint(0.15F, -6.55F, -0.1F);
        handguard.addChild(cube_r55);
        setRotationAngle(cube_r55, 0.0F, 0.0F, 0.7854F);
        cube_r55.cubeList.add(new ModelBox(cube_r55, 43, 127, -0.2F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

        cube_r56 = new ModelRenderer(this);
        cube_r56.setRotationPoint(4.45F, -6.55F, -0.1F);
        handguard.addChild(cube_r56);
        setRotationAngle(cube_r56, 0.0F, 0.0F, -0.7854F);
        cube_r56.cubeList.add(new ModelBox(cube_r56, 95, 127, -0.8F, -0.2F, -0.2F, 1, 1, 1, -0.201F, false));

        cube_r57 = new ModelRenderer(this);
        cube_r57.setRotationPoint(4.45F, -4.7F, -0.1F);
        handguard.addChild(cube_r57);
        setRotationAngle(cube_r57, 0.0F, 0.0F, 0.7854F);
        cube_r57.cubeList.add(new ModelBox(cube_r57, 83, 127, -0.8F, -0.8F, -0.2F, 1, 1, 1, -0.201F, false));

        cube_r58 = new ModelRenderer(this);
        cube_r58.setRotationPoint(0.1F, 0.0F, 0.0F);
        handguard.addChild(cube_r58);
        setRotationAngle(cube_r58, 0.0F, 0.0F, -0.8552F);
        cube_r58.cubeList.add(new ModelBox(cube_r58, 0, 56, 0.0F, 0.0F, 0.0F, 1, 2, 22, -0.002F, false));

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(4.5F, 0.0F, 0.0F);
        handguard.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.0F, 0.0F, 0.8552F);
        cube_r59.cubeList.add(new ModelBox(cube_r59, 55, 24, -1.0F, 0.0F, 0.0F, 1, 2, 22, -0.002F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(5.3F, -14.9F, 1.25F);
        handguard.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 1.5708F);
        bone4.cubeList.add(new ModelBox(bone4, 112, 19, 12.2F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 112, 16, 12.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 98, 111, 12.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 92, 111, 12.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 83, 111, 12.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 75, 111, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 110, 107, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 110, 104, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
        bone4.cubeList.add(new ModelBox(bone4, 80, 149, 12.3F, 0.4F, -1.25F, 2, 1, 11, -0.001F, false));
        bone4.cubeList.add(new ModelBox(bone4, 110, 102, 12.3F, 0.4F, 9.35F, 2, 1, 1, -0.002F, false));
        bone4.cubeList.add(new ModelBox(bone4, 165, 87, 12.1F, 0.4F, -1.25F, 1, 1, 11, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 45, 119, 12.1F, 0.4F, 9.35F, 1, 1, 1, -0.003F, false));
        bone4.cubeList.add(new ModelBox(bone4, 55, 95, 12.2F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-1.6F, 0.0F, -1.25F);
        bone4.addChild(cube_r60);
        setRotationAngle(cube_r60, 0.0F, 0.0F, 0.8901F);
        cube_r60.cubeList.add(new ModelBox(cube_r60, 73, 103, 8.6105F, -11.08F, -0.2F, 1, 1, 2, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 165, 129, 8.5605F, -10.93F, 0.4F, 1, 1, 11, -0.35F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 86, 119, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 96, 119, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 104, 119, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 25, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 29, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 38, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 42, 8.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
        cube_r60.cubeList.add(new ModelBox(cube_r60, 120, 46, 8.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(0.0F, 0.0F, -1.25F);
        bone4.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, 0.0F, -0.8901F);
        cube_r61.cubeList.add(new ModelBox(cube_r61, 79, 103, 8.0105F, 10.68F, -0.2F, 1, 1, 2, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 165, 141, 8.0605F, 10.83F, 0.4F, 1, 1, 11, -0.35F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 49, 119, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 92, 119, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 100, 119, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 23, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 27, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 31, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 40, 8.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
        cube_r61.cubeList.add(new ModelBox(cube_r61, 120, 44, 8.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(15.5F, 2.2F, 1.25F);
        handguard.addChild(bone6);
        setRotationAngle(bone6, 0.0F, 0.0F, -3.1416F);
        bone6.cubeList.add(new ModelBox(bone6, 110, 75, 12.2F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 110, 72, 12.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 110, 70, 12.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 110, 68, 12.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 110, 66, 12.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 110, 63, 12.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 97, 107, 12.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 106, 0, 12.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 6, 100, 12.2F, -0.2F, 12.05F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 102, 91, 12.2F, -0.2F, 10.8F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 42, 99, 12.2F, -0.2F, 14.55F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 100, 12.2F, -0.2F, 13.3F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 96, 71, 12.2F, -0.2F, 17.05F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 79, 98, 12.2F, -0.2F, 15.8F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 94, 61, 12.2F, -0.2F, 19.55F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 94, 4, 12.2F, -0.2F, 19.95F, 2, 1, 1, -0.198F, false));
        bone6.cubeList.add(new ModelBox(bone6, 96, 14, 12.2F, -0.2F, 18.3F, 2, 1, 1, -0.199F, false));
        bone6.cubeList.add(new ModelBox(bone6, 0, 24, 12.3F, 0.4F, -1.25F, 2, 1, 22, -0.001F, false));
        bone6.cubeList.add(new ModelBox(bone6, 55, 57, 12.1F, 0.4F, -1.25F, 1, 1, 22, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 87, 94, 12.2F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(-1.6F, 0.0F, -1.25F);
        bone6.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 0.0F, 0.8901F);
        cube_r62.cubeList.add(new ModelBox(cube_r62, 42, 103, 8.6105F, -11.08F, -0.2F, 1, 1, 2, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 0, 110, 8.5605F, -10.93F, 0.4F, 1, 1, 21, -0.35F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 65, 106, 8.6105F, -11.08F, 19.55F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 28, 106, 8.6105F, -11.08F, 21.2F, 1, 1, 1, -0.197F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 40, 106, 8.6105F, -11.08F, 20.8F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 89, 106, 8.6105F, -11.08F, 17.05F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 77, 106, 8.6105F, -11.08F, 18.3F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 69, 111, 8.6105F, -11.08F, 14.55F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 103, 107, 8.6105F, -11.08F, 15.8F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 114, 60, 8.6105F, -11.08F, 12.05F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 104, 113, 8.6105F, -11.08F, 13.3F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 23, 117, 8.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 26, 8.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 28, 8.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 31, 117, 8.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 41, 117, 8.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 43, 8.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 117, 45, 8.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
        cube_r62.cubeList.add(new ModelBox(cube_r62, 49, 117, 8.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

        cube_r63 = new ModelRenderer(this);
        cube_r63.setRotationPoint(0.0F, 0.0F, -1.25F);
        bone6.addChild(cube_r63);
        setRotationAngle(cube_r63, 0.0F, 0.0F, -0.8901F);
        cube_r63.cubeList.add(new ModelBox(cube_r63, 55, 103, 8.0105F, 10.68F, -0.2F, 1, 1, 2, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 110, 57, 8.0605F, 10.83F, 0.4F, 1, 1, 21, -0.35F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 71, 106, 8.0105F, 10.68F, 19.55F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 34, 106, 8.0105F, 10.68F, 21.2F, 1, 1, 1, -0.197F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 59, 106, 8.0105F, 10.68F, 20.8F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 48, 107, 8.0105F, 10.68F, 17.05F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 83, 106, 8.0105F, 10.68F, 18.3F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 104, 111, 8.0105F, 10.68F, 14.55F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 63, 111, 8.0105F, 10.68F, 15.8F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 104, 115, 8.0105F, 10.68F, 12.05F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 114, 57, 8.0105F, 10.68F, 13.3F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 22, 8.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 24, 8.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 27, 117, 8.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 30, 8.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 39, 8.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 41, 8.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 45, 117, 8.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
        cube_r63.cubeList.add(new ModelBox(cube_r63, 117, 47, 8.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(-0.7F, -14.9F, 1.25F);
        handguard.addChild(bone5);
        setRotationAngle(bone5, 0.0F, 0.0F, -1.5708F);
        bone5.cubeList.add(new ModelBox(bone5, 110, 100, -14.2F, -0.2F, 0.8F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 95, -14.2F, -0.2F, 2.05F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 92, -14.2F, -0.2F, 3.3F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 90, -14.2F, -0.2F, 4.55F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 88, -14.2F, -0.2F, 5.8F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 85, -14.2F, -0.2F, 7.05F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 83, -14.2F, -0.2F, 8.3F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 81, -14.2F, -0.2F, 9.55F, 2, 1, 1, -0.199F, false));
        bone5.cubeList.add(new ModelBox(bone5, 0, 148, -14.3F, 0.4F, -1.25F, 2, 1, 11, -0.001F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 79, -14.3F, 0.4F, 9.35F, 2, 1, 1, -0.002F, false));
        bone5.cubeList.add(new ModelBox(bone5, 110, 151, -13.1F, 0.4F, -1.25F, 1, 1, 11, 0.0F, false));
        bone5.cubeList.add(new ModelBox(bone5, 75, 118, -13.1F, 0.4F, 9.35F, 1, 1, 1, -0.003F, false));
        bone5.cubeList.add(new ModelBox(bone5, 94, 90, -14.2F, -0.2F, -1.45F, 2, 1, 2, -0.199F, false));

        cube_r64 = new ModelRenderer(this);
        cube_r64.setRotationPoint(1.6F, 0.0F, -1.25F);
        bone5.addChild(cube_r64);
        setRotationAngle(cube_r64, 0.0F, 0.0F, -0.8901F);
        cube_r64.cubeList.add(new ModelBox(cube_r64, 61, 103, -9.6105F, -11.08F, -0.2F, 1, 1, 2, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 20, 164, -9.5605F, -10.93F, 0.4F, 1, 1, 11, -0.35F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 83, 118, -9.6105F, -11.08F, 10.8F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 90, -9.6105F, -11.08F, 9.55F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 100, -9.6105F, -11.08F, 8.3F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 104, -9.6105F, -11.08F, 7.05F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 114, -9.6105F, -11.08F, 5.8F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 118, 118, -9.6105F, -11.08F, 4.55F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 27, 119, -9.6105F, -11.08F, 3.3F, 1, 1, 1, -0.198F, false));
        cube_r64.cubeList.add(new ModelBox(cube_r64, 41, 119, -9.6105F, -11.08F, 2.05F, 1, 1, 1, -0.198F, false));

        cube_r65 = new ModelRenderer(this);
        cube_r65.setRotationPoint(0.0F, 0.0F, -1.25F);
        bone5.addChild(cube_r65);
        setRotationAngle(cube_r65, 0.0F, 0.0F, 0.8901F);
        cube_r65.cubeList.add(new ModelBox(cube_r65, 67, 103, -9.0105F, 10.68F, -0.2F, 1, 1, 2, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 68, 165, -9.0605F, 10.83F, 0.4F, 1, 1, 11, -0.35F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 79, 118, -9.0105F, 10.68F, 10.8F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 88, -9.0105F, 10.68F, 9.55F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 92, -9.0105F, 10.68F, 8.3F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 102, -9.0105F, 10.68F, 7.05F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 112, -9.0105F, 10.68F, 5.8F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 118, 116, -9.0105F, 10.68F, 4.55F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 23, 119, -9.0105F, 10.68F, 3.3F, 1, 1, 1, -0.198F, false));
        cube_r65.cubeList.add(new ModelBox(cube_r65, 31, 119, -9.0105F, 10.68F, 2.05F, 1, 1, 1, -0.198F, false));
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
