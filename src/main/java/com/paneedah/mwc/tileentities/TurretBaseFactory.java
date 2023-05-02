package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMaterial;
import com.paneedah.weaponlib.tile.LootBoxConfiguration;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class TurretBaseFactory implements TileEntityFactory {

    @Override
    public void createTileEntity(ModContext modContext) {
//    	new LootBoxConfiguration()
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
    
    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent evt) {
        //if (evt.getName().toString().equals("minecraft:chests/simple_dungeon")) {
        //    // do stuff with evt.getTable()
        //}
    }

}
