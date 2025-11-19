package com.paneedah.weaponlib.animation.multipart;

import java.util.List;

public interface MultipartTransitionProvider<State, Part, Context> {

    List<MultipartTransition<Part, Context>> getTransitions(State state);
}
