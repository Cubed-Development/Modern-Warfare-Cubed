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
public final class CautionSign extends ModelBase implements IModernModel {

    private final ModelRenderer caution;
    private final ModelRenderer Caution9_r1;
    private final ModelRenderer Caution8_r1;
    private final ModelRenderer Caution1_r1;
    private final ModelRenderer Caution10_r1;

    public CautionSign() {
        textureWidth = 128;
        textureHeight = 128;

        caution = new ModelRenderer(this);
        caution.setRotationPoint(0.0F, 23.4912F, -5.543F);

        Caution9_r1 = new ModelRenderer(this);
        Caution9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        caution.addChild(Caution9_r1);
        setRotationAngle(Caution9_r1, -0.2231F, 0.0F, 0.0F);
        Caution9_r1.cubeList.add(new ModelBox(Caution9_r1, 0, 50, -2.5F, -16.0F, -0.6F, 5, 5, 1, 0.0F, true));
        Caution9_r1.cubeList.add(new ModelBox(Caution9_r1, 0, 0, -2.0F, -19.0F, -0.5F, 4, 16, 1, 0.0F, true));
        Caution9_r1.cubeList.add(new ModelBox(Caution9_r1, 0, 0, -2.0F, -25.0F, -0.5F, 4, 2, 1, 0.0F, true));
        Caution9_r1.cubeList.add(new ModelBox(Caution9_r1, 0, 0, 2.0F, -25.0F, -0.5F, 3, 26, 1, 0.0F, true));

        Caution8_r1 = new ModelRenderer(this);
        Caution8_r1.setRotationPoint(0.0F, 0.0F, 11.0861F);
        caution.addChild(Caution8_r1);
        setRotationAngle(Caution8_r1, 0.2231F, 0.0F, 0.0F);
        Caution8_r1.cubeList.add(new ModelBox(Caution8_r1, 0, 0, -2.0F, -19.0F, -0.5F, 4, 16, 1, 0.0F, true));
        Caution8_r1.cubeList.add(new ModelBox(Caution8_r1, 0, 0, -2.0F, -25.0F, -0.5F, 4, 2, 1, 0.0F, true));
        Caution8_r1.cubeList.add(new ModelBox(Caution8_r1, 0, 0, 2.0F, -25.0F, -0.5F, 3, 26, 1, 0.0F, true));
        Caution8_r1.cubeList.add(new ModelBox(Caution8_r1, 0, 0, -5.0F, -25.0F, -0.5F, 3, 26, 1, 0.0F, true));

        Caution1_r1 = new ModelRenderer(this);
        Caution1_r1.setRotationPoint(0.0F, -0.0858F, 0.2336F);
        caution.addChild(Caution1_r1);
        setRotationAngle(Caution1_r1, -0.2231F, 0.0F, 0.0F);
        Caution1_r1.cubeList.add(new ModelBox(Caution1_r1, 0, 0, -5.0F, -25.0F, -0.5F, 3, 26, 1, 0.0F, true));

        Caution10_r1 = new ModelRenderer(this);
        Caution10_r1.setRotationPoint(0.0F, -0.2212F, 11.0613F);
        caution.addChild(Caution10_r1);
        setRotationAngle(Caution10_r1, 0.2231F, 0.0F, 0.0F);
        Caution10_r1.cubeList.add(new ModelBox(Caution10_r1, 0, 50, -2.5F, -16.0F, -0.4F, 5, 5, 1, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        caution.render(scale);
    }
}
