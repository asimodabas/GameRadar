plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.asimodabas.data"
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
    implementation(Libraries.androidXcore)
    implementation(Libraries.androidXappCompat)
    implementation(Libraries.androidXlifecycle)
    implementation(Libraries.androidXworkRuntime)
    implementation(Libraries.androidXstartUpRuntime)
    implementation(Libraries.androidXhiltWork)
    implementation(Libraries.androidXroomRuntime)
    implementation(Libraries.androidXroomKtx)
    implementation(Libraries.androidXsecurity)
    implementation(Libraries.androidXpaging)
    kapt(Libraries.androidXroomCompiler)
    kapt(Libraries.androidXhiltCompiler)

    // Google
    implementation(Libraries.googlematerial)
    implementation(Libraries.googlehilt)
    kapt(Libraries.googlehiltCompiler)

    // Square Up
    implementation(Libraries.squareupRetrofit)
    implementation(Libraries.squareupRetrofitConverter)
    implementation(Libraries.squareupOkhttp)
    implementation(Libraries.squareupOkhttpInterceptor)

    // Coroutines
    implementation(Libraries.coroutinesKotlinx)

    // Test
    testImplementation(Libraries.androidTestMockk)
    testImplementation(Libraries.androidTestJunit)
    testImplementation(Libraries.androidTestMockito)
    testImplementation(Libraries.androidTestTruth)
    testImplementation(Libraries.androidTestArch)
    testImplementation(Libraries.androidTestCoroutines)
}