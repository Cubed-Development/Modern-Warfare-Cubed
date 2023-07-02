package com.paneedah.mwc.wearables;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class Bullets {

    public static ItemBullet Bullet20x82mm;
    public static ItemBullet Bullet50BMG;
    public static ItemBullet Bullet408CT;
    public static ItemBullet Bullet308Winchester;
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
    public static ItemBullet EnergyCase;
    public static ItemBullet PlasmaCapsule;

    public static void init(Object mod) {
        Grenade40mm = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("Grenade40mm").withMaxStackSize(16)
                .withModel(new com.paneedah.mwc.models.GL06Grenade(), "GL06.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", Items.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, 1F, 2.1F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2F, 2F, 2f);
                }).withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        M202Rocket = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("m202rocket").withMaxStackSize(16)
                .withModel(new com.paneedah.mwc.models.M202Rocket(), "gun.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", MWCItems.gunmetalPlate, MWCItems.gunmetalIngot)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.8F, -0.2F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                }).withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        RPGRocket = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("rpg7_rocket").withMaxStackSize(16)
                .withModel(new com.paneedah.mwc.models.RPG7rocketPROJECTILE(), "rpg7.png")
                .withCrafting(8, CraftingComplexity.MEDIUM, "ingotCopper", MWCItems.gunmetalPlate, MWCItems.gunmetalIngot)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1.2F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.9F, -0.29F, 0.8F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0F, 0F, 0F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -1F, 0.5F);
                    GL11.glRotatef(-180F, 0f, 1f, 0f);
                    GL11.glRotatef(-90F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.4F, 0.4F, 0.4f);
                }).withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        EnergyCase = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("EnergyCase")
                .withModel(new com.paneedah.mwc.models.EnergyCase(), "gun.png")
                .withMaxStackSize(64)
                .withCrafting(8, CraftingComplexity.LOW, "ingotCopper", Items.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -1.1F, 0.6F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(20F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(MWC.modContext, ItemBullet.class);
        
        PlasmaCapsule = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("PlasmaCapsule")
                .withModel(new com.paneedah.mwc.models.ChainsawFuel(), "PlasmaCapsule.png")
                .withMaxStackSize(64)
                //.withCrafting(8, CraftingComplexity.LOW, "ingotCopper", CompatibleItems.GUNPOWDER)
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -0.3F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.3F, 0.5F, 0.1F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(0.3F, 0.5F, -0F);
                    GL11.glRotatef(-150F, 0f, 1f, 0f);
                    GL11.glRotatef(-6F, 1f, 0f, 0f);
                    GL11.glRotatef(-15F, 0f, 0f, 1f);
                    GL11.glScaled(1F, 1F, 1f);
                })
                .withTextureName("Dummy.png").build(MWC.modContext, ItemBullet.class);
        
        Bullet3006Springfield = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet3006Springfield")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletspringfield.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet8x58 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet8x58")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bullet8x58.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.55F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.75F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.4F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet792x33Kurz = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet792x33Kurz")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.7F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.35F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet50BMG = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet50BMG")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 1.6F, 1.7f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet20x82mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet20x82mm")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bullet20x82.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.7F, 0.6F, 0.7F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 1.6F, 1.7f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet408CT = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet408CT")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet308Winchester = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet308Winchester")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletspringfield.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet792x57 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet792x57")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bullet8x58.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet762x54 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet762x54")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bullet762x54.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet762x51 = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet762x51")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.6F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Shotgun12Guage = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("Shotgun12Gauge")
                .withModel(new com.paneedah.mwc.models.Shotgun12Gauge(), "Shotgun12Gauge.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(MWC.modContext, ItemBullet.class);
        
        Shotgun4G = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB).withName("Shotgun4G")
                .withModel(new com.paneedah.mwc.models.Shotgun12Gauge(), "Shotgun4Gauge.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.1F, -1F, 0.4F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.7F, -0.29F, 0.7F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -0.45F, 0.4F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.4F, 1.4f);
                }).withTextureName("Dummy.png").build(MWC.modContext, ItemBullet.class);
        
        Bullet762x35 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet762x35")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.5F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.4F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.75F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.4F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet765x21 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet765x21")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bullet765x21.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.5F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.4F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -3.7F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.2F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet762x39 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet762x39")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bullet762x39.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.6F, 0.55F, 0.6F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.84F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.6F, 1.5F, 1.6f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);

        Bullet556x45 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet556x45")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.65F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.55F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.55F, 1.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet65 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet65")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.65F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.55F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.4F, 1.55F, 1.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet545x39 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet545x39")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bullet545x39.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.65F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.55F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.9F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.5F, 1.55F, 1.5f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet4570 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet4570")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bullet765x21.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.75F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.75F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet4440 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet4440")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bullet765x21.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
    
        Bullet45ACP = new ItemBullet.Builder()
        	
            .withCreativeTab(MWC.AMMO_TAB)
            .withName("Bullet45ACP")
            .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
            .withFirstPersonPositioning((player, itemStack) -> {
                GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                GL11.glRotatef(30F, 0f, 1f, 0f);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
            }).withThirdPersonPositioning((player, itemStack) -> {
                GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                GL11.glRotatef(-50F, 0f, 1f, 0f);
                GL11.glRotatef(80F, 1f, 0f, 0f);
                GL11.glScaled(0.45F, 0.45F, 0.45F);
            }).withInventoryPositioning((itemStack) -> {
                GL11.glTranslatef(-0.8F, -4F, 0.7F);
                GL11.glRotatef(10F, 0f, 1f, 0f);
                GL11.glRotatef(2F, 1f, 0f, 0f);
                GL11.glRotatef(0F, 0f, 0f, 1f);
                GL11.glScaled(2.4F, 2.4F, 2.4f);
            })
            .withTextureName("Dummy.png")
            .build(MWC.modContext, ItemBullet.class);
        
        Bullet357 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet357")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -2.1F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.45F, 0.85F, 0.45F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.35F, 0.75F, 0.35F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.5F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.0F, 2.8F, 2.0f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet44 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet44")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet40SW = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet40SW")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet50AE = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet50AE")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bullet50ae.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.8F, 3F, 2.8f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet50Beowulf = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet50Beowulf")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet500 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet500")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.8F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 3F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet380ACP = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet380ACP")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet763x25 = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet763x25")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                }).withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet9x39mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet9x39mm")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bullet50ae.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet9x19mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet9x19mm")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet9x18mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet9x18mm")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bullet9x18.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.4F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet57x28mm = new ItemBullet.Builder()
                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet57x28mm")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.35F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.45F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.2F, 1.3f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet46x30mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet46x30mm")
                .withModel(new com.paneedah.mwc.models.BulletBig(), "bulletbig.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.5F, 0.45F, 0.5F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.4F, 0.35F, 0.4F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -2.45F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.3F, 1.2F, 1.3f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet10mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet10mm")
                .withModel(new com.paneedah.mwc.models.BulletSmall(), "bulletsmall.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.5F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(2.4F, 2.8F, 2.4f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
        
        Bullet473x33mm = new ItemBullet.Builder()

                .withCreativeTab(MWC.AMMO_TAB)
                .withName("Bullet473x33mm")
                .withModel(new com.paneedah.mwc.models.Bulletcaseless(), "bulletcaseless.png")
                .withFirstPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(0.2F, -1.9F, 0.5F);
                    GL11.glRotatef(30F, 0f, 1f, 0f);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }).withThirdPersonPositioning((player, itemStack) -> {
                    GL11.glTranslatef(-0.2F, -0.3F, 0.4F);
                    GL11.glRotatef(-50F, 0f, 1f, 0f);
                    GL11.glRotatef(80F, 1f, 0f, 0f);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }).withInventoryPositioning((itemStack) -> {
                    GL11.glTranslatef(-0.8F, -4.0F, 0.7F);
                    GL11.glRotatef(10F, 0f, 1f, 0f);
                    GL11.glRotatef(2F, 1f, 0f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(1.7F, 2F, 1.7f);
                })
                .withTextureName("Dummy.png")
                .build(MWC.modContext, ItemBullet.class);
    }

}
