package com.paneedah.mwc.weaponlib.animation;

public interface MultipartRenderStateDescriptor<State, Part, Context extends PartPositionProvider> {

    public MultipartRenderStateManager<State, Part, Context> getStateManager();
}
