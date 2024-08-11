package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Beowulf50CalAction extends ModelWithAttachments {
    private final ModelRenderer action;
    private final ModelRenderer cube_r15;
    private final ModelRenderer cube_r16;

    public Beowulf50CalAction() {
        textureWidth = 256;
        textureHeight = 256;

        action = new ModelRenderer(this);
        action.setRotationPoint(-2.6F, -13.0F, -20.75F);
        action.cubeList.add(new ModelBox(action, 40, 40, -1.0F, -1.1F, 0.0F, 1, 1, 15, 0.0F, false));

        cube_r15 = new ModelRenderer(this);
        cube_r15.setRotationPoint(-1.0F, -1.1F, 0.0F);
        action.addChild(cube_r15);
        setRotationAngle(cube_r15, 0.0F, 0.0F, -0.6109F);
        cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 39, 0.0F, 0.0F, 0.0F, 1, 1, 15, 0.0F, false));

        cube_r16 = new ModelRenderer(this);
        cube_r16.setRotationPoint(-1.5F, -0.6F, 0.75F);
        action.addChild(cube_r16);
        setRotationAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        cube_r16.cubeList.add(new ModelBox(cube_r16, 19, 17, -1.0F, -1.0F, 0.0F, 3, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        action.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
