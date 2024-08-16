package com.paneedah.weaponlib.animation;

public interface MultipartRenderStateDescriptor<State, Part, Context extends PartPositionProvider> {

    public MultipartRenderStateManager<State, Part, Context> getStateManager();
}
