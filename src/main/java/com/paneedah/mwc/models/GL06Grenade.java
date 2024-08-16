package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class GL06Grenade extends ModelBase {
    private final ModelRenderer grenade;
    private final ModelRenderer grenade9_r1;
    private final ModelRenderer grenade8_r1;
    private final ModelRenderer grenade7_r1;
    private final ModelRenderer grenade6_r1;
    private final ModelRenderer grenade5_r1;
    private final ModelRenderer grenade4_r1;
    private final ModelRenderer grenade3_r1;
    private final ModelRenderer grenade10_r1;

    public GL06Grenade() {
        textureWidth = 512;
        textureHeight = 256;

        grenade = new ModelRenderer(this);
        grenade.setRotationPoint(20.481F, -37.5165F, 0.0F);
        grenade.cubeList.add(new ModelBox(grenade, 0, 50, -22.981F, 23.5165F, -8.5F, 2, 3, 6, 0.0F, true));
        grenade.cubeList.add(new ModelBox(grenade, 0, 50, -23.481F, 24.0165F, -8.5F, 3, 2, 6, 0.0F, true));

        grenade9_r1 = new ModelRenderer(this);
        grenade9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        grenade.addChild(grenade9_r1);
        setRotationAngle(grenade9_r1, 0.0F, 0.0F, -2.3562F);
        grenade9_r1.cubeList.add(new ModelBox(grenade9_r1, 0, 50, -2.5F, -35.0F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade8_r1 = new ModelRenderer(this);
        grenade8_r1.setRotationPoint(-45.5833F, 0.9142F, 0.0F);
        grenade.addChild(grenade8_r1);
        setRotationAngle(grenade8_r1, 0.0F, 0.0F, 2.3562F);
        grenade8_r1.cubeList.add(new ModelBox(grenade8_r1, 0, 50, 0.0F, -35.5F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade7_r1 = new ModelRenderer(this);
        grenade7_r1.setRotationPoint(-46.9975F, -2.5F, 0.0F);
        grenade.addChild(grenade7_r1);
        setRotationAngle(grenade7_r1, 0.0F, 0.0F, 2.3562F);
        grenade7_r1.cubeList.add(new ModelBox(grenade7_r1, 0, 50, 0.0F, -37.5F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade6_r1 = new ModelRenderer(this);
        grenade6_r1.setRotationPoint(-47.4975F, 50.7401F, 0.0F);
        grenade.addChild(grenade6_r1);
        setRotationAngle(grenade6_r1, 0.0F, 0.0F, 0.7854F);
        grenade6_r1.cubeList.add(new ModelBox(grenade6_r1, 0, 50, -0.5F, -38.0F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade5_r1 = new ModelRenderer(this);
        grenade5_r1.setRotationPoint(-48.0833F, 52.1543F, 0.0F);
        grenade.addChild(grenade5_r1);
        setRotationAngle(grenade5_r1, 0.0F, 0.0F, 0.7854F);
        grenade5_r1.cubeList.add(new ModelBox(grenade5_r1, 0, 50, -2.5F, -38.0F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade4_r1 = new ModelRenderer(this);
        grenade4_r1.setRotationPoint(3.7426F, 48.9975F, 0.0F);
        grenade.addChild(grenade4_r1);
        setRotationAngle(grenade4_r1, 0.0F, 0.0F, -0.7854F);
        grenade4_r1.cubeList.add(new ModelBox(grenade4_r1, 0, 50, -3.0F, -35.5F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade3_r1 = new ModelRenderer(this);
        grenade3_r1.setRotationPoint(5.1568F, 48.4117F, 0.0F);
        grenade.addChild(grenade3_r1);
        setRotationAngle(grenade3_r1, 0.0F, 0.0F, -0.7854F);
        grenade3_r1.cubeList.add(new ModelBox(grenade3_r1, 0, 50, -3.0F, -37.5F, -8.5F, 1, 1, 6, 0.0F, true));

        grenade10_r1 = new ModelRenderer(this);
        grenade10_r1.setRotationPoint(3.4142F, 1.4142F, 0.0F);
        grenade.addChild(grenade10_r1);
        setRotationAngle(grenade10_r1, 0.0F, 0.0F, -2.3562F);
        grenade10_r1.cubeList.add(new ModelBox(grenade10_r1, 0, 50, -0.5F, -35.0F, -8.5F, 1, 1, 6, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        grenade.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
