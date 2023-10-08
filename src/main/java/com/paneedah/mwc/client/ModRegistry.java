package com.paneedah.mwc.client;

import com.paneedah.mwc.ModernWarfareCubed;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = ModernWarfareCubed.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModernWarfareCubed.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModernWarfareCubed.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModernWarfareCubed.MOD_ID);
    public static ArrayList<RegistryObject<Item>> items = new ArrayList<RegistryObject<Item>>();

    // -------------------------------------------INGOTS-------------------------------------------
    public static final RegistryObject<Item> GUNMETAL_INGOT = ITEMS.register("gunmetal_alloy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_INGOT = ITEMS.register("tungsten_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSENUM_INGOT = ITEMS.register("obsenum_ingot", () -> new Item(new Item.Properties()));

    // -------------------------------------------NUGGETS-------------------------------------------
    public static final RegistryObject<Item> GUNMETAL_NUGGET = ITEMS.register("gunmetal_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_NUGGET = ITEMS.register("lead_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_NUGGET = ITEMS.register("steel_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_NUGGET = ITEMS.register("aluminum_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_NUGGET = ITEMS.register("titanium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_NUGGET = ITEMS.register("tungsten_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_NUGGET = ITEMS.register("uranium_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSENUM_NUGGET = ITEMS.register("obsenum_nugget", () -> new Item(new Item.Properties()));

    // -------------------------------------------PLATES-------------------------------------------
    public static final RegistryObject<Item> GUNMETAL_PLATE = ITEMS.register("gunmetal_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_PLATE = ITEMS.register("lead_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_PLATE = ITEMS.register("aluminum_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TITANIUM_PLATE = ITEMS.register("titanium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_PLATE = ITEMS.register("tungsten_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> URANIUM_PLATE = ITEMS.register("uranium_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSENUM_PLATE = ITEMS.register("obsenum_plate", () -> new Item(new Item.Properties()));

    // -------------------------------------------RAW-------------------------------------------
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALUMINUM = ITEMS.register("raw_aluminum", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TITANIUM = ITEMS.register("raw_titanium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TUNGSTEN = ITEMS.register("raw_tungsten", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_URANIUM = ITEMS.register("raw_uranium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_POTASSIUM = ITEMS.register("raw_potassium", () -> new Item(new Item.Properties()));

    // -------------------------------------------OTHER-------------------------------------------
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SALT_PETER = ITEMS.register("salt_peter", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRAPHITE = ITEMS.register("graphite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KEVLAR = ITEMS.register("kevlar", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LENS = ITEMS.register("lens", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYNTHETIC_PLASTIC = ITEMS.register("synthetic_plastic", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SYNTHETIC_POLYMER_COMPOSITE = ITEMS.register("synthetic_polymer_composite", () -> new Item(new Item.Properties()));

    // -------------------------------------------TOOLS-------------------------------------------
    public static final RegistryObject<Item> STIMPAK = ITEMS.register("stimpak", () -> new SyringeBase(new Item.Properties()));
    public static final RegistryObject<Item> EMPTY_SYRINGE = ITEMS.register("empty_syringe", () -> new SyringeBase(new Item.Properties()));

    // -------------------------------------------ORES-------------------------------------------
    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> NITER_ORE = registerBlock("niter_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> ALUMINUM_ORE = registerBlock("aluminum_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(4f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> GRAPHITE_ORE = registerBlock("graphite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(7f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> TITANIUM_ORE = registerBlock("titanium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(8f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));
    public static final RegistryObject<Block> URANIUM_ORE = registerBlock("uranium_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
                    .strength(5f).requiresCorrectToolForDrops(), UniformInt.of(2, 6)));

    // ---------------------------------------CreativeTabs---------------------------------------


    public static final RegistryObject<CreativeModeTab> Resources = CREATIVE_MODE_TABS.register("basetab", () -> CreativeModeTab.builder()
            // Set name of tab to display
            .title(Component.translatable("itemGroup." + ModernWarfareCubed.MOD_ID + ".basetab"))
            .withSearchBar()
            // Set icon of creative tab
            .icon(() -> new ItemStack(STEEL_INGOT.get()))
            .build()
    );


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ITEMS.register(eventBus);
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static class SyringeBase extends Item {
        public SyringeBase(Properties properties) {
            super(properties);
            properties.stacksTo(16);
        }

        @Override
        public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
            if (this == ModRegistry.STIMPAK.get()) {
                if (hand == InteractionHand.MAIN_HAND) {
                    player.heal(5);
                    player.getCooldowns().addCooldown(this, 15);
                    player.getMainHandItem().shrink(1);
                    if (!player.getInventory().add(new ItemStack(ModRegistry.EMPTY_SYRINGE.get()))) {
                        player.drop(new ItemStack(ModRegistry.EMPTY_SYRINGE.get(), 1), false);
                    }
                }
            }
            return super.use(level, player, hand);
        }
    }
}
