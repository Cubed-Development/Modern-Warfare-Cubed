package com.paneedah.weaponlib.vehicle;

public class SimpleAnimationTimer {

    private int time = 0, maxTime;
    private boolean isDone = false;
    private boolean shouldLoop;

    public SimpleAnimationTimer(int maxTime, boolean loop) {
        this.maxTime = maxTime;
        shouldLoop = loop;
    }

    public void setMaxTime(int max) {
    }

    public void setLoop(boolean shouldLoop) {
        this.shouldLoop = shouldLoop;
    }

    public void tick() {
        if (shouldLoop) {
            if (isDone) {
                reset();
            }
        } else {
            if (isDone) {
                return;
            }
        }
        time += 1;
        if (time >= maxTime) {
            isDone = true;
            time = maxTime;
        }
    }

    public boolean isComplete() {
        return isDone;
    }

    public void reset() {
        isDone = false;
        time = 0;
    }

    public double getLinearProgress() {
        return time / (double) maxTime;
    }

    public double getSmoothStepProgress() {
        return (float) ((1 - Math.cos(getLinearProgress() * Math.PI)) / 2f);
    }

    public double smoothInterpDouble(double start, double end) {
        return start + (end - start) * getSmoothStepProgress();
    }

}
