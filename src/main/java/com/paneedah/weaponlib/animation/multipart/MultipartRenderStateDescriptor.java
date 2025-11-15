package com.paneedah.weaponlib.animation.multipart;

import com.paneedah.weaponlib.animation.PartPositionProvider;

public interface MultipartRenderStateDescriptor<State, Part, Context extends PartPositionProvider> {

    MultipartRenderStateManager<State, Part, Context> getStateManager();
}
