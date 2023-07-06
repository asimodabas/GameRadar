buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${BuildTools.gradle}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.kotlinCompilerVersion}")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.navigation}")

        // Dagger-Hilt
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Google.daggerHilt}")
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}