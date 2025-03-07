// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.parcelize) apply false
    alias(libs.plugins.kotlin.kapt) apply false
}

allprojects {
    extra["compileSDK"] = 34
    extra["minSDK"] = 30
    extra["targetSDK"] = 34
    extra["javaVersion"] = JavaVersion.VERSION_17
    extra["kotlinJvmTarget"] = "17"
}