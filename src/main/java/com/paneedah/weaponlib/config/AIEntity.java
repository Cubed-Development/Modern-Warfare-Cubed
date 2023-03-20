package com.paneedah.weaponlib.config;

public class AIEntity {

    private final String name;
    private final double health;
    private final double spawn;

    public AIEntity(String name, double health, double spawn) {
        this.name = name;
        this.health = health;
        this.spawn = spawn;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getSpawn() {
        return spawn;
    }

    public boolean shouldSpawn() {
        return spawn > 0;
    }
}
