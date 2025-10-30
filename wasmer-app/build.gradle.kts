plugins {
    alias(libs.plugins.jvm)
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application { mainClass = "org.wasmer.kotlin.AppKt" }

dependencies {
    testImplementation(kotlin("test"))
    implementation(fileTree("libs") { include("*.jar") })
}