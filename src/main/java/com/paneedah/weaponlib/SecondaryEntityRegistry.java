package com.paneedah.weaponlib;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;

import java.util.HashMap;

public class SecondaryEntityRegistry {

    public static HashMap<String, Class<? extends Entity>> map = new HashMap<>();
    public static HashMap<Integer, Item> pickupMap = new HashMap<>();

}
