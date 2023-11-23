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
public final class WhiteDeskMiddle extends ModelBase implements IModernModel {

    private final ModelRenderer desk1;

    public WhiteDeskMiddle() {
        textureWidth = 128;
        textureHeight = 128;

        desk1 = new ModelRenderer(this);
        desk1.setRotationPoint(-8.0F, 8.0F, -5.0F);
        desk1.cubeList.add(new ModelBox(desk1, 0, 0, 0.0F, 0.0F, 0.0F, 16, 2, 13, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        desk1.render(scale);
    }
}
