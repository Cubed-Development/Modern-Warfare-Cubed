package com.paneedah.weaponlib.render.vao;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VAOData {

    public int vaoID;
    public int vertexCount;

    public VAOData(int vaoID, int vertexCount) {
        this.vaoID = vaoID;
        this.vertexCount = vertexCount;
    }

}
