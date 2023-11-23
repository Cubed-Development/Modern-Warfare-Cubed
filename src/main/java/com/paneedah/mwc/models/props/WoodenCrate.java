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
public final class WoodenCrate extends ModelBase implements IModernModel {

    private final ModelRenderer WoodenCrate;
    private final ModelRenderer bone6_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone4_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone_r1;

    public WoodenCrate() {
        textureWidth = 128;
        textureHeight = 128;

        WoodenCrate = new ModelRenderer(this);
        WoodenCrate.setRotationPoint(0.0F, 24.0F, 0.0F);
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 82, 82, -1.0F, -1.0F, -8.0F, 2, 1, 16, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 62, 70, 6.0F, -3.0F, -8.0F, 2, 3, 16, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 8, 0, 6.0F, -17.0F, 6.0F, 2, 14, 2, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 0, 20, 6.0F, -17.0F, -8.0F, 2, 14, 2, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 8, 20, -8.0F, -17.0F, -8.0F, 2, 14, 2, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 0, 40, -7.0F, -16.0F, -7.0F, 14, 14, 14, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 0, 0, -8.0F, -17.0F, 6.0F, 2, 14, 2, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 54, 37, 6.0F, -17.0F, -6.0F, 2, 2, 12, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 44, 70, -8.0F, -17.0F, -6.0F, 2, 2, 12, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 80, 56, -6.0F, -17.0F, 6.0F, 12, 2, 2, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 80, 60, -6.0F, -17.0F, -8.0F, 12, 2, 2, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 40, 52, -6.0F, -3.0F, -8.0F, 12, 2, 16, 0.0F, false));
        WoodenCrate.cubeList.add(new ModelBox(WoodenCrate, 80, 37, -8.0F, -3.0F, -8.0F, 2, 3, 16, 0.0F, false));

        bone6_r1 = new ModelRenderer(this);
        bone6_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        WoodenCrate.addChild(bone6_r1);
        setRotationAngle(bone6_r1, 0.0F, 0.7854F, 0.0F);
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 0, 68, -1.0F, -16.76F, -9.0F, 2, 2, 18, 0.0F, false));

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        WoodenCrate.addChild(bone5_r1);
        setRotationAngle(bone5_r1, 0.0F, -0.7854F, 0.0F);
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 22, 70, -1.0F, -16.75F, -9.0F, 2, 2, 18, 0.0F, false));

        bone4_r1 = new ModelRenderer(this);
        bone4_r1.setRotationPoint(5.6569F, -2.3432F, 0.0F);
        WoodenCrate.addChild(bone4_r1);
        setRotationAngle(bone4_r1, 0.0F, 0.0F, -0.7854F);
        bone4_r1.cubeList.add(new ModelBox(bone4_r1, 48, 0, -8.2929F, -9.7071F, -7.51F, 18, 2, 15, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(-5.6569F, -2.3432F, 0.0F);
        WoodenCrate.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.0F, 0.0F, 0.7854F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 48, 20, -9.7071F, -9.7071F, -7.5F, 18, 2, 15, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(0.0F, -2.3432F, 5.6569F);
        WoodenCrate.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.7854F, 0.0F, 0.0F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 0, 0, -7.5F, -9.7071F, -8.2929F, 15, 2, 18, 0.0F, false));

        bone_r1 = new ModelRenderer(this);
        bone_r1.setRotationPoint(0.0F, -2.3432F, -5.6569F);
        WoodenCrate.addChild(bone_r1);
        setRotationAngle(bone_r1, -0.7854F, 0.0F, 0.0F);
        bone_r1.cubeList.add(new ModelBox(bone_r1, 0, 20, -7.49F, -9.7071F, -9.7071F, 15, 2, 18, 0.0F, false));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        WoodenCrate.render(scale);
    }
}
