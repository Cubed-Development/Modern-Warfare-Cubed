package com.paneedah.mwc.utils;

import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.ProjectConstants.ID;

public class QuickResourceLocation {

    /**
     * Quickly locate a {@link ResourceLocation}
     *
     * @param folder The folder path inside mwc's <code>textures</code> directory (e.g., "gui/inventory").
     * @param name   The base name of the texture file, without extension (e.g., "5slots").
     * @return A {@link ResourceLocation} pointing to the specified texture.
     */
    public static ResourceLocation quickLoc(String folder, String name) {
        return new ResourceLocation(ID + ":textures/" + folder + "/" + name + ".png");
    }

    /**
     * Quickly locate a {@link ResourceLocation} outside of the <code>textures</code> directory.
     *
     * @param folder The folder path inside your mod's resources (e.g., "shaders", "models", etc.).
     * @param name   The base name of the resource file, with or without extension.
     * @return A {@link ResourceLocation} pointing to the specified resource.
     */
    public static ResourceLocation quickRawLoc(String folder, String name) {
        return new ResourceLocation(ID, folder + "/" + name);
    }


}
