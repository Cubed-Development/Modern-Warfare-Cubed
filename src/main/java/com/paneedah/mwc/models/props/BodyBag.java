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
public final class BodyBag extends ModelBase implements IModernModel {

    private final ModelRenderer bodybag;
    private final ModelRenderer bodybag10_r1;
    private final ModelRenderer bodybag9_r1;
    private final ModelRenderer bodybag8_r1;
    private final ModelRenderer bodybag7_r1;
    private final ModelRenderer bodybag6_r1;
    private final ModelRenderer bodybag5_r1;
    private final ModelRenderer bodybag4_r1;
    private final ModelRenderer bodybag3_r1;
    private final ModelRenderer bodybag2_r1;
    private final ModelRenderer bodybag1_r1;

    public BodyBag() {
        textureWidth = 256;
        textureHeight = 256;

        bodybag = new ModelRenderer(this);
        bodybag.setRotationPoint(-4.3106F, 25.0563F, 0.0F);
        bodybag.cubeList.add(new ModelBox(bodybag, 0, 0, -4.6894F, -2.0563F, -18.0F, 18, 1, 31, 0.0F, true));

        bodybag10_r1 = new ModelRenderer(this);
        bodybag.addChild(bodybag10_r1);
        setRotationAngle(bodybag10_r1, 0.0F, 0.0F, 0.5577F);
        bodybag10_r1.cubeList.add(new ModelBox(bodybag10_r1, 0, 0, -4.0F, -7.0F, 5.0F, 4, 6, 8, 0.0F, true));

        bodybag9_r1 = new ModelRenderer(this);
        bodybag9_r1.setRotationPoint(8.6213F, 0.0F, 0.0F);
        bodybag.addChild(bodybag9_r1);
        setRotationAngle(bodybag9_r1, 0.0F, 0.0F, -0.5577F);
        bodybag9_r1.cubeList.add(new ModelBox(bodybag9_r1, 0, 0, 0.0F, -7.0F, 5.0F, 4, 6, 8, 0.0F, true));

        bodybag8_r1 = new ModelRenderer(this);
        bodybag8_r1.setRotationPoint(4.3106F, -10.2586F, -3.3156F);
        bodybag.addChild(bodybag8_r1);
        setRotationAngle(bodybag8_r1, -1.2094F, 0.0F, 0.0F);
        bodybag8_r1.cubeList.add(new ModelBox(bodybag8_r1, 0, 0, -4.0F, -7.0F, 5.0F, 8, 8, 3, 0.0F, true));

        bodybag7_r1 = new ModelRenderer(this);
        bodybag7_r1.setRotationPoint(4.3106F, 0.8496F, -9.9006F);
        bodybag.addChild(bodybag7_r1);
        setRotationAngle(bodybag7_r1, -1.4742F, 0.0F, 0.0F);
        bodybag7_r1.cubeList.add(new ModelBox(bodybag7_r1, 0, 0, -4.0F, -4.5F, -6.0F, 8, 12, 4, 0.0F, true));

        bodybag6_r1 = new ModelRenderer(this);
        bodybag6_r1.setRotationPoint(-2.5772F, -0.2733F, 0.0F);
        bodybag.addChild(bodybag6_r1);
        setRotationAngle(bodybag6_r1, 0.0F, 0.0F, 1.2269F);
        bodybag6_r1.cubeList.add(new ModelBox(bodybag6_r1, 0, 0, -4.0F, -4.5F, -6.0F, 3, 5, 12, 0.0F, true));

        bodybag5_r1 = new ModelRenderer(this);
        bodybag5_r1.setRotationPoint(11.1985F, -0.2733F, 0.0F);
        bodybag.addChild(bodybag5_r1);
        setRotationAngle(bodybag5_r1, 0.0F, 0.0F, -1.2269F);
        bodybag5_r1.cubeList.add(new ModelBox(bodybag5_r1, 0, 0, 1.0F, -4.5F, -6.0F, 3, 5, 12, 0.0F, true));

        bodybag4_r1 = new ModelRenderer(this);
        bodybag4_r1.setRotationPoint(8.6929F, 0.9291F, 0.0F);
        bodybag.addChild(bodybag4_r1);
        setRotationAngle(bodybag4_r1, 0.0F, 0.0F, -1.0038F);
        bodybag4_r1.cubeList.add(new ModelBox(bodybag4_r1, 0, 0, 2.0F, -3.0F, -18.0F, 2, 4, 24, 0.0F, true));

        bodybag3_r1 = new ModelRenderer(this);
        bodybag3_r1.setRotationPoint(-0.0716F, 0.9291F, 0.0F);
        bodybag.addChild(bodybag3_r1);
        setRotationAngle(bodybag3_r1, 0.0F, 0.0F, 1.0038F);
        bodybag3_r1.cubeList.add(new ModelBox(bodybag3_r1, 0, 0, -4.0F, -3.0F, -18.0F, 2, 4, 24, 0.0F, true));

        bodybag2_r1 = new ModelRenderer(this);
        bodybag2_r1.setRotationPoint(4.3106F, -1.3623F, 0.2178F);
        bodybag.addChild(bodybag2_r1);
        setRotationAngle(bodybag2_r1, 0.0501F, 0.0F, 0.0F);
        bodybag2_r1.cubeList.add(new ModelBox(bodybag2_r1, 0, 0, -4.0F, -4.5F, -6.0F, 8, 4, 12, 0.0F, true));

        bodybag1_r1 = new ModelRenderer(this);
        bodybag1_r1.setRotationPoint(4.3106F, -1.1226F, 1.7829F);
        bodybag.addChild(bodybag1_r1);
        setRotationAngle(bodybag1_r1, 0.0744F, 0.0F, 0.0F);
        bodybag1_r1.cubeList.add(new ModelBox(bodybag1_r1, 0, 0, -4.0F, -7.0F, 5.0F, 8, 8, 8, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bodybag.render(scale);
    }
}
