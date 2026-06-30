package com.paneedah.mwc.weapons;

import com.paneedah.weaponlib.ModContext;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;

public abstract class AbstractItemBuilder<T extends AbstractItemBuilder<T>> {

    @Getter protected String name;
    @Getter protected ModelBase model;
    protected CreativeTabs tab;

    protected int maxStackSize = 1;

    // Common methods returning T for fluent chaining

    @SuppressWarnings("unchecked")
    public T withName(String name) {
        this.name = name;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T withCreativeTab(CreativeTabs tab) {
        this.tab = tab;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T withModel(ModelBase model) {
        this.model = model;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T withMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
        return (T) this;
    }

    // Utility methods that can be static or protected as needed
    protected static String addFileExtension(String s, String ext) {
        return s != null && !s.endsWith(ext) ? s + ext : s;
    }

    protected static String stripFileExtension(String str, String extension) {
        return str.endsWith(extension) ? str.substring(0, str.length() - extension.length()) : str;
    }

    // Abstract build method to be implemented by subclasses
    public abstract Object build(ModContext modContext);
}
