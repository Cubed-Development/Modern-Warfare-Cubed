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
public final class ServerRackLeft extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer rack9_r1;

    public ServerRackLeft() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 200, 0, -4.2F, -15.0F, -5.3F, 10, 8, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -4.0F, -6.0F, 16, 2, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, -6.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, 5.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -8.1F, -16.0F, -4.1F, 1, 15, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.2F, -7.0F, -5.5F, 14, 3, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.2F, -16.0F, -5.5F, 14, 1, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.2F, -15.0F, -5.5F, 2, 8, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 5.8F, -15.0F, -5.5F, 2, 8, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.2F, -5.5F, -6.8F, 14, 1, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.2F, -5.0F, -6.8F, 14, 1, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -4.2F, -7.5F, -5.5F, 10, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -5.5F, -6.2F, -7.0F, 3, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -1.0F, -6.2F, -7.0F, 3, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, 3.5F, -6.2F, -7.0F, 3, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -4.2F, -15.0F, 4.5F, 10, 8, 1, 0.0F, true));

        rack9_r1 = new ModelRenderer(this);
        rack9_r1.setRotationPoint(0.0F, 1.895F, -5.8598F);
        bone.addChild(rack9_r1);
        setRotationAngle(rack9_r1, -0.7064F, 0.0F, 0.0F);
        rack9_r1.cubeList.add(new ModelBox(rack9_r1, 100, 0, -6.2F, -7.0F, -5.5F, 14, 2, 2, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
    }
}
