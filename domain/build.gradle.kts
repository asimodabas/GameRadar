plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.asimodabas.domain"
    compileSdk = Sdk.compileSdk

    defaultConfig {
        minSdk = Sdk.minSdk
        targetSdk = Sdk.targetSdk

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
    implementation("androidx.security:security-crypto:${AndroidX.security}")
    implementation("androidx.paging:paging-runtime-ktx:${AndroidX.paging}")
    implementation("androidx.room:room-runtime:${AndroidX.room}")
    implementation("androidx.room:room-ktx:${AndroidX.room}")
    kapt("androidx.room:room-compiler:${AndroidX.room}")
    implementation("androidx.hilt:hilt-work:${AndroidX.hiltWork}")
    kapt("androidx.hilt:hilt-compiler:${AndroidX.hiltWork}")

    // Google
    implementation("com.google.android.material:material:${Google.material}")
    implementation("com.google.dagger:hilt-android:${Google.daggerHilt}")
    kapt("com.google.dagger:hilt-android-compiler:${Google.daggerHilt}")

    // Square Up
    implementation("com.squareup.retrofit2:retrofit:${Network.retrofit}")
    implementation("com.squareup.retrofit2:converter-gson:${Network.retrofit}")

    // Glide
    implementation("com.github.bumptech.glide:glide:${Other.glide}")
}