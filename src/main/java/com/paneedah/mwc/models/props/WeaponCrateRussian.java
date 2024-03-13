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
public final class WeaponCrateRussian extends ModelBase implements IModernModel {

    private final ModelRenderer bone;

    public WeaponCrateRussian() {
        textureWidth = 512;
        textureHeight = 512;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 200, 0, -3.0F, -10.0F, 26.5F, 7, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -12.0F, -4.0F, -24.0F, 25, 1, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -16.0F, -23.0F, 23, 12, 48, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 12.0F, -8.1F, -24.0F, 1, 4, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 12.0F, -12.2F, -24.0F, 1, 4, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 12.0F, -16.3F, -24.0F, 1, 4, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -12.0F, -8.1F, -24.0F, 1, 4, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -12.0F, -12.2F, -24.0F, 1, 4, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -12.0F, -16.3F, -24.0F, 1, 4, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.5F, -10.0F, -24.3F, 24, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.5F, -16.2F, -24.3F, 24, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.5F, -16.2F, 25.3F, 24, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.5F, -10.0F, 25.3F, 24, 6, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -16.8F, -24.0F, 5, 1, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -5.8F, -16.8F, -24.0F, 5, 1, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -0.6F, -16.8F, -24.0F, 5, 1, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 4.7F, -16.8F, -24.0F, 5, 1, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, 9.9F, -16.8F, -24.0F, 2, 1, 50, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -17.8F, -19.0F, 23, 1, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -17.8F, 16.0F, 23, 1, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -3.0F, -19.0F, 23, 1, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -11.0F, -3.0F, 17.0F, 23, 1, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -14.0F, -26.0F, 7, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -14.0F, 26.0F, 7, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, 4.0F, -13.5F, -25.5F, 1, 4, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, -4.0F, -13.5F, -25.5F, 1, 4, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, -3.0F, -10.0F, -25.5F, 7, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, 4.0F, -13.5F, 26.5F, 1, 4, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 200, 0, -4.0F, -13.5F, 26.5F, 1, 4, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
