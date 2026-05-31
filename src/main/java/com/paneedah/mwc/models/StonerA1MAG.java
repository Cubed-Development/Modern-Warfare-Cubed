package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class StonerA1MAG extends ModelWithAttachments {
    private final ModelRenderer magazine;
    private final ModelRenderer MAGADDITION4_r1;
    private final ModelRenderer MAGADDITION3_r1;
    private final ModelRenderer Mag4_r1;
    private final ModelRenderer Mag3_r1;

    public StonerA1MAG() {
        textureWidth = 256;
        textureHeight = 256;

        magazine = new ModelRenderer(this);
        magazine.setRotationPoint(-8.8969F, 25.1313F, 0);
        magazine.cubeList.add(new ModelBox(magazine, 160, 0, 16.8469F, -22.8813F, 42, 3, 6, 10, 0, true));
        magazine.cubeList.add(new ModelBox(magazine, 160, 0, 5.8969F, -21.6313F, 42.5F, 7, 1, 9, 0, true));
        magazine.cubeList.add(new ModelBox(magazine, 160, 0, 5.8969F, -22.6313F, 43, 7, 1, 8, 0, true));
        magazine.cubeList.add(new ModelBox(magazine, 160, 0, 1.8969F, -20.6313F, 42, 15, 2, 10, 0, true));
        magazine.cubeList.add(new ModelBox(magazine, 160, 0, 5.8969F, -18.6313F, 42, 9, 12, 10, 0, true));

        MAGADDITION4_r1 = new ModelRenderer(this);
        MAGADDITION4_r1.setRotationPoint(14.0951F, 0.5892F, 0);
        magazine.addChild(MAGADDITION4_r1);
        setRotationAngle(MAGADDITION4_r1, 0, 0, -0.2314F);
        MAGADDITION4_r1.cubeList.add(new ModelBox(MAGADDITION4_r1, 160, 0, 9, -21.5F, 42, 2, 7, 10, 0, true));

        MAGADDITION3_r1 = new ModelRenderer(this);
        MAGADDITION3_r1.setRotationPoint(2.2699F, -11.5132F, 0);
        magazine.addChild(MAGADDITION3_r1);
        setRotationAngle(MAGADDITION3_r1, 0, 0, 0.6109F);
        MAGADDITION3_r1.cubeList.add(new ModelBox(MAGADDITION3_r1, 160, 0, 6.15F, -14.7F, 42, 7, 11, 10, 0, true));

        Mag4_r1 = new ModelRenderer(this);
        Mag4_r1.setRotationPoint(0, 0, 0);
        magazine.addChild(Mag4_r1);
        setRotationAngle(Mag4_r1, 0, 0, 0.4363F);
        Mag4_r1.cubeList.add(new ModelBox(Mag4_r1, 160, 0, -7, -19.5F, 42, 5, 5, 10, 0, true));

        Mag3_r1 = new ModelRenderer(this);
        Mag3_r1.setRotationPoint(15.1777F, -7.6909F, 0);
        magazine.addChild(Mag3_r1);
        setRotationAngle(Mag3_r1, 0, 0, -0.5236F);
        Mag3_r1.cubeList.add(new ModelBox(Mag3_r1, 160, 0, -9.1F, -15, 42, 6, 11, 10, 0, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        magazine.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
