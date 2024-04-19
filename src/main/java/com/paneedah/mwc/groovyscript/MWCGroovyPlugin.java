package com.paneedah.mwc.groovyscript;

import com.cleanroommc.groovyscript.api.GroovyPlugin;
import com.cleanroommc.groovyscript.compat.mods.GroovyContainer;
import com.paneedah.mwc.groovyscript.script.CraftingStation;

import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.NAME;

public class MWCGroovyPlugin implements GroovyPlugin {

    public static final CraftingStation craftingStation = new CraftingStation();

    @Override
    public String getModId() {
        return ID;
    }

    @Override
    public String getContainerName() {
        return NAME;
    }

    @Override
    public void onCompatLoaded(GroovyContainer<?> groovyContainer) {
        groovyContainer.getVirtualizedRegistrar().addFieldsOf(this);
    }
}
