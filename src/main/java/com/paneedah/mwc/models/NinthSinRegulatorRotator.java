package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinRegulatorRotator extends ModelWithAttachments {
    private final ModelRenderer regulator_rotator_EXTRA5;
    private final ModelRenderer cube_r59;
    private final ModelRenderer cube_r60;

    public NinthSinRegulatorRotator() {
        textureWidth = 128;
        textureHeight = 128;

        regulator_rotator_EXTRA5 = new ModelRenderer(this);
        regulator_rotator_EXTRA5.setRotationPoint(7.0F, 7.5F, -13.3F);
        regulator_rotator_EXTRA5.cubeList.add(new ModelBox(regulator_rotator_EXTRA5, 28, 21, -1.999F, -0.85F, -1.75F, 2, 3, 3, 0.0F, false));
        regulator_rotator_EXTRA5.cubeList.add(new ModelBox(regulator_rotator_EXTRA5, 57, 0, -1.499F, -2.15F, -0.75F, 1, 3, 3, 0.0F, false));

        cube_r59 = new ModelRenderer(this);
        cube_r59.setRotationPoint(-0.5F, -2.15F, -0.75F);
        regulator_rotator_EXTRA5.addChild(cube_r59);
        setRotationAngle(cube_r59, 0.6545F, 0.0F, 0.0F);
        cube_r59.cubeList.add(new ModelBox(cube_r59, 9, 49, -0.999F, 0.0F, -3.0F, 1, 3, 3, 0.0F, false));

        cube_r60 = new ModelRenderer(this);
        cube_r60.setRotationPoint(-0.5F, 0.85F, 2.25F);
        regulator_rotator_EXTRA5.addChild(cube_r60);
        setRotationAngle(cube_r60, -0.8727F, 0.0F, 0.0F);
        cube_r60.cubeList.add(new ModelBox(cube_r60, 19, 41, -0.999F, 0.0F, -1.0F, 1, 2, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        regulator_rotator_EXTRA5.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
