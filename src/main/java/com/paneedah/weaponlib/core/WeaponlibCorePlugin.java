package com.paneedah.weaponlib.core;

import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.MCVersion;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.Name;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin.TransformerExclusions;

import java.util.Map;

@Name("weaponlib")
@TransformerExclusions({"com.paneedah.weaponlib.core"})
@MCVersion(value = "1.12.2")
public class WeaponlibCorePlugin implements IFMLLoadingPlugin {

    @Override
    public String getAccessTransformerClass() {
        return null;
    }

    @Override
    public String[] getASMTransformerClass() {
        return new String[] {
                "com.paneedah.weaponlib.core.WeaponlibClassTransformer"
        };
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {

    }

}