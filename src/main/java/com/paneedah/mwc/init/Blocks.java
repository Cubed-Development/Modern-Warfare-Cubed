package com.paneedah.mwc.init;

import com.paneedah.mwc.bases.BlockBase;
import com.paneedah.mwc.bases.OreBase;
import com.paneedah.mwc.ores.Ores;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = ModReference.id)
public class Blocks {

    public static OreBase copper_ore;
    public static OreBase tin_ore;
    public static OreBase sulfur_ore;
    public static OreBase lead_ore;
    public static OreBase graphite_ore;

    public static OreBase[] blocks;

    public static void init(){
        copper_ore = new OreBase("copper_ore");

        tin_ore = new OreBase("tin_ore");

        lead_ore = new OreBase("lead_ore");

        sulfur_ore = new OreBase("sulfur_ore");
        sulfur_ore.isSmeltable(false);
        sulfur_ore.setItemDropped(Ores.SulfurDust);
        sulfur_ore.setDropAmount(2, 5);

        graphite_ore = new OreBase("graphite_ore");
        graphite_ore.isSmeltable(false);
        graphite_ore.setItemDropped(Ores.GraphiteChunk);
        graphite_ore.setDropAmount(1, 3);

        blocks = new OreBase[]{
                copper_ore,
                tin_ore,
                sulfur_ore,
                lead_ore,
                graphite_ore
        };
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> e){
        init();
        e.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItemBlock(RegistryEvent.Register<Item> e){
        Item[] items = new Item[blocks.length];

        for (int i = 0; i < blocks.length; i++) {
            items[i] = new ItemBlock(blocks[i]);
            items[i].setRegistryName(blocks[i].getRegistryName());
        }

        e.getRegistry().registerAll(items);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent e){
        for (Block block : blocks){
            if(block instanceof BlockBase || block instanceof OreBase){
                ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
            }
        }
    }
}
