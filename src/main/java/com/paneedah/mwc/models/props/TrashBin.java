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
public final class TrashBin extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer trashbin12_r1;
    private final ModelRenderer trashbin9_r1;
    private final ModelRenderer trashbin8_r1;
    private final ModelRenderer trashbin6_r1;

    public TrashBin() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 20.1678F, 11.0977F);
        setRotationAngle(bone, 0.0F, 3.1416F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -6.0F, -12.1678F, 8.9023F, 12, 16, 8, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -12.1678F, 9.9023F, 14, 16, 6, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -16.1678F, 11.9023F, 4, 4, 4, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 1.5F, -16.1678F, 11.9023F, 4, 4, 4, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -6.5F, -14.1678F, 10.9023F, 13, 2, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.5F, -15.1678F, 15.4023F, 11, 3, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -15.8678F, 11.7023F, 4, 4, 4, 0.0F, true));

        trashbin12_r1 = new ModelRenderer(this);
        bone.addChild(trashbin12_r1);
        setRotationAngle(trashbin12_r1, -0.5949F, 0.0F, 0.0F);
        trashbin12_r1.cubeList.add(new ModelBox(trashbin12_r1, 0, 0, -2.0F, -19.7F, 0.8F, 4, 5, 4, 0.0F, true));

        trashbin9_r1 = new ModelRenderer(this);
        trashbin9_r1.setRotationPoint(14.7231F, -11.5551F, 10.9023F);
        bone.addChild(trashbin9_r1);
        setRotationAngle(trashbin9_r1, 0.0F, 0.0F, -1.0782F);
        trashbin9_r1.cubeList.add(new ModelBox(trashbin9_r1, 0, 0, -7.5F, -20.0F, 1.0F, 2, 1, 4, 0.0F, true));

        trashbin8_r1 = new ModelRenderer(this);
        trashbin8_r1.setRotationPoint(-14.7231F, -11.5552F, 10.9023F);
        bone.addChild(trashbin8_r1);
        setRotationAngle(trashbin8_r1, 0.0F, 0.0F, 1.0782F);
        trashbin8_r1.cubeList.add(new ModelBox(trashbin8_r1, 0, 0, 5.5F, -20.0F, 1.0F, 2, 1, 4, 0.0F, true));

        trashbin6_r1 = new ModelRenderer(this);
        trashbin6_r1.setRotationPoint(0.0F, -0.622F, -0.7203F);
        bone.addChild(trashbin6_r1);
        setRotationAngle(trashbin6_r1, -0.632F, 0.0F, 0.0F);
        trashbin6_r1.cubeList.add(new ModelBox(trashbin6_r1, 0, 0, 1.5F, -20.0F, 1.0F, 4, 5, 3, 0.0F, true));
        trashbin6_r1.cubeList.add(new ModelBox(trashbin6_r1, 0, 0, -5.5F, -20.0F, 1.0F, 4, 5, 3, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
