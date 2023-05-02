package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class CompatibleSlot extends Slot {

    protected final CompatibleEntityEquipmentSlot armorType;

    public CompatibleSlot(IInventory inventoryIn, int index, int xPosition, int yPosition, CompatibleEntityEquipmentSlot armorType) {
        super(inventoryIn, index, xPosition, yPosition);
        this.armorType = armorType;
    }
}
