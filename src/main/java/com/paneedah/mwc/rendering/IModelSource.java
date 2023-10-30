package com.paneedah.mwc.rendering;

import com.paneedah.weaponlib.CustomRenderer;
import com.paneedah.weaponlib.RenderableState;

import java.util.List;

public interface IModelSource {

	List<TexturedModel> getTexturedModels();

	CustomRenderer<RenderableState> getPostRenderer();
}
