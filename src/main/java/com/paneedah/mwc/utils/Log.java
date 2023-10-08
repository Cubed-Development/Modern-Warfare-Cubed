package com.paneedah.mwc.utils;

public enum Log {
    ERROR("Error"),
    WARN("Warn"),
    INFO("Info");

    public final String name;

    Log(String name) {
        this.name = name;
    }
}
