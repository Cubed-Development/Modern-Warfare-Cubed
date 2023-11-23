package com.paneedah.mwc.models.props.servers;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class ServerRackRightAlt extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer rack37_r1;
    private final ModelRenderer rack36_r1;
    private final ModelRenderer rack35_r1;
    private final ModelRenderer rack30_r1;
    private final ModelRenderer rack24_r1;
    private final ModelRenderer rack14_r1;

    public ServerRackRightAlt() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 16.4832F, 1.3658F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, 3.5168F, -7.3658F, 16, 2, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -8.4832F, -7.4658F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -8.4832F, 3.7342F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 7.1F, -8.4832F, -5.4658F, 1, 15, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.8F, 1.5168F, -5.3658F, 15, 2, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.8F, -1.4832F, -5.3658F, 15, 2, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.8F, -4.4832F, -5.3658F, 15, 2, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.8F, -7.4832F, -5.3658F, 15, 2, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -7.9F, -5.4832F, -5.6658F, 15, 1, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -7.9F, -2.4832F, -5.6658F, 15, 1, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -7.9F, 0.5168F, -5.6658F, 15, 1, 10, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, -7.5F, -6.9832F, -5.5658F, 3, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, -3.5F, -6.9832F, -5.5658F, 3, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 40, -6.5F, -3.9832F, -6.1658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 40, -4.5F, -3.9832F, -6.1658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 40, -2.5F, -3.9832F, -6.1658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 40, -0.5F, -3.9832F, -6.1658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 60, -7.5F, -0.9832F, -5.5658F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 60, -4.5F, -0.9832F, -5.5658F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 60, -1.5F, -0.9832F, -5.5658F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 60, 1.5F, -0.9832F, -5.5658F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 60, 4.5F, -0.9832F, -5.5658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 80, -1.1F, 1.3168F, -5.5658F, 6, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 80, -1.1F, 2.8168F, -5.5658F, 6, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 100, -7.0F, 0.6168F, -6.9658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 100, -1.0F, 0.6168F, -6.9658F, 1, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 220, 100, 2.0F, 0.6168F, -6.9658F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 220, 100, -4.0F, 0.6168F, -6.9658F, 1, 1, 1, 0.0F, true));

        rack37_r1 = new ModelRenderer(this);
        rack37_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(rack37_r1);
        setRotationAngle(rack37_r1, 1.0782F, 0.0F, 0.0F);
        rack37_r1.cubeList.add(new ModelBox(rack37_r1, 200, 100, -1.0F, -4.9F, -5.6F, 1, 2, 1, 0.0F, true));

        rack36_r1 = new ModelRenderer(this);
        rack36_r1.setRotationPoint(0.0F, -1.6661F, 0.4768F);
        bone.addChild(rack36_r1);
        setRotationAngle(rack36_r1, 1.2269F, 0.0F, 0.0F);
        rack36_r1.cubeList.add(new ModelBox(rack36_r1, 220, 100, 2.0F, -5.9F, -5.6F, 1, 2, 1, 0.0F, true));

        rack35_r1 = new ModelRenderer(this);
        rack35_r1.setRotationPoint(0.0F, 1.5643F, 1.1685F);
        bone.addChild(rack35_r1);
        setRotationAngle(rack35_r1, 0.8179F, 0.0F, 0.0F);
        rack35_r1.cubeList.add(new ModelBox(rack35_r1, 220, 100, -4.0F, -5.9F, -5.6F, 1, 2, 1, 0.0F, true));
        rack35_r1.cubeList.add(new ModelBox(rack35_r1, 200, 100, -7.0F, -5.9F, -5.6F, 1, 2, 1, 0.0F, true));

        rack30_r1 = new ModelRenderer(this);
        rack30_r1.setRotationPoint(0.0F, 8.069F, -8.4238F);
        bone.addChild(rack30_r1);
        setRotationAngle(rack30_r1, -0.7808F, 0.0F, 0.0F);
        rack30_r1.cubeList.add(new ModelBox(rack30_r1, 220, 100, -4.0F, -8.3F, -4.2F, 1, 2, 1, 0.0F, true));
        rack30_r1.cubeList.add(new ModelBox(rack30_r1, 220, 100, 2.0F, -8.3F, -4.2F, 1, 2, 1, 0.0F, true));
        rack30_r1.cubeList.add(new ModelBox(rack30_r1, 200, 100, -1.0F, -8.3F, -4.2F, 1, 2, 1, 0.0F, true));
        rack30_r1.cubeList.add(new ModelBox(rack30_r1, 200, 100, -7.0F, -8.3F, -4.2F, 1, 2, 1, 0.0F, true));

        rack24_r1 = new ModelRenderer(this);
        rack24_r1.setRotationPoint(0.0F, 8.0784F, -2.2271F);
        bone.addChild(rack24_r1);
        setRotationAngle(rack24_r1, -0.1487F, 0.0F, 0.0F);
        rack24_r1.cubeList.add(new ModelBox(rack24_r1, 200, 80, -7.5F, -5.5F, -4.2F, 6, 1, 1, 0.0F, true));

        rack14_r1 = new ModelRenderer(this);
        rack14_r1.setRotationPoint(0.0F, 6.7028F, 0.3614F);
        bone.addChild(rack14_r1);
        setRotationAngle(rack14_r1, 0.1487F, 0.0F, 0.0F);
        rack14_r1.cubeList.add(new ModelBox(rack14_r1, 200, 20, -7.5F, -12.0F, -4.6F, 13, 2, 1, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
    }
}
