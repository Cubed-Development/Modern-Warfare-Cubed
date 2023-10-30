package com.paneedah.weaponlib;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public final class Pair<A, B> {

    private final A first;
    private final B second;
}
