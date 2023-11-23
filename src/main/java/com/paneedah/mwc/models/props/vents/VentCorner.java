package com.paneedah.mwc.models.props.vents;

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
public final class VentCorner extends ModelBase implements IModernModel {

    private final ModelRenderer vent;
    private final ModelRenderer vent3_r1;

    public VentCorner() {
        textureWidth = 128;
        textureHeight = 128;

        vent = new ModelRenderer(this);
        vent.setRotationPoint(0.0F, 24.0F, 0.0F);
        vent.cubeList.add(new ModelBox(vent, 0, 0, -7.0F, -15.0F, 7.0F, 14, 14, 1, 0.0F, true));
        vent.cubeList.add(new ModelBox(vent, 0, 0, -8.0F, -15.0F, -7.0F, 15, 14, 14, 0.0F, true));

        vent3_r1 = new ModelRenderer(this);
        vent3_r1.setRotationPoint(-3.3995F, 0.0F, -6.7929F);
        vent.addChild(vent3_r1);
        setRotationAngle(vent3_r1, 0.0F, -0.7854F, 0.0F);
        vent3_r1.cubeList.add(new ModelBox(vent3_r1, 0, 40, 6.6F, -15.5F, -7.5F, 1, 15, 20, 0.0F, true));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        vent.render(scale);
    }
}
