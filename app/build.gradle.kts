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

    // AndroidX
    implementation("androidx.core:core-ktx:${AndroidX.core}")
    implementation("androidx.appcompat:appcompat:${AndroidX.appcompat}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${AndroidX.lifecycleRuntime}")
    implementation("androidx.work:work-runtime-ktx:${AndroidX.workRuntime}")
    implementation("androidx.startup:startup-runtime:${AndroidX.startupRuntime}")
    implementation("androidx.hilt:hilt-work:${AndroidX.hiltWork}")
    implementation("androidx.constraintlayout:constraintlayout:${AndroidX.constraintLayout}")
    implementation("androidx.navigation:navigation-fragment-ktx:${AndroidX.navigation}")
    implementation("androidx.navigation:navigation-ui-ktx:${AndroidX.navigation}")
    implementation("androidx.room:room-runtime:${AndroidX.room}")
    implementation("androidx.room:room-ktx:${AndroidX.room}")
    kapt("androidx.room:room-compiler:${AndroidX.room}")
    kapt("androidx.hilt:hilt-compiler:${AndroidX.hiltWork}")

    // Google
    implementation("com.google.android.material:material:${Google.material}")
    implementation("com.google.dagger:hilt-android:${Google.daggerHilt}")
    kapt("com.google.dagger:hilt-android-compiler:${Google.daggerHilt}")

    // Square Up
    implementation("com.squareup.retrofit2:retrofit:${Network.retrofit}")
    implementation("com.squareup.retrofit2:converter-gson:${Network.retrofit}")

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:${Kotlin.coroutines}")

    // Glide
    implementation("com.github.bumptech.glide:glide:${Other.glide}")

    // Http
    implementation("com.squareup.okhttp3:okhttp:${Other.okhttp3}")
    implementation("com.squareup.okhttp3:logging-interceptor:${Other.okhttp3}")
}