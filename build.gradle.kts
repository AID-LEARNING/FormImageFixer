plugins {
    java
    id("com.gradleup.shadow") version "8.3.0"
}

group = "dev.senseitarzan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven {
        name = "PowerNukkitX Releases"
        url = uri("https://repo.powernukkitx.org/releases")
    }
    maven {
        name = "PowerNukkitX Snapshots"
        url = uri("https://repo.powernukkitx.org/snapshots")
    }
    maven {
        name = "OpenCollab Releases"
        url = uri("https://repo.opencollab.dev/maven-releases/")
    }
    maven {
        name = "OpenCollab Snapshots"
        url = uri("https://repo.opencollab.dev/maven-snapshots/")
    }
    maven {
        name = "OpenCollab Main"
        url = uri("https://repo.opencollab.dev/main/")
    }
}

dependencies {
    // Notice the dot instead of brackets/hyphen
    compileOnly(libs.powernukkitx.server)


    compileOnly("org.projectlombok:lombok:1.18.48")
    annotationProcessor("org.projectlombok:lombok:1.18.48")

    testCompileOnly("org.projectlombok:lombok:1.18.48")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.48")

    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    sourceCompatibility = "21"
    targetCompatibility = "21"
}

tasks {
    build {
        dependsOn(shadowJar)
    }
}

// Ajoute ce bloc dans ton build.gradle.kts
tasks.processResources {
    // Définir les propriétés à injecter
    val props = mapOf("version" to project.version.toString())

    // Indiquer à Gradle de recompiler si ces propriétés changent
    inputs.properties(props)

    // Cibler uniquement le fichier plugin.yml pour éviter de corrompre d'autres fichiers
    filesMatching("plugin.yml") {
        expand(props)
    }
}

tasks.test {
    useJUnitPlatform()
}