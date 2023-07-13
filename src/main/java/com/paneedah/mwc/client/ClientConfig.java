package com.paneedah.mwc.client;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    static {
        BUILDER.push("BASIC");

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
