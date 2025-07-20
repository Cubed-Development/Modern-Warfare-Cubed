package com.paneedah.mwc.weapons;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import lombok.Getter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.creativetab.CreativeTabs;

public abstract class AbstractItemBuilder<T extends AbstractItemBuilder<T>> {

    @Getter protected String name;
    @Getter protected ModelBase model;
    protected CreativeTabs tab;

    protected CraftingComplexity craftingComplexity;
    protected Object[] craftingMaterials;
    protected int craftingCount = 1;

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

    @SuppressWarnings("unchecked")
    public T withCrafting(CraftingComplexity complexity, Object... materials) {
        return withCrafting(1, complexity, materials);
    }

    @SuppressWarnings("unchecked")
    public T withCrafting(int craftingCount, CraftingComplexity complexity, Object... materials) {
        if (complexity == null) {
            throw new IllegalArgumentException("Crafting complexity not set");
        }
        if (materials.length < 2) {
            throw new IllegalArgumentException("2 or more materials required for crafting");
        }
        if (craftingCount == 0) {
            throw new IllegalArgumentException("Invalid item count");
        }
        this.craftingComplexity = complexity;
        this.craftingMaterials = materials;
        this.craftingCount = craftingCount;
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
