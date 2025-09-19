package com.paneedah.weaponlib.render.shells;

import com.paneedah.mwc.utils.QuickResourceLocation;
import com.paneedah.weaponlib.Pair;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import com.paneedah.weaponlib.render.wavefront.WavefrontLoader;
import com.paneedah.weaponlib.render.wavefront.WavefrontModel;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;

/**
 * This class was created in case that in the future more shell types will be added.
 * The reason that only a couple shell types are used is because it is good for optimization,
 * and because often times shells look the same.
 * <p>
 * Future Optimizations:
 * - GPU instancing for shells
 *
 * @author Jim Holden, 2022
 */
public class ShellRegistry {

    private static final HashMap<Shell.Type, Pair<WavefrontModel, ResourceLocation>> shellRegistrar = new HashMap<>();


    static {
        addShellToRegistry(Type.ASSAULT, "assaultshell", "assaultshell");
        addShellToRegistry(Type.SHOTGUN, "12gaugeshell", "12gaugeshell");
        addShellToRegistry(Type.PISTOL, "9mmshell", "boolet9mm");
    }


    /**
     * Adds shell to registry.
     * <p>
     * Loads the model as a submodel, searches models/obj for a submodel called "casing" within the obj
     * <p>
     * The texture is located in textures/models
     *
     * @param type
     * @param modelName
     * @param textureName
     */
    public static void addShellToRegistry(Type type, String modelName, String textureName) {
        shellRegistrar.put(type, new Pair<>(WavefrontLoader.loadSubModel(modelName, "casing"),
                QuickResourceLocation.quickLoc("models", textureName)));
    }

    public static HashMap<Shell.Type, Pair<WavefrontModel, ResourceLocation>> getShellMappings() {
        return shellRegistrar;
    }

    /**
     * Returns the model of the shell
     *
     * @param type type
     *
     * @return Wavefront model
     */
    public static WavefrontModel getShellModel(Type type) {
        return shellRegistrar.get(type).getFirst();
    }

    /**
     * Returns the texture of the shell
     *
     * @param type type
     *
     * @return Resource location
     */
    public static ResourceLocation getShellTexture(Type type) {
        return shellRegistrar.get(type).getSecond();
    }

}
