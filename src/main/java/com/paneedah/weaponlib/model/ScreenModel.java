package com.paneedah.weaponlib.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;


public class ScreenModel extends ModelBase {
    private final ModelRenderer bone;

    public ScreenModel() {
        textureWidth = 6;
        textureHeight = 6;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0, 24, 0);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.5f, 3, 0, 6, 6, 0, 0, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {


        bone.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
