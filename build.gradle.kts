buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri(Sdk.r8Uri)
        }
    }
    dependencies {
        // AndroidX
        classpath(Libraries.androidBuildTools)
        classpath(Libraries.androidR8Tools)
        classpath(Libraries.androidGradlePlugin)
        classpath(Libraries.androidXnavigationSafeArgs)

        // Dagger-Hilt
        classpath(Libraries.googlehiltGradlePlugin)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}