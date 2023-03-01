package cc.panada.mwc.main;

import cc.panada.mwc.blocks.CopperOre;
import cc.panada.mwc.blocks.SulfurOre;
import cc.panada.mwc.blocks.TinOre;
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

    // Blocks

    public static final List<Block> blocks = new ArrayList<>();

    public static final Block COPPER_ORE = new CopperOre();
    public static final Block SULFUR_ORE = new SulfurOre();
    public static final Block TIN_ORE = new TinOre();

    // Items

    public static final List<Item> items = new ArrayList<>();

    public static final Item COPPER_CHUNK = initItem("copper_chunk", resourceTab);
    public static final Item GUNMETAL_INGOT = initItem("gunmetal_ingot", resourceTab);
    public static final Item GUNPLATE = initItem("gunplate", resourceTab);
    public static final Item SMALL_GUNPLATE = initItem("small_gunplate", resourceTab);

    public static Item initItem(String name, CreativeTabs tab) {
        Item item = new Item().setRegistryName(name).setTranslationKey(name).setCreativeTab(tab);
        items.add(item);
        return item;
    }

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
