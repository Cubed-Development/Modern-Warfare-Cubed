package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Guns;
import com.paneedah.weaponlib.compatibility.CompatibleMaterial;
import com.paneedah.weaponlib.tile.CustomTileEntityBlock;
import com.paneedah.weaponlib.tile.LootBoxConfiguration;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.EnumDifficulty;
import org.lwjgl.opengl.GL11;

public class TileEntities {

    public static void init(CommonProxy commonProxy) {
    	new TurretBaseFactory().createTileEntity(ModernWarfareMod.MOD_CONTEXT);

//        new LootBoxConfiguration()
//        .withMaterial(CompatibleMaterial.ROCK)
//        .withName("turret_base")
//        .withModelClassName("com.paneedah.mwc.models.TurretBase")
//        .withTextureName("textures/models/turretbase.png")
////        .withEquipementDispenseSound(sound)
//        .withCreativeTab(ModernWarfareMod.PropsTab)
//        .withBoundingBox(0.0, 0, 0.0, 1, 0.2, 1)
//        .withPositioning(tileEntity -> {
////            GL11.glScalef(0.5f, 0.5f, 0.5f);
//            GL11.glTranslatef(0.5f, 0f, 0.5f);
////            GL11.glRotatef(-45F, 0f, 1f, 0f);
//        })
////        .withEquipmentOption(Guns.M9A1, EnumDifficulty.EASY, 4f)
////        .withEquipmentOption(Guns.M45A1, EnumDifficulty.EASY, 3f)
////        .withEquipmentOption(Items.air, EnumDifficulty.EASY, 150f, 1)
////        .withEquipmentDispenseTimeout(10)
//        .build(ModernWarfareMod.MOD_CONTEXT);
        }
}
