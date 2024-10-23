package com.paneedah.weaponlib.animation;

import org.lwjgl.util.vector.Matrix4f;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.function.Consumer;
import java.util.function.Function;

class ContinousPositioning2<State, Part, Context extends PartPositionProvider> implements MultipartPositioning<Part, Context> {

    private final class PositionerImpl implements Positioner<Part, Context> {

        @Override
        public void position(Part part, Context context) {

            float currentProgress = context.getProgress();
            if (currentProgress > 1f) {
                currentProgress = 1f;
            } else if (currentProgress < 0) {
                currentProgress = 0f;
            }

            float mark = totalDuration * currentProgress;
            long endOfSegment = 0;
            long startOfSegment = 0;
            int segmentIndex = -1;
            MultipartTransition<Part, Context> targetTransition = null;
            for (int i = 0; i < toPositioning.size(); i++, startOfSegment = endOfSegment) {
                MultipartTransition<Part, Context> transition = toPositioning.get(i);
                endOfSegment += transition.getDuration() + transition.getPause();
                if (mark <= endOfSegment) {
                    targetTransition = transition;
                    break;
                }
            }

            if (targetTransition == null) {
                System.err.println("Cannot determine target transition");
                return;
            }

            float activePartOfSegmentProgress = (mark - startOfSegment) / targetTransition.getDuration();

            /*
             * For a segment with pause, activePartOfSegmentProgress will be greater than 1 after pause starts,
             * so it needs to be adjusted back to 1
             */
            if (activePartOfSegmentProgress > 1f) {
            }

            Consumer<Context> positioning = targetTransition.getPositioning(part);
            //context.setProgress(activePartOfSegmentProgress);
            positioning.accept(context);
        }

        @Override
        public void randomize(float rate, float amplitude) {
            randomizer.update(0f, 0f);
        }
    }

    private class PartData {
        List<Matrix4f> matrices = new ArrayList<>();
        Part attachedTo;
    }


    private final Randomizer randomizer;

    private long totalDuration;

    private final List<MultipartTransition<Part, Context>> toPositioning;

    private final State fromState;
    private final State toState;

    ContinousPositioning2(MultipartTransitionProvider<State, Part, Context> transitionProvider,
                          Function<Context, Float> currentProgressProvider, Randomizer randomizer,
                          State fromState, State toState, boolean fromAnchored, Map<Part, Matrix4f> lastApplied) {
        this.randomizer = randomizer;
        this.fromState = fromState;
        this.toState = toState;
        toPositioning = transitionProvider.getTransitions(toState);

        for (MultipartTransition<Part, Context> t : toPositioning) {
            totalDuration += t.getDuration() + t.getPause();
        }
    }

    @Override
    public float getProgress() {
        return 0f; // or throw UnsupportedOperationException?
    }

    @Override
    public boolean isExpired(Queue<MultipartPositioning<Part, Context>> positioningQueue) {
        return positioningQueue.stream().anyMatch(p -> !(p instanceof StaticPositioning));
    }

    @Override
    public <T> T getFromState(Class<T> stateClass) {
        return stateClass.cast(fromState);
    }

    @Override
    public <T> T getToState(Class<T> stateClass) {
        return stateClass.cast(toState);
    }

    @Override
    public Positioner<Part, Context> getPositioner() {
        return new PositionerImpl();
    }
}
