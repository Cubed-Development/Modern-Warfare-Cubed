package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.Part;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.SoundEvent;

import java.util.function.Consumer;

public class Transition<Context> {

    private static final Consumer<?> ANCHORED_POSITION = c -> {};


    public static <T> Consumer<T> anchoredPosition() {
        return (Consumer<T>) ANCHORED_POSITION;
    }

    @Getter
    private final Consumer<Context> itemPositioning;
    @Getter
    @Setter
    private long duration;
    @Getter
    private final long pause;
    @Getter
    private final Part attachedTo;
    @Getter
    private boolean animated;

    private SoundEvent evt;

    public Transition(Consumer<Context> itemPositioning, Part attachedTo, boolean animated) {
        this(itemPositioning, 0, 0);
        this.animated = animated;
    }

    public Transition(Consumer<Context> itemPositioning, long duration) {
        this(itemPositioning, duration, 0);
    }

    public Transition(Consumer<Context> itemPositioning, long duration, long pause) {
        this(itemPositioning, duration, pause, null);
    }

    public void setSound(SoundEvent event) {
        evt = event;
    }

    public Transition(Consumer<Context> itemPositioning, long duration, long pause, Part attachedTo) {
        this.itemPositioning = itemPositioning;
        this.duration = duration;
        this.pause = pause;
        this.attachedTo = attachedTo;
    }

    public SoundEvent getSound() {
        return evt;
    }

}
