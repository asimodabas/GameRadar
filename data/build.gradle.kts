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
    implementation(project(":domain"))

    // AndroidX
    implementation("androidx.core:core-ktx:${AndroidX.core}")
    implementation("androidx.appcompat:appcompat:${AndroidX.appcompat}")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:${AndroidX.lifecycleRuntime}")
    implementation("androidx.work:work-runtime-ktx:${AndroidX.workRuntime}")
    implementation("androidx.startup:startup-runtime:${AndroidX.startupRuntime}")
    implementation("androidx.hilt:hilt-work:${AndroidX.hiltWork}")
    implementation("androidx.room:room-runtime:${AndroidX.room}")
    implementation("androidx.security:security-crypto:${AndroidX.security}")
    implementation("androidx.paging:paging-runtime-ktx:${AndroidX.paging}")
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

    //OkHttp
    implementation("com.squareup.okhttp3:okhttp:${Other.okhttp3}")
    implementation("com.squareup.okhttp3:logging-interceptor:${Other.okhttp3}")

    testImplementation("io.mockk:mockk:${Test.mockk}")
    testImplementation("junit:junit:${Test.junit}")
    testImplementation("org.mockito:mockito-core:${Test.mockito}")
    testImplementation("com.google.truth:truth:${Test.truth}")
    testImplementation("androidx.arch.core:core-testing:${Test.arch}")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:${Test.coroutines}")
}