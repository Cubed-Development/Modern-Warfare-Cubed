package cc.panada.mwc.blocks;

import cc.panada.mwc.main.MainRegistry;
import net.minecraft.block.BlockOre;

public class TinOre extends BlockOre {

    public TinOre() {
        setHardness(3.0F);
        setResistance(5.0F);

        setRegistryName("tin_ore");
        setTranslationKey("tin_ore");

        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MainRegistry.resourceTab);

        MainRegistry.blocks.add(this);
    }
}
