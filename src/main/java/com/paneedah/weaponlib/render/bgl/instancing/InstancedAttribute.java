package com.paneedah.weaponlib.render.bgl.instancing;

import lombok.Getter;

@Getter
public class InstancedAttribute {

    private final int attributeID;

    private final Type attributeType;
    private final String attributeName;

    @Getter
    public enum Type {
        VEC4(4),
        VEC3(3),
        VEC2(2),
        FLOAT(1),
        INTEGER(1),
        BOOLEAN(1);

        private final int size;

        Type(int num) {
            this.size = num;
        }

    }

    public InstancedAttribute(String attributeName, int attributeID, Type type) {
        this.attributeName = attributeName;
        this.attributeID = attributeID;
        this.attributeType = type;

    }

}
