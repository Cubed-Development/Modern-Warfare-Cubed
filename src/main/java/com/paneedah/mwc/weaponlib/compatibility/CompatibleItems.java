package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CompatibleItems {

    public static final CompatibleItems GUNPOWDER = new CompatibleItems(Items.GUNPOWDER) {};
    public static final CompatibleItems DYE = new CompatibleItems(Items.DYE) {};
    public static final CompatibleItems IRON_INGOT = new CompatibleItems(Items.IRON_INGOT) {};
    public static final CompatibleItems GOLD_INGOT = new CompatibleItems(Items.GOLD_INGOT) {};
    public static final CompatibleItems EMERALD = new CompatibleItems(Items.EMERALD) {};
    public static final CompatibleItems DIAMOND = new CompatibleItems(Items.DIAMOND) {};
    public static final CompatibleItems GOLD_NUGGET = new CompatibleItems(Items.GOLD_NUGGET) {};
    public static final CompatibleItems STRING = new CompatibleItems(Items.STRING) {};
    public static final CompatibleItems COAL = new CompatibleItems(Items.COAL) {};
    public static final CompatibleItems WATER_BUCKET = new CompatibleItems(Items.WATER_BUCKET) {};
    public static final CompatibleItems STICK = new CompatibleItems(Items.STICK) {};
    public static final CompatibleItems FLINT_AND_STEEL = new CompatibleItems(Items.FLINT_AND_STEEL) {};
    public static final CompatibleItems SLIME_BALL = new CompatibleItems(Items.SLIME_BALL) {};


    private Item item;

    private CompatibleItems(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
