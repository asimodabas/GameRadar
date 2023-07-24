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
    implementation(project(":presentation"))

    // AndroidX
    implementation("androidx.core:core-ktx:${AndroidX.core}")
    implementation("androidx.appcompat:appcompat:${AndroidX.appcompat}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${AndroidX.lifecycleRuntime}")
    implementation("androidx.work:work-runtime-ktx:${AndroidX.workRuntime}")
    implementation("androidx.startup:startup-runtime:${AndroidX.startupRuntime}")
    implementation("androidx.constraintlayout:constraintlayout:${AndroidX.constraintLayout}")
    implementation("androidx.navigation:navigation-fragment-ktx:${AndroidX.navigation}")
    implementation("androidx.navigation:navigation-ui-ktx:${AndroidX.navigation}")
    implementation("androidx.hilt:hilt-work:${AndroidX.hiltWork}")

    // Google
    implementation("com.google.dagger:hilt-android:${Google.daggerHilt}")
    kapt("com.google.dagger:hilt-android-compiler:${Google.daggerHilt}")
}