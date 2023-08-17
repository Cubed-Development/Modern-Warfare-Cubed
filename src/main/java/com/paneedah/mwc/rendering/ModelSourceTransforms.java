package com.paneedah.mwc.rendering;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents transformations for different rendering positions of a model.
 * <p>
 * This class contains various positioning callbacks that can be configured to modify the positioning of a model in different scenarios like entity, inventory, third-person view, and more.
 *
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
@Getter
@Setter
@Builder
public final class ModelSourceTransforms {

    // We use empty defaults values to not have null pointers exceptions thrown
    @Builder.Default private Runnable entityPositioning = () -> {};
    @Builder.Default private Runnable inventoryPositioning = () -> {};
    @Builder.Default private Runnable thirdPersonPositioning = () -> {};
    @Builder.Default private Runnable firstPersonPositioning = () -> {};

    // Unlike the rest, these two aren't empty it's because by default hands shouldn't be rendered, so they are just null
    private Runnable firstPersonLeftArmPositioning;
    private Runnable firstPersonRightArmPositioning;
}
