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
public final class ServerRackLeftAlt3 extends ModelBase implements IModernModel {

    private final ModelRenderer bone;

    public ServerRackLeftAlt3() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -4.0F, -6.0F, 16, 2, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, -6.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.2F, -16.0F, 5.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -8.1F, -16.0F, -4.1F, 1, 15, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.5F, -15.0F, -5.5F, 4, 11, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -1.5F, -15.0F, -5.5F, 4, 11, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 3.5F, -15.0F, -5.5F, 4, 11, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -2.5F, -15.0F, -5.0F, 6, 11, 11, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -6.5F, -14.0F, -5.7F, 4, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, -1.5F, -14.0F, -5.7F, 4, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 0, 3.5F, -14.0F, -5.7F, 4, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -6.2F, -12.0F, -5.6F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -6.2F, -10.0F, -5.6F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -6.2F, -8.0F, -5.6F, 2, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -0.2F, -12.0F, -5.6F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -0.2F, -10.0F, -5.6F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 100, 50, -0.2F, -8.0F, -5.6F, 1, 1, 1, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
    }
}
