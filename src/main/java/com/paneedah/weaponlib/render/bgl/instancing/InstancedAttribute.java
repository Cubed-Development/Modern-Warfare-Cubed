package com.paneedah.weaponlib.render.bgl.instancing;

public class InstancedAttribute {
	
	private int attribID;
	private Type attributeType;
	private String attribName;
	
	public static enum Type {
		VEC4(4),
		VEC3(3),
		VEC2(2),
		FLOAT(1),
		INTEGER(1),
		BOOLEAN(1);
		
		private int size;
		
		
		
		private Type(int num) {
			this.size = num;
		}
		
		public int getSize() {
			return this.size;
		}
	}
	
	public InstancedAttribute(String attribName, int attribID, Type type) {
		this.attribName = attribName;
		this.attribID = attribID;
		this.attributeType = type;
		
	}
	
	public int getAttributeID() {
		return this.attribID;
	}
	
	public String getAttributeName() {
		return this.attribName;
	}
	
	public Type getAttributeType() { 
		return this.attributeType;
	}
	
	

}
