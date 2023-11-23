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
public final class GunCaseSmall extends ModelBase implements IModernModel {

    private final ModelRenderer guncase;
    private final ModelRenderer Shape51Hatch_r1;
    private final ModelRenderer Shape46Hatch_r1;
    private final ModelRenderer Shape44Hatch_r1;
    private final ModelRenderer Shape32Hatch_r1;

    public GunCaseSmall() {
        textureWidth = 128;
        textureHeight = 128;

        guncase = new ModelRenderer(this);
        guncase.setRotationPoint(0.0F, 24.0F, 0.0F);
        guncase.cubeList.add(new ModelBox(guncase, 56, 0, 6.5F, -8.1F, -6.0F, 2, 2, 12, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 9, 29, 6.7F, -7.0F, -6.0F, 3, 4, 3, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 25, 6.7F, -7.0F, 3.0F, 3, 4, 3, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 52, 25, 6.5F, -6.0F, 8.0F, 3, 3, 1, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 6, 52, 6.5F, -6.0F, -9.0F, 3, 3, 1, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 10, 20, 8.0F, -5.6F, -5.0F, 3, 1, 1, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 8, 10, 8.0F, -5.6F, 4.0F, 3, 1, 1, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 0, 11.0F, -5.6F, -4.5F, 1, 1, 9, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 25, -9.0F, -7.0F, -11.0F, 15, 5, 22, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 52, -10.0F, -7.01F, -10.0F, 17, 5, 20, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 42, 6.7F, -5.8F, -1.0F, 2, 2, 2, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 8, 13, -12.0F, -8.5F, -8.0F, 2, 3, 4, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 10, -12.0F, -8.5F, 4.0F, 2, 3, 4, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 38, 6.5F, -8.1F, 8.0F, 3, 2, 2, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 8, 36, 6.5F, -8.1F, -10.0F, 3, 2, 2, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 0, -10.0F, -10.1F, -11.0F, 17, 3, 22, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 54, 60, -9.0F, -8.1F, -12.5F, 15, 2, 25, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 54, 38, -11.5F, -8.1F, -10.0F, 2, 2, 20, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 11, 0, 7.0F, -9.3F, -8.0F, 2, 6, 2, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 0, 0, 7.0F, -9.3F, 6.0F, 2, 6, 2, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 52, 25, -9.99F, -10.3F, -6.0F, 17, 1, 12, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 56, 17, -9.99F, -10.3F, 8.0F, 17, 1, 2, 0.0F, false));
        guncase.cubeList.add(new ModelBox(guncase, 56, 14, -9.99F, -10.3F, -10.0F, 17, 1, 2, 0.0F, false));

        Shape51Hatch_r1 = new ModelRenderer(this);
        Shape51Hatch_r1.setRotationPoint(3.8659F, 0.0F, -9.9284F);
        guncase.addChild(Shape51Hatch_r1);
        setRotationAngle(Shape51Hatch_r1, 0.0F, 0.733F, 0.0F);
        Shape51Hatch_r1.cubeList.add(new ModelBox(Shape51Hatch_r1, 0, 18, -11.0F, -8.1F, -10.5F, 3, 2, 2, 0.0F, false));
        Shape51Hatch_r1.cubeList.add(new ModelBox(Shape51Hatch_r1, 14, 52, -10.0F, -6.0F, -9.5F, 1, 4, 1, 0.0F, false));

        Shape46Hatch_r1 = new ModelRenderer(this);
        Shape46Hatch_r1.setRotationPoint(2.9888F, 0.0F, 9.1261F);
        guncase.addChild(Shape46Hatch_r1);
        setRotationAngle(Shape46Hatch_r1, 0.0F, -0.8203F, 0.0F);
        Shape46Hatch_r1.cubeList.add(new ModelBox(Shape46Hatch_r1, 12, 25, -9.0F, -8.1F, 9.3F, 3, 2, 2, 0.0F, false));
        Shape46Hatch_r1.cubeList.add(new ModelBox(Shape46Hatch_r1, 16, 10, -8.0F, -6.0F, 8.3F, 1, 4, 2, 0.0F, false));

        Shape44Hatch_r1 = new ModelRenderer(this);
        Shape44Hatch_r1.setRotationPoint(-5.6637F, 0.0F, 5.2447F);
        guncase.addChild(Shape44Hatch_r1);
        setRotationAngle(Shape44Hatch_r1, 0.0F, 0.733F, 0.0F);
        Shape44Hatch_r1.cubeList.add(new ModelBox(Shape44Hatch_r1, 0, 34, 4.0F, -8.1F, 11.0F, 3, 2, 2, 0.0F, false));
        Shape44Hatch_r1.cubeList.add(new ModelBox(Shape44Hatch_r1, 0, 52, 5.0F, -6.0F, 10.0F, 1, 4, 2, 0.0F, false));

        Shape32Hatch_r1 = new ModelRenderer(this);
        Shape32Hatch_r1.setRotationPoint(-8.1083F, 0.0F, -11.3521F);
        guncase.addChild(Shape32Hatch_r1);
        setRotationAngle(Shape32Hatch_r1, 0.0F, -0.8203F, 0.0F);
        Shape32Hatch_r1.cubeList.add(new ModelBox(Shape32Hatch_r1, 8, 40, 9.0F, -8.1F, -11.2F, 3, 2, 2, 0.0F, false));
        Shape32Hatch_r1.cubeList.add(new ModelBox(Shape32Hatch_r1, 52, 29, 10.0F, -6.0F, -10.2F, 1, 4, 1, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        guncase.render(scale);
    }
}
