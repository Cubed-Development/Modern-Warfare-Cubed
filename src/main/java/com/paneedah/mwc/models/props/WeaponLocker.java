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
public final class WeaponLocker extends ModelBase implements IModernModel {

    private final ModelRenderer gunrack;

    public WeaponLocker() {
        textureWidth = 256;
        textureHeight = 256;

        gunrack = new ModelRenderer(this);
        gunrack.setRotationPoint(0.0F, 24.0F, 0.0F);
        gunrack.cubeList.add(new ModelBox(gunrack, 187, 117, -2.0F, -48.0F, 28.0F, 11, 44, 0, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 187, 117, -2.0F, -48.0F, -19.0F, 11, 44, 0, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 61, 10.5F, -48.0F, -17.0F, 0, 44, 43, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 52, 10.0F, -32.0F, 22.5F, 1, 11, 3, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 40, -1.0F, -39.0F, -15.0F, 7, 2, 7, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 71, -1.0F, -39.0F, -7.0F, 7, 2, 7, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 83, -2.0F, -35.0F, -11.0F, 10, 4, 12, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 86, 104, -2.0F, -23.0F, -12.0F, 6, 4, 13, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 72, -2.0F, -29.0F, -17.0F, 10, 4, 12, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 52, -2.0F, -17.0F, -16.0F, 8, 4, 16, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 88, 0.0F, -11.0F, -9.0F, 7, 4, 9, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 28, 168, -2.0F, -24.0F, 21.0F, 6, 20, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 14, 168, -2.0F, -24.0F, 18.0F, 6, 20, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 163, 0, -2.0F, -24.0F, 12.0F, 6, 20, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 48, 163, -2.0F, -24.0F, 8.75F, 6, 20, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 32, 52, -2.0F, -41.0F, 21.0F, 6, 4, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 32, 57, -2.0F, -41.0F, 18.0F, 6, 4, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 32, 72, -2.0F, -41.0F, 12.0F, 6, 4, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 0, -2.0F, -41.0F, 9.25F, 6, 4, 1, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 123, 41, -2.0F, -37.0F, -17.0F, 11, 1, 18, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 123, 22, -2.0F, -31.0F, -17.0F, 11, 1, 18, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 21, -2.0F, -25.0F, -17.0F, 11, 1, 18, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 52, -2.0F, -19.0F, -17.0F, 11, 1, 18, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 123, 3, -2.0F, -13.0F, -17.0F, 11, 1, 18, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 83, 0, -2.0F, -7.0F, -17.0F, 11, 3, 18, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 0, -2.0F, -48.0F, 1.0F, 10, 44, 2, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 89, 89, -3.0F, -48.0F, -17.0F, 1, 44, 43, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 24, 0, -5.0F, -48.0F, 26.0F, 3, 44, 3, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 36, 0, 9.0F, -48.0F, 26.0F, 3, 44, 3, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 134, 79, 9.0F, -48.0F, -20.0F, 3, 44, 3, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 146, 79, -5.0F, -48.0F, -20.0F, 3, 44, 3, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 0, -5.0F, -51.0F, -20.0F, 17, 3, 49, 0.0F, false));
        gunrack.cubeList.add(new ModelBox(gunrack, 0, 52, -5.0F, -4.0F, -20.0F, 17, 3, 49, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        gunrack.render(scale);
    }
}
