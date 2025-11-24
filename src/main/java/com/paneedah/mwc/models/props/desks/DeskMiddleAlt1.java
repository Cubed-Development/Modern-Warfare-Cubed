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
public final class DeskMiddleAlt1 extends ModelBase implements IModernModel {

    private final ModelRenderer desk;

    public DeskMiddleAlt1() {
        textureWidth = 256;
        textureHeight = 256;

        desk = new ModelRenderer(this);
        desk.setRotationPoint(0.0F, 24.0F, 0.0F);
        desk.cubeList.add(new ModelBox(desk, 0, 0, -8.0F, -16.0F, 6.5F, 16, 15, 1, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 0, -8.0F, -16.0F, -6.5F, 16, 4, 13, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 50, -7.0F, -10.0F, -6.0F, 5, 10, 12, 0.0F, true));
        desk.cubeList.add(new ModelBox(desk, 0, 50, -6.5F, -8.0F, -6.1F, 4, 1, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        desk.render(scale);
    }
}
