package com.paneedah.weaponlib.animation;


import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.model.Bullet556;

public class SpecialAttachments {
	public static ItemAttachment<Weapon> MagicMag;
	
	public static void init(Object mod, ModContext context) {
		
		MagicMag = new AttachmentBuilder<Weapon>()
	            .withCategory(AttachmentCategory.MAGICMAG)
	            
	            // This model serves as a placeholder
	            .withModel(new Bullet556(), "tan.png")
	            
	            
	            .withName("magazine_extra")
	            .withRenderablePart()
	            .withTextureName("Dummy.png").build(context);
		
		
		
	}

}
