package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class KragJorgensen extends ModelWithAttachments {
    private final ModelRenderer gun;
    private final ModelRenderer gun652_r1;
    private final ModelRenderer gun651_r1;
    private final ModelRenderer gun649_r1;
    private final ModelRenderer gun648_r1;
    private final ModelRenderer gun647_r1;
    private final ModelRenderer gun637_r1;
    private final ModelRenderer gun634_r1;
    private final ModelRenderer gun632_r1;
    private final ModelRenderer gun631_r1;
    private final ModelRenderer gun629_r1;
    private final ModelRenderer gun630_r1;
    private final ModelRenderer gun628_r1;
    private final ModelRenderer gun627_r1;
    private final ModelRenderer gun624_r1;
    private final ModelRenderer gun623_r1;
    private final ModelRenderer gun622_r1;
    private final ModelRenderer gun621_r1;
    private final ModelRenderer gun620_r1;
    private final ModelRenderer gun619_r1;
    private final ModelRenderer gun617_r1;
    private final ModelRenderer gun616_r1;
    private final ModelRenderer gun615_r1;
    private final ModelRenderer gun611_r1;
    private final ModelRenderer gun609_r1;
    private final ModelRenderer gun608_r1;
    private final ModelRenderer gun562_r1;
    private final ModelRenderer gun561_r1;
    private final ModelRenderer gun560_r1;
    private final ModelRenderer gun559_r1;
    private final ModelRenderer gun558_r1;
    private final ModelRenderer gun557_r1;
    private final ModelRenderer gun556_r1;
    private final ModelRenderer gun555_r1;
    private final ModelRenderer gun554_r1;
    private final ModelRenderer gun553_r1;
    private final ModelRenderer gun552_r1;
    private final ModelRenderer gun551_r1;
    private final ModelRenderer gun550_r1;
    private final ModelRenderer gun542_r1;
    private final ModelRenderer gun541_r1;
    private final ModelRenderer gun540_r1;
    private final ModelRenderer gun537_r1;
    private final ModelRenderer gun536_r1;
    private final ModelRenderer gun533_r1;
    private final ModelRenderer gun626_r1;
    private final ModelRenderer gun517_r1;
    private final ModelRenderer gun515_r1;
    private final ModelRenderer gun510_r1;
    private final ModelRenderer gun509_r1;
    private final ModelRenderer gun508_r1;
    private final ModelRenderer gun507_r1;
    private final ModelRenderer gun506_r1;
    private final ModelRenderer gun505_r1;
    private final ModelRenderer gun504_r1;
    private final ModelRenderer gun5033_r1;
    private final ModelRenderer gun503_r1;
    private final ModelRenderer gun502_r1;
    private final ModelRenderer gun495_r1;
    private final ModelRenderer gun494_r1;
    private final ModelRenderer gun493_r1;
    private final ModelRenderer gun492_r1;
    private final ModelRenderer gun487_r1;
    private final ModelRenderer gun486_r1;
    private final ModelRenderer gun484_r1;
    private final ModelRenderer gun483_r1;
    private final ModelRenderer gun482_r1;
    private final ModelRenderer gun480_r1;
    private final ModelRenderer gun478_r1;
    private final ModelRenderer gun477_r1;
    private final ModelRenderer gun476_r1;
    private final ModelRenderer gun472_r1;
    private final ModelRenderer gun471_r1;
    private final ModelRenderer gun470_r1;
    private final ModelRenderer gun469_r1;
    private final ModelRenderer gun468_r1;
    private final ModelRenderer gun467_r1;
    private final ModelRenderer gun466_r1;
    private final ModelRenderer gun465_r1;
    private final ModelRenderer gun460_r1;
    private final ModelRenderer gun459_r1;
    private final ModelRenderer gun669_r1;
    private final ModelRenderer gun667_r1;
    private final ModelRenderer gun666_r1;
    private final ModelRenderer gun665_r1;
    private final ModelRenderer gun664_r1;
    private final ModelRenderer gun663_r1;
    private final ModelRenderer gun662_r1;
    private final ModelRenderer gun661_r1;
    private final ModelRenderer gun660_r1;
    private final ModelRenderer gun659_r1;
    private final ModelRenderer gun658_r1;
    private final ModelRenderer gun657_r1;
    private final ModelRenderer gun656_r1;
    private final ModelRenderer gun403_r1;
    private final ModelRenderer gun369_r1;
    private final ModelRenderer gun367_r1;
    private final ModelRenderer gun364_r1;
    private final ModelRenderer gun363_r1;
    private final ModelRenderer gun362_r1;
    private final ModelRenderer gun311_r1;
    private final ModelRenderer gun310_r1;
    private final ModelRenderer gun306_r1;
    private final ModelRenderer gun303_r1;
    private final ModelRenderer gun302_r1;
    private final ModelRenderer gun301_r1;
    private final ModelRenderer gun290_r1;
    private final ModelRenderer gun279_r1;
    private final ModelRenderer gun274_r1;
    private final ModelRenderer gun271_r1;
    private final ModelRenderer gun270_r1;
    private final ModelRenderer gun264_r1;
    private final ModelRenderer gun263_r1;
    private final ModelRenderer gun262_r1;
    private final ModelRenderer gun261_r1;
    private final ModelRenderer gun260_r1;
    private final ModelRenderer gun259_r1;
    private final ModelRenderer gun169_r1;
    private final ModelRenderer gun168_r1;
    private final ModelRenderer gun167_r1;
    private final ModelRenderer gun166_r1;
    private final ModelRenderer gun165_r1;
    private final ModelRenderer gun163_r1;
    private final ModelRenderer gun162_r1;
    private final ModelRenderer gun160_r1;
    private final ModelRenderer gun155_r1;
    private final ModelRenderer gun137_r1;
    private final ModelRenderer gun136_r1;
    private final ModelRenderer gun131_r1;
    private final ModelRenderer gun130_r1;
    private final ModelRenderer gun129_r1;
    private final ModelRenderer gun126_r1;
    private final ModelRenderer gun122_r1;
    private final ModelRenderer gun117_r1;
    private final ModelRenderer gun115_r1;
    private final ModelRenderer gun114_r1;
    private final ModelRenderer gun113_r1;
    private final ModelRenderer gun112_r1;
    private final ModelRenderer gun111_r1;
    private final ModelRenderer gun110_r1;
    private final ModelRenderer gun109_r1;
    private final ModelRenderer gun108_r1;
    private final ModelRenderer gun107_r1;
    private final ModelRenderer gun101_r1;
    private final ModelRenderer gun81_r1;
    private final ModelRenderer gun19_r1;
    private final ModelRenderer gun12_r1;
    private final ModelRenderer gun3_r1;
    private final ModelRenderer gun2_r1;
    private final ModelRenderer gun432_r1;

    public KragJorgensen() {
        textureWidth = 512;
        textureHeight = 256;

        gun = new ModelRenderer(this);
        gun.setRotationPoint(0, 24, 0);
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -37.35F, -68.6F, 5, 1, 12, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -32.5F, -13.6F, 5, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -29.5F, 8, 5, 4, 14, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -25.5F, 13, 5, 2, 9, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -39, -69, 5, 3, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -38.35F, -68.6F, 5, 1, 12, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -39, -69, 1, 1, 37, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -36.5F, -57.1F, 5, 1, 22, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -36.5F, -22.1F, 5, 3, 5, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.1F, -39.5F, -34.5F, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.9F, -39.5F, -22, 1, 2, 5, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.9F, -41.1F, -34.5F, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.1F, -39.5F, -32, 1, 2, 10, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -0.6F, -39.7F, -69, 1, 1, 34, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.4F, -39.7F, -69, 1, 1, 34, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4, -36.8F, -69, 4, 2, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4, -38.4F, -17.6F, 4, 3, 4, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.1F, -38.7F, -32, 1, 1, 14, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -41, -128, 1, 1, 55, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -38.35F, -14.6F, 5, 4, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -0.5F, -36, -14.6F, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -36.5F, -17.1F, 5, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.4F, -40, -104.1F, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.8F, -39.7F, -35, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.2F, -39.7F, -35, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -41, -35, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -41.25F, -72, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.5F, -35.9F, -72, 3, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.3F, -39.6F, -72, 1, 2, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.7F, -39.6F, -72, 1, 2, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.2F, -39, -108, 3, 1, 36, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -1.8F, -39, -108, 2, 1, 36, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -3.5F, -38.5F, -91, 3, 3, 19, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -2.5F, -41.3F, -73, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.9F, -39.6F, -73, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.1F, -39.6F, -73, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -0.5F, -39, -69, 1, 1, 37, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.1F, -41.1F, -34.5F, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.9F, -39.5F, -34.5F, 1, 2, 13, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.5F, -40, -128, 1, 1, 55, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.3F, -39.1F, -108.1F, 1, 1, 6, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.7F, -39.1F, -108.1F, 1, 1, 6, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -41.1F, -108.1F, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.4F, -40, -108.1F, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -41.1F, -104.1F, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.6F, -40, -104.1F, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.6F, -40, -108.1F, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.3F, -38.5F, -108.1F, 1, 1, 6, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.7F, -38.5F, -108.1F, 1, 1, 6, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4, -39, -108.3F, 4, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.5F, -38, -108.3F, 3, 2, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -41.4F, -126, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -38.9F, -126, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.4F, -40, -126, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.6F, -40, -126, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -38, -37, 5, 3, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -38.3F, -34.3F, 5, 4, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -0.5F, -38.2F, -21.4F, 1, 2, 7, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.5F, -40, -128, 1, 1, 55, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -2.5F, -39, -128, 1, 1, 55, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.5F, -35.5F, -42, 5, 1, 8, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -1.8F, -38.5F, -108, 2, 1, 36, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.2F, -38.5F, -108, 3, 1, 36, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4, -38.5F, -108.3F, 4, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.3F, -38.1F, -72, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.7F, -38.1F, -72, 1, 1, 3, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.1F, -41.9F, -59, 2, 2, 10, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.9F, -41.9F, -59, 1, 2, 10, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.3F, -41.2F, -59.2F, 1, 1, 10, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.7F, -41.2F, -59.2F, 1, 1, 10, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.3F, -42.2F, -58.8F, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.7F, -42.2F, -58.8F, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -3.3F, -42.2F, -51.6F, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -1.7F, -42.2F, -51.6F, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.4F, -38.5F, -25, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.4F, -37, -22, 1, 2, 5, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.1F, -39.5F, -22, 1, 3, 5, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.3F, -37.5F, -31.1F, 1, 2, 9, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -0.7F, -39.2F, -22.1F, 1, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -0.8F, -38, -57.1F, 1, 2, 22, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -5.8F, -36.5F, -22.5F, 2, 3, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -5.8F, -36.5F, -31.5F, 2, 2, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -5.8F, -35, -31.5F, 2, 1, 1, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -5, -37.3F, -31.7F, 2, 3, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -2.5F, -41.3F, -69, 1, 1, 14, 0, true));
        gun.cubeList.add(new ModelBox(gun, 200, 0, -4.1F, -38.3F, -32, 1, 1, 2, 0, true));
        gun.cubeList.add(new ModelBox(gun, 0, 0, -4.2F, -38, -57.1F, 1, 2, 22, 0, true));

        gun652_r1 = new ModelRenderer(this);
        gun652_r1.setRotationPoint(20.7774F, 0, -28.2338F);
        gun.addChild(gun652_r1);
        setRotationAngle(gun652_r1, 0, 1.5243F, 0);
        gun652_r1.cubeList.add(new ModelBox(gun652_r1, 200, 0, -2.4F, -38.2F, -25, 4, 1, 1, 0, true));
        gun652_r1.cubeList.add(new ModelBox(gun652_r1, 200, 0, -4.4F, -38.5F, -25, 6, 1, 1, 0, true));

        gun651_r1 = new ModelRenderer(this);
        gun651_r1.setRotationPoint(-14.1946F, -0.9528F, 0);
        gun.addChild(gun651_r1);
        setRotationAngle(gun651_r1, 0, 0, 0.409F);
        gun651_r1.cubeList.add(new ModelBox(gun651_r1, 200, 0, -4.8F, -34.7F, -31, 1, 1, 9, 0, true));

        gun649_r1 = new ModelRenderer(this);
        gun649_r1.setRotationPoint(35.2176F, -24.336F, 0);
        gun.addChild(gun649_r1);
        setRotationAngle(gun649_r1, 0, 0, -1.1154F);
        gun649_r1.cubeList.add(new ModelBox(gun649_r1, 0, 0, -1.9F, -40.4F, -69, 1, 1, 20, 0, true));
        gun649_r1.cubeList.add(new ModelBox(gun649_r1, 0, 0, -1.9F, -39.8F, -69, 1, 1, 20, 0, true));

        gun648_r1 = new ModelRenderer(this);
        gun648_r1.setRotationPoint(-38.4906F, -20.8888F, 0);
        gun.addChild(gun648_r1);
        setRotationAngle(gun648_r1, 0, 0, 1.1154F);
        gun648_r1.cubeList.add(new ModelBox(gun648_r1, 0, 0, -2.5F, -41.3F, -69, 1, 1, 20, 0, true));
        gun648_r1.cubeList.add(new ModelBox(gun648_r1, 0, 0, -2.5F, -40.7F, -69, 1, 1, 20, 0, true));
        gun648_r1.cubeList.add(new ModelBox(gun648_r1, 0, 0, -2.5F, -40.7F, -59, 1, 1, 10, 0, true));

        gun647_r1 = new ModelRenderer(this);
        gun647_r1.setRotationPoint(12.2908F, -75.2491F, 0);
        gun.addChild(gun647_r1);
        setRotationAngle(gun647_r1, 0, 0, -2.6397F);
        gun647_r1.cubeList.add(new ModelBox(gun647_r1, 0, 0, -3.5F, -39.2F, -69, 1, 1, 34, 0, true));

        gun637_r1 = new ModelRenderer(this);
        gun637_r1.setRotationPoint(0, -62.7042F, 4.0765F);
        gun.addChild(gun637_r1);
        setRotationAngle(gun637_r1, 1.5184F, 0, 0);
        gun637_r1.cubeList.add(new ModelBox(gun637_r1, 200, 0, -5.8F, -33.5F, -31, 2, 9, 1, 0, true));

        gun634_r1 = new ModelRenderer(this);
        gun634_r1.setRotationPoint(14.0363F, -5.3165F, 0);
        gun.addChild(gun634_r1);
        setRotationAngle(gun634_r1, 0, 0, -0.409F);
        gun634_r1.cubeList.add(new ModelBox(gun634_r1, 200, 0, -5.8F, -36.5F, -22.5F, 2, 1, 1, 0, true));

        gun632_r1 = new ModelRenderer(this);
        gun632_r1.setRotationPoint(0, -1.4756F, -22.4142F);
        gun.addChild(gun632_r1);
        setRotationAngle(gun632_r1, -0.5949F, 0, 0);
        gun632_r1.cubeList.add(new ModelBox(gun632_r1, 200, 0, -3, -37.3F, -8.8F, 2, 1, 1, 0, true));

        gun631_r1 = new ModelRenderer(this);
        gun631_r1.setRotationPoint(0, -39.4621F, -47.063F);
        gun.addChild(gun631_r1);
        setRotationAngle(gun631_r1, -1.8589F, 0, 0);
        gun631_r1.cubeList.add(new ModelBox(gun631_r1, 200, 0, -2.5F, -37.3F, -8.8F, 1, 4, 1, 0, true));

        gun629_r1 = new ModelRenderer(this);
        gun629_r1.setRotationPoint(0, 1.8486F, -7.3685F);
        gun.addChild(gun629_r1);
        setRotationAngle(gun629_r1, -0.1859F, 0, 0);
        gun629_r1.cubeList.add(new ModelBox(gun629_r1, 200, 0, -1.5F, -38.6F, -13.6F, 1, 1, 3, 0, true));
        gun629_r1.cubeList.add(new ModelBox(gun629_r1, 200, 0, -3.5F, -38.6F, -13.6F, 1, 1, 3, 0, true));

        gun630_r1 = new ModelRenderer(this);
        gun630_r1.setRotationPoint(0, 0.4135F, -21.8856F);
        gun.addChild(gun630_r1);
        setRotationAngle(gun630_r1, -0.5577F, 0, 0);
        gun630_r1.cubeList.add(new ModelBox(gun630_r1, 200, 0, -1.5F, -38, -10.65F, 1, 1, 2, 0, true));

        gun628_r1 = new ModelRenderer(this);
        gun628_r1.setRotationPoint(0, 5.3597F, -16.9554F);
        gun.addChild(gun628_r1);
        setRotationAngle(gun628_r1, -0.409F, 0, 0);
        gun628_r1.cubeList.add(new ModelBox(gun628_r1, 0, 0, -0.5F, -38.2F, -21.4F, 1, 2, 1, 0, true));

        gun627_r1 = new ModelRenderer(this);
        gun627_r1.setRotationPoint(-38.2103F, -23.4012F, 0);
        gun.addChild(gun627_r1);
        setRotationAngle(gun627_r1, 0, 0, 1.1525F);
        gun627_r1.cubeList.add(new ModelBox(gun627_r1, 200, 0, -1.1F, -41.1F, -31, 2, 1, 14, 0, true));

        gun624_r1 = new ModelRenderer(this);
        gun624_r1.setRotationPoint(-21.3082F, 0, -53.3739F);
        gun.addChild(gun624_r1);
        setRotationAngle(gun624_r1, -3.1416F, -0.7854F, 3.1416F);
        gun624_r1.cubeList.add(new ModelBox(gun624_r1, 200, 0, 0.4F, -38.5F, -31.1F, 1, 4, 1, 0, true));

        gun623_r1 = new ModelRenderer(this);
        gun623_r1.setRotationPoint(-20.7961F, 0, -53.586F);
        gun.addChild(gun623_r1);
        setRotationAngle(gun623_r1, -3.1416F, -0.7854F, 3.1416F);
        gun623_r1.cubeList.add(new ModelBox(gun623_r1, 200, 0, 0.7F, -37.5F, -31.1F, 1, 2, 1, 0, true));

        gun622_r1 = new ModelRenderer(this);
        gun622_r1.setRotationPoint(0, -40.6403F, -64.0139F);
        gun.addChild(gun622_r1);
        setRotationAngle(gun622_r1, -2.1564F, 0, 0);
        gun622_r1.cubeList.add(new ModelBox(gun622_r1, 200, 0, -0.3F, -37.5F, -21.1F, 1, 1, 2, 0, true));

        gun621_r1 = new ModelRenderer(this);
        gun621_r1.setRotationPoint(-26.4201F, -65.9564F, 0);
        gun.addChild(gun621_r1);
        setRotationAngle(gun621_r1, 0, 0, 2.3562F);
        gun621_r1.cubeList.add(new ModelBox(gun621_r1, 200, 0, 0.45F, -38.45F, -31.1F, 1, 1, 10, 0, true));

        gun620_r1 = new ModelRenderer(this);
        gun620_r1.setRotationPoint(-7.5947F, -74.0778F, 0);
        gun.addChild(gun620_r1);
        setRotationAngle(gun620_r1, 0, 0, 2.8999F);
        gun620_r1.cubeList.add(new ModelBox(gun620_r1, 200, 0, 0.7F, -37.5F, -31.1F, 1, 1, 10, 0, true));

        gun619_r1 = new ModelRenderer(this);
        gun619_r1.setRotationPoint(-30.5661F, -52.3276F, 0);
        gun.addChild(gun619_r1);
        setRotationAngle(gun619_r1, 0, 0, 2.0448F);
        gun619_r1.cubeList.add(new ModelBox(gun619_r1, 200, 0, 0.7F, -35.5F, -31.1F, 2, 1, 9, 0, true));

        gun617_r1 = new ModelRenderer(this);
        gun617_r1.setRotationPoint(0, -3.2987F, -39.9546F);
        gun.addChild(gun617_r1);
        setRotationAngle(gun617_r1, -1.041F, 0, 0);
        gun617_r1.cubeList.add(new ModelBox(gun617_r1, 0, 0, -4.5F, -36.5F, -17.1F, 1, 1, 2, 0, true));

        gun616_r1 = new ModelRenderer(this);
        gun616_r1.setRotationPoint(0, -15.9796F, 17.271F);
        gun.addChild(gun616_r1);
        setRotationAngle(gun616_r1, 0.632F, 0, 0);
        gun616_r1.cubeList.add(new ModelBox(gun616_r1, 0, 0, -4.5F, -34.4F, -15.8F, 1, 1, 2, 0, true));

        gun615_r1 = new ModelRenderer(this);
        gun615_r1.setRotationPoint(0, 2.304F, -5.2518F);
        gun.addChild(gun615_r1);
        setRotationAngle(gun615_r1, -0.1396F, 0, 0);
        gun615_r1.cubeList.add(new ModelBox(gun615_r1, 0, 0, -4.5F, -35.4F, -19.1F, 1, 2, 6, 0, true));
        gun615_r1.cubeList.add(new ModelBox(gun615_r1, 0, 0, -4.5F, -33.4F, -30.1F, 5, 1, 17, 0, true));

        gun611_r1 = new ModelRenderer(this);
        gun611_r1.setRotationPoint(0, 19.942F, -21.6385F);
        gun.addChild(gun611_r1);
        setRotationAngle(gun611_r1, -0.409F, 0, 0);
        gun611_r1.cubeList.add(new ModelBox(gun611_r1, 200, 0, -3.3F, -42.2F, -58.9F, 1, 1, 1, 0, true));
        gun611_r1.cubeList.add(new ModelBox(gun611_r1, 200, 0, -1.7F, -42.2F, -58.9F, 1, 1, 1, 0, true));

        gun609_r1 = new ModelRenderer(this);
        gun609_r1.setRotationPoint(0, 25.3631F, -76.576F);
        gun.addChild(gun609_r1);
        setRotationAngle(gun609_r1, -1.2269F, 0, 0);
        gun609_r1.cubeList.add(new ModelBox(gun609_r1, 200, 0, -1.7F, -41.7F, -56.3F, 1, 2, 1, 0, true));

        gun608_r1 = new ModelRenderer(this);
        gun608_r1.setRotationPoint(0, 6.0073F, -4.9912F);
        gun.addChild(gun608_r1);
        setRotationAngle(gun608_r1, -0.1115F, 0, 0);
        gun608_r1.cubeList.add(new ModelBox(gun608_r1, 200, 0, -3.3F, -41.7F, -56.3F, 1, 1, 5, 0, true));
        gun608_r1.cubeList.add(new ModelBox(gun608_r1, 200, 0, -1.7F, -41.7F, -56.3F, 1, 1, 5, 0, true));

        gun562_r1 = new ModelRenderer(this);
        gun562_r1.setRotationPoint(0, -0.9293F, -29.5834F);
        gun.addChild(gun562_r1);
        setRotationAngle(gun562_r1, -0.7436F, 0, 0);
        gun562_r1.cubeList.add(new ModelBox(gun562_r1, 0, 0, -4.5F, -38.4F, -13.6F, 5, 1, 3, 0, true));

        gun561_r1 = new ModelRenderer(this);
        gun561_r1.setRotationPoint(0, 0.8051F, -6.5628F);
        gun.addChild(gun561_r1);
        setRotationAngle(gun561_r1, -0.1859F, 0, 0);
        gun561_r1.cubeList.add(new ModelBox(gun561_r1, 0, 0, -4.5F, -34.8F, -8.6F, 5, 3, 10, 0, true));

        gun560_r1 = new ModelRenderer(this);
        gun560_r1.setRotationPoint(0, 1.652F, -14.4155F);
        gun.addChild(gun560_r1);
        setRotationAngle(gun560_r1, -0.3718F, 0, 0);
        gun560_r1.cubeList.add(new ModelBox(gun560_r1, 0, 0, -0.7F, -37.5F, -11.6F, 1, 4, 18, 0, true));
        gun560_r1.cubeList.add(new ModelBox(gun560_r1, 0, 0, -4.3F, -37.5F, -11.6F, 4, 4, 18, 0, true));

        gun559_r1 = new ModelRenderer(this);
        gun559_r1.setRotationPoint(0, 0.7118F, -18.612F);
        gun.addChild(gun559_r1);
        setRotationAngle(gun559_r1, -0.4833F, 0, 0);
        gun559_r1.cubeList.add(new ModelBox(gun559_r1, 0, 0, -0.7F, -37.4F, -10.75F, 1, 1, 3, 0, true));
        gun559_r1.cubeList.add(new ModelBox(gun559_r1, 0, 0, -4.3F, -37.4F, -10.75F, 4, 1, 3, 0, true));

        gun558_r1 = new ModelRenderer(this);
        gun558_r1.setRotationPoint(0, 2.0019F, -19.0779F);
        gun.addChild(gun558_r1);
        setRotationAngle(gun558_r1, -0.4833F, 0, 0);
        gun558_r1.cubeList.add(new ModelBox(gun558_r1, 0, 0, -4.5F, -37.7F, -13.6F, 5, 2, 8, 0, true));

        gun557_r1 = new ModelRenderer(this);
        gun557_r1.setRotationPoint(22.5316F, -66.4671F, 0);
        gun.addChild(gun557_r1);
        setRotationAngle(gun557_r1, 0, 0, -2.3562F);
        gun557_r1.cubeList.add(new ModelBox(gun557_r1, 200, 0, -2.5F, -37.9F, -126, 1, 1, 3, 0, true));

        gun556_r1 = new ModelRenderer(this);
        gun556_r1.setRotationPoint(24.2387F, -65.76F, 0);
        gun.addChild(gun556_r1);
        setRotationAngle(gun556_r1, 0, 0, -2.3562F);
        gun556_r1.cubeList.add(new ModelBox(gun556_r1, 200, 0, -1.5F, -37.9F, -126, 1, 1, 3, 0, true));

        gun555_r1 = new ModelRenderer(this);
        gun555_r1.setRotationPoint(-28.26F, -66.2943F, 0);
        gun.addChild(gun555_r1);
        setRotationAngle(gun555_r1, 0, 0, 2.3562F);
        gun555_r1.cubeList.add(new ModelBox(gun555_r1, 200, 0, -0.4F, -39, -126, 1, 1, 3, 0, true));

        gun554_r1 = new ModelRenderer(this);
        gun554_r1.setRotationPoint(-28.9671F, -68.0014F, 0);
        gun.addChild(gun554_r1);
        setRotationAngle(gun554_r1, 0, 0, 2.3562F);
        gun554_r1.cubeList.add(new ModelBox(gun554_r1, 200, 0, -0.4F, -40, -126, 1, 1, 3, 0, true));
        gun554_r1.cubeList.add(new ModelBox(gun554_r1, 200, 0, -0.4F, -40, -104.1F, 1, 1, 2, 0, true));
        gun554_r1.cubeList.add(new ModelBox(gun554_r1, 200, 0, -0.4F, -40, -108.1F, 1, 1, 2, 0, true));

        gun553_r1 = new ModelRenderer(this);
        gun553_r1.setRotationPoint(26.5227F, -13.9684F, 0);
        gun.addChild(gun553_r1);
        setRotationAngle(gun553_r1, 0, 0, -0.7854F);
        gun553_r1.cubeList.add(new ModelBox(gun553_r1, 200, 0, -3.6F, -39, -126, 1, 1, 3, 0, true));

        gun552_r1 = new ModelRenderer(this);
        gun552_r1.setRotationPoint(27.2299F, -14.2613F, 0);
        gun.addChild(gun552_r1);
        setRotationAngle(gun552_r1, 0, 0, -0.7854F);
        gun552_r1.cubeList.add(new ModelBox(gun552_r1, 200, 0, -3.6F, -40, -126, 1, 1, 3, 0, true));
        gun552_r1.cubeList.add(new ModelBox(gun552_r1, 200, 0, -3.6F, -40, -108.1F, 1, 1, 2, 0, true));
        gun552_r1.cubeList.add(new ModelBox(gun552_r1, 200, 0, -3.6F, -40, -104.1F, 1, 1, 2, 0, true));

        gun551_r1 = new ModelRenderer(this);
        gun551_r1.setRotationPoint(-29.5014F, -10.9773F, 0);
        gun.addChild(gun551_r1);
        setRotationAngle(gun551_r1, 0, 0, 0.7854F);
        gun551_r1.cubeList.add(new ModelBox(gun551_r1, 200, 0, -1.5F, -41.1F, -126, 1, 1, 3, 0, true));
        gun551_r1.cubeList.add(new ModelBox(gun551_r1, 200, 0, -1.5F, -41.1F, -104.1F, 1, 1, 2, 0, true));
        gun551_r1.cubeList.add(new ModelBox(gun551_r1, 200, 0, -1.5F, -41.1F, -108.1F, 1, 1, 2, 0, true));

        gun550_r1 = new ModelRenderer(this);
        gun550_r1.setRotationPoint(-29.7943F, -10.2701F, 0);
        gun.addChild(gun550_r1);
        setRotationAngle(gun550_r1, 0, 0, 0.7854F);
        gun550_r1.cubeList.add(new ModelBox(gun550_r1, 200, 0, -2.5F, -41.1F, -126, 1, 1, 3, 0, true));
        gun550_r1.cubeList.add(new ModelBox(gun550_r1, 200, 0, -2.5F, -41.1F, -104.1F, 1, 1, 2, 0, true));
        gun550_r1.cubeList.add(new ModelBox(gun550_r1, 200, 0, -2.5F, -41.1F, -108.1F, 1, 1, 2, 0, true));

        gun542_r1 = new ModelRenderer(this);
        gun542_r1.setRotationPoint(0, -138.9683F, -67.934F);
        gun.addChild(gun542_r1);
        setRotationAngle(gun542_r1, 1.5615F, 0, 0);
        gun542_r1.cubeList.add(new ModelBox(gun542_r1, 200, 0, -3.5F, -35.2F, -104.1F, 3, 2, 1, 0, true));

        gun541_r1 = new ModelRenderer(this);
        gun541_r1.setRotationPoint(-36.6464F, -45.4557F, 0);
        gun.addChild(gun541_r1);
        setRotationAngle(gun541_r1, 0, 0, 1.7846F);
        gun541_r1.cubeList.add(new ModelBox(gun541_r1, 200, 0, 0, -37.5F, -108.3F, 2, 1, 1, 0, true));

        gun540_r1 = new ModelRenderer(this);
        gun540_r1.setRotationPoint(9.5149F, -2.2921F, 0);
        gun.addChild(gun540_r1);
        setRotationAngle(gun540_r1, 0, 0, -0.2602F);
        gun540_r1.cubeList.add(new ModelBox(gun540_r1, 200, 0, -4, -37.5F, -108.3F, 1, 2, 2, 0, true));

        gun537_r1 = new ModelRenderer(this);
        gun537_r1.setRotationPoint(0, -143.0672F, -71.7968F);
        gun.addChild(gun537_r1);
        setRotationAngle(gun537_r1, 1.5615F, 0, 0);
        gun537_r1.cubeList.add(new ModelBox(gun537_r1, 200, 0, -3.5F, -35.3F, -108.1F, 3, 2, 1, 0, true));

        gun536_r1 = new ModelRenderer(this);
        gun536_r1.setRotationPoint(-36.2827F, -45.7489F, 0);
        gun.addChild(gun536_r1);
        setRotationAngle(gun536_r1, 0, 0, 1.7846F);
        gun536_r1.cubeList.add(new ModelBox(gun536_r1, 200, 0, 0.3F, -37.5F, -104.1F, 2, 1, 2, 0, true));
        gun536_r1.cubeList.add(new ModelBox(gun536_r1, 200, 0, 0.3F, -37.5F, -108.1F, 2, 1, 2, 0, true));

        gun533_r1 = new ModelRenderer(this);
        gun533_r1.setRotationPoint(9.5048F, -2.3693F, 0);
        gun.addChild(gun533_r1);
        setRotationAngle(gun533_r1, 0, 0, -0.2602F);
        gun533_r1.cubeList.add(new ModelBox(gun533_r1, 200, 0, -4.3F, -37.5F, -104.1F, 1, 2, 2, 0, true));
        gun533_r1.cubeList.add(new ModelBox(gun533_r1, 200, 0, -4.3F, -37.5F, -108.1F, 1, 2, 2, 0, true));

        gun626_r1 = new ModelRenderer(this);
        gun626_r1.setRotationPoint(-31.0453F, -63.7946F, 0);
        gun.addChild(gun626_r1);
        setRotationAngle(gun626_r1, 0, 0, 2.2307F);
        gun626_r1.cubeList.add(new ModelBox(gun626_r1, 200, 0, 0.1F, -39.5F, -30.5F, 1, 1, 13, 0, true));

        gun517_r1 = new ModelRenderer(this);
        gun517_r1.setRotationPoint(-32.9103F, -59.7392F, 0);
        gun.addChild(gun517_r1);
        setRotationAngle(gun517_r1, 0, 0, 2.1192F);
        gun517_r1.cubeList.add(new ModelBox(gun517_r1, 200, 0, 0.3F, -39.1F, -104.1F, 1, 1, 2, 0, true));
        gun517_r1.cubeList.add(new ModelBox(gun517_r1, 200, 0, 0.3F, -39.1F, -108.1F, 1, 1, 2, 0, true));

        gun515_r1 = new ModelRenderer(this);
        gun515_r1.setRotationPoint(21.1727F, -9.126F, 0);
        gun.addChild(gun515_r1);
        setRotationAngle(gun515_r1, 0, 0, -0.5949F);
        gun515_r1.cubeList.add(new ModelBox(gun515_r1, 200, 0, -4.3F, -39.1F, -104.1F, 1, 1, 2, 0, true));
        gun515_r1.cubeList.add(new ModelBox(gun515_r1, 200, 0, -4.3F, -39.1F, -108.1F, 1, 1, 2, 0, true));

        gun510_r1 = new ModelRenderer(this);
        gun510_r1.setRotationPoint(22.6023F, -66.6378F, 0);
        gun.addChild(gun510_r1);
        setRotationAngle(gun510_r1, 0, 0, -2.3562F);
        gun510_r1.cubeList.add(new ModelBox(gun510_r1, 200, 0, -2.5F, -38, -128, 1, 1, 55, 0, true));

        gun509_r1 = new ModelRenderer(this);
        gun509_r1.setRotationPoint(24.3094F, -65.9307F, 0);
        gun.addChild(gun509_r1);
        setRotationAngle(gun509_r1, 0, 0, -2.3562F);
        gun509_r1.cubeList.add(new ModelBox(gun509_r1, 200, 0, -1.5F, -38, -128, 1, 1, 55, 0, true));

        gun508_r1 = new ModelRenderer(this);
        gun508_r1.setRotationPoint(-28.4307F, -66.2236F, 0);
        gun.addChild(gun508_r1);
        setRotationAngle(gun508_r1, 0, 0, 2.3562F);
        gun508_r1.cubeList.add(new ModelBox(gun508_r1, 200, 0, -0.5F, -39, -128, 1, 1, 55, 0, true));

        gun507_r1 = new ModelRenderer(this);
        gun507_r1.setRotationPoint(-29.1378F, -67.9307F, 0);
        gun.addChild(gun507_r1);
        setRotationAngle(gun507_r1, 0, 0, 2.3562F);
        gun507_r1.cubeList.add(new ModelBox(gun507_r1, 200, 0, -0.5F, -40, -128, 1, 1, 55, 0, true));

        gun506_r1 = new ModelRenderer(this);
        gun506_r1.setRotationPoint(26.552F, -13.8977F, 0);
        gun.addChild(gun506_r1);
        setRotationAngle(gun506_r1, 0, 0, -0.7854F);
        gun506_r1.cubeList.add(new ModelBox(gun506_r1, 200, 0, -3.5F, -39, -128, 1, 1, 55, 0, true));

        gun505_r1 = new ModelRenderer(this);
        gun505_r1.setRotationPoint(27.2591F, -14.1906F, 0);
        gun.addChild(gun505_r1);
        setRotationAngle(gun505_r1, 0, 0, -0.7854F);
        gun505_r1.cubeList.add(new ModelBox(gun505_r1, 200, 0, -3.5F, -40, -128, 1, 1, 55, 0, true));

        gun504_r1 = new ModelRenderer(this);
        gun504_r1.setRotationPoint(-29.7236F, -10.2409F, 0);
        gun.addChild(gun504_r1);
        setRotationAngle(gun504_r1, 0, 0, 0.7854F);
        gun504_r1.cubeList.add(new ModelBox(gun504_r1, 200, 0, -2.5F, -41, -128, 1, 1, 55, 0, true));
        gun504_r1.cubeList.add(new ModelBox(gun504_r1, 200, 0, -2.5F, -41, -35, 1, 1, 1, 0, true));

        gun5033_r1 = new ModelRenderer(this);
        gun5033_r1.setRotationPoint(-29.4307F, -10.948F, 0);
        gun.addChild(gun5033_r1);
        setRotationAngle(gun5033_r1, 0, 0, 0.7854F);
        gun5033_r1.cubeList.add(new ModelBox(gun5033_r1, 200, 0, -1.5F, -41, -128, 1, 1, 55, 0, true));
        gun5033_r1.cubeList.add(new ModelBox(gun5033_r1, 200, 0, -1.5F, -41, -35, 1, 1, 1, 0, true));

        gun503_r1 = new ModelRenderer(this);
        gun503_r1.setRotationPoint(0, 2.792F, -6.7F);
        gun.addChild(gun503_r1);
        setRotationAngle(gun503_r1, -0.1768F, 0, 0);
        gun503_r1.cubeList.add(new ModelBox(gun503_r1, 0, 0, -0.5F, -36.4F, -19.1F, 1, 4, 10, 0, true));

        gun502_r1 = new ModelRenderer(this);
        gun502_r1.setRotationPoint(0, 2.122F, -4.7533F);
        gun.addChild(gun502_r1);
        setRotationAngle(gun502_r1, -0.1267F, 0, 0);
        gun502_r1.cubeList.add(new ModelBox(gun502_r1, 0, 0, -4, -36.4F, -19.1F, 1, 4, 6, 0, true));

        gun495_r1 = new ModelRenderer(this);
        gun495_r1.setRotationPoint(-23.221F, -6.4434F, 0);
        gun.addChild(gun495_r1);
        setRotationAngle(gun495_r1, 0, 0, 0.5949F);
        gun495_r1.cubeList.add(new ModelBox(gun495_r1, 200, 0, -1.1F, -41.1F, -34.5F, 1, 1, 4, 0, true));
        gun495_r1.cubeList.add(new ModelBox(gun495_r1, 200, 0, -1.1F, -41.1F, -18, 1, 1, 1, 0, true));

        gun494_r1 = new ModelRenderer(this);
        gun494_r1.setRotationPoint(-12.081F, -77.075F, 0);
        gun.addChild(gun494_r1);
        setRotationAngle(gun494_r1, 0, 0, 2.8256F);
        gun494_r1.cubeList.add(new ModelBox(gun494_r1, 200, 0, 0.1F, -39.5F, -34.5F, 1, 1, 4, 0, true));
        gun494_r1.cubeList.add(new ModelBox(gun494_r1, 200, 0, 0.1F, -39.5F, -18, 1, 1, 1, 0, true));

        gun493_r1 = new ModelRenderer(this);
        gun493_r1.setRotationPoint(-36.5993F, -17.3939F, 0);
        gun.addChild(gun493_r1);
        setRotationAngle(gun493_r1, 0, 0, 1.0282F);
        gun493_r1.cubeList.add(new ModelBox(gun493_r1, 200, 0, -2.9F, -41.1F, -34.5F, 1, 1, 3, 0, true));
        gun493_r1.cubeList.add(new ModelBox(gun493_r1, 200, 0, -2.9F, -41.1F, -22, 1, 1, 5, 0, true));

        gun492_r1 = new ModelRenderer(this);
        gun492_r1.setRotationPoint(34.7944F, -31.4822F, 0);
        gun.addChild(gun492_r1);
        setRotationAngle(gun492_r1, 0, 0, -1.2641F);
        gun492_r1.cubeList.add(new ModelBox(gun492_r1, 200, 0, -4.1F, -39.5F, -34.5F, 1, 1, 3, 0, true));
        gun492_r1.cubeList.add(new ModelBox(gun492_r1, 200, 0, -4.1F, -39.5F, -22, 1, 1, 5, 0, true));

        gun487_r1 = new ModelRenderer(this);
        gun487_r1.setRotationPoint(-31.9719F, -11.8345F, 0);
        gun.addChild(gun487_r1);
        setRotationAngle(gun487_r1, 0, 0, 0.8551F);
        gun487_r1.cubeList.add(new ModelBox(gun487_r1, 0, 0, -3, -41, -73, 1, 1, 1, 0, true));

        gun486_r1 = new ModelRenderer(this);
        gun486_r1.setRotationPoint(32.7305F, -24.4844F, 0);
        gun.addChild(gun486_r1);
        setRotationAngle(gun486_r1, 0, 0, -1.0782F);
        gun486_r1.cubeList.add(new ModelBox(gun486_r1, 200, 0, -4.1F, -39.6F, -73, 1, 1, 1, 0, true));

        gun484_r1 = new ModelRenderer(this);
        gun484_r1.setRotationPoint(-35.9951F, -17.0097F, 0);
        gun.addChild(gun484_r1);
        setRotationAngle(gun484_r1, 0, 0, 1.0038F);
        gun484_r1.cubeList.add(new ModelBox(gun484_r1, 0, 0, -2.5F, -41.3F, -73, 1, 1, 1, 0, true));

        gun483_r1 = new ModelRenderer(this);
        gun483_r1.setRotationPoint(-29.1025F, -11.276F, 0);
        gun.addChild(gun483_r1);
        setRotationAngle(gun483_r1, 0, 0, 0.7808F);
        gun483_r1.cubeList.add(new ModelBox(gun483_r1, 0, 0, -0.85F, -41, -73, 1, 1, 1, 0, true));

        gun482_r1 = new ModelRenderer(this);
        gun482_r1.setRotationPoint(-16.229F, -75.6768F, 0);
        gun.addChild(gun482_r1);
        setRotationAngle(gun482_r1, 0, 0, 2.714F);
        gun482_r1.cubeList.add(new ModelBox(gun482_r1, 200, 0, 0.1F, -39.6F, -73, 1, 1, 1, 0, true));

        gun480_r1 = new ModelRenderer(this);
        gun480_r1.setRotationPoint(-19.3649F, -4.0336F, 0);
        gun.addChild(gun480_r1);
        setRotationAngle(gun480_r1, 0, 0, 0.4833F);
        gun480_r1.cubeList.add(new ModelBox(gun480_r1, 0, 0, -1.5F, -41.3F, -73, 1, 1, 1, 0, true));

        gun478_r1 = new ModelRenderer(this);
        gun478_r1.setRotationPoint(9.5082F, -2.3435F, 0);
        gun.addChild(gun478_r1);
        setRotationAngle(gun478_r1, 0, 0, -0.2602F);
        gun478_r1.cubeList.add(new ModelBox(gun478_r1, 0, 0, -4.2F, -37.5F, -108, 1, 2, 36, 0, true));

        gun477_r1 = new ModelRenderer(this);
        gun477_r1.setRotationPoint(-36.4039F, -45.6512F, 0);
        gun.addChild(gun477_r1);
        setRotationAngle(gun477_r1, 0, 0, 1.7846F);
        gun477_r1.cubeList.add(new ModelBox(gun477_r1, 0, 0, 0.2F, -37.5F, -108, 2, 1, 36, 0, true));

        gun476_r1 = new ModelRenderer(this);
        gun476_r1.setRotationPoint(0, -141.4F, -70.6F);
        gun.addChild(gun476_r1);
        setRotationAngle(gun476_r1, 1.5708F, 0, 0);
        gun476_r1.cubeList.add(new ModelBox(gun476_r1, 0, 0, -3.5F, -35.4F, -106, 3, 34, 1, 0, true));

        gun472_r1 = new ModelRenderer(this);
        gun472_r1.setRotationPoint(-35.5634F, -46.6036F, 0);
        gun.addChild(gun472_r1);
        setRotationAngle(gun472_r1, 0, 0, 1.8218F);
        gun472_r1.cubeList.add(new ModelBox(gun472_r1, 200, 0, 0.3F, -37.1F, -72, 2, 1, 3, 0, true));

        gun471_r1 = new ModelRenderer(this);
        gun471_r1.setRotationPoint(9.4019F, -2.3558F, 0);
        gun.addChild(gun471_r1);
        setRotationAngle(gun471_r1, 0, 0, -0.2602F);
        gun471_r1.cubeList.add(new ModelBox(gun471_r1, 200, 0, -4.3F, -37.1F, -72, 1, 2, 3, 0, true));

        gun470_r1 = new ModelRenderer(this);
        gun470_r1.setRotationPoint(-34.0987F, -13.9872F, 0);
        gun.addChild(gun470_r1);
        setRotationAngle(gun470_r1, 0, 0, 0.9295F);
        gun470_r1.cubeList.add(new ModelBox(gun470_r1, 200, 0, -3.1F, -41, -72, 1, 1, 3, 0, true));

        gun469_r1 = new ModelRenderer(this);
        gun469_r1.setRotationPoint(-32.8077F, -64.0452F, 0);
        gun.addChild(gun469_r1);
        setRotationAngle(gun469_r1, 0, 0, 2.1973F);
        gun469_r1.cubeList.add(new ModelBox(gun469_r1, 200, 0, -0.05F, -40.4F, -72, 1, 1, 3, 0, true));

        gun468_r1 = new ModelRenderer(this);
        gun468_r1.setRotationPoint(-15.847F, -75.7597F, 0);
        gun.addChild(gun468_r1);
        setRotationAngle(gun468_r1, 0, 0, 2.714F);
        gun468_r1.cubeList.add(new ModelBox(gun468_r1, 200, 0, 0.3F, -39.6F, -72, 1, 1, 3, 0, true));

        gun467_r1 = new ModelRenderer(this);
        gun467_r1.setRotationPoint(-17.9458F, -3.3904F, 0);
        gun.addChild(gun467_r1);
        setRotationAngle(gun467_r1, 0, 0, 0.4461F);
        gun467_r1.cubeList.add(new ModelBox(gun467_r1, 200, 0, -1.5F, -41.25F, -72, 1, 1, 3, 0, true));

        gun466_r1 = new ModelRenderer(this);
        gun466_r1.setRotationPoint(-39.1787F, -22.211F, 0);
        gun.addChild(gun466_r1);
        setRotationAngle(gun466_r1, 0, 0, 1.1525F);
        gun466_r1.cubeList.add(new ModelBox(gun466_r1, 200, 0, -2.5F, -41.25F, -72, 1, 1, 3, 0, true));

        gun465_r1 = new ModelRenderer(this);
        gun465_r1.setRotationPoint(33.1549F, -26.0434F, 0);
        gun.addChild(gun465_r1);
        setRotationAngle(gun465_r1, 0, 0, -1.1154F);
        gun465_r1.cubeList.add(new ModelBox(gun465_r1, 200, 0, -4.3F, -39.6F, -72, 1, 1, 3, 0, true));

        gun460_r1 = new ModelRenderer(this);
        gun460_r1.setRotationPoint(-28.4136F, -67.6307F, 0);
        gun.addChild(gun460_r1);
        setRotationAngle(gun460_r1, 0, 0, 2.3562F);
        gun460_r1.cubeList.add(new ModelBox(gun460_r1, 200, 0, -0.2F, -39.7F, -35, 1, 1, 1, 0, true));

        gun459_r1 = new ModelRenderer(this);
        gun459_r1.setRotationPoint(26.9591F, -14.3149F, 0);
        gun.addChild(gun459_r1);
        setRotationAngle(gun459_r1, 0, 0, -0.7854F);
        gun459_r1.cubeList.add(new ModelBox(gun459_r1, 200, 0, -3.8F, -39.7F, -35, 1, 1, 1, 0, true));

        gun669_r1 = new ModelRenderer(this);
        gun669_r1.setRotationPoint(-20.5337F, -5.8788F, 0);
        gun.addChild(gun669_r1);
        setRotationAngle(gun669_r1, 0, 0, 0.5577F);
        gun669_r1.cubeList.add(new ModelBox(gun669_r1, 200, 0, 0, -38.8F, -18.5F, 1, 1, 2, 0, true));

        gun667_r1 = new ModelRenderer(this);
        gun667_r1.setRotationPoint(-39.1687F, 0, -96.9758F);
        gun.addChild(gun667_r1);
        setRotationAngle(gun667_r1, -3.1416F, -0.7854F, 3.1416F);
        gun667_r1.cubeList.add(new ModelBox(gun667_r1, 0, 0, 0.5F, -38.5F, -56.6F, 1, 2, 1, 0, true));

        gun666_r1 = new ModelRenderer(this);
        gun666_r1.setRotationPoint(-25.3094F, 0, -63.5165F);
        gun.addChild(gun666_r1);
        setRotationAngle(gun666_r1, -3.1416F, -0.7854F, 3.1416F);
        gun666_r1.cubeList.add(new ModelBox(gun666_r1, 0, 0, 0.5F, -38.5F, -37, 1, 2, 1, 0, true));

        gun665_r1 = new ModelRenderer(this);
        gun665_r1.setRotationPoint(24.8449F, 0, -14.019F);
        gun.addChild(gun665_r1);
        setRotationAngle(gun665_r1, 0, 0.7854F, 0);
        gun665_r1.cubeList.add(new ModelBox(gun665_r1, 0, 0, -4.5F, -38.5F, -37, 1, 2, 1, 0, true));

        gun664_r1 = new ModelRenderer(this);
        gun664_r1.setRotationPoint(38.7042F, 0, -19.7597F);
        gun.addChild(gun664_r1);
        setRotationAngle(gun664_r1, 0, 0.7854F, 0);
        gun664_r1.cubeList.add(new ModelBox(gun664_r1, 0, 0, -4.5F, -38.5F, -56.6F, 1, 2, 1, 0, true));

        gun663_r1 = new ModelRenderer(this);
        gun663_r1.setRotationPoint(-26.0165F, -65.2236F, 0);
        gun.addChild(gun663_r1);
        setRotationAngle(gun663_r1, 0, 0, 2.3562F);
        gun663_r1.cubeList.add(new ModelBox(gun663_r1, 0, 0, 0.5F, -38, -57.1F, 1, 1, 22, 0, true));

        gun662_r1 = new ModelRenderer(this);
        gun662_r1.setRotationPoint(-24.9559F, -62.6629F, 0);
        gun.addChild(gun662_r1);
        setRotationAngle(gun662_r1, 0, 0, 2.3562F);
        gun662_r1.cubeList.add(new ModelBox(gun662_r1, 0, 0, 0.5F, -36.5F, -57.1F, 1, 1, 22, 0, true));

        gun661_r1 = new ModelRenderer(this);
        gun661_r1.setRotationPoint(25.552F, -14.3119F, 0);
        gun.addChild(gun661_r1);
        setRotationAngle(gun661_r1, 0, 0, -0.7854F);
        gun661_r1.cubeList.add(new ModelBox(gun661_r1, 0, 0, -4.5F, -38, -57.1F, 1, 1, 22, 0, true));

        gun660_r1 = new ModelRenderer(this);
        gun660_r1.setRotationPoint(24.4914F, -13.8726F, 0);
        gun.addChild(gun660_r1);
        setRotationAngle(gun660_r1, 0, 0, -0.7854F);
        gun660_r1.cubeList.add(new ModelBox(gun660_r1, 0, 0, -4.5F, -36.5F, -57.1F, 1, 1, 22, 0, true));

        gun659_r1 = new ModelRenderer(this);
        gun659_r1.setRotationPoint(0, 14.7694F, -38.3435F);
        gun.addChild(gun659_r1);
        setRotationAngle(gun659_r1, -0.7854F, 0, 0);
        gun659_r1.cubeList.add(new ModelBox(gun659_r1, 0, 0, -4.5F, -38.9F, -37, 5, 1, 1, 0, true));

        gun658_r1 = new ModelRenderer(this);
        gun658_r1.setRotationPoint(0, 15.3259F, -37);
        gun.addChild(gun658_r1);
        setRotationAngle(gun658_r1, -0.7854F, 0, 0);
        gun658_r1.cubeList.add(new ModelBox(gun658_r1, 0, 0, -4.5F, -37, -37, 5, 1, 1, 0, true));

        gun657_r1 = new ModelRenderer(this);
        gun657_r1.setRotationPoint(0, 28.6287F, -44.0842F);
        gun.addChild(gun657_r1);
        setRotationAngle(gun657_r1, -0.7854F, 0, 0);
        gun657_r1.cubeList.add(new ModelBox(gun657_r1, 0, 0, -4.5F, -38.9F, -56.6F, 5, 1, 1, 0, true));

        gun656_r1 = new ModelRenderer(this);
        gun656_r1.setRotationPoint(0, 29.1852F, -42.7407F);
        gun.addChild(gun656_r1);
        setRotationAngle(gun656_r1, -0.7854F, 0, 0);
        gun656_r1.cubeList.add(new ModelBox(gun656_r1, 0, 0, -4.5F, -37, -56.6F, 5, 1, 1, 0, true));

        gun403_r1 = new ModelRenderer(this);
        gun403_r1.setRotationPoint(0, -2.3916F, -2.7772F);
        gun.addChild(gun403_r1);
        setRotationAngle(gun403_r1, -0.0873F, 0, 0);
        gun403_r1.cubeList.add(new ModelBox(gun403_r1, 0, 0, -4, -33, 26, 4, 14, 1, 0, true));

        gun369_r1 = new ModelRenderer(this);
        gun369_r1.setRotationPoint(0, 1.2728F, -14.5323F);
        gun.addChild(gun369_r1);
        setRotationAngle(gun369_r1, -0.3718F, 0, 0);
        gun369_r1.cubeList.add(new ModelBox(gun369_r1, 200, 0, -3.5F, -38, -10.65F, 1, 1, 2, 0, true));

        gun367_r1 = new ModelRenderer(this);
        gun367_r1.setRotationPoint(0, 2.3365F, -13.3648F);
        gun.addChild(gun367_r1);
        setRotationAngle(gun367_r1, -0.3346F, 0, 0);
        gun367_r1.cubeList.add(new ModelBox(gun367_r1, 200, 0, -3, -38.4F, -13.6F, 2, 2, 3, 0, true));
        gun367_r1.cubeList.add(new ModelBox(gun367_r1, 0, 0, -0.7F, -38.4F, -13.6F, 1, 2, 3, 0, true));
        gun367_r1.cubeList.add(new ModelBox(gun367_r1, 0, 0, -4.3F, -38.4F, -13.6F, 1, 2, 3, 0, true));

        gun364_r1 = new ModelRenderer(this);
        gun364_r1.setRotationPoint(0, 1.852F, -7.3316F);
        gun.addChild(gun364_r1);
        setRotationAngle(gun364_r1, -0.1859F, 0, 0);
        gun364_r1.cubeList.add(new ModelBox(gun364_r1, 0, 0, -1, -38.4F, -13.6F, 1, 1, 3, 0, true));
        gun364_r1.cubeList.add(new ModelBox(gun364_r1, 0, 0, -4, -38.4F, -13.6F, 1, 1, 3, 0, true));

        gun363_r1 = new ModelRenderer(this);
        gun363_r1.setRotationPoint(0, 0.6097F, -14.0578F);
        gun.addChild(gun363_r1);
        setRotationAngle(gun363_r1, -0.3718F, 0, 0);
        gun363_r1.cubeList.add(new ModelBox(gun363_r1, 0, 0, -3.5F, -37.07F, -9.65F, 3, 1, 10, 0, true));

        gun362_r1 = new ModelRenderer(this);
        gun362_r1.setRotationPoint(0, 1.283F, -14.4778F);
        gun.addChild(gun362_r1);
        setRotationAngle(gun362_r1, -0.3718F, 0, 0);
        gun362_r1.cubeList.add(new ModelBox(gun362_r1, 0, 0, -1.2F, -37.85F, -10.65F, 1, 1, 4, 0, true));
        gun362_r1.cubeList.add(new ModelBox(gun362_r1, 0, 0, -3.8F, -37.85F, -10.65F, 1, 1, 4, 0, true));

        gun311_r1 = new ModelRenderer(this);
        gun311_r1.setRotationPoint(-31.077F, -10.695F, 0);
        gun.addChild(gun311_r1);
        setRotationAngle(gun311_r1, 0, 0, 0.8179F);
        gun311_r1.cubeList.add(new ModelBox(gun311_r1, 0, 0, -3.2F, -41.2F, -49, 1, 1, 14, 0, true));

        gun310_r1 = new ModelRenderer(this);
        gun310_r1.setRotationPoint(-26.9897F, -9.3852F, 0);
        gun.addChild(gun310_r1);
        setRotationAngle(gun310_r1, 0, 0, 0.7081F);
        gun310_r1.cubeList.add(new ModelBox(gun310_r1, 0, 0, -0.8F, -41.2F, -49, 1, 1, 14, 0, true));

        gun306_r1 = new ModelRenderer(this);
        gun306_r1.setRotationPoint(-15.6974F, -75.9922F, 0);
        gun.addChild(gun306_r1);
        setRotationAngle(gun306_r1, 0, 0, 2.714F);
        gun306_r1.cubeList.add(new ModelBox(gun306_r1, 0, 0, 0.4F, -39.7F, -69, 1, 1, 34, 0, true));

        gun303_r1 = new ModelRenderer(this);
        gun303_r1.setRotationPoint(-19.4578F, -4.0565F, 0);
        gun.addChild(gun303_r1);
        setRotationAngle(gun303_r1, 0, 0, 0.4833F);
        gun303_r1.cubeList.add(new ModelBox(gun303_r1, 0, 0, -1.5F, -41.5F, -49, 1, 1, 14, 0, true));

        gun302_r1 = new ModelRenderer(this);
        gun302_r1.setRotationPoint(-38.6702F, -21.0008F, 0);
        gun.addChild(gun302_r1);
        setRotationAngle(gun302_r1, 0, 0, 1.1154F);
        gun302_r1.cubeList.add(new ModelBox(gun302_r1, 0, 0, -2.5F, -41.5F, -49, 1, 1, 14, 0, true));

        gun301_r1 = new ModelRenderer(this);
        gun301_r1.setRotationPoint(0, -0.8615F, 0.7168F);
        gun.addChild(gun301_r1);
        setRotationAngle(gun301_r1, 0.0175F, 0, 0);
        gun301_r1.cubeList.add(new ModelBox(gun301_r1, 0, 0, -2.5F, -41.5F, -49, 1, 1, 14, 0, true));

        gun290_r1 = new ModelRenderer(this);
        gun290_r1.setRotationPoint(-18.0181F, -2.7716F, 0);
        gun.addChild(gun290_r1);
        setRotationAngle(gun290_r1, 0, 0, 0.4461F);
        gun290_r1.cubeList.add(new ModelBox(gun290_r1, 200, 0, -2.9F, -41.1F, -22, 1, 1, 5, 0, true));

        gun279_r1 = new ModelRenderer(this);
        gun279_r1.setRotationPoint(0, 6.5873F, -18.9615F);
        gun.addChild(gun279_r1);
        setRotationAngle(gun279_r1, -0.4461F, 0, 0);
        gun279_r1.cubeList.add(new ModelBox(gun279_r1, 200, 0, -4.4F, -38.5F, -24, 1, 1, 4, 0, true));

        gun274_r1 = new ModelRenderer(this);
        gun274_r1.setRotationPoint(0, 11.2046F, -36.9497F);
        gun.addChild(gun274_r1);
        setRotationAngle(gun274_r1, -0.7854F, 0, 0);
        gun274_r1.cubeList.add(new ModelBox(gun274_r1, 0, 0, -4.5F, -39, -32, 5, 1, 1, 0, true));

        gun271_r1 = new ModelRenderer(this);
        gun271_r1.setRotationPoint(0, 1.8437F, -1.7923F);
        gun.addChild(gun271_r1);
        setRotationAngle(gun271_r1, -0.0524F, 0, 0);
        gun271_r1.cubeList.add(new ModelBox(gun271_r1, 200, 0, -3.5F, -33.3F, -36.1F, 3, 1, 5, 0, true));

        gun270_r1 = new ModelRenderer(this);
        gun270_r1.setRotationPoint(0, 1.6346F, -1.7763F);
        gun.addChild(gun270_r1);
        setRotationAngle(gun270_r1, -0.0524F, 0, 0);
        gun270_r1.cubeList.add(new ModelBox(gun270_r1, 200, 0, -1.2F, -33.1F, -32.1F, 1, 1, 12, 0, true));
        gun270_r1.cubeList.add(new ModelBox(gun270_r1, 200, 0, -3.8F, -33.1F, -32.1F, 3, 1, 12, 0, true));

        gun264_r1 = new ModelRenderer(this);
        gun264_r1.setRotationPoint(0, -103.2531F, -29.8334F);
        gun.addChild(gun264_r1);
        setRotationAngle(gun264_r1, 1.5243F, 0, 0);
        gun264_r1.cubeList.add(new ModelBox(gun264_r1, 0, 0, -4.5F, -36, -69, 5, 50, 1, 0, true));

        gun263_r1 = new ModelRenderer(this);
        gun263_r1.setRotationPoint(0, 1.2492F, -4.8309F);
        gun.addChild(gun263_r1);
        setRotationAngle(gun263_r1, -0.1487F, 0, 0);
        gun263_r1.cubeList.add(new ModelBox(gun263_r1, 200, 0, -3.5F, -31.8F, -10.8F, 3, 2, 3, 0, true));

        gun262_r1 = new ModelRenderer(this);
        gun262_r1.setRotationPoint(0, -56.446F, -10.3459F);
        gun.addChild(gun262_r1);
        setRotationAngle(gun262_r1, 2.714F, 0, 0);
        gun262_r1.cubeList.add(new ModelBox(gun262_r1, 200, 0, -3.5F, -27.1F, -11.3F, 3, 2, 1, 0, true));

        gun261_r1 = new ModelRenderer(this);
        gun261_r1.setRotationPoint(0, -50.7926F, 4.2917F);
        gun.addChild(gun261_r1);
        setRotationAngle(gun261_r1, 2.1192F, 0, 0);
        gun261_r1.cubeList.add(new ModelBox(gun261_r1, 200, 0, -3.5F, -26.6F, -12.1F, 3, 1, 1, 0, true));

        gun260_r1 = new ModelRenderer(this);
        gun260_r1.setRotationPoint(0, -58.9573F, -16.7261F);
        gun.addChild(gun260_r1);
        setRotationAngle(gun260_r1, 2.5653F, 0, 0);
        gun260_r1.cubeList.add(new ModelBox(gun260_r1, 200, 0, -3.5F, -27, -17.1F, 3, 1, 1, 0, true));

        gun259_r1 = new ModelRenderer(this);
        gun259_r1.setRotationPoint(0, -6.7169F, 7.8331F);
        gun.addChild(gun259_r1);
        setRotationAngle(gun259_r1, 0.2974F, 0, 0);
        gun259_r1.cubeList.add(new ModelBox(gun259_r1, 200, 0, -3.5F, -29.5F, -18.5F, 3, 2, 1, 0, true));

        gun169_r1 = new ModelRenderer(this);
        gun169_r1.setRotationPoint(0, -31.7797F, -45.2137F);
        gun.addChild(gun169_r1);
        setRotationAngle(gun169_r1, -2.0448F, 0, 0);
        gun169_r1.cubeList.add(new ModelBox(gun169_r1, 200, 0, -2.5F, -29.7F, -12.9F, 1, 1, 2, 0, true));

        gun168_r1 = new ModelRenderer(this);
        gun168_r1.setRotationPoint(0, 1.7047F, -4.7159F);
        gun.addChild(gun168_r1);
        setRotationAngle(gun168_r1, -0.1487F, 0, 0);
        gun168_r1.cubeList.add(new ModelBox(gun168_r1, 200, 0, -2.5F, -30.8F, -13.8F, 1, 1, 1, 0, true));

        gun167_r1 = new ModelRenderer(this);
        gun167_r1.setRotationPoint(0, -13.9485F, 15.1815F);
        gun.addChild(gun167_r1);
        setRotationAngle(gun167_r1, 0.6169F, 0, 0);
        gun167_r1.cubeList.add(new ModelBox(gun167_r1, 200, 0, -2.5F, -30.8F, -14.3F, 1, 1, 1, 0, true));

        gun166_r1 = new ModelRenderer(this);
        gun166_r1.setRotationPoint(0, 1.9028F, -6.5371F);
        gun.addChild(gun166_r1);
        setRotationAngle(gun166_r1, -0.2011F, 0, 0);
        gun166_r1.cubeList.add(new ModelBox(gun166_r1, 200, 0, -3.5F, -31.45F, -12.7F, 3, 1, 2, 0, true));

        gun165_r1 = new ModelRenderer(this);
        gun165_r1.setRotationPoint(0, 2.2804F, -4.2558F);
        gun.addChild(gun165_r1);
        setRotationAngle(gun165_r1, -0.1267F, 0, 0);
        gun165_r1.cubeList.add(new ModelBox(gun165_r1, 200, 0, -3.5F, -32.4F, -20.1F, 3, 1, 9, 0, true));

        gun163_r1 = new ModelRenderer(this);
        gun163_r1.setRotationPoint(0, -0.3291F, -33.627F);
        gun.addChild(gun163_r1);
        setRotationAngle(gun163_r1, -0.9666F, 0, 0);
        gun163_r1.cubeList.add(new ModelBox(gun163_r1, 200, 0, -3.5F, -32.2F, -16.5F, 3, 2, 1, 0, true));

        gun162_r1 = new ModelRenderer(this);
        gun162_r1.setRotationPoint(0, 3.2643F, -7.5499F);
        gun.addChild(gun162_r1);
        setRotationAngle(gun162_r1, -0.2269F, 0, 0);
        gun162_r1.cubeList.add(new ModelBox(gun162_r1, 200, 0, -3.5F, -31.5F, -18.1F, 3, 2, 1, 0, true));

        gun160_r1 = new ModelRenderer(this);
        gun160_r1.setRotationPoint(0, -2.7098F, 5.4708F);
        gun.addChild(gun160_r1);
        setRotationAngle(gun160_r1, 0.1859F, 0, 0);
        gun160_r1.cubeList.add(new ModelBox(gun160_r1, 200, 0, -3.5F, -30.7F, -11.8F, 3, 2, 1, 0, true));

        gun155_r1 = new ModelRenderer(this);
        gun155_r1.setRotationPoint(0, 1.408F, -2.5718F);
        gun.addChild(gun155_r1);
        setRotationAngle(gun155_r1, -0.0895F, 0, 0);
        gun155_r1.cubeList.add(new ModelBox(gun155_r1, 200, 0, -3.5F, -28, -17, 3, 1, 5, 0, true));

        gun137_r1 = new ModelRenderer(this);
        gun137_r1.setRotationPoint(0, -2.5261F, -8.4609F);
        gun.addChild(gun137_r1);
        setRotationAngle(gun137_r1, -0.2974F, 0, 0);
        gun137_r1.cubeList.add(new ModelBox(gun137_r1, 0, 0, -4.5F, -29.5F, 4.2F, 5, 2, 1, 0, true));

        gun136_r1 = new ModelRenderer(this);
        gun136_r1.setRotationPoint(0, -1.3907F, -5.5192F);
        gun.addChild(gun136_r1);
        setRotationAngle(gun136_r1, -0.1859F, 0, 0);
        gun136_r1.cubeList.add(new ModelBox(gun136_r1, 0, 0, -4.5F, -30.3F, 4.7F, 5, 1, 4, 0, true));

        gun131_r1 = new ModelRenderer(this);
        gun131_r1.setRotationPoint(0, -4.4762F, -5.1659F);
        gun.addChild(gun131_r1);
        setRotationAngle(gun131_r1, -0.2231F, 0, 0);
        gun131_r1.cubeList.add(new ModelBox(gun131_r1, 0, 0, -4.5F, -25.3F, 17.4F, 5, 2, 5, 0, true));

        gun130_r1 = new ModelRenderer(this);
        gun130_r1.setRotationPoint(0, -1.6716F, -2.1398F);
        gun.addChild(gun130_r1);
        setRotationAngle(gun130_r1, -0.0744F, 0, 0);
        gun130_r1.cubeList.add(new ModelBox(gun130_r1, 0, 0, -4.5F, -29.6F, 21.4F, 5, 8, 5, 0, true));

        gun129_r1 = new ModelRenderer(this);
        gun129_r1.setRotationPoint(0, -2.8614F, -5.5484F);
        gun.addChild(gun129_r1);
        setRotationAngle(gun129_r1, -0.2231F, 0, 0);
        gun129_r1.cubeList.add(new ModelBox(gun129_r1, 0, 0, -4.5F, -26.2F, 10, 5, 1, 4, 0, true));

        gun126_r1 = new ModelRenderer(this);
        gun126_r1.setRotationPoint(0, 1.9748F, -9.2096F);
        gun.addChild(gun126_r1);
        setRotationAngle(gun126_r1, -0.2602F, 0, 0);
        gun126_r1.cubeList.add(new ModelBox(gun126_r1, 0, 0, -4.5F, -34.2F, -12.15F, 5, 2, 13, 0, true));

        gun122_r1 = new ModelRenderer(this);
        gun122_r1.setRotationPoint(0, -2.7693F, -8.4844F);
        gun.addChild(gun122_r1);
        setRotationAngle(gun122_r1, -0.2974F, 0, 0);
        gun122_r1.cubeList.add(new ModelBox(gun122_r1, 0, 0, -4.5F, -29.7F, 5, 5, 3, 4, 0, true));

        gun117_r1 = new ModelRenderer(this);
        gun117_r1.setRotationPoint(0, -2.453F, -2.7833F);
        gun.addChild(gun117_r1);
        setRotationAngle(gun117_r1, -0.0873F, 0, 0);
        gun117_r1.cubeList.add(new ModelBox(gun117_r1, 200, 0, -1.1F, -33.1F, 26.7F, 1, 12, 1, 0, true));
        gun117_r1.cubeList.add(new ModelBox(gun117_r1, 200, 0, -3.9F, -33.1F, 26.7F, 3, 12, 1, 0, true));

        gun115_r1 = new ModelRenderer(this);
        gun115_r1.setRotationPoint(0, -4.9294F, -6.9023F);
        gun.addChild(gun115_r1);
        setRotationAngle(gun115_r1, -0.2974F, 0, 0);
        gun115_r1.cubeList.add(new ModelBox(gun115_r1, 0, 0, -4.5F, -25.5F, 13, 5, 2, 13, 0, true));

        gun114_r1 = new ModelRenderer(this);
        gun114_r1.setRotationPoint(0, -1.6084F, -9.5236F);
        gun.addChild(gun114_r1);
        setRotationAngle(gun114_r1, -0.3346F, 0, 0);
        gun114_r1.cubeList.add(new ModelBox(gun114_r1, 0, 0, -4.5F, -29, 0, 5, 1, 14, 0, true));

        gun113_r1 = new ModelRenderer(this);
        gun113_r1.setRotationPoint(0, -0.4139F, -1.2621F);
        gun.addChild(gun113_r1);
        setRotationAngle(gun113_r1, -0.0372F, 0, 0);
        gun113_r1.cubeList.add(new ModelBox(gun113_r1, 0, 0, -4, -34.15F, 10.5F, 4, 1, 17, 0, true));

        gun112_r1 = new ModelRenderer(this);
        gun112_r1.setRotationPoint(0, -27.3992F, -31.6397F);
        gun.addChild(gun112_r1);
        setRotationAngle(gun112_r1, -1.3384F, 0, 0);
        gun112_r1.cubeList.add(new ModelBox(gun112_r1, 0, 0, -4.5F, -33.7F, 1.5F, 5, 3, 2, 0, true));

        gun111_r1 = new ModelRenderer(this);
        gun111_r1.setRotationPoint(0, -0.079F, -1.2516F);
        gun.addChild(gun111_r1);
        setRotationAngle(gun111_r1, -0.0372F, 0, 0);
        gun111_r1.cubeList.add(new ModelBox(gun111_r1, 0, 0, -4.5F, -33.7F, 1.5F, 5, 4, 25, 0, true));

        gun110_r1 = new ModelRenderer(this);
        gun110_r1.setRotationPoint(0, -2.4344F, -2.7579F);
        gun.addChild(gun110_r1);
        setRotationAngle(gun110_r1, -0.0873F, 0, 0);
        gun110_r1.cubeList.add(new ModelBox(gun110_r1, 0, 0, -4, -32.8F, 26.5F, 4, 14, 1, 0, true));

        gun109_r1 = new ModelRenderer(this);
        gun109_r1.setRotationPoint(0, -4.8987F, -6.6972F);
        gun.addChild(gun109_r1);
        setRotationAngle(gun109_r1, -0.2974F, 0, 0);
        gun109_r1.cubeList.add(new ModelBox(gun109_r1, 0, 0, -4, -24.8F, 13, 4, 2, 13, 0, true));

        gun108_r1 = new ModelRenderer(this);
        gun108_r1.setRotationPoint(0, -1.5695F, -9.2937F);
        gun.addChild(gun108_r1);
        setRotationAngle(gun108_r1, -0.3346F, 0, 0);
        gun108_r1.cubeList.add(new ModelBox(gun108_r1, 0, 0, -4, -28.3F, 0, 4, 1, 14, 0, true));

        gun107_r1 = new ModelRenderer(this);
        gun107_r1.setRotationPoint(0, -0.0796F, -1.2813F);
        gun.addChild(gun107_r1);
        setRotationAngle(gun107_r1, -0.0372F, 0, 0);
        gun107_r1.cubeList.add(new ModelBox(gun107_r1, 0, 0, -3.5F, -34.5F, 1.5F, 3, 1, 22, 0, true));

        gun101_r1 = new ModelRenderer(this);
        gun101_r1.setRotationPoint(0, 2.0422F, -8.6949F);
        gun.addChild(gun101_r1);
        setRotationAngle(gun101_r1, -0.2602F, 0, 0);
        gun101_r1.cubeList.add(new ModelBox(gun101_r1, 0, 0, -4.5F, -32.2F, -12.15F, 5, 1, 13, 0, true));

        gun81_r1 = new ModelRenderer(this);
        gun81_r1.setRotationPoint(0, 1.4965F, -4.6121F);
        gun.addChild(gun81_r1);
        setRotationAngle(gun81_r1, -0.1267F, 0, 0);
        gun81_r1.cubeList.add(new ModelBox(gun81_r1, 0, 0, -4.5F, -35.6F, -14.1F, 1, 4, 5, 0, true));

        gun19_r1 = new ModelRenderer(this);
        gun19_r1.setRotationPoint(0, 2.154F, -4.2478F);
        gun.addChild(gun19_r1);
        setRotationAngle(gun19_r1, -0.1267F, 0, 0);
        gun19_r1.cubeList.add(new ModelBox(gun19_r1, 0, 0, -4, -32.4F, -19.1F, 4, 1, 7, 0, true));

        gun12_r1 = new ModelRenderer(this);
        gun12_r1.setRotationPoint(0, -24.28F, -31.4856F);
        gun.addChild(gun12_r1);
        setRotationAngle(gun12_r1, -1.2269F, 0, 0);
        gun12_r1.cubeList.add(new ModelBox(gun12_r1, 0, 0, -3.5F, -34.5F, 1.5F, 3, 3, 1, 0, true));

        gun3_r1 = new ModelRenderer(this);
        gun3_r1.setRotationPoint(0, -101.5468F, -30.0526F);
        gun.addChild(gun3_r1);
        setRotationAngle(gun3_r1, 1.5097F, 0, 0);
        gun3_r1.cubeList.add(new ModelBox(gun3_r1, 0, 0, -4, -34.8F, -69, 4, 50, 2, 0, true));

        gun2_r1 = new ModelRenderer(this);
        gun2_r1.setRotationPoint(0, 2.0657F, -8.5148F);
        gun.addChild(gun2_r1);
        setRotationAngle(gun2_r1, -0.2602F, 0, 0);
        gun2_r1.cubeList.add(new ModelBox(gun2_r1, 0, 0, -4, -31.5F, -12.15F, 4, 1, 13, 0, true));

        gun432_r1 = new ModelRenderer(this);
        gun432_r1.setRotationPoint(0, 1.4925F, -4.6753F);
        gun.addChild(gun432_r1);
        setRotationAngle(gun432_r1, -0.1267F, 0, 0);
        gun432_r1.cubeList.add(new ModelBox(gun432_r1, 0, 0, -4.5F, -36.1F, -14.1F, 5, 1, 2, 0, true));
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        gun.render(f5);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
