package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.MultipartTransition;
import com.paneedah.weaponlib.animation.MultipartTransitionProvider;

import java.util.*;

public class PlayerTransitionProvider implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>>  {

    private final List<MultipartTransition<Part, RenderContext<RenderableState>>> transitions = Collections.singletonList(
            new MultipartTransition<Part, RenderContext<RenderableState>>(Part.MAIN, renderContext -> {}, 200, 0)
                    .withPartPositionFunction(Part.LEFT_HAND, rc -> {})
                    .withPartPositionFunction(Part.RIGHT_HAND, rc -> {})
                    .withPartPositionFunction(Part.LEFT_LEG, rc -> {})
                    .withPartPositionFunction(Part.RIGHT_LEG, rc -> {}));

    @Override
    public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
        return transitions;
    }
}