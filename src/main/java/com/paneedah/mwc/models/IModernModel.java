package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelRenderer;

public interface IModernModel {

    default void setRotationAngle(final ModelRenderer modelRenderer, final float x, final float y, final float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
