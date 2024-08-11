package com.paneedah.weaponlib.animation;

import org.lwjgl.util.vector.Matrix4f;

import java.util.List;
import java.util.Map;
import java.util.Queue;

class StaticPositioning<State, Part, Context extends PartPositionProvider> implements MultipartPositioning<Part, Context> {

    private State state;
    private Randomizer randomizer;
    private MultipartTransitionProvider<State, Part, Context> transitionProvider;
    private Map<Part, Matrix4f> lastApplied;

    public StaticPositioning(MultipartTransitionProvider<State, Part, Context> transitionProvider,
                             Randomizer randomizer, State state, Map<Part, Matrix4f> lastApplied) {
        this.transitionProvider = transitionProvider;
        this.randomizer = randomizer;
        this.state = state;
        this.lastApplied = lastApplied;
    }


    @Override
    public float getProgress() {
        return 1f;
    }

    @Override
    public boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue) {
        return !positioningQueue.isEmpty();
    }

    @Override
    public Positioner<Part, Context> getPositioner() {
        List<MultipartTransition<Part, Context>> transitions = transitionProvider.getTransitions(state);
        return new Positioner<Part, Context>() {

            @Override
            public void position(Part part, Context context) {
                try {
                    MultipartTransition<Part, Context> multipartTransition = transitions.get(transitions.size() - 1);
                    Part attachedTo = multipartTransition.getAttachedTo(part);
                    if (attachedTo != null) {
                        MatrixHelper.loadMatrix(context.getPartPosition(attachedTo));
                    }
                    if (multipartTransition.getPositioning(part) == (Object) MultipartTransition.anchoredPosition()) {
                        Matrix4f m = lastApplied.get(part);
                        MatrixHelper.applyMatrix(m);
                    } else {
                        multipartTransition.position(part, context);
                    }

                } catch (Exception e) {
                    System.err.println("Failed to find static position for " + part + " in " + state);
                    throw e;
                }
            }


            @Override
            public void randomize(float rate, float amplitude) {
                randomizer.update(rate, amplitude);
            }
        };
    }

    @Override
    public <T> T getFromState(Class<T> stateClass) {
        return stateClass.cast(state);
    }

    @Override
    public <T> T getToState(Class<T> stateClass) {
        return stateClass.cast(state);
    }
}
