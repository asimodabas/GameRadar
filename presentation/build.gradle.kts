plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-parcelize")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.asimodabas.presentation"
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
    implementation(project(otherModule.domain))

    // AndroidX
    implementation(Libraries.androidXcore)
    implementation(Libraries.androidXappCompat)
    implementation(Libraries.androidXlifecycle)
    implementation(Libraries.androidXworkRuntime)
    implementation(Libraries.androidXstartUpRuntime)
    implementation(Libraries.androidXhiltWork)
    implementation(Libraries.androidXconstraintLayout)
    implementation(Libraries.androidXnavigation)
    implementation(Libraries.androidXnavigationUiKtx)
    implementation(Libraries.androidXsecurity)
    implementation(Libraries.androidXpaging)
    kapt(Libraries.androidXhiltCompiler)

    // Google
    implementation(Libraries.googlehilt)
    kapt(Libraries.googlehiltCompiler)

    // Glide
    implementation(Libraries.otherGlide)

    // Test
    testImplementation(Libraries.androidTestMockk)
    testImplementation(Libraries.androidTestJunit)
    testImplementation(Libraries.androidTestMockito)
    testImplementation(Libraries.androidTestTruth)
    testImplementation(Libraries.androidTestArch)
    testImplementation(Libraries.androidTestCoroutines)
}