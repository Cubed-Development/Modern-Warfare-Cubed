package cc.panada.mwc.registry;

import cc.panada.mwc.other.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class MainRegistry {

    // Creative Tabs

    public static final CreativeTabs resourceTab = new CreativeTabs(CreativeTabs.getNextID(), "resourceTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(MainRegistry.GUNMETAL_INGOT);
        }
    };
    
    
    public static final CreativeTabs otherTab = new CreativeTabs(CreativeTabs.getNextID(), "otherTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(MainRegistry.WORKBENCH);
        }
    };

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
    public static final Block WORKBENCH = new BlockBase("workbench", Material.IRON, 3.0f, 5.0f, "pickaxe", 1, MainRegistry.otherTab, false, false, new AxisAlignedBB(-0.45D, 0, 0, 1.55D, 1D, 1D), new AxisAlignedBB(0, 0, -0.45D, 1D, 1D, 1.55D),true);
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