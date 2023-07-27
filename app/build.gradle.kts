plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.asimodabas.trendyol_interview"
    compileSdk = Sdk.compileSdk

    defaultConfig {
        applicationId = Sdk.applicationId
        minSdk = Sdk.minSdk
        targetSdk = Sdk.targetSdk
        versionCode = Sdk.versionCode
        versionName = Sdk.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = Jvm.target }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(project(otherModule.presentation))

    // AndroidX
    implementation(Libraries.androidXcore)
    implementation(Libraries.androidXappCompat)
    implementation(Libraries.androidXlifecycle)
    implementation(Libraries.androidXworkRuntime)
    implementation(Libraries.androidXstartUpRuntime)
    implementation(Libraries.androidXconstraintLayout)
    implementation(Libraries.androidXnavigation)
    implementation(Libraries.androidXnavigationUiKtx)
    implementation(Libraries.androidXhiltWork)

    // Google
    implementation(Libraries.googlehilt)
    kapt(Libraries.googlehiltCompiler)
}