package com.paneedah.weaponlib.render;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class VAOData {

    public int vaoID;
    public int vertexCount;

    public VAOData(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }

}
