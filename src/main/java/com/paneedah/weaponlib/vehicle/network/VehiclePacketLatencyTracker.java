package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.vehicle.EntityVehicle;

import java.util.HashMap;

public class VehiclePacketLatencyTracker {


    public static HashMap<EntityVehicle, Long> lastUpdate = new HashMap<>();
    public static HashMap<EntityVehicle, Long> lastDelta = new HashMap<>();

    public static void push(EntityVehicle vehicle) {
        long delta = 0L;
        if (lastUpdate.get(vehicle) != null) {
            delta = System.currentTimeMillis() - lastUpdate.get(vehicle).longValue();
        }
        lastUpdate.put(vehicle, Long.valueOf(System.currentTimeMillis()));
        lastDelta.put(vehicle, Long.valueOf(delta));
    }

    public static long getLastDelta(EntityVehicle vehicle) {
        return lastDelta.get(vehicle).longValue();
    }


}
