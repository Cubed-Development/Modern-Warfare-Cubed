package com.paneedah.mwc.weaponlib.animation;

import java.util.List;

public interface MultipartTransitionProvider<State, Part, Context> {

	public List<MultipartTransition<Part, Context>> getTransitions(State state);
}
