package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.MultipartTransition;
import com.paneedah.weaponlib.animation.MultipartTransitionProvider;

import java.util.*;

public class PlayerTransitionProvider implements MultipartTransitionProvider<RenderableState, Part, RenderContext<RenderableState>>  {

    @Override
    public List<MultipartTransition<Part, RenderContext<RenderableState>>> getTransitions(RenderableState state) {
        // Panda: This absolutely sucks. Why are we doing this to begin with? There's certainly better ways. It took me absolutely forever to
        //        figure out this spaghetti mess of fucking MultipartTransition lists and MultipartTransitionProviders. Fuck me sideways
        //        this is absolute cancer and there is about a 0% chance this is efficient. But oh well - whatever. Gets the job done for now.
        // TODO: CLEAN THIS UP.
        return Collections.singletonList(
                new MultipartTransition<Part, RenderContext<RenderableState>>(Part.MAIN, renderContext -> {}, 200, 0)
                        .withPartPositionFunction(Part.LEFT_HAND, rc -> {})
                        .withPartPositionFunction(Part.RIGHT_HAND, rc -> {})
                        .withPartPositionFunction(Part.LEFT_LEG, rc -> {})
                        .withPartPositionFunction(Part.RIGHT_LEG, rc -> {})
        );
    }
}