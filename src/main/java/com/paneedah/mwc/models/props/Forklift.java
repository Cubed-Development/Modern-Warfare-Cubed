package com.paneedah.mwc.models.props;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 3.5.4 // Todo: Braiam, optimize model
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class Forklift extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer bone52;
    private final ModelRenderer bone3;
    private final ModelRenderer bone2;
    private final ModelRenderer bone7;
    private final ModelRenderer bone40;
    private final ModelRenderer bone41;
    private final ModelRenderer bone10;
    private final ModelRenderer bone12;
    private final ModelRenderer bone14;
    private final ModelRenderer bone11;
    private final ModelRenderer bone20;
    private final ModelRenderer bone26;
    private final ModelRenderer bone28;
    private final ModelRenderer bone27;
    private final ModelRenderer bone21;
    private final ModelRenderer bone35;
    private final ModelRenderer bone36;
    private final ModelRenderer bone37;
    private final ModelRenderer bone24;
    private final ModelRenderer bone25;
    private final ModelRenderer bone22;
    private final ModelRenderer bone16;
    private final ModelRenderer bone17;
    private final ModelRenderer bone18;
    private final ModelRenderer bone33;
    private final ModelRenderer bone34;
    private final ModelRenderer bone19;
    private final ModelRenderer bone13;
    private final ModelRenderer bone15;
    private final ModelRenderer bone9;
    private final ModelRenderer bone42;
    private final ModelRenderer bone44;
    private final ModelRenderer bone45;
    private final ModelRenderer bone46;
    private final ModelRenderer bone43;
    private final ModelRenderer bone8;
    private final ModelRenderer bone31;
    private final ModelRenderer bone32;
    private final ModelRenderer bone38;
    private final ModelRenderer bone39;
    private final ModelRenderer bone23;
    private final ModelRenderer bone47;
    private final ModelRenderer bone48;
    private final ModelRenderer bone49;
    private final ModelRenderer bone4;
    private final ModelRenderer bone5;
    private final ModelRenderer bone6;
    private final ModelRenderer bone29;
    private final ModelRenderer bone30;
    private final ModelRenderer bone50;
    private final ModelRenderer bone51;
    private final ModelRenderer bone53;
    private final ModelRenderer bone54;
    private final ModelRenderer bone55;
    private final ModelRenderer bone56;
    private final ModelRenderer bone57;
    private final ModelRenderer bone58;
    private final ModelRenderer bone59;
    private final ModelRenderer bone60;
    private final ModelRenderer bone61;
    private final ModelRenderer bone62;
    private final ModelRenderer bone63;

    public Forklift() {
        textureWidth = 128;
        textureHeight = 128;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-1.0F, 24.0F, 0.0F);
        bone.cubeList.add(new ModelBox(bone, 101, 92, 3.0F, -9.83F, -4.83F, 3, 3, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 58, 9, 4.25F, -6.83F, -4.83F, 1, 4, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 18, -7.75F, -6.83F, -4.83F, 1, 4, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 45, 101, 3.0F, -3.17F, -4.83F, 3, 3, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 20, 106, 3.0F, -7.0F, -1.0F, 3, 4, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 104, 60, 3.0F, -7.0F, -7.66F, 3, 4, 3, 0.0F, false));

        bone52 = new ModelRenderer(this);
        bone52.setRotationPoint(-7.75F, -5.0F, -2.85F);
        bone.addChild(bone52);
        setRotationAngle(bone52, -0.7854F, 0.0F, 0.0F);
        bone52.cubeList.add(new ModelBox(bone52, 67, 61, -0.5F, -1.0F, -1.0F, 14, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 8, 54, 3.0F, -4.7071F, -1.2929F, 7, 6, 4, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 70, 48, 0.0F, -15.7F, 14.75F, 13, 2, 2, 0.0F, false));
        bone52.cubeList.add(new ModelBox(bone52, 36, 40, 3.0F, -16.8768F, 8.8661F, 7, 5, 8, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(6.0F, -7.0F, -7.66F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.7854F, 0.0F, 0.0F);
        bone3.cubeList.add(new ModelBox(bone3, 100, 73, -2.99F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(4.0F, -6.0F, 2.0F);
        bone.addChild(bone2);
        setRotationAngle(bone2, 0.7854F, 0.0F, 0.0F);
        bone2.cubeList.add(new ModelBox(bone2, 105, 12, -0.99F, -4.7071F, -2.2929F, 3, 4, 3, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 101, 82, -0.99F, -0.8787F, -6.1213F, 3, 3, 4, 0.0F, false));
        bone2.cubeList.add(new ModelBox(bone2, 56, 105, -0.99F, -4.7071F, -8.9497F, 3, 4, 3, 0.0F, false));

        bone7 = new ModelRenderer(this);
        bone7.setRotationPoint(4.5F, 20.0F, 2.5F);
        bone7.cubeList.add(new ModelBox(bone7, 45, 85, -1.75F, -3.5F, -0.2F, 2, 5, 1, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 18, -13.25F, -3.5F, 0.8F, 13, 2, 11, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 0, -12.25F, -6.5F, -3.2F, 11, 3, 15, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 37, 0, -13.25F, -5.5F, 5.65F, 13, 2, 7, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 0, 31, -13.25F, -6.5F, 5.8F, 13, 1, 9, 0.0F, false));
        bone7.cubeList.add(new ModelBox(bone7, 92, 34, -2.75F, -7.035F, -7.735F, 3, 1, 5, 0.0F, false));

        bone40 = new ModelRenderer(this);
        bone40.setRotationPoint(-1.25F, -10.0F, 6.25F);
        bone7.addChild(bone40);
        setRotationAngle(bone40, 0.2618F, 0.0F, 0.0F);
        bone40.cubeList.add(new ModelBox(bone40, 48, 22, -11.0F, -0.4529F, -1.6904F, 11, 2, 6, 0.0F, false));

        bone41 = new ModelRenderer(this);
        bone41.setRotationPoint(-1.25F, -10.0F, 5.25F);
        bone7.addChild(bone41);
        setRotationAngle(bone41, -0.1745F, 0.0F, 0.0F);
        bone41.cubeList.add(new ModelBox(bone41, 73, 9, -11.0F, 0.1941F, -0.7244F, 11, 4, 3, 0.0F, false));

        bone10 = new ModelRenderer(this);
        bone10.setRotationPoint(-12.5F, 0.0F, 0.0F);
        bone7.addChild(bone10);
        bone10.cubeList.add(new ModelBox(bone10, 37, 0, -1.25F, -3.5F, -0.2F, 2, 5, 1, 0.0F, false));
        bone10.cubeList.add(new ModelBox(bone10, 37, 22, -1.25F, -7.035F, -7.735F, 3, 1, 5, 0.0F, false));

        bone12 = new ModelRenderer(this);
        bone12.setRotationPoint(-0.25F, -1.5F, 4.5F);
        bone10.addChild(bone12);
        setRotationAngle(bone12, 0.0F, 0.0F, -0.3491F);


        bone14 = new ModelRenderer(this);
        bone14.setRotationPoint(0.5F, -3.5F, 0.8F);
        bone10.addChild(bone14);
        setRotationAngle(bone14, 0.7854F, 0.0F, 0.0F);
        bone14.cubeList.add(new ModelBox(bone14, 35, 31, -1.75F, -5.0F, -1.0F, 3, 5, 1, 0.0F, false));

        bone11 = new ModelRenderer(this);
        bone11.setRotationPoint(-13.25F, -1.5F, 0.8F);
        bone7.addChild(bone11);
        setRotationAngle(bone11, 0.0F, 0.0F, -0.3491F);
        bone11.cubeList.add(new ModelBox(bone11, 54, 61, 0.0F, 0.0F, 0.0F, 1, 3, 11, 0.0F, false));

        bone20 = new ModelRenderer(this);
        bone20.setRotationPoint(-1.25F, -5.5F, 14.8F);
        bone7.addChild(bone20);
        setRotationAngle(bone20, -0.5236F, 0.0F, 0.0F);
        bone20.cubeList.add(new ModelBox(bone20, 76, 21, -12.0F, 0.5F, -1.866F, 13, 4, 1, 0.0F, false));

        bone26 = new ModelRenderer(this);
        bone26.setRotationPoint(-13.25F, -6.5F, 6.8F);
        bone7.addChild(bone26);
        setRotationAngle(bone26, -0.1396F, 0.0F, -1.3963F);
        bone26.cubeList.add(new ModelBox(bone26, 0, 41, 0.0F, 0.0F, 0.0F, 3, 1, 12, 0.0F, false));
        bone26.cubeList.add(new ModelBox(bone26, 45, 75, 3.0F, 0.0F, 3.0F, 3, 1, 9, 0.0F, false));

        bone28 = new ModelRenderer(this);
        bone28.setRotationPoint(-13.25F, -6.5F, 6.8F);
        bone7.addChild(bone28);
        setRotationAngle(bone28, -0.1396F, 0.0F, 1.3963F);
        bone28.cubeList.add(new ModelBox(bone28, 40, 9, -0.7838F, -12.7062F, -1.7857F, 3, 1, 12, 0.0F, false));
        bone28.cubeList.add(new ModelBox(bone28, 8, 72, -3.7838F, -12.7062F, 1.2143F, 3, 1, 9, 0.0F, false));

        bone27 = new ModelRenderer(this);
        bone27.setRotationPoint(-0.9926F, -6.3F, 6.5818F);
        bone7.addChild(bone27);
        setRotationAngle(bone27, -0.1396F, 0.0F, 1.3963F);


        bone21 = new ModelRenderer(this);
        bone21.setRotationPoint(-1.62F, -11.52F, 18.18F);
        bone7.addChild(bone21);
        setRotationAngle(bone21, 0.0F, -0.9599F, 0.0F);
        bone21.cubeList.add(new ModelBox(bone21, 96, 46, -1.0F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        bone35 = new ModelRenderer(this);
        bone35.setRotationPoint(-1.62F, -12.52F, 18.18F);
        bone7.addChild(bone35);
        setRotationAngle(bone35, 0.7854F, -0.6283F, -1.0472F);
        bone35.cubeList.add(new ModelBox(bone35, 17, 99, -1.0F, -2.0F, 0.32F, 1, 2, 5, 0.0F, false));
        bone35.cubeList.add(new ModelBox(bone35, 105, 19, -1.0F, -4.0F, 0.32F, 1, 2, 4, 0.0F, false));

        bone36 = new ModelRenderer(this);
        bone36.setRotationPoint(-11.87F, -12.52F, 18.18F);
        bone7.addChild(bone36);
        setRotationAngle(bone36, 0.7854F, 0.6283F, 1.0472F);
        bone36.cubeList.add(new ModelBox(bone36, 81, 52, 0.0F, -2.0F, 0.32F, 1, 2, 5, 0.0F, false));
        bone36.cubeList.add(new ModelBox(bone36, 67, 65, 0.0F, -4.0F, 0.32F, 1, 2, 4, 0.0F, false));

        bone37 = new ModelRenderer(this);
        bone37.setRotationPoint(-7.37F, -15.02F, 16.68F);
        bone7.addChild(bone37);
        setRotationAngle(bone37, -0.6981F, 0.0F, 0.0F);
        bone37.cubeList.add(new ModelBox(bone37, 110, 110, 0.12F, -1.0F, 1.32F, 1, 1, 4, 0.0F, false));

        bone24 = new ModelRenderer(this);
        bone24.setRotationPoint(-1.62F, -5.52F, 18.18F);
        bone7.addChild(bone24);
        setRotationAngle(bone24, 0.384F, -0.6109F, 0.0F);
        bone24.cubeList.add(new ModelBox(bone24, 68, 109, -1.7F, -1.0F, 0.2F, 2, 8, 2, 0.0F, false));

        bone25 = new ModelRenderer(this);
        bone25.setRotationPoint(-11.62F, -5.52F, 17.93F);
        bone7.addChild(bone25);
        setRotationAngle(bone25, 0.384F, 0.6109F, 0.0F);
        bone25.cubeList.add(new ModelBox(bone25, 8, 71, -0.7F, -1.0F, 0.2F, 2, 8, 2, 0.0F, false));

        bone22 = new ModelRenderer(this);
        bone22.setRotationPoint(-11.85F, -11.52F, 18.18F);
        bone7.addChild(bone22);
        setRotationAngle(bone22, 0.0F, 0.9599F, 0.0F);
        bone22.cubeList.add(new ModelBox(bone22, 93, 96, -0.05F, -1.0F, 0.0F, 1, 1, 6, 0.0F, false));

        bone16 = new ModelRenderer(this);
        bone16.setRotationPoint(-1.25F, -9.5F, 6.8F);
        bone7.addChild(bone16);
        setRotationAngle(bone16, -0.3491F, 0.0F, 0.0F);
        bone16.cubeList.add(new ModelBox(bone16, 70, 40, -12.0F, 0.0F, 0.0F, 13, 7, 1, 0.0F, false));

        bone17 = new ModelRenderer(this);
        bone17.setRotationPoint(-1.25F, -9.5F, 6.8F);
        bone7.addChild(bone17);
        setRotationAngle(bone17, 0.2618F, 0.0F, 0.0F);
        bone17.cubeList.add(new ModelBox(bone17, 35, 31, -12.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F, false));

        bone18 = new ModelRenderer(this);
        bone18.setRotationPoint(1.0F, 0.6387F, 7.945F);
        bone17.addChild(bone18);
        setRotationAngle(bone18, 0.0F, -0.3491F, 0.0F);
        bone18.cubeList.add(new ModelBox(bone18, 110, 30, -0.98F, -0.6387F, 0.055F, 1, 1, 4, 0.0F, false));

        bone33 = new ModelRenderer(this);
        bone33.setRotationPoint(1.0F, 0.02F, 7.945F);
        bone17.addChild(bone33);
        setRotationAngle(bone33, 0.192F, -0.288F, -0.6109F);
        bone33.cubeList.add(new ModelBox(bone33, 33, 102, -1.9741F, -4.0F, 0.0713F, 2, 4, 4, 0.0F, false));

        bone34 = new ModelRenderer(this);
        bone34.setRotationPoint(-12.0F, 0.02F, 7.945F);
        bone17.addChild(bone34);
        setRotationAngle(bone34, 0.192F, 0.288F, 0.6109F);
        bone34.cubeList.add(new ModelBox(bone34, 8, 102, 0.0259F, -4.0F, 0.0713F, 2, 4, 4, 0.0F, false));

        bone19 = new ModelRenderer(this);
        bone19.setRotationPoint(-12.0F, 0.6387F, 7.945F);
        bone17.addChild(bone19);
        setRotationAngle(bone19, 0.0F, 0.3491F, 0.0F);
        bone19.cubeList.add(new ModelBox(bone19, 110, 25, -0.02F, -0.6387F, 0.055F, 1, 1, 4, 0.0F, false));

        bone13 = new ModelRenderer(this);
        bone13.setRotationPoint(-13.25F, -5.5F, 14.8F);
        bone7.addChild(bone13);
        setRotationAngle(bone13, 0.0F, 0.3491F, 0.0F);
        bone13.cubeList.add(new ModelBox(bone13, 110, 77, 0.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        bone15 = new ModelRenderer(this);
        bone15.setRotationPoint(-0.25F, -5.5F, 14.8F);
        bone7.addChild(bone15);
        setRotationAngle(bone15, 0.0F, -0.3491F, 0.0F);
        bone15.cubeList.add(new ModelBox(bone15, 110, 72, -1.0F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        bone9 = new ModelRenderer(this);
        bone9.setRotationPoint(-0.25F, -1.5F, 4.5F);
        bone7.addChild(bone9);
        setRotationAngle(bone9, 0.0F, 0.0F, 0.3491F);
        bone9.cubeList.add(new ModelBox(bone9, 67, 67, -1.0F, 0.0F, -3.7F, 1, 3, 11, 0.0F, false));

        bone42 = new ModelRenderer(this);
        bone42.setRotationPoint(-0.75F, -19.25F, -1.9F);
        bone7.addChild(bone42);
        setRotationAngle(bone42, 1.1345F, 0.0F, 0.0F);
        bone42.cubeList.add(new ModelBox(bone42, 79, 96, -1.25F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 71, 95, -11.75F, 0.0F, 0.0F, 1, 1, 6, 0.0F, false));
        bone42.cubeList.add(new ModelBox(bone42, 82, 28, -11.0F, -0.15F, 5.0F, 10, 1, 1, 0.0F, false));

        bone44 = new ModelRenderer(this);
        bone44.setRotationPoint(-1.0F, -12.0F, -3.25F);
        bone7.addChild(bone44);
        setRotationAngle(bone44, -0.2618F, 0.0F, 0.0F);
        bone44.cubeList.add(new ModelBox(bone44, 80, 65, -11.25F, -0.5477F, 0.1121F, 11, 6, 2, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 45, 108, -11.5F, -7.3536F, -0.6124F, 1, 13, 1, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 106, 106, -1.0F, -7.3536F, -0.6124F, 1, 13, 1, 0.0F, false));
        bone44.cubeList.add(new ModelBox(bone44, 80, 73, -11.25F, -0.5477F, 2.1121F, 11, 1, 1, 0.0F, false));

        bone45 = new ModelRenderer(this);
        bone45.setRotationPoint(0.25F, -10.75F, -0.37F);
        bone7.addChild(bone45);
        setRotationAngle(bone45, -2.3562F, 0.0F, 0.0F);
        bone45.cubeList.add(new ModelBox(bone45, 18, 41, -12.5F, 0.0F, 0.0F, 11, 1, 2, 0.0F, false));

        bone46 = new ModelRenderer(this);
        bone46.setRotationPoint(0.25F, -9.0F, -1.87F);
        bone7.addChild(bone46);
        setRotationAngle(bone46, -1.2217F, 0.0F, 0.0F);
        bone46.cubeList.add(new ModelBox(bone46, 54, 54, -12.5F, 0.0F, 0.0F, 11, 2, 5, 0.0F, false));

        bone43 = new ModelRenderer(this);
        bone43.setRotationPoint(-1.0F, -12.0F, -3.25F);
        bone7.addChild(bone43);
        setRotationAngle(bone43, -0.6109F, 0.0F, 0.0F);
        bone43.cubeList.add(new ModelBox(bone43, 60, 75, -11.0F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 0, 31, -1.5F, 0.0F, 0.0F, 1, 7, 2, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 96, 110, -3.5F, 1.5F, -1.0F, 2, 2, 3, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 86, 110, -10.0F, 1.5F, -1.0F, 2, 2, 3, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 8, 95, -9.75F, 2.0F, -7.0F, 1, 1, 6, 0.0F, false));
        bone43.cubeList.add(new ModelBox(bone43, 49, 94, -2.75F, 2.0F, -7.0F, 1, 1, 6, 0.0F, false));

        bone8 = new ModelRenderer(this);
        bone8.setRotationPoint(0.5F, -3.5F, 0.8F);
        bone7.addChild(bone8);
        setRotationAngle(bone8, 0.7854F, 0.0F, 0.0F);
        bone8.cubeList.add(new ModelBox(bone8, 8, 64, -2.25F, -5.0F, -1.0F, 2, 5, 1, 0.0F, false));

        bone31 = new ModelRenderer(this);
        bone31.setRotationPoint(-0.25F, -9.5F, 6.8F);
        bone7.addChild(bone31);
        setRotationAngle(bone31, 0.2269F, 0.1309F, -0.5236F);
        bone31.cubeList.add(new ModelBox(bone31, 0, 92, -2.0F, -4.0F, 3.0F, 2, 4, 5, 0.0F, false));

        bone32 = new ModelRenderer(this);
        bone32.setRotationPoint(-2.25F, -13.25F, 7.8F);
        bone7.addChild(bone32);
        setRotationAngle(bone32, 0.2618F, 0.0F, 0.0F);
        bone32.cubeList.add(new ModelBox(bone32, 69, 30, -9.0F, -0.06F, 1.04F, 9, 4, 5, 0.0F, false));

        bone38 = new ModelRenderer(this);
        bone38.setRotationPoint(-10.75F, -13.81F, 13.84F);
        bone7.addChild(bone38);
        setRotationAngle(bone38, 0.2618F, 0.6632F, 0.2094F);
        bone38.cubeList.add(new ModelBox(bone38, 57, 91, -0.1903F, -1.066F, -0.1604F, 4, 1, 6, 0.0F, false));

        bone39 = new ModelRenderer(this);
        bone39.setRotationPoint(-2.5F, -13.81F, 13.84F);
        bone7.addChild(bone39);
        setRotationAngle(bone39, 0.2618F, -0.6632F, -0.2094F);
        bone39.cubeList.add(new ModelBox(bone39, 8, 64, -4.0F, -1.09F, 0.0F, 4, 1, 6, 0.0F, false));

        bone23 = new ModelRenderer(this);
        bone23.setRotationPoint(-13.25F, -9.5F, 6.8F);
        bone7.addChild(bone23);
        setRotationAngle(bone23, 0.2269F, -0.1309F, 0.5236F);
        bone23.cubeList.add(new ModelBox(bone23, 91, 77, 0.0F, -4.0F, 3.0F, 2, 4, 5, 0.0F, false));

        bone47 = new ModelRenderer(this);
        bone47.setRotationPoint(-0.75F, -24.0F, 2.1F);
        bone7.addChild(bone47);
        bone47.cubeList.add(new ModelBox(bone47, 0, 82, -1.25F, -0.75F, -1.5F, 1, 1, 9, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 80, 75, -11.0F, -0.65F, 6.4F, 10, 1, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 43, 53, -4.0F, -0.4F, 6.65F, 2, 1, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 6, 50, -10.0F, -0.4F, 6.65F, 2, 1, 1, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 86, 52, -10.0F, -0.6F, -1.35F, 1, 1, 8, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 45, 85, -8.25F, -0.6F, -1.35F, 1, 1, 8, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 35, 84, -6.5F, -0.6F, -1.35F, 1, 1, 8, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 12, 84, -4.75F, -0.6F, -1.35F, 1, 1, 8, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 71, 81, -3.0F, -0.6F, -1.35F, 1, 1, 8, 0.0F, false));
        bone47.cubeList.add(new ModelBox(bone47, 80, 81, -11.75F, -0.75F, -1.5F, 1, 1, 9, 0.0F, false));

        bone48 = new ModelRenderer(this);
        bone48.setRotationPoint(0.0F, -0.75F, 7.5F);
        bone47.addChild(bone48);
        setRotationAngle(bone48, -1.2217F, 0.0F, 0.0F);
        bone48.cubeList.add(new ModelBox(bone48, 103, 99, -1.25F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
        bone48.cubeList.add(new ModelBox(bone48, 103, 33, -11.75F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        bone49 = new ModelRenderer(this);
        bone49.setRotationPoint(0.0F, 3.95F, 9.2F);
        bone47.addChild(bone49);
        setRotationAngle(bone49, -1.4835F, 0.0F, 0.0F);
        bone49.cubeList.add(new ModelBox(bone49, 60, 81, -1.25F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 23, 81, -11.75F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));
        bone49.cubeList.add(new ModelBox(bone49, 70, 0, -12.0F, -0.4801F, 6.2055F, 12, 2, 3, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(-12.5F, 24.0F, 0.0F);
        bone4.cubeList.add(new ModelBox(bone4, 100, 26, 3.0F, -9.83F, -4.83F, 3, 3, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 98, 5, 3.0F, -3.17F, -4.83F, 3, 3, 4, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 104, 40, 3.0F, -7.0F, -1.0F, 3, 4, 3, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 94, 103, 3.0F, -7.0F, -7.66F, 3, 4, 3, 0.0F, false));

        bone5 = new ModelRenderer(this);
        bone5.setRotationPoint(6.0F, -7.0F, -7.66F);
        bone4.addChild(bone5);
        setRotationAngle(bone5, 0.7854F, 0.0F, 0.0F);
        bone5.cubeList.add(new ModelBox(bone5, 59, 98, -3.001F, 0.0F, 0.0F, 3, 3, 4, 0.0F, false));

        bone6 = new ModelRenderer(this);
        bone6.setRotationPoint(4.0F, -6.0F, 2.0F);
        bone4.addChild(bone6);
        setRotationAngle(bone6, 0.7854F, 0.0F, 0.0F);
        bone6.cubeList.add(new ModelBox(bone6, 82, 103, -1.001F, -4.7071F, -2.2929F, 3, 4, 3, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 96, 53, -1.001F, -0.8787F, -6.1213F, 3, 3, 4, 0.0F, false));
        bone6.cubeList.add(new ModelBox(bone6, 70, 102, -1.001F, -4.7071F, -8.9497F, 3, 4, 3, 0.0F, false));

        bone29 = new ModelRenderer(this);
        bone29.setRotationPoint(1.75F, 10.5F, 21.0F);
        setRotationAngle(bone29, 0.2618F, -0.8727F, -0.2269F);
        bone29.cubeList.add(new ModelBox(bone29, 25, 91, -1.1915F, -2.0416F, -0.1552F, 1, 8, 5, 0.0F, false));
        bone29.cubeList.add(new ModelBox(bone29, 54, 61, -1.1915F, 5.9584F, 0.8448F, 1, 4, 4, 0.0F, false));

        bone30 = new ModelRenderer(this);
        bone30.setRotationPoint(-5.75F, 10.5F, 20.0F);
        setRotationAngle(bone30, 0.2618F, 0.8727F, 0.2269F);
        bone30.cubeList.add(new ModelBox(bone30, 0, 0, -0.9F, -1.85F, 0.0F, 1, 8, 5, 0.0F, false));
        bone30.cubeList.add(new ModelBox(bone30, 22, 82, -0.9F, 6.15F, 1.0F, 1, 4, 4, 0.0F, false));

        bone50 = new ModelRenderer(this);
        bone50.setRotationPoint(0.75F, 5.75F, -8.75F);
        bone50.cubeList.add(new ModelBox(bone50, 88, 52, -0.25F, -1.0F, 0.0F, 1, 3, 2, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 48, 22, -6.75F, -1.0F, 0.0F, 1, 3, 2, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 0, 54, -6.5F, -11.0F, -0.75F, 1, 28, 3, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 4, 101, -9.25F, 2.75F, -1.75F, 1, 15, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 0, 101, 2.25F, 2.75F, -1.75F, 1, 15, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 76, 26, -8.5F, 2.0F, -1.75F, 11, 1, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 73, 16, -8.5F, 15.5F, -1.5F, 11, 2, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 18, 44, -8.5F, 11.5F, -1.5F, 11, 2, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 59, 112, 1.0F, 3.0F, -1.75F, 1, 9, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 55, 112, -1.0F, 3.0F, -1.75F, 1, 9, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 39, 110, -8.0F, 3.0F, -1.75F, 1, 9, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 98, 40, -6.0F, 3.0F, -1.75F, 1, 9, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 49, 108, -7.75F, 8.75F, -2.75F, 2, 9, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 23, 71, -0.25F, 8.75F, -2.75F, 2, 9, 1, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 58, 9, -0.25F, 17.0F, -13.75F, 2, 1, 11, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 55, 42, -7.75F, 17.0F, -13.75F, 2, 1, 11, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 30, 50, -5.25F, -11.0F, -0.75F, 1, 28, 3, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 46, 53, -0.5F, -11.0F, -0.75F, 1, 28, 3, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 38, 53, -1.75F, -11.0F, -0.75F, 1, 28, 3, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 71, 91, -6.5F, -10.85F, 2.25F, 7, 1, 3, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 87, 96, -6.75F, -10.75F, -0.25F, 1, 1, 5, 0.0F, false));
        bone50.cubeList.add(new ModelBox(bone50, 18, 47, -0.25F, -10.75F, -0.25F, 1, 1, 5, 0.0F, false));

        bone51 = new ModelRenderer(this);
        bone51.setRotationPoint(3.0F, 2.75F, -1.75F);
        bone50.addChild(bone51);
        setRotationAngle(bone51, 0.0F, 0.0F, -0.7854F);
        bone51.cubeList.add(new ModelBox(bone51, 6, 18, -0.8232F, -0.8232F, 0.0F, 1, 1, 1, 0.0F, false));
        bone51.cubeList.add(new ModelBox(bone51, 0, 18, -8.6568F, -8.6668F, 0.0F, 1, 1, 1, 0.0F, false));

        bone53 = new ModelRenderer(this);
        bone53.setRotationPoint(0.0F, 24.0F, 0.0F);
        bone53.cubeList.add(new ModelBox(bone53, 76, 110, 2.5F, -2.25F, 17.25F, 2, 2, 3, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 29, 110, 2.5F, -8.25F, 17.25F, 2, 2, 3, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 37, 93, 3.0F, -6.25F, 16.25F, 1, 4, 5, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 0, 85, 2.5F, -5.75F, 20.75F, 2, 3, 2, 0.0F, false));
        bone53.cubeList.add(new ModelBox(bone53, 34, 84, 2.5F, -5.75F, 14.75F, 2, 3, 2, 0.0F, false));

        bone54 = new ModelRenderer(this);
        bone54.setRotationPoint(4.5F, -5.75F, 22.75F);
        bone53.addChild(bone54);
        setRotationAngle(bone54, -0.7854F, 0.0F, 0.0F);
        bone54.cubeList.add(new ModelBox(bone54, 8, 110, -1.999F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 59, 70, -1.998F, 0.0F, -3.53F, 2, 1, 1, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 11, 82, -1.999F, 2.1213F, 0.1213F, 2, 3, 2, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 63, 18, -1.998F, 4.65F, 1.1213F, 2, 1, 1, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 108, 2, -1.999F, 5.7782F, -3.5355F, 2, 2, 3, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 64, 40, -1.998F, 6.7782F, -1.0F, 2, 1, 1, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 81, 81, -1.999F, 2.6569F, -5.6569F, 2, 3, 2, 0.0F, false));
        bone54.cubeList.add(new ModelBox(bone54, 54, 69, -1.998F, 2.12F, -5.6569F, 2, 1, 1, 0.0F, false));

        bone55 = new ModelRenderer(this);
        bone55.setRotationPoint(-11.5F, 24.0F, 0.0F);
        bone55.cubeList.add(new ModelBox(bone55, 107, 52, 2.5F, -2.25F, 17.25F, 2, 2, 3, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 106, 67, 2.5F, -8.25F, 17.25F, 2, 2, 3, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 0, 41, 3.0F, -6.25F, 16.25F, 1, 4, 5, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 71, 81, 2.5F, -5.75F, 20.75F, 2, 3, 2, 0.0F, false));
        bone55.cubeList.add(new ModelBox(bone55, 22, 64, 2.5F, -5.75F, 14.75F, 2, 3, 2, 0.0F, false));

        bone56 = new ModelRenderer(this);
        bone56.setRotationPoint(4.5F, -5.75F, 22.75F);
        bone55.addChild(bone56);
        setRotationAngle(bone56, -0.7854F, 0.0F, 0.0F);
        bone56.cubeList.add(new ModelBox(bone56, 104, 47, -2.01F, 0.0F, -3.0F, 2, 2, 3, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 58, 45, -2.02F, 0.0F, -3.53F, 2, 1, 1, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 58, 40, -2.01F, 2.1213F, 0.1213F, 2, 3, 2, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 58, 17, -2.02F, 4.65F, 1.1213F, 2, 1, 1, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 100, 0, -2.01F, 5.7782F, -3.5355F, 2, 2, 3, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 51, 54, -2.02F, 6.7782F, -1.0F, 2, 1, 1, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 25, 47, -2.01F, 2.6569F, -5.6569F, 2, 3, 2, 0.0F, false));
        bone56.cubeList.add(new ModelBox(bone56, 5, 54, -2.02F, 2.12F, -5.6569F, 2, 1, 1, 0.0F, false));

        bone57 = new ModelRenderer(this);
        bone57.setRotationPoint(-1.75F, 10.0F, 7.25F);
        bone57.cubeList.add(new ModelBox(bone57, 93, 16, -2.5F, -1.0F, 0.0F, 4, 1, 4, 0.0F, false));

        bone58 = new ModelRenderer(this);
        bone58.setRotationPoint(-1.0F, -0.5F, -0.5F);
        bone57.addChild(bone58);
        setRotationAngle(bone58, 0.0873F, 0.0F, 0.0F);
        bone58.cubeList.add(new ModelBox(bone58, 87, 91, -2.0F, -1.0F, 0.0F, 5, 1, 4, 0.0F, false));
        bone58.cubeList.add(new ModelBox(bone58, 0, 13, -1.5F, -1.1F, -0.5019F, 4, 1, 1, 0.0F, false));

        bone59 = new ModelRenderer(this);
        bone59.setRotationPoint(-2.0F, -1.0F, 2.5F);
        bone57.addChild(bone59);
        setRotationAngle(bone59, -0.1745F, 0.0F, 0.0F);
        bone59.cubeList.add(new ModelBox(bone59, 37, 9, -1.0F, -5.0F, 0.0F, 5, 5, 1, 0.0F, false));
        bone59.cubeList.add(new ModelBox(bone59, 0, 26, -0.5F, -5.7104F, -0.05F, 4, 1, 1, 0.0F, false));

        bone60 = new ModelRenderer(this);
        bone60.setRotationPoint(2.25F, -4.5F, 3.0F);
        bone57.addChild(bone60);
        setRotationAngle(bone60, -0.2618F, 0.0F, 0.0F);
        bone60.cubeList.add(new ModelBox(bone60, 37, 21, -1.0F, -1.0F, -0.1F, 1, 4, 1, 0.0F, false));
        bone60.cubeList.add(new ModelBox(bone60, 0, 0, -5.5F, -1.0F, -0.1F, 1, 4, 1, 0.0F, false));

        bone61 = new ModelRenderer(this);
        bone61.setRotationPoint(0.0F, -0.75F, -7.25F);
        bone57.addChild(bone61);
        setRotationAngle(bone61, 0.0873F, 0.0F, 0.0F);
        bone61.cubeList.add(new ModelBox(bone61, 77, 5, -5.0F, -2.0F, 0.0F, 9, 2, 2, 0.0F, false));

        bone62 = new ModelRenderer(this);
        bone62.setRotationPoint(0.0F, -2.75F, -6.0F);
        bone57.addChild(bone62);
        setRotationAngle(bone62, -0.3491F, 0.0F, 0.0F);
        bone62.cubeList.add(new ModelBox(bone62, 55, 85, -2.5F, -2.171F, -0.5302F, 4, 3, 2, 0.0F, false));
        bone62.cubeList.add(new ModelBox(bone62, 7, 0, -1.5F, -1.5517F, -0.0387F, 2, 3, 2, 0.0F, false));

        bone63 = new ModelRenderer(this);
        bone63.setRotationPoint(0.5F, -5.75F, -5.0F);
        bone57.addChild(bone63);
        setRotationAngle(bone63, -0.7854F, 0.0F, 0.0F);
        bone63.cubeList.add(new ModelBox(bone63, 0, 50, -2.0F, -1.0F, 0.0F, 2, 1, 1, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 35, 37, -2.0F, -1.0F, 2.0F, 2, 1, 1, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 11, 12, -1.5F, -0.6464F, 1.0F, 1, 2, 1, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 43, 18, -2.5F, -1.0F, 0.4F, 1, 1, 2, 0.0F, false));
        bone63.cubeList.add(new ModelBox(bone63, 37, 18, -0.5F, -1.0F, 0.4F, 1, 1, 2, 0.0F, false));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        bone.render(scale);
        bone7.render(scale);
        bone4.render(scale);
        bone29.render(scale);
        bone30.render(scale);
        bone50.render(scale);
        bone53.render(scale);
        bone55.render(scale);
        bone57.render(scale);
    }
}
