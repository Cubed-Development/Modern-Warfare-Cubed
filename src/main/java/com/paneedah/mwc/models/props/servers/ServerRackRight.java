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
public final class ServerRackRight extends ModelBase implements IModernModel {

    private final ModelRenderer bone;

    public ServerRackRight() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -4.0F, -6.0F, 16, 2, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -16.0F, -6.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -16.0F, 5.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 7.1F, -16.0F, -4.1F, 1, 15, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 0.5F, -14.0F, -5.0F, 5, 10, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.5F, -14.0F, -5.0F, 5, 10, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -14.5F, -5.2F, 1, 11, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 0.0F, -14.5F, -5.2F, 1, 11, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -2.0F, -14.5F, -5.2F, 1, 11, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 5.0F, -14.5F, -5.2F, 1, 11, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.0F, -14.5F, -5.2F, 4, 1, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 1.0F, -14.5F, -5.2F, 4, 1, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, -5.8F, -13.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, -5.8F, -11.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, -5.8F, -9.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, -5.8F, -7.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, 1.2F, -13.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, 1.2F, -11.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, 1.2F, -9.0F, -5.1F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 60, 1.2F, -7.0F, -5.1F, 2, 1, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
