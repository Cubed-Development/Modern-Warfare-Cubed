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
public final class Forklift extends ModelBase implements IModernModel {

    private final ModelRenderer wheel;
    private final ModelRenderer bone56_r1;
    private final ModelRenderer wheel2;
    private final ModelRenderer bone52_r1;
    private final ModelRenderer bone54_r1;
    private final ModelRenderer wheel3;
    private final ModelRenderer bone6_r1;
    private final ModelRenderer bone5_r1;
    private final ModelRenderer bone52_r2;
    private final ModelRenderer wheel4;
    private final ModelRenderer bone2_r1;
    private final ModelRenderer bone3_r1;
    private final ModelRenderer fork;
    private final ModelRenderer bone43_r1;
    private final ModelRenderer bone51_r1;
    private final ModelRenderer main;
    private final ModelRenderer bone63_r1;
    private final ModelRenderer bone62_r1;
    private final ModelRenderer bone61_r1;
    private final ModelRenderer bone60_r1;
    private final ModelRenderer bone59_r1;
    private final ModelRenderer bone58_r1;
    private final ModelRenderer bone30_r1;
    private final ModelRenderer bone29_r1;
    private final ModelRenderer bone49_r1;
    private final ModelRenderer bone48_r1;
    private final ModelRenderer bone23_r1;
    private final ModelRenderer bone39_r1;
    private final ModelRenderer bone38_r1;
    private final ModelRenderer bone32_r1;
    private final ModelRenderer bone31_r1;
    private final ModelRenderer bone8_r1;
    private final ModelRenderer bone43_r2;
    private final ModelRenderer bone46_r1;
    private final ModelRenderer bone45_r1;
    private final ModelRenderer bone44_r1;
    private final ModelRenderer bone42_r1;
    private final ModelRenderer bone9_r1;
    private final ModelRenderer bone15_r1;
    private final ModelRenderer bone13_r1;
    private final ModelRenderer bone19_r1;
    private final ModelRenderer bone34_r1;
    private final ModelRenderer bone33_r1;
    private final ModelRenderer bone18_r1;
    private final ModelRenderer bone17_r1;
    private final ModelRenderer bone16_r1;
    private final ModelRenderer bone22_r1;
    private final ModelRenderer bone25_r1;
    private final ModelRenderer bone24_r1;
    private final ModelRenderer bone37_r1;
    private final ModelRenderer bone36_r1;
    private final ModelRenderer bone35_r1;
    private final ModelRenderer bone21_r1;
    private final ModelRenderer bone28_r1;
    private final ModelRenderer bone26_r1;
    private final ModelRenderer bone20_r1;
    private final ModelRenderer bone11_r1;
    private final ModelRenderer bone41_r1;
    private final ModelRenderer bone40_r1;
    private final ModelRenderer bone52_r3;

