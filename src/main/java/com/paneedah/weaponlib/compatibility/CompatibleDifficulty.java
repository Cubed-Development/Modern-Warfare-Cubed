package com.paneedah.weaponlib.compatibility;

import net.minecraft.world.DifficultyInstance;

public class CompatibleDifficulty {
    
    private DifficultyInstance difficulty;

    public CompatibleDifficulty(DifficultyInstance difficulty) {
        this.difficulty = difficulty;
    }
    
    public DifficultyInstance getDifficulty() {
        return difficulty;
    }

    public float getClampedAdditionalDifficulty() {
        return difficulty.getClampedAdditionalDifficulty();
    }

}
