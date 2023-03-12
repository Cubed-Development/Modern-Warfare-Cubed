package com.paneedah.mwc.bases;

import net.minecraft.item.Item;

public class ManufacturingItemBase extends ItemBase {

    // Items used in the custom crafting bench!
    Item scrap;
    double recoveryChance = 0.5;

    public ManufacturingItemBase(String registryName){
        super(registryName);
    }

    public void setRecoveryChance(double recoveryChance) {
        this.recoveryChance = recoveryChance;
    }

    public void setScrap(Item scrap) {
        this.scrap = scrap;
    }

    public boolean isScrapped(){
        return this.scrap != null;
    }

    public Item getScrap(){
        return this.scrap;
    }

    public double getRecoveryChance(){
        return this.recoveryChance;
    }
}
