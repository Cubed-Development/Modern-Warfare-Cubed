package com.paneedah.weaponlib.render.scopes;

import java.util.LinkedList;

/**
 * A {@link LinkedList} that allows cycling through its elements indefinitely.
 *
 * <p>Each call to {@link #next()} advances the position by one. When
 * the end of the list is reached, the position wraps around to the beginning.</p>
 *
 * @param <K> the type of elements in this list
 */
public class CyclicList<K> extends LinkedList<K> {

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
