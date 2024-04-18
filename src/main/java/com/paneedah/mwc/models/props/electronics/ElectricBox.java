package com.paneedah.mwc.models.props.electronics;

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
public final class ElectricBox extends ModelBase implements IModernModel {

    private final ModelRenderer ElectricBox;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public ElectricBox() {
        textureWidth = 128;
        textureHeight = 128;

        ElectricBox = new ModelRenderer(this);
        ElectricBox.setRotationPoint(0.0F, 24.0F, 0.0F);
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 18, 16, -5.0F, -24.0F, 4.0F, 10, 14, 4, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-4.9498F, 0.0F, 2.0503F);
        ElectricBox.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.7854F, 0.0F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 20, 34, -0.5F, -10.0F, 6.0F, 1, 13, 2, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(4.9498F, 0.0F, 2.0503F);
        ElectricBox.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.0F, -0.7854F, 0.0F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 49, -0.5F, -10.0F, 6.0F, 1, 13, 2, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(2.0528F, 0.0F, 7.8552F);
        ElectricBox.addChild(bone_r1);
        setRotationAngle(bone_r1, 3.1416F, 0.0F, -3.1416F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 24, 70, 4.3506F, -18.5F, 3.563F, 1, 3, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 74, -1.9864F, -11.5F, 3.444F, 1, 1, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 4, 74, -1.9864F, -23.5F, 3.444F, 1, 1, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 20, 0, -1.7722F, -24.01F, 3.2594F, 8, 14, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ElectricBox.render(scale);
    }
}
