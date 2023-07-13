package com.paneedah.mwc.data.generators;

import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.content.PackLoader;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.Locale;

public class LangGen extends LanguageProvider {
    public LangGen(PackOutput output) {
        super(output, ModernWarfareCubed.MOD_ID, Locale.getDefault().getLanguage());
    }

    @Override
    protected void addTranslations() {
        for(Item item : PackLoader.LangLoader.list.keySet()) {
            add(item, PackLoader.LangLoader.list.get(item));
        }
    }
}
