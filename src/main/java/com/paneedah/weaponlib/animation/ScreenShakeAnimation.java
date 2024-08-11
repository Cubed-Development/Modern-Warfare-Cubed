package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.animation.ScreenShakingAnimationManager.State;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.MathHelper;
import org.lwjgl.opengl.GL11;

public class ScreenShakeAnimation implements PlayerAnimation {

    static class CirclePointGenerator {

        private float startingRadius;
        private float nextRadius;
        private float alpha;
        private float nextAngle;
        private float attenuation;
        private float cumulativeAttenuation = 1f;

        public CirclePointGenerator(float radius, float startAngle, float alpha, float attenuation) {
            this.startingRadius = radius;
            this.nextRadius = radius;
            this.alpha = alpha;
            this.nextAngle = startAngle;
            this.attenuation = attenuation;
        }

        public float[] next() {
            float currentX = nextRadius * MathHelper.cos(nextAngle);
            float currentY = nextRadius * MathHelper.sin(nextAngle);
            float currentRadius = nextRadius;

            nextAngle += 2 * Math.PI - 2 * alpha;
            nextAngle %= 2 * Math.PI;

            nextRadius *= attenuation;
            cumulativeAttenuation *= attenuation;
            return new float[]{currentRadius, currentX, currentY};
        }

        public void reset() {
            nextRadius = startingRadius;
            cumulativeAttenuation = 1f;
        }
    }

    private float startRotateX = 0f;
    private float startRotateY = 0f;
    private float startRotateZ = 0f;

    private float targetRotateX = 0f;
    private float targetRotateY = 0f;
    private float targetRotateZ = 0f;

    private float startX = 0f;
    private float startY = 0f;
    private float startZ = 0f;

    private float targetX = 0f;
    private float targetY = 0f;
    private float targetZ = 0f;

    private float xTranslateCoefficient = 0.05f;
    private float yTranslateCoefficient = 0.05f;
    private float zTranslateCoefficient = 0.1f;

    private float xRotationCoefficient = 0.01f;
    private float yRotationCoefficient = 0.01f;
    private float zRotationCoefficient = 0.5f;

    private float rotationAttenuation = 0.5f;// = ATTENUATION_COEFFICIENT;

    private long transitionDuration = 2000;

    private long startTime;

    private ScreenShakingAnimationManager.State state;

    private CirclePointGenerator circlePointGenerator;

    private float totalAdjustment;

    private float cumulativeAttenuation = 1f;

    private boolean initialized;

    public static class Builder {

        private float rotationAttenuation = 0.5f;
        private float translationAttenuation = 0.5f;
        private long transitionDuration = 2000;
        private float xTranslateCoefficient = 0.05f;
        private float yTranslateCoefficient = 0.05f;
        private float zTranslateCoefficient = 0.1f;

        private float xRotationCoefficient = 0.01f;
        private float yRotationCoefficient = 0.01f;
        private float zRotationCoefficient = 0.5f;

        private ScreenShakingAnimationManager.State state;

        public Builder withRotationAttenuation(float rotationAttenuation) {
            this.rotationAttenuation = rotationAttenuation;
            return this;
        }

        public Builder withTranslationAttenuation(float translationAttenuation) {
            this.translationAttenuation = translationAttenuation;
            return this;
        }

        public Builder withTransitionDuration(long transitionDuration) {
            this.transitionDuration = transitionDuration;
            return this;
        }

        public Builder withXTranslateCoefficient(float xTranslateCoefficient) {
            this.xTranslateCoefficient = xTranslateCoefficient;
            return this;
        }

        public Builder withYTranslateCoefficient(float yTranslateCoefficient) {
            this.yTranslateCoefficient = yTranslateCoefficient;
            return this;
        }

        public Builder withZTranslateCoefficient(float zTranslateCoefficient) {
            this.zTranslateCoefficient = zTranslateCoefficient;
            return this;
        }

        public Builder withXRotationCoefficient(float xRotationCoefficient) {
            this.xRotationCoefficient = xRotationCoefficient;
            return this;
        }

        public Builder withYRotationCoefficient(float yRotationCoefficient) {
            this.yRotationCoefficient = yRotationCoefficient;
            return this;
        }

        public Builder withZRotationCoefficient(float zRotationCoefficient) {
            this.zRotationCoefficient = zRotationCoefficient;
            return this;
        }

        public Builder withState(ScreenShakingAnimationManager.State state) {
            this.state = state;
            return this;
        }

        public Builder withState(RenderableState state) {
            this.state = ScreenShakingAnimationManager.toManagedState(state);
            return this;
        }

