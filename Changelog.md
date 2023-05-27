# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project follows to [Ragnarök Versioning Convention](https://gist.github.com/JustDesoroxxx/5d4a45785ce19a6653ba99f72325c703).

## [Unreleased] Modern Warfare Cubed Version 0.1 Changelog

## Warning

**If you are upgrading from either Vic's Modern Warfare or Modern Warfare Cubed Version 0.1-Dev-6 or under all Modern Warfare related item, blocks weapons etc... will disappear from your save either back up your world or start a new one.**

### Highlight

### Added

- Added crafting recipes for the M1014 and the Supernova ([#75])
- Sulfur can now be smelted into gunpowder
- .50 AE is now in the Ammo Press
- Added GitHub url to `mcmod.info`
- The Forge config `Emissive Item Rendering` is now forced off at launch (This does not affect Optifine emissive item rendering)

### Changed

- Reloading will not stop until the gun is fully reloaded or there is no more compatible ammunition in the inventory
- Nerfed all vests, this is a temporary solution to vests being broken they will be overhauled at a later date ([#76])
- Reduced the stack size of M202 rockets and RPG7 rockets to 4 and 2 respectively
- Re-worked config system
  - Removed the old XML config and merged all configs into the new JSON config.
  - They have also been fixed as some weren't working.
- Re-worked craftingmappings.json to now only override recipies. It'll no longer remove all recipies when you use it.
- Moved config for bullets breaking glass into the new config file (ModernWarfareCubed.cfg)
- Updated `mcmod.info` description & credits
- Bullets collisions now works with mods
- Bullets can now go through
  - Standing signs
  - Standing banners
  - End rods
  - Skulls
  - Flower Pots
  - Redstone Comparators
  - Redstone Repeaters
  - Cactus
  - Cake

### Fixed

- Fixed config for bullets breaking glass being ignored
- Fixed bullets being able to shoot through:
    - Glass
    - Glowstone
    - Double wooden slabs (2 wooden slabs stacked on top of each other)
- Fixed Backpacks/Vests from having glitched textures
- Fixed Workbench/Ammo Press to the Creative Tab (Blocks)
- Fixed blur2.fsh
- Fixed mobs other than terrorist spawning with guns
- Fixed mobs not naturally spawning when enabled
- Fixed some fault in en-US.lang
- Fixed some shaders causing crashes ([#48])
- Fixed copper, gunpowder and ammo dupe
- Fixed the carryable inventory tab moving the whole inventory to the left for no reasons

### Removed

- Removed all arcade guns (Will move to a sister mod at a later time)
- Removed the mission system
- [WIP] Removed a significant part of the compatibility layer
- Removed FXAA
- Removed Bloom

### Optimization

- As the result of a BIG code cleanup MWC as a whole should now be faster, load faster and use slightly less resources
- Losslessly compressed assets as a result the jar size decreased (35.3MB -> 27.57MB) ([#53], [#55], [#59])
- Improved ShaderLoader
- Reduced overhead due to the removal of a part of the compatibility layer leading to increased performance

### Internal

- Changed name and mod id
- Switched to [Raven] amazing [RetroFuturaGradle]
- Updated to Gradle 8.1.1
- Cleanup build.gradle & gradle.properties
- Gradle now automatically updates the version in `ModReference.java`
- Updated Forge version
- Improved build times
- Automatically mark some folders as excluded
- Major Refactors ([#58])
- [WIP] Cleanup the entire code
- [WIP] Renamed most of the variables from unreadable names to readable names
- Reworked how items and blocks are created internally ([#26], [#23])

##### Credits

[Raven]: https://github.com/eigenraven
[RetroFuturaGradle]: https://github.com/GTNewHorizons/RetroFuturaGradle
[#75]: https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/75
[#76]: https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/76
[#48]: https://github.com/Cubed-Development/Modern-Warfare-Cubed/issues/48
[#53]: https://github.com/Paneedah/paneedah-modern-warfare/pull/53
[#55]: https://github.com/Paneedah/paneedah-modern-warfare/pull/55
[#59]: https://github.com/Paneedah/paneedah-modern-warfare/pull/59
[#58]: https://github.com/Paneedah/paneedah-modern-warfare/pull/58
[#26]: https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/26
[#23]: https://github.com/Cubed-Development/Modern-Warfare-Cubed/pull/23
