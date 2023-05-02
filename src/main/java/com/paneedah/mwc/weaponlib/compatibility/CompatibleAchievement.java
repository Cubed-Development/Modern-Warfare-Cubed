package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;

public enum CompatibleAchievement {
    
    KILL_ENEMY(StatList.MOB_KILLS);
    
    private StatBase achievement;

    private CompatibleAchievement(StatBase achievement) {
        this.achievement = achievement;
    }

    public StatBase getAchievement() {
        return achievement;
    }
}
