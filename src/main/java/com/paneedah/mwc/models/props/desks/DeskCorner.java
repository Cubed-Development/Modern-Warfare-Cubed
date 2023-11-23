package com.paneedah.mwc.models.props.desks;

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
public final class DeskCorner extends ModelBase implements IModernModel {

    private final ModelRenderer desk;

    public DeskCorner() {
        textureWidth = 256;
        textureHeight = 256;

        desk = new ModelRenderer(this);
        desk.setRotationPoint(0.0F, 24.0F, 0.0F);
        desk.cubeList.add(new ModelBox(desk, 0, 0, -7.6F, -15.95F, 5.6F, 2, 16, 2, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 0, -7.0F, -16.0F, 6.5F, 15, 15, 1, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 0, -7.0F, -16.0F, -7.0F, 15, 4, 14, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 0, -7.5F, -16.0F, -7.0F, 1, 15, 14, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        desk.render(scale);
    }
}
