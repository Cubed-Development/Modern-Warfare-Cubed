package com.paneedah.mwc.rendering;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;

@Getter
@AllArgsConstructor
public final class TexturedModel {

    private final ModelBase model;
    private final String textureName;
}
