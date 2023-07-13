package com.paneedah.mwc.common;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> LOAD_DEFAULT_CP;

    static {
        BUILDER.push("BASIC");
        LOAD_DEFAULT_CP = BUILDER.comment("Should it load the default content pack? this option will automatically be set to false once the pack has been loaded.")
                .define("load_default_cp", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
