package com.paneedah.weaponlib.shader;

import lombok.Getter;

/**
 * Represents a shader attribute used in a GLSL program.
 * <p>
 * A shader attribute is a named input variable in a vertex shader, such as position,
 * normal, or texture coordinates. This class holds the attribute's name and the index
 * to which it should be bound in an OpenGL shader program.
 * </p>
 *
 * @author Jim Holden
 */
@Getter
public class ShaderAttribute {
    private final int attributeID;
    private final String attributeName;

    public ShaderAttribute(String name, int id) {
        this.attributeName = name;
        this.attributeID = id;
    }

}