    public Forklift() {
        textureWidth = 128;
        textureHeight = 128;

        wheel = new ModelRenderer(this);
        wheel.setRotationPoint(0.0F, 6.2291F, 2.5975F);
        wheel.cubeList.add(new ModelBox(wheel, 107, 52, -9.0F, 15.5209F, 14.6525F, 2, 2, 3, 0.0F, false));
        wheel.cubeList.add(new ModelBox(wheel, 106, 67, -9.0F, 9.5209F, 14.6525F, 2, 2, 3, 0.0F, false));
        wheel.cubeList.add(new ModelBox(wheel, 0, 41, -8.5F, 11.5209F, 13.6525F, 1, 4, 5, 0.0F, false));
        wheel.cubeList.add(new ModelBox(wheel, 71, 81, -9.0F, 12.0209F, 18.1525F, 2, 3, 2, 0.0F, false));
        wheel.cubeList.add(new ModelBox(wheel, 22, 64, -9.0F, 12.0209F, 12.1525F, 2, 3, 2, 0.0F, false));

        bone56_r1 = new ModelRenderer(this);
        bone56_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        wheel.addChild(bone56_r1);
        setRotationAngle(bone56_r1, -0.7854F, 0.0F, 0.0F);
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 5, 54, -9.02F, -3.63F, 17.0931F, 2, 1, 1, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 25, 47, -9.01F, -3.0931F, 17.0931F, 2, 3, 2, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 51, 54, -9.02F, 1.0282F, 21.75F, 2, 1, 1, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 100, 0, -9.01F, 0.0282F, 19.2145F, 2, 2, 3, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 58, 17, -9.02F, -1.1F, 23.8713F, 2, 1, 1, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 58, 40, -9.01F, -3.6287F, 22.8713F, 2, 3, 2, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 58, 45, -9.02F, -5.75F, 19.22F, 2, 1, 1, 0.0F, false));
        bone56_r1.cubeList.add(new ModelBox(bone56_r1, 104, 47, -9.01F, -5.75F, 19.75F, 2, 2, 3, 0.0F, false));

        wheel2 = new ModelRenderer(this);
        wheel2.setRotationPoint(1.0F, 20.2291F, 25.9975F);
        wheel2.cubeList.add(new ModelBox(wheel2, 76, 110, 1.748F, 1.5475F, -9.0258F, 2, 2, 3, 0.0F, false));
        wheel2.cubeList.add(new ModelBox(wheel2, 29, 110, 1.748F, -4.4525F, -9.0258F, 2, 2, 3, 0.0F, false));
        wheel2.cubeList.add(new ModelBox(wheel2, 37, 93, 2.248F, -2.4525F, -10.0258F, 1, 4, 5, 0.0F, false));
        wheel2.cubeList.add(new ModelBox(wheel2, 0, 85, 1.748F, -1.9525F, -5.5258F, 2, 3, 2, 0.0F, false));
        wheel2.cubeList.add(new ModelBox(wheel2, 34, 84, 1.748F, -1.9525F, -11.5258F, 2, 3, 2, 0.0F, false));

        bone52_r1 = new ModelRenderer(this);
        bone52_r1.setRotationPoint(-0.752F, 4.3483F, -30.646F);
        wheel2.addChild(bone52_r1);
        setRotationAngle(bone52_r1, -0.7854F, 0.0F, 0.0F);
        bone52_r1.cubeList.add(new ModelBox(bone52_r1, 70, 48, -8.75F, -20.7F, 11.9F, 13, 2, 2, 0.0F, false));

        bone54_r1 = new ModelRenderer(this);
        bone54_r1.setRotationPoint(-0.752F, -13.9734F, -23.6783F);
        wheel2.addChild(bone54_r1);
        setRotationAngle(bone54_r1, -0.7854F, 0.0F, 0.0F);
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 54, 69, 2.502F, -3.63F, 17.0931F, 2, 1, 1, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 81, 81, 2.501F, -3.0931F, 17.0931F, 2, 3, 2, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 64, 40, 2.502F, 1.0282F, 21.75F, 2, 1, 1, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 108, 2, 2.501F, 0.0282F, 19.2145F, 2, 2, 3, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 63, 18, 2.502F, -1.1F, 23.8713F, 2, 1, 1, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 11, 82, 2.501F, -3.6287F, 22.8713F, 2, 3, 2, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 59, 70, 2.502F, -5.75F, 19.22F, 2, 1, 1, 0.0F, false));
        bone54_r1.cubeList.add(new ModelBox(bone54_r1, 8, 110, 2.501F, -5.75F, 19.75F, 2, 2, 3, 0.0F, false));

        wheel3 = new ModelRenderer(this);
        wheel3.setRotationPoint(0.0F, 24.0F, 0.0F);
        wheel3.cubeList.add(new ModelBox(wheel3, 0, 18, -8.75F, -6.83F, -4.83F, 1, 4, 4, 0.0F, false));
        wheel3.cubeList.add(new ModelBox(wheel3, 98, 5, -9.5F, -3.17F, -4.83F, 3, 3, 4, 0.0F, false));
        wheel3.cubeList.add(new ModelBox(wheel3, 104, 40, -9.5F, -7.0F, -1.0F, 3, 4, 3, 0.0F, false));
        wheel3.cubeList.add(new ModelBox(wheel3, 94, 103, -9.5F, -7.0F, -7.66F, 3, 4, 3, 0.0F, false));
        wheel3.cubeList.add(new ModelBox(wheel3, 100, 26, -9.5F, -9.83F, -4.83F, 3, 3, 4, 0.0F, false));

        bone6_r1 = new ModelRenderer(this);
        bone6_r1.setRotationPoint(0.0F, -0.3432F, 4.8284F);
        wheel3.addChild(bone6_r1);
        setRotationAngle(bone6_r1, 0.7854F, 0.0F, 0.0F);
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 70, 102, -9.501F, -10.7071F, -6.9497F, 3, 4, 3, 0.0F, false));
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 96, 53, -9.501F, -6.8787F, -4.1213F, 3, 3, 4, 0.0F, false));
        bone6_r1.cubeList.add(new ModelBox(bone6_r1, 82, 103, -9.501F, -10.7071F, -0.2929F, 3, 4, 3, 0.0F, false));

        bone5_r1 = new ModelRenderer(this);
        bone5_r1.setRotationPoint(0.0F, -7.4667F, 2.7062F);
        wheel3.addChild(bone5_r1);
        setRotationAngle(bone5_r1, 0.7854F, 0.0F, 0.0F);
        bone5_r1.cubeList.add(new ModelBox(bone5_r1, 59, 98, -9.501F, -7.0F, -7.66F, 3, 3, 4, 0.0F, false));

        bone52_r2 = new ModelRenderer(this);
        bone52_r2.setRotationPoint(0.0F, 0.5508F, -4.3703F);
        wheel3.addChild(bone52_r2);
        setRotationAngle(bone52_r2, -0.7854F, 0.0F, 0.0F);
        bone52_r2.cubeList.add(new ModelBox(bone52_r2, 67, 61, -9.25F, -6.0F, -3.85F, 14, 2, 2, 0.0F, false));

        wheel4 = new ModelRenderer(this);
        wheel4.setRotationPoint(0.0F, 24.0F, 0.0F);
        wheel4.cubeList.add(new ModelBox(wheel4, 101, 92, 2.0F, -9.83F, -4.83F, 3, 3, 4, 0.0F, false));
        wheel4.cubeList.add(new ModelBox(wheel4, 58, 9, 3.25F, -6.83F, -4.83F, 1, 4, 4, 0.0F, false));
        wheel4.cubeList.add(new ModelBox(wheel4, 45, 101, 2.0F, -3.17F, -4.83F, 3, 3, 4, 0.0F, false));
        wheel4.cubeList.add(new ModelBox(wheel4, 20, 106, 2.0F, -7.0F, -1.0F, 3, 4, 3, 0.0F, false));
        wheel4.cubeList.add(new ModelBox(wheel4, 104, 60, 2.0F, -7.0F, -7.66F, 3, 4, 3, 0.0F, false));

        bone2_r1 = new ModelRenderer(this);
        bone2_r1.setRotationPoint(0.0F, -0.3432F, 4.8284F);
        wheel4.addChild(bone2_r1);
        setRotationAngle(bone2_r1, 0.7854F, 0.0F, 0.0F);
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 56, 105, 2.01F, -10.7071F, -6.9497F, 3, 4, 3, 0.0F, false));
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 101, 82, 2.01F, -6.8787F, -4.1213F, 3, 3, 4, 0.0F, false));
        bone2_r1.cubeList.add(new ModelBox(bone2_r1, 105, 12, 2.01F, -10.7071F, -0.2929F, 3, 4, 3, 0.0F, false));

        bone3_r1 = new ModelRenderer(this);
        bone3_r1.setRotationPoint(0.0F, -7.4667F, 2.7062F);
        wheel4.addChild(bone3_r1);
        setRotationAngle(bone3_r1, 0.7854F, 0.0F, 0.0F);
        bone3_r1.cubeList.add(new ModelBox(bone3_r1, 100, 73, 2.01F, -7.0F, -7.66F, 3, 3, 4, 0.0F, false));

        fork = new ModelRenderer(this);
        fork.setRotationPoint(0.0F, 21.5363F, -9.3133F);
        fork.cubeList.add(new ModelBox(fork, 37, 22, -9.25F, -8.5713F, 4.0783F, 3, 1, 5, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 88, 52, 0.5F, -16.7863F, 0.5633F, 1, 3, 2, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 48, 22, -6.0F, -16.7863F, 0.5633F, 1, 3, 2, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 0, 54, -5.75F, -26.7863F, -0.1867F, 1, 28, 3, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 4, 101, -8.5F, -13.0363F, -1.1867F, 1, 15, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 0, 101, 3.0F, -13.0363F, -1.1867F, 1, 15, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 76, 26, -7.75F, -13.7863F, -1.1867F, 11, 1, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 73, 16, -7.75F, -0.2863F, -0.9367F, 11, 2, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 18, 44, -7.75F, -4.2863F, -0.9367F, 11, 2, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 59, 112, 1.75F, -12.7863F, -1.1867F, 1, 9, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 55, 112, -0.25F, -12.7863F, -1.1867F, 1, 9, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 39, 110, -7.25F, -12.7863F, -1.1867F, 1, 9, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 98, 40, -5.25F, -12.7863F, -1.1867F, 1, 9, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 49, 108, -7.0F, -7.0363F, -2.1867F, 2, 9, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 23, 71, 0.5F, -7.0363F, -2.1867F, 2, 9, 1, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 58, 9, 0.5F, 1.2137F, -13.1867F, 2, 1, 11, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 55, 42, -7.0F, 1.2137F, -13.1867F, 2, 1, 11, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 30, 50, -4.5F, -26.7863F, -0.1867F, 1, 28, 3, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 46, 53, 0.25F, -26.7863F, -0.1867F, 1, 28, 3, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 38, 53, -1.0F, -26.7863F, -0.1867F, 1, 28, 3, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 71, 91, -5.75F, -26.6363F, 2.8133F, 7, 1, 3, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 87, 96, -6.0F, -26.5363F, 0.3133F, 1, 1, 5, 0.0F, false));
        fork.cubeList.add(new ModelBox(fork, 18, 47, 0.5F, -26.5363F, 0.3133F, 1, 1, 5, 0.0F, false));

        bone43_r1 = new ModelRenderer(this);
        bone43_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        fork.addChild(bone43_r1);
        setRotationAngle(bone43_r1, -0.6109F, 0.0F, 0.0F);
        bone43_r1.cubeList.add(new ModelBox(bone43_r1, 96, 110, 0.0F, -14.5F, -1.75F, 2, 2, 3, 0.0F, false));
        bone43_r1.cubeList.add(new ModelBox(bone43_r1, 86, 110, -6.5F, -14.5F, -1.75F, 2, 2, 3, 0.0F, false));
        bone43_r1.cubeList.add(new ModelBox(bone43_r1, 49, 94, 0.75F, -14.0F, -7.75F, 1, 1, 6, 0.0F, false));
        bone43_r1.cubeList.add(new ModelBox(bone43_r1, 8, 95, -6.25F, -14.0F, -7.75F, 1, 1, 6, 0.0F, false));

        bone51_r1 = new ModelRenderer(this);
        bone51_r1.setRotationPoint(12.0585F, 0.5755F, 9.3133F);
        fork.addChild(bone51_r1);
        setRotationAngle(bone51_r1, 0.0F, 0.0F, -0.7854F);
        bone51_r1.cubeList.add(new ModelBox(bone51_r1, 0, 18, -4.9068F, -24.1668F, -10.5F, 1, 1, 1, 0.0F, false));
        bone51_r1.cubeList.add(new ModelBox(bone51_r1, 6, 18, 2.9268F, -16.3232F, -10.5F, 1, 1, 1, 0.0F, false));

        main = new ModelRenderer(this);
        main.setRotationPoint(0.0F, 16.6243F, -13.3064F);
        main.cubeList.add(new ModelBox(main, 45, 85, 2.75F, -0.1243F, 15.6064F, 2, 5, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 18, -8.75F, -0.1243F, 16.6064F, 13, 2, 11, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -7.75F, -3.1243F, 12.6064F, 11, 3, 15, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 37, 0, -8.75F, -2.1243F, 21.4564F, 13, 2, 7, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 31, -8.75F, -3.1243F, 21.6064F, 13, 1, 9, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 92, 34, 1.75F, -3.6593F, 8.0714F, 3, 1, 5, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 37, 0, -9.25F, -0.1243F, 15.6064F, 2, 5, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 82, 2.5F, -21.3743F, 16.4064F, 1, 1, 9, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 80, 75, -7.25F, -21.2743F, 24.3064F, 10, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 43, 53, -0.25F, -21.0243F, 24.5564F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 6, 50, -6.25F, -21.0243F, 24.5564F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 86, 52, -6.25F, -21.2243F, 16.5564F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 45, 85, -4.5F, -21.2243F, 16.5564F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 35, 84, -2.75F, -21.2243F, 16.5564F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 12, 84, -1.0F, -21.2243F, 16.5564F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 71, 81, 0.75F, -21.2243F, 16.5564F, 1, 1, 8, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 80, 81, -8.0F, -21.3743F, 16.4064F, 1, 1, 9, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 93, 16, -4.25F, -7.6243F, 20.5564F, 4, 1, 4, 0.0F, false));

        bone63_r1 = new ModelRenderer(this);
        bone63_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        main.addChild(bone63_r1);
        setRotationAngle(bone63_r1, -0.7854F, 0.0F, 0.0F);
        bone63_r1.cubeList.add(new ModelBox(bone63_r1, 37, 18, -1.75F, -20.75F, 2.65F, 1, 1, 2, 0.0F, false));
        bone63_r1.cubeList.add(new ModelBox(bone63_r1, 43, 18, -3.75F, -20.75F, 2.65F, 1, 1, 2, 0.0F, false));
        bone63_r1.cubeList.add(new ModelBox(bone63_r1, 11, 12, -2.75F, -20.3964F, 3.25F, 1, 2, 1, 0.0F, false));
        bone63_r1.cubeList.add(new ModelBox(bone63_r1, 35, 37, -3.25F, -20.75F, 4.25F, 2, 1, 1, 0.0F, false));
        bone63_r1.cubeList.add(new ModelBox(bone63_r1, 0, 50, -3.25F, -20.75F, 2.25F, 2, 1, 1, 0.0F, false));

        bone62_r1 = new ModelRenderer(this);
        bone62_r1.setRotationPoint(0.0F, 5.9377F, 7.6524F);
        main.addChild(bone62_r1);
        setRotationAngle(bone62_r1, -0.3491F, 0.0F, 0.0F);
        bone62_r1.cubeList.add(new ModelBox(bone62_r1, 7, 0, -3.25F, -18.3017F, 1.2113F, 2, 3, 2, 0.0F, false));
        bone62_r1.cubeList.add(new ModelBox(bone62_r1, 55, 85, -4.25F, -18.921F, 0.7198F, 4, 3, 2, 0.0F, false));

        bone61_r1 = new ModelRenderer(this);
        bone61_r1.setRotationPoint(0.0F, 7.3195F, 14.5924F);
        main.addChild(bone61_r1);
        setRotationAngle(bone61_r1, 0.0873F, 0.0F, 0.0F);
        bone61_r1.cubeList.add(new ModelBox(bone61_r1, 77, 5, -6.75F, -16.75F, 0.0F, 9, 2, 2, 0.0F, false));

        bone60_r1 = new ModelRenderer(this);
        bone60_r1.setRotationPoint(0.0F, 4.0924F, 8.8675F);
        main.addChild(bone60_r1);
        setRotationAngle(bone60_r1, -0.2618F, 0.0F, 0.0F);
        bone60_r1.cubeList.add(new ModelBox(bone60_r1, 0, 0, -5.0F, -19.5F, 10.15F, 1, 4, 1, 0.0F, false));
        bone60_r1.cubeList.add(new ModelBox(bone60_r1, 37, 21, -0.5F, -19.5F, 10.15F, 1, 4, 1, 0.0F, false));

        bone59_r1 = new ModelRenderer(this);
        bone59_r1.setRotationPoint(0.0F, 5.4551F, 10.8502F);
        main.addChild(bone59_r1);
        setRotationAngle(bone59_r1, -0.1745F, 0.0F, 0.0F);
        bone59_r1.cubeList.add(new ModelBox(bone59_r1, 0, 26, -4.25F, -20.7104F, 9.7F, 4, 1, 1, 0.0F, false));
        bone59_r1.cubeList.add(new ModelBox(bone59_r1, 37, 9, -4.75F, -20.0F, 9.75F, 5, 5, 1, 0.0F, false));

        bone58_r1 = new ModelRenderer(this);
        bone58_r1.setRotationPoint(0.0F, 7.909F, 14.5963F);
        main.addChild(bone58_r1);
        setRotationAngle(bone58_r1, 0.0873F, 0.0F, 0.0F);
        bone58_r1.cubeList.add(new ModelBox(bone58_r1, 0, 13, -4.25F, -15.6F, 6.2481F, 4, 1, 1, 0.0F, false));
        bone58_r1.cubeList.add(new ModelBox(bone58_r1, 87, 91, -4.75F, -15.5F, 6.75F, 5, 1, 4, 0.0F, false));

        bone30_r1 = new ModelRenderer(this);
        bone30_r1.setRotationPoint(-18.0587F, 9.7295F, 18.7302F);
        main.addChild(bone30_r1);
        setRotationAngle(bone30_r1, 0.2618F, 0.8727F, 0.2269F);
        bone30_r1.cubeList.add(new ModelBox(bone30_r1, 22, 82, -6.65F, -7.35F, 21.0F, 1, 4, 4, 0.0F, false));
        bone30_r1.cubeList.add(new ModelBox(bone30_r1, 0, 0, -6.65F, -15.35F, 20.0F, 1, 8, 5, 0.0F, false));

        bone29_r1 = new ModelRenderer(this);
        bone29_r1.setRotationPoint(17.343F, 9.2368F, 22.1736F);
        main.addChild(bone29_r1);
        setRotationAngle(bone29_r1, 0.2618F, -0.8727F, -0.2269F);
        bone29_r1.cubeList.add(new ModelBox(bone29_r1, 54, 61, 0.5585F, -7.5416F, 21.8448F, 1, 4, 4, 0.0F, false));
        bone29_r1.cubeList.add(new ModelBox(bone29_r1, 25, 91, 0.5585F, -15.5416F, 20.8448F, 1, 8, 5, 0.0F, false));

        bone49_r1 = new ModelRenderer(this);
        bone49_r1.setRotationPoint(0.0F, -28.325F, 1.9448F);
        main.addChild(bone49_r1);
        setRotationAngle(bone49_r1, -1.4835F, 0.0F, 0.0F);
        bone49_r1.cubeList.add(new ModelBox(bone49_r1, 70, 0, -8.25F, -24.5301F, 20.0055F, 12, 2, 3, 0.0F, false));
        bone49_r1.cubeList.add(new ModelBox(bone49_r1, 23, 81, -8.0F, -24.05F, 13.8F, 1, 1, 9, 0.0F, false));
        bone49_r1.cubeList.add(new ModelBox(bone49_r1, 60, 81, 2.5F, -24.05F, 13.8F, 1, 1, 9, 0.0F, false));

        bone48_r1 = new ModelRenderer(this);
        bone48_r1.setRotationPoint(0.0F, -22.9106F, -5.7483F);
        main.addChild(bone48_r1);
        setRotationAngle(bone48_r1, -1.2217F, 0.0F, 0.0F);
        bone48_r1.cubeList.add(new ModelBox(bone48_r1, 103, 33, -8.0F, -28.75F, 12.1F, 1, 1, 5, 0.0F, false));
        bone48_r1.cubeList.add(new ModelBox(bone48_r1, 103, 99, 2.5F, -28.75F, 12.1F, 1, 1, 5, 0.0F, false));

        bone23_r1 = new ModelRenderer(this);
        bone23_r1.setRotationPoint(-8.1792F, 11.8099F, 17.7753F);
        main.addChild(bone23_r1);
        setRotationAngle(bone23_r1, 0.2269F, -0.1309F, 0.5236F);
        bone23_r1.cubeList.add(new ModelBox(bone23_r1, 91, 77, -8.75F, -17.5F, 12.3F, 2, 4, 5, 0.0F, false));

        bone39_r1 = new ModelRenderer(this);
        bone39_r1.setRotationPoint(11.6423F, 9.4274F, 19.61F);
        main.addChild(bone39_r1);
        setRotationAngle(bone39_r1, 0.2618F, -0.6632F, -0.2094F);
        bone39_r1.cubeList.add(new ModelBox(bone39_r1, 8, 64, -2.0F, -18.9F, 16.34F, 4, 1, 6, 0.0F, false));

        bone38_r1 = new ModelRenderer(this);
        bone38_r1.setRotationPoint(-12.6163F, 10.1236F, 16.9935F);
        main.addChild(bone38_r1);
        setRotationAngle(bone38_r1, 0.2618F, 0.6632F, 0.2094F);
        bone38_r1.cubeList.add(new ModelBox(bone38_r1, 57, 91, -6.4403F, -18.876F, 16.1796F, 4, 1, 6, 0.0F, false));

        bone32_r1 = new ModelRenderer(this);
        bone32_r1.setRotationPoint(0.0F, 9.4537F, 18.122F);
        main.addChild(bone32_r1);
        setRotationAngle(bone32_r1, 0.2618F, 0.0F, 0.0F);
        bone32_r1.cubeList.add(new ModelBox(bone32_r1, 69, 30, -6.75F, -17.31F, 11.34F, 9, 4, 5, 0.0F, false));

        bone31_r1 = new ModelRenderer(this);
        bone31_r1.setRotationPoint(7.5429F, 9.5792F, 17.188F);
        main.addChild(bone31_r1);
        setRotationAngle(bone31_r1, 0.2269F, 0.1309F, -0.5236F);
        bone31_r1.cubeList.add(new ModelBox(bone31_r1, 0, 92, 2.25F, -17.5F, 12.3F, 2, 4, 5, 0.0F, false));

        bone8_r1 = new ModelRenderer(this);
        bone8_r1.setRotationPoint(0.0F, 7.5124F, 19.5762F);
        main.addChild(bone8_r1);
        setRotationAngle(bone8_r1, 0.7854F, 0.0F, 0.0F);
        bone8_r1.cubeList.add(new ModelBox(bone8_r1, 8, 64, 2.75F, -12.5F, 2.3F, 2, 5, 1, 0.0F, false));
        bone8_r1.cubeList.add(new ModelBox(bone8_r1, 35, 31, -9.25F, -12.5F, 2.3F, 3, 5, 1, 0.0F, false));

        bone43_r2 = new ModelRenderer(this);
        bone43_r2.setRotationPoint(0.0F, 4.912F, 3.993F);
        main.addChild(bone43_r2);
        setRotationAngle(bone43_r2, -0.6109F, 0.0F, 0.0F);
        bone43_r2.cubeList.add(new ModelBox(bone43_r2, 0, 31, 2.0F, -16.0F, -0.75F, 1, 7, 2, 0.0F, false));
        bone43_r2.cubeList.add(new ModelBox(bone43_r2, 60, 75, -7.5F, -16.0F, -0.75F, 1, 7, 2, 0.0F, false));

        bone46_r1 = new ModelRenderer(this);
        bone46_r1.setRotationPoint(0.0F, -1.7697F, 1.505F);
        main.addChild(bone46_r1);
        setRotationAngle(bone46_r1, -1.2217F, 0.0F, 0.0F);
        bone46_r1.cubeList.add(new ModelBox(bone46_r1, 54, 54, -7.75F, -13.0F, 0.63F, 11, 2, 5, 0.0F, false));

        bone45_r1 = new ModelRenderer(this);
        bone45_r1.setRotationPoint(0.0F, -19.3104F, 6.5127F);
        main.addChild(bone45_r1);
        setRotationAngle(bone45_r1, -2.3562F, 0.0F, 0.0F);
        bone45_r1.cubeList.add(new ModelBox(bone45_r1, 18, 41, -7.75F, -14.75F, 2.13F, 11, 1, 2, 0.0F, false));

        bone44_r1 = new ModelRenderer(this);
        bone44_r1.setRotationPoint(0.0F, 7.0246F, 9.1397F);
        main.addChild(bone44_r1);
        setRotationAngle(bone44_r1, -0.2618F, 0.0F, 0.0F);
        bone44_r1.cubeList.add(new ModelBox(bone44_r1, 80, 73, -7.75F, -16.5477F, 1.3621F, 11, 1, 1, 0.0F, false));
        bone44_r1.cubeList.add(new ModelBox(bone44_r1, 106, 106, 2.5F, -23.3536F, -1.3624F, 1, 13, 1, 0.0F, false));
        bone44_r1.cubeList.add(new ModelBox(bone44_r1, 45, 108, -8.0F, -23.3536F, -1.3624F, 1, 13, 1, 0.0F, false));
        bone44_r1.cubeList.add(new ModelBox(bone44_r1, 80, 65, -7.75F, -16.5477F, -0.6379F, 11, 6, 2, 0.0F, false));

        bone42_r1 = new ModelRenderer(this);
        bone42_r1.setRotationPoint(0.0F, -5.5054F, 34.7248F);
        main.addChild(bone42_r1);
        setRotationAngle(bone42_r1, 1.1345F, 0.0F, 0.0F);
        bone42_r1.cubeList.add(new ModelBox(bone42_r1, 82, 28, -7.25F, -23.4F, 5.6F, 10, 1, 1, 0.0F, false));
        bone42_r1.cubeList.add(new ModelBox(bone42_r1, 71, 95, -8.0F, -23.25F, 0.6F, 1, 1, 6, 0.0F, false));
        bone42_r1.cubeList.add(new ModelBox(bone42_r1, 79, 96, 2.5F, -23.25F, 0.6F, 1, 1, 6, 0.0F, false));

        bone9_r1 = new ModelRenderer(this);
        bone9_r1.setRotationPoint(-1.6249F, 5.5902F, 13.3064F);
        main.addChild(bone9_r1);
        setRotationAngle(bone9_r1, 0.0F, 0.0F, 0.3491F);
        bone9_r1.cubeList.add(new ModelBox(bone9_r1, 67, 67, 3.25F, -5.5F, 3.3F, 1, 3, 11, 0.0F, false));

        bone15_r1 = new ModelRenderer(this);
        bone15_r1.setRotationPoint(6.1739F, 7.3757F, 12.8962F);
        main.addChild(bone15_r1);
        setRotationAngle(bone15_r1, 0.0F, -0.3491F, 0.0F);
        bone15_r1.cubeList.add(new ModelBox(bone15_r1, 110, 72, 3.25F, -10.5F, 17.3F, 1, 1, 4, 0.0F, false));

        bone13_r1 = new ModelRenderer(this);
        bone13_r1.setRotationPoint(-6.4453F, 7.3757F, 11.3569F);
        main.addChild(bone13_r1);
        setRotationAngle(bone13_r1, 0.0F, 0.3491F, 0.0F);
        bone13_r1.cubeList.add(new ModelBox(bone13_r1, 110, 77, -8.75F, -10.5F, 17.3F, 1, 1, 4, 0.0F, false));

        bone19_r1 = new ModelRenderer(this);
        bone19_r1.setRotationPoint(-6.4265F, 9.8281F, 15.2311F);
        main.addChild(bone19_r1);
        setRotationAngle(bone19_r1, 0.2778F, 0.3367F, 0.0939F);
        bone19_r1.cubeList.add(new ModelBox(bone19_r1, 110, 25, -8.77F, -13.5F, 17.3F, 1, 1, 4, 0.0F, false));

        bone34_r1 = new ModelRenderer(this);
        bone34_r1.setRotationPoint(-14.6956F, 11.5069F, 18.7328F);
        main.addChild(bone34_r1);
        setRotationAngle(bone34_r1, 0.4075F, 0.1324F, 0.6562F);
        bone34_r1.cubeList.add(new ModelBox(bone34_r1, 8, 102, -8.7241F, -17.48F, 17.3163F, 2, 4, 4, 0.0F, false));

        bone33_r1 = new ModelRenderer(this);
        bone33_r1.setRotationPoint(13.7298F, 8.7855F, 19.3269F);
        main.addChild(bone33_r1);
        setRotationAngle(bone33_r1, 0.4075F, -0.1324F, -0.6562F);
        bone33_r1.cubeList.add(new ModelBox(bone33_r1, 33, 102, 2.2759F, -17.48F, 17.3163F, 2, 4, 4, 0.0F, false));

        bone18_r1 = new ModelRenderer(this);
        bone18_r1.setRotationPoint(6.1551F, 9.4297F, 16.7179F);
        main.addChild(bone18_r1);
        setRotationAngle(bone18_r1, 0.2778F, -0.3367F, -0.0939F);
        bone18_r1.cubeList.add(new ModelBox(bone18_r1, 110, 30, 3.27F, -13.5F, 17.3F, 1, 1, 4, 0.0F, false));

        bone17_r1 = new ModelRenderer(this);
        bone17_r1.setRotationPoint(0.0F, 9.3227F, 17.1173F);
        main.addChild(bone17_r1);
        setRotationAngle(bone17_r1, 0.2618F, 0.0F, 0.0F);
        bone17_r1.cubeList.add(new ModelBox(bone17_r1, 35, 31, -8.75F, -13.5F, 9.3F, 13, 1, 8, 0.0F, false));

        bone16_r1 = new ModelRenderer(this);
        bone16_r1.setRotationPoint(0.0F, 3.3803F, 9.2496F);
        main.addChild(bone16_r1);
        setRotationAngle(bone16_r1, -0.3491F, 0.0F, 0.0F);
        bone16_r1.cubeList.add(new ModelBox(bone16_r1, 70, 40, -8.75F, -13.5F, 9.3F, 13, 7, 1, 0.0F, false));

        bone22_r1 = new ModelRenderer(this);
        bone22_r1.setRotationPoint(-20.0737F, 7.3757F, 16.1036F);
        main.addChild(bone22_r1);
        setRotationAngle(bone22_r1, 0.0F, 0.9599F, 0.0F);
        bone22_r1.cubeList.add(new ModelBox(bone22_r1, 93, 96, -7.4F, -16.52F, 20.68F, 1, 1, 6, 0.0F, false));

        bone25_r1 = new ModelRenderer(this);
        bone25_r1.setRotationPoint(-10.1073F, 14.3361F, 17.0576F);
        main.addChild(bone25_r1);
        setRotationAngle(bone25_r1, 0.384F, 0.6109F, 0.0F);
        bone25_r1.cubeList.add(new ModelBox(bone25_r1, 8, 71, -7.82F, -10.52F, 20.63F, 2, 8, 2, 0.0F, false));

        bone24_r1 = new ModelRenderer(this);
        bone24_r1.setRotationPoint(9.4734F, 14.4297F, 19.5498F);
        main.addChild(bone24_r1);
        setRotationAngle(bone24_r1, 0.384F, -0.6109F, 0.0F);
        bone24_r1.cubeList.add(new ModelBox(bone24_r1, 68, 109, 1.18F, -10.52F, 20.88F, 2, 8, 2, 0.0F, false));

        bone37_r1 = new ModelRenderer(this);
        bone37_r1.setRotationPoint(0.0F, -9.402F, 5.5679F);
        main.addChild(bone37_r1);
        setRotationAngle(bone37_r1, -0.6981F, 0.0F, 0.0F);
        bone37_r1.cubeList.add(new ModelBox(bone37_r1, 110, 110, -2.75F, -20.02F, 20.5F, 1, 1, 4, 0.0F, false));

        bone36_r1 = new ModelRenderer(this);
        bone36_r1.setRotationPoint(-28.0335F, 7.6742F, 27.2747F);
        main.addChild(bone36_r1);
        setRotationAngle(bone36_r1, 0.7854F, 0.6283F, 1.0472F);
        bone36_r1.cubeList.add(new ModelBox(bone36_r1, 67, 65, -7.37F, -20.52F, 21.0F, 1, 2, 4, 0.0F, false));
        bone36_r1.cubeList.add(new ModelBox(bone36_r1, 81, 52, -7.37F, -18.52F, 21.0F, 1, 2, 5, 0.0F, false));

        bone35_r1 = new ModelRenderer(this);
        bone35_r1.setRotationPoint(25.3597F, 4.5283F, 29.9138F);
        main.addChild(bone35_r1);
        setRotationAngle(bone35_r1, 0.7854F, -0.6283F, -1.0472F);
        bone35_r1.cubeList.add(new ModelBox(bone35_r1, 105, 19, 1.88F, -20.52F, 21.0F, 1, 2, 4, 0.0F, false));
        bone35_r1.cubeList.add(new ModelBox(bone35_r1, 17, 99, 1.88F, -18.52F, 21.0F, 1, 2, 5, 0.0F, false));

        bone21_r1 = new ModelRenderer(this);
        bone21_r1.setRotationPoint(18.1677F, 7.3757F, 19.7652F);
        main.addChild(bone21_r1);
        setRotationAngle(bone21_r1, 0.0F, -0.9599F, 0.0F);
        bone21_r1.cubeList.add(new ModelBox(bone21_r1, 96, 46, 1.88F, -16.52F, 20.68F, 1, 1, 6, 0.0F, false));

        bone28_r1 = new ModelRenderer(this);
        bone28_r1.setRotationPoint(-16.1964F, 7.0733F, 11.9358F);
        main.addChild(bone28_r1);
        setRotationAngle(bone28_r1, -0.1396F, 0.0F, 1.3963F);
        bone28_r1.cubeList.add(new ModelBox(bone28_r1, 8, 72, -12.5338F, -23.2062F, 10.5143F, 3, 1, 9, 0.0F, false));
        bone28_r1.cubeList.add(new ModelBox(bone28_r1, 40, 9, -9.5338F, -23.2062F, 7.5143F, 3, 1, 12, 0.0F, false));

        bone26_r1 = new ModelRenderer(this);
        bone26_r1.setRotationPoint(1.7346F, -10.1609F, 11.9358F);
        main.addChild(bone26_r1);
        setRotationAngle(bone26_r1, -0.1396F, 0.0F, -1.3963F);
        bone26_r1.cubeList.add(new ModelBox(bone26_r1, 45, 75, -5.75F, -10.5F, 12.3F, 3, 1, 9, 0.0F, false));
        bone26_r1.cubeList.add(new ModelBox(bone26_r1, 0, 41, -8.75F, -10.5F, 9.3F, 3, 1, 12, 0.0F, false));

        bone20_r1 = new ModelRenderer(this);
        bone20_r1.setRotationPoint(0.0F, -2.5471F, 10.8741F);
        main.addChild(bone20_r1);
        setRotationAngle(bone20_r1, -0.5236F, 0.0F, 0.0F);
        bone20_r1.cubeList.add(new ModelBox(bone20_r1, 76, 21, -8.75F, -9.0F, 15.434F, 13, 4, 1, 0.0F, false));

        bone11_r1 = new ModelRenderer(this);
        bone11_r1.setRotationPoint(1.3535F, 4.0509F, 13.3064F);
        main.addChild(bone11_r1);
        setRotationAngle(bone11_r1, 0.0F, 0.0F, -0.3491F);
        bone11_r1.cubeList.add(new ModelBox(bone11_r1, 54, 61, -8.75F, -5.5F, 3.3F, 1, 3, 11, 0.0F, false));

        bone41_r1 = new ModelRenderer(this);
        bone41_r1.setRotationPoint(0.0F, 5.8175F, 10.9934F);
        main.addChild(bone41_r1);
        setRotationAngle(bone41_r1, -0.1745F, 0.0F, 0.0F);
        bone41_r1.cubeList.add(new ModelBox(bone41_r1, 73, 9, -7.75F, -13.8059F, 7.0256F, 11, 4, 3, 0.0F, false));

        bone40_r1 = new ModelRenderer(this);
        bone40_r1.setRotationPoint(0.0F, 9.1633F, 17.228F);
        main.addChild(bone40_r1);
        setRotationAngle(bone40_r1, 0.2618F, 0.0F, 0.0F);
        bone40_r1.cubeList.add(new ModelBox(bone40_r1, 48, 22, -7.75F, -14.4529F, 7.0596F, 11, 2, 6, 0.0F, false));

        bone52_r3 = new ModelRenderer(this);
        bone52_r3.setRotationPoint(0.0F, 7.9264F, 8.9361F);
        main.addChild(bone52_r3);
        setRotationAngle(bone52_r3, -0.7854F, 0.0F, 0.0F);
        bone52_r3.cubeList.add(new ModelBox(bone52_r3, 36, 40, -5.75F, -21.8768F, 6.0161F, 7, 5, 8, 0.0F, false));
        bone52_r3.cubeList.add(new ModelBox(bone52_r3, 8, 54, -5.75F, -9.7071F, -4.1429F, 7, 6, 4, 0.0F, false));
    }

    @Override
    public void render(final Entity entity, final float limbSwing, final float limbSwingAmount, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        wheel.render(scale);
        wheel2.render(scale);
        wheel3.render(scale);
        wheel4.render(scale);
        fork.render(scale);
        main.render(scale);
    }
}
