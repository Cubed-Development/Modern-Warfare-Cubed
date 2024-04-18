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
public final class OfficeChair extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer chair7_r1;
    private final ModelRenderer chair6_r1;
    private final ModelRenderer chair5_r1;
    private final ModelRenderer chair4_r1;
    private final ModelRenderer chair2_r1;
    private final ModelRenderer chair1_r1;
    private final ModelRenderer chair12_r1;

    public OfficeChair() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 50, -1.0F, -8.0F, -1.5F, 2, 6, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 4.0F, -2.0F, -6.0F, 2, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -2.0F, -6.0F, 2, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 4.0F, -2.0F, 3.5F, 2, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -2.0F, 3.5F, 2, 2, 2, 0.0F, true));

        chair7_r1 = new ModelRenderer(this);
        chair7_r1.setRotationPoint(0.0F, 0.2324F, -0.7526F);
        bone.addChild(chair7_r1);
        setRotationAngle(chair7_r1, -0.0744F, 0.0F, 0.0F);
        chair7_r1.cubeList.add(new ModelBox(chair7_r1, 0, 0, -5.0F, -10.0F, -3.5F, 10, 2, 8, 0.0F, true));

        chair6_r1 = new ModelRenderer(this);
        chair6_r1.setRotationPoint(0.0F, -1.238F, -2.6811F);
        bone.addChild(chair6_r1);
        setRotationAngle(chair6_r1, -0.1859F, 0.0F, 0.0F);
        chair6_r1.cubeList.add(new ModelBox(chair6_r1, 0, 50, -1.0F, -15.0F, 5.3F, 2, 8, 1, 0.0F, true));

        chair5_r1 = new ModelRenderer(this);
        chair5_r1.setRotationPoint(-2.1924F, 0.0F, -6.7071F);
        bone.addChild(chair5_r1);
        setRotationAngle(chair5_r1, 0.0F, -0.7854F, 0.0F);
        chair5_r1.cubeList.add(new ModelBox(chair5_r1, 0, 50, 5.0F, -2.5F, -4.5F, 2, 1, 15, 0.0F, true));

        chair4_r1 = new ModelRenderer(this);
        chair4_r1.setRotationPoint(2.1924F, 0.0F, -6.7071F);
        bone.addChild(chair4_r1);
        setRotationAngle(chair4_r1, 0.0F, 0.7854F, 0.0F);
        chair4_r1.cubeList.add(new ModelBox(chair4_r1, 0, 50, -7.0F, -2.5F, -4.5F, 2, 1, 15, 0.0F, true));

        chair2_r1 = new ModelRenderer(this);
        chair2_r1.setRotationPoint(0.0F, -4.2913F, -12.4253F);
        bone.addChild(chair2_r1);
        setRotationAngle(chair2_r1, -1.3384F, 0.0F, 0.0F);
        chair2_r1.cubeList.add(new ModelBox(chair2_r1, 0, 0, -4.5F, -10.0F, -3.5F, 9, 2, 2, 0.0F, true));

        chair1_r1 = new ModelRenderer(this);
        chair1_r1.setRotationPoint(0.0F, -0.1776F, -0.5544F);
        bone.addChild(chair1_r1);
        setRotationAngle(chair1_r1, -0.0372F, 0.0F, 0.0F);
        chair1_r1.cubeList.add(new ModelBox(chair1_r1, 0, 0, -4.0F, -16.0F, 4.5F, 8, 5, 1, 0.0F, true));

        chair12_r1 = new ModelRenderer(this);
        chair12_r1.setRotationPoint(0.0F, -5.2978F, 17.3524F);
        bone.addChild(chair12_r1);
        setRotationAngle(chair12_r1, 1.1525F, 0.0F, 0.0F);
        chair12_r1.cubeList.add(new ModelBox(chair12_r1, 0, 0, -3.5F, -16.0F, 4.6F, 7, 1, 3, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
