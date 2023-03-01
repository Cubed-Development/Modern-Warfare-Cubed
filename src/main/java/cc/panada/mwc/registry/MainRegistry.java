package cc.panada.mwc.registry;

import cc.panada.mwc.other.*;
import cc.panada.mwc.creativetabs.ResourcesTab;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class MainRegistry {

    // Creative Tabs

    public static final CreativeTabs resourceTab = new ResourcesTab(CreativeTabs.getNextID(), "resourceTab");

    // Items

    public static final List<Item> items = new ArrayList<>();

    public static final Item COPPER_CHUNK = new ItemBase("copper_chunk", resourceTab);
    public static final Item SULFUR = new ItemBase("sulfur", resourceTab);
    public static final Item TIN = new ItemBase("tin", resourceTab);
    public static final Item GUNMETAL_INGOT = new ItemBase("gunmetal_ingot", resourceTab);
    public static final Item GUNPLATE = new ItemBase("gunplate", resourceTab);
    public static final Item SMALL_GUNPLATE = new ItemBase("small_gunplate", resourceTab);

    // Blocks

    public static final List<Block> blocks = new ArrayList<>();

    public static final Block COPPER_ORE = new BlockOreBase("copper_ore", COPPER_CHUNK, 3.0f, 5.0f, "pickaxe", 2, resourceTab);
    public static final Block SULFUR_ORE = new BlockOreBase("sulfur_ore", SULFUR, 2.0F, 5.0F, "pickaxe", 2, resourceTab);
    public static final Block TIN_ORE = new BlockOreBase("tin_ore", TIN, 2.0F, 5.0F, "pickaxe", 2, resourceTab);

    public static void preInit() {
        for (Block block : blocks) {
            ForgeRegistries.BLOCKS.register(block);

            ResourceLocation registryName = block.getRegistryName();
            ItemBlock itemBlock = new ItemBlock(block);
            itemBlock.setRegistryName(registryName);

            ForgeRegistries.ITEMS.register(itemBlock);
            ModelLoader.setCustomModelResourceLocation(itemBlock, 0, new ModelResourceLocation(registryName, "inventory"));
        }

        for (Item item : items) {
            ForgeRegistries.ITEMS.register(item);
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
        }
    }
}
