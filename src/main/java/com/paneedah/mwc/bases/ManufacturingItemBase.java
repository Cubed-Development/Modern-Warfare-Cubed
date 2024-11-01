package com.paneedah.mwc.bases;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.item.Item;

@Setter
@Getter
public class ManufacturingItemBase extends ItemBase {

    // Items used in the custom crafting bench!
    Item scrap;
    double recoveryChance = 0.5;

    public ManufacturingItemBase(String registryName) {
        super(registryName);
    }

    public boolean isScrapped() {
        return scrap != null;
    }

}
