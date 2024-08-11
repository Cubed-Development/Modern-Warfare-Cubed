package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinRegulatorAction extends ModelWithAttachments {
    private final ModelRenderer regulator_action_EXTRA8;
    private final ModelRenderer cube_r61;
    private final ModelRenderer cube_r62;

    public NinthSinRegulatorAction() {
        textureWidth = 128;
        textureHeight = 128;

        regulator_action_EXTRA8 = new ModelRenderer(this);
        regulator_action_EXTRA8.setRotationPoint(7.2F, 11.1F, -20.6F);
        setRotationAngle(regulator_action_EXTRA8, 0.6632F, 0.0F, 0.0F);
        regulator_action_EXTRA8.cubeList.add(new ModelBox(regulator_action_EXTRA8, 52, 110, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));
        regulator_action_EXTRA8.cubeList.add(new ModelBox(regulator_action_EXTRA8, 9, 58, -0.5F, -1.0F, -0.6F, 1, 1, 2, 0.0F, false));

        cube_r61 = new ModelRenderer(this);
        cube_r61.setRotationPoint(0.5F, 0.0F, 1.4F);
        regulator_action_EXTRA8.addChild(cube_r61);
        setRotationAngle(cube_r61, 0.0F, -0.3054F, 0.0F);
        cube_r61.cubeList.add(new ModelBox(cube_r61, 0, 58, -1.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        cube_r62 = new ModelRenderer(this);
        cube_r62.setRotationPoint(-1.0F, 0.0F, 5.0F);
        regulator_action_EXTRA8.addChild(cube_r62);
        setRotationAngle(cube_r62, 0.0F, 0.5672F, 0.0F);
        cube_r62.cubeList.add(new ModelBox(cube_r62, 33, 66, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        regulator_action_EXTRA8.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
