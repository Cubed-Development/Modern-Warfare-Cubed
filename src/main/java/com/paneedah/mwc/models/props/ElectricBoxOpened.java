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
public final class ElectricBoxOpened extends ModelBase implements IModernModel {

    private final ModelRenderer ElectricBox;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public ElectricBoxOpened() {
        textureWidth = 128;
        textureHeight = 128;

        ElectricBox = new ModelRenderer(this);
        ElectricBox.setRotationPoint(-1.2552F, 24.0F, 1.9697F);
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 18, 16, -3.7448F, -24.0F, 2.0303F, 1, 14, 4, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 28, 16, 5.2552F, -24.0F, 2.0303F, 1, 14, 4, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 0, 0, -2.7448F, -24.0F, 4.0303F, 8, 14, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 0, 16, -2.2448F, -22.5F, 3.7803F, 7, 11, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 20, 67, -1.9948F, -12.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 40, 64, -1.9948F, -14.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 20, 64, -1.9948F, -16.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 0, 64, -1.9948F, -18.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 6, 52, -1.9948F, -20.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 10, 67, 1.5052F, -12.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 0, 67, 1.5052F, -14.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 30, 64, 1.5052F, -16.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 10, 64, 1.5052F, -18.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 6, 55, 1.5052F, -20.75F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 6, 49, -0.2448F, -22.25F, 3.5303F, 3, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 0, 37, -2.7448F, -24.0F, 2.0303F, 8, 1, 2, 0.0F, false));
        ElectricBox.cubeList.add(new ModelBox(ElectricBox, 0, 34, -2.7448F, -11.0F, 2.0303F, 8, 1, 2, 0.0F, false));

        bone5_r1 = new ModelRenderer(this);
        ElectricBox.addChild(bone5_r1);
        setRotationAngle(bone5_r1, 0.0F, 0.7854F, 0.0F);
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 6, 70, -1.6945F, -16.75F, 4.1517F, 2, 1, 1, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 36, 67, -4.1694F, -12.75F, 1.6768F, 2, 1, 1, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 30, 67, -4.1694F, -20.75F, 1.6768F, 2, 1, 1, 0.0F, false));
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 0, 72, -1.6945F, -18.75F, 4.1517F, 2, 1, 1, 0.0F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(5.6569F, 0.0F, -1.5962F);
        ElectricBox.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.0F, -0.7854F, 0.0F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 18, 70, 0.9571F, -12.75F, 4.8536F, 2, 1, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 0, 70, 0.9571F, -14.75F, 4.8536F, 2, 1, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 42, 67, 0.9571F, -20.75F, 4.8536F, 2, 1, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 12, 72, -1.5178F, -14.75F, 7.3284F, 2, 1, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 12, 70, -1.5178F, -16.75F, 7.3284F, 2, 1, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 6, 72, -1.5178F, -18.75F, 7.3284F, 2, 1, 1, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-3.6946F, 0.0F, 0.0806F);
        ElectricBox.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.7854F, 0.0F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 20, 34, -0.5F, -10.0F, 6.0F, 1, 13, 2, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(6.205F, 0.0F, 0.0806F);
        ElectricBox.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.0F, -0.7854F, 0.0F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 49, -0.5F, -10.0F, 6.0F, 1, 13, 2, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(-2.1391F, 0.0F, -7.4904F);
        ElectricBox.addChild(bone_r1);
        setRotationAngle(bone_r1, 0.0F, 0.9599F, 0.0F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 20, 0, -3.7722F, -24.0F, 11.5093F, 8, 14, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 4, 74, -3.9864F, -23.5F, 11.6939F, 1, 1, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 74, -3.9864F, -11.5F, 11.6939F, 1, 1, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 24, 70, 2.3506F, -18.5F, 11.813F, 1, 3, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ElectricBox.render(scale);
    }
}
