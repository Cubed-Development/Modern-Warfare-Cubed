package com.paneedah.weaponlib.render.scopes;

import java.util.LinkedList;

public class CyclicList<K> extends LinkedList<K> {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private int position = 0;


    public K next() {
        position++;
        if (position >= size()) {
            position = 0;
        }
        return current();
    }

    public K current() {
        return get(position);
    }

}
