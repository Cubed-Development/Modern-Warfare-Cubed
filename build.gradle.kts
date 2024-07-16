import org.gradle.plugins.ide.idea.model.IdeaLanguageLevel
import org.jetbrains.gradle.ext.Gradle
import org.jetbrains.gradle.ext.runConfigurations
import org.jetbrains.gradle.ext.settings

plugins {
    id("com.gtnewhorizons.retrofuturagradle") version "1.4.0"
    id("org.jetbrains.gradle.plugin.idea-ext") version "1.1.8"
    id("com.github.gmazzo.buildconfig") version "5.3.5"
    id("io.freefair.lombok") version "8.6"
}

group = "com.paneedah"
version = "0.2-Dev-2" // Versioning must follow Ragnarök versioning convention: https://github.com/Red-Studio-Ragnarok/Commons/blob/main/Ragnar%C3%B6k%20Versioning%20Convention.md

val name = "Modern Warfare Cubed"
val id = "mwc"
val plugin = "${project.group}.${id}.asm.MWCPlugin"

val redCoreVersion = "MC-1.8-1.12-" + "0.6-Dev-3"

val groovyScriptVersion = "1.0.0"
val mixinBooterVersion = "8.6"

minecraft {
    mcVersion = "1.12.2"
    username = "Desoroxxx"
    extraRunJvmArguments = listOf("-Dforge.logging.console.level=debug", "-Dfml.coreMods.load=${plugin}", "-Dmixin.hotSwap=true", "-Dmixin.checks.mixininterfaces=true", "-Dmixin.debug.export=true")

    injectedTags.put("ID", id) // TODO: Remove Tags and use buildConfig instead when everything is merged in next
    injectedTags.put("VERSION", project.version) // TODO: Remove Tags and use buildConfig instead when everything is merged in next
}

// TODO: Remove Tags and use buildConfig instead when everything is merged in next
// Generate a my.project.Tags class with the version number as a field
tasks.injectTags.configure {
    outputClassName.set("com.paneedah.${id}.Tags")
}

repositories {
    maven {
        name = "Cleanroom"
        url = uri("https://repo.cleanroommc.com/releases")
    }

    listOf("release", "beta", "dev").forEach { repoType ->
        maven {
            name = "Red Studio - ${repoType.replaceFirstChar { it.uppercase() }}"
            url = uri("https://repo.redstudio.dev/$repoType")
        }
    }

    exclusiveContent {
        forRepository {
            maven {
                name = "Curse Maven"
                url = uri("https://cursemaven.com")
            }
        }
        filter {
            includeGroup("curse.maven")
        }
    }
}

dependencies {
    implementation("dev.redstudio", "Red-Core", redCoreVersion)


    compileOnly(rfg.deobf("curse.maven:techguns-244201:2958103"))
    compileOnly("com.cleanroommc:groovyscript:1.1.0") {
        isTransitive = false
    }

    annotationProcessor("org.ow2.asm", "asm-debug-all", "5.2")
    annotationProcessor("com.google.guava", "guava", "32.1.2-jre")
    annotationProcessor("com.google.code.gson", "gson", "2.8.9")

    val mixinBooter: String = modUtils.enableMixins("zone.rong:mixinbooter:8.6", "mixins.${id}.refmap.json") as String
    api(mixinBooter) {
        isTransitive = false
    }
    annotationProcessor(mixinBooter) {
        isTransitive = false
    }
}

// TODO: Remove Tags and use buildConfig instead when everything is merged in next
//buildConfig {
//    packageName("${project.group}.${id}")
//    className("ProjectConstants")
//    documentation.set("This class defines constants for ${name}.\n<p>\nThey are automatically updated by Gradle")
//
//    useJavaOutput()
//    buildConfigField("String", "ID", provider { """"${id}"""" })
//    buildConfigField("String", "NAME", provider { """"${name}"""" })
//    buildConfigField("String", "VERSION", provider { """"${project.version}"""" })
//    buildConfigField("org.apache.logging.log4j.Logger", "LOGGER", "org.apache.logging.log4j.LogManager.getLogger(NAME)")
//    buildConfigField("dev.redstudio.redcore.logging.RedLogger", "RED_LOGGER", """new RedLogger(NAME, "https://linkify.cz/MWCBugReport", LOGGER)""")
//}

idea {
    module {
        inheritOutputDirs = true

        excludeDirs = setOf(
            file(".github"), file(".gradle"), file(".idea"), file("build"), file("gradle"), file("run")
        )
    }

    project {
        settings {
            jdkName = "1.8"
            languageLevel = IdeaLanguageLevel("JDK_1_8")

            runConfigurations {
                create("Client", Gradle::class.java) {
                    taskNames = setOf("runClient")
                }
                create("Server", Gradle::class.java) {
                    taskNames = setOf("runServer")
                }
                create("Obfuscated Client", Gradle::class.java) {
                    taskNames = setOf("runObfClient")
                }
                create("Obfuscated Server", Gradle::class.java) {
                    taskNames = setOf("runObfServer")
                }
                create("Vanilla Client", Gradle::class.java) {
                    taskNames = setOf("runVanillaClient")
                }
                create("Vanilla Server", Gradle::class.java) {
                    taskNames = setOf("runVanillaServer")
                }
            }
        }
    }
}

// Set the toolchain version to decouple the Java we run Gradle with from the Java used to compile and run the mod
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    }
    withSourcesJar() // Generate sources jar when building and publishing
}

val at = project.files("src/main/resources/META-INF/${id}_at.cfg")

tasks.deobfuscateMergedJarToSrg.configure {
    accessTransformerFiles.from(at)
}

tasks.srgifyBinpatchedJar.configure {
    accessTransformerFiles.from(at)
}

tasks.processResources.configure {
    inputs.property("version", project.version)
    inputs.property("id", id)

    filesMatching("mcmod.info") {
        expand(mapOf("version" to project.version, "id" to id))
    }

    // TODO: Move all of that to assets and remove this
    from("src/main/java") {
        include("**/*.png")
        include("**/*.json")
        include("**/*.vsh")
        include("**/*.fsh")
    }
}

tasks.named<Jar>("jar") {
    manifest {
        attributes(
            "ModSide" to "BOTH",
            "FMLAT" to "${id}_at.cfg",
            "FMLCorePlugin" to "${plugin}",
            "FMLCorePluginContainsFMLMod" to "true",
            "ForceLoadAsMod" to "true"
        )
    }
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.isFork = true
    options.forkOptions.jvmArgs = listOf("-Xmx4G")
}
