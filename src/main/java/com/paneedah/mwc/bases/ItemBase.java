package com.paneedah.mwc.bases;

import com.paneedah.mwc.MWC;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.item.Item;

import java.util.Arrays;

public class ItemBase extends Item {

    @Setter
    int stackSize = 64;
    @Getter
    String[] oreDictKeys;

    public ItemBase(String registryName) {
        setRegistryName(registryName);
        setTranslationKey(registryName);

        setMaxStackSize(stackSize);
        // Might want to change that?
        setCreativeTab(MWC.BLOCKS_AND_INGOTS_TAB);
    }

    /*
     *  OreDictionary Keys (compatibility)
     *  https://MCreator.net/wiki/ore-dictionary-names-list for commonly used OreDict names
     *  Don't hesitate to use this :D
     */
    public void setOreDict(String[] oreDictKeys) {
        this.oreDictKeys = oreDictKeys;
    }

    public void setOreDict(String oreDictKey) {
        oreDictKeys = new String[]{oreDictKey};
    }

    public void addOreDictKey(String oreDictKey) {
        // Creating a new array with a larger size to add the new key.
        String[] newArray = Arrays.copyOf(oreDictKeys, oreDictKeys.length + 1);
        newArray[newArray.length - 1] = oreDictKey;
        oreDictKeys = newArray;
    }

}
