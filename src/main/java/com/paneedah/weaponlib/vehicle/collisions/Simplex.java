package com.paneedah.weaponlib.vehicle.collisions;

import com.paneedah.weaponlib.vehicle.collisions.OBBCollider.MKV;
import lombok.Getter;

public class Simplex {

    @Getter
    public int size = 0;
    public MKV[] points = new MKV[4];


    public Simplex() {

    }

    public void addPoint(MKV point) {

        for (int x = (points.length - 2); x >= 0; --x) {
            points[x + 1] = points[x];
        }
        points[0] = point;
        size++;

    }


    public void removePoint(int p) {
        MKV[] newP = new MKV[4];

    }

    public void swapPoint(int pos1, int pos2) {
        MKV p1 = points[pos1];
        MKV p2 = points[pos2];
        points[pos2] = p1;
        points[pos1] = p2;

    }

}
