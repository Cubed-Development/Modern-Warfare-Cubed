package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelRenderer;

public interface IModernModel {

    default void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
