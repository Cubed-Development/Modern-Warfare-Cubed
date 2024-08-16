package com.paneedah.weaponlib.animation;

import java.util.Queue;

public interface MultipartPositioning<Part, Context> {

    interface Positioner<Part, Context> {
        void position(Part part, Context context);

        default void randomize(float rate, float amplitude) {}

    }

    <T> T getFromState(Class<T> stateClass);

    <T> T getToState(Class<T> stateClass);

    boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue);

    Positioner<Part, Context> getPositioner(); // TODO: add partial ticks parameter or maybe a context?

    float getProgress(); // TODO: add partial ticks parameter or maybe a context?


}
