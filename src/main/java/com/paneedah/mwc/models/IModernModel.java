package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public interface IModernModel {

    default void hideBiped(ModelBiped modelBiped, ModelRenderer body) {
        modelBiped.setVisible(false);

        modelBiped.bipedBody = body;
    }

    default void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
