package com.paneedah.weaponlib;

public final class SpecialAttachments {

    public static ItemAttachment<Weapon> magicMag;

    public static void init() {
        magicMag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.MAGICMAG)
                .withName("magazine_extra")
                .withRenderablePart()
                .build();
    }
}
