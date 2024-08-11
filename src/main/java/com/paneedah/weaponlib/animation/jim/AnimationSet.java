package com.paneedah.weaponlib.animation.jim;

import java.util.HashMap;

public class AnimationSet {

    private HashMap<String, SingleAnimation> animations = new HashMap<>();


    public HashMap<String, SingleAnimation> getAnimations() {
        return animations;
    }

    public boolean containsKey(String name) {
        return animations.containsKey(name);
    }

    public SingleAnimation getSingleAnimation(String subName) {
        if (!animations.containsKey(subName)) {
            return null;
        }
        return animations.get(subName);
    }

    public void addSingleAnimation(SingleAnimation sa) {
        animations.put(sa.getAnimationName(), sa);
    }

}
