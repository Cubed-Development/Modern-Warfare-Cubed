package com.paneedah.weaponlib.animation.jim;

import com.paneedah.weaponlib.vehicle.GearShiftPattern;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.TreeMap;

public class GearShiftAnimation {


    private final TreeMap<Double, Vec3d> transitionMap = new TreeMap<>();
    private ArrayList<Vec3d> transitions;


    private int progress = 0;


    private int posInAnim;


    public GearShiftAnimation(GearShiftPattern pat, int duration, int startGear, int targetGear) {
        transitions = pat.getTransitions(startGear, targetGear);
        setup();
    }

    private void setup() {
        for (int x = 0; x < transitions.size(); ++x) {
            System.out.println(transitions.get(x));
        }
    }

    public void tick() {
        progress++;
        update(progress);
    }

    public void update(int progress) {

    }


    public Vec3d getOffset() {
        return null;

    }


}
