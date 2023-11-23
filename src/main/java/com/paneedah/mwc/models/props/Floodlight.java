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
public final class Floodlight extends ModelBase implements IModernModel {

    private final ModelRenderer bone5;
    private final ModelRenderer bone4;
    private final ModelRenderer bone_r1;
    private final ModelRenderer bone;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;

    public Floodlight() {
        textureWidth = 64;
        textureHeight = 64;

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(bone5, 0.0F, -0.3927F, 0.0F);

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone5.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 0, 40, -3.0F, -1.0F, 3.0F, 6, 1, 1, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 22, 0, -1.0F, -2.75F, -4.5F, 2, 2, 9, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 14, -1.0F, -3.25F, -4.5F, 2, 1, 9, -0.2F, false));
        bone4.cubeList.add(new ModelBox(bone4, 6, 46, -1.0F, -5.75F, -4.5F, 2, 3, 1, -0.2F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 46, -1.0F, -5.75F, 3.5F, 2, 3, 1, -0.2F, false));
        bone4.cubeList.add(new ModelBox(bone4, 36, 34, -3.0F, -1.0F, -4.0F, 6, 1, 1, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(2.2771F, -0.5524F, 0.0F);
        bone4.addChild(bone_r1);
        setRotationAngle(bone_r1, 0.0F, 0.0F, -0.3927F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 24, -2.25F, -9.0F, -3.5F, 1, 3, 7, 0.2F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 22, 14, -3.25F, -9.0F, -3.5F, 1, 3, 7, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 0, -1.25F, -10.0F, -4.5F, 2, 5, 9, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 12, 46, 0.193F, -9.9604F, -5.01F, 1, 4, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 33, 42, 0.1924F, -10.1F, -5.0F, 1, 1, 10, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 32, 40, -0.9625F, -11.4387F, -4.75F, 1, 5, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 24, 40, -0.9625F, -12.8529F, 0.3358F, 1, 1, 3, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 14, 40, -0.9625F, -12.8529F, -3.3358F, 1, 1, 4, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 16, 24, -0.9625F, -12.8529F, -2.5858F, 1, 1, 5, 0.1F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 33, 42, 0.1924F, -5.9604F, -5.0F, 1, 1, 10, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 16, 46, 0.193F, -9.9604F, 4.01F, 1, 4, 1, 0.0F, false));
        bone_r1.cubeList.add(new ModelBox(bone_r1, 36, 40, -0.9625F, -11.4387F, 3.75F, 1, 5, 1, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(2.2824F, -6.9115F, -7.6157F);
        bone5.addChild(bone);

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(bone3_r1);
        setRotationAngle(bone3_r1, -0.7854F, 0.0F, -0.3927F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 20, 46, -3.4009F, -7.9619F, -1.9092F, 1, 2, 1, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(2.4354F, 5.8795F, 17.8675F);
        bone.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.7854F, 0.0F, -0.3927F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 24, 46, -3.4009F, -14.3259F, 3.5452F, 1, 2, 1, 0.0F, false));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone5.render(scale);
    }
}
