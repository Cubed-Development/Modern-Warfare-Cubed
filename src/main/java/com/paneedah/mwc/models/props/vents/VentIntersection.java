package com.paneedah.mwc.models.props.vents;

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
public final class VentIntersection extends ModelBase implements IModernModel {

    private final ModelRenderer bone;

    public VentIntersection() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -15.0F, -7.0F, 1, 14, 14, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -15.0F, -8.0F, 14, 14, 16, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
