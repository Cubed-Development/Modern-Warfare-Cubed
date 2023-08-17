package com.paneedah.mwc.rendering;

import com.paneedah.weaponlib.CustomRenderer;
import com.paneedah.weaponlib.RenderableState;

import java.util.List;

public interface IModelSource {

	// Todo: This is dumb why use a list with a pair in it??? Have you ever fucking heard of a map?
	List<TexturedModel> getTexturedModels();

	CustomRenderer<RenderableState> getPostRenderer();
}
