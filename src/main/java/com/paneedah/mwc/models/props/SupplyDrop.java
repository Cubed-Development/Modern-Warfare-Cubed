package com.paneedah.mwc.models.props;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class SupplyDrop extends ModelBase implements IModernModel {

    private final ModelRenderer belts;
    private final ModelRenderer Belt79_r1;
    private final ModelRenderer Belt74_r1;
    private final ModelRenderer Belt65_r1;
    private final ModelRenderer Belt55_r1;
    private final ModelRenderer Belt54_r1;
    private final ModelRenderer Belt43_r1;
    private final ModelRenderer Belt14_r1;
    private final ModelRenderer CardboardBox;
    private final ModelRenderer shape;
    private final ModelRenderer lock;

    public SupplyDrop() {
        textureWidth = 512;
        textureHeight = 512;

        belts = new ModelRenderer(this);
        belts.setRotationPoint(3.6675F, 26.3984F, 0.0F);
        belts.cubeList.add(new ModelBox(belts, 200, 300, -15.1675F, -41.3984F, -34.0F, 2, 1, 68, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -1.1675F, -41.3984F, -34.0F, 2, 1, 68, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, 12.8325F, -41.3984F, -34.0F, 2, 1, 68, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, -22.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, -8.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, 6.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, 20.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, -15.5F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, -1.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, 13.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, 26.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -26.1675F, -41.3984F, -28.0F, 45, 1, 2, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -21.1675F, -41.3984F, -34.0F, 2, 1, 68, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, -8.1675F, -41.3984F, -34.0F, 2, 1, 68, 0.0F, true));
        belts.cubeList.add(new ModelBox(belts, 200, 300, 5.8325F, -41.3984F, -34.0F, 2, 1, 68, 0.0F, true));

        Belt79_r1 = new ModelRenderer(this);
        belts.addChild(Belt79_r1);
        setRotationAngle(Belt79_r1, 0.0F, 0.0F, -0.0873F);
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 22.1542F, -15.4615F, 6.0F, 1, 6, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 22.1542F, -15.4615F, -8.0F, 1, 6, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 22.1542F, -15.4615F, -8.0F, 1, 6, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 22.1542F, -15.4615F, -22.0F, 1, 6, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, 26.0F, 1, 19, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, -1.0F, 1, 19, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, -28.0F, 1, 19, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, -15.5F, 1, 19, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -13.4615F, -35.0F, 1, 2, 71, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -22.4615F, -35.0F, 1, 2, 70, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -27.4615F, -35.0F, 1, 2, 70, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -32.4615F, -34.0F, 1, 2, 68, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -37.4615F, -34.0F, 1, 2, 68, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, 6.0F, 1, 37, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, -8.0F, 1, 37, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 300, 21.6542F, -39.4615F, -22.0F, 1, 37, 2, 0.0F, true));
        Belt79_r1.cubeList.add(new ModelBox(Belt79_r1, 200, 400, 22.1542F, -15.4615F, 20.0F, 1, 6, 2, 0.0F, true));

        Belt74_r1 = new ModelRenderer(this);
        Belt74_r1.setRotationPoint(0.1569F, -0.0068F, 0.0F);
        belts.addChild(Belt74_r1);
        setRotationAngle(Belt74_r1, 0.0F, 0.0F, -0.0873F);
        Belt74_r1.cubeList.add(new ModelBox(Belt74_r1, 200, 300, 21.6542F, -39.2615F, 13.0F, 1, 19, 2, 0.0F, true));

        Belt65_r1 = new ModelRenderer(this);
        Belt65_r1.setRotationPoint(-3.6675F, 0.0316F, 2.2004F);
        belts.addChild(Belt65_r1);
        setRotationAngle(Belt65_r1, 0.0524F, 0.0F, 0.0F);
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 400, 16.5F, -15.536F, 33.9145F, 2, 6, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 400, 2.5F, -15.536F, 33.9145F, 2, 6, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 400, -11.5F, -15.536F, 33.9145F, 2, 6, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 9.5F, -39.536F, 33.4145F, 2, 19, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -4.5F, -39.536F, 33.4145F, 2, 19, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -17.5F, -39.536F, 33.4145F, 2, 19, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -24.5F, -13.536F, 33.4145F, 49, 2, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -23.5F, -22.536F, 33.4145F, 48, 2, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -23.5F, -27.536F, 33.4145F, 47, 2, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -22.5F, -32.536F, 33.4145F, 46, 2, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 16.5F, -39.536F, 33.4145F, 2, 37, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, 2.5F, -39.536F, 33.4145F, 2, 37, 1, 0.0F, true));
        Belt65_r1.cubeList.add(new ModelBox(Belt65_r1, 200, 300, -11.5F, -39.536F, 33.4145F, 2, 37, 1, 0.0F, true));

        Belt55_r1 = new ModelRenderer(this);
        Belt55_r1.setRotationPoint(-3.6675F, 0.0344F, 2.0957F);
        belts.addChild(Belt55_r1);
        setRotationAngle(Belt55_r1, 0.0524F, 0.0F, 0.0F);
        Belt55_r1.cubeList.add(new ModelBox(Belt55_r1, 200, 300, -22.5F, -37.536F, 33.4145F, 45, 2, 1, 0.0F, true));

        Belt54_r1 = new ModelRenderer(this);
        Belt54_r1.setRotationPoint(-3.6675F, -1.3814F, -2.1634F);
        belts.addChild(Belt54_r1);
        setRotationAngle(Belt54_r1, -0.0524F, 0.0F, 0.0F);
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 400, 16.5F, -14.0695F, -34.876F, 2, 6, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 400, 2.5F, -14.0695F, -34.876F, 2, 6, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 400, -11.5F, -14.0695F, -34.876F, 2, 6, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 9.5F, -38.0695F, -34.376F, 2, 19, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -4.5F, -38.0695F, -34.376F, 2, 19, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -17.5F, -38.0695F, -34.376F, 2, 19, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -24.5F, -12.0695F, -34.376F, 49, 2, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -23.5F, -21.0695F, -34.376F, 48, 2, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -23.5F, -26.0695F, -34.376F, 47, 2, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -22.5F, -31.0695F, -34.376F, 46, 2, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -22.5F, -36.0695F, -34.376F, 45, 2, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 16.5F, -38.0695F, -34.376F, 2, 37, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, 2.5F, -38.0695F, -34.376F, 2, 37, 1, 0.0F, true));
        Belt54_r1.cubeList.add(new ModelBox(Belt54_r1, 200, 300, -11.5F, -38.0695F, -34.376F, 2, 37, 1, 0.0F, true));

        Belt43_r1 = new ModelRenderer(this);
        Belt43_r1.setRotationPoint(-7.2816F, -1.2202F, 0.0F);
        belts.addChild(Belt43_r1);
        setRotationAngle(Belt43_r1, 0.0F, 0.0F, 0.0873F);
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -23.0971F, -14.1537F, 20.0F, 1, 6, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -23.0971F, -14.1537F, 6.0F, 1, 6, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -23.0971F, -14.1537F, -8.0F, 1, 6, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 400, -23.0971F, -14.1537F, -22.0F, 1, 6, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, 26.0F, 1, 19, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, 13.0F, 1, 19, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, -1.0F, 1, 19, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, -28.0F, 1, 19, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, -15.5F, 1, 19, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -36.1537F, -34.0F, 1, 2, 68, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -31.1537F, -34.0F, 1, 2, 68, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -26.1537F, -34.0F, 1, 2, 68, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -21.1537F, -35.0F, 1, 2, 70, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -12.1537F, -35.0F, 1, 2, 70, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, 20.0F, 1, 37, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, 6.0F, 1, 37, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, -8.0F, 1, 37, 2, 0.0F, true));
        Belt43_r1.cubeList.add(new ModelBox(Belt43_r1, 200, 300, -22.5971F, -38.1537F, -22.0F, 1, 37, 2, 0.0F, true));

        Belt14_r1 = new ModelRenderer(this);
        Belt14_r1.setRotationPoint(-0.0436F, 0.0019F, 0.0F);
        belts.addChild(Belt14_r1);
        setRotationAngle(Belt14_r1, 0.0F, 0.0F, -0.0873F);
        Belt14_r1.cubeList.add(new ModelBox(Belt14_r1, 200, 300, 21.6542F, -38.9615F, 20.0F, 1, 37, 2, 0.0F, true));

        CardboardBox = new ModelRenderer(this);
        CardboardBox.setRotationPoint(0.0F, 24.0F, 0.0F);
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 5.5F, -14.0F, -34.0F, 18, 12, 24, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 5.5F, -14.0F, -9.5F, 18, 12, 24, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -9.5F, -14.0F, 15.0F, 33, 12, 19, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -22.5F, -14.0F, -34.0F, 27, 12, 48, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -22.5F, -14.0F, 15.0F, 12, 12, 19, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -3.5F, -26.1F, -14.0F, 27, 12, 24, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 5.5F, -26.1F, 11.0F, 18, 12, 23, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -22.0F, -26.1F, -34.0F, 18, 12, 24, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -3.5F, -26.1F, -34.0F, 27, 12, 19, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -22.5F, -26.1F, -9.5F, 18, 12, 33, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -4.0F, -26.1F, 11.0F, 9, 12, 23, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -22.5F, -26.1F, 24.0F, 18, 12, 10, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -21.5F, -38.2F, 8.0F, 25, 12, 25, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 4.5F, -38.2F, -33.0F, 18, 12, 24, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -8.0F, -38.2F, -33.0F, 12, 12, 24, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -21.5F, -38.2F, -33.0F, 13, 12, 40, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, -7.5F, -38.2F, -8.5F, 30, 12, 16, 0.0F, true));
        CardboardBox.cubeList.add(new ModelBox(CardboardBox, 0, 300, 4.5F, -38.2F, 8.0F, 18, 12, 25, 0.0F, true));

        shape = new ModelRenderer(this);
        shape.setRotationPoint(0.0F, 24.0F, 0.0F);
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, 29.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -25.5F, -2.0F, -36.0F, 51, 2, 72, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -23.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -16.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -9.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -2.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, 4.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, 11.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, 18.5F, -1.5F, -37.0F, 5, 1, 74, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, -34.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, -27.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, -20.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, -13.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, 1.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, -6.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, 8.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, 15.0F, 53, 1, 5, 0.0F, true));
        shape.cubeList.add(new ModelBox(shape, 0, 0, -26.5F, -1.5F, 22.0F, 53, 1, 5, 0.0F, true));

        lock = new ModelRenderer(this);
        lock.setRotationPoint(0.0F, 24.0F, 0.0F);
        lock.cubeList.add(new ModelBox(lock, 0, 0, -26.0F, -1.8F, 33.5F, 52, 1, 2, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 100, -24.8F, -1.8F, -36.5F, 2, 1, 73, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 100, -11.5F, -1.8F, -36.5F, 2, 1, 73, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 100, 2.5F, -1.8F, -36.5F, 2, 1, 73, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 100, 16.5F, -1.8F, -36.5F, 2, 1, 73, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 100, 23.2F, -1.8F, -36.5F, 2, 1, 73, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 0, -26.0F, -1.8F, -35.3F, 52, 1, 2, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 0, -26.0F, -1.8F, -22.0F, 52, 1, 2, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 0, -26.0F, -1.8F, -8.0F, 52, 1, 2, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 0, -26.0F, -1.8F, 6.0F, 52, 1, 2, 0.0F, true));
        lock.cubeList.add(new ModelBox(lock, 0, 0, -26.0F, -1.8F, 20.0F, 52, 1, 2, 0.0F, true));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        belts.render(scale);
        CardboardBox.render(scale);
        shape.render(scale);
        lock.render(scale);
    }
}
