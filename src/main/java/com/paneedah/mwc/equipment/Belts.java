package com.paneedah.mwc.equipment;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.weaponlib.ItemMagazine;
import net.minecraft.item.Item;

public class Belts {

    public static Item magazineBelt;

    public static void init() {

        magazineBelt = new ItemBackpack.Builder()
                .withName("magazine_belt")
                .withSize(8)
                .withValidItemPredicate(ItemMagazine.class::isInstance)
                .withModel("equipments.belts.MagazineBelt")
                .withTexture("equipments/belts")
                .build();
    }
}
