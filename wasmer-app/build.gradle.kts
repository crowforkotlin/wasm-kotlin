plugins {
    alias(libs.plugins.jvm)
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application { mainClass = "org.example.AppKt" }

dependencies {
    testImplementation(kotlin("test"))
}