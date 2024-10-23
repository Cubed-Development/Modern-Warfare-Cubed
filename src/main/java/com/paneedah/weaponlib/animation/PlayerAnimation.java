package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.animation.ScreenShakingAnimationManager.State;
import net.minecraft.entity.player.EntityPlayer;

public interface PlayerAnimation {

    /**
     * Returns true if the animation cycle is in progress, otherwise false
     *
     */
    void update(EntityPlayer player, boolean fadeOut);

    void reset(EntityPlayer player, boolean force);

    boolean isCompleted();

    PlayerAnimation NO_ANIMATION = new PlayerAnimation() {

        @Override
        public void update(EntityPlayer player, boolean fadeOut) {

        }

        @Override
        public void reset(EntityPlayer player, boolean force) {
        }

        @Override
        public boolean isCompleted() {
            return true;
        }

        @Override
        public State getState() {
            return State.DEFAULT;
        }
    };

    State getState();

}
