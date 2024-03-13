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
public final class Camera extends ModelBase implements IModernModel {

    private final ModelRenderer camara;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone_r1;
    private final ModelRenderer bone2_r1;

    public Camera() {
        textureWidth = 80;
        textureHeight = 80;

        camara = new ModelRenderer(this);
        camara.setRotationPoint(0.0F, 24.0F, 0.0F);
        camara.cubeList.add(new ModelBox(camara, 1, 6, 0.25F, -5.5F, -8.75F, 3, 4, 1, 0.5F, false));
        camara.cubeList.add(new ModelBox(camara, 42, 44, 0.75F, -4.35F, -7.75F, 2, 1, 7, 0.0F, false));
        camara.cubeList.add(new ModelBox(camara, 0, 0, 0.75F, -6.5F, -2.75F, 2, 2, 2, 0.2F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-3.2131F, 1.9147F, -0.8801F);
        camara.addChild(bone3_r1);
        setRotationAngle(bone3_r1, -0.4363F, -0.7854F, 0.0F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 30, 15, 1.2592F, -5.9377F, -11.7519F, 3, 1, 11, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 0, 0.2592F, -9.2126F, -11.75F, 5, 1, 11, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 20, 0, 4.5F, -9.42F, -12.201F, 1, 3, 12, -0.2F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 12, 1.75F, -9.8617F, -12.2F, 2, 1, 12, -0.2F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 29, 44, 3.97F, -8.65F, -11.7519F, 1, 3, 11, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 39, 1.2592F, -8.9377F, -11.752F, 3, 3, 10, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 16, 33, 0.58F, -8.65F, -11.7519F, 1, 3, 11, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 16, 16, 0.0F, -9.42F, -12.201F, 1, 3, 12, -0.2F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(2.2321F, 6.1805F, 1.7523F);
        camara.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.4233F, -0.7913F, -1.1475F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 44, 27, 5.7926F, -8.8467F, -11.75F, 1, 1, 11, 0.0F, false));
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 34, 0, 3.67F, -10.95F, -11.75F, 1, 1, 11, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(-13.7075F, -5.8122F, -6.2794F);
        camara.addChild(bone_r1);
        setRotationAngle(bone_r1, -0.8705F, 0.1058F, 1.0766F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 30, 30, 2.1111F, -13.2193F, -12.2F, 1, 2, 12, -0.2F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(8.6336F, 6.3724F, 8.0272F);
        camara.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.7572F, -0.4912F, -1.6909F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 25, 10.4241F, -14.764F, -12.2F, 1, 2, 12, -0.2F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        camara.render(scale);
    }
}
