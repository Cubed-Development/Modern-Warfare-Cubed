package com.paneedah.weaponlib.config.novel;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigSync {
	
	String category();
	String comment();

}
