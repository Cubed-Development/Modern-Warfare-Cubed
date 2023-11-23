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
public final class FilingCabinet extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer cabinet3_r1;
    private final ModelRenderer cabinet5_r1;

    public FilingCabinet() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5F, -16.0F, -6.5F, 13, 16, 14, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -8.0F, -6.7F, 11, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -14.5F, -6.7F, 11, 6, 1, 0.0F, true));

        cabinet3_r1 = new ModelRenderer(this);
        cabinet3_r1.setRotationPoint(0.0F, -1.1478F, 0.8084F);
        bone.addChild(cabinet3_r1);
        setRotationAngle(cabinet3_r1, 0.1487F, 0.0F, 0.0F);
        cabinet3_r1.cubeList.add(new ModelBox(cabinet3_r1, 0, 0, -2.5F, -6.0F, -7.3F, 5, 2, 1, 0.0F, true));

        cabinet5_r1 = new ModelRenderer(this);
        cabinet5_r1.setRotationPoint(0.0F, -0.2649F, 3.556F);
        bone.addChild(cabinet5_r1);
        setRotationAngle(cabinet5_r1, 0.1487F, 0.0F, 0.0F);
        cabinet5_r1.cubeList.add(new ModelBox(cabinet5_r1, 0, 0, -2.5F, -12.5F, -7.3F, 5, 2, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
