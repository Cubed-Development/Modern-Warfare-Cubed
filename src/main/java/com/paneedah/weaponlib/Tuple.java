package com.paneedah.weaponlib;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public final class Tuple<U, V> {

    private U u;
    private V v;

    public Tuple(U u, V v) {

        this.u = u;
        this.v = v;
    }

}
