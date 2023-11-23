package com.paneedah.mwc.models.props.desks;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class DeskLeft extends ModelBase implements IModernModel {

    private final ModelRenderer deskleft;

    public DeskLeft() {
        textureWidth = 256;
        textureHeight = 256;

        deskleft = new ModelRenderer(this);
        deskleft.setRotationPoint(0.0F, 24.0F, 0.0F);
        deskleft.cubeList.add(new ModelBox(deskleft, 0, 0, -8.0F, -15.95F, 5.6F, 2, 16, 2, 0.0F, true));
        deskleft.cubeList.add(new ModelBox(deskleft, 0, 0, -7.0F, -16.0F, 6.5F, 15, 15, 1, 0.0F, true));
        deskleft.cubeList.add(new ModelBox(deskleft, 0, 0, -7.9F, -16.0F, -6.5F, 1, 15, 14, 0.0F, true));
        deskleft.cubeList.add(new ModelBox(deskleft, 0, 0, -7.0F, -16.0F, -6.5F, 15, 4, 13, 0.0F, true));
        deskleft.cubeList.add(new ModelBox(deskleft, 0, 0, -8.0F, -15.95F, -6.6F, 2, 16, 2, 0.0F, true));
        deskleft.cubeList.add(new ModelBox(deskleft, 0, 0, -5.0F, -15.0F, -6.6F, 12, 2, 1, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        deskleft.render(scale);
    }
}
