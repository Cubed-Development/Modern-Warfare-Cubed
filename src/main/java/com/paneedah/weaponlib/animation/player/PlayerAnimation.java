package com.paneedah.weaponlib.animation.player;

import com.paneedah.weaponlib.animation.player.screenshake.ScreenShakingAnimationManager.State;
import net.minecraft.entity.player.EntityPlayer;

public interface PlayerAnimation {

    void update(final EntityPlayer player, final boolean fadeOut);

    void reset(final EntityPlayer player, final boolean force);

    boolean isCompleted();

    State getState();

    PlayerAnimation NO_ANIMATION = new PlayerAnimation() {

        @Override
        public void update(final EntityPlayer player, final boolean fadeOut) {

        }

        @Override
        public void reset(final EntityPlayer player, final boolean force) {
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
}
