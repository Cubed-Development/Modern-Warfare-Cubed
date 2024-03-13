package com.paneedah.mwc.models.props.shelves;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class ShelfTop extends ModelBase implements IModernModel {

    private final ModelRenderer shelf1;

    public ShelfTop() {
        textureWidth = 128;
        textureHeight = 128;

        shelf1 = new ModelRenderer(this);
        shelf1.setRotationPoint(-8.0F, 22.0F, -5.0F);
        shelf1.cubeList.add(new ModelBox(shelf1, 0, 0, 0.0F, 0.0F, 0.0F, 16, 2, 10, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        shelf1.render(scale);
    }
}
