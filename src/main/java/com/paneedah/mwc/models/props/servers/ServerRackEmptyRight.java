package com.paneedah.mwc.models.props.servers;

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
public final class ServerRackEmptyRight extends ModelBase implements IModernModel {

    private final ModelRenderer bone;

    public ServerRackEmptyRight() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 50, 7.1F, -16.0F, -4.1F, 1, 15, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -8.0F, -4.0F, -6.0F, 16, 2, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -16.0F, -6.1F, 2, 16, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 6.2F, -16.0F, 5.1F, 2, 16, 2, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
    }
}
