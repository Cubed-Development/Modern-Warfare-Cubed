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
public final class Trusses extends ModelBase implements IModernModel {

    private final ModelRenderer trusses;
    private final ModelRenderer trusses4_r1;
    private final ModelRenderer trusses3_r1;

    public Trusses() {
        textureWidth = 128;
        textureHeight = 128;

        trusses = new ModelRenderer(this);
        trusses.setRotationPoint(0.0F, 24.0F, 0.0F);
        trusses.cubeList.add(new ModelBox(trusses, 0, 0, -8.0F, -16.0F, -1.0F, 16, 2, 2, 0.0F, true));
        trusses.cubeList.add(new ModelBox(trusses, 0, 0, -8.0F, -6.0F, -1.0F, 16, 2, 2, 0.0F, true));
        trusses.cubeList.add(new ModelBox(trusses, 0, 0, -8.0F, -4.5F, -1.5F, 16, 1, 3, 0.0F, true));

        trusses4_r1 = new ModelRenderer(this);
        trusses4_r1.setRotationPoint(-1.9957F, -8.0195F, 0.0F);
        trusses.addChild(trusses4_r1);
        setRotationAngle(trusses4_r1, 0.0F, 0.0F, 0.9295F);
        trusses4_r1.cubeList.add(new ModelBox(trusses4_r1, 0, 0, -4.0F, -6.0F, -0.5F, 12, 1, 1, 0.0F, true));

        trusses3_r1 = new ModelRenderer(this);
        trusses3_r1.setRotationPoint(1.9956F, -8.0195F, 0.0F);
        trusses.addChild(trusses3_r1);
        setRotationAngle(trusses3_r1, 0.0F, 0.0F, -0.9295F);
        trusses3_r1.cubeList.add(new ModelBox(trusses3_r1, 0, 0, -7.0F, -6.0F, -0.5F, 11, 1, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        trusses.render(scale);
    }
}
