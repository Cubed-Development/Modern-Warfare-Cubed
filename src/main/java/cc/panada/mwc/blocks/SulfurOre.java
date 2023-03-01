package cc.panada.mwc.blocks;

import cc.panada.mwc.main.MainRegistry;
import net.minecraft.block.BlockOre;

public class SulfurOre extends BlockOre {

    public SulfurOre() {
        setHardness(3.0F);
        setResistance(5.0F);

        setRegistryName("sulfur_ore");
        setTranslationKey("sulfur_ore");

        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MainRegistry.resourceTab);

        MainRegistry.blocks.add(this);
    }
}
