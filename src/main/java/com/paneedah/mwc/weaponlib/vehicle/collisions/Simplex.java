package com.paneedah.mwc.weaponlib.vehicle.collisions;

import com.paneedah.mwc.weaponlib.vehicle.collisions.OBBCollider.MKV;

public class Simplex {
	
	public int size = 0;
	public MKV[] points = new MKV[4];
	
	
	public Simplex() {
		
	}
	
	public void addPoint(MKV point) {
		
		for(int x = (points.length-2); x >= 0; --x) {
			points[x+1] = points[x];
		}
		points[0] = point;
		size ++;
		
		/*
		for(int i = Math.min(size, 2); i >= 0; i --){
			points[i+1] = points[i];
		}
		points[0] = point;
		size ++;
		if(size > 4)
			size = 4;
			*/
	}
	
	
	
	public void removePoint(int p) {
		MKV[] newP = new MKV[4];
		
	}
	
	public int getSize() {
		return size;
	}
	
	public void swapPoint(int pos1, int pos2) {
		MKV p1 = points[pos1];
		MKV p2 = points[pos2];
		points[pos2] = p1;
		points[pos1] = p2;
		
	}

}
