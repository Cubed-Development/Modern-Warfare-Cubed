package com.paneedah.weaponlib.animation.jim;

import lombok.Getter;

import java.util.HashMap;

@Getter
public class AnimationSet {

    private final HashMap<String, SingleAnimation> animations = new HashMap<>();


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
