package com.paneedah.weaponlib.animation;

import org.lwjgl.util.vector.Matrix4f;

public interface PartPositionProvider {

    Matrix4f getPartPosition(Object part);

    default void setProgress(float progress) {
    }

    default float getProgress() {
        return 0f;
    }
}
