package com.paneedah.weaponlib.render.bgl.weather;

import java.util.ArrayList;

public class ModernWeatherManager {

    public static enum WeatherSeverity {
        LIGHT,
        MEDIUM,
        HEAVY,
        INSANITY;
    }


    private static ArrayList<IWeatherListener> listeners = new ArrayList<>();
    private static WeatherSeverity severity = WeatherSeverity.LIGHT;

    public static void registerListener(IWeatherListener listener) {
        listeners.add(listener);
    }

    public static void updateFog(double fog) {

    }

    public static void setRainSeverity(WeatherSeverity ws) {
        severity = ws;
    }

    public static WeatherSeverity getWeatherSeverity() {
        return severity;

    }

}
