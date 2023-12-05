package com.paneedah.mwc.models.props.electronics;

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
public final class Radio extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer radio35_r1;
    private final ModelRenderer radio30_r1;
    private final ModelRenderer radio29_r1;
    private final ModelRenderer radio28_r1;
    private final ModelRenderer radio27_r1;
    private final ModelRenderer radio26_r1;
    private final ModelRenderer radio25_r1;
    private final ModelRenderer radio24_r1;
    private final ModelRenderer radio22_r1;
    private final ModelRenderer radio37_r1;

    public Radio() {
        textureWidth = 256;
        textureHeight = 256;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        setRotationAngle(bone, 0.0F, -1.5708F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.5F, -6.0F, -5.0F, 15, 7, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -6.5F, -5.5F, 14, 1, 12, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -7.0F, -5.3F, -5.2F, 2, 4, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -4.5F, -3.3F, -5.2F, 3, 3, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -2.3F, -5.2F, 6, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -0.5F, -2.8F, -5.2F, 6, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 1.3F, -4.0F, -5.2F, 5, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 0.3F, -6.0F, -5.2F, 1, 3, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 6.3F, -6.0F, -5.2F, 1, 3, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 1.3F, -6.2F, -5.2F, 5, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -7.2F, -1.1F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -5.8F, -1.1F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 0.8F, -3.5F, -5.4F, 1, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -0.6F, -5.0F, -5.1F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 100, 1.3F, -5.5F, -5.1F, 5, 2, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -8.0F, -5.5F, -6.0F, 1, 5, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 7.0F, -5.5F, -6.0F, 1, 5, 5, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 4.4F, -2.7F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 4.4F, -1.4F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 3.0F, -1.4F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, 3.0F, -2.7F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -6.5F, -5.0F, -5.3F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 50, 50, -4.8F, -5.0F, -5.1F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 50, 50, -2.2F, -5.0F, -5.1F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 50, 50, -4.8F, -4.8F, -5.1F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 50, 50, -2.2F, -4.8F, -5.1F, 1, 1, 1, 0.0F, true));
        bone.cubeList.add(new ModelBox(bone, 0, 50, -3.65F, -4.9F, -5.65F, 1, 1, 1, 0.0F, true));

        radio35_r1 = new ModelRenderer(this);
        radio35_r1.setRotationPoint(2.0172F, 0.0F, -3.1542F);
        bone.addChild(radio35_r1);
        setRotationAngle(radio35_r1, 0.0F, 0.5577F, 0.0F);
        radio35_r1.cubeList.add(new ModelBox(radio35_r1, 0, 50, -4.5F, -4.9F, -5.1F, 1, 1, 1, 0.0F, true));

        radio30_r1 = new ModelRenderer(this);
        radio30_r1.setRotationPoint(1.9733F, -0.9013F, 0.0F);
        bone.addChild(radio30_r1);
        setRotationAngle(radio30_r1, 0.0F, 0.0F, -0.4461F);
        radio30_r1.cubeList.add(new ModelBox(radio30_r1, 0, 50, -1.0F, -4.8F, -5.2F, 1, 1, 1, 0.0F, true));

        radio29_r1 = new ModelRenderer(this);
        radio29_r1.setRotationPoint(0.0F, -4.0406F, -0.8452F);
        bone.addChild(radio29_r1);
        setRotationAngle(radio29_r1, 0.7854F, 0.0F, 0.0F);
        radio29_r1.cubeList.add(new ModelBox(radio29_r1, 0, 50, -4.0F, -1.0F, -5.3F, 2, 1, 1, 0.0F, true));

        radio28_r1 = new ModelRenderer(this);
        radio28_r1.setRotationPoint(0.0F, -4.2749F, -0.2795F);
        bone.addChild(radio28_r1);
        setRotationAngle(radio28_r1, 0.7854F, 0.0F, 0.0F);
        radio28_r1.cubeList.add(new ModelBox(radio28_r1, 0, 50, -4.0F, -1.8F, -5.3F, 2, 1, 1, 0.0F, true));

        radio27_r1 = new ModelRenderer(this);
        radio27_r1.setRotationPoint(0.0F, -4.392F, 0.0033F);
        bone.addChild(radio27_r1);
        setRotationAngle(radio27_r1, 0.7854F, 0.0F, 0.0F);
        radio27_r1.cubeList.add(new ModelBox(radio27_r1, 0, 50, -4.0F, -2.2F, -5.3F, 2, 1, 1, 0.0F, true));

        radio26_r1 = new ModelRenderer(this);
        radio26_r1.setRotationPoint(0.0F, -4.5092F, 0.2861F);
        bone.addChild(radio26_r1);
        setRotationAngle(radio26_r1, 0.7854F, 0.0F, 0.0F);
        radio26_r1.cubeList.add(new ModelBox(radio26_r1, 0, 50, -4.0F, -2.6F, -5.3F, 2, 1, 1, 0.0F, true));

        radio25_r1 = new ModelRenderer(this);
        radio25_r1.setRotationPoint(0.0F, -4.1577F, -0.5624F);
        bone.addChild(radio25_r1);
        setRotationAngle(radio25_r1, 0.7854F, 0.0F, 0.0F);
        radio25_r1.cubeList.add(new ModelBox(radio25_r1, 0, 50, -4.0F, -1.4F, -5.3F, 2, 1, 1, 0.0F, true));

        radio24_r1 = new ModelRenderer(this);
        radio24_r1.setRotationPoint(-5.505F, 0.0F, 2.6903F);
        bone.addChild(radio24_r1);
        setRotationAngle(radio24_r1, 0.0F, -0.7854F, 0.0F);
        radio24_r1.cubeList.add(new ModelBox(radio24_r1, 0, 100, -6.0F, -3.7F, -5.3F, 1, 2, 1, 0.0F, true));

        radio22_r1 = new ModelRenderer(this);
        radio22_r1.setRotationPoint(-1.4699F, -1.4278F, 0.0F);
        bone.addChild(radio22_r1);
        setRotationAngle(radio22_r1, 0.0F, 0.0F, 0.7808F);
        radio22_r1.cubeList.add(new ModelBox(radio22_r1, 0, 50, 1.0F, -2.5F, -5.5F, 1, 1, 1, 0.0F, true));

        radio37_r1 = new ModelRenderer(this);
        radio37_r1.setRotationPoint(-2.6973F, 0.0F, 0.5904F);
        bone.addChild(radio37_r1);
        setRotationAngle(radio37_r1, 0.0F, -0.4461F, 0.0F);
        radio37_r1.cubeList.add(new ModelBox(radio37_r1, 0, 50, -2.65F, -4.9F, -5.65F, 2, 1, 1, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}
