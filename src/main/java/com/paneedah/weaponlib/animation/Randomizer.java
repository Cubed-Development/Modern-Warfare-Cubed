package com.paneedah.weaponlib.animation;

import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.vector.Matrix4f;

import java.nio.FloatBuffer;
import java.util.Random;

public final class Randomizer {

    private final Random random = new Random();

    private Matrix4f beforeMatrix;
    private Matrix4f afterMatrix;
    private Matrix4f currentMatrix;
    private long startTime;
    private float rate = 0.25f;
    private float amplitude = 0.04f;

    // Valid bias range: from
    private final float xbias = 0f;
    private final float ybias = 0f;
    private final float zbias = 0f;

    public Randomizer() {
        this.currentMatrix = getMatrixForPositioning(() -> {});
        next();
    }

    private boolean reconfigure(float rate, float amplitude) {
        if (rate == this.rate && amplitude == this.amplitude) {
            return false;
        }

        boolean reconfigured = false;
        if (rate != this.rate || amplitude != this.amplitude) {
            if (rate == 0f && amplitude == 0f) {
                // Stop
                afterMatrix = beforeMatrix = currentMatrix = getMatrixForPositioning(() -> {});
            } else {
                reconfigured = true;
            }
        }

        this.rate = rate;
        this.amplitude = amplitude;

        if (reconfigured) {
            next();
        }

        return reconfigured;
    }

    private void next() {
        beforeMatrix = currentMatrix;
        afterMatrix = createRandomMatrix();
        startTime = System.currentTimeMillis();
    }

    private Matrix4f createRandomMatrix() {
        Runnable c = () -> {

            float maxAngle = 5f;
            float xRotation = maxAngle * amplitude * ((random.nextFloat() - 0.5f) * 2 + xbias);
            float yRotation = maxAngle * amplitude * ((random.nextFloat() - 0.5f) * 2 + ybias);
            float zRotation = maxAngle * amplitude * ((random.nextFloat() - 0.5f) * 2 + zbias) * 3;

            GL11.glRotatef(xRotation, 1f, 0f, 0f);
            GL11.glRotatef(yRotation, 0f, 1f, 0f);
            GL11.glRotatef(zRotation, 0f, 0f, 1f);

            float xRandomOffset = amplitude * ((random.nextFloat() - 0.5f) * 2 + xbias);
            float yRandomOffset = amplitude * ((random.nextFloat() - 0.5f) * 2 + ybias);
            float zRandomOffset = amplitude * ((random.nextFloat() - 0.5f) * 2 + zbias) / 3;
            GL11.glTranslatef(xRandomOffset, yRandomOffset, zRandomOffset);

        };
        return getMatrixForPositioning(c);
    }

    private Matrix4f getMatrixForPositioning(Runnable position) {
        GL11.glPushMatrix();
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glLoadIdentity();
        FloatBuffer buf = BufferUtils.createFloatBuffer(16);
        position.run();
        GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, buf);
        buf.rewind();
        Matrix4f matrix = new Matrix4f();
        matrix.load(buf);
        GL11.glPopMatrix();
        return matrix;
    }

    public Matrix4f update(float rate, float amplitude) {

        if (AnimationModeProcessor.getInstance().getFPSMode()) {
            return new Matrix4f();
        }

        reconfigure(rate, amplitude);

        if (rate == 0f || amplitude == 0f) {
            return null;
        }

        long currentTime = System.currentTimeMillis();

        // long interval = (long) (1000f / rate);
        // E.g: current time 10, start time 0, rate 25 ( 1 iteration per 40ms), progress = (10 - 0) * 25 / 1000 = 0.25
        float progress = (currentTime - startTime) * rate / 1000;

        if (progress >= 1) {
            next();
            progress = 0f;
        }

        /*
         *
         * progress = (endTime - startTime) / duration
         *
         * current = start + (end - start) * progress = start * (1 - progress)  + end * progress;
         */

        //float progress = (float)(System.currentTimeMillis() - startTime) / (float)duration;
        Matrix4f currentTransformMatrix = MatrixHelper.captureMatrix();

        Matrix4f m1 = MatrixHelper.interpolateMatrix(beforeMatrix, 1 - progress, Interpolation.SMOOTHSTEP); //start * (1 - progress)
        Matrix4f m2 = MatrixHelper.interpolateMatrix(afterMatrix, progress, Interpolation.SMOOTHSTEP);

        currentMatrix = Matrix4f.add(m1, m2, null);

        Matrix4f composite = Matrix4f.mul(currentTransformMatrix, currentMatrix, null);

        MatrixHelper.loadMatrix(composite);

        return currentMatrix;
    }
}
