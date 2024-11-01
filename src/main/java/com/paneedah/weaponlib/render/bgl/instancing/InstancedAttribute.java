package com.paneedah.weaponlib.render.bgl.instancing;

import lombok.Getter;

public class InstancedAttribute {

    private final int attribID;
    @Getter
    private final Type attributeType;
    private final String attribName;

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
            size = num;
        }

    }

    public InstancedAttribute(String attribName, int attribID, Type type) {
        this.attribName = attribName;
        this.attribID = attribID;
        attributeType = type;

    }

    public int getAttributeID() {
        return attribID;
    }

    public String getAttributeName() {
        return attribName;
    }


}
