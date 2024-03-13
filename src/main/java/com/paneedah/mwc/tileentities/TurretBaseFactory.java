package com.paneedah.mwc.tileentities;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.weapons.TurretBase;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.tile.CustomTileEntityConfiguration;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.opengl.GL11;

public class TurretBaseFactory implements TileEntityFactory {

    @Override
    public void createTileEntity(ModContext modContext) {
    	new CustomTileEntityConfiguration()
        .withMaterial(Material.ROCK)
        .withName("turret_base")
        .withModel(new TurretBase(), "textures/models/turretbase")
        .withCreativeTab(MWC.BLOCKS_AND_INGOTS_TAB)
        .withBoundingBox(0, 0, 0, 1, 1, 1)
        .withPositioning(tileEntity -> {
//            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.5f, 0f, 0.5f);
//            GL11.glRotatef(-45F, 0f, 1f, 0f);
        })
        .notAProp()
        .build(MWC.modContext);
    }

    @SubscribeEvent
    public void lootLoad(LootTableLoadEvent evt) {
    }

}
