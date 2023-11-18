package com.paneedah.mwc.groovyscript;

import com.cleanroommc.groovyscript.compat.mods.ModPropertyContainer;
import com.cleanroommc.groovyscript.compat.mods.ModSupport;
import com.paneedah.mwc.groovyscript.script.CraftingStation;

import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.NAME;

public class MWCGroovyContainer extends ModPropertyContainer {

    public static final ModSupport.Container<MWCGroovyContainer> MWC = new ModSupport.Container<>(ID, NAME, MWCGroovyContainer::new);

    public final CraftingStation craftingStation = new CraftingStation();

    public MWCGroovyContainer(){
        addRegistry(craftingStation);
    }
}
