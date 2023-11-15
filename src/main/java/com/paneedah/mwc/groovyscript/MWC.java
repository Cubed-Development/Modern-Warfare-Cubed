package com.paneedah.mwc.groovyscript;

import com.cleanroommc.groovyscript.compat.mods.ModPropertyContainer;
import com.cleanroommc.groovyscript.compat.mods.ModSupport;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.groovyscript.script.CraftingStation;

public class MWC extends ModPropertyContainer {

    public static final ModSupport.Container<MWC> MWC = new ModSupport.Container<>(ModReference.ID, ModReference.NAME, MWC::new);

    public final CraftingStation STATION = new CraftingStation();

    public MWC(){
        addRegistry(STATION);
    }

    public static void register(){}

}
