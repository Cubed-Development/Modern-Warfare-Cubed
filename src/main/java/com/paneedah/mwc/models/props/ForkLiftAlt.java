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
public final class ForkLiftAlt extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer forklift49_r1;
    private final ModelRenderer forklift43_r1;
    private final ModelRenderer forklift40_r1;
    private final ModelRenderer forklift37_r1;
    private final ModelRenderer forklift36_r1;
    private final ModelRenderer forklift35_r1;
    private final ModelRenderer forklift33_r1;
    private final ModelRenderer forklift31_r1;
    private final ModelRenderer forklift12_r1;
    private final ModelRenderer forklift11_r1;
    private final ModelRenderer forklift9_r1;
    private final ModelRenderer forklift7_r1;
    private final ModelRenderer forklift4_r1;
    private final ModelRenderer forklift3_r1;

    public ForkLiftAlt() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(9.5348F, 24.0F, -3.8679F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -22.5348F, -8.0F, -7.1321F, 26, 4, 21, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -22.5348F, -13.0F, -1.1321F, 26, 5, 15, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -19.5348F, -13.0F, -9.1321F, 20, 5, 8, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -21.5348F, -18.0F, -0.6321F, 24, 5, 8, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -21.5348F, -20.05F, 7.0679F, 24, 2, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.5348F, -9.0F, -17.6321F, 5, 9, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -1.5348F, -9.0F, -17.6321F, 5, 9, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -1.5348F, -9.0F, 15.3679F, 5, 9, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.5348F, -9.0F, 15.3679F, 5, 9, 9, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -17.5348F, -12.0F, -18.6321F, 16, 9, 42, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -17.0348F, -63.0F, -20.6321F, 2, 60, 4, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -4.0348F, -63.0F, -20.6321F, 2, 60, 4, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -17.0348F, -63.0F, -16.6321F, 15, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -24.0348F, -54.0F, -22.6321F, 29, 2, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -24.0348F, -52.0F, -22.6321F, 2, 20, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 2.9652F, -52.0F, -22.6321F, 2, 20, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.0348F, -43.0F, -22.6321F, 25, 1, 2, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.0348F, -40.0F, -21.6321F, 25, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.0348F, -34.0F, -21.6321F, 25, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -20.0348F, -32.5F, -46.6321F, 3, 1, 25, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -2.0348F, -32.5F, -46.6321F, 3, 1, 25, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -22.0348F, -43.0F, -7.6321F, 25, 2, 19, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -22.5348F, -22.0F, 13.1679F, 26, 8, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -16.5348F, -23.0F, 13.8679F, 14, 18, 13, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -23.0348F, -19.0F, 15.0679F, 27, 5, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -16.5348F, -22.0F, 0.3679F, 14, 4, 10, 0.0F, true));

        forklift49_r1 = new ModelRenderer(this);
        forklift49_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        bone.addChild(forklift49_r1);
        setRotationAngle(forklift49_r1, 0.0F, 0.2231F, 0.0F);
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, 3.5F, -35.5F, -46.5F, 3, 1, 20, 0.0F, true));
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, -1.5F, -35.5F, -46.5F, 3, 1, 20, 0.0F, true));
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, -6.5F, -35.5F, -46.5F, 3, 1, 20, 0.0F, true));
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, -11.5F, -35.5F, -46.5F, 3, 1, 20, 0.0F, true));
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, -13.5F, -34.5F, -30.5F, 27, 2, 2, 0.0F, true));
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, -13.5F, -34.5F, -44.5F, 27, 2, 2, 0.0F, true));
        forklift49_r1.cubeList.add(new ModelBox(forklift49_r1, 0, 160, 8.5F, -35.5F, -46.5F, 3, 1, 20, 0.0F, true));

        forklift43_r1 = new ModelRenderer(this);
        forklift43_r1.setRotationPoint(-9.5348F, -39.8342F, 21.7047F);
        bone.addChild(forklift43_r1);
        setRotationAngle(forklift43_r1, 2.8999F, 0.0F, 0.0F);
        forklift43_r1.cubeList.add(new ModelBox(forklift43_r1, 0, 50, -7.0F, -21.0F, 6.5F, 14, 8, 3, 0.0F, true));

        forklift40_r1 = new ModelRenderer(this);
        forklift40_r1.setRotationPoint(-9.5348F, 1.8701F, 25.3532F);
        bone.addChild(forklift40_r1);
        setRotationAngle(forklift40_r1, 0.7854F, 0.0F, 0.0F);
        forklift40_r1.cubeList.add(new ModelBox(forklift40_r1, 0, 130, -9.0F, -25.0F, 13.0F, 18, 6, 6, 0.0F, true));

        forklift37_r1 = new ModelRenderer(this);
        forklift37_r1.setRotationPoint(-9.5348F, -5.7809F, -0.7627F);
        bone.addChild(forklift37_r1);
        setRotationAngle(forklift37_r1, -0.3346F, 0.0F, 0.0F);
        forklift37_r1.cubeList.add(new ModelBox(forklift37_r1, 0, 0, -13.0F, -16.6F, 14.8F, 26, 4, 8, 0.0F, true));

        forklift36_r1 = new ModelRenderer(this);
        forklift36_r1.setRotationPoint(-9.5348F, -5.004F, 26.3188F);
        bone.addChild(forklift36_r1);
        setRotationAngle(forklift36_r1, 2.2307F, 0.0F, 0.0F);
        forklift36_r1.cubeList.add(new ModelBox(forklift36_r1, 0, 0, -13.0F, -8.0F, 10.0F, 26, 9, 4, 0.0F, true));

        forklift35_r1 = new ModelRenderer(this);
        forklift35_r1.setRotationPoint(-9.5348F, -43.6404F, -32.2765F);
        bone.addChild(forklift35_r1);
        setRotationAngle(forklift35_r1, -1.4128F, 0.0F, 0.0F);
        forklift35_r1.cubeList.add(new ModelBox(forklift35_r1, 0, 50, -12.5F, -43.0F, 7.5F, 3, 3, 24, 0.0F, true));
        forklift35_r1.cubeList.add(new ModelBox(forklift35_r1, 0, 50, 9.5F, -43.0F, 7.5F, 3, 3, 24, 0.0F, true));

        forklift33_r1 = new ModelRenderer(this);
        forklift33_r1.setRotationPoint(-9.5348F, 2.084F, -1.9752F);
        bone.addChild(forklift33_r1);
        setRotationAngle(forklift33_r1, -0.1859F, 0.0F, 0.0F);
        forklift33_r1.cubeList.add(new ModelBox(forklift33_r1, 0, 50, -12.5F, -30.3F, -14.1F, 2, 19, 2, 0.0F, true));
        forklift33_r1.cubeList.add(new ModelBox(forklift33_r1, 0, 50, 10.5F, -30.3F, -14.1F, 2, 19, 2, 0.0F, true));

        forklift31_r1 = new ModelRenderer(this);
        forklift31_r1.setRotationPoint(-9.5348F, 1.5034F, -5.7085F);
        bone.addChild(forklift31_r1);
        setRotationAngle(forklift31_r1, -0.2231F, 0.0F, 0.0F);
        forklift31_r1.cubeList.add(new ModelBox(forklift31_r1, 0, 50, 10.5F, -42.0F, -11.5F, 2, 13, 2, 0.0F, true));
        forklift31_r1.cubeList.add(new ModelBox(forklift31_r1, 0, 50, -12.5F, -42.0F, -11.5F, 2, 13, 2, 0.0F, true));

        forklift12_r1 = new ModelRenderer(this);
        forklift12_r1.setRotationPoint(-9.5348F, 3.475F, -0.1053F);
        bone.addChild(forklift12_r1);
        setRotationAngle(forklift12_r1, -0.2231F, 0.0F, 0.0F);
        forklift12_r1.cubeList.add(new ModelBox(forklift12_r1, 0, 50, -12.0F, -16.0F, -18.5F, 24, 5, 8, 0.0F, true));

        forklift11_r1 = new ModelRenderer(this);
        forklift11_r1.setRotationPoint(-9.5348F, -27.3308F, 1.1312F);
        bone.addChild(forklift11_r1);
        setRotationAngle(forklift11_r1, 1.3756F, 0.0F, 0.0F);
        forklift11_r1.cubeList.add(new ModelBox(forklift11_r1, 0, 50, -5.0F, -12.0F, -18.0F, 10, 5, 14, 0.0F, true));

        forklift9_r1 = new ModelRenderer(this);
        forklift9_r1.setRotationPoint(-9.5348F, -1.7641F, 8.3482F);
        bone.addChild(forklift9_r1);
        setRotationAngle(forklift9_r1, 0.2602F, 0.0F, 0.0F);
        forklift9_r1.cubeList.add(new ModelBox(forklift9_r1, 0, 50, -12.0F, -18.0F, -4.5F, 24, 2, 8, 0.0F, true));

        forklift7_r1 = new ModelRenderer(this);
        forklift7_r1.setRotationPoint(-9.5348F, -0.9428F, 9.4507F);
        bone.addChild(forklift7_r1);
        setRotationAngle(forklift7_r1, 0.3346F, 0.0F, 0.0F);
        forklift7_r1.cubeList.add(new ModelBox(forklift7_r1, 0, 0, -13.0F, -17.0F, 0.0F, 26, 8, 11, 0.0F, true));

        forklift4_r1 = new ModelRenderer(this);
        forklift4_r1.setRotationPoint(-9.5348F, 2.9186F, -15.8422F);
        bone.addChild(forklift4_r1);
        setRotationAngle(forklift4_r1, -1.3384F, 0.0F, 0.0F);
        forklift4_r1.cubeList.add(new ModelBox(forklift4_r1, 0, 0, -14.0F, -11.0F, -11.7F, 28, 1, 7, 0.0F, true));

        forklift3_r1 = new ModelRenderer(this);
        forklift3_r1.setRotationPoint(-9.5348F, -2.9081F, -21.7033F);
        bone.addChild(forklift3_r1);
        setRotationAngle(forklift3_r1, -1.8589F, 0.0F, 0.0F);
        forklift3_r1.cubeList.add(new ModelBox(forklift3_r1, 0, 0, -14.0F, -11.0F, -11.7F, 28, 8, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
