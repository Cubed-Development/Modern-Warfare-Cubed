# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project follows to [Ragnarök Versioning Convention](https://gist.github.com/JustDesoroxxx/5d4a45785ce19a6653ba99f72325c703).

## [Unreleased] Modern Warfare Cubed Version 0.1 Changelog

## Warning

**If you are upgrading from either Vic's Modern Warfare or Modern Warfare Cubed Version 0.1-Dev-6 or under all Modern Warfare related item, blocks weapons etc... will disappear from your save either back up your world or start a new one.**

### Highlight

### Added

- Added GitHub url to `mcmod.info`
- The Forge config `Emissive Item Rendering` is now forced off at launch (This does not affect Optifine emissive item rendering)

### Changed

- Moved config for bullets breaking glass into the new config file (ModernWarfareCubed.cfg)
- Updated `mcmod.info` description & credits

### Fixed

- Fixed config for bullets breaking glass being ignored
- Fixed bullets being able to shoot through:
    - Glass
    - Glowstone
    - Double wooden slabs (2 wooden slabs stacked on top of each other)

### Removed

- Removed all arcade guns (Will move to a sister mod at a later time)

### Optimization

- As the result of a BIG code cleanup MWC as a whole should now be faster, load faster and use slightly less resources
- Losslessly compressed assets as a result the jar size decreased (35.3MB -> 30.2MB) ([#53], [#55], [#59])

### Internal

- Changed name and mod id
- Switched to [Anatawa] amazing [FG2.3 fork]
- Updated to Gradle 7.6
- Cleanup build.gradle & gradle.properties
- Gradle now automatically updates the version in `ModReference.java`
- Updated Forge version
- Improved build times
- Automatically mark some folders as excluded
- Major Refactors ([#58])
- [WIP]Cleanup the entire code
- [WIP] Renamed most of the variables from unreadable names to readable names

##### Credits

[Anatawa]: https://github.com/anatawa12
[FG2.3 fork]: https://github.com/anatawa12/ForgeGradle-2.3
[#53]: https://github.com/Paneedah/paneedah-modern-warfare/pull/53
[#55]: https://github.com/Paneedah/paneedah-modern-warfare/pull/55
[#59]: https://github.com/Paneedah/paneedah-modern-warfare/pull/59
[#58]: https://github.com/Paneedah/paneedah-modern-warfare/pull/58



