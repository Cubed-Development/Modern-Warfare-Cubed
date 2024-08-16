package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DSR1BoltActionMain extends ModelWithAttachments {
    private final ModelRenderer boltaction_main;
    private final ModelRenderer cube_r127_r1;
    private final ModelRenderer cube_r128_r1;
    private final ModelRenderer cube_r129_r1;
    private final ModelRenderer cube_r130_r1;
    private final ModelRenderer cube_r126_r1;

    public DSR1BoltActionMain() {
        textureWidth = 400;
        textureHeight = 400;

        boltaction_main = new ModelRenderer(this);
        boltaction_main.setRotationPoint(0.0F, -15.35F, 6.5F);


        cube_r127_r1 = new ModelRenderer(this);
        cube_r127_r1.setRotationPoint(-27.0733F, 30.3358F, -7.7273F);
        boltaction_main.addChild(cube_r127_r1);
        setRotationAngle(cube_r127_r1, -0.0297F, 0.0561F, 0.8379F);
        cube_r127_r1.cubeList.add(new ModelBox(cube_r127_r1, 22, 0, -4.0F, -34.7F, 6.95F, 1, 3, 1, -0.1F, false));

        cube_r128_r1 = new ModelRenderer(this);
        cube_r128_r1.setRotationPoint(-26.4198F, 30.9883F, 8.6942F);
        boltaction_main.addChild(cube_r128_r1);
        setRotationAngle(cube_r128_r1, 0.4416F, 0.0561F, 0.8379F);
        cube_r128_r1.cubeList.add(new ModelBox(cube_r128_r1, 6, 0, -4.0F, -34.5F, 6.95F, 1, 3, 1, -0.1F, false));

        cube_r129_r1 = new ModelRenderer(this);
        cube_r129_r1.setRotationPoint(-32.0637F, 26.3524F, 1.1697F);
        boltaction_main.addChild(cube_r129_r1);
        setRotationAngle(cube_r129_r1, 0.2259F, 0.0607F, 1.0302F);
        cube_r129_r1.cubeList.add(new ModelBox(cube_r129_r1, 14, 0, -4.0F, -34.7F, 6.95F, 1, 3, 1, -0.1F, false));

        cube_r130_r1 = new ModelRenderer(this);
        cube_r130_r1.setRotationPoint(-22.2793F, 35.1302F, -0.4854F);
        boltaction_main.addChild(cube_r130_r1);
        setRotationAngle(cube_r130_r1, 0.1875F, 0.1405F, 0.6526F);
        cube_r130_r1.cubeList.add(new ModelBox(cube_r130_r1, 0, 0, -4.0F, -34.5F, 6.95F, 1, 3, 1, -0.1F, false));

        cube_r126_r1 = new ModelRenderer(this);
        cube_r126_r1.setRotationPoint(-28.205F, 29.9544F, 0.7628F);
        boltaction_main.addChild(cube_r126_r1);
        setRotationAngle(cube_r126_r1, 0.2123F, 0.0988F, 0.8593F);
        cube_r126_r1.cubeList.add(new ModelBox(cube_r126_r1, 55, 31, -3.2F, -36.2F, 6.75F, 1, 5, 1, -0.1F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        boltaction_main.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
