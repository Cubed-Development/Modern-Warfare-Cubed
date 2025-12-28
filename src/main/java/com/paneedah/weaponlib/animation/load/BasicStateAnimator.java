package com.paneedah.weaponlib.animation.load;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import lombok.NoArgsConstructor;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.LinkedList;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
public class BasicStateAnimator {

    public double time = 0.0;

    public LinkedList<Transition> callList = new LinkedList<>();

    public Transition goingTransition;
    public Transition currentTransition;


    public Vec3d currentPosition = Vec3d.ZERO;
    public Vec3d previousPosition = Vec3d.ZERO;

    public Vec3d currentRot = Vec3d.ZERO;
    public Vec3d prevRot = Vec3d.ZERO;

    public static final Transition ZERO_TRANSITION = new BasicStateAnimator.Transition(Vec3d.ZERO, Vec3d.ZERO, 0.0);

    //public static final

    public Vec3d getInterpolatedRotation() {
        double mu = MC.getRenderPartialTicks();
        return InterpolationKit.interpolateVector(prevRot, currentRot, mu);

    }

    public Vec3d getInterpolatedPosition() {
        double mu = MC.getRenderPartialTicks();
        return InterpolationKit.interpolateVector(previousPosition, currentPosition, mu);
    }

    public void applyGLTransforms() {


        Vec3d iP = getInterpolatedPosition();
        Vec3d iR = getInterpolatedRotation();
        GlStateManager.translate(iP.x, iP.y, iP.z);
        GlStateManager.rotate((float) iR.x, 0, 0, 1);
        GlStateManager.rotate((float) iR.y, 0, 1, 0);
        GlStateManager.rotate((float) iR.z, 1, 0, 0);
    }

    public void addPause(double time) {
        Transition pauseTransition = callList.peekLast();
        pauseTransition.time = time;

        callList.offer(pauseTransition);

    }

    public void transition(Vec3d pos, Vec3d rot, double time) {

        callList.offer(new Transition(pos, rot, time));
        //callList.add(new Transition(pos, rot, time));
    }

    public void tick() {

        if (callList.size() > 50) {
            callList.clear();
        }

        if (goingTransition != null && currentTransition == null) {
            currentTransition = ZERO_TRANSITION;
        }

        if (goingTransition != null) {
            time += 1;

            prevRot = currentRot;
            previousPosition = currentPosition;

            if (time > goingTransition.time) {
                //System.out.println("fuck " + time);
                currentTransition = goingTransition;

                time = 0;
                if (callList.isEmpty()) {
                    goingTransition = null;
                } else {
                    goingTransition = callList.poll();
                }

            } else {
                double mu = time / goingTransition.time;

                currentPosition = InterpolationKit.interpolateVector(currentTransition.pos, goingTransition.pos, mu);
                currentRot = InterpolationKit.interpolateVector(currentTransition.rot, goingTransition.rot, mu);

            }


        } else {

            if (!callList.isEmpty()) {
                goingTransition = callList.poll();
            }
            //currentPosition = currentTransition.pos;
            //currentRot = currentTransition.rot;
        }
    }


    public interface ITransitionable {


    }

    public static class Transition implements ITransitionable {

        public Vec3d pos;
        public Vec3d rot;
        public double time;

        public Transition(Vec3d pos, Vec3d rot, double time) {
            this.pos = pos;
            this.rot = rot;
            this.time = time;
        }

    }


}
