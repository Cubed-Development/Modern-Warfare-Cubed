package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Z10Mag extends ModelWithAttachments {
    private final ModelRenderer mag;
    private final ModelRenderer gun48_r10_r1;
    private final ModelRenderer gun49_r15_r1;
    private final ModelRenderer gun50_r17_r1;
    private final ModelRenderer gun51_r19_r1;
    private final ModelRenderer gun52_r17_r1;
    private final ModelRenderer gun51_r18_r1;
    private final ModelRenderer gun50_r16_r1;
    private final ModelRenderer gun50_r15_r1;
    private final ModelRenderer gun51_r17_r1;
    private final ModelRenderer gun50_r14_r1;
    private final ModelRenderer gun53_r13_r1;
    private final ModelRenderer gun54_r13_r1;
    private final ModelRenderer gun55_r7_r1;
    private final ModelRenderer gun56_r3_r1;
    private final ModelRenderer gun49_r14_r1;
    private final ModelRenderer gun47_r6_r1;
    private final ModelRenderer gun49_r13_r1;
    private final ModelRenderer gun51_r16_r1;
    private final ModelRenderer gun52_r16_r1;
    private final ModelRenderer gun50_r13_r1;
    private final ModelRenderer gun52_r15_r1;
    private final ModelRenderer gun50_r12_r1;

    public Z10Mag() {
        textureWidth = 300;
        textureHeight = 300;

        mag = new ModelRenderer(this);
        mag.setRotationPoint(-1.5F, -2.1972F, -16.9893F);
        mag.cubeList.add(new ModelBox(mag, 22, 66, -1.75F, -5.8028F, -2.4607F, 3, 5, 7, 0.0F, false));
        mag.cubeList.add(new ModelBox(mag, 23, 0, -1.0F, -5.8028F, -4.3607F, 2, 5, 2, 0.001F, false));
        mag.cubeList.add(new ModelBox(mag, 0, 25, 0.75F, -5.8028F, -2.4607F, 1, 5, 7, -0.001F, false));

        gun48_r10_r1 = new ModelRenderer(this);
        gun48_r10_r1.setRotationPoint(6.2002F, 26.1972F, 15.5396F);
        mag.addChild(gun48_r10_r1);
        setRotationAngle(gun48_r10_r1, 0.0F, 0.2967F, 0.0F);
        gun48_r10_r1.cubeList.add(new ModelBox(gun48_r10_r1, 14, 13, 0.0F, -32.0F, -20.45F, 1, 4, 2, -0.002F, false));

        gun49_r15_r1 = new ModelRenderer(this);
        gun49_r15_r1.setRotationPoint(-3.3313F, 26.1972F, 16.4167F);
        mag.addChild(gun49_r15_r1);
        setRotationAngle(gun49_r15_r1, 0.0F, -0.2967F, 0.0F);
        gun49_r15_r1.cubeList.add(new ModelBox(gun49_r15_r1, 0, 13, -4.0F, -32.0F, -20.45F, 1, 4, 2, -0.001F, false));

        gun50_r17_r1 = new ModelRenderer(this);
        gun50_r17_r1.setRotationPoint(-1.3261F, 27.6281F, 15.163F);
        mag.addChild(gun50_r17_r1);
        setRotationAngle(gun50_r17_r1, -0.0864F, 0.0121F, 0.1391F);
        gun50_r17_r1.cubeList.add(new ModelBox(gun50_r17_r1, 48, 48, -0.4F, -19.7055F, -19.8252F, 1, 2, 6, 0.0F, false));

        gun51_r19_r1 = new ModelRenderer(this);
        gun51_r19_r1.setRotationPoint(4.0323F, 28.3715F, 13.9202F);
        mag.addChild(gun51_r19_r1);
        setRotationAngle(gun51_r19_r1, -0.0907F, 0.3077F, 0.1126F);
        gun51_r19_r1.cubeList.add(new ModelBox(gun51_r19_r1, 56, 0, -0.17F, -19.8055F, -21.2252F, 1, 2, 2, 0.0F, false));

        gun52_r17_r1 = new ModelRenderer(this);
        gun52_r17_r1.setRotationPoint(-1.1913F, 28.0503F, 14.8288F);
        mag.addChild(gun52_r17_r1);
        setRotationAngle(gun52_r17_r1, -0.0907F, -0.3077F, -0.1126F);
        gun52_r17_r1.cubeList.add(new ModelBox(gun52_r17_r1, 12, 37, -3.83F, -19.8055F, -21.2252F, 1, 2, 2, 0.0F, false));

        gun51_r18_r1 = new ModelRenderer(this);
        gun51_r18_r1.setRotationPoint(4.2969F, 27.2122F, 15.1993F);
        mag.addChild(gun51_r18_r1);
        setRotationAngle(gun51_r18_r1, -0.0864F, -0.0121F, -0.1391F);
        gun51_r18_r1.cubeList.add(new ModelBox(gun51_r18_r1, 32, 38, -3.6F, -19.7055F, -19.8252F, 1, 2, 6, 0.0F, false));

        gun50_r16_r1 = new ModelRenderer(this);
        gun50_r16_r1.setRotationPoint(1.5F, 27.6282F, 15.1006F);
        mag.addChild(gun50_r16_r1);
        setRotationAngle(gun50_r16_r1, -0.0873F, 0.0F, 0.0F);
        gun50_r16_r1.cubeList.add(new ModelBox(gun50_r16_r1, 12, 66, -3.5F, -23.4055F, -16.8252F, 4, 3, 4, 0.0F, false));
        gun50_r16_r1.cubeList.add(new ModelBox(gun50_r16_r1, 33, 59, -3.5F, -23.4055F, -19.8252F, 4, 3, 2, 0.0F, false));
        gun50_r16_r1.cubeList.add(new ModelBox(gun50_r16_r1, 0, 13, -3.5F, -20.4055F, -19.8252F, 4, 1, 6, 0.0F, false));
        gun50_r16_r1.cubeList.add(new ModelBox(gun50_r16_r1, 65, 52, -3.5F, -20.4055F, -13.8252F, 4, 3, 1, 0.0F, false));

        gun50_r15_r1 = new ModelRenderer(this);
        gun50_r15_r1.setRotationPoint(1.5F, 28.2986F, 14.4157F);
        mag.addChild(gun50_r15_r1);
        setRotationAngle(gun50_r15_r1, -0.1309F, 0.0F, 0.0F);
        gun50_r15_r1.cubeList.add(new ModelBox(gun50_r15_r1, 65, 75, -3.5F, -16.59F, -22.2172F, 4, 1, 2, 0.0F, false));
        gun50_r15_r1.cubeList.add(new ModelBox(gun50_r15_r1, 65, 48, -3.0F, -17.583F, -22.3172F, 3, 2, 2, 0.0F, false));
        gun50_r15_r1.cubeList.add(new ModelBox(gun50_r15_r1, 78, 0, -3.5499F, -17.5823F, -20.3169F, 1, 2, 7, 0.0F, false));
        gun50_r15_r1.cubeList.add(new ModelBox(gun50_r15_r1, 72, 5, -3.55F, -17.5823F, -13.8099F, 1, 2, 1, 0.0F, false));
        gun50_r15_r1.cubeList.add(new ModelBox(gun50_r15_r1, 23, 7, -3.4501F, -17.5823F, -13.8172F, 4, 2, 1, 0.001F, false));
        gun50_r15_r1.cubeList.add(new ModelBox(gun50_r15_r1, 23, 12, -3.45F, -17.583F, -20.3172F, 4, 2, 7, 0.0F, false));

        gun51_r17_r1 = new ModelRenderer(this);
        gun51_r17_r1.setRotationPoint(6.4262F, 26.8672F, 14.7346F);
        mag.addChild(gun51_r17_r1);
        setRotationAngle(gun51_r17_r1, -0.0456F, 0.2964F, -0.0133F);
        gun51_r17_r1.cubeList.add(new ModelBox(gun51_r17_r1, 26, 25, -0.05F, -26.1991F, -20.8765F, 1, 3, 1, 0.003F, false));
        gun51_r17_r1.cubeList.add(new ModelBox(gun51_r17_r1, 35, 5, 0.15F, -26.1991F, -19.8765F, 1, 3, 1, 0.003F, false));
        gun51_r17_r1.cubeList.add(new ModelBox(gun51_r17_r1, 48, 64, 0.15F, -28.1991F, -20.8765F, 1, 2, 2, 0.003F, false));

        gun50_r14_r1 = new ModelRenderer(this);
        gun50_r14_r1.setRotationPoint(-3.5573F, 26.9054F, 15.6108F);
        mag.addChild(gun50_r14_r1);
        setRotationAngle(gun50_r14_r1, -0.0456F, -0.2964F, 0.0133F);
        gun50_r14_r1.cubeList.add(new ModelBox(gun50_r14_r1, 56, 56, -4.15F, -28.1991F, -20.8765F, 1, 2, 2, 0.003F, false));
        gun50_r14_r1.cubeList.add(new ModelBox(gun50_r14_r1, 35, 0, -4.15F, -26.1991F, -19.8765F, 1, 3, 1, 0.003F, false));
        gun50_r14_r1.cubeList.add(new ModelBox(gun50_r14_r1, 20, 25, -3.95F, -26.1991F, -20.8765F, 1, 3, 1, 0.003F, false));

        gun53_r13_r1 = new ModelRenderer(this);
        gun53_r13_r1.setRotationPoint(5.9865F, 27.9485F, 13.2263F);
        mag.addChild(gun53_r13_r1);
        setRotationAngle(gun53_r13_r1, -0.1154F, 0.2964F, -0.0133F);
        gun53_r13_r1.cubeList.add(new ModelBox(gun53_r13_r1, 65, 22, 0.15F, -23.3991F, -19.9765F, 1, 2, 1, 0.003F, false));
        gun53_r13_r1.cubeList.add(new ModelBox(gun53_r13_r1, 48, 56, 0.15F, -21.3991F, -20.9765F, 1, 2, 2, 0.003F, false));

        gun54_r13_r1 = new ModelRenderer(this);
        gun54_r13_r1.setRotationPoint(-3.1176F, 27.9867F, 14.1025F);
        mag.addChild(gun54_r13_r1);
        setRotationAngle(gun54_r13_r1, -0.1154F, -0.2964F, 0.0133F);
        gun54_r13_r1.cubeList.add(new ModelBox(gun54_r13_r1, 65, 17, -4.15F, -23.3991F, -19.9765F, 1, 2, 1, 0.003F, false));
        gun54_r13_r1.cubeList.add(new ModelBox(gun54_r13_r1, 56, 48, -4.15F, -21.3991F, -20.9765F, 1, 2, 2, 0.003F, false));

        gun55_r7_r1 = new ModelRenderer(this);
        gun55_r7_r1.setRotationPoint(-3.3582F, 28.0805F, 13.9115F);
        mag.addChild(gun55_r7_r1);
        setRotationAngle(gun55_r7_r1, -0.1154F, -0.2964F, 0.0133F);
        gun55_r7_r1.cubeList.add(new ModelBox(gun55_r7_r1, 13, 47, -3.65F, -23.3991F, -20.8765F, 1, 2, 1, 0.003F, false));

        gun56_r3_r1 = new ModelRenderer(this);
        gun56_r3_r1.setRotationPoint(6.2272F, 28.0423F, 13.0353F);
        mag.addChild(gun56_r3_r1);
        setRotationAngle(gun56_r3_r1, -0.1154F, 0.2964F, -0.0133F);
        gun56_r3_r1.cubeList.add(new ModelBox(gun56_r3_r1, 14, 25, -0.35F, -23.3991F, -20.8765F, 1, 2, 1, 0.003F, false));

        gun49_r14_r1 = new ModelRenderer(this);
        gun49_r14_r1.setRotationPoint(1.5F, 26.9185F, 15.9183F);
        mag.addChild(gun49_r14_r1);
        setRotationAngle(gun49_r14_r1, -0.0436F, 0.0F, 0.0F);
        gun49_r14_r1.cubeList.add(new ModelBox(gun49_r14_r1, 78, 95, -3.499F, -26.1991F, -16.5765F, 4, 3, 4, 0.003F, false));
        gun49_r14_r1.cubeList.add(new ModelBox(gun49_r14_r1, 104, 62, -3.499F, -26.1991F, -19.5765F, 4, 3, 2, 0.003F, false));

        gun47_r6_r1 = new ModelRenderer(this);
        gun47_r6_r1.setRotationPoint(1.5F, 27.626F, 15.1007F);
        mag.addChild(gun47_r6_r1);
        setRotationAngle(gun47_r6_r1, -0.0873F, 0.0F, 0.0F);
        gun47_r6_r1.cubeList.add(new ModelBox(gun47_r6_r1, 48, 95, -2.5F, -23.4055F, -21.8002F, 2, 2, 1, 0.0F, false));

        gun49_r13_r1 = new ModelRenderer(this);
        gun49_r13_r1.setRotationPoint(1.5F, 26.9174F, 15.9183F);
        mag.addChild(gun49_r13_r1);
        setRotationAngle(gun49_r13_r1, -0.0436F, 0.0F, 0.0F);
        gun49_r13_r1.cubeList.add(new ModelBox(gun49_r13_r1, 11, 77, -2.5F, -26.4491F, -21.5515F, 2, 3, 1, 0.0F, false));

        gun51_r16_r1 = new ModelRenderer(this);
        gun51_r16_r1.setRotationPoint(1.5F, 26.9157F, 15.8399F);
        mag.addChild(gun51_r16_r1);
        setRotationAngle(gun51_r16_r1, -0.0436F, 0.0F, 0.0F);
        gun51_r16_r1.cubeList.add(new ModelBox(gun51_r16_r1, 24, 66, -2.85F, -28.2F, -21.5515F, 1, 2, 1, 0.001F, false));
        gun51_r16_r1.cubeList.add(new ModelBox(gun51_r16_r1, 35, 94, -2.15F, -28.2F, -21.5515F, 2, 2, 1, 0.0F, false));

        gun52_r16_r1 = new ModelRenderer(this);
        gun52_r16_r1.setRotationPoint(1.5F, 27.9597F, 13.9378F);
        mag.addChild(gun52_r16_r1);
        setRotationAngle(gun52_r16_r1, -0.1134F, 0.0F, 0.0F);
        gun52_r16_r1.cubeList.add(new ModelBox(gun52_r16_r1, 12, 66, -2.85F, -21.4F, -21.3515F, 1, 2, 1, 0.001F, false));
        gun52_r16_r1.cubeList.add(new ModelBox(gun52_r16_r1, 15, 94, -2.5F, -19.4F, -21.3515F, 2, 2, 1, 0.0F, false));
        gun52_r16_r1.cubeList.add(new ModelBox(gun52_r16_r1, 24, 94, -2.15F, -21.4F, -21.3515F, 2, 2, 1, 0.0F, false));

        gun50_r13_r1 = new ModelRenderer(this);
        gun50_r13_r1.setRotationPoint(1.5F, 26.9171F, 15.8966F);
        mag.addChild(gun50_r13_r1);
        setRotationAngle(gun50_r13_r1, -0.0436F, 0.0F, 0.0F);
        gun50_r13_r1.cubeList.add(new ModelBox(gun50_r13_r1, 34, 54, -3.5F, -27.6986F, -19.5547F, 4, 2, 2, 0.0F, false));
        gun50_r13_r1.cubeList.add(new ModelBox(gun50_r13_r1, 0, 37, -3.5F, -27.1986F, -16.5547F, 4, 2, 4, 0.0F, false));

        gun52_r15_r1 = new ModelRenderer(this);
        gun52_r15_r1.setRotationPoint(1.5F, 26.9167F, 15.8791F);
        mag.addChild(gun52_r15_r1);
        setRotationAngle(gun52_r15_r1, -0.0436F, 0.0F, 0.0F);
        gun52_r15_r1.cubeList.add(new ModelBox(gun52_r15_r1, 71, 64, -3.25F, -27.0986F, -17.5547F, 1, 7, 1, 0.1F, false));
        gun52_r15_r1.cubeList.add(new ModelBox(gun52_r15_r1, 73, 33, -0.75F, -27.0986F, -17.5547F, 1, 7, 1, 0.1F, false));

        gun50_r12_r1 = new ModelRenderer(this);
        gun50_r12_r1.setRotationPoint(1.5F, 28.749F, 12.183F);
        mag.addChild(gun50_r12_r1);
        setRotationAngle(gun50_r12_r1, -0.1745F, 0.0F, 0.0F);
        gun50_r12_r1.cubeList.add(new ModelBox(gun50_r12_r1, 0, 94, -3.499F, -27.9472F, -19.6643F, 4, 1, 7, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        mag.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
