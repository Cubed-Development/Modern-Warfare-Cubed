package com.paneedah.weaponlib.shader.jim;

public class Attribute {
    //bindAttribute(shader.getShaderId(), 0, "pos");

    private final int attribID;
    private final String attribName;

    public Attribute(String name, int id) {
        attribName = name;
        attribID = id;
    }

    public int getAttributeID() {
        return attribID;
    }

    public String getAttributeName() {
        return attribName;
    }

}
