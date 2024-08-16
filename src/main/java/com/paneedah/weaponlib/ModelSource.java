package com.paneedah.weaponlib;

import net.minecraft.client.model.ModelBase;

import java.util.List;

public interface ModelSource {

    List<Tuple<ModelBase, String>> getTexturedModels();

    CustomRenderer<?> getPostRenderer();
}
