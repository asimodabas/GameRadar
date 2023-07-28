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
    implementation(project(otherModule.data))

    // AndroidX
    implementation(Libraries.androidXsecurity)
    implementation(Libraries.androidXpaging)
    implementation(Libraries.androidXroomRuntime)
    implementation(Libraries.androidXroomKtx)
    implementation(Libraries.androidXhiltWork)
    kapt(Libraries.androidXroomCompiler)
    kapt(Libraries.androidXhiltCompiler)

    // Google
    implementation(Libraries.googlematerial)
    implementation(Libraries.googlehilt)
    kapt(Libraries.googlehiltCompiler)

    // Square Up
    implementation(Libraries.squareupRetrofit)
    implementation(Libraries.squareupRetrofitConverter)

    // Glide
    implementation(Libraries.otherGlide)
}