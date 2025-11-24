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
public final class OutdoorChair extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer chair14_r1;
    private final ModelRenderer chair13_r1;
    private final ModelRenderer chair12_r1;
    private final ModelRenderer chair8_r1;
    private final ModelRenderer chair7_r1;
    private final ModelRenderer chair5_r1;
    private final ModelRenderer chair4_r1;

    public OutdoorChair() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(15.2039F, 21.1616F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -21.2039F, -8.1616F, -6.0F, 12, 3, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.2039F, -7.1616F, -6.0F, 1, 3, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -9.2039F, -7.1616F, -6.0F, 1, 3, 12, 0.0F, true));

        chair14_r1 = new ModelRenderer(this);
        chair14_r1.setRotationPoint(-29.5283F, -0.9927F, 0.0F);
        bone.addChild(chair14_r1);
        setRotationAngle(chair14_r1, 0.0F, 0.0F, 1.45F);
        chair14_r1.cubeList.add(new ModelBox(chair14_r1, 0, 50, -9.4F, -9.9F, -6.4F, 1, 2, 13, 0.0F, true));

        chair13_r1 = new ModelRenderer(this);
        bone.addChild(chair13_r1);
        setRotationAngle(chair13_r1, 0.0F, 0.0F, -1.45F);
        chair13_r1.cubeList.add(new ModelBox(chair13_r1, 0, 50, 9.3F, -10.9F, -6.4F, 1, 2, 13, 0.0F, true));
        chair13_r1.cubeList.add(new ModelBox(chair13_r1, 0, 50, 6.0F, -10.0F, -6.3F, 4, 1, 2, 0.0F, true));

        chair12_r1 = new ModelRenderer(this);
        chair12_r1.setRotationPoint(-30.4077F, 0.0F, 0.0F);
        bone.addChild(chair12_r1);
        setRotationAngle(chair12_r1, 0.0F, 0.0F, 1.45F);
        chair12_r1.cubeList.add(new ModelBox(chair12_r1, 0, 50, -10.0F, -10.0F, -6.3F, 4, 1, 2, 0.0F, true));

        chair8_r1 = new ModelRenderer(this);
        chair8_r1.setRotationPoint(-15.2039F, -10.9008F, 14.1892F);
        bone.addChild(chair8_r1);
        setRotationAngle(chair8_r1, 2.8256F, 0.0F, 0.0F);
        chair8_r1.cubeList.add(new ModelBox(chair8_r1, 0, 0, -6.0F, -8.0F, 6.0F, 12, 12, 2, 0.0F, true));

        chair7_r1 = new ModelRenderer(this);
        chair7_r1.setRotationPoint(-15.2039F, 3.5198F, 2.3163F);
        bone.addChild(chair7_r1);
        setRotationAngle(chair7_r1, 0.2231F, 0.0F, 0.0F);
        chair7_r1.cubeList.add(new ModelBox(chair7_r1, 0, 50, -6.9F, -10.0F, 4.2F, 2, 11, 2, 0.0F, true));
        chair7_r1.cubeList.add(new ModelBox(chair7_r1, 0, 50, 5.1F, -10.0F, 4.2F, 2, 11, 2, 0.0F, true));

        chair5_r1 = new ModelRenderer(this);
        chair5_r1.setRotationPoint(-16.3481F, 3.3328F, 0.0F);
        bone.addChild(chair5_r1);
        setRotationAngle(chair5_r1, 0.0F, 0.0F, 0.1115F);
        chair5_r1.cubeList.add(new ModelBox(chair5_r1, 0, 50, -7.0F, -10.0F, -6.3F, 2, 11, 2, 0.0F, true));

        chair4_r1 = new ModelRenderer(this);
        chair4_r1.setRotationPoint(-14.0598F, 3.3328F, 0.0F);
        bone.addChild(chair4_r1);
        setRotationAngle(chair4_r1, 0.0F, 0.0F, -0.1115F);
        chair4_r1.cubeList.add(new ModelBox(chair4_r1, 0, 50, 5.0F, -10.0F, -6.3F, 2, 11, 2, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
