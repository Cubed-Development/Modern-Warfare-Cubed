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
public final class CeilingLampAlt extends ModelBase implements IModernModel {

    private final ModelRenderer light;
    private final ModelRenderer light7_r1;
    private final ModelRenderer light6_r1;
    private final ModelRenderer light5_r1;
    private final ModelRenderer light4_r1;
    private final ModelRenderer light3_r1;
    private final ModelRenderer light2_r1;

    public CeilingLampAlt() {
        textureWidth = 128;
        textureHeight = 128;

        light = new ModelRenderer(this);
        light.setRotationPoint(27.0208F, 24.0F, -7.1924F);
        light.cubeList.add(new ModelBox(light, 0, 0, -43.0208F, -10.0F, 3.6924F, 32, 2, 7, 0.0F, true));

        light7_r1 = new ModelRenderer(this);
        light7_r1.setRotationPoint(-2.8284F, 0.0F, -6.8284F);
        light.addChild(light7_r1);
        setRotationAngle(light7_r1, -3.1416F, -0.7854F, 3.1416F);
        light7_r1.cubeList.add(new ModelBox(light7_r1, 0, 40, 15.0F, -14.0F, -2.0F, 1, 4, 1, 0.0F, true));

        light6_r1 = new ModelRenderer(this);
        light6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        light.addChild(light6_r1);
        setRotationAngle(light6_r1, -3.1416F, -0.7854F, 3.1416F);
        light6_r1.cubeList.add(new ModelBox(light6_r1, 0, 40, 15.0F, -14.0F, 2.0F, 1, 4, 1, 0.0F, true));

        light5_r1 = new ModelRenderer(this);
        light5_r1.setRotationPoint(-32.8284F, 0.0F, -2.8284F);
        light.addChild(light5_r1);
        setRotationAngle(light5_r1, 0.0F, 0.7854F, 0.0F);
        light5_r1.cubeList.add(new ModelBox(light5_r1, 0, 40, -15.0F, -14.0F, 2.0F, 1, 4, 1, 0.0F, true));

        light4_r1 = new ModelRenderer(this);
        light4_r1.setRotationPoint(-30.0F, 0.0F, -4.0F);
        light.addChild(light4_r1);
        setRotationAngle(light4_r1, 0.0F, 0.7854F, 0.0F);
        light4_r1.cubeList.add(new ModelBox(light4_r1, 0, 40, -15.0F, -14.0F, -2.0F, 1, 4, 1, 0.0F, true));

        light3_r1 = new ModelRenderer(this);
        light3_r1.setRotationPoint(-27.0208F, -2.5503F, 12.3492F);
        light.addChild(light3_r1);
        setRotationAngle(light3_r1, 0.7854F, 0.0F, 0.0F);
        light3_r1.cubeList.add(new ModelBox(light3_r1, 0, 20, -15.0F, -7.5F, -0.5F, 30, 2, 2, 0.0F, true));

        light2_r1 = new ModelRenderer(this);
        light2_r1.setRotationPoint(-27.0208F, -3.9645F, 11.7635F);
        light.addChild(light2_r1);
        setRotationAngle(light2_r1, 0.7854F, 0.0F, 0.0F);
        light2_r1.cubeList.add(new ModelBox(light2_r1, 0, 20, -15.0F, -7.5F, -2.5F, 30, 2, 2, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        light.render(scale);
    }
}
