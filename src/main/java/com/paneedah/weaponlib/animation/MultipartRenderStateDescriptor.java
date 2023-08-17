package com.paneedah.weaponlib.animation;

public interface MultipartRenderStateDescriptor<State, Part, Context extends PartPositionProvider> {

    MultipartRenderStateManager<State, Part, Context> getStateManager();
}
