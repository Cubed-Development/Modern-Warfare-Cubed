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
public final class ServerRackLeftAlt2 extends ModelBase implements IModernModel {

    private final ModelRenderer bone;

    public ServerRackLeftAlt2() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -15.0F, -5.6F, 15, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -4.0F, -6.0F, 16, 2, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, -6.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, 5.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -8.1F, -16.0F, -4.1F, 1, 15, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -16.0F, -5.5F, 15, 8, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -7.0F, -8.0F, -5.2F, 15, 4, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -6.0F, -7.7F, -5.5F, 13, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -6.0F, -5.3F, -5.5F, 13, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -5.5F, -7.7F, -5.7F, 8, 2, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
