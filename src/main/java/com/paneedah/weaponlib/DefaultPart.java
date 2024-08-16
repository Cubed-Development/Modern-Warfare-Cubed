package com.paneedah.weaponlib;

public final class DefaultPart implements Part {
    private final String name;

    public DefaultPart(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
