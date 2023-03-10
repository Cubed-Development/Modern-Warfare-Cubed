package com.paneedah.weaponlib.animation;


import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.config.ConfigurationManager;
import com.paneedah.weaponlib.model.Bullet556;

public class SpecialAttachments {
	public static ItemAttachment<Weapon> MagicMag;
	
	public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, ModContext context) {
		
		MagicMag = new AttachmentBuilder<Weapon>()
	            .withCategory(AttachmentCategory.MAGICMAG)
	            
	            // This model serves as a placeholder
	            .withModel(new Bullet556(), "tan.png")
	            
	            
	            .withName("magazine_extra")
	            .withRenderablePart()
	            .withModId("mw")
	            .withTextureName("Dummy.png").build(context);
		
		
		
	}

}
