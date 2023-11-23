package com.paneedah.mwc.models.props;

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
public final class DeskMiddle extends ModelBase implements IModernModel {

    private final ModelRenderer desk;

    public DeskMiddle() {
        textureWidth = 256;
        textureHeight = 256;

        desk = new ModelRenderer(this);
        desk.setRotationPoint(0.0F, 24.0F, 0.0F);
        desk.cubeList.add(new ModelBox(desk, 0, 0, -8.0F, -16.0F, 6.5F, 16, 15, 1, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 0, -8.0F, -16.0F, -6.5F, 16, 4, 13, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 0, -6.0F, -15.0F, -6.6F, 12, 2, 1, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        desk.render(scale);
    }
}
