package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class MG42belt extends ModelWithAttachments {
    private final ModelRenderer belt;
    private final ModelRenderer belt3_r1;
    private final ModelRenderer belt2_r1;
    private final ModelRenderer belt4_r1;

    public MG42belt() {
        textureWidth = 256;
        textureHeight = 128;

        belt = new ModelRenderer(this);
        belt.setRotationPoint(-25.2056F, 9.2517F, 0.0F);
        belt.cubeList.add(new ModelBox(belt, 100, 0, 27.7056F, -22.5517F, -5.0F, 6, 1, 5, 0.0F, true));

        belt3_r1 = new ModelRenderer(this);
        belt3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        belt.addChild(belt3_r1);
        setRotationAngle(belt3_r1, 0.0F, 0.0F, 0.7854F);
        belt3_r1.cubeList.add(new ModelBox(belt3_r1, 0, 50, 5.2F, -37.8F, -7.2F, 1, 1, 8, 0.0F, true));

        belt2_r1 = new ModelRenderer(this);
        belt2_r1.setRotationPoint(0.5272F, -1.2728F, 0.0F);
        belt.addChild(belt2_r1);
        setRotationAngle(belt2_r1, 0.0F, 0.0F, 0.7854F);
        belt2_r1.cubeList.add(new ModelBox(belt2_r1, 0, 50, 7.0F, -37.8F, -7.2F, 1, 1, 8, 0.0F, true));

        belt4_r1 = new ModelRenderer(this);
        belt4_r1.setRotationPoint(-0.5272F, 1.2728F, 0.0F);
        belt.addChild(belt4_r1);
        setRotationAngle(belt4_r1, 0.0F, 0.0F, 0.7854F);
        belt4_r1.cubeList.add(new ModelBox(belt4_r1, 0, 50, 3.4F, -37.8F, -7.2F, 1, 1, 8, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        belt.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
