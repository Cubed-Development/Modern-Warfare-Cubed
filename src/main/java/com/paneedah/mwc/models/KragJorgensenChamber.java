package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KragJorgensenChamber extends ModelWithAttachments {
    private final ModelRenderer chamber;
    private final ModelRenderer chamber10_r1;
    private final ModelRenderer chamber8_r1;
    private final ModelRenderer chamber2_r1;

    public KragJorgensenChamber() {
        textureWidth = 512;
        textureHeight = 256;

        chamber = new ModelRenderer(this);
        chamber.setRotationPoint(0, 27.9719F, -47.3601F);
        chamber.cubeList.add(new ModelBox(chamber, 200, 0, -6.2F, -40.7719F, 16.3601F, 1, 3, 9, 0, true));
        chamber.cubeList.add(new ModelBox(chamber, 200, 0, -6, -41.1719F, 16.3601F, 1, 1, 9, 0, true));
        chamber.cubeList.add(new ModelBox(chamber, 200, 0, -5.1F, -41.1719F, 16.3601F, 1, 1, 9, 0, true));
        chamber.cubeList.add(new ModelBox(chamber, 200, 0, -6, -41.5719F, 20.3601F, 1, 1, 3, 0, true));
        chamber.cubeList.add(new ModelBox(chamber, 200, 0, -5.4F, -41.5719F, 20.3601F, 1, 1, 3, 0, true));

        chamber10_r1 = new ModelRenderer(this);
        chamber10_r1.setRotationPoint(0, 0, 0);
        chamber.addChild(chamber10_r1);
        setRotationAngle(chamber10_r1, -1.0782F, 0, 0);
        chamber10_r1.cubeList.add(new ModelBox(chamber10_r1, 200, 0, -5.4F, -37.6F, -27, 1, 1, 1, 0, true));
        chamber10_r1.cubeList.add(new ModelBox(chamber10_r1, 200, 0, -6, -37.6F, -27, 1, 1, 1, 0, true));

        chamber8_r1 = new ModelRenderer(this);
        chamber8_r1.setRotationPoint(0, 2.8746F, 27.1375F);
        chamber.addChild(chamber8_r1);
        setRotationAngle(chamber8_r1, -0.4833F, 0, 0);
        chamber8_r1.cubeList.add(new ModelBox(chamber8_r1, 200, 0, -5.4F, -37.6F, -24, 1, 1, 1, 0, true));
        chamber8_r1.cubeList.add(new ModelBox(chamber8_r1, 200, 0, -6, -37.6F, -24, 1, 1, 1, 0, true));

        chamber2_r1 = new ModelRenderer(this);
        chamber2_r1.setRotationPoint(0, -67.1682F, 51.5638F);
        chamber.addChild(chamber2_r1);
        setRotationAngle(chamber2_r1, 1.5243F, 0, 0);
        chamber2_r1.cubeList.add(new ModelBox(chamber2_r1, 200, 0, -6.2F, -33.8F, -31, 1, 9, 1, 0, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        chamber.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
