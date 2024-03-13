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
public final class Dumpster extends ModelBase implements IModernModel {

    private final ModelRenderer dumpster;
    private final ModelRenderer dumpster26_r1;
    private final ModelRenderer dumpster25_r1;
    private final ModelRenderer dumpster24_r1;
    private final ModelRenderer dumpster10_r1;
    private final ModelRenderer dumpster3_r1;

    public Dumpster() {
        textureWidth = 256;
        textureHeight = 256;

        dumpster = new ModelRenderer(this);
        dumpster.setRotationPoint(0.0F, 24.0F, 0.0F);
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -24.0F, -18.0F, -6.5F, 32, 16, 14, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -26.0F, -19.0F, -8.0F, 36, 2, 2, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -23.0F, -12.0F, -6.7F, 30, 1, 1, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -23.0F, -8.0F, -6.7F, 30, 1, 1, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, 5.0F, -14.0F, -7.0F, 4, 5, 15, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -26.0F, -16.0F, -8.0F, 36, 1, 1, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, 9.0F, -17.0F, -8.0F, 1, 1, 1, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -24.0F, -20.8F, 6.5F, 32, 3, 1, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -25.0F, -14.0F, -7.0F, 4, 5, 15, 0.0F, true));
        dumpster.cubeList.add(new ModelBox(dumpster, 0, 0, -26.0F, -17.0F, -8.0F, 1, 1, 1, 0.0F, true));

        dumpster26_r1 = new ModelRenderer(this);
        dumpster26_r1.setRotationPoint(0.0F, -4.3829F, -0.2406F);
        dumpster.addChild(dumpster26_r1);
        setRotationAngle(dumpster26_r1, -0.7436F, 0.0F, 0.0F);
        dumpster26_r1.cubeList.add(new ModelBox(dumpster26_r1, 0, 50, -23.0F, -2.5F, 5.5F, 2, 2, 2, 0.0F, true));
        dumpster26_r1.cubeList.add(new ModelBox(dumpster26_r1, 0, 50, 5.0F, -2.5F, 5.5F, 2, 2, 2, 0.0F, true));

        dumpster25_r1 = new ModelRenderer(this);
        dumpster25_r1.setRotationPoint(0.0F, 2.3863F, -2.8801F);
        dumpster.addChild(dumpster25_r1);
        setRotationAngle(dumpster25_r1, -0.7436F, 0.0F, 0.0F);
        dumpster25_r1.cubeList.add(new ModelBox(dumpster25_r1, 0, 50, -23.0F, -2.5F, -4.5F, 2, 2, 2, 0.0F, true));
        dumpster25_r1.cubeList.add(new ModelBox(dumpster25_r1, 0, 50, 5.0F, -2.5F, -4.5F, 2, 2, 2, 0.0F, true));

        dumpster24_r1 = new ModelRenderer(this);
        dumpster24_r1.setRotationPoint(0.0F, -29.2507F, 8.6979F);
        dumpster.addChild(dumpster24_r1);
        setRotationAngle(dumpster24_r1, 1.8218F, 0.0F, 0.0F);
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -11.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -14.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -17.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -20.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -23.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, 5.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, 2.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -1.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -4.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -7.0F, -17.5F, -6.5F, 2, 13, 2, 0.0F, true));
        dumpster24_r1.cubeList.add(new ModelBox(dumpster24_r1, 0, 50, -24.0F, -18.0F, -7.0F, 32, 14, 2, 0.0F, true));

        dumpster10_r1 = new ModelRenderer(this);
        dumpster10_r1.setRotationPoint(0.0F, -22.1045F, -14.9459F);
        dumpster.addChild(dumpster10_r1);
        setRotationAngle(dumpster10_r1, -1.3384F, 0.0F, 0.0F);
        dumpster10_r1.cubeList.add(new ModelBox(dumpster10_r1, 0, 0, -24.0F, -20.5F, 6.5F, 32, 10, 3, 0.0F, true));

        dumpster3_r1 = new ModelRenderer(this);
        dumpster3_r1.setRotationPoint(0.0F, -28.0023F, 7.7292F);
        dumpster.addChild(dumpster3_r1);
        setRotationAngle(dumpster3_r1, 1.8218F, 0.0F, 0.0F);
        dumpster3_r1.cubeList.add(new ModelBox(dumpster3_r1, 0, 0, -26.0F, -17.0F, -7.0F, 36, 15, 2, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        dumpster.render(scale);
    }
}
