package com.paneedah.mwc.weapons;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public final class Bullets {

    public static ItemBullet Bullet20x82mm;
    public static ItemBullet Bullet50BMG;
    public static ItemBullet Bullet408CT;
    public static ItemBullet Bullet308Winchester;
    public static ItemBullet Bullet277;
    public static ItemBullet Bullet8x58;
    public static ItemBullet Bullet792x57;
    public static ItemBullet Bullet792x33Kurz;
    public static ItemBullet Bullet3006Springfield;
    public static ItemBullet Bullet762x54;
    public static ItemBullet Bullet762x51;
    public static ItemBullet Shotgun12Guage;
    public static ItemBullet Shotgun4G;
    public static ItemBullet Bullet4570;
    public static ItemBullet Bullet4440;
    public static ItemBullet Bullet762x39;
    public static ItemBullet Bullet556x45;
    public static ItemBullet Bullet65;
    public static ItemBullet Bullet545x39;
    public static ItemBullet Bullet45ACP;
    public static ItemBullet Bullet357;
    public static ItemBullet Bullet40SW;
    public static ItemBullet Bullet44;
    public static ItemBullet Bullet50Beowulf;
    public static ItemBullet Bullet50AE;
    public static ItemBullet Bullet500;
    public static ItemBullet Bullet380ACP;
    public static ItemBullet Bullet10mm;
    public static ItemBullet Bullet763x25;
    public static ItemBullet Bullet762x35;
    public static ItemBullet Bullet765x21;
    public static ItemBullet Bullet9x39mm;
    public static ItemBullet Bullet9x19mm;
    public static ItemBullet Bullet9x18mm;
    public static ItemBullet Bullet57x28mm;
    public static ItemBullet Bullet46x30mm;
    public static ItemBullet Bullet473x33mm;
    public static ItemBullet Grenade40mm;
    public static ItemBullet RPGRocket;
    public static ItemBullet M202Rocket;

    public static void init() {
        Grenade40mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, 1F, 2.1F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2F, 2F, 2f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Grenade40mm")
                .withMaxStackSize(16)
                .withModel(new GL06Grenade(), "GL06.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", Items.GUNPOWDER)
                .build(MWC.modContext, ItemBullet.class);

        M202Rocket = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -0.8F, -0.2F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("m202rocket")
                .withMaxStackSize(4)
                .withModel(new M202Rocket(), "gun.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", MWCItems.gunmetalPlate, MWCItems.gunmetalIngot)
                .build(MWC.modContext, ItemBullet.class);

        RPGRocket = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -1F, 0.5F);
                    GL11.glRotatef(-180F, 0f, 1f, 0f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("rpg7_rocket")
                .withMaxStackSize(2)
                .withModel(new RPG7rocketPROJECTILE(), "rpg7.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", MWCItems.gunmetalPlate, MWCItems.gunmetalIngot)
                .build(MWC.modContext, ItemBullet.class);

        Bullet3006Springfield = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet3006Springfield")
                .withModel(new BulletBig(), "bulletspringfield.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet8x58 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.55F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.75F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.4F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet8x58")
                .withModel(new BulletBig(), "bullet8x58.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet792x33Kurz = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.7F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.35F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet792x33Kurz")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet50BMG = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 1.6F, 1.7f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet50BMG")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet20x82mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 1.6F, 1.7f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet20x82mm")
                .withModel(new BulletBig(), "bullet20x82.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet408CT = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet408CT")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet308Winchester = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet308Winchester")
                .withModel(new BulletBig(), "bulletspringfield.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet277 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("bullet_277")
                .withModel(new BulletBig(), "bullet277.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet792x57 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet792x57")
                .withModel(new BulletBig(), "bullet8x58.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet762x54 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet762x54")
                .withModel(new BulletBig(), "bullet762x54.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet762x51 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet762x51")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Shotgun12Guage = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Shotgun12Gauge")
                .withModel(new Shotgun12Gauge(), "Shotgun12Gauge.png")
                .build(MWC.modContext, ItemBullet.class);

        Shotgun4G = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Shotgun4G")
                .withModel(new Shotgun12Gauge(), "Shotgun4Gauge.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet762x35 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.75F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.4F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet762x35")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet765x21 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.5F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.4F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -3.7F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.2F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet765x21")
                .withModel(new BulletSmall(), "bullet765x21.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet762x39 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.55F, 0.6F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.84F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet762x39")
                .withModel(new BulletBig(), "bullet762x39.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet556x45 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.65F, 0.5F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.55F, 0.4F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.55F, 1.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet556x45")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet65 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.65F, 0.5F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.55F, 0.4F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.55F, 1.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet65")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet545x39 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.65F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.55F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.5F, 1.55F, 1.5f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet545x39")
                .withModel(new BulletBig(), "bullet545x39.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet4570 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.75F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.75F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet4570")
                .withModel(new BulletSmall(), "bullet765x21.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet4440 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet4440")
                .withModel(new BulletSmall(), "bullet765x21.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet45ACP = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet45ACP")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet357 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -2.1F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.45F, 0.85F, 0.45F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.35F, 0.75F, 0.35F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.5F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.0F, 2.8F, 2.0f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet357")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet44 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet44")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet40SW = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet40SW")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet50AE = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.8F, 3F, 2.8f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet50AE")
                .withModel(new BulletSmall(), "bullet50ae.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet50Beowulf = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet50Beowulf")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet500 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet500")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet380ACP = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet380ACP")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet763x25 = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet763x25")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet9x39mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet9x39mm")
                .withModel(new BulletSmall(), "bullet50ae.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet9x19mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet9x19mm")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet9x18mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet9x18mm")
                .withModel(new BulletSmall(), "bullet9x18.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet57x28mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.35F, 0.4F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.45F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.2F, 1.3f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet57x28mm")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet46x30mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.35F, 0.4F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -2.45F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.2F, 1.3f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet46x30mm")
                .withModel(new BulletBig(), "bulletbig.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet10mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.5F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.8F, 2.4f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet10mm")
                .withModel(new BulletSmall(), "bulletsmall.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet473x33mm = new ItemBullet.Builder()
                .withFirstPersonPositioning(() -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                .withThirdPersonPositioning(() -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                })
                .withInventoryPositioning(() -> {
                    GL11.glTranslatef(-0.8F, -4.0F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 2F, 1.7f);
                })
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withName("Bullet473x33mm")
                .withModel(new Bulletcaseless(), "bulletcaseless.png")
                .build(MWC.modContext, ItemBullet.class);
    }
}
