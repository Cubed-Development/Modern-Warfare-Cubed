package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.items.equipment.ItemCarryableStorage;
import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.animation.Transform;
import net.minecraft.item.Item;

public class Belts {

    public static Item MagazineBelt;

    public static void init() {

        MagazineBelt = new ItemCarryableStorage.Builder()
                .withName("magazine_belt")
                .withSize(8)
                .withValidItemPredicate(item -> item instanceof ItemMagazine)
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.equipment.belts.MagazineBelt", "belts.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -5.1, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.1, 3.1, 3.1)
                        .doGLDirect())
                .build(MWC.modContext);
    }
}
