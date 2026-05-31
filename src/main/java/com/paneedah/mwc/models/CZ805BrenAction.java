package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class CZ805BrenAction extends ModelWithAttachments {

    private final ModelRenderer action;
    private final ModelRenderer cube_r67;

    public CZ805BrenAction() {
        textureWidth = 220;
        textureHeight = 220;

        action = new ModelRenderer(this);
        action.setRotationPoint(-3, -10.75F, -23);
        action.cubeList.add(new ModelBox(action, 27, 0, 0, -2, 0, 1, 2, 12, -0.001F, false));
        action.cubeList.add(new ModelBox(action, 134, 164, 0.2F, -4.8F, -6, 1, 2, 17, -0.001F, false));
        action.cubeList.add(new ModelBox(action, 98, 163, 1.8F, -4.8F, -6, 1, 2, 17, -0.001F, false));
        action.cubeList.add(new ModelBox(action, 83, 77, 2.8F, -4.25F, -6, 2, 1, 1, -0.001F, false));
        action.cubeList.add(new ModelBox(action, 47, 81, 3.8F, -4.25F, -6, 2, 1, 1, 0.1F, false));

        cube_r67 = new ModelRenderer(this);
        cube_r67.setRotationPoint(5.9F, -3.25F, -6);
        action.addChild(cube_r67);
        setRotationAngle(cube_r67, 0, -0.3316F, 0);
        cube_r67.cubeList.add(new ModelBox(cube_r67, 77, 2, -1, -1, 0, 1, 1, 1, 0.101F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
//		upperreceiver.renderer(f5);
//		grip.renderer(f5);
        action.render(f5);
//		stock.renderer(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
