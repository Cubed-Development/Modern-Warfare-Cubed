# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project follows to [Ragnarök Versioning Convention](https://gist.github.com/JustDesoroxxx/5d4a45785ce19a6653ba99f72325c703).

## [Unreleased] Modern Warfare Cubed Version 0.1 Changelog

## Warning

**If you are upgrading from either Vic's Modern Warfare or Modern Warfare Cubed Version 0.1-Dev-6 or under all Modern Warfare related items, blocks weapons, etc... will disappear from your save either back up your world or start a new one.**

### Highlight

### Added

- Custom skins ([Create your own skins guide](https://github.com/Cubed-Development/Modern-Warfare-Cubed/wiki/Custom-Skins))
- Config options:
  - penetratesGlass
  - explosionBreak
  - penetrableBlocks
  - knockbackOnHi
  - hipFireSpread
  - ammoCounterX 
  - ammoCounterY
  - ammoCounterSize
  - ammoCounterBackgroundReverse
- Durability to all vests as a temporary measure to resolve vest-related issues
- Smelting of sulfur into gunpowder
- .50 AE in the Ammo Press
- Crafting recipes for the M1014, Supernova and tactical night vision goggles
- Crafting of grenades (excluding gas grenade) in the ammo press (Once overhauled, they will be moved on the workbench)
- Weapon system version to weapon tooltips
- Added the Workbench and the Ammo Press to the Creative Tab
- Translations for Chinese, Spanish, and Turkish languages
- GitHub URL in `mcmod.info`
- Proning in single player mode (**Note: Currently unanimated; player will appear standing**)
- Shells life got increased to 1606 with no performance impact in extreme cases

### Changed

- Overhauled textures of AAC Honey Badger, Bushmaster ACR, Beowulf, HK 417, M16A1, 100rnd 5.56x45mm NATO STANAG Drum Magazine and the pink camo skin
- Overhauled animations and sound effects of the M40A6 and Uzi
- Overhauled the texture of the Leupold Scope, EOTech Holographic A65 Sight, Aim Point Comp M5 Sight, OKP-7 Sight, Bijia Reflex Sight, RMR Sight, and Eotech Hybrid HHS™ II Sight
- Reworked the config system:
  - Old XML config has been removed, and all configs have been consolidated into a new JSON config. Issues with some non-functioning configs have been resolved
  - Adjusted craftingmappings.json to now only override recipes, rather than removing all recipes
- Temporarily nerfed all vests as a part of vest problem mitigation
- Nerfed XP gains from smelting ores
- Reloading now only stops once the gun is fully reloaded or no compatible ammunition remains in inventory
- Players in creative mode can now reload without the need for ammunition or magazine (The highest capacity magazine will be selected for weapons with multiple compatible magazines) this can be bypassed by sneaking
- Grenades in creative mode are now infinite 
- Expanded crafting to accommodate any type of planks
- Weapons are now rendered in 3D in the inventory, this means that there will be a small freeze when first opening the Creative Menu this will be improved over time as we optimize rendering
- Reduced the stack size of M202 rockets and RPG7 rockets to 4 and 2, respectively
- Increased magazine capacity of bandits on Hard difficulty
- Bullets are now able to penetrate:
  - Standing signs
  - Standing banners
  - End rods
  - Skulls
  - Flower Pots
  - Redstone Comparators
  - Redstone Repeaters
  - Cactus
  - Cake
- Bullets collision has been enhanced to work compatibly with mods
- Updated `mcmod.info` description and credits
- Migrated the config setting for bullets breaking glass into the new config file (ModernWarfareCubed.cfg)
- Forge configuration `Emissive Item Rendering` is now forced to be off (This does not influence Optifine emissive item rendering)
- OptiFine configuration `Fast Render` is now forced to be off
- Changed categories of some weapons
- Magazines are created empty
- The position of the bullet when shooting is now centered when aiming
- Explosive projectiles are now linked to the player who launched them meaning that the kill message will say who killed whom

### Fixed

- Fixed entity generation issue (now modifying the entity's health and generation rate requires restarting the game)
- Fixed Minecraft armor making you invulnerable to bullets (less realistic but they aren't anyway lol)
- Fixed issue with config for bullets breaking glass being ignored
- Fixed bullet's being able to penetrate:
  - Glass
  - Glowstone
  - Stacked wooden slabs (2 wooden slabs stacked on top of each other)
- Fixed glitched textures on Backpacks/Vests
- Fixed non-terrorist mobs spawning with guns
- Fixed the issue of mobs not naturally spawning when enabled
- Fixed several faults in en-US.lang
- Fixed crashes caused by certain shaders
- Fixed duplication issues related to copper, gunpowder, and ammo
- Fixed a problem where the carryable inventory tab was shifting the entire inventory to the left for no reasons
- Fixed turrets spawning without weapons
- Fixed 7.62x54mm SVD magazine using 7.62x39mm bullets
- Fixed 3rd person hovering weapons such as the MP7, CZ-805 Bren, and Python and Taurus revolvers
- Fixed visual bugs for weapons like FN F2000 when aiming the gun, M4A1 with "M16 Stock", Malyuk and M40A6 with grip accessories, beowulf50Cal with m38 front sight, revolver related accessories and general bipod adjustments on weapons
- Fixed the attachment of the Long Deagle
- Fixed prop hitboxes not lining up with their models:
  - Fridge (open/closed)
  - Locker
  - SCP Locker
  - Dumpster
  - Sandbag
  - Duel Floodlight

### Removed

- Removed all arcade guns (These will be moved to a sister mod at a later time)
- Removed the SA80
- Removed the mission system
- Removed most of the compatibility layer
- Removed FXAA
- Removed Bloom

### Optimization

- As a result of a BIG code cleanup MWC as a whole should now be slightly faster, load slightly faster and use slightly less resources
- Losslessly compressed assets as a result the jar size decreased (35.3MB -> 27.57MB)
- Improved ShaderLoader
- Reduced overhead due to the removal of most of the compatibility layer leading to increased performance

### Internal

- Switched to [Raven](https://github.com/eigenraven) amazing [RetroFuturaGradle](https://github.com/GTNewHorizons/RetroFuturaGradle)
- Updated to Gradle 8.1.1
- Cleaned up build.gradle & gradle.properties
- Gradle now automatically updates the version and id in `ModReference.java`
- Updated Forge version
- Improved build times
- Automatically mark some folders as excluded
- Major Refactors
- [WIP] Cleaned up the codebase
- [WIP] Renamed unintelligible variables to more readable names
- Overhauled the internal process of item and block creation
- Changed name and mod id

##### Credits

*Order based on [contributors](https://github.com/Cubed-Development/Modern-Warfare-Cubed/graphs/contributors?from=2023-02-19&to=2023-05-28&type=a)*

The whole official Modern Warfare Dev Team:
- [Desoroxxx](https://github.com/Desoroxxx)
- [Paneedah](https://github.com/Paneedah)
- [Stick](https://github.com/SticksDeveloper)
- [Azurae](https://github.com/azuraerae)
- [Koud_Wind](https://github.com/Koud-Wind)

And the people who contributed to Modern Warfare Cubed:
- [AhmedKrm](https://github.com/AhmedKrm) for Turkish translation ([#107](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/107))
- [Braiam23](https://github.com/Braiam23) for revamping textures & Spanish translation ([#100](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/100), [#110](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/110))
- [strubium](https://github.com/strubium) for adding recipes & nerfs & crafting improvements & revamping textures ([#117](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/117), [#109](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/109), [#116](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/116), [#92](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/92), [#115](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/115), [#97](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/97))
- [Skyy](https://github.com/BurnhamR) for losslessly compressing assets & major refactors ([#53](https://github.com/Paneedah/paneedah-modern-warfare/pull/53), [#55](https://github.com/Paneedah/paneedah-modern-warfare/pull/55), [#59](https://github.com/Paneedah/paneedah-modern-warfare/pull/59), [#58](https://github.com/Paneedah/paneedah-modern-warfare/pull/58))
- [notdeadpool456](https://github.com/notdeadpool456) for adding crafting recipes & nerfs ([#75](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/75), [#76](https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/76))
- [333mhz](https://github.com/333mhz) for corrections in the English translation & adding blocks to the creative tab & cleanup
