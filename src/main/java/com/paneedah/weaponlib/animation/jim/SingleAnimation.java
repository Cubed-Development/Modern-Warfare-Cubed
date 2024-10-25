package com.paneedah.weaponlib.animation.jim;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class SingleAnimation {

    @Setter
    @Getter
    private String animationName;
    @Setter
    @Getter
    private HashMap<String, AnimationData> dataMap = new HashMap<>();
    @Getter
    private ArrayList<Float> timestamps;
    private final HashMap<Float, String> sounds = new HashMap<>();

    @Setter
    @Getter
    private float duration;

    public SingleAnimation(String name) {
        animationName = name;
    }


    public void registerSound(float time, String name) {
        sounds.put(Float.valueOf(time), name);
    }

    public HashMap<Float, String> getSoundMap() {
        return sounds;
    }

    public boolean hasBone(String name) {
        return dataMap.containsKey(name);
    }

    public void addBoneData(String name, JsonObject obj) {
        dataMap.put(name, new AnimationData(obj));
    }

    public void bake() {

        // Collect all keyframes
        timestamps = new ArrayList<>();
        for (Entry<String, AnimationData> i : dataMap.entrySet()) {

            //Also assign the time
            i.getValue().setAppointedDuration(getDuration());

            ArrayList<Float> subList = i.getValue().getTimestamps();
            for (float f : subList) {
                if (!timestamps.contains(Float.valueOf(f))) {
                    timestamps.add(Float.valueOf(f));
                }
            }
        }
        Collections.sort(timestamps);
        //System.out.println("[" + this.animationName + "] Created animation w/ " + timestamps.size() + " keyframes.");
        int timestampCount = timestamps.size();

        // Bake keyframes
        for (Entry<String, AnimationData> i : dataMap.entrySet()) {
            for (float f : timestamps) {
                if (!i.getValue().getTimestamps().contains(Float.valueOf(f))) {
                    i.getValue().bakeKeyframes(f);
                }
            }
        }


        // Fix timestamps
        for (Entry<String, AnimationData> i : dataMap.entrySet()) {
            AnimationData data = i.getValue();

            for (int t = 0; t < getTimestamps().size(); ++t) {
                if (t == 0) {
                    data.bbTransition.get(getTimestamps().get(t)).setTimestamp(1.0f);
                } else {
                    float trueDelta = AnimationData.PACE * (getTimestamps().get(t).floatValue() - getTimestamps().get(t - 1).floatValue());

                    //System.out.println("(" + getTimestamps().get(t-1) + ") -> (" + getTimestamps().get(t) + ") " + trueDelta);
                    data.bbTransition.get(getTimestamps().get(t)).setTimestamp(trueDelta);
                }
            }


        }

        ArrayList<Float> overflowList = new ArrayList<>();
        for (Entry<Float, String> entry : sounds.entrySet())
            overflowList.add(entry.getKey());

        // Tries to assign all the sounds to main
        if (dataMap.containsKey(BBLoader.KEY_MAIN)) {
            dataMap.get(BBLoader.KEY_MAIN).setSounds(sounds, overflowList);
        }

        if (!overflowList.isEmpty()) {
            for (Entry<String, AnimationData> data : dataMap.entrySet()) {
                if (data.getKey().equals(BBLoader.KEY_MAIN)) {
                    continue;
                }
                if (overflowList.isEmpty()) {
                    break;
                }


                data.getValue().setSounds(sounds, overflowList);


            }
        }

        //System.out.println("Total # of transitions: " + timestamps.size());


    }

    public AnimationData getBone(String bone) {
        if (!dataMap.containsKey(bone)) {

            return new AnimationData(getTimestamps());
        }
        return dataMap.get(bone);

    }


}
