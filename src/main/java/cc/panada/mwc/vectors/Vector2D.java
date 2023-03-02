package cc.panada.mwc.vectors;

/**
 * Represents a two-dimensional vector with `x` and `y` coordinates.
 * <p>
 * By Red Studio
 * <p>
 * Created & Maintained by Desoroxxx
 */
public class Vector2D {

    /** The x component of this vector. */
    public float x;
    /** The y component of this vector. */
    public  float y;

    /**
     * Constructs a new empty vector.
     */
    public Vector2D() {
    }

    /**
     * Constructs a new vector with the given x and y coordinates.
     *
     * @param inputX The X coordinate
     * @param inputY The Y coordinate
     */
    public Vector2D(final float inputX, final float inputY) {
        x = inputX;
        y = inputY;
    }
}
