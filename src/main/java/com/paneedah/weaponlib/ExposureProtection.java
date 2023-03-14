package com.paneedah.weaponlib;

import java.util.function.Function;

public interface ExposureProtection {

    Function<Float, Float> getAbsorbFunction(Spreadable spreadable);
}
