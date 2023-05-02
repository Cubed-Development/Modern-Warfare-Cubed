package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;

public enum CompatibleTransformType {

	NONE,
    THIRD_PERSON_LEFT_HAND,
    THIRD_PERSON_RIGHT_HAND,
    FIRST_PERSON_LEFT_HAND,
    FIRST_PERSON_RIGHT_HAND,
    HEAD,
    GUI,
    GROUND,
    FIXED;
	
	public static CompatibleTransformType fromItemRenderType(TransformType itemRenderType) {
		CompatibleTransformType result = null;
		switch(itemRenderType) {
		case NONE: result = CompatibleTransformType.NONE; break;
		case THIRD_PERSON_LEFT_HAND: result = CompatibleTransformType.THIRD_PERSON_LEFT_HAND; break;
		case THIRD_PERSON_RIGHT_HAND: result = CompatibleTransformType.THIRD_PERSON_RIGHT_HAND; break;
		case FIRST_PERSON_LEFT_HAND: result = CompatibleTransformType.FIRST_PERSON_LEFT_HAND; break;
		case FIRST_PERSON_RIGHT_HAND: result = CompatibleTransformType.FIRST_PERSON_RIGHT_HAND; break;
		case HEAD: result = CompatibleTransformType.HEAD; break;
		case GUI: result = CompatibleTransformType.GUI; break;
		case GROUND: result = CompatibleTransformType.GROUND; break;
		case FIXED: result = CompatibleTransformType.FIXED; break;
		}
		return result;
	}
}
