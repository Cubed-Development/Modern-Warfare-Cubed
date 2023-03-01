package cc.panada.mwc.items;

import cc.panada.mwc.main.MainRegistry;
import net.minecraft.item.Item;

public class CopperChunk extends Item {

    public CopperChunk() {
        setRegistryName("copper_chunk");
        setTranslationKey("copper_chunk");

        setCreativeTab(MainRegistry.resourceTab);

        MainRegistry.items.add(this);
    }
}