        PlayerAnimation build() {
            if (state == null) {
                throw new IllegalStateException("State is not set");
            }

            ScreenShakeAnimation animation = new ScreenShakeAnimation(state);
            animation.rotationAttenuation = rotationAttenuation;
            animation.xTranslateCoefficient = xTranslateCoefficient;
            animation.yTranslateCoefficient = yTranslateCoefficient;
            animation.zTranslateCoefficient = zTranslateCoefficient;
            animation.xRotationCoefficient = xRotationCoefficient;
            animation.yRotationCoefficient = yRotationCoefficient;
            animation.zRotationCoefficient = zRotationCoefficient;
            animation.transitionDuration = transitionDuration;
            animation.state = state;
            animation.circlePointGenerator = new CirclePointGenerator(1f, (float) Math.PI / 4f, (float) Math.PI / 5f, translationAttenuation);
            return animation;
        }
    }

    private ScreenShakeAnimation(ScreenShakingAnimationManager.State state) {
        this.state = state;
    }

    public void update(EntityPlayer player, boolean fadeOut) {


//       

        //transitionDuration = 50;
//        xRotationCoefficient = 1f;
//        yRotationCoefficient = 1f;
//        zRotationCoefficient = 2f;
        float progress = (float) (System.currentTimeMillis() - startTime) / transitionDuration;

        if (progress >= 1f) {
            progress = 0f;
            startTime = System.currentTimeMillis();
        }

        if (!initialized) {
            float[] next = circlePointGenerator.next();
            startX = targetX;
            startY = targetY;
            startZ = targetZ;

            startRotateX = targetRotateX;
            startRotateY = targetRotateY;
            startRotateZ = targetRotateZ;

            targetX = next[1] * xTranslateCoefficient;
            targetY = next[2] * yTranslateCoefficient;
            targetZ = zTranslateCoefficient;

            targetRotateX = 1f;
            targetRotateY = 1f;
            targetRotateZ = 1f;
            totalAdjustment += state.getStepAdjustement();

            initialized = true;
        } else if (progress == 0f) {
            float[] next = circlePointGenerator.next();
            startX = targetX;
            startY = targetY;
            startZ = targetZ;

            startRotateX = targetRotateX;
            startRotateY = targetRotateY;
            startRotateZ = targetRotateZ;

            targetX = next[1] * xTranslateCoefficient;
            targetY = next[2] * yTranslateCoefficient;
            targetZ = targetZ * rotationAttenuation * zTranslateCoefficient;

//            if(targetRotateZ == 0f) {
//                targetRotateZ = 1f;
//            } else {
//                targetRotateZ = -targetRotateZ * rotationAttenuation;
//            }
            targetRotateX = -targetRotateX * rotationAttenuation;
            targetRotateY = -targetRotateY * rotationAttenuation;
            targetRotateZ = -targetRotateZ * rotationAttenuation;

            totalAdjustment += state.getStepAdjustement();
        }

        float adjustedProgress = MathHelper.sin(progress * (float) Math.PI / 2f);
        float currentX = startX + (targetX - startX) * adjustedProgress;
        float currentY = startY + (targetY - startY) * adjustedProgress;
        float currentZ = startZ + (targetZ - startZ) * adjustedProgress;

        GL11.glTranslatef(currentX, currentY, currentZ);

        float currentRotateX = startRotateX + (targetRotateX - startRotateX) * adjustedProgress;
        GL11.glRotatef(currentRotateX * xRotationCoefficient, 1f, 0f, 0f);

        float currentRotateY = startRotateY + (targetRotateY - startRotateY) * adjustedProgress;
        GL11.glRotatef(currentRotateY * yRotationCoefficient, 0f, 1f, 0f);

        float currentRotateZ = startRotateZ + (targetRotateZ - startRotateZ) * adjustedProgress;
        GL11.glRotatef(currentRotateZ * zRotationCoefficient, 0f, 0f, 1f);

        cumulativeAttenuation *= rotationAttenuation;
    }

    public void reset(EntityPlayer player, boolean force) {
        if (force || totalAdjustment != 0f) {
            totalAdjustment = 0f;
            cumulativeAttenuation = 1f;
            circlePointGenerator.reset();
            targetZ = zTranslateCoefficient; //Math.signum(targetZ);
            targetRotateX = -Math.signum(targetRotateX);
            targetRotateY = -Math.signum(targetRotateY);
            targetRotateZ = -Math.signum(targetRotateZ);
        } else {
            totalAdjustment = 0f;
            cumulativeAttenuation = 1f;
//            circlePointGenerator.reset();
            targetZ = zTranslateCoefficient; //Math.signum(targetZ);
            targetRotateX = Math.signum(targetRotateX) * rotationAttenuation;
            targetRotateY = Math.signum(targetRotateY) * rotationAttenuation;
            targetRotateZ = Math.signum(targetRotateZ) * rotationAttenuation;
        }
    }

    @Override
    public boolean isCompleted() {
        return cumulativeAttenuation < 0.001f && circlePointGenerator.cumulativeAttenuation < 0.001f;
    }

    @Override
    public State getState() {
        return state;
    }
}
