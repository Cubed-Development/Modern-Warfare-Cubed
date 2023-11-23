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
public final class FilingCabinetOpened extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer cabinet5_r1;
    private final ModelRenderer cabinet3_r1;
    private final ModelRenderer cabinet7_r1;

    public FilingCabinetOpened() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5F, -16.0F, -6.5F, 13, 16, 14, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -8.0F, -6.7F, 11, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -14.5F, -10.7F, 11, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -5.0F, -13.0F, -9.7F, 10, 4, 4, 0.0F, true));

        cabinet5_r1 = new ModelRenderer(this);
        cabinet5_r1.setRotationPoint(0.0F, -1.8123F, 1.7274F);
        bone.addChild(cabinet5_r1);
        setRotationAngle(cabinet5_r1, 0.1487F, 0.0F, 0.0F);
        cabinet5_r1.cubeList.add(new ModelBox(cabinet5_r1, 0, 0, -2.5F, -12.5F, -11.3F, 5, 2, 1, 0.0F, true));

        cabinet3_r1 = new ModelRenderer(this);
        cabinet3_r1.setRotationPoint(0.0F, -1.1478F, 0.8084F);
        bone.addChild(cabinet3_r1);
        setRotationAngle(cabinet3_r1, 0.1487F, 0.0F, 0.0F);
        cabinet3_r1.cubeList.add(new ModelBox(cabinet3_r1, 0, 0, -2.5F, -6.0F, -7.3F, 5, 2, 1, 0.0F, true));

        cabinet7_r1 = new ModelRenderer(this);
        cabinet7_r1.setRotationPoint(0.0F, 0.9951F, -1.574F);
        bone.addChild(cabinet7_r1);
        setRotationAngle(cabinet7_r1, -0.1115F, 0.0F, 0.0F);
        cabinet7_r1.cubeList.add(new ModelBox(cabinet7_r1, 0, 100, -4.5F, -13.6F, -9.7F, 9, 1, 4, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
    }
}
