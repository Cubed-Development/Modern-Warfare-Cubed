package com.paneedah.mwc.models.props;

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
public final class VendingMachine extends ModelBase implements IModernModel {

    private final ModelRenderer bone2;
    private final ModelRenderer bone4;
    private final ModelRenderer bone;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public VendingMachine() {
        textureWidth = 256;
        textureHeight = 256;

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(0.0F, 24.0F, 0.0F);

        bone4 = new ModelRenderer(this);
        bone2.addChild(bone4);
        bone4.cubeList.add(new ModelBox(bone4, 0, 0, 5.0F, -42.0F, -6.0F, 2, 35, 17, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 62, 67, -7.0F, -42.0F, 11.0F, 14, 41, 3, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 56, 0, -7.0F, -42.0F, -14.0F, 14, 41, 8, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 74, 146, -8.0F, -29.0F, -13.0F, 1, 21, 6, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 36, 173, -6.0F, -40.0F, -6.0F, 0, 33, 17, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 67, -7.0F, -7.0F, -6.0F, 14, 6, 17, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 96, 67, -7.0F, -42.0F, -6.0F, 12, 2, 17, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 38, 146, -7.0F, -44.5882F, -4.3407F, 14, 3, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 162, -7.0F, -44.5882F, -0.6593F, 14, 3, 5, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 178, -7.0F, -1.0F, 9.0F, 14, 1, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 0, 173, -7.0F, -1.0F, -13.0F, 14, 1, 4, 0.0F, false));

        bone = new ModelRenderer(this);
        bone.setRotationPoint(5.5405F, -0.6596F, 0.0F);
        bone2.addChild(bone);

        bone3_r1 = new ModelRenderer(this);
        bone.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.0F, -0.1745F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 52, 111, -5.9101F, -22.1671F, -6.0F, 9, 2, 17, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 0, 111, -7.9939F, -10.3494F, -6.0F, 9, 2, 17, 0.0F, false));
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 104, 111, -4.0F, -33.0F, -6.0F, 9, 2, 17, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(-5.5405F, 0.6009F, 11.4461F);
        bone.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.2618F, 0.0F, 0.0F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 130, -7.0F, -47.0981F, -13.7238F, 14, 3, 10, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(-5.5405F, -2.2462F, -11.0712F);
        bone.addChild(bone_r1);
        setRotationAngle(bone_r1, -0.2618F, 0.0F, 0.0F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 48, 130, -7.0F, -44.2511F, 4.0986F, 14, 3, 10, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone2.render(scale);
    }
}
