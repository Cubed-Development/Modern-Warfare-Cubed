package com.paneedah.weaponlib.config;

import net.minecraft.client.resources.I18n;
import net.minecraftforge.fml.client.config.DummyConfigElement.DummyCategoryElement;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.List;

public class ModernConfigCategory extends DummyCategoryElement {

    private final String registryKey;

    public ModernConfigCategory(String name, String registryKey, List<IConfigElement> childElements) {
        super(name, registryKey, childElements);
        this.registryKey = registryKey + ".name";
    }

    public String getCategoryName() {
        return name;
    }

    @Override
    public String getName() {
        return I18n.format(registryKey);
    }
}
