package com.paneedah.weaponlib.animation.jim;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class SingleAnimation {
	
	private String animationName;
	private HashMap<String, AnimationData> dataMap = new HashMap<>();
	private int timestampCount = 0;
	private ArrayList<Float> timestamps;
	private HashMap<Float, String> sounds = new HashMap<>();
	
	private float duration;
	
	public SingleAnimation(String name) {
		this.animationName = name;
	}
	
	
	public float getDuration() {
		return duration;
	}
	
	public void setDuration(float duration) {
		this.duration = duration;
	}
	
	public void registerSound(float time, String name) {
		this.sounds.put(time, name);
	}
	
	public HashMap<Float, String> getSoundMap() {
		return this.sounds;
	}
	
	public ArrayList<Float> getTimestamps() {
		return this.timestamps;
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
		for(Entry<String, AnimationData> i : dataMap.entrySet()) {
			
			//Also assign the time
			i.getValue().appointedDuration = getDuration();
			
			ArrayList<Float> subList = i.getValue().timestamps;
			for(float f : subList) {
				if(!timestamps.contains(f)) timestamps.add(f);
			}
		}
		Collections.sort(timestamps);
		//System.out.println("[" + this.animationName + "] Created animation w/ " + timestamps.size() + " keyframes.");
		this.timestampCount = timestamps.size();
		
		// Bake keyframes
		for(Entry<String, AnimationData> i : dataMap.entrySet()) {
			for(float f : timestamps) {
				if(!i.getValue().timestamps.contains(f)) {
					i.getValue().bakeKeyframes(f);
				}
			}
		}
		
	
		// Fix timestamps
		for(Entry<String, AnimationData> i : dataMap.entrySet()) {
			AnimationData data = i.getValue();
			
			for(int t = 0; t < getTimestamps().size(); ++t) {
				if(t == 0) {
					data.bbTransition.get(getTimestamps().get(t)).timestamp = 1;
				} else {
					float trueDelta = AnimationData.PACE*(getTimestamps().get(t) - getTimestamps().get(t - 1));
					
					//System.out.println("(" + getTimestamps().get(t-1) + ") -> (" + getTimestamps().get(t) + ") " + trueDelta);
					data.bbTransition.get(getTimestamps().get(t)).timestamp = trueDelta;
				}
			}
			
			
			
		}
		
		ArrayList<Float> overflowList = new ArrayList<>();
		for(Entry<Float, String> entry : sounds.entrySet()) overflowList.add(entry.getKey());
		
		// Tries to assign all the sounds to main
		if(dataMap.containsKey(BBLoader.KEY_MAIN)) {
			dataMap.get(BBLoader.KEY_MAIN).setSounds(sounds, overflowList);
		}
		
		if(!overflowList.isEmpty()) {
			for(Entry<String, AnimationData> data : this.dataMap.entrySet()) {
				if(data.getKey().equals(BBLoader.KEY_MAIN)) continue;
				if(overflowList.isEmpty()) break;
				
				
				data.getValue().setSounds(sounds, overflowList);
				
				
			}
		}
		
		//System.out.println("Total # of transitions: " + timestamps.size());
		
		
		
	}
	
	public AnimationData getBone(String bone) {
		if(!dataMap.containsKey(bone)) {
			
			return new AnimationData(getTimestamps());
		}
 		return dataMap.get(bone);
		
	}



	public String getAnimationName() {
		return animationName;
	}



	public void setAnimationName(String animationName) {
		this.animationName = animationName;
	}



	public HashMap<String, AnimationData> getDataMap() {
		return dataMap;
	}



	public void setDataMap(HashMap<String, AnimationData> dataMap) {
		this.dataMap = dataMap;
	}

}
