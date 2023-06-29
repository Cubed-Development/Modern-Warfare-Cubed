package com.paneedah.mwc.bases;

import com.paneedah.mwc.MWC;
import net.minecraft.item.Item;

import java.util.Arrays;

public class ItemBase extends Item {

    int stackSize = 64;
    String[] oreDictKeys;

    public ItemBase(String registryName) {
        setRegistryName(registryName);
        setTranslationKey(registryName);

        setMaxStackSize(stackSize);
        // Might want to change that?
        setCreativeTab(MWC.BLOCKS_TAB);
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    /*
    *  OreDictionary Keys (compatibility)
    *  https://mcreator.net/wiki/ore-dictionary-names-list for commonly used OreDict names
    *  Don't hesitate to use this :D
    */
    public void setOreDict(String[] oreDictKeys) {
        this.oreDictKeys = oreDictKeys;
    }

    public void setOreDict(String oreDictKey) {
        this.oreDictKeys = new String[]{oreDictKey};
    }

    public void addOreDictKey(String oreDictKey) {
        // Creating a new array with a larger size to add the new key.
        String[] newArray = Arrays.copyOf(this.oreDictKeys, this.oreDictKeys.length + 1);
        newArray[newArray.length - 1] = oreDictKey;
        this.oreDictKeys = newArray;
    }

    public String[] getOreDictKeys() {
        return oreDictKeys;
    }
}
