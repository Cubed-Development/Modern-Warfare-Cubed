package com.paneedah.weaponlib.animation;

import java.util.Queue;

public interface MultipartPositioning<Part, Context> {

    public interface Positioner<Part, Context> {
        public void position(Part part, Context context);

        public default void randomize(float rate, float amplitude) {}

        ;

    }

    public <T> T getFromState(Class<T> stateClass);

    public <T> T getToState(Class<T> stateClass);

    public boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue);

    public Positioner<Part, Context> getPositioner(); // TODO: add partial ticks parameter or maybe a context?

    public float getProgress(); // TODO: add partial ticks parameter or maybe a context?


}
