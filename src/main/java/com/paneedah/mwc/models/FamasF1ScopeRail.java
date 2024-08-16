package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class FamasF1ScopeRail extends ModelWithAttachments {
    private final ModelRenderer scope_rail;

    public FamasF1ScopeRail() {
        textureWidth = 256;
        textureHeight = 256;

        scope_rail = new ModelRenderer(this);
        scope_rail.setRotationPoint(-0.5F, -23.0F, -36.2F);
        scope_rail.cubeList.add(new ModelBox(scope_rail, 95, 0, -2.001F, -3.0F, -0.001F, 2, 3, 38, 0.0F, false));
        scope_rail.cubeList.add(new ModelBox(scope_rail, 0, 104, -2.0F, -3.3F, 0.0F, 2, 1, 38, 0.0F, false));
        scope_rail.cubeList.add(new ModelBox(scope_rail, 90, 95, -2.0F, -0.8F, 37.0F, 2, 1, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        scope_rail.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
