package com.paneedah.weaponlib.config;

@Deprecated
public class AIEntity {

    public final String name;
    public final double health;
    public final double spawn;

    public AIEntity(String name, double health, double spawn) {
        this.name = name;
        this.health = health;
        this.spawn = spawn;
    }
}
