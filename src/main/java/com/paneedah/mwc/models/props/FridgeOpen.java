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
public final class FridgeOpen extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public FridgeOpen() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 4, 99, 4.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 4, 102, 4.0F, -1.0F, -6.5F, 2, 1, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 46, -3.0F, -33.0353F, -7.5F, 6, 2, 15, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 96, 42, 6.0F, -32.0F, -7.5F, 1, 31, 15, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 75, 6, -6.0F, -32.0F, 6.5F, 12, 31, 1, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 2, 111, -6.0F, -7.0F, -5.5F, 12, 5, 12, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 54, 103, -6.0F, -8.0F, -6.5F, 12, 1, 13, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 54, 103, -6.0F, -14.0F, -6.5F, 12, 1, 13, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 54, 103, -6.0F, -21.0F, -7.5F, 12, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 54, 103, -6.0F, -2.0F, -7.5F, 12, 1, 14, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -32.0F, -7.5F, 1, 31, 15, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 4, 105, -6.0F, -1.0F, -6.5F, 2, 1, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 12, 99, -6.0F, -1.0F, 4.5F, 2, 1, 2, 0.0F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(-11.7924F, 0.0F, -13.1582F);
        bone.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.0F, -1.2217F, 0.0F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 100, 94, 0.6897F, -10.5F, -14.0F, 10, 2, 2, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 100, 94, 0.6897F, -16.5F, -14.0F, 10, 2, 2, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 0, 80, -0.25F, -20.0F, -15.0F, 12, 18, 1, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 52, 80, 0.75F, -19.0F, -16.0F, 1, 16, 1, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-5.5335F, 0.0F, -1.3487F);
        bone.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, -0.5236F, 0.0F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 26, 80, -5.0245F, -31.0F, -11.2745F, 12, 10, 1, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 99, -4.0245F, -30.0F, -12.2745F, 1, 8, 1, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(-8.6705F, -1.1415F, 0.0F);
        bone.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.0F, 0.0F, 0.2618F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 38, 46, 3.0F, -33.8628F, -7.5F, 4, 2, 15, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(8.6705F, -1.1415F, 0.0F);
        bone.addChild(bone_r1);
        setRotationAngle(bone_r1, 0.0F, 0.0F, -0.2618F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 63, -7.0F, -33.8628F, -7.5F, 4, 2, 15, 0.0F, false));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
    }
}
