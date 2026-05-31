package com.paneedah.weaponlib.animation.load;

import com.google.gson.JsonObject;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

@Getter
public class SingleAnimation {


    @Setter private String animationName;
    @Setter private HashMap<String, AnimationData> dataMap = new HashMap<>();
    private ArrayList<Float> timestamps;
    private final HashMap<Float, String> sounds = new HashMap<>();

    @Setter private float duration;

    public SingleAnimation(String name) {
        this.animationName = name;
    }


    public void registerSound(float time, String name) {
        this.sounds.put(time, name);
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
                if (!timestamps.contains(f)) {
                    timestamps.add(f);
                }
            }
        }
        Collections.sort(timestamps);
        //System.out.println("[" + this.animationName + "] Created animation w/ " + timestamps.size() + " keyframes.");

        // Bake keyframes
        for (Entry<String, AnimationData> i : dataMap.entrySet()) {
            for (float f : timestamps) {
                if (!i.getValue().getTimestamps().contains(f)) {
                    i.getValue().bakeKeyframes(f);
                }
            }
        }


        // Fix timestamps
        for (Entry<String, AnimationData> i : dataMap.entrySet()) {
            AnimationData data = i.getValue();

            for (int t = 0; t < getTimestamps().size(); ++t) {
                if (t == 0) {
                    data.getBbTransition().get(getTimestamps().get(t)).setTimestamp(1);
                } else {
                    float trueDelta = AnimationData.PACE * (getTimestamps().get(t) - getTimestamps().get(t - 1));

                    //System.out.println("(" + getTimestamps().get(t-1) + ") -> (" + getTimestamps().get(t) + ") " + trueDelta);
                    data.getBbTransition().get(getTimestamps().get(t)).setTimestamp(trueDelta);
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
            for (Entry<String, AnimationData> data : this.dataMap.entrySet()) {
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
