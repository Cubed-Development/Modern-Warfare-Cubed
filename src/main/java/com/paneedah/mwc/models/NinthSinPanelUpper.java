package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class NinthSinPanelUpper extends ModelWithAttachments {
    private final ModelRenderer panel_upper_EXTRA;
    private final ModelRenderer cube_r39;
    private final ModelRenderer cube_r40;
    private final ModelRenderer cube_r41;
    private final ModelRenderer cube_r42;

    public NinthSinPanelUpper() {
        textureWidth = 128;
        textureHeight = 128;

        panel_upper_EXTRA = new ModelRenderer(this);
        panel_upper_EXTRA.setRotationPoint(-9.6F, 8.05F, -4.5F);
        panel_upper_EXTRA.cubeList.add(new ModelBox(panel_upper_EXTRA, 0, 40, 0.0F, 0.0F, -1.0F, 1, 1, 17, 0.0F, false));
        panel_upper_EXTRA.cubeList.add(new ModelBox(panel_upper_EXTRA, 110, 48, -0.002F, 0.7F, 8.0F, 1, 1, 5, 0.0F, false));
        panel_upper_EXTRA.cubeList.add(new ModelBox(panel_upper_EXTRA, 60, 0, 1.0F, -1.4F, 0.0F, 1, 1, 16, 0.0F, false));
        panel_upper_EXTRA.cubeList.add(new ModelBox(panel_upper_EXTRA, 52, 58, -0.099F, 0.9F, -0.3F, 1, 1, 9, -0.3F, false));
        panel_upper_EXTRA.cubeList.add(new ModelBox(panel_upper_EXTRA, 43, 66, -0.099F, 0.5F, -0.3F, 1, 1, 1, -0.3F, false));

        cube_r39 = new ModelRenderer(this);
        cube_r39.setRotationPoint(1.0F, -1.4F, 0.0F);
        panel_upper_EXTRA.addChild(cube_r39);
        setRotationAngle(cube_r39, 0.0F, 0.0F, 0.6283F);
        cube_r39.cubeList.add(new ModelBox(cube_r39, 0, 58, -0.001F, 0.75F, 0.0F, 1, 1, 16, 0.0F, false));
        cube_r39.cubeList.add(new ModelBox(cube_r39, 34, 58, 0.0F, 0.0F, 0.0F, 1, 1, 16, 0.0F, false));

        cube_r40 = new ModelRenderer(this);
        cube_r40.setRotationPoint(1.0F, 2.7F, 12.95F);
        panel_upper_EXTRA.addChild(cube_r40);
        setRotationAngle(cube_r40, -0.1571F, 0.0F, 0.0F);
        cube_r40.cubeList.add(new ModelBox(cube_r40, 0, 111, -1.0F, -1.0F, -5.1F, 1, 1, 5, 0.0F, false));

        cube_r41 = new ModelRenderer(this);
        cube_r41.setRotationPoint(0.0F, 1.0F, 16.0F);
        panel_upper_EXTRA.addChild(cube_r41);
        setRotationAngle(cube_r41, -1.3963F, 0.0F, 0.0F);
        cube_r41.cubeList.add(new ModelBox(cube_r41, 57, 40, 0.001F, 0.0F, -1.0F, 1, 4, 1, 0.0F, false));

        cube_r42 = new ModelRenderer(this);
        cube_r42.setRotationPoint(0.0F, 0.0F, -1.0F);
        panel_upper_EXTRA.addChild(cube_r42);
        setRotationAngle(cube_r42, -0.5236F, 0.0F, 0.6283F);
        cube_r42.cubeList.add(new ModelBox(cube_r42, 25, 41, 0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        panel_upper_EXTRA.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
