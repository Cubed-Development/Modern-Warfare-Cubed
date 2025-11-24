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
public final class BodyImpaled extends ModelBase implements IModernModel {

    private final ModelRenderer body;
    private final ModelRenderer rightleg_r1;
    private final ModelRenderer leftarm_r1;
    private final ModelRenderer rightarm_r1;
    private final ModelRenderer body_r1;
    private final ModelRenderer head_r1;
    private final ModelRenderer leftleg_r1;
    private final ModelRenderer bar;

    public BodyImpaled() {
        textureWidth = 128;
        textureHeight = 128;

        body = new ModelRenderer(this);
        body.setRotationPoint(-3.3558F, 24.048F, 0.0F);

        rightleg_r1 = new ModelRenderer(this);
        body.addChild(rightleg_r1);
        setRotationAngle(rightleg_r1, 0.0F, 0.0F, 0.1487F);
        rightleg_r1.cubeList.add(new ModelBox(rightleg_r1, 0, 16, -4.0F, -22.5F, -7.0F, 4, 12, 4, 0.0F, true));

        leftarm_r1 = new ModelRenderer(this);
        leftarm_r1.setRotationPoint(3.3558F, -0.6745F, 5.7209F);
        body.addChild(leftarm_r1);
        setRotationAngle(leftarm_r1, 0.1859F, 0.0F, 0.0F);
        leftarm_r1.cubeList.add(new ModelBox(leftarm_r1, 40, 16, 4.0F, -33.0F, -2.5F, 4, 12, 4, 0.0F, true));

        rightarm_r1 = new ModelRenderer(this);
        rightarm_r1.setRotationPoint(-0.1257F, 0.3159F, 0.0F);
        body.addChild(rightarm_r1);
        setRotationAngle(rightarm_r1, 0.0F, 0.0F, 0.1115F);
        rightarm_r1.cubeList.add(new ModelBox(rightarm_r1, 40, 16, -8.0F, -33.0F, -2.5F, 4, 12, 4, 0.0F, true));

        body_r1 = new ModelRenderer(this);
        body_r1.setRotationPoint(3.3558F, -3.2781F, -14.2392F);
        body.addChild(body_r1);
        setRotationAngle(body_r1, -0.4461F, 0.0F, 0.0F);
        body_r1.cubeList.add(new ModelBox(body_r1, 16, 16, -4.0F, -33.0F, -2.0F, 8, 12, 4, 0.0F, true));

        head_r1 = new ModelRenderer(this);
        head_r1.setRotationPoint(3.3558F, -14.3019F, -27.1585F);
        body.addChild(head_r1);
        setRotationAngle(head_r1, -0.9666F, 0.0F, 0.0F);
        head_r1.cubeList.add(new ModelBox(head_r1, 0, 0, -4.0F, -41.0F, -4.0F, 8, 8, 8, 0.0F, true));

        leftleg_r1 = new ModelRenderer(this);
        leftleg_r1.setRotationPoint(3.3558F, -0.4816F, 1.6577F);
        body.addChild(leftleg_r1);
        setRotationAngle(leftleg_r1, 0.0744F, 0.0F, 0.0F);
        leftleg_r1.cubeList.add(new ModelBox(leftleg_r1, 0, 16, 0.0F, -22.5F, -7.0F, 4, 12, 4, 0.0F, true));

        bar = new ModelRenderer(this);
        bar.setRotationPoint(3.0F, -25.0F, -6.0F);
        setRotationAngle(bar, 0.1859F, 0.0F, 0.0F);
        bar.cubeList.add(new ModelBox(bar, 0, 36, -4.0F, 0.0F, -2.0F, 2, 50, 2, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        body.render(scale);
        bar.render(scale);
    }
}
