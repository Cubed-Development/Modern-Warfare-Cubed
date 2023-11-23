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
public final class CeilingLamp extends ModelBase implements IModernModel {

    private final ModelRenderer light;
    private final ModelRenderer light3_r1;
    private final ModelRenderer light2_r1;
    private final ModelRenderer light4_r1;

    public CeilingLamp() {
        textureWidth = 128;
        textureHeight = 128;

        light = new ModelRenderer(this);
        light.setRotationPoint(0.0F, 20.5234F, 4.1933F);
        light.cubeList.add(new ModelBox(light, 0, 0, -8.0F, -6.5234F, -5.6933F, 16, 3, 3, 0.0F, true));

        light3_r1 = new ModelRenderer(this);
        light.addChild(light3_r1);
        setRotationAngle(light3_r1, 0.7854F, 0.0F, 0.0F);
        light3_r1.cubeList.add(new ModelBox(light3_r1, 0, 20, -0.5F, -6.8F, -2.1F, 1, 3, 3, 0.0F, true));

        light2_r1 = new ModelRenderer(this);
        light2_r1.setRotationPoint(0.0F, 0.5828F, -0.0071F);
        light.addChild(light2_r1);
        setRotationAngle(light2_r1, 0.7854F, 0.0F, 0.0F);
        light2_r1.cubeList.add(new ModelBox(light2_r1, 0, 60, -8.0F, -6.5F, -1.4F, 16, 2, 2, 0.0F, true));

        light4_r1 = new ModelRenderer(this);
        light4_r1.setRotationPoint(0.0F, 3.4766F, -4.1933F);
        light.addChild(light4_r1);
        setRotationAngle(light4_r1, 0.0F, 0.7854F, 0.0F);
        light4_r1.cubeList.add(new ModelBox(light4_r1, 0, 20, -0.7F, -45.0F, 0.0F, 1, 35, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        light.render(scale);
    }
}
