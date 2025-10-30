@file:Suppress("OPT_IN_USAGE")

plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

kotlin { wasmJs { } }