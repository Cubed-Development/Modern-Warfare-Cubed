package com.paneedah.mwc.weaponlib.shader.jim;

public class Attribute {
	//bindAttribute(shader.getShaderId(), 0, "pos");
	
	private int attribID;
	private String attribName;
	
	public Attribute(String name, int id) {
		this.attribName = name;
		this.attribID = id;
	}
	
	public int getAttributeID() {
		return this.attribID;
	}
	
	public String getAttributeName() {
		return this.attribName;
	}

}
