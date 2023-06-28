package com.paneedah.mwc.init;

import com.paneedah.mwc.bases.BlockBase;
import com.paneedah.mwc.bases.OreBase;
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

@Mod.EventBusSubscriber(modid = ModReference.ID)
public class MWCBlocks {

    public static OreBase copperOre;
    public static OreBase tinOre;
    public static OreBase sulfurOre;
    public static OreBase leadOre;
    public static OreBase graphiteOre;

    public static OreBase[] blocks;

    public static void init() {
        copperOre = new OreBase("copper_ore");

        tinOre = new OreBase("tin_ore");

        leadOre = new OreBase("lead_ore");

        sulfurOre = new OreBase("sulfur_ore");
        sulfurOre.isSmeltable(false);
        sulfurOre.setItemDropped(MWCItems.sulfurDust);
        sulfurOre.setDropAmount(2, 5);

        graphiteOre = new OreBase("graphite_ore");
        graphiteOre.isSmeltable(false);
        graphiteOre.setItemDropped(MWCItems.graphiteChunk);
        graphiteOre.setDropAmount(1, 3);

        blocks = new OreBase[]{
                copperOre,
                tinOre,
                sulfurOre,
                leadOre,
                graphiteOre
        };
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> blockRegistryEvent) {
        init();
        blockRegistryEvent.getRegistry().registerAll(blocks);
    }

    @SubscribeEvent
    public static void registerItemBlock(RegistryEvent.Register<Item> itemRegistryEvent) {
        Item[] items = new Item[blocks.length];

        for (int i = 0; i < blocks.length; i++) {
            items[i] = new ItemBlock(blocks[i]);
            items[i].setRegistryName(blocks[i].getRegistryName());
        }

        itemRegistryEvent.getRegistry().registerAll(items);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent modelRegistryEvent) {
        for (Block block : blocks){
            if(block instanceof BlockBase || block instanceof OreBase) ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
        }
    }
}
