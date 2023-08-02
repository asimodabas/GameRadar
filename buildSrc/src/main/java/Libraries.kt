object Libraries {

     const val androidXcore = "androidx.core:core-ktx:${AndroidX.core}"
     const val androidXappCompat = "androidx.appcompat:appcompat:${AndroidX.appcompat}"
     const val androidXlifecycle = "androidx.lifecycle:lifecycle-runtime-ktx:${AndroidX.lifecycleRuntime}"
     const val androidXworkRuntime = "androidx.work:work-runtime-ktx:${AndroidX.workRuntime}"
     const val androidXstartUpRuntime = "androidx.startup:startup-runtime:${AndroidX.startupRuntime}"
     const val androidXconstraintLayout = "androidx.constraintlayout:constraintlayout:${AndroidX.constraintLayout}"
     const val androidXnavigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${AndroidX.navigation}"
     const val androidXnavigation = "androidx.navigation:navigation-fragment-ktx:${AndroidX.navigation}"
     const val androidXnavigationUiKtx = "androidx.navigation:navigation-ui-ktx:${AndroidX.navigation}"
     const val androidXhiltWork = "androidx.hilt:hilt-work:${AndroidX.hiltWork}"
     const val androidXhiltCompiler = "androidx.hilt:hilt-compiler:${AndroidX.hiltWork}"
     const val androidXroomRuntime = "androidx.room:room-runtime:${AndroidX.room}"
     const val androidXroomKtx = "androidx.room:room-ktx:${AndroidX.room}"
     const val androidXroomCompiler = "androidx.room:room-compiler:${AndroidX.room}"
     const val androidXsecurity = "androidx.security:security-crypto:${AndroidX.security}"
     const val androidXpaging = "androidx.paging:paging-runtime-ktx:${AndroidX.paging}"

     const val googlehilt = "com.google.dagger:hilt-android:${Google.daggerHilt}"
     const val googlehiltCompiler = "com.google.dagger:hilt-android-compiler:${Google.daggerHilt}"
     const val googlehiltGradlePlugin= "com.google.dagger:hilt-android-gradle-plugin:${Google.daggerHilt}"
     const val googlematerial = "com.google.android.material:material:${Google.material}"

     const val squareupRetrofit = "com.squareup.retrofit2:retrofit:${Network.retrofit}"
     const val squareupRetrofitConverter = "com.squareup.retrofit2:converter-gson:${Network.retrofit}"
     const val squareupOkhttp = "com.squareup.okhttp3:okhttp:${Other.okhttp3}"
     const val squareupOkhttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Other.okhttp3}"

     const val coroutinesKotlinx = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Kotlin.coroutines}"

     const val androidTestMockk = "io.mockk:mockk:${AndroidTest.mockk}"
     const val androidTestJunit = "junit:junit:${AndroidTest.junit}"
     const val androidTestMockito = "org.mockito:mockito-core:${AndroidTest.mockito}"
     const val androidTestTruth = "com.google.truth:truth:${AndroidTest.truth}"
     const val androidTestArch = "androidx.arch.core:core-testing:${AndroidTest.arch}"
     const val androidTestCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${AndroidTest.coroutines}"

     const val otherGlide =  "com.github.bumptech.glide:glide:${Other.glide}"

     const val androidBuildTools = "com.android.tools.build:gradle:${BuildTools.gradle}"
     const val androidR8Tools = "com.android.tools:${AndroidX.r8Tools}"
     const val androidGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.kotlinCompilerVersion}"
}