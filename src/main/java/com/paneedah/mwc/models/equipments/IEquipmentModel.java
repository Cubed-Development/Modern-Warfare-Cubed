package com.paneedah.mwc.models.equipments;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;

public interface IEquipmentModel {

    default void hideBiped(ModelBiped modelBiped, ModelRenderer body) {
        modelBiped.setVisible(false);

        modelBiped.bipedBody = body;
    }
}
