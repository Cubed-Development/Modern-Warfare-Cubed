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
public final class CrossGravestone2 extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer bone2;
    private final ModelRenderer bone3;
    private final ModelRenderer bb_main;

    public CrossGravestone2() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-5.5F, 24.0F, -3.5F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -1.0F, -3.0F, 0.0F, 13, 3, 7, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 10, 0.0F, -14.0F, 1.0F, 11, 11, 5, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 25, 27, 3.0F, -16.0F, 0.999F, 5, 2, 5, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 24, 34, 4.5F, -26.0F, 2.499F, 2, 12, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 27, 10, 2.0F, -23.5F, 2.5F, 7, 2, 2, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 26, 0.5F, -15.0F, 1.001F, 10, 1, 5, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(5.5F, -17.0F, 1.0F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, -1.9373F);
        bone2.cubeList.add(new ModelBox(bone2, 12, 32, -1.0F, -7.0F, 0.0F, 1, 7, 5, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(5.5F, -17.0F, 1.0F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, 1.9373F);
        bone3.cubeList.add(new ModelBox(bone3, 0, 32, 0.0F, -7.0F, 0.0F, 1, 7, 5, 0.0F, false));

        bb_main = new ModelRenderer(this);
        bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
        bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
