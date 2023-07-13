package com.paneedah.mwc.content.types;

public enum Types {
    INFO("info"),
    ITEM("items"),
    BLOCK("blocks"),
    GUN("guns"),
    GRENADE("grenades"),
    BULLET("bullet"),
    MAGAZINE("magazines"),
    MELEE("melee");

    public String folderName;

    Types(String name) {
        folderName = name;
    }

    public static Types get(String s) {
        for(Types e : values()) {
            if(e.folderName.equals(s))
                return e;
        }
        return null;
    }
}
