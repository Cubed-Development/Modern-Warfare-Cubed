package com.paneedah.weaponlib.animation;

import org.lwjgl.util.vector.Matrix4f;

public interface PartPositionProvider {

    public Matrix4f getPartPosition(Object part);
    
    public default void setProgress(float progress) {
    }

    public default float getProgress() {
        return 0f;
    }
}
