package com.paneedah.mwc;

import com.paneedah.weaponlib.UniversalSoundLookup;

/**
 * Creates a sound registry for WeaponLib to access in order to play
 * reloading noises.
 *
 * @author Jim Holden, 2022
 */
public class UniversalSoundRegistry {

    public static void init() {
        // Example: UniversalSoundLookup.registerSoundToLookup("test_sound");
        UniversalSoundLookup.registerSoundToLookup("bolt_press");
        UniversalSoundLookup.registerSoundToLookup("bolt_slap");
        UniversalSoundLookup.registerSoundToLookup("chargehandle_back");
        UniversalSoundLookup.registerSoundToLookup("chargehandle_forward");
        UniversalSoundLookup.registerSoundToLookup("gun_foley");
        UniversalSoundLookup.registerSoundToLookup("gun_foley2");
        UniversalSoundLookup.registerSoundToLookup("gun_rest");
        UniversalSoundLookup.registerSoundToLookup("gun_turn");
        UniversalSoundLookup.registerSoundToLookup("gun_unrest");
        UniversalSoundLookup.registerSoundToLookup("mag_insert");
        UniversalSoundLookup.registerSoundToLookup("mag_smack");
        UniversalSoundLookup.registerSoundToLookup("mag_unload");
        UniversalSoundLookup.registerSoundToLookup("action_back");
        UniversalSoundLookup.registerSoundToLookup("action_release");
        UniversalSoundLookup.registerSoundToLookup("action3_back");
        UniversalSoundLookup.registerSoundToLookup("action3_forward");
        UniversalSoundLookup.registerSoundToLookup("akaction_back");
        UniversalSoundLookup.registerSoundToLookup("akaction_forward");
        UniversalSoundLookup.registerSoundToLookup("akmag_insert");
        UniversalSoundLookup.registerSoundToLookup("akmag_touchgun");
        UniversalSoundLookup.registerSoundToLookup("akmag_unload");
        UniversalSoundLookup.registerSoundToLookup("pistolmag_insert");
        UniversalSoundLookup.registerSoundToLookup("pistolmag_touchgun");
        UniversalSoundLookup.registerSoundToLookup("pistolmag_unload");
        UniversalSoundLookup.registerSoundToLookup("slide_back");
        UniversalSoundLookup.registerSoundToLookup("slide_release");
        UniversalSoundLookup.registerSoundToLookup("slide_release2");
        UniversalSoundLookup.registerSoundToLookup("mp5bolt_back");
        UniversalSoundLookup.registerSoundToLookup("mp5bolt_back2");
        UniversalSoundLookup.registerSoundToLookup("mp5bolt_release");
        UniversalSoundLookup.registerSoundToLookup("mp5bolt_smack");
        UniversalSoundLookup.registerSoundToLookup("smallmag_insert");
        UniversalSoundLookup.registerSoundToLookup("smallmag_unload");
        UniversalSoundLookup.registerSoundToLookup("attachmenton");
        UniversalSoundLookup.registerSoundToLookup("attachmentoff");
    }
}
